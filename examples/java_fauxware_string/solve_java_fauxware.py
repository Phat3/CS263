#!/usr/bin/env python

import angr
import claripy

JAR_PATH = "./out/artifacts/java_fauxware_string_jar/java_fauxware_string.jar"

def main():
    proj = angr.Project(JAR_PATH)
    arg = claripy.StringS("arg", 99)
    state = proj.factory.entry_state(
        add_options={angr.options.STRINGS_ANALYSIS},
        args=[arg])
    simgr = proj.factory.simgr(state)
    simgr.run()
    import ipdb; ipdb.set_trace()




if __name__ == "__main__":
    main()