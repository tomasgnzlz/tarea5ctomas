/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author tomas
 */
public class Main {

    public static void main(String[] args) {

        // Creo los vehiculos que se incluirán en el catálogo. 
        Vehiculo v1 = new Vehiculo("4587okk", "Seat", "Ibiza", "Negro", 110);
        Vehiculo v2 = new Vehiculo("1234abc", "Ford", "Focus", "Rojo", 120);
        Vehiculo v3 = new Vehiculo("5678xyz", "Chevrolet", "Cruze", "Azul", 100);
        Vehiculo v4 = new Vehiculo("9999zzz", "BMW", "X3", "Blanco", 150);
        Vehiculo v5 = new Vehiculo("7777lll", "Toyota", "Corolla", "Gris", 95);
        Vehiculo v6 = new Vehiculo("1111aaa", "Volkswagen", "Golf", "Plateado", 130);
        Vehiculo v7 = new Vehiculo("2222bbb", "Mercedes-Benz", "C-Class", "Negro", 180);
        Vehiculo v8 = new Vehiculo("3333ccc", "Audi", "A3", "Rojo", 150);
        Vehiculo v9 = new Vehiculo("4444ddd", "Hyundai", "Elantra", "Verde", 110);

        // Creamos un catálogo
        CatalogoVehiculos catalgoo = new CatalogoVehiculos();

        //Probamos los métodos
        System.out.println("¿Cuantos elementos tiene el catálogo? " + catalgoo.numeroElementos());
        System.out.println("¿Está vacío el catalogo? " + catalgoo.estáVacio());
        //relleno el catálogo
        catalgoo.guardarElementos(v1);
        catalgoo.guardarElementos(v2);
        catalgoo.guardarElementos(v3);
        catalgoo.guardarElementos(v4);
        catalgoo.guardarElementos(v5);
        catalgoo.guardarElementos(v6);
        catalgoo.guardarElementos(v7);
        catalgoo.guardarElementos(v8);
        catalgoo.guardarElementos(v9);

        // Muestro el catálogo.
        catalgoo.imprimirCatalogo();
        System.out.println("\n***************VER UN VEHICULO CONCRETO***************\n");
        Vehiculo Aux = catalgoo.verElemento(0);
        System.out.println(Aux);

        System.out.println("\n***************CAMBIAR UN VEHICULO POR OTRO***************\n");
        Vehiculo v10 = new Vehiculo("5555eee", "Mazda", "CX-5", "Azul", 160);
        catalgoo.cambiarElemento(0, v10);
        catalgoo.imprimirCatalogo();
        System.out.println("\n***************BUSQUEDA DE VEHICULO CON INDEX-OF***************\n");
        System.out.println("La posición en la que está v9 es: " + catalgoo.buscarElementos(v9));
        System.out.println("\n***************BUSQUEDA DE VEHICULO CON BUSQUEDA BINARIA***************\n");
        System.out.println("La posición en la que está v9 es: " + catalgoo.buscarElemento(v9));

        System.out.println("\n***************ORDENO EL CATALOGO POR MARCA***************\n");
        catalgoo.ordenarPorMarca();
        catalgoo.imprimirCatalogo();

        System.out.println("\n***************ORDENO EL CATALOGO POR CV***************\n");
        catalgoo.ordenarPorCV();
        catalgoo.imprimirCatalogo();

        System.out.println("\n***************ELIMINO UN VEHICULO CONCRETO***************\n");
        catalgoo.eliminarElemento(v1);
        catalgoo.imprimirCatalogo();
        System.out.println("\n***************ELIMINO EL VEHICULO EN LA POSICION 1***************\n");
        catalgoo.eliminarElemento(1);
        catalgoo.imprimirCatalogo();
        System.out.println("\n***************ELIMINO DEL CATÁLOGO LOS VEHICULOS DE LA LISTA QUE LE PASO***************\n");
        ArrayList<Vehiculo> listaVehiculosEliminar = new ArrayList<>();
        listaVehiculosEliminar.add(v3);
        listaVehiculosEliminar.add(v4);
        listaVehiculosEliminar.add(v5);
        catalgoo.eliminarElemento(listaVehiculosEliminar);
        catalgoo.imprimirCatalogo();
        System.out.println("\n***************ELIMINO TODO EL CATÁLOGO***************\n");
        catalgoo.eliminarTodos();
        catalgoo.imprimirCatalogo();

    }

}
