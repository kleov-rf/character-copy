package org.characterCopy;

import org.junit.jupiter.api.Test;
import org.mockito.Spy;

import static org.mockito.Mockito.*;

public class CopierShould {

    @Test
     void read_characters_from_source_and_copy_to_destination() {
        var destination = spy(Destination.class);
        var source = mock(Source.class);

        when(source.getChar()).thenReturn('\n');

        Copier copier = new Copier(source, destination);
        copier.copy();

        verify(destination).setChar('\n');
    }
}
