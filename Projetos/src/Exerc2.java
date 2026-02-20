import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do Vendedor: ");
        String vendedor = sc.nextLine();
        System.out.println("Digite o seu Salário fixo: ");
        double salFixo = sc.nextDouble();
        System.out.println("Digite o total que Vendeu no mês: ");
        double adicional = sc.nextDouble();
        double comissao = adicional * 0.15;
        double salFinal = comissao + salFixo;
        System.out.println("Nome do Vendedor: "+vendedor);
        System.out.println("Salário Fixo: "+salFixo);
        System.out.printf("Salário com Comissão: R$%.2f",salFinal);
    }
}
