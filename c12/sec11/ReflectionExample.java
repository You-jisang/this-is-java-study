package c12.sec11;

import java.awt.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        Class clazz = Car.class;
        System.out.println("생성자 정보");
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for(Constructor constructor : constructors) {
            System.out.print(constructor.getName() + "(");
            Class[] parameters = constructor.getParameterTypes();
            printParameters(parameters);
            System.out.println(")");
        }
        System.out.println();

        System.out.println("필드 정보");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getType().getName()+ " " + field.getName());
        }
        System.out.println(")");



    }

    private static void printParameters(Class[] parameters) {
        for (int i = 0; i<parameters.length;i++) {
            System.out.print(parameters[i].getName());
            if (i < (parameters.length-1)) {
                System.out.print(",");
            }
        }
    }
}
