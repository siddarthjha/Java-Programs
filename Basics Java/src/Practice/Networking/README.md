# Java Socket Programming

### Creating Server:
* To create the server application, we need to create the instance of ServerSocket class.
* Here, we are using 6666 port number for the communication between the client and server. 
* You may also choose any other port number. The accept() method waits for the client. 
* If clients connects with the given port number, it returns an instance of Socket.

### Creating Client:
* To create the client application, we need to create the instance of Socket class. 
* Here, we need to pass the IP address or hostname of the Server and a port number. 
* Here, we are using "localhost" because our server is running on same system.

To execute the program open two command prompts and execute each program at each command prompt 
