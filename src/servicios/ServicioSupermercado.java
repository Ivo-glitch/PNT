
package servicios;

import entidades.ArticuloDeHigiene;
import entidades.Bebida;
import entidades.Producto;
import entidades.Verduleria;
import java.util.ArrayList;
import java.util.Collections;


/**
 * @author Ivan Sotelo
 */

public class ServicioSupermercado{
    
    public Bebida crearBebida( String nombreProducto, Double precio, Double litros){
        return new Bebida(nombreProducto,precio,litros);
    }
    
    public ArticuloDeHigiene crearArticuloHigiene( String nombreProducto, Double precio, Double contenido){
        return new ArticuloDeHigiene(nombreProducto, precio, contenido);
    }
    
    public Verduleria crearArticuloVerduleria(String nombreProducto, Double precio, String unidadDeVenta){
        return new Verduleria(nombreProducto,precio,unidadDeVenta);
    }
    
    public ArrayList<Producto> cargarListaDeProductos(){
        ArrayList<Producto> productos = new ArrayList();
        
        productos.add(this.crearBebida("Coca-Cola Zero", 20D, 1.5));
        
        productos.add(this.crearBebida("Coca-Cola", 18D, 1.5));
        
        productos.add(this.crearArticuloHigiene("Shampoo Sedal", 19D, 500D));
        
        productos.add(this.crearArticuloVerduleria("Frutillas", 64D, "kilo"));
        
        return productos;
    }
    
    public void imprimirDatos(){
        ArrayList<Producto> productos = this.cargarListaDeProductos();
        
        for (Producto producto : productos) {
            System.out.println(producto.toString());
        }
        
        System.out.println("=============================");
        
        Collections.sort(productos);
        
        System.out.println("Producto más caro: "+productos.get(productos.size()-1).getNombreProducto());
        System.out.println("Producto más barato: "+productos.get(0).getNombreProducto());
        
    }

}
