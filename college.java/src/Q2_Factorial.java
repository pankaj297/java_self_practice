//Q2 Write a java program that demonstrates factorial using for loop
//factorial 5 = 5 * 4 * 3 * 2 * 1 = 120
// factorial 6 = 6 * 5 * 4 * 3 * 2 * 1 = 720
class FactorialSeries{
    public static void main(String [] args){
        int n = 5, fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact * i;
        }
        System.out.println("Factorial = "+ fact);
    }
}