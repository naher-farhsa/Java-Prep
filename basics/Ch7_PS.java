public class Ch7_PS {
   // 1. method to print multiplication table
   static void table(int x){
       int mul;
       for(int i=1;i<=10;i++){
        mul =x*i;
       System.out.println(x+" * "+i+" = "+mul);
       }
   }
   // 2. & 4.method to print pattern using iteration
   static void pattern_i(int n){
       for(int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
             System.out.print("$ ");
           }
           System.out.println("");
       }
       System.out.println("===============");
       for(int a=1;a<=n;a++){
           for(int b=n;b>=a;b--){
               System.out.print("$ ");
           }
           System.out.println("");
       }
   }

   //3. recursive method to print sum of first n natural no.
        static int natsum_r(int n){
        int sum=0;
        if (n>0)
         sum = n+natsum_r(n-1);
         return sum;
       }
   //5. method to print Nth term of a fibonacci series using recursion
        static int n_fib(int n){
        if(n==1||n==2)
           return  n-1;
        else
           return n_fib(n-2) + n_fib(n-1);
       }
   //6. method to print average of given set of no.
        static float average(int ...arg){
        float avg , count=0 , sum=0;
        for(int element:arg){
           sum=sum+element;
           count++;
       }
         System.out.println("total terms is : "+count);
          avg=sum/count;
          return  avg;
     }
   //7.repeat 4. using recursion & 8. repeat 2. using recursion
       static void pattern_r1(int n) {
           if (n > 0) {
               pattern_r1(n - 1);
               for (int i = 1; i <= n; i++) {
                   System.out.print("# ");
               }
               System.out.println("");
           }
      }
       static void pattern_r2(int n){
           if (n > 0) {
               pattern_r2(n - 1);
               for (int i = 8; i >= n; i--) {
                   System.out.print("# ");
               }
               System.out.println();
           }
       }
          //9. method to convert celsius temp to fahrenheit
           static float celTOfar ( float cel){
               float far = 9 / 5f * cel + 32;
               return far;
           }
           //10.repeat 3. using iterative approach
           static int natsum_i ( int n){
               int sum = 0;
               for (int i = 1; i <= n; i++)
                   sum = sum + i;
               return sum;

           }
           public static void main (String[]arg){
               table(8);
               pattern_i(8);
               System.out.println("the sum of first N natural no. using recursion : " + natsum_r(4));
               System.out.println("Nth term of a fibonacci series : " + n_fib(7));
               System.out.println("average of given set of no. : " + average(0, 1, 2, 3, 4, 5));
               pattern_r1(8);
               System.out.println("===============");
               pattern_r2(8);
               System.out.println("celsius temp in fahrenheit : " + celTOfar(1.0f));
               System.out.println("the sum of first N natural no. using iteration : " + natsum_i(5));

           }

}