/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.carnetizacion.modelo;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author json
 */
@ManagedBean(name="registroDB")
@RequestScoped
public class registroEstudiantes {

    /**
     * Creates a new instance of registroEstudiantes
     */
    private String nombres;
    private String apellidos;
    private Long tipoIdentificacion;
    private Integer nIdentificacion;
    private String dirección;
    private String correo;
    private Integer nTelefonico;
    private int curso;
    private int grado;
    private String institucion="Institución Educativa Simón Bolivar";
    private Date fechaCreacion;

    public String getInstitucion() {
        return institucion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    

//    public registroEstudiantes() {
//    }
//    
    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Long getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(Long tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public Integer getnIdentificacion() {
        return nIdentificacion;
    }

    public void setnIdentificacion(Integer nIdentificacion) {
        this.nIdentificacion = nIdentificacion;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getnTelefonico() {
        return nTelefonico;
    }

    public void setnTelefonico(Integer nTelefonico) {
        this.nTelefonico = nTelefonico;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }
}
