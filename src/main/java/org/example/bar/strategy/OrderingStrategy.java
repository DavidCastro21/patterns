package org.example.bar.strategy;

import org.example.StringDrink;
import org.example.StringRecipe;
import org.example.bar.StringBar;

/**
 * @author Tatiana Fritzová
 */
public interface OrderingStrategy {
    void wants(StringDrink drink, StringRecipe recipe, StringBar bar);
    void happyHourStarted(StringBar bar);
    void happyHourEnded(StringBar bar);
}
