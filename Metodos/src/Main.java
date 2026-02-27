import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Metodo1 mt = new Metodo1();
        System.out.println("Digite 1 - Verão\n2 - Primavera\n3 - Outono\n4 - Inverno: ");
        int numero = sc.nextInt();
        mt.estacoes(numero);*/
        Metodo2 mt2 = new Metodo2();
        /*System.out.println("Digite o nome do Aluno: ");
        String nome = sc.nextLine();
        System.out.println("Digite a idade: ");
        int idd = sc.nextInt();
        mt2.nome(nome);
        mt2.idade(idd);
        mt2.estudante();*/
        /*Metodo3 mt3 = new Metodo3();
        mt3.crescente(6);*/
        Metodo4 mt4 = new Metodo4();
        int[] numeros  = new int[5];
        for(int i = 0; i< numeros.length;i++){
            System.out.println("Digite o vetor "+(i+1)+":");
            int n = sc.nextInt();
            numeros[i] = n;
        }
        mt4.maiorElemento(numeros.length,numeros);
        mt4.menorElemento(numeros.length,numeros);
        mt4.mediaValores(numeros.length,numeros);
    }
}
