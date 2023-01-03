public class Classroom {
    public static void main(String[] args){

        // studentOne receives a reference to a new instance of the Wilder class
        Wilder studentOne = new Wilder("Yacine",true);
        
        // getters usage
        System.out.println("1. Student1 name is : " + studentOne.getFirstName());
        System.out.println("2. It is aware ? " + studentOne.isAware());

        // setter usage
        studentOne.setFirstName("Lauent");
        System.out.println("3. Now the firstName is " + studentOne.getFirstName());

        // instance method
        Wilder studentTwo = new Wilder("Andy",false);
        System.out.println("4.Instance method whoAmI : " + studentTwo.whoAmI());
    }
}
