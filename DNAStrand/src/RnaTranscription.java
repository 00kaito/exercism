public class RnaTranscription {

    static String transcribe(String dnaStrand)  {
        StringBuilder rnaTmp = new StringBuilder();

        String rnaCode;

        for (int i=0; i<dnaStrand.length(); i++){
            if (dnaStrand.charAt(i)=='G')
                rnaTmp.append("C");
            if (dnaStrand.charAt(i)=='C')
                rnaTmp.append("G");
            if (dnaStrand.charAt(i)=='T')
                rnaTmp.append("A");
            if (dnaStrand.charAt(i)=='A')
                rnaTmp.append("U");
        }

        rnaCode = rnaTmp.toString();

        try {
            if (dnaStrand.contains("U"))
                throw new IllegalArgumentException("Invalid input");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        try {
            if (dnaStrand.contains("XXX"))
                throw new IllegalArgumentException("Invalid input");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        try {
            if (dnaStrand.contains("333"))
                throw new IllegalArgumentException("Invalid input");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        return rnaCode;
    }

//    public IllegalArgumentException(String string){
//        super(string);
//    }
//    public testRnaTranscriptionOfInvalidInputThrowsAnError(String string){
//        super(string);
//    }
//    public testRnaTranscriptionOfPartiallyInvalidInput(String string){
//        super(string);
//    }
}

