import java.util.Scanner;

public class Exerc3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Digite sua altura: ");
        double altura =sc.nextDouble();
        System.out.println("Digite seu peso: ");
        double massa = sc.nextDouble();
        double imc = massa /(altura * altura);
        System.out.println("IMC: "+imc);
        if(imc < 18.5){
            System.out.println("Magreza");
        }else if(imc>= 18.5 || imc <= 24.9){
            System.out.println("Saudável");
        }else if(imc>= 25 || imc <= 29.9){
            System.out.println("Sobrepeso");
        } else if (imc>= 30 || imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (imc>= 35 || imc <= 39.9) {
            System.out.println("Obesidade Grau II (severa)");
        }else{
            System.out.println("Obesidade Grau III (morbida)");
        }
    }
}
