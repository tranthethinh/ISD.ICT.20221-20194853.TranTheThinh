# OUTLINE FOR "PLACE ORDER"
## Description
* A customer choose to place an order after having choosing items into the cart. The customer has to request to place an order, and perform order payment before the goods are delivered
## Actor
* Customers
# Steps
1. Order placement
2. Order payment
3. Order approval
4. Deliver
## Flow of events
### Basic Flow
1. Order placement
* Customer views the cart first
* After having viewed the cart, customer can choose to place the order
* AIMS software checks and notifies if the number of items in the inventory is enough for order
* Customer updates the cart according to current quantity states of items if needed
* After updates, customer requests to place order again
2. Order payment
* Customer updates delivery information and delivery instruction
* AIMS software validdates customer's input
### Alternative flow
* Customer chooses to place rush order
    * AIMS software checks if the items are available for rush order
    * AIMS software combines the items that can be rushed 
    * AIMS software schedules time for rush order