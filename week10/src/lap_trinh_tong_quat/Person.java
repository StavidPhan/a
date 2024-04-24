package lap_trinh_tong_quat;

public class Person implements Comparable<Person> {
    protected String name;
    protected int age;
    protected String address;

    /**
     * Constructor 1.
     */
    public Person() {
        this.name = "";
        this.age = 0;
        this.address = "";
    }

    /**
     * Constructor 2.
     */
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * compareTo.
     */
    @Override
    public int compareTo(Person o) {
        int nameCompare = name.compareTo(o.getName());
        if (nameCompare != 0) {
            return nameCompare;
        }
        return Integer.compare(age, o.getAge());
    }
}
