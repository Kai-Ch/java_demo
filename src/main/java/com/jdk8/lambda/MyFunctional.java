package com.jdk8.lambda;

/**
 * @Author:chenkai
 * @description:
 * @Date:2019/11/18 23:20
 */
@FunctionalInterface
public interface MyFunctional<T> {

    void accept(T t);
}
