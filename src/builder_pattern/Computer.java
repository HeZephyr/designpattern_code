package builder_pattern;
/**
 * @author Cnc_hzf
 */
public class Computer {
    /**
     * cpu：中央处理器
     * ram：内存
     * harddisk：硬盘
     * mainframe：主机
     * monitor：显示器
     */
    private String cpu;
    private String ram;
    private String harddisk;
    private String mainframe;
    private String monitor;
    public String getCpu() {
        return cpu;
    }
    public String getRam() {
        return ram;
    }

    public String getHarddisk() {
        return harddisk;
    }

    public String getMainframe() {
        return mainframe;
    }

    public String getMonitor() {
        if (monitor == null) {
            return "服务器没有显示器";
        }
        return monitor;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setHarddisk(String harddisk) {
        this.harddisk = harddisk;
    }

    public void setMainframe(String mainframe) {
        this.mainframe = mainframe;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }
}
