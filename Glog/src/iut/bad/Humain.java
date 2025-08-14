package iut.bad;

public class Humain implements Consommation {
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
    
    @Override
    public void manger() {
        System.out.println(nom + " mange.");
    }

    @Override
    public void boire() {
        System.out.println(nom + " boit.");
    }
}
