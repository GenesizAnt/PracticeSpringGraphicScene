package testSp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        GraphicScene graphicScene = context.getBean("graphicSceneBean", GraphicScene.class);
        graphicScene.drawScene();

        context.close();
    }
}
