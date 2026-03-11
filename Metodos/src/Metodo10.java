public class Metodo10 {


    public String verificacao(int minimo, int limite, int numero){
        if(numero >= minimo && numero <= limite){
            return String.format(numero+" está nos limites impostos.");
        }else{
            return String.format(numero+" não está nos limites impostos.");
        }
    }
}
