import java.util.Arrays;

class ArrayAverage{
    public static void main(String[] args) {
        int[] arr = {12, 22, 33, 44, 55, 66, 77};
        int sum = 0;

        for(int i = 1; i < arr.length; i++){
          sum += arr[i];
        }
       double avg = sum / arr.length;
        System.out.println("the sum  is "+ sum + " and the avg is "+  avg);
    }
}

