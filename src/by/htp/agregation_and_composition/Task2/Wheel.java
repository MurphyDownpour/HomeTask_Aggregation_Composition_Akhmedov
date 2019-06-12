package by.htp.agregation_and_composition.Task2;

import java.util.Objects;

public class Wheel {
    private String rim;
    private String tire;

    public Wheel(String rim, String tire) {
        this.rim = rim;
        this.tire = tire;
    }

    public String getRim() {
        return rim;
    }

    public void setRim(String rim) {
        this.rim = rim;
    }

    public String getTire() {
        return tire;
    }

    public void setTire(String tire) {
        this.tire = tire;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return rim.equals(wheel.rim) &&
                tire.equals(wheel.tire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rim, tire);
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "rim='" + rim + '\'' +
                ", tire='" + tire + '\'' +
                '}';
    }
}
