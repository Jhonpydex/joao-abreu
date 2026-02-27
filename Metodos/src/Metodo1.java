/*1)
Faça um programa em que o usuário entre com um número de 1 a 4
Com o número 1 sendo verão, 2 sendo outono...
Dependendo de o que o usuário informa, imprima:
É verão
E o tempo está quente
Ou
É inverno
E está frio
Faça um método para cada estação do ano*/
public class Metodo1 {

    public void estacoes(int numero){
        switch (numero){
            case 1:
                verao();
                break;
            case 2:
                primavera();
                break;
            case 3:
                outono();
                break;
            case 4:
                inverno();
                break;
            default:
                System.out.println("Numero inválido!");
        }
    }
    public void verao(){
        System.out.println("É Verão, o clima está quente!");
    }

    public void primavera(){
        System.out.println("É primavera, Caem as folhas!");
    }

    public void outono(){
        System.out.println("É Outono, as folhas abrocham!");
    }

    public void inverno(){
        System.out.println("É Inverno, a neve cai!");
    }
}
