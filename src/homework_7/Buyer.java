package homework_7;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Buyer implements IBuyer, IUseBasket{
    static Random random = new Random();
    int id;
    HashMap<String, Double> basket;
    List<Goods> stock;
    Buyer(int id, List<Goods> stock){
        this.id = id;
        this.stock = stock;
        this.basket = new HashMap<>();
    }

    @Override
    public void enterToMarket() {
        System.out.println("Покупатель " + id + " вошел в магазин");
    }

    @Override
    public void chooseGoods() {
        System.out.println("Покупатель " + id + " выбирает товары");
            }

    @Override
    public void goOut() {
        System.out.println("Покупатель " + id + " покинул магазин");
    }

    @Override
    public void takeBasket() {
        System.out.println("Покупатель " + id + " взял корзину");
    }

    @Override
    public void putGoodsToBasket() {
        int goodCount = random.nextInt(1, 5);
        for(int i = 0; i < goodCount; i++){
            Goods goods = stock.get(random.nextInt(stock.size()));
            basket.put(goods.getName(), goods.getPrice());
        }
        System.out.println("Покупатель " + id + " выбрал товары: " + basket);
    }
}
