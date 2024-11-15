enum status {
    pending, approved, rejected
}

public class Enum {
    public static void main(String[] args) {
        // Assign an enum value to a variable
        status currentStatus = status.approved; // Status is set to "approved"
        System.out.println("Current Status: " + currentStatus);

        status[] allStatus = status.values();
        for (int i = 0; i < allStatus.length; i++) {
            System.out.println("index" + i + ":" + allStatus[i]);
        }
        // for (status s : allStatus) {
        // System.out.println(s);
        // }
    }
}
// enum stand for enumrable and contain collection of similar data type value
// and fixed size and doent change value