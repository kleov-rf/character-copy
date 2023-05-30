package org.characterCopy;

import java.util.ArrayList;

public class DestinationSpy implements Destination {
    public boolean assertSetCharCalled;
    public final ArrayList<Character> interactions;

    public DestinationSpy() {
        this.interactions = new ArrayList<>();
    }

    @Override
    public void setChar(char character) {
        this.assertSetCharCalled = true;
        interactions.add(character);
    }
}
