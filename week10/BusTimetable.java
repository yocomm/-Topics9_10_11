package week10;

public class BusTimetable {
    public static void main(String[] args) {
        String busTimesUrl = "https://svc.metrotransit.ora/NexTrip/179482format=json";
        Bus[] buses = Unirest.get(busTimesUrl).asObject(Bus[].class).getBody();
    }
}

for (Bus bus: buses) {
        System.out.println(bus.Route + bus.Description + bus.DepartureText);
        }

class Bus {
    public String DepartureText;
    public String Route;
    public String Description;
}