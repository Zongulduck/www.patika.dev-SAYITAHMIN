import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int Sayi = rand.nextInt(101);
        int Hak = 5;

        System.out.println("0 ile 100 arasında bir sayı tahmin edin.");

        while (Hak > 0) {
            System.out.print("Tahmininiz: ");
            Scanner scanner = new Scanner(System.in);
            int tahmin = scanner.nextInt();

            if (tahmin == Sayi) {
                System.out.println("Tebrikler! Doğru tahmin ettiniz.");
                break;
            } else if (tahmin < Sayi) {
                System.out.println("Daha büyük bir sayı girin.");
            } else {
                System.out.println("Daha küçük bir sayı girin.");
            }

            Hak--;
            System.out.println("Kalan hak: " + Hak);
        }

        if (Hak == 0) {
            System.out.println("Tahmin hakkınız bitti. Doğru sayı: " + Sayi);
        }
    }
}
