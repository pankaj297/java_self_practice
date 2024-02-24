//#8 Types of operator in java
// 1 Arithmetic Operator in java
class pankaj08{
    public static void main(String [] args){
        System.out.println("Arithmetic Operator ");
        int a = 12;
        int b = 10;

        int A1 = a + b;
        int A2 = a - b;
        int A3 = a / b;
        int A4 = a * b;
        int A5 = a++;
        int A6 = a--;
        System.out.println(A1);
        System.out.println("Assignment Operator ");
        int c = 12;
        c += 13;
        System.out.println(c);
        System.out.println("Comparison Operator");

        System.out.println(12 == 10);
        System.out.println(12 <= 10);
        System.out.println(12 >= 10);

        System.out.println("Logical Operator ");
         //both Statement are true so is it ture
        System.out.println(12>10 && 12>10);
        System.out.println(12<10 && 12>10);
        //one Statement are true so it true
        System.out.println(12>10 || 12>10);
        System.out.println(12>10 || 12<10);

    }
}