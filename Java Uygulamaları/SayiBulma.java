//Sayi Bulma
public class SayiBulma {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 5;
        // İlk başta sayı olmadığı için varMı adına false dedim.
        boolean varMi = false;
        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }

        }
        if (varMi) {
            System.out.println("Sayi vardir");
        } else {
            System.out.println("Sayi yoktur");

        }
    }
}