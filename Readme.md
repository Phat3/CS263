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

#### TODO next week 
We plan to implement a simple java application that deals with the some simple string functions and try to implement the
support for this functions inside of angr.

## Angr deployment tutorial 
1. Install python packages **virtualenv** and **virtualenvwrapper**.
1. Clone [angr-dev](https://github.com/angr/angr-dev).
2. Install angr with the instructions provided by angr-dev. 
2. Remove the following directories inside of angr-dev **"angr"**, **"cle"**, **"claripy"** becuase we will replace with our own implementations.
3. Clone our [forked version of angr](https://github.com/VIPSIYI/angr) to angr-dev.
4. Clone our [forked version of cle](https://github.com/VIPSIYI/cle) to angr-dev.
5. Clone our [forked version of claripy](https://github.com/Lukas-Dresel/claripy) to angr-dev. 
6. Install [pysmt](https://github.com/pysmt/pysmt). We need it to parse and dump smt lib scripts.
	``` pip install git+https://github.com/pysmt/pysmt ```
7. Clone [pysoot](https://github.com/Phat3/pysoot) to angr-dev. 
8. Install pysoot.
	``` pip install -e .```
9. Switch to branch **feat/soot** in **angr**