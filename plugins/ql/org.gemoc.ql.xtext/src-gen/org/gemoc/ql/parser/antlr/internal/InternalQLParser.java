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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'QLModel'", "'('", "'canSubmit'", "'submitDate'", "')'", "'{'", "'}'", "'Form'", "'definitions'", "'EDate'", "'if'", "'ValueType'", "'unit'", "'BasicBinaryExpression'", "'operator'", "'resultType'", "'lhsOperand'", "'rhsOperand'", "'ConstantCall'", "'value'", "'BasicUnaryExpression'", "'operand'", "'QuestionCall'", "'question'", "'booleanType'", "'integerType'", "'min'", "'max'", "'decimalType'", "'dateType'", "'enumerationType'", "'literals'", "','", "'StringValueType'", "'-'", "'IntegerValue'", "'intValue'", "'StringValue'", "'stringValue'", "'booleanValue'", "'BooleanValue'", "'DateValue'", "'dateValue'", "'DecimalValue'", "'decimalValue'", "'.'", "'E'", "'e'", "'mandatory'", "':'", "'='", "';'", "'PLUS'", "'MINUS'", "'MULT'", "'DIV'", "'EQUAL'", "'NOTEQUAL'", "'GREATER'", "'LOWER'", "'GREATEROREQUAL'", "'LOWEROREQUAL'", "'AND'", "'OR'", "'UNARYMINUS'", "'NOT'"
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
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
    // InternalQL.g:72:1: ruleQLModel returns [EObject current=null] : ( () otherlv_1= 'QLModel' (otherlv_2= '(' ( (lv_canSubmit_3_0= 'canSubmit' ) )? (otherlv_4= 'submitDate' ( (lv_submitDate_5_0= ruleEDate ) ) )? otherlv_6= ')' )? otherlv_7= '{' ( ( (lv_definitionGroup_8_0= ruleDefinitionGroup ) ) | ( (lv_forms_9_0= ruleForm ) ) )* otherlv_10= '}' ) ;
    public final EObject ruleQLModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_canSubmit_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_submitDate_5_0 = null;

        EObject lv_definitionGroup_8_0 = null;

        EObject lv_forms_9_0 = null;



        	enterRule();

        try {
            // InternalQL.g:78:2: ( ( () otherlv_1= 'QLModel' (otherlv_2= '(' ( (lv_canSubmit_3_0= 'canSubmit' ) )? (otherlv_4= 'submitDate' ( (lv_submitDate_5_0= ruleEDate ) ) )? otherlv_6= ')' )? otherlv_7= '{' ( ( (lv_definitionGroup_8_0= ruleDefinitionGroup ) ) | ( (lv_forms_9_0= ruleForm ) ) )* otherlv_10= '}' ) )
            // InternalQL.g:79:2: ( () otherlv_1= 'QLModel' (otherlv_2= '(' ( (lv_canSubmit_3_0= 'canSubmit' ) )? (otherlv_4= 'submitDate' ( (lv_submitDate_5_0= ruleEDate ) ) )? otherlv_6= ')' )? otherlv_7= '{' ( ( (lv_definitionGroup_8_0= ruleDefinitionGroup ) ) | ( (lv_forms_9_0= ruleForm ) ) )* otherlv_10= '}' )
            {
            // InternalQL.g:79:2: ( () otherlv_1= 'QLModel' (otherlv_2= '(' ( (lv_canSubmit_3_0= 'canSubmit' ) )? (otherlv_4= 'submitDate' ( (lv_submitDate_5_0= ruleEDate ) ) )? otherlv_6= ')' )? otherlv_7= '{' ( ( (lv_definitionGroup_8_0= ruleDefinitionGroup ) ) | ( (lv_forms_9_0= ruleForm ) ) )* otherlv_10= '}' )
            // InternalQL.g:80:3: () otherlv_1= 'QLModel' (otherlv_2= '(' ( (lv_canSubmit_3_0= 'canSubmit' ) )? (otherlv_4= 'submitDate' ( (lv_submitDate_5_0= ruleEDate ) ) )? otherlv_6= ')' )? otherlv_7= '{' ( ( (lv_definitionGroup_8_0= ruleDefinitionGroup ) ) | ( (lv_forms_9_0= ruleForm ) ) )* otherlv_10= '}'
            {
            // InternalQL.g:80:3: ()
            // InternalQL.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQLModelAccess().getQLModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getQLModelAccess().getQLModelKeyword_1());
            		
            // InternalQL.g:91:3: (otherlv_2= '(' ( (lv_canSubmit_3_0= 'canSubmit' ) )? (otherlv_4= 'submitDate' ( (lv_submitDate_5_0= ruleEDate ) ) )? otherlv_6= ')' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalQL.g:92:4: otherlv_2= '(' ( (lv_canSubmit_3_0= 'canSubmit' ) )? (otherlv_4= 'submitDate' ( (lv_submitDate_5_0= ruleEDate ) ) )? otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getQLModelAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalQL.g:96:4: ( (lv_canSubmit_3_0= 'canSubmit' ) )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==13) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // InternalQL.g:97:5: (lv_canSubmit_3_0= 'canSubmit' )
                            {
                            // InternalQL.g:97:5: (lv_canSubmit_3_0= 'canSubmit' )
                            // InternalQL.g:98:6: lv_canSubmit_3_0= 'canSubmit'
                            {
                            lv_canSubmit_3_0=(Token)match(input,13,FOLLOW_5); 

                            						newLeafNode(lv_canSubmit_3_0, grammarAccess.getQLModelAccess().getCanSubmitCanSubmitKeyword_2_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getQLModelRule());
                            						}
                            						setWithLastConsumed(current, "canSubmit", lv_canSubmit_3_0 != null, "canSubmit");
                            					

                            }


                            }
                            break;

                    }

                    // InternalQL.g:110:4: (otherlv_4= 'submitDate' ( (lv_submitDate_5_0= ruleEDate ) ) )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==14) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalQL.g:111:5: otherlv_4= 'submitDate' ( (lv_submitDate_5_0= ruleEDate ) )
                            {
                            otherlv_4=(Token)match(input,14,FOLLOW_6); 

                            					newLeafNode(otherlv_4, grammarAccess.getQLModelAccess().getSubmitDateKeyword_2_2_0());
                            				
                            // InternalQL.g:115:5: ( (lv_submitDate_5_0= ruleEDate ) )
                            // InternalQL.g:116:6: (lv_submitDate_5_0= ruleEDate )
                            {
                            // InternalQL.g:116:6: (lv_submitDate_5_0= ruleEDate )
                            // InternalQL.g:117:7: lv_submitDate_5_0= ruleEDate
                            {

                            							newCompositeNode(grammarAccess.getQLModelAccess().getSubmitDateEDateParserRuleCall_2_2_1_0());
                            						
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

                    otherlv_6=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getQLModelAccess().getRightParenthesisKeyword_2_3());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getQLModelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQL.g:144:3: ( ( (lv_definitionGroup_8_0= ruleDefinitionGroup ) ) | ( (lv_forms_9_0= ruleForm ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }
                else if ( (LA4_0==18) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalQL.g:145:4: ( (lv_definitionGroup_8_0= ruleDefinitionGroup ) )
            	    {
            	    // InternalQL.g:145:4: ( (lv_definitionGroup_8_0= ruleDefinitionGroup ) )
            	    // InternalQL.g:146:5: (lv_definitionGroup_8_0= ruleDefinitionGroup )
            	    {
            	    // InternalQL.g:146:5: (lv_definitionGroup_8_0= ruleDefinitionGroup )
            	    // InternalQL.g:147:6: lv_definitionGroup_8_0= ruleDefinitionGroup
            	    {

            	    						newCompositeNode(grammarAccess.getQLModelAccess().getDefinitionGroupDefinitionGroupParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_definitionGroup_8_0=ruleDefinitionGroup();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getQLModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"definitionGroup",
            	    							lv_definitionGroup_8_0,
            	    							"org.gemoc.ql.QL.DefinitionGroup");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalQL.g:165:4: ( (lv_forms_9_0= ruleForm ) )
            	    {
            	    // InternalQL.g:165:4: ( (lv_forms_9_0= ruleForm ) )
            	    // InternalQL.g:166:5: (lv_forms_9_0= ruleForm )
            	    {
            	    // InternalQL.g:166:5: (lv_forms_9_0= ruleForm )
            	    // InternalQL.g:167:6: lv_forms_9_0= ruleForm
            	    {

            	    						newCompositeNode(grammarAccess.getQLModelAccess().getFormsFormParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_forms_9_0=ruleForm();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getQLModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"forms",
            	    							lv_forms_9_0,
            	    							"org.gemoc.ql.QL.Form");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_10=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getQLModelAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalQL.g:193:1: entryRuleValueType returns [EObject current=null] : iv_ruleValueType= ruleValueType EOF ;
    public final EObject entryRuleValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueType = null;


        try {
            // InternalQL.g:193:50: (iv_ruleValueType= ruleValueType EOF )
            // InternalQL.g:194:2: iv_ruleValueType= ruleValueType EOF
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
    // InternalQL.g:200:1: ruleValueType returns [EObject current=null] : (this_ValueType_Impl_0= ruleValueType_Impl | this_BooleanValueType_1= ruleBooleanValueType | this_IntegerValueType_2= ruleIntegerValueType | this_DecimalValueType_3= ruleDecimalValueType | this_DateValueType_4= ruleDateValueType | this_EnumerationValueType_5= ruleEnumerationValueType | this_StringValueType_6= ruleStringValueType ) ;
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
            // InternalQL.g:206:2: ( (this_ValueType_Impl_0= ruleValueType_Impl | this_BooleanValueType_1= ruleBooleanValueType | this_IntegerValueType_2= ruleIntegerValueType | this_DecimalValueType_3= ruleDecimalValueType | this_DateValueType_4= ruleDateValueType | this_EnumerationValueType_5= ruleEnumerationValueType | this_StringValueType_6= ruleStringValueType ) )
            // InternalQL.g:207:2: (this_ValueType_Impl_0= ruleValueType_Impl | this_BooleanValueType_1= ruleBooleanValueType | this_IntegerValueType_2= ruleIntegerValueType | this_DecimalValueType_3= ruleDecimalValueType | this_DateValueType_4= ruleDateValueType | this_EnumerationValueType_5= ruleEnumerationValueType | this_StringValueType_6= ruleStringValueType )
            {
            // InternalQL.g:207:2: (this_ValueType_Impl_0= ruleValueType_Impl | this_BooleanValueType_1= ruleBooleanValueType | this_IntegerValueType_2= ruleIntegerValueType | this_DecimalValueType_3= ruleDecimalValueType | this_DateValueType_4= ruleDateValueType | this_EnumerationValueType_5= ruleEnumerationValueType | this_StringValueType_6= ruleStringValueType )
            int alt5=7;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt5=1;
                }
                break;
            case 35:
                {
                alt5=2;
                }
                break;
            case 36:
                {
                alt5=3;
                }
                break;
            case 39:
                {
                alt5=4;
                }
                break;
            case 40:
                {
                alt5=5;
                }
                break;
            case 41:
                {
                alt5=6;
                }
                break;
            case 44:
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalQL.g:208:3: this_ValueType_Impl_0= ruleValueType_Impl
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
                    // InternalQL.g:217:3: this_BooleanValueType_1= ruleBooleanValueType
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
                    // InternalQL.g:226:3: this_IntegerValueType_2= ruleIntegerValueType
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
                    // InternalQL.g:235:3: this_DecimalValueType_3= ruleDecimalValueType
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
                    // InternalQL.g:244:3: this_DateValueType_4= ruleDateValueType
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
                    // InternalQL.g:253:3: this_EnumerationValueType_5= ruleEnumerationValueType
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
                    // InternalQL.g:262:3: this_StringValueType_6= ruleStringValueType
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
    // InternalQL.g:274:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalQL.g:274:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalQL.g:275:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalQL.g:281:1: ruleExpression returns [EObject current=null] : (this_BasicBinaryExpression_0= ruleBasicBinaryExpression | this_ConstantCall_1= ruleConstantCall | this_BasicUnaryExpression_2= ruleBasicUnaryExpression | this_QuestionCall_3= ruleQuestionCall ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BasicBinaryExpression_0 = null;

        EObject this_ConstantCall_1 = null;

        EObject this_BasicUnaryExpression_2 = null;

        EObject this_QuestionCall_3 = null;



        	enterRule();

        try {
            // InternalQL.g:287:2: ( (this_BasicBinaryExpression_0= ruleBasicBinaryExpression | this_ConstantCall_1= ruleConstantCall | this_BasicUnaryExpression_2= ruleBasicUnaryExpression | this_QuestionCall_3= ruleQuestionCall ) )
            // InternalQL.g:288:2: (this_BasicBinaryExpression_0= ruleBasicBinaryExpression | this_ConstantCall_1= ruleConstantCall | this_BasicUnaryExpression_2= ruleBasicUnaryExpression | this_QuestionCall_3= ruleQuestionCall )
            {
            // InternalQL.g:288:2: (this_BasicBinaryExpression_0= ruleBasicBinaryExpression | this_ConstantCall_1= ruleConstantCall | this_BasicUnaryExpression_2= ruleBasicUnaryExpression | this_QuestionCall_3= ruleQuestionCall )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt6=1;
                }
                break;
            case 29:
                {
                alt6=2;
                }
                break;
            case 31:
                {
                alt6=3;
                }
                break;
            case 33:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalQL.g:289:3: this_BasicBinaryExpression_0= ruleBasicBinaryExpression
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
                    // InternalQL.g:298:3: this_ConstantCall_1= ruleConstantCall
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
                    // InternalQL.g:307:3: this_BasicUnaryExpression_2= ruleBasicUnaryExpression
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
                    // InternalQL.g:316:3: this_QuestionCall_3= ruleQuestionCall
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
    // InternalQL.g:328:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalQL.g:328:46: (iv_ruleValue= ruleValue EOF )
            // InternalQL.g:329:2: iv_ruleValue= ruleValue EOF
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
    // InternalQL.g:335:1: ruleValue returns [EObject current=null] : (this_IntegerValue_0= ruleIntegerValue | this_StringValue_1= ruleStringValue | this_BooleanValue_2= ruleBooleanValue | this_DateValue_3= ruleDateValue | this_DecimalValue_4= ruleDecimalValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerValue_0 = null;

        EObject this_StringValue_1 = null;

        EObject this_BooleanValue_2 = null;

        EObject this_DateValue_3 = null;

        EObject this_DecimalValue_4 = null;



        	enterRule();

        try {
            // InternalQL.g:341:2: ( (this_IntegerValue_0= ruleIntegerValue | this_StringValue_1= ruleStringValue | this_BooleanValue_2= ruleBooleanValue | this_DateValue_3= ruleDateValue | this_DecimalValue_4= ruleDecimalValue ) )
            // InternalQL.g:342:2: (this_IntegerValue_0= ruleIntegerValue | this_StringValue_1= ruleStringValue | this_BooleanValue_2= ruleBooleanValue | this_DateValue_3= ruleDateValue | this_DecimalValue_4= ruleDecimalValue )
            {
            // InternalQL.g:342:2: (this_IntegerValue_0= ruleIntegerValue | this_StringValue_1= ruleStringValue | this_BooleanValue_2= ruleBooleanValue | this_DateValue_3= ruleDateValue | this_DecimalValue_4= ruleDecimalValue )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt7=1;
                }
                break;
            case 48:
                {
                alt7=2;
                }
                break;
            case 50:
            case 51:
                {
                alt7=3;
                }
                break;
            case 52:
                {
                alt7=4;
                }
                break;
            case 54:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalQL.g:343:3: this_IntegerValue_0= ruleIntegerValue
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
                    // InternalQL.g:352:3: this_StringValue_1= ruleStringValue
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
                    // InternalQL.g:361:3: this_BooleanValue_2= ruleBooleanValue
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
                    // InternalQL.g:370:3: this_DateValue_3= ruleDateValue
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
                    // InternalQL.g:379:3: this_DecimalValue_4= ruleDecimalValue
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
    // InternalQL.g:391:1: entryRuleForm returns [EObject current=null] : iv_ruleForm= ruleForm EOF ;
    public final EObject entryRuleForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForm = null;


        try {
            // InternalQL.g:391:45: (iv_ruleForm= ruleForm EOF )
            // InternalQL.g:392:2: iv_ruleForm= ruleForm EOF
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
    // InternalQL.g:398:1: ruleForm returns [EObject current=null] : (otherlv_0= 'Form' ( (lv_name_1_0= ruleEString ) ) ( (lv_questionGroup_2_0= ruleQuestionGroup ) ) ) ;
    public final EObject ruleForm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_questionGroup_2_0 = null;



        	enterRule();

        try {
            // InternalQL.g:404:2: ( (otherlv_0= 'Form' ( (lv_name_1_0= ruleEString ) ) ( (lv_questionGroup_2_0= ruleQuestionGroup ) ) ) )
            // InternalQL.g:405:2: (otherlv_0= 'Form' ( (lv_name_1_0= ruleEString ) ) ( (lv_questionGroup_2_0= ruleQuestionGroup ) ) )
            {
            // InternalQL.g:405:2: (otherlv_0= 'Form' ( (lv_name_1_0= ruleEString ) ) ( (lv_questionGroup_2_0= ruleQuestionGroup ) ) )
            // InternalQL.g:406:3: otherlv_0= 'Form' ( (lv_name_1_0= ruleEString ) ) ( (lv_questionGroup_2_0= ruleQuestionGroup ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getFormAccess().getFormKeyword_0());
            		
            // InternalQL.g:410:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQL.g:411:4: (lv_name_1_0= ruleEString )
            {
            // InternalQL.g:411:4: (lv_name_1_0= ruleEString )
            // InternalQL.g:412:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFormAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
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

            // InternalQL.g:429:3: ( (lv_questionGroup_2_0= ruleQuestionGroup ) )
            // InternalQL.g:430:4: (lv_questionGroup_2_0= ruleQuestionGroup )
            {
            // InternalQL.g:430:4: (lv_questionGroup_2_0= ruleQuestionGroup )
            // InternalQL.g:431:5: lv_questionGroup_2_0= ruleQuestionGroup
            {

            					newCompositeNode(grammarAccess.getFormAccess().getQuestionGroupQuestionGroupParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_questionGroup_2_0=ruleQuestionGroup();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFormRule());
            					}
            					set(
            						current,
            						"questionGroup",
            						lv_questionGroup_2_0,
            						"org.gemoc.ql.QL.QuestionGroup");
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
    // $ANTLR end "ruleForm"


    // $ANTLR start "entryRuleDefinitionGroup"
    // InternalQL.g:452:1: entryRuleDefinitionGroup returns [EObject current=null] : iv_ruleDefinitionGroup= ruleDefinitionGroup EOF ;
    public final EObject entryRuleDefinitionGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionGroup = null;


        try {
            // InternalQL.g:452:56: (iv_ruleDefinitionGroup= ruleDefinitionGroup EOF )
            // InternalQL.g:453:2: iv_ruleDefinitionGroup= ruleDefinitionGroup EOF
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
    // InternalQL.g:459:1: ruleDefinitionGroup returns [EObject current=null] : ( () otherlv_1= 'definitions' otherlv_2= '{' ( ( (lv_questionDefinitions_3_0= ruleQuestionDefinition ) ) | ( (lv_dataTypes_4_0= ruleValueType ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleDefinitionGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_questionDefinitions_3_0 = null;

        EObject lv_dataTypes_4_0 = null;



        	enterRule();

        try {
            // InternalQL.g:465:2: ( ( () otherlv_1= 'definitions' otherlv_2= '{' ( ( (lv_questionDefinitions_3_0= ruleQuestionDefinition ) ) | ( (lv_dataTypes_4_0= ruleValueType ) ) )* otherlv_5= '}' ) )
            // InternalQL.g:466:2: ( () otherlv_1= 'definitions' otherlv_2= '{' ( ( (lv_questionDefinitions_3_0= ruleQuestionDefinition ) ) | ( (lv_dataTypes_4_0= ruleValueType ) ) )* otherlv_5= '}' )
            {
            // InternalQL.g:466:2: ( () otherlv_1= 'definitions' otherlv_2= '{' ( ( (lv_questionDefinitions_3_0= ruleQuestionDefinition ) ) | ( (lv_dataTypes_4_0= ruleValueType ) ) )* otherlv_5= '}' )
            // InternalQL.g:467:3: () otherlv_1= 'definitions' otherlv_2= '{' ( ( (lv_questionDefinitions_3_0= ruleQuestionDefinition ) ) | ( (lv_dataTypes_4_0= ruleValueType ) ) )* otherlv_5= '}'
            {
            // InternalQL.g:467:3: ()
            // InternalQL.g:468:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDefinitionGroupAccess().getDefinitionGroupAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getDefinitionGroupAccess().getDefinitionsKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getDefinitionGroupAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQL.g:482:3: ( ( (lv_questionDefinitions_3_0= ruleQuestionDefinition ) ) | ( (lv_dataTypes_4_0= ruleValueType ) ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==34||LA8_0==59) ) {
                    alt8=1;
                }
                else if ( (LA8_0==22||(LA8_0>=35 && LA8_0<=36)||(LA8_0>=39 && LA8_0<=41)||LA8_0==44) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalQL.g:483:4: ( (lv_questionDefinitions_3_0= ruleQuestionDefinition ) )
            	    {
            	    // InternalQL.g:483:4: ( (lv_questionDefinitions_3_0= ruleQuestionDefinition ) )
            	    // InternalQL.g:484:5: (lv_questionDefinitions_3_0= ruleQuestionDefinition )
            	    {
            	    // InternalQL.g:484:5: (lv_questionDefinitions_3_0= ruleQuestionDefinition )
            	    // InternalQL.g:485:6: lv_questionDefinitions_3_0= ruleQuestionDefinition
            	    {

            	    						newCompositeNode(grammarAccess.getDefinitionGroupAccess().getQuestionDefinitionsQuestionDefinitionParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_questionDefinitions_3_0=ruleQuestionDefinition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDefinitionGroupRule());
            	    						}
            	    						add(
            	    							current,
            	    							"questionDefinitions",
            	    							lv_questionDefinitions_3_0,
            	    							"org.gemoc.ql.QL.QuestionDefinition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalQL.g:503:4: ( (lv_dataTypes_4_0= ruleValueType ) )
            	    {
            	    // InternalQL.g:503:4: ( (lv_dataTypes_4_0= ruleValueType ) )
            	    // InternalQL.g:504:5: (lv_dataTypes_4_0= ruleValueType )
            	    {
            	    // InternalQL.g:504:5: (lv_dataTypes_4_0= ruleValueType )
            	    // InternalQL.g:505:6: lv_dataTypes_4_0= ruleValueType
            	    {

            	    						newCompositeNode(grammarAccess.getDefinitionGroupAccess().getDataTypesValueTypeParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_dataTypes_4_0=ruleValueType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDefinitionGroupRule());
            	    						}
            	    						add(
            	    							current,
            	    							"dataTypes",
            	    							lv_dataTypes_4_0,
            	    							"org.gemoc.ql.QL.ValueType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDefinitionGroupAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalQL.g:531:1: entryRuleEDate returns [String current=null] : iv_ruleEDate= ruleEDate EOF ;
    public final String entryRuleEDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDate = null;


        try {
            // InternalQL.g:531:45: (iv_ruleEDate= ruleEDate EOF )
            // InternalQL.g:532:2: iv_ruleEDate= ruleEDate EOF
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
    // InternalQL.g:538:1: ruleEDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'EDate' ;
    public final AntlrDatatypeRuleToken ruleEDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalQL.g:544:2: (kw= 'EDate' )
            // InternalQL.g:545:2: kw= 'EDate'
            {
            kw=(Token)match(input,20,FOLLOW_2); 

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
    // InternalQL.g:553:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalQL.g:553:47: (iv_ruleEString= ruleEString EOF )
            // InternalQL.g:554:2: iv_ruleEString= ruleEString EOF
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
    // InternalQL.g:560:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalQL.g:566:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalQL.g:567:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalQL.g:567:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalQL.g:568:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalQL.g:576:3: this_ID_1= RULE_ID
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
    // InternalQL.g:587:1: entryRuleQuestionGroup returns [EObject current=null] : iv_ruleQuestionGroup= ruleQuestionGroup EOF ;
    public final EObject entryRuleQuestionGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionGroup = null;


        try {
            // InternalQL.g:587:54: (iv_ruleQuestionGroup= ruleQuestionGroup EOF )
            // InternalQL.g:588:2: iv_ruleQuestionGroup= ruleQuestionGroup EOF
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
    // InternalQL.g:594:1: ruleQuestionGroup returns [EObject current=null] : ( () (otherlv_1= 'if' otherlv_2= '(' ( (lv_guard_3_0= ruleExpression ) ) otherlv_4= ')' )? otherlv_5= '{' ( ( (lv_questionGroups_6_0= ruleQuestionGroup ) ) | ( (lv_questions_7_0= ruleQuestion ) ) )* otherlv_8= '}' ) ;
    public final EObject ruleQuestionGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_guard_3_0 = null;

        EObject lv_questionGroups_6_0 = null;

        EObject lv_questions_7_0 = null;



        	enterRule();

        try {
            // InternalQL.g:600:2: ( ( () (otherlv_1= 'if' otherlv_2= '(' ( (lv_guard_3_0= ruleExpression ) ) otherlv_4= ')' )? otherlv_5= '{' ( ( (lv_questionGroups_6_0= ruleQuestionGroup ) ) | ( (lv_questions_7_0= ruleQuestion ) ) )* otherlv_8= '}' ) )
            // InternalQL.g:601:2: ( () (otherlv_1= 'if' otherlv_2= '(' ( (lv_guard_3_0= ruleExpression ) ) otherlv_4= ')' )? otherlv_5= '{' ( ( (lv_questionGroups_6_0= ruleQuestionGroup ) ) | ( (lv_questions_7_0= ruleQuestion ) ) )* otherlv_8= '}' )
            {
            // InternalQL.g:601:2: ( () (otherlv_1= 'if' otherlv_2= '(' ( (lv_guard_3_0= ruleExpression ) ) otherlv_4= ')' )? otherlv_5= '{' ( ( (lv_questionGroups_6_0= ruleQuestionGroup ) ) | ( (lv_questions_7_0= ruleQuestion ) ) )* otherlv_8= '}' )
            // InternalQL.g:602:3: () (otherlv_1= 'if' otherlv_2= '(' ( (lv_guard_3_0= ruleExpression ) ) otherlv_4= ')' )? otherlv_5= '{' ( ( (lv_questionGroups_6_0= ruleQuestionGroup ) ) | ( (lv_questions_7_0= ruleQuestion ) ) )* otherlv_8= '}'
            {
            // InternalQL.g:602:3: ()
            // InternalQL.g:603:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQuestionGroupAccess().getQuestionGroupAction_0(),
            					current);
            			

            }

            // InternalQL.g:609:3: (otherlv_1= 'if' otherlv_2= '(' ( (lv_guard_3_0= ruleExpression ) ) otherlv_4= ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalQL.g:610:4: otherlv_1= 'if' otherlv_2= '(' ( (lv_guard_3_0= ruleExpression ) ) otherlv_4= ')'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getQuestionGroupAccess().getIfKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getQuestionGroupAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalQL.g:618:4: ( (lv_guard_3_0= ruleExpression ) )
                    // InternalQL.g:619:5: (lv_guard_3_0= ruleExpression )
                    {
                    // InternalQL.g:619:5: (lv_guard_3_0= ruleExpression )
                    // InternalQL.g:620:6: lv_guard_3_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getQuestionGroupAccess().getGuardExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_guard_3_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuestionGroupRule());
                    						}
                    						set(
                    							current,
                    							"guard",
                    							lv_guard_3_0,
                    							"org.gemoc.ql.QL.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getQuestionGroupAccess().getRightParenthesisKeyword_1_3());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getQuestionGroupAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQL.g:646:3: ( ( (lv_questionGroups_6_0= ruleQuestionGroup ) ) | ( (lv_questions_7_0= ruleQuestion ) ) )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16||LA11_0==21) ) {
                    alt11=1;
                }
                else if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalQL.g:647:4: ( (lv_questionGroups_6_0= ruleQuestionGroup ) )
            	    {
            	    // InternalQL.g:647:4: ( (lv_questionGroups_6_0= ruleQuestionGroup ) )
            	    // InternalQL.g:648:5: (lv_questionGroups_6_0= ruleQuestionGroup )
            	    {
            	    // InternalQL.g:648:5: (lv_questionGroups_6_0= ruleQuestionGroup )
            	    // InternalQL.g:649:6: lv_questionGroups_6_0= ruleQuestionGroup
            	    {

            	    						newCompositeNode(grammarAccess.getQuestionGroupAccess().getQuestionGroupsQuestionGroupParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_questionGroups_6_0=ruleQuestionGroup();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getQuestionGroupRule());
            	    						}
            	    						add(
            	    							current,
            	    							"questionGroups",
            	    							lv_questionGroups_6_0,
            	    							"org.gemoc.ql.QL.QuestionGroup");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalQL.g:667:4: ( (lv_questions_7_0= ruleQuestion ) )
            	    {
            	    // InternalQL.g:667:4: ( (lv_questions_7_0= ruleQuestion ) )
            	    // InternalQL.g:668:5: (lv_questions_7_0= ruleQuestion )
            	    {
            	    // InternalQL.g:668:5: (lv_questions_7_0= ruleQuestion )
            	    // InternalQL.g:669:6: lv_questions_7_0= ruleQuestion
            	    {

            	    						newCompositeNode(grammarAccess.getQuestionGroupAccess().getQuestionsQuestionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_questions_7_0=ruleQuestion();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getQuestionGroupRule());
            	    						}
            	    						add(
            	    							current,
            	    							"questions",
            	    							lv_questions_7_0,
            	    							"org.gemoc.ql.QL.Question");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getQuestionGroupAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalQL.g:695:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // InternalQL.g:695:49: (iv_ruleQuestion= ruleQuestion EOF )
            // InternalQL.g:696:2: iv_ruleQuestion= ruleQuestion EOF
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
    // InternalQL.g:702:1: ruleQuestion returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalQL.g:708:2: ( ( ( ruleEString ) ) )
            // InternalQL.g:709:2: ( ( ruleEString ) )
            {
            // InternalQL.g:709:2: ( ( ruleEString ) )
            // InternalQL.g:710:3: ( ruleEString )
            {
            // InternalQL.g:710:3: ( ruleEString )
            // InternalQL.g:711:4: ruleEString
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getQuestionRule());
            				}
            			

            				newCompositeNode(grammarAccess.getQuestionAccess().getQuestionDefinitionQuestionDefinitionCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleValueType_Impl"
    // InternalQL.g:728:1: entryRuleValueType_Impl returns [EObject current=null] : iv_ruleValueType_Impl= ruleValueType_Impl EOF ;
    public final EObject entryRuleValueType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueType_Impl = null;


        try {
            // InternalQL.g:728:55: (iv_ruleValueType_Impl= ruleValueType_Impl EOF )
            // InternalQL.g:729:2: iv_ruleValueType_Impl= ruleValueType_Impl EOF
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
    // InternalQL.g:735:1: ruleValueType_Impl returns [EObject current=null] : ( () otherlv_1= 'ValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
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
            // InternalQL.g:741:2: ( ( () otherlv_1= 'ValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalQL.g:742:2: ( () otherlv_1= 'ValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalQL.g:742:2: ( () otherlv_1= 'ValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalQL.g:743:3: () otherlv_1= 'ValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalQL.g:743:3: ()
            // InternalQL.g:744:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getValueType_ImplAccess().getValueTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getValueType_ImplAccess().getValueTypeKeyword_1());
            		
            // InternalQL.g:754:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQL.g:755:4: (lv_name_2_0= ruleEString )
            {
            // InternalQL.g:755:4: (lv_name_2_0= ruleEString )
            // InternalQL.g:756:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getValueType_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
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

            otherlv_3=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getValueType_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQL.g:777:3: (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalQL.g:778:4: otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getValueType_ImplAccess().getUnitKeyword_4_0());
                    			
                    // InternalQL.g:782:4: ( (lv_unit_5_0= ruleEString ) )
                    // InternalQL.g:783:5: (lv_unit_5_0= ruleEString )
                    {
                    // InternalQL.g:783:5: (lv_unit_5_0= ruleEString )
                    // InternalQL.g:784:6: lv_unit_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getValueType_ImplAccess().getUnitEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
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
    // InternalQL.g:810:1: entryRuleBasicBinaryExpression returns [EObject current=null] : iv_ruleBasicBinaryExpression= ruleBasicBinaryExpression EOF ;
    public final EObject entryRuleBasicBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicBinaryExpression = null;


        try {
            // InternalQL.g:810:62: (iv_ruleBasicBinaryExpression= ruleBasicBinaryExpression EOF )
            // InternalQL.g:811:2: iv_ruleBasicBinaryExpression= ruleBasicBinaryExpression EOF
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
    // InternalQL.g:817:1: ruleBasicBinaryExpression returns [EObject current=null] : (otherlv_0= 'BasicBinaryExpression' otherlv_1= '{' otherlv_2= 'operator' ( (lv_operator_3_0= ruleBinaryOperatorKind ) ) (otherlv_4= 'resultType' ( ( ruleEString ) ) )? otherlv_6= 'lhsOperand' ( (lv_lhsOperand_7_0= ruleExpression ) ) otherlv_8= 'rhsOperand' ( (lv_rhsOperand_9_0= ruleExpression ) ) otherlv_10= '}' ) ;
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
            // InternalQL.g:823:2: ( (otherlv_0= 'BasicBinaryExpression' otherlv_1= '{' otherlv_2= 'operator' ( (lv_operator_3_0= ruleBinaryOperatorKind ) ) (otherlv_4= 'resultType' ( ( ruleEString ) ) )? otherlv_6= 'lhsOperand' ( (lv_lhsOperand_7_0= ruleExpression ) ) otherlv_8= 'rhsOperand' ( (lv_rhsOperand_9_0= ruleExpression ) ) otherlv_10= '}' ) )
            // InternalQL.g:824:2: (otherlv_0= 'BasicBinaryExpression' otherlv_1= '{' otherlv_2= 'operator' ( (lv_operator_3_0= ruleBinaryOperatorKind ) ) (otherlv_4= 'resultType' ( ( ruleEString ) ) )? otherlv_6= 'lhsOperand' ( (lv_lhsOperand_7_0= ruleExpression ) ) otherlv_8= 'rhsOperand' ( (lv_rhsOperand_9_0= ruleExpression ) ) otherlv_10= '}' )
            {
            // InternalQL.g:824:2: (otherlv_0= 'BasicBinaryExpression' otherlv_1= '{' otherlv_2= 'operator' ( (lv_operator_3_0= ruleBinaryOperatorKind ) ) (otherlv_4= 'resultType' ( ( ruleEString ) ) )? otherlv_6= 'lhsOperand' ( (lv_lhsOperand_7_0= ruleExpression ) ) otherlv_8= 'rhsOperand' ( (lv_rhsOperand_9_0= ruleExpression ) ) otherlv_10= '}' )
            // InternalQL.g:825:3: otherlv_0= 'BasicBinaryExpression' otherlv_1= '{' otherlv_2= 'operator' ( (lv_operator_3_0= ruleBinaryOperatorKind ) ) (otherlv_4= 'resultType' ( ( ruleEString ) ) )? otherlv_6= 'lhsOperand' ( (lv_lhsOperand_7_0= ruleExpression ) ) otherlv_8= 'rhsOperand' ( (lv_rhsOperand_9_0= ruleExpression ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getBasicBinaryExpressionAccess().getBasicBinaryExpressionKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getBasicBinaryExpressionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getBasicBinaryExpressionAccess().getOperatorKeyword_2());
            		
            // InternalQL.g:837:3: ( (lv_operator_3_0= ruleBinaryOperatorKind ) )
            // InternalQL.g:838:4: (lv_operator_3_0= ruleBinaryOperatorKind )
            {
            // InternalQL.g:838:4: (lv_operator_3_0= ruleBinaryOperatorKind )
            // InternalQL.g:839:5: lv_operator_3_0= ruleBinaryOperatorKind
            {

            					newCompositeNode(grammarAccess.getBasicBinaryExpressionAccess().getOperatorBinaryOperatorKindEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalQL.g:856:3: (otherlv_4= 'resultType' ( ( ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalQL.g:857:4: otherlv_4= 'resultType' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getBasicBinaryExpressionAccess().getResultTypeKeyword_4_0());
                    			
                    // InternalQL.g:861:4: ( ( ruleEString ) )
                    // InternalQL.g:862:5: ( ruleEString )
                    {
                    // InternalQL.g:862:5: ( ruleEString )
                    // InternalQL.g:863:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBasicBinaryExpressionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBasicBinaryExpressionAccess().getResultTypeValueTypeCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,27,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getBasicBinaryExpressionAccess().getLhsOperandKeyword_5());
            		
            // InternalQL.g:882:3: ( (lv_lhsOperand_7_0= ruleExpression ) )
            // InternalQL.g:883:4: (lv_lhsOperand_7_0= ruleExpression )
            {
            // InternalQL.g:883:4: (lv_lhsOperand_7_0= ruleExpression )
            // InternalQL.g:884:5: lv_lhsOperand_7_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getBasicBinaryExpressionAccess().getLhsOperandExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_22);
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

            otherlv_8=(Token)match(input,28,FOLLOW_14); 

            			newLeafNode(otherlv_8, grammarAccess.getBasicBinaryExpressionAccess().getRhsOperandKeyword_7());
            		
            // InternalQL.g:905:3: ( (lv_rhsOperand_9_0= ruleExpression ) )
            // InternalQL.g:906:4: (lv_rhsOperand_9_0= ruleExpression )
            {
            // InternalQL.g:906:4: (lv_rhsOperand_9_0= ruleExpression )
            // InternalQL.g:907:5: lv_rhsOperand_9_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getBasicBinaryExpressionAccess().getRhsOperandExpressionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_17);
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
    // InternalQL.g:932:1: entryRuleConstantCall returns [EObject current=null] : iv_ruleConstantCall= ruleConstantCall EOF ;
    public final EObject entryRuleConstantCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantCall = null;


        try {
            // InternalQL.g:932:53: (iv_ruleConstantCall= ruleConstantCall EOF )
            // InternalQL.g:933:2: iv_ruleConstantCall= ruleConstantCall EOF
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
    // InternalQL.g:939:1: ruleConstantCall returns [EObject current=null] : ( () otherlv_1= 'ConstantCall' otherlv_2= '{' (otherlv_3= 'resultType' ( ( ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleValue ) ) )? otherlv_7= '}' ) ;
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
            // InternalQL.g:945:2: ( ( () otherlv_1= 'ConstantCall' otherlv_2= '{' (otherlv_3= 'resultType' ( ( ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleValue ) ) )? otherlv_7= '}' ) )
            // InternalQL.g:946:2: ( () otherlv_1= 'ConstantCall' otherlv_2= '{' (otherlv_3= 'resultType' ( ( ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleValue ) ) )? otherlv_7= '}' )
            {
            // InternalQL.g:946:2: ( () otherlv_1= 'ConstantCall' otherlv_2= '{' (otherlv_3= 'resultType' ( ( ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleValue ) ) )? otherlv_7= '}' )
            // InternalQL.g:947:3: () otherlv_1= 'ConstantCall' otherlv_2= '{' (otherlv_3= 'resultType' ( ( ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleValue ) ) )? otherlv_7= '}'
            {
            // InternalQL.g:947:3: ()
            // InternalQL.g:948:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConstantCallAccess().getConstantCallAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getConstantCallAccess().getConstantCallKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getConstantCallAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQL.g:962:3: (otherlv_3= 'resultType' ( ( ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalQL.g:963:4: otherlv_3= 'resultType' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getConstantCallAccess().getResultTypeKeyword_3_0());
                    			
                    // InternalQL.g:967:4: ( ( ruleEString ) )
                    // InternalQL.g:968:5: ( ruleEString )
                    {
                    // InternalQL.g:968:5: ( ruleEString )
                    // InternalQL.g:969:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstantCallRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getConstantCallAccess().getResultTypeValueTypeCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQL.g:984:3: (otherlv_5= 'value' ( (lv_value_6_0= ruleValue ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalQL.g:985:4: otherlv_5= 'value' ( (lv_value_6_0= ruleValue ) )
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_25); 

                    				newLeafNode(otherlv_5, grammarAccess.getConstantCallAccess().getValueKeyword_4_0());
                    			
                    // InternalQL.g:989:4: ( (lv_value_6_0= ruleValue ) )
                    // InternalQL.g:990:5: (lv_value_6_0= ruleValue )
                    {
                    // InternalQL.g:990:5: (lv_value_6_0= ruleValue )
                    // InternalQL.g:991:6: lv_value_6_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getConstantCallAccess().getValueValueParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
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
    // InternalQL.g:1017:1: entryRuleBasicUnaryExpression returns [EObject current=null] : iv_ruleBasicUnaryExpression= ruleBasicUnaryExpression EOF ;
    public final EObject entryRuleBasicUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicUnaryExpression = null;


        try {
            // InternalQL.g:1017:61: (iv_ruleBasicUnaryExpression= ruleBasicUnaryExpression EOF )
            // InternalQL.g:1018:2: iv_ruleBasicUnaryExpression= ruleBasicUnaryExpression EOF
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
    // InternalQL.g:1024:1: ruleBasicUnaryExpression returns [EObject current=null] : (otherlv_0= 'BasicUnaryExpression' otherlv_1= '{' (otherlv_2= 'operator' ( (lv_operator_3_0= ruleUnaryOperatorKind ) ) )? (otherlv_4= 'resultType' ( ( ruleEString ) ) )? otherlv_6= 'operand' ( (lv_operand_7_0= ruleExpression ) ) otherlv_8= '}' ) ;
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
            // InternalQL.g:1030:2: ( (otherlv_0= 'BasicUnaryExpression' otherlv_1= '{' (otherlv_2= 'operator' ( (lv_operator_3_0= ruleUnaryOperatorKind ) ) )? (otherlv_4= 'resultType' ( ( ruleEString ) ) )? otherlv_6= 'operand' ( (lv_operand_7_0= ruleExpression ) ) otherlv_8= '}' ) )
            // InternalQL.g:1031:2: (otherlv_0= 'BasicUnaryExpression' otherlv_1= '{' (otherlv_2= 'operator' ( (lv_operator_3_0= ruleUnaryOperatorKind ) ) )? (otherlv_4= 'resultType' ( ( ruleEString ) ) )? otherlv_6= 'operand' ( (lv_operand_7_0= ruleExpression ) ) otherlv_8= '}' )
            {
            // InternalQL.g:1031:2: (otherlv_0= 'BasicUnaryExpression' otherlv_1= '{' (otherlv_2= 'operator' ( (lv_operator_3_0= ruleUnaryOperatorKind ) ) )? (otherlv_4= 'resultType' ( ( ruleEString ) ) )? otherlv_6= 'operand' ( (lv_operand_7_0= ruleExpression ) ) otherlv_8= '}' )
            // InternalQL.g:1032:3: otherlv_0= 'BasicUnaryExpression' otherlv_1= '{' (otherlv_2= 'operator' ( (lv_operator_3_0= ruleUnaryOperatorKind ) ) )? (otherlv_4= 'resultType' ( ( ruleEString ) ) )? otherlv_6= 'operand' ( (lv_operand_7_0= ruleExpression ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getBasicUnaryExpressionAccess().getBasicUnaryExpressionKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getBasicUnaryExpressionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalQL.g:1040:3: (otherlv_2= 'operator' ( (lv_operator_3_0= ruleUnaryOperatorKind ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalQL.g:1041:4: otherlv_2= 'operator' ( (lv_operator_3_0= ruleUnaryOperatorKind ) )
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_27); 

                    				newLeafNode(otherlv_2, grammarAccess.getBasicUnaryExpressionAccess().getOperatorKeyword_2_0());
                    			
                    // InternalQL.g:1045:4: ( (lv_operator_3_0= ruleUnaryOperatorKind ) )
                    // InternalQL.g:1046:5: (lv_operator_3_0= ruleUnaryOperatorKind )
                    {
                    // InternalQL.g:1046:5: (lv_operator_3_0= ruleUnaryOperatorKind )
                    // InternalQL.g:1047:6: lv_operator_3_0= ruleUnaryOperatorKind
                    {

                    						newCompositeNode(grammarAccess.getBasicUnaryExpressionAccess().getOperatorUnaryOperatorKindEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_28);
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

            // InternalQL.g:1065:3: (otherlv_4= 'resultType' ( ( ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalQL.g:1066:4: otherlv_4= 'resultType' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getBasicUnaryExpressionAccess().getResultTypeKeyword_3_0());
                    			
                    // InternalQL.g:1070:4: ( ( ruleEString ) )
                    // InternalQL.g:1071:5: ( ruleEString )
                    {
                    // InternalQL.g:1071:5: ( ruleEString )
                    // InternalQL.g:1072:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBasicUnaryExpressionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBasicUnaryExpressionAccess().getResultTypeValueTypeCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,32,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getBasicUnaryExpressionAccess().getOperandKeyword_4());
            		
            // InternalQL.g:1091:3: ( (lv_operand_7_0= ruleExpression ) )
            // InternalQL.g:1092:4: (lv_operand_7_0= ruleExpression )
            {
            // InternalQL.g:1092:4: (lv_operand_7_0= ruleExpression )
            // InternalQL.g:1093:5: lv_operand_7_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getBasicUnaryExpressionAccess().getOperandExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_17);
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
    // InternalQL.g:1118:1: entryRuleQuestionCall returns [EObject current=null] : iv_ruleQuestionCall= ruleQuestionCall EOF ;
    public final EObject entryRuleQuestionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionCall = null;


        try {
            // InternalQL.g:1118:53: (iv_ruleQuestionCall= ruleQuestionCall EOF )
            // InternalQL.g:1119:2: iv_ruleQuestionCall= ruleQuestionCall EOF
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
    // InternalQL.g:1125:1: ruleQuestionCall returns [EObject current=null] : (otherlv_0= 'QuestionCall' otherlv_1= '{' (otherlv_2= 'resultType' ( ( ruleEString ) ) )? otherlv_4= 'question' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleQuestionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalQL.g:1131:2: ( (otherlv_0= 'QuestionCall' otherlv_1= '{' (otherlv_2= 'resultType' ( ( ruleEString ) ) )? otherlv_4= 'question' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalQL.g:1132:2: (otherlv_0= 'QuestionCall' otherlv_1= '{' (otherlv_2= 'resultType' ( ( ruleEString ) ) )? otherlv_4= 'question' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalQL.g:1132:2: (otherlv_0= 'QuestionCall' otherlv_1= '{' (otherlv_2= 'resultType' ( ( ruleEString ) ) )? otherlv_4= 'question' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalQL.g:1133:3: otherlv_0= 'QuestionCall' otherlv_1= '{' (otherlv_2= 'resultType' ( ( ruleEString ) ) )? otherlv_4= 'question' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getQuestionCallAccess().getQuestionCallKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getQuestionCallAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalQL.g:1141:3: (otherlv_2= 'resultType' ( ( ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalQL.g:1142:4: otherlv_2= 'resultType' ( ( ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getQuestionCallAccess().getResultTypeKeyword_2_0());
                    			
                    // InternalQL.g:1146:4: ( ( ruleEString ) )
                    // InternalQL.g:1147:5: ( ruleEString )
                    {
                    // InternalQL.g:1147:5: ( ruleEString )
                    // InternalQL.g:1148:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQuestionCallRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getQuestionCallAccess().getResultTypeValueTypeCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,34,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getQuestionCallAccess().getQuestionKeyword_3());
            		
            // InternalQL.g:1167:3: ( ( ruleEString ) )
            // InternalQL.g:1168:4: ( ruleEString )
            {
            // InternalQL.g:1168:4: ( ruleEString )
            // InternalQL.g:1169:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuestionCallRule());
            					}
            				

            					newCompositeNode(grammarAccess.getQuestionCallAccess().getQuestionQuestionDefinitionCrossReference_4_0());
            				
            pushFollow(FOLLOW_17);
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
    // InternalQL.g:1191:1: entryRuleBooleanValueType returns [EObject current=null] : iv_ruleBooleanValueType= ruleBooleanValueType EOF ;
    public final EObject entryRuleBooleanValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValueType = null;


        try {
            // InternalQL.g:1191:57: (iv_ruleBooleanValueType= ruleBooleanValueType EOF )
            // InternalQL.g:1192:2: iv_ruleBooleanValueType= ruleBooleanValueType EOF
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
    // InternalQL.g:1198:1: ruleBooleanValueType returns [EObject current=null] : ( () otherlv_1= 'booleanType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? ) ;
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
            // InternalQL.g:1204:2: ( ( () otherlv_1= 'booleanType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? ) )
            // InternalQL.g:1205:2: ( () otherlv_1= 'booleanType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? )
            {
            // InternalQL.g:1205:2: ( () otherlv_1= 'booleanType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? )
            // InternalQL.g:1206:3: () otherlv_1= 'booleanType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )?
            {
            // InternalQL.g:1206:3: ()
            // InternalQL.g:1207:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanValueTypeAccess().getBooleanValueTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getBooleanValueTypeAccess().getBooleanTypeKeyword_1());
            		
            // InternalQL.g:1217:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQL.g:1218:4: (lv_name_2_0= ruleEString )
            {
            // InternalQL.g:1218:4: (lv_name_2_0= ruleEString )
            // InternalQL.g:1219:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBooleanValueTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_32);
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

            // InternalQL.g:1236:3: (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==16) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalQL.g:1237:4: otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getBooleanValueTypeAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalQL.g:1241:4: (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==23) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalQL.g:1242:5: otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) )
                            {
                            otherlv_4=(Token)match(input,23,FOLLOW_10); 

                            					newLeafNode(otherlv_4, grammarAccess.getBooleanValueTypeAccess().getUnitKeyword_3_1_0());
                            				
                            // InternalQL.g:1246:5: ( (lv_unit_5_0= ruleEString ) )
                            // InternalQL.g:1247:6: (lv_unit_5_0= ruleEString )
                            {
                            // InternalQL.g:1247:6: (lv_unit_5_0= ruleEString )
                            // InternalQL.g:1248:7: lv_unit_5_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getBooleanValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0());
                            						
                            pushFollow(FOLLOW_17);
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

                    				newLeafNode(otherlv_6, grammarAccess.getBooleanValueTypeAccess().getRightCurlyBracketKeyword_3_2());
                    			

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
    // $ANTLR end "ruleBooleanValueType"


    // $ANTLR start "entryRuleIntegerValueType"
    // InternalQL.g:1275:1: entryRuleIntegerValueType returns [EObject current=null] : iv_ruleIntegerValueType= ruleIntegerValueType EOF ;
    public final EObject entryRuleIntegerValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValueType = null;


        try {
            // InternalQL.g:1275:57: (iv_ruleIntegerValueType= ruleIntegerValueType EOF )
            // InternalQL.g:1276:2: iv_ruleIntegerValueType= ruleIntegerValueType EOF
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
    // InternalQL.g:1282:1: ruleIntegerValueType returns [EObject current=null] : ( () otherlv_1= 'integerType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )? (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )? otherlv_10= '}' )? ) ;
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
            // InternalQL.g:1288:2: ( ( () otherlv_1= 'integerType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )? (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )? otherlv_10= '}' )? ) )
            // InternalQL.g:1289:2: ( () otherlv_1= 'integerType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )? (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )? otherlv_10= '}' )? )
            {
            // InternalQL.g:1289:2: ( () otherlv_1= 'integerType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )? (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )? otherlv_10= '}' )? )
            // InternalQL.g:1290:3: () otherlv_1= 'integerType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )? (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )? otherlv_10= '}' )?
            {
            // InternalQL.g:1290:3: ()
            // InternalQL.g:1291:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerValueTypeAccess().getIntegerValueTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getIntegerValueTypeAccess().getIntegerTypeKeyword_1());
            		
            // InternalQL.g:1301:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQL.g:1302:4: (lv_name_2_0= ruleEString )
            {
            // InternalQL.g:1302:4: (lv_name_2_0= ruleEString )
            // InternalQL.g:1303:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIntegerValueTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_32);
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

            // InternalQL.g:1320:3: (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )? (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )? otherlv_10= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==16) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalQL.g:1321:4: otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )? (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )? otherlv_10= '}'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_33); 

                    				newLeafNode(otherlv_3, grammarAccess.getIntegerValueTypeAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalQL.g:1325:4: (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==23) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalQL.g:1326:5: otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) )
                            {
                            otherlv_4=(Token)match(input,23,FOLLOW_10); 

                            					newLeafNode(otherlv_4, grammarAccess.getIntegerValueTypeAccess().getUnitKeyword_3_1_0());
                            				
                            // InternalQL.g:1330:5: ( (lv_unit_5_0= ruleEString ) )
                            // InternalQL.g:1331:6: (lv_unit_5_0= ruleEString )
                            {
                            // InternalQL.g:1331:6: (lv_unit_5_0= ruleEString )
                            // InternalQL.g:1332:7: lv_unit_5_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getIntegerValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0());
                            						
                            pushFollow(FOLLOW_34);
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

                    // InternalQL.g:1350:4: (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==37) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalQL.g:1351:5: otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) )
                            {
                            otherlv_6=(Token)match(input,37,FOLLOW_35); 

                            					newLeafNode(otherlv_6, grammarAccess.getIntegerValueTypeAccess().getMinKeyword_3_2_0());
                            				
                            // InternalQL.g:1355:5: ( (lv_min_7_0= ruleEInt ) )
                            // InternalQL.g:1356:6: (lv_min_7_0= ruleEInt )
                            {
                            // InternalQL.g:1356:6: (lv_min_7_0= ruleEInt )
                            // InternalQL.g:1357:7: lv_min_7_0= ruleEInt
                            {

                            							newCompositeNode(grammarAccess.getIntegerValueTypeAccess().getMinEIntParserRuleCall_3_2_1_0());
                            						
                            pushFollow(FOLLOW_36);
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

                    // InternalQL.g:1375:4: (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==38) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalQL.g:1376:5: otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) )
                            {
                            otherlv_8=(Token)match(input,38,FOLLOW_35); 

                            					newLeafNode(otherlv_8, grammarAccess.getIntegerValueTypeAccess().getMaxKeyword_3_3_0());
                            				
                            // InternalQL.g:1380:5: ( (lv_max_9_0= ruleEInt ) )
                            // InternalQL.g:1381:6: (lv_max_9_0= ruleEInt )
                            {
                            // InternalQL.g:1381:6: (lv_max_9_0= ruleEInt )
                            // InternalQL.g:1382:7: lv_max_9_0= ruleEInt
                            {

                            							newCompositeNode(grammarAccess.getIntegerValueTypeAccess().getMaxEIntParserRuleCall_3_3_1_0());
                            						
                            pushFollow(FOLLOW_17);
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

                    				newLeafNode(otherlv_10, grammarAccess.getIntegerValueTypeAccess().getRightCurlyBracketKeyword_3_4());
                    			

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
    // $ANTLR end "ruleIntegerValueType"


    // $ANTLR start "entryRuleDecimalValueType"
    // InternalQL.g:1409:1: entryRuleDecimalValueType returns [EObject current=null] : iv_ruleDecimalValueType= ruleDecimalValueType EOF ;
    public final EObject entryRuleDecimalValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalValueType = null;


        try {
            // InternalQL.g:1409:57: (iv_ruleDecimalValueType= ruleDecimalValueType EOF )
            // InternalQL.g:1410:2: iv_ruleDecimalValueType= ruleDecimalValueType EOF
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
    // InternalQL.g:1416:1: ruleDecimalValueType returns [EObject current=null] : ( () otherlv_1= 'decimalType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? ) ;
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
            // InternalQL.g:1422:2: ( ( () otherlv_1= 'decimalType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? ) )
            // InternalQL.g:1423:2: ( () otherlv_1= 'decimalType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? )
            {
            // InternalQL.g:1423:2: ( () otherlv_1= 'decimalType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? )
            // InternalQL.g:1424:3: () otherlv_1= 'decimalType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )?
            {
            // InternalQL.g:1424:3: ()
            // InternalQL.g:1425:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDecimalValueTypeAccess().getDecimalValueTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getDecimalValueTypeAccess().getDecimalTypeKeyword_1());
            		
            // InternalQL.g:1435:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQL.g:1436:4: (lv_name_2_0= ruleEString )
            {
            // InternalQL.g:1436:4: (lv_name_2_0= ruleEString )
            // InternalQL.g:1437:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDecimalValueTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_32);
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

            // InternalQL.g:1454:3: (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==16) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalQL.g:1455:4: otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getDecimalValueTypeAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalQL.g:1459:4: (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==23) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalQL.g:1460:5: otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) )
                            {
                            otherlv_4=(Token)match(input,23,FOLLOW_10); 

                            					newLeafNode(otherlv_4, grammarAccess.getDecimalValueTypeAccess().getUnitKeyword_3_1_0());
                            				
                            // InternalQL.g:1464:5: ( (lv_unit_5_0= ruleEString ) )
                            // InternalQL.g:1465:6: (lv_unit_5_0= ruleEString )
                            {
                            // InternalQL.g:1465:6: (lv_unit_5_0= ruleEString )
                            // InternalQL.g:1466:7: lv_unit_5_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getDecimalValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0());
                            						
                            pushFollow(FOLLOW_17);
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

                    				newLeafNode(otherlv_6, grammarAccess.getDecimalValueTypeAccess().getRightCurlyBracketKeyword_3_2());
                    			

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
    // $ANTLR end "ruleDecimalValueType"


    // $ANTLR start "entryRuleDateValueType"
    // InternalQL.g:1493:1: entryRuleDateValueType returns [EObject current=null] : iv_ruleDateValueType= ruleDateValueType EOF ;
    public final EObject entryRuleDateValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateValueType = null;


        try {
            // InternalQL.g:1493:54: (iv_ruleDateValueType= ruleDateValueType EOF )
            // InternalQL.g:1494:2: iv_ruleDateValueType= ruleDateValueType EOF
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
    // InternalQL.g:1500:1: ruleDateValueType returns [EObject current=null] : ( () otherlv_1= 'dateType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? ) ;
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
            // InternalQL.g:1506:2: ( ( () otherlv_1= 'dateType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? ) )
            // InternalQL.g:1507:2: ( () otherlv_1= 'dateType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? )
            {
            // InternalQL.g:1507:2: ( () otherlv_1= 'dateType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? )
            // InternalQL.g:1508:3: () otherlv_1= 'dateType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )?
            {
            // InternalQL.g:1508:3: ()
            // InternalQL.g:1509:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDateValueTypeAccess().getDateValueTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getDateValueTypeAccess().getDateTypeKeyword_1());
            		
            // InternalQL.g:1519:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQL.g:1520:4: (lv_name_2_0= ruleEString )
            {
            // InternalQL.g:1520:4: (lv_name_2_0= ruleEString )
            // InternalQL.g:1521:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDateValueTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_32);
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

            // InternalQL.g:1538:3: (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==16) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalQL.g:1539:4: otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getDateValueTypeAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalQL.g:1543:4: (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==23) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalQL.g:1544:5: otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) )
                            {
                            otherlv_4=(Token)match(input,23,FOLLOW_10); 

                            					newLeafNode(otherlv_4, grammarAccess.getDateValueTypeAccess().getUnitKeyword_3_1_0());
                            				
                            // InternalQL.g:1548:5: ( (lv_unit_5_0= ruleEString ) )
                            // InternalQL.g:1549:6: (lv_unit_5_0= ruleEString )
                            {
                            // InternalQL.g:1549:6: (lv_unit_5_0= ruleEString )
                            // InternalQL.g:1550:7: lv_unit_5_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getDateValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0());
                            						
                            pushFollow(FOLLOW_17);
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

                    				newLeafNode(otherlv_6, grammarAccess.getDateValueTypeAccess().getRightCurlyBracketKeyword_3_2());
                    			

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
    // $ANTLR end "ruleDateValueType"


    // $ANTLR start "entryRuleEnumerationValueType"
    // InternalQL.g:1577:1: entryRuleEnumerationValueType returns [EObject current=null] : iv_ruleEnumerationValueType= ruleEnumerationValueType EOF ;
    public final EObject entryRuleEnumerationValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationValueType = null;


        try {
            // InternalQL.g:1577:61: (iv_ruleEnumerationValueType= ruleEnumerationValueType EOF )
            // InternalQL.g:1578:2: iv_ruleEnumerationValueType= ruleEnumerationValueType EOF
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
    // InternalQL.g:1584:1: ruleEnumerationValueType returns [EObject current=null] : ( () otherlv_1= 'enumerationType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )? otherlv_12= '}' )? ) ;
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
            // InternalQL.g:1590:2: ( ( () otherlv_1= 'enumerationType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )? otherlv_12= '}' )? ) )
            // InternalQL.g:1591:2: ( () otherlv_1= 'enumerationType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )? otherlv_12= '}' )? )
            {
            // InternalQL.g:1591:2: ( () otherlv_1= 'enumerationType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )? otherlv_12= '}' )? )
            // InternalQL.g:1592:3: () otherlv_1= 'enumerationType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )? otherlv_12= '}' )?
            {
            // InternalQL.g:1592:3: ()
            // InternalQL.g:1593:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnumerationValueTypeAccess().getEnumerationValueTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumerationValueTypeAccess().getEnumerationTypeKeyword_1());
            		
            // InternalQL.g:1603:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQL.g:1604:4: (lv_name_2_0= ruleEString )
            {
            // InternalQL.g:1604:4: (lv_name_2_0= ruleEString )
            // InternalQL.g:1605:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnumerationValueTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_32);
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

            // InternalQL.g:1622:3: (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )? otherlv_12= '}' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==16) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalQL.g:1623:4: otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )? otherlv_12= '}'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_37); 

                    				newLeafNode(otherlv_3, grammarAccess.getEnumerationValueTypeAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalQL.g:1627:4: (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==23) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalQL.g:1628:5: otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) )
                            {
                            otherlv_4=(Token)match(input,23,FOLLOW_10); 

                            					newLeafNode(otherlv_4, grammarAccess.getEnumerationValueTypeAccess().getUnitKeyword_3_1_0());
                            				
                            // InternalQL.g:1632:5: ( (lv_unit_5_0= ruleEString ) )
                            // InternalQL.g:1633:6: (lv_unit_5_0= ruleEString )
                            {
                            // InternalQL.g:1633:6: (lv_unit_5_0= ruleEString )
                            // InternalQL.g:1634:7: lv_unit_5_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getEnumerationValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0());
                            						
                            pushFollow(FOLLOW_38);
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

                    // InternalQL.g:1652:4: (otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==42) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalQL.g:1653:5: otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}'
                            {
                            otherlv_6=(Token)match(input,42,FOLLOW_8); 

                            					newLeafNode(otherlv_6, grammarAccess.getEnumerationValueTypeAccess().getLiteralsKeyword_3_2_0());
                            				
                            otherlv_7=(Token)match(input,16,FOLLOW_10); 

                            					newLeafNode(otherlv_7, grammarAccess.getEnumerationValueTypeAccess().getLeftCurlyBracketKeyword_3_2_1());
                            				
                            // InternalQL.g:1661:5: ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) )
                            // InternalQL.g:1662:6: (lv_enumerationLiterals_8_0= ruleEnumerationLiteral )
                            {
                            // InternalQL.g:1662:6: (lv_enumerationLiterals_8_0= ruleEnumerationLiteral )
                            // InternalQL.g:1663:7: lv_enumerationLiterals_8_0= ruleEnumerationLiteral
                            {

                            							newCompositeNode(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_3_2_2_0());
                            						
                            pushFollow(FOLLOW_39);
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

                            // InternalQL.g:1680:5: (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )*
                            loop30:
                            do {
                                int alt30=2;
                                int LA30_0 = input.LA(1);

                                if ( (LA30_0==43) ) {
                                    alt30=1;
                                }


                                switch (alt30) {
                            	case 1 :
                            	    // InternalQL.g:1681:6: otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) )
                            	    {
                            	    otherlv_9=(Token)match(input,43,FOLLOW_10); 

                            	    						newLeafNode(otherlv_9, grammarAccess.getEnumerationValueTypeAccess().getCommaKeyword_3_2_3_0());
                            	    					
                            	    // InternalQL.g:1685:6: ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) )
                            	    // InternalQL.g:1686:7: (lv_enumerationLiterals_10_0= ruleEnumerationLiteral )
                            	    {
                            	    // InternalQL.g:1686:7: (lv_enumerationLiterals_10_0= ruleEnumerationLiteral )
                            	    // InternalQL.g:1687:8: lv_enumerationLiterals_10_0= ruleEnumerationLiteral
                            	    {

                            	    								newCompositeNode(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_3_2_3_1_0());
                            	    							
                            	    pushFollow(FOLLOW_39);
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
                            	    break loop30;
                                }
                            } while (true);

                            otherlv_11=(Token)match(input,17,FOLLOW_17); 

                            					newLeafNode(otherlv_11, grammarAccess.getEnumerationValueTypeAccess().getRightCurlyBracketKeyword_3_2_4());
                            				

                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getEnumerationValueTypeAccess().getRightCurlyBracketKeyword_3_3());
                    			

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
    // $ANTLR end "ruleEnumerationValueType"


    // $ANTLR start "entryRuleStringValueType"
    // InternalQL.g:1719:1: entryRuleStringValueType returns [EObject current=null] : iv_ruleStringValueType= ruleStringValueType EOF ;
    public final EObject entryRuleStringValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValueType = null;


        try {
            // InternalQL.g:1719:56: (iv_ruleStringValueType= ruleStringValueType EOF )
            // InternalQL.g:1720:2: iv_ruleStringValueType= ruleStringValueType EOF
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
    // InternalQL.g:1726:1: ruleStringValueType returns [EObject current=null] : ( () otherlv_1= 'StringValueType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? ) ;
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
            // InternalQL.g:1732:2: ( ( () otherlv_1= 'StringValueType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? ) )
            // InternalQL.g:1733:2: ( () otherlv_1= 'StringValueType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? )
            {
            // InternalQL.g:1733:2: ( () otherlv_1= 'StringValueType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? )
            // InternalQL.g:1734:3: () otherlv_1= 'StringValueType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )?
            {
            // InternalQL.g:1734:3: ()
            // InternalQL.g:1735:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringValueTypeAccess().getStringValueTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getStringValueTypeAccess().getStringValueTypeKeyword_1());
            		
            // InternalQL.g:1745:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQL.g:1746:4: (lv_name_2_0= ruleEString )
            {
            // InternalQL.g:1746:4: (lv_name_2_0= ruleEString )
            // InternalQL.g:1747:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStringValueTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_32);
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

            // InternalQL.g:1764:3: (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==16) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalQL.g:1765:4: otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getStringValueTypeAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalQL.g:1769:4: (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==23) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalQL.g:1770:5: otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) )
                            {
                            otherlv_4=(Token)match(input,23,FOLLOW_10); 

                            					newLeafNode(otherlv_4, grammarAccess.getStringValueTypeAccess().getUnitKeyword_3_1_0());
                            				
                            // InternalQL.g:1774:5: ( (lv_unit_5_0= ruleEString ) )
                            // InternalQL.g:1775:6: (lv_unit_5_0= ruleEString )
                            {
                            // InternalQL.g:1775:6: (lv_unit_5_0= ruleEString )
                            // InternalQL.g:1776:7: lv_unit_5_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getStringValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0());
                            						
                            pushFollow(FOLLOW_17);
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

                    				newLeafNode(otherlv_6, grammarAccess.getStringValueTypeAccess().getRightCurlyBracketKeyword_3_2());
                    			

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
    // $ANTLR end "ruleStringValueType"


    // $ANTLR start "entryRuleEInt"
    // InternalQL.g:1803:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalQL.g:1803:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalQL.g:1804:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalQL.g:1810:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalQL.g:1816:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalQL.g:1817:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalQL.g:1817:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalQL.g:1818:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalQL.g:1818:3: (kw= '-' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==45) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalQL.g:1819:4: kw= '-'
                    {
                    kw=(Token)match(input,45,FOLLOW_40); 

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
    // InternalQL.g:1836:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteral = null;


        try {
            // InternalQL.g:1836:59: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // InternalQL.g:1837:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
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
    // InternalQL.g:1843:1: ruleEnumerationLiteral returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalQL.g:1849:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalQL.g:1850:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalQL.g:1850:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalQL.g:1851:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalQL.g:1851:3: ()
            // InternalQL.g:1852:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnumerationLiteralAccess().getEnumerationLiteralAction_0(),
            					current);
            			

            }

            // InternalQL.g:1858:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQL.g:1859:4: (lv_name_1_0= ruleEString )
            {
            // InternalQL.g:1859:4: (lv_name_1_0= ruleEString )
            // InternalQL.g:1860:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnumerationLiteralAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerationLiteralRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
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
    // InternalQL.g:1881:1: entryRuleIntegerValue returns [EObject current=null] : iv_ruleIntegerValue= ruleIntegerValue EOF ;
    public final EObject entryRuleIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValue = null;


        try {
            // InternalQL.g:1881:53: (iv_ruleIntegerValue= ruleIntegerValue EOF )
            // InternalQL.g:1882:2: iv_ruleIntegerValue= ruleIntegerValue EOF
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
    // InternalQL.g:1888:1: ruleIntegerValue returns [EObject current=null] : ( () otherlv_1= 'IntegerValue' otherlv_2= '{' (otherlv_3= 'intValue' ( (lv_intValue_4_0= ruleEInt ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleIntegerValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_intValue_4_0 = null;



        	enterRule();

        try {
            // InternalQL.g:1894:2: ( ( () otherlv_1= 'IntegerValue' otherlv_2= '{' (otherlv_3= 'intValue' ( (lv_intValue_4_0= ruleEInt ) ) )? otherlv_5= '}' ) )
            // InternalQL.g:1895:2: ( () otherlv_1= 'IntegerValue' otherlv_2= '{' (otherlv_3= 'intValue' ( (lv_intValue_4_0= ruleEInt ) ) )? otherlv_5= '}' )
            {
            // InternalQL.g:1895:2: ( () otherlv_1= 'IntegerValue' otherlv_2= '{' (otherlv_3= 'intValue' ( (lv_intValue_4_0= ruleEInt ) ) )? otherlv_5= '}' )
            // InternalQL.g:1896:3: () otherlv_1= 'IntegerValue' otherlv_2= '{' (otherlv_3= 'intValue' ( (lv_intValue_4_0= ruleEInt ) ) )? otherlv_5= '}'
            {
            // InternalQL.g:1896:3: ()
            // InternalQL.g:1897:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerValueAccess().getIntegerValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getIntegerValueAccess().getIntegerValueKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getIntegerValueAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQL.g:1911:3: (otherlv_3= 'intValue' ( (lv_intValue_4_0= ruleEInt ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==47) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalQL.g:1912:4: otherlv_3= 'intValue' ( (lv_intValue_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,47,FOLLOW_35); 

                    				newLeafNode(otherlv_3, grammarAccess.getIntegerValueAccess().getIntValueKeyword_3_0());
                    			
                    // InternalQL.g:1916:4: ( (lv_intValue_4_0= ruleEInt ) )
                    // InternalQL.g:1917:5: (lv_intValue_4_0= ruleEInt )
                    {
                    // InternalQL.g:1917:5: (lv_intValue_4_0= ruleEInt )
                    // InternalQL.g:1918:6: lv_intValue_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getIntegerValueAccess().getIntValueEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_17);
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
    // InternalQL.g:1944:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalQL.g:1944:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalQL.g:1945:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalQL.g:1951:1: ruleStringValue returns [EObject current=null] : ( () otherlv_1= 'StringValue' otherlv_2= '{' (otherlv_3= 'stringValue' ( (lv_stringValue_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_stringValue_4_0 = null;



        	enterRule();

        try {
            // InternalQL.g:1957:2: ( ( () otherlv_1= 'StringValue' otherlv_2= '{' (otherlv_3= 'stringValue' ( (lv_stringValue_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalQL.g:1958:2: ( () otherlv_1= 'StringValue' otherlv_2= '{' (otherlv_3= 'stringValue' ( (lv_stringValue_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalQL.g:1958:2: ( () otherlv_1= 'StringValue' otherlv_2= '{' (otherlv_3= 'stringValue' ( (lv_stringValue_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalQL.g:1959:3: () otherlv_1= 'StringValue' otherlv_2= '{' (otherlv_3= 'stringValue' ( (lv_stringValue_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalQL.g:1959:3: ()
            // InternalQL.g:1960:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringValueAccess().getStringValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getStringValueAccess().getStringValueKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_42); 

            			newLeafNode(otherlv_2, grammarAccess.getStringValueAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQL.g:1974:3: (otherlv_3= 'stringValue' ( (lv_stringValue_4_0= ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==49) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalQL.g:1975:4: otherlv_3= 'stringValue' ( (lv_stringValue_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,49,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getStringValueAccess().getStringValueKeyword_3_0());
                    			
                    // InternalQL.g:1979:4: ( (lv_stringValue_4_0= ruleEString ) )
                    // InternalQL.g:1980:5: (lv_stringValue_4_0= ruleEString )
                    {
                    // InternalQL.g:1980:5: (lv_stringValue_4_0= ruleEString )
                    // InternalQL.g:1981:6: lv_stringValue_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getStringValueAccess().getStringValueEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_17);
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
    // InternalQL.g:2007:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalQL.g:2007:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalQL.g:2008:2: iv_ruleBooleanValue= ruleBooleanValue EOF
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
    // InternalQL.g:2014:1: ruleBooleanValue returns [EObject current=null] : ( () ( (lv_booleanValue_1_0= 'booleanValue' ) )? otherlv_2= 'BooleanValue' ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token lv_booleanValue_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalQL.g:2020:2: ( ( () ( (lv_booleanValue_1_0= 'booleanValue' ) )? otherlv_2= 'BooleanValue' ) )
            // InternalQL.g:2021:2: ( () ( (lv_booleanValue_1_0= 'booleanValue' ) )? otherlv_2= 'BooleanValue' )
            {
            // InternalQL.g:2021:2: ( () ( (lv_booleanValue_1_0= 'booleanValue' ) )? otherlv_2= 'BooleanValue' )
            // InternalQL.g:2022:3: () ( (lv_booleanValue_1_0= 'booleanValue' ) )? otherlv_2= 'BooleanValue'
            {
            // InternalQL.g:2022:3: ()
            // InternalQL.g:2023:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanValueAccess().getBooleanValueAction_0(),
            					current);
            			

            }

            // InternalQL.g:2029:3: ( (lv_booleanValue_1_0= 'booleanValue' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==50) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalQL.g:2030:4: (lv_booleanValue_1_0= 'booleanValue' )
                    {
                    // InternalQL.g:2030:4: (lv_booleanValue_1_0= 'booleanValue' )
                    // InternalQL.g:2031:5: lv_booleanValue_1_0= 'booleanValue'
                    {
                    lv_booleanValue_1_0=(Token)match(input,50,FOLLOW_43); 

                    					newLeafNode(lv_booleanValue_1_0, grammarAccess.getBooleanValueAccess().getBooleanValueBooleanValueKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanValueRule());
                    					}
                    					setWithLastConsumed(current, "booleanValue", lv_booleanValue_1_0 != null, "booleanValue");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,51,FOLLOW_2); 

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
    // InternalQL.g:2051:1: entryRuleDateValue returns [EObject current=null] : iv_ruleDateValue= ruleDateValue EOF ;
    public final EObject entryRuleDateValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateValue = null;


        try {
            // InternalQL.g:2051:50: (iv_ruleDateValue= ruleDateValue EOF )
            // InternalQL.g:2052:2: iv_ruleDateValue= ruleDateValue EOF
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
    // InternalQL.g:2058:1: ruleDateValue returns [EObject current=null] : ( () otherlv_1= 'DateValue' otherlv_2= '{' (otherlv_3= 'dateValue' ( (lv_dateValue_4_0= ruleEDate ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleDateValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_dateValue_4_0 = null;



        	enterRule();

        try {
            // InternalQL.g:2064:2: ( ( () otherlv_1= 'DateValue' otherlv_2= '{' (otherlv_3= 'dateValue' ( (lv_dateValue_4_0= ruleEDate ) ) )? otherlv_5= '}' ) )
            // InternalQL.g:2065:2: ( () otherlv_1= 'DateValue' otherlv_2= '{' (otherlv_3= 'dateValue' ( (lv_dateValue_4_0= ruleEDate ) ) )? otherlv_5= '}' )
            {
            // InternalQL.g:2065:2: ( () otherlv_1= 'DateValue' otherlv_2= '{' (otherlv_3= 'dateValue' ( (lv_dateValue_4_0= ruleEDate ) ) )? otherlv_5= '}' )
            // InternalQL.g:2066:3: () otherlv_1= 'DateValue' otherlv_2= '{' (otherlv_3= 'dateValue' ( (lv_dateValue_4_0= ruleEDate ) ) )? otherlv_5= '}'
            {
            // InternalQL.g:2066:3: ()
            // InternalQL.g:2067:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDateValueAccess().getDateValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getDateValueAccess().getDateValueKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_44); 

            			newLeafNode(otherlv_2, grammarAccess.getDateValueAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQL.g:2081:3: (otherlv_3= 'dateValue' ( (lv_dateValue_4_0= ruleEDate ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==53) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalQL.g:2082:4: otherlv_3= 'dateValue' ( (lv_dateValue_4_0= ruleEDate ) )
                    {
                    otherlv_3=(Token)match(input,53,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getDateValueAccess().getDateValueKeyword_3_0());
                    			
                    // InternalQL.g:2086:4: ( (lv_dateValue_4_0= ruleEDate ) )
                    // InternalQL.g:2087:5: (lv_dateValue_4_0= ruleEDate )
                    {
                    // InternalQL.g:2087:5: (lv_dateValue_4_0= ruleEDate )
                    // InternalQL.g:2088:6: lv_dateValue_4_0= ruleEDate
                    {

                    						newCompositeNode(grammarAccess.getDateValueAccess().getDateValueEDateParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_17);
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
    // InternalQL.g:2114:1: entryRuleDecimalValue returns [EObject current=null] : iv_ruleDecimalValue= ruleDecimalValue EOF ;
    public final EObject entryRuleDecimalValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalValue = null;


        try {
            // InternalQL.g:2114:53: (iv_ruleDecimalValue= ruleDecimalValue EOF )
            // InternalQL.g:2115:2: iv_ruleDecimalValue= ruleDecimalValue EOF
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
    // InternalQL.g:2121:1: ruleDecimalValue returns [EObject current=null] : ( () otherlv_1= 'DecimalValue' otherlv_2= '{' (otherlv_3= 'decimalValue' ( (lv_decimalValue_4_0= ruleEFloat ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleDecimalValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_decimalValue_4_0 = null;



        	enterRule();

        try {
            // InternalQL.g:2127:2: ( ( () otherlv_1= 'DecimalValue' otherlv_2= '{' (otherlv_3= 'decimalValue' ( (lv_decimalValue_4_0= ruleEFloat ) ) )? otherlv_5= '}' ) )
            // InternalQL.g:2128:2: ( () otherlv_1= 'DecimalValue' otherlv_2= '{' (otherlv_3= 'decimalValue' ( (lv_decimalValue_4_0= ruleEFloat ) ) )? otherlv_5= '}' )
            {
            // InternalQL.g:2128:2: ( () otherlv_1= 'DecimalValue' otherlv_2= '{' (otherlv_3= 'decimalValue' ( (lv_decimalValue_4_0= ruleEFloat ) ) )? otherlv_5= '}' )
            // InternalQL.g:2129:3: () otherlv_1= 'DecimalValue' otherlv_2= '{' (otherlv_3= 'decimalValue' ( (lv_decimalValue_4_0= ruleEFloat ) ) )? otherlv_5= '}'
            {
            // InternalQL.g:2129:3: ()
            // InternalQL.g:2130:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDecimalValueAccess().getDecimalValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,54,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getDecimalValueAccess().getDecimalValueKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_45); 

            			newLeafNode(otherlv_2, grammarAccess.getDecimalValueAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQL.g:2144:3: (otherlv_3= 'decimalValue' ( (lv_decimalValue_4_0= ruleEFloat ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==55) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalQL.g:2145:4: otherlv_3= 'decimalValue' ( (lv_decimalValue_4_0= ruleEFloat ) )
                    {
                    otherlv_3=(Token)match(input,55,FOLLOW_46); 

                    				newLeafNode(otherlv_3, grammarAccess.getDecimalValueAccess().getDecimalValueKeyword_3_0());
                    			
                    // InternalQL.g:2149:4: ( (lv_decimalValue_4_0= ruleEFloat ) )
                    // InternalQL.g:2150:5: (lv_decimalValue_4_0= ruleEFloat )
                    {
                    // InternalQL.g:2150:5: (lv_decimalValue_4_0= ruleEFloat )
                    // InternalQL.g:2151:6: lv_decimalValue_4_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getDecimalValueAccess().getDecimalValueEFloatParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_17);
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
    // InternalQL.g:2177:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalQL.g:2177:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalQL.g:2178:2: iv_ruleEFloat= ruleEFloat EOF
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
    // InternalQL.g:2184:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalQL.g:2190:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalQL.g:2191:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalQL.g:2191:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalQL.g:2192:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalQL.g:2192:3: (kw= '-' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==45) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalQL.g:2193:4: kw= '-'
                    {
                    kw=(Token)match(input,45,FOLLOW_47); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalQL.g:2199:3: (this_INT_1= RULE_INT )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_INT) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalQL.g:2200:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_48); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,56,FOLLOW_40); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_49); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalQL.g:2220:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=57 && LA45_0<=58)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalQL.g:2221:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalQL.g:2221:4: (kw= 'E' | kw= 'e' )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==57) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==58) ) {
                        alt43=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalQL.g:2222:5: kw= 'E'
                            {
                            kw=(Token)match(input,57,FOLLOW_35); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalQL.g:2228:5: kw= 'e'
                            {
                            kw=(Token)match(input,58,FOLLOW_35); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalQL.g:2234:4: (kw= '-' )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==45) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalQL.g:2235:5: kw= '-'
                            {
                            kw=(Token)match(input,45,FOLLOW_40); 

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
    // InternalQL.g:2253:1: entryRuleQuestionDefinition returns [EObject current=null] : iv_ruleQuestionDefinition= ruleQuestionDefinition EOF ;
    public final EObject entryRuleQuestionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionDefinition = null;


        try {
            // InternalQL.g:2253:59: (iv_ruleQuestionDefinition= ruleQuestionDefinition EOF )
            // InternalQL.g:2254:2: iv_ruleQuestionDefinition= ruleQuestionDefinition EOF
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
    // InternalQL.g:2260:1: ruleQuestionDefinition returns [EObject current=null] : ( ( (lv_isMandatory_0_0= 'mandatory' ) )? otherlv_1= 'question' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_label_4_0= ruleEString ) ) ( ( ruleEString ) ) (otherlv_6= '=' ( (lv_computedExpression_7_0= ruleExpression ) ) otherlv_8= ';' )? ) ;
    public final EObject ruleQuestionDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_isMandatory_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_label_4_0 = null;

        EObject lv_computedExpression_7_0 = null;



        	enterRule();

        try {
            // InternalQL.g:2266:2: ( ( ( (lv_isMandatory_0_0= 'mandatory' ) )? otherlv_1= 'question' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_label_4_0= ruleEString ) ) ( ( ruleEString ) ) (otherlv_6= '=' ( (lv_computedExpression_7_0= ruleExpression ) ) otherlv_8= ';' )? ) )
            // InternalQL.g:2267:2: ( ( (lv_isMandatory_0_0= 'mandatory' ) )? otherlv_1= 'question' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_label_4_0= ruleEString ) ) ( ( ruleEString ) ) (otherlv_6= '=' ( (lv_computedExpression_7_0= ruleExpression ) ) otherlv_8= ';' )? )
            {
            // InternalQL.g:2267:2: ( ( (lv_isMandatory_0_0= 'mandatory' ) )? otherlv_1= 'question' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_label_4_0= ruleEString ) ) ( ( ruleEString ) ) (otherlv_6= '=' ( (lv_computedExpression_7_0= ruleExpression ) ) otherlv_8= ';' )? )
            // InternalQL.g:2268:3: ( (lv_isMandatory_0_0= 'mandatory' ) )? otherlv_1= 'question' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_label_4_0= ruleEString ) ) ( ( ruleEString ) ) (otherlv_6= '=' ( (lv_computedExpression_7_0= ruleExpression ) ) otherlv_8= ';' )?
            {
            // InternalQL.g:2268:3: ( (lv_isMandatory_0_0= 'mandatory' ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==59) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalQL.g:2269:4: (lv_isMandatory_0_0= 'mandatory' )
                    {
                    // InternalQL.g:2269:4: (lv_isMandatory_0_0= 'mandatory' )
                    // InternalQL.g:2270:5: lv_isMandatory_0_0= 'mandatory'
                    {
                    lv_isMandatory_0_0=(Token)match(input,59,FOLLOW_31); 

                    					newLeafNode(lv_isMandatory_0_0, grammarAccess.getQuestionDefinitionAccess().getIsMandatoryMandatoryKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getQuestionDefinitionRule());
                    					}
                    					setWithLastConsumed(current, "isMandatory", lv_isMandatory_0_0 != null, "mandatory");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,34,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getQuestionDefinitionAccess().getQuestionKeyword_1());
            		
            // InternalQL.g:2286:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQL.g:2287:4: (lv_name_2_0= ruleEString )
            {
            // InternalQL.g:2287:4: (lv_name_2_0= ruleEString )
            // InternalQL.g:2288:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getQuestionDefinitionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_50);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuestionDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.gemoc.ql.QL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,60,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getQuestionDefinitionAccess().getColonKeyword_3());
            		
            // InternalQL.g:2309:3: ( (lv_label_4_0= ruleEString ) )
            // InternalQL.g:2310:4: (lv_label_4_0= ruleEString )
            {
            // InternalQL.g:2310:4: (lv_label_4_0= ruleEString )
            // InternalQL.g:2311:5: lv_label_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getQuestionDefinitionAccess().getLabelEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_label_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuestionDefinitionRule());
            					}
            					set(
            						current,
            						"label",
            						lv_label_4_0,
            						"org.gemoc.ql.QL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQL.g:2328:3: ( ( ruleEString ) )
            // InternalQL.g:2329:4: ( ruleEString )
            {
            // InternalQL.g:2329:4: ( ruleEString )
            // InternalQL.g:2330:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuestionDefinitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getQuestionDefinitionAccess().getDataTypeValueTypeCrossReference_5_0());
            				
            pushFollow(FOLLOW_51);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQL.g:2344:3: (otherlv_6= '=' ( (lv_computedExpression_7_0= ruleExpression ) ) otherlv_8= ';' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==61) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalQL.g:2345:4: otherlv_6= '=' ( (lv_computedExpression_7_0= ruleExpression ) ) otherlv_8= ';'
                    {
                    otherlv_6=(Token)match(input,61,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getQuestionDefinitionAccess().getEqualsSignKeyword_6_0());
                    			
                    // InternalQL.g:2349:4: ( (lv_computedExpression_7_0= ruleExpression ) )
                    // InternalQL.g:2350:5: (lv_computedExpression_7_0= ruleExpression )
                    {
                    // InternalQL.g:2350:5: (lv_computedExpression_7_0= ruleExpression )
                    // InternalQL.g:2351:6: lv_computedExpression_7_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getQuestionDefinitionAccess().getComputedExpressionExpressionParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_computedExpression_7_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuestionDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"computedExpression",
                    							lv_computedExpression_7_0,
                    							"org.gemoc.ql.QL.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,62,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getQuestionDefinitionAccess().getSemicolonKeyword_6_2());
                    			

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
    // $ANTLR end "ruleQuestionDefinition"


    // $ANTLR start "ruleBinaryOperatorKind"
    // InternalQL.g:2377:1: ruleBinaryOperatorKind returns [Enumerator current=null] : ( (enumLiteral_0= 'PLUS' ) | (enumLiteral_1= 'MINUS' ) | (enumLiteral_2= 'MULT' ) | (enumLiteral_3= 'DIV' ) | (enumLiteral_4= 'EQUAL' ) | (enumLiteral_5= 'NOTEQUAL' ) | (enumLiteral_6= 'GREATER' ) | (enumLiteral_7= 'LOWER' ) | (enumLiteral_8= 'GREATEROREQUAL' ) | (enumLiteral_9= 'LOWEROREQUAL' ) | (enumLiteral_10= 'AND' ) | (enumLiteral_11= 'OR' ) ) ;
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
            // InternalQL.g:2383:2: ( ( (enumLiteral_0= 'PLUS' ) | (enumLiteral_1= 'MINUS' ) | (enumLiteral_2= 'MULT' ) | (enumLiteral_3= 'DIV' ) | (enumLiteral_4= 'EQUAL' ) | (enumLiteral_5= 'NOTEQUAL' ) | (enumLiteral_6= 'GREATER' ) | (enumLiteral_7= 'LOWER' ) | (enumLiteral_8= 'GREATEROREQUAL' ) | (enumLiteral_9= 'LOWEROREQUAL' ) | (enumLiteral_10= 'AND' ) | (enumLiteral_11= 'OR' ) ) )
            // InternalQL.g:2384:2: ( (enumLiteral_0= 'PLUS' ) | (enumLiteral_1= 'MINUS' ) | (enumLiteral_2= 'MULT' ) | (enumLiteral_3= 'DIV' ) | (enumLiteral_4= 'EQUAL' ) | (enumLiteral_5= 'NOTEQUAL' ) | (enumLiteral_6= 'GREATER' ) | (enumLiteral_7= 'LOWER' ) | (enumLiteral_8= 'GREATEROREQUAL' ) | (enumLiteral_9= 'LOWEROREQUAL' ) | (enumLiteral_10= 'AND' ) | (enumLiteral_11= 'OR' ) )
            {
            // InternalQL.g:2384:2: ( (enumLiteral_0= 'PLUS' ) | (enumLiteral_1= 'MINUS' ) | (enumLiteral_2= 'MULT' ) | (enumLiteral_3= 'DIV' ) | (enumLiteral_4= 'EQUAL' ) | (enumLiteral_5= 'NOTEQUAL' ) | (enumLiteral_6= 'GREATER' ) | (enumLiteral_7= 'LOWER' ) | (enumLiteral_8= 'GREATEROREQUAL' ) | (enumLiteral_9= 'LOWEROREQUAL' ) | (enumLiteral_10= 'AND' ) | (enumLiteral_11= 'OR' ) )
            int alt48=12;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt48=1;
                }
                break;
            case 64:
                {
                alt48=2;
                }
                break;
            case 65:
                {
                alt48=3;
                }
                break;
            case 66:
                {
                alt48=4;
                }
                break;
            case 67:
                {
                alt48=5;
                }
                break;
            case 68:
                {
                alt48=6;
                }
                break;
            case 69:
                {
                alt48=7;
                }
                break;
            case 70:
                {
                alt48=8;
                }
                break;
            case 71:
                {
                alt48=9;
                }
                break;
            case 72:
                {
                alt48=10;
                }
                break;
            case 73:
                {
                alt48=11;
                }
                break;
            case 74:
                {
                alt48=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalQL.g:2385:3: (enumLiteral_0= 'PLUS' )
                    {
                    // InternalQL.g:2385:3: (enumLiteral_0= 'PLUS' )
                    // InternalQL.g:2386:4: enumLiteral_0= 'PLUS'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBinaryOperatorKindAccess().getPLUSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:2393:3: (enumLiteral_1= 'MINUS' )
                    {
                    // InternalQL.g:2393:3: (enumLiteral_1= 'MINUS' )
                    // InternalQL.g:2394:4: enumLiteral_1= 'MINUS'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBinaryOperatorKindAccess().getMINUSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalQL.g:2401:3: (enumLiteral_2= 'MULT' )
                    {
                    // InternalQL.g:2401:3: (enumLiteral_2= 'MULT' )
                    // InternalQL.g:2402:4: enumLiteral_2= 'MULT'
                    {
                    enumLiteral_2=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBinaryOperatorKindAccess().getMULTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalQL.g:2409:3: (enumLiteral_3= 'DIV' )
                    {
                    // InternalQL.g:2409:3: (enumLiteral_3= 'DIV' )
                    // InternalQL.g:2410:4: enumLiteral_3= 'DIV'
                    {
                    enumLiteral_3=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getDIVEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBinaryOperatorKindAccess().getDIVEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalQL.g:2417:3: (enumLiteral_4= 'EQUAL' )
                    {
                    // InternalQL.g:2417:3: (enumLiteral_4= 'EQUAL' )
                    // InternalQL.g:2418:4: enumLiteral_4= 'EQUAL'
                    {
                    enumLiteral_4=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getEQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getBinaryOperatorKindAccess().getEQUALEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalQL.g:2425:3: (enumLiteral_5= 'NOTEQUAL' )
                    {
                    // InternalQL.g:2425:3: (enumLiteral_5= 'NOTEQUAL' )
                    // InternalQL.g:2426:4: enumLiteral_5= 'NOTEQUAL'
                    {
                    enumLiteral_5=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getNOTEQUALEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getBinaryOperatorKindAccess().getNOTEQUALEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalQL.g:2433:3: (enumLiteral_6= 'GREATER' )
                    {
                    // InternalQL.g:2433:3: (enumLiteral_6= 'GREATER' )
                    // InternalQL.g:2434:4: enumLiteral_6= 'GREATER'
                    {
                    enumLiteral_6=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getGREATEREnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getBinaryOperatorKindAccess().getGREATEREnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalQL.g:2441:3: (enumLiteral_7= 'LOWER' )
                    {
                    // InternalQL.g:2441:3: (enumLiteral_7= 'LOWER' )
                    // InternalQL.g:2442:4: enumLiteral_7= 'LOWER'
                    {
                    enumLiteral_7=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getLOWEREnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getBinaryOperatorKindAccess().getLOWEREnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalQL.g:2449:3: (enumLiteral_8= 'GREATEROREQUAL' )
                    {
                    // InternalQL.g:2449:3: (enumLiteral_8= 'GREATEROREQUAL' )
                    // InternalQL.g:2450:4: enumLiteral_8= 'GREATEROREQUAL'
                    {
                    enumLiteral_8=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getBinaryOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalQL.g:2457:3: (enumLiteral_9= 'LOWEROREQUAL' )
                    {
                    // InternalQL.g:2457:3: (enumLiteral_9= 'LOWEROREQUAL' )
                    // InternalQL.g:2458:4: enumLiteral_9= 'LOWEROREQUAL'
                    {
                    enumLiteral_9=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getLOWEROREQUALEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getBinaryOperatorKindAccess().getLOWEROREQUALEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalQL.g:2465:3: (enumLiteral_10= 'AND' )
                    {
                    // InternalQL.g:2465:3: (enumLiteral_10= 'AND' )
                    // InternalQL.g:2466:4: enumLiteral_10= 'AND'
                    {
                    enumLiteral_10=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getANDEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getBinaryOperatorKindAccess().getANDEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalQL.g:2473:3: (enumLiteral_11= 'OR' )
                    {
                    // InternalQL.g:2473:3: (enumLiteral_11= 'OR' )
                    // InternalQL.g:2474:4: enumLiteral_11= 'OR'
                    {
                    enumLiteral_11=(Token)match(input,74,FOLLOW_2); 

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
    // InternalQL.g:2484:1: ruleUnaryOperatorKind returns [Enumerator current=null] : ( (enumLiteral_0= 'UNARYMINUS' ) | (enumLiteral_1= 'NOT' ) ) ;
    public final Enumerator ruleUnaryOperatorKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalQL.g:2490:2: ( ( (enumLiteral_0= 'UNARYMINUS' ) | (enumLiteral_1= 'NOT' ) ) )
            // InternalQL.g:2491:2: ( (enumLiteral_0= 'UNARYMINUS' ) | (enumLiteral_1= 'NOT' ) )
            {
            // InternalQL.g:2491:2: ( (enumLiteral_0= 'UNARYMINUS' ) | (enumLiteral_1= 'NOT' ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==75) ) {
                alt49=1;
            }
            else if ( (LA49_0==76) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalQL.g:2492:3: (enumLiteral_0= 'UNARYMINUS' )
                    {
                    // InternalQL.g:2492:3: (enumLiteral_0= 'UNARYMINUS' )
                    // InternalQL.g:2493:4: enumLiteral_0= 'UNARYMINUS'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getUnaryOperatorKindAccess().getUNARYMINUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorKindAccess().getUNARYMINUSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:2500:3: (enumLiteral_1= 'NOT' )
                    {
                    // InternalQL.g:2500:3: (enumLiteral_1= 'NOT' )
                    // InternalQL.g:2501:4: enumLiteral_1= 'NOT'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0800139C00420000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000002A1000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000230030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x8000000000000000L,0x00000000000007FFL});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000044020000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x005D400000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000106000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000104000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000404000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000006000820000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000006000020000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000200000000040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000004000020000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000820000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040000020000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000080000020000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000800000020000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0002000000020000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0020000000020000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0080000000020000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0100200000000040L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0100000000000040L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0600000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x4000000000000000L});

}