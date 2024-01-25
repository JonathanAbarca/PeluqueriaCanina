
package com.mycompany.peluqueriacanina.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Jonathan Abarca
 */
@Entity //se transforma en entidades para crear las tablas en la BD
public class Mascota implements Serializable {    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int num_Cleinte;
    @Basic//campos extras        
    private String nombre;
    private String raza;
    private String color;
    private String alergico;
    private String atencion_especial;    
    private String observaciones;
    @OneToOne //realción uno a uno como clave foraneo en la BD 
    private Duenio unDuenio;
    
    public Mascota() {
    }

    public Mascota(int num_Cleinte, String nombre, String raza, String color, String alergico, String atencion_especial, Duenio unDuenio, String observaciones) {
        this.num_Cleinte = num_Cleinte;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atencion_especial = atencion_especial;
        this.unDuenio = unDuenio;
        this.observaciones = observaciones;        
    }

    public int getNum_Cleinte() {
        return num_Cleinte;
    }

    public void setNum_Cleinte(int num_Cleinte) {
        this.num_Cleinte = num_Cleinte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String getAtencion_especial() {
        return atencion_especial;
    }

    public void setAtencion_especial(String atencion_especial) {
        this.atencion_especial = atencion_especial;
    }

    public Duenio getUnDuenio() {
        return unDuenio;
    }

    public void setUnDuenio(Duenio unDuenio) {
        this.unDuenio = unDuenio;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
}
