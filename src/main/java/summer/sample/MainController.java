package summer.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xw2sy on 2017-04-16.
 */
@Controller
@RequestMapping("/")
public class MainController {

    @RequestMapping("/index")
    public void index(){
    }

}
