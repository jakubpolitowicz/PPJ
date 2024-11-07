package PPJ09.Poprawa.Task04;

public class Osoba {
     String imie;
     String nazwisko;
     int rokUrodzenia;

     public Osoba(String imie, String nazwisko, int rokUrodzenia) {
          this.imie = imie;
          this.nazwisko = nazwisko;
          this.rokUrodzenia = rokUrodzenia;
     }

     public void show(){
          System.out.println(imie + " " + nazwisko + " " + rokUrodzenia);
     }
}