package aula07loops.aula03breakcontinue;

public class Continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Pulando o valor: " + i);
                // Pula o restante do bloco e volta ao início do loop
                continue;
            }
            System.out.println("Valor: " + i);
        }
    }
}
