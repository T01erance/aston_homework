package homework_7;

import java.util.List;
import java.util.Random;

public class BuyerThread extends Thread {
    static Random random = new Random();
    Buyer buyer;

    BuyerThread(int id, List<Goods> goodsList) {
        this.buyer = new Buyer(id, goodsList);
    }

    public void run() {
        buyer.enterToMarket();
        buyer.takeBasket();
        buyer.chooseGoods();

        try {
            Thread.sleep(random.nextInt(500, 2001));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        buyer.putGoodsToBasket();
        buyer.goOut();
    }
}
