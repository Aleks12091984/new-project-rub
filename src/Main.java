// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double money;
        System.out.print("Введите дробное число:");
        Scanner kb = new Scanner(System.in);
        money = kb.nextDouble();
        System.out.print(money);
        int rub = (int)money;
        int cop = (int)((money-rub)*100);
        System.out.printf(" руб - это %d руб., %d коп.\n", rub, cop);


        /*Scanner ab = new Scanner(System.in);
        System.out.println("Вычисление стоимости покупки");
        System.out.print("Введите исходные данные: \n" );
        System.out.print("Цена тетради (грн.) ");
        double NotebookPrice = ab.nextDouble();
        System.out.print("Количество тетрадей ");
        double NumberNotebooks = ab.nextDouble();
        System.out.print("Цена карандаша (грн.) ");
        double PencilPrice = ab.nextDouble();
        System.out.print("Количество карандашей ");
        double NumberPensil = ab.nextDouble();
        System.out.println("Стоимость покупки " + (NotebookPrice * NumberNotebooks + PencilPrice *  NumberPensil) + " грн.");*/
    }
}