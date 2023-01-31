package Inheretance;

public class Doctor extends Hospital {
    public String dr_name;
    public int dr_id;




    public Doctor() {
    }

    public Doctor(int id, String name, String address) {
        super(id, name, address);
    }

    public Doctor(int id, String name) {
        super(id, name);
    }


    public String print (){
        System.out.println("Doctor id "+ this.getDr_id());
        System.out.println("Doctor name "+ this.getDr_name());

        return null;
    }


    public String getDr_name() {
        return dr_name;
    }

    public void setDr_name(String dr_name) {
        this.dr_name = dr_name;
    }

    public int getDr_id() {
        return dr_id;
    }

    public void setDr_id(int dr_id) {
        this.dr_id = dr_id;
    }
}
