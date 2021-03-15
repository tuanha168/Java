package Practice.Ex2;


public class Flight {
    private int number;
    private String destination;

    public Flight() {
        number = 0;
        destination = "";
    }

    public Flight(int number, String destination) {
        this.number = number;
        this.destination = destination;
    }

    public void display() {
        System.out.println(number+", "+destination);
    }

    public String getDestination() {
        return destination;
    }

    public int getNumber() {
        return number;
    }
}