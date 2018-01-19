package Accessories;

import Shop.SellableItem;

public abstract class Accessory extends SellableItem {

    private AccessoryType accessoryType;
    private String description;

    public Accessory(AccessoryType accessoryType, String description, double buyPrice, double sellPrice) {
        super(buyPrice, sellPrice);
        this.accessoryType = accessoryType;
        this.description = description;
    }

    public AccessoryType getAccessoryType() {
        return this.accessoryType;
    }

    public String getDescription() {
        return description;
    }
}
