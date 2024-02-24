 //Array
//#27 For each loop in java
class pankaj27{
    public static void main(String [] args){
        int [] marks = {90,45,89,56,88,76};
        System.out.println(marks[5]);
        System.out.println(marks.length);

        float [] num = {58.5f,78.6f,89.7f,89.f,90.9f,88.9f};
        System.out.println(num[4]);
        System.out.println(num.length);

        String [] name = {"Pankaj","Akash","Rajesh","Abhishek","Pavan"};
        System.out.println(name[1]);
        System.out.println(name.length);

        //Displaying the array (for loop)
        int [] numbers = {86,82,84,98,75,89,73,55,65,68,68,65,85,84,85,86,68};
        System.out.println("Printing using for loop");
        for(int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }
         System.out.println("Printing using for loop to revers order");
         //Displaying the array (for loop)
            int [] rvers = {86,82,84,98,75,89,73,55,65,68,68,65,85,84,85,86,68};
         for(int j =rvers.length -1; j>=0; j--){
             System.out.println(rvers[j]);
            }
         //Displaying the array (for each loop)
        System.out.println("use for each loop");
        for(int element: numbers){
            System.out.println(element);
        }

    }
}