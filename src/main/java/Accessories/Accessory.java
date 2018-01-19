package Accessories;

import Shop.SellableItem;

public abstract class Accessory extends SellableItem {

    private AccessoryType accessoryType;

    public Accessory(AccessoryType accessoryType, double buyPrice, double sellPrice) {
        super(buyPrice, sellPrice);
        this.accessoryType = accessoryType;
    }

    public AccessoryType getAccessoryType() {
        return this.accessoryType;
    }
}
