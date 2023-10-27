// String Demo
public class StringDemo {
    public static void main(String[] args) {
        String mesaj = "Bugün hava cok güzel";
            System.out.println(mesaj);

    // .charAt() fonksiyonu belirli değerdeki rakamı ya da harfi bulmak için kullanılır.
    // .lenght() fonksiyonu metinin uzunluğunu veren fonksiyondur
    // .concat mesajları birleştirmeye yarar.
    // .startsWith() eğer metnin baş harfini doğrusunu yazarsak ture, yanlışını yazarsak false döndürür.
    // .endsWith() eğer metnin son harfini doğrusunu yazarsak true, yanlışını yazarsak false döndürür.
    // .indexOf() karakterin veya stringin mesajın içinde kaçıncı eleman olduğunu bulmamıza yarar.
    // .lastindexOf() yine baştan saymaya başlar ama aramaya sağdan başlar.
    // .replace() değiştirmeye yarar.
    // .substring(2) mesajın 2.indexinden itibaren alır.
    // .toLowerCase() bütün harfleri küçük harfe döndürür.
    // .toUpperCase() bütün harfleri büyük harfe döndürür.
            String yeniMesaj = mesaj.replace(" ", "--");
            System.out.println(yeniMesaj);
            System.out.println(mesaj.substring(2,4));
            System.out.println(mesaj.toUpperCase());

    }
}