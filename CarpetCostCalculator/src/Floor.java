public class Floor {

    private double width = 0.0;
    private double length = 0.0;

    public Floor(double width, double length) {
        if (width < 0) {
            this.width = 0.0;
        } else {
            this.width = width;
        }

        if (length < 0) {
            this.length = 0.0;
        } else {
            this.length = length;
        }
    }

    public double getArea() {
        return this.width * this.length;
    }

}
