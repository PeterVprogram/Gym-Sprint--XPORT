package com.gym.model;

public class Membresia {

    private String nroRegistro;
    private String condicion;
    private String codigo;
    private String telefono;
    private String nombre;
    private String direccion;
    private String fechaNacimiento;
    private String fechaVencimiento;
    private String responsable;
    private String periodos;
    private int diasLimite;
    private double tarifa;
    private String duracion;
    private String frecuencia;
    private String observacion;
    private String condicionDeuda;

    public Membresia() {
    }

    public String getNroRegistro() { return nroRegistro; }
    public void setNroRegistro(String nroRegistro) { this.nroRegistro = nroRegistro; }

    public String getCondicion() { return condicion; }
    public void setCondicion(String condicion) { this.condicion = condicion; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(String fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public String getFechaVencimiento() { return fechaVencimiento; }
    public void setFechaVencimiento(String fechaVencimiento) { this.fechaVencimiento = fechaVencimiento; }

    public String getResponsable() { return responsable; }
    public void setResponsable(String responsable) { this.responsable = responsable; }

    public String getPeriodos() { return periodos; }
    public void setPeriodos(String periodos) { this.periodos = periodos; }

    public int getDiasLimite() { return diasLimite; }
    public void setDiasLimite(int diasLimite) { this.diasLimite = diasLimite; }

    public double getTarifa() { return tarifa; }
    public void setTarifa(double tarifa) { this.tarifa = tarifa; }

    public String getDuracion() { return duracion; }
    public void setDuracion(String duracion) { this.duracion = duracion; }

    public String getFrecuencia() { return frecuencia; }
    public void setFrecuencia(String frecuencia) { this.frecuencia = frecuencia; }

    public String getObservacion() { return observacion; }
    public void setObservacion(String observacion) { this.observacion = observacion; }

    public String getCondicionDeuda() { return condicionDeuda; }
    public void setCondicionDeuda(String condicionDeuda) { this.condicionDeuda = condicionDeuda; }
}