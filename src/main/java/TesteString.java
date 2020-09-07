public class TesteString {
    public static void main(String[] args) {


        String oldName = new String("Pedro"); //Ma pratica
        String newName = oldName.replace("d", "D");
        System.out.println(newName);

        System.out.println("");

        String nome = "Joao";
        String nomeToLowerCase = nome.toLowerCase();
        System.out.println(nomeToLowerCase);

        System.out.println("");

        String nome2 = "Bianca";
        String nome2ToUpperCase = nome2.toUpperCase();
        System.out.println(nome2ToUpperCase);

        System.out.println("");

        char c = nome.charAt(3);
        System.out.println(c);

        int pos = nome.indexOf("praia");
        System.out.println(pos);

        String sub = nome.substring(2);
        System.out.println(sub);

        System.out.println("");

        for (int i = 0; i < nome.length(); i++){
            System.out.println(nome.charAt(i));
        }

        System.out.println("");

        String nome3 = "Pedro  ";
        System.out.println(nome3 + nome2);
        System.out.println(nome3.trim() + nome2);

        System.out.println("");

        String nome4 = "";
        System.out.println(nome4.isEmpty());

        System.out.println("");

        System.out.println(nome2.contains(nome3));

        System.out.println("");






    }
}
