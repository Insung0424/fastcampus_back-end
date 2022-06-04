package ch08;

public class OrderTest {

	public static void main(String[] args) {
		Order order = new Order();
		order.orderNumber = "202205300003";
		order.orderPhone = "01012345678";
		order.orderAddress = "seoul";
		order.orderDate = "20220530";
		order.orderHour = "201115";
		order.orderPrice = "35000";
		order.orderProductNumber = "0003";
		
		System.out.println("주문접수번호 :"+order.orderNumber);
		System.out.println("주문핸드폰번호 :"+order.orderPhone);
		System.out.println("주문집주소 :"+order.orderAddress);
		System.out.println("주문날짜 :"+order.orderDate);
		System.out.println("주문시간 :"+order.orderHour);
		System.out.println("주문가격 :"+order.orderPrice);
		System.out.println("주문번호 :"+order.orderProductNumber);
	}

}
