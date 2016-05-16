import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Max Ross on 4/2/2016 7:37 AM.
 */
class p389 {
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()){
                String parameterInput = sc.nextLine();
                System.out.printf("%7s",count(parameterInput));
                System.out.println();
            }
        } catch (Exception ex) {
                ex.printStackTrace();
                System.exit(0);
        }
    }

    public static String count(String input){
        BigInteger n;
        String countValue;
        String[] inputArray = input.split(" +");
        String number = null;
        int fromBase = 0,toBase = 0;

        if (inputArray[0].equals("")) {
            number = inputArray[1];
            fromBase = Integer.parseInt(inputArray[2]);
            toBase = Integer.parseInt(inputArray[3]);
        }
        if (!inputArray[0].equals("")){
            number = inputArray[0];
            fromBase = Integer.parseInt(inputArray[1]);
            toBase = Integer.parseInt(inputArray[2]);
        }


        n = new BigInteger(number,fromBase);
        countValue = n.toString(toBase).toUpperCase();

        if (countValue.length() > 7) {
            countValue = "ERROR";
        }


        return countValue;
    }

}
