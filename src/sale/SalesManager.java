package sale;

public class SalesManager {

    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {

            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long average() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }

        long min = max;
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }

        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return (sum - (max + min)) / ((sales.length) - 2);
    }
}