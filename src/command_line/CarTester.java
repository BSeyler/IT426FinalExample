package command_line;

import classes.Car;
import factories.CarFactory;

import java.util.Random;
import java.util.Scanner;

public class CarTester
{
    //Static bodytypes and colors to test the factory
    private static String[] bodyTypes = new String[]{"Coupe", "Van", "Sedan", "Crossover", "Hatchback"};
    private static String[] colors = new String[]{"Black", "Blue", " Blue Violet", "Light Grey" , "Dark Olive Green", "Silver", "Red"};

    private static CarFactory factoryLine = new CarFactory();
    private static Scanner input = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args)
    {
        System.out.println("Please enter the number of cars you would like to try?");
        int numCars = input.nextInt();

        //Get start time
        long start = System.currentTimeMillis();

        //Create numCars number of requests
        for(int i = 0; i < numCars; i++)
        {
            String bodyType = bodyTypes[random.nextInt(bodyTypes.length)];
            String color = colors[random.nextInt(colors.length)];

            System.out.println("Requesting a car with body type " + bodyType + " and color " + color);

            Car factoryCar = CarFactory.createCar(bodyType, color);
            factoryCar.drive();
            System.out.println();
        }

        //Get final time
        long finish = System.currentTimeMillis();

        //print the results
        System.out.println("A total of " + factoryLine.getCarCacheSize() + " cars were made");
        System.out.println("This operation took " +  ((finish - start)*.001) + " seconds!");

    }
}
