abstract class language {
    abstract void c();
    void ab()
    {
        System.out.println("i'm ab");
    }
 }
 class abstr1 extends language{
    void c()
        {
          System.out.println("i'm abs1");
        }
   }
 class abs2 extends language {
     void c() {
         System.out.println("abs2");
     }


    public static void main(String []args)
    {
        language obj4=new abs2();
        obj4.c();
        obj4.ab();


    }
}