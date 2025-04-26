package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.gemoc.ql.k3ql.k3dsa.QuestionNotAvailableException;
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
    try {
      boolean _isIsDisplayed = _self.getQuestion().isIsDisplayed();
      if (_isIsDisplayed) {
        return _self.getQuestion().getCurrentValue();
      } else {
        String _name = _self.getQuestion().getName();
        String _plus = ("Question " + _name);
        String _plus_1 = (_plus + " is not displayed and should not be used");
        throw new QuestionNotAvailableException(_plus_1);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
