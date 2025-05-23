package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.gemoc.ql.k3ql.k3dsa.QuestionNotAvailableException;
import org.gemoc.ql.model.ql.Question;
import org.gemoc.ql.model.ql.QuestionDefinition;
import org.gemoc.ql.model.ql.QuestionGroup;

@Aspect(className = QuestionGroup.class)
@SuppressWarnings("all")
public class QuestionGroupAspect extends ConditionnalElementAspect {
  @Step
  public static void updateIsDisplayed(final QuestionGroup _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.QuestionGroupAspectQuestionGroupAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.QuestionGroupAspectQuestionGroupAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void updateIsDisplayed()
    if (_self instanceof org.gemoc.ql.model.ql.QuestionGroup){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.gemoc.ql.k3ql.k3dsa.ql.QuestionGroupAspect._privk3_updateIsDisplayed(_self_, (org.gemoc.ql.model.ql.QuestionGroup)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {}, command, "QuestionGroup", "updateIsDisplayed");
    	} else {
    		command.execute();
    	}
    	;
    };
  }

  protected static void _privk3_updateIsDisplayed(final QuestionGroupAspectQuestionGroupAspectProperties _self_, final QuestionGroup _self) {
    try {
      try {
        if (((_self.getGuard() == null) || Boolean.valueOf(ExpressionAspect.evaluateAsBoolean(_self.getGuard())).booleanValue())) {
          EList<Question> _questions = _self.getQuestions();
          for (final Question question : _questions) {
            QuestionDefinition _questionDefinition = question.getQuestionDefinition();
            _questionDefinition.setIsDisplayed(true);
          }
          EList<QuestionGroup> _questionGroups = _self.getQuestionGroups();
          for (final QuestionGroup subGroup : _questionGroups) {
            QuestionGroupAspect.updateIsDisplayed(subGroup);
          }
        } else {
          EList<Question> _questions_1 = _self.getQuestions();
          for (final Question question_1 : _questions_1) {
            QuestionDefinition _questionDefinition_1 = question_1.getQuestionDefinition();
            _questionDefinition_1.setIsDisplayed(false);
          }
        }
      } catch (final Throwable _t) {
        if (_t instanceof QuestionNotAvailableException) {
          final QuestionNotAvailableException e = (QuestionNotAvailableException)_t;
          throw new QuestionNotAvailableException("cannot use not displayed question in group guard", e);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
