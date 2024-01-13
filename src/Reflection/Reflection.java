package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        Class<?> obj = Class.forName("Reflection.Employee");
        System.out.println(obj.getName());

        Constructor<?>[] cons= obj.getDeclaredConstructors();
        Field[] fields= obj.getDeclaredFields();

        for(Constructor<?> con: cons) {
            System.out.println(con.getName());
        }

        for(Field field:fields) {
            System.out.println(field.getName());
        }

        Method[] methods= obj.getDeclaredMethods();
        for(Method method:methods) {
            if(method.getName().equalsIgnoreCase("test"))
                method.invoke(new Employee(),"Nilesh");
        }

    }

}
