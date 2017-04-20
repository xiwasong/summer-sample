package summer.sample.user.db;

import lombok.Data;

import java.sql.Date;

/**
 * Created by xw2sy on 2017-04-15.
 */
@Data
public class User {
    private Integer userId;
    private String   userAccount;
    private String   userName;
    private String   userPwd ;
    private  Integer  orgId ;
    private  Integer  userRole;
    private Date lastLoginTime ;
    private  String  lastLoginIp;
}
