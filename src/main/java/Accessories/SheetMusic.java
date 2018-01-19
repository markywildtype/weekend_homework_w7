package Accessories;

public class SheetMusic extends Accessory {

    private String title;
    private int pages;

    public SheetMusic(String description, String title, int pages, double buyPrice, double sellPrice) {
        super(description, buyPrice, sellPrice);
        this.title = title;
        this.pages = pages;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPages() {
        return this.pages;
    }
}
