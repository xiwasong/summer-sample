package summer.sample.area.db;

import lombok.Data;
import java.sql.*;
import java.math.*;

/**
 * Created by summer.
 */
@Data
public class Address {
   private java.lang.Short addressId;
   private java.lang.String address;
   private java.lang.String address2;
   private java.lang.String district;
   private java.lang.Short cityId;
   private java.lang.String postalCode;
   private java.lang.String phone;
   private java.sql.Timestamp lastUpdate;

}