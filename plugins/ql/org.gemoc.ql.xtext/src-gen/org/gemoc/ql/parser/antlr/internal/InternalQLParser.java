package org.gemoc.ql.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.gemoc.ql.services.QLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'canSubmit'", "'QLModel'", "'{'", "'submitDate'", "'forms'", "','", "'}'", "'definitionGroup'", "'Form'", "'questionGroup'", "'DefinitionGroup'", "'dataTypes'", "'questionDefinitions'", "'EDate'", "'QuestionGroup'", "'guard'", "'questionGroups'", "'questions'", "'Question'", "'questionDefinition'", "'ValueType'", "'unit'", "'BasicBinaryExpression'", "'operator'", "'resultType'", "'lhsOperand'", "'rhsOperand'", "'ConstantCall'", "'value'", "'BasicUnaryExpression'", "'operand'", "'QuestionCall'", "'question'", "'BooleanValueType'", "'IntegerValueType'", "'min'", "'max'", "'DecimalValueType'", "'DateValueType'", "'EnumerationValueType'", "'enumerationLiterals'", "'StringValueType'", "'-'", "'EnumerationLiteral'", "'IntegerValue'", "'intValue'", "'StringValue'", "'stringValue'", "'booleanValue'", "'BooleanValue'", "'DateValue'", "'dateValue'", "'DecimalValue'", "'decimalValue'", "'.'", "'E'", "'e'", "'isDisplayed'", "'isMandatory'", "'QuestionDefinition'", "'label'", "'dataType'", "'computedExpression'", "'currentValue'", "'PLUS'", "'MINUS'", "'MULT'", "'DIV'", "'EQUAL'", "'NOTEQUAL'", "'GREATER'", "'LOWER'", "'GREATEROREQUAL'", "'LOWEROREQUAL'", "'AND'", "'OR'", "'UNARYMINUS'", "'NOT'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__88=88;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
    public static final int T__43=43;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalQLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalQL.g"; }



     	private QLGrammarAccess grammarAccess;

        public InternalQLParser(TokenStream input, QLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "QLModel";
       	}

       	@Override
       	protected QLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleQLModel"
    // InternalQL.g:65:1: entryRuleQLModel returns [EObject current=null] : iv_ruleQLModel= ruleQLModel EOF ;
    public final EObject entryRuleQLModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQLModel = null;


        try {
            // InternalQL.g:65:48: (iv_ruleQLModel= ruleQLModel EOF )
            // InternalQL.g:66:2: iv_ruleQLModel= ruleQLModel EOF
            {
             newCompositeNode(grammarAccess.getQLModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQLModel=ruleQLModel();

            state._fsp--;

             current =iv_ruleQLModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQLModel"


    // $ANTLR start "ruleQLModel"
    // InternalQL.g:72:1: ruleQLModel returns [EObject current=null] : ( () ( (lv_canSubmit_1_0= 'canSubmit' ) )? otherlv_2= 'QLModel' otherlv_3= '{' (otherlv_4= 'submitDate' ( (lv_submitDate_5_0= ruleEDate ) ) )? (otherlv_6= 'forms' otherlv_7= '{' ( (lv_forms_8_0= ruleForm ) ) (otherlv_9= ',' ( (lv_forms_10_0= ruleForm ) ) )* otherlv_11= '}' )? (otherlv_12= 'definitionGroup' otherlv_13= '{' ( (lv_definitionGroup_14_0= ruleDefinitionGroup ) ) (otherlv_15= ',' ( (lv_definitionGroup_16_0= ruleDefinitionGroup ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleQLModel() throws RecognitionException {
        EObject current = null;

        Token lv_canSubmit_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_submitDate_5_0 = null;

        EObject lv_forms_8_0 = null;

        EObject lv_forms_10_0 = null;

        EObject lv_definitionGroup_14_0 = null;

        EObject lv_definitionGroup_16_0 = null;



        	enterRule();

        try {
            // InternalQL.g:78:2: ( ( () ( (lv_canSubmit_1_0= 'canSubmit' ) )? otherlv_2= 'QLModel' otherlv_3= '{' (otherlv_4= 'submitDate' ( (lv_submitDate_5_0= ruleEDate ) ) )? (otherlv_6= 'forms' otherlv_7= '{' ( (lv_forms_8_0= ruleForm ) ) (otherlv_9= ',' ( (lv_forms_10_0= ruleForm ) ) )* otherlv_11= '}' )? (otherlv_12= 'definitionGroup' otherlv_13= '{' ( (lv_definitionGroup_14_0= ruleDefinitionGroup ) ) (otherlv_15= ',' ( (lv_definitionGroup_16_0= ruleDefinitionGroup ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // InternalQL.g:79:2: ( () ( (lv_canSubmit_1_0= 'canSubmit' ) )? otherlv_2= 'QLModel' otherlv_3= '{' (otherlv_4= 'submitDate' ( (lv_submitDate_5_0= ruleEDate ) ) )? (otherlv_6= 'forms' otherlv_7= '{' ( (lv_forms_8_0= ruleForm ) ) (otherlv_9= ',' ( (lv_forms_10_0= ruleForm ) ) )* otherlv_11= '}' )? (otherlv_12= 'definitionGroup' otherlv_13= '{' ( (lv_definitionGroup_14_0= ruleDefinitionGroup ) ) (otherlv_15= ',' ( (lv_definitionGroup_16_0= ruleDefinitionGroup ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // InternalQL.g:79:2: ( () ( (lv_canSubmit_1_0= 'canSubmit' ) )? otherlv_2= 'QLModel' otherlv_3= '{' (otherlv_4= 'submitDate' ( (lv_submitDate_5_0= ruleEDate ) ) )? (otherlv_6= 'forms' otherlv_7= '{' ( (lv_forms_8_0= ruleForm ) ) (otherlv_9= ',' ( (lv_forms_10_0= ruleForm ) ) )* otherlv_11= '}' )? (otherlv_12= 'definitionGroup' otherlv_13= '{' ( (lv_definitionGroup_14_0= ruleDefinitionGroup ) ) (otherlv_15= ',' ( (lv_definitionGroup_16_0= ruleDefinitionGroup ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // InternalQL.g:80:3: () ( (lv_canSubmit_1_0= 'canSubmit' ) )? otherlv_2= 'QLModel' otherlv_3= '{' (otherlv_4= 'submitDate' ( (lv_submitDate_5_0= ruleEDate ) ) )? (otherlv_6= 'forms' otherlv_7= '{' ( (lv_forms_8_0= ruleForm ) ) (otherlv_9= ',' ( (lv_forms_10_0= ruleForm ) ) )* otherlv_11= '}' )? (otherlv_12= 'definitionGroup' otherlv_13= '{' ( (lv_definitionGroup_14_0= ruleDefinitionGroup ) ) (otherlv_15= ',' ( (lv_definitionGroup_16_0= ruleDefinitionGroup ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // InternalQL.g:80:3: ()
            // InternalQL.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQLModelAccess().getQLModelAction_0(),
            					current);
            			

            }

            // InternalQL.g:87:3: ( (lv_canSubmit_1_0= 'canSubmit' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalQL.g:88:4: (lv_canSubmit_1_0= 'canSubmit' )
                    {
                    // InternalQL.g:88:4: (lv_canSubmit_1_0= 'canSubmit' )
                    // InternalQL.g:89:5: lv_canSubmit_1_0= 'canSubmit'
                    {
                    lv_canSubmit_1_0=(Token)match(input,11,FOLLOW_3); 

                    					newLeafNode(lv_canSubmit_1_0, grammarAccess.getQLModelAccess().getCanSubmitCanSubmitKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getQLModelRule());
                    					}
                    					setWithLastConsumed(current, "canSubmit", lv_canSubmit_1_0 != null, "canSubmit");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getQLModelAccess().getQLModelKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getQLModelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQL.g:109:3: (otherlv_4= 'submitDate' ( (lv_submitDate_5_0= ruleEDate ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalQL.g:110:4: otherlv_4= 'submitDate' ( (lv_submitDate_5_0= ruleEDate ) )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getQLModelAccess().getSubmitDateKeyword_4_0());
                    			
                    // InternalQL.g:114:4: ( (lv_submitDate_5_0= ruleEDate ) )
                    // InternalQL.g:115:5: (lv_submitDate_5_0= ruleEDate )
                    {
                    // InternalQL.g:115:5: (lv_submitDate_5_0= ruleEDate )
                    // InternalQL.g:116:6: lv_submitDate_5_0= ruleEDate
                    {

                    						newCompositeNode(grammarAccess.getQLModelAccess().getSubmitDateEDateParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_submitDate_5_0=ruleEDate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQLModelRule());
                    						}
                    						set(
                    							current,
                    							"submitDate",
                    							lv_submitDate_5_0,
                    							"org.gemoc.ql.QL.EDate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQL.g:134:3: (otherlv_6= 'forms' otherlv_7= '{' ( (lv_forms_8_0= ruleForm ) ) (otherlv_9= ',' ( (lv_forms_10_0= ruleForm ) ) )* otherlv_11= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalQL.g:135:4: otherlv_6= 'forms' otherlv_7= '{' ( (lv_forms_8_0= ruleForm ) ) (otherlv_9= ',' ( (lv_forms_10_0= ruleForm ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getQLModelAccess().getFormsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,13,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getQLModelAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalQL.g:143:4: ( (lv_forms_8_0= ruleForm ) )
                    // InternalQL.g:144:5: (lv_forms_8_0= ruleForm )
                    {
                    // InternalQL.g:144:5: (lv_forms_8_0= ruleForm )
                    // InternalQL.g:145:6: lv_forms_8_0= ruleForm
                    {

                    						newCompositeNode(grammarAccess.getQLModelAccess().getFormsFormParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_forms_8_0=ruleForm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQLModelRule());
                    						}
                    						add(
                    							current,
                    							"forms",
                    							lv_forms_8_0,
                    							"org.gemoc.ql.QL.Form");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQL.g:162:4: (otherlv_9= ',' ( (lv_forms_10_0= ruleForm ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalQL.g:163:5: otherlv_9= ',' ( (lv_forms_10_0= ruleForm ) )
                    	    {
                    	    otherlv_9=(Token)match(input,16,FOLLOW_8); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getQLModelAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalQL.g:167:5: ( (lv_forms_10_0= ruleForm ) )
                    	    // InternalQL.g:168:6: (lv_forms_10_0= ruleForm )
                    	    {
                    	    // InternalQL.g:168:6: (lv_forms_10_0= ruleForm )
                    	    // InternalQL.g:169:7: lv_forms_10_0= ruleForm
                    	    {

                    	    							newCompositeNode(grammarAccess.getQLModelAccess().getFormsFormParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_forms_10_0=ruleForm();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getQLModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"forms",
                    	    								lv_forms_10_0,
                    	    								"org.gemoc.ql.QL.Form");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_11, grammarAccess.getQLModelAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalQL.g:192:3: (otherlv_12= 'definitionGroup' otherlv_13= '{' ( (lv_definitionGroup_14_0= ruleDefinitionGroup ) ) (otherlv_15= ',' ( (lv_definitionGroup_16_0= ruleDefinitionGroup ) ) )* otherlv_17= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalQL.g:193:4: otherlv_12= 'definitionGroup' otherlv_13= '{' ( (lv_definitionGroup_14_0= ruleDefinitionGroup ) ) (otherlv_15= ',' ( (lv_definitionGroup_16_0= ruleDefinitionGroup ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getQLModelAccess().getDefinitionGroupKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,13,FOLLOW_11); 

                    				newLeafNode(otherlv_13, grammarAccess.getQLModelAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalQL.g:201:4: ( (lv_definitionGroup_14_0= ruleDefinitionGroup ) )
                    // InternalQL.g:202:5: (lv_definitionGroup_14_0= ruleDefinitionGroup )
                    {
                    // InternalQL.g:202:5: (lv_definitionGroup_14_0= ruleDefinitionGroup )
                    // InternalQL.g:203:6: lv_definitionGroup_14_0= ruleDefinitionGroup
                    {

                    						newCompositeNode(grammarAccess.getQLModelAccess().getDefinitionGroupDefinitionGroupParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_definitionGroup_14_0=ruleDefinitionGroup();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQLModelRule());
                    						}
                    						add(
                    							current,
                    							"definitionGroup",
                    							lv_definitionGroup_14_0,
                    							"org.gemoc.ql.QL.DefinitionGroup");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQL.g:220:4: (otherlv_15= ',' ( (lv_definitionGroup_16_0= ruleDefinitionGroup ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==16) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalQL.g:221:5: otherlv_15= ',' ( (lv_definitionGroup_16_0= ruleDefinitionGroup ) )
                    	    {
                    	    otherlv_15=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getQLModelAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQL.g:225:5: ( (lv_definitionGroup_16_0= ruleDefinitionGroup ) )
                    	    // InternalQL.g:226:6: (lv_definitionGroup_16_0= ruleDefinitionGroup )
                    	    {
                    	    // InternalQL.g:226:6: (lv_definitionGroup_16_0= ruleDefinitionGroup )
                    	    // InternalQL.g:227:7: lv_definitionGroup_16_0= ruleDefinitionGroup
                    	    {

                    	    							newCompositeNode(grammarAccess.getQLModelAccess().getDefinitionGroupDefinitionGroupParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_definitionGroup_16_0=ruleDefinitionGroup();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getQLModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"definitionGroup",
                    	    								lv_definitionGroup_16_0,
                    	    								"org.gemoc.ql.QL.DefinitionGroup");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_17, grammarAccess.getQLModelAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getQLModelAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQLModel"


    // $ANTLR start "entryRuleValueType"
    // InternalQL.g:258:1: entryRuleValueType returns [EObject current=null] : iv_ruleValueType= ruleValueType EOF ;
    public final EObject entryRuleValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueType = null;


        try {
            // InternalQL.g:258:50: (iv_ruleValueType= ruleValueType EOF )
            // InternalQL.g:259:2: iv_ruleValueType= ruleValueType EOF
            {
             newCompositeNode(grammarAccess.getValueTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValueType=ruleValueType();

            state._fsp--;

             current =iv_ruleValueType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueType"


    // $ANTLR start "ruleValueType"
    // InternalQL.g:265:1: ruleValueType returns [EObject current=null] : (this_ValueType_Impl_0= ruleValueType_Impl | this_BooleanValueType_1= ruleBooleanValueType | this_IntegerValueType_2= ruleIntegerValueType | this_DecimalValueType_3= ruleDecimalValueType | this_DateValueType_4= ruleDateValueType | this_EnumerationValueType_5= ruleEnumerationValueType | this_StringValueType_6= ruleStringValueType ) ;
    public final EObject ruleValueType() throws RecognitionException {
        EObject current = null;

        EObject this_ValueType_Impl_0 = null;

        EObject this_BooleanValueType_1 = null;

        EObject this_IntegerValueType_2 = null;

        EObject this_DecimalValueType_3 = null;

        EObject this_DateValueType_4 = null;

        EObject this_EnumerationValueType_5 = null;

        EObject this_StringValueType_6 = null;



        	enterRule();

        try {
            // InternalQL.g:271:2: ( (this_ValueType_Impl_0= ruleValueType_Impl | this_BooleanValueType_1= ruleBooleanValueType | this_IntegerValueType_2= ruleIntegerValueType | this_DecimalValueType_3= ruleDecimalValueType | this_DateValueType_4= ruleDateValueType | this_EnumerationValueType_5= ruleEnumerationValueType | this_StringValueType_6= ruleStringValueType ) )
            // InternalQL.g:272:2: (this_ValueType_Impl_0= ruleValueType_Impl | this_BooleanValueType_1= ruleBooleanValueType | this_IntegerValueType_2= ruleIntegerValueType | this_DecimalValueType_3= ruleDecimalValueType | this_DateValueType_4= ruleDateValueType | this_EnumerationValueType_5= ruleEnumerationValueType | this_StringValueType_6= ruleStringValueType )
            {
            // InternalQL.g:272:2: (this_ValueType_Impl_0= ruleValueType_Impl | this_BooleanValueType_1= ruleBooleanValueType | this_IntegerValueType_2= ruleIntegerValueType | this_DecimalValueType_3= ruleDecimalValueType | this_DateValueType_4= ruleDateValueType | this_EnumerationValueType_5= ruleEnumerationValueType | this_StringValueType_6= ruleStringValueType )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt7=1;
                }
                break;
            case 44:
                {
                alt7=2;
                }
                break;
            case 45:
                {
                alt7=3;
                }
                break;
            case 48:
                {
                alt7=4;
                }
                break;
            case 49:
                {
                alt7=5;
                }
                break;
            case 50:
                {
                alt7=6;
                }
                break;
            case 52:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalQL.g:273:3: this_ValueType_Impl_0= ruleValueType_Impl
                    {

                    			newCompositeNode(grammarAccess.getValueTypeAccess().getValueType_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ValueType_Impl_0=ruleValueType_Impl();

                    state._fsp--;


                    			current = this_ValueType_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQL.g:282:3: this_BooleanValueType_1= ruleBooleanValueType
                    {

                    			newCompositeNode(grammarAccess.getValueTypeAccess().getBooleanValueTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanValueType_1=ruleBooleanValueType();

                    state._fsp--;


                    			current = this_BooleanValueType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalQL.g:291:3: this_IntegerValueType_2= ruleIntegerValueType
                    {

                    			newCompositeNode(grammarAccess.getValueTypeAccess().getIntegerValueTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerValueType_2=ruleIntegerValueType();

                    state._fsp--;


                    			current = this_IntegerValueType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalQL.g:300:3: this_DecimalValueType_3= ruleDecimalValueType
                    {

                    			newCompositeNode(grammarAccess.getValueTypeAccess().getDecimalValueTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DecimalValueType_3=ruleDecimalValueType();

                    state._fsp--;


                    			current = this_DecimalValueType_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalQL.g:309:3: this_DateValueType_4= ruleDateValueType
                    {

                    			newCompositeNode(grammarAccess.getValueTypeAccess().getDateValueTypeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DateValueType_4=ruleDateValueType();

                    state._fsp--;


                    			current = this_DateValueType_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalQL.g:318:3: this_EnumerationValueType_5= ruleEnumerationValueType
                    {

                    			newCompositeNode(grammarAccess.getValueTypeAccess().getEnumerationValueTypeParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnumerationValueType_5=ruleEnumerationValueType();

                    state._fsp--;


                    			current = this_EnumerationValueType_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalQL.g:327:3: this_StringValueType_6= ruleStringValueType
                    {

                    			newCompositeNode(grammarAccess.getValueTypeAccess().getStringValueTypeParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringValueType_6=ruleStringValueType();

                    state._fsp--;


                    			current = this_StringValueType_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueType"


    // $ANTLR start "entryRuleExpression"
    // InternalQL.g:339:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalQL.g:339:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalQL.g:340:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalQL.g:346:1: ruleExpression returns [EObject current=null] : (this_BasicBinaryExpression_0= ruleBasicBinaryExpression | this_ConstantCall_1= ruleConstantCall | this_BasicUnaryExpression_2= ruleBasicUnaryExpression | this_QuestionCall_3= ruleQuestionCall ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BasicBinaryExpression_0 = null;

        EObject this_ConstantCall_1 = null;

        EObject this_BasicUnaryExpression_2 = null;

        EObject this_QuestionCall_3 = null;



        	enterRule();

        try {
            // InternalQL.g:352:2: ( (this_BasicBinaryExpression_0= ruleBasicBinaryExpression | this_ConstantCall_1= ruleConstantCall | this_BasicUnaryExpression_2= ruleBasicUnaryExpression | this_QuestionCall_3= ruleQuestionCall ) )
            // InternalQL.g:353:2: (this_BasicBinaryExpression_0= ruleBasicBinaryExpression | this_ConstantCall_1= ruleConstantCall | this_BasicUnaryExpression_2= ruleBasicUnaryExpression | this_QuestionCall_3= ruleQuestionCall )
            {
            // InternalQL.g:353:2: (this_BasicBinaryExpression_0= ruleBasicBinaryExpression | this_ConstantCall_1= ruleConstantCall | this_BasicUnaryExpression_2= ruleBasicUnaryExpression | this_QuestionCall_3= ruleQuestionCall )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt8=1;
                }
                break;
            case 38:
                {
                alt8=2;
                }
                break;
            case 40:
                {
                alt8=3;
                }
                break;
            case 42:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalQL.g:354:3: this_BasicBinaryExpression_0= ruleBasicBinaryExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getBasicBinaryExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BasicBinaryExpression_0=ruleBasicBinaryExpression();

                    state._fsp--;


                    			current = this_BasicBinaryExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQL.g:363:3: this_ConstantCall_1= ruleConstantCall
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getConstantCallParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConstantCall_1=ruleConstantCall();

                    state._fsp--;


                    			current = this_ConstantCall_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalQL.g:372:3: this_BasicUnaryExpression_2= ruleBasicUnaryExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getBasicUnaryExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BasicUnaryExpression_2=ruleBasicUnaryExpression();

                    state._fsp--;


                    			current = this_BasicUnaryExpression_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalQL.g:381:3: this_QuestionCall_3= ruleQuestionCall
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getQuestionCallParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_QuestionCall_3=ruleQuestionCall();

                    state._fsp--;


                    			current = this_QuestionCall_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleValue"
    // InternalQL.g:393:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalQL.g:393:46: (iv_ruleValue= ruleValue EOF )
            // InternalQL.g:394:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalQL.g:400:1: ruleValue returns [EObject current=null] : (this_IntegerValue_0= ruleIntegerValue | this_StringValue_1= ruleStringValue | this_BooleanValue_2= ruleBooleanValue | this_DateValue_3= ruleDateValue | this_DecimalValue_4= ruleDecimalValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerValue_0 = null;

        EObject this_StringValue_1 = null;

        EObject this_BooleanValue_2 = null;

        EObject this_DateValue_3 = null;

        EObject this_DecimalValue_4 = null;



        	enterRule();

        try {
            // InternalQL.g:406:2: ( (this_IntegerValue_0= ruleIntegerValue | this_StringValue_1= ruleStringValue | this_BooleanValue_2= ruleBooleanValue | this_DateValue_3= ruleDateValue | this_DecimalValue_4= ruleDecimalValue ) )
            // InternalQL.g:407:2: (this_IntegerValue_0= ruleIntegerValue | this_StringValue_1= ruleStringValue | this_BooleanValue_2= ruleBooleanValue | this_DateValue_3= ruleDateValue | this_DecimalValue_4= ruleDecimalValue )
            {
            // InternalQL.g:407:2: (this_IntegerValue_0= ruleIntegerValue | this_StringValue_1= ruleStringValue | this_BooleanValue_2= ruleBooleanValue | this_DateValue_3= ruleDateValue | this_DecimalValue_4= ruleDecimalValue )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt9=1;
                }
                break;
            case 57:
                {
                alt9=2;
                }
                break;
            case 59:
            case 60:
                {
                alt9=3;
                }
                break;
            case 61:
                {
                alt9=4;
                }
                break;
            case 63:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalQL.g:408:3: this_IntegerValue_0= ruleIntegerValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getIntegerValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerValue_0=ruleIntegerValue();

                    state._fsp--;


                    			current = this_IntegerValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQL.g:417:3: this_StringValue_1= ruleStringValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getStringValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringValue_1=ruleStringValue();

                    state._fsp--;


                    			current = this_StringValue_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalQL.g:426:3: this_BooleanValue_2= ruleBooleanValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanValue_2=ruleBooleanValue();

                    state._fsp--;


                    			current = this_BooleanValue_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalQL.g:435:3: this_DateValue_3= ruleDateValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getDateValueParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DateValue_3=ruleDateValue();

                    state._fsp--;


                    			current = this_DateValue_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalQL.g:444:3: this_DecimalValue_4= ruleDecimalValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getDecimalValueParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DecimalValue_4=ruleDecimalValue();

                    state._fsp--;


                    			current = this_DecimalValue_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleForm"
    // InternalQL.g:456:1: entryRuleForm returns [EObject current=null] : iv_ruleForm= ruleForm EOF ;
    public final EObject entryRuleForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForm = null;


        try {
            // InternalQL.g:456:45: (iv_ruleForm= ruleForm EOF )
            // InternalQL.g:457:2: iv_ruleForm= ruleForm EOF
            {
             newCompositeNode(grammarAccess.getFormRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForm=ruleForm();

            state._fsp--;

             current =iv_ruleForm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForm"


    // $ANTLR start "ruleForm"
    // InternalQL.g:463:1: ruleForm returns [EObject current=null] : (otherlv_0= 'Form' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'questionGroup' ( (lv_questionGroup_4_0= ruleQuestionGroup ) ) otherlv_5= '}' ) ;
    public final EObject ruleForm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_questionGroup_4_0 = null;



        	enterRule();

        try {
            // InternalQL.g:469:2: ( (otherlv_0= 'Form' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'questionGroup' ( (lv_questionGroup_4_0= ruleQuestionGroup ) ) otherlv_5= '}' ) )
            // InternalQL.g:470:2: (otherlv_0= 'Form' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'questionGroup' ( (lv_questionGroup_4_0= ruleQuestionGroup ) ) otherlv_5= '}' )
            {
            // InternalQL.g:470:2: (otherlv_0= 'Form' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'questionGroup' ( (lv_questionGroup_4_0= ruleQuestionGroup ) ) otherlv_5= '}' )
            // InternalQL.g:471:3: otherlv_0= 'Form' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'questionGroup' ( (lv_questionGroup_4_0= ruleQuestionGroup ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFormAccess().getFormKeyword_0());
            		
            // InternalQL.g:475:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQL.g:476:4: (lv_name_1_0= ruleEString )
            {
            // InternalQL.g:476:4: (lv_name_1_0= ruleEString )
            // InternalQL.g:477:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFormAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFormRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.gemoc.ql.QL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getFormAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getFormAccess().getQuestionGroupKeyword_3());
            		
            // InternalQL.g:502:3: ( (lv_questionGroup_4_0= ruleQuestionGroup ) )
            // InternalQL.g:503:4: (lv_questionGroup_4_0= ruleQuestionGroup )
            {
            // InternalQL.g:503:4: (lv_questionGroup_4_0= ruleQuestionGroup )
            // InternalQL.g:504:5: lv_questionGroup_4_0= ruleQuestionGroup
            {

            					newCompositeNode(grammarAccess.getFormAccess().getQuestionGroupQuestionGroupParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
            lv_questionGroup_4_0=ruleQuestionGroup();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFormRule());
            					}
            					set(
            						current,
            						"questionGroup",
            						lv_questionGroup_4_0,
            						"org.gemoc.ql.QL.QuestionGroup");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFormAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForm"


    // $ANTLR start "entryRuleDefinitionGroup"
    // InternalQL.g:529:1: entryRuleDefinitionGroup returns [EObject current=null] : iv_ruleDefinitionGroup= ruleDefinitionGroup EOF ;
    public final EObject entryRuleDefinitionGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionGroup = null;


        try {
            // InternalQL.g:529:56: (iv_ruleDefinitionGroup= ruleDefinitionGroup EOF )
            // InternalQL.g:530:2: iv_ruleDefinitionGroup= ruleDefinitionGroup EOF
            {
             newCompositeNode(grammarAccess.getDefinitionGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinitionGroup=ruleDefinitionGroup();

            state._fsp--;

             current =iv_ruleDefinitionGroup; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinitionGroup"


    // $ANTLR start "ruleDefinitionGroup"
    // InternalQL.g:536:1: ruleDefinitionGroup returns [EObject current=null] : ( () otherlv_1= 'DefinitionGroup' otherlv_2= '{' (otherlv_3= 'dataTypes' otherlv_4= '{' ( (lv_dataTypes_5_0= ruleValueType ) ) (otherlv_6= ',' ( (lv_dataTypes_7_0= ruleValueType ) ) )* otherlv_8= '}' )? (otherlv_9= 'questionDefinitions' otherlv_10= '{' ( (lv_questionDefinitions_11_0= ruleQuestionDefinition ) ) (otherlv_12= ',' ( (lv_questionDefinitions_13_0= ruleQuestionDefinition ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleDefinitionGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_dataTypes_5_0 = null;

        EObject lv_dataTypes_7_0 = null;

        EObject lv_questionDefinitions_11_0 = null;

        EObject lv_questionDefinitions_13_0 = null;



        	enterRule();

        try {
            // InternalQL.g:542:2: ( ( () otherlv_1= 'DefinitionGroup' otherlv_2= '{' (otherlv_3= 'dataTypes' otherlv_4= '{' ( (lv_dataTypes_5_0= ruleValueType ) ) (otherlv_6= ',' ( (lv_dataTypes_7_0= ruleValueType ) ) )* otherlv_8= '}' )? (otherlv_9= 'questionDefinitions' otherlv_10= '{' ( (lv_questionDefinitions_11_0= ruleQuestionDefinition ) ) (otherlv_12= ',' ( (lv_questionDefinitions_13_0= ruleQuestionDefinition ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalQL.g:543:2: ( () otherlv_1= 'DefinitionGroup' otherlv_2= '{' (otherlv_3= 'dataTypes' otherlv_4= '{' ( (lv_dataTypes_5_0= ruleValueType ) ) (otherlv_6= ',' ( (lv_dataTypes_7_0= ruleValueType ) ) )* otherlv_8= '}' )? (otherlv_9= 'questionDefinitions' otherlv_10= '{' ( (lv_questionDefinitions_11_0= ruleQuestionDefinition ) ) (otherlv_12= ',' ( (lv_questionDefinitions_13_0= ruleQuestionDefinition ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalQL.g:543:2: ( () otherlv_1= 'DefinitionGroup' otherlv_2= '{' (otherlv_3= 'dataTypes' otherlv_4= '{' ( (lv_dataTypes_5_0= ruleValueType ) ) (otherlv_6= ',' ( (lv_dataTypes_7_0= ruleValueType ) ) )* otherlv_8= '}' )? (otherlv_9= 'questionDefinitions' otherlv_10= '{' ( (lv_questionDefinitions_11_0= ruleQuestionDefinition ) ) (otherlv_12= ',' ( (lv_questionDefinitions_13_0= ruleQuestionDefinition ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalQL.g:544:3: () otherlv_1= 'DefinitionGroup' otherlv_2= '{' (otherlv_3= 'dataTypes' otherlv_4= '{' ( (lv_dataTypes_5_0= ruleValueType ) ) (otherlv_6= ',' ( (lv_dataTypes_7_0= ruleValueType ) ) )* otherlv_8= '}' )? (otherlv_9= 'questionDefinitions' otherlv_10= '{' ( (lv_questionDefinitions_11_0= ruleQuestionDefinition ) ) (otherlv_12= ',' ( (lv_questionDefinitions_13_0= ruleQuestionDefinition ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalQL.g:544:3: ()
            // InternalQL.g:545:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDefinitionGroupAccess().getDefinitionGroupAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDefinitionGroupAccess().getDefinitionGroupKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getDefinitionGroupAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQL.g:559:3: (otherlv_3= 'dataTypes' otherlv_4= '{' ( (lv_dataTypes_5_0= ruleValueType ) ) (otherlv_6= ',' ( (lv_dataTypes_7_0= ruleValueType ) ) )* otherlv_8= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalQL.g:560:4: otherlv_3= 'dataTypes' otherlv_4= '{' ( (lv_dataTypes_5_0= ruleValueType ) ) (otherlv_6= ',' ( (lv_dataTypes_7_0= ruleValueType ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getDefinitionGroupAccess().getDataTypesKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,13,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getDefinitionGroupAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalQL.g:568:4: ( (lv_dataTypes_5_0= ruleValueType ) )
                    // InternalQL.g:569:5: (lv_dataTypes_5_0= ruleValueType )
                    {
                    // InternalQL.g:569:5: (lv_dataTypes_5_0= ruleValueType )
                    // InternalQL.g:570:6: lv_dataTypes_5_0= ruleValueType
                    {

                    						newCompositeNode(grammarAccess.getDefinitionGroupAccess().getDataTypesValueTypeParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_dataTypes_5_0=ruleValueType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefinitionGroupRule());
                    						}
                    						add(
                    							current,
                    							"dataTypes",
                    							lv_dataTypes_5_0,
                    							"org.gemoc.ql.QL.ValueType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQL.g:587:4: (otherlv_6= ',' ( (lv_dataTypes_7_0= ruleValueType ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==16) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalQL.g:588:5: otherlv_6= ',' ( (lv_dataTypes_7_0= ruleValueType ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_17); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getDefinitionGroupAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalQL.g:592:5: ( (lv_dataTypes_7_0= ruleValueType ) )
                    	    // InternalQL.g:593:6: (lv_dataTypes_7_0= ruleValueType )
                    	    {
                    	    // InternalQL.g:593:6: (lv_dataTypes_7_0= ruleValueType )
                    	    // InternalQL.g:594:7: lv_dataTypes_7_0= ruleValueType
                    	    {

                    	    							newCompositeNode(grammarAccess.getDefinitionGroupAccess().getDataTypesValueTypeParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_dataTypes_7_0=ruleValueType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDefinitionGroupRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"dataTypes",
                    	    								lv_dataTypes_7_0,
                    	    								"org.gemoc.ql.QL.ValueType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,17,FOLLOW_18); 

                    				newLeafNode(otherlv_8, grammarAccess.getDefinitionGroupAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalQL.g:617:3: (otherlv_9= 'questionDefinitions' otherlv_10= '{' ( (lv_questionDefinitions_11_0= ruleQuestionDefinition ) ) (otherlv_12= ',' ( (lv_questionDefinitions_13_0= ruleQuestionDefinition ) ) )* otherlv_14= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalQL.g:618:4: otherlv_9= 'questionDefinitions' otherlv_10= '{' ( (lv_questionDefinitions_11_0= ruleQuestionDefinition ) ) (otherlv_12= ',' ( (lv_questionDefinitions_13_0= ruleQuestionDefinition ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getDefinitionGroupAccess().getQuestionDefinitionsKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,13,FOLLOW_19); 

                    				newLeafNode(otherlv_10, grammarAccess.getDefinitionGroupAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalQL.g:626:4: ( (lv_questionDefinitions_11_0= ruleQuestionDefinition ) )
                    // InternalQL.g:627:5: (lv_questionDefinitions_11_0= ruleQuestionDefinition )
                    {
                    // InternalQL.g:627:5: (lv_questionDefinitions_11_0= ruleQuestionDefinition )
                    // InternalQL.g:628:6: lv_questionDefinitions_11_0= ruleQuestionDefinition
                    {

                    						newCompositeNode(grammarAccess.getDefinitionGroupAccess().getQuestionDefinitionsQuestionDefinitionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_questionDefinitions_11_0=ruleQuestionDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefinitionGroupRule());
                    						}
                    						add(
                    							current,
                    							"questionDefinitions",
                    							lv_questionDefinitions_11_0,
                    							"org.gemoc.ql.QL.QuestionDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQL.g:645:4: (otherlv_12= ',' ( (lv_questionDefinitions_13_0= ruleQuestionDefinition ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==16) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalQL.g:646:5: otherlv_12= ',' ( (lv_questionDefinitions_13_0= ruleQuestionDefinition ) )
                    	    {
                    	    otherlv_12=(Token)match(input,16,FOLLOW_19); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getDefinitionGroupAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalQL.g:650:5: ( (lv_questionDefinitions_13_0= ruleQuestionDefinition ) )
                    	    // InternalQL.g:651:6: (lv_questionDefinitions_13_0= ruleQuestionDefinition )
                    	    {
                    	    // InternalQL.g:651:6: (lv_questionDefinitions_13_0= ruleQuestionDefinition )
                    	    // InternalQL.g:652:7: lv_questionDefinitions_13_0= ruleQuestionDefinition
                    	    {

                    	    							newCompositeNode(grammarAccess.getDefinitionGroupAccess().getQuestionDefinitionsQuestionDefinitionParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_questionDefinitions_13_0=ruleQuestionDefinition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDefinitionGroupRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"questionDefinitions",
                    	    								lv_questionDefinitions_13_0,
                    	    								"org.gemoc.ql.QL.QuestionDefinition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_14, grammarAccess.getDefinitionGroupAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getDefinitionGroupAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinitionGroup"


    // $ANTLR start "entryRuleEDate"
    // InternalQL.g:683:1: entryRuleEDate returns [String current=null] : iv_ruleEDate= ruleEDate EOF ;
    public final String entryRuleEDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDate = null;


        try {
            // InternalQL.g:683:45: (iv_ruleEDate= ruleEDate EOF )
            // InternalQL.g:684:2: iv_ruleEDate= ruleEDate EOF
            {
             newCompositeNode(grammarAccess.getEDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDate=ruleEDate();

            state._fsp--;

             current =iv_ruleEDate.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDate"


    // $ANTLR start "ruleEDate"
    // InternalQL.g:690:1: ruleEDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'EDate' ;
    public final AntlrDatatypeRuleToken ruleEDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalQL.g:696:2: (kw= 'EDate' )
            // InternalQL.g:697:2: kw= 'EDate'
            {
            kw=(Token)match(input,24,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getEDateAccess().getEDateKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDate"


    // $ANTLR start "entryRuleEString"
    // InternalQL.g:705:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalQL.g:705:47: (iv_ruleEString= ruleEString EOF )
            // InternalQL.g:706:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalQL.g:712:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalQL.g:718:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalQL.g:719:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalQL.g:719:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalQL.g:720:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalQL.g:728:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleQuestionGroup"
    // InternalQL.g:739:1: entryRuleQuestionGroup returns [EObject current=null] : iv_ruleQuestionGroup= ruleQuestionGroup EOF ;
    public final EObject entryRuleQuestionGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionGroup = null;


        try {
            // InternalQL.g:739:54: (iv_ruleQuestionGroup= ruleQuestionGroup EOF )
            // InternalQL.g:740:2: iv_ruleQuestionGroup= ruleQuestionGroup EOF
            {
             newCompositeNode(grammarAccess.getQuestionGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuestionGroup=ruleQuestionGroup();

            state._fsp--;

             current =iv_ruleQuestionGroup; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuestionGroup"


    // $ANTLR start "ruleQuestionGroup"
    // InternalQL.g:746:1: ruleQuestionGroup returns [EObject current=null] : ( () otherlv_1= 'QuestionGroup' otherlv_2= '{' (otherlv_3= 'guard' ( (lv_guard_4_0= ruleExpression ) ) )? (otherlv_5= 'questionGroups' otherlv_6= '{' ( (lv_questionGroups_7_0= ruleQuestionGroup ) ) (otherlv_8= ',' ( (lv_questionGroups_9_0= ruleQuestionGroup ) ) )* otherlv_10= '}' )? (otherlv_11= 'questions' otherlv_12= '{' ( (lv_questions_13_0= ruleQuestion ) ) (otherlv_14= ',' ( (lv_questions_15_0= ruleQuestion ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) ;
    public final EObject ruleQuestionGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_guard_4_0 = null;

        EObject lv_questionGroups_7_0 = null;

        EObject lv_questionGroups_9_0 = null;

        EObject lv_questions_13_0 = null;

        EObject lv_questions_15_0 = null;



        	enterRule();

        try {
            // InternalQL.g:752:2: ( ( () otherlv_1= 'QuestionGroup' otherlv_2= '{' (otherlv_3= 'guard' ( (lv_guard_4_0= ruleExpression ) ) )? (otherlv_5= 'questionGroups' otherlv_6= '{' ( (lv_questionGroups_7_0= ruleQuestionGroup ) ) (otherlv_8= ',' ( (lv_questionGroups_9_0= ruleQuestionGroup ) ) )* otherlv_10= '}' )? (otherlv_11= 'questions' otherlv_12= '{' ( (lv_questions_13_0= ruleQuestion ) ) (otherlv_14= ',' ( (lv_questions_15_0= ruleQuestion ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) )
            // InternalQL.g:753:2: ( () otherlv_1= 'QuestionGroup' otherlv_2= '{' (otherlv_3= 'guard' ( (lv_guard_4_0= ruleExpression ) ) )? (otherlv_5= 'questionGroups' otherlv_6= '{' ( (lv_questionGroups_7_0= ruleQuestionGroup ) ) (otherlv_8= ',' ( (lv_questionGroups_9_0= ruleQuestionGroup ) ) )* otherlv_10= '}' )? (otherlv_11= 'questions' otherlv_12= '{' ( (lv_questions_13_0= ruleQuestion ) ) (otherlv_14= ',' ( (lv_questions_15_0= ruleQuestion ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            {
            // InternalQL.g:753:2: ( () otherlv_1= 'QuestionGroup' otherlv_2= '{' (otherlv_3= 'guard' ( (lv_guard_4_0= ruleExpression ) ) )? (otherlv_5= 'questionGroups' otherlv_6= '{' ( (lv_questionGroups_7_0= ruleQuestionGroup ) ) (otherlv_8= ',' ( (lv_questionGroups_9_0= ruleQuestionGroup ) ) )* otherlv_10= '}' )? (otherlv_11= 'questions' otherlv_12= '{' ( (lv_questions_13_0= ruleQuestion ) ) (otherlv_14= ',' ( (lv_questions_15_0= ruleQuestion ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            // InternalQL.g:754:3: () otherlv_1= 'QuestionGroup' otherlv_2= '{' (otherlv_3= 'guard' ( (lv_guard_4_0= ruleExpression ) ) )? (otherlv_5= 'questionGroups' otherlv_6= '{' ( (lv_questionGroups_7_0= ruleQuestionGroup ) ) (otherlv_8= ',' ( (lv_questionGroups_9_0= ruleQuestionGroup ) ) )* otherlv_10= '}' )? (otherlv_11= 'questions' otherlv_12= '{' ( (lv_questions_13_0= ruleQuestion ) ) (otherlv_14= ',' ( (lv_questions_15_0= ruleQuestion ) ) )* otherlv_16= '}' )? otherlv_17= '}'
            {
            // InternalQL.g:754:3: ()
            // InternalQL.g:755:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQuestionGroupAccess().getQuestionGroupAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getQuestionGroupAccess().getQuestionGroupKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getQuestionGroupAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQL.g:769:3: (otherlv_3= 'guard' ( (lv_guard_4_0= ruleExpression ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalQL.g:770:4: otherlv_3= 'guard' ( (lv_guard_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_21); 

                    				newLeafNode(otherlv_3, grammarAccess.getQuestionGroupAccess().getGuardKeyword_3_0());
                    			
                    // InternalQL.g:774:4: ( (lv_guard_4_0= ruleExpression ) )
                    // InternalQL.g:775:5: (lv_guard_4_0= ruleExpression )
                    {
                    // InternalQL.g:775:5: (lv_guard_4_0= ruleExpression )
                    // InternalQL.g:776:6: lv_guard_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getQuestionGroupAccess().getGuardExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_guard_4_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuestionGroupRule());
                    						}
                    						set(
                    							current,
                    							"guard",
                    							lv_guard_4_0,
                    							"org.gemoc.ql.QL.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQL.g:794:3: (otherlv_5= 'questionGroups' otherlv_6= '{' ( (lv_questionGroups_7_0= ruleQuestionGroup ) ) (otherlv_8= ',' ( (lv_questionGroups_9_0= ruleQuestionGroup ) ) )* otherlv_10= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalQL.g:795:4: otherlv_5= 'questionGroups' otherlv_6= '{' ( (lv_questionGroups_7_0= ruleQuestionGroup ) ) (otherlv_8= ',' ( (lv_questionGroups_9_0= ruleQuestionGroup ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getQuestionGroupAccess().getQuestionGroupsKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,13,FOLLOW_15); 

                    				newLeafNode(otherlv_6, grammarAccess.getQuestionGroupAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalQL.g:803:4: ( (lv_questionGroups_7_0= ruleQuestionGroup ) )
                    // InternalQL.g:804:5: (lv_questionGroups_7_0= ruleQuestionGroup )
                    {
                    // InternalQL.g:804:5: (lv_questionGroups_7_0= ruleQuestionGroup )
                    // InternalQL.g:805:6: lv_questionGroups_7_0= ruleQuestionGroup
                    {

                    						newCompositeNode(grammarAccess.getQuestionGroupAccess().getQuestionGroupsQuestionGroupParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_questionGroups_7_0=ruleQuestionGroup();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuestionGroupRule());
                    						}
                    						add(
                    							current,
                    							"questionGroups",
                    							lv_questionGroups_7_0,
                    							"org.gemoc.ql.QL.QuestionGroup");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQL.g:822:4: (otherlv_8= ',' ( (lv_questionGroups_9_0= ruleQuestionGroup ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==16) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalQL.g:823:5: otherlv_8= ',' ( (lv_questionGroups_9_0= ruleQuestionGroup ) )
                    	    {
                    	    otherlv_8=(Token)match(input,16,FOLLOW_15); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getQuestionGroupAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalQL.g:827:5: ( (lv_questionGroups_9_0= ruleQuestionGroup ) )
                    	    // InternalQL.g:828:6: (lv_questionGroups_9_0= ruleQuestionGroup )
                    	    {
                    	    // InternalQL.g:828:6: (lv_questionGroups_9_0= ruleQuestionGroup )
                    	    // InternalQL.g:829:7: lv_questionGroups_9_0= ruleQuestionGroup
                    	    {

                    	    							newCompositeNode(grammarAccess.getQuestionGroupAccess().getQuestionGroupsQuestionGroupParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_questionGroups_9_0=ruleQuestionGroup();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getQuestionGroupRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"questionGroups",
                    	    								lv_questionGroups_9_0,
                    	    								"org.gemoc.ql.QL.QuestionGroup");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,17,FOLLOW_23); 

                    				newLeafNode(otherlv_10, grammarAccess.getQuestionGroupAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalQL.g:852:3: (otherlv_11= 'questions' otherlv_12= '{' ( (lv_questions_13_0= ruleQuestion ) ) (otherlv_14= ',' ( (lv_questions_15_0= ruleQuestion ) ) )* otherlv_16= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalQL.g:853:4: otherlv_11= 'questions' otherlv_12= '{' ( (lv_questions_13_0= ruleQuestion ) ) (otherlv_14= ',' ( (lv_questions_15_0= ruleQuestion ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getQuestionGroupAccess().getQuestionsKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,13,FOLLOW_24); 

                    				newLeafNode(otherlv_12, grammarAccess.getQuestionGroupAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalQL.g:861:4: ( (lv_questions_13_0= ruleQuestion ) )
                    // InternalQL.g:862:5: (lv_questions_13_0= ruleQuestion )
                    {
                    // InternalQL.g:862:5: (lv_questions_13_0= ruleQuestion )
                    // InternalQL.g:863:6: lv_questions_13_0= ruleQuestion
                    {

                    						newCompositeNode(grammarAccess.getQuestionGroupAccess().getQuestionsQuestionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_questions_13_0=ruleQuestion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuestionGroupRule());
                    						}
                    						add(
                    							current,
                    							"questions",
                    							lv_questions_13_0,
                    							"org.gemoc.ql.QL.Question");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQL.g:880:4: (otherlv_14= ',' ( (lv_questions_15_0= ruleQuestion ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==16) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalQL.g:881:5: otherlv_14= ',' ( (lv_questions_15_0= ruleQuestion ) )
                    	    {
                    	    otherlv_14=(Token)match(input,16,FOLLOW_24); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getQuestionGroupAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalQL.g:885:5: ( (lv_questions_15_0= ruleQuestion ) )
                    	    // InternalQL.g:886:6: (lv_questions_15_0= ruleQuestion )
                    	    {
                    	    // InternalQL.g:886:6: (lv_questions_15_0= ruleQuestion )
                    	    // InternalQL.g:887:7: lv_questions_15_0= ruleQuestion
                    	    {

                    	    							newCompositeNode(grammarAccess.getQuestionGroupAccess().getQuestionsQuestionParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_questions_15_0=ruleQuestion();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getQuestionGroupRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"questions",
                    	    								lv_questions_15_0,
                    	    								"org.gemoc.ql.QL.Question");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_16, grammarAccess.getQuestionGroupAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getQuestionGroupAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuestionGroup"


    // $ANTLR start "entryRuleQuestion"
    // InternalQL.g:918:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // InternalQL.g:918:49: (iv_ruleQuestion= ruleQuestion EOF )
            // InternalQL.g:919:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // InternalQL.g:925:1: ruleQuestion returns [EObject current=null] : (otherlv_0= 'Question' otherlv_1= '{' otherlv_2= 'questionDefinition' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalQL.g:931:2: ( (otherlv_0= 'Question' otherlv_1= '{' otherlv_2= 'questionDefinition' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // InternalQL.g:932:2: (otherlv_0= 'Question' otherlv_1= '{' otherlv_2= 'questionDefinition' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // InternalQL.g:932:2: (otherlv_0= 'Question' otherlv_1= '{' otherlv_2= 'questionDefinition' ( ( ruleEString ) ) otherlv_4= '}' )
            // InternalQL.g:933:3: otherlv_0= 'Question' otherlv_1= '{' otherlv_2= 'questionDefinition' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getQuestionAccess().getQuestionKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getQuestionAccess().getQuestionDefinitionKeyword_2());
            		
            // InternalQL.g:945:3: ( ( ruleEString ) )
            // InternalQL.g:946:4: ( ruleEString )
            {
            // InternalQL.g:946:4: ( ruleEString )
            // InternalQL.g:947:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuestionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getQuestionAccess().getQuestionDefinitionQuestionDefinitionCrossReference_3_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleValueType_Impl"
    // InternalQL.g:969:1: entryRuleValueType_Impl returns [EObject current=null] : iv_ruleValueType_Impl= ruleValueType_Impl EOF ;
    public final EObject entryRuleValueType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueType_Impl = null;


        try {
            // InternalQL.g:969:55: (iv_ruleValueType_Impl= ruleValueType_Impl EOF )
            // InternalQL.g:970:2: iv_ruleValueType_Impl= ruleValueType_Impl EOF
            {
             newCompositeNode(grammarAccess.getValueType_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValueType_Impl=ruleValueType_Impl();

            state._fsp--;

             current =iv_ruleValueType_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueType_Impl"


    // $ANTLR start "ruleValueType_Impl"
    // InternalQL.g:976:1: ruleValueType_Impl returns [EObject current=null] : ( () otherlv_1= 'ValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleValueType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_unit_5_0 = null;



        	enterRule();

        try {
            // InternalQL.g:982:2: ( ( () otherlv_1= 'ValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalQL.g:983:2: ( () otherlv_1= 'ValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalQL.g:983:2: ( () otherlv_1= 'ValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalQL.g:984:3: () otherlv_1= 'ValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalQL.g:984:3: ()
            // InternalQL.g:985:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getValueType_ImplAccess().getValueTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getValueType_ImplAccess().getValueTypeKeyword_1());
            		
            // InternalQL.g:995:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQL.g:996:4: (lv_name_2_0= ruleEString )
            {
            // InternalQL.g:996:4: (lv_name_2_0= ruleEString )
            // InternalQL.g:997:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getValueType_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValueType_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.gemoc.ql.QL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getValueType_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQL.g:1018:3: (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalQL.g:1019:4: otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getValueType_ImplAccess().getUnitKeyword_4_0());
                    			
                    // InternalQL.g:1023:4: ( (lv_unit_5_0= ruleEString ) )
                    // InternalQL.g:1024:5: (lv_unit_5_0= ruleEString )
                    {
                    // InternalQL.g:1024:5: (lv_unit_5_0= ruleEString )
                    // InternalQL.g:1025:6: lv_unit_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getValueType_ImplAccess().getUnitEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_unit_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getValueType_ImplRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_5_0,
                    							"org.gemoc.ql.QL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getValueType_ImplAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueType_Impl"


    // $ANTLR start "entryRuleBasicBinaryExpression"
    // InternalQL.g:1051:1: entryRuleBasicBinaryExpression returns [EObject current=null] : iv_ruleBasicBinaryExpression= ruleBasicBinaryExpression EOF ;
    public final EObject entryRuleBasicBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicBinaryExpression = null;


        try {
            // InternalQL.g:1051:62: (iv_ruleBasicBinaryExpression= ruleBasicBinaryExpression EOF )
            // InternalQL.g:1052:2: iv_ruleBasicBinaryExpression= ruleBasicBinaryExpression EOF
            {
             newCompositeNode(grammarAccess.getBasicBinaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasicBinaryExpression=ruleBasicBinaryExpression();

            state._fsp--;

             current =iv_ruleBasicBinaryExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBasicBinaryExpression"


    // $ANTLR start "ruleBasicBinaryExpression"
    // InternalQL.g:1058:1: ruleBasicBinaryExpression returns [EObject current=null] : (otherlv_0= 'BasicBinaryExpression' otherlv_1= '{' otherlv_2= 'operator' ( (lv_operator_3_0= ruleBinaryOperatorKind ) ) (otherlv_4= 'resultType' ( ( ruleEString ) ) )? otherlv_6= 'lhsOperand' ( (lv_lhsOperand_7_0= ruleExpression ) ) otherlv_8= 'rhsOperand' ( (lv_rhsOperand_9_0= ruleExpression ) ) otherlv_10= '}' ) ;
    public final EObject ruleBasicBinaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Enumerator lv_operator_3_0 = null;

        EObject lv_lhsOperand_7_0 = null;

        EObject lv_rhsOperand_9_0 = null;



        	enterRule();

        try {
            // InternalQL.g:1064:2: ( (otherlv_0= 'BasicBinaryExpression' otherlv_1= '{' otherlv_2= 'operator' ( (lv_operator_3_0= ruleBinaryOperatorKind ) ) (otherlv_4= 'resultType' ( ( ruleEString ) ) )? otherlv_6= 'lhsOperand' ( (lv_lhsOperand_7_0= ruleExpression ) ) otherlv_8= 'rhsOperand' ( (lv_rhsOperand_9_0= ruleExpression ) ) otherlv_10= '}' ) )
            // InternalQL.g:1065:2: (otherlv_0= 'BasicBinaryExpression' otherlv_1= '{' otherlv_2= 'operator' ( (lv_operator_3_0= ruleBinaryOperatorKind ) ) (otherlv_4= 'resultType' ( ( ruleEString ) ) )? otherlv_6= 'lhsOperand' ( (lv_lhsOperand_7_0= ruleExpression ) ) otherlv_8= 'rhsOperand' ( (lv_rhsOperand_9_0= ruleExpression ) ) otherlv_10= '}' )
            {
            // InternalQL.g:1065:2: (otherlv_0= 'BasicBinaryExpression' otherlv_1= '{' otherlv_2= 'operator' ( (lv_operator_3_0= ruleBinaryOperatorKind ) ) (otherlv_4= 'resultType' ( ( ruleEString ) ) )? otherlv_6= 'lhsOperand' ( (lv_lhsOperand_7_0= ruleExpression ) ) otherlv_8= 'rhsOperand' ( (lv_rhsOperand_9_0= ruleExpression ) ) otherlv_10= '}' )
            // InternalQL.g:1066:3: otherlv_0= 'BasicBinaryExpression' otherlv_1= '{' otherlv_2= 'operator' ( (lv_operator_3_0= ruleBinaryOperatorKind ) ) (otherlv_4= 'resultType' ( ( ruleEString ) ) )? otherlv_6= 'lhsOperand' ( (lv_lhsOperand_7_0= ruleExpression ) ) otherlv_8= 'rhsOperand' ( (lv_rhsOperand_9_0= ruleExpression ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBasicBinaryExpressionAccess().getBasicBinaryExpressionKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getBasicBinaryExpressionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getBasicBinaryExpressionAccess().getOperatorKeyword_2());
            		
            // InternalQL.g:1078:3: ( (lv_operator_3_0= ruleBinaryOperatorKind ) )
            // InternalQL.g:1079:4: (lv_operator_3_0= ruleBinaryOperatorKind )
            {
            // InternalQL.g:1079:4: (lv_operator_3_0= ruleBinaryOperatorKind )
            // InternalQL.g:1080:5: lv_operator_3_0= ruleBinaryOperatorKind
            {

            					newCompositeNode(grammarAccess.getBasicBinaryExpressionAccess().getOperatorBinaryOperatorKindEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_29);
            lv_operator_3_0=ruleBinaryOperatorKind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBasicBinaryExpressionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_3_0,
            						"org.gemoc.ql.QL.BinaryOperatorKind");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQL.g:1097:3: (otherlv_4= 'resultType' ( ( ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalQL.g:1098:4: otherlv_4= 'resultType' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getBasicBinaryExpressionAccess().getResultTypeKeyword_4_0());
                    			
                    // InternalQL.g:1102:4: ( ( ruleEString ) )
                    // InternalQL.g:1103:5: ( ruleEString )
                    {
                    // InternalQL.g:1103:5: ( ruleEString )
                    // InternalQL.g:1104:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBasicBinaryExpressionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBasicBinaryExpressionAccess().getResultTypeValueTypeCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,36,FOLLOW_21); 

            			newLeafNode(otherlv_6, grammarAccess.getBasicBinaryExpressionAccess().getLhsOperandKeyword_5());
            		
            // InternalQL.g:1123:3: ( (lv_lhsOperand_7_0= ruleExpression ) )
            // InternalQL.g:1124:4: (lv_lhsOperand_7_0= ruleExpression )
            {
            // InternalQL.g:1124:4: (lv_lhsOperand_7_0= ruleExpression )
            // InternalQL.g:1125:5: lv_lhsOperand_7_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getBasicBinaryExpressionAccess().getLhsOperandExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_31);
            lv_lhsOperand_7_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBasicBinaryExpressionRule());
            					}
            					set(
            						current,
            						"lhsOperand",
            						lv_lhsOperand_7_0,
            						"org.gemoc.ql.QL.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,37,FOLLOW_21); 

            			newLeafNode(otherlv_8, grammarAccess.getBasicBinaryExpressionAccess().getRhsOperandKeyword_7());
            		
            // InternalQL.g:1146:3: ( (lv_rhsOperand_9_0= ruleExpression ) )
            // InternalQL.g:1147:4: (lv_rhsOperand_9_0= ruleExpression )
            {
            // InternalQL.g:1147:4: (lv_rhsOperand_9_0= ruleExpression )
            // InternalQL.g:1148:5: lv_rhsOperand_9_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getBasicBinaryExpressionAccess().getRhsOperandExpressionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_12);
            lv_rhsOperand_9_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBasicBinaryExpressionRule());
            					}
            					set(
            						current,
            						"rhsOperand",
            						lv_rhsOperand_9_0,
            						"org.gemoc.ql.QL.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getBasicBinaryExpressionAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBasicBinaryExpression"


    // $ANTLR start "entryRuleConstantCall"
    // InternalQL.g:1173:1: entryRuleConstantCall returns [EObject current=null] : iv_ruleConstantCall= ruleConstantCall EOF ;
    public final EObject entryRuleConstantCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantCall = null;


        try {
            // InternalQL.g:1173:53: (iv_ruleConstantCall= ruleConstantCall EOF )
            // InternalQL.g:1174:2: iv_ruleConstantCall= ruleConstantCall EOF
            {
             newCompositeNode(grammarAccess.getConstantCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstantCall=ruleConstantCall();

            state._fsp--;

             current =iv_ruleConstantCall; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstantCall"


    // $ANTLR start "ruleConstantCall"
    // InternalQL.g:1180:1: ruleConstantCall returns [EObject current=null] : ( () otherlv_1= 'ConstantCall' otherlv_2= '{' (otherlv_3= 'resultType' ( ( ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleValue ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleConstantCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_value_6_0 = null;



        	enterRule();

        try {
            // InternalQL.g:1186:2: ( ( () otherlv_1= 'ConstantCall' otherlv_2= '{' (otherlv_3= 'resultType' ( ( ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleValue ) ) )? otherlv_7= '}' ) )
            // InternalQL.g:1187:2: ( () otherlv_1= 'ConstantCall' otherlv_2= '{' (otherlv_3= 'resultType' ( ( ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleValue ) ) )? otherlv_7= '}' )
            {
            // InternalQL.g:1187:2: ( () otherlv_1= 'ConstantCall' otherlv_2= '{' (otherlv_3= 'resultType' ( ( ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleValue ) ) )? otherlv_7= '}' )
            // InternalQL.g:1188:3: () otherlv_1= 'ConstantCall' otherlv_2= '{' (otherlv_3= 'resultType' ( ( ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleValue ) ) )? otherlv_7= '}'
            {
            // InternalQL.g:1188:3: ()
            // InternalQL.g:1189:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConstantCallAccess().getConstantCallAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getConstantCallAccess().getConstantCallKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getConstantCallAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQL.g:1203:3: (otherlv_3= 'resultType' ( ( ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalQL.g:1204:4: otherlv_3= 'resultType' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getConstantCallAccess().getResultTypeKeyword_3_0());
                    			
                    // InternalQL.g:1208:4: ( ( ruleEString ) )
                    // InternalQL.g:1209:5: ( ruleEString )
                    {
                    // InternalQL.g:1209:5: ( ruleEString )
                    // InternalQL.g:1210:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstantCallRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getConstantCallAccess().getResultTypeValueTypeCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQL.g:1225:3: (otherlv_5= 'value' ( (lv_value_6_0= ruleValue ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalQL.g:1226:4: otherlv_5= 'value' ( (lv_value_6_0= ruleValue ) )
                    {
                    otherlv_5=(Token)match(input,39,FOLLOW_34); 

                    				newLeafNode(otherlv_5, grammarAccess.getConstantCallAccess().getValueKeyword_4_0());
                    			
                    // InternalQL.g:1230:4: ( (lv_value_6_0= ruleValue ) )
                    // InternalQL.g:1231:5: (lv_value_6_0= ruleValue )
                    {
                    // InternalQL.g:1231:5: (lv_value_6_0= ruleValue )
                    // InternalQL.g:1232:6: lv_value_6_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getConstantCallAccess().getValueValueParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_value_6_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstantCallRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_6_0,
                    							"org.gemoc.ql.QL.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getConstantCallAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstantCall"


    // $ANTLR start "entryRuleBasicUnaryExpression"
    // InternalQL.g:1258:1: entryRuleBasicUnaryExpression returns [EObject current=null] : iv_ruleBasicUnaryExpression= ruleBasicUnaryExpression EOF ;
    public final EObject entryRuleBasicUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicUnaryExpression = null;


        try {
            // InternalQL.g:1258:61: (iv_ruleBasicUnaryExpression= ruleBasicUnaryExpression EOF )
            // InternalQL.g:1259:2: iv_ruleBasicUnaryExpression= ruleBasicUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getBasicUnaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasicUnaryExpression=ruleBasicUnaryExpression();

            state._fsp--;

             current =iv_ruleBasicUnaryExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBasicUnaryExpression"


    // $ANTLR start "ruleBasicUnaryExpression"
    // InternalQL.g:1265:1: ruleBasicUnaryExpression returns [EObject current=null] : (otherlv_0= 'BasicUnaryExpression' otherlv_1= '{' (otherlv_2= 'operator' ( (lv_operator_3_0= ruleUnaryOperatorKind ) ) )? (otherlv_4= 'resultType' ( ( ruleEString ) ) )? otherlv_6= 'operand' ( (lv_operand_7_0= ruleExpression ) ) otherlv_8= '}' ) ;
    public final EObject ruleBasicUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_operator_3_0 = null;

        EObject lv_operand_7_0 = null;



        	enterRule();

        try {
            // InternalQL.g:1271:2: ( (otherlv_0= 'BasicUnaryExpression' otherlv_1= '{' (otherlv_2= 'operator' ( (lv_operator_3_0= ruleUnaryOperatorKind ) ) )? (otherlv_4= 'resultType' ( ( ruleEString ) ) )? otherlv_6= 'operand' ( (lv_operand_7_0= ruleExpression ) ) otherlv_8= '}' ) )
            // InternalQL.g:1272:2: (otherlv_0= 'BasicUnaryExpression' otherlv_1= '{' (otherlv_2= 'operator' ( (lv_operator_3_0= ruleUnaryOperatorKind ) ) )? (otherlv_4= 'resultType' ( ( ruleEString ) ) )? otherlv_6= 'operand' ( (lv_operand_7_0= ruleExpression ) ) otherlv_8= '}' )
            {
            // InternalQL.g:1272:2: (otherlv_0= 'BasicUnaryExpression' otherlv_1= '{' (otherlv_2= 'operator' ( (lv_operator_3_0= ruleUnaryOperatorKind ) ) )? (otherlv_4= 'resultType' ( ( ruleEString ) ) )? otherlv_6= 'operand' ( (lv_operand_7_0= ruleExpression ) ) otherlv_8= '}' )
            // InternalQL.g:1273:3: otherlv_0= 'BasicUnaryExpression' otherlv_1= '{' (otherlv_2= 'operator' ( (lv_operator_3_0= ruleUnaryOperatorKind ) ) )? (otherlv_4= 'resultType' ( ( ruleEString ) ) )? otherlv_6= 'operand' ( (lv_operand_7_0= ruleExpression ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBasicUnaryExpressionAccess().getBasicUnaryExpressionKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getBasicUnaryExpressionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalQL.g:1281:3: (otherlv_2= 'operator' ( (lv_operator_3_0= ruleUnaryOperatorKind ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalQL.g:1282:4: otherlv_2= 'operator' ( (lv_operator_3_0= ruleUnaryOperatorKind ) )
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_36); 

                    				newLeafNode(otherlv_2, grammarAccess.getBasicUnaryExpressionAccess().getOperatorKeyword_2_0());
                    			
                    // InternalQL.g:1286:4: ( (lv_operator_3_0= ruleUnaryOperatorKind ) )
                    // InternalQL.g:1287:5: (lv_operator_3_0= ruleUnaryOperatorKind )
                    {
                    // InternalQL.g:1287:5: (lv_operator_3_0= ruleUnaryOperatorKind )
                    // InternalQL.g:1288:6: lv_operator_3_0= ruleUnaryOperatorKind
                    {

                    						newCompositeNode(grammarAccess.getBasicUnaryExpressionAccess().getOperatorUnaryOperatorKindEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_operator_3_0=ruleUnaryOperatorKind();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBasicUnaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_3_0,
                    							"org.gemoc.ql.QL.UnaryOperatorKind");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQL.g:1306:3: (otherlv_4= 'resultType' ( ( ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==35) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalQL.g:1307:4: otherlv_4= 'resultType' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getBasicUnaryExpressionAccess().getResultTypeKeyword_3_0());
                    			
                    // InternalQL.g:1311:4: ( ( ruleEString ) )
                    // InternalQL.g:1312:5: ( ruleEString )
                    {
                    // InternalQL.g:1312:5: ( ruleEString )
                    // InternalQL.g:1313:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBasicUnaryExpressionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBasicUnaryExpressionAccess().getResultTypeValueTypeCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,41,FOLLOW_21); 

            			newLeafNode(otherlv_6, grammarAccess.getBasicUnaryExpressionAccess().getOperandKeyword_4());
            		
            // InternalQL.g:1332:3: ( (lv_operand_7_0= ruleExpression ) )
            // InternalQL.g:1333:4: (lv_operand_7_0= ruleExpression )
            {
            // InternalQL.g:1333:4: (lv_operand_7_0= ruleExpression )
            // InternalQL.g:1334:5: lv_operand_7_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getBasicUnaryExpressionAccess().getOperandExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
            lv_operand_7_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBasicUnaryExpressionRule());
            					}
            					set(
            						current,
            						"operand",
            						lv_operand_7_0,
            						"org.gemoc.ql.QL.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getBasicUnaryExpressionAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBasicUnaryExpression"


    // $ANTLR start "entryRuleQuestionCall"
    // InternalQL.g:1359:1: entryRuleQuestionCall returns [EObject current=null] : iv_ruleQuestionCall= ruleQuestionCall EOF ;
    public final EObject entryRuleQuestionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionCall = null;


        try {
            // InternalQL.g:1359:53: (iv_ruleQuestionCall= ruleQuestionCall EOF )
            // InternalQL.g:1360:2: iv_ruleQuestionCall= ruleQuestionCall EOF
            {
             newCompositeNode(grammarAccess.getQuestionCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuestionCall=ruleQuestionCall();

            state._fsp--;

             current =iv_ruleQuestionCall; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuestionCall"


    // $ANTLR start "ruleQuestionCall"
    // InternalQL.g:1366:1: ruleQuestionCall returns [EObject current=null] : (otherlv_0= 'QuestionCall' otherlv_1= '{' (otherlv_2= 'resultType' ( ( ruleEString ) ) )? otherlv_4= 'question' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleQuestionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalQL.g:1372:2: ( (otherlv_0= 'QuestionCall' otherlv_1= '{' (otherlv_2= 'resultType' ( ( ruleEString ) ) )? otherlv_4= 'question' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalQL.g:1373:2: (otherlv_0= 'QuestionCall' otherlv_1= '{' (otherlv_2= 'resultType' ( ( ruleEString ) ) )? otherlv_4= 'question' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalQL.g:1373:2: (otherlv_0= 'QuestionCall' otherlv_1= '{' (otherlv_2= 'resultType' ( ( ruleEString ) ) )? otherlv_4= 'question' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalQL.g:1374:3: otherlv_0= 'QuestionCall' otherlv_1= '{' (otherlv_2= 'resultType' ( ( ruleEString ) ) )? otherlv_4= 'question' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getQuestionCallAccess().getQuestionCallKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getQuestionCallAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalQL.g:1382:3: (otherlv_2= 'resultType' ( ( ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalQL.g:1383:4: otherlv_2= 'resultType' ( ( ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getQuestionCallAccess().getResultTypeKeyword_2_0());
                    			
                    // InternalQL.g:1387:4: ( ( ruleEString ) )
                    // InternalQL.g:1388:5: ( ruleEString )
                    {
                    // InternalQL.g:1388:5: ( ruleEString )
                    // InternalQL.g:1389:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQuestionCallRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getQuestionCallAccess().getResultTypeValueTypeCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,43,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getQuestionCallAccess().getQuestionKeyword_3());
            		
            // InternalQL.g:1408:3: ( ( ruleEString ) )
            // InternalQL.g:1409:4: ( ruleEString )
            {
            // InternalQL.g:1409:4: ( ruleEString )
            // InternalQL.g:1410:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuestionCallRule());
            					}
            				

            					newCompositeNode(grammarAccess.getQuestionCallAccess().getQuestionQuestionDefinitionCrossReference_4_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getQuestionCallAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuestionCall"


    // $ANTLR start "entryRuleBooleanValueType"
    // InternalQL.g:1432:1: entryRuleBooleanValueType returns [EObject current=null] : iv_ruleBooleanValueType= ruleBooleanValueType EOF ;
    public final EObject entryRuleBooleanValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValueType = null;


        try {
            // InternalQL.g:1432:57: (iv_ruleBooleanValueType= ruleBooleanValueType EOF )
            // InternalQL.g:1433:2: iv_ruleBooleanValueType= ruleBooleanValueType EOF
            {
             newCompositeNode(grammarAccess.getBooleanValueTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanValueType=ruleBooleanValueType();

            state._fsp--;

             current =iv_ruleBooleanValueType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanValueType"


    // $ANTLR start "ruleBooleanValueType"
    // InternalQL.g:1439:1: ruleBooleanValueType returns [EObject current=null] : ( () otherlv_1= 'BooleanValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleBooleanValueType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_unit_5_0 = null;



        	enterRule();

        try {
            // InternalQL.g:1445:2: ( ( () otherlv_1= 'BooleanValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalQL.g:1446:2: ( () otherlv_1= 'BooleanValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalQL.g:1446:2: ( () otherlv_1= 'BooleanValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalQL.g:1447:3: () otherlv_1= 'BooleanValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalQL.g:1447:3: ()
            // InternalQL.g:1448:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanValueTypeAccess().getBooleanValueTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getBooleanValueTypeAccess().getBooleanValueTypeKeyword_1());
            		
            // InternalQL.g:1458:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQL.g:1459:4: (lv_name_2_0= ruleEString )
            {
            // InternalQL.g:1459:4: (lv_name_2_0= ruleEString )
            // InternalQL.g:1460:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBooleanValueTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanValueTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.gemoc.ql.QL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getBooleanValueTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQL.g:1481:3: (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==32) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalQL.g:1482:4: otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getBooleanValueTypeAccess().getUnitKeyword_4_0());
                    			
                    // InternalQL.g:1486:4: ( (lv_unit_5_0= ruleEString ) )
                    // InternalQL.g:1487:5: (lv_unit_5_0= ruleEString )
                    {
                    // InternalQL.g:1487:5: (lv_unit_5_0= ruleEString )
                    // InternalQL.g:1488:6: lv_unit_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBooleanValueTypeAccess().getUnitEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_unit_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBooleanValueTypeRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_5_0,
                    							"org.gemoc.ql.QL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getBooleanValueTypeAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanValueType"


    // $ANTLR start "entryRuleIntegerValueType"
    // InternalQL.g:1514:1: entryRuleIntegerValueType returns [EObject current=null] : iv_ruleIntegerValueType= ruleIntegerValueType EOF ;
    public final EObject entryRuleIntegerValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValueType = null;


        try {
            // InternalQL.g:1514:57: (iv_ruleIntegerValueType= ruleIntegerValueType EOF )
            // InternalQL.g:1515:2: iv_ruleIntegerValueType= ruleIntegerValueType EOF
            {
             newCompositeNode(grammarAccess.getIntegerValueTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerValueType=ruleIntegerValueType();

            state._fsp--;

             current =iv_ruleIntegerValueType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerValueType"


    // $ANTLR start "ruleIntegerValueType"
    // InternalQL.g:1521:1: ruleIntegerValueType returns [EObject current=null] : ( () otherlv_1= 'IntegerValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )? (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleIntegerValueType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_unit_5_0 = null;

        AntlrDatatypeRuleToken lv_min_7_0 = null;

        AntlrDatatypeRuleToken lv_max_9_0 = null;



        	enterRule();

        try {
            // InternalQL.g:1527:2: ( ( () otherlv_1= 'IntegerValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )? (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )? otherlv_10= '}' ) )
            // InternalQL.g:1528:2: ( () otherlv_1= 'IntegerValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )? (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )? otherlv_10= '}' )
            {
            // InternalQL.g:1528:2: ( () otherlv_1= 'IntegerValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )? (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )? otherlv_10= '}' )
            // InternalQL.g:1529:3: () otherlv_1= 'IntegerValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )? (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )? otherlv_10= '}'
            {
            // InternalQL.g:1529:3: ()
            // InternalQL.g:1530:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerValueTypeAccess().getIntegerValueTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getIntegerValueTypeAccess().getIntegerValueTypeKeyword_1());
            		
            // InternalQL.g:1540:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQL.g:1541:4: (lv_name_2_0= ruleEString )
            {
            // InternalQL.g:1541:4: (lv_name_2_0= ruleEString )
            // InternalQL.g:1542:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIntegerValueTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntegerValueTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.gemoc.ql.QL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_41); 

            			newLeafNode(otherlv_3, grammarAccess.getIntegerValueTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQL.g:1563:3: (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==32) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalQL.g:1564:4: otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getIntegerValueTypeAccess().getUnitKeyword_4_0());
                    			
                    // InternalQL.g:1568:4: ( (lv_unit_5_0= ruleEString ) )
                    // InternalQL.g:1569:5: (lv_unit_5_0= ruleEString )
                    {
                    // InternalQL.g:1569:5: (lv_unit_5_0= ruleEString )
                    // InternalQL.g:1570:6: lv_unit_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIntegerValueTypeAccess().getUnitEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_unit_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntegerValueTypeRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_5_0,
                    							"org.gemoc.ql.QL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQL.g:1588:3: (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==46) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalQL.g:1589:4: otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,46,FOLLOW_43); 

                    				newLeafNode(otherlv_6, grammarAccess.getIntegerValueTypeAccess().getMinKeyword_5_0());
                    			
                    // InternalQL.g:1593:4: ( (lv_min_7_0= ruleEInt ) )
                    // InternalQL.g:1594:5: (lv_min_7_0= ruleEInt )
                    {
                    // InternalQL.g:1594:5: (lv_min_7_0= ruleEInt )
                    // InternalQL.g:1595:6: lv_min_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getIntegerValueTypeAccess().getMinEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_min_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntegerValueTypeRule());
                    						}
                    						set(
                    							current,
                    							"min",
                    							lv_min_7_0,
                    							"org.gemoc.ql.QL.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQL.g:1613:3: (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==47) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalQL.g:1614:4: otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,47,FOLLOW_43); 

                    				newLeafNode(otherlv_8, grammarAccess.getIntegerValueTypeAccess().getMaxKeyword_6_0());
                    			
                    // InternalQL.g:1618:4: ( (lv_max_9_0= ruleEInt ) )
                    // InternalQL.g:1619:5: (lv_max_9_0= ruleEInt )
                    {
                    // InternalQL.g:1619:5: (lv_max_9_0= ruleEInt )
                    // InternalQL.g:1620:6: lv_max_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getIntegerValueTypeAccess().getMaxEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_max_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntegerValueTypeRule());
                    						}
                    						set(
                    							current,
                    							"max",
                    							lv_max_9_0,
                    							"org.gemoc.ql.QL.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getIntegerValueTypeAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerValueType"


    // $ANTLR start "entryRuleDecimalValueType"
    // InternalQL.g:1646:1: entryRuleDecimalValueType returns [EObject current=null] : iv_ruleDecimalValueType= ruleDecimalValueType EOF ;
    public final EObject entryRuleDecimalValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalValueType = null;


        try {
            // InternalQL.g:1646:57: (iv_ruleDecimalValueType= ruleDecimalValueType EOF )
            // InternalQL.g:1647:2: iv_ruleDecimalValueType= ruleDecimalValueType EOF
            {
             newCompositeNode(grammarAccess.getDecimalValueTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecimalValueType=ruleDecimalValueType();

            state._fsp--;

             current =iv_ruleDecimalValueType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDecimalValueType"


    // $ANTLR start "ruleDecimalValueType"
    // InternalQL.g:1653:1: ruleDecimalValueType returns [EObject current=null] : ( () otherlv_1= 'DecimalValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleDecimalValueType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_unit_5_0 = null;



        	enterRule();

        try {
            // InternalQL.g:1659:2: ( ( () otherlv_1= 'DecimalValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalQL.g:1660:2: ( () otherlv_1= 'DecimalValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalQL.g:1660:2: ( () otherlv_1= 'DecimalValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalQL.g:1661:3: () otherlv_1= 'DecimalValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalQL.g:1661:3: ()
            // InternalQL.g:1662:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDecimalValueTypeAccess().getDecimalValueTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getDecimalValueTypeAccess().getDecimalValueTypeKeyword_1());
            		
            // InternalQL.g:1672:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQL.g:1673:4: (lv_name_2_0= ruleEString )
            {
            // InternalQL.g:1673:4: (lv_name_2_0= ruleEString )
            // InternalQL.g:1674:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDecimalValueTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDecimalValueTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.gemoc.ql.QL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getDecimalValueTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQL.g:1695:3: (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==32) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalQL.g:1696:4: otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getDecimalValueTypeAccess().getUnitKeyword_4_0());
                    			
                    // InternalQL.g:1700:4: ( (lv_unit_5_0= ruleEString ) )
                    // InternalQL.g:1701:5: (lv_unit_5_0= ruleEString )
                    {
                    // InternalQL.g:1701:5: (lv_unit_5_0= ruleEString )
                    // InternalQL.g:1702:6: lv_unit_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDecimalValueTypeAccess().getUnitEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_unit_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDecimalValueTypeRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_5_0,
                    							"org.gemoc.ql.QL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDecimalValueTypeAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDecimalValueType"


    // $ANTLR start "entryRuleDateValueType"
    // InternalQL.g:1728:1: entryRuleDateValueType returns [EObject current=null] : iv_ruleDateValueType= ruleDateValueType EOF ;
    public final EObject entryRuleDateValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateValueType = null;


        try {
            // InternalQL.g:1728:54: (iv_ruleDateValueType= ruleDateValueType EOF )
            // InternalQL.g:1729:2: iv_ruleDateValueType= ruleDateValueType EOF
            {
             newCompositeNode(grammarAccess.getDateValueTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDateValueType=ruleDateValueType();

            state._fsp--;

             current =iv_ruleDateValueType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDateValueType"


    // $ANTLR start "ruleDateValueType"
    // InternalQL.g:1735:1: ruleDateValueType returns [EObject current=null] : ( () otherlv_1= 'DateValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleDateValueType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_unit_5_0 = null;



        	enterRule();

        try {
            // InternalQL.g:1741:2: ( ( () otherlv_1= 'DateValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalQL.g:1742:2: ( () otherlv_1= 'DateValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalQL.g:1742:2: ( () otherlv_1= 'DateValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalQL.g:1743:3: () otherlv_1= 'DateValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalQL.g:1743:3: ()
            // InternalQL.g:1744:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDateValueTypeAccess().getDateValueTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getDateValueTypeAccess().getDateValueTypeKeyword_1());
            		
            // InternalQL.g:1754:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQL.g:1755:4: (lv_name_2_0= ruleEString )
            {
            // InternalQL.g:1755:4: (lv_name_2_0= ruleEString )
            // InternalQL.g:1756:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDateValueTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDateValueTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.gemoc.ql.QL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getDateValueTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQL.g:1777:3: (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==32) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalQL.g:1778:4: otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getDateValueTypeAccess().getUnitKeyword_4_0());
                    			
                    // InternalQL.g:1782:4: ( (lv_unit_5_0= ruleEString ) )
                    // InternalQL.g:1783:5: (lv_unit_5_0= ruleEString )
                    {
                    // InternalQL.g:1783:5: (lv_unit_5_0= ruleEString )
                    // InternalQL.g:1784:6: lv_unit_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDateValueTypeAccess().getUnitEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_unit_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDateValueTypeRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_5_0,
                    							"org.gemoc.ql.QL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDateValueTypeAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDateValueType"


    // $ANTLR start "entryRuleEnumerationValueType"
    // InternalQL.g:1810:1: entryRuleEnumerationValueType returns [EObject current=null] : iv_ruleEnumerationValueType= ruleEnumerationValueType EOF ;
    public final EObject entryRuleEnumerationValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationValueType = null;


        try {
            // InternalQL.g:1810:61: (iv_ruleEnumerationValueType= ruleEnumerationValueType EOF )
            // InternalQL.g:1811:2: iv_ruleEnumerationValueType= ruleEnumerationValueType EOF
            {
             newCompositeNode(grammarAccess.getEnumerationValueTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumerationValueType=ruleEnumerationValueType();

            state._fsp--;

             current =iv_ruleEnumerationValueType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumerationValueType"


    // $ANTLR start "ruleEnumerationValueType"
    // InternalQL.g:1817:1: ruleEnumerationValueType returns [EObject current=null] : ( () otherlv_1= 'EnumerationValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'enumerationLiterals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleEnumerationValueType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_unit_5_0 = null;

        EObject lv_enumerationLiterals_8_0 = null;

        EObject lv_enumerationLiterals_10_0 = null;



        	enterRule();

        try {
            // InternalQL.g:1823:2: ( ( () otherlv_1= 'EnumerationValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'enumerationLiterals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalQL.g:1824:2: ( () otherlv_1= 'EnumerationValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'enumerationLiterals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalQL.g:1824:2: ( () otherlv_1= 'EnumerationValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'enumerationLiterals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalQL.g:1825:3: () otherlv_1= 'EnumerationValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'enumerationLiterals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalQL.g:1825:3: ()
            // InternalQL.g:1826:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnumerationValueTypeAccess().getEnumerationValueTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,50,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumerationValueTypeAccess().getEnumerationValueTypeKeyword_1());
            		
            // InternalQL.g:1836:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQL.g:1837:4: (lv_name_2_0= ruleEString )
            {
            // InternalQL.g:1837:4: (lv_name_2_0= ruleEString )
            // InternalQL.g:1838:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnumerationValueTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerationValueTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.gemoc.ql.QL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_45); 

            			newLeafNode(otherlv_3, grammarAccess.getEnumerationValueTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQL.g:1859:3: (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==32) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalQL.g:1860:4: otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getEnumerationValueTypeAccess().getUnitKeyword_4_0());
                    			
                    // InternalQL.g:1864:4: ( (lv_unit_5_0= ruleEString ) )
                    // InternalQL.g:1865:5: (lv_unit_5_0= ruleEString )
                    {
                    // InternalQL.g:1865:5: (lv_unit_5_0= ruleEString )
                    // InternalQL.g:1866:6: lv_unit_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEnumerationValueTypeAccess().getUnitEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_46);
                    lv_unit_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnumerationValueTypeRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_5_0,
                    							"org.gemoc.ql.QL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQL.g:1884:3: (otherlv_6= 'enumerationLiterals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==51) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalQL.g:1885:4: otherlv_6= 'enumerationLiterals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,51,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,13,FOLLOW_47); 

                    				newLeafNode(otherlv_7, grammarAccess.getEnumerationValueTypeAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalQL.g:1893:4: ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) )
                    // InternalQL.g:1894:5: (lv_enumerationLiterals_8_0= ruleEnumerationLiteral )
                    {
                    // InternalQL.g:1894:5: (lv_enumerationLiterals_8_0= ruleEnumerationLiteral )
                    // InternalQL.g:1895:6: lv_enumerationLiterals_8_0= ruleEnumerationLiteral
                    {

                    						newCompositeNode(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_enumerationLiterals_8_0=ruleEnumerationLiteral();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnumerationValueTypeRule());
                    						}
                    						add(
                    							current,
                    							"enumerationLiterals",
                    							lv_enumerationLiterals_8_0,
                    							"org.gemoc.ql.QL.EnumerationLiteral");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQL.g:1912:4: (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==16) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalQL.g:1913:5: otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) )
                    	    {
                    	    otherlv_9=(Token)match(input,16,FOLLOW_47); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getEnumerationValueTypeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalQL.g:1917:5: ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) )
                    	    // InternalQL.g:1918:6: (lv_enumerationLiterals_10_0= ruleEnumerationLiteral )
                    	    {
                    	    // InternalQL.g:1918:6: (lv_enumerationLiterals_10_0= ruleEnumerationLiteral )
                    	    // InternalQL.g:1919:7: lv_enumerationLiterals_10_0= ruleEnumerationLiteral
                    	    {

                    	    							newCompositeNode(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_enumerationLiterals_10_0=ruleEnumerationLiteral();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEnumerationValueTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"enumerationLiterals",
                    	    								lv_enumerationLiterals_10_0,
                    	    								"org.gemoc.ql.QL.EnumerationLiteral");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_11, grammarAccess.getEnumerationValueTypeAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getEnumerationValueTypeAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumerationValueType"


    // $ANTLR start "entryRuleStringValueType"
    // InternalQL.g:1950:1: entryRuleStringValueType returns [EObject current=null] : iv_ruleStringValueType= ruleStringValueType EOF ;
    public final EObject entryRuleStringValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValueType = null;


        try {
            // InternalQL.g:1950:56: (iv_ruleStringValueType= ruleStringValueType EOF )
            // InternalQL.g:1951:2: iv_ruleStringValueType= ruleStringValueType EOF
            {
             newCompositeNode(grammarAccess.getStringValueTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringValueType=ruleStringValueType();

            state._fsp--;

             current =iv_ruleStringValueType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringValueType"


    // $ANTLR start "ruleStringValueType"
    // InternalQL.g:1957:1: ruleStringValueType returns [EObject current=null] : ( () otherlv_1= 'StringValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleStringValueType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_unit_5_0 = null;



        	enterRule();

        try {
            // InternalQL.g:1963:2: ( ( () otherlv_1= 'StringValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalQL.g:1964:2: ( () otherlv_1= 'StringValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalQL.g:1964:2: ( () otherlv_1= 'StringValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalQL.g:1965:3: () otherlv_1= 'StringValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalQL.g:1965:3: ()
            // InternalQL.g:1966:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringValueTypeAccess().getStringValueTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getStringValueTypeAccess().getStringValueTypeKeyword_1());
            		
            // InternalQL.g:1976:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQL.g:1977:4: (lv_name_2_0= ruleEString )
            {
            // InternalQL.g:1977:4: (lv_name_2_0= ruleEString )
            // InternalQL.g:1978:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStringValueTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStringValueTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.gemoc.ql.QL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getStringValueTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQL.g:1999:3: (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==32) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalQL.g:2000:4: otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getStringValueTypeAccess().getUnitKeyword_4_0());
                    			
                    // InternalQL.g:2004:4: ( (lv_unit_5_0= ruleEString ) )
                    // InternalQL.g:2005:5: (lv_unit_5_0= ruleEString )
                    {
                    // InternalQL.g:2005:5: (lv_unit_5_0= ruleEString )
                    // InternalQL.g:2006:6: lv_unit_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getStringValueTypeAccess().getUnitEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_unit_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStringValueTypeRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_5_0,
                    							"org.gemoc.ql.QL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getStringValueTypeAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringValueType"


    // $ANTLR start "entryRuleEInt"
    // InternalQL.g:2032:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalQL.g:2032:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalQL.g:2033:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalQL.g:2039:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalQL.g:2045:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalQL.g:2046:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalQL.g:2046:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalQL.g:2047:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalQL.g:2047:3: (kw= '-' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==53) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalQL.g:2048:4: kw= '-'
                    {
                    kw=(Token)match(input,53,FOLLOW_48); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEnumerationLiteral"
    // InternalQL.g:2065:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteral = null;


        try {
            // InternalQL.g:2065:59: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // InternalQL.g:2066:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
            {
             newCompositeNode(grammarAccess.getEnumerationLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumerationLiteral=ruleEnumerationLiteral();

            state._fsp--;

             current =iv_ruleEnumerationLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumerationLiteral"


    // $ANTLR start "ruleEnumerationLiteral"
    // InternalQL.g:2072:1: ruleEnumerationLiteral returns [EObject current=null] : ( () otherlv_1= 'EnumerationLiteral' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalQL.g:2078:2: ( ( () otherlv_1= 'EnumerationLiteral' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalQL.g:2079:2: ( () otherlv_1= 'EnumerationLiteral' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalQL.g:2079:2: ( () otherlv_1= 'EnumerationLiteral' ( (lv_name_2_0= ruleEString ) ) )
            // InternalQL.g:2080:3: () otherlv_1= 'EnumerationLiteral' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalQL.g:2080:3: ()
            // InternalQL.g:2081:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnumerationLiteralAccess().getEnumerationLiteralAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,54,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumerationLiteralAccess().getEnumerationLiteralKeyword_1());
            		
            // InternalQL.g:2091:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQL.g:2092:4: (lv_name_2_0= ruleEString )
            {
            // InternalQL.g:2092:4: (lv_name_2_0= ruleEString )
            // InternalQL.g:2093:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnumerationLiteralAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerationLiteralRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.gemoc.ql.QL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumerationLiteral"


    // $ANTLR start "entryRuleIntegerValue"
    // InternalQL.g:2114:1: entryRuleIntegerValue returns [EObject current=null] : iv_ruleIntegerValue= ruleIntegerValue EOF ;
    public final EObject entryRuleIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValue = null;


        try {
            // InternalQL.g:2114:53: (iv_ruleIntegerValue= ruleIntegerValue EOF )
            // InternalQL.g:2115:2: iv_ruleIntegerValue= ruleIntegerValue EOF
            {
             newCompositeNode(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerValue=ruleIntegerValue();

            state._fsp--;

             current =iv_ruleIntegerValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerValue"


    // $ANTLR start "ruleIntegerValue"
    // InternalQL.g:2121:1: ruleIntegerValue returns [EObject current=null] : ( () otherlv_1= 'IntegerValue' otherlv_2= '{' (otherlv_3= 'intValue' ( (lv_intValue_4_0= ruleEInt ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleIntegerValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_intValue_4_0 = null;



        	enterRule();

        try {
            // InternalQL.g:2127:2: ( ( () otherlv_1= 'IntegerValue' otherlv_2= '{' (otherlv_3= 'intValue' ( (lv_intValue_4_0= ruleEInt ) ) )? otherlv_5= '}' ) )
            // InternalQL.g:2128:2: ( () otherlv_1= 'IntegerValue' otherlv_2= '{' (otherlv_3= 'intValue' ( (lv_intValue_4_0= ruleEInt ) ) )? otherlv_5= '}' )
            {
            // InternalQL.g:2128:2: ( () otherlv_1= 'IntegerValue' otherlv_2= '{' (otherlv_3= 'intValue' ( (lv_intValue_4_0= ruleEInt ) ) )? otherlv_5= '}' )
            // InternalQL.g:2129:3: () otherlv_1= 'IntegerValue' otherlv_2= '{' (otherlv_3= 'intValue' ( (lv_intValue_4_0= ruleEInt ) ) )? otherlv_5= '}'
            {
            // InternalQL.g:2129:3: ()
            // InternalQL.g:2130:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerValueAccess().getIntegerValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,55,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getIntegerValueAccess().getIntegerValueKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_49); 

            			newLeafNode(otherlv_2, grammarAccess.getIntegerValueAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQL.g:2144:3: (otherlv_3= 'intValue' ( (lv_intValue_4_0= ruleEInt ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==56) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalQL.g:2145:4: otherlv_3= 'intValue' ( (lv_intValue_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,56,FOLLOW_43); 

                    				newLeafNode(otherlv_3, grammarAccess.getIntegerValueAccess().getIntValueKeyword_3_0());
                    			
                    // InternalQL.g:2149:4: ( (lv_intValue_4_0= ruleEInt ) )
                    // InternalQL.g:2150:5: (lv_intValue_4_0= ruleEInt )
                    {
                    // InternalQL.g:2150:5: (lv_intValue_4_0= ruleEInt )
                    // InternalQL.g:2151:6: lv_intValue_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getIntegerValueAccess().getIntValueEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_intValue_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntegerValueRule());
                    						}
                    						set(
                    							current,
                    							"intValue",
                    							lv_intValue_4_0,
                    							"org.gemoc.ql.QL.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getIntegerValueAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalQL.g:2177:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalQL.g:2177:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalQL.g:2178:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalQL.g:2184:1: ruleStringValue returns [EObject current=null] : ( () otherlv_1= 'StringValue' otherlv_2= '{' (otherlv_3= 'stringValue' ( (lv_stringValue_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_stringValue_4_0 = null;



        	enterRule();

        try {
            // InternalQL.g:2190:2: ( ( () otherlv_1= 'StringValue' otherlv_2= '{' (otherlv_3= 'stringValue' ( (lv_stringValue_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalQL.g:2191:2: ( () otherlv_1= 'StringValue' otherlv_2= '{' (otherlv_3= 'stringValue' ( (lv_stringValue_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalQL.g:2191:2: ( () otherlv_1= 'StringValue' otherlv_2= '{' (otherlv_3= 'stringValue' ( (lv_stringValue_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalQL.g:2192:3: () otherlv_1= 'StringValue' otherlv_2= '{' (otherlv_3= 'stringValue' ( (lv_stringValue_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalQL.g:2192:3: ()
            // InternalQL.g:2193:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringValueAccess().getStringValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,57,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getStringValueAccess().getStringValueKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_50); 

            			newLeafNode(otherlv_2, grammarAccess.getStringValueAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQL.g:2207:3: (otherlv_3= 'stringValue' ( (lv_stringValue_4_0= ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==58) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalQL.g:2208:4: otherlv_3= 'stringValue' ( (lv_stringValue_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,58,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getStringValueAccess().getStringValueKeyword_3_0());
                    			
                    // InternalQL.g:2212:4: ( (lv_stringValue_4_0= ruleEString ) )
                    // InternalQL.g:2213:5: (lv_stringValue_4_0= ruleEString )
                    {
                    // InternalQL.g:2213:5: (lv_stringValue_4_0= ruleEString )
                    // InternalQL.g:2214:6: lv_stringValue_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getStringValueAccess().getStringValueEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_stringValue_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStringValueRule());
                    						}
                    						set(
                    							current,
                    							"stringValue",
                    							lv_stringValue_4_0,
                    							"org.gemoc.ql.QL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getStringValueAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalQL.g:2240:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalQL.g:2240:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalQL.g:2241:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             newCompositeNode(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;

             current =iv_ruleBooleanValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalQL.g:2247:1: ruleBooleanValue returns [EObject current=null] : ( () ( (lv_booleanValue_1_0= 'booleanValue' ) )? otherlv_2= 'BooleanValue' ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token lv_booleanValue_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalQL.g:2253:2: ( ( () ( (lv_booleanValue_1_0= 'booleanValue' ) )? otherlv_2= 'BooleanValue' ) )
            // InternalQL.g:2254:2: ( () ( (lv_booleanValue_1_0= 'booleanValue' ) )? otherlv_2= 'BooleanValue' )
            {
            // InternalQL.g:2254:2: ( () ( (lv_booleanValue_1_0= 'booleanValue' ) )? otherlv_2= 'BooleanValue' )
            // InternalQL.g:2255:3: () ( (lv_booleanValue_1_0= 'booleanValue' ) )? otherlv_2= 'BooleanValue'
            {
            // InternalQL.g:2255:3: ()
            // InternalQL.g:2256:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanValueAccess().getBooleanValueAction_0(),
            					current);
            			

            }

            // InternalQL.g:2262:3: ( (lv_booleanValue_1_0= 'booleanValue' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==59) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalQL.g:2263:4: (lv_booleanValue_1_0= 'booleanValue' )
                    {
                    // InternalQL.g:2263:4: (lv_booleanValue_1_0= 'booleanValue' )
                    // InternalQL.g:2264:5: lv_booleanValue_1_0= 'booleanValue'
                    {
                    lv_booleanValue_1_0=(Token)match(input,59,FOLLOW_51); 

                    					newLeafNode(lv_booleanValue_1_0, grammarAccess.getBooleanValueAccess().getBooleanValueBooleanValueKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanValueRule());
                    					}
                    					setWithLastConsumed(current, "booleanValue", lv_booleanValue_1_0 != null, "booleanValue");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,60,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getBooleanValueAccess().getBooleanValueKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleDateValue"
    // InternalQL.g:2284:1: entryRuleDateValue returns [EObject current=null] : iv_ruleDateValue= ruleDateValue EOF ;
    public final EObject entryRuleDateValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateValue = null;


        try {
            // InternalQL.g:2284:50: (iv_ruleDateValue= ruleDateValue EOF )
            // InternalQL.g:2285:2: iv_ruleDateValue= ruleDateValue EOF
            {
             newCompositeNode(grammarAccess.getDateValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDateValue=ruleDateValue();

            state._fsp--;

             current =iv_ruleDateValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDateValue"


    // $ANTLR start "ruleDateValue"
    // InternalQL.g:2291:1: ruleDateValue returns [EObject current=null] : ( () otherlv_1= 'DateValue' otherlv_2= '{' (otherlv_3= 'dateValue' ( (lv_dateValue_4_0= ruleEDate ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleDateValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_dateValue_4_0 = null;



        	enterRule();

        try {
            // InternalQL.g:2297:2: ( ( () otherlv_1= 'DateValue' otherlv_2= '{' (otherlv_3= 'dateValue' ( (lv_dateValue_4_0= ruleEDate ) ) )? otherlv_5= '}' ) )
            // InternalQL.g:2298:2: ( () otherlv_1= 'DateValue' otherlv_2= '{' (otherlv_3= 'dateValue' ( (lv_dateValue_4_0= ruleEDate ) ) )? otherlv_5= '}' )
            {
            // InternalQL.g:2298:2: ( () otherlv_1= 'DateValue' otherlv_2= '{' (otherlv_3= 'dateValue' ( (lv_dateValue_4_0= ruleEDate ) ) )? otherlv_5= '}' )
            // InternalQL.g:2299:3: () otherlv_1= 'DateValue' otherlv_2= '{' (otherlv_3= 'dateValue' ( (lv_dateValue_4_0= ruleEDate ) ) )? otherlv_5= '}'
            {
            // InternalQL.g:2299:3: ()
            // InternalQL.g:2300:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDateValueAccess().getDateValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,61,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDateValueAccess().getDateValueKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_52); 

            			newLeafNode(otherlv_2, grammarAccess.getDateValueAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQL.g:2314:3: (otherlv_3= 'dateValue' ( (lv_dateValue_4_0= ruleEDate ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==62) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalQL.g:2315:4: otherlv_3= 'dateValue' ( (lv_dateValue_4_0= ruleEDate ) )
                    {
                    otherlv_3=(Token)match(input,62,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getDateValueAccess().getDateValueKeyword_3_0());
                    			
                    // InternalQL.g:2319:4: ( (lv_dateValue_4_0= ruleEDate ) )
                    // InternalQL.g:2320:5: (lv_dateValue_4_0= ruleEDate )
                    {
                    // InternalQL.g:2320:5: (lv_dateValue_4_0= ruleEDate )
                    // InternalQL.g:2321:6: lv_dateValue_4_0= ruleEDate
                    {

                    						newCompositeNode(grammarAccess.getDateValueAccess().getDateValueEDateParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_dateValue_4_0=ruleEDate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDateValueRule());
                    						}
                    						set(
                    							current,
                    							"dateValue",
                    							lv_dateValue_4_0,
                    							"org.gemoc.ql.QL.EDate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDateValueAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDateValue"


    // $ANTLR start "entryRuleDecimalValue"
    // InternalQL.g:2347:1: entryRuleDecimalValue returns [EObject current=null] : iv_ruleDecimalValue= ruleDecimalValue EOF ;
    public final EObject entryRuleDecimalValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalValue = null;


        try {
            // InternalQL.g:2347:53: (iv_ruleDecimalValue= ruleDecimalValue EOF )
            // InternalQL.g:2348:2: iv_ruleDecimalValue= ruleDecimalValue EOF
            {
             newCompositeNode(grammarAccess.getDecimalValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecimalValue=ruleDecimalValue();

            state._fsp--;

             current =iv_ruleDecimalValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDecimalValue"


    // $ANTLR start "ruleDecimalValue"
    // InternalQL.g:2354:1: ruleDecimalValue returns [EObject current=null] : ( () otherlv_1= 'DecimalValue' otherlv_2= '{' (otherlv_3= 'decimalValue' ( (lv_decimalValue_4_0= ruleEFloat ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleDecimalValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_decimalValue_4_0 = null;



        	enterRule();

        try {
            // InternalQL.g:2360:2: ( ( () otherlv_1= 'DecimalValue' otherlv_2= '{' (otherlv_3= 'decimalValue' ( (lv_decimalValue_4_0= ruleEFloat ) ) )? otherlv_5= '}' ) )
            // InternalQL.g:2361:2: ( () otherlv_1= 'DecimalValue' otherlv_2= '{' (otherlv_3= 'decimalValue' ( (lv_decimalValue_4_0= ruleEFloat ) ) )? otherlv_5= '}' )
            {
            // InternalQL.g:2361:2: ( () otherlv_1= 'DecimalValue' otherlv_2= '{' (otherlv_3= 'decimalValue' ( (lv_decimalValue_4_0= ruleEFloat ) ) )? otherlv_5= '}' )
            // InternalQL.g:2362:3: () otherlv_1= 'DecimalValue' otherlv_2= '{' (otherlv_3= 'decimalValue' ( (lv_decimalValue_4_0= ruleEFloat ) ) )? otherlv_5= '}'
            {
            // InternalQL.g:2362:3: ()
            // InternalQL.g:2363:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDecimalValueAccess().getDecimalValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,63,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDecimalValueAccess().getDecimalValueKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_53); 

            			newLeafNode(otherlv_2, grammarAccess.getDecimalValueAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQL.g:2377:3: (otherlv_3= 'decimalValue' ( (lv_decimalValue_4_0= ruleEFloat ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==64) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalQL.g:2378:4: otherlv_3= 'decimalValue' ( (lv_decimalValue_4_0= ruleEFloat ) )
                    {
                    otherlv_3=(Token)match(input,64,FOLLOW_54); 

                    				newLeafNode(otherlv_3, grammarAccess.getDecimalValueAccess().getDecimalValueKeyword_3_0());
                    			
                    // InternalQL.g:2382:4: ( (lv_decimalValue_4_0= ruleEFloat ) )
                    // InternalQL.g:2383:5: (lv_decimalValue_4_0= ruleEFloat )
                    {
                    // InternalQL.g:2383:5: (lv_decimalValue_4_0= ruleEFloat )
                    // InternalQL.g:2384:6: lv_decimalValue_4_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getDecimalValueAccess().getDecimalValueEFloatParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_decimalValue_4_0=ruleEFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDecimalValueRule());
                    						}
                    						set(
                    							current,
                    							"decimalValue",
                    							lv_decimalValue_4_0,
                    							"org.gemoc.ql.QL.EFloat");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDecimalValueAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDecimalValue"


    // $ANTLR start "entryRuleEFloat"
    // InternalQL.g:2410:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalQL.g:2410:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalQL.g:2411:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalQL.g:2417:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalQL.g:2423:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalQL.g:2424:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalQL.g:2424:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalQL.g:2425:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalQL.g:2425:3: (kw= '-' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==53) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalQL.g:2426:4: kw= '-'
                    {
                    kw=(Token)match(input,53,FOLLOW_55); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalQL.g:2432:3: (this_INT_1= RULE_INT )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_INT) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalQL.g:2433:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_56); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,65,FOLLOW_48); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_57); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalQL.g:2453:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=66 && LA47_0<=67)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalQL.g:2454:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalQL.g:2454:4: (kw= 'E' | kw= 'e' )
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==66) ) {
                        alt45=1;
                    }
                    else if ( (LA45_0==67) ) {
                        alt45=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 0, input);

                        throw nvae;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalQL.g:2455:5: kw= 'E'
                            {
                            kw=(Token)match(input,66,FOLLOW_43); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalQL.g:2461:5: kw= 'e'
                            {
                            kw=(Token)match(input,67,FOLLOW_43); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalQL.g:2467:4: (kw= '-' )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==53) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalQL.g:2468:5: kw= '-'
                            {
                            kw=(Token)match(input,53,FOLLOW_48); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRuleQuestionDefinition"
    // InternalQL.g:2486:1: entryRuleQuestionDefinition returns [EObject current=null] : iv_ruleQuestionDefinition= ruleQuestionDefinition EOF ;
    public final EObject entryRuleQuestionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionDefinition = null;


        try {
            // InternalQL.g:2486:59: (iv_ruleQuestionDefinition= ruleQuestionDefinition EOF )
            // InternalQL.g:2487:2: iv_ruleQuestionDefinition= ruleQuestionDefinition EOF
            {
             newCompositeNode(grammarAccess.getQuestionDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuestionDefinition=ruleQuestionDefinition();

            state._fsp--;

             current =iv_ruleQuestionDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuestionDefinition"


    // $ANTLR start "ruleQuestionDefinition"
    // InternalQL.g:2493:1: ruleQuestionDefinition returns [EObject current=null] : ( ( (lv_isDisplayed_0_0= 'isDisplayed' ) )? ( (lv_isMandatory_1_0= 'isMandatory' ) )? otherlv_2= 'QuestionDefinition' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'label' ( (lv_label_6_0= ruleEString ) ) )? otherlv_7= 'dataType' ( ( ruleEString ) ) (otherlv_9= 'computedExpression' ( (lv_computedExpression_10_0= ruleExpression ) ) )? (otherlv_11= 'currentValue' ( (lv_currentValue_12_0= ruleValue ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleQuestionDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_isDisplayed_0_0=null;
        Token lv_isMandatory_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_label_6_0 = null;

        EObject lv_computedExpression_10_0 = null;

        EObject lv_currentValue_12_0 = null;



        	enterRule();

        try {
            // InternalQL.g:2499:2: ( ( ( (lv_isDisplayed_0_0= 'isDisplayed' ) )? ( (lv_isMandatory_1_0= 'isMandatory' ) )? otherlv_2= 'QuestionDefinition' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'label' ( (lv_label_6_0= ruleEString ) ) )? otherlv_7= 'dataType' ( ( ruleEString ) ) (otherlv_9= 'computedExpression' ( (lv_computedExpression_10_0= ruleExpression ) ) )? (otherlv_11= 'currentValue' ( (lv_currentValue_12_0= ruleValue ) ) )? otherlv_13= '}' ) )
            // InternalQL.g:2500:2: ( ( (lv_isDisplayed_0_0= 'isDisplayed' ) )? ( (lv_isMandatory_1_0= 'isMandatory' ) )? otherlv_2= 'QuestionDefinition' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'label' ( (lv_label_6_0= ruleEString ) ) )? otherlv_7= 'dataType' ( ( ruleEString ) ) (otherlv_9= 'computedExpression' ( (lv_computedExpression_10_0= ruleExpression ) ) )? (otherlv_11= 'currentValue' ( (lv_currentValue_12_0= ruleValue ) ) )? otherlv_13= '}' )
            {
            // InternalQL.g:2500:2: ( ( (lv_isDisplayed_0_0= 'isDisplayed' ) )? ( (lv_isMandatory_1_0= 'isMandatory' ) )? otherlv_2= 'QuestionDefinition' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'label' ( (lv_label_6_0= ruleEString ) ) )? otherlv_7= 'dataType' ( ( ruleEString ) ) (otherlv_9= 'computedExpression' ( (lv_computedExpression_10_0= ruleExpression ) ) )? (otherlv_11= 'currentValue' ( (lv_currentValue_12_0= ruleValue ) ) )? otherlv_13= '}' )
            // InternalQL.g:2501:3: ( (lv_isDisplayed_0_0= 'isDisplayed' ) )? ( (lv_isMandatory_1_0= 'isMandatory' ) )? otherlv_2= 'QuestionDefinition' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'label' ( (lv_label_6_0= ruleEString ) ) )? otherlv_7= 'dataType' ( ( ruleEString ) ) (otherlv_9= 'computedExpression' ( (lv_computedExpression_10_0= ruleExpression ) ) )? (otherlv_11= 'currentValue' ( (lv_currentValue_12_0= ruleValue ) ) )? otherlv_13= '}'
            {
            // InternalQL.g:2501:3: ( (lv_isDisplayed_0_0= 'isDisplayed' ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==68) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalQL.g:2502:4: (lv_isDisplayed_0_0= 'isDisplayed' )
                    {
                    // InternalQL.g:2502:4: (lv_isDisplayed_0_0= 'isDisplayed' )
                    // InternalQL.g:2503:5: lv_isDisplayed_0_0= 'isDisplayed'
                    {
                    lv_isDisplayed_0_0=(Token)match(input,68,FOLLOW_58); 

                    					newLeafNode(lv_isDisplayed_0_0, grammarAccess.getQuestionDefinitionAccess().getIsDisplayedIsDisplayedKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getQuestionDefinitionRule());
                    					}
                    					setWithLastConsumed(current, "isDisplayed", lv_isDisplayed_0_0 != null, "isDisplayed");
                    				

                    }


                    }
                    break;

            }

            // InternalQL.g:2515:3: ( (lv_isMandatory_1_0= 'isMandatory' ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==69) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalQL.g:2516:4: (lv_isMandatory_1_0= 'isMandatory' )
                    {
                    // InternalQL.g:2516:4: (lv_isMandatory_1_0= 'isMandatory' )
                    // InternalQL.g:2517:5: lv_isMandatory_1_0= 'isMandatory'
                    {
                    lv_isMandatory_1_0=(Token)match(input,69,FOLLOW_59); 

                    					newLeafNode(lv_isMandatory_1_0, grammarAccess.getQuestionDefinitionAccess().getIsMandatoryIsMandatoryKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getQuestionDefinitionRule());
                    					}
                    					setWithLastConsumed(current, "isMandatory", lv_isMandatory_1_0 != null, "isMandatory");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,70,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getQuestionDefinitionAccess().getQuestionDefinitionKeyword_2());
            		
            // InternalQL.g:2533:3: ( (lv_name_3_0= ruleEString ) )
            // InternalQL.g:2534:4: (lv_name_3_0= ruleEString )
            {
            // InternalQL.g:2534:4: (lv_name_3_0= ruleEString )
            // InternalQL.g:2535:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getQuestionDefinitionAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuestionDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.gemoc.ql.QL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_60); 

            			newLeafNode(otherlv_4, grammarAccess.getQuestionDefinitionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalQL.g:2556:3: (otherlv_5= 'label' ( (lv_label_6_0= ruleEString ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==71) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalQL.g:2557:4: otherlv_5= 'label' ( (lv_label_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,71,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getQuestionDefinitionAccess().getLabelKeyword_5_0());
                    			
                    // InternalQL.g:2561:4: ( (lv_label_6_0= ruleEString ) )
                    // InternalQL.g:2562:5: (lv_label_6_0= ruleEString )
                    {
                    // InternalQL.g:2562:5: (lv_label_6_0= ruleEString )
                    // InternalQL.g:2563:6: lv_label_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getQuestionDefinitionAccess().getLabelEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_61);
                    lv_label_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuestionDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"label",
                    							lv_label_6_0,
                    							"org.gemoc.ql.QL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,72,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getQuestionDefinitionAccess().getDataTypeKeyword_6());
            		
            // InternalQL.g:2585:3: ( ( ruleEString ) )
            // InternalQL.g:2586:4: ( ruleEString )
            {
            // InternalQL.g:2586:4: ( ruleEString )
            // InternalQL.g:2587:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuestionDefinitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getQuestionDefinitionAccess().getDataTypeValueTypeCrossReference_7_0());
            				
            pushFollow(FOLLOW_62);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQL.g:2601:3: (otherlv_9= 'computedExpression' ( (lv_computedExpression_10_0= ruleExpression ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==73) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalQL.g:2602:4: otherlv_9= 'computedExpression' ( (lv_computedExpression_10_0= ruleExpression ) )
                    {
                    otherlv_9=(Token)match(input,73,FOLLOW_21); 

                    				newLeafNode(otherlv_9, grammarAccess.getQuestionDefinitionAccess().getComputedExpressionKeyword_8_0());
                    			
                    // InternalQL.g:2606:4: ( (lv_computedExpression_10_0= ruleExpression ) )
                    // InternalQL.g:2607:5: (lv_computedExpression_10_0= ruleExpression )
                    {
                    // InternalQL.g:2607:5: (lv_computedExpression_10_0= ruleExpression )
                    // InternalQL.g:2608:6: lv_computedExpression_10_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getQuestionDefinitionAccess().getComputedExpressionExpressionParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_63);
                    lv_computedExpression_10_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuestionDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"computedExpression",
                    							lv_computedExpression_10_0,
                    							"org.gemoc.ql.QL.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQL.g:2626:3: (otherlv_11= 'currentValue' ( (lv_currentValue_12_0= ruleValue ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==74) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalQL.g:2627:4: otherlv_11= 'currentValue' ( (lv_currentValue_12_0= ruleValue ) )
                    {
                    otherlv_11=(Token)match(input,74,FOLLOW_34); 

                    				newLeafNode(otherlv_11, grammarAccess.getQuestionDefinitionAccess().getCurrentValueKeyword_9_0());
                    			
                    // InternalQL.g:2631:4: ( (lv_currentValue_12_0= ruleValue ) )
                    // InternalQL.g:2632:5: (lv_currentValue_12_0= ruleValue )
                    {
                    // InternalQL.g:2632:5: (lv_currentValue_12_0= ruleValue )
                    // InternalQL.g:2633:6: lv_currentValue_12_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getQuestionDefinitionAccess().getCurrentValueValueParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_currentValue_12_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuestionDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"currentValue",
                    							lv_currentValue_12_0,
                    							"org.gemoc.ql.QL.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getQuestionDefinitionAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuestionDefinition"


    // $ANTLR start "ruleBinaryOperatorKind"
    // InternalQL.g:2659:1: ruleBinaryOperatorKind returns [Enumerator current=null] : ( (enumLiteral_0= 'PLUS' ) | (enumLiteral_1= 'MINUS' ) | (enumLiteral_2= 'MULT' ) | (enumLiteral_3= 'DIV' ) | (enumLiteral_4= 'EQUAL' ) | (enumLiteral_5= 'NOTEQUAL' ) | (enumLiteral_6= 'GREATER' ) | (enumLiteral_7= 'LOWER' ) | (enumLiteral_8= 'GREATEROREQUAL' ) | (enumLiteral_9= 'LOWEROREQUAL' ) | (enumLiteral_10= 'AND' ) | (enumLiteral_11= 'OR' ) ) ;
    public final Enumerator ruleBinaryOperatorKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;


        	enterRule();

        try {
            // InternalQL.g:2665:2: ( ( (enumLiteral_0= 'PLUS' ) | (enumLiteral_1= 'MINUS' ) | (enumLiteral_2= 'MULT' ) | (enumLiteral_3= 'DIV' ) | (enumLiteral_4= 'EQUAL' ) | (enumLiteral_5= 'NOTEQUAL' ) | (enumLiteral_6= 'GREATER' ) | (enumLiteral_7= 'LOWER' ) | (enumLiteral_8= 'GREATEROREQUAL' ) | (enumLiteral_9= 'LOWEROREQUAL' ) | (enumLiteral_10= 'AND' ) | (enumLiteral_11= 'OR' ) ) )
            // InternalQL.g:2666:2: ( (enumLiteral_0= 'PLUS' ) | (enumLiteral_1= 'MINUS' ) | (enumLiteral_2= 'MULT' ) | (enumLiteral_3= 'DIV' ) | (enumLiteral_4= 'EQUAL' ) | (enumLiteral_5= 'NOTEQUAL' ) | (enumLiteral_6= 'GREATER' ) | (enumLiteral_7= 'LOWER' ) | (enumLiteral_8= 'GREATEROREQUAL' ) | (enumLiteral_9= 'LOWEROREQUAL' ) | (enumLiteral_10= 'AND' ) | (enumLiteral_11= 'OR' ) )
            {
            // InternalQL.g:2666:2: ( (enumLiteral_0= 'PLUS' ) | (enumLiteral_1= 'MINUS' ) | (enumLiteral_2= 'MULT' ) | (enumLiteral_3= 'DIV' ) | (enumLiteral_4= 'EQUAL' ) | (enumLiteral_5= 'NOTEQUAL' ) | (enumLiteral_6= 'GREATER' ) | (enumLiteral_7= 'LOWER' ) | (enumLiteral_8= 'GREATEROREQUAL' ) | (enumLiteral_9= 'LOWEROREQUAL' ) | (enumLiteral_10= 'AND' ) | (enumLiteral_11= 'OR' ) )
            int alt53=12;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt53=1;
                }
                break;
            case 76:
                {
                alt53=2;
                }
                break;
            case 77:
                {
                alt53=3;
                }
                break;
            case 78:
                {
                alt53=4;
                }
                break;
            case 79:
                {
                alt53=5;
                }
                break;
            case 80:
                {
                alt53=6;
                }
                break;
            case 81:
                {
                alt53=7;
                }
                break;
            case 82:
                {
                alt53=8;
                }
                break;
            case 83:
                {
                alt53=9;
                }
                break;
            case 84:
                {
                alt53=10;
                }
                break;
            case 85:
                {
                alt53=11;
                }
                break;
            case 86:
                {
                alt53=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalQL.g:2667:3: (enumLiteral_0= 'PLUS' )
                    {
                    // InternalQL.g:2667:3: (enumLiteral_0= 'PLUS' )
                    // InternalQL.g:2668:4: enumLiteral_0= 'PLUS'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBinaryOperatorKindAccess().getPLUSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:2675:3: (enumLiteral_1= 'MINUS' )
                    {
                    // InternalQL.g:2675:3: (enumLiteral_1= 'MINUS' )
                    // InternalQL.g:2676:4: enumLiteral_1= 'MINUS'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBinaryOperatorKindAccess().getMINUSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalQL.g:2683:3: (enumLiteral_2= 'MULT' )
                    {
                    // InternalQL.g:2683:3: (enumLiteral_2= 'MULT' )
                    // InternalQL.g:2684:4: enumLiteral_2= 'MULT'
                    {
                    enumLiteral_2=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBinaryOperatorKindAccess().getMULTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalQL.g:2691:3: (enumLiteral_3= 'DIV' )
                    {
                    // InternalQL.g:2691:3: (enumLiteral_3= 'DIV' )
                    // InternalQL.g:2692:4: enumLiteral_3= 'DIV'
                    {
                    enumLiteral_3=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getDIVEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBinaryOperatorKindAccess().getDIVEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalQL.g:2699:3: (enumLiteral_4= 'EQUAL' )
                    {
                    // InternalQL.g:2699:3: (enumLiteral_4= 'EQUAL' )
                    // InternalQL.g:2700:4: enumLiteral_4= 'EQUAL'
                    {
                    enumLiteral_4=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getEQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getBinaryOperatorKindAccess().getEQUALEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalQL.g:2707:3: (enumLiteral_5= 'NOTEQUAL' )
                    {
                    // InternalQL.g:2707:3: (enumLiteral_5= 'NOTEQUAL' )
                    // InternalQL.g:2708:4: enumLiteral_5= 'NOTEQUAL'
                    {
                    enumLiteral_5=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getNOTEQUALEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getBinaryOperatorKindAccess().getNOTEQUALEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalQL.g:2715:3: (enumLiteral_6= 'GREATER' )
                    {
                    // InternalQL.g:2715:3: (enumLiteral_6= 'GREATER' )
                    // InternalQL.g:2716:4: enumLiteral_6= 'GREATER'
                    {
                    enumLiteral_6=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getGREATEREnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getBinaryOperatorKindAccess().getGREATEREnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalQL.g:2723:3: (enumLiteral_7= 'LOWER' )
                    {
                    // InternalQL.g:2723:3: (enumLiteral_7= 'LOWER' )
                    // InternalQL.g:2724:4: enumLiteral_7= 'LOWER'
                    {
                    enumLiteral_7=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getLOWEREnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getBinaryOperatorKindAccess().getLOWEREnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalQL.g:2731:3: (enumLiteral_8= 'GREATEROREQUAL' )
                    {
                    // InternalQL.g:2731:3: (enumLiteral_8= 'GREATEROREQUAL' )
                    // InternalQL.g:2732:4: enumLiteral_8= 'GREATEROREQUAL'
                    {
                    enumLiteral_8=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getBinaryOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalQL.g:2739:3: (enumLiteral_9= 'LOWEROREQUAL' )
                    {
                    // InternalQL.g:2739:3: (enumLiteral_9= 'LOWEROREQUAL' )
                    // InternalQL.g:2740:4: enumLiteral_9= 'LOWEROREQUAL'
                    {
                    enumLiteral_9=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getLOWEROREQUALEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getBinaryOperatorKindAccess().getLOWEROREQUALEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalQL.g:2747:3: (enumLiteral_10= 'AND' )
                    {
                    // InternalQL.g:2747:3: (enumLiteral_10= 'AND' )
                    // InternalQL.g:2748:4: enumLiteral_10= 'AND'
                    {
                    enumLiteral_10=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getANDEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getBinaryOperatorKindAccess().getANDEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalQL.g:2755:3: (enumLiteral_11= 'OR' )
                    {
                    // InternalQL.g:2755:3: (enumLiteral_11= 'OR' )
                    // InternalQL.g:2756:4: enumLiteral_11= 'OR'
                    {
                    enumLiteral_11=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getOREnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getBinaryOperatorKindAccess().getOREnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryOperatorKind"


    // $ANTLR start "ruleUnaryOperatorKind"
    // InternalQL.g:2766:1: ruleUnaryOperatorKind returns [Enumerator current=null] : ( (enumLiteral_0= 'UNARYMINUS' ) | (enumLiteral_1= 'NOT' ) ) ;
    public final Enumerator ruleUnaryOperatorKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalQL.g:2772:2: ( ( (enumLiteral_0= 'UNARYMINUS' ) | (enumLiteral_1= 'NOT' ) ) )
            // InternalQL.g:2773:2: ( (enumLiteral_0= 'UNARYMINUS' ) | (enumLiteral_1= 'NOT' ) )
            {
            // InternalQL.g:2773:2: ( (enumLiteral_0= 'UNARYMINUS' ) | (enumLiteral_1= 'NOT' ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==87) ) {
                alt54=1;
            }
            else if ( (LA54_0==88) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalQL.g:2774:3: (enumLiteral_0= 'UNARYMINUS' )
                    {
                    // InternalQL.g:2774:3: (enumLiteral_0= 'UNARYMINUS' )
                    // InternalQL.g:2775:4: enumLiteral_0= 'UNARYMINUS'
                    {
                    enumLiteral_0=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getUnaryOperatorKindAccess().getUNARYMINUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorKindAccess().getUNARYMINUSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:2782:3: (enumLiteral_1= 'NOT' )
                    {
                    // InternalQL.g:2782:3: (enumLiteral_1= 'NOT' )
                    // InternalQL.g:2783:4: enumLiteral_1= 'NOT'
                    {
                    enumLiteral_1=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getUnaryOperatorKindAccess().getNOTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorKindAccess().getNOTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryOperatorKind"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000006C000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000068000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000C20000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0017300080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000070L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000001C020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000054200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000018020000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100020000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x00000000007FF800L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008800020000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000020000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0xBA80000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020C00000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020800000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000080800000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000C00100020000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000C00000020000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0020000000000040L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000800000020000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0008000100020000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0008000000020000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0100000000020000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0400000000020000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x4000000000020000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000001L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0020000000000040L,0x0000000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000002L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000600L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000400L});

}