package eu.sig.training.ch03;

public class GermanFlag implements IFlag
{
    public List<Color> getColors() {
        return Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW);
    }
}
