//Arkadaş Sayilar
public class ArkadasSayilar {
    public static void main(String[] args) {
        int number1 = 220;
        int number2 = 284;
        int toplam1 = 0;
        int toplam2 = 0;
        for (int i = 1; i < 284; i++) {
            if (number1 % i == 0) {
                toplam1 = toplam1 + i;
                if (number1 == toplam1) {
                    System.out.println("Sayi arkadaş sayidir");
                    return;
                }
            }


        }
        for (int x = 1; x < 220; x++) {
            if (number1 % x == 0) {
                toplam2 = toplam2 + x;
                if (number2 == toplam2) {
                    System.out.println("Sayi arkadaş sayidir");
                    return;
                }
            }


        }
        System.out.println("Sayi arkadaş sayi degildir");
        return;
    }

}