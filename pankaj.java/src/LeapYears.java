class LeapYears{
    public static void main(String[] args) {
        int Years = 2024;

        if(Years % 4 == 0){
            if(Years % 100 == 0){
                if(Years % 400 == 0){
                    System.out.println("This is a leap year");
                }else {
                    System.out.println("This is not leap year");
                }
            }else {
                System.out.println("Thsi is a leap year");
            }
        }else {
            System.out.println("This is not a leap year");
        }
    }
}