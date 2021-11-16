package testarcalculadora;

import java.util.Scanner;

public class Testarcalculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int inicio=1;
        int op = 0;
        calculadora c1=new calculadora();
        do{
            while(op<=4){
            System.out.println(" Digite a operaçao!:\n\f(1)para adiçao\n\f(2)para subtraçao\n\f(3)para multiplicaçao\n\f(4)para a divisao");
            op = entrada.nextInt(); 
            switch(op){
        case 1:
        System.out.println(" \fDigite os numeros para a adiçao:");
        c1.setN1(entrada.nextDouble());
        c1.setN2(entrada.nextDouble());
        c1.CalcularAdiçao();        
        c1.setN3(entrada.nextDouble());
        c1.CalcularAdiçao();   
        c1.setN4(entrada.nextDouble());
        c1.CalcularAdiçao();
        break;
            case 2:
        System.out.println(" \fDigite os numeros para a Subtraçao:");
        c1.setN1(entrada.nextDouble());
        c1.setN2(entrada.nextDouble());
        c1.CalcularSubtraçao();
        c1.setN3(entrada.nextDouble());
        c1.CalcularSubtraçao();
        c1.setN4(entrada.nextDouble());
        c1.CalcularSubtraçao();
        break;
        
            case 3:
        System.out.println(" \fDigite os numeros para a multiplicaçao:");        
        c1.setN1(entrada.nextDouble());
        c1.setN2(entrada.nextDouble());
        c1.CalcularMultiplicaçao();
        c1.setN3(entrada.nextDouble());
        c1.CalcularMultiplicaçao();
        c1.setN4(entrada.nextDouble());
        c1.CalcularMultiplicaçao();
        break;
        
            case 4:
        System.out.println(" \fDigite os numeros para a Divisao:");        
        c1.setN1(entrada.nextDouble());
        c1.setN2(entrada.nextDouble());
        c1.CalcularDiviçao();
        break;
                }
            }
        }while(inicio!=1);
    }
    private String op;
    
}