package models.entity;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author SARA CARDENAS
 */
@ManagedBean
@RequestScoped
public class MedicoEntity {

    private Long idMedico;
    private String nombres;
    private String apellidos;
    private List<TipoEspecialidadEntity> especialidad;
     
    public MedicoEntity() {
    }

    public Long getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Long idMedico) {
        this.idMedico = idMedico;
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

    public List<TipoEspecialidadEntity> getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(List<TipoEspecialidadEntity> especialidad) {
        this.especialidad = especialidad;
    }
    
}
