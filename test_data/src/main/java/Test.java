import com.github.jsonzou.jmockdata.JMockData;
import com.github.jsonzou.jmockdata.MockConfig;

/**
 * Created by hnx on 2018/7/27.
 */
public class Test {

    public static void main(String[] args) {
        MockConfig mockConfig = new MockConfig();
        mockConfig.dateRange("2018-07-16", "2018-07-29");
        User basicBean = JMockData.mock( User.class, mockConfig);
        System.out.println(1111);
    }
}
