public class Builder
{

}
class Flower
{
    private String name;
    private boolean isWatered;
    public Flower(FlowerBuilder builder)
    {
        this.name = builder.name;
        this.isWatered = builder.isWatered;
    }
    public static class FlowerBuilder
    {
        private String name;
        private boolean isWatered;
        public FlowerBuilder(String name)
        {
            this.name = name;
        }
        public FlowerBuilder setIsWatered(boolean isWatered)
        {
            this.isWatered = isWatered;
            return this;
        }
        public Flower build()
        {
            return new Flower(this);
        }
    }
}
class testBuilder
{
    /**
     *i have no idea why should we insult ourselves with this pattern!
     * i mean there is a class! and we don't need to creat a builder to have exactly the same thing as in the class!
     */
    public static void main(String[] args) {
        Flower flower = new Flower.FlowerBuilder("Lili").setIsWatered(true).build();

    }
}
