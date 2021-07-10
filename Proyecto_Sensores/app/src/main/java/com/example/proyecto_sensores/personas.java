package com.example.proyecto_sensores;

public class personas {
    private String nombres;
    private String apellidos;
    private String direccion;
    private String telefono;
    private String email;
    private String password1;
    private String getPassword2;

    public personas(String nombres, String apellidos, String direccion, String telefono, String email, String password1, String getPassword2) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.password1 = password1;
        this.getPassword2 = getPassword2;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public String getGetPassword2() {
        return getPassword2;
    }

    public void setGetPassword2(String getPassword2) {
        this.getPassword2 = getPassword2;
    }
}
