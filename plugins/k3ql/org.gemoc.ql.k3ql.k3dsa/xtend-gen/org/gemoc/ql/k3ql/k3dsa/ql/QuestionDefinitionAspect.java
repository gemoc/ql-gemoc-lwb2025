package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.ql.model.ql.QuestionDefinition;

@Aspect(className = QuestionDefinition.class)
@SuppressWarnings("all")
public class QuestionDefinitionAspect extends NamedElementAspect {
  /**
   * this step is captured by the EngineAddons to concretely update the currentValue from the value in the UI form
   */
  public static void updateCurrentValueFromUI(final QuestionDefinition _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionAspectQuestionDefinitionAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionAspectQuestionDefinitionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void updateCurrentValueFromUI()
    if (_self instanceof org.gemoc.ql.model.ql.QuestionDefinition){
    	org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionAspect._privk3_updateCurrentValueFromUI(_self_, (org.gemoc.ql.model.ql.QuestionDefinition)_self);
    };
  }

  protected static void _privk3_updateCurrentValueFromUI(final QuestionDefinitionAspectQuestionDefinitionAspectProperties _self_, final QuestionDefinition _self) {
  }
}
