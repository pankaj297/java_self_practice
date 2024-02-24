//Leap years program

class LeapYears{
    public static void main(String[] args) {
        int Y = 2022;

        if(Y % 4 == 0){
            if(Y % 100 == 0){
                if(Y % 400 == 0){
                    System.out.println("This is a leap year! ");
                }else {
                    System.out.println("This is not leap year! ");
                }
            }else {
                System.out.println("This is a leap year!");
            }
        }else {
            System.out.println("This is not leap year! ");
        }
    }
}