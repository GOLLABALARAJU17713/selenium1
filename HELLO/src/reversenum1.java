public class reversenum1 {
    public static void main(String []args)
    {
        int num=123, rev=0;
        System.out.println("input number is  " +num);
        for(;num!=0;)
        {
            int n=num%10; // here WE taking last number
            rev=rev*10+n; // here we adding last number to the output
             num=num/10;  // here we removing last number from the number.
        }
        System.out.println( "Reverse number is  "+rev);
    }
}
