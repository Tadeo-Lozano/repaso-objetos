package uaslp.objetos.escuela;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Exercise6{

     /*
    INSTRUCCIONES EJERCICIO 6:

    PARA ESTE EJERCICIO DEBERÁS:
    -> Crear Elementos necesarios para que el programa compile
    -> Lograr un 100% de coverage de la clase AlgoritmoX

    En este ejercicio los tests que crees deberán estar en esta clase, es el UNICO
    ejercicio en el que se te permite modificar el Unit Test, PERO está prohibido
    modificar el test existente "validarInterfacesCreadas"

     */

    @Test
    public void validarAlgoritmoACubrir(){
        //Given
        Dependencia1 d1 = new Dependencia1() {
            @Override
            public void save(String c) {

            }
        };
        Dependencia2 d2;
        Dependencia3 d3;

        AlgoritmoX algoritmoX = new AlgoritmoX(Dependencia1);

        //When

        //Then
    }

    @Test
    public void validarInterfacesCreadas(){
        assertThat(Dependencia1.class).isInterface();
        assertThat(Dependencia2.class).isInterface();
        assertThat(Dependencia3.class).isInterface();
    }
}
