package rmi_echo;

import java.util.Scanner;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;


public class EchoServer {
         public static void main(String argv[]) {
	String registryHost = "localhost";                 // rmiregistry host machine       
	int registryPort;               	                     // rmiregistry running port         
	String remoteObjRef = "EchoService";     // remote object reference                

	Scanner input = new Scanner(System.in);       
	System.out.println("Input port number on which to start rmiregistry.” + “Port number must be between 1024 - 65,535.");       
	registryPort= input.nextInt();           // read in the rmiregistry port number
        
        try {     
	System.out.println("Server: Registering Echo Service");                        
	
	// create a rmi registry programmatically rather than using command line 
	LocateRegistry.createRegistry(registryPort);            
	Registry registry = LocateRegistry.getRegistry(registryPort);           
	EchoImpl remote = new EchoImpl();            
	
	// remote object registration with rmi registry created.
	registry.rebind("rmi://" + registryHost +":" + registryPort + "/" 
		            + remoteObjRef, remote);            	 
	System.out.println("Server: Ready...");    
          }      catch (Exception e) {   
		System.out.println("Server: Failed to register Echo Service: " + e);   
          } 
     }
}

