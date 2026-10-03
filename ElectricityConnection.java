import java.util.Scanner;

abstract class ElectricityConnection {
    protected int units;

    public ElectricityConnection(int units) {
        this.units = units;
    }

    public abstract double calculateBill();
}

class HomeConnection extends ElectricityConnection {
    public HomeConnection(int units) {
        super(units);
    }

    @Override
    public double calculateBill() {
        if (units <= 100) {
            return units * 5.0;
        } else {
            return (100 * 5.0) + ((units - 100) * 7.0);
        }
    }
}

class ShopConnection extends ElectricityConnection {
    public ShopConnection(int units) {
        super(units);
    }

    @Override
    public double calculateBill() {
        return (units * 8.0) + 100.0;
    }
}

class FactoryConnection extends ElectricityConnection {
    public FactoryConnection(int units) {
        super(units);
    }

    @Override
    public double calculateBill() {
        double bill = units * 6.0;
        return bill < 1000.0 ? 1000.0 : bill;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;

        int n = sc.nextInt();
        double totalBill = 0.0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int units = sc.nextInt();

            ElectricityConnection connection = null;

            if (type.equals("HOME")) {
                connection = new HomeConnection(units);
            } else if (type.equals("SHOP")) {
                connection = new ShopConnection(units);
            } else if (type.equals("FACTORY")) {
                connection = new FactoryConnection(units);
            }

            if (connection != null) {
                double bill = connection.calculateBill();
                System.out.printf("%s: %.2f\n", type, bill);
                totalBill += bill;
            }
        }

        System.out.printf("Total: %.2f\n", totalBill);
        sc.close();
    }
}