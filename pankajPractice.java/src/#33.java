
class VariableArgument33{
/*
    static int sum(int a, int b){
        return a + b;
    }
    static int sum(int a,int b, int c){
        return a + b + c;
    }
    static int sum(int a, int b, int c, int d){
        return a + b + c + d;
    }*/
    static int sum(int ...arr){
        int results = 0;
        for(int a : arr){
            results +=a;
        }
        return results;
    }
    public static void main(String [] args){
        System.out.println(" Welcome to Variable Tutorial ");
        System.out.println("The sum of 4 and 5 is = "+ sum(4,5));
        System.out.println("The sum of 6 , 7 and 8 is = "+ sum(6,7,8));
        System.out.println("The sum of 6 , 7 , 8 and 9 is = "+ sum(6,7,8,9));
    }
}