import database.pool.ConnectionPool;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import repo.CompanyRepository;

public class AppRunner {
    public static void main(String[] args) {
        // clazz -> String -> Map<String, Object>
        try (var context = new ClassPathXmlApplicationContext("application.xml")) {
            System.out.println(context.getBean("pool1", ConnectionPool.class));

            System.out.println(context.getBean("companyRepository", CompanyRepository.class));
        }
    }
}
