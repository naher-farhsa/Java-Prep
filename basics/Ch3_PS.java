import  java.util.*;
public class Ch3_PS {
    public static void main(String[] arg) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter the String no1 : ");
        String str1=sc.nextLine();
        //1. Convert String in lowercase and UPPERCASE
        System.out.println("your String in lowercase : "+str1.toLowerCase());
        System.out.println("your String in uppercase : "+str1.toUpperCase());

        // 2. replace ' ' with '_'
        System.out.println(" replacing spaces with _ : "+str1.replace(' ','_'));

        //3. replace name with some name
        System.out.print("enter the string no2: ");
        String str2=sc.nextLine();
        String letter="Dear name,Thanks a lot ";
        System.out.println(letter.replace("name",str2));

        //4. to detect index double and triple spaces
        System.out.print("enter the string no3 : ");
        String str3=sc.nextLine();
        System.out.println(" index of double space : "+str3.indexOf("  "));
        System.out.println(" index of triple space : "+str3.indexOf("   "));

        //5. find length of String position of character and vice versa
        System.out.print("enter the String no4 : ");
        String str4=sc.nextLine();
        System.out.println("length of String no4: "+str4.length());
        System.out.println("position of a in String no4: "+str4.indexOf('a'));
        System.out.println("character at position 4 in String no4: "+str4.charAt(4));

        //6. format the given String using escape sequence
        String letter2="Respected sir,\n\t This is a NOTICE.\n Regards";
        System.out.println(letter2);
   }
}
