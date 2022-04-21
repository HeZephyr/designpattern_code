package builder_pattern;
/**
 * @author Cnc_hzf
 */
public class Client {
    public static void main(String[] args) {
        ComputerBuilder cb = (ComputerBuilder) XMLUtils.getBean();
        ComputerAssembleDirector director = new ComputerAssembleDirector();
        director.setComputerBuilder(cb);
        Computer computer = director.assemble();
        // 检验
        System.out.println("计算机的组成");
        System.out.println("Cpu:" + computer.getCpu());
        System.out.println("Ram:" + computer.getRam());
        System.out.println("Harddisk:" + computer.getHarddisk());
        System.out.println("Mainframe:" + computer.getMainframe());
        System.out.println("Monitor:" + computer.getMonitor());
    }
}
