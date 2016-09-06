import com.google.inject.Guice;
import com.google.inject.Inject;
import com.lanxiang.guice.ServiceModule;
import com.lanxiang.model.mongo.Education;
import com.lanxiang.model.mongo.UserInfo;
import org.junit.Before;
import org.junit.Test;
import org.mongodb.morphia.Datastore;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lanxiang on 16/9/6.
 */
public class TestMorphia {

    @Inject
    Datastore datastore;

    @Before
    public void initDataStore() {
        datastore = Guice.createInjector(new ServiceModule()).getInstance(Datastore.class);
    }

    @Test
    public void testSave() {
        UserInfo userInfo = new UserInfo();
        userInfo.setEmail("273109445@qq.com");
        userInfo.setWechat("wx_lanxiang");
        userInfo.setSalary(23333L);
        userInfo.setPhone("18615351030");
        Map<String, String> eduMap = new HashMap<String, String>();
        eduMap.put("分水小学", "1999-2005");
        eduMap.put("分水中学", "2005-2008");
        eduMap.put("万州中学", "2008-2012");
        eduMap.put("大连理工大学", "2012-2016");
        userInfo.setEducation(new Education(eduMap));
        datastore.save(userInfo);
    }
}
