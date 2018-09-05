import java.util.Scanner;

public class MinElementChallenge {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] A = readIntegers(5);
        System.out.println(findMin(A));

    }

    public static int findMin(int[] array) {

        int min = array[0];

        for(int i = 1; i < array.length;i++){
            if (array[i] < min){
                min = array[i];
            }
        }

        return min;
    }

    public static int[] readIntegers(int number) {

        System.out.println("Enter " + number + " integer values: ");
        int[] values = new int[number];

        for(int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

}
