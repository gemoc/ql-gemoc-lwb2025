package org.gemoc.ql.k3ql.k3dsa.qls;

import java.util.Map;
import org.gemoc.qls.model.qls.QuestionReference;

@SuppressWarnings("all")
public class QuestionReferenceHtmlAspectQuestionReferenceAspectContext {
  public static final QuestionReferenceHtmlAspectQuestionReferenceAspectContext INSTANCE = new QuestionReferenceHtmlAspectQuestionReferenceAspectContext();

  public static QuestionReferenceHtmlAspectQuestionReferenceAspectProperties getSelf(final QuestionReference _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.qls.QuestionReferenceHtmlAspectQuestionReferenceAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<QuestionReference, QuestionReferenceHtmlAspectQuestionReferenceAspectProperties> map = new java.util.WeakHashMap<org.gemoc.qls.model.qls.QuestionReference, org.gemoc.ql.k3ql.k3dsa.qls.QuestionReferenceHtmlAspectQuestionReferenceAspectProperties>();

  public Map<QuestionReference, QuestionReferenceHtmlAspectQuestionReferenceAspectProperties> getMap() {
    return map;
  }
}
