package builder_pattern;
/**
 * @author Cnc_hzf
 */
public class Notebook extends ComputerBuilder {
    @Override
    public void buildCpu() {
        computer.setCpu("Notebook Cpu");
    }
    @Override
    public void buildRam() {
        computer.setRam("Notebook Ram");
    }
    @Override
    public void buildHarddisk() {
        computer.setHarddisk("Notebook Harddisk");
    }
    @Override
    public void buildMainframe() {
        computer.setMainframe("Notebook Mainframe");
    }
    @Override
    public void buildMonitor() {
        computer.setMonitor("Notebook Monitor");
    }
}
