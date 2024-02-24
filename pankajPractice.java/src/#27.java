
//Array
class pankaj27{
    public static void main(String[]args){
        System.out.println("int using in array");
        int [] marks = {67,89,90,88,89,77};
        System.out.println(marks[4]);
        System.out.println(marks.length);

        System.out.println("float using in array");
        float [] num = {67.5f,90.7f,89.6f,88,8f,90.1f};
        System.out.println(num[3]);
        System.out.println(num.length);

        System.out.println("String using in array");
        String [] name = {"Pankaj","Rajesh","Akash","Naik"};
        System.out.println(name[0]);
        System.out.println(name.length);

        System.out.println("using for loops in Array");
        int [] marks1 = {67,89,90,88,89,77};
        for(int i=0; i<marks1.length; i++){
            System.out.println(marks[i]);
        }

        System.out.println("using for loops revers in array");
        int [] marks2 = {67,89,90,88,89,77};
        for(int j=marks2.length -1; j>=0 ;j--){
            System.out.println(marks2[j]);
        }
        System.out.println("using for each loops");
        int [] marks3 = {67,89,90,88,89,77};
        for(int element: marks2){
            System.out.println(element);
        }

    }
}