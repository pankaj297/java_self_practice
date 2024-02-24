//Problem 1
//Write a java method to Print Multiplication Table of a number n.
class Ch7_Q1_Ps_Multiplication_Table{
    static void multiplication(int n){
        for(int i = 1; i<=10; i++){
            System.out.format("%d X %d = %d\n",n,i,n*i);
        }
    }
    static void numbers(int n){
        for(int i =1; i<=10; i++){
            System.out.println(i+i);
        }
    }
    public static void main(String [] args){
        multiplication(99);
        numbers(0);

        int k = 5;
        for(int j = 1; j<=10; j++){
            System.out.println(k*j);
        }

    }
}