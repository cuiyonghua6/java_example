package useful_tools;

import java.sql.*;

public class MySQLDemo {	public static void main(String[] args) throws Exception {
    // 1.导入驱动jar包
//    mysql-connector-java-5.1.22-bin.jar
    // 2.注册驱动
//    Class.forName("com.mysql.jdbc.Driver");
    System.out.println("succese");// 测试加载驱动有没有成功，成功就打印succese
    // 3.建立数据库连接，获取数据库连接对象conn
		/*
		 语法：jdbc:mysql://ip地址（域名）:端口号/数据库名称
         例子：jdbc:mysql://localhost:3306/news
         如果连接的是本地mysql服务器，并且mysql服务默认端口是3306，则url可以简写为：jdbc:mysql://数据库名称 user:用户名，password:密码
		 */
    String url = "jdbc:mysql://123.56.67.212:3306/weixx";// 声明数据库news的url
    String user = "wxx";// 数据库账号
    String password = "654321";// 数据库密码
    Connection conn = DriverManager.getConnection(url, user, password);
    // 4.定义SQL语句
    String sql = "SELECT * FROM `account`";// 查询语句
    // 5.获取执行sql的对象 Statement
    Statement stmt = (Statement) conn.createStatement();
    // 6.执行sql
    stmt.execute(sql);
    ResultSet rs = stmt.getResultSet();// 把查询的结果赋值给结果集对象
//    System.out.println("学生ID\t  \t账号\t \t密码\t \t姓名\t \t性别");
//    // 7.处理结果，输出查询语句
//    while (rs.next()) {// 遍历结果集
//        System.out.print(rs.getString("studentid") + "\t" + "\t");
//        System.out.print(rs.getString("number") + "\t" + "\t");
//        System.out.print(rs.getString("password") + "\t" + "\t");
//        System.out.print(rs.getString("name") + "\t" + "\t");
//        System.out.println(rs.getString("sex") + "\t" + "\t"); }
    // 8.释放资源
    rs.close();
    stmt.close();
    conn.close();
    }
}
