package Team5.SmartTowns.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;


@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
    /* Configures the longin features and tracks logged on users on the page */


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests((requests) -> requests
                        .requestMatchers("/user/**", "/userProfile").authenticated()
                        .anyRequest().permitAll()

                )
                .formLogin((login) -> login
                        .loginPage("/login").permitAll()
                        .defaultSuccessUrl("/mobile-home")
                )
                .logout((logout) -> logout.permitAll());

        return http.build();
    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        /* Nothing here yet, this just saves passwords in plaintext. TODO password encryption */
        return NoOpPasswordEncoder.getInstance();
    }

    @Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource){
        JdbcUserDetailsManager manager = new JdbcUserDetailsManager(dataSource);
        return manager;
    }


}
