package be.lombaer.test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Message hello = new Message("hello world");

        System.out.println( hello.getMessage());

        Message bye = new Message("bye bye world");

        System.out.println( bye.getMessage());

    }
}
