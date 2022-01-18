import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */





                Student st = new Student(new Osoba("Aleksandra","Roman", 14223), WydzialEnum.Rachunkowość);
                Student st1 = new Student(new Osoba("Kamila","Wojnicka", 16789), WydzialEnum.Programowanie);
                Student st2 = new Student(new Osoba("Klaudia","Ptaszek", 89711), WydzialEnum.Rachunkowość);
                Student st3 = new Student(new Osoba("Dawid","Murański", 56789), WydzialEnum.Elktrotechnika);
                Student st4 = new Student(new Osoba("Grzegorz","Piechowicz", 68954), WydzialEnum.Programowanie);

                ArrayList<Student> students = new <Student>ArrayList();
                students.add(st);
                students.add(st1);
                students.add(st2);
                students.add(st3);
                students.add(st4);
                for(Student st5 : students){
                    System.out.println(st5.toString());
                }

    }
}