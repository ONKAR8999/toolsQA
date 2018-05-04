package TestRunner;



import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

import Factory.DataProviderfactory;

public class TestEngine {

	public static void main(String[] args) 
	{
		TestNG runner = new TestNG();
		
	List<String> xmlfiles=	DataProviderfactory.getConfig().getxmlfiles();
//		List <String> list = new ArrayList<String>();
//		
//		list.add("D:\\selenium\\toolsQA.com\\Test xml\\crossbrowser.xml");
//		list.add("D:\\selenium\\toolsQA.com\\Test xml\\home.xml");
		
		
		runner.setTestSuites(xmlfiles);
		
		runner.run();
		

	}

}
