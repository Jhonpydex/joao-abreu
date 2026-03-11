import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodo2 mt = new Metodo2();
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        mt.nome(nome);
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        mt.idade(idade);
        mt.estudante();
    }
}
