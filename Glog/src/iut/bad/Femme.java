package iut.bad;

public class Femme extends Humain {
    public Femme(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public Femme() {
    }
    
    public static void main(String[] args) {
        Homme h = new Homme("Jean", "Dupont", 30);
        Femme f = new Femme("Marie", "Durand", 28);

        f.ami(h);
        h.ami(f);

        f.details();
        h.details();
    }

}
