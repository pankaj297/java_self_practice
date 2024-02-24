import javax.swing.plaf.basic.BasicSplitPaneUI;

//#29 Chapter 6 Practice set
//Q1 Create an array of 5 floats and calculate their sum ?
class pankaj29 {
    public static void main(String[] args) {
        System.out.println("Q1 Answer");
        float[] num = {93.5f, 89.5f, 89.7f, 98.8f, 87.8f};
        float sum = 0;

        for (float elements : num) {
            sum = sum + elements;
        }
        System.out.println("5 float number sum = " + sum);

        System.out.println("Q2 Answer");
//Q2 Write a Program to find out Whether a given integer is present in an array or not ?
        float[] marks1 = {56.7f, 87.9f, 89.5f, 89.5f, 88.8f};
        float num1 = 56.7f;
        boolean isArray = false;
        for (float element : marks1) {
            if (num1 == element) {
                isArray = true;
                break;
            }
        }
        if (isArray) {
            System.out.println("The value is present in the array");
        } else {
            System.out.println("The value is not present in the array");
        }

        System.out.println("Q3 Answer");
//Q3 Calculate the average marks form an array containing marks of all student in physics using for each loop

        float[] marks2 = {57.7f, 56.9f, 89.8f, 88.0f, 89.9f};
        float sum2 = 0;
        for (float element : marks2) {
            sum2 = sum2 + element;
        }
        System.out.println("The average marks is " + sum2 / marks2.length);

        System.out.println("Q4 Answer");
        //Q4 Create a java program to add two matrix of sine 2*3
        int[][] mut1 = {{1, 2, 3},
                {4, 5, 6}};
        int[][] mut2 = {{2, 6, 13},
                {3, 7, 1}};
        int[][] results = {{0, 0, 0},
                {0, 0, 0}};

        for (int i = 0; i < mut1.length; i++) {
            for (int j = 0; j < mut1[i].length; j++) {
                System.out.format("Setting value for i=%d and j=%d\n", i, j);
                results[i][j] = mut1[i][j] + mut2[i][j];
            }
        }

  //Q5 Write a java program to reverse an array
        System.out.println("Q5 Answer");
         int [] arr ={1,2,3,4,5,6};
         int l = arr.length;
         int n = Math.floorDiv(l,2);
         int temp;

         for(int i=0; i<n; i++){
             //swap a[i] and a [l-1-1]
             temp = arr[i];
             arr[i] = arr[l-1-i];
             arr[l-1-i] = temp;

         }
         for(int element: arr){
             System.out.println(element+" ");
         }

    //Q6 Write a java program to find the maximum element in an array
        System.out.println("Q6 Answer");
        int [] arr1 ={1,22,33,23,533,63,67,1000,400};
       int max = 0;
       for(int element: arr1){
           if(element > max){
               max = element;
           }
       }
        System.out.println("the maximum element in an array is = "+max);

       //Notes
//        System.out.println(Integer.MAX_VALUE);  2147483647
//        System.out.println(Integer.MIN_VALUE);  -2147483648

        //Q7 Write a java program to find the minimum element in a java array.
        int [] arr2 = {1,-45,67,-99,-177,500,-400};
        int mini = 0;
        for(int element: arr2){
             if(element < mini){
                 mini = element;
            }
        }
        System.out.println("the minimum element in an array is = "+ mini);

    //Q8 Write a java program to find whether an array is shorted or not
        System.out.println("Q8 Answer");
        boolean isSorted = true;
//        int [] arr3 = {1,200,33,4,45,87}; //not sorted
          int [] arr3 = {1,2,3,4,5,6,87};//sorted
        for(int i=0; i<arr3.length-1; i++){
            if(arr3[i] > arr3[i+1]) {
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }
    }
}