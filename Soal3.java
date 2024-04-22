import java.util.Scanner;

public class Java3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        long n = input.nextLong();
        
        int sum = sumDigit(n);
        System.out.println("Jumlah digit adalah: " + sum);
    }

    public static int sumDigit(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10; 
            n /= 10;       
        }
        return sum;
    }
}
