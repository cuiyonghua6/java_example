package design_partten.f5_prototype_pattern;

import java.io.Serializable;

/**
 * 工作经历 实现序列化接口
 */
public class WorkExperience implements Serializable {
    private static final long serialVersionUID = 1L;
    private String workDate;
    private String company;

    //提供getter/setter方法
    public String getWorkDate() { return workDate; }
    public void setWorkDate(String workDate) { this.workDate = workDate; }
    public String getCompany() { return company; }
    public void setCompany(String company) { this.company = company; }

}