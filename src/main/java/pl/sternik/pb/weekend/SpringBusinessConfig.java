package pl.sternik.pb.weekend;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = { "pl.sternik.pb.weekend" }, excludeFilters = {
        @Filter(type = FilterType.REGEX, pattern = "pl\\.sternik\\.pb\\.weekend\\.web\\..*") })
@ImportResource({"classpath:/applicationContext.xml"})
public class SpringBusinessConfig {

}
