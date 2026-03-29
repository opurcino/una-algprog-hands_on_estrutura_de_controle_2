import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tentativas = 0;
        char resposta;
        boolean acertou = false;

        do {
            tentativas++;
            
            System.out.println("\n--- Disciplina: Banco de Dados ---");
            System.out.println("Qual comando SQL é utilizado para extrair dados de um banco de dados?");
            System.out.println("(a) EXTRACT");
            System.out.println("(b) GET");
            System.out.println("(c) SELECT");
            System.out.println("(d) OPEN");
            System.out.println("(e) PULL");
            System.out.print("Sua resposta: ");

            
            resposta = scanner.next().toLowerCase().charAt(0);

            switch (resposta) {
                case 'c':
                    System.out.println("\nResposta correta");
                    System.out.println("Isso ocorreu na tentativa " + tentativas + ".");
                    acertou = true;
                    break;
                case 'a':
                case 'b':
                case 'd':
                case 'e':
                    System.out.println("\nResposta incorreta");
                    break;
                default:
                    System.out.println("\nOpção inválida. Resposta incorreta");
                    break;
            }

        } while (!acertou && tentativas < 3);

        
        if (!acertou) {
            System.out.println("Resposta incorreta nas 3 tentativas");
        }

        scanner.close();
    }
}