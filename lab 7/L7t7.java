import java.util.Scanner;
public class L7t7
{
    public static void main(String [] args)
    {
        Scanner J=new Scanner(System.in);
        int learge=0;
        int a[]= new int[5];
        for(int i=0;i<a.length;i++)
        {  System.out.println("give me a number");
            a[i]=J.nextInt();
        }

        for(int c=0;c<a.length;c++)
        {
          if(a[c]>learge)
          {
            learge=a[c];
       
          }
        }
        System.out.println(learge);
    }
}