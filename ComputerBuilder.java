public class BuilderExemplo {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
            .setCPU("Intel Core i9")
            .setGPU("NVIDIA RTX 3080")
            .setRAM(32)
            .setStorage(1024)
            .build();
        System.out.println(computer);
    }
}

class Computer {
    private String CPU;
    private String GPU;
    private int RAM;
    private int storage;
    private Computer(Builder builder) {
        CPU = builder.CPU;
        GPU = builder.GPU;
        RAM = builder.RAM;
        storage = builder.storage;
    }
    public static class Builder {
        private String CPU;
        private String GPU;
        private int RAM;
        private int storage;
        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }
        public Builder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }
        public Builder setRAM(int RAM) {
            this.RAM = RAM;
            return this;
        }
        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }
        public Computer build() {
            return new Computer(this);
        }
    }
    public String toString() {
        return "Computer{" + "CPU='" + CPU + "', GPU='" + GPU + "', RAM=" + RAM + ", storage=" + storage + "}";
    }
}