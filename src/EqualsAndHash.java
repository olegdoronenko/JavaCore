
import java.util.Objects;
public class EqualsAndHash {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(2.3, 3.3);
        ComplexNumber b = new ComplexNumber(2.3, 3.3);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }

    public static class ComplexNumber {
        private double re;
        private double im;

        public ComplexNumber() {
        }

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }

        public double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ComplexNumber number = (ComplexNumber) o;
            return re == number.re && im == number.im;
        }

        @Override
        public int hashCode() {
            return (int) (Double.hashCode(re) / 2 + Double.hashCode(im));
        }

    }

}
