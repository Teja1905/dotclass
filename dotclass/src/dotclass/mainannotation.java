package dotclass;

import java.lang.annotation.Annotation;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.lang.reflect.Method;

public class mainannotation {
	public static void main(String[] args) {
		Class cls = student.class;
		Method[] m =cls.getDeclaredMethods();
		
		for(int i =0;i<m.length;i++) {
		Method m1 =m[i];
		Annotation[] a =m1.getDeclaredAnnotations();
		for(int j=0;j<a.length;j++) {
			System.out.println(m1.getName()+"::"+a[j].annotationType());
		}}
	
		
	}

}
