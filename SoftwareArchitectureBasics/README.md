# software Architecture Design Principles - Java

This repo will contain code & documentation related to the following topics. 

1.SOLID Principle
    
    S -> Single Responsibilty Principle
    O -> Open Closed Principle
    L -> Liskov Substitution Prinicple
    I -> Interface Segregation Principle
    D -> Dependency Inversion Principle

2.Design Patterns

    -> Behavioral Patterns
    -> Creational Patterns
    -> Structural Patterns
    
    

SOLID :



Single Responsibility Principle : 

This principle states that there should be only one reason to modify the class. if there is
more than one reason to change the class then there exists a chance of modulerizing the code further.At a high level this 
principle enforces that a class should have single responsibility. A properly designed system should be highly cohesive and low
coupled



Open Closed Principle :

This principle states that the design must be in such a way that application must be open for enhancements/extension and closed for 
modification.This enforces that to add a new feature the change to the existing code must be nil or as minimal as possible.
This helps in reducing the regression issues due to addition of the ne features to the application.


Liskov Substitution Prinicple :

This principle states that derived types must be completly substitutable for their base types. if S is a subtype of T, 
then objects of type T may be replaced with objects of type S without altering any of the desirable properties of the program.
Code that adheres to this principle will be loosely dependent and will be re-usable


Interface Segregation Principle:

This principle states that no client should be forced to depend on methods it does not use. This enforces of breaking the large 
interface to smaller and more specific ones only which the client should know.



Dependency Inversion Principle:

This principle states that high level modules should not depend on the low level modules directly. if there is direct dependency
then the change in low level modules will need the massive change of the high level modules. This principle states that high level
moules should not directly depend on low level modules but should depend on abstractions. Abstraction should not depend on detais but 
details should depned on abstraction.



This repo contains the code which demonstrates different design patterns and how they help achieve the SOLID principle.
