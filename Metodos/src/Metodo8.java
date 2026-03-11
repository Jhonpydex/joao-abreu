public class Metodo8 {
    private double media;
    private double soma;

    public String media(double nota1,double nota2,double nota3){
        soma = nota1 + nota2 + nota3;
        media = soma / 3;
        return String.format("Média: %.2f",media);
    }
}
