package summer.sample.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import summer.sample.user.db.Product;
import summer.sample.user.model.User;

import java.util.List;

/**
 * Created by xw2sy on 2017-04-14.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/get")
    public User getUser(){
        return new User();
    }

    @RequestMapping("/list")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @RequestMapping("/products")
    public List<Product> getProducts(Product product){
        return userService.getProducts(product);
    }
}
