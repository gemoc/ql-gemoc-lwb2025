package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.QuestionGroup;

@SuppressWarnings("all")
public class QuestionGroupAspectQuestionGroupAspectContext {
  public static final QuestionGroupAspectQuestionGroupAspectContext INSTANCE = new QuestionGroupAspectQuestionGroupAspectContext();

  public static QuestionGroupAspectQuestionGroupAspectProperties getSelf(final QuestionGroup _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.QuestionGroupAspectQuestionGroupAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<QuestionGroup, QuestionGroupAspectQuestionGroupAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.QuestionGroup, org.gemoc.ql.k3ql.k3dsa.ql.QuestionGroupAspectQuestionGroupAspectProperties>();

  public Map<QuestionGroup, QuestionGroupAspectQuestionGroupAspectProperties> getMap() {
    return map;
  }
}
