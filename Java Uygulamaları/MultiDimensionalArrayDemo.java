// Multi Dimensional Array Demo
public class MultiDimensionalArrayDemo {
    public static void main(String[] args) {
    String [][] sehirler = new String[3][3];
        sehirler[0][0] = "Ankara";
        sehirler[0][1] = "Kayseri";
        sehirler[0][2] = "Yozgat";
        sehirler[1][0] = "Antalya";
        sehirler[1][1] = "Burdur";
        sehirler[1][2] = "Isparta";
        sehirler[2][0] = "Rize";
        sehirler[2][1] = "Trabzon";
        sehirler[2][2] = "Artvin";

        for(int i=0; i<=2 ; i++){
                System.out.println("-----------------");
            for(int j=0; j<=2; j++){
                System.out.println(sehirler[i][j]);
            }
      }
   }
}

