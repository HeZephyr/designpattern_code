package adapter_pattern.object_adapter;
/**
 * 警车适配类，充当适配器
 * @author Cnc_hzf
 * @date 2022/4/24 18:41
 */
public class PoliceCarAdapter extends CarController {
    private PoliceLamp policeLamp;
    private PoliceSound policeSound;

    public PoliceCarAdapter() {
        policeLamp = new PoliceLamp();
        policeSound = new PoliceSound();
    }
    @Override
    public void phonate() {
        policeLamp.alarmLamp();
    }

    @Override
    public void twinkle() {
        policeSound.alarmSound();
    }
}
