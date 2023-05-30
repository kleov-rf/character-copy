package org.characterCopy;

public class DestinationSpy implements Destination {
    public boolean assertSetCharCalled;

    @Override
    public void setChar(char character) {
        this.assertSetCharCalled = true;
    }
}
