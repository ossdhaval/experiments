package com.annotation;

import com.annotation.Subject;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Caller {

    public static void main(String[] args) throws NoSuchFieldException {
        Subject s1 = new Subject();
        System.out.println(s1.add());

         java.lang.reflect.Field[] fields = s1
                .getClass().getFields();

         for(Field f : fields) {
             Annotation jansAnnotation = f.getAnnotation(JansConfigProperty.class);
             JansConfigProperty ja = (JansConfigProperty) jansAnnotation;
             System.out.println(ja.description());
         }



    }

}
