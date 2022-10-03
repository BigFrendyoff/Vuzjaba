package lab2.task4;

public class Computer {
    private String computerName;
    private String motherboard;
    private String CPU;
    private int ram;

    public Computer(String computerName, String motherboard, String CPU, int ram) {
        this.computerName = computerName;
        this.motherboard = motherboard;
        this.CPU = CPU;
        this.ram = ram;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public String toString(){
        return "Computer name: " + computerName + "; Motherboard: " + motherboard + "; CPU: " + CPU +
                "; Ram amount: " + ram;
    }
}
