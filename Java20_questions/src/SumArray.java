//Sum or Array

import java.util.Arrays;

class SumArray{
    public static void main(String[] args) {
        int[] arr = {12, 22, 33, 44, 55, 66, 77};

        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);

    }
}