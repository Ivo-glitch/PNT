
package entidades;


/**
 * @author Ivan Sotelo
 */

public class Producto implements Comparable{
    
    protected String nombreProducto;
    protected Double precio;

    public Producto(){
        
    }

    public Producto( String nombreProducto, Double precio ) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    

    @Override
    public String toString() {
        return "Nombre: " + nombreProducto + "/// Precio: $" + precio;
    }

    



    @Override
    public int compareTo(Object t) {
        Producto producto = (Producto) t;
        return this.precio.compareTo(producto.getPrecio());
    }
    
    
}
