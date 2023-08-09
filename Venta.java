package shoponline;

import java.time.LocalDate;
import java.util.ArrayList;

public class Venta {
    private ArrayList<Producto> listaProd;
    private Cliente cliente;
    private static int cantVentas = 1090;
    private int nroFact;
    private LocalDate fecha;
    
    public Venta(LocalDate f, Cliente c){
        this.fecha = f;
        this.cliente = c;
        Venta.cantVentas ++;
        this.nroFact = cantVentas;
        listaProd = new ArrayList();
    }

    public ArrayList<Producto> getListaProd() {
        return listaProd;
    }

    public void setListaProd(ArrayList<Producto> listaProd) {
        this.listaProd = listaProd;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public static int getCantVentas() {
        return cantVentas;
    }

    public static void setCantVentas(int cantVentas) {
        Venta.cantVentas = cantVentas;
    }

    public int getNroFact() {
        return nroFact;
    }

    public void setNroFact(int nroFact) {
        this.nroFact = nroFact;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    public void agregarProducto(Producto p){
        this.listaProd.add(p);
    }
    
    public double calcularImporteTotal(){
        double total = 0;
        for(Producto p:listaProd){
            total += p.precio;
        }
        return total;
    }
    
    public void imprimirFactura(){
        this.cliente.imprimirCliente();
        System.out.println("Factura N°: " + this.nroFact + " - " + this.fecha);
        for(Producto p: listaProd){
            System.out.println(p.toString());         
        }
        System.out.println("Total a pagar:............$ " + calcularImporteTotal());
    }
}
