import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    "test.txt"));
            String line = reader.readLine();
            while (line != null) {
                //System.out.println(line);
                String[] arrOfStr = line.split("");
                //for (String a : arrOfStr)
                    //System.out.println(a);
                // read next line
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
