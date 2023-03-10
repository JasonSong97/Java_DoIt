package inheritance;

public class OverridingTest3 {
   public static void main(String[] args) {
      int price = 10000;

      Customer customerLee = new Customer(10010, "이순신");// Customer 인스턴스 생성
      System.out.println(customerLee.getCustomerName() + " 님이 지불해야 하는 금액은" + customerLee.calcPrice(price) + "원입니다.");

      VIPCustomer customerKim = new VIPCustomer(10010, "이순신", 9901);// VIPCustomer 인스턴스 생성
      System.out.println(customerKim.getCustomerName() + " 님이 지불해야 하는 금액은" + customerKim.calcPrice(price) + "원입니다.");

      Customer vc = new VIPCustomer(10010, "이순신", 9902);// VIPCustomer 인스턴스를 Customer형으로 변환!
      System.out.println(vc.getCustomerName() + " 님이 지불해야 하는 금액은" + vc.calcPrice(price) + "원입니다.");
   }
}
