package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import org.gemoc.ql.model.ql.Expression;
import org.gemoc.ql.model.ql.Question;
import org.gemoc.ql.model.ql.QuestionDefinition;
import org.gemoc.ql.model.ql.QuestionGroup;

@Aspect(className = QuestionGroup.class)
@SuppressWarnings("all")
public class QuestionGroupAspect extends ConditionnalElementAspect {
  @Step
  public static void render(final QuestionGroup _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.QuestionGroupAspectQuestionGroupAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.QuestionGroupAspectQuestionGroupAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void render()
    if (_self instanceof org.gemoc.ql.model.ql.QuestionGroup){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.gemoc.ql.k3ql.k3dsa.ql.QuestionGroupAspect._privk3_render(_self_, (org.gemoc.ql.model.ql.QuestionGroup)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {}, command, "QuestionGroup", "render");
    	} else {
    		command.execute();
    	}
    	;
    };
  }

  protected static void _privk3_render(final QuestionGroupAspectQuestionGroupAspectProperties _self_, final QuestionGroup _self) {
    Expression _guard = _self.getGuard();
    boolean _tripleEquals = (_guard == null);
    if (_tripleEquals) {
      EList<Question> _questions = _self.getQuestions();
      for (final Question question : _questions) {
        {
          QuestionDefinition _questionDefinition = question.getQuestionDefinition();
          _questionDefinition.setIsDisplayed(true);
          QuestionAspect.show(question);
        }
      }
    }
    EList<QuestionGroup> _questionGroups = _self.getQuestionGroups();
    for (final QuestionGroup subGroup : _questionGroups) {
      QuestionGroupAspect.render(subGroup);
    }
  }
}
