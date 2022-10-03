package lab2.task4;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Computer> computers = new ArrayList<>();

    public Shop(){}

    public void addComputer(Computer newComputer){
        computers.add(newComputer);
    }

    public String findComputer(String motherboard, String videoAdapter, int ram){
        for (int i = 0; i < computers.size(); i++){
            if(computers.get(i).getMotherboard().equals(motherboard)
                    && computers.get(i).getCPU().equals(videoAdapter)
                    && computers.get(i).getRam() == ram){
                    return "Found computer! " + computers.get(i).toString();
            }
        }
        return "The computer with the given parameters was not found!";
    }

}
