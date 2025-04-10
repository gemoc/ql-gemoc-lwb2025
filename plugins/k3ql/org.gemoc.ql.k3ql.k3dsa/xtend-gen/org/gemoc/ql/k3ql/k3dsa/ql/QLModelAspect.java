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

  /**
   * step captured by the Engine Addon to flush the display, so we can add the field again according to their newly isDisplayed status
   * it waits for change
   */
  @Step
  public static void resetIsDisplayed(final QLModel _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspectQLModelAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspectQLModelAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void resetIsDisplayed()
    if (_self instanceof org.gemoc.ql.model.ql.QLModel){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspect._privk3_resetIsDisplayed(_self_, (org.gemoc.ql.model.ql.QLModel)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {}, command, "QLModel", "resetIsDisplayed");
    	} else {
    		command.execute();
    	}
    	;
    };
  }

  public static void setInitialValues(final QLModel _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspectQLModelAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspectQLModelAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void setInitialValues()
    if (_self instanceof org.gemoc.ql.model.ql.QLModel){
    	org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspect._privk3_setInitialValues(_self_, (org.gemoc.ql.model.ql.QLModel)_self);
    };
  }

  protected static void _privk3_initializeModel(final QLModelAspectQLModelAspectProperties _self_, final QLModel _self, final EList<String> input) {
    String _get = input.get(0);
    String _plus = ("-> initializeModel() input=" + _get);
    EObjectAspect.devInfo(_self, _plus);
    QLModelAspect.setInitialValues(_self);
  }

  protected static void _privk3_main(final QLModelAspectQLModelAspectProperties _self_, final QLModel _self) {
    EObjectAspect.devInfo(_self, "-> main() ");
    int i = 100;
    while ((i > 0)) {
      {
        QLModelAspect.resetIsDisplayed(_self);
        EList<Form> _forms = _self.getForms();
        for (final Form f : _forms) {
          FormAspect.render(f);
        }
        QLModelAspect.waitUserInput(_self);
        EList<DefinitionGroup> _definitionGroup = _self.getDefinitionGroup();
        for (final DefinitionGroup g : _definitionGroup) {
          EList<QuestionDefinition> _questionDefinitions = g.getQuestionDefinitions();
          for (final QuestionDefinition qd : _questionDefinitions) {
            boolean _isIsDisplayed = qd.isIsDisplayed();
            if (_isIsDisplayed) {
              QuestionDefinitionAspect.updateCurrentValueFromUI(qd);
            }
          }
        }
        i--;
      }
    }
  }

  protected static void _privk3_waitUserInput(final QLModelAspectQLModelAspectProperties _self_, final QLModel _self) {
  }

  protected static void _privk3_resetIsDisplayed(final QLModelAspectQLModelAspectProperties _self_, final QLModel _self) {
    EList<DefinitionGroup> _definitionGroup = _self.getDefinitionGroup();
    for (final DefinitionGroup g : _definitionGroup) {
      EList<QuestionDefinition> _questionDefinitions = g.getQuestionDefinitions();
      for (final QuestionDefinition qd : _questionDefinitions) {
        qd.setIsDisplayed(false);
      }
    }
  }

  protected static void _privk3_setInitialValues(final QLModelAspectQLModelAspectProperties _self_, final QLModel _self) {
    EList<DefinitionGroup> _definitionGroup = _self.getDefinitionGroup();
    for (final DefinitionGroup g : _definitionGroup) {
      EList<QuestionDefinition> _questionDefinitions = g.getQuestionDefinitions();
      for (final QuestionDefinition qd : _questionDefinitions) {
        qd.setCurrentValue(ValueTypeAspect.createDefaultValue(qd.getDataType()));
      }
    }
  }
}
