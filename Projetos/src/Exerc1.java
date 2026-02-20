import java.util.Scanner;

public class Exerc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu numero de Matricula: ");
        int matricula = sc.nextInt();
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite quanto você recebe por hora: ");
        double salPH = sc.nextDouble();
        double salarioFinal = (salPH * 40) * 4;
        System.out.println("Matricula: "+matricula);
        System.out.println("Nome: "+ nome);
        System.out.printf("Salário: %.2f",salarioFinal);
    }
}
