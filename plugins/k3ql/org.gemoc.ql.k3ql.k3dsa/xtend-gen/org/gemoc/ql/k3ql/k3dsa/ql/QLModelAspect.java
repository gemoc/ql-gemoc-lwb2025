package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.gemoc.ql.k3ql.k3dsa.ecore.EObjectAspect;
import org.gemoc.ql.model.ql.BooleanValueType;
import org.gemoc.ql.model.ql.DefinitionGroup;
import org.gemoc.ql.model.ql.Form;
import org.gemoc.ql.model.ql.QLModel;
import org.gemoc.ql.model.ql.QuestionDefinition;
import org.gemoc.ql.model.ql.StringValueType;
import org.gemoc.ql.model.ql.Value;
import org.gemoc.ql.model.ql.ValueType;

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

  @Step
  @Main
  public static void main(final QLModel _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspectQLModelAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspectQLModelAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void main()
    if (_self instanceof org.gemoc.ql.model.ql.QLModel){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspect._privk3_main(_self_, (org.gemoc.ql.model.ql.QLModel)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {}, command, "QLModel", "main");
    	} else {
    		command.execute();
    	}
    	;
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

  /**
   * step captured by the Engine Addon to update the submit button according to the model status
   */
  @Step
  public static void updateSubmitButtonStatus(final QLModel _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspectQLModelAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspectQLModelAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void updateSubmitButtonStatus()
    if (_self instanceof org.gemoc.ql.model.ql.QLModel){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspect._privk3_updateSubmitButtonStatus(_self_, (org.gemoc.ql.model.ql.QLModel)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {}, command, "QLModel", "updateSubmitButtonStatus");
    	} else {
    		command.execute();
    	}
    	;
    };
  }

  /**
   * step captured by the Engine Addon to Read the submitButtonStatus, it sets the submitDate attribute
   */
  @Step
  public static void readSubmitButtonStatus(final QLModel _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspectQLModelAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspectQLModelAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void readSubmitButtonStatus()
    if (_self instanceof org.gemoc.ql.model.ql.QLModel){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspect._privk3_readSubmitButtonStatus(_self_, (org.gemoc.ql.model.ql.QLModel)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {}, command, "QLModel", "readSubmitButtonStatus");
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

  @Step
  public static void saveToXmi(final QLModel _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspectQLModelAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspectQLModelAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void saveToXmi()
    if (_self instanceof org.gemoc.ql.model.ql.QLModel){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspect._privk3_saveToXmi(_self_, (org.gemoc.ql.model.ql.QLModel)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {}, command, "QLModel", "saveToXmi");
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
    QLModelAspect.setInitialValues(_self);
  }

  protected static void _privk3_main(final QLModelAspectQLModelAspectProperties _self_, final QLModel _self) {
    EObjectAspect.devInfo(_self, "-> main() ");
    while ((_self.getSubmitDate() == null)) {
      {
        QLModelAspect.resetIsDisplayed(_self);
        EList<Form> _forms = _self.getForms();
        for (final Form f : _forms) {
          FormAspect.render(f);
        }
        final Function1<DefinitionGroup, EList<QuestionDefinition>> _function = (DefinitionGroup f_1) -> {
          return f_1.getQuestionDefinitions();
        };
        final Function1<QuestionDefinition, Boolean> _function_1 = (QuestionDefinition qd) -> {
          return Boolean.valueOf(qd.isIsDisplayed());
        };
        final Function1<QuestionDefinition, Boolean> _function_2 = (QuestionDefinition qd) -> {
          return Boolean.valueOf(qd.isIsMandatory());
        };
        final Iterable<QuestionDefinition> allDisplayedMandatory = IterableExtensions.<QuestionDefinition>filter(IterableExtensions.<QuestionDefinition>filter(IterableExtensions.<DefinitionGroup, QuestionDefinition>flatMap(_self.getDefinitionGroup(), _function), _function_1), _function_2);
        _self.setCanSubmit((IterableExtensions.isEmpty(allDisplayedMandatory) || IterableExtensions.<QuestionDefinition>forall(allDisplayedMandatory, ((Function1<QuestionDefinition, Boolean>) (QuestionDefinition qd) -> {
          Value _currentValue = qd.getCurrentValue();
          return Boolean.valueOf((_currentValue != null));
        }))));
        QLModelAspect.updateSubmitButtonStatus(_self);
        QLModelAspect.waitUserInput(_self);
        final Function1<DefinitionGroup, EList<QuestionDefinition>> _function_3 = (DefinitionGroup f_1) -> {
          return f_1.getQuestionDefinitions();
        };
        final Function1<QuestionDefinition, Boolean> _function_4 = (QuestionDefinition qd) -> {
          return Boolean.valueOf(qd.isIsDisplayed());
        };
        Iterable<QuestionDefinition> allDisplayedQuestion = IterableExtensions.<QuestionDefinition>filter(IterableExtensions.<DefinitionGroup, QuestionDefinition>flatMap(_self.getDefinitionGroup(), _function_3), _function_4);
        final Consumer<QuestionDefinition> _function_5 = (QuestionDefinition qd) -> {
          QuestionDefinitionAspect.updateCurrentValueFromUI(qd);
        };
        allDisplayedQuestion.forEach(_function_5);
        QLModelAspect.readSubmitButtonStatus(_self);
      }
    }
    QLModelAspect.saveToXmi(_self);
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

  protected static void _privk3_updateSubmitButtonStatus(final QLModelAspectQLModelAspectProperties _self_, final QLModel _self) {
  }

  protected static void _privk3_readSubmitButtonStatus(final QLModelAspectQLModelAspectProperties _self_, final QLModel _self) {
  }

  protected static void _privk3_setInitialValues(final QLModelAspectQLModelAspectProperties _self_, final QLModel _self) {
    EList<DefinitionGroup> _definitionGroup = _self.getDefinitionGroup();
    for (final DefinitionGroup g : _definitionGroup) {
      EList<QuestionDefinition> _questionDefinitions = g.getQuestionDefinitions();
      for (final QuestionDefinition qd : _questionDefinitions) {
        {
          final ValueType dataType = qd.getDataType();
          boolean _matched = false;
          if (dataType instanceof BooleanValueType) {
            _matched=true;
          }
          if (!_matched) {
            if (dataType instanceof StringValueType) {
              _matched=true;
            }
          }
          if (_matched) {
            qd.setCurrentValue(ValueTypeAspect.createDefaultValue(qd.getDataType()));
          }
          if (!_matched) {
            qd.setCurrentValue(null);
          }
        }
      }
    }
  }

  protected static void _privk3_saveToXmi(final QLModelAspectQLModelAspectProperties _self_, final QLModel _self) {
    try {
      final Resource origResource = _self.eResource();
      final URI resourceUri = _self.eResource().getURI();
      final String fileName = resourceUri.lastSegment();
      final String platformFolderPath = resourceUri.trimSegments(1).toString();
      final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
      String _format = dateFormat.format(_self.getSubmitDate());
      final String postfix = ("_" + _format);
      String _replaceFirst = fileName.replaceFirst("\\.([^.]+)$", (postfix + ".$1"));
      String _plus = ((platformFolderPath + "/reports/") + _replaceFirst);
      final URI outputUri = URI.createURI(_plus, true);
      String _string = outputUri.toString();
      String _plus_1 = ("Saving to " + _string);
      EObjectAspect.devInfo(_self, _plus_1);
      final ResourceSetImpl resourceSet = new ResourceSetImpl();
      Map<String, Object> _extensionToFactoryMap = resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _extensionToFactoryMap.put(
        "*", _xMIResourceFactoryImpl);
      final Resource outputResource = resourceSet.createResource(outputUri);
      outputResource.getContents().addAll(_self.eResource().getContents());
      outputResource.save(new Function0<Map<?, ?>>() {
        @Override
        public Map<?, ?> apply() {
          return null;
        }
      }.apply());
      origResource.getContents().addAll(outputResource.getContents());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
