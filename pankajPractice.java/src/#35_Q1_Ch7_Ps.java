import java.sql.SQLOutput;

//Problem 1
//Write a java method to Print Multiplication Table of a number n ?
class Ch7_Ps_Q1_Multiplication_Table{
     static void multiplication(int n){
         for(int i =1; i<= 10; i++){
             System.out.format("%d X %d = %d\n", n , i , n*i);
         }
     }
    public static void main(String [] args){
        System.out.println("1 Multiplication Table");
        multiplication(1);
        System.out.println("2 Multiplication Table ");
        multiplication(2);
        System.out.println("3 Multiplication Table");
        multiplication(3);
        System.out.println("4 Multiplication Table");
        multiplication(4);
        System.out.println("5 Multiplication Table");
        multiplication(5);
        System.out.println("6 multiplication Table");
        multiplication(6);
        System.out.println("100 multiplication Table");
        multiplication(100);
    }
}