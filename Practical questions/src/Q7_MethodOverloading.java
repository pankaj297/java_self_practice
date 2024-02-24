//Q7 Write a java program to demonstrate use of method overloading.
//ex-1

class Pankaj1{
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
}
    class MethodOverloading{
    public static void main(String [] args){
        System.out.println(Pankaj1.add(11,11));
        System.out.println(Pankaj1.add(11,11,11));
    }
}
//ex-2
//methodOverloading
class Pankaj2{
    static int add1(int a,int b){
        return a + b;
    }
    static int add1(int a, int b, int c){
        return a + b + c;
    }
    static int add1(int a,int b,int c, int d){
        return  a + b + c + d;
    }

        public static void main(String [] args){
            System.out.println(Pankaj2.add1(22,22));
            System.out.println(Pankaj2.add1(33,33,33));
            System.out.println(Pankaj2.add1(44,44,44,44));
        }
    }























