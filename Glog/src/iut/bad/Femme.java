package iut.bad;

public class Femme extends Humain {

    @Override
    public String toString() {
        return "Femme: " + nom + " " + prenom + ", Âge: " + age;
    }

    public Femme(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
    
    public static void main(String[] args) {
        Homme h = new Homme("Jean", "Dupont", 30);
        Femme f = new Femme("Marie", "Durand", 28);

        h.details(); // Appelle Homme.toString()
        f.details(); // Appelle Femme.toString()

        Humain hum = h; // référence de type Humain
        System.out.println(hum.toString()); // Appelle Homme.toString() grâce au polymorphisme
    }
}
