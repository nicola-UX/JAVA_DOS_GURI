public class Main {
    public static void main(String[] args) {
    Livro StarWars = new Livro("Estrela da morte", "George Lucas", 10, 300.00);

    Livro senhorDoisAnais = new Livro("A volta dos que não foram", "Matheus S. M.", 69, 20.00);

    Livro bob_marley = new Livro("o chá da tarde e a larica infinita", "nicola D.C.", 400, 220.00);

    StarWars.exibirInformaces();
    senhorDoisAnais.exibirInformaces();
    bob_marley.exibirInformaces();
    }
}
