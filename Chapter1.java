import java.util.Scanner;

public class Chapter1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ecc ecc = new ecc();
        ecc.num = 1;
        ecc.prime = 1;

        ecc.repr();
    }
}
