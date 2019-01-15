package entity;

/**
 * Created by LXX on 2019/1/15.
 */
public class DefaultValueCache {

    private String mysqlPath = "C:\\Program Files\\MySQL\\MySQL Server 5.7";

    public static DefaultValueCache instance = new DefaultValueCache();

    private DefaultValueCache(){

    }
    public String getMysqlPath() {
        return mysqlPath;
    }

    public void setMysqlPath(String mysqlPath) {
        this.mysqlPath = mysqlPath;
    }
}
