
//Problem link: https://www.codechef.com/problems/CABS
import java.util.Scanner;
//Codechef repalce in CC_CheaperCube
class CC_CheaperCube {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        int[] b = new int[a];
        int[] c = new int[a];

        for (int i = 0; i < a; i++) {

            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < a; i++) {

            if (b[i] < c[i]) {
                System.out.println("FIRST");
            } else if (b[i] == c[i]) {
                System.out.println("ANY");
            } else {
                System.out.println("SECOND");
            }
        }

    }

}
