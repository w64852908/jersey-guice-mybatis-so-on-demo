import com.google.inject.Guice;
import com.google.inject.Inject;
import com.lanxiang.guice.ServiceModule;
import com.lanxiang.model.mongo.Education;
import com.lanxiang.model.mongo.UserInfo;
import org.junit.Before;
import org.junit.Test;
import org.mongodb.morphia.Datastore;

import java.util.*;

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
        userInfo.setEmail("lanxiang@mail.com");
        userInfo.setWechat("wx_lanxiang");
        userInfo.setSalary(23333L);
        userInfo.setPhone("16688887777");
        Map<String, String> eduMap = new HashMap<String, String>();
        eduMap.put("Water Primary School", "1999-2005");
        eduMap.put("Water Middle School", "2005-2008");
        eduMap.put("Water High School", "2008-2012");
        eduMap.put("DUT", "2012-2016");
        userInfo.setEducation(new Education(eduMap));
        userInfo.setUserId("uid_1b9b96b2-e562-40ed-941b-ecb5a3e69638");
        List<String> friends = new ArrayList<String>();
        friends.add("Dva");
        friends.add("Mei");
        friends.add("Hanzo");
        userInfo.setFriends(friends);
        datastore.save(userInfo);
    }
}
