package robotframework.keyword;

import org.robotframework.javalib.library.AnnotationLibrary;

/**
 * Created by Diego Muner
 */
public class KeywordsLibrary extends AnnotationLibrary {

    public KeywordsLibrary() {
        super("src/robotframework/keywords/*.class");
    }
}