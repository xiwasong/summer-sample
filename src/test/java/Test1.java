import cn.hn.java.summer.db.mapper.EntityGenerator;
import cn.hn.java.summer.db.mapper.rule.MysqlTypeMapperRule;
import cn.hn.java.summer.db.mapper.rule.UnderlinedBeanMapperRule;
import org.apache.commons.lang3.ClassUtils;
import org.testng.annotations.Test;
import summer.sample.user.model.User;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

/**
 * Created by xw2sy on 2017-04-14.
 */
public class Test1 {

    @Test
    public void testGetClasses(){
        List<Class<?>> clz= ClassUtils.getAllSuperclasses(User.class);
        for(Class c:clz){
            System.out.println(c.getName());
        }
    }

    @Test
    public void testGetClassName(){
        System.out.println(Test1.class.getSimpleName());
    }

    @Test
    public void testGenEntity() throws URISyntaxException, IOException {
        new EntityGenerator(new UnderlinedBeanMapperRule(""),new MysqlTypeMapperRule()).genAllEntity("/src/main/java","src/main/resources",false);
    }
}
