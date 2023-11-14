// Overriding
public class Main {
    public static void main(String[] args) {
            BaseKrediManager[] KrediManagers = new BaseKrediManager[]{new TarımKrediManager(), new OgrenciKrediManager(),
                                                new OgretmenKrediManager()};

            for(BaseKrediManager krediManager : KrediManagers){
                System.out.println(krediManager.hesapla(1000));
            }
    }
}