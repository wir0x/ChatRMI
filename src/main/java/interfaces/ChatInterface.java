package interfaces;

import clazz.Message;
import enumerator.TypeMessageEnum;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ChatInterface extends Remote {

    void sendMessage(String sender, String receiver, String textMessage, TypeMessageEnum typeMessageEnum) throws RemoteException;

    void registrarObserver(ClientInterface clientInterface) throws RemoteException;

    void removeClient(String nameClient) throws RemoteException;

    void removerObserver(ClientInterface clientInterface) throws RemoteException;

    void notifyObserver() throws RemoteException;

    List<Message> getMessages() throws RemoteException;

    List<ClientInterface> getClients() throws RemoteException;

    List<String> getListNamesClients() throws RemoteException;

    String registerClient(String nameClient) throws RemoteException;
}
