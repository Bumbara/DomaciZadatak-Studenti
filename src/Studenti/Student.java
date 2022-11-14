package Studenti;

public class Student {

    String ime;
    String prezime;
    int ocena;

    public Student(String ime, String prezime, int ocena){
        this.ime = ime;
        this.prezime = prezime;
        if (ocena < 5 || ocena > 9) {
            System.out.println("Uneli ste pogresnu ocenu!");
        } else {
            this.ocena = ocena;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", ocena=" + ocena +
                '}';
    }
}
