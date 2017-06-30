# The Expression Problem

## What is The Expression Problem

This is a classic problem with language design.
First described by John Reynolds in 1975.
In its current form, described by Phil Wadler in 1998.

Goal: define a data type by cases, where

- One can add new cases to the data type
- Add new functions over the data type
- Without recompiling existing code
- With static type safety (i.e., no casts)

## The outline of the talk

I first present the problem in Object-Oriented Programming Languages, then in
Functional Programming Languages. Then I present two completely different
approaches to solve it. Others exist, but I chose not to survey all the
existing ones maybe because of time?

In the course of the talk, I also present a failed an OO solution,
which turns OO languages behave like FP languages. Visitor design pattern
I am talking to you.

## My pet example

My pet example for this talk would be having a simple AST with two nodes
(lit, and plus), with one functionality to stringify the AST. Then to test
its extensibility, I will try to extend it with an evaluator (which adds a new
function), and with an AST for multiplication (adds a new subtype or case of
the type)
