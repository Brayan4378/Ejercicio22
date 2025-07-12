/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestioenservicios;
import modelo.*;
import dao.*;
import controlador.*;
import vistas.*;
/**
 *
 * @author BrayanOcampo
 */
public class GestioenServicios {

    public static void main(String[] args) {
        
        ServicioDAO dao = new ServicioDAOImpl();
        ServicioControlador controlador = new ServicioControlador(dao);
        VentanaPrincipal ventana = new VentanaPrincipal(controlador); // ✅ así se corrige
        ventana.setVisible(true);
    }
}
