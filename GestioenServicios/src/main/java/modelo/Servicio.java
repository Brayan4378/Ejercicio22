/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author BrayanOcampo
 */
public class Servicio {

    private int id;
    private String cliente;
    private String tipoProblema;
    private String estado; // "Pendiente", "En curso", "Finalizado"
    private int idTecnicoAsignado;

    // Constructor: no recibe ID ni estado, los asigna internamente o en el DAO
    public Servicio(String cliente, String tipoProblema) {
        this.cliente = cliente;
        this.tipoProblema = tipoProblema;
        this.estado = "Pendiente";         // Estado por defecto
        this.idTecnicoAsignado = -1;       // -1 significa sin técnico asignado aún
    }

    // Getter y Setter para ID (lo asigna el DAO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter y Setter para cliente
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    // Getter y Setter para tipo de problema
    public String getTipoProblema() {
        return tipoProblema;
    }

    public void setTipoProblema(String tipoProblema) {
        this.tipoProblema = tipoProblema;
    }

    // Getter y Setter para estado, con validación
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if (estado.equalsIgnoreCase("Pendiente") ||
            estado.equalsIgnoreCase("En curso") ||
            estado.equalsIgnoreCase("Finalizado")) {
            this.estado = estado;
        } else {
            throw new IllegalArgumentException("Estado inválido. Debe ser: Pendiente, En curso o Finalizado.");
        }
    }

    // Getter y Setter para ID del técnico asignado
    public int getIdTecnicoAsignado() {
        return idTecnicoAsignado;
    }

    public void setIdTecnicoAsignado(int idTecnicoAsignado) {
        this.idTecnicoAsignado = idTecnicoAsignado;
    }

    
}
