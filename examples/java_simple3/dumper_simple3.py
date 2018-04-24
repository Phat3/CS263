#!/usr/bin/env python
import logging
import angr

logging.getLogger("angr.engines.soot.engine").setLevel("DEBUG")
logging.getLogger("angr.factory").setLevel("DEBUG")
logging.getLogger("angr.cle").setLevel("DEBUG")

JAR_PATH = "./simple3.jar"

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
        simgr.step()

if __name__ == "__main__":
    main()