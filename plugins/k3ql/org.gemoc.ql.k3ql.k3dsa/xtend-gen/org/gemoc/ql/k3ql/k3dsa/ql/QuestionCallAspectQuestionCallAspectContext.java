package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.QuestionCall;

@SuppressWarnings("all")
public class QuestionCallAspectQuestionCallAspectContext {
  public static final QuestionCallAspectQuestionCallAspectContext INSTANCE = new QuestionCallAspectQuestionCallAspectContext();

  public static QuestionCallAspectQuestionCallAspectProperties getSelf(final QuestionCall _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.QuestionCallAspectQuestionCallAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<QuestionCall, QuestionCallAspectQuestionCallAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.QuestionCall, org.gemoc.ql.k3ql.k3dsa.ql.QuestionCallAspectQuestionCallAspectProperties>();

  public Map<QuestionCall, QuestionCallAspectQuestionCallAspectProperties> getMap() {
    return map;
  }
}
