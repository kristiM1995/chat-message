package com.chat.message;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators.In;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class MessageApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MessageApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Object> array = new ArrayList<>();
        array.add(5);
        array.add(2);
        array.add("[7, -1]");
        array.add("[6, [-13, 8], 4]");
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += check(array.get(i));
        }
        return sum;
    }

    public static int check(Object object) {
        int preSum = 0;
        if (object instanceof Integer) {
            preSum = (Integer) object;
        } else if (object instanceof Arrays) {
            List<Integer> array = new ArrayList<>((Integer) object);
            for (int i = 0; i < array.size(); i++) {
                preSum = 2 * (array.get(i) + array.get(i + 1));
            }
        }
        return preSum;
    }
}
