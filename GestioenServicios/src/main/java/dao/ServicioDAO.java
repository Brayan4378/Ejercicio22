/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.util.List;
import modelo.*;

/**
 *
 * @author BrayanOcampo
 */
public abstract class ServicioDAO  {
    
// Agrega un nuevo servicio a la lista
public abstract void agregarServicio(Servicio s);

// Cambia el estado de un servicio segun su ID
public abstract void cambiarEstado(int idServicio, String nuevoEstado);

// Elimina un servicio solo si ya esta finalizado
public abstract void eliminarServicioFinalizado(int idServicio);

// Devuelve una lista con todos los servicios registrados
public abstract List<Servicio> obtenerTodos();

// Asigna un tecnico a un servicio segun su ID
public abstract void asignarTecnico(int idServicio, int tecnico);

// Devuelve todos los servicios que tiene asignado un tecnico
public abstract List<Servicio> obtenerServiciosPorTecnico(int idTecnico);

}
