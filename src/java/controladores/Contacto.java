package controladores;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import utilidades.Formatos;

/**
 *
 * @author SARA CARDENAS
 */
@ManagedBean
@RequestScoped
public class Contacto {

    /**
     * Creates a new instance of Contacto
     */
    public Contacto() {
        
    }
    
    private String nombreEstudiante;

    /**
     * Get the value of nombreEstudiante
     *
     * @return the value of nombreEstudiante
     */
    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    /**
     * Set the value of nombreEstudiante
     *
     * @param nombreEstudiante new value of nombreEstudiante
     */
    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }
    
    private int DNIEstudiante;

    /**
     * Get the value of DNIEstudiante
     *
     * @return the value of DNIEstudiante
     */
    public int getDNIEstudiante() {
        return DNIEstudiante;
    }

    /**
     * Set the value of DNIEstudiante
     *
     * @param DNIEstudiante new value of DNIEstudiante
     */
    public void setDNIEstudiante(int DNIEstudiante) {
        this.DNIEstudiante = DNIEstudiante;
    }
    
    public String getSaludo() {
//        return "Hola " + this.nombreEstudiante + ", su DNI es: " + this.DNIEstudiante;
        return  Formatos.getString("#{msg['app_m1']} ")
                + this.nombreEstudiante
                + Formatos.getString(" #{msg['app_m2']} ")
                + this.DNIEstudiante;
    }
}










