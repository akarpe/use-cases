#This bundle uses 
1. OSGI reference for resolving activemq bean which is exported as 
service from mqservice bundler
2. This bundle using osgi compendium with spring to resolve the property
placeholders , this is useful to read the property files from profiles
rather than the physical property files on file servers and classpaths


Testing Strategy

1. Since the code involves osgi:service and reference from a different bundle
the unit test cases will have to start a karaf instance locally and deploy the 
other bundles before running the current test case ( this is not explained in 
the current code )
2. alternatively all the OSGI related code and bean definition has been moved to a 
separate file and whil loading the test context an new file can be defined with 
the local beans to run the test well

classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
					new String[] {
							"bundleContext.xml",
							"META-INF/spring/camelContext.xml" });
							
Thus by replacing the osgi related beans to spring we can allow the test cases
to run properly . I am still looking for a better and uncomplicated way (than in step1 )
to achieve this .. till then i think this works.