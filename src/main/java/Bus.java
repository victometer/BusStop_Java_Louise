import java.util.ArrayList;

public class Bus {
    private String destination;
    private Integer capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, Integer capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public String getDestination() {
        return this.destination;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getPassengerCount() {
        return this.passengers.size();
    }

    public void addPassenger(Person person) {
        if(getPassengerCount() < this.capacity){
            this.passengers.add(person);
        }

    }

    public void removePassenger(Person person) {
         this.passengers.remove(0);


    }

    public void pickUpPassenger(BusStop busStop) {
        Person person = busStop.removePerson();
        this.addPassenger(person);
    }
}
