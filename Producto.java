package shoponline;

public abstract class Producto {
    protected String desc;
    protected double precio;
    
    public Producto(String d, double p){
        this.desc = d;
        this.precio = p;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString(){
        return this.desc + ".........$ " + this.getPrecio();
    }
    
    public abstract double getPrecio();
    
}
