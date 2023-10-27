
public class MiniProjeAsalSayi {
    public static void main(String[] args) {
        int number = -2;
        boolean isPrime = true;
            if(number<1) {
                System.out.println("Gecersiz sayi");
                return;
            }
            if(number==1) {
                System.out.println("sayi asal değildir");
        // return ifadesini sayıyı tekrar döndürmemesi için kullandım
                return;
            }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {

                isPrime = false;
            }
        }
            if (isPrime) {
                System.out.println("sayi asaldir");

            }


                else{
            System.out.println("sayi asal degildir");
        }
    }
}



