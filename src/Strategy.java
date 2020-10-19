import java.util.ArrayList;
import java.util.List;

public class Strategy
{

}
interface PaymentStrategy
{
    void pay(int amount);
}
class PayByCreditCard implements PaymentStrategy
{
    private String username;
    private int amount;
    public PayByCreditCard(String username)
    {
        this.username = username;
        this.amount = 0;
    }
    public PayByCreditCard(String username, int amount)
    {
        this(username);
        this.amount = amount;
    }
    @Override
    public void pay(int amount)
    {
        this.amount += amount;
    }
}
class PayByPayPal implements PaymentStrategy
{
    private String email;
    private String password;
    private int amount;

    public PayByPayPal(String email, String password, int amount)
    {
        this.email = email;
        this.password = password;
        this.amount = amount;
    }

    @Override
    public void pay(int amount) {
        System.out.println("paying with payPal");
        this.amount -= amount;
    }
}
class Item
{
    private final int cost;
    public Item(int cost)
    {
        this.cost = cost;
    }
    public int getCost()
    {
        return cost;
    }
}
class ShoppingCart
{
    private List<Item> list = new ArrayList<>();
    public void addItem(Item item)
    {
        this.list.add(item);
    }
    public void pay(PaymentStrategy strategy)
    {
        strategy.pay(getCost());
    }

    private int getCost()
    {
        int count = 0;
        for (Item i: list)
            count += i.getCost();
        return count;
    }
}
class TestStrategy
{
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item = new Item(10);
        Item item1 = new Item(20);
        cart.addItem(item);
        cart.addItem(item1);
        cart.pay(new PayByCreditCard("salam", 1234));
        
    }
}

