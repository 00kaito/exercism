//wyszukanie najdluzszego ciagu zer w zapisie binaranym

public class Main {
    public static void main(String[] args) {
        int wynik = longZeroOrOnechaChain(338);
        System.out.println("wynik"+wynik);
    }

    static int longZeroOrOnechaChain(int n){
        System.out.println("zaczynamy - liczba: "+n);
        String binaryString = Integer.toBinaryString(n);
        System.out.println("binary: "+binaryString);

        int[] binaryInt = new int[binaryString.length()];

        int tmpCounter=0;
        int maxCounter=0;
        Character c;
        for(int i=0; i<binaryInt.length-1; i++){
            binaryInt[i]=Character.getNumericValue(binaryString.charAt(i));
            System.out.print("binaryINT: "+binaryInt[i]);
            if(binaryInt[i]==0 && binaryInt[i+1]==0) {
                System.out.println("binaryInt "+binaryInt[i]);
                tmpCounter++;
            }else{
                tmpCounter=0;
                System.out.println("ZEROWANIE");
            }
            if(tmpCounter>maxCounter){
                maxCounter=tmpCounter;
                System.out.println("NADPISANO ("+maxCounter+")");
            }
        }

        return maxCounter;
    }
}
