package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.gemoc.ql.model.ql.Form;

@Aspect(className = Form.class)
@SuppressWarnings("all")
public class FormAspect extends NamedElementAspect {
  @Step
  public static void render(final Form _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.FormAspectFormAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.FormAspectFormAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void render()
    if (_self instanceof org.gemoc.ql.model.ql.Form){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.gemoc.ql.k3ql.k3dsa.ql.FormAspect._privk3_render(_self_, (org.gemoc.ql.model.ql.Form)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {}, command, "Form", "render");
    	} else {
    		command.execute();
    	}
    	;
    };
  }

  protected static void _privk3_render(final FormAspectFormAspectProperties _self_, final Form _self) {
    QuestionGroupAspect.render(_self.getQuestionGroup());
  }
}
