import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

/**
 * Project name(项目名称)：Swing列表框组件
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/12/1
 * Time(创建时间)： 16:45
 * Version(版本): 1.0
 * Description(描述)：
 * 列表框与下拉列表的区别不仅仅表现在外观上，当激活下拉列表时，会出现下拉列表框中的内容。
 * 但列表框只是在窗体系上占据固定的大小，如果需要列表框具有滚动效果，可以将列表框放到滚动面板中。当用户选择列表框中的某一项时，
 * 按住 Shift 键并选择列表框中的其他项目，可以连续选择两个选项之间的所有项目，也可以按住 Ctrl 键选择多个项目。
 * Swing 中使用 JList 类来表示列表框，该类的常用构造方法如下。
 * JList()：构造一个空的只读模型的列表框。
 * JList(ListModel dataModel)：根据指定的非 null 模型对象构造一个显示元素的列表框。
 * JList(Object[] listData)：使用 listData 指定的元素构造—个列表框。
 * JList(Vector<> listData)：使用 listData 指定的元素构造一个列表框。
 */

public class test
{
    public static void main(String[] args)
    {
        JFrame jFrame = new JFrame("测试");
        jFrame.setSize(640, 480);
        jFrame.setLocation(200, 200);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel jPanel = new JPanel();
        Font font = new Font("宋体", Font.PLAIN, 20);
        JLabel label = new JLabel("年龄段有：");
        label.setFont(font);
        LinkedList<String> list = new LinkedList<>();
        list.add("0-18");
        list.add("18-36");
        list.add("36-60");
        list.add("60-100");
        JList<Object> jList = new JList<>(list.toArray());
        jList.setDragEnabled(true);
        jList.setFont(font);
        jPanel.add(label);
        jPanel.add(jList);
        jFrame.add(jPanel);
        jFrame.setVisible(true);
        test2.main(null);
        test3.main(null);
    }
}
