interface Fruit{
    public void apple();
}
interface Banana
{
    public void orange();
}
 public class inter2 implements Banana,Fruit
 {
     public void apple()
     {
         System.out.println("Fruit implemented");
     }
     public void orange()
     {
         System.out.println("Banana implemented");
     }
     public static void main(String []args)
     {
         Fruit frt=new inter2();
         frt.apple();
         ((inter2) frt).orange();
     }
}
