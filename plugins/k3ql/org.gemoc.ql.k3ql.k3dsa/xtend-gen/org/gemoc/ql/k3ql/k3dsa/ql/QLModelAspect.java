package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.gemoc.ql.k3ql.k3dsa.QLException;
import org.gemoc.ql.k3ql.k3dsa.QuestionNotAvailableException;
import org.gemoc.ql.k3ql.k3dsa.ecore.EObjectAspect;
import org.gemoc.ql.model.ql.BooleanValueType;
import org.gemoc.ql.model.ql.DefinitionGroup;
import org.gemoc.ql.model.ql.Expression;
import org.gemoc.ql.model.ql.QLModel;
import org.gemoc.ql.model.ql.QuestionDefinition;
import org.gemoc.ql.model.ql.QuestionGroup;
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

  public static void resetIsDisplayed(final QLModel _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspectQLModelAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspectQLModelAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void resetIsDisplayed()
    if (_self instanceof org.gemoc.ql.model.ql.QLModel){
    	org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspect._privk3_resetIsDisplayed(_self_, (org.gemoc.ql.model.ql.QLModel)_self);
    };
  }

  /**
   * Recompute which questions must be displayed
   */
  @Step
  public static void updateIsDisplayed(final QLModel _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspectQLModelAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspectQLModelAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void updateIsDisplayed()
    if (_self instanceof org.gemoc.ql.model.ql.QLModel){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspect._privk3_updateIsDisplayed(_self_, (org.gemoc.ql.model.ql.QLModel)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {}, command, "QLModel", "updateIsDisplayed");
    	} else {
    		command.execute();
    	}
    	;
    };
  }

  /**
   * step captured by the Engine Addon to flush the display and render the questions that are marked as isDisplayed = True
   */
  @Step
  public static void renderQuestions(final QLModel _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspectQLModelAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspectQLModelAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void renderQuestions()
    if (_self instanceof org.gemoc.ql.model.ql.QLModel){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspect._privk3_renderQuestions(_self_, (org.gemoc.ql.model.ql.QLModel)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {}, command, "QLModel", "renderQuestions");
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

  /**
   * Consider only displayedComputedQuestion
   * Throw a QuestionNotAvailableException if a computedQuestion depends on a non displayed question
   */
  @Step
  public static void updateAllComputedQuestions(final QLModel _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspectQLModelAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspectQLModelAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void updateAllComputedQuestions()
    if (_self instanceof org.gemoc.ql.model.ql.QLModel){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspect._privk3_updateAllComputedQuestions(_self_, (org.gemoc.ql.model.ql.QLModel)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {}, command, "QLModel", "updateAllComputedQuestions");
    	} else {
    		command.execute();
    	}
    	;
    };
  }

  /**
   * returns the all computedQuestion of self in a topologically sorted order
   * consider only displayed questions
   * Kahn's algorithm from https://en.wikipedia.org/wiki/Topological_sorting
   */
  public static List<QuestionDefinition> sortAllDisplayedComputedQuestions(final QLModel _self, final boolean ignoreHiddenQuestion) {
    final org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspectQLModelAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspectQLModelAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# List<QuestionDefinition> sortAllDisplayedComputedQuestions(boolean)
    if (_self instanceof org.gemoc.ql.model.ql.QLModel){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspect._privk3_sortAllDisplayedComputedQuestions(_self_, (org.gemoc.ql.model.ql.QLModel)_self,ignoreHiddenQuestion);
    };
    return (java.util.List<org.gemoc.ql.model.ql.QuestionDefinition>)result;
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
    final Function1<DefinitionGroup, EList<QuestionDefinition>> _function = (DefinitionGroup f) -> {
      return f.getQuestionDefinitions();
    };
    final Consumer<QuestionDefinition> _function_1 = (QuestionDefinition qd) -> {
      QuestionDefinitionAspect.evaluateComputedQuestionDependencies(qd);
    };
    IterableExtensions.<DefinitionGroup, QuestionDefinition>flatMap(_self.getDefinitionGroup(), _function).forEach(_function_1);
  }

  protected static void _privk3_main(final QLModelAspectQLModelAspectProperties _self_, final QLModel _self) {
    try {
      try {
        EObjectAspect.devInfo(_self, "-> main() ");
        while ((_self.getSubmitDate() == null)) {
          {
            QLModelAspect.updateIsDisplayed(_self);
            QLModelAspect.renderQuestions(_self);
            final Function1<DefinitionGroup, EList<QuestionDefinition>> _function = (DefinitionGroup f) -> {
              return f.getQuestionDefinitions();
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
            final Function1<DefinitionGroup, EList<QuestionDefinition>> _function_3 = (DefinitionGroup f) -> {
              return f.getQuestionDefinitions();
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
            QLModelAspect.updateIsDisplayed(_self);
            QLModelAspect.renderQuestions(_self);
            QLModelAspect.updateAllComputedQuestions(_self);
          }
        }
        QLModelAspect.saveToXmi(_self);
      } catch (final Throwable _t) {
        if (_t instanceof QLException) {
          final QLException e = (QLException)_t;
          EObjectAspect.error(_self, e.getMessage());
          throw e;
        } else if (_t instanceof QuestionNotAvailableException) {
          final QuestionNotAvailableException e_1 = (QuestionNotAvailableException)_t;
          EObjectAspect.error(_self, e_1.getUserMessage());
          throw e_1;
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
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

  protected static void _privk3_updateIsDisplayed(final QLModelAspectQLModelAspectProperties _self_, final QLModel _self) {
    QLModelAspect.resetIsDisplayed(_self);
    EList<QuestionGroup> _questionGroups = _self.getQuestionGroups();
    for (final QuestionGroup qg : _questionGroups) {
      QuestionGroupAspect.updateIsDisplayed(qg);
    }
  }

  protected static void _privk3_renderQuestions(final QLModelAspectQLModelAspectProperties _self_, final QLModel _self) {
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

  protected static void _privk3_updateAllComputedQuestions(final QLModelAspectQLModelAspectProperties _self_, final QLModel _self) {
    List<QuestionDefinition> allComputedQuestions = QLModelAspect.sortAllDisplayedComputedQuestions(_self, true);
    final Function1<QuestionDefinition, String> _function = (QuestionDefinition qd) -> {
      return qd.getName();
    };
    String _join = IterableExtensions.join(ListExtensions.<QuestionDefinition, String>map(allComputedQuestions, _function), ", ");
    String _plus = ("allComputedQuestions=" + _join);
    EObjectAspect.devDebug(_self, _plus);
    final Consumer<QuestionDefinition> _function_1 = (QuestionDefinition qd) -> {
      try {
        try {
          final Value evaluatedExp = ExpressionAspect.evaluate(qd.getComputedExpression());
          final boolean mustUpdate = ((((qd.getCurrentValue() == null) && (evaluatedExp != null)) || (((qd.getCurrentValue() != null) && (evaluatedExp != null)) && (!ValueAspect.bEquals(qd.getCurrentValue(), evaluatedExp).isBooleanValue()))) || ((qd.getCurrentValue() != null) && (evaluatedExp == null)));
          if (mustUpdate) {
            if ((evaluatedExp != null)) {
              qd.setCurrentValue(ValueAspect.copy(evaluatedExp));
              StringConcatenation _builder = new StringConcatenation();
              _builder.append("updating ");
              String _name = qd.getName();
              _builder.append(_name);
              _builder.append(" := ");
              String _string = qd.getCurrentValue().toString();
              _builder.append(_string);
              EObjectAspect.devInfo(_self, _builder.toString());
            } else {
              qd.setCurrentValue(evaluatedExp);
              StringConcatenation _builder_1 = new StringConcatenation();
              _builder_1.append("updating ");
              String _name_1 = qd.getName();
              _builder_1.append(_name_1);
              _builder_1.append(" := ");
              Value _currentValue = qd.getCurrentValue();
              _builder_1.append(_currentValue);
              EObjectAspect.devInfo(_self, _builder_1.toString());
            }
          } else {
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("unchanged ");
            String _name_2 = qd.getName();
            _builder_2.append(_name_2);
            _builder_2.append(" = ");
            Value _currentValue_1 = qd.getCurrentValue();
            _builder_2.append(_currentValue_1);
            EObjectAspect.devDebug(_self, _builder_2.toString());
          }
        } catch (final Throwable _t) {
          if (_t instanceof QuestionNotAvailableException) {
            final QuestionNotAvailableException e = (QuestionNotAvailableException)_t;
            String _name_3 = qd.getName();
            String _plus_1 = ("Question " + _name_3);
            String _plus_2 = (_plus_1 + " cannot depend on a question that currently not displayed.");
            throw new QuestionNotAvailableException(_plus_2, e);
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    allComputedQuestions.forEach(_function_1);
  }

  protected static List<QuestionDefinition> _privk3_sortAllDisplayedComputedQuestions(final QLModelAspectQLModelAspectProperties _self_, final QLModel _self, final boolean ignoreHiddenQuestion) {
    try {
      Iterable<QuestionDefinition> _xifexpression = null;
      if (ignoreHiddenQuestion) {
        final Function1<DefinitionGroup, EList<QuestionDefinition>> _function = (DefinitionGroup f) -> {
          return f.getQuestionDefinitions();
        };
        final Function1<QuestionDefinition, Boolean> _function_1 = (QuestionDefinition qd) -> {
          return Boolean.valueOf(((qd.getComputedExpression() != null) && qd.isIsDisplayed()));
        };
        _xifexpression = IterableExtensions.<QuestionDefinition>filter(IterableExtensions.<DefinitionGroup, QuestionDefinition>flatMap(_self.getDefinitionGroup(), _function), _function_1);
      } else {
        final Function1<DefinitionGroup, EList<QuestionDefinition>> _function_2 = (DefinitionGroup f) -> {
          return f.getQuestionDefinitions();
        };
        final Function1<QuestionDefinition, Boolean> _function_3 = (QuestionDefinition qd) -> {
          Expression _computedExpression = qd.getComputedExpression();
          return Boolean.valueOf((_computedExpression != null));
        };
        _xifexpression = IterableExtensions.<QuestionDefinition>filter(IterableExtensions.<DefinitionGroup, QuestionDefinition>flatMap(_self.getDefinitionGroup(), _function_2), _function_3);
      }
      Iterable<QuestionDefinition> allComputedQuestions = _xifexpression;
      final Consumer<QuestionDefinition> _function_4 = (QuestionDefinition qd) -> {
        QuestionDefinitionAspect.referencingQuestions(qd).clear();
        QuestionDefinitionAspect.dependencies(qd).clear();
      };
      allComputedQuestions.forEach(_function_4);
      final Function1<QuestionDefinition, String> _function_5 = (QuestionDefinition qd) -> {
        return qd.getName();
      };
      String _join = IterableExtensions.join(IterableExtensions.<QuestionDefinition, String>map(allComputedQuestions, _function_5), ", ");
      String _plus = ("sortAllDisplayedComputedQuestions allComputedQuestions=" + _join);
      EObjectAspect.devDebug(_self, _plus);
      final Consumer<QuestionDefinition> _function_6 = (QuestionDefinition qd) -> {
        QuestionDefinitionAspect.evaluateComputedQuestionDependencies(qd);
      };
      allComputedQuestions.forEach(_function_6);
      final List<QuestionDefinition> resList = CollectionLiterals.<QuestionDefinition>newArrayList();
      final Function1<QuestionDefinition, Boolean> _function_7 = (QuestionDefinition qd) -> {
        return Boolean.valueOf(IterableExtensions.isNullOrEmpty(QuestionDefinitionAspect.referencingQuestions(qd)));
      };
      final List<QuestionDefinition> nodeWithNoIncomingEdgeSet = IterableExtensions.<QuestionDefinition>toList(IterableExtensions.<QuestionDefinition>filter(allComputedQuestions, _function_7));
      while ((!nodeWithNoIncomingEdgeSet.isEmpty())) {
        {
          final QuestionDefinition n = nodeWithNoIncomingEdgeSet.get(0);
          nodeWithNoIncomingEdgeSet.remove(0);
          resList.add(n);
          final Consumer<QuestionDefinition> _function_8 = (QuestionDefinition m) -> {
            QuestionDefinitionAspect.dependencies(n).remove(m);
            QuestionDefinitionAspect.referencingQuestions(m).remove(n);
            boolean _isEmpty = QuestionDefinitionAspect.referencingQuestions(m).isEmpty();
            if (_isEmpty) {
              nodeWithNoIncomingEdgeSet.add(m);
            }
          };
          ((List<QuestionDefinition>)Conversions.doWrapArray(((QuestionDefinition[])Conversions.unwrapArray(QuestionDefinitionAspect.dependencies(n), QuestionDefinition.class)).clone())).forEach(_function_8);
        }
      }
      final Function1<QuestionDefinition, Boolean> _function_8 = (QuestionDefinition qd) -> {
        boolean _isEmpty = QuestionDefinitionAspect.dependencies(qd).isEmpty();
        return Boolean.valueOf((!_isEmpty));
      };
      boolean _exists = IterableExtensions.<QuestionDefinition>exists(allComputedQuestions, _function_8);
      if (_exists) {
        EObjectAspect.error(_self, "Found at least one cycle in computed questions ");
        final Function1<QuestionDefinition, Boolean> _function_9 = (QuestionDefinition qd) -> {
          boolean _isEmpty = QuestionDefinitionAspect.dependencies(qd).isEmpty();
          return Boolean.valueOf((!_isEmpty));
        };
        final Function1<QuestionDefinition, String> _function_10 = (QuestionDefinition qd) -> {
          String _name = qd.getName();
          String _plus_1 = (_name + " -> (");
          final Function1<QuestionDefinition, String> _function_11 = (QuestionDefinition qddep) -> {
            return qddep.getName();
          };
          String _join_1 = IterableExtensions.join(IterableExtensions.<QuestionDefinition, String>map(QuestionDefinitionAspect.dependencies(qd), _function_11), ", ");
          String _plus_2 = (_plus_1 + _join_1);
          return (_plus_2 + ")");
        };
        String _join_1 = IterableExtensions.join(IterableExtensions.<QuestionDefinition, String>map(IterableExtensions.<QuestionDefinition>filter(allComputedQuestions, _function_9), _function_10), ",   \n");
        String _plus_1 = ("Questions involved in cycle(s) are:\n" + _join_1);
        EObjectAspect.error(_self, _plus_1);
        throw new QLException("No Topological order can be found");
      } else {
        return ListExtensions.<QuestionDefinition>reverse(resList);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
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
      String _plus_1 = (_plus + ".xmi");
      final URI outputUri = URI.createURI(_plus_1, true);
      String _string = outputUri.toString();
      String _plus_2 = ("Saving to " + _string);
      EObjectAspect.info(_self, _plus_2);
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
