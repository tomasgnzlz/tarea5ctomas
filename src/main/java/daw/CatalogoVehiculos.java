/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author tomas
 */
public class CatalogoVehiculos {

    // Declaración de atributos.
    private ArrayList<Vehiculo> listaVehiculos;

    // Constructor predeterminado;
    public CatalogoVehiculos() {
        // Crea una lista vacia,sin parametros.
        this.listaVehiculos = new ArrayList<>();
    }

    // Size de la lista
    public int numeroElementos() {
        return this.listaVehiculos.size();
    }

    // Método que devuelve si está vacío el catalogo de vehiculos o no. 
    public boolean estáVacio() {
        return this.listaVehiculos.isEmpty();
    }

    // Método que imprime el vehiculo que está en una posicíon concreta del catálogo.
    public Vehiculo verElemento(int posicion) {
        Vehiculo vAux = new Vehiculo();
        for (int i = 0; i < listaVehiculos.size(); i++) {
            vAux = listaVehiculos.get(posicion);
        }
        return vAux;
    }

    // Método que remplaza un elemento por el otro. 
    public void cambiarElemento(int posicion, Vehiculo vAux) {
        for (int i = 0; i < listaVehiculos.size(); i++) {
            listaVehiculos.set(posicion, vAux);
        }
    }

    // Método que guarda/añade elementos al final del catálogo de vehiculos. 
    public void guardarElementos(Vehiculo v) {
        listaVehiculos.add(v);
    }

    // Método que elimina el objeto que se encuentra en la posicion indicada. 
    public void eliminarElemento(int posicion) {
        listaVehiculos.remove(posicion);
    }

    // Método que elimina el objeto si se encuentra. 
    public void eliminarElemento(Vehiculo v) {
        for (int i = 0; i < listaVehiculos.size(); i++) {
            if (listaVehiculos.get(i).equals(v)) {
                listaVehiculos.remove(i);
            }
        }
    }

    // Método que elimina los objetos que se encuentran en la lista que pasa.
    public void eliminarElemento(ArrayList<Vehiculo> lista) {
        listaVehiculos.removeAll(lista);
    }

    // Método que elimina el catálogo entero. 
    public void eliminarTodos() {
        listaVehiculos.removeAll(listaVehiculos);
    }

    // Método que imprime todos los elementos del catálogo
    public void imprimirCatalogo() {
        int contador = 1;
        for (Vehiculo listaVehiculo : listaVehiculos) {
            System.out.println(contador++ + " - " + listaVehiculo.toString());
        }
    }

    // Método que devuelve la posición en la que se encuentra un elemento 
    // que se pasa como parámetro.
    public int buscarElementos(Vehiculo v) {
        return listaVehiculos.indexOf(v);
    }

    // Métodos de ordenación.
    public void ordenarPorMarca() {
        Comparator<Vehiculo> porMarca = (v1, v2) -> v1.getMarca().compareToIgnoreCase(v2.getMarca());
        Collections.sort(listaVehiculos, porMarca);
    }

    public void ordenarPorCV() {
        Comparator<Vehiculo> porCV = (v1, v2) -> Integer.compare(v1.getCv(), v2.getCv());
        Collections.sort(listaVehiculos, porCV);
    }

    // Método que realiza una busqueda binaria. 
    public int buscarElemento(Vehiculo v) {
        return Collections.binarySearch(listaVehiculos, v, (v1, v2) -> v1.getModelo().compareToIgnoreCase(v2.getModelo()));
    }

}
