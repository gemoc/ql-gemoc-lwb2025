package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.Question;

@SuppressWarnings("all")
public class QuestionAspectQuestionAspectContext {
  public static final QuestionAspectQuestionAspectContext INSTANCE = new QuestionAspectQuestionAspectContext();

  public static QuestionAspectQuestionAspectProperties getSelf(final Question _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.QuestionAspectQuestionAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Question, QuestionAspectQuestionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.Question, org.gemoc.ql.k3ql.k3dsa.ql.QuestionAspectQuestionAspectProperties>();

  public Map<Question, QuestionAspectQuestionAspectProperties> getMap() {
    return map;
  }
}
