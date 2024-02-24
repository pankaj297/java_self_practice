//Method in java
/*
class pankaj31{
    static int logic(int x , int y) {
        int z;
        if (x > y) {
            z = x + y;
        }else{
            z = (x + y)* 5;
        }
        return z;
    }
    public static void main(String [] args){
        int a = 20;
        int b = 17;
        int c;
        c = logic(a,b);
        System.out.println(c);

        int a1 = 10;
        int b1 = 7;
        int c1;
        c1 = logic(a1,b1);
        System.out.println(c1);
    }
}*/

//colling obj Mathod in java

class pankaj31{
    int logic(int x, int y){
        int z;
        if(x > y){
            z = x + y;
        }else{
            z =(x + y) * 5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 7;
        int c;
        pankaj31 obj = new pankaj31();
        c = obj.logic(a,b);
        System.out.println(c);

        int a1 = 20;
        int b1 = 17;
        int c1;
        c1 = obj.logic(a1,b1);
        System.out.println(c1);
    }
}