package org.gemoc.ql.k3ql.k3dsa.qls;

import java.util.Map;
import org.gemoc.qls.model.qls.QuestionStyle;

@SuppressWarnings("all")
public class QuestionStyleAspectQuestionStyleAspectContext {
  public static final QuestionStyleAspectQuestionStyleAspectContext INSTANCE = new QuestionStyleAspectQuestionStyleAspectContext();

  public static QuestionStyleAspectQuestionStyleAspectProperties getSelf(final QuestionStyle _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.qls.QuestionStyleAspectQuestionStyleAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<QuestionStyle, QuestionStyleAspectQuestionStyleAspectProperties> map = new java.util.WeakHashMap<org.gemoc.qls.model.qls.QuestionStyle, org.gemoc.ql.k3ql.k3dsa.qls.QuestionStyleAspectQuestionStyleAspectProperties>();

  public Map<QuestionStyle, QuestionStyleAspectQuestionStyleAspectProperties> getMap() {
    return map;
  }
}
