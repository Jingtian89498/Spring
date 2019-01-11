package com.ljt.soundsystem.soundsystem1;

import com.ljt.soundsystem.soungsystem0.CDPlayer;
import com.ljt.soundsystem.soungsystem0.CompactDisc;
import com.ljt.soundsystem.soungsystem0.Sgtpeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {

    // bean注解告诉Spring这个方法将返回一个对象，该对象要注册为Spring应用上下文中的bean
    @Bean
    public CompactDisc sgtPeppers(){
        return new Sgtpeppers();
    }

    @Bean
    public CDPlayer cdPlayer(){
        return new CDPlayer(sgtPeppers());  // Spring会拦截对sgtPeppers()的调用，并确保返回的是Spring创建的bean
    }

    // 最佳选择
    // 不管CompactDisc是采用什么方式创建的，Spring都会将其传入到配置方法中，并用来创建CDPlayer的bean
    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc){
        return new CDPlayer(compactDisc);
    }

}
