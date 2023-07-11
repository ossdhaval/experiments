package com.baeldung;

import com.google.auto.service.AutoService;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

@SupportedAnnotationTypes("com.baeldung.BuilderProperty")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
//@AutoService(Processor.class)
public class BuilderProcessor  extends AbstractProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> annotations,
                           RoundEnvironment roundEnv) {


        for (TypeElement annotation : annotations) {
            Set<? extends Element> annotatedElements = roundEnv.getElementsAnnotatedWith(annotation);


            List<Element> setters = new ArrayList<>();
            setters.addAll(annotatedElements);
            for(Element e : setters)
            {
                System.out.println(e.getSimpleName());
                BuilderProperty bp = e.getAnnotation(BuilderProperty.class);
                System.out.println(bp.description());

                BufferedWriter writer = null;
                try {
                    writer = new BufferedWriter(new FileWriter("/home/dhaval/IdeaProjects/ossdhaval/experiments/annotation-processor/src/main/java/com/baeldung/out.put"));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    writer.write(bp.description());
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

                try {
                    writer.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }

        }

        return false;

    }
}
