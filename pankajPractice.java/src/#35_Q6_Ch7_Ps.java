
//Q6 Write a function to find average of a set of numbers passed as arguments?
class Ch7_Q6_Ps_FunctionAverageNumbers{
    static int ave(int a , int b){
        return (a + b )/ 2;
    }
    static int ave(int a , int b, int c){
        return (a + b + c )/ 3;
    }
    static int ave(int a , int b, int c, int d){
        return (a + b + c + d) / 4;
        }
    public static void main(String [] args){
       System.out.println("Average of number");
       System.out.println("the average of 50 and 80 is = "+ ave(50,80));
       System.out.println("the average of 90 , 110 and 130 is = "+ ave(90,110,130));
       System.out.println("the average of 90 , 110 and 130 and 150 is = "+ ave(90,110,130,150));
    }

}