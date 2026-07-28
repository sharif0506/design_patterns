package creational.builder.product;

public class OfficeComputerBuilder implements ComputerBuilder {
    private String cpu, ram, storage, gpu;

    @Override public void buildCpu()     { this.cpu = "Intel Core i5"; }
    @Override public void buildRam()     { this.ram = "16GB DDR4"; }
    @Override public void buildStorage() { this.storage = "512GB SSD"; }
    @Override public void buildGpu()     { this.gpu = "Integrated Graphics"; }

    @Override
    public Computer build() {
        return new Computer(cpu, ram, storage, gpu);
    }
}
