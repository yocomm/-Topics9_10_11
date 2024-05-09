package week10;

public class CatFactAPI {
    public static void main(String[] args) {
        String url = "https://catfact.ninja/fact";
        String fact = Unirest.get(url).asString(CatFact.class).getBody();
        System.out.println(fact);
}

    class CatFact {
        public String fact;
        public int length;
    }