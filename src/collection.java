public class collection {
    public static void main(String[] args) {
        Ustensile[] us = new Ustensile[5];
        us[0] = new AssietteRonde(1926, 8.4);
        us[1] = new Cuillere(1881, 7.3);
        us[2] = new AssietteCarree(1935, 5.6);
        us[3] = new Cuillere(1917, 8.8);
        us[4] = new AssietteRonde(1837, 5.4);
        Ustensile u=new Cuillere(1917,8.8);
        afficherCuilleres(us);
        afficherSurfaceAssiettes(us);
        afficherValeurTotale(us);
        afficherCollection(us);
        System.out.println(rechercheUstensile(us,u));
    }
        public static void afficherCollection (Ustensile[]us){
            for (int i = 0; i < us.length; i++) {
                us[i].afficher();
            }
        }
        public static void afficherCuilleres(Ustensile[] us){
            int c=0;
            for (int i = 0; i < us.length; i++) {
                if (us[i] instanceof Cuillere) {
                    c++;
                }
        }
            System.out.println(" il ya "+c+" cuilleres");
        }

        public static void afficherValeurTotale(Ustensile[] us){
            double s=0;
            for (int i = 0; i < us.length; i++) {
                s=s+us[i].valeur();
            }
            System.out.println(" totale valeur est "+s);
        }
        public static void afficherSurfaceAssiettes(Ustensile[] us){
            double s=0;
            for (int i = 0; i < us.length; i++) {
                if (us[i] instanceof Assiette){
                    s=s+((Assiette) us[i]).surface();
                }
            }
            System.out.println(" totale surface est "+s);
        }
        public static boolean rechercheUstensile(Ustensile[] us,Ustensile u){
            for (int i = 0; i < us.length; i++) {
                if (us[i].equals(u)) {
                    return true;
                }
            }
            return false;
        }
}



