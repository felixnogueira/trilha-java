public class Operadores {
    public static void main(String[] args) {
        String concatenacao = "?";

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);

        //operador ternário

        int a, b;
        a = 6;
        b = 6;

        int resultado = a == b ? 1 : 0;

        System.out.println(resultado);

        //operador relacional

        String nomeUm = "Fulano";
        String nomeDois = "Fulano";
        System.out.println(nomeUm == nomeDois);

        int numero1 = 1;
        int numero2 = 2;

        if (numero1 == numero2) {
            System.out.println("a nossa condição é verdadeira");
        }
        else {
            System.out.println("a nossa condição é falsa");
        }

        boolean simNao = numero1 < numero2;

        System.out.println("numeroUm é maior que numeroDois? " + simNao);

        //operadores lógicos

        boolean condicao1 = true;
        boolean condicao2 = true;

        if (condicao1 && condicao2) {
            System.out.println("as duas condições são verdadeiras");
        }

        if (condicao1 || condicao2) {
            System.out.println("pelo menos uma das condições é verdadeira");
        }


    }
}
