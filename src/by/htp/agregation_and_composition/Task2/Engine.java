package by.htp.agregation_and_composition.Task2;

import java.util.Objects;

enum Fuel {
    PETROL, DIESEL, GAS
}

public class Engine {
    private int cylinders;
    private Fuel fuel;

    public Engine(int cylinders, Fuel fuel) {
        this.cylinders = cylinders;
        this.fuel = fuel;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return cylinders == engine.cylinders &&
                fuel == engine.fuel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cylinders, fuel);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "cylinders=" + cylinders +
                ", fuel=" + fuel +
                '}';
    }
}