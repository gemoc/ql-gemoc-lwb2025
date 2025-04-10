package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.gemoc.ql.k3ql.k3dsa.NotImplementedException;
import org.gemoc.ql.k3ql.k3dsa.ecore.EObjectAspect;
import org.gemoc.ql.model.ql.BooleanValue;
import org.gemoc.ql.model.ql.DataType;
import org.gemoc.ql.model.ql.DecimalValue;
import org.gemoc.ql.model.ql.IntegerValue;
import org.gemoc.ql.model.ql.Value;

@Aspect(className = Value.class)
@SuppressWarnings("all")
public abstract class ValueAspect {
  public static Value evaluate(final Value _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.ValueAspectValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.ValueAspectValueAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#Value evaluate() from org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspect
    		if (_self instanceof org.gemoc.ql.model.ql.DecimalValue){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspect.evaluate((org.gemoc.ql.model.ql.DecimalValue)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#Value evaluate() from org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#Value evaluate() from org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueAspect
    		if (_self instanceof org.gemoc.ql.model.ql.BooleanValue){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueAspect.evaluate((org.gemoc.ql.model.ql.BooleanValue)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#Value evaluate() from org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#Value evaluate() from org.gemoc.ql.k3ql.k3dsa.ql.StringValueAspect
    		if (_self instanceof org.gemoc.ql.model.ql.StringValue){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.StringValueAspect.evaluate((org.gemoc.ql.model.ql.StringValue)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#Value evaluate() from org.gemoc.ql.k3ql.k3dsa.ql.StringValueAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#Value evaluate() from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect
    		if (_self instanceof org.gemoc.ql.model.ql.IntegerValue){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect.evaluate((org.gemoc.ql.model.ql.IntegerValue)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#Value evaluate() from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect
    // #DispatchPointCut_before# Value evaluate()
    if (_self instanceof org.gemoc.ql.model.ql.Value){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect._privk3_evaluate(_self_, (org.gemoc.ql.model.ql.Value)_self);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  public static Value copy(final Value _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.ValueAspectValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.ValueAspectValueAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#Value copy() from org.gemoc.ql.k3ql.k3dsa.ql.StringValueAspect
    		if (_self instanceof org.gemoc.ql.model.ql.StringValue){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.StringValueAspect.copy((org.gemoc.ql.model.ql.StringValue)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#Value copy() from org.gemoc.ql.k3ql.k3dsa.ql.StringValueAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#Value copy() from org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspect
    		if (_self instanceof org.gemoc.ql.model.ql.DecimalValue){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspect.copy((org.gemoc.ql.model.ql.DecimalValue)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#Value copy() from org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#Value copy() from org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueAspect
    		if (_self instanceof org.gemoc.ql.model.ql.BooleanValue){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueAspect.copy((org.gemoc.ql.model.ql.BooleanValue)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#Value copy() from org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#Value copy() from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect
    		if (_self instanceof org.gemoc.ql.model.ql.IntegerValue){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect.copy((org.gemoc.ql.model.ql.IntegerValue)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#Value copy() from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect
    // #DispatchPointCut_before# Value copy()
    if (_self instanceof org.gemoc.ql.model.ql.Value){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect._privk3_copy(_self_, (org.gemoc.ql.model.ql.Value)_self);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  public static BooleanValue bEquals(final Value _self, final Value rhs) {
    final org.gemoc.ql.k3ql.k3dsa.ql.ValueAspectValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.ValueAspectValueAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#BooleanValue bEquals(Value) from org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspect
    		if (_self instanceof org.gemoc.ql.model.ql.DecimalValue){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspect.bEquals((org.gemoc.ql.model.ql.DecimalValue)_self,rhs);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#BooleanValue bEquals(Value) from org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#BooleanValue bEquals(Value) from org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueAspect
    		if (_self instanceof org.gemoc.ql.model.ql.BooleanValue){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueAspect.bEquals((org.gemoc.ql.model.ql.BooleanValue)_self,rhs);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#BooleanValue bEquals(Value) from org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#BooleanValue bEquals(Value) from org.gemoc.ql.k3ql.k3dsa.ql.StringValueAspect
    		if (_self instanceof org.gemoc.ql.model.ql.StringValue){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.StringValueAspect.bEquals((org.gemoc.ql.model.ql.StringValue)_self,rhs);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#BooleanValue bEquals(Value) from org.gemoc.ql.k3ql.k3dsa.ql.StringValueAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#BooleanValue bEquals(Value) from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect
    		if (_self instanceof org.gemoc.ql.model.ql.IntegerValue){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect.bEquals((org.gemoc.ql.model.ql.IntegerValue)_self,rhs);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#BooleanValue bEquals(Value) from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect
    // #DispatchPointCut_before# BooleanValue bEquals(Value)
    if (_self instanceof org.gemoc.ql.model.ql.Value){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect._privk3_bEquals(_self_, (org.gemoc.ql.model.ql.Value)_self,rhs);
    };
    return (org.gemoc.ql.model.ql.BooleanValue)result;
  }

  public static Value plus(final Value _self, final Value rhs) {
    final org.gemoc.ql.k3ql.k3dsa.ql.ValueAspectValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.ValueAspectValueAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#Value plus(Value) from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect
    		if (_self instanceof org.gemoc.ql.model.ql.IntegerValue){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect.plus((org.gemoc.ql.model.ql.IntegerValue)_self,rhs);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#Value plus(Value) from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect
    // #DispatchPointCut_before# Value plus(Value)
    if (_self instanceof org.gemoc.ql.model.ql.Value){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect._privk3_plus(_self_, (org.gemoc.ql.model.ql.Value)_self,rhs);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  public static Value minus(final Value _self, final Value rhs) {
    final org.gemoc.ql.k3ql.k3dsa.ql.ValueAspectValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.ValueAspectValueAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#Value minus(Value) from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect
    		if (_self instanceof org.gemoc.ql.model.ql.IntegerValue){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect.minus((org.gemoc.ql.model.ql.IntegerValue)_self,rhs);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#Value minus(Value) from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect
    // #DispatchPointCut_before# Value minus(Value)
    if (_self instanceof org.gemoc.ql.model.ql.Value){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect._privk3_minus(_self_, (org.gemoc.ql.model.ql.Value)_self,rhs);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  public static Value mult(final Value _self, final Value rhs) {
    final org.gemoc.ql.k3ql.k3dsa.ql.ValueAspectValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.ValueAspectValueAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#Value mult(Value) from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect
    		if (_self instanceof org.gemoc.ql.model.ql.IntegerValue){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect.mult((org.gemoc.ql.model.ql.IntegerValue)_self,rhs);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#Value mult(Value) from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect
    // #DispatchPointCut_before# Value mult(Value)
    if (_self instanceof org.gemoc.ql.model.ql.Value){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect._privk3_mult(_self_, (org.gemoc.ql.model.ql.Value)_self,rhs);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  public static Value div(final Value _self, final Value rhs) {
    final org.gemoc.ql.k3ql.k3dsa.ql.ValueAspectValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.ValueAspectValueAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#Value div(Value) from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect
    		if (_self instanceof org.gemoc.ql.model.ql.IntegerValue){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect.div((org.gemoc.ql.model.ql.IntegerValue)_self,rhs);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#Value div(Value) from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect
    // #DispatchPointCut_before# Value div(Value)
    if (_self instanceof org.gemoc.ql.model.ql.Value){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect._privk3_div(_self_, (org.gemoc.ql.model.ql.Value)_self,rhs);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  public static BooleanValue greater(final Value _self, final Value rhs) {
    final org.gemoc.ql.k3ql.k3dsa.ql.ValueAspectValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.ValueAspectValueAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#BooleanValue greater(Value) from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect
    		if (_self instanceof org.gemoc.ql.model.ql.IntegerValue){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect.greater((org.gemoc.ql.model.ql.IntegerValue)_self,rhs);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#BooleanValue greater(Value) from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect
    // #DispatchPointCut_before# BooleanValue greater(Value)
    if (_self instanceof org.gemoc.ql.model.ql.Value){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect._privk3_greater(_self_, (org.gemoc.ql.model.ql.Value)_self,rhs);
    };
    return (org.gemoc.ql.model.ql.BooleanValue)result;
  }

  public static BooleanValue lower(final Value _self, final Value rhs) {
    final org.gemoc.ql.k3ql.k3dsa.ql.ValueAspectValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.ValueAspectValueAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#BooleanValue lower(Value) from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect
    		if (_self instanceof org.gemoc.ql.model.ql.IntegerValue){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect.lower((org.gemoc.ql.model.ql.IntegerValue)_self,rhs);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#BooleanValue lower(Value) from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect
    // #DispatchPointCut_before# BooleanValue lower(Value)
    if (_self instanceof org.gemoc.ql.model.ql.Value){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect._privk3_lower(_self_, (org.gemoc.ql.model.ql.Value)_self,rhs);
    };
    return (org.gemoc.ql.model.ql.BooleanValue)result;
  }

  public static BooleanValue greaterOrEquals(final Value _self, final Value rhs) {
    final org.gemoc.ql.k3ql.k3dsa.ql.ValueAspectValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.ValueAspectValueAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#BooleanValue greaterOrEquals(Value) from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect
    		if (_self instanceof org.gemoc.ql.model.ql.IntegerValue){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect.greaterOrEquals((org.gemoc.ql.model.ql.IntegerValue)_self,rhs);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#BooleanValue greaterOrEquals(Value) from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect
    // #DispatchPointCut_before# BooleanValue greaterOrEquals(Value)
    if (_self instanceof org.gemoc.ql.model.ql.Value){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect._privk3_greaterOrEquals(_self_, (org.gemoc.ql.model.ql.Value)_self,rhs);
    };
    return (org.gemoc.ql.model.ql.BooleanValue)result;
  }

  public static BooleanValue lowerOrEquals(final Value _self, final Value rhs) {
    final org.gemoc.ql.k3ql.k3dsa.ql.ValueAspectValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.ValueAspectValueAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#BooleanValue lowerOrEquals(Value) from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect
    		if (_self instanceof org.gemoc.ql.model.ql.IntegerValue){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect.lowerOrEquals((org.gemoc.ql.model.ql.IntegerValue)_self,rhs);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#BooleanValue lowerOrEquals(Value) from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect
    // #DispatchPointCut_before# BooleanValue lowerOrEquals(Value)
    if (_self instanceof org.gemoc.ql.model.ql.Value){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect._privk3_lowerOrEquals(_self_, (org.gemoc.ql.model.ql.Value)_self,rhs);
    };
    return (org.gemoc.ql.model.ql.BooleanValue)result;
  }

  public static Value uminus(final Value _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.ValueAspectValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.ValueAspectValueAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#Value uminus() from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect
    		if (_self instanceof org.gemoc.ql.model.ql.IntegerValue){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect.uminus((org.gemoc.ql.model.ql.IntegerValue)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#Value uminus() from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect
    // #DispatchPointCut_before# Value uminus()
    if (_self instanceof org.gemoc.ql.model.ql.Value){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect._privk3_uminus(_self_, (org.gemoc.ql.model.ql.Value)_self);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  public static DecimalValue toDecimalValue(final Value _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.ValueAspectValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.ValueAspectValueAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#DecimalValue toDecimalValue() from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect
    		if (_self instanceof org.gemoc.ql.model.ql.IntegerValue){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect.toDecimalValue((org.gemoc.ql.model.ql.IntegerValue)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#DecimalValue toDecimalValue() from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect
    // #DispatchPointCut_before# DecimalValue toDecimalValue()
    if (_self instanceof org.gemoc.ql.model.ql.Value){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect._privk3_toDecimalValue(_self_, (org.gemoc.ql.model.ql.Value)_self);
    };
    return (org.gemoc.ql.model.ql.DecimalValue)result;
  }

  public static IntegerValue toIntegerValue(final Value _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.ValueAspectValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.ValueAspectValueAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#IntegerValue toIntegerValue() from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect
    		if (_self instanceof org.gemoc.ql.model.ql.IntegerValue){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect.toIntegerValue((org.gemoc.ql.model.ql.IntegerValue)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#IntegerValue toIntegerValue() from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect
    // #DispatchPointCut_before# IntegerValue toIntegerValue()
    if (_self instanceof org.gemoc.ql.model.ql.Value){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect._privk3_toIntegerValue(_self_, (org.gemoc.ql.model.ql.Value)_self);
    };
    return (org.gemoc.ql.model.ql.IntegerValue)result;
  }

  public static Boolean isKindOf(final Value _self, final DataType type) {
    final org.gemoc.ql.k3ql.k3dsa.ql.ValueAspectValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.ValueAspectValueAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#Boolean isKindOf(DataType) from org.gemoc.ql.k3ql.k3dsa.ql.StringValueAspect
    		if (_self instanceof org.gemoc.ql.model.ql.StringValue){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.StringValueAspect.isKindOf((org.gemoc.ql.model.ql.StringValue)_self,type);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#Boolean isKindOf(DataType) from org.gemoc.ql.k3ql.k3dsa.ql.StringValueAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#Boolean isKindOf(DataType) from org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspect
    		if (_self instanceof org.gemoc.ql.model.ql.DecimalValue){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspect.isKindOf((org.gemoc.ql.model.ql.DecimalValue)_self,type);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#Boolean isKindOf(DataType) from org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#Boolean isKindOf(DataType) from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect
    		if (_self instanceof org.gemoc.ql.model.ql.IntegerValue){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect.isKindOf((org.gemoc.ql.model.ql.IntegerValue)_self,type);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#Boolean isKindOf(DataType) from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#Boolean isKindOf(DataType) from org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueAspect
    		if (_self instanceof org.gemoc.ql.model.ql.BooleanValue){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueAspect.isKindOf((org.gemoc.ql.model.ql.BooleanValue)_self,type);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#Boolean isKindOf(DataType) from org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueAspect
    // #DispatchPointCut_before# Boolean isKindOf(DataType)
    if (_self instanceof org.gemoc.ql.model.ql.Value){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect._privk3_isKindOf(_self_, (org.gemoc.ql.model.ql.Value)_self,type);
    };
    return (java.lang.Boolean)result;
  }

  /**
   * a human readable version of the value
   */
  public static String valueToString(final Value _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.ValueAspectValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.ValueAspectValueAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#String valueToString() from org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspect
    		if (_self instanceof org.gemoc.ql.model.ql.DecimalValue){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspect.valueToString((org.gemoc.ql.model.ql.DecimalValue)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#String valueToString() from org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#String valueToString() from org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueAspect
    		if (_self instanceof org.gemoc.ql.model.ql.BooleanValue){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueAspect.valueToString((org.gemoc.ql.model.ql.BooleanValue)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#String valueToString() from org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#String valueToString() from org.gemoc.ql.k3ql.k3dsa.ql.StringValueAspect
    		if (_self instanceof org.gemoc.ql.model.ql.StringValue){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.StringValueAspect.valueToString((org.gemoc.ql.model.ql.StringValue)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#String valueToString() from org.gemoc.ql.k3ql.k3dsa.ql.StringValueAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#String valueToString() from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect
    		if (_self instanceof org.gemoc.ql.model.ql.IntegerValue){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect.valueToString((org.gemoc.ql.model.ql.IntegerValue)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#String valueToString() from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect
    // #DispatchPointCut_before# String valueToString()
    if (_self instanceof org.gemoc.ql.model.ql.Value){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect._privk3_valueToString(_self_, (org.gemoc.ql.model.ql.Value)_self);
    };
    return (java.lang.String)result;
  }

  public static Object rawValue(final Value _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.ValueAspectValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.ValueAspectValueAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#Object rawValue() from org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueAspect
    		if (_self instanceof org.gemoc.ql.model.ql.BooleanValue){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueAspect.rawValue((org.gemoc.ql.model.ql.BooleanValue)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#Object rawValue() from org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#Object rawValue() from org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspect
    		if (_self instanceof org.gemoc.ql.model.ql.DecimalValue){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspect.rawValue((org.gemoc.ql.model.ql.DecimalValue)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#Object rawValue() from org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#Object rawValue() from org.gemoc.ql.k3ql.k3dsa.ql.StringValueAspect
    		if (_self instanceof org.gemoc.ql.model.ql.StringValue){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.StringValueAspect.rawValue((org.gemoc.ql.model.ql.StringValue)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#Object rawValue() from org.gemoc.ql.k3ql.k3dsa.ql.StringValueAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#Object rawValue() from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect
    		if (_self instanceof org.gemoc.ql.model.ql.IntegerValue){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect.rawValue((org.gemoc.ql.model.ql.IntegerValue)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect#Object rawValue() from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect
    // #DispatchPointCut_before# Object rawValue()
    if (_self instanceof org.gemoc.ql.model.ql.Value){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect._privk3_rawValue(_self_, (org.gemoc.ql.model.ql.Value)_self);
    };
    return (java.lang.Object)result;
  }

  protected static Value _privk3_evaluate(final ValueAspectValueAspectProperties _self_, final Value _self) {
    try {
      EObjectAspect.devError(_self, ("not implemented, please ask language designer to implement evaluate() for " + _self));
      throw new NotImplementedException(("not implemented, please implement evaluate() for " + _self));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  protected static Value _privk3_copy(final ValueAspectValueAspectProperties _self_, final Value _self) {
    try {
      EObjectAspect.devError(_self, ("not implemented, please ask language designer to implement copy() for " + _self));
      throw new NotImplementedException(("not implemented, please implement copy() for " + _self));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  protected static BooleanValue _privk3_bEquals(final ValueAspectValueAspectProperties _self_, final Value _self, final Value rhs) {
    try {
      EObjectAspect.devError(_self, ("not implemented, please ask language designer to implement equals() for " + _self));
      throw new NotImplementedException(("not implemented, please implement equals() for " + _self));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  protected static Value _privk3_plus(final ValueAspectValueAspectProperties _self_, final Value _self, final Value rhs) {
    try {
      EObjectAspect.devError(_self, ("not implemented, please ask language designer to implement plus() for " + _self));
      throw new NotImplementedException(("not implemented, please implement plus() for " + _self));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  protected static Value _privk3_minus(final ValueAspectValueAspectProperties _self_, final Value _self, final Value rhs) {
    try {
      EObjectAspect.devError(_self, ("not implemented, please ask language designer to implement minus() for " + _self));
      throw new NotImplementedException(("not implemented, please implement minus() for " + _self));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  protected static Value _privk3_mult(final ValueAspectValueAspectProperties _self_, final Value _self, final Value rhs) {
    try {
      EObjectAspect.devError(_self, ("not implemented, please ask language designer to implement mult() for " + _self));
      throw new NotImplementedException(("not implemented, please implement mult() for " + _self));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  protected static Value _privk3_div(final ValueAspectValueAspectProperties _self_, final Value _self, final Value rhs) {
    try {
      EObjectAspect.devError(_self, ("not implemented, please ask language designer to implement div() for " + _self));
      throw new NotImplementedException(("not implemented, please implement div() for " + _self));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  protected static BooleanValue _privk3_greater(final ValueAspectValueAspectProperties _self_, final Value _self, final Value rhs) {
    try {
      EObjectAspect.devError(_self, ("not implemented, please ask language designer to implement greater() for " + _self));
      throw new NotImplementedException(("not implemented, please implement greater() for " + _self));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  protected static BooleanValue _privk3_lower(final ValueAspectValueAspectProperties _self_, final Value _self, final Value rhs) {
    try {
      EObjectAspect.devError(_self, ("not implemented, please ask language designer to implement lower() for " + _self));
      throw new NotImplementedException(("not implemented, please implement lower() for " + _self));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  protected static BooleanValue _privk3_greaterOrEquals(final ValueAspectValueAspectProperties _self_, final Value _self, final Value rhs) {
    try {
      EObjectAspect.devError(_self, ("not implemented, please ask language designer to implement greaterOrEquals() for " + _self));
      throw new NotImplementedException(("not implemented, please implement greaterOrEquals() for " + _self));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  protected static BooleanValue _privk3_lowerOrEquals(final ValueAspectValueAspectProperties _self_, final Value _self, final Value rhs) {
    try {
      EObjectAspect.devError(_self, ("not implemented, please ask language designer to implement lowerOrEquals(() for " + _self));
      throw new NotImplementedException(("not implemented, please implement lowerOrEquals(() for " + _self));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  protected static Value _privk3_uminus(final ValueAspectValueAspectProperties _self_, final Value _self) {
    try {
      EObjectAspect.devError(_self, ("not implemented, please ask language designer to implement uminus() for " + _self));
      throw new NotImplementedException(("not implemented, please implement uminus() for " + _self));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  protected static DecimalValue _privk3_toDecimalValue(final ValueAspectValueAspectProperties _self_, final Value _self) {
    try {
      EObjectAspect.devError(_self, ("not implemented, please ask language designer to implement toDecimalValue() for " + _self));
      throw new NotImplementedException(("not implemented, please implement toDecimalValue() for " + _self));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  protected static IntegerValue _privk3_toIntegerValue(final ValueAspectValueAspectProperties _self_, final Value _self) {
    try {
      EObjectAspect.devError(_self, ("not implemented, please ask language designer to implement toIntegerValue() for " + _self));
      throw new NotImplementedException(("not implemented, please implement toIntegerValue() for " + _self));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  protected static Boolean _privk3_isKindOf(final ValueAspectValueAspectProperties _self_, final Value _self, final DataType type) {
    try {
      EObjectAspect.devError(_self, ("not implemented, please ask language designer to implement isKindOf() for " + _self));
      throw new NotImplementedException(("not implemented, please implement isKindOf() for " + _self));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  protected static String _privk3_valueToString(final ValueAspectValueAspectProperties _self_, final Value _self) {
    try {
      EObjectAspect.devError(_self, ("not implemented, please ask language designer to implement valueToString() for " + _self));
      throw new NotImplementedException(("not implemented, please implement valueToString() for " + _self));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  protected static Object _privk3_rawValue(final ValueAspectValueAspectProperties _self_, final Value _self) {
    try {
      EObjectAspect.devError(_self, ("not implemented, please ask language designer to implement rawValue() for " + _self));
      throw new NotImplementedException(("not implemented, please implement rawValue() for " + _self));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
