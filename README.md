A blockchain based book sharing platform
Aim
•	A standalone application which will provide end to end solution for book sharing
•	For taking a book user will need some points which he can get from either from giving his book or validating some ongoing transaction of the book
•	No one will have control of the system and it will never shut down 

Challenges
•	For any such book sharing platform a central authority will be needed to manage the books shared among people, which will be hard to manage as people are listing and sharing the books among themselves and transaction will be easy to tamper with and can cause dispute. 
•	With centralise system possible shutdown of service
•	There is no mechanism for people to deal in only books without dealing in money 	 

Solution
•	Transaction
A decentralized system where a ledger(record) of the dealings distributed over the public network, anyone can add a dealing in ledger and sign it digitally with the cryptographic function using their private key and details of dealing (time, book-name, id of both users).
 A transaction is validated only if it is digitally signed and contains dealing less than the transaction limit of user.
This ledger will be distributed to all the nodes in the network and everyone will maintain their own copy of ledger. 
The ledger which has most computational proof of work will be accepted among all. We will organise a ledger into blocks where each block contain list of transaction with proof of work and hash of the previous block. 
For finding the proof of work for a block user will be awarded with some reward. In case of two conflicting blockchain, longer one will be considered valid. All the coins will come from block reward   
•	Database
A relational database to store the users list of books, current owner, book condition, location and value in points
A view of the data will be accessible to all
Anyone can add a book in database with their public key

•	User Interface
A user interface designed with the help of Java Spring
Login: user can login with his id(public key) and password (private key)
Search: books present in the database 
Add: books in the database
Send/Receive: books for the points
Validate: transactions for which he will be rewarded points

Benefits
•	User can deal only in books
•	No one has control over the system and no possible shut down of the service
•	There will be no intermediatory thus cost-effective
•	Network will expand to a limited area the distance in which trading can be done
•	Any dispute will be handled computationally


Tools / Technologies Used:
•	Java: popular for blockchain development, robust and have extensive framework API and libraries 
(a)	Spring: for making standalone application
•	MySQL: for storing and managing book list
•	Blockchain: for decentralised system
•	Cryptography: for security purposes
•	Git & Github: Project management

