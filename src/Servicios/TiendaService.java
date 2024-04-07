/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Producto;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Lemmon
 */
public class TiendaService {
       private Map<String, Producto> productos;

    public TiendaService() {
        productos = new HashMap<>();
    }

    public void agregarProducto(String nombre, double precio) {
        if (productos.containsKey(nombre)) {
            System.out.println("El producto ya existe en la tienda.");
        } else {
            Producto producto = new Producto(nombre, precio);
            productos.put(nombre, producto);
            System.out.println("Producto agregado correctamente.");
        }
    }

    public void modificarPrecio(String nombre, double nuevoPrecio) {
        if (productos.containsKey(nombre)) {
            Producto producto = productos.get(nombre);
            producto.setPrecio(nuevoPrecio);
            System.out.println("Precio del producto modificado correctamente.");
        } else {
            System.out.println("El producto no existe en la tienda.");
        }
    }

    public void eliminarProducto(String nombre) {
        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
            System.out.println("Producto eliminado correctamente.");
        } else {
            System.out.println("El producto no existe en la tienda.");
        }
    }

    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en la tienda.");
        } else {
            System.out.println("Productos en la tienda:");
            for (Producto producto : productos.values()) {
                System.out.println(producto);
            }
        }
}
}