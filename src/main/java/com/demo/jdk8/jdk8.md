## jdk 8
### Lambda表达式和函数式接口

- 简单的Lambda表达式
```
Arrays.asList(1, 2, 3).forEach(e -> System.out.println(e));
```

- 指定参数的类型
```
Arrays.asList("a", "b", "c").forEach((String e) -> System.out.print(e));
```

- 复杂表达式
```
Arrays.asList("a", "a", "c").sort((e1, e2) ->{
            int result = e1.compareTo(e2);
            System.out.println(result);
            return result;
        });
```

### 函数式接口
- 函数接口指的是只有一个函数的接口，这样的接口可以隐式转换为Lambda表达式
```
@FunctionalInterface
public interface Functional {
    void method();
}
```
- 默认方法和静态方法不会破坏函数式接口的定义，因此如下的代码是合法的
```
@FunctionalInterface
public interface FunctionalDefaultMethods {
    void method();
 
    default void defaultMethod() {            
    }        
}
```

```
public class Car {
    public static Car create( final Supplier< Car > supplier ) {
        return supplier.get();
    }

    public static void collide( final Car car ) {
        System.out.println( "Collided " + car.toString() );
    }
```
```
Car car1 = Car.create(Car::new);
Car car2 = Car.create(Car::new);
final List<Car> cars = Arrays.asList(car1, car2);
cars.forEach(Car::collide);
```

### lambda表达式
- [lambda重写compare 方法](https://github.com/Kai-Ch/java_demo/blob/master/src/main/java/com/jd/jdk8/lambda/LambdaListSort.java) 


## [java.util.Function](https://github.com/Kai-Ch/java_demo/blob/master/src/main/java/com/jd/jdk8/function/LambdaCalculate.java)
==避免装箱和拆箱==
1. ##### BinaryOperator<T> 
两个同类型操作，返回同类型
```
BinaryOperator<Long> add = (Long x, Long y) -> x + y;
BinaryOperator<Integer> bmax = BinaryOperator.maxBy(Comparator.naturalOrder());
```
2. ##### BiConsumer<T, U> 
接收两个输入参数,无返回值
```
BiConsumer<String, String> biConsumer = (String str1, String str2) -> System.out.println(str1 + "---" + str2);
```
3. ##### BiFunction<T, U, R>
T - 表示第一个参数,U - 表示第二个参数R - 表示返回结果result
```
BiFunction<String, String, Boolean> biFunction = (str1, str2) -> {
            return str1.equalsIgnoreCase(str2);
        };
```
4. ##### BiPredicate<T, U>
用来做对lambda表达式做判断的Function函数
test:判断是否满足条件   and表示是否同时满足     negate表示非运算，类似"!"   or或者
```
BiPredicate<Integer, Integer> bi1 = (x, y) -> {
            return x > y;
        };
BiPredicate<Integer, Integer> bi2 = (x, y) -> x == y;

System.out.println(bi1.test(1, 2));
System.out.println(bi2.negate().test(1, 2));//取反
System.out.println(bi1.and(bi2).test(1, 2));
System.out.println(bi1.or(bi2).test(1, 2));
```
5. ##### BooleanSupplier
boolean值结果的提供方
```
BooleanSupplier booleanSupplier = () -> bi1.test(2, 1);
System.out.println(booleanSupplier.getAsBoolean());
```
6. ##### DoubleBinaryOperator
输入两个double操作，返回一个double
```
DoubleBinaryOperator doubleBinaryOperator = (d1, d2) -> d1/d2;
System.out.println(doubleBinaryOperator.applyAsDouble(100, 50));
```

7. ##### DoubleConsumer
接受一个double值参数的操作，并且不返回结果
```
DoubleConsumer doubleConsumer = (d1) -> System.out.println(d1);
doubleConsumer.accept(233.222);
```
8. ##### DoubleFunction<R>
```
DoubleFunction<Double> doubleFunction = (d1) -> d1/1000;
System.out.println(doubleFunction.apply(1000));
```
9. ##### ==Function<T,R>==
==接受一个输入参数T，返回一个结果R==
```
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
```
10. ##### IntPredicate
：接受一个int输入参数，返回一个布尔值的结果
```
IntPredicate intPredicate1 = (x) -> x > 0;
IntPredicate intPredicate2 = (x) -> x < 0;
System.out.println(intPredicate1.test(1));
System.out.println(intPredicate1.and(intPredicate2).test(1));
System.out.println(intPredicate1.or(intPredicate2).test(1));
System.out.println(intPredicate1.negate().test(1));//非运算
```
11. ##### Predicate<T>
接受一个参数T，返回一个Boolean值
```
Predicate<Integer> p1 = (t) -> t < 0;
Predicate<Integer> p2 = (t) -> t > 0;
System.out.println(p1.test(1));
System.out.println(p1.and(p2).test(2));
System.out.println(p1.or(p2).test(2));
System.out.println(p1.negate().test(2));
```  
12. ##### ==Supplier<T>==
无参数，返回一个T类型的结果
```
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
```
13. ##### UnaryOperator<T>
接受一个T类型参数，返回一个T类型结果
```
UnaryOperator<String> unaryOperator = (t) -> {
            if (null == t || "".equals(t)) {
                return null;
            } else {
                StringBuffer sb = new StringBuffer(t);
                return sb.reverse().toString();
            }
        };
System.out.println(unaryOperator.apply("asss"));
```
14. ##### 
15. ##### 
16. ##### 
17. ##### 
18. ##### 
19. ##### 
20. ##### 
21. ##### 





