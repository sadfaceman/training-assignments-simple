package eu.sig.training.ch03;

public class ItalianFlag implements IFlag
{
    public List<Color> getColors() {
        return Arrays.asList(Color.GREEN, Color.WHITE, Color.RED);
    }
}
