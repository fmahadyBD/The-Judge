
/* Mahady Hasan fahim
Problem link:https://www.codechef.com/problems/VOLCONTROL

*/
import java.util.Scanner;

public class volcontrol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int c, b;
        for (int i = 0; i < a; i++) {
            b = scanner.nextInt();
            c = scanner.nextInt();
            if (b > c) {
                System.out.println(b - c);
            } else if (b < c) {
                System.out.println(c - b);
            }else{
                System.out.println(b - c);
            }
        }
        scanner.close();
    }

}
