//Rock , Paper , Scissor
import java.util.Scanner;
import java.util.Random;
class pankaj20_1{
    public static void main(String []args){
        //1 Rock
        //2 Paper
        //3 Scissor
        System.out.println("Enter the 1 for Rock , 2 for Paper , 3 for Scissor");

        Scanner sc = new Scanner (System.in);
        int UserInput = sc.nextInt();

        Random rc = new Random();
        int ComputerInput = rc.nextInt(4);

        //UserInput
        if(UserInput == 1 ){
            System.out.println("Your Choice 1 : Rock");
        }else if(UserInput == 2){
            System.out.println("Your Choice 2 : Paper");
        }else if(UserInput == 3){
            System.out.println("Your Choice 3 : Scissor");
        }

        //Results
        if(UserInput == ComputerInput){
            System.out.println("Drown");
        }else if(UserInput == 1 && ComputerInput == 3  || UserInput == 2 && ComputerInput == 1
                || UserInput == 3 && ComputerInput == 2){
            System.out.println("You are Wine!");
        }else{
            System.out.println("Computer Wine");
        }

        //Computer Input
        if(ComputerInput == 1){
            System.out.println("Computer Choice 1 : Rock");
        }else if (ComputerInput == 2){
            System.out.println("Computer Choice 2 : Paper");
        }else if (ComputerInput == 3){
            System.out.println("Computer Choice 3 : Scissor");
        }

    }
}