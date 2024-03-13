// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try
        {
            int [] sayilar = new int[]{1,2,3};
            System.out.println(sayilar[3]);
        }catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception);
        }
        catch (StringIndexOutOfBoundsException exception) {
            System.out.println(exception);
        }
        catch (Exception exception) { // Her türlü hata için. Çünkü tüm hataların base Exception'dır.
            System.out.println("Loglandı: "+exception);
        }
    }
}