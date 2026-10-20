package atividade.enumeracaotres.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import atividade.enumeracaotres.enums.OrderStatus;

public class Order {

    private Date moment;
    private OrderStatus status;

    private Client client;
    private List<OrdemItem> ordemItems = new ArrayList<>();

    public Order() {

    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrdemItem> getOrdemItems() {
        return ordemItems;
    }

    public void addItem(OrdemItem itens) {
        ordemItems.add(itens);
    }

    public void removeItem(OrdemItem itens) {
        ordemItems.remove(itens);
    }

    public double total() {
        double sum = 0.0;
        for (OrdemItem item : ordemItems) {
            sum += item.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order");
        sb.append("moment = ").append(moment);
        sb.append(", status = ").append(status);
        sb.append(", client = ").append(client);
        sb.append(", ordemItems = ").append(ordemItems);
        for (OrdemItem item : ordemItems) {
            sb.append(ordemItems + "\n");
            System.out.println(item);
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }

}
