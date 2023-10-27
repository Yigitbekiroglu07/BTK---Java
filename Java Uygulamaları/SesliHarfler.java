// ince ya da kalın harfi bulma
public class SesliHarfler {
    public static void main(String[] args) {
        char sesliHarf = 'A';
            switch(sesliHarf) {
                case 'A':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println("Kalın sesli harf");
                    break;
                default:
                    System.out.println("İnce sesli harf");
            }


    }
}