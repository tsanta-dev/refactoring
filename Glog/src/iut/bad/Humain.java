package iut.bad;

public class Humain {
    protected String nom;
    protected String prenom;
    protected int age;
    
    public void details() {
        System.out.println("Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age);
    }
}
