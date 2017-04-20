package summer.sample.user;

import cn.hn.java.summer.db.BaseDao;
import cn.hn.java.summer.db.multiple.DataSource1;
import org.springframework.stereotype.Service;
import summer.sample.user.db.Product;
import summer.sample.user.model.User;

import java.util.List;

/**
 * Created by xw2sy on 2017-04-15.
 */
@Service
public class UserService extends BaseDao<DataSource1>{

    public List<User> getUsers(){
        return this.list(User.class);
    }

    public List<Product> getProducts(Product product){
        return this.list(Product.class,product);
    }
}
