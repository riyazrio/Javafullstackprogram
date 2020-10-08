package scan.scanning;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Scanner scan=new Scanner(System.in);
       String packName="";short packValue=0;
       long cusID=0L;int duration=0;
       
       System.out.println("tell us package name:");
       packName=scan.nextLine();
       System.out.println("tell us customer id:");
       cusID=scan.nextLong();
       System.out.println("Tell us pack value:");
       packValue=scan.nextShort();
       System.out.println("tell us pack duration:");
       duration=scan.nextInt();
       
       System.out.println("congrats your package"+packName+"for the customer id"+cusID+"has recharged with"+packValue+"for days of"+duration);
    }
}
