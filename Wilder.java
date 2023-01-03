public class Wilder {
    
        // attributes
        private String firstName;
        private boolean aware;

        // constructors
        public Wilder(String firstName, boolean aware) {
            this.firstName = firstName;
            this.aware = aware;
        }

        // getters
        public String getFirstName(){
            return this.firstName;
        }

        public boolean isAware(){
            return this.aware;
        }

        // setters
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setAware(boolean aware) {
            this.aware = aware;
        }

        //method
        public String whoAmI(){
            return  (this.aware == true) ? "Je m'appelle " + this.firstName + " et je suis aware" : "Je m'appelle " + this.firstName + " et je ne suis pas aware";
        }
}
