package rmi_echo;

import assignment.SignPage;
import java.util.Scanner;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.*;


public class EchoClient {
    
    static int ok;
    
    public static void main(String argv[]) {        
	String registryHost = "localhost";        
	int registryPort;        
	String remoteObjRef = "EchoService";                
	
	System.out.println("Input port number on which rmiregistry was started.");        
	Scanner input = new Scanner(System.in);        
	registryPort= input.nextInt();                        
	String registryName="rmi://" + registryHost +":" + registryPort + "/" + remoteObjRef;        
	System.out.println("Client: Looking up " + registryName + " ...");    
        Echo RemEcho = null;       
          try {          
	Registry registry = LocateRegistry.getRegistry(registryPort);            
	RemEcho = (Echo)registry.lookup(registryName);       // look up the remote object from reg
          } catch (Exception e) {        
              System.out.println("Client: Exception thrown looking up " + registryName);        
              System.exit(1);        }        

          SignPage sp = new SignPage();
          sp.setVisible(true);
          sp.setLocationRelativeTo(null);
          
          for (;;)        {
	String strMsg= input.nextLine();          
	if (ok==1) break;                
	try {    	// invoke the remote method!
	      String modifiedMsg = RemEcho.EchoMessage(strMsg); 	  
                          System.out.println("From Server: "+ modifiedMsg);          
	}    catch (Exception e) {    
            System.out.println("Client: Exception thrown calling EchoMessage().");    
            System.exit(1);            
            }        
        }        
    }
    
    public static void setOk(int k){
        ok = k;
    }
    
}

