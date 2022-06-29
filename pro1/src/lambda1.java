/**
 *
 */
interface movie{
    void watch();
}
 class lambda {

    public static void amin(String []args)
    {
        int a=23;
        movie obj = new movie()
        {
            public void watch()
            {
                System.out.println("latest movies"+ a);
            }

        };
        obj.watch();


    }

}
