package uaslp.objetos.escuela;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvaluadorDePromediosAdapter {
    private EvaluadorDePromedios promedios;

    public EvaluadorDePromediosAdapter(EvaluadorDePromedios promedios) {
        this.promedios = promedios;
    }

    public double evalua(String calis){

        List<String> calificacionesString = Arrays.asList(calis.split(","));
        List<Double> calificaciones = new ArrayList<>();
        for (String calificacion : calificacionesString)
        {
            calificaciones.add(Double.parseDouble(calificacion));
        }
        return promedios.evalua(calificaciones);
    }
}
