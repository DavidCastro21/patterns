package org.example.bar.strategy;

import org.example.StringDrink;
import org.example.StringRecipe;
import org.example.bar.StringBar;

/**
 * @author Tatiana Fritzová
 */
public class ImpatientStrategy implements OrderingStrategy {

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        bar.order(drink, recipe);
    }

    @Override
    public void happyHourStarted(StringBar bar) {
    }

    @Override
    public void happyHourEnded(StringBar bar) {
    }
}