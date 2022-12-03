package sale;

public class Main {
    public static void main(String[] args) {
        SalesManager sale = new SalesManager(new int[]{1, 2, 33, 3});
        System.out.println(sale.max());
        System.out.println(sale.average());
    }
}