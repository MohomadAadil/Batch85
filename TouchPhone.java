public class TouchPhone extends ButtonPhone{

    String Model;

    TouchPhone(String Name,int year, String Brand, String Model){
        super(Name,year,Brand);
        this.Model=Model;

    }

    void PlayGames(){
        System.out.println(Name+"is can play games in it");
    }
}
