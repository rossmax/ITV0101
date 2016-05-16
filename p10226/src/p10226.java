import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Max Ross on 5/14/2016 2:55 PM.
 */
public class p10226 {


    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws IOException the io exception
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.readLine();
        Count(n,br);
    }
    public static void Count(int n, BufferedReader br) throws IOException {
        for (int i = 0; i < n; i++) {
            Map<String, Integer> map = new TreeMap<String, Integer>();
            String s;
            int count = 0;
            while ((s = br.readLine()) != null) {
                if (s.equals("")) {
                    break;
                }
                if (map.containsKey(s)) {
                    int x = map.get(s);
                    map.put(s, x + 1);
                } else {
                    map.put(s, 1);
                }
                count++;
            }
            for (Map.Entry<String, Integer> t : map.entrySet()) {
                System.out.printf("%s %.4f\n", t.getKey(), t.getValue() * 100.0 / count);
            }
            if (i < n - 1) {
                System.out.println();
            }
        }
    }

}
