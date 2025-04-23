package org.gemoc.ql.k3ql.k3dsa.ql;

import com.google.common.collect.Iterators;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.gemoc.ql.model.ql.Expression;
import org.gemoc.ql.model.ql.QuestionCall;
import org.gemoc.ql.model.ql.QuestionDefinition;

@Aspect(className = QuestionDefinition.class)
@SuppressWarnings("all")
public class QuestionDefinitionAspect extends NamedElementAspect {
  /**
   * this step is captured by the EngineAddons to concretely update the currentValue from the value in the UI form
   */
  @Step
  public static void updateCurrentValueFromUI(final QuestionDefinition _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionAspectQuestionDefinitionAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionAspectQuestionDefinitionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void updateCurrentValueFromUI()
    if (_self instanceof org.gemoc.ql.model.ql.QuestionDefinition){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionAspect._privk3_updateCurrentValueFromUI(_self_, (org.gemoc.ql.model.ql.QuestionDefinition)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {}, command, "QuestionDefinition", "updateCurrentValueFromUI");
    	} else {
    		command.execute();
    	}
    	;
    };
  }

  /**
   * evaluation in order to fill the dependencies and referencingQuestions lists
   * consider only computedQuestions in the dependency graph
   */
  public static void evaluateComputedQuestionDependencies(final QuestionDefinition _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionAspectQuestionDefinitionAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionAspectQuestionDefinitionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void evaluateComputedQuestionDependencies()
    if (_self instanceof org.gemoc.ql.model.ql.QuestionDefinition){
    	org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionAspect._privk3_evaluateComputedQuestionDependencies(_self_, (org.gemoc.ql.model.ql.QuestionDefinition)_self);
    };
  }

  public static Set<QuestionDefinition> dependencies(final QuestionDefinition _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionAspectQuestionDefinitionAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionAspectQuestionDefinitionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Set<QuestionDefinition> dependencies()
    if (_self instanceof org.gemoc.ql.model.ql.QuestionDefinition){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionAspect._privk3_dependencies(_self_, (org.gemoc.ql.model.ql.QuestionDefinition)_self);
    };
    return (java.util.Set<org.gemoc.ql.model.ql.QuestionDefinition>)result;
  }

  public static void dependencies(final QuestionDefinition _self, final Set<QuestionDefinition> dependencies) {
    final org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionAspectQuestionDefinitionAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionAspectQuestionDefinitionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void dependencies(Set<QuestionDefinition>)
    if (_self instanceof org.gemoc.ql.model.ql.QuestionDefinition){
    	org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionAspect._privk3_dependencies(_self_, (org.gemoc.ql.model.ql.QuestionDefinition)_self,dependencies);
    };
  }

  public static Set<QuestionDefinition> referencingQuestions(final QuestionDefinition _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionAspectQuestionDefinitionAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionAspectQuestionDefinitionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Set<QuestionDefinition> referencingQuestions()
    if (_self instanceof org.gemoc.ql.model.ql.QuestionDefinition){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionAspect._privk3_referencingQuestions(_self_, (org.gemoc.ql.model.ql.QuestionDefinition)_self);
    };
    return (java.util.Set<org.gemoc.ql.model.ql.QuestionDefinition>)result;
  }

  public static void referencingQuestions(final QuestionDefinition _self, final Set<QuestionDefinition> referencingQuestions) {
    final org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionAspectQuestionDefinitionAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionAspectQuestionDefinitionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void referencingQuestions(Set<QuestionDefinition>)
    if (_self instanceof org.gemoc.ql.model.ql.QuestionDefinition){
    	org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionAspect._privk3_referencingQuestions(_self_, (org.gemoc.ql.model.ql.QuestionDefinition)_self,referencingQuestions);
    };
  }

  protected static void _privk3_updateCurrentValueFromUI(final QuestionDefinitionAspectQuestionDefinitionAspectProperties _self_, final QuestionDefinition _self) {
  }

  protected static void _privk3_evaluateComputedQuestionDependencies(final QuestionDefinitionAspectQuestionDefinitionAspectProperties _self_, final QuestionDefinition _self) {
    Expression _computedExpression = _self.getComputedExpression();
    boolean _tripleNotEquals = (_computedExpression != null);
    if (_tripleNotEquals) {
      final Function1<QuestionCall, Boolean> _function = (QuestionCall qc) -> {
        Expression _computedExpression_1 = qc.getQuestion().getComputedExpression();
        return Boolean.valueOf((_computedExpression_1 != null));
      };
      final Function1<QuestionCall, QuestionDefinition> _function_1 = (QuestionCall qc) -> {
        return qc.getQuestion();
      };
      QuestionDefinitionAspect.dependencies(_self).addAll(
        IteratorExtensions.<QuestionDefinition>toList(IteratorExtensions.<QuestionCall, QuestionDefinition>map(IteratorExtensions.<QuestionCall>filter(Iterators.<QuestionCall>filter(_self.getComputedExpression().eAllContents(), QuestionCall.class), _function), _function_1)));
      final Consumer<QuestionDefinition> _function_2 = (QuestionDefinition qd) -> {
        QuestionDefinitionAspect.referencingQuestions(qd).add(_self);
      };
      QuestionDefinitionAspect.dependencies(_self).forEach(_function_2);
    }
  }

  protected static Set<QuestionDefinition> _privk3_dependencies(final QuestionDefinitionAspectQuestionDefinitionAspectProperties _self_, final QuestionDefinition _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getDependencies") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.util.Set) ret;
    				} else {
    						return null;
    					}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.dependencies;
  }

  protected static void _privk3_dependencies(final QuestionDefinitionAspectQuestionDefinitionAspectProperties _self_, final QuestionDefinition _self, final Set<QuestionDefinition> dependencies) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setDependencies")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, dependencies);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.dependencies = dependencies;
    }
  }

  protected static Set<QuestionDefinition> _privk3_referencingQuestions(final QuestionDefinitionAspectQuestionDefinitionAspectProperties _self_, final QuestionDefinition _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getReferencingQuestions") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.util.Set) ret;
    				} else {
    						return null;
    					}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.referencingQuestions;
  }

  protected static void _privk3_referencingQuestions(final QuestionDefinitionAspectQuestionDefinitionAspectProperties _self_, final QuestionDefinition _self, final Set<QuestionDefinition> referencingQuestions) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setReferencingQuestions")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, referencingQuestions);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.referencingQuestions = referencingQuestions;
    }
  }
}
