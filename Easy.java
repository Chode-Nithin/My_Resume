import java.util.*;

public class Easy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int k = 0;
        for (int i = 1; i < x; i++) {
            if (x == i * a) {
                System.out.println(i);
                k = 1;
            }
        }
        if (k == 0)
            System.out.println("None");

    }

}
