package com.xurui.utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import com.xurui.pojo.User;

public class GotClassProperty {
 
	@SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        Class clazz = User.class;
		System.out.println("------获取类名-----------");
		System.out.println(clazz.toString());// 获取类的完整名
		System.out.println(clazz.getSimpleName());// 获取类名
		System.out.println("------获取类中的构造方法-----------");
		// 获得所有构造方法
		Constructor[] cons = clazz.getDeclaredConstructors();
		for (int i = 0; i < cons.length; i++) {
		    System.out.println("所有构造方法之" + cons[i].getName());
		    // 方法修饰符
		    System.out.println("修饰符类型：" + cons[i].getModifiers());
		}
		// 获得所有公共构造方法
		Constructor[] cons1 = clazz.getConstructors();
		for (int i = 0; i < cons1.length; i++) {
		    System.out.println("公共构造方法之" + cons1[i].getName() + "--");
		    System.out.println("修饰符类型：" + cons1[i].getModifiers());
		}
		System.out.println("-----获取类中定义的方法------------");
		Method[] mths = clazz.getDeclaredMethods();
		for (int i = 0; i < mths.length; i++) {
		    System.out.println("所有方法之" + mths[i].getName());
		    System.out.println("修饰符类型：" + mths[i].getModifiers());
		}
		Method[] mths1 = clazz.getMethods();
		for (int i = 0; i < mths1.length; i++) {
		    System.out.println("公有方法之" + mths1[i].getName());
		    System.out.println("修饰符类型：" + mths1[i].getModifiers());
		}
		System.out.println("-------获取所有的属性------------");
		Field[] fls = clazz.getFields();
		for (int i = 0; i < fls.length; i++) {
		    System.out.println("公有属性之" + fls[i].getName());
		    System.out.println("修饰符类型：" + fls[i].getModifiers());
		}
		Field[] fls1 = clazz.getDeclaredFields();
		for (int i = 0; i < fls1.length; i++) {
		    System.out.println("所有属性之" + fls1[i].getName());
		    System.out.println("修饰符类型：" + fls1[i].getModifiers());
		}
		
		
		//获得类  
		System.out.println("-------------------------------------------------------");
	    // 获取实体类的所有属性信息，返回Field数组  
	    Field[] fields = clazz.getDeclaredFields();  
	    for (Field field : fields) {  
	        System.out.println(field);  
            int mod = field.getModifiers();
            System.out.println(Modifier.toString(mod));
	        String type = field.getGenericType().toString(); 
	        System.out.println(type);
	        String name = field.getName();  
	        System.out.println(name);
	        System.out.println("-------------------------------------------------------");
	    }  
    }
	
	
	
}
