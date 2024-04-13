public class ScreenMatch {
    public static void main(String[] args){
        System.out.println("Agora estou aprendendo a usar o ScreenMatch!");

        int year = 2022;
        boolean avaliable = true;
        double rate = (8.0 + 9.0) / 2;
        String sinopse = """
                    Ano: %d
                    Disponível: %b
                    Avaliação: %.1f
                    Sinopse: Uma jovem mulher, após um acidente de carro, acorda em um porão com um homem que diz ter salvado sua vida de um ataque químico que deixou o mundo inabitável.
                   """.formatted(year, avaliable, rate);

        System.out.println("A avaliação do ScreenMatch é " + rate + ".");
        System.out.println(sinopse);
    }
}