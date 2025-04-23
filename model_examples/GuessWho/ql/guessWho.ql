QLModel {
	definitions {
		booleanType boolean
		enumerationType yesNo  { literals {Unknown, Yes , No} }
		enumerationType gender { literals {Unknown, Male , Female} }
		enumerationType hairColor { literals {Unknown, Brown, Blonde, Black, Red, Grey} }
		enumerationType facialHair { literals {Unknown, Beard, Mustache, None}}
		enumerationType glasses { literals {Unknown, Yes, No}}
		enumerationType hat { literals {Unknown, Yes, No}}
		enumerationType eyeColor { literals {Unknown, Blue, Brown, Green}}
	}
	definitions {
//- Gender:
		question isMale : "Is your person a male?" yesNo
		question isFemale : "Is your person a female?" yesNo
		question personGender : "Your person is a " gender = if ( (isMale() = yesNo.Yes) or (isFemale() = yesNo.No)) then (gender.Male) endif;

//- Hair Color:
		question hasBrownHair : "Does your person have brown hair?" yesNo
		question hasBlondeHair : "Does your person have blonde hair?" yesNo
		question hasBlackHair : "Does your person have black hair?" yesNo
		question hasRedHair : "Does your person have red hair?" yesNo
		question hasGreyHair : "Does your person have grey hair?" yesNo
		question personHairColor : "Your person hair color is: " hairColor = if (hasBrownHair() = glasses.Yes or 
																				 (  hasBlondeHair() = yesNo.No and 
																				 	hasBlackHair() = yesNo.No and 
																				 	hasRedHair() = yesNo.No and
																				 	hasGreyHair() = yesNo.No
																				 )
																				) 
																			then hairColor.Brown 
																			else 
																				if (hasBlondeHair() = glasses.Yes or 
																					 (  hasBrownHair() = yesNo.No and 
																					 	hasBlackHair() = yesNo.No and 
																					 	hasRedHair() = yesNo.No and
																					 	hasGreyHair() = yesNo.No
																					 )
																					)
																				then hairColor.Blonde
																				else
																					if (hasBlackHair() = glasses.Yes or 
																						 (  hasBrownHair() = yesNo.No and 
																						 	hasBlondeHair() = yesNo.No and 
																						 	hasRedHair() = yesNo.No and
																						 	hasGreyHair() = yesNo.No
																						 )
																						)
																					then hairColor.Black
																					else 
																						if (hasRedHair() = glasses.Yes or 
																							 (  hasBrownHair() = yesNo.No and 
																							 	hasBlondeHair() = yesNo.No and 
																							 	hasBlackHair() = yesNo.No and
																							 	hasGreyHair() = yesNo.No
																							 )
																							)
																						then hairColor.Black
																						else
																							if (hasGreyHair() = glasses.Yes or 
																								 (  hasBrownHair() = yesNo.No and 
																								 	hasBlondeHair() = yesNo.No and 
																								 	hasBlackHair() = yesNo.No and
																								 	hasRedHair() = yesNo.No
																								 )
																								)
																							then hairColor.Grey
																							endif
																						endif
																					endif
																				endif
																			endif;
//- Facial Hair:
//
//"Does your person have a beard?"
//"Does your person have a mustache?"
//"Does your person have any facial hair?" (This can be used to quickly eliminate those with either a beard or mustache.)
//"Does your person have no facial hair?"
//- Glasses:
//
//"Does your person wear glasses?"
//"Does your person not wear glasses?"
//- Hat:
//
//"Does your person wear a hat?"
//"Does your person not wear a hat?"
//- Eye Color:
//
//"Does your person have blue eyes?"
//"Does your person have brown eyes?"
//"Does your person have green eyes?"
	}
	definitions {
		question isArthur : "Does your person is Arthur? (Male, Brown hair, Beard, No glasses, No hat, Brown eyes)" boolean
		question isBeatrice : "Does your person is Beatrice? (Female, Blonde hair, No facial hair, Yes glasses, No hat, Blue eyes)" boolean
//Charles: Male, Black hair, Mustache, No glasses, Yes hat, Brown eyes
//Diana: Female, Red hair, No facial hair, No glasses, No hat, Green eyes
//Edward: Male, Grey hair, Beard, Yes glasses, No hat, Blue eyes
//Fiona: Female, Brown hair, No facial hair, No glasses, Yes hat, Brown eyes
//George: Male, Blonde hair, Mustache, No glasses, No hat, Green eyes
//Hannah: Female, Black hair, No facial hair, Yes glasses, No hat, Brown eyes
//Isaac: Male, Red hair, Beard, No glasses, Yes hat, Blue eyes
//Julia: Female, Grey hair, No facial hair, No glasses, No hat, Green eyes
//Kevin: Male, Brown hair, None, Yes glasses, Yes hat, brown eyes
//Laura: Female, Blonde hair, None, No glasses, No hat, blue eyes
//Michael: Male, Black hair, Beard and Mustache, No glasses, No hat, green eyes
//Natalie: Female, Red hair, None, Yes glasses, No hat, brown eyes
//Oliver: Male, Grey hair, None, No glasses, Yes hat, blue eyes.
//Penelope: Female, Brown hair, None, No glasses, No hat, green eyes.
//Quentin: Male, Blonde hair, Beard, Yes glasses, No hat, brown eyes.
//Rachel: Female, Black hair, None, No glasses, Yes hat, blue eyes.
//Samuel: Male, Red hair, Mustache, No glasses, No hat, green eyes
//Tara: Female, Grey hair, None, Yes glasses, No hat, brown eyes.
	}
	Form GuessWho {
		{
			isMale
			isFemale
		}
		{
			hasBlackHair
			hasBlondeHair
			hasBrownHair
			hasGreyHair
			hasRedHair
		}
		{
			personGender
			personHairColor
		}
	}
}
