import java.time.YearMonth;
import java.util.Scanner;

/*Desenvolva um programa em Java que leia separadamente o dia, o mês e o ano de uma data e
verifique se essa data é válida.
A entrada deve ser feita passo a passo:
Primeiro, leia o dia.
Se o dia for inválido (por exemplo, menor que 1 ou maior que 31), o programa deve exibir uma
mensagem de erro e encerrar imediatamente, sem solicitar o mês ou o ano.
Em seguida, leia o mês.
Se o mês for inválido (menor que 1 ou maior que 12), o programa também deve exibir uma
mensagem de erro e encerrar sem ler o ano.
Por fim, leia o ano e determine se a data é válida, considerando:
A quantidade de dias permitidos para cada mês.
O ano bissexto (fevereiro pode ter 29 dias em anos bissextos).
Se todas as partes forem válidas, o programa deve informar: "Data válida".
Caso contrário, deve informar: "Data inválida".*/
public class Exerc4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia: ");
        int dia = sc.nextInt();
        if(dia < 1 || dia > 31){
            System.out.println("Erro: Dia inválido");
        }else{
            System.out.println("Digite o mês: ");
            int mes = sc.nextInt();
            if(mes < 1 || mes > 12){
                System.out.println("Erro: Mês Inválido");
            }else{
                System.out.println("Digite o ano: ");
                int ano = sc.nextInt();
                YearMonth data = YearMonth.of(ano,mes);
                if(data.isLeapYear()){
                    System.out.println("Data válida");
                }else{
                    System.out.println("Erro: Data Inválida");
                }
            }
        }
    }
}
