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

# Spring实战
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
  在JavaConfig中引入XML配置  
  在XML配置中引用JavaConfig
  
## 3. 高级装配
### 1) profile配置
 不同的生产环境不同的配置  
 @Profile  
 @ActiveProfiles  
 P.S. Driver for test database type [H2] is not available. TEST失败  
 
### 2) 条件化的bean
  @Conditional  
  实现Contion接口，Override matches()方法 通过参数ConditionContext 和 AnnotatedTypeMetadata 实现强大的功能  
  ConditionContext是一个接口  
  getRegistry()  
  getBeanFactory()  
  getEnvironment()   @PropertySource() 加载properties文件    
  getResourceLoader()  
  getClassLoader()  
  AnnotatedTypeMetadata也是一个接口 检测带有@Bean注解的方法上还有什么注解  
  
 ### 3) 处理自动装配的歧义性
   NoUniqueBeanDefinitionException  
   @Primary  
     
   @Qualifier  以及创建自定义的限定符注解  
   
### 4) bean的作用域
  单例(Singleton)   
  原型(Prototype)  
  会话(Session)  
  请求(Request)  
  
### 5) 运行时注入
  属性占位符 和 Spring表达式语言
   
## 4 面向切面的Spring
  Advice 通知 -- 切面的工作 什么与何时  
  Pointcut 切点  何处   
  Aspect 切面 切点和通知的结合。  
  Joint Point 连接点 在应用执行过程中能插入切面的一个点  
  
  
