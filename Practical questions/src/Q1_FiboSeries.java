//Q1  Write a java that demonstrates fibonacci series using while loop?
class FibonacciSeries{
    public static void main(String [] args){
        int n1=0, n2=1,n3, count = 10;
        System.out.print(n1+"  "+n2);
        int i= 2;
        while (i<10){
            n3 = n1 + n2;
            System.out.print(" "+n3);
           i++;
           n1 = n2;
           n2 = n3;
        }
    }
}