package interfaces;

import clazz.Message;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ChatController extends Remote {
    void updateMessages(Message message) throws RemoteException;

    void updateClients(List<String> client) throws RemoteException;
}
