import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

/**
 * @author syou
 * @date 2018/5/9.
 */
public class ContextAttributeListener implements ServletContextAttributeListener {
    @Override
    public void attributeAdded(ServletContextAttributeEvent servletContext) {
        System.out.println("ServletContextAttributeListener中添加属性");
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent servletContext) {
        System.out.println("ServletContextAttributeListener中移除属性");
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent servletContext) {
        System.out.println("ServletContextAttributeListener中属性值替换");

    }
}
