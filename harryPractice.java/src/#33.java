
class VariableArgument33{
    /*
    static int sum(int a,int b){
        return a + b;
    }
    static int sum(int a,int b, int c){
        return a + b + c;
    }
    static int sum(int a, int b , int c, int d){
        return a + b + c + d;
    }*/
    static int sum(int ...arr){
        int results = 0;
        for(int a: arr){
            results += a;
        }
        return results;
    }
    public static void main(String [] args){
        System.out.println("Welcome to Variable Tutorial");
        System.out.println("The sum of 5 and 8 is = "+ sum(5,8));
        System.out.println("The sum of 5 , 8 and 9 is = "+ sum(5,8,9));
        System.out.println("The sum of 5 , 8 , 9 and 10 = "+ sum(5 ,8, 9, 10));
    }
}