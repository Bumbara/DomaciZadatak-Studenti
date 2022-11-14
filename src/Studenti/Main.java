package Studenti;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> studenti = new ArrayList<Student>();
        ArrayList<Student> uspesniStudenti = new ArrayList<Student>();

        String prekid = " ";
        while (!prekid.equals("Quit")) {
            System.out.println("Unesi ime, prezime i ocenu studenta: ");
            Scanner scanner = new Scanner(System.in);
            String imeStudenta = scanner.nextLine();
            String prezimeStudenta = scanner.nextLine();
            int ocenaStudenta = scanner.nextInt();

            System.out.println("Podaci studenta: " + imeStudenta + " " + prezimeStudenta + " " + ocenaStudenta);

            Student dodavanjeStudenata = new Student(imeStudenta, prezimeStudenta, ocenaStudenta);
            studenti.add(dodavanjeStudenata);

            if (ocenaStudenta > 5) {
                Student studentiKojiSuPolozili = new Student(imeStudenta, prezimeStudenta, ocenaStudenta);
                uspesniStudenti.add(studentiKojiSuPolozili);
            }

            System.out.println("Uneti 'Da' za nastavak ili 'Quit' za prekid unosa studenata");
            Scanner noviScanner = new Scanner(System.in);
            String noviprekid = noviScanner.next();
            prekid = noviprekid;
        }

        System.out.println("Lista svih studenata: ");
        for (int i = 0; i < studenti.size(); i++) {
            System.out.println("Podaci o studentu: " + studenti.get(i));
        }

        System.out.println("Lista studenata koji su polozili: ");
        for (int i = 0; i < uspesniStudenti.size(); i++) {
            System.out.println("Podaci o studentu: " + uspesniStudenti.get(i));
        }
    }
}
