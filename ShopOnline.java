package shoponline;

import java.time.LocalDate;
import java.util.Scanner;

public class ShopOnline {

    public static void main(String[] args){
        Cliente c = crearCliente();
        Venta v = crearVenta(c);
        v = hacerVariasVentas(v);
    }
    
    
    public static Producto hacerRemera(){
        Scanner teclado = new Scanner(System.in); 
        
        System.out.println("Ingrese el talle: ");
        char talle = teclado.next().charAt(0);
        
        Producto r = new Remera("Remera", 2000, talle);
        return r;
    }
    
    public static Producto hacerPantalon(){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el talle: ");
        int talle = teclado.nextInt();
        
        System.out.println("Ingrese el modelo de Pantalon: Oxford, Skinny, Recto\n");
        String modelo = teclado.next();
        
        Producto p = new Pantalon("Pantalon", 2000, talle, modelo);
        return p;
    }
    
    public static Producto hacerAccesorio(){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el peso: ");
        double peso = teclado.nextDouble();
        
        System.out.println("Ingrese el metal de la Cadena: Plata, Acero, Oro\n");
        String metal = teclado.next();
        
        Producto a = new Accesorio("Cadena", 2000, peso, metal);
        return a;
    }
    
    public static Cliente crearCliente(){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        String nombre = teclado.next();
        
        System.out.println("Ingrese su CUIT: ");
        int cuit = teclado.nextInt();
        
        Cliente c = new Cliente(nombre, cuit);
        
        return c;
    }
    
    public static Venta crearVenta(Cliente c){
        LocalDate fecha = LocalDate.now();
        Venta v = new Venta(fecha, c);
        
        return v;
    }
    
    public static Venta realizarVenta(Venta v){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese que producto quiere comprar: ");
        String descripcion = teclado.next();
        
        if(descripcion.equalsIgnoreCase("Remera")){
            Producto p = hacerRemera();
            v.agregarProducto(p);
        }
        else if(descripcion.equalsIgnoreCase("Pantalon")){
            Producto p = hacerPantalon();
            v.agregarProducto(p);
        }
        else if(descripcion.equalsIgnoreCase("Cadena")){
            Producto p = hacerAccesorio();
            v.agregarProducto(p);
        }
        return v;
    }
    
    public static Venta agregarVenta(Venta v){
        Scanner teclado = new Scanner(System.in);
        int opc = 1;
        while(opc==1){
            v = realizarVenta(v);
            System.out.println("¿Quiere seguir agregando productos o no? 1-Si, 2-No: ");
            opc = teclado.nextInt();
        }
        v.imprimirFactura();
        return v;
    }
    
    public static Venta hacerVariasVentas(Venta v){
        Scanner teclado = new Scanner(System.in);
        int opc = 1;
        while(opc==1){
            v = agregarVenta(v);
            System.out.println("¿Quiere hacer otra venta o no? 1-Si, 2-No: ");
            opc = teclado.nextInt();
        }
        return v;
    }
}
