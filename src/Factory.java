public class Factory
{
    public static Car getCar(String name, int driveSkill)
    {
        if(name.equalsIgnoreCase("Mazda"))
            return new Mazda(driveSkill);
        else
            return new Honda(driveSkill);
    }
    /**
     * it seems like we have a factory that produces and returns cars
     * that's good because if we have a verity of objects we won't be confused for creating instance of them
     */
}
abstract class Car
{
    abstract void drive();
}
class Honda extends Car
{
    private int driveSkill;

    public Honda(int driveSkill)
    {
        this.driveSkill = driveSkill;
    }

    @Override
    void drive()
    {
        System.out.println("the honda is derived");
    }
}
class Mazda extends Car
{
    private int driveSkill;
    public Mazda(int driveSkill)
    {
        this.driveSkill = driveSkill;
    }
    @Override
    void drive()
    {
        System.out.println("the mazda is derived");
    }
}
class FactoryTest
{
    public static void main(String[] args) {
        Car car = Factory.getCar("mazda", 100);
        car.drive();
    }
}