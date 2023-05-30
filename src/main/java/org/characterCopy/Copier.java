package org.characterCopy;

public class Copier {
    private final SourceStub source;
    private final DestinationSpy destination;

    public Copier(SourceStub source, DestinationSpy destination) {

        this.source = source;
        this.destination = destination;
    }

    public void copy() {
        char characterToCopy = source.getChar();
        destination.setChar(characterToCopy);
    }
}
