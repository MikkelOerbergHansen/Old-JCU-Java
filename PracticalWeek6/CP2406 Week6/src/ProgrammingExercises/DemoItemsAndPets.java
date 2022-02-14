package ProgrammingExercises;

public class DemoItemsAndPets {
    public static void main(String args[])
    {
        ItemSold Item1 = new ItemSold();
        ItemSold Item2 = new ItemSold(102, "shirt, 100% cotton", 80);

        PetSold Pet1 = new PetSold();
        PetSold Pet2 = new PetSold(902, "russian blue cat", 160,
                true, true, true);

        Item1.setInvoiceNumber(101);
        Item1.setDescription("pants, Denim");
        Item1.setPrice(60);

        Pet1.setInvoiceNumber(901);
        Pet1.setDescription("African Swallow");
        Pet1.setPrice(100);
        Pet1.setVaccinated(true);
        Pet1.setNeutered(true);
        Pet1.setHousebroken(true);

        System.out.println("first item is: " + Item1.getDescription() + ". The Invoice number is " +
                Item1.getInvoiceNumber() + ". The price is $" + Item1.getPrice());
        System.out.println("second item is: " + Item2.getDescription() + ". The Invoice number is " +
                Item2.getInvoiceNumber() + ". The price is $" + Item2.getPrice());

        System.out.println("first pet is: " + Pet1.getDescription() + ". The Invoice number is " +
                Pet1.getInvoiceNumber() + ". The Price is $" + Pet1.getPrice() + "\n vaccinated: " +
                Pet1.getVaccinated() + "\n neutered: " + Pet1.getNeutered() + "\n housebroken: " +
                Pet1.getHousebroken());

        System.out.println("first pet is: " + Pet2.getDescription() + ". The Invoice number is " +
                Pet2.getInvoiceNumber() + ". The Price is $" + Pet2.getPrice() + "\n vaccinated: " +
                Pet2.getVaccinated() + "\n neutered: " + Pet2.getNeutered() + "\n housebroken: " +
                Pet2.getHousebroken());

    }
}
