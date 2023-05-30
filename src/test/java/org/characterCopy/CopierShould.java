package org.characterCopy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CopierShould {

    @Spy public Destination destination;
    @Mock
    public Source source;

    @Test
     void read_characters_from_source_and_copy_to_destination() {
        when(source.getChar()).thenReturn('\n');

        Copier copier = new Copier(source, destination);
        copier.copy();

        verify(destination).setChar('\n');
    }
}
