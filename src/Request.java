import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Request {

    public ConvertedValue convertCurrency(String baseCurrency, String targetCurrency, String amount) throws IOException, InterruptedException {

        String url = "https://v6.exchangerate-api.com/v6/ca35f5de65c7f42b17b261a5/latest/" + baseCurrency + "/" + targetCurrency + "/" + amount;

        HttpClient client = HttpClient.newBuilder()
                .build();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        return new Gson().fromJson(response.body(), ConvertedValue.class);
    }

}
