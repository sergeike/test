package be.lombaer.test;

/**
 * Created by sergelombaerts on 20/10/15.
 */
public class Message {
    String message;

    public Message(String message) {

        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Message message1 = (Message) o;

        return message.equals(message1.message);

    }

    @Override
    public int hashCode() {
        return message.hashCode();
    }
}
