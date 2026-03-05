public class Vetores {
    public static void main(String[] args) {
        String[] Robson = new String[10];

        Robson[0] = "ele faz live na roxinha pra uma pessoa online";
        Robson[1] = "x9 do caso hot boy e titia beta";

        //  Método Tradicional
        //  for (int i = 0; i < Robson.length; i++){
        //      System.out.println(Robson[i]);
        //  }



        //ForEach
        for(String elogios: Robson){
            System.out.println(elogios);
        }

    }
}
