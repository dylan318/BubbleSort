import java.io.FileWriter;
import java.io.IOException;

public class BubbleSort2 {
     public static void writeArrayToFile(int[] array, String filename) {
        try {
            FileWriter writer = new FileWriter(filename);
            for (int i = 0; i < array.length; i++) {
                writer.write(String.valueOf(array[i]));
                writer.write("\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file");
            e.printStackTrace();
        }
    }
}
