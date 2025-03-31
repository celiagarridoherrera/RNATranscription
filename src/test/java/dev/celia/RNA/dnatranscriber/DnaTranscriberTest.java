package dev.celia.RNA.dnatranscriber;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class DnaTranscriberTest {

    @Test
    public void testGtoC() {
        DnaTranscriber transcriber = new DnaTranscriber();
        String result = transcriber.transcribe("G");
        assertEquals("C", result);
    }

    @Test
    public void testCtoG() {
        DnaTranscriber transcriber = new DnaTranscriber();
        String result = transcriber.transcribe("C");
        assertEquals("G", result);
    }

    @Test
    public void testTtoA() {
        DnaTranscriber transcriber = new DnaTranscriber();
        String result = transcriber.transcribe("T");
        assertEquals("A", result);
    }

    @Test
    public void testAtoU() {
        DnaTranscriber transcriber = new DnaTranscriber();
        String result = transcriber.transcribe("A");
        assertEquals("U", result);
    }

    @Test
    public void testStringComplete() {
        DnaTranscriber transcriber = new DnaTranscriber();
        String result = transcriber.transcribe("GCTA");
        assertEquals("CGAU", result);
    }

    @Test
    public void testStringEmpty() {
        DnaTranscriber transcriber = new DnaTranscriber();
        String result = transcriber.transcribe("");
        assertEquals("", result);
    }

    @Test
    public void testInvalidInput() {
        DnaTranscriber transcriber = new DnaTranscriber();
        assertThrows(IllegalArgumentException.class, () -> transcriber.transcribe("X"));
    }
}
