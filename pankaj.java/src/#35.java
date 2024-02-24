
class practiceSet_onMethods35{
    //Q1 Multiplication Table
    static void multiplication(int n){
        for (int i =1 ; i<=10; i++){
            System.out.format("%d X %d = %d\n", n , i ,n*i);
        }
    }
    //Q2 Star Print
    static void pattern1(int n){
        for(int i = 0; i < n; i++ ){
            for (int j = 0; j < i+1; j++){
                System.out.print("💫");
            }
            System.out.println();
        }
    }
    //Q3 Natural number sum
    static int sumRec(int n){
        if(n == 1){
            return 1;

        }
        return n + sumRec(n-1);
    }
    //Q4 Star Print rivers
    static void pattern2(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0 ; j < i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Q5 fibonacci series
     static int fib(int n){
        /*
        if(n == 1){
            return 0;
        } else if (n == 2) {
            return 2;
        } */
         if(n == 1 || n == 2){
             return n-1;
         }
        else{
            return fib(n-1)+ fib(n-2);
        }
     }
     //Q8 star print used Recursion
        static void pattern1_rec(int n){
          if(n > 0){
              pattern1_rec(n-1);
              for(int i=0; i<n;  i++){
                  System.out.print("*");
              }
              System.out.println();
          }
        }

        public static void main(String [] args){
            System.out.println("Multiplication Table");
        //Problem 1
        multiplication(7);

            System.out.println("Star print");
        //Problem 2
        pattern1(9);

            System.out.println("Natural Number sum");
        //Problem 3
        int c = sumRec(4);
        System.out.println(c);

        System.out.println("Star Print rivers");
        //Problem 4
        pattern2(9);

        System.out.println("fibonacci series");
        //Problem 5
        //fibonacci series - 0,1,1,2,3,5,8,13,21,34
           int results = fib(7);
           System.out.println(results);

            System.out.println("star print recursion");
        //Problem 8
        pattern1_rec(9);


    }
}
