package com.demo.jdk8.function;

import com.demo.jdk8.Beans.Reptile;
import com.demo.util.GsonUtil;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 * @Author:kaichenr
 * @Date:2018/7/19 11:01
 **/
public class LambdaCalculate<T> {

    private static final Logger LOG = LoggerFactory.getLogger(LambdaCalculate.class);

    public static void main(String[] args) {
        /**
         * BinaryOperator<T> 两个同类型操作，返回同类型
         */
        BinaryOperator<Long> add = (Long x, Long y) -> x + y;
        BinaryOperator<Integer> bmax = BinaryOperator.maxBy(Comparator.naturalOrder());
        // 使用apply()设置参数
        Long addResult = add.apply(100L, 200L);
        int max = bmax.apply(5, 6);
        LOG.info("addResult : {}", addResult);
        LOG.info("max :{}", max);

        /**
         * BiConsumer<T, U> 接收两个输入参数,无返回值
         */
        BiConsumer<String, String> biConsumer = (String str1, String str2) -> System.out.println(str1 + "---" + str2);
        biConsumer.accept("hello", "world");

        /**
         * BiFunction<T, U, R>
         * T - 表示第一个参数
         * U - 表示第二个参数
         * R - 表示返回结果result
         */
        BiFunction<String, String, Boolean> biFunction = (str1, str2) -> {
            return str1.equalsIgnoreCase(str2);
        };
        Boolean binFunResult = biFunction.apply("hello", "HEllo");
        LOG.info("binFunResult:{}", binFunResult);


        /**
         *  BiPredicate<T, U>
         *  用来做对lambda表达式做判断的Function函数
         *  test:判断是否满足条件   and表示是否同时满足     negate表示非运算，类似"!"   or或者
         */
        BiPredicate<Integer, Integer> bi1 = (x, y) -> {
            return x > y;
        };
        BiPredicate<Integer, Integer> bi2 = (x, y) -> x == y;

        System.out.println(bi1.test(1, 2));
        System.out.println(bi2.negate().test(1, 2));//取反
        System.out.println(bi1.and(bi2).test(1, 2));
        System.out.println(bi1.or(bi2).test(1, 2));


        /**
         * BooleanSupplier
         * boolean值结果的提供方
         */
        BooleanSupplier booleanSupplier = () -> bi1.test(2, 1);
        System.out.println(booleanSupplier.getAsBoolean());

        /**
         * Consumer<T>
         */
        Consumer<String> consumer = (str) -> {
            System.out.println(String.format("consumer receive-->%s", str));
        };
        consumer.accept("sdds");

        /**
         * DoubleBinaryOperator
         * 输入两个double操作，返回一个double
         */
        DoubleBinaryOperator doubleBinaryOperator = (d1, d2) -> {
            return d1 / d2;
        };
        System.out.println(doubleBinaryOperator.applyAsDouble(100, 50));

        /**
         * DoubleConsumer
         * 接受一个double值参数的操作，并且不返回结果
         */
        DoubleConsumer doubleConsumer = (d1) -> System.out.println(d1);
        doubleConsumer.accept(233.222);

        /**
         * DoubleFunction<R>
         * 接受一个double值参数的操作，返回结果
         */
        DoubleFunction<Double> doubleFunction = (d1) -> d1 / 1000;
        System.out.println(doubleFunction.apply(1000));

        /**
         * Function<T,R>
         * 接受一个输入参数T，返回一个结果R
         */
        Function<String, List<String>> function = (str) -> {
            if (StringUtils.isEmpty(str)) {
                return null;
            }
            List<String> list = new ArrayList<String>();
            String[] strArray = str.split("-");
            list = Arrays.asList(strArray);
            return list;
        };
        String str1 = "";
        List<String> list1 = function.apply(str1);
        LOG.info("function-->return:{}", GsonUtil.GsonString(list1));
        String str2 = "11111-22222-33333";
        List<String> list2 = function.apply(str2);
        LOG.info("function-->return:{}", GsonUtil.GsonString(list2));

        /**
         * IntPredicate
         * ：接受一个int输入参数，返回一个布尔值的结果
         */
        IntPredicate intPredicate1 = (x) -> x > 0;
        IntPredicate intPredicate2 = (x) -> x < 0;
        System.out.println(intPredicate1.test(1));
        System.out.println(intPredicate1.and(intPredicate2).test(1));
        System.out.println(intPredicate1.or(intPredicate2).test(1));
        System.out.println(intPredicate1.negate().test(1));//非运算

        /**
         * ObjDoubleConsumer<T>
         * 一个object类型和一个double类型的输入参数，无返回值
         */
        ObjDoubleConsumer objDoubleConsumer = (o, d) -> {
            Reptile r = (Reptile) o;
            System.out.println((r.getName() + " length: " + (r.getBodyLength() + d)));
        };
        objDoubleConsumer.accept(new Reptile("tiger", 0.9), 0.2);

        /**
         * Predicate<T>
         * 接受一个参数T，返回一个Boolean值
         */
        Predicate<Integer> p1 = (t) -> t < 0;
        Predicate<Integer> p2 = (t) -> t > 0;
        System.out.println(p1.test(1));
        System.out.println(p1.and(p2).test(2));
        System.out.println(p1.or(p2).test(2));
        System.out.println(p1.negate().test(2));


        /**
         * Supplier<T>
         * 无参数，返回一个T类型的结果
         */
        Supplier<Object> supplier = () -> {
            StringBuffer sb = new StringBuffer();
            Random r = new Random();
            int num = r.nextInt(10) + 1;
            for (int i = 0; i <= num; i++) {
                char c = (char) (r.nextInt(29) + 61);
                sb.append(c);
            }
            return sb.toString();
        };
        System.out.println(supplier.get());

        /**
         * UnaryOperator<T>
         * 接受一个T类型参数，返回一个T类型结果
         */
        UnaryOperator<String> unaryOperator = (t) -> {
            if (null == t || "".equals(t)) {
                return null;
            } else {
                StringBuffer sb = new StringBuffer(t);
                return sb.reverse().toString();
            }
        };
        System.out.println(unaryOperator.apply("asss"));

        /**
         * others
         */
        //接受两个参数同为类型int,返回值类型也为int
        IntBinaryOperator intBinaryOperator = (x, y) -> x + y;
//        System.out.println(intBinaryOperator.applyAsInt(5, 6));


    }


}
