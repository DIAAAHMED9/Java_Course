package OOP;

public class Market {
    private int product_id;
    private String product_name;
    private int price;
    private String section;

    public Market() {
    }

//     Main
//        Market m1 = new Market();
//        Market m2 = new Market(7,"Drink");
//        Market m3 = new Market("Milk",30);

//        System.out.println(m3.getProduct_name());
//
//        m1.setProduct_id(3);
//        System.out.println(m1.getProduct_id());
//        System.out.println(m2.getProduct_id());

    public Market(int product_id, int price) {
        this.product_id = product_id;
        this.price = price;
    }
    //
////1
//    public Market() {
//        this.product_id = 5;
//        this.product_name = "Milk";
//        this.price = 30;
//        this.section = "Drink";
//
//    }
////   2
//    public Market(int product_id, String section) {
//        this.product_id = product_id;
//        this.section = section;
//    }
//// 3
//    public Market(String product_name , int price) {
//        this.product_name = product_name;
//        this.price = price;
//    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;

    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

//    }

    //
//    int number (int num){
//        return num*num;
//    }
//
//    boolean getItems(){
//        System.out.println(" product_id is _ "+product_id +"   product_name is _ " +
//                ""+product_name+" price is _ " +
//                ""+price+" section is _ "+section);
//         return false;
//    }
//
////        Scanner Scan =new Scanner();
//        Market item = new Market();
//        Market item1 = new Market();
//        item.product_id=1;
//        item.product_name ="milk";
//        item.price=40;
//        item.section ="Drink";
//
//        System.out.println(item.product_name);
//
//        item1.product_id=2;
//        item1.product_name ="Coffee";
//        item1.price=20;
//        item1.section ="Drink";
//        System.out.println(item1.section);
//
//        System.out.println("___________________________");
//
//        Market[] items ={item,item1};
//        for (int i = 0; i < items.length; i++) {
//
//            items[i].getItems();
//        }
////
////
}

