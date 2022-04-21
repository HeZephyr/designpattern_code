package builder_pattern;
/**
 * @author Cnc_hzf
 */
public abstract class ComputerBuilder {
    protected Computer computer = new Computer();

    /**
     *
     */
    public abstract void buildCpu();
    public abstract void buildRam();
    public abstract void buildHarddisk();
    public abstract void buildMainframe();
    public abstract void buildMonitor();
    protected Computer produceComputer() {
        return computer;
    }
}
