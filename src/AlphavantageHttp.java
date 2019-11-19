import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class AlphavantageHttp {


    private String function = "TIME_SERIES_INTRADAY";

    private String  symbol = "MSFT";

    private int interval = 5;

    private String  outputsize = "compact";

    private String  datatype = "json";

    private String apiKey = "4IKF3U78VE3G7NC9";

    private String url = "https://www.alphavantage.co/query?" +
            "function="+ function +
            "&symbol="+ symbol +
            "&interval="+interval + "min" +
            "&outputsize="+ outputsize +
            "&apikey="+apiKey;

    public String httpGet(){
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {
            HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
            System.out.println(response);
            return response.body();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "error";
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public String getOutputsize() {
        return outputsize;
    }

    public void setOutputsize(String outputsize) {
        this.outputsize = outputsize;
    }

    public String getDatatype() {
        return datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
