import model.entities.Iphone;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone(998899778);

        iphone.selecionarMusica("CBJR - Ceú azul");
        iphone.pausar();

        iphone.exibirPagina("Google");
        iphone.adicionarNovaAba();
        iphone.exibirPagina("DIO.ME");
        iphone.atulizarPagina();

        iphone.adicionarContato("JOHN", 988745152);
        iphone.adicionarContato("JOHN", 988745145);
        iphone.adicionarContato("ROSE BACK", 988744457);
        iphone.adicionarContato("GIORGIAN ARRASCAETA", 988741123);
        iphone.adicionarContato("PEDRO CRUZ", 987894214);

        iphone.acharContatoNome("JOHN").forEach(System.out::println);

        System.out.println(iphone.acharContatoNumero(988741123));

    }
}