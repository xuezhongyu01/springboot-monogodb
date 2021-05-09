package rc.springbootmonogodb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rc.springbootmonogodb.dao.DemoDao;
import rc.springbootmonogodb.pojo.Demo;

import java.util.List;

@RestController
public class DemoController {

    @Autowired
    private DemoDao demoDao;
    @Autowired
    private MongoTemplate mongoTemplate;

    @RequestMapping("save")
    public String save() {
        Demo demoInfo = new Demo();
        demoInfo.setName("张三");
        demoInfo.setAge(20);
        demoDao.save(demoInfo);

        demoInfo = new Demo();
        demoInfo.setName("李四");
        demoInfo.setAge(30);
        demoDao.save(demoInfo);

        return "ok";
    }

    @RequestMapping("find")
    public List<Demo> find() {
        return demoDao.findAll();
    }

    @RequestMapping("findByName")
    public Demo findByName() {
        return demoDao.findByName("张三");
    }

    @RequestMapping("find2")
    public List<Demo> find2() {
        return mongoTemplate.findAll(Demo.class);
    }
}
