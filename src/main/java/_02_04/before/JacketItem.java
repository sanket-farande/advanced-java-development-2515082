package _02_04.before;

public class JacketItem implements ClothingItem {

    @Override
    public int getPrice() {
        return 25;
    }

    @Override
    public String getName() {
        return "Jacket";
    }
}
