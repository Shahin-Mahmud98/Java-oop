// /**
//  * Array
//  */
// public class Array {
//     public static void main(String[] args) {
//         int [] number = new int[5];

//         number [0] = 13;
//         number [1] = 14;
//         number [2] = 15;
//         number [3] =17;
//         number [4] =19;
//        // number [5] =21;

//         int sum = number [0]+ number[1];
//        int len = number.length;

//        System.out.println(sum);

//        // int len = number.length();
//         System.out.println("Array Size is = " + len);

//     }
// }

//finding sum and array average from user input

import java.util.Scanner;

/**
 * Array
 */
public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double [] number = new double[5];
        double sum = 0;

System.out.println("Please Enter the  number : ");

        //For loop use kore sum and average ber kora
        for (int i = 0; i < number.length; i++) {
            number[i]= scan.nextDouble();
            
        }
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
            
        }
        


        System.out.println("The sum is = "+sum);

        // number[0]= scan.nextDouble();
        // number[1]= scan.nextDouble();
        // number[2]= scan.nextDouble();
        // number[3]= scan.nextDouble();
        // number[4]= scan.nextDouble();

        // sum = number[0]+number[1]+number[2]+number[3]+number[4];
        
        double avg = sum /5;
        System.out.println("The Avg is "+avg);

        //for maximum and minimum value 

        double max = number[0];
        double min = number [0];

        for (int i = 0; i < 5; i++) {
            if (max<number[i]){
                max = number[i];
            }
            if (min>number[i]){
                min = number[i];
            }
        }

        System.out.println("The max number is "+max);
        System.out.println("The min number is "+min);
    }
}
