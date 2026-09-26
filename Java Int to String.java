import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            sc.close(); 
            try {
                String s = Integer.toString(n);
                if (n == Integer.parseInt(s)) {
                    System.out.println("Good job");
                } else {
                    System.out.println("Wrong answer");
                }
            } catch (Exception e) {
                System.out.println("Wrong answer");
            }
        } else {
            sc.close();
        }
    }
}


