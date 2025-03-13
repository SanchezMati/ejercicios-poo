public class MultipleCounter extends Counter
{
    private int times;

    public MultipleCounter(int times)
    {
        super();
        this.times = times;
    }

    public void increment()
    {
        for(int aux = times; aux > 0; aux--)
        {
            super.increment();
        }
    }

    public void decrement()
    {
        for (int aux = times; aux > 0; aux--) {
            super.decrement();
        }
    }
}