package J1000;

        import java.util.ArrayList;
        import java.util.Scanner;

public class Run {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        PrzychodnieController przychodnieController = new PrzychodnieController();
        boolean start = true;

        while (start) {
            System.out.println("Witaj ");
            System.out.println("Wybierz menu");
            System.out.println("1-Przychodnia");
            System.out.println("2-Pacjent");
            System.out.println("3-Koniec");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {

                case 1:
                    przychodnieController.menuPrzychodnia();

                    break;
                case 2:
                    przychodnieController.menuPacjent();
                    break;

                case 3:
                    start = false;
                    System.out.println("Koniec programu");
                    break;
                default:
                    System.out.println("Nierozpoznana opcja menu");

            }
        }
    }
}





