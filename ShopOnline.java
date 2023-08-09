package shoponline;

import java.time.LocalDate;

public class ShopOnline {

    public static void main(String[] args){
       
        Producto p = new Pantalon("Pantalon", 1000, 40, "Oxford");
        Producto a = new Accesorio("Cadena", 500, 100, "oro");
        
        Cliente c = new Cliente("Pedro", 1234567);
        
        LocalDate fecha = LocalDate.now();
        Venta v = new Venta(fecha, c);
        
        v.agregarProducto(p);
        v.agregarProducto(a);
        
        v.imprimirFactura();
    }
    
}
