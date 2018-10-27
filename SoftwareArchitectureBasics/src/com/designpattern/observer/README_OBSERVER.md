

Observer Pattern :


 --> Define one to many dependency. if state of one object changes all of its dependencies are notified automatically
 
 --> This helps to achieve loose coupling between the Objects
 
 --> The elements/objects are subject and observers. when the state of the subject is changed the observers are notified
 
 --> To add a new observer there is no need to change the subject code
 
 --> Refer the code for demonstration of this pattern
 
 
 Let us Consider that Subject is SensexIndexNotifier  and let us have 3 Observers (say FinanceAdvisor, MarketAdvisor, SensexTrendAlerter  )
 
 Subject   is SensexIndexNotifier
 
 Observers are FinanceAdvisor, MarketAdvisor, SensexIndexAlerter  
 
 let us simulate some mock sensex index randomly for 20 times and on odd sensex index let us notify the observers
 
 
 Subject(SensexIndexNotifier) will have the operations to support
 
 1. Adding the observer
 2. Removing the observer
 3. Notifying the Observers
 
 Subject maintains a datastructure to maintain the list of observers.
 
 
 Observers(FinanceAdvisor, MarketAdvisor, SensexTrendAlerter ) will have single method to get the updated index
 
 1.update
 
 Refer the code for interfaces and design details