package week10;

public class ExchangeRateConverter {
    public static void main(String[] args) {
        String url = "https://exchange-rates-1150.herokuapp.com/latest?base=USD&symbols=EUR";
        RateResponse response = Unirest.get(url).asObject(RateResponse.class).getBody();
    }
}


class RefteResponse {
    public String base;
    public String date;
    public Rates rates;
}

class Rates {
    public double EUR;
}