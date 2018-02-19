// TODO: supply the implementation of VoltageDividerAmplifier as a subclass of Amplifier
// R1 and R2 represent resistance. The gain (g) is calculated from the resistance as follows:
// VoltageDividerAmplifier:    g = R2 / (R1 + R2)
// TODO: the getGain method needs to return the correct gain (g)
     
public class VoltageDividerAmplifier extends Amplifier
{
    public  VoltageDividerAmplifier(int resistance1, int resistance2)
    {
        super(resistance1, resistance2);
    }
    
    public double getGain()
    {
        return super.getR2() * 1.0 / (super.getR1() + super.getR2());
    }
}