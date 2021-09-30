package com.hendisantika.workflow.service;

import camundajar.impl.scala.util.control.Exception;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : camunda-bpmn-service-task
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 30/09/21
 * Time: 09.44
 */
@Component
public class CoffeeService {

    private final Logger LOGGER = LoggerFactory.getLogger(RetrieveCoffeeOrderDelegate.class.getName());

    public void pourCoffee(DelegateExecution execution) throws Exception {
        String coffeeOrder = (String) execution.getVariable("order");

        LOGGER.info("Order Coffee Process: " + execution.getCurrentActivityName() + " - " + coffeeOrder);
    }
}
