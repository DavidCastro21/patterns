package org.example;

import org.example.transformer.StringTransformer;

import java.util.List;

public class StringRecipe {

    private List<StringTransformer> transformers;

    public StringRecipe(List<StringTransformer> transformers) {
        this.transformers = transformers;
    }

    public void mix(StringDrink stringDrink) {
        for (StringTransformer transformer : transformers) {
            transformer.execute(stringDrink);
        }
    }
}
