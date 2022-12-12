package com.hhq;

import org.hhq.framework.ioc.context.ApplicationContext;
import org.hhq.framework.ioc.context.ClassPathXmlApplicationContext;

import com.hhq.service.PaperService;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // 通过属性提供setter方法注入对象
		/*PaperService serviceImpl = new PaperServiceImpl();
		serviceImpl.setDao(new PaperDAOImpl());
		serviceImpl.addPaper();*/

        // 通过属性提供构造函数方法注入对象
		/*PaperService serviceImpl1= new PaperServiceImpl(new PaperDAOImpl());
		serviceImpl1.addPaper();*/

        // 实例化一个spring容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("resources/applicationContext.xml");
        // 从容器(工厂)获取对象
        System.out.println(ctx.getBean("service"));
        PaperService service = (PaperService) ctx.getBean("service");
        service.addPaper();
    }
}
