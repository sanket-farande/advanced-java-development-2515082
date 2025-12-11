package _02_04.before;

public class ShirtItem implements ClothingItem {

    @Override
    public int getPrice() {
        return 10;
    }

    @Override
    public String getName() {
        return "Shirt";
    }
}
