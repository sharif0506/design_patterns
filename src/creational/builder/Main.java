package creational.builder;

import creational.builder.product.Computer;
import creational.builder.product.GamingComputerBuilder;
import creational.builder.product.OfficeComputerBuilder;

public class Main {
    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector(new GamingComputerBuilder());
        Computer gamingPC = director.getComputer();
        System.out.println(gamingPC);

        director = new ComputerDirector(new OfficeComputerBuilder());
        Computer officePC = director.getComputer();
        System.out.println(officePC);
    }
}
