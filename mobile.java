package javaapplication11;

public class mobile {

    private String compname;
    private String model;
    private int ram;
    private int rom;
    private String processorName;

    public mobile() {
        compname = "Vivo";
        model = "Y20";
        ram = 4;
        rom = 64;
        processorName = "SnapDragon 470";

    }
    public void info(){
        System.out.println("Company Name is : "+ compname);
        System.out.println("Model Name is : "+ model);
        System.out.println("Ram is : "+ ram +" GB");
        System.out.println("Rom is : "+ rom + " GB");
        System.out.println("Processor is : "+ processorName);
    
    }

}
