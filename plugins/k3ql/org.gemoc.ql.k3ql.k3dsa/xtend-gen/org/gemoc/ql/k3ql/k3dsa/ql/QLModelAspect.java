package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import org.gemoc.ql.k3ql.k3dsa.ecore.EObjectAspect;
import org.gemoc.ql.model.ql.DefinitionGroup;
import org.gemoc.ql.model.ql.Form;
import org.gemoc.ql.model.ql.QLModel;
import org.gemoc.ql.model.ql.QuestionDefinition;

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

  /**
   * step captured by the Engine Addon to feed the model forms with input from the user UI
   * it waits for change
   */
  @Step
  public static void waitUserInput(final QLModel _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspectQLModelAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspectQLModelAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void waitUserInput()
    if (_self instanceof org.gemoc.ql.model.ql.QLModel){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspect._privk3_waitUserInput(_self_, (org.gemoc.ql.model.ql.QLModel)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {}, command, "QLModel", "waitUserInput");
    	} else {
    		command.execute();
    	}
    	;
    };
  }

  protected static void _privk3_initializeModel(final QLModelAspectQLModelAspectProperties _self_, final QLModel _self, final EList<String> input) {
    String _get = input.get(0);
    String _plus = ("-> initializeModel() input=" + _get);
    EObjectAspect.devInfo(_self, _plus);
  }

  protected static void _privk3_main(final QLModelAspectQLModelAspectProperties _self_, final QLModel _self) {
    EObjectAspect.devInfo(_self, "-> main() ");
    int i = 5;
    while ((i > 0)) {
      {
        EList<DefinitionGroup> _definitionGroup = _self.getDefinitionGroup();
        for (final DefinitionGroup g : _definitionGroup) {
          EList<QuestionDefinition> _questionDefinitions = g.getQuestionDefinitions();
          for (final QuestionDefinition qd : _questionDefinitions) {
            qd.setIsDisplayed(false);
          }
        }
        EList<Form> _forms = _self.getForms();
        for (final Form f : _forms) {
          FormAspect.render(f);
        }
        QLModelAspect.waitUserInput(_self);
        EList<DefinitionGroup> _definitionGroup_1 = _self.getDefinitionGroup();
        for (final DefinitionGroup g_1 : _definitionGroup_1) {
          EList<QuestionDefinition> _questionDefinitions_1 = g_1.getQuestionDefinitions();
          for (final QuestionDefinition qd_1 : _questionDefinitions_1) {
            boolean _isIsDisplayed = qd_1.isIsDisplayed();
            if (_isIsDisplayed) {
              QuestionDefinitionAspect.updateCurrentValueFromUI(qd_1);
            }
          }
        }
        i--;
      }
    }
  }

  protected static void _privk3_waitUserInput(final QLModelAspectQLModelAspectProperties _self_, final QLModel _self) {
  }
}
