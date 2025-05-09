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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'QLModel'", "'('", "'canSubmit'", "'submitDate'", "')'", "'{'", "'definitions'", "'displayableQuestions'", "'}'", "'if'", "'then'", "'else'", "'endif'", "'true'", "'false'", "'EDate'", "'ValueType'", "'unit'", "'booleanType'", "'integerType'", "'min'", "'max'", "'decimalType'", "'dateType'", "'enumerationType'", "'literals'", "','", "'StringType'", "'DateValue'", "'dateValue'", "'.'", "'E'", "'e'", "'-'", "'mandatory'", "'question'", "'isDisplayed'", "'currentValue'", "':'", "'='", "';'", "'PLUS'", "'MINUS'", "'MULT'", "'DIV'", "'EQUAL'", "'NOTEQUAL'", "'GREATER'", "'LOWER'", "'GREATEROREQUAL'", "'LOWEROREQUAL'", "'AND'", "'OR'", "'not'", "'+'", "'*'", "'/'", "'>'", "'<'", "'>='", "'<='", "'and'", "'or'"
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
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=5;
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
    public static final int T__31=31;
    public static final int T__32=32;
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
    // InternalQL.g:72:1: ruleQLModel returns [EObject current=null] : ( () otherlv_1= 'QLModel' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_canSubmit_4_0= 'canSubmit' ) )? (otherlv_5= 'submitDate' ( (lv_submitDate_6_0= ruleEDate ) ) )? otherlv_7= ')' )? otherlv_8= '{' ( (otherlv_9= 'definitions' ( (lv_definitionGroup_10_0= ruleDefinitionGroup ) ) ) | (otherlv_11= 'displayableQuestions' ( (lv_questionGroups_12_0= ruleQuestionGroup ) ) ) )* otherlv_13= '}' ) ;
    public final EObject ruleQLModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_canSubmit_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_submitDate_6_0 = null;

        EObject lv_definitionGroup_10_0 = null;

        EObject lv_questionGroups_12_0 = null;



        	enterRule();

        try {
            // InternalQL.g:78:2: ( ( () otherlv_1= 'QLModel' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_canSubmit_4_0= 'canSubmit' ) )? (otherlv_5= 'submitDate' ( (lv_submitDate_6_0= ruleEDate ) ) )? otherlv_7= ')' )? otherlv_8= '{' ( (otherlv_9= 'definitions' ( (lv_definitionGroup_10_0= ruleDefinitionGroup ) ) ) | (otherlv_11= 'displayableQuestions' ( (lv_questionGroups_12_0= ruleQuestionGroup ) ) ) )* otherlv_13= '}' ) )
            // InternalQL.g:79:2: ( () otherlv_1= 'QLModel' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_canSubmit_4_0= 'canSubmit' ) )? (otherlv_5= 'submitDate' ( (lv_submitDate_6_0= ruleEDate ) ) )? otherlv_7= ')' )? otherlv_8= '{' ( (otherlv_9= 'definitions' ( (lv_definitionGroup_10_0= ruleDefinitionGroup ) ) ) | (otherlv_11= 'displayableQuestions' ( (lv_questionGroups_12_0= ruleQuestionGroup ) ) ) )* otherlv_13= '}' )
            {
            // InternalQL.g:79:2: ( () otherlv_1= 'QLModel' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_canSubmit_4_0= 'canSubmit' ) )? (otherlv_5= 'submitDate' ( (lv_submitDate_6_0= ruleEDate ) ) )? otherlv_7= ')' )? otherlv_8= '{' ( (otherlv_9= 'definitions' ( (lv_definitionGroup_10_0= ruleDefinitionGroup ) ) ) | (otherlv_11= 'displayableQuestions' ( (lv_questionGroups_12_0= ruleQuestionGroup ) ) ) )* otherlv_13= '}' )
            // InternalQL.g:80:3: () otherlv_1= 'QLModel' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_canSubmit_4_0= 'canSubmit' ) )? (otherlv_5= 'submitDate' ( (lv_submitDate_6_0= ruleEDate ) ) )? otherlv_7= ')' )? otherlv_8= '{' ( (otherlv_9= 'definitions' ( (lv_definitionGroup_10_0= ruleDefinitionGroup ) ) ) | (otherlv_11= 'displayableQuestions' ( (lv_questionGroups_12_0= ruleQuestionGroup ) ) ) )* otherlv_13= '}'
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
            		
            // InternalQL.g:91:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalQL.g:92:4: (lv_name_2_0= RULE_ID )
            {
            // InternalQL.g:92:4: (lv_name_2_0= RULE_ID )
            // InternalQL.g:93:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getQLModelAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQLModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalQL.g:109:3: (otherlv_3= '(' ( (lv_canSubmit_4_0= 'canSubmit' ) )? (otherlv_5= 'submitDate' ( (lv_submitDate_6_0= ruleEDate ) ) )? otherlv_7= ')' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalQL.g:110:4: otherlv_3= '(' ( (lv_canSubmit_4_0= 'canSubmit' ) )? (otherlv_5= 'submitDate' ( (lv_submitDate_6_0= ruleEDate ) ) )? otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getQLModelAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalQL.g:114:4: ( (lv_canSubmit_4_0= 'canSubmit' ) )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==13) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // InternalQL.g:115:5: (lv_canSubmit_4_0= 'canSubmit' )
                            {
                            // InternalQL.g:115:5: (lv_canSubmit_4_0= 'canSubmit' )
                            // InternalQL.g:116:6: lv_canSubmit_4_0= 'canSubmit'
                            {
                            lv_canSubmit_4_0=(Token)match(input,13,FOLLOW_6); 

                            						newLeafNode(lv_canSubmit_4_0, grammarAccess.getQLModelAccess().getCanSubmitCanSubmitKeyword_3_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getQLModelRule());
                            						}
                            						setWithLastConsumed(current, "canSubmit", lv_canSubmit_4_0 != null, "canSubmit");
                            					

                            }


                            }
                            break;

                    }

                    // InternalQL.g:128:4: (otherlv_5= 'submitDate' ( (lv_submitDate_6_0= ruleEDate ) ) )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==14) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalQL.g:129:5: otherlv_5= 'submitDate' ( (lv_submitDate_6_0= ruleEDate ) )
                            {
                            otherlv_5=(Token)match(input,14,FOLLOW_7); 

                            					newLeafNode(otherlv_5, grammarAccess.getQLModelAccess().getSubmitDateKeyword_3_2_0());
                            				
                            // InternalQL.g:133:5: ( (lv_submitDate_6_0= ruleEDate ) )
                            // InternalQL.g:134:6: (lv_submitDate_6_0= ruleEDate )
                            {
                            // InternalQL.g:134:6: (lv_submitDate_6_0= ruleEDate )
                            // InternalQL.g:135:7: lv_submitDate_6_0= ruleEDate
                            {

                            							newCompositeNode(grammarAccess.getQLModelAccess().getSubmitDateEDateParserRuleCall_3_2_1_0());
                            						
                            pushFollow(FOLLOW_8);
                            lv_submitDate_6_0=ruleEDate();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getQLModelRule());
                            							}
                            							set(
                            								current,
                            								"submitDate",
                            								lv_submitDate_6_0,
                            								"org.gemoc.ql.QL.EDate");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getQLModelAccess().getRightParenthesisKeyword_3_3());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getQLModelAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalQL.g:162:3: ( (otherlv_9= 'definitions' ( (lv_definitionGroup_10_0= ruleDefinitionGroup ) ) ) | (otherlv_11= 'displayableQuestions' ( (lv_questionGroups_12_0= ruleQuestionGroup ) ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }
                else if ( (LA4_0==18) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalQL.g:163:4: (otherlv_9= 'definitions' ( (lv_definitionGroup_10_0= ruleDefinitionGroup ) ) )
            	    {
            	    // InternalQL.g:163:4: (otherlv_9= 'definitions' ( (lv_definitionGroup_10_0= ruleDefinitionGroup ) ) )
            	    // InternalQL.g:164:5: otherlv_9= 'definitions' ( (lv_definitionGroup_10_0= ruleDefinitionGroup ) )
            	    {
            	    otherlv_9=(Token)match(input,17,FOLLOW_9); 

            	    					newLeafNode(otherlv_9, grammarAccess.getQLModelAccess().getDefinitionsKeyword_5_0_0());
            	    				
            	    // InternalQL.g:168:5: ( (lv_definitionGroup_10_0= ruleDefinitionGroup ) )
            	    // InternalQL.g:169:6: (lv_definitionGroup_10_0= ruleDefinitionGroup )
            	    {
            	    // InternalQL.g:169:6: (lv_definitionGroup_10_0= ruleDefinitionGroup )
            	    // InternalQL.g:170:7: lv_definitionGroup_10_0= ruleDefinitionGroup
            	    {

            	    							newCompositeNode(grammarAccess.getQLModelAccess().getDefinitionGroupDefinitionGroupParserRuleCall_5_0_1_0());
            	    						
            	    pushFollow(FOLLOW_10);
            	    lv_definitionGroup_10_0=ruleDefinitionGroup();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getQLModelRule());
            	    							}
            	    							add(
            	    								current,
            	    								"definitionGroup",
            	    								lv_definitionGroup_10_0,
            	    								"org.gemoc.ql.QL.DefinitionGroup");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalQL.g:189:4: (otherlv_11= 'displayableQuestions' ( (lv_questionGroups_12_0= ruleQuestionGroup ) ) )
            	    {
            	    // InternalQL.g:189:4: (otherlv_11= 'displayableQuestions' ( (lv_questionGroups_12_0= ruleQuestionGroup ) ) )
            	    // InternalQL.g:190:5: otherlv_11= 'displayableQuestions' ( (lv_questionGroups_12_0= ruleQuestionGroup ) )
            	    {
            	    otherlv_11=(Token)match(input,18,FOLLOW_11); 

            	    					newLeafNode(otherlv_11, grammarAccess.getQLModelAccess().getDisplayableQuestionsKeyword_5_1_0());
            	    				
            	    // InternalQL.g:194:5: ( (lv_questionGroups_12_0= ruleQuestionGroup ) )
            	    // InternalQL.g:195:6: (lv_questionGroups_12_0= ruleQuestionGroup )
            	    {
            	    // InternalQL.g:195:6: (lv_questionGroups_12_0= ruleQuestionGroup )
            	    // InternalQL.g:196:7: lv_questionGroups_12_0= ruleQuestionGroup
            	    {

            	    							newCompositeNode(grammarAccess.getQLModelAccess().getQuestionGroupsQuestionGroupParserRuleCall_5_1_1_0());
            	    						
            	    pushFollow(FOLLOW_10);
            	    lv_questionGroups_12_0=ruleQuestionGroup();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getQLModelRule());
            	    							}
            	    							add(
            	    								current,
            	    								"questionGroups",
            	    								lv_questionGroups_12_0,
            	    								"org.gemoc.ql.QL.QuestionGroup");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_13=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getQLModelAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalQL.g:223:1: entryRuleValueType returns [EObject current=null] : iv_ruleValueType= ruleValueType EOF ;
    public final EObject entryRuleValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueType = null;


        try {
            // InternalQL.g:223:50: (iv_ruleValueType= ruleValueType EOF )
            // InternalQL.g:224:2: iv_ruleValueType= ruleValueType EOF
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
    // InternalQL.g:230:1: ruleValueType returns [EObject current=null] : (this_ValueType_Impl_0= ruleValueType_Impl | this_BooleanValueType_1= ruleBooleanValueType | this_IntegerValueType_2= ruleIntegerValueType | this_DecimalValueType_3= ruleDecimalValueType | this_DateValueType_4= ruleDateValueType | this_EnumerationValueType_5= ruleEnumerationValueType | this_StringValueType_6= ruleStringValueType ) ;
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
            // InternalQL.g:236:2: ( (this_ValueType_Impl_0= ruleValueType_Impl | this_BooleanValueType_1= ruleBooleanValueType | this_IntegerValueType_2= ruleIntegerValueType | this_DecimalValueType_3= ruleDecimalValueType | this_DateValueType_4= ruleDateValueType | this_EnumerationValueType_5= ruleEnumerationValueType | this_StringValueType_6= ruleStringValueType ) )
            // InternalQL.g:237:2: (this_ValueType_Impl_0= ruleValueType_Impl | this_BooleanValueType_1= ruleBooleanValueType | this_IntegerValueType_2= ruleIntegerValueType | this_DecimalValueType_3= ruleDecimalValueType | this_DateValueType_4= ruleDateValueType | this_EnumerationValueType_5= ruleEnumerationValueType | this_StringValueType_6= ruleStringValueType )
            {
            // InternalQL.g:237:2: (this_ValueType_Impl_0= ruleValueType_Impl | this_BooleanValueType_1= ruleBooleanValueType | this_IntegerValueType_2= ruleIntegerValueType | this_DecimalValueType_3= ruleDecimalValueType | this_DateValueType_4= ruleDateValueType | this_EnumerationValueType_5= ruleEnumerationValueType | this_StringValueType_6= ruleStringValueType )
            int alt5=7;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt5=1;
                }
                break;
            case 29:
                {
                alt5=2;
                }
                break;
            case 30:
                {
                alt5=3;
                }
                break;
            case 33:
                {
                alt5=4;
                }
                break;
            case 34:
                {
                alt5=5;
                }
                break;
            case 35:
                {
                alt5=6;
                }
                break;
            case 38:
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
                    // InternalQL.g:238:3: this_ValueType_Impl_0= ruleValueType_Impl
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
                    // InternalQL.g:247:3: this_BooleanValueType_1= ruleBooleanValueType
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
                    // InternalQL.g:256:3: this_IntegerValueType_2= ruleIntegerValueType
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
                    // InternalQL.g:265:3: this_DecimalValueType_3= ruleDecimalValueType
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
                    // InternalQL.g:274:3: this_DateValueType_4= ruleDateValueType
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
                    // InternalQL.g:283:3: this_EnumerationValueType_5= ruleEnumerationValueType
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
                    // InternalQL.g:292:3: this_StringValueType_6= ruleStringValueType
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
    // InternalQL.g:304:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalQL.g:304:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalQL.g:305:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalQL.g:311:1: ruleExpression returns [EObject current=null] : this_UnaryOrPrimaryExpression_0= ruleUnaryOrPrimaryExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryOrPrimaryExpression_0 = null;



        	enterRule();

        try {
            // InternalQL.g:317:2: (this_UnaryOrPrimaryExpression_0= ruleUnaryOrPrimaryExpression )
            // InternalQL.g:318:2: this_UnaryOrPrimaryExpression_0= ruleUnaryOrPrimaryExpression
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
    // InternalQL.g:329:1: entryRuleUnaryOrPrimaryExpression returns [EObject current=null] : iv_ruleUnaryOrPrimaryExpression= ruleUnaryOrPrimaryExpression EOF ;
    public final EObject entryRuleUnaryOrPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOrPrimaryExpression = null;


        try {
            // InternalQL.g:329:65: (iv_ruleUnaryOrPrimaryExpression= ruleUnaryOrPrimaryExpression EOF )
            // InternalQL.g:330:2: iv_ruleUnaryOrPrimaryExpression= ruleUnaryOrPrimaryExpression EOF
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
    // InternalQL.g:336:1: ruleUnaryOrPrimaryExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression | this_UnaryExpression_1= ruleUnaryExpression ) ;
    public final EObject ruleUnaryOrPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        EObject this_UnaryExpression_1 = null;



        	enterRule();

        try {
            // InternalQL.g:342:2: ( (this_PrimaryExpression_0= rulePrimaryExpression | this_UnaryExpression_1= ruleUnaryExpression ) )
            // InternalQL.g:343:2: (this_PrimaryExpression_0= rulePrimaryExpression | this_UnaryExpression_1= ruleUnaryExpression )
            {
            // InternalQL.g:343:2: (this_PrimaryExpression_0= rulePrimaryExpression | this_UnaryExpression_1= ruleUnaryExpression )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_INT)||LA6_0==12||LA6_0==20||(LA6_0>=24 && LA6_0<=25)||LA6_0==41) ) {
                alt6=1;
            }
            else if ( (LA6_0==44||LA6_0==64) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalQL.g:344:3: this_PrimaryExpression_0= rulePrimaryExpression
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
                    // InternalQL.g:353:3: this_UnaryExpression_1= ruleUnaryExpression
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
    // InternalQL.g:365:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalQL.g:365:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalQL.g:366:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalQL.g:372:1: ruleUnaryExpression returns [EObject current=null] : ( () ( (lv_operator_1_0= ruleUnaryOperatorKind ) ) ( (lv_operand_2_0= ruleUnaryOrPrimaryExpression ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_operand_2_0 = null;



        	enterRule();

        try {
            // InternalQL.g:378:2: ( ( () ( (lv_operator_1_0= ruleUnaryOperatorKind ) ) ( (lv_operand_2_0= ruleUnaryOrPrimaryExpression ) ) ) )
            // InternalQL.g:379:2: ( () ( (lv_operator_1_0= ruleUnaryOperatorKind ) ) ( (lv_operand_2_0= ruleUnaryOrPrimaryExpression ) ) )
            {
            // InternalQL.g:379:2: ( () ( (lv_operator_1_0= ruleUnaryOperatorKind ) ) ( (lv_operand_2_0= ruleUnaryOrPrimaryExpression ) ) )
            // InternalQL.g:380:3: () ( (lv_operator_1_0= ruleUnaryOperatorKind ) ) ( (lv_operand_2_0= ruleUnaryOrPrimaryExpression ) )
            {
            // InternalQL.g:380:3: ()
            // InternalQL.g:381:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUnaryExpressionAccess().getBasicUnaryExpressionAction_0(),
            					current);
            			

            }

            // InternalQL.g:387:3: ( (lv_operator_1_0= ruleUnaryOperatorKind ) )
            // InternalQL.g:388:4: (lv_operator_1_0= ruleUnaryOperatorKind )
            {
            // InternalQL.g:388:4: (lv_operator_1_0= ruleUnaryOperatorKind )
            // InternalQL.g:389:5: lv_operator_1_0= ruleUnaryOperatorKind
            {

            					newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorKindEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
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

            // InternalQL.g:406:3: ( (lv_operand_2_0= ruleUnaryOrPrimaryExpression ) )
            // InternalQL.g:407:4: (lv_operand_2_0= ruleUnaryOrPrimaryExpression )
            {
            // InternalQL.g:407:4: (lv_operand_2_0= ruleUnaryOrPrimaryExpression )
            // InternalQL.g:408:5: lv_operand_2_0= ruleUnaryOrPrimaryExpression
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
    // InternalQL.g:429:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalQL.g:429:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalQL.g:430:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalQL.g:436:1: rulePrimaryExpression returns [EObject current=null] : (this_Call_0= ruleCall | this_IfExpression_1= ruleIfExpression | (otherlv_2= '(' (this_OrExpression_3= ruleOrExpression | this_UnaryExpression_4= ruleUnaryExpression ) otherlv_5= ')' ) ) ;
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
            // InternalQL.g:442:2: ( (this_Call_0= ruleCall | this_IfExpression_1= ruleIfExpression | (otherlv_2= '(' (this_OrExpression_3= ruleOrExpression | this_UnaryExpression_4= ruleUnaryExpression ) otherlv_5= ')' ) ) )
            // InternalQL.g:443:2: (this_Call_0= ruleCall | this_IfExpression_1= ruleIfExpression | (otherlv_2= '(' (this_OrExpression_3= ruleOrExpression | this_UnaryExpression_4= ruleUnaryExpression ) otherlv_5= ')' ) )
            {
            // InternalQL.g:443:2: (this_Call_0= ruleCall | this_IfExpression_1= ruleIfExpression | (otherlv_2= '(' (this_OrExpression_3= ruleOrExpression | this_UnaryExpression_4= ruleUnaryExpression ) otherlv_5= ')' ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 24:
            case 25:
            case 41:
                {
                alt8=1;
                }
                break;
            case 20:
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
                    // InternalQL.g:444:3: this_Call_0= ruleCall
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
                    // InternalQL.g:453:3: this_IfExpression_1= ruleIfExpression
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
                    // InternalQL.g:462:3: (otherlv_2= '(' (this_OrExpression_3= ruleOrExpression | this_UnaryExpression_4= ruleUnaryExpression ) otherlv_5= ')' )
                    {
                    // InternalQL.g:462:3: (otherlv_2= '(' (this_OrExpression_3= ruleOrExpression | this_UnaryExpression_4= ruleUnaryExpression ) otherlv_5= ')' )
                    // InternalQL.g:463:4: otherlv_2= '(' (this_OrExpression_3= ruleOrExpression | this_UnaryExpression_4= ruleUnaryExpression ) otherlv_5= ')'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalQL.g:467:4: (this_OrExpression_3= ruleOrExpression | this_UnaryExpression_4= ruleUnaryExpression )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_INT)||LA7_0==12||LA7_0==20||(LA7_0>=24 && LA7_0<=25)||LA7_0==41) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==44||LA7_0==64) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalQL.g:468:5: this_OrExpression_3= ruleOrExpression
                            {

                            					newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOrExpressionParserRuleCall_2_1_0());
                            				
                            pushFollow(FOLLOW_8);
                            this_OrExpression_3=ruleOrExpression();

                            state._fsp--;


                            					current = this_OrExpression_3;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 2 :
                            // InternalQL.g:477:5: this_UnaryExpression_4= ruleUnaryExpression
                            {

                            					newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getUnaryExpressionParserRuleCall_2_1_1());
                            				
                            pushFollow(FOLLOW_8);
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
    // InternalQL.g:495:1: entryRuleIfExpression returns [EObject current=null] : iv_ruleIfExpression= ruleIfExpression EOF ;
    public final EObject entryRuleIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpression = null;


        try {
            // InternalQL.g:495:53: (iv_ruleIfExpression= ruleIfExpression EOF )
            // InternalQL.g:496:2: iv_ruleIfExpression= ruleIfExpression EOF
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
    // InternalQL.g:502:1: ruleIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleExpression ) ) (otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleExpression ) ) )? otherlv_7= 'endif' ) ;
    public final EObject ruleIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_condition_2_0 = null;

        EObject lv_thenExpression_4_0 = null;

        EObject lv_elseExpression_6_0 = null;



        	enterRule();

        try {
            // InternalQL.g:508:2: ( ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleExpression ) ) (otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleExpression ) ) )? otherlv_7= 'endif' ) )
            // InternalQL.g:509:2: ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleExpression ) ) (otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleExpression ) ) )? otherlv_7= 'endif' )
            {
            // InternalQL.g:509:2: ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleExpression ) ) (otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleExpression ) ) )? otherlv_7= 'endif' )
            // InternalQL.g:510:3: () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleExpression ) ) (otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleExpression ) ) )? otherlv_7= 'endif'
            {
            // InternalQL.g:510:3: ()
            // InternalQL.g:511:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIfExpressionAccess().getIfExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getIfExpressionAccess().getIfKeyword_1());
            		
            // InternalQL.g:521:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalQL.g:522:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalQL.g:522:4: (lv_condition_2_0= ruleExpression )
            // InternalQL.g:523:5: lv_condition_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfExpressionAccess().getConditionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
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

            otherlv_3=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getIfExpressionAccess().getThenKeyword_3());
            		
            // InternalQL.g:544:3: ( (lv_thenExpression_4_0= ruleExpression ) )
            // InternalQL.g:545:4: (lv_thenExpression_4_0= ruleExpression )
            {
            // InternalQL.g:545:4: (lv_thenExpression_4_0= ruleExpression )
            // InternalQL.g:546:5: lv_thenExpression_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfExpressionAccess().getThenExpressionExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_thenExpression_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfExpressionRule());
            					}
            					set(
            						current,
            						"thenExpression",
            						lv_thenExpression_4_0,
            						"org.gemoc.ql.QL.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQL.g:563:3: (otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleExpression ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalQL.g:564:4: otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleExpression ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getIfExpressionAccess().getElseKeyword_5_0());
                    			
                    // InternalQL.g:568:4: ( (lv_elseExpression_6_0= ruleExpression ) )
                    // InternalQL.g:569:5: (lv_elseExpression_6_0= ruleExpression )
                    {
                    // InternalQL.g:569:5: (lv_elseExpression_6_0= ruleExpression )
                    // InternalQL.g:570:6: lv_elseExpression_6_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getIfExpressionAccess().getElseExpressionExpressionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_elseExpression_6_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfExpressionRule());
                    						}
                    						set(
                    							current,
                    							"elseExpression",
                    							lv_elseExpression_6_0,
                    							"org.gemoc.ql.QL.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getIfExpressionAccess().getEndifKeyword_6());
            		

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
    // InternalQL.g:596:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalQL.g:596:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalQL.g:597:2: iv_ruleOrExpression= ruleOrExpression EOF
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
    // InternalQL.g:603:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rhsOperand_3_0 = null;



        	enterRule();

        try {
            // InternalQL.g:609:2: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAndExpression ) ) )* ) )
            // InternalQL.g:610:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAndExpression ) ) )* )
            {
            // InternalQL.g:610:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAndExpression ) ) )* )
            // InternalQL.g:611:3: this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current = this_AndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalQL.g:619:3: ( () ( (lv_operator_2_0= ruleOrOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAndExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==73) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalQL.g:620:4: () ( (lv_operator_2_0= ruleOrOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAndExpression ) )
            	    {
            	    // InternalQL.g:620:4: ()
            	    // InternalQL.g:621:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalQL.g:627:4: ( (lv_operator_2_0= ruleOrOperatorKind ) )
            	    // InternalQL.g:628:5: (lv_operator_2_0= ruleOrOperatorKind )
            	    {
            	    // InternalQL.g:628:5: (lv_operator_2_0= ruleOrOperatorKind )
            	    // InternalQL.g:629:6: lv_operator_2_0= ruleOrOperatorKind
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorKindEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
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

            	    // InternalQL.g:646:4: ( (lv_rhsOperand_3_0= ruleAndExpression ) )
            	    // InternalQL.g:647:5: (lv_rhsOperand_3_0= ruleAndExpression )
            	    {
            	    // InternalQL.g:647:5: (lv_rhsOperand_3_0= ruleAndExpression )
            	    // InternalQL.g:648:6: lv_rhsOperand_3_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getRhsOperandAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_16);
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
    // InternalQL.g:670:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalQL.g:670:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalQL.g:671:2: iv_ruleAndExpression= ruleAndExpression EOF
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
    // InternalQL.g:677:1: ruleAndExpression returns [EObject current=null] : (this_EqualExpression_0= ruleEqualExpression ( () ( (lv_operator_2_0= ruleAndOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleEqualExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EqualExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rhsOperand_3_0 = null;



        	enterRule();

        try {
            // InternalQL.g:683:2: ( (this_EqualExpression_0= ruleEqualExpression ( () ( (lv_operator_2_0= ruleAndOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleEqualExpression ) ) )* ) )
            // InternalQL.g:684:2: (this_EqualExpression_0= ruleEqualExpression ( () ( (lv_operator_2_0= ruleAndOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleEqualExpression ) ) )* )
            {
            // InternalQL.g:684:2: (this_EqualExpression_0= ruleEqualExpression ( () ( (lv_operator_2_0= ruleAndOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleEqualExpression ) ) )* )
            // InternalQL.g:685:3: this_EqualExpression_0= ruleEqualExpression ( () ( (lv_operator_2_0= ruleAndOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleEqualExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_EqualExpression_0=ruleEqualExpression();

            state._fsp--;


            			current = this_EqualExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalQL.g:693:3: ( () ( (lv_operator_2_0= ruleAndOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleEqualExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==72) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalQL.g:694:4: () ( (lv_operator_2_0= ruleAndOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleEqualExpression ) )
            	    {
            	    // InternalQL.g:694:4: ()
            	    // InternalQL.g:695:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalQL.g:701:4: ( (lv_operator_2_0= ruleAndOperatorKind ) )
            	    // InternalQL.g:702:5: (lv_operator_2_0= ruleAndOperatorKind )
            	    {
            	    // InternalQL.g:702:5: (lv_operator_2_0= ruleAndOperatorKind )
            	    // InternalQL.g:703:6: lv_operator_2_0= ruleAndOperatorKind
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorKindEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
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

            	    // InternalQL.g:720:4: ( (lv_rhsOperand_3_0= ruleEqualExpression ) )
            	    // InternalQL.g:721:5: (lv_rhsOperand_3_0= ruleEqualExpression )
            	    {
            	    // InternalQL.g:721:5: (lv_rhsOperand_3_0= ruleEqualExpression )
            	    // InternalQL.g:722:6: lv_rhsOperand_3_0= ruleEqualExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getRhsOperandEqualExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_18);
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
    // InternalQL.g:744:1: entryRuleEqualExpression returns [EObject current=null] : iv_ruleEqualExpression= ruleEqualExpression EOF ;
    public final EObject entryRuleEqualExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualExpression = null;


        try {
            // InternalQL.g:744:56: (iv_ruleEqualExpression= ruleEqualExpression EOF )
            // InternalQL.g:745:2: iv_ruleEqualExpression= ruleEqualExpression EOF
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
    // InternalQL.g:751:1: ruleEqualExpression returns [EObject current=null] : (this_ComparisionExpression_0= ruleComparisionExpression ( () ( (lv_operator_2_0= ruleEqualOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleComparisionExpression ) ) )* ) ;
    public final EObject ruleEqualExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ComparisionExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rhsOperand_3_0 = null;



        	enterRule();

        try {
            // InternalQL.g:757:2: ( (this_ComparisionExpression_0= ruleComparisionExpression ( () ( (lv_operator_2_0= ruleEqualOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleComparisionExpression ) ) )* ) )
            // InternalQL.g:758:2: (this_ComparisionExpression_0= ruleComparisionExpression ( () ( (lv_operator_2_0= ruleEqualOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleComparisionExpression ) ) )* )
            {
            // InternalQL.g:758:2: (this_ComparisionExpression_0= ruleComparisionExpression ( () ( (lv_operator_2_0= ruleEqualOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleComparisionExpression ) ) )* )
            // InternalQL.g:759:3: this_ComparisionExpression_0= ruleComparisionExpression ( () ( (lv_operator_2_0= ruleEqualOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleComparisionExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualExpressionAccess().getComparisionExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_ComparisionExpression_0=ruleComparisionExpression();

            state._fsp--;


            			current = this_ComparisionExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalQL.g:767:3: ( () ( (lv_operator_2_0= ruleEqualOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleComparisionExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==50) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalQL.g:768:4: () ( (lv_operator_2_0= ruleEqualOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleComparisionExpression ) )
            	    {
            	    // InternalQL.g:768:4: ()
            	    // InternalQL.g:769:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalQL.g:775:4: ( (lv_operator_2_0= ruleEqualOperatorKind ) )
            	    // InternalQL.g:776:5: (lv_operator_2_0= ruleEqualOperatorKind )
            	    {
            	    // InternalQL.g:776:5: (lv_operator_2_0= ruleEqualOperatorKind )
            	    // InternalQL.g:777:6: lv_operator_2_0= ruleEqualOperatorKind
            	    {

            	    						newCompositeNode(grammarAccess.getEqualExpressionAccess().getOperatorEqualOperatorKindEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
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

            	    // InternalQL.g:794:4: ( (lv_rhsOperand_3_0= ruleComparisionExpression ) )
            	    // InternalQL.g:795:5: (lv_rhsOperand_3_0= ruleComparisionExpression )
            	    {
            	    // InternalQL.g:795:5: (lv_rhsOperand_3_0= ruleComparisionExpression )
            	    // InternalQL.g:796:6: lv_rhsOperand_3_0= ruleComparisionExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEqualExpressionAccess().getRhsOperandComparisionExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_19);
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
    // InternalQL.g:818:1: entryRuleComparisionExpression returns [EObject current=null] : iv_ruleComparisionExpression= ruleComparisionExpression EOF ;
    public final EObject entryRuleComparisionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisionExpression = null;


        try {
            // InternalQL.g:818:62: (iv_ruleComparisionExpression= ruleComparisionExpression EOF )
            // InternalQL.g:819:2: iv_ruleComparisionExpression= ruleComparisionExpression EOF
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
    // InternalQL.g:825:1: ruleComparisionExpression returns [EObject current=null] : (this_AdditionExpression_0= ruleAdditionExpression ( () ( (lv_operator_2_0= ruleComparisionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAdditionExpression ) ) )* ) ;
    public final EObject ruleComparisionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditionExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rhsOperand_3_0 = null;



        	enterRule();

        try {
            // InternalQL.g:831:2: ( (this_AdditionExpression_0= ruleAdditionExpression ( () ( (lv_operator_2_0= ruleComparisionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAdditionExpression ) ) )* ) )
            // InternalQL.g:832:2: (this_AdditionExpression_0= ruleAdditionExpression ( () ( (lv_operator_2_0= ruleComparisionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAdditionExpression ) ) )* )
            {
            // InternalQL.g:832:2: (this_AdditionExpression_0= ruleAdditionExpression ( () ( (lv_operator_2_0= ruleComparisionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAdditionExpression ) ) )* )
            // InternalQL.g:833:3: this_AdditionExpression_0= ruleAdditionExpression ( () ( (lv_operator_2_0= ruleComparisionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAdditionExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisionExpressionAccess().getAdditionExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_AdditionExpression_0=ruleAdditionExpression();

            state._fsp--;


            			current = this_AdditionExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalQL.g:841:3: ( () ( (lv_operator_2_0= ruleComparisionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAdditionExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=68 && LA13_0<=71)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalQL.g:842:4: () ( (lv_operator_2_0= ruleComparisionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAdditionExpression ) )
            	    {
            	    // InternalQL.g:842:4: ()
            	    // InternalQL.g:843:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisionExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalQL.g:849:4: ( (lv_operator_2_0= ruleComparisionOperatorKind ) )
            	    // InternalQL.g:850:5: (lv_operator_2_0= ruleComparisionOperatorKind )
            	    {
            	    // InternalQL.g:850:5: (lv_operator_2_0= ruleComparisionOperatorKind )
            	    // InternalQL.g:851:6: lv_operator_2_0= ruleComparisionOperatorKind
            	    {

            	    						newCompositeNode(grammarAccess.getComparisionExpressionAccess().getOperatorComparisionOperatorKindEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
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

            	    // InternalQL.g:868:4: ( (lv_rhsOperand_3_0= ruleAdditionExpression ) )
            	    // InternalQL.g:869:5: (lv_rhsOperand_3_0= ruleAdditionExpression )
            	    {
            	    // InternalQL.g:869:5: (lv_rhsOperand_3_0= ruleAdditionExpression )
            	    // InternalQL.g:870:6: lv_rhsOperand_3_0= ruleAdditionExpression
            	    {

            	    						newCompositeNode(grammarAccess.getComparisionExpressionAccess().getRhsOperandAdditionExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_20);
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
    // InternalQL.g:892:1: entryRuleAdditionExpression returns [EObject current=null] : iv_ruleAdditionExpression= ruleAdditionExpression EOF ;
    public final EObject entryRuleAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionExpression = null;


        try {
            // InternalQL.g:892:59: (iv_ruleAdditionExpression= ruleAdditionExpression EOF )
            // InternalQL.g:893:2: iv_ruleAdditionExpression= ruleAdditionExpression EOF
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
    // InternalQL.g:899:1: ruleAdditionExpression returns [EObject current=null] : (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleMultiplicationExpression ) ) )* ) ;
    public final EObject ruleAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicationExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rhsOperand_3_0 = null;



        	enterRule();

        try {
            // InternalQL.g:905:2: ( (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleMultiplicationExpression ) ) )* ) )
            // InternalQL.g:906:2: (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleMultiplicationExpression ) ) )* )
            {
            // InternalQL.g:906:2: (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleMultiplicationExpression ) ) )* )
            // InternalQL.g:907:3: this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleMultiplicationExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditionExpressionAccess().getMultiplicationExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_MultiplicationExpression_0=ruleMultiplicationExpression();

            state._fsp--;


            			current = this_MultiplicationExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalQL.g:915:3: ( () ( (lv_operator_2_0= ruleAdditionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleMultiplicationExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==44||LA14_0==65) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalQL.g:916:4: () ( (lv_operator_2_0= ruleAdditionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleMultiplicationExpression ) )
            	    {
            	    // InternalQL.g:916:4: ()
            	    // InternalQL.g:917:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditionExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalQL.g:923:4: ( (lv_operator_2_0= ruleAdditionOperatorKind ) )
            	    // InternalQL.g:924:5: (lv_operator_2_0= ruleAdditionOperatorKind )
            	    {
            	    // InternalQL.g:924:5: (lv_operator_2_0= ruleAdditionOperatorKind )
            	    // InternalQL.g:925:6: lv_operator_2_0= ruleAdditionOperatorKind
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionExpressionAccess().getOperatorAdditionOperatorKindEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
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

            	    // InternalQL.g:942:4: ( (lv_rhsOperand_3_0= ruleMultiplicationExpression ) )
            	    // InternalQL.g:943:5: (lv_rhsOperand_3_0= ruleMultiplicationExpression )
            	    {
            	    // InternalQL.g:943:5: (lv_rhsOperand_3_0= ruleMultiplicationExpression )
            	    // InternalQL.g:944:6: lv_rhsOperand_3_0= ruleMultiplicationExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionExpressionAccess().getRhsOperandMultiplicationExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_21);
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
    // InternalQL.g:966:1: entryRuleMultiplicationExpression returns [EObject current=null] : iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF ;
    public final EObject entryRuleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationExpression = null;


        try {
            // InternalQL.g:966:65: (iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF )
            // InternalQL.g:967:2: iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF
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
    // InternalQL.g:973:1: ruleMultiplicationExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_operator_2_0= ruleMultiplicationOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression ) ) )* ) ;
    public final EObject ruleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rhsOperand_3_0 = null;



        	enterRule();

        try {
            // InternalQL.g:979:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_operator_2_0= ruleMultiplicationOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression ) ) )* ) )
            // InternalQL.g:980:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_operator_2_0= ruleMultiplicationOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression ) ) )* )
            {
            // InternalQL.g:980:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_operator_2_0= ruleMultiplicationOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression ) ) )* )
            // InternalQL.g:981:3: this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_operator_2_0= ruleMultiplicationOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getPrimaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;


            			current = this_PrimaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalQL.g:989:3: ( () ( (lv_operator_2_0= ruleMultiplicationOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=66 && LA15_0<=67)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalQL.g:990:4: () ( (lv_operator_2_0= ruleMultiplicationOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression ) )
            	    {
            	    // InternalQL.g:990:4: ()
            	    // InternalQL.g:991:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicationExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalQL.g:997:4: ( (lv_operator_2_0= ruleMultiplicationOperatorKind ) )
            	    // InternalQL.g:998:5: (lv_operator_2_0= ruleMultiplicationOperatorKind )
            	    {
            	    // InternalQL.g:998:5: (lv_operator_2_0= ruleMultiplicationOperatorKind )
            	    // InternalQL.g:999:6: lv_operator_2_0= ruleMultiplicationOperatorKind
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getOperatorMultiplicationOperatorKindEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
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

            	    // InternalQL.g:1016:4: ( (lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression ) )
            	    // InternalQL.g:1017:5: (lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression )
            	    {
            	    // InternalQL.g:1017:5: (lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression )
            	    // InternalQL.g:1018:6: lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getRhsOperandUnaryOrPrimaryExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_22);
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
    // InternalQL.g:1040:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // InternalQL.g:1040:45: (iv_ruleCall= ruleCall EOF )
            // InternalQL.g:1041:2: iv_ruleCall= ruleCall EOF
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
    // InternalQL.g:1047:1: ruleCall returns [EObject current=null] : (this_ConstantCall_0= ruleConstantCall | this_QuestionCall_1= ruleQuestionCall | this_EnumerationCall_2= ruleEnumerationCall ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

        EObject this_ConstantCall_0 = null;

        EObject this_QuestionCall_1 = null;

        EObject this_EnumerationCall_2 = null;



        	enterRule();

        try {
            // InternalQL.g:1053:2: ( (this_ConstantCall_0= ruleConstantCall | this_QuestionCall_1= ruleQuestionCall | this_EnumerationCall_2= ruleEnumerationCall ) )
            // InternalQL.g:1054:2: (this_ConstantCall_0= ruleConstantCall | this_QuestionCall_1= ruleQuestionCall | this_EnumerationCall_2= ruleEnumerationCall )
            {
            // InternalQL.g:1054:2: (this_ConstantCall_0= ruleConstantCall | this_QuestionCall_1= ruleQuestionCall | this_EnumerationCall_2= ruleEnumerationCall )
            int alt16=3;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalQL.g:1055:3: this_ConstantCall_0= ruleConstantCall
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
                    // InternalQL.g:1064:3: this_QuestionCall_1= ruleQuestionCall
                    {

                    			newCompositeNode(grammarAccess.getCallAccess().getQuestionCallParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_QuestionCall_1=ruleQuestionCall();

                    state._fsp--;


                    			current = this_QuestionCall_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalQL.g:1073:3: this_EnumerationCall_2= ruleEnumerationCall
                    {

                    			newCompositeNode(grammarAccess.getCallAccess().getEnumerationCallParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnumerationCall_2=ruleEnumerationCall();

                    state._fsp--;


                    			current = this_EnumerationCall_2;
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
    // InternalQL.g:1085:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalQL.g:1085:46: (iv_ruleValue= ruleValue EOF )
            // InternalQL.g:1086:2: iv_ruleValue= ruleValue EOF
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
    // InternalQL.g:1092:1: ruleValue returns [EObject current=null] : (this_IntegerValue_0= ruleIntegerValue | this_StringValue_1= ruleStringValue | this_BooleanValue_2= ruleBooleanValue | this_DateValue_3= ruleDateValue | this_DecimalValue_4= ruleDecimalValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerValue_0 = null;

        EObject this_StringValue_1 = null;

        EObject this_BooleanValue_2 = null;

        EObject this_DateValue_3 = null;

        EObject this_DecimalValue_4 = null;



        	enterRule();

        try {
            // InternalQL.g:1098:2: ( (this_IntegerValue_0= ruleIntegerValue | this_StringValue_1= ruleStringValue | this_BooleanValue_2= ruleBooleanValue | this_DateValue_3= ruleDateValue | this_DecimalValue_4= ruleDecimalValue ) )
            // InternalQL.g:1099:2: (this_IntegerValue_0= ruleIntegerValue | this_StringValue_1= ruleStringValue | this_BooleanValue_2= ruleBooleanValue | this_DateValue_3= ruleDateValue | this_DecimalValue_4= ruleDecimalValue )
            {
            // InternalQL.g:1099:2: (this_IntegerValue_0= ruleIntegerValue | this_StringValue_1= ruleStringValue | this_BooleanValue_2= ruleBooleanValue | this_DateValue_3= ruleDateValue | this_DecimalValue_4= ruleDecimalValue )
            int alt17=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==41) ) {
                    alt17=5;
                }
                else if ( (LA17_1==EOF||LA17_1==15) ) {
                    alt17=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt17=2;
                }
                break;
            case 24:
            case 25:
                {
                alt17=3;
                }
                break;
            case 39:
                {
                alt17=4;
                }
                break;
            case 41:
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
                    // InternalQL.g:1100:3: this_IntegerValue_0= ruleIntegerValue
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
                    // InternalQL.g:1109:3: this_StringValue_1= ruleStringValue
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
                    // InternalQL.g:1118:3: this_BooleanValue_2= ruleBooleanValue
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
                    // InternalQL.g:1127:3: this_DateValue_3= ruleDateValue
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
                    // InternalQL.g:1136:3: this_DecimalValue_4= ruleDecimalValue
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


    // $ANTLR start "entryRuleDefinitionGroup"
    // InternalQL.g:1148:1: entryRuleDefinitionGroup returns [EObject current=null] : iv_ruleDefinitionGroup= ruleDefinitionGroup EOF ;
    public final EObject entryRuleDefinitionGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionGroup = null;


        try {
            // InternalQL.g:1148:56: (iv_ruleDefinitionGroup= ruleDefinitionGroup EOF )
            // InternalQL.g:1149:2: iv_ruleDefinitionGroup= ruleDefinitionGroup EOF
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
    // InternalQL.g:1155:1: ruleDefinitionGroup returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_questionDefinitions_2_0= ruleQuestionDefinition ) ) | ( (lv_dataTypes_3_0= ruleValueType ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleDefinitionGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_questionDefinitions_2_0 = null;

        EObject lv_dataTypes_3_0 = null;



        	enterRule();

        try {
            // InternalQL.g:1161:2: ( ( () otherlv_1= '{' ( ( (lv_questionDefinitions_2_0= ruleQuestionDefinition ) ) | ( (lv_dataTypes_3_0= ruleValueType ) ) )* otherlv_4= '}' ) )
            // InternalQL.g:1162:2: ( () otherlv_1= '{' ( ( (lv_questionDefinitions_2_0= ruleQuestionDefinition ) ) | ( (lv_dataTypes_3_0= ruleValueType ) ) )* otherlv_4= '}' )
            {
            // InternalQL.g:1162:2: ( () otherlv_1= '{' ( ( (lv_questionDefinitions_2_0= ruleQuestionDefinition ) ) | ( (lv_dataTypes_3_0= ruleValueType ) ) )* otherlv_4= '}' )
            // InternalQL.g:1163:3: () otherlv_1= '{' ( ( (lv_questionDefinitions_2_0= ruleQuestionDefinition ) ) | ( (lv_dataTypes_3_0= ruleValueType ) ) )* otherlv_4= '}'
            {
            // InternalQL.g:1163:3: ()
            // InternalQL.g:1164:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDefinitionGroupAccess().getDefinitionGroupAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getDefinitionGroupAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalQL.g:1174:3: ( ( (lv_questionDefinitions_2_0= ruleQuestionDefinition ) ) | ( (lv_dataTypes_3_0= ruleValueType ) ) )*
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=45 && LA18_0<=46)) ) {
                    alt18=1;
                }
                else if ( (LA18_0==27||(LA18_0>=29 && LA18_0<=30)||(LA18_0>=33 && LA18_0<=35)||LA18_0==38) ) {
                    alt18=2;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalQL.g:1175:4: ( (lv_questionDefinitions_2_0= ruleQuestionDefinition ) )
            	    {
            	    // InternalQL.g:1175:4: ( (lv_questionDefinitions_2_0= ruleQuestionDefinition ) )
            	    // InternalQL.g:1176:5: (lv_questionDefinitions_2_0= ruleQuestionDefinition )
            	    {
            	    // InternalQL.g:1176:5: (lv_questionDefinitions_2_0= ruleQuestionDefinition )
            	    // InternalQL.g:1177:6: lv_questionDefinitions_2_0= ruleQuestionDefinition
            	    {

            	    						newCompositeNode(grammarAccess.getDefinitionGroupAccess().getQuestionDefinitionsQuestionDefinitionParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_questionDefinitions_2_0=ruleQuestionDefinition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDefinitionGroupRule());
            	    						}
            	    						add(
            	    							current,
            	    							"questionDefinitions",
            	    							lv_questionDefinitions_2_0,
            	    							"org.gemoc.ql.QL.QuestionDefinition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalQL.g:1195:4: ( (lv_dataTypes_3_0= ruleValueType ) )
            	    {
            	    // InternalQL.g:1195:4: ( (lv_dataTypes_3_0= ruleValueType ) )
            	    // InternalQL.g:1196:5: (lv_dataTypes_3_0= ruleValueType )
            	    {
            	    // InternalQL.g:1196:5: (lv_dataTypes_3_0= ruleValueType )
            	    // InternalQL.g:1197:6: lv_dataTypes_3_0= ruleValueType
            	    {

            	    						newCompositeNode(grammarAccess.getDefinitionGroupAccess().getDataTypesValueTypeParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_dataTypes_3_0=ruleValueType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDefinitionGroupRule());
            	    						}
            	    						add(
            	    							current,
            	    							"dataTypes",
            	    							lv_dataTypes_3_0,
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

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDefinitionGroupAccess().getRightCurlyBracketKeyword_3());
            		

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


    // $ANTLR start "entryRuleEBoolean"
    // InternalQL.g:1223:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalQL.g:1223:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalQL.g:1224:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalQL.g:1230:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalQL.g:1236:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalQL.g:1237:2: (kw= 'true' | kw= 'false' )
            {
            // InternalQL.g:1237:2: (kw= 'true' | kw= 'false' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            else if ( (LA19_0==25) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalQL.g:1238:3: kw= 'true'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalQL.g:1244:3: kw= 'false'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEDate"
    // InternalQL.g:1253:1: entryRuleEDate returns [String current=null] : iv_ruleEDate= ruleEDate EOF ;
    public final String entryRuleEDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDate = null;


        try {
            // InternalQL.g:1253:45: (iv_ruleEDate= ruleEDate EOF )
            // InternalQL.g:1254:2: iv_ruleEDate= ruleEDate EOF
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
    // InternalQL.g:1260:1: ruleEDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'EDate' ;
    public final AntlrDatatypeRuleToken ruleEDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalQL.g:1266:2: (kw= 'EDate' )
            // InternalQL.g:1267:2: kw= 'EDate'
            {
            kw=(Token)match(input,26,FOLLOW_2); 

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
    // InternalQL.g:1275:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalQL.g:1275:47: (iv_ruleEString= ruleEString EOF )
            // InternalQL.g:1276:2: iv_ruleEString= ruleEString EOF
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
    // InternalQL.g:1282:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalQL.g:1288:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalQL.g:1289:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalQL.g:1289:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_ID) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalQL.g:1290:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalQL.g:1298:3: this_ID_1= RULE_ID
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
    // InternalQL.g:1309:1: entryRuleQuestionGroup returns [EObject current=null] : iv_ruleQuestionGroup= ruleQuestionGroup EOF ;
    public final EObject entryRuleQuestionGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionGroup = null;


        try {
            // InternalQL.g:1309:54: (iv_ruleQuestionGroup= ruleQuestionGroup EOF )
            // InternalQL.g:1310:2: iv_ruleQuestionGroup= ruleQuestionGroup EOF
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
    // InternalQL.g:1316:1: ruleQuestionGroup returns [EObject current=null] : ( () (otherlv_1= 'if' ( (lv_guard_2_0= ruleExpression ) ) )? otherlv_3= '{' ( ( (lv_questionGroups_4_0= ruleQuestionGroup ) ) | ( (lv_questions_5_0= ruleQuestion ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleQuestionGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_guard_2_0 = null;

        EObject lv_questionGroups_4_0 = null;

        EObject lv_questions_5_0 = null;



        	enterRule();

        try {
            // InternalQL.g:1322:2: ( ( () (otherlv_1= 'if' ( (lv_guard_2_0= ruleExpression ) ) )? otherlv_3= '{' ( ( (lv_questionGroups_4_0= ruleQuestionGroup ) ) | ( (lv_questions_5_0= ruleQuestion ) ) )* otherlv_6= '}' ) )
            // InternalQL.g:1323:2: ( () (otherlv_1= 'if' ( (lv_guard_2_0= ruleExpression ) ) )? otherlv_3= '{' ( ( (lv_questionGroups_4_0= ruleQuestionGroup ) ) | ( (lv_questions_5_0= ruleQuestion ) ) )* otherlv_6= '}' )
            {
            // InternalQL.g:1323:2: ( () (otherlv_1= 'if' ( (lv_guard_2_0= ruleExpression ) ) )? otherlv_3= '{' ( ( (lv_questionGroups_4_0= ruleQuestionGroup ) ) | ( (lv_questions_5_0= ruleQuestion ) ) )* otherlv_6= '}' )
            // InternalQL.g:1324:3: () (otherlv_1= 'if' ( (lv_guard_2_0= ruleExpression ) ) )? otherlv_3= '{' ( ( (lv_questionGroups_4_0= ruleQuestionGroup ) ) | ( (lv_questions_5_0= ruleQuestion ) ) )* otherlv_6= '}'
            {
            // InternalQL.g:1324:3: ()
            // InternalQL.g:1325:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQuestionGroupAccess().getQuestionGroupAction_0(),
            					current);
            			

            }

            // InternalQL.g:1331:3: (otherlv_1= 'if' ( (lv_guard_2_0= ruleExpression ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==20) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalQL.g:1332:4: otherlv_1= 'if' ( (lv_guard_2_0= ruleExpression ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getQuestionGroupAccess().getIfKeyword_1_0());
                    			
                    // InternalQL.g:1336:4: ( (lv_guard_2_0= ruleExpression ) )
                    // InternalQL.g:1337:5: (lv_guard_2_0= ruleExpression )
                    {
                    // InternalQL.g:1337:5: (lv_guard_2_0= ruleExpression )
                    // InternalQL.g:1338:6: lv_guard_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getQuestionGroupAccess().getGuardExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_guard_2_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuestionGroupRule());
                    						}
                    						set(
                    							current,
                    							"guard",
                    							lv_guard_2_0,
                    							"org.gemoc.ql.QL.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,16,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getQuestionGroupAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQL.g:1360:3: ( ( (lv_questionGroups_4_0= ruleQuestionGroup ) ) | ( (lv_questions_5_0= ruleQuestion ) ) )*
            loop22:
            do {
                int alt22=3;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==16||LA22_0==20) ) {
                    alt22=1;
                }
                else if ( (LA22_0==RULE_ID) ) {
                    alt22=2;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalQL.g:1361:4: ( (lv_questionGroups_4_0= ruleQuestionGroup ) )
            	    {
            	    // InternalQL.g:1361:4: ( (lv_questionGroups_4_0= ruleQuestionGroup ) )
            	    // InternalQL.g:1362:5: (lv_questionGroups_4_0= ruleQuestionGroup )
            	    {
            	    // InternalQL.g:1362:5: (lv_questionGroups_4_0= ruleQuestionGroup )
            	    // InternalQL.g:1363:6: lv_questionGroups_4_0= ruleQuestionGroup
            	    {

            	    						newCompositeNode(grammarAccess.getQuestionGroupAccess().getQuestionGroupsQuestionGroupParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_questionGroups_4_0=ruleQuestionGroup();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getQuestionGroupRule());
            	    						}
            	    						add(
            	    							current,
            	    							"questionGroups",
            	    							lv_questionGroups_4_0,
            	    							"org.gemoc.ql.QL.QuestionGroup");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalQL.g:1381:4: ( (lv_questions_5_0= ruleQuestion ) )
            	    {
            	    // InternalQL.g:1381:4: ( (lv_questions_5_0= ruleQuestion ) )
            	    // InternalQL.g:1382:5: (lv_questions_5_0= ruleQuestion )
            	    {
            	    // InternalQL.g:1382:5: (lv_questions_5_0= ruleQuestion )
            	    // InternalQL.g:1383:6: lv_questions_5_0= ruleQuestion
            	    {

            	    						newCompositeNode(grammarAccess.getQuestionGroupAccess().getQuestionsQuestionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_questions_5_0=ruleQuestion();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getQuestionGroupRule());
            	    						}
            	    						add(
            	    							current,
            	    							"questions",
            	    							lv_questions_5_0,
            	    							"org.gemoc.ql.QL.Question");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getQuestionGroupAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalQL.g:1409:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // InternalQL.g:1409:49: (iv_ruleQuestion= ruleQuestion EOF )
            // InternalQL.g:1410:2: iv_ruleQuestion= ruleQuestion EOF
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
    // InternalQL.g:1416:1: ruleQuestion returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalQL.g:1422:2: ( ( ( ruleQualifiedName ) ) )
            // InternalQL.g:1423:2: ( ( ruleQualifiedName ) )
            {
            // InternalQL.g:1423:2: ( ( ruleQualifiedName ) )
            // InternalQL.g:1424:3: ( ruleQualifiedName )
            {
            // InternalQL.g:1424:3: ( ruleQualifiedName )
            // InternalQL.g:1425:4: ruleQualifiedName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getQuestionRule());
            				}
            			

            				newCompositeNode(grammarAccess.getQuestionAccess().getQuestionDefinitionQuestionDefinitionCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

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
    // InternalQL.g:1442:1: entryRuleValueType_Impl returns [EObject current=null] : iv_ruleValueType_Impl= ruleValueType_Impl EOF ;
    public final EObject entryRuleValueType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueType_Impl = null;


        try {
            // InternalQL.g:1442:55: (iv_ruleValueType_Impl= ruleValueType_Impl EOF )
            // InternalQL.g:1443:2: iv_ruleValueType_Impl= ruleValueType_Impl EOF
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
    // InternalQL.g:1449:1: ruleValueType_Impl returns [EObject current=null] : ( () otherlv_1= 'ValueType' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleValueType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_unit_5_0 = null;



        	enterRule();

        try {
            // InternalQL.g:1455:2: ( ( () otherlv_1= 'ValueType' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalQL.g:1456:2: ( () otherlv_1= 'ValueType' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalQL.g:1456:2: ( () otherlv_1= 'ValueType' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalQL.g:1457:3: () otherlv_1= 'ValueType' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalQL.g:1457:3: ()
            // InternalQL.g:1458:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getValueType_ImplAccess().getValueTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getValueType_ImplAccess().getValueTypeKeyword_1());
            		
            // InternalQL.g:1468:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalQL.g:1469:4: (lv_name_2_0= RULE_ID )
            {
            // InternalQL.g:1469:4: (lv_name_2_0= RULE_ID )
            // InternalQL.g:1470:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_2_0, grammarAccess.getValueType_ImplAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValueType_ImplRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getValueType_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQL.g:1490:3: (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalQL.g:1491:4: otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getValueType_ImplAccess().getUnitKeyword_4_0());
                    			
                    // InternalQL.g:1495:4: ( (lv_unit_5_0= ruleEString ) )
                    // InternalQL.g:1496:5: (lv_unit_5_0= ruleEString )
                    {
                    // InternalQL.g:1496:5: (lv_unit_5_0= ruleEString )
                    // InternalQL.g:1497:6: lv_unit_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getValueType_ImplAccess().getUnitEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_27);
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

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

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
    // InternalQL.g:1523:1: entryRuleConstantCall returns [EObject current=null] : iv_ruleConstantCall= ruleConstantCall EOF ;
    public final EObject entryRuleConstantCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantCall = null;


        try {
            // InternalQL.g:1523:53: (iv_ruleConstantCall= ruleConstantCall EOF )
            // InternalQL.g:1524:2: iv_ruleConstantCall= ruleConstantCall EOF
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
    // InternalQL.g:1530:1: ruleConstantCall returns [EObject current=null] : ( () ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleIntegerValue | lv_value_1_3= ruleBooleanValue | lv_value_1_4= ruleDecimalValue ) ) ) ) ;
    public final EObject ruleConstantCall() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_1 = null;

        EObject lv_value_1_2 = null;

        EObject lv_value_1_3 = null;

        EObject lv_value_1_4 = null;



        	enterRule();

        try {
            // InternalQL.g:1536:2: ( ( () ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleIntegerValue | lv_value_1_3= ruleBooleanValue | lv_value_1_4= ruleDecimalValue ) ) ) ) )
            // InternalQL.g:1537:2: ( () ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleIntegerValue | lv_value_1_3= ruleBooleanValue | lv_value_1_4= ruleDecimalValue ) ) ) )
            {
            // InternalQL.g:1537:2: ( () ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleIntegerValue | lv_value_1_3= ruleBooleanValue | lv_value_1_4= ruleDecimalValue ) ) ) )
            // InternalQL.g:1538:3: () ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleIntegerValue | lv_value_1_3= ruleBooleanValue | lv_value_1_4= ruleDecimalValue ) ) )
            {
            // InternalQL.g:1538:3: ()
            // InternalQL.g:1539:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConstantCallAccess().getConstantCallAction_0(),
            					current);
            			

            }

            // InternalQL.g:1545:3: ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleIntegerValue | lv_value_1_3= ruleBooleanValue | lv_value_1_4= ruleDecimalValue ) ) )
            // InternalQL.g:1546:4: ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleIntegerValue | lv_value_1_3= ruleBooleanValue | lv_value_1_4= ruleDecimalValue ) )
            {
            // InternalQL.g:1546:4: ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleIntegerValue | lv_value_1_3= ruleBooleanValue | lv_value_1_4= ruleDecimalValue ) )
            // InternalQL.g:1547:5: (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleIntegerValue | lv_value_1_3= ruleBooleanValue | lv_value_1_4= ruleDecimalValue )
            {
            // InternalQL.g:1547:5: (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleIntegerValue | lv_value_1_3= ruleBooleanValue | lv_value_1_4= ruleDecimalValue )
            int alt24=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt24=1;
                }
                break;
            case RULE_INT:
                {
                int LA24_2 = input.LA(2);

                if ( (LA24_2==41) ) {
                    alt24=4;
                }
                else if ( (LA24_2==EOF||(LA24_2>=15 && LA24_2<=16)||(LA24_2>=21 && LA24_2<=23)||LA24_2==44||(LA24_2>=50 && LA24_2<=51)||(LA24_2>=65 && LA24_2<=73)) ) {
                    alt24=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 2, input);

                    throw nvae;
                }
                }
                break;
            case 24:
            case 25:
                {
                alt24=3;
                }
                break;
            case 41:
                {
                alt24=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalQL.g:1548:6: lv_value_1_1= ruleStringValue
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
                    // InternalQL.g:1564:6: lv_value_1_2= ruleIntegerValue
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
                    // InternalQL.g:1580:6: lv_value_1_3= ruleBooleanValue
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
                    // InternalQL.g:1596:6: lv_value_1_4= ruleDecimalValue
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
    // InternalQL.g:1618:1: entryRuleQuestionCall returns [EObject current=null] : iv_ruleQuestionCall= ruleQuestionCall EOF ;
    public final EObject entryRuleQuestionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionCall = null;


        try {
            // InternalQL.g:1618:53: (iv_ruleQuestionCall= ruleQuestionCall EOF )
            // InternalQL.g:1619:2: iv_ruleQuestionCall= ruleQuestionCall EOF
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
    // InternalQL.g:1625:1: ruleQuestionCall returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) otherlv_2= '(' otherlv_3= ')' ) ;
    public final EObject ruleQuestionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalQL.g:1631:2: ( ( () ( ( ruleQualifiedName ) ) otherlv_2= '(' otherlv_3= ')' ) )
            // InternalQL.g:1632:2: ( () ( ( ruleQualifiedName ) ) otherlv_2= '(' otherlv_3= ')' )
            {
            // InternalQL.g:1632:2: ( () ( ( ruleQualifiedName ) ) otherlv_2= '(' otherlv_3= ')' )
            // InternalQL.g:1633:3: () ( ( ruleQualifiedName ) ) otherlv_2= '(' otherlv_3= ')'
            {
            // InternalQL.g:1633:3: ()
            // InternalQL.g:1634:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQuestionCallAccess().getQuestionCallAction_0(),
            					current);
            			

            }

            // InternalQL.g:1640:3: ( ( ruleQualifiedName ) )
            // InternalQL.g:1641:4: ( ruleQualifiedName )
            {
            // InternalQL.g:1641:4: ( ruleQualifiedName )
            // InternalQL.g:1642:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuestionCallRule());
            					}
            				

            					newCompositeNode(grammarAccess.getQuestionCallAccess().getQuestionQuestionDefinitionCrossReference_1_0());
            				
            pushFollow(FOLLOW_28);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getQuestionCallAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getQuestionCallAccess().getRightParenthesisKeyword_3());
            		

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
    // InternalQL.g:1668:1: entryRuleBooleanValueType returns [EObject current=null] : iv_ruleBooleanValueType= ruleBooleanValueType EOF ;
    public final EObject entryRuleBooleanValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValueType = null;


        try {
            // InternalQL.g:1668:57: (iv_ruleBooleanValueType= ruleBooleanValueType EOF )
            // InternalQL.g:1669:2: iv_ruleBooleanValueType= ruleBooleanValueType EOF
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
    // InternalQL.g:1675:1: ruleBooleanValueType returns [EObject current=null] : ( () otherlv_1= 'booleanType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? ) ;
    public final EObject ruleBooleanValueType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_unit_5_0 = null;



        	enterRule();

        try {
            // InternalQL.g:1681:2: ( ( () otherlv_1= 'booleanType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? ) )
            // InternalQL.g:1682:2: ( () otherlv_1= 'booleanType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? )
            {
            // InternalQL.g:1682:2: ( () otherlv_1= 'booleanType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? )
            // InternalQL.g:1683:3: () otherlv_1= 'booleanType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )?
            {
            // InternalQL.g:1683:3: ()
            // InternalQL.g:1684:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanValueTypeAccess().getBooleanValueTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBooleanValueTypeAccess().getBooleanTypeKeyword_1());
            		
            // InternalQL.g:1694:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalQL.g:1695:4: (lv_name_2_0= RULE_ID )
            {
            // InternalQL.g:1695:4: (lv_name_2_0= RULE_ID )
            // InternalQL.g:1696:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(lv_name_2_0, grammarAccess.getBooleanValueTypeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBooleanValueTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalQL.g:1712:3: (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==16) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalQL.g:1713:4: otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_25); 

                    				newLeafNode(otherlv_3, grammarAccess.getBooleanValueTypeAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalQL.g:1717:4: (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==28) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalQL.g:1718:5: otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) )
                            {
                            otherlv_4=(Token)match(input,28,FOLLOW_26); 

                            					newLeafNode(otherlv_4, grammarAccess.getBooleanValueTypeAccess().getUnitKeyword_3_1_0());
                            				
                            // InternalQL.g:1722:5: ( (lv_unit_5_0= ruleEString ) )
                            // InternalQL.g:1723:6: (lv_unit_5_0= ruleEString )
                            {
                            // InternalQL.g:1723:6: (lv_unit_5_0= ruleEString )
                            // InternalQL.g:1724:7: lv_unit_5_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getBooleanValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0());
                            						
                            pushFollow(FOLLOW_27);
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

                    otherlv_6=(Token)match(input,19,FOLLOW_2); 

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
    // InternalQL.g:1751:1: entryRuleIntegerValueType returns [EObject current=null] : iv_ruleIntegerValueType= ruleIntegerValueType EOF ;
    public final EObject entryRuleIntegerValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValueType = null;


        try {
            // InternalQL.g:1751:57: (iv_ruleIntegerValueType= ruleIntegerValueType EOF )
            // InternalQL.g:1752:2: iv_ruleIntegerValueType= ruleIntegerValueType EOF
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
    // InternalQL.g:1758:1: ruleIntegerValueType returns [EObject current=null] : ( () otherlv_1= 'integerType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )? (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )? otherlv_10= '}' )? ) ;
    public final EObject ruleIntegerValueType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_unit_5_0 = null;

        AntlrDatatypeRuleToken lv_min_7_0 = null;

        AntlrDatatypeRuleToken lv_max_9_0 = null;



        	enterRule();

        try {
            // InternalQL.g:1764:2: ( ( () otherlv_1= 'integerType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )? (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )? otherlv_10= '}' )? ) )
            // InternalQL.g:1765:2: ( () otherlv_1= 'integerType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )? (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )? otherlv_10= '}' )? )
            {
            // InternalQL.g:1765:2: ( () otherlv_1= 'integerType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )? (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )? otherlv_10= '}' )? )
            // InternalQL.g:1766:3: () otherlv_1= 'integerType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )? (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )? otherlv_10= '}' )?
            {
            // InternalQL.g:1766:3: ()
            // InternalQL.g:1767:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerValueTypeAccess().getIntegerValueTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getIntegerValueTypeAccess().getIntegerTypeKeyword_1());
            		
            // InternalQL.g:1777:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalQL.g:1778:4: (lv_name_2_0= RULE_ID )
            {
            // InternalQL.g:1778:4: (lv_name_2_0= RULE_ID )
            // InternalQL.g:1779:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(lv_name_2_0, grammarAccess.getIntegerValueTypeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntegerValueTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalQL.g:1795:3: (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )? (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )? otherlv_10= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==16) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalQL.g:1796:4: otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )? (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )? otherlv_10= '}'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_30); 

                    				newLeafNode(otherlv_3, grammarAccess.getIntegerValueTypeAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalQL.g:1800:4: (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==28) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalQL.g:1801:5: otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) )
                            {
                            otherlv_4=(Token)match(input,28,FOLLOW_26); 

                            					newLeafNode(otherlv_4, grammarAccess.getIntegerValueTypeAccess().getUnitKeyword_3_1_0());
                            				
                            // InternalQL.g:1805:5: ( (lv_unit_5_0= ruleEString ) )
                            // InternalQL.g:1806:6: (lv_unit_5_0= ruleEString )
                            {
                            // InternalQL.g:1806:6: (lv_unit_5_0= ruleEString )
                            // InternalQL.g:1807:7: lv_unit_5_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getIntegerValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0());
                            						
                            pushFollow(FOLLOW_31);
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

                    // InternalQL.g:1825:4: (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==31) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalQL.g:1826:5: otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) )
                            {
                            otherlv_6=(Token)match(input,31,FOLLOW_32); 

                            					newLeafNode(otherlv_6, grammarAccess.getIntegerValueTypeAccess().getMinKeyword_3_2_0());
                            				
                            // InternalQL.g:1830:5: ( (lv_min_7_0= ruleEInt ) )
                            // InternalQL.g:1831:6: (lv_min_7_0= ruleEInt )
                            {
                            // InternalQL.g:1831:6: (lv_min_7_0= ruleEInt )
                            // InternalQL.g:1832:7: lv_min_7_0= ruleEInt
                            {

                            							newCompositeNode(grammarAccess.getIntegerValueTypeAccess().getMinEIntParserRuleCall_3_2_1_0());
                            						
                            pushFollow(FOLLOW_33);
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

                    // InternalQL.g:1850:4: (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==32) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalQL.g:1851:5: otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) )
                            {
                            otherlv_8=(Token)match(input,32,FOLLOW_32); 

                            					newLeafNode(otherlv_8, grammarAccess.getIntegerValueTypeAccess().getMaxKeyword_3_3_0());
                            				
                            // InternalQL.g:1855:5: ( (lv_max_9_0= ruleEInt ) )
                            // InternalQL.g:1856:6: (lv_max_9_0= ruleEInt )
                            {
                            // InternalQL.g:1856:6: (lv_max_9_0= ruleEInt )
                            // InternalQL.g:1857:7: lv_max_9_0= ruleEInt
                            {

                            							newCompositeNode(grammarAccess.getIntegerValueTypeAccess().getMaxEIntParserRuleCall_3_3_1_0());
                            						
                            pushFollow(FOLLOW_27);
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

                    otherlv_10=(Token)match(input,19,FOLLOW_2); 

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
    // InternalQL.g:1884:1: entryRuleDecimalValueType returns [EObject current=null] : iv_ruleDecimalValueType= ruleDecimalValueType EOF ;
    public final EObject entryRuleDecimalValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalValueType = null;


        try {
            // InternalQL.g:1884:57: (iv_ruleDecimalValueType= ruleDecimalValueType EOF )
            // InternalQL.g:1885:2: iv_ruleDecimalValueType= ruleDecimalValueType EOF
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
    // InternalQL.g:1891:1: ruleDecimalValueType returns [EObject current=null] : ( () otherlv_1= 'decimalType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? ) ;
    public final EObject ruleDecimalValueType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_unit_5_0 = null;



        	enterRule();

        try {
            // InternalQL.g:1897:2: ( ( () otherlv_1= 'decimalType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? ) )
            // InternalQL.g:1898:2: ( () otherlv_1= 'decimalType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? )
            {
            // InternalQL.g:1898:2: ( () otherlv_1= 'decimalType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? )
            // InternalQL.g:1899:3: () otherlv_1= 'decimalType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )?
            {
            // InternalQL.g:1899:3: ()
            // InternalQL.g:1900:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDecimalValueTypeAccess().getDecimalValueTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDecimalValueTypeAccess().getDecimalTypeKeyword_1());
            		
            // InternalQL.g:1910:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalQL.g:1911:4: (lv_name_2_0= RULE_ID )
            {
            // InternalQL.g:1911:4: (lv_name_2_0= RULE_ID )
            // InternalQL.g:1912:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDecimalValueTypeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDecimalValueTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalQL.g:1928:3: (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==16) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalQL.g:1929:4: otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_25); 

                    				newLeafNode(otherlv_3, grammarAccess.getDecimalValueTypeAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalQL.g:1933:4: (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==28) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalQL.g:1934:5: otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) )
                            {
                            otherlv_4=(Token)match(input,28,FOLLOW_26); 

                            					newLeafNode(otherlv_4, grammarAccess.getDecimalValueTypeAccess().getUnitKeyword_3_1_0());
                            				
                            // InternalQL.g:1938:5: ( (lv_unit_5_0= ruleEString ) )
                            // InternalQL.g:1939:6: (lv_unit_5_0= ruleEString )
                            {
                            // InternalQL.g:1939:6: (lv_unit_5_0= ruleEString )
                            // InternalQL.g:1940:7: lv_unit_5_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getDecimalValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0());
                            						
                            pushFollow(FOLLOW_27);
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

                    otherlv_6=(Token)match(input,19,FOLLOW_2); 

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
    // InternalQL.g:1967:1: entryRuleDateValueType returns [EObject current=null] : iv_ruleDateValueType= ruleDateValueType EOF ;
    public final EObject entryRuleDateValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateValueType = null;


        try {
            // InternalQL.g:1967:54: (iv_ruleDateValueType= ruleDateValueType EOF )
            // InternalQL.g:1968:2: iv_ruleDateValueType= ruleDateValueType EOF
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
    // InternalQL.g:1974:1: ruleDateValueType returns [EObject current=null] : ( () otherlv_1= 'dateType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? ) ;
    public final EObject ruleDateValueType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_unit_5_0 = null;



        	enterRule();

        try {
            // InternalQL.g:1980:2: ( ( () otherlv_1= 'dateType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? ) )
            // InternalQL.g:1981:2: ( () otherlv_1= 'dateType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? )
            {
            // InternalQL.g:1981:2: ( () otherlv_1= 'dateType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? )
            // InternalQL.g:1982:3: () otherlv_1= 'dateType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )?
            {
            // InternalQL.g:1982:3: ()
            // InternalQL.g:1983:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDateValueTypeAccess().getDateValueTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDateValueTypeAccess().getDateTypeKeyword_1());
            		
            // InternalQL.g:1993:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalQL.g:1994:4: (lv_name_2_0= RULE_ID )
            {
            // InternalQL.g:1994:4: (lv_name_2_0= RULE_ID )
            // InternalQL.g:1995:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDateValueTypeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDateValueTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalQL.g:2011:3: (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==16) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalQL.g:2012:4: otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_25); 

                    				newLeafNode(otherlv_3, grammarAccess.getDateValueTypeAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalQL.g:2016:4: (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==28) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalQL.g:2017:5: otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) )
                            {
                            otherlv_4=(Token)match(input,28,FOLLOW_26); 

                            					newLeafNode(otherlv_4, grammarAccess.getDateValueTypeAccess().getUnitKeyword_3_1_0());
                            				
                            // InternalQL.g:2021:5: ( (lv_unit_5_0= ruleEString ) )
                            // InternalQL.g:2022:6: (lv_unit_5_0= ruleEString )
                            {
                            // InternalQL.g:2022:6: (lv_unit_5_0= ruleEString )
                            // InternalQL.g:2023:7: lv_unit_5_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getDateValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0());
                            						
                            pushFollow(FOLLOW_27);
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

                    otherlv_6=(Token)match(input,19,FOLLOW_2); 

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
    // InternalQL.g:2050:1: entryRuleEnumerationValueType returns [EObject current=null] : iv_ruleEnumerationValueType= ruleEnumerationValueType EOF ;
    public final EObject entryRuleEnumerationValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationValueType = null;


        try {
            // InternalQL.g:2050:61: (iv_ruleEnumerationValueType= ruleEnumerationValueType EOF )
            // InternalQL.g:2051:2: iv_ruleEnumerationValueType= ruleEnumerationValueType EOF
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
    // InternalQL.g:2057:1: ruleEnumerationValueType returns [EObject current=null] : ( () otherlv_1= 'enumerationType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )? otherlv_12= '}' )? ) ;
    public final EObject ruleEnumerationValueType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_unit_5_0 = null;

        EObject lv_enumerationLiterals_8_0 = null;

        EObject lv_enumerationLiterals_10_0 = null;



        	enterRule();

        try {
            // InternalQL.g:2063:2: ( ( () otherlv_1= 'enumerationType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )? otherlv_12= '}' )? ) )
            // InternalQL.g:2064:2: ( () otherlv_1= 'enumerationType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )? otherlv_12= '}' )? )
            {
            // InternalQL.g:2064:2: ( () otherlv_1= 'enumerationType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )? otherlv_12= '}' )? )
            // InternalQL.g:2065:3: () otherlv_1= 'enumerationType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )? otherlv_12= '}' )?
            {
            // InternalQL.g:2065:3: ()
            // InternalQL.g:2066:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnumerationValueTypeAccess().getEnumerationValueTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumerationValueTypeAccess().getEnumerationTypeKeyword_1());
            		
            // InternalQL.g:2076:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalQL.g:2077:4: (lv_name_2_0= RULE_ID )
            {
            // InternalQL.g:2077:4: (lv_name_2_0= RULE_ID )
            // InternalQL.g:2078:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(lv_name_2_0, grammarAccess.getEnumerationValueTypeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumerationValueTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalQL.g:2094:3: (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )? otherlv_12= '}' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==16) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalQL.g:2095:4: otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )? otherlv_12= '}'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_34); 

                    				newLeafNode(otherlv_3, grammarAccess.getEnumerationValueTypeAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalQL.g:2099:4: (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==28) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalQL.g:2100:5: otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) )
                            {
                            otherlv_4=(Token)match(input,28,FOLLOW_26); 

                            					newLeafNode(otherlv_4, grammarAccess.getEnumerationValueTypeAccess().getUnitKeyword_3_1_0());
                            				
                            // InternalQL.g:2104:5: ( (lv_unit_5_0= ruleEString ) )
                            // InternalQL.g:2105:6: (lv_unit_5_0= ruleEString )
                            {
                            // InternalQL.g:2105:6: (lv_unit_5_0= ruleEString )
                            // InternalQL.g:2106:7: lv_unit_5_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getEnumerationValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0());
                            						
                            pushFollow(FOLLOW_35);
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

                    // InternalQL.g:2124:4: (otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==36) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalQL.g:2125:5: otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}'
                            {
                            otherlv_6=(Token)match(input,36,FOLLOW_9); 

                            					newLeafNode(otherlv_6, grammarAccess.getEnumerationValueTypeAccess().getLiteralsKeyword_3_2_0());
                            				
                            otherlv_7=(Token)match(input,16,FOLLOW_3); 

                            					newLeafNode(otherlv_7, grammarAccess.getEnumerationValueTypeAccess().getLeftCurlyBracketKeyword_3_2_1());
                            				
                            // InternalQL.g:2133:5: ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) )
                            // InternalQL.g:2134:6: (lv_enumerationLiterals_8_0= ruleEnumerationLiteral )
                            {
                            // InternalQL.g:2134:6: (lv_enumerationLiterals_8_0= ruleEnumerationLiteral )
                            // InternalQL.g:2135:7: lv_enumerationLiterals_8_0= ruleEnumerationLiteral
                            {

                            							newCompositeNode(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_3_2_2_0());
                            						
                            pushFollow(FOLLOW_36);
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

                            // InternalQL.g:2152:5: (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )*
                            loop36:
                            do {
                                int alt36=2;
                                int LA36_0 = input.LA(1);

                                if ( (LA36_0==37) ) {
                                    alt36=1;
                                }


                                switch (alt36) {
                            	case 1 :
                            	    // InternalQL.g:2153:6: otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) )
                            	    {
                            	    otherlv_9=(Token)match(input,37,FOLLOW_3); 

                            	    						newLeafNode(otherlv_9, grammarAccess.getEnumerationValueTypeAccess().getCommaKeyword_3_2_3_0());
                            	    					
                            	    // InternalQL.g:2157:6: ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) )
                            	    // InternalQL.g:2158:7: (lv_enumerationLiterals_10_0= ruleEnumerationLiteral )
                            	    {
                            	    // InternalQL.g:2158:7: (lv_enumerationLiterals_10_0= ruleEnumerationLiteral )
                            	    // InternalQL.g:2159:8: lv_enumerationLiterals_10_0= ruleEnumerationLiteral
                            	    {

                            	    								newCompositeNode(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_3_2_3_1_0());
                            	    							
                            	    pushFollow(FOLLOW_36);
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
                            	    break loop36;
                                }
                            } while (true);

                            otherlv_11=(Token)match(input,19,FOLLOW_27); 

                            					newLeafNode(otherlv_11, grammarAccess.getEnumerationValueTypeAccess().getRightCurlyBracketKeyword_3_2_4());
                            				

                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,19,FOLLOW_2); 

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
    // InternalQL.g:2191:1: entryRuleStringValueType returns [EObject current=null] : iv_ruleStringValueType= ruleStringValueType EOF ;
    public final EObject entryRuleStringValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValueType = null;


        try {
            // InternalQL.g:2191:56: (iv_ruleStringValueType= ruleStringValueType EOF )
            // InternalQL.g:2192:2: iv_ruleStringValueType= ruleStringValueType EOF
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
    // InternalQL.g:2198:1: ruleStringValueType returns [EObject current=null] : ( () otherlv_1= 'StringType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? ) ;
    public final EObject ruleStringValueType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_unit_5_0 = null;



        	enterRule();

        try {
            // InternalQL.g:2204:2: ( ( () otherlv_1= 'StringType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? ) )
            // InternalQL.g:2205:2: ( () otherlv_1= 'StringType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? )
            {
            // InternalQL.g:2205:2: ( () otherlv_1= 'StringType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? )
            // InternalQL.g:2206:3: () otherlv_1= 'StringType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )?
            {
            // InternalQL.g:2206:3: ()
            // InternalQL.g:2207:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringValueTypeAccess().getStringValueTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStringValueTypeAccess().getStringTypeKeyword_1());
            		
            // InternalQL.g:2217:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalQL.g:2218:4: (lv_name_2_0= RULE_ID )
            {
            // InternalQL.g:2218:4: (lv_name_2_0= RULE_ID )
            // InternalQL.g:2219:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(lv_name_2_0, grammarAccess.getStringValueTypeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringValueTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalQL.g:2235:3: (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==16) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalQL.g:2236:4: otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_25); 

                    				newLeafNode(otherlv_3, grammarAccess.getStringValueTypeAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalQL.g:2240:4: (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==28) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalQL.g:2241:5: otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) )
                            {
                            otherlv_4=(Token)match(input,28,FOLLOW_26); 

                            					newLeafNode(otherlv_4, grammarAccess.getStringValueTypeAccess().getUnitKeyword_3_1_0());
                            				
                            // InternalQL.g:2245:5: ( (lv_unit_5_0= ruleEString ) )
                            // InternalQL.g:2246:6: (lv_unit_5_0= ruleEString )
                            {
                            // InternalQL.g:2246:6: (lv_unit_5_0= ruleEString )
                            // InternalQL.g:2247:7: lv_unit_5_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getStringValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0());
                            						
                            pushFollow(FOLLOW_27);
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

                    otherlv_6=(Token)match(input,19,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEnumerationLiteral"
    // InternalQL.g:2274:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteral = null;


        try {
            // InternalQL.g:2274:59: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // InternalQL.g:2275:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
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
    // InternalQL.g:2281:1: ruleEnumerationLiteral returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalQL.g:2287:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalQL.g:2288:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalQL.g:2288:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalQL.g:2289:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalQL.g:2289:3: ()
            // InternalQL.g:2290:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnumerationLiteralAccess().getEnumerationLiteralAction_0(),
            					current);
            			

            }

            // InternalQL.g:2296:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalQL.g:2297:4: (lv_name_1_0= RULE_ID )
            {
            // InternalQL.g:2297:4: (lv_name_1_0= RULE_ID )
            // InternalQL.g:2298:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumerationLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // InternalQL.g:2318:1: entryRuleIntegerValue returns [EObject current=null] : iv_ruleIntegerValue= ruleIntegerValue EOF ;
    public final EObject entryRuleIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValue = null;


        try {
            // InternalQL.g:2318:53: (iv_ruleIntegerValue= ruleIntegerValue EOF )
            // InternalQL.g:2319:2: iv_ruleIntegerValue= ruleIntegerValue EOF
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
    // InternalQL.g:2325:1: ruleIntegerValue returns [EObject current=null] : ( () ( (lv_intValue_1_0= ruleEInt ) ) ) ;
    public final EObject ruleIntegerValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_intValue_1_0 = null;



        	enterRule();

        try {
            // InternalQL.g:2331:2: ( ( () ( (lv_intValue_1_0= ruleEInt ) ) ) )
            // InternalQL.g:2332:2: ( () ( (lv_intValue_1_0= ruleEInt ) ) )
            {
            // InternalQL.g:2332:2: ( () ( (lv_intValue_1_0= ruleEInt ) ) )
            // InternalQL.g:2333:3: () ( (lv_intValue_1_0= ruleEInt ) )
            {
            // InternalQL.g:2333:3: ()
            // InternalQL.g:2334:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerValueAccess().getIntegerValueAction_0(),
            					current);
            			

            }

            // InternalQL.g:2340:3: ( (lv_intValue_1_0= ruleEInt ) )
            // InternalQL.g:2341:4: (lv_intValue_1_0= ruleEInt )
            {
            // InternalQL.g:2341:4: (lv_intValue_1_0= ruleEInt )
            // InternalQL.g:2342:5: lv_intValue_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getIntegerValueAccess().getIntValueEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_intValue_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntegerValueRule());
            					}
            					set(
            						current,
            						"intValue",
            						lv_intValue_1_0,
            						"org.gemoc.ql.QL.EInt");
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
    // $ANTLR end "ruleIntegerValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalQL.g:2363:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalQL.g:2363:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalQL.g:2364:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalQL.g:2370:1: ruleStringValue returns [EObject current=null] : ( () ( (lv_stringValue_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_stringValue_1_0=null;


        	enterRule();

        try {
            // InternalQL.g:2376:2: ( ( () ( (lv_stringValue_1_0= RULE_STRING ) ) ) )
            // InternalQL.g:2377:2: ( () ( (lv_stringValue_1_0= RULE_STRING ) ) )
            {
            // InternalQL.g:2377:2: ( () ( (lv_stringValue_1_0= RULE_STRING ) ) )
            // InternalQL.g:2378:3: () ( (lv_stringValue_1_0= RULE_STRING ) )
            {
            // InternalQL.g:2378:3: ()
            // InternalQL.g:2379:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringValueAccess().getStringValueAction_0(),
            					current);
            			

            }

            // InternalQL.g:2385:3: ( (lv_stringValue_1_0= RULE_STRING ) )
            // InternalQL.g:2386:4: (lv_stringValue_1_0= RULE_STRING )
            {
            // InternalQL.g:2386:4: (lv_stringValue_1_0= RULE_STRING )
            // InternalQL.g:2387:5: lv_stringValue_1_0= RULE_STRING
            {
            lv_stringValue_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_stringValue_1_0, grammarAccess.getStringValueAccess().getStringValueSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"stringValue",
            						lv_stringValue_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalQL.g:2407:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalQL.g:2407:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalQL.g:2408:2: iv_ruleBooleanValue= ruleBooleanValue EOF
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
    // InternalQL.g:2414:1: ruleBooleanValue returns [EObject current=null] : ( () ( (lv_booleanValue_1_0= ruleEBoolean ) ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_booleanValue_1_0 = null;



        	enterRule();

        try {
            // InternalQL.g:2420:2: ( ( () ( (lv_booleanValue_1_0= ruleEBoolean ) ) ) )
            // InternalQL.g:2421:2: ( () ( (lv_booleanValue_1_0= ruleEBoolean ) ) )
            {
            // InternalQL.g:2421:2: ( () ( (lv_booleanValue_1_0= ruleEBoolean ) ) )
            // InternalQL.g:2422:3: () ( (lv_booleanValue_1_0= ruleEBoolean ) )
            {
            // InternalQL.g:2422:3: ()
            // InternalQL.g:2423:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanValueAccess().getBooleanValueAction_0(),
            					current);
            			

            }

            // InternalQL.g:2429:3: ( (lv_booleanValue_1_0= ruleEBoolean ) )
            // InternalQL.g:2430:4: (lv_booleanValue_1_0= ruleEBoolean )
            {
            // InternalQL.g:2430:4: (lv_booleanValue_1_0= ruleEBoolean )
            // InternalQL.g:2431:5: lv_booleanValue_1_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getBooleanValueAccess().getBooleanValueEBooleanParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_booleanValue_1_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanValueRule());
            					}
            					set(
            						current,
            						"booleanValue",
            						lv_booleanValue_1_0,
            						"org.gemoc.ql.QL.EBoolean");
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
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleEnumerationCall"
    // InternalQL.g:2452:1: entryRuleEnumerationCall returns [EObject current=null] : iv_ruleEnumerationCall= ruleEnumerationCall EOF ;
    public final EObject entryRuleEnumerationCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationCall = null;


        try {
            // InternalQL.g:2452:56: (iv_ruleEnumerationCall= ruleEnumerationCall EOF )
            // InternalQL.g:2453:2: iv_ruleEnumerationCall= ruleEnumerationCall EOF
            {
             newCompositeNode(grammarAccess.getEnumerationCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumerationCall=ruleEnumerationCall();

            state._fsp--;

             current =iv_ruleEnumerationCall; 
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
    // $ANTLR end "entryRuleEnumerationCall"


    // $ANTLR start "ruleEnumerationCall"
    // InternalQL.g:2459:1: ruleEnumerationCall returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleEnumerationCall() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalQL.g:2465:2: ( ( () ( ( ruleQualifiedName ) ) ) )
            // InternalQL.g:2466:2: ( () ( ( ruleQualifiedName ) ) )
            {
            // InternalQL.g:2466:2: ( () ( ( ruleQualifiedName ) ) )
            // InternalQL.g:2467:3: () ( ( ruleQualifiedName ) )
            {
            // InternalQL.g:2467:3: ()
            // InternalQL.g:2468:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnumerationCallAccess().getEnumerationCallAction_0(),
            					current);
            			

            }

            // InternalQL.g:2474:3: ( ( ruleQualifiedName ) )
            // InternalQL.g:2475:4: ( ruleQualifiedName )
            {
            // InternalQL.g:2475:4: ( ruleQualifiedName )
            // InternalQL.g:2476:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumerationCallRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEnumerationCallAccess().getEnumerationLiteralEnumerationLiteralCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

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
    // $ANTLR end "ruleEnumerationCall"


    // $ANTLR start "entryRuleDateValue"
    // InternalQL.g:2494:1: entryRuleDateValue returns [EObject current=null] : iv_ruleDateValue= ruleDateValue EOF ;
    public final EObject entryRuleDateValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateValue = null;


        try {
            // InternalQL.g:2494:50: (iv_ruleDateValue= ruleDateValue EOF )
            // InternalQL.g:2495:2: iv_ruleDateValue= ruleDateValue EOF
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
    // InternalQL.g:2501:1: ruleDateValue returns [EObject current=null] : ( () otherlv_1= 'DateValue' otherlv_2= '{' (otherlv_3= 'dateValue' ( (lv_dateValue_4_0= ruleEDate ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleDateValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_dateValue_4_0 = null;



        	enterRule();

        try {
            // InternalQL.g:2507:2: ( ( () otherlv_1= 'DateValue' otherlv_2= '{' (otherlv_3= 'dateValue' ( (lv_dateValue_4_0= ruleEDate ) ) )? otherlv_5= '}' ) )
            // InternalQL.g:2508:2: ( () otherlv_1= 'DateValue' otherlv_2= '{' (otherlv_3= 'dateValue' ( (lv_dateValue_4_0= ruleEDate ) ) )? otherlv_5= '}' )
            {
            // InternalQL.g:2508:2: ( () otherlv_1= 'DateValue' otherlv_2= '{' (otherlv_3= 'dateValue' ( (lv_dateValue_4_0= ruleEDate ) ) )? otherlv_5= '}' )
            // InternalQL.g:2509:3: () otherlv_1= 'DateValue' otherlv_2= '{' (otherlv_3= 'dateValue' ( (lv_dateValue_4_0= ruleEDate ) ) )? otherlv_5= '}'
            {
            // InternalQL.g:2509:3: ()
            // InternalQL.g:2510:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDateValueAccess().getDateValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getDateValueAccess().getDateValueKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getDateValueAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQL.g:2524:3: (otherlv_3= 'dateValue' ( (lv_dateValue_4_0= ruleEDate ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==40) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalQL.g:2525:4: otherlv_3= 'dateValue' ( (lv_dateValue_4_0= ruleEDate ) )
                    {
                    otherlv_3=(Token)match(input,40,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getDateValueAccess().getDateValueKeyword_3_0());
                    			
                    // InternalQL.g:2529:4: ( (lv_dateValue_4_0= ruleEDate ) )
                    // InternalQL.g:2530:5: (lv_dateValue_4_0= ruleEDate )
                    {
                    // InternalQL.g:2530:5: (lv_dateValue_4_0= ruleEDate )
                    // InternalQL.g:2531:6: lv_dateValue_4_0= ruleEDate
                    {

                    						newCompositeNode(grammarAccess.getDateValueAccess().getDateValueEDateParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_27);
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

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

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
    // InternalQL.g:2557:1: entryRuleDecimalValue returns [EObject current=null] : iv_ruleDecimalValue= ruleDecimalValue EOF ;
    public final EObject entryRuleDecimalValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalValue = null;


        try {
            // InternalQL.g:2557:53: (iv_ruleDecimalValue= ruleDecimalValue EOF )
            // InternalQL.g:2558:2: iv_ruleDecimalValue= ruleDecimalValue EOF
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
    // InternalQL.g:2564:1: ruleDecimalValue returns [EObject current=null] : ( () ( (lv_decimalValue_1_0= ruleEDouble ) ) ) ;
    public final EObject ruleDecimalValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_decimalValue_1_0 = null;



        	enterRule();

        try {
            // InternalQL.g:2570:2: ( ( () ( (lv_decimalValue_1_0= ruleEDouble ) ) ) )
            // InternalQL.g:2571:2: ( () ( (lv_decimalValue_1_0= ruleEDouble ) ) )
            {
            // InternalQL.g:2571:2: ( () ( (lv_decimalValue_1_0= ruleEDouble ) ) )
            // InternalQL.g:2572:3: () ( (lv_decimalValue_1_0= ruleEDouble ) )
            {
            // InternalQL.g:2572:3: ()
            // InternalQL.g:2573:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDecimalValueAccess().getDecimalValueAction_0(),
            					current);
            			

            }

            // InternalQL.g:2579:3: ( (lv_decimalValue_1_0= ruleEDouble ) )
            // InternalQL.g:2580:4: (lv_decimalValue_1_0= ruleEDouble )
            {
            // InternalQL.g:2580:4: (lv_decimalValue_1_0= ruleEDouble )
            // InternalQL.g:2581:5: lv_decimalValue_1_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getDecimalValueAccess().getDecimalValueEDoubleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_decimalValue_1_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDecimalValueRule());
            					}
            					set(
            						current,
            						"decimalValue",
            						lv_decimalValue_1_0,
            						"org.gemoc.ql.QL.EDouble");
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
    // $ANTLR end "ruleDecimalValue"


    // $ANTLR start "entryRuleEInt"
    // InternalQL.g:2602:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalQL.g:2602:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalQL.g:2603:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalQL.g:2609:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalQL.g:2615:2: (this_INT_0= RULE_INT )
            // InternalQL.g:2616:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getEIntAccess().getINTTerminalRuleCall());
            	

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


    // $ANTLR start "entryRuleEDouble"
    // InternalQL.g:2626:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalQL.g:2626:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalQL.g:2627:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalQL.g:2633:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_6=null;


        	enterRule();

        try {
            // InternalQL.g:2639:2: ( ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )? ) )
            // InternalQL.g:2640:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )? )
            {
            // InternalQL.g:2640:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )? )
            // InternalQL.g:2641:3: (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )?
            {
            // InternalQL.g:2641:3: (this_INT_0= RULE_INT )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_INT) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalQL.g:2642:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_38); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,41,FOLLOW_32); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_39); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_2());
            		
            // InternalQL.g:2662:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=42 && LA45_0<=43)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalQL.g:2663:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT
                    {
                    // InternalQL.g:2663:4: (kw= 'E' | kw= 'e' )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==42) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==43) ) {
                        alt43=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalQL.g:2664:5: kw= 'E'
                            {
                            kw=(Token)match(input,42,FOLLOW_40); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalQL.g:2670:5: kw= 'e'
                            {
                            kw=(Token)match(input,43,FOLLOW_40); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_3_0_1());
                            				

                            }
                            break;

                    }

                    // InternalQL.g:2676:4: (kw= '-' )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==44) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalQL.g:2677:5: kw= '-'
                            {
                            kw=(Token)match(input,44,FOLLOW_32); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_3_1());
                            				

                            }
                            break;

                    }

                    this_INT_6=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_6);
                    			

                    				newLeafNode(this_INT_6, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3_2());
                    			

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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleQuestionDefinition"
    // InternalQL.g:2695:1: entryRuleQuestionDefinition returns [EObject current=null] : iv_ruleQuestionDefinition= ruleQuestionDefinition EOF ;
    public final EObject entryRuleQuestionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionDefinition = null;


        try {
            // InternalQL.g:2695:59: (iv_ruleQuestionDefinition= ruleQuestionDefinition EOF )
            // InternalQL.g:2696:2: iv_ruleQuestionDefinition= ruleQuestionDefinition EOF
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
    // InternalQL.g:2702:1: ruleQuestionDefinition returns [EObject current=null] : ( ( (lv_isMandatory_0_0= 'mandatory' ) )? otherlv_1= 'question' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_isDisplayed_4_0= 'isDisplayed' ) )? (otherlv_5= 'currentValue' ( (lv_currentValue_6_0= ruleValue ) ) )? otherlv_7= ')' )? otherlv_8= ':' ( (lv_label_9_0= ruleEString ) ) ( ( ruleEString ) ) (otherlv_11= '=' ( (lv_computedExpression_12_0= ruleExpression ) ) otherlv_13= ';' )? ) ;
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
            // InternalQL.g:2708:2: ( ( ( (lv_isMandatory_0_0= 'mandatory' ) )? otherlv_1= 'question' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_isDisplayed_4_0= 'isDisplayed' ) )? (otherlv_5= 'currentValue' ( (lv_currentValue_6_0= ruleValue ) ) )? otherlv_7= ')' )? otherlv_8= ':' ( (lv_label_9_0= ruleEString ) ) ( ( ruleEString ) ) (otherlv_11= '=' ( (lv_computedExpression_12_0= ruleExpression ) ) otherlv_13= ';' )? ) )
            // InternalQL.g:2709:2: ( ( (lv_isMandatory_0_0= 'mandatory' ) )? otherlv_1= 'question' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_isDisplayed_4_0= 'isDisplayed' ) )? (otherlv_5= 'currentValue' ( (lv_currentValue_6_0= ruleValue ) ) )? otherlv_7= ')' )? otherlv_8= ':' ( (lv_label_9_0= ruleEString ) ) ( ( ruleEString ) ) (otherlv_11= '=' ( (lv_computedExpression_12_0= ruleExpression ) ) otherlv_13= ';' )? )
            {
            // InternalQL.g:2709:2: ( ( (lv_isMandatory_0_0= 'mandatory' ) )? otherlv_1= 'question' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_isDisplayed_4_0= 'isDisplayed' ) )? (otherlv_5= 'currentValue' ( (lv_currentValue_6_0= ruleValue ) ) )? otherlv_7= ')' )? otherlv_8= ':' ( (lv_label_9_0= ruleEString ) ) ( ( ruleEString ) ) (otherlv_11= '=' ( (lv_computedExpression_12_0= ruleExpression ) ) otherlv_13= ';' )? )
            // InternalQL.g:2710:3: ( (lv_isMandatory_0_0= 'mandatory' ) )? otherlv_1= 'question' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_isDisplayed_4_0= 'isDisplayed' ) )? (otherlv_5= 'currentValue' ( (lv_currentValue_6_0= ruleValue ) ) )? otherlv_7= ')' )? otherlv_8= ':' ( (lv_label_9_0= ruleEString ) ) ( ( ruleEString ) ) (otherlv_11= '=' ( (lv_computedExpression_12_0= ruleExpression ) ) otherlv_13= ';' )?
            {
            // InternalQL.g:2710:3: ( (lv_isMandatory_0_0= 'mandatory' ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==45) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalQL.g:2711:4: (lv_isMandatory_0_0= 'mandatory' )
                    {
                    // InternalQL.g:2711:4: (lv_isMandatory_0_0= 'mandatory' )
                    // InternalQL.g:2712:5: lv_isMandatory_0_0= 'mandatory'
                    {
                    lv_isMandatory_0_0=(Token)match(input,45,FOLLOW_41); 

                    					newLeafNode(lv_isMandatory_0_0, grammarAccess.getQuestionDefinitionAccess().getIsMandatoryMandatoryKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getQuestionDefinitionRule());
                    					}
                    					setWithLastConsumed(current, "isMandatory", lv_isMandatory_0_0 != null, "mandatory");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,46,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getQuestionDefinitionAccess().getQuestionKeyword_1());
            		
            // InternalQL.g:2728:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQL.g:2729:4: (lv_name_2_0= ruleEString )
            {
            // InternalQL.g:2729:4: (lv_name_2_0= ruleEString )
            // InternalQL.g:2730:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getQuestionDefinitionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_42);
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

            // InternalQL.g:2747:3: (otherlv_3= '(' ( (lv_isDisplayed_4_0= 'isDisplayed' ) )? (otherlv_5= 'currentValue' ( (lv_currentValue_6_0= ruleValue ) ) )? otherlv_7= ')' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==12) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalQL.g:2748:4: otherlv_3= '(' ( (lv_isDisplayed_4_0= 'isDisplayed' ) )? (otherlv_5= 'currentValue' ( (lv_currentValue_6_0= ruleValue ) ) )? otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_43); 

                    				newLeafNode(otherlv_3, grammarAccess.getQuestionDefinitionAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalQL.g:2752:4: ( (lv_isDisplayed_4_0= 'isDisplayed' ) )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==47) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalQL.g:2753:5: (lv_isDisplayed_4_0= 'isDisplayed' )
                            {
                            // InternalQL.g:2753:5: (lv_isDisplayed_4_0= 'isDisplayed' )
                            // InternalQL.g:2754:6: lv_isDisplayed_4_0= 'isDisplayed'
                            {
                            lv_isDisplayed_4_0=(Token)match(input,47,FOLLOW_44); 

                            						newLeafNode(lv_isDisplayed_4_0, grammarAccess.getQuestionDefinitionAccess().getIsDisplayedIsDisplayedKeyword_3_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getQuestionDefinitionRule());
                            						}
                            						setWithLastConsumed(current, "isDisplayed", lv_isDisplayed_4_0 != null, "isDisplayed");
                            					

                            }


                            }
                            break;

                    }

                    // InternalQL.g:2766:4: (otherlv_5= 'currentValue' ( (lv_currentValue_6_0= ruleValue ) ) )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==48) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalQL.g:2767:5: otherlv_5= 'currentValue' ( (lv_currentValue_6_0= ruleValue ) )
                            {
                            otherlv_5=(Token)match(input,48,FOLLOW_45); 

                            					newLeafNode(otherlv_5, grammarAccess.getQuestionDefinitionAccess().getCurrentValueKeyword_3_2_0());
                            				
                            // InternalQL.g:2771:5: ( (lv_currentValue_6_0= ruleValue ) )
                            // InternalQL.g:2772:6: (lv_currentValue_6_0= ruleValue )
                            {
                            // InternalQL.g:2772:6: (lv_currentValue_6_0= ruleValue )
                            // InternalQL.g:2773:7: lv_currentValue_6_0= ruleValue
                            {

                            							newCompositeNode(grammarAccess.getQuestionDefinitionAccess().getCurrentValueValueParserRuleCall_3_2_1_0());
                            						
                            pushFollow(FOLLOW_8);
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

                    otherlv_7=(Token)match(input,15,FOLLOW_46); 

                    				newLeafNode(otherlv_7, grammarAccess.getQuestionDefinitionAccess().getRightParenthesisKeyword_3_3());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,49,FOLLOW_26); 

            			newLeafNode(otherlv_8, grammarAccess.getQuestionDefinitionAccess().getColonKeyword_4());
            		
            // InternalQL.g:2800:3: ( (lv_label_9_0= ruleEString ) )
            // InternalQL.g:2801:4: (lv_label_9_0= ruleEString )
            {
            // InternalQL.g:2801:4: (lv_label_9_0= ruleEString )
            // InternalQL.g:2802:5: lv_label_9_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getQuestionDefinitionAccess().getLabelEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_26);
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

            // InternalQL.g:2819:3: ( ( ruleEString ) )
            // InternalQL.g:2820:4: ( ruleEString )
            {
            // InternalQL.g:2820:4: ( ruleEString )
            // InternalQL.g:2821:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuestionDefinitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getQuestionDefinitionAccess().getDataTypeValueTypeCrossReference_6_0());
            				
            pushFollow(FOLLOW_19);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQL.g:2835:3: (otherlv_11= '=' ( (lv_computedExpression_12_0= ruleExpression ) ) otherlv_13= ';' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==50) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalQL.g:2836:4: otherlv_11= '=' ( (lv_computedExpression_12_0= ruleExpression ) ) otherlv_13= ';'
                    {
                    otherlv_11=(Token)match(input,50,FOLLOW_12); 

                    				newLeafNode(otherlv_11, grammarAccess.getQuestionDefinitionAccess().getEqualsSignKeyword_7_0());
                    			
                    // InternalQL.g:2840:4: ( (lv_computedExpression_12_0= ruleExpression ) )
                    // InternalQL.g:2841:5: (lv_computedExpression_12_0= ruleExpression )
                    {
                    // InternalQL.g:2841:5: (lv_computedExpression_12_0= ruleExpression )
                    // InternalQL.g:2842:6: lv_computedExpression_12_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getQuestionDefinitionAccess().getComputedExpressionExpressionParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_47);
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

                    otherlv_13=(Token)match(input,51,FOLLOW_2); 

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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalQL.g:2868:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalQL.g:2868:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalQL.g:2869:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalQL.g:2875:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalQL.g:2881:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalQL.g:2882:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalQL.g:2882:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalQL.g:2883:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_48); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalQL.g:2890:3: (kw= '.' this_ID_2= RULE_ID )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==41) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalQL.g:2891:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,41,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_48); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop51;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleBinaryOperatorKind"
    // InternalQL.g:2908:1: ruleBinaryOperatorKind returns [Enumerator current=null] : ( (enumLiteral_0= 'PLUS' ) | (enumLiteral_1= 'MINUS' ) | (enumLiteral_2= 'MULT' ) | (enumLiteral_3= 'DIV' ) | (enumLiteral_4= 'EQUAL' ) | (enumLiteral_5= 'NOTEQUAL' ) | (enumLiteral_6= 'GREATER' ) | (enumLiteral_7= 'LOWER' ) | (enumLiteral_8= 'GREATEROREQUAL' ) | (enumLiteral_9= 'LOWEROREQUAL' ) | (enumLiteral_10= 'AND' ) | (enumLiteral_11= 'OR' ) ) ;
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
            // InternalQL.g:2914:2: ( ( (enumLiteral_0= 'PLUS' ) | (enumLiteral_1= 'MINUS' ) | (enumLiteral_2= 'MULT' ) | (enumLiteral_3= 'DIV' ) | (enumLiteral_4= 'EQUAL' ) | (enumLiteral_5= 'NOTEQUAL' ) | (enumLiteral_6= 'GREATER' ) | (enumLiteral_7= 'LOWER' ) | (enumLiteral_8= 'GREATEROREQUAL' ) | (enumLiteral_9= 'LOWEROREQUAL' ) | (enumLiteral_10= 'AND' ) | (enumLiteral_11= 'OR' ) ) )
            // InternalQL.g:2915:2: ( (enumLiteral_0= 'PLUS' ) | (enumLiteral_1= 'MINUS' ) | (enumLiteral_2= 'MULT' ) | (enumLiteral_3= 'DIV' ) | (enumLiteral_4= 'EQUAL' ) | (enumLiteral_5= 'NOTEQUAL' ) | (enumLiteral_6= 'GREATER' ) | (enumLiteral_7= 'LOWER' ) | (enumLiteral_8= 'GREATEROREQUAL' ) | (enumLiteral_9= 'LOWEROREQUAL' ) | (enumLiteral_10= 'AND' ) | (enumLiteral_11= 'OR' ) )
            {
            // InternalQL.g:2915:2: ( (enumLiteral_0= 'PLUS' ) | (enumLiteral_1= 'MINUS' ) | (enumLiteral_2= 'MULT' ) | (enumLiteral_3= 'DIV' ) | (enumLiteral_4= 'EQUAL' ) | (enumLiteral_5= 'NOTEQUAL' ) | (enumLiteral_6= 'GREATER' ) | (enumLiteral_7= 'LOWER' ) | (enumLiteral_8= 'GREATEROREQUAL' ) | (enumLiteral_9= 'LOWEROREQUAL' ) | (enumLiteral_10= 'AND' ) | (enumLiteral_11= 'OR' ) )
            int alt52=12;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt52=1;
                }
                break;
            case 53:
                {
                alt52=2;
                }
                break;
            case 54:
                {
                alt52=3;
                }
                break;
            case 55:
                {
                alt52=4;
                }
                break;
            case 56:
                {
                alt52=5;
                }
                break;
            case 57:
                {
                alt52=6;
                }
                break;
            case 58:
                {
                alt52=7;
                }
                break;
            case 59:
                {
                alt52=8;
                }
                break;
            case 60:
                {
                alt52=9;
                }
                break;
            case 61:
                {
                alt52=10;
                }
                break;
            case 62:
                {
                alt52=11;
                }
                break;
            case 63:
                {
                alt52=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // InternalQL.g:2916:3: (enumLiteral_0= 'PLUS' )
                    {
                    // InternalQL.g:2916:3: (enumLiteral_0= 'PLUS' )
                    // InternalQL.g:2917:4: enumLiteral_0= 'PLUS'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBinaryOperatorKindAccess().getPLUSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:2924:3: (enumLiteral_1= 'MINUS' )
                    {
                    // InternalQL.g:2924:3: (enumLiteral_1= 'MINUS' )
                    // InternalQL.g:2925:4: enumLiteral_1= 'MINUS'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBinaryOperatorKindAccess().getMINUSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalQL.g:2932:3: (enumLiteral_2= 'MULT' )
                    {
                    // InternalQL.g:2932:3: (enumLiteral_2= 'MULT' )
                    // InternalQL.g:2933:4: enumLiteral_2= 'MULT'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBinaryOperatorKindAccess().getMULTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalQL.g:2940:3: (enumLiteral_3= 'DIV' )
                    {
                    // InternalQL.g:2940:3: (enumLiteral_3= 'DIV' )
                    // InternalQL.g:2941:4: enumLiteral_3= 'DIV'
                    {
                    enumLiteral_3=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getDIVEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBinaryOperatorKindAccess().getDIVEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalQL.g:2948:3: (enumLiteral_4= 'EQUAL' )
                    {
                    // InternalQL.g:2948:3: (enumLiteral_4= 'EQUAL' )
                    // InternalQL.g:2949:4: enumLiteral_4= 'EQUAL'
                    {
                    enumLiteral_4=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getEQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getBinaryOperatorKindAccess().getEQUALEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalQL.g:2956:3: (enumLiteral_5= 'NOTEQUAL' )
                    {
                    // InternalQL.g:2956:3: (enumLiteral_5= 'NOTEQUAL' )
                    // InternalQL.g:2957:4: enumLiteral_5= 'NOTEQUAL'
                    {
                    enumLiteral_5=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getNOTEQUALEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getBinaryOperatorKindAccess().getNOTEQUALEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalQL.g:2964:3: (enumLiteral_6= 'GREATER' )
                    {
                    // InternalQL.g:2964:3: (enumLiteral_6= 'GREATER' )
                    // InternalQL.g:2965:4: enumLiteral_6= 'GREATER'
                    {
                    enumLiteral_6=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getGREATEREnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getBinaryOperatorKindAccess().getGREATEREnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalQL.g:2972:3: (enumLiteral_7= 'LOWER' )
                    {
                    // InternalQL.g:2972:3: (enumLiteral_7= 'LOWER' )
                    // InternalQL.g:2973:4: enumLiteral_7= 'LOWER'
                    {
                    enumLiteral_7=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getLOWEREnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getBinaryOperatorKindAccess().getLOWEREnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalQL.g:2980:3: (enumLiteral_8= 'GREATEROREQUAL' )
                    {
                    // InternalQL.g:2980:3: (enumLiteral_8= 'GREATEROREQUAL' )
                    // InternalQL.g:2981:4: enumLiteral_8= 'GREATEROREQUAL'
                    {
                    enumLiteral_8=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getBinaryOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalQL.g:2988:3: (enumLiteral_9= 'LOWEROREQUAL' )
                    {
                    // InternalQL.g:2988:3: (enumLiteral_9= 'LOWEROREQUAL' )
                    // InternalQL.g:2989:4: enumLiteral_9= 'LOWEROREQUAL'
                    {
                    enumLiteral_9=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getLOWEROREQUALEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getBinaryOperatorKindAccess().getLOWEROREQUALEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalQL.g:2996:3: (enumLiteral_10= 'AND' )
                    {
                    // InternalQL.g:2996:3: (enumLiteral_10= 'AND' )
                    // InternalQL.g:2997:4: enumLiteral_10= 'AND'
                    {
                    enumLiteral_10=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getANDEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getBinaryOperatorKindAccess().getANDEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalQL.g:3004:3: (enumLiteral_11= 'OR' )
                    {
                    // InternalQL.g:3004:3: (enumLiteral_11= 'OR' )
                    // InternalQL.g:3005:4: enumLiteral_11= 'OR'
                    {
                    enumLiteral_11=(Token)match(input,63,FOLLOW_2); 

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
    // InternalQL.g:3015:1: ruleUnaryOperatorKind returns [Enumerator current=null] : ( (enumLiteral_0= '-' ) | (enumLiteral_1= 'not' ) ) ;
    public final Enumerator ruleUnaryOperatorKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalQL.g:3021:2: ( ( (enumLiteral_0= '-' ) | (enumLiteral_1= 'not' ) ) )
            // InternalQL.g:3022:2: ( (enumLiteral_0= '-' ) | (enumLiteral_1= 'not' ) )
            {
            // InternalQL.g:3022:2: ( (enumLiteral_0= '-' ) | (enumLiteral_1= 'not' ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==44) ) {
                alt53=1;
            }
            else if ( (LA53_0==64) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalQL.g:3023:3: (enumLiteral_0= '-' )
                    {
                    // InternalQL.g:3023:3: (enumLiteral_0= '-' )
                    // InternalQL.g:3024:4: enumLiteral_0= '-'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getUnaryOperatorKindAccess().getUNARYMINUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorKindAccess().getUNARYMINUSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:3031:3: (enumLiteral_1= 'not' )
                    {
                    // InternalQL.g:3031:3: (enumLiteral_1= 'not' )
                    // InternalQL.g:3032:4: enumLiteral_1= 'not'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_2); 

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
    // InternalQL.g:3042:1: ruleAdditionOperatorKind returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditionOperatorKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalQL.g:3048:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalQL.g:3049:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalQL.g:3049:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==65) ) {
                alt54=1;
            }
            else if ( (LA54_0==44) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalQL.g:3050:3: (enumLiteral_0= '+' )
                    {
                    // InternalQL.g:3050:3: (enumLiteral_0= '+' )
                    // InternalQL.g:3051:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getAdditionOperatorKindAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAdditionOperatorKindAccess().getPLUSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:3058:3: (enumLiteral_1= '-' )
                    {
                    // InternalQL.g:3058:3: (enumLiteral_1= '-' )
                    // InternalQL.g:3059:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); 

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
    // InternalQL.g:3069:1: ruleMultiplicationOperatorKind returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) ;
    public final Enumerator ruleMultiplicationOperatorKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalQL.g:3075:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) )
            // InternalQL.g:3076:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            {
            // InternalQL.g:3076:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==66) ) {
                alt55=1;
            }
            else if ( (LA55_0==67) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalQL.g:3077:3: (enumLiteral_0= '*' )
                    {
                    // InternalQL.g:3077:3: (enumLiteral_0= '*' )
                    // InternalQL.g:3078:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicationOperatorKindAccess().getMULTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMultiplicationOperatorKindAccess().getMULTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:3085:3: (enumLiteral_1= '/' )
                    {
                    // InternalQL.g:3085:3: (enumLiteral_1= '/' )
                    // InternalQL.g:3086:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,67,FOLLOW_2); 

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
    // InternalQL.g:3096:1: ruleEqualOperatorKind returns [Enumerator current=null] : (enumLiteral_0= '=' ) ;
    public final Enumerator ruleEqualOperatorKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalQL.g:3102:2: ( (enumLiteral_0= '=' ) )
            // InternalQL.g:3103:2: (enumLiteral_0= '=' )
            {
            // InternalQL.g:3103:2: (enumLiteral_0= '=' )
            // InternalQL.g:3104:3: enumLiteral_0= '='
            {
            enumLiteral_0=(Token)match(input,50,FOLLOW_2); 

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
    // InternalQL.g:3113:1: ruleComparisionOperatorKind returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) ) ;
    public final Enumerator ruleComparisionOperatorKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalQL.g:3119:2: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) ) )
            // InternalQL.g:3120:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) )
            {
            // InternalQL.g:3120:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) )
            int alt56=4;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt56=1;
                }
                break;
            case 69:
                {
                alt56=2;
                }
                break;
            case 70:
                {
                alt56=3;
                }
                break;
            case 71:
                {
                alt56=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // InternalQL.g:3121:3: (enumLiteral_0= '>' )
                    {
                    // InternalQL.g:3121:3: (enumLiteral_0= '>' )
                    // InternalQL.g:3122:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getComparisionOperatorKindAccess().getGREATEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getComparisionOperatorKindAccess().getGREATEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:3129:3: (enumLiteral_1= '<' )
                    {
                    // InternalQL.g:3129:3: (enumLiteral_1= '<' )
                    // InternalQL.g:3130:4: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getComparisionOperatorKindAccess().getLOWEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getComparisionOperatorKindAccess().getLOWEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalQL.g:3137:3: (enumLiteral_2= '>=' )
                    {
                    // InternalQL.g:3137:3: (enumLiteral_2= '>=' )
                    // InternalQL.g:3138:4: enumLiteral_2= '>='
                    {
                    enumLiteral_2=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getComparisionOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getComparisionOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalQL.g:3145:3: (enumLiteral_3= '<=' )
                    {
                    // InternalQL.g:3145:3: (enumLiteral_3= '<=' )
                    // InternalQL.g:3146:4: enumLiteral_3= '<='
                    {
                    enumLiteral_3=(Token)match(input,71,FOLLOW_2); 

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
    // InternalQL.g:3156:1: ruleAndOperatorKind returns [Enumerator current=null] : (enumLiteral_0= 'and' ) ;
    public final Enumerator ruleAndOperatorKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalQL.g:3162:2: ( (enumLiteral_0= 'and' ) )
            // InternalQL.g:3163:2: (enumLiteral_0= 'and' )
            {
            // InternalQL.g:3163:2: (enumLiteral_0= 'and' )
            // InternalQL.g:3164:3: enumLiteral_0= 'and'
            {
            enumLiteral_0=(Token)match(input,72,FOLLOW_2); 

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
    // InternalQL.g:3173:1: ruleOrOperatorKind returns [Enumerator current=null] : (enumLiteral_0= 'or' ) ;
    public final Enumerator ruleOrOperatorKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalQL.g:3179:2: ( (enumLiteral_0= 'or' ) )
            // InternalQL.g:3180:2: (enumLiteral_0= 'or' )
            {
            // InternalQL.g:3180:2: (enumLiteral_0= 'or' )
            // InternalQL.g:3181:3: enumLiteral_0= 'or'
            {
            enumLiteral_0=(Token)match(input,73,FOLLOW_2); 

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


    protected DFA16 dfa16 = new DFA16(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\2\uffff\1\5\3\uffff\1\5";
    static final String dfa_3s = "\1\4\1\uffff\1\14\1\4\2\uffff\1\14";
    static final String dfa_4s = "\1\51\1\uffff\1\111\1\4\2\uffff\1\111";
    static final String dfa_5s = "\1\uffff\1\1\2\uffff\1\2\1\3\1\uffff";
    static final String dfa_6s = "\7\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\2\1\21\uffff\2\1\17\uffff\1\1",
            "",
            "\1\4\2\uffff\2\5\4\uffff\3\5\21\uffff\1\3\2\uffff\1\5\5\uffff\2\5\15\uffff\11\5",
            "\1\6",
            "",
            "",
            "\1\4\2\uffff\2\5\4\uffff\3\5\21\uffff\1\3\2\uffff\1\5\5\uffff\2\5\15\uffff\11\5"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1054:2: (this_ConstantCall_0= ruleConstantCall | this_QuestionCall_1= ruleQuestionCall | this_EnumerationCall_2= ruleEnumerationCall )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000120003101070L,0x0000000000000001L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000020003101070L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000F0L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000100000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000604E68080000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000190010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010080000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000190080000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000180080000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000100080000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001010080000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000002000080000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000100000000040L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0002000000001000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0001800000008000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001000000008000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000028003000060L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000020000000002L});

}