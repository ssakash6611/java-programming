public class mylab9
{
      public static void main(String[]args)
      {
        int[]a={7,13,2,10,6};
            int large=a[0];
            int small=a[0];
             int location=0;
            for(int i=1;i<a.length;i++)
             
            {
                 if(a[i]>large)
                 {
                     large=a[i];
                     location=i;
                 }
            }
            System.out.println("largest number" + large + "was found at"+ location);
             
            for(int i=1;i<a.length;i++)
             
            {
                 if(a[i]<small)
                 {
                     small=a[i];
                     location=i;
                 }
            }
            System.out.println("smallest number" + small + "was found at"+ location);
      }
}