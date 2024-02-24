//Array
class pankaj27{
    public static void main(String [] args){
        int [] marks = {78,80,98,68,80,90};
        System.out.println(marks[3]);
        System.out.println(marks.length);

        float [] num = {78.7f,90.5f,99.0f,67.6f,88.4f,56.8f,78.0f,66.6f};
        System.out.println(num[7]);
        System.out.println(num.length);

        String [] name = {"Pankaj", "Rajesh","Akash","Pavan","Nitin"};
        System.out.println(name[0]);
        System.out.println(name.length);

        System.out.println("print using for loop in Array");
        int [] numbers = {78,56,87,68,87,68,49,79,89,79,89,89,85,55,65};
        for(int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }


         System.out.println("print using for loop revers in Array");
        int [] numbers1 = {78,56,87,68,87,68,49,79,89,79,89,89,85,55,65};
        for(int j=numbers1.length-1;j>=0;j--) {
            System.out.println(numbers1[j]);
        }
        System.out.println("using for each loop");
        for (int element: numbers1){
            System.out.println(element);
        }
    }
}