package main;

import cn.hn.java.summer.Config;
import cn.hn.java.summer.db.mapper.rule.IBeanMapperRule;
import cn.hn.java.summer.db.mapper.rule.UnderlinedBeanMapperRule;
import cn.hn.java.summer.web.WebApp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
@SpringBootApplication(scanBasePackages={"summer.sample"})
@Configuration()
@EnableTransactionManagement
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class App extends WebApp
{
    public static void main( String[] args )
    {
        Config.dbBeanScanFilter=".*sample.*db";
    	SpringApplication.run(App.class);
    }

    @Bean
    public IBeanMapperRule getBeanMapperRule(){
        return new UnderlinedBeanMapperRule();
    }
}