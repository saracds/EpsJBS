package utilidades;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author SARA CARDENAS
 */
@ManagedBean
@RequestScoped
public class UtilidadesJBS {

    private Date fechaActual= new Date();
            
    public UtilidadesJBS() {
    }

    public Date getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(Date fechaActual) {
        this.fechaActual = fechaActual;
    }
    
}
