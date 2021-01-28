package com.benz.serverless.api.mapping;

import com.benz.serverless.api.model.Item;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@Configuration
public class ItempMapping {

    @Bean
    public Function<String,String> reverse()
    {
        return (name)-> new StringBuilder(name).reverse().toString();
    }

    @Bean
    public Supplier<Item> getItem()
    {
        return () -> new Item(10,"Book",2500.00);
    }

    @Bean
    public Consumer<String> printMsg()
    {
        return (msg) -> System.out.println(msg);
    }
}
