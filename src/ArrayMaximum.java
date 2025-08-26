import java.util.Scanner;

public class ArrayMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int index = 0; index < n; index++){
            arr[index] = sc.nextInt();
        }
        System.out.println(String.format("The maximum element of the array is %d" , maximum(arr)));
    }

    public static int maximum(int[] arr){
        return findMaximum(arr, 0);
    }

    public static int findMaximum(int[] arr, int index){
        if(index == arr.length-1){
            return arr[index];
        }

        int currentMax = findMaximum(arr, index+1);

        return Math.max(currentMax, arr[index]);
    }
}
