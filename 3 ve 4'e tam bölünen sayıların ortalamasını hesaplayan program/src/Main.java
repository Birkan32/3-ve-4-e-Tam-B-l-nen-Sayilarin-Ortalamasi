import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        int k ,toplam =0 ,adet=0 ;
        double ortalama;

        Scanner input =new Scanner(System.in) ;

        System.out.print("Sayıyı Giriniz :");
        k = input.nextInt();

        for ( int i =1 ; i<=k; i++ ) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(i);
                toplam += i ;
                adet ++;
            }
        }
        System.out.println("Toplam" + adet + "sayı var");
        System.out.println("TOPLAM : " + toplam);
        ortalama = toplam / adet ;
        System.out.println("Ortalama : " + ortalama);

    }
}