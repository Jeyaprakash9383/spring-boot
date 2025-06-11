package com.techStack.controller;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private ProductClient prodClient;


    @PostMapping
    public Order addNewOrder(@RequestBody Order orderReq){

    }

    public Product getProductById(@PathVariable("id") String id) {
        return prodClient.getProductById(id);
    }

}
