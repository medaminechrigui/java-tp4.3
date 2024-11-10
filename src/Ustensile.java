public abstract class Ustensile {
    protected int anneef;
    public Ustensile(int anneef) {
        this.anneef = anneef;
    }
    @Override
    public String toString() {
        return "anneef= " + anneef;
    }

    public int getAnneef() {
        return anneef;
    }

    public void setAnneef(int anneef) {
        this.anneef = anneef;
    }
    public void afficher() {
        System.out.println(toString());
    }
    public abstract double valeur();
    public abstract boolean equals(Object o);
}

