package core_java.a1_basic_test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class AddStudent extends JFrame implements ActionListener {
    JLabel JL = new JLabel("添 加 基 本 信 息", JLabel.CENTER);//使用文本创建一个标签对象
    JLabel JLNumber = new JLabel("学号:");        //使用文本创建一个标签对象
    JTextField JTNumber = new JTextField();            //创建一个文本框对象
    JLabel JLName = new JLabel("姓名:");        //使用文本创建一个标签对象
    JTextField JTName = new JTextField();            //创建一个文本框对象
    JLabel JLClass = new JLabel("班级:");        //使用文本创建一个标签对象
    JTextField JTClass = new JTextField();            //创建一个文本框对象
    JLabel JLsex = new JLabel("性别:");        //使用文本创建一个标签对象
    ButtonGroup BG = new ButtonGroup();            //创建一个ButtonGroup组件对象
    JRadioButton JRB1 = new JRadioButton("男");        //创建一个单选按钮对象
    JRadioButton JRB2 = new JRadioButton("女");
    JLabel JL1 = new JLabel("学院:");        //使用文本创建一个标签对象
    JTextField JT1 = new JTextField();            //创建一个文本框对象
    JButton JBAdd = new JButton("添加");            //创建按钮对象
    JButton JBNext = new JButton("重置");
    String sql = "";                                    //定义一个字符串

    public AddStudent()                                //创建AddStudent构造函数
    {
        this.setTitle("添加学生信息");                //设置窗口标题
        this.setLayout(null);                        //设置窗口布局管理器
        JL.setBounds(100, 30, 200, 40);                //设置标签的初始位置
        this.add(JL);                                //将标签添加到容器
        JLNumber.setBounds(100, 80, 100, 20);            //设置学号标签的初始位置
        this.add(JLNumber);                            //将学号标签添加到容器
        JTNumber.setBounds(200, 80, 80, 20);            //设置文本框的初始位置
        this.add(JTNumber);                            //将文本框添加到容器
        JLName.setBounds(100, 120, 60, 20);            //设置姓名标签的初始位置
        this.add(JLName);                            //将姓名标签添加到容器
        JTName.setBounds(200, 120, 80, 20);            //设置文本框的初始位置
        this.add(JTName);                            //将文本框添加到容器
        JLsex.setBounds(100, 160, 100, 20);            //设置性别标签的初始位置
        this.add(JLsex);                            //将性别标签添加到容器
        JRB1.setBounds(200, 160, 40, 20);                //设置单选按钮的初始位置
        JRB2.setBounds(300, 160, 40, 20);
        this.add(JRB1);                                //添加单选按钮组件
        this.add(JRB2);
        BG.add(JRB1);                                //将单选按钮添加到ButtonGroup组件
        BG.add(JRB2);
        JLClass.setBounds(100, 240, 60, 20);            //设置班级标签的初始位置
        this.add(JLClass);                            //将班级标签添加到容器
        JTClass.setBounds(200, 240, 80, 20);            //设置文本框的初始位置
        this.add(JTClass);                            //将文本框添加到容器
        JL1.setBounds(100, 280, 60, 20);                //设置学院标签的初始位置
        this.add(JL1);                                //将学院标签添加到容器
        JT1.setBounds(200, 280, 80, 20);                //设置文本框的初始位置
        this.add(JT1);                                //将文本框添加到容器
        JBAdd.setBounds(80, 320, 90, 20);                //设置添加按钮的初始位置
        this.add(JBAdd);                            //将添加按钮添加到容器
        JBAdd.addActionListener(this);                //给按钮添加监听器
        JBNext.setBounds(190, 320, 90, 20);            //设置重置按钮的初始位置
        this.add(JBNext);                            //将重置按钮添加到容器
        JBNext.addActionListener(this);                //给按钮添加监听器
        this.setBounds(10, 10, 500, 400);                //设置窗口尺寸大小
        this.setVisible(true);                        //设置窗口的可见性
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == JBAdd)//处理"添加"事件
        {
            String snumber = JTNumber.getText();//将文本框中包含的文本传给字符串snumber
            String sname = JTName.getText();//将文本框中包含的文本传给字符串sname
            String sclass = JTClass.getText();//将文本框中包含的文本传给字符串sclass
            String ssex = "女";//返回单选按钮的值
            if (JRB1.isSelected())
                ssex = "男";
            String scollect = JT1.getText();//将文本框中包含的文本传给字符串scollect
            sql = "select * from student where Id='" + snumber + "'";//检索出Id等于snumber的学生的所有信息
            try //异常处理
            {
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");//加载驱动程序
                Connection cot = DriverManager.getConnection("jdbc:odbc:student1", "", "");//打开数据库连接，student1为数据源名称
                Statement stm = cot.createStatement();//提交查询
                ResultSet rs = stm.executeQuery(sql);//取得查询结果

                if (rs.next())//判断结果是否存在
                    JOptionPane.showMessageDialog(null, "该号已经存在!");//通过showMessageDialog()方法打印信息
                else {
                    sql = "insert into student values('" + snumber + "','" + sname + "','" + sclass + "','" + ssex + "','" + scollect + "')";//插入一组数据
                    int i = stm.executeUpdate(sql); //对数据库进行更新
                    if (i > 0)
                        JOptionPane.showMessageDialog(null, "添加成功!");
                    else
                        JOptionPane.showMessageDialog(null, "删除失败!");
                }
            } catch (Exception ee) {
            }
        }
        if (e.getSource() == JBNext)//处理"重置"事件
        {
            JTNumber.setText(null);//设置文本的text值为null
            JTName.setText(null);    //设置文本的text值为null
            JTClass.setText(null);//设置文本的text值为null
            JT1.setText(null);//设置文本的text值为null
        }
    }

    public static void main(String[] args) {
        new AddStudent();
    }
}
