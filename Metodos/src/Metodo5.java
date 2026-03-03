/*Faça um método que receba três números inseridos pelo usuário, esses números
serão: um número "base" e mais dois outros números que o usuário inseriu
Imprima qual dos dois últimos números está mais perto do primeiro número "base"*/
public class Metodo5 {
    private int numero;

    public void calculo(int base, int n1, int n2){
        this.numero = base;
        int op1 = Math.abs(numero - n1);
        int op2 = Math.abs(numero - n2);
        if(op1 < op2){
            System.out.println("Numero mais perto: "+n1);
        }else if(op2 < op1 ){
            System.out.println("Numero mais perto: "+n2);
        }else{
            System.out.println("Numeros tem diferença igual");
        }
    }
}
