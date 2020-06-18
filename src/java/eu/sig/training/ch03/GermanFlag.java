package eu.sig.training.ch03;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;

public class GermanFlag implements IFlag
{
    public List<Color> getColors() {
        return Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW);
    }
}
