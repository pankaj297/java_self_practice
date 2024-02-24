// if-if else Statement
 import java.util.Scanner;
class pankaj18{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the 12th percentage");
        int par = sc.nextInt();

        if(par<30){
            System.out.println("Fail");
        }else if(par<=30){
            System.out.println("Grade C");
        }else if(par<=45){
            System.out.println("Grade C+");
        }else if(par<=60){
            System.out.println("Grade B");
        }else if(par<=75){
            System.out.println("Grade B+");
        }else if(par<=90) {
            System.out.println("Grade A");
        }else if(par<=100){
            System.out.println("Grade A+");
        }else{
            System.out.println("Not Found");
        }
    }
}