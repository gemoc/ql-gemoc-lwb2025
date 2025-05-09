package org.gemoc.ql.k3ql.k3dsa.qls;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspect;
import org.gemoc.qls.model.qls.QLSModel;

@Aspect(className = QLSModel.class)
@SuppressWarnings("all")
public class QLSModelAspect {
  @Step
  @InitializeModel
  public static void initializeModel(final QLSModel _self, final EList<String> input) {
    final org.gemoc.ql.k3ql.k3dsa.qls.QLSModelAspectQLSModelAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.qls.QLSModelAspectQLSModelAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void initializeModel(EList<String>)
    if (_self instanceof org.gemoc.qls.model.qls.QLSModel){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.gemoc.ql.k3ql.k3dsa.qls.QLSModelAspect._privk3_initializeModel(_self_, (org.gemoc.qls.model.qls.QLSModel)_self,input);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {input}, command, "QLSModel", "initializeModel");
    	} else {
    		command.execute();
    	}
    	;
    };
  }

  @Step
  @Main
  public static void main(final QLSModel _self) {
    final org.gemoc.ql.k3ql.k3dsa.qls.QLSModelAspectQLSModelAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.qls.QLSModelAspectQLSModelAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void main()
    if (_self instanceof org.gemoc.qls.model.qls.QLSModel){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.gemoc.ql.k3ql.k3dsa.qls.QLSModelAspect._privk3_main(_self_, (org.gemoc.qls.model.qls.QLSModel)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {}, command, "QLSModel", "main");
    	} else {
    		command.execute();
    	}
    	;
    };
  }

  protected static void _privk3_initializeModel(final QLSModelAspectQLSModelAspectProperties _self_, final QLSModel _self, final EList<String> input) {
    QLModelAspect.initializeModel(_self.getStyledQLModel(), input);
  }

  protected static void _privk3_main(final QLSModelAspectQLSModelAspectProperties _self_, final QLSModel _self) {
    QLModelAspect.main(_self.getStyledQLModel());
  }
}
