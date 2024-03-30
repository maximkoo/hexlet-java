import java.util.Objects;

public class Car {
    private String made;
    private String model;

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProduced() {
        return produced;
    }

    public void setProduced(int produced) {
        this.produced = produced;
    }

    private int produced;

    public Car(String made, String model, int produced) {
        this.made = made;
        this.model = model;
        this.produced = produced;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return produced == car.produced && Objects.equals(made, car.made) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(made, model, produced);
    }
}
