/*Faça um programa que descubra:
a) O maior elemento de um vetor
b) O menor elemento de um vetor
c) A média dos valores
        (Criar um método para cada questão)*/
public class Metodo4 {
    private int maior = 0;
    private int menor;
    private double media = 0;
    private int soma = 0;

    public void maiorElemento(int lenght,int valor[]){
        for(int i = 0; i<lenght;i++){
            if(valor[i] > maior){
                maior = valor[i];
            }
        }
        System.out.println("Maior numero: "+maior);
    }

    public void menorElemento(int lenght,int valor[]){
        for(int i = 0; i<lenght;i++){
            if(i == 0){
                menor = valor[i];
            }
            else if(valor[i] < menor){
                menor = valor[i];
            }
        }
        System.out.println("Menor numero: "+menor);
    }

    public void mediaValores(int lenght,int valor[]){
        for(int i = 0;i<lenght;i++){
            soma += valor[i];
        }
        media = soma / lenght;
        System.out.printf("Média: %.2f\n",media);
    }
}
