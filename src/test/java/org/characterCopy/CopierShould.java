package org.characterCopy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CopierShould {

    @Test
     void read_characters_from_source_and_copy_to_destination() {
        DestinationSpy destination = new DestinationSpy();
        SourceStub source = new SourceStub();

        Copier copier = new Copier(source, destination);
        copier.copy();

        assertTrue(destination.assertSetCharCalled);
    }
}
