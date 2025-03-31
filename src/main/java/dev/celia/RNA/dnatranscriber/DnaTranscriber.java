package dev.celia.RNA.dnatranscriber;

public class DnaTranscriber {

    public String transcribe(String dna) {
        StringBuilder rna = new StringBuilder();
        for (char nucleotide : dna.toUpperCase().toCharArray()) {
            switch (nucleotide) {
                case 'G':
                    rna.append('C');
                    break;
                case 'C':
                    rna.append('G');
                    break;
                case 'T':
                    rna.append('A');
                    break;
                case 'A':
                    rna.append('U');
                    break;
                default:
                    throw new IllegalArgumentException("Invalid nucleotide: " + nucleotide);
            }
        }
        return rna.toString();
    }

}
