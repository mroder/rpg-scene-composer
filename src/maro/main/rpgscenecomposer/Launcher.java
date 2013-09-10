package maro.main.rpgscenecomposer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launcher {
	
	public void launch() {
		String[] contextPaths = new String[] {"resources/context/appcontext.xml"};
		new ClassPathXmlApplicationContext(contextPaths);
	}

	public static void main(String[] args) {
		Launcher launcher = new Launcher();
		launcher.launch();
	}
}
