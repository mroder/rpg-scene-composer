package maro.todo;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Launcher {

	public void launch() {
		String[] contextPaths = new String[] {"resources/context/demo-context.xml"};
		new ClassPathXmlApplicationContext(contextPaths);

	}

}
