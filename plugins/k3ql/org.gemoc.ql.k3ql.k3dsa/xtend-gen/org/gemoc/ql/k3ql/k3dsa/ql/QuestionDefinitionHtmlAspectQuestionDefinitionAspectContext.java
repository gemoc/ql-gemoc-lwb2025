package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.QuestionDefinition;

@SuppressWarnings("all")
public class QuestionDefinitionHtmlAspectQuestionDefinitionAspectContext {
  public static final QuestionDefinitionHtmlAspectQuestionDefinitionAspectContext INSTANCE = new QuestionDefinitionHtmlAspectQuestionDefinitionAspectContext();

  public static QuestionDefinitionHtmlAspectQuestionDefinitionAspectProperties getSelf(final QuestionDefinition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionHtmlAspectQuestionDefinitionAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<QuestionDefinition, QuestionDefinitionHtmlAspectQuestionDefinitionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.QuestionDefinition, org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionHtmlAspectQuestionDefinitionAspectProperties>();

  public Map<QuestionDefinition, QuestionDefinitionHtmlAspectQuestionDefinitionAspectProperties> getMap() {
    return map;
  }
}
