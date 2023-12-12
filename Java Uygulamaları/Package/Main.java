// Bir paketi başka pakette kullanmak için onu import etmek gerekir
import matematik.DortIslem;
import matematik.Logaritma;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int sayi = scanner.nextInt();
        System.out.println("Merhaba "+sayi);
        DortIslem dortIslem = new DortIslem();
        dortIslem.topla(2,3);
        System.out.println("Toplam = "+dortIslem.topla(2,3));
        Logaritma logaritma = new Logaritma();
        }
    }
