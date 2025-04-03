package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.gemoc.ql.model.ql.Question;

@Aspect(className = Question.class)
@SuppressWarnings("all")
public class QuestionAspect {
  /**
   * this step is captured by the EngineAddons to concretely add the question in the form
   */
  @Step
  public static void show(final Question _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.QuestionAspectQuestionAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.QuestionAspectQuestionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void show()
    if (_self instanceof org.gemoc.ql.model.ql.Question){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.gemoc.ql.k3ql.k3dsa.ql.QuestionAspect._privk3_show(_self_, (org.gemoc.ql.model.ql.Question)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {}, command, "Question", "show");
    	} else {
    		command.execute();
    	}
    	;
    };
  }

  protected static void _privk3_show(final QuestionAspectQuestionAspectProperties _self_, final Question _self) {
  }
}
