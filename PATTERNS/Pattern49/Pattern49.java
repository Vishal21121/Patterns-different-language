public class Pattern49
{
public static boolean isPrimeNumber(int num) {
   int c=0;
   for (int i = 1; i <= num; i++) {
      if (num % i == 0)
         c++;
   }
   if (c==2)
      return true;
   else
      return false;
}
public static void main(String args[])
    {
        int counter = 2,k=4,j;    
         for (int i = 1; i <= 5; i++) {
         for(j=1;j<=k;j++)
         System.out.print(" ");
         for (j = 1; j <= i; j++) {
        while(!isPrimeNumber(counter)){
            counter++;
            }
        System.out.print(counter+" ");
        counter++;
      }
      k--;
      System.out.println();
   }

}
}