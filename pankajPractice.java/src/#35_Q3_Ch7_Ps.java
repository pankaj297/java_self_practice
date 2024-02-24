
//Q3 Write a recursive function to calculate sum of first n natural numbers
class Ch7_Q3_Ps_NaturalNumber{
    static int sumRec(int n){
        if(n == 1){
            return 1;
        }
        return n + sumRec(n-1);
    }
    public static void main(String [] args){
        int c = sumRec(12);
        System.out.println(c);
    }
}