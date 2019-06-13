import java.util.Scanner;
public class Average {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int total = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Type num: ");
            num = scan.nextInt();
            total += num;
        }
        double average = total/10;
        System.out.println("The avergage is : " + average);
    }
}
