package org.characterCopy;

public class Copier {
    public static final char NEW_LINE = '\n';
    private final Source source;
    private final Destination destination;

    public Copier(Source source, Destination destination) {
        this.source = source;
        this.destination = destination;
    }

    public void copy() {
        char characterToCopy = source.getChar();
        if (characterToCopy != NEW_LINE) {
            destination.setChar(characterToCopy);
        }
    }
}
