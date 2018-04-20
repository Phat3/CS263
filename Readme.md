#  Runtime system project

This repos keeps track of all the ideas, examples and cahllenges that we will encounter
during this project.

## Progresses

Recap of the progresses week by week.

## Week 1
As the first step of our project we deployed the whole angr infrastructure with the
Java support and we wrote a quick tutorial on how to do it.

Then we wrote a simple Java application (you can find the surce code in /example/simple)
to test which SOOT instructions and which SimProcedure are already implemented by angr.

During this experiment we find out that;

- **SimSootExpr_StaticFieldRef** is not implemented in angr and therefore is not correctly emulated
- Only **3 SimProcedures** are actually implemmented in angr (**read**, **write** and **exit**)