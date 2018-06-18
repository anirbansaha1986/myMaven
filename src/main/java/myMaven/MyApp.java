package myMaven;

import java.lang.reflect.Constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Process-1:---- FileSystemXmlApplicationContext can read from anywhere in your project*/
		
		ApplicationContext appContext = new FileSystemXmlApplicationContext("src/main/resources/beans.xml");
		Fruit myFruit = (Fruit) appContext.getBean("fruit");
		Vegetable myvegetable = appContext.getBean("vegetable",Vegetable.class);
		
		System.out.println(myFruit.talkAboutYourself());
		System.out.println(myvegetable.talkAboutYourself());
		
		((ConfigurableApplicationContext)appContext).close();
		
		/*You can use below way to close context*/
		
		//(ClassPathXmlApplicationContext) context).close();
		//((AbstractApplicationContext)appCtx).registerShutdownHook();
		//((ClassPathXmlApplicationContext) context).close();

		/*If Java SE 7 and later, don't close, use try-with-resources which ensures that each resource is closed at the end of the statement.
		try(final AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"classpath*:META-INF/spring/*.xml" }))
		{
		     //write your code
		} */
		
		/*Process-2:----ClassPathXmlApplicationContext is used when xml bean file is inside classpath*/
		
		ApplicationContext cPathContext = new ClassPathXmlApplicationContext("beans.xml");
		Fruit mFruit = cPathContext.getBean("fruit", Fruit.class);
		Vegetable mvegetable = cPathContext.getBean("vegetable",Vegetable.class);
		
		System.out.println(mFruit.talkAboutYourself());
		System.out.println(mvegetable.talkAboutYourself());
		
		((ClassPathXmlApplicationContext)cPathContext).close();
		
		/*Process-3:----You can use BeanFactory also. But it is deprecated now. You can use ClassPathXmlApplicationContext*/
		
		Resource resource = new ClassPathResource("beans.xml");
		//load xml into container
		@SuppressWarnings("deprecation")
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Fruit fruit = (Fruit)factory.getBean("fruit",Fruit.class);
		Vegetable vegetable = (Vegetable)factory.getBean("vegetable");
		
		System.out.println(fruit.talkAboutYourself());
		System.out.println(vegetable.talkAboutYourself());
		
		/*Process-4:----You can use ConfigurableApplicationContext also. It is subclass of ApplicationContext*/
		
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		Fruit frt = (Fruit)factory.getBean("fruit",Fruit.class);
		Vegetable vgtbl = (Vegetable)factory.getBean("vegetable");
		
		System.out.println(frt.talkAboutYourself());
		System.out.println(vgtbl.talkAboutYourself());
		
		((ClassPathXmlApplicationContext)ctx).close();
		
		/*Process-4:----You can get object directly using newInstane. It is deprecated now.*/
		//Access public constructor using newInstance
		try {
			@SuppressWarnings("deprecation")
			FruitApple f = (FruitApple) Class.forName("myMaven.FruitApple").newInstance();
			System.out.println(f.talkAboutYourself());
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Access private constructor using class.forName
		try {
			Class<?> cls = Class.forName("myMaven.VegetableBeans");
			Constructor<?> c[] = cls.getDeclaredConstructors();
			c[0].setAccessible(true);
			VegetableBeans v = (VegetableBeans)c[0].newInstance();
			System.out.println(v.talkAboutYourself());
			
			//System.out.println(v.talkAboutYourself());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		/*Process-5:--- initialize value to class variable using setter or constructor method */
		
		/*Constructor method */
		ApplicationContext appContextPath = new ClassPathXmlApplicationContext("flowerBeans.xml");
		Flower flower = appContextPath.getBean("flower", Flower.class);
		
		System.out.println("Call 1: "+ flower.toString());
		
		flower = appContextPath.getBean("flower1", Flower.class);
		
		System.out.println("Call 2: "+ flower.toString());
		
		flower = appContextPath.getBean("flower2", Flower.class);
		
		System.out.println("Call 3: "+ flower.toString());
		
		flower = appContextPath.getBean("flowerAll", Flower.class);
		
		System.out.println("Call 4: "+ flower.toString());
		
		/*Setter with value and reference*/
		
		FlowerRose rose = appContextPath.getBean("flowerRose", FlowerRose.class);
		System.out.println("Call 1: "+ rose.toString());
		
		((ClassPathXmlApplicationContext)appContextPath).close();
		
		/*Multiple Bean xml loading */
		
		/*String  files[]=new String[] {"resources/beans.xml","resources/flowerBeans.xml"};
		ApplicationContext apx=new ClassPathXmlApplicationContext(files);
		((ClassPathXmlApplicationContext)apx).close();*/
		
		/*Initialize collection items */
		/*List, set, map */
		System.out.println("1st set of collection");
		appContextPath = new ClassPathXmlApplicationContext("listBean.xml");
		ListExample listExample = appContextPath.getBean("listExample", ListExample.class);
		listExample.printDataItems();
		/*ArrayList, hashset, hashmap */
		System.out.println("2nd set of collection");
		ArrayListExample example = appContextPath.getBean("arrayListExample", ArrayListExample.class);
		example.printDataItems();
		((ClassPathXmlApplicationContext)appContextPath).close();
		
		

	}

}
