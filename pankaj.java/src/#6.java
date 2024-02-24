 //Exercise 1, 5 subject marks %
import java.util.Scanner;
class pankaj06{
    public static void main (String [] args){
        System.out.println("Enter the 5 subject marks");
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the first subject marks");
        double sub1 = sc.nextDouble();

        System.out.println("Enter the second subject marks");
        double sub2 = sc.nextDouble();

        System.out.println("Enter the third subject marks");
        double sub3 = sc.nextDouble();

        System.out.println("Enter the fourth subject marks");
        double sub4 = sc.nextDouble();

        System.out.println("Enter the fifth subject marks");
        double sub5 = sc.nextDouble();

        double sum = sub1 + sub2 + sub3 + sub4 + sub5;
        double ave = sum / 5;
        double par = (double) sum / 500 * 100;

        System.out.println("Total sum = "+ sum);
        System.out.println("Average = " + ave);
        System.out.println("percentage = "+ par +"%");
    }
}

// Exercise-1 , 5 subject marks in percentage

class MarksPercentage{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the 5 Subject marks");

        System.out.println("Enter the first subject marks");
        double subject1 = sc.nextDouble();

        System.out.println("Enter the second subject marks");
        double subject2 = sc.nextDouble();

        System.out.println("Enter the third subject marks");
        double subject3 = sc.nextDouble();

        System.out.println("Enter the fourth subject marks");
        double subject4 = sc.nextDouble();

        System.out.println("Enter the five subject marks");
        double subject5 = sc.nextDouble();

        double sum2 = subject1 + subject2 + subject3 + subject4 +  subject5;
        double ave2 = sum2 / 5;
        double par2 = sum2 / 500 * 100;

        System.out.println("Total sum of 5 subject marks = "+ sum2);
        System.out.println("Average Percentage of 5 subject marks = "+ ave2 + "%" );
        System.out.println("Percentage of 5 subject marks = "+ par2 + "%");

    }
}

























