package J1000;

import java.util.ArrayList;


    public class Pacjent {
        private String imie;
        private String nazwisko;
        private ArrayList<String> listaChorob = new ArrayList<>();
        private ArrayList<String> listaPacjentow=new ArrayList<>();

        public Pacjent(String imie, String nazwisko) {
            this.imie = imie;
            this.nazwisko = nazwisko;
        }

        public String getImie() {
            return imie;
        }

        public void setImie(String imie) {
            this.imie = imie;
        }

        public String getNazwisko() {
            return nazwisko;
        }

        public void setNazwisko(String nazwisko) {
            this.nazwisko = nazwisko;
        }

        public ArrayList<String> getListaChorob() {
            return listaChorob;
        }

        public void setListaChorob(String listaChorob) {
            this.listaChorob.add(listaChorob);
        }

        @Override
        public String toString() {
            return "Pacjenci{" +
                    "imie='" + imie + '\'' +
                    ", nazwisko='" + nazwisko + '\'' +
                    ", listaChorob=" + listaChorob +
                    '}';
        }
    }


