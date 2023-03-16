package Work02.Unit05.PhoneBook;

import java.util.ArrayList;

public class Adressbook {
    ArrayList<Phonebook> pb=new ArrayList();

    public void Adressbook(){
        pb.add(new Phonebook("Adressbook Test Testing Posterior","88005553535","Москва"));
        pb.add(new Phonebook("Adressbook Иванов Иван Иванович","+78005553535","Иванов"));
    }

    public void showAddressBook(){
        for(Phonebook i:pb){
            System.out.println(i.getName()+" "+i.getPhone()+" "+i.getCity());
        }
    }
}