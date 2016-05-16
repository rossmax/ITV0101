import java.util.Scanner;
 
public class p10127 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         
        while(in.hasNext()){
            int ones =1, acc=1, n=in.nextInt();
            while(acc!=0){
                if(n>acc) ones++;
                acc= n>acc ? acc*10 +1  : acc%n;
            }
            System.out.println(ones);
        }
    }
}