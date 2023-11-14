package com.turkcell.spring.starter.controllers;



        import com.turkcell.spring.starter.entities.Order;
        import com.turkcell.spring.starter.repositories.OrderRepositories;
        import org.springframework.http.HttpStatus;
        import org.springframework.http.ResponseEntity;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("orders")
public class OrderController {
    private final OrderRepositories orderRepositories;

    public OrderController(OrderRepositories orderRepositories) {
        this.orderRepositories = orderRepositories;
    }

    @GetMapping()
    public List<Order> getOrders(){
        List<Order> orderList=orderRepositories.findAll();
        return orderList;
    }

    @GetMapping("getById")
    public Order getById(@RequestParam("id") int id){
        Order order= orderRepositories.findById(id).orElseThrow();
        return order;
    }

    @PostMapping()
    public ResponseEntity addOrder(@RequestBody Order order){
        orderRepositories.save(order);
        return new ResponseEntity(("sipariş eklendi"), HttpStatus.CREATED);
    }
}
