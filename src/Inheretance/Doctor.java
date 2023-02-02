package Inheretance;

public class Doctor extends Hospital {

    String dr_name;
    int dr_id;


    @Override
    public void abb() {

    }

    @Override
    public String abb1() {
        return null;
    }

    public String print() {
        System.out.println("Doctor id " + this.getDr_id());
        System.out.println("Doctor name " + this.getDr_name());

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
