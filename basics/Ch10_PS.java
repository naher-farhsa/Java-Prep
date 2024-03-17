import java.math.*;
import java.util.*;
import java.lang.*;
public class Ch10_PS {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t,x,y,c1=0,c2=0,m;
        String s;
        t=sc.nextInt();
        while(t-->0){
            x=sc.nextInt();
            y=sc.nextInt();
            s=sc.nextLine();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='1')
                    c1++;
            }
            for(int i=0;i<s.length();i++){
                m=0;
                if(s.charAt(i)=='1' && s.charAt(i+1)=='1'){
                    m++;
                    if(c2<m)
                        c2=m;
                }
            }
            System.out.println(c1*x + c2*y);
        }
            }
        }
     /*   int t=sc.nextInt();
        while(t-->0){
            BigInteger fact=new BigInteger("1");
            int n=sc.nextInt();
            if(n==0||n==1)  {
                System.out.println(1);
            }
            else{
                int i=1;
                while (i<=n){
                    fact=fact.multiply(BigInteger.valueOf(i));
                    i++;
                }
                System.out.println(fact);*/





































