package com.github.bartgora.rpn.autoconfiguration;

import com.github.bgora.rpnlibrary.Calculator;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(Calculator.class)
public class RpnAutoconfiguration {

  @Bean
  @ConditionalOnMissingBean
  public Calculator calculator() {
    return Calculator.createCalculator();
  }

}
