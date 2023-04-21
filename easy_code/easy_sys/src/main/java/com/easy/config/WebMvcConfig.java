package com.easy.config;

import com.easy.interceptor.TestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 和springmvc的webmvc拦截配置一样
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
	 @Override
	 public void addInterceptors(InterceptorRegistry registry) {
		 registry.addInterceptor(TestInterceptor()).addPathPatterns("/**");
	 }
	 @Bean
	 public TestInterceptor TestInterceptor() {
		 return new TestInterceptor();
	 }
}