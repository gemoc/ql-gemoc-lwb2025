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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'QLModel'", "'('", "'canSubmit'", "'submitDate'", "')'", "'{'", "'}'", "'if'", "'then'", "'else'", "'Form'", "'definitions'", "'EDate'", "'ValueType'", "'unit'", "'booleanType'", "'integerType'", "'min'", "'max'", "'decimalType'", "'dateType'", "'enumerationType'", "'literals'", "','", "'StringValueType'", "'-'", "'IntegerValue'", "'intValue'", "'StringValue'", "'stringValue'", "'booleanValue'", "'BooleanValue'", "'DateValue'", "'dateValue'", "'DecimalValue'", "'decimalValue'", "'.'", "'E'", "'e'", "'mandatory'", "'question'", "'isDisplayed'", "'currentValue'", "':'", "'='", "';'", "'PLUS'", "'MINUS'", "'MULT'", "'DIV'", "'EQUAL'", "'NOTEQUAL'", "'GREATER'", "'LOWER'", "'GREATEROREQUAL'", "'LOWEROREQUAL'", "'AND'", "'OR'", "'not'", "'+'", "'*'", "'/'", "'>'", "'<'", "'>='", "'<='", "'and'", "'or'"
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

                if ( (LA4_0==22) ) {
                    alt4=1;
                }
                else if ( (LA4_0==21) ) {
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
            case 24:
                {
                alt5=1;
                }
                break;
            case 26:
                {
                alt5=2;
                }
                break;
            case 27:
                {
                alt5=3;
                }
                break;
            case 30:
                {
                alt5=4;
                }
                break;
            case 31:
                {
                alt5=5;
                }
                break;
            case 32:
                {
                alt5=6;
                }
                break;
            case 35:
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
    // InternalQL.g:281:1: ruleExpression returns [EObject current=null] : this_UnaryOrPrimaryExpression_0= ruleUnaryOrPrimaryExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryOrPrimaryExpression_0 = null;



        	enterRule();

        try {
            // InternalQL.g:287:2: (this_UnaryOrPrimaryExpression_0= ruleUnaryOrPrimaryExpression )
            // InternalQL.g:288:2: this_UnaryOrPrimaryExpression_0= ruleUnaryOrPrimaryExpression
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getUnaryOrPrimaryExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_UnaryOrPrimaryExpression_0=ruleUnaryOrPrimaryExpression();

            state._fsp--;


            		current = this_UnaryOrPrimaryExpression_0;
            		afterParserOrEnumRuleCall();
            	

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


    // $ANTLR start "entryRuleUnaryOrPrimaryExpression"
    // InternalQL.g:299:1: entryRuleUnaryOrPrimaryExpression returns [EObject current=null] : iv_ruleUnaryOrPrimaryExpression= ruleUnaryOrPrimaryExpression EOF ;
    public final EObject entryRuleUnaryOrPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOrPrimaryExpression = null;


        try {
            // InternalQL.g:299:65: (iv_ruleUnaryOrPrimaryExpression= ruleUnaryOrPrimaryExpression EOF )
            // InternalQL.g:300:2: iv_ruleUnaryOrPrimaryExpression= ruleUnaryOrPrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryOrPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnaryOrPrimaryExpression=ruleUnaryOrPrimaryExpression();

            state._fsp--;

             current =iv_ruleUnaryOrPrimaryExpression; 
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
    // $ANTLR end "entryRuleUnaryOrPrimaryExpression"


    // $ANTLR start "ruleUnaryOrPrimaryExpression"
    // InternalQL.g:306:1: ruleUnaryOrPrimaryExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression | this_UnaryExpression_1= ruleUnaryExpression ) ;
    public final EObject ruleUnaryOrPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        EObject this_UnaryExpression_1 = null;



        	enterRule();

        try {
            // InternalQL.g:312:2: ( (this_PrimaryExpression_0= rulePrimaryExpression | this_UnaryExpression_1= ruleUnaryExpression ) )
            // InternalQL.g:313:2: (this_PrimaryExpression_0= rulePrimaryExpression | this_UnaryExpression_1= ruleUnaryExpression )
            {
            // InternalQL.g:313:2: (this_PrimaryExpression_0= rulePrimaryExpression | this_UnaryExpression_1= ruleUnaryExpression )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)||LA6_0==12||LA6_0==18||LA6_0==37||LA6_0==39||(LA6_0>=41 && LA6_0<=42)||LA6_0==45) ) {
                alt6=1;
            }
            else if ( (LA6_0==36||LA6_0==69) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalQL.g:314:3: this_PrimaryExpression_0= rulePrimaryExpression
                    {

                    			newCompositeNode(grammarAccess.getUnaryOrPrimaryExpressionAccess().getPrimaryExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimaryExpression_0=rulePrimaryExpression();

                    state._fsp--;


                    			current = this_PrimaryExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQL.g:323:3: this_UnaryExpression_1= ruleUnaryExpression
                    {

                    			newCompositeNode(grammarAccess.getUnaryOrPrimaryExpressionAccess().getUnaryExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnaryExpression_1=ruleUnaryExpression();

                    state._fsp--;


                    			current = this_UnaryExpression_1;
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
    // $ANTLR end "ruleUnaryOrPrimaryExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalQL.g:335:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalQL.g:335:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalQL.g:336:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;

             current =iv_ruleUnaryExpression; 
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
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // InternalQL.g:342:1: ruleUnaryExpression returns [EObject current=null] : ( () ( (lv_operator_1_0= ruleUnaryOperatorKind ) ) ( (lv_operand_2_0= ruleUnaryOrPrimaryExpression ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_operand_2_0 = null;



        	enterRule();

        try {
            // InternalQL.g:348:2: ( ( () ( (lv_operator_1_0= ruleUnaryOperatorKind ) ) ( (lv_operand_2_0= ruleUnaryOrPrimaryExpression ) ) ) )
            // InternalQL.g:349:2: ( () ( (lv_operator_1_0= ruleUnaryOperatorKind ) ) ( (lv_operand_2_0= ruleUnaryOrPrimaryExpression ) ) )
            {
            // InternalQL.g:349:2: ( () ( (lv_operator_1_0= ruleUnaryOperatorKind ) ) ( (lv_operand_2_0= ruleUnaryOrPrimaryExpression ) ) )
            // InternalQL.g:350:3: () ( (lv_operator_1_0= ruleUnaryOperatorKind ) ) ( (lv_operand_2_0= ruleUnaryOrPrimaryExpression ) )
            {
            // InternalQL.g:350:3: ()
            // InternalQL.g:351:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUnaryExpressionAccess().getBasicUnaryExpressionAction_0(),
            					current);
            			

            }

            // InternalQL.g:357:3: ( (lv_operator_1_0= ruleUnaryOperatorKind ) )
            // InternalQL.g:358:4: (lv_operator_1_0= ruleUnaryOperatorKind )
            {
            // InternalQL.g:358:4: (lv_operator_1_0= ruleUnaryOperatorKind )
            // InternalQL.g:359:5: lv_operator_1_0= ruleUnaryOperatorKind
            {

            					newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorKindEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_operator_1_0=ruleUnaryOperatorKind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_1_0,
            						"org.gemoc.ql.QL.UnaryOperatorKind");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQL.g:376:3: ( (lv_operand_2_0= ruleUnaryOrPrimaryExpression ) )
            // InternalQL.g:377:4: (lv_operand_2_0= ruleUnaryOrPrimaryExpression )
            {
            // InternalQL.g:377:4: (lv_operand_2_0= ruleUnaryOrPrimaryExpression )
            // InternalQL.g:378:5: lv_operand_2_0= ruleUnaryOrPrimaryExpression
            {

            					newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperandUnaryOrPrimaryExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_operand_2_0=ruleUnaryOrPrimaryExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
            					}
            					set(
            						current,
            						"operand",
            						lv_operand_2_0,
            						"org.gemoc.ql.QL.UnaryOrPrimaryExpression");
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
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalQL.g:399:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalQL.g:399:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalQL.g:400:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalQL.g:406:1: rulePrimaryExpression returns [EObject current=null] : (this_Call_0= ruleCall | this_IfExpression_1= ruleIfExpression | (otherlv_2= '(' (this_OrExpression_3= ruleOrExpression | this_UnaryExpression_4= ruleUnaryExpression ) otherlv_5= ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Call_0 = null;

        EObject this_IfExpression_1 = null;

        EObject this_OrExpression_3 = null;

        EObject this_UnaryExpression_4 = null;



        	enterRule();

        try {
            // InternalQL.g:412:2: ( (this_Call_0= ruleCall | this_IfExpression_1= ruleIfExpression | (otherlv_2= '(' (this_OrExpression_3= ruleOrExpression | this_UnaryExpression_4= ruleUnaryExpression ) otherlv_5= ')' ) ) )
            // InternalQL.g:413:2: (this_Call_0= ruleCall | this_IfExpression_1= ruleIfExpression | (otherlv_2= '(' (this_OrExpression_3= ruleOrExpression | this_UnaryExpression_4= ruleUnaryExpression ) otherlv_5= ')' ) )
            {
            // InternalQL.g:413:2: (this_Call_0= ruleCall | this_IfExpression_1= ruleIfExpression | (otherlv_2= '(' (this_OrExpression_3= ruleOrExpression | this_UnaryExpression_4= ruleUnaryExpression ) otherlv_5= ')' ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
            case 37:
            case 39:
            case 41:
            case 42:
            case 45:
                {
                alt8=1;
                }
                break;
            case 18:
                {
                alt8=2;
                }
                break;
            case 12:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalQL.g:414:3: this_Call_0= ruleCall
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getCallParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Call_0=ruleCall();

                    state._fsp--;


                    			current = this_Call_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQL.g:423:3: this_IfExpression_1= ruleIfExpression
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getIfExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfExpression_1=ruleIfExpression();

                    state._fsp--;


                    			current = this_IfExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalQL.g:432:3: (otherlv_2= '(' (this_OrExpression_3= ruleOrExpression | this_UnaryExpression_4= ruleUnaryExpression ) otherlv_5= ')' )
                    {
                    // InternalQL.g:432:3: (otherlv_2= '(' (this_OrExpression_3= ruleOrExpression | this_UnaryExpression_4= ruleUnaryExpression ) otherlv_5= ')' )
                    // InternalQL.g:433:4: otherlv_2= '(' (this_OrExpression_3= ruleOrExpression | this_UnaryExpression_4= ruleUnaryExpression ) otherlv_5= ')'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalQL.g:437:4: (this_OrExpression_3= ruleOrExpression | this_UnaryExpression_4= ruleUnaryExpression )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)||LA7_0==12||LA7_0==18||LA7_0==37||LA7_0==39||(LA7_0>=41 && LA7_0<=42)||LA7_0==45) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==36||LA7_0==69) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalQL.g:438:5: this_OrExpression_3= ruleOrExpression
                            {

                            					newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOrExpressionParserRuleCall_2_1_0());
                            				
                            pushFollow(FOLLOW_7);
                            this_OrExpression_3=ruleOrExpression();

                            state._fsp--;


                            					current = this_OrExpression_3;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 2 :
                            // InternalQL.g:447:5: this_UnaryExpression_4= ruleUnaryExpression
                            {

                            					newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getUnaryExpressionParserRuleCall_2_1_1());
                            				
                            pushFollow(FOLLOW_7);
                            this_UnaryExpression_4=ruleUnaryExpression();

                            state._fsp--;


                            					current = this_UnaryExpression_4;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_2());
                    			

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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleIfExpression"
    // InternalQL.g:465:1: entryRuleIfExpression returns [EObject current=null] : iv_ruleIfExpression= ruleIfExpression EOF ;
    public final EObject entryRuleIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpression = null;


        try {
            // InternalQL.g:465:53: (iv_ruleIfExpression= ruleIfExpression EOF )
            // InternalQL.g:466:2: iv_ruleIfExpression= ruleIfExpression EOF
            {
             newCompositeNode(grammarAccess.getIfExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfExpression=ruleIfExpression();

            state._fsp--;

             current =iv_ruleIfExpression; 
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
    // $ANTLR end "entryRuleIfExpression"


    // $ANTLR start "ruleIfExpression"
    // InternalQL.g:472:1: ruleIfExpression returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'then' otherlv_5= '(' ( (lv_thenExpression_6_0= ruleExpression ) ) otherlv_7= ')' (otherlv_8= 'else' otherlv_9= '(' ( (lv_elseExpression_10_0= ruleExpression ) ) otherlv_11= ')' )? ) ;
    public final EObject ruleIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_condition_2_0 = null;

        EObject lv_thenExpression_6_0 = null;

        EObject lv_elseExpression_10_0 = null;



        	enterRule();

        try {
            // InternalQL.g:478:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'then' otherlv_5= '(' ( (lv_thenExpression_6_0= ruleExpression ) ) otherlv_7= ')' (otherlv_8= 'else' otherlv_9= '(' ( (lv_elseExpression_10_0= ruleExpression ) ) otherlv_11= ')' )? ) )
            // InternalQL.g:479:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'then' otherlv_5= '(' ( (lv_thenExpression_6_0= ruleExpression ) ) otherlv_7= ')' (otherlv_8= 'else' otherlv_9= '(' ( (lv_elseExpression_10_0= ruleExpression ) ) otherlv_11= ')' )? )
            {
            // InternalQL.g:479:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'then' otherlv_5= '(' ( (lv_thenExpression_6_0= ruleExpression ) ) otherlv_7= ')' (otherlv_8= 'else' otherlv_9= '(' ( (lv_elseExpression_10_0= ruleExpression ) ) otherlv_11= ')' )? )
            // InternalQL.g:480:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'then' otherlv_5= '(' ( (lv_thenExpression_6_0= ruleExpression ) ) otherlv_7= ')' (otherlv_8= 'else' otherlv_9= '(' ( (lv_elseExpression_10_0= ruleExpression ) ) otherlv_11= ')' )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getIfExpressionAccess().getIfKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getIfExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalQL.g:488:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalQL.g:489:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalQL.g:489:4: (lv_condition_2_0= ruleExpression )
            // InternalQL.g:490:5: lv_condition_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfExpressionAccess().getConditionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_condition_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfExpressionRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"org.gemoc.ql.QL.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getIfExpressionAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getIfExpressionAccess().getThenKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getIfExpressionAccess().getLeftParenthesisKeyword_5());
            		
            // InternalQL.g:519:3: ( (lv_thenExpression_6_0= ruleExpression ) )
            // InternalQL.g:520:4: (lv_thenExpression_6_0= ruleExpression )
            {
            // InternalQL.g:520:4: (lv_thenExpression_6_0= ruleExpression )
            // InternalQL.g:521:5: lv_thenExpression_6_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfExpressionAccess().getThenExpressionExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_thenExpression_6_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfExpressionRule());
            					}
            					set(
            						current,
            						"thenExpression",
            						lv_thenExpression_6_0,
            						"org.gemoc.ql.QL.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getIfExpressionAccess().getRightParenthesisKeyword_7());
            		
            // InternalQL.g:542:3: (otherlv_8= 'else' otherlv_9= '(' ( (lv_elseExpression_10_0= ruleExpression ) ) otherlv_11= ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalQL.g:543:4: otherlv_8= 'else' otherlv_9= '(' ( (lv_elseExpression_10_0= ruleExpression ) ) otherlv_11= ')'
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_11); 

                    				newLeafNode(otherlv_8, grammarAccess.getIfExpressionAccess().getElseKeyword_8_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getIfExpressionAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalQL.g:551:4: ( (lv_elseExpression_10_0= ruleExpression ) )
                    // InternalQL.g:552:5: (lv_elseExpression_10_0= ruleExpression )
                    {
                    // InternalQL.g:552:5: (lv_elseExpression_10_0= ruleExpression )
                    // InternalQL.g:553:6: lv_elseExpression_10_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getIfExpressionAccess().getElseExpressionExpressionParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_elseExpression_10_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfExpressionRule());
                    						}
                    						set(
                    							current,
                    							"elseExpression",
                    							lv_elseExpression_10_0,
                    							"org.gemoc.ql.QL.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getIfExpressionAccess().getRightParenthesisKeyword_8_3());
                    			

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
    // $ANTLR end "ruleIfExpression"


    // $ANTLR start "entryRuleOrExpression"
    // InternalQL.g:579:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalQL.g:579:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalQL.g:580:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
             newCompositeNode(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;

             current =iv_ruleOrExpression; 
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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalQL.g:586:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rhsOperand_3_0 = null;



        	enterRule();

        try {
            // InternalQL.g:592:2: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAndExpression ) ) )* ) )
            // InternalQL.g:593:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAndExpression ) ) )* )
            {
            // InternalQL.g:593:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAndExpression ) ) )* )
            // InternalQL.g:594:3: this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current = this_AndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalQL.g:602:3: ( () ( (lv_operator_2_0= ruleOrOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAndExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==78) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalQL.g:603:4: () ( (lv_operator_2_0= ruleOrOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAndExpression ) )
            	    {
            	    // InternalQL.g:603:4: ()
            	    // InternalQL.g:604:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalQL.g:610:4: ( (lv_operator_2_0= ruleOrOperatorKind ) )
            	    // InternalQL.g:611:5: (lv_operator_2_0= ruleOrOperatorKind )
            	    {
            	    // InternalQL.g:611:5: (lv_operator_2_0= ruleOrOperatorKind )
            	    // InternalQL.g:612:6: lv_operator_2_0= ruleOrOperatorKind
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorKindEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_operator_2_0=ruleOrOperatorKind();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"org.gemoc.ql.QL.OrOperatorKind");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalQL.g:629:4: ( (lv_rhsOperand_3_0= ruleAndExpression ) )
            	    // InternalQL.g:630:5: (lv_rhsOperand_3_0= ruleAndExpression )
            	    {
            	    // InternalQL.g:630:5: (lv_rhsOperand_3_0= ruleAndExpression )
            	    // InternalQL.g:631:6: lv_rhsOperand_3_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getRhsOperandAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_rhsOperand_3_0=ruleAndExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"rhsOperand",
            	    							lv_rhsOperand_3_0,
            	    							"org.gemoc.ql.QL.AndExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalQL.g:653:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalQL.g:653:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalQL.g:654:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalQL.g:660:1: ruleAndExpression returns [EObject current=null] : (this_EqualExpression_0= ruleEqualExpression ( () ( (lv_operator_2_0= ruleAndOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleEqualExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EqualExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rhsOperand_3_0 = null;



        	enterRule();

        try {
            // InternalQL.g:666:2: ( (this_EqualExpression_0= ruleEqualExpression ( () ( (lv_operator_2_0= ruleAndOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleEqualExpression ) ) )* ) )
            // InternalQL.g:667:2: (this_EqualExpression_0= ruleEqualExpression ( () ( (lv_operator_2_0= ruleAndOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleEqualExpression ) ) )* )
            {
            // InternalQL.g:667:2: (this_EqualExpression_0= ruleEqualExpression ( () ( (lv_operator_2_0= ruleAndOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleEqualExpression ) ) )* )
            // InternalQL.g:668:3: this_EqualExpression_0= ruleEqualExpression ( () ( (lv_operator_2_0= ruleAndOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleEqualExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_EqualExpression_0=ruleEqualExpression();

            state._fsp--;


            			current = this_EqualExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalQL.g:676:3: ( () ( (lv_operator_2_0= ruleAndOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleEqualExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==77) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalQL.g:677:4: () ( (lv_operator_2_0= ruleAndOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleEqualExpression ) )
            	    {
            	    // InternalQL.g:677:4: ()
            	    // InternalQL.g:678:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalQL.g:684:4: ( (lv_operator_2_0= ruleAndOperatorKind ) )
            	    // InternalQL.g:685:5: (lv_operator_2_0= ruleAndOperatorKind )
            	    {
            	    // InternalQL.g:685:5: (lv_operator_2_0= ruleAndOperatorKind )
            	    // InternalQL.g:686:6: lv_operator_2_0= ruleAndOperatorKind
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorKindEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_operator_2_0=ruleAndOperatorKind();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"org.gemoc.ql.QL.AndOperatorKind");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalQL.g:703:4: ( (lv_rhsOperand_3_0= ruleEqualExpression ) )
            	    // InternalQL.g:704:5: (lv_rhsOperand_3_0= ruleEqualExpression )
            	    {
            	    // InternalQL.g:704:5: (lv_rhsOperand_3_0= ruleEqualExpression )
            	    // InternalQL.g:705:6: lv_rhsOperand_3_0= ruleEqualExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getRhsOperandEqualExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_rhsOperand_3_0=ruleEqualExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"rhsOperand",
            	    							lv_rhsOperand_3_0,
            	    							"org.gemoc.ql.QL.EqualExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleEqualExpression"
    // InternalQL.g:727:1: entryRuleEqualExpression returns [EObject current=null] : iv_ruleEqualExpression= ruleEqualExpression EOF ;
    public final EObject entryRuleEqualExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualExpression = null;


        try {
            // InternalQL.g:727:56: (iv_ruleEqualExpression= ruleEqualExpression EOF )
            // InternalQL.g:728:2: iv_ruleEqualExpression= ruleEqualExpression EOF
            {
             newCompositeNode(grammarAccess.getEqualExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqualExpression=ruleEqualExpression();

            state._fsp--;

             current =iv_ruleEqualExpression; 
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
    // $ANTLR end "entryRuleEqualExpression"


    // $ANTLR start "ruleEqualExpression"
    // InternalQL.g:734:1: ruleEqualExpression returns [EObject current=null] : (this_ComparisionExpression_0= ruleComparisionExpression ( () ( (lv_operator_2_0= ruleEqualOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleComparisionExpression ) ) )* ) ;
    public final EObject ruleEqualExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ComparisionExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rhsOperand_3_0 = null;



        	enterRule();

        try {
            // InternalQL.g:740:2: ( (this_ComparisionExpression_0= ruleComparisionExpression ( () ( (lv_operator_2_0= ruleEqualOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleComparisionExpression ) ) )* ) )
            // InternalQL.g:741:2: (this_ComparisionExpression_0= ruleComparisionExpression ( () ( (lv_operator_2_0= ruleEqualOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleComparisionExpression ) ) )* )
            {
            // InternalQL.g:741:2: (this_ComparisionExpression_0= ruleComparisionExpression ( () ( (lv_operator_2_0= ruleEqualOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleComparisionExpression ) ) )* )
            // InternalQL.g:742:3: this_ComparisionExpression_0= ruleComparisionExpression ( () ( (lv_operator_2_0= ruleEqualOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleComparisionExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualExpressionAccess().getComparisionExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_ComparisionExpression_0=ruleComparisionExpression();

            state._fsp--;


            			current = this_ComparisionExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalQL.g:750:3: ( () ( (lv_operator_2_0= ruleEqualOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleComparisionExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==55) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalQL.g:751:4: () ( (lv_operator_2_0= ruleEqualOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleComparisionExpression ) )
            	    {
            	    // InternalQL.g:751:4: ()
            	    // InternalQL.g:752:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalQL.g:758:4: ( (lv_operator_2_0= ruleEqualOperatorKind ) )
            	    // InternalQL.g:759:5: (lv_operator_2_0= ruleEqualOperatorKind )
            	    {
            	    // InternalQL.g:759:5: (lv_operator_2_0= ruleEqualOperatorKind )
            	    // InternalQL.g:760:6: lv_operator_2_0= ruleEqualOperatorKind
            	    {

            	    						newCompositeNode(grammarAccess.getEqualExpressionAccess().getOperatorEqualOperatorKindEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_operator_2_0=ruleEqualOperatorKind();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqualExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"org.gemoc.ql.QL.EqualOperatorKind");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalQL.g:777:4: ( (lv_rhsOperand_3_0= ruleComparisionExpression ) )
            	    // InternalQL.g:778:5: (lv_rhsOperand_3_0= ruleComparisionExpression )
            	    {
            	    // InternalQL.g:778:5: (lv_rhsOperand_3_0= ruleComparisionExpression )
            	    // InternalQL.g:779:6: lv_rhsOperand_3_0= ruleComparisionExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEqualExpressionAccess().getRhsOperandComparisionExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_rhsOperand_3_0=ruleComparisionExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqualExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"rhsOperand",
            	    							lv_rhsOperand_3_0,
            	    							"org.gemoc.ql.QL.ComparisionExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


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
    // $ANTLR end "ruleEqualExpression"


    // $ANTLR start "entryRuleComparisionExpression"
    // InternalQL.g:801:1: entryRuleComparisionExpression returns [EObject current=null] : iv_ruleComparisionExpression= ruleComparisionExpression EOF ;
    public final EObject entryRuleComparisionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisionExpression = null;


        try {
            // InternalQL.g:801:62: (iv_ruleComparisionExpression= ruleComparisionExpression EOF )
            // InternalQL.g:802:2: iv_ruleComparisionExpression= ruleComparisionExpression EOF
            {
             newCompositeNode(grammarAccess.getComparisionExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparisionExpression=ruleComparisionExpression();

            state._fsp--;

             current =iv_ruleComparisionExpression; 
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
    // $ANTLR end "entryRuleComparisionExpression"


    // $ANTLR start "ruleComparisionExpression"
    // InternalQL.g:808:1: ruleComparisionExpression returns [EObject current=null] : (this_AdditionExpression_0= ruleAdditionExpression ( () ( (lv_operator_2_0= ruleComparisionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAdditionExpression ) ) )* ) ;
    public final EObject ruleComparisionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditionExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rhsOperand_3_0 = null;



        	enterRule();

        try {
            // InternalQL.g:814:2: ( (this_AdditionExpression_0= ruleAdditionExpression ( () ( (lv_operator_2_0= ruleComparisionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAdditionExpression ) ) )* ) )
            // InternalQL.g:815:2: (this_AdditionExpression_0= ruleAdditionExpression ( () ( (lv_operator_2_0= ruleComparisionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAdditionExpression ) ) )* )
            {
            // InternalQL.g:815:2: (this_AdditionExpression_0= ruleAdditionExpression ( () ( (lv_operator_2_0= ruleComparisionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAdditionExpression ) ) )* )
            // InternalQL.g:816:3: this_AdditionExpression_0= ruleAdditionExpression ( () ( (lv_operator_2_0= ruleComparisionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAdditionExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisionExpressionAccess().getAdditionExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_AdditionExpression_0=ruleAdditionExpression();

            state._fsp--;


            			current = this_AdditionExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalQL.g:824:3: ( () ( (lv_operator_2_0= ruleComparisionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAdditionExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=73 && LA13_0<=76)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalQL.g:825:4: () ( (lv_operator_2_0= ruleComparisionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAdditionExpression ) )
            	    {
            	    // InternalQL.g:825:4: ()
            	    // InternalQL.g:826:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisionExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalQL.g:832:4: ( (lv_operator_2_0= ruleComparisionOperatorKind ) )
            	    // InternalQL.g:833:5: (lv_operator_2_0= ruleComparisionOperatorKind )
            	    {
            	    // InternalQL.g:833:5: (lv_operator_2_0= ruleComparisionOperatorKind )
            	    // InternalQL.g:834:6: lv_operator_2_0= ruleComparisionOperatorKind
            	    {

            	    						newCompositeNode(grammarAccess.getComparisionExpressionAccess().getOperatorComparisionOperatorKindEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_operator_2_0=ruleComparisionOperatorKind();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComparisionExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"org.gemoc.ql.QL.ComparisionOperatorKind");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalQL.g:851:4: ( (lv_rhsOperand_3_0= ruleAdditionExpression ) )
            	    // InternalQL.g:852:5: (lv_rhsOperand_3_0= ruleAdditionExpression )
            	    {
            	    // InternalQL.g:852:5: (lv_rhsOperand_3_0= ruleAdditionExpression )
            	    // InternalQL.g:853:6: lv_rhsOperand_3_0= ruleAdditionExpression
            	    {

            	    						newCompositeNode(grammarAccess.getComparisionExpressionAccess().getRhsOperandAdditionExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_rhsOperand_3_0=ruleAdditionExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComparisionExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"rhsOperand",
            	    							lv_rhsOperand_3_0,
            	    							"org.gemoc.ql.QL.AdditionExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


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
    // $ANTLR end "ruleComparisionExpression"


    // $ANTLR start "entryRuleAdditionExpression"
    // InternalQL.g:875:1: entryRuleAdditionExpression returns [EObject current=null] : iv_ruleAdditionExpression= ruleAdditionExpression EOF ;
    public final EObject entryRuleAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionExpression = null;


        try {
            // InternalQL.g:875:59: (iv_ruleAdditionExpression= ruleAdditionExpression EOF )
            // InternalQL.g:876:2: iv_ruleAdditionExpression= ruleAdditionExpression EOF
            {
             newCompositeNode(grammarAccess.getAdditionExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdditionExpression=ruleAdditionExpression();

            state._fsp--;

             current =iv_ruleAdditionExpression; 
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
    // $ANTLR end "entryRuleAdditionExpression"


    // $ANTLR start "ruleAdditionExpression"
    // InternalQL.g:882:1: ruleAdditionExpression returns [EObject current=null] : (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleMultiplicationExpression ) ) )* ) ;
    public final EObject ruleAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicationExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rhsOperand_3_0 = null;



        	enterRule();

        try {
            // InternalQL.g:888:2: ( (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleMultiplicationExpression ) ) )* ) )
            // InternalQL.g:889:2: (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleMultiplicationExpression ) ) )* )
            {
            // InternalQL.g:889:2: (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleMultiplicationExpression ) ) )* )
            // InternalQL.g:890:3: this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleMultiplicationExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditionExpressionAccess().getMultiplicationExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_MultiplicationExpression_0=ruleMultiplicationExpression();

            state._fsp--;


            			current = this_MultiplicationExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalQL.g:898:3: ( () ( (lv_operator_2_0= ruleAdditionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleMultiplicationExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==36||LA14_0==70) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalQL.g:899:4: () ( (lv_operator_2_0= ruleAdditionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleMultiplicationExpression ) )
            	    {
            	    // InternalQL.g:899:4: ()
            	    // InternalQL.g:900:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditionExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalQL.g:906:4: ( (lv_operator_2_0= ruleAdditionOperatorKind ) )
            	    // InternalQL.g:907:5: (lv_operator_2_0= ruleAdditionOperatorKind )
            	    {
            	    // InternalQL.g:907:5: (lv_operator_2_0= ruleAdditionOperatorKind )
            	    // InternalQL.g:908:6: lv_operator_2_0= ruleAdditionOperatorKind
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionExpressionAccess().getOperatorAdditionOperatorKindEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_operator_2_0=ruleAdditionOperatorKind();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditionExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"org.gemoc.ql.QL.AdditionOperatorKind");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalQL.g:925:4: ( (lv_rhsOperand_3_0= ruleMultiplicationExpression ) )
            	    // InternalQL.g:926:5: (lv_rhsOperand_3_0= ruleMultiplicationExpression )
            	    {
            	    // InternalQL.g:926:5: (lv_rhsOperand_3_0= ruleMultiplicationExpression )
            	    // InternalQL.g:927:6: lv_rhsOperand_3_0= ruleMultiplicationExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionExpressionAccess().getRhsOperandMultiplicationExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_rhsOperand_3_0=ruleMultiplicationExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditionExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"rhsOperand",
            	    							lv_rhsOperand_3_0,
            	    							"org.gemoc.ql.QL.MultiplicationExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


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
    // $ANTLR end "ruleAdditionExpression"


    // $ANTLR start "entryRuleMultiplicationExpression"
    // InternalQL.g:949:1: entryRuleMultiplicationExpression returns [EObject current=null] : iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF ;
    public final EObject entryRuleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationExpression = null;


        try {
            // InternalQL.g:949:65: (iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF )
            // InternalQL.g:950:2: iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicationExpression=ruleMultiplicationExpression();

            state._fsp--;

             current =iv_ruleMultiplicationExpression; 
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
    // $ANTLR end "entryRuleMultiplicationExpression"


    // $ANTLR start "ruleMultiplicationExpression"
    // InternalQL.g:956:1: ruleMultiplicationExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_operator_2_0= ruleMultiplicationOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression ) ) )* ) ;
    public final EObject ruleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rhsOperand_3_0 = null;



        	enterRule();

        try {
            // InternalQL.g:962:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_operator_2_0= ruleMultiplicationOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression ) ) )* ) )
            // InternalQL.g:963:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_operator_2_0= ruleMultiplicationOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression ) ) )* )
            {
            // InternalQL.g:963:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_operator_2_0= ruleMultiplicationOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression ) ) )* )
            // InternalQL.g:964:3: this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_operator_2_0= ruleMultiplicationOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getPrimaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;


            			current = this_PrimaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalQL.g:972:3: ( () ( (lv_operator_2_0= ruleMultiplicationOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=71 && LA15_0<=72)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalQL.g:973:4: () ( (lv_operator_2_0= ruleMultiplicationOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression ) )
            	    {
            	    // InternalQL.g:973:4: ()
            	    // InternalQL.g:974:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicationExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalQL.g:980:4: ( (lv_operator_2_0= ruleMultiplicationOperatorKind ) )
            	    // InternalQL.g:981:5: (lv_operator_2_0= ruleMultiplicationOperatorKind )
            	    {
            	    // InternalQL.g:981:5: (lv_operator_2_0= ruleMultiplicationOperatorKind )
            	    // InternalQL.g:982:6: lv_operator_2_0= ruleMultiplicationOperatorKind
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getOperatorMultiplicationOperatorKindEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_operator_2_0=ruleMultiplicationOperatorKind();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicationExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"org.gemoc.ql.QL.MultiplicationOperatorKind");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalQL.g:999:4: ( (lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression ) )
            	    // InternalQL.g:1000:5: (lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression )
            	    {
            	    // InternalQL.g:1000:5: (lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression )
            	    // InternalQL.g:1001:6: lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getRhsOperandUnaryOrPrimaryExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_rhsOperand_3_0=ruleUnaryOrPrimaryExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicationExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"rhsOperand",
            	    							lv_rhsOperand_3_0,
            	    							"org.gemoc.ql.QL.UnaryOrPrimaryExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


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
    // $ANTLR end "ruleMultiplicationExpression"


    // $ANTLR start "entryRuleCall"
    // InternalQL.g:1023:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // InternalQL.g:1023:45: (iv_ruleCall= ruleCall EOF )
            // InternalQL.g:1024:2: iv_ruleCall= ruleCall EOF
            {
             newCompositeNode(grammarAccess.getCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCall=ruleCall();

            state._fsp--;

             current =iv_ruleCall; 
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
    // $ANTLR end "entryRuleCall"


    // $ANTLR start "ruleCall"
    // InternalQL.g:1030:1: ruleCall returns [EObject current=null] : (this_ConstantCall_0= ruleConstantCall | this_QuestionCall_1= ruleQuestionCall ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

        EObject this_ConstantCall_0 = null;

        EObject this_QuestionCall_1 = null;



        	enterRule();

        try {
            // InternalQL.g:1036:2: ( (this_ConstantCall_0= ruleConstantCall | this_QuestionCall_1= ruleQuestionCall ) )
            // InternalQL.g:1037:2: (this_ConstantCall_0= ruleConstantCall | this_QuestionCall_1= ruleQuestionCall )
            {
            // InternalQL.g:1037:2: (this_ConstantCall_0= ruleConstantCall | this_QuestionCall_1= ruleQuestionCall )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==37||LA16_0==39||(LA16_0>=41 && LA16_0<=42)||LA16_0==45) ) {
                alt16=1;
            }
            else if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalQL.g:1038:3: this_ConstantCall_0= ruleConstantCall
                    {

                    			newCompositeNode(grammarAccess.getCallAccess().getConstantCallParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConstantCall_0=ruleConstantCall();

                    state._fsp--;


                    			current = this_ConstantCall_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQL.g:1047:3: this_QuestionCall_1= ruleQuestionCall
                    {

                    			newCompositeNode(grammarAccess.getCallAccess().getQuestionCallParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_QuestionCall_1=ruleQuestionCall();

                    state._fsp--;


                    			current = this_QuestionCall_1;
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
    // $ANTLR end "ruleCall"


    // $ANTLR start "entryRuleValue"
    // InternalQL.g:1059:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalQL.g:1059:46: (iv_ruleValue= ruleValue EOF )
            // InternalQL.g:1060:2: iv_ruleValue= ruleValue EOF
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
    // InternalQL.g:1066:1: ruleValue returns [EObject current=null] : (this_IntegerValue_0= ruleIntegerValue | this_StringValue_1= ruleStringValue | this_BooleanValue_2= ruleBooleanValue | this_DateValue_3= ruleDateValue | this_DecimalValue_4= ruleDecimalValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerValue_0 = null;

        EObject this_StringValue_1 = null;

        EObject this_BooleanValue_2 = null;

        EObject this_DateValue_3 = null;

        EObject this_DecimalValue_4 = null;



        	enterRule();

        try {
            // InternalQL.g:1072:2: ( (this_IntegerValue_0= ruleIntegerValue | this_StringValue_1= ruleStringValue | this_BooleanValue_2= ruleBooleanValue | this_DateValue_3= ruleDateValue | this_DecimalValue_4= ruleDecimalValue ) )
            // InternalQL.g:1073:2: (this_IntegerValue_0= ruleIntegerValue | this_StringValue_1= ruleStringValue | this_BooleanValue_2= ruleBooleanValue | this_DateValue_3= ruleDateValue | this_DecimalValue_4= ruleDecimalValue )
            {
            // InternalQL.g:1073:2: (this_IntegerValue_0= ruleIntegerValue | this_StringValue_1= ruleStringValue | this_BooleanValue_2= ruleBooleanValue | this_DateValue_3= ruleDateValue | this_DecimalValue_4= ruleDecimalValue )
            int alt17=5;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt17=1;
                }
                break;
            case 39:
                {
                alt17=2;
                }
                break;
            case 41:
            case 42:
                {
                alt17=3;
                }
                break;
            case 43:
                {
                alt17=4;
                }
                break;
            case 45:
                {
                alt17=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalQL.g:1074:3: this_IntegerValue_0= ruleIntegerValue
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
                    // InternalQL.g:1083:3: this_StringValue_1= ruleStringValue
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
                    // InternalQL.g:1092:3: this_BooleanValue_2= ruleBooleanValue
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
                    // InternalQL.g:1101:3: this_DateValue_3= ruleDateValue
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
                    // InternalQL.g:1110:3: this_DecimalValue_4= ruleDecimalValue
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
    // InternalQL.g:1122:1: entryRuleForm returns [EObject current=null] : iv_ruleForm= ruleForm EOF ;
    public final EObject entryRuleForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForm = null;


        try {
            // InternalQL.g:1122:45: (iv_ruleForm= ruleForm EOF )
            // InternalQL.g:1123:2: iv_ruleForm= ruleForm EOF
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
    // InternalQL.g:1129:1: ruleForm returns [EObject current=null] : (otherlv_0= 'Form' ( (lv_name_1_0= ruleEString ) ) ( (lv_questionGroup_2_0= ruleQuestionGroup ) ) ) ;
    public final EObject ruleForm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_questionGroup_2_0 = null;



        	enterRule();

        try {
            // InternalQL.g:1135:2: ( (otherlv_0= 'Form' ( (lv_name_1_0= ruleEString ) ) ( (lv_questionGroup_2_0= ruleQuestionGroup ) ) ) )
            // InternalQL.g:1136:2: (otherlv_0= 'Form' ( (lv_name_1_0= ruleEString ) ) ( (lv_questionGroup_2_0= ruleQuestionGroup ) ) )
            {
            // InternalQL.g:1136:2: (otherlv_0= 'Form' ( (lv_name_1_0= ruleEString ) ) ( (lv_questionGroup_2_0= ruleQuestionGroup ) ) )
            // InternalQL.g:1137:3: otherlv_0= 'Form' ( (lv_name_1_0= ruleEString ) ) ( (lv_questionGroup_2_0= ruleQuestionGroup ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getFormAccess().getFormKeyword_0());
            		
            // InternalQL.g:1141:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQL.g:1142:4: (lv_name_1_0= ruleEString )
            {
            // InternalQL.g:1142:4: (lv_name_1_0= ruleEString )
            // InternalQL.g:1143:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFormAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
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

            // InternalQL.g:1160:3: ( (lv_questionGroup_2_0= ruleQuestionGroup ) )
            // InternalQL.g:1161:4: (lv_questionGroup_2_0= ruleQuestionGroup )
            {
            // InternalQL.g:1161:4: (lv_questionGroup_2_0= ruleQuestionGroup )
            // InternalQL.g:1162:5: lv_questionGroup_2_0= ruleQuestionGroup
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
    // InternalQL.g:1183:1: entryRuleDefinitionGroup returns [EObject current=null] : iv_ruleDefinitionGroup= ruleDefinitionGroup EOF ;
    public final EObject entryRuleDefinitionGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionGroup = null;


        try {
            // InternalQL.g:1183:56: (iv_ruleDefinitionGroup= ruleDefinitionGroup EOF )
            // InternalQL.g:1184:2: iv_ruleDefinitionGroup= ruleDefinitionGroup EOF
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
    // InternalQL.g:1190:1: ruleDefinitionGroup returns [EObject current=null] : ( () otherlv_1= 'definitions' otherlv_2= '{' ( ( (lv_questionDefinitions_3_0= ruleQuestionDefinition ) ) | ( (lv_dataTypes_4_0= ruleValueType ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleDefinitionGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_questionDefinitions_3_0 = null;

        EObject lv_dataTypes_4_0 = null;



        	enterRule();

        try {
            // InternalQL.g:1196:2: ( ( () otherlv_1= 'definitions' otherlv_2= '{' ( ( (lv_questionDefinitions_3_0= ruleQuestionDefinition ) ) | ( (lv_dataTypes_4_0= ruleValueType ) ) )* otherlv_5= '}' ) )
            // InternalQL.g:1197:2: ( () otherlv_1= 'definitions' otherlv_2= '{' ( ( (lv_questionDefinitions_3_0= ruleQuestionDefinition ) ) | ( (lv_dataTypes_4_0= ruleValueType ) ) )* otherlv_5= '}' )
            {
            // InternalQL.g:1197:2: ( () otherlv_1= 'definitions' otherlv_2= '{' ( ( (lv_questionDefinitions_3_0= ruleQuestionDefinition ) ) | ( (lv_dataTypes_4_0= ruleValueType ) ) )* otherlv_5= '}' )
            // InternalQL.g:1198:3: () otherlv_1= 'definitions' otherlv_2= '{' ( ( (lv_questionDefinitions_3_0= ruleQuestionDefinition ) ) | ( (lv_dataTypes_4_0= ruleValueType ) ) )* otherlv_5= '}'
            {
            // InternalQL.g:1198:3: ()
            // InternalQL.g:1199:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDefinitionGroupAccess().getDefinitionGroupAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getDefinitionGroupAccess().getDefinitionsKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getDefinitionGroupAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQL.g:1213:3: ( ( (lv_questionDefinitions_3_0= ruleQuestionDefinition ) ) | ( (lv_dataTypes_4_0= ruleValueType ) ) )*
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=50 && LA18_0<=51)) ) {
                    alt18=1;
                }
                else if ( (LA18_0==24||(LA18_0>=26 && LA18_0<=27)||(LA18_0>=30 && LA18_0<=32)||LA18_0==35) ) {
                    alt18=2;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalQL.g:1214:4: ( (lv_questionDefinitions_3_0= ruleQuestionDefinition ) )
            	    {
            	    // InternalQL.g:1214:4: ( (lv_questionDefinitions_3_0= ruleQuestionDefinition ) )
            	    // InternalQL.g:1215:5: (lv_questionDefinitions_3_0= ruleQuestionDefinition )
            	    {
            	    // InternalQL.g:1215:5: (lv_questionDefinitions_3_0= ruleQuestionDefinition )
            	    // InternalQL.g:1216:6: lv_questionDefinitions_3_0= ruleQuestionDefinition
            	    {

            	    						newCompositeNode(grammarAccess.getDefinitionGroupAccess().getQuestionDefinitionsQuestionDefinitionParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_23);
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
            	    // InternalQL.g:1234:4: ( (lv_dataTypes_4_0= ruleValueType ) )
            	    {
            	    // InternalQL.g:1234:4: ( (lv_dataTypes_4_0= ruleValueType ) )
            	    // InternalQL.g:1235:5: (lv_dataTypes_4_0= ruleValueType )
            	    {
            	    // InternalQL.g:1235:5: (lv_dataTypes_4_0= ruleValueType )
            	    // InternalQL.g:1236:6: lv_dataTypes_4_0= ruleValueType
            	    {

            	    						newCompositeNode(grammarAccess.getDefinitionGroupAccess().getDataTypesValueTypeParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
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
            	    break loop18;
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
    // InternalQL.g:1262:1: entryRuleEDate returns [String current=null] : iv_ruleEDate= ruleEDate EOF ;
    public final String entryRuleEDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDate = null;


        try {
            // InternalQL.g:1262:45: (iv_ruleEDate= ruleEDate EOF )
            // InternalQL.g:1263:2: iv_ruleEDate= ruleEDate EOF
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
    // InternalQL.g:1269:1: ruleEDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'EDate' ;
    public final AntlrDatatypeRuleToken ruleEDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalQL.g:1275:2: (kw= 'EDate' )
            // InternalQL.g:1276:2: kw= 'EDate'
            {
            kw=(Token)match(input,23,FOLLOW_2); 

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
    // InternalQL.g:1284:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalQL.g:1284:47: (iv_ruleEString= ruleEString EOF )
            // InternalQL.g:1285:2: iv_ruleEString= ruleEString EOF
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
    // InternalQL.g:1291:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalQL.g:1297:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalQL.g:1298:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalQL.g:1298:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalQL.g:1299:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalQL.g:1307:3: this_ID_1= RULE_ID
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
    // InternalQL.g:1318:1: entryRuleQuestionGroup returns [EObject current=null] : iv_ruleQuestionGroup= ruleQuestionGroup EOF ;
    public final EObject entryRuleQuestionGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionGroup = null;


        try {
            // InternalQL.g:1318:54: (iv_ruleQuestionGroup= ruleQuestionGroup EOF )
            // InternalQL.g:1319:2: iv_ruleQuestionGroup= ruleQuestionGroup EOF
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
    // InternalQL.g:1325:1: ruleQuestionGroup returns [EObject current=null] : ( () (otherlv_1= 'if' otherlv_2= '(' ( (lv_guard_3_0= ruleExpression ) ) otherlv_4= ')' )? otherlv_5= '{' ( ( (lv_questionGroups_6_0= ruleQuestionGroup ) ) | ( (lv_questions_7_0= ruleQuestion ) ) )* otherlv_8= '}' ) ;
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
            // InternalQL.g:1331:2: ( ( () (otherlv_1= 'if' otherlv_2= '(' ( (lv_guard_3_0= ruleExpression ) ) otherlv_4= ')' )? otherlv_5= '{' ( ( (lv_questionGroups_6_0= ruleQuestionGroup ) ) | ( (lv_questions_7_0= ruleQuestion ) ) )* otherlv_8= '}' ) )
            // InternalQL.g:1332:2: ( () (otherlv_1= 'if' otherlv_2= '(' ( (lv_guard_3_0= ruleExpression ) ) otherlv_4= ')' )? otherlv_5= '{' ( ( (lv_questionGroups_6_0= ruleQuestionGroup ) ) | ( (lv_questions_7_0= ruleQuestion ) ) )* otherlv_8= '}' )
            {
            // InternalQL.g:1332:2: ( () (otherlv_1= 'if' otherlv_2= '(' ( (lv_guard_3_0= ruleExpression ) ) otherlv_4= ')' )? otherlv_5= '{' ( ( (lv_questionGroups_6_0= ruleQuestionGroup ) ) | ( (lv_questions_7_0= ruleQuestion ) ) )* otherlv_8= '}' )
            // InternalQL.g:1333:3: () (otherlv_1= 'if' otherlv_2= '(' ( (lv_guard_3_0= ruleExpression ) ) otherlv_4= ')' )? otherlv_5= '{' ( ( (lv_questionGroups_6_0= ruleQuestionGroup ) ) | ( (lv_questions_7_0= ruleQuestion ) ) )* otherlv_8= '}'
            {
            // InternalQL.g:1333:3: ()
            // InternalQL.g:1334:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQuestionGroupAccess().getQuestionGroupAction_0(),
            					current);
            			

            }

            // InternalQL.g:1340:3: (otherlv_1= 'if' otherlv_2= '(' ( (lv_guard_3_0= ruleExpression ) ) otherlv_4= ')' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==18) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalQL.g:1341:4: otherlv_1= 'if' otherlv_2= '(' ( (lv_guard_3_0= ruleExpression ) ) otherlv_4= ')'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_1, grammarAccess.getQuestionGroupAccess().getIfKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getQuestionGroupAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalQL.g:1349:4: ( (lv_guard_3_0= ruleExpression ) )
                    // InternalQL.g:1350:5: (lv_guard_3_0= ruleExpression )
                    {
                    // InternalQL.g:1350:5: (lv_guard_3_0= ruleExpression )
                    // InternalQL.g:1351:6: lv_guard_3_0= ruleExpression
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

            otherlv_5=(Token)match(input,16,FOLLOW_24); 

            			newLeafNode(otherlv_5, grammarAccess.getQuestionGroupAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQL.g:1377:3: ( ( (lv_questionGroups_6_0= ruleQuestionGroup ) ) | ( (lv_questions_7_0= ruleQuestion ) ) )*
            loop21:
            do {
                int alt21=3;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==16||LA21_0==18) ) {
                    alt21=1;
                }
                else if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_ID)) ) {
                    alt21=2;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalQL.g:1378:4: ( (lv_questionGroups_6_0= ruleQuestionGroup ) )
            	    {
            	    // InternalQL.g:1378:4: ( (lv_questionGroups_6_0= ruleQuestionGroup ) )
            	    // InternalQL.g:1379:5: (lv_questionGroups_6_0= ruleQuestionGroup )
            	    {
            	    // InternalQL.g:1379:5: (lv_questionGroups_6_0= ruleQuestionGroup )
            	    // InternalQL.g:1380:6: lv_questionGroups_6_0= ruleQuestionGroup
            	    {

            	    						newCompositeNode(grammarAccess.getQuestionGroupAccess().getQuestionGroupsQuestionGroupParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_24);
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
            	    // InternalQL.g:1398:4: ( (lv_questions_7_0= ruleQuestion ) )
            	    {
            	    // InternalQL.g:1398:4: ( (lv_questions_7_0= ruleQuestion ) )
            	    // InternalQL.g:1399:5: (lv_questions_7_0= ruleQuestion )
            	    {
            	    // InternalQL.g:1399:5: (lv_questions_7_0= ruleQuestion )
            	    // InternalQL.g:1400:6: lv_questions_7_0= ruleQuestion
            	    {

            	    						newCompositeNode(grammarAccess.getQuestionGroupAccess().getQuestionsQuestionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
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
            	    break loop21;
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
    // InternalQL.g:1426:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // InternalQL.g:1426:49: (iv_ruleQuestion= ruleQuestion EOF )
            // InternalQL.g:1427:2: iv_ruleQuestion= ruleQuestion EOF
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
    // InternalQL.g:1433:1: ruleQuestion returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalQL.g:1439:2: ( ( ( ruleEString ) ) )
            // InternalQL.g:1440:2: ( ( ruleEString ) )
            {
            // InternalQL.g:1440:2: ( ( ruleEString ) )
            // InternalQL.g:1441:3: ( ruleEString )
            {
            // InternalQL.g:1441:3: ( ruleEString )
            // InternalQL.g:1442:4: ruleEString
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
    // InternalQL.g:1459:1: entryRuleValueType_Impl returns [EObject current=null] : iv_ruleValueType_Impl= ruleValueType_Impl EOF ;
    public final EObject entryRuleValueType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueType_Impl = null;


        try {
            // InternalQL.g:1459:55: (iv_ruleValueType_Impl= ruleValueType_Impl EOF )
            // InternalQL.g:1460:2: iv_ruleValueType_Impl= ruleValueType_Impl EOF
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
    // InternalQL.g:1466:1: ruleValueType_Impl returns [EObject current=null] : ( () otherlv_1= 'ValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
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
            // InternalQL.g:1472:2: ( ( () otherlv_1= 'ValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalQL.g:1473:2: ( () otherlv_1= 'ValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalQL.g:1473:2: ( () otherlv_1= 'ValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalQL.g:1474:3: () otherlv_1= 'ValueType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalQL.g:1474:3: ()
            // InternalQL.g:1475:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getValueType_ImplAccess().getValueTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getValueType_ImplAccess().getValueTypeKeyword_1());
            		
            // InternalQL.g:1485:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQL.g:1486:4: (lv_name_2_0= ruleEString )
            {
            // InternalQL.g:1486:4: (lv_name_2_0= ruleEString )
            // InternalQL.g:1487:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,16,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getValueType_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQL.g:1508:3: (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==25) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalQL.g:1509:4: otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getValueType_ImplAccess().getUnitKeyword_4_0());
                    			
                    // InternalQL.g:1513:4: ( (lv_unit_5_0= ruleEString ) )
                    // InternalQL.g:1514:5: (lv_unit_5_0= ruleEString )
                    {
                    // InternalQL.g:1514:5: (lv_unit_5_0= ruleEString )
                    // InternalQL.g:1515:6: lv_unit_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getValueType_ImplAccess().getUnitEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_26);
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


    // $ANTLR start "entryRuleConstantCall"
    // InternalQL.g:1541:1: entryRuleConstantCall returns [EObject current=null] : iv_ruleConstantCall= ruleConstantCall EOF ;
    public final EObject entryRuleConstantCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantCall = null;


        try {
            // InternalQL.g:1541:53: (iv_ruleConstantCall= ruleConstantCall EOF )
            // InternalQL.g:1542:2: iv_ruleConstantCall= ruleConstantCall EOF
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
    // InternalQL.g:1548:1: ruleConstantCall returns [EObject current=null] : ( () ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleIntegerValue | lv_value_1_3= ruleBooleanValue | lv_value_1_4= ruleDecimalValue ) ) ) ) ;
    public final EObject ruleConstantCall() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_1 = null;

        EObject lv_value_1_2 = null;

        EObject lv_value_1_3 = null;

        EObject lv_value_1_4 = null;



        	enterRule();

        try {
            // InternalQL.g:1554:2: ( ( () ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleIntegerValue | lv_value_1_3= ruleBooleanValue | lv_value_1_4= ruleDecimalValue ) ) ) ) )
            // InternalQL.g:1555:2: ( () ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleIntegerValue | lv_value_1_3= ruleBooleanValue | lv_value_1_4= ruleDecimalValue ) ) ) )
            {
            // InternalQL.g:1555:2: ( () ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleIntegerValue | lv_value_1_3= ruleBooleanValue | lv_value_1_4= ruleDecimalValue ) ) ) )
            // InternalQL.g:1556:3: () ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleIntegerValue | lv_value_1_3= ruleBooleanValue | lv_value_1_4= ruleDecimalValue ) ) )
            {
            // InternalQL.g:1556:3: ()
            // InternalQL.g:1557:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConstantCallAccess().getConstantCallAction_0(),
            					current);
            			

            }

            // InternalQL.g:1563:3: ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleIntegerValue | lv_value_1_3= ruleBooleanValue | lv_value_1_4= ruleDecimalValue ) ) )
            // InternalQL.g:1564:4: ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleIntegerValue | lv_value_1_3= ruleBooleanValue | lv_value_1_4= ruleDecimalValue ) )
            {
            // InternalQL.g:1564:4: ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleIntegerValue | lv_value_1_3= ruleBooleanValue | lv_value_1_4= ruleDecimalValue ) )
            // InternalQL.g:1565:5: (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleIntegerValue | lv_value_1_3= ruleBooleanValue | lv_value_1_4= ruleDecimalValue )
            {
            // InternalQL.g:1565:5: (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleIntegerValue | lv_value_1_3= ruleBooleanValue | lv_value_1_4= ruleDecimalValue )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt23=1;
                }
                break;
            case 37:
                {
                alt23=2;
                }
                break;
            case 41:
            case 42:
                {
                alt23=3;
                }
                break;
            case 45:
                {
                alt23=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalQL.g:1566:6: lv_value_1_1= ruleStringValue
                    {

                    						newCompositeNode(grammarAccess.getConstantCallAccess().getValueStringValueParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_1_1=ruleStringValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstantCallRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_1_1,
                    							"org.gemoc.ql.QL.StringValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalQL.g:1582:6: lv_value_1_2= ruleIntegerValue
                    {

                    						newCompositeNode(grammarAccess.getConstantCallAccess().getValueIntegerValueParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_1_2=ruleIntegerValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstantCallRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_1_2,
                    							"org.gemoc.ql.QL.IntegerValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalQL.g:1598:6: lv_value_1_3= ruleBooleanValue
                    {

                    						newCompositeNode(grammarAccess.getConstantCallAccess().getValueBooleanValueParserRuleCall_1_0_2());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_1_3=ruleBooleanValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstantCallRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_1_3,
                    							"org.gemoc.ql.QL.BooleanValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 4 :
                    // InternalQL.g:1614:6: lv_value_1_4= ruleDecimalValue
                    {

                    						newCompositeNode(grammarAccess.getConstantCallAccess().getValueDecimalValueParserRuleCall_1_0_3());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_1_4=ruleDecimalValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstantCallRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_1_4,
                    							"org.gemoc.ql.QL.DecimalValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleConstantCall"


    // $ANTLR start "entryRuleQuestionCall"
    // InternalQL.g:1636:1: entryRuleQuestionCall returns [EObject current=null] : iv_ruleQuestionCall= ruleQuestionCall EOF ;
    public final EObject entryRuleQuestionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionCall = null;


        try {
            // InternalQL.g:1636:53: (iv_ruleQuestionCall= ruleQuestionCall EOF )
            // InternalQL.g:1637:2: iv_ruleQuestionCall= ruleQuestionCall EOF
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
    // InternalQL.g:1643:1: ruleQuestionCall returns [EObject current=null] : ( () ( ( ruleEString ) ) ) ;
    public final EObject ruleQuestionCall() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalQL.g:1649:2: ( ( () ( ( ruleEString ) ) ) )
            // InternalQL.g:1650:2: ( () ( ( ruleEString ) ) )
            {
            // InternalQL.g:1650:2: ( () ( ( ruleEString ) ) )
            // InternalQL.g:1651:3: () ( ( ruleEString ) )
            {
            // InternalQL.g:1651:3: ()
            // InternalQL.g:1652:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQuestionCallAccess().getQuestionCallAction_0(),
            					current);
            			

            }

            // InternalQL.g:1658:3: ( ( ruleEString ) )
            // InternalQL.g:1659:4: ( ruleEString )
            {
            // InternalQL.g:1659:4: ( ruleEString )
            // InternalQL.g:1660:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuestionCallRule());
            					}
            				

            					newCompositeNode(grammarAccess.getQuestionCallAccess().getQuestionQuestionDefinitionCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleQuestionCall"


    // $ANTLR start "entryRuleBooleanValueType"
    // InternalQL.g:1678:1: entryRuleBooleanValueType returns [EObject current=null] : iv_ruleBooleanValueType= ruleBooleanValueType EOF ;
    public final EObject entryRuleBooleanValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValueType = null;


        try {
            // InternalQL.g:1678:57: (iv_ruleBooleanValueType= ruleBooleanValueType EOF )
            // InternalQL.g:1679:2: iv_ruleBooleanValueType= ruleBooleanValueType EOF
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
    // InternalQL.g:1685:1: ruleBooleanValueType returns [EObject current=null] : ( () otherlv_1= 'booleanType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? ) ;
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
            // InternalQL.g:1691:2: ( ( () otherlv_1= 'booleanType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? ) )
            // InternalQL.g:1692:2: ( () otherlv_1= 'booleanType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? )
            {
            // InternalQL.g:1692:2: ( () otherlv_1= 'booleanType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? )
            // InternalQL.g:1693:3: () otherlv_1= 'booleanType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )?
            {
            // InternalQL.g:1693:3: ()
            // InternalQL.g:1694:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanValueTypeAccess().getBooleanValueTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getBooleanValueTypeAccess().getBooleanTypeKeyword_1());
            		
            // InternalQL.g:1704:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQL.g:1705:4: (lv_name_2_0= ruleEString )
            {
            // InternalQL.g:1705:4: (lv_name_2_0= ruleEString )
            // InternalQL.g:1706:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBooleanValueTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
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

            // InternalQL.g:1723:3: (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==16) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalQL.g:1724:4: otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_25); 

                    				newLeafNode(otherlv_3, grammarAccess.getBooleanValueTypeAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalQL.g:1728:4: (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==25) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalQL.g:1729:5: otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) )
                            {
                            otherlv_4=(Token)match(input,25,FOLLOW_21); 

                            					newLeafNode(otherlv_4, grammarAccess.getBooleanValueTypeAccess().getUnitKeyword_3_1_0());
                            				
                            // InternalQL.g:1733:5: ( (lv_unit_5_0= ruleEString ) )
                            // InternalQL.g:1734:6: (lv_unit_5_0= ruleEString )
                            {
                            // InternalQL.g:1734:6: (lv_unit_5_0= ruleEString )
                            // InternalQL.g:1735:7: lv_unit_5_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getBooleanValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0());
                            						
                            pushFollow(FOLLOW_26);
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
    // InternalQL.g:1762:1: entryRuleIntegerValueType returns [EObject current=null] : iv_ruleIntegerValueType= ruleIntegerValueType EOF ;
    public final EObject entryRuleIntegerValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValueType = null;


        try {
            // InternalQL.g:1762:57: (iv_ruleIntegerValueType= ruleIntegerValueType EOF )
            // InternalQL.g:1763:2: iv_ruleIntegerValueType= ruleIntegerValueType EOF
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
    // InternalQL.g:1769:1: ruleIntegerValueType returns [EObject current=null] : ( () otherlv_1= 'integerType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )? (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )? otherlv_10= '}' )? ) ;
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
            // InternalQL.g:1775:2: ( ( () otherlv_1= 'integerType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )? (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )? otherlv_10= '}' )? ) )
            // InternalQL.g:1776:2: ( () otherlv_1= 'integerType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )? (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )? otherlv_10= '}' )? )
            {
            // InternalQL.g:1776:2: ( () otherlv_1= 'integerType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )? (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )? otherlv_10= '}' )? )
            // InternalQL.g:1777:3: () otherlv_1= 'integerType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )? (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )? otherlv_10= '}' )?
            {
            // InternalQL.g:1777:3: ()
            // InternalQL.g:1778:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerValueTypeAccess().getIntegerValueTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getIntegerValueTypeAccess().getIntegerTypeKeyword_1());
            		
            // InternalQL.g:1788:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQL.g:1789:4: (lv_name_2_0= ruleEString )
            {
            // InternalQL.g:1789:4: (lv_name_2_0= ruleEString )
            // InternalQL.g:1790:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIntegerValueTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
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

            // InternalQL.g:1807:3: (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )? (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )? otherlv_10= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==16) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalQL.g:1808:4: otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )? (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )? otherlv_10= '}'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_28); 

                    				newLeafNode(otherlv_3, grammarAccess.getIntegerValueTypeAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalQL.g:1812:4: (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==25) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalQL.g:1813:5: otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) )
                            {
                            otherlv_4=(Token)match(input,25,FOLLOW_21); 

                            					newLeafNode(otherlv_4, grammarAccess.getIntegerValueTypeAccess().getUnitKeyword_3_1_0());
                            				
                            // InternalQL.g:1817:5: ( (lv_unit_5_0= ruleEString ) )
                            // InternalQL.g:1818:6: (lv_unit_5_0= ruleEString )
                            {
                            // InternalQL.g:1818:6: (lv_unit_5_0= ruleEString )
                            // InternalQL.g:1819:7: lv_unit_5_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getIntegerValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0());
                            						
                            pushFollow(FOLLOW_29);
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

                    // InternalQL.g:1837:4: (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==28) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalQL.g:1838:5: otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) )
                            {
                            otherlv_6=(Token)match(input,28,FOLLOW_30); 

                            					newLeafNode(otherlv_6, grammarAccess.getIntegerValueTypeAccess().getMinKeyword_3_2_0());
                            				
                            // InternalQL.g:1842:5: ( (lv_min_7_0= ruleEInt ) )
                            // InternalQL.g:1843:6: (lv_min_7_0= ruleEInt )
                            {
                            // InternalQL.g:1843:6: (lv_min_7_0= ruleEInt )
                            // InternalQL.g:1844:7: lv_min_7_0= ruleEInt
                            {

                            							newCompositeNode(grammarAccess.getIntegerValueTypeAccess().getMinEIntParserRuleCall_3_2_1_0());
                            						
                            pushFollow(FOLLOW_31);
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

                    // InternalQL.g:1862:4: (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==29) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalQL.g:1863:5: otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) )
                            {
                            otherlv_8=(Token)match(input,29,FOLLOW_30); 

                            					newLeafNode(otherlv_8, grammarAccess.getIntegerValueTypeAccess().getMaxKeyword_3_3_0());
                            				
                            // InternalQL.g:1867:5: ( (lv_max_9_0= ruleEInt ) )
                            // InternalQL.g:1868:6: (lv_max_9_0= ruleEInt )
                            {
                            // InternalQL.g:1868:6: (lv_max_9_0= ruleEInt )
                            // InternalQL.g:1869:7: lv_max_9_0= ruleEInt
                            {

                            							newCompositeNode(grammarAccess.getIntegerValueTypeAccess().getMaxEIntParserRuleCall_3_3_1_0());
                            						
                            pushFollow(FOLLOW_26);
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
    // InternalQL.g:1896:1: entryRuleDecimalValueType returns [EObject current=null] : iv_ruleDecimalValueType= ruleDecimalValueType EOF ;
    public final EObject entryRuleDecimalValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalValueType = null;


        try {
            // InternalQL.g:1896:57: (iv_ruleDecimalValueType= ruleDecimalValueType EOF )
            // InternalQL.g:1897:2: iv_ruleDecimalValueType= ruleDecimalValueType EOF
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
    // InternalQL.g:1903:1: ruleDecimalValueType returns [EObject current=null] : ( () otherlv_1= 'decimalType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? ) ;
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
            // InternalQL.g:1909:2: ( ( () otherlv_1= 'decimalType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? ) )
            // InternalQL.g:1910:2: ( () otherlv_1= 'decimalType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? )
            {
            // InternalQL.g:1910:2: ( () otherlv_1= 'decimalType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? )
            // InternalQL.g:1911:3: () otherlv_1= 'decimalType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )?
            {
            // InternalQL.g:1911:3: ()
            // InternalQL.g:1912:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDecimalValueTypeAccess().getDecimalValueTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getDecimalValueTypeAccess().getDecimalTypeKeyword_1());
            		
            // InternalQL.g:1922:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQL.g:1923:4: (lv_name_2_0= ruleEString )
            {
            // InternalQL.g:1923:4: (lv_name_2_0= ruleEString )
            // InternalQL.g:1924:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDecimalValueTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
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

            // InternalQL.g:1941:3: (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==16) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalQL.g:1942:4: otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_25); 

                    				newLeafNode(otherlv_3, grammarAccess.getDecimalValueTypeAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalQL.g:1946:4: (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==25) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalQL.g:1947:5: otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) )
                            {
                            otherlv_4=(Token)match(input,25,FOLLOW_21); 

                            					newLeafNode(otherlv_4, grammarAccess.getDecimalValueTypeAccess().getUnitKeyword_3_1_0());
                            				
                            // InternalQL.g:1951:5: ( (lv_unit_5_0= ruleEString ) )
                            // InternalQL.g:1952:6: (lv_unit_5_0= ruleEString )
                            {
                            // InternalQL.g:1952:6: (lv_unit_5_0= ruleEString )
                            // InternalQL.g:1953:7: lv_unit_5_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getDecimalValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0());
                            						
                            pushFollow(FOLLOW_26);
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
    // InternalQL.g:1980:1: entryRuleDateValueType returns [EObject current=null] : iv_ruleDateValueType= ruleDateValueType EOF ;
    public final EObject entryRuleDateValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateValueType = null;


        try {
            // InternalQL.g:1980:54: (iv_ruleDateValueType= ruleDateValueType EOF )
            // InternalQL.g:1981:2: iv_ruleDateValueType= ruleDateValueType EOF
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
    // InternalQL.g:1987:1: ruleDateValueType returns [EObject current=null] : ( () otherlv_1= 'dateType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? ) ;
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
            // InternalQL.g:1993:2: ( ( () otherlv_1= 'dateType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? ) )
            // InternalQL.g:1994:2: ( () otherlv_1= 'dateType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? )
            {
            // InternalQL.g:1994:2: ( () otherlv_1= 'dateType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? )
            // InternalQL.g:1995:3: () otherlv_1= 'dateType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )?
            {
            // InternalQL.g:1995:3: ()
            // InternalQL.g:1996:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDateValueTypeAccess().getDateValueTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getDateValueTypeAccess().getDateTypeKeyword_1());
            		
            // InternalQL.g:2006:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQL.g:2007:4: (lv_name_2_0= ruleEString )
            {
            // InternalQL.g:2007:4: (lv_name_2_0= ruleEString )
            // InternalQL.g:2008:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDateValueTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
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

            // InternalQL.g:2025:3: (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==16) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalQL.g:2026:4: otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_25); 

                    				newLeafNode(otherlv_3, grammarAccess.getDateValueTypeAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalQL.g:2030:4: (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==25) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalQL.g:2031:5: otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) )
                            {
                            otherlv_4=(Token)match(input,25,FOLLOW_21); 

                            					newLeafNode(otherlv_4, grammarAccess.getDateValueTypeAccess().getUnitKeyword_3_1_0());
                            				
                            // InternalQL.g:2035:5: ( (lv_unit_5_0= ruleEString ) )
                            // InternalQL.g:2036:6: (lv_unit_5_0= ruleEString )
                            {
                            // InternalQL.g:2036:6: (lv_unit_5_0= ruleEString )
                            // InternalQL.g:2037:7: lv_unit_5_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getDateValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0());
                            						
                            pushFollow(FOLLOW_26);
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
    // InternalQL.g:2064:1: entryRuleEnumerationValueType returns [EObject current=null] : iv_ruleEnumerationValueType= ruleEnumerationValueType EOF ;
    public final EObject entryRuleEnumerationValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationValueType = null;


        try {
            // InternalQL.g:2064:61: (iv_ruleEnumerationValueType= ruleEnumerationValueType EOF )
            // InternalQL.g:2065:2: iv_ruleEnumerationValueType= ruleEnumerationValueType EOF
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
    // InternalQL.g:2071:1: ruleEnumerationValueType returns [EObject current=null] : ( () otherlv_1= 'enumerationType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )? otherlv_12= '}' )? ) ;
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
            // InternalQL.g:2077:2: ( ( () otherlv_1= 'enumerationType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )? otherlv_12= '}' )? ) )
            // InternalQL.g:2078:2: ( () otherlv_1= 'enumerationType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )? otherlv_12= '}' )? )
            {
            // InternalQL.g:2078:2: ( () otherlv_1= 'enumerationType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )? otherlv_12= '}' )? )
            // InternalQL.g:2079:3: () otherlv_1= 'enumerationType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )? otherlv_12= '}' )?
            {
            // InternalQL.g:2079:3: ()
            // InternalQL.g:2080:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnumerationValueTypeAccess().getEnumerationValueTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumerationValueTypeAccess().getEnumerationTypeKeyword_1());
            		
            // InternalQL.g:2090:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQL.g:2091:4: (lv_name_2_0= ruleEString )
            {
            // InternalQL.g:2091:4: (lv_name_2_0= ruleEString )
            // InternalQL.g:2092:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnumerationValueTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
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

            // InternalQL.g:2109:3: (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )? otherlv_12= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==16) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalQL.g:2110:4: otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )? otherlv_12= '}'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_32); 

                    				newLeafNode(otherlv_3, grammarAccess.getEnumerationValueTypeAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalQL.g:2114:4: (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==25) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalQL.g:2115:5: otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) )
                            {
                            otherlv_4=(Token)match(input,25,FOLLOW_21); 

                            					newLeafNode(otherlv_4, grammarAccess.getEnumerationValueTypeAccess().getUnitKeyword_3_1_0());
                            				
                            // InternalQL.g:2119:5: ( (lv_unit_5_0= ruleEString ) )
                            // InternalQL.g:2120:6: (lv_unit_5_0= ruleEString )
                            {
                            // InternalQL.g:2120:6: (lv_unit_5_0= ruleEString )
                            // InternalQL.g:2121:7: lv_unit_5_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getEnumerationValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0());
                            						
                            pushFollow(FOLLOW_33);
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

                    // InternalQL.g:2139:4: (otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==33) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalQL.g:2140:5: otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}'
                            {
                            otherlv_6=(Token)match(input,33,FOLLOW_8); 

                            					newLeafNode(otherlv_6, grammarAccess.getEnumerationValueTypeAccess().getLiteralsKeyword_3_2_0());
                            				
                            otherlv_7=(Token)match(input,16,FOLLOW_21); 

                            					newLeafNode(otherlv_7, grammarAccess.getEnumerationValueTypeAccess().getLeftCurlyBracketKeyword_3_2_1());
                            				
                            // InternalQL.g:2148:5: ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) )
                            // InternalQL.g:2149:6: (lv_enumerationLiterals_8_0= ruleEnumerationLiteral )
                            {
                            // InternalQL.g:2149:6: (lv_enumerationLiterals_8_0= ruleEnumerationLiteral )
                            // InternalQL.g:2150:7: lv_enumerationLiterals_8_0= ruleEnumerationLiteral
                            {

                            							newCompositeNode(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_3_2_2_0());
                            						
                            pushFollow(FOLLOW_34);
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

                            // InternalQL.g:2167:5: (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )*
                            loop35:
                            do {
                                int alt35=2;
                                int LA35_0 = input.LA(1);

                                if ( (LA35_0==34) ) {
                                    alt35=1;
                                }


                                switch (alt35) {
                            	case 1 :
                            	    // InternalQL.g:2168:6: otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) )
                            	    {
                            	    otherlv_9=(Token)match(input,34,FOLLOW_21); 

                            	    						newLeafNode(otherlv_9, grammarAccess.getEnumerationValueTypeAccess().getCommaKeyword_3_2_3_0());
                            	    					
                            	    // InternalQL.g:2172:6: ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) )
                            	    // InternalQL.g:2173:7: (lv_enumerationLiterals_10_0= ruleEnumerationLiteral )
                            	    {
                            	    // InternalQL.g:2173:7: (lv_enumerationLiterals_10_0= ruleEnumerationLiteral )
                            	    // InternalQL.g:2174:8: lv_enumerationLiterals_10_0= ruleEnumerationLiteral
                            	    {

                            	    								newCompositeNode(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_3_2_3_1_0());
                            	    							
                            	    pushFollow(FOLLOW_34);
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
                            	    break loop35;
                                }
                            } while (true);

                            otherlv_11=(Token)match(input,17,FOLLOW_26); 

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
    // InternalQL.g:2206:1: entryRuleStringValueType returns [EObject current=null] : iv_ruleStringValueType= ruleStringValueType EOF ;
    public final EObject entryRuleStringValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValueType = null;


        try {
            // InternalQL.g:2206:56: (iv_ruleStringValueType= ruleStringValueType EOF )
            // InternalQL.g:2207:2: iv_ruleStringValueType= ruleStringValueType EOF
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
    // InternalQL.g:2213:1: ruleStringValueType returns [EObject current=null] : ( () otherlv_1= 'StringValueType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? ) ;
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
            // InternalQL.g:2219:2: ( ( () otherlv_1= 'StringValueType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? ) )
            // InternalQL.g:2220:2: ( () otherlv_1= 'StringValueType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? )
            {
            // InternalQL.g:2220:2: ( () otherlv_1= 'StringValueType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? )
            // InternalQL.g:2221:3: () otherlv_1= 'StringValueType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )?
            {
            // InternalQL.g:2221:3: ()
            // InternalQL.g:2222:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringValueTypeAccess().getStringValueTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getStringValueTypeAccess().getStringValueTypeKeyword_1());
            		
            // InternalQL.g:2232:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQL.g:2233:4: (lv_name_2_0= ruleEString )
            {
            // InternalQL.g:2233:4: (lv_name_2_0= ruleEString )
            // InternalQL.g:2234:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStringValueTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
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

            // InternalQL.g:2251:3: (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==16) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalQL.g:2252:4: otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_25); 

                    				newLeafNode(otherlv_3, grammarAccess.getStringValueTypeAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalQL.g:2256:4: (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==25) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalQL.g:2257:5: otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) )
                            {
                            otherlv_4=(Token)match(input,25,FOLLOW_21); 

                            					newLeafNode(otherlv_4, grammarAccess.getStringValueTypeAccess().getUnitKeyword_3_1_0());
                            				
                            // InternalQL.g:2261:5: ( (lv_unit_5_0= ruleEString ) )
                            // InternalQL.g:2262:6: (lv_unit_5_0= ruleEString )
                            {
                            // InternalQL.g:2262:6: (lv_unit_5_0= ruleEString )
                            // InternalQL.g:2263:7: lv_unit_5_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getStringValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0());
                            						
                            pushFollow(FOLLOW_26);
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
    // InternalQL.g:2290:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalQL.g:2290:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalQL.g:2291:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalQL.g:2297:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalQL.g:2303:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalQL.g:2304:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalQL.g:2304:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalQL.g:2305:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalQL.g:2305:3: (kw= '-' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==36) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalQL.g:2306:4: kw= '-'
                    {
                    kw=(Token)match(input,36,FOLLOW_35); 

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
    // InternalQL.g:2323:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteral = null;


        try {
            // InternalQL.g:2323:59: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // InternalQL.g:2324:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
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
    // InternalQL.g:2330:1: ruleEnumerationLiteral returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalQL.g:2336:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalQL.g:2337:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalQL.g:2337:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalQL.g:2338:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalQL.g:2338:3: ()
            // InternalQL.g:2339:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnumerationLiteralAccess().getEnumerationLiteralAction_0(),
            					current);
            			

            }

            // InternalQL.g:2345:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQL.g:2346:4: (lv_name_1_0= ruleEString )
            {
            // InternalQL.g:2346:4: (lv_name_1_0= ruleEString )
            // InternalQL.g:2347:5: lv_name_1_0= ruleEString
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
    // InternalQL.g:2368:1: entryRuleIntegerValue returns [EObject current=null] : iv_ruleIntegerValue= ruleIntegerValue EOF ;
    public final EObject entryRuleIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValue = null;


        try {
            // InternalQL.g:2368:53: (iv_ruleIntegerValue= ruleIntegerValue EOF )
            // InternalQL.g:2369:2: iv_ruleIntegerValue= ruleIntegerValue EOF
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
    // InternalQL.g:2375:1: ruleIntegerValue returns [EObject current=null] : ( () otherlv_1= 'IntegerValue' otherlv_2= '{' (otherlv_3= 'intValue' ( (lv_intValue_4_0= ruleEInt ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleIntegerValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_intValue_4_0 = null;



        	enterRule();

        try {
            // InternalQL.g:2381:2: ( ( () otherlv_1= 'IntegerValue' otherlv_2= '{' (otherlv_3= 'intValue' ( (lv_intValue_4_0= ruleEInt ) ) )? otherlv_5= '}' ) )
            // InternalQL.g:2382:2: ( () otherlv_1= 'IntegerValue' otherlv_2= '{' (otherlv_3= 'intValue' ( (lv_intValue_4_0= ruleEInt ) ) )? otherlv_5= '}' )
            {
            // InternalQL.g:2382:2: ( () otherlv_1= 'IntegerValue' otherlv_2= '{' (otherlv_3= 'intValue' ( (lv_intValue_4_0= ruleEInt ) ) )? otherlv_5= '}' )
            // InternalQL.g:2383:3: () otherlv_1= 'IntegerValue' otherlv_2= '{' (otherlv_3= 'intValue' ( (lv_intValue_4_0= ruleEInt ) ) )? otherlv_5= '}'
            {
            // InternalQL.g:2383:3: ()
            // InternalQL.g:2384:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerValueAccess().getIntegerValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getIntegerValueAccess().getIntegerValueKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getIntegerValueAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQL.g:2398:3: (otherlv_3= 'intValue' ( (lv_intValue_4_0= ruleEInt ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==38) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalQL.g:2399:4: otherlv_3= 'intValue' ( (lv_intValue_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_30); 

                    				newLeafNode(otherlv_3, grammarAccess.getIntegerValueAccess().getIntValueKeyword_3_0());
                    			
                    // InternalQL.g:2403:4: ( (lv_intValue_4_0= ruleEInt ) )
                    // InternalQL.g:2404:5: (lv_intValue_4_0= ruleEInt )
                    {
                    // InternalQL.g:2404:5: (lv_intValue_4_0= ruleEInt )
                    // InternalQL.g:2405:6: lv_intValue_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getIntegerValueAccess().getIntValueEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
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
    // InternalQL.g:2431:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalQL.g:2431:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalQL.g:2432:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalQL.g:2438:1: ruleStringValue returns [EObject current=null] : ( () otherlv_1= 'StringValue' otherlv_2= '{' (otherlv_3= 'stringValue' ( (lv_stringValue_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_stringValue_4_0 = null;



        	enterRule();

        try {
            // InternalQL.g:2444:2: ( ( () otherlv_1= 'StringValue' otherlv_2= '{' (otherlv_3= 'stringValue' ( (lv_stringValue_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalQL.g:2445:2: ( () otherlv_1= 'StringValue' otherlv_2= '{' (otherlv_3= 'stringValue' ( (lv_stringValue_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalQL.g:2445:2: ( () otherlv_1= 'StringValue' otherlv_2= '{' (otherlv_3= 'stringValue' ( (lv_stringValue_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalQL.g:2446:3: () otherlv_1= 'StringValue' otherlv_2= '{' (otherlv_3= 'stringValue' ( (lv_stringValue_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalQL.g:2446:3: ()
            // InternalQL.g:2447:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringValueAccess().getStringValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getStringValueAccess().getStringValueKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getStringValueAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQL.g:2461:3: (otherlv_3= 'stringValue' ( (lv_stringValue_4_0= ruleEString ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==40) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalQL.g:2462:4: otherlv_3= 'stringValue' ( (lv_stringValue_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,40,FOLLOW_21); 

                    				newLeafNode(otherlv_3, grammarAccess.getStringValueAccess().getStringValueKeyword_3_0());
                    			
                    // InternalQL.g:2466:4: ( (lv_stringValue_4_0= ruleEString ) )
                    // InternalQL.g:2467:5: (lv_stringValue_4_0= ruleEString )
                    {
                    // InternalQL.g:2467:5: (lv_stringValue_4_0= ruleEString )
                    // InternalQL.g:2468:6: lv_stringValue_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getStringValueAccess().getStringValueEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
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
    // InternalQL.g:2494:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalQL.g:2494:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalQL.g:2495:2: iv_ruleBooleanValue= ruleBooleanValue EOF
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
    // InternalQL.g:2501:1: ruleBooleanValue returns [EObject current=null] : ( () ( (lv_booleanValue_1_0= 'booleanValue' ) )? otherlv_2= 'BooleanValue' ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token lv_booleanValue_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalQL.g:2507:2: ( ( () ( (lv_booleanValue_1_0= 'booleanValue' ) )? otherlv_2= 'BooleanValue' ) )
            // InternalQL.g:2508:2: ( () ( (lv_booleanValue_1_0= 'booleanValue' ) )? otherlv_2= 'BooleanValue' )
            {
            // InternalQL.g:2508:2: ( () ( (lv_booleanValue_1_0= 'booleanValue' ) )? otherlv_2= 'BooleanValue' )
            // InternalQL.g:2509:3: () ( (lv_booleanValue_1_0= 'booleanValue' ) )? otherlv_2= 'BooleanValue'
            {
            // InternalQL.g:2509:3: ()
            // InternalQL.g:2510:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanValueAccess().getBooleanValueAction_0(),
            					current);
            			

            }

            // InternalQL.g:2516:3: ( (lv_booleanValue_1_0= 'booleanValue' ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==41) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalQL.g:2517:4: (lv_booleanValue_1_0= 'booleanValue' )
                    {
                    // InternalQL.g:2517:4: (lv_booleanValue_1_0= 'booleanValue' )
                    // InternalQL.g:2518:5: lv_booleanValue_1_0= 'booleanValue'
                    {
                    lv_booleanValue_1_0=(Token)match(input,41,FOLLOW_38); 

                    					newLeafNode(lv_booleanValue_1_0, grammarAccess.getBooleanValueAccess().getBooleanValueBooleanValueKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanValueRule());
                    					}
                    					setWithLastConsumed(current, "booleanValue", lv_booleanValue_1_0 != null, "booleanValue");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,42,FOLLOW_2); 

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
    // InternalQL.g:2538:1: entryRuleDateValue returns [EObject current=null] : iv_ruleDateValue= ruleDateValue EOF ;
    public final EObject entryRuleDateValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateValue = null;


        try {
            // InternalQL.g:2538:50: (iv_ruleDateValue= ruleDateValue EOF )
            // InternalQL.g:2539:2: iv_ruleDateValue= ruleDateValue EOF
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
    // InternalQL.g:2545:1: ruleDateValue returns [EObject current=null] : ( () otherlv_1= 'DateValue' otherlv_2= '{' (otherlv_3= 'dateValue' ( (lv_dateValue_4_0= ruleEDate ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleDateValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_dateValue_4_0 = null;



        	enterRule();

        try {
            // InternalQL.g:2551:2: ( ( () otherlv_1= 'DateValue' otherlv_2= '{' (otherlv_3= 'dateValue' ( (lv_dateValue_4_0= ruleEDate ) ) )? otherlv_5= '}' ) )
            // InternalQL.g:2552:2: ( () otherlv_1= 'DateValue' otherlv_2= '{' (otherlv_3= 'dateValue' ( (lv_dateValue_4_0= ruleEDate ) ) )? otherlv_5= '}' )
            {
            // InternalQL.g:2552:2: ( () otherlv_1= 'DateValue' otherlv_2= '{' (otherlv_3= 'dateValue' ( (lv_dateValue_4_0= ruleEDate ) ) )? otherlv_5= '}' )
            // InternalQL.g:2553:3: () otherlv_1= 'DateValue' otherlv_2= '{' (otherlv_3= 'dateValue' ( (lv_dateValue_4_0= ruleEDate ) ) )? otherlv_5= '}'
            {
            // InternalQL.g:2553:3: ()
            // InternalQL.g:2554:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDateValueAccess().getDateValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getDateValueAccess().getDateValueKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getDateValueAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQL.g:2568:3: (otherlv_3= 'dateValue' ( (lv_dateValue_4_0= ruleEDate ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==44) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalQL.g:2569:4: otherlv_3= 'dateValue' ( (lv_dateValue_4_0= ruleEDate ) )
                    {
                    otherlv_3=(Token)match(input,44,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getDateValueAccess().getDateValueKeyword_3_0());
                    			
                    // InternalQL.g:2573:4: ( (lv_dateValue_4_0= ruleEDate ) )
                    // InternalQL.g:2574:5: (lv_dateValue_4_0= ruleEDate )
                    {
                    // InternalQL.g:2574:5: (lv_dateValue_4_0= ruleEDate )
                    // InternalQL.g:2575:6: lv_dateValue_4_0= ruleEDate
                    {

                    						newCompositeNode(grammarAccess.getDateValueAccess().getDateValueEDateParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
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
    // InternalQL.g:2601:1: entryRuleDecimalValue returns [EObject current=null] : iv_ruleDecimalValue= ruleDecimalValue EOF ;
    public final EObject entryRuleDecimalValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalValue = null;


        try {
            // InternalQL.g:2601:53: (iv_ruleDecimalValue= ruleDecimalValue EOF )
            // InternalQL.g:2602:2: iv_ruleDecimalValue= ruleDecimalValue EOF
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
    // InternalQL.g:2608:1: ruleDecimalValue returns [EObject current=null] : ( () otherlv_1= 'DecimalValue' otherlv_2= '{' (otherlv_3= 'decimalValue' ( (lv_decimalValue_4_0= ruleEFloat ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleDecimalValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_decimalValue_4_0 = null;



        	enterRule();

        try {
            // InternalQL.g:2614:2: ( ( () otherlv_1= 'DecimalValue' otherlv_2= '{' (otherlv_3= 'decimalValue' ( (lv_decimalValue_4_0= ruleEFloat ) ) )? otherlv_5= '}' ) )
            // InternalQL.g:2615:2: ( () otherlv_1= 'DecimalValue' otherlv_2= '{' (otherlv_3= 'decimalValue' ( (lv_decimalValue_4_0= ruleEFloat ) ) )? otherlv_5= '}' )
            {
            // InternalQL.g:2615:2: ( () otherlv_1= 'DecimalValue' otherlv_2= '{' (otherlv_3= 'decimalValue' ( (lv_decimalValue_4_0= ruleEFloat ) ) )? otherlv_5= '}' )
            // InternalQL.g:2616:3: () otherlv_1= 'DecimalValue' otherlv_2= '{' (otherlv_3= 'decimalValue' ( (lv_decimalValue_4_0= ruleEFloat ) ) )? otherlv_5= '}'
            {
            // InternalQL.g:2616:3: ()
            // InternalQL.g:2617:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDecimalValueAccess().getDecimalValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getDecimalValueAccess().getDecimalValueKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getDecimalValueAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQL.g:2631:3: (otherlv_3= 'decimalValue' ( (lv_decimalValue_4_0= ruleEFloat ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==46) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalQL.g:2632:4: otherlv_3= 'decimalValue' ( (lv_decimalValue_4_0= ruleEFloat ) )
                    {
                    otherlv_3=(Token)match(input,46,FOLLOW_41); 

                    				newLeafNode(otherlv_3, grammarAccess.getDecimalValueAccess().getDecimalValueKeyword_3_0());
                    			
                    // InternalQL.g:2636:4: ( (lv_decimalValue_4_0= ruleEFloat ) )
                    // InternalQL.g:2637:5: (lv_decimalValue_4_0= ruleEFloat )
                    {
                    // InternalQL.g:2637:5: (lv_decimalValue_4_0= ruleEFloat )
                    // InternalQL.g:2638:6: lv_decimalValue_4_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getDecimalValueAccess().getDecimalValueEFloatParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
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
    // InternalQL.g:2664:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalQL.g:2664:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalQL.g:2665:2: iv_ruleEFloat= ruleEFloat EOF
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
    // InternalQL.g:2671:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalQL.g:2677:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalQL.g:2678:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalQL.g:2678:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalQL.g:2679:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalQL.g:2679:3: (kw= '-' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==36) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalQL.g:2680:4: kw= '-'
                    {
                    kw=(Token)match(input,36,FOLLOW_42); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalQL.g:2686:3: (this_INT_1= RULE_INT )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_INT) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalQL.g:2687:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_43); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,47,FOLLOW_35); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_44); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalQL.g:2707:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=48 && LA50_0<=49)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalQL.g:2708:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalQL.g:2708:4: (kw= 'E' | kw= 'e' )
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==48) ) {
                        alt48=1;
                    }
                    else if ( (LA48_0==49) ) {
                        alt48=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 0, input);

                        throw nvae;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalQL.g:2709:5: kw= 'E'
                            {
                            kw=(Token)match(input,48,FOLLOW_30); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalQL.g:2715:5: kw= 'e'
                            {
                            kw=(Token)match(input,49,FOLLOW_30); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalQL.g:2721:4: (kw= '-' )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==36) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalQL.g:2722:5: kw= '-'
                            {
                            kw=(Token)match(input,36,FOLLOW_35); 

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
    // InternalQL.g:2740:1: entryRuleQuestionDefinition returns [EObject current=null] : iv_ruleQuestionDefinition= ruleQuestionDefinition EOF ;
    public final EObject entryRuleQuestionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionDefinition = null;


        try {
            // InternalQL.g:2740:59: (iv_ruleQuestionDefinition= ruleQuestionDefinition EOF )
            // InternalQL.g:2741:2: iv_ruleQuestionDefinition= ruleQuestionDefinition EOF
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
    // InternalQL.g:2747:1: ruleQuestionDefinition returns [EObject current=null] : ( ( (lv_isMandatory_0_0= 'mandatory' ) )? otherlv_1= 'question' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_isDisplayed_4_0= 'isDisplayed' ) )? (otherlv_5= 'currentValue' ( (lv_currentValue_6_0= ruleValue ) ) )? otherlv_7= ')' )? otherlv_8= ':' ( (lv_label_9_0= ruleEString ) ) ( ( ruleEString ) ) (otherlv_11= '=' ( (lv_computedExpression_12_0= ruleExpression ) ) otherlv_13= ';' )? ) ;
    public final EObject ruleQuestionDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_isMandatory_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_isDisplayed_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_currentValue_6_0 = null;

        AntlrDatatypeRuleToken lv_label_9_0 = null;

        EObject lv_computedExpression_12_0 = null;



        	enterRule();

        try {
            // InternalQL.g:2753:2: ( ( ( (lv_isMandatory_0_0= 'mandatory' ) )? otherlv_1= 'question' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_isDisplayed_4_0= 'isDisplayed' ) )? (otherlv_5= 'currentValue' ( (lv_currentValue_6_0= ruleValue ) ) )? otherlv_7= ')' )? otherlv_8= ':' ( (lv_label_9_0= ruleEString ) ) ( ( ruleEString ) ) (otherlv_11= '=' ( (lv_computedExpression_12_0= ruleExpression ) ) otherlv_13= ';' )? ) )
            // InternalQL.g:2754:2: ( ( (lv_isMandatory_0_0= 'mandatory' ) )? otherlv_1= 'question' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_isDisplayed_4_0= 'isDisplayed' ) )? (otherlv_5= 'currentValue' ( (lv_currentValue_6_0= ruleValue ) ) )? otherlv_7= ')' )? otherlv_8= ':' ( (lv_label_9_0= ruleEString ) ) ( ( ruleEString ) ) (otherlv_11= '=' ( (lv_computedExpression_12_0= ruleExpression ) ) otherlv_13= ';' )? )
            {
            // InternalQL.g:2754:2: ( ( (lv_isMandatory_0_0= 'mandatory' ) )? otherlv_1= 'question' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_isDisplayed_4_0= 'isDisplayed' ) )? (otherlv_5= 'currentValue' ( (lv_currentValue_6_0= ruleValue ) ) )? otherlv_7= ')' )? otherlv_8= ':' ( (lv_label_9_0= ruleEString ) ) ( ( ruleEString ) ) (otherlv_11= '=' ( (lv_computedExpression_12_0= ruleExpression ) ) otherlv_13= ';' )? )
            // InternalQL.g:2755:3: ( (lv_isMandatory_0_0= 'mandatory' ) )? otherlv_1= 'question' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_isDisplayed_4_0= 'isDisplayed' ) )? (otherlv_5= 'currentValue' ( (lv_currentValue_6_0= ruleValue ) ) )? otherlv_7= ')' )? otherlv_8= ':' ( (lv_label_9_0= ruleEString ) ) ( ( ruleEString ) ) (otherlv_11= '=' ( (lv_computedExpression_12_0= ruleExpression ) ) otherlv_13= ';' )?
            {
            // InternalQL.g:2755:3: ( (lv_isMandatory_0_0= 'mandatory' ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==50) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalQL.g:2756:4: (lv_isMandatory_0_0= 'mandatory' )
                    {
                    // InternalQL.g:2756:4: (lv_isMandatory_0_0= 'mandatory' )
                    // InternalQL.g:2757:5: lv_isMandatory_0_0= 'mandatory'
                    {
                    lv_isMandatory_0_0=(Token)match(input,50,FOLLOW_45); 

                    					newLeafNode(lv_isMandatory_0_0, grammarAccess.getQuestionDefinitionAccess().getIsMandatoryMandatoryKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getQuestionDefinitionRule());
                    					}
                    					setWithLastConsumed(current, "isMandatory", lv_isMandatory_0_0 != null, "mandatory");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,51,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getQuestionDefinitionAccess().getQuestionKeyword_1());
            		
            // InternalQL.g:2773:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQL.g:2774:4: (lv_name_2_0= ruleEString )
            {
            // InternalQL.g:2774:4: (lv_name_2_0= ruleEString )
            // InternalQL.g:2775:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getQuestionDefinitionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_46);
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

            // InternalQL.g:2792:3: (otherlv_3= '(' ( (lv_isDisplayed_4_0= 'isDisplayed' ) )? (otherlv_5= 'currentValue' ( (lv_currentValue_6_0= ruleValue ) ) )? otherlv_7= ')' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==12) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalQL.g:2793:4: otherlv_3= '(' ( (lv_isDisplayed_4_0= 'isDisplayed' ) )? (otherlv_5= 'currentValue' ( (lv_currentValue_6_0= ruleValue ) ) )? otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_47); 

                    				newLeafNode(otherlv_3, grammarAccess.getQuestionDefinitionAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalQL.g:2797:4: ( (lv_isDisplayed_4_0= 'isDisplayed' ) )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==52) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalQL.g:2798:5: (lv_isDisplayed_4_0= 'isDisplayed' )
                            {
                            // InternalQL.g:2798:5: (lv_isDisplayed_4_0= 'isDisplayed' )
                            // InternalQL.g:2799:6: lv_isDisplayed_4_0= 'isDisplayed'
                            {
                            lv_isDisplayed_4_0=(Token)match(input,52,FOLLOW_48); 

                            						newLeafNode(lv_isDisplayed_4_0, grammarAccess.getQuestionDefinitionAccess().getIsDisplayedIsDisplayedKeyword_3_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getQuestionDefinitionRule());
                            						}
                            						setWithLastConsumed(current, "isDisplayed", lv_isDisplayed_4_0 != null, "isDisplayed");
                            					

                            }


                            }
                            break;

                    }

                    // InternalQL.g:2811:4: (otherlv_5= 'currentValue' ( (lv_currentValue_6_0= ruleValue ) ) )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==53) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalQL.g:2812:5: otherlv_5= 'currentValue' ( (lv_currentValue_6_0= ruleValue ) )
                            {
                            otherlv_5=(Token)match(input,53,FOLLOW_49); 

                            					newLeafNode(otherlv_5, grammarAccess.getQuestionDefinitionAccess().getCurrentValueKeyword_3_2_0());
                            				
                            // InternalQL.g:2816:5: ( (lv_currentValue_6_0= ruleValue ) )
                            // InternalQL.g:2817:6: (lv_currentValue_6_0= ruleValue )
                            {
                            // InternalQL.g:2817:6: (lv_currentValue_6_0= ruleValue )
                            // InternalQL.g:2818:7: lv_currentValue_6_0= ruleValue
                            {

                            							newCompositeNode(grammarAccess.getQuestionDefinitionAccess().getCurrentValueValueParserRuleCall_3_2_1_0());
                            						
                            pushFollow(FOLLOW_7);
                            lv_currentValue_6_0=ruleValue();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getQuestionDefinitionRule());
                            							}
                            							set(
                            								current,
                            								"currentValue",
                            								lv_currentValue_6_0,
                            								"org.gemoc.ql.QL.Value");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,15,FOLLOW_50); 

                    				newLeafNode(otherlv_7, grammarAccess.getQuestionDefinitionAccess().getRightParenthesisKeyword_3_3());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,54,FOLLOW_21); 

            			newLeafNode(otherlv_8, grammarAccess.getQuestionDefinitionAccess().getColonKeyword_4());
            		
            // InternalQL.g:2845:3: ( (lv_label_9_0= ruleEString ) )
            // InternalQL.g:2846:4: (lv_label_9_0= ruleEString )
            {
            // InternalQL.g:2846:4: (lv_label_9_0= ruleEString )
            // InternalQL.g:2847:5: lv_label_9_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getQuestionDefinitionAccess().getLabelEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_21);
            lv_label_9_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuestionDefinitionRule());
            					}
            					set(
            						current,
            						"label",
            						lv_label_9_0,
            						"org.gemoc.ql.QL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQL.g:2864:3: ( ( ruleEString ) )
            // InternalQL.g:2865:4: ( ruleEString )
            {
            // InternalQL.g:2865:4: ( ruleEString )
            // InternalQL.g:2866:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuestionDefinitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getQuestionDefinitionAccess().getDataTypeValueTypeCrossReference_6_0());
            				
            pushFollow(FOLLOW_17);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQL.g:2880:3: (otherlv_11= '=' ( (lv_computedExpression_12_0= ruleExpression ) ) otherlv_13= ';' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==55) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalQL.g:2881:4: otherlv_11= '=' ( (lv_computedExpression_12_0= ruleExpression ) ) otherlv_13= ';'
                    {
                    otherlv_11=(Token)match(input,55,FOLLOW_10); 

                    				newLeafNode(otherlv_11, grammarAccess.getQuestionDefinitionAccess().getEqualsSignKeyword_7_0());
                    			
                    // InternalQL.g:2885:4: ( (lv_computedExpression_12_0= ruleExpression ) )
                    // InternalQL.g:2886:5: (lv_computedExpression_12_0= ruleExpression )
                    {
                    // InternalQL.g:2886:5: (lv_computedExpression_12_0= ruleExpression )
                    // InternalQL.g:2887:6: lv_computedExpression_12_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getQuestionDefinitionAccess().getComputedExpressionExpressionParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_51);
                    lv_computedExpression_12_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuestionDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"computedExpression",
                    							lv_computedExpression_12_0,
                    							"org.gemoc.ql.QL.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,56,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getQuestionDefinitionAccess().getSemicolonKeyword_7_2());
                    			

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
    // InternalQL.g:2913:1: ruleBinaryOperatorKind returns [Enumerator current=null] : ( (enumLiteral_0= 'PLUS' ) | (enumLiteral_1= 'MINUS' ) | (enumLiteral_2= 'MULT' ) | (enumLiteral_3= 'DIV' ) | (enumLiteral_4= 'EQUAL' ) | (enumLiteral_5= 'NOTEQUAL' ) | (enumLiteral_6= 'GREATER' ) | (enumLiteral_7= 'LOWER' ) | (enumLiteral_8= 'GREATEROREQUAL' ) | (enumLiteral_9= 'LOWEROREQUAL' ) | (enumLiteral_10= 'AND' ) | (enumLiteral_11= 'OR' ) ) ;
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
            // InternalQL.g:2919:2: ( ( (enumLiteral_0= 'PLUS' ) | (enumLiteral_1= 'MINUS' ) | (enumLiteral_2= 'MULT' ) | (enumLiteral_3= 'DIV' ) | (enumLiteral_4= 'EQUAL' ) | (enumLiteral_5= 'NOTEQUAL' ) | (enumLiteral_6= 'GREATER' ) | (enumLiteral_7= 'LOWER' ) | (enumLiteral_8= 'GREATEROREQUAL' ) | (enumLiteral_9= 'LOWEROREQUAL' ) | (enumLiteral_10= 'AND' ) | (enumLiteral_11= 'OR' ) ) )
            // InternalQL.g:2920:2: ( (enumLiteral_0= 'PLUS' ) | (enumLiteral_1= 'MINUS' ) | (enumLiteral_2= 'MULT' ) | (enumLiteral_3= 'DIV' ) | (enumLiteral_4= 'EQUAL' ) | (enumLiteral_5= 'NOTEQUAL' ) | (enumLiteral_6= 'GREATER' ) | (enumLiteral_7= 'LOWER' ) | (enumLiteral_8= 'GREATEROREQUAL' ) | (enumLiteral_9= 'LOWEROREQUAL' ) | (enumLiteral_10= 'AND' ) | (enumLiteral_11= 'OR' ) )
            {
            // InternalQL.g:2920:2: ( (enumLiteral_0= 'PLUS' ) | (enumLiteral_1= 'MINUS' ) | (enumLiteral_2= 'MULT' ) | (enumLiteral_3= 'DIV' ) | (enumLiteral_4= 'EQUAL' ) | (enumLiteral_5= 'NOTEQUAL' ) | (enumLiteral_6= 'GREATER' ) | (enumLiteral_7= 'LOWER' ) | (enumLiteral_8= 'GREATEROREQUAL' ) | (enumLiteral_9= 'LOWEROREQUAL' ) | (enumLiteral_10= 'AND' ) | (enumLiteral_11= 'OR' ) )
            int alt56=12;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt56=1;
                }
                break;
            case 58:
                {
                alt56=2;
                }
                break;
            case 59:
                {
                alt56=3;
                }
                break;
            case 60:
                {
                alt56=4;
                }
                break;
            case 61:
                {
                alt56=5;
                }
                break;
            case 62:
                {
                alt56=6;
                }
                break;
            case 63:
                {
                alt56=7;
                }
                break;
            case 64:
                {
                alt56=8;
                }
                break;
            case 65:
                {
                alt56=9;
                }
                break;
            case 66:
                {
                alt56=10;
                }
                break;
            case 67:
                {
                alt56=11;
                }
                break;
            case 68:
                {
                alt56=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // InternalQL.g:2921:3: (enumLiteral_0= 'PLUS' )
                    {
                    // InternalQL.g:2921:3: (enumLiteral_0= 'PLUS' )
                    // InternalQL.g:2922:4: enumLiteral_0= 'PLUS'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBinaryOperatorKindAccess().getPLUSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:2929:3: (enumLiteral_1= 'MINUS' )
                    {
                    // InternalQL.g:2929:3: (enumLiteral_1= 'MINUS' )
                    // InternalQL.g:2930:4: enumLiteral_1= 'MINUS'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBinaryOperatorKindAccess().getMINUSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalQL.g:2937:3: (enumLiteral_2= 'MULT' )
                    {
                    // InternalQL.g:2937:3: (enumLiteral_2= 'MULT' )
                    // InternalQL.g:2938:4: enumLiteral_2= 'MULT'
                    {
                    enumLiteral_2=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBinaryOperatorKindAccess().getMULTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalQL.g:2945:3: (enumLiteral_3= 'DIV' )
                    {
                    // InternalQL.g:2945:3: (enumLiteral_3= 'DIV' )
                    // InternalQL.g:2946:4: enumLiteral_3= 'DIV'
                    {
                    enumLiteral_3=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getDIVEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBinaryOperatorKindAccess().getDIVEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalQL.g:2953:3: (enumLiteral_4= 'EQUAL' )
                    {
                    // InternalQL.g:2953:3: (enumLiteral_4= 'EQUAL' )
                    // InternalQL.g:2954:4: enumLiteral_4= 'EQUAL'
                    {
                    enumLiteral_4=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getEQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getBinaryOperatorKindAccess().getEQUALEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalQL.g:2961:3: (enumLiteral_5= 'NOTEQUAL' )
                    {
                    // InternalQL.g:2961:3: (enumLiteral_5= 'NOTEQUAL' )
                    // InternalQL.g:2962:4: enumLiteral_5= 'NOTEQUAL'
                    {
                    enumLiteral_5=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getNOTEQUALEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getBinaryOperatorKindAccess().getNOTEQUALEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalQL.g:2969:3: (enumLiteral_6= 'GREATER' )
                    {
                    // InternalQL.g:2969:3: (enumLiteral_6= 'GREATER' )
                    // InternalQL.g:2970:4: enumLiteral_6= 'GREATER'
                    {
                    enumLiteral_6=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getGREATEREnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getBinaryOperatorKindAccess().getGREATEREnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalQL.g:2977:3: (enumLiteral_7= 'LOWER' )
                    {
                    // InternalQL.g:2977:3: (enumLiteral_7= 'LOWER' )
                    // InternalQL.g:2978:4: enumLiteral_7= 'LOWER'
                    {
                    enumLiteral_7=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getLOWEREnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getBinaryOperatorKindAccess().getLOWEREnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalQL.g:2985:3: (enumLiteral_8= 'GREATEROREQUAL' )
                    {
                    // InternalQL.g:2985:3: (enumLiteral_8= 'GREATEROREQUAL' )
                    // InternalQL.g:2986:4: enumLiteral_8= 'GREATEROREQUAL'
                    {
                    enumLiteral_8=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getBinaryOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalQL.g:2993:3: (enumLiteral_9= 'LOWEROREQUAL' )
                    {
                    // InternalQL.g:2993:3: (enumLiteral_9= 'LOWEROREQUAL' )
                    // InternalQL.g:2994:4: enumLiteral_9= 'LOWEROREQUAL'
                    {
                    enumLiteral_9=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getLOWEROREQUALEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getBinaryOperatorKindAccess().getLOWEROREQUALEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalQL.g:3001:3: (enumLiteral_10= 'AND' )
                    {
                    // InternalQL.g:3001:3: (enumLiteral_10= 'AND' )
                    // InternalQL.g:3002:4: enumLiteral_10= 'AND'
                    {
                    enumLiteral_10=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getANDEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getBinaryOperatorKindAccess().getANDEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalQL.g:3009:3: (enumLiteral_11= 'OR' )
                    {
                    // InternalQL.g:3009:3: (enumLiteral_11= 'OR' )
                    // InternalQL.g:3010:4: enumLiteral_11= 'OR'
                    {
                    enumLiteral_11=(Token)match(input,68,FOLLOW_2); 

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
    // InternalQL.g:3020:1: ruleUnaryOperatorKind returns [Enumerator current=null] : ( (enumLiteral_0= '-' ) | (enumLiteral_1= 'not' ) ) ;
    public final Enumerator ruleUnaryOperatorKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalQL.g:3026:2: ( ( (enumLiteral_0= '-' ) | (enumLiteral_1= 'not' ) ) )
            // InternalQL.g:3027:2: ( (enumLiteral_0= '-' ) | (enumLiteral_1= 'not' ) )
            {
            // InternalQL.g:3027:2: ( (enumLiteral_0= '-' ) | (enumLiteral_1= 'not' ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==36) ) {
                alt57=1;
            }
            else if ( (LA57_0==69) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalQL.g:3028:3: (enumLiteral_0= '-' )
                    {
                    // InternalQL.g:3028:3: (enumLiteral_0= '-' )
                    // InternalQL.g:3029:4: enumLiteral_0= '-'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getUnaryOperatorKindAccess().getUNARYMINUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorKindAccess().getUNARYMINUSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:3036:3: (enumLiteral_1= 'not' )
                    {
                    // InternalQL.g:3036:3: (enumLiteral_1= 'not' )
                    // InternalQL.g:3037:4: enumLiteral_1= 'not'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_2); 

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


    // $ANTLR start "ruleAdditionOperatorKind"
    // InternalQL.g:3047:1: ruleAdditionOperatorKind returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditionOperatorKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalQL.g:3053:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalQL.g:3054:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalQL.g:3054:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==70) ) {
                alt58=1;
            }
            else if ( (LA58_0==36) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalQL.g:3055:3: (enumLiteral_0= '+' )
                    {
                    // InternalQL.g:3055:3: (enumLiteral_0= '+' )
                    // InternalQL.g:3056:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getAdditionOperatorKindAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAdditionOperatorKindAccess().getPLUSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:3063:3: (enumLiteral_1= '-' )
                    {
                    // InternalQL.g:3063:3: (enumLiteral_1= '-' )
                    // InternalQL.g:3064:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getAdditionOperatorKindAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAdditionOperatorKindAccess().getMINUSEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleAdditionOperatorKind"


    // $ANTLR start "ruleMultiplicationOperatorKind"
    // InternalQL.g:3074:1: ruleMultiplicationOperatorKind returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) ;
    public final Enumerator ruleMultiplicationOperatorKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalQL.g:3080:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) )
            // InternalQL.g:3081:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            {
            // InternalQL.g:3081:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==71) ) {
                alt59=1;
            }
            else if ( (LA59_0==72) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalQL.g:3082:3: (enumLiteral_0= '*' )
                    {
                    // InternalQL.g:3082:3: (enumLiteral_0= '*' )
                    // InternalQL.g:3083:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicationOperatorKindAccess().getMULTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMultiplicationOperatorKindAccess().getMULTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:3090:3: (enumLiteral_1= '/' )
                    {
                    // InternalQL.g:3090:3: (enumLiteral_1= '/' )
                    // InternalQL.g:3091:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicationOperatorKindAccess().getDIVEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMultiplicationOperatorKindAccess().getDIVEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleMultiplicationOperatorKind"


    // $ANTLR start "ruleEqualOperatorKind"
    // InternalQL.g:3101:1: ruleEqualOperatorKind returns [Enumerator current=null] : (enumLiteral_0= '=' ) ;
    public final Enumerator ruleEqualOperatorKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalQL.g:3107:2: ( (enumLiteral_0= '=' ) )
            // InternalQL.g:3108:2: (enumLiteral_0= '=' )
            {
            // InternalQL.g:3108:2: (enumLiteral_0= '=' )
            // InternalQL.g:3109:3: enumLiteral_0= '='
            {
            enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

            			current = grammarAccess.getEqualOperatorKindAccess().getEQUALEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getEqualOperatorKindAccess().getEQUALEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleEqualOperatorKind"


    // $ANTLR start "ruleComparisionOperatorKind"
    // InternalQL.g:3118:1: ruleComparisionOperatorKind returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) ) ;
    public final Enumerator ruleComparisionOperatorKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalQL.g:3124:2: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) ) )
            // InternalQL.g:3125:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) )
            {
            // InternalQL.g:3125:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) )
            int alt60=4;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt60=1;
                }
                break;
            case 74:
                {
                alt60=2;
                }
                break;
            case 75:
                {
                alt60=3;
                }
                break;
            case 76:
                {
                alt60=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalQL.g:3126:3: (enumLiteral_0= '>' )
                    {
                    // InternalQL.g:3126:3: (enumLiteral_0= '>' )
                    // InternalQL.g:3127:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getComparisionOperatorKindAccess().getGREATEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getComparisionOperatorKindAccess().getGREATEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:3134:3: (enumLiteral_1= '<' )
                    {
                    // InternalQL.g:3134:3: (enumLiteral_1= '<' )
                    // InternalQL.g:3135:4: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getComparisionOperatorKindAccess().getLOWEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getComparisionOperatorKindAccess().getLOWEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalQL.g:3142:3: (enumLiteral_2= '>=' )
                    {
                    // InternalQL.g:3142:3: (enumLiteral_2= '>=' )
                    // InternalQL.g:3143:4: enumLiteral_2= '>='
                    {
                    enumLiteral_2=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getComparisionOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getComparisionOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalQL.g:3150:3: (enumLiteral_3= '<=' )
                    {
                    // InternalQL.g:3150:3: (enumLiteral_3= '<=' )
                    // InternalQL.g:3151:4: enumLiteral_3= '<='
                    {
                    enumLiteral_3=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getComparisionOperatorKindAccess().getLOWEROREQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getComparisionOperatorKindAccess().getLOWEROREQUALEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleComparisionOperatorKind"


    // $ANTLR start "ruleAndOperatorKind"
    // InternalQL.g:3161:1: ruleAndOperatorKind returns [Enumerator current=null] : (enumLiteral_0= 'and' ) ;
    public final Enumerator ruleAndOperatorKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalQL.g:3167:2: ( (enumLiteral_0= 'and' ) )
            // InternalQL.g:3168:2: (enumLiteral_0= 'and' )
            {
            // InternalQL.g:3168:2: (enumLiteral_0= 'and' )
            // InternalQL.g:3169:3: enumLiteral_0= 'and'
            {
            enumLiteral_0=(Token)match(input,77,FOLLOW_2); 

            			current = grammarAccess.getAndOperatorKindAccess().getANDEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getAndOperatorKindAccess().getANDEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleAndOperatorKind"


    // $ANTLR start "ruleOrOperatorKind"
    // InternalQL.g:3178:1: ruleOrOperatorKind returns [Enumerator current=null] : (enumLiteral_0= 'or' ) ;
    public final Enumerator ruleOrOperatorKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalQL.g:3184:2: ( (enumLiteral_0= 'or' ) )
            // InternalQL.g:3185:2: (enumLiteral_0= 'or' )
            {
            // InternalQL.g:3185:2: (enumLiteral_0= 'or' )
            // InternalQL.g:3186:3: enumLiteral_0= 'or'
            {
            enumLiteral_0=(Token)match(input,78,FOLLOW_2); 

            			current = grammarAccess.getOrOperatorKindAccess().getOREnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getOrOperatorKindAccess().getOREnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleOrOperatorKind"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000620000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000026B000041030L,0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000026A000041030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001E00L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000026A000000030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000C0009CD020000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000026A000070030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000032020000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000030020000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000202020000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000200020000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400020000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000004000020000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000020000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000100000020000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000400000020000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000801000000040L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000800000000040L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0040000000001000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0030000000008000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0020000000008000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x00002EA000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0100000000000000L});

}