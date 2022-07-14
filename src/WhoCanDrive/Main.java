package WhoCanDrive;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> whoCanDrive = new ArrayList<>();
        Logic.incomingListOfPeople();
        Logic.driverList(whoCanDrive);
    }
}
