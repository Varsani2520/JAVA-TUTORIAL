

class Person {
    // desfine var for encapsulation
    private int age = 10;
    private String name = "varsani";
    private String surname;

    // constructor initialize the surmae
    public Person(String surname) {
        this.surname = surname;
    }

    // get surname
    public String getSurname() {
        return surname;
    }

    // set surname
    public void setSurname(String surname) {
        this.surname = surname;
    }

    // get private data
    public int getAge() {
        return age;
    }

    // get name
    public String getName() {
        return name;
    }

    // set age
    public void setAge(int a) {
        age = a;
    }

    // set name
    public void setName(String n) {
        name = n;
    }

}

class Encapsulations {
    public static void main(String[] args) {

        Person p = new Person("Patel");
        // acess initial value
        System.out.println("get age: " + p.getAge());
        System.out.println("get name: " + p.getName());
        System.out.println("Initial surname: " + p.getSurname());

        // modify value
        p.setAge(40);
        p.setName("rjni");
        p.setSurname("Sharma");
        // display updated value
        System.out.println("Updated age: " + p.getAge());
        System.out.println("Updated name: " + p.getName());
        System.out.println("Updated surname: " + p.getSurname());


    }
}

// encapsulation means hide the data info doens not irectly acess in public

// make encapsulation use private keyword and get then make method for get data
// and return that same as set

// short cut of get and set method made directly right click and selection
// source action and click get and set after that select variable what you want

// constructor has 2 type
// default and parameter

// defalut is Person(){

// }
// and parameter means Person(String surname){

// }