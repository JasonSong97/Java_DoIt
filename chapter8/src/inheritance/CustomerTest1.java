package inheritance;

public class CustomerTest1 {
   public static void main(String[] args) {
      Customer customerLee = new Customer(10020, "이순신");
      customerLee.bonusPoint = 1000;
      System.out.println(customerLee.showCustomerInfo());

      VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 9901);
      customerKim.bonusPoint = 10000;
      System.out.println(customerKim.showCustomerInfo());
   }
}
