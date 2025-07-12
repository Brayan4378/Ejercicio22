/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.util.ArrayList;
import java.util.List;
import modelo.*;
/**
 *
 * @author BrayanOcampo
 */

public class ServicioDAOImpl extends ServicioDAO {

     // Lista que guarda todos los servicios registrados
    private List<Servicio> servicios = new ArrayList<>();

    // Contador para generar IDs automaticos
    private int contadorId = 1;

@Override
    public void agregarServicio(Servicio s) {
        // Asigna un ID unico al servicio y lo agrega a la lista
        s.setId(contadorId++);
        servicios.add(s);
    }
   
@Override
    public List<Servicio> obtenerServiciosPorTecnico(int idTecnico) {
        // Crea una lista para guardar los servicios del tecnico buscado
        List<Servicio> resultado = new ArrayList<>();
        // Recorre todos los servicios
        for (Servicio s : servicios) {
            // Si el ID del tecnico asignado coincide, lo agrega al resultado
            if (s.getIdTecnicoAsignado() == idTecnico) {
                resultado.add(s);
            }
        }
        return resultado;
    }

@Override
    public void cambiarEstado(int idServicio, String nuevoEstado) {
        // Busca el servicio por ID y cambia su estado
        for (Servicio s : servicios) {
            if (s.getId() == idServicio) {
                s.setEstado(nuevoEstado);
                break;
            }
        }
    }

@Override
    public void eliminarServicioFinalizado(int idServicio) {
        // Elimina el servicio solo si su estado es "Finalizado"
        servicios.removeIf(s -> s.getId() == idServicio && s.getEstado().equalsIgnoreCase("Finalizado"));
    }

@Override
    public List<Servicio> obtenerTodos() {
        // Devuelve una copia de la lista de todos los servicios
        return new ArrayList<>(servicios);
    }

@Override
    public void asignarTecnico(int idServicio, int tecnico) {
        // Busca el servicio por ID y asigna el tecnico
        for (Servicio s : servicios) {
            if (s.getId() == idServicio) {
                s.setIdTecnicoAsignado(tecnico);
                break;
            }
        }
    }
}


