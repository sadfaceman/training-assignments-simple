package eu.sig.training.ch03;

public class RomaniaFlag implements IFlag
{
    public List<Color> getColors() {
        return Arrays.asList(Color.BLUE, Color.YELLOW, Color.RED);
    }
}
