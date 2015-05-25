package clazz;

import enumerator.TypeMessageEnum;

import java.io.Serializable;

public class Message implements Serializable {

    private String sender;
    private String receiver;
    private String textMessage;
    private TypeMessageEnum typeMessageEnum;

    public TypeMessageEnum getTypeMessageEnum() {
        return typeMessageEnum;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getTextMessage() {
        return textMessage;
    }

    public Message(String sender, String receiver, String textMessage, TypeMessageEnum typeMessageEnum) {
        String msg = "";
        this.sender = sender;
        this.receiver = receiver;
        this.typeMessageEnum = typeMessageEnum;

        switch (this.typeMessageEnum) {
            case LOGIN:
                msg = "(" + sender + ") inside.";
                break;
            case LOGOUT:
                msg = "(" + sender + ") wrote.";
                break;
            case PUBLIC:
                msg = "(" + sender + ") wrote: " + textMessage;
                break;
            case PRIVATE:
                msg = "(" + sender + ") for (" + receiver + ") wrote: " + textMessage;
                break;
        }
        this.textMessage = msg;
    }

    @Override
    public String toString() {
        return "Message{" +
                "sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", textMessage='" + textMessage + '\'' +
                ", typeMessageEnum=" + typeMessageEnum +
                '}';
    }
}
