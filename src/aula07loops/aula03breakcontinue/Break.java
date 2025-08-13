package aula07loops.aula03breakcontinue;

public class Break {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Interrompendo o laço no valor: " + i);
                // Sai do laço
                break;
            }
            System.out.println("Valor: " + i);
        }
    }
}
