package kr.or.ddit.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

import kr.or.ddit.interceptor.PerfomanceCheckInterceptor;
import kr.or.ddit.interceptor.SessionCheckInterceptor;

@Configuration
@EnableWebMvc
public class InterceptorConfig extends WebMvcConfigurerAdapter {
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		
		PerfomanceCheckInterceptor perfomanceCheckInterceptor
				= new PerfomanceCheckInterceptor();
		
		registry.addInterceptor(perfomanceCheckInterceptor).addPathPatterns("/**");
		
//		<mvc:mapping path="/**" />
//		<mvc:exclude-mapping path="/login" />	<!-- 로그인 화면, 로그인 요청 제외 -->
//		<mvc:exclude-mapping path="/css/**" />
//		<mvc:exclude-mapping path="/js/**" />
//		<mvc:exclude-mapping path="/bootstrap/**" />
//		<mvc:exclude-mapping path="/error/**" />
		
		
//		SessionCheckInterceptor sessionCheckInterceptor = new SessionCheckInterceptor();
//		registry.addInterceptor(sessionCheckInterceptor)
//					.addPathPatterns("/**")
//					.excludePathPatterns("/login")
//					.excludePathPatterns("/css/**")
//					.excludePathPatterns("/js/**")
//					.excludePathPatterns("/bootstrap/**")
//					.excludePathPatterns("/error/**");
		LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
		localeChangeInterceptor.setParamName("language");
		registry.addInterceptor(localeChangeInterceptor)
					.addPathPatterns("/**")
					.excludePathPatterns("/login")
					.excludePathPatterns("/css/**")
					.excludePathPatterns("/js/**")
					.excludePathPatterns("/bootstrap/**")
					.excludePathPatterns("/error/**");
		
	}


}
