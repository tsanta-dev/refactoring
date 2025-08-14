package iut.bad;

public class Humain {
    protected String nom;
    protected String prenom;
    protected int age;

    // on supprime toString() de Humain
    public void details() {
        System.out.println(this.toString());
    }
}
