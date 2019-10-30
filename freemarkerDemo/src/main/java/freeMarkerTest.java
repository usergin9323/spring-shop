import freemarker.template.Configuration;
import freemarker.template.Template;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.util.*;

public class freeMarkerTest {
    @Test
    public void freeTest(){
        try {
        //创建Configuration对象，获取版本号
        Configuration configuration= new Configuration(Configuration.getVersion());
        //2.设置模板位置
        configuration.setDirectoryForTemplateLoading(new File(".\\src\\main\\resources"));
        //3.设置字符集
            configuration.setDefaultEncoding("UTF-8");
            //4加载模板
            Template template = configuration.getTemplate("test.ftl");

            //5创建数据模型
            Map map = new HashMap();
            map.put("name","学院");
            map.put("message","Hello,World");
            map.put("success",false);
            List list = new ArrayList();
            Map goods1=new HashMap();
            goods1.put("name","苹果");
            goods1.put("price",5.8);
            Map goods2=new HashMap();
            goods2.put("name","香蕉");
            goods2.put("price",2.5);
            list.add(goods1);
            list.add(goods2);
            map.put("list",list);
            map.put("point",123456789);
            map.put("aaa",null);
            //添加时间
            map.put("today",new Date());
            //6,创建writer对象
            FileWriter fileWriter = new FileWriter(new File(".\\src\\main\\resources\\", "demo.html"));
            //7,输出
            template.process(map,fileWriter);
            System.out.println("生成成功，复制成功");
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
