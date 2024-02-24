
//Q6 Write a function to find average of a set numbers passed as argument?
class Ch7_Q6_Ps_AverageNumbers {
    static int ave(int a, int b) {
        return (a + b) / 2;
    }

    static int ave(int a, int b, int c, int d) {
        return (a + b + c + d) / 4;
    }

    public static void main(String[] args) {
        System.out.println("The numbers averages ");
        System.out.println("the average of 239 and 567 is = " + ave(239, 567));
        System.out.println("the average of 239 , 700 , 880 and 567 is = " + ave(239, 700, 880, 567));
    }
}