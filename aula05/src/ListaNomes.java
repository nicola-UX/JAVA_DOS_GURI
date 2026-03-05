import java.util.ArrayList;

public class ListaNomes {
    public static void main(String[] args) {
        ArrayList<String> ListaNomes = new ArrayList<>();

        ListaNomes.add("Ana");
        ListaNomes.add("Maria");
        ListaNomes.add("Pedro");
        ListaNomes.add("João");
        ListaNomes.add("Lucas");
        ListaNomes.add("Mario");
        ListaNomes.add("Ana");
        ListaNomes.add("Lucas");

        //Funcão anonima
        //Remove Valores Iguais a "Maria"
        ListaNomes.removeIf(nome -> nome.equals("Ana"));

        //Remove a partir de uma letra
        ListaNomes.removeIf(nome -> nome.contains("M"));
    }
}
