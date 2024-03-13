import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException { // Kapatılacak dosya bulunamadığında hata vermemesi için
        BufferedReader reader = null;
        int total = 0;
        try {
            reader = new BufferedReader(new FileReader("C:\\javademos\\readingFileDDemo\\src\\sayilar.txt"));
            String line = null; // Okuncak data olmayabilir
            while((line = reader.readLine())!= null){
                total += Integer.valueOf(line);
            }
            System.out.println("Toplam: "+total);
        } catch (FileNotFoundException e) { // Dosyayı bulamadığında vereceği hata
            throw new RuntimeException(e);
        }finally{
            reader.close(); // Dosya kapatmak için
        }
    }
}