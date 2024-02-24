
//Q5 Write a function to print nth term of fibonacci series using recursion?
class Ch7_Q5_Ps_fibonacciSeriesUsingRecursion{
    /* static int fib(int n){
        if(n == 1){
            return 0;
        } else if (n == 2) {
            return 2;
        }else {
            return  fib(n-1) + fib(n-2);
        }
    }*/
    static int fib(int n){
        if(n == 1 || n == 2){
            return n-1;
        }else {
            return  fib(n-1) +  fib(n-2);
        }
    }
    public static void main(String [] args){
        int f = fib(7);
        System.out.println(f);
    }
}