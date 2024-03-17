public class Main {
    public static void main(String[] args) {

        LandPhone obj = new LandPhone("Land Phone",1980);
        ButtonPhone obj2 = new ButtonPhone("ButtonPhone",2002,"Nokia");
        TouchPhone obj3 =new TouchPhone("TouchPhone",2023,"Samsung","A03");

        System.out.println();

        obj.call();
        obj.Dial();

        System.out.println();

        obj2.call();
        obj2.Dial();
        obj2.SMS();


        System.out.println();


        obj3.call();
        obj3.Dial();
        obj3.SMS();
        obj3.PlayGames();



    }
}