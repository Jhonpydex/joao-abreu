/*8)
Considere essa matriz:
int[][] matriz = {
 {210, 3, 399900},
 {160, 3, 329900},
 {240, 3, 369000},
 {141, 2, 232000},
 {300, 4, 539900},
 {198, 4, 299900},
 {153, 3, 314900},
 {142, 3, 199000},
 {138, 3, 212000},
 {149, 3, 242500},
 {194, 4, 240000},
 {200, 3, 347000},
 {189, 3, 330000},
 {447, 5, 699900},
 {126, 3, 259900}
 };
A primeira coluna é o tamanho da casa
A segunda coluna é a quantidade de quartos
A terceira coluna é o preço
Determinar:
a) Qual é a média dos preços das casas?
b) Quanto custa a menor casa?
c) Qual a diferença de tamanho da casa com o maior número de quartos para a casa com o
menor número de quartos?
d) Qual a média do tamanho das casas que custam mais de 300.000 mil?*/
public class Exerc8 {
    public static void main(String[] args) {
        int[][] matriz = {
                {210, 3, 399900},
                {160, 3, 329900},
                {240, 3, 369000},
                {141, 2, 232000},
                {300, 4, 539900},
                {198, 4, 299900},
                {153, 3, 314900},
                {142, 3, 199000},
                {138, 3, 212000},
                {149, 3, 242500},
                {194, 4, 240000},
                {200, 3, 347000},
                {189, 3, 330000},
                {447, 5, 699900},
                {126, 3, 259900}
        };
        //a) Qual é a média dos preços das casas?
        double soma = 0;
        int qntd = matriz.length;
        ;
        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][2];
        }
        double media = soma / qntd;
        System.out.printf("Qual é a média dos preços das casas: R$%.2f\n", media);

        double custoMenorCasa = 0;
        int tamanho = 0;
        //b) Quanto custa a menor casa?
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[0][0] == matriz[i][0]) {
                tamanho = matriz[i][0];
                custoMenorCasa = matriz[i][2];
            } else if (tamanho > matriz[i][0]) {
                tamanho = matriz[i][0];
                custoMenorCasa = matriz[i][2];
            }
        }
        System.out.println("Quanto custa a menor casa?");
        System.out.println("Menor Casa: " + tamanho + "m²");
        System.out.printf("Custo menor casa: R$%.2f\n", custoMenorCasa);

        //c) Diferença de tamanho entre:
        double casaMais = matriz[0][1];
        double casaMenos = matriz[0][1];
        int tamanhoMin = matriz[0][0];
        int tamanhoMax = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
           if (matriz[i][1] < casaMenos) {
               tamanhoMin = matriz[i][0];
               casaMenos = matriz[i][1];
            }else if(matriz[i][1] > casaMais){
                tamanhoMax = matriz[i][0];
                casaMais = matriz[i][1];
            }
        }
        System.out.println("Casa com Mais quartos: "+casaMais+"\nTamanho: "+tamanhoMax);
        System.out.println("Casa com Menos quartos: "+casaMenos+"\nTamanho: "+tamanhoMin);

        //d) Média do tamanho das casas que custam mais de 300.000
        double somaTamanho=0;
        int contador = 0;
        for (int i=0; i<matriz.length;i++){
        if(matriz[i][2] > 300000){
            somaTamanho += matriz[i][0];
            contador++;
        }
        }
         media = somaTamanho / contador;
        System.out.println("Média do tamanho das casas: "+media);
    }
}