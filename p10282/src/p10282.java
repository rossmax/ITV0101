import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Max Ross on 5/14/2016 3:38 PM.
 */
public class p10282 {

    public static void main(String[] args) throws IOException {
        Count();
    }
    public static void Count()throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        Map words = new HashMap();
        while (!line.matches("")) {
            String[] Split = line.split(" ");
            words.put(Split[1], Split[0]);
            line = reader.readLine();
        }
        line = reader.readLine();
        boolean found = false;
        while (line != null) {
            found = false;
            if (words.containsKey(line)) {
                found = true;
                System.out.println(words.get(line));
            }
            if (!found)
                System.out.println("eh");
            line = reader.readLine();
        }
    }
}


