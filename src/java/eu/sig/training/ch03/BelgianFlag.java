package eu.sig.training.ch03;

public class BelgianFlag implements IFlag
{
    public List<Color> getColors() {
        return Arrays.asList(Color.BLACK, Color.YELLOW, Color.RED);
    }
}
