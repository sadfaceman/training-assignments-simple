package eu.sig.training.ch03;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;

public class DutchFlag implements IFlag
{
    public List<Color> getColors() {
        return Arrays.asList(Color.GREEN, Color.WHITE, Color.BLUE);
    }
}
