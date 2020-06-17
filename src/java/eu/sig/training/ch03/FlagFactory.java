package eu.sig.training.ch03;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;

public class FlagFactory {

    private static final Map<Nationality, Flag> FLAGS =
        new HashMap<Nationality, Flag>();

    static {
        FLAGS.put(DUTCH, new DutchFlag());
        FLAGS.put(GERMAN, new GermanFlag());
        FLAGS.put(BELGIAN, new BelgianFlag());
        FLAGS.put(FRENCH, new FrenchFlag());
        FLAGS.put(ITALIAN, new ItalianFlag());
    }

    public List<Color> getFlagColors(Nationality nationality) {
        Flag flag = FLAGS.get(nationality);
        flag = flag != null ? flag : new DefaultFlag();
        return flag.getColors();
    }
    // tag::getFlag[]
}