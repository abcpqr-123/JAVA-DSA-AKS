

//Note: if u want to check if a number is odd or even,
        // then u have see the last bit of that number.
        // if the last bit of that number is 0 then its aeven number.
        // if the last bit of that number is 1 then its odd number.

import java.util.Scanner;

 class BitManipulation {
    
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter the number: ");

          int a = sc.nextInt();

        if ( a % 2 == 0){
            System.out.println("Even number.");
        }else{
            System.out.println("odd number.");
        }
    }
}



//-------------         ---------           ------------



// Masking:


// note: when ever u want to check if a number is odd or even,
//       you have to make that number &, with 1

//       if u get 0 by doing & then that number is even number.
//       if u get 1 by doing & than that number is odd number.



import java.util.Scanner;

      class BitManipulations {
    
        public static void main(String[]args){
           Scanner sc = new Scanner(System.in);
           
           System.out.println("Enter the number: ");
    
              int a = sc.nextInt();
    
            if ( a & 1 == 0){
                System.out.println("Even number.");
            }else{
                System.out.println("odd number.");
            }
        }
    }
    