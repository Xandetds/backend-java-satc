package aula04entradaesaidadedados.aula01saida;

public class SaidaDadosC {
    public static void main(String[] args) {
        byte b = 120;
        short s = 30000;
        int i = 123456789;
        long l = 9876543210L;
        float f = 3.14f;
        double d = 12345.6789;
        char c = 'A';
        boolean bool = true;
        String nome = "Clayton Andrade";

        //Inteiros %d
        System.out.printf("byte: %d\n", b);
        System.out.printf("short: %d\n", s);
        System.out.printf("int: %d\n", i);
        System.out.printf("long: %d\n", l);

        //Ponto Flutuante %.Xf (Trocar X pelo número de casas após a vírgula)
        System.out.printf("float: %.2f\n", f);
        System.out.printf("double: %.4f\n", d);

        //Caracter %c
        System.out.printf("char: %c\n", c);

        //Booleano %%b
        System.out.printf("boolean: %b\n", bool);

        //Palavras %s
        System.out.printf("String: %s", nome);
    }

}
