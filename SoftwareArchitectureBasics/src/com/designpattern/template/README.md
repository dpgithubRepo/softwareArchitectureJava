Template Pattern falls under the behavioural pattern.
----------------------------------------------------

Defines the skeleton of an algorithm in a method, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm 
without changing the algorithms structure.


This pattern can be used when we have several defined steps to achieve a task but the implementation of the steps may vary.In such case Template Design pattern can be 
used to define the template method in the abstract parent class and deferring the implementation of  few/all of  the steps to the steps to the child classes.

say for example let us consider a financial Debt issuance life cycle which can be thought of 

1. Debt Issuance creation
2. Debt Issuance Trading
3. Debt Issuance Maturity

so to complete a life cycle of Issuance all the above mentioned life cycle methods must be completed. so an abstract class will be created with all the 3 methods
and the template method will have all the 3 methods : refer the ProductDebtIssuance class

matureIssuance() method in ProductDebtIssuance has default implementation and if required can be overridden in the implementation class and this method is called the HOOK method.


--> This pattern provides flexibility in implementing the methods specific to child class if needed

--> Using Hook methods in the abstract class code re-usability is achieved

--> Steps required for a particular task is predefined and helps in easy implementation and modular methods in the implementation classes.






