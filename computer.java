package javaapplication11;

public class computer {

    private String computerCompanyName;
    private String computerProcessor;
    private int computerRAM;
    private int computerHardDisk;

    public computer(String cN, String p, int r, int h) {
        computerCompanyName = cN;
        computerProcessor = p;
        computerRAM = r;
        computerHardDisk = h;
    }

    public void info() {

        System.out.println("Computer Name is :" + computerCompanyName);
        System.out.println("Computer Processor is :" + computerProcessor);
        System.out.println("Computer RAM is :" + computerRAM +" GB");
        System.out.println("Computer Hard Disk is :" + computerHardDisk +" GB");
    }

}
