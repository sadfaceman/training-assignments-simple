package eu.sig.training.ch03;

import static eu.sig.training.ch03.Nationality.BELGIAN;
import static eu.sig.training.ch03.Nationality.DUTCH;
import static eu.sig.training.ch03.Nationality.FRENCH;
import static eu.sig.training.ch03.Nationality.GERMAN;
import static eu.sig.training.ch03.Nationality.ITALIAN;

import java.awt.Color;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlagFactory {

    private static final Map<Nationality, IFlag> FLAGS =
        new HashMap<Nationality, IFlag>();

    static {
        FLAGS.put(DUTCH, new DutchFlag());
        FLAGS.put(GERMAN, new GermanFlag());
        FLAGS.put(BELGIAN, new BelgianFlag());
        FLAGS.put(FRENCH, new FrenchFlag());
        FLAGS.put(ITALIAN, new ItalianFlag());
    }

    public List<Color> getFlagColors(Nationality nationality) {
        IFlag flag = FLAGS.get(nationality);
        flag = flag != null ? flag : new DefaultFlag();
        return flag.getColors();
    }
    // tag::getFlag[]
}