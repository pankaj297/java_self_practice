
//Problem 2
//Write a program using function to print the following pattern ?
/* results
  *
  * *
  * * *
  * * * *
  * * * * *
 */
class Ch7_Q2_Ps_Star_Print{
    static void pattern1(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i+1; j++ ){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        pattern1(9);
    }
}