import java.util.Scanner;

public class cf1850C {
    public static void main(String[] args) {
        // Rudolph and Christmas Tree
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            String arr[] = new String[8];

            for (int j = 0; j < 8; j++) {
                arr[j] = scan.next();
            }

            int startx = 0;
            int starty = 0;
            boolean found = false;
            for (int j = 0; j < 8; j++) {
                for (int k = 0; k < 8; k++) {
                    if (arr[j].charAt(k) != '.') {
                        startx = j;
                        starty = k;
                        found = true;
                        break;
                    }
                }
                if (found == true) {
                    break;
                }
            }
            StringBuilder hello = new StringBuilder();
            while (true) {
                if (startx > 7) {
                    break;
                }
                if (arr[startx].charAt(starty) == '.') {
                    break;
                }
                hello.append(arr[startx].charAt(starty));
                startx++;
            }
            System.out.println(hello);
        }


    }

}
