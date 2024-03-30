import java.time.LocalDate;

public final class Car {

    private String made;
    private String model;
    private LocalDate manufacturedAt;

    public Car(String made, String model, LocalDate manufacturedAt) {
        this.made = made;
        this.model = model;
        this.manufacturedAt = manufacturedAt;
    }

    public String getMade() {
        return made;
    }

    public String getModel() {
        return model;
    }

    public LocalDate getManufacturedAt() {
        return manufacturedAt;
    }

    @Override
    public String toString() {
        return made + " " + model;
    }
}
