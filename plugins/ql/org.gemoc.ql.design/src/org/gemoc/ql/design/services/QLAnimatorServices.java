package org.gemoc.ql.design.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gemoc.executionframework.extensions.sirius.services.AbstractGemocAnimatorServices;
import org.eclipse.gemoc.executionframework.extensions.sirius.services.AbstractGemocDebuggerServices;
import org.gemoc.ql.model.ql.Value;

public class QLAnimatorServices extends AbstractGemocAnimatorServices {

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {
		// Add in res the list of layers that should be activated and refreshed while debugging the model
		//	in case of a single odesign with all layers in a single viewpoint:
        //		- the first String is the id of the Diagram Description
        //		- the second String is the id of the Layer
		//  
		//	in case of a diagram extension:
		//		- the first String is the Representation Name of the Diagram Extension (do not confuse with the Name !!)
		//		- the second String is the id of the Layer
		final List<StringCouple> res = new ArrayList<StringCouple>();
	
		res.add(new StringCouple("QLDiagram", "Animation"));

		return res;
	}
	
	public String valueToString(Value v) {
		return org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect.valueToString(v);
	}
		

}
