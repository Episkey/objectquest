public class Classroom{


        public static void main(String[] args){

            Wilder jaque = new Wilder("jaques");
            jaque.setaware(false);
            System.out.println(jaque.whoAmI());
            jaque.setaware(true);
            System.out.println(jaque.whoAmI());


            Wilder alfred = new Wilder("alfred");
            alfred.setaware(false);
            System.out.println(alfred.whoAmI());
            jaque.setaware(true);
            System.out.println(alfred.whoAmI());

            Wilder garry = new Wilder("garry");
            garry.setaware(false);
            System.out.println(garry.whoAmI());
            jaque.setaware(true);
            System.out.println(garry.whoAmI());


        }


}