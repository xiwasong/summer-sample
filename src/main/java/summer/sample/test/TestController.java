package summer.sample.test;

import cn.hn.java.summer.db.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import summer.sample.test.db.Actor;

import java.util.List;

/**
 * Created by xw2sy on 2017-04-19.
 */
@Controller()
@RequestMapping("/test")
public class TestController {
    @Autowired
    BaseDao baseDao;

    @RequestMapping("/actors")
    public List<Actor> getActors(){
        return baseDao.list(Actor.class);
    }
}
