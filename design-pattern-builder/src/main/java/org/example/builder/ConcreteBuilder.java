package org.example.builder;

import cn.hutool.core.util.RandomUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConcreteBuilder extends Builder {

    private static Integer userId = 1;
    private static Integer schoolId = 1;
    private static Integer addressId = 1;

    @Override
    void buildBase() {
        user.setId(userId++);
        user.setName(RandomUtil.randomString(5));
        user.setAge(RandomUtil.randomInt(100));
    }

    @Override
    void buildSchool() {
        List<School> schools = new ArrayList<>();
        schools.addAll(IntStream.range(1, RandomUtil.randomInt(3)).mapToObj(i -> {
            School school = new School();
            school.setId(schoolId++);
            school.setName(RandomUtil.randomEle(Arrays.asList("北京大学", "清华大学", "国防科技大学", "哈尔滨工业大学")));
            return school;
        }).collect(Collectors.toList()));
        user.setSchools(schools);
    }

    @Override
    void buildAddress() {
        List<Address> addresses = new ArrayList<>();
        addresses.addAll(IntStream.range(1, RandomUtil.randomInt(3)).mapToObj(i -> {
            Address address = new Address();
            address.setId(addressId++);
            address.setCity(RandomUtil.randomEle(Arrays.asList("北京", "上海", "广东", "深圳")));
            return address;
        }).collect(Collectors.toList()));
        user.setAddresses(addresses);
    }
}
