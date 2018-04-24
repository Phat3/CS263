#!/usr/bin/env python
import logging
import angr

logging.getLogger("angr.engines.soot.engine").setLevel("DEBUG")
logging.getLogger("angr.factory").setLevel("DEBUG")
logging.getLogger("angr.cle").setLevel("DEBUG")
logging.getLogger("angr.procedures.java").setLevel("DEBUG")

JAR_PATH = "./out/artifacts/java_string_simple_jar/java_string_simple.jar"

def dump_bock_info(block):
    try:
        print "\n------------------------------------\n"
        print block.addr
        print
        print block.soot
        print "\n------------------------------------\n"
    except Exception as e:
        print "\n------------------------------------\n"
        print block.addr
        print
        print "EXCEPTION!!"
        print
        print e
        print "\n------------------------------------\n"

def main():
    proj = angr.Project(JAR_PATH)
    simgr = proj.factory.simgr()

    while simgr.active:
        block = proj.factory.block(simgr.active[0].ip)
        dump_bock_info(block)
        # import ipdb; ipdb.set_trace()
        simgr.step()

if __name__ == "__main__":
    main()