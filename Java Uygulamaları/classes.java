//Classlar ile Çalışma
// Classların temel özelliği gruplama yapmaktır.
// Classlar referans bilgidir.
// Class yapısını oluşturmak stack ve heap yapılarını oluşturmak demektir.
// new CustomerManager yapısı heap içinde oluşuyor diyebiliriz.
public class classes {
    public static void main(String[] args) {

        CustomerManager customerManager1 = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        /* Alttaki işlemi yaptığımızda customerManager1 işlevini yitirmiş olur. O yüzden 7. satırda new
        CustomerManager yazısı sönük gözükür. */
        customerManager1 = customerManager2;
        customerManager1.Add();
        customerManager1.Remove();
        customerManager1.Update();
        // Aşağıdaki atama değerler stack bölümünde yer alır.
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);
        // Diziler referans tiptir.
        int[] sayilar1 = new int[] {1,2,3};
        int[] sayilar2 = new int[] {4,5,6};
        sayilar2=sayilar1;
        sayilar1[0]=10;
        System.out.println(sayilar1[0]);
    }
}