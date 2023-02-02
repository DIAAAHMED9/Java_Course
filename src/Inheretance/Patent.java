package Inheretance;

public class Patent extends Hospital {
    private String pa_name;
    private int pa_id;

//    public void get(){
//        System.out.println("Test Patent ");
//    }


    public Patent(String pa_name, int pa_id) {
        this.pa_name = pa_name;
        this.pa_id = pa_id;
    }

    public Patent(int id, String name, String address, String pa_name, int pa_id) {
        super(id, name, address);
        this.pa_name = pa_name;
        this.pa_id = pa_id;
    }

    public Patent(int id, String name, String pa_name, int pa_id) {
        super(id, name);
        this.pa_name = pa_name;
        this.pa_id = pa_id;
    }

    public Patent() {

    }

    public String getPa_name() {
        return pa_name;
    }
    public void setPa_name(String pa_name) {
        this.pa_name = pa_name;
    }

    public int getPa_id() {
        return pa_id;
    }

    public void setPa_id(int pa_id) {
        this.pa_id = pa_id;
    }

    @Override
    public void abb() {

    }

    @Override
    public String abb1() {
        return null;
    }

    @Override
    public String toString() {
        return "Patent{" +
                "pa_name='" + pa_name + '\'' +
                ", pa_id=" + pa_id +
                ", id=" + getId() +
                ", name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                '}';
    }

    public String print() {
        System.out.println("Patent id " + this.getPa_name());
        System.out.println("Patent name " + this.getPa_id());
        return null;
    }

    public void print(int a, int b) {

    }

}
