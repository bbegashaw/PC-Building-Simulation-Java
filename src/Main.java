public class Main {
    public static void main(String[] args)
    {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("Mid Tower 95B","Dell","240",dimensions);

        Monitor theMonitor = new Monitor("27inch 400XC", "Samsumg",27,new Resolution(2540,1440));

        Motherboard motherboard = new Motherboard("BJ-4OO", "ASUS", 4, 6,"V2.44");

        PC thePC = new PC(theCase, theMonitor, motherboard);

        thePC.getTheCase().pressPowerButton();
        thePC.getMotherboard().loadProgram("Windows Vista");
        thePC.getMonitor().drawPixelAt(1200,1300,"yellow");


    }
}
