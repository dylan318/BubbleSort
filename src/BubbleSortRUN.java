import java.util.Scanner;

public class BubbleSortRUN {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to generate an array of random integers and store it in a file");
        System.out.println("Enter 2 to read an existing file containing a list of integers, sort it and store the sorted array in another file");
        int option = sc.nextInt();
        if (option == 1) {
            System.out.println("Enter the length of the array: ");
            int arrayLength = sc.nextInt();
            int[] array = createRandomArray(arrayLength);
            System.out.println("Enter the filename: ");
            String filename = sc.next();
            writeArrayToFile(array, filename);
            System.out.println("Array has been written to the file successfully");
        } else if (option == 2) {
            System.out.println("Enter the filename: ");
            String filename = sc.next();
            int[] array = readFileToArray(filename);
            if (array != null) {
                bubbleSort(array);
                System.out.println("Enter the filename to store the sorted array: ");
                String outputFilename = sc.next();
                writeArrayToFile(array, outputFilename);
                System.out.println("Sorted array has been written to the file successfully");
            }
        } else {
            System.out.println("Invalid option");
        }
        sc.close();
    }

    private static void bubbleSort(int[] array) {
    }

    private static int[] readFileToArray(String filename) {
        return null;
    }

    private static void writeArrayToFile(int[] array, String filename) {
    }

    private static int[] createRandomArray(int arrayLength) {
        return null;
    }
}

