package creational.builder.product;

public class GamingComputerBuilder implements ComputerBuilder {
    private String cpu, ram, storage, gpu;

    @Override
    public void buildCpu() {
        this.cpu = "Intel Core i9";
    }

    @Override
    public void buildRam() {
        this.ram = "32GB DDR5";
    }

    @Override
    public void buildStorage() {
        this.storage = "2TB NVMe SSD";
    }

    @Override
    public void buildGpu() {
        this.gpu = "NVIDIA RTX 4090";
    }

    @Override
    public Computer build() {
        return new Computer(cpu, ram, storage, gpu);
    }
}
