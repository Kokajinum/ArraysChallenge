import java.util.Scanner;

public class SortArray {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        int[] myIntegers = getIntegers(10);
      
        printArray(myIntegers);
        int[] sorted = selectionSort(myIntegers);
        printArray(sorted);
        printArray(myIntegers);
        reverse(myIntegers);
        printArray(myIntegers);

    }
    
    public static void reverse(int[] array) {

        int j = array.length-1;
        for(int i = 0; i < array.length/2; i++){
            int t = array[i];
            array[i] = array[j];
            array[j] = t;
            j--;
        }

    }

    private static int[] selectionSort(int[] array) {

        int[] B = new int[array.length];
        for(int i = 0; i < array.length; i++){
            B[i] = array[i];
        }
        for (int j = 0; j < B.length-1; j++){
            int iMax = j;
            for (int i = j + 1; i < B.length; i++){
                if (B[i] > B[iMax]){
                    iMax = i;
                }
            }
            int t = B[j];
            B[j] = B[iMax];
            B[iMax] = t;
        }
        return B;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    private static int[] getIntegers(int number) {

        System.out.println("Enter " + number + " integer values");
        int[] values = new int[number];

        for(int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }

        return values;

    }

}
