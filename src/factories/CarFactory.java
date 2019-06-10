package factories;

import classes.Car;

import java.util.HashMap;

public class CarFactory
{
    private static final HashMap<String, Car> cars = new HashMap<>();

    public static Car createCar(String bodyType, String color)
    {
        Car newCar = cars.get(bodyType);

        if (newCar == null)
        {
            newCar = new Car(bodyType);
            cars.put(bodyType, newCar);
            System.out.println("We made a new car for this body type!");

        } else
        {
            System.out.println("We've painted a pre-existing car for you!");
        }

        newCar.setColor(color);
        return newCar;
    }

    public int getCarCache()
    {
        return cars.size();
    }
}
