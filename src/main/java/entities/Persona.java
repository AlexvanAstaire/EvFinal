
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "personas")
@NamedQueries({
    @NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p"),
    @NamedQuery(name = "Persona.findById", query = "SELECT p FROM Persona p WHERE p.id = :id"),
    @NamedQuery(
            name = "Persona.findByNombres",
            query = "SELECT p FROM Persona p WHERE p.nombres = :nombres"),
    @NamedQuery(
            name = "Persona.findByApellidos",
            query = "SELECT p FROM Persona p WHERE p.apellidos = :apellidos"),
    @NamedQuery(name = "Persona.findByRut", query = "SELECT p FROM Persona p WHERE p.rut = :rut"),
    @NamedQuery(
            name = "Persona.findByDireccion",
            query = "SELECT p FROM Persona p WHERE p.direccion = :direccion"),
    @NamedQuery(
            name = "Persona.findByCiudad",
            query = "SELECT p FROM Persona p WHERE p.ciudad = :ciudad")
})
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;

    @Size(max = 2147483647)
    @Column(name = "nombres")
    private String nombres;

    @Size(max = 2147483647)
    @Column(name = "apellidos")
    private String apellidos;

    @Size(max = 2147483647)
    @Column(name = "rut")
    private String rut;

    @Size(max = 2147483647)
    @Column(name = "direccion")
    private String direccion;

    @Size(max = 2147483647)
    @Column(name = "ciudad")
    private String ciudad;

    public Persona(
            Integer id,
            String nombres,
            String apellidos,
            String rut,
            String direccion,
            String ciudad) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.rut = rut;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public Persona() {}

    public Persona(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.id == null && other.id != null)
                || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Persona[ id=" + id + " ]";
    }
}
