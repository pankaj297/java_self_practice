//Logical and operator
class pankaj17{
    public static void main(String [] args){
        boolean a1 = true;
        boolean b1 = true;
        if(a1 && b1){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

        boolean a2 = true;
        boolean b2 = false;
        if(a2 && b2){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        boolean a3 = false;
        boolean b3 = true;
        if(a3 && b3){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        boolean a4 = false;
        boolean b4 = false;
        if(a4 && b4){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}