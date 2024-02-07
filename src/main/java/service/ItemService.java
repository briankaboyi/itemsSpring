package service;

import Dao.ItemDao;
import entity.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    private final ItemDao itemDao;

    public ItemService(ItemDao itemDao) {
        this.itemDao = itemDao;
    }

    public  List<Item> getAllItems() {
        return itemDao.findAll();
    }
}
