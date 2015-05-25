package interfaces;

import clazz.Message;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ClientInterface extends Remote {

    void setNome(String nome) throws RemoteException;

    void setChatGUI(ChatController chat) throws RemoteException;

    void update(ChatInterface chat) throws RemoteException;

    List<Message> getMessages() throws RemoteException;

    String getNome() throws RemoteException;

}
