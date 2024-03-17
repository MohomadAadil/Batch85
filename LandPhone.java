public class LandPhone {
        String Name;
        int year;

        LandPhone(String Name, int year){
            this.Name=Name;
            this.year=year;
        }

        void call(){
            System.out.println(Name+"Can call...");
        }
        void Dial(){
            System.out.println("By using"+Name +"We can dial pjhone number");

        }
}


