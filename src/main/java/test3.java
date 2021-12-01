import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

/**
 * Project name(项目名称)：Swing列表框组件
 * Package(包名): PACKAGE_NAME
 * Class(类名): test3
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/12/1
 * Time(创建时间)： 17:16
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test3
{
    public static double getDoubleRandom(double min, double max)  //double型随机数
    {
        if (min > max)
        {
            min = max;
        }
        return min + (Math.random() * (max - min));
    }

    public static double getDoubleRandom(double min, double max, String format)
    {            //空间复杂度和时间复杂度都特别高，只适合获取非常少的格式化的随机数使用。farmat：##.##或00.00
        DecimalFormat decimalFormat = new DecimalFormat(format);
        if (min > max)
        {
            min = max;
        }
        return Double.parseDouble(decimalFormat.format(min + (Math.random() * (max - min))));
    }

    public static void main(String[] args)
    {
        JFrame jFrame = new JFrame("测试");
        jFrame.setSize(1280, 720);
        jFrame.setLocation(200, 200);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel jPanel = new JPanel();
        Font font = new Font("宋体", Font.PLAIN, 25);
        String[] list = new String[200];
        for (int i = 0; i < list.length; i++)
        {
            list[i] = "第" + (i + 1) + "个随机数：" + getDoubleRandom(1000, 1000000);
        }
        JList<String> jList = new JList<>(list);
        jList.setFont(font);
        jList.setSelectionMode(2);
        Component table;
        JScrollPane jScrollPane = new JScrollPane(jList)
            /*
        {
            @Override
            public Dimension getPreferredSize()
            {
                return new Dimension(500, 300);
            }
        }*/;
        //第二种方案
        Dimension dimension = new Dimension(650, 600);
        jScrollPane.setPreferredSize(dimension);
        jPanel.add(jScrollPane);
        jFrame.add(jPanel);
        jFrame.setVisible(true);
    }
}
