//Parametreli methodlar
public class Methods2 {
    public static void main(String[] args) {
        String yeniMesaj = sehirVer();
        int sayi = topla(5,7);
        System.out.println(sayi);
        System.out.println(yeniMesaj);

    }

    public static void ekle() {
        System.out.println("Eklendi");

    }

    public static void sil() {
        System.out.println("silindi");

    }

    public static void guncelle() {
        System.out.println("guncellendi");

    }

    public static int topla(int sayi1, int sayi2) {
        // "return" "return sayi1 + sayi 2'den farkı" ikisi de bitir demek ama "sayi 1 + sayi 2" bitir ama sayi 1 + sayi 2 döndür demek.
        return sayi1 + sayi2;

    }
    public static String sehirVer(){
        return "Ankara";
    }
}
