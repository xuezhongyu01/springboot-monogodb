package rc.springbootmonogodb.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import rc.springbootmonogodb.pojo.Demo;

public interface DemoDao extends MongoRepository<Demo,String> {
    Demo findByName(String name);
}
