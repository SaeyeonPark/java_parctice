package Suhang;

public class Maintest {

    public static void main(String[] args) {
        
        Person person = new Person("박세연");
        PoliceOffice policeOffice = new PoliceOffice("박세연");
        
        person.use();
        policeOffice.use();
        
        policeOffice.survey();
        policeOffice.survey("범죄자");
        
        //오버라이딩
        person.use();
        policeOffice.use();
        
        //오버로딩
        policeOffice.survey();
        policeOffice.survey("범죄자");
    }
    
}
