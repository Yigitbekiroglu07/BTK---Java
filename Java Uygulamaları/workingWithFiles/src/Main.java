import java.io.File;
import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        getFileInfo();
    }

    public static void CreateFile(){
            File file = new File("C:\\javademos\\files\\students.txt");
            try {
                if(file.createNewFile()){ // student.txt dosyasını oluşturur.
                    System.out.println("Dosya oluşturuldu");
                }else{
                    System.out.println("Dosya zaten mevcut.");
                }
            } catch (IOException e) {
                e.printStackTrace(); // Hatsyı metin olarak basar.
            }
        }
        public static void  getFileInfo(){
            File file = new File("C:\\javademos\\students.txt");
            if(file.exists()){
                System.out.println("Dosya adı:" +file.getName());
                System.out.println("Dosya yolu:" +file.getAbsolutePath());
                System.out.println("Dosya yazılabilir mi? :" +file.canWrite());
                System.out.println("Dosya okunabilir mi?:" +file.canRead());
                System.out.println("Dosya uzunluğu:" +file.length());
            }
        }

}