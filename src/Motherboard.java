public class Motherboard {

    private String model;
    private String manufacturer;
    private int ramSlost;
    private int cardSlots;
    private String bio;

    public Motherboard(String model, String manufacturer, int ramSlost, int cardSlots, String bio) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlost = ramSlost;
        this.cardSlots = cardSlots;
        this.bio = bio;
    }


    public void loadProgram(String programName)
    {
        System.out.println("Program " + programName + "is now loading...");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlost() {
        return ramSlost;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBio() {
        return bio;
    }
}
