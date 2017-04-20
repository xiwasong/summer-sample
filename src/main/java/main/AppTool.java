package main;

import cn.hn.java.summer.db.mapper.EntityGenerator;
import cn.hn.java.summer.db.mapper.rule.MysqlTypeMapperRule;
import cn.hn.java.summer.db.mapper.rule.UnderlinedBeanMapperRule;

import java.io.IOException;
import java.net.URISyntaxException;

public class AppTool
{
    public static void main( String[] args ) throws IOException, URISyntaxException {
        new EntityGenerator(
                new UnderlinedBeanMapperRule(""),
                new MysqlTypeMapperRule()
        ).autoGenEntity("/src/main/java","src/main/resources");
    }

}