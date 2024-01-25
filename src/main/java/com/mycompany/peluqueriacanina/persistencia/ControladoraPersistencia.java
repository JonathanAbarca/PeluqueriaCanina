
package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Duenio;
import com.mycompany.peluqueriacanina.logica.Mascota;



/**
 *
 * @author Jonathan Abarca
 */
public class ControladoraPersistencia {
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascotaJpa = new MascotaJpaController();       

    public void guardar(Duenio duenio, Mascota mascota) {
        //crear en la BD el dueño
        duenioJpa.create(duenio);
         //crear en la BD el dueño
        mascotaJpa.create(mascota);
        
    }
}
