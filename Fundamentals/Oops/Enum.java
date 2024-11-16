enum status {
    pending, approved, rejected
}

enum size {
    SMALL("S"), MEDIUM("M"), LARGE("L");

    private String s;

    size(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

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

        size s = size.LARGE;
        System.out.println("Selected size: " + s);
        System.out.println("Abbreviation: " + s.getS());
    }
}
// enum stand for enumrable and contain collection of similar data type value
// and fixed size and doent change value