public class Metodo11 {
    private int[] numero = {4,21,45,2,73,4};
    private int soma;
    private int maior;
    private int menor;
    public double media;
public String calcularVetor() {
    for (int i = 0; i < numero.length; i++) {
        soma += numero[i];
        if (i == 0) {
            maior = numero[i];
            menor = numero[i];
        } else if (maior < numero[i]) {
            maior = numero[i];
        } else if (menor > numero[i]) {
            menor = numero[i];
        }
    }
    media = soma / numero.length;
    return String.format("Maior: %d\nMenor: %d\nMedia: %.2f", maior, menor, media);
}
}
