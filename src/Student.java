public class Student {
    String Imię;
    String Nazwisko;
    int wiek;
    boolean czykobieta;

    public void displayInfo() {
        System.out.println("Imie:\tNazwisko:\twiek:\tCzy jest kobietą \n" + Imię + "\t" + Nazwisko + "\t" + "\t" + wiek + "\t" + "\t" + czykobieta);
    }
}