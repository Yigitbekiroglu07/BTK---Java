//Inheritance
public class Inheritance {
    public static void main(String[] args) {
        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        KrediUI krediUI = new KrediUI();
        /* BaseKrediManager OğretmenKredi ve TarımKredi'nin referansı olduğu için krediUI.KrediHesapla
        içine ne yazarsak yazalım hata vermyecektir. */
        krediUI.KrediHesapla(new BaseKrediManager());
    }
}
