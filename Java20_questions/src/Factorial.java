//Factorial program

class Factorial{
    public static void main(String[] args) {

        int a = 4, fact = 1;

        for(int i = 1; i <= a; i++){
//            fact = fact * i;
             fact *= i;
        }

        System.out.println("The factorial is  "+ a + " = " + fact);

    }
}

