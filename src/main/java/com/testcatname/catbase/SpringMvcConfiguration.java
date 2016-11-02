package com.testcatname.catbase;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = {"com.testcatname"})
@EnableWebMvc
@PropertySource("classpath:configuration.properties")
public class SpringMvcConfiguration extends WebMvcConfigurerAdapter {
	
	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //registry.addResourceHandler("/css/**/*").addResourceLocations("/WEB-INF/static/css/");
		//registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
		//registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
		registry.addResourceHandler("/static/**").addResourceLocations("/classpath:/static/");
		registry.addResourceHandler("/css/**").addResourceLocations("classpath:/static/css/");
        registry.addResourceHandler("/js/**").addResourceLocations("classpath:/static/js/");
        
        // subsite redirects
        //registry.addResourceHandler("/*/cats/css/**").addResourceLocations("classpath:/static/css/");
        //czemu dziala tylko na stronie startowej?
    }
	
 	@Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
	 
    @Bean
    public ViewResolver configureViewResolver() {
        InternalResourceViewResolver viewResolve = new InternalResourceViewResolver();
        viewResolve.setPrefix("/WEB-INF/views/");
        viewResolve.setSuffix(".jsp");

        return viewResolve;
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer){
      configurer.enable();
    }
    
    /*
    <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
	    <property name="prefix">
	        <value>/WEB-INF/views/</value>
	    </property>
	    <property name="suffix">
	        <value>.jsp</value>
	    </property>
	</bean>
	
	<bean id="someService" class="pl.kobietydokodu.SomeService" init-method="init">
	    <property name="someDependency" ref="someDependencyImpl" />
	</bean>
	*/

}
