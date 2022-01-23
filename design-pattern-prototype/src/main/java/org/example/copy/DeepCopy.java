package org.example.copy;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.RandomUtil;
import org.apache.commons.lang3.SerializationUtils;
import org.example.entity.Address;
import org.example.entity.User;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@SuppressWarnings("all")
public class DeepCopy {

    private User user = new User(1, RandomUtil.randomString(10), Stream.of(
            new Address(1, "中国", "北京"),
            new Address(2, "中国", "上海")
    ).collect(Collectors.toList()));

    public static void main(String[] args) {
        DeepCopy deepCopy = new DeepCopy();
        System.out.println(deepCopy.commonCopy());
    }

    private boolean hutoolCopy() {
        User copyUser = new User();
        BeanUtil.copyProperties(user, copyUser);
        user.getAddresses().add(new Address(3, "中国", "广东"));
        return user.getAddresses().size() == copyUser.getAddresses().size();
    }

    private boolean commonCopy() {
        User copyUser = SerializationUtils.clone(user);
        user.getAddresses().add(new Address(3, "中国", "广东"));
        return user.getAddresses().size() == copyUser.getAddresses().size();
    }
}
