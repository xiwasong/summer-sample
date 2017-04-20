package summer.sample.user.db;

import lombok.Data;
import java.sql.*;
import java.math.*;

/**
 * Created by summer.
 */
@Data
public class MgUser {
   private java.lang.String userAccount;
   private java.lang.String userName;
   private java.lang.String userPwd;
   private java.lang.String lastLoginIp;

}