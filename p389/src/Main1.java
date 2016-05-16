import java.util.Scanner;

/**
 * Created by Max Ross on 4/2/2016 7:37 AM.
 */
class Main1 {
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()){
                String parameterInput = sc.nextLine();
                System.out.println(count(parameterInput));
            }
        } catch (Exception ex) {
                ex.printStackTrace();
                System.exit(0);
        }
    }

    public static String count(String input){
        String[] numberArray;
        String[] inputArray = input.split(" +");
        if (inputArray[2].equals("2")) {
            return to2Base(inputArray[0], inputArray[1]);
        }
        /*if (inputArray[2] == "3") {
            return to3Base(inputArray[0], inputArray[1]);
        }
        if (inputArray[2] == "4") {
            return to4Base(inputArray[0], inputArray[1]);
        }*/
        if (inputArray[2].equals("10")) {
            return to10Base(inputArray[0], inputArray[1]);
        }
       /* if (inputArray[2] == "15") {
            return to15Base(inputArray[0], inputArray[1]);
        }
        if (inputArray[2] == "16") {
            return to16Base(inputArray[0], inputArray[1]);
        }*/
        return "";
    }
    public static String to2Base(String num, String base) {

        if (base.equals("3")) {
            int value = Integer.parseInt(num);
            String result = Integer.toBinaryString(value);
            return result;
        }
        if (base.equals("4")) {
            int value = Integer.parseInt(num);
            String result = Integer.toBinaryString(value);
            return result;

        }
        if (base.equals("10")) {
            int value = Integer.parseInt(num);
            String result = Integer.toBinaryString(value);
            return result;

        }
        if (base.equals("15")) {
            int value = Integer.parseInt(num);
            String result = Integer.toBinaryString(value);
            return result;

        }
        if (base.equals("16")) {
            int value = Integer.parseInt(num);
            String result = Integer.toBinaryString(value);
            return result;
        }
        return "";
    }
    /*public static String to3Base(String num, String base) {
    if (base.equals("10")) {
            long ret = 0, factor = 1;
    while (num > 0) {
        ret += num % 3 * factor;
        num /= 3;
        factor *= 10;
        }
        return ret;
        }
    }
    public static String to4Base(String num, String base) {

    }*/
    public static String to10Base(String num, String base) {
        String result = "";
        int res = 0;
        if (base.equals("2")) {
            res = Integer.parseInt(num , 2);
            result = Integer.toString(res);
            return result;
        }
        if (base.equals("3")) {
            res = Integer.parseInt(num , 3);
            result = Integer.toString(res);
            return result;

        }
        if (base.equals("4")) {
            res = Integer.parseInt(num , 4);
            result = Integer.toString(res);
            return result;

        }
        if (base.equals("15")) {
            res = Integer.parseInt(num , 15);
            result = Integer.toString(res);
            return result;

        }
        if (base.equals("16")) {
            res = Integer.parseInt(num , 16);
            result = Integer.toString(res);
            return result;
        }
        return "";
    }/*
    /*public static String to15Base(String num, String base) {

    }
    public static String to16Base(String num, String base) {

    }*/


}
