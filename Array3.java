//normal way for each loop
// public class Array3 {
//     public static void main(String[] args) {
//         String [] names  = new String[4];

//         names [0]= "Md Shahin";
//         names [1]= "Md Shahin";
//         names [2]= "Md Shahin";
//         names [3]= "Md Shahin";

//         for (int i = 0; i < names.length; i++) {
//             System.out.println(names[i]);
//         }
//     }
// }

//2nd way for each loop

// public class Array3 {
//     public static void main(String[] args) {
//         String [] names  = {"Anis","Suparna","Pinky","Shahed"};
        
//         for (String x : names) {
//             System.out.println(x);
//         }
//     }
// }


//For Each loop number print


public class Array3 {
    public static void main(String[] args) {
        int [] num  = {10,20,30,40,50,60,70,80,90,100};
        int sum = 0;
        for (int x : num) {
            sum = sum+x;
            
        }
        System.out.println(sum);
    }
}