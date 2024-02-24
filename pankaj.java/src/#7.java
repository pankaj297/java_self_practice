
 /*
 import java.util.Scanner;
class pankaj07{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");

        String str = sc.next();
        System.out.println("hello "+ str + " have a good day!");
    }
}*/
//2}km convert centimeter , miter, millimeter.
import java.util.Scanner;
class pankaj07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the km ");

        double km = sc.nextDouble();
        double centimeter = km * 1000.0;
        System.out.println("Distance in centimeter = " + centimeter);
        double miter = km * 100000.0;
        System.out.println("Distance in miter = " + miter);
        double millimeter = km * 1000000.0;
        System.out.println("Distance in millimeter = " + millimeter);
    }
}