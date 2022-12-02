package sale;
public class Main {
    public static void main(String[] args) {
        SalesManager sale = new SalesManager(new long[]{1, 2, 33, 3});
        System.out.println(sale.max());
    }
}