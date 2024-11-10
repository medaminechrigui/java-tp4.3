public abstract class Assiette extends Ustensile{
    public Assiette(int anneef) {
        super(anneef);
    }
    @Override
    public String toString() {
        return super.toString() ;
    }
    public void afficher() {
        System.out.println(toString());
    }
    public abstract double surface();
    public abstract double valeur();
    public abstract boolean equals(Object o);
}
