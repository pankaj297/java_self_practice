
//Q8 Star print using recursion
class Ch7_Q8_Ps_StarPrintUsingRecursion{
    static void pattern1_rec(int n){
        if(n > 0){
            pattern1_rec(n-1);
            for(int i = 0; i <n ; i++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
       pattern1_rec(7);
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
 */
