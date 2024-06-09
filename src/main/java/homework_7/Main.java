package homework_7;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String[] names = {"Milk", "Meat", "Eggs", "Bread", "Butter", "Cheese", "Apple", "Banana", "Orange", "Chicken",
                "Beef", "Pork", "Fish", "Yogurt", "Juice", "Water", "Soda", "Chocolate", "Coffee", "Tea"};

        List<Goods> goodsList = new ArrayList<>();

        Random random = new Random();
        DecimalFormat df = new DecimalFormat("#.00");

        for (String name : names) {
            double price = Double.parseDouble(df.format(1 + (100 - 1) * random.nextDouble()).replace(",", "."));
            goodsList.add(new Goods(name, price));
        }

        int startId = 1;
        int k = 0;
        while (k < 121) {
            try {
                Thread.sleep(1000);
                int buyerCount = random.nextInt(3);
                for (int i = 0; i < buyerCount; i++) {
                    BuyerThread buyerThread = new BuyerThread(startId + i, goodsList);
                    buyerThread.start();
                }
                startId += buyerCount;
                k++;
                System.out.println("-------------------");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
