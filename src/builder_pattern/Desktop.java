package builder_pattern;

public class Desktop extends ComputerBuilder {
    @Override
    public void buildCpu() {
        computer.setCpu("Desktop Cpu");
    }
    @Override
    public void buildRam() {
        computer.setRam("Desktop Ram");
    }
    @Override
    public void buildHarddisk() {
        computer.setHarddisk("Desktop Harddisk");
    }
    @Override
    public void buildMainframe() {
        computer.setMainframe("Desktop Mainframe");
    }
    @Override
    public void buildMonitor() {
        computer.setMonitor("Desktop Monitor");
    }
}
