interface bike
{
    void duke();
}

public class inter3 implements bike
{
    public void duke()
    {
        System.out.println("impemented");
    }
}

 class Vehicle
{
    public static void main(String []args)
    {
        bike obj=new inter3();
        obj.duke();
    }
}
