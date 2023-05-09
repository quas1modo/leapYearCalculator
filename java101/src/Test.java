import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        // Değişkenler tanımlandı
        int year;

        //Kullanıcıdan girişler alındı
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Year: ");
        year = input.nextInt();

        //Eğer 4'e bölünüp 100'e bölünmüyorsa ya da 400'e bölünüyorsa artık yıl olarak kabul ediyoruz.
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}

