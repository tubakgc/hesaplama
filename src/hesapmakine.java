import java.util.Scanner;

public class hesapmakine {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner inp = new Scanner(System.in);

        System.out.print("ilk sayıyı giriniz:");
        n1= inp.nextInt();

        System.out.print("ikinci sayıyı giriniz:");
        n2= inp.nextInt();

        System.out.println("1.toplama\n2.çıkartma\n3çarpma\n4.bölme" );
        System.out.print("seçiniz:");
        select= inp.nextInt();

        switch (select){
            case 1:
                System.out.print("toplam:" + (n1+n2));
            break;

            case 2:
                System.out.print("çıkartma"+ (n1-n2));
                break;

            case 3:
                System.out.print("çarpma"+(n1*n1));
                break;

            case 4:
                if (n2==0 ){
                    System.out.print("bir sayı sıfırı bölmez!");
                }
                    System.out.print("bölme:" + (n1 / n2 ));

                break;

            default:
                System.out.print("hatalı seçim yaptınız");
        }

    }
}
