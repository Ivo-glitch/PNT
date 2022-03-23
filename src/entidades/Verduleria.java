
package entidades;


/**
 * @author Ivan Sotelo
 */

public class Verduleria extends Producto{
    private String unidadDeVenta;

    public Verduleria(){
        
    }
    
    public Verduleria( String nombreProducto, Double precio, String unidadDeVenta) {
        super(nombreProducto, precio);
        this.unidadDeVenta = unidadDeVenta;
    }

    public String getUnidadDeVenta() {
        return unidadDeVenta;
    }

    public void setUnidadDeVenta(String unidadDeVenta) {
        this.unidadDeVenta = unidadDeVenta;
    }

    @Override
    public String getNombreProducto() {
        return nombreProducto;
    }

    @Override
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    @Override
    public Double getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Nombre: " +super.nombreProducto+" /// Precio: " +String.format("$%.0f", super.precio)+ " /// Unidad de venta: " + unidadDeVenta;
    }    
    
}
