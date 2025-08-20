public class AlexandreAtv4 {
    public static void main(String[] args) {
        int paisA = 80000;
        int paisB = 200000;

        double taxaA = 0.03;
        double taxaB = 0.015;

        int anos = 0;

        while (paisA < paisB) {
            paisA += paisA * taxaA;
            paisB += paisB * taxaB;
            anos++;
        }

        System.out.printf("Serão necessários " + anos + " anos para que a população do país A ultrapasse ou se iguale à população do país B.%n");
    }

    }

