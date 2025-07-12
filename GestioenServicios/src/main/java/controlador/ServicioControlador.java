/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import dao.*;
import java.util.List;
import modelo.*;
/**
 *
 * @author BrayanOcampo
 */
public class ServicioControlador {
    
     private ServicioDAO servicioDAO;

    public ServicioControlador(ServicioDAO dao) {
        this.servicioDAO = dao;
    }

    // Registrar un nuevo servicio
    public void registrarServicio(String cliente, String tipoProblema) {
        Servicio nuevo = new Servicio(cliente, tipoProblema);
        servicioDAO.agregarServicio(nuevo);
    }

    // Asignar un técnico usando solo el ID
    public void asignarTecnico(int idServicio, int idTecnico) {
        servicioDAO.asignarTecnico(idServicio, idTecnico);
    }

    // Cambiar el estado de un servicio
    public void cambiarEstado(int idServicio, String nuevoEstado) {
        servicioDAO.cambiarEstado(idServicio, nuevoEstado);
    }

    // Eliminar un servicio si ya fue finalizado
    public void eliminarFinalizado(int idServicio) {
        servicioDAO.eliminarServicioFinalizado(idServicio);
    }

    // Consultar todos los servicios asignados a un técnico
    public List<Servicio> consultarPorTecnico(int idTecnico) {
        return servicioDAO.obtenerServiciosPorTecnico(idTecnico);
    }

    // Obtener todos los servicios registrados
    public List<Servicio> listarTodos() {
        return servicioDAO.obtenerTodos();
    }
}

