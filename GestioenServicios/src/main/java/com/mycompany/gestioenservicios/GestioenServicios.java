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
        
    // Crear instancia del DAO que maneja la lista de servicios
    ServicioDAO dao = new ServicioDAOImpl();
    
    // Crear el controlador y pasarle el DAO
    ServicioControlador controlador = new ServicioControlador(dao);
    
    // Crear la ventana principal y pasarle el controlador
    VentanaPrincipal ventana = new VentanaPrincipal(controlador);
    
    // Mostrar la interfaz grafica
    ventana.setVisible(true);
}

}
