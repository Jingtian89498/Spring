# Spring

this is all about spring.

## 1. 使用IDEA搭建一个Spring MVC项目
参考网址 https://www.cnblogs.com/wormday/p/8435617.html  
new --> project --> spring --> Spring MVC  
配置Tomcat 调试以及运行  
project structure  引入相关类库  可以直接fix  

- web.xml  
  servlet配置 \<bean\>  
- dispatcher-servlet.xml  
  <context:component-scan base-package="com.ljt.springmvc.test" />  
  bean配置  \<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver"> \</bean>  
prefix suffix  
- jsp文件  

## 2. bean的装配
- 自动装配  
  @ComponentScan  
  @Componet  

- JavaConfig  
  @Configuration  
  @Bean  

- XML  
  @ContextConfiguration  
  XML file should be named as xx-context.xml. It should be in the same folder structure as the test class being run.   
  P命名空间  property  
  C命名空间  constructor  

- 混合装配  
