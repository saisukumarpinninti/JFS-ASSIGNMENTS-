package s;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;



@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	DataSource ds ; 
	
	 @Autowired 
	 CustomLoginFailureHandler customLoginFailureHandler;
	 
	
	@Override
    protected void configure(HttpSecurity http) throws Exception {    
          http
          .authorizeRequests()
          .antMatchers("/").permitAll()
          .antMatchers("/admin").hasRole("ADMIN")
          .antMatchers("/user").hasAnyRole("ADMIN","USER")
          .and()  
          .formLogin()  
          .failureHandler(customLoginFailureHandler)  //Q4 
          .loginPage("/login")
          .defaultSuccessUrl("/user")
          .permitAll()
          .and()
          .logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
          .logoutSuccessUrl("/login").deleteCookies("JSESSIONID")
          .invalidateHttpSession(true).permitAll() .and()
          .rememberMe().tokenValiditySeconds(2592000).key("mySecret!").rememberMeParameter("checkRememberMe"); //Q5 
	}  
	
	  protected void configure( AuthenticationManagerBuilder auth) throws Exception
	  {
		  auth.jdbcAuthentication()  
		  
		  .dataSource(ds);
	  }
	
	@Bean
    public PasswordEncoder getPasswordEncoder(){
		
        return new BCryptPasswordEncoder();  //Q6
		//return NoOpPasswordEncoder.getInstance();
    }

}