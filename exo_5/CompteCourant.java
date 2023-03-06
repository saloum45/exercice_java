public class CompteCourant extends CompteBancaireAbstrait{
    private float position;
    private final float decouvert=-20000;

    public CompteCourant(float position) {
        this.position = position;
    }

    public float getPosition() {
        return this.position;
    }

    public void setPosition(float position) {
        this.position = position;
    }

    @Override
    public float solde() {
        // TODO Auto-generated method stub
        return this.position;
    }

    @Override
    public void depot(float somme) {
        // TODO Auto-generated method stub
        this.position+=somme;
    }

    @Override
    public void retrait(float somme) {
        // TODO Auto-generated method stub
        if(this.position>somme || this.position-somme==this.decouvert){
            this.position-=somme;
        }else{
            System.out.println("veuillez saisir un montant < ou egal a votre position");
        }
    }

    @Override
    public float calculerInteret() {
        // TODO Auto-generated method stub
        return 0;
    }
    
    public static void main(String[] args) {
        CompteCourant compte_1=new CompteCourant(0);
        compte_1.depot(20000);
        System.out.println(compte_1.position);
        compte_1.retrait(40000);
        System.out.println(compte_1.position);
    }
}
