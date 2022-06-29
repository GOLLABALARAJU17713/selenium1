package Hello;
import java.io.*;
public class pro32 {
    public static void main(String []args)
    {
        char [] array =new char[50];
        try{
            FileInputStream obj= new FileInputStream("D://empty,txt");
            InputStreamReader obj1=new InputStreamReader(obj);
            obj1.read(array);
            System.out.println(array);
            obj1.close();

        }
        catch (Exception e)
        {
            e.getStackTrace();
        }
    }
}
