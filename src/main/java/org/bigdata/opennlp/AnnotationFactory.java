package org.bigdata.opennlp;

import java.io.IOException;

public abstract class AnnotationFactory {
  public abstract Annotation createAnnotation(String source) throws IOException;
}
