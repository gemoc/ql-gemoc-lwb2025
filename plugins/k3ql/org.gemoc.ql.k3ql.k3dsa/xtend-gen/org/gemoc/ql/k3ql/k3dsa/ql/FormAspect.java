package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.ql.model.ql.Form;

@Aspect(className = Form.class)
@SuppressWarnings("all")
public class FormAspect extends NamedElementAspect {
  public static void render(final Form _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.FormAspectFormAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.FormAspectFormAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void render()
    if (_self instanceof org.gemoc.ql.model.ql.Form){
    	org.gemoc.ql.k3ql.k3dsa.ql.FormAspect._privk3_render(_self_, (org.gemoc.ql.model.ql.Form)_self);
    };
  }

  protected static void _privk3_render(final FormAspectFormAspectProperties _self_, final Form _self) {
    QuestionGroupAspect.render(_self.getQuestionGroup());
  }
}
