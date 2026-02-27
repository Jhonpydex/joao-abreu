/*Faça um programa que exiba o número que o usuário entrou como parâmetro e os 20
números que vem após esse número
        (O parâmetro do método deve ser o número inserido pelo usuário)*/
public class Metodo3 {
    public void crescente(int numero){
        for(int i = 1; i<=20;i++){
            if(i == 1){
                numero++;
            }
            System.out.println(numero++);
        }
    }
}
