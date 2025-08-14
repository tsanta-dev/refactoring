package iut.bad;

public class Homme extends Humain {

    @Override
    public String toString() {
        return "Homme: " + nom + " " + prenom + ", Âge: " + age;
    }

    public Homme(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
}
