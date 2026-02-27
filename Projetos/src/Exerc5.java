import java.util.Scanner;

public class Exerc5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o numero de Matricula( 0 para encerrar: ");
        String matricula = sc.next();

        System.out.println("Digite altura do Atleta: ");
        double altura = sc.nextDouble();

        double atletaMA = Double.MIN_VALUE;
        double atletaMB = Double.MAX_VALUE;
        String matriculaMA = "";
        String matriculaMB = "";

        double somaAltura =0;
        int qntdAtletas = 0;
        while(!matricula.equals("0")){

            somaAltura += altura;
            qntdAtletas++;
            System.out.println("Digite o numero de Matricula( 0 para encerrar: ");
            matricula = sc.next();

            System.out.println("Digite a altura do Atleta: ");
            altura = sc.nextDouble();


        }

    }
}
