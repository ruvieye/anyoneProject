package pattern.AbstractFactory.Sample.listfactory;

import pattern.AbstractFactory.Sample.factory.Factory;
import pattern.AbstractFactory.Sample.factory.Link;
import pattern.AbstractFactory.Sample.factory.Page;
import pattern.AbstractFactory.Sample.factory.Tray;

 

public class ListFactory extends Factory {
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
