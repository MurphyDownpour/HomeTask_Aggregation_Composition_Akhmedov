package by.htp.agregation_and_composition.Task2;

import java.util.List;
import java.util.Objects;

public class Car {
    private List<Wheel> wheels;
    private Engine engine;
    private String model;

    public Car(List<Wheel> wheels, Engine engine) throws Exception {
        if (wheels.size() != 4) {
            throw new Exception("Must be 4 wheels");
        } else {
            this.wheels = wheels;
            this.engine = engine;
        }
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void start() {
        System.out.println("Start");
    }

    public void refuel() {
        System.out.println("Refuel");
    }

    public void changeWheel() {
        System.out.println("Changing wheel");
    }

    public void printModel() {
        System.out.println(model);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return wheels.equals(car.wheels) &&
                engine.equals(car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wheels, engine);
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                ", engine=" + engine +
                '}';
    }
}
