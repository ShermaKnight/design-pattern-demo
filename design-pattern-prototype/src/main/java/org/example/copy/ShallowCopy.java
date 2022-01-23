package org.example.copy;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.RandomUtil;
import lombok.SneakyThrows;
import org.example.entity.Address;
import org.example.entity.User;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ShallowCopy {

    private User user = new User(1, RandomUtil.randomString(10), Stream.of(
            new Address(1, "中国", "北京"),
            new Address(2, "中国", "上海")
    ).collect(Collectors.toList()));

    public static void main(String[] args) {
        ShallowCopy shallowCopy = new ShallowCopy();
        System.out.println(shallowCopy.cloneCopy());
    }

    @SneakyThrows
    private boolean cloneCopy() {
        User copyUser = (User) user.clone();
        user.getAddresses().add(new Address(3, "中国", "广东"));
        return user.getAddresses().size() == copyUser.getAddresses().size();
    }
}
