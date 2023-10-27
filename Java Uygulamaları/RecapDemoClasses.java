//Claas örnek soru
//Classların en temel özelliği ortak operasyonları tutmaktır.
public class RecapDemoClasses {
    public static void main(String[] args) {
        DortIslem hesapMakinesi = new DortIslem();
            int sonuc = hesapMakinesi.Topla(5,7);
            hesapMakinesi.Cıkar(3,8);
            hesapMakinesi.Bol(12,3);
            hesapMakinesi.Carp(4,3);
            System.out.println(sonuc);
            System.out.println(hesapMakinesi.Cıkar(3,8));
            System.out.println(hesapMakinesi.Bol(12,3));
            System.out.println(hesapMakinesi.Carp(4,3));
    }
}