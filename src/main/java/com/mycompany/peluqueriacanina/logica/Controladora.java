
package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;

/**
 *
 * @author Jonathan Abarca
 */
public class Controladora {

    ControladoraPersistencia controlPeris = new ControladoraPersistencia();

    public void guardar(String nombreMasco, String raza, String color, String obs,
            String alergico, String especial, String nomDuenio, String celDuenio) {
        //Creamos el dueño y asignamos sus valores
        Duenio duenio = new Duenio();
        duenio.setNombre(nomDuenio);
        duenio.setCelDuenio(celDuenio);
        //Creamos la mascota y le asignamos sus valores
        Mascota mascota = new Mascota();
        mascota.setNombre(nombreMasco);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setObservaciones(obs);
        mascota.setAlergico(alergico);
        mascota.setAtencion_especial(especial);
        mascota.setUnDuenio(duenio);
        
        controlPeris.guardar(duenio,mascota);
        
    }
   
}
