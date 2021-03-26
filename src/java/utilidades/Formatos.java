package utilidades;

import javax.faces.context.FacesContext;

/**
 *
 * @author SARA CARDENAS
 */
public class Formatos {
   
    public static String getString (String key) {
        FacesContext context = FacesContext.getCurrentInstance();
        String value = context.getApplication()
                .evaluateExpressionGet(context, key, String.class);
        return value;
    }
}
