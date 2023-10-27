// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class RecapDemo2 {
    public static void main(String[] args) {
      double[] myNumber = {1.2,2.3,8,6.8};
      double toplam=0;
      double max = myNumber[0];

        //sayilari ekrana yazdirma, toplamını ekrana yazdırma, en büyük sayıyı ekrana yazdırma
        for(double sayilar:myNumber){
            if(max < sayilar) {
                max = sayilar;
            }
            toplam = toplam + sayilar;

                System.out.println(sayilar);

        }
                System.out.println("Toplam = "+ toplam);
                System.out.println("En büyük = "+ max);

    }
}