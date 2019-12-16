package com.examenes.bsd.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "usuario")
public class User implements Serializable {
    private static final long serialVersionUID = 796927332411193911L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido_materno")
    private String apellidoMaterno;

    @Column(name = "apellido_paterno")
    private String apellidoPaterno;

    @Column(name = "email")
    private String email;

    @Column(name = "estado")
    private boolean estado;

    @Column(name = "contrasena")
    private String contrasena;

   /* @JoinColumn(name = "id_rol")
    @ManyToOne(fetch = FetchType.LAZY)
    @OrderBy("id")
    private UserRol userRol;*/

    @Column(name = "id_rol")
    private String userRol;

    @Column(name = "id_tipo_usuario")
    private Long tipoUsuario;

    /*@OneToMany(mappedBy = "usuario")
    @OrderBy("id")
    private List<UsuarioExamen> relUsuarioExamen;*/
/*
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    @OrderBy("id")
    private Set<RespuestasLog> respuestasLogs;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    @OrderBy("id")
    private Set<Resultados> resultados;*/

    public User() {
    }

    public User(String nombre, String apellidoMaterno, String apellidoPaterno, String email, boolean estado) {
        this.nombre = nombre;
        this.apellidoMaterno = apellidoMaterno;
        this.apellidoPaterno = apellidoPaterno;
        this.email = email;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

   /* public UserRol getUserRol() {
        return userRol;
    }

    public void setUserRol(UserRol userRol) {
        this.userRol = userRol;
    }

    public Long getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(Long tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public List<UsuarioExamen> getRelUsuarioExamen() {
        return relUsuarioExamen;
    }

    public void setRelUsuarioExamen(List<UsuarioExamen> relUsuarioExamen) {
        this.relUsuarioExamen = relUsuarioExamen;
    }

    public Set<RespuestasLog> getRespuestasLogs() {
        return respuestasLogs;
    }

    public void setRespuestasLogs(Set<RespuestasLog> respuestasLogs) {
        this.respuestasLogs = respuestasLogs;
    }

    public Set<Resultados> getResultados() {
        return resultados;
    }

    public void setResultados(Set<Resultados> resultados) {
        this.resultados = resultados;
    }
*/

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidoMaterno='" + apellidoMaterno + '\'' +
                ", apellidoPaterno='" + apellidoPaterno + '\'' +
                ", email='" + email + '\'' +
                ", estado=" + estado +
                ", contrasena='" + contrasena + '\'' +
                ", userRol='" + userRol + '\'' +
                ", tipoUsuario=" + tipoUsuario +
                '}';
    }
}
