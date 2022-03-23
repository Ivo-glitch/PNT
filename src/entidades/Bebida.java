
package entidades;


/**
 * @author Ivan Sotelo
 */

public class Bebida extends Producto{
    
    private Double contenido;
    
    public Bebida(){
        
    }

    public Bebida( String nombreProducto, Double precio, Double contenido) {
        super(nombreProducto, precio);
        this.contenido = contenido;
    }

    public Double getContenido() {
        return contenido;
    }

    public void setContenido(Double contenido) {
        this.contenido = contenido;
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
        return "Nombre: "+super.nombreProducto + " /// Litros: " + contenido + " /// Precio: "+String.format("$%.0f", super.precio);
    }

}
