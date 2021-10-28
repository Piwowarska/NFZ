package J1000;

        import java.util.ArrayList;
        import java.util.Scanner;

public class PrzychodnieController{

    Scanner sc = new Scanner(System.in);
    ArrayList<Przychodnie> listaPrzychodni = new ArrayList<>();
    ArrayList<Pacjent> listaPacjentow = new ArrayList<>();

    public void menuPrzychodnia() {

        boolean start = true;
        String nazwa, miasto, nazwisko, imie, choroba, przychodnia;
        while (start) {
            System.out.println("Witaj w przychodni");
            System.out.println("Wybierz menu");
            System.out.println("1-Dodaj przychodnie");
            System.out.println("2-Usun przychodnie");
            System.out.println("3-Dodaj pacjenta do przychodni");
            System.out.println("4-Usun pacjenta z przychodni");
            System.out.println("5-Lista przychodni");
            System.out.println("6-Lista pacjentow w przychodni");
            //
            System.out.println("7-Koniec programu");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {

                case 1:
                    System.out.println("Dodaj przychodnie");
                    System.out.println("Podaj nazwe przychodni:");
                    nazwa = sc.nextLine();
                    System.out.println("Podaj miasto przychodni: ");
                    miasto = sc.nextLine();
                    this.dodajPrzychodnie(nazwa, miasto);
                    break;
                case 2:
                    System.out.println("Usun przychodnie");
                    System.out.println("Podaj nazwe przychodni:");
                    nazwa = sc.nextLine();
                    this.usunPrzychodnie(nazwa);
                    break;
                case 3:
                    System.out.println("Dodaj pacjenta do przychodni:");
                    System.out.println("Podaj nazwe przychodni:");
                    przychodnia = sc.nextLine();
                    System.out.println("Podaj imie pacjenta");
                    imie = sc.nextLine();
                    System.out.println("Podaj nazwisko pacjenta:");
                    nazwisko = sc.nextLine();
                    //System.out.println("Podaj chorobe pacjenta:");
                    //choroba=sc.nextLine();
                    this.dodajPacjentaDoPrzychodni(przychodnia, imie, nazwisko);
                    break;
                case 4:
                    System.out.println("Usun pacjenta z przychodni");
                    System.out.println("Podaj nazwe przychodni:");
                    przychodnia = sc.nextLine();
                    System.out.println("Podaj nazwisko pacjenta:");
                    nazwisko = sc.nextLine();
                    this.usunPacjentaPrzychodni(przychodnia, nazwisko);
                    break;
                case 5:
                    System.out.println("Lista przychodni");
                    this.listaPrzychodni();
                    break;
                case 6:
                    System.out.println("Lista pacjentow w przychodni");
                    System.out.println("Podaj nazwe przychodni:");
                    przychodnia = sc.nextLine();
                    this.listaPacjentowPrzychodni(przychodnia);
                    break;
                case 7:
                    start = false;
                    System.out.println("Koniec programu");
                    break;
                default:
                    System.out.println("Nierozpoznana opcja menu");

            }
        }
    }

    public void menuPacjent() {

        boolean start = true;
        String nazwisko, przychodnia, choroba;
        while (start) {
            System.out.println("Witaj w pacjencie");
            System.out.println("Wybierz menu");
            System.out.println("1-dodaj chorobe pacjentowi");
            System.out.println("2-Wyswietl liste chorob pacjenta");
            System.out.println("3-Koniec programu");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {

                case 1:
                    System.out.println("Podaj nazwe przychodni:");
                    przychodnia = sc.nextLine();
                    System.out.println("Podaj nazwisko pacjenta: ");
                    nazwisko = sc.nextLine();
                    System.out.println("Podaj chorobe pacjenta:");
                    choroba = sc.nextLine();
                    this.dodajChorobe(przychodnia, nazwisko, choroba);
                    break;
                case 2:
                    System.out.println("Podaj nazwe przychodni:");
                    przychodnia = sc.nextLine();
                    System.out.println("Podaj nazwisko pacjenta:");
                    nazwisko = sc.nextLine();
                    this.listaChorobPacjenta(przychodnia, nazwisko);
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

    public void dodajPrzychodnie(String nazwa, String miasto) {
        Przychodnie przychodnie = new Przychodnie(nazwa, miasto);
        this.listaPrzychodni.add(przychodnie);
    }

    public void usunPrzychodnie(String nazwa) {
        for (Przychodnie x : this.listaPrzychodni) {
            if (x.getNazwa().equals(nazwa)) {
                this.listaPrzychodni.remove(x);
            }
            //?????????????????????????????
            //Chcem dodac zabezpieczenie przed tym jak wpiszemy nieprawidłową nazwe przychodni, obecny kod nie działa
        // else
                //if (!(x.getNazwa().equals(nazwa))) {
                   // System.out.println("Nie ma takiej nazwy przychodni");
                    //System.out.println("Wpisz poprawna nazwe");
               // }

            break;
        }
    }
//????????????????????????????????????????????
//chcem by dla kazdej przychodni wyswietlala sie lista pacjentow,traz wyswietla mi sie zawsze lista chorych pierwszej przychodni
    public void dodajPacjentaDoPrzychodni(String przychodnia, String imie, String nazwisko) {
        for (Przychodnie x : this.listaPrzychodni) {
            if (x.getNazwa().equals(przychodnia)) {
                Pacjent pacjent = new Pacjent(imie, nazwisko);
                this.listaPacjentow.add(pacjent);
            }
                           break;
            }
        }
    public void usunPacjentaPrzychodni(String przychodnia, String nazwisko) {

        for (Przychodnie x : this.listaPrzychodni) {
            if (x.getNazwa().equals(przychodnia)) {
                for (Pacjent y : x.getListaPacjentow()) {
                    if (y.getNazwisko().equals(nazwisko)) {
                        x.removePacjent(y);
                    }
                 //   else if (!(y.getNazwisko().equals(nazwisko))) {
                    //    System.out.println("Nie ma takiej nazwy przychodni");
                     //   System.out.println("Wpisz poprawna nazwe");

                  //  }
                   // else if (!(x.getNazwa().equals(przychodnia))) {
                       // System.out.println("Nie ma takiej nazwy przychodni");
                       // System.out.println("Wpisz poprawna nazwe");
                   // }

                        }
                    }
                      break;
                    }
                }

    public void listaPrzychodni() {
        for (Przychodnie x : this.listaPrzychodni) {
            System.out.println(x.getNazwa());
        }
    }

    public void listaPacjentowPrzychodni(String przychodnia) {
       // for (Przychodnie x : this.listaPrzychodni) {
           // if (x.getNazwa().equals(przychodnia)) {
                //ArrayList<Pacjent> listaPacjentow = new ArrayList<>();
                 for (Pacjent y : this.listaPacjentow) {
                     System.out.println(y.getNazwisko());
                     System.out.println(y.getImie());
                }
            }

    public void dodajChorobe(String przychodnia, String nazwisko, String choroba) {
        for (Przychodnie x : this.listaPrzychodni) {
            if (x.getNazwa().equals(przychodnia)) {
                for (Pacjent y : x.getListaPacjentow()) {
                    if (y.getNazwisko().equals(nazwisko)) {
                        y.setListaChorob(choroba);
                        break;
                    }
                }
            }
        }
    }

    public void listaChorobPacjenta(String przychodnia, String nazwisko) {
        for (Przychodnie x : this.listaPrzychodni) {
            if (x.getNazwa().equals(przychodnia)) {
                for (Pacjent y : x.getListaPacjentow()) {
                    if (y.getNazwisko().equals(nazwisko)) {
                        System.out.println(y.getListaChorob());
                        break;
                    }
                }
            }
        }
    }
}
