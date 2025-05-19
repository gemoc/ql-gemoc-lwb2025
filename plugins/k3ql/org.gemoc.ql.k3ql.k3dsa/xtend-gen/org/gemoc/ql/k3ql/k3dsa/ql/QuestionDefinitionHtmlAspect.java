package org.gemoc.ql.k3ql.k3dsa.ql;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.gemoc.ql.model.ql.Expression;
import org.gemoc.ql.model.ql.QuestionDefinition;
import org.gemoc.ql.model.ql.Value;
import org.gemoc.ql.model.ql.ValueType;
import org.gemoc.qls.model.qls.QLSModel;
import org.gemoc.qls.model.qls.QlsFactory;
import org.gemoc.qls.model.qls.QuestionStyle;

@Aspect(className = QuestionDefinition.class)
@SuppressWarnings("all")
public class QuestionDefinitionHtmlAspect extends NamedElementAspect {
  public static String htmlField(final QuestionDefinition _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionHtmlAspectQuestionDefinitionAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionHtmlAspectQuestionDefinitionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String htmlField()
    if (_self instanceof org.gemoc.ql.model.ql.QuestionDefinition){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionHtmlAspect._privk3_htmlField(_self_, (org.gemoc.ql.model.ql.QuestionDefinition)_self);
    };
    return (java.lang.String)result;
  }

  public static String htmlStyledField(final QuestionDefinition _self, final QLSModel qlsModel) {
    final org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionHtmlAspectQuestionDefinitionAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionHtmlAspectQuestionDefinitionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String htmlStyledField(QLSModel)
    if (_self instanceof org.gemoc.ql.model.ql.QuestionDefinition){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionHtmlAspect._privk3_htmlStyledField(_self_, (org.gemoc.ql.model.ql.QuestionDefinition)_self,qlsModel);
    };
    return (java.lang.String)result;
  }

  private static QuestionStyle appliedStyle(final QuestionDefinition _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionHtmlAspectQuestionDefinitionAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionHtmlAspectQuestionDefinitionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# QuestionStyle appliedStyle()
    if (_self instanceof org.gemoc.ql.model.ql.QuestionDefinition){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionHtmlAspect._privk3_appliedStyle(_self_, (org.gemoc.ql.model.ql.QuestionDefinition)_self);
    };
    return (org.gemoc.qls.model.qls.QuestionStyle)result;
  }

  private static void appliedStyle(final QuestionDefinition _self, final QuestionStyle appliedStyle) {
    final org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionHtmlAspectQuestionDefinitionAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionHtmlAspectQuestionDefinitionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void appliedStyle(QuestionStyle)
    if (_self instanceof org.gemoc.ql.model.ql.QuestionDefinition){
    	org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionHtmlAspect._privk3_appliedStyle(_self_, (org.gemoc.ql.model.ql.QuestionDefinition)_self,appliedStyle);
    };
  }

  protected static String _privk3_htmlField(final QuestionDefinitionHtmlAspectQuestionDefinitionAspectProperties _self_, final QuestionDefinition _self) {
    QuestionStyle _appliedStyle = QuestionDefinitionHtmlAspect.appliedStyle(_self);
    boolean _tripleEquals = (_appliedStyle == null);
    if (_tripleEquals) {
      QuestionDefinitionHtmlAspect.appliedStyle(_self, QlsFactory.eINSTANCE.createQuestionStyle());
      QuestionStyle _appliedStyle_1 = QuestionDefinitionHtmlAspect.appliedStyle(_self);
      _appliedStyle_1.setLabelStyle(QlsFactory.eINSTANCE.createLabelStyle());
      QuestionStyle _appliedStyle_2 = QuestionDefinitionHtmlAspect.appliedStyle(_self);
      _appliedStyle_2.setTypeStyle(ValueTypeHtmlAspect.createDefaultTypeStyle(_self.getDataType()));
    }
    ValueType _dataType = _self.getDataType();
    String _name = _self.getName();
    String _label = _self.getLabel();
    Value _currentValue = _self.getCurrentValue();
    QuestionStyle _appliedStyle_3 = QuestionDefinitionHtmlAspect.appliedStyle(_self);
    Expression _computedExpression = _self.getComputedExpression();
    boolean _tripleNotEquals = (_computedExpression != null);
    return ValueTypeHtmlAspect.htmlField(_dataType, _name, _label, _currentValue, _appliedStyle_3, _tripleNotEquals);
  }

  protected static String _privk3_htmlStyledField(final QuestionDefinitionHtmlAspectQuestionDefinitionAspectProperties _self_, final QuestionDefinition _self, final QLSModel qlsModel) {
    QuestionStyle _appliedStyle = QuestionDefinitionHtmlAspect.appliedStyle(_self);
    boolean _tripleEquals = (_appliedStyle == null);
    if (_tripleEquals) {
      final Function1<QuestionStyle, Boolean> _function = (QuestionStyle qs) -> {
        QuestionDefinition _styledQuestion = qs.getStyledQuestion();
        return Boolean.valueOf(Objects.equal(_styledQuestion, _self));
      };
      final QuestionStyle userDefinedStyle = IteratorExtensions.<QuestionStyle>findFirst(Iterators.<QuestionStyle>filter(qlsModel.eAllContents(), QuestionStyle.class), _function);
      if ((userDefinedStyle != null)) {
        QuestionDefinitionHtmlAspect.appliedStyle(_self, userDefinedStyle);
      } else {
        QuestionDefinitionHtmlAspect.appliedStyle(_self, QlsFactory.eINSTANCE.createQuestionStyle());
        QuestionStyle _appliedStyle_1 = QuestionDefinitionHtmlAspect.appliedStyle(_self);
        _appliedStyle_1.setLabelStyle(QlsFactory.eINSTANCE.createLabelStyle());
        QuestionStyle _appliedStyle_2 = QuestionDefinitionHtmlAspect.appliedStyle(_self);
        _appliedStyle_2.setTypeStyle(ValueTypeHtmlAspect.createDefaultTypeStyle(_self.getDataType()));
      }
    }
    ValueType _dataType = _self.getDataType();
    String _name = _self.getName();
    String _label = _self.getLabel();
    Value _currentValue = _self.getCurrentValue();
    QuestionStyle _appliedStyle_3 = QuestionDefinitionHtmlAspect.appliedStyle(_self);
    Expression _computedExpression = _self.getComputedExpression();
    boolean _tripleNotEquals = (_computedExpression != null);
    return ValueTypeHtmlAspect.htmlField(_dataType, _name, _label, _currentValue, _appliedStyle_3, _tripleNotEquals);
  }

  protected static QuestionStyle _privk3_appliedStyle(final QuestionDefinitionHtmlAspectQuestionDefinitionAspectProperties _self_, final QuestionDefinition _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getAppliedStyle") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.gemoc.qls.model.qls.QuestionStyle) ret;
    				} else {
    						return null;
    					}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.appliedStyle;
  }

  protected static void _privk3_appliedStyle(final QuestionDefinitionHtmlAspectQuestionDefinitionAspectProperties _self_, final QuestionDefinition _self, final QuestionStyle appliedStyle) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setAppliedStyle")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, appliedStyle);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.appliedStyle = appliedStyle;
    }
  }
}
