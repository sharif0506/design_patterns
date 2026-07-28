package creational.builder.product;

public interface ComputerBuilder {
    void buildCpu();
    void buildRam();
    void buildStorage();
    void buildGpu();
    Computer build();
}
