public class Wilder{

        //attributs
        private String firstname;
        private boolean aware;


        //Constructeurs
        public Wilder(String firstname) {
                this.firstname = firstname;
                this.aware = true;
        }


        //getters
        public String getfirstname() {
        return this.firstname;
        }

        public boolean isaware() {
            return this.aware;
        }

        //setters
        public String setfirstname() {
        return this.firstname;
    }

        public void setaware(boolean aware) {
        this.aware = aware;
        }

        //Methode Instanciée
        public String whoAmI() {
            if(aware){
                return "My name is " + this.getfirstname() + " and I'm aware";    
            }
            else{
                return "My name is " + this.getfirstname() + " and I'm not aware";    
            }
            
        }



}