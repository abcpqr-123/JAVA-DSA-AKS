package BitManipulation;

public class bitManipulation {
   
   
   BINARY NUMBERS:
   
//----------------------------------------------------------

   
    Decimal Number: 

    274 --> 2*10^2 + 7*10^1 + 4*10^0
          = 200 +  70 + 4
          = 274
    

    Binary Number:

    101 --> 1*2^2 + 0*2^1 + 1*2^0
          = 4 + 0 + 1
          = 5

//---------------------------------------------------------------------

          How to write a number in binary:



          2 | 14 | 0
          2 |  7 | 1
          2 |  3 | 1
               1

        the answer will be 1110







        fast wat to write in binary:


          let that number be 13
          

          check weather 13 is even number or odd Number.

          since 13 is odd number, add --> 1.

          13/2 = 6.5
          and 6.5 will be considered as 6.

          6 is an even number hence we will add 0 --> 01

          6/2 = 3. 3 is a  odd number hence add 1 --> 101

          3/2 = 1.5. 1 is also a odd number hence add 1 --> 1101



//-------------------------------------------------------------------


 addition:      note: in binary 1 + 1 = 10  and 1 + 1 + 1 = 11
                      so, in case of 1 + 1 -> 0 will be wriiten bellow 
                      and 1 will be written above
1  1  1
  1 0 1
+ 1 1 1 
1 1 0 0 





//-----------------------------------------------------------



    1 1 0 0   -->  12 + (-5)
  -   1 0 1


  2's compliment:

  step 1 - Inverse all bits  -> 1 0 1 --> 0 1 0 

  step 2 - Add one  --> 0 1 0
                     +      1
                     =  0 1 1



    now,       1 1 0 0   -->  12 + (-5)
            -    0 1 1
        

        =>      now,     0 0 0 0 0 0 1 1 0 0   -->  12 + (-5)
                        -1 1 1 1 1 1 1 0 1 1
                        =0 0 0 0 0 0 0(1 1 1)   --> 7  





//---------------------------------------------------------




9 - 3 = 6 


9 --> 1 0 0 1

3  --> 1 1 
We need to find the 2's compliment of 3 

      3 --> step 1: Inverting:   0 0 0 0 0 1 1
                  will become:   1 1 1 1 1 0 0 

            step 2: Add one:   1 1 1 1 1 0 0 
                             +             1
                             = 1 1 1 1 1 0 1
   

    NOW: 9 - 3
       ->  1 0 0 1
         - 1 1 0 1
=   0 0 0  0 1 1 0  --> 1 1 0 = 6





  





//------------------------------------------------------------------------

      BITWISE OPERATORS

//------------------------------------------------------------------------

      BITWISE OPERATORS

//------------------------------------------------------------------------

     
     & |  ^

     & --> WHEN BOTH ARE ONE IT WILL BE ONE 
     | --> WHEN BOTH ARE ZERO IT WILL BE ZERO
     ^ --> WHEN BOTH ARE DIFFERENT IT WILL BE ONE
    
     a   b        &      |   ^
     0   0        0      0   0
     0   1        0      1   1
     1   0        0      1   1
     1   1        1      1   0




//------------------------------------------------------------------------

       inverse operator - ~

         5   --->  0000101
        ~5   --->  1111010

//--------------------------------------------------------------------------


       Right shift:            12>>2  // right shift 12, 2 times  
                            1100 >> 0011 (0011 --> 3)
                              

       Left shift:             12<<2   
                          1100   <<  110000 (110000 --> 48)

// ------------------          --------------       ----------------


whenever someone says right shift 5, that means devide 5 by 2
we will get 5 -> 1 0 1
            2 -> 0 1 0
            1 -> 0 0 1
            0 -> 0 0 0 


    SO, When ever u want to do 5/2, (DEVIDE)
    you can also write 5 >> 1;

  istead of writig 3*2
  you can also write 3 << 1;
    When ever u want to do 3*2, (MULTIPLY)
     you can also write 3 << 1;
      
     3 --> 1 1
     6 --> 1 1 0
     12 -> 1 1 0 0




        




      
    



}
