package ss5_access_modifier_and_static.practice.static_property;

public class Car {

    private String name;

    private String engine;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public static int numberOfCars;



    public Car(String name, String engine) {

        this.name = name;

        this.engine = engine;

        numberOfCars++;

    }

}
