package summer.sample.sys.db;

import lombok.Data;
import java.sql.*;
import java.math.*;

/**
 * Created by summer.
 */
@Data
public class ZzSysParam {
   private java.lang.String sysParamId;
   private java.lang.String sysRootKey;
   private java.lang.String sysParentKey;
   private java.lang.String sysSubKey;
   private java.lang.String sysParamName;
   private java.lang.String sysParamKey;
   private java.lang.String sysParamValue;
   private java.lang.String sysParamContent;
   private java.lang.String modifyDatetime;
   private java.lang.String remarkString;

}