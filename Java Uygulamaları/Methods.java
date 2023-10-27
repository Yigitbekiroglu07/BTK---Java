// Methodlar
// Fonksiyonlar bizi kod tekrarından kurtarır.
public class Methods {
    public static void main(String[] args) {
        // sayiBulmaca diyerek fonksiyonu çağırdım.
            sayiBulmaca();
    }

    public static void sayiBulmaca(){
        int[] sayilar = new int[]{1,2,5,7,9,0};
            int aranaack = 5;
            boolean varMi = false;
        for (int sayi: sayilar){
            if(sayi==aranaack){
                varMi = true;
                break;
            }

        }
        if(varMi) {
            System.out.println("sayi mevcuttur");
        }
        else{
            System.out.println("sayi mevcut değildir");
        }
    }
    // parametreli method, "public static void sayilar" fonksiyonu içine "aranacak" değişkenini atmaya denir.
    public static void mesajVer(int aranacak){

    }
}
