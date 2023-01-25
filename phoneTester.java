package class11HW;

public class phoneTester {
    public static void main(String[] args) {
        phone iphone=new phone();
        iphone.name="iphone";
        iphone.version="iphone 14 pro max";
        iphone.color="white";
        iphone.price="$1200";

        iphone.camera();
        iphone.internet();
        iphone.weather();
    }
}
