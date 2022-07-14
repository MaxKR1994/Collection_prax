package WhoCanDrive;

import java.util.ArrayList;
import java.util.List;

public class Logic {

    public static List<Person> getListOfPerson(){
        List<Person> listOfPerson = new ArrayList<>();
        listOfPerson.add(new Person("Max",27,true,550));
        listOfPerson.add(new Person("David",15,false,1000));
        listOfPerson.add(new Person("Daria",26,false,1000));
        listOfPerson.add(new Person("John",35,true,120));
        listOfPerson.add(new Person("Olga",19,true,365));
        listOfPerson.add(new Person("Denis",48,true,65));
        listOfPerson.add(new Person("Demian",29,true,503));
        return listOfPerson;
    }

    public static List<Person> getListWhoCanDrive(List<Person> whoCanDrive){
        for(Person person : getListOfPerson()){
            if (person.isDriverLicence() && person.getAge() >= 16 && person.getDayWithoutPenalty() >= 366){
                whoCanDrive.add(person);
            }
        }
        return whoCanDrive;
    }

    public static void incomingListOfPeople (){
        System.out.println("Incoming list of people: ");
        System.out.println(getListOfPerson());
    }

    public static void driverList(List<Person> listOfPerson){
        System.out.println("List of people who are allowed to drive: ");
        System.out.println(getListWhoCanDrive(listOfPerson));
    }

}
