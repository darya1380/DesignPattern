public class Singleton
{
    private static final Singleton singleton = new Singleton();
    private Singleton(){}
    public static Singleton getInstance()
    {
        return singleton;
    }
}
class SingletonTest
{
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        if(singleton.equals(singleton1))
            System.out.println("yes");
        /**
         * we can have so many different instance of singleton
         * but they are all the same! :)
         */
    }
}