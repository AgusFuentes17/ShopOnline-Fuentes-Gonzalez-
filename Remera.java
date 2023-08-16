package shoponline;

public class Remera extends Producto {
    private Talles talle;
    
    public Remera(String d, double p, Talles t){
        super(d,p);
        this.talle = t;
    }

    public Talles getTalle() {
        return talle;
    }

    public void setTalle(Talles talle) {
        this.talle = talle;
    }

    @Override
    public double getPrecio() {
        switch(talle){
            case S: precio += 5*precio/100;
            break;
            
            case M: precio += 10*precio/100;
            break;
            
            case L: precio += 15*precio/100;
            break;
            
            case XL: precio += 20*precio/100;
            break;
        }
        
        return precio;
    }
    
    @Override
    public String toString(){
        return super.toString() + " (talle:" + this.talle + ")";
    }
}
