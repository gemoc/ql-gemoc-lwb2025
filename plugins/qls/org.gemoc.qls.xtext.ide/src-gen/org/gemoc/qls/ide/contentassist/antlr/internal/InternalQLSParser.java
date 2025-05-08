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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'EDate'", "'='", "'and'", "'or'", "'true'", "'false'", "'E'", "'e'", "'CHECKBOX'", "'TWO_RADIO'", "'DROPDOWN'", "'PLUS'", "'MINUS'", "'MULT'", "'DIV'", "'EQUAL'", "'NOTEQUAL'", "'GREATER'", "'LOWER'", "'GREATEROREQUAL'", "'LOWEROREQUAL'", "'AND'", "'OR'", "'-'", "'not'", "'+'", "'*'", "'/'", "'>'", "'<'", "'>='", "'<='", "'QLSModel'", "'{'", "'questionStyles'", "'}'", "'import'", "'styledQuestion'", "'labelStyle'", "'typeStyle'", "'BooleanStyle'", "'NumericStyle'", "'textField'", "'step'", "'spinner'", "'TextStyle'", "'('", "')'", "'if'", "'then'", "'endif'", "'else'", "'definitions'", "'ValueType'", "'unit'", "'booleanType'", "'integerType'", "'min'", "'max'", "'decimalType'", "'dateType'", "'enumerationType'", "'literals'", "','", "'StringType'", "'DateValue'", "'dateValue'", "'.'", "'question'", "':'", "'currentValue'", "';'", "'italic'", "'bold'", "'multiline'", "'mandatory'", "'isDisplayed'"
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


    // $ANTLR start "entryRuleDefinitionGroup"
    // InternalQLS.g:653:1: entryRuleDefinitionGroup : ruleDefinitionGroup EOF ;
    public final void entryRuleDefinitionGroup() throws RecognitionException {
        try {
            // InternalQLS.g:654:1: ( ruleDefinitionGroup EOF )
            // InternalQLS.g:655:1: ruleDefinitionGroup EOF
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
    // InternalQLS.g:662:1: ruleDefinitionGroup : ( ( rule__DefinitionGroup__Group__0 ) ) ;
    public final void ruleDefinitionGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:666:2: ( ( ( rule__DefinitionGroup__Group__0 ) ) )
            // InternalQLS.g:667:2: ( ( rule__DefinitionGroup__Group__0 ) )
            {
            // InternalQLS.g:667:2: ( ( rule__DefinitionGroup__Group__0 ) )
            // InternalQLS.g:668:3: ( rule__DefinitionGroup__Group__0 )
            {
             before(grammarAccess.getDefinitionGroupAccess().getGroup()); 
            // InternalQLS.g:669:3: ( rule__DefinitionGroup__Group__0 )
            // InternalQLS.g:669:4: rule__DefinitionGroup__Group__0
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
    // InternalQLS.g:678:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalQLS.g:679:1: ( ruleEBoolean EOF )
            // InternalQLS.g:680:1: ruleEBoolean EOF
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
    // InternalQLS.g:687:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:691:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalQLS.g:692:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalQLS.g:692:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalQLS.g:693:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalQLS.g:694:3: ( rule__EBoolean__Alternatives )
            // InternalQLS.g:694:4: rule__EBoolean__Alternatives
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
    // InternalQLS.g:703:1: entryRuleEDate : ruleEDate EOF ;
    public final void entryRuleEDate() throws RecognitionException {
        try {
            // InternalQLS.g:704:1: ( ruleEDate EOF )
            // InternalQLS.g:705:1: ruleEDate EOF
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
    // InternalQLS.g:712:1: ruleEDate : ( 'EDate' ) ;
    public final void ruleEDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:716:2: ( ( 'EDate' ) )
            // InternalQLS.g:717:2: ( 'EDate' )
            {
            // InternalQLS.g:717:2: ( 'EDate' )
            // InternalQLS.g:718:3: 'EDate'
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
    // InternalQLS.g:728:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalQLS.g:729:1: ( ruleEString EOF )
            // InternalQLS.g:730:1: ruleEString EOF
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
    // InternalQLS.g:737:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:741:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalQLS.g:742:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalQLS.g:742:2: ( ( rule__EString__Alternatives ) )
            // InternalQLS.g:743:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalQLS.g:744:3: ( rule__EString__Alternatives )
            // InternalQLS.g:744:4: rule__EString__Alternatives
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
    // InternalQLS.g:753:1: entryRuleQuestionGroup : ruleQuestionGroup EOF ;
    public final void entryRuleQuestionGroup() throws RecognitionException {
        try {
            // InternalQLS.g:754:1: ( ruleQuestionGroup EOF )
            // InternalQLS.g:755:1: ruleQuestionGroup EOF
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
    // InternalQLS.g:762:1: ruleQuestionGroup : ( ( rule__QuestionGroup__Group__0 ) ) ;
    public final void ruleQuestionGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:766:2: ( ( ( rule__QuestionGroup__Group__0 ) ) )
            // InternalQLS.g:767:2: ( ( rule__QuestionGroup__Group__0 ) )
            {
            // InternalQLS.g:767:2: ( ( rule__QuestionGroup__Group__0 ) )
            // InternalQLS.g:768:3: ( rule__QuestionGroup__Group__0 )
            {
             before(grammarAccess.getQuestionGroupAccess().getGroup()); 
            // InternalQLS.g:769:3: ( rule__QuestionGroup__Group__0 )
            // InternalQLS.g:769:4: rule__QuestionGroup__Group__0
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
    // InternalQLS.g:778:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // InternalQLS.g:779:1: ( ruleQuestion EOF )
            // InternalQLS.g:780:1: ruleQuestion EOF
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
    // InternalQLS.g:787:1: ruleQuestion : ( ( rule__Question__QuestionDefinitionAssignment ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:791:2: ( ( ( rule__Question__QuestionDefinitionAssignment ) ) )
            // InternalQLS.g:792:2: ( ( rule__Question__QuestionDefinitionAssignment ) )
            {
            // InternalQLS.g:792:2: ( ( rule__Question__QuestionDefinitionAssignment ) )
            // InternalQLS.g:793:3: ( rule__Question__QuestionDefinitionAssignment )
            {
             before(grammarAccess.getQuestionAccess().getQuestionDefinitionAssignment()); 
            // InternalQLS.g:794:3: ( rule__Question__QuestionDefinitionAssignment )
            // InternalQLS.g:794:4: rule__Question__QuestionDefinitionAssignment
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
    // InternalQLS.g:803:1: entryRuleValueType_Impl : ruleValueType_Impl EOF ;
    public final void entryRuleValueType_Impl() throws RecognitionException {
        try {
            // InternalQLS.g:804:1: ( ruleValueType_Impl EOF )
            // InternalQLS.g:805:1: ruleValueType_Impl EOF
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
    // InternalQLS.g:812:1: ruleValueType_Impl : ( ( rule__ValueType_Impl__Group__0 ) ) ;
    public final void ruleValueType_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:816:2: ( ( ( rule__ValueType_Impl__Group__0 ) ) )
            // InternalQLS.g:817:2: ( ( rule__ValueType_Impl__Group__0 ) )
            {
            // InternalQLS.g:817:2: ( ( rule__ValueType_Impl__Group__0 ) )
            // InternalQLS.g:818:3: ( rule__ValueType_Impl__Group__0 )
            {
             before(grammarAccess.getValueType_ImplAccess().getGroup()); 
            // InternalQLS.g:819:3: ( rule__ValueType_Impl__Group__0 )
            // InternalQLS.g:819:4: rule__ValueType_Impl__Group__0
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
    // InternalQLS.g:828:1: entryRuleConstantCall : ruleConstantCall EOF ;
    public final void entryRuleConstantCall() throws RecognitionException {
        try {
            // InternalQLS.g:829:1: ( ruleConstantCall EOF )
            // InternalQLS.g:830:1: ruleConstantCall EOF
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
    // InternalQLS.g:837:1: ruleConstantCall : ( ( rule__ConstantCall__Group__0 ) ) ;
    public final void ruleConstantCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:841:2: ( ( ( rule__ConstantCall__Group__0 ) ) )
            // InternalQLS.g:842:2: ( ( rule__ConstantCall__Group__0 ) )
            {
            // InternalQLS.g:842:2: ( ( rule__ConstantCall__Group__0 ) )
            // InternalQLS.g:843:3: ( rule__ConstantCall__Group__0 )
            {
             before(grammarAccess.getConstantCallAccess().getGroup()); 
            // InternalQLS.g:844:3: ( rule__ConstantCall__Group__0 )
            // InternalQLS.g:844:4: rule__ConstantCall__Group__0
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
    // InternalQLS.g:853:1: entryRuleQuestionCall : ruleQuestionCall EOF ;
    public final void entryRuleQuestionCall() throws RecognitionException {
        try {
            // InternalQLS.g:854:1: ( ruleQuestionCall EOF )
            // InternalQLS.g:855:1: ruleQuestionCall EOF
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
    // InternalQLS.g:862:1: ruleQuestionCall : ( ( rule__QuestionCall__Group__0 ) ) ;
    public final void ruleQuestionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:866:2: ( ( ( rule__QuestionCall__Group__0 ) ) )
            // InternalQLS.g:867:2: ( ( rule__QuestionCall__Group__0 ) )
            {
            // InternalQLS.g:867:2: ( ( rule__QuestionCall__Group__0 ) )
            // InternalQLS.g:868:3: ( rule__QuestionCall__Group__0 )
            {
             before(grammarAccess.getQuestionCallAccess().getGroup()); 
            // InternalQLS.g:869:3: ( rule__QuestionCall__Group__0 )
            // InternalQLS.g:869:4: rule__QuestionCall__Group__0
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
    // InternalQLS.g:878:1: entryRuleBooleanValueType : ruleBooleanValueType EOF ;
    public final void entryRuleBooleanValueType() throws RecognitionException {
        try {
            // InternalQLS.g:879:1: ( ruleBooleanValueType EOF )
            // InternalQLS.g:880:1: ruleBooleanValueType EOF
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
    // InternalQLS.g:887:1: ruleBooleanValueType : ( ( rule__BooleanValueType__Group__0 ) ) ;
    public final void ruleBooleanValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:891:2: ( ( ( rule__BooleanValueType__Group__0 ) ) )
            // InternalQLS.g:892:2: ( ( rule__BooleanValueType__Group__0 ) )
            {
            // InternalQLS.g:892:2: ( ( rule__BooleanValueType__Group__0 ) )
            // InternalQLS.g:893:3: ( rule__BooleanValueType__Group__0 )
            {
             before(grammarAccess.getBooleanValueTypeAccess().getGroup()); 
            // InternalQLS.g:894:3: ( rule__BooleanValueType__Group__0 )
            // InternalQLS.g:894:4: rule__BooleanValueType__Group__0
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
    // InternalQLS.g:903:1: entryRuleIntegerValueType : ruleIntegerValueType EOF ;
    public final void entryRuleIntegerValueType() throws RecognitionException {
        try {
            // InternalQLS.g:904:1: ( ruleIntegerValueType EOF )
            // InternalQLS.g:905:1: ruleIntegerValueType EOF
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
    // InternalQLS.g:912:1: ruleIntegerValueType : ( ( rule__IntegerValueType__Group__0 ) ) ;
    public final void ruleIntegerValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:916:2: ( ( ( rule__IntegerValueType__Group__0 ) ) )
            // InternalQLS.g:917:2: ( ( rule__IntegerValueType__Group__0 ) )
            {
            // InternalQLS.g:917:2: ( ( rule__IntegerValueType__Group__0 ) )
            // InternalQLS.g:918:3: ( rule__IntegerValueType__Group__0 )
            {
             before(grammarAccess.getIntegerValueTypeAccess().getGroup()); 
            // InternalQLS.g:919:3: ( rule__IntegerValueType__Group__0 )
            // InternalQLS.g:919:4: rule__IntegerValueType__Group__0
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
    // InternalQLS.g:928:1: entryRuleDecimalValueType : ruleDecimalValueType EOF ;
    public final void entryRuleDecimalValueType() throws RecognitionException {
        try {
            // InternalQLS.g:929:1: ( ruleDecimalValueType EOF )
            // InternalQLS.g:930:1: ruleDecimalValueType EOF
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
    // InternalQLS.g:937:1: ruleDecimalValueType : ( ( rule__DecimalValueType__Group__0 ) ) ;
    public final void ruleDecimalValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:941:2: ( ( ( rule__DecimalValueType__Group__0 ) ) )
            // InternalQLS.g:942:2: ( ( rule__DecimalValueType__Group__0 ) )
            {
            // InternalQLS.g:942:2: ( ( rule__DecimalValueType__Group__0 ) )
            // InternalQLS.g:943:3: ( rule__DecimalValueType__Group__0 )
            {
             before(grammarAccess.getDecimalValueTypeAccess().getGroup()); 
            // InternalQLS.g:944:3: ( rule__DecimalValueType__Group__0 )
            // InternalQLS.g:944:4: rule__DecimalValueType__Group__0
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
    // InternalQLS.g:953:1: entryRuleDateValueType : ruleDateValueType EOF ;
    public final void entryRuleDateValueType() throws RecognitionException {
        try {
            // InternalQLS.g:954:1: ( ruleDateValueType EOF )
            // InternalQLS.g:955:1: ruleDateValueType EOF
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
    // InternalQLS.g:962:1: ruleDateValueType : ( ( rule__DateValueType__Group__0 ) ) ;
    public final void ruleDateValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:966:2: ( ( ( rule__DateValueType__Group__0 ) ) )
            // InternalQLS.g:967:2: ( ( rule__DateValueType__Group__0 ) )
            {
            // InternalQLS.g:967:2: ( ( rule__DateValueType__Group__0 ) )
            // InternalQLS.g:968:3: ( rule__DateValueType__Group__0 )
            {
             before(grammarAccess.getDateValueTypeAccess().getGroup()); 
            // InternalQLS.g:969:3: ( rule__DateValueType__Group__0 )
            // InternalQLS.g:969:4: rule__DateValueType__Group__0
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
    // InternalQLS.g:978:1: entryRuleEnumerationValueType : ruleEnumerationValueType EOF ;
    public final void entryRuleEnumerationValueType() throws RecognitionException {
        try {
            // InternalQLS.g:979:1: ( ruleEnumerationValueType EOF )
            // InternalQLS.g:980:1: ruleEnumerationValueType EOF
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
    // InternalQLS.g:987:1: ruleEnumerationValueType : ( ( rule__EnumerationValueType__Group__0 ) ) ;
    public final void ruleEnumerationValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:991:2: ( ( ( rule__EnumerationValueType__Group__0 ) ) )
            // InternalQLS.g:992:2: ( ( rule__EnumerationValueType__Group__0 ) )
            {
            // InternalQLS.g:992:2: ( ( rule__EnumerationValueType__Group__0 ) )
            // InternalQLS.g:993:3: ( rule__EnumerationValueType__Group__0 )
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getGroup()); 
            // InternalQLS.g:994:3: ( rule__EnumerationValueType__Group__0 )
            // InternalQLS.g:994:4: rule__EnumerationValueType__Group__0
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
    // InternalQLS.g:1003:1: entryRuleStringValueType : ruleStringValueType EOF ;
    public final void entryRuleStringValueType() throws RecognitionException {
        try {
            // InternalQLS.g:1004:1: ( ruleStringValueType EOF )
            // InternalQLS.g:1005:1: ruleStringValueType EOF
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
    // InternalQLS.g:1012:1: ruleStringValueType : ( ( rule__StringValueType__Group__0 ) ) ;
    public final void ruleStringValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1016:2: ( ( ( rule__StringValueType__Group__0 ) ) )
            // InternalQLS.g:1017:2: ( ( rule__StringValueType__Group__0 ) )
            {
            // InternalQLS.g:1017:2: ( ( rule__StringValueType__Group__0 ) )
            // InternalQLS.g:1018:3: ( rule__StringValueType__Group__0 )
            {
             before(grammarAccess.getStringValueTypeAccess().getGroup()); 
            // InternalQLS.g:1019:3: ( rule__StringValueType__Group__0 )
            // InternalQLS.g:1019:4: rule__StringValueType__Group__0
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
    // InternalQLS.g:1028:1: entryRuleEnumerationLiteral : ruleEnumerationLiteral EOF ;
    public final void entryRuleEnumerationLiteral() throws RecognitionException {
        try {
            // InternalQLS.g:1029:1: ( ruleEnumerationLiteral EOF )
            // InternalQLS.g:1030:1: ruleEnumerationLiteral EOF
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
    // InternalQLS.g:1037:1: ruleEnumerationLiteral : ( ( rule__EnumerationLiteral__Group__0 ) ) ;
    public final void ruleEnumerationLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1041:2: ( ( ( rule__EnumerationLiteral__Group__0 ) ) )
            // InternalQLS.g:1042:2: ( ( rule__EnumerationLiteral__Group__0 ) )
            {
            // InternalQLS.g:1042:2: ( ( rule__EnumerationLiteral__Group__0 ) )
            // InternalQLS.g:1043:3: ( rule__EnumerationLiteral__Group__0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getGroup()); 
            // InternalQLS.g:1044:3: ( rule__EnumerationLiteral__Group__0 )
            // InternalQLS.g:1044:4: rule__EnumerationLiteral__Group__0
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
    // InternalQLS.g:1053:1: entryRuleIntegerValue : ruleIntegerValue EOF ;
    public final void entryRuleIntegerValue() throws RecognitionException {
        try {
            // InternalQLS.g:1054:1: ( ruleIntegerValue EOF )
            // InternalQLS.g:1055:1: ruleIntegerValue EOF
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
    // InternalQLS.g:1062:1: ruleIntegerValue : ( ( rule__IntegerValue__Group__0 ) ) ;
    public final void ruleIntegerValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1066:2: ( ( ( rule__IntegerValue__Group__0 ) ) )
            // InternalQLS.g:1067:2: ( ( rule__IntegerValue__Group__0 ) )
            {
            // InternalQLS.g:1067:2: ( ( rule__IntegerValue__Group__0 ) )
            // InternalQLS.g:1068:3: ( rule__IntegerValue__Group__0 )
            {
             before(grammarAccess.getIntegerValueAccess().getGroup()); 
            // InternalQLS.g:1069:3: ( rule__IntegerValue__Group__0 )
            // InternalQLS.g:1069:4: rule__IntegerValue__Group__0
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
    // InternalQLS.g:1078:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalQLS.g:1079:1: ( ruleStringValue EOF )
            // InternalQLS.g:1080:1: ruleStringValue EOF
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
    // InternalQLS.g:1087:1: ruleStringValue : ( ( rule__StringValue__Group__0 ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1091:2: ( ( ( rule__StringValue__Group__0 ) ) )
            // InternalQLS.g:1092:2: ( ( rule__StringValue__Group__0 ) )
            {
            // InternalQLS.g:1092:2: ( ( rule__StringValue__Group__0 ) )
            // InternalQLS.g:1093:3: ( rule__StringValue__Group__0 )
            {
             before(grammarAccess.getStringValueAccess().getGroup()); 
            // InternalQLS.g:1094:3: ( rule__StringValue__Group__0 )
            // InternalQLS.g:1094:4: rule__StringValue__Group__0
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
    // InternalQLS.g:1103:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalQLS.g:1104:1: ( ruleBooleanValue EOF )
            // InternalQLS.g:1105:1: ruleBooleanValue EOF
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
    // InternalQLS.g:1112:1: ruleBooleanValue : ( ( rule__BooleanValue__Group__0 ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1116:2: ( ( ( rule__BooleanValue__Group__0 ) ) )
            // InternalQLS.g:1117:2: ( ( rule__BooleanValue__Group__0 ) )
            {
            // InternalQLS.g:1117:2: ( ( rule__BooleanValue__Group__0 ) )
            // InternalQLS.g:1118:3: ( rule__BooleanValue__Group__0 )
            {
             before(grammarAccess.getBooleanValueAccess().getGroup()); 
            // InternalQLS.g:1119:3: ( rule__BooleanValue__Group__0 )
            // InternalQLS.g:1119:4: rule__BooleanValue__Group__0
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
    // InternalQLS.g:1128:1: entryRuleEnumerationCall : ruleEnumerationCall EOF ;
    public final void entryRuleEnumerationCall() throws RecognitionException {
        try {
            // InternalQLS.g:1129:1: ( ruleEnumerationCall EOF )
            // InternalQLS.g:1130:1: ruleEnumerationCall EOF
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
    // InternalQLS.g:1137:1: ruleEnumerationCall : ( ( rule__EnumerationCall__Group__0 ) ) ;
    public final void ruleEnumerationCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1141:2: ( ( ( rule__EnumerationCall__Group__0 ) ) )
            // InternalQLS.g:1142:2: ( ( rule__EnumerationCall__Group__0 ) )
            {
            // InternalQLS.g:1142:2: ( ( rule__EnumerationCall__Group__0 ) )
            // InternalQLS.g:1143:3: ( rule__EnumerationCall__Group__0 )
            {
             before(grammarAccess.getEnumerationCallAccess().getGroup()); 
            // InternalQLS.g:1144:3: ( rule__EnumerationCall__Group__0 )
            // InternalQLS.g:1144:4: rule__EnumerationCall__Group__0
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
    // InternalQLS.g:1153:1: entryRuleDateValue : ruleDateValue EOF ;
    public final void entryRuleDateValue() throws RecognitionException {
        try {
            // InternalQLS.g:1154:1: ( ruleDateValue EOF )
            // InternalQLS.g:1155:1: ruleDateValue EOF
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
    // InternalQLS.g:1162:1: ruleDateValue : ( ( rule__DateValue__Group__0 ) ) ;
    public final void ruleDateValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1166:2: ( ( ( rule__DateValue__Group__0 ) ) )
            // InternalQLS.g:1167:2: ( ( rule__DateValue__Group__0 ) )
            {
            // InternalQLS.g:1167:2: ( ( rule__DateValue__Group__0 ) )
            // InternalQLS.g:1168:3: ( rule__DateValue__Group__0 )
            {
             before(grammarAccess.getDateValueAccess().getGroup()); 
            // InternalQLS.g:1169:3: ( rule__DateValue__Group__0 )
            // InternalQLS.g:1169:4: rule__DateValue__Group__0
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
    // InternalQLS.g:1178:1: entryRuleDecimalValue : ruleDecimalValue EOF ;
    public final void entryRuleDecimalValue() throws RecognitionException {
        try {
            // InternalQLS.g:1179:1: ( ruleDecimalValue EOF )
            // InternalQLS.g:1180:1: ruleDecimalValue EOF
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
    // InternalQLS.g:1187:1: ruleDecimalValue : ( ( rule__DecimalValue__Group__0 ) ) ;
    public final void ruleDecimalValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1191:2: ( ( ( rule__DecimalValue__Group__0 ) ) )
            // InternalQLS.g:1192:2: ( ( rule__DecimalValue__Group__0 ) )
            {
            // InternalQLS.g:1192:2: ( ( rule__DecimalValue__Group__0 ) )
            // InternalQLS.g:1193:3: ( rule__DecimalValue__Group__0 )
            {
             before(grammarAccess.getDecimalValueAccess().getGroup()); 
            // InternalQLS.g:1194:3: ( rule__DecimalValue__Group__0 )
            // InternalQLS.g:1194:4: rule__DecimalValue__Group__0
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
    // InternalQLS.g:1203:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalQLS.g:1204:1: ( ruleEInt EOF )
            // InternalQLS.g:1205:1: ruleEInt EOF
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
    // InternalQLS.g:1212:1: ruleEInt : ( RULE_INT ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1216:2: ( ( RULE_INT ) )
            // InternalQLS.g:1217:2: ( RULE_INT )
            {
            // InternalQLS.g:1217:2: ( RULE_INT )
            // InternalQLS.g:1218:3: RULE_INT
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
    // InternalQLS.g:1228:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalQLS.g:1229:1: ( ruleEDouble EOF )
            // InternalQLS.g:1230:1: ruleEDouble EOF
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
    // InternalQLS.g:1237:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1241:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalQLS.g:1242:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalQLS.g:1242:2: ( ( rule__EDouble__Group__0 ) )
            // InternalQLS.g:1243:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalQLS.g:1244:3: ( rule__EDouble__Group__0 )
            // InternalQLS.g:1244:4: rule__EDouble__Group__0
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
    // InternalQLS.g:1253:1: entryRuleQuestionDefinition : ruleQuestionDefinition EOF ;
    public final void entryRuleQuestionDefinition() throws RecognitionException {
        try {
            // InternalQLS.g:1254:1: ( ruleQuestionDefinition EOF )
            // InternalQLS.g:1255:1: ruleQuestionDefinition EOF
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
    // InternalQLS.g:1262:1: ruleQuestionDefinition : ( ( rule__QuestionDefinition__Group__0 ) ) ;
    public final void ruleQuestionDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1266:2: ( ( ( rule__QuestionDefinition__Group__0 ) ) )
            // InternalQLS.g:1267:2: ( ( rule__QuestionDefinition__Group__0 ) )
            {
            // InternalQLS.g:1267:2: ( ( rule__QuestionDefinition__Group__0 ) )
            // InternalQLS.g:1268:3: ( rule__QuestionDefinition__Group__0 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getGroup()); 
            // InternalQLS.g:1269:3: ( rule__QuestionDefinition__Group__0 )
            // InternalQLS.g:1269:4: rule__QuestionDefinition__Group__0
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
    // InternalQLS.g:1278:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalQLS.g:1279:1: ( ruleQualifiedName EOF )
            // InternalQLS.g:1280:1: ruleQualifiedName EOF
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
    // InternalQLS.g:1287:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1291:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalQLS.g:1292:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalQLS.g:1292:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalQLS.g:1293:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalQLS.g:1294:3: ( rule__QualifiedName__Group__0 )
            // InternalQLS.g:1294:4: rule__QualifiedName__Group__0
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
    // InternalQLS.g:1303:1: ruleBooleanStyleKind : ( ( rule__BooleanStyleKind__Alternatives ) ) ;
    public final void ruleBooleanStyleKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1307:1: ( ( ( rule__BooleanStyleKind__Alternatives ) ) )
            // InternalQLS.g:1308:2: ( ( rule__BooleanStyleKind__Alternatives ) )
            {
            // InternalQLS.g:1308:2: ( ( rule__BooleanStyleKind__Alternatives ) )
            // InternalQLS.g:1309:3: ( rule__BooleanStyleKind__Alternatives )
            {
             before(grammarAccess.getBooleanStyleKindAccess().getAlternatives()); 
            // InternalQLS.g:1310:3: ( rule__BooleanStyleKind__Alternatives )
            // InternalQLS.g:1310:4: rule__BooleanStyleKind__Alternatives
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
    // InternalQLS.g:1319:1: ruleBinaryOperatorKind : ( ( rule__BinaryOperatorKind__Alternatives ) ) ;
    public final void ruleBinaryOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1323:1: ( ( ( rule__BinaryOperatorKind__Alternatives ) ) )
            // InternalQLS.g:1324:2: ( ( rule__BinaryOperatorKind__Alternatives ) )
            {
            // InternalQLS.g:1324:2: ( ( rule__BinaryOperatorKind__Alternatives ) )
            // InternalQLS.g:1325:3: ( rule__BinaryOperatorKind__Alternatives )
            {
             before(grammarAccess.getBinaryOperatorKindAccess().getAlternatives()); 
            // InternalQLS.g:1326:3: ( rule__BinaryOperatorKind__Alternatives )
            // InternalQLS.g:1326:4: rule__BinaryOperatorKind__Alternatives
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
    // InternalQLS.g:1335:1: ruleUnaryOperatorKind : ( ( rule__UnaryOperatorKind__Alternatives ) ) ;
    public final void ruleUnaryOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1339:1: ( ( ( rule__UnaryOperatorKind__Alternatives ) ) )
            // InternalQLS.g:1340:2: ( ( rule__UnaryOperatorKind__Alternatives ) )
            {
            // InternalQLS.g:1340:2: ( ( rule__UnaryOperatorKind__Alternatives ) )
            // InternalQLS.g:1341:3: ( rule__UnaryOperatorKind__Alternatives )
            {
             before(grammarAccess.getUnaryOperatorKindAccess().getAlternatives()); 
            // InternalQLS.g:1342:3: ( rule__UnaryOperatorKind__Alternatives )
            // InternalQLS.g:1342:4: rule__UnaryOperatorKind__Alternatives
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
    // InternalQLS.g:1351:1: ruleAdditionOperatorKind : ( ( rule__AdditionOperatorKind__Alternatives ) ) ;
    public final void ruleAdditionOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1355:1: ( ( ( rule__AdditionOperatorKind__Alternatives ) ) )
            // InternalQLS.g:1356:2: ( ( rule__AdditionOperatorKind__Alternatives ) )
            {
            // InternalQLS.g:1356:2: ( ( rule__AdditionOperatorKind__Alternatives ) )
            // InternalQLS.g:1357:3: ( rule__AdditionOperatorKind__Alternatives )
            {
             before(grammarAccess.getAdditionOperatorKindAccess().getAlternatives()); 
            // InternalQLS.g:1358:3: ( rule__AdditionOperatorKind__Alternatives )
            // InternalQLS.g:1358:4: rule__AdditionOperatorKind__Alternatives
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
    // InternalQLS.g:1367:1: ruleMultiplicationOperatorKind : ( ( rule__MultiplicationOperatorKind__Alternatives ) ) ;
    public final void ruleMultiplicationOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1371:1: ( ( ( rule__MultiplicationOperatorKind__Alternatives ) ) )
            // InternalQLS.g:1372:2: ( ( rule__MultiplicationOperatorKind__Alternatives ) )
            {
            // InternalQLS.g:1372:2: ( ( rule__MultiplicationOperatorKind__Alternatives ) )
            // InternalQLS.g:1373:3: ( rule__MultiplicationOperatorKind__Alternatives )
            {
             before(grammarAccess.getMultiplicationOperatorKindAccess().getAlternatives()); 
            // InternalQLS.g:1374:3: ( rule__MultiplicationOperatorKind__Alternatives )
            // InternalQLS.g:1374:4: rule__MultiplicationOperatorKind__Alternatives
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
    // InternalQLS.g:1383:1: ruleEqualOperatorKind : ( ( '=' ) ) ;
    public final void ruleEqualOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1387:1: ( ( ( '=' ) ) )
            // InternalQLS.g:1388:2: ( ( '=' ) )
            {
            // InternalQLS.g:1388:2: ( ( '=' ) )
            // InternalQLS.g:1389:3: ( '=' )
            {
             before(grammarAccess.getEqualOperatorKindAccess().getEQUALEnumLiteralDeclaration()); 
            // InternalQLS.g:1390:3: ( '=' )
            // InternalQLS.g:1390:4: '='
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
    // InternalQLS.g:1399:1: ruleComparisionOperatorKind : ( ( rule__ComparisionOperatorKind__Alternatives ) ) ;
    public final void ruleComparisionOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1403:1: ( ( ( rule__ComparisionOperatorKind__Alternatives ) ) )
            // InternalQLS.g:1404:2: ( ( rule__ComparisionOperatorKind__Alternatives ) )
            {
            // InternalQLS.g:1404:2: ( ( rule__ComparisionOperatorKind__Alternatives ) )
            // InternalQLS.g:1405:3: ( rule__ComparisionOperatorKind__Alternatives )
            {
             before(grammarAccess.getComparisionOperatorKindAccess().getAlternatives()); 
            // InternalQLS.g:1406:3: ( rule__ComparisionOperatorKind__Alternatives )
            // InternalQLS.g:1406:4: rule__ComparisionOperatorKind__Alternatives
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
    // InternalQLS.g:1415:1: ruleAndOperatorKind : ( ( 'and' ) ) ;
    public final void ruleAndOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1419:1: ( ( ( 'and' ) ) )
            // InternalQLS.g:1420:2: ( ( 'and' ) )
            {
            // InternalQLS.g:1420:2: ( ( 'and' ) )
            // InternalQLS.g:1421:3: ( 'and' )
            {
             before(grammarAccess.getAndOperatorKindAccess().getANDEnumLiteralDeclaration()); 
            // InternalQLS.g:1422:3: ( 'and' )
            // InternalQLS.g:1422:4: 'and'
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
    // InternalQLS.g:1431:1: ruleOrOperatorKind : ( ( 'or' ) ) ;
    public final void ruleOrOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1435:1: ( ( ( 'or' ) ) )
            // InternalQLS.g:1436:2: ( ( 'or' ) )
            {
            // InternalQLS.g:1436:2: ( ( 'or' ) )
            // InternalQLS.g:1437:3: ( 'or' )
            {
             before(grammarAccess.getOrOperatorKindAccess().getOREnumLiteralDeclaration()); 
            // InternalQLS.g:1438:3: ( 'or' )
            // InternalQLS.g:1438:4: 'or'
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
    // InternalQLS.g:1446:1: rule__TypeStyle__Alternatives : ( ( ruleBooleanTypeStyle ) | ( ruleNumericTypeStyle ) | ( ruleTextTypeStyle ) );
    public final void rule__TypeStyle__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1450:1: ( ( ruleBooleanTypeStyle ) | ( ruleNumericTypeStyle ) | ( ruleTextTypeStyle ) )
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
                    // InternalQLS.g:1451:2: ( ruleBooleanTypeStyle )
                    {
                    // InternalQLS.g:1451:2: ( ruleBooleanTypeStyle )
                    // InternalQLS.g:1452:3: ruleBooleanTypeStyle
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
                    // InternalQLS.g:1457:2: ( ruleNumericTypeStyle )
                    {
                    // InternalQLS.g:1457:2: ( ruleNumericTypeStyle )
                    // InternalQLS.g:1458:3: ruleNumericTypeStyle
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
                    // InternalQLS.g:1463:2: ( ruleTextTypeStyle )
                    {
                    // InternalQLS.g:1463:2: ( ruleTextTypeStyle )
                    // InternalQLS.g:1464:3: ruleTextTypeStyle
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
    // InternalQLS.g:1473:1: rule__NumericTypeStyle__Alternatives : ( ( ruleNumericTypeTextFieldStyle ) | ( ruleNumericTypeSpinnerStyle ) );
    public final void rule__NumericTypeStyle__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1477:1: ( ( ruleNumericTypeTextFieldStyle ) | ( ruleNumericTypeSpinnerStyle ) )
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
                    // InternalQLS.g:1478:2: ( ruleNumericTypeTextFieldStyle )
                    {
                    // InternalQLS.g:1478:2: ( ruleNumericTypeTextFieldStyle )
                    // InternalQLS.g:1479:3: ruleNumericTypeTextFieldStyle
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
                    // InternalQLS.g:1484:2: ( ruleNumericTypeSpinnerStyle )
                    {
                    // InternalQLS.g:1484:2: ( ruleNumericTypeSpinnerStyle )
                    // InternalQLS.g:1485:3: ruleNumericTypeSpinnerStyle
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
    // InternalQLS.g:1494:1: rule__ValueType__Alternatives : ( ( ruleValueType_Impl ) | ( ruleBooleanValueType ) | ( ruleIntegerValueType ) | ( ruleDecimalValueType ) | ( ruleDateValueType ) | ( ruleEnumerationValueType ) | ( ruleStringValueType ) );
    public final void rule__ValueType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1498:1: ( ( ruleValueType_Impl ) | ( ruleBooleanValueType ) | ( ruleIntegerValueType ) | ( ruleDecimalValueType ) | ( ruleDateValueType ) | ( ruleEnumerationValueType ) | ( ruleStringValueType ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt3=1;
                }
                break;
            case 66:
                {
                alt3=2;
                }
                break;
            case 67:
                {
                alt3=3;
                }
                break;
            case 70:
                {
                alt3=4;
                }
                break;
            case 71:
                {
                alt3=5;
                }
                break;
            case 72:
                {
                alt3=6;
                }
                break;
            case 75:
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
                    // InternalQLS.g:1499:2: ( ruleValueType_Impl )
                    {
                    // InternalQLS.g:1499:2: ( ruleValueType_Impl )
                    // InternalQLS.g:1500:3: ruleValueType_Impl
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
                    // InternalQLS.g:1505:2: ( ruleBooleanValueType )
                    {
                    // InternalQLS.g:1505:2: ( ruleBooleanValueType )
                    // InternalQLS.g:1506:3: ruleBooleanValueType
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
                    // InternalQLS.g:1511:2: ( ruleIntegerValueType )
                    {
                    // InternalQLS.g:1511:2: ( ruleIntegerValueType )
                    // InternalQLS.g:1512:3: ruleIntegerValueType
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
                    // InternalQLS.g:1517:2: ( ruleDecimalValueType )
                    {
                    // InternalQLS.g:1517:2: ( ruleDecimalValueType )
                    // InternalQLS.g:1518:3: ruleDecimalValueType
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
                    // InternalQLS.g:1523:2: ( ruleDateValueType )
                    {
                    // InternalQLS.g:1523:2: ( ruleDateValueType )
                    // InternalQLS.g:1524:3: ruleDateValueType
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
                    // InternalQLS.g:1529:2: ( ruleEnumerationValueType )
                    {
                    // InternalQLS.g:1529:2: ( ruleEnumerationValueType )
                    // InternalQLS.g:1530:3: ruleEnumerationValueType
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
                    // InternalQLS.g:1535:2: ( ruleStringValueType )
                    {
                    // InternalQLS.g:1535:2: ( ruleStringValueType )
                    // InternalQLS.g:1536:3: ruleStringValueType
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
    // InternalQLS.g:1545:1: rule__UnaryOrPrimaryExpression__Alternatives : ( ( rulePrimaryExpression ) | ( ruleUnaryExpression ) );
    public final void rule__UnaryOrPrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1549:1: ( ( rulePrimaryExpression ) | ( ruleUnaryExpression ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_INT && LA4_0<=RULE_ID)||(LA4_0>=15 && LA4_0<=16)||LA4_0==57||LA4_0==59||LA4_0==78) ) {
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
                    // InternalQLS.g:1550:2: ( rulePrimaryExpression )
                    {
                    // InternalQLS.g:1550:2: ( rulePrimaryExpression )
                    // InternalQLS.g:1551:3: rulePrimaryExpression
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
                    // InternalQLS.g:1556:2: ( ruleUnaryExpression )
                    {
                    // InternalQLS.g:1556:2: ( ruleUnaryExpression )
                    // InternalQLS.g:1557:3: ruleUnaryExpression
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
    // InternalQLS.g:1566:1: rule__PrimaryExpression__Alternatives : ( ( ruleCall ) | ( ruleIfExpression ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1570:1: ( ( ruleCall ) | ( ruleIfExpression ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
            case RULE_ID:
            case 15:
            case 16:
            case 78:
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
                    // InternalQLS.g:1571:2: ( ruleCall )
                    {
                    // InternalQLS.g:1571:2: ( ruleCall )
                    // InternalQLS.g:1572:3: ruleCall
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
                    // InternalQLS.g:1577:2: ( ruleIfExpression )
                    {
                    // InternalQLS.g:1577:2: ( ruleIfExpression )
                    // InternalQLS.g:1578:3: ruleIfExpression
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
                    // InternalQLS.g:1583:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    {
                    // InternalQLS.g:1583:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    // InternalQLS.g:1584:3: ( rule__PrimaryExpression__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 
                    // InternalQLS.g:1585:3: ( rule__PrimaryExpression__Group_2__0 )
                    // InternalQLS.g:1585:4: rule__PrimaryExpression__Group_2__0
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
    // InternalQLS.g:1593:1: rule__PrimaryExpression__Alternatives_2_1 : ( ( ruleOrExpression ) | ( ruleUnaryExpression ) );
    public final void rule__PrimaryExpression__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1597:1: ( ( ruleOrExpression ) | ( ruleUnaryExpression ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_INT && LA6_0<=RULE_ID)||(LA6_0>=15 && LA6_0<=16)||LA6_0==57||LA6_0==59||LA6_0==78) ) {
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
                    // InternalQLS.g:1598:2: ( ruleOrExpression )
                    {
                    // InternalQLS.g:1598:2: ( ruleOrExpression )
                    // InternalQLS.g:1599:3: ruleOrExpression
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
                    // InternalQLS.g:1604:2: ( ruleUnaryExpression )
                    {
                    // InternalQLS.g:1604:2: ( ruleUnaryExpression )
                    // InternalQLS.g:1605:3: ruleUnaryExpression
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
    // InternalQLS.g:1614:1: rule__Call__Alternatives : ( ( ruleConstantCall ) | ( ruleQuestionCall ) | ( ruleEnumerationCall ) );
    public final void rule__Call__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1618:1: ( ( ruleConstantCall ) | ( ruleQuestionCall ) | ( ruleEnumerationCall ) )
            int alt7=3;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalQLS.g:1619:2: ( ruleConstantCall )
                    {
                    // InternalQLS.g:1619:2: ( ruleConstantCall )
                    // InternalQLS.g:1620:3: ruleConstantCall
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
                    // InternalQLS.g:1625:2: ( ruleQuestionCall )
                    {
                    // InternalQLS.g:1625:2: ( ruleQuestionCall )
                    // InternalQLS.g:1626:3: ruleQuestionCall
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
                    // InternalQLS.g:1631:2: ( ruleEnumerationCall )
                    {
                    // InternalQLS.g:1631:2: ( ruleEnumerationCall )
                    // InternalQLS.g:1632:3: ruleEnumerationCall
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
    // InternalQLS.g:1641:1: rule__Value__Alternatives : ( ( ruleIntegerValue ) | ( ruleStringValue ) | ( ruleBooleanValue ) | ( ruleDateValue ) | ( ruleDecimalValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1645:1: ( ( ruleIntegerValue ) | ( ruleStringValue ) | ( ruleBooleanValue ) | ( ruleDateValue ) | ( ruleDecimalValue ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==78) ) {
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
            case 76:
                {
                alt8=4;
                }
                break;
            case 78:
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
                    // InternalQLS.g:1646:2: ( ruleIntegerValue )
                    {
                    // InternalQLS.g:1646:2: ( ruleIntegerValue )
                    // InternalQLS.g:1647:3: ruleIntegerValue
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
                    // InternalQLS.g:1652:2: ( ruleStringValue )
                    {
                    // InternalQLS.g:1652:2: ( ruleStringValue )
                    // InternalQLS.g:1653:3: ruleStringValue
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
                    // InternalQLS.g:1658:2: ( ruleBooleanValue )
                    {
                    // InternalQLS.g:1658:2: ( ruleBooleanValue )
                    // InternalQLS.g:1659:3: ruleBooleanValue
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
                    // InternalQLS.g:1664:2: ( ruleDateValue )
                    {
                    // InternalQLS.g:1664:2: ( ruleDateValue )
                    // InternalQLS.g:1665:3: ruleDateValue
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
                    // InternalQLS.g:1670:2: ( ruleDecimalValue )
                    {
                    // InternalQLS.g:1670:2: ( ruleDecimalValue )
                    // InternalQLS.g:1671:3: ruleDecimalValue
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
    // InternalQLS.g:1680:1: rule__DefinitionGroup__Alternatives_3 : ( ( ( rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0 ) ) | ( ( rule__DefinitionGroup__DataTypesAssignment_3_1 ) ) );
    public final void rule__DefinitionGroup__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1684:1: ( ( ( rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0 ) ) | ( ( rule__DefinitionGroup__DataTypesAssignment_3_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==79||LA9_0==86) ) {
                alt9=1;
            }
            else if ( (LA9_0==64||(LA9_0>=66 && LA9_0<=67)||(LA9_0>=70 && LA9_0<=72)||LA9_0==75) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalQLS.g:1685:2: ( ( rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0 ) )
                    {
                    // InternalQLS.g:1685:2: ( ( rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0 ) )
                    // InternalQLS.g:1686:3: ( rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0 )
                    {
                     before(grammarAccess.getDefinitionGroupAccess().getQuestionDefinitionsAssignment_3_0()); 
                    // InternalQLS.g:1687:3: ( rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0 )
                    // InternalQLS.g:1687:4: rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0
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
                    // InternalQLS.g:1691:2: ( ( rule__DefinitionGroup__DataTypesAssignment_3_1 ) )
                    {
                    // InternalQLS.g:1691:2: ( ( rule__DefinitionGroup__DataTypesAssignment_3_1 ) )
                    // InternalQLS.g:1692:3: ( rule__DefinitionGroup__DataTypesAssignment_3_1 )
                    {
                     before(grammarAccess.getDefinitionGroupAccess().getDataTypesAssignment_3_1()); 
                    // InternalQLS.g:1693:3: ( rule__DefinitionGroup__DataTypesAssignment_3_1 )
                    // InternalQLS.g:1693:4: rule__DefinitionGroup__DataTypesAssignment_3_1
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
    // InternalQLS.g:1701:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1705:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalQLS.g:1706:2: ( 'true' )
                    {
                    // InternalQLS.g:1706:2: ( 'true' )
                    // InternalQLS.g:1707:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:1712:2: ( 'false' )
                    {
                    // InternalQLS.g:1712:2: ( 'false' )
                    // InternalQLS.g:1713:3: 'false'
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
    // InternalQLS.g:1722:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1726:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalQLS.g:1727:2: ( RULE_STRING )
                    {
                    // InternalQLS.g:1727:2: ( RULE_STRING )
                    // InternalQLS.g:1728:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:1733:2: ( RULE_ID )
                    {
                    // InternalQLS.g:1733:2: ( RULE_ID )
                    // InternalQLS.g:1734:3: RULE_ID
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
    // InternalQLS.g:1743:1: rule__QuestionGroup__Alternatives_3 : ( ( ( rule__QuestionGroup__QuestionGroupsAssignment_3_0 ) ) | ( ( rule__QuestionGroup__QuestionsAssignment_3_1 ) ) );
    public final void rule__QuestionGroup__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1747:1: ( ( ( rule__QuestionGroup__QuestionGroupsAssignment_3_0 ) ) | ( ( rule__QuestionGroup__QuestionsAssignment_3_1 ) ) )
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
                    // InternalQLS.g:1748:2: ( ( rule__QuestionGroup__QuestionGroupsAssignment_3_0 ) )
                    {
                    // InternalQLS.g:1748:2: ( ( rule__QuestionGroup__QuestionGroupsAssignment_3_0 ) )
                    // InternalQLS.g:1749:3: ( rule__QuestionGroup__QuestionGroupsAssignment_3_0 )
                    {
                     before(grammarAccess.getQuestionGroupAccess().getQuestionGroupsAssignment_3_0()); 
                    // InternalQLS.g:1750:3: ( rule__QuestionGroup__QuestionGroupsAssignment_3_0 )
                    // InternalQLS.g:1750:4: rule__QuestionGroup__QuestionGroupsAssignment_3_0
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
                    // InternalQLS.g:1754:2: ( ( rule__QuestionGroup__QuestionsAssignment_3_1 ) )
                    {
                    // InternalQLS.g:1754:2: ( ( rule__QuestionGroup__QuestionsAssignment_3_1 ) )
                    // InternalQLS.g:1755:3: ( rule__QuestionGroup__QuestionsAssignment_3_1 )
                    {
                     before(grammarAccess.getQuestionGroupAccess().getQuestionsAssignment_3_1()); 
                    // InternalQLS.g:1756:3: ( rule__QuestionGroup__QuestionsAssignment_3_1 )
                    // InternalQLS.g:1756:4: rule__QuestionGroup__QuestionsAssignment_3_1
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
    // InternalQLS.g:1764:1: rule__ConstantCall__ValueAlternatives_1_0 : ( ( ruleStringValue ) | ( ruleIntegerValue ) | ( ruleBooleanValue ) | ( ruleDecimalValue ) );
    public final void rule__ConstantCall__ValueAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1768:1: ( ( ruleStringValue ) | ( ruleIntegerValue ) | ( ruleBooleanValue ) | ( ruleDecimalValue ) )
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

                if ( (LA13_2==78) ) {
                    alt13=4;
                }
                else if ( (LA13_2==EOF||(LA13_2>=12 && LA13_2<=14)||LA13_2==34||(LA13_2>=36 && LA13_2<=42)||LA13_2==44||LA13_2==58||(LA13_2>=60 && LA13_2<=62)||LA13_2==82) ) {
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
            case 78:
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
                    // InternalQLS.g:1769:2: ( ruleStringValue )
                    {
                    // InternalQLS.g:1769:2: ( ruleStringValue )
                    // InternalQLS.g:1770:3: ruleStringValue
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
                    // InternalQLS.g:1775:2: ( ruleIntegerValue )
                    {
                    // InternalQLS.g:1775:2: ( ruleIntegerValue )
                    // InternalQLS.g:1776:3: ruleIntegerValue
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
                    // InternalQLS.g:1781:2: ( ruleBooleanValue )
                    {
                    // InternalQLS.g:1781:2: ( ruleBooleanValue )
                    // InternalQLS.g:1782:3: ruleBooleanValue
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
                    // InternalQLS.g:1787:2: ( ruleDecimalValue )
                    {
                    // InternalQLS.g:1787:2: ( ruleDecimalValue )
                    // InternalQLS.g:1788:3: ruleDecimalValue
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
    // InternalQLS.g:1797:1: rule__EDouble__Alternatives_3_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1801:1: ( ( 'E' ) | ( 'e' ) )
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
                    // InternalQLS.g:1802:2: ( 'E' )
                    {
                    // InternalQLS.g:1802:2: ( 'E' )
                    // InternalQLS.g:1803:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_3_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:1808:2: ( 'e' )
                    {
                    // InternalQLS.g:1808:2: ( 'e' )
                    // InternalQLS.g:1809:3: 'e'
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
    // InternalQLS.g:1818:1: rule__BooleanStyleKind__Alternatives : ( ( ( 'CHECKBOX' ) ) | ( ( 'TWO_RADIO' ) ) | ( ( 'DROPDOWN' ) ) );
    public final void rule__BooleanStyleKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1822:1: ( ( ( 'CHECKBOX' ) ) | ( ( 'TWO_RADIO' ) ) | ( ( 'DROPDOWN' ) ) )
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
                    // InternalQLS.g:1823:2: ( ( 'CHECKBOX' ) )
                    {
                    // InternalQLS.g:1823:2: ( ( 'CHECKBOX' ) )
                    // InternalQLS.g:1824:3: ( 'CHECKBOX' )
                    {
                     before(grammarAccess.getBooleanStyleKindAccess().getCHECKBOXEnumLiteralDeclaration_0()); 
                    // InternalQLS.g:1825:3: ( 'CHECKBOX' )
                    // InternalQLS.g:1825:4: 'CHECKBOX'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getBooleanStyleKindAccess().getCHECKBOXEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:1829:2: ( ( 'TWO_RADIO' ) )
                    {
                    // InternalQLS.g:1829:2: ( ( 'TWO_RADIO' ) )
                    // InternalQLS.g:1830:3: ( 'TWO_RADIO' )
                    {
                     before(grammarAccess.getBooleanStyleKindAccess().getTWO_RADIOEnumLiteralDeclaration_1()); 
                    // InternalQLS.g:1831:3: ( 'TWO_RADIO' )
                    // InternalQLS.g:1831:4: 'TWO_RADIO'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getBooleanStyleKindAccess().getTWO_RADIOEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQLS.g:1835:2: ( ( 'DROPDOWN' ) )
                    {
                    // InternalQLS.g:1835:2: ( ( 'DROPDOWN' ) )
                    // InternalQLS.g:1836:3: ( 'DROPDOWN' )
                    {
                     before(grammarAccess.getBooleanStyleKindAccess().getDROPDOWNEnumLiteralDeclaration_2()); 
                    // InternalQLS.g:1837:3: ( 'DROPDOWN' )
                    // InternalQLS.g:1837:4: 'DROPDOWN'
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
    // InternalQLS.g:1845:1: rule__BinaryOperatorKind__Alternatives : ( ( ( 'PLUS' ) ) | ( ( 'MINUS' ) ) | ( ( 'MULT' ) ) | ( ( 'DIV' ) ) | ( ( 'EQUAL' ) ) | ( ( 'NOTEQUAL' ) ) | ( ( 'GREATER' ) ) | ( ( 'LOWER' ) ) | ( ( 'GREATEROREQUAL' ) ) | ( ( 'LOWEROREQUAL' ) ) | ( ( 'AND' ) ) | ( ( 'OR' ) ) );
    public final void rule__BinaryOperatorKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1849:1: ( ( ( 'PLUS' ) ) | ( ( 'MINUS' ) ) | ( ( 'MULT' ) ) | ( ( 'DIV' ) ) | ( ( 'EQUAL' ) ) | ( ( 'NOTEQUAL' ) ) | ( ( 'GREATER' ) ) | ( ( 'LOWER' ) ) | ( ( 'GREATEROREQUAL' ) ) | ( ( 'LOWEROREQUAL' ) ) | ( ( 'AND' ) ) | ( ( 'OR' ) ) )
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
                    // InternalQLS.g:1850:2: ( ( 'PLUS' ) )
                    {
                    // InternalQLS.g:1850:2: ( ( 'PLUS' ) )
                    // InternalQLS.g:1851:3: ( 'PLUS' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getPLUSEnumLiteralDeclaration_0()); 
                    // InternalQLS.g:1852:3: ( 'PLUS' )
                    // InternalQLS.g:1852:4: 'PLUS'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getPLUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:1856:2: ( ( 'MINUS' ) )
                    {
                    // InternalQLS.g:1856:2: ( ( 'MINUS' ) )
                    // InternalQLS.g:1857:3: ( 'MINUS' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getMINUSEnumLiteralDeclaration_1()); 
                    // InternalQLS.g:1858:3: ( 'MINUS' )
                    // InternalQLS.g:1858:4: 'MINUS'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getMINUSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQLS.g:1862:2: ( ( 'MULT' ) )
                    {
                    // InternalQLS.g:1862:2: ( ( 'MULT' ) )
                    // InternalQLS.g:1863:3: ( 'MULT' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getMULTEnumLiteralDeclaration_2()); 
                    // InternalQLS.g:1864:3: ( 'MULT' )
                    // InternalQLS.g:1864:4: 'MULT'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getMULTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQLS.g:1868:2: ( ( 'DIV' ) )
                    {
                    // InternalQLS.g:1868:2: ( ( 'DIV' ) )
                    // InternalQLS.g:1869:3: ( 'DIV' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getDIVEnumLiteralDeclaration_3()); 
                    // InternalQLS.g:1870:3: ( 'DIV' )
                    // InternalQLS.g:1870:4: 'DIV'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getDIVEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalQLS.g:1874:2: ( ( 'EQUAL' ) )
                    {
                    // InternalQLS.g:1874:2: ( ( 'EQUAL' ) )
                    // InternalQLS.g:1875:3: ( 'EQUAL' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getEQUALEnumLiteralDeclaration_4()); 
                    // InternalQLS.g:1876:3: ( 'EQUAL' )
                    // InternalQLS.g:1876:4: 'EQUAL'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getEQUALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalQLS.g:1880:2: ( ( 'NOTEQUAL' ) )
                    {
                    // InternalQLS.g:1880:2: ( ( 'NOTEQUAL' ) )
                    // InternalQLS.g:1881:3: ( 'NOTEQUAL' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getNOTEQUALEnumLiteralDeclaration_5()); 
                    // InternalQLS.g:1882:3: ( 'NOTEQUAL' )
                    // InternalQLS.g:1882:4: 'NOTEQUAL'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getNOTEQUALEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalQLS.g:1886:2: ( ( 'GREATER' ) )
                    {
                    // InternalQLS.g:1886:2: ( ( 'GREATER' ) )
                    // InternalQLS.g:1887:3: ( 'GREATER' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getGREATEREnumLiteralDeclaration_6()); 
                    // InternalQLS.g:1888:3: ( 'GREATER' )
                    // InternalQLS.g:1888:4: 'GREATER'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getGREATEREnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalQLS.g:1892:2: ( ( 'LOWER' ) )
                    {
                    // InternalQLS.g:1892:2: ( ( 'LOWER' ) )
                    // InternalQLS.g:1893:3: ( 'LOWER' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getLOWEREnumLiteralDeclaration_7()); 
                    // InternalQLS.g:1894:3: ( 'LOWER' )
                    // InternalQLS.g:1894:4: 'LOWER'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getLOWEREnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalQLS.g:1898:2: ( ( 'GREATEROREQUAL' ) )
                    {
                    // InternalQLS.g:1898:2: ( ( 'GREATEROREQUAL' ) )
                    // InternalQLS.g:1899:3: ( 'GREATEROREQUAL' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_8()); 
                    // InternalQLS.g:1900:3: ( 'GREATEROREQUAL' )
                    // InternalQLS.g:1900:4: 'GREATEROREQUAL'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalQLS.g:1904:2: ( ( 'LOWEROREQUAL' ) )
                    {
                    // InternalQLS.g:1904:2: ( ( 'LOWEROREQUAL' ) )
                    // InternalQLS.g:1905:3: ( 'LOWEROREQUAL' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getLOWEROREQUALEnumLiteralDeclaration_9()); 
                    // InternalQLS.g:1906:3: ( 'LOWEROREQUAL' )
                    // InternalQLS.g:1906:4: 'LOWEROREQUAL'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getLOWEROREQUALEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalQLS.g:1910:2: ( ( 'AND' ) )
                    {
                    // InternalQLS.g:1910:2: ( ( 'AND' ) )
                    // InternalQLS.g:1911:3: ( 'AND' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getANDEnumLiteralDeclaration_10()); 
                    // InternalQLS.g:1912:3: ( 'AND' )
                    // InternalQLS.g:1912:4: 'AND'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getANDEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalQLS.g:1916:2: ( ( 'OR' ) )
                    {
                    // InternalQLS.g:1916:2: ( ( 'OR' ) )
                    // InternalQLS.g:1917:3: ( 'OR' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getOREnumLiteralDeclaration_11()); 
                    // InternalQLS.g:1918:3: ( 'OR' )
                    // InternalQLS.g:1918:4: 'OR'
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
    // InternalQLS.g:1926:1: rule__UnaryOperatorKind__Alternatives : ( ( ( '-' ) ) | ( ( 'not' ) ) );
    public final void rule__UnaryOperatorKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1930:1: ( ( ( '-' ) ) | ( ( 'not' ) ) )
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
                    // InternalQLS.g:1931:2: ( ( '-' ) )
                    {
                    // InternalQLS.g:1931:2: ( ( '-' ) )
                    // InternalQLS.g:1932:3: ( '-' )
                    {
                     before(grammarAccess.getUnaryOperatorKindAccess().getUNARYMINUSEnumLiteralDeclaration_0()); 
                    // InternalQLS.g:1933:3: ( '-' )
                    // InternalQLS.g:1933:4: '-'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getUnaryOperatorKindAccess().getUNARYMINUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:1937:2: ( ( 'not' ) )
                    {
                    // InternalQLS.g:1937:2: ( ( 'not' ) )
                    // InternalQLS.g:1938:3: ( 'not' )
                    {
                     before(grammarAccess.getUnaryOperatorKindAccess().getNOTEnumLiteralDeclaration_1()); 
                    // InternalQLS.g:1939:3: ( 'not' )
                    // InternalQLS.g:1939:4: 'not'
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
    // InternalQLS.g:1947:1: rule__AdditionOperatorKind__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__AdditionOperatorKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1951:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
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
                    // InternalQLS.g:1952:2: ( ( '+' ) )
                    {
                    // InternalQLS.g:1952:2: ( ( '+' ) )
                    // InternalQLS.g:1953:3: ( '+' )
                    {
                     before(grammarAccess.getAdditionOperatorKindAccess().getPLUSEnumLiteralDeclaration_0()); 
                    // InternalQLS.g:1954:3: ( '+' )
                    // InternalQLS.g:1954:4: '+'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getAdditionOperatorKindAccess().getPLUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:1958:2: ( ( '-' ) )
                    {
                    // InternalQLS.g:1958:2: ( ( '-' ) )
                    // InternalQLS.g:1959:3: ( '-' )
                    {
                     before(grammarAccess.getAdditionOperatorKindAccess().getMINUSEnumLiteralDeclaration_1()); 
                    // InternalQLS.g:1960:3: ( '-' )
                    // InternalQLS.g:1960:4: '-'
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
    // InternalQLS.g:1968:1: rule__MultiplicationOperatorKind__Alternatives : ( ( ( '*' ) ) | ( ( '/' ) ) );
    public final void rule__MultiplicationOperatorKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1972:1: ( ( ( '*' ) ) | ( ( '/' ) ) )
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
                    // InternalQLS.g:1973:2: ( ( '*' ) )
                    {
                    // InternalQLS.g:1973:2: ( ( '*' ) )
                    // InternalQLS.g:1974:3: ( '*' )
                    {
                     before(grammarAccess.getMultiplicationOperatorKindAccess().getMULTEnumLiteralDeclaration_0()); 
                    // InternalQLS.g:1975:3: ( '*' )
                    // InternalQLS.g:1975:4: '*'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicationOperatorKindAccess().getMULTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:1979:2: ( ( '/' ) )
                    {
                    // InternalQLS.g:1979:2: ( ( '/' ) )
                    // InternalQLS.g:1980:3: ( '/' )
                    {
                     before(grammarAccess.getMultiplicationOperatorKindAccess().getDIVEnumLiteralDeclaration_1()); 
                    // InternalQLS.g:1981:3: ( '/' )
                    // InternalQLS.g:1981:4: '/'
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
    // InternalQLS.g:1989:1: rule__ComparisionOperatorKind__Alternatives : ( ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) );
    public final void rule__ComparisionOperatorKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1993:1: ( ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) )
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
                    // InternalQLS.g:1994:2: ( ( '>' ) )
                    {
                    // InternalQLS.g:1994:2: ( ( '>' ) )
                    // InternalQLS.g:1995:3: ( '>' )
                    {
                     before(grammarAccess.getComparisionOperatorKindAccess().getGREATEREnumLiteralDeclaration_0()); 
                    // InternalQLS.g:1996:3: ( '>' )
                    // InternalQLS.g:1996:4: '>'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisionOperatorKindAccess().getGREATEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:2000:2: ( ( '<' ) )
                    {
                    // InternalQLS.g:2000:2: ( ( '<' ) )
                    // InternalQLS.g:2001:3: ( '<' )
                    {
                     before(grammarAccess.getComparisionOperatorKindAccess().getLOWEREnumLiteralDeclaration_1()); 
                    // InternalQLS.g:2002:3: ( '<' )
                    // InternalQLS.g:2002:4: '<'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisionOperatorKindAccess().getLOWEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQLS.g:2006:2: ( ( '>=' ) )
                    {
                    // InternalQLS.g:2006:2: ( ( '>=' ) )
                    // InternalQLS.g:2007:3: ( '>=' )
                    {
                     before(grammarAccess.getComparisionOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_2()); 
                    // InternalQLS.g:2008:3: ( '>=' )
                    // InternalQLS.g:2008:4: '>='
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisionOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQLS.g:2012:2: ( ( '<=' ) )
                    {
                    // InternalQLS.g:2012:2: ( ( '<=' ) )
                    // InternalQLS.g:2013:3: ( '<=' )
                    {
                     before(grammarAccess.getComparisionOperatorKindAccess().getLOWEROREQUALEnumLiteralDeclaration_3()); 
                    // InternalQLS.g:2014:3: ( '<=' )
                    // InternalQLS.g:2014:4: '<='
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
    // InternalQLS.g:2022:1: rule__QLSModel__Group__0 : rule__QLSModel__Group__0__Impl rule__QLSModel__Group__1 ;
    public final void rule__QLSModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2026:1: ( rule__QLSModel__Group__0__Impl rule__QLSModel__Group__1 )
            // InternalQLS.g:2027:2: rule__QLSModel__Group__0__Impl rule__QLSModel__Group__1
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
    // InternalQLS.g:2034:1: rule__QLSModel__Group__0__Impl : ( () ) ;
    public final void rule__QLSModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2038:1: ( ( () ) )
            // InternalQLS.g:2039:1: ( () )
            {
            // InternalQLS.g:2039:1: ( () )
            // InternalQLS.g:2040:2: ()
            {
             before(grammarAccess.getQLSModelAccess().getQLSModelAction_0()); 
            // InternalQLS.g:2041:2: ()
            // InternalQLS.g:2041:3: 
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
    // InternalQLS.g:2049:1: rule__QLSModel__Group__1 : rule__QLSModel__Group__1__Impl rule__QLSModel__Group__2 ;
    public final void rule__QLSModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2053:1: ( rule__QLSModel__Group__1__Impl rule__QLSModel__Group__2 )
            // InternalQLS.g:2054:2: rule__QLSModel__Group__1__Impl rule__QLSModel__Group__2
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
    // InternalQLS.g:2061:1: rule__QLSModel__Group__1__Impl : ( ( rule__QLSModel__ImportsAssignment_1 )* ) ;
    public final void rule__QLSModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2065:1: ( ( ( rule__QLSModel__ImportsAssignment_1 )* ) )
            // InternalQLS.g:2066:1: ( ( rule__QLSModel__ImportsAssignment_1 )* )
            {
            // InternalQLS.g:2066:1: ( ( rule__QLSModel__ImportsAssignment_1 )* )
            // InternalQLS.g:2067:2: ( rule__QLSModel__ImportsAssignment_1 )*
            {
             before(grammarAccess.getQLSModelAccess().getImportsAssignment_1()); 
            // InternalQLS.g:2068:2: ( rule__QLSModel__ImportsAssignment_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==47) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalQLS.g:2068:3: rule__QLSModel__ImportsAssignment_1
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
    // InternalQLS.g:2076:1: rule__QLSModel__Group__2 : rule__QLSModel__Group__2__Impl rule__QLSModel__Group__3 ;
    public final void rule__QLSModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2080:1: ( rule__QLSModel__Group__2__Impl rule__QLSModel__Group__3 )
            // InternalQLS.g:2081:2: rule__QLSModel__Group__2__Impl rule__QLSModel__Group__3
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
    // InternalQLS.g:2088:1: rule__QLSModel__Group__2__Impl : ( 'QLSModel' ) ;
    public final void rule__QLSModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2092:1: ( ( 'QLSModel' ) )
            // InternalQLS.g:2093:1: ( 'QLSModel' )
            {
            // InternalQLS.g:2093:1: ( 'QLSModel' )
            // InternalQLS.g:2094:2: 'QLSModel'
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
    // InternalQLS.g:2103:1: rule__QLSModel__Group__3 : rule__QLSModel__Group__3__Impl rule__QLSModel__Group__4 ;
    public final void rule__QLSModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2107:1: ( rule__QLSModel__Group__3__Impl rule__QLSModel__Group__4 )
            // InternalQLS.g:2108:2: rule__QLSModel__Group__3__Impl rule__QLSModel__Group__4
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
    // InternalQLS.g:2115:1: rule__QLSModel__Group__3__Impl : ( '{' ) ;
    public final void rule__QLSModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2119:1: ( ( '{' ) )
            // InternalQLS.g:2120:1: ( '{' )
            {
            // InternalQLS.g:2120:1: ( '{' )
            // InternalQLS.g:2121:2: '{'
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
    // InternalQLS.g:2130:1: rule__QLSModel__Group__4 : rule__QLSModel__Group__4__Impl rule__QLSModel__Group__5 ;
    public final void rule__QLSModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2134:1: ( rule__QLSModel__Group__4__Impl rule__QLSModel__Group__5 )
            // InternalQLS.g:2135:2: rule__QLSModel__Group__4__Impl rule__QLSModel__Group__5
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
    // InternalQLS.g:2142:1: rule__QLSModel__Group__4__Impl : ( 'questionStyles' ) ;
    public final void rule__QLSModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2146:1: ( ( 'questionStyles' ) )
            // InternalQLS.g:2147:1: ( 'questionStyles' )
            {
            // InternalQLS.g:2147:1: ( 'questionStyles' )
            // InternalQLS.g:2148:2: 'questionStyles'
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
    // InternalQLS.g:2157:1: rule__QLSModel__Group__5 : rule__QLSModel__Group__5__Impl rule__QLSModel__Group__6 ;
    public final void rule__QLSModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2161:1: ( rule__QLSModel__Group__5__Impl rule__QLSModel__Group__6 )
            // InternalQLS.g:2162:2: rule__QLSModel__Group__5__Impl rule__QLSModel__Group__6
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
    // InternalQLS.g:2169:1: rule__QLSModel__Group__5__Impl : ( '{' ) ;
    public final void rule__QLSModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2173:1: ( ( '{' ) )
            // InternalQLS.g:2174:1: ( '{' )
            {
            // InternalQLS.g:2174:1: ( '{' )
            // InternalQLS.g:2175:2: '{'
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
    // InternalQLS.g:2184:1: rule__QLSModel__Group__6 : rule__QLSModel__Group__6__Impl rule__QLSModel__Group__7 ;
    public final void rule__QLSModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2188:1: ( rule__QLSModel__Group__6__Impl rule__QLSModel__Group__7 )
            // InternalQLS.g:2189:2: rule__QLSModel__Group__6__Impl rule__QLSModel__Group__7
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
    // InternalQLS.g:2196:1: rule__QLSModel__Group__6__Impl : ( ( rule__QLSModel__QuestionStylesAssignment_6 )* ) ;
    public final void rule__QLSModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2200:1: ( ( ( rule__QLSModel__QuestionStylesAssignment_6 )* ) )
            // InternalQLS.g:2201:1: ( ( rule__QLSModel__QuestionStylesAssignment_6 )* )
            {
            // InternalQLS.g:2201:1: ( ( rule__QLSModel__QuestionStylesAssignment_6 )* )
            // InternalQLS.g:2202:2: ( rule__QLSModel__QuestionStylesAssignment_6 )*
            {
             before(grammarAccess.getQLSModelAccess().getQuestionStylesAssignment_6()); 
            // InternalQLS.g:2203:2: ( rule__QLSModel__QuestionStylesAssignment_6 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==48) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalQLS.g:2203:3: rule__QLSModel__QuestionStylesAssignment_6
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
    // InternalQLS.g:2211:1: rule__QLSModel__Group__7 : rule__QLSModel__Group__7__Impl rule__QLSModel__Group__8 ;
    public final void rule__QLSModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2215:1: ( rule__QLSModel__Group__7__Impl rule__QLSModel__Group__8 )
            // InternalQLS.g:2216:2: rule__QLSModel__Group__7__Impl rule__QLSModel__Group__8
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
    // InternalQLS.g:2223:1: rule__QLSModel__Group__7__Impl : ( '}' ) ;
    public final void rule__QLSModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2227:1: ( ( '}' ) )
            // InternalQLS.g:2228:1: ( '}' )
            {
            // InternalQLS.g:2228:1: ( '}' )
            // InternalQLS.g:2229:2: '}'
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
    // InternalQLS.g:2238:1: rule__QLSModel__Group__8 : rule__QLSModel__Group__8__Impl ;
    public final void rule__QLSModel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2242:1: ( rule__QLSModel__Group__8__Impl )
            // InternalQLS.g:2243:2: rule__QLSModel__Group__8__Impl
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
    // InternalQLS.g:2249:1: rule__QLSModel__Group__8__Impl : ( '}' ) ;
    public final void rule__QLSModel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2253:1: ( ( '}' ) )
            // InternalQLS.g:2254:1: ( '}' )
            {
            // InternalQLS.g:2254:1: ( '}' )
            // InternalQLS.g:2255:2: '}'
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
    // InternalQLS.g:2265:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2269:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalQLS.g:2270:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalQLS.g:2277:1: rule__Import__Group__0__Impl : ( () ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2281:1: ( ( () ) )
            // InternalQLS.g:2282:1: ( () )
            {
            // InternalQLS.g:2282:1: ( () )
            // InternalQLS.g:2283:2: ()
            {
             before(grammarAccess.getImportAccess().getImportAction_0()); 
            // InternalQLS.g:2284:2: ()
            // InternalQLS.g:2284:3: 
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
    // InternalQLS.g:2292:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2296:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalQLS.g:2297:2: rule__Import__Group__1__Impl rule__Import__Group__2
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
    // InternalQLS.g:2304:1: rule__Import__Group__1__Impl : ( 'import' ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2308:1: ( ( 'import' ) )
            // InternalQLS.g:2309:1: ( 'import' )
            {
            // InternalQLS.g:2309:1: ( 'import' )
            // InternalQLS.g:2310:2: 'import'
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
    // InternalQLS.g:2319:1: rule__Import__Group__2 : rule__Import__Group__2__Impl ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2323:1: ( rule__Import__Group__2__Impl )
            // InternalQLS.g:2324:2: rule__Import__Group__2__Impl
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
    // InternalQLS.g:2330:1: rule__Import__Group__2__Impl : ( ( rule__Import__ImportURIAssignment_2 ) ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2334:1: ( ( ( rule__Import__ImportURIAssignment_2 ) ) )
            // InternalQLS.g:2335:1: ( ( rule__Import__ImportURIAssignment_2 ) )
            {
            // InternalQLS.g:2335:1: ( ( rule__Import__ImportURIAssignment_2 ) )
            // InternalQLS.g:2336:2: ( rule__Import__ImportURIAssignment_2 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_2()); 
            // InternalQLS.g:2337:2: ( rule__Import__ImportURIAssignment_2 )
            // InternalQLS.g:2337:3: rule__Import__ImportURIAssignment_2
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
    // InternalQLS.g:2346:1: rule__QuestionStyle__Group__0 : rule__QuestionStyle__Group__0__Impl rule__QuestionStyle__Group__1 ;
    public final void rule__QuestionStyle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2350:1: ( rule__QuestionStyle__Group__0__Impl rule__QuestionStyle__Group__1 )
            // InternalQLS.g:2351:2: rule__QuestionStyle__Group__0__Impl rule__QuestionStyle__Group__1
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
    // InternalQLS.g:2358:1: rule__QuestionStyle__Group__0__Impl : ( 'styledQuestion' ) ;
    public final void rule__QuestionStyle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2362:1: ( ( 'styledQuestion' ) )
            // InternalQLS.g:2363:1: ( 'styledQuestion' )
            {
            // InternalQLS.g:2363:1: ( 'styledQuestion' )
            // InternalQLS.g:2364:2: 'styledQuestion'
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
    // InternalQLS.g:2373:1: rule__QuestionStyle__Group__1 : rule__QuestionStyle__Group__1__Impl rule__QuestionStyle__Group__2 ;
    public final void rule__QuestionStyle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2377:1: ( rule__QuestionStyle__Group__1__Impl rule__QuestionStyle__Group__2 )
            // InternalQLS.g:2378:2: rule__QuestionStyle__Group__1__Impl rule__QuestionStyle__Group__2
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
    // InternalQLS.g:2385:1: rule__QuestionStyle__Group__1__Impl : ( ( rule__QuestionStyle__StyledQuestionAssignment_1 ) ) ;
    public final void rule__QuestionStyle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2389:1: ( ( ( rule__QuestionStyle__StyledQuestionAssignment_1 ) ) )
            // InternalQLS.g:2390:1: ( ( rule__QuestionStyle__StyledQuestionAssignment_1 ) )
            {
            // InternalQLS.g:2390:1: ( ( rule__QuestionStyle__StyledQuestionAssignment_1 ) )
            // InternalQLS.g:2391:2: ( rule__QuestionStyle__StyledQuestionAssignment_1 )
            {
             before(grammarAccess.getQuestionStyleAccess().getStyledQuestionAssignment_1()); 
            // InternalQLS.g:2392:2: ( rule__QuestionStyle__StyledQuestionAssignment_1 )
            // InternalQLS.g:2392:3: rule__QuestionStyle__StyledQuestionAssignment_1
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
    // InternalQLS.g:2400:1: rule__QuestionStyle__Group__2 : rule__QuestionStyle__Group__2__Impl rule__QuestionStyle__Group__3 ;
    public final void rule__QuestionStyle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2404:1: ( rule__QuestionStyle__Group__2__Impl rule__QuestionStyle__Group__3 )
            // InternalQLS.g:2405:2: rule__QuestionStyle__Group__2__Impl rule__QuestionStyle__Group__3
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
    // InternalQLS.g:2412:1: rule__QuestionStyle__Group__2__Impl : ( '{' ) ;
    public final void rule__QuestionStyle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2416:1: ( ( '{' ) )
            // InternalQLS.g:2417:1: ( '{' )
            {
            // InternalQLS.g:2417:1: ( '{' )
            // InternalQLS.g:2418:2: '{'
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
    // InternalQLS.g:2427:1: rule__QuestionStyle__Group__3 : rule__QuestionStyle__Group__3__Impl rule__QuestionStyle__Group__4 ;
    public final void rule__QuestionStyle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2431:1: ( rule__QuestionStyle__Group__3__Impl rule__QuestionStyle__Group__4 )
            // InternalQLS.g:2432:2: rule__QuestionStyle__Group__3__Impl rule__QuestionStyle__Group__4
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
    // InternalQLS.g:2439:1: rule__QuestionStyle__Group__3__Impl : ( ( rule__QuestionStyle__Group_3__0 )? ) ;
    public final void rule__QuestionStyle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2443:1: ( ( ( rule__QuestionStyle__Group_3__0 )? ) )
            // InternalQLS.g:2444:1: ( ( rule__QuestionStyle__Group_3__0 )? )
            {
            // InternalQLS.g:2444:1: ( ( rule__QuestionStyle__Group_3__0 )? )
            // InternalQLS.g:2445:2: ( rule__QuestionStyle__Group_3__0 )?
            {
             before(grammarAccess.getQuestionStyleAccess().getGroup_3()); 
            // InternalQLS.g:2446:2: ( rule__QuestionStyle__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==49) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalQLS.g:2446:3: rule__QuestionStyle__Group_3__0
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
    // InternalQLS.g:2454:1: rule__QuestionStyle__Group__4 : rule__QuestionStyle__Group__4__Impl rule__QuestionStyle__Group__5 ;
    public final void rule__QuestionStyle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2458:1: ( rule__QuestionStyle__Group__4__Impl rule__QuestionStyle__Group__5 )
            // InternalQLS.g:2459:2: rule__QuestionStyle__Group__4__Impl rule__QuestionStyle__Group__5
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
    // InternalQLS.g:2466:1: rule__QuestionStyle__Group__4__Impl : ( ( rule__QuestionStyle__Group_4__0 )? ) ;
    public final void rule__QuestionStyle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2470:1: ( ( ( rule__QuestionStyle__Group_4__0 )? ) )
            // InternalQLS.g:2471:1: ( ( rule__QuestionStyle__Group_4__0 )? )
            {
            // InternalQLS.g:2471:1: ( ( rule__QuestionStyle__Group_4__0 )? )
            // InternalQLS.g:2472:2: ( rule__QuestionStyle__Group_4__0 )?
            {
             before(grammarAccess.getQuestionStyleAccess().getGroup_4()); 
            // InternalQLS.g:2473:2: ( rule__QuestionStyle__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==50) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalQLS.g:2473:3: rule__QuestionStyle__Group_4__0
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
    // InternalQLS.g:2481:1: rule__QuestionStyle__Group__5 : rule__QuestionStyle__Group__5__Impl ;
    public final void rule__QuestionStyle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2485:1: ( rule__QuestionStyle__Group__5__Impl )
            // InternalQLS.g:2486:2: rule__QuestionStyle__Group__5__Impl
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
    // InternalQLS.g:2492:1: rule__QuestionStyle__Group__5__Impl : ( '}' ) ;
    public final void rule__QuestionStyle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2496:1: ( ( '}' ) )
            // InternalQLS.g:2497:1: ( '}' )
            {
            // InternalQLS.g:2497:1: ( '}' )
            // InternalQLS.g:2498:2: '}'
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
    // InternalQLS.g:2508:1: rule__QuestionStyle__Group_3__0 : rule__QuestionStyle__Group_3__0__Impl rule__QuestionStyle__Group_3__1 ;
    public final void rule__QuestionStyle__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2512:1: ( rule__QuestionStyle__Group_3__0__Impl rule__QuestionStyle__Group_3__1 )
            // InternalQLS.g:2513:2: rule__QuestionStyle__Group_3__0__Impl rule__QuestionStyle__Group_3__1
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
    // InternalQLS.g:2520:1: rule__QuestionStyle__Group_3__0__Impl : ( 'labelStyle' ) ;
    public final void rule__QuestionStyle__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2524:1: ( ( 'labelStyle' ) )
            // InternalQLS.g:2525:1: ( 'labelStyle' )
            {
            // InternalQLS.g:2525:1: ( 'labelStyle' )
            // InternalQLS.g:2526:2: 'labelStyle'
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
    // InternalQLS.g:2535:1: rule__QuestionStyle__Group_3__1 : rule__QuestionStyle__Group_3__1__Impl ;
    public final void rule__QuestionStyle__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2539:1: ( rule__QuestionStyle__Group_3__1__Impl )
            // InternalQLS.g:2540:2: rule__QuestionStyle__Group_3__1__Impl
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
    // InternalQLS.g:2546:1: rule__QuestionStyle__Group_3__1__Impl : ( ( rule__QuestionStyle__LabelStyleAssignment_3_1 ) ) ;
    public final void rule__QuestionStyle__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2550:1: ( ( ( rule__QuestionStyle__LabelStyleAssignment_3_1 ) ) )
            // InternalQLS.g:2551:1: ( ( rule__QuestionStyle__LabelStyleAssignment_3_1 ) )
            {
            // InternalQLS.g:2551:1: ( ( rule__QuestionStyle__LabelStyleAssignment_3_1 ) )
            // InternalQLS.g:2552:2: ( rule__QuestionStyle__LabelStyleAssignment_3_1 )
            {
             before(grammarAccess.getQuestionStyleAccess().getLabelStyleAssignment_3_1()); 
            // InternalQLS.g:2553:2: ( rule__QuestionStyle__LabelStyleAssignment_3_1 )
            // InternalQLS.g:2553:3: rule__QuestionStyle__LabelStyleAssignment_3_1
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
    // InternalQLS.g:2562:1: rule__QuestionStyle__Group_4__0 : rule__QuestionStyle__Group_4__0__Impl rule__QuestionStyle__Group_4__1 ;
    public final void rule__QuestionStyle__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2566:1: ( rule__QuestionStyle__Group_4__0__Impl rule__QuestionStyle__Group_4__1 )
            // InternalQLS.g:2567:2: rule__QuestionStyle__Group_4__0__Impl rule__QuestionStyle__Group_4__1
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
    // InternalQLS.g:2574:1: rule__QuestionStyle__Group_4__0__Impl : ( 'typeStyle' ) ;
    public final void rule__QuestionStyle__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2578:1: ( ( 'typeStyle' ) )
            // InternalQLS.g:2579:1: ( 'typeStyle' )
            {
            // InternalQLS.g:2579:1: ( 'typeStyle' )
            // InternalQLS.g:2580:2: 'typeStyle'
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
    // InternalQLS.g:2589:1: rule__QuestionStyle__Group_4__1 : rule__QuestionStyle__Group_4__1__Impl ;
    public final void rule__QuestionStyle__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2593:1: ( rule__QuestionStyle__Group_4__1__Impl )
            // InternalQLS.g:2594:2: rule__QuestionStyle__Group_4__1__Impl
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
    // InternalQLS.g:2600:1: rule__QuestionStyle__Group_4__1__Impl : ( ( rule__QuestionStyle__TypeStyleAssignment_4_1 ) ) ;
    public final void rule__QuestionStyle__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2604:1: ( ( ( rule__QuestionStyle__TypeStyleAssignment_4_1 ) ) )
            // InternalQLS.g:2605:1: ( ( rule__QuestionStyle__TypeStyleAssignment_4_1 ) )
            {
            // InternalQLS.g:2605:1: ( ( rule__QuestionStyle__TypeStyleAssignment_4_1 ) )
            // InternalQLS.g:2606:2: ( rule__QuestionStyle__TypeStyleAssignment_4_1 )
            {
             before(grammarAccess.getQuestionStyleAccess().getTypeStyleAssignment_4_1()); 
            // InternalQLS.g:2607:2: ( rule__QuestionStyle__TypeStyleAssignment_4_1 )
            // InternalQLS.g:2607:3: rule__QuestionStyle__TypeStyleAssignment_4_1
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
    // InternalQLS.g:2616:1: rule__LabelStyle__Group__0 : rule__LabelStyle__Group__0__Impl rule__LabelStyle__Group__1 ;
    public final void rule__LabelStyle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2620:1: ( rule__LabelStyle__Group__0__Impl rule__LabelStyle__Group__1 )
            // InternalQLS.g:2621:2: rule__LabelStyle__Group__0__Impl rule__LabelStyle__Group__1
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
    // InternalQLS.g:2628:1: rule__LabelStyle__Group__0__Impl : ( () ) ;
    public final void rule__LabelStyle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2632:1: ( ( () ) )
            // InternalQLS.g:2633:1: ( () )
            {
            // InternalQLS.g:2633:1: ( () )
            // InternalQLS.g:2634:2: ()
            {
             before(grammarAccess.getLabelStyleAccess().getLabelStyleAction_0()); 
            // InternalQLS.g:2635:2: ()
            // InternalQLS.g:2635:3: 
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
    // InternalQLS.g:2643:1: rule__LabelStyle__Group__1 : rule__LabelStyle__Group__1__Impl rule__LabelStyle__Group__2 ;
    public final void rule__LabelStyle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2647:1: ( rule__LabelStyle__Group__1__Impl rule__LabelStyle__Group__2 )
            // InternalQLS.g:2648:2: rule__LabelStyle__Group__1__Impl rule__LabelStyle__Group__2
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
    // InternalQLS.g:2655:1: rule__LabelStyle__Group__1__Impl : ( '{' ) ;
    public final void rule__LabelStyle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2659:1: ( ( '{' ) )
            // InternalQLS.g:2660:1: ( '{' )
            {
            // InternalQLS.g:2660:1: ( '{' )
            // InternalQLS.g:2661:2: '{'
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
    // InternalQLS.g:2670:1: rule__LabelStyle__Group__2 : rule__LabelStyle__Group__2__Impl rule__LabelStyle__Group__3 ;
    public final void rule__LabelStyle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2674:1: ( rule__LabelStyle__Group__2__Impl rule__LabelStyle__Group__3 )
            // InternalQLS.g:2675:2: rule__LabelStyle__Group__2__Impl rule__LabelStyle__Group__3
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
    // InternalQLS.g:2682:1: rule__LabelStyle__Group__2__Impl : ( ( rule__LabelStyle__ItalicAssignment_2 )? ) ;
    public final void rule__LabelStyle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2686:1: ( ( ( rule__LabelStyle__ItalicAssignment_2 )? ) )
            // InternalQLS.g:2687:1: ( ( rule__LabelStyle__ItalicAssignment_2 )? )
            {
            // InternalQLS.g:2687:1: ( ( rule__LabelStyle__ItalicAssignment_2 )? )
            // InternalQLS.g:2688:2: ( rule__LabelStyle__ItalicAssignment_2 )?
            {
             before(grammarAccess.getLabelStyleAccess().getItalicAssignment_2()); 
            // InternalQLS.g:2689:2: ( rule__LabelStyle__ItalicAssignment_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==83) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalQLS.g:2689:3: rule__LabelStyle__ItalicAssignment_2
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
    // InternalQLS.g:2697:1: rule__LabelStyle__Group__3 : rule__LabelStyle__Group__3__Impl rule__LabelStyle__Group__4 ;
    public final void rule__LabelStyle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2701:1: ( rule__LabelStyle__Group__3__Impl rule__LabelStyle__Group__4 )
            // InternalQLS.g:2702:2: rule__LabelStyle__Group__3__Impl rule__LabelStyle__Group__4
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
    // InternalQLS.g:2709:1: rule__LabelStyle__Group__3__Impl : ( ( rule__LabelStyle__BoldAssignment_3 )? ) ;
    public final void rule__LabelStyle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2713:1: ( ( ( rule__LabelStyle__BoldAssignment_3 )? ) )
            // InternalQLS.g:2714:1: ( ( rule__LabelStyle__BoldAssignment_3 )? )
            {
            // InternalQLS.g:2714:1: ( ( rule__LabelStyle__BoldAssignment_3 )? )
            // InternalQLS.g:2715:2: ( rule__LabelStyle__BoldAssignment_3 )?
            {
             before(grammarAccess.getLabelStyleAccess().getBoldAssignment_3()); 
            // InternalQLS.g:2716:2: ( rule__LabelStyle__BoldAssignment_3 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==84) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalQLS.g:2716:3: rule__LabelStyle__BoldAssignment_3
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
    // InternalQLS.g:2724:1: rule__LabelStyle__Group__4 : rule__LabelStyle__Group__4__Impl ;
    public final void rule__LabelStyle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2728:1: ( rule__LabelStyle__Group__4__Impl )
            // InternalQLS.g:2729:2: rule__LabelStyle__Group__4__Impl
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
    // InternalQLS.g:2735:1: rule__LabelStyle__Group__4__Impl : ( '}' ) ;
    public final void rule__LabelStyle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2739:1: ( ( '}' ) )
            // InternalQLS.g:2740:1: ( '}' )
            {
            // InternalQLS.g:2740:1: ( '}' )
            // InternalQLS.g:2741:2: '}'
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
    // InternalQLS.g:2751:1: rule__BooleanTypeStyle__Group__0 : rule__BooleanTypeStyle__Group__0__Impl rule__BooleanTypeStyle__Group__1 ;
    public final void rule__BooleanTypeStyle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2755:1: ( rule__BooleanTypeStyle__Group__0__Impl rule__BooleanTypeStyle__Group__1 )
            // InternalQLS.g:2756:2: rule__BooleanTypeStyle__Group__0__Impl rule__BooleanTypeStyle__Group__1
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
    // InternalQLS.g:2763:1: rule__BooleanTypeStyle__Group__0__Impl : ( 'BooleanStyle' ) ;
    public final void rule__BooleanTypeStyle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2767:1: ( ( 'BooleanStyle' ) )
            // InternalQLS.g:2768:1: ( 'BooleanStyle' )
            {
            // InternalQLS.g:2768:1: ( 'BooleanStyle' )
            // InternalQLS.g:2769:2: 'BooleanStyle'
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
    // InternalQLS.g:2778:1: rule__BooleanTypeStyle__Group__1 : rule__BooleanTypeStyle__Group__1__Impl rule__BooleanTypeStyle__Group__2 ;
    public final void rule__BooleanTypeStyle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2782:1: ( rule__BooleanTypeStyle__Group__1__Impl rule__BooleanTypeStyle__Group__2 )
            // InternalQLS.g:2783:2: rule__BooleanTypeStyle__Group__1__Impl rule__BooleanTypeStyle__Group__2
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
    // InternalQLS.g:2790:1: rule__BooleanTypeStyle__Group__1__Impl : ( '{' ) ;
    public final void rule__BooleanTypeStyle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2794:1: ( ( '{' ) )
            // InternalQLS.g:2795:1: ( '{' )
            {
            // InternalQLS.g:2795:1: ( '{' )
            // InternalQLS.g:2796:2: '{'
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
    // InternalQLS.g:2805:1: rule__BooleanTypeStyle__Group__2 : rule__BooleanTypeStyle__Group__2__Impl rule__BooleanTypeStyle__Group__3 ;
    public final void rule__BooleanTypeStyle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2809:1: ( rule__BooleanTypeStyle__Group__2__Impl rule__BooleanTypeStyle__Group__3 )
            // InternalQLS.g:2810:2: rule__BooleanTypeStyle__Group__2__Impl rule__BooleanTypeStyle__Group__3
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
    // InternalQLS.g:2817:1: rule__BooleanTypeStyle__Group__2__Impl : ( ( rule__BooleanTypeStyle__BooleanStyleKindAssignment_2 ) ) ;
    public final void rule__BooleanTypeStyle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2821:1: ( ( ( rule__BooleanTypeStyle__BooleanStyleKindAssignment_2 ) ) )
            // InternalQLS.g:2822:1: ( ( rule__BooleanTypeStyle__BooleanStyleKindAssignment_2 ) )
            {
            // InternalQLS.g:2822:1: ( ( rule__BooleanTypeStyle__BooleanStyleKindAssignment_2 ) )
            // InternalQLS.g:2823:2: ( rule__BooleanTypeStyle__BooleanStyleKindAssignment_2 )
            {
             before(grammarAccess.getBooleanTypeStyleAccess().getBooleanStyleKindAssignment_2()); 
            // InternalQLS.g:2824:2: ( rule__BooleanTypeStyle__BooleanStyleKindAssignment_2 )
            // InternalQLS.g:2824:3: rule__BooleanTypeStyle__BooleanStyleKindAssignment_2
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
    // InternalQLS.g:2832:1: rule__BooleanTypeStyle__Group__3 : rule__BooleanTypeStyle__Group__3__Impl ;
    public final void rule__BooleanTypeStyle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2836:1: ( rule__BooleanTypeStyle__Group__3__Impl )
            // InternalQLS.g:2837:2: rule__BooleanTypeStyle__Group__3__Impl
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
    // InternalQLS.g:2843:1: rule__BooleanTypeStyle__Group__3__Impl : ( '}' ) ;
    public final void rule__BooleanTypeStyle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2847:1: ( ( '}' ) )
            // InternalQLS.g:2848:1: ( '}' )
            {
            // InternalQLS.g:2848:1: ( '}' )
            // InternalQLS.g:2849:2: '}'
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
    // InternalQLS.g:2859:1: rule__NumericTypeTextFieldStyle__Group__0 : rule__NumericTypeTextFieldStyle__Group__0__Impl rule__NumericTypeTextFieldStyle__Group__1 ;
    public final void rule__NumericTypeTextFieldStyle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2863:1: ( rule__NumericTypeTextFieldStyle__Group__0__Impl rule__NumericTypeTextFieldStyle__Group__1 )
            // InternalQLS.g:2864:2: rule__NumericTypeTextFieldStyle__Group__0__Impl rule__NumericTypeTextFieldStyle__Group__1
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
    // InternalQLS.g:2871:1: rule__NumericTypeTextFieldStyle__Group__0__Impl : ( () ) ;
    public final void rule__NumericTypeTextFieldStyle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2875:1: ( ( () ) )
            // InternalQLS.g:2876:1: ( () )
            {
            // InternalQLS.g:2876:1: ( () )
            // InternalQLS.g:2877:2: ()
            {
             before(grammarAccess.getNumericTypeTextFieldStyleAccess().getNumericTypeTextFieldStyleAction_0()); 
            // InternalQLS.g:2878:2: ()
            // InternalQLS.g:2878:3: 
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
    // InternalQLS.g:2886:1: rule__NumericTypeTextFieldStyle__Group__1 : rule__NumericTypeTextFieldStyle__Group__1__Impl rule__NumericTypeTextFieldStyle__Group__2 ;
    public final void rule__NumericTypeTextFieldStyle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2890:1: ( rule__NumericTypeTextFieldStyle__Group__1__Impl rule__NumericTypeTextFieldStyle__Group__2 )
            // InternalQLS.g:2891:2: rule__NumericTypeTextFieldStyle__Group__1__Impl rule__NumericTypeTextFieldStyle__Group__2
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
    // InternalQLS.g:2898:1: rule__NumericTypeTextFieldStyle__Group__1__Impl : ( 'NumericStyle' ) ;
    public final void rule__NumericTypeTextFieldStyle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2902:1: ( ( 'NumericStyle' ) )
            // InternalQLS.g:2903:1: ( 'NumericStyle' )
            {
            // InternalQLS.g:2903:1: ( 'NumericStyle' )
            // InternalQLS.g:2904:2: 'NumericStyle'
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
    // InternalQLS.g:2913:1: rule__NumericTypeTextFieldStyle__Group__2 : rule__NumericTypeTextFieldStyle__Group__2__Impl rule__NumericTypeTextFieldStyle__Group__3 ;
    public final void rule__NumericTypeTextFieldStyle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2917:1: ( rule__NumericTypeTextFieldStyle__Group__2__Impl rule__NumericTypeTextFieldStyle__Group__3 )
            // InternalQLS.g:2918:2: rule__NumericTypeTextFieldStyle__Group__2__Impl rule__NumericTypeTextFieldStyle__Group__3
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
    // InternalQLS.g:2925:1: rule__NumericTypeTextFieldStyle__Group__2__Impl : ( 'textField' ) ;
    public final void rule__NumericTypeTextFieldStyle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2929:1: ( ( 'textField' ) )
            // InternalQLS.g:2930:1: ( 'textField' )
            {
            // InternalQLS.g:2930:1: ( 'textField' )
            // InternalQLS.g:2931:2: 'textField'
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
    // InternalQLS.g:2940:1: rule__NumericTypeTextFieldStyle__Group__3 : rule__NumericTypeTextFieldStyle__Group__3__Impl rule__NumericTypeTextFieldStyle__Group__4 ;
    public final void rule__NumericTypeTextFieldStyle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2944:1: ( rule__NumericTypeTextFieldStyle__Group__3__Impl rule__NumericTypeTextFieldStyle__Group__4 )
            // InternalQLS.g:2945:2: rule__NumericTypeTextFieldStyle__Group__3__Impl rule__NumericTypeTextFieldStyle__Group__4
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
    // InternalQLS.g:2952:1: rule__NumericTypeTextFieldStyle__Group__3__Impl : ( '{' ) ;
    public final void rule__NumericTypeTextFieldStyle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2956:1: ( ( '{' ) )
            // InternalQLS.g:2957:1: ( '{' )
            {
            // InternalQLS.g:2957:1: ( '{' )
            // InternalQLS.g:2958:2: '{'
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
    // InternalQLS.g:2967:1: rule__NumericTypeTextFieldStyle__Group__4 : rule__NumericTypeTextFieldStyle__Group__4__Impl rule__NumericTypeTextFieldStyle__Group__5 ;
    public final void rule__NumericTypeTextFieldStyle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2971:1: ( rule__NumericTypeTextFieldStyle__Group__4__Impl rule__NumericTypeTextFieldStyle__Group__5 )
            // InternalQLS.g:2972:2: rule__NumericTypeTextFieldStyle__Group__4__Impl rule__NumericTypeTextFieldStyle__Group__5
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
    // InternalQLS.g:2979:1: rule__NumericTypeTextFieldStyle__Group__4__Impl : ( ( rule__NumericTypeTextFieldStyle__Group_4__0 )? ) ;
    public final void rule__NumericTypeTextFieldStyle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2983:1: ( ( ( rule__NumericTypeTextFieldStyle__Group_4__0 )? ) )
            // InternalQLS.g:2984:1: ( ( rule__NumericTypeTextFieldStyle__Group_4__0 )? )
            {
            // InternalQLS.g:2984:1: ( ( rule__NumericTypeTextFieldStyle__Group_4__0 )? )
            // InternalQLS.g:2985:2: ( rule__NumericTypeTextFieldStyle__Group_4__0 )?
            {
             before(grammarAccess.getNumericTypeTextFieldStyleAccess().getGroup_4()); 
            // InternalQLS.g:2986:2: ( rule__NumericTypeTextFieldStyle__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==54) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalQLS.g:2986:3: rule__NumericTypeTextFieldStyle__Group_4__0
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
    // InternalQLS.g:2994:1: rule__NumericTypeTextFieldStyle__Group__5 : rule__NumericTypeTextFieldStyle__Group__5__Impl ;
    public final void rule__NumericTypeTextFieldStyle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2998:1: ( rule__NumericTypeTextFieldStyle__Group__5__Impl )
            // InternalQLS.g:2999:2: rule__NumericTypeTextFieldStyle__Group__5__Impl
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
    // InternalQLS.g:3005:1: rule__NumericTypeTextFieldStyle__Group__5__Impl : ( '}' ) ;
    public final void rule__NumericTypeTextFieldStyle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3009:1: ( ( '}' ) )
            // InternalQLS.g:3010:1: ( '}' )
            {
            // InternalQLS.g:3010:1: ( '}' )
            // InternalQLS.g:3011:2: '}'
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
    // InternalQLS.g:3021:1: rule__NumericTypeTextFieldStyle__Group_4__0 : rule__NumericTypeTextFieldStyle__Group_4__0__Impl rule__NumericTypeTextFieldStyle__Group_4__1 ;
    public final void rule__NumericTypeTextFieldStyle__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3025:1: ( rule__NumericTypeTextFieldStyle__Group_4__0__Impl rule__NumericTypeTextFieldStyle__Group_4__1 )
            // InternalQLS.g:3026:2: rule__NumericTypeTextFieldStyle__Group_4__0__Impl rule__NumericTypeTextFieldStyle__Group_4__1
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
    // InternalQLS.g:3033:1: rule__NumericTypeTextFieldStyle__Group_4__0__Impl : ( 'step' ) ;
    public final void rule__NumericTypeTextFieldStyle__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3037:1: ( ( 'step' ) )
            // InternalQLS.g:3038:1: ( 'step' )
            {
            // InternalQLS.g:3038:1: ( 'step' )
            // InternalQLS.g:3039:2: 'step'
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
    // InternalQLS.g:3048:1: rule__NumericTypeTextFieldStyle__Group_4__1 : rule__NumericTypeTextFieldStyle__Group_4__1__Impl ;
    public final void rule__NumericTypeTextFieldStyle__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3052:1: ( rule__NumericTypeTextFieldStyle__Group_4__1__Impl )
            // InternalQLS.g:3053:2: rule__NumericTypeTextFieldStyle__Group_4__1__Impl
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
    // InternalQLS.g:3059:1: rule__NumericTypeTextFieldStyle__Group_4__1__Impl : ( ( rule__NumericTypeTextFieldStyle__StepAssignment_4_1 ) ) ;
    public final void rule__NumericTypeTextFieldStyle__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3063:1: ( ( ( rule__NumericTypeTextFieldStyle__StepAssignment_4_1 ) ) )
            // InternalQLS.g:3064:1: ( ( rule__NumericTypeTextFieldStyle__StepAssignment_4_1 ) )
            {
            // InternalQLS.g:3064:1: ( ( rule__NumericTypeTextFieldStyle__StepAssignment_4_1 ) )
            // InternalQLS.g:3065:2: ( rule__NumericTypeTextFieldStyle__StepAssignment_4_1 )
            {
             before(grammarAccess.getNumericTypeTextFieldStyleAccess().getStepAssignment_4_1()); 
            // InternalQLS.g:3066:2: ( rule__NumericTypeTextFieldStyle__StepAssignment_4_1 )
            // InternalQLS.g:3066:3: rule__NumericTypeTextFieldStyle__StepAssignment_4_1
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
    // InternalQLS.g:3075:1: rule__NumericTypeSpinnerStyle__Group__0 : rule__NumericTypeSpinnerStyle__Group__0__Impl rule__NumericTypeSpinnerStyle__Group__1 ;
    public final void rule__NumericTypeSpinnerStyle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3079:1: ( rule__NumericTypeSpinnerStyle__Group__0__Impl rule__NumericTypeSpinnerStyle__Group__1 )
            // InternalQLS.g:3080:2: rule__NumericTypeSpinnerStyle__Group__0__Impl rule__NumericTypeSpinnerStyle__Group__1
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
    // InternalQLS.g:3087:1: rule__NumericTypeSpinnerStyle__Group__0__Impl : ( () ) ;
    public final void rule__NumericTypeSpinnerStyle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3091:1: ( ( () ) )
            // InternalQLS.g:3092:1: ( () )
            {
            // InternalQLS.g:3092:1: ( () )
            // InternalQLS.g:3093:2: ()
            {
             before(grammarAccess.getNumericTypeSpinnerStyleAccess().getNumericSpinnerStyleAction_0()); 
            // InternalQLS.g:3094:2: ()
            // InternalQLS.g:3094:3: 
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
    // InternalQLS.g:3102:1: rule__NumericTypeSpinnerStyle__Group__1 : rule__NumericTypeSpinnerStyle__Group__1__Impl rule__NumericTypeSpinnerStyle__Group__2 ;
    public final void rule__NumericTypeSpinnerStyle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3106:1: ( rule__NumericTypeSpinnerStyle__Group__1__Impl rule__NumericTypeSpinnerStyle__Group__2 )
            // InternalQLS.g:3107:2: rule__NumericTypeSpinnerStyle__Group__1__Impl rule__NumericTypeSpinnerStyle__Group__2
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
    // InternalQLS.g:3114:1: rule__NumericTypeSpinnerStyle__Group__1__Impl : ( 'NumericStyle' ) ;
    public final void rule__NumericTypeSpinnerStyle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3118:1: ( ( 'NumericStyle' ) )
            // InternalQLS.g:3119:1: ( 'NumericStyle' )
            {
            // InternalQLS.g:3119:1: ( 'NumericStyle' )
            // InternalQLS.g:3120:2: 'NumericStyle'
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
    // InternalQLS.g:3129:1: rule__NumericTypeSpinnerStyle__Group__2 : rule__NumericTypeSpinnerStyle__Group__2__Impl rule__NumericTypeSpinnerStyle__Group__3 ;
    public final void rule__NumericTypeSpinnerStyle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3133:1: ( rule__NumericTypeSpinnerStyle__Group__2__Impl rule__NumericTypeSpinnerStyle__Group__3 )
            // InternalQLS.g:3134:2: rule__NumericTypeSpinnerStyle__Group__2__Impl rule__NumericTypeSpinnerStyle__Group__3
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
    // InternalQLS.g:3141:1: rule__NumericTypeSpinnerStyle__Group__2__Impl : ( 'spinner' ) ;
    public final void rule__NumericTypeSpinnerStyle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3145:1: ( ( 'spinner' ) )
            // InternalQLS.g:3146:1: ( 'spinner' )
            {
            // InternalQLS.g:3146:1: ( 'spinner' )
            // InternalQLS.g:3147:2: 'spinner'
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
    // InternalQLS.g:3156:1: rule__NumericTypeSpinnerStyle__Group__3 : rule__NumericTypeSpinnerStyle__Group__3__Impl rule__NumericTypeSpinnerStyle__Group__4 ;
    public final void rule__NumericTypeSpinnerStyle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3160:1: ( rule__NumericTypeSpinnerStyle__Group__3__Impl rule__NumericTypeSpinnerStyle__Group__4 )
            // InternalQLS.g:3161:2: rule__NumericTypeSpinnerStyle__Group__3__Impl rule__NumericTypeSpinnerStyle__Group__4
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
    // InternalQLS.g:3168:1: rule__NumericTypeSpinnerStyle__Group__3__Impl : ( '{' ) ;
    public final void rule__NumericTypeSpinnerStyle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3172:1: ( ( '{' ) )
            // InternalQLS.g:3173:1: ( '{' )
            {
            // InternalQLS.g:3173:1: ( '{' )
            // InternalQLS.g:3174:2: '{'
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
    // InternalQLS.g:3183:1: rule__NumericTypeSpinnerStyle__Group__4 : rule__NumericTypeSpinnerStyle__Group__4__Impl ;
    public final void rule__NumericTypeSpinnerStyle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3187:1: ( rule__NumericTypeSpinnerStyle__Group__4__Impl )
            // InternalQLS.g:3188:2: rule__NumericTypeSpinnerStyle__Group__4__Impl
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
    // InternalQLS.g:3194:1: rule__NumericTypeSpinnerStyle__Group__4__Impl : ( '}' ) ;
    public final void rule__NumericTypeSpinnerStyle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3198:1: ( ( '}' ) )
            // InternalQLS.g:3199:1: ( '}' )
            {
            // InternalQLS.g:3199:1: ( '}' )
            // InternalQLS.g:3200:2: '}'
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
    // InternalQLS.g:3210:1: rule__TextTypeStyle__Group__0 : rule__TextTypeStyle__Group__0__Impl rule__TextTypeStyle__Group__1 ;
    public final void rule__TextTypeStyle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3214:1: ( rule__TextTypeStyle__Group__0__Impl rule__TextTypeStyle__Group__1 )
            // InternalQLS.g:3215:2: rule__TextTypeStyle__Group__0__Impl rule__TextTypeStyle__Group__1
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
    // InternalQLS.g:3222:1: rule__TextTypeStyle__Group__0__Impl : ( () ) ;
    public final void rule__TextTypeStyle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3226:1: ( ( () ) )
            // InternalQLS.g:3227:1: ( () )
            {
            // InternalQLS.g:3227:1: ( () )
            // InternalQLS.g:3228:2: ()
            {
             before(grammarAccess.getTextTypeStyleAccess().getTextTypeStyleAction_0()); 
            // InternalQLS.g:3229:2: ()
            // InternalQLS.g:3229:3: 
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
    // InternalQLS.g:3237:1: rule__TextTypeStyle__Group__1 : rule__TextTypeStyle__Group__1__Impl rule__TextTypeStyle__Group__2 ;
    public final void rule__TextTypeStyle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3241:1: ( rule__TextTypeStyle__Group__1__Impl rule__TextTypeStyle__Group__2 )
            // InternalQLS.g:3242:2: rule__TextTypeStyle__Group__1__Impl rule__TextTypeStyle__Group__2
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
    // InternalQLS.g:3249:1: rule__TextTypeStyle__Group__1__Impl : ( 'TextStyle' ) ;
    public final void rule__TextTypeStyle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3253:1: ( ( 'TextStyle' ) )
            // InternalQLS.g:3254:1: ( 'TextStyle' )
            {
            // InternalQLS.g:3254:1: ( 'TextStyle' )
            // InternalQLS.g:3255:2: 'TextStyle'
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
    // InternalQLS.g:3264:1: rule__TextTypeStyle__Group__2 : rule__TextTypeStyle__Group__2__Impl rule__TextTypeStyle__Group__3 ;
    public final void rule__TextTypeStyle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3268:1: ( rule__TextTypeStyle__Group__2__Impl rule__TextTypeStyle__Group__3 )
            // InternalQLS.g:3269:2: rule__TextTypeStyle__Group__2__Impl rule__TextTypeStyle__Group__3
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
    // InternalQLS.g:3276:1: rule__TextTypeStyle__Group__2__Impl : ( '{' ) ;
    public final void rule__TextTypeStyle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3280:1: ( ( '{' ) )
            // InternalQLS.g:3281:1: ( '{' )
            {
            // InternalQLS.g:3281:1: ( '{' )
            // InternalQLS.g:3282:2: '{'
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
    // InternalQLS.g:3291:1: rule__TextTypeStyle__Group__3 : rule__TextTypeStyle__Group__3__Impl rule__TextTypeStyle__Group__4 ;
    public final void rule__TextTypeStyle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3295:1: ( rule__TextTypeStyle__Group__3__Impl rule__TextTypeStyle__Group__4 )
            // InternalQLS.g:3296:2: rule__TextTypeStyle__Group__3__Impl rule__TextTypeStyle__Group__4
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
    // InternalQLS.g:3303:1: rule__TextTypeStyle__Group__3__Impl : ( ( rule__TextTypeStyle__MultilineAssignment_3 )? ) ;
    public final void rule__TextTypeStyle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3307:1: ( ( ( rule__TextTypeStyle__MultilineAssignment_3 )? ) )
            // InternalQLS.g:3308:1: ( ( rule__TextTypeStyle__MultilineAssignment_3 )? )
            {
            // InternalQLS.g:3308:1: ( ( rule__TextTypeStyle__MultilineAssignment_3 )? )
            // InternalQLS.g:3309:2: ( rule__TextTypeStyle__MultilineAssignment_3 )?
            {
             before(grammarAccess.getTextTypeStyleAccess().getMultilineAssignment_3()); 
            // InternalQLS.g:3310:2: ( rule__TextTypeStyle__MultilineAssignment_3 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==85) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalQLS.g:3310:3: rule__TextTypeStyle__MultilineAssignment_3
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
    // InternalQLS.g:3318:1: rule__TextTypeStyle__Group__4 : rule__TextTypeStyle__Group__4__Impl ;
    public final void rule__TextTypeStyle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3322:1: ( rule__TextTypeStyle__Group__4__Impl )
            // InternalQLS.g:3323:2: rule__TextTypeStyle__Group__4__Impl
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
    // InternalQLS.g:3329:1: rule__TextTypeStyle__Group__4__Impl : ( '}' ) ;
    public final void rule__TextTypeStyle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3333:1: ( ( '}' ) )
            // InternalQLS.g:3334:1: ( '}' )
            {
            // InternalQLS.g:3334:1: ( '}' )
            // InternalQLS.g:3335:2: '}'
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
    // InternalQLS.g:3345:1: rule__UnaryExpression__Group__0 : rule__UnaryExpression__Group__0__Impl rule__UnaryExpression__Group__1 ;
    public final void rule__UnaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3349:1: ( rule__UnaryExpression__Group__0__Impl rule__UnaryExpression__Group__1 )
            // InternalQLS.g:3350:2: rule__UnaryExpression__Group__0__Impl rule__UnaryExpression__Group__1
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
    // InternalQLS.g:3357:1: rule__UnaryExpression__Group__0__Impl : ( () ) ;
    public final void rule__UnaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3361:1: ( ( () ) )
            // InternalQLS.g:3362:1: ( () )
            {
            // InternalQLS.g:3362:1: ( () )
            // InternalQLS.g:3363:2: ()
            {
             before(grammarAccess.getUnaryExpressionAccess().getBasicUnaryExpressionAction_0()); 
            // InternalQLS.g:3364:2: ()
            // InternalQLS.g:3364:3: 
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
    // InternalQLS.g:3372:1: rule__UnaryExpression__Group__1 : rule__UnaryExpression__Group__1__Impl rule__UnaryExpression__Group__2 ;
    public final void rule__UnaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3376:1: ( rule__UnaryExpression__Group__1__Impl rule__UnaryExpression__Group__2 )
            // InternalQLS.g:3377:2: rule__UnaryExpression__Group__1__Impl rule__UnaryExpression__Group__2
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
    // InternalQLS.g:3384:1: rule__UnaryExpression__Group__1__Impl : ( ( rule__UnaryExpression__OperatorAssignment_1 ) ) ;
    public final void rule__UnaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3388:1: ( ( ( rule__UnaryExpression__OperatorAssignment_1 ) ) )
            // InternalQLS.g:3389:1: ( ( rule__UnaryExpression__OperatorAssignment_1 ) )
            {
            // InternalQLS.g:3389:1: ( ( rule__UnaryExpression__OperatorAssignment_1 ) )
            // InternalQLS.g:3390:2: ( rule__UnaryExpression__OperatorAssignment_1 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getOperatorAssignment_1()); 
            // InternalQLS.g:3391:2: ( rule__UnaryExpression__OperatorAssignment_1 )
            // InternalQLS.g:3391:3: rule__UnaryExpression__OperatorAssignment_1
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
    // InternalQLS.g:3399:1: rule__UnaryExpression__Group__2 : rule__UnaryExpression__Group__2__Impl ;
    public final void rule__UnaryExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3403:1: ( rule__UnaryExpression__Group__2__Impl )
            // InternalQLS.g:3404:2: rule__UnaryExpression__Group__2__Impl
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
    // InternalQLS.g:3410:1: rule__UnaryExpression__Group__2__Impl : ( ( rule__UnaryExpression__OperandAssignment_2 ) ) ;
    public final void rule__UnaryExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3414:1: ( ( ( rule__UnaryExpression__OperandAssignment_2 ) ) )
            // InternalQLS.g:3415:1: ( ( rule__UnaryExpression__OperandAssignment_2 ) )
            {
            // InternalQLS.g:3415:1: ( ( rule__UnaryExpression__OperandAssignment_2 ) )
            // InternalQLS.g:3416:2: ( rule__UnaryExpression__OperandAssignment_2 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getOperandAssignment_2()); 
            // InternalQLS.g:3417:2: ( rule__UnaryExpression__OperandAssignment_2 )
            // InternalQLS.g:3417:3: rule__UnaryExpression__OperandAssignment_2
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
    // InternalQLS.g:3426:1: rule__PrimaryExpression__Group_2__0 : rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 ;
    public final void rule__PrimaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3430:1: ( rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 )
            // InternalQLS.g:3431:2: rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1
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
    // InternalQLS.g:3438:1: rule__PrimaryExpression__Group_2__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3442:1: ( ( '(' ) )
            // InternalQLS.g:3443:1: ( '(' )
            {
            // InternalQLS.g:3443:1: ( '(' )
            // InternalQLS.g:3444:2: '('
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
    // InternalQLS.g:3453:1: rule__PrimaryExpression__Group_2__1 : rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2 ;
    public final void rule__PrimaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3457:1: ( rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2 )
            // InternalQLS.g:3458:2: rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2
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
    // InternalQLS.g:3465:1: rule__PrimaryExpression__Group_2__1__Impl : ( ( rule__PrimaryExpression__Alternatives_2_1 ) ) ;
    public final void rule__PrimaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3469:1: ( ( ( rule__PrimaryExpression__Alternatives_2_1 ) ) )
            // InternalQLS.g:3470:1: ( ( rule__PrimaryExpression__Alternatives_2_1 ) )
            {
            // InternalQLS.g:3470:1: ( ( rule__PrimaryExpression__Alternatives_2_1 ) )
            // InternalQLS.g:3471:2: ( rule__PrimaryExpression__Alternatives_2_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives_2_1()); 
            // InternalQLS.g:3472:2: ( rule__PrimaryExpression__Alternatives_2_1 )
            // InternalQLS.g:3472:3: rule__PrimaryExpression__Alternatives_2_1
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
    // InternalQLS.g:3480:1: rule__PrimaryExpression__Group_2__2 : rule__PrimaryExpression__Group_2__2__Impl ;
    public final void rule__PrimaryExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3484:1: ( rule__PrimaryExpression__Group_2__2__Impl )
            // InternalQLS.g:3485:2: rule__PrimaryExpression__Group_2__2__Impl
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
    // InternalQLS.g:3491:1: rule__PrimaryExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3495:1: ( ( ')' ) )
            // InternalQLS.g:3496:1: ( ')' )
            {
            // InternalQLS.g:3496:1: ( ')' )
            // InternalQLS.g:3497:2: ')'
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
    // InternalQLS.g:3507:1: rule__IfExpression__Group__0 : rule__IfExpression__Group__0__Impl rule__IfExpression__Group__1 ;
    public final void rule__IfExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3511:1: ( rule__IfExpression__Group__0__Impl rule__IfExpression__Group__1 )
            // InternalQLS.g:3512:2: rule__IfExpression__Group__0__Impl rule__IfExpression__Group__1
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
    // InternalQLS.g:3519:1: rule__IfExpression__Group__0__Impl : ( () ) ;
    public final void rule__IfExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3523:1: ( ( () ) )
            // InternalQLS.g:3524:1: ( () )
            {
            // InternalQLS.g:3524:1: ( () )
            // InternalQLS.g:3525:2: ()
            {
             before(grammarAccess.getIfExpressionAccess().getIfExpressionAction_0()); 
            // InternalQLS.g:3526:2: ()
            // InternalQLS.g:3526:3: 
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
    // InternalQLS.g:3534:1: rule__IfExpression__Group__1 : rule__IfExpression__Group__1__Impl rule__IfExpression__Group__2 ;
    public final void rule__IfExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3538:1: ( rule__IfExpression__Group__1__Impl rule__IfExpression__Group__2 )
            // InternalQLS.g:3539:2: rule__IfExpression__Group__1__Impl rule__IfExpression__Group__2
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
    // InternalQLS.g:3546:1: rule__IfExpression__Group__1__Impl : ( 'if' ) ;
    public final void rule__IfExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3550:1: ( ( 'if' ) )
            // InternalQLS.g:3551:1: ( 'if' )
            {
            // InternalQLS.g:3551:1: ( 'if' )
            // InternalQLS.g:3552:2: 'if'
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
    // InternalQLS.g:3561:1: rule__IfExpression__Group__2 : rule__IfExpression__Group__2__Impl rule__IfExpression__Group__3 ;
    public final void rule__IfExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3565:1: ( rule__IfExpression__Group__2__Impl rule__IfExpression__Group__3 )
            // InternalQLS.g:3566:2: rule__IfExpression__Group__2__Impl rule__IfExpression__Group__3
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
    // InternalQLS.g:3573:1: rule__IfExpression__Group__2__Impl : ( ( rule__IfExpression__ConditionAssignment_2 ) ) ;
    public final void rule__IfExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3577:1: ( ( ( rule__IfExpression__ConditionAssignment_2 ) ) )
            // InternalQLS.g:3578:1: ( ( rule__IfExpression__ConditionAssignment_2 ) )
            {
            // InternalQLS.g:3578:1: ( ( rule__IfExpression__ConditionAssignment_2 ) )
            // InternalQLS.g:3579:2: ( rule__IfExpression__ConditionAssignment_2 )
            {
             before(grammarAccess.getIfExpressionAccess().getConditionAssignment_2()); 
            // InternalQLS.g:3580:2: ( rule__IfExpression__ConditionAssignment_2 )
            // InternalQLS.g:3580:3: rule__IfExpression__ConditionAssignment_2
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
    // InternalQLS.g:3588:1: rule__IfExpression__Group__3 : rule__IfExpression__Group__3__Impl rule__IfExpression__Group__4 ;
    public final void rule__IfExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3592:1: ( rule__IfExpression__Group__3__Impl rule__IfExpression__Group__4 )
            // InternalQLS.g:3593:2: rule__IfExpression__Group__3__Impl rule__IfExpression__Group__4
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
    // InternalQLS.g:3600:1: rule__IfExpression__Group__3__Impl : ( 'then' ) ;
    public final void rule__IfExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3604:1: ( ( 'then' ) )
            // InternalQLS.g:3605:1: ( 'then' )
            {
            // InternalQLS.g:3605:1: ( 'then' )
            // InternalQLS.g:3606:2: 'then'
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
    // InternalQLS.g:3615:1: rule__IfExpression__Group__4 : rule__IfExpression__Group__4__Impl rule__IfExpression__Group__5 ;
    public final void rule__IfExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3619:1: ( rule__IfExpression__Group__4__Impl rule__IfExpression__Group__5 )
            // InternalQLS.g:3620:2: rule__IfExpression__Group__4__Impl rule__IfExpression__Group__5
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
    // InternalQLS.g:3627:1: rule__IfExpression__Group__4__Impl : ( ( rule__IfExpression__ThenExpressionAssignment_4 ) ) ;
    public final void rule__IfExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3631:1: ( ( ( rule__IfExpression__ThenExpressionAssignment_4 ) ) )
            // InternalQLS.g:3632:1: ( ( rule__IfExpression__ThenExpressionAssignment_4 ) )
            {
            // InternalQLS.g:3632:1: ( ( rule__IfExpression__ThenExpressionAssignment_4 ) )
            // InternalQLS.g:3633:2: ( rule__IfExpression__ThenExpressionAssignment_4 )
            {
             before(grammarAccess.getIfExpressionAccess().getThenExpressionAssignment_4()); 
            // InternalQLS.g:3634:2: ( rule__IfExpression__ThenExpressionAssignment_4 )
            // InternalQLS.g:3634:3: rule__IfExpression__ThenExpressionAssignment_4
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
    // InternalQLS.g:3642:1: rule__IfExpression__Group__5 : rule__IfExpression__Group__5__Impl rule__IfExpression__Group__6 ;
    public final void rule__IfExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3646:1: ( rule__IfExpression__Group__5__Impl rule__IfExpression__Group__6 )
            // InternalQLS.g:3647:2: rule__IfExpression__Group__5__Impl rule__IfExpression__Group__6
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
    // InternalQLS.g:3654:1: rule__IfExpression__Group__5__Impl : ( ( rule__IfExpression__Group_5__0 )? ) ;
    public final void rule__IfExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3658:1: ( ( ( rule__IfExpression__Group_5__0 )? ) )
            // InternalQLS.g:3659:1: ( ( rule__IfExpression__Group_5__0 )? )
            {
            // InternalQLS.g:3659:1: ( ( rule__IfExpression__Group_5__0 )? )
            // InternalQLS.g:3660:2: ( rule__IfExpression__Group_5__0 )?
            {
             before(grammarAccess.getIfExpressionAccess().getGroup_5()); 
            // InternalQLS.g:3661:2: ( rule__IfExpression__Group_5__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==62) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalQLS.g:3661:3: rule__IfExpression__Group_5__0
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
    // InternalQLS.g:3669:1: rule__IfExpression__Group__6 : rule__IfExpression__Group__6__Impl ;
    public final void rule__IfExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3673:1: ( rule__IfExpression__Group__6__Impl )
            // InternalQLS.g:3674:2: rule__IfExpression__Group__6__Impl
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
    // InternalQLS.g:3680:1: rule__IfExpression__Group__6__Impl : ( 'endif' ) ;
    public final void rule__IfExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3684:1: ( ( 'endif' ) )
            // InternalQLS.g:3685:1: ( 'endif' )
            {
            // InternalQLS.g:3685:1: ( 'endif' )
            // InternalQLS.g:3686:2: 'endif'
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
    // InternalQLS.g:3696:1: rule__IfExpression__Group_5__0 : rule__IfExpression__Group_5__0__Impl rule__IfExpression__Group_5__1 ;
    public final void rule__IfExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3700:1: ( rule__IfExpression__Group_5__0__Impl rule__IfExpression__Group_5__1 )
            // InternalQLS.g:3701:2: rule__IfExpression__Group_5__0__Impl rule__IfExpression__Group_5__1
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
    // InternalQLS.g:3708:1: rule__IfExpression__Group_5__0__Impl : ( 'else' ) ;
    public final void rule__IfExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3712:1: ( ( 'else' ) )
            // InternalQLS.g:3713:1: ( 'else' )
            {
            // InternalQLS.g:3713:1: ( 'else' )
            // InternalQLS.g:3714:2: 'else'
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
    // InternalQLS.g:3723:1: rule__IfExpression__Group_5__1 : rule__IfExpression__Group_5__1__Impl ;
    public final void rule__IfExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3727:1: ( rule__IfExpression__Group_5__1__Impl )
            // InternalQLS.g:3728:2: rule__IfExpression__Group_5__1__Impl
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
    // InternalQLS.g:3734:1: rule__IfExpression__Group_5__1__Impl : ( ( rule__IfExpression__ElseExpressionAssignment_5_1 ) ) ;
    public final void rule__IfExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3738:1: ( ( ( rule__IfExpression__ElseExpressionAssignment_5_1 ) ) )
            // InternalQLS.g:3739:1: ( ( rule__IfExpression__ElseExpressionAssignment_5_1 ) )
            {
            // InternalQLS.g:3739:1: ( ( rule__IfExpression__ElseExpressionAssignment_5_1 ) )
            // InternalQLS.g:3740:2: ( rule__IfExpression__ElseExpressionAssignment_5_1 )
            {
             before(grammarAccess.getIfExpressionAccess().getElseExpressionAssignment_5_1()); 
            // InternalQLS.g:3741:2: ( rule__IfExpression__ElseExpressionAssignment_5_1 )
            // InternalQLS.g:3741:3: rule__IfExpression__ElseExpressionAssignment_5_1
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
    // InternalQLS.g:3750:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3754:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // InternalQLS.g:3755:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
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
    // InternalQLS.g:3762:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3766:1: ( ( ruleAndExpression ) )
            // InternalQLS.g:3767:1: ( ruleAndExpression )
            {
            // InternalQLS.g:3767:1: ( ruleAndExpression )
            // InternalQLS.g:3768:2: ruleAndExpression
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
    // InternalQLS.g:3777:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3781:1: ( rule__OrExpression__Group__1__Impl )
            // InternalQLS.g:3782:2: rule__OrExpression__Group__1__Impl
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
    // InternalQLS.g:3788:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3792:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // InternalQLS.g:3793:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // InternalQLS.g:3793:1: ( ( rule__OrExpression__Group_1__0 )* )
            // InternalQLS.g:3794:2: ( rule__OrExpression__Group_1__0 )*
            {
             before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            // InternalQLS.g:3795:2: ( rule__OrExpression__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==14) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalQLS.g:3795:3: rule__OrExpression__Group_1__0
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
    // InternalQLS.g:3804:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3808:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // InternalQLS.g:3809:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
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
    // InternalQLS.g:3816:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3820:1: ( ( () ) )
            // InternalQLS.g:3821:1: ( () )
            {
            // InternalQLS.g:3821:1: ( () )
            // InternalQLS.g:3822:2: ()
            {
             before(grammarAccess.getOrExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0()); 
            // InternalQLS.g:3823:2: ()
            // InternalQLS.g:3823:3: 
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
    // InternalQLS.g:3831:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3835:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // InternalQLS.g:3836:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
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
    // InternalQLS.g:3843:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3847:1: ( ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) )
            // InternalQLS.g:3848:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            {
            // InternalQLS.g:3848:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            // InternalQLS.g:3849:2: ( rule__OrExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalQLS.g:3850:2: ( rule__OrExpression__OperatorAssignment_1_1 )
            // InternalQLS.g:3850:3: rule__OrExpression__OperatorAssignment_1_1
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
    // InternalQLS.g:3858:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3862:1: ( rule__OrExpression__Group_1__2__Impl )
            // InternalQLS.g:3863:2: rule__OrExpression__Group_1__2__Impl
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
    // InternalQLS.g:3869:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__RhsOperandAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3873:1: ( ( ( rule__OrExpression__RhsOperandAssignment_1_2 ) ) )
            // InternalQLS.g:3874:1: ( ( rule__OrExpression__RhsOperandAssignment_1_2 ) )
            {
            // InternalQLS.g:3874:1: ( ( rule__OrExpression__RhsOperandAssignment_1_2 ) )
            // InternalQLS.g:3875:2: ( rule__OrExpression__RhsOperandAssignment_1_2 )
            {
             before(grammarAccess.getOrExpressionAccess().getRhsOperandAssignment_1_2()); 
            // InternalQLS.g:3876:2: ( rule__OrExpression__RhsOperandAssignment_1_2 )
            // InternalQLS.g:3876:3: rule__OrExpression__RhsOperandAssignment_1_2
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
    // InternalQLS.g:3885:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3889:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalQLS.g:3890:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
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
    // InternalQLS.g:3897:1: rule__AndExpression__Group__0__Impl : ( ruleEqualExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3901:1: ( ( ruleEqualExpression ) )
            // InternalQLS.g:3902:1: ( ruleEqualExpression )
            {
            // InternalQLS.g:3902:1: ( ruleEqualExpression )
            // InternalQLS.g:3903:2: ruleEqualExpression
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
    // InternalQLS.g:3912:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3916:1: ( rule__AndExpression__Group__1__Impl )
            // InternalQLS.g:3917:2: rule__AndExpression__Group__1__Impl
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
    // InternalQLS.g:3923:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3927:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalQLS.g:3928:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalQLS.g:3928:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalQLS.g:3929:2: ( rule__AndExpression__Group_1__0 )*
            {
             before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            // InternalQLS.g:3930:2: ( rule__AndExpression__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==13) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalQLS.g:3930:3: rule__AndExpression__Group_1__0
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
    // InternalQLS.g:3939:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3943:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalQLS.g:3944:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
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
    // InternalQLS.g:3951:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3955:1: ( ( () ) )
            // InternalQLS.g:3956:1: ( () )
            {
            // InternalQLS.g:3956:1: ( () )
            // InternalQLS.g:3957:2: ()
            {
             before(grammarAccess.getAndExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0()); 
            // InternalQLS.g:3958:2: ()
            // InternalQLS.g:3958:3: 
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
    // InternalQLS.g:3966:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3970:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // InternalQLS.g:3971:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
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
    // InternalQLS.g:3978:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3982:1: ( ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) )
            // InternalQLS.g:3983:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            {
            // InternalQLS.g:3983:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            // InternalQLS.g:3984:2: ( rule__AndExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalQLS.g:3985:2: ( rule__AndExpression__OperatorAssignment_1_1 )
            // InternalQLS.g:3985:3: rule__AndExpression__OperatorAssignment_1_1
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
    // InternalQLS.g:3993:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3997:1: ( rule__AndExpression__Group_1__2__Impl )
            // InternalQLS.g:3998:2: rule__AndExpression__Group_1__2__Impl
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
    // InternalQLS.g:4004:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__RhsOperandAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4008:1: ( ( ( rule__AndExpression__RhsOperandAssignment_1_2 ) ) )
            // InternalQLS.g:4009:1: ( ( rule__AndExpression__RhsOperandAssignment_1_2 ) )
            {
            // InternalQLS.g:4009:1: ( ( rule__AndExpression__RhsOperandAssignment_1_2 ) )
            // InternalQLS.g:4010:2: ( rule__AndExpression__RhsOperandAssignment_1_2 )
            {
             before(grammarAccess.getAndExpressionAccess().getRhsOperandAssignment_1_2()); 
            // InternalQLS.g:4011:2: ( rule__AndExpression__RhsOperandAssignment_1_2 )
            // InternalQLS.g:4011:3: rule__AndExpression__RhsOperandAssignment_1_2
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
    // InternalQLS.g:4020:1: rule__EqualExpression__Group__0 : rule__EqualExpression__Group__0__Impl rule__EqualExpression__Group__1 ;
    public final void rule__EqualExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4024:1: ( rule__EqualExpression__Group__0__Impl rule__EqualExpression__Group__1 )
            // InternalQLS.g:4025:2: rule__EqualExpression__Group__0__Impl rule__EqualExpression__Group__1
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
    // InternalQLS.g:4032:1: rule__EqualExpression__Group__0__Impl : ( ruleComparisionExpression ) ;
    public final void rule__EqualExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4036:1: ( ( ruleComparisionExpression ) )
            // InternalQLS.g:4037:1: ( ruleComparisionExpression )
            {
            // InternalQLS.g:4037:1: ( ruleComparisionExpression )
            // InternalQLS.g:4038:2: ruleComparisionExpression
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
    // InternalQLS.g:4047:1: rule__EqualExpression__Group__1 : rule__EqualExpression__Group__1__Impl ;
    public final void rule__EqualExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4051:1: ( rule__EqualExpression__Group__1__Impl )
            // InternalQLS.g:4052:2: rule__EqualExpression__Group__1__Impl
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
    // InternalQLS.g:4058:1: rule__EqualExpression__Group__1__Impl : ( ( rule__EqualExpression__Group_1__0 )* ) ;
    public final void rule__EqualExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4062:1: ( ( ( rule__EqualExpression__Group_1__0 )* ) )
            // InternalQLS.g:4063:1: ( ( rule__EqualExpression__Group_1__0 )* )
            {
            // InternalQLS.g:4063:1: ( ( rule__EqualExpression__Group_1__0 )* )
            // InternalQLS.g:4064:2: ( rule__EqualExpression__Group_1__0 )*
            {
             before(grammarAccess.getEqualExpressionAccess().getGroup_1()); 
            // InternalQLS.g:4065:2: ( rule__EqualExpression__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==12) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalQLS.g:4065:3: rule__EqualExpression__Group_1__0
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
    // InternalQLS.g:4074:1: rule__EqualExpression__Group_1__0 : rule__EqualExpression__Group_1__0__Impl rule__EqualExpression__Group_1__1 ;
    public final void rule__EqualExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4078:1: ( rule__EqualExpression__Group_1__0__Impl rule__EqualExpression__Group_1__1 )
            // InternalQLS.g:4079:2: rule__EqualExpression__Group_1__0__Impl rule__EqualExpression__Group_1__1
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
    // InternalQLS.g:4086:1: rule__EqualExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__EqualExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4090:1: ( ( () ) )
            // InternalQLS.g:4091:1: ( () )
            {
            // InternalQLS.g:4091:1: ( () )
            // InternalQLS.g:4092:2: ()
            {
             before(grammarAccess.getEqualExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0()); 
            // InternalQLS.g:4093:2: ()
            // InternalQLS.g:4093:3: 
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
    // InternalQLS.g:4101:1: rule__EqualExpression__Group_1__1 : rule__EqualExpression__Group_1__1__Impl rule__EqualExpression__Group_1__2 ;
    public final void rule__EqualExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4105:1: ( rule__EqualExpression__Group_1__1__Impl rule__EqualExpression__Group_1__2 )
            // InternalQLS.g:4106:2: rule__EqualExpression__Group_1__1__Impl rule__EqualExpression__Group_1__2
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
    // InternalQLS.g:4113:1: rule__EqualExpression__Group_1__1__Impl : ( ( rule__EqualExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__EqualExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4117:1: ( ( ( rule__EqualExpression__OperatorAssignment_1_1 ) ) )
            // InternalQLS.g:4118:1: ( ( rule__EqualExpression__OperatorAssignment_1_1 ) )
            {
            // InternalQLS.g:4118:1: ( ( rule__EqualExpression__OperatorAssignment_1_1 ) )
            // InternalQLS.g:4119:2: ( rule__EqualExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getEqualExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalQLS.g:4120:2: ( rule__EqualExpression__OperatorAssignment_1_1 )
            // InternalQLS.g:4120:3: rule__EqualExpression__OperatorAssignment_1_1
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
    // InternalQLS.g:4128:1: rule__EqualExpression__Group_1__2 : rule__EqualExpression__Group_1__2__Impl ;
    public final void rule__EqualExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4132:1: ( rule__EqualExpression__Group_1__2__Impl )
            // InternalQLS.g:4133:2: rule__EqualExpression__Group_1__2__Impl
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
    // InternalQLS.g:4139:1: rule__EqualExpression__Group_1__2__Impl : ( ( rule__EqualExpression__RhsOperandAssignment_1_2 ) ) ;
    public final void rule__EqualExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4143:1: ( ( ( rule__EqualExpression__RhsOperandAssignment_1_2 ) ) )
            // InternalQLS.g:4144:1: ( ( rule__EqualExpression__RhsOperandAssignment_1_2 ) )
            {
            // InternalQLS.g:4144:1: ( ( rule__EqualExpression__RhsOperandAssignment_1_2 ) )
            // InternalQLS.g:4145:2: ( rule__EqualExpression__RhsOperandAssignment_1_2 )
            {
             before(grammarAccess.getEqualExpressionAccess().getRhsOperandAssignment_1_2()); 
            // InternalQLS.g:4146:2: ( rule__EqualExpression__RhsOperandAssignment_1_2 )
            // InternalQLS.g:4146:3: rule__EqualExpression__RhsOperandAssignment_1_2
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
    // InternalQLS.g:4155:1: rule__ComparisionExpression__Group__0 : rule__ComparisionExpression__Group__0__Impl rule__ComparisionExpression__Group__1 ;
    public final void rule__ComparisionExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4159:1: ( rule__ComparisionExpression__Group__0__Impl rule__ComparisionExpression__Group__1 )
            // InternalQLS.g:4160:2: rule__ComparisionExpression__Group__0__Impl rule__ComparisionExpression__Group__1
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
    // InternalQLS.g:4167:1: rule__ComparisionExpression__Group__0__Impl : ( ruleAdditionExpression ) ;
    public final void rule__ComparisionExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4171:1: ( ( ruleAdditionExpression ) )
            // InternalQLS.g:4172:1: ( ruleAdditionExpression )
            {
            // InternalQLS.g:4172:1: ( ruleAdditionExpression )
            // InternalQLS.g:4173:2: ruleAdditionExpression
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
    // InternalQLS.g:4182:1: rule__ComparisionExpression__Group__1 : rule__ComparisionExpression__Group__1__Impl ;
    public final void rule__ComparisionExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4186:1: ( rule__ComparisionExpression__Group__1__Impl )
            // InternalQLS.g:4187:2: rule__ComparisionExpression__Group__1__Impl
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
    // InternalQLS.g:4193:1: rule__ComparisionExpression__Group__1__Impl : ( ( rule__ComparisionExpression__Group_1__0 )* ) ;
    public final void rule__ComparisionExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4197:1: ( ( ( rule__ComparisionExpression__Group_1__0 )* ) )
            // InternalQLS.g:4198:1: ( ( rule__ComparisionExpression__Group_1__0 )* )
            {
            // InternalQLS.g:4198:1: ( ( rule__ComparisionExpression__Group_1__0 )* )
            // InternalQLS.g:4199:2: ( rule__ComparisionExpression__Group_1__0 )*
            {
             before(grammarAccess.getComparisionExpressionAccess().getGroup_1()); 
            // InternalQLS.g:4200:2: ( rule__ComparisionExpression__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=39 && LA33_0<=42)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalQLS.g:4200:3: rule__ComparisionExpression__Group_1__0
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
    // InternalQLS.g:4209:1: rule__ComparisionExpression__Group_1__0 : rule__ComparisionExpression__Group_1__0__Impl rule__ComparisionExpression__Group_1__1 ;
    public final void rule__ComparisionExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4213:1: ( rule__ComparisionExpression__Group_1__0__Impl rule__ComparisionExpression__Group_1__1 )
            // InternalQLS.g:4214:2: rule__ComparisionExpression__Group_1__0__Impl rule__ComparisionExpression__Group_1__1
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
    // InternalQLS.g:4221:1: rule__ComparisionExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ComparisionExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4225:1: ( ( () ) )
            // InternalQLS.g:4226:1: ( () )
            {
            // InternalQLS.g:4226:1: ( () )
            // InternalQLS.g:4227:2: ()
            {
             before(grammarAccess.getComparisionExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0()); 
            // InternalQLS.g:4228:2: ()
            // InternalQLS.g:4228:3: 
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
    // InternalQLS.g:4236:1: rule__ComparisionExpression__Group_1__1 : rule__ComparisionExpression__Group_1__1__Impl rule__ComparisionExpression__Group_1__2 ;
    public final void rule__ComparisionExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4240:1: ( rule__ComparisionExpression__Group_1__1__Impl rule__ComparisionExpression__Group_1__2 )
            // InternalQLS.g:4241:2: rule__ComparisionExpression__Group_1__1__Impl rule__ComparisionExpression__Group_1__2
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
    // InternalQLS.g:4248:1: rule__ComparisionExpression__Group_1__1__Impl : ( ( rule__ComparisionExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ComparisionExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4252:1: ( ( ( rule__ComparisionExpression__OperatorAssignment_1_1 ) ) )
            // InternalQLS.g:4253:1: ( ( rule__ComparisionExpression__OperatorAssignment_1_1 ) )
            {
            // InternalQLS.g:4253:1: ( ( rule__ComparisionExpression__OperatorAssignment_1_1 ) )
            // InternalQLS.g:4254:2: ( rule__ComparisionExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getComparisionExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalQLS.g:4255:2: ( rule__ComparisionExpression__OperatorAssignment_1_1 )
            // InternalQLS.g:4255:3: rule__ComparisionExpression__OperatorAssignment_1_1
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
    // InternalQLS.g:4263:1: rule__ComparisionExpression__Group_1__2 : rule__ComparisionExpression__Group_1__2__Impl ;
    public final void rule__ComparisionExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4267:1: ( rule__ComparisionExpression__Group_1__2__Impl )
            // InternalQLS.g:4268:2: rule__ComparisionExpression__Group_1__2__Impl
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
    // InternalQLS.g:4274:1: rule__ComparisionExpression__Group_1__2__Impl : ( ( rule__ComparisionExpression__RhsOperandAssignment_1_2 ) ) ;
    public final void rule__ComparisionExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4278:1: ( ( ( rule__ComparisionExpression__RhsOperandAssignment_1_2 ) ) )
            // InternalQLS.g:4279:1: ( ( rule__ComparisionExpression__RhsOperandAssignment_1_2 ) )
            {
            // InternalQLS.g:4279:1: ( ( rule__ComparisionExpression__RhsOperandAssignment_1_2 ) )
            // InternalQLS.g:4280:2: ( rule__ComparisionExpression__RhsOperandAssignment_1_2 )
            {
             before(grammarAccess.getComparisionExpressionAccess().getRhsOperandAssignment_1_2()); 
            // InternalQLS.g:4281:2: ( rule__ComparisionExpression__RhsOperandAssignment_1_2 )
            // InternalQLS.g:4281:3: rule__ComparisionExpression__RhsOperandAssignment_1_2
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
    // InternalQLS.g:4290:1: rule__AdditionExpression__Group__0 : rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1 ;
    public final void rule__AdditionExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4294:1: ( rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1 )
            // InternalQLS.g:4295:2: rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1
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
    // InternalQLS.g:4302:1: rule__AdditionExpression__Group__0__Impl : ( ruleMultiplicationExpression ) ;
    public final void rule__AdditionExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4306:1: ( ( ruleMultiplicationExpression ) )
            // InternalQLS.g:4307:1: ( ruleMultiplicationExpression )
            {
            // InternalQLS.g:4307:1: ( ruleMultiplicationExpression )
            // InternalQLS.g:4308:2: ruleMultiplicationExpression
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
    // InternalQLS.g:4317:1: rule__AdditionExpression__Group__1 : rule__AdditionExpression__Group__1__Impl ;
    public final void rule__AdditionExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4321:1: ( rule__AdditionExpression__Group__1__Impl )
            // InternalQLS.g:4322:2: rule__AdditionExpression__Group__1__Impl
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
    // InternalQLS.g:4328:1: rule__AdditionExpression__Group__1__Impl : ( ( rule__AdditionExpression__Group_1__0 )* ) ;
    public final void rule__AdditionExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4332:1: ( ( ( rule__AdditionExpression__Group_1__0 )* ) )
            // InternalQLS.g:4333:1: ( ( rule__AdditionExpression__Group_1__0 )* )
            {
            // InternalQLS.g:4333:1: ( ( rule__AdditionExpression__Group_1__0 )* )
            // InternalQLS.g:4334:2: ( rule__AdditionExpression__Group_1__0 )*
            {
             before(grammarAccess.getAdditionExpressionAccess().getGroup_1()); 
            // InternalQLS.g:4335:2: ( rule__AdditionExpression__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==34||LA34_0==36) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalQLS.g:4335:3: rule__AdditionExpression__Group_1__0
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
    // InternalQLS.g:4344:1: rule__AdditionExpression__Group_1__0 : rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1 ;
    public final void rule__AdditionExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4348:1: ( rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1 )
            // InternalQLS.g:4349:2: rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1
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
    // InternalQLS.g:4356:1: rule__AdditionExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AdditionExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4360:1: ( ( () ) )
            // InternalQLS.g:4361:1: ( () )
            {
            // InternalQLS.g:4361:1: ( () )
            // InternalQLS.g:4362:2: ()
            {
             before(grammarAccess.getAdditionExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0()); 
            // InternalQLS.g:4363:2: ()
            // InternalQLS.g:4363:3: 
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
    // InternalQLS.g:4371:1: rule__AdditionExpression__Group_1__1 : rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2 ;
    public final void rule__AdditionExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4375:1: ( rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2 )
            // InternalQLS.g:4376:2: rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2
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
    // InternalQLS.g:4383:1: rule__AdditionExpression__Group_1__1__Impl : ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AdditionExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4387:1: ( ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) ) )
            // InternalQLS.g:4388:1: ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) )
            {
            // InternalQLS.g:4388:1: ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) )
            // InternalQLS.g:4389:2: ( rule__AdditionExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditionExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalQLS.g:4390:2: ( rule__AdditionExpression__OperatorAssignment_1_1 )
            // InternalQLS.g:4390:3: rule__AdditionExpression__OperatorAssignment_1_1
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
    // InternalQLS.g:4398:1: rule__AdditionExpression__Group_1__2 : rule__AdditionExpression__Group_1__2__Impl ;
    public final void rule__AdditionExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4402:1: ( rule__AdditionExpression__Group_1__2__Impl )
            // InternalQLS.g:4403:2: rule__AdditionExpression__Group_1__2__Impl
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
    // InternalQLS.g:4409:1: rule__AdditionExpression__Group_1__2__Impl : ( ( rule__AdditionExpression__RhsOperandAssignment_1_2 ) ) ;
    public final void rule__AdditionExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4413:1: ( ( ( rule__AdditionExpression__RhsOperandAssignment_1_2 ) ) )
            // InternalQLS.g:4414:1: ( ( rule__AdditionExpression__RhsOperandAssignment_1_2 ) )
            {
            // InternalQLS.g:4414:1: ( ( rule__AdditionExpression__RhsOperandAssignment_1_2 ) )
            // InternalQLS.g:4415:2: ( rule__AdditionExpression__RhsOperandAssignment_1_2 )
            {
             before(grammarAccess.getAdditionExpressionAccess().getRhsOperandAssignment_1_2()); 
            // InternalQLS.g:4416:2: ( rule__AdditionExpression__RhsOperandAssignment_1_2 )
            // InternalQLS.g:4416:3: rule__AdditionExpression__RhsOperandAssignment_1_2
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
    // InternalQLS.g:4425:1: rule__MultiplicationExpression__Group__0 : rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1 ;
    public final void rule__MultiplicationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4429:1: ( rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1 )
            // InternalQLS.g:4430:2: rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1
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
    // InternalQLS.g:4437:1: rule__MultiplicationExpression__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__MultiplicationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4441:1: ( ( rulePrimaryExpression ) )
            // InternalQLS.g:4442:1: ( rulePrimaryExpression )
            {
            // InternalQLS.g:4442:1: ( rulePrimaryExpression )
            // InternalQLS.g:4443:2: rulePrimaryExpression
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
    // InternalQLS.g:4452:1: rule__MultiplicationExpression__Group__1 : rule__MultiplicationExpression__Group__1__Impl ;
    public final void rule__MultiplicationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4456:1: ( rule__MultiplicationExpression__Group__1__Impl )
            // InternalQLS.g:4457:2: rule__MultiplicationExpression__Group__1__Impl
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
    // InternalQLS.g:4463:1: rule__MultiplicationExpression__Group__1__Impl : ( ( rule__MultiplicationExpression__Group_1__0 )* ) ;
    public final void rule__MultiplicationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4467:1: ( ( ( rule__MultiplicationExpression__Group_1__0 )* ) )
            // InternalQLS.g:4468:1: ( ( rule__MultiplicationExpression__Group_1__0 )* )
            {
            // InternalQLS.g:4468:1: ( ( rule__MultiplicationExpression__Group_1__0 )* )
            // InternalQLS.g:4469:2: ( rule__MultiplicationExpression__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getGroup_1()); 
            // InternalQLS.g:4470:2: ( rule__MultiplicationExpression__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=37 && LA35_0<=38)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalQLS.g:4470:3: rule__MultiplicationExpression__Group_1__0
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
    // InternalQLS.g:4479:1: rule__MultiplicationExpression__Group_1__0 : rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1 ;
    public final void rule__MultiplicationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4483:1: ( rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1 )
            // InternalQLS.g:4484:2: rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1
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
    // InternalQLS.g:4491:1: rule__MultiplicationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultiplicationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4495:1: ( ( () ) )
            // InternalQLS.g:4496:1: ( () )
            {
            // InternalQLS.g:4496:1: ( () )
            // InternalQLS.g:4497:2: ()
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0()); 
            // InternalQLS.g:4498:2: ()
            // InternalQLS.g:4498:3: 
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
    // InternalQLS.g:4506:1: rule__MultiplicationExpression__Group_1__1 : rule__MultiplicationExpression__Group_1__1__Impl rule__MultiplicationExpression__Group_1__2 ;
    public final void rule__MultiplicationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4510:1: ( rule__MultiplicationExpression__Group_1__1__Impl rule__MultiplicationExpression__Group_1__2 )
            // InternalQLS.g:4511:2: rule__MultiplicationExpression__Group_1__1__Impl rule__MultiplicationExpression__Group_1__2
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
    // InternalQLS.g:4518:1: rule__MultiplicationExpression__Group_1__1__Impl : ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultiplicationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4522:1: ( ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) ) )
            // InternalQLS.g:4523:1: ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) )
            {
            // InternalQLS.g:4523:1: ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) )
            // InternalQLS.g:4524:2: ( rule__MultiplicationExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalQLS.g:4525:2: ( rule__MultiplicationExpression__OperatorAssignment_1_1 )
            // InternalQLS.g:4525:3: rule__MultiplicationExpression__OperatorAssignment_1_1
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
    // InternalQLS.g:4533:1: rule__MultiplicationExpression__Group_1__2 : rule__MultiplicationExpression__Group_1__2__Impl ;
    public final void rule__MultiplicationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4537:1: ( rule__MultiplicationExpression__Group_1__2__Impl )
            // InternalQLS.g:4538:2: rule__MultiplicationExpression__Group_1__2__Impl
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
    // InternalQLS.g:4544:1: rule__MultiplicationExpression__Group_1__2__Impl : ( ( rule__MultiplicationExpression__RhsOperandAssignment_1_2 ) ) ;
    public final void rule__MultiplicationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4548:1: ( ( ( rule__MultiplicationExpression__RhsOperandAssignment_1_2 ) ) )
            // InternalQLS.g:4549:1: ( ( rule__MultiplicationExpression__RhsOperandAssignment_1_2 ) )
            {
            // InternalQLS.g:4549:1: ( ( rule__MultiplicationExpression__RhsOperandAssignment_1_2 ) )
            // InternalQLS.g:4550:2: ( rule__MultiplicationExpression__RhsOperandAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getRhsOperandAssignment_1_2()); 
            // InternalQLS.g:4551:2: ( rule__MultiplicationExpression__RhsOperandAssignment_1_2 )
            // InternalQLS.g:4551:3: rule__MultiplicationExpression__RhsOperandAssignment_1_2
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


    // $ANTLR start "rule__DefinitionGroup__Group__0"
    // InternalQLS.g:4560:1: rule__DefinitionGroup__Group__0 : rule__DefinitionGroup__Group__0__Impl rule__DefinitionGroup__Group__1 ;
    public final void rule__DefinitionGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4564:1: ( rule__DefinitionGroup__Group__0__Impl rule__DefinitionGroup__Group__1 )
            // InternalQLS.g:4565:2: rule__DefinitionGroup__Group__0__Impl rule__DefinitionGroup__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalQLS.g:4572:1: rule__DefinitionGroup__Group__0__Impl : ( () ) ;
    public final void rule__DefinitionGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4576:1: ( ( () ) )
            // InternalQLS.g:4577:1: ( () )
            {
            // InternalQLS.g:4577:1: ( () )
            // InternalQLS.g:4578:2: ()
            {
             before(grammarAccess.getDefinitionGroupAccess().getDefinitionGroupAction_0()); 
            // InternalQLS.g:4579:2: ()
            // InternalQLS.g:4579:3: 
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
    // InternalQLS.g:4587:1: rule__DefinitionGroup__Group__1 : rule__DefinitionGroup__Group__1__Impl rule__DefinitionGroup__Group__2 ;
    public final void rule__DefinitionGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4591:1: ( rule__DefinitionGroup__Group__1__Impl rule__DefinitionGroup__Group__2 )
            // InternalQLS.g:4592:2: rule__DefinitionGroup__Group__1__Impl rule__DefinitionGroup__Group__2
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
    // InternalQLS.g:4599:1: rule__DefinitionGroup__Group__1__Impl : ( 'definitions' ) ;
    public final void rule__DefinitionGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4603:1: ( ( 'definitions' ) )
            // InternalQLS.g:4604:1: ( 'definitions' )
            {
            // InternalQLS.g:4604:1: ( 'definitions' )
            // InternalQLS.g:4605:2: 'definitions'
            {
             before(grammarAccess.getDefinitionGroupAccess().getDefinitionsKeyword_1()); 
            match(input,63,FOLLOW_2); 
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
    // InternalQLS.g:4614:1: rule__DefinitionGroup__Group__2 : rule__DefinitionGroup__Group__2__Impl rule__DefinitionGroup__Group__3 ;
    public final void rule__DefinitionGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4618:1: ( rule__DefinitionGroup__Group__2__Impl rule__DefinitionGroup__Group__3 )
            // InternalQLS.g:4619:2: rule__DefinitionGroup__Group__2__Impl rule__DefinitionGroup__Group__3
            {
            pushFollow(FOLLOW_43);
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
    // InternalQLS.g:4626:1: rule__DefinitionGroup__Group__2__Impl : ( '{' ) ;
    public final void rule__DefinitionGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4630:1: ( ( '{' ) )
            // InternalQLS.g:4631:1: ( '{' )
            {
            // InternalQLS.g:4631:1: ( '{' )
            // InternalQLS.g:4632:2: '{'
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
    // InternalQLS.g:4641:1: rule__DefinitionGroup__Group__3 : rule__DefinitionGroup__Group__3__Impl rule__DefinitionGroup__Group__4 ;
    public final void rule__DefinitionGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4645:1: ( rule__DefinitionGroup__Group__3__Impl rule__DefinitionGroup__Group__4 )
            // InternalQLS.g:4646:2: rule__DefinitionGroup__Group__3__Impl rule__DefinitionGroup__Group__4
            {
            pushFollow(FOLLOW_43);
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
    // InternalQLS.g:4653:1: rule__DefinitionGroup__Group__3__Impl : ( ( rule__DefinitionGroup__Alternatives_3 )* ) ;
    public final void rule__DefinitionGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4657:1: ( ( ( rule__DefinitionGroup__Alternatives_3 )* ) )
            // InternalQLS.g:4658:1: ( ( rule__DefinitionGroup__Alternatives_3 )* )
            {
            // InternalQLS.g:4658:1: ( ( rule__DefinitionGroup__Alternatives_3 )* )
            // InternalQLS.g:4659:2: ( rule__DefinitionGroup__Alternatives_3 )*
            {
             before(grammarAccess.getDefinitionGroupAccess().getAlternatives_3()); 
            // InternalQLS.g:4660:2: ( rule__DefinitionGroup__Alternatives_3 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==64||(LA36_0>=66 && LA36_0<=67)||(LA36_0>=70 && LA36_0<=72)||LA36_0==75||LA36_0==79||LA36_0==86) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalQLS.g:4660:3: rule__DefinitionGroup__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_44);
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
    // InternalQLS.g:4668:1: rule__DefinitionGroup__Group__4 : rule__DefinitionGroup__Group__4__Impl ;
    public final void rule__DefinitionGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4672:1: ( rule__DefinitionGroup__Group__4__Impl )
            // InternalQLS.g:4673:2: rule__DefinitionGroup__Group__4__Impl
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
    // InternalQLS.g:4679:1: rule__DefinitionGroup__Group__4__Impl : ( '}' ) ;
    public final void rule__DefinitionGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4683:1: ( ( '}' ) )
            // InternalQLS.g:4684:1: ( '}' )
            {
            // InternalQLS.g:4684:1: ( '}' )
            // InternalQLS.g:4685:2: '}'
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
    // InternalQLS.g:4695:1: rule__QuestionGroup__Group__0 : rule__QuestionGroup__Group__0__Impl rule__QuestionGroup__Group__1 ;
    public final void rule__QuestionGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4699:1: ( rule__QuestionGroup__Group__0__Impl rule__QuestionGroup__Group__1 )
            // InternalQLS.g:4700:2: rule__QuestionGroup__Group__0__Impl rule__QuestionGroup__Group__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalQLS.g:4707:1: rule__QuestionGroup__Group__0__Impl : ( () ) ;
    public final void rule__QuestionGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4711:1: ( ( () ) )
            // InternalQLS.g:4712:1: ( () )
            {
            // InternalQLS.g:4712:1: ( () )
            // InternalQLS.g:4713:2: ()
            {
             before(grammarAccess.getQuestionGroupAccess().getQuestionGroupAction_0()); 
            // InternalQLS.g:4714:2: ()
            // InternalQLS.g:4714:3: 
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
    // InternalQLS.g:4722:1: rule__QuestionGroup__Group__1 : rule__QuestionGroup__Group__1__Impl rule__QuestionGroup__Group__2 ;
    public final void rule__QuestionGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4726:1: ( rule__QuestionGroup__Group__1__Impl rule__QuestionGroup__Group__2 )
            // InternalQLS.g:4727:2: rule__QuestionGroup__Group__1__Impl rule__QuestionGroup__Group__2
            {
            pushFollow(FOLLOW_45);
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
    // InternalQLS.g:4734:1: rule__QuestionGroup__Group__1__Impl : ( ( rule__QuestionGroup__Group_1__0 )? ) ;
    public final void rule__QuestionGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4738:1: ( ( ( rule__QuestionGroup__Group_1__0 )? ) )
            // InternalQLS.g:4739:1: ( ( rule__QuestionGroup__Group_1__0 )? )
            {
            // InternalQLS.g:4739:1: ( ( rule__QuestionGroup__Group_1__0 )? )
            // InternalQLS.g:4740:2: ( rule__QuestionGroup__Group_1__0 )?
            {
             before(grammarAccess.getQuestionGroupAccess().getGroup_1()); 
            // InternalQLS.g:4741:2: ( rule__QuestionGroup__Group_1__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==59) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalQLS.g:4741:3: rule__QuestionGroup__Group_1__0
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
    // InternalQLS.g:4749:1: rule__QuestionGroup__Group__2 : rule__QuestionGroup__Group__2__Impl rule__QuestionGroup__Group__3 ;
    public final void rule__QuestionGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4753:1: ( rule__QuestionGroup__Group__2__Impl rule__QuestionGroup__Group__3 )
            // InternalQLS.g:4754:2: rule__QuestionGroup__Group__2__Impl rule__QuestionGroup__Group__3
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
    // InternalQLS.g:4761:1: rule__QuestionGroup__Group__2__Impl : ( '{' ) ;
    public final void rule__QuestionGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4765:1: ( ( '{' ) )
            // InternalQLS.g:4766:1: ( '{' )
            {
            // InternalQLS.g:4766:1: ( '{' )
            // InternalQLS.g:4767:2: '{'
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
    // InternalQLS.g:4776:1: rule__QuestionGroup__Group__3 : rule__QuestionGroup__Group__3__Impl rule__QuestionGroup__Group__4 ;
    public final void rule__QuestionGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4780:1: ( rule__QuestionGroup__Group__3__Impl rule__QuestionGroup__Group__4 )
            // InternalQLS.g:4781:2: rule__QuestionGroup__Group__3__Impl rule__QuestionGroup__Group__4
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
    // InternalQLS.g:4788:1: rule__QuestionGroup__Group__3__Impl : ( ( rule__QuestionGroup__Alternatives_3 )* ) ;
    public final void rule__QuestionGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4792:1: ( ( ( rule__QuestionGroup__Alternatives_3 )* ) )
            // InternalQLS.g:4793:1: ( ( rule__QuestionGroup__Alternatives_3 )* )
            {
            // InternalQLS.g:4793:1: ( ( rule__QuestionGroup__Alternatives_3 )* )
            // InternalQLS.g:4794:2: ( rule__QuestionGroup__Alternatives_3 )*
            {
             before(grammarAccess.getQuestionGroupAccess().getAlternatives_3()); 
            // InternalQLS.g:4795:2: ( rule__QuestionGroup__Alternatives_3 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ID||LA38_0==44||LA38_0==59) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalQLS.g:4795:3: rule__QuestionGroup__Alternatives_3
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
    // InternalQLS.g:4803:1: rule__QuestionGroup__Group__4 : rule__QuestionGroup__Group__4__Impl ;
    public final void rule__QuestionGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4807:1: ( rule__QuestionGroup__Group__4__Impl )
            // InternalQLS.g:4808:2: rule__QuestionGroup__Group__4__Impl
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
    // InternalQLS.g:4814:1: rule__QuestionGroup__Group__4__Impl : ( '}' ) ;
    public final void rule__QuestionGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4818:1: ( ( '}' ) )
            // InternalQLS.g:4819:1: ( '}' )
            {
            // InternalQLS.g:4819:1: ( '}' )
            // InternalQLS.g:4820:2: '}'
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
    // InternalQLS.g:4830:1: rule__QuestionGroup__Group_1__0 : rule__QuestionGroup__Group_1__0__Impl rule__QuestionGroup__Group_1__1 ;
    public final void rule__QuestionGroup__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4834:1: ( rule__QuestionGroup__Group_1__0__Impl rule__QuestionGroup__Group_1__1 )
            // InternalQLS.g:4835:2: rule__QuestionGroup__Group_1__0__Impl rule__QuestionGroup__Group_1__1
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
    // InternalQLS.g:4842:1: rule__QuestionGroup__Group_1__0__Impl : ( 'if' ) ;
    public final void rule__QuestionGroup__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4846:1: ( ( 'if' ) )
            // InternalQLS.g:4847:1: ( 'if' )
            {
            // InternalQLS.g:4847:1: ( 'if' )
            // InternalQLS.g:4848:2: 'if'
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
    // InternalQLS.g:4857:1: rule__QuestionGroup__Group_1__1 : rule__QuestionGroup__Group_1__1__Impl ;
    public final void rule__QuestionGroup__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4861:1: ( rule__QuestionGroup__Group_1__1__Impl )
            // InternalQLS.g:4862:2: rule__QuestionGroup__Group_1__1__Impl
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
    // InternalQLS.g:4868:1: rule__QuestionGroup__Group_1__1__Impl : ( ( rule__QuestionGroup__GuardAssignment_1_1 ) ) ;
    public final void rule__QuestionGroup__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4872:1: ( ( ( rule__QuestionGroup__GuardAssignment_1_1 ) ) )
            // InternalQLS.g:4873:1: ( ( rule__QuestionGroup__GuardAssignment_1_1 ) )
            {
            // InternalQLS.g:4873:1: ( ( rule__QuestionGroup__GuardAssignment_1_1 ) )
            // InternalQLS.g:4874:2: ( rule__QuestionGroup__GuardAssignment_1_1 )
            {
             before(grammarAccess.getQuestionGroupAccess().getGuardAssignment_1_1()); 
            // InternalQLS.g:4875:2: ( rule__QuestionGroup__GuardAssignment_1_1 )
            // InternalQLS.g:4875:3: rule__QuestionGroup__GuardAssignment_1_1
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
    // InternalQLS.g:4884:1: rule__ValueType_Impl__Group__0 : rule__ValueType_Impl__Group__0__Impl rule__ValueType_Impl__Group__1 ;
    public final void rule__ValueType_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4888:1: ( rule__ValueType_Impl__Group__0__Impl rule__ValueType_Impl__Group__1 )
            // InternalQLS.g:4889:2: rule__ValueType_Impl__Group__0__Impl rule__ValueType_Impl__Group__1
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
    // InternalQLS.g:4896:1: rule__ValueType_Impl__Group__0__Impl : ( () ) ;
    public final void rule__ValueType_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4900:1: ( ( () ) )
            // InternalQLS.g:4901:1: ( () )
            {
            // InternalQLS.g:4901:1: ( () )
            // InternalQLS.g:4902:2: ()
            {
             before(grammarAccess.getValueType_ImplAccess().getValueTypeAction_0()); 
            // InternalQLS.g:4903:2: ()
            // InternalQLS.g:4903:3: 
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
    // InternalQLS.g:4911:1: rule__ValueType_Impl__Group__1 : rule__ValueType_Impl__Group__1__Impl rule__ValueType_Impl__Group__2 ;
    public final void rule__ValueType_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4915:1: ( rule__ValueType_Impl__Group__1__Impl rule__ValueType_Impl__Group__2 )
            // InternalQLS.g:4916:2: rule__ValueType_Impl__Group__1__Impl rule__ValueType_Impl__Group__2
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
    // InternalQLS.g:4923:1: rule__ValueType_Impl__Group__1__Impl : ( 'ValueType' ) ;
    public final void rule__ValueType_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4927:1: ( ( 'ValueType' ) )
            // InternalQLS.g:4928:1: ( 'ValueType' )
            {
            // InternalQLS.g:4928:1: ( 'ValueType' )
            // InternalQLS.g:4929:2: 'ValueType'
            {
             before(grammarAccess.getValueType_ImplAccess().getValueTypeKeyword_1()); 
            match(input,64,FOLLOW_2); 
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
    // InternalQLS.g:4938:1: rule__ValueType_Impl__Group__2 : rule__ValueType_Impl__Group__2__Impl rule__ValueType_Impl__Group__3 ;
    public final void rule__ValueType_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4942:1: ( rule__ValueType_Impl__Group__2__Impl rule__ValueType_Impl__Group__3 )
            // InternalQLS.g:4943:2: rule__ValueType_Impl__Group__2__Impl rule__ValueType_Impl__Group__3
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
    // InternalQLS.g:4950:1: rule__ValueType_Impl__Group__2__Impl : ( ( rule__ValueType_Impl__NameAssignment_2 ) ) ;
    public final void rule__ValueType_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4954:1: ( ( ( rule__ValueType_Impl__NameAssignment_2 ) ) )
            // InternalQLS.g:4955:1: ( ( rule__ValueType_Impl__NameAssignment_2 ) )
            {
            // InternalQLS.g:4955:1: ( ( rule__ValueType_Impl__NameAssignment_2 ) )
            // InternalQLS.g:4956:2: ( rule__ValueType_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getValueType_ImplAccess().getNameAssignment_2()); 
            // InternalQLS.g:4957:2: ( rule__ValueType_Impl__NameAssignment_2 )
            // InternalQLS.g:4957:3: rule__ValueType_Impl__NameAssignment_2
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
    // InternalQLS.g:4965:1: rule__ValueType_Impl__Group__3 : rule__ValueType_Impl__Group__3__Impl rule__ValueType_Impl__Group__4 ;
    public final void rule__ValueType_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4969:1: ( rule__ValueType_Impl__Group__3__Impl rule__ValueType_Impl__Group__4 )
            // InternalQLS.g:4970:2: rule__ValueType_Impl__Group__3__Impl rule__ValueType_Impl__Group__4
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
    // InternalQLS.g:4977:1: rule__ValueType_Impl__Group__3__Impl : ( '{' ) ;
    public final void rule__ValueType_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4981:1: ( ( '{' ) )
            // InternalQLS.g:4982:1: ( '{' )
            {
            // InternalQLS.g:4982:1: ( '{' )
            // InternalQLS.g:4983:2: '{'
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
    // InternalQLS.g:4992:1: rule__ValueType_Impl__Group__4 : rule__ValueType_Impl__Group__4__Impl rule__ValueType_Impl__Group__5 ;
    public final void rule__ValueType_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4996:1: ( rule__ValueType_Impl__Group__4__Impl rule__ValueType_Impl__Group__5 )
            // InternalQLS.g:4997:2: rule__ValueType_Impl__Group__4__Impl rule__ValueType_Impl__Group__5
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
    // InternalQLS.g:5004:1: rule__ValueType_Impl__Group__4__Impl : ( ( rule__ValueType_Impl__Group_4__0 )? ) ;
    public final void rule__ValueType_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5008:1: ( ( ( rule__ValueType_Impl__Group_4__0 )? ) )
            // InternalQLS.g:5009:1: ( ( rule__ValueType_Impl__Group_4__0 )? )
            {
            // InternalQLS.g:5009:1: ( ( rule__ValueType_Impl__Group_4__0 )? )
            // InternalQLS.g:5010:2: ( rule__ValueType_Impl__Group_4__0 )?
            {
             before(grammarAccess.getValueType_ImplAccess().getGroup_4()); 
            // InternalQLS.g:5011:2: ( rule__ValueType_Impl__Group_4__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==65) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalQLS.g:5011:3: rule__ValueType_Impl__Group_4__0
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
    // InternalQLS.g:5019:1: rule__ValueType_Impl__Group__5 : rule__ValueType_Impl__Group__5__Impl ;
    public final void rule__ValueType_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5023:1: ( rule__ValueType_Impl__Group__5__Impl )
            // InternalQLS.g:5024:2: rule__ValueType_Impl__Group__5__Impl
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
    // InternalQLS.g:5030:1: rule__ValueType_Impl__Group__5__Impl : ( '}' ) ;
    public final void rule__ValueType_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5034:1: ( ( '}' ) )
            // InternalQLS.g:5035:1: ( '}' )
            {
            // InternalQLS.g:5035:1: ( '}' )
            // InternalQLS.g:5036:2: '}'
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
    // InternalQLS.g:5046:1: rule__ValueType_Impl__Group_4__0 : rule__ValueType_Impl__Group_4__0__Impl rule__ValueType_Impl__Group_4__1 ;
    public final void rule__ValueType_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5050:1: ( rule__ValueType_Impl__Group_4__0__Impl rule__ValueType_Impl__Group_4__1 )
            // InternalQLS.g:5051:2: rule__ValueType_Impl__Group_4__0__Impl rule__ValueType_Impl__Group_4__1
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
    // InternalQLS.g:5058:1: rule__ValueType_Impl__Group_4__0__Impl : ( 'unit' ) ;
    public final void rule__ValueType_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5062:1: ( ( 'unit' ) )
            // InternalQLS.g:5063:1: ( 'unit' )
            {
            // InternalQLS.g:5063:1: ( 'unit' )
            // InternalQLS.g:5064:2: 'unit'
            {
             before(grammarAccess.getValueType_ImplAccess().getUnitKeyword_4_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalQLS.g:5073:1: rule__ValueType_Impl__Group_4__1 : rule__ValueType_Impl__Group_4__1__Impl ;
    public final void rule__ValueType_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5077:1: ( rule__ValueType_Impl__Group_4__1__Impl )
            // InternalQLS.g:5078:2: rule__ValueType_Impl__Group_4__1__Impl
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
    // InternalQLS.g:5084:1: rule__ValueType_Impl__Group_4__1__Impl : ( ( rule__ValueType_Impl__UnitAssignment_4_1 ) ) ;
    public final void rule__ValueType_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5088:1: ( ( ( rule__ValueType_Impl__UnitAssignment_4_1 ) ) )
            // InternalQLS.g:5089:1: ( ( rule__ValueType_Impl__UnitAssignment_4_1 ) )
            {
            // InternalQLS.g:5089:1: ( ( rule__ValueType_Impl__UnitAssignment_4_1 ) )
            // InternalQLS.g:5090:2: ( rule__ValueType_Impl__UnitAssignment_4_1 )
            {
             before(grammarAccess.getValueType_ImplAccess().getUnitAssignment_4_1()); 
            // InternalQLS.g:5091:2: ( rule__ValueType_Impl__UnitAssignment_4_1 )
            // InternalQLS.g:5091:3: rule__ValueType_Impl__UnitAssignment_4_1
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
    // InternalQLS.g:5100:1: rule__ConstantCall__Group__0 : rule__ConstantCall__Group__0__Impl rule__ConstantCall__Group__1 ;
    public final void rule__ConstantCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5104:1: ( rule__ConstantCall__Group__0__Impl rule__ConstantCall__Group__1 )
            // InternalQLS.g:5105:2: rule__ConstantCall__Group__0__Impl rule__ConstantCall__Group__1
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
    // InternalQLS.g:5112:1: rule__ConstantCall__Group__0__Impl : ( () ) ;
    public final void rule__ConstantCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5116:1: ( ( () ) )
            // InternalQLS.g:5117:1: ( () )
            {
            // InternalQLS.g:5117:1: ( () )
            // InternalQLS.g:5118:2: ()
            {
             before(grammarAccess.getConstantCallAccess().getConstantCallAction_0()); 
            // InternalQLS.g:5119:2: ()
            // InternalQLS.g:5119:3: 
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
    // InternalQLS.g:5127:1: rule__ConstantCall__Group__1 : rule__ConstantCall__Group__1__Impl ;
    public final void rule__ConstantCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5131:1: ( rule__ConstantCall__Group__1__Impl )
            // InternalQLS.g:5132:2: rule__ConstantCall__Group__1__Impl
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
    // InternalQLS.g:5138:1: rule__ConstantCall__Group__1__Impl : ( ( rule__ConstantCall__ValueAssignment_1 ) ) ;
    public final void rule__ConstantCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5142:1: ( ( ( rule__ConstantCall__ValueAssignment_1 ) ) )
            // InternalQLS.g:5143:1: ( ( rule__ConstantCall__ValueAssignment_1 ) )
            {
            // InternalQLS.g:5143:1: ( ( rule__ConstantCall__ValueAssignment_1 ) )
            // InternalQLS.g:5144:2: ( rule__ConstantCall__ValueAssignment_1 )
            {
             before(grammarAccess.getConstantCallAccess().getValueAssignment_1()); 
            // InternalQLS.g:5145:2: ( rule__ConstantCall__ValueAssignment_1 )
            // InternalQLS.g:5145:3: rule__ConstantCall__ValueAssignment_1
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
    // InternalQLS.g:5154:1: rule__QuestionCall__Group__0 : rule__QuestionCall__Group__0__Impl rule__QuestionCall__Group__1 ;
    public final void rule__QuestionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5158:1: ( rule__QuestionCall__Group__0__Impl rule__QuestionCall__Group__1 )
            // InternalQLS.g:5159:2: rule__QuestionCall__Group__0__Impl rule__QuestionCall__Group__1
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
    // InternalQLS.g:5166:1: rule__QuestionCall__Group__0__Impl : ( () ) ;
    public final void rule__QuestionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5170:1: ( ( () ) )
            // InternalQLS.g:5171:1: ( () )
            {
            // InternalQLS.g:5171:1: ( () )
            // InternalQLS.g:5172:2: ()
            {
             before(grammarAccess.getQuestionCallAccess().getQuestionCallAction_0()); 
            // InternalQLS.g:5173:2: ()
            // InternalQLS.g:5173:3: 
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
    // InternalQLS.g:5181:1: rule__QuestionCall__Group__1 : rule__QuestionCall__Group__1__Impl rule__QuestionCall__Group__2 ;
    public final void rule__QuestionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5185:1: ( rule__QuestionCall__Group__1__Impl rule__QuestionCall__Group__2 )
            // InternalQLS.g:5186:2: rule__QuestionCall__Group__1__Impl rule__QuestionCall__Group__2
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
    // InternalQLS.g:5193:1: rule__QuestionCall__Group__1__Impl : ( ( rule__QuestionCall__QuestionAssignment_1 ) ) ;
    public final void rule__QuestionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5197:1: ( ( ( rule__QuestionCall__QuestionAssignment_1 ) ) )
            // InternalQLS.g:5198:1: ( ( rule__QuestionCall__QuestionAssignment_1 ) )
            {
            // InternalQLS.g:5198:1: ( ( rule__QuestionCall__QuestionAssignment_1 ) )
            // InternalQLS.g:5199:2: ( rule__QuestionCall__QuestionAssignment_1 )
            {
             before(grammarAccess.getQuestionCallAccess().getQuestionAssignment_1()); 
            // InternalQLS.g:5200:2: ( rule__QuestionCall__QuestionAssignment_1 )
            // InternalQLS.g:5200:3: rule__QuestionCall__QuestionAssignment_1
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
    // InternalQLS.g:5208:1: rule__QuestionCall__Group__2 : rule__QuestionCall__Group__2__Impl rule__QuestionCall__Group__3 ;
    public final void rule__QuestionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5212:1: ( rule__QuestionCall__Group__2__Impl rule__QuestionCall__Group__3 )
            // InternalQLS.g:5213:2: rule__QuestionCall__Group__2__Impl rule__QuestionCall__Group__3
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
    // InternalQLS.g:5220:1: rule__QuestionCall__Group__2__Impl : ( '(' ) ;
    public final void rule__QuestionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5224:1: ( ( '(' ) )
            // InternalQLS.g:5225:1: ( '(' )
            {
            // InternalQLS.g:5225:1: ( '(' )
            // InternalQLS.g:5226:2: '('
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
    // InternalQLS.g:5235:1: rule__QuestionCall__Group__3 : rule__QuestionCall__Group__3__Impl ;
    public final void rule__QuestionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5239:1: ( rule__QuestionCall__Group__3__Impl )
            // InternalQLS.g:5240:2: rule__QuestionCall__Group__3__Impl
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
    // InternalQLS.g:5246:1: rule__QuestionCall__Group__3__Impl : ( ')' ) ;
    public final void rule__QuestionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5250:1: ( ( ')' ) )
            // InternalQLS.g:5251:1: ( ')' )
            {
            // InternalQLS.g:5251:1: ( ')' )
            // InternalQLS.g:5252:2: ')'
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
    // InternalQLS.g:5262:1: rule__BooleanValueType__Group__0 : rule__BooleanValueType__Group__0__Impl rule__BooleanValueType__Group__1 ;
    public final void rule__BooleanValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5266:1: ( rule__BooleanValueType__Group__0__Impl rule__BooleanValueType__Group__1 )
            // InternalQLS.g:5267:2: rule__BooleanValueType__Group__0__Impl rule__BooleanValueType__Group__1
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
    // InternalQLS.g:5274:1: rule__BooleanValueType__Group__0__Impl : ( () ) ;
    public final void rule__BooleanValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5278:1: ( ( () ) )
            // InternalQLS.g:5279:1: ( () )
            {
            // InternalQLS.g:5279:1: ( () )
            // InternalQLS.g:5280:2: ()
            {
             before(grammarAccess.getBooleanValueTypeAccess().getBooleanValueTypeAction_0()); 
            // InternalQLS.g:5281:2: ()
            // InternalQLS.g:5281:3: 
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
    // InternalQLS.g:5289:1: rule__BooleanValueType__Group__1 : rule__BooleanValueType__Group__1__Impl rule__BooleanValueType__Group__2 ;
    public final void rule__BooleanValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5293:1: ( rule__BooleanValueType__Group__1__Impl rule__BooleanValueType__Group__2 )
            // InternalQLS.g:5294:2: rule__BooleanValueType__Group__1__Impl rule__BooleanValueType__Group__2
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
    // InternalQLS.g:5301:1: rule__BooleanValueType__Group__1__Impl : ( 'booleanType' ) ;
    public final void rule__BooleanValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5305:1: ( ( 'booleanType' ) )
            // InternalQLS.g:5306:1: ( 'booleanType' )
            {
            // InternalQLS.g:5306:1: ( 'booleanType' )
            // InternalQLS.g:5307:2: 'booleanType'
            {
             before(grammarAccess.getBooleanValueTypeAccess().getBooleanTypeKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalQLS.g:5316:1: rule__BooleanValueType__Group__2 : rule__BooleanValueType__Group__2__Impl rule__BooleanValueType__Group__3 ;
    public final void rule__BooleanValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5320:1: ( rule__BooleanValueType__Group__2__Impl rule__BooleanValueType__Group__3 )
            // InternalQLS.g:5321:2: rule__BooleanValueType__Group__2__Impl rule__BooleanValueType__Group__3
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
    // InternalQLS.g:5328:1: rule__BooleanValueType__Group__2__Impl : ( ( rule__BooleanValueType__NameAssignment_2 ) ) ;
    public final void rule__BooleanValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5332:1: ( ( ( rule__BooleanValueType__NameAssignment_2 ) ) )
            // InternalQLS.g:5333:1: ( ( rule__BooleanValueType__NameAssignment_2 ) )
            {
            // InternalQLS.g:5333:1: ( ( rule__BooleanValueType__NameAssignment_2 ) )
            // InternalQLS.g:5334:2: ( rule__BooleanValueType__NameAssignment_2 )
            {
             before(grammarAccess.getBooleanValueTypeAccess().getNameAssignment_2()); 
            // InternalQLS.g:5335:2: ( rule__BooleanValueType__NameAssignment_2 )
            // InternalQLS.g:5335:3: rule__BooleanValueType__NameAssignment_2
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
    // InternalQLS.g:5343:1: rule__BooleanValueType__Group__3 : rule__BooleanValueType__Group__3__Impl ;
    public final void rule__BooleanValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5347:1: ( rule__BooleanValueType__Group__3__Impl )
            // InternalQLS.g:5348:2: rule__BooleanValueType__Group__3__Impl
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
    // InternalQLS.g:5354:1: rule__BooleanValueType__Group__3__Impl : ( ( rule__BooleanValueType__Group_3__0 )? ) ;
    public final void rule__BooleanValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5358:1: ( ( ( rule__BooleanValueType__Group_3__0 )? ) )
            // InternalQLS.g:5359:1: ( ( rule__BooleanValueType__Group_3__0 )? )
            {
            // InternalQLS.g:5359:1: ( ( rule__BooleanValueType__Group_3__0 )? )
            // InternalQLS.g:5360:2: ( rule__BooleanValueType__Group_3__0 )?
            {
             before(grammarAccess.getBooleanValueTypeAccess().getGroup_3()); 
            // InternalQLS.g:5361:2: ( rule__BooleanValueType__Group_3__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==44) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalQLS.g:5361:3: rule__BooleanValueType__Group_3__0
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
    // InternalQLS.g:5370:1: rule__BooleanValueType__Group_3__0 : rule__BooleanValueType__Group_3__0__Impl rule__BooleanValueType__Group_3__1 ;
    public final void rule__BooleanValueType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5374:1: ( rule__BooleanValueType__Group_3__0__Impl rule__BooleanValueType__Group_3__1 )
            // InternalQLS.g:5375:2: rule__BooleanValueType__Group_3__0__Impl rule__BooleanValueType__Group_3__1
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
    // InternalQLS.g:5382:1: rule__BooleanValueType__Group_3__0__Impl : ( '{' ) ;
    public final void rule__BooleanValueType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5386:1: ( ( '{' ) )
            // InternalQLS.g:5387:1: ( '{' )
            {
            // InternalQLS.g:5387:1: ( '{' )
            // InternalQLS.g:5388:2: '{'
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
    // InternalQLS.g:5397:1: rule__BooleanValueType__Group_3__1 : rule__BooleanValueType__Group_3__1__Impl rule__BooleanValueType__Group_3__2 ;
    public final void rule__BooleanValueType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5401:1: ( rule__BooleanValueType__Group_3__1__Impl rule__BooleanValueType__Group_3__2 )
            // InternalQLS.g:5402:2: rule__BooleanValueType__Group_3__1__Impl rule__BooleanValueType__Group_3__2
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
    // InternalQLS.g:5409:1: rule__BooleanValueType__Group_3__1__Impl : ( ( rule__BooleanValueType__Group_3_1__0 )? ) ;
    public final void rule__BooleanValueType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5413:1: ( ( ( rule__BooleanValueType__Group_3_1__0 )? ) )
            // InternalQLS.g:5414:1: ( ( rule__BooleanValueType__Group_3_1__0 )? )
            {
            // InternalQLS.g:5414:1: ( ( rule__BooleanValueType__Group_3_1__0 )? )
            // InternalQLS.g:5415:2: ( rule__BooleanValueType__Group_3_1__0 )?
            {
             before(grammarAccess.getBooleanValueTypeAccess().getGroup_3_1()); 
            // InternalQLS.g:5416:2: ( rule__BooleanValueType__Group_3_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==65) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalQLS.g:5416:3: rule__BooleanValueType__Group_3_1__0
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
    // InternalQLS.g:5424:1: rule__BooleanValueType__Group_3__2 : rule__BooleanValueType__Group_3__2__Impl ;
    public final void rule__BooleanValueType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5428:1: ( rule__BooleanValueType__Group_3__2__Impl )
            // InternalQLS.g:5429:2: rule__BooleanValueType__Group_3__2__Impl
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
    // InternalQLS.g:5435:1: rule__BooleanValueType__Group_3__2__Impl : ( '}' ) ;
    public final void rule__BooleanValueType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5439:1: ( ( '}' ) )
            // InternalQLS.g:5440:1: ( '}' )
            {
            // InternalQLS.g:5440:1: ( '}' )
            // InternalQLS.g:5441:2: '}'
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
    // InternalQLS.g:5451:1: rule__BooleanValueType__Group_3_1__0 : rule__BooleanValueType__Group_3_1__0__Impl rule__BooleanValueType__Group_3_1__1 ;
    public final void rule__BooleanValueType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5455:1: ( rule__BooleanValueType__Group_3_1__0__Impl rule__BooleanValueType__Group_3_1__1 )
            // InternalQLS.g:5456:2: rule__BooleanValueType__Group_3_1__0__Impl rule__BooleanValueType__Group_3_1__1
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
    // InternalQLS.g:5463:1: rule__BooleanValueType__Group_3_1__0__Impl : ( 'unit' ) ;
    public final void rule__BooleanValueType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5467:1: ( ( 'unit' ) )
            // InternalQLS.g:5468:1: ( 'unit' )
            {
            // InternalQLS.g:5468:1: ( 'unit' )
            // InternalQLS.g:5469:2: 'unit'
            {
             before(grammarAccess.getBooleanValueTypeAccess().getUnitKeyword_3_1_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalQLS.g:5478:1: rule__BooleanValueType__Group_3_1__1 : rule__BooleanValueType__Group_3_1__1__Impl ;
    public final void rule__BooleanValueType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5482:1: ( rule__BooleanValueType__Group_3_1__1__Impl )
            // InternalQLS.g:5483:2: rule__BooleanValueType__Group_3_1__1__Impl
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
    // InternalQLS.g:5489:1: rule__BooleanValueType__Group_3_1__1__Impl : ( ( rule__BooleanValueType__UnitAssignment_3_1_1 ) ) ;
    public final void rule__BooleanValueType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5493:1: ( ( ( rule__BooleanValueType__UnitAssignment_3_1_1 ) ) )
            // InternalQLS.g:5494:1: ( ( rule__BooleanValueType__UnitAssignment_3_1_1 ) )
            {
            // InternalQLS.g:5494:1: ( ( rule__BooleanValueType__UnitAssignment_3_1_1 ) )
            // InternalQLS.g:5495:2: ( rule__BooleanValueType__UnitAssignment_3_1_1 )
            {
             before(grammarAccess.getBooleanValueTypeAccess().getUnitAssignment_3_1_1()); 
            // InternalQLS.g:5496:2: ( rule__BooleanValueType__UnitAssignment_3_1_1 )
            // InternalQLS.g:5496:3: rule__BooleanValueType__UnitAssignment_3_1_1
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
    // InternalQLS.g:5505:1: rule__IntegerValueType__Group__0 : rule__IntegerValueType__Group__0__Impl rule__IntegerValueType__Group__1 ;
    public final void rule__IntegerValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5509:1: ( rule__IntegerValueType__Group__0__Impl rule__IntegerValueType__Group__1 )
            // InternalQLS.g:5510:2: rule__IntegerValueType__Group__0__Impl rule__IntegerValueType__Group__1
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
    // InternalQLS.g:5517:1: rule__IntegerValueType__Group__0__Impl : ( () ) ;
    public final void rule__IntegerValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5521:1: ( ( () ) )
            // InternalQLS.g:5522:1: ( () )
            {
            // InternalQLS.g:5522:1: ( () )
            // InternalQLS.g:5523:2: ()
            {
             before(grammarAccess.getIntegerValueTypeAccess().getIntegerValueTypeAction_0()); 
            // InternalQLS.g:5524:2: ()
            // InternalQLS.g:5524:3: 
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
    // InternalQLS.g:5532:1: rule__IntegerValueType__Group__1 : rule__IntegerValueType__Group__1__Impl rule__IntegerValueType__Group__2 ;
    public final void rule__IntegerValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5536:1: ( rule__IntegerValueType__Group__1__Impl rule__IntegerValueType__Group__2 )
            // InternalQLS.g:5537:2: rule__IntegerValueType__Group__1__Impl rule__IntegerValueType__Group__2
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
    // InternalQLS.g:5544:1: rule__IntegerValueType__Group__1__Impl : ( 'integerType' ) ;
    public final void rule__IntegerValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5548:1: ( ( 'integerType' ) )
            // InternalQLS.g:5549:1: ( 'integerType' )
            {
            // InternalQLS.g:5549:1: ( 'integerType' )
            // InternalQLS.g:5550:2: 'integerType'
            {
             before(grammarAccess.getIntegerValueTypeAccess().getIntegerTypeKeyword_1()); 
            match(input,67,FOLLOW_2); 
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
    // InternalQLS.g:5559:1: rule__IntegerValueType__Group__2 : rule__IntegerValueType__Group__2__Impl rule__IntegerValueType__Group__3 ;
    public final void rule__IntegerValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5563:1: ( rule__IntegerValueType__Group__2__Impl rule__IntegerValueType__Group__3 )
            // InternalQLS.g:5564:2: rule__IntegerValueType__Group__2__Impl rule__IntegerValueType__Group__3
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
    // InternalQLS.g:5571:1: rule__IntegerValueType__Group__2__Impl : ( ( rule__IntegerValueType__NameAssignment_2 ) ) ;
    public final void rule__IntegerValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5575:1: ( ( ( rule__IntegerValueType__NameAssignment_2 ) ) )
            // InternalQLS.g:5576:1: ( ( rule__IntegerValueType__NameAssignment_2 ) )
            {
            // InternalQLS.g:5576:1: ( ( rule__IntegerValueType__NameAssignment_2 ) )
            // InternalQLS.g:5577:2: ( rule__IntegerValueType__NameAssignment_2 )
            {
             before(grammarAccess.getIntegerValueTypeAccess().getNameAssignment_2()); 
            // InternalQLS.g:5578:2: ( rule__IntegerValueType__NameAssignment_2 )
            // InternalQLS.g:5578:3: rule__IntegerValueType__NameAssignment_2
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
    // InternalQLS.g:5586:1: rule__IntegerValueType__Group__3 : rule__IntegerValueType__Group__3__Impl ;
    public final void rule__IntegerValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5590:1: ( rule__IntegerValueType__Group__3__Impl )
            // InternalQLS.g:5591:2: rule__IntegerValueType__Group__3__Impl
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
    // InternalQLS.g:5597:1: rule__IntegerValueType__Group__3__Impl : ( ( rule__IntegerValueType__Group_3__0 )? ) ;
    public final void rule__IntegerValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5601:1: ( ( ( rule__IntegerValueType__Group_3__0 )? ) )
            // InternalQLS.g:5602:1: ( ( rule__IntegerValueType__Group_3__0 )? )
            {
            // InternalQLS.g:5602:1: ( ( rule__IntegerValueType__Group_3__0 )? )
            // InternalQLS.g:5603:2: ( rule__IntegerValueType__Group_3__0 )?
            {
             before(grammarAccess.getIntegerValueTypeAccess().getGroup_3()); 
            // InternalQLS.g:5604:2: ( rule__IntegerValueType__Group_3__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==44) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalQLS.g:5604:3: rule__IntegerValueType__Group_3__0
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
    // InternalQLS.g:5613:1: rule__IntegerValueType__Group_3__0 : rule__IntegerValueType__Group_3__0__Impl rule__IntegerValueType__Group_3__1 ;
    public final void rule__IntegerValueType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5617:1: ( rule__IntegerValueType__Group_3__0__Impl rule__IntegerValueType__Group_3__1 )
            // InternalQLS.g:5618:2: rule__IntegerValueType__Group_3__0__Impl rule__IntegerValueType__Group_3__1
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
    // InternalQLS.g:5625:1: rule__IntegerValueType__Group_3__0__Impl : ( '{' ) ;
    public final void rule__IntegerValueType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5629:1: ( ( '{' ) )
            // InternalQLS.g:5630:1: ( '{' )
            {
            // InternalQLS.g:5630:1: ( '{' )
            // InternalQLS.g:5631:2: '{'
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
    // InternalQLS.g:5640:1: rule__IntegerValueType__Group_3__1 : rule__IntegerValueType__Group_3__1__Impl rule__IntegerValueType__Group_3__2 ;
    public final void rule__IntegerValueType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5644:1: ( rule__IntegerValueType__Group_3__1__Impl rule__IntegerValueType__Group_3__2 )
            // InternalQLS.g:5645:2: rule__IntegerValueType__Group_3__1__Impl rule__IntegerValueType__Group_3__2
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
    // InternalQLS.g:5652:1: rule__IntegerValueType__Group_3__1__Impl : ( ( rule__IntegerValueType__Group_3_1__0 )? ) ;
    public final void rule__IntegerValueType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5656:1: ( ( ( rule__IntegerValueType__Group_3_1__0 )? ) )
            // InternalQLS.g:5657:1: ( ( rule__IntegerValueType__Group_3_1__0 )? )
            {
            // InternalQLS.g:5657:1: ( ( rule__IntegerValueType__Group_3_1__0 )? )
            // InternalQLS.g:5658:2: ( rule__IntegerValueType__Group_3_1__0 )?
            {
             before(grammarAccess.getIntegerValueTypeAccess().getGroup_3_1()); 
            // InternalQLS.g:5659:2: ( rule__IntegerValueType__Group_3_1__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==65) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalQLS.g:5659:3: rule__IntegerValueType__Group_3_1__0
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
    // InternalQLS.g:5667:1: rule__IntegerValueType__Group_3__2 : rule__IntegerValueType__Group_3__2__Impl rule__IntegerValueType__Group_3__3 ;
    public final void rule__IntegerValueType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5671:1: ( rule__IntegerValueType__Group_3__2__Impl rule__IntegerValueType__Group_3__3 )
            // InternalQLS.g:5672:2: rule__IntegerValueType__Group_3__2__Impl rule__IntegerValueType__Group_3__3
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
    // InternalQLS.g:5679:1: rule__IntegerValueType__Group_3__2__Impl : ( ( rule__IntegerValueType__Group_3_2__0 )? ) ;
    public final void rule__IntegerValueType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5683:1: ( ( ( rule__IntegerValueType__Group_3_2__0 )? ) )
            // InternalQLS.g:5684:1: ( ( rule__IntegerValueType__Group_3_2__0 )? )
            {
            // InternalQLS.g:5684:1: ( ( rule__IntegerValueType__Group_3_2__0 )? )
            // InternalQLS.g:5685:2: ( rule__IntegerValueType__Group_3_2__0 )?
            {
             before(grammarAccess.getIntegerValueTypeAccess().getGroup_3_2()); 
            // InternalQLS.g:5686:2: ( rule__IntegerValueType__Group_3_2__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==68) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalQLS.g:5686:3: rule__IntegerValueType__Group_3_2__0
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
    // InternalQLS.g:5694:1: rule__IntegerValueType__Group_3__3 : rule__IntegerValueType__Group_3__3__Impl rule__IntegerValueType__Group_3__4 ;
    public final void rule__IntegerValueType__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5698:1: ( rule__IntegerValueType__Group_3__3__Impl rule__IntegerValueType__Group_3__4 )
            // InternalQLS.g:5699:2: rule__IntegerValueType__Group_3__3__Impl rule__IntegerValueType__Group_3__4
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
    // InternalQLS.g:5706:1: rule__IntegerValueType__Group_3__3__Impl : ( ( rule__IntegerValueType__Group_3_3__0 )? ) ;
    public final void rule__IntegerValueType__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5710:1: ( ( ( rule__IntegerValueType__Group_3_3__0 )? ) )
            // InternalQLS.g:5711:1: ( ( rule__IntegerValueType__Group_3_3__0 )? )
            {
            // InternalQLS.g:5711:1: ( ( rule__IntegerValueType__Group_3_3__0 )? )
            // InternalQLS.g:5712:2: ( rule__IntegerValueType__Group_3_3__0 )?
            {
             before(grammarAccess.getIntegerValueTypeAccess().getGroup_3_3()); 
            // InternalQLS.g:5713:2: ( rule__IntegerValueType__Group_3_3__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==69) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalQLS.g:5713:3: rule__IntegerValueType__Group_3_3__0
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
    // InternalQLS.g:5721:1: rule__IntegerValueType__Group_3__4 : rule__IntegerValueType__Group_3__4__Impl ;
    public final void rule__IntegerValueType__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5725:1: ( rule__IntegerValueType__Group_3__4__Impl )
            // InternalQLS.g:5726:2: rule__IntegerValueType__Group_3__4__Impl
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
    // InternalQLS.g:5732:1: rule__IntegerValueType__Group_3__4__Impl : ( '}' ) ;
    public final void rule__IntegerValueType__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5736:1: ( ( '}' ) )
            // InternalQLS.g:5737:1: ( '}' )
            {
            // InternalQLS.g:5737:1: ( '}' )
            // InternalQLS.g:5738:2: '}'
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
    // InternalQLS.g:5748:1: rule__IntegerValueType__Group_3_1__0 : rule__IntegerValueType__Group_3_1__0__Impl rule__IntegerValueType__Group_3_1__1 ;
    public final void rule__IntegerValueType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5752:1: ( rule__IntegerValueType__Group_3_1__0__Impl rule__IntegerValueType__Group_3_1__1 )
            // InternalQLS.g:5753:2: rule__IntegerValueType__Group_3_1__0__Impl rule__IntegerValueType__Group_3_1__1
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
    // InternalQLS.g:5760:1: rule__IntegerValueType__Group_3_1__0__Impl : ( 'unit' ) ;
    public final void rule__IntegerValueType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5764:1: ( ( 'unit' ) )
            // InternalQLS.g:5765:1: ( 'unit' )
            {
            // InternalQLS.g:5765:1: ( 'unit' )
            // InternalQLS.g:5766:2: 'unit'
            {
             before(grammarAccess.getIntegerValueTypeAccess().getUnitKeyword_3_1_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalQLS.g:5775:1: rule__IntegerValueType__Group_3_1__1 : rule__IntegerValueType__Group_3_1__1__Impl ;
    public final void rule__IntegerValueType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5779:1: ( rule__IntegerValueType__Group_3_1__1__Impl )
            // InternalQLS.g:5780:2: rule__IntegerValueType__Group_3_1__1__Impl
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
    // InternalQLS.g:5786:1: rule__IntegerValueType__Group_3_1__1__Impl : ( ( rule__IntegerValueType__UnitAssignment_3_1_1 ) ) ;
    public final void rule__IntegerValueType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5790:1: ( ( ( rule__IntegerValueType__UnitAssignment_3_1_1 ) ) )
            // InternalQLS.g:5791:1: ( ( rule__IntegerValueType__UnitAssignment_3_1_1 ) )
            {
            // InternalQLS.g:5791:1: ( ( rule__IntegerValueType__UnitAssignment_3_1_1 ) )
            // InternalQLS.g:5792:2: ( rule__IntegerValueType__UnitAssignment_3_1_1 )
            {
             before(grammarAccess.getIntegerValueTypeAccess().getUnitAssignment_3_1_1()); 
            // InternalQLS.g:5793:2: ( rule__IntegerValueType__UnitAssignment_3_1_1 )
            // InternalQLS.g:5793:3: rule__IntegerValueType__UnitAssignment_3_1_1
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
    // InternalQLS.g:5802:1: rule__IntegerValueType__Group_3_2__0 : rule__IntegerValueType__Group_3_2__0__Impl rule__IntegerValueType__Group_3_2__1 ;
    public final void rule__IntegerValueType__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5806:1: ( rule__IntegerValueType__Group_3_2__0__Impl rule__IntegerValueType__Group_3_2__1 )
            // InternalQLS.g:5807:2: rule__IntegerValueType__Group_3_2__0__Impl rule__IntegerValueType__Group_3_2__1
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
    // InternalQLS.g:5814:1: rule__IntegerValueType__Group_3_2__0__Impl : ( 'min' ) ;
    public final void rule__IntegerValueType__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5818:1: ( ( 'min' ) )
            // InternalQLS.g:5819:1: ( 'min' )
            {
            // InternalQLS.g:5819:1: ( 'min' )
            // InternalQLS.g:5820:2: 'min'
            {
             before(grammarAccess.getIntegerValueTypeAccess().getMinKeyword_3_2_0()); 
            match(input,68,FOLLOW_2); 
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
    // InternalQLS.g:5829:1: rule__IntegerValueType__Group_3_2__1 : rule__IntegerValueType__Group_3_2__1__Impl ;
    public final void rule__IntegerValueType__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5833:1: ( rule__IntegerValueType__Group_3_2__1__Impl )
            // InternalQLS.g:5834:2: rule__IntegerValueType__Group_3_2__1__Impl
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
    // InternalQLS.g:5840:1: rule__IntegerValueType__Group_3_2__1__Impl : ( ( rule__IntegerValueType__MinAssignment_3_2_1 ) ) ;
    public final void rule__IntegerValueType__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5844:1: ( ( ( rule__IntegerValueType__MinAssignment_3_2_1 ) ) )
            // InternalQLS.g:5845:1: ( ( rule__IntegerValueType__MinAssignment_3_2_1 ) )
            {
            // InternalQLS.g:5845:1: ( ( rule__IntegerValueType__MinAssignment_3_2_1 ) )
            // InternalQLS.g:5846:2: ( rule__IntegerValueType__MinAssignment_3_2_1 )
            {
             before(grammarAccess.getIntegerValueTypeAccess().getMinAssignment_3_2_1()); 
            // InternalQLS.g:5847:2: ( rule__IntegerValueType__MinAssignment_3_2_1 )
            // InternalQLS.g:5847:3: rule__IntegerValueType__MinAssignment_3_2_1
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
    // InternalQLS.g:5856:1: rule__IntegerValueType__Group_3_3__0 : rule__IntegerValueType__Group_3_3__0__Impl rule__IntegerValueType__Group_3_3__1 ;
    public final void rule__IntegerValueType__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5860:1: ( rule__IntegerValueType__Group_3_3__0__Impl rule__IntegerValueType__Group_3_3__1 )
            // InternalQLS.g:5861:2: rule__IntegerValueType__Group_3_3__0__Impl rule__IntegerValueType__Group_3_3__1
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
    // InternalQLS.g:5868:1: rule__IntegerValueType__Group_3_3__0__Impl : ( 'max' ) ;
    public final void rule__IntegerValueType__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5872:1: ( ( 'max' ) )
            // InternalQLS.g:5873:1: ( 'max' )
            {
            // InternalQLS.g:5873:1: ( 'max' )
            // InternalQLS.g:5874:2: 'max'
            {
             before(grammarAccess.getIntegerValueTypeAccess().getMaxKeyword_3_3_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalQLS.g:5883:1: rule__IntegerValueType__Group_3_3__1 : rule__IntegerValueType__Group_3_3__1__Impl ;
    public final void rule__IntegerValueType__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5887:1: ( rule__IntegerValueType__Group_3_3__1__Impl )
            // InternalQLS.g:5888:2: rule__IntegerValueType__Group_3_3__1__Impl
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
    // InternalQLS.g:5894:1: rule__IntegerValueType__Group_3_3__1__Impl : ( ( rule__IntegerValueType__MaxAssignment_3_3_1 ) ) ;
    public final void rule__IntegerValueType__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5898:1: ( ( ( rule__IntegerValueType__MaxAssignment_3_3_1 ) ) )
            // InternalQLS.g:5899:1: ( ( rule__IntegerValueType__MaxAssignment_3_3_1 ) )
            {
            // InternalQLS.g:5899:1: ( ( rule__IntegerValueType__MaxAssignment_3_3_1 ) )
            // InternalQLS.g:5900:2: ( rule__IntegerValueType__MaxAssignment_3_3_1 )
            {
             before(grammarAccess.getIntegerValueTypeAccess().getMaxAssignment_3_3_1()); 
            // InternalQLS.g:5901:2: ( rule__IntegerValueType__MaxAssignment_3_3_1 )
            // InternalQLS.g:5901:3: rule__IntegerValueType__MaxAssignment_3_3_1
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
    // InternalQLS.g:5910:1: rule__DecimalValueType__Group__0 : rule__DecimalValueType__Group__0__Impl rule__DecimalValueType__Group__1 ;
    public final void rule__DecimalValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5914:1: ( rule__DecimalValueType__Group__0__Impl rule__DecimalValueType__Group__1 )
            // InternalQLS.g:5915:2: rule__DecimalValueType__Group__0__Impl rule__DecimalValueType__Group__1
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
    // InternalQLS.g:5922:1: rule__DecimalValueType__Group__0__Impl : ( () ) ;
    public final void rule__DecimalValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5926:1: ( ( () ) )
            // InternalQLS.g:5927:1: ( () )
            {
            // InternalQLS.g:5927:1: ( () )
            // InternalQLS.g:5928:2: ()
            {
             before(grammarAccess.getDecimalValueTypeAccess().getDecimalValueTypeAction_0()); 
            // InternalQLS.g:5929:2: ()
            // InternalQLS.g:5929:3: 
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
    // InternalQLS.g:5937:1: rule__DecimalValueType__Group__1 : rule__DecimalValueType__Group__1__Impl rule__DecimalValueType__Group__2 ;
    public final void rule__DecimalValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5941:1: ( rule__DecimalValueType__Group__1__Impl rule__DecimalValueType__Group__2 )
            // InternalQLS.g:5942:2: rule__DecimalValueType__Group__1__Impl rule__DecimalValueType__Group__2
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
    // InternalQLS.g:5949:1: rule__DecimalValueType__Group__1__Impl : ( 'decimalType' ) ;
    public final void rule__DecimalValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5953:1: ( ( 'decimalType' ) )
            // InternalQLS.g:5954:1: ( 'decimalType' )
            {
            // InternalQLS.g:5954:1: ( 'decimalType' )
            // InternalQLS.g:5955:2: 'decimalType'
            {
             before(grammarAccess.getDecimalValueTypeAccess().getDecimalTypeKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalQLS.g:5964:1: rule__DecimalValueType__Group__2 : rule__DecimalValueType__Group__2__Impl rule__DecimalValueType__Group__3 ;
    public final void rule__DecimalValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5968:1: ( rule__DecimalValueType__Group__2__Impl rule__DecimalValueType__Group__3 )
            // InternalQLS.g:5969:2: rule__DecimalValueType__Group__2__Impl rule__DecimalValueType__Group__3
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
    // InternalQLS.g:5976:1: rule__DecimalValueType__Group__2__Impl : ( ( rule__DecimalValueType__NameAssignment_2 ) ) ;
    public final void rule__DecimalValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5980:1: ( ( ( rule__DecimalValueType__NameAssignment_2 ) ) )
            // InternalQLS.g:5981:1: ( ( rule__DecimalValueType__NameAssignment_2 ) )
            {
            // InternalQLS.g:5981:1: ( ( rule__DecimalValueType__NameAssignment_2 ) )
            // InternalQLS.g:5982:2: ( rule__DecimalValueType__NameAssignment_2 )
            {
             before(grammarAccess.getDecimalValueTypeAccess().getNameAssignment_2()); 
            // InternalQLS.g:5983:2: ( rule__DecimalValueType__NameAssignment_2 )
            // InternalQLS.g:5983:3: rule__DecimalValueType__NameAssignment_2
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
    // InternalQLS.g:5991:1: rule__DecimalValueType__Group__3 : rule__DecimalValueType__Group__3__Impl ;
    public final void rule__DecimalValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5995:1: ( rule__DecimalValueType__Group__3__Impl )
            // InternalQLS.g:5996:2: rule__DecimalValueType__Group__3__Impl
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
    // InternalQLS.g:6002:1: rule__DecimalValueType__Group__3__Impl : ( ( rule__DecimalValueType__Group_3__0 )? ) ;
    public final void rule__DecimalValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6006:1: ( ( ( rule__DecimalValueType__Group_3__0 )? ) )
            // InternalQLS.g:6007:1: ( ( rule__DecimalValueType__Group_3__0 )? )
            {
            // InternalQLS.g:6007:1: ( ( rule__DecimalValueType__Group_3__0 )? )
            // InternalQLS.g:6008:2: ( rule__DecimalValueType__Group_3__0 )?
            {
             before(grammarAccess.getDecimalValueTypeAccess().getGroup_3()); 
            // InternalQLS.g:6009:2: ( rule__DecimalValueType__Group_3__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==44) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalQLS.g:6009:3: rule__DecimalValueType__Group_3__0
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
    // InternalQLS.g:6018:1: rule__DecimalValueType__Group_3__0 : rule__DecimalValueType__Group_3__0__Impl rule__DecimalValueType__Group_3__1 ;
    public final void rule__DecimalValueType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6022:1: ( rule__DecimalValueType__Group_3__0__Impl rule__DecimalValueType__Group_3__1 )
            // InternalQLS.g:6023:2: rule__DecimalValueType__Group_3__0__Impl rule__DecimalValueType__Group_3__1
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
    // InternalQLS.g:6030:1: rule__DecimalValueType__Group_3__0__Impl : ( '{' ) ;
    public final void rule__DecimalValueType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6034:1: ( ( '{' ) )
            // InternalQLS.g:6035:1: ( '{' )
            {
            // InternalQLS.g:6035:1: ( '{' )
            // InternalQLS.g:6036:2: '{'
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
    // InternalQLS.g:6045:1: rule__DecimalValueType__Group_3__1 : rule__DecimalValueType__Group_3__1__Impl rule__DecimalValueType__Group_3__2 ;
    public final void rule__DecimalValueType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6049:1: ( rule__DecimalValueType__Group_3__1__Impl rule__DecimalValueType__Group_3__2 )
            // InternalQLS.g:6050:2: rule__DecimalValueType__Group_3__1__Impl rule__DecimalValueType__Group_3__2
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
    // InternalQLS.g:6057:1: rule__DecimalValueType__Group_3__1__Impl : ( ( rule__DecimalValueType__Group_3_1__0 )? ) ;
    public final void rule__DecimalValueType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6061:1: ( ( ( rule__DecimalValueType__Group_3_1__0 )? ) )
            // InternalQLS.g:6062:1: ( ( rule__DecimalValueType__Group_3_1__0 )? )
            {
            // InternalQLS.g:6062:1: ( ( rule__DecimalValueType__Group_3_1__0 )? )
            // InternalQLS.g:6063:2: ( rule__DecimalValueType__Group_3_1__0 )?
            {
             before(grammarAccess.getDecimalValueTypeAccess().getGroup_3_1()); 
            // InternalQLS.g:6064:2: ( rule__DecimalValueType__Group_3_1__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==65) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalQLS.g:6064:3: rule__DecimalValueType__Group_3_1__0
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
    // InternalQLS.g:6072:1: rule__DecimalValueType__Group_3__2 : rule__DecimalValueType__Group_3__2__Impl ;
    public final void rule__DecimalValueType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6076:1: ( rule__DecimalValueType__Group_3__2__Impl )
            // InternalQLS.g:6077:2: rule__DecimalValueType__Group_3__2__Impl
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
    // InternalQLS.g:6083:1: rule__DecimalValueType__Group_3__2__Impl : ( '}' ) ;
    public final void rule__DecimalValueType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6087:1: ( ( '}' ) )
            // InternalQLS.g:6088:1: ( '}' )
            {
            // InternalQLS.g:6088:1: ( '}' )
            // InternalQLS.g:6089:2: '}'
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
    // InternalQLS.g:6099:1: rule__DecimalValueType__Group_3_1__0 : rule__DecimalValueType__Group_3_1__0__Impl rule__DecimalValueType__Group_3_1__1 ;
    public final void rule__DecimalValueType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6103:1: ( rule__DecimalValueType__Group_3_1__0__Impl rule__DecimalValueType__Group_3_1__1 )
            // InternalQLS.g:6104:2: rule__DecimalValueType__Group_3_1__0__Impl rule__DecimalValueType__Group_3_1__1
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
    // InternalQLS.g:6111:1: rule__DecimalValueType__Group_3_1__0__Impl : ( 'unit' ) ;
    public final void rule__DecimalValueType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6115:1: ( ( 'unit' ) )
            // InternalQLS.g:6116:1: ( 'unit' )
            {
            // InternalQLS.g:6116:1: ( 'unit' )
            // InternalQLS.g:6117:2: 'unit'
            {
             before(grammarAccess.getDecimalValueTypeAccess().getUnitKeyword_3_1_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalQLS.g:6126:1: rule__DecimalValueType__Group_3_1__1 : rule__DecimalValueType__Group_3_1__1__Impl ;
    public final void rule__DecimalValueType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6130:1: ( rule__DecimalValueType__Group_3_1__1__Impl )
            // InternalQLS.g:6131:2: rule__DecimalValueType__Group_3_1__1__Impl
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
    // InternalQLS.g:6137:1: rule__DecimalValueType__Group_3_1__1__Impl : ( ( rule__DecimalValueType__UnitAssignment_3_1_1 ) ) ;
    public final void rule__DecimalValueType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6141:1: ( ( ( rule__DecimalValueType__UnitAssignment_3_1_1 ) ) )
            // InternalQLS.g:6142:1: ( ( rule__DecimalValueType__UnitAssignment_3_1_1 ) )
            {
            // InternalQLS.g:6142:1: ( ( rule__DecimalValueType__UnitAssignment_3_1_1 ) )
            // InternalQLS.g:6143:2: ( rule__DecimalValueType__UnitAssignment_3_1_1 )
            {
             before(grammarAccess.getDecimalValueTypeAccess().getUnitAssignment_3_1_1()); 
            // InternalQLS.g:6144:2: ( rule__DecimalValueType__UnitAssignment_3_1_1 )
            // InternalQLS.g:6144:3: rule__DecimalValueType__UnitAssignment_3_1_1
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
    // InternalQLS.g:6153:1: rule__DateValueType__Group__0 : rule__DateValueType__Group__0__Impl rule__DateValueType__Group__1 ;
    public final void rule__DateValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6157:1: ( rule__DateValueType__Group__0__Impl rule__DateValueType__Group__1 )
            // InternalQLS.g:6158:2: rule__DateValueType__Group__0__Impl rule__DateValueType__Group__1
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
    // InternalQLS.g:6165:1: rule__DateValueType__Group__0__Impl : ( () ) ;
    public final void rule__DateValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6169:1: ( ( () ) )
            // InternalQLS.g:6170:1: ( () )
            {
            // InternalQLS.g:6170:1: ( () )
            // InternalQLS.g:6171:2: ()
            {
             before(grammarAccess.getDateValueTypeAccess().getDateValueTypeAction_0()); 
            // InternalQLS.g:6172:2: ()
            // InternalQLS.g:6172:3: 
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
    // InternalQLS.g:6180:1: rule__DateValueType__Group__1 : rule__DateValueType__Group__1__Impl rule__DateValueType__Group__2 ;
    public final void rule__DateValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6184:1: ( rule__DateValueType__Group__1__Impl rule__DateValueType__Group__2 )
            // InternalQLS.g:6185:2: rule__DateValueType__Group__1__Impl rule__DateValueType__Group__2
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
    // InternalQLS.g:6192:1: rule__DateValueType__Group__1__Impl : ( 'dateType' ) ;
    public final void rule__DateValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6196:1: ( ( 'dateType' ) )
            // InternalQLS.g:6197:1: ( 'dateType' )
            {
            // InternalQLS.g:6197:1: ( 'dateType' )
            // InternalQLS.g:6198:2: 'dateType'
            {
             before(grammarAccess.getDateValueTypeAccess().getDateTypeKeyword_1()); 
            match(input,71,FOLLOW_2); 
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
    // InternalQLS.g:6207:1: rule__DateValueType__Group__2 : rule__DateValueType__Group__2__Impl rule__DateValueType__Group__3 ;
    public final void rule__DateValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6211:1: ( rule__DateValueType__Group__2__Impl rule__DateValueType__Group__3 )
            // InternalQLS.g:6212:2: rule__DateValueType__Group__2__Impl rule__DateValueType__Group__3
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
    // InternalQLS.g:6219:1: rule__DateValueType__Group__2__Impl : ( ( rule__DateValueType__NameAssignment_2 ) ) ;
    public final void rule__DateValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6223:1: ( ( ( rule__DateValueType__NameAssignment_2 ) ) )
            // InternalQLS.g:6224:1: ( ( rule__DateValueType__NameAssignment_2 ) )
            {
            // InternalQLS.g:6224:1: ( ( rule__DateValueType__NameAssignment_2 ) )
            // InternalQLS.g:6225:2: ( rule__DateValueType__NameAssignment_2 )
            {
             before(grammarAccess.getDateValueTypeAccess().getNameAssignment_2()); 
            // InternalQLS.g:6226:2: ( rule__DateValueType__NameAssignment_2 )
            // InternalQLS.g:6226:3: rule__DateValueType__NameAssignment_2
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
    // InternalQLS.g:6234:1: rule__DateValueType__Group__3 : rule__DateValueType__Group__3__Impl ;
    public final void rule__DateValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6238:1: ( rule__DateValueType__Group__3__Impl )
            // InternalQLS.g:6239:2: rule__DateValueType__Group__3__Impl
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
    // InternalQLS.g:6245:1: rule__DateValueType__Group__3__Impl : ( ( rule__DateValueType__Group_3__0 )? ) ;
    public final void rule__DateValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6249:1: ( ( ( rule__DateValueType__Group_3__0 )? ) )
            // InternalQLS.g:6250:1: ( ( rule__DateValueType__Group_3__0 )? )
            {
            // InternalQLS.g:6250:1: ( ( rule__DateValueType__Group_3__0 )? )
            // InternalQLS.g:6251:2: ( rule__DateValueType__Group_3__0 )?
            {
             before(grammarAccess.getDateValueTypeAccess().getGroup_3()); 
            // InternalQLS.g:6252:2: ( rule__DateValueType__Group_3__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==44) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalQLS.g:6252:3: rule__DateValueType__Group_3__0
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
    // InternalQLS.g:6261:1: rule__DateValueType__Group_3__0 : rule__DateValueType__Group_3__0__Impl rule__DateValueType__Group_3__1 ;
    public final void rule__DateValueType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6265:1: ( rule__DateValueType__Group_3__0__Impl rule__DateValueType__Group_3__1 )
            // InternalQLS.g:6266:2: rule__DateValueType__Group_3__0__Impl rule__DateValueType__Group_3__1
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
    // InternalQLS.g:6273:1: rule__DateValueType__Group_3__0__Impl : ( '{' ) ;
    public final void rule__DateValueType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6277:1: ( ( '{' ) )
            // InternalQLS.g:6278:1: ( '{' )
            {
            // InternalQLS.g:6278:1: ( '{' )
            // InternalQLS.g:6279:2: '{'
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
    // InternalQLS.g:6288:1: rule__DateValueType__Group_3__1 : rule__DateValueType__Group_3__1__Impl rule__DateValueType__Group_3__2 ;
    public final void rule__DateValueType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6292:1: ( rule__DateValueType__Group_3__1__Impl rule__DateValueType__Group_3__2 )
            // InternalQLS.g:6293:2: rule__DateValueType__Group_3__1__Impl rule__DateValueType__Group_3__2
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
    // InternalQLS.g:6300:1: rule__DateValueType__Group_3__1__Impl : ( ( rule__DateValueType__Group_3_1__0 )? ) ;
    public final void rule__DateValueType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6304:1: ( ( ( rule__DateValueType__Group_3_1__0 )? ) )
            // InternalQLS.g:6305:1: ( ( rule__DateValueType__Group_3_1__0 )? )
            {
            // InternalQLS.g:6305:1: ( ( rule__DateValueType__Group_3_1__0 )? )
            // InternalQLS.g:6306:2: ( rule__DateValueType__Group_3_1__0 )?
            {
             before(grammarAccess.getDateValueTypeAccess().getGroup_3_1()); 
            // InternalQLS.g:6307:2: ( rule__DateValueType__Group_3_1__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==65) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalQLS.g:6307:3: rule__DateValueType__Group_3_1__0
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
    // InternalQLS.g:6315:1: rule__DateValueType__Group_3__2 : rule__DateValueType__Group_3__2__Impl ;
    public final void rule__DateValueType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6319:1: ( rule__DateValueType__Group_3__2__Impl )
            // InternalQLS.g:6320:2: rule__DateValueType__Group_3__2__Impl
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
    // InternalQLS.g:6326:1: rule__DateValueType__Group_3__2__Impl : ( '}' ) ;
    public final void rule__DateValueType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6330:1: ( ( '}' ) )
            // InternalQLS.g:6331:1: ( '}' )
            {
            // InternalQLS.g:6331:1: ( '}' )
            // InternalQLS.g:6332:2: '}'
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
    // InternalQLS.g:6342:1: rule__DateValueType__Group_3_1__0 : rule__DateValueType__Group_3_1__0__Impl rule__DateValueType__Group_3_1__1 ;
    public final void rule__DateValueType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6346:1: ( rule__DateValueType__Group_3_1__0__Impl rule__DateValueType__Group_3_1__1 )
            // InternalQLS.g:6347:2: rule__DateValueType__Group_3_1__0__Impl rule__DateValueType__Group_3_1__1
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
    // InternalQLS.g:6354:1: rule__DateValueType__Group_3_1__0__Impl : ( 'unit' ) ;
    public final void rule__DateValueType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6358:1: ( ( 'unit' ) )
            // InternalQLS.g:6359:1: ( 'unit' )
            {
            // InternalQLS.g:6359:1: ( 'unit' )
            // InternalQLS.g:6360:2: 'unit'
            {
             before(grammarAccess.getDateValueTypeAccess().getUnitKeyword_3_1_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalQLS.g:6369:1: rule__DateValueType__Group_3_1__1 : rule__DateValueType__Group_3_1__1__Impl ;
    public final void rule__DateValueType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6373:1: ( rule__DateValueType__Group_3_1__1__Impl )
            // InternalQLS.g:6374:2: rule__DateValueType__Group_3_1__1__Impl
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
    // InternalQLS.g:6380:1: rule__DateValueType__Group_3_1__1__Impl : ( ( rule__DateValueType__UnitAssignment_3_1_1 ) ) ;
    public final void rule__DateValueType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6384:1: ( ( ( rule__DateValueType__UnitAssignment_3_1_1 ) ) )
            // InternalQLS.g:6385:1: ( ( rule__DateValueType__UnitAssignment_3_1_1 ) )
            {
            // InternalQLS.g:6385:1: ( ( rule__DateValueType__UnitAssignment_3_1_1 ) )
            // InternalQLS.g:6386:2: ( rule__DateValueType__UnitAssignment_3_1_1 )
            {
             before(grammarAccess.getDateValueTypeAccess().getUnitAssignment_3_1_1()); 
            // InternalQLS.g:6387:2: ( rule__DateValueType__UnitAssignment_3_1_1 )
            // InternalQLS.g:6387:3: rule__DateValueType__UnitAssignment_3_1_1
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
    // InternalQLS.g:6396:1: rule__EnumerationValueType__Group__0 : rule__EnumerationValueType__Group__0__Impl rule__EnumerationValueType__Group__1 ;
    public final void rule__EnumerationValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6400:1: ( rule__EnumerationValueType__Group__0__Impl rule__EnumerationValueType__Group__1 )
            // InternalQLS.g:6401:2: rule__EnumerationValueType__Group__0__Impl rule__EnumerationValueType__Group__1
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
    // InternalQLS.g:6408:1: rule__EnumerationValueType__Group__0__Impl : ( () ) ;
    public final void rule__EnumerationValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6412:1: ( ( () ) )
            // InternalQLS.g:6413:1: ( () )
            {
            // InternalQLS.g:6413:1: ( () )
            // InternalQLS.g:6414:2: ()
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getEnumerationValueTypeAction_0()); 
            // InternalQLS.g:6415:2: ()
            // InternalQLS.g:6415:3: 
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
    // InternalQLS.g:6423:1: rule__EnumerationValueType__Group__1 : rule__EnumerationValueType__Group__1__Impl rule__EnumerationValueType__Group__2 ;
    public final void rule__EnumerationValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6427:1: ( rule__EnumerationValueType__Group__1__Impl rule__EnumerationValueType__Group__2 )
            // InternalQLS.g:6428:2: rule__EnumerationValueType__Group__1__Impl rule__EnumerationValueType__Group__2
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
    // InternalQLS.g:6435:1: rule__EnumerationValueType__Group__1__Impl : ( 'enumerationType' ) ;
    public final void rule__EnumerationValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6439:1: ( ( 'enumerationType' ) )
            // InternalQLS.g:6440:1: ( 'enumerationType' )
            {
            // InternalQLS.g:6440:1: ( 'enumerationType' )
            // InternalQLS.g:6441:2: 'enumerationType'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getEnumerationTypeKeyword_1()); 
            match(input,72,FOLLOW_2); 
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
    // InternalQLS.g:6450:1: rule__EnumerationValueType__Group__2 : rule__EnumerationValueType__Group__2__Impl rule__EnumerationValueType__Group__3 ;
    public final void rule__EnumerationValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6454:1: ( rule__EnumerationValueType__Group__2__Impl rule__EnumerationValueType__Group__3 )
            // InternalQLS.g:6455:2: rule__EnumerationValueType__Group__2__Impl rule__EnumerationValueType__Group__3
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
    // InternalQLS.g:6462:1: rule__EnumerationValueType__Group__2__Impl : ( ( rule__EnumerationValueType__NameAssignment_2 ) ) ;
    public final void rule__EnumerationValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6466:1: ( ( ( rule__EnumerationValueType__NameAssignment_2 ) ) )
            // InternalQLS.g:6467:1: ( ( rule__EnumerationValueType__NameAssignment_2 ) )
            {
            // InternalQLS.g:6467:1: ( ( rule__EnumerationValueType__NameAssignment_2 ) )
            // InternalQLS.g:6468:2: ( rule__EnumerationValueType__NameAssignment_2 )
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getNameAssignment_2()); 
            // InternalQLS.g:6469:2: ( rule__EnumerationValueType__NameAssignment_2 )
            // InternalQLS.g:6469:3: rule__EnumerationValueType__NameAssignment_2
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
    // InternalQLS.g:6477:1: rule__EnumerationValueType__Group__3 : rule__EnumerationValueType__Group__3__Impl ;
    public final void rule__EnumerationValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6481:1: ( rule__EnumerationValueType__Group__3__Impl )
            // InternalQLS.g:6482:2: rule__EnumerationValueType__Group__3__Impl
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
    // InternalQLS.g:6488:1: rule__EnumerationValueType__Group__3__Impl : ( ( rule__EnumerationValueType__Group_3__0 )? ) ;
    public final void rule__EnumerationValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6492:1: ( ( ( rule__EnumerationValueType__Group_3__0 )? ) )
            // InternalQLS.g:6493:1: ( ( rule__EnumerationValueType__Group_3__0 )? )
            {
            // InternalQLS.g:6493:1: ( ( rule__EnumerationValueType__Group_3__0 )? )
            // InternalQLS.g:6494:2: ( rule__EnumerationValueType__Group_3__0 )?
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getGroup_3()); 
            // InternalQLS.g:6495:2: ( rule__EnumerationValueType__Group_3__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==44) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalQLS.g:6495:3: rule__EnumerationValueType__Group_3__0
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
    // InternalQLS.g:6504:1: rule__EnumerationValueType__Group_3__0 : rule__EnumerationValueType__Group_3__0__Impl rule__EnumerationValueType__Group_3__1 ;
    public final void rule__EnumerationValueType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6508:1: ( rule__EnumerationValueType__Group_3__0__Impl rule__EnumerationValueType__Group_3__1 )
            // InternalQLS.g:6509:2: rule__EnumerationValueType__Group_3__0__Impl rule__EnumerationValueType__Group_3__1
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
    // InternalQLS.g:6516:1: rule__EnumerationValueType__Group_3__0__Impl : ( '{' ) ;
    public final void rule__EnumerationValueType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6520:1: ( ( '{' ) )
            // InternalQLS.g:6521:1: ( '{' )
            {
            // InternalQLS.g:6521:1: ( '{' )
            // InternalQLS.g:6522:2: '{'
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
    // InternalQLS.g:6531:1: rule__EnumerationValueType__Group_3__1 : rule__EnumerationValueType__Group_3__1__Impl rule__EnumerationValueType__Group_3__2 ;
    public final void rule__EnumerationValueType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6535:1: ( rule__EnumerationValueType__Group_3__1__Impl rule__EnumerationValueType__Group_3__2 )
            // InternalQLS.g:6536:2: rule__EnumerationValueType__Group_3__1__Impl rule__EnumerationValueType__Group_3__2
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
    // InternalQLS.g:6543:1: rule__EnumerationValueType__Group_3__1__Impl : ( ( rule__EnumerationValueType__Group_3_1__0 )? ) ;
    public final void rule__EnumerationValueType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6547:1: ( ( ( rule__EnumerationValueType__Group_3_1__0 )? ) )
            // InternalQLS.g:6548:1: ( ( rule__EnumerationValueType__Group_3_1__0 )? )
            {
            // InternalQLS.g:6548:1: ( ( rule__EnumerationValueType__Group_3_1__0 )? )
            // InternalQLS.g:6549:2: ( rule__EnumerationValueType__Group_3_1__0 )?
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getGroup_3_1()); 
            // InternalQLS.g:6550:2: ( rule__EnumerationValueType__Group_3_1__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==65) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalQLS.g:6550:3: rule__EnumerationValueType__Group_3_1__0
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
    // InternalQLS.g:6558:1: rule__EnumerationValueType__Group_3__2 : rule__EnumerationValueType__Group_3__2__Impl rule__EnumerationValueType__Group_3__3 ;
    public final void rule__EnumerationValueType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6562:1: ( rule__EnumerationValueType__Group_3__2__Impl rule__EnumerationValueType__Group_3__3 )
            // InternalQLS.g:6563:2: rule__EnumerationValueType__Group_3__2__Impl rule__EnumerationValueType__Group_3__3
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
    // InternalQLS.g:6570:1: rule__EnumerationValueType__Group_3__2__Impl : ( ( rule__EnumerationValueType__Group_3_2__0 )? ) ;
    public final void rule__EnumerationValueType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6574:1: ( ( ( rule__EnumerationValueType__Group_3_2__0 )? ) )
            // InternalQLS.g:6575:1: ( ( rule__EnumerationValueType__Group_3_2__0 )? )
            {
            // InternalQLS.g:6575:1: ( ( rule__EnumerationValueType__Group_3_2__0 )? )
            // InternalQLS.g:6576:2: ( rule__EnumerationValueType__Group_3_2__0 )?
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getGroup_3_2()); 
            // InternalQLS.g:6577:2: ( rule__EnumerationValueType__Group_3_2__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==73) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalQLS.g:6577:3: rule__EnumerationValueType__Group_3_2__0
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
    // InternalQLS.g:6585:1: rule__EnumerationValueType__Group_3__3 : rule__EnumerationValueType__Group_3__3__Impl ;
    public final void rule__EnumerationValueType__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6589:1: ( rule__EnumerationValueType__Group_3__3__Impl )
            // InternalQLS.g:6590:2: rule__EnumerationValueType__Group_3__3__Impl
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
    // InternalQLS.g:6596:1: rule__EnumerationValueType__Group_3__3__Impl : ( '}' ) ;
    public final void rule__EnumerationValueType__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6600:1: ( ( '}' ) )
            // InternalQLS.g:6601:1: ( '}' )
            {
            // InternalQLS.g:6601:1: ( '}' )
            // InternalQLS.g:6602:2: '}'
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
    // InternalQLS.g:6612:1: rule__EnumerationValueType__Group_3_1__0 : rule__EnumerationValueType__Group_3_1__0__Impl rule__EnumerationValueType__Group_3_1__1 ;
    public final void rule__EnumerationValueType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6616:1: ( rule__EnumerationValueType__Group_3_1__0__Impl rule__EnumerationValueType__Group_3_1__1 )
            // InternalQLS.g:6617:2: rule__EnumerationValueType__Group_3_1__0__Impl rule__EnumerationValueType__Group_3_1__1
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
    // InternalQLS.g:6624:1: rule__EnumerationValueType__Group_3_1__0__Impl : ( 'unit' ) ;
    public final void rule__EnumerationValueType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6628:1: ( ( 'unit' ) )
            // InternalQLS.g:6629:1: ( 'unit' )
            {
            // InternalQLS.g:6629:1: ( 'unit' )
            // InternalQLS.g:6630:2: 'unit'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getUnitKeyword_3_1_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalQLS.g:6639:1: rule__EnumerationValueType__Group_3_1__1 : rule__EnumerationValueType__Group_3_1__1__Impl ;
    public final void rule__EnumerationValueType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6643:1: ( rule__EnumerationValueType__Group_3_1__1__Impl )
            // InternalQLS.g:6644:2: rule__EnumerationValueType__Group_3_1__1__Impl
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
    // InternalQLS.g:6650:1: rule__EnumerationValueType__Group_3_1__1__Impl : ( ( rule__EnumerationValueType__UnitAssignment_3_1_1 ) ) ;
    public final void rule__EnumerationValueType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6654:1: ( ( ( rule__EnumerationValueType__UnitAssignment_3_1_1 ) ) )
            // InternalQLS.g:6655:1: ( ( rule__EnumerationValueType__UnitAssignment_3_1_1 ) )
            {
            // InternalQLS.g:6655:1: ( ( rule__EnumerationValueType__UnitAssignment_3_1_1 ) )
            // InternalQLS.g:6656:2: ( rule__EnumerationValueType__UnitAssignment_3_1_1 )
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getUnitAssignment_3_1_1()); 
            // InternalQLS.g:6657:2: ( rule__EnumerationValueType__UnitAssignment_3_1_1 )
            // InternalQLS.g:6657:3: rule__EnumerationValueType__UnitAssignment_3_1_1
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
    // InternalQLS.g:6666:1: rule__EnumerationValueType__Group_3_2__0 : rule__EnumerationValueType__Group_3_2__0__Impl rule__EnumerationValueType__Group_3_2__1 ;
    public final void rule__EnumerationValueType__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6670:1: ( rule__EnumerationValueType__Group_3_2__0__Impl rule__EnumerationValueType__Group_3_2__1 )
            // InternalQLS.g:6671:2: rule__EnumerationValueType__Group_3_2__0__Impl rule__EnumerationValueType__Group_3_2__1
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
    // InternalQLS.g:6678:1: rule__EnumerationValueType__Group_3_2__0__Impl : ( 'literals' ) ;
    public final void rule__EnumerationValueType__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6682:1: ( ( 'literals' ) )
            // InternalQLS.g:6683:1: ( 'literals' )
            {
            // InternalQLS.g:6683:1: ( 'literals' )
            // InternalQLS.g:6684:2: 'literals'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getLiteralsKeyword_3_2_0()); 
            match(input,73,FOLLOW_2); 
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
    // InternalQLS.g:6693:1: rule__EnumerationValueType__Group_3_2__1 : rule__EnumerationValueType__Group_3_2__1__Impl rule__EnumerationValueType__Group_3_2__2 ;
    public final void rule__EnumerationValueType__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6697:1: ( rule__EnumerationValueType__Group_3_2__1__Impl rule__EnumerationValueType__Group_3_2__2 )
            // InternalQLS.g:6698:2: rule__EnumerationValueType__Group_3_2__1__Impl rule__EnumerationValueType__Group_3_2__2
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
    // InternalQLS.g:6705:1: rule__EnumerationValueType__Group_3_2__1__Impl : ( '{' ) ;
    public final void rule__EnumerationValueType__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6709:1: ( ( '{' ) )
            // InternalQLS.g:6710:1: ( '{' )
            {
            // InternalQLS.g:6710:1: ( '{' )
            // InternalQLS.g:6711:2: '{'
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
    // InternalQLS.g:6720:1: rule__EnumerationValueType__Group_3_2__2 : rule__EnumerationValueType__Group_3_2__2__Impl rule__EnumerationValueType__Group_3_2__3 ;
    public final void rule__EnumerationValueType__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6724:1: ( rule__EnumerationValueType__Group_3_2__2__Impl rule__EnumerationValueType__Group_3_2__3 )
            // InternalQLS.g:6725:2: rule__EnumerationValueType__Group_3_2__2__Impl rule__EnumerationValueType__Group_3_2__3
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
    // InternalQLS.g:6732:1: rule__EnumerationValueType__Group_3_2__2__Impl : ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2 ) ) ;
    public final void rule__EnumerationValueType__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6736:1: ( ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2 ) ) )
            // InternalQLS.g:6737:1: ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2 ) )
            {
            // InternalQLS.g:6737:1: ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2 ) )
            // InternalQLS.g:6738:2: ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2 )
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsAssignment_3_2_2()); 
            // InternalQLS.g:6739:2: ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2 )
            // InternalQLS.g:6739:3: rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2
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
    // InternalQLS.g:6747:1: rule__EnumerationValueType__Group_3_2__3 : rule__EnumerationValueType__Group_3_2__3__Impl rule__EnumerationValueType__Group_3_2__4 ;
    public final void rule__EnumerationValueType__Group_3_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6751:1: ( rule__EnumerationValueType__Group_3_2__3__Impl rule__EnumerationValueType__Group_3_2__4 )
            // InternalQLS.g:6752:2: rule__EnumerationValueType__Group_3_2__3__Impl rule__EnumerationValueType__Group_3_2__4
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
    // InternalQLS.g:6759:1: rule__EnumerationValueType__Group_3_2__3__Impl : ( ( rule__EnumerationValueType__Group_3_2_3__0 )* ) ;
    public final void rule__EnumerationValueType__Group_3_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6763:1: ( ( ( rule__EnumerationValueType__Group_3_2_3__0 )* ) )
            // InternalQLS.g:6764:1: ( ( rule__EnumerationValueType__Group_3_2_3__0 )* )
            {
            // InternalQLS.g:6764:1: ( ( rule__EnumerationValueType__Group_3_2_3__0 )* )
            // InternalQLS.g:6765:2: ( rule__EnumerationValueType__Group_3_2_3__0 )*
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getGroup_3_2_3()); 
            // InternalQLS.g:6766:2: ( rule__EnumerationValueType__Group_3_2_3__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==74) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalQLS.g:6766:3: rule__EnumerationValueType__Group_3_2_3__0
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
    // InternalQLS.g:6774:1: rule__EnumerationValueType__Group_3_2__4 : rule__EnumerationValueType__Group_3_2__4__Impl ;
    public final void rule__EnumerationValueType__Group_3_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6778:1: ( rule__EnumerationValueType__Group_3_2__4__Impl )
            // InternalQLS.g:6779:2: rule__EnumerationValueType__Group_3_2__4__Impl
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
    // InternalQLS.g:6785:1: rule__EnumerationValueType__Group_3_2__4__Impl : ( '}' ) ;
    public final void rule__EnumerationValueType__Group_3_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6789:1: ( ( '}' ) )
            // InternalQLS.g:6790:1: ( '}' )
            {
            // InternalQLS.g:6790:1: ( '}' )
            // InternalQLS.g:6791:2: '}'
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
    // InternalQLS.g:6801:1: rule__EnumerationValueType__Group_3_2_3__0 : rule__EnumerationValueType__Group_3_2_3__0__Impl rule__EnumerationValueType__Group_3_2_3__1 ;
    public final void rule__EnumerationValueType__Group_3_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6805:1: ( rule__EnumerationValueType__Group_3_2_3__0__Impl rule__EnumerationValueType__Group_3_2_3__1 )
            // InternalQLS.g:6806:2: rule__EnumerationValueType__Group_3_2_3__0__Impl rule__EnumerationValueType__Group_3_2_3__1
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
    // InternalQLS.g:6813:1: rule__EnumerationValueType__Group_3_2_3__0__Impl : ( ',' ) ;
    public final void rule__EnumerationValueType__Group_3_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6817:1: ( ( ',' ) )
            // InternalQLS.g:6818:1: ( ',' )
            {
            // InternalQLS.g:6818:1: ( ',' )
            // InternalQLS.g:6819:2: ','
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getCommaKeyword_3_2_3_0()); 
            match(input,74,FOLLOW_2); 
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
    // InternalQLS.g:6828:1: rule__EnumerationValueType__Group_3_2_3__1 : rule__EnumerationValueType__Group_3_2_3__1__Impl ;
    public final void rule__EnumerationValueType__Group_3_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6832:1: ( rule__EnumerationValueType__Group_3_2_3__1__Impl )
            // InternalQLS.g:6833:2: rule__EnumerationValueType__Group_3_2_3__1__Impl
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
    // InternalQLS.g:6839:1: rule__EnumerationValueType__Group_3_2_3__1__Impl : ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1 ) ) ;
    public final void rule__EnumerationValueType__Group_3_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6843:1: ( ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1 ) ) )
            // InternalQLS.g:6844:1: ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1 ) )
            {
            // InternalQLS.g:6844:1: ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1 ) )
            // InternalQLS.g:6845:2: ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1 )
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsAssignment_3_2_3_1()); 
            // InternalQLS.g:6846:2: ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1 )
            // InternalQLS.g:6846:3: rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1
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
    // InternalQLS.g:6855:1: rule__StringValueType__Group__0 : rule__StringValueType__Group__0__Impl rule__StringValueType__Group__1 ;
    public final void rule__StringValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6859:1: ( rule__StringValueType__Group__0__Impl rule__StringValueType__Group__1 )
            // InternalQLS.g:6860:2: rule__StringValueType__Group__0__Impl rule__StringValueType__Group__1
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
    // InternalQLS.g:6867:1: rule__StringValueType__Group__0__Impl : ( () ) ;
    public final void rule__StringValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6871:1: ( ( () ) )
            // InternalQLS.g:6872:1: ( () )
            {
            // InternalQLS.g:6872:1: ( () )
            // InternalQLS.g:6873:2: ()
            {
             before(grammarAccess.getStringValueTypeAccess().getStringValueTypeAction_0()); 
            // InternalQLS.g:6874:2: ()
            // InternalQLS.g:6874:3: 
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
    // InternalQLS.g:6882:1: rule__StringValueType__Group__1 : rule__StringValueType__Group__1__Impl rule__StringValueType__Group__2 ;
    public final void rule__StringValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6886:1: ( rule__StringValueType__Group__1__Impl rule__StringValueType__Group__2 )
            // InternalQLS.g:6887:2: rule__StringValueType__Group__1__Impl rule__StringValueType__Group__2
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
    // InternalQLS.g:6894:1: rule__StringValueType__Group__1__Impl : ( 'StringType' ) ;
    public final void rule__StringValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6898:1: ( ( 'StringType' ) )
            // InternalQLS.g:6899:1: ( 'StringType' )
            {
            // InternalQLS.g:6899:1: ( 'StringType' )
            // InternalQLS.g:6900:2: 'StringType'
            {
             before(grammarAccess.getStringValueTypeAccess().getStringTypeKeyword_1()); 
            match(input,75,FOLLOW_2); 
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
    // InternalQLS.g:6909:1: rule__StringValueType__Group__2 : rule__StringValueType__Group__2__Impl rule__StringValueType__Group__3 ;
    public final void rule__StringValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6913:1: ( rule__StringValueType__Group__2__Impl rule__StringValueType__Group__3 )
            // InternalQLS.g:6914:2: rule__StringValueType__Group__2__Impl rule__StringValueType__Group__3
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
    // InternalQLS.g:6921:1: rule__StringValueType__Group__2__Impl : ( ( rule__StringValueType__NameAssignment_2 ) ) ;
    public final void rule__StringValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6925:1: ( ( ( rule__StringValueType__NameAssignment_2 ) ) )
            // InternalQLS.g:6926:1: ( ( rule__StringValueType__NameAssignment_2 ) )
            {
            // InternalQLS.g:6926:1: ( ( rule__StringValueType__NameAssignment_2 ) )
            // InternalQLS.g:6927:2: ( rule__StringValueType__NameAssignment_2 )
            {
             before(grammarAccess.getStringValueTypeAccess().getNameAssignment_2()); 
            // InternalQLS.g:6928:2: ( rule__StringValueType__NameAssignment_2 )
            // InternalQLS.g:6928:3: rule__StringValueType__NameAssignment_2
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
    // InternalQLS.g:6936:1: rule__StringValueType__Group__3 : rule__StringValueType__Group__3__Impl ;
    public final void rule__StringValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6940:1: ( rule__StringValueType__Group__3__Impl )
            // InternalQLS.g:6941:2: rule__StringValueType__Group__3__Impl
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
    // InternalQLS.g:6947:1: rule__StringValueType__Group__3__Impl : ( ( rule__StringValueType__Group_3__0 )? ) ;
    public final void rule__StringValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6951:1: ( ( ( rule__StringValueType__Group_3__0 )? ) )
            // InternalQLS.g:6952:1: ( ( rule__StringValueType__Group_3__0 )? )
            {
            // InternalQLS.g:6952:1: ( ( rule__StringValueType__Group_3__0 )? )
            // InternalQLS.g:6953:2: ( rule__StringValueType__Group_3__0 )?
            {
             before(grammarAccess.getStringValueTypeAccess().getGroup_3()); 
            // InternalQLS.g:6954:2: ( rule__StringValueType__Group_3__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==44) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalQLS.g:6954:3: rule__StringValueType__Group_3__0
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
    // InternalQLS.g:6963:1: rule__StringValueType__Group_3__0 : rule__StringValueType__Group_3__0__Impl rule__StringValueType__Group_3__1 ;
    public final void rule__StringValueType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6967:1: ( rule__StringValueType__Group_3__0__Impl rule__StringValueType__Group_3__1 )
            // InternalQLS.g:6968:2: rule__StringValueType__Group_3__0__Impl rule__StringValueType__Group_3__1
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
    // InternalQLS.g:6975:1: rule__StringValueType__Group_3__0__Impl : ( '{' ) ;
    public final void rule__StringValueType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6979:1: ( ( '{' ) )
            // InternalQLS.g:6980:1: ( '{' )
            {
            // InternalQLS.g:6980:1: ( '{' )
            // InternalQLS.g:6981:2: '{'
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
    // InternalQLS.g:6990:1: rule__StringValueType__Group_3__1 : rule__StringValueType__Group_3__1__Impl rule__StringValueType__Group_3__2 ;
    public final void rule__StringValueType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6994:1: ( rule__StringValueType__Group_3__1__Impl rule__StringValueType__Group_3__2 )
            // InternalQLS.g:6995:2: rule__StringValueType__Group_3__1__Impl rule__StringValueType__Group_3__2
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
    // InternalQLS.g:7002:1: rule__StringValueType__Group_3__1__Impl : ( ( rule__StringValueType__Group_3_1__0 )? ) ;
    public final void rule__StringValueType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7006:1: ( ( ( rule__StringValueType__Group_3_1__0 )? ) )
            // InternalQLS.g:7007:1: ( ( rule__StringValueType__Group_3_1__0 )? )
            {
            // InternalQLS.g:7007:1: ( ( rule__StringValueType__Group_3_1__0 )? )
            // InternalQLS.g:7008:2: ( rule__StringValueType__Group_3_1__0 )?
            {
             before(grammarAccess.getStringValueTypeAccess().getGroup_3_1()); 
            // InternalQLS.g:7009:2: ( rule__StringValueType__Group_3_1__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==65) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalQLS.g:7009:3: rule__StringValueType__Group_3_1__0
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
    // InternalQLS.g:7017:1: rule__StringValueType__Group_3__2 : rule__StringValueType__Group_3__2__Impl ;
    public final void rule__StringValueType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7021:1: ( rule__StringValueType__Group_3__2__Impl )
            // InternalQLS.g:7022:2: rule__StringValueType__Group_3__2__Impl
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
    // InternalQLS.g:7028:1: rule__StringValueType__Group_3__2__Impl : ( '}' ) ;
    public final void rule__StringValueType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7032:1: ( ( '}' ) )
            // InternalQLS.g:7033:1: ( '}' )
            {
            // InternalQLS.g:7033:1: ( '}' )
            // InternalQLS.g:7034:2: '}'
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
    // InternalQLS.g:7044:1: rule__StringValueType__Group_3_1__0 : rule__StringValueType__Group_3_1__0__Impl rule__StringValueType__Group_3_1__1 ;
    public final void rule__StringValueType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7048:1: ( rule__StringValueType__Group_3_1__0__Impl rule__StringValueType__Group_3_1__1 )
            // InternalQLS.g:7049:2: rule__StringValueType__Group_3_1__0__Impl rule__StringValueType__Group_3_1__1
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
    // InternalQLS.g:7056:1: rule__StringValueType__Group_3_1__0__Impl : ( 'unit' ) ;
    public final void rule__StringValueType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7060:1: ( ( 'unit' ) )
            // InternalQLS.g:7061:1: ( 'unit' )
            {
            // InternalQLS.g:7061:1: ( 'unit' )
            // InternalQLS.g:7062:2: 'unit'
            {
             before(grammarAccess.getStringValueTypeAccess().getUnitKeyword_3_1_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalQLS.g:7071:1: rule__StringValueType__Group_3_1__1 : rule__StringValueType__Group_3_1__1__Impl ;
    public final void rule__StringValueType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7075:1: ( rule__StringValueType__Group_3_1__1__Impl )
            // InternalQLS.g:7076:2: rule__StringValueType__Group_3_1__1__Impl
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
    // InternalQLS.g:7082:1: rule__StringValueType__Group_3_1__1__Impl : ( ( rule__StringValueType__UnitAssignment_3_1_1 ) ) ;
    public final void rule__StringValueType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7086:1: ( ( ( rule__StringValueType__UnitAssignment_3_1_1 ) ) )
            // InternalQLS.g:7087:1: ( ( rule__StringValueType__UnitAssignment_3_1_1 ) )
            {
            // InternalQLS.g:7087:1: ( ( rule__StringValueType__UnitAssignment_3_1_1 ) )
            // InternalQLS.g:7088:2: ( rule__StringValueType__UnitAssignment_3_1_1 )
            {
             before(grammarAccess.getStringValueTypeAccess().getUnitAssignment_3_1_1()); 
            // InternalQLS.g:7089:2: ( rule__StringValueType__UnitAssignment_3_1_1 )
            // InternalQLS.g:7089:3: rule__StringValueType__UnitAssignment_3_1_1
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
    // InternalQLS.g:7098:1: rule__EnumerationLiteral__Group__0 : rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 ;
    public final void rule__EnumerationLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7102:1: ( rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 )
            // InternalQLS.g:7103:2: rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1
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
    // InternalQLS.g:7110:1: rule__EnumerationLiteral__Group__0__Impl : ( () ) ;
    public final void rule__EnumerationLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7114:1: ( ( () ) )
            // InternalQLS.g:7115:1: ( () )
            {
            // InternalQLS.g:7115:1: ( () )
            // InternalQLS.g:7116:2: ()
            {
             before(grammarAccess.getEnumerationLiteralAccess().getEnumerationLiteralAction_0()); 
            // InternalQLS.g:7117:2: ()
            // InternalQLS.g:7117:3: 
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
    // InternalQLS.g:7125:1: rule__EnumerationLiteral__Group__1 : rule__EnumerationLiteral__Group__1__Impl ;
    public final void rule__EnumerationLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7129:1: ( rule__EnumerationLiteral__Group__1__Impl )
            // InternalQLS.g:7130:2: rule__EnumerationLiteral__Group__1__Impl
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
    // InternalQLS.g:7136:1: rule__EnumerationLiteral__Group__1__Impl : ( ( rule__EnumerationLiteral__NameAssignment_1 ) ) ;
    public final void rule__EnumerationLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7140:1: ( ( ( rule__EnumerationLiteral__NameAssignment_1 ) ) )
            // InternalQLS.g:7141:1: ( ( rule__EnumerationLiteral__NameAssignment_1 ) )
            {
            // InternalQLS.g:7141:1: ( ( rule__EnumerationLiteral__NameAssignment_1 ) )
            // InternalQLS.g:7142:2: ( rule__EnumerationLiteral__NameAssignment_1 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_1()); 
            // InternalQLS.g:7143:2: ( rule__EnumerationLiteral__NameAssignment_1 )
            // InternalQLS.g:7143:3: rule__EnumerationLiteral__NameAssignment_1
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
    // InternalQLS.g:7152:1: rule__IntegerValue__Group__0 : rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1 ;
    public final void rule__IntegerValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7156:1: ( rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1 )
            // InternalQLS.g:7157:2: rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1
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
    // InternalQLS.g:7164:1: rule__IntegerValue__Group__0__Impl : ( () ) ;
    public final void rule__IntegerValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7168:1: ( ( () ) )
            // InternalQLS.g:7169:1: ( () )
            {
            // InternalQLS.g:7169:1: ( () )
            // InternalQLS.g:7170:2: ()
            {
             before(grammarAccess.getIntegerValueAccess().getIntegerValueAction_0()); 
            // InternalQLS.g:7171:2: ()
            // InternalQLS.g:7171:3: 
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
    // InternalQLS.g:7179:1: rule__IntegerValue__Group__1 : rule__IntegerValue__Group__1__Impl ;
    public final void rule__IntegerValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7183:1: ( rule__IntegerValue__Group__1__Impl )
            // InternalQLS.g:7184:2: rule__IntegerValue__Group__1__Impl
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
    // InternalQLS.g:7190:1: rule__IntegerValue__Group__1__Impl : ( ( rule__IntegerValue__IntValueAssignment_1 ) ) ;
    public final void rule__IntegerValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7194:1: ( ( ( rule__IntegerValue__IntValueAssignment_1 ) ) )
            // InternalQLS.g:7195:1: ( ( rule__IntegerValue__IntValueAssignment_1 ) )
            {
            // InternalQLS.g:7195:1: ( ( rule__IntegerValue__IntValueAssignment_1 ) )
            // InternalQLS.g:7196:2: ( rule__IntegerValue__IntValueAssignment_1 )
            {
             before(grammarAccess.getIntegerValueAccess().getIntValueAssignment_1()); 
            // InternalQLS.g:7197:2: ( rule__IntegerValue__IntValueAssignment_1 )
            // InternalQLS.g:7197:3: rule__IntegerValue__IntValueAssignment_1
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
    // InternalQLS.g:7206:1: rule__StringValue__Group__0 : rule__StringValue__Group__0__Impl rule__StringValue__Group__1 ;
    public final void rule__StringValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7210:1: ( rule__StringValue__Group__0__Impl rule__StringValue__Group__1 )
            // InternalQLS.g:7211:2: rule__StringValue__Group__0__Impl rule__StringValue__Group__1
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
    // InternalQLS.g:7218:1: rule__StringValue__Group__0__Impl : ( () ) ;
    public final void rule__StringValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7222:1: ( ( () ) )
            // InternalQLS.g:7223:1: ( () )
            {
            // InternalQLS.g:7223:1: ( () )
            // InternalQLS.g:7224:2: ()
            {
             before(grammarAccess.getStringValueAccess().getStringValueAction_0()); 
            // InternalQLS.g:7225:2: ()
            // InternalQLS.g:7225:3: 
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
    // InternalQLS.g:7233:1: rule__StringValue__Group__1 : rule__StringValue__Group__1__Impl ;
    public final void rule__StringValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7237:1: ( rule__StringValue__Group__1__Impl )
            // InternalQLS.g:7238:2: rule__StringValue__Group__1__Impl
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
    // InternalQLS.g:7244:1: rule__StringValue__Group__1__Impl : ( ( rule__StringValue__StringValueAssignment_1 ) ) ;
    public final void rule__StringValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7248:1: ( ( ( rule__StringValue__StringValueAssignment_1 ) ) )
            // InternalQLS.g:7249:1: ( ( rule__StringValue__StringValueAssignment_1 ) )
            {
            // InternalQLS.g:7249:1: ( ( rule__StringValue__StringValueAssignment_1 ) )
            // InternalQLS.g:7250:2: ( rule__StringValue__StringValueAssignment_1 )
            {
             before(grammarAccess.getStringValueAccess().getStringValueAssignment_1()); 
            // InternalQLS.g:7251:2: ( rule__StringValue__StringValueAssignment_1 )
            // InternalQLS.g:7251:3: rule__StringValue__StringValueAssignment_1
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
    // InternalQLS.g:7260:1: rule__BooleanValue__Group__0 : rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1 ;
    public final void rule__BooleanValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7264:1: ( rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1 )
            // InternalQLS.g:7265:2: rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1
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
    // InternalQLS.g:7272:1: rule__BooleanValue__Group__0__Impl : ( () ) ;
    public final void rule__BooleanValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7276:1: ( ( () ) )
            // InternalQLS.g:7277:1: ( () )
            {
            // InternalQLS.g:7277:1: ( () )
            // InternalQLS.g:7278:2: ()
            {
             before(grammarAccess.getBooleanValueAccess().getBooleanValueAction_0()); 
            // InternalQLS.g:7279:2: ()
            // InternalQLS.g:7279:3: 
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
    // InternalQLS.g:7287:1: rule__BooleanValue__Group__1 : rule__BooleanValue__Group__1__Impl ;
    public final void rule__BooleanValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7291:1: ( rule__BooleanValue__Group__1__Impl )
            // InternalQLS.g:7292:2: rule__BooleanValue__Group__1__Impl
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
    // InternalQLS.g:7298:1: rule__BooleanValue__Group__1__Impl : ( ( rule__BooleanValue__BooleanValueAssignment_1 ) ) ;
    public final void rule__BooleanValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7302:1: ( ( ( rule__BooleanValue__BooleanValueAssignment_1 ) ) )
            // InternalQLS.g:7303:1: ( ( rule__BooleanValue__BooleanValueAssignment_1 ) )
            {
            // InternalQLS.g:7303:1: ( ( rule__BooleanValue__BooleanValueAssignment_1 ) )
            // InternalQLS.g:7304:2: ( rule__BooleanValue__BooleanValueAssignment_1 )
            {
             before(grammarAccess.getBooleanValueAccess().getBooleanValueAssignment_1()); 
            // InternalQLS.g:7305:2: ( rule__BooleanValue__BooleanValueAssignment_1 )
            // InternalQLS.g:7305:3: rule__BooleanValue__BooleanValueAssignment_1
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
    // InternalQLS.g:7314:1: rule__EnumerationCall__Group__0 : rule__EnumerationCall__Group__0__Impl rule__EnumerationCall__Group__1 ;
    public final void rule__EnumerationCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7318:1: ( rule__EnumerationCall__Group__0__Impl rule__EnumerationCall__Group__1 )
            // InternalQLS.g:7319:2: rule__EnumerationCall__Group__0__Impl rule__EnumerationCall__Group__1
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
    // InternalQLS.g:7326:1: rule__EnumerationCall__Group__0__Impl : ( () ) ;
    public final void rule__EnumerationCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7330:1: ( ( () ) )
            // InternalQLS.g:7331:1: ( () )
            {
            // InternalQLS.g:7331:1: ( () )
            // InternalQLS.g:7332:2: ()
            {
             before(grammarAccess.getEnumerationCallAccess().getEnumerationCallAction_0()); 
            // InternalQLS.g:7333:2: ()
            // InternalQLS.g:7333:3: 
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
    // InternalQLS.g:7341:1: rule__EnumerationCall__Group__1 : rule__EnumerationCall__Group__1__Impl ;
    public final void rule__EnumerationCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7345:1: ( rule__EnumerationCall__Group__1__Impl )
            // InternalQLS.g:7346:2: rule__EnumerationCall__Group__1__Impl
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
    // InternalQLS.g:7352:1: rule__EnumerationCall__Group__1__Impl : ( ( rule__EnumerationCall__EnumerationLiteralAssignment_1 ) ) ;
    public final void rule__EnumerationCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7356:1: ( ( ( rule__EnumerationCall__EnumerationLiteralAssignment_1 ) ) )
            // InternalQLS.g:7357:1: ( ( rule__EnumerationCall__EnumerationLiteralAssignment_1 ) )
            {
            // InternalQLS.g:7357:1: ( ( rule__EnumerationCall__EnumerationLiteralAssignment_1 ) )
            // InternalQLS.g:7358:2: ( rule__EnumerationCall__EnumerationLiteralAssignment_1 )
            {
             before(grammarAccess.getEnumerationCallAccess().getEnumerationLiteralAssignment_1()); 
            // InternalQLS.g:7359:2: ( rule__EnumerationCall__EnumerationLiteralAssignment_1 )
            // InternalQLS.g:7359:3: rule__EnumerationCall__EnumerationLiteralAssignment_1
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
    // InternalQLS.g:7368:1: rule__DateValue__Group__0 : rule__DateValue__Group__0__Impl rule__DateValue__Group__1 ;
    public final void rule__DateValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7372:1: ( rule__DateValue__Group__0__Impl rule__DateValue__Group__1 )
            // InternalQLS.g:7373:2: rule__DateValue__Group__0__Impl rule__DateValue__Group__1
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
    // InternalQLS.g:7380:1: rule__DateValue__Group__0__Impl : ( () ) ;
    public final void rule__DateValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7384:1: ( ( () ) )
            // InternalQLS.g:7385:1: ( () )
            {
            // InternalQLS.g:7385:1: ( () )
            // InternalQLS.g:7386:2: ()
            {
             before(grammarAccess.getDateValueAccess().getDateValueAction_0()); 
            // InternalQLS.g:7387:2: ()
            // InternalQLS.g:7387:3: 
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
    // InternalQLS.g:7395:1: rule__DateValue__Group__1 : rule__DateValue__Group__1__Impl rule__DateValue__Group__2 ;
    public final void rule__DateValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7399:1: ( rule__DateValue__Group__1__Impl rule__DateValue__Group__2 )
            // InternalQLS.g:7400:2: rule__DateValue__Group__1__Impl rule__DateValue__Group__2
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
    // InternalQLS.g:7407:1: rule__DateValue__Group__1__Impl : ( 'DateValue' ) ;
    public final void rule__DateValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7411:1: ( ( 'DateValue' ) )
            // InternalQLS.g:7412:1: ( 'DateValue' )
            {
            // InternalQLS.g:7412:1: ( 'DateValue' )
            // InternalQLS.g:7413:2: 'DateValue'
            {
             before(grammarAccess.getDateValueAccess().getDateValueKeyword_1()); 
            match(input,76,FOLLOW_2); 
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
    // InternalQLS.g:7422:1: rule__DateValue__Group__2 : rule__DateValue__Group__2__Impl rule__DateValue__Group__3 ;
    public final void rule__DateValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7426:1: ( rule__DateValue__Group__2__Impl rule__DateValue__Group__3 )
            // InternalQLS.g:7427:2: rule__DateValue__Group__2__Impl rule__DateValue__Group__3
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
    // InternalQLS.g:7434:1: rule__DateValue__Group__2__Impl : ( '{' ) ;
    public final void rule__DateValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7438:1: ( ( '{' ) )
            // InternalQLS.g:7439:1: ( '{' )
            {
            // InternalQLS.g:7439:1: ( '{' )
            // InternalQLS.g:7440:2: '{'
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
    // InternalQLS.g:7449:1: rule__DateValue__Group__3 : rule__DateValue__Group__3__Impl rule__DateValue__Group__4 ;
    public final void rule__DateValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7453:1: ( rule__DateValue__Group__3__Impl rule__DateValue__Group__4 )
            // InternalQLS.g:7454:2: rule__DateValue__Group__3__Impl rule__DateValue__Group__4
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
    // InternalQLS.g:7461:1: rule__DateValue__Group__3__Impl : ( ( rule__DateValue__Group_3__0 )? ) ;
    public final void rule__DateValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7465:1: ( ( ( rule__DateValue__Group_3__0 )? ) )
            // InternalQLS.g:7466:1: ( ( rule__DateValue__Group_3__0 )? )
            {
            // InternalQLS.g:7466:1: ( ( rule__DateValue__Group_3__0 )? )
            // InternalQLS.g:7467:2: ( rule__DateValue__Group_3__0 )?
            {
             before(grammarAccess.getDateValueAccess().getGroup_3()); 
            // InternalQLS.g:7468:2: ( rule__DateValue__Group_3__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==77) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalQLS.g:7468:3: rule__DateValue__Group_3__0
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
    // InternalQLS.g:7476:1: rule__DateValue__Group__4 : rule__DateValue__Group__4__Impl ;
    public final void rule__DateValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7480:1: ( rule__DateValue__Group__4__Impl )
            // InternalQLS.g:7481:2: rule__DateValue__Group__4__Impl
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
    // InternalQLS.g:7487:1: rule__DateValue__Group__4__Impl : ( '}' ) ;
    public final void rule__DateValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7491:1: ( ( '}' ) )
            // InternalQLS.g:7492:1: ( '}' )
            {
            // InternalQLS.g:7492:1: ( '}' )
            // InternalQLS.g:7493:2: '}'
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
    // InternalQLS.g:7503:1: rule__DateValue__Group_3__0 : rule__DateValue__Group_3__0__Impl rule__DateValue__Group_3__1 ;
    public final void rule__DateValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7507:1: ( rule__DateValue__Group_3__0__Impl rule__DateValue__Group_3__1 )
            // InternalQLS.g:7508:2: rule__DateValue__Group_3__0__Impl rule__DateValue__Group_3__1
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
    // InternalQLS.g:7515:1: rule__DateValue__Group_3__0__Impl : ( 'dateValue' ) ;
    public final void rule__DateValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7519:1: ( ( 'dateValue' ) )
            // InternalQLS.g:7520:1: ( 'dateValue' )
            {
            // InternalQLS.g:7520:1: ( 'dateValue' )
            // InternalQLS.g:7521:2: 'dateValue'
            {
             before(grammarAccess.getDateValueAccess().getDateValueKeyword_3_0()); 
            match(input,77,FOLLOW_2); 
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
    // InternalQLS.g:7530:1: rule__DateValue__Group_3__1 : rule__DateValue__Group_3__1__Impl ;
    public final void rule__DateValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7534:1: ( rule__DateValue__Group_3__1__Impl )
            // InternalQLS.g:7535:2: rule__DateValue__Group_3__1__Impl
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
    // InternalQLS.g:7541:1: rule__DateValue__Group_3__1__Impl : ( ( rule__DateValue__DateValueAssignment_3_1 ) ) ;
    public final void rule__DateValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7545:1: ( ( ( rule__DateValue__DateValueAssignment_3_1 ) ) )
            // InternalQLS.g:7546:1: ( ( rule__DateValue__DateValueAssignment_3_1 ) )
            {
            // InternalQLS.g:7546:1: ( ( rule__DateValue__DateValueAssignment_3_1 ) )
            // InternalQLS.g:7547:2: ( rule__DateValue__DateValueAssignment_3_1 )
            {
             before(grammarAccess.getDateValueAccess().getDateValueAssignment_3_1()); 
            // InternalQLS.g:7548:2: ( rule__DateValue__DateValueAssignment_3_1 )
            // InternalQLS.g:7548:3: rule__DateValue__DateValueAssignment_3_1
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
    // InternalQLS.g:7557:1: rule__DecimalValue__Group__0 : rule__DecimalValue__Group__0__Impl rule__DecimalValue__Group__1 ;
    public final void rule__DecimalValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7561:1: ( rule__DecimalValue__Group__0__Impl rule__DecimalValue__Group__1 )
            // InternalQLS.g:7562:2: rule__DecimalValue__Group__0__Impl rule__DecimalValue__Group__1
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
    // InternalQLS.g:7569:1: rule__DecimalValue__Group__0__Impl : ( () ) ;
    public final void rule__DecimalValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7573:1: ( ( () ) )
            // InternalQLS.g:7574:1: ( () )
            {
            // InternalQLS.g:7574:1: ( () )
            // InternalQLS.g:7575:2: ()
            {
             before(grammarAccess.getDecimalValueAccess().getDecimalValueAction_0()); 
            // InternalQLS.g:7576:2: ()
            // InternalQLS.g:7576:3: 
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
    // InternalQLS.g:7584:1: rule__DecimalValue__Group__1 : rule__DecimalValue__Group__1__Impl ;
    public final void rule__DecimalValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7588:1: ( rule__DecimalValue__Group__1__Impl )
            // InternalQLS.g:7589:2: rule__DecimalValue__Group__1__Impl
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
    // InternalQLS.g:7595:1: rule__DecimalValue__Group__1__Impl : ( ( rule__DecimalValue__DecimalValueAssignment_1 ) ) ;
    public final void rule__DecimalValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7599:1: ( ( ( rule__DecimalValue__DecimalValueAssignment_1 ) ) )
            // InternalQLS.g:7600:1: ( ( rule__DecimalValue__DecimalValueAssignment_1 ) )
            {
            // InternalQLS.g:7600:1: ( ( rule__DecimalValue__DecimalValueAssignment_1 ) )
            // InternalQLS.g:7601:2: ( rule__DecimalValue__DecimalValueAssignment_1 )
            {
             before(grammarAccess.getDecimalValueAccess().getDecimalValueAssignment_1()); 
            // InternalQLS.g:7602:2: ( rule__DecimalValue__DecimalValueAssignment_1 )
            // InternalQLS.g:7602:3: rule__DecimalValue__DecimalValueAssignment_1
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
    // InternalQLS.g:7611:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7615:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalQLS.g:7616:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
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
    // InternalQLS.g:7623:1: rule__EDouble__Group__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7627:1: ( ( ( RULE_INT )? ) )
            // InternalQLS.g:7628:1: ( ( RULE_INT )? )
            {
            // InternalQLS.g:7628:1: ( ( RULE_INT )? )
            // InternalQLS.g:7629:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0()); 
            // InternalQLS.g:7630:2: ( RULE_INT )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_INT) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalQLS.g:7630:3: RULE_INT
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
    // InternalQLS.g:7638:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7642:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalQLS.g:7643:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
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
    // InternalQLS.g:7650:1: rule__EDouble__Group__1__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7654:1: ( ( '.' ) )
            // InternalQLS.g:7655:1: ( '.' )
            {
            // InternalQLS.g:7655:1: ( '.' )
            // InternalQLS.g:7656:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_1()); 
            match(input,78,FOLLOW_2); 
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
    // InternalQLS.g:7665:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7669:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalQLS.g:7670:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
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
    // InternalQLS.g:7677:1: rule__EDouble__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7681:1: ( ( RULE_INT ) )
            // InternalQLS.g:7682:1: ( RULE_INT )
            {
            // InternalQLS.g:7682:1: ( RULE_INT )
            // InternalQLS.g:7683:2: RULE_INT
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
    // InternalQLS.g:7692:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7696:1: ( rule__EDouble__Group__3__Impl )
            // InternalQLS.g:7697:2: rule__EDouble__Group__3__Impl
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
    // InternalQLS.g:7703:1: rule__EDouble__Group__3__Impl : ( ( rule__EDouble__Group_3__0 )? ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7707:1: ( ( ( rule__EDouble__Group_3__0 )? ) )
            // InternalQLS.g:7708:1: ( ( rule__EDouble__Group_3__0 )? )
            {
            // InternalQLS.g:7708:1: ( ( rule__EDouble__Group_3__0 )? )
            // InternalQLS.g:7709:2: ( rule__EDouble__Group_3__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_3()); 
            // InternalQLS.g:7710:2: ( rule__EDouble__Group_3__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=17 && LA58_0<=18)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalQLS.g:7710:3: rule__EDouble__Group_3__0
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
    // InternalQLS.g:7719:1: rule__EDouble__Group_3__0 : rule__EDouble__Group_3__0__Impl rule__EDouble__Group_3__1 ;
    public final void rule__EDouble__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7723:1: ( rule__EDouble__Group_3__0__Impl rule__EDouble__Group_3__1 )
            // InternalQLS.g:7724:2: rule__EDouble__Group_3__0__Impl rule__EDouble__Group_3__1
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
    // InternalQLS.g:7731:1: rule__EDouble__Group_3__0__Impl : ( ( rule__EDouble__Alternatives_3_0 ) ) ;
    public final void rule__EDouble__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7735:1: ( ( ( rule__EDouble__Alternatives_3_0 ) ) )
            // InternalQLS.g:7736:1: ( ( rule__EDouble__Alternatives_3_0 ) )
            {
            // InternalQLS.g:7736:1: ( ( rule__EDouble__Alternatives_3_0 ) )
            // InternalQLS.g:7737:2: ( rule__EDouble__Alternatives_3_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_3_0()); 
            // InternalQLS.g:7738:2: ( rule__EDouble__Alternatives_3_0 )
            // InternalQLS.g:7738:3: rule__EDouble__Alternatives_3_0
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
    // InternalQLS.g:7746:1: rule__EDouble__Group_3__1 : rule__EDouble__Group_3__1__Impl rule__EDouble__Group_3__2 ;
    public final void rule__EDouble__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7750:1: ( rule__EDouble__Group_3__1__Impl rule__EDouble__Group_3__2 )
            // InternalQLS.g:7751:2: rule__EDouble__Group_3__1__Impl rule__EDouble__Group_3__2
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
    // InternalQLS.g:7758:1: rule__EDouble__Group_3__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7762:1: ( ( ( '-' )? ) )
            // InternalQLS.g:7763:1: ( ( '-' )? )
            {
            // InternalQLS.g:7763:1: ( ( '-' )? )
            // InternalQLS.g:7764:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_3_1()); 
            // InternalQLS.g:7765:2: ( '-' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==34) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalQLS.g:7765:3: '-'
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
    // InternalQLS.g:7773:1: rule__EDouble__Group_3__2 : rule__EDouble__Group_3__2__Impl ;
    public final void rule__EDouble__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7777:1: ( rule__EDouble__Group_3__2__Impl )
            // InternalQLS.g:7778:2: rule__EDouble__Group_3__2__Impl
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
    // InternalQLS.g:7784:1: rule__EDouble__Group_3__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7788:1: ( ( RULE_INT ) )
            // InternalQLS.g:7789:1: ( RULE_INT )
            {
            // InternalQLS.g:7789:1: ( RULE_INT )
            // InternalQLS.g:7790:2: RULE_INT
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
    // InternalQLS.g:7800:1: rule__QuestionDefinition__Group__0 : rule__QuestionDefinition__Group__0__Impl rule__QuestionDefinition__Group__1 ;
    public final void rule__QuestionDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7804:1: ( rule__QuestionDefinition__Group__0__Impl rule__QuestionDefinition__Group__1 )
            // InternalQLS.g:7805:2: rule__QuestionDefinition__Group__0__Impl rule__QuestionDefinition__Group__1
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
    // InternalQLS.g:7812:1: rule__QuestionDefinition__Group__0__Impl : ( ( rule__QuestionDefinition__IsMandatoryAssignment_0 )? ) ;
    public final void rule__QuestionDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7816:1: ( ( ( rule__QuestionDefinition__IsMandatoryAssignment_0 )? ) )
            // InternalQLS.g:7817:1: ( ( rule__QuestionDefinition__IsMandatoryAssignment_0 )? )
            {
            // InternalQLS.g:7817:1: ( ( rule__QuestionDefinition__IsMandatoryAssignment_0 )? )
            // InternalQLS.g:7818:2: ( rule__QuestionDefinition__IsMandatoryAssignment_0 )?
            {
             before(grammarAccess.getQuestionDefinitionAccess().getIsMandatoryAssignment_0()); 
            // InternalQLS.g:7819:2: ( rule__QuestionDefinition__IsMandatoryAssignment_0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==86) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalQLS.g:7819:3: rule__QuestionDefinition__IsMandatoryAssignment_0
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
    // InternalQLS.g:7827:1: rule__QuestionDefinition__Group__1 : rule__QuestionDefinition__Group__1__Impl rule__QuestionDefinition__Group__2 ;
    public final void rule__QuestionDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7831:1: ( rule__QuestionDefinition__Group__1__Impl rule__QuestionDefinition__Group__2 )
            // InternalQLS.g:7832:2: rule__QuestionDefinition__Group__1__Impl rule__QuestionDefinition__Group__2
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
    // InternalQLS.g:7839:1: rule__QuestionDefinition__Group__1__Impl : ( 'question' ) ;
    public final void rule__QuestionDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7843:1: ( ( 'question' ) )
            // InternalQLS.g:7844:1: ( 'question' )
            {
            // InternalQLS.g:7844:1: ( 'question' )
            // InternalQLS.g:7845:2: 'question'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getQuestionKeyword_1()); 
            match(input,79,FOLLOW_2); 
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
    // InternalQLS.g:7854:1: rule__QuestionDefinition__Group__2 : rule__QuestionDefinition__Group__2__Impl rule__QuestionDefinition__Group__3 ;
    public final void rule__QuestionDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7858:1: ( rule__QuestionDefinition__Group__2__Impl rule__QuestionDefinition__Group__3 )
            // InternalQLS.g:7859:2: rule__QuestionDefinition__Group__2__Impl rule__QuestionDefinition__Group__3
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
    // InternalQLS.g:7866:1: rule__QuestionDefinition__Group__2__Impl : ( ( rule__QuestionDefinition__NameAssignment_2 ) ) ;
    public final void rule__QuestionDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7870:1: ( ( ( rule__QuestionDefinition__NameAssignment_2 ) ) )
            // InternalQLS.g:7871:1: ( ( rule__QuestionDefinition__NameAssignment_2 ) )
            {
            // InternalQLS.g:7871:1: ( ( rule__QuestionDefinition__NameAssignment_2 ) )
            // InternalQLS.g:7872:2: ( rule__QuestionDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getNameAssignment_2()); 
            // InternalQLS.g:7873:2: ( rule__QuestionDefinition__NameAssignment_2 )
            // InternalQLS.g:7873:3: rule__QuestionDefinition__NameAssignment_2
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
    // InternalQLS.g:7881:1: rule__QuestionDefinition__Group__3 : rule__QuestionDefinition__Group__3__Impl rule__QuestionDefinition__Group__4 ;
    public final void rule__QuestionDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7885:1: ( rule__QuestionDefinition__Group__3__Impl rule__QuestionDefinition__Group__4 )
            // InternalQLS.g:7886:2: rule__QuestionDefinition__Group__3__Impl rule__QuestionDefinition__Group__4
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
    // InternalQLS.g:7893:1: rule__QuestionDefinition__Group__3__Impl : ( ( rule__QuestionDefinition__Group_3__0 )? ) ;
    public final void rule__QuestionDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7897:1: ( ( ( rule__QuestionDefinition__Group_3__0 )? ) )
            // InternalQLS.g:7898:1: ( ( rule__QuestionDefinition__Group_3__0 )? )
            {
            // InternalQLS.g:7898:1: ( ( rule__QuestionDefinition__Group_3__0 )? )
            // InternalQLS.g:7899:2: ( rule__QuestionDefinition__Group_3__0 )?
            {
             before(grammarAccess.getQuestionDefinitionAccess().getGroup_3()); 
            // InternalQLS.g:7900:2: ( rule__QuestionDefinition__Group_3__0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==57) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalQLS.g:7900:3: rule__QuestionDefinition__Group_3__0
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
    // InternalQLS.g:7908:1: rule__QuestionDefinition__Group__4 : rule__QuestionDefinition__Group__4__Impl rule__QuestionDefinition__Group__5 ;
    public final void rule__QuestionDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7912:1: ( rule__QuestionDefinition__Group__4__Impl rule__QuestionDefinition__Group__5 )
            // InternalQLS.g:7913:2: rule__QuestionDefinition__Group__4__Impl rule__QuestionDefinition__Group__5
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
    // InternalQLS.g:7920:1: rule__QuestionDefinition__Group__4__Impl : ( ':' ) ;
    public final void rule__QuestionDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7924:1: ( ( ':' ) )
            // InternalQLS.g:7925:1: ( ':' )
            {
            // InternalQLS.g:7925:1: ( ':' )
            // InternalQLS.g:7926:2: ':'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getColonKeyword_4()); 
            match(input,80,FOLLOW_2); 
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
    // InternalQLS.g:7935:1: rule__QuestionDefinition__Group__5 : rule__QuestionDefinition__Group__5__Impl rule__QuestionDefinition__Group__6 ;
    public final void rule__QuestionDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7939:1: ( rule__QuestionDefinition__Group__5__Impl rule__QuestionDefinition__Group__6 )
            // InternalQLS.g:7940:2: rule__QuestionDefinition__Group__5__Impl rule__QuestionDefinition__Group__6
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
    // InternalQLS.g:7947:1: rule__QuestionDefinition__Group__5__Impl : ( ( rule__QuestionDefinition__LabelAssignment_5 ) ) ;
    public final void rule__QuestionDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7951:1: ( ( ( rule__QuestionDefinition__LabelAssignment_5 ) ) )
            // InternalQLS.g:7952:1: ( ( rule__QuestionDefinition__LabelAssignment_5 ) )
            {
            // InternalQLS.g:7952:1: ( ( rule__QuestionDefinition__LabelAssignment_5 ) )
            // InternalQLS.g:7953:2: ( rule__QuestionDefinition__LabelAssignment_5 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getLabelAssignment_5()); 
            // InternalQLS.g:7954:2: ( rule__QuestionDefinition__LabelAssignment_5 )
            // InternalQLS.g:7954:3: rule__QuestionDefinition__LabelAssignment_5
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
    // InternalQLS.g:7962:1: rule__QuestionDefinition__Group__6 : rule__QuestionDefinition__Group__6__Impl rule__QuestionDefinition__Group__7 ;
    public final void rule__QuestionDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7966:1: ( rule__QuestionDefinition__Group__6__Impl rule__QuestionDefinition__Group__7 )
            // InternalQLS.g:7967:2: rule__QuestionDefinition__Group__6__Impl rule__QuestionDefinition__Group__7
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
    // InternalQLS.g:7974:1: rule__QuestionDefinition__Group__6__Impl : ( ( rule__QuestionDefinition__DataTypeAssignment_6 ) ) ;
    public final void rule__QuestionDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7978:1: ( ( ( rule__QuestionDefinition__DataTypeAssignment_6 ) ) )
            // InternalQLS.g:7979:1: ( ( rule__QuestionDefinition__DataTypeAssignment_6 ) )
            {
            // InternalQLS.g:7979:1: ( ( rule__QuestionDefinition__DataTypeAssignment_6 ) )
            // InternalQLS.g:7980:2: ( rule__QuestionDefinition__DataTypeAssignment_6 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getDataTypeAssignment_6()); 
            // InternalQLS.g:7981:2: ( rule__QuestionDefinition__DataTypeAssignment_6 )
            // InternalQLS.g:7981:3: rule__QuestionDefinition__DataTypeAssignment_6
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
    // InternalQLS.g:7989:1: rule__QuestionDefinition__Group__7 : rule__QuestionDefinition__Group__7__Impl ;
    public final void rule__QuestionDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7993:1: ( rule__QuestionDefinition__Group__7__Impl )
            // InternalQLS.g:7994:2: rule__QuestionDefinition__Group__7__Impl
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
    // InternalQLS.g:8000:1: rule__QuestionDefinition__Group__7__Impl : ( ( rule__QuestionDefinition__Group_7__0 )? ) ;
    public final void rule__QuestionDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8004:1: ( ( ( rule__QuestionDefinition__Group_7__0 )? ) )
            // InternalQLS.g:8005:1: ( ( rule__QuestionDefinition__Group_7__0 )? )
            {
            // InternalQLS.g:8005:1: ( ( rule__QuestionDefinition__Group_7__0 )? )
            // InternalQLS.g:8006:2: ( rule__QuestionDefinition__Group_7__0 )?
            {
             before(grammarAccess.getQuestionDefinitionAccess().getGroup_7()); 
            // InternalQLS.g:8007:2: ( rule__QuestionDefinition__Group_7__0 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==12) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalQLS.g:8007:3: rule__QuestionDefinition__Group_7__0
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
    // InternalQLS.g:8016:1: rule__QuestionDefinition__Group_3__0 : rule__QuestionDefinition__Group_3__0__Impl rule__QuestionDefinition__Group_3__1 ;
    public final void rule__QuestionDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8020:1: ( rule__QuestionDefinition__Group_3__0__Impl rule__QuestionDefinition__Group_3__1 )
            // InternalQLS.g:8021:2: rule__QuestionDefinition__Group_3__0__Impl rule__QuestionDefinition__Group_3__1
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
    // InternalQLS.g:8028:1: rule__QuestionDefinition__Group_3__0__Impl : ( '(' ) ;
    public final void rule__QuestionDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8032:1: ( ( '(' ) )
            // InternalQLS.g:8033:1: ( '(' )
            {
            // InternalQLS.g:8033:1: ( '(' )
            // InternalQLS.g:8034:2: '('
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
    // InternalQLS.g:8043:1: rule__QuestionDefinition__Group_3__1 : rule__QuestionDefinition__Group_3__1__Impl rule__QuestionDefinition__Group_3__2 ;
    public final void rule__QuestionDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8047:1: ( rule__QuestionDefinition__Group_3__1__Impl rule__QuestionDefinition__Group_3__2 )
            // InternalQLS.g:8048:2: rule__QuestionDefinition__Group_3__1__Impl rule__QuestionDefinition__Group_3__2
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
    // InternalQLS.g:8055:1: rule__QuestionDefinition__Group_3__1__Impl : ( ( rule__QuestionDefinition__IsDisplayedAssignment_3_1 )? ) ;
    public final void rule__QuestionDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8059:1: ( ( ( rule__QuestionDefinition__IsDisplayedAssignment_3_1 )? ) )
            // InternalQLS.g:8060:1: ( ( rule__QuestionDefinition__IsDisplayedAssignment_3_1 )? )
            {
            // InternalQLS.g:8060:1: ( ( rule__QuestionDefinition__IsDisplayedAssignment_3_1 )? )
            // InternalQLS.g:8061:2: ( rule__QuestionDefinition__IsDisplayedAssignment_3_1 )?
            {
             before(grammarAccess.getQuestionDefinitionAccess().getIsDisplayedAssignment_3_1()); 
            // InternalQLS.g:8062:2: ( rule__QuestionDefinition__IsDisplayedAssignment_3_1 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==87) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalQLS.g:8062:3: rule__QuestionDefinition__IsDisplayedAssignment_3_1
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
    // InternalQLS.g:8070:1: rule__QuestionDefinition__Group_3__2 : rule__QuestionDefinition__Group_3__2__Impl rule__QuestionDefinition__Group_3__3 ;
    public final void rule__QuestionDefinition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8074:1: ( rule__QuestionDefinition__Group_3__2__Impl rule__QuestionDefinition__Group_3__3 )
            // InternalQLS.g:8075:2: rule__QuestionDefinition__Group_3__2__Impl rule__QuestionDefinition__Group_3__3
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
    // InternalQLS.g:8082:1: rule__QuestionDefinition__Group_3__2__Impl : ( ( rule__QuestionDefinition__Group_3_2__0 )? ) ;
    public final void rule__QuestionDefinition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8086:1: ( ( ( rule__QuestionDefinition__Group_3_2__0 )? ) )
            // InternalQLS.g:8087:1: ( ( rule__QuestionDefinition__Group_3_2__0 )? )
            {
            // InternalQLS.g:8087:1: ( ( rule__QuestionDefinition__Group_3_2__0 )? )
            // InternalQLS.g:8088:2: ( rule__QuestionDefinition__Group_3_2__0 )?
            {
             before(grammarAccess.getQuestionDefinitionAccess().getGroup_3_2()); 
            // InternalQLS.g:8089:2: ( rule__QuestionDefinition__Group_3_2__0 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==81) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalQLS.g:8089:3: rule__QuestionDefinition__Group_3_2__0
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
    // InternalQLS.g:8097:1: rule__QuestionDefinition__Group_3__3 : rule__QuestionDefinition__Group_3__3__Impl ;
    public final void rule__QuestionDefinition__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8101:1: ( rule__QuestionDefinition__Group_3__3__Impl )
            // InternalQLS.g:8102:2: rule__QuestionDefinition__Group_3__3__Impl
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
    // InternalQLS.g:8108:1: rule__QuestionDefinition__Group_3__3__Impl : ( ')' ) ;
    public final void rule__QuestionDefinition__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8112:1: ( ( ')' ) )
            // InternalQLS.g:8113:1: ( ')' )
            {
            // InternalQLS.g:8113:1: ( ')' )
            // InternalQLS.g:8114:2: ')'
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
    // InternalQLS.g:8124:1: rule__QuestionDefinition__Group_3_2__0 : rule__QuestionDefinition__Group_3_2__0__Impl rule__QuestionDefinition__Group_3_2__1 ;
    public final void rule__QuestionDefinition__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8128:1: ( rule__QuestionDefinition__Group_3_2__0__Impl rule__QuestionDefinition__Group_3_2__1 )
            // InternalQLS.g:8129:2: rule__QuestionDefinition__Group_3_2__0__Impl rule__QuestionDefinition__Group_3_2__1
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
    // InternalQLS.g:8136:1: rule__QuestionDefinition__Group_3_2__0__Impl : ( 'currentValue' ) ;
    public final void rule__QuestionDefinition__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8140:1: ( ( 'currentValue' ) )
            // InternalQLS.g:8141:1: ( 'currentValue' )
            {
            // InternalQLS.g:8141:1: ( 'currentValue' )
            // InternalQLS.g:8142:2: 'currentValue'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getCurrentValueKeyword_3_2_0()); 
            match(input,81,FOLLOW_2); 
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
    // InternalQLS.g:8151:1: rule__QuestionDefinition__Group_3_2__1 : rule__QuestionDefinition__Group_3_2__1__Impl ;
    public final void rule__QuestionDefinition__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8155:1: ( rule__QuestionDefinition__Group_3_2__1__Impl )
            // InternalQLS.g:8156:2: rule__QuestionDefinition__Group_3_2__1__Impl
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
    // InternalQLS.g:8162:1: rule__QuestionDefinition__Group_3_2__1__Impl : ( ( rule__QuestionDefinition__CurrentValueAssignment_3_2_1 ) ) ;
    public final void rule__QuestionDefinition__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8166:1: ( ( ( rule__QuestionDefinition__CurrentValueAssignment_3_2_1 ) ) )
            // InternalQLS.g:8167:1: ( ( rule__QuestionDefinition__CurrentValueAssignment_3_2_1 ) )
            {
            // InternalQLS.g:8167:1: ( ( rule__QuestionDefinition__CurrentValueAssignment_3_2_1 ) )
            // InternalQLS.g:8168:2: ( rule__QuestionDefinition__CurrentValueAssignment_3_2_1 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getCurrentValueAssignment_3_2_1()); 
            // InternalQLS.g:8169:2: ( rule__QuestionDefinition__CurrentValueAssignment_3_2_1 )
            // InternalQLS.g:8169:3: rule__QuestionDefinition__CurrentValueAssignment_3_2_1
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
    // InternalQLS.g:8178:1: rule__QuestionDefinition__Group_7__0 : rule__QuestionDefinition__Group_7__0__Impl rule__QuestionDefinition__Group_7__1 ;
    public final void rule__QuestionDefinition__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8182:1: ( rule__QuestionDefinition__Group_7__0__Impl rule__QuestionDefinition__Group_7__1 )
            // InternalQLS.g:8183:2: rule__QuestionDefinition__Group_7__0__Impl rule__QuestionDefinition__Group_7__1
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
    // InternalQLS.g:8190:1: rule__QuestionDefinition__Group_7__0__Impl : ( '=' ) ;
    public final void rule__QuestionDefinition__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8194:1: ( ( '=' ) )
            // InternalQLS.g:8195:1: ( '=' )
            {
            // InternalQLS.g:8195:1: ( '=' )
            // InternalQLS.g:8196:2: '='
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
    // InternalQLS.g:8205:1: rule__QuestionDefinition__Group_7__1 : rule__QuestionDefinition__Group_7__1__Impl rule__QuestionDefinition__Group_7__2 ;
    public final void rule__QuestionDefinition__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8209:1: ( rule__QuestionDefinition__Group_7__1__Impl rule__QuestionDefinition__Group_7__2 )
            // InternalQLS.g:8210:2: rule__QuestionDefinition__Group_7__1__Impl rule__QuestionDefinition__Group_7__2
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
    // InternalQLS.g:8217:1: rule__QuestionDefinition__Group_7__1__Impl : ( ( rule__QuestionDefinition__ComputedExpressionAssignment_7_1 ) ) ;
    public final void rule__QuestionDefinition__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8221:1: ( ( ( rule__QuestionDefinition__ComputedExpressionAssignment_7_1 ) ) )
            // InternalQLS.g:8222:1: ( ( rule__QuestionDefinition__ComputedExpressionAssignment_7_1 ) )
            {
            // InternalQLS.g:8222:1: ( ( rule__QuestionDefinition__ComputedExpressionAssignment_7_1 ) )
            // InternalQLS.g:8223:2: ( rule__QuestionDefinition__ComputedExpressionAssignment_7_1 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getComputedExpressionAssignment_7_1()); 
            // InternalQLS.g:8224:2: ( rule__QuestionDefinition__ComputedExpressionAssignment_7_1 )
            // InternalQLS.g:8224:3: rule__QuestionDefinition__ComputedExpressionAssignment_7_1
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
    // InternalQLS.g:8232:1: rule__QuestionDefinition__Group_7__2 : rule__QuestionDefinition__Group_7__2__Impl ;
    public final void rule__QuestionDefinition__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8236:1: ( rule__QuestionDefinition__Group_7__2__Impl )
            // InternalQLS.g:8237:2: rule__QuestionDefinition__Group_7__2__Impl
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
    // InternalQLS.g:8243:1: rule__QuestionDefinition__Group_7__2__Impl : ( ';' ) ;
    public final void rule__QuestionDefinition__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8247:1: ( ( ';' ) )
            // InternalQLS.g:8248:1: ( ';' )
            {
            // InternalQLS.g:8248:1: ( ';' )
            // InternalQLS.g:8249:2: ';'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getSemicolonKeyword_7_2()); 
            match(input,82,FOLLOW_2); 
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
    // InternalQLS.g:8259:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8263:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalQLS.g:8264:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalQLS.g:8271:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8275:1: ( ( RULE_ID ) )
            // InternalQLS.g:8276:1: ( RULE_ID )
            {
            // InternalQLS.g:8276:1: ( RULE_ID )
            // InternalQLS.g:8277:2: RULE_ID
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
    // InternalQLS.g:8286:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8290:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalQLS.g:8291:2: rule__QualifiedName__Group__1__Impl
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
    // InternalQLS.g:8297:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8301:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalQLS.g:8302:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalQLS.g:8302:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalQLS.g:8303:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalQLS.g:8304:2: ( rule__QualifiedName__Group_1__0 )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==78) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalQLS.g:8304:3: rule__QualifiedName__Group_1__0
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
    // InternalQLS.g:8313:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8317:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalQLS.g:8318:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalQLS.g:8325:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8329:1: ( ( '.' ) )
            // InternalQLS.g:8330:1: ( '.' )
            {
            // InternalQLS.g:8330:1: ( '.' )
            // InternalQLS.g:8331:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,78,FOLLOW_2); 
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
    // InternalQLS.g:8340:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8344:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalQLS.g:8345:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalQLS.g:8351:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8355:1: ( ( RULE_ID ) )
            // InternalQLS.g:8356:1: ( RULE_ID )
            {
            // InternalQLS.g:8356:1: ( RULE_ID )
            // InternalQLS.g:8357:2: RULE_ID
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
    // InternalQLS.g:8367:1: rule__QLSModel__ImportsAssignment_1 : ( ruleImport ) ;
    public final void rule__QLSModel__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8371:1: ( ( ruleImport ) )
            // InternalQLS.g:8372:2: ( ruleImport )
            {
            // InternalQLS.g:8372:2: ( ruleImport )
            // InternalQLS.g:8373:3: ruleImport
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
    // InternalQLS.g:8382:1: rule__QLSModel__QuestionStylesAssignment_6 : ( ruleQuestionStyle ) ;
    public final void rule__QLSModel__QuestionStylesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8386:1: ( ( ruleQuestionStyle ) )
            // InternalQLS.g:8387:2: ( ruleQuestionStyle )
            {
            // InternalQLS.g:8387:2: ( ruleQuestionStyle )
            // InternalQLS.g:8388:3: ruleQuestionStyle
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
    // InternalQLS.g:8397:1: rule__Import__ImportURIAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8401:1: ( ( RULE_STRING ) )
            // InternalQLS.g:8402:2: ( RULE_STRING )
            {
            // InternalQLS.g:8402:2: ( RULE_STRING )
            // InternalQLS.g:8403:3: RULE_STRING
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
    // InternalQLS.g:8412:1: rule__QuestionStyle__StyledQuestionAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__QuestionStyle__StyledQuestionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8416:1: ( ( ( ruleQualifiedName ) ) )
            // InternalQLS.g:8417:2: ( ( ruleQualifiedName ) )
            {
            // InternalQLS.g:8417:2: ( ( ruleQualifiedName ) )
            // InternalQLS.g:8418:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getQuestionStyleAccess().getStyledQuestionQuestionDefinitionCrossReference_1_0()); 
            // InternalQLS.g:8419:3: ( ruleQualifiedName )
            // InternalQLS.g:8420:4: ruleQualifiedName
            {
             before(grammarAccess.getQuestionStyleAccess().getStyledQuestionQuestionDefinitionQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQuestionStyleAccess().getStyledQuestionQuestionDefinitionQualifiedNameParserRuleCall_1_0_1()); 

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
    // InternalQLS.g:8431:1: rule__QuestionStyle__LabelStyleAssignment_3_1 : ( ruleLabelStyle ) ;
    public final void rule__QuestionStyle__LabelStyleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8435:1: ( ( ruleLabelStyle ) )
            // InternalQLS.g:8436:2: ( ruleLabelStyle )
            {
            // InternalQLS.g:8436:2: ( ruleLabelStyle )
            // InternalQLS.g:8437:3: ruleLabelStyle
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
    // InternalQLS.g:8446:1: rule__QuestionStyle__TypeStyleAssignment_4_1 : ( ruleTypeStyle ) ;
    public final void rule__QuestionStyle__TypeStyleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8450:1: ( ( ruleTypeStyle ) )
            // InternalQLS.g:8451:2: ( ruleTypeStyle )
            {
            // InternalQLS.g:8451:2: ( ruleTypeStyle )
            // InternalQLS.g:8452:3: ruleTypeStyle
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
    // InternalQLS.g:8461:1: rule__LabelStyle__ItalicAssignment_2 : ( ( 'italic' ) ) ;
    public final void rule__LabelStyle__ItalicAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8465:1: ( ( ( 'italic' ) ) )
            // InternalQLS.g:8466:2: ( ( 'italic' ) )
            {
            // InternalQLS.g:8466:2: ( ( 'italic' ) )
            // InternalQLS.g:8467:3: ( 'italic' )
            {
             before(grammarAccess.getLabelStyleAccess().getItalicItalicKeyword_2_0()); 
            // InternalQLS.g:8468:3: ( 'italic' )
            // InternalQLS.g:8469:4: 'italic'
            {
             before(grammarAccess.getLabelStyleAccess().getItalicItalicKeyword_2_0()); 
            match(input,83,FOLLOW_2); 
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
    // InternalQLS.g:8480:1: rule__LabelStyle__BoldAssignment_3 : ( ( 'bold' ) ) ;
    public final void rule__LabelStyle__BoldAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8484:1: ( ( ( 'bold' ) ) )
            // InternalQLS.g:8485:2: ( ( 'bold' ) )
            {
            // InternalQLS.g:8485:2: ( ( 'bold' ) )
            // InternalQLS.g:8486:3: ( 'bold' )
            {
             before(grammarAccess.getLabelStyleAccess().getBoldBoldKeyword_3_0()); 
            // InternalQLS.g:8487:3: ( 'bold' )
            // InternalQLS.g:8488:4: 'bold'
            {
             before(grammarAccess.getLabelStyleAccess().getBoldBoldKeyword_3_0()); 
            match(input,84,FOLLOW_2); 
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
    // InternalQLS.g:8499:1: rule__BooleanTypeStyle__BooleanStyleKindAssignment_2 : ( ruleBooleanStyleKind ) ;
    public final void rule__BooleanTypeStyle__BooleanStyleKindAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8503:1: ( ( ruleBooleanStyleKind ) )
            // InternalQLS.g:8504:2: ( ruleBooleanStyleKind )
            {
            // InternalQLS.g:8504:2: ( ruleBooleanStyleKind )
            // InternalQLS.g:8505:3: ruleBooleanStyleKind
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
    // InternalQLS.g:8514:1: rule__NumericTypeTextFieldStyle__StepAssignment_4_1 : ( ruleEDouble ) ;
    public final void rule__NumericTypeTextFieldStyle__StepAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8518:1: ( ( ruleEDouble ) )
            // InternalQLS.g:8519:2: ( ruleEDouble )
            {
            // InternalQLS.g:8519:2: ( ruleEDouble )
            // InternalQLS.g:8520:3: ruleEDouble
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
    // InternalQLS.g:8529:1: rule__TextTypeStyle__MultilineAssignment_3 : ( ( 'multiline' ) ) ;
    public final void rule__TextTypeStyle__MultilineAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8533:1: ( ( ( 'multiline' ) ) )
            // InternalQLS.g:8534:2: ( ( 'multiline' ) )
            {
            // InternalQLS.g:8534:2: ( ( 'multiline' ) )
            // InternalQLS.g:8535:3: ( 'multiline' )
            {
             before(grammarAccess.getTextTypeStyleAccess().getMultilineMultilineKeyword_3_0()); 
            // InternalQLS.g:8536:3: ( 'multiline' )
            // InternalQLS.g:8537:4: 'multiline'
            {
             before(grammarAccess.getTextTypeStyleAccess().getMultilineMultilineKeyword_3_0()); 
            match(input,85,FOLLOW_2); 
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
    // InternalQLS.g:8548:1: rule__UnaryExpression__OperatorAssignment_1 : ( ruleUnaryOperatorKind ) ;
    public final void rule__UnaryExpression__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8552:1: ( ( ruleUnaryOperatorKind ) )
            // InternalQLS.g:8553:2: ( ruleUnaryOperatorKind )
            {
            // InternalQLS.g:8553:2: ( ruleUnaryOperatorKind )
            // InternalQLS.g:8554:3: ruleUnaryOperatorKind
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
    // InternalQLS.g:8563:1: rule__UnaryExpression__OperandAssignment_2 : ( ruleUnaryOrPrimaryExpression ) ;
    public final void rule__UnaryExpression__OperandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8567:1: ( ( ruleUnaryOrPrimaryExpression ) )
            // InternalQLS.g:8568:2: ( ruleUnaryOrPrimaryExpression )
            {
            // InternalQLS.g:8568:2: ( ruleUnaryOrPrimaryExpression )
            // InternalQLS.g:8569:3: ruleUnaryOrPrimaryExpression
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
    // InternalQLS.g:8578:1: rule__IfExpression__ConditionAssignment_2 : ( ruleExpression ) ;
    public final void rule__IfExpression__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8582:1: ( ( ruleExpression ) )
            // InternalQLS.g:8583:2: ( ruleExpression )
            {
            // InternalQLS.g:8583:2: ( ruleExpression )
            // InternalQLS.g:8584:3: ruleExpression
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
    // InternalQLS.g:8593:1: rule__IfExpression__ThenExpressionAssignment_4 : ( ruleExpression ) ;
    public final void rule__IfExpression__ThenExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8597:1: ( ( ruleExpression ) )
            // InternalQLS.g:8598:2: ( ruleExpression )
            {
            // InternalQLS.g:8598:2: ( ruleExpression )
            // InternalQLS.g:8599:3: ruleExpression
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
    // InternalQLS.g:8608:1: rule__IfExpression__ElseExpressionAssignment_5_1 : ( ruleExpression ) ;
    public final void rule__IfExpression__ElseExpressionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8612:1: ( ( ruleExpression ) )
            // InternalQLS.g:8613:2: ( ruleExpression )
            {
            // InternalQLS.g:8613:2: ( ruleExpression )
            // InternalQLS.g:8614:3: ruleExpression
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
    // InternalQLS.g:8623:1: rule__OrExpression__OperatorAssignment_1_1 : ( ruleOrOperatorKind ) ;
    public final void rule__OrExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8627:1: ( ( ruleOrOperatorKind ) )
            // InternalQLS.g:8628:2: ( ruleOrOperatorKind )
            {
            // InternalQLS.g:8628:2: ( ruleOrOperatorKind )
            // InternalQLS.g:8629:3: ruleOrOperatorKind
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
    // InternalQLS.g:8638:1: rule__OrExpression__RhsOperandAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__RhsOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8642:1: ( ( ruleAndExpression ) )
            // InternalQLS.g:8643:2: ( ruleAndExpression )
            {
            // InternalQLS.g:8643:2: ( ruleAndExpression )
            // InternalQLS.g:8644:3: ruleAndExpression
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
    // InternalQLS.g:8653:1: rule__AndExpression__OperatorAssignment_1_1 : ( ruleAndOperatorKind ) ;
    public final void rule__AndExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8657:1: ( ( ruleAndOperatorKind ) )
            // InternalQLS.g:8658:2: ( ruleAndOperatorKind )
            {
            // InternalQLS.g:8658:2: ( ruleAndOperatorKind )
            // InternalQLS.g:8659:3: ruleAndOperatorKind
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
    // InternalQLS.g:8668:1: rule__AndExpression__RhsOperandAssignment_1_2 : ( ruleEqualExpression ) ;
    public final void rule__AndExpression__RhsOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8672:1: ( ( ruleEqualExpression ) )
            // InternalQLS.g:8673:2: ( ruleEqualExpression )
            {
            // InternalQLS.g:8673:2: ( ruleEqualExpression )
            // InternalQLS.g:8674:3: ruleEqualExpression
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
    // InternalQLS.g:8683:1: rule__EqualExpression__OperatorAssignment_1_1 : ( ruleEqualOperatorKind ) ;
    public final void rule__EqualExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8687:1: ( ( ruleEqualOperatorKind ) )
            // InternalQLS.g:8688:2: ( ruleEqualOperatorKind )
            {
            // InternalQLS.g:8688:2: ( ruleEqualOperatorKind )
            // InternalQLS.g:8689:3: ruleEqualOperatorKind
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
    // InternalQLS.g:8698:1: rule__EqualExpression__RhsOperandAssignment_1_2 : ( ruleComparisionExpression ) ;
    public final void rule__EqualExpression__RhsOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8702:1: ( ( ruleComparisionExpression ) )
            // InternalQLS.g:8703:2: ( ruleComparisionExpression )
            {
            // InternalQLS.g:8703:2: ( ruleComparisionExpression )
            // InternalQLS.g:8704:3: ruleComparisionExpression
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
    // InternalQLS.g:8713:1: rule__ComparisionExpression__OperatorAssignment_1_1 : ( ruleComparisionOperatorKind ) ;
    public final void rule__ComparisionExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8717:1: ( ( ruleComparisionOperatorKind ) )
            // InternalQLS.g:8718:2: ( ruleComparisionOperatorKind )
            {
            // InternalQLS.g:8718:2: ( ruleComparisionOperatorKind )
            // InternalQLS.g:8719:3: ruleComparisionOperatorKind
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
    // InternalQLS.g:8728:1: rule__ComparisionExpression__RhsOperandAssignment_1_2 : ( ruleAdditionExpression ) ;
    public final void rule__ComparisionExpression__RhsOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8732:1: ( ( ruleAdditionExpression ) )
            // InternalQLS.g:8733:2: ( ruleAdditionExpression )
            {
            // InternalQLS.g:8733:2: ( ruleAdditionExpression )
            // InternalQLS.g:8734:3: ruleAdditionExpression
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
    // InternalQLS.g:8743:1: rule__AdditionExpression__OperatorAssignment_1_1 : ( ruleAdditionOperatorKind ) ;
    public final void rule__AdditionExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8747:1: ( ( ruleAdditionOperatorKind ) )
            // InternalQLS.g:8748:2: ( ruleAdditionOperatorKind )
            {
            // InternalQLS.g:8748:2: ( ruleAdditionOperatorKind )
            // InternalQLS.g:8749:3: ruleAdditionOperatorKind
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
    // InternalQLS.g:8758:1: rule__AdditionExpression__RhsOperandAssignment_1_2 : ( ruleMultiplicationExpression ) ;
    public final void rule__AdditionExpression__RhsOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8762:1: ( ( ruleMultiplicationExpression ) )
            // InternalQLS.g:8763:2: ( ruleMultiplicationExpression )
            {
            // InternalQLS.g:8763:2: ( ruleMultiplicationExpression )
            // InternalQLS.g:8764:3: ruleMultiplicationExpression
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
    // InternalQLS.g:8773:1: rule__MultiplicationExpression__OperatorAssignment_1_1 : ( ruleMultiplicationOperatorKind ) ;
    public final void rule__MultiplicationExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8777:1: ( ( ruleMultiplicationOperatorKind ) )
            // InternalQLS.g:8778:2: ( ruleMultiplicationOperatorKind )
            {
            // InternalQLS.g:8778:2: ( ruleMultiplicationOperatorKind )
            // InternalQLS.g:8779:3: ruleMultiplicationOperatorKind
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
    // InternalQLS.g:8788:1: rule__MultiplicationExpression__RhsOperandAssignment_1_2 : ( ruleUnaryOrPrimaryExpression ) ;
    public final void rule__MultiplicationExpression__RhsOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8792:1: ( ( ruleUnaryOrPrimaryExpression ) )
            // InternalQLS.g:8793:2: ( ruleUnaryOrPrimaryExpression )
            {
            // InternalQLS.g:8793:2: ( ruleUnaryOrPrimaryExpression )
            // InternalQLS.g:8794:3: ruleUnaryOrPrimaryExpression
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


    // $ANTLR start "rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0"
    // InternalQLS.g:8803:1: rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0 : ( ruleQuestionDefinition ) ;
    public final void rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8807:1: ( ( ruleQuestionDefinition ) )
            // InternalQLS.g:8808:2: ( ruleQuestionDefinition )
            {
            // InternalQLS.g:8808:2: ( ruleQuestionDefinition )
            // InternalQLS.g:8809:3: ruleQuestionDefinition
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
    // InternalQLS.g:8818:1: rule__DefinitionGroup__DataTypesAssignment_3_1 : ( ruleValueType ) ;
    public final void rule__DefinitionGroup__DataTypesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8822:1: ( ( ruleValueType ) )
            // InternalQLS.g:8823:2: ( ruleValueType )
            {
            // InternalQLS.g:8823:2: ( ruleValueType )
            // InternalQLS.g:8824:3: ruleValueType
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
    // InternalQLS.g:8833:1: rule__QuestionGroup__GuardAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__QuestionGroup__GuardAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8837:1: ( ( ruleExpression ) )
            // InternalQLS.g:8838:2: ( ruleExpression )
            {
            // InternalQLS.g:8838:2: ( ruleExpression )
            // InternalQLS.g:8839:3: ruleExpression
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
    // InternalQLS.g:8848:1: rule__QuestionGroup__QuestionGroupsAssignment_3_0 : ( ruleQuestionGroup ) ;
    public final void rule__QuestionGroup__QuestionGroupsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8852:1: ( ( ruleQuestionGroup ) )
            // InternalQLS.g:8853:2: ( ruleQuestionGroup )
            {
            // InternalQLS.g:8853:2: ( ruleQuestionGroup )
            // InternalQLS.g:8854:3: ruleQuestionGroup
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
    // InternalQLS.g:8863:1: rule__QuestionGroup__QuestionsAssignment_3_1 : ( ruleQuestion ) ;
    public final void rule__QuestionGroup__QuestionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8867:1: ( ( ruleQuestion ) )
            // InternalQLS.g:8868:2: ( ruleQuestion )
            {
            // InternalQLS.g:8868:2: ( ruleQuestion )
            // InternalQLS.g:8869:3: ruleQuestion
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
    // InternalQLS.g:8878:1: rule__Question__QuestionDefinitionAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__Question__QuestionDefinitionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8882:1: ( ( ( ruleQualifiedName ) ) )
            // InternalQLS.g:8883:2: ( ( ruleQualifiedName ) )
            {
            // InternalQLS.g:8883:2: ( ( ruleQualifiedName ) )
            // InternalQLS.g:8884:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getQuestionAccess().getQuestionDefinitionQuestionDefinitionCrossReference_0()); 
            // InternalQLS.g:8885:3: ( ruleQualifiedName )
            // InternalQLS.g:8886:4: ruleQualifiedName
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
    // InternalQLS.g:8897:1: rule__ValueType_Impl__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ValueType_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8901:1: ( ( RULE_ID ) )
            // InternalQLS.g:8902:2: ( RULE_ID )
            {
            // InternalQLS.g:8902:2: ( RULE_ID )
            // InternalQLS.g:8903:3: RULE_ID
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
    // InternalQLS.g:8912:1: rule__ValueType_Impl__UnitAssignment_4_1 : ( ruleEString ) ;
    public final void rule__ValueType_Impl__UnitAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8916:1: ( ( ruleEString ) )
            // InternalQLS.g:8917:2: ( ruleEString )
            {
            // InternalQLS.g:8917:2: ( ruleEString )
            // InternalQLS.g:8918:3: ruleEString
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
    // InternalQLS.g:8927:1: rule__ConstantCall__ValueAssignment_1 : ( ( rule__ConstantCall__ValueAlternatives_1_0 ) ) ;
    public final void rule__ConstantCall__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8931:1: ( ( ( rule__ConstantCall__ValueAlternatives_1_0 ) ) )
            // InternalQLS.g:8932:2: ( ( rule__ConstantCall__ValueAlternatives_1_0 ) )
            {
            // InternalQLS.g:8932:2: ( ( rule__ConstantCall__ValueAlternatives_1_0 ) )
            // InternalQLS.g:8933:3: ( rule__ConstantCall__ValueAlternatives_1_0 )
            {
             before(grammarAccess.getConstantCallAccess().getValueAlternatives_1_0()); 
            // InternalQLS.g:8934:3: ( rule__ConstantCall__ValueAlternatives_1_0 )
            // InternalQLS.g:8934:4: rule__ConstantCall__ValueAlternatives_1_0
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
    // InternalQLS.g:8942:1: rule__QuestionCall__QuestionAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__QuestionCall__QuestionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8946:1: ( ( ( ruleQualifiedName ) ) )
            // InternalQLS.g:8947:2: ( ( ruleQualifiedName ) )
            {
            // InternalQLS.g:8947:2: ( ( ruleQualifiedName ) )
            // InternalQLS.g:8948:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getQuestionCallAccess().getQuestionQuestionDefinitionCrossReference_1_0()); 
            // InternalQLS.g:8949:3: ( ruleQualifiedName )
            // InternalQLS.g:8950:4: ruleQualifiedName
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
    // InternalQLS.g:8961:1: rule__BooleanValueType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BooleanValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8965:1: ( ( RULE_ID ) )
            // InternalQLS.g:8966:2: ( RULE_ID )
            {
            // InternalQLS.g:8966:2: ( RULE_ID )
            // InternalQLS.g:8967:3: RULE_ID
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
    // InternalQLS.g:8976:1: rule__BooleanValueType__UnitAssignment_3_1_1 : ( ruleEString ) ;
    public final void rule__BooleanValueType__UnitAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8980:1: ( ( ruleEString ) )
            // InternalQLS.g:8981:2: ( ruleEString )
            {
            // InternalQLS.g:8981:2: ( ruleEString )
            // InternalQLS.g:8982:3: ruleEString
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
    // InternalQLS.g:8991:1: rule__IntegerValueType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__IntegerValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8995:1: ( ( RULE_ID ) )
            // InternalQLS.g:8996:2: ( RULE_ID )
            {
            // InternalQLS.g:8996:2: ( RULE_ID )
            // InternalQLS.g:8997:3: RULE_ID
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
    // InternalQLS.g:9006:1: rule__IntegerValueType__UnitAssignment_3_1_1 : ( ruleEString ) ;
    public final void rule__IntegerValueType__UnitAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9010:1: ( ( ruleEString ) )
            // InternalQLS.g:9011:2: ( ruleEString )
            {
            // InternalQLS.g:9011:2: ( ruleEString )
            // InternalQLS.g:9012:3: ruleEString
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
    // InternalQLS.g:9021:1: rule__IntegerValueType__MinAssignment_3_2_1 : ( ruleEInt ) ;
    public final void rule__IntegerValueType__MinAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9025:1: ( ( ruleEInt ) )
            // InternalQLS.g:9026:2: ( ruleEInt )
            {
            // InternalQLS.g:9026:2: ( ruleEInt )
            // InternalQLS.g:9027:3: ruleEInt
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
    // InternalQLS.g:9036:1: rule__IntegerValueType__MaxAssignment_3_3_1 : ( ruleEInt ) ;
    public final void rule__IntegerValueType__MaxAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9040:1: ( ( ruleEInt ) )
            // InternalQLS.g:9041:2: ( ruleEInt )
            {
            // InternalQLS.g:9041:2: ( ruleEInt )
            // InternalQLS.g:9042:3: ruleEInt
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
    // InternalQLS.g:9051:1: rule__DecimalValueType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DecimalValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9055:1: ( ( RULE_ID ) )
            // InternalQLS.g:9056:2: ( RULE_ID )
            {
            // InternalQLS.g:9056:2: ( RULE_ID )
            // InternalQLS.g:9057:3: RULE_ID
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
    // InternalQLS.g:9066:1: rule__DecimalValueType__UnitAssignment_3_1_1 : ( ruleEString ) ;
    public final void rule__DecimalValueType__UnitAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9070:1: ( ( ruleEString ) )
            // InternalQLS.g:9071:2: ( ruleEString )
            {
            // InternalQLS.g:9071:2: ( ruleEString )
            // InternalQLS.g:9072:3: ruleEString
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
    // InternalQLS.g:9081:1: rule__DateValueType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DateValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9085:1: ( ( RULE_ID ) )
            // InternalQLS.g:9086:2: ( RULE_ID )
            {
            // InternalQLS.g:9086:2: ( RULE_ID )
            // InternalQLS.g:9087:3: RULE_ID
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
    // InternalQLS.g:9096:1: rule__DateValueType__UnitAssignment_3_1_1 : ( ruleEString ) ;
    public final void rule__DateValueType__UnitAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9100:1: ( ( ruleEString ) )
            // InternalQLS.g:9101:2: ( ruleEString )
            {
            // InternalQLS.g:9101:2: ( ruleEString )
            // InternalQLS.g:9102:3: ruleEString
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
    // InternalQLS.g:9111:1: rule__EnumerationValueType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EnumerationValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9115:1: ( ( RULE_ID ) )
            // InternalQLS.g:9116:2: ( RULE_ID )
            {
            // InternalQLS.g:9116:2: ( RULE_ID )
            // InternalQLS.g:9117:3: RULE_ID
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
    // InternalQLS.g:9126:1: rule__EnumerationValueType__UnitAssignment_3_1_1 : ( ruleEString ) ;
    public final void rule__EnumerationValueType__UnitAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9130:1: ( ( ruleEString ) )
            // InternalQLS.g:9131:2: ( ruleEString )
            {
            // InternalQLS.g:9131:2: ( ruleEString )
            // InternalQLS.g:9132:3: ruleEString
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
    // InternalQLS.g:9141:1: rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2 : ( ruleEnumerationLiteral ) ;
    public final void rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9145:1: ( ( ruleEnumerationLiteral ) )
            // InternalQLS.g:9146:2: ( ruleEnumerationLiteral )
            {
            // InternalQLS.g:9146:2: ( ruleEnumerationLiteral )
            // InternalQLS.g:9147:3: ruleEnumerationLiteral
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
    // InternalQLS.g:9156:1: rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1 : ( ruleEnumerationLiteral ) ;
    public final void rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9160:1: ( ( ruleEnumerationLiteral ) )
            // InternalQLS.g:9161:2: ( ruleEnumerationLiteral )
            {
            // InternalQLS.g:9161:2: ( ruleEnumerationLiteral )
            // InternalQLS.g:9162:3: ruleEnumerationLiteral
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
    // InternalQLS.g:9171:1: rule__StringValueType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__StringValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9175:1: ( ( RULE_ID ) )
            // InternalQLS.g:9176:2: ( RULE_ID )
            {
            // InternalQLS.g:9176:2: ( RULE_ID )
            // InternalQLS.g:9177:3: RULE_ID
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
    // InternalQLS.g:9186:1: rule__StringValueType__UnitAssignment_3_1_1 : ( ruleEString ) ;
    public final void rule__StringValueType__UnitAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9190:1: ( ( ruleEString ) )
            // InternalQLS.g:9191:2: ( ruleEString )
            {
            // InternalQLS.g:9191:2: ( ruleEString )
            // InternalQLS.g:9192:3: ruleEString
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
    // InternalQLS.g:9201:1: rule__EnumerationLiteral__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumerationLiteral__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9205:1: ( ( RULE_ID ) )
            // InternalQLS.g:9206:2: ( RULE_ID )
            {
            // InternalQLS.g:9206:2: ( RULE_ID )
            // InternalQLS.g:9207:3: RULE_ID
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
    // InternalQLS.g:9216:1: rule__IntegerValue__IntValueAssignment_1 : ( ruleEInt ) ;
    public final void rule__IntegerValue__IntValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9220:1: ( ( ruleEInt ) )
            // InternalQLS.g:9221:2: ( ruleEInt )
            {
            // InternalQLS.g:9221:2: ( ruleEInt )
            // InternalQLS.g:9222:3: ruleEInt
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
    // InternalQLS.g:9231:1: rule__StringValue__StringValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StringValue__StringValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9235:1: ( ( RULE_STRING ) )
            // InternalQLS.g:9236:2: ( RULE_STRING )
            {
            // InternalQLS.g:9236:2: ( RULE_STRING )
            // InternalQLS.g:9237:3: RULE_STRING
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
    // InternalQLS.g:9246:1: rule__BooleanValue__BooleanValueAssignment_1 : ( ruleEBoolean ) ;
    public final void rule__BooleanValue__BooleanValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9250:1: ( ( ruleEBoolean ) )
            // InternalQLS.g:9251:2: ( ruleEBoolean )
            {
            // InternalQLS.g:9251:2: ( ruleEBoolean )
            // InternalQLS.g:9252:3: ruleEBoolean
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
    // InternalQLS.g:9261:1: rule__EnumerationCall__EnumerationLiteralAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EnumerationCall__EnumerationLiteralAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9265:1: ( ( ( ruleQualifiedName ) ) )
            // InternalQLS.g:9266:2: ( ( ruleQualifiedName ) )
            {
            // InternalQLS.g:9266:2: ( ( ruleQualifiedName ) )
            // InternalQLS.g:9267:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getEnumerationCallAccess().getEnumerationLiteralEnumerationLiteralCrossReference_1_0()); 
            // InternalQLS.g:9268:3: ( ruleQualifiedName )
            // InternalQLS.g:9269:4: ruleQualifiedName
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
    // InternalQLS.g:9280:1: rule__DateValue__DateValueAssignment_3_1 : ( ruleEDate ) ;
    public final void rule__DateValue__DateValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9284:1: ( ( ruleEDate ) )
            // InternalQLS.g:9285:2: ( ruleEDate )
            {
            // InternalQLS.g:9285:2: ( ruleEDate )
            // InternalQLS.g:9286:3: ruleEDate
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
    // InternalQLS.g:9295:1: rule__DecimalValue__DecimalValueAssignment_1 : ( ruleEDouble ) ;
    public final void rule__DecimalValue__DecimalValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9299:1: ( ( ruleEDouble ) )
            // InternalQLS.g:9300:2: ( ruleEDouble )
            {
            // InternalQLS.g:9300:2: ( ruleEDouble )
            // InternalQLS.g:9301:3: ruleEDouble
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
    // InternalQLS.g:9310:1: rule__QuestionDefinition__IsMandatoryAssignment_0 : ( ( 'mandatory' ) ) ;
    public final void rule__QuestionDefinition__IsMandatoryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9314:1: ( ( ( 'mandatory' ) ) )
            // InternalQLS.g:9315:2: ( ( 'mandatory' ) )
            {
            // InternalQLS.g:9315:2: ( ( 'mandatory' ) )
            // InternalQLS.g:9316:3: ( 'mandatory' )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getIsMandatoryMandatoryKeyword_0_0()); 
            // InternalQLS.g:9317:3: ( 'mandatory' )
            // InternalQLS.g:9318:4: 'mandatory'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getIsMandatoryMandatoryKeyword_0_0()); 
            match(input,86,FOLLOW_2); 
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
    // InternalQLS.g:9329:1: rule__QuestionDefinition__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__QuestionDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9333:1: ( ( ruleEString ) )
            // InternalQLS.g:9334:2: ( ruleEString )
            {
            // InternalQLS.g:9334:2: ( ruleEString )
            // InternalQLS.g:9335:3: ruleEString
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
    // InternalQLS.g:9344:1: rule__QuestionDefinition__IsDisplayedAssignment_3_1 : ( ( 'isDisplayed' ) ) ;
    public final void rule__QuestionDefinition__IsDisplayedAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9348:1: ( ( ( 'isDisplayed' ) ) )
            // InternalQLS.g:9349:2: ( ( 'isDisplayed' ) )
            {
            // InternalQLS.g:9349:2: ( ( 'isDisplayed' ) )
            // InternalQLS.g:9350:3: ( 'isDisplayed' )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getIsDisplayedIsDisplayedKeyword_3_1_0()); 
            // InternalQLS.g:9351:3: ( 'isDisplayed' )
            // InternalQLS.g:9352:4: 'isDisplayed'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getIsDisplayedIsDisplayedKeyword_3_1_0()); 
            match(input,87,FOLLOW_2); 
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
    // InternalQLS.g:9363:1: rule__QuestionDefinition__CurrentValueAssignment_3_2_1 : ( ruleValue ) ;
    public final void rule__QuestionDefinition__CurrentValueAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9367:1: ( ( ruleValue ) )
            // InternalQLS.g:9368:2: ( ruleValue )
            {
            // InternalQLS.g:9368:2: ( ruleValue )
            // InternalQLS.g:9369:3: ruleValue
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
    // InternalQLS.g:9378:1: rule__QuestionDefinition__LabelAssignment_5 : ( ruleEString ) ;
    public final void rule__QuestionDefinition__LabelAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9382:1: ( ( ruleEString ) )
            // InternalQLS.g:9383:2: ( ruleEString )
            {
            // InternalQLS.g:9383:2: ( ruleEString )
            // InternalQLS.g:9384:3: ruleEString
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
    // InternalQLS.g:9393:1: rule__QuestionDefinition__DataTypeAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__QuestionDefinition__DataTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9397:1: ( ( ( ruleEString ) ) )
            // InternalQLS.g:9398:2: ( ( ruleEString ) )
            {
            // InternalQLS.g:9398:2: ( ( ruleEString ) )
            // InternalQLS.g:9399:3: ( ruleEString )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getDataTypeValueTypeCrossReference_6_0()); 
            // InternalQLS.g:9400:3: ( ruleEString )
            // InternalQLS.g:9401:4: ruleEString
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
    // InternalQLS.g:9412:1: rule__QuestionDefinition__ComputedExpressionAssignment_7_1 : ( ruleExpression ) ;
    public final void rule__QuestionDefinition__ComputedExpressionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9416:1: ( ( ruleExpression ) )
            // InternalQLS.g:9417:2: ( ruleExpression )
            {
            // InternalQLS.g:9417:2: ( ruleExpression )
            // InternalQLS.g:9418:3: ruleExpression
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
    static final String dfa_4s = "\1\116\1\uffff\1\122\1\6\2\uffff\1\122";
    static final String dfa_5s = "\1\uffff\1\1\2\uffff\1\3\1\2\1\uffff";
    static final String dfa_6s = "\7\uffff}>";
    static final String[] dfa_7s = {
            "\2\1\1\2\10\uffff\2\1\75\uffff\1\1",
            "",
            "\3\4\23\uffff\1\4\1\uffff\7\4\1\uffff\1\4\14\uffff\1\5\1\4\1\uffff\3\4\17\uffff\1\3\3\uffff\1\4",
            "\1\6",
            "",
            "",
            "\3\4\23\uffff\1\4\1\uffff\7\4\1\uffff\1\4\14\uffff\1\5\1\4\1\uffff\3\4\17\uffff\1\3\3\uffff\1\4"
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
            return "1614:1: rule__Call__Alternatives : ( ( ruleConstantCall ) | ( ruleQuestionCall ) | ( ruleEnumerationCall ) );";
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
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000400000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0040400000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000400000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0A00000C00018070L,0x0000000000004000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0A00000000018070L,0x0000000000004000L});
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
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000400000000000L,0x00000000004089CDL});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000002L,0x00000000004089CDL});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0800100000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0800500000000040L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0800100000000042L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000018030L,0x0000000000004000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000032L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000202L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x00000000004089CDL});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000018070L,0x0000000000004000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000400000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000408000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0200000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0400000000000000L,0x0000000000820000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000018030L,0x0000000000005000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});

}