package org.gemoc.ql.k3ql.k3dsa.ql;

import com.google.common.collect.Iterators;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.gemoc.ql.k3ql.k3dsa.QLException;
import org.gemoc.ql.k3ql.k3dsa.ecore.EObjectAspect;
import org.gemoc.ql.model.ql.BooleanValueType;
import org.gemoc.ql.model.ql.DefinitionGroup;
import org.gemoc.ql.model.ql.Form;
import org.gemoc.ql.model.ql.QLModel;
import org.gemoc.ql.model.ql.QuestionCall;
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

  /**
   * TODO only displayedComputedQuestion ?
   * TODO what happen if a computedQuestion depends on a non displayed question ?
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
  public static List<QuestionDefinition> sortAllDisplayedComputedQuestions(final QLModel _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspectQLModelAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspectQLModelAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# List<QuestionDefinition> sortAllDisplayedComputedQuestions()
    if (_self instanceof org.gemoc.ql.model.ql.QLModel){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspect._privk3_sortAllDisplayedComputedQuestions(_self_, (org.gemoc.ql.model.ql.QLModel)_self);
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
        QLModelAspect.updateAllComputedQuestions(_self);
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

  protected static void _privk3_updateAllComputedQuestions(final QLModelAspectQLModelAspectProperties _self_, final QLModel _self) {
    List<QuestionDefinition> allComputedQuestions = QLModelAspect.sortAllDisplayedComputedQuestions(_self);
    final Function1<QuestionDefinition, String> _function = (QuestionDefinition qd) -> {
      return qd.getName();
    };
    String _join = IterableExtensions.join(ListExtensions.<QuestionDefinition, String>map(allComputedQuestions, _function), ", ");
    String _plus = ("allComputedQuestions=" + _join);
    EObjectAspect.devDebug(_self, _plus);
    final Consumer<QuestionDefinition> _function_1 = (QuestionDefinition qd) -> {
      try {
        final Function1<QuestionCall, Boolean> _function_2 = (QuestionCall qc) -> {
          boolean _isIsDisplayed = qc.getQuestion().isIsDisplayed();
          return Boolean.valueOf((!_isIsDisplayed));
        };
        final Iterator<QuestionCall> notDisplayedDependencies = IteratorExtensions.<QuestionCall>filter(Iterators.<QuestionCall>filter(qd.getComputedExpression().eAllContents(), QuestionCall.class), _function_2);
        boolean _isEmpty = IteratorExtensions.isEmpty(notDisplayedDependencies);
        boolean _not = (!_isEmpty);
        if (_not) {
          EObjectAspect.error(_self, "TODO implement better user feedback");
          String _name = qd.getName();
          String _plus_1 = ("Question " + _name);
          String _plus_2 = (_plus_1 + " depends on question(s) ");
          final Function1<QuestionCall, String> _function_3 = (QuestionCall qdc) -> {
            return qdc.getQuestion().getName();
          };
          String _join_1 = IteratorExtensions.join(IteratorExtensions.<QuestionCall, String>map(notDisplayedDependencies, _function_3), ", ");
          String _plus_3 = (_plus_2 + _join_1);
          String _plus_4 = (_plus_3 + " that are currently not displayed ");
          throw new QLException(_plus_4);
        } else {
          qd.setCurrentValue(ExpressionAspect.evaluate(qd.getComputedExpression()));
        }
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    allComputedQuestions.forEach(_function_1);
  }

  protected static List<QuestionDefinition> _privk3_sortAllDisplayedComputedQuestions(final QLModelAspectQLModelAspectProperties _self_, final QLModel _self) {
    try {
      final Function1<DefinitionGroup, EList<QuestionDefinition>> _function = (DefinitionGroup f) -> {
        return f.getQuestionDefinitions();
      };
      final Function1<QuestionDefinition, Boolean> _function_1 = (QuestionDefinition qd) -> {
        return Boolean.valueOf(((qd.getComputedExpression() != null) && qd.isIsDisplayed()));
      };
      Iterable<QuestionDefinition> allComputedQuestions = IterableExtensions.<QuestionDefinition>filter(IterableExtensions.<DefinitionGroup, QuestionDefinition>flatMap(_self.getDefinitionGroup(), _function), _function_1);
      final Function1<QuestionDefinition, String> _function_2 = (QuestionDefinition qd) -> {
        return qd.getName();
      };
      String _join = IterableExtensions.join(IterableExtensions.<QuestionDefinition, String>map(allComputedQuestions, _function_2), ", ");
      String _plus = ("sortAllDisplayedComputedQuestions allComputedQuestions=" + _join);
      EObjectAspect.devDebug(_self, _plus);
      final Consumer<QuestionDefinition> _function_3 = (QuestionDefinition qd) -> {
        QuestionDefinitionAspect.evaluateComputedQuestionDependencies(qd);
      };
      allComputedQuestions.forEach(_function_3);
      final List<QuestionDefinition> resList = CollectionLiterals.<QuestionDefinition>newArrayList();
      final Function1<QuestionDefinition, Boolean> _function_4 = (QuestionDefinition qd) -> {
        return Boolean.valueOf(IterableExtensions.isNullOrEmpty(QuestionDefinitionAspect.referencingQuestions(qd)));
      };
      final List<QuestionDefinition> nodeWithNoIncomingEdgeSet = IterableExtensions.<QuestionDefinition>toList(IterableExtensions.<QuestionDefinition>filter(allComputedQuestions, _function_4));
      while ((!nodeWithNoIncomingEdgeSet.isEmpty())) {
        {
          final QuestionDefinition n = nodeWithNoIncomingEdgeSet.get(0);
          nodeWithNoIncomingEdgeSet.remove(0);
          resList.add(n);
          final Consumer<QuestionDefinition> _function_5 = (QuestionDefinition m) -> {
            QuestionDefinitionAspect.dependencies(n).remove(m);
            QuestionDefinitionAspect.referencingQuestions(m).remove(n);
            boolean _isEmpty = QuestionDefinitionAspect.referencingQuestions(m).isEmpty();
            if (_isEmpty) {
              nodeWithNoIncomingEdgeSet.add(m);
            }
          };
          ((List<QuestionDefinition>)Conversions.doWrapArray(((QuestionDefinition[])Conversions.unwrapArray(QuestionDefinitionAspect.dependencies(n), QuestionDefinition.class)).clone())).forEach(_function_5);
        }
      }
      final Function1<QuestionDefinition, Boolean> _function_5 = (QuestionDefinition qd) -> {
        boolean _isEmpty = QuestionDefinitionAspect.dependencies(qd).isEmpty();
        return Boolean.valueOf((!_isEmpty));
      };
      boolean _exists = IterableExtensions.<QuestionDefinition>exists(allComputedQuestions, _function_5);
      if (_exists) {
        EObjectAspect.error(_self, "Found at least one cycle in computed questions ");
        final Function1<QuestionDefinition, Boolean> _function_6 = (QuestionDefinition qd) -> {
          boolean _isEmpty = QuestionDefinitionAspect.dependencies(qd).isEmpty();
          return Boolean.valueOf((!_isEmpty));
        };
        final Function1<QuestionDefinition, String> _function_7 = (QuestionDefinition qd) -> {
          String _name = qd.getName();
          String _plus_1 = (_name + " -> (");
          final Function1<QuestionDefinition, String> _function_8 = (QuestionDefinition qddep) -> {
            return qddep.getName();
          };
          String _join_1 = IterableExtensions.join(IterableExtensions.<QuestionDefinition, String>map(QuestionDefinitionAspect.dependencies(qd), _function_8), ", ");
          String _plus_2 = (_plus_1 + _join_1);
          return (_plus_2 + ")");
        };
        String _join_1 = IterableExtensions.join(IterableExtensions.<QuestionDefinition, String>map(IterableExtensions.<QuestionDefinition>filter(allComputedQuestions, _function_6), _function_7), ",   \n");
        String _plus_1 = ("Questions involved in cycle(s) are:\n" + _join_1);
        EObjectAspect.error(_self, _plus_1);
        throw new QLException("No Topological order can be found");
      } else {
        return resList;
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
