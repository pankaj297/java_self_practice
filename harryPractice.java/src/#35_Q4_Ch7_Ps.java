
//Problem 4
//Write a Function t calculate sum of first n natural numbers ?
/*results
   * * * * *
   * * * *
   * * *
   * *
   *
 */
class Ch7_Q4_Ps_Star_Print_Rivers{
    static void pattern2(int n) {

        for (int i = n; i > 0; i--) {
            for (int j = 0; j<i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
      pattern2(5);
    }
}

