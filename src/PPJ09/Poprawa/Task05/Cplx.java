package PPJ09.Poprawa.Task05;

public class Cplx {
    private double rzeczywista;
    private double urojona;

    public Cplx(double real, double imag) {
        this.rzeczywista = real;
        this.urojona = imag;
    }

    public Cplx add(Cplx cplx) {
        return new Cplx(this.rzeczywista + cplx.rzeczywista, this.urojona + cplx.urojona);
    }

    public Cplx sub(Cplx cplx) {
        return new Cplx(this.rzeczywista - cplx.rzeczywista, this.urojona - cplx.urojona);
    }

    public Cplx mul(Cplx cplx) {
        double newReal = this.rzeczywista * cplx.rzeczywista - this.urojona * cplx.urojona;
        double newImag = this.rzeczywista * cplx.urojona + this.urojona * cplx.rzeczywista;
        return new Cplx(newReal, newImag);
    }

    public void inc() {
        this.rzeczywista += 1;
    }

    public void show() {
        System.out.println(this.rzeczywista + " + " + this.urojona + "i");
    }

    public static void main(String[] args) {
        Cplx num1 = new Cplx(2.0, 3.0);
        Cplx num2 = new Cplx(1.0, 4.0);
        Cplx num3 = new Cplx(0.5, -0.5);

        Cplx sum = num1.add(num2);
        sum.show();

        Cplx difference = num1.sub(num2);
        difference.show();

        Cplx product = num1.mul(num3);
        product.show();

        num1.inc();
        num1.show();
    }
}