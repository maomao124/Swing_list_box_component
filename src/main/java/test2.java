import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * Project name(项目名称)：Swing列表框组件
 * Package(包名): PACKAGE_NAME
 * Class(类名): test2
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/12/1
 * Time(创建时间)： 17:00
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test2 extends JFrame
{
    public test2()
    {
        setTitle("测试2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //设置窗体退出时操作
        setBounds(200, 200, 1280, 720);    //设置窗体位置和大小
        JPanel jPanel = new JPanel();    //创建内容面板
        jPanel.setBorder(new EmptyBorder(50, 200, 50, 200));    //设置面板的边框
        Font font = new Font("宋体", Font.PLAIN, 20);
        jPanel.setLayout(new BorderLayout(0, 0));    //设置内容面板为边界布局
        setContentPane(jPanel);    //应用内容面板
        JScrollPane scrollPane = new JScrollPane();    //创建滚动面板
        jPanel.add(scrollPane, BorderLayout.CENTER);    //将面板增加到边界布局中央
        JList list = new JList();
        list.setFont(font);
        //限制只能选择一个元素
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        scrollPane.setViewportView(list);    //在滚动面板中显示列表
        String[] listData = new String[200];    //创建一个含有12个元素的数组
        for (int i = 0; i < listData.length; i++)
        {
            listData[i] = "这是列表框的第" + (i + 1) + "个元素~";    //为数组中各个元素赋值
        }
        list.setListData(listData);    //为列表填充数据
    }

    public static void main(String[] args)
    {
        test2 frame = new test2();
        frame.setVisible(true);
    }
}
