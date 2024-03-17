public class ButtonPhone extends LandPhone{

    String Brand;

    ButtonPhone(String Name,int year,String Brand){

        super(Name,year);
        this.Brand=Brand;
    }

    void SMS(){
        System.out.println(Name+"can sent SMS");
    }
}