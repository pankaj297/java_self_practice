//#29 Chapter 6 Practice
//Q1] Write 1 array of 5 floats and calculate their sum?

class Array29_Ch6{
    public static void main(String [] args){
        System.out.println("Q1 Answer");
        float [] arr1 = {45.6f,89.7f,56.6f,88.8f,87.3f};
        float sum = 0;

        for(float elements: arr1){
            sum = sum + elements;
        }
        System.out.println("The 5 float array sum is = "+ sum);

//Q2] Write a program to find out Whether a giving integer us present in an array or not?
        System.out.println("Q2 Answer");
        int [] arr2 = {1,2,3,4,5,6,7};
        int num1 = 9;
        boolean isArray = false;
        for(int element: arr2){
            if(num1 == element){
                isArray = true;
                break;
            }
        }
        if(isArray){
            System.out.println("Present in the array");
        }else{
            System.out.println("Not present in the array");
        }

// Q3] Calculate the average marks from an array containing marks of all student in physics using fo-each loop?
    float [] marks = {77.7f,88.8f,99.9f,66.6f,55.5f};
        float num2 = 0;

        for(float elements: marks){
            num2 = num2 + elements;
        }
        System.out.println("The average of marks is = "+ num2 / marks.length);

  //Q4 Create a java Program to add two matrix of sing 2*3?
       int [][] multi1 = {{1,2,3},{3,7,1}};
       int [][] multi2 = {{2,6,13},{3,7,1}};
       int [][] results = {{0,0,0},{0,0,0}};

       for(int i=0; i<multi1.length;i++){
           for(int j=0; j<multi1[i].length;j++){
               System.out.format("Setting value is for i=%d and j=%d \n",i,j);

               results[i][j] = multi1[i][j] + multi2[i][j];
           }
       }
    //Q6 Write a java program to find the maximum element in an array?
        System.out.println("Q6 Answer");
          int  [] arr6 ={1,2,40,56,23,600,34};
          int max = 0;
          for(int elements : arr6){
              if(elements > max){
                  max = elements;
              }
          }
          System.out.println("The maximum value of Array = "+ max);

//Q7 Write a java program to find the minimum element in an array?
        System.out.println("Q7 Answer");
        int [] arr7 ={1,-2,44,-45,-88,-455,88,-900};
        int mini = 0;
        for(int elements : arr7){
            if(elements < mini){
                mini = elements;
            }
        }
        System.out.println("The minimum value of Array = "+ mini);

    //Q8 Write a java program ton find whether an array is shorted?
      System.out.println("Q8 Answer");
      boolean isSorted = true;
         int [] arr8 = {1,2,3,45,4,7,44,77};
//        int [] arr8 = {1,2,3,4,5,6,7,88,99};
      for(int i=0; i<arr8.length-1;i++){
          if(arr8[i] > arr8[i+1]){
              isSorted = false;
              break;
          }
      }
      if(isSorted){
          System.out.println("Theis array is sorted");
      }else{
          System.out.println("This array is not sorted");
      }
    }
}