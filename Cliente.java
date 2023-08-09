package shoponline;

public class Cliente {
    private String nombre;
    private int cuit;
    
    public Cliente(String n, int c){
        this.nombre = n;
        this.cuit = c;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }
    
    public void imprimirCliente(){
        System.out.println("Cliente: " + this.nombre + ", CUIT: " + this.cuit);
    }
}
