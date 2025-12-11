package _02_05.before;

import java.util.ArrayList;
import java.util.List;

public class ClothingSite {

    public static void main(String[] args) {

        // Mix of ClothingItem types
        ShirtItem shirtItem = new ShirtItem();
        JacketItem jacketItem = new JacketItem();

        List<ClothingItem> clothingItems = new ArrayList<>();
        clothingItems.add(shirtItem);
        clothingItems.add(jacketItem);
        checkoutAllItems(clothingItems);

        // Only ShirtItem types
        ShirtItem shirtItem1 = new ShirtItem();
        ShirtItem shirtItem2 = new ShirtItem();

        List<ShirtItem> shirtItems = new ArrayList<>();
        shirtItems.add(shirtItem1);
        shirtItems.add(shirtItem2);
        checkoutAllItems(shirtItems);

        //Only JacketItem types
        JacketItem jacketItem1 = new JacketItem();
        JacketItem jacketItem2 = new JacketItem();  
        List<JacketItem> jacketItems = new ArrayList<>();
        jacketItems.add(jacketItem1);
        jacketItems.add(jacketItem2);
        checkoutAllItems(jacketItems);

    }

    static void checkoutItem(ClothingItem item) {
        System.out.println("Item purchased: " + item.getName() + ", price: " + item.getPrice());
    }

    // With wildcards ?, now we can accept any subtype of ClothingItem
    // List<ShirtItem> is different from List<ClothingItem>, so we need to use wildcards
    static void checkoutAllItems(List<? extends ClothingItem> clothingItems) {

        for (ClothingItem clothingItem : clothingItems) {
            checkoutItem(clothingItem);
        }

    }

}
