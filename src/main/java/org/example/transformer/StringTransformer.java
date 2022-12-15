package org.example.transformer;

import org.example.StringDrink;

/**
 * @author Tatiana Fritzová
 */
public interface StringTransformer {
    void execute(StringDrink drink);
    void undo(StringDrink drink);
}
