package Suhang;

public class Maintest {

    public static void main(String[] args) {
        
        Person person = new Person("�ڼ���");
        PoliceOffice policeOffice = new PoliceOffice("�ڼ���");
        
        person.use();
        policeOffice.use();
        
        policeOffice.survey();
        policeOffice.survey("������");
        
        //�������̵�
        person.use();
        policeOffice.use();
        
        //�����ε�
        policeOffice.survey();
        policeOffice.survey("������");
    }
    
}
