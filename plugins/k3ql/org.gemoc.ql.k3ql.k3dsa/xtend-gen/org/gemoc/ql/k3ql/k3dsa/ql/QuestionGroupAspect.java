package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.common.util.EList;
import org.gemoc.ql.model.ql.QuestionGroup;

@Aspect(className = QuestionGroup.class)
@SuppressWarnings("all")
public class QuestionGroupAspect extends ConditionnalElementAspect {
  public static void render(final QuestionGroup _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.QuestionGroupAspectQuestionGroupAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.QuestionGroupAspectQuestionGroupAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void render()
    if (_self instanceof org.gemoc.ql.model.ql.QuestionGroup){
    	org.gemoc.ql.k3ql.k3dsa.ql.QuestionGroupAspect._privk3_render(_self_, (org.gemoc.ql.model.ql.QuestionGroup)_self);
    };
  }

  protected static void _privk3_render(final QuestionGroupAspectQuestionGroupAspectProperties _self_, final QuestionGroup _self) {
    EList<QuestionGroup> _questionGroups = _self.getQuestionGroups();
    for (final QuestionGroup subGroup : _questionGroups) {
      QuestionGroupAspect.render(subGroup);
    }
  }
}
