#  Runtime system project

This repos keeps track of all the ideas, examples and challenges that we will encounter
during this project.

## Progresses

Recap of the progresses week by week.


### Week 1
As the first step of our project we deployed the whole angr infrastructure with the
Java support and we wrote a quick tutorial on how to do it.

Then we wrote a simple Java application (you can find the surce code in /example/simple)
to test which SOOT instructions and which SimProcedure are already implemented by angr.

During this experiment we find out that;

- **SimSootExpr_StaticFieldRef** is not implemented in angr and therefore is not correctly emulated
- Only **3 SimProcedures** are actually implemmented in angr (**read**, **write** and **exit**)


### Week 2
Implemented the simple java application that uses String.equals() function. 
Implemented the corresponding simProcedure in angr that returns the constraints of the String.equal() function. In order to do this, we had to plug in the string solver and modify the internal option of Angr.
Fixed \<SimState\>.block() if the arch is soot, so now the basic blocks are lifted correctly.


### Weeek 3
During the execution of some program, we figured out that the support for Java in angr is lack of fundamental funcitonalities that needs to be implemented in order to perform a meaningful analysis of the program. 

These functionalities are:
- Array cannot be used and analyzed. 
- Command line arguments are not recognized. 
- Function calls are not supported. 
- Objects are not supported 


### Week 4
Implemented the functionalities that weren't supoorted from last week except for the object.
Started to implement the demo for the class (fauxware), but we figured that the static fields inside of classes are not supported yet. 
Implemented the simple simProcedure for scanner.nextLine() in order to read from standard input. 


### Week 5
Implemented the support for static fields in java classess.
The static field reference with default values are initiallized during the time when the classes are loaded using the method \<clinit\>. During the normal execution of the program, this method is never executed, so we decided to force its execution at the first time the class is called.  

Implemented the simple java application that uses String.concat() function. 
Implemented the corresponding simProcedure in angr that returns the constraints of the String.concat() function.
Found a bug in command line arguements handling. 

## TODO

- [x] Fix call \<SimState\>.block() if the arch is soot
- [x] Implement support java.lang.String in angr
- [x] Implement Simprocedure java.lang.String.equals
- [x] Implement Simprocedure java.lang.String.concat
- [x] Implement Simprocedure java.util.scanner.nextLine
- [x] Implement the array support in angr
- [x] Implement the command line arguments in angr
- [x] Implement the function calls with parameters passed in 
- [x] Implement the objects support in angr
- [x] Implement the support for static fields in java classes
- [x] Fix the command line arguments handling bug in angr

 
## Angr deployment tutorial 
1. Install python packages **virtualenv** and **virtualenvwrapper**.
1. Clone [angr-dev](https://github.com/angr/angr-dev).
2. Install angr with the instructions provided by angr-dev. 
2. Remove the following directories inside of angr-dev **"angr"**, **"claripy"** becuase we will replace with our own implementations.
3. Clone our [forked version of angr](https://github.com/VIPSIYI/angr) to angr-dev.
5. Clone our [forked version of claripy](https://github.com/Lukas-Dresel/claripy) to angr-dev. 
6. Install [pysmt](https://github.com/pysmt/pysmt). We need it to parse and dump smt lib scripts.
	``` pip install pysmt ```
7. Clone [pysoot](https://github.com/Phat3/pysoot) to angr-dev. 
8. Install pysoot.
	``` pip install -e .```
9. Switch to branch **feat/soot** in **angr**
10. Switch to branch **feat/strings** in **claripy**

## Running example
1. Browse to the directory examples/java_fauxwawre_string
2. Run the script test_java_string_fauxware.py

This script will explore all possible states of the java program fauxware and it will collect all teh constraints.





