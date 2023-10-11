import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i <a; i++) {
           i++;
            System.out.println(i);
        }
    }
}