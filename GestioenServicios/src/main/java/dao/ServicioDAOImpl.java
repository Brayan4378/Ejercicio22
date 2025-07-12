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

    private List<Servicio> servicios = new ArrayList<>();
    private int contadorId = 1;

    @Override
    public void agregarServicio(Servicio s) {
        s.setId(contadorId++);
        servicios.add(s);
    }

    @Override
    public List<Servicio> obtenerServiciosPorTecnico(int idTecnico) {
        List<Servicio> resultado = new ArrayList<>();
        for (Servicio s : servicios) {
            if (s.getIdTecnicoAsignado()== idTecnico) {
                resultado.add(s);
            }
        }
        return resultado;
    }

    @Override
    public void cambiarEstado(int idServicio, String nuevoEstado) {
        for (Servicio s : servicios) {
            if (s.getId() == idServicio) {
                s.setEstado(nuevoEstado);
                break;
            }
        }
    }

    @Override
    public void eliminarServicioFinalizado(int idServicio) {
        servicios.removeIf(s -> s.getId() == idServicio && s.getEstado().equalsIgnoreCase("Finalizado"));
    }

    @Override
    public List<Servicio> obtenerTodos() {
        return new ArrayList<>(servicios);
    }

    @Override
    public void asignarTecnico(int idServicio, int tecnico) {
    for (Servicio s : servicios) {
        if (s.getId() == idServicio) {
            s.setIdTecnicoAsignado(tecnico);
            break;
        }
    }
}
}
