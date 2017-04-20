package summer.sample.area.db;

import lombok.Data;
import java.sql.*;
import java.math.*;

/**
 * Created by summer.
 */
@Data
public class SysConfig {
   private java.lang.String variable;
   private java.lang.String value;
   private java.sql.Timestamp setTime;
   private java.lang.String setBy;

}