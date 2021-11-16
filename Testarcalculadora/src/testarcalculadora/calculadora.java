    
package testarcalculadora;

public class calculadora {


    private double n1;
    private double n2;
    private double n3;
    private double n4;
    private double ressultado;
    
    //construtor
    public calculadora(){
        this.n1= 0.0;
        this.n2= 0.0;
        
    }
    public void CalcularAdiçao(){
        ressultado = ( n1+n2+n3+n4);
            System.out.println("O resultado da Adiçao É: "+ressultado);
    }
    public void CalcularSubtraçao(){
        ressultado = ( n1-n2-n3-n4);
            System.out.println("O resultado da Subtraçao: "+ressultado);
    }
    public void CalcularMultiplicaçao(){
            System.out.println("Digite um numero diferente de zero!");
        ressultado = ( n1*n2*n3*n4);
            System.out.println("O resultado da Multiplicaçao: "+ressultado);
    }
    public void CalcularDiviçao(){
        if(n1==0 || n2==0){
            System.out.println("Digite um numero diferente de zero!");
        }else{         
        ressultado= ( n1/n2);
            System.out.println(" O resultado da Divisao: "+ressultado);
        }

    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    public double getN4() {
        return n4;
    }

    public void setN4(double n4) {
        this.n4 = n4;
    }

}
