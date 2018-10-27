

Strategy Pattern :

    --> This falls under the behavioral pattern. 


    --> Defines a set of encapsulated algorithms that can be swapped to carry out a specific behaviour
    
    
    --> In our example let us consider we need to implement the pricing (behaviour)
    
    --> Let us consider we have three pricing algorithms 
    
           1. Penetration Pricing
           2. Economy Pricing
           3. Premium Pricing etc
           
           
    --> Strategy pattern allows to select the algorithm during run time. So  it enables the client to select or swap the pricing algorithm in our case during run time
    
    
    --> Also say if there is new Pricing algorithm introduced in future the change to the existing code must be minimal as per Open-Closed principle.
    
    
    --> let us discuss the implementation details of strategy pattern.
    
     1. Create the interface called PricingStrategy which has method price() 
     
     2. Now let us have the implementation classes of the pricing Strategy. Let us create three strategy classes. The price method implementation in this classes will be based on the
        corresponding algos.
         a. PenetrationPricingStrategy
         b. EconomyPricingStrategy
         c. PremiumPricingStrategy 
         
    3. Create the context class PricingContext which holds the PricingStrategy and client will communicate with object of this class which decides the strategy during runtime   
    
    4. App.java is the client class 
    
    
    
    if you thoroughly supervise this pattern it helps to achieve Open-closed principle. This class enables to add a new pricing Strategy with out altering the existing code.
    The new strategy class must implement PricingStrategy.java and this algorithm can be used at runtime by the client   
    