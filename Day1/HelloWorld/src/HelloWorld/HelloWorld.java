package HelloWorld;

public class HelloWorld {

    public static void main(String[] args) {

        // Viet mot chuong trinh de in ra thong tin ca nhan cua ban than
        // Kieu du lieu so nguyen: int Integer 1  3 4 5 9 10 - long Long
        // Kieu du lieu so thuc: float double: 1.3 4.5
        // Kieu du lieu chuoi: String "Hello World"
        // Kieu du lieu luan li: boolean True or False
        // Bien la mot doan ma ngan luu tru vi tri hoac gia tri cua du lieu ma no tro toi va gia tri co the
        // thay doi duoc
        // x = 10 -> x : 0x0011
        // <kieuduleu> tenbien;

        int n;
        float f;
        String s;
        boolean b;

        // Khoi tao bien a co kieu du lieu la int va gia tri la 10
        // Muon khoi tao mot bien mang mot gia tri thi
        // <kieudulieu> tenbien = giatri;
        int a = 10;
        System.out.println(a);
        a = 20;
        System.out.println(a);

        // float muon khoi tao ta phai them f hoac F o sau gia tri
        float k = 1.2F; // 1.2 -> double
        double d = 1.2; // Mac dinh bat ke gia tri co dau phay dong
        // deu la double

        // String
        String str = "Hello Everyone";
        System.out.println(str);

        // boolean
        boolean bool = false;
        System.out.println(bool);

        // In ra man hinh kem theo mo ta
        System.out.print("Boolean = " + bool + "\n");
        System.out.printf("Integer = %s %d", str, a); // %s String, %d int, %c char
        // %f float double

        // Viet chuong trinh voi bien name la ten ca nhan
        // In ra man hinh chuoi My name is + name

    }
}
