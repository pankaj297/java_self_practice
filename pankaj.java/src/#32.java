// Method Overloading in Java
class pankaj32_Method_Overloading{
    static void foo(){
        System.out.println("Good Morning Bro!");
    }

    static void foo(int a){
        System.out.println("Good Morning "+ a + " Bro! ");
    }
     static  void change(int a){
         a = 88;
     }
     static void change1(int [] arr){
         arr[0] = 98;
      }
    static void tellJoke(){
        System.out.println("I invented a new world!\n"+ "Plagiarism!");
    }
    public static void main(String[] args) {
        tellJoke();

        //case 1 : Changing the Integer
        int [] arr = {55,66,77,88,99,89};
        int x = 71;
        change(x);
        System.out.println("The value of x after running change is :"+ x);

        //case 2 : Changing the array
        int [] arr1 = {55,66,77,88,99,89};
        change1(arr1);
        System.out.println("The value of x after running change is : "+ arr1[0]);

        //Method Overloading
//        foo();
        foo(300);
    }
}

class pankaj32_Method_Overloading1{
    static void foo1() {
        System.out.println("Good Morning Bro!");
    }
    static void foo1(int a){
        System.out.println("Good Morning "+ a + " Bro! ");
    }

    public static void main(String[] args) {
        foo1(100);
    }
}
