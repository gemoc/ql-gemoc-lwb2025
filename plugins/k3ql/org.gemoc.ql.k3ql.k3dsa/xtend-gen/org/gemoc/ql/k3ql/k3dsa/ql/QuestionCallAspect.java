package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.ql.model.ql.QuestionCall;
import org.gemoc.ql.model.ql.Value;

@Aspect(className = QuestionCall.class)
@SuppressWarnings("all")
public class QuestionCallAspect extends CallAspect {
  public static Value evaluate(final QuestionCall _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.QuestionCallAspectQuestionCallAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.QuestionCallAspectQuestionCallAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value evaluate()
    if (_self instanceof org.gemoc.ql.model.ql.QuestionCall){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.QuestionCallAspect._privk3_evaluate(_self_, (org.gemoc.ql.model.ql.QuestionCall)_self);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  protected static Value _privk3_evaluate(final QuestionCallAspectQuestionCallAspectProperties _self_, final QuestionCall _self) {
    return _self.getQuestion().getCurrentValue();
  }
}
