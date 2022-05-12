import java.util.Scanner;

public class Array {
    private static Scanner sc;

    public static void main(String[] args) 
    {
        int N1, N2, N3, N4, N5,S1, S2, S3, S4, S5;
        sc = new Scanner(System.in);

        System.out.print(" Enter 5 Number : ");
        N1 = sc.nextInt();
        N2 = sc.nextInt();
        N3 = sc.nextInt();
        N4 = sc.nextInt();
        N5 = sc.nextInt();

        S1 = calsquare(N1);
        S2 = calsquare(N2);
        S3 = calsquare(N3);
        S4 = calsquare(N4);
        S5 = calsquare(N5);

        System.out.println("Square Number" + N1 + N2 + N3 + N4 + N5 + "  -->  " + S1 + " " + S2+ " " + S3 + " " + S4 + " " +   S5);
    }

    public static int calsquare(int num) {
        return num * num;
    }
}