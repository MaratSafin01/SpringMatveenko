package repo;

import bpp.InjectBean;
import bpp.Transaction;
import database.pool.ConnectionPool;
import entity.Company;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Transaction
public class CompanyRepository implements CrudRepository<Integer, Company> {


    @PostConstruct
    private void init(){
        System.out.println("init company repository");
    }

    @Override
    public Optional<Company> findById(int id) {
        System.out.println("find by id method");
        return Optional.of(new Company(id));
    }

    @Override
    public void delete(Company entity) {
        System.out.println("delete method");

    }
}
