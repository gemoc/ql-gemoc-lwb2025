package org.gemoc.qls.parser.antlr.internal;

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
import org.gemoc.qls.services.QLSGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQLSParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'QLSModel'", "'{'", "'questionStyles'", "'}'", "'import'", "'styledQuestion'", "'labelStyle'", "'typeStyle'", "'italic'", "'bold'", "'BooleanStyle'", "'NumericStyle'", "'textField'", "'step'", "'spinner'", "'TextStyle'", "'multiline'", "'('", "')'", "'if'", "'then'", "'else'", "'endif'", "'Form'", "'definitions'", "'true'", "'false'", "'EDate'", "'ValueType'", "'unit'", "'booleanType'", "'integerType'", "'min'", "'max'", "'decimalType'", "'dateType'", "'enumerationType'", "'literals'", "','", "'StringType'", "'DateValue'", "'dateValue'", "'.'", "'E'", "'e'", "'-'", "'mandatory'", "'question'", "'isDisplayed'", "'currentValue'", "':'", "'='", "';'", "'CHECKBOX'", "'TWO_RADIO'", "'DROPDOWN'", "'PLUS'", "'MINUS'", "'MULT'", "'DIV'", "'EQUAL'", "'NOTEQUAL'", "'GREATER'", "'LOWER'", "'GREATEROREQUAL'", "'LOWEROREQUAL'", "'AND'", "'OR'", "'not'", "'+'", "'*'", "'/'", "'>'", "'<'", "'>='", "'<='", "'and'", "'or'"
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


        public InternalQLSParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQLSParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQLSParser.tokenNames; }
    public String getGrammarFileName() { return "InternalQLS.g"; }



     	private QLSGrammarAccess grammarAccess;

        public InternalQLSParser(TokenStream input, QLSGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "QLSModel";
       	}

       	@Override
       	protected QLSGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleQLSModel"
    // InternalQLS.g:65:1: entryRuleQLSModel returns [EObject current=null] : iv_ruleQLSModel= ruleQLSModel EOF ;
    public final EObject entryRuleQLSModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQLSModel = null;


        try {
            // InternalQLS.g:65:49: (iv_ruleQLSModel= ruleQLSModel EOF )
            // InternalQLS.g:66:2: iv_ruleQLSModel= ruleQLSModel EOF
            {
             newCompositeNode(grammarAccess.getQLSModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQLSModel=ruleQLSModel();

            state._fsp--;

             current =iv_ruleQLSModel; 
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
    // $ANTLR end "entryRuleQLSModel"


    // $ANTLR start "ruleQLSModel"
    // InternalQLS.g:72:1: ruleQLSModel returns [EObject current=null] : ( () ( (lv_imports_1_0= ruleImport ) )* otherlv_2= 'QLSModel' otherlv_3= '{' otherlv_4= 'questionStyles' otherlv_5= '{' ( (lv_questionStyles_6_0= ruleQuestionStyle ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleQLSModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_imports_1_0 = null;

        EObject lv_questionStyles_6_0 = null;



        	enterRule();

        try {
            // InternalQLS.g:78:2: ( ( () ( (lv_imports_1_0= ruleImport ) )* otherlv_2= 'QLSModel' otherlv_3= '{' otherlv_4= 'questionStyles' otherlv_5= '{' ( (lv_questionStyles_6_0= ruleQuestionStyle ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalQLS.g:79:2: ( () ( (lv_imports_1_0= ruleImport ) )* otherlv_2= 'QLSModel' otherlv_3= '{' otherlv_4= 'questionStyles' otherlv_5= '{' ( (lv_questionStyles_6_0= ruleQuestionStyle ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalQLS.g:79:2: ( () ( (lv_imports_1_0= ruleImport ) )* otherlv_2= 'QLSModel' otherlv_3= '{' otherlv_4= 'questionStyles' otherlv_5= '{' ( (lv_questionStyles_6_0= ruleQuestionStyle ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalQLS.g:80:3: () ( (lv_imports_1_0= ruleImport ) )* otherlv_2= 'QLSModel' otherlv_3= '{' otherlv_4= 'questionStyles' otherlv_5= '{' ( (lv_questionStyles_6_0= ruleQuestionStyle ) )* otherlv_7= '}' otherlv_8= '}'
            {
            // InternalQLS.g:80:3: ()
            // InternalQLS.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQLSModelAccess().getQLSModelAction_0(),
            					current);
            			

            }

            // InternalQLS.g:87:3: ( (lv_imports_1_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalQLS.g:88:4: (lv_imports_1_0= ruleImport )
            	    {
            	    // InternalQLS.g:88:4: (lv_imports_1_0= ruleImport )
            	    // InternalQLS.g:89:5: lv_imports_1_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getQLSModelAccess().getImportsImportParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_imports_1_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQLSModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_1_0,
            	    						"org.gemoc.qls.QLS.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_2=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getQLSModelAccess().getQLSModelKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getQLSModelAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getQLSModelAccess().getQuestionStylesKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getQLSModelAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalQLS.g:122:3: ( (lv_questionStyles_6_0= ruleQuestionStyle ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalQLS.g:123:4: (lv_questionStyles_6_0= ruleQuestionStyle )
            	    {
            	    // InternalQLS.g:123:4: (lv_questionStyles_6_0= ruleQuestionStyle )
            	    // InternalQLS.g:124:5: lv_questionStyles_6_0= ruleQuestionStyle
            	    {

            	    					newCompositeNode(grammarAccess.getQLSModelAccess().getQuestionStylesQuestionStyleParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_questionStyles_6_0=ruleQuestionStyle();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQLSModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"questionStyles",
            	    						lv_questionStyles_6_0,
            	    						"org.gemoc.qls.QLS.QuestionStyle");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getQLSModelAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getQLSModelAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleQLSModel"


    // $ANTLR start "entryRuleImport"
    // InternalQLS.g:153:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalQLS.g:153:47: (iv_ruleImport= ruleImport EOF )
            // InternalQLS.g:154:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalQLS.g:160:1: ruleImport returns [EObject current=null] : ( () otherlv_1= 'import' ( (lv_importURI_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_importURI_2_0=null;


        	enterRule();

        try {
            // InternalQLS.g:166:2: ( ( () otherlv_1= 'import' ( (lv_importURI_2_0= RULE_STRING ) ) ) )
            // InternalQLS.g:167:2: ( () otherlv_1= 'import' ( (lv_importURI_2_0= RULE_STRING ) ) )
            {
            // InternalQLS.g:167:2: ( () otherlv_1= 'import' ( (lv_importURI_2_0= RULE_STRING ) ) )
            // InternalQLS.g:168:3: () otherlv_1= 'import' ( (lv_importURI_2_0= RULE_STRING ) )
            {
            // InternalQLS.g:168:3: ()
            // InternalQLS.g:169:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getImportAccess().getImportAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getImportAccess().getImportKeyword_1());
            		
            // InternalQLS.g:179:3: ( (lv_importURI_2_0= RULE_STRING ) )
            // InternalQLS.g:180:4: (lv_importURI_2_0= RULE_STRING )
            {
            // InternalQLS.g:180:4: (lv_importURI_2_0= RULE_STRING )
            // InternalQLS.g:181:5: lv_importURI_2_0= RULE_STRING
            {
            lv_importURI_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_importURI_2_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"importURI",
            						lv_importURI_2_0,
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleTypeStyle"
    // InternalQLS.g:201:1: entryRuleTypeStyle returns [EObject current=null] : iv_ruleTypeStyle= ruleTypeStyle EOF ;
    public final EObject entryRuleTypeStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeStyle = null;


        try {
            // InternalQLS.g:201:50: (iv_ruleTypeStyle= ruleTypeStyle EOF )
            // InternalQLS.g:202:2: iv_ruleTypeStyle= ruleTypeStyle EOF
            {
             newCompositeNode(grammarAccess.getTypeStyleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeStyle=ruleTypeStyle();

            state._fsp--;

             current =iv_ruleTypeStyle; 
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
    // $ANTLR end "entryRuleTypeStyle"


    // $ANTLR start "ruleTypeStyle"
    // InternalQLS.g:208:1: ruleTypeStyle returns [EObject current=null] : (this_BooleanTypeStyle_0= ruleBooleanTypeStyle | this_NumericTypeStyle_1= ruleNumericTypeStyle | this_TextTypeStyle_2= ruleTextTypeStyle ) ;
    public final EObject ruleTypeStyle() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanTypeStyle_0 = null;

        EObject this_NumericTypeStyle_1 = null;

        EObject this_TextTypeStyle_2 = null;



        	enterRule();

        try {
            // InternalQLS.g:214:2: ( (this_BooleanTypeStyle_0= ruleBooleanTypeStyle | this_NumericTypeStyle_1= ruleNumericTypeStyle | this_TextTypeStyle_2= ruleTextTypeStyle ) )
            // InternalQLS.g:215:2: (this_BooleanTypeStyle_0= ruleBooleanTypeStyle | this_NumericTypeStyle_1= ruleNumericTypeStyle | this_TextTypeStyle_2= ruleTextTypeStyle )
            {
            // InternalQLS.g:215:2: (this_BooleanTypeStyle_0= ruleBooleanTypeStyle | this_NumericTypeStyle_1= ruleNumericTypeStyle | this_TextTypeStyle_2= ruleTextTypeStyle )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt3=1;
                }
                break;
            case 22:
                {
                alt3=2;
                }
                break;
            case 26:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalQLS.g:216:3: this_BooleanTypeStyle_0= ruleBooleanTypeStyle
                    {

                    			newCompositeNode(grammarAccess.getTypeStyleAccess().getBooleanTypeStyleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanTypeStyle_0=ruleBooleanTypeStyle();

                    state._fsp--;


                    			current = this_BooleanTypeStyle_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQLS.g:225:3: this_NumericTypeStyle_1= ruleNumericTypeStyle
                    {

                    			newCompositeNode(grammarAccess.getTypeStyleAccess().getNumericTypeStyleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumericTypeStyle_1=ruleNumericTypeStyle();

                    state._fsp--;


                    			current = this_NumericTypeStyle_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalQLS.g:234:3: this_TextTypeStyle_2= ruleTextTypeStyle
                    {

                    			newCompositeNode(grammarAccess.getTypeStyleAccess().getTextTypeStyleParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TextTypeStyle_2=ruleTextTypeStyle();

                    state._fsp--;


                    			current = this_TextTypeStyle_2;
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
    // $ANTLR end "ruleTypeStyle"


    // $ANTLR start "entryRuleNumericTypeStyle"
    // InternalQLS.g:246:1: entryRuleNumericTypeStyle returns [EObject current=null] : iv_ruleNumericTypeStyle= ruleNumericTypeStyle EOF ;
    public final EObject entryRuleNumericTypeStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericTypeStyle = null;


        try {
            // InternalQLS.g:246:57: (iv_ruleNumericTypeStyle= ruleNumericTypeStyle EOF )
            // InternalQLS.g:247:2: iv_ruleNumericTypeStyle= ruleNumericTypeStyle EOF
            {
             newCompositeNode(grammarAccess.getNumericTypeStyleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumericTypeStyle=ruleNumericTypeStyle();

            state._fsp--;

             current =iv_ruleNumericTypeStyle; 
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
    // $ANTLR end "entryRuleNumericTypeStyle"


    // $ANTLR start "ruleNumericTypeStyle"
    // InternalQLS.g:253:1: ruleNumericTypeStyle returns [EObject current=null] : (this_NumericTypeTextFieldStyle_0= ruleNumericTypeTextFieldStyle | this_NumericTypeSpinnerStyle_1= ruleNumericTypeSpinnerStyle ) ;
    public final EObject ruleNumericTypeStyle() throws RecognitionException {
        EObject current = null;

        EObject this_NumericTypeTextFieldStyle_0 = null;

        EObject this_NumericTypeSpinnerStyle_1 = null;



        	enterRule();

        try {
            // InternalQLS.g:259:2: ( (this_NumericTypeTextFieldStyle_0= ruleNumericTypeTextFieldStyle | this_NumericTypeSpinnerStyle_1= ruleNumericTypeSpinnerStyle ) )
            // InternalQLS.g:260:2: (this_NumericTypeTextFieldStyle_0= ruleNumericTypeTextFieldStyle | this_NumericTypeSpinnerStyle_1= ruleNumericTypeSpinnerStyle )
            {
            // InternalQLS.g:260:2: (this_NumericTypeTextFieldStyle_0= ruleNumericTypeTextFieldStyle | this_NumericTypeSpinnerStyle_1= ruleNumericTypeSpinnerStyle )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==23) ) {
                    alt4=1;
                }
                else if ( (LA4_1==25) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalQLS.g:261:3: this_NumericTypeTextFieldStyle_0= ruleNumericTypeTextFieldStyle
                    {

                    			newCompositeNode(grammarAccess.getNumericTypeStyleAccess().getNumericTypeTextFieldStyleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumericTypeTextFieldStyle_0=ruleNumericTypeTextFieldStyle();

                    state._fsp--;


                    			current = this_NumericTypeTextFieldStyle_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQLS.g:270:3: this_NumericTypeSpinnerStyle_1= ruleNumericTypeSpinnerStyle
                    {

                    			newCompositeNode(grammarAccess.getNumericTypeStyleAccess().getNumericTypeSpinnerStyleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumericTypeSpinnerStyle_1=ruleNumericTypeSpinnerStyle();

                    state._fsp--;


                    			current = this_NumericTypeSpinnerStyle_1;
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
    // $ANTLR end "ruleNumericTypeStyle"


    // $ANTLR start "entryRuleQuestionStyle"
    // InternalQLS.g:282:1: entryRuleQuestionStyle returns [EObject current=null] : iv_ruleQuestionStyle= ruleQuestionStyle EOF ;
    public final EObject entryRuleQuestionStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionStyle = null;


        try {
            // InternalQLS.g:282:54: (iv_ruleQuestionStyle= ruleQuestionStyle EOF )
            // InternalQLS.g:283:2: iv_ruleQuestionStyle= ruleQuestionStyle EOF
            {
             newCompositeNode(grammarAccess.getQuestionStyleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuestionStyle=ruleQuestionStyle();

            state._fsp--;

             current =iv_ruleQuestionStyle; 
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
    // $ANTLR end "entryRuleQuestionStyle"


    // $ANTLR start "ruleQuestionStyle"
    // InternalQLS.g:289:1: ruleQuestionStyle returns [EObject current=null] : (otherlv_0= 'styledQuestion' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'labelStyle' ( (lv_labelStyle_4_0= ruleLabelStyle ) ) )? (otherlv_5= 'typeStyle' ( (lv_typeStyle_6_0= ruleTypeStyle ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleQuestionStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_labelStyle_4_0 = null;

        EObject lv_typeStyle_6_0 = null;



        	enterRule();

        try {
            // InternalQLS.g:295:2: ( (otherlv_0= 'styledQuestion' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'labelStyle' ( (lv_labelStyle_4_0= ruleLabelStyle ) ) )? (otherlv_5= 'typeStyle' ( (lv_typeStyle_6_0= ruleTypeStyle ) ) )? otherlv_7= '}' ) )
            // InternalQLS.g:296:2: (otherlv_0= 'styledQuestion' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'labelStyle' ( (lv_labelStyle_4_0= ruleLabelStyle ) ) )? (otherlv_5= 'typeStyle' ( (lv_typeStyle_6_0= ruleTypeStyle ) ) )? otherlv_7= '}' )
            {
            // InternalQLS.g:296:2: (otherlv_0= 'styledQuestion' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'labelStyle' ( (lv_labelStyle_4_0= ruleLabelStyle ) ) )? (otherlv_5= 'typeStyle' ( (lv_typeStyle_6_0= ruleTypeStyle ) ) )? otherlv_7= '}' )
            // InternalQLS.g:297:3: otherlv_0= 'styledQuestion' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'labelStyle' ( (lv_labelStyle_4_0= ruleLabelStyle ) ) )? (otherlv_5= 'typeStyle' ( (lv_typeStyle_6_0= ruleTypeStyle ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getQuestionStyleAccess().getStyledQuestionKeyword_0());
            		
            // InternalQLS.g:301:3: ( (otherlv_1= RULE_ID ) )
            // InternalQLS.g:302:4: (otherlv_1= RULE_ID )
            {
            // InternalQLS.g:302:4: (otherlv_1= RULE_ID )
            // InternalQLS.g:303:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuestionStyleRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_1, grammarAccess.getQuestionStyleAccess().getStyledQuestionQuestionDefinitionCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getQuestionStyleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQLS.g:318:3: (otherlv_3= 'labelStyle' ( (lv_labelStyle_4_0= ruleLabelStyle ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalQLS.g:319:4: otherlv_3= 'labelStyle' ( (lv_labelStyle_4_0= ruleLabelStyle ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getQuestionStyleAccess().getLabelStyleKeyword_3_0());
                    			
                    // InternalQLS.g:323:4: ( (lv_labelStyle_4_0= ruleLabelStyle ) )
                    // InternalQLS.g:324:5: (lv_labelStyle_4_0= ruleLabelStyle )
                    {
                    // InternalQLS.g:324:5: (lv_labelStyle_4_0= ruleLabelStyle )
                    // InternalQLS.g:325:6: lv_labelStyle_4_0= ruleLabelStyle
                    {

                    						newCompositeNode(grammarAccess.getQuestionStyleAccess().getLabelStyleLabelStyleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_labelStyle_4_0=ruleLabelStyle();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuestionStyleRule());
                    						}
                    						set(
                    							current,
                    							"labelStyle",
                    							lv_labelStyle_4_0,
                    							"org.gemoc.qls.QLS.LabelStyle");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQLS.g:343:3: (otherlv_5= 'typeStyle' ( (lv_typeStyle_6_0= ruleTypeStyle ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalQLS.g:344:4: otherlv_5= 'typeStyle' ( (lv_typeStyle_6_0= ruleTypeStyle ) )
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getQuestionStyleAccess().getTypeStyleKeyword_4_0());
                    			
                    // InternalQLS.g:348:4: ( (lv_typeStyle_6_0= ruleTypeStyle ) )
                    // InternalQLS.g:349:5: (lv_typeStyle_6_0= ruleTypeStyle )
                    {
                    // InternalQLS.g:349:5: (lv_typeStyle_6_0= ruleTypeStyle )
                    // InternalQLS.g:350:6: lv_typeStyle_6_0= ruleTypeStyle
                    {

                    						newCompositeNode(grammarAccess.getQuestionStyleAccess().getTypeStyleTypeStyleParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_typeStyle_6_0=ruleTypeStyle();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuestionStyleRule());
                    						}
                    						set(
                    							current,
                    							"typeStyle",
                    							lv_typeStyle_6_0,
                    							"org.gemoc.qls.QLS.TypeStyle");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getQuestionStyleAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleQuestionStyle"


    // $ANTLR start "entryRuleLabelStyle"
    // InternalQLS.g:376:1: entryRuleLabelStyle returns [EObject current=null] : iv_ruleLabelStyle= ruleLabelStyle EOF ;
    public final EObject entryRuleLabelStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelStyle = null;


        try {
            // InternalQLS.g:376:51: (iv_ruleLabelStyle= ruleLabelStyle EOF )
            // InternalQLS.g:377:2: iv_ruleLabelStyle= ruleLabelStyle EOF
            {
             newCompositeNode(grammarAccess.getLabelStyleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabelStyle=ruleLabelStyle();

            state._fsp--;

             current =iv_ruleLabelStyle; 
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
    // $ANTLR end "entryRuleLabelStyle"


    // $ANTLR start "ruleLabelStyle"
    // InternalQLS.g:383:1: ruleLabelStyle returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_italic_2_0= 'italic' ) )? ( (lv_bold_3_0= 'bold' ) )? otherlv_4= '}' ) ;
    public final EObject ruleLabelStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_italic_2_0=null;
        Token lv_bold_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalQLS.g:389:2: ( ( () otherlv_1= '{' ( (lv_italic_2_0= 'italic' ) )? ( (lv_bold_3_0= 'bold' ) )? otherlv_4= '}' ) )
            // InternalQLS.g:390:2: ( () otherlv_1= '{' ( (lv_italic_2_0= 'italic' ) )? ( (lv_bold_3_0= 'bold' ) )? otherlv_4= '}' )
            {
            // InternalQLS.g:390:2: ( () otherlv_1= '{' ( (lv_italic_2_0= 'italic' ) )? ( (lv_bold_3_0= 'bold' ) )? otherlv_4= '}' )
            // InternalQLS.g:391:3: () otherlv_1= '{' ( (lv_italic_2_0= 'italic' ) )? ( (lv_bold_3_0= 'bold' ) )? otherlv_4= '}'
            {
            // InternalQLS.g:391:3: ()
            // InternalQLS.g:392:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLabelStyleAccess().getLabelStyleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getLabelStyleAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalQLS.g:402:3: ( (lv_italic_2_0= 'italic' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalQLS.g:403:4: (lv_italic_2_0= 'italic' )
                    {
                    // InternalQLS.g:403:4: (lv_italic_2_0= 'italic' )
                    // InternalQLS.g:404:5: lv_italic_2_0= 'italic'
                    {
                    lv_italic_2_0=(Token)match(input,19,FOLLOW_14); 

                    					newLeafNode(lv_italic_2_0, grammarAccess.getLabelStyleAccess().getItalicItalicKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLabelStyleRule());
                    					}
                    					setWithLastConsumed(current, "italic", lv_italic_2_0 != null, "italic");
                    				

                    }


                    }
                    break;

            }

            // InternalQLS.g:416:3: ( (lv_bold_3_0= 'bold' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalQLS.g:417:4: (lv_bold_3_0= 'bold' )
                    {
                    // InternalQLS.g:417:4: (lv_bold_3_0= 'bold' )
                    // InternalQLS.g:418:5: lv_bold_3_0= 'bold'
                    {
                    lv_bold_3_0=(Token)match(input,20,FOLLOW_7); 

                    					newLeafNode(lv_bold_3_0, grammarAccess.getLabelStyleAccess().getBoldBoldKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLabelStyleRule());
                    					}
                    					setWithLastConsumed(current, "bold", lv_bold_3_0 != null, "bold");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLabelStyleAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleLabelStyle"


    // $ANTLR start "entryRuleBooleanTypeStyle"
    // InternalQLS.g:438:1: entryRuleBooleanTypeStyle returns [EObject current=null] : iv_ruleBooleanTypeStyle= ruleBooleanTypeStyle EOF ;
    public final EObject entryRuleBooleanTypeStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanTypeStyle = null;


        try {
            // InternalQLS.g:438:57: (iv_ruleBooleanTypeStyle= ruleBooleanTypeStyle EOF )
            // InternalQLS.g:439:2: iv_ruleBooleanTypeStyle= ruleBooleanTypeStyle EOF
            {
             newCompositeNode(grammarAccess.getBooleanTypeStyleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanTypeStyle=ruleBooleanTypeStyle();

            state._fsp--;

             current =iv_ruleBooleanTypeStyle; 
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
    // $ANTLR end "entryRuleBooleanTypeStyle"


    // $ANTLR start "ruleBooleanTypeStyle"
    // InternalQLS.g:445:1: ruleBooleanTypeStyle returns [EObject current=null] : (otherlv_0= 'BooleanStyle' otherlv_1= '{' ( (lv_booleanStyleKind_2_0= ruleBooleanStyleKind ) ) otherlv_3= '}' ) ;
    public final EObject ruleBooleanTypeStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_booleanStyleKind_2_0 = null;



        	enterRule();

        try {
            // InternalQLS.g:451:2: ( (otherlv_0= 'BooleanStyle' otherlv_1= '{' ( (lv_booleanStyleKind_2_0= ruleBooleanStyleKind ) ) otherlv_3= '}' ) )
            // InternalQLS.g:452:2: (otherlv_0= 'BooleanStyle' otherlv_1= '{' ( (lv_booleanStyleKind_2_0= ruleBooleanStyleKind ) ) otherlv_3= '}' )
            {
            // InternalQLS.g:452:2: (otherlv_0= 'BooleanStyle' otherlv_1= '{' ( (lv_booleanStyleKind_2_0= ruleBooleanStyleKind ) ) otherlv_3= '}' )
            // InternalQLS.g:453:3: otherlv_0= 'BooleanStyle' otherlv_1= '{' ( (lv_booleanStyleKind_2_0= ruleBooleanStyleKind ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBooleanTypeStyleAccess().getBooleanStyleKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getBooleanTypeStyleAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalQLS.g:461:3: ( (lv_booleanStyleKind_2_0= ruleBooleanStyleKind ) )
            // InternalQLS.g:462:4: (lv_booleanStyleKind_2_0= ruleBooleanStyleKind )
            {
            // InternalQLS.g:462:4: (lv_booleanStyleKind_2_0= ruleBooleanStyleKind )
            // InternalQLS.g:463:5: lv_booleanStyleKind_2_0= ruleBooleanStyleKind
            {

            					newCompositeNode(grammarAccess.getBooleanTypeStyleAccess().getBooleanStyleKindBooleanStyleKindEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_booleanStyleKind_2_0=ruleBooleanStyleKind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanTypeStyleRule());
            					}
            					set(
            						current,
            						"booleanStyleKind",
            						lv_booleanStyleKind_2_0,
            						"org.gemoc.qls.QLS.BooleanStyleKind");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getBooleanTypeStyleAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleBooleanTypeStyle"


    // $ANTLR start "entryRuleNumericTypeTextFieldStyle"
    // InternalQLS.g:488:1: entryRuleNumericTypeTextFieldStyle returns [EObject current=null] : iv_ruleNumericTypeTextFieldStyle= ruleNumericTypeTextFieldStyle EOF ;
    public final EObject entryRuleNumericTypeTextFieldStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericTypeTextFieldStyle = null;


        try {
            // InternalQLS.g:488:66: (iv_ruleNumericTypeTextFieldStyle= ruleNumericTypeTextFieldStyle EOF )
            // InternalQLS.g:489:2: iv_ruleNumericTypeTextFieldStyle= ruleNumericTypeTextFieldStyle EOF
            {
             newCompositeNode(grammarAccess.getNumericTypeTextFieldStyleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumericTypeTextFieldStyle=ruleNumericTypeTextFieldStyle();

            state._fsp--;

             current =iv_ruleNumericTypeTextFieldStyle; 
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
    // $ANTLR end "entryRuleNumericTypeTextFieldStyle"


    // $ANTLR start "ruleNumericTypeTextFieldStyle"
    // InternalQLS.g:495:1: ruleNumericTypeTextFieldStyle returns [EObject current=null] : ( () otherlv_1= 'NumericStyle' otherlv_2= 'textField' otherlv_3= '{' (otherlv_4= 'step' ( (lv_step_5_0= ruleEDouble ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleNumericTypeTextFieldStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_step_5_0 = null;



        	enterRule();

        try {
            // InternalQLS.g:501:2: ( ( () otherlv_1= 'NumericStyle' otherlv_2= 'textField' otherlv_3= '{' (otherlv_4= 'step' ( (lv_step_5_0= ruleEDouble ) ) )? otherlv_6= '}' ) )
            // InternalQLS.g:502:2: ( () otherlv_1= 'NumericStyle' otherlv_2= 'textField' otherlv_3= '{' (otherlv_4= 'step' ( (lv_step_5_0= ruleEDouble ) ) )? otherlv_6= '}' )
            {
            // InternalQLS.g:502:2: ( () otherlv_1= 'NumericStyle' otherlv_2= 'textField' otherlv_3= '{' (otherlv_4= 'step' ( (lv_step_5_0= ruleEDouble ) ) )? otherlv_6= '}' )
            // InternalQLS.g:503:3: () otherlv_1= 'NumericStyle' otherlv_2= 'textField' otherlv_3= '{' (otherlv_4= 'step' ( (lv_step_5_0= ruleEDouble ) ) )? otherlv_6= '}'
            {
            // InternalQLS.g:503:3: ()
            // InternalQLS.g:504:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNumericTypeTextFieldStyleAccess().getNumericTypeTextFieldStyleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getNumericTypeTextFieldStyleAccess().getNumericStyleKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getNumericTypeTextFieldStyleAccess().getTextFieldKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getNumericTypeTextFieldStyleAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQLS.g:522:3: (otherlv_4= 'step' ( (lv_step_5_0= ruleEDouble ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalQLS.g:523:4: otherlv_4= 'step' ( (lv_step_5_0= ruleEDouble ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getNumericTypeTextFieldStyleAccess().getStepKeyword_4_0());
                    			
                    // InternalQLS.g:527:4: ( (lv_step_5_0= ruleEDouble ) )
                    // InternalQLS.g:528:5: (lv_step_5_0= ruleEDouble )
                    {
                    // InternalQLS.g:528:5: (lv_step_5_0= ruleEDouble )
                    // InternalQLS.g:529:6: lv_step_5_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getNumericTypeTextFieldStyleAccess().getStepEDoubleParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_step_5_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNumericTypeTextFieldStyleRule());
                    						}
                    						set(
                    							current,
                    							"step",
                    							lv_step_5_0,
                    							"org.gemoc.ql.QL.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getNumericTypeTextFieldStyleAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleNumericTypeTextFieldStyle"


    // $ANTLR start "entryRuleNumericTypeSpinnerStyle"
    // InternalQLS.g:555:1: entryRuleNumericTypeSpinnerStyle returns [EObject current=null] : iv_ruleNumericTypeSpinnerStyle= ruleNumericTypeSpinnerStyle EOF ;
    public final EObject entryRuleNumericTypeSpinnerStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericTypeSpinnerStyle = null;


        try {
            // InternalQLS.g:555:64: (iv_ruleNumericTypeSpinnerStyle= ruleNumericTypeSpinnerStyle EOF )
            // InternalQLS.g:556:2: iv_ruleNumericTypeSpinnerStyle= ruleNumericTypeSpinnerStyle EOF
            {
             newCompositeNode(grammarAccess.getNumericTypeSpinnerStyleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumericTypeSpinnerStyle=ruleNumericTypeSpinnerStyle();

            state._fsp--;

             current =iv_ruleNumericTypeSpinnerStyle; 
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
    // $ANTLR end "entryRuleNumericTypeSpinnerStyle"


    // $ANTLR start "ruleNumericTypeSpinnerStyle"
    // InternalQLS.g:562:1: ruleNumericTypeSpinnerStyle returns [EObject current=null] : ( () otherlv_1= 'NumericStyle' otherlv_2= 'spinner' otherlv_3= '{' otherlv_4= '}' ) ;
    public final EObject ruleNumericTypeSpinnerStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalQLS.g:568:2: ( ( () otherlv_1= 'NumericStyle' otherlv_2= 'spinner' otherlv_3= '{' otherlv_4= '}' ) )
            // InternalQLS.g:569:2: ( () otherlv_1= 'NumericStyle' otherlv_2= 'spinner' otherlv_3= '{' otherlv_4= '}' )
            {
            // InternalQLS.g:569:2: ( () otherlv_1= 'NumericStyle' otherlv_2= 'spinner' otherlv_3= '{' otherlv_4= '}' )
            // InternalQLS.g:570:3: () otherlv_1= 'NumericStyle' otherlv_2= 'spinner' otherlv_3= '{' otherlv_4= '}'
            {
            // InternalQLS.g:570:3: ()
            // InternalQLS.g:571:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNumericTypeSpinnerStyleAccess().getNumericSpinnerStyleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getNumericTypeSpinnerStyleAccess().getNumericStyleKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getNumericTypeSpinnerStyleAccess().getSpinnerKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getNumericTypeSpinnerStyleAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getNumericTypeSpinnerStyleAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleNumericTypeSpinnerStyle"


    // $ANTLR start "entryRuleTextTypeStyle"
    // InternalQLS.g:597:1: entryRuleTextTypeStyle returns [EObject current=null] : iv_ruleTextTypeStyle= ruleTextTypeStyle EOF ;
    public final EObject entryRuleTextTypeStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextTypeStyle = null;


        try {
            // InternalQLS.g:597:54: (iv_ruleTextTypeStyle= ruleTextTypeStyle EOF )
            // InternalQLS.g:598:2: iv_ruleTextTypeStyle= ruleTextTypeStyle EOF
            {
             newCompositeNode(grammarAccess.getTextTypeStyleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextTypeStyle=ruleTextTypeStyle();

            state._fsp--;

             current =iv_ruleTextTypeStyle; 
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
    // $ANTLR end "entryRuleTextTypeStyle"


    // $ANTLR start "ruleTextTypeStyle"
    // InternalQLS.g:604:1: ruleTextTypeStyle returns [EObject current=null] : ( () otherlv_1= 'TextStyle' otherlv_2= '{' ( (lv_multiline_3_0= 'multiline' ) )? otherlv_4= '}' ) ;
    public final EObject ruleTextTypeStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_multiline_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalQLS.g:610:2: ( ( () otherlv_1= 'TextStyle' otherlv_2= '{' ( (lv_multiline_3_0= 'multiline' ) )? otherlv_4= '}' ) )
            // InternalQLS.g:611:2: ( () otherlv_1= 'TextStyle' otherlv_2= '{' ( (lv_multiline_3_0= 'multiline' ) )? otherlv_4= '}' )
            {
            // InternalQLS.g:611:2: ( () otherlv_1= 'TextStyle' otherlv_2= '{' ( (lv_multiline_3_0= 'multiline' ) )? otherlv_4= '}' )
            // InternalQLS.g:612:3: () otherlv_1= 'TextStyle' otherlv_2= '{' ( (lv_multiline_3_0= 'multiline' ) )? otherlv_4= '}'
            {
            // InternalQLS.g:612:3: ()
            // InternalQLS.g:613:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTextTypeStyleAccess().getTextTypeStyleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTextTypeStyleAccess().getTextStyleKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getTextTypeStyleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQLS.g:627:3: ( (lv_multiline_3_0= 'multiline' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalQLS.g:628:4: (lv_multiline_3_0= 'multiline' )
                    {
                    // InternalQLS.g:628:4: (lv_multiline_3_0= 'multiline' )
                    // InternalQLS.g:629:5: lv_multiline_3_0= 'multiline'
                    {
                    lv_multiline_3_0=(Token)match(input,27,FOLLOW_7); 

                    					newLeafNode(lv_multiline_3_0, grammarAccess.getTextTypeStyleAccess().getMultilineMultilineKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTextTypeStyleRule());
                    					}
                    					setWithLastConsumed(current, "multiline", lv_multiline_3_0 != null, "multiline");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTextTypeStyleAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleTextTypeStyle"


    // $ANTLR start "entryRuleValueType"
    // InternalQLS.g:649:1: entryRuleValueType returns [EObject current=null] : iv_ruleValueType= ruleValueType EOF ;
    public final EObject entryRuleValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueType = null;


        try {
            // InternalQLS.g:649:50: (iv_ruleValueType= ruleValueType EOF )
            // InternalQLS.g:650:2: iv_ruleValueType= ruleValueType EOF
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
    // InternalQLS.g:656:1: ruleValueType returns [EObject current=null] : (this_ValueType_Impl_0= ruleValueType_Impl | this_BooleanValueType_1= ruleBooleanValueType | this_IntegerValueType_2= ruleIntegerValueType | this_DecimalValueType_3= ruleDecimalValueType | this_DateValueType_4= ruleDateValueType | this_EnumerationValueType_5= ruleEnumerationValueType | this_StringValueType_6= ruleStringValueType ) ;
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
            // InternalQLS.g:662:2: ( (this_ValueType_Impl_0= ruleValueType_Impl | this_BooleanValueType_1= ruleBooleanValueType | this_IntegerValueType_2= ruleIntegerValueType | this_DecimalValueType_3= ruleDecimalValueType | this_DateValueType_4= ruleDateValueType | this_EnumerationValueType_5= ruleEnumerationValueType | this_StringValueType_6= ruleStringValueType ) )
            // InternalQLS.g:663:2: (this_ValueType_Impl_0= ruleValueType_Impl | this_BooleanValueType_1= ruleBooleanValueType | this_IntegerValueType_2= ruleIntegerValueType | this_DecimalValueType_3= ruleDecimalValueType | this_DateValueType_4= ruleDateValueType | this_EnumerationValueType_5= ruleEnumerationValueType | this_StringValueType_6= ruleStringValueType )
            {
            // InternalQLS.g:663:2: (this_ValueType_Impl_0= ruleValueType_Impl | this_BooleanValueType_1= ruleBooleanValueType | this_IntegerValueType_2= ruleIntegerValueType | this_DecimalValueType_3= ruleDecimalValueType | this_DateValueType_4= ruleDateValueType | this_EnumerationValueType_5= ruleEnumerationValueType | this_StringValueType_6= ruleStringValueType )
            int alt11=7;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt11=1;
                }
                break;
            case 41:
                {
                alt11=2;
                }
                break;
            case 42:
                {
                alt11=3;
                }
                break;
            case 45:
                {
                alt11=4;
                }
                break;
            case 46:
                {
                alt11=5;
                }
                break;
            case 47:
                {
                alt11=6;
                }
                break;
            case 50:
                {
                alt11=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalQLS.g:664:3: this_ValueType_Impl_0= ruleValueType_Impl
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
                    // InternalQLS.g:673:3: this_BooleanValueType_1= ruleBooleanValueType
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
                    // InternalQLS.g:682:3: this_IntegerValueType_2= ruleIntegerValueType
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
                    // InternalQLS.g:691:3: this_DecimalValueType_3= ruleDecimalValueType
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
                    // InternalQLS.g:700:3: this_DateValueType_4= ruleDateValueType
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
                    // InternalQLS.g:709:3: this_EnumerationValueType_5= ruleEnumerationValueType
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
                    // InternalQLS.g:718:3: this_StringValueType_6= ruleStringValueType
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
    // InternalQLS.g:730:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalQLS.g:730:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalQLS.g:731:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalQLS.g:737:1: ruleExpression returns [EObject current=null] : this_UnaryOrPrimaryExpression_0= ruleUnaryOrPrimaryExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryOrPrimaryExpression_0 = null;



        	enterRule();

        try {
            // InternalQLS.g:743:2: (this_UnaryOrPrimaryExpression_0= ruleUnaryOrPrimaryExpression )
            // InternalQLS.g:744:2: this_UnaryOrPrimaryExpression_0= ruleUnaryOrPrimaryExpression
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
    // InternalQLS.g:755:1: entryRuleUnaryOrPrimaryExpression returns [EObject current=null] : iv_ruleUnaryOrPrimaryExpression= ruleUnaryOrPrimaryExpression EOF ;
    public final EObject entryRuleUnaryOrPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOrPrimaryExpression = null;


        try {
            // InternalQLS.g:755:65: (iv_ruleUnaryOrPrimaryExpression= ruleUnaryOrPrimaryExpression EOF )
            // InternalQLS.g:756:2: iv_ruleUnaryOrPrimaryExpression= ruleUnaryOrPrimaryExpression EOF
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
    // InternalQLS.g:762:1: ruleUnaryOrPrimaryExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression | this_UnaryExpression_1= ruleUnaryExpression ) ;
    public final EObject ruleUnaryOrPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        EObject this_UnaryExpression_1 = null;



        	enterRule();

        try {
            // InternalQLS.g:768:2: ( (this_PrimaryExpression_0= rulePrimaryExpression | this_UnaryExpression_1= ruleUnaryExpression ) )
            // InternalQLS.g:769:2: (this_PrimaryExpression_0= rulePrimaryExpression | this_UnaryExpression_1= ruleUnaryExpression )
            {
            // InternalQLS.g:769:2: (this_PrimaryExpression_0= rulePrimaryExpression | this_UnaryExpression_1= ruleUnaryExpression )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_INT)||LA12_0==28||LA12_0==30||(LA12_0>=36 && LA12_0<=37)||LA12_0==53) ) {
                alt12=1;
            }
            else if ( (LA12_0==56||LA12_0==79) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalQLS.g:770:3: this_PrimaryExpression_0= rulePrimaryExpression
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
                    // InternalQLS.g:779:3: this_UnaryExpression_1= ruleUnaryExpression
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
    // InternalQLS.g:791:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalQLS.g:791:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalQLS.g:792:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalQLS.g:798:1: ruleUnaryExpression returns [EObject current=null] : ( () ( (lv_operator_1_0= ruleUnaryOperatorKind ) ) ( (lv_operand_2_0= ruleUnaryOrPrimaryExpression ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_operand_2_0 = null;



        	enterRule();

        try {
            // InternalQLS.g:804:2: ( ( () ( (lv_operator_1_0= ruleUnaryOperatorKind ) ) ( (lv_operand_2_0= ruleUnaryOrPrimaryExpression ) ) ) )
            // InternalQLS.g:805:2: ( () ( (lv_operator_1_0= ruleUnaryOperatorKind ) ) ( (lv_operand_2_0= ruleUnaryOrPrimaryExpression ) ) )
            {
            // InternalQLS.g:805:2: ( () ( (lv_operator_1_0= ruleUnaryOperatorKind ) ) ( (lv_operand_2_0= ruleUnaryOrPrimaryExpression ) ) )
            // InternalQLS.g:806:3: () ( (lv_operator_1_0= ruleUnaryOperatorKind ) ) ( (lv_operand_2_0= ruleUnaryOrPrimaryExpression ) )
            {
            // InternalQLS.g:806:3: ()
            // InternalQLS.g:807:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUnaryExpressionAccess().getBasicUnaryExpressionAction_0(),
            					current);
            			

            }

            // InternalQLS.g:813:3: ( (lv_operator_1_0= ruleUnaryOperatorKind ) )
            // InternalQLS.g:814:4: (lv_operator_1_0= ruleUnaryOperatorKind )
            {
            // InternalQLS.g:814:4: (lv_operator_1_0= ruleUnaryOperatorKind )
            // InternalQLS.g:815:5: lv_operator_1_0= ruleUnaryOperatorKind
            {

            					newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorKindEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
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

            // InternalQLS.g:832:3: ( (lv_operand_2_0= ruleUnaryOrPrimaryExpression ) )
            // InternalQLS.g:833:4: (lv_operand_2_0= ruleUnaryOrPrimaryExpression )
            {
            // InternalQLS.g:833:4: (lv_operand_2_0= ruleUnaryOrPrimaryExpression )
            // InternalQLS.g:834:5: lv_operand_2_0= ruleUnaryOrPrimaryExpression
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
    // InternalQLS.g:855:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalQLS.g:855:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalQLS.g:856:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalQLS.g:862:1: rulePrimaryExpression returns [EObject current=null] : (this_Call_0= ruleCall | this_IfExpression_1= ruleIfExpression | (otherlv_2= '(' (this_OrExpression_3= ruleOrExpression | this_UnaryExpression_4= ruleUnaryExpression ) otherlv_5= ')' ) ) ;
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
            // InternalQLS.g:868:2: ( (this_Call_0= ruleCall | this_IfExpression_1= ruleIfExpression | (otherlv_2= '(' (this_OrExpression_3= ruleOrExpression | this_UnaryExpression_4= ruleUnaryExpression ) otherlv_5= ')' ) ) )
            // InternalQLS.g:869:2: (this_Call_0= ruleCall | this_IfExpression_1= ruleIfExpression | (otherlv_2= '(' (this_OrExpression_3= ruleOrExpression | this_UnaryExpression_4= ruleUnaryExpression ) otherlv_5= ')' ) )
            {
            // InternalQLS.g:869:2: (this_Call_0= ruleCall | this_IfExpression_1= ruleIfExpression | (otherlv_2= '(' (this_OrExpression_3= ruleOrExpression | this_UnaryExpression_4= ruleUnaryExpression ) otherlv_5= ')' ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
            case RULE_INT:
            case 36:
            case 37:
            case 53:
                {
                alt14=1;
                }
                break;
            case 30:
                {
                alt14=2;
                }
                break;
            case 28:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalQLS.g:870:3: this_Call_0= ruleCall
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
                    // InternalQLS.g:879:3: this_IfExpression_1= ruleIfExpression
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
                    // InternalQLS.g:888:3: (otherlv_2= '(' (this_OrExpression_3= ruleOrExpression | this_UnaryExpression_4= ruleUnaryExpression ) otherlv_5= ')' )
                    {
                    // InternalQLS.g:888:3: (otherlv_2= '(' (this_OrExpression_3= ruleOrExpression | this_UnaryExpression_4= ruleUnaryExpression ) otherlv_5= ')' )
                    // InternalQLS.g:889:4: otherlv_2= '(' (this_OrExpression_3= ruleOrExpression | this_UnaryExpression_4= ruleUnaryExpression ) otherlv_5= ')'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_21); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalQLS.g:893:4: (this_OrExpression_3= ruleOrExpression | this_UnaryExpression_4= ruleUnaryExpression )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_INT)||LA13_0==28||LA13_0==30||(LA13_0>=36 && LA13_0<=37)||LA13_0==53) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==56||LA13_0==79) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalQLS.g:894:5: this_OrExpression_3= ruleOrExpression
                            {

                            					newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOrExpressionParserRuleCall_2_1_0());
                            				
                            pushFollow(FOLLOW_22);
                            this_OrExpression_3=ruleOrExpression();

                            state._fsp--;


                            					current = this_OrExpression_3;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 2 :
                            // InternalQLS.g:903:5: this_UnaryExpression_4= ruleUnaryExpression
                            {

                            					newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getUnaryExpressionParserRuleCall_2_1_1());
                            				
                            pushFollow(FOLLOW_22);
                            this_UnaryExpression_4=ruleUnaryExpression();

                            state._fsp--;


                            					current = this_UnaryExpression_4;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,29,FOLLOW_2); 

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
    // InternalQLS.g:921:1: entryRuleIfExpression returns [EObject current=null] : iv_ruleIfExpression= ruleIfExpression EOF ;
    public final EObject entryRuleIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpression = null;


        try {
            // InternalQLS.g:921:53: (iv_ruleIfExpression= ruleIfExpression EOF )
            // InternalQLS.g:922:2: iv_ruleIfExpression= ruleIfExpression EOF
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
    // InternalQLS.g:928:1: ruleIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleExpression ) ) (otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleExpression ) ) )? otherlv_7= 'endif' ) ;
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
            // InternalQLS.g:934:2: ( ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleExpression ) ) (otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleExpression ) ) )? otherlv_7= 'endif' ) )
            // InternalQLS.g:935:2: ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleExpression ) ) (otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleExpression ) ) )? otherlv_7= 'endif' )
            {
            // InternalQLS.g:935:2: ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleExpression ) ) (otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleExpression ) ) )? otherlv_7= 'endif' )
            // InternalQLS.g:936:3: () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleExpression ) ) (otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleExpression ) ) )? otherlv_7= 'endif'
            {
            // InternalQLS.g:936:3: ()
            // InternalQLS.g:937:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIfExpressionAccess().getIfExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getIfExpressionAccess().getIfKeyword_1());
            		
            // InternalQLS.g:947:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalQLS.g:948:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalQLS.g:948:4: (lv_condition_2_0= ruleExpression )
            // InternalQLS.g:949:5: lv_condition_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfExpressionAccess().getConditionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
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

            otherlv_3=(Token)match(input,31,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getIfExpressionAccess().getThenKeyword_3());
            		
            // InternalQLS.g:970:3: ( (lv_thenExpression_4_0= ruleExpression ) )
            // InternalQLS.g:971:4: (lv_thenExpression_4_0= ruleExpression )
            {
            // InternalQLS.g:971:4: (lv_thenExpression_4_0= ruleExpression )
            // InternalQLS.g:972:5: lv_thenExpression_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfExpressionAccess().getThenExpressionExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalQLS.g:989:3: (otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleExpression ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalQLS.g:990:4: otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleExpression ) )
                    {
                    otherlv_5=(Token)match(input,32,FOLLOW_21); 

                    				newLeafNode(otherlv_5, grammarAccess.getIfExpressionAccess().getElseKeyword_5_0());
                    			
                    // InternalQLS.g:994:4: ( (lv_elseExpression_6_0= ruleExpression ) )
                    // InternalQLS.g:995:5: (lv_elseExpression_6_0= ruleExpression )
                    {
                    // InternalQLS.g:995:5: (lv_elseExpression_6_0= ruleExpression )
                    // InternalQLS.g:996:6: lv_elseExpression_6_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getIfExpressionAccess().getElseExpressionExpressionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_25);
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

            otherlv_7=(Token)match(input,33,FOLLOW_2); 

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
    // InternalQLS.g:1022:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalQLS.g:1022:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalQLS.g:1023:2: iv_ruleOrExpression= ruleOrExpression EOF
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
    // InternalQLS.g:1029:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rhsOperand_3_0 = null;



        	enterRule();

        try {
            // InternalQLS.g:1035:2: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAndExpression ) ) )* ) )
            // InternalQLS.g:1036:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAndExpression ) ) )* )
            {
            // InternalQLS.g:1036:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAndExpression ) ) )* )
            // InternalQLS.g:1037:3: this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current = this_AndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalQLS.g:1045:3: ( () ( (lv_operator_2_0= ruleOrOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAndExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==88) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalQLS.g:1046:4: () ( (lv_operator_2_0= ruleOrOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAndExpression ) )
            	    {
            	    // InternalQLS.g:1046:4: ()
            	    // InternalQLS.g:1047:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalQLS.g:1053:4: ( (lv_operator_2_0= ruleOrOperatorKind ) )
            	    // InternalQLS.g:1054:5: (lv_operator_2_0= ruleOrOperatorKind )
            	    {
            	    // InternalQLS.g:1054:5: (lv_operator_2_0= ruleOrOperatorKind )
            	    // InternalQLS.g:1055:6: lv_operator_2_0= ruleOrOperatorKind
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorKindEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
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

            	    // InternalQLS.g:1072:4: ( (lv_rhsOperand_3_0= ruleAndExpression ) )
            	    // InternalQLS.g:1073:5: (lv_rhsOperand_3_0= ruleAndExpression )
            	    {
            	    // InternalQLS.g:1073:5: (lv_rhsOperand_3_0= ruleAndExpression )
            	    // InternalQLS.g:1074:6: lv_rhsOperand_3_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getRhsOperandAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_26);
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
            	    break loop16;
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
    // InternalQLS.g:1096:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalQLS.g:1096:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalQLS.g:1097:2: iv_ruleAndExpression= ruleAndExpression EOF
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
    // InternalQLS.g:1103:1: ruleAndExpression returns [EObject current=null] : (this_EqualExpression_0= ruleEqualExpression ( () ( (lv_operator_2_0= ruleAndOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleEqualExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EqualExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rhsOperand_3_0 = null;



        	enterRule();

        try {
            // InternalQLS.g:1109:2: ( (this_EqualExpression_0= ruleEqualExpression ( () ( (lv_operator_2_0= ruleAndOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleEqualExpression ) ) )* ) )
            // InternalQLS.g:1110:2: (this_EqualExpression_0= ruleEqualExpression ( () ( (lv_operator_2_0= ruleAndOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleEqualExpression ) ) )* )
            {
            // InternalQLS.g:1110:2: (this_EqualExpression_0= ruleEqualExpression ( () ( (lv_operator_2_0= ruleAndOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleEqualExpression ) ) )* )
            // InternalQLS.g:1111:3: this_EqualExpression_0= ruleEqualExpression ( () ( (lv_operator_2_0= ruleAndOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleEqualExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_EqualExpression_0=ruleEqualExpression();

            state._fsp--;


            			current = this_EqualExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalQLS.g:1119:3: ( () ( (lv_operator_2_0= ruleAndOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleEqualExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==87) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalQLS.g:1120:4: () ( (lv_operator_2_0= ruleAndOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleEqualExpression ) )
            	    {
            	    // InternalQLS.g:1120:4: ()
            	    // InternalQLS.g:1121:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalQLS.g:1127:4: ( (lv_operator_2_0= ruleAndOperatorKind ) )
            	    // InternalQLS.g:1128:5: (lv_operator_2_0= ruleAndOperatorKind )
            	    {
            	    // InternalQLS.g:1128:5: (lv_operator_2_0= ruleAndOperatorKind )
            	    // InternalQLS.g:1129:6: lv_operator_2_0= ruleAndOperatorKind
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorKindEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
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

            	    // InternalQLS.g:1146:4: ( (lv_rhsOperand_3_0= ruleEqualExpression ) )
            	    // InternalQLS.g:1147:5: (lv_rhsOperand_3_0= ruleEqualExpression )
            	    {
            	    // InternalQLS.g:1147:5: (lv_rhsOperand_3_0= ruleEqualExpression )
            	    // InternalQLS.g:1148:6: lv_rhsOperand_3_0= ruleEqualExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getRhsOperandEqualExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_28);
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
            	    break loop17;
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
    // InternalQLS.g:1170:1: entryRuleEqualExpression returns [EObject current=null] : iv_ruleEqualExpression= ruleEqualExpression EOF ;
    public final EObject entryRuleEqualExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualExpression = null;


        try {
            // InternalQLS.g:1170:56: (iv_ruleEqualExpression= ruleEqualExpression EOF )
            // InternalQLS.g:1171:2: iv_ruleEqualExpression= ruleEqualExpression EOF
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
    // InternalQLS.g:1177:1: ruleEqualExpression returns [EObject current=null] : (this_ComparisionExpression_0= ruleComparisionExpression ( () ( (lv_operator_2_0= ruleEqualOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleComparisionExpression ) ) )* ) ;
    public final EObject ruleEqualExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ComparisionExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rhsOperand_3_0 = null;



        	enterRule();

        try {
            // InternalQLS.g:1183:2: ( (this_ComparisionExpression_0= ruleComparisionExpression ( () ( (lv_operator_2_0= ruleEqualOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleComparisionExpression ) ) )* ) )
            // InternalQLS.g:1184:2: (this_ComparisionExpression_0= ruleComparisionExpression ( () ( (lv_operator_2_0= ruleEqualOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleComparisionExpression ) ) )* )
            {
            // InternalQLS.g:1184:2: (this_ComparisionExpression_0= ruleComparisionExpression ( () ( (lv_operator_2_0= ruleEqualOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleComparisionExpression ) ) )* )
            // InternalQLS.g:1185:3: this_ComparisionExpression_0= ruleComparisionExpression ( () ( (lv_operator_2_0= ruleEqualOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleComparisionExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualExpressionAccess().getComparisionExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_ComparisionExpression_0=ruleComparisionExpression();

            state._fsp--;


            			current = this_ComparisionExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalQLS.g:1193:3: ( () ( (lv_operator_2_0= ruleEqualOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleComparisionExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==62) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalQLS.g:1194:4: () ( (lv_operator_2_0= ruleEqualOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleComparisionExpression ) )
            	    {
            	    // InternalQLS.g:1194:4: ()
            	    // InternalQLS.g:1195:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalQLS.g:1201:4: ( (lv_operator_2_0= ruleEqualOperatorKind ) )
            	    // InternalQLS.g:1202:5: (lv_operator_2_0= ruleEqualOperatorKind )
            	    {
            	    // InternalQLS.g:1202:5: (lv_operator_2_0= ruleEqualOperatorKind )
            	    // InternalQLS.g:1203:6: lv_operator_2_0= ruleEqualOperatorKind
            	    {

            	    						newCompositeNode(grammarAccess.getEqualExpressionAccess().getOperatorEqualOperatorKindEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
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

            	    // InternalQLS.g:1220:4: ( (lv_rhsOperand_3_0= ruleComparisionExpression ) )
            	    // InternalQLS.g:1221:5: (lv_rhsOperand_3_0= ruleComparisionExpression )
            	    {
            	    // InternalQLS.g:1221:5: (lv_rhsOperand_3_0= ruleComparisionExpression )
            	    // InternalQLS.g:1222:6: lv_rhsOperand_3_0= ruleComparisionExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEqualExpressionAccess().getRhsOperandComparisionExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_29);
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
            	    break loop18;
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
    // InternalQLS.g:1244:1: entryRuleComparisionExpression returns [EObject current=null] : iv_ruleComparisionExpression= ruleComparisionExpression EOF ;
    public final EObject entryRuleComparisionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisionExpression = null;


        try {
            // InternalQLS.g:1244:62: (iv_ruleComparisionExpression= ruleComparisionExpression EOF )
            // InternalQLS.g:1245:2: iv_ruleComparisionExpression= ruleComparisionExpression EOF
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
    // InternalQLS.g:1251:1: ruleComparisionExpression returns [EObject current=null] : (this_AdditionExpression_0= ruleAdditionExpression ( () ( (lv_operator_2_0= ruleComparisionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAdditionExpression ) ) )* ) ;
    public final EObject ruleComparisionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditionExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rhsOperand_3_0 = null;



        	enterRule();

        try {
            // InternalQLS.g:1257:2: ( (this_AdditionExpression_0= ruleAdditionExpression ( () ( (lv_operator_2_0= ruleComparisionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAdditionExpression ) ) )* ) )
            // InternalQLS.g:1258:2: (this_AdditionExpression_0= ruleAdditionExpression ( () ( (lv_operator_2_0= ruleComparisionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAdditionExpression ) ) )* )
            {
            // InternalQLS.g:1258:2: (this_AdditionExpression_0= ruleAdditionExpression ( () ( (lv_operator_2_0= ruleComparisionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAdditionExpression ) ) )* )
            // InternalQLS.g:1259:3: this_AdditionExpression_0= ruleAdditionExpression ( () ( (lv_operator_2_0= ruleComparisionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAdditionExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisionExpressionAccess().getAdditionExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_AdditionExpression_0=ruleAdditionExpression();

            state._fsp--;


            			current = this_AdditionExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalQLS.g:1267:3: ( () ( (lv_operator_2_0= ruleComparisionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAdditionExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=83 && LA19_0<=86)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalQLS.g:1268:4: () ( (lv_operator_2_0= ruleComparisionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAdditionExpression ) )
            	    {
            	    // InternalQLS.g:1268:4: ()
            	    // InternalQLS.g:1269:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisionExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalQLS.g:1275:4: ( (lv_operator_2_0= ruleComparisionOperatorKind ) )
            	    // InternalQLS.g:1276:5: (lv_operator_2_0= ruleComparisionOperatorKind )
            	    {
            	    // InternalQLS.g:1276:5: (lv_operator_2_0= ruleComparisionOperatorKind )
            	    // InternalQLS.g:1277:6: lv_operator_2_0= ruleComparisionOperatorKind
            	    {

            	    						newCompositeNode(grammarAccess.getComparisionExpressionAccess().getOperatorComparisionOperatorKindEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
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

            	    // InternalQLS.g:1294:4: ( (lv_rhsOperand_3_0= ruleAdditionExpression ) )
            	    // InternalQLS.g:1295:5: (lv_rhsOperand_3_0= ruleAdditionExpression )
            	    {
            	    // InternalQLS.g:1295:5: (lv_rhsOperand_3_0= ruleAdditionExpression )
            	    // InternalQLS.g:1296:6: lv_rhsOperand_3_0= ruleAdditionExpression
            	    {

            	    						newCompositeNode(grammarAccess.getComparisionExpressionAccess().getRhsOperandAdditionExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_30);
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
            	    break loop19;
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
    // InternalQLS.g:1318:1: entryRuleAdditionExpression returns [EObject current=null] : iv_ruleAdditionExpression= ruleAdditionExpression EOF ;
    public final EObject entryRuleAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionExpression = null;


        try {
            // InternalQLS.g:1318:59: (iv_ruleAdditionExpression= ruleAdditionExpression EOF )
            // InternalQLS.g:1319:2: iv_ruleAdditionExpression= ruleAdditionExpression EOF
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
    // InternalQLS.g:1325:1: ruleAdditionExpression returns [EObject current=null] : (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleMultiplicationExpression ) ) )* ) ;
    public final EObject ruleAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicationExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rhsOperand_3_0 = null;



        	enterRule();

        try {
            // InternalQLS.g:1331:2: ( (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleMultiplicationExpression ) ) )* ) )
            // InternalQLS.g:1332:2: (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleMultiplicationExpression ) ) )* )
            {
            // InternalQLS.g:1332:2: (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleMultiplicationExpression ) ) )* )
            // InternalQLS.g:1333:3: this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleMultiplicationExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditionExpressionAccess().getMultiplicationExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_31);
            this_MultiplicationExpression_0=ruleMultiplicationExpression();

            state._fsp--;


            			current = this_MultiplicationExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalQLS.g:1341:3: ( () ( (lv_operator_2_0= ruleAdditionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleMultiplicationExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==56||LA20_0==80) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalQLS.g:1342:4: () ( (lv_operator_2_0= ruleAdditionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleMultiplicationExpression ) )
            	    {
            	    // InternalQLS.g:1342:4: ()
            	    // InternalQLS.g:1343:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditionExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalQLS.g:1349:4: ( (lv_operator_2_0= ruleAdditionOperatorKind ) )
            	    // InternalQLS.g:1350:5: (lv_operator_2_0= ruleAdditionOperatorKind )
            	    {
            	    // InternalQLS.g:1350:5: (lv_operator_2_0= ruleAdditionOperatorKind )
            	    // InternalQLS.g:1351:6: lv_operator_2_0= ruleAdditionOperatorKind
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionExpressionAccess().getOperatorAdditionOperatorKindEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
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

            	    // InternalQLS.g:1368:4: ( (lv_rhsOperand_3_0= ruleMultiplicationExpression ) )
            	    // InternalQLS.g:1369:5: (lv_rhsOperand_3_0= ruleMultiplicationExpression )
            	    {
            	    // InternalQLS.g:1369:5: (lv_rhsOperand_3_0= ruleMultiplicationExpression )
            	    // InternalQLS.g:1370:6: lv_rhsOperand_3_0= ruleMultiplicationExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionExpressionAccess().getRhsOperandMultiplicationExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_31);
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
            	    break loop20;
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
    // InternalQLS.g:1392:1: entryRuleMultiplicationExpression returns [EObject current=null] : iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF ;
    public final EObject entryRuleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationExpression = null;


        try {
            // InternalQLS.g:1392:65: (iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF )
            // InternalQLS.g:1393:2: iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF
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
    // InternalQLS.g:1399:1: ruleMultiplicationExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_operator_2_0= ruleMultiplicationOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression ) ) )* ) ;
    public final EObject ruleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rhsOperand_3_0 = null;



        	enterRule();

        try {
            // InternalQLS.g:1405:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_operator_2_0= ruleMultiplicationOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression ) ) )* ) )
            // InternalQLS.g:1406:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_operator_2_0= ruleMultiplicationOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression ) ) )* )
            {
            // InternalQLS.g:1406:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_operator_2_0= ruleMultiplicationOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression ) ) )* )
            // InternalQLS.g:1407:3: this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_operator_2_0= ruleMultiplicationOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getPrimaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;


            			current = this_PrimaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalQLS.g:1415:3: ( () ( (lv_operator_2_0= ruleMultiplicationOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=81 && LA21_0<=82)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalQLS.g:1416:4: () ( (lv_operator_2_0= ruleMultiplicationOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression ) )
            	    {
            	    // InternalQLS.g:1416:4: ()
            	    // InternalQLS.g:1417:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicationExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalQLS.g:1423:4: ( (lv_operator_2_0= ruleMultiplicationOperatorKind ) )
            	    // InternalQLS.g:1424:5: (lv_operator_2_0= ruleMultiplicationOperatorKind )
            	    {
            	    // InternalQLS.g:1424:5: (lv_operator_2_0= ruleMultiplicationOperatorKind )
            	    // InternalQLS.g:1425:6: lv_operator_2_0= ruleMultiplicationOperatorKind
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getOperatorMultiplicationOperatorKindEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
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

            	    // InternalQLS.g:1442:4: ( (lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression ) )
            	    // InternalQLS.g:1443:5: (lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression )
            	    {
            	    // InternalQLS.g:1443:5: (lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression )
            	    // InternalQLS.g:1444:6: lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getRhsOperandUnaryOrPrimaryExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_32);
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
            	    break loop21;
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
    // InternalQLS.g:1466:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // InternalQLS.g:1466:45: (iv_ruleCall= ruleCall EOF )
            // InternalQLS.g:1467:2: iv_ruleCall= ruleCall EOF
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
    // InternalQLS.g:1473:1: ruleCall returns [EObject current=null] : (this_ConstantCall_0= ruleConstantCall | this_QuestionCall_1= ruleQuestionCall | this_EnumerationCall_2= ruleEnumerationCall ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

        EObject this_ConstantCall_0 = null;

        EObject this_QuestionCall_1 = null;

        EObject this_EnumerationCall_2 = null;



        	enterRule();

        try {
            // InternalQLS.g:1479:2: ( (this_ConstantCall_0= ruleConstantCall | this_QuestionCall_1= ruleQuestionCall | this_EnumerationCall_2= ruleEnumerationCall ) )
            // InternalQLS.g:1480:2: (this_ConstantCall_0= ruleConstantCall | this_QuestionCall_1= ruleQuestionCall | this_EnumerationCall_2= ruleEnumerationCall )
            {
            // InternalQLS.g:1480:2: (this_ConstantCall_0= ruleConstantCall | this_QuestionCall_1= ruleQuestionCall | this_EnumerationCall_2= ruleEnumerationCall )
            int alt22=3;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalQLS.g:1481:3: this_ConstantCall_0= ruleConstantCall
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
                    // InternalQLS.g:1490:3: this_QuestionCall_1= ruleQuestionCall
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
                    // InternalQLS.g:1499:3: this_EnumerationCall_2= ruleEnumerationCall
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
    // InternalQLS.g:1511:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalQLS.g:1511:46: (iv_ruleValue= ruleValue EOF )
            // InternalQLS.g:1512:2: iv_ruleValue= ruleValue EOF
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
    // InternalQLS.g:1518:1: ruleValue returns [EObject current=null] : (this_IntegerValue_0= ruleIntegerValue | this_StringValue_1= ruleStringValue | this_BooleanValue_2= ruleBooleanValue | this_DateValue_3= ruleDateValue | this_DecimalValue_4= ruleDecimalValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerValue_0 = null;

        EObject this_StringValue_1 = null;

        EObject this_BooleanValue_2 = null;

        EObject this_DateValue_3 = null;

        EObject this_DecimalValue_4 = null;



        	enterRule();

        try {
            // InternalQLS.g:1524:2: ( (this_IntegerValue_0= ruleIntegerValue | this_StringValue_1= ruleStringValue | this_BooleanValue_2= ruleBooleanValue | this_DateValue_3= ruleDateValue | this_DecimalValue_4= ruleDecimalValue ) )
            // InternalQLS.g:1525:2: (this_IntegerValue_0= ruleIntegerValue | this_StringValue_1= ruleStringValue | this_BooleanValue_2= ruleBooleanValue | this_DateValue_3= ruleDateValue | this_DecimalValue_4= ruleDecimalValue )
            {
            // InternalQLS.g:1525:2: (this_IntegerValue_0= ruleIntegerValue | this_StringValue_1= ruleStringValue | this_BooleanValue_2= ruleBooleanValue | this_DateValue_3= ruleDateValue | this_DecimalValue_4= ruleDecimalValue )
            int alt23=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==EOF||LA23_1==29) ) {
                    alt23=1;
                }
                else if ( (LA23_1==53) ) {
                    alt23=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt23=2;
                }
                break;
            case 36:
            case 37:
                {
                alt23=3;
                }
                break;
            case 51:
                {
                alt23=4;
                }
                break;
            case 53:
                {
                alt23=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalQLS.g:1526:3: this_IntegerValue_0= ruleIntegerValue
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
                    // InternalQLS.g:1535:3: this_StringValue_1= ruleStringValue
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
                    // InternalQLS.g:1544:3: this_BooleanValue_2= ruleBooleanValue
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
                    // InternalQLS.g:1553:3: this_DateValue_3= ruleDateValue
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
                    // InternalQLS.g:1562:3: this_DecimalValue_4= ruleDecimalValue
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
    // InternalQLS.g:1574:1: entryRuleForm returns [EObject current=null] : iv_ruleForm= ruleForm EOF ;
    public final EObject entryRuleForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForm = null;


        try {
            // InternalQLS.g:1574:45: (iv_ruleForm= ruleForm EOF )
            // InternalQLS.g:1575:2: iv_ruleForm= ruleForm EOF
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
    // InternalQLS.g:1581:1: ruleForm returns [EObject current=null] : (otherlv_0= 'Form' ( (lv_name_1_0= RULE_ID ) ) ( (lv_questionGroup_2_0= ruleQuestionGroup ) ) ) ;
    public final EObject ruleForm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_questionGroup_2_0 = null;



        	enterRule();

        try {
            // InternalQLS.g:1587:2: ( (otherlv_0= 'Form' ( (lv_name_1_0= RULE_ID ) ) ( (lv_questionGroup_2_0= ruleQuestionGroup ) ) ) )
            // InternalQLS.g:1588:2: (otherlv_0= 'Form' ( (lv_name_1_0= RULE_ID ) ) ( (lv_questionGroup_2_0= ruleQuestionGroup ) ) )
            {
            // InternalQLS.g:1588:2: (otherlv_0= 'Form' ( (lv_name_1_0= RULE_ID ) ) ( (lv_questionGroup_2_0= ruleQuestionGroup ) ) )
            // InternalQLS.g:1589:3: otherlv_0= 'Form' ( (lv_name_1_0= RULE_ID ) ) ( (lv_questionGroup_2_0= ruleQuestionGroup ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getFormAccess().getFormKeyword_0());
            		
            // InternalQLS.g:1593:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalQLS.g:1594:4: (lv_name_1_0= RULE_ID )
            {
            // InternalQLS.g:1594:4: (lv_name_1_0= RULE_ID )
            // InternalQLS.g:1595:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFormAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalQLS.g:1611:3: ( (lv_questionGroup_2_0= ruleQuestionGroup ) )
            // InternalQLS.g:1612:4: (lv_questionGroup_2_0= ruleQuestionGroup )
            {
            // InternalQLS.g:1612:4: (lv_questionGroup_2_0= ruleQuestionGroup )
            // InternalQLS.g:1613:5: lv_questionGroup_2_0= ruleQuestionGroup
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
    // InternalQLS.g:1634:1: entryRuleDefinitionGroup returns [EObject current=null] : iv_ruleDefinitionGroup= ruleDefinitionGroup EOF ;
    public final EObject entryRuleDefinitionGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionGroup = null;


        try {
            // InternalQLS.g:1634:56: (iv_ruleDefinitionGroup= ruleDefinitionGroup EOF )
            // InternalQLS.g:1635:2: iv_ruleDefinitionGroup= ruleDefinitionGroup EOF
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
    // InternalQLS.g:1641:1: ruleDefinitionGroup returns [EObject current=null] : ( () otherlv_1= 'definitions' otherlv_2= '{' ( ( (lv_questionDefinitions_3_0= ruleQuestionDefinition ) ) | ( (lv_dataTypes_4_0= ruleValueType ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleDefinitionGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_questionDefinitions_3_0 = null;

        EObject lv_dataTypes_4_0 = null;



        	enterRule();

        try {
            // InternalQLS.g:1647:2: ( ( () otherlv_1= 'definitions' otherlv_2= '{' ( ( (lv_questionDefinitions_3_0= ruleQuestionDefinition ) ) | ( (lv_dataTypes_4_0= ruleValueType ) ) )* otherlv_5= '}' ) )
            // InternalQLS.g:1648:2: ( () otherlv_1= 'definitions' otherlv_2= '{' ( ( (lv_questionDefinitions_3_0= ruleQuestionDefinition ) ) | ( (lv_dataTypes_4_0= ruleValueType ) ) )* otherlv_5= '}' )
            {
            // InternalQLS.g:1648:2: ( () otherlv_1= 'definitions' otherlv_2= '{' ( ( (lv_questionDefinitions_3_0= ruleQuestionDefinition ) ) | ( (lv_dataTypes_4_0= ruleValueType ) ) )* otherlv_5= '}' )
            // InternalQLS.g:1649:3: () otherlv_1= 'definitions' otherlv_2= '{' ( ( (lv_questionDefinitions_3_0= ruleQuestionDefinition ) ) | ( (lv_dataTypes_4_0= ruleValueType ) ) )* otherlv_5= '}'
            {
            // InternalQLS.g:1649:3: ()
            // InternalQLS.g:1650:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDefinitionGroupAccess().getDefinitionGroupAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDefinitionGroupAccess().getDefinitionsKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getDefinitionGroupAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQLS.g:1664:3: ( ( (lv_questionDefinitions_3_0= ruleQuestionDefinition ) ) | ( (lv_dataTypes_4_0= ruleValueType ) ) )*
            loop24:
            do {
                int alt24=3;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=57 && LA24_0<=58)) ) {
                    alt24=1;
                }
                else if ( (LA24_0==39||(LA24_0>=41 && LA24_0<=42)||(LA24_0>=45 && LA24_0<=47)||LA24_0==50) ) {
                    alt24=2;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalQLS.g:1665:4: ( (lv_questionDefinitions_3_0= ruleQuestionDefinition ) )
            	    {
            	    // InternalQLS.g:1665:4: ( (lv_questionDefinitions_3_0= ruleQuestionDefinition ) )
            	    // InternalQLS.g:1666:5: (lv_questionDefinitions_3_0= ruleQuestionDefinition )
            	    {
            	    // InternalQLS.g:1666:5: (lv_questionDefinitions_3_0= ruleQuestionDefinition )
            	    // InternalQLS.g:1667:6: lv_questionDefinitions_3_0= ruleQuestionDefinition
            	    {

            	    						newCompositeNode(grammarAccess.getDefinitionGroupAccess().getQuestionDefinitionsQuestionDefinitionParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_34);
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
            	    // InternalQLS.g:1685:4: ( (lv_dataTypes_4_0= ruleValueType ) )
            	    {
            	    // InternalQLS.g:1685:4: ( (lv_dataTypes_4_0= ruleValueType ) )
            	    // InternalQLS.g:1686:5: (lv_dataTypes_4_0= ruleValueType )
            	    {
            	    // InternalQLS.g:1686:5: (lv_dataTypes_4_0= ruleValueType )
            	    // InternalQLS.g:1687:6: lv_dataTypes_4_0= ruleValueType
            	    {

            	    						newCompositeNode(grammarAccess.getDefinitionGroupAccess().getDataTypesValueTypeParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_34);
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
            	    break loop24;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEBoolean"
    // InternalQLS.g:1713:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalQLS.g:1713:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalQLS.g:1714:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalQLS.g:1720:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalQLS.g:1726:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalQLS.g:1727:2: (kw= 'true' | kw= 'false' )
            {
            // InternalQLS.g:1727:2: (kw= 'true' | kw= 'false' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==36) ) {
                alt25=1;
            }
            else if ( (LA25_0==37) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalQLS.g:1728:3: kw= 'true'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalQLS.g:1734:3: kw= 'false'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

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
    // InternalQLS.g:1743:1: entryRuleEDate returns [String current=null] : iv_ruleEDate= ruleEDate EOF ;
    public final String entryRuleEDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDate = null;


        try {
            // InternalQLS.g:1743:45: (iv_ruleEDate= ruleEDate EOF )
            // InternalQLS.g:1744:2: iv_ruleEDate= ruleEDate EOF
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
    // InternalQLS.g:1750:1: ruleEDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'EDate' ;
    public final AntlrDatatypeRuleToken ruleEDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalQLS.g:1756:2: (kw= 'EDate' )
            // InternalQLS.g:1757:2: kw= 'EDate'
            {
            kw=(Token)match(input,38,FOLLOW_2); 

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
    // InternalQLS.g:1765:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalQLS.g:1765:47: (iv_ruleEString= ruleEString EOF )
            // InternalQLS.g:1766:2: iv_ruleEString= ruleEString EOF
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
    // InternalQLS.g:1772:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalQLS.g:1778:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalQLS.g:1779:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalQLS.g:1779:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_ID) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalQLS.g:1780:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalQLS.g:1788:3: this_ID_1= RULE_ID
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
    // InternalQLS.g:1799:1: entryRuleQuestionGroup returns [EObject current=null] : iv_ruleQuestionGroup= ruleQuestionGroup EOF ;
    public final EObject entryRuleQuestionGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionGroup = null;


        try {
            // InternalQLS.g:1799:54: (iv_ruleQuestionGroup= ruleQuestionGroup EOF )
            // InternalQLS.g:1800:2: iv_ruleQuestionGroup= ruleQuestionGroup EOF
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
    // InternalQLS.g:1806:1: ruleQuestionGroup returns [EObject current=null] : ( () (otherlv_1= 'if' ( (lv_guard_2_0= ruleExpression ) ) )? otherlv_3= '{' ( ( (lv_questionGroups_4_0= ruleQuestionGroup ) ) | ( (lv_questions_5_0= ruleQuestion ) ) )* otherlv_6= '}' ) ;
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
            // InternalQLS.g:1812:2: ( ( () (otherlv_1= 'if' ( (lv_guard_2_0= ruleExpression ) ) )? otherlv_3= '{' ( ( (lv_questionGroups_4_0= ruleQuestionGroup ) ) | ( (lv_questions_5_0= ruleQuestion ) ) )* otherlv_6= '}' ) )
            // InternalQLS.g:1813:2: ( () (otherlv_1= 'if' ( (lv_guard_2_0= ruleExpression ) ) )? otherlv_3= '{' ( ( (lv_questionGroups_4_0= ruleQuestionGroup ) ) | ( (lv_questions_5_0= ruleQuestion ) ) )* otherlv_6= '}' )
            {
            // InternalQLS.g:1813:2: ( () (otherlv_1= 'if' ( (lv_guard_2_0= ruleExpression ) ) )? otherlv_3= '{' ( ( (lv_questionGroups_4_0= ruleQuestionGroup ) ) | ( (lv_questions_5_0= ruleQuestion ) ) )* otherlv_6= '}' )
            // InternalQLS.g:1814:3: () (otherlv_1= 'if' ( (lv_guard_2_0= ruleExpression ) ) )? otherlv_3= '{' ( ( (lv_questionGroups_4_0= ruleQuestionGroup ) ) | ( (lv_questions_5_0= ruleQuestion ) ) )* otherlv_6= '}'
            {
            // InternalQLS.g:1814:3: ()
            // InternalQLS.g:1815:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQuestionGroupAccess().getQuestionGroupAction_0(),
            					current);
            			

            }

            // InternalQLS.g:1821:3: (otherlv_1= 'if' ( (lv_guard_2_0= ruleExpression ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==30) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalQLS.g:1822:4: otherlv_1= 'if' ( (lv_guard_2_0= ruleExpression ) )
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_21); 

                    				newLeafNode(otherlv_1, grammarAccess.getQuestionGroupAccess().getIfKeyword_1_0());
                    			
                    // InternalQLS.g:1826:4: ( (lv_guard_2_0= ruleExpression ) )
                    // InternalQLS.g:1827:5: (lv_guard_2_0= ruleExpression )
                    {
                    // InternalQLS.g:1827:5: (lv_guard_2_0= ruleExpression )
                    // InternalQLS.g:1828:6: lv_guard_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getQuestionGroupAccess().getGuardExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_4);
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

            otherlv_3=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getQuestionGroupAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQLS.g:1850:3: ( ( (lv_questionGroups_4_0= ruleQuestionGroup ) ) | ( (lv_questions_5_0= ruleQuestion ) ) )*
            loop28:
            do {
                int alt28=3;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==12||LA28_0==30) ) {
                    alt28=1;
                }
                else if ( (LA28_0==RULE_ID) ) {
                    alt28=2;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalQLS.g:1851:4: ( (lv_questionGroups_4_0= ruleQuestionGroup ) )
            	    {
            	    // InternalQLS.g:1851:4: ( (lv_questionGroups_4_0= ruleQuestionGroup ) )
            	    // InternalQLS.g:1852:5: (lv_questionGroups_4_0= ruleQuestionGroup )
            	    {
            	    // InternalQLS.g:1852:5: (lv_questionGroups_4_0= ruleQuestionGroup )
            	    // InternalQLS.g:1853:6: lv_questionGroups_4_0= ruleQuestionGroup
            	    {

            	    						newCompositeNode(grammarAccess.getQuestionGroupAccess().getQuestionGroupsQuestionGroupParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_35);
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
            	    // InternalQLS.g:1871:4: ( (lv_questions_5_0= ruleQuestion ) )
            	    {
            	    // InternalQLS.g:1871:4: ( (lv_questions_5_0= ruleQuestion ) )
            	    // InternalQLS.g:1872:5: (lv_questions_5_0= ruleQuestion )
            	    {
            	    // InternalQLS.g:1872:5: (lv_questions_5_0= ruleQuestion )
            	    // InternalQLS.g:1873:6: lv_questions_5_0= ruleQuestion
            	    {

            	    						newCompositeNode(grammarAccess.getQuestionGroupAccess().getQuestionsQuestionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_35);
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
            	    break loop28;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

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
    // InternalQLS.g:1899:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // InternalQLS.g:1899:49: (iv_ruleQuestion= ruleQuestion EOF )
            // InternalQLS.g:1900:2: iv_ruleQuestion= ruleQuestion EOF
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
    // InternalQLS.g:1906:1: ruleQuestion returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalQLS.g:1912:2: ( ( ( ruleQualifiedName ) ) )
            // InternalQLS.g:1913:2: ( ( ruleQualifiedName ) )
            {
            // InternalQLS.g:1913:2: ( ( ruleQualifiedName ) )
            // InternalQLS.g:1914:3: ( ruleQualifiedName )
            {
            // InternalQLS.g:1914:3: ( ruleQualifiedName )
            // InternalQLS.g:1915:4: ruleQualifiedName
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
    // InternalQLS.g:1932:1: entryRuleValueType_Impl returns [EObject current=null] : iv_ruleValueType_Impl= ruleValueType_Impl EOF ;
    public final EObject entryRuleValueType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueType_Impl = null;


        try {
            // InternalQLS.g:1932:55: (iv_ruleValueType_Impl= ruleValueType_Impl EOF )
            // InternalQLS.g:1933:2: iv_ruleValueType_Impl= ruleValueType_Impl EOF
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
    // InternalQLS.g:1939:1: ruleValueType_Impl returns [EObject current=null] : ( () otherlv_1= 'ValueType' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
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
            // InternalQLS.g:1945:2: ( ( () otherlv_1= 'ValueType' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalQLS.g:1946:2: ( () otherlv_1= 'ValueType' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalQLS.g:1946:2: ( () otherlv_1= 'ValueType' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalQLS.g:1947:3: () otherlv_1= 'ValueType' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalQLS.g:1947:3: ()
            // InternalQLS.g:1948:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getValueType_ImplAccess().getValueTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getValueType_ImplAccess().getValueTypeKeyword_1());
            		
            // InternalQLS.g:1958:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalQLS.g:1959:4: (lv_name_2_0= RULE_ID )
            {
            // InternalQLS.g:1959:4: (lv_name_2_0= RULE_ID )
            // InternalQLS.g:1960:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

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

            otherlv_3=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_3, grammarAccess.getValueType_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQLS.g:1980:3: (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==40) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalQLS.g:1981:4: otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,40,FOLLOW_37); 

                    				newLeafNode(otherlv_4, grammarAccess.getValueType_ImplAccess().getUnitKeyword_4_0());
                    			
                    // InternalQLS.g:1985:4: ( (lv_unit_5_0= ruleEString ) )
                    // InternalQLS.g:1986:5: (lv_unit_5_0= ruleEString )
                    {
                    // InternalQLS.g:1986:5: (lv_unit_5_0= ruleEString )
                    // InternalQLS.g:1987:6: lv_unit_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getValueType_ImplAccess().getUnitEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
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

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

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
    // InternalQLS.g:2013:1: entryRuleConstantCall returns [EObject current=null] : iv_ruleConstantCall= ruleConstantCall EOF ;
    public final EObject entryRuleConstantCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantCall = null;


        try {
            // InternalQLS.g:2013:53: (iv_ruleConstantCall= ruleConstantCall EOF )
            // InternalQLS.g:2014:2: iv_ruleConstantCall= ruleConstantCall EOF
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
    // InternalQLS.g:2020:1: ruleConstantCall returns [EObject current=null] : ( () ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleIntegerValue | lv_value_1_3= ruleBooleanValue | lv_value_1_4= ruleDecimalValue ) ) ) ) ;
    public final EObject ruleConstantCall() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_1 = null;

        EObject lv_value_1_2 = null;

        EObject lv_value_1_3 = null;

        EObject lv_value_1_4 = null;



        	enterRule();

        try {
            // InternalQLS.g:2026:2: ( ( () ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleIntegerValue | lv_value_1_3= ruleBooleanValue | lv_value_1_4= ruleDecimalValue ) ) ) ) )
            // InternalQLS.g:2027:2: ( () ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleIntegerValue | lv_value_1_3= ruleBooleanValue | lv_value_1_4= ruleDecimalValue ) ) ) )
            {
            // InternalQLS.g:2027:2: ( () ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleIntegerValue | lv_value_1_3= ruleBooleanValue | lv_value_1_4= ruleDecimalValue ) ) ) )
            // InternalQLS.g:2028:3: () ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleIntegerValue | lv_value_1_3= ruleBooleanValue | lv_value_1_4= ruleDecimalValue ) ) )
            {
            // InternalQLS.g:2028:3: ()
            // InternalQLS.g:2029:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConstantCallAccess().getConstantCallAction_0(),
            					current);
            			

            }

            // InternalQLS.g:2035:3: ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleIntegerValue | lv_value_1_3= ruleBooleanValue | lv_value_1_4= ruleDecimalValue ) ) )
            // InternalQLS.g:2036:4: ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleIntegerValue | lv_value_1_3= ruleBooleanValue | lv_value_1_4= ruleDecimalValue ) )
            {
            // InternalQLS.g:2036:4: ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleIntegerValue | lv_value_1_3= ruleBooleanValue | lv_value_1_4= ruleDecimalValue ) )
            // InternalQLS.g:2037:5: (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleIntegerValue | lv_value_1_3= ruleBooleanValue | lv_value_1_4= ruleDecimalValue )
            {
            // InternalQLS.g:2037:5: (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleIntegerValue | lv_value_1_3= ruleBooleanValue | lv_value_1_4= ruleDecimalValue )
            int alt30=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt30=1;
                }
                break;
            case RULE_INT:
                {
                int LA30_2 = input.LA(2);

                if ( (LA30_2==EOF||LA30_2==12||LA30_2==29||(LA30_2>=31 && LA30_2<=33)||LA30_2==56||(LA30_2>=62 && LA30_2<=63)||(LA30_2>=80 && LA30_2<=88)) ) {
                    alt30=2;
                }
                else if ( (LA30_2==53) ) {
                    alt30=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 2, input);

                    throw nvae;
                }
                }
                break;
            case 36:
            case 37:
                {
                alt30=3;
                }
                break;
            case 53:
                {
                alt30=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalQLS.g:2038:6: lv_value_1_1= ruleStringValue
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
                    // InternalQLS.g:2054:6: lv_value_1_2= ruleIntegerValue
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
                    // InternalQLS.g:2070:6: lv_value_1_3= ruleBooleanValue
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
                    // InternalQLS.g:2086:6: lv_value_1_4= ruleDecimalValue
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
    // InternalQLS.g:2108:1: entryRuleQuestionCall returns [EObject current=null] : iv_ruleQuestionCall= ruleQuestionCall EOF ;
    public final EObject entryRuleQuestionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionCall = null;


        try {
            // InternalQLS.g:2108:53: (iv_ruleQuestionCall= ruleQuestionCall EOF )
            // InternalQLS.g:2109:2: iv_ruleQuestionCall= ruleQuestionCall EOF
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
    // InternalQLS.g:2115:1: ruleQuestionCall returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) otherlv_2= '(' otherlv_3= ')' ) ;
    public final EObject ruleQuestionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalQLS.g:2121:2: ( ( () ( ( ruleQualifiedName ) ) otherlv_2= '(' otherlv_3= ')' ) )
            // InternalQLS.g:2122:2: ( () ( ( ruleQualifiedName ) ) otherlv_2= '(' otherlv_3= ')' )
            {
            // InternalQLS.g:2122:2: ( () ( ( ruleQualifiedName ) ) otherlv_2= '(' otherlv_3= ')' )
            // InternalQLS.g:2123:3: () ( ( ruleQualifiedName ) ) otherlv_2= '(' otherlv_3= ')'
            {
            // InternalQLS.g:2123:3: ()
            // InternalQLS.g:2124:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQuestionCallAccess().getQuestionCallAction_0(),
            					current);
            			

            }

            // InternalQLS.g:2130:3: ( ( ruleQualifiedName ) )
            // InternalQLS.g:2131:4: ( ruleQualifiedName )
            {
            // InternalQLS.g:2131:4: ( ruleQualifiedName )
            // InternalQLS.g:2132:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuestionCallRule());
            					}
            				

            					newCompositeNode(grammarAccess.getQuestionCallAccess().getQuestionQuestionDefinitionCrossReference_1_0());
            				
            pushFollow(FOLLOW_38);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getQuestionCallAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_2); 

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
    // InternalQLS.g:2158:1: entryRuleBooleanValueType returns [EObject current=null] : iv_ruleBooleanValueType= ruleBooleanValueType EOF ;
    public final EObject entryRuleBooleanValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValueType = null;


        try {
            // InternalQLS.g:2158:57: (iv_ruleBooleanValueType= ruleBooleanValueType EOF )
            // InternalQLS.g:2159:2: iv_ruleBooleanValueType= ruleBooleanValueType EOF
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
    // InternalQLS.g:2165:1: ruleBooleanValueType returns [EObject current=null] : ( () otherlv_1= 'booleanType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? ) ;
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
            // InternalQLS.g:2171:2: ( ( () otherlv_1= 'booleanType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? ) )
            // InternalQLS.g:2172:2: ( () otherlv_1= 'booleanType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? )
            {
            // InternalQLS.g:2172:2: ( () otherlv_1= 'booleanType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? )
            // InternalQLS.g:2173:3: () otherlv_1= 'booleanType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )?
            {
            // InternalQLS.g:2173:3: ()
            // InternalQLS.g:2174:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanValueTypeAccess().getBooleanValueTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getBooleanValueTypeAccess().getBooleanTypeKeyword_1());
            		
            // InternalQLS.g:2184:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalQLS.g:2185:4: (lv_name_2_0= RULE_ID )
            {
            // InternalQLS.g:2185:4: (lv_name_2_0= RULE_ID )
            // InternalQLS.g:2186:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_39); 

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

            // InternalQLS.g:2202:3: (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==12) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalQLS.g:2203:4: otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_36); 

                    				newLeafNode(otherlv_3, grammarAccess.getBooleanValueTypeAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalQLS.g:2207:4: (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==40) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalQLS.g:2208:5: otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) )
                            {
                            otherlv_4=(Token)match(input,40,FOLLOW_37); 

                            					newLeafNode(otherlv_4, grammarAccess.getBooleanValueTypeAccess().getUnitKeyword_3_1_0());
                            				
                            // InternalQLS.g:2212:5: ( (lv_unit_5_0= ruleEString ) )
                            // InternalQLS.g:2213:6: (lv_unit_5_0= ruleEString )
                            {
                            // InternalQLS.g:2213:6: (lv_unit_5_0= ruleEString )
                            // InternalQLS.g:2214:7: lv_unit_5_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getBooleanValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0());
                            						
                            pushFollow(FOLLOW_7);
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

                    otherlv_6=(Token)match(input,14,FOLLOW_2); 

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
    // InternalQLS.g:2241:1: entryRuleIntegerValueType returns [EObject current=null] : iv_ruleIntegerValueType= ruleIntegerValueType EOF ;
    public final EObject entryRuleIntegerValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValueType = null;


        try {
            // InternalQLS.g:2241:57: (iv_ruleIntegerValueType= ruleIntegerValueType EOF )
            // InternalQLS.g:2242:2: iv_ruleIntegerValueType= ruleIntegerValueType EOF
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
    // InternalQLS.g:2248:1: ruleIntegerValueType returns [EObject current=null] : ( () otherlv_1= 'integerType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )? (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )? otherlv_10= '}' )? ) ;
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
            // InternalQLS.g:2254:2: ( ( () otherlv_1= 'integerType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )? (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )? otherlv_10= '}' )? ) )
            // InternalQLS.g:2255:2: ( () otherlv_1= 'integerType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )? (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )? otherlv_10= '}' )? )
            {
            // InternalQLS.g:2255:2: ( () otherlv_1= 'integerType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )? (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )? otherlv_10= '}' )? )
            // InternalQLS.g:2256:3: () otherlv_1= 'integerType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )? (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )? otherlv_10= '}' )?
            {
            // InternalQLS.g:2256:3: ()
            // InternalQLS.g:2257:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerValueTypeAccess().getIntegerValueTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getIntegerValueTypeAccess().getIntegerTypeKeyword_1());
            		
            // InternalQLS.g:2267:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalQLS.g:2268:4: (lv_name_2_0= RULE_ID )
            {
            // InternalQLS.g:2268:4: (lv_name_2_0= RULE_ID )
            // InternalQLS.g:2269:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_39); 

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

            // InternalQLS.g:2285:3: (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )? (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )? otherlv_10= '}' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==12) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalQLS.g:2286:4: otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )? (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )? otherlv_10= '}'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_40); 

                    				newLeafNode(otherlv_3, grammarAccess.getIntegerValueTypeAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalQLS.g:2290:4: (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==40) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalQLS.g:2291:5: otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) )
                            {
                            otherlv_4=(Token)match(input,40,FOLLOW_37); 

                            					newLeafNode(otherlv_4, grammarAccess.getIntegerValueTypeAccess().getUnitKeyword_3_1_0());
                            				
                            // InternalQLS.g:2295:5: ( (lv_unit_5_0= ruleEString ) )
                            // InternalQLS.g:2296:6: (lv_unit_5_0= ruleEString )
                            {
                            // InternalQLS.g:2296:6: (lv_unit_5_0= ruleEString )
                            // InternalQLS.g:2297:7: lv_unit_5_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getIntegerValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0());
                            						
                            pushFollow(FOLLOW_41);
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

                    // InternalQLS.g:2315:4: (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==43) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalQLS.g:2316:5: otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) )
                            {
                            otherlv_6=(Token)match(input,43,FOLLOW_42); 

                            					newLeafNode(otherlv_6, grammarAccess.getIntegerValueTypeAccess().getMinKeyword_3_2_0());
                            				
                            // InternalQLS.g:2320:5: ( (lv_min_7_0= ruleEInt ) )
                            // InternalQLS.g:2321:6: (lv_min_7_0= ruleEInt )
                            {
                            // InternalQLS.g:2321:6: (lv_min_7_0= ruleEInt )
                            // InternalQLS.g:2322:7: lv_min_7_0= ruleEInt
                            {

                            							newCompositeNode(grammarAccess.getIntegerValueTypeAccess().getMinEIntParserRuleCall_3_2_1_0());
                            						
                            pushFollow(FOLLOW_43);
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

                    // InternalQLS.g:2340:4: (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==44) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalQLS.g:2341:5: otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) )
                            {
                            otherlv_8=(Token)match(input,44,FOLLOW_42); 

                            					newLeafNode(otherlv_8, grammarAccess.getIntegerValueTypeAccess().getMaxKeyword_3_3_0());
                            				
                            // InternalQLS.g:2345:5: ( (lv_max_9_0= ruleEInt ) )
                            // InternalQLS.g:2346:6: (lv_max_9_0= ruleEInt )
                            {
                            // InternalQLS.g:2346:6: (lv_max_9_0= ruleEInt )
                            // InternalQLS.g:2347:7: lv_max_9_0= ruleEInt
                            {

                            							newCompositeNode(grammarAccess.getIntegerValueTypeAccess().getMaxEIntParserRuleCall_3_3_1_0());
                            						
                            pushFollow(FOLLOW_7);
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

                    otherlv_10=(Token)match(input,14,FOLLOW_2); 

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
    // InternalQLS.g:2374:1: entryRuleDecimalValueType returns [EObject current=null] : iv_ruleDecimalValueType= ruleDecimalValueType EOF ;
    public final EObject entryRuleDecimalValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalValueType = null;


        try {
            // InternalQLS.g:2374:57: (iv_ruleDecimalValueType= ruleDecimalValueType EOF )
            // InternalQLS.g:2375:2: iv_ruleDecimalValueType= ruleDecimalValueType EOF
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
    // InternalQLS.g:2381:1: ruleDecimalValueType returns [EObject current=null] : ( () otherlv_1= 'decimalType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? ) ;
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
            // InternalQLS.g:2387:2: ( ( () otherlv_1= 'decimalType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? ) )
            // InternalQLS.g:2388:2: ( () otherlv_1= 'decimalType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? )
            {
            // InternalQLS.g:2388:2: ( () otherlv_1= 'decimalType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? )
            // InternalQLS.g:2389:3: () otherlv_1= 'decimalType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )?
            {
            // InternalQLS.g:2389:3: ()
            // InternalQLS.g:2390:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDecimalValueTypeAccess().getDecimalValueTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getDecimalValueTypeAccess().getDecimalTypeKeyword_1());
            		
            // InternalQLS.g:2400:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalQLS.g:2401:4: (lv_name_2_0= RULE_ID )
            {
            // InternalQLS.g:2401:4: (lv_name_2_0= RULE_ID )
            // InternalQLS.g:2402:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_39); 

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

            // InternalQLS.g:2418:3: (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==12) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalQLS.g:2419:4: otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_36); 

                    				newLeafNode(otherlv_3, grammarAccess.getDecimalValueTypeAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalQLS.g:2423:4: (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==40) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalQLS.g:2424:5: otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) )
                            {
                            otherlv_4=(Token)match(input,40,FOLLOW_37); 

                            					newLeafNode(otherlv_4, grammarAccess.getDecimalValueTypeAccess().getUnitKeyword_3_1_0());
                            				
                            // InternalQLS.g:2428:5: ( (lv_unit_5_0= ruleEString ) )
                            // InternalQLS.g:2429:6: (lv_unit_5_0= ruleEString )
                            {
                            // InternalQLS.g:2429:6: (lv_unit_5_0= ruleEString )
                            // InternalQLS.g:2430:7: lv_unit_5_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getDecimalValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0());
                            						
                            pushFollow(FOLLOW_7);
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

                    otherlv_6=(Token)match(input,14,FOLLOW_2); 

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
    // InternalQLS.g:2457:1: entryRuleDateValueType returns [EObject current=null] : iv_ruleDateValueType= ruleDateValueType EOF ;
    public final EObject entryRuleDateValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateValueType = null;


        try {
            // InternalQLS.g:2457:54: (iv_ruleDateValueType= ruleDateValueType EOF )
            // InternalQLS.g:2458:2: iv_ruleDateValueType= ruleDateValueType EOF
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
    // InternalQLS.g:2464:1: ruleDateValueType returns [EObject current=null] : ( () otherlv_1= 'dateType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? ) ;
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
            // InternalQLS.g:2470:2: ( ( () otherlv_1= 'dateType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? ) )
            // InternalQLS.g:2471:2: ( () otherlv_1= 'dateType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? )
            {
            // InternalQLS.g:2471:2: ( () otherlv_1= 'dateType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? )
            // InternalQLS.g:2472:3: () otherlv_1= 'dateType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )?
            {
            // InternalQLS.g:2472:3: ()
            // InternalQLS.g:2473:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDateValueTypeAccess().getDateValueTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getDateValueTypeAccess().getDateTypeKeyword_1());
            		
            // InternalQLS.g:2483:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalQLS.g:2484:4: (lv_name_2_0= RULE_ID )
            {
            // InternalQLS.g:2484:4: (lv_name_2_0= RULE_ID )
            // InternalQLS.g:2485:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_39); 

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

            // InternalQLS.g:2501:3: (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==12) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalQLS.g:2502:4: otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_36); 

                    				newLeafNode(otherlv_3, grammarAccess.getDateValueTypeAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalQLS.g:2506:4: (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==40) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalQLS.g:2507:5: otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) )
                            {
                            otherlv_4=(Token)match(input,40,FOLLOW_37); 

                            					newLeafNode(otherlv_4, grammarAccess.getDateValueTypeAccess().getUnitKeyword_3_1_0());
                            				
                            // InternalQLS.g:2511:5: ( (lv_unit_5_0= ruleEString ) )
                            // InternalQLS.g:2512:6: (lv_unit_5_0= ruleEString )
                            {
                            // InternalQLS.g:2512:6: (lv_unit_5_0= ruleEString )
                            // InternalQLS.g:2513:7: lv_unit_5_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getDateValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0());
                            						
                            pushFollow(FOLLOW_7);
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

                    otherlv_6=(Token)match(input,14,FOLLOW_2); 

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
    // InternalQLS.g:2540:1: entryRuleEnumerationValueType returns [EObject current=null] : iv_ruleEnumerationValueType= ruleEnumerationValueType EOF ;
    public final EObject entryRuleEnumerationValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationValueType = null;


        try {
            // InternalQLS.g:2540:61: (iv_ruleEnumerationValueType= ruleEnumerationValueType EOF )
            // InternalQLS.g:2541:2: iv_ruleEnumerationValueType= ruleEnumerationValueType EOF
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
    // InternalQLS.g:2547:1: ruleEnumerationValueType returns [EObject current=null] : ( () otherlv_1= 'enumerationType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )? otherlv_12= '}' )? ) ;
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
            // InternalQLS.g:2553:2: ( ( () otherlv_1= 'enumerationType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )? otherlv_12= '}' )? ) )
            // InternalQLS.g:2554:2: ( () otherlv_1= 'enumerationType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )? otherlv_12= '}' )? )
            {
            // InternalQLS.g:2554:2: ( () otherlv_1= 'enumerationType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )? otherlv_12= '}' )? )
            // InternalQLS.g:2555:3: () otherlv_1= 'enumerationType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )? otherlv_12= '}' )?
            {
            // InternalQLS.g:2555:3: ()
            // InternalQLS.g:2556:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnumerationValueTypeAccess().getEnumerationValueTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumerationValueTypeAccess().getEnumerationTypeKeyword_1());
            		
            // InternalQLS.g:2566:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalQLS.g:2567:4: (lv_name_2_0= RULE_ID )
            {
            // InternalQLS.g:2567:4: (lv_name_2_0= RULE_ID )
            // InternalQLS.g:2568:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_39); 

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

            // InternalQLS.g:2584:3: (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )? otherlv_12= '}' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==12) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalQLS.g:2585:4: otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )? otherlv_12= '}'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_44); 

                    				newLeafNode(otherlv_3, grammarAccess.getEnumerationValueTypeAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalQLS.g:2589:4: (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==40) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalQLS.g:2590:5: otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) )
                            {
                            otherlv_4=(Token)match(input,40,FOLLOW_37); 

                            					newLeafNode(otherlv_4, grammarAccess.getEnumerationValueTypeAccess().getUnitKeyword_3_1_0());
                            				
                            // InternalQLS.g:2594:5: ( (lv_unit_5_0= ruleEString ) )
                            // InternalQLS.g:2595:6: (lv_unit_5_0= ruleEString )
                            {
                            // InternalQLS.g:2595:6: (lv_unit_5_0= ruleEString )
                            // InternalQLS.g:2596:7: lv_unit_5_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getEnumerationValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0());
                            						
                            pushFollow(FOLLOW_45);
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

                    // InternalQLS.g:2614:4: (otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==48) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalQLS.g:2615:5: otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}'
                            {
                            otherlv_6=(Token)match(input,48,FOLLOW_4); 

                            					newLeafNode(otherlv_6, grammarAccess.getEnumerationValueTypeAccess().getLiteralsKeyword_3_2_0());
                            				
                            otherlv_7=(Token)match(input,12,FOLLOW_9); 

                            					newLeafNode(otherlv_7, grammarAccess.getEnumerationValueTypeAccess().getLeftCurlyBracketKeyword_3_2_1());
                            				
                            // InternalQLS.g:2623:5: ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) )
                            // InternalQLS.g:2624:6: (lv_enumerationLiterals_8_0= ruleEnumerationLiteral )
                            {
                            // InternalQLS.g:2624:6: (lv_enumerationLiterals_8_0= ruleEnumerationLiteral )
                            // InternalQLS.g:2625:7: lv_enumerationLiterals_8_0= ruleEnumerationLiteral
                            {

                            							newCompositeNode(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_3_2_2_0());
                            						
                            pushFollow(FOLLOW_46);
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

                            // InternalQLS.g:2642:5: (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )*
                            loop42:
                            do {
                                int alt42=2;
                                int LA42_0 = input.LA(1);

                                if ( (LA42_0==49) ) {
                                    alt42=1;
                                }


                                switch (alt42) {
                            	case 1 :
                            	    // InternalQLS.g:2643:6: otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) )
                            	    {
                            	    otherlv_9=(Token)match(input,49,FOLLOW_9); 

                            	    						newLeafNode(otherlv_9, grammarAccess.getEnumerationValueTypeAccess().getCommaKeyword_3_2_3_0());
                            	    					
                            	    // InternalQLS.g:2647:6: ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) )
                            	    // InternalQLS.g:2648:7: (lv_enumerationLiterals_10_0= ruleEnumerationLiteral )
                            	    {
                            	    // InternalQLS.g:2648:7: (lv_enumerationLiterals_10_0= ruleEnumerationLiteral )
                            	    // InternalQLS.g:2649:8: lv_enumerationLiterals_10_0= ruleEnumerationLiteral
                            	    {

                            	    								newCompositeNode(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_3_2_3_1_0());
                            	    							
                            	    pushFollow(FOLLOW_46);
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
                            	    break loop42;
                                }
                            } while (true);

                            otherlv_11=(Token)match(input,14,FOLLOW_7); 

                            					newLeafNode(otherlv_11, grammarAccess.getEnumerationValueTypeAccess().getRightCurlyBracketKeyword_3_2_4());
                            				

                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,14,FOLLOW_2); 

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
    // InternalQLS.g:2681:1: entryRuleStringValueType returns [EObject current=null] : iv_ruleStringValueType= ruleStringValueType EOF ;
    public final EObject entryRuleStringValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValueType = null;


        try {
            // InternalQLS.g:2681:56: (iv_ruleStringValueType= ruleStringValueType EOF )
            // InternalQLS.g:2682:2: iv_ruleStringValueType= ruleStringValueType EOF
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
    // InternalQLS.g:2688:1: ruleStringValueType returns [EObject current=null] : ( () otherlv_1= 'StringType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? ) ;
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
            // InternalQLS.g:2694:2: ( ( () otherlv_1= 'StringType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? ) )
            // InternalQLS.g:2695:2: ( () otherlv_1= 'StringType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? )
            {
            // InternalQLS.g:2695:2: ( () otherlv_1= 'StringType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? )
            // InternalQLS.g:2696:3: () otherlv_1= 'StringType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )?
            {
            // InternalQLS.g:2696:3: ()
            // InternalQLS.g:2697:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringValueTypeAccess().getStringValueTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,50,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getStringValueTypeAccess().getStringTypeKeyword_1());
            		
            // InternalQLS.g:2707:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalQLS.g:2708:4: (lv_name_2_0= RULE_ID )
            {
            // InternalQLS.g:2708:4: (lv_name_2_0= RULE_ID )
            // InternalQLS.g:2709:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_39); 

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

            // InternalQLS.g:2725:3: (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==12) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalQLS.g:2726:4: otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_36); 

                    				newLeafNode(otherlv_3, grammarAccess.getStringValueTypeAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalQLS.g:2730:4: (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==40) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalQLS.g:2731:5: otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) )
                            {
                            otherlv_4=(Token)match(input,40,FOLLOW_37); 

                            					newLeafNode(otherlv_4, grammarAccess.getStringValueTypeAccess().getUnitKeyword_3_1_0());
                            				
                            // InternalQLS.g:2735:5: ( (lv_unit_5_0= ruleEString ) )
                            // InternalQLS.g:2736:6: (lv_unit_5_0= ruleEString )
                            {
                            // InternalQLS.g:2736:6: (lv_unit_5_0= ruleEString )
                            // InternalQLS.g:2737:7: lv_unit_5_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getStringValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0());
                            						
                            pushFollow(FOLLOW_7);
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

                    otherlv_6=(Token)match(input,14,FOLLOW_2); 

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
    // InternalQLS.g:2764:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteral = null;


        try {
            // InternalQLS.g:2764:59: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // InternalQLS.g:2765:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
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
    // InternalQLS.g:2771:1: ruleEnumerationLiteral returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalQLS.g:2777:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalQLS.g:2778:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalQLS.g:2778:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalQLS.g:2779:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalQLS.g:2779:3: ()
            // InternalQLS.g:2780:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnumerationLiteralAccess().getEnumerationLiteralAction_0(),
            					current);
            			

            }

            // InternalQLS.g:2786:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalQLS.g:2787:4: (lv_name_1_0= RULE_ID )
            {
            // InternalQLS.g:2787:4: (lv_name_1_0= RULE_ID )
            // InternalQLS.g:2788:5: lv_name_1_0= RULE_ID
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
    // InternalQLS.g:2808:1: entryRuleIntegerValue returns [EObject current=null] : iv_ruleIntegerValue= ruleIntegerValue EOF ;
    public final EObject entryRuleIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValue = null;


        try {
            // InternalQLS.g:2808:53: (iv_ruleIntegerValue= ruleIntegerValue EOF )
            // InternalQLS.g:2809:2: iv_ruleIntegerValue= ruleIntegerValue EOF
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
    // InternalQLS.g:2815:1: ruleIntegerValue returns [EObject current=null] : ( () ( (lv_intValue_1_0= ruleEInt ) ) ) ;
    public final EObject ruleIntegerValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_intValue_1_0 = null;



        	enterRule();

        try {
            // InternalQLS.g:2821:2: ( ( () ( (lv_intValue_1_0= ruleEInt ) ) ) )
            // InternalQLS.g:2822:2: ( () ( (lv_intValue_1_0= ruleEInt ) ) )
            {
            // InternalQLS.g:2822:2: ( () ( (lv_intValue_1_0= ruleEInt ) ) )
            // InternalQLS.g:2823:3: () ( (lv_intValue_1_0= ruleEInt ) )
            {
            // InternalQLS.g:2823:3: ()
            // InternalQLS.g:2824:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerValueAccess().getIntegerValueAction_0(),
            					current);
            			

            }

            // InternalQLS.g:2830:3: ( (lv_intValue_1_0= ruleEInt ) )
            // InternalQLS.g:2831:4: (lv_intValue_1_0= ruleEInt )
            {
            // InternalQLS.g:2831:4: (lv_intValue_1_0= ruleEInt )
            // InternalQLS.g:2832:5: lv_intValue_1_0= ruleEInt
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
    // InternalQLS.g:2853:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalQLS.g:2853:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalQLS.g:2854:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalQLS.g:2860:1: ruleStringValue returns [EObject current=null] : ( () ( (lv_stringValue_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_stringValue_1_0=null;


        	enterRule();

        try {
            // InternalQLS.g:2866:2: ( ( () ( (lv_stringValue_1_0= RULE_STRING ) ) ) )
            // InternalQLS.g:2867:2: ( () ( (lv_stringValue_1_0= RULE_STRING ) ) )
            {
            // InternalQLS.g:2867:2: ( () ( (lv_stringValue_1_0= RULE_STRING ) ) )
            // InternalQLS.g:2868:3: () ( (lv_stringValue_1_0= RULE_STRING ) )
            {
            // InternalQLS.g:2868:3: ()
            // InternalQLS.g:2869:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringValueAccess().getStringValueAction_0(),
            					current);
            			

            }

            // InternalQLS.g:2875:3: ( (lv_stringValue_1_0= RULE_STRING ) )
            // InternalQLS.g:2876:4: (lv_stringValue_1_0= RULE_STRING )
            {
            // InternalQLS.g:2876:4: (lv_stringValue_1_0= RULE_STRING )
            // InternalQLS.g:2877:5: lv_stringValue_1_0= RULE_STRING
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
    // InternalQLS.g:2897:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalQLS.g:2897:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalQLS.g:2898:2: iv_ruleBooleanValue= ruleBooleanValue EOF
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
    // InternalQLS.g:2904:1: ruleBooleanValue returns [EObject current=null] : ( () ( (lv_booleanValue_1_0= ruleEBoolean ) ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_booleanValue_1_0 = null;



        	enterRule();

        try {
            // InternalQLS.g:2910:2: ( ( () ( (lv_booleanValue_1_0= ruleEBoolean ) ) ) )
            // InternalQLS.g:2911:2: ( () ( (lv_booleanValue_1_0= ruleEBoolean ) ) )
            {
            // InternalQLS.g:2911:2: ( () ( (lv_booleanValue_1_0= ruleEBoolean ) ) )
            // InternalQLS.g:2912:3: () ( (lv_booleanValue_1_0= ruleEBoolean ) )
            {
            // InternalQLS.g:2912:3: ()
            // InternalQLS.g:2913:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanValueAccess().getBooleanValueAction_0(),
            					current);
            			

            }

            // InternalQLS.g:2919:3: ( (lv_booleanValue_1_0= ruleEBoolean ) )
            // InternalQLS.g:2920:4: (lv_booleanValue_1_0= ruleEBoolean )
            {
            // InternalQLS.g:2920:4: (lv_booleanValue_1_0= ruleEBoolean )
            // InternalQLS.g:2921:5: lv_booleanValue_1_0= ruleEBoolean
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
    // InternalQLS.g:2942:1: entryRuleEnumerationCall returns [EObject current=null] : iv_ruleEnumerationCall= ruleEnumerationCall EOF ;
    public final EObject entryRuleEnumerationCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationCall = null;


        try {
            // InternalQLS.g:2942:56: (iv_ruleEnumerationCall= ruleEnumerationCall EOF )
            // InternalQLS.g:2943:2: iv_ruleEnumerationCall= ruleEnumerationCall EOF
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
    // InternalQLS.g:2949:1: ruleEnumerationCall returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleEnumerationCall() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalQLS.g:2955:2: ( ( () ( ( ruleQualifiedName ) ) ) )
            // InternalQLS.g:2956:2: ( () ( ( ruleQualifiedName ) ) )
            {
            // InternalQLS.g:2956:2: ( () ( ( ruleQualifiedName ) ) )
            // InternalQLS.g:2957:3: () ( ( ruleQualifiedName ) )
            {
            // InternalQLS.g:2957:3: ()
            // InternalQLS.g:2958:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnumerationCallAccess().getEnumerationCallAction_0(),
            					current);
            			

            }

            // InternalQLS.g:2964:3: ( ( ruleQualifiedName ) )
            // InternalQLS.g:2965:4: ( ruleQualifiedName )
            {
            // InternalQLS.g:2965:4: ( ruleQualifiedName )
            // InternalQLS.g:2966:5: ruleQualifiedName
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
    // InternalQLS.g:2984:1: entryRuleDateValue returns [EObject current=null] : iv_ruleDateValue= ruleDateValue EOF ;
    public final EObject entryRuleDateValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateValue = null;


        try {
            // InternalQLS.g:2984:50: (iv_ruleDateValue= ruleDateValue EOF )
            // InternalQLS.g:2985:2: iv_ruleDateValue= ruleDateValue EOF
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
    // InternalQLS.g:2991:1: ruleDateValue returns [EObject current=null] : ( () otherlv_1= 'DateValue' otherlv_2= '{' (otherlv_3= 'dateValue' ( (lv_dateValue_4_0= ruleEDate ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleDateValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_dateValue_4_0 = null;



        	enterRule();

        try {
            // InternalQLS.g:2997:2: ( ( () otherlv_1= 'DateValue' otherlv_2= '{' (otherlv_3= 'dateValue' ( (lv_dateValue_4_0= ruleEDate ) ) )? otherlv_5= '}' ) )
            // InternalQLS.g:2998:2: ( () otherlv_1= 'DateValue' otherlv_2= '{' (otherlv_3= 'dateValue' ( (lv_dateValue_4_0= ruleEDate ) ) )? otherlv_5= '}' )
            {
            // InternalQLS.g:2998:2: ( () otherlv_1= 'DateValue' otherlv_2= '{' (otherlv_3= 'dateValue' ( (lv_dateValue_4_0= ruleEDate ) ) )? otherlv_5= '}' )
            // InternalQLS.g:2999:3: () otherlv_1= 'DateValue' otherlv_2= '{' (otherlv_3= 'dateValue' ( (lv_dateValue_4_0= ruleEDate ) ) )? otherlv_5= '}'
            {
            // InternalQLS.g:2999:3: ()
            // InternalQLS.g:3000:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDateValueAccess().getDateValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDateValueAccess().getDateValueKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getDateValueAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQLS.g:3014:3: (otherlv_3= 'dateValue' ( (lv_dateValue_4_0= ruleEDate ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==52) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalQLS.g:3015:4: otherlv_3= 'dateValue' ( (lv_dateValue_4_0= ruleEDate ) )
                    {
                    otherlv_3=(Token)match(input,52,FOLLOW_48); 

                    				newLeafNode(otherlv_3, grammarAccess.getDateValueAccess().getDateValueKeyword_3_0());
                    			
                    // InternalQLS.g:3019:4: ( (lv_dateValue_4_0= ruleEDate ) )
                    // InternalQLS.g:3020:5: (lv_dateValue_4_0= ruleEDate )
                    {
                    // InternalQLS.g:3020:5: (lv_dateValue_4_0= ruleEDate )
                    // InternalQLS.g:3021:6: lv_dateValue_4_0= ruleEDate
                    {

                    						newCompositeNode(grammarAccess.getDateValueAccess().getDateValueEDateParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
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

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

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
    // InternalQLS.g:3047:1: entryRuleDecimalValue returns [EObject current=null] : iv_ruleDecimalValue= ruleDecimalValue EOF ;
    public final EObject entryRuleDecimalValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalValue = null;


        try {
            // InternalQLS.g:3047:53: (iv_ruleDecimalValue= ruleDecimalValue EOF )
            // InternalQLS.g:3048:2: iv_ruleDecimalValue= ruleDecimalValue EOF
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
    // InternalQLS.g:3054:1: ruleDecimalValue returns [EObject current=null] : ( () ( (lv_decimalValue_1_0= ruleEDouble ) ) ) ;
    public final EObject ruleDecimalValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_decimalValue_1_0 = null;



        	enterRule();

        try {
            // InternalQLS.g:3060:2: ( ( () ( (lv_decimalValue_1_0= ruleEDouble ) ) ) )
            // InternalQLS.g:3061:2: ( () ( (lv_decimalValue_1_0= ruleEDouble ) ) )
            {
            // InternalQLS.g:3061:2: ( () ( (lv_decimalValue_1_0= ruleEDouble ) ) )
            // InternalQLS.g:3062:3: () ( (lv_decimalValue_1_0= ruleEDouble ) )
            {
            // InternalQLS.g:3062:3: ()
            // InternalQLS.g:3063:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDecimalValueAccess().getDecimalValueAction_0(),
            					current);
            			

            }

            // InternalQLS.g:3069:3: ( (lv_decimalValue_1_0= ruleEDouble ) )
            // InternalQLS.g:3070:4: (lv_decimalValue_1_0= ruleEDouble )
            {
            // InternalQLS.g:3070:4: (lv_decimalValue_1_0= ruleEDouble )
            // InternalQLS.g:3071:5: lv_decimalValue_1_0= ruleEDouble
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
    // InternalQLS.g:3092:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalQLS.g:3092:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalQLS.g:3093:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalQLS.g:3099:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalQLS.g:3105:2: (this_INT_0= RULE_INT )
            // InternalQLS.g:3106:2: this_INT_0= RULE_INT
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
    // InternalQLS.g:3116:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalQLS.g:3116:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalQLS.g:3117:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalQLS.g:3123:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_6=null;


        	enterRule();

        try {
            // InternalQLS.g:3129:2: ( ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )? ) )
            // InternalQLS.g:3130:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )? )
            {
            // InternalQLS.g:3130:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )? )
            // InternalQLS.g:3131:3: (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )?
            {
            // InternalQLS.g:3131:3: (this_INT_0= RULE_INT )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_INT) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalQLS.g:3132:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_49); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,53,FOLLOW_42); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_50); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_2());
            		
            // InternalQLS.g:3152:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=54 && LA51_0<=55)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalQLS.g:3153:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT
                    {
                    // InternalQLS.g:3153:4: (kw= 'E' | kw= 'e' )
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==54) ) {
                        alt49=1;
                    }
                    else if ( (LA49_0==55) ) {
                        alt49=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 49, 0, input);

                        throw nvae;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalQLS.g:3154:5: kw= 'E'
                            {
                            kw=(Token)match(input,54,FOLLOW_51); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalQLS.g:3160:5: kw= 'e'
                            {
                            kw=(Token)match(input,55,FOLLOW_51); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_3_0_1());
                            				

                            }
                            break;

                    }

                    // InternalQLS.g:3166:4: (kw= '-' )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==56) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // InternalQLS.g:3167:5: kw= '-'
                            {
                            kw=(Token)match(input,56,FOLLOW_42); 

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
    // InternalQLS.g:3185:1: entryRuleQuestionDefinition returns [EObject current=null] : iv_ruleQuestionDefinition= ruleQuestionDefinition EOF ;
    public final EObject entryRuleQuestionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionDefinition = null;


        try {
            // InternalQLS.g:3185:59: (iv_ruleQuestionDefinition= ruleQuestionDefinition EOF )
            // InternalQLS.g:3186:2: iv_ruleQuestionDefinition= ruleQuestionDefinition EOF
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
    // InternalQLS.g:3192:1: ruleQuestionDefinition returns [EObject current=null] : ( ( (lv_isMandatory_0_0= 'mandatory' ) )? otherlv_1= 'question' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_isDisplayed_4_0= 'isDisplayed' ) )? (otherlv_5= 'currentValue' ( (lv_currentValue_6_0= ruleValue ) ) )? otherlv_7= ')' )? otherlv_8= ':' ( (lv_label_9_0= ruleEString ) ) ( ( ruleEString ) ) (otherlv_11= '=' ( (lv_computedExpression_12_0= ruleExpression ) ) otherlv_13= ';' )? ) ;
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
            // InternalQLS.g:3198:2: ( ( ( (lv_isMandatory_0_0= 'mandatory' ) )? otherlv_1= 'question' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_isDisplayed_4_0= 'isDisplayed' ) )? (otherlv_5= 'currentValue' ( (lv_currentValue_6_0= ruleValue ) ) )? otherlv_7= ')' )? otherlv_8= ':' ( (lv_label_9_0= ruleEString ) ) ( ( ruleEString ) ) (otherlv_11= '=' ( (lv_computedExpression_12_0= ruleExpression ) ) otherlv_13= ';' )? ) )
            // InternalQLS.g:3199:2: ( ( (lv_isMandatory_0_0= 'mandatory' ) )? otherlv_1= 'question' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_isDisplayed_4_0= 'isDisplayed' ) )? (otherlv_5= 'currentValue' ( (lv_currentValue_6_0= ruleValue ) ) )? otherlv_7= ')' )? otherlv_8= ':' ( (lv_label_9_0= ruleEString ) ) ( ( ruleEString ) ) (otherlv_11= '=' ( (lv_computedExpression_12_0= ruleExpression ) ) otherlv_13= ';' )? )
            {
            // InternalQLS.g:3199:2: ( ( (lv_isMandatory_0_0= 'mandatory' ) )? otherlv_1= 'question' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_isDisplayed_4_0= 'isDisplayed' ) )? (otherlv_5= 'currentValue' ( (lv_currentValue_6_0= ruleValue ) ) )? otherlv_7= ')' )? otherlv_8= ':' ( (lv_label_9_0= ruleEString ) ) ( ( ruleEString ) ) (otherlv_11= '=' ( (lv_computedExpression_12_0= ruleExpression ) ) otherlv_13= ';' )? )
            // InternalQLS.g:3200:3: ( (lv_isMandatory_0_0= 'mandatory' ) )? otherlv_1= 'question' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_isDisplayed_4_0= 'isDisplayed' ) )? (otherlv_5= 'currentValue' ( (lv_currentValue_6_0= ruleValue ) ) )? otherlv_7= ')' )? otherlv_8= ':' ( (lv_label_9_0= ruleEString ) ) ( ( ruleEString ) ) (otherlv_11= '=' ( (lv_computedExpression_12_0= ruleExpression ) ) otherlv_13= ';' )?
            {
            // InternalQLS.g:3200:3: ( (lv_isMandatory_0_0= 'mandatory' ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==57) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalQLS.g:3201:4: (lv_isMandatory_0_0= 'mandatory' )
                    {
                    // InternalQLS.g:3201:4: (lv_isMandatory_0_0= 'mandatory' )
                    // InternalQLS.g:3202:5: lv_isMandatory_0_0= 'mandatory'
                    {
                    lv_isMandatory_0_0=(Token)match(input,57,FOLLOW_52); 

                    					newLeafNode(lv_isMandatory_0_0, grammarAccess.getQuestionDefinitionAccess().getIsMandatoryMandatoryKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getQuestionDefinitionRule());
                    					}
                    					setWithLastConsumed(current, "isMandatory", lv_isMandatory_0_0 != null, "mandatory");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,58,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getQuestionDefinitionAccess().getQuestionKeyword_1());
            		
            // InternalQLS.g:3218:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQLS.g:3219:4: (lv_name_2_0= ruleEString )
            {
            // InternalQLS.g:3219:4: (lv_name_2_0= ruleEString )
            // InternalQLS.g:3220:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getQuestionDefinitionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_53);
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

            // InternalQLS.g:3237:3: (otherlv_3= '(' ( (lv_isDisplayed_4_0= 'isDisplayed' ) )? (otherlv_5= 'currentValue' ( (lv_currentValue_6_0= ruleValue ) ) )? otherlv_7= ')' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==28) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalQLS.g:3238:4: otherlv_3= '(' ( (lv_isDisplayed_4_0= 'isDisplayed' ) )? (otherlv_5= 'currentValue' ( (lv_currentValue_6_0= ruleValue ) ) )? otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_54); 

                    				newLeafNode(otherlv_3, grammarAccess.getQuestionDefinitionAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalQLS.g:3242:4: ( (lv_isDisplayed_4_0= 'isDisplayed' ) )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==59) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalQLS.g:3243:5: (lv_isDisplayed_4_0= 'isDisplayed' )
                            {
                            // InternalQLS.g:3243:5: (lv_isDisplayed_4_0= 'isDisplayed' )
                            // InternalQLS.g:3244:6: lv_isDisplayed_4_0= 'isDisplayed'
                            {
                            lv_isDisplayed_4_0=(Token)match(input,59,FOLLOW_55); 

                            						newLeafNode(lv_isDisplayed_4_0, grammarAccess.getQuestionDefinitionAccess().getIsDisplayedIsDisplayedKeyword_3_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getQuestionDefinitionRule());
                            						}
                            						setWithLastConsumed(current, "isDisplayed", lv_isDisplayed_4_0 != null, "isDisplayed");
                            					

                            }


                            }
                            break;

                    }

                    // InternalQLS.g:3256:4: (otherlv_5= 'currentValue' ( (lv_currentValue_6_0= ruleValue ) ) )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==60) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalQLS.g:3257:5: otherlv_5= 'currentValue' ( (lv_currentValue_6_0= ruleValue ) )
                            {
                            otherlv_5=(Token)match(input,60,FOLLOW_56); 

                            					newLeafNode(otherlv_5, grammarAccess.getQuestionDefinitionAccess().getCurrentValueKeyword_3_2_0());
                            				
                            // InternalQLS.g:3261:5: ( (lv_currentValue_6_0= ruleValue ) )
                            // InternalQLS.g:3262:6: (lv_currentValue_6_0= ruleValue )
                            {
                            // InternalQLS.g:3262:6: (lv_currentValue_6_0= ruleValue )
                            // InternalQLS.g:3263:7: lv_currentValue_6_0= ruleValue
                            {

                            							newCompositeNode(grammarAccess.getQuestionDefinitionAccess().getCurrentValueValueParserRuleCall_3_2_1_0());
                            						
                            pushFollow(FOLLOW_22);
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

                    otherlv_7=(Token)match(input,29,FOLLOW_57); 

                    				newLeafNode(otherlv_7, grammarAccess.getQuestionDefinitionAccess().getRightParenthesisKeyword_3_3());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,61,FOLLOW_37); 

            			newLeafNode(otherlv_8, grammarAccess.getQuestionDefinitionAccess().getColonKeyword_4());
            		
            // InternalQLS.g:3290:3: ( (lv_label_9_0= ruleEString ) )
            // InternalQLS.g:3291:4: (lv_label_9_0= ruleEString )
            {
            // InternalQLS.g:3291:4: (lv_label_9_0= ruleEString )
            // InternalQLS.g:3292:5: lv_label_9_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getQuestionDefinitionAccess().getLabelEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_37);
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

            // InternalQLS.g:3309:3: ( ( ruleEString ) )
            // InternalQLS.g:3310:4: ( ruleEString )
            {
            // InternalQLS.g:3310:4: ( ruleEString )
            // InternalQLS.g:3311:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuestionDefinitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getQuestionDefinitionAccess().getDataTypeValueTypeCrossReference_6_0());
            				
            pushFollow(FOLLOW_29);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQLS.g:3325:3: (otherlv_11= '=' ( (lv_computedExpression_12_0= ruleExpression ) ) otherlv_13= ';' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==62) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalQLS.g:3326:4: otherlv_11= '=' ( (lv_computedExpression_12_0= ruleExpression ) ) otherlv_13= ';'
                    {
                    otherlv_11=(Token)match(input,62,FOLLOW_21); 

                    				newLeafNode(otherlv_11, grammarAccess.getQuestionDefinitionAccess().getEqualsSignKeyword_7_0());
                    			
                    // InternalQLS.g:3330:4: ( (lv_computedExpression_12_0= ruleExpression ) )
                    // InternalQLS.g:3331:5: (lv_computedExpression_12_0= ruleExpression )
                    {
                    // InternalQLS.g:3331:5: (lv_computedExpression_12_0= ruleExpression )
                    // InternalQLS.g:3332:6: lv_computedExpression_12_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getQuestionDefinitionAccess().getComputedExpressionExpressionParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_58);
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

                    otherlv_13=(Token)match(input,63,FOLLOW_2); 

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
    // InternalQLS.g:3358:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalQLS.g:3358:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalQLS.g:3359:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalQLS.g:3365:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalQLS.g:3371:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalQLS.g:3372:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalQLS.g:3372:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalQLS.g:3373:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_59); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalQLS.g:3380:3: (kw= '.' this_ID_2= RULE_ID )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==53) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalQLS.g:3381:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,53,FOLLOW_9); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_59); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop57;
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


    // $ANTLR start "ruleBooleanStyleKind"
    // InternalQLS.g:3398:1: ruleBooleanStyleKind returns [Enumerator current=null] : ( (enumLiteral_0= 'CHECKBOX' ) | (enumLiteral_1= 'TWO_RADIO' ) | (enumLiteral_2= 'DROPDOWN' ) ) ;
    public final Enumerator ruleBooleanStyleKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalQLS.g:3404:2: ( ( (enumLiteral_0= 'CHECKBOX' ) | (enumLiteral_1= 'TWO_RADIO' ) | (enumLiteral_2= 'DROPDOWN' ) ) )
            // InternalQLS.g:3405:2: ( (enumLiteral_0= 'CHECKBOX' ) | (enumLiteral_1= 'TWO_RADIO' ) | (enumLiteral_2= 'DROPDOWN' ) )
            {
            // InternalQLS.g:3405:2: ( (enumLiteral_0= 'CHECKBOX' ) | (enumLiteral_1= 'TWO_RADIO' ) | (enumLiteral_2= 'DROPDOWN' ) )
            int alt58=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt58=1;
                }
                break;
            case 65:
                {
                alt58=2;
                }
                break;
            case 66:
                {
                alt58=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalQLS.g:3406:3: (enumLiteral_0= 'CHECKBOX' )
                    {
                    // InternalQLS.g:3406:3: (enumLiteral_0= 'CHECKBOX' )
                    // InternalQLS.g:3407:4: enumLiteral_0= 'CHECKBOX'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getBooleanStyleKindAccess().getCHECKBOXEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBooleanStyleKindAccess().getCHECKBOXEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:3414:3: (enumLiteral_1= 'TWO_RADIO' )
                    {
                    // InternalQLS.g:3414:3: (enumLiteral_1= 'TWO_RADIO' )
                    // InternalQLS.g:3415:4: enumLiteral_1= 'TWO_RADIO'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getBooleanStyleKindAccess().getTWO_RADIOEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBooleanStyleKindAccess().getTWO_RADIOEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalQLS.g:3422:3: (enumLiteral_2= 'DROPDOWN' )
                    {
                    // InternalQLS.g:3422:3: (enumLiteral_2= 'DROPDOWN' )
                    // InternalQLS.g:3423:4: enumLiteral_2= 'DROPDOWN'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getBooleanStyleKindAccess().getDROPDOWNEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBooleanStyleKindAccess().getDROPDOWNEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleBooleanStyleKind"


    // $ANTLR start "ruleBinaryOperatorKind"
    // InternalQLS.g:3433:1: ruleBinaryOperatorKind returns [Enumerator current=null] : ( (enumLiteral_0= 'PLUS' ) | (enumLiteral_1= 'MINUS' ) | (enumLiteral_2= 'MULT' ) | (enumLiteral_3= 'DIV' ) | (enumLiteral_4= 'EQUAL' ) | (enumLiteral_5= 'NOTEQUAL' ) | (enumLiteral_6= 'GREATER' ) | (enumLiteral_7= 'LOWER' ) | (enumLiteral_8= 'GREATEROREQUAL' ) | (enumLiteral_9= 'LOWEROREQUAL' ) | (enumLiteral_10= 'AND' ) | (enumLiteral_11= 'OR' ) ) ;
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
            // InternalQLS.g:3439:2: ( ( (enumLiteral_0= 'PLUS' ) | (enumLiteral_1= 'MINUS' ) | (enumLiteral_2= 'MULT' ) | (enumLiteral_3= 'DIV' ) | (enumLiteral_4= 'EQUAL' ) | (enumLiteral_5= 'NOTEQUAL' ) | (enumLiteral_6= 'GREATER' ) | (enumLiteral_7= 'LOWER' ) | (enumLiteral_8= 'GREATEROREQUAL' ) | (enumLiteral_9= 'LOWEROREQUAL' ) | (enumLiteral_10= 'AND' ) | (enumLiteral_11= 'OR' ) ) )
            // InternalQLS.g:3440:2: ( (enumLiteral_0= 'PLUS' ) | (enumLiteral_1= 'MINUS' ) | (enumLiteral_2= 'MULT' ) | (enumLiteral_3= 'DIV' ) | (enumLiteral_4= 'EQUAL' ) | (enumLiteral_5= 'NOTEQUAL' ) | (enumLiteral_6= 'GREATER' ) | (enumLiteral_7= 'LOWER' ) | (enumLiteral_8= 'GREATEROREQUAL' ) | (enumLiteral_9= 'LOWEROREQUAL' ) | (enumLiteral_10= 'AND' ) | (enumLiteral_11= 'OR' ) )
            {
            // InternalQLS.g:3440:2: ( (enumLiteral_0= 'PLUS' ) | (enumLiteral_1= 'MINUS' ) | (enumLiteral_2= 'MULT' ) | (enumLiteral_3= 'DIV' ) | (enumLiteral_4= 'EQUAL' ) | (enumLiteral_5= 'NOTEQUAL' ) | (enumLiteral_6= 'GREATER' ) | (enumLiteral_7= 'LOWER' ) | (enumLiteral_8= 'GREATEROREQUAL' ) | (enumLiteral_9= 'LOWEROREQUAL' ) | (enumLiteral_10= 'AND' ) | (enumLiteral_11= 'OR' ) )
            int alt59=12;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt59=1;
                }
                break;
            case 68:
                {
                alt59=2;
                }
                break;
            case 69:
                {
                alt59=3;
                }
                break;
            case 70:
                {
                alt59=4;
                }
                break;
            case 71:
                {
                alt59=5;
                }
                break;
            case 72:
                {
                alt59=6;
                }
                break;
            case 73:
                {
                alt59=7;
                }
                break;
            case 74:
                {
                alt59=8;
                }
                break;
            case 75:
                {
                alt59=9;
                }
                break;
            case 76:
                {
                alt59=10;
                }
                break;
            case 77:
                {
                alt59=11;
                }
                break;
            case 78:
                {
                alt59=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // InternalQLS.g:3441:3: (enumLiteral_0= 'PLUS' )
                    {
                    // InternalQLS.g:3441:3: (enumLiteral_0= 'PLUS' )
                    // InternalQLS.g:3442:4: enumLiteral_0= 'PLUS'
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBinaryOperatorKindAccess().getPLUSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:3449:3: (enumLiteral_1= 'MINUS' )
                    {
                    // InternalQLS.g:3449:3: (enumLiteral_1= 'MINUS' )
                    // InternalQLS.g:3450:4: enumLiteral_1= 'MINUS'
                    {
                    enumLiteral_1=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBinaryOperatorKindAccess().getMINUSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalQLS.g:3457:3: (enumLiteral_2= 'MULT' )
                    {
                    // InternalQLS.g:3457:3: (enumLiteral_2= 'MULT' )
                    // InternalQLS.g:3458:4: enumLiteral_2= 'MULT'
                    {
                    enumLiteral_2=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBinaryOperatorKindAccess().getMULTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalQLS.g:3465:3: (enumLiteral_3= 'DIV' )
                    {
                    // InternalQLS.g:3465:3: (enumLiteral_3= 'DIV' )
                    // InternalQLS.g:3466:4: enumLiteral_3= 'DIV'
                    {
                    enumLiteral_3=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getDIVEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBinaryOperatorKindAccess().getDIVEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalQLS.g:3473:3: (enumLiteral_4= 'EQUAL' )
                    {
                    // InternalQLS.g:3473:3: (enumLiteral_4= 'EQUAL' )
                    // InternalQLS.g:3474:4: enumLiteral_4= 'EQUAL'
                    {
                    enumLiteral_4=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getEQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getBinaryOperatorKindAccess().getEQUALEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalQLS.g:3481:3: (enumLiteral_5= 'NOTEQUAL' )
                    {
                    // InternalQLS.g:3481:3: (enumLiteral_5= 'NOTEQUAL' )
                    // InternalQLS.g:3482:4: enumLiteral_5= 'NOTEQUAL'
                    {
                    enumLiteral_5=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getNOTEQUALEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getBinaryOperatorKindAccess().getNOTEQUALEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalQLS.g:3489:3: (enumLiteral_6= 'GREATER' )
                    {
                    // InternalQLS.g:3489:3: (enumLiteral_6= 'GREATER' )
                    // InternalQLS.g:3490:4: enumLiteral_6= 'GREATER'
                    {
                    enumLiteral_6=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getGREATEREnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getBinaryOperatorKindAccess().getGREATEREnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalQLS.g:3497:3: (enumLiteral_7= 'LOWER' )
                    {
                    // InternalQLS.g:3497:3: (enumLiteral_7= 'LOWER' )
                    // InternalQLS.g:3498:4: enumLiteral_7= 'LOWER'
                    {
                    enumLiteral_7=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getLOWEREnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getBinaryOperatorKindAccess().getLOWEREnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalQLS.g:3505:3: (enumLiteral_8= 'GREATEROREQUAL' )
                    {
                    // InternalQLS.g:3505:3: (enumLiteral_8= 'GREATEROREQUAL' )
                    // InternalQLS.g:3506:4: enumLiteral_8= 'GREATEROREQUAL'
                    {
                    enumLiteral_8=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getBinaryOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalQLS.g:3513:3: (enumLiteral_9= 'LOWEROREQUAL' )
                    {
                    // InternalQLS.g:3513:3: (enumLiteral_9= 'LOWEROREQUAL' )
                    // InternalQLS.g:3514:4: enumLiteral_9= 'LOWEROREQUAL'
                    {
                    enumLiteral_9=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getLOWEROREQUALEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getBinaryOperatorKindAccess().getLOWEROREQUALEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalQLS.g:3521:3: (enumLiteral_10= 'AND' )
                    {
                    // InternalQLS.g:3521:3: (enumLiteral_10= 'AND' )
                    // InternalQLS.g:3522:4: enumLiteral_10= 'AND'
                    {
                    enumLiteral_10=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getANDEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getBinaryOperatorKindAccess().getANDEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalQLS.g:3529:3: (enumLiteral_11= 'OR' )
                    {
                    // InternalQLS.g:3529:3: (enumLiteral_11= 'OR' )
                    // InternalQLS.g:3530:4: enumLiteral_11= 'OR'
                    {
                    enumLiteral_11=(Token)match(input,78,FOLLOW_2); 

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
    // InternalQLS.g:3540:1: ruleUnaryOperatorKind returns [Enumerator current=null] : ( (enumLiteral_0= '-' ) | (enumLiteral_1= 'not' ) ) ;
    public final Enumerator ruleUnaryOperatorKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalQLS.g:3546:2: ( ( (enumLiteral_0= '-' ) | (enumLiteral_1= 'not' ) ) )
            // InternalQLS.g:3547:2: ( (enumLiteral_0= '-' ) | (enumLiteral_1= 'not' ) )
            {
            // InternalQLS.g:3547:2: ( (enumLiteral_0= '-' ) | (enumLiteral_1= 'not' ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==56) ) {
                alt60=1;
            }
            else if ( (LA60_0==79) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalQLS.g:3548:3: (enumLiteral_0= '-' )
                    {
                    // InternalQLS.g:3548:3: (enumLiteral_0= '-' )
                    // InternalQLS.g:3549:4: enumLiteral_0= '-'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getUnaryOperatorKindAccess().getUNARYMINUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorKindAccess().getUNARYMINUSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:3556:3: (enumLiteral_1= 'not' )
                    {
                    // InternalQLS.g:3556:3: (enumLiteral_1= 'not' )
                    // InternalQLS.g:3557:4: enumLiteral_1= 'not'
                    {
                    enumLiteral_1=(Token)match(input,79,FOLLOW_2); 

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
    // InternalQLS.g:3567:1: ruleAdditionOperatorKind returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditionOperatorKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalQLS.g:3573:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalQLS.g:3574:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalQLS.g:3574:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==80) ) {
                alt61=1;
            }
            else if ( (LA61_0==56) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalQLS.g:3575:3: (enumLiteral_0= '+' )
                    {
                    // InternalQLS.g:3575:3: (enumLiteral_0= '+' )
                    // InternalQLS.g:3576:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getAdditionOperatorKindAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAdditionOperatorKindAccess().getPLUSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:3583:3: (enumLiteral_1= '-' )
                    {
                    // InternalQLS.g:3583:3: (enumLiteral_1= '-' )
                    // InternalQLS.g:3584:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); 

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
    // InternalQLS.g:3594:1: ruleMultiplicationOperatorKind returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) ;
    public final Enumerator ruleMultiplicationOperatorKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalQLS.g:3600:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) )
            // InternalQLS.g:3601:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            {
            // InternalQLS.g:3601:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==81) ) {
                alt62=1;
            }
            else if ( (LA62_0==82) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // InternalQLS.g:3602:3: (enumLiteral_0= '*' )
                    {
                    // InternalQLS.g:3602:3: (enumLiteral_0= '*' )
                    // InternalQLS.g:3603:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicationOperatorKindAccess().getMULTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMultiplicationOperatorKindAccess().getMULTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:3610:3: (enumLiteral_1= '/' )
                    {
                    // InternalQLS.g:3610:3: (enumLiteral_1= '/' )
                    // InternalQLS.g:3611:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,82,FOLLOW_2); 

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
    // InternalQLS.g:3621:1: ruleEqualOperatorKind returns [Enumerator current=null] : (enumLiteral_0= '=' ) ;
    public final Enumerator ruleEqualOperatorKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalQLS.g:3627:2: ( (enumLiteral_0= '=' ) )
            // InternalQLS.g:3628:2: (enumLiteral_0= '=' )
            {
            // InternalQLS.g:3628:2: (enumLiteral_0= '=' )
            // InternalQLS.g:3629:3: enumLiteral_0= '='
            {
            enumLiteral_0=(Token)match(input,62,FOLLOW_2); 

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
    // InternalQLS.g:3638:1: ruleComparisionOperatorKind returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) ) ;
    public final Enumerator ruleComparisionOperatorKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalQLS.g:3644:2: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) ) )
            // InternalQLS.g:3645:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) )
            {
            // InternalQLS.g:3645:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) )
            int alt63=4;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt63=1;
                }
                break;
            case 84:
                {
                alt63=2;
                }
                break;
            case 85:
                {
                alt63=3;
                }
                break;
            case 86:
                {
                alt63=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // InternalQLS.g:3646:3: (enumLiteral_0= '>' )
                    {
                    // InternalQLS.g:3646:3: (enumLiteral_0= '>' )
                    // InternalQLS.g:3647:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getComparisionOperatorKindAccess().getGREATEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getComparisionOperatorKindAccess().getGREATEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:3654:3: (enumLiteral_1= '<' )
                    {
                    // InternalQLS.g:3654:3: (enumLiteral_1= '<' )
                    // InternalQLS.g:3655:4: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getComparisionOperatorKindAccess().getLOWEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getComparisionOperatorKindAccess().getLOWEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalQLS.g:3662:3: (enumLiteral_2= '>=' )
                    {
                    // InternalQLS.g:3662:3: (enumLiteral_2= '>=' )
                    // InternalQLS.g:3663:4: enumLiteral_2= '>='
                    {
                    enumLiteral_2=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getComparisionOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getComparisionOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalQLS.g:3670:3: (enumLiteral_3= '<=' )
                    {
                    // InternalQLS.g:3670:3: (enumLiteral_3= '<=' )
                    // InternalQLS.g:3671:4: enumLiteral_3= '<='
                    {
                    enumLiteral_3=(Token)match(input,86,FOLLOW_2); 

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
    // InternalQLS.g:3681:1: ruleAndOperatorKind returns [Enumerator current=null] : (enumLiteral_0= 'and' ) ;
    public final Enumerator ruleAndOperatorKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalQLS.g:3687:2: ( (enumLiteral_0= 'and' ) )
            // InternalQLS.g:3688:2: (enumLiteral_0= 'and' )
            {
            // InternalQLS.g:3688:2: (enumLiteral_0= 'and' )
            // InternalQLS.g:3689:3: enumLiteral_0= 'and'
            {
            enumLiteral_0=(Token)match(input,87,FOLLOW_2); 

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
    // InternalQLS.g:3698:1: ruleOrOperatorKind returns [Enumerator current=null] : (enumLiteral_0= 'or' ) ;
    public final Enumerator ruleOrOperatorKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalQLS.g:3704:2: ( (enumLiteral_0= 'or' ) )
            // InternalQLS.g:3705:2: (enumLiteral_0= 'or' )
            {
            // InternalQLS.g:3705:2: (enumLiteral_0= 'or' )
            // InternalQLS.g:3706:3: enumLiteral_0= 'or'
            {
            enumLiteral_0=(Token)match(input,88,FOLLOW_2); 

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


    protected DFA22 dfa22 = new DFA22(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\2\uffff\1\5\3\uffff\1\5";
    static final String dfa_3s = "\1\4\1\uffff\1\14\1\5\2\uffff\1\14";
    static final String dfa_4s = "\1\65\1\uffff\1\130\1\5\2\uffff\1\130";
    static final String dfa_5s = "\1\uffff\1\1\2\uffff\1\2\1\3\1\uffff";
    static final String dfa_6s = "\7\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\1\35\uffff\2\1\17\uffff\1\1",
            "",
            "\1\5\17\uffff\1\4\1\5\1\uffff\3\5\23\uffff\1\3\2\uffff\1\5\5\uffff\2\5\20\uffff\11\5",
            "\1\6",
            "",
            "",
            "\1\5\17\uffff\1\4\1\5\1\uffff\3\5\23\uffff\1\3\2\uffff\1\5\5\uffff\2\5\20\uffff\11\5"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1480:2: (this_ConstantCall_0= ruleConstantCall | this_QuestionCall_1= ruleQuestionCall | this_EnumerationCall_2= ruleEnumerationCall )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000064000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004600000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000184000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0020000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008004000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0120003050000070L,0x0000000000008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0020003050000070L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000002L,0x0000000000780000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0100000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000002L,0x0000000000060000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000040001000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0604E68000004000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000040005020L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000004000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000190000004000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000180000004000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000100000004000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001010000004000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0001000000004000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0002000000004000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0010000000004000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0100000000000040L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x2000000010000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x1800000020000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x1000000020000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0028003000000050L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0020000000000002L});

}