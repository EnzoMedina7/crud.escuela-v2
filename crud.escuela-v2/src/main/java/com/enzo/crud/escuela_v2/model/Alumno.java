package com.enzo.crud.escuela_v2.model;

import jakarta.persistence.*;

@Entity
@Table(name = "alumnos")
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombres;
    private String apellidos;
    private String dni;
    private String domicilio;
    private String celular;
    private String curso;
    private Double notacuantitativa;

    public Alumno() {
    }

    // Constructor opcional
    public Alumno(String nombres, String apellidos, String dni, String domicilio, String celular, String curso, Double notacuantitiva, String Notacualitativa) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.domicilio= domicilio;
        this.celular = celular;
        this.curso = curso;
        this.notacuantitativa = notacuantitiva;

    }
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombres() { return nombres;}
    public void setNombres(String nombres) { this.nombres = nombres; }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public String getDomicilio() { return domicilio; }
    public void setDomicilio(String direccion) { this.domicilio = domicilio; }

    public String getCelular() { return celular; }
    public void setCelular(String celular) { this.celular = celular; }

    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }

    public Double getNotacuantitativa() { return notacuantitativa; }
    public void setNotacuantitativa(Double notacuantitativa) { this.notacuantitativa = notacuantitativa; }

}

