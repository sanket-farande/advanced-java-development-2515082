package _02_04.before;

import java.util.List;

public class ClothingSite {

    public static void main(String[] args) {
        ShirtItem shirtItem = new ShirtItem();
        JacketItem jacketItem = new JacketItem();

        checkoutItem(shirtItem);
        checkoutItem(jacketItem);

        List<ClothingItem> items = List.of(shirtItem, jacketItem);
        checkoutAllItems(items);
    }

    //Liskov Substitution Principle applied here
    //Means that we can use any ClothingItem subtype without changing this method

    static void checkoutItem(ClothingItem item) {
        System.out.println("Item purchased: " + item.getName() + ", price: " + item.getPrice());
    }

    static void checkoutAllItems(List <ClothingItem> items) {
        for(ClothingItem item : items){
            checkoutItem(item);
        }
    }

}
