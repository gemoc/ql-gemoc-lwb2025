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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'EDate'", "'='", "'and'", "'or'", "'true'", "'false'", "'E'", "'e'", "'CHECKBOX'", "'TWO_RADIO'", "'DROPDOWN'", "'PLUS'", "'MINUS'", "'MULT'", "'DIV'", "'EQUAL'", "'NOTEQUAL'", "'GREATER'", "'LOWER'", "'GREATEROREQUAL'", "'LOWEROREQUAL'", "'AND'", "'OR'", "'-'", "'not'", "'+'", "'*'", "'/'", "'>'", "'<'", "'>='", "'<='", "'QLSModel'", "'{'", "'questionStyles'", "'}'", "'import'", "'section'", "'styledQuestion'", "'labelStyle'", "'typeStyle'", "'boolean'", "'numeric'", "'textField'", "'spinner'", "'step'", "'text'", "'('", "')'", "'if'", "'then'", "'endif'", "'else'", "'ValueType'", "'unit'", "'booleanType'", "'integerType'", "'min'", "'max'", "'decimalType'", "'dateType'", "'enumerationType'", "'literals'", "','", "'StringType'", "'DateValue'", "'dateValue'", "'.'", "'question'", "':'", "'currentValue'", "';'", "'italic'", "'bold'", "'multiline'", "'mandatory'", "'isDisplayed'"
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


    // $ANTLR start "entryRuleSection"
    // InternalQLS.g:103:1: entryRuleSection : ruleSection EOF ;
    public final void entryRuleSection() throws RecognitionException {
        try {
            // InternalQLS.g:104:1: ( ruleSection EOF )
            // InternalQLS.g:105:1: ruleSection EOF
            {
             before(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getSectionRule()); 
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
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalQLS.g:112:1: ruleSection : ( ( rule__Section__Group__0 ) ) ;
    public final void ruleSection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:116:2: ( ( ( rule__Section__Group__0 ) ) )
            // InternalQLS.g:117:2: ( ( rule__Section__Group__0 ) )
            {
            // InternalQLS.g:117:2: ( ( rule__Section__Group__0 ) )
            // InternalQLS.g:118:3: ( rule__Section__Group__0 )
            {
             before(grammarAccess.getSectionAccess().getGroup()); 
            // InternalQLS.g:119:3: ( rule__Section__Group__0 )
            // InternalQLS.g:119:4: rule__Section__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleSectionContent"
    // InternalQLS.g:128:1: entryRuleSectionContent : ruleSectionContent EOF ;
    public final void entryRuleSectionContent() throws RecognitionException {
        try {
            // InternalQLS.g:129:1: ( ruleSectionContent EOF )
            // InternalQLS.g:130:1: ruleSectionContent EOF
            {
             before(grammarAccess.getSectionContentRule()); 
            pushFollow(FOLLOW_1);
            ruleSectionContent();

            state._fsp--;

             after(grammarAccess.getSectionContentRule()); 
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
    // $ANTLR end "entryRuleSectionContent"


    // $ANTLR start "ruleSectionContent"
    // InternalQLS.g:137:1: ruleSectionContent : ( ( rule__SectionContent__Alternatives ) ) ;
    public final void ruleSectionContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:141:2: ( ( ( rule__SectionContent__Alternatives ) ) )
            // InternalQLS.g:142:2: ( ( rule__SectionContent__Alternatives ) )
            {
            // InternalQLS.g:142:2: ( ( rule__SectionContent__Alternatives ) )
            // InternalQLS.g:143:3: ( rule__SectionContent__Alternatives )
            {
             before(grammarAccess.getSectionContentAccess().getAlternatives()); 
            // InternalQLS.g:144:3: ( rule__SectionContent__Alternatives )
            // InternalQLS.g:144:4: rule__SectionContent__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SectionContent__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSectionContentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSectionContent"


    // $ANTLR start "entryRuleQuestionReference"
    // InternalQLS.g:153:1: entryRuleQuestionReference : ruleQuestionReference EOF ;
    public final void entryRuleQuestionReference() throws RecognitionException {
        try {
            // InternalQLS.g:154:1: ( ruleQuestionReference EOF )
            // InternalQLS.g:155:1: ruleQuestionReference EOF
            {
             before(grammarAccess.getQuestionReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleQuestionReference();

            state._fsp--;

             after(grammarAccess.getQuestionReferenceRule()); 
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
    // $ANTLR end "entryRuleQuestionReference"


    // $ANTLR start "ruleQuestionReference"
    // InternalQLS.g:162:1: ruleQuestionReference : ( ( rule__QuestionReference__Group__0 ) ) ;
    public final void ruleQuestionReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:166:2: ( ( ( rule__QuestionReference__Group__0 ) ) )
            // InternalQLS.g:167:2: ( ( rule__QuestionReference__Group__0 ) )
            {
            // InternalQLS.g:167:2: ( ( rule__QuestionReference__Group__0 ) )
            // InternalQLS.g:168:3: ( rule__QuestionReference__Group__0 )
            {
             before(grammarAccess.getQuestionReferenceAccess().getGroup()); 
            // InternalQLS.g:169:3: ( rule__QuestionReference__Group__0 )
            // InternalQLS.g:169:4: rule__QuestionReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QuestionReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestionReference"


    // $ANTLR start "entryRuleTypeStyle"
    // InternalQLS.g:178:1: entryRuleTypeStyle : ruleTypeStyle EOF ;
    public final void entryRuleTypeStyle() throws RecognitionException {
        try {
            // InternalQLS.g:179:1: ( ruleTypeStyle EOF )
            // InternalQLS.g:180:1: ruleTypeStyle EOF
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
    // InternalQLS.g:187:1: ruleTypeStyle : ( ( rule__TypeStyle__Alternatives ) ) ;
    public final void ruleTypeStyle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:191:2: ( ( ( rule__TypeStyle__Alternatives ) ) )
            // InternalQLS.g:192:2: ( ( rule__TypeStyle__Alternatives ) )
            {
            // InternalQLS.g:192:2: ( ( rule__TypeStyle__Alternatives ) )
            // InternalQLS.g:193:3: ( rule__TypeStyle__Alternatives )
            {
             before(grammarAccess.getTypeStyleAccess().getAlternatives()); 
            // InternalQLS.g:194:3: ( rule__TypeStyle__Alternatives )
            // InternalQLS.g:194:4: rule__TypeStyle__Alternatives
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
    // InternalQLS.g:203:1: entryRuleNumericTypeStyle : ruleNumericTypeStyle EOF ;
    public final void entryRuleNumericTypeStyle() throws RecognitionException {
        try {
            // InternalQLS.g:204:1: ( ruleNumericTypeStyle EOF )
            // InternalQLS.g:205:1: ruleNumericTypeStyle EOF
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
    // InternalQLS.g:212:1: ruleNumericTypeStyle : ( ( rule__NumericTypeStyle__Alternatives ) ) ;
    public final void ruleNumericTypeStyle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:216:2: ( ( ( rule__NumericTypeStyle__Alternatives ) ) )
            // InternalQLS.g:217:2: ( ( rule__NumericTypeStyle__Alternatives ) )
            {
            // InternalQLS.g:217:2: ( ( rule__NumericTypeStyle__Alternatives ) )
            // InternalQLS.g:218:3: ( rule__NumericTypeStyle__Alternatives )
            {
             before(grammarAccess.getNumericTypeStyleAccess().getAlternatives()); 
            // InternalQLS.g:219:3: ( rule__NumericTypeStyle__Alternatives )
            // InternalQLS.g:219:4: rule__NumericTypeStyle__Alternatives
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
    // InternalQLS.g:228:1: entryRuleQuestionStyle : ruleQuestionStyle EOF ;
    public final void entryRuleQuestionStyle() throws RecognitionException {
        try {
            // InternalQLS.g:229:1: ( ruleQuestionStyle EOF )
            // InternalQLS.g:230:1: ruleQuestionStyle EOF
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
    // InternalQLS.g:237:1: ruleQuestionStyle : ( ( rule__QuestionStyle__Group__0 ) ) ;
    public final void ruleQuestionStyle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:241:2: ( ( ( rule__QuestionStyle__Group__0 ) ) )
            // InternalQLS.g:242:2: ( ( rule__QuestionStyle__Group__0 ) )
            {
            // InternalQLS.g:242:2: ( ( rule__QuestionStyle__Group__0 ) )
            // InternalQLS.g:243:3: ( rule__QuestionStyle__Group__0 )
            {
             before(grammarAccess.getQuestionStyleAccess().getGroup()); 
            // InternalQLS.g:244:3: ( rule__QuestionStyle__Group__0 )
            // InternalQLS.g:244:4: rule__QuestionStyle__Group__0
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
    // InternalQLS.g:253:1: entryRuleLabelStyle : ruleLabelStyle EOF ;
    public final void entryRuleLabelStyle() throws RecognitionException {
        try {
            // InternalQLS.g:254:1: ( ruleLabelStyle EOF )
            // InternalQLS.g:255:1: ruleLabelStyle EOF
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
    // InternalQLS.g:262:1: ruleLabelStyle : ( ( rule__LabelStyle__Group__0 ) ) ;
    public final void ruleLabelStyle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:266:2: ( ( ( rule__LabelStyle__Group__0 ) ) )
            // InternalQLS.g:267:2: ( ( rule__LabelStyle__Group__0 ) )
            {
            // InternalQLS.g:267:2: ( ( rule__LabelStyle__Group__0 ) )
            // InternalQLS.g:268:3: ( rule__LabelStyle__Group__0 )
            {
             before(grammarAccess.getLabelStyleAccess().getGroup()); 
            // InternalQLS.g:269:3: ( rule__LabelStyle__Group__0 )
            // InternalQLS.g:269:4: rule__LabelStyle__Group__0
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
    // InternalQLS.g:278:1: entryRuleBooleanTypeStyle : ruleBooleanTypeStyle EOF ;
    public final void entryRuleBooleanTypeStyle() throws RecognitionException {
        try {
            // InternalQLS.g:279:1: ( ruleBooleanTypeStyle EOF )
            // InternalQLS.g:280:1: ruleBooleanTypeStyle EOF
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
    // InternalQLS.g:287:1: ruleBooleanTypeStyle : ( ( rule__BooleanTypeStyle__Group__0 ) ) ;
    public final void ruleBooleanTypeStyle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:291:2: ( ( ( rule__BooleanTypeStyle__Group__0 ) ) )
            // InternalQLS.g:292:2: ( ( rule__BooleanTypeStyle__Group__0 ) )
            {
            // InternalQLS.g:292:2: ( ( rule__BooleanTypeStyle__Group__0 ) )
            // InternalQLS.g:293:3: ( rule__BooleanTypeStyle__Group__0 )
            {
             before(grammarAccess.getBooleanTypeStyleAccess().getGroup()); 
            // InternalQLS.g:294:3: ( rule__BooleanTypeStyle__Group__0 )
            // InternalQLS.g:294:4: rule__BooleanTypeStyle__Group__0
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
    // InternalQLS.g:303:1: entryRuleNumericTypeTextFieldStyle : ruleNumericTypeTextFieldStyle EOF ;
    public final void entryRuleNumericTypeTextFieldStyle() throws RecognitionException {
        try {
            // InternalQLS.g:304:1: ( ruleNumericTypeTextFieldStyle EOF )
            // InternalQLS.g:305:1: ruleNumericTypeTextFieldStyle EOF
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
    // InternalQLS.g:312:1: ruleNumericTypeTextFieldStyle : ( ( rule__NumericTypeTextFieldStyle__Group__0 ) ) ;
    public final void ruleNumericTypeTextFieldStyle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:316:2: ( ( ( rule__NumericTypeTextFieldStyle__Group__0 ) ) )
            // InternalQLS.g:317:2: ( ( rule__NumericTypeTextFieldStyle__Group__0 ) )
            {
            // InternalQLS.g:317:2: ( ( rule__NumericTypeTextFieldStyle__Group__0 ) )
            // InternalQLS.g:318:3: ( rule__NumericTypeTextFieldStyle__Group__0 )
            {
             before(grammarAccess.getNumericTypeTextFieldStyleAccess().getGroup()); 
            // InternalQLS.g:319:3: ( rule__NumericTypeTextFieldStyle__Group__0 )
            // InternalQLS.g:319:4: rule__NumericTypeTextFieldStyle__Group__0
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
    // InternalQLS.g:328:1: entryRuleNumericTypeSpinnerStyle : ruleNumericTypeSpinnerStyle EOF ;
    public final void entryRuleNumericTypeSpinnerStyle() throws RecognitionException {
        try {
            // InternalQLS.g:329:1: ( ruleNumericTypeSpinnerStyle EOF )
            // InternalQLS.g:330:1: ruleNumericTypeSpinnerStyle EOF
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
    // InternalQLS.g:337:1: ruleNumericTypeSpinnerStyle : ( ( rule__NumericTypeSpinnerStyle__Group__0 ) ) ;
    public final void ruleNumericTypeSpinnerStyle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:341:2: ( ( ( rule__NumericTypeSpinnerStyle__Group__0 ) ) )
            // InternalQLS.g:342:2: ( ( rule__NumericTypeSpinnerStyle__Group__0 ) )
            {
            // InternalQLS.g:342:2: ( ( rule__NumericTypeSpinnerStyle__Group__0 ) )
            // InternalQLS.g:343:3: ( rule__NumericTypeSpinnerStyle__Group__0 )
            {
             before(grammarAccess.getNumericTypeSpinnerStyleAccess().getGroup()); 
            // InternalQLS.g:344:3: ( rule__NumericTypeSpinnerStyle__Group__0 )
            // InternalQLS.g:344:4: rule__NumericTypeSpinnerStyle__Group__0
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
    // InternalQLS.g:353:1: entryRuleTextTypeStyle : ruleTextTypeStyle EOF ;
    public final void entryRuleTextTypeStyle() throws RecognitionException {
        try {
            // InternalQLS.g:354:1: ( ruleTextTypeStyle EOF )
            // InternalQLS.g:355:1: ruleTextTypeStyle EOF
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
    // InternalQLS.g:362:1: ruleTextTypeStyle : ( ( rule__TextTypeStyle__Group__0 ) ) ;
    public final void ruleTextTypeStyle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:366:2: ( ( ( rule__TextTypeStyle__Group__0 ) ) )
            // InternalQLS.g:367:2: ( ( rule__TextTypeStyle__Group__0 ) )
            {
            // InternalQLS.g:367:2: ( ( rule__TextTypeStyle__Group__0 ) )
            // InternalQLS.g:368:3: ( rule__TextTypeStyle__Group__0 )
            {
             before(grammarAccess.getTextTypeStyleAccess().getGroup()); 
            // InternalQLS.g:369:3: ( rule__TextTypeStyle__Group__0 )
            // InternalQLS.g:369:4: rule__TextTypeStyle__Group__0
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
    // InternalQLS.g:378:1: entryRuleValueType : ruleValueType EOF ;
    public final void entryRuleValueType() throws RecognitionException {
        try {
            // InternalQLS.g:379:1: ( ruleValueType EOF )
            // InternalQLS.g:380:1: ruleValueType EOF
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
    // InternalQLS.g:387:1: ruleValueType : ( ( rule__ValueType__Alternatives ) ) ;
    public final void ruleValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:391:2: ( ( ( rule__ValueType__Alternatives ) ) )
            // InternalQLS.g:392:2: ( ( rule__ValueType__Alternatives ) )
            {
            // InternalQLS.g:392:2: ( ( rule__ValueType__Alternatives ) )
            // InternalQLS.g:393:3: ( rule__ValueType__Alternatives )
            {
             before(grammarAccess.getValueTypeAccess().getAlternatives()); 
            // InternalQLS.g:394:3: ( rule__ValueType__Alternatives )
            // InternalQLS.g:394:4: rule__ValueType__Alternatives
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
    // InternalQLS.g:403:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalQLS.g:404:1: ( ruleExpression EOF )
            // InternalQLS.g:405:1: ruleExpression EOF
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
    // InternalQLS.g:412:1: ruleExpression : ( ruleUnaryOrPrimaryExpression ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:416:2: ( ( ruleUnaryOrPrimaryExpression ) )
            // InternalQLS.g:417:2: ( ruleUnaryOrPrimaryExpression )
            {
            // InternalQLS.g:417:2: ( ruleUnaryOrPrimaryExpression )
            // InternalQLS.g:418:3: ruleUnaryOrPrimaryExpression
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
    // InternalQLS.g:428:1: entryRuleUnaryOrPrimaryExpression : ruleUnaryOrPrimaryExpression EOF ;
    public final void entryRuleUnaryOrPrimaryExpression() throws RecognitionException {
        try {
            // InternalQLS.g:429:1: ( ruleUnaryOrPrimaryExpression EOF )
            // InternalQLS.g:430:1: ruleUnaryOrPrimaryExpression EOF
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
    // InternalQLS.g:437:1: ruleUnaryOrPrimaryExpression : ( ( rule__UnaryOrPrimaryExpression__Alternatives ) ) ;
    public final void ruleUnaryOrPrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:441:2: ( ( ( rule__UnaryOrPrimaryExpression__Alternatives ) ) )
            // InternalQLS.g:442:2: ( ( rule__UnaryOrPrimaryExpression__Alternatives ) )
            {
            // InternalQLS.g:442:2: ( ( rule__UnaryOrPrimaryExpression__Alternatives ) )
            // InternalQLS.g:443:3: ( rule__UnaryOrPrimaryExpression__Alternatives )
            {
             before(grammarAccess.getUnaryOrPrimaryExpressionAccess().getAlternatives()); 
            // InternalQLS.g:444:3: ( rule__UnaryOrPrimaryExpression__Alternatives )
            // InternalQLS.g:444:4: rule__UnaryOrPrimaryExpression__Alternatives
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
    // InternalQLS.g:453:1: entryRuleUnaryExpression : ruleUnaryExpression EOF ;
    public final void entryRuleUnaryExpression() throws RecognitionException {
        try {
            // InternalQLS.g:454:1: ( ruleUnaryExpression EOF )
            // InternalQLS.g:455:1: ruleUnaryExpression EOF
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
    // InternalQLS.g:462:1: ruleUnaryExpression : ( ( rule__UnaryExpression__Group__0 ) ) ;
    public final void ruleUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:466:2: ( ( ( rule__UnaryExpression__Group__0 ) ) )
            // InternalQLS.g:467:2: ( ( rule__UnaryExpression__Group__0 ) )
            {
            // InternalQLS.g:467:2: ( ( rule__UnaryExpression__Group__0 ) )
            // InternalQLS.g:468:3: ( rule__UnaryExpression__Group__0 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getGroup()); 
            // InternalQLS.g:469:3: ( rule__UnaryExpression__Group__0 )
            // InternalQLS.g:469:4: rule__UnaryExpression__Group__0
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
    // InternalQLS.g:478:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalQLS.g:479:1: ( rulePrimaryExpression EOF )
            // InternalQLS.g:480:1: rulePrimaryExpression EOF
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
    // InternalQLS.g:487:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:491:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalQLS.g:492:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalQLS.g:492:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalQLS.g:493:3: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // InternalQLS.g:494:3: ( rule__PrimaryExpression__Alternatives )
            // InternalQLS.g:494:4: rule__PrimaryExpression__Alternatives
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
    // InternalQLS.g:503:1: entryRuleIfExpression : ruleIfExpression EOF ;
    public final void entryRuleIfExpression() throws RecognitionException {
        try {
            // InternalQLS.g:504:1: ( ruleIfExpression EOF )
            // InternalQLS.g:505:1: ruleIfExpression EOF
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
    // InternalQLS.g:512:1: ruleIfExpression : ( ( rule__IfExpression__Group__0 ) ) ;
    public final void ruleIfExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:516:2: ( ( ( rule__IfExpression__Group__0 ) ) )
            // InternalQLS.g:517:2: ( ( rule__IfExpression__Group__0 ) )
            {
            // InternalQLS.g:517:2: ( ( rule__IfExpression__Group__0 ) )
            // InternalQLS.g:518:3: ( rule__IfExpression__Group__0 )
            {
             before(grammarAccess.getIfExpressionAccess().getGroup()); 
            // InternalQLS.g:519:3: ( rule__IfExpression__Group__0 )
            // InternalQLS.g:519:4: rule__IfExpression__Group__0
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
    // InternalQLS.g:528:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // InternalQLS.g:529:1: ( ruleOrExpression EOF )
            // InternalQLS.g:530:1: ruleOrExpression EOF
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
    // InternalQLS.g:537:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:541:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // InternalQLS.g:542:2: ( ( rule__OrExpression__Group__0 ) )
            {
            // InternalQLS.g:542:2: ( ( rule__OrExpression__Group__0 ) )
            // InternalQLS.g:543:3: ( rule__OrExpression__Group__0 )
            {
             before(grammarAccess.getOrExpressionAccess().getGroup()); 
            // InternalQLS.g:544:3: ( rule__OrExpression__Group__0 )
            // InternalQLS.g:544:4: rule__OrExpression__Group__0
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
    // InternalQLS.g:553:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // InternalQLS.g:554:1: ( ruleAndExpression EOF )
            // InternalQLS.g:555:1: ruleAndExpression EOF
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
    // InternalQLS.g:562:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:566:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // InternalQLS.g:567:2: ( ( rule__AndExpression__Group__0 ) )
            {
            // InternalQLS.g:567:2: ( ( rule__AndExpression__Group__0 ) )
            // InternalQLS.g:568:3: ( rule__AndExpression__Group__0 )
            {
             before(grammarAccess.getAndExpressionAccess().getGroup()); 
            // InternalQLS.g:569:3: ( rule__AndExpression__Group__0 )
            // InternalQLS.g:569:4: rule__AndExpression__Group__0
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
    // InternalQLS.g:578:1: entryRuleEqualExpression : ruleEqualExpression EOF ;
    public final void entryRuleEqualExpression() throws RecognitionException {
        try {
            // InternalQLS.g:579:1: ( ruleEqualExpression EOF )
            // InternalQLS.g:580:1: ruleEqualExpression EOF
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
    // InternalQLS.g:587:1: ruleEqualExpression : ( ( rule__EqualExpression__Group__0 ) ) ;
    public final void ruleEqualExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:591:2: ( ( ( rule__EqualExpression__Group__0 ) ) )
            // InternalQLS.g:592:2: ( ( rule__EqualExpression__Group__0 ) )
            {
            // InternalQLS.g:592:2: ( ( rule__EqualExpression__Group__0 ) )
            // InternalQLS.g:593:3: ( rule__EqualExpression__Group__0 )
            {
             before(grammarAccess.getEqualExpressionAccess().getGroup()); 
            // InternalQLS.g:594:3: ( rule__EqualExpression__Group__0 )
            // InternalQLS.g:594:4: rule__EqualExpression__Group__0
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
    // InternalQLS.g:603:1: entryRuleComparisionExpression : ruleComparisionExpression EOF ;
    public final void entryRuleComparisionExpression() throws RecognitionException {
        try {
            // InternalQLS.g:604:1: ( ruleComparisionExpression EOF )
            // InternalQLS.g:605:1: ruleComparisionExpression EOF
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
    // InternalQLS.g:612:1: ruleComparisionExpression : ( ( rule__ComparisionExpression__Group__0 ) ) ;
    public final void ruleComparisionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:616:2: ( ( ( rule__ComparisionExpression__Group__0 ) ) )
            // InternalQLS.g:617:2: ( ( rule__ComparisionExpression__Group__0 ) )
            {
            // InternalQLS.g:617:2: ( ( rule__ComparisionExpression__Group__0 ) )
            // InternalQLS.g:618:3: ( rule__ComparisionExpression__Group__0 )
            {
             before(grammarAccess.getComparisionExpressionAccess().getGroup()); 
            // InternalQLS.g:619:3: ( rule__ComparisionExpression__Group__0 )
            // InternalQLS.g:619:4: rule__ComparisionExpression__Group__0
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
    // InternalQLS.g:628:1: entryRuleAdditionExpression : ruleAdditionExpression EOF ;
    public final void entryRuleAdditionExpression() throws RecognitionException {
        try {
            // InternalQLS.g:629:1: ( ruleAdditionExpression EOF )
            // InternalQLS.g:630:1: ruleAdditionExpression EOF
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
    // InternalQLS.g:637:1: ruleAdditionExpression : ( ( rule__AdditionExpression__Group__0 ) ) ;
    public final void ruleAdditionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:641:2: ( ( ( rule__AdditionExpression__Group__0 ) ) )
            // InternalQLS.g:642:2: ( ( rule__AdditionExpression__Group__0 ) )
            {
            // InternalQLS.g:642:2: ( ( rule__AdditionExpression__Group__0 ) )
            // InternalQLS.g:643:3: ( rule__AdditionExpression__Group__0 )
            {
             before(grammarAccess.getAdditionExpressionAccess().getGroup()); 
            // InternalQLS.g:644:3: ( rule__AdditionExpression__Group__0 )
            // InternalQLS.g:644:4: rule__AdditionExpression__Group__0
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
    // InternalQLS.g:653:1: entryRuleMultiplicationExpression : ruleMultiplicationExpression EOF ;
    public final void entryRuleMultiplicationExpression() throws RecognitionException {
        try {
            // InternalQLS.g:654:1: ( ruleMultiplicationExpression EOF )
            // InternalQLS.g:655:1: ruleMultiplicationExpression EOF
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
    // InternalQLS.g:662:1: ruleMultiplicationExpression : ( ( rule__MultiplicationExpression__Group__0 ) ) ;
    public final void ruleMultiplicationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:666:2: ( ( ( rule__MultiplicationExpression__Group__0 ) ) )
            // InternalQLS.g:667:2: ( ( rule__MultiplicationExpression__Group__0 ) )
            {
            // InternalQLS.g:667:2: ( ( rule__MultiplicationExpression__Group__0 ) )
            // InternalQLS.g:668:3: ( rule__MultiplicationExpression__Group__0 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getGroup()); 
            // InternalQLS.g:669:3: ( rule__MultiplicationExpression__Group__0 )
            // InternalQLS.g:669:4: rule__MultiplicationExpression__Group__0
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
    // InternalQLS.g:678:1: entryRuleCall : ruleCall EOF ;
    public final void entryRuleCall() throws RecognitionException {
        try {
            // InternalQLS.g:679:1: ( ruleCall EOF )
            // InternalQLS.g:680:1: ruleCall EOF
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
    // InternalQLS.g:687:1: ruleCall : ( ( rule__Call__Alternatives ) ) ;
    public final void ruleCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:691:2: ( ( ( rule__Call__Alternatives ) ) )
            // InternalQLS.g:692:2: ( ( rule__Call__Alternatives ) )
            {
            // InternalQLS.g:692:2: ( ( rule__Call__Alternatives ) )
            // InternalQLS.g:693:3: ( rule__Call__Alternatives )
            {
             before(grammarAccess.getCallAccess().getAlternatives()); 
            // InternalQLS.g:694:3: ( rule__Call__Alternatives )
            // InternalQLS.g:694:4: rule__Call__Alternatives
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
    // InternalQLS.g:703:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalQLS.g:704:1: ( ruleValue EOF )
            // InternalQLS.g:705:1: ruleValue EOF
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
    // InternalQLS.g:712:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:716:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalQLS.g:717:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalQLS.g:717:2: ( ( rule__Value__Alternatives ) )
            // InternalQLS.g:718:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalQLS.g:719:3: ( rule__Value__Alternatives )
            // InternalQLS.g:719:4: rule__Value__Alternatives
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
    // InternalQLS.g:728:1: entryRuleDefinitionGroup : ruleDefinitionGroup EOF ;
    public final void entryRuleDefinitionGroup() throws RecognitionException {
        try {
            // InternalQLS.g:729:1: ( ruleDefinitionGroup EOF )
            // InternalQLS.g:730:1: ruleDefinitionGroup EOF
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
    // InternalQLS.g:737:1: ruleDefinitionGroup : ( ( rule__DefinitionGroup__Group__0 ) ) ;
    public final void ruleDefinitionGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:741:2: ( ( ( rule__DefinitionGroup__Group__0 ) ) )
            // InternalQLS.g:742:2: ( ( rule__DefinitionGroup__Group__0 ) )
            {
            // InternalQLS.g:742:2: ( ( rule__DefinitionGroup__Group__0 ) )
            // InternalQLS.g:743:3: ( rule__DefinitionGroup__Group__0 )
            {
             before(grammarAccess.getDefinitionGroupAccess().getGroup()); 
            // InternalQLS.g:744:3: ( rule__DefinitionGroup__Group__0 )
            // InternalQLS.g:744:4: rule__DefinitionGroup__Group__0
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
    // InternalQLS.g:753:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalQLS.g:754:1: ( ruleEBoolean EOF )
            // InternalQLS.g:755:1: ruleEBoolean EOF
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
    // InternalQLS.g:762:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:766:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalQLS.g:767:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalQLS.g:767:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalQLS.g:768:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalQLS.g:769:3: ( rule__EBoolean__Alternatives )
            // InternalQLS.g:769:4: rule__EBoolean__Alternatives
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
    // InternalQLS.g:778:1: entryRuleEDate : ruleEDate EOF ;
    public final void entryRuleEDate() throws RecognitionException {
        try {
            // InternalQLS.g:779:1: ( ruleEDate EOF )
            // InternalQLS.g:780:1: ruleEDate EOF
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
    // InternalQLS.g:787:1: ruleEDate : ( 'EDate' ) ;
    public final void ruleEDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:791:2: ( ( 'EDate' ) )
            // InternalQLS.g:792:2: ( 'EDate' )
            {
            // InternalQLS.g:792:2: ( 'EDate' )
            // InternalQLS.g:793:3: 'EDate'
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
    // InternalQLS.g:803:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalQLS.g:804:1: ( ruleEString EOF )
            // InternalQLS.g:805:1: ruleEString EOF
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
    // InternalQLS.g:812:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:816:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalQLS.g:817:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalQLS.g:817:2: ( ( rule__EString__Alternatives ) )
            // InternalQLS.g:818:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalQLS.g:819:3: ( rule__EString__Alternatives )
            // InternalQLS.g:819:4: rule__EString__Alternatives
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
    // InternalQLS.g:828:1: entryRuleQuestionGroup : ruleQuestionGroup EOF ;
    public final void entryRuleQuestionGroup() throws RecognitionException {
        try {
            // InternalQLS.g:829:1: ( ruleQuestionGroup EOF )
            // InternalQLS.g:830:1: ruleQuestionGroup EOF
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
    // InternalQLS.g:837:1: ruleQuestionGroup : ( ( rule__QuestionGroup__Group__0 ) ) ;
    public final void ruleQuestionGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:841:2: ( ( ( rule__QuestionGroup__Group__0 ) ) )
            // InternalQLS.g:842:2: ( ( rule__QuestionGroup__Group__0 ) )
            {
            // InternalQLS.g:842:2: ( ( rule__QuestionGroup__Group__0 ) )
            // InternalQLS.g:843:3: ( rule__QuestionGroup__Group__0 )
            {
             before(grammarAccess.getQuestionGroupAccess().getGroup()); 
            // InternalQLS.g:844:3: ( rule__QuestionGroup__Group__0 )
            // InternalQLS.g:844:4: rule__QuestionGroup__Group__0
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
    // InternalQLS.g:853:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // InternalQLS.g:854:1: ( ruleQuestion EOF )
            // InternalQLS.g:855:1: ruleQuestion EOF
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
    // InternalQLS.g:862:1: ruleQuestion : ( ( rule__Question__QuestionDefinitionAssignment ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:866:2: ( ( ( rule__Question__QuestionDefinitionAssignment ) ) )
            // InternalQLS.g:867:2: ( ( rule__Question__QuestionDefinitionAssignment ) )
            {
            // InternalQLS.g:867:2: ( ( rule__Question__QuestionDefinitionAssignment ) )
            // InternalQLS.g:868:3: ( rule__Question__QuestionDefinitionAssignment )
            {
             before(grammarAccess.getQuestionAccess().getQuestionDefinitionAssignment()); 
            // InternalQLS.g:869:3: ( rule__Question__QuestionDefinitionAssignment )
            // InternalQLS.g:869:4: rule__Question__QuestionDefinitionAssignment
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
    // InternalQLS.g:878:1: entryRuleValueType_Impl : ruleValueType_Impl EOF ;
    public final void entryRuleValueType_Impl() throws RecognitionException {
        try {
            // InternalQLS.g:879:1: ( ruleValueType_Impl EOF )
            // InternalQLS.g:880:1: ruleValueType_Impl EOF
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
    // InternalQLS.g:887:1: ruleValueType_Impl : ( ( rule__ValueType_Impl__Group__0 ) ) ;
    public final void ruleValueType_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:891:2: ( ( ( rule__ValueType_Impl__Group__0 ) ) )
            // InternalQLS.g:892:2: ( ( rule__ValueType_Impl__Group__0 ) )
            {
            // InternalQLS.g:892:2: ( ( rule__ValueType_Impl__Group__0 ) )
            // InternalQLS.g:893:3: ( rule__ValueType_Impl__Group__0 )
            {
             before(grammarAccess.getValueType_ImplAccess().getGroup()); 
            // InternalQLS.g:894:3: ( rule__ValueType_Impl__Group__0 )
            // InternalQLS.g:894:4: rule__ValueType_Impl__Group__0
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
    // InternalQLS.g:903:1: entryRuleConstantCall : ruleConstantCall EOF ;
    public final void entryRuleConstantCall() throws RecognitionException {
        try {
            // InternalQLS.g:904:1: ( ruleConstantCall EOF )
            // InternalQLS.g:905:1: ruleConstantCall EOF
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
    // InternalQLS.g:912:1: ruleConstantCall : ( ( rule__ConstantCall__Group__0 ) ) ;
    public final void ruleConstantCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:916:2: ( ( ( rule__ConstantCall__Group__0 ) ) )
            // InternalQLS.g:917:2: ( ( rule__ConstantCall__Group__0 ) )
            {
            // InternalQLS.g:917:2: ( ( rule__ConstantCall__Group__0 ) )
            // InternalQLS.g:918:3: ( rule__ConstantCall__Group__0 )
            {
             before(grammarAccess.getConstantCallAccess().getGroup()); 
            // InternalQLS.g:919:3: ( rule__ConstantCall__Group__0 )
            // InternalQLS.g:919:4: rule__ConstantCall__Group__0
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
    // InternalQLS.g:928:1: entryRuleQuestionCall : ruleQuestionCall EOF ;
    public final void entryRuleQuestionCall() throws RecognitionException {
        try {
            // InternalQLS.g:929:1: ( ruleQuestionCall EOF )
            // InternalQLS.g:930:1: ruleQuestionCall EOF
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
    // InternalQLS.g:937:1: ruleQuestionCall : ( ( rule__QuestionCall__Group__0 ) ) ;
    public final void ruleQuestionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:941:2: ( ( ( rule__QuestionCall__Group__0 ) ) )
            // InternalQLS.g:942:2: ( ( rule__QuestionCall__Group__0 ) )
            {
            // InternalQLS.g:942:2: ( ( rule__QuestionCall__Group__0 ) )
            // InternalQLS.g:943:3: ( rule__QuestionCall__Group__0 )
            {
             before(grammarAccess.getQuestionCallAccess().getGroup()); 
            // InternalQLS.g:944:3: ( rule__QuestionCall__Group__0 )
            // InternalQLS.g:944:4: rule__QuestionCall__Group__0
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
    // InternalQLS.g:953:1: entryRuleBooleanValueType : ruleBooleanValueType EOF ;
    public final void entryRuleBooleanValueType() throws RecognitionException {
        try {
            // InternalQLS.g:954:1: ( ruleBooleanValueType EOF )
            // InternalQLS.g:955:1: ruleBooleanValueType EOF
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
    // InternalQLS.g:962:1: ruleBooleanValueType : ( ( rule__BooleanValueType__Group__0 ) ) ;
    public final void ruleBooleanValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:966:2: ( ( ( rule__BooleanValueType__Group__0 ) ) )
            // InternalQLS.g:967:2: ( ( rule__BooleanValueType__Group__0 ) )
            {
            // InternalQLS.g:967:2: ( ( rule__BooleanValueType__Group__0 ) )
            // InternalQLS.g:968:3: ( rule__BooleanValueType__Group__0 )
            {
             before(grammarAccess.getBooleanValueTypeAccess().getGroup()); 
            // InternalQLS.g:969:3: ( rule__BooleanValueType__Group__0 )
            // InternalQLS.g:969:4: rule__BooleanValueType__Group__0
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
    // InternalQLS.g:978:1: entryRuleIntegerValueType : ruleIntegerValueType EOF ;
    public final void entryRuleIntegerValueType() throws RecognitionException {
        try {
            // InternalQLS.g:979:1: ( ruleIntegerValueType EOF )
            // InternalQLS.g:980:1: ruleIntegerValueType EOF
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
    // InternalQLS.g:987:1: ruleIntegerValueType : ( ( rule__IntegerValueType__Group__0 ) ) ;
    public final void ruleIntegerValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:991:2: ( ( ( rule__IntegerValueType__Group__0 ) ) )
            // InternalQLS.g:992:2: ( ( rule__IntegerValueType__Group__0 ) )
            {
            // InternalQLS.g:992:2: ( ( rule__IntegerValueType__Group__0 ) )
            // InternalQLS.g:993:3: ( rule__IntegerValueType__Group__0 )
            {
             before(grammarAccess.getIntegerValueTypeAccess().getGroup()); 
            // InternalQLS.g:994:3: ( rule__IntegerValueType__Group__0 )
            // InternalQLS.g:994:4: rule__IntegerValueType__Group__0
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
    // InternalQLS.g:1003:1: entryRuleDecimalValueType : ruleDecimalValueType EOF ;
    public final void entryRuleDecimalValueType() throws RecognitionException {
        try {
            // InternalQLS.g:1004:1: ( ruleDecimalValueType EOF )
            // InternalQLS.g:1005:1: ruleDecimalValueType EOF
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
    // InternalQLS.g:1012:1: ruleDecimalValueType : ( ( rule__DecimalValueType__Group__0 ) ) ;
    public final void ruleDecimalValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1016:2: ( ( ( rule__DecimalValueType__Group__0 ) ) )
            // InternalQLS.g:1017:2: ( ( rule__DecimalValueType__Group__0 ) )
            {
            // InternalQLS.g:1017:2: ( ( rule__DecimalValueType__Group__0 ) )
            // InternalQLS.g:1018:3: ( rule__DecimalValueType__Group__0 )
            {
             before(grammarAccess.getDecimalValueTypeAccess().getGroup()); 
            // InternalQLS.g:1019:3: ( rule__DecimalValueType__Group__0 )
            // InternalQLS.g:1019:4: rule__DecimalValueType__Group__0
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
    // InternalQLS.g:1028:1: entryRuleDateValueType : ruleDateValueType EOF ;
    public final void entryRuleDateValueType() throws RecognitionException {
        try {
            // InternalQLS.g:1029:1: ( ruleDateValueType EOF )
            // InternalQLS.g:1030:1: ruleDateValueType EOF
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
    // InternalQLS.g:1037:1: ruleDateValueType : ( ( rule__DateValueType__Group__0 ) ) ;
    public final void ruleDateValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1041:2: ( ( ( rule__DateValueType__Group__0 ) ) )
            // InternalQLS.g:1042:2: ( ( rule__DateValueType__Group__0 ) )
            {
            // InternalQLS.g:1042:2: ( ( rule__DateValueType__Group__0 ) )
            // InternalQLS.g:1043:3: ( rule__DateValueType__Group__0 )
            {
             before(grammarAccess.getDateValueTypeAccess().getGroup()); 
            // InternalQLS.g:1044:3: ( rule__DateValueType__Group__0 )
            // InternalQLS.g:1044:4: rule__DateValueType__Group__0
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
    // InternalQLS.g:1053:1: entryRuleEnumerationValueType : ruleEnumerationValueType EOF ;
    public final void entryRuleEnumerationValueType() throws RecognitionException {
        try {
            // InternalQLS.g:1054:1: ( ruleEnumerationValueType EOF )
            // InternalQLS.g:1055:1: ruleEnumerationValueType EOF
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
    // InternalQLS.g:1062:1: ruleEnumerationValueType : ( ( rule__EnumerationValueType__Group__0 ) ) ;
    public final void ruleEnumerationValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1066:2: ( ( ( rule__EnumerationValueType__Group__0 ) ) )
            // InternalQLS.g:1067:2: ( ( rule__EnumerationValueType__Group__0 ) )
            {
            // InternalQLS.g:1067:2: ( ( rule__EnumerationValueType__Group__0 ) )
            // InternalQLS.g:1068:3: ( rule__EnumerationValueType__Group__0 )
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getGroup()); 
            // InternalQLS.g:1069:3: ( rule__EnumerationValueType__Group__0 )
            // InternalQLS.g:1069:4: rule__EnumerationValueType__Group__0
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
    // InternalQLS.g:1078:1: entryRuleStringValueType : ruleStringValueType EOF ;
    public final void entryRuleStringValueType() throws RecognitionException {
        try {
            // InternalQLS.g:1079:1: ( ruleStringValueType EOF )
            // InternalQLS.g:1080:1: ruleStringValueType EOF
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
    // InternalQLS.g:1087:1: ruleStringValueType : ( ( rule__StringValueType__Group__0 ) ) ;
    public final void ruleStringValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1091:2: ( ( ( rule__StringValueType__Group__0 ) ) )
            // InternalQLS.g:1092:2: ( ( rule__StringValueType__Group__0 ) )
            {
            // InternalQLS.g:1092:2: ( ( rule__StringValueType__Group__0 ) )
            // InternalQLS.g:1093:3: ( rule__StringValueType__Group__0 )
            {
             before(grammarAccess.getStringValueTypeAccess().getGroup()); 
            // InternalQLS.g:1094:3: ( rule__StringValueType__Group__0 )
            // InternalQLS.g:1094:4: rule__StringValueType__Group__0
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
    // InternalQLS.g:1103:1: entryRuleEnumerationLiteral : ruleEnumerationLiteral EOF ;
    public final void entryRuleEnumerationLiteral() throws RecognitionException {
        try {
            // InternalQLS.g:1104:1: ( ruleEnumerationLiteral EOF )
            // InternalQLS.g:1105:1: ruleEnumerationLiteral EOF
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
    // InternalQLS.g:1112:1: ruleEnumerationLiteral : ( ( rule__EnumerationLiteral__Group__0 ) ) ;
    public final void ruleEnumerationLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1116:2: ( ( ( rule__EnumerationLiteral__Group__0 ) ) )
            // InternalQLS.g:1117:2: ( ( rule__EnumerationLiteral__Group__0 ) )
            {
            // InternalQLS.g:1117:2: ( ( rule__EnumerationLiteral__Group__0 ) )
            // InternalQLS.g:1118:3: ( rule__EnumerationLiteral__Group__0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getGroup()); 
            // InternalQLS.g:1119:3: ( rule__EnumerationLiteral__Group__0 )
            // InternalQLS.g:1119:4: rule__EnumerationLiteral__Group__0
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
    // InternalQLS.g:1128:1: entryRuleIntegerValue : ruleIntegerValue EOF ;
    public final void entryRuleIntegerValue() throws RecognitionException {
        try {
            // InternalQLS.g:1129:1: ( ruleIntegerValue EOF )
            // InternalQLS.g:1130:1: ruleIntegerValue EOF
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
    // InternalQLS.g:1137:1: ruleIntegerValue : ( ( rule__IntegerValue__Group__0 ) ) ;
    public final void ruleIntegerValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1141:2: ( ( ( rule__IntegerValue__Group__0 ) ) )
            // InternalQLS.g:1142:2: ( ( rule__IntegerValue__Group__0 ) )
            {
            // InternalQLS.g:1142:2: ( ( rule__IntegerValue__Group__0 ) )
            // InternalQLS.g:1143:3: ( rule__IntegerValue__Group__0 )
            {
             before(grammarAccess.getIntegerValueAccess().getGroup()); 
            // InternalQLS.g:1144:3: ( rule__IntegerValue__Group__0 )
            // InternalQLS.g:1144:4: rule__IntegerValue__Group__0
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
    // InternalQLS.g:1153:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalQLS.g:1154:1: ( ruleStringValue EOF )
            // InternalQLS.g:1155:1: ruleStringValue EOF
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
    // InternalQLS.g:1162:1: ruleStringValue : ( ( rule__StringValue__Group__0 ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1166:2: ( ( ( rule__StringValue__Group__0 ) ) )
            // InternalQLS.g:1167:2: ( ( rule__StringValue__Group__0 ) )
            {
            // InternalQLS.g:1167:2: ( ( rule__StringValue__Group__0 ) )
            // InternalQLS.g:1168:3: ( rule__StringValue__Group__0 )
            {
             before(grammarAccess.getStringValueAccess().getGroup()); 
            // InternalQLS.g:1169:3: ( rule__StringValue__Group__0 )
            // InternalQLS.g:1169:4: rule__StringValue__Group__0
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
    // InternalQLS.g:1178:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalQLS.g:1179:1: ( ruleBooleanValue EOF )
            // InternalQLS.g:1180:1: ruleBooleanValue EOF
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
    // InternalQLS.g:1187:1: ruleBooleanValue : ( ( rule__BooleanValue__Group__0 ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1191:2: ( ( ( rule__BooleanValue__Group__0 ) ) )
            // InternalQLS.g:1192:2: ( ( rule__BooleanValue__Group__0 ) )
            {
            // InternalQLS.g:1192:2: ( ( rule__BooleanValue__Group__0 ) )
            // InternalQLS.g:1193:3: ( rule__BooleanValue__Group__0 )
            {
             before(grammarAccess.getBooleanValueAccess().getGroup()); 
            // InternalQLS.g:1194:3: ( rule__BooleanValue__Group__0 )
            // InternalQLS.g:1194:4: rule__BooleanValue__Group__0
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
    // InternalQLS.g:1203:1: entryRuleEnumerationCall : ruleEnumerationCall EOF ;
    public final void entryRuleEnumerationCall() throws RecognitionException {
        try {
            // InternalQLS.g:1204:1: ( ruleEnumerationCall EOF )
            // InternalQLS.g:1205:1: ruleEnumerationCall EOF
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
    // InternalQLS.g:1212:1: ruleEnumerationCall : ( ( rule__EnumerationCall__Group__0 ) ) ;
    public final void ruleEnumerationCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1216:2: ( ( ( rule__EnumerationCall__Group__0 ) ) )
            // InternalQLS.g:1217:2: ( ( rule__EnumerationCall__Group__0 ) )
            {
            // InternalQLS.g:1217:2: ( ( rule__EnumerationCall__Group__0 ) )
            // InternalQLS.g:1218:3: ( rule__EnumerationCall__Group__0 )
            {
             before(grammarAccess.getEnumerationCallAccess().getGroup()); 
            // InternalQLS.g:1219:3: ( rule__EnumerationCall__Group__0 )
            // InternalQLS.g:1219:4: rule__EnumerationCall__Group__0
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
    // InternalQLS.g:1228:1: entryRuleDateValue : ruleDateValue EOF ;
    public final void entryRuleDateValue() throws RecognitionException {
        try {
            // InternalQLS.g:1229:1: ( ruleDateValue EOF )
            // InternalQLS.g:1230:1: ruleDateValue EOF
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
    // InternalQLS.g:1237:1: ruleDateValue : ( ( rule__DateValue__Group__0 ) ) ;
    public final void ruleDateValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1241:2: ( ( ( rule__DateValue__Group__0 ) ) )
            // InternalQLS.g:1242:2: ( ( rule__DateValue__Group__0 ) )
            {
            // InternalQLS.g:1242:2: ( ( rule__DateValue__Group__0 ) )
            // InternalQLS.g:1243:3: ( rule__DateValue__Group__0 )
            {
             before(grammarAccess.getDateValueAccess().getGroup()); 
            // InternalQLS.g:1244:3: ( rule__DateValue__Group__0 )
            // InternalQLS.g:1244:4: rule__DateValue__Group__0
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
    // InternalQLS.g:1253:1: entryRuleDecimalValue : ruleDecimalValue EOF ;
    public final void entryRuleDecimalValue() throws RecognitionException {
        try {
            // InternalQLS.g:1254:1: ( ruleDecimalValue EOF )
            // InternalQLS.g:1255:1: ruleDecimalValue EOF
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
    // InternalQLS.g:1262:1: ruleDecimalValue : ( ( rule__DecimalValue__Group__0 ) ) ;
    public final void ruleDecimalValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1266:2: ( ( ( rule__DecimalValue__Group__0 ) ) )
            // InternalQLS.g:1267:2: ( ( rule__DecimalValue__Group__0 ) )
            {
            // InternalQLS.g:1267:2: ( ( rule__DecimalValue__Group__0 ) )
            // InternalQLS.g:1268:3: ( rule__DecimalValue__Group__0 )
            {
             before(grammarAccess.getDecimalValueAccess().getGroup()); 
            // InternalQLS.g:1269:3: ( rule__DecimalValue__Group__0 )
            // InternalQLS.g:1269:4: rule__DecimalValue__Group__0
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
    // InternalQLS.g:1278:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalQLS.g:1279:1: ( ruleEInt EOF )
            // InternalQLS.g:1280:1: ruleEInt EOF
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
    // InternalQLS.g:1287:1: ruleEInt : ( RULE_INT ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1291:2: ( ( RULE_INT ) )
            // InternalQLS.g:1292:2: ( RULE_INT )
            {
            // InternalQLS.g:1292:2: ( RULE_INT )
            // InternalQLS.g:1293:3: RULE_INT
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
    // InternalQLS.g:1303:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalQLS.g:1304:1: ( ruleEDouble EOF )
            // InternalQLS.g:1305:1: ruleEDouble EOF
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
    // InternalQLS.g:1312:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1316:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalQLS.g:1317:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalQLS.g:1317:2: ( ( rule__EDouble__Group__0 ) )
            // InternalQLS.g:1318:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalQLS.g:1319:3: ( rule__EDouble__Group__0 )
            // InternalQLS.g:1319:4: rule__EDouble__Group__0
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
    // InternalQLS.g:1328:1: entryRuleQuestionDefinition : ruleQuestionDefinition EOF ;
    public final void entryRuleQuestionDefinition() throws RecognitionException {
        try {
            // InternalQLS.g:1329:1: ( ruleQuestionDefinition EOF )
            // InternalQLS.g:1330:1: ruleQuestionDefinition EOF
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
    // InternalQLS.g:1337:1: ruleQuestionDefinition : ( ( rule__QuestionDefinition__Group__0 ) ) ;
    public final void ruleQuestionDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1341:2: ( ( ( rule__QuestionDefinition__Group__0 ) ) )
            // InternalQLS.g:1342:2: ( ( rule__QuestionDefinition__Group__0 ) )
            {
            // InternalQLS.g:1342:2: ( ( rule__QuestionDefinition__Group__0 ) )
            // InternalQLS.g:1343:3: ( rule__QuestionDefinition__Group__0 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getGroup()); 
            // InternalQLS.g:1344:3: ( rule__QuestionDefinition__Group__0 )
            // InternalQLS.g:1344:4: rule__QuestionDefinition__Group__0
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
    // InternalQLS.g:1353:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalQLS.g:1354:1: ( ruleQualifiedName EOF )
            // InternalQLS.g:1355:1: ruleQualifiedName EOF
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
    // InternalQLS.g:1362:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1366:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalQLS.g:1367:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalQLS.g:1367:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalQLS.g:1368:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalQLS.g:1369:3: ( rule__QualifiedName__Group__0 )
            // InternalQLS.g:1369:4: rule__QualifiedName__Group__0
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
    // InternalQLS.g:1378:1: ruleBooleanStyleKind : ( ( rule__BooleanStyleKind__Alternatives ) ) ;
    public final void ruleBooleanStyleKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1382:1: ( ( ( rule__BooleanStyleKind__Alternatives ) ) )
            // InternalQLS.g:1383:2: ( ( rule__BooleanStyleKind__Alternatives ) )
            {
            // InternalQLS.g:1383:2: ( ( rule__BooleanStyleKind__Alternatives ) )
            // InternalQLS.g:1384:3: ( rule__BooleanStyleKind__Alternatives )
            {
             before(grammarAccess.getBooleanStyleKindAccess().getAlternatives()); 
            // InternalQLS.g:1385:3: ( rule__BooleanStyleKind__Alternatives )
            // InternalQLS.g:1385:4: rule__BooleanStyleKind__Alternatives
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
    // InternalQLS.g:1394:1: ruleBinaryOperatorKind : ( ( rule__BinaryOperatorKind__Alternatives ) ) ;
    public final void ruleBinaryOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1398:1: ( ( ( rule__BinaryOperatorKind__Alternatives ) ) )
            // InternalQLS.g:1399:2: ( ( rule__BinaryOperatorKind__Alternatives ) )
            {
            // InternalQLS.g:1399:2: ( ( rule__BinaryOperatorKind__Alternatives ) )
            // InternalQLS.g:1400:3: ( rule__BinaryOperatorKind__Alternatives )
            {
             before(grammarAccess.getBinaryOperatorKindAccess().getAlternatives()); 
            // InternalQLS.g:1401:3: ( rule__BinaryOperatorKind__Alternatives )
            // InternalQLS.g:1401:4: rule__BinaryOperatorKind__Alternatives
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
    // InternalQLS.g:1410:1: ruleUnaryOperatorKind : ( ( rule__UnaryOperatorKind__Alternatives ) ) ;
    public final void ruleUnaryOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1414:1: ( ( ( rule__UnaryOperatorKind__Alternatives ) ) )
            // InternalQLS.g:1415:2: ( ( rule__UnaryOperatorKind__Alternatives ) )
            {
            // InternalQLS.g:1415:2: ( ( rule__UnaryOperatorKind__Alternatives ) )
            // InternalQLS.g:1416:3: ( rule__UnaryOperatorKind__Alternatives )
            {
             before(grammarAccess.getUnaryOperatorKindAccess().getAlternatives()); 
            // InternalQLS.g:1417:3: ( rule__UnaryOperatorKind__Alternatives )
            // InternalQLS.g:1417:4: rule__UnaryOperatorKind__Alternatives
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
    // InternalQLS.g:1426:1: ruleAdditionOperatorKind : ( ( rule__AdditionOperatorKind__Alternatives ) ) ;
    public final void ruleAdditionOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1430:1: ( ( ( rule__AdditionOperatorKind__Alternatives ) ) )
            // InternalQLS.g:1431:2: ( ( rule__AdditionOperatorKind__Alternatives ) )
            {
            // InternalQLS.g:1431:2: ( ( rule__AdditionOperatorKind__Alternatives ) )
            // InternalQLS.g:1432:3: ( rule__AdditionOperatorKind__Alternatives )
            {
             before(grammarAccess.getAdditionOperatorKindAccess().getAlternatives()); 
            // InternalQLS.g:1433:3: ( rule__AdditionOperatorKind__Alternatives )
            // InternalQLS.g:1433:4: rule__AdditionOperatorKind__Alternatives
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
    // InternalQLS.g:1442:1: ruleMultiplicationOperatorKind : ( ( rule__MultiplicationOperatorKind__Alternatives ) ) ;
    public final void ruleMultiplicationOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1446:1: ( ( ( rule__MultiplicationOperatorKind__Alternatives ) ) )
            // InternalQLS.g:1447:2: ( ( rule__MultiplicationOperatorKind__Alternatives ) )
            {
            // InternalQLS.g:1447:2: ( ( rule__MultiplicationOperatorKind__Alternatives ) )
            // InternalQLS.g:1448:3: ( rule__MultiplicationOperatorKind__Alternatives )
            {
             before(grammarAccess.getMultiplicationOperatorKindAccess().getAlternatives()); 
            // InternalQLS.g:1449:3: ( rule__MultiplicationOperatorKind__Alternatives )
            // InternalQLS.g:1449:4: rule__MultiplicationOperatorKind__Alternatives
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
    // InternalQLS.g:1458:1: ruleEqualOperatorKind : ( ( '=' ) ) ;
    public final void ruleEqualOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1462:1: ( ( ( '=' ) ) )
            // InternalQLS.g:1463:2: ( ( '=' ) )
            {
            // InternalQLS.g:1463:2: ( ( '=' ) )
            // InternalQLS.g:1464:3: ( '=' )
            {
             before(grammarAccess.getEqualOperatorKindAccess().getEQUALEnumLiteralDeclaration()); 
            // InternalQLS.g:1465:3: ( '=' )
            // InternalQLS.g:1465:4: '='
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
    // InternalQLS.g:1474:1: ruleComparisionOperatorKind : ( ( rule__ComparisionOperatorKind__Alternatives ) ) ;
    public final void ruleComparisionOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1478:1: ( ( ( rule__ComparisionOperatorKind__Alternatives ) ) )
            // InternalQLS.g:1479:2: ( ( rule__ComparisionOperatorKind__Alternatives ) )
            {
            // InternalQLS.g:1479:2: ( ( rule__ComparisionOperatorKind__Alternatives ) )
            // InternalQLS.g:1480:3: ( rule__ComparisionOperatorKind__Alternatives )
            {
             before(grammarAccess.getComparisionOperatorKindAccess().getAlternatives()); 
            // InternalQLS.g:1481:3: ( rule__ComparisionOperatorKind__Alternatives )
            // InternalQLS.g:1481:4: rule__ComparisionOperatorKind__Alternatives
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
    // InternalQLS.g:1490:1: ruleAndOperatorKind : ( ( 'and' ) ) ;
    public final void ruleAndOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1494:1: ( ( ( 'and' ) ) )
            // InternalQLS.g:1495:2: ( ( 'and' ) )
            {
            // InternalQLS.g:1495:2: ( ( 'and' ) )
            // InternalQLS.g:1496:3: ( 'and' )
            {
             before(grammarAccess.getAndOperatorKindAccess().getANDEnumLiteralDeclaration()); 
            // InternalQLS.g:1497:3: ( 'and' )
            // InternalQLS.g:1497:4: 'and'
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
    // InternalQLS.g:1506:1: ruleOrOperatorKind : ( ( 'or' ) ) ;
    public final void ruleOrOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1510:1: ( ( ( 'or' ) ) )
            // InternalQLS.g:1511:2: ( ( 'or' ) )
            {
            // InternalQLS.g:1511:2: ( ( 'or' ) )
            // InternalQLS.g:1512:3: ( 'or' )
            {
             before(grammarAccess.getOrOperatorKindAccess().getOREnumLiteralDeclaration()); 
            // InternalQLS.g:1513:3: ( 'or' )
            // InternalQLS.g:1513:4: 'or'
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


    // $ANTLR start "rule__SectionContent__Alternatives"
    // InternalQLS.g:1521:1: rule__SectionContent__Alternatives : ( ( ruleSection ) | ( ruleQuestionReference ) );
    public final void rule__SectionContent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1525:1: ( ( ruleSection ) | ( ruleQuestionReference ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==48) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalQLS.g:1526:2: ( ruleSection )
                    {
                    // InternalQLS.g:1526:2: ( ruleSection )
                    // InternalQLS.g:1527:3: ruleSection
                    {
                     before(grammarAccess.getSectionContentAccess().getSectionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSection();

                    state._fsp--;

                     after(grammarAccess.getSectionContentAccess().getSectionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:1532:2: ( ruleQuestionReference )
                    {
                    // InternalQLS.g:1532:2: ( ruleQuestionReference )
                    // InternalQLS.g:1533:3: ruleQuestionReference
                    {
                     before(grammarAccess.getSectionContentAccess().getQuestionReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleQuestionReference();

                    state._fsp--;

                     after(grammarAccess.getSectionContentAccess().getQuestionReferenceParserRuleCall_1()); 

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
    // $ANTLR end "rule__SectionContent__Alternatives"


    // $ANTLR start "rule__TypeStyle__Alternatives"
    // InternalQLS.g:1542:1: rule__TypeStyle__Alternatives : ( ( ruleBooleanTypeStyle ) | ( ruleNumericTypeStyle ) | ( ruleTextTypeStyle ) );
    public final void rule__TypeStyle__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1546:1: ( ( ruleBooleanTypeStyle ) | ( ruleNumericTypeStyle ) | ( ruleTextTypeStyle ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt2=1;
                }
                break;
            case 53:
                {
                alt2=2;
                }
                break;
            case 57:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalQLS.g:1547:2: ( ruleBooleanTypeStyle )
                    {
                    // InternalQLS.g:1547:2: ( ruleBooleanTypeStyle )
                    // InternalQLS.g:1548:3: ruleBooleanTypeStyle
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
                    // InternalQLS.g:1553:2: ( ruleNumericTypeStyle )
                    {
                    // InternalQLS.g:1553:2: ( ruleNumericTypeStyle )
                    // InternalQLS.g:1554:3: ruleNumericTypeStyle
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
                    // InternalQLS.g:1559:2: ( ruleTextTypeStyle )
                    {
                    // InternalQLS.g:1559:2: ( ruleTextTypeStyle )
                    // InternalQLS.g:1560:3: ruleTextTypeStyle
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
    // InternalQLS.g:1569:1: rule__NumericTypeStyle__Alternatives : ( ( ruleNumericTypeTextFieldStyle ) | ( ruleNumericTypeSpinnerStyle ) );
    public final void rule__NumericTypeStyle__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1573:1: ( ( ruleNumericTypeTextFieldStyle ) | ( ruleNumericTypeSpinnerStyle ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==53) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==44) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==54) ) {
                        alt3=1;
                    }
                    else if ( (LA3_2==55) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalQLS.g:1574:2: ( ruleNumericTypeTextFieldStyle )
                    {
                    // InternalQLS.g:1574:2: ( ruleNumericTypeTextFieldStyle )
                    // InternalQLS.g:1575:3: ruleNumericTypeTextFieldStyle
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
                    // InternalQLS.g:1580:2: ( ruleNumericTypeSpinnerStyle )
                    {
                    // InternalQLS.g:1580:2: ( ruleNumericTypeSpinnerStyle )
                    // InternalQLS.g:1581:3: ruleNumericTypeSpinnerStyle
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
    // InternalQLS.g:1590:1: rule__ValueType__Alternatives : ( ( ruleValueType_Impl ) | ( ruleBooleanValueType ) | ( ruleIntegerValueType ) | ( ruleDecimalValueType ) | ( ruleDateValueType ) | ( ruleEnumerationValueType ) | ( ruleStringValueType ) );
    public final void rule__ValueType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1594:1: ( ( ruleValueType_Impl ) | ( ruleBooleanValueType ) | ( ruleIntegerValueType ) | ( ruleDecimalValueType ) | ( ruleDateValueType ) | ( ruleEnumerationValueType ) | ( ruleStringValueType ) )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt4=1;
                }
                break;
            case 66:
                {
                alt4=2;
                }
                break;
            case 67:
                {
                alt4=3;
                }
                break;
            case 70:
                {
                alt4=4;
                }
                break;
            case 71:
                {
                alt4=5;
                }
                break;
            case 72:
                {
                alt4=6;
                }
                break;
            case 75:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalQLS.g:1595:2: ( ruleValueType_Impl )
                    {
                    // InternalQLS.g:1595:2: ( ruleValueType_Impl )
                    // InternalQLS.g:1596:3: ruleValueType_Impl
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
                    // InternalQLS.g:1601:2: ( ruleBooleanValueType )
                    {
                    // InternalQLS.g:1601:2: ( ruleBooleanValueType )
                    // InternalQLS.g:1602:3: ruleBooleanValueType
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
                    // InternalQLS.g:1607:2: ( ruleIntegerValueType )
                    {
                    // InternalQLS.g:1607:2: ( ruleIntegerValueType )
                    // InternalQLS.g:1608:3: ruleIntegerValueType
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
                    // InternalQLS.g:1613:2: ( ruleDecimalValueType )
                    {
                    // InternalQLS.g:1613:2: ( ruleDecimalValueType )
                    // InternalQLS.g:1614:3: ruleDecimalValueType
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
                    // InternalQLS.g:1619:2: ( ruleDateValueType )
                    {
                    // InternalQLS.g:1619:2: ( ruleDateValueType )
                    // InternalQLS.g:1620:3: ruleDateValueType
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
                    // InternalQLS.g:1625:2: ( ruleEnumerationValueType )
                    {
                    // InternalQLS.g:1625:2: ( ruleEnumerationValueType )
                    // InternalQLS.g:1626:3: ruleEnumerationValueType
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
                    // InternalQLS.g:1631:2: ( ruleStringValueType )
                    {
                    // InternalQLS.g:1631:2: ( ruleStringValueType )
                    // InternalQLS.g:1632:3: ruleStringValueType
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
    // InternalQLS.g:1641:1: rule__UnaryOrPrimaryExpression__Alternatives : ( ( rulePrimaryExpression ) | ( ruleUnaryExpression ) );
    public final void rule__UnaryOrPrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1645:1: ( ( rulePrimaryExpression ) | ( ruleUnaryExpression ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_INT && LA5_0<=RULE_ID)||(LA5_0>=15 && LA5_0<=16)||LA5_0==58||LA5_0==60||LA5_0==78) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=34 && LA5_0<=35)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalQLS.g:1646:2: ( rulePrimaryExpression )
                    {
                    // InternalQLS.g:1646:2: ( rulePrimaryExpression )
                    // InternalQLS.g:1647:3: rulePrimaryExpression
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
                    // InternalQLS.g:1652:2: ( ruleUnaryExpression )
                    {
                    // InternalQLS.g:1652:2: ( ruleUnaryExpression )
                    // InternalQLS.g:1653:3: ruleUnaryExpression
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
    // InternalQLS.g:1662:1: rule__PrimaryExpression__Alternatives : ( ( ruleCall ) | ( ruleIfExpression ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1666:1: ( ( ruleCall ) | ( ruleIfExpression ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
            case RULE_ID:
            case 15:
            case 16:
            case 78:
                {
                alt6=1;
                }
                break;
            case 60:
                {
                alt6=2;
                }
                break;
            case 58:
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
                    // InternalQLS.g:1667:2: ( ruleCall )
                    {
                    // InternalQLS.g:1667:2: ( ruleCall )
                    // InternalQLS.g:1668:3: ruleCall
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
                    // InternalQLS.g:1673:2: ( ruleIfExpression )
                    {
                    // InternalQLS.g:1673:2: ( ruleIfExpression )
                    // InternalQLS.g:1674:3: ruleIfExpression
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
                    // InternalQLS.g:1679:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    {
                    // InternalQLS.g:1679:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    // InternalQLS.g:1680:3: ( rule__PrimaryExpression__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 
                    // InternalQLS.g:1681:3: ( rule__PrimaryExpression__Group_2__0 )
                    // InternalQLS.g:1681:4: rule__PrimaryExpression__Group_2__0
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
    // InternalQLS.g:1689:1: rule__PrimaryExpression__Alternatives_2_1 : ( ( ruleOrExpression ) | ( ruleUnaryExpression ) );
    public final void rule__PrimaryExpression__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1693:1: ( ( ruleOrExpression ) | ( ruleUnaryExpression ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_INT && LA7_0<=RULE_ID)||(LA7_0>=15 && LA7_0<=16)||LA7_0==58||LA7_0==60||LA7_0==78) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=34 && LA7_0<=35)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalQLS.g:1694:2: ( ruleOrExpression )
                    {
                    // InternalQLS.g:1694:2: ( ruleOrExpression )
                    // InternalQLS.g:1695:3: ruleOrExpression
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
                    // InternalQLS.g:1700:2: ( ruleUnaryExpression )
                    {
                    // InternalQLS.g:1700:2: ( ruleUnaryExpression )
                    // InternalQLS.g:1701:3: ruleUnaryExpression
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
    // InternalQLS.g:1710:1: rule__Call__Alternatives : ( ( ruleConstantCall ) | ( ruleQuestionCall ) | ( ruleEnumerationCall ) );
    public final void rule__Call__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1714:1: ( ( ruleConstantCall ) | ( ruleQuestionCall ) | ( ruleEnumerationCall ) )
            int alt8=3;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalQLS.g:1715:2: ( ruleConstantCall )
                    {
                    // InternalQLS.g:1715:2: ( ruleConstantCall )
                    // InternalQLS.g:1716:3: ruleConstantCall
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
                    // InternalQLS.g:1721:2: ( ruleQuestionCall )
                    {
                    // InternalQLS.g:1721:2: ( ruleQuestionCall )
                    // InternalQLS.g:1722:3: ruleQuestionCall
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
                    // InternalQLS.g:1727:2: ( ruleEnumerationCall )
                    {
                    // InternalQLS.g:1727:2: ( ruleEnumerationCall )
                    // InternalQLS.g:1728:3: ruleEnumerationCall
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
    // InternalQLS.g:1737:1: rule__Value__Alternatives : ( ( ruleIntegerValue ) | ( ruleStringValue ) | ( ruleBooleanValue ) | ( ruleDateValue ) | ( ruleDecimalValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1741:1: ( ( ruleIntegerValue ) | ( ruleStringValue ) | ( ruleBooleanValue ) | ( ruleDateValue ) | ( ruleDecimalValue ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==EOF||LA9_1==59) ) {
                    alt9=1;
                }
                else if ( (LA9_1==78) ) {
                    alt9=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt9=2;
                }
                break;
            case 15:
            case 16:
                {
                alt9=3;
                }
                break;
            case 76:
                {
                alt9=4;
                }
                break;
            case 78:
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
                    // InternalQLS.g:1742:2: ( ruleIntegerValue )
                    {
                    // InternalQLS.g:1742:2: ( ruleIntegerValue )
                    // InternalQLS.g:1743:3: ruleIntegerValue
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
                    // InternalQLS.g:1748:2: ( ruleStringValue )
                    {
                    // InternalQLS.g:1748:2: ( ruleStringValue )
                    // InternalQLS.g:1749:3: ruleStringValue
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
                    // InternalQLS.g:1754:2: ( ruleBooleanValue )
                    {
                    // InternalQLS.g:1754:2: ( ruleBooleanValue )
                    // InternalQLS.g:1755:3: ruleBooleanValue
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
                    // InternalQLS.g:1760:2: ( ruleDateValue )
                    {
                    // InternalQLS.g:1760:2: ( ruleDateValue )
                    // InternalQLS.g:1761:3: ruleDateValue
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
                    // InternalQLS.g:1766:2: ( ruleDecimalValue )
                    {
                    // InternalQLS.g:1766:2: ( ruleDecimalValue )
                    // InternalQLS.g:1767:3: ruleDecimalValue
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


    // $ANTLR start "rule__DefinitionGroup__Alternatives_2"
    // InternalQLS.g:1776:1: rule__DefinitionGroup__Alternatives_2 : ( ( ( rule__DefinitionGroup__QuestionDefinitionsAssignment_2_0 ) ) | ( ( rule__DefinitionGroup__DataTypesAssignment_2_1 ) ) );
    public final void rule__DefinitionGroup__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1780:1: ( ( ( rule__DefinitionGroup__QuestionDefinitionsAssignment_2_0 ) ) | ( ( rule__DefinitionGroup__DataTypesAssignment_2_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==79||LA10_0==86) ) {
                alt10=1;
            }
            else if ( (LA10_0==64||(LA10_0>=66 && LA10_0<=67)||(LA10_0>=70 && LA10_0<=72)||LA10_0==75) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalQLS.g:1781:2: ( ( rule__DefinitionGroup__QuestionDefinitionsAssignment_2_0 ) )
                    {
                    // InternalQLS.g:1781:2: ( ( rule__DefinitionGroup__QuestionDefinitionsAssignment_2_0 ) )
                    // InternalQLS.g:1782:3: ( rule__DefinitionGroup__QuestionDefinitionsAssignment_2_0 )
                    {
                     before(grammarAccess.getDefinitionGroupAccess().getQuestionDefinitionsAssignment_2_0()); 
                    // InternalQLS.g:1783:3: ( rule__DefinitionGroup__QuestionDefinitionsAssignment_2_0 )
                    // InternalQLS.g:1783:4: rule__DefinitionGroup__QuestionDefinitionsAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DefinitionGroup__QuestionDefinitionsAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefinitionGroupAccess().getQuestionDefinitionsAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:1787:2: ( ( rule__DefinitionGroup__DataTypesAssignment_2_1 ) )
                    {
                    // InternalQLS.g:1787:2: ( ( rule__DefinitionGroup__DataTypesAssignment_2_1 ) )
                    // InternalQLS.g:1788:3: ( rule__DefinitionGroup__DataTypesAssignment_2_1 )
                    {
                     before(grammarAccess.getDefinitionGroupAccess().getDataTypesAssignment_2_1()); 
                    // InternalQLS.g:1789:3: ( rule__DefinitionGroup__DataTypesAssignment_2_1 )
                    // InternalQLS.g:1789:4: rule__DefinitionGroup__DataTypesAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DefinitionGroup__DataTypesAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefinitionGroupAccess().getDataTypesAssignment_2_1()); 

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
    // $ANTLR end "rule__DefinitionGroup__Alternatives_2"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalQLS.g:1797:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1801:1: ( ( 'true' ) | ( 'false' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            else if ( (LA11_0==16) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalQLS.g:1802:2: ( 'true' )
                    {
                    // InternalQLS.g:1802:2: ( 'true' )
                    // InternalQLS.g:1803:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:1808:2: ( 'false' )
                    {
                    // InternalQLS.g:1808:2: ( 'false' )
                    // InternalQLS.g:1809:3: 'false'
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
    // InternalQLS.g:1818:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1822:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
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
                    // InternalQLS.g:1823:2: ( RULE_STRING )
                    {
                    // InternalQLS.g:1823:2: ( RULE_STRING )
                    // InternalQLS.g:1824:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:1829:2: ( RULE_ID )
                    {
                    // InternalQLS.g:1829:2: ( RULE_ID )
                    // InternalQLS.g:1830:3: RULE_ID
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
    // InternalQLS.g:1839:1: rule__QuestionGroup__Alternatives_3 : ( ( ( rule__QuestionGroup__QuestionGroupsAssignment_3_0 ) ) | ( ( rule__QuestionGroup__QuestionsAssignment_3_1 ) ) );
    public final void rule__QuestionGroup__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1843:1: ( ( ( rule__QuestionGroup__QuestionGroupsAssignment_3_0 ) ) | ( ( rule__QuestionGroup__QuestionsAssignment_3_1 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==44||LA13_0==60) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalQLS.g:1844:2: ( ( rule__QuestionGroup__QuestionGroupsAssignment_3_0 ) )
                    {
                    // InternalQLS.g:1844:2: ( ( rule__QuestionGroup__QuestionGroupsAssignment_3_0 ) )
                    // InternalQLS.g:1845:3: ( rule__QuestionGroup__QuestionGroupsAssignment_3_0 )
                    {
                     before(grammarAccess.getQuestionGroupAccess().getQuestionGroupsAssignment_3_0()); 
                    // InternalQLS.g:1846:3: ( rule__QuestionGroup__QuestionGroupsAssignment_3_0 )
                    // InternalQLS.g:1846:4: rule__QuestionGroup__QuestionGroupsAssignment_3_0
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
                    // InternalQLS.g:1850:2: ( ( rule__QuestionGroup__QuestionsAssignment_3_1 ) )
                    {
                    // InternalQLS.g:1850:2: ( ( rule__QuestionGroup__QuestionsAssignment_3_1 ) )
                    // InternalQLS.g:1851:3: ( rule__QuestionGroup__QuestionsAssignment_3_1 )
                    {
                     before(grammarAccess.getQuestionGroupAccess().getQuestionsAssignment_3_1()); 
                    // InternalQLS.g:1852:3: ( rule__QuestionGroup__QuestionsAssignment_3_1 )
                    // InternalQLS.g:1852:4: rule__QuestionGroup__QuestionsAssignment_3_1
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
    // InternalQLS.g:1860:1: rule__ConstantCall__ValueAlternatives_1_0 : ( ( ruleStringValue ) | ( ruleIntegerValue ) | ( ruleBooleanValue ) | ( ruleDecimalValue ) );
    public final void rule__ConstantCall__ValueAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1864:1: ( ( ruleStringValue ) | ( ruleIntegerValue ) | ( ruleBooleanValue ) | ( ruleDecimalValue ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt14=1;
                }
                break;
            case RULE_INT:
                {
                int LA14_2 = input.LA(2);

                if ( (LA14_2==EOF||(LA14_2>=12 && LA14_2<=14)||LA14_2==34||(LA14_2>=36 && LA14_2<=42)||LA14_2==44||LA14_2==59||(LA14_2>=61 && LA14_2<=63)||LA14_2==82) ) {
                    alt14=2;
                }
                else if ( (LA14_2==78) ) {
                    alt14=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 2, input);

                    throw nvae;
                }
                }
                break;
            case 15:
            case 16:
                {
                alt14=3;
                }
                break;
            case 78:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalQLS.g:1865:2: ( ruleStringValue )
                    {
                    // InternalQLS.g:1865:2: ( ruleStringValue )
                    // InternalQLS.g:1866:3: ruleStringValue
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
                    // InternalQLS.g:1871:2: ( ruleIntegerValue )
                    {
                    // InternalQLS.g:1871:2: ( ruleIntegerValue )
                    // InternalQLS.g:1872:3: ruleIntegerValue
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
                    // InternalQLS.g:1877:2: ( ruleBooleanValue )
                    {
                    // InternalQLS.g:1877:2: ( ruleBooleanValue )
                    // InternalQLS.g:1878:3: ruleBooleanValue
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
                    // InternalQLS.g:1883:2: ( ruleDecimalValue )
                    {
                    // InternalQLS.g:1883:2: ( ruleDecimalValue )
                    // InternalQLS.g:1884:3: ruleDecimalValue
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
    // InternalQLS.g:1893:1: rule__EDouble__Alternatives_3_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1897:1: ( ( 'E' ) | ( 'e' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==17) ) {
                alt15=1;
            }
            else if ( (LA15_0==18) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalQLS.g:1898:2: ( 'E' )
                    {
                    // InternalQLS.g:1898:2: ( 'E' )
                    // InternalQLS.g:1899:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_3_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:1904:2: ( 'e' )
                    {
                    // InternalQLS.g:1904:2: ( 'e' )
                    // InternalQLS.g:1905:3: 'e'
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
    // InternalQLS.g:1914:1: rule__BooleanStyleKind__Alternatives : ( ( ( 'CHECKBOX' ) ) | ( ( 'TWO_RADIO' ) ) | ( ( 'DROPDOWN' ) ) );
    public final void rule__BooleanStyleKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1918:1: ( ( ( 'CHECKBOX' ) ) | ( ( 'TWO_RADIO' ) ) | ( ( 'DROPDOWN' ) ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt16=1;
                }
                break;
            case 20:
                {
                alt16=2;
                }
                break;
            case 21:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalQLS.g:1919:2: ( ( 'CHECKBOX' ) )
                    {
                    // InternalQLS.g:1919:2: ( ( 'CHECKBOX' ) )
                    // InternalQLS.g:1920:3: ( 'CHECKBOX' )
                    {
                     before(grammarAccess.getBooleanStyleKindAccess().getCHECKBOXEnumLiteralDeclaration_0()); 
                    // InternalQLS.g:1921:3: ( 'CHECKBOX' )
                    // InternalQLS.g:1921:4: 'CHECKBOX'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getBooleanStyleKindAccess().getCHECKBOXEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:1925:2: ( ( 'TWO_RADIO' ) )
                    {
                    // InternalQLS.g:1925:2: ( ( 'TWO_RADIO' ) )
                    // InternalQLS.g:1926:3: ( 'TWO_RADIO' )
                    {
                     before(grammarAccess.getBooleanStyleKindAccess().getTWO_RADIOEnumLiteralDeclaration_1()); 
                    // InternalQLS.g:1927:3: ( 'TWO_RADIO' )
                    // InternalQLS.g:1927:4: 'TWO_RADIO'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getBooleanStyleKindAccess().getTWO_RADIOEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQLS.g:1931:2: ( ( 'DROPDOWN' ) )
                    {
                    // InternalQLS.g:1931:2: ( ( 'DROPDOWN' ) )
                    // InternalQLS.g:1932:3: ( 'DROPDOWN' )
                    {
                     before(grammarAccess.getBooleanStyleKindAccess().getDROPDOWNEnumLiteralDeclaration_2()); 
                    // InternalQLS.g:1933:3: ( 'DROPDOWN' )
                    // InternalQLS.g:1933:4: 'DROPDOWN'
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
    // InternalQLS.g:1941:1: rule__BinaryOperatorKind__Alternatives : ( ( ( 'PLUS' ) ) | ( ( 'MINUS' ) ) | ( ( 'MULT' ) ) | ( ( 'DIV' ) ) | ( ( 'EQUAL' ) ) | ( ( 'NOTEQUAL' ) ) | ( ( 'GREATER' ) ) | ( ( 'LOWER' ) ) | ( ( 'GREATEROREQUAL' ) ) | ( ( 'LOWEROREQUAL' ) ) | ( ( 'AND' ) ) | ( ( 'OR' ) ) );
    public final void rule__BinaryOperatorKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:1945:1: ( ( ( 'PLUS' ) ) | ( ( 'MINUS' ) ) | ( ( 'MULT' ) ) | ( ( 'DIV' ) ) | ( ( 'EQUAL' ) ) | ( ( 'NOTEQUAL' ) ) | ( ( 'GREATER' ) ) | ( ( 'LOWER' ) ) | ( ( 'GREATEROREQUAL' ) ) | ( ( 'LOWEROREQUAL' ) ) | ( ( 'AND' ) ) | ( ( 'OR' ) ) )
            int alt17=12;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt17=1;
                }
                break;
            case 23:
                {
                alt17=2;
                }
                break;
            case 24:
                {
                alt17=3;
                }
                break;
            case 25:
                {
                alt17=4;
                }
                break;
            case 26:
                {
                alt17=5;
                }
                break;
            case 27:
                {
                alt17=6;
                }
                break;
            case 28:
                {
                alt17=7;
                }
                break;
            case 29:
                {
                alt17=8;
                }
                break;
            case 30:
                {
                alt17=9;
                }
                break;
            case 31:
                {
                alt17=10;
                }
                break;
            case 32:
                {
                alt17=11;
                }
                break;
            case 33:
                {
                alt17=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalQLS.g:1946:2: ( ( 'PLUS' ) )
                    {
                    // InternalQLS.g:1946:2: ( ( 'PLUS' ) )
                    // InternalQLS.g:1947:3: ( 'PLUS' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getPLUSEnumLiteralDeclaration_0()); 
                    // InternalQLS.g:1948:3: ( 'PLUS' )
                    // InternalQLS.g:1948:4: 'PLUS'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getPLUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:1952:2: ( ( 'MINUS' ) )
                    {
                    // InternalQLS.g:1952:2: ( ( 'MINUS' ) )
                    // InternalQLS.g:1953:3: ( 'MINUS' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getMINUSEnumLiteralDeclaration_1()); 
                    // InternalQLS.g:1954:3: ( 'MINUS' )
                    // InternalQLS.g:1954:4: 'MINUS'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getMINUSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQLS.g:1958:2: ( ( 'MULT' ) )
                    {
                    // InternalQLS.g:1958:2: ( ( 'MULT' ) )
                    // InternalQLS.g:1959:3: ( 'MULT' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getMULTEnumLiteralDeclaration_2()); 
                    // InternalQLS.g:1960:3: ( 'MULT' )
                    // InternalQLS.g:1960:4: 'MULT'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getMULTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQLS.g:1964:2: ( ( 'DIV' ) )
                    {
                    // InternalQLS.g:1964:2: ( ( 'DIV' ) )
                    // InternalQLS.g:1965:3: ( 'DIV' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getDIVEnumLiteralDeclaration_3()); 
                    // InternalQLS.g:1966:3: ( 'DIV' )
                    // InternalQLS.g:1966:4: 'DIV'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getDIVEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalQLS.g:1970:2: ( ( 'EQUAL' ) )
                    {
                    // InternalQLS.g:1970:2: ( ( 'EQUAL' ) )
                    // InternalQLS.g:1971:3: ( 'EQUAL' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getEQUALEnumLiteralDeclaration_4()); 
                    // InternalQLS.g:1972:3: ( 'EQUAL' )
                    // InternalQLS.g:1972:4: 'EQUAL'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getEQUALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalQLS.g:1976:2: ( ( 'NOTEQUAL' ) )
                    {
                    // InternalQLS.g:1976:2: ( ( 'NOTEQUAL' ) )
                    // InternalQLS.g:1977:3: ( 'NOTEQUAL' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getNOTEQUALEnumLiteralDeclaration_5()); 
                    // InternalQLS.g:1978:3: ( 'NOTEQUAL' )
                    // InternalQLS.g:1978:4: 'NOTEQUAL'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getNOTEQUALEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalQLS.g:1982:2: ( ( 'GREATER' ) )
                    {
                    // InternalQLS.g:1982:2: ( ( 'GREATER' ) )
                    // InternalQLS.g:1983:3: ( 'GREATER' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getGREATEREnumLiteralDeclaration_6()); 
                    // InternalQLS.g:1984:3: ( 'GREATER' )
                    // InternalQLS.g:1984:4: 'GREATER'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getGREATEREnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalQLS.g:1988:2: ( ( 'LOWER' ) )
                    {
                    // InternalQLS.g:1988:2: ( ( 'LOWER' ) )
                    // InternalQLS.g:1989:3: ( 'LOWER' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getLOWEREnumLiteralDeclaration_7()); 
                    // InternalQLS.g:1990:3: ( 'LOWER' )
                    // InternalQLS.g:1990:4: 'LOWER'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getLOWEREnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalQLS.g:1994:2: ( ( 'GREATEROREQUAL' ) )
                    {
                    // InternalQLS.g:1994:2: ( ( 'GREATEROREQUAL' ) )
                    // InternalQLS.g:1995:3: ( 'GREATEROREQUAL' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_8()); 
                    // InternalQLS.g:1996:3: ( 'GREATEROREQUAL' )
                    // InternalQLS.g:1996:4: 'GREATEROREQUAL'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalQLS.g:2000:2: ( ( 'LOWEROREQUAL' ) )
                    {
                    // InternalQLS.g:2000:2: ( ( 'LOWEROREQUAL' ) )
                    // InternalQLS.g:2001:3: ( 'LOWEROREQUAL' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getLOWEROREQUALEnumLiteralDeclaration_9()); 
                    // InternalQLS.g:2002:3: ( 'LOWEROREQUAL' )
                    // InternalQLS.g:2002:4: 'LOWEROREQUAL'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getLOWEROREQUALEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalQLS.g:2006:2: ( ( 'AND' ) )
                    {
                    // InternalQLS.g:2006:2: ( ( 'AND' ) )
                    // InternalQLS.g:2007:3: ( 'AND' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getANDEnumLiteralDeclaration_10()); 
                    // InternalQLS.g:2008:3: ( 'AND' )
                    // InternalQLS.g:2008:4: 'AND'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getANDEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalQLS.g:2012:2: ( ( 'OR' ) )
                    {
                    // InternalQLS.g:2012:2: ( ( 'OR' ) )
                    // InternalQLS.g:2013:3: ( 'OR' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getOREnumLiteralDeclaration_11()); 
                    // InternalQLS.g:2014:3: ( 'OR' )
                    // InternalQLS.g:2014:4: 'OR'
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
    // InternalQLS.g:2022:1: rule__UnaryOperatorKind__Alternatives : ( ( ( '-' ) ) | ( ( 'not' ) ) );
    public final void rule__UnaryOperatorKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2026:1: ( ( ( '-' ) ) | ( ( 'not' ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            else if ( (LA18_0==35) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalQLS.g:2027:2: ( ( '-' ) )
                    {
                    // InternalQLS.g:2027:2: ( ( '-' ) )
                    // InternalQLS.g:2028:3: ( '-' )
                    {
                     before(grammarAccess.getUnaryOperatorKindAccess().getUNARYMINUSEnumLiteralDeclaration_0()); 
                    // InternalQLS.g:2029:3: ( '-' )
                    // InternalQLS.g:2029:4: '-'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getUnaryOperatorKindAccess().getUNARYMINUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:2033:2: ( ( 'not' ) )
                    {
                    // InternalQLS.g:2033:2: ( ( 'not' ) )
                    // InternalQLS.g:2034:3: ( 'not' )
                    {
                     before(grammarAccess.getUnaryOperatorKindAccess().getNOTEnumLiteralDeclaration_1()); 
                    // InternalQLS.g:2035:3: ( 'not' )
                    // InternalQLS.g:2035:4: 'not'
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
    // InternalQLS.g:2043:1: rule__AdditionOperatorKind__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__AdditionOperatorKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2047:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            else if ( (LA19_0==34) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalQLS.g:2048:2: ( ( '+' ) )
                    {
                    // InternalQLS.g:2048:2: ( ( '+' ) )
                    // InternalQLS.g:2049:3: ( '+' )
                    {
                     before(grammarAccess.getAdditionOperatorKindAccess().getPLUSEnumLiteralDeclaration_0()); 
                    // InternalQLS.g:2050:3: ( '+' )
                    // InternalQLS.g:2050:4: '+'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getAdditionOperatorKindAccess().getPLUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:2054:2: ( ( '-' ) )
                    {
                    // InternalQLS.g:2054:2: ( ( '-' ) )
                    // InternalQLS.g:2055:3: ( '-' )
                    {
                     before(grammarAccess.getAdditionOperatorKindAccess().getMINUSEnumLiteralDeclaration_1()); 
                    // InternalQLS.g:2056:3: ( '-' )
                    // InternalQLS.g:2056:4: '-'
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
    // InternalQLS.g:2064:1: rule__MultiplicationOperatorKind__Alternatives : ( ( ( '*' ) ) | ( ( '/' ) ) );
    public final void rule__MultiplicationOperatorKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2068:1: ( ( ( '*' ) ) | ( ( '/' ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            else if ( (LA20_0==38) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalQLS.g:2069:2: ( ( '*' ) )
                    {
                    // InternalQLS.g:2069:2: ( ( '*' ) )
                    // InternalQLS.g:2070:3: ( '*' )
                    {
                     before(grammarAccess.getMultiplicationOperatorKindAccess().getMULTEnumLiteralDeclaration_0()); 
                    // InternalQLS.g:2071:3: ( '*' )
                    // InternalQLS.g:2071:4: '*'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicationOperatorKindAccess().getMULTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:2075:2: ( ( '/' ) )
                    {
                    // InternalQLS.g:2075:2: ( ( '/' ) )
                    // InternalQLS.g:2076:3: ( '/' )
                    {
                     before(grammarAccess.getMultiplicationOperatorKindAccess().getDIVEnumLiteralDeclaration_1()); 
                    // InternalQLS.g:2077:3: ( '/' )
                    // InternalQLS.g:2077:4: '/'
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
    // InternalQLS.g:2085:1: rule__ComparisionOperatorKind__Alternatives : ( ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) );
    public final void rule__ComparisionOperatorKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2089:1: ( ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt21=1;
                }
                break;
            case 40:
                {
                alt21=2;
                }
                break;
            case 41:
                {
                alt21=3;
                }
                break;
            case 42:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalQLS.g:2090:2: ( ( '>' ) )
                    {
                    // InternalQLS.g:2090:2: ( ( '>' ) )
                    // InternalQLS.g:2091:3: ( '>' )
                    {
                     before(grammarAccess.getComparisionOperatorKindAccess().getGREATEREnumLiteralDeclaration_0()); 
                    // InternalQLS.g:2092:3: ( '>' )
                    // InternalQLS.g:2092:4: '>'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisionOperatorKindAccess().getGREATEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQLS.g:2096:2: ( ( '<' ) )
                    {
                    // InternalQLS.g:2096:2: ( ( '<' ) )
                    // InternalQLS.g:2097:3: ( '<' )
                    {
                     before(grammarAccess.getComparisionOperatorKindAccess().getLOWEREnumLiteralDeclaration_1()); 
                    // InternalQLS.g:2098:3: ( '<' )
                    // InternalQLS.g:2098:4: '<'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisionOperatorKindAccess().getLOWEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQLS.g:2102:2: ( ( '>=' ) )
                    {
                    // InternalQLS.g:2102:2: ( ( '>=' ) )
                    // InternalQLS.g:2103:3: ( '>=' )
                    {
                     before(grammarAccess.getComparisionOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_2()); 
                    // InternalQLS.g:2104:3: ( '>=' )
                    // InternalQLS.g:2104:4: '>='
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisionOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQLS.g:2108:2: ( ( '<=' ) )
                    {
                    // InternalQLS.g:2108:2: ( ( '<=' ) )
                    // InternalQLS.g:2109:3: ( '<=' )
                    {
                     before(grammarAccess.getComparisionOperatorKindAccess().getLOWEROREQUALEnumLiteralDeclaration_3()); 
                    // InternalQLS.g:2110:3: ( '<=' )
                    // InternalQLS.g:2110:4: '<='
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
    // InternalQLS.g:2118:1: rule__QLSModel__Group__0 : rule__QLSModel__Group__0__Impl rule__QLSModel__Group__1 ;
    public final void rule__QLSModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2122:1: ( rule__QLSModel__Group__0__Impl rule__QLSModel__Group__1 )
            // InternalQLS.g:2123:2: rule__QLSModel__Group__0__Impl rule__QLSModel__Group__1
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
    // InternalQLS.g:2130:1: rule__QLSModel__Group__0__Impl : ( () ) ;
    public final void rule__QLSModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2134:1: ( ( () ) )
            // InternalQLS.g:2135:1: ( () )
            {
            // InternalQLS.g:2135:1: ( () )
            // InternalQLS.g:2136:2: ()
            {
             before(grammarAccess.getQLSModelAccess().getQLSModelAction_0()); 
            // InternalQLS.g:2137:2: ()
            // InternalQLS.g:2137:3: 
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
    // InternalQLS.g:2145:1: rule__QLSModel__Group__1 : rule__QLSModel__Group__1__Impl rule__QLSModel__Group__2 ;
    public final void rule__QLSModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2149:1: ( rule__QLSModel__Group__1__Impl rule__QLSModel__Group__2 )
            // InternalQLS.g:2150:2: rule__QLSModel__Group__1__Impl rule__QLSModel__Group__2
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
    // InternalQLS.g:2157:1: rule__QLSModel__Group__1__Impl : ( ( rule__QLSModel__ImportsAssignment_1 )* ) ;
    public final void rule__QLSModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2161:1: ( ( ( rule__QLSModel__ImportsAssignment_1 )* ) )
            // InternalQLS.g:2162:1: ( ( rule__QLSModel__ImportsAssignment_1 )* )
            {
            // InternalQLS.g:2162:1: ( ( rule__QLSModel__ImportsAssignment_1 )* )
            // InternalQLS.g:2163:2: ( rule__QLSModel__ImportsAssignment_1 )*
            {
             before(grammarAccess.getQLSModelAccess().getImportsAssignment_1()); 
            // InternalQLS.g:2164:2: ( rule__QLSModel__ImportsAssignment_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==47) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalQLS.g:2164:3: rule__QLSModel__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__QLSModel__ImportsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalQLS.g:2172:1: rule__QLSModel__Group__2 : rule__QLSModel__Group__2__Impl rule__QLSModel__Group__3 ;
    public final void rule__QLSModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2176:1: ( rule__QLSModel__Group__2__Impl rule__QLSModel__Group__3 )
            // InternalQLS.g:2177:2: rule__QLSModel__Group__2__Impl rule__QLSModel__Group__3
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
    // InternalQLS.g:2184:1: rule__QLSModel__Group__2__Impl : ( 'QLSModel' ) ;
    public final void rule__QLSModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2188:1: ( ( 'QLSModel' ) )
            // InternalQLS.g:2189:1: ( 'QLSModel' )
            {
            // InternalQLS.g:2189:1: ( 'QLSModel' )
            // InternalQLS.g:2190:2: 'QLSModel'
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
    // InternalQLS.g:2199:1: rule__QLSModel__Group__3 : rule__QLSModel__Group__3__Impl rule__QLSModel__Group__4 ;
    public final void rule__QLSModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2203:1: ( rule__QLSModel__Group__3__Impl rule__QLSModel__Group__4 )
            // InternalQLS.g:2204:2: rule__QLSModel__Group__3__Impl rule__QLSModel__Group__4
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
    // InternalQLS.g:2211:1: rule__QLSModel__Group__3__Impl : ( ( rule__QLSModel__StyledQLModelAssignment_3 ) ) ;
    public final void rule__QLSModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2215:1: ( ( ( rule__QLSModel__StyledQLModelAssignment_3 ) ) )
            // InternalQLS.g:2216:1: ( ( rule__QLSModel__StyledQLModelAssignment_3 ) )
            {
            // InternalQLS.g:2216:1: ( ( rule__QLSModel__StyledQLModelAssignment_3 ) )
            // InternalQLS.g:2217:2: ( rule__QLSModel__StyledQLModelAssignment_3 )
            {
             before(grammarAccess.getQLSModelAccess().getStyledQLModelAssignment_3()); 
            // InternalQLS.g:2218:2: ( rule__QLSModel__StyledQLModelAssignment_3 )
            // InternalQLS.g:2218:3: rule__QLSModel__StyledQLModelAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__QLSModel__StyledQLModelAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getQLSModelAccess().getStyledQLModelAssignment_3()); 

            }


            }

        }
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
    // InternalQLS.g:2226:1: rule__QLSModel__Group__4 : rule__QLSModel__Group__4__Impl rule__QLSModel__Group__5 ;
    public final void rule__QLSModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2230:1: ( rule__QLSModel__Group__4__Impl rule__QLSModel__Group__5 )
            // InternalQLS.g:2231:2: rule__QLSModel__Group__4__Impl rule__QLSModel__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalQLS.g:2238:1: rule__QLSModel__Group__4__Impl : ( '{' ) ;
    public final void rule__QLSModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2242:1: ( ( '{' ) )
            // InternalQLS.g:2243:1: ( '{' )
            {
            // InternalQLS.g:2243:1: ( '{' )
            // InternalQLS.g:2244:2: '{'
            {
             before(grammarAccess.getQLSModelAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getQLSModelAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
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
    // InternalQLS.g:2253:1: rule__QLSModel__Group__5 : rule__QLSModel__Group__5__Impl rule__QLSModel__Group__6 ;
    public final void rule__QLSModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2257:1: ( rule__QLSModel__Group__5__Impl rule__QLSModel__Group__6 )
            // InternalQLS.g:2258:2: rule__QLSModel__Group__5__Impl rule__QLSModel__Group__6
            {
            pushFollow(FOLLOW_6);
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
    // InternalQLS.g:2265:1: rule__QLSModel__Group__5__Impl : ( 'questionStyles' ) ;
    public final void rule__QLSModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2269:1: ( ( 'questionStyles' ) )
            // InternalQLS.g:2270:1: ( 'questionStyles' )
            {
            // InternalQLS.g:2270:1: ( 'questionStyles' )
            // InternalQLS.g:2271:2: 'questionStyles'
            {
             before(grammarAccess.getQLSModelAccess().getQuestionStylesKeyword_5()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getQLSModelAccess().getQuestionStylesKeyword_5()); 

            }


            }

        }
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
    // InternalQLS.g:2280:1: rule__QLSModel__Group__6 : rule__QLSModel__Group__6__Impl rule__QLSModel__Group__7 ;
    public final void rule__QLSModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2284:1: ( rule__QLSModel__Group__6__Impl rule__QLSModel__Group__7 )
            // InternalQLS.g:2285:2: rule__QLSModel__Group__6__Impl rule__QLSModel__Group__7
            {
            pushFollow(FOLLOW_8);
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
    // InternalQLS.g:2292:1: rule__QLSModel__Group__6__Impl : ( '{' ) ;
    public final void rule__QLSModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2296:1: ( ( '{' ) )
            // InternalQLS.g:2297:1: ( '{' )
            {
            // InternalQLS.g:2297:1: ( '{' )
            // InternalQLS.g:2298:2: '{'
            {
             before(grammarAccess.getQLSModelAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getQLSModelAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
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
    // InternalQLS.g:2307:1: rule__QLSModel__Group__7 : rule__QLSModel__Group__7__Impl rule__QLSModel__Group__8 ;
    public final void rule__QLSModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2311:1: ( rule__QLSModel__Group__7__Impl rule__QLSModel__Group__8 )
            // InternalQLS.g:2312:2: rule__QLSModel__Group__7__Impl rule__QLSModel__Group__8
            {
            pushFollow(FOLLOW_8);
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
    // InternalQLS.g:2319:1: rule__QLSModel__Group__7__Impl : ( ( rule__QLSModel__QuestionStylesAssignment_7 )* ) ;
    public final void rule__QLSModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2323:1: ( ( ( rule__QLSModel__QuestionStylesAssignment_7 )* ) )
            // InternalQLS.g:2324:1: ( ( rule__QLSModel__QuestionStylesAssignment_7 )* )
            {
            // InternalQLS.g:2324:1: ( ( rule__QLSModel__QuestionStylesAssignment_7 )* )
            // InternalQLS.g:2325:2: ( rule__QLSModel__QuestionStylesAssignment_7 )*
            {
             before(grammarAccess.getQLSModelAccess().getQuestionStylesAssignment_7()); 
            // InternalQLS.g:2326:2: ( rule__QLSModel__QuestionStylesAssignment_7 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==49) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalQLS.g:2326:3: rule__QLSModel__QuestionStylesAssignment_7
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QLSModel__QuestionStylesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getQLSModelAccess().getQuestionStylesAssignment_7()); 

            }


            }

        }
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
    // InternalQLS.g:2334:1: rule__QLSModel__Group__8 : rule__QLSModel__Group__8__Impl rule__QLSModel__Group__9 ;
    public final void rule__QLSModel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2338:1: ( rule__QLSModel__Group__8__Impl rule__QLSModel__Group__9 )
            // InternalQLS.g:2339:2: rule__QLSModel__Group__8__Impl rule__QLSModel__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__QLSModel__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLSModel__Group__9();

            state._fsp--;


            }

        }
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
    // InternalQLS.g:2346:1: rule__QLSModel__Group__8__Impl : ( '}' ) ;
    public final void rule__QLSModel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2350:1: ( ( '}' ) )
            // InternalQLS.g:2351:1: ( '}' )
            {
            // InternalQLS.g:2351:1: ( '}' )
            // InternalQLS.g:2352:2: '}'
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


    // $ANTLR start "rule__QLSModel__Group__9"
    // InternalQLS.g:2361:1: rule__QLSModel__Group__9 : rule__QLSModel__Group__9__Impl rule__QLSModel__Group__10 ;
    public final void rule__QLSModel__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2365:1: ( rule__QLSModel__Group__9__Impl rule__QLSModel__Group__10 )
            // InternalQLS.g:2366:2: rule__QLSModel__Group__9__Impl rule__QLSModel__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__QLSModel__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLSModel__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLSModel__Group__9"


    // $ANTLR start "rule__QLSModel__Group__9__Impl"
    // InternalQLS.g:2373:1: rule__QLSModel__Group__9__Impl : ( ( rule__QLSModel__SectionsAssignment_9 )* ) ;
    public final void rule__QLSModel__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2377:1: ( ( ( rule__QLSModel__SectionsAssignment_9 )* ) )
            // InternalQLS.g:2378:1: ( ( rule__QLSModel__SectionsAssignment_9 )* )
            {
            // InternalQLS.g:2378:1: ( ( rule__QLSModel__SectionsAssignment_9 )* )
            // InternalQLS.g:2379:2: ( rule__QLSModel__SectionsAssignment_9 )*
            {
             before(grammarAccess.getQLSModelAccess().getSectionsAssignment_9()); 
            // InternalQLS.g:2380:2: ( rule__QLSModel__SectionsAssignment_9 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==48) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalQLS.g:2380:3: rule__QLSModel__SectionsAssignment_9
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__QLSModel__SectionsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getQLSModelAccess().getSectionsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLSModel__Group__9__Impl"


    // $ANTLR start "rule__QLSModel__Group__10"
    // InternalQLS.g:2388:1: rule__QLSModel__Group__10 : rule__QLSModel__Group__10__Impl ;
    public final void rule__QLSModel__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2392:1: ( rule__QLSModel__Group__10__Impl )
            // InternalQLS.g:2393:2: rule__QLSModel__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QLSModel__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLSModel__Group__10"


    // $ANTLR start "rule__QLSModel__Group__10__Impl"
    // InternalQLS.g:2399:1: rule__QLSModel__Group__10__Impl : ( '}' ) ;
    public final void rule__QLSModel__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2403:1: ( ( '}' ) )
            // InternalQLS.g:2404:1: ( '}' )
            {
            // InternalQLS.g:2404:1: ( '}' )
            // InternalQLS.g:2405:2: '}'
            {
             before(grammarAccess.getQLSModelAccess().getRightCurlyBracketKeyword_10()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getQLSModelAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLSModel__Group__10__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalQLS.g:2415:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2419:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalQLS.g:2420:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalQLS.g:2427:1: rule__Import__Group__0__Impl : ( () ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2431:1: ( ( () ) )
            // InternalQLS.g:2432:1: ( () )
            {
            // InternalQLS.g:2432:1: ( () )
            // InternalQLS.g:2433:2: ()
            {
             before(grammarAccess.getImportAccess().getImportAction_0()); 
            // InternalQLS.g:2434:2: ()
            // InternalQLS.g:2434:3: 
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
    // InternalQLS.g:2442:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2446:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalQLS.g:2447:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalQLS.g:2454:1: rule__Import__Group__1__Impl : ( 'import' ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2458:1: ( ( 'import' ) )
            // InternalQLS.g:2459:1: ( 'import' )
            {
            // InternalQLS.g:2459:1: ( 'import' )
            // InternalQLS.g:2460:2: 'import'
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
    // InternalQLS.g:2469:1: rule__Import__Group__2 : rule__Import__Group__2__Impl ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2473:1: ( rule__Import__Group__2__Impl )
            // InternalQLS.g:2474:2: rule__Import__Group__2__Impl
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
    // InternalQLS.g:2480:1: rule__Import__Group__2__Impl : ( ( rule__Import__ImportURIAssignment_2 ) ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2484:1: ( ( ( rule__Import__ImportURIAssignment_2 ) ) )
            // InternalQLS.g:2485:1: ( ( rule__Import__ImportURIAssignment_2 ) )
            {
            // InternalQLS.g:2485:1: ( ( rule__Import__ImportURIAssignment_2 ) )
            // InternalQLS.g:2486:2: ( rule__Import__ImportURIAssignment_2 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_2()); 
            // InternalQLS.g:2487:2: ( rule__Import__ImportURIAssignment_2 )
            // InternalQLS.g:2487:3: rule__Import__ImportURIAssignment_2
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


    // $ANTLR start "rule__Section__Group__0"
    // InternalQLS.g:2496:1: rule__Section__Group__0 : rule__Section__Group__0__Impl rule__Section__Group__1 ;
    public final void rule__Section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2500:1: ( rule__Section__Group__0__Impl rule__Section__Group__1 )
            // InternalQLS.g:2501:2: rule__Section__Group__0__Impl rule__Section__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Section__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__0"


    // $ANTLR start "rule__Section__Group__0__Impl"
    // InternalQLS.g:2508:1: rule__Section__Group__0__Impl : ( () ) ;
    public final void rule__Section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2512:1: ( ( () ) )
            // InternalQLS.g:2513:1: ( () )
            {
            // InternalQLS.g:2513:1: ( () )
            // InternalQLS.g:2514:2: ()
            {
             before(grammarAccess.getSectionAccess().getSectionAction_0()); 
            // InternalQLS.g:2515:2: ()
            // InternalQLS.g:2515:3: 
            {
            }

             after(grammarAccess.getSectionAccess().getSectionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__0__Impl"


    // $ANTLR start "rule__Section__Group__1"
    // InternalQLS.g:2523:1: rule__Section__Group__1 : rule__Section__Group__1__Impl rule__Section__Group__2 ;
    public final void rule__Section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2527:1: ( rule__Section__Group__1__Impl rule__Section__Group__2 )
            // InternalQLS.g:2528:2: rule__Section__Group__1__Impl rule__Section__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Section__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__1"


    // $ANTLR start "rule__Section__Group__1__Impl"
    // InternalQLS.g:2535:1: rule__Section__Group__1__Impl : ( 'section' ) ;
    public final void rule__Section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2539:1: ( ( 'section' ) )
            // InternalQLS.g:2540:1: ( 'section' )
            {
            // InternalQLS.g:2540:1: ( 'section' )
            // InternalQLS.g:2541:2: 'section'
            {
             before(grammarAccess.getSectionAccess().getSectionKeyword_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getSectionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__1__Impl"


    // $ANTLR start "rule__Section__Group__2"
    // InternalQLS.g:2550:1: rule__Section__Group__2 : rule__Section__Group__2__Impl rule__Section__Group__3 ;
    public final void rule__Section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2554:1: ( rule__Section__Group__2__Impl rule__Section__Group__3 )
            // InternalQLS.g:2555:2: rule__Section__Group__2__Impl rule__Section__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Section__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__2"


    // $ANTLR start "rule__Section__Group__2__Impl"
    // InternalQLS.g:2562:1: rule__Section__Group__2__Impl : ( ( rule__Section__TitleAssignment_2 ) ) ;
    public final void rule__Section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2566:1: ( ( ( rule__Section__TitleAssignment_2 ) ) )
            // InternalQLS.g:2567:1: ( ( rule__Section__TitleAssignment_2 ) )
            {
            // InternalQLS.g:2567:1: ( ( rule__Section__TitleAssignment_2 ) )
            // InternalQLS.g:2568:2: ( rule__Section__TitleAssignment_2 )
            {
             before(grammarAccess.getSectionAccess().getTitleAssignment_2()); 
            // InternalQLS.g:2569:2: ( rule__Section__TitleAssignment_2 )
            // InternalQLS.g:2569:3: rule__Section__TitleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Section__TitleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getTitleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__2__Impl"


    // $ANTLR start "rule__Section__Group__3"
    // InternalQLS.g:2577:1: rule__Section__Group__3 : rule__Section__Group__3__Impl rule__Section__Group__4 ;
    public final void rule__Section__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2581:1: ( rule__Section__Group__3__Impl rule__Section__Group__4 )
            // InternalQLS.g:2582:2: rule__Section__Group__3__Impl rule__Section__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Section__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__3"


    // $ANTLR start "rule__Section__Group__3__Impl"
    // InternalQLS.g:2589:1: rule__Section__Group__3__Impl : ( '{' ) ;
    public final void rule__Section__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2593:1: ( ( '{' ) )
            // InternalQLS.g:2594:1: ( '{' )
            {
            // InternalQLS.g:2594:1: ( '{' )
            // InternalQLS.g:2595:2: '{'
            {
             before(grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__3__Impl"


    // $ANTLR start "rule__Section__Group__4"
    // InternalQLS.g:2604:1: rule__Section__Group__4 : rule__Section__Group__4__Impl rule__Section__Group__5 ;
    public final void rule__Section__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2608:1: ( rule__Section__Group__4__Impl rule__Section__Group__5 )
            // InternalQLS.g:2609:2: rule__Section__Group__4__Impl rule__Section__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Section__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__4"


    // $ANTLR start "rule__Section__Group__4__Impl"
    // InternalQLS.g:2616:1: rule__Section__Group__4__Impl : ( ( rule__Section__SectionContentsAssignment_4 )* ) ;
    public final void rule__Section__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2620:1: ( ( ( rule__Section__SectionContentsAssignment_4 )* ) )
            // InternalQLS.g:2621:1: ( ( rule__Section__SectionContentsAssignment_4 )* )
            {
            // InternalQLS.g:2621:1: ( ( rule__Section__SectionContentsAssignment_4 )* )
            // InternalQLS.g:2622:2: ( rule__Section__SectionContentsAssignment_4 )*
            {
             before(grammarAccess.getSectionAccess().getSectionContentsAssignment_4()); 
            // InternalQLS.g:2623:2: ( rule__Section__SectionContentsAssignment_4 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID||LA25_0==48) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalQLS.g:2623:3: rule__Section__SectionContentsAssignment_4
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Section__SectionContentsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getSectionAccess().getSectionContentsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__4__Impl"


    // $ANTLR start "rule__Section__Group__5"
    // InternalQLS.g:2631:1: rule__Section__Group__5 : rule__Section__Group__5__Impl ;
    public final void rule__Section__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2635:1: ( rule__Section__Group__5__Impl )
            // InternalQLS.g:2636:2: rule__Section__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__5"


    // $ANTLR start "rule__Section__Group__5__Impl"
    // InternalQLS.g:2642:1: rule__Section__Group__5__Impl : ( '}' ) ;
    public final void rule__Section__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2646:1: ( ( '}' ) )
            // InternalQLS.g:2647:1: ( '}' )
            {
            // InternalQLS.g:2647:1: ( '}' )
            // InternalQLS.g:2648:2: '}'
            {
             before(grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__5__Impl"


    // $ANTLR start "rule__QuestionReference__Group__0"
    // InternalQLS.g:2658:1: rule__QuestionReference__Group__0 : rule__QuestionReference__Group__0__Impl rule__QuestionReference__Group__1 ;
    public final void rule__QuestionReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2662:1: ( rule__QuestionReference__Group__0__Impl rule__QuestionReference__Group__1 )
            // InternalQLS.g:2663:2: rule__QuestionReference__Group__0__Impl rule__QuestionReference__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__QuestionReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionReference__Group__0"


    // $ANTLR start "rule__QuestionReference__Group__0__Impl"
    // InternalQLS.g:2670:1: rule__QuestionReference__Group__0__Impl : ( () ) ;
    public final void rule__QuestionReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2674:1: ( ( () ) )
            // InternalQLS.g:2675:1: ( () )
            {
            // InternalQLS.g:2675:1: ( () )
            // InternalQLS.g:2676:2: ()
            {
             before(grammarAccess.getQuestionReferenceAccess().getQuestionReferenceAction_0()); 
            // InternalQLS.g:2677:2: ()
            // InternalQLS.g:2677:3: 
            {
            }

             after(grammarAccess.getQuestionReferenceAccess().getQuestionReferenceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionReference__Group__0__Impl"


    // $ANTLR start "rule__QuestionReference__Group__1"
    // InternalQLS.g:2685:1: rule__QuestionReference__Group__1 : rule__QuestionReference__Group__1__Impl ;
    public final void rule__QuestionReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2689:1: ( rule__QuestionReference__Group__1__Impl )
            // InternalQLS.g:2690:2: rule__QuestionReference__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionReference__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionReference__Group__1"


    // $ANTLR start "rule__QuestionReference__Group__1__Impl"
    // InternalQLS.g:2696:1: rule__QuestionReference__Group__1__Impl : ( ( rule__QuestionReference__QuestionAssignment_1 ) ) ;
    public final void rule__QuestionReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2700:1: ( ( ( rule__QuestionReference__QuestionAssignment_1 ) ) )
            // InternalQLS.g:2701:1: ( ( rule__QuestionReference__QuestionAssignment_1 ) )
            {
            // InternalQLS.g:2701:1: ( ( rule__QuestionReference__QuestionAssignment_1 ) )
            // InternalQLS.g:2702:2: ( rule__QuestionReference__QuestionAssignment_1 )
            {
             before(grammarAccess.getQuestionReferenceAccess().getQuestionAssignment_1()); 
            // InternalQLS.g:2703:2: ( rule__QuestionReference__QuestionAssignment_1 )
            // InternalQLS.g:2703:3: rule__QuestionReference__QuestionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__QuestionReference__QuestionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionReferenceAccess().getQuestionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionReference__Group__1__Impl"


    // $ANTLR start "rule__QuestionStyle__Group__0"
    // InternalQLS.g:2712:1: rule__QuestionStyle__Group__0 : rule__QuestionStyle__Group__0__Impl rule__QuestionStyle__Group__1 ;
    public final void rule__QuestionStyle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2716:1: ( rule__QuestionStyle__Group__0__Impl rule__QuestionStyle__Group__1 )
            // InternalQLS.g:2717:2: rule__QuestionStyle__Group__0__Impl rule__QuestionStyle__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalQLS.g:2724:1: rule__QuestionStyle__Group__0__Impl : ( 'styledQuestion' ) ;
    public final void rule__QuestionStyle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2728:1: ( ( 'styledQuestion' ) )
            // InternalQLS.g:2729:1: ( 'styledQuestion' )
            {
            // InternalQLS.g:2729:1: ( 'styledQuestion' )
            // InternalQLS.g:2730:2: 'styledQuestion'
            {
             before(grammarAccess.getQuestionStyleAccess().getStyledQuestionKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalQLS.g:2739:1: rule__QuestionStyle__Group__1 : rule__QuestionStyle__Group__1__Impl rule__QuestionStyle__Group__2 ;
    public final void rule__QuestionStyle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2743:1: ( rule__QuestionStyle__Group__1__Impl rule__QuestionStyle__Group__2 )
            // InternalQLS.g:2744:2: rule__QuestionStyle__Group__1__Impl rule__QuestionStyle__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalQLS.g:2751:1: rule__QuestionStyle__Group__1__Impl : ( ( rule__QuestionStyle__StyledQuestionAssignment_1 ) ) ;
    public final void rule__QuestionStyle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2755:1: ( ( ( rule__QuestionStyle__StyledQuestionAssignment_1 ) ) )
            // InternalQLS.g:2756:1: ( ( rule__QuestionStyle__StyledQuestionAssignment_1 ) )
            {
            // InternalQLS.g:2756:1: ( ( rule__QuestionStyle__StyledQuestionAssignment_1 ) )
            // InternalQLS.g:2757:2: ( rule__QuestionStyle__StyledQuestionAssignment_1 )
            {
             before(grammarAccess.getQuestionStyleAccess().getStyledQuestionAssignment_1()); 
            // InternalQLS.g:2758:2: ( rule__QuestionStyle__StyledQuestionAssignment_1 )
            // InternalQLS.g:2758:3: rule__QuestionStyle__StyledQuestionAssignment_1
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
    // InternalQLS.g:2766:1: rule__QuestionStyle__Group__2 : rule__QuestionStyle__Group__2__Impl rule__QuestionStyle__Group__3 ;
    public final void rule__QuestionStyle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2770:1: ( rule__QuestionStyle__Group__2__Impl rule__QuestionStyle__Group__3 )
            // InternalQLS.g:2771:2: rule__QuestionStyle__Group__2__Impl rule__QuestionStyle__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalQLS.g:2778:1: rule__QuestionStyle__Group__2__Impl : ( '{' ) ;
    public final void rule__QuestionStyle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2782:1: ( ( '{' ) )
            // InternalQLS.g:2783:1: ( '{' )
            {
            // InternalQLS.g:2783:1: ( '{' )
            // InternalQLS.g:2784:2: '{'
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
    // InternalQLS.g:2793:1: rule__QuestionStyle__Group__3 : rule__QuestionStyle__Group__3__Impl rule__QuestionStyle__Group__4 ;
    public final void rule__QuestionStyle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2797:1: ( rule__QuestionStyle__Group__3__Impl rule__QuestionStyle__Group__4 )
            // InternalQLS.g:2798:2: rule__QuestionStyle__Group__3__Impl rule__QuestionStyle__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalQLS.g:2805:1: rule__QuestionStyle__Group__3__Impl : ( ( rule__QuestionStyle__Group_3__0 )? ) ;
    public final void rule__QuestionStyle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2809:1: ( ( ( rule__QuestionStyle__Group_3__0 )? ) )
            // InternalQLS.g:2810:1: ( ( rule__QuestionStyle__Group_3__0 )? )
            {
            // InternalQLS.g:2810:1: ( ( rule__QuestionStyle__Group_3__0 )? )
            // InternalQLS.g:2811:2: ( rule__QuestionStyle__Group_3__0 )?
            {
             before(grammarAccess.getQuestionStyleAccess().getGroup_3()); 
            // InternalQLS.g:2812:2: ( rule__QuestionStyle__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==50) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalQLS.g:2812:3: rule__QuestionStyle__Group_3__0
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
    // InternalQLS.g:2820:1: rule__QuestionStyle__Group__4 : rule__QuestionStyle__Group__4__Impl rule__QuestionStyle__Group__5 ;
    public final void rule__QuestionStyle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2824:1: ( rule__QuestionStyle__Group__4__Impl rule__QuestionStyle__Group__5 )
            // InternalQLS.g:2825:2: rule__QuestionStyle__Group__4__Impl rule__QuestionStyle__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalQLS.g:2832:1: rule__QuestionStyle__Group__4__Impl : ( ( rule__QuestionStyle__Group_4__0 )? ) ;
    public final void rule__QuestionStyle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2836:1: ( ( ( rule__QuestionStyle__Group_4__0 )? ) )
            // InternalQLS.g:2837:1: ( ( rule__QuestionStyle__Group_4__0 )? )
            {
            // InternalQLS.g:2837:1: ( ( rule__QuestionStyle__Group_4__0 )? )
            // InternalQLS.g:2838:2: ( rule__QuestionStyle__Group_4__0 )?
            {
             before(grammarAccess.getQuestionStyleAccess().getGroup_4()); 
            // InternalQLS.g:2839:2: ( rule__QuestionStyle__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==51) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalQLS.g:2839:3: rule__QuestionStyle__Group_4__0
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
    // InternalQLS.g:2847:1: rule__QuestionStyle__Group__5 : rule__QuestionStyle__Group__5__Impl ;
    public final void rule__QuestionStyle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2851:1: ( rule__QuestionStyle__Group__5__Impl )
            // InternalQLS.g:2852:2: rule__QuestionStyle__Group__5__Impl
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
    // InternalQLS.g:2858:1: rule__QuestionStyle__Group__5__Impl : ( '}' ) ;
    public final void rule__QuestionStyle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2862:1: ( ( '}' ) )
            // InternalQLS.g:2863:1: ( '}' )
            {
            // InternalQLS.g:2863:1: ( '}' )
            // InternalQLS.g:2864:2: '}'
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
    // InternalQLS.g:2874:1: rule__QuestionStyle__Group_3__0 : rule__QuestionStyle__Group_3__0__Impl rule__QuestionStyle__Group_3__1 ;
    public final void rule__QuestionStyle__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2878:1: ( rule__QuestionStyle__Group_3__0__Impl rule__QuestionStyle__Group_3__1 )
            // InternalQLS.g:2879:2: rule__QuestionStyle__Group_3__0__Impl rule__QuestionStyle__Group_3__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalQLS.g:2886:1: rule__QuestionStyle__Group_3__0__Impl : ( 'labelStyle' ) ;
    public final void rule__QuestionStyle__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2890:1: ( ( 'labelStyle' ) )
            // InternalQLS.g:2891:1: ( 'labelStyle' )
            {
            // InternalQLS.g:2891:1: ( 'labelStyle' )
            // InternalQLS.g:2892:2: 'labelStyle'
            {
             before(grammarAccess.getQuestionStyleAccess().getLabelStyleKeyword_3_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalQLS.g:2901:1: rule__QuestionStyle__Group_3__1 : rule__QuestionStyle__Group_3__1__Impl ;
    public final void rule__QuestionStyle__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2905:1: ( rule__QuestionStyle__Group_3__1__Impl )
            // InternalQLS.g:2906:2: rule__QuestionStyle__Group_3__1__Impl
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
    // InternalQLS.g:2912:1: rule__QuestionStyle__Group_3__1__Impl : ( ( rule__QuestionStyle__LabelStyleAssignment_3_1 ) ) ;
    public final void rule__QuestionStyle__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2916:1: ( ( ( rule__QuestionStyle__LabelStyleAssignment_3_1 ) ) )
            // InternalQLS.g:2917:1: ( ( rule__QuestionStyle__LabelStyleAssignment_3_1 ) )
            {
            // InternalQLS.g:2917:1: ( ( rule__QuestionStyle__LabelStyleAssignment_3_1 ) )
            // InternalQLS.g:2918:2: ( rule__QuestionStyle__LabelStyleAssignment_3_1 )
            {
             before(grammarAccess.getQuestionStyleAccess().getLabelStyleAssignment_3_1()); 
            // InternalQLS.g:2919:2: ( rule__QuestionStyle__LabelStyleAssignment_3_1 )
            // InternalQLS.g:2919:3: rule__QuestionStyle__LabelStyleAssignment_3_1
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
    // InternalQLS.g:2928:1: rule__QuestionStyle__Group_4__0 : rule__QuestionStyle__Group_4__0__Impl rule__QuestionStyle__Group_4__1 ;
    public final void rule__QuestionStyle__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2932:1: ( rule__QuestionStyle__Group_4__0__Impl rule__QuestionStyle__Group_4__1 )
            // InternalQLS.g:2933:2: rule__QuestionStyle__Group_4__0__Impl rule__QuestionStyle__Group_4__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalQLS.g:2940:1: rule__QuestionStyle__Group_4__0__Impl : ( 'typeStyle' ) ;
    public final void rule__QuestionStyle__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2944:1: ( ( 'typeStyle' ) )
            // InternalQLS.g:2945:1: ( 'typeStyle' )
            {
            // InternalQLS.g:2945:1: ( 'typeStyle' )
            // InternalQLS.g:2946:2: 'typeStyle'
            {
             before(grammarAccess.getQuestionStyleAccess().getTypeStyleKeyword_4_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalQLS.g:2955:1: rule__QuestionStyle__Group_4__1 : rule__QuestionStyle__Group_4__1__Impl ;
    public final void rule__QuestionStyle__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2959:1: ( rule__QuestionStyle__Group_4__1__Impl )
            // InternalQLS.g:2960:2: rule__QuestionStyle__Group_4__1__Impl
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
    // InternalQLS.g:2966:1: rule__QuestionStyle__Group_4__1__Impl : ( ( rule__QuestionStyle__TypeStyleAssignment_4_1 ) ) ;
    public final void rule__QuestionStyle__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2970:1: ( ( ( rule__QuestionStyle__TypeStyleAssignment_4_1 ) ) )
            // InternalQLS.g:2971:1: ( ( rule__QuestionStyle__TypeStyleAssignment_4_1 ) )
            {
            // InternalQLS.g:2971:1: ( ( rule__QuestionStyle__TypeStyleAssignment_4_1 ) )
            // InternalQLS.g:2972:2: ( rule__QuestionStyle__TypeStyleAssignment_4_1 )
            {
             before(grammarAccess.getQuestionStyleAccess().getTypeStyleAssignment_4_1()); 
            // InternalQLS.g:2973:2: ( rule__QuestionStyle__TypeStyleAssignment_4_1 )
            // InternalQLS.g:2973:3: rule__QuestionStyle__TypeStyleAssignment_4_1
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
    // InternalQLS.g:2982:1: rule__LabelStyle__Group__0 : rule__LabelStyle__Group__0__Impl rule__LabelStyle__Group__1 ;
    public final void rule__LabelStyle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2986:1: ( rule__LabelStyle__Group__0__Impl rule__LabelStyle__Group__1 )
            // InternalQLS.g:2987:2: rule__LabelStyle__Group__0__Impl rule__LabelStyle__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalQLS.g:2994:1: rule__LabelStyle__Group__0__Impl : ( () ) ;
    public final void rule__LabelStyle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:2998:1: ( ( () ) )
            // InternalQLS.g:2999:1: ( () )
            {
            // InternalQLS.g:2999:1: ( () )
            // InternalQLS.g:3000:2: ()
            {
             before(grammarAccess.getLabelStyleAccess().getLabelStyleAction_0()); 
            // InternalQLS.g:3001:2: ()
            // InternalQLS.g:3001:3: 
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
    // InternalQLS.g:3009:1: rule__LabelStyle__Group__1 : rule__LabelStyle__Group__1__Impl rule__LabelStyle__Group__2 ;
    public final void rule__LabelStyle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3013:1: ( rule__LabelStyle__Group__1__Impl rule__LabelStyle__Group__2 )
            // InternalQLS.g:3014:2: rule__LabelStyle__Group__1__Impl rule__LabelStyle__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalQLS.g:3021:1: rule__LabelStyle__Group__1__Impl : ( '{' ) ;
    public final void rule__LabelStyle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3025:1: ( ( '{' ) )
            // InternalQLS.g:3026:1: ( '{' )
            {
            // InternalQLS.g:3026:1: ( '{' )
            // InternalQLS.g:3027:2: '{'
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
    // InternalQLS.g:3036:1: rule__LabelStyle__Group__2 : rule__LabelStyle__Group__2__Impl rule__LabelStyle__Group__3 ;
    public final void rule__LabelStyle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3040:1: ( rule__LabelStyle__Group__2__Impl rule__LabelStyle__Group__3 )
            // InternalQLS.g:3041:2: rule__LabelStyle__Group__2__Impl rule__LabelStyle__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalQLS.g:3048:1: rule__LabelStyle__Group__2__Impl : ( ( rule__LabelStyle__ItalicAssignment_2 )? ) ;
    public final void rule__LabelStyle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3052:1: ( ( ( rule__LabelStyle__ItalicAssignment_2 )? ) )
            // InternalQLS.g:3053:1: ( ( rule__LabelStyle__ItalicAssignment_2 )? )
            {
            // InternalQLS.g:3053:1: ( ( rule__LabelStyle__ItalicAssignment_2 )? )
            // InternalQLS.g:3054:2: ( rule__LabelStyle__ItalicAssignment_2 )?
            {
             before(grammarAccess.getLabelStyleAccess().getItalicAssignment_2()); 
            // InternalQLS.g:3055:2: ( rule__LabelStyle__ItalicAssignment_2 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==83) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalQLS.g:3055:3: rule__LabelStyle__ItalicAssignment_2
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
    // InternalQLS.g:3063:1: rule__LabelStyle__Group__3 : rule__LabelStyle__Group__3__Impl rule__LabelStyle__Group__4 ;
    public final void rule__LabelStyle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3067:1: ( rule__LabelStyle__Group__3__Impl rule__LabelStyle__Group__4 )
            // InternalQLS.g:3068:2: rule__LabelStyle__Group__3__Impl rule__LabelStyle__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalQLS.g:3075:1: rule__LabelStyle__Group__3__Impl : ( ( rule__LabelStyle__BoldAssignment_3 )? ) ;
    public final void rule__LabelStyle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3079:1: ( ( ( rule__LabelStyle__BoldAssignment_3 )? ) )
            // InternalQLS.g:3080:1: ( ( rule__LabelStyle__BoldAssignment_3 )? )
            {
            // InternalQLS.g:3080:1: ( ( rule__LabelStyle__BoldAssignment_3 )? )
            // InternalQLS.g:3081:2: ( rule__LabelStyle__BoldAssignment_3 )?
            {
             before(grammarAccess.getLabelStyleAccess().getBoldAssignment_3()); 
            // InternalQLS.g:3082:2: ( rule__LabelStyle__BoldAssignment_3 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==84) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalQLS.g:3082:3: rule__LabelStyle__BoldAssignment_3
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
    // InternalQLS.g:3090:1: rule__LabelStyle__Group__4 : rule__LabelStyle__Group__4__Impl ;
    public final void rule__LabelStyle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3094:1: ( rule__LabelStyle__Group__4__Impl )
            // InternalQLS.g:3095:2: rule__LabelStyle__Group__4__Impl
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
    // InternalQLS.g:3101:1: rule__LabelStyle__Group__4__Impl : ( '}' ) ;
    public final void rule__LabelStyle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3105:1: ( ( '}' ) )
            // InternalQLS.g:3106:1: ( '}' )
            {
            // InternalQLS.g:3106:1: ( '}' )
            // InternalQLS.g:3107:2: '}'
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
    // InternalQLS.g:3117:1: rule__BooleanTypeStyle__Group__0 : rule__BooleanTypeStyle__Group__0__Impl rule__BooleanTypeStyle__Group__1 ;
    public final void rule__BooleanTypeStyle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3121:1: ( rule__BooleanTypeStyle__Group__0__Impl rule__BooleanTypeStyle__Group__1 )
            // InternalQLS.g:3122:2: rule__BooleanTypeStyle__Group__0__Impl rule__BooleanTypeStyle__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalQLS.g:3129:1: rule__BooleanTypeStyle__Group__0__Impl : ( 'boolean' ) ;
    public final void rule__BooleanTypeStyle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3133:1: ( ( 'boolean' ) )
            // InternalQLS.g:3134:1: ( 'boolean' )
            {
            // InternalQLS.g:3134:1: ( 'boolean' )
            // InternalQLS.g:3135:2: 'boolean'
            {
             before(grammarAccess.getBooleanTypeStyleAccess().getBooleanKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getBooleanTypeStyleAccess().getBooleanKeyword_0()); 

            }


            }

        }
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
    // InternalQLS.g:3144:1: rule__BooleanTypeStyle__Group__1 : rule__BooleanTypeStyle__Group__1__Impl rule__BooleanTypeStyle__Group__2 ;
    public final void rule__BooleanTypeStyle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3148:1: ( rule__BooleanTypeStyle__Group__1__Impl rule__BooleanTypeStyle__Group__2 )
            // InternalQLS.g:3149:2: rule__BooleanTypeStyle__Group__1__Impl rule__BooleanTypeStyle__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalQLS.g:3156:1: rule__BooleanTypeStyle__Group__1__Impl : ( '{' ) ;
    public final void rule__BooleanTypeStyle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3160:1: ( ( '{' ) )
            // InternalQLS.g:3161:1: ( '{' )
            {
            // InternalQLS.g:3161:1: ( '{' )
            // InternalQLS.g:3162:2: '{'
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
    // InternalQLS.g:3171:1: rule__BooleanTypeStyle__Group__2 : rule__BooleanTypeStyle__Group__2__Impl rule__BooleanTypeStyle__Group__3 ;
    public final void rule__BooleanTypeStyle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3175:1: ( rule__BooleanTypeStyle__Group__2__Impl rule__BooleanTypeStyle__Group__3 )
            // InternalQLS.g:3176:2: rule__BooleanTypeStyle__Group__2__Impl rule__BooleanTypeStyle__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalQLS.g:3183:1: rule__BooleanTypeStyle__Group__2__Impl : ( ( rule__BooleanTypeStyle__BooleanStyleKindAssignment_2 ) ) ;
    public final void rule__BooleanTypeStyle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3187:1: ( ( ( rule__BooleanTypeStyle__BooleanStyleKindAssignment_2 ) ) )
            // InternalQLS.g:3188:1: ( ( rule__BooleanTypeStyle__BooleanStyleKindAssignment_2 ) )
            {
            // InternalQLS.g:3188:1: ( ( rule__BooleanTypeStyle__BooleanStyleKindAssignment_2 ) )
            // InternalQLS.g:3189:2: ( rule__BooleanTypeStyle__BooleanStyleKindAssignment_2 )
            {
             before(grammarAccess.getBooleanTypeStyleAccess().getBooleanStyleKindAssignment_2()); 
            // InternalQLS.g:3190:2: ( rule__BooleanTypeStyle__BooleanStyleKindAssignment_2 )
            // InternalQLS.g:3190:3: rule__BooleanTypeStyle__BooleanStyleKindAssignment_2
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
    // InternalQLS.g:3198:1: rule__BooleanTypeStyle__Group__3 : rule__BooleanTypeStyle__Group__3__Impl ;
    public final void rule__BooleanTypeStyle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3202:1: ( rule__BooleanTypeStyle__Group__3__Impl )
            // InternalQLS.g:3203:2: rule__BooleanTypeStyle__Group__3__Impl
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
    // InternalQLS.g:3209:1: rule__BooleanTypeStyle__Group__3__Impl : ( '}' ) ;
    public final void rule__BooleanTypeStyle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3213:1: ( ( '}' ) )
            // InternalQLS.g:3214:1: ( '}' )
            {
            // InternalQLS.g:3214:1: ( '}' )
            // InternalQLS.g:3215:2: '}'
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
    // InternalQLS.g:3225:1: rule__NumericTypeTextFieldStyle__Group__0 : rule__NumericTypeTextFieldStyle__Group__0__Impl rule__NumericTypeTextFieldStyle__Group__1 ;
    public final void rule__NumericTypeTextFieldStyle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3229:1: ( rule__NumericTypeTextFieldStyle__Group__0__Impl rule__NumericTypeTextFieldStyle__Group__1 )
            // InternalQLS.g:3230:2: rule__NumericTypeTextFieldStyle__Group__0__Impl rule__NumericTypeTextFieldStyle__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalQLS.g:3237:1: rule__NumericTypeTextFieldStyle__Group__0__Impl : ( () ) ;
    public final void rule__NumericTypeTextFieldStyle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3241:1: ( ( () ) )
            // InternalQLS.g:3242:1: ( () )
            {
            // InternalQLS.g:3242:1: ( () )
            // InternalQLS.g:3243:2: ()
            {
             before(grammarAccess.getNumericTypeTextFieldStyleAccess().getNumericTypeTextFieldStyleAction_0()); 
            // InternalQLS.g:3244:2: ()
            // InternalQLS.g:3244:3: 
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
    // InternalQLS.g:3252:1: rule__NumericTypeTextFieldStyle__Group__1 : rule__NumericTypeTextFieldStyle__Group__1__Impl rule__NumericTypeTextFieldStyle__Group__2 ;
    public final void rule__NumericTypeTextFieldStyle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3256:1: ( rule__NumericTypeTextFieldStyle__Group__1__Impl rule__NumericTypeTextFieldStyle__Group__2 )
            // InternalQLS.g:3257:2: rule__NumericTypeTextFieldStyle__Group__1__Impl rule__NumericTypeTextFieldStyle__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalQLS.g:3264:1: rule__NumericTypeTextFieldStyle__Group__1__Impl : ( 'numeric' ) ;
    public final void rule__NumericTypeTextFieldStyle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3268:1: ( ( 'numeric' ) )
            // InternalQLS.g:3269:1: ( 'numeric' )
            {
            // InternalQLS.g:3269:1: ( 'numeric' )
            // InternalQLS.g:3270:2: 'numeric'
            {
             before(grammarAccess.getNumericTypeTextFieldStyleAccess().getNumericKeyword_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getNumericTypeTextFieldStyleAccess().getNumericKeyword_1()); 

            }


            }

        }
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
    // InternalQLS.g:3279:1: rule__NumericTypeTextFieldStyle__Group__2 : rule__NumericTypeTextFieldStyle__Group__2__Impl rule__NumericTypeTextFieldStyle__Group__3 ;
    public final void rule__NumericTypeTextFieldStyle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3283:1: ( rule__NumericTypeTextFieldStyle__Group__2__Impl rule__NumericTypeTextFieldStyle__Group__3 )
            // InternalQLS.g:3284:2: rule__NumericTypeTextFieldStyle__Group__2__Impl rule__NumericTypeTextFieldStyle__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalQLS.g:3291:1: rule__NumericTypeTextFieldStyle__Group__2__Impl : ( '{' ) ;
    public final void rule__NumericTypeTextFieldStyle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3295:1: ( ( '{' ) )
            // InternalQLS.g:3296:1: ( '{' )
            {
            // InternalQLS.g:3296:1: ( '{' )
            // InternalQLS.g:3297:2: '{'
            {
             before(grammarAccess.getNumericTypeTextFieldStyleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getNumericTypeTextFieldStyleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalQLS.g:3306:1: rule__NumericTypeTextFieldStyle__Group__3 : rule__NumericTypeTextFieldStyle__Group__3__Impl rule__NumericTypeTextFieldStyle__Group__4 ;
    public final void rule__NumericTypeTextFieldStyle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3310:1: ( rule__NumericTypeTextFieldStyle__Group__3__Impl rule__NumericTypeTextFieldStyle__Group__4 )
            // InternalQLS.g:3311:2: rule__NumericTypeTextFieldStyle__Group__3__Impl rule__NumericTypeTextFieldStyle__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalQLS.g:3318:1: rule__NumericTypeTextFieldStyle__Group__3__Impl : ( 'textField' ) ;
    public final void rule__NumericTypeTextFieldStyle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3322:1: ( ( 'textField' ) )
            // InternalQLS.g:3323:1: ( 'textField' )
            {
            // InternalQLS.g:3323:1: ( 'textField' )
            // InternalQLS.g:3324:2: 'textField'
            {
             before(grammarAccess.getNumericTypeTextFieldStyleAccess().getTextFieldKeyword_3()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getNumericTypeTextFieldStyleAccess().getTextFieldKeyword_3()); 

            }


            }

        }
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
    // InternalQLS.g:3333:1: rule__NumericTypeTextFieldStyle__Group__4 : rule__NumericTypeTextFieldStyle__Group__4__Impl ;
    public final void rule__NumericTypeTextFieldStyle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3337:1: ( rule__NumericTypeTextFieldStyle__Group__4__Impl )
            // InternalQLS.g:3338:2: rule__NumericTypeTextFieldStyle__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumericTypeTextFieldStyle__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalQLS.g:3344:1: rule__NumericTypeTextFieldStyle__Group__4__Impl : ( '}' ) ;
    public final void rule__NumericTypeTextFieldStyle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3348:1: ( ( '}' ) )
            // InternalQLS.g:3349:1: ( '}' )
            {
            // InternalQLS.g:3349:1: ( '}' )
            // InternalQLS.g:3350:2: '}'
            {
             before(grammarAccess.getNumericTypeTextFieldStyleAccess().getRightCurlyBracketKeyword_4()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getNumericTypeTextFieldStyleAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__NumericTypeSpinnerStyle__Group__0"
    // InternalQLS.g:3360:1: rule__NumericTypeSpinnerStyle__Group__0 : rule__NumericTypeSpinnerStyle__Group__0__Impl rule__NumericTypeSpinnerStyle__Group__1 ;
    public final void rule__NumericTypeSpinnerStyle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3364:1: ( rule__NumericTypeSpinnerStyle__Group__0__Impl rule__NumericTypeSpinnerStyle__Group__1 )
            // InternalQLS.g:3365:2: rule__NumericTypeSpinnerStyle__Group__0__Impl rule__NumericTypeSpinnerStyle__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalQLS.g:3372:1: rule__NumericTypeSpinnerStyle__Group__0__Impl : ( () ) ;
    public final void rule__NumericTypeSpinnerStyle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3376:1: ( ( () ) )
            // InternalQLS.g:3377:1: ( () )
            {
            // InternalQLS.g:3377:1: ( () )
            // InternalQLS.g:3378:2: ()
            {
             before(grammarAccess.getNumericTypeSpinnerStyleAccess().getNumericTypeSpinnerStyleAction_0()); 
            // InternalQLS.g:3379:2: ()
            // InternalQLS.g:3379:3: 
            {
            }

             after(grammarAccess.getNumericTypeSpinnerStyleAccess().getNumericTypeSpinnerStyleAction_0()); 

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
    // InternalQLS.g:3387:1: rule__NumericTypeSpinnerStyle__Group__1 : rule__NumericTypeSpinnerStyle__Group__1__Impl rule__NumericTypeSpinnerStyle__Group__2 ;
    public final void rule__NumericTypeSpinnerStyle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3391:1: ( rule__NumericTypeSpinnerStyle__Group__1__Impl rule__NumericTypeSpinnerStyle__Group__2 )
            // InternalQLS.g:3392:2: rule__NumericTypeSpinnerStyle__Group__1__Impl rule__NumericTypeSpinnerStyle__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalQLS.g:3399:1: rule__NumericTypeSpinnerStyle__Group__1__Impl : ( 'numeric' ) ;
    public final void rule__NumericTypeSpinnerStyle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3403:1: ( ( 'numeric' ) )
            // InternalQLS.g:3404:1: ( 'numeric' )
            {
            // InternalQLS.g:3404:1: ( 'numeric' )
            // InternalQLS.g:3405:2: 'numeric'
            {
             before(grammarAccess.getNumericTypeSpinnerStyleAccess().getNumericKeyword_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getNumericTypeSpinnerStyleAccess().getNumericKeyword_1()); 

            }


            }

        }
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
    // InternalQLS.g:3414:1: rule__NumericTypeSpinnerStyle__Group__2 : rule__NumericTypeSpinnerStyle__Group__2__Impl rule__NumericTypeSpinnerStyle__Group__3 ;
    public final void rule__NumericTypeSpinnerStyle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3418:1: ( rule__NumericTypeSpinnerStyle__Group__2__Impl rule__NumericTypeSpinnerStyle__Group__3 )
            // InternalQLS.g:3419:2: rule__NumericTypeSpinnerStyle__Group__2__Impl rule__NumericTypeSpinnerStyle__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalQLS.g:3426:1: rule__NumericTypeSpinnerStyle__Group__2__Impl : ( '{' ) ;
    public final void rule__NumericTypeSpinnerStyle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3430:1: ( ( '{' ) )
            // InternalQLS.g:3431:1: ( '{' )
            {
            // InternalQLS.g:3431:1: ( '{' )
            // InternalQLS.g:3432:2: '{'
            {
             before(grammarAccess.getNumericTypeSpinnerStyleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getNumericTypeSpinnerStyleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalQLS.g:3441:1: rule__NumericTypeSpinnerStyle__Group__3 : rule__NumericTypeSpinnerStyle__Group__3__Impl rule__NumericTypeSpinnerStyle__Group__4 ;
    public final void rule__NumericTypeSpinnerStyle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3445:1: ( rule__NumericTypeSpinnerStyle__Group__3__Impl rule__NumericTypeSpinnerStyle__Group__4 )
            // InternalQLS.g:3446:2: rule__NumericTypeSpinnerStyle__Group__3__Impl rule__NumericTypeSpinnerStyle__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalQLS.g:3453:1: rule__NumericTypeSpinnerStyle__Group__3__Impl : ( 'spinner' ) ;
    public final void rule__NumericTypeSpinnerStyle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3457:1: ( ( 'spinner' ) )
            // InternalQLS.g:3458:1: ( 'spinner' )
            {
            // InternalQLS.g:3458:1: ( 'spinner' )
            // InternalQLS.g:3459:2: 'spinner'
            {
             before(grammarAccess.getNumericTypeSpinnerStyleAccess().getSpinnerKeyword_3()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getNumericTypeSpinnerStyleAccess().getSpinnerKeyword_3()); 

            }


            }

        }
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
    // InternalQLS.g:3468:1: rule__NumericTypeSpinnerStyle__Group__4 : rule__NumericTypeSpinnerStyle__Group__4__Impl rule__NumericTypeSpinnerStyle__Group__5 ;
    public final void rule__NumericTypeSpinnerStyle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3472:1: ( rule__NumericTypeSpinnerStyle__Group__4__Impl rule__NumericTypeSpinnerStyle__Group__5 )
            // InternalQLS.g:3473:2: rule__NumericTypeSpinnerStyle__Group__4__Impl rule__NumericTypeSpinnerStyle__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__NumericTypeSpinnerStyle__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericTypeSpinnerStyle__Group__5();

            state._fsp--;


            }

        }
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
    // InternalQLS.g:3480:1: rule__NumericTypeSpinnerStyle__Group__4__Impl : ( ( rule__NumericTypeSpinnerStyle__Group_4__0 )? ) ;
    public final void rule__NumericTypeSpinnerStyle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3484:1: ( ( ( rule__NumericTypeSpinnerStyle__Group_4__0 )? ) )
            // InternalQLS.g:3485:1: ( ( rule__NumericTypeSpinnerStyle__Group_4__0 )? )
            {
            // InternalQLS.g:3485:1: ( ( rule__NumericTypeSpinnerStyle__Group_4__0 )? )
            // InternalQLS.g:3486:2: ( rule__NumericTypeSpinnerStyle__Group_4__0 )?
            {
             before(grammarAccess.getNumericTypeSpinnerStyleAccess().getGroup_4()); 
            // InternalQLS.g:3487:2: ( rule__NumericTypeSpinnerStyle__Group_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==56) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalQLS.g:3487:3: rule__NumericTypeSpinnerStyle__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumericTypeSpinnerStyle__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumericTypeSpinnerStyleAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__NumericTypeSpinnerStyle__Group__5"
    // InternalQLS.g:3495:1: rule__NumericTypeSpinnerStyle__Group__5 : rule__NumericTypeSpinnerStyle__Group__5__Impl ;
    public final void rule__NumericTypeSpinnerStyle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3499:1: ( rule__NumericTypeSpinnerStyle__Group__5__Impl )
            // InternalQLS.g:3500:2: rule__NumericTypeSpinnerStyle__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumericTypeSpinnerStyle__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericTypeSpinnerStyle__Group__5"


    // $ANTLR start "rule__NumericTypeSpinnerStyle__Group__5__Impl"
    // InternalQLS.g:3506:1: rule__NumericTypeSpinnerStyle__Group__5__Impl : ( '}' ) ;
    public final void rule__NumericTypeSpinnerStyle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3510:1: ( ( '}' ) )
            // InternalQLS.g:3511:1: ( '}' )
            {
            // InternalQLS.g:3511:1: ( '}' )
            // InternalQLS.g:3512:2: '}'
            {
             before(grammarAccess.getNumericTypeSpinnerStyleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getNumericTypeSpinnerStyleAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericTypeSpinnerStyle__Group__5__Impl"


    // $ANTLR start "rule__NumericTypeSpinnerStyle__Group_4__0"
    // InternalQLS.g:3522:1: rule__NumericTypeSpinnerStyle__Group_4__0 : rule__NumericTypeSpinnerStyle__Group_4__0__Impl rule__NumericTypeSpinnerStyle__Group_4__1 ;
    public final void rule__NumericTypeSpinnerStyle__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3526:1: ( rule__NumericTypeSpinnerStyle__Group_4__0__Impl rule__NumericTypeSpinnerStyle__Group_4__1 )
            // InternalQLS.g:3527:2: rule__NumericTypeSpinnerStyle__Group_4__0__Impl rule__NumericTypeSpinnerStyle__Group_4__1
            {
            pushFollow(FOLLOW_27);
            rule__NumericTypeSpinnerStyle__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericTypeSpinnerStyle__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericTypeSpinnerStyle__Group_4__0"


    // $ANTLR start "rule__NumericTypeSpinnerStyle__Group_4__0__Impl"
    // InternalQLS.g:3534:1: rule__NumericTypeSpinnerStyle__Group_4__0__Impl : ( 'step' ) ;
    public final void rule__NumericTypeSpinnerStyle__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3538:1: ( ( 'step' ) )
            // InternalQLS.g:3539:1: ( 'step' )
            {
            // InternalQLS.g:3539:1: ( 'step' )
            // InternalQLS.g:3540:2: 'step'
            {
             before(grammarAccess.getNumericTypeSpinnerStyleAccess().getStepKeyword_4_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getNumericTypeSpinnerStyleAccess().getStepKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericTypeSpinnerStyle__Group_4__0__Impl"


    // $ANTLR start "rule__NumericTypeSpinnerStyle__Group_4__1"
    // InternalQLS.g:3549:1: rule__NumericTypeSpinnerStyle__Group_4__1 : rule__NumericTypeSpinnerStyle__Group_4__1__Impl ;
    public final void rule__NumericTypeSpinnerStyle__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3553:1: ( rule__NumericTypeSpinnerStyle__Group_4__1__Impl )
            // InternalQLS.g:3554:2: rule__NumericTypeSpinnerStyle__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumericTypeSpinnerStyle__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericTypeSpinnerStyle__Group_4__1"


    // $ANTLR start "rule__NumericTypeSpinnerStyle__Group_4__1__Impl"
    // InternalQLS.g:3560:1: rule__NumericTypeSpinnerStyle__Group_4__1__Impl : ( ( rule__NumericTypeSpinnerStyle__StepAssignment_4_1 ) ) ;
    public final void rule__NumericTypeSpinnerStyle__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3564:1: ( ( ( rule__NumericTypeSpinnerStyle__StepAssignment_4_1 ) ) )
            // InternalQLS.g:3565:1: ( ( rule__NumericTypeSpinnerStyle__StepAssignment_4_1 ) )
            {
            // InternalQLS.g:3565:1: ( ( rule__NumericTypeSpinnerStyle__StepAssignment_4_1 ) )
            // InternalQLS.g:3566:2: ( rule__NumericTypeSpinnerStyle__StepAssignment_4_1 )
            {
             before(grammarAccess.getNumericTypeSpinnerStyleAccess().getStepAssignment_4_1()); 
            // InternalQLS.g:3567:2: ( rule__NumericTypeSpinnerStyle__StepAssignment_4_1 )
            // InternalQLS.g:3567:3: rule__NumericTypeSpinnerStyle__StepAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__NumericTypeSpinnerStyle__StepAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getNumericTypeSpinnerStyleAccess().getStepAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericTypeSpinnerStyle__Group_4__1__Impl"


    // $ANTLR start "rule__TextTypeStyle__Group__0"
    // InternalQLS.g:3576:1: rule__TextTypeStyle__Group__0 : rule__TextTypeStyle__Group__0__Impl rule__TextTypeStyle__Group__1 ;
    public final void rule__TextTypeStyle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3580:1: ( rule__TextTypeStyle__Group__0__Impl rule__TextTypeStyle__Group__1 )
            // InternalQLS.g:3581:2: rule__TextTypeStyle__Group__0__Impl rule__TextTypeStyle__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalQLS.g:3588:1: rule__TextTypeStyle__Group__0__Impl : ( () ) ;
    public final void rule__TextTypeStyle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3592:1: ( ( () ) )
            // InternalQLS.g:3593:1: ( () )
            {
            // InternalQLS.g:3593:1: ( () )
            // InternalQLS.g:3594:2: ()
            {
             before(grammarAccess.getTextTypeStyleAccess().getTextTypeStyleAction_0()); 
            // InternalQLS.g:3595:2: ()
            // InternalQLS.g:3595:3: 
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
    // InternalQLS.g:3603:1: rule__TextTypeStyle__Group__1 : rule__TextTypeStyle__Group__1__Impl rule__TextTypeStyle__Group__2 ;
    public final void rule__TextTypeStyle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3607:1: ( rule__TextTypeStyle__Group__1__Impl rule__TextTypeStyle__Group__2 )
            // InternalQLS.g:3608:2: rule__TextTypeStyle__Group__1__Impl rule__TextTypeStyle__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalQLS.g:3615:1: rule__TextTypeStyle__Group__1__Impl : ( 'text' ) ;
    public final void rule__TextTypeStyle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3619:1: ( ( 'text' ) )
            // InternalQLS.g:3620:1: ( 'text' )
            {
            // InternalQLS.g:3620:1: ( 'text' )
            // InternalQLS.g:3621:2: 'text'
            {
             before(grammarAccess.getTextTypeStyleAccess().getTextKeyword_1()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getTextTypeStyleAccess().getTextKeyword_1()); 

            }


            }

        }
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
    // InternalQLS.g:3630:1: rule__TextTypeStyle__Group__2 : rule__TextTypeStyle__Group__2__Impl rule__TextTypeStyle__Group__3 ;
    public final void rule__TextTypeStyle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3634:1: ( rule__TextTypeStyle__Group__2__Impl rule__TextTypeStyle__Group__3 )
            // InternalQLS.g:3635:2: rule__TextTypeStyle__Group__2__Impl rule__TextTypeStyle__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalQLS.g:3642:1: rule__TextTypeStyle__Group__2__Impl : ( '{' ) ;
    public final void rule__TextTypeStyle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3646:1: ( ( '{' ) )
            // InternalQLS.g:3647:1: ( '{' )
            {
            // InternalQLS.g:3647:1: ( '{' )
            // InternalQLS.g:3648:2: '{'
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
    // InternalQLS.g:3657:1: rule__TextTypeStyle__Group__3 : rule__TextTypeStyle__Group__3__Impl rule__TextTypeStyle__Group__4 ;
    public final void rule__TextTypeStyle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3661:1: ( rule__TextTypeStyle__Group__3__Impl rule__TextTypeStyle__Group__4 )
            // InternalQLS.g:3662:2: rule__TextTypeStyle__Group__3__Impl rule__TextTypeStyle__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalQLS.g:3669:1: rule__TextTypeStyle__Group__3__Impl : ( ( rule__TextTypeStyle__MultilineAssignment_3 )? ) ;
    public final void rule__TextTypeStyle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3673:1: ( ( ( rule__TextTypeStyle__MultilineAssignment_3 )? ) )
            // InternalQLS.g:3674:1: ( ( rule__TextTypeStyle__MultilineAssignment_3 )? )
            {
            // InternalQLS.g:3674:1: ( ( rule__TextTypeStyle__MultilineAssignment_3 )? )
            // InternalQLS.g:3675:2: ( rule__TextTypeStyle__MultilineAssignment_3 )?
            {
             before(grammarAccess.getTextTypeStyleAccess().getMultilineAssignment_3()); 
            // InternalQLS.g:3676:2: ( rule__TextTypeStyle__MultilineAssignment_3 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==85) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalQLS.g:3676:3: rule__TextTypeStyle__MultilineAssignment_3
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
    // InternalQLS.g:3684:1: rule__TextTypeStyle__Group__4 : rule__TextTypeStyle__Group__4__Impl ;
    public final void rule__TextTypeStyle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3688:1: ( rule__TextTypeStyle__Group__4__Impl )
            // InternalQLS.g:3689:2: rule__TextTypeStyle__Group__4__Impl
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
    // InternalQLS.g:3695:1: rule__TextTypeStyle__Group__4__Impl : ( '}' ) ;
    public final void rule__TextTypeStyle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3699:1: ( ( '}' ) )
            // InternalQLS.g:3700:1: ( '}' )
            {
            // InternalQLS.g:3700:1: ( '}' )
            // InternalQLS.g:3701:2: '}'
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
    // InternalQLS.g:3711:1: rule__UnaryExpression__Group__0 : rule__UnaryExpression__Group__0__Impl rule__UnaryExpression__Group__1 ;
    public final void rule__UnaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3715:1: ( rule__UnaryExpression__Group__0__Impl rule__UnaryExpression__Group__1 )
            // InternalQLS.g:3716:2: rule__UnaryExpression__Group__0__Impl rule__UnaryExpression__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalQLS.g:3723:1: rule__UnaryExpression__Group__0__Impl : ( () ) ;
    public final void rule__UnaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3727:1: ( ( () ) )
            // InternalQLS.g:3728:1: ( () )
            {
            // InternalQLS.g:3728:1: ( () )
            // InternalQLS.g:3729:2: ()
            {
             before(grammarAccess.getUnaryExpressionAccess().getBasicUnaryExpressionAction_0()); 
            // InternalQLS.g:3730:2: ()
            // InternalQLS.g:3730:3: 
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
    // InternalQLS.g:3738:1: rule__UnaryExpression__Group__1 : rule__UnaryExpression__Group__1__Impl rule__UnaryExpression__Group__2 ;
    public final void rule__UnaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3742:1: ( rule__UnaryExpression__Group__1__Impl rule__UnaryExpression__Group__2 )
            // InternalQLS.g:3743:2: rule__UnaryExpression__Group__1__Impl rule__UnaryExpression__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalQLS.g:3750:1: rule__UnaryExpression__Group__1__Impl : ( ( rule__UnaryExpression__OperatorAssignment_1 ) ) ;
    public final void rule__UnaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3754:1: ( ( ( rule__UnaryExpression__OperatorAssignment_1 ) ) )
            // InternalQLS.g:3755:1: ( ( rule__UnaryExpression__OperatorAssignment_1 ) )
            {
            // InternalQLS.g:3755:1: ( ( rule__UnaryExpression__OperatorAssignment_1 ) )
            // InternalQLS.g:3756:2: ( rule__UnaryExpression__OperatorAssignment_1 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getOperatorAssignment_1()); 
            // InternalQLS.g:3757:2: ( rule__UnaryExpression__OperatorAssignment_1 )
            // InternalQLS.g:3757:3: rule__UnaryExpression__OperatorAssignment_1
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
    // InternalQLS.g:3765:1: rule__UnaryExpression__Group__2 : rule__UnaryExpression__Group__2__Impl ;
    public final void rule__UnaryExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3769:1: ( rule__UnaryExpression__Group__2__Impl )
            // InternalQLS.g:3770:2: rule__UnaryExpression__Group__2__Impl
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
    // InternalQLS.g:3776:1: rule__UnaryExpression__Group__2__Impl : ( ( rule__UnaryExpression__OperandAssignment_2 ) ) ;
    public final void rule__UnaryExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3780:1: ( ( ( rule__UnaryExpression__OperandAssignment_2 ) ) )
            // InternalQLS.g:3781:1: ( ( rule__UnaryExpression__OperandAssignment_2 ) )
            {
            // InternalQLS.g:3781:1: ( ( rule__UnaryExpression__OperandAssignment_2 ) )
            // InternalQLS.g:3782:2: ( rule__UnaryExpression__OperandAssignment_2 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getOperandAssignment_2()); 
            // InternalQLS.g:3783:2: ( rule__UnaryExpression__OperandAssignment_2 )
            // InternalQLS.g:3783:3: rule__UnaryExpression__OperandAssignment_2
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
    // InternalQLS.g:3792:1: rule__PrimaryExpression__Group_2__0 : rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 ;
    public final void rule__PrimaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3796:1: ( rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 )
            // InternalQLS.g:3797:2: rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalQLS.g:3804:1: rule__PrimaryExpression__Group_2__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3808:1: ( ( '(' ) )
            // InternalQLS.g:3809:1: ( '(' )
            {
            // InternalQLS.g:3809:1: ( '(' )
            // InternalQLS.g:3810:2: '('
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalQLS.g:3819:1: rule__PrimaryExpression__Group_2__1 : rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2 ;
    public final void rule__PrimaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3823:1: ( rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2 )
            // InternalQLS.g:3824:2: rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalQLS.g:3831:1: rule__PrimaryExpression__Group_2__1__Impl : ( ( rule__PrimaryExpression__Alternatives_2_1 ) ) ;
    public final void rule__PrimaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3835:1: ( ( ( rule__PrimaryExpression__Alternatives_2_1 ) ) )
            // InternalQLS.g:3836:1: ( ( rule__PrimaryExpression__Alternatives_2_1 ) )
            {
            // InternalQLS.g:3836:1: ( ( rule__PrimaryExpression__Alternatives_2_1 ) )
            // InternalQLS.g:3837:2: ( rule__PrimaryExpression__Alternatives_2_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives_2_1()); 
            // InternalQLS.g:3838:2: ( rule__PrimaryExpression__Alternatives_2_1 )
            // InternalQLS.g:3838:3: rule__PrimaryExpression__Alternatives_2_1
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
    // InternalQLS.g:3846:1: rule__PrimaryExpression__Group_2__2 : rule__PrimaryExpression__Group_2__2__Impl ;
    public final void rule__PrimaryExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3850:1: ( rule__PrimaryExpression__Group_2__2__Impl )
            // InternalQLS.g:3851:2: rule__PrimaryExpression__Group_2__2__Impl
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
    // InternalQLS.g:3857:1: rule__PrimaryExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3861:1: ( ( ')' ) )
            // InternalQLS.g:3862:1: ( ')' )
            {
            // InternalQLS.g:3862:1: ( ')' )
            // InternalQLS.g:3863:2: ')'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_2()); 
            match(input,59,FOLLOW_2); 
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
    // InternalQLS.g:3873:1: rule__IfExpression__Group__0 : rule__IfExpression__Group__0__Impl rule__IfExpression__Group__1 ;
    public final void rule__IfExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3877:1: ( rule__IfExpression__Group__0__Impl rule__IfExpression__Group__1 )
            // InternalQLS.g:3878:2: rule__IfExpression__Group__0__Impl rule__IfExpression__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalQLS.g:3885:1: rule__IfExpression__Group__0__Impl : ( () ) ;
    public final void rule__IfExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3889:1: ( ( () ) )
            // InternalQLS.g:3890:1: ( () )
            {
            // InternalQLS.g:3890:1: ( () )
            // InternalQLS.g:3891:2: ()
            {
             before(grammarAccess.getIfExpressionAccess().getIfExpressionAction_0()); 
            // InternalQLS.g:3892:2: ()
            // InternalQLS.g:3892:3: 
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
    // InternalQLS.g:3900:1: rule__IfExpression__Group__1 : rule__IfExpression__Group__1__Impl rule__IfExpression__Group__2 ;
    public final void rule__IfExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3904:1: ( rule__IfExpression__Group__1__Impl rule__IfExpression__Group__2 )
            // InternalQLS.g:3905:2: rule__IfExpression__Group__1__Impl rule__IfExpression__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalQLS.g:3912:1: rule__IfExpression__Group__1__Impl : ( 'if' ) ;
    public final void rule__IfExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3916:1: ( ( 'if' ) )
            // InternalQLS.g:3917:1: ( 'if' )
            {
            // InternalQLS.g:3917:1: ( 'if' )
            // InternalQLS.g:3918:2: 'if'
            {
             before(grammarAccess.getIfExpressionAccess().getIfKeyword_1()); 
            match(input,60,FOLLOW_2); 
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
    // InternalQLS.g:3927:1: rule__IfExpression__Group__2 : rule__IfExpression__Group__2__Impl rule__IfExpression__Group__3 ;
    public final void rule__IfExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3931:1: ( rule__IfExpression__Group__2__Impl rule__IfExpression__Group__3 )
            // InternalQLS.g:3932:2: rule__IfExpression__Group__2__Impl rule__IfExpression__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalQLS.g:3939:1: rule__IfExpression__Group__2__Impl : ( ( rule__IfExpression__ConditionAssignment_2 ) ) ;
    public final void rule__IfExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3943:1: ( ( ( rule__IfExpression__ConditionAssignment_2 ) ) )
            // InternalQLS.g:3944:1: ( ( rule__IfExpression__ConditionAssignment_2 ) )
            {
            // InternalQLS.g:3944:1: ( ( rule__IfExpression__ConditionAssignment_2 ) )
            // InternalQLS.g:3945:2: ( rule__IfExpression__ConditionAssignment_2 )
            {
             before(grammarAccess.getIfExpressionAccess().getConditionAssignment_2()); 
            // InternalQLS.g:3946:2: ( rule__IfExpression__ConditionAssignment_2 )
            // InternalQLS.g:3946:3: rule__IfExpression__ConditionAssignment_2
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
    // InternalQLS.g:3954:1: rule__IfExpression__Group__3 : rule__IfExpression__Group__3__Impl rule__IfExpression__Group__4 ;
    public final void rule__IfExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3958:1: ( rule__IfExpression__Group__3__Impl rule__IfExpression__Group__4 )
            // InternalQLS.g:3959:2: rule__IfExpression__Group__3__Impl rule__IfExpression__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalQLS.g:3966:1: rule__IfExpression__Group__3__Impl : ( 'then' ) ;
    public final void rule__IfExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3970:1: ( ( 'then' ) )
            // InternalQLS.g:3971:1: ( 'then' )
            {
            // InternalQLS.g:3971:1: ( 'then' )
            // InternalQLS.g:3972:2: 'then'
            {
             before(grammarAccess.getIfExpressionAccess().getThenKeyword_3()); 
            match(input,61,FOLLOW_2); 
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
    // InternalQLS.g:3981:1: rule__IfExpression__Group__4 : rule__IfExpression__Group__4__Impl rule__IfExpression__Group__5 ;
    public final void rule__IfExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3985:1: ( rule__IfExpression__Group__4__Impl rule__IfExpression__Group__5 )
            // InternalQLS.g:3986:2: rule__IfExpression__Group__4__Impl rule__IfExpression__Group__5
            {
            pushFollow(FOLLOW_34);
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
    // InternalQLS.g:3993:1: rule__IfExpression__Group__4__Impl : ( ( rule__IfExpression__ThenExpressionAssignment_4 ) ) ;
    public final void rule__IfExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:3997:1: ( ( ( rule__IfExpression__ThenExpressionAssignment_4 ) ) )
            // InternalQLS.g:3998:1: ( ( rule__IfExpression__ThenExpressionAssignment_4 ) )
            {
            // InternalQLS.g:3998:1: ( ( rule__IfExpression__ThenExpressionAssignment_4 ) )
            // InternalQLS.g:3999:2: ( rule__IfExpression__ThenExpressionAssignment_4 )
            {
             before(grammarAccess.getIfExpressionAccess().getThenExpressionAssignment_4()); 
            // InternalQLS.g:4000:2: ( rule__IfExpression__ThenExpressionAssignment_4 )
            // InternalQLS.g:4000:3: rule__IfExpression__ThenExpressionAssignment_4
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
    // InternalQLS.g:4008:1: rule__IfExpression__Group__5 : rule__IfExpression__Group__5__Impl rule__IfExpression__Group__6 ;
    public final void rule__IfExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4012:1: ( rule__IfExpression__Group__5__Impl rule__IfExpression__Group__6 )
            // InternalQLS.g:4013:2: rule__IfExpression__Group__5__Impl rule__IfExpression__Group__6
            {
            pushFollow(FOLLOW_34);
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
    // InternalQLS.g:4020:1: rule__IfExpression__Group__5__Impl : ( ( rule__IfExpression__Group_5__0 )? ) ;
    public final void rule__IfExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4024:1: ( ( ( rule__IfExpression__Group_5__0 )? ) )
            // InternalQLS.g:4025:1: ( ( rule__IfExpression__Group_5__0 )? )
            {
            // InternalQLS.g:4025:1: ( ( rule__IfExpression__Group_5__0 )? )
            // InternalQLS.g:4026:2: ( rule__IfExpression__Group_5__0 )?
            {
             before(grammarAccess.getIfExpressionAccess().getGroup_5()); 
            // InternalQLS.g:4027:2: ( rule__IfExpression__Group_5__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==63) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalQLS.g:4027:3: rule__IfExpression__Group_5__0
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
    // InternalQLS.g:4035:1: rule__IfExpression__Group__6 : rule__IfExpression__Group__6__Impl ;
    public final void rule__IfExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4039:1: ( rule__IfExpression__Group__6__Impl )
            // InternalQLS.g:4040:2: rule__IfExpression__Group__6__Impl
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
    // InternalQLS.g:4046:1: rule__IfExpression__Group__6__Impl : ( 'endif' ) ;
    public final void rule__IfExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4050:1: ( ( 'endif' ) )
            // InternalQLS.g:4051:1: ( 'endif' )
            {
            // InternalQLS.g:4051:1: ( 'endif' )
            // InternalQLS.g:4052:2: 'endif'
            {
             before(grammarAccess.getIfExpressionAccess().getEndifKeyword_6()); 
            match(input,62,FOLLOW_2); 
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
    // InternalQLS.g:4062:1: rule__IfExpression__Group_5__0 : rule__IfExpression__Group_5__0__Impl rule__IfExpression__Group_5__1 ;
    public final void rule__IfExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4066:1: ( rule__IfExpression__Group_5__0__Impl rule__IfExpression__Group_5__1 )
            // InternalQLS.g:4067:2: rule__IfExpression__Group_5__0__Impl rule__IfExpression__Group_5__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalQLS.g:4074:1: rule__IfExpression__Group_5__0__Impl : ( 'else' ) ;
    public final void rule__IfExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4078:1: ( ( 'else' ) )
            // InternalQLS.g:4079:1: ( 'else' )
            {
            // InternalQLS.g:4079:1: ( 'else' )
            // InternalQLS.g:4080:2: 'else'
            {
             before(grammarAccess.getIfExpressionAccess().getElseKeyword_5_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalQLS.g:4089:1: rule__IfExpression__Group_5__1 : rule__IfExpression__Group_5__1__Impl ;
    public final void rule__IfExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4093:1: ( rule__IfExpression__Group_5__1__Impl )
            // InternalQLS.g:4094:2: rule__IfExpression__Group_5__1__Impl
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
    // InternalQLS.g:4100:1: rule__IfExpression__Group_5__1__Impl : ( ( rule__IfExpression__ElseExpressionAssignment_5_1 ) ) ;
    public final void rule__IfExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4104:1: ( ( ( rule__IfExpression__ElseExpressionAssignment_5_1 ) ) )
            // InternalQLS.g:4105:1: ( ( rule__IfExpression__ElseExpressionAssignment_5_1 ) )
            {
            // InternalQLS.g:4105:1: ( ( rule__IfExpression__ElseExpressionAssignment_5_1 ) )
            // InternalQLS.g:4106:2: ( rule__IfExpression__ElseExpressionAssignment_5_1 )
            {
             before(grammarAccess.getIfExpressionAccess().getElseExpressionAssignment_5_1()); 
            // InternalQLS.g:4107:2: ( rule__IfExpression__ElseExpressionAssignment_5_1 )
            // InternalQLS.g:4107:3: rule__IfExpression__ElseExpressionAssignment_5_1
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
    // InternalQLS.g:4116:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4120:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // InternalQLS.g:4121:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalQLS.g:4128:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4132:1: ( ( ruleAndExpression ) )
            // InternalQLS.g:4133:1: ( ruleAndExpression )
            {
            // InternalQLS.g:4133:1: ( ruleAndExpression )
            // InternalQLS.g:4134:2: ruleAndExpression
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
    // InternalQLS.g:4143:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4147:1: ( rule__OrExpression__Group__1__Impl )
            // InternalQLS.g:4148:2: rule__OrExpression__Group__1__Impl
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
    // InternalQLS.g:4154:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4158:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // InternalQLS.g:4159:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // InternalQLS.g:4159:1: ( ( rule__OrExpression__Group_1__0 )* )
            // InternalQLS.g:4160:2: ( rule__OrExpression__Group_1__0 )*
            {
             before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            // InternalQLS.g:4161:2: ( rule__OrExpression__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==14) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalQLS.g:4161:3: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalQLS.g:4170:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4174:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // InternalQLS.g:4175:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalQLS.g:4182:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4186:1: ( ( () ) )
            // InternalQLS.g:4187:1: ( () )
            {
            // InternalQLS.g:4187:1: ( () )
            // InternalQLS.g:4188:2: ()
            {
             before(grammarAccess.getOrExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0()); 
            // InternalQLS.g:4189:2: ()
            // InternalQLS.g:4189:3: 
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
    // InternalQLS.g:4197:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4201:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // InternalQLS.g:4202:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalQLS.g:4209:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4213:1: ( ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) )
            // InternalQLS.g:4214:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            {
            // InternalQLS.g:4214:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            // InternalQLS.g:4215:2: ( rule__OrExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalQLS.g:4216:2: ( rule__OrExpression__OperatorAssignment_1_1 )
            // InternalQLS.g:4216:3: rule__OrExpression__OperatorAssignment_1_1
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
    // InternalQLS.g:4224:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4228:1: ( rule__OrExpression__Group_1__2__Impl )
            // InternalQLS.g:4229:2: rule__OrExpression__Group_1__2__Impl
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
    // InternalQLS.g:4235:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__RhsOperandAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4239:1: ( ( ( rule__OrExpression__RhsOperandAssignment_1_2 ) ) )
            // InternalQLS.g:4240:1: ( ( rule__OrExpression__RhsOperandAssignment_1_2 ) )
            {
            // InternalQLS.g:4240:1: ( ( rule__OrExpression__RhsOperandAssignment_1_2 ) )
            // InternalQLS.g:4241:2: ( rule__OrExpression__RhsOperandAssignment_1_2 )
            {
             before(grammarAccess.getOrExpressionAccess().getRhsOperandAssignment_1_2()); 
            // InternalQLS.g:4242:2: ( rule__OrExpression__RhsOperandAssignment_1_2 )
            // InternalQLS.g:4242:3: rule__OrExpression__RhsOperandAssignment_1_2
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
    // InternalQLS.g:4251:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4255:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalQLS.g:4256:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalQLS.g:4263:1: rule__AndExpression__Group__0__Impl : ( ruleEqualExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4267:1: ( ( ruleEqualExpression ) )
            // InternalQLS.g:4268:1: ( ruleEqualExpression )
            {
            // InternalQLS.g:4268:1: ( ruleEqualExpression )
            // InternalQLS.g:4269:2: ruleEqualExpression
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
    // InternalQLS.g:4278:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4282:1: ( rule__AndExpression__Group__1__Impl )
            // InternalQLS.g:4283:2: rule__AndExpression__Group__1__Impl
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
    // InternalQLS.g:4289:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4293:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalQLS.g:4294:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalQLS.g:4294:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalQLS.g:4295:2: ( rule__AndExpression__Group_1__0 )*
            {
             before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            // InternalQLS.g:4296:2: ( rule__AndExpression__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==13) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalQLS.g:4296:3: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalQLS.g:4305:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4309:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalQLS.g:4310:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalQLS.g:4317:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4321:1: ( ( () ) )
            // InternalQLS.g:4322:1: ( () )
            {
            // InternalQLS.g:4322:1: ( () )
            // InternalQLS.g:4323:2: ()
            {
             before(grammarAccess.getAndExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0()); 
            // InternalQLS.g:4324:2: ()
            // InternalQLS.g:4324:3: 
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
    // InternalQLS.g:4332:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4336:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // InternalQLS.g:4337:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalQLS.g:4344:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4348:1: ( ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) )
            // InternalQLS.g:4349:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            {
            // InternalQLS.g:4349:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            // InternalQLS.g:4350:2: ( rule__AndExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalQLS.g:4351:2: ( rule__AndExpression__OperatorAssignment_1_1 )
            // InternalQLS.g:4351:3: rule__AndExpression__OperatorAssignment_1_1
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
    // InternalQLS.g:4359:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4363:1: ( rule__AndExpression__Group_1__2__Impl )
            // InternalQLS.g:4364:2: rule__AndExpression__Group_1__2__Impl
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
    // InternalQLS.g:4370:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__RhsOperandAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4374:1: ( ( ( rule__AndExpression__RhsOperandAssignment_1_2 ) ) )
            // InternalQLS.g:4375:1: ( ( rule__AndExpression__RhsOperandAssignment_1_2 ) )
            {
            // InternalQLS.g:4375:1: ( ( rule__AndExpression__RhsOperandAssignment_1_2 ) )
            // InternalQLS.g:4376:2: ( rule__AndExpression__RhsOperandAssignment_1_2 )
            {
             before(grammarAccess.getAndExpressionAccess().getRhsOperandAssignment_1_2()); 
            // InternalQLS.g:4377:2: ( rule__AndExpression__RhsOperandAssignment_1_2 )
            // InternalQLS.g:4377:3: rule__AndExpression__RhsOperandAssignment_1_2
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
    // InternalQLS.g:4386:1: rule__EqualExpression__Group__0 : rule__EqualExpression__Group__0__Impl rule__EqualExpression__Group__1 ;
    public final void rule__EqualExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4390:1: ( rule__EqualExpression__Group__0__Impl rule__EqualExpression__Group__1 )
            // InternalQLS.g:4391:2: rule__EqualExpression__Group__0__Impl rule__EqualExpression__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalQLS.g:4398:1: rule__EqualExpression__Group__0__Impl : ( ruleComparisionExpression ) ;
    public final void rule__EqualExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4402:1: ( ( ruleComparisionExpression ) )
            // InternalQLS.g:4403:1: ( ruleComparisionExpression )
            {
            // InternalQLS.g:4403:1: ( ruleComparisionExpression )
            // InternalQLS.g:4404:2: ruleComparisionExpression
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
    // InternalQLS.g:4413:1: rule__EqualExpression__Group__1 : rule__EqualExpression__Group__1__Impl ;
    public final void rule__EqualExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4417:1: ( rule__EqualExpression__Group__1__Impl )
            // InternalQLS.g:4418:2: rule__EqualExpression__Group__1__Impl
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
    // InternalQLS.g:4424:1: rule__EqualExpression__Group__1__Impl : ( ( rule__EqualExpression__Group_1__0 )* ) ;
    public final void rule__EqualExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4428:1: ( ( ( rule__EqualExpression__Group_1__0 )* ) )
            // InternalQLS.g:4429:1: ( ( rule__EqualExpression__Group_1__0 )* )
            {
            // InternalQLS.g:4429:1: ( ( rule__EqualExpression__Group_1__0 )* )
            // InternalQLS.g:4430:2: ( rule__EqualExpression__Group_1__0 )*
            {
             before(grammarAccess.getEqualExpressionAccess().getGroup_1()); 
            // InternalQLS.g:4431:2: ( rule__EqualExpression__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==12) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalQLS.g:4431:3: rule__EqualExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__EqualExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalQLS.g:4440:1: rule__EqualExpression__Group_1__0 : rule__EqualExpression__Group_1__0__Impl rule__EqualExpression__Group_1__1 ;
    public final void rule__EqualExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4444:1: ( rule__EqualExpression__Group_1__0__Impl rule__EqualExpression__Group_1__1 )
            // InternalQLS.g:4445:2: rule__EqualExpression__Group_1__0__Impl rule__EqualExpression__Group_1__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalQLS.g:4452:1: rule__EqualExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__EqualExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4456:1: ( ( () ) )
            // InternalQLS.g:4457:1: ( () )
            {
            // InternalQLS.g:4457:1: ( () )
            // InternalQLS.g:4458:2: ()
            {
             before(grammarAccess.getEqualExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0()); 
            // InternalQLS.g:4459:2: ()
            // InternalQLS.g:4459:3: 
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
    // InternalQLS.g:4467:1: rule__EqualExpression__Group_1__1 : rule__EqualExpression__Group_1__1__Impl rule__EqualExpression__Group_1__2 ;
    public final void rule__EqualExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4471:1: ( rule__EqualExpression__Group_1__1__Impl rule__EqualExpression__Group_1__2 )
            // InternalQLS.g:4472:2: rule__EqualExpression__Group_1__1__Impl rule__EqualExpression__Group_1__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalQLS.g:4479:1: rule__EqualExpression__Group_1__1__Impl : ( ( rule__EqualExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__EqualExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4483:1: ( ( ( rule__EqualExpression__OperatorAssignment_1_1 ) ) )
            // InternalQLS.g:4484:1: ( ( rule__EqualExpression__OperatorAssignment_1_1 ) )
            {
            // InternalQLS.g:4484:1: ( ( rule__EqualExpression__OperatorAssignment_1_1 ) )
            // InternalQLS.g:4485:2: ( rule__EqualExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getEqualExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalQLS.g:4486:2: ( rule__EqualExpression__OperatorAssignment_1_1 )
            // InternalQLS.g:4486:3: rule__EqualExpression__OperatorAssignment_1_1
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
    // InternalQLS.g:4494:1: rule__EqualExpression__Group_1__2 : rule__EqualExpression__Group_1__2__Impl ;
    public final void rule__EqualExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4498:1: ( rule__EqualExpression__Group_1__2__Impl )
            // InternalQLS.g:4499:2: rule__EqualExpression__Group_1__2__Impl
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
    // InternalQLS.g:4505:1: rule__EqualExpression__Group_1__2__Impl : ( ( rule__EqualExpression__RhsOperandAssignment_1_2 ) ) ;
    public final void rule__EqualExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4509:1: ( ( ( rule__EqualExpression__RhsOperandAssignment_1_2 ) ) )
            // InternalQLS.g:4510:1: ( ( rule__EqualExpression__RhsOperandAssignment_1_2 ) )
            {
            // InternalQLS.g:4510:1: ( ( rule__EqualExpression__RhsOperandAssignment_1_2 ) )
            // InternalQLS.g:4511:2: ( rule__EqualExpression__RhsOperandAssignment_1_2 )
            {
             before(grammarAccess.getEqualExpressionAccess().getRhsOperandAssignment_1_2()); 
            // InternalQLS.g:4512:2: ( rule__EqualExpression__RhsOperandAssignment_1_2 )
            // InternalQLS.g:4512:3: rule__EqualExpression__RhsOperandAssignment_1_2
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
    // InternalQLS.g:4521:1: rule__ComparisionExpression__Group__0 : rule__ComparisionExpression__Group__0__Impl rule__ComparisionExpression__Group__1 ;
    public final void rule__ComparisionExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4525:1: ( rule__ComparisionExpression__Group__0__Impl rule__ComparisionExpression__Group__1 )
            // InternalQLS.g:4526:2: rule__ComparisionExpression__Group__0__Impl rule__ComparisionExpression__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalQLS.g:4533:1: rule__ComparisionExpression__Group__0__Impl : ( ruleAdditionExpression ) ;
    public final void rule__ComparisionExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4537:1: ( ( ruleAdditionExpression ) )
            // InternalQLS.g:4538:1: ( ruleAdditionExpression )
            {
            // InternalQLS.g:4538:1: ( ruleAdditionExpression )
            // InternalQLS.g:4539:2: ruleAdditionExpression
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
    // InternalQLS.g:4548:1: rule__ComparisionExpression__Group__1 : rule__ComparisionExpression__Group__1__Impl ;
    public final void rule__ComparisionExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4552:1: ( rule__ComparisionExpression__Group__1__Impl )
            // InternalQLS.g:4553:2: rule__ComparisionExpression__Group__1__Impl
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
    // InternalQLS.g:4559:1: rule__ComparisionExpression__Group__1__Impl : ( ( rule__ComparisionExpression__Group_1__0 )* ) ;
    public final void rule__ComparisionExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4563:1: ( ( ( rule__ComparisionExpression__Group_1__0 )* ) )
            // InternalQLS.g:4564:1: ( ( rule__ComparisionExpression__Group_1__0 )* )
            {
            // InternalQLS.g:4564:1: ( ( rule__ComparisionExpression__Group_1__0 )* )
            // InternalQLS.g:4565:2: ( rule__ComparisionExpression__Group_1__0 )*
            {
             before(grammarAccess.getComparisionExpressionAccess().getGroup_1()); 
            // InternalQLS.g:4566:2: ( rule__ComparisionExpression__Group_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=39 && LA36_0<=42)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalQLS.g:4566:3: rule__ComparisionExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__ComparisionExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalQLS.g:4575:1: rule__ComparisionExpression__Group_1__0 : rule__ComparisionExpression__Group_1__0__Impl rule__ComparisionExpression__Group_1__1 ;
    public final void rule__ComparisionExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4579:1: ( rule__ComparisionExpression__Group_1__0__Impl rule__ComparisionExpression__Group_1__1 )
            // InternalQLS.g:4580:2: rule__ComparisionExpression__Group_1__0__Impl rule__ComparisionExpression__Group_1__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalQLS.g:4587:1: rule__ComparisionExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ComparisionExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4591:1: ( ( () ) )
            // InternalQLS.g:4592:1: ( () )
            {
            // InternalQLS.g:4592:1: ( () )
            // InternalQLS.g:4593:2: ()
            {
             before(grammarAccess.getComparisionExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0()); 
            // InternalQLS.g:4594:2: ()
            // InternalQLS.g:4594:3: 
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
    // InternalQLS.g:4602:1: rule__ComparisionExpression__Group_1__1 : rule__ComparisionExpression__Group_1__1__Impl rule__ComparisionExpression__Group_1__2 ;
    public final void rule__ComparisionExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4606:1: ( rule__ComparisionExpression__Group_1__1__Impl rule__ComparisionExpression__Group_1__2 )
            // InternalQLS.g:4607:2: rule__ComparisionExpression__Group_1__1__Impl rule__ComparisionExpression__Group_1__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalQLS.g:4614:1: rule__ComparisionExpression__Group_1__1__Impl : ( ( rule__ComparisionExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ComparisionExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4618:1: ( ( ( rule__ComparisionExpression__OperatorAssignment_1_1 ) ) )
            // InternalQLS.g:4619:1: ( ( rule__ComparisionExpression__OperatorAssignment_1_1 ) )
            {
            // InternalQLS.g:4619:1: ( ( rule__ComparisionExpression__OperatorAssignment_1_1 ) )
            // InternalQLS.g:4620:2: ( rule__ComparisionExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getComparisionExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalQLS.g:4621:2: ( rule__ComparisionExpression__OperatorAssignment_1_1 )
            // InternalQLS.g:4621:3: rule__ComparisionExpression__OperatorAssignment_1_1
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
    // InternalQLS.g:4629:1: rule__ComparisionExpression__Group_1__2 : rule__ComparisionExpression__Group_1__2__Impl ;
    public final void rule__ComparisionExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4633:1: ( rule__ComparisionExpression__Group_1__2__Impl )
            // InternalQLS.g:4634:2: rule__ComparisionExpression__Group_1__2__Impl
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
    // InternalQLS.g:4640:1: rule__ComparisionExpression__Group_1__2__Impl : ( ( rule__ComparisionExpression__RhsOperandAssignment_1_2 ) ) ;
    public final void rule__ComparisionExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4644:1: ( ( ( rule__ComparisionExpression__RhsOperandAssignment_1_2 ) ) )
            // InternalQLS.g:4645:1: ( ( rule__ComparisionExpression__RhsOperandAssignment_1_2 ) )
            {
            // InternalQLS.g:4645:1: ( ( rule__ComparisionExpression__RhsOperandAssignment_1_2 ) )
            // InternalQLS.g:4646:2: ( rule__ComparisionExpression__RhsOperandAssignment_1_2 )
            {
             before(grammarAccess.getComparisionExpressionAccess().getRhsOperandAssignment_1_2()); 
            // InternalQLS.g:4647:2: ( rule__ComparisionExpression__RhsOperandAssignment_1_2 )
            // InternalQLS.g:4647:3: rule__ComparisionExpression__RhsOperandAssignment_1_2
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
    // InternalQLS.g:4656:1: rule__AdditionExpression__Group__0 : rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1 ;
    public final void rule__AdditionExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4660:1: ( rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1 )
            // InternalQLS.g:4661:2: rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalQLS.g:4668:1: rule__AdditionExpression__Group__0__Impl : ( ruleMultiplicationExpression ) ;
    public final void rule__AdditionExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4672:1: ( ( ruleMultiplicationExpression ) )
            // InternalQLS.g:4673:1: ( ruleMultiplicationExpression )
            {
            // InternalQLS.g:4673:1: ( ruleMultiplicationExpression )
            // InternalQLS.g:4674:2: ruleMultiplicationExpression
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
    // InternalQLS.g:4683:1: rule__AdditionExpression__Group__1 : rule__AdditionExpression__Group__1__Impl ;
    public final void rule__AdditionExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4687:1: ( rule__AdditionExpression__Group__1__Impl )
            // InternalQLS.g:4688:2: rule__AdditionExpression__Group__1__Impl
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
    // InternalQLS.g:4694:1: rule__AdditionExpression__Group__1__Impl : ( ( rule__AdditionExpression__Group_1__0 )* ) ;
    public final void rule__AdditionExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4698:1: ( ( ( rule__AdditionExpression__Group_1__0 )* ) )
            // InternalQLS.g:4699:1: ( ( rule__AdditionExpression__Group_1__0 )* )
            {
            // InternalQLS.g:4699:1: ( ( rule__AdditionExpression__Group_1__0 )* )
            // InternalQLS.g:4700:2: ( rule__AdditionExpression__Group_1__0 )*
            {
             before(grammarAccess.getAdditionExpressionAccess().getGroup_1()); 
            // InternalQLS.g:4701:2: ( rule__AdditionExpression__Group_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==34||LA37_0==36) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalQLS.g:4701:3: rule__AdditionExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__AdditionExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalQLS.g:4710:1: rule__AdditionExpression__Group_1__0 : rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1 ;
    public final void rule__AdditionExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4714:1: ( rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1 )
            // InternalQLS.g:4715:2: rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalQLS.g:4722:1: rule__AdditionExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AdditionExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4726:1: ( ( () ) )
            // InternalQLS.g:4727:1: ( () )
            {
            // InternalQLS.g:4727:1: ( () )
            // InternalQLS.g:4728:2: ()
            {
             before(grammarAccess.getAdditionExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0()); 
            // InternalQLS.g:4729:2: ()
            // InternalQLS.g:4729:3: 
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
    // InternalQLS.g:4737:1: rule__AdditionExpression__Group_1__1 : rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2 ;
    public final void rule__AdditionExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4741:1: ( rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2 )
            // InternalQLS.g:4742:2: rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalQLS.g:4749:1: rule__AdditionExpression__Group_1__1__Impl : ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AdditionExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4753:1: ( ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) ) )
            // InternalQLS.g:4754:1: ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) )
            {
            // InternalQLS.g:4754:1: ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) )
            // InternalQLS.g:4755:2: ( rule__AdditionExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditionExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalQLS.g:4756:2: ( rule__AdditionExpression__OperatorAssignment_1_1 )
            // InternalQLS.g:4756:3: rule__AdditionExpression__OperatorAssignment_1_1
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
    // InternalQLS.g:4764:1: rule__AdditionExpression__Group_1__2 : rule__AdditionExpression__Group_1__2__Impl ;
    public final void rule__AdditionExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4768:1: ( rule__AdditionExpression__Group_1__2__Impl )
            // InternalQLS.g:4769:2: rule__AdditionExpression__Group_1__2__Impl
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
    // InternalQLS.g:4775:1: rule__AdditionExpression__Group_1__2__Impl : ( ( rule__AdditionExpression__RhsOperandAssignment_1_2 ) ) ;
    public final void rule__AdditionExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4779:1: ( ( ( rule__AdditionExpression__RhsOperandAssignment_1_2 ) ) )
            // InternalQLS.g:4780:1: ( ( rule__AdditionExpression__RhsOperandAssignment_1_2 ) )
            {
            // InternalQLS.g:4780:1: ( ( rule__AdditionExpression__RhsOperandAssignment_1_2 ) )
            // InternalQLS.g:4781:2: ( rule__AdditionExpression__RhsOperandAssignment_1_2 )
            {
             before(grammarAccess.getAdditionExpressionAccess().getRhsOperandAssignment_1_2()); 
            // InternalQLS.g:4782:2: ( rule__AdditionExpression__RhsOperandAssignment_1_2 )
            // InternalQLS.g:4782:3: rule__AdditionExpression__RhsOperandAssignment_1_2
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
    // InternalQLS.g:4791:1: rule__MultiplicationExpression__Group__0 : rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1 ;
    public final void rule__MultiplicationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4795:1: ( rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1 )
            // InternalQLS.g:4796:2: rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalQLS.g:4803:1: rule__MultiplicationExpression__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__MultiplicationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4807:1: ( ( rulePrimaryExpression ) )
            // InternalQLS.g:4808:1: ( rulePrimaryExpression )
            {
            // InternalQLS.g:4808:1: ( rulePrimaryExpression )
            // InternalQLS.g:4809:2: rulePrimaryExpression
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
    // InternalQLS.g:4818:1: rule__MultiplicationExpression__Group__1 : rule__MultiplicationExpression__Group__1__Impl ;
    public final void rule__MultiplicationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4822:1: ( rule__MultiplicationExpression__Group__1__Impl )
            // InternalQLS.g:4823:2: rule__MultiplicationExpression__Group__1__Impl
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
    // InternalQLS.g:4829:1: rule__MultiplicationExpression__Group__1__Impl : ( ( rule__MultiplicationExpression__Group_1__0 )* ) ;
    public final void rule__MultiplicationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4833:1: ( ( ( rule__MultiplicationExpression__Group_1__0 )* ) )
            // InternalQLS.g:4834:1: ( ( rule__MultiplicationExpression__Group_1__0 )* )
            {
            // InternalQLS.g:4834:1: ( ( rule__MultiplicationExpression__Group_1__0 )* )
            // InternalQLS.g:4835:2: ( rule__MultiplicationExpression__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getGroup_1()); 
            // InternalQLS.g:4836:2: ( rule__MultiplicationExpression__Group_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=37 && LA38_0<=38)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalQLS.g:4836:3: rule__MultiplicationExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_47);
            	    rule__MultiplicationExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalQLS.g:4845:1: rule__MultiplicationExpression__Group_1__0 : rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1 ;
    public final void rule__MultiplicationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4849:1: ( rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1 )
            // InternalQLS.g:4850:2: rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalQLS.g:4857:1: rule__MultiplicationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultiplicationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4861:1: ( ( () ) )
            // InternalQLS.g:4862:1: ( () )
            {
            // InternalQLS.g:4862:1: ( () )
            // InternalQLS.g:4863:2: ()
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0()); 
            // InternalQLS.g:4864:2: ()
            // InternalQLS.g:4864:3: 
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
    // InternalQLS.g:4872:1: rule__MultiplicationExpression__Group_1__1 : rule__MultiplicationExpression__Group_1__1__Impl rule__MultiplicationExpression__Group_1__2 ;
    public final void rule__MultiplicationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4876:1: ( rule__MultiplicationExpression__Group_1__1__Impl rule__MultiplicationExpression__Group_1__2 )
            // InternalQLS.g:4877:2: rule__MultiplicationExpression__Group_1__1__Impl rule__MultiplicationExpression__Group_1__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalQLS.g:4884:1: rule__MultiplicationExpression__Group_1__1__Impl : ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultiplicationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4888:1: ( ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) ) )
            // InternalQLS.g:4889:1: ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) )
            {
            // InternalQLS.g:4889:1: ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) )
            // InternalQLS.g:4890:2: ( rule__MultiplicationExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalQLS.g:4891:2: ( rule__MultiplicationExpression__OperatorAssignment_1_1 )
            // InternalQLS.g:4891:3: rule__MultiplicationExpression__OperatorAssignment_1_1
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
    // InternalQLS.g:4899:1: rule__MultiplicationExpression__Group_1__2 : rule__MultiplicationExpression__Group_1__2__Impl ;
    public final void rule__MultiplicationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4903:1: ( rule__MultiplicationExpression__Group_1__2__Impl )
            // InternalQLS.g:4904:2: rule__MultiplicationExpression__Group_1__2__Impl
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
    // InternalQLS.g:4910:1: rule__MultiplicationExpression__Group_1__2__Impl : ( ( rule__MultiplicationExpression__RhsOperandAssignment_1_2 ) ) ;
    public final void rule__MultiplicationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4914:1: ( ( ( rule__MultiplicationExpression__RhsOperandAssignment_1_2 ) ) )
            // InternalQLS.g:4915:1: ( ( rule__MultiplicationExpression__RhsOperandAssignment_1_2 ) )
            {
            // InternalQLS.g:4915:1: ( ( rule__MultiplicationExpression__RhsOperandAssignment_1_2 ) )
            // InternalQLS.g:4916:2: ( rule__MultiplicationExpression__RhsOperandAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getRhsOperandAssignment_1_2()); 
            // InternalQLS.g:4917:2: ( rule__MultiplicationExpression__RhsOperandAssignment_1_2 )
            // InternalQLS.g:4917:3: rule__MultiplicationExpression__RhsOperandAssignment_1_2
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
    // InternalQLS.g:4926:1: rule__DefinitionGroup__Group__0 : rule__DefinitionGroup__Group__0__Impl rule__DefinitionGroup__Group__1 ;
    public final void rule__DefinitionGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4930:1: ( rule__DefinitionGroup__Group__0__Impl rule__DefinitionGroup__Group__1 )
            // InternalQLS.g:4931:2: rule__DefinitionGroup__Group__0__Impl rule__DefinitionGroup__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalQLS.g:4938:1: rule__DefinitionGroup__Group__0__Impl : ( () ) ;
    public final void rule__DefinitionGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4942:1: ( ( () ) )
            // InternalQLS.g:4943:1: ( () )
            {
            // InternalQLS.g:4943:1: ( () )
            // InternalQLS.g:4944:2: ()
            {
             before(grammarAccess.getDefinitionGroupAccess().getDefinitionGroupAction_0()); 
            // InternalQLS.g:4945:2: ()
            // InternalQLS.g:4945:3: 
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
    // InternalQLS.g:4953:1: rule__DefinitionGroup__Group__1 : rule__DefinitionGroup__Group__1__Impl rule__DefinitionGroup__Group__2 ;
    public final void rule__DefinitionGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4957:1: ( rule__DefinitionGroup__Group__1__Impl rule__DefinitionGroup__Group__2 )
            // InternalQLS.g:4958:2: rule__DefinitionGroup__Group__1__Impl rule__DefinitionGroup__Group__2
            {
            pushFollow(FOLLOW_48);
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
    // InternalQLS.g:4965:1: rule__DefinitionGroup__Group__1__Impl : ( '{' ) ;
    public final void rule__DefinitionGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4969:1: ( ( '{' ) )
            // InternalQLS.g:4970:1: ( '{' )
            {
            // InternalQLS.g:4970:1: ( '{' )
            // InternalQLS.g:4971:2: '{'
            {
             before(grammarAccess.getDefinitionGroupAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getDefinitionGroupAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalQLS.g:4980:1: rule__DefinitionGroup__Group__2 : rule__DefinitionGroup__Group__2__Impl rule__DefinitionGroup__Group__3 ;
    public final void rule__DefinitionGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4984:1: ( rule__DefinitionGroup__Group__2__Impl rule__DefinitionGroup__Group__3 )
            // InternalQLS.g:4985:2: rule__DefinitionGroup__Group__2__Impl rule__DefinitionGroup__Group__3
            {
            pushFollow(FOLLOW_48);
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
    // InternalQLS.g:4992:1: rule__DefinitionGroup__Group__2__Impl : ( ( rule__DefinitionGroup__Alternatives_2 )* ) ;
    public final void rule__DefinitionGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:4996:1: ( ( ( rule__DefinitionGroup__Alternatives_2 )* ) )
            // InternalQLS.g:4997:1: ( ( rule__DefinitionGroup__Alternatives_2 )* )
            {
            // InternalQLS.g:4997:1: ( ( rule__DefinitionGroup__Alternatives_2 )* )
            // InternalQLS.g:4998:2: ( rule__DefinitionGroup__Alternatives_2 )*
            {
             before(grammarAccess.getDefinitionGroupAccess().getAlternatives_2()); 
            // InternalQLS.g:4999:2: ( rule__DefinitionGroup__Alternatives_2 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==64||(LA39_0>=66 && LA39_0<=67)||(LA39_0>=70 && LA39_0<=72)||LA39_0==75||LA39_0==79||LA39_0==86) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalQLS.g:4999:3: rule__DefinitionGroup__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_49);
            	    rule__DefinitionGroup__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getDefinitionGroupAccess().getAlternatives_2()); 

            }


            }

        }
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
    // InternalQLS.g:5007:1: rule__DefinitionGroup__Group__3 : rule__DefinitionGroup__Group__3__Impl ;
    public final void rule__DefinitionGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5011:1: ( rule__DefinitionGroup__Group__3__Impl )
            // InternalQLS.g:5012:2: rule__DefinitionGroup__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefinitionGroup__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalQLS.g:5018:1: rule__DefinitionGroup__Group__3__Impl : ( '}' ) ;
    public final void rule__DefinitionGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5022:1: ( ( '}' ) )
            // InternalQLS.g:5023:1: ( '}' )
            {
            // InternalQLS.g:5023:1: ( '}' )
            // InternalQLS.g:5024:2: '}'
            {
             before(grammarAccess.getDefinitionGroupAccess().getRightCurlyBracketKeyword_3()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getDefinitionGroupAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__QuestionGroup__Group__0"
    // InternalQLS.g:5034:1: rule__QuestionGroup__Group__0 : rule__QuestionGroup__Group__0__Impl rule__QuestionGroup__Group__1 ;
    public final void rule__QuestionGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5038:1: ( rule__QuestionGroup__Group__0__Impl rule__QuestionGroup__Group__1 )
            // InternalQLS.g:5039:2: rule__QuestionGroup__Group__0__Impl rule__QuestionGroup__Group__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalQLS.g:5046:1: rule__QuestionGroup__Group__0__Impl : ( () ) ;
    public final void rule__QuestionGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5050:1: ( ( () ) )
            // InternalQLS.g:5051:1: ( () )
            {
            // InternalQLS.g:5051:1: ( () )
            // InternalQLS.g:5052:2: ()
            {
             before(grammarAccess.getQuestionGroupAccess().getQuestionGroupAction_0()); 
            // InternalQLS.g:5053:2: ()
            // InternalQLS.g:5053:3: 
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
    // InternalQLS.g:5061:1: rule__QuestionGroup__Group__1 : rule__QuestionGroup__Group__1__Impl rule__QuestionGroup__Group__2 ;
    public final void rule__QuestionGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5065:1: ( rule__QuestionGroup__Group__1__Impl rule__QuestionGroup__Group__2 )
            // InternalQLS.g:5066:2: rule__QuestionGroup__Group__1__Impl rule__QuestionGroup__Group__2
            {
            pushFollow(FOLLOW_50);
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
    // InternalQLS.g:5073:1: rule__QuestionGroup__Group__1__Impl : ( ( rule__QuestionGroup__Group_1__0 )? ) ;
    public final void rule__QuestionGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5077:1: ( ( ( rule__QuestionGroup__Group_1__0 )? ) )
            // InternalQLS.g:5078:1: ( ( rule__QuestionGroup__Group_1__0 )? )
            {
            // InternalQLS.g:5078:1: ( ( rule__QuestionGroup__Group_1__0 )? )
            // InternalQLS.g:5079:2: ( rule__QuestionGroup__Group_1__0 )?
            {
             before(grammarAccess.getQuestionGroupAccess().getGroup_1()); 
            // InternalQLS.g:5080:2: ( rule__QuestionGroup__Group_1__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==60) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalQLS.g:5080:3: rule__QuestionGroup__Group_1__0
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
    // InternalQLS.g:5088:1: rule__QuestionGroup__Group__2 : rule__QuestionGroup__Group__2__Impl rule__QuestionGroup__Group__3 ;
    public final void rule__QuestionGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5092:1: ( rule__QuestionGroup__Group__2__Impl rule__QuestionGroup__Group__3 )
            // InternalQLS.g:5093:2: rule__QuestionGroup__Group__2__Impl rule__QuestionGroup__Group__3
            {
            pushFollow(FOLLOW_51);
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
    // InternalQLS.g:5100:1: rule__QuestionGroup__Group__2__Impl : ( '{' ) ;
    public final void rule__QuestionGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5104:1: ( ( '{' ) )
            // InternalQLS.g:5105:1: ( '{' )
            {
            // InternalQLS.g:5105:1: ( '{' )
            // InternalQLS.g:5106:2: '{'
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
    // InternalQLS.g:5115:1: rule__QuestionGroup__Group__3 : rule__QuestionGroup__Group__3__Impl rule__QuestionGroup__Group__4 ;
    public final void rule__QuestionGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5119:1: ( rule__QuestionGroup__Group__3__Impl rule__QuestionGroup__Group__4 )
            // InternalQLS.g:5120:2: rule__QuestionGroup__Group__3__Impl rule__QuestionGroup__Group__4
            {
            pushFollow(FOLLOW_51);
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
    // InternalQLS.g:5127:1: rule__QuestionGroup__Group__3__Impl : ( ( rule__QuestionGroup__Alternatives_3 )* ) ;
    public final void rule__QuestionGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5131:1: ( ( ( rule__QuestionGroup__Alternatives_3 )* ) )
            // InternalQLS.g:5132:1: ( ( rule__QuestionGroup__Alternatives_3 )* )
            {
            // InternalQLS.g:5132:1: ( ( rule__QuestionGroup__Alternatives_3 )* )
            // InternalQLS.g:5133:2: ( rule__QuestionGroup__Alternatives_3 )*
            {
             before(grammarAccess.getQuestionGroupAccess().getAlternatives_3()); 
            // InternalQLS.g:5134:2: ( rule__QuestionGroup__Alternatives_3 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID||LA41_0==44||LA41_0==60) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalQLS.g:5134:3: rule__QuestionGroup__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_52);
            	    rule__QuestionGroup__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalQLS.g:5142:1: rule__QuestionGroup__Group__4 : rule__QuestionGroup__Group__4__Impl ;
    public final void rule__QuestionGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5146:1: ( rule__QuestionGroup__Group__4__Impl )
            // InternalQLS.g:5147:2: rule__QuestionGroup__Group__4__Impl
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
    // InternalQLS.g:5153:1: rule__QuestionGroup__Group__4__Impl : ( '}' ) ;
    public final void rule__QuestionGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5157:1: ( ( '}' ) )
            // InternalQLS.g:5158:1: ( '}' )
            {
            // InternalQLS.g:5158:1: ( '}' )
            // InternalQLS.g:5159:2: '}'
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
    // InternalQLS.g:5169:1: rule__QuestionGroup__Group_1__0 : rule__QuestionGroup__Group_1__0__Impl rule__QuestionGroup__Group_1__1 ;
    public final void rule__QuestionGroup__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5173:1: ( rule__QuestionGroup__Group_1__0__Impl rule__QuestionGroup__Group_1__1 )
            // InternalQLS.g:5174:2: rule__QuestionGroup__Group_1__0__Impl rule__QuestionGroup__Group_1__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalQLS.g:5181:1: rule__QuestionGroup__Group_1__0__Impl : ( 'if' ) ;
    public final void rule__QuestionGroup__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5185:1: ( ( 'if' ) )
            // InternalQLS.g:5186:1: ( 'if' )
            {
            // InternalQLS.g:5186:1: ( 'if' )
            // InternalQLS.g:5187:2: 'if'
            {
             before(grammarAccess.getQuestionGroupAccess().getIfKeyword_1_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalQLS.g:5196:1: rule__QuestionGroup__Group_1__1 : rule__QuestionGroup__Group_1__1__Impl ;
    public final void rule__QuestionGroup__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5200:1: ( rule__QuestionGroup__Group_1__1__Impl )
            // InternalQLS.g:5201:2: rule__QuestionGroup__Group_1__1__Impl
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
    // InternalQLS.g:5207:1: rule__QuestionGroup__Group_1__1__Impl : ( ( rule__QuestionGroup__GuardAssignment_1_1 ) ) ;
    public final void rule__QuestionGroup__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5211:1: ( ( ( rule__QuestionGroup__GuardAssignment_1_1 ) ) )
            // InternalQLS.g:5212:1: ( ( rule__QuestionGroup__GuardAssignment_1_1 ) )
            {
            // InternalQLS.g:5212:1: ( ( rule__QuestionGroup__GuardAssignment_1_1 ) )
            // InternalQLS.g:5213:2: ( rule__QuestionGroup__GuardAssignment_1_1 )
            {
             before(grammarAccess.getQuestionGroupAccess().getGuardAssignment_1_1()); 
            // InternalQLS.g:5214:2: ( rule__QuestionGroup__GuardAssignment_1_1 )
            // InternalQLS.g:5214:3: rule__QuestionGroup__GuardAssignment_1_1
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
    // InternalQLS.g:5223:1: rule__ValueType_Impl__Group__0 : rule__ValueType_Impl__Group__0__Impl rule__ValueType_Impl__Group__1 ;
    public final void rule__ValueType_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5227:1: ( rule__ValueType_Impl__Group__0__Impl rule__ValueType_Impl__Group__1 )
            // InternalQLS.g:5228:2: rule__ValueType_Impl__Group__0__Impl rule__ValueType_Impl__Group__1
            {
            pushFollow(FOLLOW_53);
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
    // InternalQLS.g:5235:1: rule__ValueType_Impl__Group__0__Impl : ( () ) ;
    public final void rule__ValueType_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5239:1: ( ( () ) )
            // InternalQLS.g:5240:1: ( () )
            {
            // InternalQLS.g:5240:1: ( () )
            // InternalQLS.g:5241:2: ()
            {
             before(grammarAccess.getValueType_ImplAccess().getValueTypeAction_0()); 
            // InternalQLS.g:5242:2: ()
            // InternalQLS.g:5242:3: 
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
    // InternalQLS.g:5250:1: rule__ValueType_Impl__Group__1 : rule__ValueType_Impl__Group__1__Impl rule__ValueType_Impl__Group__2 ;
    public final void rule__ValueType_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5254:1: ( rule__ValueType_Impl__Group__1__Impl rule__ValueType_Impl__Group__2 )
            // InternalQLS.g:5255:2: rule__ValueType_Impl__Group__1__Impl rule__ValueType_Impl__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalQLS.g:5262:1: rule__ValueType_Impl__Group__1__Impl : ( 'ValueType' ) ;
    public final void rule__ValueType_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5266:1: ( ( 'ValueType' ) )
            // InternalQLS.g:5267:1: ( 'ValueType' )
            {
            // InternalQLS.g:5267:1: ( 'ValueType' )
            // InternalQLS.g:5268:2: 'ValueType'
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
    // InternalQLS.g:5277:1: rule__ValueType_Impl__Group__2 : rule__ValueType_Impl__Group__2__Impl rule__ValueType_Impl__Group__3 ;
    public final void rule__ValueType_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5281:1: ( rule__ValueType_Impl__Group__2__Impl rule__ValueType_Impl__Group__3 )
            // InternalQLS.g:5282:2: rule__ValueType_Impl__Group__2__Impl rule__ValueType_Impl__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalQLS.g:5289:1: rule__ValueType_Impl__Group__2__Impl : ( ( rule__ValueType_Impl__NameAssignment_2 ) ) ;
    public final void rule__ValueType_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5293:1: ( ( ( rule__ValueType_Impl__NameAssignment_2 ) ) )
            // InternalQLS.g:5294:1: ( ( rule__ValueType_Impl__NameAssignment_2 ) )
            {
            // InternalQLS.g:5294:1: ( ( rule__ValueType_Impl__NameAssignment_2 ) )
            // InternalQLS.g:5295:2: ( rule__ValueType_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getValueType_ImplAccess().getNameAssignment_2()); 
            // InternalQLS.g:5296:2: ( rule__ValueType_Impl__NameAssignment_2 )
            // InternalQLS.g:5296:3: rule__ValueType_Impl__NameAssignment_2
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
    // InternalQLS.g:5304:1: rule__ValueType_Impl__Group__3 : rule__ValueType_Impl__Group__3__Impl rule__ValueType_Impl__Group__4 ;
    public final void rule__ValueType_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5308:1: ( rule__ValueType_Impl__Group__3__Impl rule__ValueType_Impl__Group__4 )
            // InternalQLS.g:5309:2: rule__ValueType_Impl__Group__3__Impl rule__ValueType_Impl__Group__4
            {
            pushFollow(FOLLOW_54);
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
    // InternalQLS.g:5316:1: rule__ValueType_Impl__Group__3__Impl : ( '{' ) ;
    public final void rule__ValueType_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5320:1: ( ( '{' ) )
            // InternalQLS.g:5321:1: ( '{' )
            {
            // InternalQLS.g:5321:1: ( '{' )
            // InternalQLS.g:5322:2: '{'
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
    // InternalQLS.g:5331:1: rule__ValueType_Impl__Group__4 : rule__ValueType_Impl__Group__4__Impl rule__ValueType_Impl__Group__5 ;
    public final void rule__ValueType_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5335:1: ( rule__ValueType_Impl__Group__4__Impl rule__ValueType_Impl__Group__5 )
            // InternalQLS.g:5336:2: rule__ValueType_Impl__Group__4__Impl rule__ValueType_Impl__Group__5
            {
            pushFollow(FOLLOW_54);
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
    // InternalQLS.g:5343:1: rule__ValueType_Impl__Group__4__Impl : ( ( rule__ValueType_Impl__Group_4__0 )? ) ;
    public final void rule__ValueType_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5347:1: ( ( ( rule__ValueType_Impl__Group_4__0 )? ) )
            // InternalQLS.g:5348:1: ( ( rule__ValueType_Impl__Group_4__0 )? )
            {
            // InternalQLS.g:5348:1: ( ( rule__ValueType_Impl__Group_4__0 )? )
            // InternalQLS.g:5349:2: ( rule__ValueType_Impl__Group_4__0 )?
            {
             before(grammarAccess.getValueType_ImplAccess().getGroup_4()); 
            // InternalQLS.g:5350:2: ( rule__ValueType_Impl__Group_4__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==65) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalQLS.g:5350:3: rule__ValueType_Impl__Group_4__0
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
    // InternalQLS.g:5358:1: rule__ValueType_Impl__Group__5 : rule__ValueType_Impl__Group__5__Impl ;
    public final void rule__ValueType_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5362:1: ( rule__ValueType_Impl__Group__5__Impl )
            // InternalQLS.g:5363:2: rule__ValueType_Impl__Group__5__Impl
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
    // InternalQLS.g:5369:1: rule__ValueType_Impl__Group__5__Impl : ( '}' ) ;
    public final void rule__ValueType_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5373:1: ( ( '}' ) )
            // InternalQLS.g:5374:1: ( '}' )
            {
            // InternalQLS.g:5374:1: ( '}' )
            // InternalQLS.g:5375:2: '}'
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
    // InternalQLS.g:5385:1: rule__ValueType_Impl__Group_4__0 : rule__ValueType_Impl__Group_4__0__Impl rule__ValueType_Impl__Group_4__1 ;
    public final void rule__ValueType_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5389:1: ( rule__ValueType_Impl__Group_4__0__Impl rule__ValueType_Impl__Group_4__1 )
            // InternalQLS.g:5390:2: rule__ValueType_Impl__Group_4__0__Impl rule__ValueType_Impl__Group_4__1
            {
            pushFollow(FOLLOW_55);
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
    // InternalQLS.g:5397:1: rule__ValueType_Impl__Group_4__0__Impl : ( 'unit' ) ;
    public final void rule__ValueType_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5401:1: ( ( 'unit' ) )
            // InternalQLS.g:5402:1: ( 'unit' )
            {
            // InternalQLS.g:5402:1: ( 'unit' )
            // InternalQLS.g:5403:2: 'unit'
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
    // InternalQLS.g:5412:1: rule__ValueType_Impl__Group_4__1 : rule__ValueType_Impl__Group_4__1__Impl ;
    public final void rule__ValueType_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5416:1: ( rule__ValueType_Impl__Group_4__1__Impl )
            // InternalQLS.g:5417:2: rule__ValueType_Impl__Group_4__1__Impl
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
    // InternalQLS.g:5423:1: rule__ValueType_Impl__Group_4__1__Impl : ( ( rule__ValueType_Impl__UnitAssignment_4_1 ) ) ;
    public final void rule__ValueType_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5427:1: ( ( ( rule__ValueType_Impl__UnitAssignment_4_1 ) ) )
            // InternalQLS.g:5428:1: ( ( rule__ValueType_Impl__UnitAssignment_4_1 ) )
            {
            // InternalQLS.g:5428:1: ( ( rule__ValueType_Impl__UnitAssignment_4_1 ) )
            // InternalQLS.g:5429:2: ( rule__ValueType_Impl__UnitAssignment_4_1 )
            {
             before(grammarAccess.getValueType_ImplAccess().getUnitAssignment_4_1()); 
            // InternalQLS.g:5430:2: ( rule__ValueType_Impl__UnitAssignment_4_1 )
            // InternalQLS.g:5430:3: rule__ValueType_Impl__UnitAssignment_4_1
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
    // InternalQLS.g:5439:1: rule__ConstantCall__Group__0 : rule__ConstantCall__Group__0__Impl rule__ConstantCall__Group__1 ;
    public final void rule__ConstantCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5443:1: ( rule__ConstantCall__Group__0__Impl rule__ConstantCall__Group__1 )
            // InternalQLS.g:5444:2: rule__ConstantCall__Group__0__Impl rule__ConstantCall__Group__1
            {
            pushFollow(FOLLOW_56);
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
    // InternalQLS.g:5451:1: rule__ConstantCall__Group__0__Impl : ( () ) ;
    public final void rule__ConstantCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5455:1: ( ( () ) )
            // InternalQLS.g:5456:1: ( () )
            {
            // InternalQLS.g:5456:1: ( () )
            // InternalQLS.g:5457:2: ()
            {
             before(grammarAccess.getConstantCallAccess().getConstantCallAction_0()); 
            // InternalQLS.g:5458:2: ()
            // InternalQLS.g:5458:3: 
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
    // InternalQLS.g:5466:1: rule__ConstantCall__Group__1 : rule__ConstantCall__Group__1__Impl ;
    public final void rule__ConstantCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5470:1: ( rule__ConstantCall__Group__1__Impl )
            // InternalQLS.g:5471:2: rule__ConstantCall__Group__1__Impl
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
    // InternalQLS.g:5477:1: rule__ConstantCall__Group__1__Impl : ( ( rule__ConstantCall__ValueAssignment_1 ) ) ;
    public final void rule__ConstantCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5481:1: ( ( ( rule__ConstantCall__ValueAssignment_1 ) ) )
            // InternalQLS.g:5482:1: ( ( rule__ConstantCall__ValueAssignment_1 ) )
            {
            // InternalQLS.g:5482:1: ( ( rule__ConstantCall__ValueAssignment_1 ) )
            // InternalQLS.g:5483:2: ( rule__ConstantCall__ValueAssignment_1 )
            {
             before(grammarAccess.getConstantCallAccess().getValueAssignment_1()); 
            // InternalQLS.g:5484:2: ( rule__ConstantCall__ValueAssignment_1 )
            // InternalQLS.g:5484:3: rule__ConstantCall__ValueAssignment_1
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
    // InternalQLS.g:5493:1: rule__QuestionCall__Group__0 : rule__QuestionCall__Group__0__Impl rule__QuestionCall__Group__1 ;
    public final void rule__QuestionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5497:1: ( rule__QuestionCall__Group__0__Impl rule__QuestionCall__Group__1 )
            // InternalQLS.g:5498:2: rule__QuestionCall__Group__0__Impl rule__QuestionCall__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalQLS.g:5505:1: rule__QuestionCall__Group__0__Impl : ( () ) ;
    public final void rule__QuestionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5509:1: ( ( () ) )
            // InternalQLS.g:5510:1: ( () )
            {
            // InternalQLS.g:5510:1: ( () )
            // InternalQLS.g:5511:2: ()
            {
             before(grammarAccess.getQuestionCallAccess().getQuestionCallAction_0()); 
            // InternalQLS.g:5512:2: ()
            // InternalQLS.g:5512:3: 
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
    // InternalQLS.g:5520:1: rule__QuestionCall__Group__1 : rule__QuestionCall__Group__1__Impl rule__QuestionCall__Group__2 ;
    public final void rule__QuestionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5524:1: ( rule__QuestionCall__Group__1__Impl rule__QuestionCall__Group__2 )
            // InternalQLS.g:5525:2: rule__QuestionCall__Group__1__Impl rule__QuestionCall__Group__2
            {
            pushFollow(FOLLOW_57);
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
    // InternalQLS.g:5532:1: rule__QuestionCall__Group__1__Impl : ( ( rule__QuestionCall__QuestionAssignment_1 ) ) ;
    public final void rule__QuestionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5536:1: ( ( ( rule__QuestionCall__QuestionAssignment_1 ) ) )
            // InternalQLS.g:5537:1: ( ( rule__QuestionCall__QuestionAssignment_1 ) )
            {
            // InternalQLS.g:5537:1: ( ( rule__QuestionCall__QuestionAssignment_1 ) )
            // InternalQLS.g:5538:2: ( rule__QuestionCall__QuestionAssignment_1 )
            {
             before(grammarAccess.getQuestionCallAccess().getQuestionAssignment_1()); 
            // InternalQLS.g:5539:2: ( rule__QuestionCall__QuestionAssignment_1 )
            // InternalQLS.g:5539:3: rule__QuestionCall__QuestionAssignment_1
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
    // InternalQLS.g:5547:1: rule__QuestionCall__Group__2 : rule__QuestionCall__Group__2__Impl rule__QuestionCall__Group__3 ;
    public final void rule__QuestionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5551:1: ( rule__QuestionCall__Group__2__Impl rule__QuestionCall__Group__3 )
            // InternalQLS.g:5552:2: rule__QuestionCall__Group__2__Impl rule__QuestionCall__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalQLS.g:5559:1: rule__QuestionCall__Group__2__Impl : ( '(' ) ;
    public final void rule__QuestionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5563:1: ( ( '(' ) )
            // InternalQLS.g:5564:1: ( '(' )
            {
            // InternalQLS.g:5564:1: ( '(' )
            // InternalQLS.g:5565:2: '('
            {
             before(grammarAccess.getQuestionCallAccess().getLeftParenthesisKeyword_2()); 
            match(input,58,FOLLOW_2); 
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
    // InternalQLS.g:5574:1: rule__QuestionCall__Group__3 : rule__QuestionCall__Group__3__Impl ;
    public final void rule__QuestionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5578:1: ( rule__QuestionCall__Group__3__Impl )
            // InternalQLS.g:5579:2: rule__QuestionCall__Group__3__Impl
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
    // InternalQLS.g:5585:1: rule__QuestionCall__Group__3__Impl : ( ')' ) ;
    public final void rule__QuestionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5589:1: ( ( ')' ) )
            // InternalQLS.g:5590:1: ( ')' )
            {
            // InternalQLS.g:5590:1: ( ')' )
            // InternalQLS.g:5591:2: ')'
            {
             before(grammarAccess.getQuestionCallAccess().getRightParenthesisKeyword_3()); 
            match(input,59,FOLLOW_2); 
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
    // InternalQLS.g:5601:1: rule__BooleanValueType__Group__0 : rule__BooleanValueType__Group__0__Impl rule__BooleanValueType__Group__1 ;
    public final void rule__BooleanValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5605:1: ( rule__BooleanValueType__Group__0__Impl rule__BooleanValueType__Group__1 )
            // InternalQLS.g:5606:2: rule__BooleanValueType__Group__0__Impl rule__BooleanValueType__Group__1
            {
            pushFollow(FOLLOW_58);
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
    // InternalQLS.g:5613:1: rule__BooleanValueType__Group__0__Impl : ( () ) ;
    public final void rule__BooleanValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5617:1: ( ( () ) )
            // InternalQLS.g:5618:1: ( () )
            {
            // InternalQLS.g:5618:1: ( () )
            // InternalQLS.g:5619:2: ()
            {
             before(grammarAccess.getBooleanValueTypeAccess().getBooleanValueTypeAction_0()); 
            // InternalQLS.g:5620:2: ()
            // InternalQLS.g:5620:3: 
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
    // InternalQLS.g:5628:1: rule__BooleanValueType__Group__1 : rule__BooleanValueType__Group__1__Impl rule__BooleanValueType__Group__2 ;
    public final void rule__BooleanValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5632:1: ( rule__BooleanValueType__Group__1__Impl rule__BooleanValueType__Group__2 )
            // InternalQLS.g:5633:2: rule__BooleanValueType__Group__1__Impl rule__BooleanValueType__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalQLS.g:5640:1: rule__BooleanValueType__Group__1__Impl : ( 'booleanType' ) ;
    public final void rule__BooleanValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5644:1: ( ( 'booleanType' ) )
            // InternalQLS.g:5645:1: ( 'booleanType' )
            {
            // InternalQLS.g:5645:1: ( 'booleanType' )
            // InternalQLS.g:5646:2: 'booleanType'
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
    // InternalQLS.g:5655:1: rule__BooleanValueType__Group__2 : rule__BooleanValueType__Group__2__Impl rule__BooleanValueType__Group__3 ;
    public final void rule__BooleanValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5659:1: ( rule__BooleanValueType__Group__2__Impl rule__BooleanValueType__Group__3 )
            // InternalQLS.g:5660:2: rule__BooleanValueType__Group__2__Impl rule__BooleanValueType__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalQLS.g:5667:1: rule__BooleanValueType__Group__2__Impl : ( ( rule__BooleanValueType__NameAssignment_2 ) ) ;
    public final void rule__BooleanValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5671:1: ( ( ( rule__BooleanValueType__NameAssignment_2 ) ) )
            // InternalQLS.g:5672:1: ( ( rule__BooleanValueType__NameAssignment_2 ) )
            {
            // InternalQLS.g:5672:1: ( ( rule__BooleanValueType__NameAssignment_2 ) )
            // InternalQLS.g:5673:2: ( rule__BooleanValueType__NameAssignment_2 )
            {
             before(grammarAccess.getBooleanValueTypeAccess().getNameAssignment_2()); 
            // InternalQLS.g:5674:2: ( rule__BooleanValueType__NameAssignment_2 )
            // InternalQLS.g:5674:3: rule__BooleanValueType__NameAssignment_2
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
    // InternalQLS.g:5682:1: rule__BooleanValueType__Group__3 : rule__BooleanValueType__Group__3__Impl ;
    public final void rule__BooleanValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5686:1: ( rule__BooleanValueType__Group__3__Impl )
            // InternalQLS.g:5687:2: rule__BooleanValueType__Group__3__Impl
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
    // InternalQLS.g:5693:1: rule__BooleanValueType__Group__3__Impl : ( ( rule__BooleanValueType__Group_3__0 )? ) ;
    public final void rule__BooleanValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5697:1: ( ( ( rule__BooleanValueType__Group_3__0 )? ) )
            // InternalQLS.g:5698:1: ( ( rule__BooleanValueType__Group_3__0 )? )
            {
            // InternalQLS.g:5698:1: ( ( rule__BooleanValueType__Group_3__0 )? )
            // InternalQLS.g:5699:2: ( rule__BooleanValueType__Group_3__0 )?
            {
             before(grammarAccess.getBooleanValueTypeAccess().getGroup_3()); 
            // InternalQLS.g:5700:2: ( rule__BooleanValueType__Group_3__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==44) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalQLS.g:5700:3: rule__BooleanValueType__Group_3__0
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
    // InternalQLS.g:5709:1: rule__BooleanValueType__Group_3__0 : rule__BooleanValueType__Group_3__0__Impl rule__BooleanValueType__Group_3__1 ;
    public final void rule__BooleanValueType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5713:1: ( rule__BooleanValueType__Group_3__0__Impl rule__BooleanValueType__Group_3__1 )
            // InternalQLS.g:5714:2: rule__BooleanValueType__Group_3__0__Impl rule__BooleanValueType__Group_3__1
            {
            pushFollow(FOLLOW_54);
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
    // InternalQLS.g:5721:1: rule__BooleanValueType__Group_3__0__Impl : ( '{' ) ;
    public final void rule__BooleanValueType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5725:1: ( ( '{' ) )
            // InternalQLS.g:5726:1: ( '{' )
            {
            // InternalQLS.g:5726:1: ( '{' )
            // InternalQLS.g:5727:2: '{'
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
    // InternalQLS.g:5736:1: rule__BooleanValueType__Group_3__1 : rule__BooleanValueType__Group_3__1__Impl rule__BooleanValueType__Group_3__2 ;
    public final void rule__BooleanValueType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5740:1: ( rule__BooleanValueType__Group_3__1__Impl rule__BooleanValueType__Group_3__2 )
            // InternalQLS.g:5741:2: rule__BooleanValueType__Group_3__1__Impl rule__BooleanValueType__Group_3__2
            {
            pushFollow(FOLLOW_54);
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
    // InternalQLS.g:5748:1: rule__BooleanValueType__Group_3__1__Impl : ( ( rule__BooleanValueType__Group_3_1__0 )? ) ;
    public final void rule__BooleanValueType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5752:1: ( ( ( rule__BooleanValueType__Group_3_1__0 )? ) )
            // InternalQLS.g:5753:1: ( ( rule__BooleanValueType__Group_3_1__0 )? )
            {
            // InternalQLS.g:5753:1: ( ( rule__BooleanValueType__Group_3_1__0 )? )
            // InternalQLS.g:5754:2: ( rule__BooleanValueType__Group_3_1__0 )?
            {
             before(grammarAccess.getBooleanValueTypeAccess().getGroup_3_1()); 
            // InternalQLS.g:5755:2: ( rule__BooleanValueType__Group_3_1__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==65) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalQLS.g:5755:3: rule__BooleanValueType__Group_3_1__0
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
    // InternalQLS.g:5763:1: rule__BooleanValueType__Group_3__2 : rule__BooleanValueType__Group_3__2__Impl ;
    public final void rule__BooleanValueType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5767:1: ( rule__BooleanValueType__Group_3__2__Impl )
            // InternalQLS.g:5768:2: rule__BooleanValueType__Group_3__2__Impl
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
    // InternalQLS.g:5774:1: rule__BooleanValueType__Group_3__2__Impl : ( '}' ) ;
    public final void rule__BooleanValueType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5778:1: ( ( '}' ) )
            // InternalQLS.g:5779:1: ( '}' )
            {
            // InternalQLS.g:5779:1: ( '}' )
            // InternalQLS.g:5780:2: '}'
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
    // InternalQLS.g:5790:1: rule__BooleanValueType__Group_3_1__0 : rule__BooleanValueType__Group_3_1__0__Impl rule__BooleanValueType__Group_3_1__1 ;
    public final void rule__BooleanValueType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5794:1: ( rule__BooleanValueType__Group_3_1__0__Impl rule__BooleanValueType__Group_3_1__1 )
            // InternalQLS.g:5795:2: rule__BooleanValueType__Group_3_1__0__Impl rule__BooleanValueType__Group_3_1__1
            {
            pushFollow(FOLLOW_55);
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
    // InternalQLS.g:5802:1: rule__BooleanValueType__Group_3_1__0__Impl : ( 'unit' ) ;
    public final void rule__BooleanValueType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5806:1: ( ( 'unit' ) )
            // InternalQLS.g:5807:1: ( 'unit' )
            {
            // InternalQLS.g:5807:1: ( 'unit' )
            // InternalQLS.g:5808:2: 'unit'
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
    // InternalQLS.g:5817:1: rule__BooleanValueType__Group_3_1__1 : rule__BooleanValueType__Group_3_1__1__Impl ;
    public final void rule__BooleanValueType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5821:1: ( rule__BooleanValueType__Group_3_1__1__Impl )
            // InternalQLS.g:5822:2: rule__BooleanValueType__Group_3_1__1__Impl
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
    // InternalQLS.g:5828:1: rule__BooleanValueType__Group_3_1__1__Impl : ( ( rule__BooleanValueType__UnitAssignment_3_1_1 ) ) ;
    public final void rule__BooleanValueType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5832:1: ( ( ( rule__BooleanValueType__UnitAssignment_3_1_1 ) ) )
            // InternalQLS.g:5833:1: ( ( rule__BooleanValueType__UnitAssignment_3_1_1 ) )
            {
            // InternalQLS.g:5833:1: ( ( rule__BooleanValueType__UnitAssignment_3_1_1 ) )
            // InternalQLS.g:5834:2: ( rule__BooleanValueType__UnitAssignment_3_1_1 )
            {
             before(grammarAccess.getBooleanValueTypeAccess().getUnitAssignment_3_1_1()); 
            // InternalQLS.g:5835:2: ( rule__BooleanValueType__UnitAssignment_3_1_1 )
            // InternalQLS.g:5835:3: rule__BooleanValueType__UnitAssignment_3_1_1
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
    // InternalQLS.g:5844:1: rule__IntegerValueType__Group__0 : rule__IntegerValueType__Group__0__Impl rule__IntegerValueType__Group__1 ;
    public final void rule__IntegerValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5848:1: ( rule__IntegerValueType__Group__0__Impl rule__IntegerValueType__Group__1 )
            // InternalQLS.g:5849:2: rule__IntegerValueType__Group__0__Impl rule__IntegerValueType__Group__1
            {
            pushFollow(FOLLOW_59);
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
    // InternalQLS.g:5856:1: rule__IntegerValueType__Group__0__Impl : ( () ) ;
    public final void rule__IntegerValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5860:1: ( ( () ) )
            // InternalQLS.g:5861:1: ( () )
            {
            // InternalQLS.g:5861:1: ( () )
            // InternalQLS.g:5862:2: ()
            {
             before(grammarAccess.getIntegerValueTypeAccess().getIntegerValueTypeAction_0()); 
            // InternalQLS.g:5863:2: ()
            // InternalQLS.g:5863:3: 
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
    // InternalQLS.g:5871:1: rule__IntegerValueType__Group__1 : rule__IntegerValueType__Group__1__Impl rule__IntegerValueType__Group__2 ;
    public final void rule__IntegerValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5875:1: ( rule__IntegerValueType__Group__1__Impl rule__IntegerValueType__Group__2 )
            // InternalQLS.g:5876:2: rule__IntegerValueType__Group__1__Impl rule__IntegerValueType__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalQLS.g:5883:1: rule__IntegerValueType__Group__1__Impl : ( 'integerType' ) ;
    public final void rule__IntegerValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5887:1: ( ( 'integerType' ) )
            // InternalQLS.g:5888:1: ( 'integerType' )
            {
            // InternalQLS.g:5888:1: ( 'integerType' )
            // InternalQLS.g:5889:2: 'integerType'
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
    // InternalQLS.g:5898:1: rule__IntegerValueType__Group__2 : rule__IntegerValueType__Group__2__Impl rule__IntegerValueType__Group__3 ;
    public final void rule__IntegerValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5902:1: ( rule__IntegerValueType__Group__2__Impl rule__IntegerValueType__Group__3 )
            // InternalQLS.g:5903:2: rule__IntegerValueType__Group__2__Impl rule__IntegerValueType__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalQLS.g:5910:1: rule__IntegerValueType__Group__2__Impl : ( ( rule__IntegerValueType__NameAssignment_2 ) ) ;
    public final void rule__IntegerValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5914:1: ( ( ( rule__IntegerValueType__NameAssignment_2 ) ) )
            // InternalQLS.g:5915:1: ( ( rule__IntegerValueType__NameAssignment_2 ) )
            {
            // InternalQLS.g:5915:1: ( ( rule__IntegerValueType__NameAssignment_2 ) )
            // InternalQLS.g:5916:2: ( rule__IntegerValueType__NameAssignment_2 )
            {
             before(grammarAccess.getIntegerValueTypeAccess().getNameAssignment_2()); 
            // InternalQLS.g:5917:2: ( rule__IntegerValueType__NameAssignment_2 )
            // InternalQLS.g:5917:3: rule__IntegerValueType__NameAssignment_2
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
    // InternalQLS.g:5925:1: rule__IntegerValueType__Group__3 : rule__IntegerValueType__Group__3__Impl ;
    public final void rule__IntegerValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5929:1: ( rule__IntegerValueType__Group__3__Impl )
            // InternalQLS.g:5930:2: rule__IntegerValueType__Group__3__Impl
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
    // InternalQLS.g:5936:1: rule__IntegerValueType__Group__3__Impl : ( ( rule__IntegerValueType__Group_3__0 )? ) ;
    public final void rule__IntegerValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5940:1: ( ( ( rule__IntegerValueType__Group_3__0 )? ) )
            // InternalQLS.g:5941:1: ( ( rule__IntegerValueType__Group_3__0 )? )
            {
            // InternalQLS.g:5941:1: ( ( rule__IntegerValueType__Group_3__0 )? )
            // InternalQLS.g:5942:2: ( rule__IntegerValueType__Group_3__0 )?
            {
             before(grammarAccess.getIntegerValueTypeAccess().getGroup_3()); 
            // InternalQLS.g:5943:2: ( rule__IntegerValueType__Group_3__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==44) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalQLS.g:5943:3: rule__IntegerValueType__Group_3__0
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
    // InternalQLS.g:5952:1: rule__IntegerValueType__Group_3__0 : rule__IntegerValueType__Group_3__0__Impl rule__IntegerValueType__Group_3__1 ;
    public final void rule__IntegerValueType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5956:1: ( rule__IntegerValueType__Group_3__0__Impl rule__IntegerValueType__Group_3__1 )
            // InternalQLS.g:5957:2: rule__IntegerValueType__Group_3__0__Impl rule__IntegerValueType__Group_3__1
            {
            pushFollow(FOLLOW_60);
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
    // InternalQLS.g:5964:1: rule__IntegerValueType__Group_3__0__Impl : ( '{' ) ;
    public final void rule__IntegerValueType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5968:1: ( ( '{' ) )
            // InternalQLS.g:5969:1: ( '{' )
            {
            // InternalQLS.g:5969:1: ( '{' )
            // InternalQLS.g:5970:2: '{'
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
    // InternalQLS.g:5979:1: rule__IntegerValueType__Group_3__1 : rule__IntegerValueType__Group_3__1__Impl rule__IntegerValueType__Group_3__2 ;
    public final void rule__IntegerValueType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5983:1: ( rule__IntegerValueType__Group_3__1__Impl rule__IntegerValueType__Group_3__2 )
            // InternalQLS.g:5984:2: rule__IntegerValueType__Group_3__1__Impl rule__IntegerValueType__Group_3__2
            {
            pushFollow(FOLLOW_60);
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
    // InternalQLS.g:5991:1: rule__IntegerValueType__Group_3__1__Impl : ( ( rule__IntegerValueType__Group_3_1__0 )? ) ;
    public final void rule__IntegerValueType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:5995:1: ( ( ( rule__IntegerValueType__Group_3_1__0 )? ) )
            // InternalQLS.g:5996:1: ( ( rule__IntegerValueType__Group_3_1__0 )? )
            {
            // InternalQLS.g:5996:1: ( ( rule__IntegerValueType__Group_3_1__0 )? )
            // InternalQLS.g:5997:2: ( rule__IntegerValueType__Group_3_1__0 )?
            {
             before(grammarAccess.getIntegerValueTypeAccess().getGroup_3_1()); 
            // InternalQLS.g:5998:2: ( rule__IntegerValueType__Group_3_1__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==65) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalQLS.g:5998:3: rule__IntegerValueType__Group_3_1__0
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
    // InternalQLS.g:6006:1: rule__IntegerValueType__Group_3__2 : rule__IntegerValueType__Group_3__2__Impl rule__IntegerValueType__Group_3__3 ;
    public final void rule__IntegerValueType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6010:1: ( rule__IntegerValueType__Group_3__2__Impl rule__IntegerValueType__Group_3__3 )
            // InternalQLS.g:6011:2: rule__IntegerValueType__Group_3__2__Impl rule__IntegerValueType__Group_3__3
            {
            pushFollow(FOLLOW_60);
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
    // InternalQLS.g:6018:1: rule__IntegerValueType__Group_3__2__Impl : ( ( rule__IntegerValueType__Group_3_2__0 )? ) ;
    public final void rule__IntegerValueType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6022:1: ( ( ( rule__IntegerValueType__Group_3_2__0 )? ) )
            // InternalQLS.g:6023:1: ( ( rule__IntegerValueType__Group_3_2__0 )? )
            {
            // InternalQLS.g:6023:1: ( ( rule__IntegerValueType__Group_3_2__0 )? )
            // InternalQLS.g:6024:2: ( rule__IntegerValueType__Group_3_2__0 )?
            {
             before(grammarAccess.getIntegerValueTypeAccess().getGroup_3_2()); 
            // InternalQLS.g:6025:2: ( rule__IntegerValueType__Group_3_2__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==68) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalQLS.g:6025:3: rule__IntegerValueType__Group_3_2__0
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
    // InternalQLS.g:6033:1: rule__IntegerValueType__Group_3__3 : rule__IntegerValueType__Group_3__3__Impl rule__IntegerValueType__Group_3__4 ;
    public final void rule__IntegerValueType__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6037:1: ( rule__IntegerValueType__Group_3__3__Impl rule__IntegerValueType__Group_3__4 )
            // InternalQLS.g:6038:2: rule__IntegerValueType__Group_3__3__Impl rule__IntegerValueType__Group_3__4
            {
            pushFollow(FOLLOW_60);
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
    // InternalQLS.g:6045:1: rule__IntegerValueType__Group_3__3__Impl : ( ( rule__IntegerValueType__Group_3_3__0 )? ) ;
    public final void rule__IntegerValueType__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6049:1: ( ( ( rule__IntegerValueType__Group_3_3__0 )? ) )
            // InternalQLS.g:6050:1: ( ( rule__IntegerValueType__Group_3_3__0 )? )
            {
            // InternalQLS.g:6050:1: ( ( rule__IntegerValueType__Group_3_3__0 )? )
            // InternalQLS.g:6051:2: ( rule__IntegerValueType__Group_3_3__0 )?
            {
             before(grammarAccess.getIntegerValueTypeAccess().getGroup_3_3()); 
            // InternalQLS.g:6052:2: ( rule__IntegerValueType__Group_3_3__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==69) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalQLS.g:6052:3: rule__IntegerValueType__Group_3_3__0
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
    // InternalQLS.g:6060:1: rule__IntegerValueType__Group_3__4 : rule__IntegerValueType__Group_3__4__Impl ;
    public final void rule__IntegerValueType__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6064:1: ( rule__IntegerValueType__Group_3__4__Impl )
            // InternalQLS.g:6065:2: rule__IntegerValueType__Group_3__4__Impl
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
    // InternalQLS.g:6071:1: rule__IntegerValueType__Group_3__4__Impl : ( '}' ) ;
    public final void rule__IntegerValueType__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6075:1: ( ( '}' ) )
            // InternalQLS.g:6076:1: ( '}' )
            {
            // InternalQLS.g:6076:1: ( '}' )
            // InternalQLS.g:6077:2: '}'
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
    // InternalQLS.g:6087:1: rule__IntegerValueType__Group_3_1__0 : rule__IntegerValueType__Group_3_1__0__Impl rule__IntegerValueType__Group_3_1__1 ;
    public final void rule__IntegerValueType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6091:1: ( rule__IntegerValueType__Group_3_1__0__Impl rule__IntegerValueType__Group_3_1__1 )
            // InternalQLS.g:6092:2: rule__IntegerValueType__Group_3_1__0__Impl rule__IntegerValueType__Group_3_1__1
            {
            pushFollow(FOLLOW_55);
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
    // InternalQLS.g:6099:1: rule__IntegerValueType__Group_3_1__0__Impl : ( 'unit' ) ;
    public final void rule__IntegerValueType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6103:1: ( ( 'unit' ) )
            // InternalQLS.g:6104:1: ( 'unit' )
            {
            // InternalQLS.g:6104:1: ( 'unit' )
            // InternalQLS.g:6105:2: 'unit'
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
    // InternalQLS.g:6114:1: rule__IntegerValueType__Group_3_1__1 : rule__IntegerValueType__Group_3_1__1__Impl ;
    public final void rule__IntegerValueType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6118:1: ( rule__IntegerValueType__Group_3_1__1__Impl )
            // InternalQLS.g:6119:2: rule__IntegerValueType__Group_3_1__1__Impl
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
    // InternalQLS.g:6125:1: rule__IntegerValueType__Group_3_1__1__Impl : ( ( rule__IntegerValueType__UnitAssignment_3_1_1 ) ) ;
    public final void rule__IntegerValueType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6129:1: ( ( ( rule__IntegerValueType__UnitAssignment_3_1_1 ) ) )
            // InternalQLS.g:6130:1: ( ( rule__IntegerValueType__UnitAssignment_3_1_1 ) )
            {
            // InternalQLS.g:6130:1: ( ( rule__IntegerValueType__UnitAssignment_3_1_1 ) )
            // InternalQLS.g:6131:2: ( rule__IntegerValueType__UnitAssignment_3_1_1 )
            {
             before(grammarAccess.getIntegerValueTypeAccess().getUnitAssignment_3_1_1()); 
            // InternalQLS.g:6132:2: ( rule__IntegerValueType__UnitAssignment_3_1_1 )
            // InternalQLS.g:6132:3: rule__IntegerValueType__UnitAssignment_3_1_1
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
    // InternalQLS.g:6141:1: rule__IntegerValueType__Group_3_2__0 : rule__IntegerValueType__Group_3_2__0__Impl rule__IntegerValueType__Group_3_2__1 ;
    public final void rule__IntegerValueType__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6145:1: ( rule__IntegerValueType__Group_3_2__0__Impl rule__IntegerValueType__Group_3_2__1 )
            // InternalQLS.g:6146:2: rule__IntegerValueType__Group_3_2__0__Impl rule__IntegerValueType__Group_3_2__1
            {
            pushFollow(FOLLOW_61);
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
    // InternalQLS.g:6153:1: rule__IntegerValueType__Group_3_2__0__Impl : ( 'min' ) ;
    public final void rule__IntegerValueType__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6157:1: ( ( 'min' ) )
            // InternalQLS.g:6158:1: ( 'min' )
            {
            // InternalQLS.g:6158:1: ( 'min' )
            // InternalQLS.g:6159:2: 'min'
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
    // InternalQLS.g:6168:1: rule__IntegerValueType__Group_3_2__1 : rule__IntegerValueType__Group_3_2__1__Impl ;
    public final void rule__IntegerValueType__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6172:1: ( rule__IntegerValueType__Group_3_2__1__Impl )
            // InternalQLS.g:6173:2: rule__IntegerValueType__Group_3_2__1__Impl
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
    // InternalQLS.g:6179:1: rule__IntegerValueType__Group_3_2__1__Impl : ( ( rule__IntegerValueType__MinAssignment_3_2_1 ) ) ;
    public final void rule__IntegerValueType__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6183:1: ( ( ( rule__IntegerValueType__MinAssignment_3_2_1 ) ) )
            // InternalQLS.g:6184:1: ( ( rule__IntegerValueType__MinAssignment_3_2_1 ) )
            {
            // InternalQLS.g:6184:1: ( ( rule__IntegerValueType__MinAssignment_3_2_1 ) )
            // InternalQLS.g:6185:2: ( rule__IntegerValueType__MinAssignment_3_2_1 )
            {
             before(grammarAccess.getIntegerValueTypeAccess().getMinAssignment_3_2_1()); 
            // InternalQLS.g:6186:2: ( rule__IntegerValueType__MinAssignment_3_2_1 )
            // InternalQLS.g:6186:3: rule__IntegerValueType__MinAssignment_3_2_1
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
    // InternalQLS.g:6195:1: rule__IntegerValueType__Group_3_3__0 : rule__IntegerValueType__Group_3_3__0__Impl rule__IntegerValueType__Group_3_3__1 ;
    public final void rule__IntegerValueType__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6199:1: ( rule__IntegerValueType__Group_3_3__0__Impl rule__IntegerValueType__Group_3_3__1 )
            // InternalQLS.g:6200:2: rule__IntegerValueType__Group_3_3__0__Impl rule__IntegerValueType__Group_3_3__1
            {
            pushFollow(FOLLOW_61);
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
    // InternalQLS.g:6207:1: rule__IntegerValueType__Group_3_3__0__Impl : ( 'max' ) ;
    public final void rule__IntegerValueType__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6211:1: ( ( 'max' ) )
            // InternalQLS.g:6212:1: ( 'max' )
            {
            // InternalQLS.g:6212:1: ( 'max' )
            // InternalQLS.g:6213:2: 'max'
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
    // InternalQLS.g:6222:1: rule__IntegerValueType__Group_3_3__1 : rule__IntegerValueType__Group_3_3__1__Impl ;
    public final void rule__IntegerValueType__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6226:1: ( rule__IntegerValueType__Group_3_3__1__Impl )
            // InternalQLS.g:6227:2: rule__IntegerValueType__Group_3_3__1__Impl
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
    // InternalQLS.g:6233:1: rule__IntegerValueType__Group_3_3__1__Impl : ( ( rule__IntegerValueType__MaxAssignment_3_3_1 ) ) ;
    public final void rule__IntegerValueType__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6237:1: ( ( ( rule__IntegerValueType__MaxAssignment_3_3_1 ) ) )
            // InternalQLS.g:6238:1: ( ( rule__IntegerValueType__MaxAssignment_3_3_1 ) )
            {
            // InternalQLS.g:6238:1: ( ( rule__IntegerValueType__MaxAssignment_3_3_1 ) )
            // InternalQLS.g:6239:2: ( rule__IntegerValueType__MaxAssignment_3_3_1 )
            {
             before(grammarAccess.getIntegerValueTypeAccess().getMaxAssignment_3_3_1()); 
            // InternalQLS.g:6240:2: ( rule__IntegerValueType__MaxAssignment_3_3_1 )
            // InternalQLS.g:6240:3: rule__IntegerValueType__MaxAssignment_3_3_1
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
    // InternalQLS.g:6249:1: rule__DecimalValueType__Group__0 : rule__DecimalValueType__Group__0__Impl rule__DecimalValueType__Group__1 ;
    public final void rule__DecimalValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6253:1: ( rule__DecimalValueType__Group__0__Impl rule__DecimalValueType__Group__1 )
            // InternalQLS.g:6254:2: rule__DecimalValueType__Group__0__Impl rule__DecimalValueType__Group__1
            {
            pushFollow(FOLLOW_62);
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
    // InternalQLS.g:6261:1: rule__DecimalValueType__Group__0__Impl : ( () ) ;
    public final void rule__DecimalValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6265:1: ( ( () ) )
            // InternalQLS.g:6266:1: ( () )
            {
            // InternalQLS.g:6266:1: ( () )
            // InternalQLS.g:6267:2: ()
            {
             before(grammarAccess.getDecimalValueTypeAccess().getDecimalValueTypeAction_0()); 
            // InternalQLS.g:6268:2: ()
            // InternalQLS.g:6268:3: 
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
    // InternalQLS.g:6276:1: rule__DecimalValueType__Group__1 : rule__DecimalValueType__Group__1__Impl rule__DecimalValueType__Group__2 ;
    public final void rule__DecimalValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6280:1: ( rule__DecimalValueType__Group__1__Impl rule__DecimalValueType__Group__2 )
            // InternalQLS.g:6281:2: rule__DecimalValueType__Group__1__Impl rule__DecimalValueType__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalQLS.g:6288:1: rule__DecimalValueType__Group__1__Impl : ( 'decimalType' ) ;
    public final void rule__DecimalValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6292:1: ( ( 'decimalType' ) )
            // InternalQLS.g:6293:1: ( 'decimalType' )
            {
            // InternalQLS.g:6293:1: ( 'decimalType' )
            // InternalQLS.g:6294:2: 'decimalType'
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
    // InternalQLS.g:6303:1: rule__DecimalValueType__Group__2 : rule__DecimalValueType__Group__2__Impl rule__DecimalValueType__Group__3 ;
    public final void rule__DecimalValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6307:1: ( rule__DecimalValueType__Group__2__Impl rule__DecimalValueType__Group__3 )
            // InternalQLS.g:6308:2: rule__DecimalValueType__Group__2__Impl rule__DecimalValueType__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalQLS.g:6315:1: rule__DecimalValueType__Group__2__Impl : ( ( rule__DecimalValueType__NameAssignment_2 ) ) ;
    public final void rule__DecimalValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6319:1: ( ( ( rule__DecimalValueType__NameAssignment_2 ) ) )
            // InternalQLS.g:6320:1: ( ( rule__DecimalValueType__NameAssignment_2 ) )
            {
            // InternalQLS.g:6320:1: ( ( rule__DecimalValueType__NameAssignment_2 ) )
            // InternalQLS.g:6321:2: ( rule__DecimalValueType__NameAssignment_2 )
            {
             before(grammarAccess.getDecimalValueTypeAccess().getNameAssignment_2()); 
            // InternalQLS.g:6322:2: ( rule__DecimalValueType__NameAssignment_2 )
            // InternalQLS.g:6322:3: rule__DecimalValueType__NameAssignment_2
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
    // InternalQLS.g:6330:1: rule__DecimalValueType__Group__3 : rule__DecimalValueType__Group__3__Impl ;
    public final void rule__DecimalValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6334:1: ( rule__DecimalValueType__Group__3__Impl )
            // InternalQLS.g:6335:2: rule__DecimalValueType__Group__3__Impl
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
    // InternalQLS.g:6341:1: rule__DecimalValueType__Group__3__Impl : ( ( rule__DecimalValueType__Group_3__0 )? ) ;
    public final void rule__DecimalValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6345:1: ( ( ( rule__DecimalValueType__Group_3__0 )? ) )
            // InternalQLS.g:6346:1: ( ( rule__DecimalValueType__Group_3__0 )? )
            {
            // InternalQLS.g:6346:1: ( ( rule__DecimalValueType__Group_3__0 )? )
            // InternalQLS.g:6347:2: ( rule__DecimalValueType__Group_3__0 )?
            {
             before(grammarAccess.getDecimalValueTypeAccess().getGroup_3()); 
            // InternalQLS.g:6348:2: ( rule__DecimalValueType__Group_3__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==44) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalQLS.g:6348:3: rule__DecimalValueType__Group_3__0
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
    // InternalQLS.g:6357:1: rule__DecimalValueType__Group_3__0 : rule__DecimalValueType__Group_3__0__Impl rule__DecimalValueType__Group_3__1 ;
    public final void rule__DecimalValueType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6361:1: ( rule__DecimalValueType__Group_3__0__Impl rule__DecimalValueType__Group_3__1 )
            // InternalQLS.g:6362:2: rule__DecimalValueType__Group_3__0__Impl rule__DecimalValueType__Group_3__1
            {
            pushFollow(FOLLOW_54);
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
    // InternalQLS.g:6369:1: rule__DecimalValueType__Group_3__0__Impl : ( '{' ) ;
    public final void rule__DecimalValueType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6373:1: ( ( '{' ) )
            // InternalQLS.g:6374:1: ( '{' )
            {
            // InternalQLS.g:6374:1: ( '{' )
            // InternalQLS.g:6375:2: '{'
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
    // InternalQLS.g:6384:1: rule__DecimalValueType__Group_3__1 : rule__DecimalValueType__Group_3__1__Impl rule__DecimalValueType__Group_3__2 ;
    public final void rule__DecimalValueType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6388:1: ( rule__DecimalValueType__Group_3__1__Impl rule__DecimalValueType__Group_3__2 )
            // InternalQLS.g:6389:2: rule__DecimalValueType__Group_3__1__Impl rule__DecimalValueType__Group_3__2
            {
            pushFollow(FOLLOW_54);
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
    // InternalQLS.g:6396:1: rule__DecimalValueType__Group_3__1__Impl : ( ( rule__DecimalValueType__Group_3_1__0 )? ) ;
    public final void rule__DecimalValueType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6400:1: ( ( ( rule__DecimalValueType__Group_3_1__0 )? ) )
            // InternalQLS.g:6401:1: ( ( rule__DecimalValueType__Group_3_1__0 )? )
            {
            // InternalQLS.g:6401:1: ( ( rule__DecimalValueType__Group_3_1__0 )? )
            // InternalQLS.g:6402:2: ( rule__DecimalValueType__Group_3_1__0 )?
            {
             before(grammarAccess.getDecimalValueTypeAccess().getGroup_3_1()); 
            // InternalQLS.g:6403:2: ( rule__DecimalValueType__Group_3_1__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==65) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalQLS.g:6403:3: rule__DecimalValueType__Group_3_1__0
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
    // InternalQLS.g:6411:1: rule__DecimalValueType__Group_3__2 : rule__DecimalValueType__Group_3__2__Impl ;
    public final void rule__DecimalValueType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6415:1: ( rule__DecimalValueType__Group_3__2__Impl )
            // InternalQLS.g:6416:2: rule__DecimalValueType__Group_3__2__Impl
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
    // InternalQLS.g:6422:1: rule__DecimalValueType__Group_3__2__Impl : ( '}' ) ;
    public final void rule__DecimalValueType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6426:1: ( ( '}' ) )
            // InternalQLS.g:6427:1: ( '}' )
            {
            // InternalQLS.g:6427:1: ( '}' )
            // InternalQLS.g:6428:2: '}'
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
    // InternalQLS.g:6438:1: rule__DecimalValueType__Group_3_1__0 : rule__DecimalValueType__Group_3_1__0__Impl rule__DecimalValueType__Group_3_1__1 ;
    public final void rule__DecimalValueType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6442:1: ( rule__DecimalValueType__Group_3_1__0__Impl rule__DecimalValueType__Group_3_1__1 )
            // InternalQLS.g:6443:2: rule__DecimalValueType__Group_3_1__0__Impl rule__DecimalValueType__Group_3_1__1
            {
            pushFollow(FOLLOW_55);
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
    // InternalQLS.g:6450:1: rule__DecimalValueType__Group_3_1__0__Impl : ( 'unit' ) ;
    public final void rule__DecimalValueType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6454:1: ( ( 'unit' ) )
            // InternalQLS.g:6455:1: ( 'unit' )
            {
            // InternalQLS.g:6455:1: ( 'unit' )
            // InternalQLS.g:6456:2: 'unit'
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
    // InternalQLS.g:6465:1: rule__DecimalValueType__Group_3_1__1 : rule__DecimalValueType__Group_3_1__1__Impl ;
    public final void rule__DecimalValueType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6469:1: ( rule__DecimalValueType__Group_3_1__1__Impl )
            // InternalQLS.g:6470:2: rule__DecimalValueType__Group_3_1__1__Impl
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
    // InternalQLS.g:6476:1: rule__DecimalValueType__Group_3_1__1__Impl : ( ( rule__DecimalValueType__UnitAssignment_3_1_1 ) ) ;
    public final void rule__DecimalValueType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6480:1: ( ( ( rule__DecimalValueType__UnitAssignment_3_1_1 ) ) )
            // InternalQLS.g:6481:1: ( ( rule__DecimalValueType__UnitAssignment_3_1_1 ) )
            {
            // InternalQLS.g:6481:1: ( ( rule__DecimalValueType__UnitAssignment_3_1_1 ) )
            // InternalQLS.g:6482:2: ( rule__DecimalValueType__UnitAssignment_3_1_1 )
            {
             before(grammarAccess.getDecimalValueTypeAccess().getUnitAssignment_3_1_1()); 
            // InternalQLS.g:6483:2: ( rule__DecimalValueType__UnitAssignment_3_1_1 )
            // InternalQLS.g:6483:3: rule__DecimalValueType__UnitAssignment_3_1_1
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
    // InternalQLS.g:6492:1: rule__DateValueType__Group__0 : rule__DateValueType__Group__0__Impl rule__DateValueType__Group__1 ;
    public final void rule__DateValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6496:1: ( rule__DateValueType__Group__0__Impl rule__DateValueType__Group__1 )
            // InternalQLS.g:6497:2: rule__DateValueType__Group__0__Impl rule__DateValueType__Group__1
            {
            pushFollow(FOLLOW_63);
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
    // InternalQLS.g:6504:1: rule__DateValueType__Group__0__Impl : ( () ) ;
    public final void rule__DateValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6508:1: ( ( () ) )
            // InternalQLS.g:6509:1: ( () )
            {
            // InternalQLS.g:6509:1: ( () )
            // InternalQLS.g:6510:2: ()
            {
             before(grammarAccess.getDateValueTypeAccess().getDateValueTypeAction_0()); 
            // InternalQLS.g:6511:2: ()
            // InternalQLS.g:6511:3: 
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
    // InternalQLS.g:6519:1: rule__DateValueType__Group__1 : rule__DateValueType__Group__1__Impl rule__DateValueType__Group__2 ;
    public final void rule__DateValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6523:1: ( rule__DateValueType__Group__1__Impl rule__DateValueType__Group__2 )
            // InternalQLS.g:6524:2: rule__DateValueType__Group__1__Impl rule__DateValueType__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalQLS.g:6531:1: rule__DateValueType__Group__1__Impl : ( 'dateType' ) ;
    public final void rule__DateValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6535:1: ( ( 'dateType' ) )
            // InternalQLS.g:6536:1: ( 'dateType' )
            {
            // InternalQLS.g:6536:1: ( 'dateType' )
            // InternalQLS.g:6537:2: 'dateType'
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
    // InternalQLS.g:6546:1: rule__DateValueType__Group__2 : rule__DateValueType__Group__2__Impl rule__DateValueType__Group__3 ;
    public final void rule__DateValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6550:1: ( rule__DateValueType__Group__2__Impl rule__DateValueType__Group__3 )
            // InternalQLS.g:6551:2: rule__DateValueType__Group__2__Impl rule__DateValueType__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalQLS.g:6558:1: rule__DateValueType__Group__2__Impl : ( ( rule__DateValueType__NameAssignment_2 ) ) ;
    public final void rule__DateValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6562:1: ( ( ( rule__DateValueType__NameAssignment_2 ) ) )
            // InternalQLS.g:6563:1: ( ( rule__DateValueType__NameAssignment_2 ) )
            {
            // InternalQLS.g:6563:1: ( ( rule__DateValueType__NameAssignment_2 ) )
            // InternalQLS.g:6564:2: ( rule__DateValueType__NameAssignment_2 )
            {
             before(grammarAccess.getDateValueTypeAccess().getNameAssignment_2()); 
            // InternalQLS.g:6565:2: ( rule__DateValueType__NameAssignment_2 )
            // InternalQLS.g:6565:3: rule__DateValueType__NameAssignment_2
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
    // InternalQLS.g:6573:1: rule__DateValueType__Group__3 : rule__DateValueType__Group__3__Impl ;
    public final void rule__DateValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6577:1: ( rule__DateValueType__Group__3__Impl )
            // InternalQLS.g:6578:2: rule__DateValueType__Group__3__Impl
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
    // InternalQLS.g:6584:1: rule__DateValueType__Group__3__Impl : ( ( rule__DateValueType__Group_3__0 )? ) ;
    public final void rule__DateValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6588:1: ( ( ( rule__DateValueType__Group_3__0 )? ) )
            // InternalQLS.g:6589:1: ( ( rule__DateValueType__Group_3__0 )? )
            {
            // InternalQLS.g:6589:1: ( ( rule__DateValueType__Group_3__0 )? )
            // InternalQLS.g:6590:2: ( rule__DateValueType__Group_3__0 )?
            {
             before(grammarAccess.getDateValueTypeAccess().getGroup_3()); 
            // InternalQLS.g:6591:2: ( rule__DateValueType__Group_3__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==44) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalQLS.g:6591:3: rule__DateValueType__Group_3__0
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
    // InternalQLS.g:6600:1: rule__DateValueType__Group_3__0 : rule__DateValueType__Group_3__0__Impl rule__DateValueType__Group_3__1 ;
    public final void rule__DateValueType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6604:1: ( rule__DateValueType__Group_3__0__Impl rule__DateValueType__Group_3__1 )
            // InternalQLS.g:6605:2: rule__DateValueType__Group_3__0__Impl rule__DateValueType__Group_3__1
            {
            pushFollow(FOLLOW_54);
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
    // InternalQLS.g:6612:1: rule__DateValueType__Group_3__0__Impl : ( '{' ) ;
    public final void rule__DateValueType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6616:1: ( ( '{' ) )
            // InternalQLS.g:6617:1: ( '{' )
            {
            // InternalQLS.g:6617:1: ( '{' )
            // InternalQLS.g:6618:2: '{'
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
    // InternalQLS.g:6627:1: rule__DateValueType__Group_3__1 : rule__DateValueType__Group_3__1__Impl rule__DateValueType__Group_3__2 ;
    public final void rule__DateValueType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6631:1: ( rule__DateValueType__Group_3__1__Impl rule__DateValueType__Group_3__2 )
            // InternalQLS.g:6632:2: rule__DateValueType__Group_3__1__Impl rule__DateValueType__Group_3__2
            {
            pushFollow(FOLLOW_54);
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
    // InternalQLS.g:6639:1: rule__DateValueType__Group_3__1__Impl : ( ( rule__DateValueType__Group_3_1__0 )? ) ;
    public final void rule__DateValueType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6643:1: ( ( ( rule__DateValueType__Group_3_1__0 )? ) )
            // InternalQLS.g:6644:1: ( ( rule__DateValueType__Group_3_1__0 )? )
            {
            // InternalQLS.g:6644:1: ( ( rule__DateValueType__Group_3_1__0 )? )
            // InternalQLS.g:6645:2: ( rule__DateValueType__Group_3_1__0 )?
            {
             before(grammarAccess.getDateValueTypeAccess().getGroup_3_1()); 
            // InternalQLS.g:6646:2: ( rule__DateValueType__Group_3_1__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==65) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalQLS.g:6646:3: rule__DateValueType__Group_3_1__0
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
    // InternalQLS.g:6654:1: rule__DateValueType__Group_3__2 : rule__DateValueType__Group_3__2__Impl ;
    public final void rule__DateValueType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6658:1: ( rule__DateValueType__Group_3__2__Impl )
            // InternalQLS.g:6659:2: rule__DateValueType__Group_3__2__Impl
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
    // InternalQLS.g:6665:1: rule__DateValueType__Group_3__2__Impl : ( '}' ) ;
    public final void rule__DateValueType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6669:1: ( ( '}' ) )
            // InternalQLS.g:6670:1: ( '}' )
            {
            // InternalQLS.g:6670:1: ( '}' )
            // InternalQLS.g:6671:2: '}'
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
    // InternalQLS.g:6681:1: rule__DateValueType__Group_3_1__0 : rule__DateValueType__Group_3_1__0__Impl rule__DateValueType__Group_3_1__1 ;
    public final void rule__DateValueType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6685:1: ( rule__DateValueType__Group_3_1__0__Impl rule__DateValueType__Group_3_1__1 )
            // InternalQLS.g:6686:2: rule__DateValueType__Group_3_1__0__Impl rule__DateValueType__Group_3_1__1
            {
            pushFollow(FOLLOW_55);
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
    // InternalQLS.g:6693:1: rule__DateValueType__Group_3_1__0__Impl : ( 'unit' ) ;
    public final void rule__DateValueType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6697:1: ( ( 'unit' ) )
            // InternalQLS.g:6698:1: ( 'unit' )
            {
            // InternalQLS.g:6698:1: ( 'unit' )
            // InternalQLS.g:6699:2: 'unit'
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
    // InternalQLS.g:6708:1: rule__DateValueType__Group_3_1__1 : rule__DateValueType__Group_3_1__1__Impl ;
    public final void rule__DateValueType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6712:1: ( rule__DateValueType__Group_3_1__1__Impl )
            // InternalQLS.g:6713:2: rule__DateValueType__Group_3_1__1__Impl
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
    // InternalQLS.g:6719:1: rule__DateValueType__Group_3_1__1__Impl : ( ( rule__DateValueType__UnitAssignment_3_1_1 ) ) ;
    public final void rule__DateValueType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6723:1: ( ( ( rule__DateValueType__UnitAssignment_3_1_1 ) ) )
            // InternalQLS.g:6724:1: ( ( rule__DateValueType__UnitAssignment_3_1_1 ) )
            {
            // InternalQLS.g:6724:1: ( ( rule__DateValueType__UnitAssignment_3_1_1 ) )
            // InternalQLS.g:6725:2: ( rule__DateValueType__UnitAssignment_3_1_1 )
            {
             before(grammarAccess.getDateValueTypeAccess().getUnitAssignment_3_1_1()); 
            // InternalQLS.g:6726:2: ( rule__DateValueType__UnitAssignment_3_1_1 )
            // InternalQLS.g:6726:3: rule__DateValueType__UnitAssignment_3_1_1
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
    // InternalQLS.g:6735:1: rule__EnumerationValueType__Group__0 : rule__EnumerationValueType__Group__0__Impl rule__EnumerationValueType__Group__1 ;
    public final void rule__EnumerationValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6739:1: ( rule__EnumerationValueType__Group__0__Impl rule__EnumerationValueType__Group__1 )
            // InternalQLS.g:6740:2: rule__EnumerationValueType__Group__0__Impl rule__EnumerationValueType__Group__1
            {
            pushFollow(FOLLOW_64);
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
    // InternalQLS.g:6747:1: rule__EnumerationValueType__Group__0__Impl : ( () ) ;
    public final void rule__EnumerationValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6751:1: ( ( () ) )
            // InternalQLS.g:6752:1: ( () )
            {
            // InternalQLS.g:6752:1: ( () )
            // InternalQLS.g:6753:2: ()
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getEnumerationValueTypeAction_0()); 
            // InternalQLS.g:6754:2: ()
            // InternalQLS.g:6754:3: 
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
    // InternalQLS.g:6762:1: rule__EnumerationValueType__Group__1 : rule__EnumerationValueType__Group__1__Impl rule__EnumerationValueType__Group__2 ;
    public final void rule__EnumerationValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6766:1: ( rule__EnumerationValueType__Group__1__Impl rule__EnumerationValueType__Group__2 )
            // InternalQLS.g:6767:2: rule__EnumerationValueType__Group__1__Impl rule__EnumerationValueType__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalQLS.g:6774:1: rule__EnumerationValueType__Group__1__Impl : ( 'enumerationType' ) ;
    public final void rule__EnumerationValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6778:1: ( ( 'enumerationType' ) )
            // InternalQLS.g:6779:1: ( 'enumerationType' )
            {
            // InternalQLS.g:6779:1: ( 'enumerationType' )
            // InternalQLS.g:6780:2: 'enumerationType'
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
    // InternalQLS.g:6789:1: rule__EnumerationValueType__Group__2 : rule__EnumerationValueType__Group__2__Impl rule__EnumerationValueType__Group__3 ;
    public final void rule__EnumerationValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6793:1: ( rule__EnumerationValueType__Group__2__Impl rule__EnumerationValueType__Group__3 )
            // InternalQLS.g:6794:2: rule__EnumerationValueType__Group__2__Impl rule__EnumerationValueType__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalQLS.g:6801:1: rule__EnumerationValueType__Group__2__Impl : ( ( rule__EnumerationValueType__NameAssignment_2 ) ) ;
    public final void rule__EnumerationValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6805:1: ( ( ( rule__EnumerationValueType__NameAssignment_2 ) ) )
            // InternalQLS.g:6806:1: ( ( rule__EnumerationValueType__NameAssignment_2 ) )
            {
            // InternalQLS.g:6806:1: ( ( rule__EnumerationValueType__NameAssignment_2 ) )
            // InternalQLS.g:6807:2: ( rule__EnumerationValueType__NameAssignment_2 )
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getNameAssignment_2()); 
            // InternalQLS.g:6808:2: ( rule__EnumerationValueType__NameAssignment_2 )
            // InternalQLS.g:6808:3: rule__EnumerationValueType__NameAssignment_2
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
    // InternalQLS.g:6816:1: rule__EnumerationValueType__Group__3 : rule__EnumerationValueType__Group__3__Impl ;
    public final void rule__EnumerationValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6820:1: ( rule__EnumerationValueType__Group__3__Impl )
            // InternalQLS.g:6821:2: rule__EnumerationValueType__Group__3__Impl
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
    // InternalQLS.g:6827:1: rule__EnumerationValueType__Group__3__Impl : ( ( rule__EnumerationValueType__Group_3__0 )? ) ;
    public final void rule__EnumerationValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6831:1: ( ( ( rule__EnumerationValueType__Group_3__0 )? ) )
            // InternalQLS.g:6832:1: ( ( rule__EnumerationValueType__Group_3__0 )? )
            {
            // InternalQLS.g:6832:1: ( ( rule__EnumerationValueType__Group_3__0 )? )
            // InternalQLS.g:6833:2: ( rule__EnumerationValueType__Group_3__0 )?
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getGroup_3()); 
            // InternalQLS.g:6834:2: ( rule__EnumerationValueType__Group_3__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==44) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalQLS.g:6834:3: rule__EnumerationValueType__Group_3__0
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
    // InternalQLS.g:6843:1: rule__EnumerationValueType__Group_3__0 : rule__EnumerationValueType__Group_3__0__Impl rule__EnumerationValueType__Group_3__1 ;
    public final void rule__EnumerationValueType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6847:1: ( rule__EnumerationValueType__Group_3__0__Impl rule__EnumerationValueType__Group_3__1 )
            // InternalQLS.g:6848:2: rule__EnumerationValueType__Group_3__0__Impl rule__EnumerationValueType__Group_3__1
            {
            pushFollow(FOLLOW_65);
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
    // InternalQLS.g:6855:1: rule__EnumerationValueType__Group_3__0__Impl : ( '{' ) ;
    public final void rule__EnumerationValueType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6859:1: ( ( '{' ) )
            // InternalQLS.g:6860:1: ( '{' )
            {
            // InternalQLS.g:6860:1: ( '{' )
            // InternalQLS.g:6861:2: '{'
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
    // InternalQLS.g:6870:1: rule__EnumerationValueType__Group_3__1 : rule__EnumerationValueType__Group_3__1__Impl rule__EnumerationValueType__Group_3__2 ;
    public final void rule__EnumerationValueType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6874:1: ( rule__EnumerationValueType__Group_3__1__Impl rule__EnumerationValueType__Group_3__2 )
            // InternalQLS.g:6875:2: rule__EnumerationValueType__Group_3__1__Impl rule__EnumerationValueType__Group_3__2
            {
            pushFollow(FOLLOW_65);
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
    // InternalQLS.g:6882:1: rule__EnumerationValueType__Group_3__1__Impl : ( ( rule__EnumerationValueType__Group_3_1__0 )? ) ;
    public final void rule__EnumerationValueType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6886:1: ( ( ( rule__EnumerationValueType__Group_3_1__0 )? ) )
            // InternalQLS.g:6887:1: ( ( rule__EnumerationValueType__Group_3_1__0 )? )
            {
            // InternalQLS.g:6887:1: ( ( rule__EnumerationValueType__Group_3_1__0 )? )
            // InternalQLS.g:6888:2: ( rule__EnumerationValueType__Group_3_1__0 )?
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getGroup_3_1()); 
            // InternalQLS.g:6889:2: ( rule__EnumerationValueType__Group_3_1__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==65) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalQLS.g:6889:3: rule__EnumerationValueType__Group_3_1__0
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
    // InternalQLS.g:6897:1: rule__EnumerationValueType__Group_3__2 : rule__EnumerationValueType__Group_3__2__Impl rule__EnumerationValueType__Group_3__3 ;
    public final void rule__EnumerationValueType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6901:1: ( rule__EnumerationValueType__Group_3__2__Impl rule__EnumerationValueType__Group_3__3 )
            // InternalQLS.g:6902:2: rule__EnumerationValueType__Group_3__2__Impl rule__EnumerationValueType__Group_3__3
            {
            pushFollow(FOLLOW_65);
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
    // InternalQLS.g:6909:1: rule__EnumerationValueType__Group_3__2__Impl : ( ( rule__EnumerationValueType__Group_3_2__0 )? ) ;
    public final void rule__EnumerationValueType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6913:1: ( ( ( rule__EnumerationValueType__Group_3_2__0 )? ) )
            // InternalQLS.g:6914:1: ( ( rule__EnumerationValueType__Group_3_2__0 )? )
            {
            // InternalQLS.g:6914:1: ( ( rule__EnumerationValueType__Group_3_2__0 )? )
            // InternalQLS.g:6915:2: ( rule__EnumerationValueType__Group_3_2__0 )?
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getGroup_3_2()); 
            // InternalQLS.g:6916:2: ( rule__EnumerationValueType__Group_3_2__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==73) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalQLS.g:6916:3: rule__EnumerationValueType__Group_3_2__0
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
    // InternalQLS.g:6924:1: rule__EnumerationValueType__Group_3__3 : rule__EnumerationValueType__Group_3__3__Impl ;
    public final void rule__EnumerationValueType__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6928:1: ( rule__EnumerationValueType__Group_3__3__Impl )
            // InternalQLS.g:6929:2: rule__EnumerationValueType__Group_3__3__Impl
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
    // InternalQLS.g:6935:1: rule__EnumerationValueType__Group_3__3__Impl : ( '}' ) ;
    public final void rule__EnumerationValueType__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6939:1: ( ( '}' ) )
            // InternalQLS.g:6940:1: ( '}' )
            {
            // InternalQLS.g:6940:1: ( '}' )
            // InternalQLS.g:6941:2: '}'
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
    // InternalQLS.g:6951:1: rule__EnumerationValueType__Group_3_1__0 : rule__EnumerationValueType__Group_3_1__0__Impl rule__EnumerationValueType__Group_3_1__1 ;
    public final void rule__EnumerationValueType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6955:1: ( rule__EnumerationValueType__Group_3_1__0__Impl rule__EnumerationValueType__Group_3_1__1 )
            // InternalQLS.g:6956:2: rule__EnumerationValueType__Group_3_1__0__Impl rule__EnumerationValueType__Group_3_1__1
            {
            pushFollow(FOLLOW_55);
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
    // InternalQLS.g:6963:1: rule__EnumerationValueType__Group_3_1__0__Impl : ( 'unit' ) ;
    public final void rule__EnumerationValueType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6967:1: ( ( 'unit' ) )
            // InternalQLS.g:6968:1: ( 'unit' )
            {
            // InternalQLS.g:6968:1: ( 'unit' )
            // InternalQLS.g:6969:2: 'unit'
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
    // InternalQLS.g:6978:1: rule__EnumerationValueType__Group_3_1__1 : rule__EnumerationValueType__Group_3_1__1__Impl ;
    public final void rule__EnumerationValueType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6982:1: ( rule__EnumerationValueType__Group_3_1__1__Impl )
            // InternalQLS.g:6983:2: rule__EnumerationValueType__Group_3_1__1__Impl
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
    // InternalQLS.g:6989:1: rule__EnumerationValueType__Group_3_1__1__Impl : ( ( rule__EnumerationValueType__UnitAssignment_3_1_1 ) ) ;
    public final void rule__EnumerationValueType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:6993:1: ( ( ( rule__EnumerationValueType__UnitAssignment_3_1_1 ) ) )
            // InternalQLS.g:6994:1: ( ( rule__EnumerationValueType__UnitAssignment_3_1_1 ) )
            {
            // InternalQLS.g:6994:1: ( ( rule__EnumerationValueType__UnitAssignment_3_1_1 ) )
            // InternalQLS.g:6995:2: ( rule__EnumerationValueType__UnitAssignment_3_1_1 )
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getUnitAssignment_3_1_1()); 
            // InternalQLS.g:6996:2: ( rule__EnumerationValueType__UnitAssignment_3_1_1 )
            // InternalQLS.g:6996:3: rule__EnumerationValueType__UnitAssignment_3_1_1
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
    // InternalQLS.g:7005:1: rule__EnumerationValueType__Group_3_2__0 : rule__EnumerationValueType__Group_3_2__0__Impl rule__EnumerationValueType__Group_3_2__1 ;
    public final void rule__EnumerationValueType__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7009:1: ( rule__EnumerationValueType__Group_3_2__0__Impl rule__EnumerationValueType__Group_3_2__1 )
            // InternalQLS.g:7010:2: rule__EnumerationValueType__Group_3_2__0__Impl rule__EnumerationValueType__Group_3_2__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalQLS.g:7017:1: rule__EnumerationValueType__Group_3_2__0__Impl : ( 'literals' ) ;
    public final void rule__EnumerationValueType__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7021:1: ( ( 'literals' ) )
            // InternalQLS.g:7022:1: ( 'literals' )
            {
            // InternalQLS.g:7022:1: ( 'literals' )
            // InternalQLS.g:7023:2: 'literals'
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
    // InternalQLS.g:7032:1: rule__EnumerationValueType__Group_3_2__1 : rule__EnumerationValueType__Group_3_2__1__Impl rule__EnumerationValueType__Group_3_2__2 ;
    public final void rule__EnumerationValueType__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7036:1: ( rule__EnumerationValueType__Group_3_2__1__Impl rule__EnumerationValueType__Group_3_2__2 )
            // InternalQLS.g:7037:2: rule__EnumerationValueType__Group_3_2__1__Impl rule__EnumerationValueType__Group_3_2__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalQLS.g:7044:1: rule__EnumerationValueType__Group_3_2__1__Impl : ( '{' ) ;
    public final void rule__EnumerationValueType__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7048:1: ( ( '{' ) )
            // InternalQLS.g:7049:1: ( '{' )
            {
            // InternalQLS.g:7049:1: ( '{' )
            // InternalQLS.g:7050:2: '{'
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
    // InternalQLS.g:7059:1: rule__EnumerationValueType__Group_3_2__2 : rule__EnumerationValueType__Group_3_2__2__Impl rule__EnumerationValueType__Group_3_2__3 ;
    public final void rule__EnumerationValueType__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7063:1: ( rule__EnumerationValueType__Group_3_2__2__Impl rule__EnumerationValueType__Group_3_2__3 )
            // InternalQLS.g:7064:2: rule__EnumerationValueType__Group_3_2__2__Impl rule__EnumerationValueType__Group_3_2__3
            {
            pushFollow(FOLLOW_66);
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
    // InternalQLS.g:7071:1: rule__EnumerationValueType__Group_3_2__2__Impl : ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2 ) ) ;
    public final void rule__EnumerationValueType__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7075:1: ( ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2 ) ) )
            // InternalQLS.g:7076:1: ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2 ) )
            {
            // InternalQLS.g:7076:1: ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2 ) )
            // InternalQLS.g:7077:2: ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2 )
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsAssignment_3_2_2()); 
            // InternalQLS.g:7078:2: ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2 )
            // InternalQLS.g:7078:3: rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2
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
    // InternalQLS.g:7086:1: rule__EnumerationValueType__Group_3_2__3 : rule__EnumerationValueType__Group_3_2__3__Impl rule__EnumerationValueType__Group_3_2__4 ;
    public final void rule__EnumerationValueType__Group_3_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7090:1: ( rule__EnumerationValueType__Group_3_2__3__Impl rule__EnumerationValueType__Group_3_2__4 )
            // InternalQLS.g:7091:2: rule__EnumerationValueType__Group_3_2__3__Impl rule__EnumerationValueType__Group_3_2__4
            {
            pushFollow(FOLLOW_66);
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
    // InternalQLS.g:7098:1: rule__EnumerationValueType__Group_3_2__3__Impl : ( ( rule__EnumerationValueType__Group_3_2_3__0 )* ) ;
    public final void rule__EnumerationValueType__Group_3_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7102:1: ( ( ( rule__EnumerationValueType__Group_3_2_3__0 )* ) )
            // InternalQLS.g:7103:1: ( ( rule__EnumerationValueType__Group_3_2_3__0 )* )
            {
            // InternalQLS.g:7103:1: ( ( rule__EnumerationValueType__Group_3_2_3__0 )* )
            // InternalQLS.g:7104:2: ( rule__EnumerationValueType__Group_3_2_3__0 )*
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getGroup_3_2_3()); 
            // InternalQLS.g:7105:2: ( rule__EnumerationValueType__Group_3_2_3__0 )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==74) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalQLS.g:7105:3: rule__EnumerationValueType__Group_3_2_3__0
            	    {
            	    pushFollow(FOLLOW_67);
            	    rule__EnumerationValueType__Group_3_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop56;
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
    // InternalQLS.g:7113:1: rule__EnumerationValueType__Group_3_2__4 : rule__EnumerationValueType__Group_3_2__4__Impl ;
    public final void rule__EnumerationValueType__Group_3_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7117:1: ( rule__EnumerationValueType__Group_3_2__4__Impl )
            // InternalQLS.g:7118:2: rule__EnumerationValueType__Group_3_2__4__Impl
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
    // InternalQLS.g:7124:1: rule__EnumerationValueType__Group_3_2__4__Impl : ( '}' ) ;
    public final void rule__EnumerationValueType__Group_3_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7128:1: ( ( '}' ) )
            // InternalQLS.g:7129:1: ( '}' )
            {
            // InternalQLS.g:7129:1: ( '}' )
            // InternalQLS.g:7130:2: '}'
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
    // InternalQLS.g:7140:1: rule__EnumerationValueType__Group_3_2_3__0 : rule__EnumerationValueType__Group_3_2_3__0__Impl rule__EnumerationValueType__Group_3_2_3__1 ;
    public final void rule__EnumerationValueType__Group_3_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7144:1: ( rule__EnumerationValueType__Group_3_2_3__0__Impl rule__EnumerationValueType__Group_3_2_3__1 )
            // InternalQLS.g:7145:2: rule__EnumerationValueType__Group_3_2_3__0__Impl rule__EnumerationValueType__Group_3_2_3__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalQLS.g:7152:1: rule__EnumerationValueType__Group_3_2_3__0__Impl : ( ',' ) ;
    public final void rule__EnumerationValueType__Group_3_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7156:1: ( ( ',' ) )
            // InternalQLS.g:7157:1: ( ',' )
            {
            // InternalQLS.g:7157:1: ( ',' )
            // InternalQLS.g:7158:2: ','
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
    // InternalQLS.g:7167:1: rule__EnumerationValueType__Group_3_2_3__1 : rule__EnumerationValueType__Group_3_2_3__1__Impl ;
    public final void rule__EnumerationValueType__Group_3_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7171:1: ( rule__EnumerationValueType__Group_3_2_3__1__Impl )
            // InternalQLS.g:7172:2: rule__EnumerationValueType__Group_3_2_3__1__Impl
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
    // InternalQLS.g:7178:1: rule__EnumerationValueType__Group_3_2_3__1__Impl : ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1 ) ) ;
    public final void rule__EnumerationValueType__Group_3_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7182:1: ( ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1 ) ) )
            // InternalQLS.g:7183:1: ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1 ) )
            {
            // InternalQLS.g:7183:1: ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1 ) )
            // InternalQLS.g:7184:2: ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1 )
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsAssignment_3_2_3_1()); 
            // InternalQLS.g:7185:2: ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1 )
            // InternalQLS.g:7185:3: rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1
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
    // InternalQLS.g:7194:1: rule__StringValueType__Group__0 : rule__StringValueType__Group__0__Impl rule__StringValueType__Group__1 ;
    public final void rule__StringValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7198:1: ( rule__StringValueType__Group__0__Impl rule__StringValueType__Group__1 )
            // InternalQLS.g:7199:2: rule__StringValueType__Group__0__Impl rule__StringValueType__Group__1
            {
            pushFollow(FOLLOW_68);
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
    // InternalQLS.g:7206:1: rule__StringValueType__Group__0__Impl : ( () ) ;
    public final void rule__StringValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7210:1: ( ( () ) )
            // InternalQLS.g:7211:1: ( () )
            {
            // InternalQLS.g:7211:1: ( () )
            // InternalQLS.g:7212:2: ()
            {
             before(grammarAccess.getStringValueTypeAccess().getStringValueTypeAction_0()); 
            // InternalQLS.g:7213:2: ()
            // InternalQLS.g:7213:3: 
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
    // InternalQLS.g:7221:1: rule__StringValueType__Group__1 : rule__StringValueType__Group__1__Impl rule__StringValueType__Group__2 ;
    public final void rule__StringValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7225:1: ( rule__StringValueType__Group__1__Impl rule__StringValueType__Group__2 )
            // InternalQLS.g:7226:2: rule__StringValueType__Group__1__Impl rule__StringValueType__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalQLS.g:7233:1: rule__StringValueType__Group__1__Impl : ( 'StringType' ) ;
    public final void rule__StringValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7237:1: ( ( 'StringType' ) )
            // InternalQLS.g:7238:1: ( 'StringType' )
            {
            // InternalQLS.g:7238:1: ( 'StringType' )
            // InternalQLS.g:7239:2: 'StringType'
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
    // InternalQLS.g:7248:1: rule__StringValueType__Group__2 : rule__StringValueType__Group__2__Impl rule__StringValueType__Group__3 ;
    public final void rule__StringValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7252:1: ( rule__StringValueType__Group__2__Impl rule__StringValueType__Group__3 )
            // InternalQLS.g:7253:2: rule__StringValueType__Group__2__Impl rule__StringValueType__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalQLS.g:7260:1: rule__StringValueType__Group__2__Impl : ( ( rule__StringValueType__NameAssignment_2 ) ) ;
    public final void rule__StringValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7264:1: ( ( ( rule__StringValueType__NameAssignment_2 ) ) )
            // InternalQLS.g:7265:1: ( ( rule__StringValueType__NameAssignment_2 ) )
            {
            // InternalQLS.g:7265:1: ( ( rule__StringValueType__NameAssignment_2 ) )
            // InternalQLS.g:7266:2: ( rule__StringValueType__NameAssignment_2 )
            {
             before(grammarAccess.getStringValueTypeAccess().getNameAssignment_2()); 
            // InternalQLS.g:7267:2: ( rule__StringValueType__NameAssignment_2 )
            // InternalQLS.g:7267:3: rule__StringValueType__NameAssignment_2
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
    // InternalQLS.g:7275:1: rule__StringValueType__Group__3 : rule__StringValueType__Group__3__Impl ;
    public final void rule__StringValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7279:1: ( rule__StringValueType__Group__3__Impl )
            // InternalQLS.g:7280:2: rule__StringValueType__Group__3__Impl
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
    // InternalQLS.g:7286:1: rule__StringValueType__Group__3__Impl : ( ( rule__StringValueType__Group_3__0 )? ) ;
    public final void rule__StringValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7290:1: ( ( ( rule__StringValueType__Group_3__0 )? ) )
            // InternalQLS.g:7291:1: ( ( rule__StringValueType__Group_3__0 )? )
            {
            // InternalQLS.g:7291:1: ( ( rule__StringValueType__Group_3__0 )? )
            // InternalQLS.g:7292:2: ( rule__StringValueType__Group_3__0 )?
            {
             before(grammarAccess.getStringValueTypeAccess().getGroup_3()); 
            // InternalQLS.g:7293:2: ( rule__StringValueType__Group_3__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==44) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalQLS.g:7293:3: rule__StringValueType__Group_3__0
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
    // InternalQLS.g:7302:1: rule__StringValueType__Group_3__0 : rule__StringValueType__Group_3__0__Impl rule__StringValueType__Group_3__1 ;
    public final void rule__StringValueType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7306:1: ( rule__StringValueType__Group_3__0__Impl rule__StringValueType__Group_3__1 )
            // InternalQLS.g:7307:2: rule__StringValueType__Group_3__0__Impl rule__StringValueType__Group_3__1
            {
            pushFollow(FOLLOW_54);
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
    // InternalQLS.g:7314:1: rule__StringValueType__Group_3__0__Impl : ( '{' ) ;
    public final void rule__StringValueType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7318:1: ( ( '{' ) )
            // InternalQLS.g:7319:1: ( '{' )
            {
            // InternalQLS.g:7319:1: ( '{' )
            // InternalQLS.g:7320:2: '{'
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
    // InternalQLS.g:7329:1: rule__StringValueType__Group_3__1 : rule__StringValueType__Group_3__1__Impl rule__StringValueType__Group_3__2 ;
    public final void rule__StringValueType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7333:1: ( rule__StringValueType__Group_3__1__Impl rule__StringValueType__Group_3__2 )
            // InternalQLS.g:7334:2: rule__StringValueType__Group_3__1__Impl rule__StringValueType__Group_3__2
            {
            pushFollow(FOLLOW_54);
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
    // InternalQLS.g:7341:1: rule__StringValueType__Group_3__1__Impl : ( ( rule__StringValueType__Group_3_1__0 )? ) ;
    public final void rule__StringValueType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7345:1: ( ( ( rule__StringValueType__Group_3_1__0 )? ) )
            // InternalQLS.g:7346:1: ( ( rule__StringValueType__Group_3_1__0 )? )
            {
            // InternalQLS.g:7346:1: ( ( rule__StringValueType__Group_3_1__0 )? )
            // InternalQLS.g:7347:2: ( rule__StringValueType__Group_3_1__0 )?
            {
             before(grammarAccess.getStringValueTypeAccess().getGroup_3_1()); 
            // InternalQLS.g:7348:2: ( rule__StringValueType__Group_3_1__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==65) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalQLS.g:7348:3: rule__StringValueType__Group_3_1__0
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
    // InternalQLS.g:7356:1: rule__StringValueType__Group_3__2 : rule__StringValueType__Group_3__2__Impl ;
    public final void rule__StringValueType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7360:1: ( rule__StringValueType__Group_3__2__Impl )
            // InternalQLS.g:7361:2: rule__StringValueType__Group_3__2__Impl
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
    // InternalQLS.g:7367:1: rule__StringValueType__Group_3__2__Impl : ( '}' ) ;
    public final void rule__StringValueType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7371:1: ( ( '}' ) )
            // InternalQLS.g:7372:1: ( '}' )
            {
            // InternalQLS.g:7372:1: ( '}' )
            // InternalQLS.g:7373:2: '}'
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
    // InternalQLS.g:7383:1: rule__StringValueType__Group_3_1__0 : rule__StringValueType__Group_3_1__0__Impl rule__StringValueType__Group_3_1__1 ;
    public final void rule__StringValueType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7387:1: ( rule__StringValueType__Group_3_1__0__Impl rule__StringValueType__Group_3_1__1 )
            // InternalQLS.g:7388:2: rule__StringValueType__Group_3_1__0__Impl rule__StringValueType__Group_3_1__1
            {
            pushFollow(FOLLOW_55);
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
    // InternalQLS.g:7395:1: rule__StringValueType__Group_3_1__0__Impl : ( 'unit' ) ;
    public final void rule__StringValueType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7399:1: ( ( 'unit' ) )
            // InternalQLS.g:7400:1: ( 'unit' )
            {
            // InternalQLS.g:7400:1: ( 'unit' )
            // InternalQLS.g:7401:2: 'unit'
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
    // InternalQLS.g:7410:1: rule__StringValueType__Group_3_1__1 : rule__StringValueType__Group_3_1__1__Impl ;
    public final void rule__StringValueType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7414:1: ( rule__StringValueType__Group_3_1__1__Impl )
            // InternalQLS.g:7415:2: rule__StringValueType__Group_3_1__1__Impl
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
    // InternalQLS.g:7421:1: rule__StringValueType__Group_3_1__1__Impl : ( ( rule__StringValueType__UnitAssignment_3_1_1 ) ) ;
    public final void rule__StringValueType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7425:1: ( ( ( rule__StringValueType__UnitAssignment_3_1_1 ) ) )
            // InternalQLS.g:7426:1: ( ( rule__StringValueType__UnitAssignment_3_1_1 ) )
            {
            // InternalQLS.g:7426:1: ( ( rule__StringValueType__UnitAssignment_3_1_1 ) )
            // InternalQLS.g:7427:2: ( rule__StringValueType__UnitAssignment_3_1_1 )
            {
             before(grammarAccess.getStringValueTypeAccess().getUnitAssignment_3_1_1()); 
            // InternalQLS.g:7428:2: ( rule__StringValueType__UnitAssignment_3_1_1 )
            // InternalQLS.g:7428:3: rule__StringValueType__UnitAssignment_3_1_1
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
    // InternalQLS.g:7437:1: rule__EnumerationLiteral__Group__0 : rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 ;
    public final void rule__EnumerationLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7441:1: ( rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 )
            // InternalQLS.g:7442:2: rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalQLS.g:7449:1: rule__EnumerationLiteral__Group__0__Impl : ( () ) ;
    public final void rule__EnumerationLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7453:1: ( ( () ) )
            // InternalQLS.g:7454:1: ( () )
            {
            // InternalQLS.g:7454:1: ( () )
            // InternalQLS.g:7455:2: ()
            {
             before(grammarAccess.getEnumerationLiteralAccess().getEnumerationLiteralAction_0()); 
            // InternalQLS.g:7456:2: ()
            // InternalQLS.g:7456:3: 
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
    // InternalQLS.g:7464:1: rule__EnumerationLiteral__Group__1 : rule__EnumerationLiteral__Group__1__Impl ;
    public final void rule__EnumerationLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7468:1: ( rule__EnumerationLiteral__Group__1__Impl )
            // InternalQLS.g:7469:2: rule__EnumerationLiteral__Group__1__Impl
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
    // InternalQLS.g:7475:1: rule__EnumerationLiteral__Group__1__Impl : ( ( rule__EnumerationLiteral__NameAssignment_1 ) ) ;
    public final void rule__EnumerationLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7479:1: ( ( ( rule__EnumerationLiteral__NameAssignment_1 ) ) )
            // InternalQLS.g:7480:1: ( ( rule__EnumerationLiteral__NameAssignment_1 ) )
            {
            // InternalQLS.g:7480:1: ( ( rule__EnumerationLiteral__NameAssignment_1 ) )
            // InternalQLS.g:7481:2: ( rule__EnumerationLiteral__NameAssignment_1 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_1()); 
            // InternalQLS.g:7482:2: ( rule__EnumerationLiteral__NameAssignment_1 )
            // InternalQLS.g:7482:3: rule__EnumerationLiteral__NameAssignment_1
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
    // InternalQLS.g:7491:1: rule__IntegerValue__Group__0 : rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1 ;
    public final void rule__IntegerValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7495:1: ( rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1 )
            // InternalQLS.g:7496:2: rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1
            {
            pushFollow(FOLLOW_61);
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
    // InternalQLS.g:7503:1: rule__IntegerValue__Group__0__Impl : ( () ) ;
    public final void rule__IntegerValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7507:1: ( ( () ) )
            // InternalQLS.g:7508:1: ( () )
            {
            // InternalQLS.g:7508:1: ( () )
            // InternalQLS.g:7509:2: ()
            {
             before(grammarAccess.getIntegerValueAccess().getIntegerValueAction_0()); 
            // InternalQLS.g:7510:2: ()
            // InternalQLS.g:7510:3: 
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
    // InternalQLS.g:7518:1: rule__IntegerValue__Group__1 : rule__IntegerValue__Group__1__Impl ;
    public final void rule__IntegerValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7522:1: ( rule__IntegerValue__Group__1__Impl )
            // InternalQLS.g:7523:2: rule__IntegerValue__Group__1__Impl
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
    // InternalQLS.g:7529:1: rule__IntegerValue__Group__1__Impl : ( ( rule__IntegerValue__IntValueAssignment_1 ) ) ;
    public final void rule__IntegerValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7533:1: ( ( ( rule__IntegerValue__IntValueAssignment_1 ) ) )
            // InternalQLS.g:7534:1: ( ( rule__IntegerValue__IntValueAssignment_1 ) )
            {
            // InternalQLS.g:7534:1: ( ( rule__IntegerValue__IntValueAssignment_1 ) )
            // InternalQLS.g:7535:2: ( rule__IntegerValue__IntValueAssignment_1 )
            {
             before(grammarAccess.getIntegerValueAccess().getIntValueAssignment_1()); 
            // InternalQLS.g:7536:2: ( rule__IntegerValue__IntValueAssignment_1 )
            // InternalQLS.g:7536:3: rule__IntegerValue__IntValueAssignment_1
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
    // InternalQLS.g:7545:1: rule__StringValue__Group__0 : rule__StringValue__Group__0__Impl rule__StringValue__Group__1 ;
    public final void rule__StringValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7549:1: ( rule__StringValue__Group__0__Impl rule__StringValue__Group__1 )
            // InternalQLS.g:7550:2: rule__StringValue__Group__0__Impl rule__StringValue__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalQLS.g:7557:1: rule__StringValue__Group__0__Impl : ( () ) ;
    public final void rule__StringValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7561:1: ( ( () ) )
            // InternalQLS.g:7562:1: ( () )
            {
            // InternalQLS.g:7562:1: ( () )
            // InternalQLS.g:7563:2: ()
            {
             before(grammarAccess.getStringValueAccess().getStringValueAction_0()); 
            // InternalQLS.g:7564:2: ()
            // InternalQLS.g:7564:3: 
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
    // InternalQLS.g:7572:1: rule__StringValue__Group__1 : rule__StringValue__Group__1__Impl ;
    public final void rule__StringValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7576:1: ( rule__StringValue__Group__1__Impl )
            // InternalQLS.g:7577:2: rule__StringValue__Group__1__Impl
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
    // InternalQLS.g:7583:1: rule__StringValue__Group__1__Impl : ( ( rule__StringValue__StringValueAssignment_1 ) ) ;
    public final void rule__StringValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7587:1: ( ( ( rule__StringValue__StringValueAssignment_1 ) ) )
            // InternalQLS.g:7588:1: ( ( rule__StringValue__StringValueAssignment_1 ) )
            {
            // InternalQLS.g:7588:1: ( ( rule__StringValue__StringValueAssignment_1 ) )
            // InternalQLS.g:7589:2: ( rule__StringValue__StringValueAssignment_1 )
            {
             before(grammarAccess.getStringValueAccess().getStringValueAssignment_1()); 
            // InternalQLS.g:7590:2: ( rule__StringValue__StringValueAssignment_1 )
            // InternalQLS.g:7590:3: rule__StringValue__StringValueAssignment_1
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
    // InternalQLS.g:7599:1: rule__BooleanValue__Group__0 : rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1 ;
    public final void rule__BooleanValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7603:1: ( rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1 )
            // InternalQLS.g:7604:2: rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1
            {
            pushFollow(FOLLOW_69);
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
    // InternalQLS.g:7611:1: rule__BooleanValue__Group__0__Impl : ( () ) ;
    public final void rule__BooleanValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7615:1: ( ( () ) )
            // InternalQLS.g:7616:1: ( () )
            {
            // InternalQLS.g:7616:1: ( () )
            // InternalQLS.g:7617:2: ()
            {
             before(grammarAccess.getBooleanValueAccess().getBooleanValueAction_0()); 
            // InternalQLS.g:7618:2: ()
            // InternalQLS.g:7618:3: 
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
    // InternalQLS.g:7626:1: rule__BooleanValue__Group__1 : rule__BooleanValue__Group__1__Impl ;
    public final void rule__BooleanValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7630:1: ( rule__BooleanValue__Group__1__Impl )
            // InternalQLS.g:7631:2: rule__BooleanValue__Group__1__Impl
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
    // InternalQLS.g:7637:1: rule__BooleanValue__Group__1__Impl : ( ( rule__BooleanValue__BooleanValueAssignment_1 ) ) ;
    public final void rule__BooleanValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7641:1: ( ( ( rule__BooleanValue__BooleanValueAssignment_1 ) ) )
            // InternalQLS.g:7642:1: ( ( rule__BooleanValue__BooleanValueAssignment_1 ) )
            {
            // InternalQLS.g:7642:1: ( ( rule__BooleanValue__BooleanValueAssignment_1 ) )
            // InternalQLS.g:7643:2: ( rule__BooleanValue__BooleanValueAssignment_1 )
            {
             before(grammarAccess.getBooleanValueAccess().getBooleanValueAssignment_1()); 
            // InternalQLS.g:7644:2: ( rule__BooleanValue__BooleanValueAssignment_1 )
            // InternalQLS.g:7644:3: rule__BooleanValue__BooleanValueAssignment_1
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
    // InternalQLS.g:7653:1: rule__EnumerationCall__Group__0 : rule__EnumerationCall__Group__0__Impl rule__EnumerationCall__Group__1 ;
    public final void rule__EnumerationCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7657:1: ( rule__EnumerationCall__Group__0__Impl rule__EnumerationCall__Group__1 )
            // InternalQLS.g:7658:2: rule__EnumerationCall__Group__0__Impl rule__EnumerationCall__Group__1
            {
            pushFollow(FOLLOW_70);
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
    // InternalQLS.g:7665:1: rule__EnumerationCall__Group__0__Impl : ( () ) ;
    public final void rule__EnumerationCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7669:1: ( ( () ) )
            // InternalQLS.g:7670:1: ( () )
            {
            // InternalQLS.g:7670:1: ( () )
            // InternalQLS.g:7671:2: ()
            {
             before(grammarAccess.getEnumerationCallAccess().getEnumerationCallAction_0()); 
            // InternalQLS.g:7672:2: ()
            // InternalQLS.g:7672:3: 
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
    // InternalQLS.g:7680:1: rule__EnumerationCall__Group__1 : rule__EnumerationCall__Group__1__Impl ;
    public final void rule__EnumerationCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7684:1: ( rule__EnumerationCall__Group__1__Impl )
            // InternalQLS.g:7685:2: rule__EnumerationCall__Group__1__Impl
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
    // InternalQLS.g:7691:1: rule__EnumerationCall__Group__1__Impl : ( ( rule__EnumerationCall__EnumerationLiteralAssignment_1 ) ) ;
    public final void rule__EnumerationCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7695:1: ( ( ( rule__EnumerationCall__EnumerationLiteralAssignment_1 ) ) )
            // InternalQLS.g:7696:1: ( ( rule__EnumerationCall__EnumerationLiteralAssignment_1 ) )
            {
            // InternalQLS.g:7696:1: ( ( rule__EnumerationCall__EnumerationLiteralAssignment_1 ) )
            // InternalQLS.g:7697:2: ( rule__EnumerationCall__EnumerationLiteralAssignment_1 )
            {
             before(grammarAccess.getEnumerationCallAccess().getEnumerationLiteralAssignment_1()); 
            // InternalQLS.g:7698:2: ( rule__EnumerationCall__EnumerationLiteralAssignment_1 )
            // InternalQLS.g:7698:3: rule__EnumerationCall__EnumerationLiteralAssignment_1
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
    // InternalQLS.g:7707:1: rule__DateValue__Group__0 : rule__DateValue__Group__0__Impl rule__DateValue__Group__1 ;
    public final void rule__DateValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7711:1: ( rule__DateValue__Group__0__Impl rule__DateValue__Group__1 )
            // InternalQLS.g:7712:2: rule__DateValue__Group__0__Impl rule__DateValue__Group__1
            {
            pushFollow(FOLLOW_71);
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
    // InternalQLS.g:7719:1: rule__DateValue__Group__0__Impl : ( () ) ;
    public final void rule__DateValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7723:1: ( ( () ) )
            // InternalQLS.g:7724:1: ( () )
            {
            // InternalQLS.g:7724:1: ( () )
            // InternalQLS.g:7725:2: ()
            {
             before(grammarAccess.getDateValueAccess().getDateValueAction_0()); 
            // InternalQLS.g:7726:2: ()
            // InternalQLS.g:7726:3: 
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
    // InternalQLS.g:7734:1: rule__DateValue__Group__1 : rule__DateValue__Group__1__Impl rule__DateValue__Group__2 ;
    public final void rule__DateValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7738:1: ( rule__DateValue__Group__1__Impl rule__DateValue__Group__2 )
            // InternalQLS.g:7739:2: rule__DateValue__Group__1__Impl rule__DateValue__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalQLS.g:7746:1: rule__DateValue__Group__1__Impl : ( 'DateValue' ) ;
    public final void rule__DateValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7750:1: ( ( 'DateValue' ) )
            // InternalQLS.g:7751:1: ( 'DateValue' )
            {
            // InternalQLS.g:7751:1: ( 'DateValue' )
            // InternalQLS.g:7752:2: 'DateValue'
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
    // InternalQLS.g:7761:1: rule__DateValue__Group__2 : rule__DateValue__Group__2__Impl rule__DateValue__Group__3 ;
    public final void rule__DateValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7765:1: ( rule__DateValue__Group__2__Impl rule__DateValue__Group__3 )
            // InternalQLS.g:7766:2: rule__DateValue__Group__2__Impl rule__DateValue__Group__3
            {
            pushFollow(FOLLOW_72);
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
    // InternalQLS.g:7773:1: rule__DateValue__Group__2__Impl : ( '{' ) ;
    public final void rule__DateValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7777:1: ( ( '{' ) )
            // InternalQLS.g:7778:1: ( '{' )
            {
            // InternalQLS.g:7778:1: ( '{' )
            // InternalQLS.g:7779:2: '{'
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
    // InternalQLS.g:7788:1: rule__DateValue__Group__3 : rule__DateValue__Group__3__Impl rule__DateValue__Group__4 ;
    public final void rule__DateValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7792:1: ( rule__DateValue__Group__3__Impl rule__DateValue__Group__4 )
            // InternalQLS.g:7793:2: rule__DateValue__Group__3__Impl rule__DateValue__Group__4
            {
            pushFollow(FOLLOW_72);
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
    // InternalQLS.g:7800:1: rule__DateValue__Group__3__Impl : ( ( rule__DateValue__Group_3__0 )? ) ;
    public final void rule__DateValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7804:1: ( ( ( rule__DateValue__Group_3__0 )? ) )
            // InternalQLS.g:7805:1: ( ( rule__DateValue__Group_3__0 )? )
            {
            // InternalQLS.g:7805:1: ( ( rule__DateValue__Group_3__0 )? )
            // InternalQLS.g:7806:2: ( rule__DateValue__Group_3__0 )?
            {
             before(grammarAccess.getDateValueAccess().getGroup_3()); 
            // InternalQLS.g:7807:2: ( rule__DateValue__Group_3__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==77) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalQLS.g:7807:3: rule__DateValue__Group_3__0
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
    // InternalQLS.g:7815:1: rule__DateValue__Group__4 : rule__DateValue__Group__4__Impl ;
    public final void rule__DateValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7819:1: ( rule__DateValue__Group__4__Impl )
            // InternalQLS.g:7820:2: rule__DateValue__Group__4__Impl
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
    // InternalQLS.g:7826:1: rule__DateValue__Group__4__Impl : ( '}' ) ;
    public final void rule__DateValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7830:1: ( ( '}' ) )
            // InternalQLS.g:7831:1: ( '}' )
            {
            // InternalQLS.g:7831:1: ( '}' )
            // InternalQLS.g:7832:2: '}'
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
    // InternalQLS.g:7842:1: rule__DateValue__Group_3__0 : rule__DateValue__Group_3__0__Impl rule__DateValue__Group_3__1 ;
    public final void rule__DateValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7846:1: ( rule__DateValue__Group_3__0__Impl rule__DateValue__Group_3__1 )
            // InternalQLS.g:7847:2: rule__DateValue__Group_3__0__Impl rule__DateValue__Group_3__1
            {
            pushFollow(FOLLOW_73);
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
    // InternalQLS.g:7854:1: rule__DateValue__Group_3__0__Impl : ( 'dateValue' ) ;
    public final void rule__DateValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7858:1: ( ( 'dateValue' ) )
            // InternalQLS.g:7859:1: ( 'dateValue' )
            {
            // InternalQLS.g:7859:1: ( 'dateValue' )
            // InternalQLS.g:7860:2: 'dateValue'
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
    // InternalQLS.g:7869:1: rule__DateValue__Group_3__1 : rule__DateValue__Group_3__1__Impl ;
    public final void rule__DateValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7873:1: ( rule__DateValue__Group_3__1__Impl )
            // InternalQLS.g:7874:2: rule__DateValue__Group_3__1__Impl
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
    // InternalQLS.g:7880:1: rule__DateValue__Group_3__1__Impl : ( ( rule__DateValue__DateValueAssignment_3_1 ) ) ;
    public final void rule__DateValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7884:1: ( ( ( rule__DateValue__DateValueAssignment_3_1 ) ) )
            // InternalQLS.g:7885:1: ( ( rule__DateValue__DateValueAssignment_3_1 ) )
            {
            // InternalQLS.g:7885:1: ( ( rule__DateValue__DateValueAssignment_3_1 ) )
            // InternalQLS.g:7886:2: ( rule__DateValue__DateValueAssignment_3_1 )
            {
             before(grammarAccess.getDateValueAccess().getDateValueAssignment_3_1()); 
            // InternalQLS.g:7887:2: ( rule__DateValue__DateValueAssignment_3_1 )
            // InternalQLS.g:7887:3: rule__DateValue__DateValueAssignment_3_1
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
    // InternalQLS.g:7896:1: rule__DecimalValue__Group__0 : rule__DecimalValue__Group__0__Impl rule__DecimalValue__Group__1 ;
    public final void rule__DecimalValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7900:1: ( rule__DecimalValue__Group__0__Impl rule__DecimalValue__Group__1 )
            // InternalQLS.g:7901:2: rule__DecimalValue__Group__0__Impl rule__DecimalValue__Group__1
            {
            pushFollow(FOLLOW_56);
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
    // InternalQLS.g:7908:1: rule__DecimalValue__Group__0__Impl : ( () ) ;
    public final void rule__DecimalValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7912:1: ( ( () ) )
            // InternalQLS.g:7913:1: ( () )
            {
            // InternalQLS.g:7913:1: ( () )
            // InternalQLS.g:7914:2: ()
            {
             before(grammarAccess.getDecimalValueAccess().getDecimalValueAction_0()); 
            // InternalQLS.g:7915:2: ()
            // InternalQLS.g:7915:3: 
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
    // InternalQLS.g:7923:1: rule__DecimalValue__Group__1 : rule__DecimalValue__Group__1__Impl ;
    public final void rule__DecimalValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7927:1: ( rule__DecimalValue__Group__1__Impl )
            // InternalQLS.g:7928:2: rule__DecimalValue__Group__1__Impl
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
    // InternalQLS.g:7934:1: rule__DecimalValue__Group__1__Impl : ( ( rule__DecimalValue__DecimalValueAssignment_1 ) ) ;
    public final void rule__DecimalValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7938:1: ( ( ( rule__DecimalValue__DecimalValueAssignment_1 ) ) )
            // InternalQLS.g:7939:1: ( ( rule__DecimalValue__DecimalValueAssignment_1 ) )
            {
            // InternalQLS.g:7939:1: ( ( rule__DecimalValue__DecimalValueAssignment_1 ) )
            // InternalQLS.g:7940:2: ( rule__DecimalValue__DecimalValueAssignment_1 )
            {
             before(grammarAccess.getDecimalValueAccess().getDecimalValueAssignment_1()); 
            // InternalQLS.g:7941:2: ( rule__DecimalValue__DecimalValueAssignment_1 )
            // InternalQLS.g:7941:3: rule__DecimalValue__DecimalValueAssignment_1
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
    // InternalQLS.g:7950:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7954:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalQLS.g:7955:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalQLS.g:7962:1: rule__EDouble__Group__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7966:1: ( ( ( RULE_INT )? ) )
            // InternalQLS.g:7967:1: ( ( RULE_INT )? )
            {
            // InternalQLS.g:7967:1: ( ( RULE_INT )? )
            // InternalQLS.g:7968:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0()); 
            // InternalQLS.g:7969:2: ( RULE_INT )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_INT) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalQLS.g:7969:3: RULE_INT
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
    // InternalQLS.g:7977:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7981:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalQLS.g:7982:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_61);
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
    // InternalQLS.g:7989:1: rule__EDouble__Group__1__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:7993:1: ( ( '.' ) )
            // InternalQLS.g:7994:1: ( '.' )
            {
            // InternalQLS.g:7994:1: ( '.' )
            // InternalQLS.g:7995:2: '.'
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
    // InternalQLS.g:8004:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8008:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalQLS.g:8009:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_74);
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
    // InternalQLS.g:8016:1: rule__EDouble__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8020:1: ( ( RULE_INT ) )
            // InternalQLS.g:8021:1: ( RULE_INT )
            {
            // InternalQLS.g:8021:1: ( RULE_INT )
            // InternalQLS.g:8022:2: RULE_INT
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
    // InternalQLS.g:8031:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8035:1: ( rule__EDouble__Group__3__Impl )
            // InternalQLS.g:8036:2: rule__EDouble__Group__3__Impl
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
    // InternalQLS.g:8042:1: rule__EDouble__Group__3__Impl : ( ( rule__EDouble__Group_3__0 )? ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8046:1: ( ( ( rule__EDouble__Group_3__0 )? ) )
            // InternalQLS.g:8047:1: ( ( rule__EDouble__Group_3__0 )? )
            {
            // InternalQLS.g:8047:1: ( ( rule__EDouble__Group_3__0 )? )
            // InternalQLS.g:8048:2: ( rule__EDouble__Group_3__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_3()); 
            // InternalQLS.g:8049:2: ( rule__EDouble__Group_3__0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=17 && LA61_0<=18)) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalQLS.g:8049:3: rule__EDouble__Group_3__0
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
    // InternalQLS.g:8058:1: rule__EDouble__Group_3__0 : rule__EDouble__Group_3__0__Impl rule__EDouble__Group_3__1 ;
    public final void rule__EDouble__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8062:1: ( rule__EDouble__Group_3__0__Impl rule__EDouble__Group_3__1 )
            // InternalQLS.g:8063:2: rule__EDouble__Group_3__0__Impl rule__EDouble__Group_3__1
            {
            pushFollow(FOLLOW_75);
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
    // InternalQLS.g:8070:1: rule__EDouble__Group_3__0__Impl : ( ( rule__EDouble__Alternatives_3_0 ) ) ;
    public final void rule__EDouble__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8074:1: ( ( ( rule__EDouble__Alternatives_3_0 ) ) )
            // InternalQLS.g:8075:1: ( ( rule__EDouble__Alternatives_3_0 ) )
            {
            // InternalQLS.g:8075:1: ( ( rule__EDouble__Alternatives_3_0 ) )
            // InternalQLS.g:8076:2: ( rule__EDouble__Alternatives_3_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_3_0()); 
            // InternalQLS.g:8077:2: ( rule__EDouble__Alternatives_3_0 )
            // InternalQLS.g:8077:3: rule__EDouble__Alternatives_3_0
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
    // InternalQLS.g:8085:1: rule__EDouble__Group_3__1 : rule__EDouble__Group_3__1__Impl rule__EDouble__Group_3__2 ;
    public final void rule__EDouble__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8089:1: ( rule__EDouble__Group_3__1__Impl rule__EDouble__Group_3__2 )
            // InternalQLS.g:8090:2: rule__EDouble__Group_3__1__Impl rule__EDouble__Group_3__2
            {
            pushFollow(FOLLOW_75);
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
    // InternalQLS.g:8097:1: rule__EDouble__Group_3__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8101:1: ( ( ( '-' )? ) )
            // InternalQLS.g:8102:1: ( ( '-' )? )
            {
            // InternalQLS.g:8102:1: ( ( '-' )? )
            // InternalQLS.g:8103:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_3_1()); 
            // InternalQLS.g:8104:2: ( '-' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==34) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalQLS.g:8104:3: '-'
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
    // InternalQLS.g:8112:1: rule__EDouble__Group_3__2 : rule__EDouble__Group_3__2__Impl ;
    public final void rule__EDouble__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8116:1: ( rule__EDouble__Group_3__2__Impl )
            // InternalQLS.g:8117:2: rule__EDouble__Group_3__2__Impl
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
    // InternalQLS.g:8123:1: rule__EDouble__Group_3__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8127:1: ( ( RULE_INT ) )
            // InternalQLS.g:8128:1: ( RULE_INT )
            {
            // InternalQLS.g:8128:1: ( RULE_INT )
            // InternalQLS.g:8129:2: RULE_INT
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
    // InternalQLS.g:8139:1: rule__QuestionDefinition__Group__0 : rule__QuestionDefinition__Group__0__Impl rule__QuestionDefinition__Group__1 ;
    public final void rule__QuestionDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8143:1: ( rule__QuestionDefinition__Group__0__Impl rule__QuestionDefinition__Group__1 )
            // InternalQLS.g:8144:2: rule__QuestionDefinition__Group__0__Impl rule__QuestionDefinition__Group__1
            {
            pushFollow(FOLLOW_76);
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
    // InternalQLS.g:8151:1: rule__QuestionDefinition__Group__0__Impl : ( ( rule__QuestionDefinition__IsMandatoryAssignment_0 )? ) ;
    public final void rule__QuestionDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8155:1: ( ( ( rule__QuestionDefinition__IsMandatoryAssignment_0 )? ) )
            // InternalQLS.g:8156:1: ( ( rule__QuestionDefinition__IsMandatoryAssignment_0 )? )
            {
            // InternalQLS.g:8156:1: ( ( rule__QuestionDefinition__IsMandatoryAssignment_0 )? )
            // InternalQLS.g:8157:2: ( rule__QuestionDefinition__IsMandatoryAssignment_0 )?
            {
             before(grammarAccess.getQuestionDefinitionAccess().getIsMandatoryAssignment_0()); 
            // InternalQLS.g:8158:2: ( rule__QuestionDefinition__IsMandatoryAssignment_0 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==86) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalQLS.g:8158:3: rule__QuestionDefinition__IsMandatoryAssignment_0
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
    // InternalQLS.g:8166:1: rule__QuestionDefinition__Group__1 : rule__QuestionDefinition__Group__1__Impl rule__QuestionDefinition__Group__2 ;
    public final void rule__QuestionDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8170:1: ( rule__QuestionDefinition__Group__1__Impl rule__QuestionDefinition__Group__2 )
            // InternalQLS.g:8171:2: rule__QuestionDefinition__Group__1__Impl rule__QuestionDefinition__Group__2
            {
            pushFollow(FOLLOW_55);
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
    // InternalQLS.g:8178:1: rule__QuestionDefinition__Group__1__Impl : ( 'question' ) ;
    public final void rule__QuestionDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8182:1: ( ( 'question' ) )
            // InternalQLS.g:8183:1: ( 'question' )
            {
            // InternalQLS.g:8183:1: ( 'question' )
            // InternalQLS.g:8184:2: 'question'
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
    // InternalQLS.g:8193:1: rule__QuestionDefinition__Group__2 : rule__QuestionDefinition__Group__2__Impl rule__QuestionDefinition__Group__3 ;
    public final void rule__QuestionDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8197:1: ( rule__QuestionDefinition__Group__2__Impl rule__QuestionDefinition__Group__3 )
            // InternalQLS.g:8198:2: rule__QuestionDefinition__Group__2__Impl rule__QuestionDefinition__Group__3
            {
            pushFollow(FOLLOW_77);
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
    // InternalQLS.g:8205:1: rule__QuestionDefinition__Group__2__Impl : ( ( rule__QuestionDefinition__NameAssignment_2 ) ) ;
    public final void rule__QuestionDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8209:1: ( ( ( rule__QuestionDefinition__NameAssignment_2 ) ) )
            // InternalQLS.g:8210:1: ( ( rule__QuestionDefinition__NameAssignment_2 ) )
            {
            // InternalQLS.g:8210:1: ( ( rule__QuestionDefinition__NameAssignment_2 ) )
            // InternalQLS.g:8211:2: ( rule__QuestionDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getNameAssignment_2()); 
            // InternalQLS.g:8212:2: ( rule__QuestionDefinition__NameAssignment_2 )
            // InternalQLS.g:8212:3: rule__QuestionDefinition__NameAssignment_2
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
    // InternalQLS.g:8220:1: rule__QuestionDefinition__Group__3 : rule__QuestionDefinition__Group__3__Impl rule__QuestionDefinition__Group__4 ;
    public final void rule__QuestionDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8224:1: ( rule__QuestionDefinition__Group__3__Impl rule__QuestionDefinition__Group__4 )
            // InternalQLS.g:8225:2: rule__QuestionDefinition__Group__3__Impl rule__QuestionDefinition__Group__4
            {
            pushFollow(FOLLOW_77);
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
    // InternalQLS.g:8232:1: rule__QuestionDefinition__Group__3__Impl : ( ( rule__QuestionDefinition__Group_3__0 )? ) ;
    public final void rule__QuestionDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8236:1: ( ( ( rule__QuestionDefinition__Group_3__0 )? ) )
            // InternalQLS.g:8237:1: ( ( rule__QuestionDefinition__Group_3__0 )? )
            {
            // InternalQLS.g:8237:1: ( ( rule__QuestionDefinition__Group_3__0 )? )
            // InternalQLS.g:8238:2: ( rule__QuestionDefinition__Group_3__0 )?
            {
             before(grammarAccess.getQuestionDefinitionAccess().getGroup_3()); 
            // InternalQLS.g:8239:2: ( rule__QuestionDefinition__Group_3__0 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==58) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalQLS.g:8239:3: rule__QuestionDefinition__Group_3__0
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
    // InternalQLS.g:8247:1: rule__QuestionDefinition__Group__4 : rule__QuestionDefinition__Group__4__Impl rule__QuestionDefinition__Group__5 ;
    public final void rule__QuestionDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8251:1: ( rule__QuestionDefinition__Group__4__Impl rule__QuestionDefinition__Group__5 )
            // InternalQLS.g:8252:2: rule__QuestionDefinition__Group__4__Impl rule__QuestionDefinition__Group__5
            {
            pushFollow(FOLLOW_55);
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
    // InternalQLS.g:8259:1: rule__QuestionDefinition__Group__4__Impl : ( ':' ) ;
    public final void rule__QuestionDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8263:1: ( ( ':' ) )
            // InternalQLS.g:8264:1: ( ':' )
            {
            // InternalQLS.g:8264:1: ( ':' )
            // InternalQLS.g:8265:2: ':'
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
    // InternalQLS.g:8274:1: rule__QuestionDefinition__Group__5 : rule__QuestionDefinition__Group__5__Impl rule__QuestionDefinition__Group__6 ;
    public final void rule__QuestionDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8278:1: ( rule__QuestionDefinition__Group__5__Impl rule__QuestionDefinition__Group__6 )
            // InternalQLS.g:8279:2: rule__QuestionDefinition__Group__5__Impl rule__QuestionDefinition__Group__6
            {
            pushFollow(FOLLOW_55);
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
    // InternalQLS.g:8286:1: rule__QuestionDefinition__Group__5__Impl : ( ( rule__QuestionDefinition__LabelAssignment_5 ) ) ;
    public final void rule__QuestionDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8290:1: ( ( ( rule__QuestionDefinition__LabelAssignment_5 ) ) )
            // InternalQLS.g:8291:1: ( ( rule__QuestionDefinition__LabelAssignment_5 ) )
            {
            // InternalQLS.g:8291:1: ( ( rule__QuestionDefinition__LabelAssignment_5 ) )
            // InternalQLS.g:8292:2: ( rule__QuestionDefinition__LabelAssignment_5 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getLabelAssignment_5()); 
            // InternalQLS.g:8293:2: ( rule__QuestionDefinition__LabelAssignment_5 )
            // InternalQLS.g:8293:3: rule__QuestionDefinition__LabelAssignment_5
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
    // InternalQLS.g:8301:1: rule__QuestionDefinition__Group__6 : rule__QuestionDefinition__Group__6__Impl rule__QuestionDefinition__Group__7 ;
    public final void rule__QuestionDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8305:1: ( rule__QuestionDefinition__Group__6__Impl rule__QuestionDefinition__Group__7 )
            // InternalQLS.g:8306:2: rule__QuestionDefinition__Group__6__Impl rule__QuestionDefinition__Group__7
            {
            pushFollow(FOLLOW_40);
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
    // InternalQLS.g:8313:1: rule__QuestionDefinition__Group__6__Impl : ( ( rule__QuestionDefinition__DataTypeAssignment_6 ) ) ;
    public final void rule__QuestionDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8317:1: ( ( ( rule__QuestionDefinition__DataTypeAssignment_6 ) ) )
            // InternalQLS.g:8318:1: ( ( rule__QuestionDefinition__DataTypeAssignment_6 ) )
            {
            // InternalQLS.g:8318:1: ( ( rule__QuestionDefinition__DataTypeAssignment_6 ) )
            // InternalQLS.g:8319:2: ( rule__QuestionDefinition__DataTypeAssignment_6 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getDataTypeAssignment_6()); 
            // InternalQLS.g:8320:2: ( rule__QuestionDefinition__DataTypeAssignment_6 )
            // InternalQLS.g:8320:3: rule__QuestionDefinition__DataTypeAssignment_6
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
    // InternalQLS.g:8328:1: rule__QuestionDefinition__Group__7 : rule__QuestionDefinition__Group__7__Impl ;
    public final void rule__QuestionDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8332:1: ( rule__QuestionDefinition__Group__7__Impl )
            // InternalQLS.g:8333:2: rule__QuestionDefinition__Group__7__Impl
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
    // InternalQLS.g:8339:1: rule__QuestionDefinition__Group__7__Impl : ( ( rule__QuestionDefinition__Group_7__0 )? ) ;
    public final void rule__QuestionDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8343:1: ( ( ( rule__QuestionDefinition__Group_7__0 )? ) )
            // InternalQLS.g:8344:1: ( ( rule__QuestionDefinition__Group_7__0 )? )
            {
            // InternalQLS.g:8344:1: ( ( rule__QuestionDefinition__Group_7__0 )? )
            // InternalQLS.g:8345:2: ( rule__QuestionDefinition__Group_7__0 )?
            {
             before(grammarAccess.getQuestionDefinitionAccess().getGroup_7()); 
            // InternalQLS.g:8346:2: ( rule__QuestionDefinition__Group_7__0 )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==12) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalQLS.g:8346:3: rule__QuestionDefinition__Group_7__0
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
    // InternalQLS.g:8355:1: rule__QuestionDefinition__Group_3__0 : rule__QuestionDefinition__Group_3__0__Impl rule__QuestionDefinition__Group_3__1 ;
    public final void rule__QuestionDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8359:1: ( rule__QuestionDefinition__Group_3__0__Impl rule__QuestionDefinition__Group_3__1 )
            // InternalQLS.g:8360:2: rule__QuestionDefinition__Group_3__0__Impl rule__QuestionDefinition__Group_3__1
            {
            pushFollow(FOLLOW_78);
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
    // InternalQLS.g:8367:1: rule__QuestionDefinition__Group_3__0__Impl : ( '(' ) ;
    public final void rule__QuestionDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8371:1: ( ( '(' ) )
            // InternalQLS.g:8372:1: ( '(' )
            {
            // InternalQLS.g:8372:1: ( '(' )
            // InternalQLS.g:8373:2: '('
            {
             before(grammarAccess.getQuestionDefinitionAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalQLS.g:8382:1: rule__QuestionDefinition__Group_3__1 : rule__QuestionDefinition__Group_3__1__Impl rule__QuestionDefinition__Group_3__2 ;
    public final void rule__QuestionDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8386:1: ( rule__QuestionDefinition__Group_3__1__Impl rule__QuestionDefinition__Group_3__2 )
            // InternalQLS.g:8387:2: rule__QuestionDefinition__Group_3__1__Impl rule__QuestionDefinition__Group_3__2
            {
            pushFollow(FOLLOW_78);
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
    // InternalQLS.g:8394:1: rule__QuestionDefinition__Group_3__1__Impl : ( ( rule__QuestionDefinition__IsDisplayedAssignment_3_1 )? ) ;
    public final void rule__QuestionDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8398:1: ( ( ( rule__QuestionDefinition__IsDisplayedAssignment_3_1 )? ) )
            // InternalQLS.g:8399:1: ( ( rule__QuestionDefinition__IsDisplayedAssignment_3_1 )? )
            {
            // InternalQLS.g:8399:1: ( ( rule__QuestionDefinition__IsDisplayedAssignment_3_1 )? )
            // InternalQLS.g:8400:2: ( rule__QuestionDefinition__IsDisplayedAssignment_3_1 )?
            {
             before(grammarAccess.getQuestionDefinitionAccess().getIsDisplayedAssignment_3_1()); 
            // InternalQLS.g:8401:2: ( rule__QuestionDefinition__IsDisplayedAssignment_3_1 )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==87) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalQLS.g:8401:3: rule__QuestionDefinition__IsDisplayedAssignment_3_1
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
    // InternalQLS.g:8409:1: rule__QuestionDefinition__Group_3__2 : rule__QuestionDefinition__Group_3__2__Impl rule__QuestionDefinition__Group_3__3 ;
    public final void rule__QuestionDefinition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8413:1: ( rule__QuestionDefinition__Group_3__2__Impl rule__QuestionDefinition__Group_3__3 )
            // InternalQLS.g:8414:2: rule__QuestionDefinition__Group_3__2__Impl rule__QuestionDefinition__Group_3__3
            {
            pushFollow(FOLLOW_78);
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
    // InternalQLS.g:8421:1: rule__QuestionDefinition__Group_3__2__Impl : ( ( rule__QuestionDefinition__Group_3_2__0 )? ) ;
    public final void rule__QuestionDefinition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8425:1: ( ( ( rule__QuestionDefinition__Group_3_2__0 )? ) )
            // InternalQLS.g:8426:1: ( ( rule__QuestionDefinition__Group_3_2__0 )? )
            {
            // InternalQLS.g:8426:1: ( ( rule__QuestionDefinition__Group_3_2__0 )? )
            // InternalQLS.g:8427:2: ( rule__QuestionDefinition__Group_3_2__0 )?
            {
             before(grammarAccess.getQuestionDefinitionAccess().getGroup_3_2()); 
            // InternalQLS.g:8428:2: ( rule__QuestionDefinition__Group_3_2__0 )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==81) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalQLS.g:8428:3: rule__QuestionDefinition__Group_3_2__0
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
    // InternalQLS.g:8436:1: rule__QuestionDefinition__Group_3__3 : rule__QuestionDefinition__Group_3__3__Impl ;
    public final void rule__QuestionDefinition__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8440:1: ( rule__QuestionDefinition__Group_3__3__Impl )
            // InternalQLS.g:8441:2: rule__QuestionDefinition__Group_3__3__Impl
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
    // InternalQLS.g:8447:1: rule__QuestionDefinition__Group_3__3__Impl : ( ')' ) ;
    public final void rule__QuestionDefinition__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8451:1: ( ( ')' ) )
            // InternalQLS.g:8452:1: ( ')' )
            {
            // InternalQLS.g:8452:1: ( ')' )
            // InternalQLS.g:8453:2: ')'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getRightParenthesisKeyword_3_3()); 
            match(input,59,FOLLOW_2); 
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
    // InternalQLS.g:8463:1: rule__QuestionDefinition__Group_3_2__0 : rule__QuestionDefinition__Group_3_2__0__Impl rule__QuestionDefinition__Group_3_2__1 ;
    public final void rule__QuestionDefinition__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8467:1: ( rule__QuestionDefinition__Group_3_2__0__Impl rule__QuestionDefinition__Group_3_2__1 )
            // InternalQLS.g:8468:2: rule__QuestionDefinition__Group_3_2__0__Impl rule__QuestionDefinition__Group_3_2__1
            {
            pushFollow(FOLLOW_79);
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
    // InternalQLS.g:8475:1: rule__QuestionDefinition__Group_3_2__0__Impl : ( 'currentValue' ) ;
    public final void rule__QuestionDefinition__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8479:1: ( ( 'currentValue' ) )
            // InternalQLS.g:8480:1: ( 'currentValue' )
            {
            // InternalQLS.g:8480:1: ( 'currentValue' )
            // InternalQLS.g:8481:2: 'currentValue'
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
    // InternalQLS.g:8490:1: rule__QuestionDefinition__Group_3_2__1 : rule__QuestionDefinition__Group_3_2__1__Impl ;
    public final void rule__QuestionDefinition__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8494:1: ( rule__QuestionDefinition__Group_3_2__1__Impl )
            // InternalQLS.g:8495:2: rule__QuestionDefinition__Group_3_2__1__Impl
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
    // InternalQLS.g:8501:1: rule__QuestionDefinition__Group_3_2__1__Impl : ( ( rule__QuestionDefinition__CurrentValueAssignment_3_2_1 ) ) ;
    public final void rule__QuestionDefinition__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8505:1: ( ( ( rule__QuestionDefinition__CurrentValueAssignment_3_2_1 ) ) )
            // InternalQLS.g:8506:1: ( ( rule__QuestionDefinition__CurrentValueAssignment_3_2_1 ) )
            {
            // InternalQLS.g:8506:1: ( ( rule__QuestionDefinition__CurrentValueAssignment_3_2_1 ) )
            // InternalQLS.g:8507:2: ( rule__QuestionDefinition__CurrentValueAssignment_3_2_1 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getCurrentValueAssignment_3_2_1()); 
            // InternalQLS.g:8508:2: ( rule__QuestionDefinition__CurrentValueAssignment_3_2_1 )
            // InternalQLS.g:8508:3: rule__QuestionDefinition__CurrentValueAssignment_3_2_1
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
    // InternalQLS.g:8517:1: rule__QuestionDefinition__Group_7__0 : rule__QuestionDefinition__Group_7__0__Impl rule__QuestionDefinition__Group_7__1 ;
    public final void rule__QuestionDefinition__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8521:1: ( rule__QuestionDefinition__Group_7__0__Impl rule__QuestionDefinition__Group_7__1 )
            // InternalQLS.g:8522:2: rule__QuestionDefinition__Group_7__0__Impl rule__QuestionDefinition__Group_7__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalQLS.g:8529:1: rule__QuestionDefinition__Group_7__0__Impl : ( '=' ) ;
    public final void rule__QuestionDefinition__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8533:1: ( ( '=' ) )
            // InternalQLS.g:8534:1: ( '=' )
            {
            // InternalQLS.g:8534:1: ( '=' )
            // InternalQLS.g:8535:2: '='
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
    // InternalQLS.g:8544:1: rule__QuestionDefinition__Group_7__1 : rule__QuestionDefinition__Group_7__1__Impl rule__QuestionDefinition__Group_7__2 ;
    public final void rule__QuestionDefinition__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8548:1: ( rule__QuestionDefinition__Group_7__1__Impl rule__QuestionDefinition__Group_7__2 )
            // InternalQLS.g:8549:2: rule__QuestionDefinition__Group_7__1__Impl rule__QuestionDefinition__Group_7__2
            {
            pushFollow(FOLLOW_80);
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
    // InternalQLS.g:8556:1: rule__QuestionDefinition__Group_7__1__Impl : ( ( rule__QuestionDefinition__ComputedExpressionAssignment_7_1 ) ) ;
    public final void rule__QuestionDefinition__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8560:1: ( ( ( rule__QuestionDefinition__ComputedExpressionAssignment_7_1 ) ) )
            // InternalQLS.g:8561:1: ( ( rule__QuestionDefinition__ComputedExpressionAssignment_7_1 ) )
            {
            // InternalQLS.g:8561:1: ( ( rule__QuestionDefinition__ComputedExpressionAssignment_7_1 ) )
            // InternalQLS.g:8562:2: ( rule__QuestionDefinition__ComputedExpressionAssignment_7_1 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getComputedExpressionAssignment_7_1()); 
            // InternalQLS.g:8563:2: ( rule__QuestionDefinition__ComputedExpressionAssignment_7_1 )
            // InternalQLS.g:8563:3: rule__QuestionDefinition__ComputedExpressionAssignment_7_1
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
    // InternalQLS.g:8571:1: rule__QuestionDefinition__Group_7__2 : rule__QuestionDefinition__Group_7__2__Impl ;
    public final void rule__QuestionDefinition__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8575:1: ( rule__QuestionDefinition__Group_7__2__Impl )
            // InternalQLS.g:8576:2: rule__QuestionDefinition__Group_7__2__Impl
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
    // InternalQLS.g:8582:1: rule__QuestionDefinition__Group_7__2__Impl : ( ';' ) ;
    public final void rule__QuestionDefinition__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8586:1: ( ( ';' ) )
            // InternalQLS.g:8587:1: ( ';' )
            {
            // InternalQLS.g:8587:1: ( ';' )
            // InternalQLS.g:8588:2: ';'
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
    // InternalQLS.g:8598:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8602:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalQLS.g:8603:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_81);
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
    // InternalQLS.g:8610:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8614:1: ( ( RULE_ID ) )
            // InternalQLS.g:8615:1: ( RULE_ID )
            {
            // InternalQLS.g:8615:1: ( RULE_ID )
            // InternalQLS.g:8616:2: RULE_ID
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
    // InternalQLS.g:8625:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8629:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalQLS.g:8630:2: rule__QualifiedName__Group__1__Impl
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
    // InternalQLS.g:8636:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8640:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalQLS.g:8641:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalQLS.g:8641:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalQLS.g:8642:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalQLS.g:8643:2: ( rule__QualifiedName__Group_1__0 )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==78) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalQLS.g:8643:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_82);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop68;
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
    // InternalQLS.g:8652:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8656:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalQLS.g:8657:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalQLS.g:8664:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8668:1: ( ( '.' ) )
            // InternalQLS.g:8669:1: ( '.' )
            {
            // InternalQLS.g:8669:1: ( '.' )
            // InternalQLS.g:8670:2: '.'
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
    // InternalQLS.g:8679:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8683:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalQLS.g:8684:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalQLS.g:8690:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8694:1: ( ( RULE_ID ) )
            // InternalQLS.g:8695:1: ( RULE_ID )
            {
            // InternalQLS.g:8695:1: ( RULE_ID )
            // InternalQLS.g:8696:2: RULE_ID
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
    // InternalQLS.g:8706:1: rule__QLSModel__ImportsAssignment_1 : ( ruleImport ) ;
    public final void rule__QLSModel__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8710:1: ( ( ruleImport ) )
            // InternalQLS.g:8711:2: ( ruleImport )
            {
            // InternalQLS.g:8711:2: ( ruleImport )
            // InternalQLS.g:8712:3: ruleImport
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


    // $ANTLR start "rule__QLSModel__StyledQLModelAssignment_3"
    // InternalQLS.g:8721:1: rule__QLSModel__StyledQLModelAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__QLSModel__StyledQLModelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8725:1: ( ( ( ruleQualifiedName ) ) )
            // InternalQLS.g:8726:2: ( ( ruleQualifiedName ) )
            {
            // InternalQLS.g:8726:2: ( ( ruleQualifiedName ) )
            // InternalQLS.g:8727:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getQLSModelAccess().getStyledQLModelQLModelCrossReference_3_0()); 
            // InternalQLS.g:8728:3: ( ruleQualifiedName )
            // InternalQLS.g:8729:4: ruleQualifiedName
            {
             before(grammarAccess.getQLSModelAccess().getStyledQLModelQLModelQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQLSModelAccess().getStyledQLModelQLModelQualifiedNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getQLSModelAccess().getStyledQLModelQLModelCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLSModel__StyledQLModelAssignment_3"


    // $ANTLR start "rule__QLSModel__QuestionStylesAssignment_7"
    // InternalQLS.g:8740:1: rule__QLSModel__QuestionStylesAssignment_7 : ( ruleQuestionStyle ) ;
    public final void rule__QLSModel__QuestionStylesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8744:1: ( ( ruleQuestionStyle ) )
            // InternalQLS.g:8745:2: ( ruleQuestionStyle )
            {
            // InternalQLS.g:8745:2: ( ruleQuestionStyle )
            // InternalQLS.g:8746:3: ruleQuestionStyle
            {
             before(grammarAccess.getQLSModelAccess().getQuestionStylesQuestionStyleParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestionStyle();

            state._fsp--;

             after(grammarAccess.getQLSModelAccess().getQuestionStylesQuestionStyleParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLSModel__QuestionStylesAssignment_7"


    // $ANTLR start "rule__QLSModel__SectionsAssignment_9"
    // InternalQLS.g:8755:1: rule__QLSModel__SectionsAssignment_9 : ( ruleSection ) ;
    public final void rule__QLSModel__SectionsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8759:1: ( ( ruleSection ) )
            // InternalQLS.g:8760:2: ( ruleSection )
            {
            // InternalQLS.g:8760:2: ( ruleSection )
            // InternalQLS.g:8761:3: ruleSection
            {
             before(grammarAccess.getQLSModelAccess().getSectionsSectionParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getQLSModelAccess().getSectionsSectionParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLSModel__SectionsAssignment_9"


    // $ANTLR start "rule__Import__ImportURIAssignment_2"
    // InternalQLS.g:8770:1: rule__Import__ImportURIAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8774:1: ( ( RULE_STRING ) )
            // InternalQLS.g:8775:2: ( RULE_STRING )
            {
            // InternalQLS.g:8775:2: ( RULE_STRING )
            // InternalQLS.g:8776:3: RULE_STRING
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


    // $ANTLR start "rule__Section__TitleAssignment_2"
    // InternalQLS.g:8785:1: rule__Section__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Section__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8789:1: ( ( RULE_STRING ) )
            // InternalQLS.g:8790:2: ( RULE_STRING )
            {
            // InternalQLS.g:8790:2: ( RULE_STRING )
            // InternalQLS.g:8791:3: RULE_STRING
            {
             before(grammarAccess.getSectionAccess().getTitleSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getTitleSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__TitleAssignment_2"


    // $ANTLR start "rule__Section__SectionContentsAssignment_4"
    // InternalQLS.g:8800:1: rule__Section__SectionContentsAssignment_4 : ( ruleSectionContent ) ;
    public final void rule__Section__SectionContentsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8804:1: ( ( ruleSectionContent ) )
            // InternalQLS.g:8805:2: ( ruleSectionContent )
            {
            // InternalQLS.g:8805:2: ( ruleSectionContent )
            // InternalQLS.g:8806:3: ruleSectionContent
            {
             before(grammarAccess.getSectionAccess().getSectionContentsSectionContentParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSectionContent();

            state._fsp--;

             after(grammarAccess.getSectionAccess().getSectionContentsSectionContentParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__SectionContentsAssignment_4"


    // $ANTLR start "rule__QuestionReference__QuestionAssignment_1"
    // InternalQLS.g:8815:1: rule__QuestionReference__QuestionAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__QuestionReference__QuestionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8819:1: ( ( ( ruleQualifiedName ) ) )
            // InternalQLS.g:8820:2: ( ( ruleQualifiedName ) )
            {
            // InternalQLS.g:8820:2: ( ( ruleQualifiedName ) )
            // InternalQLS.g:8821:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getQuestionReferenceAccess().getQuestionQuestionDefinitionCrossReference_1_0()); 
            // InternalQLS.g:8822:3: ( ruleQualifiedName )
            // InternalQLS.g:8823:4: ruleQualifiedName
            {
             before(grammarAccess.getQuestionReferenceAccess().getQuestionQuestionDefinitionQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQuestionReferenceAccess().getQuestionQuestionDefinitionQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getQuestionReferenceAccess().getQuestionQuestionDefinitionCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionReference__QuestionAssignment_1"


    // $ANTLR start "rule__QuestionStyle__StyledQuestionAssignment_1"
    // InternalQLS.g:8834:1: rule__QuestionStyle__StyledQuestionAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__QuestionStyle__StyledQuestionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8838:1: ( ( ( ruleQualifiedName ) ) )
            // InternalQLS.g:8839:2: ( ( ruleQualifiedName ) )
            {
            // InternalQLS.g:8839:2: ( ( ruleQualifiedName ) )
            // InternalQLS.g:8840:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getQuestionStyleAccess().getStyledQuestionQuestionDefinitionCrossReference_1_0()); 
            // InternalQLS.g:8841:3: ( ruleQualifiedName )
            // InternalQLS.g:8842:4: ruleQualifiedName
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
    // InternalQLS.g:8853:1: rule__QuestionStyle__LabelStyleAssignment_3_1 : ( ruleLabelStyle ) ;
    public final void rule__QuestionStyle__LabelStyleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8857:1: ( ( ruleLabelStyle ) )
            // InternalQLS.g:8858:2: ( ruleLabelStyle )
            {
            // InternalQLS.g:8858:2: ( ruleLabelStyle )
            // InternalQLS.g:8859:3: ruleLabelStyle
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
    // InternalQLS.g:8868:1: rule__QuestionStyle__TypeStyleAssignment_4_1 : ( ruleTypeStyle ) ;
    public final void rule__QuestionStyle__TypeStyleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8872:1: ( ( ruleTypeStyle ) )
            // InternalQLS.g:8873:2: ( ruleTypeStyle )
            {
            // InternalQLS.g:8873:2: ( ruleTypeStyle )
            // InternalQLS.g:8874:3: ruleTypeStyle
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
    // InternalQLS.g:8883:1: rule__LabelStyle__ItalicAssignment_2 : ( ( 'italic' ) ) ;
    public final void rule__LabelStyle__ItalicAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8887:1: ( ( ( 'italic' ) ) )
            // InternalQLS.g:8888:2: ( ( 'italic' ) )
            {
            // InternalQLS.g:8888:2: ( ( 'italic' ) )
            // InternalQLS.g:8889:3: ( 'italic' )
            {
             before(grammarAccess.getLabelStyleAccess().getItalicItalicKeyword_2_0()); 
            // InternalQLS.g:8890:3: ( 'italic' )
            // InternalQLS.g:8891:4: 'italic'
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
    // InternalQLS.g:8902:1: rule__LabelStyle__BoldAssignment_3 : ( ( 'bold' ) ) ;
    public final void rule__LabelStyle__BoldAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8906:1: ( ( ( 'bold' ) ) )
            // InternalQLS.g:8907:2: ( ( 'bold' ) )
            {
            // InternalQLS.g:8907:2: ( ( 'bold' ) )
            // InternalQLS.g:8908:3: ( 'bold' )
            {
             before(grammarAccess.getLabelStyleAccess().getBoldBoldKeyword_3_0()); 
            // InternalQLS.g:8909:3: ( 'bold' )
            // InternalQLS.g:8910:4: 'bold'
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
    // InternalQLS.g:8921:1: rule__BooleanTypeStyle__BooleanStyleKindAssignment_2 : ( ruleBooleanStyleKind ) ;
    public final void rule__BooleanTypeStyle__BooleanStyleKindAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8925:1: ( ( ruleBooleanStyleKind ) )
            // InternalQLS.g:8926:2: ( ruleBooleanStyleKind )
            {
            // InternalQLS.g:8926:2: ( ruleBooleanStyleKind )
            // InternalQLS.g:8927:3: ruleBooleanStyleKind
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


    // $ANTLR start "rule__NumericTypeSpinnerStyle__StepAssignment_4_1"
    // InternalQLS.g:8936:1: rule__NumericTypeSpinnerStyle__StepAssignment_4_1 : ( ruleEDouble ) ;
    public final void rule__NumericTypeSpinnerStyle__StepAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8940:1: ( ( ruleEDouble ) )
            // InternalQLS.g:8941:2: ( ruleEDouble )
            {
            // InternalQLS.g:8941:2: ( ruleEDouble )
            // InternalQLS.g:8942:3: ruleEDouble
            {
             before(grammarAccess.getNumericTypeSpinnerStyleAccess().getStepEDoubleParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getNumericTypeSpinnerStyleAccess().getStepEDoubleParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericTypeSpinnerStyle__StepAssignment_4_1"


    // $ANTLR start "rule__TextTypeStyle__MultilineAssignment_3"
    // InternalQLS.g:8951:1: rule__TextTypeStyle__MultilineAssignment_3 : ( ( 'multiline' ) ) ;
    public final void rule__TextTypeStyle__MultilineAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8955:1: ( ( ( 'multiline' ) ) )
            // InternalQLS.g:8956:2: ( ( 'multiline' ) )
            {
            // InternalQLS.g:8956:2: ( ( 'multiline' ) )
            // InternalQLS.g:8957:3: ( 'multiline' )
            {
             before(grammarAccess.getTextTypeStyleAccess().getMultilineMultilineKeyword_3_0()); 
            // InternalQLS.g:8958:3: ( 'multiline' )
            // InternalQLS.g:8959:4: 'multiline'
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
    // InternalQLS.g:8970:1: rule__UnaryExpression__OperatorAssignment_1 : ( ruleUnaryOperatorKind ) ;
    public final void rule__UnaryExpression__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8974:1: ( ( ruleUnaryOperatorKind ) )
            // InternalQLS.g:8975:2: ( ruleUnaryOperatorKind )
            {
            // InternalQLS.g:8975:2: ( ruleUnaryOperatorKind )
            // InternalQLS.g:8976:3: ruleUnaryOperatorKind
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
    // InternalQLS.g:8985:1: rule__UnaryExpression__OperandAssignment_2 : ( ruleUnaryOrPrimaryExpression ) ;
    public final void rule__UnaryExpression__OperandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:8989:1: ( ( ruleUnaryOrPrimaryExpression ) )
            // InternalQLS.g:8990:2: ( ruleUnaryOrPrimaryExpression )
            {
            // InternalQLS.g:8990:2: ( ruleUnaryOrPrimaryExpression )
            // InternalQLS.g:8991:3: ruleUnaryOrPrimaryExpression
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
    // InternalQLS.g:9000:1: rule__IfExpression__ConditionAssignment_2 : ( ruleExpression ) ;
    public final void rule__IfExpression__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9004:1: ( ( ruleExpression ) )
            // InternalQLS.g:9005:2: ( ruleExpression )
            {
            // InternalQLS.g:9005:2: ( ruleExpression )
            // InternalQLS.g:9006:3: ruleExpression
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
    // InternalQLS.g:9015:1: rule__IfExpression__ThenExpressionAssignment_4 : ( ruleExpression ) ;
    public final void rule__IfExpression__ThenExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9019:1: ( ( ruleExpression ) )
            // InternalQLS.g:9020:2: ( ruleExpression )
            {
            // InternalQLS.g:9020:2: ( ruleExpression )
            // InternalQLS.g:9021:3: ruleExpression
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
    // InternalQLS.g:9030:1: rule__IfExpression__ElseExpressionAssignment_5_1 : ( ruleExpression ) ;
    public final void rule__IfExpression__ElseExpressionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9034:1: ( ( ruleExpression ) )
            // InternalQLS.g:9035:2: ( ruleExpression )
            {
            // InternalQLS.g:9035:2: ( ruleExpression )
            // InternalQLS.g:9036:3: ruleExpression
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
    // InternalQLS.g:9045:1: rule__OrExpression__OperatorAssignment_1_1 : ( ruleOrOperatorKind ) ;
    public final void rule__OrExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9049:1: ( ( ruleOrOperatorKind ) )
            // InternalQLS.g:9050:2: ( ruleOrOperatorKind )
            {
            // InternalQLS.g:9050:2: ( ruleOrOperatorKind )
            // InternalQLS.g:9051:3: ruleOrOperatorKind
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
    // InternalQLS.g:9060:1: rule__OrExpression__RhsOperandAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__RhsOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9064:1: ( ( ruleAndExpression ) )
            // InternalQLS.g:9065:2: ( ruleAndExpression )
            {
            // InternalQLS.g:9065:2: ( ruleAndExpression )
            // InternalQLS.g:9066:3: ruleAndExpression
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
    // InternalQLS.g:9075:1: rule__AndExpression__OperatorAssignment_1_1 : ( ruleAndOperatorKind ) ;
    public final void rule__AndExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9079:1: ( ( ruleAndOperatorKind ) )
            // InternalQLS.g:9080:2: ( ruleAndOperatorKind )
            {
            // InternalQLS.g:9080:2: ( ruleAndOperatorKind )
            // InternalQLS.g:9081:3: ruleAndOperatorKind
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
    // InternalQLS.g:9090:1: rule__AndExpression__RhsOperandAssignment_1_2 : ( ruleEqualExpression ) ;
    public final void rule__AndExpression__RhsOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9094:1: ( ( ruleEqualExpression ) )
            // InternalQLS.g:9095:2: ( ruleEqualExpression )
            {
            // InternalQLS.g:9095:2: ( ruleEqualExpression )
            // InternalQLS.g:9096:3: ruleEqualExpression
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
    // InternalQLS.g:9105:1: rule__EqualExpression__OperatorAssignment_1_1 : ( ruleEqualOperatorKind ) ;
    public final void rule__EqualExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9109:1: ( ( ruleEqualOperatorKind ) )
            // InternalQLS.g:9110:2: ( ruleEqualOperatorKind )
            {
            // InternalQLS.g:9110:2: ( ruleEqualOperatorKind )
            // InternalQLS.g:9111:3: ruleEqualOperatorKind
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
    // InternalQLS.g:9120:1: rule__EqualExpression__RhsOperandAssignment_1_2 : ( ruleComparisionExpression ) ;
    public final void rule__EqualExpression__RhsOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9124:1: ( ( ruleComparisionExpression ) )
            // InternalQLS.g:9125:2: ( ruleComparisionExpression )
            {
            // InternalQLS.g:9125:2: ( ruleComparisionExpression )
            // InternalQLS.g:9126:3: ruleComparisionExpression
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
    // InternalQLS.g:9135:1: rule__ComparisionExpression__OperatorAssignment_1_1 : ( ruleComparisionOperatorKind ) ;
    public final void rule__ComparisionExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9139:1: ( ( ruleComparisionOperatorKind ) )
            // InternalQLS.g:9140:2: ( ruleComparisionOperatorKind )
            {
            // InternalQLS.g:9140:2: ( ruleComparisionOperatorKind )
            // InternalQLS.g:9141:3: ruleComparisionOperatorKind
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
    // InternalQLS.g:9150:1: rule__ComparisionExpression__RhsOperandAssignment_1_2 : ( ruleAdditionExpression ) ;
    public final void rule__ComparisionExpression__RhsOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9154:1: ( ( ruleAdditionExpression ) )
            // InternalQLS.g:9155:2: ( ruleAdditionExpression )
            {
            // InternalQLS.g:9155:2: ( ruleAdditionExpression )
            // InternalQLS.g:9156:3: ruleAdditionExpression
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
    // InternalQLS.g:9165:1: rule__AdditionExpression__OperatorAssignment_1_1 : ( ruleAdditionOperatorKind ) ;
    public final void rule__AdditionExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9169:1: ( ( ruleAdditionOperatorKind ) )
            // InternalQLS.g:9170:2: ( ruleAdditionOperatorKind )
            {
            // InternalQLS.g:9170:2: ( ruleAdditionOperatorKind )
            // InternalQLS.g:9171:3: ruleAdditionOperatorKind
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
    // InternalQLS.g:9180:1: rule__AdditionExpression__RhsOperandAssignment_1_2 : ( ruleMultiplicationExpression ) ;
    public final void rule__AdditionExpression__RhsOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9184:1: ( ( ruleMultiplicationExpression ) )
            // InternalQLS.g:9185:2: ( ruleMultiplicationExpression )
            {
            // InternalQLS.g:9185:2: ( ruleMultiplicationExpression )
            // InternalQLS.g:9186:3: ruleMultiplicationExpression
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
    // InternalQLS.g:9195:1: rule__MultiplicationExpression__OperatorAssignment_1_1 : ( ruleMultiplicationOperatorKind ) ;
    public final void rule__MultiplicationExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9199:1: ( ( ruleMultiplicationOperatorKind ) )
            // InternalQLS.g:9200:2: ( ruleMultiplicationOperatorKind )
            {
            // InternalQLS.g:9200:2: ( ruleMultiplicationOperatorKind )
            // InternalQLS.g:9201:3: ruleMultiplicationOperatorKind
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
    // InternalQLS.g:9210:1: rule__MultiplicationExpression__RhsOperandAssignment_1_2 : ( ruleUnaryOrPrimaryExpression ) ;
    public final void rule__MultiplicationExpression__RhsOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9214:1: ( ( ruleUnaryOrPrimaryExpression ) )
            // InternalQLS.g:9215:2: ( ruleUnaryOrPrimaryExpression )
            {
            // InternalQLS.g:9215:2: ( ruleUnaryOrPrimaryExpression )
            // InternalQLS.g:9216:3: ruleUnaryOrPrimaryExpression
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


    // $ANTLR start "rule__DefinitionGroup__QuestionDefinitionsAssignment_2_0"
    // InternalQLS.g:9225:1: rule__DefinitionGroup__QuestionDefinitionsAssignment_2_0 : ( ruleQuestionDefinition ) ;
    public final void rule__DefinitionGroup__QuestionDefinitionsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9229:1: ( ( ruleQuestionDefinition ) )
            // InternalQLS.g:9230:2: ( ruleQuestionDefinition )
            {
            // InternalQLS.g:9230:2: ( ruleQuestionDefinition )
            // InternalQLS.g:9231:3: ruleQuestionDefinition
            {
             before(grammarAccess.getDefinitionGroupAccess().getQuestionDefinitionsQuestionDefinitionParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestionDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionGroupAccess().getQuestionDefinitionsQuestionDefinitionParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__QuestionDefinitionsAssignment_2_0"


    // $ANTLR start "rule__DefinitionGroup__DataTypesAssignment_2_1"
    // InternalQLS.g:9240:1: rule__DefinitionGroup__DataTypesAssignment_2_1 : ( ruleValueType ) ;
    public final void rule__DefinitionGroup__DataTypesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9244:1: ( ( ruleValueType ) )
            // InternalQLS.g:9245:2: ( ruleValueType )
            {
            // InternalQLS.g:9245:2: ( ruleValueType )
            // InternalQLS.g:9246:3: ruleValueType
            {
             before(grammarAccess.getDefinitionGroupAccess().getDataTypesValueTypeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValueType();

            state._fsp--;

             after(grammarAccess.getDefinitionGroupAccess().getDataTypesValueTypeParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__DataTypesAssignment_2_1"


    // $ANTLR start "rule__QuestionGroup__GuardAssignment_1_1"
    // InternalQLS.g:9255:1: rule__QuestionGroup__GuardAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__QuestionGroup__GuardAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9259:1: ( ( ruleExpression ) )
            // InternalQLS.g:9260:2: ( ruleExpression )
            {
            // InternalQLS.g:9260:2: ( ruleExpression )
            // InternalQLS.g:9261:3: ruleExpression
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
    // InternalQLS.g:9270:1: rule__QuestionGroup__QuestionGroupsAssignment_3_0 : ( ruleQuestionGroup ) ;
    public final void rule__QuestionGroup__QuestionGroupsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9274:1: ( ( ruleQuestionGroup ) )
            // InternalQLS.g:9275:2: ( ruleQuestionGroup )
            {
            // InternalQLS.g:9275:2: ( ruleQuestionGroup )
            // InternalQLS.g:9276:3: ruleQuestionGroup
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
    // InternalQLS.g:9285:1: rule__QuestionGroup__QuestionsAssignment_3_1 : ( ruleQuestion ) ;
    public final void rule__QuestionGroup__QuestionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9289:1: ( ( ruleQuestion ) )
            // InternalQLS.g:9290:2: ( ruleQuestion )
            {
            // InternalQLS.g:9290:2: ( ruleQuestion )
            // InternalQLS.g:9291:3: ruleQuestion
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
    // InternalQLS.g:9300:1: rule__Question__QuestionDefinitionAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__Question__QuestionDefinitionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9304:1: ( ( ( ruleQualifiedName ) ) )
            // InternalQLS.g:9305:2: ( ( ruleQualifiedName ) )
            {
            // InternalQLS.g:9305:2: ( ( ruleQualifiedName ) )
            // InternalQLS.g:9306:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getQuestionAccess().getQuestionDefinitionQuestionDefinitionCrossReference_0()); 
            // InternalQLS.g:9307:3: ( ruleQualifiedName )
            // InternalQLS.g:9308:4: ruleQualifiedName
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
    // InternalQLS.g:9319:1: rule__ValueType_Impl__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ValueType_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9323:1: ( ( RULE_ID ) )
            // InternalQLS.g:9324:2: ( RULE_ID )
            {
            // InternalQLS.g:9324:2: ( RULE_ID )
            // InternalQLS.g:9325:3: RULE_ID
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
    // InternalQLS.g:9334:1: rule__ValueType_Impl__UnitAssignment_4_1 : ( ruleEString ) ;
    public final void rule__ValueType_Impl__UnitAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9338:1: ( ( ruleEString ) )
            // InternalQLS.g:9339:2: ( ruleEString )
            {
            // InternalQLS.g:9339:2: ( ruleEString )
            // InternalQLS.g:9340:3: ruleEString
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
    // InternalQLS.g:9349:1: rule__ConstantCall__ValueAssignment_1 : ( ( rule__ConstantCall__ValueAlternatives_1_0 ) ) ;
    public final void rule__ConstantCall__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9353:1: ( ( ( rule__ConstantCall__ValueAlternatives_1_0 ) ) )
            // InternalQLS.g:9354:2: ( ( rule__ConstantCall__ValueAlternatives_1_0 ) )
            {
            // InternalQLS.g:9354:2: ( ( rule__ConstantCall__ValueAlternatives_1_0 ) )
            // InternalQLS.g:9355:3: ( rule__ConstantCall__ValueAlternatives_1_0 )
            {
             before(grammarAccess.getConstantCallAccess().getValueAlternatives_1_0()); 
            // InternalQLS.g:9356:3: ( rule__ConstantCall__ValueAlternatives_1_0 )
            // InternalQLS.g:9356:4: rule__ConstantCall__ValueAlternatives_1_0
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
    // InternalQLS.g:9364:1: rule__QuestionCall__QuestionAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__QuestionCall__QuestionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9368:1: ( ( ( ruleQualifiedName ) ) )
            // InternalQLS.g:9369:2: ( ( ruleQualifiedName ) )
            {
            // InternalQLS.g:9369:2: ( ( ruleQualifiedName ) )
            // InternalQLS.g:9370:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getQuestionCallAccess().getQuestionQuestionDefinitionCrossReference_1_0()); 
            // InternalQLS.g:9371:3: ( ruleQualifiedName )
            // InternalQLS.g:9372:4: ruleQualifiedName
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
    // InternalQLS.g:9383:1: rule__BooleanValueType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BooleanValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9387:1: ( ( RULE_ID ) )
            // InternalQLS.g:9388:2: ( RULE_ID )
            {
            // InternalQLS.g:9388:2: ( RULE_ID )
            // InternalQLS.g:9389:3: RULE_ID
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
    // InternalQLS.g:9398:1: rule__BooleanValueType__UnitAssignment_3_1_1 : ( ruleEString ) ;
    public final void rule__BooleanValueType__UnitAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9402:1: ( ( ruleEString ) )
            // InternalQLS.g:9403:2: ( ruleEString )
            {
            // InternalQLS.g:9403:2: ( ruleEString )
            // InternalQLS.g:9404:3: ruleEString
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
    // InternalQLS.g:9413:1: rule__IntegerValueType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__IntegerValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9417:1: ( ( RULE_ID ) )
            // InternalQLS.g:9418:2: ( RULE_ID )
            {
            // InternalQLS.g:9418:2: ( RULE_ID )
            // InternalQLS.g:9419:3: RULE_ID
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
    // InternalQLS.g:9428:1: rule__IntegerValueType__UnitAssignment_3_1_1 : ( ruleEString ) ;
    public final void rule__IntegerValueType__UnitAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9432:1: ( ( ruleEString ) )
            // InternalQLS.g:9433:2: ( ruleEString )
            {
            // InternalQLS.g:9433:2: ( ruleEString )
            // InternalQLS.g:9434:3: ruleEString
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
    // InternalQLS.g:9443:1: rule__IntegerValueType__MinAssignment_3_2_1 : ( ruleEInt ) ;
    public final void rule__IntegerValueType__MinAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9447:1: ( ( ruleEInt ) )
            // InternalQLS.g:9448:2: ( ruleEInt )
            {
            // InternalQLS.g:9448:2: ( ruleEInt )
            // InternalQLS.g:9449:3: ruleEInt
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
    // InternalQLS.g:9458:1: rule__IntegerValueType__MaxAssignment_3_3_1 : ( ruleEInt ) ;
    public final void rule__IntegerValueType__MaxAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9462:1: ( ( ruleEInt ) )
            // InternalQLS.g:9463:2: ( ruleEInt )
            {
            // InternalQLS.g:9463:2: ( ruleEInt )
            // InternalQLS.g:9464:3: ruleEInt
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
    // InternalQLS.g:9473:1: rule__DecimalValueType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DecimalValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9477:1: ( ( RULE_ID ) )
            // InternalQLS.g:9478:2: ( RULE_ID )
            {
            // InternalQLS.g:9478:2: ( RULE_ID )
            // InternalQLS.g:9479:3: RULE_ID
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
    // InternalQLS.g:9488:1: rule__DecimalValueType__UnitAssignment_3_1_1 : ( ruleEString ) ;
    public final void rule__DecimalValueType__UnitAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9492:1: ( ( ruleEString ) )
            // InternalQLS.g:9493:2: ( ruleEString )
            {
            // InternalQLS.g:9493:2: ( ruleEString )
            // InternalQLS.g:9494:3: ruleEString
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
    // InternalQLS.g:9503:1: rule__DateValueType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DateValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9507:1: ( ( RULE_ID ) )
            // InternalQLS.g:9508:2: ( RULE_ID )
            {
            // InternalQLS.g:9508:2: ( RULE_ID )
            // InternalQLS.g:9509:3: RULE_ID
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
    // InternalQLS.g:9518:1: rule__DateValueType__UnitAssignment_3_1_1 : ( ruleEString ) ;
    public final void rule__DateValueType__UnitAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9522:1: ( ( ruleEString ) )
            // InternalQLS.g:9523:2: ( ruleEString )
            {
            // InternalQLS.g:9523:2: ( ruleEString )
            // InternalQLS.g:9524:3: ruleEString
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
    // InternalQLS.g:9533:1: rule__EnumerationValueType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EnumerationValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9537:1: ( ( RULE_ID ) )
            // InternalQLS.g:9538:2: ( RULE_ID )
            {
            // InternalQLS.g:9538:2: ( RULE_ID )
            // InternalQLS.g:9539:3: RULE_ID
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
    // InternalQLS.g:9548:1: rule__EnumerationValueType__UnitAssignment_3_1_1 : ( ruleEString ) ;
    public final void rule__EnumerationValueType__UnitAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9552:1: ( ( ruleEString ) )
            // InternalQLS.g:9553:2: ( ruleEString )
            {
            // InternalQLS.g:9553:2: ( ruleEString )
            // InternalQLS.g:9554:3: ruleEString
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
    // InternalQLS.g:9563:1: rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2 : ( ruleEnumerationLiteral ) ;
    public final void rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9567:1: ( ( ruleEnumerationLiteral ) )
            // InternalQLS.g:9568:2: ( ruleEnumerationLiteral )
            {
            // InternalQLS.g:9568:2: ( ruleEnumerationLiteral )
            // InternalQLS.g:9569:3: ruleEnumerationLiteral
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
    // InternalQLS.g:9578:1: rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1 : ( ruleEnumerationLiteral ) ;
    public final void rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9582:1: ( ( ruleEnumerationLiteral ) )
            // InternalQLS.g:9583:2: ( ruleEnumerationLiteral )
            {
            // InternalQLS.g:9583:2: ( ruleEnumerationLiteral )
            // InternalQLS.g:9584:3: ruleEnumerationLiteral
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
    // InternalQLS.g:9593:1: rule__StringValueType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__StringValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9597:1: ( ( RULE_ID ) )
            // InternalQLS.g:9598:2: ( RULE_ID )
            {
            // InternalQLS.g:9598:2: ( RULE_ID )
            // InternalQLS.g:9599:3: RULE_ID
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
    // InternalQLS.g:9608:1: rule__StringValueType__UnitAssignment_3_1_1 : ( ruleEString ) ;
    public final void rule__StringValueType__UnitAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9612:1: ( ( ruleEString ) )
            // InternalQLS.g:9613:2: ( ruleEString )
            {
            // InternalQLS.g:9613:2: ( ruleEString )
            // InternalQLS.g:9614:3: ruleEString
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
    // InternalQLS.g:9623:1: rule__EnumerationLiteral__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumerationLiteral__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9627:1: ( ( RULE_ID ) )
            // InternalQLS.g:9628:2: ( RULE_ID )
            {
            // InternalQLS.g:9628:2: ( RULE_ID )
            // InternalQLS.g:9629:3: RULE_ID
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
    // InternalQLS.g:9638:1: rule__IntegerValue__IntValueAssignment_1 : ( ruleEInt ) ;
    public final void rule__IntegerValue__IntValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9642:1: ( ( ruleEInt ) )
            // InternalQLS.g:9643:2: ( ruleEInt )
            {
            // InternalQLS.g:9643:2: ( ruleEInt )
            // InternalQLS.g:9644:3: ruleEInt
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
    // InternalQLS.g:9653:1: rule__StringValue__StringValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StringValue__StringValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9657:1: ( ( RULE_STRING ) )
            // InternalQLS.g:9658:2: ( RULE_STRING )
            {
            // InternalQLS.g:9658:2: ( RULE_STRING )
            // InternalQLS.g:9659:3: RULE_STRING
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
    // InternalQLS.g:9668:1: rule__BooleanValue__BooleanValueAssignment_1 : ( ruleEBoolean ) ;
    public final void rule__BooleanValue__BooleanValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9672:1: ( ( ruleEBoolean ) )
            // InternalQLS.g:9673:2: ( ruleEBoolean )
            {
            // InternalQLS.g:9673:2: ( ruleEBoolean )
            // InternalQLS.g:9674:3: ruleEBoolean
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
    // InternalQLS.g:9683:1: rule__EnumerationCall__EnumerationLiteralAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EnumerationCall__EnumerationLiteralAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9687:1: ( ( ( ruleQualifiedName ) ) )
            // InternalQLS.g:9688:2: ( ( ruleQualifiedName ) )
            {
            // InternalQLS.g:9688:2: ( ( ruleQualifiedName ) )
            // InternalQLS.g:9689:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getEnumerationCallAccess().getEnumerationLiteralEnumerationLiteralCrossReference_1_0()); 
            // InternalQLS.g:9690:3: ( ruleQualifiedName )
            // InternalQLS.g:9691:4: ruleQualifiedName
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
    // InternalQLS.g:9702:1: rule__DateValue__DateValueAssignment_3_1 : ( ruleEDate ) ;
    public final void rule__DateValue__DateValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9706:1: ( ( ruleEDate ) )
            // InternalQLS.g:9707:2: ( ruleEDate )
            {
            // InternalQLS.g:9707:2: ( ruleEDate )
            // InternalQLS.g:9708:3: ruleEDate
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
    // InternalQLS.g:9717:1: rule__DecimalValue__DecimalValueAssignment_1 : ( ruleEDouble ) ;
    public final void rule__DecimalValue__DecimalValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9721:1: ( ( ruleEDouble ) )
            // InternalQLS.g:9722:2: ( ruleEDouble )
            {
            // InternalQLS.g:9722:2: ( ruleEDouble )
            // InternalQLS.g:9723:3: ruleEDouble
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
    // InternalQLS.g:9732:1: rule__QuestionDefinition__IsMandatoryAssignment_0 : ( ( 'mandatory' ) ) ;
    public final void rule__QuestionDefinition__IsMandatoryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9736:1: ( ( ( 'mandatory' ) ) )
            // InternalQLS.g:9737:2: ( ( 'mandatory' ) )
            {
            // InternalQLS.g:9737:2: ( ( 'mandatory' ) )
            // InternalQLS.g:9738:3: ( 'mandatory' )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getIsMandatoryMandatoryKeyword_0_0()); 
            // InternalQLS.g:9739:3: ( 'mandatory' )
            // InternalQLS.g:9740:4: 'mandatory'
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
    // InternalQLS.g:9751:1: rule__QuestionDefinition__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__QuestionDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9755:1: ( ( ruleEString ) )
            // InternalQLS.g:9756:2: ( ruleEString )
            {
            // InternalQLS.g:9756:2: ( ruleEString )
            // InternalQLS.g:9757:3: ruleEString
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
    // InternalQLS.g:9766:1: rule__QuestionDefinition__IsDisplayedAssignment_3_1 : ( ( 'isDisplayed' ) ) ;
    public final void rule__QuestionDefinition__IsDisplayedAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9770:1: ( ( ( 'isDisplayed' ) ) )
            // InternalQLS.g:9771:2: ( ( 'isDisplayed' ) )
            {
            // InternalQLS.g:9771:2: ( ( 'isDisplayed' ) )
            // InternalQLS.g:9772:3: ( 'isDisplayed' )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getIsDisplayedIsDisplayedKeyword_3_1_0()); 
            // InternalQLS.g:9773:3: ( 'isDisplayed' )
            // InternalQLS.g:9774:4: 'isDisplayed'
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
    // InternalQLS.g:9785:1: rule__QuestionDefinition__CurrentValueAssignment_3_2_1 : ( ruleValue ) ;
    public final void rule__QuestionDefinition__CurrentValueAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9789:1: ( ( ruleValue ) )
            // InternalQLS.g:9790:2: ( ruleValue )
            {
            // InternalQLS.g:9790:2: ( ruleValue )
            // InternalQLS.g:9791:3: ruleValue
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
    // InternalQLS.g:9800:1: rule__QuestionDefinition__LabelAssignment_5 : ( ruleEString ) ;
    public final void rule__QuestionDefinition__LabelAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9804:1: ( ( ruleEString ) )
            // InternalQLS.g:9805:2: ( ruleEString )
            {
            // InternalQLS.g:9805:2: ( ruleEString )
            // InternalQLS.g:9806:3: ruleEString
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
    // InternalQLS.g:9815:1: rule__QuestionDefinition__DataTypeAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__QuestionDefinition__DataTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9819:1: ( ( ( ruleEString ) ) )
            // InternalQLS.g:9820:2: ( ( ruleEString ) )
            {
            // InternalQLS.g:9820:2: ( ( ruleEString ) )
            // InternalQLS.g:9821:3: ( ruleEString )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getDataTypeValueTypeCrossReference_6_0()); 
            // InternalQLS.g:9822:3: ( ruleEString )
            // InternalQLS.g:9823:4: ruleEString
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
    // InternalQLS.g:9834:1: rule__QuestionDefinition__ComputedExpressionAssignment_7_1 : ( ruleExpression ) ;
    public final void rule__QuestionDefinition__ComputedExpressionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQLS.g:9838:1: ( ( ruleExpression ) )
            // InternalQLS.g:9839:2: ( ruleExpression )
            {
            // InternalQLS.g:9839:2: ( ruleExpression )
            // InternalQLS.g:9840:3: ruleExpression
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


    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\2\uffff\1\4\3\uffff\1\4";
    static final String dfa_3s = "\1\4\1\uffff\1\14\1\6\2\uffff\1\14";
    static final String dfa_4s = "\1\116\1\uffff\1\122\1\6\2\uffff\1\122";
    static final String dfa_5s = "\1\uffff\1\1\2\uffff\1\3\1\2\1\uffff";
    static final String dfa_6s = "\7\uffff}>";
    static final String[] dfa_7s = {
            "\2\1\1\2\10\uffff\2\1\75\uffff\1\1",
            "",
            "\3\4\23\uffff\1\4\1\uffff\7\4\1\uffff\1\4\15\uffff\1\5\1\4\1\uffff\3\4\16\uffff\1\3\3\uffff\1\4",
            "\1\6",
            "",
            "",
            "\3\4\23\uffff\1\4\1\uffff\7\4\1\uffff\1\4\15\uffff\1\5\1\4\1\uffff\3\4\16\uffff\1\3\3\uffff\1\4"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1710:1: rule__Call__Alternatives : ( ( ruleConstantCall ) | ( ruleQuestionCall ) | ( ruleEnumerationCall ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0001400000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0001000000000042L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0001000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000C400000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0230000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000400000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0100400000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000400000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x1400000C00018070L,0x0000000000004000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0xC000000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x1400000000018070L,0x0000000000004000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000078000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000078000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000001400000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000001400000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000400000000000L,0x00000000004089CDL});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000002L,0x00000000004089CDL});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x1000100000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x1000500000000040L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x1000100000000042L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000018030L,0x0000000000004000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000032L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000202L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x00000000004089CDL});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000018070L,0x0000000000004000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000400000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000408000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0400000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0800000000000000L,0x0000000000820000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000018030L,0x0000000000005000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});

}