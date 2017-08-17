/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vinos3;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "CARRITO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Carrito.findAll", query = "SELECT c FROM Carrito c")
    , @NamedQuery(name = "Carrito.findByIdCompra", query = "SELECT c FROM Carrito c WHERE c.idCompra = :idCompra")
    , @NamedQuery(name = "Carrito.findByFkidUsuario", query = "SELECT c FROM Carrito c WHERE c.fkidUsuario = :fkidUsuario")
    , @NamedQuery(name = "Carrito.findByFkidProducto", query = "SELECT c FROM Carrito c WHERE c.fkidProducto = :fkidProducto")})
public class Carrito implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_COMPRA")
    private Integer idCompra;
    @Column(name = "FKID_USUARIO")
    private Integer fkidUsuario;
    @Column(name = "FKID_PRODUCTO")
    private Integer fkidProducto;

    public Carrito() {
    }

    public Carrito(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Integer getFkidUsuario() {
        return fkidUsuario;
    }

    public void setFkidUsuario(Integer fkidUsuario) {
        this.fkidUsuario = fkidUsuario;
    }

    public Integer getFkidProducto() {
        return fkidProducto;
    }

    public void setFkidProducto(Integer fkidProducto) {
        this.fkidProducto = fkidProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCompra != null ? idCompra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carrito)) {
            return false;
        }
        Carrito other = (Carrito) object;
        if ((this.idCompra == null && other.idCompra != null) || (this.idCompra != null && !this.idCompra.equals(other.idCompra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "vinos3.Carrito[ idCompra=" + idCompra + " ]";
    }
    
}
