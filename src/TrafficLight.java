public class TrafficLight {
    private String state;

    public TrafficLight (String state) {
        this.state = state;
    }

    public void setLightRed() {
        this.state = "Red";
    }

    public void setLightGreen() {
        this.state = "Green";
    }

    public void setLightYellow() {
        this.state = "Yellow";
    }
    
    public String toString() {
        return this.state;
    }

    public static void main(String[] args) {
        TrafficLight numba1 = new TrafficLight("Green");

        System.out.println(numba1.toString());
        numba1.setLightRed();
        System.out.println(numba1.toString());
    }
}
