import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Set<String> stringSet = new HashSet<>(num);
        scanner.nextLine();
        for (int i = 0; i < num; i++) {
            String name = scanner.nextLine();
            stringSet.add(name);
            System.out.println(stringSet.size());
        }

    }
}
