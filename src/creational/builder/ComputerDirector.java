package creational.builder;

import creational.builder.product.Computer;
import creational.builder.product.ComputerBuilder;

public class ComputerDirector {
    private final ComputerBuilder computerBuilder;

    public ComputerDirector(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer getComputer() {
        computerBuilder.buildCpu();
        computerBuilder.buildRam();
        computerBuilder.buildStorage();
        computerBuilder.buildGpu();
        return computerBuilder.build();
    }
}
