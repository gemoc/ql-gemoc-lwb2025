QLModel {
	definitions {
		booleanType boolean
		decimalType personHour {}
		decimalType euroPerHour { unit "€/hour"}
		decimalType money { unit "€" }
	}

	definitions {
		question estimatedPersonHourForDev : "Estimated person-hours required for development?" personHour
		question hourlyRateForDev : "What is the hourly rate for development (€/hour)?" euroPerHour
		question estimatedDevCost : "Estimated Development Cost:" money = (estimatedPersonHourForDev() * hourlyRateForDev()) ;
		
		question requireDesignAndUX : "Does this project require custom design and UI/UX work? (Yes/No)" boolean
		question estimatedPersonHourForDesignUX : "Estimated person-hours for design and UI/UX?" personHour
		question hourlyRateForDesignUX : "What is the hourly rate for design and UI/UX (€/hour)?" euroPerHour
		question estimatedDesignUXCost : "Estimated Design Cost:" money = (estimatedPersonHourForDesignUX() * hourlyRateForDesignUX()) ;
		question subtotalProjectCostDesignUX : "Subtotal Project Cost (with design):" money = (estimatedDevCost() + estimatedDesignUXCost()) ;
		
		question requireTestingAndQA :  "Will dedicated testing and QA be required for this project?" boolean
		question estimatedPersonHourForTestingAndQA: "Estimated person-hours for testing and QA ?" personHour
		question hourlyRateForTestingAndQ : "What is the hourly rate for testing and QA (€/hour)?" euroPerHour
		question estimatedTestingAndQACost : "Estimated Design Cost:" money = (estimatedPersonHourForTestingAndQA() * hourlyRateForTestingAndQ()) ;
		question subtotalProjectCostTesting1 : "Subtotal Project Cost (with testing):" money = (estimatedDevCost() + estimatedTestingAndQACost()) ;
		question subtotalProjectCostTesting2 : "Subtotal Project Cost (with design and testing):" money = (estimatedDevCost() + estimatedTestingAndQACost() + estimatedDesignUXCost()) ;
		
		question requireDeploymentAndMaintenance : "Will deployment and ongoing maintenance be part of this project scope?" boolean
		question estimatedDeploymentCost : "Estimated cost for deployment?" money
		question estimatedMaintenanceCost : "Estimated annual maintenance cost?" money
		question estimatedDeploymentAndMaintenanceCost : "Estimated Deployment & First Year Maintenance Cost:" money = (estimatedDeploymentCost() + estimatedMaintenanceCost());
		
		question minimalCost : "Minimum Project Cost (Development Only):" money = (estimatedDevCost());
		question totalProjectCost : "Total Project Cost (including Design & UX, Testing & QA, and  deployment & first year maintenance, if selected):"  money = (
			estimatedDevCost()  + 
			if requireDesignAndUX() then 	estimatedDesignUXCost() else 0.0 endif + 
			if requireTestingAndQA() then estimatedTestingAndQACost() else 0.0  endif +
			if requireDeploymentAndMaintenance() then estimatedDeploymentAndMaintenanceCost() else 0.0 endif
		)
		;
	}	
	
	Form ProjectBudgetEstimation {
		{ // Core Project Elements (Always Present)
			estimatedPersonHourForDev
			hourlyRateForDev
			estimatedDevCost
			requireDesignAndUX
			requireTestingAndQA
			requireDeploymentAndMaintenance
		}
		if (requireDesignAndUX()) { // Optional Design & UI/UX
			estimatedPersonHourForDesignUX
			hourlyRateForDesignUX
			estimatedDesignUXCost
			subtotalProjectCostDesignUX
		}
		if (requireTestingAndQA()) { // Optional Testing & Quality Assurance
			estimatedPersonHourForTestingAndQA
			hourlyRateForTestingAndQ
			estimatedTestingAndQACost
			if ( not requireDesignAndUX()) {
				subtotalProjectCostTesting1
			}
			if ( requireDesignAndUX()) {
				subtotalProjectCostTesting2
			}
		}
		if (requireDeploymentAndMaintenance()) { // Optional Deployment & Maintenance
			estimatedDeploymentCost
			estimatedMaintenanceCost
			estimatedDeploymentAndMaintenanceCost
		}
		{ // Results
			minimalCost
			totalProjectCost
		}
	}
}