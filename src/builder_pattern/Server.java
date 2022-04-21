package builder_pattern;

public class Server extends ComputerBuilder {
    @Override
    public void buildCpu() {
        computer.setCpu("Server Cpu");
    }
    @Override
    public void buildRam() {
        computer.setRam("Server Ram");
    }
    @Override
    public void buildHarddisk() {
        computer.setHarddisk("Server Harddisk");
    }
    @Override
    public void buildMainframe() {
        computer.setMainframe("Server Mainframe");
    }
    @Override
    public void buildMonitor() {
        computer.setMonitor(null);
    }
}
