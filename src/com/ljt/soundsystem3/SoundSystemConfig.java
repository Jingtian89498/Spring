package com.ljt.soundsystem3;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(CDPlayerConfig.class)
@ImportResource("cd-config.xml")
public class SoundSystemConfig {
}
