import java.util.Scanner;

public class Java2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bilPositif = 0;
        int bilNegatif = 0;
        double total = 0.0;
        double rataRata;

        System.out.println("Masukan bilangan integer, program akan berhenti jika memasukan nilai 0:");

        while (true) {
            int bilangan = scanner.nextInt();

            if (bilangan == 0) {
                break;
            }

            if (bilangan > 0) {
                bilPositif++;
            } else {
                bilNegatif++;
            }

            total += bilangan;
        }

        rataRata = total / (bilPositif + bilNegatif);

        System.out.println("Jumlah bilangan positif adalah: " + bilPositif);
        System.out.println("Jumlah bilangan negatif adalah: " + bilNegatif);
        System.out.println("Nilai total adalah: " + total);
        System.out.printf("Nilai rata-rata: %.2f", rataRata);

        scanner.close();
    }
}

