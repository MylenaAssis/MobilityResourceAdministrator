package br.com.mylena.cadastrodeveiculos;

import br.com.mylena.cadastrodeveiculos.domain.Car;
import br.com.mylena.cadastrodeveiculos.domain.Priority;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class ReflectionTestCase {
    public static void executarLeituraAnotacao() {
        Car car = new Car();

        System.out.println("**** Annotations de tipo da classe ****");
        Annotation[] annotations = car.getClass().getAnnotations();
        for (Annotation a : annotations) {
            System.out.println("Annotation type: " + a.annotationType());
        }

        if (car.getClass().isAnnotationPresent(Priority.class)) {
            Priority priority = car.getClass().getAnnotation(Priority.class);
            System.out.println("Annotation: " + priority.getClass().getName());
            System.out.println("Annotation value:: " + priority.value());
        }

        System.out.println("**** Annotations de propriedade (Field) ****");
        for (Field field : car.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(Priority.class)) {
                Priority priority = field.getAnnotation(Priority.class);
                System.out.println("Nome da annotation: " + priority.toString());
                System.out.println("Valor passado na annotation: " + priority.value());
            }
        }
    }
}
