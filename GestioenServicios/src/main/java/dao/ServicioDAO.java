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
    
   public abstract void agregarServicio(Servicio s);
   
   public abstract void cambiarEstado(int idServicio, String nuevoEstado);
   
   public abstract void eliminarServicioFinalizado(int idServicio);
   
   public abstract List<Servicio> obtenerTodos();
   
   public abstract void asignarTecnico(int idServicio, int tecnico);
   
   public abstract List<Servicio> obtenerServiciosPorTecnico(int idTecnico);
}
