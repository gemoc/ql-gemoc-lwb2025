package org.gemoc.ql.k3ql.k3dsa.qls

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step
import org.eclipse.emf.common.util.EList
import org.gemoc.qls.model.qls.QLSModel

import static extension org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspect.*

@Aspect(className=QLSModel)
class QLSModelAspect {
	@Step 												
	@InitializeModel									
	def void initializeModel(EList<String> input){
		// forward entry point to styled QLModel 
		_self.styledQLModel.initializeModel(input)
	}
	
	@Step
	@Main
	def void main() {
		// forward entry point to styled QLModel 
		_self.styledQLModel.main()
	}
}
