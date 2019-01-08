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

