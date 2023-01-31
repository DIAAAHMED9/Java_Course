package Inheretance;

public class Patent extends Hospital {
    public String pa_name;
    public int pa_id;

    @Override
    public String toString() {
        return "Patent{" +
                "pa_name='" + pa_name + '\'' +
                ", pa_id=" + pa_id +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String print (){
        System.out.println("Patent id "+ this.getPa_name());
        System.out.println("Patent name "+ this.getPa_id());
        return null;
    }
    public void print (int a,int b){

    }
    public Patent() {
    }


    public Patent(int id, String name, String address) {
        super(id, name, address);
    }

    public Patent(int id, String name) {
        super(id, name);
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

    public void setPa_id(int i) {
        this.pa_id = pa_id;
    }
}
