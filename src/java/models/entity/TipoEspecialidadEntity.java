package models.entity;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author SARA CARDENAS
 */
@ManagedBean
@RequestScoped
public class TipoEspecialidadEntity {

    private Long idTipoEspecialidad;
    private String descripcion;
    private String activo;
    
    public TipoEspecialidadEntity() {
    }

    public Long getIdTipoEspecialidad() {
        return idTipoEspecialidad;
    }

    public void setIdTipoEspecialidad(Long idTipoEspecialidad) {
        this.idTipoEspecialidad = idTipoEspecialidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }
    
}
