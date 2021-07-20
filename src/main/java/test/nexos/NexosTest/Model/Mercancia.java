package test.nexos.NexosTest.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "MERCANCIAS")
public class Mercancia implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nombre_producto")
    private String nombreProducto;

    @Column(name = "cantidad")
    private Integer cantidad;

    @Column(name = "fecha_ingreso")
    private Date fechaIngreso;

    @Column(name = "fk_usuario_registro")
    private Long usuarioReg;

    @Column(name = "fecha_mod")
    private Date fechaMod;

    @Column(name = "fk_usuario_mod")
    private Long usuarioMod;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Long getUsuarioReg() {
        return usuarioReg;
    }

    public void setUsuarioReg(Long usuarioReg) {
        this.usuarioReg = usuarioReg;
    }

    public Date getFechaMod() {
        return fechaMod;
    }

    public void setFechaMod(Date fechaMod) {
        this.fechaMod = fechaMod;
    }

    public Long getUsuarioMod() {
        return usuarioMod;
    }

    public void setUsuarioMod(Long usuarioMod) {
        this.usuarioMod = usuarioMod;
    }

    private static final long serialVersionUID = -6940237118028496924L;
}
