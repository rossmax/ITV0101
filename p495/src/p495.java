import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Maksim Ross on 3/22/2016.
 */
class p495 {
    public static void main(String[] args) throws IOException {
        BigInteger[] FiboSequence = new BigInteger[5001];
        try {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()){
                int num = sc.nextInt();
                for (int i = 2; i <= num; ++i) {
                FiboSequence[0] = BigInteger.valueOf(0);
                FiboSequence[1] = BigInteger.valueOf(1);
                FiboSequence[i] = FiboSequence[i - 1].add(FiboSequence[i - 2]);
                }
                System.out.println("The Fibonacci number for " + num + " is " + FiboSequence[num]);
            }

      } catch(Throwable e){
          System.out.print(e);
          System.exit(0);
      }
    }
}

