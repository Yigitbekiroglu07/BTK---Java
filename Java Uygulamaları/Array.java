//Array
public  class Array {
    public static void main(String[] args) {
        //Arrays

       String[] ogrenciler = new String[4];
        ogrenciler[0] = "Ahmet";
        ogrenciler[1] = "Bedia";
        ogrenciler[2] = "Umut";
        ogrenciler[3] = "Yigit";
        for(int i=0; i<ogrenciler.length; i++){
            System.out.println(ogrenciler[i]);

        }
            System.out.println("---------------");
        for(String isim:ogrenciler){
            System.out.println(isim);
            //isim diye isimlendirdiğim ogrenciler içini gez, buna takma isim ver demek.
            //isim takma isimdir. Bu yöntem diğer fol ile yapılan yönteme göre daha yaygındır.
        }
    }
}