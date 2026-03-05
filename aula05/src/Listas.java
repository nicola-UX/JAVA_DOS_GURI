import java.util.ArrayList;

public class Listas {
    public static void main(String[] arg) {
        ArrayList<String> Chaves = new ArrayList<>();

        Chaves.add("Tripa Seca");
        Chaves.add("Quase Nada");
        Chaves.add("Chapolin");

        System.out.println(Chaves);

        //Adiconar valores em uma posicao especifca
        Chaves.add(2, "Chapolin");
        System.out.println(Chaves);

        //Verificando o tamanho da Lista
        System.out.println("O tamanho da lista é: " + Chaves.size());

        //Acessar uum elemeto da lista
        System.out.println("A primeira posição tem o valor: " + Chaves.get(0));

        //Alterando valores
        Chaves.set(3, "Abominavel homem das fezes (Robson)");
        System.out.println(Chaves);

        //Removendo um item
        Chaves.remove(2);

        //Removendo item con Condições
        Chaves.removeIf(element -> element == "Tripa Seca");
        System.out.println(Chaves);

    }
}
