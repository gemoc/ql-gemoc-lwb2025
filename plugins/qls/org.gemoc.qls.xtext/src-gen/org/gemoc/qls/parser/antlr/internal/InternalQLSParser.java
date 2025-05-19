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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'QLSModel'", "'{'", "'questionStyles'", "'}'", "'import'", "'section'", "'styledQuestion'", "'labelStyle'", "'typeStyle'", "'italic'", "'bold'", "'BooleanStyle'", "'NumericStyle'", "'textField'", "'spinner'", "'step'", "'TextStyle'", "'multiline'", "'('", "')'", "'if'", "'then'", "'else'", "'endif'", "'true'", "'false'", "'EDate'", "'ValueType'", "'unit'", "'booleanType'", "'integerType'", "'min'", "'max'", "'decimalType'", "'dateType'", "'enumerationType'", "'literals'", "','", "'StringType'", "'DateValue'", "'dateValue'", "'.'", "'E'", "'e'", "'-'", "'mandatory'", "'question'", "'isDisplayed'", "'currentValue'", "':'", "'='", "';'", "'CHECKBOX'", "'TWO_RADIO'", "'DROPDOWN'", "'PLUS'", "'MINUS'", "'MULT'", "'DIV'", "'EQUAL'", "'NOTEQUAL'", "'GREATER'", "'LOWER'", "'GREATEROREQUAL'", "'LOWEROREQUAL'", "'AND'", "'OR'", "'not'", "'+'", "'*'", "'/'", "'>'", "'<'", "'>='", "'<='", "'and'", "'or'"
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
    // InternalQLS.g:72:1: ruleQLSModel returns [EObject current=null] : ( () ( (lv_imports_1_0= ruleImport ) )* otherlv_2= 'QLSModel' ( ( ruleQualifiedName ) ) otherlv_4= '{' otherlv_5= 'questionStyles' otherlv_6= '{' ( (lv_questionStyles_7_0= ruleQuestionStyle ) )* otherlv_8= '}' ( (lv_sections_9_0= ruleSection ) )* otherlv_10= '}' ) ;
    public final EObject ruleQLSModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_imports_1_0 = null;

        EObject lv_questionStyles_7_0 = null;

        EObject lv_sections_9_0 = null;



        	enterRule();

        try {
            // InternalQLS.g:78:2: ( ( () ( (lv_imports_1_0= ruleImport ) )* otherlv_2= 'QLSModel' ( ( ruleQualifiedName ) ) otherlv_4= '{' otherlv_5= 'questionStyles' otherlv_6= '{' ( (lv_questionStyles_7_0= ruleQuestionStyle ) )* otherlv_8= '}' ( (lv_sections_9_0= ruleSection ) )* otherlv_10= '}' ) )
            // InternalQLS.g:79:2: ( () ( (lv_imports_1_0= ruleImport ) )* otherlv_2= 'QLSModel' ( ( ruleQualifiedName ) ) otherlv_4= '{' otherlv_5= 'questionStyles' otherlv_6= '{' ( (lv_questionStyles_7_0= ruleQuestionStyle ) )* otherlv_8= '}' ( (lv_sections_9_0= ruleSection ) )* otherlv_10= '}' )
            {
            // InternalQLS.g:79:2: ( () ( (lv_imports_1_0= ruleImport ) )* otherlv_2= 'QLSModel' ( ( ruleQualifiedName ) ) otherlv_4= '{' otherlv_5= 'questionStyles' otherlv_6= '{' ( (lv_questionStyles_7_0= ruleQuestionStyle ) )* otherlv_8= '}' ( (lv_sections_9_0= ruleSection ) )* otherlv_10= '}' )
            // InternalQLS.g:80:3: () ( (lv_imports_1_0= ruleImport ) )* otherlv_2= 'QLSModel' ( ( ruleQualifiedName ) ) otherlv_4= '{' otherlv_5= 'questionStyles' otherlv_6= '{' ( (lv_questionStyles_7_0= ruleQuestionStyle ) )* otherlv_8= '}' ( (lv_sections_9_0= ruleSection ) )* otherlv_10= '}'
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
            		
            // InternalQLS.g:110:3: ( ( ruleQualifiedName ) )
            // InternalQLS.g:111:4: ( ruleQualifiedName )
            {
            // InternalQLS.g:111:4: ( ruleQualifiedName )
            // InternalQLS.g:112:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQLSModelRule());
            					}
            				

            					newCompositeNode(grammarAccess.getQLSModelAccess().getStyledQLModelQLModelCrossReference_3_0());
            				
            pushFollow(FOLLOW_5);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getQLSModelAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getQLSModelAccess().getQuestionStylesKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getQLSModelAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalQLS.g:138:3: ( (lv_questionStyles_7_0= ruleQuestionStyle ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalQLS.g:139:4: (lv_questionStyles_7_0= ruleQuestionStyle )
            	    {
            	    // InternalQLS.g:139:4: (lv_questionStyles_7_0= ruleQuestionStyle )
            	    // InternalQLS.g:140:5: lv_questionStyles_7_0= ruleQuestionStyle
            	    {

            	    					newCompositeNode(grammarAccess.getQLSModelAccess().getQuestionStylesQuestionStyleParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_questionStyles_7_0=ruleQuestionStyle();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQLSModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"questionStyles",
            	    						lv_questionStyles_7_0,
            	    						"org.gemoc.qls.QLS.QuestionStyle");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getQLSModelAccess().getRightCurlyBracketKeyword_8());
            		
            // InternalQLS.g:161:3: ( (lv_sections_9_0= ruleSection ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalQLS.g:162:4: (lv_sections_9_0= ruleSection )
            	    {
            	    // InternalQLS.g:162:4: (lv_sections_9_0= ruleSection )
            	    // InternalQLS.g:163:5: lv_sections_9_0= ruleSection
            	    {

            	    					newCompositeNode(grammarAccess.getQLSModelAccess().getSectionsSectionParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_sections_9_0=ruleSection();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQLSModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sections",
            	    						lv_sections_9_0,
            	    						"org.gemoc.qls.QLS.Section");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getQLSModelAccess().getRightCurlyBracketKeyword_10());
            		

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
    // InternalQLS.g:188:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalQLS.g:188:47: (iv_ruleImport= ruleImport EOF )
            // InternalQLS.g:189:2: iv_ruleImport= ruleImport EOF
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
    // InternalQLS.g:195:1: ruleImport returns [EObject current=null] : ( () otherlv_1= 'import' ( (lv_importURI_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_importURI_2_0=null;


        	enterRule();

        try {
            // InternalQLS.g:201:2: ( ( () otherlv_1= 'import' ( (lv_importURI_2_0= RULE_STRING ) ) ) )
            // InternalQLS.g:202:2: ( () otherlv_1= 'import' ( (lv_importURI_2_0= RULE_STRING ) ) )
            {
            // InternalQLS.g:202:2: ( () otherlv_1= 'import' ( (lv_importURI_2_0= RULE_STRING ) ) )
            // InternalQLS.g:203:3: () otherlv_1= 'import' ( (lv_importURI_2_0= RULE_STRING ) )
            {
            // InternalQLS.g:203:3: ()
            // InternalQLS.g:204:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getImportAccess().getImportAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getImportAccess().getImportKeyword_1());
            		
            // InternalQLS.g:214:3: ( (lv_importURI_2_0= RULE_STRING ) )
            // InternalQLS.g:215:4: (lv_importURI_2_0= RULE_STRING )
            {
            // InternalQLS.g:215:4: (lv_importURI_2_0= RULE_STRING )
            // InternalQLS.g:216:5: lv_importURI_2_0= RULE_STRING
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


    // $ANTLR start "entryRuleSection"
    // InternalQLS.g:236:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // InternalQLS.g:236:48: (iv_ruleSection= ruleSection EOF )
            // InternalQLS.g:237:2: iv_ruleSection= ruleSection EOF
            {
             newCompositeNode(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSection=ruleSection();

            state._fsp--;

             current =iv_ruleSection; 
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
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalQLS.g:243:1: ruleSection returns [EObject current=null] : ( () otherlv_1= 'section' ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_sectionContents_4_0= ruleSectionContent ) )* otherlv_5= '}' ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_title_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_sectionContents_4_0 = null;



        	enterRule();

        try {
            // InternalQLS.g:249:2: ( ( () otherlv_1= 'section' ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_sectionContents_4_0= ruleSectionContent ) )* otherlv_5= '}' ) )
            // InternalQLS.g:250:2: ( () otherlv_1= 'section' ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_sectionContents_4_0= ruleSectionContent ) )* otherlv_5= '}' )
            {
            // InternalQLS.g:250:2: ( () otherlv_1= 'section' ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_sectionContents_4_0= ruleSectionContent ) )* otherlv_5= '}' )
            // InternalQLS.g:251:3: () otherlv_1= 'section' ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_sectionContents_4_0= ruleSectionContent ) )* otherlv_5= '}'
            {
            // InternalQLS.g:251:3: ()
            // InternalQLS.g:252:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSectionAccess().getSectionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getSectionAccess().getSectionKeyword_1());
            		
            // InternalQLS.g:262:3: ( (lv_title_2_0= RULE_STRING ) )
            // InternalQLS.g:263:4: (lv_title_2_0= RULE_STRING )
            {
            // InternalQLS.g:263:4: (lv_title_2_0= RULE_STRING )
            // InternalQLS.g:264:5: lv_title_2_0= RULE_STRING
            {
            lv_title_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_title_2_0, grammarAccess.getSectionAccess().getTitleSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQLS.g:284:3: ( (lv_sectionContents_4_0= ruleSectionContent ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalQLS.g:285:4: (lv_sectionContents_4_0= ruleSectionContent )
            	    {
            	    // InternalQLS.g:285:4: (lv_sectionContents_4_0= ruleSectionContent )
            	    // InternalQLS.g:286:5: lv_sectionContents_4_0= ruleSectionContent
            	    {

            	    					newCompositeNode(grammarAccess.getSectionAccess().getSectionContentsSectionContentParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_sectionContents_4_0=ruleSectionContent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sectionContents",
            	    						lv_sectionContents_4_0,
            	    						"org.gemoc.qls.QLS.SectionContent");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleSectionContent"
    // InternalQLS.g:311:1: entryRuleSectionContent returns [EObject current=null] : iv_ruleSectionContent= ruleSectionContent EOF ;
    public final EObject entryRuleSectionContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionContent = null;


        try {
            // InternalQLS.g:311:55: (iv_ruleSectionContent= ruleSectionContent EOF )
            // InternalQLS.g:312:2: iv_ruleSectionContent= ruleSectionContent EOF
            {
             newCompositeNode(grammarAccess.getSectionContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSectionContent=ruleSectionContent();

            state._fsp--;

             current =iv_ruleSectionContent; 
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
    // $ANTLR end "entryRuleSectionContent"


    // $ANTLR start "ruleSectionContent"
    // InternalQLS.g:318:1: ruleSectionContent returns [EObject current=null] : (this_Section_0= ruleSection | this_QuestionReference_1= ruleQuestionReference ) ;
    public final EObject ruleSectionContent() throws RecognitionException {
        EObject current = null;

        EObject this_Section_0 = null;

        EObject this_QuestionReference_1 = null;



        	enterRule();

        try {
            // InternalQLS.g:324:2: ( (this_Section_0= ruleSection | this_QuestionReference_1= ruleQuestionReference ) )
            // InternalQLS.g:325:2: (this_Section_0= ruleSection | this_QuestionReference_1= ruleQuestionReference )
            {
            // InternalQLS.g:325:2: (this_Section_0= ruleSection | this_QuestionReference_1= ruleQuestionReference )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalQLS.g:326:3: this_Section_0= ruleSection
                    {

                    			newCompositeNode(grammarAccess.getSectionContentAccess().getSectionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Section_0=ruleSection();

                    state._fsp--;


                    			current = this_Section_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQLS.g:335:3: this_QuestionReference_1= ruleQuestionReference
                    {

                    			newCompositeNode(grammarAccess.getSectionContentAccess().getQuestionReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_QuestionReference_1=ruleQuestionReference();

                    state._fsp--;


                    			current = this_QuestionReference_1;
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
    // $ANTLR end "ruleSectionContent"


    // $ANTLR start "entryRuleQuestionReference"
    // InternalQLS.g:347:1: entryRuleQuestionReference returns [EObject current=null] : iv_ruleQuestionReference= ruleQuestionReference EOF ;
    public final EObject entryRuleQuestionReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionReference = null;


        try {
            // InternalQLS.g:347:58: (iv_ruleQuestionReference= ruleQuestionReference EOF )
            // InternalQLS.g:348:2: iv_ruleQuestionReference= ruleQuestionReference EOF
            {
             newCompositeNode(grammarAccess.getQuestionReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuestionReference=ruleQuestionReference();

            state._fsp--;

             current =iv_ruleQuestionReference; 
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
    // $ANTLR end "entryRuleQuestionReference"


    // $ANTLR start "ruleQuestionReference"
    // InternalQLS.g:354:1: ruleQuestionReference returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleQuestionReference() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalQLS.g:360:2: ( ( () ( ( ruleQualifiedName ) ) ) )
            // InternalQLS.g:361:2: ( () ( ( ruleQualifiedName ) ) )
            {
            // InternalQLS.g:361:2: ( () ( ( ruleQualifiedName ) ) )
            // InternalQLS.g:362:3: () ( ( ruleQualifiedName ) )
            {
            // InternalQLS.g:362:3: ()
            // InternalQLS.g:363:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQuestionReferenceAccess().getQuestionReferenceAction_0(),
            					current);
            			

            }

            // InternalQLS.g:369:3: ( ( ruleQualifiedName ) )
            // InternalQLS.g:370:4: ( ruleQualifiedName )
            {
            // InternalQLS.g:370:4: ( ruleQualifiedName )
            // InternalQLS.g:371:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuestionReferenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getQuestionReferenceAccess().getQuestionQuestionDefinitionCrossReference_1_0());
            				
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
    // $ANTLR end "ruleQuestionReference"


    // $ANTLR start "entryRuleTypeStyle"
    // InternalQLS.g:389:1: entryRuleTypeStyle returns [EObject current=null] : iv_ruleTypeStyle= ruleTypeStyle EOF ;
    public final EObject entryRuleTypeStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeStyle = null;


        try {
            // InternalQLS.g:389:50: (iv_ruleTypeStyle= ruleTypeStyle EOF )
            // InternalQLS.g:390:2: iv_ruleTypeStyle= ruleTypeStyle EOF
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
    // InternalQLS.g:396:1: ruleTypeStyle returns [EObject current=null] : (this_BooleanTypeStyle_0= ruleBooleanTypeStyle | this_NumericTypeStyle_1= ruleNumericTypeStyle | this_TextTypeStyle_2= ruleTextTypeStyle ) ;
    public final EObject ruleTypeStyle() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanTypeStyle_0 = null;

        EObject this_NumericTypeStyle_1 = null;

        EObject this_TextTypeStyle_2 = null;



        	enterRule();

        try {
            // InternalQLS.g:402:2: ( (this_BooleanTypeStyle_0= ruleBooleanTypeStyle | this_NumericTypeStyle_1= ruleNumericTypeStyle | this_TextTypeStyle_2= ruleTextTypeStyle ) )
            // InternalQLS.g:403:2: (this_BooleanTypeStyle_0= ruleBooleanTypeStyle | this_NumericTypeStyle_1= ruleNumericTypeStyle | this_TextTypeStyle_2= ruleTextTypeStyle )
            {
            // InternalQLS.g:403:2: (this_BooleanTypeStyle_0= ruleBooleanTypeStyle | this_NumericTypeStyle_1= ruleNumericTypeStyle | this_TextTypeStyle_2= ruleTextTypeStyle )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt6=1;
                }
                break;
            case 23:
                {
                alt6=2;
                }
                break;
            case 27:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalQLS.g:404:3: this_BooleanTypeStyle_0= ruleBooleanTypeStyle
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
                    // InternalQLS.g:413:3: this_NumericTypeStyle_1= ruleNumericTypeStyle
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
                    // InternalQLS.g:422:3: this_TextTypeStyle_2= ruleTextTypeStyle
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
    // InternalQLS.g:434:1: entryRuleNumericTypeStyle returns [EObject current=null] : iv_ruleNumericTypeStyle= ruleNumericTypeStyle EOF ;
    public final EObject entryRuleNumericTypeStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericTypeStyle = null;


        try {
            // InternalQLS.g:434:57: (iv_ruleNumericTypeStyle= ruleNumericTypeStyle EOF )
            // InternalQLS.g:435:2: iv_ruleNumericTypeStyle= ruleNumericTypeStyle EOF
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
    // InternalQLS.g:441:1: ruleNumericTypeStyle returns [EObject current=null] : (this_NumericTypeTextFieldStyle_0= ruleNumericTypeTextFieldStyle | this_NumericTypeSpinnerStyle_1= ruleNumericTypeSpinnerStyle ) ;
    public final EObject ruleNumericTypeStyle() throws RecognitionException {
        EObject current = null;

        EObject this_NumericTypeTextFieldStyle_0 = null;

        EObject this_NumericTypeSpinnerStyle_1 = null;



        	enterRule();

        try {
            // InternalQLS.g:447:2: ( (this_NumericTypeTextFieldStyle_0= ruleNumericTypeTextFieldStyle | this_NumericTypeSpinnerStyle_1= ruleNumericTypeSpinnerStyle ) )
            // InternalQLS.g:448:2: (this_NumericTypeTextFieldStyle_0= ruleNumericTypeTextFieldStyle | this_NumericTypeSpinnerStyle_1= ruleNumericTypeSpinnerStyle )
            {
            // InternalQLS.g:448:2: (this_NumericTypeTextFieldStyle_0= ruleNumericTypeTextFieldStyle | this_NumericTypeSpinnerStyle_1= ruleNumericTypeSpinnerStyle )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==25) ) {
                    alt7=2;
                }
                else if ( (LA7_1==24) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalQLS.g:449:3: this_NumericTypeTextFieldStyle_0= ruleNumericTypeTextFieldStyle
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
                    // InternalQLS.g:458:3: this_NumericTypeSpinnerStyle_1= ruleNumericTypeSpinnerStyle
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
    // InternalQLS.g:470:1: entryRuleQuestionStyle returns [EObject current=null] : iv_ruleQuestionStyle= ruleQuestionStyle EOF ;
    public final EObject entryRuleQuestionStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionStyle = null;


        try {
            // InternalQLS.g:470:54: (iv_ruleQuestionStyle= ruleQuestionStyle EOF )
            // InternalQLS.g:471:2: iv_ruleQuestionStyle= ruleQuestionStyle EOF
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
    // InternalQLS.g:477:1: ruleQuestionStyle returns [EObject current=null] : (otherlv_0= 'styledQuestion' ( ( ruleQualifiedName ) ) otherlv_2= '{' (otherlv_3= 'labelStyle' ( (lv_labelStyle_4_0= ruleLabelStyle ) ) )? (otherlv_5= 'typeStyle' ( (lv_typeStyle_6_0= ruleTypeStyle ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleQuestionStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_labelStyle_4_0 = null;

        EObject lv_typeStyle_6_0 = null;



        	enterRule();

        try {
            // InternalQLS.g:483:2: ( (otherlv_0= 'styledQuestion' ( ( ruleQualifiedName ) ) otherlv_2= '{' (otherlv_3= 'labelStyle' ( (lv_labelStyle_4_0= ruleLabelStyle ) ) )? (otherlv_5= 'typeStyle' ( (lv_typeStyle_6_0= ruleTypeStyle ) ) )? otherlv_7= '}' ) )
            // InternalQLS.g:484:2: (otherlv_0= 'styledQuestion' ( ( ruleQualifiedName ) ) otherlv_2= '{' (otherlv_3= 'labelStyle' ( (lv_labelStyle_4_0= ruleLabelStyle ) ) )? (otherlv_5= 'typeStyle' ( (lv_typeStyle_6_0= ruleTypeStyle ) ) )? otherlv_7= '}' )
            {
            // InternalQLS.g:484:2: (otherlv_0= 'styledQuestion' ( ( ruleQualifiedName ) ) otherlv_2= '{' (otherlv_3= 'labelStyle' ( (lv_labelStyle_4_0= ruleLabelStyle ) ) )? (otherlv_5= 'typeStyle' ( (lv_typeStyle_6_0= ruleTypeStyle ) ) )? otherlv_7= '}' )
            // InternalQLS.g:485:3: otherlv_0= 'styledQuestion' ( ( ruleQualifiedName ) ) otherlv_2= '{' (otherlv_3= 'labelStyle' ( (lv_labelStyle_4_0= ruleLabelStyle ) ) )? (otherlv_5= 'typeStyle' ( (lv_typeStyle_6_0= ruleTypeStyle ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getQuestionStyleAccess().getStyledQuestionKeyword_0());
            		
            // InternalQLS.g:489:3: ( ( ruleQualifiedName ) )
            // InternalQLS.g:490:4: ( ruleQualifiedName )
            {
            // InternalQLS.g:490:4: ( ruleQualifiedName )
            // InternalQLS.g:491:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuestionStyleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getQuestionStyleAccess().getStyledQuestionQuestionDefinitionCrossReference_1_0());
            				
            pushFollow(FOLLOW_5);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getQuestionStyleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQLS.g:509:3: (otherlv_3= 'labelStyle' ( (lv_labelStyle_4_0= ruleLabelStyle ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalQLS.g:510:4: otherlv_3= 'labelStyle' ( (lv_labelStyle_4_0= ruleLabelStyle ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getQuestionStyleAccess().getLabelStyleKeyword_3_0());
                    			
                    // InternalQLS.g:514:4: ( (lv_labelStyle_4_0= ruleLabelStyle ) )
                    // InternalQLS.g:515:5: (lv_labelStyle_4_0= ruleLabelStyle )
                    {
                    // InternalQLS.g:515:5: (lv_labelStyle_4_0= ruleLabelStyle )
                    // InternalQLS.g:516:6: lv_labelStyle_4_0= ruleLabelStyle
                    {

                    						newCompositeNode(grammarAccess.getQuestionStyleAccess().getLabelStyleLabelStyleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_12);
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

            // InternalQLS.g:534:3: (otherlv_5= 'typeStyle' ( (lv_typeStyle_6_0= ruleTypeStyle ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalQLS.g:535:4: otherlv_5= 'typeStyle' ( (lv_typeStyle_6_0= ruleTypeStyle ) )
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getQuestionStyleAccess().getTypeStyleKeyword_4_0());
                    			
                    // InternalQLS.g:539:4: ( (lv_typeStyle_6_0= ruleTypeStyle ) )
                    // InternalQLS.g:540:5: (lv_typeStyle_6_0= ruleTypeStyle )
                    {
                    // InternalQLS.g:540:5: (lv_typeStyle_6_0= ruleTypeStyle )
                    // InternalQLS.g:541:6: lv_typeStyle_6_0= ruleTypeStyle
                    {

                    						newCompositeNode(grammarAccess.getQuestionStyleAccess().getTypeStyleTypeStyleParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_14);
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
    // InternalQLS.g:567:1: entryRuleLabelStyle returns [EObject current=null] : iv_ruleLabelStyle= ruleLabelStyle EOF ;
    public final EObject entryRuleLabelStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelStyle = null;


        try {
            // InternalQLS.g:567:51: (iv_ruleLabelStyle= ruleLabelStyle EOF )
            // InternalQLS.g:568:2: iv_ruleLabelStyle= ruleLabelStyle EOF
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
    // InternalQLS.g:574:1: ruleLabelStyle returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_italic_2_0= 'italic' ) )? ( (lv_bold_3_0= 'bold' ) )? otherlv_4= '}' ) ;
    public final EObject ruleLabelStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_italic_2_0=null;
        Token lv_bold_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalQLS.g:580:2: ( ( () otherlv_1= '{' ( (lv_italic_2_0= 'italic' ) )? ( (lv_bold_3_0= 'bold' ) )? otherlv_4= '}' ) )
            // InternalQLS.g:581:2: ( () otherlv_1= '{' ( (lv_italic_2_0= 'italic' ) )? ( (lv_bold_3_0= 'bold' ) )? otherlv_4= '}' )
            {
            // InternalQLS.g:581:2: ( () otherlv_1= '{' ( (lv_italic_2_0= 'italic' ) )? ( (lv_bold_3_0= 'bold' ) )? otherlv_4= '}' )
            // InternalQLS.g:582:3: () otherlv_1= '{' ( (lv_italic_2_0= 'italic' ) )? ( (lv_bold_3_0= 'bold' ) )? otherlv_4= '}'
            {
            // InternalQLS.g:582:3: ()
            // InternalQLS.g:583:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLabelStyleAccess().getLabelStyleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getLabelStyleAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalQLS.g:593:3: ( (lv_italic_2_0= 'italic' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalQLS.g:594:4: (lv_italic_2_0= 'italic' )
                    {
                    // InternalQLS.g:594:4: (lv_italic_2_0= 'italic' )
                    // InternalQLS.g:595:5: lv_italic_2_0= 'italic'
                    {
                    lv_italic_2_0=(Token)match(input,20,FOLLOW_16); 

                    					newLeafNode(lv_italic_2_0, grammarAccess.getLabelStyleAccess().getItalicItalicKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLabelStyleRule());
                    					}
                    					setWithLastConsumed(current, "italic", lv_italic_2_0 != null, "italic");
                    				

                    }


                    }
                    break;

            }

            // InternalQLS.g:607:3: ( (lv_bold_3_0= 'bold' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalQLS.g:608:4: (lv_bold_3_0= 'bold' )
                    {
                    // InternalQLS.g:608:4: (lv_bold_3_0= 'bold' )
                    // InternalQLS.g:609:5: lv_bold_3_0= 'bold'
                    {
                    lv_bold_3_0=(Token)match(input,21,FOLLOW_14); 

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
    // InternalQLS.g:629:1: entryRuleBooleanTypeStyle returns [EObject current=null] : iv_ruleBooleanTypeStyle= ruleBooleanTypeStyle EOF ;
    public final EObject entryRuleBooleanTypeStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanTypeStyle = null;


        try {
            // InternalQLS.g:629:57: (iv_ruleBooleanTypeStyle= ruleBooleanTypeStyle EOF )
            // InternalQLS.g:630:2: iv_ruleBooleanTypeStyle= ruleBooleanTypeStyle EOF
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
    // InternalQLS.g:636:1: ruleBooleanTypeStyle returns [EObject current=null] : (otherlv_0= 'BooleanStyle' otherlv_1= '{' ( (lv_booleanStyleKind_2_0= ruleBooleanStyleKind ) ) otherlv_3= '}' ) ;
    public final EObject ruleBooleanTypeStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_booleanStyleKind_2_0 = null;



        	enterRule();

        try {
            // InternalQLS.g:642:2: ( (otherlv_0= 'BooleanStyle' otherlv_1= '{' ( (lv_booleanStyleKind_2_0= ruleBooleanStyleKind ) ) otherlv_3= '}' ) )
            // InternalQLS.g:643:2: (otherlv_0= 'BooleanStyle' otherlv_1= '{' ( (lv_booleanStyleKind_2_0= ruleBooleanStyleKind ) ) otherlv_3= '}' )
            {
            // InternalQLS.g:643:2: (otherlv_0= 'BooleanStyle' otherlv_1= '{' ( (lv_booleanStyleKind_2_0= ruleBooleanStyleKind ) ) otherlv_3= '}' )
            // InternalQLS.g:644:3: otherlv_0= 'BooleanStyle' otherlv_1= '{' ( (lv_booleanStyleKind_2_0= ruleBooleanStyleKind ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getBooleanTypeStyleAccess().getBooleanStyleKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getBooleanTypeStyleAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalQLS.g:652:3: ( (lv_booleanStyleKind_2_0= ruleBooleanStyleKind ) )
            // InternalQLS.g:653:4: (lv_booleanStyleKind_2_0= ruleBooleanStyleKind )
            {
            // InternalQLS.g:653:4: (lv_booleanStyleKind_2_0= ruleBooleanStyleKind )
            // InternalQLS.g:654:5: lv_booleanStyleKind_2_0= ruleBooleanStyleKind
            {

            					newCompositeNode(grammarAccess.getBooleanTypeStyleAccess().getBooleanStyleKindBooleanStyleKindEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
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
    // InternalQLS.g:679:1: entryRuleNumericTypeTextFieldStyle returns [EObject current=null] : iv_ruleNumericTypeTextFieldStyle= ruleNumericTypeTextFieldStyle EOF ;
    public final EObject entryRuleNumericTypeTextFieldStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericTypeTextFieldStyle = null;


        try {
            // InternalQLS.g:679:66: (iv_ruleNumericTypeTextFieldStyle= ruleNumericTypeTextFieldStyle EOF )
            // InternalQLS.g:680:2: iv_ruleNumericTypeTextFieldStyle= ruleNumericTypeTextFieldStyle EOF
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
    // InternalQLS.g:686:1: ruleNumericTypeTextFieldStyle returns [EObject current=null] : ( () otherlv_1= 'NumericStyle' otherlv_2= 'textField' otherlv_3= '{' otherlv_4= '}' ) ;
    public final EObject ruleNumericTypeTextFieldStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalQLS.g:692:2: ( ( () otherlv_1= 'NumericStyle' otherlv_2= 'textField' otherlv_3= '{' otherlv_4= '}' ) )
            // InternalQLS.g:693:2: ( () otherlv_1= 'NumericStyle' otherlv_2= 'textField' otherlv_3= '{' otherlv_4= '}' )
            {
            // InternalQLS.g:693:2: ( () otherlv_1= 'NumericStyle' otherlv_2= 'textField' otherlv_3= '{' otherlv_4= '}' )
            // InternalQLS.g:694:3: () otherlv_1= 'NumericStyle' otherlv_2= 'textField' otherlv_3= '{' otherlv_4= '}'
            {
            // InternalQLS.g:694:3: ()
            // InternalQLS.g:695:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNumericTypeTextFieldStyleAccess().getNumericTypeTextFieldStyleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getNumericTypeTextFieldStyleAccess().getNumericStyleKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getNumericTypeTextFieldStyleAccess().getTextFieldKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getNumericTypeTextFieldStyleAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getNumericTypeTextFieldStyleAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalQLS.g:721:1: entryRuleNumericTypeSpinnerStyle returns [EObject current=null] : iv_ruleNumericTypeSpinnerStyle= ruleNumericTypeSpinnerStyle EOF ;
    public final EObject entryRuleNumericTypeSpinnerStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericTypeSpinnerStyle = null;


        try {
            // InternalQLS.g:721:64: (iv_ruleNumericTypeSpinnerStyle= ruleNumericTypeSpinnerStyle EOF )
            // InternalQLS.g:722:2: iv_ruleNumericTypeSpinnerStyle= ruleNumericTypeSpinnerStyle EOF
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
    // InternalQLS.g:728:1: ruleNumericTypeSpinnerStyle returns [EObject current=null] : ( () otherlv_1= 'NumericStyle' otherlv_2= 'spinner' otherlv_3= '{' (otherlv_4= 'step' ( (lv_step_5_0= ruleEDouble ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleNumericTypeSpinnerStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_step_5_0 = null;



        	enterRule();

        try {
            // InternalQLS.g:734:2: ( ( () otherlv_1= 'NumericStyle' otherlv_2= 'spinner' otherlv_3= '{' (otherlv_4= 'step' ( (lv_step_5_0= ruleEDouble ) ) )? otherlv_6= '}' ) )
            // InternalQLS.g:735:2: ( () otherlv_1= 'NumericStyle' otherlv_2= 'spinner' otherlv_3= '{' (otherlv_4= 'step' ( (lv_step_5_0= ruleEDouble ) ) )? otherlv_6= '}' )
            {
            // InternalQLS.g:735:2: ( () otherlv_1= 'NumericStyle' otherlv_2= 'spinner' otherlv_3= '{' (otherlv_4= 'step' ( (lv_step_5_0= ruleEDouble ) ) )? otherlv_6= '}' )
            // InternalQLS.g:736:3: () otherlv_1= 'NumericStyle' otherlv_2= 'spinner' otherlv_3= '{' (otherlv_4= 'step' ( (lv_step_5_0= ruleEDouble ) ) )? otherlv_6= '}'
            {
            // InternalQLS.g:736:3: ()
            // InternalQLS.g:737:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNumericTypeSpinnerStyleAccess().getNumericTypeSpinnerStyleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getNumericTypeSpinnerStyleAccess().getNumericStyleKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getNumericTypeSpinnerStyleAccess().getSpinnerKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getNumericTypeSpinnerStyleAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQLS.g:755:3: (otherlv_4= 'step' ( (lv_step_5_0= ruleEDouble ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalQLS.g:756:4: otherlv_4= 'step' ( (lv_step_5_0= ruleEDouble ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getNumericTypeSpinnerStyleAccess().getStepKeyword_4_0());
                    			
                    // InternalQLS.g:760:4: ( (lv_step_5_0= ruleEDouble ) )
                    // InternalQLS.g:761:5: (lv_step_5_0= ruleEDouble )
                    {
                    // InternalQLS.g:761:5: (lv_step_5_0= ruleEDouble )
                    // InternalQLS.g:762:6: lv_step_5_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getNumericTypeSpinnerStyleAccess().getStepEDoubleParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_step_5_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNumericTypeSpinnerStyleRule());
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

            			newLeafNode(otherlv_6, grammarAccess.getNumericTypeSpinnerStyleAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalQLS.g:788:1: entryRuleTextTypeStyle returns [EObject current=null] : iv_ruleTextTypeStyle= ruleTextTypeStyle EOF ;
    public final EObject entryRuleTextTypeStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextTypeStyle = null;


        try {
            // InternalQLS.g:788:54: (iv_ruleTextTypeStyle= ruleTextTypeStyle EOF )
            // InternalQLS.g:789:2: iv_ruleTextTypeStyle= ruleTextTypeStyle EOF
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
    // InternalQLS.g:795:1: ruleTextTypeStyle returns [EObject current=null] : ( () otherlv_1= 'TextStyle' otherlv_2= '{' ( (lv_multiline_3_0= 'multiline' ) )? otherlv_4= '}' ) ;
    public final EObject ruleTextTypeStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_multiline_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalQLS.g:801:2: ( ( () otherlv_1= 'TextStyle' otherlv_2= '{' ( (lv_multiline_3_0= 'multiline' ) )? otherlv_4= '}' ) )
            // InternalQLS.g:802:2: ( () otherlv_1= 'TextStyle' otherlv_2= '{' ( (lv_multiline_3_0= 'multiline' ) )? otherlv_4= '}' )
            {
            // InternalQLS.g:802:2: ( () otherlv_1= 'TextStyle' otherlv_2= '{' ( (lv_multiline_3_0= 'multiline' ) )? otherlv_4= '}' )
            // InternalQLS.g:803:3: () otherlv_1= 'TextStyle' otherlv_2= '{' ( (lv_multiline_3_0= 'multiline' ) )? otherlv_4= '}'
            {
            // InternalQLS.g:803:3: ()
            // InternalQLS.g:804:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTextTypeStyleAccess().getTextTypeStyleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTextTypeStyleAccess().getTextStyleKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getTextTypeStyleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQLS.g:818:3: ( (lv_multiline_3_0= 'multiline' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalQLS.g:819:4: (lv_multiline_3_0= 'multiline' )
                    {
                    // InternalQLS.g:819:4: (lv_multiline_3_0= 'multiline' )
                    // InternalQLS.g:820:5: lv_multiline_3_0= 'multiline'
                    {
                    lv_multiline_3_0=(Token)match(input,28,FOLLOW_14); 

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
    // InternalQLS.g:840:1: entryRuleValueType returns [EObject current=null] : iv_ruleValueType= ruleValueType EOF ;
    public final EObject entryRuleValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueType = null;


        try {
            // InternalQLS.g:840:50: (iv_ruleValueType= ruleValueType EOF )
            // InternalQLS.g:841:2: iv_ruleValueType= ruleValueType EOF
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
    // InternalQLS.g:847:1: ruleValueType returns [EObject current=null] : (this_ValueType_Impl_0= ruleValueType_Impl | this_BooleanValueType_1= ruleBooleanValueType | this_IntegerValueType_2= ruleIntegerValueType | this_DecimalValueType_3= ruleDecimalValueType | this_DateValueType_4= ruleDateValueType | this_EnumerationValueType_5= ruleEnumerationValueType | this_StringValueType_6= ruleStringValueType ) ;
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
            // InternalQLS.g:853:2: ( (this_ValueType_Impl_0= ruleValueType_Impl | this_BooleanValueType_1= ruleBooleanValueType | this_IntegerValueType_2= ruleIntegerValueType | this_DecimalValueType_3= ruleDecimalValueType | this_DateValueType_4= ruleDateValueType | this_EnumerationValueType_5= ruleEnumerationValueType | this_StringValueType_6= ruleStringValueType ) )
            // InternalQLS.g:854:2: (this_ValueType_Impl_0= ruleValueType_Impl | this_BooleanValueType_1= ruleBooleanValueType | this_IntegerValueType_2= ruleIntegerValueType | this_DecimalValueType_3= ruleDecimalValueType | this_DateValueType_4= ruleDateValueType | this_EnumerationValueType_5= ruleEnumerationValueType | this_StringValueType_6= ruleStringValueType )
            {
            // InternalQLS.g:854:2: (this_ValueType_Impl_0= ruleValueType_Impl | this_BooleanValueType_1= ruleBooleanValueType | this_IntegerValueType_2= ruleIntegerValueType | this_DecimalValueType_3= ruleDecimalValueType | this_DateValueType_4= ruleDateValueType | this_EnumerationValueType_5= ruleEnumerationValueType | this_StringValueType_6= ruleStringValueType )
            int alt14=7;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt14=1;
                }
                break;
            case 40:
                {
                alt14=2;
                }
                break;
            case 41:
                {
                alt14=3;
                }
                break;
            case 44:
                {
                alt14=4;
                }
                break;
            case 45:
                {
                alt14=5;
                }
                break;
            case 46:
                {
                alt14=6;
                }
                break;
            case 49:
                {
                alt14=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalQLS.g:855:3: this_ValueType_Impl_0= ruleValueType_Impl
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
                    // InternalQLS.g:864:3: this_BooleanValueType_1= ruleBooleanValueType
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
                    // InternalQLS.g:873:3: this_IntegerValueType_2= ruleIntegerValueType
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
                    // InternalQLS.g:882:3: this_DecimalValueType_3= ruleDecimalValueType
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
                    // InternalQLS.g:891:3: this_DateValueType_4= ruleDateValueType
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
                    // InternalQLS.g:900:3: this_EnumerationValueType_5= ruleEnumerationValueType
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
                    // InternalQLS.g:909:3: this_StringValueType_6= ruleStringValueType
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
    // InternalQLS.g:921:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalQLS.g:921:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalQLS.g:922:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalQLS.g:928:1: ruleExpression returns [EObject current=null] : this_UnaryOrPrimaryExpression_0= ruleUnaryOrPrimaryExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryOrPrimaryExpression_0 = null;



        	enterRule();

        try {
            // InternalQLS.g:934:2: (this_UnaryOrPrimaryExpression_0= ruleUnaryOrPrimaryExpression )
            // InternalQLS.g:935:2: this_UnaryOrPrimaryExpression_0= ruleUnaryOrPrimaryExpression
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
    // InternalQLS.g:946:1: entryRuleUnaryOrPrimaryExpression returns [EObject current=null] : iv_ruleUnaryOrPrimaryExpression= ruleUnaryOrPrimaryExpression EOF ;
    public final EObject entryRuleUnaryOrPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOrPrimaryExpression = null;


        try {
            // InternalQLS.g:946:65: (iv_ruleUnaryOrPrimaryExpression= ruleUnaryOrPrimaryExpression EOF )
            // InternalQLS.g:947:2: iv_ruleUnaryOrPrimaryExpression= ruleUnaryOrPrimaryExpression EOF
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
    // InternalQLS.g:953:1: ruleUnaryOrPrimaryExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression | this_UnaryExpression_1= ruleUnaryExpression ) ;
    public final EObject ruleUnaryOrPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        EObject this_UnaryExpression_1 = null;



        	enterRule();

        try {
            // InternalQLS.g:959:2: ( (this_PrimaryExpression_0= rulePrimaryExpression | this_UnaryExpression_1= ruleUnaryExpression ) )
            // InternalQLS.g:960:2: (this_PrimaryExpression_0= rulePrimaryExpression | this_UnaryExpression_1= ruleUnaryExpression )
            {
            // InternalQLS.g:960:2: (this_PrimaryExpression_0= rulePrimaryExpression | this_UnaryExpression_1= ruleUnaryExpression )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_INT)||LA15_0==29||LA15_0==31||(LA15_0>=35 && LA15_0<=36)||LA15_0==52) ) {
                alt15=1;
            }
            else if ( (LA15_0==55||LA15_0==78) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalQLS.g:961:3: this_PrimaryExpression_0= rulePrimaryExpression
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
                    // InternalQLS.g:970:3: this_UnaryExpression_1= ruleUnaryExpression
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
    // InternalQLS.g:982:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalQLS.g:982:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalQLS.g:983:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalQLS.g:989:1: ruleUnaryExpression returns [EObject current=null] : ( () ( (lv_operator_1_0= ruleUnaryOperatorKind ) ) ( (lv_operand_2_0= ruleUnaryOrPrimaryExpression ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_operand_2_0 = null;



        	enterRule();

        try {
            // InternalQLS.g:995:2: ( ( () ( (lv_operator_1_0= ruleUnaryOperatorKind ) ) ( (lv_operand_2_0= ruleUnaryOrPrimaryExpression ) ) ) )
            // InternalQLS.g:996:2: ( () ( (lv_operator_1_0= ruleUnaryOperatorKind ) ) ( (lv_operand_2_0= ruleUnaryOrPrimaryExpression ) ) )
            {
            // InternalQLS.g:996:2: ( () ( (lv_operator_1_0= ruleUnaryOperatorKind ) ) ( (lv_operand_2_0= ruleUnaryOrPrimaryExpression ) ) )
            // InternalQLS.g:997:3: () ( (lv_operator_1_0= ruleUnaryOperatorKind ) ) ( (lv_operand_2_0= ruleUnaryOrPrimaryExpression ) )
            {
            // InternalQLS.g:997:3: ()
            // InternalQLS.g:998:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUnaryExpressionAccess().getBasicUnaryExpressionAction_0(),
            					current);
            			

            }

            // InternalQLS.g:1004:3: ( (lv_operator_1_0= ruleUnaryOperatorKind ) )
            // InternalQLS.g:1005:4: (lv_operator_1_0= ruleUnaryOperatorKind )
            {
            // InternalQLS.g:1005:4: (lv_operator_1_0= ruleUnaryOperatorKind )
            // InternalQLS.g:1006:5: lv_operator_1_0= ruleUnaryOperatorKind
            {

            					newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorKindEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
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

            // InternalQLS.g:1023:3: ( (lv_operand_2_0= ruleUnaryOrPrimaryExpression ) )
            // InternalQLS.g:1024:4: (lv_operand_2_0= ruleUnaryOrPrimaryExpression )
            {
            // InternalQLS.g:1024:4: (lv_operand_2_0= ruleUnaryOrPrimaryExpression )
            // InternalQLS.g:1025:5: lv_operand_2_0= ruleUnaryOrPrimaryExpression
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
    // InternalQLS.g:1046:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalQLS.g:1046:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalQLS.g:1047:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalQLS.g:1053:1: rulePrimaryExpression returns [EObject current=null] : (this_Call_0= ruleCall | this_IfExpression_1= ruleIfExpression | (otherlv_2= '(' (this_OrExpression_3= ruleOrExpression | this_UnaryExpression_4= ruleUnaryExpression ) otherlv_5= ')' ) ) ;
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
            // InternalQLS.g:1059:2: ( (this_Call_0= ruleCall | this_IfExpression_1= ruleIfExpression | (otherlv_2= '(' (this_OrExpression_3= ruleOrExpression | this_UnaryExpression_4= ruleUnaryExpression ) otherlv_5= ')' ) ) )
            // InternalQLS.g:1060:2: (this_Call_0= ruleCall | this_IfExpression_1= ruleIfExpression | (otherlv_2= '(' (this_OrExpression_3= ruleOrExpression | this_UnaryExpression_4= ruleUnaryExpression ) otherlv_5= ')' ) )
            {
            // InternalQLS.g:1060:2: (this_Call_0= ruleCall | this_IfExpression_1= ruleIfExpression | (otherlv_2= '(' (this_OrExpression_3= ruleOrExpression | this_UnaryExpression_4= ruleUnaryExpression ) otherlv_5= ')' ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
            case RULE_INT:
            case 35:
            case 36:
            case 52:
                {
                alt17=1;
                }
                break;
            case 31:
                {
                alt17=2;
                }
                break;
            case 29:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalQLS.g:1061:3: this_Call_0= ruleCall
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
                    // InternalQLS.g:1070:3: this_IfExpression_1= ruleIfExpression
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
                    // InternalQLS.g:1079:3: (otherlv_2= '(' (this_OrExpression_3= ruleOrExpression | this_UnaryExpression_4= ruleUnaryExpression ) otherlv_5= ')' )
                    {
                    // InternalQLS.g:1079:3: (otherlv_2= '(' (this_OrExpression_3= ruleOrExpression | this_UnaryExpression_4= ruleUnaryExpression ) otherlv_5= ')' )
                    // InternalQLS.g:1080:4: otherlv_2= '(' (this_OrExpression_3= ruleOrExpression | this_UnaryExpression_4= ruleUnaryExpression ) otherlv_5= ')'
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_23); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalQLS.g:1084:4: (this_OrExpression_3= ruleOrExpression | this_UnaryExpression_4= ruleUnaryExpression )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_INT)||LA16_0==29||LA16_0==31||(LA16_0>=35 && LA16_0<=36)||LA16_0==52) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==55||LA16_0==78) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalQLS.g:1085:5: this_OrExpression_3= ruleOrExpression
                            {

                            					newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOrExpressionParserRuleCall_2_1_0());
                            				
                            pushFollow(FOLLOW_24);
                            this_OrExpression_3=ruleOrExpression();

                            state._fsp--;


                            					current = this_OrExpression_3;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 2 :
                            // InternalQLS.g:1094:5: this_UnaryExpression_4= ruleUnaryExpression
                            {

                            					newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getUnaryExpressionParserRuleCall_2_1_1());
                            				
                            pushFollow(FOLLOW_24);
                            this_UnaryExpression_4=ruleUnaryExpression();

                            state._fsp--;


                            					current = this_UnaryExpression_4;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,30,FOLLOW_2); 

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
    // InternalQLS.g:1112:1: entryRuleIfExpression returns [EObject current=null] : iv_ruleIfExpression= ruleIfExpression EOF ;
    public final EObject entryRuleIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpression = null;


        try {
            // InternalQLS.g:1112:53: (iv_ruleIfExpression= ruleIfExpression EOF )
            // InternalQLS.g:1113:2: iv_ruleIfExpression= ruleIfExpression EOF
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
    // InternalQLS.g:1119:1: ruleIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleExpression ) ) (otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleExpression ) ) )? otherlv_7= 'endif' ) ;
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
            // InternalQLS.g:1125:2: ( ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleExpression ) ) (otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleExpression ) ) )? otherlv_7= 'endif' ) )
            // InternalQLS.g:1126:2: ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleExpression ) ) (otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleExpression ) ) )? otherlv_7= 'endif' )
            {
            // InternalQLS.g:1126:2: ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleExpression ) ) (otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleExpression ) ) )? otherlv_7= 'endif' )
            // InternalQLS.g:1127:3: () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleExpression ) ) (otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleExpression ) ) )? otherlv_7= 'endif'
            {
            // InternalQLS.g:1127:3: ()
            // InternalQLS.g:1128:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIfExpressionAccess().getIfExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getIfExpressionAccess().getIfKeyword_1());
            		
            // InternalQLS.g:1138:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalQLS.g:1139:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalQLS.g:1139:4: (lv_condition_2_0= ruleExpression )
            // InternalQLS.g:1140:5: lv_condition_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfExpressionAccess().getConditionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_25);
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

            otherlv_3=(Token)match(input,32,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getIfExpressionAccess().getThenKeyword_3());
            		
            // InternalQLS.g:1161:3: ( (lv_thenExpression_4_0= ruleExpression ) )
            // InternalQLS.g:1162:4: (lv_thenExpression_4_0= ruleExpression )
            {
            // InternalQLS.g:1162:4: (lv_thenExpression_4_0= ruleExpression )
            // InternalQLS.g:1163:5: lv_thenExpression_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfExpressionAccess().getThenExpressionExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_26);
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

            // InternalQLS.g:1180:3: (otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleExpression ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalQLS.g:1181:4: otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleExpression ) )
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_23); 

                    				newLeafNode(otherlv_5, grammarAccess.getIfExpressionAccess().getElseKeyword_5_0());
                    			
                    // InternalQLS.g:1185:4: ( (lv_elseExpression_6_0= ruleExpression ) )
                    // InternalQLS.g:1186:5: (lv_elseExpression_6_0= ruleExpression )
                    {
                    // InternalQLS.g:1186:5: (lv_elseExpression_6_0= ruleExpression )
                    // InternalQLS.g:1187:6: lv_elseExpression_6_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getIfExpressionAccess().getElseExpressionExpressionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_27);
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

            otherlv_7=(Token)match(input,34,FOLLOW_2); 

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
    // InternalQLS.g:1213:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalQLS.g:1213:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalQLS.g:1214:2: iv_ruleOrExpression= ruleOrExpression EOF
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
    // InternalQLS.g:1220:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rhsOperand_3_0 = null;



        	enterRule();

        try {
            // InternalQLS.g:1226:2: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAndExpression ) ) )* ) )
            // InternalQLS.g:1227:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAndExpression ) ) )* )
            {
            // InternalQLS.g:1227:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAndExpression ) ) )* )
            // InternalQLS.g:1228:3: this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current = this_AndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalQLS.g:1236:3: ( () ( (lv_operator_2_0= ruleOrOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAndExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==87) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalQLS.g:1237:4: () ( (lv_operator_2_0= ruleOrOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAndExpression ) )
            	    {
            	    // InternalQLS.g:1237:4: ()
            	    // InternalQLS.g:1238:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalQLS.g:1244:4: ( (lv_operator_2_0= ruleOrOperatorKind ) )
            	    // InternalQLS.g:1245:5: (lv_operator_2_0= ruleOrOperatorKind )
            	    {
            	    // InternalQLS.g:1245:5: (lv_operator_2_0= ruleOrOperatorKind )
            	    // InternalQLS.g:1246:6: lv_operator_2_0= ruleOrOperatorKind
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorKindEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_29);
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

            	    // InternalQLS.g:1263:4: ( (lv_rhsOperand_3_0= ruleAndExpression ) )
            	    // InternalQLS.g:1264:5: (lv_rhsOperand_3_0= ruleAndExpression )
            	    {
            	    // InternalQLS.g:1264:5: (lv_rhsOperand_3_0= ruleAndExpression )
            	    // InternalQLS.g:1265:6: lv_rhsOperand_3_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getRhsOperandAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_28);
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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalQLS.g:1287:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalQLS.g:1287:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalQLS.g:1288:2: iv_ruleAndExpression= ruleAndExpression EOF
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
    // InternalQLS.g:1294:1: ruleAndExpression returns [EObject current=null] : (this_EqualExpression_0= ruleEqualExpression ( () ( (lv_operator_2_0= ruleAndOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleEqualExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EqualExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rhsOperand_3_0 = null;



        	enterRule();

        try {
            // InternalQLS.g:1300:2: ( (this_EqualExpression_0= ruleEqualExpression ( () ( (lv_operator_2_0= ruleAndOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleEqualExpression ) ) )* ) )
            // InternalQLS.g:1301:2: (this_EqualExpression_0= ruleEqualExpression ( () ( (lv_operator_2_0= ruleAndOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleEqualExpression ) ) )* )
            {
            // InternalQLS.g:1301:2: (this_EqualExpression_0= ruleEqualExpression ( () ( (lv_operator_2_0= ruleAndOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleEqualExpression ) ) )* )
            // InternalQLS.g:1302:3: this_EqualExpression_0= ruleEqualExpression ( () ( (lv_operator_2_0= ruleAndOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleEqualExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_EqualExpression_0=ruleEqualExpression();

            state._fsp--;


            			current = this_EqualExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalQLS.g:1310:3: ( () ( (lv_operator_2_0= ruleAndOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleEqualExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==86) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalQLS.g:1311:4: () ( (lv_operator_2_0= ruleAndOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleEqualExpression ) )
            	    {
            	    // InternalQLS.g:1311:4: ()
            	    // InternalQLS.g:1312:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalQLS.g:1318:4: ( (lv_operator_2_0= ruleAndOperatorKind ) )
            	    // InternalQLS.g:1319:5: (lv_operator_2_0= ruleAndOperatorKind )
            	    {
            	    // InternalQLS.g:1319:5: (lv_operator_2_0= ruleAndOperatorKind )
            	    // InternalQLS.g:1320:6: lv_operator_2_0= ruleAndOperatorKind
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorKindEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_29);
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

            	    // InternalQLS.g:1337:4: ( (lv_rhsOperand_3_0= ruleEqualExpression ) )
            	    // InternalQLS.g:1338:5: (lv_rhsOperand_3_0= ruleEqualExpression )
            	    {
            	    // InternalQLS.g:1338:5: (lv_rhsOperand_3_0= ruleEqualExpression )
            	    // InternalQLS.g:1339:6: lv_rhsOperand_3_0= ruleEqualExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getRhsOperandEqualExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_30);
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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleEqualExpression"
    // InternalQLS.g:1361:1: entryRuleEqualExpression returns [EObject current=null] : iv_ruleEqualExpression= ruleEqualExpression EOF ;
    public final EObject entryRuleEqualExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualExpression = null;


        try {
            // InternalQLS.g:1361:56: (iv_ruleEqualExpression= ruleEqualExpression EOF )
            // InternalQLS.g:1362:2: iv_ruleEqualExpression= ruleEqualExpression EOF
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
    // InternalQLS.g:1368:1: ruleEqualExpression returns [EObject current=null] : (this_ComparisionExpression_0= ruleComparisionExpression ( () ( (lv_operator_2_0= ruleEqualOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleComparisionExpression ) ) )* ) ;
    public final EObject ruleEqualExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ComparisionExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rhsOperand_3_0 = null;



        	enterRule();

        try {
            // InternalQLS.g:1374:2: ( (this_ComparisionExpression_0= ruleComparisionExpression ( () ( (lv_operator_2_0= ruleEqualOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleComparisionExpression ) ) )* ) )
            // InternalQLS.g:1375:2: (this_ComparisionExpression_0= ruleComparisionExpression ( () ( (lv_operator_2_0= ruleEqualOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleComparisionExpression ) ) )* )
            {
            // InternalQLS.g:1375:2: (this_ComparisionExpression_0= ruleComparisionExpression ( () ( (lv_operator_2_0= ruleEqualOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleComparisionExpression ) ) )* )
            // InternalQLS.g:1376:3: this_ComparisionExpression_0= ruleComparisionExpression ( () ( (lv_operator_2_0= ruleEqualOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleComparisionExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualExpressionAccess().getComparisionExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_31);
            this_ComparisionExpression_0=ruleComparisionExpression();

            state._fsp--;


            			current = this_ComparisionExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalQLS.g:1384:3: ( () ( (lv_operator_2_0= ruleEqualOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleComparisionExpression ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==61) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalQLS.g:1385:4: () ( (lv_operator_2_0= ruleEqualOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleComparisionExpression ) )
            	    {
            	    // InternalQLS.g:1385:4: ()
            	    // InternalQLS.g:1386:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalQLS.g:1392:4: ( (lv_operator_2_0= ruleEqualOperatorKind ) )
            	    // InternalQLS.g:1393:5: (lv_operator_2_0= ruleEqualOperatorKind )
            	    {
            	    // InternalQLS.g:1393:5: (lv_operator_2_0= ruleEqualOperatorKind )
            	    // InternalQLS.g:1394:6: lv_operator_2_0= ruleEqualOperatorKind
            	    {

            	    						newCompositeNode(grammarAccess.getEqualExpressionAccess().getOperatorEqualOperatorKindEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_29);
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

            	    // InternalQLS.g:1411:4: ( (lv_rhsOperand_3_0= ruleComparisionExpression ) )
            	    // InternalQLS.g:1412:5: (lv_rhsOperand_3_0= ruleComparisionExpression )
            	    {
            	    // InternalQLS.g:1412:5: (lv_rhsOperand_3_0= ruleComparisionExpression )
            	    // InternalQLS.g:1413:6: lv_rhsOperand_3_0= ruleComparisionExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEqualExpressionAccess().getRhsOperandComparisionExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_31);
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
    // $ANTLR end "ruleEqualExpression"


    // $ANTLR start "entryRuleComparisionExpression"
    // InternalQLS.g:1435:1: entryRuleComparisionExpression returns [EObject current=null] : iv_ruleComparisionExpression= ruleComparisionExpression EOF ;
    public final EObject entryRuleComparisionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisionExpression = null;


        try {
            // InternalQLS.g:1435:62: (iv_ruleComparisionExpression= ruleComparisionExpression EOF )
            // InternalQLS.g:1436:2: iv_ruleComparisionExpression= ruleComparisionExpression EOF
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
    // InternalQLS.g:1442:1: ruleComparisionExpression returns [EObject current=null] : (this_AdditionExpression_0= ruleAdditionExpression ( () ( (lv_operator_2_0= ruleComparisionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAdditionExpression ) ) )* ) ;
    public final EObject ruleComparisionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditionExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rhsOperand_3_0 = null;



        	enterRule();

        try {
            // InternalQLS.g:1448:2: ( (this_AdditionExpression_0= ruleAdditionExpression ( () ( (lv_operator_2_0= ruleComparisionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAdditionExpression ) ) )* ) )
            // InternalQLS.g:1449:2: (this_AdditionExpression_0= ruleAdditionExpression ( () ( (lv_operator_2_0= ruleComparisionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAdditionExpression ) ) )* )
            {
            // InternalQLS.g:1449:2: (this_AdditionExpression_0= ruleAdditionExpression ( () ( (lv_operator_2_0= ruleComparisionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAdditionExpression ) ) )* )
            // InternalQLS.g:1450:3: this_AdditionExpression_0= ruleAdditionExpression ( () ( (lv_operator_2_0= ruleComparisionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAdditionExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisionExpressionAccess().getAdditionExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            this_AdditionExpression_0=ruleAdditionExpression();

            state._fsp--;


            			current = this_AdditionExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalQLS.g:1458:3: ( () ( (lv_operator_2_0= ruleComparisionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAdditionExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=82 && LA22_0<=85)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalQLS.g:1459:4: () ( (lv_operator_2_0= ruleComparisionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleAdditionExpression ) )
            	    {
            	    // InternalQLS.g:1459:4: ()
            	    // InternalQLS.g:1460:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisionExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalQLS.g:1466:4: ( (lv_operator_2_0= ruleComparisionOperatorKind ) )
            	    // InternalQLS.g:1467:5: (lv_operator_2_0= ruleComparisionOperatorKind )
            	    {
            	    // InternalQLS.g:1467:5: (lv_operator_2_0= ruleComparisionOperatorKind )
            	    // InternalQLS.g:1468:6: lv_operator_2_0= ruleComparisionOperatorKind
            	    {

            	    						newCompositeNode(grammarAccess.getComparisionExpressionAccess().getOperatorComparisionOperatorKindEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_29);
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

            	    // InternalQLS.g:1485:4: ( (lv_rhsOperand_3_0= ruleAdditionExpression ) )
            	    // InternalQLS.g:1486:5: (lv_rhsOperand_3_0= ruleAdditionExpression )
            	    {
            	    // InternalQLS.g:1486:5: (lv_rhsOperand_3_0= ruleAdditionExpression )
            	    // InternalQLS.g:1487:6: lv_rhsOperand_3_0= ruleAdditionExpression
            	    {

            	    						newCompositeNode(grammarAccess.getComparisionExpressionAccess().getRhsOperandAdditionExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_32);
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
            	    break loop22;
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
    // InternalQLS.g:1509:1: entryRuleAdditionExpression returns [EObject current=null] : iv_ruleAdditionExpression= ruleAdditionExpression EOF ;
    public final EObject entryRuleAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionExpression = null;


        try {
            // InternalQLS.g:1509:59: (iv_ruleAdditionExpression= ruleAdditionExpression EOF )
            // InternalQLS.g:1510:2: iv_ruleAdditionExpression= ruleAdditionExpression EOF
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
    // InternalQLS.g:1516:1: ruleAdditionExpression returns [EObject current=null] : (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleMultiplicationExpression ) ) )* ) ;
    public final EObject ruleAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicationExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rhsOperand_3_0 = null;



        	enterRule();

        try {
            // InternalQLS.g:1522:2: ( (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleMultiplicationExpression ) ) )* ) )
            // InternalQLS.g:1523:2: (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleMultiplicationExpression ) ) )* )
            {
            // InternalQLS.g:1523:2: (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleMultiplicationExpression ) ) )* )
            // InternalQLS.g:1524:3: this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleMultiplicationExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditionExpressionAccess().getMultiplicationExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_33);
            this_MultiplicationExpression_0=ruleMultiplicationExpression();

            state._fsp--;


            			current = this_MultiplicationExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalQLS.g:1532:3: ( () ( (lv_operator_2_0= ruleAdditionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleMultiplicationExpression ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==55||LA23_0==79) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalQLS.g:1533:4: () ( (lv_operator_2_0= ruleAdditionOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleMultiplicationExpression ) )
            	    {
            	    // InternalQLS.g:1533:4: ()
            	    // InternalQLS.g:1534:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditionExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalQLS.g:1540:4: ( (lv_operator_2_0= ruleAdditionOperatorKind ) )
            	    // InternalQLS.g:1541:5: (lv_operator_2_0= ruleAdditionOperatorKind )
            	    {
            	    // InternalQLS.g:1541:5: (lv_operator_2_0= ruleAdditionOperatorKind )
            	    // InternalQLS.g:1542:6: lv_operator_2_0= ruleAdditionOperatorKind
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionExpressionAccess().getOperatorAdditionOperatorKindEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_29);
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

            	    // InternalQLS.g:1559:4: ( (lv_rhsOperand_3_0= ruleMultiplicationExpression ) )
            	    // InternalQLS.g:1560:5: (lv_rhsOperand_3_0= ruleMultiplicationExpression )
            	    {
            	    // InternalQLS.g:1560:5: (lv_rhsOperand_3_0= ruleMultiplicationExpression )
            	    // InternalQLS.g:1561:6: lv_rhsOperand_3_0= ruleMultiplicationExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionExpressionAccess().getRhsOperandMultiplicationExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_33);
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
            	    break loop23;
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
    // InternalQLS.g:1583:1: entryRuleMultiplicationExpression returns [EObject current=null] : iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF ;
    public final EObject entryRuleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationExpression = null;


        try {
            // InternalQLS.g:1583:65: (iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF )
            // InternalQLS.g:1584:2: iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF
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
    // InternalQLS.g:1590:1: ruleMultiplicationExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_operator_2_0= ruleMultiplicationOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression ) ) )* ) ;
    public final EObject ruleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rhsOperand_3_0 = null;



        	enterRule();

        try {
            // InternalQLS.g:1596:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_operator_2_0= ruleMultiplicationOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression ) ) )* ) )
            // InternalQLS.g:1597:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_operator_2_0= ruleMultiplicationOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression ) ) )* )
            {
            // InternalQLS.g:1597:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_operator_2_0= ruleMultiplicationOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression ) ) )* )
            // InternalQLS.g:1598:3: this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_operator_2_0= ruleMultiplicationOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getPrimaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_34);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;


            			current = this_PrimaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalQLS.g:1606:3: ( () ( (lv_operator_2_0= ruleMultiplicationOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=80 && LA24_0<=81)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalQLS.g:1607:4: () ( (lv_operator_2_0= ruleMultiplicationOperatorKind ) ) ( (lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression ) )
            	    {
            	    // InternalQLS.g:1607:4: ()
            	    // InternalQLS.g:1608:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicationExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalQLS.g:1614:4: ( (lv_operator_2_0= ruleMultiplicationOperatorKind ) )
            	    // InternalQLS.g:1615:5: (lv_operator_2_0= ruleMultiplicationOperatorKind )
            	    {
            	    // InternalQLS.g:1615:5: (lv_operator_2_0= ruleMultiplicationOperatorKind )
            	    // InternalQLS.g:1616:6: lv_operator_2_0= ruleMultiplicationOperatorKind
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getOperatorMultiplicationOperatorKindEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
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

            	    // InternalQLS.g:1633:4: ( (lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression ) )
            	    // InternalQLS.g:1634:5: (lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression )
            	    {
            	    // InternalQLS.g:1634:5: (lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression )
            	    // InternalQLS.g:1635:6: lv_rhsOperand_3_0= ruleUnaryOrPrimaryExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getRhsOperandUnaryOrPrimaryExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_34);
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
            	    break loop24;
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
    // InternalQLS.g:1657:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // InternalQLS.g:1657:45: (iv_ruleCall= ruleCall EOF )
            // InternalQLS.g:1658:2: iv_ruleCall= ruleCall EOF
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
    // InternalQLS.g:1664:1: ruleCall returns [EObject current=null] : (this_ConstantCall_0= ruleConstantCall | this_QuestionCall_1= ruleQuestionCall | this_EnumerationCall_2= ruleEnumerationCall ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

        EObject this_ConstantCall_0 = null;

        EObject this_QuestionCall_1 = null;

        EObject this_EnumerationCall_2 = null;



        	enterRule();

        try {
            // InternalQLS.g:1670:2: ( (this_ConstantCall_0= ruleConstantCall | this_QuestionCall_1= ruleQuestionCall | this_EnumerationCall_2= ruleEnumerationCall ) )
            // InternalQLS.g:1671:2: (this_ConstantCall_0= ruleConstantCall | this_QuestionCall_1= ruleQuestionCall | this_EnumerationCall_2= ruleEnumerationCall )
            {
            // InternalQLS.g:1671:2: (this_ConstantCall_0= ruleConstantCall | this_QuestionCall_1= ruleQuestionCall | this_EnumerationCall_2= ruleEnumerationCall )
            int alt25=3;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // InternalQLS.g:1672:3: this_ConstantCall_0= ruleConstantCall
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
                    // InternalQLS.g:1681:3: this_QuestionCall_1= ruleQuestionCall
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
                    // InternalQLS.g:1690:3: this_EnumerationCall_2= ruleEnumerationCall
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
    // InternalQLS.g:1702:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalQLS.g:1702:46: (iv_ruleValue= ruleValue EOF )
            // InternalQLS.g:1703:2: iv_ruleValue= ruleValue EOF
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
    // InternalQLS.g:1709:1: ruleValue returns [EObject current=null] : (this_IntegerValue_0= ruleIntegerValue | this_StringValue_1= ruleStringValue | this_BooleanValue_2= ruleBooleanValue | this_DateValue_3= ruleDateValue | this_DecimalValue_4= ruleDecimalValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerValue_0 = null;

        EObject this_StringValue_1 = null;

        EObject this_BooleanValue_2 = null;

        EObject this_DateValue_3 = null;

        EObject this_DecimalValue_4 = null;



        	enterRule();

        try {
            // InternalQLS.g:1715:2: ( (this_IntegerValue_0= ruleIntegerValue | this_StringValue_1= ruleStringValue | this_BooleanValue_2= ruleBooleanValue | this_DateValue_3= ruleDateValue | this_DecimalValue_4= ruleDecimalValue ) )
            // InternalQLS.g:1716:2: (this_IntegerValue_0= ruleIntegerValue | this_StringValue_1= ruleStringValue | this_BooleanValue_2= ruleBooleanValue | this_DateValue_3= ruleDateValue | this_DecimalValue_4= ruleDecimalValue )
            {
            // InternalQLS.g:1716:2: (this_IntegerValue_0= ruleIntegerValue | this_StringValue_1= ruleStringValue | this_BooleanValue_2= ruleBooleanValue | this_DateValue_3= ruleDateValue | this_DecimalValue_4= ruleDecimalValue )
            int alt26=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==52) ) {
                    alt26=5;
                }
                else if ( (LA26_1==EOF||LA26_1==30) ) {
                    alt26=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt26=2;
                }
                break;
            case 35:
            case 36:
                {
                alt26=3;
                }
                break;
            case 50:
                {
                alt26=4;
                }
                break;
            case 52:
                {
                alt26=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalQLS.g:1717:3: this_IntegerValue_0= ruleIntegerValue
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
                    // InternalQLS.g:1726:3: this_StringValue_1= ruleStringValue
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
                    // InternalQLS.g:1735:3: this_BooleanValue_2= ruleBooleanValue
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
                    // InternalQLS.g:1744:3: this_DateValue_3= ruleDateValue
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
                    // InternalQLS.g:1753:3: this_DecimalValue_4= ruleDecimalValue
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
    // InternalQLS.g:1765:1: entryRuleDefinitionGroup returns [EObject current=null] : iv_ruleDefinitionGroup= ruleDefinitionGroup EOF ;
    public final EObject entryRuleDefinitionGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionGroup = null;


        try {
            // InternalQLS.g:1765:56: (iv_ruleDefinitionGroup= ruleDefinitionGroup EOF )
            // InternalQLS.g:1766:2: iv_ruleDefinitionGroup= ruleDefinitionGroup EOF
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
    // InternalQLS.g:1772:1: ruleDefinitionGroup returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_questionDefinitions_2_0= ruleQuestionDefinition ) ) | ( (lv_dataTypes_3_0= ruleValueType ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleDefinitionGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_questionDefinitions_2_0 = null;

        EObject lv_dataTypes_3_0 = null;



        	enterRule();

        try {
            // InternalQLS.g:1778:2: ( ( () otherlv_1= '{' ( ( (lv_questionDefinitions_2_0= ruleQuestionDefinition ) ) | ( (lv_dataTypes_3_0= ruleValueType ) ) )* otherlv_4= '}' ) )
            // InternalQLS.g:1779:2: ( () otherlv_1= '{' ( ( (lv_questionDefinitions_2_0= ruleQuestionDefinition ) ) | ( (lv_dataTypes_3_0= ruleValueType ) ) )* otherlv_4= '}' )
            {
            // InternalQLS.g:1779:2: ( () otherlv_1= '{' ( ( (lv_questionDefinitions_2_0= ruleQuestionDefinition ) ) | ( (lv_dataTypes_3_0= ruleValueType ) ) )* otherlv_4= '}' )
            // InternalQLS.g:1780:3: () otherlv_1= '{' ( ( (lv_questionDefinitions_2_0= ruleQuestionDefinition ) ) | ( (lv_dataTypes_3_0= ruleValueType ) ) )* otherlv_4= '}'
            {
            // InternalQLS.g:1780:3: ()
            // InternalQLS.g:1781:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDefinitionGroupAccess().getDefinitionGroupAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getDefinitionGroupAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalQLS.g:1791:3: ( ( (lv_questionDefinitions_2_0= ruleQuestionDefinition ) ) | ( (lv_dataTypes_3_0= ruleValueType ) ) )*
            loop27:
            do {
                int alt27=3;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=56 && LA27_0<=57)) ) {
                    alt27=1;
                }
                else if ( (LA27_0==38||(LA27_0>=40 && LA27_0<=41)||(LA27_0>=44 && LA27_0<=46)||LA27_0==49) ) {
                    alt27=2;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalQLS.g:1792:4: ( (lv_questionDefinitions_2_0= ruleQuestionDefinition ) )
            	    {
            	    // InternalQLS.g:1792:4: ( (lv_questionDefinitions_2_0= ruleQuestionDefinition ) )
            	    // InternalQLS.g:1793:5: (lv_questionDefinitions_2_0= ruleQuestionDefinition )
            	    {
            	    // InternalQLS.g:1793:5: (lv_questionDefinitions_2_0= ruleQuestionDefinition )
            	    // InternalQLS.g:1794:6: lv_questionDefinitions_2_0= ruleQuestionDefinition
            	    {

            	    						newCompositeNode(grammarAccess.getDefinitionGroupAccess().getQuestionDefinitionsQuestionDefinitionParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_35);
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
            	    // InternalQLS.g:1812:4: ( (lv_dataTypes_3_0= ruleValueType ) )
            	    {
            	    // InternalQLS.g:1812:4: ( (lv_dataTypes_3_0= ruleValueType ) )
            	    // InternalQLS.g:1813:5: (lv_dataTypes_3_0= ruleValueType )
            	    {
            	    // InternalQLS.g:1813:5: (lv_dataTypes_3_0= ruleValueType )
            	    // InternalQLS.g:1814:6: lv_dataTypes_3_0= ruleValueType
            	    {

            	    						newCompositeNode(grammarAccess.getDefinitionGroupAccess().getDataTypesValueTypeParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_35);
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
            	    break loop27;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

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
    // InternalQLS.g:1840:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalQLS.g:1840:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalQLS.g:1841:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalQLS.g:1847:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalQLS.g:1853:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalQLS.g:1854:2: (kw= 'true' | kw= 'false' )
            {
            // InternalQLS.g:1854:2: (kw= 'true' | kw= 'false' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            else if ( (LA28_0==36) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalQLS.g:1855:3: kw= 'true'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalQLS.g:1861:3: kw= 'false'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

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
    // InternalQLS.g:1870:1: entryRuleEDate returns [String current=null] : iv_ruleEDate= ruleEDate EOF ;
    public final String entryRuleEDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDate = null;


        try {
            // InternalQLS.g:1870:45: (iv_ruleEDate= ruleEDate EOF )
            // InternalQLS.g:1871:2: iv_ruleEDate= ruleEDate EOF
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
    // InternalQLS.g:1877:1: ruleEDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'EDate' ;
    public final AntlrDatatypeRuleToken ruleEDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalQLS.g:1883:2: (kw= 'EDate' )
            // InternalQLS.g:1884:2: kw= 'EDate'
            {
            kw=(Token)match(input,37,FOLLOW_2); 

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
    // InternalQLS.g:1892:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalQLS.g:1892:47: (iv_ruleEString= ruleEString EOF )
            // InternalQLS.g:1893:2: iv_ruleEString= ruleEString EOF
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
    // InternalQLS.g:1899:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalQLS.g:1905:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalQLS.g:1906:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalQLS.g:1906:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_ID) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalQLS.g:1907:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalQLS.g:1915:3: this_ID_1= RULE_ID
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
    // InternalQLS.g:1926:1: entryRuleQuestionGroup returns [EObject current=null] : iv_ruleQuestionGroup= ruleQuestionGroup EOF ;
    public final EObject entryRuleQuestionGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionGroup = null;


        try {
            // InternalQLS.g:1926:54: (iv_ruleQuestionGroup= ruleQuestionGroup EOF )
            // InternalQLS.g:1927:2: iv_ruleQuestionGroup= ruleQuestionGroup EOF
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
    // InternalQLS.g:1933:1: ruleQuestionGroup returns [EObject current=null] : ( () (otherlv_1= 'if' ( (lv_guard_2_0= ruleExpression ) ) )? otherlv_3= '{' ( ( (lv_questionGroups_4_0= ruleQuestionGroup ) ) | ( (lv_questions_5_0= ruleQuestion ) ) )* otherlv_6= '}' ) ;
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
            // InternalQLS.g:1939:2: ( ( () (otherlv_1= 'if' ( (lv_guard_2_0= ruleExpression ) ) )? otherlv_3= '{' ( ( (lv_questionGroups_4_0= ruleQuestionGroup ) ) | ( (lv_questions_5_0= ruleQuestion ) ) )* otherlv_6= '}' ) )
            // InternalQLS.g:1940:2: ( () (otherlv_1= 'if' ( (lv_guard_2_0= ruleExpression ) ) )? otherlv_3= '{' ( ( (lv_questionGroups_4_0= ruleQuestionGroup ) ) | ( (lv_questions_5_0= ruleQuestion ) ) )* otherlv_6= '}' )
            {
            // InternalQLS.g:1940:2: ( () (otherlv_1= 'if' ( (lv_guard_2_0= ruleExpression ) ) )? otherlv_3= '{' ( ( (lv_questionGroups_4_0= ruleQuestionGroup ) ) | ( (lv_questions_5_0= ruleQuestion ) ) )* otherlv_6= '}' )
            // InternalQLS.g:1941:3: () (otherlv_1= 'if' ( (lv_guard_2_0= ruleExpression ) ) )? otherlv_3= '{' ( ( (lv_questionGroups_4_0= ruleQuestionGroup ) ) | ( (lv_questions_5_0= ruleQuestion ) ) )* otherlv_6= '}'
            {
            // InternalQLS.g:1941:3: ()
            // InternalQLS.g:1942:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQuestionGroupAccess().getQuestionGroupAction_0(),
            					current);
            			

            }

            // InternalQLS.g:1948:3: (otherlv_1= 'if' ( (lv_guard_2_0= ruleExpression ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==31) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalQLS.g:1949:4: otherlv_1= 'if' ( (lv_guard_2_0= ruleExpression ) )
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_23); 

                    				newLeafNode(otherlv_1, grammarAccess.getQuestionGroupAccess().getIfKeyword_1_0());
                    			
                    // InternalQLS.g:1953:4: ( (lv_guard_2_0= ruleExpression ) )
                    // InternalQLS.g:1954:5: (lv_guard_2_0= ruleExpression )
                    {
                    // InternalQLS.g:1954:5: (lv_guard_2_0= ruleExpression )
                    // InternalQLS.g:1955:6: lv_guard_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getQuestionGroupAccess().getGuardExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_5);
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

            otherlv_3=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_3, grammarAccess.getQuestionGroupAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQLS.g:1977:3: ( ( (lv_questionGroups_4_0= ruleQuestionGroup ) ) | ( (lv_questions_5_0= ruleQuestion ) ) )*
            loop31:
            do {
                int alt31=3;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==12||LA31_0==31) ) {
                    alt31=1;
                }
                else if ( (LA31_0==RULE_ID) ) {
                    alt31=2;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalQLS.g:1978:4: ( (lv_questionGroups_4_0= ruleQuestionGroup ) )
            	    {
            	    // InternalQLS.g:1978:4: ( (lv_questionGroups_4_0= ruleQuestionGroup ) )
            	    // InternalQLS.g:1979:5: (lv_questionGroups_4_0= ruleQuestionGroup )
            	    {
            	    // InternalQLS.g:1979:5: (lv_questionGroups_4_0= ruleQuestionGroup )
            	    // InternalQLS.g:1980:6: lv_questionGroups_4_0= ruleQuestionGroup
            	    {

            	    						newCompositeNode(grammarAccess.getQuestionGroupAccess().getQuestionGroupsQuestionGroupParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_36);
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
            	    // InternalQLS.g:1998:4: ( (lv_questions_5_0= ruleQuestion ) )
            	    {
            	    // InternalQLS.g:1998:4: ( (lv_questions_5_0= ruleQuestion ) )
            	    // InternalQLS.g:1999:5: (lv_questions_5_0= ruleQuestion )
            	    {
            	    // InternalQLS.g:1999:5: (lv_questions_5_0= ruleQuestion )
            	    // InternalQLS.g:2000:6: lv_questions_5_0= ruleQuestion
            	    {

            	    						newCompositeNode(grammarAccess.getQuestionGroupAccess().getQuestionsQuestionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_36);
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
            	    break loop31;
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
    // InternalQLS.g:2026:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // InternalQLS.g:2026:49: (iv_ruleQuestion= ruleQuestion EOF )
            // InternalQLS.g:2027:2: iv_ruleQuestion= ruleQuestion EOF
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
    // InternalQLS.g:2033:1: ruleQuestion returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalQLS.g:2039:2: ( ( ( ruleQualifiedName ) ) )
            // InternalQLS.g:2040:2: ( ( ruleQualifiedName ) )
            {
            // InternalQLS.g:2040:2: ( ( ruleQualifiedName ) )
            // InternalQLS.g:2041:3: ( ruleQualifiedName )
            {
            // InternalQLS.g:2041:3: ( ruleQualifiedName )
            // InternalQLS.g:2042:4: ruleQualifiedName
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
    // InternalQLS.g:2059:1: entryRuleValueType_Impl returns [EObject current=null] : iv_ruleValueType_Impl= ruleValueType_Impl EOF ;
    public final EObject entryRuleValueType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueType_Impl = null;


        try {
            // InternalQLS.g:2059:55: (iv_ruleValueType_Impl= ruleValueType_Impl EOF )
            // InternalQLS.g:2060:2: iv_ruleValueType_Impl= ruleValueType_Impl EOF
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
    // InternalQLS.g:2066:1: ruleValueType_Impl returns [EObject current=null] : ( () otherlv_1= 'ValueType' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
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
            // InternalQLS.g:2072:2: ( ( () otherlv_1= 'ValueType' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalQLS.g:2073:2: ( () otherlv_1= 'ValueType' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalQLS.g:2073:2: ( () otherlv_1= 'ValueType' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalQLS.g:2074:3: () otherlv_1= 'ValueType' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalQLS.g:2074:3: ()
            // InternalQLS.g:2075:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getValueType_ImplAccess().getValueTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getValueType_ImplAccess().getValueTypeKeyword_1());
            		
            // InternalQLS.g:2085:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalQLS.g:2086:4: (lv_name_2_0= RULE_ID )
            {
            // InternalQLS.g:2086:4: (lv_name_2_0= RULE_ID )
            // InternalQLS.g:2087:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            otherlv_3=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getValueType_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQLS.g:2107:3: (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==39) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalQLS.g:2108:4: otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,39,FOLLOW_38); 

                    				newLeafNode(otherlv_4, grammarAccess.getValueType_ImplAccess().getUnitKeyword_4_0());
                    			
                    // InternalQLS.g:2112:4: ( (lv_unit_5_0= ruleEString ) )
                    // InternalQLS.g:2113:5: (lv_unit_5_0= ruleEString )
                    {
                    // InternalQLS.g:2113:5: (lv_unit_5_0= ruleEString )
                    // InternalQLS.g:2114:6: lv_unit_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getValueType_ImplAccess().getUnitEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_14);
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
    // InternalQLS.g:2140:1: entryRuleConstantCall returns [EObject current=null] : iv_ruleConstantCall= ruleConstantCall EOF ;
    public final EObject entryRuleConstantCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantCall = null;


        try {
            // InternalQLS.g:2140:53: (iv_ruleConstantCall= ruleConstantCall EOF )
            // InternalQLS.g:2141:2: iv_ruleConstantCall= ruleConstantCall EOF
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
    // InternalQLS.g:2147:1: ruleConstantCall returns [EObject current=null] : ( () ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleIntegerValue | lv_value_1_3= ruleBooleanValue | lv_value_1_4= ruleDecimalValue ) ) ) ) ;
    public final EObject ruleConstantCall() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_1 = null;

        EObject lv_value_1_2 = null;

        EObject lv_value_1_3 = null;

        EObject lv_value_1_4 = null;



        	enterRule();

        try {
            // InternalQLS.g:2153:2: ( ( () ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleIntegerValue | lv_value_1_3= ruleBooleanValue | lv_value_1_4= ruleDecimalValue ) ) ) ) )
            // InternalQLS.g:2154:2: ( () ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleIntegerValue | lv_value_1_3= ruleBooleanValue | lv_value_1_4= ruleDecimalValue ) ) ) )
            {
            // InternalQLS.g:2154:2: ( () ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleIntegerValue | lv_value_1_3= ruleBooleanValue | lv_value_1_4= ruleDecimalValue ) ) ) )
            // InternalQLS.g:2155:3: () ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleIntegerValue | lv_value_1_3= ruleBooleanValue | lv_value_1_4= ruleDecimalValue ) ) )
            {
            // InternalQLS.g:2155:3: ()
            // InternalQLS.g:2156:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConstantCallAccess().getConstantCallAction_0(),
            					current);
            			

            }

            // InternalQLS.g:2162:3: ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleIntegerValue | lv_value_1_3= ruleBooleanValue | lv_value_1_4= ruleDecimalValue ) ) )
            // InternalQLS.g:2163:4: ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleIntegerValue | lv_value_1_3= ruleBooleanValue | lv_value_1_4= ruleDecimalValue ) )
            {
            // InternalQLS.g:2163:4: ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleIntegerValue | lv_value_1_3= ruleBooleanValue | lv_value_1_4= ruleDecimalValue ) )
            // InternalQLS.g:2164:5: (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleIntegerValue | lv_value_1_3= ruleBooleanValue | lv_value_1_4= ruleDecimalValue )
            {
            // InternalQLS.g:2164:5: (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleIntegerValue | lv_value_1_3= ruleBooleanValue | lv_value_1_4= ruleDecimalValue )
            int alt33=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt33=1;
                }
                break;
            case RULE_INT:
                {
                int LA33_2 = input.LA(2);

                if ( (LA33_2==EOF||LA33_2==12||LA33_2==30||(LA33_2>=32 && LA33_2<=34)||LA33_2==55||(LA33_2>=61 && LA33_2<=62)||(LA33_2>=79 && LA33_2<=87)) ) {
                    alt33=2;
                }
                else if ( (LA33_2==52) ) {
                    alt33=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 2, input);

                    throw nvae;
                }
                }
                break;
            case 35:
            case 36:
                {
                alt33=3;
                }
                break;
            case 52:
                {
                alt33=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalQLS.g:2165:6: lv_value_1_1= ruleStringValue
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
                    // InternalQLS.g:2181:6: lv_value_1_2= ruleIntegerValue
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
                    // InternalQLS.g:2197:6: lv_value_1_3= ruleBooleanValue
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
                    // InternalQLS.g:2213:6: lv_value_1_4= ruleDecimalValue
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
    // InternalQLS.g:2235:1: entryRuleQuestionCall returns [EObject current=null] : iv_ruleQuestionCall= ruleQuestionCall EOF ;
    public final EObject entryRuleQuestionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionCall = null;


        try {
            // InternalQLS.g:2235:53: (iv_ruleQuestionCall= ruleQuestionCall EOF )
            // InternalQLS.g:2236:2: iv_ruleQuestionCall= ruleQuestionCall EOF
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
    // InternalQLS.g:2242:1: ruleQuestionCall returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) otherlv_2= '(' otherlv_3= ')' ) ;
    public final EObject ruleQuestionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalQLS.g:2248:2: ( ( () ( ( ruleQualifiedName ) ) otherlv_2= '(' otherlv_3= ')' ) )
            // InternalQLS.g:2249:2: ( () ( ( ruleQualifiedName ) ) otherlv_2= '(' otherlv_3= ')' )
            {
            // InternalQLS.g:2249:2: ( () ( ( ruleQualifiedName ) ) otherlv_2= '(' otherlv_3= ')' )
            // InternalQLS.g:2250:3: () ( ( ruleQualifiedName ) ) otherlv_2= '(' otherlv_3= ')'
            {
            // InternalQLS.g:2250:3: ()
            // InternalQLS.g:2251:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQuestionCallAccess().getQuestionCallAction_0(),
            					current);
            			

            }

            // InternalQLS.g:2257:3: ( ( ruleQualifiedName ) )
            // InternalQLS.g:2258:4: ( ruleQualifiedName )
            {
            // InternalQLS.g:2258:4: ( ruleQualifiedName )
            // InternalQLS.g:2259:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuestionCallRule());
            					}
            				

            					newCompositeNode(grammarAccess.getQuestionCallAccess().getQuestionQuestionDefinitionCrossReference_1_0());
            				
            pushFollow(FOLLOW_39);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getQuestionCallAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_2); 

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
    // InternalQLS.g:2285:1: entryRuleBooleanValueType returns [EObject current=null] : iv_ruleBooleanValueType= ruleBooleanValueType EOF ;
    public final EObject entryRuleBooleanValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValueType = null;


        try {
            // InternalQLS.g:2285:57: (iv_ruleBooleanValueType= ruleBooleanValueType EOF )
            // InternalQLS.g:2286:2: iv_ruleBooleanValueType= ruleBooleanValueType EOF
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
    // InternalQLS.g:2292:1: ruleBooleanValueType returns [EObject current=null] : ( () otherlv_1= 'booleanType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? ) ;
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
            // InternalQLS.g:2298:2: ( ( () otherlv_1= 'booleanType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? ) )
            // InternalQLS.g:2299:2: ( () otherlv_1= 'booleanType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? )
            {
            // InternalQLS.g:2299:2: ( () otherlv_1= 'booleanType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? )
            // InternalQLS.g:2300:3: () otherlv_1= 'booleanType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )?
            {
            // InternalQLS.g:2300:3: ()
            // InternalQLS.g:2301:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanValueTypeAccess().getBooleanValueTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getBooleanValueTypeAccess().getBooleanTypeKeyword_1());
            		
            // InternalQLS.g:2311:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalQLS.g:2312:4: (lv_name_2_0= RULE_ID )
            {
            // InternalQLS.g:2312:4: (lv_name_2_0= RULE_ID )
            // InternalQLS.g:2313:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_40); 

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

            // InternalQLS.g:2329:3: (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==12) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalQLS.g:2330:4: otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_37); 

                    				newLeafNode(otherlv_3, grammarAccess.getBooleanValueTypeAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalQLS.g:2334:4: (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==39) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalQLS.g:2335:5: otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) )
                            {
                            otherlv_4=(Token)match(input,39,FOLLOW_38); 

                            					newLeafNode(otherlv_4, grammarAccess.getBooleanValueTypeAccess().getUnitKeyword_3_1_0());
                            				
                            // InternalQLS.g:2339:5: ( (lv_unit_5_0= ruleEString ) )
                            // InternalQLS.g:2340:6: (lv_unit_5_0= ruleEString )
                            {
                            // InternalQLS.g:2340:6: (lv_unit_5_0= ruleEString )
                            // InternalQLS.g:2341:7: lv_unit_5_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getBooleanValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0());
                            						
                            pushFollow(FOLLOW_14);
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
    // InternalQLS.g:2368:1: entryRuleIntegerValueType returns [EObject current=null] : iv_ruleIntegerValueType= ruleIntegerValueType EOF ;
    public final EObject entryRuleIntegerValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValueType = null;


        try {
            // InternalQLS.g:2368:57: (iv_ruleIntegerValueType= ruleIntegerValueType EOF )
            // InternalQLS.g:2369:2: iv_ruleIntegerValueType= ruleIntegerValueType EOF
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
    // InternalQLS.g:2375:1: ruleIntegerValueType returns [EObject current=null] : ( () otherlv_1= 'integerType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )? (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )? otherlv_10= '}' )? ) ;
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
            // InternalQLS.g:2381:2: ( ( () otherlv_1= 'integerType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )? (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )? otherlv_10= '}' )? ) )
            // InternalQLS.g:2382:2: ( () otherlv_1= 'integerType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )? (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )? otherlv_10= '}' )? )
            {
            // InternalQLS.g:2382:2: ( () otherlv_1= 'integerType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )? (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )? otherlv_10= '}' )? )
            // InternalQLS.g:2383:3: () otherlv_1= 'integerType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )? (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )? otherlv_10= '}' )?
            {
            // InternalQLS.g:2383:3: ()
            // InternalQLS.g:2384:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerValueTypeAccess().getIntegerValueTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getIntegerValueTypeAccess().getIntegerTypeKeyword_1());
            		
            // InternalQLS.g:2394:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalQLS.g:2395:4: (lv_name_2_0= RULE_ID )
            {
            // InternalQLS.g:2395:4: (lv_name_2_0= RULE_ID )
            // InternalQLS.g:2396:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_40); 

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

            // InternalQLS.g:2412:3: (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )? (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )? otherlv_10= '}' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==12) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalQLS.g:2413:4: otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )? (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )? otherlv_10= '}'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_41); 

                    				newLeafNode(otherlv_3, grammarAccess.getIntegerValueTypeAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalQLS.g:2417:4: (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==39) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalQLS.g:2418:5: otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) )
                            {
                            otherlv_4=(Token)match(input,39,FOLLOW_38); 

                            					newLeafNode(otherlv_4, grammarAccess.getIntegerValueTypeAccess().getUnitKeyword_3_1_0());
                            				
                            // InternalQLS.g:2422:5: ( (lv_unit_5_0= ruleEString ) )
                            // InternalQLS.g:2423:6: (lv_unit_5_0= ruleEString )
                            {
                            // InternalQLS.g:2423:6: (lv_unit_5_0= ruleEString )
                            // InternalQLS.g:2424:7: lv_unit_5_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getIntegerValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0());
                            						
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

                    // InternalQLS.g:2442:4: (otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==42) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalQLS.g:2443:5: otherlv_6= 'min' ( (lv_min_7_0= ruleEInt ) )
                            {
                            otherlv_6=(Token)match(input,42,FOLLOW_43); 

                            					newLeafNode(otherlv_6, grammarAccess.getIntegerValueTypeAccess().getMinKeyword_3_2_0());
                            				
                            // InternalQLS.g:2447:5: ( (lv_min_7_0= ruleEInt ) )
                            // InternalQLS.g:2448:6: (lv_min_7_0= ruleEInt )
                            {
                            // InternalQLS.g:2448:6: (lv_min_7_0= ruleEInt )
                            // InternalQLS.g:2449:7: lv_min_7_0= ruleEInt
                            {

                            							newCompositeNode(grammarAccess.getIntegerValueTypeAccess().getMinEIntParserRuleCall_3_2_1_0());
                            						
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

                    // InternalQLS.g:2467:4: (otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) ) )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==43) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalQLS.g:2468:5: otherlv_8= 'max' ( (lv_max_9_0= ruleEInt ) )
                            {
                            otherlv_8=(Token)match(input,43,FOLLOW_43); 

                            					newLeafNode(otherlv_8, grammarAccess.getIntegerValueTypeAccess().getMaxKeyword_3_3_0());
                            				
                            // InternalQLS.g:2472:5: ( (lv_max_9_0= ruleEInt ) )
                            // InternalQLS.g:2473:6: (lv_max_9_0= ruleEInt )
                            {
                            // InternalQLS.g:2473:6: (lv_max_9_0= ruleEInt )
                            // InternalQLS.g:2474:7: lv_max_9_0= ruleEInt
                            {

                            							newCompositeNode(grammarAccess.getIntegerValueTypeAccess().getMaxEIntParserRuleCall_3_3_1_0());
                            						
                            pushFollow(FOLLOW_14);
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
    // InternalQLS.g:2501:1: entryRuleDecimalValueType returns [EObject current=null] : iv_ruleDecimalValueType= ruleDecimalValueType EOF ;
    public final EObject entryRuleDecimalValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalValueType = null;


        try {
            // InternalQLS.g:2501:57: (iv_ruleDecimalValueType= ruleDecimalValueType EOF )
            // InternalQLS.g:2502:2: iv_ruleDecimalValueType= ruleDecimalValueType EOF
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
    // InternalQLS.g:2508:1: ruleDecimalValueType returns [EObject current=null] : ( () otherlv_1= 'decimalType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? ) ;
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
            // InternalQLS.g:2514:2: ( ( () otherlv_1= 'decimalType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? ) )
            // InternalQLS.g:2515:2: ( () otherlv_1= 'decimalType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? )
            {
            // InternalQLS.g:2515:2: ( () otherlv_1= 'decimalType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? )
            // InternalQLS.g:2516:3: () otherlv_1= 'decimalType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )?
            {
            // InternalQLS.g:2516:3: ()
            // InternalQLS.g:2517:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDecimalValueTypeAccess().getDecimalValueTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDecimalValueTypeAccess().getDecimalTypeKeyword_1());
            		
            // InternalQLS.g:2527:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalQLS.g:2528:4: (lv_name_2_0= RULE_ID )
            {
            // InternalQLS.g:2528:4: (lv_name_2_0= RULE_ID )
            // InternalQLS.g:2529:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_40); 

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

            // InternalQLS.g:2545:3: (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==12) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalQLS.g:2546:4: otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_37); 

                    				newLeafNode(otherlv_3, grammarAccess.getDecimalValueTypeAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalQLS.g:2550:4: (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==39) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalQLS.g:2551:5: otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) )
                            {
                            otherlv_4=(Token)match(input,39,FOLLOW_38); 

                            					newLeafNode(otherlv_4, grammarAccess.getDecimalValueTypeAccess().getUnitKeyword_3_1_0());
                            				
                            // InternalQLS.g:2555:5: ( (lv_unit_5_0= ruleEString ) )
                            // InternalQLS.g:2556:6: (lv_unit_5_0= ruleEString )
                            {
                            // InternalQLS.g:2556:6: (lv_unit_5_0= ruleEString )
                            // InternalQLS.g:2557:7: lv_unit_5_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getDecimalValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0());
                            						
                            pushFollow(FOLLOW_14);
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
    // InternalQLS.g:2584:1: entryRuleDateValueType returns [EObject current=null] : iv_ruleDateValueType= ruleDateValueType EOF ;
    public final EObject entryRuleDateValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateValueType = null;


        try {
            // InternalQLS.g:2584:54: (iv_ruleDateValueType= ruleDateValueType EOF )
            // InternalQLS.g:2585:2: iv_ruleDateValueType= ruleDateValueType EOF
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
    // InternalQLS.g:2591:1: ruleDateValueType returns [EObject current=null] : ( () otherlv_1= 'dateType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? ) ;
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
            // InternalQLS.g:2597:2: ( ( () otherlv_1= 'dateType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? ) )
            // InternalQLS.g:2598:2: ( () otherlv_1= 'dateType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? )
            {
            // InternalQLS.g:2598:2: ( () otherlv_1= 'dateType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? )
            // InternalQLS.g:2599:3: () otherlv_1= 'dateType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )?
            {
            // InternalQLS.g:2599:3: ()
            // InternalQLS.g:2600:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDateValueTypeAccess().getDateValueTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDateValueTypeAccess().getDateTypeKeyword_1());
            		
            // InternalQLS.g:2610:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalQLS.g:2611:4: (lv_name_2_0= RULE_ID )
            {
            // InternalQLS.g:2611:4: (lv_name_2_0= RULE_ID )
            // InternalQLS.g:2612:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_40); 

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

            // InternalQLS.g:2628:3: (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==12) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalQLS.g:2629:4: otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_37); 

                    				newLeafNode(otherlv_3, grammarAccess.getDateValueTypeAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalQLS.g:2633:4: (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==39) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalQLS.g:2634:5: otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) )
                            {
                            otherlv_4=(Token)match(input,39,FOLLOW_38); 

                            					newLeafNode(otherlv_4, grammarAccess.getDateValueTypeAccess().getUnitKeyword_3_1_0());
                            				
                            // InternalQLS.g:2638:5: ( (lv_unit_5_0= ruleEString ) )
                            // InternalQLS.g:2639:6: (lv_unit_5_0= ruleEString )
                            {
                            // InternalQLS.g:2639:6: (lv_unit_5_0= ruleEString )
                            // InternalQLS.g:2640:7: lv_unit_5_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getDateValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0());
                            						
                            pushFollow(FOLLOW_14);
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
    // InternalQLS.g:2667:1: entryRuleEnumerationValueType returns [EObject current=null] : iv_ruleEnumerationValueType= ruleEnumerationValueType EOF ;
    public final EObject entryRuleEnumerationValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationValueType = null;


        try {
            // InternalQLS.g:2667:61: (iv_ruleEnumerationValueType= ruleEnumerationValueType EOF )
            // InternalQLS.g:2668:2: iv_ruleEnumerationValueType= ruleEnumerationValueType EOF
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
    // InternalQLS.g:2674:1: ruleEnumerationValueType returns [EObject current=null] : ( () otherlv_1= 'enumerationType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )? otherlv_12= '}' )? ) ;
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
            // InternalQLS.g:2680:2: ( ( () otherlv_1= 'enumerationType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )? otherlv_12= '}' )? ) )
            // InternalQLS.g:2681:2: ( () otherlv_1= 'enumerationType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )? otherlv_12= '}' )? )
            {
            // InternalQLS.g:2681:2: ( () otherlv_1= 'enumerationType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )? otherlv_12= '}' )? )
            // InternalQLS.g:2682:3: () otherlv_1= 'enumerationType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )? otherlv_12= '}' )?
            {
            // InternalQLS.g:2682:3: ()
            // InternalQLS.g:2683:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnumerationValueTypeAccess().getEnumerationValueTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumerationValueTypeAccess().getEnumerationTypeKeyword_1());
            		
            // InternalQLS.g:2693:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalQLS.g:2694:4: (lv_name_2_0= RULE_ID )
            {
            // InternalQLS.g:2694:4: (lv_name_2_0= RULE_ID )
            // InternalQLS.g:2695:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_40); 

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

            // InternalQLS.g:2711:3: (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )? otherlv_12= '}' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==12) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalQLS.g:2712:4: otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? (otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )? otherlv_12= '}'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_45); 

                    				newLeafNode(otherlv_3, grammarAccess.getEnumerationValueTypeAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalQLS.g:2716:4: (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==39) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalQLS.g:2717:5: otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) )
                            {
                            otherlv_4=(Token)match(input,39,FOLLOW_38); 

                            					newLeafNode(otherlv_4, grammarAccess.getEnumerationValueTypeAccess().getUnitKeyword_3_1_0());
                            				
                            // InternalQLS.g:2721:5: ( (lv_unit_5_0= ruleEString ) )
                            // InternalQLS.g:2722:6: (lv_unit_5_0= ruleEString )
                            {
                            // InternalQLS.g:2722:6: (lv_unit_5_0= ruleEString )
                            // InternalQLS.g:2723:7: lv_unit_5_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getEnumerationValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0());
                            						
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

                    // InternalQLS.g:2741:4: (otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}' )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==47) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalQLS.g:2742:5: otherlv_6= 'literals' otherlv_7= '{' ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) ) (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )* otherlv_11= '}'
                            {
                            otherlv_6=(Token)match(input,47,FOLLOW_5); 

                            					newLeafNode(otherlv_6, grammarAccess.getEnumerationValueTypeAccess().getLiteralsKeyword_3_2_0());
                            				
                            otherlv_7=(Token)match(input,12,FOLLOW_4); 

                            					newLeafNode(otherlv_7, grammarAccess.getEnumerationValueTypeAccess().getLeftCurlyBracketKeyword_3_2_1());
                            				
                            // InternalQLS.g:2750:5: ( (lv_enumerationLiterals_8_0= ruleEnumerationLiteral ) )
                            // InternalQLS.g:2751:6: (lv_enumerationLiterals_8_0= ruleEnumerationLiteral )
                            {
                            // InternalQLS.g:2751:6: (lv_enumerationLiterals_8_0= ruleEnumerationLiteral )
                            // InternalQLS.g:2752:7: lv_enumerationLiterals_8_0= ruleEnumerationLiteral
                            {

                            							newCompositeNode(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_3_2_2_0());
                            						
                            pushFollow(FOLLOW_47);
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

                            // InternalQLS.g:2769:5: (otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) ) )*
                            loop45:
                            do {
                                int alt45=2;
                                int LA45_0 = input.LA(1);

                                if ( (LA45_0==48) ) {
                                    alt45=1;
                                }


                                switch (alt45) {
                            	case 1 :
                            	    // InternalQLS.g:2770:6: otherlv_9= ',' ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) )
                            	    {
                            	    otherlv_9=(Token)match(input,48,FOLLOW_4); 

                            	    						newLeafNode(otherlv_9, grammarAccess.getEnumerationValueTypeAccess().getCommaKeyword_3_2_3_0());
                            	    					
                            	    // InternalQLS.g:2774:6: ( (lv_enumerationLiterals_10_0= ruleEnumerationLiteral ) )
                            	    // InternalQLS.g:2775:7: (lv_enumerationLiterals_10_0= ruleEnumerationLiteral )
                            	    {
                            	    // InternalQLS.g:2775:7: (lv_enumerationLiterals_10_0= ruleEnumerationLiteral )
                            	    // InternalQLS.g:2776:8: lv_enumerationLiterals_10_0= ruleEnumerationLiteral
                            	    {

                            	    								newCompositeNode(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_3_2_3_1_0());
                            	    							
                            	    pushFollow(FOLLOW_47);
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
                            	    break loop45;
                                }
                            } while (true);

                            otherlv_11=(Token)match(input,14,FOLLOW_14); 

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
    // InternalQLS.g:2808:1: entryRuleStringValueType returns [EObject current=null] : iv_ruleStringValueType= ruleStringValueType EOF ;
    public final EObject entryRuleStringValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValueType = null;


        try {
            // InternalQLS.g:2808:56: (iv_ruleStringValueType= ruleStringValueType EOF )
            // InternalQLS.g:2809:2: iv_ruleStringValueType= ruleStringValueType EOF
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
    // InternalQLS.g:2815:1: ruleStringValueType returns [EObject current=null] : ( () otherlv_1= 'StringType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? ) ;
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
            // InternalQLS.g:2821:2: ( ( () otherlv_1= 'StringType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? ) )
            // InternalQLS.g:2822:2: ( () otherlv_1= 'StringType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? )
            {
            // InternalQLS.g:2822:2: ( () otherlv_1= 'StringType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )? )
            // InternalQLS.g:2823:3: () otherlv_1= 'StringType' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )?
            {
            // InternalQLS.g:2823:3: ()
            // InternalQLS.g:2824:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringValueTypeAccess().getStringValueTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getStringValueTypeAccess().getStringTypeKeyword_1());
            		
            // InternalQLS.g:2834:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalQLS.g:2835:4: (lv_name_2_0= RULE_ID )
            {
            // InternalQLS.g:2835:4: (lv_name_2_0= RULE_ID )
            // InternalQLS.g:2836:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_40); 

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

            // InternalQLS.g:2852:3: (otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==12) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalQLS.g:2853:4: otherlv_3= '{' (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_37); 

                    				newLeafNode(otherlv_3, grammarAccess.getStringValueTypeAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalQLS.g:2857:4: (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==39) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalQLS.g:2858:5: otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) )
                            {
                            otherlv_4=(Token)match(input,39,FOLLOW_38); 

                            					newLeafNode(otherlv_4, grammarAccess.getStringValueTypeAccess().getUnitKeyword_3_1_0());
                            				
                            // InternalQLS.g:2862:5: ( (lv_unit_5_0= ruleEString ) )
                            // InternalQLS.g:2863:6: (lv_unit_5_0= ruleEString )
                            {
                            // InternalQLS.g:2863:6: (lv_unit_5_0= ruleEString )
                            // InternalQLS.g:2864:7: lv_unit_5_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getStringValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0());
                            						
                            pushFollow(FOLLOW_14);
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
    // InternalQLS.g:2891:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteral = null;


        try {
            // InternalQLS.g:2891:59: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // InternalQLS.g:2892:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
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
    // InternalQLS.g:2898:1: ruleEnumerationLiteral returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalQLS.g:2904:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalQLS.g:2905:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalQLS.g:2905:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalQLS.g:2906:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalQLS.g:2906:3: ()
            // InternalQLS.g:2907:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnumerationLiteralAccess().getEnumerationLiteralAction_0(),
            					current);
            			

            }

            // InternalQLS.g:2913:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalQLS.g:2914:4: (lv_name_1_0= RULE_ID )
            {
            // InternalQLS.g:2914:4: (lv_name_1_0= RULE_ID )
            // InternalQLS.g:2915:5: lv_name_1_0= RULE_ID
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
    // InternalQLS.g:2935:1: entryRuleIntegerValue returns [EObject current=null] : iv_ruleIntegerValue= ruleIntegerValue EOF ;
    public final EObject entryRuleIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValue = null;


        try {
            // InternalQLS.g:2935:53: (iv_ruleIntegerValue= ruleIntegerValue EOF )
            // InternalQLS.g:2936:2: iv_ruleIntegerValue= ruleIntegerValue EOF
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
    // InternalQLS.g:2942:1: ruleIntegerValue returns [EObject current=null] : ( () ( (lv_intValue_1_0= ruleEInt ) ) ) ;
    public final EObject ruleIntegerValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_intValue_1_0 = null;



        	enterRule();

        try {
            // InternalQLS.g:2948:2: ( ( () ( (lv_intValue_1_0= ruleEInt ) ) ) )
            // InternalQLS.g:2949:2: ( () ( (lv_intValue_1_0= ruleEInt ) ) )
            {
            // InternalQLS.g:2949:2: ( () ( (lv_intValue_1_0= ruleEInt ) ) )
            // InternalQLS.g:2950:3: () ( (lv_intValue_1_0= ruleEInt ) )
            {
            // InternalQLS.g:2950:3: ()
            // InternalQLS.g:2951:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerValueAccess().getIntegerValueAction_0(),
            					current);
            			

            }

            // InternalQLS.g:2957:3: ( (lv_intValue_1_0= ruleEInt ) )
            // InternalQLS.g:2958:4: (lv_intValue_1_0= ruleEInt )
            {
            // InternalQLS.g:2958:4: (lv_intValue_1_0= ruleEInt )
            // InternalQLS.g:2959:5: lv_intValue_1_0= ruleEInt
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
    // InternalQLS.g:2980:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalQLS.g:2980:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalQLS.g:2981:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalQLS.g:2987:1: ruleStringValue returns [EObject current=null] : ( () ( (lv_stringValue_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_stringValue_1_0=null;


        	enterRule();

        try {
            // InternalQLS.g:2993:2: ( ( () ( (lv_stringValue_1_0= RULE_STRING ) ) ) )
            // InternalQLS.g:2994:2: ( () ( (lv_stringValue_1_0= RULE_STRING ) ) )
            {
            // InternalQLS.g:2994:2: ( () ( (lv_stringValue_1_0= RULE_STRING ) ) )
            // InternalQLS.g:2995:3: () ( (lv_stringValue_1_0= RULE_STRING ) )
            {
            // InternalQLS.g:2995:3: ()
            // InternalQLS.g:2996:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringValueAccess().getStringValueAction_0(),
            					current);
            			

            }

            // InternalQLS.g:3002:3: ( (lv_stringValue_1_0= RULE_STRING ) )
            // InternalQLS.g:3003:4: (lv_stringValue_1_0= RULE_STRING )
            {
            // InternalQLS.g:3003:4: (lv_stringValue_1_0= RULE_STRING )
            // InternalQLS.g:3004:5: lv_stringValue_1_0= RULE_STRING
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
    // InternalQLS.g:3024:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalQLS.g:3024:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalQLS.g:3025:2: iv_ruleBooleanValue= ruleBooleanValue EOF
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
    // InternalQLS.g:3031:1: ruleBooleanValue returns [EObject current=null] : ( () ( (lv_booleanValue_1_0= ruleEBoolean ) ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_booleanValue_1_0 = null;



        	enterRule();

        try {
            // InternalQLS.g:3037:2: ( ( () ( (lv_booleanValue_1_0= ruleEBoolean ) ) ) )
            // InternalQLS.g:3038:2: ( () ( (lv_booleanValue_1_0= ruleEBoolean ) ) )
            {
            // InternalQLS.g:3038:2: ( () ( (lv_booleanValue_1_0= ruleEBoolean ) ) )
            // InternalQLS.g:3039:3: () ( (lv_booleanValue_1_0= ruleEBoolean ) )
            {
            // InternalQLS.g:3039:3: ()
            // InternalQLS.g:3040:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanValueAccess().getBooleanValueAction_0(),
            					current);
            			

            }

            // InternalQLS.g:3046:3: ( (lv_booleanValue_1_0= ruleEBoolean ) )
            // InternalQLS.g:3047:4: (lv_booleanValue_1_0= ruleEBoolean )
            {
            // InternalQLS.g:3047:4: (lv_booleanValue_1_0= ruleEBoolean )
            // InternalQLS.g:3048:5: lv_booleanValue_1_0= ruleEBoolean
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
    // InternalQLS.g:3069:1: entryRuleEnumerationCall returns [EObject current=null] : iv_ruleEnumerationCall= ruleEnumerationCall EOF ;
    public final EObject entryRuleEnumerationCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationCall = null;


        try {
            // InternalQLS.g:3069:56: (iv_ruleEnumerationCall= ruleEnumerationCall EOF )
            // InternalQLS.g:3070:2: iv_ruleEnumerationCall= ruleEnumerationCall EOF
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
    // InternalQLS.g:3076:1: ruleEnumerationCall returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleEnumerationCall() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalQLS.g:3082:2: ( ( () ( ( ruleQualifiedName ) ) ) )
            // InternalQLS.g:3083:2: ( () ( ( ruleQualifiedName ) ) )
            {
            // InternalQLS.g:3083:2: ( () ( ( ruleQualifiedName ) ) )
            // InternalQLS.g:3084:3: () ( ( ruleQualifiedName ) )
            {
            // InternalQLS.g:3084:3: ()
            // InternalQLS.g:3085:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnumerationCallAccess().getEnumerationCallAction_0(),
            					current);
            			

            }

            // InternalQLS.g:3091:3: ( ( ruleQualifiedName ) )
            // InternalQLS.g:3092:4: ( ruleQualifiedName )
            {
            // InternalQLS.g:3092:4: ( ruleQualifiedName )
            // InternalQLS.g:3093:5: ruleQualifiedName
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
    // InternalQLS.g:3111:1: entryRuleDateValue returns [EObject current=null] : iv_ruleDateValue= ruleDateValue EOF ;
    public final EObject entryRuleDateValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateValue = null;


        try {
            // InternalQLS.g:3111:50: (iv_ruleDateValue= ruleDateValue EOF )
            // InternalQLS.g:3112:2: iv_ruleDateValue= ruleDateValue EOF
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
    // InternalQLS.g:3118:1: ruleDateValue returns [EObject current=null] : ( () otherlv_1= 'DateValue' otherlv_2= '{' (otherlv_3= 'dateValue' ( (lv_dateValue_4_0= ruleEDate ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleDateValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_dateValue_4_0 = null;



        	enterRule();

        try {
            // InternalQLS.g:3124:2: ( ( () otherlv_1= 'DateValue' otherlv_2= '{' (otherlv_3= 'dateValue' ( (lv_dateValue_4_0= ruleEDate ) ) )? otherlv_5= '}' ) )
            // InternalQLS.g:3125:2: ( () otherlv_1= 'DateValue' otherlv_2= '{' (otherlv_3= 'dateValue' ( (lv_dateValue_4_0= ruleEDate ) ) )? otherlv_5= '}' )
            {
            // InternalQLS.g:3125:2: ( () otherlv_1= 'DateValue' otherlv_2= '{' (otherlv_3= 'dateValue' ( (lv_dateValue_4_0= ruleEDate ) ) )? otherlv_5= '}' )
            // InternalQLS.g:3126:3: () otherlv_1= 'DateValue' otherlv_2= '{' (otherlv_3= 'dateValue' ( (lv_dateValue_4_0= ruleEDate ) ) )? otherlv_5= '}'
            {
            // InternalQLS.g:3126:3: ()
            // InternalQLS.g:3127:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDateValueAccess().getDateValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,50,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getDateValueAccess().getDateValueKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_48); 

            			newLeafNode(otherlv_2, grammarAccess.getDateValueAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQLS.g:3141:3: (otherlv_3= 'dateValue' ( (lv_dateValue_4_0= ruleEDate ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==51) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalQLS.g:3142:4: otherlv_3= 'dateValue' ( (lv_dateValue_4_0= ruleEDate ) )
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_49); 

                    				newLeafNode(otherlv_3, grammarAccess.getDateValueAccess().getDateValueKeyword_3_0());
                    			
                    // InternalQLS.g:3146:4: ( (lv_dateValue_4_0= ruleEDate ) )
                    // InternalQLS.g:3147:5: (lv_dateValue_4_0= ruleEDate )
                    {
                    // InternalQLS.g:3147:5: (lv_dateValue_4_0= ruleEDate )
                    // InternalQLS.g:3148:6: lv_dateValue_4_0= ruleEDate
                    {

                    						newCompositeNode(grammarAccess.getDateValueAccess().getDateValueEDateParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_14);
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
    // InternalQLS.g:3174:1: entryRuleDecimalValue returns [EObject current=null] : iv_ruleDecimalValue= ruleDecimalValue EOF ;
    public final EObject entryRuleDecimalValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalValue = null;


        try {
            // InternalQLS.g:3174:53: (iv_ruleDecimalValue= ruleDecimalValue EOF )
            // InternalQLS.g:3175:2: iv_ruleDecimalValue= ruleDecimalValue EOF
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
    // InternalQLS.g:3181:1: ruleDecimalValue returns [EObject current=null] : ( () ( (lv_decimalValue_1_0= ruleEDouble ) ) ) ;
    public final EObject ruleDecimalValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_decimalValue_1_0 = null;



        	enterRule();

        try {
            // InternalQLS.g:3187:2: ( ( () ( (lv_decimalValue_1_0= ruleEDouble ) ) ) )
            // InternalQLS.g:3188:2: ( () ( (lv_decimalValue_1_0= ruleEDouble ) ) )
            {
            // InternalQLS.g:3188:2: ( () ( (lv_decimalValue_1_0= ruleEDouble ) ) )
            // InternalQLS.g:3189:3: () ( (lv_decimalValue_1_0= ruleEDouble ) )
            {
            // InternalQLS.g:3189:3: ()
            // InternalQLS.g:3190:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDecimalValueAccess().getDecimalValueAction_0(),
            					current);
            			

            }

            // InternalQLS.g:3196:3: ( (lv_decimalValue_1_0= ruleEDouble ) )
            // InternalQLS.g:3197:4: (lv_decimalValue_1_0= ruleEDouble )
            {
            // InternalQLS.g:3197:4: (lv_decimalValue_1_0= ruleEDouble )
            // InternalQLS.g:3198:5: lv_decimalValue_1_0= ruleEDouble
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
    // InternalQLS.g:3219:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalQLS.g:3219:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalQLS.g:3220:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalQLS.g:3226:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalQLS.g:3232:2: (this_INT_0= RULE_INT )
            // InternalQLS.g:3233:2: this_INT_0= RULE_INT
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
    // InternalQLS.g:3243:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalQLS.g:3243:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalQLS.g:3244:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalQLS.g:3250:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_6=null;


        	enterRule();

        try {
            // InternalQLS.g:3256:2: ( ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )? ) )
            // InternalQLS.g:3257:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )? )
            {
            // InternalQLS.g:3257:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )? )
            // InternalQLS.g:3258:3: (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )?
            {
            // InternalQLS.g:3258:3: (this_INT_0= RULE_INT )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_INT) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalQLS.g:3259:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_50); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,52,FOLLOW_43); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_51); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_2());
            		
            // InternalQLS.g:3279:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=53 && LA54_0<=54)) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalQLS.g:3280:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT
                    {
                    // InternalQLS.g:3280:4: (kw= 'E' | kw= 'e' )
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==53) ) {
                        alt52=1;
                    }
                    else if ( (LA52_0==54) ) {
                        alt52=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 0, input);

                        throw nvae;
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalQLS.g:3281:5: kw= 'E'
                            {
                            kw=(Token)match(input,53,FOLLOW_52); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalQLS.g:3287:5: kw= 'e'
                            {
                            kw=(Token)match(input,54,FOLLOW_52); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_3_0_1());
                            				

                            }
                            break;

                    }

                    // InternalQLS.g:3293:4: (kw= '-' )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==55) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalQLS.g:3294:5: kw= '-'
                            {
                            kw=(Token)match(input,55,FOLLOW_43); 

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
    // InternalQLS.g:3312:1: entryRuleQuestionDefinition returns [EObject current=null] : iv_ruleQuestionDefinition= ruleQuestionDefinition EOF ;
    public final EObject entryRuleQuestionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionDefinition = null;


        try {
            // InternalQLS.g:3312:59: (iv_ruleQuestionDefinition= ruleQuestionDefinition EOF )
            // InternalQLS.g:3313:2: iv_ruleQuestionDefinition= ruleQuestionDefinition EOF
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
    // InternalQLS.g:3319:1: ruleQuestionDefinition returns [EObject current=null] : ( ( (lv_isMandatory_0_0= 'mandatory' ) )? otherlv_1= 'question' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_isDisplayed_4_0= 'isDisplayed' ) )? (otherlv_5= 'currentValue' ( (lv_currentValue_6_0= ruleValue ) ) )? otherlv_7= ')' )? otherlv_8= ':' ( (lv_label_9_0= ruleEString ) ) ( ( ruleEString ) ) (otherlv_11= '=' ( (lv_computedExpression_12_0= ruleExpression ) ) otherlv_13= ';' )? ) ;
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
            // InternalQLS.g:3325:2: ( ( ( (lv_isMandatory_0_0= 'mandatory' ) )? otherlv_1= 'question' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_isDisplayed_4_0= 'isDisplayed' ) )? (otherlv_5= 'currentValue' ( (lv_currentValue_6_0= ruleValue ) ) )? otherlv_7= ')' )? otherlv_8= ':' ( (lv_label_9_0= ruleEString ) ) ( ( ruleEString ) ) (otherlv_11= '=' ( (lv_computedExpression_12_0= ruleExpression ) ) otherlv_13= ';' )? ) )
            // InternalQLS.g:3326:2: ( ( (lv_isMandatory_0_0= 'mandatory' ) )? otherlv_1= 'question' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_isDisplayed_4_0= 'isDisplayed' ) )? (otherlv_5= 'currentValue' ( (lv_currentValue_6_0= ruleValue ) ) )? otherlv_7= ')' )? otherlv_8= ':' ( (lv_label_9_0= ruleEString ) ) ( ( ruleEString ) ) (otherlv_11= '=' ( (lv_computedExpression_12_0= ruleExpression ) ) otherlv_13= ';' )? )
            {
            // InternalQLS.g:3326:2: ( ( (lv_isMandatory_0_0= 'mandatory' ) )? otherlv_1= 'question' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_isDisplayed_4_0= 'isDisplayed' ) )? (otherlv_5= 'currentValue' ( (lv_currentValue_6_0= ruleValue ) ) )? otherlv_7= ')' )? otherlv_8= ':' ( (lv_label_9_0= ruleEString ) ) ( ( ruleEString ) ) (otherlv_11= '=' ( (lv_computedExpression_12_0= ruleExpression ) ) otherlv_13= ';' )? )
            // InternalQLS.g:3327:3: ( (lv_isMandatory_0_0= 'mandatory' ) )? otherlv_1= 'question' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_isDisplayed_4_0= 'isDisplayed' ) )? (otherlv_5= 'currentValue' ( (lv_currentValue_6_0= ruleValue ) ) )? otherlv_7= ')' )? otherlv_8= ':' ( (lv_label_9_0= ruleEString ) ) ( ( ruleEString ) ) (otherlv_11= '=' ( (lv_computedExpression_12_0= ruleExpression ) ) otherlv_13= ';' )?
            {
            // InternalQLS.g:3327:3: ( (lv_isMandatory_0_0= 'mandatory' ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==56) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalQLS.g:3328:4: (lv_isMandatory_0_0= 'mandatory' )
                    {
                    // InternalQLS.g:3328:4: (lv_isMandatory_0_0= 'mandatory' )
                    // InternalQLS.g:3329:5: lv_isMandatory_0_0= 'mandatory'
                    {
                    lv_isMandatory_0_0=(Token)match(input,56,FOLLOW_53); 

                    					newLeafNode(lv_isMandatory_0_0, grammarAccess.getQuestionDefinitionAccess().getIsMandatoryMandatoryKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getQuestionDefinitionRule());
                    					}
                    					setWithLastConsumed(current, "isMandatory", lv_isMandatory_0_0 != null, "mandatory");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,57,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getQuestionDefinitionAccess().getQuestionKeyword_1());
            		
            // InternalQLS.g:3345:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQLS.g:3346:4: (lv_name_2_0= ruleEString )
            {
            // InternalQLS.g:3346:4: (lv_name_2_0= ruleEString )
            // InternalQLS.g:3347:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getQuestionDefinitionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_54);
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

            // InternalQLS.g:3364:3: (otherlv_3= '(' ( (lv_isDisplayed_4_0= 'isDisplayed' ) )? (otherlv_5= 'currentValue' ( (lv_currentValue_6_0= ruleValue ) ) )? otherlv_7= ')' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==29) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalQLS.g:3365:4: otherlv_3= '(' ( (lv_isDisplayed_4_0= 'isDisplayed' ) )? (otherlv_5= 'currentValue' ( (lv_currentValue_6_0= ruleValue ) ) )? otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_55); 

                    				newLeafNode(otherlv_3, grammarAccess.getQuestionDefinitionAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalQLS.g:3369:4: ( (lv_isDisplayed_4_0= 'isDisplayed' ) )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==58) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // InternalQLS.g:3370:5: (lv_isDisplayed_4_0= 'isDisplayed' )
                            {
                            // InternalQLS.g:3370:5: (lv_isDisplayed_4_0= 'isDisplayed' )
                            // InternalQLS.g:3371:6: lv_isDisplayed_4_0= 'isDisplayed'
                            {
                            lv_isDisplayed_4_0=(Token)match(input,58,FOLLOW_56); 

                            						newLeafNode(lv_isDisplayed_4_0, grammarAccess.getQuestionDefinitionAccess().getIsDisplayedIsDisplayedKeyword_3_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getQuestionDefinitionRule());
                            						}
                            						setWithLastConsumed(current, "isDisplayed", lv_isDisplayed_4_0 != null, "isDisplayed");
                            					

                            }


                            }
                            break;

                    }

                    // InternalQLS.g:3383:4: (otherlv_5= 'currentValue' ( (lv_currentValue_6_0= ruleValue ) ) )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==59) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // InternalQLS.g:3384:5: otherlv_5= 'currentValue' ( (lv_currentValue_6_0= ruleValue ) )
                            {
                            otherlv_5=(Token)match(input,59,FOLLOW_57); 

                            					newLeafNode(otherlv_5, grammarAccess.getQuestionDefinitionAccess().getCurrentValueKeyword_3_2_0());
                            				
                            // InternalQLS.g:3388:5: ( (lv_currentValue_6_0= ruleValue ) )
                            // InternalQLS.g:3389:6: (lv_currentValue_6_0= ruleValue )
                            {
                            // InternalQLS.g:3389:6: (lv_currentValue_6_0= ruleValue )
                            // InternalQLS.g:3390:7: lv_currentValue_6_0= ruleValue
                            {

                            							newCompositeNode(grammarAccess.getQuestionDefinitionAccess().getCurrentValueValueParserRuleCall_3_2_1_0());
                            						
                            pushFollow(FOLLOW_24);
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

                    otherlv_7=(Token)match(input,30,FOLLOW_58); 

                    				newLeafNode(otherlv_7, grammarAccess.getQuestionDefinitionAccess().getRightParenthesisKeyword_3_3());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,60,FOLLOW_38); 

            			newLeafNode(otherlv_8, grammarAccess.getQuestionDefinitionAccess().getColonKeyword_4());
            		
            // InternalQLS.g:3417:3: ( (lv_label_9_0= ruleEString ) )
            // InternalQLS.g:3418:4: (lv_label_9_0= ruleEString )
            {
            // InternalQLS.g:3418:4: (lv_label_9_0= ruleEString )
            // InternalQLS.g:3419:5: lv_label_9_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getQuestionDefinitionAccess().getLabelEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_38);
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

            // InternalQLS.g:3436:3: ( ( ruleEString ) )
            // InternalQLS.g:3437:4: ( ruleEString )
            {
            // InternalQLS.g:3437:4: ( ruleEString )
            // InternalQLS.g:3438:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuestionDefinitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getQuestionDefinitionAccess().getDataTypeValueTypeCrossReference_6_0());
            				
            pushFollow(FOLLOW_31);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQLS.g:3452:3: (otherlv_11= '=' ( (lv_computedExpression_12_0= ruleExpression ) ) otherlv_13= ';' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==61) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalQLS.g:3453:4: otherlv_11= '=' ( (lv_computedExpression_12_0= ruleExpression ) ) otherlv_13= ';'
                    {
                    otherlv_11=(Token)match(input,61,FOLLOW_23); 

                    				newLeafNode(otherlv_11, grammarAccess.getQuestionDefinitionAccess().getEqualsSignKeyword_7_0());
                    			
                    // InternalQLS.g:3457:4: ( (lv_computedExpression_12_0= ruleExpression ) )
                    // InternalQLS.g:3458:5: (lv_computedExpression_12_0= ruleExpression )
                    {
                    // InternalQLS.g:3458:5: (lv_computedExpression_12_0= ruleExpression )
                    // InternalQLS.g:3459:6: lv_computedExpression_12_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getQuestionDefinitionAccess().getComputedExpressionExpressionParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_59);
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

                    otherlv_13=(Token)match(input,62,FOLLOW_2); 

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
    // InternalQLS.g:3485:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalQLS.g:3485:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalQLS.g:3486:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalQLS.g:3492:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalQLS.g:3498:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalQLS.g:3499:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalQLS.g:3499:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalQLS.g:3500:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_60); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalQLS.g:3507:3: (kw= '.' this_ID_2= RULE_ID )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==52) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalQLS.g:3508:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,52,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_60); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop60;
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
    // InternalQLS.g:3525:1: ruleBooleanStyleKind returns [Enumerator current=null] : ( (enumLiteral_0= 'CHECKBOX' ) | (enumLiteral_1= 'TWO_RADIO' ) | (enumLiteral_2= 'DROPDOWN' ) ) ;
    public final Enumerator ruleBooleanStyleKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalQLS.g:3531:2: ( ( (enumLiteral_0= 'CHECKBOX' ) | (enumLiteral_1= 'TWO_RADIO' ) | (enumLiteral_2= 'DROPDOWN' ) ) )
            // InternalQLS.g:3532:2: ( (enumLiteral_0= 'CHECKBOX' ) | (enumLiteral_1= 'TWO_RADIO' ) | (enumLiteral_2= 'DROPDOWN' ) )
            {
            // InternalQLS.g:3532:2: ( (enumLiteral_0= 'CHECKBOX' ) | (enumLiteral_1= 'TWO_RADIO' ) | (enumLiteral_2= 'DROPDOWN' ) )
            int alt61=3;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt61=1;
                }
                break;
            case 64:
                {
                alt61=2;
                }
                break;
            case 65:
                {
                alt61=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // InternalQLS.g:3533:3: (enumLiteral_0= 'CHECKBOX' )
                    {
                    // InternalQLS.g:3533:3: (enumLiteral_0= 'CHECKBOX' )
                    // InternalQLS.g:3534:4: enumLiteral_0= 'CHECKBOX'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getBooleanStyleKindAccess().getCHECKBOXEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBooleanStyleKindAccess().getCHECKBOXEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:3541:3: (enumLiteral_1= 'TWO_RADIO' )
                    {
                    // InternalQLS.g:3541:3: (enumLiteral_1= 'TWO_RADIO' )
                    // InternalQLS.g:3542:4: enumLiteral_1= 'TWO_RADIO'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getBooleanStyleKindAccess().getTWO_RADIOEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBooleanStyleKindAccess().getTWO_RADIOEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalQLS.g:3549:3: (enumLiteral_2= 'DROPDOWN' )
                    {
                    // InternalQLS.g:3549:3: (enumLiteral_2= 'DROPDOWN' )
                    // InternalQLS.g:3550:4: enumLiteral_2= 'DROPDOWN'
                    {
                    enumLiteral_2=(Token)match(input,65,FOLLOW_2); 

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
    // InternalQLS.g:3560:1: ruleBinaryOperatorKind returns [Enumerator current=null] : ( (enumLiteral_0= 'PLUS' ) | (enumLiteral_1= 'MINUS' ) | (enumLiteral_2= 'MULT' ) | (enumLiteral_3= 'DIV' ) | (enumLiteral_4= 'EQUAL' ) | (enumLiteral_5= 'NOTEQUAL' ) | (enumLiteral_6= 'GREATER' ) | (enumLiteral_7= 'LOWER' ) | (enumLiteral_8= 'GREATEROREQUAL' ) | (enumLiteral_9= 'LOWEROREQUAL' ) | (enumLiteral_10= 'AND' ) | (enumLiteral_11= 'OR' ) ) ;
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
            // InternalQLS.g:3566:2: ( ( (enumLiteral_0= 'PLUS' ) | (enumLiteral_1= 'MINUS' ) | (enumLiteral_2= 'MULT' ) | (enumLiteral_3= 'DIV' ) | (enumLiteral_4= 'EQUAL' ) | (enumLiteral_5= 'NOTEQUAL' ) | (enumLiteral_6= 'GREATER' ) | (enumLiteral_7= 'LOWER' ) | (enumLiteral_8= 'GREATEROREQUAL' ) | (enumLiteral_9= 'LOWEROREQUAL' ) | (enumLiteral_10= 'AND' ) | (enumLiteral_11= 'OR' ) ) )
            // InternalQLS.g:3567:2: ( (enumLiteral_0= 'PLUS' ) | (enumLiteral_1= 'MINUS' ) | (enumLiteral_2= 'MULT' ) | (enumLiteral_3= 'DIV' ) | (enumLiteral_4= 'EQUAL' ) | (enumLiteral_5= 'NOTEQUAL' ) | (enumLiteral_6= 'GREATER' ) | (enumLiteral_7= 'LOWER' ) | (enumLiteral_8= 'GREATEROREQUAL' ) | (enumLiteral_9= 'LOWEROREQUAL' ) | (enumLiteral_10= 'AND' ) | (enumLiteral_11= 'OR' ) )
            {
            // InternalQLS.g:3567:2: ( (enumLiteral_0= 'PLUS' ) | (enumLiteral_1= 'MINUS' ) | (enumLiteral_2= 'MULT' ) | (enumLiteral_3= 'DIV' ) | (enumLiteral_4= 'EQUAL' ) | (enumLiteral_5= 'NOTEQUAL' ) | (enumLiteral_6= 'GREATER' ) | (enumLiteral_7= 'LOWER' ) | (enumLiteral_8= 'GREATEROREQUAL' ) | (enumLiteral_9= 'LOWEROREQUAL' ) | (enumLiteral_10= 'AND' ) | (enumLiteral_11= 'OR' ) )
            int alt62=12;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt62=1;
                }
                break;
            case 67:
                {
                alt62=2;
                }
                break;
            case 68:
                {
                alt62=3;
                }
                break;
            case 69:
                {
                alt62=4;
                }
                break;
            case 70:
                {
                alt62=5;
                }
                break;
            case 71:
                {
                alt62=6;
                }
                break;
            case 72:
                {
                alt62=7;
                }
                break;
            case 73:
                {
                alt62=8;
                }
                break;
            case 74:
                {
                alt62=9;
                }
                break;
            case 75:
                {
                alt62=10;
                }
                break;
            case 76:
                {
                alt62=11;
                }
                break;
            case 77:
                {
                alt62=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // InternalQLS.g:3568:3: (enumLiteral_0= 'PLUS' )
                    {
                    // InternalQLS.g:3568:3: (enumLiteral_0= 'PLUS' )
                    // InternalQLS.g:3569:4: enumLiteral_0= 'PLUS'
                    {
                    enumLiteral_0=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBinaryOperatorKindAccess().getPLUSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:3576:3: (enumLiteral_1= 'MINUS' )
                    {
                    // InternalQLS.g:3576:3: (enumLiteral_1= 'MINUS' )
                    // InternalQLS.g:3577:4: enumLiteral_1= 'MINUS'
                    {
                    enumLiteral_1=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBinaryOperatorKindAccess().getMINUSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalQLS.g:3584:3: (enumLiteral_2= 'MULT' )
                    {
                    // InternalQLS.g:3584:3: (enumLiteral_2= 'MULT' )
                    // InternalQLS.g:3585:4: enumLiteral_2= 'MULT'
                    {
                    enumLiteral_2=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBinaryOperatorKindAccess().getMULTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalQLS.g:3592:3: (enumLiteral_3= 'DIV' )
                    {
                    // InternalQLS.g:3592:3: (enumLiteral_3= 'DIV' )
                    // InternalQLS.g:3593:4: enumLiteral_3= 'DIV'
                    {
                    enumLiteral_3=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getDIVEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBinaryOperatorKindAccess().getDIVEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalQLS.g:3600:3: (enumLiteral_4= 'EQUAL' )
                    {
                    // InternalQLS.g:3600:3: (enumLiteral_4= 'EQUAL' )
                    // InternalQLS.g:3601:4: enumLiteral_4= 'EQUAL'
                    {
                    enumLiteral_4=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getEQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getBinaryOperatorKindAccess().getEQUALEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalQLS.g:3608:3: (enumLiteral_5= 'NOTEQUAL' )
                    {
                    // InternalQLS.g:3608:3: (enumLiteral_5= 'NOTEQUAL' )
                    // InternalQLS.g:3609:4: enumLiteral_5= 'NOTEQUAL'
                    {
                    enumLiteral_5=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getNOTEQUALEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getBinaryOperatorKindAccess().getNOTEQUALEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalQLS.g:3616:3: (enumLiteral_6= 'GREATER' )
                    {
                    // InternalQLS.g:3616:3: (enumLiteral_6= 'GREATER' )
                    // InternalQLS.g:3617:4: enumLiteral_6= 'GREATER'
                    {
                    enumLiteral_6=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getGREATEREnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getBinaryOperatorKindAccess().getGREATEREnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalQLS.g:3624:3: (enumLiteral_7= 'LOWER' )
                    {
                    // InternalQLS.g:3624:3: (enumLiteral_7= 'LOWER' )
                    // InternalQLS.g:3625:4: enumLiteral_7= 'LOWER'
                    {
                    enumLiteral_7=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getLOWEREnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getBinaryOperatorKindAccess().getLOWEREnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalQLS.g:3632:3: (enumLiteral_8= 'GREATEROREQUAL' )
                    {
                    // InternalQLS.g:3632:3: (enumLiteral_8= 'GREATEROREQUAL' )
                    // InternalQLS.g:3633:4: enumLiteral_8= 'GREATEROREQUAL'
                    {
                    enumLiteral_8=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getBinaryOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalQLS.g:3640:3: (enumLiteral_9= 'LOWEROREQUAL' )
                    {
                    // InternalQLS.g:3640:3: (enumLiteral_9= 'LOWEROREQUAL' )
                    // InternalQLS.g:3641:4: enumLiteral_9= 'LOWEROREQUAL'
                    {
                    enumLiteral_9=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getLOWEROREQUALEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getBinaryOperatorKindAccess().getLOWEROREQUALEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalQLS.g:3648:3: (enumLiteral_10= 'AND' )
                    {
                    // InternalQLS.g:3648:3: (enumLiteral_10= 'AND' )
                    // InternalQLS.g:3649:4: enumLiteral_10= 'AND'
                    {
                    enumLiteral_10=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getBinaryOperatorKindAccess().getANDEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getBinaryOperatorKindAccess().getANDEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalQLS.g:3656:3: (enumLiteral_11= 'OR' )
                    {
                    // InternalQLS.g:3656:3: (enumLiteral_11= 'OR' )
                    // InternalQLS.g:3657:4: enumLiteral_11= 'OR'
                    {
                    enumLiteral_11=(Token)match(input,77,FOLLOW_2); 

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
    // InternalQLS.g:3667:1: ruleUnaryOperatorKind returns [Enumerator current=null] : ( (enumLiteral_0= '-' ) | (enumLiteral_1= 'not' ) ) ;
    public final Enumerator ruleUnaryOperatorKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalQLS.g:3673:2: ( ( (enumLiteral_0= '-' ) | (enumLiteral_1= 'not' ) ) )
            // InternalQLS.g:3674:2: ( (enumLiteral_0= '-' ) | (enumLiteral_1= 'not' ) )
            {
            // InternalQLS.g:3674:2: ( (enumLiteral_0= '-' ) | (enumLiteral_1= 'not' ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==55) ) {
                alt63=1;
            }
            else if ( (LA63_0==78) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalQLS.g:3675:3: (enumLiteral_0= '-' )
                    {
                    // InternalQLS.g:3675:3: (enumLiteral_0= '-' )
                    // InternalQLS.g:3676:4: enumLiteral_0= '-'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getUnaryOperatorKindAccess().getUNARYMINUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorKindAccess().getUNARYMINUSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:3683:3: (enumLiteral_1= 'not' )
                    {
                    // InternalQLS.g:3683:3: (enumLiteral_1= 'not' )
                    // InternalQLS.g:3684:4: enumLiteral_1= 'not'
                    {
                    enumLiteral_1=(Token)match(input,78,FOLLOW_2); 

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
    // InternalQLS.g:3694:1: ruleAdditionOperatorKind returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditionOperatorKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalQLS.g:3700:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalQLS.g:3701:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalQLS.g:3701:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==79) ) {
                alt64=1;
            }
            else if ( (LA64_0==55) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalQLS.g:3702:3: (enumLiteral_0= '+' )
                    {
                    // InternalQLS.g:3702:3: (enumLiteral_0= '+' )
                    // InternalQLS.g:3703:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getAdditionOperatorKindAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAdditionOperatorKindAccess().getPLUSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:3710:3: (enumLiteral_1= '-' )
                    {
                    // InternalQLS.g:3710:3: (enumLiteral_1= '-' )
                    // InternalQLS.g:3711:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_2); 

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
    // InternalQLS.g:3721:1: ruleMultiplicationOperatorKind returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) ;
    public final Enumerator ruleMultiplicationOperatorKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalQLS.g:3727:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) )
            // InternalQLS.g:3728:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            {
            // InternalQLS.g:3728:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==80) ) {
                alt65=1;
            }
            else if ( (LA65_0==81) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalQLS.g:3729:3: (enumLiteral_0= '*' )
                    {
                    // InternalQLS.g:3729:3: (enumLiteral_0= '*' )
                    // InternalQLS.g:3730:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicationOperatorKindAccess().getMULTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMultiplicationOperatorKindAccess().getMULTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:3737:3: (enumLiteral_1= '/' )
                    {
                    // InternalQLS.g:3737:3: (enumLiteral_1= '/' )
                    // InternalQLS.g:3738:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,81,FOLLOW_2); 

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
    // InternalQLS.g:3748:1: ruleEqualOperatorKind returns [Enumerator current=null] : (enumLiteral_0= '=' ) ;
    public final Enumerator ruleEqualOperatorKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalQLS.g:3754:2: ( (enumLiteral_0= '=' ) )
            // InternalQLS.g:3755:2: (enumLiteral_0= '=' )
            {
            // InternalQLS.g:3755:2: (enumLiteral_0= '=' )
            // InternalQLS.g:3756:3: enumLiteral_0= '='
            {
            enumLiteral_0=(Token)match(input,61,FOLLOW_2); 

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
    // InternalQLS.g:3765:1: ruleComparisionOperatorKind returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) ) ;
    public final Enumerator ruleComparisionOperatorKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalQLS.g:3771:2: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) ) )
            // InternalQLS.g:3772:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) )
            {
            // InternalQLS.g:3772:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) )
            int alt66=4;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt66=1;
                }
                break;
            case 83:
                {
                alt66=2;
                }
                break;
            case 84:
                {
                alt66=3;
                }
                break;
            case 85:
                {
                alt66=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // InternalQLS.g:3773:3: (enumLiteral_0= '>' )
                    {
                    // InternalQLS.g:3773:3: (enumLiteral_0= '>' )
                    // InternalQLS.g:3774:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getComparisionOperatorKindAccess().getGREATEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getComparisionOperatorKindAccess().getGREATEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:3781:3: (enumLiteral_1= '<' )
                    {
                    // InternalQLS.g:3781:3: (enumLiteral_1= '<' )
                    // InternalQLS.g:3782:4: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getComparisionOperatorKindAccess().getLOWEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getComparisionOperatorKindAccess().getLOWEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalQLS.g:3789:3: (enumLiteral_2= '>=' )
                    {
                    // InternalQLS.g:3789:3: (enumLiteral_2= '>=' )
                    // InternalQLS.g:3790:4: enumLiteral_2= '>='
                    {
                    enumLiteral_2=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getComparisionOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getComparisionOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalQLS.g:3797:3: (enumLiteral_3= '<=' )
                    {
                    // InternalQLS.g:3797:3: (enumLiteral_3= '<=' )
                    // InternalQLS.g:3798:4: enumLiteral_3= '<='
                    {
                    enumLiteral_3=(Token)match(input,85,FOLLOW_2); 

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
    // InternalQLS.g:3808:1: ruleAndOperatorKind returns [Enumerator current=null] : (enumLiteral_0= 'and' ) ;
    public final Enumerator ruleAndOperatorKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalQLS.g:3814:2: ( (enumLiteral_0= 'and' ) )
            // InternalQLS.g:3815:2: (enumLiteral_0= 'and' )
            {
            // InternalQLS.g:3815:2: (enumLiteral_0= 'and' )
            // InternalQLS.g:3816:3: enumLiteral_0= 'and'
            {
            enumLiteral_0=(Token)match(input,86,FOLLOW_2); 

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
    // InternalQLS.g:3825:1: ruleOrOperatorKind returns [Enumerator current=null] : (enumLiteral_0= 'or' ) ;
    public final Enumerator ruleOrOperatorKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalQLS.g:3831:2: ( (enumLiteral_0= 'or' ) )
            // InternalQLS.g:3832:2: (enumLiteral_0= 'or' )
            {
            // InternalQLS.g:3832:2: (enumLiteral_0= 'or' )
            // InternalQLS.g:3833:3: enumLiteral_0= 'or'
            {
            enumLiteral_0=(Token)match(input,87,FOLLOW_2); 

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


    protected DFA25 dfa25 = new DFA25(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\2\uffff\1\5\3\uffff\1\5";
    static final String dfa_3s = "\1\4\1\uffff\1\14\1\5\2\uffff\1\14";
    static final String dfa_4s = "\1\64\1\uffff\1\127\1\5\2\uffff\1\127";
    static final String dfa_5s = "\1\uffff\1\1\2\uffff\1\2\1\3\1\uffff";
    static final String dfa_6s = "\7\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\1\34\uffff\2\1\17\uffff\1\1",
            "",
            "\1\5\20\uffff\1\4\1\5\1\uffff\3\5\21\uffff\1\3\2\uffff\1\5\5\uffff\2\5\20\uffff\11\5",
            "\1\6",
            "",
            "",
            "\1\5\20\uffff\1\4\1\5\1\uffff\3\5\21\uffff\1\3\2\uffff\1\5\5\uffff\2\5\20\uffff\11\5"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1671:2: (this_ConstantCall_0= ruleConstantCall | this_QuestionCall_1= ruleQuestionCall | this_EnumerationCall_2= ruleEnumerationCall )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000014020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C4000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008C00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000304000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0010000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010004000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00900018A0000070L,0x0000000000004000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00100018A0000070L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000002L,0x00000000003C0000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0080000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0302734000004000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000080005020L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000004000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00000C8000004000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00000C0000004000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000080000004000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000808000004000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000800000004000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0001000000004000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0008000000004000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0080000000000040L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x1000000020000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0C00000040000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0800000040000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0014001800000050L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0010000000000002L});

}