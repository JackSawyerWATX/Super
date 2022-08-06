public class Reptile {
    // instance variable called skin with a initialized value of scales
    String skin = "scales";

    // no-argument Reptile constructor
    public Reptile() {
        System.out.println("I am in the Reptile parent constructor." + " All snakes are reptiles.");
    }

    // respiratory method with a String return type
    public String respiratory() {
        return "a pair of lungs.";
    }
}