package classes;

public class Car implements ICar
{
    private final String bodyType;
    private String color;

    public Car(String bodyType)
    {
        this.bodyType = bodyType;
    }

    public String getBodyType()
    {
        return bodyType;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    @Override
    public void drive()
    {
        System.out.println("Testing car with body type " + bodyType + " color " + color);
    }
}
