package BMI;
import java.util.Scanner;
public class Bmi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kg, boy, bmi;

        System.out.println("Kütlenizi kilogram cinsinden giriniz:");
        kg = input.nextDouble();

        System.out.println("Boyunuzu metre cinsinden giriniz: ");
        boy = input.nextDouble();

        bmi = kg / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz (BMI) : " + bmi);




    }
}
