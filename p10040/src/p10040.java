import java.util.Scanner;

/**
 * Created by rossm on 3/22/2016.
 */
class p10040 {
    public static void main(String[] args){
        int count = 0;
        try {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            while(count == num){
                count++;
                String[] line = sc.nextLine().split(" ");
                int n = Integer.parseInt(line[0]);
                int k = Integer.parseInt(line[1]);
                if ((n < 0 || n > 22) && (k <= 0 || k > Math.pow(2,n))) {
                    break;
                }

            }
        } catch (Throwable e){

        }

    }
}
