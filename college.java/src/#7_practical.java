//FiboSeries
class practical07{
    public static void main(String [] args){
        int n1 = 0, n2 = 1, sum ,count = 0;
        System.out.println("Series is = ");
        System.out.println(n1);
        System.out.println(n2);
        while(count!=5){
            sum = n1 + n2;
            System.out.println(sum);
            n1 = n2;
            n2 =sum;
            count++;
        }
    }
}
