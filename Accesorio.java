package shoponline;

import javax.swing.JOptionPane;

public class Accesorio extends Producto implements Importable {
    private double peso;
    private String metal;

    public Accesorio(String d, double p, double peso, String m){
        super(d, p);
        this.peso = peso;
        this.metal = m;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }
    
    @Override
    public void arancelAduanero(){
        precio += 10*precio/100;
        JOptionPane.showMessageDialog(null, "Arancel Aduanero: " + precio);
    }
    
    @Override
    public void arancelTransporte(){
        precio += 2*precio/100;
        JOptionPane.showMessageDialog(null, "Arancel de Transporte: " + precio);
    }
    
    @Override
    // NO olvidar referenciar al objeto (this)
    public double getPrecio() {
        if(metal.equalsIgnoreCase("oro")){
            this.precio = 100;
        }
        else if(metal.equalsIgnoreCase("plata")){
            this.precio = 25;
        }
        else if(metal.equalsIgnoreCase("acero")){
            this.precio = 50;
        }
        precio = precio * peso;
        this.arancelAduanero();
        this.arancelTransporte();
        return precio;
    }
    
    @Override
    public String toString(){
        return super.toString() + " (" + peso + "g, " + metal + ")";
    }
    
}
