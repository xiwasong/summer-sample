package summer.sample.test.db;

import lombok.Data;
import java.sql.*;
import java.math.*;

/**
 * Created by summer.
 */
@Data
public class Actor {
   private java.lang.Short actorId;
   private java.lang.String firstName;
   private java.lang.String lastName;
   private java.sql.Timestamp lastUpdate;

}