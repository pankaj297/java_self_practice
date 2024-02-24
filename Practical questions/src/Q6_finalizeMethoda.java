//Q6 Write a java program demonstrate use of finalize(final) method.
//ex-1
class XYZ {
    final void demo() {
        System.out.println("Hello");
    }
}
    class ABC extends XYZ{
        public static void main(String [] args){
            ABC obj = new ABC();
            obj.demo();

    }
}
//ex-2
class PQR{
    final void demo1(){
        System.out.println("Hello World");
    }
}
class RPQ extends PQR{
    public static void main(String [] args){
        RPQ s1 = new RPQ();
        s1.demo1();
    }
}

//ex-3
class pankaj{
    final void demo2(){
        System.out.println("Pankaj Naik");
    }
}
class akash extends pankaj{
    public static void main(String [] args){
        akash a1 = new akash();
        a1.demo2();
    }
}

//ex-4
class rajesh{
    final void demo3(){
        System.out.println("Congratulations");
    }
}
class pankuu extends rajesh{
    public static void main(String [] args){
        pankuu p1 = new pankuu();
        p1.demo3();
    }
}

