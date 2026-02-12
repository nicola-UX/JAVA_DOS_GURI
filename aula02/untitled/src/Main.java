import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carros Fiat500 = new Carros();
        Fiat500.marca = "Fiat";
        Fiat500.modelo = "Cult 1.4 Flex 8V EVO Mec";
        Fiat500.ano = 2012;

        Fiat500.exibirinformacoes();

        System.out.println("");

        Carros Chana = new Carros();
        Chana.marca = "CAOA Changan";
        Chana.modelo = "Chana Family 1.0";
        Chana.ano = 2008;

        Chana.exibirinformacoes();

        System.out.println("");

        Carros tuk_tuk = new Carros();
        tuk_tuk.marca = "Piaggio";
        tuk_tuk.modelo = "tuk-tuk Elétrico 2010";
        tuk_tuk.ano = 2010;

        tuk_tuk.exibirinformacoes();


        Scanner sc = new Scanner(System.in);

        Carros carro = new Carros();
        System.out.print("Digite a marca do carro: ");
        carro.marca = sc.nextLine();
        System.out.print("Digite a ano do carro: ");
        carro.ano = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o modelo do carro: ");
        carro.modelo = sc.nextLine();

        carro.exibirinformacoes();
    }
}
