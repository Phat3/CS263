#!/usr/bin/env python
import logging
import angr

# logging.getLogger("angr.engines.soot.engine").setLevel("DEBUG")
# logging.getLogger("angr.factory").setLevel("DEBUG")
# logging.getLogger("angr.cle").setLevel("DEBUG")
# logging.getLogger("angr.procedures.java").setLevel("DEBUG")

JAR_PATH = "./out/artifacts/examples_jar/examples.jar"

def dump_block_info(block):
    print "------> Addr: %r\n" % block.addr
    try:
        print block.soot
    except Exception as e:
        pass


def dump_stash_info(stash_name, stash_content):
    print "---> Stash: %s" % stash_name
    for state in stash_content:
        print "\n**********************************"
        print "------> Constraints: %r\n" % state.se.constraints
        dump_block_info(state.block())
    print "**********************************"


def dump_stashes_info(simgr):
    print "\n------------ STEP -----------------------------------------------"
    for stash_name, stash_content in simgr.stashes.iteritems():
        if stash_content:
            dump_stash_info(stash_name, stash_content)
    print "-----------------------------------------------------------------"
    return simgr


def main():
    proj = angr.Project(JAR_PATH)
    state = proj.factory.entry_state(add_options={angr.options.STRINGS_ANALYSIS})
    simgr = proj.factory.simgr(state)
    dump_stashes_info(simgr)
    simgr.run(step_func=dump_stashes_info)

if __name__ == "__main__":
    main()
