public class Hamming {
    String left;
    String right;

    Hamming(String leftStrand, String rightStrand) {
        this.left = leftStrand;
        this.right = rightStrand;

        if (this.right.length()!=this.left.length())
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
    }

    int getHammingDistance(){
        int distance = 0;
        for(int i=0; i<this.left.length(); i++){
            if (this.left.charAt(i)!=this.right.charAt(i))
                distance++;
        }
        return distance;
    }

}
