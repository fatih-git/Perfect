import java.util.Scanner;

/**
 * @author fatih-git
 **/

public class PerfectNumber {

    public static void main(String[] args) {

        int sayi, sum, bolen;
        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen bir sayi girin (0 çıkış yapar.): ");
        sayi=input.nextInt();

        while(sayi!=0){

            sum=0;
            bolen=1;

            while(bolen<sayi){
                if(sayi%bolen==0)
                    sum+=bolen;

                bolen++;
            }

            if(sum==sayi) {
                System.out.println(sayi + " bir mükemmel sayıdır.");
            }
            else {
                System.out.println(sayi + " bir mükemmel sayı değildir.");
            }

            System.out.print("Lütfen bir sayi girin (0 çıkış yapar.): ");
            sayi=input.nextInt();

        }

    }

}
