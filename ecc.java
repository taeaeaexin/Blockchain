public class ecc {
    int num;
    int prime;

    public void init(int num, int prime) {
        if (num >= prime || num < 0) {
            String error = String.format("Num %d not in field range 0 to %d", num, prime - 1);
            throw new IllegalArgumentException(error);
        }
        this.num = num;
        this.prime = prime;
    }

    public String repr() {
        return String.format("FieldElement_%d(%d)", prime, num);
    }

}
