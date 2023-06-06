import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double salatalikFiyat= 3.14;
        double elmaFiyat = 4.11;
        double kabakFiyat = 2.22;
        double domatesFiyat = 0.95;
        double patlicanFiyat = 7;

        System.out.println(" Salatalik kg fiyati= 3,14 \n Elma kg fiyati= 4,11 \n Kabak kg fiyati 2,22 \n Domates 0,95 \n Patlican kg fiyati= 7,00");

        System.out.println("Kac kg salatalik almak istersiniz?\n");
        double salatalikIstenen = s.nextDouble();

        System.out.println("Kac kg elme almak istersiniz?\n");
        double elmaIstenen = s.nextDouble();

        System.out.println("Kac kg kabak almak istersiniz?\n");
        double kabakIstenen = s.nextDouble();

        System.out.println("Kac kg domates almak istersiniz?\n");
        double domatesIstenen = s.nextDouble();

        System.out.println("Kac kg patlican almak istersiniz?\n");
        double patlicanistenen = s.nextDouble();

        double salatalikFinal = salatalikIstenen*salatalikFiyat;
        double elmaFinal = elmaIstenen*elmaFiyat;
        double kabakFinal = kabakIstenen*kabakFiyat;
        double domatesFinal = domatesIstenen*domatesFiyat;
        double patlicanFinal = patlicanistenen*patlicanFiyat;

        double toplamFiyat = salatalikFinal + elmaFinal + kabakFinal + domatesFinal + patlicanFinal;

        System.out.println(" Salatalik fiyati= "+ salatalikFinal+ "\n Elma fiyati= "+ elmaFinal+ "\n Kabak fiyati= "+ kabakFinal+ "\n Domates Fiyati= "+domatesFinal+ "\n Patlican fiyati= "+ patlicanFinal);
        System.out.println("Sepetenizin toplam fiyati= "+ toplamFiyat);
    }
}