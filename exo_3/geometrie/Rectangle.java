package exo_3.geometrie;

public class Rectangle extends Forme2D{
    private int Long;
    private int larg;

    public Rectangle(int Long, int larg) {
        this.Long = Long;
        this.larg = larg;
    }

    public int getLong() {
        return this.Long;
    }

    public void setLong(int Long) {
        this.Long = Long;
    }

    public int getLarg() {
        return this.larg;
    }

    public void setLarg(int larg) {
        this.larg = larg;
    }

    @Override
    public double aire() {
        // TODO Auto-generated method stub
        return this.Long*this.larg;
    }

    @Override
    public double perimetre() {
        // TODO Auto-generated method stub
        return (this.Long+this.larg)*2;
    }

    @Override
    public void dessiner() {
        // TODO Auto-generated method stub
        
        for(int i=1;i<=this.Long;i++){
            for(int j=1;j<=this.larg;j++){
               if(i==1 || i==this.Long || j==1 || j==this.larg){
                    System.out.print("*");
               }else{
                    System.out.print(" ");
               }
               
                
            }
            System.out.println();
            
        }
        
    }
    
    public static void main(String[] args) {
        Rectangle salem =new Rectangle(8, 22);
        salem.dessiner();
        System.out.println("aire : "+salem.aire());
        System.out.println("perimetre : "+salem.perimetre());
    }
}
