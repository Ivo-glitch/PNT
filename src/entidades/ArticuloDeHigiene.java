
package entidades;


/**
 * @author Ivan Sotelo
 */

public class ArticuloDeHigiene extends Producto{
    private Double contenido;

    public ArticuloDeHigiene(){
        
    }
    
    public ArticuloDeHigiene( String nombreProducto, Double precio, Double contenido) {
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
        return "Nombre: "+super.nombreProducto + " /// Contenido: " + String.format("%.0f",contenido) +"ml /// Precio: "+ String.format("$%.0f", super.precio);
    }


    public int compareTo(ArticuloDeHigiene higiene) {
        return this.precio.compareTo(higiene.getPrecio());
    }
}
