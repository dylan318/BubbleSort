import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BubbleSort3 {
    public static int[] readFileToArray(String filename) {
        int[] array = null;
        try {
            Scanner scanner = new Scanner(new File(filename));
            int arrayLength = 0;
            while (scanner.hasNextLine()) {
                arrayLength++;
                scanner.nextLine();
            }
            scanner.close();
            array = new int[arrayLength];
            Scanner arrayScanner = new Scanner(new File(filename));
            int i = 0;
            while (arrayScanner.hasNextLine()) {
                array[i++] = Integer.parseInt(arrayScanner.nextLine());
            }
            arrayScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
        return array;
    }
}
