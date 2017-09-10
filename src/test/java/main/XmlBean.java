package main;

import demo0107.Knight;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ztt on 2017/9/10.
 */
public class XmlBean {
    public static void main(String[] args) throws  Exception{
        String xmlPath="demo0107/knight.xml";
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(xmlPath);
        Knight knight= (Knight) context.getBean("knight");
        knight.embarkOnRequest();
        context.close();
    }
}
