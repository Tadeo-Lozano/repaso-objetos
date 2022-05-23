package uaslp.objetos.figuras;

import static java.lang.Math.tan;
import static java.lang.Math.tanh;

public class PoligonoRegular extends Figura{
    private int numeroDeLados;
    private double lado;
    private double ap;

    public PoligonoRegular(int numeroDeLados){
        super("Poligono Regular");
        if(numeroDeLados<5){
            throw new NumeroInvalidoDeLados("Número de lados válido a partir de 5");
        }
        this.numeroDeLados = numeroDeLados;
    }

    public PoligonoRegular(int numeroDeLados, double lado){
        super("Poligono Regular");
        this.numeroDeLados = numeroDeLados;
        this.lado = lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    public double getArea(){
        double grados;
        double rad;

        grados = 360/(numeroDeLados*2);
        rad=Math.toRadians(grados);
        ap = lado/(2*tan(rad));

        return ((numeroDeLados*lado)*ap)/2;
    }

    public double getLado(){
        return lado;
    }
}
