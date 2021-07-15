package useful_tools;

import java.sql.*;
/** *//**
 * @author Administrator
 */
public class MySQLDemo1 {
    private Connection con = null;
    private Statement stmt = null;
    private String url = "jdbc:mysql://localhost/test";
    private String user = "root";
    private String pwd = "0429";
    /** *//** Creates a new instance of Operation */
    public MySQLDemo1() {
        init();
    }
    /** *//** init */
    private void init(){
        try {
            Class.forName("org.gjt.mm.mysql.Driver").newInstance();
            con = DriverManager.getConnection(url,user,pwd);
            stmt = con.createStatement();
        } catch (Exception e){
            // your installation of JDBC Driver Failed
            e.printStackTrace();
        }
    }
    /** *//**
     * TODO 增加一条记录
     * @param sn     学生名字
     * @param ss     学生性别
     * @param sa     学生年龄
     * @param so     学生专业
     * @return void
     */
    public void add(String sn,String ss,String sa,String so){
        String sql2 = "insert into student value('"
                +sn+"','"+ss+"','"+sa+"',`"+so+"`);";
        try{
            stmt.execute(sql2);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    /** *//**
     * TODO 查询记录
     * @param sn 记录的学生姓名
     * @return String 查询的结果
     */
    public String search(String sn){
        String str = "so ：sa ："+sn+" ss：";
        String sql1 = "select * from student where sn='"+sn+"';";
        try{
            ResultSet rs = stmt.executeQuery(sql1);
            if(rs.next()){
                str = str+rs.getString("sn")+" 手机号："
                        +rs.getString("sa");
            }else str = "该记录不存在！！！";
        }catch(Exception e){
            e.printStackTrace();
        }
        return str;
    }
    /** *//**
     * TODO 修改记录
     * @param sn    学生姓名
     * @param ss    该学生性别
     * @parame sa   学生的年龄
     * @return void
     */
    public void modify(String sn,String ss){
        String sql = "update sturesult set ss="+ss
                +" where sn='"+sn+"'";
        try{
            stmt.executeUpdate(sql);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    /** *//**
     * TODO 删除记录
     * @param sn 学生姓名
     * @return void
     */
    public void delete(String sn){
        String sql1 = "delete from teststudent "+" where sn='"+sn+"';";
        try{
            stmt.executeUpdate(sql1);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    /**关闭连接*/
    public void close(){
        try{
            if(con != null) con.close();
            if(stmt != null) stmt.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String args[])throws Exception{
        //add test here!!!!
        System.out.println("ghost is a big worry");


    }
}