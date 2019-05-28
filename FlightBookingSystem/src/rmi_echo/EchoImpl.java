package rmi_echo;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.io.*;


public class EchoImpl extends UnicastRemoteObject implements Echo {   
     public EchoImpl() throws RemoteException { super(); };   
     
     public String EchoMessage(String Msg) throws RemoteException {
	String capitalizedMsg;                
	
	System.out.println("Server: EchoMessage() invoked...");        	
        System.out.println("Server: Message > " + Msg);        
	capitalizedMsg = Msg.toUpperCase();        // convert message into capital
	return(capitalizedMsg);   // return the capitalized message back to the client
     }
}
