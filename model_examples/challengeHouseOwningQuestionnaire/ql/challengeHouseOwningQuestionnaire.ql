QLModel {
	definitions {
		booleanType boolean
		decimalType money { unit "Euro" }	
	} 
	definitions {
		question hasSoldHouse: "Did you sell a house in 2010?"  boolean 
		question hasBoughtHouse: "Did you buy a house in 2010?" boolean
		question hasMaintLoan: "Did you enter a loan for maintenance/reconstruction?"  boolean
		mandatory question sellingPrice: "Price the house was sold for:"  money
		mandatory question privateDebt: "Private debts for the sold house:"  money
		question valueResidue: "Value residue:"  money = BasicBinaryExpression { operator MINUS resultType money lhsOperand QuestionCall { question sellingPrice } rhsOperand QuestionCall { question privateDebt } }; 		
		
	}
	
	Form " Box1HouseOwning" {
		{
			hasSoldHouse
			hasBoughtHouse
			hasMaintLoan
		}
		if (QuestionCall { question hasSoldHouse }) {
			sellingPrice
			privateDebt 
			valueResidue 
		}			 
	}
}
