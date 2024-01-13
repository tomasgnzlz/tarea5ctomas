/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Objects;

/**
 *
 * @author tomas
 */
public class Vehiculo {

    // Declaración de atributos.
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private int cv;

    // Constructor vacío.
    public Vehiculo() {
    }

    // Constructor con parametros.
    public Vehiculo(String matricula, String marca, String modelo, String color, int cv) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cv = cv;
    }

    // Constructor copia.
    public Vehiculo(Vehiculo origen) {
        this.matricula = origen.matricula;
        this.marca = origen.marca;
        this.modelo = origen.modelo;
        this.color = origen.color;
        this.cv = origen.cv;
    }

    // Getters y Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    // toString.
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehiculo{");
        sb.append("matricula=").append(matricula);
        sb.append(", marca=").append(marca);
        sb.append(", modelo=").append(modelo);
        sb.append(", color=").append(color);
        sb.append(", cv=").append(cv);
        sb.append('}');
        return sb.toString();
    }

    // Equals & HashCode.
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.matricula);
        hash = 43 * hash + Objects.hashCode(this.marca);
        hash = 43 * hash + Objects.hashCode(this.modelo);
        hash = 43 * hash + Objects.hashCode(this.color);
        hash = 43 * hash + this.cv;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehiculo other = (Vehiculo) obj;
        if (this.cv != other.cv) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        return Objects.equals(this.color, other.color);
    }

}
