package controller;

import entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.ItemService;

import java.util.List;

@RestController
//@RequestMapping
public class ItemController {
    @Autowired
    ItemService service;
    @GetMapping("/items")
    public List<Item> getAllItems(){

        return service.getAllItems();
    }
    @GetMapping("/home")
    public ResponseEntity<String> sayhello(){
        return ResponseEntity.ok("hello world");
    }
}
