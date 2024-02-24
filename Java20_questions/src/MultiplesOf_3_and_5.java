//Multiples of 3 and 5

class MultiplesOf_3_and_5 {
    public static void main(String[] args) {
        int num = 0;
        for(int i = 1; i <= 11; i++){
            if(i % 3 == 0 || i % 5 == 0){
                num += i;
            }
        }
        System.out.println("Thi Multiples of 3 and 5 is = "+ num);
    }
}