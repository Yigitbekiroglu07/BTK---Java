public class OgrenciKrediManager extends BaseKrediManager {
    //Öğrenci kredisinin faizinin daha düşük olmasını istiyoruz.
        public double hesapla(double tutar){

            return tutar * 1.10;
        }
}
