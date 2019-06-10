package command_line;

import classes.Car;
import factories.CarFactory;

import java.util.Random;
import java.util.Scanner;

public class CarTester
{
    private static String[] bodyTypes = new String[]{"Coupe", "Van", "Sedan", "Crossover", "Hatchback"};
    private static String[] colors = new String[]{"Black", "Blue", " Blue Violet", "Light Grey" , "Dark Olive Green", "Silver", "Red"};

    private static CarFactory factoryLine = new CarFactory();
    private static Scanner input = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args)
    {
        System.out.println("Please enter the number of cars you would like to try?");
        int numCars = input.nextInt();

        for(int i = 0; i < numCars; i++)
        {
            String bodyType = bodyTypes[random.nextInt(bodyTypes.length)];
            String color = colors[random.nextInt(colors.length)];

            System.out.println("Requesting a car with body type " + bodyType + " and color " + color);

            Car factoryCar = factoryLine.createCar(bodyType, color);
            factoryCar.drive();
            System.out.println();
        }

        System.out.println("A total of " + factoryLine.getCarCache() + " cars were made");

    }
}
