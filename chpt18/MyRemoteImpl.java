import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    
    public String sayHello() {
        return "Server says, 'Hey'";
    }
    
    public MyRemoteImpl() throws RemoteException {}
    
    public static void main(String[] args) {
        try {
            MyRemoteImpl service = new MyRemoteImpl();
            Naming.rebind("Remote-Hello", service);
        } catch (Exception ex) {ex.printStackTrace();}
    }
}
