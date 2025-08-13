package aula06condicionais.aula01ifelse;

public class ifElseOperadoresLogicos {
    public static void main(String[] args) {
        System.out.println("***&&***");
        int x = 5;
        int y = 10;
        if (x > 0 && y > 0) {
            System.out.println("x e y sao positivos");
        }

        System.out.println("***||***");
        int x1 = 5;
        int y1 = -10;
        if (x1 > 0 || y1 > 0) {
            System.out.println("Pelo menos uma das variáveis é positiva");
        }

        System.out.println("***^***");
        boolean a = true;
        boolean b = false;
        if (a ^ b) {
            System.out.println("Apenas uma das variáveis é verdadeira");
        }
        System.out.println("***!***");
        boolean a1 = true;
        if (!a1) {
            System.out.println("O valor da variável a é falso");
        }
    }
}
