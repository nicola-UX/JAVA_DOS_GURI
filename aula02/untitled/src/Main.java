public class Main {
    public static void main(String[] args) {
        Carros Fiat500 = new Carros();
        Fiat500.marca = "Fiat";
        Fiat500.modelo = "Cult 1.4 Flex 8V EVO Mec";
        Fiat500.ano = 2012;

        Fiat500.exibirinformacoes();

        System.out.println("\n");

        Carros Chana = new Carros();
        Chana.marca = "CAOA Changan";
        Chana.modelo = "Chana Family 1.0";
        Chana.ano = 2008;

        Chana.exibirinformacoes();

        System.out.println("\n");

        Carros tuk_tuk = new Carros();
        tuk_tuk.marca = "Piaggio";
        tuk_tuk.modelo = "tuk-tuk Elétrico 2010";
        tuk_tuk.ano = 2010;

        tuk_tuk.exibirinformacoes();
    }
}
