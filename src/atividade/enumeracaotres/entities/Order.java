package atividade.enumeracaotres.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import atividade.enumeracao.entities.HorasContrato;
import atividade.enumeracaotres.enums.OrderStatus;

public class Order {

    private Date moment;
    private OrderStatus status;

    private List<OrdemItem> ordemItems = new ArrayList<>();

    public Order() {

    }

    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
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

    public List<OrdemItem> getOrdemItems() {
        return ordemItems;
    }

    public void addItem(OrdemItem itens) {
        ordemItems.add(itens);
    }

    public void removeItem(OrdemItem  itens) {
        ordemItems.remove(itens);
    }
}
