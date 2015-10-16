package be.lombaer.test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Pojo aPojo = new Pojo();
        aPojo.setaString("Hello World");
        System.out.println( aPojo.getaString() );
    }
}
