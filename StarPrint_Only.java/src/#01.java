
//Problem 1
//Write a program using function to print the following pattern ?
/* results
 *
 * *
 * * *
 * * * *
 * * * * *
 */
class StarPrint01{
    static void pattern1(int n){
        for(int i = 0; i < n ; i++){
            for(int j = 0; j < i + 1; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String [] args){

        pattern1(7);
    }
}

//Problem 1
//Write a program using function to print the following pattern ?
/* results
 *
 * *
 * * *
 * * * *
 * * * * *
 */
 class StarPrint2{
     static void pattern02(int n){
         for(int i = 0; i < n; i++){
             for(int j = 0; j < i; j++){
                 System.out.print(" * ");
             }
             System.out.println();
         }
    }
    public static void main(String [] args){
        pattern02(7);
    }
}

class StarPrint0003{
    static void pattern0003(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       pattern0003(9);
    }
}
























