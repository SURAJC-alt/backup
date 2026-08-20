public class BoxWeigth extends Box {
    double weigth;

    BoxWeigth() {
        this.weigth = -1;
    }

    public BoxWeigth(double l, double h, double w, double weigth) {
        super(l, h, w);
        this.weigth = weigth;
    }
}