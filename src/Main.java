import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Request request = new Request();

        while (true) {

            try {
                String presentation = """
                        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        Seja bem-vindo/a ao Conversor de Moedas!
                        
                        Selecione uma das opções abaixo:
                        1) Dólar =>> Peso argentino
                        2) Peso argentino =>> Dólar
                        3) Dólar =>> Real brasileiro
                        4) Real brasileiro =>> Dólar
                        5) Real brasileiro =>> Peso chileno
                        6) Peso chileno =>> Real brasileiro
                        7) Bolivian boliviano =>> Peso colombiano
                        8) Peso colombiano =>> Bolivian boliviano
                        9) Sair
                        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        
                        Escolha:\s""";

                System.out.print(presentation);
                int choice = sc.nextInt();

                if (choice == 9) {
                    System.out.println("Obrigado por utilizar o conversor de moedas!");
                    break;
                } else if (choice < 1 || choice > 9) {
                    System.out.println("Digite uma opção válida!");
                    continue;
                }

                System.out.print("Digite o valor que deseja converter (formato: xx,xx): ");
                float amount = sc.nextFloat();
                if (amount <= 0) System.out.println("O valor deve ser maior que zero!");

                String baseCurrency = "";
                String targetCurrency = "";

                switch (choice) {
                    case 1:
                        baseCurrency = "USD";
                        targetCurrency = "ARS";
                        break;
                    case 2:
                        baseCurrency = "ARS";
                        targetCurrency = "USD";
                        break;
                    case 3:
                        baseCurrency = "USD";
                        targetCurrency = "BRL";
                        break;
                    case 4:
                        baseCurrency = "BRL";
                        targetCurrency = "USD";
                        break;
                    case 5:
                        baseCurrency = "BRL";
                        targetCurrency = "CLP";
                        break;
                    case 6:
                        baseCurrency = "CLP";
                        targetCurrency = "BRL";
                        break;
                    case 7:
                        baseCurrency = "BOB";
                        targetCurrency = "COP";
                        break;
                    case 8:
                        baseCurrency = "COP";
                        targetCurrency = "BOB";
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números!");
                sc.next();
            }
        }
    }
}
