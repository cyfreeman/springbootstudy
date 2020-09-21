package cy.study.springboot003webrestful.config;


import cy.study.springboot003webrestful.component.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MyMVCConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //浏览器发送cystudy请求也到success页面
        registry.addViewController("/cystudy").setViewName("success");
    }

    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocaleResolver();
    }

}
