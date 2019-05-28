package rmi_echo;

import java.rmi.*;

public interface Echo extends Remote {
    String EchoMessage(String strMsg) throws RemoteException;
}
