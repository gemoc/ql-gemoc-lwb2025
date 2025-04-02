package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import org.gemoc.ql.k3ql.k3dsa.ecore.EObjectAspect;
import org.gemoc.ql.model.ql.Form;
import org.gemoc.ql.model.ql.QLModel;

@Aspect(className = QLModel.class)
@SuppressWarnings("all")
public class QLModelAspect {
  @Step
  @InitializeModel
  public static void initializeModel(final QLModel _self, final EList<String> input) {
    final org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspectQLModelAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspectQLModelAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void initializeModel(EList<String>)
    if (_self instanceof org.gemoc.ql.model.ql.QLModel){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspect._privk3_initializeModel(_self_, (org.gemoc.ql.model.ql.QLModel)_self,input);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {input}, command, "QLModel", "initializeModel");
    	} else {
    		command.execute();
    	}
    	;
    };
  }

  @Main
  public static void main(final QLModel _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspectQLModelAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspectQLModelAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void main()
    if (_self instanceof org.gemoc.ql.model.ql.QLModel){
    	org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspect._privk3_main(_self_, (org.gemoc.ql.model.ql.QLModel)_self);
    };
  }

  protected static void _privk3_initializeModel(final QLModelAspectQLModelAspectProperties _self_, final QLModel _self, final EList<String> input) {
    String _get = input.get(0);
    String _plus = ("-> initializeModel() input=" + _get);
    EObjectAspect.devInfo(_self, _plus);
  }

  protected static void _privk3_main(final QLModelAspectQLModelAspectProperties _self_, final QLModel _self) {
    EObjectAspect.devInfo(_self, "-> main() ");
    while (true) {
      EList<Form> _forms = _self.getForms();
      for (final Form f : _forms) {
        FormAspect.render(f);
      }
    }
  }
}
