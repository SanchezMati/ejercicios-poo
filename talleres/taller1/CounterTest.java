public class CounterTest implements Runnable
{
    public class void main(String[] args)
    {
        Counter c = new Counter();
        System.out.println(c.getCount()); // Imprime 0
        c.increment(); // Aumenta en 1
        c.increment(); // Aumenta en 1
        System.out.println(c.getCount()); // Imprime 2
        c.decrement(); // Disminuye en 1
        System.out.println(c.getCount()); // Imprime 1
    }
}