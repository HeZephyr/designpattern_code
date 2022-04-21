package builder_pattern;
/**
 * @author Cnc_hzf
 */
public class ComputerAssembleDirector {
    ComputerBuilder cb;
    public void setComputerBuilder(ComputerBuilder cb) {
        this.cb = cb;
    }
    public Computer assemble() {
        cb.buildCpu();
        cb.buildHarddisk();
        cb.buildMainframe();
        cb.buildRam();
        cb.buildMonitor();
        return cb.produceComputer();
    }
}
