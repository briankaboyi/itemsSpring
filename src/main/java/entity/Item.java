package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Item {
    private Integer id;
    private String name;
    private Integer price;

}
