package database.pool;

import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Map;

public class ConnectionPool implements InitializingBean {
    private String username;
    private Integer poolSize;
    private List<Object> args;
    private Map<String, Object> properties;

    public ConnectionPool(String username,
                          Integer poolSize,
                          List<Object> args,
                          Map<String, Object> properties) {
        this.username = username;
        this.poolSize = poolSize;
        this.args = args;
        this.properties = properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    @PostConstruct
    private void init() {
        System.out.println("Init xml method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing bean");
    }
    @PreDestroy
    private void destroy() {
        System.out.println("Destroy xml method");
    }
}
