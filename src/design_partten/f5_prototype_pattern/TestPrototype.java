package design_partten.f5_prototype_pattern;

import java.io.IOException;

/**
 * 测试类
 * CSDN博客地址：https://blog.csdn.net/cui_yonghua/article/details/90789695
 */
public class TestPrototype {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        People p1 = new People("张三");
        p1.setPersonalInfo("男",23);
        p1.setWorkExperience("2016-2019","百度");
        People clone = (People) p1.clone(); //浅复制
        clone.setPersonalInfo("男",20);
        clone.setWorkExperience("2017-2022","腾讯");

        p1.display();
        clone.display();

        People p2 = new People("李四");
        p2.setPersonalInfo("女",20);
        p2.setWorkExperience("2018-2020","美团");
        People deepClone = (People)p2.deepClone(); //深复制
        deepClone.setPersonalInfo("女",22);
        deepClone.setWorkExperience("2018-2019","百度外卖");

        p2.display();
        deepClone.display();
    }
}


