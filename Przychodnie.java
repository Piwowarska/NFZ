package J1000;

import java.util.ArrayList;

    public class Przychodnie {
        private String nazwa;
        private String miasto;
        private ArrayList<Pacjent> listaPacjentow = new ArrayList<>();

        public Przychodnie(String nazwa, String miasto) {
            this.nazwa = nazwa;
            this.miasto = miasto;
        }

        public String getNazwa() {
            return nazwa;
        }

        public void setNazwa(String nazwa) {
            this.nazwa = nazwa;
        }

        public String getMiasto() {
            return miasto;
        }

        public void setMiasto(String miasto) {
            this.miasto = miasto;
        }

        public ArrayList<Pacjent> getListaPacjentow() {
            return listaPacjentow;
        }

        public void setListaPacjentow(Pacjent pacjenci) {
            this.listaPacjentow.add(pacjenci);
        }

        public void removePacjent(Pacjent pacjenci) {
            this.listaPacjentow.remove(pacjenci);
        }



        @Override
        public String toString() {
            return "Przychodnie{" +
                    "nazwa='" + nazwa + '\'' +
                    ", miasto='" + miasto + '\'' +
                    ", listaPacjentow=" + listaPacjentow +
                    '}';
        }
    }



