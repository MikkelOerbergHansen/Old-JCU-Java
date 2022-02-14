package ProgrammingExercises;

public class PetSold extends ItemSold {

    public boolean Vaccinated = false;
    public boolean Neutered = false;
    public boolean Housebroken = false;

    public PetSold(int NewInvoiceNumber, String ItemDescription, int ItemPrice,
                   boolean ISvaccinated, boolean ISneutered, boolean IShousebroken) {

        super(NewInvoiceNumber, ItemDescription, ItemPrice);
        Vaccinated = ISvaccinated;
        Neutered = ISneutered;
        Housebroken = IShousebroken;

    }

    public PetSold() {
    }

    public void setVaccinated(boolean IsVaccinated) {
        Vaccinated = IsVaccinated;
    }

    public void setNeutered(boolean IsNeutered) {
        Neutered = IsNeutered;
    }

    public void setHousebroken(boolean IsHousebroken) {
        Housebroken = IsHousebroken;
    }

    public boolean getVaccinated() {
        return Vaccinated;
    }

    public boolean getNeutered() {
        return Neutered;
    }

    public boolean getHousebroken() {
        return Housebroken;
    }




}
