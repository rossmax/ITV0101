import java.io.IOException;
import java.util.StringTokenizer;

/**
 * Created by Max Ross on 4/10/2016.
 */
class p107 {
    public static void main(String[] args) throws IOException {

        String line;

        while ((line = lRead(255)) != null) {

            StringTokenizer st = new StringTokenizer(line);

            int height = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());


            if ((height > 0) && (num > 0)) {

                if ((height > 1) && (num > 1)) {

                    int test = 2;
                    boolean found = false;
                    double value = Math.log(height) / Math.log(num);

                    while (!found) {

                        if (test + 1 - Math.pow(test, value) < 1E-15)
                            found = true;

                        else test++;

                    }

                    int temp = 1;
                    int total = 1;
                    int total_height = 0;
                    int h = 1;

                    while (num >= 1) {

                        total_height += (h * num);
                        temp *= test;

                        if (num > test)
                            total += temp;

                        h *= (1 + test);
                        num /= test;

                    }

                    System.out.println(total + " " + total_height);

                } else if ((height == 1) && (num == 1))
                    System.out.println(0 + " " + num);

                else if ((height > 1) && (num == 1)) {

                    int m = (int) (Math.log(height) / Math.log(2));
                    int test = 1;
                    int total = 1;
                    int temp = 1;
                    int total_height = 0;

                    for (int i = 1; i < m; i++) {
                        total_height += (height * temp);
                        temp *= test;
                        total += temp;
                        height /= 1 + test;
                    }

                    for (int j = m - 1; j <= m; j++) {
                        total_height += (height * temp);
                        temp *= test;
                        height /= 1 + test;
                    }

                    System.out.println(total + " " + total_height);

                }

            } else break;

        }
    }

    public static String lRead(int maxLg) {
        byte lin[] = new byte[maxLg];
        int lg = 0, car = -1;
        String line = "";

        try {
            while (lg < maxLg) {
                car = System.in.read();
                if ((car < 0) || (car == '\n')) break;
                lin[lg++] += car;
            }
        } catch (Exception e) {
            return (null);
        }

        if ((car < 0) && (lg == 0)) return (null);
        return (new Str(lin, 0, lg));
    }

}