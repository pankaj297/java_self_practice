
class StarPrint05_01{
    public static void main(String [] args){
        int i,j,k;
        for(i=1; i <= 8; i++){
            for(j = 8; j > i; j--){
                System.out.print(" ");
            }
            for(k = 1; k <= i; k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
  /* out put
             *
           *  *
         *  *  *
       *  *  *  *
     *  *  *  *  *
   *  *  *  *  *  *
 *  *  *  *  *  *  *
*  *  *  *  *  *  *  *


   */


class StarPrint0501{
    public static void main(String[] args) {
        int i,j,k;
        for(i = 1; i <= 9; i++){
            for(j = 9; j > i; j--){
                System.out.print(" ");
            }
            for(k = 1; k <= i; k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
















