package enumeracoes.application;

import enumeracoes.entities.Order;
import enumeracoes.enums.OrderStatus;

import java.util.Date;

public class Enumeracao {
    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);
    }
}
