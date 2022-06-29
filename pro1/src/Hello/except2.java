package Hello;
import java.io.*;
public class except2 {
    public static void main(String []args)

    {
        try{

        FileOutputStream obj1= new FileOutputStream("D://empty.txt");
        String s= "welcome to home";
        byte b[]=s.getBytes();

        obj1.write(b);
        obj1.write(56);
        obj1.close();
        System.out.println("Byte");
    }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
