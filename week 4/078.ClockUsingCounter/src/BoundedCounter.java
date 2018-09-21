public class BoundedCounter {
    private int value = 0;
    private int upperLimit;

    public BoundedCounter (int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public void next () {
        if (value >= upperLimit) {
            value = 0;
        } else {
            value++;
        }

    }

    public String toString() {
        if (value < 10) {
            return "0"+value;
        } else {
            return ""+ value;
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value >= 0 && value <= upperLimit) {
            this.value = value;
        }
    }
}
