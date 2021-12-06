package config;

import ru.qatools.properties.Property;
import ru.qatools.properties.Resource;

@Resource.Classpath("tests.properties")
public interface Prop {

	@Property("tests.browser")
	String getBrowser();

	@Property("tests.uname")
	String getUname();

	@Property("tests.upass")
	String getUpass();
}