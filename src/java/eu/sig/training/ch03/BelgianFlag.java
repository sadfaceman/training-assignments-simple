package eu.sig.training.ch03;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;

public class BelgianFlag implements IFlag
{
    public List<Color> getColors() {
        return Arrays.asList(Color.BLACK, Color.YELLOW, Color.RED);
    }
}
