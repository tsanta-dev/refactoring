package iut.bad;

public class Humain {
    protected String nom;
    protected String prenom;
    protected int age;
    
    @Override
    public String toString() {
        return "Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age;
    }
    
    public void details() {
        // on appelle toString() au lieu de répéter le texte
        System.out.println(this.toString());
    }
}
