//Mukemmel Sayilar
public class MukemmelSayi {
    public static void main(String[] args) {
     int number = 28;
     int toplam = 0;
     // x'i number sayısını tam bölen sayılar olarak belirledim.
        for(int x=1; x < 28; x++){
            if(number%x==0){
                toplam = toplam + x;
                if(number==toplam) {
                    System.out.println("Sayi mükemmel sayidir");
                    return;
                }

            }

        }

            System.out.println("Sayi mükemmel sayi degildir");
            return;



    }
}