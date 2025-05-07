package org.gemoc.qls.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.gemoc.qls.services.QLSGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQLSParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'EDate'", "'='", "'and'", "'or'", "'true'", "'false'", "'E'", "'e'", "'CHECKBOX'", "'TWO_RADIO'", "'DROPDOWN'", "'PLUS'", "'MINUS'", "'MULT'", "'DIV'", "'EQUAL'", "'NOTEQUAL'", "'GREATER'", "'LOWER'", "'GREATEROREQUAL'", "'LOWEROREQUAL'", "'AND'", "'OR'", "'-'", "'not'", "'+'", "'*'", "'/'", "'>'", "'<'", "'>='", "'<='", "'QLSModel'", "'{'", "'questionStyles'", "'}'", "'import'", "'styledQuestion'", "'labelStyle'", "'typeStyle'", "'BooleanStyle'", "'NumericStyle'", "'textField'", "'step'", "'spinner'", "'TextStyle'", "'('", "')'", "'if'", "'then'", "'endif'", "'else'", "'Form'", "'definitions'", "'ValueType'", "'unit'", "'booleanType'", "'integerType'", "'min'", "'max'", "'decimalType'", "'dateType'", "'enumerationType'", "'literals'", "','", "'StringType'", "'DateValue'", "'dateValue'", "'.'", "'question'", "':'", "'currentValue'", "';'", "'italic'", "'bold'", "'multiline'", "'mandatory'", "'isDisplayed'"
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
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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

    	public void setGrammarAccess(QLSGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleQLSModel"
    // InternalQLS.g:53:1: entryRuleQLSModel : ruleQLSModel EOF ;
    public final void entryRuleQLSModel() throws RecognitionException {
        try {
            // InternalQLS.g:54:1: ( ruleQLSModel EOF )
            // InternalQLS.g:55:1: ruleQLSModel EOF
            {
             before(grammarAccess.getQLSModelRule()); 
            pushFollow(FOLLOW_1);
            ruleQLSModel();

            state._fsp--;

             after(grammarAccess.getQLSModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQLSModel"


    // $ANTLR start "ruleQLSModel"
    // InternalQLS.g:62:1: ruleQLSModel : ( ( rule__QLSModel__Group__0 ) ) ;
    public final void ruleQLSModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:66:2: ( ( ( rule__QLSModel__Group__0 ) ) )
            // InternalQLS.g:67:2: ( ( rule__QLSModel__Group__0 ) )
            {
            // InternalQLS.g:67:2: ( ( rule__QLSModel__Group__0 ) )
            // InternalQLS.g:68:3: ( rule__QLSModel__Group__0 )
            {
             before(grammarAccess.getQLSModelAccess().getGroup()); 
            // InternalQLS.g:69:3: ( rule__QLSModel__Group__0 )
            // InternalQLS.g:69:4: rule__QLSModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QLSModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQLSModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQLSModel"


    // $ANTLR start "entryRuleImport"
    // InternalQLS.g:78:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalQLS.g:79:1: ( ruleImport EOF )
            // InternalQLS.g:80:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalQLS.g:87:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:91:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalQLS.g:92:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalQLS.g:92:2: ( ( rule__Import__Group__0 ) )
            // InternalQLS.g:93:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalQLS.g:94:3: ( rule__Import__Group__0 )
            // InternalQLS.g:94:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleTypeStyle"
    // InternalQLS.g:103:1: entryRuleTypeStyle : ruleTypeStyle EOF ;
    public final void entryRuleTypeStyle() throws RecognitionException {
        try {
            // InternalQLS.g:104:1: ( ruleTypeStyle EOF )
            // InternalQLS.g:105:1: ruleTypeStyle EOF
            {
             before(grammarAccess.getTypeStyleRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeStyle();

            state._fsp--;

             after(grammarAccess.getTypeStyleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeStyle"


    // $ANTLR start "ruleTypeStyle"
    // InternalQLS.g:112:1: ruleTypeStyle : ( ( rule__TypeStyle__Alternatives ) ) ;
    public final void ruleTypeStyle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:116:2: ( ( ( rule__TypeStyle__Alternatives ) ) )
            // InternalQLS.g:117:2: ( ( rule__TypeStyle__Alternatives ) )
            {
            // InternalQLS.g:117:2: ( ( rule__TypeStyle__Alternatives ) )
            // InternalQLS.g:118:3: ( rule__TypeStyle__Alternatives )
            {
             before(grammarAccess.getTypeStyleAccess().getAlternatives()); 
            // InternalQLS.g:119:3: ( rule__TypeStyle__Alternatives )
            // InternalQLS.g:119:4: rule__TypeStyle__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeStyle__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeStyleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeStyle"


    // $ANTLR start "entryRuleNumericTypeStyle"
    // InternalQLS.g:128:1: entryRuleNumericTypeStyle : ruleNumericTypeStyle EOF ;
    public final void entryRuleNumericTypeStyle() throws RecognitionException {
        try {
            // InternalQLS.g:129:1: ( ruleNumericTypeStyle EOF )
            // InternalQLS.g:130:1: ruleNumericTypeStyle EOF
            {
             before(grammarAccess.getNumericTypeStyleRule()); 
            pushFollow(FOLLOW_1);
            ruleNumericTypeStyle();

            state._fsp--;

             after(grammarAccess.getNumericTypeStyleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumericTypeStyle"


    // $ANTLR start "ruleNumericTypeStyle"
    // InternalQLS.g:137:1: ruleNumericTypeStyle : ( ( rule__NumericTypeStyle__Alternatives ) ) ;
    public final void ruleNumericTypeStyle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:141:2: ( ( ( rule__NumericTypeStyle__Alternatives ) ) )
            // InternalQLS.g:142:2: ( ( rule__NumericTypeStyle__Alternatives ) )
            {
            // InternalQLS.g:142:2: ( ( rule__NumericTypeStyle__Alternatives ) )
            // InternalQLS.g:143:3: ( rule__NumericTypeStyle__Alternatives )
            {
             before(grammarAccess.getNumericTypeStyleAccess().getAlternatives()); 
            // InternalQLS.g:144:3: ( rule__NumericTypeStyle__Alternatives )
            // InternalQLS.g:144:4: rule__NumericTypeStyle__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NumericTypeStyle__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumericTypeStyleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumericTypeStyle"


    // $ANTLR start "entryRuleQuestionStyle"
    // InternalQLS.g:153:1: entryRuleQuestionStyle : ruleQuestionStyle EOF ;
    public final void entryRuleQuestionStyle() throws RecognitionException {
        try {
            // InternalQLS.g:154:1: ( ruleQuestionStyle EOF )
            // InternalQLS.g:155:1: ruleQuestionStyle EOF
            {
             before(grammarAccess.getQuestionStyleRule()); 
            pushFollow(FOLLOW_1);
            ruleQuestionStyle();

            state._fsp--;

             after(grammarAccess.getQuestionStyleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestionStyle"


    // $ANTLR start "ruleQuestionStyle"
    // InternalQLS.g:162:1: ruleQuestionStyle : ( ( rule__QuestionStyle__Group__0 ) ) ;
    public final void ruleQuestionStyle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:166:2: ( ( ( rule__QuestionStyle__Group__0 ) ) )
            // InternalQLS.g:167:2: ( ( rule__QuestionStyle__Group__0 ) )
            {
            // InternalQLS.g:167:2: ( ( rule__QuestionStyle__Group__0 ) )
            // InternalQLS.g:168:3: ( rule__QuestionStyle__Group__0 )
            {
             before(grammarAccess.getQuestionStyleAccess().getGroup()); 
            // InternalQLS.g:169:3: ( rule__QuestionStyle__Group__0 )
            // InternalQLS.g:169:4: rule__QuestionStyle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QuestionStyle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionStyleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestionStyle"


    // $ANTLR start "entryRuleLabelStyle"
    // InternalQLS.g:178:1: entryRuleLabelStyle : ruleLabelStyle EOF ;
    public final void entryRuleLabelStyle() throws RecognitionException {
        try {
            // InternalQLS.g:179:1: ( ruleLabelStyle EOF )
            // InternalQLS.g:180:1: ruleLabelStyle EOF
            {
             before(grammarAccess.getLabelStyleRule()); 
            pushFollow(FOLLOW_1);
            ruleLabelStyle();

            state._fsp--;

             after(grammarAccess.getLabelStyleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLabelStyle"


    // $ANTLR start "ruleLabelStyle"
    // InternalQLS.g:187:1: ruleLabelStyle : ( ( rule__LabelStyle__Group__0 ) ) ;
    public final void ruleLabelStyle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:191:2: ( ( ( rule__LabelStyle__Group__0 ) ) )
            // InternalQLS.g:192:2: ( ( rule__LabelStyle__Group__0 ) )
            {
            // InternalQLS.g:192:2: ( ( rule__LabelStyle__Group__0 ) )
            // InternalQLS.g:193:3: ( rule__LabelStyle__Group__0 )
            {
             before(grammarAccess.getLabelStyleAccess().getGroup()); 
            // InternalQLS.g:194:3: ( rule__LabelStyle__Group__0 )
            // InternalQLS.g:194:4: rule__LabelStyle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LabelStyle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLabelStyleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLabelStyle"


    // $ANTLR start "entryRuleBooleanTypeStyle"
    // InternalQLS.g:203:1: entryRuleBooleanTypeStyle : ruleBooleanTypeStyle EOF ;
    public final void entryRuleBooleanTypeStyle() throws RecognitionException {
        try {
            // InternalQLS.g:204:1: ( ruleBooleanTypeStyle EOF )
            // InternalQLS.g:205:1: ruleBooleanTypeStyle EOF
            {
             before(grammarAccess.getBooleanTypeStyleRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanTypeStyle();

            state._fsp--;

             after(grammarAccess.getBooleanTypeStyleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanTypeStyle"


    // $ANTLR start "ruleBooleanTypeStyle"
    // InternalQLS.g:212:1: ruleBooleanTypeStyle : ( ( rule__BooleanTypeStyle__Group__0 ) ) ;
    public final void ruleBooleanTypeStyle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:216:2: ( ( ( rule__BooleanTypeStyle__Group__0 ) ) )
            // InternalQLS.g:217:2: ( ( rule__BooleanTypeStyle__Group__0 ) )
            {
            // InternalQLS.g:217:2: ( ( rule__BooleanTypeStyle__Group__0 ) )
            // InternalQLS.g:218:3: ( rule__BooleanTypeStyle__Group__0 )
            {
             before(grammarAccess.getBooleanTypeStyleAccess().getGroup()); 
            // InternalQLS.g:219:3: ( rule__BooleanTypeStyle__Group__0 )
            // InternalQLS.g:219:4: rule__BooleanTypeStyle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanTypeStyle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanTypeStyleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanTypeStyle"


    // $ANTLR start "entryRuleNumericTypeTextFieldStyle"
    // InternalQLS.g:228:1: entryRuleNumericTypeTextFieldStyle : ruleNumericTypeTextFieldStyle EOF ;
    public final void entryRuleNumericTypeTextFieldStyle() throws RecognitionException {
        try {
            // InternalQLS.g:229:1: ( ruleNumericTypeTextFieldStyle EOF )
            // InternalQLS.g:230:1: ruleNumericTypeTextFieldStyle EOF
            {
             before(grammarAccess.getNumericTypeTextFieldStyleRule()); 
            pushFollow(FOLLOW_1);
            ruleNumericTypeTextFieldStyle();

            state._fsp--;

             after(grammarAccess.getNumericTypeTextFieldStyleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumericTypeTextFieldStyle"


    // $ANTLR start "ruleNumericTypeTextFieldStyle"
    // InternalQLS.g:237:1: ruleNumericTypeTextFieldStyle : ( ( rule__NumericTypeTextFieldStyle__Group__0 ) ) ;
    public final void ruleNumericTypeTextFieldStyle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:241:2: ( ( ( rule__NumericTypeTextFieldStyle__Group__0 ) ) )
            // InternalQLS.g:242:2: ( ( rule__NumericTypeTextFieldStyle__Group__0 ) )
            {
            // InternalQLS.g:242:2: ( ( rule__NumericTypeTextFieldStyle__Group__0 ) )
            // InternalQLS.g:243:3: ( rule__NumericTypeTextFieldStyle__Group__0 )
            {
             before(grammarAccess.getNumericTypeTextFieldStyleAccess().getGroup()); 
            // InternalQLS.g:244:3: ( rule__NumericTypeTextFieldStyle__Group__0 )
            // InternalQLS.g:244:4: rule__NumericTypeTextFieldStyle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NumericTypeTextFieldStyle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumericTypeTextFieldStyleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumericTypeTextFieldStyle"


    // $ANTLR start "entryRuleNumericTypeSpinnerStyle"
    // InternalQLS.g:253:1: entryRuleNumericTypeSpinnerStyle : ruleNumericTypeSpinnerStyle EOF ;
    public final void entryRuleNumericTypeSpinnerStyle() throws RecognitionException {
        try {
            // InternalQLS.g:254:1: ( ruleNumericTypeSpinnerStyle EOF )
            // InternalQLS.g:255:1: ruleNumericTypeSpinnerStyle EOF
            {
             before(grammarAccess.getNumericTypeSpinnerStyleRule()); 
            pushFollow(FOLLOW_1);
            ruleNumericTypeSpinnerStyle();

            state._fsp--;

             after(grammarAccess.getNumericTypeSpinnerStyleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumericTypeSpinnerStyle"


    // $ANTLR start "ruleNumericTypeSpinnerStyle"
    // InternalQLS.g:262:1: ruleNumericTypeSpinnerStyle : ( ( rule__NumericTypeSpinnerStyle__Group__0 ) ) ;
    public final void ruleNumericTypeSpinnerStyle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:266:2: ( ( ( rule__NumericTypeSpinnerStyle__Group__0 ) ) )
            // InternalQLS.g:267:2: ( ( rule__NumericTypeSpinnerStyle__Group__0 ) )
            {
            // InternalQLS.g:267:2: ( ( rule__NumericTypeSpinnerStyle__Group__0 ) )
            // InternalQLS.g:268:3: ( rule__NumericTypeSpinnerStyle__Group__0 )
            {
             before(grammarAccess.getNumericTypeSpinnerStyleAccess().getGroup()); 
            // InternalQLS.g:269:3: ( rule__NumericTypeSpinnerStyle__Group__0 )
            // InternalQLS.g:269:4: rule__NumericTypeSpinnerStyle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NumericTypeSpinnerStyle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumericTypeSpinnerStyleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumericTypeSpinnerStyle"


    // $ANTLR start "entryRuleTextTypeStyle"
    // InternalQLS.g:278:1: entryRuleTextTypeStyle : ruleTextTypeStyle EOF ;
    public final void entryRuleTextTypeStyle() throws RecognitionException {
        try {
            // InternalQLS.g:279:1: ( ruleTextTypeStyle EOF )
            // InternalQLS.g:280:1: ruleTextTypeStyle EOF
            {
             before(grammarAccess.getTextTypeStyleRule()); 
            pushFollow(FOLLOW_1);
            ruleTextTypeStyle();

            state._fsp--;

             after(grammarAccess.getTextTypeStyleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTextTypeStyle"


    // $ANTLR start "ruleTextTypeStyle"
    // InternalQLS.g:287:1: ruleTextTypeStyle : ( ( rule__TextTypeStyle__Group__0 ) ) ;
    public final void ruleTextTypeStyle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:291:2: ( ( ( rule__TextTypeStyle__Group__0 ) ) )
            // InternalQLS.g:292:2: ( ( rule__TextTypeStyle__Group__0 ) )
            {
            // InternalQLS.g:292:2: ( ( rule__TextTypeStyle__Group__0 ) )
            // InternalQLS.g:293:3: ( rule__TextTypeStyle__Group__0 )
            {
             before(grammarAccess.getTextTypeStyleAccess().getGroup()); 
            // InternalQLS.g:294:3: ( rule__TextTypeStyle__Group__0 )
            // InternalQLS.g:294:4: rule__TextTypeStyle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TextTypeStyle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextTypeStyleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextTypeStyle"


    // $ANTLR start "entryRuleValueType"
    // InternalQLS.g:303:1: entryRuleValueType : ruleValueType EOF ;
    public final void entryRuleValueType() throws RecognitionException {
        try {
            // InternalQLS.g:304:1: ( ruleValueType EOF )
            // InternalQLS.g:305:1: ruleValueType EOF
            {
             before(grammarAccess.getValueTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleValueType();

            state._fsp--;

             after(grammarAccess.getValueTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValueType"


    // $ANTLR start "ruleValueType"
    // InternalQLS.g:312:1: ruleValueType : ( ( rule__ValueType__Alternatives ) ) ;
    public final void ruleValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:316:2: ( ( ( rule__ValueType__Alternatives ) ) )
            // InternalQLS.g:317:2: ( ( rule__ValueType__Alternatives ) )
            {
            // InternalQLS.g:317:2: ( ( rule__ValueType__Alternatives ) )
            // InternalQLS.g:318:3: ( rule__ValueType__Alternatives )
            {
             before(grammarAccess.getValueTypeAccess().getAlternatives()); 
            // InternalQLS.g:319:3: ( rule__ValueType__Alternatives )
            // InternalQLS.g:319:4: rule__ValueType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ValueType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValueType"


    // $ANTLR start "entryRuleExpression"
    // InternalQLS.g:328:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalQLS.g:329:1: ( ruleExpression EOF )
            // InternalQLS.g:330:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalQLS.g:337:1: ruleExpression : ( ruleUnaryOrPrimaryExpression ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:341:2: ( ( ruleUnaryOrPrimaryExpression ) )
            // InternalQLS.g:342:2: ( ruleUnaryOrPrimaryExpression )
            {
            // InternalQLS.g:342:2: ( ruleUnaryOrPrimaryExpression )
            // InternalQLS.g:343:3: ruleUnaryOrPrimaryExpression
            {
             before(grammarAccess.getExpressionAccess().getUnaryOrPrimaryExpressionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleUnaryOrPrimaryExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getUnaryOrPrimaryExpressionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleUnaryOrPrimaryExpression"
    // InternalQLS.g:353:1: entryRuleUnaryOrPrimaryExpression : ruleUnaryOrPrimaryExpression EOF ;
    public final void entryRuleUnaryOrPrimaryExpression() throws RecognitionException {
        try {
            // InternalQLS.g:354:1: ( ruleUnaryOrPrimaryExpression EOF )
            // InternalQLS.g:355:1: ruleUnaryOrPrimaryExpression EOF
            {
             before(grammarAccess.getUnaryOrPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleUnaryOrPrimaryExpression();

            state._fsp--;

             after(grammarAccess.getUnaryOrPrimaryExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnaryOrPrimaryExpression"


    // $ANTLR start "ruleUnaryOrPrimaryExpression"
    // InternalQLS.g:362:1: ruleUnaryOrPrimaryExpression : ( ( rule__UnaryOrPrimaryExpression__Alternatives ) ) ;
    public final void ruleUnaryOrPrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:366:2: ( ( ( rule__UnaryOrPrimaryExpression__Alternatives ) ) )
            // InternalQLS.g:367:2: ( ( rule__UnaryOrPrimaryExpression__Alternatives ) )
            {
            // InternalQLS.g:367:2: ( ( rule__UnaryOrPrimaryExpression__Alternatives ) )
            // InternalQLS.g:368:3: ( rule__UnaryOrPrimaryExpression__Alternatives )
            {
             before(grammarAccess.getUnaryOrPrimaryExpressionAccess().getAlternatives()); 
            // InternalQLS.g:369:3: ( rule__UnaryOrPrimaryExpression__Alternatives )
            // InternalQLS.g:369:4: rule__UnaryOrPrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UnaryOrPrimaryExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnaryOrPrimaryExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryOrPrimaryExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalQLS.g:378:1: entryRuleUnaryExpression : ruleUnaryExpression EOF ;
    public final void entryRuleUnaryExpression() throws RecognitionException {
        try {
            // InternalQLS.g:379:1: ( ruleUnaryExpression EOF )
            // InternalQLS.g:380:1: ruleUnaryExpression EOF
            {
             before(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleUnaryExpression();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // InternalQLS.g:387:1: ruleUnaryExpression : ( ( rule__UnaryExpression__Group__0 ) ) ;
    public final void ruleUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:391:2: ( ( ( rule__UnaryExpression__Group__0 ) ) )
            // InternalQLS.g:392:2: ( ( rule__UnaryExpression__Group__0 ) )
            {
            // InternalQLS.g:392:2: ( ( rule__UnaryExpression__Group__0 ) )
            // InternalQLS.g:393:3: ( rule__UnaryExpression__Group__0 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getGroup()); 
            // InternalQLS.g:394:3: ( rule__UnaryExpression__Group__0 )
            // InternalQLS.g:394:4: rule__UnaryExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnaryExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalQLS.g:403:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalQLS.g:404:1: ( rulePrimaryExpression EOF )
            // InternalQLS.g:405:1: rulePrimaryExpression EOF
            {
             before(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalQLS.g:412:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:416:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalQLS.g:417:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalQLS.g:417:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalQLS.g:418:3: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // InternalQLS.g:419:3: ( rule__PrimaryExpression__Alternatives )
            // InternalQLS.g:419:4: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleIfExpression"
    // InternalQLS.g:428:1: entryRuleIfExpression : ruleIfExpression EOF ;
    public final void entryRuleIfExpression() throws RecognitionException {
        try {
            // InternalQLS.g:429:1: ( ruleIfExpression EOF )
            // InternalQLS.g:430:1: ruleIfExpression EOF
            {
             before(grammarAccess.getIfExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleIfExpression();

            state._fsp--;

             after(grammarAccess.getIfExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIfExpression"


    // $ANTLR start "ruleIfExpression"
    // InternalQLS.g:437:1: ruleIfExpression : ( ( rule__IfExpression__Group__0 ) ) ;
    public final void ruleIfExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:441:2: ( ( ( rule__IfExpression__Group__0 ) ) )
            // InternalQLS.g:442:2: ( ( rule__IfExpression__Group__0 ) )
            {
            // InternalQLS.g:442:2: ( ( rule__IfExpression__Group__0 ) )
            // InternalQLS.g:443:3: ( rule__IfExpression__Group__0 )
            {
             before(grammarAccess.getIfExpressionAccess().getGroup()); 
            // InternalQLS.g:444:3: ( rule__IfExpression__Group__0 )
            // InternalQLS.g:444:4: rule__IfExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IfExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIfExpression"


    // $ANTLR start "entryRuleOrExpression"
    // InternalQLS.g:453:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // InternalQLS.g:454:1: ( ruleOrExpression EOF )
            // InternalQLS.g:455:1: ruleOrExpression EOF
            {
             before(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalQLS.g:462:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:466:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // InternalQLS.g:467:2: ( ( rule__OrExpression__Group__0 ) )
            {
            // InternalQLS.g:467:2: ( ( rule__OrExpression__Group__0 ) )
            // InternalQLS.g:468:3: ( rule__OrExpression__Group__0 )
            {
             before(grammarAccess.getOrExpressionAccess().getGroup()); 
            // InternalQLS.g:469:3: ( rule__OrExpression__Group__0 )
            // InternalQLS.g:469:4: rule__OrExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalQLS.g:478:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // InternalQLS.g:479:1: ( ruleAndExpression EOF )
            // InternalQLS.g:480:1: ruleAndExpression EOF
            {
             before(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalQLS.g:487:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:491:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // InternalQLS.g:492:2: ( ( rule__AndExpression__Group__0 ) )
            {
            // InternalQLS.g:492:2: ( ( rule__AndExpression__Group__0 ) )
            // InternalQLS.g:493:3: ( rule__AndExpression__Group__0 )
            {
             before(grammarAccess.getAndExpressionAccess().getGroup()); 
            // InternalQLS.g:494:3: ( rule__AndExpression__Group__0 )
            // InternalQLS.g:494:4: rule__AndExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleEqualExpression"
    // InternalQLS.g:503:1: entryRuleEqualExpression : ruleEqualExpression EOF ;
    public final void entryRuleEqualExpression() throws RecognitionException {
        try {
            // InternalQLS.g:504:1: ( ruleEqualExpression EOF )
            // InternalQLS.g:505:1: ruleEqualExpression EOF
            {
             before(grammarAccess.getEqualExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleEqualExpression();

            state._fsp--;

             after(grammarAccess.getEqualExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEqualExpression"


    // $ANTLR start "ruleEqualExpression"
    // InternalQLS.g:512:1: ruleEqualExpression : ( ( rule__EqualExpression__Group__0 ) ) ;
    public final void ruleEqualExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:516:2: ( ( ( rule__EqualExpression__Group__0 ) ) )
            // InternalQLS.g:517:2: ( ( rule__EqualExpression__Group__0 ) )
            {
            // InternalQLS.g:517:2: ( ( rule__EqualExpression__Group__0 ) )
            // InternalQLS.g:518:3: ( rule__EqualExpression__Group__0 )
            {
             before(grammarAccess.getEqualExpressionAccess().getGroup()); 
            // InternalQLS.g:519:3: ( rule__EqualExpression__Group__0 )
            // InternalQLS.g:519:4: rule__EqualExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EqualExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEqualExpression"


    // $ANTLR start "entryRuleComparisionExpression"
    // InternalQLS.g:528:1: entryRuleComparisionExpression : ruleComparisionExpression EOF ;
    public final void entryRuleComparisionExpression() throws RecognitionException {
        try {
            // InternalQLS.g:529:1: ( ruleComparisionExpression EOF )
            // InternalQLS.g:530:1: ruleComparisionExpression EOF
            {
             before(grammarAccess.getComparisionExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleComparisionExpression();

            state._fsp--;

             after(grammarAccess.getComparisionExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparisionExpression"


    // $ANTLR start "ruleComparisionExpression"
    // InternalQLS.g:537:1: ruleComparisionExpression : ( ( rule__ComparisionExpression__Group__0 ) ) ;
    public final void ruleComparisionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:541:2: ( ( ( rule__ComparisionExpression__Group__0 ) ) )
            // InternalQLS.g:542:2: ( ( rule__ComparisionExpression__Group__0 ) )
            {
            // InternalQLS.g:542:2: ( ( rule__ComparisionExpression__Group__0 ) )
            // InternalQLS.g:543:3: ( rule__ComparisionExpression__Group__0 )
            {
             before(grammarAccess.getComparisionExpressionAccess().getGroup()); 
            // InternalQLS.g:544:3: ( rule__ComparisionExpression__Group__0 )
            // InternalQLS.g:544:4: rule__ComparisionExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComparisionExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisionExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparisionExpression"


    // $ANTLR start "entryRuleAdditionExpression"
    // InternalQLS.g:553:1: entryRuleAdditionExpression : ruleAdditionExpression EOF ;
    public final void entryRuleAdditionExpression() throws RecognitionException {
        try {
            // InternalQLS.g:554:1: ( ruleAdditionExpression EOF )
            // InternalQLS.g:555:1: ruleAdditionExpression EOF
            {
             before(grammarAccess.getAdditionExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleAdditionExpression();

            state._fsp--;

             after(grammarAccess.getAdditionExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAdditionExpression"


    // $ANTLR start "ruleAdditionExpression"
    // InternalQLS.g:562:1: ruleAdditionExpression : ( ( rule__AdditionExpression__Group__0 ) ) ;
    public final void ruleAdditionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:566:2: ( ( ( rule__AdditionExpression__Group__0 ) ) )
            // InternalQLS.g:567:2: ( ( rule__AdditionExpression__Group__0 ) )
            {
            // InternalQLS.g:567:2: ( ( rule__AdditionExpression__Group__0 ) )
            // InternalQLS.g:568:3: ( rule__AdditionExpression__Group__0 )
            {
             before(grammarAccess.getAdditionExpressionAccess().getGroup()); 
            // InternalQLS.g:569:3: ( rule__AdditionExpression__Group__0 )
            // InternalQLS.g:569:4: rule__AdditionExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AdditionExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdditionExpression"


    // $ANTLR start "entryRuleMultiplicationExpression"
    // InternalQLS.g:578:1: entryRuleMultiplicationExpression : ruleMultiplicationExpression EOF ;
    public final void entryRuleMultiplicationExpression() throws RecognitionException {
        try {
            // InternalQLS.g:579:1: ( ruleMultiplicationExpression EOF )
            // InternalQLS.g:580:1: ruleMultiplicationExpression EOF
            {
             before(grammarAccess.getMultiplicationExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplicationExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplicationExpression"


    // $ANTLR start "ruleMultiplicationExpression"
    // InternalQLS.g:587:1: ruleMultiplicationExpression : ( ( rule__MultiplicationExpression__Group__0 ) ) ;
    public final void ruleMultiplicationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:591:2: ( ( ( rule__MultiplicationExpression__Group__0 ) ) )
            // InternalQLS.g:592:2: ( ( rule__MultiplicationExpression__Group__0 ) )
            {
            // InternalQLS.g:592:2: ( ( rule__MultiplicationExpression__Group__0 ) )
            // InternalQLS.g:593:3: ( rule__MultiplicationExpression__Group__0 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getGroup()); 
            // InternalQLS.g:594:3: ( rule__MultiplicationExpression__Group__0 )
            // InternalQLS.g:594:4: rule__MultiplicationExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicationExpression"


    // $ANTLR start "entryRuleCall"
    // InternalQLS.g:603:1: entryRuleCall : ruleCall EOF ;
    public final void entryRuleCall() throws RecognitionException {
        try {
            // InternalQLS.g:604:1: ( ruleCall EOF )
            // InternalQLS.g:605:1: ruleCall EOF
            {
             before(grammarAccess.getCallRule()); 
            pushFollow(FOLLOW_1);
            ruleCall();

            state._fsp--;

             after(grammarAccess.getCallRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCall"


    // $ANTLR start "ruleCall"
    // InternalQLS.g:612:1: ruleCall : ( ( rule__Call__Alternatives ) ) ;
    public final void ruleCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:616:2: ( ( ( rule__Call__Alternatives ) ) )
            // InternalQLS.g:617:2: ( ( rule__Call__Alternatives ) )
            {
            // InternalQLS.g:617:2: ( ( rule__Call__Alternatives ) )
            // InternalQLS.g:618:3: ( rule__Call__Alternatives )
            {
             before(grammarAccess.getCallAccess().getAlternatives()); 
            // InternalQLS.g:619:3: ( rule__Call__Alternatives )
            // InternalQLS.g:619:4: rule__Call__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Call__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCallAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCall"


    // $ANTLR start "entryRuleValue"
    // InternalQLS.g:628:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalQLS.g:629:1: ( ruleValue EOF )
            // InternalQLS.g:630:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalQLS.g:637:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:641:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalQLS.g:642:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalQLS.g:642:2: ( ( rule__Value__Alternatives ) )
            // InternalQLS.g:643:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalQLS.g:644:3: ( rule__Value__Alternatives )
            // InternalQLS.g:644:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleForm"
    // InternalQLS.g:653:1: entryRuleForm : ruleForm EOF ;
    public final void entryRuleForm() throws RecognitionException {
        try {
            // InternalQLS.g:654:1: ( ruleForm EOF )
            // InternalQLS.g:655:1: ruleForm EOF
            {
             before(grammarAccess.getFormRule()); 
            pushFollow(FOLLOW_1);
            ruleForm();

            state._fsp--;

             after(grammarAccess.getFormRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForm"


    // $ANTLR start "ruleForm"
    // InternalQLS.g:662:1: ruleForm : ( ( rule__Form__Group__0 ) ) ;
    public final void ruleForm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:666:2: ( ( ( rule__Form__Group__0 ) ) )
            // InternalQLS.g:667:2: ( ( rule__Form__Group__0 ) )
            {
            // InternalQLS.g:667:2: ( ( rule__Form__Group__0 ) )
            // InternalQLS.g:668:3: ( rule__Form__Group__0 )
            {
             before(grammarAccess.getFormAccess().getGroup()); 
            // InternalQLS.g:669:3: ( rule__Form__Group__0 )
            // InternalQLS.g:669:4: rule__Form__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Form__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForm"


    // $ANTLR start "entryRuleDefinitionGroup"
    // InternalQLS.g:678:1: entryRuleDefinitionGroup : ruleDefinitionGroup EOF ;
    public final void entryRuleDefinitionGroup() throws RecognitionException {
        try {
            // InternalQLS.g:679:1: ( ruleDefinitionGroup EOF )
            // InternalQLS.g:680:1: ruleDefinitionGroup EOF
            {
             before(grammarAccess.getDefinitionGroupRule()); 
            pushFollow(FOLLOW_1);
            ruleDefinitionGroup();

            state._fsp--;

             after(grammarAccess.getDefinitionGroupRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefinitionGroup"


    // $ANTLR start "ruleDefinitionGroup"
    // InternalQLS.g:687:1: ruleDefinitionGroup : ( ( rule__DefinitionGroup__Group__0 ) ) ;
    public final void ruleDefinitionGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:691:2: ( ( ( rule__DefinitionGroup__Group__0 ) ) )
            // InternalQLS.g:692:2: ( ( rule__DefinitionGroup__Group__0 ) )
            {
            // InternalQLS.g:692:2: ( ( rule__DefinitionGroup__Group__0 ) )
            // InternalQLS.g:693:3: ( rule__DefinitionGroup__Group__0 )
            {
             before(grammarAccess.getDefinitionGroupAccess().getGroup()); 
            // InternalQLS.g:694:3: ( rule__DefinitionGroup__Group__0 )
            // InternalQLS.g:694:4: rule__DefinitionGroup__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefinitionGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefinitionGroup"


    // $ANTLR start "entryRuleEBoolean"
    // InternalQLS.g:703:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalQLS.g:704:1: ( ruleEBoolean EOF )
            // InternalQLS.g:705:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalQLS.g:712:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:716:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalQLS.g:717:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalQLS.g:717:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalQLS.g:718:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalQLS.g:719:3: ( rule__EBoolean__Alternatives )
            // InternalQLS.g:719:4: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEDate"
    // InternalQLS.g:728:1: entryRuleEDate : ruleEDate EOF ;
    public final void entryRuleEDate() throws RecognitionException {
        try {
            // InternalQLS.g:729:1: ( ruleEDate EOF )
            // InternalQLS.g:730:1: ruleEDate EOF
            {
             before(grammarAccess.getEDateRule()); 
            pushFollow(FOLLOW_1);
            ruleEDate();

            state._fsp--;

             after(grammarAccess.getEDateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDate"


    // $ANTLR start "ruleEDate"
    // InternalQLS.g:737:1: ruleEDate : ( 'EDate' ) ;
    public final void ruleEDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:741:2: ( ( 'EDate' ) )
            // InternalQLS.g:742:2: ( 'EDate' )
            {
            // InternalQLS.g:742:2: ( 'EDate' )
            // InternalQLS.g:743:3: 'EDate'
            {
             before(grammarAccess.getEDateAccess().getEDateKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getEDateAccess().getEDateKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDate"


    // $ANTLR start "entryRuleEString"
    // InternalQLS.g:753:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalQLS.g:754:1: ( ruleEString EOF )
            // InternalQLS.g:755:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalQLS.g:762:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:766:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalQLS.g:767:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalQLS.g:767:2: ( ( rule__EString__Alternatives ) )
            // InternalQLS.g:768:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalQLS.g:769:3: ( rule__EString__Alternatives )
            // InternalQLS.g:769:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleQuestionGroup"
    // InternalQLS.g:778:1: entryRuleQuestionGroup : ruleQuestionGroup EOF ;
    public final void entryRuleQuestionGroup() throws RecognitionException {
        try {
            // InternalQLS.g:779:1: ( ruleQuestionGroup EOF )
            // InternalQLS.g:780:1: ruleQuestionGroup EOF
            {
             before(grammarAccess.getQuestionGroupRule()); 
            pushFollow(FOLLOW_1);
            ruleQuestionGroup();

            state._fsp--;

             after(grammarAccess.getQuestionGroupRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestionGroup"


    // $ANTLR start "ruleQuestionGroup"
    // InternalQLS.g:787:1: ruleQuestionGroup : ( ( rule__QuestionGroup__Group__0 ) ) ;
    public final void ruleQuestionGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:791:2: ( ( ( rule__QuestionGroup__Group__0 ) ) )
            // InternalQLS.g:792:2: ( ( rule__QuestionGroup__Group__0 ) )
            {
            // InternalQLS.g:792:2: ( ( rule__QuestionGroup__Group__0 ) )
            // InternalQLS.g:793:3: ( rule__QuestionGroup__Group__0 )
            {
             before(grammarAccess.getQuestionGroupAccess().getGroup()); 
            // InternalQLS.g:794:3: ( rule__QuestionGroup__Group__0 )
            // InternalQLS.g:794:4: rule__QuestionGroup__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestionGroup"


    // $ANTLR start "entryRuleQuestion"
    // InternalQLS.g:803:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // InternalQLS.g:804:1: ( ruleQuestion EOF )
            // InternalQLS.g:805:1: ruleQuestion EOF
            {
             before(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_1);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // InternalQLS.g:812:1: ruleQuestion : ( ( rule__Question__QuestionDefinitionAssignment ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:816:2: ( ( ( rule__Question__QuestionDefinitionAssignment ) ) )
            // InternalQLS.g:817:2: ( ( rule__Question__QuestionDefinitionAssignment ) )
            {
            // InternalQLS.g:817:2: ( ( rule__Question__QuestionDefinitionAssignment ) )
            // InternalQLS.g:818:3: ( rule__Question__QuestionDefinitionAssignment )
            {
             before(grammarAccess.getQuestionAccess().getQuestionDefinitionAssignment()); 
            // InternalQLS.g:819:3: ( rule__Question__QuestionDefinitionAssignment )
            // InternalQLS.g:819:4: rule__Question__QuestionDefinitionAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Question__QuestionDefinitionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getQuestionDefinitionAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleValueType_Impl"
    // InternalQLS.g:828:1: entryRuleValueType_Impl : ruleValueType_Impl EOF ;
    public final void entryRuleValueType_Impl() throws RecognitionException {
        try {
            // InternalQLS.g:829:1: ( ruleValueType_Impl EOF )
            // InternalQLS.g:830:1: ruleValueType_Impl EOF
            {
             before(grammarAccess.getValueType_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleValueType_Impl();

            state._fsp--;

             after(grammarAccess.getValueType_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValueType_Impl"


    // $ANTLR start "ruleValueType_Impl"
    // InternalQLS.g:837:1: ruleValueType_Impl : ( ( rule__ValueType_Impl__Group__0 ) ) ;
    public final void ruleValueType_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:841:2: ( ( ( rule__ValueType_Impl__Group__0 ) ) )
            // InternalQLS.g:842:2: ( ( rule__ValueType_Impl__Group__0 ) )
            {
            // InternalQLS.g:842:2: ( ( rule__ValueType_Impl__Group__0 ) )
            // InternalQLS.g:843:3: ( rule__ValueType_Impl__Group__0 )
            {
             before(grammarAccess.getValueType_ImplAccess().getGroup()); 
            // InternalQLS.g:844:3: ( rule__ValueType_Impl__Group__0 )
            // InternalQLS.g:844:4: rule__ValueType_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ValueType_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValueType_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValueType_Impl"


    // $ANTLR start "entryRuleConstantCall"
    // InternalQLS.g:853:1: entryRuleConstantCall : ruleConstantCall EOF ;
    public final void entryRuleConstantCall() throws RecognitionException {
        try {
            // InternalQLS.g:854:1: ( ruleConstantCall EOF )
            // InternalQLS.g:855:1: ruleConstantCall EOF
            {
             before(grammarAccess.getConstantCallRule()); 
            pushFollow(FOLLOW_1);
            ruleConstantCall();

            state._fsp--;

             after(grammarAccess.getConstantCallRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstantCall"


    // $ANTLR start "ruleConstantCall"
    // InternalQLS.g:862:1: ruleConstantCall : ( ( rule__ConstantCall__Group__0 ) ) ;
    public final void ruleConstantCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:866:2: ( ( ( rule__ConstantCall__Group__0 ) ) )
            // InternalQLS.g:867:2: ( ( rule__ConstantCall__Group__0 ) )
            {
            // InternalQLS.g:867:2: ( ( rule__ConstantCall__Group__0 ) )
            // InternalQLS.g:868:3: ( rule__ConstantCall__Group__0 )
            {
             before(grammarAccess.getConstantCallAccess().getGroup()); 
            // InternalQLS.g:869:3: ( rule__ConstantCall__Group__0 )
            // InternalQLS.g:869:4: rule__ConstantCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConstantCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstantCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstantCall"


    // $ANTLR start "entryRuleQuestionCall"
    // InternalQLS.g:878:1: entryRuleQuestionCall : ruleQuestionCall EOF ;
    public final void entryRuleQuestionCall() throws RecognitionException {
        try {
            // InternalQLS.g:879:1: ( ruleQuestionCall EOF )
            // InternalQLS.g:880:1: ruleQuestionCall EOF
            {
             before(grammarAccess.getQuestionCallRule()); 
            pushFollow(FOLLOW_1);
            ruleQuestionCall();

            state._fsp--;

             after(grammarAccess.getQuestionCallRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestionCall"


    // $ANTLR start "ruleQuestionCall"
    // InternalQLS.g:887:1: ruleQuestionCall : ( ( rule__QuestionCall__Group__0 ) ) ;
    public final void ruleQuestionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:891:2: ( ( ( rule__QuestionCall__Group__0 ) ) )
            // InternalQLS.g:892:2: ( ( rule__QuestionCall__Group__0 ) )
            {
            // InternalQLS.g:892:2: ( ( rule__QuestionCall__Group__0 ) )
            // InternalQLS.g:893:3: ( rule__QuestionCall__Group__0 )
            {
             before(grammarAccess.getQuestionCallAccess().getGroup()); 
            // InternalQLS.g:894:3: ( rule__QuestionCall__Group__0 )
            // InternalQLS.g:894:4: rule__QuestionCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QuestionCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestionCall"


    // $ANTLR start "entryRuleBooleanValueType"
    // InternalQLS.g:903:1: entryRuleBooleanValueType : ruleBooleanValueType EOF ;
    public final void entryRuleBooleanValueType() throws RecognitionException {
        try {
            // InternalQLS.g:904:1: ( ruleBooleanValueType EOF )
            // InternalQLS.g:905:1: ruleBooleanValueType EOF
            {
             before(grammarAccess.getBooleanValueTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanValueType();

            state._fsp--;

             after(grammarAccess.getBooleanValueTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanValueType"


    // $ANTLR start "ruleBooleanValueType"
    // InternalQLS.g:912:1: ruleBooleanValueType : ( ( rule__BooleanValueType__Group__0 ) ) ;
    public final void ruleBooleanValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:916:2: ( ( ( rule__BooleanValueType__Group__0 ) ) )
            // InternalQLS.g:917:2: ( ( rule__BooleanValueType__Group__0 ) )
            {
            // InternalQLS.g:917:2: ( ( rule__BooleanValueType__Group__0 ) )
            // InternalQLS.g:918:3: ( rule__BooleanValueType__Group__0 )
            {
             before(grammarAccess.getBooleanValueTypeAccess().getGroup()); 
            // InternalQLS.g:919:3: ( rule__BooleanValueType__Group__0 )
            // InternalQLS.g:919:4: rule__BooleanValueType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValueType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanValueType"


    // $ANTLR start "entryRuleIntegerValueType"
    // InternalQLS.g:928:1: entryRuleIntegerValueType : ruleIntegerValueType EOF ;
    public final void entryRuleIntegerValueType() throws RecognitionException {
        try {
            // InternalQLS.g:929:1: ( ruleIntegerValueType EOF )
            // InternalQLS.g:930:1: ruleIntegerValueType EOF
            {
             before(grammarAccess.getIntegerValueTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleIntegerValueType();

            state._fsp--;

             after(grammarAccess.getIntegerValueTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerValueType"


    // $ANTLR start "ruleIntegerValueType"
    // InternalQLS.g:937:1: ruleIntegerValueType : ( ( rule__IntegerValueType__Group__0 ) ) ;
    public final void ruleIntegerValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:941:2: ( ( ( rule__IntegerValueType__Group__0 ) ) )
            // InternalQLS.g:942:2: ( ( rule__IntegerValueType__Group__0 ) )
            {
            // InternalQLS.g:942:2: ( ( rule__IntegerValueType__Group__0 ) )
            // InternalQLS.g:943:3: ( rule__IntegerValueType__Group__0 )
            {
             before(grammarAccess.getIntegerValueTypeAccess().getGroup()); 
            // InternalQLS.g:944:3: ( rule__IntegerValueType__Group__0 )
            // InternalQLS.g:944:4: rule__IntegerValueType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerValueTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerValueType"


    // $ANTLR start "entryRuleDecimalValueType"
    // InternalQLS.g:953:1: entryRuleDecimalValueType : ruleDecimalValueType EOF ;
    public final void entryRuleDecimalValueType() throws RecognitionException {
        try {
            // InternalQLS.g:954:1: ( ruleDecimalValueType EOF )
            // InternalQLS.g:955:1: ruleDecimalValueType EOF
            {
             before(grammarAccess.getDecimalValueTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDecimalValueType();

            state._fsp--;

             after(grammarAccess.getDecimalValueTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDecimalValueType"


    // $ANTLR start "ruleDecimalValueType"
    // InternalQLS.g:962:1: ruleDecimalValueType : ( ( rule__DecimalValueType__Group__0 ) ) ;
    public final void ruleDecimalValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:966:2: ( ( ( rule__DecimalValueType__Group__0 ) ) )
            // InternalQLS.g:967:2: ( ( rule__DecimalValueType__Group__0 ) )
            {
            // InternalQLS.g:967:2: ( ( rule__DecimalValueType__Group__0 ) )
            // InternalQLS.g:968:3: ( rule__DecimalValueType__Group__0 )
            {
             before(grammarAccess.getDecimalValueTypeAccess().getGroup()); 
            // InternalQLS.g:969:3: ( rule__DecimalValueType__Group__0 )
            // InternalQLS.g:969:4: rule__DecimalValueType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DecimalValueType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDecimalValueTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDecimalValueType"


    // $ANTLR start "entryRuleDateValueType"
    // InternalQLS.g:978:1: entryRuleDateValueType : ruleDateValueType EOF ;
    public final void entryRuleDateValueType() throws RecognitionException {
        try {
            // InternalQLS.g:979:1: ( ruleDateValueType EOF )
            // InternalQLS.g:980:1: ruleDateValueType EOF
            {
             before(grammarAccess.getDateValueTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDateValueType();

            state._fsp--;

             after(grammarAccess.getDateValueTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDateValueType"


    // $ANTLR start "ruleDateValueType"
    // InternalQLS.g:987:1: ruleDateValueType : ( ( rule__DateValueType__Group__0 ) ) ;
    public final void ruleDateValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:991:2: ( ( ( rule__DateValueType__Group__0 ) ) )
            // InternalQLS.g:992:2: ( ( rule__DateValueType__Group__0 ) )
            {
            // InternalQLS.g:992:2: ( ( rule__DateValueType__Group__0 ) )
            // InternalQLS.g:993:3: ( rule__DateValueType__Group__0 )
            {
             before(grammarAccess.getDateValueTypeAccess().getGroup()); 
            // InternalQLS.g:994:3: ( rule__DateValueType__Group__0 )
            // InternalQLS.g:994:4: rule__DateValueType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DateValueType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDateValueTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDateValueType"


    // $ANTLR start "entryRuleEnumerationValueType"
    // InternalQLS.g:1003:1: entryRuleEnumerationValueType : ruleEnumerationValueType EOF ;
    public final void entryRuleEnumerationValueType() throws RecognitionException {
        try {
            // InternalQLS.g:1004:1: ( ruleEnumerationValueType EOF )
            // InternalQLS.g:1005:1: ruleEnumerationValueType EOF
            {
             before(grammarAccess.getEnumerationValueTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumerationValueType();

            state._fsp--;

             after(grammarAccess.getEnumerationValueTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumerationValueType"


    // $ANTLR start "ruleEnumerationValueType"
    // InternalQLS.g:1012:1: ruleEnumerationValueType : ( ( rule__EnumerationValueType__Group__0 ) ) ;
    public final void ruleEnumerationValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1016:2: ( ( ( rule__EnumerationValueType__Group__0 ) ) )
            // InternalQLS.g:1017:2: ( ( rule__EnumerationValueType__Group__0 ) )
            {
            // InternalQLS.g:1017:2: ( ( rule__EnumerationValueType__Group__0 ) )
            // InternalQLS.g:1018:3: ( rule__EnumerationValueType__Group__0 )
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getGroup()); 
            // InternalQLS.g:1019:3: ( rule__EnumerationValueType__Group__0 )
            // InternalQLS.g:1019:4: rule__EnumerationValueType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationValueTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumerationValueType"


    // $ANTLR start "entryRuleStringValueType"
    // InternalQLS.g:1028:1: entryRuleStringValueType : ruleStringValueType EOF ;
    public final void entryRuleStringValueType() throws RecognitionException {
        try {
            // InternalQLS.g:1029:1: ( ruleStringValueType EOF )
            // InternalQLS.g:1030:1: ruleStringValueType EOF
            {
             before(grammarAccess.getStringValueTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleStringValueType();

            state._fsp--;

             after(grammarAccess.getStringValueTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringValueType"


    // $ANTLR start "ruleStringValueType"
    // InternalQLS.g:1037:1: ruleStringValueType : ( ( rule__StringValueType__Group__0 ) ) ;
    public final void ruleStringValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1041:2: ( ( ( rule__StringValueType__Group__0 ) ) )
            // InternalQLS.g:1042:2: ( ( rule__StringValueType__Group__0 ) )
            {
            // InternalQLS.g:1042:2: ( ( rule__StringValueType__Group__0 ) )
            // InternalQLS.g:1043:3: ( rule__StringValueType__Group__0 )
            {
             before(grammarAccess.getStringValueTypeAccess().getGroup()); 
            // InternalQLS.g:1044:3: ( rule__StringValueType__Group__0 )
            // InternalQLS.g:1044:4: rule__StringValueType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringValueType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringValueTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringValueType"


    // $ANTLR start "entryRuleEnumerationLiteral"
    // InternalQLS.g:1053:1: entryRuleEnumerationLiteral : ruleEnumerationLiteral EOF ;
    public final void entryRuleEnumerationLiteral() throws RecognitionException {
        try {
            // InternalQLS.g:1054:1: ( ruleEnumerationLiteral EOF )
            // InternalQLS.g:1055:1: ruleEnumerationLiteral EOF
            {
             before(grammarAccess.getEnumerationLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumerationLiteral();

            state._fsp--;

             after(grammarAccess.getEnumerationLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumerationLiteral"


    // $ANTLR start "ruleEnumerationLiteral"
    // InternalQLS.g:1062:1: ruleEnumerationLiteral : ( ( rule__EnumerationLiteral__Group__0 ) ) ;
    public final void ruleEnumerationLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1066:2: ( ( ( rule__EnumerationLiteral__Group__0 ) ) )
            // InternalQLS.g:1067:2: ( ( rule__EnumerationLiteral__Group__0 ) )
            {
            // InternalQLS.g:1067:2: ( ( rule__EnumerationLiteral__Group__0 ) )
            // InternalQLS.g:1068:3: ( rule__EnumerationLiteral__Group__0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getGroup()); 
            // InternalQLS.g:1069:3: ( rule__EnumerationLiteral__Group__0 )
            // InternalQLS.g:1069:4: rule__EnumerationLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumerationLiteral"


    // $ANTLR start "entryRuleIntegerValue"
    // InternalQLS.g:1078:1: entryRuleIntegerValue : ruleIntegerValue EOF ;
    public final void entryRuleIntegerValue() throws RecognitionException {
        try {
            // InternalQLS.g:1079:1: ( ruleIntegerValue EOF )
            // InternalQLS.g:1080:1: ruleIntegerValue EOF
            {
             before(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_1);
            ruleIntegerValue();

            state._fsp--;

             after(grammarAccess.getIntegerValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerValue"


    // $ANTLR start "ruleIntegerValue"
    // InternalQLS.g:1087:1: ruleIntegerValue : ( ( rule__IntegerValue__Group__0 ) ) ;
    public final void ruleIntegerValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1091:2: ( ( ( rule__IntegerValue__Group__0 ) ) )
            // InternalQLS.g:1092:2: ( ( rule__IntegerValue__Group__0 ) )
            {
            // InternalQLS.g:1092:2: ( ( rule__IntegerValue__Group__0 ) )
            // InternalQLS.g:1093:3: ( rule__IntegerValue__Group__0 )
            {
             before(grammarAccess.getIntegerValueAccess().getGroup()); 
            // InternalQLS.g:1094:3: ( rule__IntegerValue__Group__0 )
            // InternalQLS.g:1094:4: rule__IntegerValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalQLS.g:1103:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalQLS.g:1104:1: ( ruleStringValue EOF )
            // InternalQLS.g:1105:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalQLS.g:1112:1: ruleStringValue : ( ( rule__StringValue__Group__0 ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1116:2: ( ( ( rule__StringValue__Group__0 ) ) )
            // InternalQLS.g:1117:2: ( ( rule__StringValue__Group__0 ) )
            {
            // InternalQLS.g:1117:2: ( ( rule__StringValue__Group__0 ) )
            // InternalQLS.g:1118:3: ( rule__StringValue__Group__0 )
            {
             before(grammarAccess.getStringValueAccess().getGroup()); 
            // InternalQLS.g:1119:3: ( rule__StringValue__Group__0 )
            // InternalQLS.g:1119:4: rule__StringValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalQLS.g:1128:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalQLS.g:1129:1: ( ruleBooleanValue EOF )
            // InternalQLS.g:1130:1: ruleBooleanValue EOF
            {
             before(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanValue();

            state._fsp--;

             after(grammarAccess.getBooleanValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalQLS.g:1137:1: ruleBooleanValue : ( ( rule__BooleanValue__Group__0 ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1141:2: ( ( ( rule__BooleanValue__Group__0 ) ) )
            // InternalQLS.g:1142:2: ( ( rule__BooleanValue__Group__0 ) )
            {
            // InternalQLS.g:1142:2: ( ( rule__BooleanValue__Group__0 ) )
            // InternalQLS.g:1143:3: ( rule__BooleanValue__Group__0 )
            {
             before(grammarAccess.getBooleanValueAccess().getGroup()); 
            // InternalQLS.g:1144:3: ( rule__BooleanValue__Group__0 )
            // InternalQLS.g:1144:4: rule__BooleanValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleEnumerationCall"
    // InternalQLS.g:1153:1: entryRuleEnumerationCall : ruleEnumerationCall EOF ;
    public final void entryRuleEnumerationCall() throws RecognitionException {
        try {
            // InternalQLS.g:1154:1: ( ruleEnumerationCall EOF )
            // InternalQLS.g:1155:1: ruleEnumerationCall EOF
            {
             before(grammarAccess.getEnumerationCallRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumerationCall();

            state._fsp--;

             after(grammarAccess.getEnumerationCallRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumerationCall"


    // $ANTLR start "ruleEnumerationCall"
    // InternalQLS.g:1162:1: ruleEnumerationCall : ( ( rule__EnumerationCall__Group__0 ) ) ;
    public final void ruleEnumerationCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1166:2: ( ( ( rule__EnumerationCall__Group__0 ) ) )
            // InternalQLS.g:1167:2: ( ( rule__EnumerationCall__Group__0 ) )
            {
            // InternalQLS.g:1167:2: ( ( rule__EnumerationCall__Group__0 ) )
            // InternalQLS.g:1168:3: ( rule__EnumerationCall__Group__0 )
            {
             before(grammarAccess.getEnumerationCallAccess().getGroup()); 
            // InternalQLS.g:1169:3: ( rule__EnumerationCall__Group__0 )
            // InternalQLS.g:1169:4: rule__EnumerationCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumerationCall"


    // $ANTLR start "entryRuleDateValue"
    // InternalQLS.g:1178:1: entryRuleDateValue : ruleDateValue EOF ;
    public final void entryRuleDateValue() throws RecognitionException {
        try {
            // InternalQLS.g:1179:1: ( ruleDateValue EOF )
            // InternalQLS.g:1180:1: ruleDateValue EOF
            {
             before(grammarAccess.getDateValueRule()); 
            pushFollow(FOLLOW_1);
            ruleDateValue();

            state._fsp--;

             after(grammarAccess.getDateValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDateValue"


    // $ANTLR start "ruleDateValue"
    // InternalQLS.g:1187:1: ruleDateValue : ( ( rule__DateValue__Group__0 ) ) ;
    public final void ruleDateValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1191:2: ( ( ( rule__DateValue__Group__0 ) ) )
            // InternalQLS.g:1192:2: ( ( rule__DateValue__Group__0 ) )
            {
            // InternalQLS.g:1192:2: ( ( rule__DateValue__Group__0 ) )
            // InternalQLS.g:1193:3: ( rule__DateValue__Group__0 )
            {
             before(grammarAccess.getDateValueAccess().getGroup()); 
            // InternalQLS.g:1194:3: ( rule__DateValue__Group__0 )
            // InternalQLS.g:1194:4: rule__DateValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DateValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDateValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDateValue"


    // $ANTLR start "entryRuleDecimalValue"
    // InternalQLS.g:1203:1: entryRuleDecimalValue : ruleDecimalValue EOF ;
    public final void entryRuleDecimalValue() throws RecognitionException {
        try {
            // InternalQLS.g:1204:1: ( ruleDecimalValue EOF )
            // InternalQLS.g:1205:1: ruleDecimalValue EOF
            {
             before(grammarAccess.getDecimalValueRule()); 
            pushFollow(FOLLOW_1);
            ruleDecimalValue();

            state._fsp--;

             after(grammarAccess.getDecimalValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDecimalValue"


    // $ANTLR start "ruleDecimalValue"
    // InternalQLS.g:1212:1: ruleDecimalValue : ( ( rule__DecimalValue__Group__0 ) ) ;
    public final void ruleDecimalValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1216:2: ( ( ( rule__DecimalValue__Group__0 ) ) )
            // InternalQLS.g:1217:2: ( ( rule__DecimalValue__Group__0 ) )
            {
            // InternalQLS.g:1217:2: ( ( rule__DecimalValue__Group__0 ) )
            // InternalQLS.g:1218:3: ( rule__DecimalValue__Group__0 )
            {
             before(grammarAccess.getDecimalValueAccess().getGroup()); 
            // InternalQLS.g:1219:3: ( rule__DecimalValue__Group__0 )
            // InternalQLS.g:1219:4: rule__DecimalValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DecimalValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDecimalValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDecimalValue"


    // $ANTLR start "entryRuleEInt"
    // InternalQLS.g:1228:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalQLS.g:1229:1: ( ruleEInt EOF )
            // InternalQLS.g:1230:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalQLS.g:1237:1: ruleEInt : ( RULE_INT ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1241:2: ( ( RULE_INT ) )
            // InternalQLS.g:1242:2: ( RULE_INT )
            {
            // InternalQLS.g:1242:2: ( RULE_INT )
            // InternalQLS.g:1243:3: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEDouble"
    // InternalQLS.g:1253:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalQLS.g:1254:1: ( ruleEDouble EOF )
            // InternalQLS.g:1255:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalQLS.g:1262:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1266:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalQLS.g:1267:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalQLS.g:1267:2: ( ( rule__EDouble__Group__0 ) )
            // InternalQLS.g:1268:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalQLS.g:1269:3: ( rule__EDouble__Group__0 )
            // InternalQLS.g:1269:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleQuestionDefinition"
    // InternalQLS.g:1278:1: entryRuleQuestionDefinition : ruleQuestionDefinition EOF ;
    public final void entryRuleQuestionDefinition() throws RecognitionException {
        try {
            // InternalQLS.g:1279:1: ( ruleQuestionDefinition EOF )
            // InternalQLS.g:1280:1: ruleQuestionDefinition EOF
            {
             before(grammarAccess.getQuestionDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleQuestionDefinition();

            state._fsp--;

             after(grammarAccess.getQuestionDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestionDefinition"


    // $ANTLR start "ruleQuestionDefinition"
    // InternalQLS.g:1287:1: ruleQuestionDefinition : ( ( rule__QuestionDefinition__Group__0 ) ) ;
    public final void ruleQuestionDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1291:2: ( ( ( rule__QuestionDefinition__Group__0 ) ) )
            // InternalQLS.g:1292:2: ( ( rule__QuestionDefinition__Group__0 ) )
            {
            // InternalQLS.g:1292:2: ( ( rule__QuestionDefinition__Group__0 ) )
            // InternalQLS.g:1293:3: ( rule__QuestionDefinition__Group__0 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getGroup()); 
            // InternalQLS.g:1294:3: ( rule__QuestionDefinition__Group__0 )
            // InternalQLS.g:1294:4: rule__QuestionDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestionDefinition"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalQLS.g:1303:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalQLS.g:1304:1: ( ruleQualifiedName EOF )
            // InternalQLS.g:1305:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalQLS.g:1312:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1316:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalQLS.g:1317:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalQLS.g:1317:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalQLS.g:1318:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalQLS.g:1319:3: ( rule__QualifiedName__Group__0 )
            // InternalQLS.g:1319:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleBooleanStyleKind"
    // InternalQLS.g:1328:1: ruleBooleanStyleKind : ( ( rule__BooleanStyleKind__Alternatives ) ) ;
    public final void ruleBooleanStyleKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1332:1: ( ( ( rule__BooleanStyleKind__Alternatives ) ) )
            // InternalQLS.g:1333:2: ( ( rule__BooleanStyleKind__Alternatives ) )
            {
            // InternalQLS.g:1333:2: ( ( rule__BooleanStyleKind__Alternatives ) )
            // InternalQLS.g:1334:3: ( rule__BooleanStyleKind__Alternatives )
            {
             before(grammarAccess.getBooleanStyleKindAccess().getAlternatives()); 
            // InternalQLS.g:1335:3: ( rule__BooleanStyleKind__Alternatives )
            // InternalQLS.g:1335:4: rule__BooleanStyleKind__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BooleanStyleKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanStyleKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanStyleKind"


    // $ANTLR start "ruleBinaryOperatorKind"
    // InternalQLS.g:1344:1: ruleBinaryOperatorKind : ( ( rule__BinaryOperatorKind__Alternatives ) ) ;
    public final void ruleBinaryOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1348:1: ( ( ( rule__BinaryOperatorKind__Alternatives ) ) )
            // InternalQLS.g:1349:2: ( ( rule__BinaryOperatorKind__Alternatives ) )
            {
            // InternalQLS.g:1349:2: ( ( rule__BinaryOperatorKind__Alternatives ) )
            // InternalQLS.g:1350:3: ( rule__BinaryOperatorKind__Alternatives )
            {
             before(grammarAccess.getBinaryOperatorKindAccess().getAlternatives()); 
            // InternalQLS.g:1351:3: ( rule__BinaryOperatorKind__Alternatives )
            // InternalQLS.g:1351:4: rule__BinaryOperatorKind__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BinaryOperatorKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBinaryOperatorKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryOperatorKind"


    // $ANTLR start "ruleUnaryOperatorKind"
    // InternalQLS.g:1360:1: ruleUnaryOperatorKind : ( ( rule__UnaryOperatorKind__Alternatives ) ) ;
    public final void ruleUnaryOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1364:1: ( ( ( rule__UnaryOperatorKind__Alternatives ) ) )
            // InternalQLS.g:1365:2: ( ( rule__UnaryOperatorKind__Alternatives ) )
            {
            // InternalQLS.g:1365:2: ( ( rule__UnaryOperatorKind__Alternatives ) )
            // InternalQLS.g:1366:3: ( rule__UnaryOperatorKind__Alternatives )
            {
             before(grammarAccess.getUnaryOperatorKindAccess().getAlternatives()); 
            // InternalQLS.g:1367:3: ( rule__UnaryOperatorKind__Alternatives )
            // InternalQLS.g:1367:4: rule__UnaryOperatorKind__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UnaryOperatorKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnaryOperatorKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryOperatorKind"


    // $ANTLR start "ruleAdditionOperatorKind"
    // InternalQLS.g:1376:1: ruleAdditionOperatorKind : ( ( rule__AdditionOperatorKind__Alternatives ) ) ;
    public final void ruleAdditionOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1380:1: ( ( ( rule__AdditionOperatorKind__Alternatives ) ) )
            // InternalQLS.g:1381:2: ( ( rule__AdditionOperatorKind__Alternatives ) )
            {
            // InternalQLS.g:1381:2: ( ( rule__AdditionOperatorKind__Alternatives ) )
            // InternalQLS.g:1382:3: ( rule__AdditionOperatorKind__Alternatives )
            {
             before(grammarAccess.getAdditionOperatorKindAccess().getAlternatives()); 
            // InternalQLS.g:1383:3: ( rule__AdditionOperatorKind__Alternatives )
            // InternalQLS.g:1383:4: rule__AdditionOperatorKind__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AdditionOperatorKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAdditionOperatorKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdditionOperatorKind"


    // $ANTLR start "ruleMultiplicationOperatorKind"
    // InternalQLS.g:1392:1: ruleMultiplicationOperatorKind : ( ( rule__MultiplicationOperatorKind__Alternatives ) ) ;
    public final void ruleMultiplicationOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1396:1: ( ( ( rule__MultiplicationOperatorKind__Alternatives ) ) )
            // InternalQLS.g:1397:2: ( ( rule__MultiplicationOperatorKind__Alternatives ) )
            {
            // InternalQLS.g:1397:2: ( ( rule__MultiplicationOperatorKind__Alternatives ) )
            // InternalQLS.g:1398:3: ( rule__MultiplicationOperatorKind__Alternatives )
            {
             before(grammarAccess.getMultiplicationOperatorKindAccess().getAlternatives()); 
            // InternalQLS.g:1399:3: ( rule__MultiplicationOperatorKind__Alternatives )
            // InternalQLS.g:1399:4: rule__MultiplicationOperatorKind__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationOperatorKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationOperatorKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicationOperatorKind"


    // $ANTLR start "ruleEqualOperatorKind"
    // InternalQLS.g:1408:1: ruleEqualOperatorKind : ( ( '=' ) ) ;
    public final void ruleEqualOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1412:1: ( ( ( '=' ) ) )
            // InternalQLS.g:1413:2: ( ( '=' ) )
            {
            // InternalQLS.g:1413:2: ( ( '=' ) )
            // InternalQLS.g:1414:3: ( '=' )
            {
             before(grammarAccess.getEqualOperatorKindAccess().getEQUALEnumLiteralDeclaration()); 
            // InternalQLS.g:1415:3: ( '=' )
            // InternalQLS.g:1415:4: '='
            {
            match(input,12,FOLLOW_2); 

            }

             after(grammarAccess.getEqualOperatorKindAccess().getEQUALEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEqualOperatorKind"


    // $ANTLR start "ruleComparisionOperatorKind"
    // InternalQLS.g:1424:1: ruleComparisionOperatorKind : ( ( rule__ComparisionOperatorKind__Alternatives ) ) ;
    public final void ruleComparisionOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1428:1: ( ( ( rule__ComparisionOperatorKind__Alternatives ) ) )
            // InternalQLS.g:1429:2: ( ( rule__ComparisionOperatorKind__Alternatives ) )
            {
            // InternalQLS.g:1429:2: ( ( rule__ComparisionOperatorKind__Alternatives ) )
            // InternalQLS.g:1430:3: ( rule__ComparisionOperatorKind__Alternatives )
            {
             before(grammarAccess.getComparisionOperatorKindAccess().getAlternatives()); 
            // InternalQLS.g:1431:3: ( rule__ComparisionOperatorKind__Alternatives )
            // InternalQLS.g:1431:4: rule__ComparisionOperatorKind__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ComparisionOperatorKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComparisionOperatorKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparisionOperatorKind"


    // $ANTLR start "ruleAndOperatorKind"
    // InternalQLS.g:1440:1: ruleAndOperatorKind : ( ( 'and' ) ) ;
    public final void ruleAndOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1444:1: ( ( ( 'and' ) ) )
            // InternalQLS.g:1445:2: ( ( 'and' ) )
            {
            // InternalQLS.g:1445:2: ( ( 'and' ) )
            // InternalQLS.g:1446:3: ( 'and' )
            {
             before(grammarAccess.getAndOperatorKindAccess().getANDEnumLiteralDeclaration()); 
            // InternalQLS.g:1447:3: ( 'and' )
            // InternalQLS.g:1447:4: 'and'
            {
            match(input,13,FOLLOW_2); 

            }

             after(grammarAccess.getAndOperatorKindAccess().getANDEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndOperatorKind"


    // $ANTLR start "ruleOrOperatorKind"
    // InternalQLS.g:1456:1: ruleOrOperatorKind : ( ( 'or' ) ) ;
    public final void ruleOrOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1460:1: ( ( ( 'or' ) ) )
            // InternalQLS.g:1461:2: ( ( 'or' ) )
            {
            // InternalQLS.g:1461:2: ( ( 'or' ) )
            // InternalQLS.g:1462:3: ( 'or' )
            {
             before(grammarAccess.getOrOperatorKindAccess().getOREnumLiteralDeclaration()); 
            // InternalQLS.g:1463:3: ( 'or' )
            // InternalQLS.g:1463:4: 'or'
            {
            match(input,14,FOLLOW_2); 

            }

             after(grammarAccess.getOrOperatorKindAccess().getOREnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrOperatorKind"


    // $ANTLR start "rule__TypeStyle__Alternatives"
    // InternalQLS.g:1471:1: rule__TypeStyle__Alternatives : ( ( ruleBooleanTypeStyle ) | ( ruleNumericTypeStyle ) | ( ruleTextTypeStyle ) );
    public final void rule__TypeStyle__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1475:1: ( ( ruleBooleanTypeStyle ) | ( ruleNumericTypeStyle ) | ( ruleTextTypeStyle ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt1=1;
                }
                break;
            case 52:
                {
                alt1=2;
                }
                break;
            case 56:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalQLS.g:1476:2: ( ruleBooleanTypeStyle )
                    {
                    // InternalQLS.g:1476:2: ( ruleBooleanTypeStyle )
                    // InternalQLS.g:1477:3: ruleBooleanTypeStyle
                    {
                     before(grammarAccess.getTypeStyleAccess().getBooleanTypeStyleParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanTypeStyle();

                    state._fsp--;

                     after(grammarAccess.getTypeStyleAccess().getBooleanTypeStyleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:1482:2: ( ruleNumericTypeStyle )
                    {
                    // InternalQLS.g:1482:2: ( ruleNumericTypeStyle )
                    // InternalQLS.g:1483:3: ruleNumericTypeStyle
                    {
                     before(grammarAccess.getTypeStyleAccess().getNumericTypeStyleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNumericTypeStyle();

                    state._fsp--;

                     after(grammarAccess.getTypeStyleAccess().getNumericTypeStyleParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQLS.g:1488:2: ( ruleTextTypeStyle )
                    {
                    // InternalQLS.g:1488:2: ( ruleTextTypeStyle )
                    // InternalQLS.g:1489:3: ruleTextTypeStyle
                    {
                     before(grammarAccess.getTypeStyleAccess().getTextTypeStyleParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTextTypeStyle();

                    state._fsp--;

                     after(grammarAccess.getTypeStyleAccess().getTextTypeStyleParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeStyle__Alternatives"


    // $ANTLR start "rule__NumericTypeStyle__Alternatives"
    // InternalQLS.g:1498:1: rule__NumericTypeStyle__Alternatives : ( ( ruleNumericTypeTextFieldStyle ) | ( ruleNumericTypeSpinnerStyle ) );
    public final void rule__NumericTypeStyle__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1502:1: ( ( ruleNumericTypeTextFieldStyle ) | ( ruleNumericTypeSpinnerStyle ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==52) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==53) ) {
                    alt2=1;
                }
                else if ( (LA2_1==55) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalQLS.g:1503:2: ( ruleNumericTypeTextFieldStyle )
                    {
                    // InternalQLS.g:1503:2: ( ruleNumericTypeTextFieldStyle )
                    // InternalQLS.g:1504:3: ruleNumericTypeTextFieldStyle
                    {
                     before(grammarAccess.getNumericTypeStyleAccess().getNumericTypeTextFieldStyleParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNumericTypeTextFieldStyle();

                    state._fsp--;

                     after(grammarAccess.getNumericTypeStyleAccess().getNumericTypeTextFieldStyleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:1509:2: ( ruleNumericTypeSpinnerStyle )
                    {
                    // InternalQLS.g:1509:2: ( ruleNumericTypeSpinnerStyle )
                    // InternalQLS.g:1510:3: ruleNumericTypeSpinnerStyle
                    {
                     before(grammarAccess.getNumericTypeStyleAccess().getNumericTypeSpinnerStyleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNumericTypeSpinnerStyle();

                    state._fsp--;

                     after(grammarAccess.getNumericTypeStyleAccess().getNumericTypeSpinnerStyleParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericTypeStyle__Alternatives"


    // $ANTLR start "rule__ValueType__Alternatives"
    // InternalQLS.g:1519:1: rule__ValueType__Alternatives : ( ( ruleValueType_Impl ) | ( ruleBooleanValueType ) | ( ruleIntegerValueType ) | ( ruleDecimalValueType ) | ( ruleDateValueType ) | ( ruleEnumerationValueType ) | ( ruleStringValueType ) );
    public final void rule__ValueType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1523:1: ( ( ruleValueType_Impl ) | ( ruleBooleanValueType ) | ( ruleIntegerValueType ) | ( ruleDecimalValueType ) | ( ruleDateValueType ) | ( ruleEnumerationValueType ) | ( ruleStringValueType ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt3=1;
                }
                break;
            case 67:
                {
                alt3=2;
                }
                break;
            case 68:
                {
                alt3=3;
                }
                break;
            case 71:
                {
                alt3=4;
                }
                break;
            case 72:
                {
                alt3=5;
                }
                break;
            case 73:
                {
                alt3=6;
                }
                break;
            case 76:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalQLS.g:1524:2: ( ruleValueType_Impl )
                    {
                    // InternalQLS.g:1524:2: ( ruleValueType_Impl )
                    // InternalQLS.g:1525:3: ruleValueType_Impl
                    {
                     before(grammarAccess.getValueTypeAccess().getValueType_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleValueType_Impl();

                    state._fsp--;

                     after(grammarAccess.getValueTypeAccess().getValueType_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:1530:2: ( ruleBooleanValueType )
                    {
                    // InternalQLS.g:1530:2: ( ruleBooleanValueType )
                    // InternalQLS.g:1531:3: ruleBooleanValueType
                    {
                     before(grammarAccess.getValueTypeAccess().getBooleanValueTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanValueType();

                    state._fsp--;

                     after(grammarAccess.getValueTypeAccess().getBooleanValueTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQLS.g:1536:2: ( ruleIntegerValueType )
                    {
                    // InternalQLS.g:1536:2: ( ruleIntegerValueType )
                    // InternalQLS.g:1537:3: ruleIntegerValueType
                    {
                     before(grammarAccess.getValueTypeAccess().getIntegerValueTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleIntegerValueType();

                    state._fsp--;

                     after(grammarAccess.getValueTypeAccess().getIntegerValueTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQLS.g:1542:2: ( ruleDecimalValueType )
                    {
                    // InternalQLS.g:1542:2: ( ruleDecimalValueType )
                    // InternalQLS.g:1543:3: ruleDecimalValueType
                    {
                     before(grammarAccess.getValueTypeAccess().getDecimalValueTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDecimalValueType();

                    state._fsp--;

                     after(grammarAccess.getValueTypeAccess().getDecimalValueTypeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalQLS.g:1548:2: ( ruleDateValueType )
                    {
                    // InternalQLS.g:1548:2: ( ruleDateValueType )
                    // InternalQLS.g:1549:3: ruleDateValueType
                    {
                     before(grammarAccess.getValueTypeAccess().getDateValueTypeParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleDateValueType();

                    state._fsp--;

                     after(grammarAccess.getValueTypeAccess().getDateValueTypeParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalQLS.g:1554:2: ( ruleEnumerationValueType )
                    {
                    // InternalQLS.g:1554:2: ( ruleEnumerationValueType )
                    // InternalQLS.g:1555:3: ruleEnumerationValueType
                    {
                     before(grammarAccess.getValueTypeAccess().getEnumerationValueTypeParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleEnumerationValueType();

                    state._fsp--;

                     after(grammarAccess.getValueTypeAccess().getEnumerationValueTypeParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalQLS.g:1560:2: ( ruleStringValueType )
                    {
                    // InternalQLS.g:1560:2: ( ruleStringValueType )
                    // InternalQLS.g:1561:3: ruleStringValueType
                    {
                     before(grammarAccess.getValueTypeAccess().getStringValueTypeParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleStringValueType();

                    state._fsp--;

                     after(grammarAccess.getValueTypeAccess().getStringValueTypeParserRuleCall_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType__Alternatives"


    // $ANTLR start "rule__UnaryOrPrimaryExpression__Alternatives"
    // InternalQLS.g:1570:1: rule__UnaryOrPrimaryExpression__Alternatives : ( ( rulePrimaryExpression ) | ( ruleUnaryExpression ) );
    public final void rule__UnaryOrPrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1574:1: ( ( rulePrimaryExpression ) | ( ruleUnaryExpression ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_INT && LA4_0<=RULE_ID)||(LA4_0>=15 && LA4_0<=16)||LA4_0==57||LA4_0==59||LA4_0==79) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=34 && LA4_0<=35)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalQLS.g:1575:2: ( rulePrimaryExpression )
                    {
                    // InternalQLS.g:1575:2: ( rulePrimaryExpression )
                    // InternalQLS.g:1576:3: rulePrimaryExpression
                    {
                     before(grammarAccess.getUnaryOrPrimaryExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePrimaryExpression();

                    state._fsp--;

                     after(grammarAccess.getUnaryOrPrimaryExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:1581:2: ( ruleUnaryExpression )
                    {
                    // InternalQLS.g:1581:2: ( ruleUnaryExpression )
                    // InternalQLS.g:1582:3: ruleUnaryExpression
                    {
                     before(grammarAccess.getUnaryOrPrimaryExpressionAccess().getUnaryExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUnaryExpression();

                    state._fsp--;

                     after(grammarAccess.getUnaryOrPrimaryExpressionAccess().getUnaryExpressionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOrPrimaryExpression__Alternatives"


    // $ANTLR start "rule__PrimaryExpression__Alternatives"
    // InternalQLS.g:1591:1: rule__PrimaryExpression__Alternatives : ( ( ruleCall ) | ( ruleIfExpression ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1595:1: ( ( ruleCall ) | ( ruleIfExpression ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
            case RULE_ID:
            case 15:
            case 16:
            case 79:
                {
                alt5=1;
                }
                break;
            case 59:
                {
                alt5=2;
                }
                break;
            case 57:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalQLS.g:1596:2: ( ruleCall )
                    {
                    // InternalQLS.g:1596:2: ( ruleCall )
                    // InternalQLS.g:1597:3: ruleCall
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getCallParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCall();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getCallParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:1602:2: ( ruleIfExpression )
                    {
                    // InternalQLS.g:1602:2: ( ruleIfExpression )
                    // InternalQLS.g:1603:3: ruleIfExpression
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getIfExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIfExpression();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getIfExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQLS.g:1608:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    {
                    // InternalQLS.g:1608:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    // InternalQLS.g:1609:3: ( rule__PrimaryExpression__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 
                    // InternalQLS.g:1610:3: ( rule__PrimaryExpression__Group_2__0 )
                    // InternalQLS.g:1610:4: rule__PrimaryExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Alternatives"


    // $ANTLR start "rule__PrimaryExpression__Alternatives_2_1"
    // InternalQLS.g:1618:1: rule__PrimaryExpression__Alternatives_2_1 : ( ( ruleOrExpression ) | ( ruleUnaryExpression ) );
    public final void rule__PrimaryExpression__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1622:1: ( ( ruleOrExpression ) | ( ruleUnaryExpression ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_INT && LA6_0<=RULE_ID)||(LA6_0>=15 && LA6_0<=16)||LA6_0==57||LA6_0==59||LA6_0==79) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=34 && LA6_0<=35)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalQLS.g:1623:2: ( ruleOrExpression )
                    {
                    // InternalQLS.g:1623:2: ( ruleOrExpression )
                    // InternalQLS.g:1624:3: ruleOrExpression
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getOrExpressionParserRuleCall_2_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOrExpression();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getOrExpressionParserRuleCall_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:1629:2: ( ruleUnaryExpression )
                    {
                    // InternalQLS.g:1629:2: ( ruleUnaryExpression )
                    // InternalQLS.g:1630:3: ruleUnaryExpression
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getUnaryExpressionParserRuleCall_2_1_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUnaryExpression();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getUnaryExpressionParserRuleCall_2_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Alternatives_2_1"


    // $ANTLR start "rule__Call__Alternatives"
    // InternalQLS.g:1639:1: rule__Call__Alternatives : ( ( ruleConstantCall ) | ( ruleQuestionCall ) | ( ruleEnumerationCall ) );
    public final void rule__Call__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1643:1: ( ( ruleConstantCall ) | ( ruleQuestionCall ) | ( ruleEnumerationCall ) )
            int alt7=3;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalQLS.g:1644:2: ( ruleConstantCall )
                    {
                    // InternalQLS.g:1644:2: ( ruleConstantCall )
                    // InternalQLS.g:1645:3: ruleConstantCall
                    {
                     before(grammarAccess.getCallAccess().getConstantCallParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleConstantCall();

                    state._fsp--;

                     after(grammarAccess.getCallAccess().getConstantCallParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:1650:2: ( ruleQuestionCall )
                    {
                    // InternalQLS.g:1650:2: ( ruleQuestionCall )
                    // InternalQLS.g:1651:3: ruleQuestionCall
                    {
                     before(grammarAccess.getCallAccess().getQuestionCallParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleQuestionCall();

                    state._fsp--;

                     after(grammarAccess.getCallAccess().getQuestionCallParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQLS.g:1656:2: ( ruleEnumerationCall )
                    {
                    // InternalQLS.g:1656:2: ( ruleEnumerationCall )
                    // InternalQLS.g:1657:3: ruleEnumerationCall
                    {
                     before(grammarAccess.getCallAccess().getEnumerationCallParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEnumerationCall();

                    state._fsp--;

                     after(grammarAccess.getCallAccess().getEnumerationCallParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalQLS.g:1666:1: rule__Value__Alternatives : ( ( ruleIntegerValue ) | ( ruleStringValue ) | ( ruleBooleanValue ) | ( ruleDateValue ) | ( ruleDecimalValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1670:1: ( ( ruleIntegerValue ) | ( ruleStringValue ) | ( ruleBooleanValue ) | ( ruleDateValue ) | ( ruleDecimalValue ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==79) ) {
                    alt8=5;
                }
                else if ( (LA8_1==EOF||LA8_1==58) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt8=2;
                }
                break;
            case 15:
            case 16:
                {
                alt8=3;
                }
                break;
            case 77:
                {
                alt8=4;
                }
                break;
            case 79:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalQLS.g:1671:2: ( ruleIntegerValue )
                    {
                    // InternalQLS.g:1671:2: ( ruleIntegerValue )
                    // InternalQLS.g:1672:3: ruleIntegerValue
                    {
                     before(grammarAccess.getValueAccess().getIntegerValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntegerValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getIntegerValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:1677:2: ( ruleStringValue )
                    {
                    // InternalQLS.g:1677:2: ( ruleStringValue )
                    // InternalQLS.g:1678:3: ruleStringValue
                    {
                     before(grammarAccess.getValueAccess().getStringValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getStringValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQLS.g:1683:2: ( ruleBooleanValue )
                    {
                    // InternalQLS.g:1683:2: ( ruleBooleanValue )
                    // InternalQLS.g:1684:3: ruleBooleanValue
                    {
                     before(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQLS.g:1689:2: ( ruleDateValue )
                    {
                    // InternalQLS.g:1689:2: ( ruleDateValue )
                    // InternalQLS.g:1690:3: ruleDateValue
                    {
                     before(grammarAccess.getValueAccess().getDateValueParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDateValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getDateValueParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalQLS.g:1695:2: ( ruleDecimalValue )
                    {
                    // InternalQLS.g:1695:2: ( ruleDecimalValue )
                    // InternalQLS.g:1696:3: ruleDecimalValue
                    {
                     before(grammarAccess.getValueAccess().getDecimalValueParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleDecimalValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getDecimalValueParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__DefinitionGroup__Alternatives_3"
    // InternalQLS.g:1705:1: rule__DefinitionGroup__Alternatives_3 : ( ( ( rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0 ) ) | ( ( rule__DefinitionGroup__DataTypesAssignment_3_1 ) ) );
    public final void rule__DefinitionGroup__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1709:1: ( ( ( rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0 ) ) | ( ( rule__DefinitionGroup__DataTypesAssignment_3_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==80||LA9_0==87) ) {
                alt9=1;
            }
            else if ( (LA9_0==65||(LA9_0>=67 && LA9_0<=68)||(LA9_0>=71 && LA9_0<=73)||LA9_0==76) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalQLS.g:1710:2: ( ( rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0 ) )
                    {
                    // InternalQLS.g:1710:2: ( ( rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0 ) )
                    // InternalQLS.g:1711:3: ( rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0 )
                    {
                     before(grammarAccess.getDefinitionGroupAccess().getQuestionDefinitionsAssignment_3_0()); 
                    // InternalQLS.g:1712:3: ( rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0 )
                    // InternalQLS.g:1712:4: rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefinitionGroupAccess().getQuestionDefinitionsAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:1716:2: ( ( rule__DefinitionGroup__DataTypesAssignment_3_1 ) )
                    {
                    // InternalQLS.g:1716:2: ( ( rule__DefinitionGroup__DataTypesAssignment_3_1 ) )
                    // InternalQLS.g:1717:3: ( rule__DefinitionGroup__DataTypesAssignment_3_1 )
                    {
                     before(grammarAccess.getDefinitionGroupAccess().getDataTypesAssignment_3_1()); 
                    // InternalQLS.g:1718:3: ( rule__DefinitionGroup__DataTypesAssignment_3_1 )
                    // InternalQLS.g:1718:4: rule__DefinitionGroup__DataTypesAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DefinitionGroup__DataTypesAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefinitionGroupAccess().getDataTypesAssignment_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__Alternatives_3"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalQLS.g:1726:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1730:1: ( ( 'true' ) | ( 'false' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            else if ( (LA10_0==16) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalQLS.g:1731:2: ( 'true' )
                    {
                    // InternalQLS.g:1731:2: ( 'true' )
                    // InternalQLS.g:1732:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:1737:2: ( 'false' )
                    {
                    // InternalQLS.g:1737:2: ( 'false' )
                    // InternalQLS.g:1738:3: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalQLS.g:1747:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1751:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalQLS.g:1752:2: ( RULE_STRING )
                    {
                    // InternalQLS.g:1752:2: ( RULE_STRING )
                    // InternalQLS.g:1753:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:1758:2: ( RULE_ID )
                    {
                    // InternalQLS.g:1758:2: ( RULE_ID )
                    // InternalQLS.g:1759:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__QuestionGroup__Alternatives_3"
    // InternalQLS.g:1768:1: rule__QuestionGroup__Alternatives_3 : ( ( ( rule__QuestionGroup__QuestionGroupsAssignment_3_0 ) ) | ( ( rule__QuestionGroup__QuestionsAssignment_3_1 ) ) );
    public final void rule__QuestionGroup__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1772:1: ( ( ( rule__QuestionGroup__QuestionGroupsAssignment_3_0 ) ) | ( ( rule__QuestionGroup__QuestionsAssignment_3_1 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==44||LA12_0==59) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalQLS.g:1773:2: ( ( rule__QuestionGroup__QuestionGroupsAssignment_3_0 ) )
                    {
                    // InternalQLS.g:1773:2: ( ( rule__QuestionGroup__QuestionGroupsAssignment_3_0 ) )
                    // InternalQLS.g:1774:3: ( rule__QuestionGroup__QuestionGroupsAssignment_3_0 )
                    {
                     before(grammarAccess.getQuestionGroupAccess().getQuestionGroupsAssignment_3_0()); 
                    // InternalQLS.g:1775:3: ( rule__QuestionGroup__QuestionGroupsAssignment_3_0 )
                    // InternalQLS.g:1775:4: rule__QuestionGroup__QuestionGroupsAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionGroup__QuestionGroupsAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQuestionGroupAccess().getQuestionGroupsAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:1779:2: ( ( rule__QuestionGroup__QuestionsAssignment_3_1 ) )
                    {
                    // InternalQLS.g:1779:2: ( ( rule__QuestionGroup__QuestionsAssignment_3_1 ) )
                    // InternalQLS.g:1780:3: ( rule__QuestionGroup__QuestionsAssignment_3_1 )
                    {
                     before(grammarAccess.getQuestionGroupAccess().getQuestionsAssignment_3_1()); 
                    // InternalQLS.g:1781:3: ( rule__QuestionGroup__QuestionsAssignment_3_1 )
                    // InternalQLS.g:1781:4: rule__QuestionGroup__QuestionsAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionGroup__QuestionsAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getQuestionGroupAccess().getQuestionsAssignment_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Alternatives_3"


    // $ANTLR start "rule__ConstantCall__ValueAlternatives_1_0"
    // InternalQLS.g:1789:1: rule__ConstantCall__ValueAlternatives_1_0 : ( ( ruleStringValue ) | ( ruleIntegerValue ) | ( ruleBooleanValue ) | ( ruleDecimalValue ) );
    public final void rule__ConstantCall__ValueAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1793:1: ( ( ruleStringValue ) | ( ruleIntegerValue ) | ( ruleBooleanValue ) | ( ruleDecimalValue ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt13=1;
                }
                break;
            case RULE_INT:
                {
                int LA13_2 = input.LA(2);

                if ( (LA13_2==79) ) {
                    alt13=4;
                }
                else if ( (LA13_2==EOF||(LA13_2>=12 && LA13_2<=14)||LA13_2==34||(LA13_2>=36 && LA13_2<=42)||LA13_2==44||LA13_2==58||(LA13_2>=60 && LA13_2<=62)||LA13_2==83) ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;
                }
                }
                break;
            case 15:
            case 16:
                {
                alt13=3;
                }
                break;
            case 79:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalQLS.g:1794:2: ( ruleStringValue )
                    {
                    // InternalQLS.g:1794:2: ( ruleStringValue )
                    // InternalQLS.g:1795:3: ruleStringValue
                    {
                     before(grammarAccess.getConstantCallAccess().getValueStringValueParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getConstantCallAccess().getValueStringValueParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:1800:2: ( ruleIntegerValue )
                    {
                    // InternalQLS.g:1800:2: ( ruleIntegerValue )
                    // InternalQLS.g:1801:3: ruleIntegerValue
                    {
                     before(grammarAccess.getConstantCallAccess().getValueIntegerValueParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntegerValue();

                    state._fsp--;

                     after(grammarAccess.getConstantCallAccess().getValueIntegerValueParserRuleCall_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQLS.g:1806:2: ( ruleBooleanValue )
                    {
                    // InternalQLS.g:1806:2: ( ruleBooleanValue )
                    // InternalQLS.g:1807:3: ruleBooleanValue
                    {
                     before(grammarAccess.getConstantCallAccess().getValueBooleanValueParserRuleCall_1_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanValue();

                    state._fsp--;

                     after(grammarAccess.getConstantCallAccess().getValueBooleanValueParserRuleCall_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQLS.g:1812:2: ( ruleDecimalValue )
                    {
                    // InternalQLS.g:1812:2: ( ruleDecimalValue )
                    // InternalQLS.g:1813:3: ruleDecimalValue
                    {
                     before(grammarAccess.getConstantCallAccess().getValueDecimalValueParserRuleCall_1_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDecimalValue();

                    state._fsp--;

                     after(grammarAccess.getConstantCallAccess().getValueDecimalValueParserRuleCall_1_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantCall__ValueAlternatives_1_0"


    // $ANTLR start "rule__EDouble__Alternatives_3_0"
    // InternalQLS.g:1822:1: rule__EDouble__Alternatives_3_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1826:1: ( ( 'E' ) | ( 'e' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==17) ) {
                alt14=1;
            }
            else if ( (LA14_0==18) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalQLS.g:1827:2: ( 'E' )
                    {
                    // InternalQLS.g:1827:2: ( 'E' )
                    // InternalQLS.g:1828:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_3_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:1833:2: ( 'e' )
                    {
                    // InternalQLS.g:1833:2: ( 'e' )
                    // InternalQLS.g:1834:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_3_0_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_3_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Alternatives_3_0"


    // $ANTLR start "rule__BooleanStyleKind__Alternatives"
    // InternalQLS.g:1843:1: rule__BooleanStyleKind__Alternatives : ( ( ( 'CHECKBOX' ) ) | ( ( 'TWO_RADIO' ) ) | ( ( 'DROPDOWN' ) ) );
    public final void rule__BooleanStyleKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1847:1: ( ( ( 'CHECKBOX' ) ) | ( ( 'TWO_RADIO' ) ) | ( ( 'DROPDOWN' ) ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt15=1;
                }
                break;
            case 20:
                {
                alt15=2;
                }
                break;
            case 21:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalQLS.g:1848:2: ( ( 'CHECKBOX' ) )
                    {
                    // InternalQLS.g:1848:2: ( ( 'CHECKBOX' ) )
                    // InternalQLS.g:1849:3: ( 'CHECKBOX' )
                    {
                     before(grammarAccess.getBooleanStyleKindAccess().getCHECKBOXEnumLiteralDeclaration_0()); 
                    // InternalQLS.g:1850:3: ( 'CHECKBOX' )
                    // InternalQLS.g:1850:4: 'CHECKBOX'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getBooleanStyleKindAccess().getCHECKBOXEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:1854:2: ( ( 'TWO_RADIO' ) )
                    {
                    // InternalQLS.g:1854:2: ( ( 'TWO_RADIO' ) )
                    // InternalQLS.g:1855:3: ( 'TWO_RADIO' )
                    {
                     before(grammarAccess.getBooleanStyleKindAccess().getTWO_RADIOEnumLiteralDeclaration_1()); 
                    // InternalQLS.g:1856:3: ( 'TWO_RADIO' )
                    // InternalQLS.g:1856:4: 'TWO_RADIO'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getBooleanStyleKindAccess().getTWO_RADIOEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQLS.g:1860:2: ( ( 'DROPDOWN' ) )
                    {
                    // InternalQLS.g:1860:2: ( ( 'DROPDOWN' ) )
                    // InternalQLS.g:1861:3: ( 'DROPDOWN' )
                    {
                     before(grammarAccess.getBooleanStyleKindAccess().getDROPDOWNEnumLiteralDeclaration_2()); 
                    // InternalQLS.g:1862:3: ( 'DROPDOWN' )
                    // InternalQLS.g:1862:4: 'DROPDOWN'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getBooleanStyleKindAccess().getDROPDOWNEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanStyleKind__Alternatives"


    // $ANTLR start "rule__BinaryOperatorKind__Alternatives"
    // InternalQLS.g:1870:1: rule__BinaryOperatorKind__Alternatives : ( ( ( 'PLUS' ) ) | ( ( 'MINUS' ) ) | ( ( 'MULT' ) ) | ( ( 'DIV' ) ) | ( ( 'EQUAL' ) ) | ( ( 'NOTEQUAL' ) ) | ( ( 'GREATER' ) ) | ( ( 'LOWER' ) ) | ( ( 'GREATEROREQUAL' ) ) | ( ( 'LOWEROREQUAL' ) ) | ( ( 'AND' ) ) | ( ( 'OR' ) ) );
    public final void rule__BinaryOperatorKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1874:1: ( ( ( 'PLUS' ) ) | ( ( 'MINUS' ) ) | ( ( 'MULT' ) ) | ( ( 'DIV' ) ) | ( ( 'EQUAL' ) ) | ( ( 'NOTEQUAL' ) ) | ( ( 'GREATER' ) ) | ( ( 'LOWER' ) ) | ( ( 'GREATEROREQUAL' ) ) | ( ( 'LOWEROREQUAL' ) ) | ( ( 'AND' ) ) | ( ( 'OR' ) ) )
            int alt16=12;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt16=1;
                }
                break;
            case 23:
                {
                alt16=2;
                }
                break;
            case 24:
                {
                alt16=3;
                }
                break;
            case 25:
                {
                alt16=4;
                }
                break;
            case 26:
                {
                alt16=5;
                }
                break;
            case 27:
                {
                alt16=6;
                }
                break;
            case 28:
                {
                alt16=7;
                }
                break;
            case 29:
                {
                alt16=8;
                }
                break;
            case 30:
                {
                alt16=9;
                }
                break;
            case 31:
                {
                alt16=10;
                }
                break;
            case 32:
                {
                alt16=11;
                }
                break;
            case 33:
                {
                alt16=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalQLS.g:1875:2: ( ( 'PLUS' ) )
                    {
                    // InternalQLS.g:1875:2: ( ( 'PLUS' ) )
                    // InternalQLS.g:1876:3: ( 'PLUS' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getPLUSEnumLiteralDeclaration_0()); 
                    // InternalQLS.g:1877:3: ( 'PLUS' )
                    // InternalQLS.g:1877:4: 'PLUS'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getPLUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:1881:2: ( ( 'MINUS' ) )
                    {
                    // InternalQLS.g:1881:2: ( ( 'MINUS' ) )
                    // InternalQLS.g:1882:3: ( 'MINUS' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getMINUSEnumLiteralDeclaration_1()); 
                    // InternalQLS.g:1883:3: ( 'MINUS' )
                    // InternalQLS.g:1883:4: 'MINUS'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getMINUSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQLS.g:1887:2: ( ( 'MULT' ) )
                    {
                    // InternalQLS.g:1887:2: ( ( 'MULT' ) )
                    // InternalQLS.g:1888:3: ( 'MULT' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getMULTEnumLiteralDeclaration_2()); 
                    // InternalQLS.g:1889:3: ( 'MULT' )
                    // InternalQLS.g:1889:4: 'MULT'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getMULTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQLS.g:1893:2: ( ( 'DIV' ) )
                    {
                    // InternalQLS.g:1893:2: ( ( 'DIV' ) )
                    // InternalQLS.g:1894:3: ( 'DIV' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getDIVEnumLiteralDeclaration_3()); 
                    // InternalQLS.g:1895:3: ( 'DIV' )
                    // InternalQLS.g:1895:4: 'DIV'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getDIVEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalQLS.g:1899:2: ( ( 'EQUAL' ) )
                    {
                    // InternalQLS.g:1899:2: ( ( 'EQUAL' ) )
                    // InternalQLS.g:1900:3: ( 'EQUAL' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getEQUALEnumLiteralDeclaration_4()); 
                    // InternalQLS.g:1901:3: ( 'EQUAL' )
                    // InternalQLS.g:1901:4: 'EQUAL'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getEQUALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalQLS.g:1905:2: ( ( 'NOTEQUAL' ) )
                    {
                    // InternalQLS.g:1905:2: ( ( 'NOTEQUAL' ) )
                    // InternalQLS.g:1906:3: ( 'NOTEQUAL' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getNOTEQUALEnumLiteralDeclaration_5()); 
                    // InternalQLS.g:1907:3: ( 'NOTEQUAL' )
                    // InternalQLS.g:1907:4: 'NOTEQUAL'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getNOTEQUALEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalQLS.g:1911:2: ( ( 'GREATER' ) )
                    {
                    // InternalQLS.g:1911:2: ( ( 'GREATER' ) )
                    // InternalQLS.g:1912:3: ( 'GREATER' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getGREATEREnumLiteralDeclaration_6()); 
                    // InternalQLS.g:1913:3: ( 'GREATER' )
                    // InternalQLS.g:1913:4: 'GREATER'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getGREATEREnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalQLS.g:1917:2: ( ( 'LOWER' ) )
                    {
                    // InternalQLS.g:1917:2: ( ( 'LOWER' ) )
                    // InternalQLS.g:1918:3: ( 'LOWER' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getLOWEREnumLiteralDeclaration_7()); 
                    // InternalQLS.g:1919:3: ( 'LOWER' )
                    // InternalQLS.g:1919:4: 'LOWER'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getLOWEREnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalQLS.g:1923:2: ( ( 'GREATEROREQUAL' ) )
                    {
                    // InternalQLS.g:1923:2: ( ( 'GREATEROREQUAL' ) )
                    // InternalQLS.g:1924:3: ( 'GREATEROREQUAL' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_8()); 
                    // InternalQLS.g:1925:3: ( 'GREATEROREQUAL' )
                    // InternalQLS.g:1925:4: 'GREATEROREQUAL'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalQLS.g:1929:2: ( ( 'LOWEROREQUAL' ) )
                    {
                    // InternalQLS.g:1929:2: ( ( 'LOWEROREQUAL' ) )
                    // InternalQLS.g:1930:3: ( 'LOWEROREQUAL' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getLOWEROREQUALEnumLiteralDeclaration_9()); 
                    // InternalQLS.g:1931:3: ( 'LOWEROREQUAL' )
                    // InternalQLS.g:1931:4: 'LOWEROREQUAL'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getLOWEROREQUALEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalQLS.g:1935:2: ( ( 'AND' ) )
                    {
                    // InternalQLS.g:1935:2: ( ( 'AND' ) )
                    // InternalQLS.g:1936:3: ( 'AND' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getANDEnumLiteralDeclaration_10()); 
                    // InternalQLS.g:1937:3: ( 'AND' )
                    // InternalQLS.g:1937:4: 'AND'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getANDEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalQLS.g:1941:2: ( ( 'OR' ) )
                    {
                    // InternalQLS.g:1941:2: ( ( 'OR' ) )
                    // InternalQLS.g:1942:3: ( 'OR' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getOREnumLiteralDeclaration_11()); 
                    // InternalQLS.g:1943:3: ( 'OR' )
                    // InternalQLS.g:1943:4: 'OR'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getOREnumLiteralDeclaration_11()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryOperatorKind__Alternatives"


    // $ANTLR start "rule__UnaryOperatorKind__Alternatives"
    // InternalQLS.g:1951:1: rule__UnaryOperatorKind__Alternatives : ( ( ( '-' ) ) | ( ( 'not' ) ) );
    public final void rule__UnaryOperatorKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1955:1: ( ( ( '-' ) ) | ( ( 'not' ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            else if ( (LA17_0==35) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalQLS.g:1956:2: ( ( '-' ) )
                    {
                    // InternalQLS.g:1956:2: ( ( '-' ) )
                    // InternalQLS.g:1957:3: ( '-' )
                    {
                     before(grammarAccess.getUnaryOperatorKindAccess().getUNARYMINUSEnumLiteralDeclaration_0()); 
                    // InternalQLS.g:1958:3: ( '-' )
                    // InternalQLS.g:1958:4: '-'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getUnaryOperatorKindAccess().getUNARYMINUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:1962:2: ( ( 'not' ) )
                    {
                    // InternalQLS.g:1962:2: ( ( 'not' ) )
                    // InternalQLS.g:1963:3: ( 'not' )
                    {
                     before(grammarAccess.getUnaryOperatorKindAccess().getNOTEnumLiteralDeclaration_1()); 
                    // InternalQLS.g:1964:3: ( 'not' )
                    // InternalQLS.g:1964:4: 'not'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getUnaryOperatorKindAccess().getNOTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperatorKind__Alternatives"


    // $ANTLR start "rule__AdditionOperatorKind__Alternatives"
    // InternalQLS.g:1972:1: rule__AdditionOperatorKind__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__AdditionOperatorKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1976:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            else if ( (LA18_0==34) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalQLS.g:1977:2: ( ( '+' ) )
                    {
                    // InternalQLS.g:1977:2: ( ( '+' ) )
                    // InternalQLS.g:1978:3: ( '+' )
                    {
                     before(grammarAccess.getAdditionOperatorKindAccess().getPLUSEnumLiteralDeclaration_0()); 
                    // InternalQLS.g:1979:3: ( '+' )
                    // InternalQLS.g:1979:4: '+'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getAdditionOperatorKindAccess().getPLUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:1983:2: ( ( '-' ) )
                    {
                    // InternalQLS.g:1983:2: ( ( '-' ) )
                    // InternalQLS.g:1984:3: ( '-' )
                    {
                     before(grammarAccess.getAdditionOperatorKindAccess().getMINUSEnumLiteralDeclaration_1()); 
                    // InternalQLS.g:1985:3: ( '-' )
                    // InternalQLS.g:1985:4: '-'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getAdditionOperatorKindAccess().getMINUSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionOperatorKind__Alternatives"


    // $ANTLR start "rule__MultiplicationOperatorKind__Alternatives"
    // InternalQLS.g:1993:1: rule__MultiplicationOperatorKind__Alternatives : ( ( ( '*' ) ) | ( ( '/' ) ) );
    public final void rule__MultiplicationOperatorKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1997:1: ( ( ( '*' ) ) | ( ( '/' ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            else if ( (LA19_0==38) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalQLS.g:1998:2: ( ( '*' ) )
                    {
                    // InternalQLS.g:1998:2: ( ( '*' ) )
                    // InternalQLS.g:1999:3: ( '*' )
                    {
                     before(grammarAccess.getMultiplicationOperatorKindAccess().getMULTEnumLiteralDeclaration_0()); 
                    // InternalQLS.g:2000:3: ( '*' )
                    // InternalQLS.g:2000:4: '*'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicationOperatorKindAccess().getMULTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:2004:2: ( ( '/' ) )
                    {
                    // InternalQLS.g:2004:2: ( ( '/' ) )
                    // InternalQLS.g:2005:3: ( '/' )
                    {
                     before(grammarAccess.getMultiplicationOperatorKindAccess().getDIVEnumLiteralDeclaration_1()); 
                    // InternalQLS.g:2006:3: ( '/' )
                    // InternalQLS.g:2006:4: '/'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicationOperatorKindAccess().getDIVEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationOperatorKind__Alternatives"


    // $ANTLR start "rule__ComparisionOperatorKind__Alternatives"
    // InternalQLS.g:2014:1: rule__ComparisionOperatorKind__Alternatives : ( ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) );
    public final void rule__ComparisionOperatorKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2018:1: ( ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt20=1;
                }
                break;
            case 40:
                {
                alt20=2;
                }
                break;
            case 41:
                {
                alt20=3;
                }
                break;
            case 42:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalQLS.g:2019:2: ( ( '>' ) )
                    {
                    // InternalQLS.g:2019:2: ( ( '>' ) )
                    // InternalQLS.g:2020:3: ( '>' )
                    {
                     before(grammarAccess.getComparisionOperatorKindAccess().getGREATEREnumLiteralDeclaration_0()); 
                    // InternalQLS.g:2021:3: ( '>' )
                    // InternalQLS.g:2021:4: '>'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisionOperatorKindAccess().getGREATEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:2025:2: ( ( '<' ) )
                    {
                    // InternalQLS.g:2025:2: ( ( '<' ) )
                    // InternalQLS.g:2026:3: ( '<' )
                    {
                     before(grammarAccess.getComparisionOperatorKindAccess().getLOWEREnumLiteralDeclaration_1()); 
                    // InternalQLS.g:2027:3: ( '<' )
                    // InternalQLS.g:2027:4: '<'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisionOperatorKindAccess().getLOWEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQLS.g:2031:2: ( ( '>=' ) )
                    {
                    // InternalQLS.g:2031:2: ( ( '>=' ) )
                    // InternalQLS.g:2032:3: ( '>=' )
                    {
                     before(grammarAccess.getComparisionOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_2()); 
                    // InternalQLS.g:2033:3: ( '>=' )
                    // InternalQLS.g:2033:4: '>='
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisionOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQLS.g:2037:2: ( ( '<=' ) )
                    {
                    // InternalQLS.g:2037:2: ( ( '<=' ) )
                    // InternalQLS.g:2038:3: ( '<=' )
                    {
                     before(grammarAccess.getComparisionOperatorKindAccess().getLOWEROREQUALEnumLiteralDeclaration_3()); 
                    // InternalQLS.g:2039:3: ( '<=' )
                    // InternalQLS.g:2039:4: '<='
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisionOperatorKindAccess().getLOWEROREQUALEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisionOperatorKind__Alternatives"


    // $ANTLR start "rule__QLSModel__Group__0"
    // InternalQLS.g:2047:1: rule__QLSModel__Group__0 : rule__QLSModel__Group__0__Impl rule__QLSModel__Group__1 ;
    public final void rule__QLSModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2051:1: ( rule__QLSModel__Group__0__Impl rule__QLSModel__Group__1 )
            // InternalQLS.g:2052:2: rule__QLSModel__Group__0__Impl rule__QLSModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__QLSModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLSModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLSModel__Group__0"


    // $ANTLR start "rule__QLSModel__Group__0__Impl"
    // InternalQLS.g:2059:1: rule__QLSModel__Group__0__Impl : ( () ) ;
    public final void rule__QLSModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2063:1: ( ( () ) )
            // InternalQLS.g:2064:1: ( () )
            {
            // InternalQLS.g:2064:1: ( () )
            // InternalQLS.g:2065:2: ()
            {
             before(grammarAccess.getQLSModelAccess().getQLSModelAction_0()); 
            // InternalQLS.g:2066:2: ()
            // InternalQLS.g:2066:3: 
            {
            }

             after(grammarAccess.getQLSModelAccess().getQLSModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLSModel__Group__0__Impl"


    // $ANTLR start "rule__QLSModel__Group__1"
    // InternalQLS.g:2074:1: rule__QLSModel__Group__1 : rule__QLSModel__Group__1__Impl rule__QLSModel__Group__2 ;
    public final void rule__QLSModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2078:1: ( rule__QLSModel__Group__1__Impl rule__QLSModel__Group__2 )
            // InternalQLS.g:2079:2: rule__QLSModel__Group__1__Impl rule__QLSModel__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__QLSModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLSModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLSModel__Group__1"


    // $ANTLR start "rule__QLSModel__Group__1__Impl"
    // InternalQLS.g:2086:1: rule__QLSModel__Group__1__Impl : ( ( rule__QLSModel__ImportsAssignment_1 )* ) ;
    public final void rule__QLSModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2090:1: ( ( ( rule__QLSModel__ImportsAssignment_1 )* ) )
            // InternalQLS.g:2091:1: ( ( rule__QLSModel__ImportsAssignment_1 )* )
            {
            // InternalQLS.g:2091:1: ( ( rule__QLSModel__ImportsAssignment_1 )* )
            // InternalQLS.g:2092:2: ( rule__QLSModel__ImportsAssignment_1 )*
            {
             before(grammarAccess.getQLSModelAccess().getImportsAssignment_1()); 
            // InternalQLS.g:2093:2: ( rule__QLSModel__ImportsAssignment_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==47) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalQLS.g:2093:3: rule__QLSModel__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__QLSModel__ImportsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getQLSModelAccess().getImportsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLSModel__Group__1__Impl"


    // $ANTLR start "rule__QLSModel__Group__2"
    // InternalQLS.g:2101:1: rule__QLSModel__Group__2 : rule__QLSModel__Group__2__Impl rule__QLSModel__Group__3 ;
    public final void rule__QLSModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2105:1: ( rule__QLSModel__Group__2__Impl rule__QLSModel__Group__3 )
            // InternalQLS.g:2106:2: rule__QLSModel__Group__2__Impl rule__QLSModel__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__QLSModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLSModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLSModel__Group__2"


    // $ANTLR start "rule__QLSModel__Group__2__Impl"
    // InternalQLS.g:2113:1: rule__QLSModel__Group__2__Impl : ( 'QLSModel' ) ;
    public final void rule__QLSModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2117:1: ( ( 'QLSModel' ) )
            // InternalQLS.g:2118:1: ( 'QLSModel' )
            {
            // InternalQLS.g:2118:1: ( 'QLSModel' )
            // InternalQLS.g:2119:2: 'QLSModel'
            {
             before(grammarAccess.getQLSModelAccess().getQLSModelKeyword_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getQLSModelAccess().getQLSModelKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLSModel__Group__2__Impl"


    // $ANTLR start "rule__QLSModel__Group__3"
    // InternalQLS.g:2128:1: rule__QLSModel__Group__3 : rule__QLSModel__Group__3__Impl rule__QLSModel__Group__4 ;
    public final void rule__QLSModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2132:1: ( rule__QLSModel__Group__3__Impl rule__QLSModel__Group__4 )
            // InternalQLS.g:2133:2: rule__QLSModel__Group__3__Impl rule__QLSModel__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__QLSModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLSModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLSModel__Group__3"


    // $ANTLR start "rule__QLSModel__Group__3__Impl"
    // InternalQLS.g:2140:1: rule__QLSModel__Group__3__Impl : ( '{' ) ;
    public final void rule__QLSModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2144:1: ( ( '{' ) )
            // InternalQLS.g:2145:1: ( '{' )
            {
            // InternalQLS.g:2145:1: ( '{' )
            // InternalQLS.g:2146:2: '{'
            {
             before(grammarAccess.getQLSModelAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getQLSModelAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLSModel__Group__3__Impl"


    // $ANTLR start "rule__QLSModel__Group__4"
    // InternalQLS.g:2155:1: rule__QLSModel__Group__4 : rule__QLSModel__Group__4__Impl rule__QLSModel__Group__5 ;
    public final void rule__QLSModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2159:1: ( rule__QLSModel__Group__4__Impl rule__QLSModel__Group__5 )
            // InternalQLS.g:2160:2: rule__QLSModel__Group__4__Impl rule__QLSModel__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__QLSModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLSModel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLSModel__Group__4"


    // $ANTLR start "rule__QLSModel__Group__4__Impl"
    // InternalQLS.g:2167:1: rule__QLSModel__Group__4__Impl : ( 'questionStyles' ) ;
    public final void rule__QLSModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2171:1: ( ( 'questionStyles' ) )
            // InternalQLS.g:2172:1: ( 'questionStyles' )
            {
            // InternalQLS.g:2172:1: ( 'questionStyles' )
            // InternalQLS.g:2173:2: 'questionStyles'
            {
             before(grammarAccess.getQLSModelAccess().getQuestionStylesKeyword_4()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getQLSModelAccess().getQuestionStylesKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLSModel__Group__4__Impl"


    // $ANTLR start "rule__QLSModel__Group__5"
    // InternalQLS.g:2182:1: rule__QLSModel__Group__5 : rule__QLSModel__Group__5__Impl rule__QLSModel__Group__6 ;
    public final void rule__QLSModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2186:1: ( rule__QLSModel__Group__5__Impl rule__QLSModel__Group__6 )
            // InternalQLS.g:2187:2: rule__QLSModel__Group__5__Impl rule__QLSModel__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__QLSModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLSModel__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLSModel__Group__5"


    // $ANTLR start "rule__QLSModel__Group__5__Impl"
    // InternalQLS.g:2194:1: rule__QLSModel__Group__5__Impl : ( '{' ) ;
    public final void rule__QLSModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2198:1: ( ( '{' ) )
            // InternalQLS.g:2199:1: ( '{' )
            {
            // InternalQLS.g:2199:1: ( '{' )
            // InternalQLS.g:2200:2: '{'
            {
             before(grammarAccess.getQLSModelAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getQLSModelAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLSModel__Group__5__Impl"


    // $ANTLR start "rule__QLSModel__Group__6"
    // InternalQLS.g:2209:1: rule__QLSModel__Group__6 : rule__QLSModel__Group__6__Impl rule__QLSModel__Group__7 ;
    public final void rule__QLSModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2213:1: ( rule__QLSModel__Group__6__Impl rule__QLSModel__Group__7 )
            // InternalQLS.g:2214:2: rule__QLSModel__Group__6__Impl rule__QLSModel__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__QLSModel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLSModel__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLSModel__Group__6"


    // $ANTLR start "rule__QLSModel__Group__6__Impl"
    // InternalQLS.g:2221:1: rule__QLSModel__Group__6__Impl : ( ( rule__QLSModel__QuestionStylesAssignment_6 )* ) ;
    public final void rule__QLSModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2225:1: ( ( ( rule__QLSModel__QuestionStylesAssignment_6 )* ) )
            // InternalQLS.g:2226:1: ( ( rule__QLSModel__QuestionStylesAssignment_6 )* )
            {
            // InternalQLS.g:2226:1: ( ( rule__QLSModel__QuestionStylesAssignment_6 )* )
            // InternalQLS.g:2227:2: ( rule__QLSModel__QuestionStylesAssignment_6 )*
            {
             before(grammarAccess.getQLSModelAccess().getQuestionStylesAssignment_6()); 
            // InternalQLS.g:2228:2: ( rule__QLSModel__QuestionStylesAssignment_6 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==48) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalQLS.g:2228:3: rule__QLSModel__QuestionStylesAssignment_6
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__QLSModel__QuestionStylesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getQLSModelAccess().getQuestionStylesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLSModel__Group__6__Impl"


    // $ANTLR start "rule__QLSModel__Group__7"
    // InternalQLS.g:2236:1: rule__QLSModel__Group__7 : rule__QLSModel__Group__7__Impl rule__QLSModel__Group__8 ;
    public final void rule__QLSModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2240:1: ( rule__QLSModel__Group__7__Impl rule__QLSModel__Group__8 )
            // InternalQLS.g:2241:2: rule__QLSModel__Group__7__Impl rule__QLSModel__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__QLSModel__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLSModel__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLSModel__Group__7"


    // $ANTLR start "rule__QLSModel__Group__7__Impl"
    // InternalQLS.g:2248:1: rule__QLSModel__Group__7__Impl : ( '}' ) ;
    public final void rule__QLSModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2252:1: ( ( '}' ) )
            // InternalQLS.g:2253:1: ( '}' )
            {
            // InternalQLS.g:2253:1: ( '}' )
            // InternalQLS.g:2254:2: '}'
            {
             before(grammarAccess.getQLSModelAccess().getRightCurlyBracketKeyword_7()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getQLSModelAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLSModel__Group__7__Impl"


    // $ANTLR start "rule__QLSModel__Group__8"
    // InternalQLS.g:2263:1: rule__QLSModel__Group__8 : rule__QLSModel__Group__8__Impl ;
    public final void rule__QLSModel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2267:1: ( rule__QLSModel__Group__8__Impl )
            // InternalQLS.g:2268:2: rule__QLSModel__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QLSModel__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLSModel__Group__8"


    // $ANTLR start "rule__QLSModel__Group__8__Impl"
    // InternalQLS.g:2274:1: rule__QLSModel__Group__8__Impl : ( '}' ) ;
    public final void rule__QLSModel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2278:1: ( ( '}' ) )
            // InternalQLS.g:2279:1: ( '}' )
            {
            // InternalQLS.g:2279:1: ( '}' )
            // InternalQLS.g:2280:2: '}'
            {
             before(grammarAccess.getQLSModelAccess().getRightCurlyBracketKeyword_8()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getQLSModelAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLSModel__Group__8__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalQLS.g:2290:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2294:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalQLS.g:2295:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalQLS.g:2302:1: rule__Import__Group__0__Impl : ( () ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2306:1: ( ( () ) )
            // InternalQLS.g:2307:1: ( () )
            {
            // InternalQLS.g:2307:1: ( () )
            // InternalQLS.g:2308:2: ()
            {
             before(grammarAccess.getImportAccess().getImportAction_0()); 
            // InternalQLS.g:2309:2: ()
            // InternalQLS.g:2309:3: 
            {
            }

             after(grammarAccess.getImportAccess().getImportAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalQLS.g:2317:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2321:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalQLS.g:2322:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Import__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalQLS.g:2329:1: rule__Import__Group__1__Impl : ( 'import' ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2333:1: ( ( 'import' ) )
            // InternalQLS.g:2334:1: ( 'import' )
            {
            // InternalQLS.g:2334:1: ( 'import' )
            // InternalQLS.g:2335:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__2"
    // InternalQLS.g:2344:1: rule__Import__Group__2 : rule__Import__Group__2__Impl ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2348:1: ( rule__Import__Group__2__Impl )
            // InternalQLS.g:2349:2: rule__Import__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2"


    // $ANTLR start "rule__Import__Group__2__Impl"
    // InternalQLS.g:2355:1: rule__Import__Group__2__Impl : ( ( rule__Import__ImportURIAssignment_2 ) ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2359:1: ( ( ( rule__Import__ImportURIAssignment_2 ) ) )
            // InternalQLS.g:2360:1: ( ( rule__Import__ImportURIAssignment_2 ) )
            {
            // InternalQLS.g:2360:1: ( ( rule__Import__ImportURIAssignment_2 ) )
            // InternalQLS.g:2361:2: ( rule__Import__ImportURIAssignment_2 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_2()); 
            // InternalQLS.g:2362:2: ( rule__Import__ImportURIAssignment_2 )
            // InternalQLS.g:2362:3: rule__Import__ImportURIAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportURIAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportURIAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2__Impl"


    // $ANTLR start "rule__QuestionStyle__Group__0"
    // InternalQLS.g:2371:1: rule__QuestionStyle__Group__0 : rule__QuestionStyle__Group__0__Impl rule__QuestionStyle__Group__1 ;
    public final void rule__QuestionStyle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2375:1: ( rule__QuestionStyle__Group__0__Impl rule__QuestionStyle__Group__1 )
            // InternalQLS.g:2376:2: rule__QuestionStyle__Group__0__Impl rule__QuestionStyle__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__QuestionStyle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionStyle__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStyle__Group__0"


    // $ANTLR start "rule__QuestionStyle__Group__0__Impl"
    // InternalQLS.g:2383:1: rule__QuestionStyle__Group__0__Impl : ( 'styledQuestion' ) ;
    public final void rule__QuestionStyle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2387:1: ( ( 'styledQuestion' ) )
            // InternalQLS.g:2388:1: ( 'styledQuestion' )
            {
            // InternalQLS.g:2388:1: ( 'styledQuestion' )
            // InternalQLS.g:2389:2: 'styledQuestion'
            {
             before(grammarAccess.getQuestionStyleAccess().getStyledQuestionKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getQuestionStyleAccess().getStyledQuestionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStyle__Group__0__Impl"


    // $ANTLR start "rule__QuestionStyle__Group__1"
    // InternalQLS.g:2398:1: rule__QuestionStyle__Group__1 : rule__QuestionStyle__Group__1__Impl rule__QuestionStyle__Group__2 ;
    public final void rule__QuestionStyle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2402:1: ( rule__QuestionStyle__Group__1__Impl rule__QuestionStyle__Group__2 )
            // InternalQLS.g:2403:2: rule__QuestionStyle__Group__1__Impl rule__QuestionStyle__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__QuestionStyle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionStyle__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStyle__Group__1"


    // $ANTLR start "rule__QuestionStyle__Group__1__Impl"
    // InternalQLS.g:2410:1: rule__QuestionStyle__Group__1__Impl : ( ( rule__QuestionStyle__StyledQuestionAssignment_1 ) ) ;
    public final void rule__QuestionStyle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2414:1: ( ( ( rule__QuestionStyle__StyledQuestionAssignment_1 ) ) )
            // InternalQLS.g:2415:1: ( ( rule__QuestionStyle__StyledQuestionAssignment_1 ) )
            {
            // InternalQLS.g:2415:1: ( ( rule__QuestionStyle__StyledQuestionAssignment_1 ) )
            // InternalQLS.g:2416:2: ( rule__QuestionStyle__StyledQuestionAssignment_1 )
            {
             before(grammarAccess.getQuestionStyleAccess().getStyledQuestionAssignment_1()); 
            // InternalQLS.g:2417:2: ( rule__QuestionStyle__StyledQuestionAssignment_1 )
            // InternalQLS.g:2417:3: rule__QuestionStyle__StyledQuestionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__QuestionStyle__StyledQuestionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionStyleAccess().getStyledQuestionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStyle__Group__1__Impl"


    // $ANTLR start "rule__QuestionStyle__Group__2"
    // InternalQLS.g:2425:1: rule__QuestionStyle__Group__2 : rule__QuestionStyle__Group__2__Impl rule__QuestionStyle__Group__3 ;
    public final void rule__QuestionStyle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2429:1: ( rule__QuestionStyle__Group__2__Impl rule__QuestionStyle__Group__3 )
            // InternalQLS.g:2430:2: rule__QuestionStyle__Group__2__Impl rule__QuestionStyle__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__QuestionStyle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionStyle__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStyle__Group__2"


    // $ANTLR start "rule__QuestionStyle__Group__2__Impl"
    // InternalQLS.g:2437:1: rule__QuestionStyle__Group__2__Impl : ( '{' ) ;
    public final void rule__QuestionStyle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2441:1: ( ( '{' ) )
            // InternalQLS.g:2442:1: ( '{' )
            {
            // InternalQLS.g:2442:1: ( '{' )
            // InternalQLS.g:2443:2: '{'
            {
             before(grammarAccess.getQuestionStyleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getQuestionStyleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStyle__Group__2__Impl"


    // $ANTLR start "rule__QuestionStyle__Group__3"
    // InternalQLS.g:2452:1: rule__QuestionStyle__Group__3 : rule__QuestionStyle__Group__3__Impl rule__QuestionStyle__Group__4 ;
    public final void rule__QuestionStyle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2456:1: ( rule__QuestionStyle__Group__3__Impl rule__QuestionStyle__Group__4 )
            // InternalQLS.g:2457:2: rule__QuestionStyle__Group__3__Impl rule__QuestionStyle__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__QuestionStyle__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionStyle__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStyle__Group__3"


    // $ANTLR start "rule__QuestionStyle__Group__3__Impl"
    // InternalQLS.g:2464:1: rule__QuestionStyle__Group__3__Impl : ( ( rule__QuestionStyle__Group_3__0 )? ) ;
    public final void rule__QuestionStyle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2468:1: ( ( ( rule__QuestionStyle__Group_3__0 )? ) )
            // InternalQLS.g:2469:1: ( ( rule__QuestionStyle__Group_3__0 )? )
            {
            // InternalQLS.g:2469:1: ( ( rule__QuestionStyle__Group_3__0 )? )
            // InternalQLS.g:2470:2: ( rule__QuestionStyle__Group_3__0 )?
            {
             before(grammarAccess.getQuestionStyleAccess().getGroup_3()); 
            // InternalQLS.g:2471:2: ( rule__QuestionStyle__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==49) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalQLS.g:2471:3: rule__QuestionStyle__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionStyle__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionStyleAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStyle__Group__3__Impl"


    // $ANTLR start "rule__QuestionStyle__Group__4"
    // InternalQLS.g:2479:1: rule__QuestionStyle__Group__4 : rule__QuestionStyle__Group__4__Impl rule__QuestionStyle__Group__5 ;
    public final void rule__QuestionStyle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2483:1: ( rule__QuestionStyle__Group__4__Impl rule__QuestionStyle__Group__5 )
            // InternalQLS.g:2484:2: rule__QuestionStyle__Group__4__Impl rule__QuestionStyle__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__QuestionStyle__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionStyle__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStyle__Group__4"


    // $ANTLR start "rule__QuestionStyle__Group__4__Impl"
    // InternalQLS.g:2491:1: rule__QuestionStyle__Group__4__Impl : ( ( rule__QuestionStyle__Group_4__0 )? ) ;
    public final void rule__QuestionStyle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2495:1: ( ( ( rule__QuestionStyle__Group_4__0 )? ) )
            // InternalQLS.g:2496:1: ( ( rule__QuestionStyle__Group_4__0 )? )
            {
            // InternalQLS.g:2496:1: ( ( rule__QuestionStyle__Group_4__0 )? )
            // InternalQLS.g:2497:2: ( rule__QuestionStyle__Group_4__0 )?
            {
             before(grammarAccess.getQuestionStyleAccess().getGroup_4()); 
            // InternalQLS.g:2498:2: ( rule__QuestionStyle__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==50) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalQLS.g:2498:3: rule__QuestionStyle__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionStyle__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionStyleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStyle__Group__4__Impl"


    // $ANTLR start "rule__QuestionStyle__Group__5"
    // InternalQLS.g:2506:1: rule__QuestionStyle__Group__5 : rule__QuestionStyle__Group__5__Impl ;
    public final void rule__QuestionStyle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2510:1: ( rule__QuestionStyle__Group__5__Impl )
            // InternalQLS.g:2511:2: rule__QuestionStyle__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionStyle__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStyle__Group__5"


    // $ANTLR start "rule__QuestionStyle__Group__5__Impl"
    // InternalQLS.g:2517:1: rule__QuestionStyle__Group__5__Impl : ( '}' ) ;
    public final void rule__QuestionStyle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2521:1: ( ( '}' ) )
            // InternalQLS.g:2522:1: ( '}' )
            {
            // InternalQLS.g:2522:1: ( '}' )
            // InternalQLS.g:2523:2: '}'
            {
             before(grammarAccess.getQuestionStyleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getQuestionStyleAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStyle__Group__5__Impl"


    // $ANTLR start "rule__QuestionStyle__Group_3__0"
    // InternalQLS.g:2533:1: rule__QuestionStyle__Group_3__0 : rule__QuestionStyle__Group_3__0__Impl rule__QuestionStyle__Group_3__1 ;
    public final void rule__QuestionStyle__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2537:1: ( rule__QuestionStyle__Group_3__0__Impl rule__QuestionStyle__Group_3__1 )
            // InternalQLS.g:2538:2: rule__QuestionStyle__Group_3__0__Impl rule__QuestionStyle__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__QuestionStyle__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionStyle__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStyle__Group_3__0"


    // $ANTLR start "rule__QuestionStyle__Group_3__0__Impl"
    // InternalQLS.g:2545:1: rule__QuestionStyle__Group_3__0__Impl : ( 'labelStyle' ) ;
    public final void rule__QuestionStyle__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2549:1: ( ( 'labelStyle' ) )
            // InternalQLS.g:2550:1: ( 'labelStyle' )
            {
            // InternalQLS.g:2550:1: ( 'labelStyle' )
            // InternalQLS.g:2551:2: 'labelStyle'
            {
             before(grammarAccess.getQuestionStyleAccess().getLabelStyleKeyword_3_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getQuestionStyleAccess().getLabelStyleKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStyle__Group_3__0__Impl"


    // $ANTLR start "rule__QuestionStyle__Group_3__1"
    // InternalQLS.g:2560:1: rule__QuestionStyle__Group_3__1 : rule__QuestionStyle__Group_3__1__Impl ;
    public final void rule__QuestionStyle__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2564:1: ( rule__QuestionStyle__Group_3__1__Impl )
            // InternalQLS.g:2565:2: rule__QuestionStyle__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionStyle__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStyle__Group_3__1"


    // $ANTLR start "rule__QuestionStyle__Group_3__1__Impl"
    // InternalQLS.g:2571:1: rule__QuestionStyle__Group_3__1__Impl : ( ( rule__QuestionStyle__LabelStyleAssignment_3_1 ) ) ;
    public final void rule__QuestionStyle__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2575:1: ( ( ( rule__QuestionStyle__LabelStyleAssignment_3_1 ) ) )
            // InternalQLS.g:2576:1: ( ( rule__QuestionStyle__LabelStyleAssignment_3_1 ) )
            {
            // InternalQLS.g:2576:1: ( ( rule__QuestionStyle__LabelStyleAssignment_3_1 ) )
            // InternalQLS.g:2577:2: ( rule__QuestionStyle__LabelStyleAssignment_3_1 )
            {
             before(grammarAccess.getQuestionStyleAccess().getLabelStyleAssignment_3_1()); 
            // InternalQLS.g:2578:2: ( rule__QuestionStyle__LabelStyleAssignment_3_1 )
            // InternalQLS.g:2578:3: rule__QuestionStyle__LabelStyleAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__QuestionStyle__LabelStyleAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionStyleAccess().getLabelStyleAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStyle__Group_3__1__Impl"


    // $ANTLR start "rule__QuestionStyle__Group_4__0"
    // InternalQLS.g:2587:1: rule__QuestionStyle__Group_4__0 : rule__QuestionStyle__Group_4__0__Impl rule__QuestionStyle__Group_4__1 ;
    public final void rule__QuestionStyle__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2591:1: ( rule__QuestionStyle__Group_4__0__Impl rule__QuestionStyle__Group_4__1 )
            // InternalQLS.g:2592:2: rule__QuestionStyle__Group_4__0__Impl rule__QuestionStyle__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__QuestionStyle__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionStyle__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStyle__Group_4__0"


    // $ANTLR start "rule__QuestionStyle__Group_4__0__Impl"
    // InternalQLS.g:2599:1: rule__QuestionStyle__Group_4__0__Impl : ( 'typeStyle' ) ;
    public final void rule__QuestionStyle__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2603:1: ( ( 'typeStyle' ) )
            // InternalQLS.g:2604:1: ( 'typeStyle' )
            {
            // InternalQLS.g:2604:1: ( 'typeStyle' )
            // InternalQLS.g:2605:2: 'typeStyle'
            {
             before(grammarAccess.getQuestionStyleAccess().getTypeStyleKeyword_4_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getQuestionStyleAccess().getTypeStyleKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStyle__Group_4__0__Impl"


    // $ANTLR start "rule__QuestionStyle__Group_4__1"
    // InternalQLS.g:2614:1: rule__QuestionStyle__Group_4__1 : rule__QuestionStyle__Group_4__1__Impl ;
    public final void rule__QuestionStyle__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2618:1: ( rule__QuestionStyle__Group_4__1__Impl )
            // InternalQLS.g:2619:2: rule__QuestionStyle__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionStyle__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStyle__Group_4__1"


    // $ANTLR start "rule__QuestionStyle__Group_4__1__Impl"
    // InternalQLS.g:2625:1: rule__QuestionStyle__Group_4__1__Impl : ( ( rule__QuestionStyle__TypeStyleAssignment_4_1 ) ) ;
    public final void rule__QuestionStyle__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2629:1: ( ( ( rule__QuestionStyle__TypeStyleAssignment_4_1 ) ) )
            // InternalQLS.g:2630:1: ( ( rule__QuestionStyle__TypeStyleAssignment_4_1 ) )
            {
            // InternalQLS.g:2630:1: ( ( rule__QuestionStyle__TypeStyleAssignment_4_1 ) )
            // InternalQLS.g:2631:2: ( rule__QuestionStyle__TypeStyleAssignment_4_1 )
            {
             before(grammarAccess.getQuestionStyleAccess().getTypeStyleAssignment_4_1()); 
            // InternalQLS.g:2632:2: ( rule__QuestionStyle__TypeStyleAssignment_4_1 )
            // InternalQLS.g:2632:3: rule__QuestionStyle__TypeStyleAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__QuestionStyle__TypeStyleAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionStyleAccess().getTypeStyleAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStyle__Group_4__1__Impl"


    // $ANTLR start "rule__LabelStyle__Group__0"
    // InternalQLS.g:2641:1: rule__LabelStyle__Group__0 : rule__LabelStyle__Group__0__Impl rule__LabelStyle__Group__1 ;
    public final void rule__LabelStyle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2645:1: ( rule__LabelStyle__Group__0__Impl rule__LabelStyle__Group__1 )
            // InternalQLS.g:2646:2: rule__LabelStyle__Group__0__Impl rule__LabelStyle__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__LabelStyle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LabelStyle__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelStyle__Group__0"


    // $ANTLR start "rule__LabelStyle__Group__0__Impl"
    // InternalQLS.g:2653:1: rule__LabelStyle__Group__0__Impl : ( () ) ;
    public final void rule__LabelStyle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2657:1: ( ( () ) )
            // InternalQLS.g:2658:1: ( () )
            {
            // InternalQLS.g:2658:1: ( () )
            // InternalQLS.g:2659:2: ()
            {
             before(grammarAccess.getLabelStyleAccess().getLabelStyleAction_0()); 
            // InternalQLS.g:2660:2: ()
            // InternalQLS.g:2660:3: 
            {
            }

             after(grammarAccess.getLabelStyleAccess().getLabelStyleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelStyle__Group__0__Impl"


    // $ANTLR start "rule__LabelStyle__Group__1"
    // InternalQLS.g:2668:1: rule__LabelStyle__Group__1 : rule__LabelStyle__Group__1__Impl rule__LabelStyle__Group__2 ;
    public final void rule__LabelStyle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2672:1: ( rule__LabelStyle__Group__1__Impl rule__LabelStyle__Group__2 )
            // InternalQLS.g:2673:2: rule__LabelStyle__Group__1__Impl rule__LabelStyle__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__LabelStyle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LabelStyle__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelStyle__Group__1"


    // $ANTLR start "rule__LabelStyle__Group__1__Impl"
    // InternalQLS.g:2680:1: rule__LabelStyle__Group__1__Impl : ( '{' ) ;
    public final void rule__LabelStyle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2684:1: ( ( '{' ) )
            // InternalQLS.g:2685:1: ( '{' )
            {
            // InternalQLS.g:2685:1: ( '{' )
            // InternalQLS.g:2686:2: '{'
            {
             before(grammarAccess.getLabelStyleAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getLabelStyleAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelStyle__Group__1__Impl"


    // $ANTLR start "rule__LabelStyle__Group__2"
    // InternalQLS.g:2695:1: rule__LabelStyle__Group__2 : rule__LabelStyle__Group__2__Impl rule__LabelStyle__Group__3 ;
    public final void rule__LabelStyle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2699:1: ( rule__LabelStyle__Group__2__Impl rule__LabelStyle__Group__3 )
            // InternalQLS.g:2700:2: rule__LabelStyle__Group__2__Impl rule__LabelStyle__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__LabelStyle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LabelStyle__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelStyle__Group__2"


    // $ANTLR start "rule__LabelStyle__Group__2__Impl"
    // InternalQLS.g:2707:1: rule__LabelStyle__Group__2__Impl : ( ( rule__LabelStyle__ItalicAssignment_2 )? ) ;
    public final void rule__LabelStyle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2711:1: ( ( ( rule__LabelStyle__ItalicAssignment_2 )? ) )
            // InternalQLS.g:2712:1: ( ( rule__LabelStyle__ItalicAssignment_2 )? )
            {
            // InternalQLS.g:2712:1: ( ( rule__LabelStyle__ItalicAssignment_2 )? )
            // InternalQLS.g:2713:2: ( rule__LabelStyle__ItalicAssignment_2 )?
            {
             before(grammarAccess.getLabelStyleAccess().getItalicAssignment_2()); 
            // InternalQLS.g:2714:2: ( rule__LabelStyle__ItalicAssignment_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==84) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalQLS.g:2714:3: rule__LabelStyle__ItalicAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__LabelStyle__ItalicAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLabelStyleAccess().getItalicAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelStyle__Group__2__Impl"


    // $ANTLR start "rule__LabelStyle__Group__3"
    // InternalQLS.g:2722:1: rule__LabelStyle__Group__3 : rule__LabelStyle__Group__3__Impl rule__LabelStyle__Group__4 ;
    public final void rule__LabelStyle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2726:1: ( rule__LabelStyle__Group__3__Impl rule__LabelStyle__Group__4 )
            // InternalQLS.g:2727:2: rule__LabelStyle__Group__3__Impl rule__LabelStyle__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__LabelStyle__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LabelStyle__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelStyle__Group__3"


    // $ANTLR start "rule__LabelStyle__Group__3__Impl"
    // InternalQLS.g:2734:1: rule__LabelStyle__Group__3__Impl : ( ( rule__LabelStyle__BoldAssignment_3 )? ) ;
    public final void rule__LabelStyle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2738:1: ( ( ( rule__LabelStyle__BoldAssignment_3 )? ) )
            // InternalQLS.g:2739:1: ( ( rule__LabelStyle__BoldAssignment_3 )? )
            {
            // InternalQLS.g:2739:1: ( ( rule__LabelStyle__BoldAssignment_3 )? )
            // InternalQLS.g:2740:2: ( rule__LabelStyle__BoldAssignment_3 )?
            {
             before(grammarAccess.getLabelStyleAccess().getBoldAssignment_3()); 
            // InternalQLS.g:2741:2: ( rule__LabelStyle__BoldAssignment_3 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==85) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalQLS.g:2741:3: rule__LabelStyle__BoldAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__LabelStyle__BoldAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLabelStyleAccess().getBoldAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelStyle__Group__3__Impl"


    // $ANTLR start "rule__LabelStyle__Group__4"
    // InternalQLS.g:2749:1: rule__LabelStyle__Group__4 : rule__LabelStyle__Group__4__Impl ;
    public final void rule__LabelStyle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2753:1: ( rule__LabelStyle__Group__4__Impl )
            // InternalQLS.g:2754:2: rule__LabelStyle__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LabelStyle__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelStyle__Group__4"


    // $ANTLR start "rule__LabelStyle__Group__4__Impl"
    // InternalQLS.g:2760:1: rule__LabelStyle__Group__4__Impl : ( '}' ) ;
    public final void rule__LabelStyle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2764:1: ( ( '}' ) )
            // InternalQLS.g:2765:1: ( '}' )
            {
            // InternalQLS.g:2765:1: ( '}' )
            // InternalQLS.g:2766:2: '}'
            {
             before(grammarAccess.getLabelStyleAccess().getRightCurlyBracketKeyword_4()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getLabelStyleAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelStyle__Group__4__Impl"


    // $ANTLR start "rule__BooleanTypeStyle__Group__0"
    // InternalQLS.g:2776:1: rule__BooleanTypeStyle__Group__0 : rule__BooleanTypeStyle__Group__0__Impl rule__BooleanTypeStyle__Group__1 ;
    public final void rule__BooleanTypeStyle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2780:1: ( rule__BooleanTypeStyle__Group__0__Impl rule__BooleanTypeStyle__Group__1 )
            // InternalQLS.g:2781:2: rule__BooleanTypeStyle__Group__0__Impl rule__BooleanTypeStyle__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__BooleanTypeStyle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanTypeStyle__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanTypeStyle__Group__0"


    // $ANTLR start "rule__BooleanTypeStyle__Group__0__Impl"
    // InternalQLS.g:2788:1: rule__BooleanTypeStyle__Group__0__Impl : ( 'BooleanStyle' ) ;
    public final void rule__BooleanTypeStyle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2792:1: ( ( 'BooleanStyle' ) )
            // InternalQLS.g:2793:1: ( 'BooleanStyle' )
            {
            // InternalQLS.g:2793:1: ( 'BooleanStyle' )
            // InternalQLS.g:2794:2: 'BooleanStyle'
            {
             before(grammarAccess.getBooleanTypeStyleAccess().getBooleanStyleKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getBooleanTypeStyleAccess().getBooleanStyleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanTypeStyle__Group__0__Impl"


    // $ANTLR start "rule__BooleanTypeStyle__Group__1"
    // InternalQLS.g:2803:1: rule__BooleanTypeStyle__Group__1 : rule__BooleanTypeStyle__Group__1__Impl rule__BooleanTypeStyle__Group__2 ;
    public final void rule__BooleanTypeStyle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2807:1: ( rule__BooleanTypeStyle__Group__1__Impl rule__BooleanTypeStyle__Group__2 )
            // InternalQLS.g:2808:2: rule__BooleanTypeStyle__Group__1__Impl rule__BooleanTypeStyle__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__BooleanTypeStyle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanTypeStyle__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanTypeStyle__Group__1"


    // $ANTLR start "rule__BooleanTypeStyle__Group__1__Impl"
    // InternalQLS.g:2815:1: rule__BooleanTypeStyle__Group__1__Impl : ( '{' ) ;
    public final void rule__BooleanTypeStyle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2819:1: ( ( '{' ) )
            // InternalQLS.g:2820:1: ( '{' )
            {
            // InternalQLS.g:2820:1: ( '{' )
            // InternalQLS.g:2821:2: '{'
            {
             before(grammarAccess.getBooleanTypeStyleAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getBooleanTypeStyleAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanTypeStyle__Group__1__Impl"


    // $ANTLR start "rule__BooleanTypeStyle__Group__2"
    // InternalQLS.g:2830:1: rule__BooleanTypeStyle__Group__2 : rule__BooleanTypeStyle__Group__2__Impl rule__BooleanTypeStyle__Group__3 ;
    public final void rule__BooleanTypeStyle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2834:1: ( rule__BooleanTypeStyle__Group__2__Impl rule__BooleanTypeStyle__Group__3 )
            // InternalQLS.g:2835:2: rule__BooleanTypeStyle__Group__2__Impl rule__BooleanTypeStyle__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__BooleanTypeStyle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanTypeStyle__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanTypeStyle__Group__2"


    // $ANTLR start "rule__BooleanTypeStyle__Group__2__Impl"
    // InternalQLS.g:2842:1: rule__BooleanTypeStyle__Group__2__Impl : ( ( rule__BooleanTypeStyle__BooleanStyleKindAssignment_2 ) ) ;
    public final void rule__BooleanTypeStyle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2846:1: ( ( ( rule__BooleanTypeStyle__BooleanStyleKindAssignment_2 ) ) )
            // InternalQLS.g:2847:1: ( ( rule__BooleanTypeStyle__BooleanStyleKindAssignment_2 ) )
            {
            // InternalQLS.g:2847:1: ( ( rule__BooleanTypeStyle__BooleanStyleKindAssignment_2 ) )
            // InternalQLS.g:2848:2: ( rule__BooleanTypeStyle__BooleanStyleKindAssignment_2 )
            {
             before(grammarAccess.getBooleanTypeStyleAccess().getBooleanStyleKindAssignment_2()); 
            // InternalQLS.g:2849:2: ( rule__BooleanTypeStyle__BooleanStyleKindAssignment_2 )
            // InternalQLS.g:2849:3: rule__BooleanTypeStyle__BooleanStyleKindAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BooleanTypeStyle__BooleanStyleKindAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBooleanTypeStyleAccess().getBooleanStyleKindAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanTypeStyle__Group__2__Impl"


    // $ANTLR start "rule__BooleanTypeStyle__Group__3"
    // InternalQLS.g:2857:1: rule__BooleanTypeStyle__Group__3 : rule__BooleanTypeStyle__Group__3__Impl ;
    public final void rule__BooleanTypeStyle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2861:1: ( rule__BooleanTypeStyle__Group__3__Impl )
            // InternalQLS.g:2862:2: rule__BooleanTypeStyle__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanTypeStyle__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanTypeStyle__Group__3"


    // $ANTLR start "rule__BooleanTypeStyle__Group__3__Impl"
    // InternalQLS.g:2868:1: rule__BooleanTypeStyle__Group__3__Impl : ( '}' ) ;
    public final void rule__BooleanTypeStyle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2872:1: ( ( '}' ) )
            // InternalQLS.g:2873:1: ( '}' )
            {
            // InternalQLS.g:2873:1: ( '}' )
            // InternalQLS.g:2874:2: '}'
            {
             before(grammarAccess.getBooleanTypeStyleAccess().getRightCurlyBracketKeyword_3()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getBooleanTypeStyleAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanTypeStyle__Group__3__Impl"


    // $ANTLR start "rule__NumericTypeTextFieldStyle__Group__0"
    // InternalQLS.g:2884:1: rule__NumericTypeTextFieldStyle__Group__0 : rule__NumericTypeTextFieldStyle__Group__0__Impl rule__NumericTypeTextFieldStyle__Group__1 ;
    public final void rule__NumericTypeTextFieldStyle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2888:1: ( rule__NumericTypeTextFieldStyle__Group__0__Impl rule__NumericTypeTextFieldStyle__Group__1 )
            // InternalQLS.g:2889:2: rule__NumericTypeTextFieldStyle__Group__0__Impl rule__NumericTypeTextFieldStyle__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__NumericTypeTextFieldStyle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericTypeTextFieldStyle__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericTypeTextFieldStyle__Group__0"


    // $ANTLR start "rule__NumericTypeTextFieldStyle__Group__0__Impl"
    // InternalQLS.g:2896:1: rule__NumericTypeTextFieldStyle__Group__0__Impl : ( () ) ;
    public final void rule__NumericTypeTextFieldStyle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2900:1: ( ( () ) )
            // InternalQLS.g:2901:1: ( () )
            {
            // InternalQLS.g:2901:1: ( () )
            // InternalQLS.g:2902:2: ()
            {
             before(grammarAccess.getNumericTypeTextFieldStyleAccess().getNumericTypeTextFieldStyleAction_0()); 
            // InternalQLS.g:2903:2: ()
            // InternalQLS.g:2903:3: 
            {
            }

             after(grammarAccess.getNumericTypeTextFieldStyleAccess().getNumericTypeTextFieldStyleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericTypeTextFieldStyle__Group__0__Impl"


    // $ANTLR start "rule__NumericTypeTextFieldStyle__Group__1"
    // InternalQLS.g:2911:1: rule__NumericTypeTextFieldStyle__Group__1 : rule__NumericTypeTextFieldStyle__Group__1__Impl rule__NumericTypeTextFieldStyle__Group__2 ;
    public final void rule__NumericTypeTextFieldStyle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2915:1: ( rule__NumericTypeTextFieldStyle__Group__1__Impl rule__NumericTypeTextFieldStyle__Group__2 )
            // InternalQLS.g:2916:2: rule__NumericTypeTextFieldStyle__Group__1__Impl rule__NumericTypeTextFieldStyle__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__NumericTypeTextFieldStyle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericTypeTextFieldStyle__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericTypeTextFieldStyle__Group__1"


    // $ANTLR start "rule__NumericTypeTextFieldStyle__Group__1__Impl"
    // InternalQLS.g:2923:1: rule__NumericTypeTextFieldStyle__Group__1__Impl : ( 'NumericStyle' ) ;
    public final void rule__NumericTypeTextFieldStyle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2927:1: ( ( 'NumericStyle' ) )
            // InternalQLS.g:2928:1: ( 'NumericStyle' )
            {
            // InternalQLS.g:2928:1: ( 'NumericStyle' )
            // InternalQLS.g:2929:2: 'NumericStyle'
            {
             before(grammarAccess.getNumericTypeTextFieldStyleAccess().getNumericStyleKeyword_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getNumericTypeTextFieldStyleAccess().getNumericStyleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericTypeTextFieldStyle__Group__1__Impl"


    // $ANTLR start "rule__NumericTypeTextFieldStyle__Group__2"
    // InternalQLS.g:2938:1: rule__NumericTypeTextFieldStyle__Group__2 : rule__NumericTypeTextFieldStyle__Group__2__Impl rule__NumericTypeTextFieldStyle__Group__3 ;
    public final void rule__NumericTypeTextFieldStyle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2942:1: ( rule__NumericTypeTextFieldStyle__Group__2__Impl rule__NumericTypeTextFieldStyle__Group__3 )
            // InternalQLS.g:2943:2: rule__NumericTypeTextFieldStyle__Group__2__Impl rule__NumericTypeTextFieldStyle__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__NumericTypeTextFieldStyle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericTypeTextFieldStyle__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericTypeTextFieldStyle__Group__2"


    // $ANTLR start "rule__NumericTypeTextFieldStyle__Group__2__Impl"
    // InternalQLS.g:2950:1: rule__NumericTypeTextFieldStyle__Group__2__Impl : ( 'textField' ) ;
    public final void rule__NumericTypeTextFieldStyle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2954:1: ( ( 'textField' ) )
            // InternalQLS.g:2955:1: ( 'textField' )
            {
            // InternalQLS.g:2955:1: ( 'textField' )
            // InternalQLS.g:2956:2: 'textField'
            {
             before(grammarAccess.getNumericTypeTextFieldStyleAccess().getTextFieldKeyword_2()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getNumericTypeTextFieldStyleAccess().getTextFieldKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericTypeTextFieldStyle__Group__2__Impl"


    // $ANTLR start "rule__NumericTypeTextFieldStyle__Group__3"
    // InternalQLS.g:2965:1: rule__NumericTypeTextFieldStyle__Group__3 : rule__NumericTypeTextFieldStyle__Group__3__Impl rule__NumericTypeTextFieldStyle__Group__4 ;
    public final void rule__NumericTypeTextFieldStyle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2969:1: ( rule__NumericTypeTextFieldStyle__Group__3__Impl rule__NumericTypeTextFieldStyle__Group__4 )
            // InternalQLS.g:2970:2: rule__NumericTypeTextFieldStyle__Group__3__Impl rule__NumericTypeTextFieldStyle__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__NumericTypeTextFieldStyle__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericTypeTextFieldStyle__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericTypeTextFieldStyle__Group__3"


    // $ANTLR start "rule__NumericTypeTextFieldStyle__Group__3__Impl"
    // InternalQLS.g:2977:1: rule__NumericTypeTextFieldStyle__Group__3__Impl : ( '{' ) ;
    public final void rule__NumericTypeTextFieldStyle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2981:1: ( ( '{' ) )
            // InternalQLS.g:2982:1: ( '{' )
            {
            // InternalQLS.g:2982:1: ( '{' )
            // InternalQLS.g:2983:2: '{'
            {
             before(grammarAccess.getNumericTypeTextFieldStyleAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getNumericTypeTextFieldStyleAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericTypeTextFieldStyle__Group__3__Impl"


    // $ANTLR start "rule__NumericTypeTextFieldStyle__Group__4"
    // InternalQLS.g:2992:1: rule__NumericTypeTextFieldStyle__Group__4 : rule__NumericTypeTextFieldStyle__Group__4__Impl rule__NumericTypeTextFieldStyle__Group__5 ;
    public final void rule__NumericTypeTextFieldStyle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2996:1: ( rule__NumericTypeTextFieldStyle__Group__4__Impl rule__NumericTypeTextFieldStyle__Group__5 )
            // InternalQLS.g:2997:2: rule__NumericTypeTextFieldStyle__Group__4__Impl rule__NumericTypeTextFieldStyle__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__NumericTypeTextFieldStyle__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericTypeTextFieldStyle__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericTypeTextFieldStyle__Group__4"


    // $ANTLR start "rule__NumericTypeTextFieldStyle__Group__4__Impl"
    // InternalQLS.g:3004:1: rule__NumericTypeTextFieldStyle__Group__4__Impl : ( ( rule__NumericTypeTextFieldStyle__Group_4__0 )? ) ;
    public final void rule__NumericTypeTextFieldStyle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3008:1: ( ( ( rule__NumericTypeTextFieldStyle__Group_4__0 )? ) )
            // InternalQLS.g:3009:1: ( ( rule__NumericTypeTextFieldStyle__Group_4__0 )? )
            {
            // InternalQLS.g:3009:1: ( ( rule__NumericTypeTextFieldStyle__Group_4__0 )? )
            // InternalQLS.g:3010:2: ( rule__NumericTypeTextFieldStyle__Group_4__0 )?
            {
             before(grammarAccess.getNumericTypeTextFieldStyleAccess().getGroup_4()); 
            // InternalQLS.g:3011:2: ( rule__NumericTypeTextFieldStyle__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==54) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalQLS.g:3011:3: rule__NumericTypeTextFieldStyle__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumericTypeTextFieldStyle__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumericTypeTextFieldStyleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericTypeTextFieldStyle__Group__4__Impl"


    // $ANTLR start "rule__NumericTypeTextFieldStyle__Group__5"
    // InternalQLS.g:3019:1: rule__NumericTypeTextFieldStyle__Group__5 : rule__NumericTypeTextFieldStyle__Group__5__Impl ;
    public final void rule__NumericTypeTextFieldStyle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3023:1: ( rule__NumericTypeTextFieldStyle__Group__5__Impl )
            // InternalQLS.g:3024:2: rule__NumericTypeTextFieldStyle__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumericTypeTextFieldStyle__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericTypeTextFieldStyle__Group__5"


    // $ANTLR start "rule__NumericTypeTextFieldStyle__Group__5__Impl"
    // InternalQLS.g:3030:1: rule__NumericTypeTextFieldStyle__Group__5__Impl : ( '}' ) ;
    public final void rule__NumericTypeTextFieldStyle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3034:1: ( ( '}' ) )
            // InternalQLS.g:3035:1: ( '}' )
            {
            // InternalQLS.g:3035:1: ( '}' )
            // InternalQLS.g:3036:2: '}'
            {
             before(grammarAccess.getNumericTypeTextFieldStyleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getNumericTypeTextFieldStyleAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericTypeTextFieldStyle__Group__5__Impl"


    // $ANTLR start "rule__NumericTypeTextFieldStyle__Group_4__0"
    // InternalQLS.g:3046:1: rule__NumericTypeTextFieldStyle__Group_4__0 : rule__NumericTypeTextFieldStyle__Group_4__0__Impl rule__NumericTypeTextFieldStyle__Group_4__1 ;
    public final void rule__NumericTypeTextFieldStyle__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3050:1: ( rule__NumericTypeTextFieldStyle__Group_4__0__Impl rule__NumericTypeTextFieldStyle__Group_4__1 )
            // InternalQLS.g:3051:2: rule__NumericTypeTextFieldStyle__Group_4__0__Impl rule__NumericTypeTextFieldStyle__Group_4__1
            {
            pushFollow(FOLLOW_20);
            rule__NumericTypeTextFieldStyle__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericTypeTextFieldStyle__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericTypeTextFieldStyle__Group_4__0"


    // $ANTLR start "rule__NumericTypeTextFieldStyle__Group_4__0__Impl"
    // InternalQLS.g:3058:1: rule__NumericTypeTextFieldStyle__Group_4__0__Impl : ( 'step' ) ;
    public final void rule__NumericTypeTextFieldStyle__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3062:1: ( ( 'step' ) )
            // InternalQLS.g:3063:1: ( 'step' )
            {
            // InternalQLS.g:3063:1: ( 'step' )
            // InternalQLS.g:3064:2: 'step'
            {
             before(grammarAccess.getNumericTypeTextFieldStyleAccess().getStepKeyword_4_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getNumericTypeTextFieldStyleAccess().getStepKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericTypeTextFieldStyle__Group_4__0__Impl"


    // $ANTLR start "rule__NumericTypeTextFieldStyle__Group_4__1"
    // InternalQLS.g:3073:1: rule__NumericTypeTextFieldStyle__Group_4__1 : rule__NumericTypeTextFieldStyle__Group_4__1__Impl ;
    public final void rule__NumericTypeTextFieldStyle__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3077:1: ( rule__NumericTypeTextFieldStyle__Group_4__1__Impl )
            // InternalQLS.g:3078:2: rule__NumericTypeTextFieldStyle__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumericTypeTextFieldStyle__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericTypeTextFieldStyle__Group_4__1"


    // $ANTLR start "rule__NumericTypeTextFieldStyle__Group_4__1__Impl"
    // InternalQLS.g:3084:1: rule__NumericTypeTextFieldStyle__Group_4__1__Impl : ( ( rule__NumericTypeTextFieldStyle__StepAssignment_4_1 ) ) ;
    public final void rule__NumericTypeTextFieldStyle__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3088:1: ( ( ( rule__NumericTypeTextFieldStyle__StepAssignment_4_1 ) ) )
            // InternalQLS.g:3089:1: ( ( rule__NumericTypeTextFieldStyle__StepAssignment_4_1 ) )
            {
            // InternalQLS.g:3089:1: ( ( rule__NumericTypeTextFieldStyle__StepAssignment_4_1 ) )
            // InternalQLS.g:3090:2: ( rule__NumericTypeTextFieldStyle__StepAssignment_4_1 )
            {
             before(grammarAccess.getNumericTypeTextFieldStyleAccess().getStepAssignment_4_1()); 
            // InternalQLS.g:3091:2: ( rule__NumericTypeTextFieldStyle__StepAssignment_4_1 )
            // InternalQLS.g:3091:3: rule__NumericTypeTextFieldStyle__StepAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__NumericTypeTextFieldStyle__StepAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getNumericTypeTextFieldStyleAccess().getStepAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericTypeTextFieldStyle__Group_4__1__Impl"


    // $ANTLR start "rule__NumericTypeSpinnerStyle__Group__0"
    // InternalQLS.g:3100:1: rule__NumericTypeSpinnerStyle__Group__0 : rule__NumericTypeSpinnerStyle__Group__0__Impl rule__NumericTypeSpinnerStyle__Group__1 ;
    public final void rule__NumericTypeSpinnerStyle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3104:1: ( rule__NumericTypeSpinnerStyle__Group__0__Impl rule__NumericTypeSpinnerStyle__Group__1 )
            // InternalQLS.g:3105:2: rule__NumericTypeSpinnerStyle__Group__0__Impl rule__NumericTypeSpinnerStyle__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__NumericTypeSpinnerStyle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericTypeSpinnerStyle__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericTypeSpinnerStyle__Group__0"


    // $ANTLR start "rule__NumericTypeSpinnerStyle__Group__0__Impl"
    // InternalQLS.g:3112:1: rule__NumericTypeSpinnerStyle__Group__0__Impl : ( () ) ;
    public final void rule__NumericTypeSpinnerStyle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3116:1: ( ( () ) )
            // InternalQLS.g:3117:1: ( () )
            {
            // InternalQLS.g:3117:1: ( () )
            // InternalQLS.g:3118:2: ()
            {
             before(grammarAccess.getNumericTypeSpinnerStyleAccess().getNumericSpinnerStyleAction_0()); 
            // InternalQLS.g:3119:2: ()
            // InternalQLS.g:3119:3: 
            {
            }

             after(grammarAccess.getNumericTypeSpinnerStyleAccess().getNumericSpinnerStyleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericTypeSpinnerStyle__Group__0__Impl"


    // $ANTLR start "rule__NumericTypeSpinnerStyle__Group__1"
    // InternalQLS.g:3127:1: rule__NumericTypeSpinnerStyle__Group__1 : rule__NumericTypeSpinnerStyle__Group__1__Impl rule__NumericTypeSpinnerStyle__Group__2 ;
    public final void rule__NumericTypeSpinnerStyle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3131:1: ( rule__NumericTypeSpinnerStyle__Group__1__Impl rule__NumericTypeSpinnerStyle__Group__2 )
            // InternalQLS.g:3132:2: rule__NumericTypeSpinnerStyle__Group__1__Impl rule__NumericTypeSpinnerStyle__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__NumericTypeSpinnerStyle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericTypeSpinnerStyle__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericTypeSpinnerStyle__Group__1"


    // $ANTLR start "rule__NumericTypeSpinnerStyle__Group__1__Impl"
    // InternalQLS.g:3139:1: rule__NumericTypeSpinnerStyle__Group__1__Impl : ( 'NumericStyle' ) ;
    public final void rule__NumericTypeSpinnerStyle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3143:1: ( ( 'NumericStyle' ) )
            // InternalQLS.g:3144:1: ( 'NumericStyle' )
            {
            // InternalQLS.g:3144:1: ( 'NumericStyle' )
            // InternalQLS.g:3145:2: 'NumericStyle'
            {
             before(grammarAccess.getNumericTypeSpinnerStyleAccess().getNumericStyleKeyword_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getNumericTypeSpinnerStyleAccess().getNumericStyleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericTypeSpinnerStyle__Group__1__Impl"


    // $ANTLR start "rule__NumericTypeSpinnerStyle__Group__2"
    // InternalQLS.g:3154:1: rule__NumericTypeSpinnerStyle__Group__2 : rule__NumericTypeSpinnerStyle__Group__2__Impl rule__NumericTypeSpinnerStyle__Group__3 ;
    public final void rule__NumericTypeSpinnerStyle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3158:1: ( rule__NumericTypeSpinnerStyle__Group__2__Impl rule__NumericTypeSpinnerStyle__Group__3 )
            // InternalQLS.g:3159:2: rule__NumericTypeSpinnerStyle__Group__2__Impl rule__NumericTypeSpinnerStyle__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__NumericTypeSpinnerStyle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericTypeSpinnerStyle__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericTypeSpinnerStyle__Group__2"


    // $ANTLR start "rule__NumericTypeSpinnerStyle__Group__2__Impl"
    // InternalQLS.g:3166:1: rule__NumericTypeSpinnerStyle__Group__2__Impl : ( 'spinner' ) ;
    public final void rule__NumericTypeSpinnerStyle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3170:1: ( ( 'spinner' ) )
            // InternalQLS.g:3171:1: ( 'spinner' )
            {
            // InternalQLS.g:3171:1: ( 'spinner' )
            // InternalQLS.g:3172:2: 'spinner'
            {
             before(grammarAccess.getNumericTypeSpinnerStyleAccess().getSpinnerKeyword_2()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getNumericTypeSpinnerStyleAccess().getSpinnerKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericTypeSpinnerStyle__Group__2__Impl"


    // $ANTLR start "rule__NumericTypeSpinnerStyle__Group__3"
    // InternalQLS.g:3181:1: rule__NumericTypeSpinnerStyle__Group__3 : rule__NumericTypeSpinnerStyle__Group__3__Impl rule__NumericTypeSpinnerStyle__Group__4 ;
    public final void rule__NumericTypeSpinnerStyle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3185:1: ( rule__NumericTypeSpinnerStyle__Group__3__Impl rule__NumericTypeSpinnerStyle__Group__4 )
            // InternalQLS.g:3186:2: rule__NumericTypeSpinnerStyle__Group__3__Impl rule__NumericTypeSpinnerStyle__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__NumericTypeSpinnerStyle__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericTypeSpinnerStyle__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericTypeSpinnerStyle__Group__3"


    // $ANTLR start "rule__NumericTypeSpinnerStyle__Group__3__Impl"
    // InternalQLS.g:3193:1: rule__NumericTypeSpinnerStyle__Group__3__Impl : ( '{' ) ;
    public final void rule__NumericTypeSpinnerStyle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3197:1: ( ( '{' ) )
            // InternalQLS.g:3198:1: ( '{' )
            {
            // InternalQLS.g:3198:1: ( '{' )
            // InternalQLS.g:3199:2: '{'
            {
             before(grammarAccess.getNumericTypeSpinnerStyleAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getNumericTypeSpinnerStyleAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericTypeSpinnerStyle__Group__3__Impl"


    // $ANTLR start "rule__NumericTypeSpinnerStyle__Group__4"
    // InternalQLS.g:3208:1: rule__NumericTypeSpinnerStyle__Group__4 : rule__NumericTypeSpinnerStyle__Group__4__Impl ;
    public final void rule__NumericTypeSpinnerStyle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3212:1: ( rule__NumericTypeSpinnerStyle__Group__4__Impl )
            // InternalQLS.g:3213:2: rule__NumericTypeSpinnerStyle__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumericTypeSpinnerStyle__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericTypeSpinnerStyle__Group__4"


    // $ANTLR start "rule__NumericTypeSpinnerStyle__Group__4__Impl"
    // InternalQLS.g:3219:1: rule__NumericTypeSpinnerStyle__Group__4__Impl : ( '}' ) ;
    public final void rule__NumericTypeSpinnerStyle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3223:1: ( ( '}' ) )
            // InternalQLS.g:3224:1: ( '}' )
            {
            // InternalQLS.g:3224:1: ( '}' )
            // InternalQLS.g:3225:2: '}'
            {
             before(grammarAccess.getNumericTypeSpinnerStyleAccess().getRightCurlyBracketKeyword_4()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getNumericTypeSpinnerStyleAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericTypeSpinnerStyle__Group__4__Impl"


    // $ANTLR start "rule__TextTypeStyle__Group__0"
    // InternalQLS.g:3235:1: rule__TextTypeStyle__Group__0 : rule__TextTypeStyle__Group__0__Impl rule__TextTypeStyle__Group__1 ;
    public final void rule__TextTypeStyle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3239:1: ( rule__TextTypeStyle__Group__0__Impl rule__TextTypeStyle__Group__1 )
            // InternalQLS.g:3240:2: rule__TextTypeStyle__Group__0__Impl rule__TextTypeStyle__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__TextTypeStyle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextTypeStyle__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextTypeStyle__Group__0"


    // $ANTLR start "rule__TextTypeStyle__Group__0__Impl"
    // InternalQLS.g:3247:1: rule__TextTypeStyle__Group__0__Impl : ( () ) ;
    public final void rule__TextTypeStyle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3251:1: ( ( () ) )
            // InternalQLS.g:3252:1: ( () )
            {
            // InternalQLS.g:3252:1: ( () )
            // InternalQLS.g:3253:2: ()
            {
             before(grammarAccess.getTextTypeStyleAccess().getTextTypeStyleAction_0()); 
            // InternalQLS.g:3254:2: ()
            // InternalQLS.g:3254:3: 
            {
            }

             after(grammarAccess.getTextTypeStyleAccess().getTextTypeStyleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextTypeStyle__Group__0__Impl"


    // $ANTLR start "rule__TextTypeStyle__Group__1"
    // InternalQLS.g:3262:1: rule__TextTypeStyle__Group__1 : rule__TextTypeStyle__Group__1__Impl rule__TextTypeStyle__Group__2 ;
    public final void rule__TextTypeStyle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3266:1: ( rule__TextTypeStyle__Group__1__Impl rule__TextTypeStyle__Group__2 )
            // InternalQLS.g:3267:2: rule__TextTypeStyle__Group__1__Impl rule__TextTypeStyle__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__TextTypeStyle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextTypeStyle__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextTypeStyle__Group__1"


    // $ANTLR start "rule__TextTypeStyle__Group__1__Impl"
    // InternalQLS.g:3274:1: rule__TextTypeStyle__Group__1__Impl : ( 'TextStyle' ) ;
    public final void rule__TextTypeStyle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3278:1: ( ( 'TextStyle' ) )
            // InternalQLS.g:3279:1: ( 'TextStyle' )
            {
            // InternalQLS.g:3279:1: ( 'TextStyle' )
            // InternalQLS.g:3280:2: 'TextStyle'
            {
             before(grammarAccess.getTextTypeStyleAccess().getTextStyleKeyword_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getTextTypeStyleAccess().getTextStyleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextTypeStyle__Group__1__Impl"


    // $ANTLR start "rule__TextTypeStyle__Group__2"
    // InternalQLS.g:3289:1: rule__TextTypeStyle__Group__2 : rule__TextTypeStyle__Group__2__Impl rule__TextTypeStyle__Group__3 ;
    public final void rule__TextTypeStyle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3293:1: ( rule__TextTypeStyle__Group__2__Impl rule__TextTypeStyle__Group__3 )
            // InternalQLS.g:3294:2: rule__TextTypeStyle__Group__2__Impl rule__TextTypeStyle__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__TextTypeStyle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextTypeStyle__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextTypeStyle__Group__2"


    // $ANTLR start "rule__TextTypeStyle__Group__2__Impl"
    // InternalQLS.g:3301:1: rule__TextTypeStyle__Group__2__Impl : ( '{' ) ;
    public final void rule__TextTypeStyle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3305:1: ( ( '{' ) )
            // InternalQLS.g:3306:1: ( '{' )
            {
            // InternalQLS.g:3306:1: ( '{' )
            // InternalQLS.g:3307:2: '{'
            {
             before(grammarAccess.getTextTypeStyleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getTextTypeStyleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextTypeStyle__Group__2__Impl"


    // $ANTLR start "rule__TextTypeStyle__Group__3"
    // InternalQLS.g:3316:1: rule__TextTypeStyle__Group__3 : rule__TextTypeStyle__Group__3__Impl rule__TextTypeStyle__Group__4 ;
    public final void rule__TextTypeStyle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3320:1: ( rule__TextTypeStyle__Group__3__Impl rule__TextTypeStyle__Group__4 )
            // InternalQLS.g:3321:2: rule__TextTypeStyle__Group__3__Impl rule__TextTypeStyle__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__TextTypeStyle__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextTypeStyle__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextTypeStyle__Group__3"


    // $ANTLR start "rule__TextTypeStyle__Group__3__Impl"
    // InternalQLS.g:3328:1: rule__TextTypeStyle__Group__3__Impl : ( ( rule__TextTypeStyle__MultilineAssignment_3 )? ) ;
    public final void rule__TextTypeStyle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3332:1: ( ( ( rule__TextTypeStyle__MultilineAssignment_3 )? ) )
            // InternalQLS.g:3333:1: ( ( rule__TextTypeStyle__MultilineAssignment_3 )? )
            {
            // InternalQLS.g:3333:1: ( ( rule__TextTypeStyle__MultilineAssignment_3 )? )
            // InternalQLS.g:3334:2: ( rule__TextTypeStyle__MultilineAssignment_3 )?
            {
             before(grammarAccess.getTextTypeStyleAccess().getMultilineAssignment_3()); 
            // InternalQLS.g:3335:2: ( rule__TextTypeStyle__MultilineAssignment_3 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==86) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalQLS.g:3335:3: rule__TextTypeStyle__MultilineAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextTypeStyle__MultilineAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextTypeStyleAccess().getMultilineAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextTypeStyle__Group__3__Impl"


    // $ANTLR start "rule__TextTypeStyle__Group__4"
    // InternalQLS.g:3343:1: rule__TextTypeStyle__Group__4 : rule__TextTypeStyle__Group__4__Impl ;
    public final void rule__TextTypeStyle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3347:1: ( rule__TextTypeStyle__Group__4__Impl )
            // InternalQLS.g:3348:2: rule__TextTypeStyle__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextTypeStyle__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextTypeStyle__Group__4"


    // $ANTLR start "rule__TextTypeStyle__Group__4__Impl"
    // InternalQLS.g:3354:1: rule__TextTypeStyle__Group__4__Impl : ( '}' ) ;
    public final void rule__TextTypeStyle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3358:1: ( ( '}' ) )
            // InternalQLS.g:3359:1: ( '}' )
            {
            // InternalQLS.g:3359:1: ( '}' )
            // InternalQLS.g:3360:2: '}'
            {
             before(grammarAccess.getTextTypeStyleAccess().getRightCurlyBracketKeyword_4()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getTextTypeStyleAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextTypeStyle__Group__4__Impl"


    // $ANTLR start "rule__UnaryExpression__Group__0"
    // InternalQLS.g:3370:1: rule__UnaryExpression__Group__0 : rule__UnaryExpression__Group__0__Impl rule__UnaryExpression__Group__1 ;
    public final void rule__UnaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3374:1: ( rule__UnaryExpression__Group__0__Impl rule__UnaryExpression__Group__1 )
            // InternalQLS.g:3375:2: rule__UnaryExpression__Group__0__Impl rule__UnaryExpression__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__UnaryExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group__0"


    // $ANTLR start "rule__UnaryExpression__Group__0__Impl"
    // InternalQLS.g:3382:1: rule__UnaryExpression__Group__0__Impl : ( () ) ;
    public final void rule__UnaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3386:1: ( ( () ) )
            // InternalQLS.g:3387:1: ( () )
            {
            // InternalQLS.g:3387:1: ( () )
            // InternalQLS.g:3388:2: ()
            {
             before(grammarAccess.getUnaryExpressionAccess().getBasicUnaryExpressionAction_0()); 
            // InternalQLS.g:3389:2: ()
            // InternalQLS.g:3389:3: 
            {
            }

             after(grammarAccess.getUnaryExpressionAccess().getBasicUnaryExpressionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group__0__Impl"


    // $ANTLR start "rule__UnaryExpression__Group__1"
    // InternalQLS.g:3397:1: rule__UnaryExpression__Group__1 : rule__UnaryExpression__Group__1__Impl rule__UnaryExpression__Group__2 ;
    public final void rule__UnaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3401:1: ( rule__UnaryExpression__Group__1__Impl rule__UnaryExpression__Group__2 )
            // InternalQLS.g:3402:2: rule__UnaryExpression__Group__1__Impl rule__UnaryExpression__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__UnaryExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group__1"


    // $ANTLR start "rule__UnaryExpression__Group__1__Impl"
    // InternalQLS.g:3409:1: rule__UnaryExpression__Group__1__Impl : ( ( rule__UnaryExpression__OperatorAssignment_1 ) ) ;
    public final void rule__UnaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3413:1: ( ( ( rule__UnaryExpression__OperatorAssignment_1 ) ) )
            // InternalQLS.g:3414:1: ( ( rule__UnaryExpression__OperatorAssignment_1 ) )
            {
            // InternalQLS.g:3414:1: ( ( rule__UnaryExpression__OperatorAssignment_1 ) )
            // InternalQLS.g:3415:2: ( rule__UnaryExpression__OperatorAssignment_1 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getOperatorAssignment_1()); 
            // InternalQLS.g:3416:2: ( rule__UnaryExpression__OperatorAssignment_1 )
            // InternalQLS.g:3416:3: rule__UnaryExpression__OperatorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__OperatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnaryExpressionAccess().getOperatorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group__1__Impl"


    // $ANTLR start "rule__UnaryExpression__Group__2"
    // InternalQLS.g:3424:1: rule__UnaryExpression__Group__2 : rule__UnaryExpression__Group__2__Impl ;
    public final void rule__UnaryExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3428:1: ( rule__UnaryExpression__Group__2__Impl )
            // InternalQLS.g:3429:2: rule__UnaryExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group__2"


    // $ANTLR start "rule__UnaryExpression__Group__2__Impl"
    // InternalQLS.g:3435:1: rule__UnaryExpression__Group__2__Impl : ( ( rule__UnaryExpression__OperandAssignment_2 ) ) ;
    public final void rule__UnaryExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3439:1: ( ( ( rule__UnaryExpression__OperandAssignment_2 ) ) )
            // InternalQLS.g:3440:1: ( ( rule__UnaryExpression__OperandAssignment_2 ) )
            {
            // InternalQLS.g:3440:1: ( ( rule__UnaryExpression__OperandAssignment_2 ) )
            // InternalQLS.g:3441:2: ( rule__UnaryExpression__OperandAssignment_2 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getOperandAssignment_2()); 
            // InternalQLS.g:3442:2: ( rule__UnaryExpression__OperandAssignment_2 )
            // InternalQLS.g:3442:3: rule__UnaryExpression__OperandAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__OperandAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUnaryExpressionAccess().getOperandAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__0"
    // InternalQLS.g:3451:1: rule__PrimaryExpression__Group_2__0 : rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 ;
    public final void rule__PrimaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3455:1: ( rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 )
            // InternalQLS.g:3456:2: rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1
            {
            pushFollow(FOLLOW_24);
            rule__PrimaryExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__0"


    // $ANTLR start "rule__PrimaryExpression__Group_2__0__Impl"
    // InternalQLS.g:3463:1: rule__PrimaryExpression__Group_2__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3467:1: ( ( '(' ) )
            // InternalQLS.g:3468:1: ( '(' )
            {
            // InternalQLS.g:3468:1: ( '(' )
            // InternalQLS.g:3469:2: '('
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__1"
    // InternalQLS.g:3478:1: rule__PrimaryExpression__Group_2__1 : rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2 ;
    public final void rule__PrimaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3482:1: ( rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2 )
            // InternalQLS.g:3483:2: rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2
            {
            pushFollow(FOLLOW_25);
            rule__PrimaryExpression__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__1"


    // $ANTLR start "rule__PrimaryExpression__Group_2__1__Impl"
    // InternalQLS.g:3490:1: rule__PrimaryExpression__Group_2__1__Impl : ( ( rule__PrimaryExpression__Alternatives_2_1 ) ) ;
    public final void rule__PrimaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3494:1: ( ( ( rule__PrimaryExpression__Alternatives_2_1 ) ) )
            // InternalQLS.g:3495:1: ( ( rule__PrimaryExpression__Alternatives_2_1 ) )
            {
            // InternalQLS.g:3495:1: ( ( rule__PrimaryExpression__Alternatives_2_1 ) )
            // InternalQLS.g:3496:2: ( rule__PrimaryExpression__Alternatives_2_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives_2_1()); 
            // InternalQLS.g:3497:2: ( rule__PrimaryExpression__Alternatives_2_1 )
            // InternalQLS.g:3497:3: rule__PrimaryExpression__Alternatives_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Alternatives_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getAlternatives_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__2"
    // InternalQLS.g:3505:1: rule__PrimaryExpression__Group_2__2 : rule__PrimaryExpression__Group_2__2__Impl ;
    public final void rule__PrimaryExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3509:1: ( rule__PrimaryExpression__Group_2__2__Impl )
            // InternalQLS.g:3510:2: rule__PrimaryExpression__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__2"


    // $ANTLR start "rule__PrimaryExpression__Group_2__2__Impl"
    // InternalQLS.g:3516:1: rule__PrimaryExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3520:1: ( ( ')' ) )
            // InternalQLS.g:3521:1: ( ')' )
            {
            // InternalQLS.g:3521:1: ( ')' )
            // InternalQLS.g:3522:2: ')'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_2()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__2__Impl"


    // $ANTLR start "rule__IfExpression__Group__0"
    // InternalQLS.g:3532:1: rule__IfExpression__Group__0 : rule__IfExpression__Group__0__Impl rule__IfExpression__Group__1 ;
    public final void rule__IfExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3536:1: ( rule__IfExpression__Group__0__Impl rule__IfExpression__Group__1 )
            // InternalQLS.g:3537:2: rule__IfExpression__Group__0__Impl rule__IfExpression__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__IfExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group__0"


    // $ANTLR start "rule__IfExpression__Group__0__Impl"
    // InternalQLS.g:3544:1: rule__IfExpression__Group__0__Impl : ( () ) ;
    public final void rule__IfExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3548:1: ( ( () ) )
            // InternalQLS.g:3549:1: ( () )
            {
            // InternalQLS.g:3549:1: ( () )
            // InternalQLS.g:3550:2: ()
            {
             before(grammarAccess.getIfExpressionAccess().getIfExpressionAction_0()); 
            // InternalQLS.g:3551:2: ()
            // InternalQLS.g:3551:3: 
            {
            }

             after(grammarAccess.getIfExpressionAccess().getIfExpressionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group__0__Impl"


    // $ANTLR start "rule__IfExpression__Group__1"
    // InternalQLS.g:3559:1: rule__IfExpression__Group__1 : rule__IfExpression__Group__1__Impl rule__IfExpression__Group__2 ;
    public final void rule__IfExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3563:1: ( rule__IfExpression__Group__1__Impl rule__IfExpression__Group__2 )
            // InternalQLS.g:3564:2: rule__IfExpression__Group__1__Impl rule__IfExpression__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__IfExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group__1"


    // $ANTLR start "rule__IfExpression__Group__1__Impl"
    // InternalQLS.g:3571:1: rule__IfExpression__Group__1__Impl : ( 'if' ) ;
    public final void rule__IfExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3575:1: ( ( 'if' ) )
            // InternalQLS.g:3576:1: ( 'if' )
            {
            // InternalQLS.g:3576:1: ( 'if' )
            // InternalQLS.g:3577:2: 'if'
            {
             before(grammarAccess.getIfExpressionAccess().getIfKeyword_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getIfExpressionAccess().getIfKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group__1__Impl"


    // $ANTLR start "rule__IfExpression__Group__2"
    // InternalQLS.g:3586:1: rule__IfExpression__Group__2 : rule__IfExpression__Group__2__Impl rule__IfExpression__Group__3 ;
    public final void rule__IfExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3590:1: ( rule__IfExpression__Group__2__Impl rule__IfExpression__Group__3 )
            // InternalQLS.g:3591:2: rule__IfExpression__Group__2__Impl rule__IfExpression__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__IfExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group__2"


    // $ANTLR start "rule__IfExpression__Group__2__Impl"
    // InternalQLS.g:3598:1: rule__IfExpression__Group__2__Impl : ( ( rule__IfExpression__ConditionAssignment_2 ) ) ;
    public final void rule__IfExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3602:1: ( ( ( rule__IfExpression__ConditionAssignment_2 ) ) )
            // InternalQLS.g:3603:1: ( ( rule__IfExpression__ConditionAssignment_2 ) )
            {
            // InternalQLS.g:3603:1: ( ( rule__IfExpression__ConditionAssignment_2 ) )
            // InternalQLS.g:3604:2: ( rule__IfExpression__ConditionAssignment_2 )
            {
             before(grammarAccess.getIfExpressionAccess().getConditionAssignment_2()); 
            // InternalQLS.g:3605:2: ( rule__IfExpression__ConditionAssignment_2 )
            // InternalQLS.g:3605:3: rule__IfExpression__ConditionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IfExpression__ConditionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIfExpressionAccess().getConditionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group__2__Impl"


    // $ANTLR start "rule__IfExpression__Group__3"
    // InternalQLS.g:3613:1: rule__IfExpression__Group__3 : rule__IfExpression__Group__3__Impl rule__IfExpression__Group__4 ;
    public final void rule__IfExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3617:1: ( rule__IfExpression__Group__3__Impl rule__IfExpression__Group__4 )
            // InternalQLS.g:3618:2: rule__IfExpression__Group__3__Impl rule__IfExpression__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__IfExpression__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfExpression__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group__3"


    // $ANTLR start "rule__IfExpression__Group__3__Impl"
    // InternalQLS.g:3625:1: rule__IfExpression__Group__3__Impl : ( 'then' ) ;
    public final void rule__IfExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3629:1: ( ( 'then' ) )
            // InternalQLS.g:3630:1: ( 'then' )
            {
            // InternalQLS.g:3630:1: ( 'then' )
            // InternalQLS.g:3631:2: 'then'
            {
             before(grammarAccess.getIfExpressionAccess().getThenKeyword_3()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getIfExpressionAccess().getThenKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group__3__Impl"


    // $ANTLR start "rule__IfExpression__Group__4"
    // InternalQLS.g:3640:1: rule__IfExpression__Group__4 : rule__IfExpression__Group__4__Impl rule__IfExpression__Group__5 ;
    public final void rule__IfExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3644:1: ( rule__IfExpression__Group__4__Impl rule__IfExpression__Group__5 )
            // InternalQLS.g:3645:2: rule__IfExpression__Group__4__Impl rule__IfExpression__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__IfExpression__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfExpression__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group__4"


    // $ANTLR start "rule__IfExpression__Group__4__Impl"
    // InternalQLS.g:3652:1: rule__IfExpression__Group__4__Impl : ( ( rule__IfExpression__ThenExpressionAssignment_4 ) ) ;
    public final void rule__IfExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3656:1: ( ( ( rule__IfExpression__ThenExpressionAssignment_4 ) ) )
            // InternalQLS.g:3657:1: ( ( rule__IfExpression__ThenExpressionAssignment_4 ) )
            {
            // InternalQLS.g:3657:1: ( ( rule__IfExpression__ThenExpressionAssignment_4 ) )
            // InternalQLS.g:3658:2: ( rule__IfExpression__ThenExpressionAssignment_4 )
            {
             before(grammarAccess.getIfExpressionAccess().getThenExpressionAssignment_4()); 
            // InternalQLS.g:3659:2: ( rule__IfExpression__ThenExpressionAssignment_4 )
            // InternalQLS.g:3659:3: rule__IfExpression__ThenExpressionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__IfExpression__ThenExpressionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIfExpressionAccess().getThenExpressionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group__4__Impl"


    // $ANTLR start "rule__IfExpression__Group__5"
    // InternalQLS.g:3667:1: rule__IfExpression__Group__5 : rule__IfExpression__Group__5__Impl rule__IfExpression__Group__6 ;
    public final void rule__IfExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3671:1: ( rule__IfExpression__Group__5__Impl rule__IfExpression__Group__6 )
            // InternalQLS.g:3672:2: rule__IfExpression__Group__5__Impl rule__IfExpression__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__IfExpression__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfExpression__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group__5"


    // $ANTLR start "rule__IfExpression__Group__5__Impl"
    // InternalQLS.g:3679:1: rule__IfExpression__Group__5__Impl : ( ( rule__IfExpression__Group_5__0 )? ) ;
    public final void rule__IfExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3683:1: ( ( ( rule__IfExpression__Group_5__0 )? ) )
            // InternalQLS.g:3684:1: ( ( rule__IfExpression__Group_5__0 )? )
            {
            // InternalQLS.g:3684:1: ( ( rule__IfExpression__Group_5__0 )? )
            // InternalQLS.g:3685:2: ( rule__IfExpression__Group_5__0 )?
            {
             before(grammarAccess.getIfExpressionAccess().getGroup_5()); 
            // InternalQLS.g:3686:2: ( rule__IfExpression__Group_5__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==62) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalQLS.g:3686:3: rule__IfExpression__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IfExpression__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIfExpressionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group__5__Impl"


    // $ANTLR start "rule__IfExpression__Group__6"
    // InternalQLS.g:3694:1: rule__IfExpression__Group__6 : rule__IfExpression__Group__6__Impl ;
    public final void rule__IfExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3698:1: ( rule__IfExpression__Group__6__Impl )
            // InternalQLS.g:3699:2: rule__IfExpression__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfExpression__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group__6"


    // $ANTLR start "rule__IfExpression__Group__6__Impl"
    // InternalQLS.g:3705:1: rule__IfExpression__Group__6__Impl : ( 'endif' ) ;
    public final void rule__IfExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3709:1: ( ( 'endif' ) )
            // InternalQLS.g:3710:1: ( 'endif' )
            {
            // InternalQLS.g:3710:1: ( 'endif' )
            // InternalQLS.g:3711:2: 'endif'
            {
             before(grammarAccess.getIfExpressionAccess().getEndifKeyword_6()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getIfExpressionAccess().getEndifKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group__6__Impl"


    // $ANTLR start "rule__IfExpression__Group_5__0"
    // InternalQLS.g:3721:1: rule__IfExpression__Group_5__0 : rule__IfExpression__Group_5__0__Impl rule__IfExpression__Group_5__1 ;
    public final void rule__IfExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3725:1: ( rule__IfExpression__Group_5__0__Impl rule__IfExpression__Group_5__1 )
            // InternalQLS.g:3726:2: rule__IfExpression__Group_5__0__Impl rule__IfExpression__Group_5__1
            {
            pushFollow(FOLLOW_24);
            rule__IfExpression__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfExpression__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group_5__0"


    // $ANTLR start "rule__IfExpression__Group_5__0__Impl"
    // InternalQLS.g:3733:1: rule__IfExpression__Group_5__0__Impl : ( 'else' ) ;
    public final void rule__IfExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3737:1: ( ( 'else' ) )
            // InternalQLS.g:3738:1: ( 'else' )
            {
            // InternalQLS.g:3738:1: ( 'else' )
            // InternalQLS.g:3739:2: 'else'
            {
             before(grammarAccess.getIfExpressionAccess().getElseKeyword_5_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getIfExpressionAccess().getElseKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group_5__0__Impl"


    // $ANTLR start "rule__IfExpression__Group_5__1"
    // InternalQLS.g:3748:1: rule__IfExpression__Group_5__1 : rule__IfExpression__Group_5__1__Impl ;
    public final void rule__IfExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3752:1: ( rule__IfExpression__Group_5__1__Impl )
            // InternalQLS.g:3753:2: rule__IfExpression__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfExpression__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group_5__1"


    // $ANTLR start "rule__IfExpression__Group_5__1__Impl"
    // InternalQLS.g:3759:1: rule__IfExpression__Group_5__1__Impl : ( ( rule__IfExpression__ElseExpressionAssignment_5_1 ) ) ;
    public final void rule__IfExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3763:1: ( ( ( rule__IfExpression__ElseExpressionAssignment_5_1 ) ) )
            // InternalQLS.g:3764:1: ( ( rule__IfExpression__ElseExpressionAssignment_5_1 ) )
            {
            // InternalQLS.g:3764:1: ( ( rule__IfExpression__ElseExpressionAssignment_5_1 ) )
            // InternalQLS.g:3765:2: ( rule__IfExpression__ElseExpressionAssignment_5_1 )
            {
             before(grammarAccess.getIfExpressionAccess().getElseExpressionAssignment_5_1()); 
            // InternalQLS.g:3766:2: ( rule__IfExpression__ElseExpressionAssignment_5_1 )
            // InternalQLS.g:3766:3: rule__IfExpression__ElseExpressionAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__IfExpression__ElseExpressionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getIfExpressionAccess().getElseExpressionAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group_5__1__Impl"


    // $ANTLR start "rule__OrExpression__Group__0"
    // InternalQLS.g:3775:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3779:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // InternalQLS.g:3780:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__OrExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__0"


    // $ANTLR start "rule__OrExpression__Group__0__Impl"
    // InternalQLS.g:3787:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3791:1: ( ( ruleAndExpression ) )
            // InternalQLS.g:3792:1: ( ruleAndExpression )
            {
            // InternalQLS.g:3792:1: ( ruleAndExpression )
            // InternalQLS.g:3793:2: ruleAndExpression
            {
             before(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__0__Impl"


    // $ANTLR start "rule__OrExpression__Group__1"
    // InternalQLS.g:3802:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3806:1: ( rule__OrExpression__Group__1__Impl )
            // InternalQLS.g:3807:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__1"


    // $ANTLR start "rule__OrExpression__Group__1__Impl"
    // InternalQLS.g:3813:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3817:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // InternalQLS.g:3818:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // InternalQLS.g:3818:1: ( ( rule__OrExpression__Group_1__0 )* )
            // InternalQLS.g:3819:2: ( rule__OrExpression__Group_1__0 )*
            {
             before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            // InternalQLS.g:3820:2: ( rule__OrExpression__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==14) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalQLS.g:3820:3: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getOrExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__0"
    // InternalQLS.g:3829:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3833:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // InternalQLS.g:3834:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FOLLOW_29);
            rule__OrExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__0"


    // $ANTLR start "rule__OrExpression__Group_1__0__Impl"
    // InternalQLS.g:3841:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3845:1: ( ( () ) )
            // InternalQLS.g:3846:1: ( () )
            {
            // InternalQLS.g:3846:1: ( () )
            // InternalQLS.g:3847:2: ()
            {
             before(grammarAccess.getOrExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0()); 
            // InternalQLS.g:3848:2: ()
            // InternalQLS.g:3848:3: 
            {
            }

             after(grammarAccess.getOrExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__0__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__1"
    // InternalQLS.g:3856:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3860:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // InternalQLS.g:3861:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
            {
            pushFollow(FOLLOW_31);
            rule__OrExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__1"


    // $ANTLR start "rule__OrExpression__Group_1__1__Impl"
    // InternalQLS.g:3868:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3872:1: ( ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) )
            // InternalQLS.g:3873:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            {
            // InternalQLS.g:3873:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            // InternalQLS.g:3874:2: ( rule__OrExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalQLS.g:3875:2: ( rule__OrExpression__OperatorAssignment_1_1 )
            // InternalQLS.g:3875:3: rule__OrExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__2"
    // InternalQLS.g:3883:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3887:1: ( rule__OrExpression__Group_1__2__Impl )
            // InternalQLS.g:3888:2: rule__OrExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__2"


    // $ANTLR start "rule__OrExpression__Group_1__2__Impl"
    // InternalQLS.g:3894:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__RhsOperandAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3898:1: ( ( ( rule__OrExpression__RhsOperandAssignment_1_2 ) ) )
            // InternalQLS.g:3899:1: ( ( rule__OrExpression__RhsOperandAssignment_1_2 ) )
            {
            // InternalQLS.g:3899:1: ( ( rule__OrExpression__RhsOperandAssignment_1_2 ) )
            // InternalQLS.g:3900:2: ( rule__OrExpression__RhsOperandAssignment_1_2 )
            {
             before(grammarAccess.getOrExpressionAccess().getRhsOperandAssignment_1_2()); 
            // InternalQLS.g:3901:2: ( rule__OrExpression__RhsOperandAssignment_1_2 )
            // InternalQLS.g:3901:3: rule__OrExpression__RhsOperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__RhsOperandAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getRhsOperandAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__2__Impl"


    // $ANTLR start "rule__AndExpression__Group__0"
    // InternalQLS.g:3910:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3914:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalQLS.g:3915:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__0"


    // $ANTLR start "rule__AndExpression__Group__0__Impl"
    // InternalQLS.g:3922:1: rule__AndExpression__Group__0__Impl : ( ruleEqualExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3926:1: ( ( ruleEqualExpression ) )
            // InternalQLS.g:3927:1: ( ruleEqualExpression )
            {
            // InternalQLS.g:3927:1: ( ruleEqualExpression )
            // InternalQLS.g:3928:2: ruleEqualExpression
            {
             before(grammarAccess.getAndExpressionAccess().getEqualExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEqualExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getEqualExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__0__Impl"


    // $ANTLR start "rule__AndExpression__Group__1"
    // InternalQLS.g:3937:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3941:1: ( rule__AndExpression__Group__1__Impl )
            // InternalQLS.g:3942:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__1"


    // $ANTLR start "rule__AndExpression__Group__1__Impl"
    // InternalQLS.g:3948:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3952:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalQLS.g:3953:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalQLS.g:3953:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalQLS.g:3954:2: ( rule__AndExpression__Group_1__0 )*
            {
             before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            // InternalQLS.g:3955:2: ( rule__AndExpression__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==13) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalQLS.g:3955:3: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getAndExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__0"
    // InternalQLS.g:3964:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3968:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalQLS.g:3969:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_32);
            rule__AndExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0"


    // $ANTLR start "rule__AndExpression__Group_1__0__Impl"
    // InternalQLS.g:3976:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3980:1: ( ( () ) )
            // InternalQLS.g:3981:1: ( () )
            {
            // InternalQLS.g:3981:1: ( () )
            // InternalQLS.g:3982:2: ()
            {
             before(grammarAccess.getAndExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0()); 
            // InternalQLS.g:3983:2: ()
            // InternalQLS.g:3983:3: 
            {
            }

             after(grammarAccess.getAndExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__1"
    // InternalQLS.g:3991:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3995:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // InternalQLS.g:3996:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FOLLOW_31);
            rule__AndExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__1"


    // $ANTLR start "rule__AndExpression__Group_1__1__Impl"
    // InternalQLS.g:4003:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4007:1: ( ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) )
            // InternalQLS.g:4008:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            {
            // InternalQLS.g:4008:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            // InternalQLS.g:4009:2: ( rule__AndExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalQLS.g:4010:2: ( rule__AndExpression__OperatorAssignment_1_1 )
            // InternalQLS.g:4010:3: rule__AndExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__2"
    // InternalQLS.g:4018:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4022:1: ( rule__AndExpression__Group_1__2__Impl )
            // InternalQLS.g:4023:2: rule__AndExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__2"


    // $ANTLR start "rule__AndExpression__Group_1__2__Impl"
    // InternalQLS.g:4029:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__RhsOperandAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4033:1: ( ( ( rule__AndExpression__RhsOperandAssignment_1_2 ) ) )
            // InternalQLS.g:4034:1: ( ( rule__AndExpression__RhsOperandAssignment_1_2 ) )
            {
            // InternalQLS.g:4034:1: ( ( rule__AndExpression__RhsOperandAssignment_1_2 ) )
            // InternalQLS.g:4035:2: ( rule__AndExpression__RhsOperandAssignment_1_2 )
            {
             before(grammarAccess.getAndExpressionAccess().getRhsOperandAssignment_1_2()); 
            // InternalQLS.g:4036:2: ( rule__AndExpression__RhsOperandAssignment_1_2 )
            // InternalQLS.g:4036:3: rule__AndExpression__RhsOperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__RhsOperandAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getRhsOperandAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__2__Impl"


    // $ANTLR start "rule__EqualExpression__Group__0"
    // InternalQLS.g:4045:1: rule__EqualExpression__Group__0 : rule__EqualExpression__Group__0__Impl rule__EqualExpression__Group__1 ;
    public final void rule__EqualExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4049:1: ( rule__EqualExpression__Group__0__Impl rule__EqualExpression__Group__1 )
            // InternalQLS.g:4050:2: rule__EqualExpression__Group__0__Impl rule__EqualExpression__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__EqualExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqualExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group__0"


    // $ANTLR start "rule__EqualExpression__Group__0__Impl"
    // InternalQLS.g:4057:1: rule__EqualExpression__Group__0__Impl : ( ruleComparisionExpression ) ;
    public final void rule__EqualExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4061:1: ( ( ruleComparisionExpression ) )
            // InternalQLS.g:4062:1: ( ruleComparisionExpression )
            {
            // InternalQLS.g:4062:1: ( ruleComparisionExpression )
            // InternalQLS.g:4063:2: ruleComparisionExpression
            {
             before(grammarAccess.getEqualExpressionAccess().getComparisionExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleComparisionExpression();

            state._fsp--;

             after(grammarAccess.getEqualExpressionAccess().getComparisionExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group__0__Impl"


    // $ANTLR start "rule__EqualExpression__Group__1"
    // InternalQLS.g:4072:1: rule__EqualExpression__Group__1 : rule__EqualExpression__Group__1__Impl ;
    public final void rule__EqualExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4076:1: ( rule__EqualExpression__Group__1__Impl )
            // InternalQLS.g:4077:2: rule__EqualExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EqualExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group__1"


    // $ANTLR start "rule__EqualExpression__Group__1__Impl"
    // InternalQLS.g:4083:1: rule__EqualExpression__Group__1__Impl : ( ( rule__EqualExpression__Group_1__0 )* ) ;
    public final void rule__EqualExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4087:1: ( ( ( rule__EqualExpression__Group_1__0 )* ) )
            // InternalQLS.g:4088:1: ( ( rule__EqualExpression__Group_1__0 )* )
            {
            // InternalQLS.g:4088:1: ( ( rule__EqualExpression__Group_1__0 )* )
            // InternalQLS.g:4089:2: ( rule__EqualExpression__Group_1__0 )*
            {
             before(grammarAccess.getEqualExpressionAccess().getGroup_1()); 
            // InternalQLS.g:4090:2: ( rule__EqualExpression__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==12) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalQLS.g:4090:3: rule__EqualExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__EqualExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getEqualExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group__1__Impl"


    // $ANTLR start "rule__EqualExpression__Group_1__0"
    // InternalQLS.g:4099:1: rule__EqualExpression__Group_1__0 : rule__EqualExpression__Group_1__0__Impl rule__EqualExpression__Group_1__1 ;
    public final void rule__EqualExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4103:1: ( rule__EqualExpression__Group_1__0__Impl rule__EqualExpression__Group_1__1 )
            // InternalQLS.g:4104:2: rule__EqualExpression__Group_1__0__Impl rule__EqualExpression__Group_1__1
            {
            pushFollow(FOLLOW_34);
            rule__EqualExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqualExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group_1__0"


    // $ANTLR start "rule__EqualExpression__Group_1__0__Impl"
    // InternalQLS.g:4111:1: rule__EqualExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__EqualExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4115:1: ( ( () ) )
            // InternalQLS.g:4116:1: ( () )
            {
            // InternalQLS.g:4116:1: ( () )
            // InternalQLS.g:4117:2: ()
            {
             before(grammarAccess.getEqualExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0()); 
            // InternalQLS.g:4118:2: ()
            // InternalQLS.g:4118:3: 
            {
            }

             after(grammarAccess.getEqualExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group_1__0__Impl"


    // $ANTLR start "rule__EqualExpression__Group_1__1"
    // InternalQLS.g:4126:1: rule__EqualExpression__Group_1__1 : rule__EqualExpression__Group_1__1__Impl rule__EqualExpression__Group_1__2 ;
    public final void rule__EqualExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4130:1: ( rule__EqualExpression__Group_1__1__Impl rule__EqualExpression__Group_1__2 )
            // InternalQLS.g:4131:2: rule__EqualExpression__Group_1__1__Impl rule__EqualExpression__Group_1__2
            {
            pushFollow(FOLLOW_31);
            rule__EqualExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqualExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group_1__1"


    // $ANTLR start "rule__EqualExpression__Group_1__1__Impl"
    // InternalQLS.g:4138:1: rule__EqualExpression__Group_1__1__Impl : ( ( rule__EqualExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__EqualExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4142:1: ( ( ( rule__EqualExpression__OperatorAssignment_1_1 ) ) )
            // InternalQLS.g:4143:1: ( ( rule__EqualExpression__OperatorAssignment_1_1 ) )
            {
            // InternalQLS.g:4143:1: ( ( rule__EqualExpression__OperatorAssignment_1_1 ) )
            // InternalQLS.g:4144:2: ( rule__EqualExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getEqualExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalQLS.g:4145:2: ( rule__EqualExpression__OperatorAssignment_1_1 )
            // InternalQLS.g:4145:3: rule__EqualExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EqualExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEqualExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group_1__1__Impl"


    // $ANTLR start "rule__EqualExpression__Group_1__2"
    // InternalQLS.g:4153:1: rule__EqualExpression__Group_1__2 : rule__EqualExpression__Group_1__2__Impl ;
    public final void rule__EqualExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4157:1: ( rule__EqualExpression__Group_1__2__Impl )
            // InternalQLS.g:4158:2: rule__EqualExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EqualExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group_1__2"


    // $ANTLR start "rule__EqualExpression__Group_1__2__Impl"
    // InternalQLS.g:4164:1: rule__EqualExpression__Group_1__2__Impl : ( ( rule__EqualExpression__RhsOperandAssignment_1_2 ) ) ;
    public final void rule__EqualExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4168:1: ( ( ( rule__EqualExpression__RhsOperandAssignment_1_2 ) ) )
            // InternalQLS.g:4169:1: ( ( rule__EqualExpression__RhsOperandAssignment_1_2 ) )
            {
            // InternalQLS.g:4169:1: ( ( rule__EqualExpression__RhsOperandAssignment_1_2 ) )
            // InternalQLS.g:4170:2: ( rule__EqualExpression__RhsOperandAssignment_1_2 )
            {
             before(grammarAccess.getEqualExpressionAccess().getRhsOperandAssignment_1_2()); 
            // InternalQLS.g:4171:2: ( rule__EqualExpression__RhsOperandAssignment_1_2 )
            // InternalQLS.g:4171:3: rule__EqualExpression__RhsOperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__EqualExpression__RhsOperandAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEqualExpressionAccess().getRhsOperandAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group_1__2__Impl"


    // $ANTLR start "rule__ComparisionExpression__Group__0"
    // InternalQLS.g:4180:1: rule__ComparisionExpression__Group__0 : rule__ComparisionExpression__Group__0__Impl rule__ComparisionExpression__Group__1 ;
    public final void rule__ComparisionExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4184:1: ( rule__ComparisionExpression__Group__0__Impl rule__ComparisionExpression__Group__1 )
            // InternalQLS.g:4185:2: rule__ComparisionExpression__Group__0__Impl rule__ComparisionExpression__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__ComparisionExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisionExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisionExpression__Group__0"


    // $ANTLR start "rule__ComparisionExpression__Group__0__Impl"
    // InternalQLS.g:4192:1: rule__ComparisionExpression__Group__0__Impl : ( ruleAdditionExpression ) ;
    public final void rule__ComparisionExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4196:1: ( ( ruleAdditionExpression ) )
            // InternalQLS.g:4197:1: ( ruleAdditionExpression )
            {
            // InternalQLS.g:4197:1: ( ruleAdditionExpression )
            // InternalQLS.g:4198:2: ruleAdditionExpression
            {
             before(grammarAccess.getComparisionExpressionAccess().getAdditionExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAdditionExpression();

            state._fsp--;

             after(grammarAccess.getComparisionExpressionAccess().getAdditionExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisionExpression__Group__0__Impl"


    // $ANTLR start "rule__ComparisionExpression__Group__1"
    // InternalQLS.g:4207:1: rule__ComparisionExpression__Group__1 : rule__ComparisionExpression__Group__1__Impl ;
    public final void rule__ComparisionExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4211:1: ( rule__ComparisionExpression__Group__1__Impl )
            // InternalQLS.g:4212:2: rule__ComparisionExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparisionExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisionExpression__Group__1"


    // $ANTLR start "rule__ComparisionExpression__Group__1__Impl"
    // InternalQLS.g:4218:1: rule__ComparisionExpression__Group__1__Impl : ( ( rule__ComparisionExpression__Group_1__0 )* ) ;
    public final void rule__ComparisionExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4222:1: ( ( ( rule__ComparisionExpression__Group_1__0 )* ) )
            // InternalQLS.g:4223:1: ( ( rule__ComparisionExpression__Group_1__0 )* )
            {
            // InternalQLS.g:4223:1: ( ( rule__ComparisionExpression__Group_1__0 )* )
            // InternalQLS.g:4224:2: ( rule__ComparisionExpression__Group_1__0 )*
            {
             before(grammarAccess.getComparisionExpressionAccess().getGroup_1()); 
            // InternalQLS.g:4225:2: ( rule__ComparisionExpression__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=39 && LA33_0<=42)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalQLS.g:4225:3: rule__ComparisionExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__ComparisionExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getComparisionExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisionExpression__Group__1__Impl"


    // $ANTLR start "rule__ComparisionExpression__Group_1__0"
    // InternalQLS.g:4234:1: rule__ComparisionExpression__Group_1__0 : rule__ComparisionExpression__Group_1__0__Impl rule__ComparisionExpression__Group_1__1 ;
    public final void rule__ComparisionExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4238:1: ( rule__ComparisionExpression__Group_1__0__Impl rule__ComparisionExpression__Group_1__1 )
            // InternalQLS.g:4239:2: rule__ComparisionExpression__Group_1__0__Impl rule__ComparisionExpression__Group_1__1
            {
            pushFollow(FOLLOW_36);
            rule__ComparisionExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisionExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisionExpression__Group_1__0"


    // $ANTLR start "rule__ComparisionExpression__Group_1__0__Impl"
    // InternalQLS.g:4246:1: rule__ComparisionExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ComparisionExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4250:1: ( ( () ) )
            // InternalQLS.g:4251:1: ( () )
            {
            // InternalQLS.g:4251:1: ( () )
            // InternalQLS.g:4252:2: ()
            {
             before(grammarAccess.getComparisionExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0()); 
            // InternalQLS.g:4253:2: ()
            // InternalQLS.g:4253:3: 
            {
            }

             after(grammarAccess.getComparisionExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisionExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ComparisionExpression__Group_1__1"
    // InternalQLS.g:4261:1: rule__ComparisionExpression__Group_1__1 : rule__ComparisionExpression__Group_1__1__Impl rule__ComparisionExpression__Group_1__2 ;
    public final void rule__ComparisionExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4265:1: ( rule__ComparisionExpression__Group_1__1__Impl rule__ComparisionExpression__Group_1__2 )
            // InternalQLS.g:4266:2: rule__ComparisionExpression__Group_1__1__Impl rule__ComparisionExpression__Group_1__2
            {
            pushFollow(FOLLOW_31);
            rule__ComparisionExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisionExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisionExpression__Group_1__1"


    // $ANTLR start "rule__ComparisionExpression__Group_1__1__Impl"
    // InternalQLS.g:4273:1: rule__ComparisionExpression__Group_1__1__Impl : ( ( rule__ComparisionExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ComparisionExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4277:1: ( ( ( rule__ComparisionExpression__OperatorAssignment_1_1 ) ) )
            // InternalQLS.g:4278:1: ( ( rule__ComparisionExpression__OperatorAssignment_1_1 ) )
            {
            // InternalQLS.g:4278:1: ( ( rule__ComparisionExpression__OperatorAssignment_1_1 ) )
            // InternalQLS.g:4279:2: ( rule__ComparisionExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getComparisionExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalQLS.g:4280:2: ( rule__ComparisionExpression__OperatorAssignment_1_1 )
            // InternalQLS.g:4280:3: rule__ComparisionExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ComparisionExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisionExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisionExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ComparisionExpression__Group_1__2"
    // InternalQLS.g:4288:1: rule__ComparisionExpression__Group_1__2 : rule__ComparisionExpression__Group_1__2__Impl ;
    public final void rule__ComparisionExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4292:1: ( rule__ComparisionExpression__Group_1__2__Impl )
            // InternalQLS.g:4293:2: rule__ComparisionExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparisionExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisionExpression__Group_1__2"


    // $ANTLR start "rule__ComparisionExpression__Group_1__2__Impl"
    // InternalQLS.g:4299:1: rule__ComparisionExpression__Group_1__2__Impl : ( ( rule__ComparisionExpression__RhsOperandAssignment_1_2 ) ) ;
    public final void rule__ComparisionExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4303:1: ( ( ( rule__ComparisionExpression__RhsOperandAssignment_1_2 ) ) )
            // InternalQLS.g:4304:1: ( ( rule__ComparisionExpression__RhsOperandAssignment_1_2 ) )
            {
            // InternalQLS.g:4304:1: ( ( rule__ComparisionExpression__RhsOperandAssignment_1_2 ) )
            // InternalQLS.g:4305:2: ( rule__ComparisionExpression__RhsOperandAssignment_1_2 )
            {
             before(grammarAccess.getComparisionExpressionAccess().getRhsOperandAssignment_1_2()); 
            // InternalQLS.g:4306:2: ( rule__ComparisionExpression__RhsOperandAssignment_1_2 )
            // InternalQLS.g:4306:3: rule__ComparisionExpression__RhsOperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ComparisionExpression__RhsOperandAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getComparisionExpressionAccess().getRhsOperandAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisionExpression__Group_1__2__Impl"


    // $ANTLR start "rule__AdditionExpression__Group__0"
    // InternalQLS.g:4315:1: rule__AdditionExpression__Group__0 : rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1 ;
    public final void rule__AdditionExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4319:1: ( rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1 )
            // InternalQLS.g:4320:2: rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__AdditionExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditionExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group__0"


    // $ANTLR start "rule__AdditionExpression__Group__0__Impl"
    // InternalQLS.g:4327:1: rule__AdditionExpression__Group__0__Impl : ( ruleMultiplicationExpression ) ;
    public final void rule__AdditionExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4331:1: ( ( ruleMultiplicationExpression ) )
            // InternalQLS.g:4332:1: ( ruleMultiplicationExpression )
            {
            // InternalQLS.g:4332:1: ( ruleMultiplicationExpression )
            // InternalQLS.g:4333:2: ruleMultiplicationExpression
            {
             before(grammarAccess.getAdditionExpressionAccess().getMultiplicationExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicationExpression();

            state._fsp--;

             after(grammarAccess.getAdditionExpressionAccess().getMultiplicationExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group__0__Impl"


    // $ANTLR start "rule__AdditionExpression__Group__1"
    // InternalQLS.g:4342:1: rule__AdditionExpression__Group__1 : rule__AdditionExpression__Group__1__Impl ;
    public final void rule__AdditionExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4346:1: ( rule__AdditionExpression__Group__1__Impl )
            // InternalQLS.g:4347:2: rule__AdditionExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdditionExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group__1"


    // $ANTLR start "rule__AdditionExpression__Group__1__Impl"
    // InternalQLS.g:4353:1: rule__AdditionExpression__Group__1__Impl : ( ( rule__AdditionExpression__Group_1__0 )* ) ;
    public final void rule__AdditionExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4357:1: ( ( ( rule__AdditionExpression__Group_1__0 )* ) )
            // InternalQLS.g:4358:1: ( ( rule__AdditionExpression__Group_1__0 )* )
            {
            // InternalQLS.g:4358:1: ( ( rule__AdditionExpression__Group_1__0 )* )
            // InternalQLS.g:4359:2: ( rule__AdditionExpression__Group_1__0 )*
            {
             before(grammarAccess.getAdditionExpressionAccess().getGroup_1()); 
            // InternalQLS.g:4360:2: ( rule__AdditionExpression__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==34||LA34_0==36) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalQLS.g:4360:3: rule__AdditionExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__AdditionExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getAdditionExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group__1__Impl"


    // $ANTLR start "rule__AdditionExpression__Group_1__0"
    // InternalQLS.g:4369:1: rule__AdditionExpression__Group_1__0 : rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1 ;
    public final void rule__AdditionExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4373:1: ( rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1 )
            // InternalQLS.g:4374:2: rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1
            {
            pushFollow(FOLLOW_38);
            rule__AdditionExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditionExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group_1__0"


    // $ANTLR start "rule__AdditionExpression__Group_1__0__Impl"
    // InternalQLS.g:4381:1: rule__AdditionExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AdditionExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4385:1: ( ( () ) )
            // InternalQLS.g:4386:1: ( () )
            {
            // InternalQLS.g:4386:1: ( () )
            // InternalQLS.g:4387:2: ()
            {
             before(grammarAccess.getAdditionExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0()); 
            // InternalQLS.g:4388:2: ()
            // InternalQLS.g:4388:3: 
            {
            }

             after(grammarAccess.getAdditionExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AdditionExpression__Group_1__1"
    // InternalQLS.g:4396:1: rule__AdditionExpression__Group_1__1 : rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2 ;
    public final void rule__AdditionExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4400:1: ( rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2 )
            // InternalQLS.g:4401:2: rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2
            {
            pushFollow(FOLLOW_31);
            rule__AdditionExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditionExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group_1__1"


    // $ANTLR start "rule__AdditionExpression__Group_1__1__Impl"
    // InternalQLS.g:4408:1: rule__AdditionExpression__Group_1__1__Impl : ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AdditionExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4412:1: ( ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) ) )
            // InternalQLS.g:4413:1: ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) )
            {
            // InternalQLS.g:4413:1: ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) )
            // InternalQLS.g:4414:2: ( rule__AdditionExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditionExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalQLS.g:4415:2: ( rule__AdditionExpression__OperatorAssignment_1_1 )
            // InternalQLS.g:4415:3: rule__AdditionExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AdditionExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAdditionExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AdditionExpression__Group_1__2"
    // InternalQLS.g:4423:1: rule__AdditionExpression__Group_1__2 : rule__AdditionExpression__Group_1__2__Impl ;
    public final void rule__AdditionExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4427:1: ( rule__AdditionExpression__Group_1__2__Impl )
            // InternalQLS.g:4428:2: rule__AdditionExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdditionExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group_1__2"


    // $ANTLR start "rule__AdditionExpression__Group_1__2__Impl"
    // InternalQLS.g:4434:1: rule__AdditionExpression__Group_1__2__Impl : ( ( rule__AdditionExpression__RhsOperandAssignment_1_2 ) ) ;
    public final void rule__AdditionExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4438:1: ( ( ( rule__AdditionExpression__RhsOperandAssignment_1_2 ) ) )
            // InternalQLS.g:4439:1: ( ( rule__AdditionExpression__RhsOperandAssignment_1_2 ) )
            {
            // InternalQLS.g:4439:1: ( ( rule__AdditionExpression__RhsOperandAssignment_1_2 ) )
            // InternalQLS.g:4440:2: ( rule__AdditionExpression__RhsOperandAssignment_1_2 )
            {
             before(grammarAccess.getAdditionExpressionAccess().getRhsOperandAssignment_1_2()); 
            // InternalQLS.g:4441:2: ( rule__AdditionExpression__RhsOperandAssignment_1_2 )
            // InternalQLS.g:4441:3: rule__AdditionExpression__RhsOperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AdditionExpression__RhsOperandAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAdditionExpressionAccess().getRhsOperandAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group_1__2__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group__0"
    // InternalQLS.g:4450:1: rule__MultiplicationExpression__Group__0 : rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1 ;
    public final void rule__MultiplicationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4454:1: ( rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1 )
            // InternalQLS.g:4455:2: rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__MultiplicationExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicationExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group__0"


    // $ANTLR start "rule__MultiplicationExpression__Group__0__Impl"
    // InternalQLS.g:4462:1: rule__MultiplicationExpression__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__MultiplicationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4466:1: ( ( rulePrimaryExpression ) )
            // InternalQLS.g:4467:1: ( rulePrimaryExpression )
            {
            // InternalQLS.g:4467:1: ( rulePrimaryExpression )
            // InternalQLS.g:4468:2: rulePrimaryExpression
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group__0__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group__1"
    // InternalQLS.g:4477:1: rule__MultiplicationExpression__Group__1 : rule__MultiplicationExpression__Group__1__Impl ;
    public final void rule__MultiplicationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4481:1: ( rule__MultiplicationExpression__Group__1__Impl )
            // InternalQLS.g:4482:2: rule__MultiplicationExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group__1"


    // $ANTLR start "rule__MultiplicationExpression__Group__1__Impl"
    // InternalQLS.g:4488:1: rule__MultiplicationExpression__Group__1__Impl : ( ( rule__MultiplicationExpression__Group_1__0 )* ) ;
    public final void rule__MultiplicationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4492:1: ( ( ( rule__MultiplicationExpression__Group_1__0 )* ) )
            // InternalQLS.g:4493:1: ( ( rule__MultiplicationExpression__Group_1__0 )* )
            {
            // InternalQLS.g:4493:1: ( ( rule__MultiplicationExpression__Group_1__0 )* )
            // InternalQLS.g:4494:2: ( rule__MultiplicationExpression__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getGroup_1()); 
            // InternalQLS.g:4495:2: ( rule__MultiplicationExpression__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=37 && LA35_0<=38)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalQLS.g:4495:3: rule__MultiplicationExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__MultiplicationExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getMultiplicationExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group__1__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group_1__0"
    // InternalQLS.g:4504:1: rule__MultiplicationExpression__Group_1__0 : rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1 ;
    public final void rule__MultiplicationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4508:1: ( rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1 )
            // InternalQLS.g:4509:2: rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1
            {
            pushFollow(FOLLOW_40);
            rule__MultiplicationExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicationExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1__0"


    // $ANTLR start "rule__MultiplicationExpression__Group_1__0__Impl"
    // InternalQLS.g:4516:1: rule__MultiplicationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultiplicationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4520:1: ( ( () ) )
            // InternalQLS.g:4521:1: ( () )
            {
            // InternalQLS.g:4521:1: ( () )
            // InternalQLS.g:4522:2: ()
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0()); 
            // InternalQLS.g:4523:2: ()
            // InternalQLS.g:4523:3: 
            {
            }

             after(grammarAccess.getMultiplicationExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1__0__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group_1__1"
    // InternalQLS.g:4531:1: rule__MultiplicationExpression__Group_1__1 : rule__MultiplicationExpression__Group_1__1__Impl rule__MultiplicationExpression__Group_1__2 ;
    public final void rule__MultiplicationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4535:1: ( rule__MultiplicationExpression__Group_1__1__Impl rule__MultiplicationExpression__Group_1__2 )
            // InternalQLS.g:4536:2: rule__MultiplicationExpression__Group_1__1__Impl rule__MultiplicationExpression__Group_1__2
            {
            pushFollow(FOLLOW_24);
            rule__MultiplicationExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicationExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1__1"


    // $ANTLR start "rule__MultiplicationExpression__Group_1__1__Impl"
    // InternalQLS.g:4543:1: rule__MultiplicationExpression__Group_1__1__Impl : ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultiplicationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4547:1: ( ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) ) )
            // InternalQLS.g:4548:1: ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) )
            {
            // InternalQLS.g:4548:1: ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) )
            // InternalQLS.g:4549:2: ( rule__MultiplicationExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalQLS.g:4550:2: ( rule__MultiplicationExpression__OperatorAssignment_1_1 )
            // InternalQLS.g:4550:3: rule__MultiplicationExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1__1__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group_1__2"
    // InternalQLS.g:4558:1: rule__MultiplicationExpression__Group_1__2 : rule__MultiplicationExpression__Group_1__2__Impl ;
    public final void rule__MultiplicationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4562:1: ( rule__MultiplicationExpression__Group_1__2__Impl )
            // InternalQLS.g:4563:2: rule__MultiplicationExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1__2"


    // $ANTLR start "rule__MultiplicationExpression__Group_1__2__Impl"
    // InternalQLS.g:4569:1: rule__MultiplicationExpression__Group_1__2__Impl : ( ( rule__MultiplicationExpression__RhsOperandAssignment_1_2 ) ) ;
    public final void rule__MultiplicationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4573:1: ( ( ( rule__MultiplicationExpression__RhsOperandAssignment_1_2 ) ) )
            // InternalQLS.g:4574:1: ( ( rule__MultiplicationExpression__RhsOperandAssignment_1_2 ) )
            {
            // InternalQLS.g:4574:1: ( ( rule__MultiplicationExpression__RhsOperandAssignment_1_2 ) )
            // InternalQLS.g:4575:2: ( rule__MultiplicationExpression__RhsOperandAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getRhsOperandAssignment_1_2()); 
            // InternalQLS.g:4576:2: ( rule__MultiplicationExpression__RhsOperandAssignment_1_2 )
            // InternalQLS.g:4576:3: rule__MultiplicationExpression__RhsOperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationExpression__RhsOperandAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationExpressionAccess().getRhsOperandAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1__2__Impl"


    // $ANTLR start "rule__Form__Group__0"
    // InternalQLS.g:4585:1: rule__Form__Group__0 : rule__Form__Group__0__Impl rule__Form__Group__1 ;
    public final void rule__Form__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4589:1: ( rule__Form__Group__0__Impl rule__Form__Group__1 )
            // InternalQLS.g:4590:2: rule__Form__Group__0__Impl rule__Form__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Form__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__0"


    // $ANTLR start "rule__Form__Group__0__Impl"
    // InternalQLS.g:4597:1: rule__Form__Group__0__Impl : ( 'Form' ) ;
    public final void rule__Form__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4601:1: ( ( 'Form' ) )
            // InternalQLS.g:4602:1: ( 'Form' )
            {
            // InternalQLS.g:4602:1: ( 'Form' )
            // InternalQLS.g:4603:2: 'Form'
            {
             before(grammarAccess.getFormAccess().getFormKeyword_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getFormAccess().getFormKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__0__Impl"


    // $ANTLR start "rule__Form__Group__1"
    // InternalQLS.g:4612:1: rule__Form__Group__1 : rule__Form__Group__1__Impl rule__Form__Group__2 ;
    public final void rule__Form__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4616:1: ( rule__Form__Group__1__Impl rule__Form__Group__2 )
            // InternalQLS.g:4617:2: rule__Form__Group__1__Impl rule__Form__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__Form__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__1"


    // $ANTLR start "rule__Form__Group__1__Impl"
    // InternalQLS.g:4624:1: rule__Form__Group__1__Impl : ( ( rule__Form__NameAssignment_1 ) ) ;
    public final void rule__Form__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4628:1: ( ( ( rule__Form__NameAssignment_1 ) ) )
            // InternalQLS.g:4629:1: ( ( rule__Form__NameAssignment_1 ) )
            {
            // InternalQLS.g:4629:1: ( ( rule__Form__NameAssignment_1 ) )
            // InternalQLS.g:4630:2: ( rule__Form__NameAssignment_1 )
            {
             before(grammarAccess.getFormAccess().getNameAssignment_1()); 
            // InternalQLS.g:4631:2: ( rule__Form__NameAssignment_1 )
            // InternalQLS.g:4631:3: rule__Form__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Form__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFormAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__1__Impl"


    // $ANTLR start "rule__Form__Group__2"
    // InternalQLS.g:4639:1: rule__Form__Group__2 : rule__Form__Group__2__Impl ;
    public final void rule__Form__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4643:1: ( rule__Form__Group__2__Impl )
            // InternalQLS.g:4644:2: rule__Form__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Form__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__2"


    // $ANTLR start "rule__Form__Group__2__Impl"
    // InternalQLS.g:4650:1: rule__Form__Group__2__Impl : ( ( rule__Form__QuestionGroupAssignment_2 ) ) ;
    public final void rule__Form__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4654:1: ( ( ( rule__Form__QuestionGroupAssignment_2 ) ) )
            // InternalQLS.g:4655:1: ( ( rule__Form__QuestionGroupAssignment_2 ) )
            {
            // InternalQLS.g:4655:1: ( ( rule__Form__QuestionGroupAssignment_2 ) )
            // InternalQLS.g:4656:2: ( rule__Form__QuestionGroupAssignment_2 )
            {
             before(grammarAccess.getFormAccess().getQuestionGroupAssignment_2()); 
            // InternalQLS.g:4657:2: ( rule__Form__QuestionGroupAssignment_2 )
            // InternalQLS.g:4657:3: rule__Form__QuestionGroupAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Form__QuestionGroupAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFormAccess().getQuestionGroupAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__2__Impl"


    // $ANTLR start "rule__DefinitionGroup__Group__0"
    // InternalQLS.g:4666:1: rule__DefinitionGroup__Group__0 : rule__DefinitionGroup__Group__0__Impl rule__DefinitionGroup__Group__1 ;
    public final void rule__DefinitionGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4670:1: ( rule__DefinitionGroup__Group__0__Impl rule__DefinitionGroup__Group__1 )
            // InternalQLS.g:4671:2: rule__DefinitionGroup__Group__0__Impl rule__DefinitionGroup__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__DefinitionGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefinitionGroup__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__Group__0"


    // $ANTLR start "rule__DefinitionGroup__Group__0__Impl"
    // InternalQLS.g:4678:1: rule__DefinitionGroup__Group__0__Impl : ( () ) ;
    public final void rule__DefinitionGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4682:1: ( ( () ) )
            // InternalQLS.g:4683:1: ( () )
            {
            // InternalQLS.g:4683:1: ( () )
            // InternalQLS.g:4684:2: ()
            {
             before(grammarAccess.getDefinitionGroupAccess().getDefinitionGroupAction_0()); 
            // InternalQLS.g:4685:2: ()
            // InternalQLS.g:4685:3: 
            {
            }

             after(grammarAccess.getDefinitionGroupAccess().getDefinitionGroupAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__Group__0__Impl"


    // $ANTLR start "rule__DefinitionGroup__Group__1"
    // InternalQLS.g:4693:1: rule__DefinitionGroup__Group__1 : rule__DefinitionGroup__Group__1__Impl rule__DefinitionGroup__Group__2 ;
    public final void rule__DefinitionGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4697:1: ( rule__DefinitionGroup__Group__1__Impl rule__DefinitionGroup__Group__2 )
            // InternalQLS.g:4698:2: rule__DefinitionGroup__Group__1__Impl rule__DefinitionGroup__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DefinitionGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefinitionGroup__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__Group__1"


    // $ANTLR start "rule__DefinitionGroup__Group__1__Impl"
    // InternalQLS.g:4705:1: rule__DefinitionGroup__Group__1__Impl : ( 'definitions' ) ;
    public final void rule__DefinitionGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4709:1: ( ( 'definitions' ) )
            // InternalQLS.g:4710:1: ( 'definitions' )
            {
            // InternalQLS.g:4710:1: ( 'definitions' )
            // InternalQLS.g:4711:2: 'definitions'
            {
             before(grammarAccess.getDefinitionGroupAccess().getDefinitionsKeyword_1()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getDefinitionGroupAccess().getDefinitionsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__Group__1__Impl"


    // $ANTLR start "rule__DefinitionGroup__Group__2"
    // InternalQLS.g:4720:1: rule__DefinitionGroup__Group__2 : rule__DefinitionGroup__Group__2__Impl rule__DefinitionGroup__Group__3 ;
    public final void rule__DefinitionGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4724:1: ( rule__DefinitionGroup__Group__2__Impl rule__DefinitionGroup__Group__3 )
            // InternalQLS.g:4725:2: rule__DefinitionGroup__Group__2__Impl rule__DefinitionGroup__Group__3
            {
            pushFollow(FOLLOW_44);
            rule__DefinitionGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefinitionGroup__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__Group__2"


    // $ANTLR start "rule__DefinitionGroup__Group__2__Impl"
    // InternalQLS.g:4732:1: rule__DefinitionGroup__Group__2__Impl : ( '{' ) ;
    public final void rule__DefinitionGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4736:1: ( ( '{' ) )
            // InternalQLS.g:4737:1: ( '{' )
            {
            // InternalQLS.g:4737:1: ( '{' )
            // InternalQLS.g:4738:2: '{'
            {
             before(grammarAccess.getDefinitionGroupAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getDefinitionGroupAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__Group__2__Impl"


    // $ANTLR start "rule__DefinitionGroup__Group__3"
    // InternalQLS.g:4747:1: rule__DefinitionGroup__Group__3 : rule__DefinitionGroup__Group__3__Impl rule__DefinitionGroup__Group__4 ;
    public final void rule__DefinitionGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4751:1: ( rule__DefinitionGroup__Group__3__Impl rule__DefinitionGroup__Group__4 )
            // InternalQLS.g:4752:2: rule__DefinitionGroup__Group__3__Impl rule__DefinitionGroup__Group__4
            {
            pushFollow(FOLLOW_44);
            rule__DefinitionGroup__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefinitionGroup__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__Group__3"


    // $ANTLR start "rule__DefinitionGroup__Group__3__Impl"
    // InternalQLS.g:4759:1: rule__DefinitionGroup__Group__3__Impl : ( ( rule__DefinitionGroup__Alternatives_3 )* ) ;
    public final void rule__DefinitionGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4763:1: ( ( ( rule__DefinitionGroup__Alternatives_3 )* ) )
            // InternalQLS.g:4764:1: ( ( rule__DefinitionGroup__Alternatives_3 )* )
            {
            // InternalQLS.g:4764:1: ( ( rule__DefinitionGroup__Alternatives_3 )* )
            // InternalQLS.g:4765:2: ( rule__DefinitionGroup__Alternatives_3 )*
            {
             before(grammarAccess.getDefinitionGroupAccess().getAlternatives_3()); 
            // InternalQLS.g:4766:2: ( rule__DefinitionGroup__Alternatives_3 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==65||(LA36_0>=67 && LA36_0<=68)||(LA36_0>=71 && LA36_0<=73)||LA36_0==76||LA36_0==80||LA36_0==87) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalQLS.g:4766:3: rule__DefinitionGroup__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__DefinitionGroup__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getDefinitionGroupAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__Group__3__Impl"


    // $ANTLR start "rule__DefinitionGroup__Group__4"
    // InternalQLS.g:4774:1: rule__DefinitionGroup__Group__4 : rule__DefinitionGroup__Group__4__Impl ;
    public final void rule__DefinitionGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4778:1: ( rule__DefinitionGroup__Group__4__Impl )
            // InternalQLS.g:4779:2: rule__DefinitionGroup__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefinitionGroup__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__Group__4"


    // $ANTLR start "rule__DefinitionGroup__Group__4__Impl"
    // InternalQLS.g:4785:1: rule__DefinitionGroup__Group__4__Impl : ( '}' ) ;
    public final void rule__DefinitionGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4789:1: ( ( '}' ) )
            // InternalQLS.g:4790:1: ( '}' )
            {
            // InternalQLS.g:4790:1: ( '}' )
            // InternalQLS.g:4791:2: '}'
            {
             before(grammarAccess.getDefinitionGroupAccess().getRightCurlyBracketKeyword_4()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getDefinitionGroupAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__Group__4__Impl"


    // $ANTLR start "rule__QuestionGroup__Group__0"
    // InternalQLS.g:4801:1: rule__QuestionGroup__Group__0 : rule__QuestionGroup__Group__0__Impl rule__QuestionGroup__Group__1 ;
    public final void rule__QuestionGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4805:1: ( rule__QuestionGroup__Group__0__Impl rule__QuestionGroup__Group__1 )
            // InternalQLS.g:4806:2: rule__QuestionGroup__Group__0__Impl rule__QuestionGroup__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__QuestionGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group__0"


    // $ANTLR start "rule__QuestionGroup__Group__0__Impl"
    // InternalQLS.g:4813:1: rule__QuestionGroup__Group__0__Impl : ( () ) ;
    public final void rule__QuestionGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4817:1: ( ( () ) )
            // InternalQLS.g:4818:1: ( () )
            {
            // InternalQLS.g:4818:1: ( () )
            // InternalQLS.g:4819:2: ()
            {
             before(grammarAccess.getQuestionGroupAccess().getQuestionGroupAction_0()); 
            // InternalQLS.g:4820:2: ()
            // InternalQLS.g:4820:3: 
            {
            }

             after(grammarAccess.getQuestionGroupAccess().getQuestionGroupAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group__0__Impl"


    // $ANTLR start "rule__QuestionGroup__Group__1"
    // InternalQLS.g:4828:1: rule__QuestionGroup__Group__1 : rule__QuestionGroup__Group__1__Impl rule__QuestionGroup__Group__2 ;
    public final void rule__QuestionGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4832:1: ( rule__QuestionGroup__Group__1__Impl rule__QuestionGroup__Group__2 )
            // InternalQLS.g:4833:2: rule__QuestionGroup__Group__1__Impl rule__QuestionGroup__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__QuestionGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group__1"


    // $ANTLR start "rule__QuestionGroup__Group__1__Impl"
    // InternalQLS.g:4840:1: rule__QuestionGroup__Group__1__Impl : ( ( rule__QuestionGroup__Group_1__0 )? ) ;
    public final void rule__QuestionGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4844:1: ( ( ( rule__QuestionGroup__Group_1__0 )? ) )
            // InternalQLS.g:4845:1: ( ( rule__QuestionGroup__Group_1__0 )? )
            {
            // InternalQLS.g:4845:1: ( ( rule__QuestionGroup__Group_1__0 )? )
            // InternalQLS.g:4846:2: ( rule__QuestionGroup__Group_1__0 )?
            {
             before(grammarAccess.getQuestionGroupAccess().getGroup_1()); 
            // InternalQLS.g:4847:2: ( rule__QuestionGroup__Group_1__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==59) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalQLS.g:4847:3: rule__QuestionGroup__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionGroup__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionGroupAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group__1__Impl"


    // $ANTLR start "rule__QuestionGroup__Group__2"
    // InternalQLS.g:4855:1: rule__QuestionGroup__Group__2 : rule__QuestionGroup__Group__2__Impl rule__QuestionGroup__Group__3 ;
    public final void rule__QuestionGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4859:1: ( rule__QuestionGroup__Group__2__Impl rule__QuestionGroup__Group__3 )
            // InternalQLS.g:4860:2: rule__QuestionGroup__Group__2__Impl rule__QuestionGroup__Group__3
            {
            pushFollow(FOLLOW_46);
            rule__QuestionGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group__2"


    // $ANTLR start "rule__QuestionGroup__Group__2__Impl"
    // InternalQLS.g:4867:1: rule__QuestionGroup__Group__2__Impl : ( '{' ) ;
    public final void rule__QuestionGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4871:1: ( ( '{' ) )
            // InternalQLS.g:4872:1: ( '{' )
            {
            // InternalQLS.g:4872:1: ( '{' )
            // InternalQLS.g:4873:2: '{'
            {
             before(grammarAccess.getQuestionGroupAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getQuestionGroupAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group__2__Impl"


    // $ANTLR start "rule__QuestionGroup__Group__3"
    // InternalQLS.g:4882:1: rule__QuestionGroup__Group__3 : rule__QuestionGroup__Group__3__Impl rule__QuestionGroup__Group__4 ;
    public final void rule__QuestionGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4886:1: ( rule__QuestionGroup__Group__3__Impl rule__QuestionGroup__Group__4 )
            // InternalQLS.g:4887:2: rule__QuestionGroup__Group__3__Impl rule__QuestionGroup__Group__4
            {
            pushFollow(FOLLOW_46);
            rule__QuestionGroup__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group__3"


    // $ANTLR start "rule__QuestionGroup__Group__3__Impl"
    // InternalQLS.g:4894:1: rule__QuestionGroup__Group__3__Impl : ( ( rule__QuestionGroup__Alternatives_3 )* ) ;
    public final void rule__QuestionGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4898:1: ( ( ( rule__QuestionGroup__Alternatives_3 )* ) )
            // InternalQLS.g:4899:1: ( ( rule__QuestionGroup__Alternatives_3 )* )
            {
            // InternalQLS.g:4899:1: ( ( rule__QuestionGroup__Alternatives_3 )* )
            // InternalQLS.g:4900:2: ( rule__QuestionGroup__Alternatives_3 )*
            {
             before(grammarAccess.getQuestionGroupAccess().getAlternatives_3()); 
            // InternalQLS.g:4901:2: ( rule__QuestionGroup__Alternatives_3 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ID||LA38_0==44||LA38_0==59) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalQLS.g:4901:3: rule__QuestionGroup__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_47);
            	    rule__QuestionGroup__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getQuestionGroupAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group__3__Impl"


    // $ANTLR start "rule__QuestionGroup__Group__4"
    // InternalQLS.g:4909:1: rule__QuestionGroup__Group__4 : rule__QuestionGroup__Group__4__Impl ;
    public final void rule__QuestionGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4913:1: ( rule__QuestionGroup__Group__4__Impl )
            // InternalQLS.g:4914:2: rule__QuestionGroup__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group__4"


    // $ANTLR start "rule__QuestionGroup__Group__4__Impl"
    // InternalQLS.g:4920:1: rule__QuestionGroup__Group__4__Impl : ( '}' ) ;
    public final void rule__QuestionGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4924:1: ( ( '}' ) )
            // InternalQLS.g:4925:1: ( '}' )
            {
            // InternalQLS.g:4925:1: ( '}' )
            // InternalQLS.g:4926:2: '}'
            {
             before(grammarAccess.getQuestionGroupAccess().getRightCurlyBracketKeyword_4()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getQuestionGroupAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group__4__Impl"


    // $ANTLR start "rule__QuestionGroup__Group_1__0"
    // InternalQLS.g:4936:1: rule__QuestionGroup__Group_1__0 : rule__QuestionGroup__Group_1__0__Impl rule__QuestionGroup__Group_1__1 ;
    public final void rule__QuestionGroup__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4940:1: ( rule__QuestionGroup__Group_1__0__Impl rule__QuestionGroup__Group_1__1 )
            // InternalQLS.g:4941:2: rule__QuestionGroup__Group_1__0__Impl rule__QuestionGroup__Group_1__1
            {
            pushFollow(FOLLOW_24);
            rule__QuestionGroup__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_1__0"


    // $ANTLR start "rule__QuestionGroup__Group_1__0__Impl"
    // InternalQLS.g:4948:1: rule__QuestionGroup__Group_1__0__Impl : ( 'if' ) ;
    public final void rule__QuestionGroup__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4952:1: ( ( 'if' ) )
            // InternalQLS.g:4953:1: ( 'if' )
            {
            // InternalQLS.g:4953:1: ( 'if' )
            // InternalQLS.g:4954:2: 'if'
            {
             before(grammarAccess.getQuestionGroupAccess().getIfKeyword_1_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getQuestionGroupAccess().getIfKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_1__0__Impl"


    // $ANTLR start "rule__QuestionGroup__Group_1__1"
    // InternalQLS.g:4963:1: rule__QuestionGroup__Group_1__1 : rule__QuestionGroup__Group_1__1__Impl ;
    public final void rule__QuestionGroup__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4967:1: ( rule__QuestionGroup__Group_1__1__Impl )
            // InternalQLS.g:4968:2: rule__QuestionGroup__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_1__1"


    // $ANTLR start "rule__QuestionGroup__Group_1__1__Impl"
    // InternalQLS.g:4974:1: rule__QuestionGroup__Group_1__1__Impl : ( ( rule__QuestionGroup__GuardAssignment_1_1 ) ) ;
    public final void rule__QuestionGroup__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4978:1: ( ( ( rule__QuestionGroup__GuardAssignment_1_1 ) ) )
            // InternalQLS.g:4979:1: ( ( rule__QuestionGroup__GuardAssignment_1_1 ) )
            {
            // InternalQLS.g:4979:1: ( ( rule__QuestionGroup__GuardAssignment_1_1 ) )
            // InternalQLS.g:4980:2: ( rule__QuestionGroup__GuardAssignment_1_1 )
            {
             before(grammarAccess.getQuestionGroupAccess().getGuardAssignment_1_1()); 
            // InternalQLS.g:4981:2: ( rule__QuestionGroup__GuardAssignment_1_1 )
            // InternalQLS.g:4981:3: rule__QuestionGroup__GuardAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__QuestionGroup__GuardAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionGroupAccess().getGuardAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_1__1__Impl"


    // $ANTLR start "rule__ValueType_Impl__Group__0"
    // InternalQLS.g:4990:1: rule__ValueType_Impl__Group__0 : rule__ValueType_Impl__Group__0__Impl rule__ValueType_Impl__Group__1 ;
    public final void rule__ValueType_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4994:1: ( rule__ValueType_Impl__Group__0__Impl rule__ValueType_Impl__Group__1 )
            // InternalQLS.g:4995:2: rule__ValueType_Impl__Group__0__Impl rule__ValueType_Impl__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__ValueType_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueType_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType_Impl__Group__0"


    // $ANTLR start "rule__ValueType_Impl__Group__0__Impl"
    // InternalQLS.g:5002:1: rule__ValueType_Impl__Group__0__Impl : ( () ) ;
    public final void rule__ValueType_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5006:1: ( ( () ) )
            // InternalQLS.g:5007:1: ( () )
            {
            // InternalQLS.g:5007:1: ( () )
            // InternalQLS.g:5008:2: ()
            {
             before(grammarAccess.getValueType_ImplAccess().getValueTypeAction_0()); 
            // InternalQLS.g:5009:2: ()
            // InternalQLS.g:5009:3: 
            {
            }

             after(grammarAccess.getValueType_ImplAccess().getValueTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType_Impl__Group__0__Impl"


    // $ANTLR start "rule__ValueType_Impl__Group__1"
    // InternalQLS.g:5017:1: rule__ValueType_Impl__Group__1 : rule__ValueType_Impl__Group__1__Impl rule__ValueType_Impl__Group__2 ;
    public final void rule__ValueType_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5021:1: ( rule__ValueType_Impl__Group__1__Impl rule__ValueType_Impl__Group__2 )
            // InternalQLS.g:5022:2: rule__ValueType_Impl__Group__1__Impl rule__ValueType_Impl__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__ValueType_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueType_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType_Impl__Group__1"


    // $ANTLR start "rule__ValueType_Impl__Group__1__Impl"
    // InternalQLS.g:5029:1: rule__ValueType_Impl__Group__1__Impl : ( 'ValueType' ) ;
    public final void rule__ValueType_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5033:1: ( ( 'ValueType' ) )
            // InternalQLS.g:5034:1: ( 'ValueType' )
            {
            // InternalQLS.g:5034:1: ( 'ValueType' )
            // InternalQLS.g:5035:2: 'ValueType'
            {
             before(grammarAccess.getValueType_ImplAccess().getValueTypeKeyword_1()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getValueType_ImplAccess().getValueTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType_Impl__Group__1__Impl"


    // $ANTLR start "rule__ValueType_Impl__Group__2"
    // InternalQLS.g:5044:1: rule__ValueType_Impl__Group__2 : rule__ValueType_Impl__Group__2__Impl rule__ValueType_Impl__Group__3 ;
    public final void rule__ValueType_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5048:1: ( rule__ValueType_Impl__Group__2__Impl rule__ValueType_Impl__Group__3 )
            // InternalQLS.g:5049:2: rule__ValueType_Impl__Group__2__Impl rule__ValueType_Impl__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ValueType_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueType_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType_Impl__Group__2"


    // $ANTLR start "rule__ValueType_Impl__Group__2__Impl"
    // InternalQLS.g:5056:1: rule__ValueType_Impl__Group__2__Impl : ( ( rule__ValueType_Impl__NameAssignment_2 ) ) ;
    public final void rule__ValueType_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5060:1: ( ( ( rule__ValueType_Impl__NameAssignment_2 ) ) )
            // InternalQLS.g:5061:1: ( ( rule__ValueType_Impl__NameAssignment_2 ) )
            {
            // InternalQLS.g:5061:1: ( ( rule__ValueType_Impl__NameAssignment_2 ) )
            // InternalQLS.g:5062:2: ( rule__ValueType_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getValueType_ImplAccess().getNameAssignment_2()); 
            // InternalQLS.g:5063:2: ( rule__ValueType_Impl__NameAssignment_2 )
            // InternalQLS.g:5063:3: rule__ValueType_Impl__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ValueType_Impl__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getValueType_ImplAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType_Impl__Group__2__Impl"


    // $ANTLR start "rule__ValueType_Impl__Group__3"
    // InternalQLS.g:5071:1: rule__ValueType_Impl__Group__3 : rule__ValueType_Impl__Group__3__Impl rule__ValueType_Impl__Group__4 ;
    public final void rule__ValueType_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5075:1: ( rule__ValueType_Impl__Group__3__Impl rule__ValueType_Impl__Group__4 )
            // InternalQLS.g:5076:2: rule__ValueType_Impl__Group__3__Impl rule__ValueType_Impl__Group__4
            {
            pushFollow(FOLLOW_49);
            rule__ValueType_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueType_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType_Impl__Group__3"


    // $ANTLR start "rule__ValueType_Impl__Group__3__Impl"
    // InternalQLS.g:5083:1: rule__ValueType_Impl__Group__3__Impl : ( '{' ) ;
    public final void rule__ValueType_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5087:1: ( ( '{' ) )
            // InternalQLS.g:5088:1: ( '{' )
            {
            // InternalQLS.g:5088:1: ( '{' )
            // InternalQLS.g:5089:2: '{'
            {
             before(grammarAccess.getValueType_ImplAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getValueType_ImplAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType_Impl__Group__3__Impl"


    // $ANTLR start "rule__ValueType_Impl__Group__4"
    // InternalQLS.g:5098:1: rule__ValueType_Impl__Group__4 : rule__ValueType_Impl__Group__4__Impl rule__ValueType_Impl__Group__5 ;
    public final void rule__ValueType_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5102:1: ( rule__ValueType_Impl__Group__4__Impl rule__ValueType_Impl__Group__5 )
            // InternalQLS.g:5103:2: rule__ValueType_Impl__Group__4__Impl rule__ValueType_Impl__Group__5
            {
            pushFollow(FOLLOW_49);
            rule__ValueType_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueType_Impl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType_Impl__Group__4"


    // $ANTLR start "rule__ValueType_Impl__Group__4__Impl"
    // InternalQLS.g:5110:1: rule__ValueType_Impl__Group__4__Impl : ( ( rule__ValueType_Impl__Group_4__0 )? ) ;
    public final void rule__ValueType_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5114:1: ( ( ( rule__ValueType_Impl__Group_4__0 )? ) )
            // InternalQLS.g:5115:1: ( ( rule__ValueType_Impl__Group_4__0 )? )
            {
            // InternalQLS.g:5115:1: ( ( rule__ValueType_Impl__Group_4__0 )? )
            // InternalQLS.g:5116:2: ( rule__ValueType_Impl__Group_4__0 )?
            {
             before(grammarAccess.getValueType_ImplAccess().getGroup_4()); 
            // InternalQLS.g:5117:2: ( rule__ValueType_Impl__Group_4__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==66) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalQLS.g:5117:3: rule__ValueType_Impl__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ValueType_Impl__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getValueType_ImplAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType_Impl__Group__4__Impl"


    // $ANTLR start "rule__ValueType_Impl__Group__5"
    // InternalQLS.g:5125:1: rule__ValueType_Impl__Group__5 : rule__ValueType_Impl__Group__5__Impl ;
    public final void rule__ValueType_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5129:1: ( rule__ValueType_Impl__Group__5__Impl )
            // InternalQLS.g:5130:2: rule__ValueType_Impl__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValueType_Impl__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType_Impl__Group__5"


    // $ANTLR start "rule__ValueType_Impl__Group__5__Impl"
    // InternalQLS.g:5136:1: rule__ValueType_Impl__Group__5__Impl : ( '}' ) ;
    public final void rule__ValueType_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5140:1: ( ( '}' ) )
            // InternalQLS.g:5141:1: ( '}' )
            {
            // InternalQLS.g:5141:1: ( '}' )
            // InternalQLS.g:5142:2: '}'
            {
             before(grammarAccess.getValueType_ImplAccess().getRightCurlyBracketKeyword_5()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getValueType_ImplAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType_Impl__Group__5__Impl"


    // $ANTLR start "rule__ValueType_Impl__Group_4__0"
    // InternalQLS.g:5152:1: rule__ValueType_Impl__Group_4__0 : rule__ValueType_Impl__Group_4__0__Impl rule__ValueType_Impl__Group_4__1 ;
    public final void rule__ValueType_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5156:1: ( rule__ValueType_Impl__Group_4__0__Impl rule__ValueType_Impl__Group_4__1 )
            // InternalQLS.g:5157:2: rule__ValueType_Impl__Group_4__0__Impl rule__ValueType_Impl__Group_4__1
            {
            pushFollow(FOLLOW_50);
            rule__ValueType_Impl__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueType_Impl__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType_Impl__Group_4__0"


    // $ANTLR start "rule__ValueType_Impl__Group_4__0__Impl"
    // InternalQLS.g:5164:1: rule__ValueType_Impl__Group_4__0__Impl : ( 'unit' ) ;
    public final void rule__ValueType_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5168:1: ( ( 'unit' ) )
            // InternalQLS.g:5169:1: ( 'unit' )
            {
            // InternalQLS.g:5169:1: ( 'unit' )
            // InternalQLS.g:5170:2: 'unit'
            {
             before(grammarAccess.getValueType_ImplAccess().getUnitKeyword_4_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getValueType_ImplAccess().getUnitKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType_Impl__Group_4__0__Impl"


    // $ANTLR start "rule__ValueType_Impl__Group_4__1"
    // InternalQLS.g:5179:1: rule__ValueType_Impl__Group_4__1 : rule__ValueType_Impl__Group_4__1__Impl ;
    public final void rule__ValueType_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5183:1: ( rule__ValueType_Impl__Group_4__1__Impl )
            // InternalQLS.g:5184:2: rule__ValueType_Impl__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValueType_Impl__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType_Impl__Group_4__1"


    // $ANTLR start "rule__ValueType_Impl__Group_4__1__Impl"
    // InternalQLS.g:5190:1: rule__ValueType_Impl__Group_4__1__Impl : ( ( rule__ValueType_Impl__UnitAssignment_4_1 ) ) ;
    public final void rule__ValueType_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5194:1: ( ( ( rule__ValueType_Impl__UnitAssignment_4_1 ) ) )
            // InternalQLS.g:5195:1: ( ( rule__ValueType_Impl__UnitAssignment_4_1 ) )
            {
            // InternalQLS.g:5195:1: ( ( rule__ValueType_Impl__UnitAssignment_4_1 ) )
            // InternalQLS.g:5196:2: ( rule__ValueType_Impl__UnitAssignment_4_1 )
            {
             before(grammarAccess.getValueType_ImplAccess().getUnitAssignment_4_1()); 
            // InternalQLS.g:5197:2: ( rule__ValueType_Impl__UnitAssignment_4_1 )
            // InternalQLS.g:5197:3: rule__ValueType_Impl__UnitAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ValueType_Impl__UnitAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getValueType_ImplAccess().getUnitAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType_Impl__Group_4__1__Impl"


    // $ANTLR start "rule__ConstantCall__Group__0"
    // InternalQLS.g:5206:1: rule__ConstantCall__Group__0 : rule__ConstantCall__Group__0__Impl rule__ConstantCall__Group__1 ;
    public final void rule__ConstantCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5210:1: ( rule__ConstantCall__Group__0__Impl rule__ConstantCall__Group__1 )
            // InternalQLS.g:5211:2: rule__ConstantCall__Group__0__Impl rule__ConstantCall__Group__1
            {
            pushFollow(FOLLOW_51);
            rule__ConstantCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstantCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantCall__Group__0"


    // $ANTLR start "rule__ConstantCall__Group__0__Impl"
    // InternalQLS.g:5218:1: rule__ConstantCall__Group__0__Impl : ( () ) ;
    public final void rule__ConstantCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5222:1: ( ( () ) )
            // InternalQLS.g:5223:1: ( () )
            {
            // InternalQLS.g:5223:1: ( () )
            // InternalQLS.g:5224:2: ()
            {
             before(grammarAccess.getConstantCallAccess().getConstantCallAction_0()); 
            // InternalQLS.g:5225:2: ()
            // InternalQLS.g:5225:3: 
            {
            }

             after(grammarAccess.getConstantCallAccess().getConstantCallAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantCall__Group__0__Impl"


    // $ANTLR start "rule__ConstantCall__Group__1"
    // InternalQLS.g:5233:1: rule__ConstantCall__Group__1 : rule__ConstantCall__Group__1__Impl ;
    public final void rule__ConstantCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5237:1: ( rule__ConstantCall__Group__1__Impl )
            // InternalQLS.g:5238:2: rule__ConstantCall__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstantCall__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantCall__Group__1"


    // $ANTLR start "rule__ConstantCall__Group__1__Impl"
    // InternalQLS.g:5244:1: rule__ConstantCall__Group__1__Impl : ( ( rule__ConstantCall__ValueAssignment_1 ) ) ;
    public final void rule__ConstantCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5248:1: ( ( ( rule__ConstantCall__ValueAssignment_1 ) ) )
            // InternalQLS.g:5249:1: ( ( rule__ConstantCall__ValueAssignment_1 ) )
            {
            // InternalQLS.g:5249:1: ( ( rule__ConstantCall__ValueAssignment_1 ) )
            // InternalQLS.g:5250:2: ( rule__ConstantCall__ValueAssignment_1 )
            {
             before(grammarAccess.getConstantCallAccess().getValueAssignment_1()); 
            // InternalQLS.g:5251:2: ( rule__ConstantCall__ValueAssignment_1 )
            // InternalQLS.g:5251:3: rule__ConstantCall__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConstantCall__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstantCallAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantCall__Group__1__Impl"


    // $ANTLR start "rule__QuestionCall__Group__0"
    // InternalQLS.g:5260:1: rule__QuestionCall__Group__0 : rule__QuestionCall__Group__0__Impl rule__QuestionCall__Group__1 ;
    public final void rule__QuestionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5264:1: ( rule__QuestionCall__Group__0__Impl rule__QuestionCall__Group__1 )
            // InternalQLS.g:5265:2: rule__QuestionCall__Group__0__Impl rule__QuestionCall__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__QuestionCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCall__Group__0"


    // $ANTLR start "rule__QuestionCall__Group__0__Impl"
    // InternalQLS.g:5272:1: rule__QuestionCall__Group__0__Impl : ( () ) ;
    public final void rule__QuestionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5276:1: ( ( () ) )
            // InternalQLS.g:5277:1: ( () )
            {
            // InternalQLS.g:5277:1: ( () )
            // InternalQLS.g:5278:2: ()
            {
             before(grammarAccess.getQuestionCallAccess().getQuestionCallAction_0()); 
            // InternalQLS.g:5279:2: ()
            // InternalQLS.g:5279:3: 
            {
            }

             after(grammarAccess.getQuestionCallAccess().getQuestionCallAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCall__Group__0__Impl"


    // $ANTLR start "rule__QuestionCall__Group__1"
    // InternalQLS.g:5287:1: rule__QuestionCall__Group__1 : rule__QuestionCall__Group__1__Impl rule__QuestionCall__Group__2 ;
    public final void rule__QuestionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5291:1: ( rule__QuestionCall__Group__1__Impl rule__QuestionCall__Group__2 )
            // InternalQLS.g:5292:2: rule__QuestionCall__Group__1__Impl rule__QuestionCall__Group__2
            {
            pushFollow(FOLLOW_52);
            rule__QuestionCall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionCall__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCall__Group__1"


    // $ANTLR start "rule__QuestionCall__Group__1__Impl"
    // InternalQLS.g:5299:1: rule__QuestionCall__Group__1__Impl : ( ( rule__QuestionCall__QuestionAssignment_1 ) ) ;
    public final void rule__QuestionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5303:1: ( ( ( rule__QuestionCall__QuestionAssignment_1 ) ) )
            // InternalQLS.g:5304:1: ( ( rule__QuestionCall__QuestionAssignment_1 ) )
            {
            // InternalQLS.g:5304:1: ( ( rule__QuestionCall__QuestionAssignment_1 ) )
            // InternalQLS.g:5305:2: ( rule__QuestionCall__QuestionAssignment_1 )
            {
             before(grammarAccess.getQuestionCallAccess().getQuestionAssignment_1()); 
            // InternalQLS.g:5306:2: ( rule__QuestionCall__QuestionAssignment_1 )
            // InternalQLS.g:5306:3: rule__QuestionCall__QuestionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__QuestionCall__QuestionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionCallAccess().getQuestionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCall__Group__1__Impl"


    // $ANTLR start "rule__QuestionCall__Group__2"
    // InternalQLS.g:5314:1: rule__QuestionCall__Group__2 : rule__QuestionCall__Group__2__Impl rule__QuestionCall__Group__3 ;
    public final void rule__QuestionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5318:1: ( rule__QuestionCall__Group__2__Impl rule__QuestionCall__Group__3 )
            // InternalQLS.g:5319:2: rule__QuestionCall__Group__2__Impl rule__QuestionCall__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__QuestionCall__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionCall__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCall__Group__2"


    // $ANTLR start "rule__QuestionCall__Group__2__Impl"
    // InternalQLS.g:5326:1: rule__QuestionCall__Group__2__Impl : ( '(' ) ;
    public final void rule__QuestionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5330:1: ( ( '(' ) )
            // InternalQLS.g:5331:1: ( '(' )
            {
            // InternalQLS.g:5331:1: ( '(' )
            // InternalQLS.g:5332:2: '('
            {
             before(grammarAccess.getQuestionCallAccess().getLeftParenthesisKeyword_2()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getQuestionCallAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCall__Group__2__Impl"


    // $ANTLR start "rule__QuestionCall__Group__3"
    // InternalQLS.g:5341:1: rule__QuestionCall__Group__3 : rule__QuestionCall__Group__3__Impl ;
    public final void rule__QuestionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5345:1: ( rule__QuestionCall__Group__3__Impl )
            // InternalQLS.g:5346:2: rule__QuestionCall__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionCall__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCall__Group__3"


    // $ANTLR start "rule__QuestionCall__Group__3__Impl"
    // InternalQLS.g:5352:1: rule__QuestionCall__Group__3__Impl : ( ')' ) ;
    public final void rule__QuestionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5356:1: ( ( ')' ) )
            // InternalQLS.g:5357:1: ( ')' )
            {
            // InternalQLS.g:5357:1: ( ')' )
            // InternalQLS.g:5358:2: ')'
            {
             before(grammarAccess.getQuestionCallAccess().getRightParenthesisKeyword_3()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getQuestionCallAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCall__Group__3__Impl"


    // $ANTLR start "rule__BooleanValueType__Group__0"
    // InternalQLS.g:5368:1: rule__BooleanValueType__Group__0 : rule__BooleanValueType__Group__0__Impl rule__BooleanValueType__Group__1 ;
    public final void rule__BooleanValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5372:1: ( rule__BooleanValueType__Group__0__Impl rule__BooleanValueType__Group__1 )
            // InternalQLS.g:5373:2: rule__BooleanValueType__Group__0__Impl rule__BooleanValueType__Group__1
            {
            pushFollow(FOLLOW_53);
            rule__BooleanValueType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanValueType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group__0"


    // $ANTLR start "rule__BooleanValueType__Group__0__Impl"
    // InternalQLS.g:5380:1: rule__BooleanValueType__Group__0__Impl : ( () ) ;
    public final void rule__BooleanValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5384:1: ( ( () ) )
            // InternalQLS.g:5385:1: ( () )
            {
            // InternalQLS.g:5385:1: ( () )
            // InternalQLS.g:5386:2: ()
            {
             before(grammarAccess.getBooleanValueTypeAccess().getBooleanValueTypeAction_0()); 
            // InternalQLS.g:5387:2: ()
            // InternalQLS.g:5387:3: 
            {
            }

             after(grammarAccess.getBooleanValueTypeAccess().getBooleanValueTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group__0__Impl"


    // $ANTLR start "rule__BooleanValueType__Group__1"
    // InternalQLS.g:5395:1: rule__BooleanValueType__Group__1 : rule__BooleanValueType__Group__1__Impl rule__BooleanValueType__Group__2 ;
    public final void rule__BooleanValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5399:1: ( rule__BooleanValueType__Group__1__Impl rule__BooleanValueType__Group__2 )
            // InternalQLS.g:5400:2: rule__BooleanValueType__Group__1__Impl rule__BooleanValueType__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__BooleanValueType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanValueType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group__1"


    // $ANTLR start "rule__BooleanValueType__Group__1__Impl"
    // InternalQLS.g:5407:1: rule__BooleanValueType__Group__1__Impl : ( 'booleanType' ) ;
    public final void rule__BooleanValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5411:1: ( ( 'booleanType' ) )
            // InternalQLS.g:5412:1: ( 'booleanType' )
            {
            // InternalQLS.g:5412:1: ( 'booleanType' )
            // InternalQLS.g:5413:2: 'booleanType'
            {
             before(grammarAccess.getBooleanValueTypeAccess().getBooleanTypeKeyword_1()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getBooleanValueTypeAccess().getBooleanTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group__1__Impl"


    // $ANTLR start "rule__BooleanValueType__Group__2"
    // InternalQLS.g:5422:1: rule__BooleanValueType__Group__2 : rule__BooleanValueType__Group__2__Impl rule__BooleanValueType__Group__3 ;
    public final void rule__BooleanValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5426:1: ( rule__BooleanValueType__Group__2__Impl rule__BooleanValueType__Group__3 )
            // InternalQLS.g:5427:2: rule__BooleanValueType__Group__2__Impl rule__BooleanValueType__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__BooleanValueType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanValueType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group__2"


    // $ANTLR start "rule__BooleanValueType__Group__2__Impl"
    // InternalQLS.g:5434:1: rule__BooleanValueType__Group__2__Impl : ( ( rule__BooleanValueType__NameAssignment_2 ) ) ;
    public final void rule__BooleanValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5438:1: ( ( ( rule__BooleanValueType__NameAssignment_2 ) ) )
            // InternalQLS.g:5439:1: ( ( rule__BooleanValueType__NameAssignment_2 ) )
            {
            // InternalQLS.g:5439:1: ( ( rule__BooleanValueType__NameAssignment_2 ) )
            // InternalQLS.g:5440:2: ( rule__BooleanValueType__NameAssignment_2 )
            {
             before(grammarAccess.getBooleanValueTypeAccess().getNameAssignment_2()); 
            // InternalQLS.g:5441:2: ( rule__BooleanValueType__NameAssignment_2 )
            // InternalQLS.g:5441:3: rule__BooleanValueType__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValueType__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueTypeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group__2__Impl"


    // $ANTLR start "rule__BooleanValueType__Group__3"
    // InternalQLS.g:5449:1: rule__BooleanValueType__Group__3 : rule__BooleanValueType__Group__3__Impl ;
    public final void rule__BooleanValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5453:1: ( rule__BooleanValueType__Group__3__Impl )
            // InternalQLS.g:5454:2: rule__BooleanValueType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValueType__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group__3"


    // $ANTLR start "rule__BooleanValueType__Group__3__Impl"
    // InternalQLS.g:5460:1: rule__BooleanValueType__Group__3__Impl : ( ( rule__BooleanValueType__Group_3__0 )? ) ;
    public final void rule__BooleanValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5464:1: ( ( ( rule__BooleanValueType__Group_3__0 )? ) )
            // InternalQLS.g:5465:1: ( ( rule__BooleanValueType__Group_3__0 )? )
            {
            // InternalQLS.g:5465:1: ( ( rule__BooleanValueType__Group_3__0 )? )
            // InternalQLS.g:5466:2: ( rule__BooleanValueType__Group_3__0 )?
            {
             before(grammarAccess.getBooleanValueTypeAccess().getGroup_3()); 
            // InternalQLS.g:5467:2: ( rule__BooleanValueType__Group_3__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==44) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalQLS.g:5467:3: rule__BooleanValueType__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanValueType__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBooleanValueTypeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group__3__Impl"


    // $ANTLR start "rule__BooleanValueType__Group_3__0"
    // InternalQLS.g:5476:1: rule__BooleanValueType__Group_3__0 : rule__BooleanValueType__Group_3__0__Impl rule__BooleanValueType__Group_3__1 ;
    public final void rule__BooleanValueType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5480:1: ( rule__BooleanValueType__Group_3__0__Impl rule__BooleanValueType__Group_3__1 )
            // InternalQLS.g:5481:2: rule__BooleanValueType__Group_3__0__Impl rule__BooleanValueType__Group_3__1
            {
            pushFollow(FOLLOW_49);
            rule__BooleanValueType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanValueType__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group_3__0"


    // $ANTLR start "rule__BooleanValueType__Group_3__0__Impl"
    // InternalQLS.g:5488:1: rule__BooleanValueType__Group_3__0__Impl : ( '{' ) ;
    public final void rule__BooleanValueType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5492:1: ( ( '{' ) )
            // InternalQLS.g:5493:1: ( '{' )
            {
            // InternalQLS.g:5493:1: ( '{' )
            // InternalQLS.g:5494:2: '{'
            {
             before(grammarAccess.getBooleanValueTypeAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getBooleanValueTypeAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group_3__0__Impl"


    // $ANTLR start "rule__BooleanValueType__Group_3__1"
    // InternalQLS.g:5503:1: rule__BooleanValueType__Group_3__1 : rule__BooleanValueType__Group_3__1__Impl rule__BooleanValueType__Group_3__2 ;
    public final void rule__BooleanValueType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5507:1: ( rule__BooleanValueType__Group_3__1__Impl rule__BooleanValueType__Group_3__2 )
            // InternalQLS.g:5508:2: rule__BooleanValueType__Group_3__1__Impl rule__BooleanValueType__Group_3__2
            {
            pushFollow(FOLLOW_49);
            rule__BooleanValueType__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanValueType__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group_3__1"


    // $ANTLR start "rule__BooleanValueType__Group_3__1__Impl"
    // InternalQLS.g:5515:1: rule__BooleanValueType__Group_3__1__Impl : ( ( rule__BooleanValueType__Group_3_1__0 )? ) ;
    public final void rule__BooleanValueType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5519:1: ( ( ( rule__BooleanValueType__Group_3_1__0 )? ) )
            // InternalQLS.g:5520:1: ( ( rule__BooleanValueType__Group_3_1__0 )? )
            {
            // InternalQLS.g:5520:1: ( ( rule__BooleanValueType__Group_3_1__0 )? )
            // InternalQLS.g:5521:2: ( rule__BooleanValueType__Group_3_1__0 )?
            {
             before(grammarAccess.getBooleanValueTypeAccess().getGroup_3_1()); 
            // InternalQLS.g:5522:2: ( rule__BooleanValueType__Group_3_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==66) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalQLS.g:5522:3: rule__BooleanValueType__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanValueType__Group_3_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBooleanValueTypeAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group_3__1__Impl"


    // $ANTLR start "rule__BooleanValueType__Group_3__2"
    // InternalQLS.g:5530:1: rule__BooleanValueType__Group_3__2 : rule__BooleanValueType__Group_3__2__Impl ;
    public final void rule__BooleanValueType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5534:1: ( rule__BooleanValueType__Group_3__2__Impl )
            // InternalQLS.g:5535:2: rule__BooleanValueType__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValueType__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group_3__2"


    // $ANTLR start "rule__BooleanValueType__Group_3__2__Impl"
    // InternalQLS.g:5541:1: rule__BooleanValueType__Group_3__2__Impl : ( '}' ) ;
    public final void rule__BooleanValueType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5545:1: ( ( '}' ) )
            // InternalQLS.g:5546:1: ( '}' )
            {
            // InternalQLS.g:5546:1: ( '}' )
            // InternalQLS.g:5547:2: '}'
            {
             before(grammarAccess.getBooleanValueTypeAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getBooleanValueTypeAccess().getRightCurlyBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group_3__2__Impl"


    // $ANTLR start "rule__BooleanValueType__Group_3_1__0"
    // InternalQLS.g:5557:1: rule__BooleanValueType__Group_3_1__0 : rule__BooleanValueType__Group_3_1__0__Impl rule__BooleanValueType__Group_3_1__1 ;
    public final void rule__BooleanValueType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5561:1: ( rule__BooleanValueType__Group_3_1__0__Impl rule__BooleanValueType__Group_3_1__1 )
            // InternalQLS.g:5562:2: rule__BooleanValueType__Group_3_1__0__Impl rule__BooleanValueType__Group_3_1__1
            {
            pushFollow(FOLLOW_50);
            rule__BooleanValueType__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanValueType__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group_3_1__0"


    // $ANTLR start "rule__BooleanValueType__Group_3_1__0__Impl"
    // InternalQLS.g:5569:1: rule__BooleanValueType__Group_3_1__0__Impl : ( 'unit' ) ;
    public final void rule__BooleanValueType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5573:1: ( ( 'unit' ) )
            // InternalQLS.g:5574:1: ( 'unit' )
            {
            // InternalQLS.g:5574:1: ( 'unit' )
            // InternalQLS.g:5575:2: 'unit'
            {
             before(grammarAccess.getBooleanValueTypeAccess().getUnitKeyword_3_1_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getBooleanValueTypeAccess().getUnitKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group_3_1__0__Impl"


    // $ANTLR start "rule__BooleanValueType__Group_3_1__1"
    // InternalQLS.g:5584:1: rule__BooleanValueType__Group_3_1__1 : rule__BooleanValueType__Group_3_1__1__Impl ;
    public final void rule__BooleanValueType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5588:1: ( rule__BooleanValueType__Group_3_1__1__Impl )
            // InternalQLS.g:5589:2: rule__BooleanValueType__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValueType__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group_3_1__1"


    // $ANTLR start "rule__BooleanValueType__Group_3_1__1__Impl"
    // InternalQLS.g:5595:1: rule__BooleanValueType__Group_3_1__1__Impl : ( ( rule__BooleanValueType__UnitAssignment_3_1_1 ) ) ;
    public final void rule__BooleanValueType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5599:1: ( ( ( rule__BooleanValueType__UnitAssignment_3_1_1 ) ) )
            // InternalQLS.g:5600:1: ( ( rule__BooleanValueType__UnitAssignment_3_1_1 ) )
            {
            // InternalQLS.g:5600:1: ( ( rule__BooleanValueType__UnitAssignment_3_1_1 ) )
            // InternalQLS.g:5601:2: ( rule__BooleanValueType__UnitAssignment_3_1_1 )
            {
             before(grammarAccess.getBooleanValueTypeAccess().getUnitAssignment_3_1_1()); 
            // InternalQLS.g:5602:2: ( rule__BooleanValueType__UnitAssignment_3_1_1 )
            // InternalQLS.g:5602:3: rule__BooleanValueType__UnitAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValueType__UnitAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueTypeAccess().getUnitAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group_3_1__1__Impl"


    // $ANTLR start "rule__IntegerValueType__Group__0"
    // InternalQLS.g:5611:1: rule__IntegerValueType__Group__0 : rule__IntegerValueType__Group__0__Impl rule__IntegerValueType__Group__1 ;
    public final void rule__IntegerValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5615:1: ( rule__IntegerValueType__Group__0__Impl rule__IntegerValueType__Group__1 )
            // InternalQLS.g:5616:2: rule__IntegerValueType__Group__0__Impl rule__IntegerValueType__Group__1
            {
            pushFollow(FOLLOW_54);
            rule__IntegerValueType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group__0"


    // $ANTLR start "rule__IntegerValueType__Group__0__Impl"
    // InternalQLS.g:5623:1: rule__IntegerValueType__Group__0__Impl : ( () ) ;
    public final void rule__IntegerValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5627:1: ( ( () ) )
            // InternalQLS.g:5628:1: ( () )
            {
            // InternalQLS.g:5628:1: ( () )
            // InternalQLS.g:5629:2: ()
            {
             before(grammarAccess.getIntegerValueTypeAccess().getIntegerValueTypeAction_0()); 
            // InternalQLS.g:5630:2: ()
            // InternalQLS.g:5630:3: 
            {
            }

             after(grammarAccess.getIntegerValueTypeAccess().getIntegerValueTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group__0__Impl"


    // $ANTLR start "rule__IntegerValueType__Group__1"
    // InternalQLS.g:5638:1: rule__IntegerValueType__Group__1 : rule__IntegerValueType__Group__1__Impl rule__IntegerValueType__Group__2 ;
    public final void rule__IntegerValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5642:1: ( rule__IntegerValueType__Group__1__Impl rule__IntegerValueType__Group__2 )
            // InternalQLS.g:5643:2: rule__IntegerValueType__Group__1__Impl rule__IntegerValueType__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__IntegerValueType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group__1"


    // $ANTLR start "rule__IntegerValueType__Group__1__Impl"
    // InternalQLS.g:5650:1: rule__IntegerValueType__Group__1__Impl : ( 'integerType' ) ;
    public final void rule__IntegerValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5654:1: ( ( 'integerType' ) )
            // InternalQLS.g:5655:1: ( 'integerType' )
            {
            // InternalQLS.g:5655:1: ( 'integerType' )
            // InternalQLS.g:5656:2: 'integerType'
            {
             before(grammarAccess.getIntegerValueTypeAccess().getIntegerTypeKeyword_1()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getIntegerValueTypeAccess().getIntegerTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group__1__Impl"


    // $ANTLR start "rule__IntegerValueType__Group__2"
    // InternalQLS.g:5665:1: rule__IntegerValueType__Group__2 : rule__IntegerValueType__Group__2__Impl rule__IntegerValueType__Group__3 ;
    public final void rule__IntegerValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5669:1: ( rule__IntegerValueType__Group__2__Impl rule__IntegerValueType__Group__3 )
            // InternalQLS.g:5670:2: rule__IntegerValueType__Group__2__Impl rule__IntegerValueType__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__IntegerValueType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group__2"


    // $ANTLR start "rule__IntegerValueType__Group__2__Impl"
    // InternalQLS.g:5677:1: rule__IntegerValueType__Group__2__Impl : ( ( rule__IntegerValueType__NameAssignment_2 ) ) ;
    public final void rule__IntegerValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5681:1: ( ( ( rule__IntegerValueType__NameAssignment_2 ) ) )
            // InternalQLS.g:5682:1: ( ( rule__IntegerValueType__NameAssignment_2 ) )
            {
            // InternalQLS.g:5682:1: ( ( rule__IntegerValueType__NameAssignment_2 ) )
            // InternalQLS.g:5683:2: ( rule__IntegerValueType__NameAssignment_2 )
            {
             before(grammarAccess.getIntegerValueTypeAccess().getNameAssignment_2()); 
            // InternalQLS.g:5684:2: ( rule__IntegerValueType__NameAssignment_2 )
            // InternalQLS.g:5684:3: rule__IntegerValueType__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValueType__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIntegerValueTypeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group__2__Impl"


    // $ANTLR start "rule__IntegerValueType__Group__3"
    // InternalQLS.g:5692:1: rule__IntegerValueType__Group__3 : rule__IntegerValueType__Group__3__Impl ;
    public final void rule__IntegerValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5696:1: ( rule__IntegerValueType__Group__3__Impl )
            // InternalQLS.g:5697:2: rule__IntegerValueType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group__3"


    // $ANTLR start "rule__IntegerValueType__Group__3__Impl"
    // InternalQLS.g:5703:1: rule__IntegerValueType__Group__3__Impl : ( ( rule__IntegerValueType__Group_3__0 )? ) ;
    public final void rule__IntegerValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5707:1: ( ( ( rule__IntegerValueType__Group_3__0 )? ) )
            // InternalQLS.g:5708:1: ( ( rule__IntegerValueType__Group_3__0 )? )
            {
            // InternalQLS.g:5708:1: ( ( rule__IntegerValueType__Group_3__0 )? )
            // InternalQLS.g:5709:2: ( rule__IntegerValueType__Group_3__0 )?
            {
             before(grammarAccess.getIntegerValueTypeAccess().getGroup_3()); 
            // InternalQLS.g:5710:2: ( rule__IntegerValueType__Group_3__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==44) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalQLS.g:5710:3: rule__IntegerValueType__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IntegerValueType__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerValueTypeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group__3__Impl"


    // $ANTLR start "rule__IntegerValueType__Group_3__0"
    // InternalQLS.g:5719:1: rule__IntegerValueType__Group_3__0 : rule__IntegerValueType__Group_3__0__Impl rule__IntegerValueType__Group_3__1 ;
    public final void rule__IntegerValueType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5723:1: ( rule__IntegerValueType__Group_3__0__Impl rule__IntegerValueType__Group_3__1 )
            // InternalQLS.g:5724:2: rule__IntegerValueType__Group_3__0__Impl rule__IntegerValueType__Group_3__1
            {
            pushFollow(FOLLOW_55);
            rule__IntegerValueType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3__0"


    // $ANTLR start "rule__IntegerValueType__Group_3__0__Impl"
    // InternalQLS.g:5731:1: rule__IntegerValueType__Group_3__0__Impl : ( '{' ) ;
    public final void rule__IntegerValueType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5735:1: ( ( '{' ) )
            // InternalQLS.g:5736:1: ( '{' )
            {
            // InternalQLS.g:5736:1: ( '{' )
            // InternalQLS.g:5737:2: '{'
            {
             before(grammarAccess.getIntegerValueTypeAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getIntegerValueTypeAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3__0__Impl"


    // $ANTLR start "rule__IntegerValueType__Group_3__1"
    // InternalQLS.g:5746:1: rule__IntegerValueType__Group_3__1 : rule__IntegerValueType__Group_3__1__Impl rule__IntegerValueType__Group_3__2 ;
    public final void rule__IntegerValueType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5750:1: ( rule__IntegerValueType__Group_3__1__Impl rule__IntegerValueType__Group_3__2 )
            // InternalQLS.g:5751:2: rule__IntegerValueType__Group_3__1__Impl rule__IntegerValueType__Group_3__2
            {
            pushFollow(FOLLOW_55);
            rule__IntegerValueType__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3__1"


    // $ANTLR start "rule__IntegerValueType__Group_3__1__Impl"
    // InternalQLS.g:5758:1: rule__IntegerValueType__Group_3__1__Impl : ( ( rule__IntegerValueType__Group_3_1__0 )? ) ;
    public final void rule__IntegerValueType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5762:1: ( ( ( rule__IntegerValueType__Group_3_1__0 )? ) )
            // InternalQLS.g:5763:1: ( ( rule__IntegerValueType__Group_3_1__0 )? )
            {
            // InternalQLS.g:5763:1: ( ( rule__IntegerValueType__Group_3_1__0 )? )
            // InternalQLS.g:5764:2: ( rule__IntegerValueType__Group_3_1__0 )?
            {
             before(grammarAccess.getIntegerValueTypeAccess().getGroup_3_1()); 
            // InternalQLS.g:5765:2: ( rule__IntegerValueType__Group_3_1__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==66) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalQLS.g:5765:3: rule__IntegerValueType__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IntegerValueType__Group_3_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerValueTypeAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3__1__Impl"


    // $ANTLR start "rule__IntegerValueType__Group_3__2"
    // InternalQLS.g:5773:1: rule__IntegerValueType__Group_3__2 : rule__IntegerValueType__Group_3__2__Impl rule__IntegerValueType__Group_3__3 ;
    public final void rule__IntegerValueType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5777:1: ( rule__IntegerValueType__Group_3__2__Impl rule__IntegerValueType__Group_3__3 )
            // InternalQLS.g:5778:2: rule__IntegerValueType__Group_3__2__Impl rule__IntegerValueType__Group_3__3
            {
            pushFollow(FOLLOW_55);
            rule__IntegerValueType__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3__2"


    // $ANTLR start "rule__IntegerValueType__Group_3__2__Impl"
    // InternalQLS.g:5785:1: rule__IntegerValueType__Group_3__2__Impl : ( ( rule__IntegerValueType__Group_3_2__0 )? ) ;
    public final void rule__IntegerValueType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5789:1: ( ( ( rule__IntegerValueType__Group_3_2__0 )? ) )
            // InternalQLS.g:5790:1: ( ( rule__IntegerValueType__Group_3_2__0 )? )
            {
            // InternalQLS.g:5790:1: ( ( rule__IntegerValueType__Group_3_2__0 )? )
            // InternalQLS.g:5791:2: ( rule__IntegerValueType__Group_3_2__0 )?
            {
             before(grammarAccess.getIntegerValueTypeAccess().getGroup_3_2()); 
            // InternalQLS.g:5792:2: ( rule__IntegerValueType__Group_3_2__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==69) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalQLS.g:5792:3: rule__IntegerValueType__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IntegerValueType__Group_3_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerValueTypeAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3__2__Impl"


    // $ANTLR start "rule__IntegerValueType__Group_3__3"
    // InternalQLS.g:5800:1: rule__IntegerValueType__Group_3__3 : rule__IntegerValueType__Group_3__3__Impl rule__IntegerValueType__Group_3__4 ;
    public final void rule__IntegerValueType__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5804:1: ( rule__IntegerValueType__Group_3__3__Impl rule__IntegerValueType__Group_3__4 )
            // InternalQLS.g:5805:2: rule__IntegerValueType__Group_3__3__Impl rule__IntegerValueType__Group_3__4
            {
            pushFollow(FOLLOW_55);
            rule__IntegerValueType__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3__3"


    // $ANTLR start "rule__IntegerValueType__Group_3__3__Impl"
    // InternalQLS.g:5812:1: rule__IntegerValueType__Group_3__3__Impl : ( ( rule__IntegerValueType__Group_3_3__0 )? ) ;
    public final void rule__IntegerValueType__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5816:1: ( ( ( rule__IntegerValueType__Group_3_3__0 )? ) )
            // InternalQLS.g:5817:1: ( ( rule__IntegerValueType__Group_3_3__0 )? )
            {
            // InternalQLS.g:5817:1: ( ( rule__IntegerValueType__Group_3_3__0 )? )
            // InternalQLS.g:5818:2: ( rule__IntegerValueType__Group_3_3__0 )?
            {
             before(grammarAccess.getIntegerValueTypeAccess().getGroup_3_3()); 
            // InternalQLS.g:5819:2: ( rule__IntegerValueType__Group_3_3__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==70) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalQLS.g:5819:3: rule__IntegerValueType__Group_3_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IntegerValueType__Group_3_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerValueTypeAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3__3__Impl"


    // $ANTLR start "rule__IntegerValueType__Group_3__4"
    // InternalQLS.g:5827:1: rule__IntegerValueType__Group_3__4 : rule__IntegerValueType__Group_3__4__Impl ;
    public final void rule__IntegerValueType__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5831:1: ( rule__IntegerValueType__Group_3__4__Impl )
            // InternalQLS.g:5832:2: rule__IntegerValueType__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3__4"


    // $ANTLR start "rule__IntegerValueType__Group_3__4__Impl"
    // InternalQLS.g:5838:1: rule__IntegerValueType__Group_3__4__Impl : ( '}' ) ;
    public final void rule__IntegerValueType__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5842:1: ( ( '}' ) )
            // InternalQLS.g:5843:1: ( '}' )
            {
            // InternalQLS.g:5843:1: ( '}' )
            // InternalQLS.g:5844:2: '}'
            {
             before(grammarAccess.getIntegerValueTypeAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getIntegerValueTypeAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3__4__Impl"


    // $ANTLR start "rule__IntegerValueType__Group_3_1__0"
    // InternalQLS.g:5854:1: rule__IntegerValueType__Group_3_1__0 : rule__IntegerValueType__Group_3_1__0__Impl rule__IntegerValueType__Group_3_1__1 ;
    public final void rule__IntegerValueType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5858:1: ( rule__IntegerValueType__Group_3_1__0__Impl rule__IntegerValueType__Group_3_1__1 )
            // InternalQLS.g:5859:2: rule__IntegerValueType__Group_3_1__0__Impl rule__IntegerValueType__Group_3_1__1
            {
            pushFollow(FOLLOW_50);
            rule__IntegerValueType__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3_1__0"


    // $ANTLR start "rule__IntegerValueType__Group_3_1__0__Impl"
    // InternalQLS.g:5866:1: rule__IntegerValueType__Group_3_1__0__Impl : ( 'unit' ) ;
    public final void rule__IntegerValueType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5870:1: ( ( 'unit' ) )
            // InternalQLS.g:5871:1: ( 'unit' )
            {
            // InternalQLS.g:5871:1: ( 'unit' )
            // InternalQLS.g:5872:2: 'unit'
            {
             before(grammarAccess.getIntegerValueTypeAccess().getUnitKeyword_3_1_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getIntegerValueTypeAccess().getUnitKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3_1__0__Impl"


    // $ANTLR start "rule__IntegerValueType__Group_3_1__1"
    // InternalQLS.g:5881:1: rule__IntegerValueType__Group_3_1__1 : rule__IntegerValueType__Group_3_1__1__Impl ;
    public final void rule__IntegerValueType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5885:1: ( rule__IntegerValueType__Group_3_1__1__Impl )
            // InternalQLS.g:5886:2: rule__IntegerValueType__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3_1__1"


    // $ANTLR start "rule__IntegerValueType__Group_3_1__1__Impl"
    // InternalQLS.g:5892:1: rule__IntegerValueType__Group_3_1__1__Impl : ( ( rule__IntegerValueType__UnitAssignment_3_1_1 ) ) ;
    public final void rule__IntegerValueType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5896:1: ( ( ( rule__IntegerValueType__UnitAssignment_3_1_1 ) ) )
            // InternalQLS.g:5897:1: ( ( rule__IntegerValueType__UnitAssignment_3_1_1 ) )
            {
            // InternalQLS.g:5897:1: ( ( rule__IntegerValueType__UnitAssignment_3_1_1 ) )
            // InternalQLS.g:5898:2: ( rule__IntegerValueType__UnitAssignment_3_1_1 )
            {
             before(grammarAccess.getIntegerValueTypeAccess().getUnitAssignment_3_1_1()); 
            // InternalQLS.g:5899:2: ( rule__IntegerValueType__UnitAssignment_3_1_1 )
            // InternalQLS.g:5899:3: rule__IntegerValueType__UnitAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValueType__UnitAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getIntegerValueTypeAccess().getUnitAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3_1__1__Impl"


    // $ANTLR start "rule__IntegerValueType__Group_3_2__0"
    // InternalQLS.g:5908:1: rule__IntegerValueType__Group_3_2__0 : rule__IntegerValueType__Group_3_2__0__Impl rule__IntegerValueType__Group_3_2__1 ;
    public final void rule__IntegerValueType__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5912:1: ( rule__IntegerValueType__Group_3_2__0__Impl rule__IntegerValueType__Group_3_2__1 )
            // InternalQLS.g:5913:2: rule__IntegerValueType__Group_3_2__0__Impl rule__IntegerValueType__Group_3_2__1
            {
            pushFollow(FOLLOW_56);
            rule__IntegerValueType__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3_2__0"


    // $ANTLR start "rule__IntegerValueType__Group_3_2__0__Impl"
    // InternalQLS.g:5920:1: rule__IntegerValueType__Group_3_2__0__Impl : ( 'min' ) ;
    public final void rule__IntegerValueType__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5924:1: ( ( 'min' ) )
            // InternalQLS.g:5925:1: ( 'min' )
            {
            // InternalQLS.g:5925:1: ( 'min' )
            // InternalQLS.g:5926:2: 'min'
            {
             before(grammarAccess.getIntegerValueTypeAccess().getMinKeyword_3_2_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getIntegerValueTypeAccess().getMinKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3_2__0__Impl"


    // $ANTLR start "rule__IntegerValueType__Group_3_2__1"
    // InternalQLS.g:5935:1: rule__IntegerValueType__Group_3_2__1 : rule__IntegerValueType__Group_3_2__1__Impl ;
    public final void rule__IntegerValueType__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5939:1: ( rule__IntegerValueType__Group_3_2__1__Impl )
            // InternalQLS.g:5940:2: rule__IntegerValueType__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3_2__1"


    // $ANTLR start "rule__IntegerValueType__Group_3_2__1__Impl"
    // InternalQLS.g:5946:1: rule__IntegerValueType__Group_3_2__1__Impl : ( ( rule__IntegerValueType__MinAssignment_3_2_1 ) ) ;
    public final void rule__IntegerValueType__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5950:1: ( ( ( rule__IntegerValueType__MinAssignment_3_2_1 ) ) )
            // InternalQLS.g:5951:1: ( ( rule__IntegerValueType__MinAssignment_3_2_1 ) )
            {
            // InternalQLS.g:5951:1: ( ( rule__IntegerValueType__MinAssignment_3_2_1 ) )
            // InternalQLS.g:5952:2: ( rule__IntegerValueType__MinAssignment_3_2_1 )
            {
             before(grammarAccess.getIntegerValueTypeAccess().getMinAssignment_3_2_1()); 
            // InternalQLS.g:5953:2: ( rule__IntegerValueType__MinAssignment_3_2_1 )
            // InternalQLS.g:5953:3: rule__IntegerValueType__MinAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValueType__MinAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getIntegerValueTypeAccess().getMinAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3_2__1__Impl"


    // $ANTLR start "rule__IntegerValueType__Group_3_3__0"
    // InternalQLS.g:5962:1: rule__IntegerValueType__Group_3_3__0 : rule__IntegerValueType__Group_3_3__0__Impl rule__IntegerValueType__Group_3_3__1 ;
    public final void rule__IntegerValueType__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5966:1: ( rule__IntegerValueType__Group_3_3__0__Impl rule__IntegerValueType__Group_3_3__1 )
            // InternalQLS.g:5967:2: rule__IntegerValueType__Group_3_3__0__Impl rule__IntegerValueType__Group_3_3__1
            {
            pushFollow(FOLLOW_56);
            rule__IntegerValueType__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3_3__0"


    // $ANTLR start "rule__IntegerValueType__Group_3_3__0__Impl"
    // InternalQLS.g:5974:1: rule__IntegerValueType__Group_3_3__0__Impl : ( 'max' ) ;
    public final void rule__IntegerValueType__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5978:1: ( ( 'max' ) )
            // InternalQLS.g:5979:1: ( 'max' )
            {
            // InternalQLS.g:5979:1: ( 'max' )
            // InternalQLS.g:5980:2: 'max'
            {
             before(grammarAccess.getIntegerValueTypeAccess().getMaxKeyword_3_3_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getIntegerValueTypeAccess().getMaxKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3_3__0__Impl"


    // $ANTLR start "rule__IntegerValueType__Group_3_3__1"
    // InternalQLS.g:5989:1: rule__IntegerValueType__Group_3_3__1 : rule__IntegerValueType__Group_3_3__1__Impl ;
    public final void rule__IntegerValueType__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5993:1: ( rule__IntegerValueType__Group_3_3__1__Impl )
            // InternalQLS.g:5994:2: rule__IntegerValueType__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3_3__1"


    // $ANTLR start "rule__IntegerValueType__Group_3_3__1__Impl"
    // InternalQLS.g:6000:1: rule__IntegerValueType__Group_3_3__1__Impl : ( ( rule__IntegerValueType__MaxAssignment_3_3_1 ) ) ;
    public final void rule__IntegerValueType__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6004:1: ( ( ( rule__IntegerValueType__MaxAssignment_3_3_1 ) ) )
            // InternalQLS.g:6005:1: ( ( rule__IntegerValueType__MaxAssignment_3_3_1 ) )
            {
            // InternalQLS.g:6005:1: ( ( rule__IntegerValueType__MaxAssignment_3_3_1 ) )
            // InternalQLS.g:6006:2: ( rule__IntegerValueType__MaxAssignment_3_3_1 )
            {
             before(grammarAccess.getIntegerValueTypeAccess().getMaxAssignment_3_3_1()); 
            // InternalQLS.g:6007:2: ( rule__IntegerValueType__MaxAssignment_3_3_1 )
            // InternalQLS.g:6007:3: rule__IntegerValueType__MaxAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValueType__MaxAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getIntegerValueTypeAccess().getMaxAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3_3__1__Impl"


    // $ANTLR start "rule__DecimalValueType__Group__0"
    // InternalQLS.g:6016:1: rule__DecimalValueType__Group__0 : rule__DecimalValueType__Group__0__Impl rule__DecimalValueType__Group__1 ;
    public final void rule__DecimalValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6020:1: ( rule__DecimalValueType__Group__0__Impl rule__DecimalValueType__Group__1 )
            // InternalQLS.g:6021:2: rule__DecimalValueType__Group__0__Impl rule__DecimalValueType__Group__1
            {
            pushFollow(FOLLOW_57);
            rule__DecimalValueType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecimalValueType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group__0"


    // $ANTLR start "rule__DecimalValueType__Group__0__Impl"
    // InternalQLS.g:6028:1: rule__DecimalValueType__Group__0__Impl : ( () ) ;
    public final void rule__DecimalValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6032:1: ( ( () ) )
            // InternalQLS.g:6033:1: ( () )
            {
            // InternalQLS.g:6033:1: ( () )
            // InternalQLS.g:6034:2: ()
            {
             before(grammarAccess.getDecimalValueTypeAccess().getDecimalValueTypeAction_0()); 
            // InternalQLS.g:6035:2: ()
            // InternalQLS.g:6035:3: 
            {
            }

             after(grammarAccess.getDecimalValueTypeAccess().getDecimalValueTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group__0__Impl"


    // $ANTLR start "rule__DecimalValueType__Group__1"
    // InternalQLS.g:6043:1: rule__DecimalValueType__Group__1 : rule__DecimalValueType__Group__1__Impl rule__DecimalValueType__Group__2 ;
    public final void rule__DecimalValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6047:1: ( rule__DecimalValueType__Group__1__Impl rule__DecimalValueType__Group__2 )
            // InternalQLS.g:6048:2: rule__DecimalValueType__Group__1__Impl rule__DecimalValueType__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__DecimalValueType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecimalValueType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group__1"


    // $ANTLR start "rule__DecimalValueType__Group__1__Impl"
    // InternalQLS.g:6055:1: rule__DecimalValueType__Group__1__Impl : ( 'decimalType' ) ;
    public final void rule__DecimalValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6059:1: ( ( 'decimalType' ) )
            // InternalQLS.g:6060:1: ( 'decimalType' )
            {
            // InternalQLS.g:6060:1: ( 'decimalType' )
            // InternalQLS.g:6061:2: 'decimalType'
            {
             before(grammarAccess.getDecimalValueTypeAccess().getDecimalTypeKeyword_1()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getDecimalValueTypeAccess().getDecimalTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group__1__Impl"


    // $ANTLR start "rule__DecimalValueType__Group__2"
    // InternalQLS.g:6070:1: rule__DecimalValueType__Group__2 : rule__DecimalValueType__Group__2__Impl rule__DecimalValueType__Group__3 ;
    public final void rule__DecimalValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6074:1: ( rule__DecimalValueType__Group__2__Impl rule__DecimalValueType__Group__3 )
            // InternalQLS.g:6075:2: rule__DecimalValueType__Group__2__Impl rule__DecimalValueType__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__DecimalValueType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecimalValueType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group__2"


    // $ANTLR start "rule__DecimalValueType__Group__2__Impl"
    // InternalQLS.g:6082:1: rule__DecimalValueType__Group__2__Impl : ( ( rule__DecimalValueType__NameAssignment_2 ) ) ;
    public final void rule__DecimalValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6086:1: ( ( ( rule__DecimalValueType__NameAssignment_2 ) ) )
            // InternalQLS.g:6087:1: ( ( rule__DecimalValueType__NameAssignment_2 ) )
            {
            // InternalQLS.g:6087:1: ( ( rule__DecimalValueType__NameAssignment_2 ) )
            // InternalQLS.g:6088:2: ( rule__DecimalValueType__NameAssignment_2 )
            {
             before(grammarAccess.getDecimalValueTypeAccess().getNameAssignment_2()); 
            // InternalQLS.g:6089:2: ( rule__DecimalValueType__NameAssignment_2 )
            // InternalQLS.g:6089:3: rule__DecimalValueType__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DecimalValueType__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDecimalValueTypeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group__2__Impl"


    // $ANTLR start "rule__DecimalValueType__Group__3"
    // InternalQLS.g:6097:1: rule__DecimalValueType__Group__3 : rule__DecimalValueType__Group__3__Impl ;
    public final void rule__DecimalValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6101:1: ( rule__DecimalValueType__Group__3__Impl )
            // InternalQLS.g:6102:2: rule__DecimalValueType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DecimalValueType__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group__3"


    // $ANTLR start "rule__DecimalValueType__Group__3__Impl"
    // InternalQLS.g:6108:1: rule__DecimalValueType__Group__3__Impl : ( ( rule__DecimalValueType__Group_3__0 )? ) ;
    public final void rule__DecimalValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6112:1: ( ( ( rule__DecimalValueType__Group_3__0 )? ) )
            // InternalQLS.g:6113:1: ( ( rule__DecimalValueType__Group_3__0 )? )
            {
            // InternalQLS.g:6113:1: ( ( rule__DecimalValueType__Group_3__0 )? )
            // InternalQLS.g:6114:2: ( rule__DecimalValueType__Group_3__0 )?
            {
             before(grammarAccess.getDecimalValueTypeAccess().getGroup_3()); 
            // InternalQLS.g:6115:2: ( rule__DecimalValueType__Group_3__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==44) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalQLS.g:6115:3: rule__DecimalValueType__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DecimalValueType__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDecimalValueTypeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group__3__Impl"


    // $ANTLR start "rule__DecimalValueType__Group_3__0"
    // InternalQLS.g:6124:1: rule__DecimalValueType__Group_3__0 : rule__DecimalValueType__Group_3__0__Impl rule__DecimalValueType__Group_3__1 ;
    public final void rule__DecimalValueType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6128:1: ( rule__DecimalValueType__Group_3__0__Impl rule__DecimalValueType__Group_3__1 )
            // InternalQLS.g:6129:2: rule__DecimalValueType__Group_3__0__Impl rule__DecimalValueType__Group_3__1
            {
            pushFollow(FOLLOW_49);
            rule__DecimalValueType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecimalValueType__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group_3__0"


    // $ANTLR start "rule__DecimalValueType__Group_3__0__Impl"
    // InternalQLS.g:6136:1: rule__DecimalValueType__Group_3__0__Impl : ( '{' ) ;
    public final void rule__DecimalValueType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6140:1: ( ( '{' ) )
            // InternalQLS.g:6141:1: ( '{' )
            {
            // InternalQLS.g:6141:1: ( '{' )
            // InternalQLS.g:6142:2: '{'
            {
             before(grammarAccess.getDecimalValueTypeAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getDecimalValueTypeAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group_3__0__Impl"


    // $ANTLR start "rule__DecimalValueType__Group_3__1"
    // InternalQLS.g:6151:1: rule__DecimalValueType__Group_3__1 : rule__DecimalValueType__Group_3__1__Impl rule__DecimalValueType__Group_3__2 ;
    public final void rule__DecimalValueType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6155:1: ( rule__DecimalValueType__Group_3__1__Impl rule__DecimalValueType__Group_3__2 )
            // InternalQLS.g:6156:2: rule__DecimalValueType__Group_3__1__Impl rule__DecimalValueType__Group_3__2
            {
            pushFollow(FOLLOW_49);
            rule__DecimalValueType__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecimalValueType__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group_3__1"


    // $ANTLR start "rule__DecimalValueType__Group_3__1__Impl"
    // InternalQLS.g:6163:1: rule__DecimalValueType__Group_3__1__Impl : ( ( rule__DecimalValueType__Group_3_1__0 )? ) ;
    public final void rule__DecimalValueType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6167:1: ( ( ( rule__DecimalValueType__Group_3_1__0 )? ) )
            // InternalQLS.g:6168:1: ( ( rule__DecimalValueType__Group_3_1__0 )? )
            {
            // InternalQLS.g:6168:1: ( ( rule__DecimalValueType__Group_3_1__0 )? )
            // InternalQLS.g:6169:2: ( rule__DecimalValueType__Group_3_1__0 )?
            {
             before(grammarAccess.getDecimalValueTypeAccess().getGroup_3_1()); 
            // InternalQLS.g:6170:2: ( rule__DecimalValueType__Group_3_1__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==66) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalQLS.g:6170:3: rule__DecimalValueType__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DecimalValueType__Group_3_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDecimalValueTypeAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group_3__1__Impl"


    // $ANTLR start "rule__DecimalValueType__Group_3__2"
    // InternalQLS.g:6178:1: rule__DecimalValueType__Group_3__2 : rule__DecimalValueType__Group_3__2__Impl ;
    public final void rule__DecimalValueType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6182:1: ( rule__DecimalValueType__Group_3__2__Impl )
            // InternalQLS.g:6183:2: rule__DecimalValueType__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DecimalValueType__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group_3__2"


    // $ANTLR start "rule__DecimalValueType__Group_3__2__Impl"
    // InternalQLS.g:6189:1: rule__DecimalValueType__Group_3__2__Impl : ( '}' ) ;
    public final void rule__DecimalValueType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6193:1: ( ( '}' ) )
            // InternalQLS.g:6194:1: ( '}' )
            {
            // InternalQLS.g:6194:1: ( '}' )
            // InternalQLS.g:6195:2: '}'
            {
             before(grammarAccess.getDecimalValueTypeAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getDecimalValueTypeAccess().getRightCurlyBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group_3__2__Impl"


    // $ANTLR start "rule__DecimalValueType__Group_3_1__0"
    // InternalQLS.g:6205:1: rule__DecimalValueType__Group_3_1__0 : rule__DecimalValueType__Group_3_1__0__Impl rule__DecimalValueType__Group_3_1__1 ;
    public final void rule__DecimalValueType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6209:1: ( rule__DecimalValueType__Group_3_1__0__Impl rule__DecimalValueType__Group_3_1__1 )
            // InternalQLS.g:6210:2: rule__DecimalValueType__Group_3_1__0__Impl rule__DecimalValueType__Group_3_1__1
            {
            pushFollow(FOLLOW_50);
            rule__DecimalValueType__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecimalValueType__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group_3_1__0"


    // $ANTLR start "rule__DecimalValueType__Group_3_1__0__Impl"
    // InternalQLS.g:6217:1: rule__DecimalValueType__Group_3_1__0__Impl : ( 'unit' ) ;
    public final void rule__DecimalValueType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6221:1: ( ( 'unit' ) )
            // InternalQLS.g:6222:1: ( 'unit' )
            {
            // InternalQLS.g:6222:1: ( 'unit' )
            // InternalQLS.g:6223:2: 'unit'
            {
             before(grammarAccess.getDecimalValueTypeAccess().getUnitKeyword_3_1_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getDecimalValueTypeAccess().getUnitKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group_3_1__0__Impl"


    // $ANTLR start "rule__DecimalValueType__Group_3_1__1"
    // InternalQLS.g:6232:1: rule__DecimalValueType__Group_3_1__1 : rule__DecimalValueType__Group_3_1__1__Impl ;
    public final void rule__DecimalValueType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6236:1: ( rule__DecimalValueType__Group_3_1__1__Impl )
            // InternalQLS.g:6237:2: rule__DecimalValueType__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DecimalValueType__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group_3_1__1"


    // $ANTLR start "rule__DecimalValueType__Group_3_1__1__Impl"
    // InternalQLS.g:6243:1: rule__DecimalValueType__Group_3_1__1__Impl : ( ( rule__DecimalValueType__UnitAssignment_3_1_1 ) ) ;
    public final void rule__DecimalValueType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6247:1: ( ( ( rule__DecimalValueType__UnitAssignment_3_1_1 ) ) )
            // InternalQLS.g:6248:1: ( ( rule__DecimalValueType__UnitAssignment_3_1_1 ) )
            {
            // InternalQLS.g:6248:1: ( ( rule__DecimalValueType__UnitAssignment_3_1_1 ) )
            // InternalQLS.g:6249:2: ( rule__DecimalValueType__UnitAssignment_3_1_1 )
            {
             before(grammarAccess.getDecimalValueTypeAccess().getUnitAssignment_3_1_1()); 
            // InternalQLS.g:6250:2: ( rule__DecimalValueType__UnitAssignment_3_1_1 )
            // InternalQLS.g:6250:3: rule__DecimalValueType__UnitAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DecimalValueType__UnitAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDecimalValueTypeAccess().getUnitAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group_3_1__1__Impl"


    // $ANTLR start "rule__DateValueType__Group__0"
    // InternalQLS.g:6259:1: rule__DateValueType__Group__0 : rule__DateValueType__Group__0__Impl rule__DateValueType__Group__1 ;
    public final void rule__DateValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6263:1: ( rule__DateValueType__Group__0__Impl rule__DateValueType__Group__1 )
            // InternalQLS.g:6264:2: rule__DateValueType__Group__0__Impl rule__DateValueType__Group__1
            {
            pushFollow(FOLLOW_58);
            rule__DateValueType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateValueType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group__0"


    // $ANTLR start "rule__DateValueType__Group__0__Impl"
    // InternalQLS.g:6271:1: rule__DateValueType__Group__0__Impl : ( () ) ;
    public final void rule__DateValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6275:1: ( ( () ) )
            // InternalQLS.g:6276:1: ( () )
            {
            // InternalQLS.g:6276:1: ( () )
            // InternalQLS.g:6277:2: ()
            {
             before(grammarAccess.getDateValueTypeAccess().getDateValueTypeAction_0()); 
            // InternalQLS.g:6278:2: ()
            // InternalQLS.g:6278:3: 
            {
            }

             after(grammarAccess.getDateValueTypeAccess().getDateValueTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group__0__Impl"


    // $ANTLR start "rule__DateValueType__Group__1"
    // InternalQLS.g:6286:1: rule__DateValueType__Group__1 : rule__DateValueType__Group__1__Impl rule__DateValueType__Group__2 ;
    public final void rule__DateValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6290:1: ( rule__DateValueType__Group__1__Impl rule__DateValueType__Group__2 )
            // InternalQLS.g:6291:2: rule__DateValueType__Group__1__Impl rule__DateValueType__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__DateValueType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateValueType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group__1"


    // $ANTLR start "rule__DateValueType__Group__1__Impl"
    // InternalQLS.g:6298:1: rule__DateValueType__Group__1__Impl : ( 'dateType' ) ;
    public final void rule__DateValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6302:1: ( ( 'dateType' ) )
            // InternalQLS.g:6303:1: ( 'dateType' )
            {
            // InternalQLS.g:6303:1: ( 'dateType' )
            // InternalQLS.g:6304:2: 'dateType'
            {
             before(grammarAccess.getDateValueTypeAccess().getDateTypeKeyword_1()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getDateValueTypeAccess().getDateTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group__1__Impl"


    // $ANTLR start "rule__DateValueType__Group__2"
    // InternalQLS.g:6313:1: rule__DateValueType__Group__2 : rule__DateValueType__Group__2__Impl rule__DateValueType__Group__3 ;
    public final void rule__DateValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6317:1: ( rule__DateValueType__Group__2__Impl rule__DateValueType__Group__3 )
            // InternalQLS.g:6318:2: rule__DateValueType__Group__2__Impl rule__DateValueType__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__DateValueType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateValueType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group__2"


    // $ANTLR start "rule__DateValueType__Group__2__Impl"
    // InternalQLS.g:6325:1: rule__DateValueType__Group__2__Impl : ( ( rule__DateValueType__NameAssignment_2 ) ) ;
    public final void rule__DateValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6329:1: ( ( ( rule__DateValueType__NameAssignment_2 ) ) )
            // InternalQLS.g:6330:1: ( ( rule__DateValueType__NameAssignment_2 ) )
            {
            // InternalQLS.g:6330:1: ( ( rule__DateValueType__NameAssignment_2 ) )
            // InternalQLS.g:6331:2: ( rule__DateValueType__NameAssignment_2 )
            {
             before(grammarAccess.getDateValueTypeAccess().getNameAssignment_2()); 
            // InternalQLS.g:6332:2: ( rule__DateValueType__NameAssignment_2 )
            // InternalQLS.g:6332:3: rule__DateValueType__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DateValueType__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDateValueTypeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group__2__Impl"


    // $ANTLR start "rule__DateValueType__Group__3"
    // InternalQLS.g:6340:1: rule__DateValueType__Group__3 : rule__DateValueType__Group__3__Impl ;
    public final void rule__DateValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6344:1: ( rule__DateValueType__Group__3__Impl )
            // InternalQLS.g:6345:2: rule__DateValueType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DateValueType__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group__3"


    // $ANTLR start "rule__DateValueType__Group__3__Impl"
    // InternalQLS.g:6351:1: rule__DateValueType__Group__3__Impl : ( ( rule__DateValueType__Group_3__0 )? ) ;
    public final void rule__DateValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6355:1: ( ( ( rule__DateValueType__Group_3__0 )? ) )
            // InternalQLS.g:6356:1: ( ( rule__DateValueType__Group_3__0 )? )
            {
            // InternalQLS.g:6356:1: ( ( rule__DateValueType__Group_3__0 )? )
            // InternalQLS.g:6357:2: ( rule__DateValueType__Group_3__0 )?
            {
             before(grammarAccess.getDateValueTypeAccess().getGroup_3()); 
            // InternalQLS.g:6358:2: ( rule__DateValueType__Group_3__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==44) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalQLS.g:6358:3: rule__DateValueType__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DateValueType__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDateValueTypeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group__3__Impl"


    // $ANTLR start "rule__DateValueType__Group_3__0"
    // InternalQLS.g:6367:1: rule__DateValueType__Group_3__0 : rule__DateValueType__Group_3__0__Impl rule__DateValueType__Group_3__1 ;
    public final void rule__DateValueType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6371:1: ( rule__DateValueType__Group_3__0__Impl rule__DateValueType__Group_3__1 )
            // InternalQLS.g:6372:2: rule__DateValueType__Group_3__0__Impl rule__DateValueType__Group_3__1
            {
            pushFollow(FOLLOW_49);
            rule__DateValueType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateValueType__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group_3__0"


    // $ANTLR start "rule__DateValueType__Group_3__0__Impl"
    // InternalQLS.g:6379:1: rule__DateValueType__Group_3__0__Impl : ( '{' ) ;
    public final void rule__DateValueType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6383:1: ( ( '{' ) )
            // InternalQLS.g:6384:1: ( '{' )
            {
            // InternalQLS.g:6384:1: ( '{' )
            // InternalQLS.g:6385:2: '{'
            {
             before(grammarAccess.getDateValueTypeAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getDateValueTypeAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group_3__0__Impl"


    // $ANTLR start "rule__DateValueType__Group_3__1"
    // InternalQLS.g:6394:1: rule__DateValueType__Group_3__1 : rule__DateValueType__Group_3__1__Impl rule__DateValueType__Group_3__2 ;
    public final void rule__DateValueType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6398:1: ( rule__DateValueType__Group_3__1__Impl rule__DateValueType__Group_3__2 )
            // InternalQLS.g:6399:2: rule__DateValueType__Group_3__1__Impl rule__DateValueType__Group_3__2
            {
            pushFollow(FOLLOW_49);
            rule__DateValueType__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateValueType__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group_3__1"


    // $ANTLR start "rule__DateValueType__Group_3__1__Impl"
    // InternalQLS.g:6406:1: rule__DateValueType__Group_3__1__Impl : ( ( rule__DateValueType__Group_3_1__0 )? ) ;
    public final void rule__DateValueType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6410:1: ( ( ( rule__DateValueType__Group_3_1__0 )? ) )
            // InternalQLS.g:6411:1: ( ( rule__DateValueType__Group_3_1__0 )? )
            {
            // InternalQLS.g:6411:1: ( ( rule__DateValueType__Group_3_1__0 )? )
            // InternalQLS.g:6412:2: ( rule__DateValueType__Group_3_1__0 )?
            {
             before(grammarAccess.getDateValueTypeAccess().getGroup_3_1()); 
            // InternalQLS.g:6413:2: ( rule__DateValueType__Group_3_1__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==66) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalQLS.g:6413:3: rule__DateValueType__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DateValueType__Group_3_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDateValueTypeAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group_3__1__Impl"


    // $ANTLR start "rule__DateValueType__Group_3__2"
    // InternalQLS.g:6421:1: rule__DateValueType__Group_3__2 : rule__DateValueType__Group_3__2__Impl ;
    public final void rule__DateValueType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6425:1: ( rule__DateValueType__Group_3__2__Impl )
            // InternalQLS.g:6426:2: rule__DateValueType__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DateValueType__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group_3__2"


    // $ANTLR start "rule__DateValueType__Group_3__2__Impl"
    // InternalQLS.g:6432:1: rule__DateValueType__Group_3__2__Impl : ( '}' ) ;
    public final void rule__DateValueType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6436:1: ( ( '}' ) )
            // InternalQLS.g:6437:1: ( '}' )
            {
            // InternalQLS.g:6437:1: ( '}' )
            // InternalQLS.g:6438:2: '}'
            {
             before(grammarAccess.getDateValueTypeAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getDateValueTypeAccess().getRightCurlyBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group_3__2__Impl"


    // $ANTLR start "rule__DateValueType__Group_3_1__0"
    // InternalQLS.g:6448:1: rule__DateValueType__Group_3_1__0 : rule__DateValueType__Group_3_1__0__Impl rule__DateValueType__Group_3_1__1 ;
    public final void rule__DateValueType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6452:1: ( rule__DateValueType__Group_3_1__0__Impl rule__DateValueType__Group_3_1__1 )
            // InternalQLS.g:6453:2: rule__DateValueType__Group_3_1__0__Impl rule__DateValueType__Group_3_1__1
            {
            pushFollow(FOLLOW_50);
            rule__DateValueType__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateValueType__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group_3_1__0"


    // $ANTLR start "rule__DateValueType__Group_3_1__0__Impl"
    // InternalQLS.g:6460:1: rule__DateValueType__Group_3_1__0__Impl : ( 'unit' ) ;
    public final void rule__DateValueType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6464:1: ( ( 'unit' ) )
            // InternalQLS.g:6465:1: ( 'unit' )
            {
            // InternalQLS.g:6465:1: ( 'unit' )
            // InternalQLS.g:6466:2: 'unit'
            {
             before(grammarAccess.getDateValueTypeAccess().getUnitKeyword_3_1_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getDateValueTypeAccess().getUnitKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group_3_1__0__Impl"


    // $ANTLR start "rule__DateValueType__Group_3_1__1"
    // InternalQLS.g:6475:1: rule__DateValueType__Group_3_1__1 : rule__DateValueType__Group_3_1__1__Impl ;
    public final void rule__DateValueType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6479:1: ( rule__DateValueType__Group_3_1__1__Impl )
            // InternalQLS.g:6480:2: rule__DateValueType__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DateValueType__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group_3_1__1"


    // $ANTLR start "rule__DateValueType__Group_3_1__1__Impl"
    // InternalQLS.g:6486:1: rule__DateValueType__Group_3_1__1__Impl : ( ( rule__DateValueType__UnitAssignment_3_1_1 ) ) ;
    public final void rule__DateValueType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6490:1: ( ( ( rule__DateValueType__UnitAssignment_3_1_1 ) ) )
            // InternalQLS.g:6491:1: ( ( rule__DateValueType__UnitAssignment_3_1_1 ) )
            {
            // InternalQLS.g:6491:1: ( ( rule__DateValueType__UnitAssignment_3_1_1 ) )
            // InternalQLS.g:6492:2: ( rule__DateValueType__UnitAssignment_3_1_1 )
            {
             before(grammarAccess.getDateValueTypeAccess().getUnitAssignment_3_1_1()); 
            // InternalQLS.g:6493:2: ( rule__DateValueType__UnitAssignment_3_1_1 )
            // InternalQLS.g:6493:3: rule__DateValueType__UnitAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DateValueType__UnitAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDateValueTypeAccess().getUnitAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group_3_1__1__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group__0"
    // InternalQLS.g:6502:1: rule__EnumerationValueType__Group__0 : rule__EnumerationValueType__Group__0__Impl rule__EnumerationValueType__Group__1 ;
    public final void rule__EnumerationValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6506:1: ( rule__EnumerationValueType__Group__0__Impl rule__EnumerationValueType__Group__1 )
            // InternalQLS.g:6507:2: rule__EnumerationValueType__Group__0__Impl rule__EnumerationValueType__Group__1
            {
            pushFollow(FOLLOW_59);
            rule__EnumerationValueType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group__0"


    // $ANTLR start "rule__EnumerationValueType__Group__0__Impl"
    // InternalQLS.g:6514:1: rule__EnumerationValueType__Group__0__Impl : ( () ) ;
    public final void rule__EnumerationValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6518:1: ( ( () ) )
            // InternalQLS.g:6519:1: ( () )
            {
            // InternalQLS.g:6519:1: ( () )
            // InternalQLS.g:6520:2: ()
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getEnumerationValueTypeAction_0()); 
            // InternalQLS.g:6521:2: ()
            // InternalQLS.g:6521:3: 
            {
            }

             after(grammarAccess.getEnumerationValueTypeAccess().getEnumerationValueTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group__0__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group__1"
    // InternalQLS.g:6529:1: rule__EnumerationValueType__Group__1 : rule__EnumerationValueType__Group__1__Impl rule__EnumerationValueType__Group__2 ;
    public final void rule__EnumerationValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6533:1: ( rule__EnumerationValueType__Group__1__Impl rule__EnumerationValueType__Group__2 )
            // InternalQLS.g:6534:2: rule__EnumerationValueType__Group__1__Impl rule__EnumerationValueType__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__EnumerationValueType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group__1"


    // $ANTLR start "rule__EnumerationValueType__Group__1__Impl"
    // InternalQLS.g:6541:1: rule__EnumerationValueType__Group__1__Impl : ( 'enumerationType' ) ;
    public final void rule__EnumerationValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6545:1: ( ( 'enumerationType' ) )
            // InternalQLS.g:6546:1: ( 'enumerationType' )
            {
            // InternalQLS.g:6546:1: ( 'enumerationType' )
            // InternalQLS.g:6547:2: 'enumerationType'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getEnumerationTypeKeyword_1()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getEnumerationValueTypeAccess().getEnumerationTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group__1__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group__2"
    // InternalQLS.g:6556:1: rule__EnumerationValueType__Group__2 : rule__EnumerationValueType__Group__2__Impl rule__EnumerationValueType__Group__3 ;
    public final void rule__EnumerationValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6560:1: ( rule__EnumerationValueType__Group__2__Impl rule__EnumerationValueType__Group__3 )
            // InternalQLS.g:6561:2: rule__EnumerationValueType__Group__2__Impl rule__EnumerationValueType__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__EnumerationValueType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group__2"


    // $ANTLR start "rule__EnumerationValueType__Group__2__Impl"
    // InternalQLS.g:6568:1: rule__EnumerationValueType__Group__2__Impl : ( ( rule__EnumerationValueType__NameAssignment_2 ) ) ;
    public final void rule__EnumerationValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6572:1: ( ( ( rule__EnumerationValueType__NameAssignment_2 ) ) )
            // InternalQLS.g:6573:1: ( ( rule__EnumerationValueType__NameAssignment_2 ) )
            {
            // InternalQLS.g:6573:1: ( ( rule__EnumerationValueType__NameAssignment_2 ) )
            // InternalQLS.g:6574:2: ( rule__EnumerationValueType__NameAssignment_2 )
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getNameAssignment_2()); 
            // InternalQLS.g:6575:2: ( rule__EnumerationValueType__NameAssignment_2 )
            // InternalQLS.g:6575:3: rule__EnumerationValueType__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationValueTypeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group__2__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group__3"
    // InternalQLS.g:6583:1: rule__EnumerationValueType__Group__3 : rule__EnumerationValueType__Group__3__Impl ;
    public final void rule__EnumerationValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6587:1: ( rule__EnumerationValueType__Group__3__Impl )
            // InternalQLS.g:6588:2: rule__EnumerationValueType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group__3"


    // $ANTLR start "rule__EnumerationValueType__Group__3__Impl"
    // InternalQLS.g:6594:1: rule__EnumerationValueType__Group__3__Impl : ( ( rule__EnumerationValueType__Group_3__0 )? ) ;
    public final void rule__EnumerationValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6598:1: ( ( ( rule__EnumerationValueType__Group_3__0 )? ) )
            // InternalQLS.g:6599:1: ( ( rule__EnumerationValueType__Group_3__0 )? )
            {
            // InternalQLS.g:6599:1: ( ( rule__EnumerationValueType__Group_3__0 )? )
            // InternalQLS.g:6600:2: ( rule__EnumerationValueType__Group_3__0 )?
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getGroup_3()); 
            // InternalQLS.g:6601:2: ( rule__EnumerationValueType__Group_3__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==44) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalQLS.g:6601:3: rule__EnumerationValueType__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumerationValueType__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumerationValueTypeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group__3__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_3__0"
    // InternalQLS.g:6610:1: rule__EnumerationValueType__Group_3__0 : rule__EnumerationValueType__Group_3__0__Impl rule__EnumerationValueType__Group_3__1 ;
    public final void rule__EnumerationValueType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6614:1: ( rule__EnumerationValueType__Group_3__0__Impl rule__EnumerationValueType__Group_3__1 )
            // InternalQLS.g:6615:2: rule__EnumerationValueType__Group_3__0__Impl rule__EnumerationValueType__Group_3__1
            {
            pushFollow(FOLLOW_60);
            rule__EnumerationValueType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3__0"


    // $ANTLR start "rule__EnumerationValueType__Group_3__0__Impl"
    // InternalQLS.g:6622:1: rule__EnumerationValueType__Group_3__0__Impl : ( '{' ) ;
    public final void rule__EnumerationValueType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6626:1: ( ( '{' ) )
            // InternalQLS.g:6627:1: ( '{' )
            {
            // InternalQLS.g:6627:1: ( '{' )
            // InternalQLS.g:6628:2: '{'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getEnumerationValueTypeAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3__0__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_3__1"
    // InternalQLS.g:6637:1: rule__EnumerationValueType__Group_3__1 : rule__EnumerationValueType__Group_3__1__Impl rule__EnumerationValueType__Group_3__2 ;
    public final void rule__EnumerationValueType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6641:1: ( rule__EnumerationValueType__Group_3__1__Impl rule__EnumerationValueType__Group_3__2 )
            // InternalQLS.g:6642:2: rule__EnumerationValueType__Group_3__1__Impl rule__EnumerationValueType__Group_3__2
            {
            pushFollow(FOLLOW_60);
            rule__EnumerationValueType__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3__1"


    // $ANTLR start "rule__EnumerationValueType__Group_3__1__Impl"
    // InternalQLS.g:6649:1: rule__EnumerationValueType__Group_3__1__Impl : ( ( rule__EnumerationValueType__Group_3_1__0 )? ) ;
    public final void rule__EnumerationValueType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6653:1: ( ( ( rule__EnumerationValueType__Group_3_1__0 )? ) )
            // InternalQLS.g:6654:1: ( ( rule__EnumerationValueType__Group_3_1__0 )? )
            {
            // InternalQLS.g:6654:1: ( ( rule__EnumerationValueType__Group_3_1__0 )? )
            // InternalQLS.g:6655:2: ( rule__EnumerationValueType__Group_3_1__0 )?
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getGroup_3_1()); 
            // InternalQLS.g:6656:2: ( rule__EnumerationValueType__Group_3_1__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==66) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalQLS.g:6656:3: rule__EnumerationValueType__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumerationValueType__Group_3_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumerationValueTypeAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3__1__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_3__2"
    // InternalQLS.g:6664:1: rule__EnumerationValueType__Group_3__2 : rule__EnumerationValueType__Group_3__2__Impl rule__EnumerationValueType__Group_3__3 ;
    public final void rule__EnumerationValueType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6668:1: ( rule__EnumerationValueType__Group_3__2__Impl rule__EnumerationValueType__Group_3__3 )
            // InternalQLS.g:6669:2: rule__EnumerationValueType__Group_3__2__Impl rule__EnumerationValueType__Group_3__3
            {
            pushFollow(FOLLOW_60);
            rule__EnumerationValueType__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3__2"


    // $ANTLR start "rule__EnumerationValueType__Group_3__2__Impl"
    // InternalQLS.g:6676:1: rule__EnumerationValueType__Group_3__2__Impl : ( ( rule__EnumerationValueType__Group_3_2__0 )? ) ;
    public final void rule__EnumerationValueType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6680:1: ( ( ( rule__EnumerationValueType__Group_3_2__0 )? ) )
            // InternalQLS.g:6681:1: ( ( rule__EnumerationValueType__Group_3_2__0 )? )
            {
            // InternalQLS.g:6681:1: ( ( rule__EnumerationValueType__Group_3_2__0 )? )
            // InternalQLS.g:6682:2: ( rule__EnumerationValueType__Group_3_2__0 )?
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getGroup_3_2()); 
            // InternalQLS.g:6683:2: ( rule__EnumerationValueType__Group_3_2__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==74) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalQLS.g:6683:3: rule__EnumerationValueType__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumerationValueType__Group_3_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumerationValueTypeAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3__2__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_3__3"
    // InternalQLS.g:6691:1: rule__EnumerationValueType__Group_3__3 : rule__EnumerationValueType__Group_3__3__Impl ;
    public final void rule__EnumerationValueType__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6695:1: ( rule__EnumerationValueType__Group_3__3__Impl )
            // InternalQLS.g:6696:2: rule__EnumerationValueType__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3__3"


    // $ANTLR start "rule__EnumerationValueType__Group_3__3__Impl"
    // InternalQLS.g:6702:1: rule__EnumerationValueType__Group_3__3__Impl : ( '}' ) ;
    public final void rule__EnumerationValueType__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6706:1: ( ( '}' ) )
            // InternalQLS.g:6707:1: ( '}' )
            {
            // InternalQLS.g:6707:1: ( '}' )
            // InternalQLS.g:6708:2: '}'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getEnumerationValueTypeAccess().getRightCurlyBracketKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3__3__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_3_1__0"
    // InternalQLS.g:6718:1: rule__EnumerationValueType__Group_3_1__0 : rule__EnumerationValueType__Group_3_1__0__Impl rule__EnumerationValueType__Group_3_1__1 ;
    public final void rule__EnumerationValueType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6722:1: ( rule__EnumerationValueType__Group_3_1__0__Impl rule__EnumerationValueType__Group_3_1__1 )
            // InternalQLS.g:6723:2: rule__EnumerationValueType__Group_3_1__0__Impl rule__EnumerationValueType__Group_3_1__1
            {
            pushFollow(FOLLOW_50);
            rule__EnumerationValueType__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3_1__0"


    // $ANTLR start "rule__EnumerationValueType__Group_3_1__0__Impl"
    // InternalQLS.g:6730:1: rule__EnumerationValueType__Group_3_1__0__Impl : ( 'unit' ) ;
    public final void rule__EnumerationValueType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6734:1: ( ( 'unit' ) )
            // InternalQLS.g:6735:1: ( 'unit' )
            {
            // InternalQLS.g:6735:1: ( 'unit' )
            // InternalQLS.g:6736:2: 'unit'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getUnitKeyword_3_1_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getEnumerationValueTypeAccess().getUnitKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3_1__0__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_3_1__1"
    // InternalQLS.g:6745:1: rule__EnumerationValueType__Group_3_1__1 : rule__EnumerationValueType__Group_3_1__1__Impl ;
    public final void rule__EnumerationValueType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6749:1: ( rule__EnumerationValueType__Group_3_1__1__Impl )
            // InternalQLS.g:6750:2: rule__EnumerationValueType__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3_1__1"


    // $ANTLR start "rule__EnumerationValueType__Group_3_1__1__Impl"
    // InternalQLS.g:6756:1: rule__EnumerationValueType__Group_3_1__1__Impl : ( ( rule__EnumerationValueType__UnitAssignment_3_1_1 ) ) ;
    public final void rule__EnumerationValueType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6760:1: ( ( ( rule__EnumerationValueType__UnitAssignment_3_1_1 ) ) )
            // InternalQLS.g:6761:1: ( ( rule__EnumerationValueType__UnitAssignment_3_1_1 ) )
            {
            // InternalQLS.g:6761:1: ( ( rule__EnumerationValueType__UnitAssignment_3_1_1 ) )
            // InternalQLS.g:6762:2: ( rule__EnumerationValueType__UnitAssignment_3_1_1 )
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getUnitAssignment_3_1_1()); 
            // InternalQLS.g:6763:2: ( rule__EnumerationValueType__UnitAssignment_3_1_1 )
            // InternalQLS.g:6763:3: rule__EnumerationValueType__UnitAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__UnitAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationValueTypeAccess().getUnitAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3_1__1__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_3_2__0"
    // InternalQLS.g:6772:1: rule__EnumerationValueType__Group_3_2__0 : rule__EnumerationValueType__Group_3_2__0__Impl rule__EnumerationValueType__Group_3_2__1 ;
    public final void rule__EnumerationValueType__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6776:1: ( rule__EnumerationValueType__Group_3_2__0__Impl rule__EnumerationValueType__Group_3_2__1 )
            // InternalQLS.g:6777:2: rule__EnumerationValueType__Group_3_2__0__Impl rule__EnumerationValueType__Group_3_2__1
            {
            pushFollow(FOLLOW_5);
            rule__EnumerationValueType__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3_2__0"


    // $ANTLR start "rule__EnumerationValueType__Group_3_2__0__Impl"
    // InternalQLS.g:6784:1: rule__EnumerationValueType__Group_3_2__0__Impl : ( 'literals' ) ;
    public final void rule__EnumerationValueType__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6788:1: ( ( 'literals' ) )
            // InternalQLS.g:6789:1: ( 'literals' )
            {
            // InternalQLS.g:6789:1: ( 'literals' )
            // InternalQLS.g:6790:2: 'literals'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getLiteralsKeyword_3_2_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getEnumerationValueTypeAccess().getLiteralsKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3_2__0__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_3_2__1"
    // InternalQLS.g:6799:1: rule__EnumerationValueType__Group_3_2__1 : rule__EnumerationValueType__Group_3_2__1__Impl rule__EnumerationValueType__Group_3_2__2 ;
    public final void rule__EnumerationValueType__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6803:1: ( rule__EnumerationValueType__Group_3_2__1__Impl rule__EnumerationValueType__Group_3_2__2 )
            // InternalQLS.g:6804:2: rule__EnumerationValueType__Group_3_2__1__Impl rule__EnumerationValueType__Group_3_2__2
            {
            pushFollow(FOLLOW_12);
            rule__EnumerationValueType__Group_3_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_3_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3_2__1"


    // $ANTLR start "rule__EnumerationValueType__Group_3_2__1__Impl"
    // InternalQLS.g:6811:1: rule__EnumerationValueType__Group_3_2__1__Impl : ( '{' ) ;
    public final void rule__EnumerationValueType__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6815:1: ( ( '{' ) )
            // InternalQLS.g:6816:1: ( '{' )
            {
            // InternalQLS.g:6816:1: ( '{' )
            // InternalQLS.g:6817:2: '{'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getLeftCurlyBracketKeyword_3_2_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getEnumerationValueTypeAccess().getLeftCurlyBracketKeyword_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3_2__1__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_3_2__2"
    // InternalQLS.g:6826:1: rule__EnumerationValueType__Group_3_2__2 : rule__EnumerationValueType__Group_3_2__2__Impl rule__EnumerationValueType__Group_3_2__3 ;
    public final void rule__EnumerationValueType__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6830:1: ( rule__EnumerationValueType__Group_3_2__2__Impl rule__EnumerationValueType__Group_3_2__3 )
            // InternalQLS.g:6831:2: rule__EnumerationValueType__Group_3_2__2__Impl rule__EnumerationValueType__Group_3_2__3
            {
            pushFollow(FOLLOW_61);
            rule__EnumerationValueType__Group_3_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_3_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3_2__2"


    // $ANTLR start "rule__EnumerationValueType__Group_3_2__2__Impl"
    // InternalQLS.g:6838:1: rule__EnumerationValueType__Group_3_2__2__Impl : ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2 ) ) ;
    public final void rule__EnumerationValueType__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6842:1: ( ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2 ) ) )
            // InternalQLS.g:6843:1: ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2 ) )
            {
            // InternalQLS.g:6843:1: ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2 ) )
            // InternalQLS.g:6844:2: ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2 )
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsAssignment_3_2_2()); 
            // InternalQLS.g:6845:2: ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2 )
            // InternalQLS.g:6845:3: rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsAssignment_3_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3_2__2__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_3_2__3"
    // InternalQLS.g:6853:1: rule__EnumerationValueType__Group_3_2__3 : rule__EnumerationValueType__Group_3_2__3__Impl rule__EnumerationValueType__Group_3_2__4 ;
    public final void rule__EnumerationValueType__Group_3_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6857:1: ( rule__EnumerationValueType__Group_3_2__3__Impl rule__EnumerationValueType__Group_3_2__4 )
            // InternalQLS.g:6858:2: rule__EnumerationValueType__Group_3_2__3__Impl rule__EnumerationValueType__Group_3_2__4
            {
            pushFollow(FOLLOW_61);
            rule__EnumerationValueType__Group_3_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_3_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3_2__3"


    // $ANTLR start "rule__EnumerationValueType__Group_3_2__3__Impl"
    // InternalQLS.g:6865:1: rule__EnumerationValueType__Group_3_2__3__Impl : ( ( rule__EnumerationValueType__Group_3_2_3__0 )* ) ;
    public final void rule__EnumerationValueType__Group_3_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6869:1: ( ( ( rule__EnumerationValueType__Group_3_2_3__0 )* ) )
            // InternalQLS.g:6870:1: ( ( rule__EnumerationValueType__Group_3_2_3__0 )* )
            {
            // InternalQLS.g:6870:1: ( ( rule__EnumerationValueType__Group_3_2_3__0 )* )
            // InternalQLS.g:6871:2: ( rule__EnumerationValueType__Group_3_2_3__0 )*
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getGroup_3_2_3()); 
            // InternalQLS.g:6872:2: ( rule__EnumerationValueType__Group_3_2_3__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==75) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalQLS.g:6872:3: rule__EnumerationValueType__Group_3_2_3__0
            	    {
            	    pushFollow(FOLLOW_62);
            	    rule__EnumerationValueType__Group_3_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

             after(grammarAccess.getEnumerationValueTypeAccess().getGroup_3_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3_2__3__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_3_2__4"
    // InternalQLS.g:6880:1: rule__EnumerationValueType__Group_3_2__4 : rule__EnumerationValueType__Group_3_2__4__Impl ;
    public final void rule__EnumerationValueType__Group_3_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6884:1: ( rule__EnumerationValueType__Group_3_2__4__Impl )
            // InternalQLS.g:6885:2: rule__EnumerationValueType__Group_3_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_3_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3_2__4"


    // $ANTLR start "rule__EnumerationValueType__Group_3_2__4__Impl"
    // InternalQLS.g:6891:1: rule__EnumerationValueType__Group_3_2__4__Impl : ( '}' ) ;
    public final void rule__EnumerationValueType__Group_3_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6895:1: ( ( '}' ) )
            // InternalQLS.g:6896:1: ( '}' )
            {
            // InternalQLS.g:6896:1: ( '}' )
            // InternalQLS.g:6897:2: '}'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getRightCurlyBracketKeyword_3_2_4()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getEnumerationValueTypeAccess().getRightCurlyBracketKeyword_3_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3_2__4__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_3_2_3__0"
    // InternalQLS.g:6907:1: rule__EnumerationValueType__Group_3_2_3__0 : rule__EnumerationValueType__Group_3_2_3__0__Impl rule__EnumerationValueType__Group_3_2_3__1 ;
    public final void rule__EnumerationValueType__Group_3_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6911:1: ( rule__EnumerationValueType__Group_3_2_3__0__Impl rule__EnumerationValueType__Group_3_2_3__1 )
            // InternalQLS.g:6912:2: rule__EnumerationValueType__Group_3_2_3__0__Impl rule__EnumerationValueType__Group_3_2_3__1
            {
            pushFollow(FOLLOW_12);
            rule__EnumerationValueType__Group_3_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_3_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3_2_3__0"


    // $ANTLR start "rule__EnumerationValueType__Group_3_2_3__0__Impl"
    // InternalQLS.g:6919:1: rule__EnumerationValueType__Group_3_2_3__0__Impl : ( ',' ) ;
    public final void rule__EnumerationValueType__Group_3_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6923:1: ( ( ',' ) )
            // InternalQLS.g:6924:1: ( ',' )
            {
            // InternalQLS.g:6924:1: ( ',' )
            // InternalQLS.g:6925:2: ','
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getCommaKeyword_3_2_3_0()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getEnumerationValueTypeAccess().getCommaKeyword_3_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3_2_3__0__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_3_2_3__1"
    // InternalQLS.g:6934:1: rule__EnumerationValueType__Group_3_2_3__1 : rule__EnumerationValueType__Group_3_2_3__1__Impl ;
    public final void rule__EnumerationValueType__Group_3_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6938:1: ( rule__EnumerationValueType__Group_3_2_3__1__Impl )
            // InternalQLS.g:6939:2: rule__EnumerationValueType__Group_3_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_3_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3_2_3__1"


    // $ANTLR start "rule__EnumerationValueType__Group_3_2_3__1__Impl"
    // InternalQLS.g:6945:1: rule__EnumerationValueType__Group_3_2_3__1__Impl : ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1 ) ) ;
    public final void rule__EnumerationValueType__Group_3_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6949:1: ( ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1 ) ) )
            // InternalQLS.g:6950:1: ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1 ) )
            {
            // InternalQLS.g:6950:1: ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1 ) )
            // InternalQLS.g:6951:2: ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1 )
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsAssignment_3_2_3_1()); 
            // InternalQLS.g:6952:2: ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1 )
            // InternalQLS.g:6952:3: rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsAssignment_3_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3_2_3__1__Impl"


    // $ANTLR start "rule__StringValueType__Group__0"
    // InternalQLS.g:6961:1: rule__StringValueType__Group__0 : rule__StringValueType__Group__0__Impl rule__StringValueType__Group__1 ;
    public final void rule__StringValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6965:1: ( rule__StringValueType__Group__0__Impl rule__StringValueType__Group__1 )
            // InternalQLS.g:6966:2: rule__StringValueType__Group__0__Impl rule__StringValueType__Group__1
            {
            pushFollow(FOLLOW_63);
            rule__StringValueType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringValueType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group__0"


    // $ANTLR start "rule__StringValueType__Group__0__Impl"
    // InternalQLS.g:6973:1: rule__StringValueType__Group__0__Impl : ( () ) ;
    public final void rule__StringValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6977:1: ( ( () ) )
            // InternalQLS.g:6978:1: ( () )
            {
            // InternalQLS.g:6978:1: ( () )
            // InternalQLS.g:6979:2: ()
            {
             before(grammarAccess.getStringValueTypeAccess().getStringValueTypeAction_0()); 
            // InternalQLS.g:6980:2: ()
            // InternalQLS.g:6980:3: 
            {
            }

             after(grammarAccess.getStringValueTypeAccess().getStringValueTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group__0__Impl"


    // $ANTLR start "rule__StringValueType__Group__1"
    // InternalQLS.g:6988:1: rule__StringValueType__Group__1 : rule__StringValueType__Group__1__Impl rule__StringValueType__Group__2 ;
    public final void rule__StringValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6992:1: ( rule__StringValueType__Group__1__Impl rule__StringValueType__Group__2 )
            // InternalQLS.g:6993:2: rule__StringValueType__Group__1__Impl rule__StringValueType__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__StringValueType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringValueType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group__1"


    // $ANTLR start "rule__StringValueType__Group__1__Impl"
    // InternalQLS.g:7000:1: rule__StringValueType__Group__1__Impl : ( 'StringType' ) ;
    public final void rule__StringValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7004:1: ( ( 'StringType' ) )
            // InternalQLS.g:7005:1: ( 'StringType' )
            {
            // InternalQLS.g:7005:1: ( 'StringType' )
            // InternalQLS.g:7006:2: 'StringType'
            {
             before(grammarAccess.getStringValueTypeAccess().getStringTypeKeyword_1()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getStringValueTypeAccess().getStringTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group__1__Impl"


    // $ANTLR start "rule__StringValueType__Group__2"
    // InternalQLS.g:7015:1: rule__StringValueType__Group__2 : rule__StringValueType__Group__2__Impl rule__StringValueType__Group__3 ;
    public final void rule__StringValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7019:1: ( rule__StringValueType__Group__2__Impl rule__StringValueType__Group__3 )
            // InternalQLS.g:7020:2: rule__StringValueType__Group__2__Impl rule__StringValueType__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__StringValueType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringValueType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group__2"


    // $ANTLR start "rule__StringValueType__Group__2__Impl"
    // InternalQLS.g:7027:1: rule__StringValueType__Group__2__Impl : ( ( rule__StringValueType__NameAssignment_2 ) ) ;
    public final void rule__StringValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7031:1: ( ( ( rule__StringValueType__NameAssignment_2 ) ) )
            // InternalQLS.g:7032:1: ( ( rule__StringValueType__NameAssignment_2 ) )
            {
            // InternalQLS.g:7032:1: ( ( rule__StringValueType__NameAssignment_2 ) )
            // InternalQLS.g:7033:2: ( rule__StringValueType__NameAssignment_2 )
            {
             before(grammarAccess.getStringValueTypeAccess().getNameAssignment_2()); 
            // InternalQLS.g:7034:2: ( rule__StringValueType__NameAssignment_2 )
            // InternalQLS.g:7034:3: rule__StringValueType__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StringValueType__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStringValueTypeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group__2__Impl"


    // $ANTLR start "rule__StringValueType__Group__3"
    // InternalQLS.g:7042:1: rule__StringValueType__Group__3 : rule__StringValueType__Group__3__Impl ;
    public final void rule__StringValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7046:1: ( rule__StringValueType__Group__3__Impl )
            // InternalQLS.g:7047:2: rule__StringValueType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringValueType__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group__3"


    // $ANTLR start "rule__StringValueType__Group__3__Impl"
    // InternalQLS.g:7053:1: rule__StringValueType__Group__3__Impl : ( ( rule__StringValueType__Group_3__0 )? ) ;
    public final void rule__StringValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7057:1: ( ( ( rule__StringValueType__Group_3__0 )? ) )
            // InternalQLS.g:7058:1: ( ( rule__StringValueType__Group_3__0 )? )
            {
            // InternalQLS.g:7058:1: ( ( rule__StringValueType__Group_3__0 )? )
            // InternalQLS.g:7059:2: ( rule__StringValueType__Group_3__0 )?
            {
             before(grammarAccess.getStringValueTypeAccess().getGroup_3()); 
            // InternalQLS.g:7060:2: ( rule__StringValueType__Group_3__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==44) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalQLS.g:7060:3: rule__StringValueType__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringValueType__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringValueTypeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group__3__Impl"


    // $ANTLR start "rule__StringValueType__Group_3__0"
    // InternalQLS.g:7069:1: rule__StringValueType__Group_3__0 : rule__StringValueType__Group_3__0__Impl rule__StringValueType__Group_3__1 ;
    public final void rule__StringValueType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7073:1: ( rule__StringValueType__Group_3__0__Impl rule__StringValueType__Group_3__1 )
            // InternalQLS.g:7074:2: rule__StringValueType__Group_3__0__Impl rule__StringValueType__Group_3__1
            {
            pushFollow(FOLLOW_49);
            rule__StringValueType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringValueType__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group_3__0"


    // $ANTLR start "rule__StringValueType__Group_3__0__Impl"
    // InternalQLS.g:7081:1: rule__StringValueType__Group_3__0__Impl : ( '{' ) ;
    public final void rule__StringValueType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7085:1: ( ( '{' ) )
            // InternalQLS.g:7086:1: ( '{' )
            {
            // InternalQLS.g:7086:1: ( '{' )
            // InternalQLS.g:7087:2: '{'
            {
             before(grammarAccess.getStringValueTypeAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getStringValueTypeAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group_3__0__Impl"


    // $ANTLR start "rule__StringValueType__Group_3__1"
    // InternalQLS.g:7096:1: rule__StringValueType__Group_3__1 : rule__StringValueType__Group_3__1__Impl rule__StringValueType__Group_3__2 ;
    public final void rule__StringValueType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7100:1: ( rule__StringValueType__Group_3__1__Impl rule__StringValueType__Group_3__2 )
            // InternalQLS.g:7101:2: rule__StringValueType__Group_3__1__Impl rule__StringValueType__Group_3__2
            {
            pushFollow(FOLLOW_49);
            rule__StringValueType__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringValueType__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group_3__1"


    // $ANTLR start "rule__StringValueType__Group_3__1__Impl"
    // InternalQLS.g:7108:1: rule__StringValueType__Group_3__1__Impl : ( ( rule__StringValueType__Group_3_1__0 )? ) ;
    public final void rule__StringValueType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7112:1: ( ( ( rule__StringValueType__Group_3_1__0 )? ) )
            // InternalQLS.g:7113:1: ( ( rule__StringValueType__Group_3_1__0 )? )
            {
            // InternalQLS.g:7113:1: ( ( rule__StringValueType__Group_3_1__0 )? )
            // InternalQLS.g:7114:2: ( rule__StringValueType__Group_3_1__0 )?
            {
             before(grammarAccess.getStringValueTypeAccess().getGroup_3_1()); 
            // InternalQLS.g:7115:2: ( rule__StringValueType__Group_3_1__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==66) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalQLS.g:7115:3: rule__StringValueType__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringValueType__Group_3_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringValueTypeAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group_3__1__Impl"


    // $ANTLR start "rule__StringValueType__Group_3__2"
    // InternalQLS.g:7123:1: rule__StringValueType__Group_3__2 : rule__StringValueType__Group_3__2__Impl ;
    public final void rule__StringValueType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7127:1: ( rule__StringValueType__Group_3__2__Impl )
            // InternalQLS.g:7128:2: rule__StringValueType__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringValueType__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group_3__2"


    // $ANTLR start "rule__StringValueType__Group_3__2__Impl"
    // InternalQLS.g:7134:1: rule__StringValueType__Group_3__2__Impl : ( '}' ) ;
    public final void rule__StringValueType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7138:1: ( ( '}' ) )
            // InternalQLS.g:7139:1: ( '}' )
            {
            // InternalQLS.g:7139:1: ( '}' )
            // InternalQLS.g:7140:2: '}'
            {
             before(grammarAccess.getStringValueTypeAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getStringValueTypeAccess().getRightCurlyBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group_3__2__Impl"


    // $ANTLR start "rule__StringValueType__Group_3_1__0"
    // InternalQLS.g:7150:1: rule__StringValueType__Group_3_1__0 : rule__StringValueType__Group_3_1__0__Impl rule__StringValueType__Group_3_1__1 ;
    public final void rule__StringValueType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7154:1: ( rule__StringValueType__Group_3_1__0__Impl rule__StringValueType__Group_3_1__1 )
            // InternalQLS.g:7155:2: rule__StringValueType__Group_3_1__0__Impl rule__StringValueType__Group_3_1__1
            {
            pushFollow(FOLLOW_50);
            rule__StringValueType__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringValueType__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group_3_1__0"


    // $ANTLR start "rule__StringValueType__Group_3_1__0__Impl"
    // InternalQLS.g:7162:1: rule__StringValueType__Group_3_1__0__Impl : ( 'unit' ) ;
    public final void rule__StringValueType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7166:1: ( ( 'unit' ) )
            // InternalQLS.g:7167:1: ( 'unit' )
            {
            // InternalQLS.g:7167:1: ( 'unit' )
            // InternalQLS.g:7168:2: 'unit'
            {
             before(grammarAccess.getStringValueTypeAccess().getUnitKeyword_3_1_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getStringValueTypeAccess().getUnitKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group_3_1__0__Impl"


    // $ANTLR start "rule__StringValueType__Group_3_1__1"
    // InternalQLS.g:7177:1: rule__StringValueType__Group_3_1__1 : rule__StringValueType__Group_3_1__1__Impl ;
    public final void rule__StringValueType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7181:1: ( rule__StringValueType__Group_3_1__1__Impl )
            // InternalQLS.g:7182:2: rule__StringValueType__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringValueType__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group_3_1__1"


    // $ANTLR start "rule__StringValueType__Group_3_1__1__Impl"
    // InternalQLS.g:7188:1: rule__StringValueType__Group_3_1__1__Impl : ( ( rule__StringValueType__UnitAssignment_3_1_1 ) ) ;
    public final void rule__StringValueType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7192:1: ( ( ( rule__StringValueType__UnitAssignment_3_1_1 ) ) )
            // InternalQLS.g:7193:1: ( ( rule__StringValueType__UnitAssignment_3_1_1 ) )
            {
            // InternalQLS.g:7193:1: ( ( rule__StringValueType__UnitAssignment_3_1_1 ) )
            // InternalQLS.g:7194:2: ( rule__StringValueType__UnitAssignment_3_1_1 )
            {
             before(grammarAccess.getStringValueTypeAccess().getUnitAssignment_3_1_1()); 
            // InternalQLS.g:7195:2: ( rule__StringValueType__UnitAssignment_3_1_1 )
            // InternalQLS.g:7195:3: rule__StringValueType__UnitAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__StringValueType__UnitAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStringValueTypeAccess().getUnitAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group_3_1__1__Impl"


    // $ANTLR start "rule__EnumerationLiteral__Group__0"
    // InternalQLS.g:7204:1: rule__EnumerationLiteral__Group__0 : rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 ;
    public final void rule__EnumerationLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7208:1: ( rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 )
            // InternalQLS.g:7209:2: rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__EnumerationLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__0"


    // $ANTLR start "rule__EnumerationLiteral__Group__0__Impl"
    // InternalQLS.g:7216:1: rule__EnumerationLiteral__Group__0__Impl : ( () ) ;
    public final void rule__EnumerationLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7220:1: ( ( () ) )
            // InternalQLS.g:7221:1: ( () )
            {
            // InternalQLS.g:7221:1: ( () )
            // InternalQLS.g:7222:2: ()
            {
             before(grammarAccess.getEnumerationLiteralAccess().getEnumerationLiteralAction_0()); 
            // InternalQLS.g:7223:2: ()
            // InternalQLS.g:7223:3: 
            {
            }

             after(grammarAccess.getEnumerationLiteralAccess().getEnumerationLiteralAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__0__Impl"


    // $ANTLR start "rule__EnumerationLiteral__Group__1"
    // InternalQLS.g:7231:1: rule__EnumerationLiteral__Group__1 : rule__EnumerationLiteral__Group__1__Impl ;
    public final void rule__EnumerationLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7235:1: ( rule__EnumerationLiteral__Group__1__Impl )
            // InternalQLS.g:7236:2: rule__EnumerationLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationLiteral__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__1"


    // $ANTLR start "rule__EnumerationLiteral__Group__1__Impl"
    // InternalQLS.g:7242:1: rule__EnumerationLiteral__Group__1__Impl : ( ( rule__EnumerationLiteral__NameAssignment_1 ) ) ;
    public final void rule__EnumerationLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7246:1: ( ( ( rule__EnumerationLiteral__NameAssignment_1 ) ) )
            // InternalQLS.g:7247:1: ( ( rule__EnumerationLiteral__NameAssignment_1 ) )
            {
            // InternalQLS.g:7247:1: ( ( rule__EnumerationLiteral__NameAssignment_1 ) )
            // InternalQLS.g:7248:2: ( rule__EnumerationLiteral__NameAssignment_1 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_1()); 
            // InternalQLS.g:7249:2: ( rule__EnumerationLiteral__NameAssignment_1 )
            // InternalQLS.g:7249:3: rule__EnumerationLiteral__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationLiteral__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__1__Impl"


    // $ANTLR start "rule__IntegerValue__Group__0"
    // InternalQLS.g:7258:1: rule__IntegerValue__Group__0 : rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1 ;
    public final void rule__IntegerValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7262:1: ( rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1 )
            // InternalQLS.g:7263:2: rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1
            {
            pushFollow(FOLLOW_56);
            rule__IntegerValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group__0"


    // $ANTLR start "rule__IntegerValue__Group__0__Impl"
    // InternalQLS.g:7270:1: rule__IntegerValue__Group__0__Impl : ( () ) ;
    public final void rule__IntegerValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7274:1: ( ( () ) )
            // InternalQLS.g:7275:1: ( () )
            {
            // InternalQLS.g:7275:1: ( () )
            // InternalQLS.g:7276:2: ()
            {
             before(grammarAccess.getIntegerValueAccess().getIntegerValueAction_0()); 
            // InternalQLS.g:7277:2: ()
            // InternalQLS.g:7277:3: 
            {
            }

             after(grammarAccess.getIntegerValueAccess().getIntegerValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group__0__Impl"


    // $ANTLR start "rule__IntegerValue__Group__1"
    // InternalQLS.g:7285:1: rule__IntegerValue__Group__1 : rule__IntegerValue__Group__1__Impl ;
    public final void rule__IntegerValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7289:1: ( rule__IntegerValue__Group__1__Impl )
            // InternalQLS.g:7290:2: rule__IntegerValue__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValue__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group__1"


    // $ANTLR start "rule__IntegerValue__Group__1__Impl"
    // InternalQLS.g:7296:1: rule__IntegerValue__Group__1__Impl : ( ( rule__IntegerValue__IntValueAssignment_1 ) ) ;
    public final void rule__IntegerValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7300:1: ( ( ( rule__IntegerValue__IntValueAssignment_1 ) ) )
            // InternalQLS.g:7301:1: ( ( rule__IntegerValue__IntValueAssignment_1 ) )
            {
            // InternalQLS.g:7301:1: ( ( rule__IntegerValue__IntValueAssignment_1 ) )
            // InternalQLS.g:7302:2: ( rule__IntegerValue__IntValueAssignment_1 )
            {
             before(grammarAccess.getIntegerValueAccess().getIntValueAssignment_1()); 
            // InternalQLS.g:7303:2: ( rule__IntegerValue__IntValueAssignment_1 )
            // InternalQLS.g:7303:3: rule__IntegerValue__IntValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValue__IntValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIntegerValueAccess().getIntValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group__1__Impl"


    // $ANTLR start "rule__StringValue__Group__0"
    // InternalQLS.g:7312:1: rule__StringValue__Group__0 : rule__StringValue__Group__0__Impl rule__StringValue__Group__1 ;
    public final void rule__StringValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7316:1: ( rule__StringValue__Group__0__Impl rule__StringValue__Group__1 )
            // InternalQLS.g:7317:2: rule__StringValue__Group__0__Impl rule__StringValue__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__StringValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group__0"


    // $ANTLR start "rule__StringValue__Group__0__Impl"
    // InternalQLS.g:7324:1: rule__StringValue__Group__0__Impl : ( () ) ;
    public final void rule__StringValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7328:1: ( ( () ) )
            // InternalQLS.g:7329:1: ( () )
            {
            // InternalQLS.g:7329:1: ( () )
            // InternalQLS.g:7330:2: ()
            {
             before(grammarAccess.getStringValueAccess().getStringValueAction_0()); 
            // InternalQLS.g:7331:2: ()
            // InternalQLS.g:7331:3: 
            {
            }

             after(grammarAccess.getStringValueAccess().getStringValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group__0__Impl"


    // $ANTLR start "rule__StringValue__Group__1"
    // InternalQLS.g:7339:1: rule__StringValue__Group__1 : rule__StringValue__Group__1__Impl ;
    public final void rule__StringValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7343:1: ( rule__StringValue__Group__1__Impl )
            // InternalQLS.g:7344:2: rule__StringValue__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringValue__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group__1"


    // $ANTLR start "rule__StringValue__Group__1__Impl"
    // InternalQLS.g:7350:1: rule__StringValue__Group__1__Impl : ( ( rule__StringValue__StringValueAssignment_1 ) ) ;
    public final void rule__StringValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7354:1: ( ( ( rule__StringValue__StringValueAssignment_1 ) ) )
            // InternalQLS.g:7355:1: ( ( rule__StringValue__StringValueAssignment_1 ) )
            {
            // InternalQLS.g:7355:1: ( ( rule__StringValue__StringValueAssignment_1 ) )
            // InternalQLS.g:7356:2: ( rule__StringValue__StringValueAssignment_1 )
            {
             before(grammarAccess.getStringValueAccess().getStringValueAssignment_1()); 
            // InternalQLS.g:7357:2: ( rule__StringValue__StringValueAssignment_1 )
            // InternalQLS.g:7357:3: rule__StringValue__StringValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StringValue__StringValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStringValueAccess().getStringValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group__1__Impl"


    // $ANTLR start "rule__BooleanValue__Group__0"
    // InternalQLS.g:7366:1: rule__BooleanValue__Group__0 : rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1 ;
    public final void rule__BooleanValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7370:1: ( rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1 )
            // InternalQLS.g:7371:2: rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1
            {
            pushFollow(FOLLOW_64);
            rule__BooleanValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Group__0"


    // $ANTLR start "rule__BooleanValue__Group__0__Impl"
    // InternalQLS.g:7378:1: rule__BooleanValue__Group__0__Impl : ( () ) ;
    public final void rule__BooleanValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7382:1: ( ( () ) )
            // InternalQLS.g:7383:1: ( () )
            {
            // InternalQLS.g:7383:1: ( () )
            // InternalQLS.g:7384:2: ()
            {
             before(grammarAccess.getBooleanValueAccess().getBooleanValueAction_0()); 
            // InternalQLS.g:7385:2: ()
            // InternalQLS.g:7385:3: 
            {
            }

             after(grammarAccess.getBooleanValueAccess().getBooleanValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Group__0__Impl"


    // $ANTLR start "rule__BooleanValue__Group__1"
    // InternalQLS.g:7393:1: rule__BooleanValue__Group__1 : rule__BooleanValue__Group__1__Impl ;
    public final void rule__BooleanValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7397:1: ( rule__BooleanValue__Group__1__Impl )
            // InternalQLS.g:7398:2: rule__BooleanValue__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValue__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Group__1"


    // $ANTLR start "rule__BooleanValue__Group__1__Impl"
    // InternalQLS.g:7404:1: rule__BooleanValue__Group__1__Impl : ( ( rule__BooleanValue__BooleanValueAssignment_1 ) ) ;
    public final void rule__BooleanValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7408:1: ( ( ( rule__BooleanValue__BooleanValueAssignment_1 ) ) )
            // InternalQLS.g:7409:1: ( ( rule__BooleanValue__BooleanValueAssignment_1 ) )
            {
            // InternalQLS.g:7409:1: ( ( rule__BooleanValue__BooleanValueAssignment_1 ) )
            // InternalQLS.g:7410:2: ( rule__BooleanValue__BooleanValueAssignment_1 )
            {
             before(grammarAccess.getBooleanValueAccess().getBooleanValueAssignment_1()); 
            // InternalQLS.g:7411:2: ( rule__BooleanValue__BooleanValueAssignment_1 )
            // InternalQLS.g:7411:3: rule__BooleanValue__BooleanValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValue__BooleanValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueAccess().getBooleanValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Group__1__Impl"


    // $ANTLR start "rule__EnumerationCall__Group__0"
    // InternalQLS.g:7420:1: rule__EnumerationCall__Group__0 : rule__EnumerationCall__Group__0__Impl rule__EnumerationCall__Group__1 ;
    public final void rule__EnumerationCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7424:1: ( rule__EnumerationCall__Group__0__Impl rule__EnumerationCall__Group__1 )
            // InternalQLS.g:7425:2: rule__EnumerationCall__Group__0__Impl rule__EnumerationCall__Group__1
            {
            pushFollow(FOLLOW_65);
            rule__EnumerationCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationCall__Group__0"


    // $ANTLR start "rule__EnumerationCall__Group__0__Impl"
    // InternalQLS.g:7432:1: rule__EnumerationCall__Group__0__Impl : ( () ) ;
    public final void rule__EnumerationCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7436:1: ( ( () ) )
            // InternalQLS.g:7437:1: ( () )
            {
            // InternalQLS.g:7437:1: ( () )
            // InternalQLS.g:7438:2: ()
            {
             before(grammarAccess.getEnumerationCallAccess().getEnumerationCallAction_0()); 
            // InternalQLS.g:7439:2: ()
            // InternalQLS.g:7439:3: 
            {
            }

             after(grammarAccess.getEnumerationCallAccess().getEnumerationCallAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationCall__Group__0__Impl"


    // $ANTLR start "rule__EnumerationCall__Group__1"
    // InternalQLS.g:7447:1: rule__EnumerationCall__Group__1 : rule__EnumerationCall__Group__1__Impl ;
    public final void rule__EnumerationCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7451:1: ( rule__EnumerationCall__Group__1__Impl )
            // InternalQLS.g:7452:2: rule__EnumerationCall__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationCall__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationCall__Group__1"


    // $ANTLR start "rule__EnumerationCall__Group__1__Impl"
    // InternalQLS.g:7458:1: rule__EnumerationCall__Group__1__Impl : ( ( rule__EnumerationCall__EnumerationLiteralAssignment_1 ) ) ;
    public final void rule__EnumerationCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7462:1: ( ( ( rule__EnumerationCall__EnumerationLiteralAssignment_1 ) ) )
            // InternalQLS.g:7463:1: ( ( rule__EnumerationCall__EnumerationLiteralAssignment_1 ) )
            {
            // InternalQLS.g:7463:1: ( ( rule__EnumerationCall__EnumerationLiteralAssignment_1 ) )
            // InternalQLS.g:7464:2: ( rule__EnumerationCall__EnumerationLiteralAssignment_1 )
            {
             before(grammarAccess.getEnumerationCallAccess().getEnumerationLiteralAssignment_1()); 
            // InternalQLS.g:7465:2: ( rule__EnumerationCall__EnumerationLiteralAssignment_1 )
            // InternalQLS.g:7465:3: rule__EnumerationCall__EnumerationLiteralAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationCall__EnumerationLiteralAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationCallAccess().getEnumerationLiteralAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationCall__Group__1__Impl"


    // $ANTLR start "rule__DateValue__Group__0"
    // InternalQLS.g:7474:1: rule__DateValue__Group__0 : rule__DateValue__Group__0__Impl rule__DateValue__Group__1 ;
    public final void rule__DateValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7478:1: ( rule__DateValue__Group__0__Impl rule__DateValue__Group__1 )
            // InternalQLS.g:7479:2: rule__DateValue__Group__0__Impl rule__DateValue__Group__1
            {
            pushFollow(FOLLOW_66);
            rule__DateValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValue__Group__0"


    // $ANTLR start "rule__DateValue__Group__0__Impl"
    // InternalQLS.g:7486:1: rule__DateValue__Group__0__Impl : ( () ) ;
    public final void rule__DateValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7490:1: ( ( () ) )
            // InternalQLS.g:7491:1: ( () )
            {
            // InternalQLS.g:7491:1: ( () )
            // InternalQLS.g:7492:2: ()
            {
             before(grammarAccess.getDateValueAccess().getDateValueAction_0()); 
            // InternalQLS.g:7493:2: ()
            // InternalQLS.g:7493:3: 
            {
            }

             after(grammarAccess.getDateValueAccess().getDateValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValue__Group__0__Impl"


    // $ANTLR start "rule__DateValue__Group__1"
    // InternalQLS.g:7501:1: rule__DateValue__Group__1 : rule__DateValue__Group__1__Impl rule__DateValue__Group__2 ;
    public final void rule__DateValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7505:1: ( rule__DateValue__Group__1__Impl rule__DateValue__Group__2 )
            // InternalQLS.g:7506:2: rule__DateValue__Group__1__Impl rule__DateValue__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DateValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValue__Group__1"


    // $ANTLR start "rule__DateValue__Group__1__Impl"
    // InternalQLS.g:7513:1: rule__DateValue__Group__1__Impl : ( 'DateValue' ) ;
    public final void rule__DateValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7517:1: ( ( 'DateValue' ) )
            // InternalQLS.g:7518:1: ( 'DateValue' )
            {
            // InternalQLS.g:7518:1: ( 'DateValue' )
            // InternalQLS.g:7519:2: 'DateValue'
            {
             before(grammarAccess.getDateValueAccess().getDateValueKeyword_1()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getDateValueAccess().getDateValueKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValue__Group__1__Impl"


    // $ANTLR start "rule__DateValue__Group__2"
    // InternalQLS.g:7528:1: rule__DateValue__Group__2 : rule__DateValue__Group__2__Impl rule__DateValue__Group__3 ;
    public final void rule__DateValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7532:1: ( rule__DateValue__Group__2__Impl rule__DateValue__Group__3 )
            // InternalQLS.g:7533:2: rule__DateValue__Group__2__Impl rule__DateValue__Group__3
            {
            pushFollow(FOLLOW_67);
            rule__DateValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValue__Group__2"


    // $ANTLR start "rule__DateValue__Group__2__Impl"
    // InternalQLS.g:7540:1: rule__DateValue__Group__2__Impl : ( '{' ) ;
    public final void rule__DateValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7544:1: ( ( '{' ) )
            // InternalQLS.g:7545:1: ( '{' )
            {
            // InternalQLS.g:7545:1: ( '{' )
            // InternalQLS.g:7546:2: '{'
            {
             before(grammarAccess.getDateValueAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getDateValueAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValue__Group__2__Impl"


    // $ANTLR start "rule__DateValue__Group__3"
    // InternalQLS.g:7555:1: rule__DateValue__Group__3 : rule__DateValue__Group__3__Impl rule__DateValue__Group__4 ;
    public final void rule__DateValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7559:1: ( rule__DateValue__Group__3__Impl rule__DateValue__Group__4 )
            // InternalQLS.g:7560:2: rule__DateValue__Group__3__Impl rule__DateValue__Group__4
            {
            pushFollow(FOLLOW_67);
            rule__DateValue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateValue__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValue__Group__3"


    // $ANTLR start "rule__DateValue__Group__3__Impl"
    // InternalQLS.g:7567:1: rule__DateValue__Group__3__Impl : ( ( rule__DateValue__Group_3__0 )? ) ;
    public final void rule__DateValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7571:1: ( ( ( rule__DateValue__Group_3__0 )? ) )
            // InternalQLS.g:7572:1: ( ( rule__DateValue__Group_3__0 )? )
            {
            // InternalQLS.g:7572:1: ( ( rule__DateValue__Group_3__0 )? )
            // InternalQLS.g:7573:2: ( rule__DateValue__Group_3__0 )?
            {
             before(grammarAccess.getDateValueAccess().getGroup_3()); 
            // InternalQLS.g:7574:2: ( rule__DateValue__Group_3__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==78) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalQLS.g:7574:3: rule__DateValue__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DateValue__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDateValueAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValue__Group__3__Impl"


    // $ANTLR start "rule__DateValue__Group__4"
    // InternalQLS.g:7582:1: rule__DateValue__Group__4 : rule__DateValue__Group__4__Impl ;
    public final void rule__DateValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7586:1: ( rule__DateValue__Group__4__Impl )
            // InternalQLS.g:7587:2: rule__DateValue__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DateValue__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValue__Group__4"


    // $ANTLR start "rule__DateValue__Group__4__Impl"
    // InternalQLS.g:7593:1: rule__DateValue__Group__4__Impl : ( '}' ) ;
    public final void rule__DateValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7597:1: ( ( '}' ) )
            // InternalQLS.g:7598:1: ( '}' )
            {
            // InternalQLS.g:7598:1: ( '}' )
            // InternalQLS.g:7599:2: '}'
            {
             before(grammarAccess.getDateValueAccess().getRightCurlyBracketKeyword_4()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getDateValueAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValue__Group__4__Impl"


    // $ANTLR start "rule__DateValue__Group_3__0"
    // InternalQLS.g:7609:1: rule__DateValue__Group_3__0 : rule__DateValue__Group_3__0__Impl rule__DateValue__Group_3__1 ;
    public final void rule__DateValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7613:1: ( rule__DateValue__Group_3__0__Impl rule__DateValue__Group_3__1 )
            // InternalQLS.g:7614:2: rule__DateValue__Group_3__0__Impl rule__DateValue__Group_3__1
            {
            pushFollow(FOLLOW_68);
            rule__DateValue__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateValue__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValue__Group_3__0"


    // $ANTLR start "rule__DateValue__Group_3__0__Impl"
    // InternalQLS.g:7621:1: rule__DateValue__Group_3__0__Impl : ( 'dateValue' ) ;
    public final void rule__DateValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7625:1: ( ( 'dateValue' ) )
            // InternalQLS.g:7626:1: ( 'dateValue' )
            {
            // InternalQLS.g:7626:1: ( 'dateValue' )
            // InternalQLS.g:7627:2: 'dateValue'
            {
             before(grammarAccess.getDateValueAccess().getDateValueKeyword_3_0()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getDateValueAccess().getDateValueKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValue__Group_3__0__Impl"


    // $ANTLR start "rule__DateValue__Group_3__1"
    // InternalQLS.g:7636:1: rule__DateValue__Group_3__1 : rule__DateValue__Group_3__1__Impl ;
    public final void rule__DateValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7640:1: ( rule__DateValue__Group_3__1__Impl )
            // InternalQLS.g:7641:2: rule__DateValue__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DateValue__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValue__Group_3__1"


    // $ANTLR start "rule__DateValue__Group_3__1__Impl"
    // InternalQLS.g:7647:1: rule__DateValue__Group_3__1__Impl : ( ( rule__DateValue__DateValueAssignment_3_1 ) ) ;
    public final void rule__DateValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7651:1: ( ( ( rule__DateValue__DateValueAssignment_3_1 ) ) )
            // InternalQLS.g:7652:1: ( ( rule__DateValue__DateValueAssignment_3_1 ) )
            {
            // InternalQLS.g:7652:1: ( ( rule__DateValue__DateValueAssignment_3_1 ) )
            // InternalQLS.g:7653:2: ( rule__DateValue__DateValueAssignment_3_1 )
            {
             before(grammarAccess.getDateValueAccess().getDateValueAssignment_3_1()); 
            // InternalQLS.g:7654:2: ( rule__DateValue__DateValueAssignment_3_1 )
            // InternalQLS.g:7654:3: rule__DateValue__DateValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DateValue__DateValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDateValueAccess().getDateValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValue__Group_3__1__Impl"


    // $ANTLR start "rule__DecimalValue__Group__0"
    // InternalQLS.g:7663:1: rule__DecimalValue__Group__0 : rule__DecimalValue__Group__0__Impl rule__DecimalValue__Group__1 ;
    public final void rule__DecimalValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7667:1: ( rule__DecimalValue__Group__0__Impl rule__DecimalValue__Group__1 )
            // InternalQLS.g:7668:2: rule__DecimalValue__Group__0__Impl rule__DecimalValue__Group__1
            {
            pushFollow(FOLLOW_51);
            rule__DecimalValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecimalValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValue__Group__0"


    // $ANTLR start "rule__DecimalValue__Group__0__Impl"
    // InternalQLS.g:7675:1: rule__DecimalValue__Group__0__Impl : ( () ) ;
    public final void rule__DecimalValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7679:1: ( ( () ) )
            // InternalQLS.g:7680:1: ( () )
            {
            // InternalQLS.g:7680:1: ( () )
            // InternalQLS.g:7681:2: ()
            {
             before(grammarAccess.getDecimalValueAccess().getDecimalValueAction_0()); 
            // InternalQLS.g:7682:2: ()
            // InternalQLS.g:7682:3: 
            {
            }

             after(grammarAccess.getDecimalValueAccess().getDecimalValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValue__Group__0__Impl"


    // $ANTLR start "rule__DecimalValue__Group__1"
    // InternalQLS.g:7690:1: rule__DecimalValue__Group__1 : rule__DecimalValue__Group__1__Impl ;
    public final void rule__DecimalValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7694:1: ( rule__DecimalValue__Group__1__Impl )
            // InternalQLS.g:7695:2: rule__DecimalValue__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DecimalValue__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValue__Group__1"


    // $ANTLR start "rule__DecimalValue__Group__1__Impl"
    // InternalQLS.g:7701:1: rule__DecimalValue__Group__1__Impl : ( ( rule__DecimalValue__DecimalValueAssignment_1 ) ) ;
    public final void rule__DecimalValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7705:1: ( ( ( rule__DecimalValue__DecimalValueAssignment_1 ) ) )
            // InternalQLS.g:7706:1: ( ( rule__DecimalValue__DecimalValueAssignment_1 ) )
            {
            // InternalQLS.g:7706:1: ( ( rule__DecimalValue__DecimalValueAssignment_1 ) )
            // InternalQLS.g:7707:2: ( rule__DecimalValue__DecimalValueAssignment_1 )
            {
             before(grammarAccess.getDecimalValueAccess().getDecimalValueAssignment_1()); 
            // InternalQLS.g:7708:2: ( rule__DecimalValue__DecimalValueAssignment_1 )
            // InternalQLS.g:7708:3: rule__DecimalValue__DecimalValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DecimalValue__DecimalValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDecimalValueAccess().getDecimalValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValue__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalQLS.g:7717:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7721:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalQLS.g:7722:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalQLS.g:7729:1: rule__EDouble__Group__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7733:1: ( ( ( RULE_INT )? ) )
            // InternalQLS.g:7734:1: ( ( RULE_INT )? )
            {
            // InternalQLS.g:7734:1: ( ( RULE_INT )? )
            // InternalQLS.g:7735:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0()); 
            // InternalQLS.g:7736:2: ( RULE_INT )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_INT) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalQLS.g:7736:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalQLS.g:7744:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7748:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalQLS.g:7749:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_56);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalQLS.g:7756:1: rule__EDouble__Group__1__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7760:1: ( ( '.' ) )
            // InternalQLS.g:7761:1: ( '.' )
            {
            // InternalQLS.g:7761:1: ( '.' )
            // InternalQLS.g:7762:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_1()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // InternalQLS.g:7771:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7775:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalQLS.g:7776:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_69);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // InternalQLS.g:7783:1: rule__EDouble__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7787:1: ( ( RULE_INT ) )
            // InternalQLS.g:7788:1: ( RULE_INT )
            {
            // InternalQLS.g:7788:1: ( RULE_INT )
            // InternalQLS.g:7789:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // InternalQLS.g:7798:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7802:1: ( rule__EDouble__Group__3__Impl )
            // InternalQLS.g:7803:2: rule__EDouble__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // InternalQLS.g:7809:1: rule__EDouble__Group__3__Impl : ( ( rule__EDouble__Group_3__0 )? ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7813:1: ( ( ( rule__EDouble__Group_3__0 )? ) )
            // InternalQLS.g:7814:1: ( ( rule__EDouble__Group_3__0 )? )
            {
            // InternalQLS.g:7814:1: ( ( rule__EDouble__Group_3__0 )? )
            // InternalQLS.g:7815:2: ( rule__EDouble__Group_3__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_3()); 
            // InternalQLS.g:7816:2: ( rule__EDouble__Group_3__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=17 && LA58_0<=18)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalQLS.g:7816:3: rule__EDouble__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group_3__0"
    // InternalQLS.g:7825:1: rule__EDouble__Group_3__0 : rule__EDouble__Group_3__0__Impl rule__EDouble__Group_3__1 ;
    public final void rule__EDouble__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7829:1: ( rule__EDouble__Group_3__0__Impl rule__EDouble__Group_3__1 )
            // InternalQLS.g:7830:2: rule__EDouble__Group_3__0__Impl rule__EDouble__Group_3__1
            {
            pushFollow(FOLLOW_70);
            rule__EDouble__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_3__0"


    // $ANTLR start "rule__EDouble__Group_3__0__Impl"
    // InternalQLS.g:7837:1: rule__EDouble__Group_3__0__Impl : ( ( rule__EDouble__Alternatives_3_0 ) ) ;
    public final void rule__EDouble__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7841:1: ( ( ( rule__EDouble__Alternatives_3_0 ) ) )
            // InternalQLS.g:7842:1: ( ( rule__EDouble__Alternatives_3_0 ) )
            {
            // InternalQLS.g:7842:1: ( ( rule__EDouble__Alternatives_3_0 ) )
            // InternalQLS.g:7843:2: ( rule__EDouble__Alternatives_3_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_3_0()); 
            // InternalQLS.g:7844:2: ( rule__EDouble__Alternatives_3_0 )
            // InternalQLS.g:7844:3: rule__EDouble__Alternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_3__0__Impl"


    // $ANTLR start "rule__EDouble__Group_3__1"
    // InternalQLS.g:7852:1: rule__EDouble__Group_3__1 : rule__EDouble__Group_3__1__Impl rule__EDouble__Group_3__2 ;
    public final void rule__EDouble__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7856:1: ( rule__EDouble__Group_3__1__Impl rule__EDouble__Group_3__2 )
            // InternalQLS.g:7857:2: rule__EDouble__Group_3__1__Impl rule__EDouble__Group_3__2
            {
            pushFollow(FOLLOW_70);
            rule__EDouble__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_3__1"


    // $ANTLR start "rule__EDouble__Group_3__1__Impl"
    // InternalQLS.g:7864:1: rule__EDouble__Group_3__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7868:1: ( ( ( '-' )? ) )
            // InternalQLS.g:7869:1: ( ( '-' )? )
            {
            // InternalQLS.g:7869:1: ( ( '-' )? )
            // InternalQLS.g:7870:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_3_1()); 
            // InternalQLS.g:7871:2: ( '-' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==34) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalQLS.g:7871:3: '-'
                    {
                    match(input,34,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_3__1__Impl"


    // $ANTLR start "rule__EDouble__Group_3__2"
    // InternalQLS.g:7879:1: rule__EDouble__Group_3__2 : rule__EDouble__Group_3__2__Impl ;
    public final void rule__EDouble__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7883:1: ( rule__EDouble__Group_3__2__Impl )
            // InternalQLS.g:7884:2: rule__EDouble__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_3__2"


    // $ANTLR start "rule__EDouble__Group_3__2__Impl"
    // InternalQLS.g:7890:1: rule__EDouble__Group_3__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7894:1: ( ( RULE_INT ) )
            // InternalQLS.g:7895:1: ( RULE_INT )
            {
            // InternalQLS.g:7895:1: ( RULE_INT )
            // InternalQLS.g:7896:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_3__2__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group__0"
    // InternalQLS.g:7906:1: rule__QuestionDefinition__Group__0 : rule__QuestionDefinition__Group__0__Impl rule__QuestionDefinition__Group__1 ;
    public final void rule__QuestionDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7910:1: ( rule__QuestionDefinition__Group__0__Impl rule__QuestionDefinition__Group__1 )
            // InternalQLS.g:7911:2: rule__QuestionDefinition__Group__0__Impl rule__QuestionDefinition__Group__1
            {
            pushFollow(FOLLOW_71);
            rule__QuestionDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group__0"


    // $ANTLR start "rule__QuestionDefinition__Group__0__Impl"
    // InternalQLS.g:7918:1: rule__QuestionDefinition__Group__0__Impl : ( ( rule__QuestionDefinition__IsMandatoryAssignment_0 )? ) ;
    public final void rule__QuestionDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7922:1: ( ( ( rule__QuestionDefinition__IsMandatoryAssignment_0 )? ) )
            // InternalQLS.g:7923:1: ( ( rule__QuestionDefinition__IsMandatoryAssignment_0 )? )
            {
            // InternalQLS.g:7923:1: ( ( rule__QuestionDefinition__IsMandatoryAssignment_0 )? )
            // InternalQLS.g:7924:2: ( rule__QuestionDefinition__IsMandatoryAssignment_0 )?
            {
             before(grammarAccess.getQuestionDefinitionAccess().getIsMandatoryAssignment_0()); 
            // InternalQLS.g:7925:2: ( rule__QuestionDefinition__IsMandatoryAssignment_0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==87) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalQLS.g:7925:3: rule__QuestionDefinition__IsMandatoryAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionDefinition__IsMandatoryAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionDefinitionAccess().getIsMandatoryAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group__0__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group__1"
    // InternalQLS.g:7933:1: rule__QuestionDefinition__Group__1 : rule__QuestionDefinition__Group__1__Impl rule__QuestionDefinition__Group__2 ;
    public final void rule__QuestionDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7937:1: ( rule__QuestionDefinition__Group__1__Impl rule__QuestionDefinition__Group__2 )
            // InternalQLS.g:7938:2: rule__QuestionDefinition__Group__1__Impl rule__QuestionDefinition__Group__2
            {
            pushFollow(FOLLOW_50);
            rule__QuestionDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group__1"


    // $ANTLR start "rule__QuestionDefinition__Group__1__Impl"
    // InternalQLS.g:7945:1: rule__QuestionDefinition__Group__1__Impl : ( 'question' ) ;
    public final void rule__QuestionDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7949:1: ( ( 'question' ) )
            // InternalQLS.g:7950:1: ( 'question' )
            {
            // InternalQLS.g:7950:1: ( 'question' )
            // InternalQLS.g:7951:2: 'question'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getQuestionKeyword_1()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getQuestionDefinitionAccess().getQuestionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group__1__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group__2"
    // InternalQLS.g:7960:1: rule__QuestionDefinition__Group__2 : rule__QuestionDefinition__Group__2__Impl rule__QuestionDefinition__Group__3 ;
    public final void rule__QuestionDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7964:1: ( rule__QuestionDefinition__Group__2__Impl rule__QuestionDefinition__Group__3 )
            // InternalQLS.g:7965:2: rule__QuestionDefinition__Group__2__Impl rule__QuestionDefinition__Group__3
            {
            pushFollow(FOLLOW_72);
            rule__QuestionDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group__2"


    // $ANTLR start "rule__QuestionDefinition__Group__2__Impl"
    // InternalQLS.g:7972:1: rule__QuestionDefinition__Group__2__Impl : ( ( rule__QuestionDefinition__NameAssignment_2 ) ) ;
    public final void rule__QuestionDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7976:1: ( ( ( rule__QuestionDefinition__NameAssignment_2 ) ) )
            // InternalQLS.g:7977:1: ( ( rule__QuestionDefinition__NameAssignment_2 ) )
            {
            // InternalQLS.g:7977:1: ( ( rule__QuestionDefinition__NameAssignment_2 ) )
            // InternalQLS.g:7978:2: ( rule__QuestionDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getNameAssignment_2()); 
            // InternalQLS.g:7979:2: ( rule__QuestionDefinition__NameAssignment_2 )
            // InternalQLS.g:7979:3: rule__QuestionDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQuestionDefinitionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group__2__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group__3"
    // InternalQLS.g:7987:1: rule__QuestionDefinition__Group__3 : rule__QuestionDefinition__Group__3__Impl rule__QuestionDefinition__Group__4 ;
    public final void rule__QuestionDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7991:1: ( rule__QuestionDefinition__Group__3__Impl rule__QuestionDefinition__Group__4 )
            // InternalQLS.g:7992:2: rule__QuestionDefinition__Group__3__Impl rule__QuestionDefinition__Group__4
            {
            pushFollow(FOLLOW_72);
            rule__QuestionDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group__3"


    // $ANTLR start "rule__QuestionDefinition__Group__3__Impl"
    // InternalQLS.g:7999:1: rule__QuestionDefinition__Group__3__Impl : ( ( rule__QuestionDefinition__Group_3__0 )? ) ;
    public final void rule__QuestionDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8003:1: ( ( ( rule__QuestionDefinition__Group_3__0 )? ) )
            // InternalQLS.g:8004:1: ( ( rule__QuestionDefinition__Group_3__0 )? )
            {
            // InternalQLS.g:8004:1: ( ( rule__QuestionDefinition__Group_3__0 )? )
            // InternalQLS.g:8005:2: ( rule__QuestionDefinition__Group_3__0 )?
            {
             before(grammarAccess.getQuestionDefinitionAccess().getGroup_3()); 
            // InternalQLS.g:8006:2: ( rule__QuestionDefinition__Group_3__0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==57) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalQLS.g:8006:3: rule__QuestionDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionDefinition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionDefinitionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group__3__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group__4"
    // InternalQLS.g:8014:1: rule__QuestionDefinition__Group__4 : rule__QuestionDefinition__Group__4__Impl rule__QuestionDefinition__Group__5 ;
    public final void rule__QuestionDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8018:1: ( rule__QuestionDefinition__Group__4__Impl rule__QuestionDefinition__Group__5 )
            // InternalQLS.g:8019:2: rule__QuestionDefinition__Group__4__Impl rule__QuestionDefinition__Group__5
            {
            pushFollow(FOLLOW_50);
            rule__QuestionDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group__4"


    // $ANTLR start "rule__QuestionDefinition__Group__4__Impl"
    // InternalQLS.g:8026:1: rule__QuestionDefinition__Group__4__Impl : ( ':' ) ;
    public final void rule__QuestionDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8030:1: ( ( ':' ) )
            // InternalQLS.g:8031:1: ( ':' )
            {
            // InternalQLS.g:8031:1: ( ':' )
            // InternalQLS.g:8032:2: ':'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getColonKeyword_4()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getQuestionDefinitionAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group__4__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group__5"
    // InternalQLS.g:8041:1: rule__QuestionDefinition__Group__5 : rule__QuestionDefinition__Group__5__Impl rule__QuestionDefinition__Group__6 ;
    public final void rule__QuestionDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8045:1: ( rule__QuestionDefinition__Group__5__Impl rule__QuestionDefinition__Group__6 )
            // InternalQLS.g:8046:2: rule__QuestionDefinition__Group__5__Impl rule__QuestionDefinition__Group__6
            {
            pushFollow(FOLLOW_50);
            rule__QuestionDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group__5"


    // $ANTLR start "rule__QuestionDefinition__Group__5__Impl"
    // InternalQLS.g:8053:1: rule__QuestionDefinition__Group__5__Impl : ( ( rule__QuestionDefinition__LabelAssignment_5 ) ) ;
    public final void rule__QuestionDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8057:1: ( ( ( rule__QuestionDefinition__LabelAssignment_5 ) ) )
            // InternalQLS.g:8058:1: ( ( rule__QuestionDefinition__LabelAssignment_5 ) )
            {
            // InternalQLS.g:8058:1: ( ( rule__QuestionDefinition__LabelAssignment_5 ) )
            // InternalQLS.g:8059:2: ( rule__QuestionDefinition__LabelAssignment_5 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getLabelAssignment_5()); 
            // InternalQLS.g:8060:2: ( rule__QuestionDefinition__LabelAssignment_5 )
            // InternalQLS.g:8060:3: rule__QuestionDefinition__LabelAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__LabelAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getQuestionDefinitionAccess().getLabelAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group__5__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group__6"
    // InternalQLS.g:8068:1: rule__QuestionDefinition__Group__6 : rule__QuestionDefinition__Group__6__Impl rule__QuestionDefinition__Group__7 ;
    public final void rule__QuestionDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8072:1: ( rule__QuestionDefinition__Group__6__Impl rule__QuestionDefinition__Group__7 )
            // InternalQLS.g:8073:2: rule__QuestionDefinition__Group__6__Impl rule__QuestionDefinition__Group__7
            {
            pushFollow(FOLLOW_34);
            rule__QuestionDefinition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group__6"


    // $ANTLR start "rule__QuestionDefinition__Group__6__Impl"
    // InternalQLS.g:8080:1: rule__QuestionDefinition__Group__6__Impl : ( ( rule__QuestionDefinition__DataTypeAssignment_6 ) ) ;
    public final void rule__QuestionDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8084:1: ( ( ( rule__QuestionDefinition__DataTypeAssignment_6 ) ) )
            // InternalQLS.g:8085:1: ( ( rule__QuestionDefinition__DataTypeAssignment_6 ) )
            {
            // InternalQLS.g:8085:1: ( ( rule__QuestionDefinition__DataTypeAssignment_6 ) )
            // InternalQLS.g:8086:2: ( rule__QuestionDefinition__DataTypeAssignment_6 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getDataTypeAssignment_6()); 
            // InternalQLS.g:8087:2: ( rule__QuestionDefinition__DataTypeAssignment_6 )
            // InternalQLS.g:8087:3: rule__QuestionDefinition__DataTypeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__DataTypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getQuestionDefinitionAccess().getDataTypeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group__6__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group__7"
    // InternalQLS.g:8095:1: rule__QuestionDefinition__Group__7 : rule__QuestionDefinition__Group__7__Impl ;
    public final void rule__QuestionDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8099:1: ( rule__QuestionDefinition__Group__7__Impl )
            // InternalQLS.g:8100:2: rule__QuestionDefinition__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group__7"


    // $ANTLR start "rule__QuestionDefinition__Group__7__Impl"
    // InternalQLS.g:8106:1: rule__QuestionDefinition__Group__7__Impl : ( ( rule__QuestionDefinition__Group_7__0 )? ) ;
    public final void rule__QuestionDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8110:1: ( ( ( rule__QuestionDefinition__Group_7__0 )? ) )
            // InternalQLS.g:8111:1: ( ( rule__QuestionDefinition__Group_7__0 )? )
            {
            // InternalQLS.g:8111:1: ( ( rule__QuestionDefinition__Group_7__0 )? )
            // InternalQLS.g:8112:2: ( rule__QuestionDefinition__Group_7__0 )?
            {
             before(grammarAccess.getQuestionDefinitionAccess().getGroup_7()); 
            // InternalQLS.g:8113:2: ( rule__QuestionDefinition__Group_7__0 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==12) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalQLS.g:8113:3: rule__QuestionDefinition__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionDefinition__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionDefinitionAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group__7__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group_3__0"
    // InternalQLS.g:8122:1: rule__QuestionDefinition__Group_3__0 : rule__QuestionDefinition__Group_3__0__Impl rule__QuestionDefinition__Group_3__1 ;
    public final void rule__QuestionDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8126:1: ( rule__QuestionDefinition__Group_3__0__Impl rule__QuestionDefinition__Group_3__1 )
            // InternalQLS.g:8127:2: rule__QuestionDefinition__Group_3__0__Impl rule__QuestionDefinition__Group_3__1
            {
            pushFollow(FOLLOW_73);
            rule__QuestionDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_3__0"


    // $ANTLR start "rule__QuestionDefinition__Group_3__0__Impl"
    // InternalQLS.g:8134:1: rule__QuestionDefinition__Group_3__0__Impl : ( '(' ) ;
    public final void rule__QuestionDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8138:1: ( ( '(' ) )
            // InternalQLS.g:8139:1: ( '(' )
            {
            // InternalQLS.g:8139:1: ( '(' )
            // InternalQLS.g:8140:2: '('
            {
             before(grammarAccess.getQuestionDefinitionAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getQuestionDefinitionAccess().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group_3__1"
    // InternalQLS.g:8149:1: rule__QuestionDefinition__Group_3__1 : rule__QuestionDefinition__Group_3__1__Impl rule__QuestionDefinition__Group_3__2 ;
    public final void rule__QuestionDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8153:1: ( rule__QuestionDefinition__Group_3__1__Impl rule__QuestionDefinition__Group_3__2 )
            // InternalQLS.g:8154:2: rule__QuestionDefinition__Group_3__1__Impl rule__QuestionDefinition__Group_3__2
            {
            pushFollow(FOLLOW_73);
            rule__QuestionDefinition__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_3__1"


    // $ANTLR start "rule__QuestionDefinition__Group_3__1__Impl"
    // InternalQLS.g:8161:1: rule__QuestionDefinition__Group_3__1__Impl : ( ( rule__QuestionDefinition__IsDisplayedAssignment_3_1 )? ) ;
    public final void rule__QuestionDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8165:1: ( ( ( rule__QuestionDefinition__IsDisplayedAssignment_3_1 )? ) )
            // InternalQLS.g:8166:1: ( ( rule__QuestionDefinition__IsDisplayedAssignment_3_1 )? )
            {
            // InternalQLS.g:8166:1: ( ( rule__QuestionDefinition__IsDisplayedAssignment_3_1 )? )
            // InternalQLS.g:8167:2: ( rule__QuestionDefinition__IsDisplayedAssignment_3_1 )?
            {
             before(grammarAccess.getQuestionDefinitionAccess().getIsDisplayedAssignment_3_1()); 
            // InternalQLS.g:8168:2: ( rule__QuestionDefinition__IsDisplayedAssignment_3_1 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==88) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalQLS.g:8168:3: rule__QuestionDefinition__IsDisplayedAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionDefinition__IsDisplayedAssignment_3_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionDefinitionAccess().getIsDisplayedAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group_3__2"
    // InternalQLS.g:8176:1: rule__QuestionDefinition__Group_3__2 : rule__QuestionDefinition__Group_3__2__Impl rule__QuestionDefinition__Group_3__3 ;
    public final void rule__QuestionDefinition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8180:1: ( rule__QuestionDefinition__Group_3__2__Impl rule__QuestionDefinition__Group_3__3 )
            // InternalQLS.g:8181:2: rule__QuestionDefinition__Group_3__2__Impl rule__QuestionDefinition__Group_3__3
            {
            pushFollow(FOLLOW_73);
            rule__QuestionDefinition__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_3__2"


    // $ANTLR start "rule__QuestionDefinition__Group_3__2__Impl"
    // InternalQLS.g:8188:1: rule__QuestionDefinition__Group_3__2__Impl : ( ( rule__QuestionDefinition__Group_3_2__0 )? ) ;
    public final void rule__QuestionDefinition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8192:1: ( ( ( rule__QuestionDefinition__Group_3_2__0 )? ) )
            // InternalQLS.g:8193:1: ( ( rule__QuestionDefinition__Group_3_2__0 )? )
            {
            // InternalQLS.g:8193:1: ( ( rule__QuestionDefinition__Group_3_2__0 )? )
            // InternalQLS.g:8194:2: ( rule__QuestionDefinition__Group_3_2__0 )?
            {
             before(grammarAccess.getQuestionDefinitionAccess().getGroup_3_2()); 
            // InternalQLS.g:8195:2: ( rule__QuestionDefinition__Group_3_2__0 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==82) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalQLS.g:8195:3: rule__QuestionDefinition__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionDefinition__Group_3_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionDefinitionAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_3__2__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group_3__3"
    // InternalQLS.g:8203:1: rule__QuestionDefinition__Group_3__3 : rule__QuestionDefinition__Group_3__3__Impl ;
    public final void rule__QuestionDefinition__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8207:1: ( rule__QuestionDefinition__Group_3__3__Impl )
            // InternalQLS.g:8208:2: rule__QuestionDefinition__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_3__3"


    // $ANTLR start "rule__QuestionDefinition__Group_3__3__Impl"
    // InternalQLS.g:8214:1: rule__QuestionDefinition__Group_3__3__Impl : ( ')' ) ;
    public final void rule__QuestionDefinition__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8218:1: ( ( ')' ) )
            // InternalQLS.g:8219:1: ( ')' )
            {
            // InternalQLS.g:8219:1: ( ')' )
            // InternalQLS.g:8220:2: ')'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getRightParenthesisKeyword_3_3()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getQuestionDefinitionAccess().getRightParenthesisKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_3__3__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group_3_2__0"
    // InternalQLS.g:8230:1: rule__QuestionDefinition__Group_3_2__0 : rule__QuestionDefinition__Group_3_2__0__Impl rule__QuestionDefinition__Group_3_2__1 ;
    public final void rule__QuestionDefinition__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8234:1: ( rule__QuestionDefinition__Group_3_2__0__Impl rule__QuestionDefinition__Group_3_2__1 )
            // InternalQLS.g:8235:2: rule__QuestionDefinition__Group_3_2__0__Impl rule__QuestionDefinition__Group_3_2__1
            {
            pushFollow(FOLLOW_74);
            rule__QuestionDefinition__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_3_2__0"


    // $ANTLR start "rule__QuestionDefinition__Group_3_2__0__Impl"
    // InternalQLS.g:8242:1: rule__QuestionDefinition__Group_3_2__0__Impl : ( 'currentValue' ) ;
    public final void rule__QuestionDefinition__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8246:1: ( ( 'currentValue' ) )
            // InternalQLS.g:8247:1: ( 'currentValue' )
            {
            // InternalQLS.g:8247:1: ( 'currentValue' )
            // InternalQLS.g:8248:2: 'currentValue'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getCurrentValueKeyword_3_2_0()); 
            match(input,82,FOLLOW_2); 
             after(grammarAccess.getQuestionDefinitionAccess().getCurrentValueKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_3_2__0__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group_3_2__1"
    // InternalQLS.g:8257:1: rule__QuestionDefinition__Group_3_2__1 : rule__QuestionDefinition__Group_3_2__1__Impl ;
    public final void rule__QuestionDefinition__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8261:1: ( rule__QuestionDefinition__Group_3_2__1__Impl )
            // InternalQLS.g:8262:2: rule__QuestionDefinition__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_3_2__1"


    // $ANTLR start "rule__QuestionDefinition__Group_3_2__1__Impl"
    // InternalQLS.g:8268:1: rule__QuestionDefinition__Group_3_2__1__Impl : ( ( rule__QuestionDefinition__CurrentValueAssignment_3_2_1 ) ) ;
    public final void rule__QuestionDefinition__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8272:1: ( ( ( rule__QuestionDefinition__CurrentValueAssignment_3_2_1 ) ) )
            // InternalQLS.g:8273:1: ( ( rule__QuestionDefinition__CurrentValueAssignment_3_2_1 ) )
            {
            // InternalQLS.g:8273:1: ( ( rule__QuestionDefinition__CurrentValueAssignment_3_2_1 ) )
            // InternalQLS.g:8274:2: ( rule__QuestionDefinition__CurrentValueAssignment_3_2_1 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getCurrentValueAssignment_3_2_1()); 
            // InternalQLS.g:8275:2: ( rule__QuestionDefinition__CurrentValueAssignment_3_2_1 )
            // InternalQLS.g:8275:3: rule__QuestionDefinition__CurrentValueAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__CurrentValueAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionDefinitionAccess().getCurrentValueAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_3_2__1__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group_7__0"
    // InternalQLS.g:8284:1: rule__QuestionDefinition__Group_7__0 : rule__QuestionDefinition__Group_7__0__Impl rule__QuestionDefinition__Group_7__1 ;
    public final void rule__QuestionDefinition__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8288:1: ( rule__QuestionDefinition__Group_7__0__Impl rule__QuestionDefinition__Group_7__1 )
            // InternalQLS.g:8289:2: rule__QuestionDefinition__Group_7__0__Impl rule__QuestionDefinition__Group_7__1
            {
            pushFollow(FOLLOW_24);
            rule__QuestionDefinition__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_7__0"


    // $ANTLR start "rule__QuestionDefinition__Group_7__0__Impl"
    // InternalQLS.g:8296:1: rule__QuestionDefinition__Group_7__0__Impl : ( '=' ) ;
    public final void rule__QuestionDefinition__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8300:1: ( ( '=' ) )
            // InternalQLS.g:8301:1: ( '=' )
            {
            // InternalQLS.g:8301:1: ( '=' )
            // InternalQLS.g:8302:2: '='
            {
             before(grammarAccess.getQuestionDefinitionAccess().getEqualsSignKeyword_7_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getQuestionDefinitionAccess().getEqualsSignKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_7__0__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group_7__1"
    // InternalQLS.g:8311:1: rule__QuestionDefinition__Group_7__1 : rule__QuestionDefinition__Group_7__1__Impl rule__QuestionDefinition__Group_7__2 ;
    public final void rule__QuestionDefinition__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8315:1: ( rule__QuestionDefinition__Group_7__1__Impl rule__QuestionDefinition__Group_7__2 )
            // InternalQLS.g:8316:2: rule__QuestionDefinition__Group_7__1__Impl rule__QuestionDefinition__Group_7__2
            {
            pushFollow(FOLLOW_75);
            rule__QuestionDefinition__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_7__1"


    // $ANTLR start "rule__QuestionDefinition__Group_7__1__Impl"
    // InternalQLS.g:8323:1: rule__QuestionDefinition__Group_7__1__Impl : ( ( rule__QuestionDefinition__ComputedExpressionAssignment_7_1 ) ) ;
    public final void rule__QuestionDefinition__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8327:1: ( ( ( rule__QuestionDefinition__ComputedExpressionAssignment_7_1 ) ) )
            // InternalQLS.g:8328:1: ( ( rule__QuestionDefinition__ComputedExpressionAssignment_7_1 ) )
            {
            // InternalQLS.g:8328:1: ( ( rule__QuestionDefinition__ComputedExpressionAssignment_7_1 ) )
            // InternalQLS.g:8329:2: ( rule__QuestionDefinition__ComputedExpressionAssignment_7_1 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getComputedExpressionAssignment_7_1()); 
            // InternalQLS.g:8330:2: ( rule__QuestionDefinition__ComputedExpressionAssignment_7_1 )
            // InternalQLS.g:8330:3: rule__QuestionDefinition__ComputedExpressionAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__ComputedExpressionAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionDefinitionAccess().getComputedExpressionAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_7__1__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group_7__2"
    // InternalQLS.g:8338:1: rule__QuestionDefinition__Group_7__2 : rule__QuestionDefinition__Group_7__2__Impl ;
    public final void rule__QuestionDefinition__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8342:1: ( rule__QuestionDefinition__Group_7__2__Impl )
            // InternalQLS.g:8343:2: rule__QuestionDefinition__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_7__2"


    // $ANTLR start "rule__QuestionDefinition__Group_7__2__Impl"
    // InternalQLS.g:8349:1: rule__QuestionDefinition__Group_7__2__Impl : ( ';' ) ;
    public final void rule__QuestionDefinition__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8353:1: ( ( ';' ) )
            // InternalQLS.g:8354:1: ( ';' )
            {
            // InternalQLS.g:8354:1: ( ';' )
            // InternalQLS.g:8355:2: ';'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getSemicolonKeyword_7_2()); 
            match(input,83,FOLLOW_2); 
             after(grammarAccess.getQuestionDefinitionAccess().getSemicolonKeyword_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_7__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalQLS.g:8365:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8369:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalQLS.g:8370:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_76);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalQLS.g:8377:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8381:1: ( ( RULE_ID ) )
            // InternalQLS.g:8382:1: ( RULE_ID )
            {
            // InternalQLS.g:8382:1: ( RULE_ID )
            // InternalQLS.g:8383:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalQLS.g:8392:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8396:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalQLS.g:8397:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalQLS.g:8403:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8407:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalQLS.g:8408:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalQLS.g:8408:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalQLS.g:8409:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalQLS.g:8410:2: ( rule__QualifiedName__Group_1__0 )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==79) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalQLS.g:8410:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_77);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalQLS.g:8419:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8423:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalQLS.g:8424:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalQLS.g:8431:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8435:1: ( ( '.' ) )
            // InternalQLS.g:8436:1: ( '.' )
            {
            // InternalQLS.g:8436:1: ( '.' )
            // InternalQLS.g:8437:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalQLS.g:8446:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8450:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalQLS.g:8451:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalQLS.g:8457:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8461:1: ( ( RULE_ID ) )
            // InternalQLS.g:8462:1: ( RULE_ID )
            {
            // InternalQLS.g:8462:1: ( RULE_ID )
            // InternalQLS.g:8463:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__QLSModel__ImportsAssignment_1"
    // InternalQLS.g:8473:1: rule__QLSModel__ImportsAssignment_1 : ( ruleImport ) ;
    public final void rule__QLSModel__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8477:1: ( ( ruleImport ) )
            // InternalQLS.g:8478:2: ( ruleImport )
            {
            // InternalQLS.g:8478:2: ( ruleImport )
            // InternalQLS.g:8479:3: ruleImport
            {
             before(grammarAccess.getQLSModelAccess().getImportsImportParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getQLSModelAccess().getImportsImportParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLSModel__ImportsAssignment_1"


    // $ANTLR start "rule__QLSModel__QuestionStylesAssignment_6"
    // InternalQLS.g:8488:1: rule__QLSModel__QuestionStylesAssignment_6 : ( ruleQuestionStyle ) ;
    public final void rule__QLSModel__QuestionStylesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8492:1: ( ( ruleQuestionStyle ) )
            // InternalQLS.g:8493:2: ( ruleQuestionStyle )
            {
            // InternalQLS.g:8493:2: ( ruleQuestionStyle )
            // InternalQLS.g:8494:3: ruleQuestionStyle
            {
             before(grammarAccess.getQLSModelAccess().getQuestionStylesQuestionStyleParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestionStyle();

            state._fsp--;

             after(grammarAccess.getQLSModelAccess().getQuestionStylesQuestionStyleParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLSModel__QuestionStylesAssignment_6"


    // $ANTLR start "rule__Import__ImportURIAssignment_2"
    // InternalQLS.g:8503:1: rule__Import__ImportURIAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8507:1: ( ( RULE_STRING ) )
            // InternalQLS.g:8508:2: ( RULE_STRING )
            {
            // InternalQLS.g:8508:2: ( RULE_STRING )
            // InternalQLS.g:8509:3: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportURIAssignment_2"


    // $ANTLR start "rule__QuestionStyle__StyledQuestionAssignment_1"
    // InternalQLS.g:8518:1: rule__QuestionStyle__StyledQuestionAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__QuestionStyle__StyledQuestionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8522:1: ( ( ( RULE_ID ) ) )
            // InternalQLS.g:8523:2: ( ( RULE_ID ) )
            {
            // InternalQLS.g:8523:2: ( ( RULE_ID ) )
            // InternalQLS.g:8524:3: ( RULE_ID )
            {
             before(grammarAccess.getQuestionStyleAccess().getStyledQuestionQuestionDefinitionCrossReference_1_0()); 
            // InternalQLS.g:8525:3: ( RULE_ID )
            // InternalQLS.g:8526:4: RULE_ID
            {
             before(grammarAccess.getQuestionStyleAccess().getStyledQuestionQuestionDefinitionIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQuestionStyleAccess().getStyledQuestionQuestionDefinitionIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getQuestionStyleAccess().getStyledQuestionQuestionDefinitionCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStyle__StyledQuestionAssignment_1"


    // $ANTLR start "rule__QuestionStyle__LabelStyleAssignment_3_1"
    // InternalQLS.g:8537:1: rule__QuestionStyle__LabelStyleAssignment_3_1 : ( ruleLabelStyle ) ;
    public final void rule__QuestionStyle__LabelStyleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8541:1: ( ( ruleLabelStyle ) )
            // InternalQLS.g:8542:2: ( ruleLabelStyle )
            {
            // InternalQLS.g:8542:2: ( ruleLabelStyle )
            // InternalQLS.g:8543:3: ruleLabelStyle
            {
             before(grammarAccess.getQuestionStyleAccess().getLabelStyleLabelStyleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLabelStyle();

            state._fsp--;

             after(grammarAccess.getQuestionStyleAccess().getLabelStyleLabelStyleParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStyle__LabelStyleAssignment_3_1"


    // $ANTLR start "rule__QuestionStyle__TypeStyleAssignment_4_1"
    // InternalQLS.g:8552:1: rule__QuestionStyle__TypeStyleAssignment_4_1 : ( ruleTypeStyle ) ;
    public final void rule__QuestionStyle__TypeStyleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8556:1: ( ( ruleTypeStyle ) )
            // InternalQLS.g:8557:2: ( ruleTypeStyle )
            {
            // InternalQLS.g:8557:2: ( ruleTypeStyle )
            // InternalQLS.g:8558:3: ruleTypeStyle
            {
             before(grammarAccess.getQuestionStyleAccess().getTypeStyleTypeStyleParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeStyle();

            state._fsp--;

             after(grammarAccess.getQuestionStyleAccess().getTypeStyleTypeStyleParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStyle__TypeStyleAssignment_4_1"


    // $ANTLR start "rule__LabelStyle__ItalicAssignment_2"
    // InternalQLS.g:8567:1: rule__LabelStyle__ItalicAssignment_2 : ( ( 'italic' ) ) ;
    public final void rule__LabelStyle__ItalicAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8571:1: ( ( ( 'italic' ) ) )
            // InternalQLS.g:8572:2: ( ( 'italic' ) )
            {
            // InternalQLS.g:8572:2: ( ( 'italic' ) )
            // InternalQLS.g:8573:3: ( 'italic' )
            {
             before(grammarAccess.getLabelStyleAccess().getItalicItalicKeyword_2_0()); 
            // InternalQLS.g:8574:3: ( 'italic' )
            // InternalQLS.g:8575:4: 'italic'
            {
             before(grammarAccess.getLabelStyleAccess().getItalicItalicKeyword_2_0()); 
            match(input,84,FOLLOW_2); 
             after(grammarAccess.getLabelStyleAccess().getItalicItalicKeyword_2_0()); 

            }

             after(grammarAccess.getLabelStyleAccess().getItalicItalicKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelStyle__ItalicAssignment_2"


    // $ANTLR start "rule__LabelStyle__BoldAssignment_3"
    // InternalQLS.g:8586:1: rule__LabelStyle__BoldAssignment_3 : ( ( 'bold' ) ) ;
    public final void rule__LabelStyle__BoldAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8590:1: ( ( ( 'bold' ) ) )
            // InternalQLS.g:8591:2: ( ( 'bold' ) )
            {
            // InternalQLS.g:8591:2: ( ( 'bold' ) )
            // InternalQLS.g:8592:3: ( 'bold' )
            {
             before(grammarAccess.getLabelStyleAccess().getBoldBoldKeyword_3_0()); 
            // InternalQLS.g:8593:3: ( 'bold' )
            // InternalQLS.g:8594:4: 'bold'
            {
             before(grammarAccess.getLabelStyleAccess().getBoldBoldKeyword_3_0()); 
            match(input,85,FOLLOW_2); 
             after(grammarAccess.getLabelStyleAccess().getBoldBoldKeyword_3_0()); 

            }

             after(grammarAccess.getLabelStyleAccess().getBoldBoldKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelStyle__BoldAssignment_3"


    // $ANTLR start "rule__BooleanTypeStyle__BooleanStyleKindAssignment_2"
    // InternalQLS.g:8605:1: rule__BooleanTypeStyle__BooleanStyleKindAssignment_2 : ( ruleBooleanStyleKind ) ;
    public final void rule__BooleanTypeStyle__BooleanStyleKindAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8609:1: ( ( ruleBooleanStyleKind ) )
            // InternalQLS.g:8610:2: ( ruleBooleanStyleKind )
            {
            // InternalQLS.g:8610:2: ( ruleBooleanStyleKind )
            // InternalQLS.g:8611:3: ruleBooleanStyleKind
            {
             before(grammarAccess.getBooleanTypeStyleAccess().getBooleanStyleKindBooleanStyleKindEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBooleanStyleKind();

            state._fsp--;

             after(grammarAccess.getBooleanTypeStyleAccess().getBooleanStyleKindBooleanStyleKindEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanTypeStyle__BooleanStyleKindAssignment_2"


    // $ANTLR start "rule__NumericTypeTextFieldStyle__StepAssignment_4_1"
    // InternalQLS.g:8620:1: rule__NumericTypeTextFieldStyle__StepAssignment_4_1 : ( ruleEDouble ) ;
    public final void rule__NumericTypeTextFieldStyle__StepAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8624:1: ( ( ruleEDouble ) )
            // InternalQLS.g:8625:2: ( ruleEDouble )
            {
            // InternalQLS.g:8625:2: ( ruleEDouble )
            // InternalQLS.g:8626:3: ruleEDouble
            {
             before(grammarAccess.getNumericTypeTextFieldStyleAccess().getStepEDoubleParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getNumericTypeTextFieldStyleAccess().getStepEDoubleParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericTypeTextFieldStyle__StepAssignment_4_1"


    // $ANTLR start "rule__TextTypeStyle__MultilineAssignment_3"
    // InternalQLS.g:8635:1: rule__TextTypeStyle__MultilineAssignment_3 : ( ( 'multiline' ) ) ;
    public final void rule__TextTypeStyle__MultilineAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8639:1: ( ( ( 'multiline' ) ) )
            // InternalQLS.g:8640:2: ( ( 'multiline' ) )
            {
            // InternalQLS.g:8640:2: ( ( 'multiline' ) )
            // InternalQLS.g:8641:3: ( 'multiline' )
            {
             before(grammarAccess.getTextTypeStyleAccess().getMultilineMultilineKeyword_3_0()); 
            // InternalQLS.g:8642:3: ( 'multiline' )
            // InternalQLS.g:8643:4: 'multiline'
            {
             before(grammarAccess.getTextTypeStyleAccess().getMultilineMultilineKeyword_3_0()); 
            match(input,86,FOLLOW_2); 
             after(grammarAccess.getTextTypeStyleAccess().getMultilineMultilineKeyword_3_0()); 

            }

             after(grammarAccess.getTextTypeStyleAccess().getMultilineMultilineKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextTypeStyle__MultilineAssignment_3"


    // $ANTLR start "rule__UnaryExpression__OperatorAssignment_1"
    // InternalQLS.g:8654:1: rule__UnaryExpression__OperatorAssignment_1 : ( ruleUnaryOperatorKind ) ;
    public final void rule__UnaryExpression__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8658:1: ( ( ruleUnaryOperatorKind ) )
            // InternalQLS.g:8659:2: ( ruleUnaryOperatorKind )
            {
            // InternalQLS.g:8659:2: ( ruleUnaryOperatorKind )
            // InternalQLS.g:8660:3: ruleUnaryOperatorKind
            {
             before(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorKindEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryOperatorKind();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorKindEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__OperatorAssignment_1"


    // $ANTLR start "rule__UnaryExpression__OperandAssignment_2"
    // InternalQLS.g:8669:1: rule__UnaryExpression__OperandAssignment_2 : ( ruleUnaryOrPrimaryExpression ) ;
    public final void rule__UnaryExpression__OperandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8673:1: ( ( ruleUnaryOrPrimaryExpression ) )
            // InternalQLS.g:8674:2: ( ruleUnaryOrPrimaryExpression )
            {
            // InternalQLS.g:8674:2: ( ruleUnaryOrPrimaryExpression )
            // InternalQLS.g:8675:3: ruleUnaryOrPrimaryExpression
            {
             before(grammarAccess.getUnaryExpressionAccess().getOperandUnaryOrPrimaryExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryOrPrimaryExpression();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionAccess().getOperandUnaryOrPrimaryExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__OperandAssignment_2"


    // $ANTLR start "rule__IfExpression__ConditionAssignment_2"
    // InternalQLS.g:8684:1: rule__IfExpression__ConditionAssignment_2 : ( ruleExpression ) ;
    public final void rule__IfExpression__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8688:1: ( ( ruleExpression ) )
            // InternalQLS.g:8689:2: ( ruleExpression )
            {
            // InternalQLS.g:8689:2: ( ruleExpression )
            // InternalQLS.g:8690:3: ruleExpression
            {
             before(grammarAccess.getIfExpressionAccess().getConditionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getIfExpressionAccess().getConditionExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__ConditionAssignment_2"


    // $ANTLR start "rule__IfExpression__ThenExpressionAssignment_4"
    // InternalQLS.g:8699:1: rule__IfExpression__ThenExpressionAssignment_4 : ( ruleExpression ) ;
    public final void rule__IfExpression__ThenExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8703:1: ( ( ruleExpression ) )
            // InternalQLS.g:8704:2: ( ruleExpression )
            {
            // InternalQLS.g:8704:2: ( ruleExpression )
            // InternalQLS.g:8705:3: ruleExpression
            {
             before(grammarAccess.getIfExpressionAccess().getThenExpressionExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getIfExpressionAccess().getThenExpressionExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__ThenExpressionAssignment_4"


    // $ANTLR start "rule__IfExpression__ElseExpressionAssignment_5_1"
    // InternalQLS.g:8714:1: rule__IfExpression__ElseExpressionAssignment_5_1 : ( ruleExpression ) ;
    public final void rule__IfExpression__ElseExpressionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8718:1: ( ( ruleExpression ) )
            // InternalQLS.g:8719:2: ( ruleExpression )
            {
            // InternalQLS.g:8719:2: ( ruleExpression )
            // InternalQLS.g:8720:3: ruleExpression
            {
             before(grammarAccess.getIfExpressionAccess().getElseExpressionExpressionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getIfExpressionAccess().getElseExpressionExpressionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__ElseExpressionAssignment_5_1"


    // $ANTLR start "rule__OrExpression__OperatorAssignment_1_1"
    // InternalQLS.g:8729:1: rule__OrExpression__OperatorAssignment_1_1 : ( ruleOrOperatorKind ) ;
    public final void rule__OrExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8733:1: ( ( ruleOrOperatorKind ) )
            // InternalQLS.g:8734:2: ( ruleOrOperatorKind )
            {
            // InternalQLS.g:8734:2: ( ruleOrOperatorKind )
            // InternalQLS.g:8735:3: ruleOrOperatorKind
            {
             before(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorKindEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrOperatorKind();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorKindEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__OrExpression__RhsOperandAssignment_1_2"
    // InternalQLS.g:8744:1: rule__OrExpression__RhsOperandAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__RhsOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8748:1: ( ( ruleAndExpression ) )
            // InternalQLS.g:8749:2: ( ruleAndExpression )
            {
            // InternalQLS.g:8749:2: ( ruleAndExpression )
            // InternalQLS.g:8750:3: ruleAndExpression
            {
             before(grammarAccess.getOrExpressionAccess().getRhsOperandAndExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getRhsOperandAndExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__RhsOperandAssignment_1_2"


    // $ANTLR start "rule__AndExpression__OperatorAssignment_1_1"
    // InternalQLS.g:8759:1: rule__AndExpression__OperatorAssignment_1_1 : ( ruleAndOperatorKind ) ;
    public final void rule__AndExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8763:1: ( ( ruleAndOperatorKind ) )
            // InternalQLS.g:8764:2: ( ruleAndOperatorKind )
            {
            // InternalQLS.g:8764:2: ( ruleAndOperatorKind )
            // InternalQLS.g:8765:3: ruleAndOperatorKind
            {
             before(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorKindEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAndOperatorKind();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorKindEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__AndExpression__RhsOperandAssignment_1_2"
    // InternalQLS.g:8774:1: rule__AndExpression__RhsOperandAssignment_1_2 : ( ruleEqualExpression ) ;
    public final void rule__AndExpression__RhsOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8778:1: ( ( ruleEqualExpression ) )
            // InternalQLS.g:8779:2: ( ruleEqualExpression )
            {
            // InternalQLS.g:8779:2: ( ruleEqualExpression )
            // InternalQLS.g:8780:3: ruleEqualExpression
            {
             before(grammarAccess.getAndExpressionAccess().getRhsOperandEqualExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEqualExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getRhsOperandEqualExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__RhsOperandAssignment_1_2"


    // $ANTLR start "rule__EqualExpression__OperatorAssignment_1_1"
    // InternalQLS.g:8789:1: rule__EqualExpression__OperatorAssignment_1_1 : ( ruleEqualOperatorKind ) ;
    public final void rule__EqualExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8793:1: ( ( ruleEqualOperatorKind ) )
            // InternalQLS.g:8794:2: ( ruleEqualOperatorKind )
            {
            // InternalQLS.g:8794:2: ( ruleEqualOperatorKind )
            // InternalQLS.g:8795:3: ruleEqualOperatorKind
            {
             before(grammarAccess.getEqualExpressionAccess().getOperatorEqualOperatorKindEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEqualOperatorKind();

            state._fsp--;

             after(grammarAccess.getEqualExpressionAccess().getOperatorEqualOperatorKindEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__EqualExpression__RhsOperandAssignment_1_2"
    // InternalQLS.g:8804:1: rule__EqualExpression__RhsOperandAssignment_1_2 : ( ruleComparisionExpression ) ;
    public final void rule__EqualExpression__RhsOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8808:1: ( ( ruleComparisionExpression ) )
            // InternalQLS.g:8809:2: ( ruleComparisionExpression )
            {
            // InternalQLS.g:8809:2: ( ruleComparisionExpression )
            // InternalQLS.g:8810:3: ruleComparisionExpression
            {
             before(grammarAccess.getEqualExpressionAccess().getRhsOperandComparisionExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComparisionExpression();

            state._fsp--;

             after(grammarAccess.getEqualExpressionAccess().getRhsOperandComparisionExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__RhsOperandAssignment_1_2"


    // $ANTLR start "rule__ComparisionExpression__OperatorAssignment_1_1"
    // InternalQLS.g:8819:1: rule__ComparisionExpression__OperatorAssignment_1_1 : ( ruleComparisionOperatorKind ) ;
    public final void rule__ComparisionExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8823:1: ( ( ruleComparisionOperatorKind ) )
            // InternalQLS.g:8824:2: ( ruleComparisionOperatorKind )
            {
            // InternalQLS.g:8824:2: ( ruleComparisionOperatorKind )
            // InternalQLS.g:8825:3: ruleComparisionOperatorKind
            {
             before(grammarAccess.getComparisionExpressionAccess().getOperatorComparisionOperatorKindEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComparisionOperatorKind();

            state._fsp--;

             after(grammarAccess.getComparisionExpressionAccess().getOperatorComparisionOperatorKindEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisionExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__ComparisionExpression__RhsOperandAssignment_1_2"
    // InternalQLS.g:8834:1: rule__ComparisionExpression__RhsOperandAssignment_1_2 : ( ruleAdditionExpression ) ;
    public final void rule__ComparisionExpression__RhsOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8838:1: ( ( ruleAdditionExpression ) )
            // InternalQLS.g:8839:2: ( ruleAdditionExpression )
            {
            // InternalQLS.g:8839:2: ( ruleAdditionExpression )
            // InternalQLS.g:8840:3: ruleAdditionExpression
            {
             before(grammarAccess.getComparisionExpressionAccess().getRhsOperandAdditionExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAdditionExpression();

            state._fsp--;

             after(grammarAccess.getComparisionExpressionAccess().getRhsOperandAdditionExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisionExpression__RhsOperandAssignment_1_2"


    // $ANTLR start "rule__AdditionExpression__OperatorAssignment_1_1"
    // InternalQLS.g:8849:1: rule__AdditionExpression__OperatorAssignment_1_1 : ( ruleAdditionOperatorKind ) ;
    public final void rule__AdditionExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8853:1: ( ( ruleAdditionOperatorKind ) )
            // InternalQLS.g:8854:2: ( ruleAdditionOperatorKind )
            {
            // InternalQLS.g:8854:2: ( ruleAdditionOperatorKind )
            // InternalQLS.g:8855:3: ruleAdditionOperatorKind
            {
             before(grammarAccess.getAdditionExpressionAccess().getOperatorAdditionOperatorKindEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAdditionOperatorKind();

            state._fsp--;

             after(grammarAccess.getAdditionExpressionAccess().getOperatorAdditionOperatorKindEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__AdditionExpression__RhsOperandAssignment_1_2"
    // InternalQLS.g:8864:1: rule__AdditionExpression__RhsOperandAssignment_1_2 : ( ruleMultiplicationExpression ) ;
    public final void rule__AdditionExpression__RhsOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8868:1: ( ( ruleMultiplicationExpression ) )
            // InternalQLS.g:8869:2: ( ruleMultiplicationExpression )
            {
            // InternalQLS.g:8869:2: ( ruleMultiplicationExpression )
            // InternalQLS.g:8870:3: ruleMultiplicationExpression
            {
             before(grammarAccess.getAdditionExpressionAccess().getRhsOperandMultiplicationExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicationExpression();

            state._fsp--;

             after(grammarAccess.getAdditionExpressionAccess().getRhsOperandMultiplicationExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__RhsOperandAssignment_1_2"


    // $ANTLR start "rule__MultiplicationExpression__OperatorAssignment_1_1"
    // InternalQLS.g:8879:1: rule__MultiplicationExpression__OperatorAssignment_1_1 : ( ruleMultiplicationOperatorKind ) ;
    public final void rule__MultiplicationExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8883:1: ( ( ruleMultiplicationOperatorKind ) )
            // InternalQLS.g:8884:2: ( ruleMultiplicationOperatorKind )
            {
            // InternalQLS.g:8884:2: ( ruleMultiplicationOperatorKind )
            // InternalQLS.g:8885:3: ruleMultiplicationOperatorKind
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getOperatorMultiplicationOperatorKindEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicationOperatorKind();

            state._fsp--;

             after(grammarAccess.getMultiplicationExpressionAccess().getOperatorMultiplicationOperatorKindEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__MultiplicationExpression__RhsOperandAssignment_1_2"
    // InternalQLS.g:8894:1: rule__MultiplicationExpression__RhsOperandAssignment_1_2 : ( ruleUnaryOrPrimaryExpression ) ;
    public final void rule__MultiplicationExpression__RhsOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8898:1: ( ( ruleUnaryOrPrimaryExpression ) )
            // InternalQLS.g:8899:2: ( ruleUnaryOrPrimaryExpression )
            {
            // InternalQLS.g:8899:2: ( ruleUnaryOrPrimaryExpression )
            // InternalQLS.g:8900:3: ruleUnaryOrPrimaryExpression
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getRhsOperandUnaryOrPrimaryExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryOrPrimaryExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationExpressionAccess().getRhsOperandUnaryOrPrimaryExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__RhsOperandAssignment_1_2"


    // $ANTLR start "rule__Form__NameAssignment_1"
    // InternalQLS.g:8909:1: rule__Form__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Form__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8913:1: ( ( RULE_ID ) )
            // InternalQLS.g:8914:2: ( RULE_ID )
            {
            // InternalQLS.g:8914:2: ( RULE_ID )
            // InternalQLS.g:8915:3: RULE_ID
            {
             before(grammarAccess.getFormAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFormAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__NameAssignment_1"


    // $ANTLR start "rule__Form__QuestionGroupAssignment_2"
    // InternalQLS.g:8924:1: rule__Form__QuestionGroupAssignment_2 : ( ruleQuestionGroup ) ;
    public final void rule__Form__QuestionGroupAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8928:1: ( ( ruleQuestionGroup ) )
            // InternalQLS.g:8929:2: ( ruleQuestionGroup )
            {
            // InternalQLS.g:8929:2: ( ruleQuestionGroup )
            // InternalQLS.g:8930:3: ruleQuestionGroup
            {
             before(grammarAccess.getFormAccess().getQuestionGroupQuestionGroupParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestionGroup();

            state._fsp--;

             after(grammarAccess.getFormAccess().getQuestionGroupQuestionGroupParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__QuestionGroupAssignment_2"


    // $ANTLR start "rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0"
    // InternalQLS.g:8939:1: rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0 : ( ruleQuestionDefinition ) ;
    public final void rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8943:1: ( ( ruleQuestionDefinition ) )
            // InternalQLS.g:8944:2: ( ruleQuestionDefinition )
            {
            // InternalQLS.g:8944:2: ( ruleQuestionDefinition )
            // InternalQLS.g:8945:3: ruleQuestionDefinition
            {
             before(grammarAccess.getDefinitionGroupAccess().getQuestionDefinitionsQuestionDefinitionParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestionDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionGroupAccess().getQuestionDefinitionsQuestionDefinitionParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0"


    // $ANTLR start "rule__DefinitionGroup__DataTypesAssignment_3_1"
    // InternalQLS.g:8954:1: rule__DefinitionGroup__DataTypesAssignment_3_1 : ( ruleValueType ) ;
    public final void rule__DefinitionGroup__DataTypesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8958:1: ( ( ruleValueType ) )
            // InternalQLS.g:8959:2: ( ruleValueType )
            {
            // InternalQLS.g:8959:2: ( ruleValueType )
            // InternalQLS.g:8960:3: ruleValueType
            {
             before(grammarAccess.getDefinitionGroupAccess().getDataTypesValueTypeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValueType();

            state._fsp--;

             after(grammarAccess.getDefinitionGroupAccess().getDataTypesValueTypeParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__DataTypesAssignment_3_1"


    // $ANTLR start "rule__QuestionGroup__GuardAssignment_1_1"
    // InternalQLS.g:8969:1: rule__QuestionGroup__GuardAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__QuestionGroup__GuardAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8973:1: ( ( ruleExpression ) )
            // InternalQLS.g:8974:2: ( ruleExpression )
            {
            // InternalQLS.g:8974:2: ( ruleExpression )
            // InternalQLS.g:8975:3: ruleExpression
            {
             before(grammarAccess.getQuestionGroupAccess().getGuardExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getQuestionGroupAccess().getGuardExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__GuardAssignment_1_1"


    // $ANTLR start "rule__QuestionGroup__QuestionGroupsAssignment_3_0"
    // InternalQLS.g:8984:1: rule__QuestionGroup__QuestionGroupsAssignment_3_0 : ( ruleQuestionGroup ) ;
    public final void rule__QuestionGroup__QuestionGroupsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8988:1: ( ( ruleQuestionGroup ) )
            // InternalQLS.g:8989:2: ( ruleQuestionGroup )
            {
            // InternalQLS.g:8989:2: ( ruleQuestionGroup )
            // InternalQLS.g:8990:3: ruleQuestionGroup
            {
             before(grammarAccess.getQuestionGroupAccess().getQuestionGroupsQuestionGroupParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestionGroup();

            state._fsp--;

             after(grammarAccess.getQuestionGroupAccess().getQuestionGroupsQuestionGroupParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__QuestionGroupsAssignment_3_0"


    // $ANTLR start "rule__QuestionGroup__QuestionsAssignment_3_1"
    // InternalQLS.g:8999:1: rule__QuestionGroup__QuestionsAssignment_3_1 : ( ruleQuestion ) ;
    public final void rule__QuestionGroup__QuestionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9003:1: ( ( ruleQuestion ) )
            // InternalQLS.g:9004:2: ( ruleQuestion )
            {
            // InternalQLS.g:9004:2: ( ruleQuestion )
            // InternalQLS.g:9005:3: ruleQuestion
            {
             before(grammarAccess.getQuestionGroupAccess().getQuestionsQuestionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionGroupAccess().getQuestionsQuestionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__QuestionsAssignment_3_1"


    // $ANTLR start "rule__Question__QuestionDefinitionAssignment"
    // InternalQLS.g:9014:1: rule__Question__QuestionDefinitionAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__Question__QuestionDefinitionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9018:1: ( ( ( ruleQualifiedName ) ) )
            // InternalQLS.g:9019:2: ( ( ruleQualifiedName ) )
            {
            // InternalQLS.g:9019:2: ( ( ruleQualifiedName ) )
            // InternalQLS.g:9020:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getQuestionAccess().getQuestionDefinitionQuestionDefinitionCrossReference_0()); 
            // InternalQLS.g:9021:3: ( ruleQualifiedName )
            // InternalQLS.g:9022:4: ruleQualifiedName
            {
             before(grammarAccess.getQuestionAccess().getQuestionDefinitionQuestionDefinitionQualifiedNameParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getQuestionDefinitionQuestionDefinitionQualifiedNameParserRuleCall_0_1()); 

            }

             after(grammarAccess.getQuestionAccess().getQuestionDefinitionQuestionDefinitionCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__QuestionDefinitionAssignment"


    // $ANTLR start "rule__ValueType_Impl__NameAssignment_2"
    // InternalQLS.g:9033:1: rule__ValueType_Impl__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ValueType_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9037:1: ( ( RULE_ID ) )
            // InternalQLS.g:9038:2: ( RULE_ID )
            {
            // InternalQLS.g:9038:2: ( RULE_ID )
            // InternalQLS.g:9039:3: RULE_ID
            {
             before(grammarAccess.getValueType_ImplAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getValueType_ImplAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType_Impl__NameAssignment_2"


    // $ANTLR start "rule__ValueType_Impl__UnitAssignment_4_1"
    // InternalQLS.g:9048:1: rule__ValueType_Impl__UnitAssignment_4_1 : ( ruleEString ) ;
    public final void rule__ValueType_Impl__UnitAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9052:1: ( ( ruleEString ) )
            // InternalQLS.g:9053:2: ( ruleEString )
            {
            // InternalQLS.g:9053:2: ( ruleEString )
            // InternalQLS.g:9054:3: ruleEString
            {
             before(grammarAccess.getValueType_ImplAccess().getUnitEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getValueType_ImplAccess().getUnitEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType_Impl__UnitAssignment_4_1"


    // $ANTLR start "rule__ConstantCall__ValueAssignment_1"
    // InternalQLS.g:9063:1: rule__ConstantCall__ValueAssignment_1 : ( ( rule__ConstantCall__ValueAlternatives_1_0 ) ) ;
    public final void rule__ConstantCall__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9067:1: ( ( ( rule__ConstantCall__ValueAlternatives_1_0 ) ) )
            // InternalQLS.g:9068:2: ( ( rule__ConstantCall__ValueAlternatives_1_0 ) )
            {
            // InternalQLS.g:9068:2: ( ( rule__ConstantCall__ValueAlternatives_1_0 ) )
            // InternalQLS.g:9069:3: ( rule__ConstantCall__ValueAlternatives_1_0 )
            {
             before(grammarAccess.getConstantCallAccess().getValueAlternatives_1_0()); 
            // InternalQLS.g:9070:3: ( rule__ConstantCall__ValueAlternatives_1_0 )
            // InternalQLS.g:9070:4: rule__ConstantCall__ValueAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ConstantCall__ValueAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getConstantCallAccess().getValueAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantCall__ValueAssignment_1"


    // $ANTLR start "rule__QuestionCall__QuestionAssignment_1"
    // InternalQLS.g:9078:1: rule__QuestionCall__QuestionAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__QuestionCall__QuestionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9082:1: ( ( ( ruleQualifiedName ) ) )
            // InternalQLS.g:9083:2: ( ( ruleQualifiedName ) )
            {
            // InternalQLS.g:9083:2: ( ( ruleQualifiedName ) )
            // InternalQLS.g:9084:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getQuestionCallAccess().getQuestionQuestionDefinitionCrossReference_1_0()); 
            // InternalQLS.g:9085:3: ( ruleQualifiedName )
            // InternalQLS.g:9086:4: ruleQualifiedName
            {
             before(grammarAccess.getQuestionCallAccess().getQuestionQuestionDefinitionQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQuestionCallAccess().getQuestionQuestionDefinitionQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getQuestionCallAccess().getQuestionQuestionDefinitionCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCall__QuestionAssignment_1"


    // $ANTLR start "rule__BooleanValueType__NameAssignment_2"
    // InternalQLS.g:9097:1: rule__BooleanValueType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BooleanValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9101:1: ( ( RULE_ID ) )
            // InternalQLS.g:9102:2: ( RULE_ID )
            {
            // InternalQLS.g:9102:2: ( RULE_ID )
            // InternalQLS.g:9103:3: RULE_ID
            {
             before(grammarAccess.getBooleanValueTypeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBooleanValueTypeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__NameAssignment_2"


    // $ANTLR start "rule__BooleanValueType__UnitAssignment_3_1_1"
    // InternalQLS.g:9112:1: rule__BooleanValueType__UnitAssignment_3_1_1 : ( ruleEString ) ;
    public final void rule__BooleanValueType__UnitAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9116:1: ( ( ruleEString ) )
            // InternalQLS.g:9117:2: ( ruleEString )
            {
            // InternalQLS.g:9117:2: ( ruleEString )
            // InternalQLS.g:9118:3: ruleEString
            {
             before(grammarAccess.getBooleanValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBooleanValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__UnitAssignment_3_1_1"


    // $ANTLR start "rule__IntegerValueType__NameAssignment_2"
    // InternalQLS.g:9127:1: rule__IntegerValueType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__IntegerValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9131:1: ( ( RULE_ID ) )
            // InternalQLS.g:9132:2: ( RULE_ID )
            {
            // InternalQLS.g:9132:2: ( RULE_ID )
            // InternalQLS.g:9133:3: RULE_ID
            {
             before(grammarAccess.getIntegerValueTypeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIntegerValueTypeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__NameAssignment_2"


    // $ANTLR start "rule__IntegerValueType__UnitAssignment_3_1_1"
    // InternalQLS.g:9142:1: rule__IntegerValueType__UnitAssignment_3_1_1 : ( ruleEString ) ;
    public final void rule__IntegerValueType__UnitAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9146:1: ( ( ruleEString ) )
            // InternalQLS.g:9147:2: ( ruleEString )
            {
            // InternalQLS.g:9147:2: ( ruleEString )
            // InternalQLS.g:9148:3: ruleEString
            {
             before(grammarAccess.getIntegerValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIntegerValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__UnitAssignment_3_1_1"


    // $ANTLR start "rule__IntegerValueType__MinAssignment_3_2_1"
    // InternalQLS.g:9157:1: rule__IntegerValueType__MinAssignment_3_2_1 : ( ruleEInt ) ;
    public final void rule__IntegerValueType__MinAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9161:1: ( ( ruleEInt ) )
            // InternalQLS.g:9162:2: ( ruleEInt )
            {
            // InternalQLS.g:9162:2: ( ruleEInt )
            // InternalQLS.g:9163:3: ruleEInt
            {
             before(grammarAccess.getIntegerValueTypeAccess().getMinEIntParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIntegerValueTypeAccess().getMinEIntParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__MinAssignment_3_2_1"


    // $ANTLR start "rule__IntegerValueType__MaxAssignment_3_3_1"
    // InternalQLS.g:9172:1: rule__IntegerValueType__MaxAssignment_3_3_1 : ( ruleEInt ) ;
    public final void rule__IntegerValueType__MaxAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9176:1: ( ( ruleEInt ) )
            // InternalQLS.g:9177:2: ( ruleEInt )
            {
            // InternalQLS.g:9177:2: ( ruleEInt )
            // InternalQLS.g:9178:3: ruleEInt
            {
             before(grammarAccess.getIntegerValueTypeAccess().getMaxEIntParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIntegerValueTypeAccess().getMaxEIntParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__MaxAssignment_3_3_1"


    // $ANTLR start "rule__DecimalValueType__NameAssignment_2"
    // InternalQLS.g:9187:1: rule__DecimalValueType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DecimalValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9191:1: ( ( RULE_ID ) )
            // InternalQLS.g:9192:2: ( RULE_ID )
            {
            // InternalQLS.g:9192:2: ( RULE_ID )
            // InternalQLS.g:9193:3: RULE_ID
            {
             before(grammarAccess.getDecimalValueTypeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDecimalValueTypeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__NameAssignment_2"


    // $ANTLR start "rule__DecimalValueType__UnitAssignment_3_1_1"
    // InternalQLS.g:9202:1: rule__DecimalValueType__UnitAssignment_3_1_1 : ( ruleEString ) ;
    public final void rule__DecimalValueType__UnitAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9206:1: ( ( ruleEString ) )
            // InternalQLS.g:9207:2: ( ruleEString )
            {
            // InternalQLS.g:9207:2: ( ruleEString )
            // InternalQLS.g:9208:3: ruleEString
            {
             before(grammarAccess.getDecimalValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDecimalValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__UnitAssignment_3_1_1"


    // $ANTLR start "rule__DateValueType__NameAssignment_2"
    // InternalQLS.g:9217:1: rule__DateValueType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DateValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9221:1: ( ( RULE_ID ) )
            // InternalQLS.g:9222:2: ( RULE_ID )
            {
            // InternalQLS.g:9222:2: ( RULE_ID )
            // InternalQLS.g:9223:3: RULE_ID
            {
             before(grammarAccess.getDateValueTypeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDateValueTypeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__NameAssignment_2"


    // $ANTLR start "rule__DateValueType__UnitAssignment_3_1_1"
    // InternalQLS.g:9232:1: rule__DateValueType__UnitAssignment_3_1_1 : ( ruleEString ) ;
    public final void rule__DateValueType__UnitAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9236:1: ( ( ruleEString ) )
            // InternalQLS.g:9237:2: ( ruleEString )
            {
            // InternalQLS.g:9237:2: ( ruleEString )
            // InternalQLS.g:9238:3: ruleEString
            {
             before(grammarAccess.getDateValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDateValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__UnitAssignment_3_1_1"


    // $ANTLR start "rule__EnumerationValueType__NameAssignment_2"
    // InternalQLS.g:9247:1: rule__EnumerationValueType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EnumerationValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9251:1: ( ( RULE_ID ) )
            // InternalQLS.g:9252:2: ( RULE_ID )
            {
            // InternalQLS.g:9252:2: ( RULE_ID )
            // InternalQLS.g:9253:3: RULE_ID
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnumerationValueTypeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__NameAssignment_2"


    // $ANTLR start "rule__EnumerationValueType__UnitAssignment_3_1_1"
    // InternalQLS.g:9262:1: rule__EnumerationValueType__UnitAssignment_3_1_1 : ( ruleEString ) ;
    public final void rule__EnumerationValueType__UnitAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9266:1: ( ( ruleEString ) )
            // InternalQLS.g:9267:2: ( ruleEString )
            {
            // InternalQLS.g:9267:2: ( ruleEString )
            // InternalQLS.g:9268:3: ruleEString
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnumerationValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__UnitAssignment_3_1_1"


    // $ANTLR start "rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2"
    // InternalQLS.g:9277:1: rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2 : ( ruleEnumerationLiteral ) ;
    public final void rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9281:1: ( ( ruleEnumerationLiteral ) )
            // InternalQLS.g:9282:2: ( ruleEnumerationLiteral )
            {
            // InternalQLS.g:9282:2: ( ruleEnumerationLiteral )
            // InternalQLS.g:9283:3: ruleEnumerationLiteral
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_3_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumerationLiteral();

            state._fsp--;

             after(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_3_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2"


    // $ANTLR start "rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1"
    // InternalQLS.g:9292:1: rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1 : ( ruleEnumerationLiteral ) ;
    public final void rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9296:1: ( ( ruleEnumerationLiteral ) )
            // InternalQLS.g:9297:2: ( ruleEnumerationLiteral )
            {
            // InternalQLS.g:9297:2: ( ruleEnumerationLiteral )
            // InternalQLS.g:9298:3: ruleEnumerationLiteral
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_3_2_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumerationLiteral();

            state._fsp--;

             after(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_3_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1"


    // $ANTLR start "rule__StringValueType__NameAssignment_2"
    // InternalQLS.g:9307:1: rule__StringValueType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__StringValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9311:1: ( ( RULE_ID ) )
            // InternalQLS.g:9312:2: ( RULE_ID )
            {
            // InternalQLS.g:9312:2: ( RULE_ID )
            // InternalQLS.g:9313:3: RULE_ID
            {
             before(grammarAccess.getStringValueTypeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStringValueTypeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__NameAssignment_2"


    // $ANTLR start "rule__StringValueType__UnitAssignment_3_1_1"
    // InternalQLS.g:9322:1: rule__StringValueType__UnitAssignment_3_1_1 : ( ruleEString ) ;
    public final void rule__StringValueType__UnitAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9326:1: ( ( ruleEString ) )
            // InternalQLS.g:9327:2: ( ruleEString )
            {
            // InternalQLS.g:9327:2: ( ruleEString )
            // InternalQLS.g:9328:3: ruleEString
            {
             before(grammarAccess.getStringValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStringValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__UnitAssignment_3_1_1"


    // $ANTLR start "rule__EnumerationLiteral__NameAssignment_1"
    // InternalQLS.g:9337:1: rule__EnumerationLiteral__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumerationLiteral__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9341:1: ( ( RULE_ID ) )
            // InternalQLS.g:9342:2: ( RULE_ID )
            {
            // InternalQLS.g:9342:2: ( RULE_ID )
            // InternalQLS.g:9343:3: RULE_ID
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__NameAssignment_1"


    // $ANTLR start "rule__IntegerValue__IntValueAssignment_1"
    // InternalQLS.g:9352:1: rule__IntegerValue__IntValueAssignment_1 : ( ruleEInt ) ;
    public final void rule__IntegerValue__IntValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9356:1: ( ( ruleEInt ) )
            // InternalQLS.g:9357:2: ( ruleEInt )
            {
            // InternalQLS.g:9357:2: ( ruleEInt )
            // InternalQLS.g:9358:3: ruleEInt
            {
             before(grammarAccess.getIntegerValueAccess().getIntValueEIntParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIntegerValueAccess().getIntValueEIntParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__IntValueAssignment_1"


    // $ANTLR start "rule__StringValue__StringValueAssignment_1"
    // InternalQLS.g:9367:1: rule__StringValue__StringValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StringValue__StringValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9371:1: ( ( RULE_STRING ) )
            // InternalQLS.g:9372:2: ( RULE_STRING )
            {
            // InternalQLS.g:9372:2: ( RULE_STRING )
            // InternalQLS.g:9373:3: RULE_STRING
            {
             before(grammarAccess.getStringValueAccess().getStringValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringValueAccess().getStringValueSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__StringValueAssignment_1"


    // $ANTLR start "rule__BooleanValue__BooleanValueAssignment_1"
    // InternalQLS.g:9382:1: rule__BooleanValue__BooleanValueAssignment_1 : ( ruleEBoolean ) ;
    public final void rule__BooleanValue__BooleanValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9386:1: ( ( ruleEBoolean ) )
            // InternalQLS.g:9387:2: ( ruleEBoolean )
            {
            // InternalQLS.g:9387:2: ( ruleEBoolean )
            // InternalQLS.g:9388:3: ruleEBoolean
            {
             before(grammarAccess.getBooleanValueAccess().getBooleanValueEBooleanParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanValueAccess().getBooleanValueEBooleanParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__BooleanValueAssignment_1"


    // $ANTLR start "rule__EnumerationCall__EnumerationLiteralAssignment_1"
    // InternalQLS.g:9397:1: rule__EnumerationCall__EnumerationLiteralAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EnumerationCall__EnumerationLiteralAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9401:1: ( ( ( ruleQualifiedName ) ) )
            // InternalQLS.g:9402:2: ( ( ruleQualifiedName ) )
            {
            // InternalQLS.g:9402:2: ( ( ruleQualifiedName ) )
            // InternalQLS.g:9403:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getEnumerationCallAccess().getEnumerationLiteralEnumerationLiteralCrossReference_1_0()); 
            // InternalQLS.g:9404:3: ( ruleQualifiedName )
            // InternalQLS.g:9405:4: ruleQualifiedName
            {
             before(grammarAccess.getEnumerationCallAccess().getEnumerationLiteralEnumerationLiteralQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getEnumerationCallAccess().getEnumerationLiteralEnumerationLiteralQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getEnumerationCallAccess().getEnumerationLiteralEnumerationLiteralCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationCall__EnumerationLiteralAssignment_1"


    // $ANTLR start "rule__DateValue__DateValueAssignment_3_1"
    // InternalQLS.g:9416:1: rule__DateValue__DateValueAssignment_3_1 : ( ruleEDate ) ;
    public final void rule__DateValue__DateValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9420:1: ( ( ruleEDate ) )
            // InternalQLS.g:9421:2: ( ruleEDate )
            {
            // InternalQLS.g:9421:2: ( ruleEDate )
            // InternalQLS.g:9422:3: ruleEDate
            {
             before(grammarAccess.getDateValueAccess().getDateValueEDateParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDate();

            state._fsp--;

             after(grammarAccess.getDateValueAccess().getDateValueEDateParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValue__DateValueAssignment_3_1"


    // $ANTLR start "rule__DecimalValue__DecimalValueAssignment_1"
    // InternalQLS.g:9431:1: rule__DecimalValue__DecimalValueAssignment_1 : ( ruleEDouble ) ;
    public final void rule__DecimalValue__DecimalValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9435:1: ( ( ruleEDouble ) )
            // InternalQLS.g:9436:2: ( ruleEDouble )
            {
            // InternalQLS.g:9436:2: ( ruleEDouble )
            // InternalQLS.g:9437:3: ruleEDouble
            {
             before(grammarAccess.getDecimalValueAccess().getDecimalValueEDoubleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getDecimalValueAccess().getDecimalValueEDoubleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValue__DecimalValueAssignment_1"


    // $ANTLR start "rule__QuestionDefinition__IsMandatoryAssignment_0"
    // InternalQLS.g:9446:1: rule__QuestionDefinition__IsMandatoryAssignment_0 : ( ( 'mandatory' ) ) ;
    public final void rule__QuestionDefinition__IsMandatoryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9450:1: ( ( ( 'mandatory' ) ) )
            // InternalQLS.g:9451:2: ( ( 'mandatory' ) )
            {
            // InternalQLS.g:9451:2: ( ( 'mandatory' ) )
            // InternalQLS.g:9452:3: ( 'mandatory' )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getIsMandatoryMandatoryKeyword_0_0()); 
            // InternalQLS.g:9453:3: ( 'mandatory' )
            // InternalQLS.g:9454:4: 'mandatory'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getIsMandatoryMandatoryKeyword_0_0()); 
            match(input,87,FOLLOW_2); 
             after(grammarAccess.getQuestionDefinitionAccess().getIsMandatoryMandatoryKeyword_0_0()); 

            }

             after(grammarAccess.getQuestionDefinitionAccess().getIsMandatoryMandatoryKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__IsMandatoryAssignment_0"


    // $ANTLR start "rule__QuestionDefinition__NameAssignment_2"
    // InternalQLS.g:9465:1: rule__QuestionDefinition__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__QuestionDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9469:1: ( ( ruleEString ) )
            // InternalQLS.g:9470:2: ( ruleEString )
            {
            // InternalQLS.g:9470:2: ( ruleEString )
            // InternalQLS.g:9471:3: ruleEString
            {
             before(grammarAccess.getQuestionDefinitionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionDefinitionAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__NameAssignment_2"


    // $ANTLR start "rule__QuestionDefinition__IsDisplayedAssignment_3_1"
    // InternalQLS.g:9480:1: rule__QuestionDefinition__IsDisplayedAssignment_3_1 : ( ( 'isDisplayed' ) ) ;
    public final void rule__QuestionDefinition__IsDisplayedAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9484:1: ( ( ( 'isDisplayed' ) ) )
            // InternalQLS.g:9485:2: ( ( 'isDisplayed' ) )
            {
            // InternalQLS.g:9485:2: ( ( 'isDisplayed' ) )
            // InternalQLS.g:9486:3: ( 'isDisplayed' )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getIsDisplayedIsDisplayedKeyword_3_1_0()); 
            // InternalQLS.g:9487:3: ( 'isDisplayed' )
            // InternalQLS.g:9488:4: 'isDisplayed'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getIsDisplayedIsDisplayedKeyword_3_1_0()); 
            match(input,88,FOLLOW_2); 
             after(grammarAccess.getQuestionDefinitionAccess().getIsDisplayedIsDisplayedKeyword_3_1_0()); 

            }

             after(grammarAccess.getQuestionDefinitionAccess().getIsDisplayedIsDisplayedKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__IsDisplayedAssignment_3_1"


    // $ANTLR start "rule__QuestionDefinition__CurrentValueAssignment_3_2_1"
    // InternalQLS.g:9499:1: rule__QuestionDefinition__CurrentValueAssignment_3_2_1 : ( ruleValue ) ;
    public final void rule__QuestionDefinition__CurrentValueAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9503:1: ( ( ruleValue ) )
            // InternalQLS.g:9504:2: ( ruleValue )
            {
            // InternalQLS.g:9504:2: ( ruleValue )
            // InternalQLS.g:9505:3: ruleValue
            {
             before(grammarAccess.getQuestionDefinitionAccess().getCurrentValueValueParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getQuestionDefinitionAccess().getCurrentValueValueParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__CurrentValueAssignment_3_2_1"


    // $ANTLR start "rule__QuestionDefinition__LabelAssignment_5"
    // InternalQLS.g:9514:1: rule__QuestionDefinition__LabelAssignment_5 : ( ruleEString ) ;
    public final void rule__QuestionDefinition__LabelAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9518:1: ( ( ruleEString ) )
            // InternalQLS.g:9519:2: ( ruleEString )
            {
            // InternalQLS.g:9519:2: ( ruleEString )
            // InternalQLS.g:9520:3: ruleEString
            {
             before(grammarAccess.getQuestionDefinitionAccess().getLabelEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionDefinitionAccess().getLabelEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__LabelAssignment_5"


    // $ANTLR start "rule__QuestionDefinition__DataTypeAssignment_6"
    // InternalQLS.g:9529:1: rule__QuestionDefinition__DataTypeAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__QuestionDefinition__DataTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9533:1: ( ( ( ruleEString ) ) )
            // InternalQLS.g:9534:2: ( ( ruleEString ) )
            {
            // InternalQLS.g:9534:2: ( ( ruleEString ) )
            // InternalQLS.g:9535:3: ( ruleEString )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getDataTypeValueTypeCrossReference_6_0()); 
            // InternalQLS.g:9536:3: ( ruleEString )
            // InternalQLS.g:9537:4: ruleEString
            {
             before(grammarAccess.getQuestionDefinitionAccess().getDataTypeValueTypeEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionDefinitionAccess().getDataTypeValueTypeEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getQuestionDefinitionAccess().getDataTypeValueTypeCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__DataTypeAssignment_6"


    // $ANTLR start "rule__QuestionDefinition__ComputedExpressionAssignment_7_1"
    // InternalQLS.g:9548:1: rule__QuestionDefinition__ComputedExpressionAssignment_7_1 : ( ruleExpression ) ;
    public final void rule__QuestionDefinition__ComputedExpressionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9552:1: ( ( ruleExpression ) )
            // InternalQLS.g:9553:2: ( ruleExpression )
            {
            // InternalQLS.g:9553:2: ( ruleExpression )
            // InternalQLS.g:9554:3: ruleExpression
            {
             before(grammarAccess.getQuestionDefinitionAccess().getComputedExpressionExpressionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getQuestionDefinitionAccess().getComputedExpressionExpressionParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__ComputedExpressionAssignment_7_1"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\2\uffff\1\4\3\uffff\1\4";
    static final String dfa_3s = "\1\4\1\uffff\1\14\1\6\2\uffff\1\14";
    static final String dfa_4s = "\1\117\1\uffff\1\123\1\6\2\uffff\1\123";
    static final String dfa_5s = "\1\uffff\1\1\2\uffff\1\3\1\2\1\uffff";
    static final String dfa_6s = "\7\uffff}>";
    static final String[] dfa_7s = {
            "\2\1\1\2\10\uffff\2\1\76\uffff\1\1",
            "",
            "\3\4\23\uffff\1\4\1\uffff\7\4\1\uffff\1\4\14\uffff\1\5\1\4\1\uffff\3\4\20\uffff\1\3\3\uffff\1\4",
            "\1\6",
            "",
            "",
            "\3\4\23\uffff\1\4\1\uffff\7\4\1\uffff\1\4\14\uffff\1\5\1\4\1\uffff\3\4\20\uffff\1\3\3\uffff\1\4"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1639:1: rule__Call__Alternatives : ( ( ruleConstantCall ) | ( ruleQuestionCall ) | ( ruleEnumerationCall ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0006400000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0118000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000400000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0040400000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000400000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0A00000C00018070L,0x0000000000008000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0A00000000018070L,0x0000000000008000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000078000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000078000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000001400000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000001400000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0800100000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000400000000000L,0x000000000081139AL});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000002L,0x000000000081139AL});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0800500000000040L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0800100000000042L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000018030L,0x0000000000008000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000064L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000404L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x000000000081139AL});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000018070L,0x0000000000008000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000400000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000810000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0200000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0400000000000000L,0x0000000001040000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000018030L,0x000000000000A000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});

}