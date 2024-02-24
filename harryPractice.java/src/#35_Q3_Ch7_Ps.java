
//Q3 Write a recursive function to calculate sum of first n natural numbers
class Ch7_Q3_Ps_NaturalNumberSum{
    static int sumRce(int n){
        if(n == 1){
            return 1;
        }
        return n + sumRce(n-1);
    }
    public static void main(String [] args){
        int c = sumRce(7);
        System.out.println(c);
    }
}