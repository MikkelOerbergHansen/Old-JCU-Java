package ProgrammingExercises;

public class ItemSold {
    public int InvoiceNumber = 0;
    public String Description = "";
    public int price = 0;

    public ItemSold(int NewInvoiceNumber, String ItemDescription, int ItemPrice) {
        InvoiceNumber = NewInvoiceNumber;
        Description = ItemDescription;
        price = ItemPrice;
    }

    public ItemSold() {
    }

    public void setInvoiceNumber(int NewInvoiceNumber) {
        InvoiceNumber = NewInvoiceNumber;
    }

    public void setDescription(String ItemDescription) {
        Description = ItemDescription;
    }
    public void setPrice(int ItemPrice) {
        price = ItemPrice;
    }

    public int getInvoiceNumber() {
        return InvoiceNumber;
    }

    public String getDescription() {
        return Description;
    }

    public int getPrice() {
        return price;
    }
}
