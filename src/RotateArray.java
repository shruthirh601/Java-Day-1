import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int index = 0; index < n; index++){
            arr[index] = sc.nextInt();
        }
        System.out.println("Enter the value of m:");
        int m = sc.nextInt();

        arr = rotateArray(arr, m);
        for(int element: arr){
            System.out.print(element + " ");
        }

    }

    public static int[] rotateArray(int[] arr, int steps) {
        int n= arr.length;
        if (steps == 0) {
            return arr;
        }
        steps %= arr.length;
        int tempArray[] = new int[arr.length];
        for (int i = 0; i <n-steps; i++)
            tempArray[i] = arr[i+steps];

        for (int i = 0; i < steps; i++)
            tempArray[n - steps + i] = arr[i];

        for (int i = 0; i < n; i++)
            arr[i] = tempArray[i];
        return tempArray;
    }
}
