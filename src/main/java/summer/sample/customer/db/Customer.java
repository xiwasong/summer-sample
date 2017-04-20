package summer.sample.customer.db;

import lombok.Data;
import java.sql.*;
import java.math.*;

/**
 * Created by summer.
 */
@Data
public class Customer {
   private java.lang.Short customerId;
   private java.lang.Byte storeId;
   private java.lang.String firstName;
   private java.lang.String lastName;
   private java.lang.String email;
   private java.lang.Short addressId;
   private java.lang.Byte active;
   private java.sql.Timestamp lastUpdate;

}