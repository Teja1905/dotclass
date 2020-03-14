package dotclass;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class clsmain {
	public static void main(String[] args) {
		Class cls = student.class;
		Field[] f =cls.getDeclaredFields();
		
		for(int i=0;i<f.length;i++) {
			System.out.println(f[i].getName());
		}
		
		System.out.println("============");
		Method[] m = cls.getDeclaredMethods();
		for(int i=0;i<m.length;i++) {
			System.out.println(m[i].getName());
		}
		
		System.out.println("============");
		Constructor[] c =cls.getDeclaredConstructors();
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i].getName());
		}
		System.out.println("============");
		Annotation[]a =cls.getDeclaredAnnotations();
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i].annotationType());
		}
		
	}

}
