package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Set;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.gemoc.ql.model.ql.QuestionDefinition;

@SuppressWarnings("all")
public class QuestionDefinitionAspectQuestionDefinitionAspectProperties {
  public Set<QuestionDefinition> dependencies = CollectionLiterals.<QuestionDefinition>newHashSet();

  public Set<QuestionDefinition> referencingQuestions = CollectionLiterals.<QuestionDefinition>newHashSet();
}
