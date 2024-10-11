package producto;

public class Main2 {
    public static void main(String [] args) {
        Producto producto= new Producto("Leche", 5500.0, 4);

        producto.mostrarProducto();

        producto.setNombre("Tarrito rojo");
        producto.setPrecio(20000.0);
        producto.setCantidadEnStock(5);

        producto.mostrarProducto();
    }

}
