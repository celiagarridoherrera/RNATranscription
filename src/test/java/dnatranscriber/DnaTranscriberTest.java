package dnatranscriber;

import static org.mockito.Mockito.never;

import org.junit.jupiter.api.Test;

public class DnaTranscriberTest {

    @Test
    public void testGtoC() {
        DnaTranscriber transcriber = new DnaTrascriber();
        String result = transcriber.transcribe("G");
        assertEquals("C", result);
    }

        @Test
    public void testCtoG() {
        DnaTranscriber transcriber = new DnaTrascriber();
        String result = transcriber.transcribe("C");
        assertEquals("G", result);
    }

    @Test
    public void testTtoA() {
        DnaTranscriber transcriber = new DnaTrascriber();
        String result = transcriber.transcribe("G");
        assertEquals("C", result);
    }

    @Test
    public void testAtoU() {
        DnaTranscriber transcriber = new DnaTrascriber();
        String result = transcriber.transcribe("G");
        assertEquals("C", result);
    }

    @Test
    public void testStringComplete() {
        DnaTranscriber transcriber = new DnaTrascriber();
        String result = transcriber.transcribe("GCTA");
        assertEquals("CGAU", result);
    }

    @Test
    public void testStringEmpty() {
        DnaTranscriber transcriber = new DnaTrascriber();
        String result = transcriber.transcribe("");
        assertEquals("", result);
    }

}
