/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiendaService;

import Servicios.TiendaService;
import java.util.Scanner;

/**
 *
 * @author Lemmon
 */
public class TiendaServicie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      TiendaService tiendaService = new TiendaService();
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            mostrarMenu();
            int opcion = obtenerOpcion(scanner);
            switch (opcion) {
                case 1:
                    agregarProducto(scanner, tiendaService);
                    break;
                case 2:
                    modificarPrecio(scanner, tiendaService);
                    break;
                case 3:
                    eliminarProducto(scanner, tiendaService);
                    break;
                case 4:
                    mostrarProductos(tiendaService);
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
        scanner.close();
        System.out.println("Gracias por utilizar la aplicación de la tienda. ¡Hasta luego!");
    }

    private static void mostrarMenu() {
        System.out.println("---- MENÚ ----");
        System.out.println("1. Agregar producto");
        System.out.println("2. Modificar precio de un producto");
        System.out.println("3. Eliminar producto");
        System.out.println("4. Mostrar productos");
        System.out.println("5. Salir");
    }

    private static int obtenerOpcion(Scanner scanner) {
        System.out.print("Ingrese la opción deseada: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente
        return opcion;
    }

    private static void agregarProducto(Scanner scanner, TiendaService tiendaService) {
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea pendiente

        tiendaService.agregarProducto(nombre, precio);
    }

    private static void modificarPrecio(Scanner scanner, TiendaService tiendaService) {
        System.out.print("Ingrese el nombre del producto a modificar: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el nuevo precio del producto: ");
        double precio = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea pendiente

        tiendaService.modificarPrecio(nombre, precio);
    }

    private static void eliminarProducto(Scanner scanner, TiendaService tiendaService) {
        System.out.print("Ingrese el nombre del producto a eliminar: ");
        String nombre = scanner.nextLine();

        tiendaService.eliminarProducto(nombre);
    }

    private static void mostrarProductos(TiendaService tiendaService) {
        tiendaService.mostrarProductos();
    }
    
}
