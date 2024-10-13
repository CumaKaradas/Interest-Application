import java.util.Scanner;

public class FaizUygulamasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan giriş bilgilerini alma
        System.out.println("Ana para miktarını giriniz: ");
        double anaPara = scanner.nextDouble();

        System.out.println("Yıllık faiz oranını giriniz (%): ");
        double faizOrani = scanner.nextDouble();

        System.out.println("Vadeyi (yıl cinsinden) giriniz: ");
        int vade = scanner.nextInt();

        // Faiz hesaplama
        double faizTutari = (anaPara * faizOrani * vade) / 100;

        // Toplam tutarı hesaplama
        double toplamTutar = anaPara + faizTutari;

        // Sonucu ekrana yazdırma
        System.out.println("Faiz Tutarı: " + faizTutari);
        System.out.println("Toplam Tutar: " + toplamTutar);

        scanner.close();
    }
}
