package Inheretance;

public abstract class Hospital {
    private int id;
    private String name;
    private String address;


    public abstract void abb();

    public abstract String abb1();

    public void get() {
        System.out.println("Test Hospital ");
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String print() {
        System.out.println("Hospital id " + this.getId());
        System.out.println("Hospital name " + this.getName());
        return null;

    }

    public Hospital() {
    }

    public Hospital(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Hospital(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
