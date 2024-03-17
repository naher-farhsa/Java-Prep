import javax.swing.*;
import java.util.*;
public class Ch6_PS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1. create an array of 5 elements in float and sum its elements
        float[] arr1 = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
        float sum = 0.0f;
        for (int i = 0; i < arr1.length; i++) {
            sum = sum + arr1[i];
        }
        System.out.println("sum of elements of array : " + sum);

        //2.check whether the element is present or not
        int[] arr2 = {1, 2, 3, 4, 5};
        int num = 78;
        boolean present = false;
        for (int element : arr2) {
            if (num == element) {
                present = true;
                break;
            }
        }
        if (present)
            System.out.println("no. " + num + " is present in the array");
        else
            System.out.println("no. " + num + " is not present in the array");

        //3.calculate avg marks in physics for 10 students
        int[] marks = {90,87,89,93,78,88,89,90,80,83};
        float avg; int Sum=0;
        for(int element:marks){
            Sum=Sum+element;
        } avg=Sum/10.0f;
        System.out.println("average of physics marks of ten students : "+avg);

        //4.add 2 matrix
        int [][]matrix1={{1,2,3},
                         {4,5,6}};
        int [][]matrix2={{4,5,6},
                         {1,2,3}};

        int [][]addmatrix={{0,0,0},
                            {0,0,0}};

        for (int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[i].length;j++){
               addmatrix[i][j]=matrix1[i][j]+matrix2[i][j];
                System.out.print(addmatrix[i][j]+" ");
            }
                 System.out.println("");
        }
        //5. reverse the array
          String []str={"a","b","c","d","e"};
          int l= str.length; String temp;
          int n=Math.floorDiv(l,2);
          for(int i=0;i<n;i++){
              temp=str[i];         //here SWAPPING is done
              str[i]=str[l-1-i];
              str[l-1-i]=temp;
          }
          for(String element:str){
              System.out.print(element + " ");
          }
          System.out.println("");

        //6. to find maximum element in the array | 7. to find minimum element of the array
            int []arr3={12,56,67,23,5,94,78,450,9,23};
            double a=Math.pow(-2,31); int max=(int)a;
            double b=Math.pow(2,31)-1;int min=(int)b;
            for(int element:arr3) {
                if (max < element)
                    max = element;
            }
            for (int element:arr3){
                if(min>element)
                    min=element;
            }
            System.out.println("the maximum element in the array is : "+max);
            System.out.println("the minimum element in the array is : "+min);

        //8.to check whether the array is sorted or not
           int []arr4={1,2,5,6,8};  boolean sorted=true;
             for (int i=0;i<arr4.length-1;i++){
                 if (arr4[i]>arr4[i+1])
                     sorted=false;
             }
                   System.out.println( "Is the array sorted in ascending order ?");
                   System.out.println( sorted);


    }

}



