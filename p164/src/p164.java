import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 * Created by Max Ross on 4/12/2016 6:30 PM.
 */
class p164 {
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
            while(sc.hasNext()){
                String output;
                String from = sc.next();
                String to = sc.next();

                if (from.length() == to.length()) {

                }

                if (from.length() > to.length()) {
                    deleteChar(from,to);
                }

                if (from.length() < to.length()) {
                    insertChar(from,to);
                }

            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.exit(0);
        }

    }

    public static String deleteChar(String from, String to){
        String[] fromArray = from.split("");
        String[] toArray = from.split("");
        String output;
        String letternum;
        int letterNum;
        boolean number = false;
        boolena sameLetter = false;
        int countSameLetter = 0;

        while (number) {
            for (int i = 0; i < fromArray.length; i++) {
                for (int j = 0; j < toArray.length; j++) {
                if (fromArray[i] == toArray[j]) {
                    sameLetter = true;
                }
                }
            }
        }

    }

    public static String insertChar(String from, String to){
        String[] fromArray = from.split("");
        String[] toArray = from.split("");

        for (int i = 0; i < fromArray.length; i++) {
            for (int j = 0; j < toArray.length; j++) {
                from[i]
            }
        }

    }
}
