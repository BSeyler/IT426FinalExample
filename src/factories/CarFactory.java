package factories;

import classes.Car;

import java.util.HashMap;

public class CarFactory
{
    //This hashmap stores a list of all body types, and a car associated with them
    private static final HashMap<String, Car> cars = new HashMap<>();

    public static Car createCar(String bodyType, String color)
    {
        //Create a new car to test if the bodytype already exists
        Car newCar = cars.get(bodyType);

        //If it didn't return anything, make a new car, else don't make a new one
        if (newCar == null)
        {
            newCar = new Car(bodyType);
            cars.put(bodyType, newCar);
            System.out.println("We made a new car for this body type!");

        } else
        {
            System.out.println("We've painted a pre-existing car for you!");
        }

        //Set the cars color
        newCar.setColor(color);
        return newCar;
    }

    public int getCarCacheSize()
    {
        return cars.size();
    }
}
