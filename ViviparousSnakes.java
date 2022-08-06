public class ViviparousSnakes extends Reptile {
 
    // No-argument ViviparousSnakes constructor with a call to the parent no-argument constructor
    public ViviparousSnakes() {
     super();
     System.out.println("I am a snake therefore I am a Reptile. " + "I used the super() in my constructor to call my parent Object. ");
    }
    
    // no return type breathe method that calles the respiratory method from the parent class.
    public void breathe() {
     System.out.println("Most reptiles have " + super.respiratory() 
     + " Snakes differ as they only have one lung.");
    }
   
    
    // no return type method called skinType that references the parent class instance variable.
    public void skinType() {
     System.out.println("All reptiles have " + super.skin + "!");
    }
   }
   