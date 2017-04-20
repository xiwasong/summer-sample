package summer.sample.user.db;

import lombok.Data;

import java.sql.Date;

/**
 * Created by xw2sy on 2017-04-15.
 */
@Data
public class Product {
    private String  id ;
    private String  name ;
    private Integer  cate ;
    private Integer  band ;
    private String  img ;
    private Integer  level ;
    private Integer  recommend ;
    private Date  addTime ;
    private Date  updateTime ;
}
