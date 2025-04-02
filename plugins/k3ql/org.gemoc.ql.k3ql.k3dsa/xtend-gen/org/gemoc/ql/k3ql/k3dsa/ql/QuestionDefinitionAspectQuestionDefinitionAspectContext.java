package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.QuestionDefinition;

@SuppressWarnings("all")
public class QuestionDefinitionAspectQuestionDefinitionAspectContext {
  public static final QuestionDefinitionAspectQuestionDefinitionAspectContext INSTANCE = new QuestionDefinitionAspectQuestionDefinitionAspectContext();

  public static QuestionDefinitionAspectQuestionDefinitionAspectProperties getSelf(final QuestionDefinition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionAspectQuestionDefinitionAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<QuestionDefinition, QuestionDefinitionAspectQuestionDefinitionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.QuestionDefinition, org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionAspectQuestionDefinitionAspectProperties>();

  public Map<QuestionDefinition, QuestionDefinitionAspectQuestionDefinitionAspectProperties> getMap() {
    return map;
  }
}
