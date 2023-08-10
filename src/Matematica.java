public class Matematica {
    public int somar(int numeroA, int numeroB){
        return numeroA + numeroB;
    }
    
    public double calcularAreaQuadrado(double lado) {
        return lado * lado;
    }
    
    public double calcularAreaCirculo(double raio) {
        //PI * raio * raio
        // PI = 3.14
        double area = 3.14 * raio * raio;
        return area;
    
    }
}
