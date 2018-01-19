package Accessories;

import Shop.SellableItem;

public abstract class Accessory extends SellableItem {

    private String description;

    public Accessory(String description, double buyPrice, double sellPrice) {
        super(buyPrice, sellPrice);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
