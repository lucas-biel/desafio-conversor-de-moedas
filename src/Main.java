import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        Request request = new Request();

        ConvertedValue converted = request.convertCurrency("BRL", "USD", "10");

        System.out.println(converted);

    }
}
