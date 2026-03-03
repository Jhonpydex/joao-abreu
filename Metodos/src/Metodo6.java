/*George Lucas utiliza uma fórmula para criar os nomes dos personagens em suas
histórias (Jar Jar Binks, ObiWan Kenobi, etc).
A fórmula, supostamente, é:
Seu primeiro nome na série Star Wars:
i.Pegue as três primeiras letras de seu sobrenome
ii.Adicione a ele as duas primeiras letras de seu nome
Seu sobrenome na série Star Wars:
i.Pegue as duas primeiras letras do sobrenome de solteira de sua mãe
ii.Adicione a ele as três primeiras letras do nome da cidade onde você nasceu
Crie um método chamado generateStarWarsName que gera um nome completo Star
Wars conforme descrito.
Imprima o seu nome Star Wars
As entradas serão os nomes completos.
Para separar, por exemplo as três primeiras letras do seu sobrenome, use o método
.substring() das Strings
*/
public class Metodo6 {
    private String primeiroNome;
    private String sobrenome;
    private String mae;
    private String cidade;

    public void generateStarWarsName(String primeiroNome, String sobrenome, String mae, String cidade){
        String name = sobrenome.substring(0,3) + primeiroNome.substring(0,2);
        System.out.println("Seu primeiro nome na série Star Wars: "+name);
        String sobre = mae.substring(0,2) + cidade.substring(0,3);
        System.out.println("Seu sobrenome na série Star Wars: "+ sobre);
    }
}
