class strin{
     void sri()
     {
          System.out.println("Base");
     }
}
public class test extends strin{
     void sri()
     {

          System.out.println("Derived");
     }
     public static void main(String[] args) {
          strin t = new strin();
          t.sri();
     }
}
