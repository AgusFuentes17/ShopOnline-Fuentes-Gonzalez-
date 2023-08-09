package shoponline;

public class Pantalon extends Producto{
    
   private int talle;
   private String modelo;
   
   public Pantalon(String d, double p, int t, String m){
       super(d, p);
       this.talle = t;
       this.modelo = m;
   }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTalle() {
        return talle;
    }

    public void setTalle(int talle) {
        this.talle = talle;
    }

    @Override
    public double getPrecio() {
        if(modelo.equalsIgnoreCase("Oxford")){
            precio += precio*15/100;
        }
        else if(modelo.equalsIgnoreCase("Skinny")){
            precio += precio*25/100;
        }
        else if(modelo.equalsIgnoreCase("Recto")){
            precio -= precio*15/100;
        }
        
        return precio;
    }
   
   @Override
    public String toString(){
      return super.toString() + " (talle:" + this.talle + ")";
    }
   
}
