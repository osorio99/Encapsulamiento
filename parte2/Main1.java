package producto;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main1 {
    public static void main(String [] args) {
        ArrayList<Producto1> listaProductos = new ArrayList<>();

        listaProductos.add(new Producto1("Frijoles", 4500,20));
        listaProductos.add(new Producto1("Lentejas", 6500,15));
        listaProductos.add(new Producto1("Sal", 7000,35));
        listaProductos.add(new Producto1("Crema de dientes", 6200,13));


        for( Producto1 prod: listaProductos) {
            prod.mostrarProducto();
            System.out.println("---------------");
        }

        listaProductos.get(2).setPrecio(7200);

        listaProductos.remove(3);


        System.out.println("\n>>>>>>Lista de productos<<<<<");
        for(Producto1 prod: listaProductos) {
            prod.mostrarProducto();
            System.out.println("---------------");

        }


        System.out.println("\n <<<<  Consula  de productos>>>");
        String nombreBusqueda=JOptionPane.showInputDialog("Ingrese el nombre del producto");

         for(Producto1 prod: listaProductos) {
                if(prod.getNombre().equals(nombreBusqueda)) {
                    System.out.println("\nProducto encontrado:");
                    prod.mostrarProducto();
                    return; // Finaliza el programa al encontrar el producto
                }
            }
    }
}