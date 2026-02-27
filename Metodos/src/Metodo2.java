/*Faça um método para seus colegas mais próximos
O método deve imprimir:
O nome dele(a) é [nome]
Ele(a) tem [idade] anos
Ele(a) é estudante de desenvolvimento de sistemas
(Em prints separados)
Faça com que o método seja o nome do seu colega.
O usuário deve entrar com o nome da pessoa para escolher um dos métodos a ser
executado.
*/
public class Metodo2 {

    public void nome(String nome){
        System.out.println("O nome dele(a) é: "+nome);
    }

    public void idade(int idd){
        System.out.println("Ele(a) tem "+idd+" anos");
    }

    public void estudante(){
        System.out.println("Ele(a) é estudante de desenvolvimento de sistemas");
    }
}
