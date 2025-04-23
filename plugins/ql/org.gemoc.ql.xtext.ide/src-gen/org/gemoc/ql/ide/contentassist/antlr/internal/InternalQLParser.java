package org.gemoc.ql.ide.contentassist.antlr.internal;

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
import org.gemoc.ql.services.QLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'EDate'", "'='", "'and'", "'or'", "'true'", "'false'", "'E'", "'e'", "'PLUS'", "'MINUS'", "'MULT'", "'DIV'", "'EQUAL'", "'NOTEQUAL'", "'GREATER'", "'LOWER'", "'GREATEROREQUAL'", "'LOWEROREQUAL'", "'AND'", "'OR'", "'-'", "'not'", "'+'", "'*'", "'/'", "'>'", "'<'", "'>='", "'<='", "'QLModel'", "'{'", "'}'", "'('", "')'", "'submitDate'", "'if'", "'then'", "'endif'", "'else'", "'Form'", "'definitions'", "'ValueType'", "'unit'", "'booleanType'", "'integerType'", "'min'", "'max'", "'decimalType'", "'dateType'", "'enumerationType'", "'literals'", "','", "'StringType'", "'DateValue'", "'dateValue'", "'.'", "'question'", "':'", "'currentValue'", "';'", "'canSubmit'", "'mandatory'", "'isDisplayed'"
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

    	public void setGrammarAccess(QLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleQLModel"
    // InternalQL.g:53:1: entryRuleQLModel : ruleQLModel EOF ;
    public final void entryRuleQLModel() throws RecognitionException {
        try {
            // InternalQL.g:54:1: ( ruleQLModel EOF )
            // InternalQL.g:55:1: ruleQLModel EOF
            {
             before(grammarAccess.getQLModelRule()); 
            pushFollow(FOLLOW_1);
            ruleQLModel();

            state._fsp--;

             after(grammarAccess.getQLModelRule()); 
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
    // $ANTLR end "entryRuleQLModel"


    // $ANTLR start "ruleQLModel"
    // InternalQL.g:62:1: ruleQLModel : ( ( rule__QLModel__Group__0 ) ) ;
    public final void ruleQLModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:66:2: ( ( ( rule__QLModel__Group__0 ) ) )
            // InternalQL.g:67:2: ( ( rule__QLModel__Group__0 ) )
            {
            // InternalQL.g:67:2: ( ( rule__QLModel__Group__0 ) )
            // InternalQL.g:68:3: ( rule__QLModel__Group__0 )
            {
             before(grammarAccess.getQLModelAccess().getGroup()); 
            // InternalQL.g:69:3: ( rule__QLModel__Group__0 )
            // InternalQL.g:69:4: rule__QLModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QLModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQLModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQLModel"


    // $ANTLR start "entryRuleValueType"
    // InternalQL.g:78:1: entryRuleValueType : ruleValueType EOF ;
    public final void entryRuleValueType() throws RecognitionException {
        try {
            // InternalQL.g:79:1: ( ruleValueType EOF )
            // InternalQL.g:80:1: ruleValueType EOF
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
    // InternalQL.g:87:1: ruleValueType : ( ( rule__ValueType__Alternatives ) ) ;
    public final void ruleValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:91:2: ( ( ( rule__ValueType__Alternatives ) ) )
            // InternalQL.g:92:2: ( ( rule__ValueType__Alternatives ) )
            {
            // InternalQL.g:92:2: ( ( rule__ValueType__Alternatives ) )
            // InternalQL.g:93:3: ( rule__ValueType__Alternatives )
            {
             before(grammarAccess.getValueTypeAccess().getAlternatives()); 
            // InternalQL.g:94:3: ( rule__ValueType__Alternatives )
            // InternalQL.g:94:4: rule__ValueType__Alternatives
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
    // InternalQL.g:103:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalQL.g:104:1: ( ruleExpression EOF )
            // InternalQL.g:105:1: ruleExpression EOF
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
    // InternalQL.g:112:1: ruleExpression : ( ruleUnaryOrPrimaryExpression ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:116:2: ( ( ruleUnaryOrPrimaryExpression ) )
            // InternalQL.g:117:2: ( ruleUnaryOrPrimaryExpression )
            {
            // InternalQL.g:117:2: ( ruleUnaryOrPrimaryExpression )
            // InternalQL.g:118:3: ruleUnaryOrPrimaryExpression
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
    // InternalQL.g:128:1: entryRuleUnaryOrPrimaryExpression : ruleUnaryOrPrimaryExpression EOF ;
    public final void entryRuleUnaryOrPrimaryExpression() throws RecognitionException {
        try {
            // InternalQL.g:129:1: ( ruleUnaryOrPrimaryExpression EOF )
            // InternalQL.g:130:1: ruleUnaryOrPrimaryExpression EOF
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
    // InternalQL.g:137:1: ruleUnaryOrPrimaryExpression : ( ( rule__UnaryOrPrimaryExpression__Alternatives ) ) ;
    public final void ruleUnaryOrPrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:141:2: ( ( ( rule__UnaryOrPrimaryExpression__Alternatives ) ) )
            // InternalQL.g:142:2: ( ( rule__UnaryOrPrimaryExpression__Alternatives ) )
            {
            // InternalQL.g:142:2: ( ( rule__UnaryOrPrimaryExpression__Alternatives ) )
            // InternalQL.g:143:3: ( rule__UnaryOrPrimaryExpression__Alternatives )
            {
             before(grammarAccess.getUnaryOrPrimaryExpressionAccess().getAlternatives()); 
            // InternalQL.g:144:3: ( rule__UnaryOrPrimaryExpression__Alternatives )
            // InternalQL.g:144:4: rule__UnaryOrPrimaryExpression__Alternatives
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
    // InternalQL.g:153:1: entryRuleUnaryExpression : ruleUnaryExpression EOF ;
    public final void entryRuleUnaryExpression() throws RecognitionException {
        try {
            // InternalQL.g:154:1: ( ruleUnaryExpression EOF )
            // InternalQL.g:155:1: ruleUnaryExpression EOF
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
    // InternalQL.g:162:1: ruleUnaryExpression : ( ( rule__UnaryExpression__Group__0 ) ) ;
    public final void ruleUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:166:2: ( ( ( rule__UnaryExpression__Group__0 ) ) )
            // InternalQL.g:167:2: ( ( rule__UnaryExpression__Group__0 ) )
            {
            // InternalQL.g:167:2: ( ( rule__UnaryExpression__Group__0 ) )
            // InternalQL.g:168:3: ( rule__UnaryExpression__Group__0 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getGroup()); 
            // InternalQL.g:169:3: ( rule__UnaryExpression__Group__0 )
            // InternalQL.g:169:4: rule__UnaryExpression__Group__0
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
    // InternalQL.g:178:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalQL.g:179:1: ( rulePrimaryExpression EOF )
            // InternalQL.g:180:1: rulePrimaryExpression EOF
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
    // InternalQL.g:187:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:191:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalQL.g:192:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalQL.g:192:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalQL.g:193:3: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // InternalQL.g:194:3: ( rule__PrimaryExpression__Alternatives )
            // InternalQL.g:194:4: rule__PrimaryExpression__Alternatives
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
    // InternalQL.g:203:1: entryRuleIfExpression : ruleIfExpression EOF ;
    public final void entryRuleIfExpression() throws RecognitionException {
        try {
            // InternalQL.g:204:1: ( ruleIfExpression EOF )
            // InternalQL.g:205:1: ruleIfExpression EOF
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
    // InternalQL.g:212:1: ruleIfExpression : ( ( rule__IfExpression__Group__0 ) ) ;
    public final void ruleIfExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:216:2: ( ( ( rule__IfExpression__Group__0 ) ) )
            // InternalQL.g:217:2: ( ( rule__IfExpression__Group__0 ) )
            {
            // InternalQL.g:217:2: ( ( rule__IfExpression__Group__0 ) )
            // InternalQL.g:218:3: ( rule__IfExpression__Group__0 )
            {
             before(grammarAccess.getIfExpressionAccess().getGroup()); 
            // InternalQL.g:219:3: ( rule__IfExpression__Group__0 )
            // InternalQL.g:219:4: rule__IfExpression__Group__0
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
    // InternalQL.g:228:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // InternalQL.g:229:1: ( ruleOrExpression EOF )
            // InternalQL.g:230:1: ruleOrExpression EOF
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
    // InternalQL.g:237:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:241:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // InternalQL.g:242:2: ( ( rule__OrExpression__Group__0 ) )
            {
            // InternalQL.g:242:2: ( ( rule__OrExpression__Group__0 ) )
            // InternalQL.g:243:3: ( rule__OrExpression__Group__0 )
            {
             before(grammarAccess.getOrExpressionAccess().getGroup()); 
            // InternalQL.g:244:3: ( rule__OrExpression__Group__0 )
            // InternalQL.g:244:4: rule__OrExpression__Group__0
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
    // InternalQL.g:253:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // InternalQL.g:254:1: ( ruleAndExpression EOF )
            // InternalQL.g:255:1: ruleAndExpression EOF
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
    // InternalQL.g:262:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:266:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // InternalQL.g:267:2: ( ( rule__AndExpression__Group__0 ) )
            {
            // InternalQL.g:267:2: ( ( rule__AndExpression__Group__0 ) )
            // InternalQL.g:268:3: ( rule__AndExpression__Group__0 )
            {
             before(grammarAccess.getAndExpressionAccess().getGroup()); 
            // InternalQL.g:269:3: ( rule__AndExpression__Group__0 )
            // InternalQL.g:269:4: rule__AndExpression__Group__0
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
    // InternalQL.g:278:1: entryRuleEqualExpression : ruleEqualExpression EOF ;
    public final void entryRuleEqualExpression() throws RecognitionException {
        try {
            // InternalQL.g:279:1: ( ruleEqualExpression EOF )
            // InternalQL.g:280:1: ruleEqualExpression EOF
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
    // InternalQL.g:287:1: ruleEqualExpression : ( ( rule__EqualExpression__Group__0 ) ) ;
    public final void ruleEqualExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:291:2: ( ( ( rule__EqualExpression__Group__0 ) ) )
            // InternalQL.g:292:2: ( ( rule__EqualExpression__Group__0 ) )
            {
            // InternalQL.g:292:2: ( ( rule__EqualExpression__Group__0 ) )
            // InternalQL.g:293:3: ( rule__EqualExpression__Group__0 )
            {
             before(grammarAccess.getEqualExpressionAccess().getGroup()); 
            // InternalQL.g:294:3: ( rule__EqualExpression__Group__0 )
            // InternalQL.g:294:4: rule__EqualExpression__Group__0
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
    // InternalQL.g:303:1: entryRuleComparisionExpression : ruleComparisionExpression EOF ;
    public final void entryRuleComparisionExpression() throws RecognitionException {
        try {
            // InternalQL.g:304:1: ( ruleComparisionExpression EOF )
            // InternalQL.g:305:1: ruleComparisionExpression EOF
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
    // InternalQL.g:312:1: ruleComparisionExpression : ( ( rule__ComparisionExpression__Group__0 ) ) ;
    public final void ruleComparisionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:316:2: ( ( ( rule__ComparisionExpression__Group__0 ) ) )
            // InternalQL.g:317:2: ( ( rule__ComparisionExpression__Group__0 ) )
            {
            // InternalQL.g:317:2: ( ( rule__ComparisionExpression__Group__0 ) )
            // InternalQL.g:318:3: ( rule__ComparisionExpression__Group__0 )
            {
             before(grammarAccess.getComparisionExpressionAccess().getGroup()); 
            // InternalQL.g:319:3: ( rule__ComparisionExpression__Group__0 )
            // InternalQL.g:319:4: rule__ComparisionExpression__Group__0
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
    // InternalQL.g:328:1: entryRuleAdditionExpression : ruleAdditionExpression EOF ;
    public final void entryRuleAdditionExpression() throws RecognitionException {
        try {
            // InternalQL.g:329:1: ( ruleAdditionExpression EOF )
            // InternalQL.g:330:1: ruleAdditionExpression EOF
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
    // InternalQL.g:337:1: ruleAdditionExpression : ( ( rule__AdditionExpression__Group__0 ) ) ;
    public final void ruleAdditionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:341:2: ( ( ( rule__AdditionExpression__Group__0 ) ) )
            // InternalQL.g:342:2: ( ( rule__AdditionExpression__Group__0 ) )
            {
            // InternalQL.g:342:2: ( ( rule__AdditionExpression__Group__0 ) )
            // InternalQL.g:343:3: ( rule__AdditionExpression__Group__0 )
            {
             before(grammarAccess.getAdditionExpressionAccess().getGroup()); 
            // InternalQL.g:344:3: ( rule__AdditionExpression__Group__0 )
            // InternalQL.g:344:4: rule__AdditionExpression__Group__0
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
    // InternalQL.g:353:1: entryRuleMultiplicationExpression : ruleMultiplicationExpression EOF ;
    public final void entryRuleMultiplicationExpression() throws RecognitionException {
        try {
            // InternalQL.g:354:1: ( ruleMultiplicationExpression EOF )
            // InternalQL.g:355:1: ruleMultiplicationExpression EOF
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
    // InternalQL.g:362:1: ruleMultiplicationExpression : ( ( rule__MultiplicationExpression__Group__0 ) ) ;
    public final void ruleMultiplicationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:366:2: ( ( ( rule__MultiplicationExpression__Group__0 ) ) )
            // InternalQL.g:367:2: ( ( rule__MultiplicationExpression__Group__0 ) )
            {
            // InternalQL.g:367:2: ( ( rule__MultiplicationExpression__Group__0 ) )
            // InternalQL.g:368:3: ( rule__MultiplicationExpression__Group__0 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getGroup()); 
            // InternalQL.g:369:3: ( rule__MultiplicationExpression__Group__0 )
            // InternalQL.g:369:4: rule__MultiplicationExpression__Group__0
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
    // InternalQL.g:378:1: entryRuleCall : ruleCall EOF ;
    public final void entryRuleCall() throws RecognitionException {
        try {
            // InternalQL.g:379:1: ( ruleCall EOF )
            // InternalQL.g:380:1: ruleCall EOF
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
    // InternalQL.g:387:1: ruleCall : ( ( rule__Call__Alternatives ) ) ;
    public final void ruleCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:391:2: ( ( ( rule__Call__Alternatives ) ) )
            // InternalQL.g:392:2: ( ( rule__Call__Alternatives ) )
            {
            // InternalQL.g:392:2: ( ( rule__Call__Alternatives ) )
            // InternalQL.g:393:3: ( rule__Call__Alternatives )
            {
             before(grammarAccess.getCallAccess().getAlternatives()); 
            // InternalQL.g:394:3: ( rule__Call__Alternatives )
            // InternalQL.g:394:4: rule__Call__Alternatives
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
    // InternalQL.g:403:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalQL.g:404:1: ( ruleValue EOF )
            // InternalQL.g:405:1: ruleValue EOF
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
    // InternalQL.g:412:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:416:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalQL.g:417:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalQL.g:417:2: ( ( rule__Value__Alternatives ) )
            // InternalQL.g:418:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalQL.g:419:3: ( rule__Value__Alternatives )
            // InternalQL.g:419:4: rule__Value__Alternatives
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
    // InternalQL.g:428:1: entryRuleForm : ruleForm EOF ;
    public final void entryRuleForm() throws RecognitionException {
        try {
            // InternalQL.g:429:1: ( ruleForm EOF )
            // InternalQL.g:430:1: ruleForm EOF
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
    // InternalQL.g:437:1: ruleForm : ( ( rule__Form__Group__0 ) ) ;
    public final void ruleForm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:441:2: ( ( ( rule__Form__Group__0 ) ) )
            // InternalQL.g:442:2: ( ( rule__Form__Group__0 ) )
            {
            // InternalQL.g:442:2: ( ( rule__Form__Group__0 ) )
            // InternalQL.g:443:3: ( rule__Form__Group__0 )
            {
             before(grammarAccess.getFormAccess().getGroup()); 
            // InternalQL.g:444:3: ( rule__Form__Group__0 )
            // InternalQL.g:444:4: rule__Form__Group__0
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
    // InternalQL.g:453:1: entryRuleDefinitionGroup : ruleDefinitionGroup EOF ;
    public final void entryRuleDefinitionGroup() throws RecognitionException {
        try {
            // InternalQL.g:454:1: ( ruleDefinitionGroup EOF )
            // InternalQL.g:455:1: ruleDefinitionGroup EOF
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
    // InternalQL.g:462:1: ruleDefinitionGroup : ( ( rule__DefinitionGroup__Group__0 ) ) ;
    public final void ruleDefinitionGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:466:2: ( ( ( rule__DefinitionGroup__Group__0 ) ) )
            // InternalQL.g:467:2: ( ( rule__DefinitionGroup__Group__0 ) )
            {
            // InternalQL.g:467:2: ( ( rule__DefinitionGroup__Group__0 ) )
            // InternalQL.g:468:3: ( rule__DefinitionGroup__Group__0 )
            {
             before(grammarAccess.getDefinitionGroupAccess().getGroup()); 
            // InternalQL.g:469:3: ( rule__DefinitionGroup__Group__0 )
            // InternalQL.g:469:4: rule__DefinitionGroup__Group__0
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
    // InternalQL.g:478:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalQL.g:479:1: ( ruleEBoolean EOF )
            // InternalQL.g:480:1: ruleEBoolean EOF
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
    // InternalQL.g:487:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:491:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalQL.g:492:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalQL.g:492:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalQL.g:493:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalQL.g:494:3: ( rule__EBoolean__Alternatives )
            // InternalQL.g:494:4: rule__EBoolean__Alternatives
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
    // InternalQL.g:503:1: entryRuleEDate : ruleEDate EOF ;
    public final void entryRuleEDate() throws RecognitionException {
        try {
            // InternalQL.g:504:1: ( ruleEDate EOF )
            // InternalQL.g:505:1: ruleEDate EOF
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
    // InternalQL.g:512:1: ruleEDate : ( 'EDate' ) ;
    public final void ruleEDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:516:2: ( ( 'EDate' ) )
            // InternalQL.g:517:2: ( 'EDate' )
            {
            // InternalQL.g:517:2: ( 'EDate' )
            // InternalQL.g:518:3: 'EDate'
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
    // InternalQL.g:528:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalQL.g:529:1: ( ruleEString EOF )
            // InternalQL.g:530:1: ruleEString EOF
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
    // InternalQL.g:537:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:541:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalQL.g:542:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalQL.g:542:2: ( ( rule__EString__Alternatives ) )
            // InternalQL.g:543:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalQL.g:544:3: ( rule__EString__Alternatives )
            // InternalQL.g:544:4: rule__EString__Alternatives
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
    // InternalQL.g:553:1: entryRuleQuestionGroup : ruleQuestionGroup EOF ;
    public final void entryRuleQuestionGroup() throws RecognitionException {
        try {
            // InternalQL.g:554:1: ( ruleQuestionGroup EOF )
            // InternalQL.g:555:1: ruleQuestionGroup EOF
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
    // InternalQL.g:562:1: ruleQuestionGroup : ( ( rule__QuestionGroup__Group__0 ) ) ;
    public final void ruleQuestionGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:566:2: ( ( ( rule__QuestionGroup__Group__0 ) ) )
            // InternalQL.g:567:2: ( ( rule__QuestionGroup__Group__0 ) )
            {
            // InternalQL.g:567:2: ( ( rule__QuestionGroup__Group__0 ) )
            // InternalQL.g:568:3: ( rule__QuestionGroup__Group__0 )
            {
             before(grammarAccess.getQuestionGroupAccess().getGroup()); 
            // InternalQL.g:569:3: ( rule__QuestionGroup__Group__0 )
            // InternalQL.g:569:4: rule__QuestionGroup__Group__0
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
    // InternalQL.g:578:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // InternalQL.g:579:1: ( ruleQuestion EOF )
            // InternalQL.g:580:1: ruleQuestion EOF
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
    // InternalQL.g:587:1: ruleQuestion : ( ( rule__Question__QuestionDefinitionAssignment ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:591:2: ( ( ( rule__Question__QuestionDefinitionAssignment ) ) )
            // InternalQL.g:592:2: ( ( rule__Question__QuestionDefinitionAssignment ) )
            {
            // InternalQL.g:592:2: ( ( rule__Question__QuestionDefinitionAssignment ) )
            // InternalQL.g:593:3: ( rule__Question__QuestionDefinitionAssignment )
            {
             before(grammarAccess.getQuestionAccess().getQuestionDefinitionAssignment()); 
            // InternalQL.g:594:3: ( rule__Question__QuestionDefinitionAssignment )
            // InternalQL.g:594:4: rule__Question__QuestionDefinitionAssignment
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
    // InternalQL.g:603:1: entryRuleValueType_Impl : ruleValueType_Impl EOF ;
    public final void entryRuleValueType_Impl() throws RecognitionException {
        try {
            // InternalQL.g:604:1: ( ruleValueType_Impl EOF )
            // InternalQL.g:605:1: ruleValueType_Impl EOF
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
    // InternalQL.g:612:1: ruleValueType_Impl : ( ( rule__ValueType_Impl__Group__0 ) ) ;
    public final void ruleValueType_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:616:2: ( ( ( rule__ValueType_Impl__Group__0 ) ) )
            // InternalQL.g:617:2: ( ( rule__ValueType_Impl__Group__0 ) )
            {
            // InternalQL.g:617:2: ( ( rule__ValueType_Impl__Group__0 ) )
            // InternalQL.g:618:3: ( rule__ValueType_Impl__Group__0 )
            {
             before(grammarAccess.getValueType_ImplAccess().getGroup()); 
            // InternalQL.g:619:3: ( rule__ValueType_Impl__Group__0 )
            // InternalQL.g:619:4: rule__ValueType_Impl__Group__0
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
    // InternalQL.g:628:1: entryRuleConstantCall : ruleConstantCall EOF ;
    public final void entryRuleConstantCall() throws RecognitionException {
        try {
            // InternalQL.g:629:1: ( ruleConstantCall EOF )
            // InternalQL.g:630:1: ruleConstantCall EOF
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
    // InternalQL.g:637:1: ruleConstantCall : ( ( rule__ConstantCall__Group__0 ) ) ;
    public final void ruleConstantCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:641:2: ( ( ( rule__ConstantCall__Group__0 ) ) )
            // InternalQL.g:642:2: ( ( rule__ConstantCall__Group__0 ) )
            {
            // InternalQL.g:642:2: ( ( rule__ConstantCall__Group__0 ) )
            // InternalQL.g:643:3: ( rule__ConstantCall__Group__0 )
            {
             before(grammarAccess.getConstantCallAccess().getGroup()); 
            // InternalQL.g:644:3: ( rule__ConstantCall__Group__0 )
            // InternalQL.g:644:4: rule__ConstantCall__Group__0
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
    // InternalQL.g:653:1: entryRuleQuestionCall : ruleQuestionCall EOF ;
    public final void entryRuleQuestionCall() throws RecognitionException {
        try {
            // InternalQL.g:654:1: ( ruleQuestionCall EOF )
            // InternalQL.g:655:1: ruleQuestionCall EOF
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
    // InternalQL.g:662:1: ruleQuestionCall : ( ( rule__QuestionCall__Group__0 ) ) ;
    public final void ruleQuestionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:666:2: ( ( ( rule__QuestionCall__Group__0 ) ) )
            // InternalQL.g:667:2: ( ( rule__QuestionCall__Group__0 ) )
            {
            // InternalQL.g:667:2: ( ( rule__QuestionCall__Group__0 ) )
            // InternalQL.g:668:3: ( rule__QuestionCall__Group__0 )
            {
             before(grammarAccess.getQuestionCallAccess().getGroup()); 
            // InternalQL.g:669:3: ( rule__QuestionCall__Group__0 )
            // InternalQL.g:669:4: rule__QuestionCall__Group__0
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
    // InternalQL.g:678:1: entryRuleBooleanValueType : ruleBooleanValueType EOF ;
    public final void entryRuleBooleanValueType() throws RecognitionException {
        try {
            // InternalQL.g:679:1: ( ruleBooleanValueType EOF )
            // InternalQL.g:680:1: ruleBooleanValueType EOF
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
    // InternalQL.g:687:1: ruleBooleanValueType : ( ( rule__BooleanValueType__Group__0 ) ) ;
    public final void ruleBooleanValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:691:2: ( ( ( rule__BooleanValueType__Group__0 ) ) )
            // InternalQL.g:692:2: ( ( rule__BooleanValueType__Group__0 ) )
            {
            // InternalQL.g:692:2: ( ( rule__BooleanValueType__Group__0 ) )
            // InternalQL.g:693:3: ( rule__BooleanValueType__Group__0 )
            {
             before(grammarAccess.getBooleanValueTypeAccess().getGroup()); 
            // InternalQL.g:694:3: ( rule__BooleanValueType__Group__0 )
            // InternalQL.g:694:4: rule__BooleanValueType__Group__0
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
    // InternalQL.g:703:1: entryRuleIntegerValueType : ruleIntegerValueType EOF ;
    public final void entryRuleIntegerValueType() throws RecognitionException {
        try {
            // InternalQL.g:704:1: ( ruleIntegerValueType EOF )
            // InternalQL.g:705:1: ruleIntegerValueType EOF
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
    // InternalQL.g:712:1: ruleIntegerValueType : ( ( rule__IntegerValueType__Group__0 ) ) ;
    public final void ruleIntegerValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:716:2: ( ( ( rule__IntegerValueType__Group__0 ) ) )
            // InternalQL.g:717:2: ( ( rule__IntegerValueType__Group__0 ) )
            {
            // InternalQL.g:717:2: ( ( rule__IntegerValueType__Group__0 ) )
            // InternalQL.g:718:3: ( rule__IntegerValueType__Group__0 )
            {
             before(grammarAccess.getIntegerValueTypeAccess().getGroup()); 
            // InternalQL.g:719:3: ( rule__IntegerValueType__Group__0 )
            // InternalQL.g:719:4: rule__IntegerValueType__Group__0
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
    // InternalQL.g:728:1: entryRuleDecimalValueType : ruleDecimalValueType EOF ;
    public final void entryRuleDecimalValueType() throws RecognitionException {
        try {
            // InternalQL.g:729:1: ( ruleDecimalValueType EOF )
            // InternalQL.g:730:1: ruleDecimalValueType EOF
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
    // InternalQL.g:737:1: ruleDecimalValueType : ( ( rule__DecimalValueType__Group__0 ) ) ;
    public final void ruleDecimalValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:741:2: ( ( ( rule__DecimalValueType__Group__0 ) ) )
            // InternalQL.g:742:2: ( ( rule__DecimalValueType__Group__0 ) )
            {
            // InternalQL.g:742:2: ( ( rule__DecimalValueType__Group__0 ) )
            // InternalQL.g:743:3: ( rule__DecimalValueType__Group__0 )
            {
             before(grammarAccess.getDecimalValueTypeAccess().getGroup()); 
            // InternalQL.g:744:3: ( rule__DecimalValueType__Group__0 )
            // InternalQL.g:744:4: rule__DecimalValueType__Group__0
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
    // InternalQL.g:753:1: entryRuleDateValueType : ruleDateValueType EOF ;
    public final void entryRuleDateValueType() throws RecognitionException {
        try {
            // InternalQL.g:754:1: ( ruleDateValueType EOF )
            // InternalQL.g:755:1: ruleDateValueType EOF
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
    // InternalQL.g:762:1: ruleDateValueType : ( ( rule__DateValueType__Group__0 ) ) ;
    public final void ruleDateValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:766:2: ( ( ( rule__DateValueType__Group__0 ) ) )
            // InternalQL.g:767:2: ( ( rule__DateValueType__Group__0 ) )
            {
            // InternalQL.g:767:2: ( ( rule__DateValueType__Group__0 ) )
            // InternalQL.g:768:3: ( rule__DateValueType__Group__0 )
            {
             before(grammarAccess.getDateValueTypeAccess().getGroup()); 
            // InternalQL.g:769:3: ( rule__DateValueType__Group__0 )
            // InternalQL.g:769:4: rule__DateValueType__Group__0
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
    // InternalQL.g:778:1: entryRuleEnumerationValueType : ruleEnumerationValueType EOF ;
    public final void entryRuleEnumerationValueType() throws RecognitionException {
        try {
            // InternalQL.g:779:1: ( ruleEnumerationValueType EOF )
            // InternalQL.g:780:1: ruleEnumerationValueType EOF
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
    // InternalQL.g:787:1: ruleEnumerationValueType : ( ( rule__EnumerationValueType__Group__0 ) ) ;
    public final void ruleEnumerationValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:791:2: ( ( ( rule__EnumerationValueType__Group__0 ) ) )
            // InternalQL.g:792:2: ( ( rule__EnumerationValueType__Group__0 ) )
            {
            // InternalQL.g:792:2: ( ( rule__EnumerationValueType__Group__0 ) )
            // InternalQL.g:793:3: ( rule__EnumerationValueType__Group__0 )
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getGroup()); 
            // InternalQL.g:794:3: ( rule__EnumerationValueType__Group__0 )
            // InternalQL.g:794:4: rule__EnumerationValueType__Group__0
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
    // InternalQL.g:803:1: entryRuleStringValueType : ruleStringValueType EOF ;
    public final void entryRuleStringValueType() throws RecognitionException {
        try {
            // InternalQL.g:804:1: ( ruleStringValueType EOF )
            // InternalQL.g:805:1: ruleStringValueType EOF
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
    // InternalQL.g:812:1: ruleStringValueType : ( ( rule__StringValueType__Group__0 ) ) ;
    public final void ruleStringValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:816:2: ( ( ( rule__StringValueType__Group__0 ) ) )
            // InternalQL.g:817:2: ( ( rule__StringValueType__Group__0 ) )
            {
            // InternalQL.g:817:2: ( ( rule__StringValueType__Group__0 ) )
            // InternalQL.g:818:3: ( rule__StringValueType__Group__0 )
            {
             before(grammarAccess.getStringValueTypeAccess().getGroup()); 
            // InternalQL.g:819:3: ( rule__StringValueType__Group__0 )
            // InternalQL.g:819:4: rule__StringValueType__Group__0
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
    // InternalQL.g:828:1: entryRuleEnumerationLiteral : ruleEnumerationLiteral EOF ;
    public final void entryRuleEnumerationLiteral() throws RecognitionException {
        try {
            // InternalQL.g:829:1: ( ruleEnumerationLiteral EOF )
            // InternalQL.g:830:1: ruleEnumerationLiteral EOF
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
    // InternalQL.g:837:1: ruleEnumerationLiteral : ( ( rule__EnumerationLiteral__Group__0 ) ) ;
    public final void ruleEnumerationLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:841:2: ( ( ( rule__EnumerationLiteral__Group__0 ) ) )
            // InternalQL.g:842:2: ( ( rule__EnumerationLiteral__Group__0 ) )
            {
            // InternalQL.g:842:2: ( ( rule__EnumerationLiteral__Group__0 ) )
            // InternalQL.g:843:3: ( rule__EnumerationLiteral__Group__0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getGroup()); 
            // InternalQL.g:844:3: ( rule__EnumerationLiteral__Group__0 )
            // InternalQL.g:844:4: rule__EnumerationLiteral__Group__0
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
    // InternalQL.g:853:1: entryRuleIntegerValue : ruleIntegerValue EOF ;
    public final void entryRuleIntegerValue() throws RecognitionException {
        try {
            // InternalQL.g:854:1: ( ruleIntegerValue EOF )
            // InternalQL.g:855:1: ruleIntegerValue EOF
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
    // InternalQL.g:862:1: ruleIntegerValue : ( ( rule__IntegerValue__Group__0 ) ) ;
    public final void ruleIntegerValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:866:2: ( ( ( rule__IntegerValue__Group__0 ) ) )
            // InternalQL.g:867:2: ( ( rule__IntegerValue__Group__0 ) )
            {
            // InternalQL.g:867:2: ( ( rule__IntegerValue__Group__0 ) )
            // InternalQL.g:868:3: ( rule__IntegerValue__Group__0 )
            {
             before(grammarAccess.getIntegerValueAccess().getGroup()); 
            // InternalQL.g:869:3: ( rule__IntegerValue__Group__0 )
            // InternalQL.g:869:4: rule__IntegerValue__Group__0
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
    // InternalQL.g:878:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalQL.g:879:1: ( ruleStringValue EOF )
            // InternalQL.g:880:1: ruleStringValue EOF
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
    // InternalQL.g:887:1: ruleStringValue : ( ( rule__StringValue__Group__0 ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:891:2: ( ( ( rule__StringValue__Group__0 ) ) )
            // InternalQL.g:892:2: ( ( rule__StringValue__Group__0 ) )
            {
            // InternalQL.g:892:2: ( ( rule__StringValue__Group__0 ) )
            // InternalQL.g:893:3: ( rule__StringValue__Group__0 )
            {
             before(grammarAccess.getStringValueAccess().getGroup()); 
            // InternalQL.g:894:3: ( rule__StringValue__Group__0 )
            // InternalQL.g:894:4: rule__StringValue__Group__0
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
    // InternalQL.g:903:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalQL.g:904:1: ( ruleBooleanValue EOF )
            // InternalQL.g:905:1: ruleBooleanValue EOF
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
    // InternalQL.g:912:1: ruleBooleanValue : ( ( rule__BooleanValue__Group__0 ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:916:2: ( ( ( rule__BooleanValue__Group__0 ) ) )
            // InternalQL.g:917:2: ( ( rule__BooleanValue__Group__0 ) )
            {
            // InternalQL.g:917:2: ( ( rule__BooleanValue__Group__0 ) )
            // InternalQL.g:918:3: ( rule__BooleanValue__Group__0 )
            {
             before(grammarAccess.getBooleanValueAccess().getGroup()); 
            // InternalQL.g:919:3: ( rule__BooleanValue__Group__0 )
            // InternalQL.g:919:4: rule__BooleanValue__Group__0
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
    // InternalQL.g:928:1: entryRuleEnumerationCall : ruleEnumerationCall EOF ;
    public final void entryRuleEnumerationCall() throws RecognitionException {
        try {
            // InternalQL.g:929:1: ( ruleEnumerationCall EOF )
            // InternalQL.g:930:1: ruleEnumerationCall EOF
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
    // InternalQL.g:937:1: ruleEnumerationCall : ( ( rule__EnumerationCall__Group__0 ) ) ;
    public final void ruleEnumerationCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:941:2: ( ( ( rule__EnumerationCall__Group__0 ) ) )
            // InternalQL.g:942:2: ( ( rule__EnumerationCall__Group__0 ) )
            {
            // InternalQL.g:942:2: ( ( rule__EnumerationCall__Group__0 ) )
            // InternalQL.g:943:3: ( rule__EnumerationCall__Group__0 )
            {
             before(grammarAccess.getEnumerationCallAccess().getGroup()); 
            // InternalQL.g:944:3: ( rule__EnumerationCall__Group__0 )
            // InternalQL.g:944:4: rule__EnumerationCall__Group__0
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
    // InternalQL.g:953:1: entryRuleDateValue : ruleDateValue EOF ;
    public final void entryRuleDateValue() throws RecognitionException {
        try {
            // InternalQL.g:954:1: ( ruleDateValue EOF )
            // InternalQL.g:955:1: ruleDateValue EOF
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
    // InternalQL.g:962:1: ruleDateValue : ( ( rule__DateValue__Group__0 ) ) ;
    public final void ruleDateValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:966:2: ( ( ( rule__DateValue__Group__0 ) ) )
            // InternalQL.g:967:2: ( ( rule__DateValue__Group__0 ) )
            {
            // InternalQL.g:967:2: ( ( rule__DateValue__Group__0 ) )
            // InternalQL.g:968:3: ( rule__DateValue__Group__0 )
            {
             before(grammarAccess.getDateValueAccess().getGroup()); 
            // InternalQL.g:969:3: ( rule__DateValue__Group__0 )
            // InternalQL.g:969:4: rule__DateValue__Group__0
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
    // InternalQL.g:978:1: entryRuleDecimalValue : ruleDecimalValue EOF ;
    public final void entryRuleDecimalValue() throws RecognitionException {
        try {
            // InternalQL.g:979:1: ( ruleDecimalValue EOF )
            // InternalQL.g:980:1: ruleDecimalValue EOF
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
    // InternalQL.g:987:1: ruleDecimalValue : ( ( rule__DecimalValue__Group__0 ) ) ;
    public final void ruleDecimalValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:991:2: ( ( ( rule__DecimalValue__Group__0 ) ) )
            // InternalQL.g:992:2: ( ( rule__DecimalValue__Group__0 ) )
            {
            // InternalQL.g:992:2: ( ( rule__DecimalValue__Group__0 ) )
            // InternalQL.g:993:3: ( rule__DecimalValue__Group__0 )
            {
             before(grammarAccess.getDecimalValueAccess().getGroup()); 
            // InternalQL.g:994:3: ( rule__DecimalValue__Group__0 )
            // InternalQL.g:994:4: rule__DecimalValue__Group__0
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
    // InternalQL.g:1003:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalQL.g:1004:1: ( ruleEInt EOF )
            // InternalQL.g:1005:1: ruleEInt EOF
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
    // InternalQL.g:1012:1: ruleEInt : ( RULE_INT ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1016:2: ( ( RULE_INT ) )
            // InternalQL.g:1017:2: ( RULE_INT )
            {
            // InternalQL.g:1017:2: ( RULE_INT )
            // InternalQL.g:1018:3: RULE_INT
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


    // $ANTLR start "entryRuleEFloat"
    // InternalQL.g:1028:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // InternalQL.g:1029:1: ( ruleEFloat EOF )
            // InternalQL.g:1030:1: ruleEFloat EOF
            {
             before(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getEFloatRule()); 
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
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalQL.g:1037:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1041:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // InternalQL.g:1042:2: ( ( rule__EFloat__Group__0 ) )
            {
            // InternalQL.g:1042:2: ( ( rule__EFloat__Group__0 ) )
            // InternalQL.g:1043:3: ( rule__EFloat__Group__0 )
            {
             before(grammarAccess.getEFloatAccess().getGroup()); 
            // InternalQL.g:1044:3: ( rule__EFloat__Group__0 )
            // InternalQL.g:1044:4: rule__EFloat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRuleQuestionDefinition"
    // InternalQL.g:1053:1: entryRuleQuestionDefinition : ruleQuestionDefinition EOF ;
    public final void entryRuleQuestionDefinition() throws RecognitionException {
        try {
            // InternalQL.g:1054:1: ( ruleQuestionDefinition EOF )
            // InternalQL.g:1055:1: ruleQuestionDefinition EOF
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
    // InternalQL.g:1062:1: ruleQuestionDefinition : ( ( rule__QuestionDefinition__Group__0 ) ) ;
    public final void ruleQuestionDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1066:2: ( ( ( rule__QuestionDefinition__Group__0 ) ) )
            // InternalQL.g:1067:2: ( ( rule__QuestionDefinition__Group__0 ) )
            {
            // InternalQL.g:1067:2: ( ( rule__QuestionDefinition__Group__0 ) )
            // InternalQL.g:1068:3: ( rule__QuestionDefinition__Group__0 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getGroup()); 
            // InternalQL.g:1069:3: ( rule__QuestionDefinition__Group__0 )
            // InternalQL.g:1069:4: rule__QuestionDefinition__Group__0
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
    // InternalQL.g:1078:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalQL.g:1079:1: ( ruleQualifiedName EOF )
            // InternalQL.g:1080:1: ruleQualifiedName EOF
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
    // InternalQL.g:1087:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1091:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalQL.g:1092:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalQL.g:1092:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalQL.g:1093:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalQL.g:1094:3: ( rule__QualifiedName__Group__0 )
            // InternalQL.g:1094:4: rule__QualifiedName__Group__0
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


    // $ANTLR start "ruleBinaryOperatorKind"
    // InternalQL.g:1103:1: ruleBinaryOperatorKind : ( ( rule__BinaryOperatorKind__Alternatives ) ) ;
    public final void ruleBinaryOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1107:1: ( ( ( rule__BinaryOperatorKind__Alternatives ) ) )
            // InternalQL.g:1108:2: ( ( rule__BinaryOperatorKind__Alternatives ) )
            {
            // InternalQL.g:1108:2: ( ( rule__BinaryOperatorKind__Alternatives ) )
            // InternalQL.g:1109:3: ( rule__BinaryOperatorKind__Alternatives )
            {
             before(grammarAccess.getBinaryOperatorKindAccess().getAlternatives()); 
            // InternalQL.g:1110:3: ( rule__BinaryOperatorKind__Alternatives )
            // InternalQL.g:1110:4: rule__BinaryOperatorKind__Alternatives
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
    // InternalQL.g:1119:1: ruleUnaryOperatorKind : ( ( rule__UnaryOperatorKind__Alternatives ) ) ;
    public final void ruleUnaryOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1123:1: ( ( ( rule__UnaryOperatorKind__Alternatives ) ) )
            // InternalQL.g:1124:2: ( ( rule__UnaryOperatorKind__Alternatives ) )
            {
            // InternalQL.g:1124:2: ( ( rule__UnaryOperatorKind__Alternatives ) )
            // InternalQL.g:1125:3: ( rule__UnaryOperatorKind__Alternatives )
            {
             before(grammarAccess.getUnaryOperatorKindAccess().getAlternatives()); 
            // InternalQL.g:1126:3: ( rule__UnaryOperatorKind__Alternatives )
            // InternalQL.g:1126:4: rule__UnaryOperatorKind__Alternatives
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
    // InternalQL.g:1135:1: ruleAdditionOperatorKind : ( ( rule__AdditionOperatorKind__Alternatives ) ) ;
    public final void ruleAdditionOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1139:1: ( ( ( rule__AdditionOperatorKind__Alternatives ) ) )
            // InternalQL.g:1140:2: ( ( rule__AdditionOperatorKind__Alternatives ) )
            {
            // InternalQL.g:1140:2: ( ( rule__AdditionOperatorKind__Alternatives ) )
            // InternalQL.g:1141:3: ( rule__AdditionOperatorKind__Alternatives )
            {
             before(grammarAccess.getAdditionOperatorKindAccess().getAlternatives()); 
            // InternalQL.g:1142:3: ( rule__AdditionOperatorKind__Alternatives )
            // InternalQL.g:1142:4: rule__AdditionOperatorKind__Alternatives
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
    // InternalQL.g:1151:1: ruleMultiplicationOperatorKind : ( ( rule__MultiplicationOperatorKind__Alternatives ) ) ;
    public final void ruleMultiplicationOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1155:1: ( ( ( rule__MultiplicationOperatorKind__Alternatives ) ) )
            // InternalQL.g:1156:2: ( ( rule__MultiplicationOperatorKind__Alternatives ) )
            {
            // InternalQL.g:1156:2: ( ( rule__MultiplicationOperatorKind__Alternatives ) )
            // InternalQL.g:1157:3: ( rule__MultiplicationOperatorKind__Alternatives )
            {
             before(grammarAccess.getMultiplicationOperatorKindAccess().getAlternatives()); 
            // InternalQL.g:1158:3: ( rule__MultiplicationOperatorKind__Alternatives )
            // InternalQL.g:1158:4: rule__MultiplicationOperatorKind__Alternatives
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
    // InternalQL.g:1167:1: ruleEqualOperatorKind : ( ( '=' ) ) ;
    public final void ruleEqualOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1171:1: ( ( ( '=' ) ) )
            // InternalQL.g:1172:2: ( ( '=' ) )
            {
            // InternalQL.g:1172:2: ( ( '=' ) )
            // InternalQL.g:1173:3: ( '=' )
            {
             before(grammarAccess.getEqualOperatorKindAccess().getEQUALEnumLiteralDeclaration()); 
            // InternalQL.g:1174:3: ( '=' )
            // InternalQL.g:1174:4: '='
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
    // InternalQL.g:1183:1: ruleComparisionOperatorKind : ( ( rule__ComparisionOperatorKind__Alternatives ) ) ;
    public final void ruleComparisionOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1187:1: ( ( ( rule__ComparisionOperatorKind__Alternatives ) ) )
            // InternalQL.g:1188:2: ( ( rule__ComparisionOperatorKind__Alternatives ) )
            {
            // InternalQL.g:1188:2: ( ( rule__ComparisionOperatorKind__Alternatives ) )
            // InternalQL.g:1189:3: ( rule__ComparisionOperatorKind__Alternatives )
            {
             before(grammarAccess.getComparisionOperatorKindAccess().getAlternatives()); 
            // InternalQL.g:1190:3: ( rule__ComparisionOperatorKind__Alternatives )
            // InternalQL.g:1190:4: rule__ComparisionOperatorKind__Alternatives
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
    // InternalQL.g:1199:1: ruleAndOperatorKind : ( ( 'and' ) ) ;
    public final void ruleAndOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1203:1: ( ( ( 'and' ) ) )
            // InternalQL.g:1204:2: ( ( 'and' ) )
            {
            // InternalQL.g:1204:2: ( ( 'and' ) )
            // InternalQL.g:1205:3: ( 'and' )
            {
             before(grammarAccess.getAndOperatorKindAccess().getANDEnumLiteralDeclaration()); 
            // InternalQL.g:1206:3: ( 'and' )
            // InternalQL.g:1206:4: 'and'
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
    // InternalQL.g:1215:1: ruleOrOperatorKind : ( ( 'or' ) ) ;
    public final void ruleOrOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1219:1: ( ( ( 'or' ) ) )
            // InternalQL.g:1220:2: ( ( 'or' ) )
            {
            // InternalQL.g:1220:2: ( ( 'or' ) )
            // InternalQL.g:1221:3: ( 'or' )
            {
             before(grammarAccess.getOrOperatorKindAccess().getOREnumLiteralDeclaration()); 
            // InternalQL.g:1222:3: ( 'or' )
            // InternalQL.g:1222:4: 'or'
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


    // $ANTLR start "rule__QLModel__Alternatives_4"
    // InternalQL.g:1230:1: rule__QLModel__Alternatives_4 : ( ( ( rule__QLModel__DefinitionGroupAssignment_4_0 ) ) | ( ( rule__QLModel__FormsAssignment_4_1 ) ) );
    public final void rule__QLModel__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1234:1: ( ( ( rule__QLModel__DefinitionGroupAssignment_4_0 ) ) | ( ( rule__QLModel__FormsAssignment_4_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==51) ) {
                alt1=1;
            }
            else if ( (LA1_0==50) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalQL.g:1235:2: ( ( rule__QLModel__DefinitionGroupAssignment_4_0 ) )
                    {
                    // InternalQL.g:1235:2: ( ( rule__QLModel__DefinitionGroupAssignment_4_0 ) )
                    // InternalQL.g:1236:3: ( rule__QLModel__DefinitionGroupAssignment_4_0 )
                    {
                     before(grammarAccess.getQLModelAccess().getDefinitionGroupAssignment_4_0()); 
                    // InternalQL.g:1237:3: ( rule__QLModel__DefinitionGroupAssignment_4_0 )
                    // InternalQL.g:1237:4: rule__QLModel__DefinitionGroupAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QLModel__DefinitionGroupAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQLModelAccess().getDefinitionGroupAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:1241:2: ( ( rule__QLModel__FormsAssignment_4_1 ) )
                    {
                    // InternalQL.g:1241:2: ( ( rule__QLModel__FormsAssignment_4_1 ) )
                    // InternalQL.g:1242:3: ( rule__QLModel__FormsAssignment_4_1 )
                    {
                     before(grammarAccess.getQLModelAccess().getFormsAssignment_4_1()); 
                    // InternalQL.g:1243:3: ( rule__QLModel__FormsAssignment_4_1 )
                    // InternalQL.g:1243:4: rule__QLModel__FormsAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__QLModel__FormsAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getQLModelAccess().getFormsAssignment_4_1()); 

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
    // $ANTLR end "rule__QLModel__Alternatives_4"


    // $ANTLR start "rule__ValueType__Alternatives"
    // InternalQL.g:1251:1: rule__ValueType__Alternatives : ( ( ruleValueType_Impl ) | ( ruleBooleanValueType ) | ( ruleIntegerValueType ) | ( ruleDecimalValueType ) | ( ruleDateValueType ) | ( ruleEnumerationValueType ) | ( ruleStringValueType ) );
    public final void rule__ValueType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1255:1: ( ( ruleValueType_Impl ) | ( ruleBooleanValueType ) | ( ruleIntegerValueType ) | ( ruleDecimalValueType ) | ( ruleDateValueType ) | ( ruleEnumerationValueType ) | ( ruleStringValueType ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt2=1;
                }
                break;
            case 54:
                {
                alt2=2;
                }
                break;
            case 55:
                {
                alt2=3;
                }
                break;
            case 58:
                {
                alt2=4;
                }
                break;
            case 59:
                {
                alt2=5;
                }
                break;
            case 60:
                {
                alt2=6;
                }
                break;
            case 63:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalQL.g:1256:2: ( ruleValueType_Impl )
                    {
                    // InternalQL.g:1256:2: ( ruleValueType_Impl )
                    // InternalQL.g:1257:3: ruleValueType_Impl
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
                    // InternalQL.g:1262:2: ( ruleBooleanValueType )
                    {
                    // InternalQL.g:1262:2: ( ruleBooleanValueType )
                    // InternalQL.g:1263:3: ruleBooleanValueType
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
                    // InternalQL.g:1268:2: ( ruleIntegerValueType )
                    {
                    // InternalQL.g:1268:2: ( ruleIntegerValueType )
                    // InternalQL.g:1269:3: ruleIntegerValueType
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
                    // InternalQL.g:1274:2: ( ruleDecimalValueType )
                    {
                    // InternalQL.g:1274:2: ( ruleDecimalValueType )
                    // InternalQL.g:1275:3: ruleDecimalValueType
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
                    // InternalQL.g:1280:2: ( ruleDateValueType )
                    {
                    // InternalQL.g:1280:2: ( ruleDateValueType )
                    // InternalQL.g:1281:3: ruleDateValueType
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
                    // InternalQL.g:1286:2: ( ruleEnumerationValueType )
                    {
                    // InternalQL.g:1286:2: ( ruleEnumerationValueType )
                    // InternalQL.g:1287:3: ruleEnumerationValueType
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
                    // InternalQL.g:1292:2: ( ruleStringValueType )
                    {
                    // InternalQL.g:1292:2: ( ruleStringValueType )
                    // InternalQL.g:1293:3: ruleStringValueType
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
    // InternalQL.g:1302:1: rule__UnaryOrPrimaryExpression__Alternatives : ( ( rulePrimaryExpression ) | ( ruleUnaryExpression ) );
    public final void rule__UnaryOrPrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1306:1: ( ( rulePrimaryExpression ) | ( ruleUnaryExpression ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_INT && LA3_0<=RULE_ID)||(LA3_0>=15 && LA3_0<=16)||LA3_0==43||LA3_0==46||LA3_0==66) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=31 && LA3_0<=32)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalQL.g:1307:2: ( rulePrimaryExpression )
                    {
                    // InternalQL.g:1307:2: ( rulePrimaryExpression )
                    // InternalQL.g:1308:3: rulePrimaryExpression
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
                    // InternalQL.g:1313:2: ( ruleUnaryExpression )
                    {
                    // InternalQL.g:1313:2: ( ruleUnaryExpression )
                    // InternalQL.g:1314:3: ruleUnaryExpression
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
    // InternalQL.g:1323:1: rule__PrimaryExpression__Alternatives : ( ( ruleCall ) | ( ruleIfExpression ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1327:1: ( ( ruleCall ) | ( ruleIfExpression ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
            case RULE_ID:
            case 15:
            case 16:
            case 66:
                {
                alt4=1;
                }
                break;
            case 46:
                {
                alt4=2;
                }
                break;
            case 43:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalQL.g:1328:2: ( ruleCall )
                    {
                    // InternalQL.g:1328:2: ( ruleCall )
                    // InternalQL.g:1329:3: ruleCall
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
                    // InternalQL.g:1334:2: ( ruleIfExpression )
                    {
                    // InternalQL.g:1334:2: ( ruleIfExpression )
                    // InternalQL.g:1335:3: ruleIfExpression
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
                    // InternalQL.g:1340:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    {
                    // InternalQL.g:1340:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    // InternalQL.g:1341:3: ( rule__PrimaryExpression__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 
                    // InternalQL.g:1342:3: ( rule__PrimaryExpression__Group_2__0 )
                    // InternalQL.g:1342:4: rule__PrimaryExpression__Group_2__0
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
    // InternalQL.g:1350:1: rule__PrimaryExpression__Alternatives_2_1 : ( ( ruleOrExpression ) | ( ruleUnaryExpression ) );
    public final void rule__PrimaryExpression__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1354:1: ( ( ruleOrExpression ) | ( ruleUnaryExpression ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_INT && LA5_0<=RULE_ID)||(LA5_0>=15 && LA5_0<=16)||LA5_0==43||LA5_0==46||LA5_0==66) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=31 && LA5_0<=32)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalQL.g:1355:2: ( ruleOrExpression )
                    {
                    // InternalQL.g:1355:2: ( ruleOrExpression )
                    // InternalQL.g:1356:3: ruleOrExpression
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
                    // InternalQL.g:1361:2: ( ruleUnaryExpression )
                    {
                    // InternalQL.g:1361:2: ( ruleUnaryExpression )
                    // InternalQL.g:1362:3: ruleUnaryExpression
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
    // InternalQL.g:1371:1: rule__Call__Alternatives : ( ( ruleConstantCall ) | ( ruleQuestionCall ) | ( ruleEnumerationCall ) );
    public final void rule__Call__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1375:1: ( ( ruleConstantCall ) | ( ruleQuestionCall ) | ( ruleEnumerationCall ) )
            int alt6=3;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalQL.g:1376:2: ( ruleConstantCall )
                    {
                    // InternalQL.g:1376:2: ( ruleConstantCall )
                    // InternalQL.g:1377:3: ruleConstantCall
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
                    // InternalQL.g:1382:2: ( ruleQuestionCall )
                    {
                    // InternalQL.g:1382:2: ( ruleQuestionCall )
                    // InternalQL.g:1383:3: ruleQuestionCall
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
                    // InternalQL.g:1388:2: ( ruleEnumerationCall )
                    {
                    // InternalQL.g:1388:2: ( ruleEnumerationCall )
                    // InternalQL.g:1389:3: ruleEnumerationCall
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
    // InternalQL.g:1398:1: rule__Value__Alternatives : ( ( ruleIntegerValue ) | ( ruleStringValue ) | ( ruleBooleanValue ) | ( ruleDateValue ) | ( ruleDecimalValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1402:1: ( ( ruleIntegerValue ) | ( ruleStringValue ) | ( ruleBooleanValue ) | ( ruleDateValue ) | ( ruleDecimalValue ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==66) ) {
                    alt7=5;
                }
                else if ( (LA7_1==EOF||LA7_1==44) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt7=2;
                }
                break;
            case 15:
            case 16:
                {
                alt7=3;
                }
                break;
            case 64:
                {
                alt7=4;
                }
                break;
            case 66:
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
                    // InternalQL.g:1403:2: ( ruleIntegerValue )
                    {
                    // InternalQL.g:1403:2: ( ruleIntegerValue )
                    // InternalQL.g:1404:3: ruleIntegerValue
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
                    // InternalQL.g:1409:2: ( ruleStringValue )
                    {
                    // InternalQL.g:1409:2: ( ruleStringValue )
                    // InternalQL.g:1410:3: ruleStringValue
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
                    // InternalQL.g:1415:2: ( ruleBooleanValue )
                    {
                    // InternalQL.g:1415:2: ( ruleBooleanValue )
                    // InternalQL.g:1416:3: ruleBooleanValue
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
                    // InternalQL.g:1421:2: ( ruleDateValue )
                    {
                    // InternalQL.g:1421:2: ( ruleDateValue )
                    // InternalQL.g:1422:3: ruleDateValue
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
                    // InternalQL.g:1427:2: ( ruleDecimalValue )
                    {
                    // InternalQL.g:1427:2: ( ruleDecimalValue )
                    // InternalQL.g:1428:3: ruleDecimalValue
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
    // InternalQL.g:1437:1: rule__DefinitionGroup__Alternatives_3 : ( ( ( rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0 ) ) | ( ( rule__DefinitionGroup__DataTypesAssignment_3_1 ) ) );
    public final void rule__DefinitionGroup__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1441:1: ( ( ( rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0 ) ) | ( ( rule__DefinitionGroup__DataTypesAssignment_3_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==67||LA8_0==72) ) {
                alt8=1;
            }
            else if ( (LA8_0==52||(LA8_0>=54 && LA8_0<=55)||(LA8_0>=58 && LA8_0<=60)||LA8_0==63) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalQL.g:1442:2: ( ( rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0 ) )
                    {
                    // InternalQL.g:1442:2: ( ( rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0 ) )
                    // InternalQL.g:1443:3: ( rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0 )
                    {
                     before(grammarAccess.getDefinitionGroupAccess().getQuestionDefinitionsAssignment_3_0()); 
                    // InternalQL.g:1444:3: ( rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0 )
                    // InternalQL.g:1444:4: rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0
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
                    // InternalQL.g:1448:2: ( ( rule__DefinitionGroup__DataTypesAssignment_3_1 ) )
                    {
                    // InternalQL.g:1448:2: ( ( rule__DefinitionGroup__DataTypesAssignment_3_1 ) )
                    // InternalQL.g:1449:3: ( rule__DefinitionGroup__DataTypesAssignment_3_1 )
                    {
                     before(grammarAccess.getDefinitionGroupAccess().getDataTypesAssignment_3_1()); 
                    // InternalQL.g:1450:3: ( rule__DefinitionGroup__DataTypesAssignment_3_1 )
                    // InternalQL.g:1450:4: rule__DefinitionGroup__DataTypesAssignment_3_1
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
    // InternalQL.g:1458:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1462:1: ( ( 'true' ) | ( 'false' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            else if ( (LA9_0==16) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalQL.g:1463:2: ( 'true' )
                    {
                    // InternalQL.g:1463:2: ( 'true' )
                    // InternalQL.g:1464:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:1469:2: ( 'false' )
                    {
                    // InternalQL.g:1469:2: ( 'false' )
                    // InternalQL.g:1470:3: 'false'
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
    // InternalQL.g:1479:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1483:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalQL.g:1484:2: ( RULE_STRING )
                    {
                    // InternalQL.g:1484:2: ( RULE_STRING )
                    // InternalQL.g:1485:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:1490:2: ( RULE_ID )
                    {
                    // InternalQL.g:1490:2: ( RULE_ID )
                    // InternalQL.g:1491:3: RULE_ID
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
    // InternalQL.g:1500:1: rule__QuestionGroup__Alternatives_3 : ( ( ( rule__QuestionGroup__QuestionGroupsAssignment_3_0 ) ) | ( ( rule__QuestionGroup__QuestionsAssignment_3_1 ) ) );
    public final void rule__QuestionGroup__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1504:1: ( ( ( rule__QuestionGroup__QuestionGroupsAssignment_3_0 ) ) | ( ( rule__QuestionGroup__QuestionsAssignment_3_1 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==41||LA11_0==46) ) {
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
                    // InternalQL.g:1505:2: ( ( rule__QuestionGroup__QuestionGroupsAssignment_3_0 ) )
                    {
                    // InternalQL.g:1505:2: ( ( rule__QuestionGroup__QuestionGroupsAssignment_3_0 ) )
                    // InternalQL.g:1506:3: ( rule__QuestionGroup__QuestionGroupsAssignment_3_0 )
                    {
                     before(grammarAccess.getQuestionGroupAccess().getQuestionGroupsAssignment_3_0()); 
                    // InternalQL.g:1507:3: ( rule__QuestionGroup__QuestionGroupsAssignment_3_0 )
                    // InternalQL.g:1507:4: rule__QuestionGroup__QuestionGroupsAssignment_3_0
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
                    // InternalQL.g:1511:2: ( ( rule__QuestionGroup__QuestionsAssignment_3_1 ) )
                    {
                    // InternalQL.g:1511:2: ( ( rule__QuestionGroup__QuestionsAssignment_3_1 ) )
                    // InternalQL.g:1512:3: ( rule__QuestionGroup__QuestionsAssignment_3_1 )
                    {
                     before(grammarAccess.getQuestionGroupAccess().getQuestionsAssignment_3_1()); 
                    // InternalQL.g:1513:3: ( rule__QuestionGroup__QuestionsAssignment_3_1 )
                    // InternalQL.g:1513:4: rule__QuestionGroup__QuestionsAssignment_3_1
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
    // InternalQL.g:1521:1: rule__ConstantCall__ValueAlternatives_1_0 : ( ( ruleStringValue ) | ( ruleIntegerValue ) | ( ruleBooleanValue ) | ( ruleDecimalValue ) );
    public final void rule__ConstantCall__ValueAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1525:1: ( ( ruleStringValue ) | ( ruleIntegerValue ) | ( ruleBooleanValue ) | ( ruleDecimalValue ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt12=1;
                }
                break;
            case RULE_INT:
                {
                int LA12_2 = input.LA(2);

                if ( (LA12_2==EOF||(LA12_2>=12 && LA12_2<=14)||LA12_2==31||(LA12_2>=33 && LA12_2<=39)||LA12_2==41||LA12_2==44||(LA12_2>=47 && LA12_2<=49)||LA12_2==70) ) {
                    alt12=2;
                }
                else if ( (LA12_2==66) ) {
                    alt12=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }
                }
                break;
            case 15:
            case 16:
                {
                alt12=3;
                }
                break;
            case 66:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalQL.g:1526:2: ( ruleStringValue )
                    {
                    // InternalQL.g:1526:2: ( ruleStringValue )
                    // InternalQL.g:1527:3: ruleStringValue
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
                    // InternalQL.g:1532:2: ( ruleIntegerValue )
                    {
                    // InternalQL.g:1532:2: ( ruleIntegerValue )
                    // InternalQL.g:1533:3: ruleIntegerValue
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
                    // InternalQL.g:1538:2: ( ruleBooleanValue )
                    {
                    // InternalQL.g:1538:2: ( ruleBooleanValue )
                    // InternalQL.g:1539:3: ruleBooleanValue
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
                    // InternalQL.g:1544:2: ( ruleDecimalValue )
                    {
                    // InternalQL.g:1544:2: ( ruleDecimalValue )
                    // InternalQL.g:1545:3: ruleDecimalValue
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


    // $ANTLR start "rule__EFloat__Alternatives_3_0"
    // InternalQL.g:1554:1: rule__EFloat__Alternatives_3_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EFloat__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1558:1: ( ( 'E' ) | ( 'e' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            else if ( (LA13_0==18) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalQL.g:1559:2: ( 'E' )
                    {
                    // InternalQL.g:1559:2: ( 'E' )
                    // InternalQL.g:1560:3: 'E'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_3_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:1565:2: ( 'e' )
                    {
                    // InternalQL.g:1565:2: ( 'e' )
                    // InternalQL.g:1566:3: 'e'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_3_0_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_3_0_1()); 

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
    // $ANTLR end "rule__EFloat__Alternatives_3_0"


    // $ANTLR start "rule__BinaryOperatorKind__Alternatives"
    // InternalQL.g:1575:1: rule__BinaryOperatorKind__Alternatives : ( ( ( 'PLUS' ) ) | ( ( 'MINUS' ) ) | ( ( 'MULT' ) ) | ( ( 'DIV' ) ) | ( ( 'EQUAL' ) ) | ( ( 'NOTEQUAL' ) ) | ( ( 'GREATER' ) ) | ( ( 'LOWER' ) ) | ( ( 'GREATEROREQUAL' ) ) | ( ( 'LOWEROREQUAL' ) ) | ( ( 'AND' ) ) | ( ( 'OR' ) ) );
    public final void rule__BinaryOperatorKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1579:1: ( ( ( 'PLUS' ) ) | ( ( 'MINUS' ) ) | ( ( 'MULT' ) ) | ( ( 'DIV' ) ) | ( ( 'EQUAL' ) ) | ( ( 'NOTEQUAL' ) ) | ( ( 'GREATER' ) ) | ( ( 'LOWER' ) ) | ( ( 'GREATEROREQUAL' ) ) | ( ( 'LOWEROREQUAL' ) ) | ( ( 'AND' ) ) | ( ( 'OR' ) ) )
            int alt14=12;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt14=1;
                }
                break;
            case 20:
                {
                alt14=2;
                }
                break;
            case 21:
                {
                alt14=3;
                }
                break;
            case 22:
                {
                alt14=4;
                }
                break;
            case 23:
                {
                alt14=5;
                }
                break;
            case 24:
                {
                alt14=6;
                }
                break;
            case 25:
                {
                alt14=7;
                }
                break;
            case 26:
                {
                alt14=8;
                }
                break;
            case 27:
                {
                alt14=9;
                }
                break;
            case 28:
                {
                alt14=10;
                }
                break;
            case 29:
                {
                alt14=11;
                }
                break;
            case 30:
                {
                alt14=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalQL.g:1580:2: ( ( 'PLUS' ) )
                    {
                    // InternalQL.g:1580:2: ( ( 'PLUS' ) )
                    // InternalQL.g:1581:3: ( 'PLUS' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getPLUSEnumLiteralDeclaration_0()); 
                    // InternalQL.g:1582:3: ( 'PLUS' )
                    // InternalQL.g:1582:4: 'PLUS'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getPLUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:1586:2: ( ( 'MINUS' ) )
                    {
                    // InternalQL.g:1586:2: ( ( 'MINUS' ) )
                    // InternalQL.g:1587:3: ( 'MINUS' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getMINUSEnumLiteralDeclaration_1()); 
                    // InternalQL.g:1588:3: ( 'MINUS' )
                    // InternalQL.g:1588:4: 'MINUS'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getMINUSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQL.g:1592:2: ( ( 'MULT' ) )
                    {
                    // InternalQL.g:1592:2: ( ( 'MULT' ) )
                    // InternalQL.g:1593:3: ( 'MULT' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getMULTEnumLiteralDeclaration_2()); 
                    // InternalQL.g:1594:3: ( 'MULT' )
                    // InternalQL.g:1594:4: 'MULT'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getMULTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQL.g:1598:2: ( ( 'DIV' ) )
                    {
                    // InternalQL.g:1598:2: ( ( 'DIV' ) )
                    // InternalQL.g:1599:3: ( 'DIV' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getDIVEnumLiteralDeclaration_3()); 
                    // InternalQL.g:1600:3: ( 'DIV' )
                    // InternalQL.g:1600:4: 'DIV'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getDIVEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalQL.g:1604:2: ( ( 'EQUAL' ) )
                    {
                    // InternalQL.g:1604:2: ( ( 'EQUAL' ) )
                    // InternalQL.g:1605:3: ( 'EQUAL' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getEQUALEnumLiteralDeclaration_4()); 
                    // InternalQL.g:1606:3: ( 'EQUAL' )
                    // InternalQL.g:1606:4: 'EQUAL'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getEQUALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalQL.g:1610:2: ( ( 'NOTEQUAL' ) )
                    {
                    // InternalQL.g:1610:2: ( ( 'NOTEQUAL' ) )
                    // InternalQL.g:1611:3: ( 'NOTEQUAL' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getNOTEQUALEnumLiteralDeclaration_5()); 
                    // InternalQL.g:1612:3: ( 'NOTEQUAL' )
                    // InternalQL.g:1612:4: 'NOTEQUAL'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getNOTEQUALEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalQL.g:1616:2: ( ( 'GREATER' ) )
                    {
                    // InternalQL.g:1616:2: ( ( 'GREATER' ) )
                    // InternalQL.g:1617:3: ( 'GREATER' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getGREATEREnumLiteralDeclaration_6()); 
                    // InternalQL.g:1618:3: ( 'GREATER' )
                    // InternalQL.g:1618:4: 'GREATER'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getGREATEREnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalQL.g:1622:2: ( ( 'LOWER' ) )
                    {
                    // InternalQL.g:1622:2: ( ( 'LOWER' ) )
                    // InternalQL.g:1623:3: ( 'LOWER' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getLOWEREnumLiteralDeclaration_7()); 
                    // InternalQL.g:1624:3: ( 'LOWER' )
                    // InternalQL.g:1624:4: 'LOWER'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getLOWEREnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalQL.g:1628:2: ( ( 'GREATEROREQUAL' ) )
                    {
                    // InternalQL.g:1628:2: ( ( 'GREATEROREQUAL' ) )
                    // InternalQL.g:1629:3: ( 'GREATEROREQUAL' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_8()); 
                    // InternalQL.g:1630:3: ( 'GREATEROREQUAL' )
                    // InternalQL.g:1630:4: 'GREATEROREQUAL'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalQL.g:1634:2: ( ( 'LOWEROREQUAL' ) )
                    {
                    // InternalQL.g:1634:2: ( ( 'LOWEROREQUAL' ) )
                    // InternalQL.g:1635:3: ( 'LOWEROREQUAL' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getLOWEROREQUALEnumLiteralDeclaration_9()); 
                    // InternalQL.g:1636:3: ( 'LOWEROREQUAL' )
                    // InternalQL.g:1636:4: 'LOWEROREQUAL'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getLOWEROREQUALEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalQL.g:1640:2: ( ( 'AND' ) )
                    {
                    // InternalQL.g:1640:2: ( ( 'AND' ) )
                    // InternalQL.g:1641:3: ( 'AND' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getANDEnumLiteralDeclaration_10()); 
                    // InternalQL.g:1642:3: ( 'AND' )
                    // InternalQL.g:1642:4: 'AND'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getANDEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalQL.g:1646:2: ( ( 'OR' ) )
                    {
                    // InternalQL.g:1646:2: ( ( 'OR' ) )
                    // InternalQL.g:1647:3: ( 'OR' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getOREnumLiteralDeclaration_11()); 
                    // InternalQL.g:1648:3: ( 'OR' )
                    // InternalQL.g:1648:4: 'OR'
                    {
                    match(input,30,FOLLOW_2); 

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
    // InternalQL.g:1656:1: rule__UnaryOperatorKind__Alternatives : ( ( ( '-' ) ) | ( ( 'not' ) ) );
    public final void rule__UnaryOperatorKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1660:1: ( ( ( '-' ) ) | ( ( 'not' ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            else if ( (LA15_0==32) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalQL.g:1661:2: ( ( '-' ) )
                    {
                    // InternalQL.g:1661:2: ( ( '-' ) )
                    // InternalQL.g:1662:3: ( '-' )
                    {
                     before(grammarAccess.getUnaryOperatorKindAccess().getUNARYMINUSEnumLiteralDeclaration_0()); 
                    // InternalQL.g:1663:3: ( '-' )
                    // InternalQL.g:1663:4: '-'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getUnaryOperatorKindAccess().getUNARYMINUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:1667:2: ( ( 'not' ) )
                    {
                    // InternalQL.g:1667:2: ( ( 'not' ) )
                    // InternalQL.g:1668:3: ( 'not' )
                    {
                     before(grammarAccess.getUnaryOperatorKindAccess().getNOTEnumLiteralDeclaration_1()); 
                    // InternalQL.g:1669:3: ( 'not' )
                    // InternalQL.g:1669:4: 'not'
                    {
                    match(input,32,FOLLOW_2); 

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
    // InternalQL.g:1677:1: rule__AdditionOperatorKind__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__AdditionOperatorKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1681:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            else if ( (LA16_0==31) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalQL.g:1682:2: ( ( '+' ) )
                    {
                    // InternalQL.g:1682:2: ( ( '+' ) )
                    // InternalQL.g:1683:3: ( '+' )
                    {
                     before(grammarAccess.getAdditionOperatorKindAccess().getPLUSEnumLiteralDeclaration_0()); 
                    // InternalQL.g:1684:3: ( '+' )
                    // InternalQL.g:1684:4: '+'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getAdditionOperatorKindAccess().getPLUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:1688:2: ( ( '-' ) )
                    {
                    // InternalQL.g:1688:2: ( ( '-' ) )
                    // InternalQL.g:1689:3: ( '-' )
                    {
                     before(grammarAccess.getAdditionOperatorKindAccess().getMINUSEnumLiteralDeclaration_1()); 
                    // InternalQL.g:1690:3: ( '-' )
                    // InternalQL.g:1690:4: '-'
                    {
                    match(input,31,FOLLOW_2); 

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
    // InternalQL.g:1698:1: rule__MultiplicationOperatorKind__Alternatives : ( ( ( '*' ) ) | ( ( '/' ) ) );
    public final void rule__MultiplicationOperatorKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1702:1: ( ( ( '*' ) ) | ( ( '/' ) ) )
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
                    // InternalQL.g:1703:2: ( ( '*' ) )
                    {
                    // InternalQL.g:1703:2: ( ( '*' ) )
                    // InternalQL.g:1704:3: ( '*' )
                    {
                     before(grammarAccess.getMultiplicationOperatorKindAccess().getMULTEnumLiteralDeclaration_0()); 
                    // InternalQL.g:1705:3: ( '*' )
                    // InternalQL.g:1705:4: '*'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicationOperatorKindAccess().getMULTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:1709:2: ( ( '/' ) )
                    {
                    // InternalQL.g:1709:2: ( ( '/' ) )
                    // InternalQL.g:1710:3: ( '/' )
                    {
                     before(grammarAccess.getMultiplicationOperatorKindAccess().getDIVEnumLiteralDeclaration_1()); 
                    // InternalQL.g:1711:3: ( '/' )
                    // InternalQL.g:1711:4: '/'
                    {
                    match(input,35,FOLLOW_2); 

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
    // InternalQL.g:1719:1: rule__ComparisionOperatorKind__Alternatives : ( ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) );
    public final void rule__ComparisionOperatorKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1723:1: ( ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt18=1;
                }
                break;
            case 37:
                {
                alt18=2;
                }
                break;
            case 38:
                {
                alt18=3;
                }
                break;
            case 39:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalQL.g:1724:2: ( ( '>' ) )
                    {
                    // InternalQL.g:1724:2: ( ( '>' ) )
                    // InternalQL.g:1725:3: ( '>' )
                    {
                     before(grammarAccess.getComparisionOperatorKindAccess().getGREATEREnumLiteralDeclaration_0()); 
                    // InternalQL.g:1726:3: ( '>' )
                    // InternalQL.g:1726:4: '>'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisionOperatorKindAccess().getGREATEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:1730:2: ( ( '<' ) )
                    {
                    // InternalQL.g:1730:2: ( ( '<' ) )
                    // InternalQL.g:1731:3: ( '<' )
                    {
                     before(grammarAccess.getComparisionOperatorKindAccess().getLOWEREnumLiteralDeclaration_1()); 
                    // InternalQL.g:1732:3: ( '<' )
                    // InternalQL.g:1732:4: '<'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisionOperatorKindAccess().getLOWEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQL.g:1736:2: ( ( '>=' ) )
                    {
                    // InternalQL.g:1736:2: ( ( '>=' ) )
                    // InternalQL.g:1737:3: ( '>=' )
                    {
                     before(grammarAccess.getComparisionOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_2()); 
                    // InternalQL.g:1738:3: ( '>=' )
                    // InternalQL.g:1738:4: '>='
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisionOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQL.g:1742:2: ( ( '<=' ) )
                    {
                    // InternalQL.g:1742:2: ( ( '<=' ) )
                    // InternalQL.g:1743:3: ( '<=' )
                    {
                     before(grammarAccess.getComparisionOperatorKindAccess().getLOWEROREQUALEnumLiteralDeclaration_3()); 
                    // InternalQL.g:1744:3: ( '<=' )
                    // InternalQL.g:1744:4: '<='
                    {
                    match(input,39,FOLLOW_2); 

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


    // $ANTLR start "rule__QLModel__Group__0"
    // InternalQL.g:1752:1: rule__QLModel__Group__0 : rule__QLModel__Group__0__Impl rule__QLModel__Group__1 ;
    public final void rule__QLModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1756:1: ( rule__QLModel__Group__0__Impl rule__QLModel__Group__1 )
            // InternalQL.g:1757:2: rule__QLModel__Group__0__Impl rule__QLModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__QLModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group__0"


    // $ANTLR start "rule__QLModel__Group__0__Impl"
    // InternalQL.g:1764:1: rule__QLModel__Group__0__Impl : ( () ) ;
    public final void rule__QLModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1768:1: ( ( () ) )
            // InternalQL.g:1769:1: ( () )
            {
            // InternalQL.g:1769:1: ( () )
            // InternalQL.g:1770:2: ()
            {
             before(grammarAccess.getQLModelAccess().getQLModelAction_0()); 
            // InternalQL.g:1771:2: ()
            // InternalQL.g:1771:3: 
            {
            }

             after(grammarAccess.getQLModelAccess().getQLModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group__0__Impl"


    // $ANTLR start "rule__QLModel__Group__1"
    // InternalQL.g:1779:1: rule__QLModel__Group__1 : rule__QLModel__Group__1__Impl rule__QLModel__Group__2 ;
    public final void rule__QLModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1783:1: ( rule__QLModel__Group__1__Impl rule__QLModel__Group__2 )
            // InternalQL.g:1784:2: rule__QLModel__Group__1__Impl rule__QLModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__QLModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group__1"


    // $ANTLR start "rule__QLModel__Group__1__Impl"
    // InternalQL.g:1791:1: rule__QLModel__Group__1__Impl : ( 'QLModel' ) ;
    public final void rule__QLModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1795:1: ( ( 'QLModel' ) )
            // InternalQL.g:1796:1: ( 'QLModel' )
            {
            // InternalQL.g:1796:1: ( 'QLModel' )
            // InternalQL.g:1797:2: 'QLModel'
            {
             before(grammarAccess.getQLModelAccess().getQLModelKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getQLModelAccess().getQLModelKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group__1__Impl"


    // $ANTLR start "rule__QLModel__Group__2"
    // InternalQL.g:1806:1: rule__QLModel__Group__2 : rule__QLModel__Group__2__Impl rule__QLModel__Group__3 ;
    public final void rule__QLModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1810:1: ( rule__QLModel__Group__2__Impl rule__QLModel__Group__3 )
            // InternalQL.g:1811:2: rule__QLModel__Group__2__Impl rule__QLModel__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__QLModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group__2"


    // $ANTLR start "rule__QLModel__Group__2__Impl"
    // InternalQL.g:1818:1: rule__QLModel__Group__2__Impl : ( ( rule__QLModel__Group_2__0 )? ) ;
    public final void rule__QLModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1822:1: ( ( ( rule__QLModel__Group_2__0 )? ) )
            // InternalQL.g:1823:1: ( ( rule__QLModel__Group_2__0 )? )
            {
            // InternalQL.g:1823:1: ( ( rule__QLModel__Group_2__0 )? )
            // InternalQL.g:1824:2: ( rule__QLModel__Group_2__0 )?
            {
             before(grammarAccess.getQLModelAccess().getGroup_2()); 
            // InternalQL.g:1825:2: ( rule__QLModel__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==43) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalQL.g:1825:3: rule__QLModel__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QLModel__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQLModelAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group__2__Impl"


    // $ANTLR start "rule__QLModel__Group__3"
    // InternalQL.g:1833:1: rule__QLModel__Group__3 : rule__QLModel__Group__3__Impl rule__QLModel__Group__4 ;
    public final void rule__QLModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1837:1: ( rule__QLModel__Group__3__Impl rule__QLModel__Group__4 )
            // InternalQL.g:1838:2: rule__QLModel__Group__3__Impl rule__QLModel__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__QLModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group__3"


    // $ANTLR start "rule__QLModel__Group__3__Impl"
    // InternalQL.g:1845:1: rule__QLModel__Group__3__Impl : ( '{' ) ;
    public final void rule__QLModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1849:1: ( ( '{' ) )
            // InternalQL.g:1850:1: ( '{' )
            {
            // InternalQL.g:1850:1: ( '{' )
            // InternalQL.g:1851:2: '{'
            {
             before(grammarAccess.getQLModelAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getQLModelAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group__3__Impl"


    // $ANTLR start "rule__QLModel__Group__4"
    // InternalQL.g:1860:1: rule__QLModel__Group__4 : rule__QLModel__Group__4__Impl rule__QLModel__Group__5 ;
    public final void rule__QLModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1864:1: ( rule__QLModel__Group__4__Impl rule__QLModel__Group__5 )
            // InternalQL.g:1865:2: rule__QLModel__Group__4__Impl rule__QLModel__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__QLModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group__4"


    // $ANTLR start "rule__QLModel__Group__4__Impl"
    // InternalQL.g:1872:1: rule__QLModel__Group__4__Impl : ( ( rule__QLModel__Alternatives_4 )* ) ;
    public final void rule__QLModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1876:1: ( ( ( rule__QLModel__Alternatives_4 )* ) )
            // InternalQL.g:1877:1: ( ( rule__QLModel__Alternatives_4 )* )
            {
            // InternalQL.g:1877:1: ( ( rule__QLModel__Alternatives_4 )* )
            // InternalQL.g:1878:2: ( rule__QLModel__Alternatives_4 )*
            {
             before(grammarAccess.getQLModelAccess().getAlternatives_4()); 
            // InternalQL.g:1879:2: ( rule__QLModel__Alternatives_4 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=50 && LA20_0<=51)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalQL.g:1879:3: rule__QLModel__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__QLModel__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getQLModelAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group__4__Impl"


    // $ANTLR start "rule__QLModel__Group__5"
    // InternalQL.g:1887:1: rule__QLModel__Group__5 : rule__QLModel__Group__5__Impl ;
    public final void rule__QLModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1891:1: ( rule__QLModel__Group__5__Impl )
            // InternalQL.g:1892:2: rule__QLModel__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QLModel__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group__5"


    // $ANTLR start "rule__QLModel__Group__5__Impl"
    // InternalQL.g:1898:1: rule__QLModel__Group__5__Impl : ( '}' ) ;
    public final void rule__QLModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1902:1: ( ( '}' ) )
            // InternalQL.g:1903:1: ( '}' )
            {
            // InternalQL.g:1903:1: ( '}' )
            // InternalQL.g:1904:2: '}'
            {
             before(grammarAccess.getQLModelAccess().getRightCurlyBracketKeyword_5()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getQLModelAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group__5__Impl"


    // $ANTLR start "rule__QLModel__Group_2__0"
    // InternalQL.g:1914:1: rule__QLModel__Group_2__0 : rule__QLModel__Group_2__0__Impl rule__QLModel__Group_2__1 ;
    public final void rule__QLModel__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1918:1: ( rule__QLModel__Group_2__0__Impl rule__QLModel__Group_2__1 )
            // InternalQL.g:1919:2: rule__QLModel__Group_2__0__Impl rule__QLModel__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__QLModel__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_2__0"


    // $ANTLR start "rule__QLModel__Group_2__0__Impl"
    // InternalQL.g:1926:1: rule__QLModel__Group_2__0__Impl : ( '(' ) ;
    public final void rule__QLModel__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1930:1: ( ( '(' ) )
            // InternalQL.g:1931:1: ( '(' )
            {
            // InternalQL.g:1931:1: ( '(' )
            // InternalQL.g:1932:2: '('
            {
             before(grammarAccess.getQLModelAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getQLModelAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_2__0__Impl"


    // $ANTLR start "rule__QLModel__Group_2__1"
    // InternalQL.g:1941:1: rule__QLModel__Group_2__1 : rule__QLModel__Group_2__1__Impl rule__QLModel__Group_2__2 ;
    public final void rule__QLModel__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1945:1: ( rule__QLModel__Group_2__1__Impl rule__QLModel__Group_2__2 )
            // InternalQL.g:1946:2: rule__QLModel__Group_2__1__Impl rule__QLModel__Group_2__2
            {
            pushFollow(FOLLOW_7);
            rule__QLModel__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_2__1"


    // $ANTLR start "rule__QLModel__Group_2__1__Impl"
    // InternalQL.g:1953:1: rule__QLModel__Group_2__1__Impl : ( ( rule__QLModel__CanSubmitAssignment_2_1 )? ) ;
    public final void rule__QLModel__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1957:1: ( ( ( rule__QLModel__CanSubmitAssignment_2_1 )? ) )
            // InternalQL.g:1958:1: ( ( rule__QLModel__CanSubmitAssignment_2_1 )? )
            {
            // InternalQL.g:1958:1: ( ( rule__QLModel__CanSubmitAssignment_2_1 )? )
            // InternalQL.g:1959:2: ( rule__QLModel__CanSubmitAssignment_2_1 )?
            {
             before(grammarAccess.getQLModelAccess().getCanSubmitAssignment_2_1()); 
            // InternalQL.g:1960:2: ( rule__QLModel__CanSubmitAssignment_2_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==71) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalQL.g:1960:3: rule__QLModel__CanSubmitAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__QLModel__CanSubmitAssignment_2_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQLModelAccess().getCanSubmitAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_2__1__Impl"


    // $ANTLR start "rule__QLModel__Group_2__2"
    // InternalQL.g:1968:1: rule__QLModel__Group_2__2 : rule__QLModel__Group_2__2__Impl rule__QLModel__Group_2__3 ;
    public final void rule__QLModel__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1972:1: ( rule__QLModel__Group_2__2__Impl rule__QLModel__Group_2__3 )
            // InternalQL.g:1973:2: rule__QLModel__Group_2__2__Impl rule__QLModel__Group_2__3
            {
            pushFollow(FOLLOW_7);
            rule__QLModel__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_2__2"


    // $ANTLR start "rule__QLModel__Group_2__2__Impl"
    // InternalQL.g:1980:1: rule__QLModel__Group_2__2__Impl : ( ( rule__QLModel__Group_2_2__0 )? ) ;
    public final void rule__QLModel__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1984:1: ( ( ( rule__QLModel__Group_2_2__0 )? ) )
            // InternalQL.g:1985:1: ( ( rule__QLModel__Group_2_2__0 )? )
            {
            // InternalQL.g:1985:1: ( ( rule__QLModel__Group_2_2__0 )? )
            // InternalQL.g:1986:2: ( rule__QLModel__Group_2_2__0 )?
            {
             before(grammarAccess.getQLModelAccess().getGroup_2_2()); 
            // InternalQL.g:1987:2: ( rule__QLModel__Group_2_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==45) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalQL.g:1987:3: rule__QLModel__Group_2_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QLModel__Group_2_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQLModelAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_2__2__Impl"


    // $ANTLR start "rule__QLModel__Group_2__3"
    // InternalQL.g:1995:1: rule__QLModel__Group_2__3 : rule__QLModel__Group_2__3__Impl ;
    public final void rule__QLModel__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1999:1: ( rule__QLModel__Group_2__3__Impl )
            // InternalQL.g:2000:2: rule__QLModel__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QLModel__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_2__3"


    // $ANTLR start "rule__QLModel__Group_2__3__Impl"
    // InternalQL.g:2006:1: rule__QLModel__Group_2__3__Impl : ( ')' ) ;
    public final void rule__QLModel__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2010:1: ( ( ')' ) )
            // InternalQL.g:2011:1: ( ')' )
            {
            // InternalQL.g:2011:1: ( ')' )
            // InternalQL.g:2012:2: ')'
            {
             before(grammarAccess.getQLModelAccess().getRightParenthesisKeyword_2_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getQLModelAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_2__3__Impl"


    // $ANTLR start "rule__QLModel__Group_2_2__0"
    // InternalQL.g:2022:1: rule__QLModel__Group_2_2__0 : rule__QLModel__Group_2_2__0__Impl rule__QLModel__Group_2_2__1 ;
    public final void rule__QLModel__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2026:1: ( rule__QLModel__Group_2_2__0__Impl rule__QLModel__Group_2_2__1 )
            // InternalQL.g:2027:2: rule__QLModel__Group_2_2__0__Impl rule__QLModel__Group_2_2__1
            {
            pushFollow(FOLLOW_8);
            rule__QLModel__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_2_2__0"


    // $ANTLR start "rule__QLModel__Group_2_2__0__Impl"
    // InternalQL.g:2034:1: rule__QLModel__Group_2_2__0__Impl : ( 'submitDate' ) ;
    public final void rule__QLModel__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2038:1: ( ( 'submitDate' ) )
            // InternalQL.g:2039:1: ( 'submitDate' )
            {
            // InternalQL.g:2039:1: ( 'submitDate' )
            // InternalQL.g:2040:2: 'submitDate'
            {
             before(grammarAccess.getQLModelAccess().getSubmitDateKeyword_2_2_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getQLModelAccess().getSubmitDateKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_2_2__0__Impl"


    // $ANTLR start "rule__QLModel__Group_2_2__1"
    // InternalQL.g:2049:1: rule__QLModel__Group_2_2__1 : rule__QLModel__Group_2_2__1__Impl ;
    public final void rule__QLModel__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2053:1: ( rule__QLModel__Group_2_2__1__Impl )
            // InternalQL.g:2054:2: rule__QLModel__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QLModel__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_2_2__1"


    // $ANTLR start "rule__QLModel__Group_2_2__1__Impl"
    // InternalQL.g:2060:1: rule__QLModel__Group_2_2__1__Impl : ( ( rule__QLModel__SubmitDateAssignment_2_2_1 ) ) ;
    public final void rule__QLModel__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2064:1: ( ( ( rule__QLModel__SubmitDateAssignment_2_2_1 ) ) )
            // InternalQL.g:2065:1: ( ( rule__QLModel__SubmitDateAssignment_2_2_1 ) )
            {
            // InternalQL.g:2065:1: ( ( rule__QLModel__SubmitDateAssignment_2_2_1 ) )
            // InternalQL.g:2066:2: ( rule__QLModel__SubmitDateAssignment_2_2_1 )
            {
             before(grammarAccess.getQLModelAccess().getSubmitDateAssignment_2_2_1()); 
            // InternalQL.g:2067:2: ( rule__QLModel__SubmitDateAssignment_2_2_1 )
            // InternalQL.g:2067:3: rule__QLModel__SubmitDateAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__QLModel__SubmitDateAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getQLModelAccess().getSubmitDateAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_2_2__1__Impl"


    // $ANTLR start "rule__UnaryExpression__Group__0"
    // InternalQL.g:2076:1: rule__UnaryExpression__Group__0 : rule__UnaryExpression__Group__0__Impl rule__UnaryExpression__Group__1 ;
    public final void rule__UnaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2080:1: ( rule__UnaryExpression__Group__0__Impl rule__UnaryExpression__Group__1 )
            // InternalQL.g:2081:2: rule__UnaryExpression__Group__0__Impl rule__UnaryExpression__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalQL.g:2088:1: rule__UnaryExpression__Group__0__Impl : ( () ) ;
    public final void rule__UnaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2092:1: ( ( () ) )
            // InternalQL.g:2093:1: ( () )
            {
            // InternalQL.g:2093:1: ( () )
            // InternalQL.g:2094:2: ()
            {
             before(grammarAccess.getUnaryExpressionAccess().getBasicUnaryExpressionAction_0()); 
            // InternalQL.g:2095:2: ()
            // InternalQL.g:2095:3: 
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
    // InternalQL.g:2103:1: rule__UnaryExpression__Group__1 : rule__UnaryExpression__Group__1__Impl rule__UnaryExpression__Group__2 ;
    public final void rule__UnaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2107:1: ( rule__UnaryExpression__Group__1__Impl rule__UnaryExpression__Group__2 )
            // InternalQL.g:2108:2: rule__UnaryExpression__Group__1__Impl rule__UnaryExpression__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalQL.g:2115:1: rule__UnaryExpression__Group__1__Impl : ( ( rule__UnaryExpression__OperatorAssignment_1 ) ) ;
    public final void rule__UnaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2119:1: ( ( ( rule__UnaryExpression__OperatorAssignment_1 ) ) )
            // InternalQL.g:2120:1: ( ( rule__UnaryExpression__OperatorAssignment_1 ) )
            {
            // InternalQL.g:2120:1: ( ( rule__UnaryExpression__OperatorAssignment_1 ) )
            // InternalQL.g:2121:2: ( rule__UnaryExpression__OperatorAssignment_1 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getOperatorAssignment_1()); 
            // InternalQL.g:2122:2: ( rule__UnaryExpression__OperatorAssignment_1 )
            // InternalQL.g:2122:3: rule__UnaryExpression__OperatorAssignment_1
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
    // InternalQL.g:2130:1: rule__UnaryExpression__Group__2 : rule__UnaryExpression__Group__2__Impl ;
    public final void rule__UnaryExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2134:1: ( rule__UnaryExpression__Group__2__Impl )
            // InternalQL.g:2135:2: rule__UnaryExpression__Group__2__Impl
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
    // InternalQL.g:2141:1: rule__UnaryExpression__Group__2__Impl : ( ( rule__UnaryExpression__OperandAssignment_2 ) ) ;
    public final void rule__UnaryExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2145:1: ( ( ( rule__UnaryExpression__OperandAssignment_2 ) ) )
            // InternalQL.g:2146:1: ( ( rule__UnaryExpression__OperandAssignment_2 ) )
            {
            // InternalQL.g:2146:1: ( ( rule__UnaryExpression__OperandAssignment_2 ) )
            // InternalQL.g:2147:2: ( rule__UnaryExpression__OperandAssignment_2 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getOperandAssignment_2()); 
            // InternalQL.g:2148:2: ( rule__UnaryExpression__OperandAssignment_2 )
            // InternalQL.g:2148:3: rule__UnaryExpression__OperandAssignment_2
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
    // InternalQL.g:2157:1: rule__PrimaryExpression__Group_2__0 : rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 ;
    public final void rule__PrimaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2161:1: ( rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 )
            // InternalQL.g:2162:2: rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalQL.g:2169:1: rule__PrimaryExpression__Group_2__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2173:1: ( ( '(' ) )
            // InternalQL.g:2174:1: ( '(' )
            {
            // InternalQL.g:2174:1: ( '(' )
            // InternalQL.g:2175:2: '('
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalQL.g:2184:1: rule__PrimaryExpression__Group_2__1 : rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2 ;
    public final void rule__PrimaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2188:1: ( rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2 )
            // InternalQL.g:2189:2: rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalQL.g:2196:1: rule__PrimaryExpression__Group_2__1__Impl : ( ( rule__PrimaryExpression__Alternatives_2_1 ) ) ;
    public final void rule__PrimaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2200:1: ( ( ( rule__PrimaryExpression__Alternatives_2_1 ) ) )
            // InternalQL.g:2201:1: ( ( rule__PrimaryExpression__Alternatives_2_1 ) )
            {
            // InternalQL.g:2201:1: ( ( rule__PrimaryExpression__Alternatives_2_1 ) )
            // InternalQL.g:2202:2: ( rule__PrimaryExpression__Alternatives_2_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives_2_1()); 
            // InternalQL.g:2203:2: ( rule__PrimaryExpression__Alternatives_2_1 )
            // InternalQL.g:2203:3: rule__PrimaryExpression__Alternatives_2_1
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
    // InternalQL.g:2211:1: rule__PrimaryExpression__Group_2__2 : rule__PrimaryExpression__Group_2__2__Impl ;
    public final void rule__PrimaryExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2215:1: ( rule__PrimaryExpression__Group_2__2__Impl )
            // InternalQL.g:2216:2: rule__PrimaryExpression__Group_2__2__Impl
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
    // InternalQL.g:2222:1: rule__PrimaryExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2226:1: ( ( ')' ) )
            // InternalQL.g:2227:1: ( ')' )
            {
            // InternalQL.g:2227:1: ( ')' )
            // InternalQL.g:2228:2: ')'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_2()); 
            match(input,44,FOLLOW_2); 
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
    // InternalQL.g:2238:1: rule__IfExpression__Group__0 : rule__IfExpression__Group__0__Impl rule__IfExpression__Group__1 ;
    public final void rule__IfExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2242:1: ( rule__IfExpression__Group__0__Impl rule__IfExpression__Group__1 )
            // InternalQL.g:2243:2: rule__IfExpression__Group__0__Impl rule__IfExpression__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalQL.g:2250:1: rule__IfExpression__Group__0__Impl : ( () ) ;
    public final void rule__IfExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2254:1: ( ( () ) )
            // InternalQL.g:2255:1: ( () )
            {
            // InternalQL.g:2255:1: ( () )
            // InternalQL.g:2256:2: ()
            {
             before(grammarAccess.getIfExpressionAccess().getIfExpressionAction_0()); 
            // InternalQL.g:2257:2: ()
            // InternalQL.g:2257:3: 
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
    // InternalQL.g:2265:1: rule__IfExpression__Group__1 : rule__IfExpression__Group__1__Impl rule__IfExpression__Group__2 ;
    public final void rule__IfExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2269:1: ( rule__IfExpression__Group__1__Impl rule__IfExpression__Group__2 )
            // InternalQL.g:2270:2: rule__IfExpression__Group__1__Impl rule__IfExpression__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalQL.g:2277:1: rule__IfExpression__Group__1__Impl : ( 'if' ) ;
    public final void rule__IfExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2281:1: ( ( 'if' ) )
            // InternalQL.g:2282:1: ( 'if' )
            {
            // InternalQL.g:2282:1: ( 'if' )
            // InternalQL.g:2283:2: 'if'
            {
             before(grammarAccess.getIfExpressionAccess().getIfKeyword_1()); 
            match(input,46,FOLLOW_2); 
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
    // InternalQL.g:2292:1: rule__IfExpression__Group__2 : rule__IfExpression__Group__2__Impl rule__IfExpression__Group__3 ;
    public final void rule__IfExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2296:1: ( rule__IfExpression__Group__2__Impl rule__IfExpression__Group__3 )
            // InternalQL.g:2297:2: rule__IfExpression__Group__2__Impl rule__IfExpression__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalQL.g:2304:1: rule__IfExpression__Group__2__Impl : ( ( rule__IfExpression__ConditionAssignment_2 ) ) ;
    public final void rule__IfExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2308:1: ( ( ( rule__IfExpression__ConditionAssignment_2 ) ) )
            // InternalQL.g:2309:1: ( ( rule__IfExpression__ConditionAssignment_2 ) )
            {
            // InternalQL.g:2309:1: ( ( rule__IfExpression__ConditionAssignment_2 ) )
            // InternalQL.g:2310:2: ( rule__IfExpression__ConditionAssignment_2 )
            {
             before(grammarAccess.getIfExpressionAccess().getConditionAssignment_2()); 
            // InternalQL.g:2311:2: ( rule__IfExpression__ConditionAssignment_2 )
            // InternalQL.g:2311:3: rule__IfExpression__ConditionAssignment_2
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
    // InternalQL.g:2319:1: rule__IfExpression__Group__3 : rule__IfExpression__Group__3__Impl rule__IfExpression__Group__4 ;
    public final void rule__IfExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2323:1: ( rule__IfExpression__Group__3__Impl rule__IfExpression__Group__4 )
            // InternalQL.g:2324:2: rule__IfExpression__Group__3__Impl rule__IfExpression__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalQL.g:2331:1: rule__IfExpression__Group__3__Impl : ( 'then' ) ;
    public final void rule__IfExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2335:1: ( ( 'then' ) )
            // InternalQL.g:2336:1: ( 'then' )
            {
            // InternalQL.g:2336:1: ( 'then' )
            // InternalQL.g:2337:2: 'then'
            {
             before(grammarAccess.getIfExpressionAccess().getThenKeyword_3()); 
            match(input,47,FOLLOW_2); 
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
    // InternalQL.g:2346:1: rule__IfExpression__Group__4 : rule__IfExpression__Group__4__Impl rule__IfExpression__Group__5 ;
    public final void rule__IfExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2350:1: ( rule__IfExpression__Group__4__Impl rule__IfExpression__Group__5 )
            // InternalQL.g:2351:2: rule__IfExpression__Group__4__Impl rule__IfExpression__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalQL.g:2358:1: rule__IfExpression__Group__4__Impl : ( ( rule__IfExpression__ThenExpressionAssignment_4 ) ) ;
    public final void rule__IfExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2362:1: ( ( ( rule__IfExpression__ThenExpressionAssignment_4 ) ) )
            // InternalQL.g:2363:1: ( ( rule__IfExpression__ThenExpressionAssignment_4 ) )
            {
            // InternalQL.g:2363:1: ( ( rule__IfExpression__ThenExpressionAssignment_4 ) )
            // InternalQL.g:2364:2: ( rule__IfExpression__ThenExpressionAssignment_4 )
            {
             before(grammarAccess.getIfExpressionAccess().getThenExpressionAssignment_4()); 
            // InternalQL.g:2365:2: ( rule__IfExpression__ThenExpressionAssignment_4 )
            // InternalQL.g:2365:3: rule__IfExpression__ThenExpressionAssignment_4
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
    // InternalQL.g:2373:1: rule__IfExpression__Group__5 : rule__IfExpression__Group__5__Impl rule__IfExpression__Group__6 ;
    public final void rule__IfExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2377:1: ( rule__IfExpression__Group__5__Impl rule__IfExpression__Group__6 )
            // InternalQL.g:2378:2: rule__IfExpression__Group__5__Impl rule__IfExpression__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalQL.g:2385:1: rule__IfExpression__Group__5__Impl : ( ( rule__IfExpression__Group_5__0 )? ) ;
    public final void rule__IfExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2389:1: ( ( ( rule__IfExpression__Group_5__0 )? ) )
            // InternalQL.g:2390:1: ( ( rule__IfExpression__Group_5__0 )? )
            {
            // InternalQL.g:2390:1: ( ( rule__IfExpression__Group_5__0 )? )
            // InternalQL.g:2391:2: ( rule__IfExpression__Group_5__0 )?
            {
             before(grammarAccess.getIfExpressionAccess().getGroup_5()); 
            // InternalQL.g:2392:2: ( rule__IfExpression__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==49) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalQL.g:2392:3: rule__IfExpression__Group_5__0
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
    // InternalQL.g:2400:1: rule__IfExpression__Group__6 : rule__IfExpression__Group__6__Impl ;
    public final void rule__IfExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2404:1: ( rule__IfExpression__Group__6__Impl )
            // InternalQL.g:2405:2: rule__IfExpression__Group__6__Impl
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
    // InternalQL.g:2411:1: rule__IfExpression__Group__6__Impl : ( 'endif' ) ;
    public final void rule__IfExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2415:1: ( ( 'endif' ) )
            // InternalQL.g:2416:1: ( 'endif' )
            {
            // InternalQL.g:2416:1: ( 'endif' )
            // InternalQL.g:2417:2: 'endif'
            {
             before(grammarAccess.getIfExpressionAccess().getEndifKeyword_6()); 
            match(input,48,FOLLOW_2); 
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
    // InternalQL.g:2427:1: rule__IfExpression__Group_5__0 : rule__IfExpression__Group_5__0__Impl rule__IfExpression__Group_5__1 ;
    public final void rule__IfExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2431:1: ( rule__IfExpression__Group_5__0__Impl rule__IfExpression__Group_5__1 )
            // InternalQL.g:2432:2: rule__IfExpression__Group_5__0__Impl rule__IfExpression__Group_5__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalQL.g:2439:1: rule__IfExpression__Group_5__0__Impl : ( 'else' ) ;
    public final void rule__IfExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2443:1: ( ( 'else' ) )
            // InternalQL.g:2444:1: ( 'else' )
            {
            // InternalQL.g:2444:1: ( 'else' )
            // InternalQL.g:2445:2: 'else'
            {
             before(grammarAccess.getIfExpressionAccess().getElseKeyword_5_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalQL.g:2454:1: rule__IfExpression__Group_5__1 : rule__IfExpression__Group_5__1__Impl ;
    public final void rule__IfExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2458:1: ( rule__IfExpression__Group_5__1__Impl )
            // InternalQL.g:2459:2: rule__IfExpression__Group_5__1__Impl
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
    // InternalQL.g:2465:1: rule__IfExpression__Group_5__1__Impl : ( ( rule__IfExpression__ElseExpressionAssignment_5_1 ) ) ;
    public final void rule__IfExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2469:1: ( ( ( rule__IfExpression__ElseExpressionAssignment_5_1 ) ) )
            // InternalQL.g:2470:1: ( ( rule__IfExpression__ElseExpressionAssignment_5_1 ) )
            {
            // InternalQL.g:2470:1: ( ( rule__IfExpression__ElseExpressionAssignment_5_1 ) )
            // InternalQL.g:2471:2: ( rule__IfExpression__ElseExpressionAssignment_5_1 )
            {
             before(grammarAccess.getIfExpressionAccess().getElseExpressionAssignment_5_1()); 
            // InternalQL.g:2472:2: ( rule__IfExpression__ElseExpressionAssignment_5_1 )
            // InternalQL.g:2472:3: rule__IfExpression__ElseExpressionAssignment_5_1
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
    // InternalQL.g:2481:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2485:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // InternalQL.g:2486:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalQL.g:2493:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2497:1: ( ( ruleAndExpression ) )
            // InternalQL.g:2498:1: ( ruleAndExpression )
            {
            // InternalQL.g:2498:1: ( ruleAndExpression )
            // InternalQL.g:2499:2: ruleAndExpression
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
    // InternalQL.g:2508:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2512:1: ( rule__OrExpression__Group__1__Impl )
            // InternalQL.g:2513:2: rule__OrExpression__Group__1__Impl
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
    // InternalQL.g:2519:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2523:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // InternalQL.g:2524:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // InternalQL.g:2524:1: ( ( rule__OrExpression__Group_1__0 )* )
            // InternalQL.g:2525:2: ( rule__OrExpression__Group_1__0 )*
            {
             before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            // InternalQL.g:2526:2: ( rule__OrExpression__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==14) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalQL.g:2526:3: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalQL.g:2535:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2539:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // InternalQL.g:2540:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalQL.g:2547:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2551:1: ( ( () ) )
            // InternalQL.g:2552:1: ( () )
            {
            // InternalQL.g:2552:1: ( () )
            // InternalQL.g:2553:2: ()
            {
             before(grammarAccess.getOrExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0()); 
            // InternalQL.g:2554:2: ()
            // InternalQL.g:2554:3: 
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
    // InternalQL.g:2562:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2566:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // InternalQL.g:2567:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalQL.g:2574:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2578:1: ( ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) )
            // InternalQL.g:2579:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            {
            // InternalQL.g:2579:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            // InternalQL.g:2580:2: ( rule__OrExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalQL.g:2581:2: ( rule__OrExpression__OperatorAssignment_1_1 )
            // InternalQL.g:2581:3: rule__OrExpression__OperatorAssignment_1_1
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
    // InternalQL.g:2589:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2593:1: ( rule__OrExpression__Group_1__2__Impl )
            // InternalQL.g:2594:2: rule__OrExpression__Group_1__2__Impl
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
    // InternalQL.g:2600:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__RhsOperandAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2604:1: ( ( ( rule__OrExpression__RhsOperandAssignment_1_2 ) ) )
            // InternalQL.g:2605:1: ( ( rule__OrExpression__RhsOperandAssignment_1_2 ) )
            {
            // InternalQL.g:2605:1: ( ( rule__OrExpression__RhsOperandAssignment_1_2 ) )
            // InternalQL.g:2606:2: ( rule__OrExpression__RhsOperandAssignment_1_2 )
            {
             before(grammarAccess.getOrExpressionAccess().getRhsOperandAssignment_1_2()); 
            // InternalQL.g:2607:2: ( rule__OrExpression__RhsOperandAssignment_1_2 )
            // InternalQL.g:2607:3: rule__OrExpression__RhsOperandAssignment_1_2
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
    // InternalQL.g:2616:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2620:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalQL.g:2621:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalQL.g:2628:1: rule__AndExpression__Group__0__Impl : ( ruleEqualExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2632:1: ( ( ruleEqualExpression ) )
            // InternalQL.g:2633:1: ( ruleEqualExpression )
            {
            // InternalQL.g:2633:1: ( ruleEqualExpression )
            // InternalQL.g:2634:2: ruleEqualExpression
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
    // InternalQL.g:2643:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2647:1: ( rule__AndExpression__Group__1__Impl )
            // InternalQL.g:2648:2: rule__AndExpression__Group__1__Impl
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
    // InternalQL.g:2654:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2658:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalQL.g:2659:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalQL.g:2659:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalQL.g:2660:2: ( rule__AndExpression__Group_1__0 )*
            {
             before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            // InternalQL.g:2661:2: ( rule__AndExpression__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==13) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalQL.g:2661:3: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalQL.g:2670:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2674:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalQL.g:2675:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalQL.g:2682:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2686:1: ( ( () ) )
            // InternalQL.g:2687:1: ( () )
            {
            // InternalQL.g:2687:1: ( () )
            // InternalQL.g:2688:2: ()
            {
             before(grammarAccess.getAndExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0()); 
            // InternalQL.g:2689:2: ()
            // InternalQL.g:2689:3: 
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
    // InternalQL.g:2697:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2701:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // InternalQL.g:2702:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalQL.g:2709:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2713:1: ( ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) )
            // InternalQL.g:2714:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            {
            // InternalQL.g:2714:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            // InternalQL.g:2715:2: ( rule__AndExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalQL.g:2716:2: ( rule__AndExpression__OperatorAssignment_1_1 )
            // InternalQL.g:2716:3: rule__AndExpression__OperatorAssignment_1_1
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
    // InternalQL.g:2724:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2728:1: ( rule__AndExpression__Group_1__2__Impl )
            // InternalQL.g:2729:2: rule__AndExpression__Group_1__2__Impl
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
    // InternalQL.g:2735:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__RhsOperandAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2739:1: ( ( ( rule__AndExpression__RhsOperandAssignment_1_2 ) ) )
            // InternalQL.g:2740:1: ( ( rule__AndExpression__RhsOperandAssignment_1_2 ) )
            {
            // InternalQL.g:2740:1: ( ( rule__AndExpression__RhsOperandAssignment_1_2 ) )
            // InternalQL.g:2741:2: ( rule__AndExpression__RhsOperandAssignment_1_2 )
            {
             before(grammarAccess.getAndExpressionAccess().getRhsOperandAssignment_1_2()); 
            // InternalQL.g:2742:2: ( rule__AndExpression__RhsOperandAssignment_1_2 )
            // InternalQL.g:2742:3: rule__AndExpression__RhsOperandAssignment_1_2
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
    // InternalQL.g:2751:1: rule__EqualExpression__Group__0 : rule__EqualExpression__Group__0__Impl rule__EqualExpression__Group__1 ;
    public final void rule__EqualExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2755:1: ( rule__EqualExpression__Group__0__Impl rule__EqualExpression__Group__1 )
            // InternalQL.g:2756:2: rule__EqualExpression__Group__0__Impl rule__EqualExpression__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalQL.g:2763:1: rule__EqualExpression__Group__0__Impl : ( ruleComparisionExpression ) ;
    public final void rule__EqualExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2767:1: ( ( ruleComparisionExpression ) )
            // InternalQL.g:2768:1: ( ruleComparisionExpression )
            {
            // InternalQL.g:2768:1: ( ruleComparisionExpression )
            // InternalQL.g:2769:2: ruleComparisionExpression
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
    // InternalQL.g:2778:1: rule__EqualExpression__Group__1 : rule__EqualExpression__Group__1__Impl ;
    public final void rule__EqualExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2782:1: ( rule__EqualExpression__Group__1__Impl )
            // InternalQL.g:2783:2: rule__EqualExpression__Group__1__Impl
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
    // InternalQL.g:2789:1: rule__EqualExpression__Group__1__Impl : ( ( rule__EqualExpression__Group_1__0 )* ) ;
    public final void rule__EqualExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2793:1: ( ( ( rule__EqualExpression__Group_1__0 )* ) )
            // InternalQL.g:2794:1: ( ( rule__EqualExpression__Group_1__0 )* )
            {
            // InternalQL.g:2794:1: ( ( rule__EqualExpression__Group_1__0 )* )
            // InternalQL.g:2795:2: ( rule__EqualExpression__Group_1__0 )*
            {
             before(grammarAccess.getEqualExpressionAccess().getGroup_1()); 
            // InternalQL.g:2796:2: ( rule__EqualExpression__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==12) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalQL.g:2796:3: rule__EqualExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__EqualExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalQL.g:2805:1: rule__EqualExpression__Group_1__0 : rule__EqualExpression__Group_1__0__Impl rule__EqualExpression__Group_1__1 ;
    public final void rule__EqualExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2809:1: ( rule__EqualExpression__Group_1__0__Impl rule__EqualExpression__Group_1__1 )
            // InternalQL.g:2810:2: rule__EqualExpression__Group_1__0__Impl rule__EqualExpression__Group_1__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalQL.g:2817:1: rule__EqualExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__EqualExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2821:1: ( ( () ) )
            // InternalQL.g:2822:1: ( () )
            {
            // InternalQL.g:2822:1: ( () )
            // InternalQL.g:2823:2: ()
            {
             before(grammarAccess.getEqualExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0()); 
            // InternalQL.g:2824:2: ()
            // InternalQL.g:2824:3: 
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
    // InternalQL.g:2832:1: rule__EqualExpression__Group_1__1 : rule__EqualExpression__Group_1__1__Impl rule__EqualExpression__Group_1__2 ;
    public final void rule__EqualExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2836:1: ( rule__EqualExpression__Group_1__1__Impl rule__EqualExpression__Group_1__2 )
            // InternalQL.g:2837:2: rule__EqualExpression__Group_1__1__Impl rule__EqualExpression__Group_1__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalQL.g:2844:1: rule__EqualExpression__Group_1__1__Impl : ( ( rule__EqualExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__EqualExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2848:1: ( ( ( rule__EqualExpression__OperatorAssignment_1_1 ) ) )
            // InternalQL.g:2849:1: ( ( rule__EqualExpression__OperatorAssignment_1_1 ) )
            {
            // InternalQL.g:2849:1: ( ( rule__EqualExpression__OperatorAssignment_1_1 ) )
            // InternalQL.g:2850:2: ( rule__EqualExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getEqualExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalQL.g:2851:2: ( rule__EqualExpression__OperatorAssignment_1_1 )
            // InternalQL.g:2851:3: rule__EqualExpression__OperatorAssignment_1_1
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
    // InternalQL.g:2859:1: rule__EqualExpression__Group_1__2 : rule__EqualExpression__Group_1__2__Impl ;
    public final void rule__EqualExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2863:1: ( rule__EqualExpression__Group_1__2__Impl )
            // InternalQL.g:2864:2: rule__EqualExpression__Group_1__2__Impl
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
    // InternalQL.g:2870:1: rule__EqualExpression__Group_1__2__Impl : ( ( rule__EqualExpression__RhsOperandAssignment_1_2 ) ) ;
    public final void rule__EqualExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2874:1: ( ( ( rule__EqualExpression__RhsOperandAssignment_1_2 ) ) )
            // InternalQL.g:2875:1: ( ( rule__EqualExpression__RhsOperandAssignment_1_2 ) )
            {
            // InternalQL.g:2875:1: ( ( rule__EqualExpression__RhsOperandAssignment_1_2 ) )
            // InternalQL.g:2876:2: ( rule__EqualExpression__RhsOperandAssignment_1_2 )
            {
             before(grammarAccess.getEqualExpressionAccess().getRhsOperandAssignment_1_2()); 
            // InternalQL.g:2877:2: ( rule__EqualExpression__RhsOperandAssignment_1_2 )
            // InternalQL.g:2877:3: rule__EqualExpression__RhsOperandAssignment_1_2
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
    // InternalQL.g:2886:1: rule__ComparisionExpression__Group__0 : rule__ComparisionExpression__Group__0__Impl rule__ComparisionExpression__Group__1 ;
    public final void rule__ComparisionExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2890:1: ( rule__ComparisionExpression__Group__0__Impl rule__ComparisionExpression__Group__1 )
            // InternalQL.g:2891:2: rule__ComparisionExpression__Group__0__Impl rule__ComparisionExpression__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalQL.g:2898:1: rule__ComparisionExpression__Group__0__Impl : ( ruleAdditionExpression ) ;
    public final void rule__ComparisionExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2902:1: ( ( ruleAdditionExpression ) )
            // InternalQL.g:2903:1: ( ruleAdditionExpression )
            {
            // InternalQL.g:2903:1: ( ruleAdditionExpression )
            // InternalQL.g:2904:2: ruleAdditionExpression
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
    // InternalQL.g:2913:1: rule__ComparisionExpression__Group__1 : rule__ComparisionExpression__Group__1__Impl ;
    public final void rule__ComparisionExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2917:1: ( rule__ComparisionExpression__Group__1__Impl )
            // InternalQL.g:2918:2: rule__ComparisionExpression__Group__1__Impl
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
    // InternalQL.g:2924:1: rule__ComparisionExpression__Group__1__Impl : ( ( rule__ComparisionExpression__Group_1__0 )* ) ;
    public final void rule__ComparisionExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2928:1: ( ( ( rule__ComparisionExpression__Group_1__0 )* ) )
            // InternalQL.g:2929:1: ( ( rule__ComparisionExpression__Group_1__0 )* )
            {
            // InternalQL.g:2929:1: ( ( rule__ComparisionExpression__Group_1__0 )* )
            // InternalQL.g:2930:2: ( rule__ComparisionExpression__Group_1__0 )*
            {
             before(grammarAccess.getComparisionExpressionAccess().getGroup_1()); 
            // InternalQL.g:2931:2: ( rule__ComparisionExpression__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=36 && LA27_0<=39)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalQL.g:2931:3: rule__ComparisionExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__ComparisionExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalQL.g:2940:1: rule__ComparisionExpression__Group_1__0 : rule__ComparisionExpression__Group_1__0__Impl rule__ComparisionExpression__Group_1__1 ;
    public final void rule__ComparisionExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2944:1: ( rule__ComparisionExpression__Group_1__0__Impl rule__ComparisionExpression__Group_1__1 )
            // InternalQL.g:2945:2: rule__ComparisionExpression__Group_1__0__Impl rule__ComparisionExpression__Group_1__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalQL.g:2952:1: rule__ComparisionExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ComparisionExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2956:1: ( ( () ) )
            // InternalQL.g:2957:1: ( () )
            {
            // InternalQL.g:2957:1: ( () )
            // InternalQL.g:2958:2: ()
            {
             before(grammarAccess.getComparisionExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0()); 
            // InternalQL.g:2959:2: ()
            // InternalQL.g:2959:3: 
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
    // InternalQL.g:2967:1: rule__ComparisionExpression__Group_1__1 : rule__ComparisionExpression__Group_1__1__Impl rule__ComparisionExpression__Group_1__2 ;
    public final void rule__ComparisionExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2971:1: ( rule__ComparisionExpression__Group_1__1__Impl rule__ComparisionExpression__Group_1__2 )
            // InternalQL.g:2972:2: rule__ComparisionExpression__Group_1__1__Impl rule__ComparisionExpression__Group_1__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalQL.g:2979:1: rule__ComparisionExpression__Group_1__1__Impl : ( ( rule__ComparisionExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ComparisionExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2983:1: ( ( ( rule__ComparisionExpression__OperatorAssignment_1_1 ) ) )
            // InternalQL.g:2984:1: ( ( rule__ComparisionExpression__OperatorAssignment_1_1 ) )
            {
            // InternalQL.g:2984:1: ( ( rule__ComparisionExpression__OperatorAssignment_1_1 ) )
            // InternalQL.g:2985:2: ( rule__ComparisionExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getComparisionExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalQL.g:2986:2: ( rule__ComparisionExpression__OperatorAssignment_1_1 )
            // InternalQL.g:2986:3: rule__ComparisionExpression__OperatorAssignment_1_1
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
    // InternalQL.g:2994:1: rule__ComparisionExpression__Group_1__2 : rule__ComparisionExpression__Group_1__2__Impl ;
    public final void rule__ComparisionExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2998:1: ( rule__ComparisionExpression__Group_1__2__Impl )
            // InternalQL.g:2999:2: rule__ComparisionExpression__Group_1__2__Impl
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
    // InternalQL.g:3005:1: rule__ComparisionExpression__Group_1__2__Impl : ( ( rule__ComparisionExpression__RhsOperandAssignment_1_2 ) ) ;
    public final void rule__ComparisionExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3009:1: ( ( ( rule__ComparisionExpression__RhsOperandAssignment_1_2 ) ) )
            // InternalQL.g:3010:1: ( ( rule__ComparisionExpression__RhsOperandAssignment_1_2 ) )
            {
            // InternalQL.g:3010:1: ( ( rule__ComparisionExpression__RhsOperandAssignment_1_2 ) )
            // InternalQL.g:3011:2: ( rule__ComparisionExpression__RhsOperandAssignment_1_2 )
            {
             before(grammarAccess.getComparisionExpressionAccess().getRhsOperandAssignment_1_2()); 
            // InternalQL.g:3012:2: ( rule__ComparisionExpression__RhsOperandAssignment_1_2 )
            // InternalQL.g:3012:3: rule__ComparisionExpression__RhsOperandAssignment_1_2
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
    // InternalQL.g:3021:1: rule__AdditionExpression__Group__0 : rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1 ;
    public final void rule__AdditionExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3025:1: ( rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1 )
            // InternalQL.g:3026:2: rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalQL.g:3033:1: rule__AdditionExpression__Group__0__Impl : ( ruleMultiplicationExpression ) ;
    public final void rule__AdditionExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3037:1: ( ( ruleMultiplicationExpression ) )
            // InternalQL.g:3038:1: ( ruleMultiplicationExpression )
            {
            // InternalQL.g:3038:1: ( ruleMultiplicationExpression )
            // InternalQL.g:3039:2: ruleMultiplicationExpression
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
    // InternalQL.g:3048:1: rule__AdditionExpression__Group__1 : rule__AdditionExpression__Group__1__Impl ;
    public final void rule__AdditionExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3052:1: ( rule__AdditionExpression__Group__1__Impl )
            // InternalQL.g:3053:2: rule__AdditionExpression__Group__1__Impl
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
    // InternalQL.g:3059:1: rule__AdditionExpression__Group__1__Impl : ( ( rule__AdditionExpression__Group_1__0 )* ) ;
    public final void rule__AdditionExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3063:1: ( ( ( rule__AdditionExpression__Group_1__0 )* ) )
            // InternalQL.g:3064:1: ( ( rule__AdditionExpression__Group_1__0 )* )
            {
            // InternalQL.g:3064:1: ( ( rule__AdditionExpression__Group_1__0 )* )
            // InternalQL.g:3065:2: ( rule__AdditionExpression__Group_1__0 )*
            {
             before(grammarAccess.getAdditionExpressionAccess().getGroup_1()); 
            // InternalQL.g:3066:2: ( rule__AdditionExpression__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==31||LA28_0==33) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalQL.g:3066:3: rule__AdditionExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__AdditionExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalQL.g:3075:1: rule__AdditionExpression__Group_1__0 : rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1 ;
    public final void rule__AdditionExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3079:1: ( rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1 )
            // InternalQL.g:3080:2: rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalQL.g:3087:1: rule__AdditionExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AdditionExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3091:1: ( ( () ) )
            // InternalQL.g:3092:1: ( () )
            {
            // InternalQL.g:3092:1: ( () )
            // InternalQL.g:3093:2: ()
            {
             before(grammarAccess.getAdditionExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0()); 
            // InternalQL.g:3094:2: ()
            // InternalQL.g:3094:3: 
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
    // InternalQL.g:3102:1: rule__AdditionExpression__Group_1__1 : rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2 ;
    public final void rule__AdditionExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3106:1: ( rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2 )
            // InternalQL.g:3107:2: rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalQL.g:3114:1: rule__AdditionExpression__Group_1__1__Impl : ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AdditionExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3118:1: ( ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) ) )
            // InternalQL.g:3119:1: ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) )
            {
            // InternalQL.g:3119:1: ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) )
            // InternalQL.g:3120:2: ( rule__AdditionExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditionExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalQL.g:3121:2: ( rule__AdditionExpression__OperatorAssignment_1_1 )
            // InternalQL.g:3121:3: rule__AdditionExpression__OperatorAssignment_1_1
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
    // InternalQL.g:3129:1: rule__AdditionExpression__Group_1__2 : rule__AdditionExpression__Group_1__2__Impl ;
    public final void rule__AdditionExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3133:1: ( rule__AdditionExpression__Group_1__2__Impl )
            // InternalQL.g:3134:2: rule__AdditionExpression__Group_1__2__Impl
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
    // InternalQL.g:3140:1: rule__AdditionExpression__Group_1__2__Impl : ( ( rule__AdditionExpression__RhsOperandAssignment_1_2 ) ) ;
    public final void rule__AdditionExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3144:1: ( ( ( rule__AdditionExpression__RhsOperandAssignment_1_2 ) ) )
            // InternalQL.g:3145:1: ( ( rule__AdditionExpression__RhsOperandAssignment_1_2 ) )
            {
            // InternalQL.g:3145:1: ( ( rule__AdditionExpression__RhsOperandAssignment_1_2 ) )
            // InternalQL.g:3146:2: ( rule__AdditionExpression__RhsOperandAssignment_1_2 )
            {
             before(grammarAccess.getAdditionExpressionAccess().getRhsOperandAssignment_1_2()); 
            // InternalQL.g:3147:2: ( rule__AdditionExpression__RhsOperandAssignment_1_2 )
            // InternalQL.g:3147:3: rule__AdditionExpression__RhsOperandAssignment_1_2
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
    // InternalQL.g:3156:1: rule__MultiplicationExpression__Group__0 : rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1 ;
    public final void rule__MultiplicationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3160:1: ( rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1 )
            // InternalQL.g:3161:2: rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalQL.g:3168:1: rule__MultiplicationExpression__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__MultiplicationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3172:1: ( ( rulePrimaryExpression ) )
            // InternalQL.g:3173:1: ( rulePrimaryExpression )
            {
            // InternalQL.g:3173:1: ( rulePrimaryExpression )
            // InternalQL.g:3174:2: rulePrimaryExpression
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
    // InternalQL.g:3183:1: rule__MultiplicationExpression__Group__1 : rule__MultiplicationExpression__Group__1__Impl ;
    public final void rule__MultiplicationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3187:1: ( rule__MultiplicationExpression__Group__1__Impl )
            // InternalQL.g:3188:2: rule__MultiplicationExpression__Group__1__Impl
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
    // InternalQL.g:3194:1: rule__MultiplicationExpression__Group__1__Impl : ( ( rule__MultiplicationExpression__Group_1__0 )* ) ;
    public final void rule__MultiplicationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3198:1: ( ( ( rule__MultiplicationExpression__Group_1__0 )* ) )
            // InternalQL.g:3199:1: ( ( rule__MultiplicationExpression__Group_1__0 )* )
            {
            // InternalQL.g:3199:1: ( ( rule__MultiplicationExpression__Group_1__0 )* )
            // InternalQL.g:3200:2: ( rule__MultiplicationExpression__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getGroup_1()); 
            // InternalQL.g:3201:2: ( rule__MultiplicationExpression__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=34 && LA29_0<=35)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalQL.g:3201:3: rule__MultiplicationExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__MultiplicationExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalQL.g:3210:1: rule__MultiplicationExpression__Group_1__0 : rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1 ;
    public final void rule__MultiplicationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3214:1: ( rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1 )
            // InternalQL.g:3215:2: rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalQL.g:3222:1: rule__MultiplicationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultiplicationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3226:1: ( ( () ) )
            // InternalQL.g:3227:1: ( () )
            {
            // InternalQL.g:3227:1: ( () )
            // InternalQL.g:3228:2: ()
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0()); 
            // InternalQL.g:3229:2: ()
            // InternalQL.g:3229:3: 
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
    // InternalQL.g:3237:1: rule__MultiplicationExpression__Group_1__1 : rule__MultiplicationExpression__Group_1__1__Impl rule__MultiplicationExpression__Group_1__2 ;
    public final void rule__MultiplicationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3241:1: ( rule__MultiplicationExpression__Group_1__1__Impl rule__MultiplicationExpression__Group_1__2 )
            // InternalQL.g:3242:2: rule__MultiplicationExpression__Group_1__1__Impl rule__MultiplicationExpression__Group_1__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalQL.g:3249:1: rule__MultiplicationExpression__Group_1__1__Impl : ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultiplicationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3253:1: ( ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) ) )
            // InternalQL.g:3254:1: ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) )
            {
            // InternalQL.g:3254:1: ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) )
            // InternalQL.g:3255:2: ( rule__MultiplicationExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalQL.g:3256:2: ( rule__MultiplicationExpression__OperatorAssignment_1_1 )
            // InternalQL.g:3256:3: rule__MultiplicationExpression__OperatorAssignment_1_1
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
    // InternalQL.g:3264:1: rule__MultiplicationExpression__Group_1__2 : rule__MultiplicationExpression__Group_1__2__Impl ;
    public final void rule__MultiplicationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3268:1: ( rule__MultiplicationExpression__Group_1__2__Impl )
            // InternalQL.g:3269:2: rule__MultiplicationExpression__Group_1__2__Impl
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
    // InternalQL.g:3275:1: rule__MultiplicationExpression__Group_1__2__Impl : ( ( rule__MultiplicationExpression__RhsOperandAssignment_1_2 ) ) ;
    public final void rule__MultiplicationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3279:1: ( ( ( rule__MultiplicationExpression__RhsOperandAssignment_1_2 ) ) )
            // InternalQL.g:3280:1: ( ( rule__MultiplicationExpression__RhsOperandAssignment_1_2 ) )
            {
            // InternalQL.g:3280:1: ( ( rule__MultiplicationExpression__RhsOperandAssignment_1_2 ) )
            // InternalQL.g:3281:2: ( rule__MultiplicationExpression__RhsOperandAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getRhsOperandAssignment_1_2()); 
            // InternalQL.g:3282:2: ( rule__MultiplicationExpression__RhsOperandAssignment_1_2 )
            // InternalQL.g:3282:3: rule__MultiplicationExpression__RhsOperandAssignment_1_2
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
    // InternalQL.g:3291:1: rule__Form__Group__0 : rule__Form__Group__0__Impl rule__Form__Group__1 ;
    public final void rule__Form__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3295:1: ( rule__Form__Group__0__Impl rule__Form__Group__1 )
            // InternalQL.g:3296:2: rule__Form__Group__0__Impl rule__Form__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalQL.g:3303:1: rule__Form__Group__0__Impl : ( 'Form' ) ;
    public final void rule__Form__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3307:1: ( ( 'Form' ) )
            // InternalQL.g:3308:1: ( 'Form' )
            {
            // InternalQL.g:3308:1: ( 'Form' )
            // InternalQL.g:3309:2: 'Form'
            {
             before(grammarAccess.getFormAccess().getFormKeyword_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalQL.g:3318:1: rule__Form__Group__1 : rule__Form__Group__1__Impl rule__Form__Group__2 ;
    public final void rule__Form__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3322:1: ( rule__Form__Group__1__Impl rule__Form__Group__2 )
            // InternalQL.g:3323:2: rule__Form__Group__1__Impl rule__Form__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalQL.g:3330:1: rule__Form__Group__1__Impl : ( ( rule__Form__NameAssignment_1 ) ) ;
    public final void rule__Form__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3334:1: ( ( ( rule__Form__NameAssignment_1 ) ) )
            // InternalQL.g:3335:1: ( ( rule__Form__NameAssignment_1 ) )
            {
            // InternalQL.g:3335:1: ( ( rule__Form__NameAssignment_1 ) )
            // InternalQL.g:3336:2: ( rule__Form__NameAssignment_1 )
            {
             before(grammarAccess.getFormAccess().getNameAssignment_1()); 
            // InternalQL.g:3337:2: ( rule__Form__NameAssignment_1 )
            // InternalQL.g:3337:3: rule__Form__NameAssignment_1
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
    // InternalQL.g:3345:1: rule__Form__Group__2 : rule__Form__Group__2__Impl ;
    public final void rule__Form__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3349:1: ( rule__Form__Group__2__Impl )
            // InternalQL.g:3350:2: rule__Form__Group__2__Impl
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
    // InternalQL.g:3356:1: rule__Form__Group__2__Impl : ( ( rule__Form__QuestionGroupAssignment_2 ) ) ;
    public final void rule__Form__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3360:1: ( ( ( rule__Form__QuestionGroupAssignment_2 ) ) )
            // InternalQL.g:3361:1: ( ( rule__Form__QuestionGroupAssignment_2 ) )
            {
            // InternalQL.g:3361:1: ( ( rule__Form__QuestionGroupAssignment_2 ) )
            // InternalQL.g:3362:2: ( rule__Form__QuestionGroupAssignment_2 )
            {
             before(grammarAccess.getFormAccess().getQuestionGroupAssignment_2()); 
            // InternalQL.g:3363:2: ( rule__Form__QuestionGroupAssignment_2 )
            // InternalQL.g:3363:3: rule__Form__QuestionGroupAssignment_2
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
    // InternalQL.g:3372:1: rule__DefinitionGroup__Group__0 : rule__DefinitionGroup__Group__0__Impl rule__DefinitionGroup__Group__1 ;
    public final void rule__DefinitionGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3376:1: ( rule__DefinitionGroup__Group__0__Impl rule__DefinitionGroup__Group__1 )
            // InternalQL.g:3377:2: rule__DefinitionGroup__Group__0__Impl rule__DefinitionGroup__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalQL.g:3384:1: rule__DefinitionGroup__Group__0__Impl : ( () ) ;
    public final void rule__DefinitionGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3388:1: ( ( () ) )
            // InternalQL.g:3389:1: ( () )
            {
            // InternalQL.g:3389:1: ( () )
            // InternalQL.g:3390:2: ()
            {
             before(grammarAccess.getDefinitionGroupAccess().getDefinitionGroupAction_0()); 
            // InternalQL.g:3391:2: ()
            // InternalQL.g:3391:3: 
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
    // InternalQL.g:3399:1: rule__DefinitionGroup__Group__1 : rule__DefinitionGroup__Group__1__Impl rule__DefinitionGroup__Group__2 ;
    public final void rule__DefinitionGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3403:1: ( rule__DefinitionGroup__Group__1__Impl rule__DefinitionGroup__Group__2 )
            // InternalQL.g:3404:2: rule__DefinitionGroup__Group__1__Impl rule__DefinitionGroup__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalQL.g:3411:1: rule__DefinitionGroup__Group__1__Impl : ( 'definitions' ) ;
    public final void rule__DefinitionGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3415:1: ( ( 'definitions' ) )
            // InternalQL.g:3416:1: ( 'definitions' )
            {
            // InternalQL.g:3416:1: ( 'definitions' )
            // InternalQL.g:3417:2: 'definitions'
            {
             before(grammarAccess.getDefinitionGroupAccess().getDefinitionsKeyword_1()); 
            match(input,51,FOLLOW_2); 
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
    // InternalQL.g:3426:1: rule__DefinitionGroup__Group__2 : rule__DefinitionGroup__Group__2__Impl rule__DefinitionGroup__Group__3 ;
    public final void rule__DefinitionGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3430:1: ( rule__DefinitionGroup__Group__2__Impl rule__DefinitionGroup__Group__3 )
            // InternalQL.g:3431:2: rule__DefinitionGroup__Group__2__Impl rule__DefinitionGroup__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalQL.g:3438:1: rule__DefinitionGroup__Group__2__Impl : ( '{' ) ;
    public final void rule__DefinitionGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3442:1: ( ( '{' ) )
            // InternalQL.g:3443:1: ( '{' )
            {
            // InternalQL.g:3443:1: ( '{' )
            // InternalQL.g:3444:2: '{'
            {
             before(grammarAccess.getDefinitionGroupAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,41,FOLLOW_2); 
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
    // InternalQL.g:3453:1: rule__DefinitionGroup__Group__3 : rule__DefinitionGroup__Group__3__Impl rule__DefinitionGroup__Group__4 ;
    public final void rule__DefinitionGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3457:1: ( rule__DefinitionGroup__Group__3__Impl rule__DefinitionGroup__Group__4 )
            // InternalQL.g:3458:2: rule__DefinitionGroup__Group__3__Impl rule__DefinitionGroup__Group__4
            {
            pushFollow(FOLLOW_32);
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
    // InternalQL.g:3465:1: rule__DefinitionGroup__Group__3__Impl : ( ( rule__DefinitionGroup__Alternatives_3 )* ) ;
    public final void rule__DefinitionGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3469:1: ( ( ( rule__DefinitionGroup__Alternatives_3 )* ) )
            // InternalQL.g:3470:1: ( ( rule__DefinitionGroup__Alternatives_3 )* )
            {
            // InternalQL.g:3470:1: ( ( rule__DefinitionGroup__Alternatives_3 )* )
            // InternalQL.g:3471:2: ( rule__DefinitionGroup__Alternatives_3 )*
            {
             before(grammarAccess.getDefinitionGroupAccess().getAlternatives_3()); 
            // InternalQL.g:3472:2: ( rule__DefinitionGroup__Alternatives_3 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==52||(LA30_0>=54 && LA30_0<=55)||(LA30_0>=58 && LA30_0<=60)||LA30_0==63||LA30_0==67||LA30_0==72) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalQL.g:3472:3: rule__DefinitionGroup__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__DefinitionGroup__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalQL.g:3480:1: rule__DefinitionGroup__Group__4 : rule__DefinitionGroup__Group__4__Impl ;
    public final void rule__DefinitionGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3484:1: ( rule__DefinitionGroup__Group__4__Impl )
            // InternalQL.g:3485:2: rule__DefinitionGroup__Group__4__Impl
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
    // InternalQL.g:3491:1: rule__DefinitionGroup__Group__4__Impl : ( '}' ) ;
    public final void rule__DefinitionGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3495:1: ( ( '}' ) )
            // InternalQL.g:3496:1: ( '}' )
            {
            // InternalQL.g:3496:1: ( '}' )
            // InternalQL.g:3497:2: '}'
            {
             before(grammarAccess.getDefinitionGroupAccess().getRightCurlyBracketKeyword_4()); 
            match(input,42,FOLLOW_2); 
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
    // InternalQL.g:3507:1: rule__QuestionGroup__Group__0 : rule__QuestionGroup__Group__0__Impl rule__QuestionGroup__Group__1 ;
    public final void rule__QuestionGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3511:1: ( rule__QuestionGroup__Group__0__Impl rule__QuestionGroup__Group__1 )
            // InternalQL.g:3512:2: rule__QuestionGroup__Group__0__Impl rule__QuestionGroup__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalQL.g:3519:1: rule__QuestionGroup__Group__0__Impl : ( () ) ;
    public final void rule__QuestionGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3523:1: ( ( () ) )
            // InternalQL.g:3524:1: ( () )
            {
            // InternalQL.g:3524:1: ( () )
            // InternalQL.g:3525:2: ()
            {
             before(grammarAccess.getQuestionGroupAccess().getQuestionGroupAction_0()); 
            // InternalQL.g:3526:2: ()
            // InternalQL.g:3526:3: 
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
    // InternalQL.g:3534:1: rule__QuestionGroup__Group__1 : rule__QuestionGroup__Group__1__Impl rule__QuestionGroup__Group__2 ;
    public final void rule__QuestionGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3538:1: ( rule__QuestionGroup__Group__1__Impl rule__QuestionGroup__Group__2 )
            // InternalQL.g:3539:2: rule__QuestionGroup__Group__1__Impl rule__QuestionGroup__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalQL.g:3546:1: rule__QuestionGroup__Group__1__Impl : ( ( rule__QuestionGroup__Group_1__0 )? ) ;
    public final void rule__QuestionGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3550:1: ( ( ( rule__QuestionGroup__Group_1__0 )? ) )
            // InternalQL.g:3551:1: ( ( rule__QuestionGroup__Group_1__0 )? )
            {
            // InternalQL.g:3551:1: ( ( rule__QuestionGroup__Group_1__0 )? )
            // InternalQL.g:3552:2: ( rule__QuestionGroup__Group_1__0 )?
            {
             before(grammarAccess.getQuestionGroupAccess().getGroup_1()); 
            // InternalQL.g:3553:2: ( rule__QuestionGroup__Group_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==46) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalQL.g:3553:3: rule__QuestionGroup__Group_1__0
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
    // InternalQL.g:3561:1: rule__QuestionGroup__Group__2 : rule__QuestionGroup__Group__2__Impl rule__QuestionGroup__Group__3 ;
    public final void rule__QuestionGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3565:1: ( rule__QuestionGroup__Group__2__Impl rule__QuestionGroup__Group__3 )
            // InternalQL.g:3566:2: rule__QuestionGroup__Group__2__Impl rule__QuestionGroup__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalQL.g:3573:1: rule__QuestionGroup__Group__2__Impl : ( '{' ) ;
    public final void rule__QuestionGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3577:1: ( ( '{' ) )
            // InternalQL.g:3578:1: ( '{' )
            {
            // InternalQL.g:3578:1: ( '{' )
            // InternalQL.g:3579:2: '{'
            {
             before(grammarAccess.getQuestionGroupAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,41,FOLLOW_2); 
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
    // InternalQL.g:3588:1: rule__QuestionGroup__Group__3 : rule__QuestionGroup__Group__3__Impl rule__QuestionGroup__Group__4 ;
    public final void rule__QuestionGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3592:1: ( rule__QuestionGroup__Group__3__Impl rule__QuestionGroup__Group__4 )
            // InternalQL.g:3593:2: rule__QuestionGroup__Group__3__Impl rule__QuestionGroup__Group__4
            {
            pushFollow(FOLLOW_34);
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
    // InternalQL.g:3600:1: rule__QuestionGroup__Group__3__Impl : ( ( rule__QuestionGroup__Alternatives_3 )* ) ;
    public final void rule__QuestionGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3604:1: ( ( ( rule__QuestionGroup__Alternatives_3 )* ) )
            // InternalQL.g:3605:1: ( ( rule__QuestionGroup__Alternatives_3 )* )
            {
            // InternalQL.g:3605:1: ( ( rule__QuestionGroup__Alternatives_3 )* )
            // InternalQL.g:3606:2: ( rule__QuestionGroup__Alternatives_3 )*
            {
             before(grammarAccess.getQuestionGroupAccess().getAlternatives_3()); 
            // InternalQL.g:3607:2: ( rule__QuestionGroup__Alternatives_3 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID||LA32_0==41||LA32_0==46) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalQL.g:3607:3: rule__QuestionGroup__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__QuestionGroup__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalQL.g:3615:1: rule__QuestionGroup__Group__4 : rule__QuestionGroup__Group__4__Impl ;
    public final void rule__QuestionGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3619:1: ( rule__QuestionGroup__Group__4__Impl )
            // InternalQL.g:3620:2: rule__QuestionGroup__Group__4__Impl
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
    // InternalQL.g:3626:1: rule__QuestionGroup__Group__4__Impl : ( '}' ) ;
    public final void rule__QuestionGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3630:1: ( ( '}' ) )
            // InternalQL.g:3631:1: ( '}' )
            {
            // InternalQL.g:3631:1: ( '}' )
            // InternalQL.g:3632:2: '}'
            {
             before(grammarAccess.getQuestionGroupAccess().getRightCurlyBracketKeyword_4()); 
            match(input,42,FOLLOW_2); 
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
    // InternalQL.g:3642:1: rule__QuestionGroup__Group_1__0 : rule__QuestionGroup__Group_1__0__Impl rule__QuestionGroup__Group_1__1 ;
    public final void rule__QuestionGroup__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3646:1: ( rule__QuestionGroup__Group_1__0__Impl rule__QuestionGroup__Group_1__1 )
            // InternalQL.g:3647:2: rule__QuestionGroup__Group_1__0__Impl rule__QuestionGroup__Group_1__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalQL.g:3654:1: rule__QuestionGroup__Group_1__0__Impl : ( 'if' ) ;
    public final void rule__QuestionGroup__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3658:1: ( ( 'if' ) )
            // InternalQL.g:3659:1: ( 'if' )
            {
            // InternalQL.g:3659:1: ( 'if' )
            // InternalQL.g:3660:2: 'if'
            {
             before(grammarAccess.getQuestionGroupAccess().getIfKeyword_1_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalQL.g:3669:1: rule__QuestionGroup__Group_1__1 : rule__QuestionGroup__Group_1__1__Impl ;
    public final void rule__QuestionGroup__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3673:1: ( rule__QuestionGroup__Group_1__1__Impl )
            // InternalQL.g:3674:2: rule__QuestionGroup__Group_1__1__Impl
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
    // InternalQL.g:3680:1: rule__QuestionGroup__Group_1__1__Impl : ( ( rule__QuestionGroup__GuardAssignment_1_1 ) ) ;
    public final void rule__QuestionGroup__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3684:1: ( ( ( rule__QuestionGroup__GuardAssignment_1_1 ) ) )
            // InternalQL.g:3685:1: ( ( rule__QuestionGroup__GuardAssignment_1_1 ) )
            {
            // InternalQL.g:3685:1: ( ( rule__QuestionGroup__GuardAssignment_1_1 ) )
            // InternalQL.g:3686:2: ( rule__QuestionGroup__GuardAssignment_1_1 )
            {
             before(grammarAccess.getQuestionGroupAccess().getGuardAssignment_1_1()); 
            // InternalQL.g:3687:2: ( rule__QuestionGroup__GuardAssignment_1_1 )
            // InternalQL.g:3687:3: rule__QuestionGroup__GuardAssignment_1_1
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
    // InternalQL.g:3696:1: rule__ValueType_Impl__Group__0 : rule__ValueType_Impl__Group__0__Impl rule__ValueType_Impl__Group__1 ;
    public final void rule__ValueType_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3700:1: ( rule__ValueType_Impl__Group__0__Impl rule__ValueType_Impl__Group__1 )
            // InternalQL.g:3701:2: rule__ValueType_Impl__Group__0__Impl rule__ValueType_Impl__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalQL.g:3708:1: rule__ValueType_Impl__Group__0__Impl : ( () ) ;
    public final void rule__ValueType_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3712:1: ( ( () ) )
            // InternalQL.g:3713:1: ( () )
            {
            // InternalQL.g:3713:1: ( () )
            // InternalQL.g:3714:2: ()
            {
             before(grammarAccess.getValueType_ImplAccess().getValueTypeAction_0()); 
            // InternalQL.g:3715:2: ()
            // InternalQL.g:3715:3: 
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
    // InternalQL.g:3723:1: rule__ValueType_Impl__Group__1 : rule__ValueType_Impl__Group__1__Impl rule__ValueType_Impl__Group__2 ;
    public final void rule__ValueType_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3727:1: ( rule__ValueType_Impl__Group__1__Impl rule__ValueType_Impl__Group__2 )
            // InternalQL.g:3728:2: rule__ValueType_Impl__Group__1__Impl rule__ValueType_Impl__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalQL.g:3735:1: rule__ValueType_Impl__Group__1__Impl : ( 'ValueType' ) ;
    public final void rule__ValueType_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3739:1: ( ( 'ValueType' ) )
            // InternalQL.g:3740:1: ( 'ValueType' )
            {
            // InternalQL.g:3740:1: ( 'ValueType' )
            // InternalQL.g:3741:2: 'ValueType'
            {
             before(grammarAccess.getValueType_ImplAccess().getValueTypeKeyword_1()); 
            match(input,52,FOLLOW_2); 
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
    // InternalQL.g:3750:1: rule__ValueType_Impl__Group__2 : rule__ValueType_Impl__Group__2__Impl rule__ValueType_Impl__Group__3 ;
    public final void rule__ValueType_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3754:1: ( rule__ValueType_Impl__Group__2__Impl rule__ValueType_Impl__Group__3 )
            // InternalQL.g:3755:2: rule__ValueType_Impl__Group__2__Impl rule__ValueType_Impl__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalQL.g:3762:1: rule__ValueType_Impl__Group__2__Impl : ( ( rule__ValueType_Impl__NameAssignment_2 ) ) ;
    public final void rule__ValueType_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3766:1: ( ( ( rule__ValueType_Impl__NameAssignment_2 ) ) )
            // InternalQL.g:3767:1: ( ( rule__ValueType_Impl__NameAssignment_2 ) )
            {
            // InternalQL.g:3767:1: ( ( rule__ValueType_Impl__NameAssignment_2 ) )
            // InternalQL.g:3768:2: ( rule__ValueType_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getValueType_ImplAccess().getNameAssignment_2()); 
            // InternalQL.g:3769:2: ( rule__ValueType_Impl__NameAssignment_2 )
            // InternalQL.g:3769:3: rule__ValueType_Impl__NameAssignment_2
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
    // InternalQL.g:3777:1: rule__ValueType_Impl__Group__3 : rule__ValueType_Impl__Group__3__Impl rule__ValueType_Impl__Group__4 ;
    public final void rule__ValueType_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3781:1: ( rule__ValueType_Impl__Group__3__Impl rule__ValueType_Impl__Group__4 )
            // InternalQL.g:3782:2: rule__ValueType_Impl__Group__3__Impl rule__ValueType_Impl__Group__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalQL.g:3789:1: rule__ValueType_Impl__Group__3__Impl : ( '{' ) ;
    public final void rule__ValueType_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3793:1: ( ( '{' ) )
            // InternalQL.g:3794:1: ( '{' )
            {
            // InternalQL.g:3794:1: ( '{' )
            // InternalQL.g:3795:2: '{'
            {
             before(grammarAccess.getValueType_ImplAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,41,FOLLOW_2); 
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
    // InternalQL.g:3804:1: rule__ValueType_Impl__Group__4 : rule__ValueType_Impl__Group__4__Impl rule__ValueType_Impl__Group__5 ;
    public final void rule__ValueType_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3808:1: ( rule__ValueType_Impl__Group__4__Impl rule__ValueType_Impl__Group__5 )
            // InternalQL.g:3809:2: rule__ValueType_Impl__Group__4__Impl rule__ValueType_Impl__Group__5
            {
            pushFollow(FOLLOW_37);
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
    // InternalQL.g:3816:1: rule__ValueType_Impl__Group__4__Impl : ( ( rule__ValueType_Impl__Group_4__0 )? ) ;
    public final void rule__ValueType_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3820:1: ( ( ( rule__ValueType_Impl__Group_4__0 )? ) )
            // InternalQL.g:3821:1: ( ( rule__ValueType_Impl__Group_4__0 )? )
            {
            // InternalQL.g:3821:1: ( ( rule__ValueType_Impl__Group_4__0 )? )
            // InternalQL.g:3822:2: ( rule__ValueType_Impl__Group_4__0 )?
            {
             before(grammarAccess.getValueType_ImplAccess().getGroup_4()); 
            // InternalQL.g:3823:2: ( rule__ValueType_Impl__Group_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==53) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalQL.g:3823:3: rule__ValueType_Impl__Group_4__0
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
    // InternalQL.g:3831:1: rule__ValueType_Impl__Group__5 : rule__ValueType_Impl__Group__5__Impl ;
    public final void rule__ValueType_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3835:1: ( rule__ValueType_Impl__Group__5__Impl )
            // InternalQL.g:3836:2: rule__ValueType_Impl__Group__5__Impl
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
    // InternalQL.g:3842:1: rule__ValueType_Impl__Group__5__Impl : ( '}' ) ;
    public final void rule__ValueType_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3846:1: ( ( '}' ) )
            // InternalQL.g:3847:1: ( '}' )
            {
            // InternalQL.g:3847:1: ( '}' )
            // InternalQL.g:3848:2: '}'
            {
             before(grammarAccess.getValueType_ImplAccess().getRightCurlyBracketKeyword_5()); 
            match(input,42,FOLLOW_2); 
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
    // InternalQL.g:3858:1: rule__ValueType_Impl__Group_4__0 : rule__ValueType_Impl__Group_4__0__Impl rule__ValueType_Impl__Group_4__1 ;
    public final void rule__ValueType_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3862:1: ( rule__ValueType_Impl__Group_4__0__Impl rule__ValueType_Impl__Group_4__1 )
            // InternalQL.g:3863:2: rule__ValueType_Impl__Group_4__0__Impl rule__ValueType_Impl__Group_4__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalQL.g:3870:1: rule__ValueType_Impl__Group_4__0__Impl : ( 'unit' ) ;
    public final void rule__ValueType_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3874:1: ( ( 'unit' ) )
            // InternalQL.g:3875:1: ( 'unit' )
            {
            // InternalQL.g:3875:1: ( 'unit' )
            // InternalQL.g:3876:2: 'unit'
            {
             before(grammarAccess.getValueType_ImplAccess().getUnitKeyword_4_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalQL.g:3885:1: rule__ValueType_Impl__Group_4__1 : rule__ValueType_Impl__Group_4__1__Impl ;
    public final void rule__ValueType_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3889:1: ( rule__ValueType_Impl__Group_4__1__Impl )
            // InternalQL.g:3890:2: rule__ValueType_Impl__Group_4__1__Impl
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
    // InternalQL.g:3896:1: rule__ValueType_Impl__Group_4__1__Impl : ( ( rule__ValueType_Impl__UnitAssignment_4_1 ) ) ;
    public final void rule__ValueType_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3900:1: ( ( ( rule__ValueType_Impl__UnitAssignment_4_1 ) ) )
            // InternalQL.g:3901:1: ( ( rule__ValueType_Impl__UnitAssignment_4_1 ) )
            {
            // InternalQL.g:3901:1: ( ( rule__ValueType_Impl__UnitAssignment_4_1 ) )
            // InternalQL.g:3902:2: ( rule__ValueType_Impl__UnitAssignment_4_1 )
            {
             before(grammarAccess.getValueType_ImplAccess().getUnitAssignment_4_1()); 
            // InternalQL.g:3903:2: ( rule__ValueType_Impl__UnitAssignment_4_1 )
            // InternalQL.g:3903:3: rule__ValueType_Impl__UnitAssignment_4_1
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
    // InternalQL.g:3912:1: rule__ConstantCall__Group__0 : rule__ConstantCall__Group__0__Impl rule__ConstantCall__Group__1 ;
    public final void rule__ConstantCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3916:1: ( rule__ConstantCall__Group__0__Impl rule__ConstantCall__Group__1 )
            // InternalQL.g:3917:2: rule__ConstantCall__Group__0__Impl rule__ConstantCall__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalQL.g:3924:1: rule__ConstantCall__Group__0__Impl : ( () ) ;
    public final void rule__ConstantCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3928:1: ( ( () ) )
            // InternalQL.g:3929:1: ( () )
            {
            // InternalQL.g:3929:1: ( () )
            // InternalQL.g:3930:2: ()
            {
             before(grammarAccess.getConstantCallAccess().getConstantCallAction_0()); 
            // InternalQL.g:3931:2: ()
            // InternalQL.g:3931:3: 
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
    // InternalQL.g:3939:1: rule__ConstantCall__Group__1 : rule__ConstantCall__Group__1__Impl ;
    public final void rule__ConstantCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3943:1: ( rule__ConstantCall__Group__1__Impl )
            // InternalQL.g:3944:2: rule__ConstantCall__Group__1__Impl
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
    // InternalQL.g:3950:1: rule__ConstantCall__Group__1__Impl : ( ( rule__ConstantCall__ValueAssignment_1 ) ) ;
    public final void rule__ConstantCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3954:1: ( ( ( rule__ConstantCall__ValueAssignment_1 ) ) )
            // InternalQL.g:3955:1: ( ( rule__ConstantCall__ValueAssignment_1 ) )
            {
            // InternalQL.g:3955:1: ( ( rule__ConstantCall__ValueAssignment_1 ) )
            // InternalQL.g:3956:2: ( rule__ConstantCall__ValueAssignment_1 )
            {
             before(grammarAccess.getConstantCallAccess().getValueAssignment_1()); 
            // InternalQL.g:3957:2: ( rule__ConstantCall__ValueAssignment_1 )
            // InternalQL.g:3957:3: rule__ConstantCall__ValueAssignment_1
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
    // InternalQL.g:3966:1: rule__QuestionCall__Group__0 : rule__QuestionCall__Group__0__Impl rule__QuestionCall__Group__1 ;
    public final void rule__QuestionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3970:1: ( rule__QuestionCall__Group__0__Impl rule__QuestionCall__Group__1 )
            // InternalQL.g:3971:2: rule__QuestionCall__Group__0__Impl rule__QuestionCall__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalQL.g:3978:1: rule__QuestionCall__Group__0__Impl : ( () ) ;
    public final void rule__QuestionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3982:1: ( ( () ) )
            // InternalQL.g:3983:1: ( () )
            {
            // InternalQL.g:3983:1: ( () )
            // InternalQL.g:3984:2: ()
            {
             before(grammarAccess.getQuestionCallAccess().getQuestionCallAction_0()); 
            // InternalQL.g:3985:2: ()
            // InternalQL.g:3985:3: 
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
    // InternalQL.g:3993:1: rule__QuestionCall__Group__1 : rule__QuestionCall__Group__1__Impl rule__QuestionCall__Group__2 ;
    public final void rule__QuestionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3997:1: ( rule__QuestionCall__Group__1__Impl rule__QuestionCall__Group__2 )
            // InternalQL.g:3998:2: rule__QuestionCall__Group__1__Impl rule__QuestionCall__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalQL.g:4005:1: rule__QuestionCall__Group__1__Impl : ( ( rule__QuestionCall__QuestionAssignment_1 ) ) ;
    public final void rule__QuestionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4009:1: ( ( ( rule__QuestionCall__QuestionAssignment_1 ) ) )
            // InternalQL.g:4010:1: ( ( rule__QuestionCall__QuestionAssignment_1 ) )
            {
            // InternalQL.g:4010:1: ( ( rule__QuestionCall__QuestionAssignment_1 ) )
            // InternalQL.g:4011:2: ( rule__QuestionCall__QuestionAssignment_1 )
            {
             before(grammarAccess.getQuestionCallAccess().getQuestionAssignment_1()); 
            // InternalQL.g:4012:2: ( rule__QuestionCall__QuestionAssignment_1 )
            // InternalQL.g:4012:3: rule__QuestionCall__QuestionAssignment_1
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
    // InternalQL.g:4020:1: rule__QuestionCall__Group__2 : rule__QuestionCall__Group__2__Impl rule__QuestionCall__Group__3 ;
    public final void rule__QuestionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4024:1: ( rule__QuestionCall__Group__2__Impl rule__QuestionCall__Group__3 )
            // InternalQL.g:4025:2: rule__QuestionCall__Group__2__Impl rule__QuestionCall__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalQL.g:4032:1: rule__QuestionCall__Group__2__Impl : ( '(' ) ;
    public final void rule__QuestionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4036:1: ( ( '(' ) )
            // InternalQL.g:4037:1: ( '(' )
            {
            // InternalQL.g:4037:1: ( '(' )
            // InternalQL.g:4038:2: '('
            {
             before(grammarAccess.getQuestionCallAccess().getLeftParenthesisKeyword_2()); 
            match(input,43,FOLLOW_2); 
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
    // InternalQL.g:4047:1: rule__QuestionCall__Group__3 : rule__QuestionCall__Group__3__Impl ;
    public final void rule__QuestionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4051:1: ( rule__QuestionCall__Group__3__Impl )
            // InternalQL.g:4052:2: rule__QuestionCall__Group__3__Impl
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
    // InternalQL.g:4058:1: rule__QuestionCall__Group__3__Impl : ( ')' ) ;
    public final void rule__QuestionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4062:1: ( ( ')' ) )
            // InternalQL.g:4063:1: ( ')' )
            {
            // InternalQL.g:4063:1: ( ')' )
            // InternalQL.g:4064:2: ')'
            {
             before(grammarAccess.getQuestionCallAccess().getRightParenthesisKeyword_3()); 
            match(input,44,FOLLOW_2); 
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
    // InternalQL.g:4074:1: rule__BooleanValueType__Group__0 : rule__BooleanValueType__Group__0__Impl rule__BooleanValueType__Group__1 ;
    public final void rule__BooleanValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4078:1: ( rule__BooleanValueType__Group__0__Impl rule__BooleanValueType__Group__1 )
            // InternalQL.g:4079:2: rule__BooleanValueType__Group__0__Impl rule__BooleanValueType__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalQL.g:4086:1: rule__BooleanValueType__Group__0__Impl : ( () ) ;
    public final void rule__BooleanValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4090:1: ( ( () ) )
            // InternalQL.g:4091:1: ( () )
            {
            // InternalQL.g:4091:1: ( () )
            // InternalQL.g:4092:2: ()
            {
             before(grammarAccess.getBooleanValueTypeAccess().getBooleanValueTypeAction_0()); 
            // InternalQL.g:4093:2: ()
            // InternalQL.g:4093:3: 
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
    // InternalQL.g:4101:1: rule__BooleanValueType__Group__1 : rule__BooleanValueType__Group__1__Impl rule__BooleanValueType__Group__2 ;
    public final void rule__BooleanValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4105:1: ( rule__BooleanValueType__Group__1__Impl rule__BooleanValueType__Group__2 )
            // InternalQL.g:4106:2: rule__BooleanValueType__Group__1__Impl rule__BooleanValueType__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalQL.g:4113:1: rule__BooleanValueType__Group__1__Impl : ( 'booleanType' ) ;
    public final void rule__BooleanValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4117:1: ( ( 'booleanType' ) )
            // InternalQL.g:4118:1: ( 'booleanType' )
            {
            // InternalQL.g:4118:1: ( 'booleanType' )
            // InternalQL.g:4119:2: 'booleanType'
            {
             before(grammarAccess.getBooleanValueTypeAccess().getBooleanTypeKeyword_1()); 
            match(input,54,FOLLOW_2); 
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
    // InternalQL.g:4128:1: rule__BooleanValueType__Group__2 : rule__BooleanValueType__Group__2__Impl rule__BooleanValueType__Group__3 ;
    public final void rule__BooleanValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4132:1: ( rule__BooleanValueType__Group__2__Impl rule__BooleanValueType__Group__3 )
            // InternalQL.g:4133:2: rule__BooleanValueType__Group__2__Impl rule__BooleanValueType__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalQL.g:4140:1: rule__BooleanValueType__Group__2__Impl : ( ( rule__BooleanValueType__NameAssignment_2 ) ) ;
    public final void rule__BooleanValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4144:1: ( ( ( rule__BooleanValueType__NameAssignment_2 ) ) )
            // InternalQL.g:4145:1: ( ( rule__BooleanValueType__NameAssignment_2 ) )
            {
            // InternalQL.g:4145:1: ( ( rule__BooleanValueType__NameAssignment_2 ) )
            // InternalQL.g:4146:2: ( rule__BooleanValueType__NameAssignment_2 )
            {
             before(grammarAccess.getBooleanValueTypeAccess().getNameAssignment_2()); 
            // InternalQL.g:4147:2: ( rule__BooleanValueType__NameAssignment_2 )
            // InternalQL.g:4147:3: rule__BooleanValueType__NameAssignment_2
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
    // InternalQL.g:4155:1: rule__BooleanValueType__Group__3 : rule__BooleanValueType__Group__3__Impl ;
    public final void rule__BooleanValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4159:1: ( rule__BooleanValueType__Group__3__Impl )
            // InternalQL.g:4160:2: rule__BooleanValueType__Group__3__Impl
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
    // InternalQL.g:4166:1: rule__BooleanValueType__Group__3__Impl : ( ( rule__BooleanValueType__Group_3__0 )? ) ;
    public final void rule__BooleanValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4170:1: ( ( ( rule__BooleanValueType__Group_3__0 )? ) )
            // InternalQL.g:4171:1: ( ( rule__BooleanValueType__Group_3__0 )? )
            {
            // InternalQL.g:4171:1: ( ( rule__BooleanValueType__Group_3__0 )? )
            // InternalQL.g:4172:2: ( rule__BooleanValueType__Group_3__0 )?
            {
             before(grammarAccess.getBooleanValueTypeAccess().getGroup_3()); 
            // InternalQL.g:4173:2: ( rule__BooleanValueType__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==41) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalQL.g:4173:3: rule__BooleanValueType__Group_3__0
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
    // InternalQL.g:4182:1: rule__BooleanValueType__Group_3__0 : rule__BooleanValueType__Group_3__0__Impl rule__BooleanValueType__Group_3__1 ;
    public final void rule__BooleanValueType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4186:1: ( rule__BooleanValueType__Group_3__0__Impl rule__BooleanValueType__Group_3__1 )
            // InternalQL.g:4187:2: rule__BooleanValueType__Group_3__0__Impl rule__BooleanValueType__Group_3__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalQL.g:4194:1: rule__BooleanValueType__Group_3__0__Impl : ( '{' ) ;
    public final void rule__BooleanValueType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4198:1: ( ( '{' ) )
            // InternalQL.g:4199:1: ( '{' )
            {
            // InternalQL.g:4199:1: ( '{' )
            // InternalQL.g:4200:2: '{'
            {
             before(grammarAccess.getBooleanValueTypeAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalQL.g:4209:1: rule__BooleanValueType__Group_3__1 : rule__BooleanValueType__Group_3__1__Impl rule__BooleanValueType__Group_3__2 ;
    public final void rule__BooleanValueType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4213:1: ( rule__BooleanValueType__Group_3__1__Impl rule__BooleanValueType__Group_3__2 )
            // InternalQL.g:4214:2: rule__BooleanValueType__Group_3__1__Impl rule__BooleanValueType__Group_3__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalQL.g:4221:1: rule__BooleanValueType__Group_3__1__Impl : ( ( rule__BooleanValueType__Group_3_1__0 )? ) ;
    public final void rule__BooleanValueType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4225:1: ( ( ( rule__BooleanValueType__Group_3_1__0 )? ) )
            // InternalQL.g:4226:1: ( ( rule__BooleanValueType__Group_3_1__0 )? )
            {
            // InternalQL.g:4226:1: ( ( rule__BooleanValueType__Group_3_1__0 )? )
            // InternalQL.g:4227:2: ( rule__BooleanValueType__Group_3_1__0 )?
            {
             before(grammarAccess.getBooleanValueTypeAccess().getGroup_3_1()); 
            // InternalQL.g:4228:2: ( rule__BooleanValueType__Group_3_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==53) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalQL.g:4228:3: rule__BooleanValueType__Group_3_1__0
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
    // InternalQL.g:4236:1: rule__BooleanValueType__Group_3__2 : rule__BooleanValueType__Group_3__2__Impl ;
    public final void rule__BooleanValueType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4240:1: ( rule__BooleanValueType__Group_3__2__Impl )
            // InternalQL.g:4241:2: rule__BooleanValueType__Group_3__2__Impl
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
    // InternalQL.g:4247:1: rule__BooleanValueType__Group_3__2__Impl : ( '}' ) ;
    public final void rule__BooleanValueType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4251:1: ( ( '}' ) )
            // InternalQL.g:4252:1: ( '}' )
            {
            // InternalQL.g:4252:1: ( '}' )
            // InternalQL.g:4253:2: '}'
            {
             before(grammarAccess.getBooleanValueTypeAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,42,FOLLOW_2); 
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
    // InternalQL.g:4263:1: rule__BooleanValueType__Group_3_1__0 : rule__BooleanValueType__Group_3_1__0__Impl rule__BooleanValueType__Group_3_1__1 ;
    public final void rule__BooleanValueType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4267:1: ( rule__BooleanValueType__Group_3_1__0__Impl rule__BooleanValueType__Group_3_1__1 )
            // InternalQL.g:4268:2: rule__BooleanValueType__Group_3_1__0__Impl rule__BooleanValueType__Group_3_1__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalQL.g:4275:1: rule__BooleanValueType__Group_3_1__0__Impl : ( 'unit' ) ;
    public final void rule__BooleanValueType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4279:1: ( ( 'unit' ) )
            // InternalQL.g:4280:1: ( 'unit' )
            {
            // InternalQL.g:4280:1: ( 'unit' )
            // InternalQL.g:4281:2: 'unit'
            {
             before(grammarAccess.getBooleanValueTypeAccess().getUnitKeyword_3_1_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalQL.g:4290:1: rule__BooleanValueType__Group_3_1__1 : rule__BooleanValueType__Group_3_1__1__Impl ;
    public final void rule__BooleanValueType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4294:1: ( rule__BooleanValueType__Group_3_1__1__Impl )
            // InternalQL.g:4295:2: rule__BooleanValueType__Group_3_1__1__Impl
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
    // InternalQL.g:4301:1: rule__BooleanValueType__Group_3_1__1__Impl : ( ( rule__BooleanValueType__UnitAssignment_3_1_1 ) ) ;
    public final void rule__BooleanValueType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4305:1: ( ( ( rule__BooleanValueType__UnitAssignment_3_1_1 ) ) )
            // InternalQL.g:4306:1: ( ( rule__BooleanValueType__UnitAssignment_3_1_1 ) )
            {
            // InternalQL.g:4306:1: ( ( rule__BooleanValueType__UnitAssignment_3_1_1 ) )
            // InternalQL.g:4307:2: ( rule__BooleanValueType__UnitAssignment_3_1_1 )
            {
             before(grammarAccess.getBooleanValueTypeAccess().getUnitAssignment_3_1_1()); 
            // InternalQL.g:4308:2: ( rule__BooleanValueType__UnitAssignment_3_1_1 )
            // InternalQL.g:4308:3: rule__BooleanValueType__UnitAssignment_3_1_1
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
    // InternalQL.g:4317:1: rule__IntegerValueType__Group__0 : rule__IntegerValueType__Group__0__Impl rule__IntegerValueType__Group__1 ;
    public final void rule__IntegerValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4321:1: ( rule__IntegerValueType__Group__0__Impl rule__IntegerValueType__Group__1 )
            // InternalQL.g:4322:2: rule__IntegerValueType__Group__0__Impl rule__IntegerValueType__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalQL.g:4329:1: rule__IntegerValueType__Group__0__Impl : ( () ) ;
    public final void rule__IntegerValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4333:1: ( ( () ) )
            // InternalQL.g:4334:1: ( () )
            {
            // InternalQL.g:4334:1: ( () )
            // InternalQL.g:4335:2: ()
            {
             before(grammarAccess.getIntegerValueTypeAccess().getIntegerValueTypeAction_0()); 
            // InternalQL.g:4336:2: ()
            // InternalQL.g:4336:3: 
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
    // InternalQL.g:4344:1: rule__IntegerValueType__Group__1 : rule__IntegerValueType__Group__1__Impl rule__IntegerValueType__Group__2 ;
    public final void rule__IntegerValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4348:1: ( rule__IntegerValueType__Group__1__Impl rule__IntegerValueType__Group__2 )
            // InternalQL.g:4349:2: rule__IntegerValueType__Group__1__Impl rule__IntegerValueType__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalQL.g:4356:1: rule__IntegerValueType__Group__1__Impl : ( 'integerType' ) ;
    public final void rule__IntegerValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4360:1: ( ( 'integerType' ) )
            // InternalQL.g:4361:1: ( 'integerType' )
            {
            // InternalQL.g:4361:1: ( 'integerType' )
            // InternalQL.g:4362:2: 'integerType'
            {
             before(grammarAccess.getIntegerValueTypeAccess().getIntegerTypeKeyword_1()); 
            match(input,55,FOLLOW_2); 
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
    // InternalQL.g:4371:1: rule__IntegerValueType__Group__2 : rule__IntegerValueType__Group__2__Impl rule__IntegerValueType__Group__3 ;
    public final void rule__IntegerValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4375:1: ( rule__IntegerValueType__Group__2__Impl rule__IntegerValueType__Group__3 )
            // InternalQL.g:4376:2: rule__IntegerValueType__Group__2__Impl rule__IntegerValueType__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalQL.g:4383:1: rule__IntegerValueType__Group__2__Impl : ( ( rule__IntegerValueType__NameAssignment_2 ) ) ;
    public final void rule__IntegerValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4387:1: ( ( ( rule__IntegerValueType__NameAssignment_2 ) ) )
            // InternalQL.g:4388:1: ( ( rule__IntegerValueType__NameAssignment_2 ) )
            {
            // InternalQL.g:4388:1: ( ( rule__IntegerValueType__NameAssignment_2 ) )
            // InternalQL.g:4389:2: ( rule__IntegerValueType__NameAssignment_2 )
            {
             before(grammarAccess.getIntegerValueTypeAccess().getNameAssignment_2()); 
            // InternalQL.g:4390:2: ( rule__IntegerValueType__NameAssignment_2 )
            // InternalQL.g:4390:3: rule__IntegerValueType__NameAssignment_2
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
    // InternalQL.g:4398:1: rule__IntegerValueType__Group__3 : rule__IntegerValueType__Group__3__Impl ;
    public final void rule__IntegerValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4402:1: ( rule__IntegerValueType__Group__3__Impl )
            // InternalQL.g:4403:2: rule__IntegerValueType__Group__3__Impl
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
    // InternalQL.g:4409:1: rule__IntegerValueType__Group__3__Impl : ( ( rule__IntegerValueType__Group_3__0 )? ) ;
    public final void rule__IntegerValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4413:1: ( ( ( rule__IntegerValueType__Group_3__0 )? ) )
            // InternalQL.g:4414:1: ( ( rule__IntegerValueType__Group_3__0 )? )
            {
            // InternalQL.g:4414:1: ( ( rule__IntegerValueType__Group_3__0 )? )
            // InternalQL.g:4415:2: ( rule__IntegerValueType__Group_3__0 )?
            {
             before(grammarAccess.getIntegerValueTypeAccess().getGroup_3()); 
            // InternalQL.g:4416:2: ( rule__IntegerValueType__Group_3__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==41) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalQL.g:4416:3: rule__IntegerValueType__Group_3__0
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
    // InternalQL.g:4425:1: rule__IntegerValueType__Group_3__0 : rule__IntegerValueType__Group_3__0__Impl rule__IntegerValueType__Group_3__1 ;
    public final void rule__IntegerValueType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4429:1: ( rule__IntegerValueType__Group_3__0__Impl rule__IntegerValueType__Group_3__1 )
            // InternalQL.g:4430:2: rule__IntegerValueType__Group_3__0__Impl rule__IntegerValueType__Group_3__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalQL.g:4437:1: rule__IntegerValueType__Group_3__0__Impl : ( '{' ) ;
    public final void rule__IntegerValueType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4441:1: ( ( '{' ) )
            // InternalQL.g:4442:1: ( '{' )
            {
            // InternalQL.g:4442:1: ( '{' )
            // InternalQL.g:4443:2: '{'
            {
             before(grammarAccess.getIntegerValueTypeAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalQL.g:4452:1: rule__IntegerValueType__Group_3__1 : rule__IntegerValueType__Group_3__1__Impl rule__IntegerValueType__Group_3__2 ;
    public final void rule__IntegerValueType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4456:1: ( rule__IntegerValueType__Group_3__1__Impl rule__IntegerValueType__Group_3__2 )
            // InternalQL.g:4457:2: rule__IntegerValueType__Group_3__1__Impl rule__IntegerValueType__Group_3__2
            {
            pushFollow(FOLLOW_43);
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
    // InternalQL.g:4464:1: rule__IntegerValueType__Group_3__1__Impl : ( ( rule__IntegerValueType__Group_3_1__0 )? ) ;
    public final void rule__IntegerValueType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4468:1: ( ( ( rule__IntegerValueType__Group_3_1__0 )? ) )
            // InternalQL.g:4469:1: ( ( rule__IntegerValueType__Group_3_1__0 )? )
            {
            // InternalQL.g:4469:1: ( ( rule__IntegerValueType__Group_3_1__0 )? )
            // InternalQL.g:4470:2: ( rule__IntegerValueType__Group_3_1__0 )?
            {
             before(grammarAccess.getIntegerValueTypeAccess().getGroup_3_1()); 
            // InternalQL.g:4471:2: ( rule__IntegerValueType__Group_3_1__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==53) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalQL.g:4471:3: rule__IntegerValueType__Group_3_1__0
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
    // InternalQL.g:4479:1: rule__IntegerValueType__Group_3__2 : rule__IntegerValueType__Group_3__2__Impl rule__IntegerValueType__Group_3__3 ;
    public final void rule__IntegerValueType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4483:1: ( rule__IntegerValueType__Group_3__2__Impl rule__IntegerValueType__Group_3__3 )
            // InternalQL.g:4484:2: rule__IntegerValueType__Group_3__2__Impl rule__IntegerValueType__Group_3__3
            {
            pushFollow(FOLLOW_43);
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
    // InternalQL.g:4491:1: rule__IntegerValueType__Group_3__2__Impl : ( ( rule__IntegerValueType__Group_3_2__0 )? ) ;
    public final void rule__IntegerValueType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4495:1: ( ( ( rule__IntegerValueType__Group_3_2__0 )? ) )
            // InternalQL.g:4496:1: ( ( rule__IntegerValueType__Group_3_2__0 )? )
            {
            // InternalQL.g:4496:1: ( ( rule__IntegerValueType__Group_3_2__0 )? )
            // InternalQL.g:4497:2: ( rule__IntegerValueType__Group_3_2__0 )?
            {
             before(grammarAccess.getIntegerValueTypeAccess().getGroup_3_2()); 
            // InternalQL.g:4498:2: ( rule__IntegerValueType__Group_3_2__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==56) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalQL.g:4498:3: rule__IntegerValueType__Group_3_2__0
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
    // InternalQL.g:4506:1: rule__IntegerValueType__Group_3__3 : rule__IntegerValueType__Group_3__3__Impl rule__IntegerValueType__Group_3__4 ;
    public final void rule__IntegerValueType__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4510:1: ( rule__IntegerValueType__Group_3__3__Impl rule__IntegerValueType__Group_3__4 )
            // InternalQL.g:4511:2: rule__IntegerValueType__Group_3__3__Impl rule__IntegerValueType__Group_3__4
            {
            pushFollow(FOLLOW_43);
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
    // InternalQL.g:4518:1: rule__IntegerValueType__Group_3__3__Impl : ( ( rule__IntegerValueType__Group_3_3__0 )? ) ;
    public final void rule__IntegerValueType__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4522:1: ( ( ( rule__IntegerValueType__Group_3_3__0 )? ) )
            // InternalQL.g:4523:1: ( ( rule__IntegerValueType__Group_3_3__0 )? )
            {
            // InternalQL.g:4523:1: ( ( rule__IntegerValueType__Group_3_3__0 )? )
            // InternalQL.g:4524:2: ( rule__IntegerValueType__Group_3_3__0 )?
            {
             before(grammarAccess.getIntegerValueTypeAccess().getGroup_3_3()); 
            // InternalQL.g:4525:2: ( rule__IntegerValueType__Group_3_3__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==57) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalQL.g:4525:3: rule__IntegerValueType__Group_3_3__0
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
    // InternalQL.g:4533:1: rule__IntegerValueType__Group_3__4 : rule__IntegerValueType__Group_3__4__Impl ;
    public final void rule__IntegerValueType__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4537:1: ( rule__IntegerValueType__Group_3__4__Impl )
            // InternalQL.g:4538:2: rule__IntegerValueType__Group_3__4__Impl
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
    // InternalQL.g:4544:1: rule__IntegerValueType__Group_3__4__Impl : ( '}' ) ;
    public final void rule__IntegerValueType__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4548:1: ( ( '}' ) )
            // InternalQL.g:4549:1: ( '}' )
            {
            // InternalQL.g:4549:1: ( '}' )
            // InternalQL.g:4550:2: '}'
            {
             before(grammarAccess.getIntegerValueTypeAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,42,FOLLOW_2); 
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
    // InternalQL.g:4560:1: rule__IntegerValueType__Group_3_1__0 : rule__IntegerValueType__Group_3_1__0__Impl rule__IntegerValueType__Group_3_1__1 ;
    public final void rule__IntegerValueType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4564:1: ( rule__IntegerValueType__Group_3_1__0__Impl rule__IntegerValueType__Group_3_1__1 )
            // InternalQL.g:4565:2: rule__IntegerValueType__Group_3_1__0__Impl rule__IntegerValueType__Group_3_1__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalQL.g:4572:1: rule__IntegerValueType__Group_3_1__0__Impl : ( 'unit' ) ;
    public final void rule__IntegerValueType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4576:1: ( ( 'unit' ) )
            // InternalQL.g:4577:1: ( 'unit' )
            {
            // InternalQL.g:4577:1: ( 'unit' )
            // InternalQL.g:4578:2: 'unit'
            {
             before(grammarAccess.getIntegerValueTypeAccess().getUnitKeyword_3_1_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalQL.g:4587:1: rule__IntegerValueType__Group_3_1__1 : rule__IntegerValueType__Group_3_1__1__Impl ;
    public final void rule__IntegerValueType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4591:1: ( rule__IntegerValueType__Group_3_1__1__Impl )
            // InternalQL.g:4592:2: rule__IntegerValueType__Group_3_1__1__Impl
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
    // InternalQL.g:4598:1: rule__IntegerValueType__Group_3_1__1__Impl : ( ( rule__IntegerValueType__UnitAssignment_3_1_1 ) ) ;
    public final void rule__IntegerValueType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4602:1: ( ( ( rule__IntegerValueType__UnitAssignment_3_1_1 ) ) )
            // InternalQL.g:4603:1: ( ( rule__IntegerValueType__UnitAssignment_3_1_1 ) )
            {
            // InternalQL.g:4603:1: ( ( rule__IntegerValueType__UnitAssignment_3_1_1 ) )
            // InternalQL.g:4604:2: ( rule__IntegerValueType__UnitAssignment_3_1_1 )
            {
             before(grammarAccess.getIntegerValueTypeAccess().getUnitAssignment_3_1_1()); 
            // InternalQL.g:4605:2: ( rule__IntegerValueType__UnitAssignment_3_1_1 )
            // InternalQL.g:4605:3: rule__IntegerValueType__UnitAssignment_3_1_1
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
    // InternalQL.g:4614:1: rule__IntegerValueType__Group_3_2__0 : rule__IntegerValueType__Group_3_2__0__Impl rule__IntegerValueType__Group_3_2__1 ;
    public final void rule__IntegerValueType__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4618:1: ( rule__IntegerValueType__Group_3_2__0__Impl rule__IntegerValueType__Group_3_2__1 )
            // InternalQL.g:4619:2: rule__IntegerValueType__Group_3_2__0__Impl rule__IntegerValueType__Group_3_2__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalQL.g:4626:1: rule__IntegerValueType__Group_3_2__0__Impl : ( 'min' ) ;
    public final void rule__IntegerValueType__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4630:1: ( ( 'min' ) )
            // InternalQL.g:4631:1: ( 'min' )
            {
            // InternalQL.g:4631:1: ( 'min' )
            // InternalQL.g:4632:2: 'min'
            {
             before(grammarAccess.getIntegerValueTypeAccess().getMinKeyword_3_2_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalQL.g:4641:1: rule__IntegerValueType__Group_3_2__1 : rule__IntegerValueType__Group_3_2__1__Impl ;
    public final void rule__IntegerValueType__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4645:1: ( rule__IntegerValueType__Group_3_2__1__Impl )
            // InternalQL.g:4646:2: rule__IntegerValueType__Group_3_2__1__Impl
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
    // InternalQL.g:4652:1: rule__IntegerValueType__Group_3_2__1__Impl : ( ( rule__IntegerValueType__MinAssignment_3_2_1 ) ) ;
    public final void rule__IntegerValueType__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4656:1: ( ( ( rule__IntegerValueType__MinAssignment_3_2_1 ) ) )
            // InternalQL.g:4657:1: ( ( rule__IntegerValueType__MinAssignment_3_2_1 ) )
            {
            // InternalQL.g:4657:1: ( ( rule__IntegerValueType__MinAssignment_3_2_1 ) )
            // InternalQL.g:4658:2: ( rule__IntegerValueType__MinAssignment_3_2_1 )
            {
             before(grammarAccess.getIntegerValueTypeAccess().getMinAssignment_3_2_1()); 
            // InternalQL.g:4659:2: ( rule__IntegerValueType__MinAssignment_3_2_1 )
            // InternalQL.g:4659:3: rule__IntegerValueType__MinAssignment_3_2_1
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
    // InternalQL.g:4668:1: rule__IntegerValueType__Group_3_3__0 : rule__IntegerValueType__Group_3_3__0__Impl rule__IntegerValueType__Group_3_3__1 ;
    public final void rule__IntegerValueType__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4672:1: ( rule__IntegerValueType__Group_3_3__0__Impl rule__IntegerValueType__Group_3_3__1 )
            // InternalQL.g:4673:2: rule__IntegerValueType__Group_3_3__0__Impl rule__IntegerValueType__Group_3_3__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalQL.g:4680:1: rule__IntegerValueType__Group_3_3__0__Impl : ( 'max' ) ;
    public final void rule__IntegerValueType__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4684:1: ( ( 'max' ) )
            // InternalQL.g:4685:1: ( 'max' )
            {
            // InternalQL.g:4685:1: ( 'max' )
            // InternalQL.g:4686:2: 'max'
            {
             before(grammarAccess.getIntegerValueTypeAccess().getMaxKeyword_3_3_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalQL.g:4695:1: rule__IntegerValueType__Group_3_3__1 : rule__IntegerValueType__Group_3_3__1__Impl ;
    public final void rule__IntegerValueType__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4699:1: ( rule__IntegerValueType__Group_3_3__1__Impl )
            // InternalQL.g:4700:2: rule__IntegerValueType__Group_3_3__1__Impl
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
    // InternalQL.g:4706:1: rule__IntegerValueType__Group_3_3__1__Impl : ( ( rule__IntegerValueType__MaxAssignment_3_3_1 ) ) ;
    public final void rule__IntegerValueType__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4710:1: ( ( ( rule__IntegerValueType__MaxAssignment_3_3_1 ) ) )
            // InternalQL.g:4711:1: ( ( rule__IntegerValueType__MaxAssignment_3_3_1 ) )
            {
            // InternalQL.g:4711:1: ( ( rule__IntegerValueType__MaxAssignment_3_3_1 ) )
            // InternalQL.g:4712:2: ( rule__IntegerValueType__MaxAssignment_3_3_1 )
            {
             before(grammarAccess.getIntegerValueTypeAccess().getMaxAssignment_3_3_1()); 
            // InternalQL.g:4713:2: ( rule__IntegerValueType__MaxAssignment_3_3_1 )
            // InternalQL.g:4713:3: rule__IntegerValueType__MaxAssignment_3_3_1
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
    // InternalQL.g:4722:1: rule__DecimalValueType__Group__0 : rule__DecimalValueType__Group__0__Impl rule__DecimalValueType__Group__1 ;
    public final void rule__DecimalValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4726:1: ( rule__DecimalValueType__Group__0__Impl rule__DecimalValueType__Group__1 )
            // InternalQL.g:4727:2: rule__DecimalValueType__Group__0__Impl rule__DecimalValueType__Group__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalQL.g:4734:1: rule__DecimalValueType__Group__0__Impl : ( () ) ;
    public final void rule__DecimalValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4738:1: ( ( () ) )
            // InternalQL.g:4739:1: ( () )
            {
            // InternalQL.g:4739:1: ( () )
            // InternalQL.g:4740:2: ()
            {
             before(grammarAccess.getDecimalValueTypeAccess().getDecimalValueTypeAction_0()); 
            // InternalQL.g:4741:2: ()
            // InternalQL.g:4741:3: 
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
    // InternalQL.g:4749:1: rule__DecimalValueType__Group__1 : rule__DecimalValueType__Group__1__Impl rule__DecimalValueType__Group__2 ;
    public final void rule__DecimalValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4753:1: ( rule__DecimalValueType__Group__1__Impl rule__DecimalValueType__Group__2 )
            // InternalQL.g:4754:2: rule__DecimalValueType__Group__1__Impl rule__DecimalValueType__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalQL.g:4761:1: rule__DecimalValueType__Group__1__Impl : ( 'decimalType' ) ;
    public final void rule__DecimalValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4765:1: ( ( 'decimalType' ) )
            // InternalQL.g:4766:1: ( 'decimalType' )
            {
            // InternalQL.g:4766:1: ( 'decimalType' )
            // InternalQL.g:4767:2: 'decimalType'
            {
             before(grammarAccess.getDecimalValueTypeAccess().getDecimalTypeKeyword_1()); 
            match(input,58,FOLLOW_2); 
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
    // InternalQL.g:4776:1: rule__DecimalValueType__Group__2 : rule__DecimalValueType__Group__2__Impl rule__DecimalValueType__Group__3 ;
    public final void rule__DecimalValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4780:1: ( rule__DecimalValueType__Group__2__Impl rule__DecimalValueType__Group__3 )
            // InternalQL.g:4781:2: rule__DecimalValueType__Group__2__Impl rule__DecimalValueType__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalQL.g:4788:1: rule__DecimalValueType__Group__2__Impl : ( ( rule__DecimalValueType__NameAssignment_2 ) ) ;
    public final void rule__DecimalValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4792:1: ( ( ( rule__DecimalValueType__NameAssignment_2 ) ) )
            // InternalQL.g:4793:1: ( ( rule__DecimalValueType__NameAssignment_2 ) )
            {
            // InternalQL.g:4793:1: ( ( rule__DecimalValueType__NameAssignment_2 ) )
            // InternalQL.g:4794:2: ( rule__DecimalValueType__NameAssignment_2 )
            {
             before(grammarAccess.getDecimalValueTypeAccess().getNameAssignment_2()); 
            // InternalQL.g:4795:2: ( rule__DecimalValueType__NameAssignment_2 )
            // InternalQL.g:4795:3: rule__DecimalValueType__NameAssignment_2
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
    // InternalQL.g:4803:1: rule__DecimalValueType__Group__3 : rule__DecimalValueType__Group__3__Impl ;
    public final void rule__DecimalValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4807:1: ( rule__DecimalValueType__Group__3__Impl )
            // InternalQL.g:4808:2: rule__DecimalValueType__Group__3__Impl
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
    // InternalQL.g:4814:1: rule__DecimalValueType__Group__3__Impl : ( ( rule__DecimalValueType__Group_3__0 )? ) ;
    public final void rule__DecimalValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4818:1: ( ( ( rule__DecimalValueType__Group_3__0 )? ) )
            // InternalQL.g:4819:1: ( ( rule__DecimalValueType__Group_3__0 )? )
            {
            // InternalQL.g:4819:1: ( ( rule__DecimalValueType__Group_3__0 )? )
            // InternalQL.g:4820:2: ( rule__DecimalValueType__Group_3__0 )?
            {
             before(grammarAccess.getDecimalValueTypeAccess().getGroup_3()); 
            // InternalQL.g:4821:2: ( rule__DecimalValueType__Group_3__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==41) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalQL.g:4821:3: rule__DecimalValueType__Group_3__0
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
    // InternalQL.g:4830:1: rule__DecimalValueType__Group_3__0 : rule__DecimalValueType__Group_3__0__Impl rule__DecimalValueType__Group_3__1 ;
    public final void rule__DecimalValueType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4834:1: ( rule__DecimalValueType__Group_3__0__Impl rule__DecimalValueType__Group_3__1 )
            // InternalQL.g:4835:2: rule__DecimalValueType__Group_3__0__Impl rule__DecimalValueType__Group_3__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalQL.g:4842:1: rule__DecimalValueType__Group_3__0__Impl : ( '{' ) ;
    public final void rule__DecimalValueType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4846:1: ( ( '{' ) )
            // InternalQL.g:4847:1: ( '{' )
            {
            // InternalQL.g:4847:1: ( '{' )
            // InternalQL.g:4848:2: '{'
            {
             before(grammarAccess.getDecimalValueTypeAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalQL.g:4857:1: rule__DecimalValueType__Group_3__1 : rule__DecimalValueType__Group_3__1__Impl rule__DecimalValueType__Group_3__2 ;
    public final void rule__DecimalValueType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4861:1: ( rule__DecimalValueType__Group_3__1__Impl rule__DecimalValueType__Group_3__2 )
            // InternalQL.g:4862:2: rule__DecimalValueType__Group_3__1__Impl rule__DecimalValueType__Group_3__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalQL.g:4869:1: rule__DecimalValueType__Group_3__1__Impl : ( ( rule__DecimalValueType__Group_3_1__0 )? ) ;
    public final void rule__DecimalValueType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4873:1: ( ( ( rule__DecimalValueType__Group_3_1__0 )? ) )
            // InternalQL.g:4874:1: ( ( rule__DecimalValueType__Group_3_1__0 )? )
            {
            // InternalQL.g:4874:1: ( ( rule__DecimalValueType__Group_3_1__0 )? )
            // InternalQL.g:4875:2: ( rule__DecimalValueType__Group_3_1__0 )?
            {
             before(grammarAccess.getDecimalValueTypeAccess().getGroup_3_1()); 
            // InternalQL.g:4876:2: ( rule__DecimalValueType__Group_3_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==53) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalQL.g:4876:3: rule__DecimalValueType__Group_3_1__0
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
    // InternalQL.g:4884:1: rule__DecimalValueType__Group_3__2 : rule__DecimalValueType__Group_3__2__Impl ;
    public final void rule__DecimalValueType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4888:1: ( rule__DecimalValueType__Group_3__2__Impl )
            // InternalQL.g:4889:2: rule__DecimalValueType__Group_3__2__Impl
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
    // InternalQL.g:4895:1: rule__DecimalValueType__Group_3__2__Impl : ( '}' ) ;
    public final void rule__DecimalValueType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4899:1: ( ( '}' ) )
            // InternalQL.g:4900:1: ( '}' )
            {
            // InternalQL.g:4900:1: ( '}' )
            // InternalQL.g:4901:2: '}'
            {
             before(grammarAccess.getDecimalValueTypeAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,42,FOLLOW_2); 
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
    // InternalQL.g:4911:1: rule__DecimalValueType__Group_3_1__0 : rule__DecimalValueType__Group_3_1__0__Impl rule__DecimalValueType__Group_3_1__1 ;
    public final void rule__DecimalValueType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4915:1: ( rule__DecimalValueType__Group_3_1__0__Impl rule__DecimalValueType__Group_3_1__1 )
            // InternalQL.g:4916:2: rule__DecimalValueType__Group_3_1__0__Impl rule__DecimalValueType__Group_3_1__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalQL.g:4923:1: rule__DecimalValueType__Group_3_1__0__Impl : ( 'unit' ) ;
    public final void rule__DecimalValueType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4927:1: ( ( 'unit' ) )
            // InternalQL.g:4928:1: ( 'unit' )
            {
            // InternalQL.g:4928:1: ( 'unit' )
            // InternalQL.g:4929:2: 'unit'
            {
             before(grammarAccess.getDecimalValueTypeAccess().getUnitKeyword_3_1_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalQL.g:4938:1: rule__DecimalValueType__Group_3_1__1 : rule__DecimalValueType__Group_3_1__1__Impl ;
    public final void rule__DecimalValueType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4942:1: ( rule__DecimalValueType__Group_3_1__1__Impl )
            // InternalQL.g:4943:2: rule__DecimalValueType__Group_3_1__1__Impl
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
    // InternalQL.g:4949:1: rule__DecimalValueType__Group_3_1__1__Impl : ( ( rule__DecimalValueType__UnitAssignment_3_1_1 ) ) ;
    public final void rule__DecimalValueType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4953:1: ( ( ( rule__DecimalValueType__UnitAssignment_3_1_1 ) ) )
            // InternalQL.g:4954:1: ( ( rule__DecimalValueType__UnitAssignment_3_1_1 ) )
            {
            // InternalQL.g:4954:1: ( ( rule__DecimalValueType__UnitAssignment_3_1_1 ) )
            // InternalQL.g:4955:2: ( rule__DecimalValueType__UnitAssignment_3_1_1 )
            {
             before(grammarAccess.getDecimalValueTypeAccess().getUnitAssignment_3_1_1()); 
            // InternalQL.g:4956:2: ( rule__DecimalValueType__UnitAssignment_3_1_1 )
            // InternalQL.g:4956:3: rule__DecimalValueType__UnitAssignment_3_1_1
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
    // InternalQL.g:4965:1: rule__DateValueType__Group__0 : rule__DateValueType__Group__0__Impl rule__DateValueType__Group__1 ;
    public final void rule__DateValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4969:1: ( rule__DateValueType__Group__0__Impl rule__DateValueType__Group__1 )
            // InternalQL.g:4970:2: rule__DateValueType__Group__0__Impl rule__DateValueType__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalQL.g:4977:1: rule__DateValueType__Group__0__Impl : ( () ) ;
    public final void rule__DateValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4981:1: ( ( () ) )
            // InternalQL.g:4982:1: ( () )
            {
            // InternalQL.g:4982:1: ( () )
            // InternalQL.g:4983:2: ()
            {
             before(grammarAccess.getDateValueTypeAccess().getDateValueTypeAction_0()); 
            // InternalQL.g:4984:2: ()
            // InternalQL.g:4984:3: 
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
    // InternalQL.g:4992:1: rule__DateValueType__Group__1 : rule__DateValueType__Group__1__Impl rule__DateValueType__Group__2 ;
    public final void rule__DateValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4996:1: ( rule__DateValueType__Group__1__Impl rule__DateValueType__Group__2 )
            // InternalQL.g:4997:2: rule__DateValueType__Group__1__Impl rule__DateValueType__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalQL.g:5004:1: rule__DateValueType__Group__1__Impl : ( 'dateType' ) ;
    public final void rule__DateValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5008:1: ( ( 'dateType' ) )
            // InternalQL.g:5009:1: ( 'dateType' )
            {
            // InternalQL.g:5009:1: ( 'dateType' )
            // InternalQL.g:5010:2: 'dateType'
            {
             before(grammarAccess.getDateValueTypeAccess().getDateTypeKeyword_1()); 
            match(input,59,FOLLOW_2); 
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
    // InternalQL.g:5019:1: rule__DateValueType__Group__2 : rule__DateValueType__Group__2__Impl rule__DateValueType__Group__3 ;
    public final void rule__DateValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5023:1: ( rule__DateValueType__Group__2__Impl rule__DateValueType__Group__3 )
            // InternalQL.g:5024:2: rule__DateValueType__Group__2__Impl rule__DateValueType__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalQL.g:5031:1: rule__DateValueType__Group__2__Impl : ( ( rule__DateValueType__NameAssignment_2 ) ) ;
    public final void rule__DateValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5035:1: ( ( ( rule__DateValueType__NameAssignment_2 ) ) )
            // InternalQL.g:5036:1: ( ( rule__DateValueType__NameAssignment_2 ) )
            {
            // InternalQL.g:5036:1: ( ( rule__DateValueType__NameAssignment_2 ) )
            // InternalQL.g:5037:2: ( rule__DateValueType__NameAssignment_2 )
            {
             before(grammarAccess.getDateValueTypeAccess().getNameAssignment_2()); 
            // InternalQL.g:5038:2: ( rule__DateValueType__NameAssignment_2 )
            // InternalQL.g:5038:3: rule__DateValueType__NameAssignment_2
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
    // InternalQL.g:5046:1: rule__DateValueType__Group__3 : rule__DateValueType__Group__3__Impl ;
    public final void rule__DateValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5050:1: ( rule__DateValueType__Group__3__Impl )
            // InternalQL.g:5051:2: rule__DateValueType__Group__3__Impl
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
    // InternalQL.g:5057:1: rule__DateValueType__Group__3__Impl : ( ( rule__DateValueType__Group_3__0 )? ) ;
    public final void rule__DateValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5061:1: ( ( ( rule__DateValueType__Group_3__0 )? ) )
            // InternalQL.g:5062:1: ( ( rule__DateValueType__Group_3__0 )? )
            {
            // InternalQL.g:5062:1: ( ( rule__DateValueType__Group_3__0 )? )
            // InternalQL.g:5063:2: ( rule__DateValueType__Group_3__0 )?
            {
             before(grammarAccess.getDateValueTypeAccess().getGroup_3()); 
            // InternalQL.g:5064:2: ( rule__DateValueType__Group_3__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==41) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalQL.g:5064:3: rule__DateValueType__Group_3__0
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
    // InternalQL.g:5073:1: rule__DateValueType__Group_3__0 : rule__DateValueType__Group_3__0__Impl rule__DateValueType__Group_3__1 ;
    public final void rule__DateValueType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5077:1: ( rule__DateValueType__Group_3__0__Impl rule__DateValueType__Group_3__1 )
            // InternalQL.g:5078:2: rule__DateValueType__Group_3__0__Impl rule__DateValueType__Group_3__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalQL.g:5085:1: rule__DateValueType__Group_3__0__Impl : ( '{' ) ;
    public final void rule__DateValueType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5089:1: ( ( '{' ) )
            // InternalQL.g:5090:1: ( '{' )
            {
            // InternalQL.g:5090:1: ( '{' )
            // InternalQL.g:5091:2: '{'
            {
             before(grammarAccess.getDateValueTypeAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalQL.g:5100:1: rule__DateValueType__Group_3__1 : rule__DateValueType__Group_3__1__Impl rule__DateValueType__Group_3__2 ;
    public final void rule__DateValueType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5104:1: ( rule__DateValueType__Group_3__1__Impl rule__DateValueType__Group_3__2 )
            // InternalQL.g:5105:2: rule__DateValueType__Group_3__1__Impl rule__DateValueType__Group_3__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalQL.g:5112:1: rule__DateValueType__Group_3__1__Impl : ( ( rule__DateValueType__Group_3_1__0 )? ) ;
    public final void rule__DateValueType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5116:1: ( ( ( rule__DateValueType__Group_3_1__0 )? ) )
            // InternalQL.g:5117:1: ( ( rule__DateValueType__Group_3_1__0 )? )
            {
            // InternalQL.g:5117:1: ( ( rule__DateValueType__Group_3_1__0 )? )
            // InternalQL.g:5118:2: ( rule__DateValueType__Group_3_1__0 )?
            {
             before(grammarAccess.getDateValueTypeAccess().getGroup_3_1()); 
            // InternalQL.g:5119:2: ( rule__DateValueType__Group_3_1__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==53) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalQL.g:5119:3: rule__DateValueType__Group_3_1__0
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
    // InternalQL.g:5127:1: rule__DateValueType__Group_3__2 : rule__DateValueType__Group_3__2__Impl ;
    public final void rule__DateValueType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5131:1: ( rule__DateValueType__Group_3__2__Impl )
            // InternalQL.g:5132:2: rule__DateValueType__Group_3__2__Impl
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
    // InternalQL.g:5138:1: rule__DateValueType__Group_3__2__Impl : ( '}' ) ;
    public final void rule__DateValueType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5142:1: ( ( '}' ) )
            // InternalQL.g:5143:1: ( '}' )
            {
            // InternalQL.g:5143:1: ( '}' )
            // InternalQL.g:5144:2: '}'
            {
             before(grammarAccess.getDateValueTypeAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,42,FOLLOW_2); 
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
    // InternalQL.g:5154:1: rule__DateValueType__Group_3_1__0 : rule__DateValueType__Group_3_1__0__Impl rule__DateValueType__Group_3_1__1 ;
    public final void rule__DateValueType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5158:1: ( rule__DateValueType__Group_3_1__0__Impl rule__DateValueType__Group_3_1__1 )
            // InternalQL.g:5159:2: rule__DateValueType__Group_3_1__0__Impl rule__DateValueType__Group_3_1__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalQL.g:5166:1: rule__DateValueType__Group_3_1__0__Impl : ( 'unit' ) ;
    public final void rule__DateValueType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5170:1: ( ( 'unit' ) )
            // InternalQL.g:5171:1: ( 'unit' )
            {
            // InternalQL.g:5171:1: ( 'unit' )
            // InternalQL.g:5172:2: 'unit'
            {
             before(grammarAccess.getDateValueTypeAccess().getUnitKeyword_3_1_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalQL.g:5181:1: rule__DateValueType__Group_3_1__1 : rule__DateValueType__Group_3_1__1__Impl ;
    public final void rule__DateValueType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5185:1: ( rule__DateValueType__Group_3_1__1__Impl )
            // InternalQL.g:5186:2: rule__DateValueType__Group_3_1__1__Impl
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
    // InternalQL.g:5192:1: rule__DateValueType__Group_3_1__1__Impl : ( ( rule__DateValueType__UnitAssignment_3_1_1 ) ) ;
    public final void rule__DateValueType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5196:1: ( ( ( rule__DateValueType__UnitAssignment_3_1_1 ) ) )
            // InternalQL.g:5197:1: ( ( rule__DateValueType__UnitAssignment_3_1_1 ) )
            {
            // InternalQL.g:5197:1: ( ( rule__DateValueType__UnitAssignment_3_1_1 ) )
            // InternalQL.g:5198:2: ( rule__DateValueType__UnitAssignment_3_1_1 )
            {
             before(grammarAccess.getDateValueTypeAccess().getUnitAssignment_3_1_1()); 
            // InternalQL.g:5199:2: ( rule__DateValueType__UnitAssignment_3_1_1 )
            // InternalQL.g:5199:3: rule__DateValueType__UnitAssignment_3_1_1
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
    // InternalQL.g:5208:1: rule__EnumerationValueType__Group__0 : rule__EnumerationValueType__Group__0__Impl rule__EnumerationValueType__Group__1 ;
    public final void rule__EnumerationValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5212:1: ( rule__EnumerationValueType__Group__0__Impl rule__EnumerationValueType__Group__1 )
            // InternalQL.g:5213:2: rule__EnumerationValueType__Group__0__Impl rule__EnumerationValueType__Group__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalQL.g:5220:1: rule__EnumerationValueType__Group__0__Impl : ( () ) ;
    public final void rule__EnumerationValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5224:1: ( ( () ) )
            // InternalQL.g:5225:1: ( () )
            {
            // InternalQL.g:5225:1: ( () )
            // InternalQL.g:5226:2: ()
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getEnumerationValueTypeAction_0()); 
            // InternalQL.g:5227:2: ()
            // InternalQL.g:5227:3: 
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
    // InternalQL.g:5235:1: rule__EnumerationValueType__Group__1 : rule__EnumerationValueType__Group__1__Impl rule__EnumerationValueType__Group__2 ;
    public final void rule__EnumerationValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5239:1: ( rule__EnumerationValueType__Group__1__Impl rule__EnumerationValueType__Group__2 )
            // InternalQL.g:5240:2: rule__EnumerationValueType__Group__1__Impl rule__EnumerationValueType__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalQL.g:5247:1: rule__EnumerationValueType__Group__1__Impl : ( 'enumerationType' ) ;
    public final void rule__EnumerationValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5251:1: ( ( 'enumerationType' ) )
            // InternalQL.g:5252:1: ( 'enumerationType' )
            {
            // InternalQL.g:5252:1: ( 'enumerationType' )
            // InternalQL.g:5253:2: 'enumerationType'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getEnumerationTypeKeyword_1()); 
            match(input,60,FOLLOW_2); 
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
    // InternalQL.g:5262:1: rule__EnumerationValueType__Group__2 : rule__EnumerationValueType__Group__2__Impl rule__EnumerationValueType__Group__3 ;
    public final void rule__EnumerationValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5266:1: ( rule__EnumerationValueType__Group__2__Impl rule__EnumerationValueType__Group__3 )
            // InternalQL.g:5267:2: rule__EnumerationValueType__Group__2__Impl rule__EnumerationValueType__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalQL.g:5274:1: rule__EnumerationValueType__Group__2__Impl : ( ( rule__EnumerationValueType__NameAssignment_2 ) ) ;
    public final void rule__EnumerationValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5278:1: ( ( ( rule__EnumerationValueType__NameAssignment_2 ) ) )
            // InternalQL.g:5279:1: ( ( rule__EnumerationValueType__NameAssignment_2 ) )
            {
            // InternalQL.g:5279:1: ( ( rule__EnumerationValueType__NameAssignment_2 ) )
            // InternalQL.g:5280:2: ( rule__EnumerationValueType__NameAssignment_2 )
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getNameAssignment_2()); 
            // InternalQL.g:5281:2: ( rule__EnumerationValueType__NameAssignment_2 )
            // InternalQL.g:5281:3: rule__EnumerationValueType__NameAssignment_2
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
    // InternalQL.g:5289:1: rule__EnumerationValueType__Group__3 : rule__EnumerationValueType__Group__3__Impl ;
    public final void rule__EnumerationValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5293:1: ( rule__EnumerationValueType__Group__3__Impl )
            // InternalQL.g:5294:2: rule__EnumerationValueType__Group__3__Impl
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
    // InternalQL.g:5300:1: rule__EnumerationValueType__Group__3__Impl : ( ( rule__EnumerationValueType__Group_3__0 )? ) ;
    public final void rule__EnumerationValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5304:1: ( ( ( rule__EnumerationValueType__Group_3__0 )? ) )
            // InternalQL.g:5305:1: ( ( rule__EnumerationValueType__Group_3__0 )? )
            {
            // InternalQL.g:5305:1: ( ( rule__EnumerationValueType__Group_3__0 )? )
            // InternalQL.g:5306:2: ( rule__EnumerationValueType__Group_3__0 )?
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getGroup_3()); 
            // InternalQL.g:5307:2: ( rule__EnumerationValueType__Group_3__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==41) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalQL.g:5307:3: rule__EnumerationValueType__Group_3__0
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
    // InternalQL.g:5316:1: rule__EnumerationValueType__Group_3__0 : rule__EnumerationValueType__Group_3__0__Impl rule__EnumerationValueType__Group_3__1 ;
    public final void rule__EnumerationValueType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5320:1: ( rule__EnumerationValueType__Group_3__0__Impl rule__EnumerationValueType__Group_3__1 )
            // InternalQL.g:5321:2: rule__EnumerationValueType__Group_3__0__Impl rule__EnumerationValueType__Group_3__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalQL.g:5328:1: rule__EnumerationValueType__Group_3__0__Impl : ( '{' ) ;
    public final void rule__EnumerationValueType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5332:1: ( ( '{' ) )
            // InternalQL.g:5333:1: ( '{' )
            {
            // InternalQL.g:5333:1: ( '{' )
            // InternalQL.g:5334:2: '{'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalQL.g:5343:1: rule__EnumerationValueType__Group_3__1 : rule__EnumerationValueType__Group_3__1__Impl rule__EnumerationValueType__Group_3__2 ;
    public final void rule__EnumerationValueType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5347:1: ( rule__EnumerationValueType__Group_3__1__Impl rule__EnumerationValueType__Group_3__2 )
            // InternalQL.g:5348:2: rule__EnumerationValueType__Group_3__1__Impl rule__EnumerationValueType__Group_3__2
            {
            pushFollow(FOLLOW_48);
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
    // InternalQL.g:5355:1: rule__EnumerationValueType__Group_3__1__Impl : ( ( rule__EnumerationValueType__Group_3_1__0 )? ) ;
    public final void rule__EnumerationValueType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5359:1: ( ( ( rule__EnumerationValueType__Group_3_1__0 )? ) )
            // InternalQL.g:5360:1: ( ( rule__EnumerationValueType__Group_3_1__0 )? )
            {
            // InternalQL.g:5360:1: ( ( rule__EnumerationValueType__Group_3_1__0 )? )
            // InternalQL.g:5361:2: ( rule__EnumerationValueType__Group_3_1__0 )?
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getGroup_3_1()); 
            // InternalQL.g:5362:2: ( rule__EnumerationValueType__Group_3_1__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==53) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalQL.g:5362:3: rule__EnumerationValueType__Group_3_1__0
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
    // InternalQL.g:5370:1: rule__EnumerationValueType__Group_3__2 : rule__EnumerationValueType__Group_3__2__Impl rule__EnumerationValueType__Group_3__3 ;
    public final void rule__EnumerationValueType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5374:1: ( rule__EnumerationValueType__Group_3__2__Impl rule__EnumerationValueType__Group_3__3 )
            // InternalQL.g:5375:2: rule__EnumerationValueType__Group_3__2__Impl rule__EnumerationValueType__Group_3__3
            {
            pushFollow(FOLLOW_48);
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
    // InternalQL.g:5382:1: rule__EnumerationValueType__Group_3__2__Impl : ( ( rule__EnumerationValueType__Group_3_2__0 )? ) ;
    public final void rule__EnumerationValueType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5386:1: ( ( ( rule__EnumerationValueType__Group_3_2__0 )? ) )
            // InternalQL.g:5387:1: ( ( rule__EnumerationValueType__Group_3_2__0 )? )
            {
            // InternalQL.g:5387:1: ( ( rule__EnumerationValueType__Group_3_2__0 )? )
            // InternalQL.g:5388:2: ( rule__EnumerationValueType__Group_3_2__0 )?
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getGroup_3_2()); 
            // InternalQL.g:5389:2: ( rule__EnumerationValueType__Group_3_2__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==61) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalQL.g:5389:3: rule__EnumerationValueType__Group_3_2__0
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
    // InternalQL.g:5397:1: rule__EnumerationValueType__Group_3__3 : rule__EnumerationValueType__Group_3__3__Impl ;
    public final void rule__EnumerationValueType__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5401:1: ( rule__EnumerationValueType__Group_3__3__Impl )
            // InternalQL.g:5402:2: rule__EnumerationValueType__Group_3__3__Impl
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
    // InternalQL.g:5408:1: rule__EnumerationValueType__Group_3__3__Impl : ( '}' ) ;
    public final void rule__EnumerationValueType__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5412:1: ( ( '}' ) )
            // InternalQL.g:5413:1: ( '}' )
            {
            // InternalQL.g:5413:1: ( '}' )
            // InternalQL.g:5414:2: '}'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,42,FOLLOW_2); 
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
    // InternalQL.g:5424:1: rule__EnumerationValueType__Group_3_1__0 : rule__EnumerationValueType__Group_3_1__0__Impl rule__EnumerationValueType__Group_3_1__1 ;
    public final void rule__EnumerationValueType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5428:1: ( rule__EnumerationValueType__Group_3_1__0__Impl rule__EnumerationValueType__Group_3_1__1 )
            // InternalQL.g:5429:2: rule__EnumerationValueType__Group_3_1__0__Impl rule__EnumerationValueType__Group_3_1__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalQL.g:5436:1: rule__EnumerationValueType__Group_3_1__0__Impl : ( 'unit' ) ;
    public final void rule__EnumerationValueType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5440:1: ( ( 'unit' ) )
            // InternalQL.g:5441:1: ( 'unit' )
            {
            // InternalQL.g:5441:1: ( 'unit' )
            // InternalQL.g:5442:2: 'unit'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getUnitKeyword_3_1_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalQL.g:5451:1: rule__EnumerationValueType__Group_3_1__1 : rule__EnumerationValueType__Group_3_1__1__Impl ;
    public final void rule__EnumerationValueType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5455:1: ( rule__EnumerationValueType__Group_3_1__1__Impl )
            // InternalQL.g:5456:2: rule__EnumerationValueType__Group_3_1__1__Impl
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
    // InternalQL.g:5462:1: rule__EnumerationValueType__Group_3_1__1__Impl : ( ( rule__EnumerationValueType__UnitAssignment_3_1_1 ) ) ;
    public final void rule__EnumerationValueType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5466:1: ( ( ( rule__EnumerationValueType__UnitAssignment_3_1_1 ) ) )
            // InternalQL.g:5467:1: ( ( rule__EnumerationValueType__UnitAssignment_3_1_1 ) )
            {
            // InternalQL.g:5467:1: ( ( rule__EnumerationValueType__UnitAssignment_3_1_1 ) )
            // InternalQL.g:5468:2: ( rule__EnumerationValueType__UnitAssignment_3_1_1 )
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getUnitAssignment_3_1_1()); 
            // InternalQL.g:5469:2: ( rule__EnumerationValueType__UnitAssignment_3_1_1 )
            // InternalQL.g:5469:3: rule__EnumerationValueType__UnitAssignment_3_1_1
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
    // InternalQL.g:5478:1: rule__EnumerationValueType__Group_3_2__0 : rule__EnumerationValueType__Group_3_2__0__Impl rule__EnumerationValueType__Group_3_2__1 ;
    public final void rule__EnumerationValueType__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5482:1: ( rule__EnumerationValueType__Group_3_2__0__Impl rule__EnumerationValueType__Group_3_2__1 )
            // InternalQL.g:5483:2: rule__EnumerationValueType__Group_3_2__0__Impl rule__EnumerationValueType__Group_3_2__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalQL.g:5490:1: rule__EnumerationValueType__Group_3_2__0__Impl : ( 'literals' ) ;
    public final void rule__EnumerationValueType__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5494:1: ( ( 'literals' ) )
            // InternalQL.g:5495:1: ( 'literals' )
            {
            // InternalQL.g:5495:1: ( 'literals' )
            // InternalQL.g:5496:2: 'literals'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getLiteralsKeyword_3_2_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalQL.g:5505:1: rule__EnumerationValueType__Group_3_2__1 : rule__EnumerationValueType__Group_3_2__1__Impl rule__EnumerationValueType__Group_3_2__2 ;
    public final void rule__EnumerationValueType__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5509:1: ( rule__EnumerationValueType__Group_3_2__1__Impl rule__EnumerationValueType__Group_3_2__2 )
            // InternalQL.g:5510:2: rule__EnumerationValueType__Group_3_2__1__Impl rule__EnumerationValueType__Group_3_2__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalQL.g:5517:1: rule__EnumerationValueType__Group_3_2__1__Impl : ( '{' ) ;
    public final void rule__EnumerationValueType__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5521:1: ( ( '{' ) )
            // InternalQL.g:5522:1: ( '{' )
            {
            // InternalQL.g:5522:1: ( '{' )
            // InternalQL.g:5523:2: '{'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getLeftCurlyBracketKeyword_3_2_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalQL.g:5532:1: rule__EnumerationValueType__Group_3_2__2 : rule__EnumerationValueType__Group_3_2__2__Impl rule__EnumerationValueType__Group_3_2__3 ;
    public final void rule__EnumerationValueType__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5536:1: ( rule__EnumerationValueType__Group_3_2__2__Impl rule__EnumerationValueType__Group_3_2__3 )
            // InternalQL.g:5537:2: rule__EnumerationValueType__Group_3_2__2__Impl rule__EnumerationValueType__Group_3_2__3
            {
            pushFollow(FOLLOW_49);
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
    // InternalQL.g:5544:1: rule__EnumerationValueType__Group_3_2__2__Impl : ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2 ) ) ;
    public final void rule__EnumerationValueType__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5548:1: ( ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2 ) ) )
            // InternalQL.g:5549:1: ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2 ) )
            {
            // InternalQL.g:5549:1: ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2 ) )
            // InternalQL.g:5550:2: ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2 )
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsAssignment_3_2_2()); 
            // InternalQL.g:5551:2: ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2 )
            // InternalQL.g:5551:3: rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2
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
    // InternalQL.g:5559:1: rule__EnumerationValueType__Group_3_2__3 : rule__EnumerationValueType__Group_3_2__3__Impl rule__EnumerationValueType__Group_3_2__4 ;
    public final void rule__EnumerationValueType__Group_3_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5563:1: ( rule__EnumerationValueType__Group_3_2__3__Impl rule__EnumerationValueType__Group_3_2__4 )
            // InternalQL.g:5564:2: rule__EnumerationValueType__Group_3_2__3__Impl rule__EnumerationValueType__Group_3_2__4
            {
            pushFollow(FOLLOW_49);
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
    // InternalQL.g:5571:1: rule__EnumerationValueType__Group_3_2__3__Impl : ( ( rule__EnumerationValueType__Group_3_2_3__0 )* ) ;
    public final void rule__EnumerationValueType__Group_3_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5575:1: ( ( ( rule__EnumerationValueType__Group_3_2_3__0 )* ) )
            // InternalQL.g:5576:1: ( ( rule__EnumerationValueType__Group_3_2_3__0 )* )
            {
            // InternalQL.g:5576:1: ( ( rule__EnumerationValueType__Group_3_2_3__0 )* )
            // InternalQL.g:5577:2: ( rule__EnumerationValueType__Group_3_2_3__0 )*
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getGroup_3_2_3()); 
            // InternalQL.g:5578:2: ( rule__EnumerationValueType__Group_3_2_3__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==62) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalQL.g:5578:3: rule__EnumerationValueType__Group_3_2_3__0
            	    {
            	    pushFollow(FOLLOW_50);
            	    rule__EnumerationValueType__Group_3_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
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
    // InternalQL.g:5586:1: rule__EnumerationValueType__Group_3_2__4 : rule__EnumerationValueType__Group_3_2__4__Impl ;
    public final void rule__EnumerationValueType__Group_3_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5590:1: ( rule__EnumerationValueType__Group_3_2__4__Impl )
            // InternalQL.g:5591:2: rule__EnumerationValueType__Group_3_2__4__Impl
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
    // InternalQL.g:5597:1: rule__EnumerationValueType__Group_3_2__4__Impl : ( '}' ) ;
    public final void rule__EnumerationValueType__Group_3_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5601:1: ( ( '}' ) )
            // InternalQL.g:5602:1: ( '}' )
            {
            // InternalQL.g:5602:1: ( '}' )
            // InternalQL.g:5603:2: '}'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getRightCurlyBracketKeyword_3_2_4()); 
            match(input,42,FOLLOW_2); 
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
    // InternalQL.g:5613:1: rule__EnumerationValueType__Group_3_2_3__0 : rule__EnumerationValueType__Group_3_2_3__0__Impl rule__EnumerationValueType__Group_3_2_3__1 ;
    public final void rule__EnumerationValueType__Group_3_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5617:1: ( rule__EnumerationValueType__Group_3_2_3__0__Impl rule__EnumerationValueType__Group_3_2_3__1 )
            // InternalQL.g:5618:2: rule__EnumerationValueType__Group_3_2_3__0__Impl rule__EnumerationValueType__Group_3_2_3__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalQL.g:5625:1: rule__EnumerationValueType__Group_3_2_3__0__Impl : ( ',' ) ;
    public final void rule__EnumerationValueType__Group_3_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5629:1: ( ( ',' ) )
            // InternalQL.g:5630:1: ( ',' )
            {
            // InternalQL.g:5630:1: ( ',' )
            // InternalQL.g:5631:2: ','
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getCommaKeyword_3_2_3_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalQL.g:5640:1: rule__EnumerationValueType__Group_3_2_3__1 : rule__EnumerationValueType__Group_3_2_3__1__Impl ;
    public final void rule__EnumerationValueType__Group_3_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5644:1: ( rule__EnumerationValueType__Group_3_2_3__1__Impl )
            // InternalQL.g:5645:2: rule__EnumerationValueType__Group_3_2_3__1__Impl
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
    // InternalQL.g:5651:1: rule__EnumerationValueType__Group_3_2_3__1__Impl : ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1 ) ) ;
    public final void rule__EnumerationValueType__Group_3_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5655:1: ( ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1 ) ) )
            // InternalQL.g:5656:1: ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1 ) )
            {
            // InternalQL.g:5656:1: ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1 ) )
            // InternalQL.g:5657:2: ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1 )
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsAssignment_3_2_3_1()); 
            // InternalQL.g:5658:2: ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1 )
            // InternalQL.g:5658:3: rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1
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
    // InternalQL.g:5667:1: rule__StringValueType__Group__0 : rule__StringValueType__Group__0__Impl rule__StringValueType__Group__1 ;
    public final void rule__StringValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5671:1: ( rule__StringValueType__Group__0__Impl rule__StringValueType__Group__1 )
            // InternalQL.g:5672:2: rule__StringValueType__Group__0__Impl rule__StringValueType__Group__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalQL.g:5679:1: rule__StringValueType__Group__0__Impl : ( () ) ;
    public final void rule__StringValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5683:1: ( ( () ) )
            // InternalQL.g:5684:1: ( () )
            {
            // InternalQL.g:5684:1: ( () )
            // InternalQL.g:5685:2: ()
            {
             before(grammarAccess.getStringValueTypeAccess().getStringValueTypeAction_0()); 
            // InternalQL.g:5686:2: ()
            // InternalQL.g:5686:3: 
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
    // InternalQL.g:5694:1: rule__StringValueType__Group__1 : rule__StringValueType__Group__1__Impl rule__StringValueType__Group__2 ;
    public final void rule__StringValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5698:1: ( rule__StringValueType__Group__1__Impl rule__StringValueType__Group__2 )
            // InternalQL.g:5699:2: rule__StringValueType__Group__1__Impl rule__StringValueType__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalQL.g:5706:1: rule__StringValueType__Group__1__Impl : ( 'StringType' ) ;
    public final void rule__StringValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5710:1: ( ( 'StringType' ) )
            // InternalQL.g:5711:1: ( 'StringType' )
            {
            // InternalQL.g:5711:1: ( 'StringType' )
            // InternalQL.g:5712:2: 'StringType'
            {
             before(grammarAccess.getStringValueTypeAccess().getStringTypeKeyword_1()); 
            match(input,63,FOLLOW_2); 
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
    // InternalQL.g:5721:1: rule__StringValueType__Group__2 : rule__StringValueType__Group__2__Impl rule__StringValueType__Group__3 ;
    public final void rule__StringValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5725:1: ( rule__StringValueType__Group__2__Impl rule__StringValueType__Group__3 )
            // InternalQL.g:5726:2: rule__StringValueType__Group__2__Impl rule__StringValueType__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalQL.g:5733:1: rule__StringValueType__Group__2__Impl : ( ( rule__StringValueType__NameAssignment_2 ) ) ;
    public final void rule__StringValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5737:1: ( ( ( rule__StringValueType__NameAssignment_2 ) ) )
            // InternalQL.g:5738:1: ( ( rule__StringValueType__NameAssignment_2 ) )
            {
            // InternalQL.g:5738:1: ( ( rule__StringValueType__NameAssignment_2 ) )
            // InternalQL.g:5739:2: ( rule__StringValueType__NameAssignment_2 )
            {
             before(grammarAccess.getStringValueTypeAccess().getNameAssignment_2()); 
            // InternalQL.g:5740:2: ( rule__StringValueType__NameAssignment_2 )
            // InternalQL.g:5740:3: rule__StringValueType__NameAssignment_2
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
    // InternalQL.g:5748:1: rule__StringValueType__Group__3 : rule__StringValueType__Group__3__Impl ;
    public final void rule__StringValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5752:1: ( rule__StringValueType__Group__3__Impl )
            // InternalQL.g:5753:2: rule__StringValueType__Group__3__Impl
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
    // InternalQL.g:5759:1: rule__StringValueType__Group__3__Impl : ( ( rule__StringValueType__Group_3__0 )? ) ;
    public final void rule__StringValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5763:1: ( ( ( rule__StringValueType__Group_3__0 )? ) )
            // InternalQL.g:5764:1: ( ( rule__StringValueType__Group_3__0 )? )
            {
            // InternalQL.g:5764:1: ( ( rule__StringValueType__Group_3__0 )? )
            // InternalQL.g:5765:2: ( rule__StringValueType__Group_3__0 )?
            {
             before(grammarAccess.getStringValueTypeAccess().getGroup_3()); 
            // InternalQL.g:5766:2: ( rule__StringValueType__Group_3__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==41) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalQL.g:5766:3: rule__StringValueType__Group_3__0
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
    // InternalQL.g:5775:1: rule__StringValueType__Group_3__0 : rule__StringValueType__Group_3__0__Impl rule__StringValueType__Group_3__1 ;
    public final void rule__StringValueType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5779:1: ( rule__StringValueType__Group_3__0__Impl rule__StringValueType__Group_3__1 )
            // InternalQL.g:5780:2: rule__StringValueType__Group_3__0__Impl rule__StringValueType__Group_3__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalQL.g:5787:1: rule__StringValueType__Group_3__0__Impl : ( '{' ) ;
    public final void rule__StringValueType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5791:1: ( ( '{' ) )
            // InternalQL.g:5792:1: ( '{' )
            {
            // InternalQL.g:5792:1: ( '{' )
            // InternalQL.g:5793:2: '{'
            {
             before(grammarAccess.getStringValueTypeAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalQL.g:5802:1: rule__StringValueType__Group_3__1 : rule__StringValueType__Group_3__1__Impl rule__StringValueType__Group_3__2 ;
    public final void rule__StringValueType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5806:1: ( rule__StringValueType__Group_3__1__Impl rule__StringValueType__Group_3__2 )
            // InternalQL.g:5807:2: rule__StringValueType__Group_3__1__Impl rule__StringValueType__Group_3__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalQL.g:5814:1: rule__StringValueType__Group_3__1__Impl : ( ( rule__StringValueType__Group_3_1__0 )? ) ;
    public final void rule__StringValueType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5818:1: ( ( ( rule__StringValueType__Group_3_1__0 )? ) )
            // InternalQL.g:5819:1: ( ( rule__StringValueType__Group_3_1__0 )? )
            {
            // InternalQL.g:5819:1: ( ( rule__StringValueType__Group_3_1__0 )? )
            // InternalQL.g:5820:2: ( rule__StringValueType__Group_3_1__0 )?
            {
             before(grammarAccess.getStringValueTypeAccess().getGroup_3_1()); 
            // InternalQL.g:5821:2: ( rule__StringValueType__Group_3_1__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==53) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalQL.g:5821:3: rule__StringValueType__Group_3_1__0
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
    // InternalQL.g:5829:1: rule__StringValueType__Group_3__2 : rule__StringValueType__Group_3__2__Impl ;
    public final void rule__StringValueType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5833:1: ( rule__StringValueType__Group_3__2__Impl )
            // InternalQL.g:5834:2: rule__StringValueType__Group_3__2__Impl
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
    // InternalQL.g:5840:1: rule__StringValueType__Group_3__2__Impl : ( '}' ) ;
    public final void rule__StringValueType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5844:1: ( ( '}' ) )
            // InternalQL.g:5845:1: ( '}' )
            {
            // InternalQL.g:5845:1: ( '}' )
            // InternalQL.g:5846:2: '}'
            {
             before(grammarAccess.getStringValueTypeAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,42,FOLLOW_2); 
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
    // InternalQL.g:5856:1: rule__StringValueType__Group_3_1__0 : rule__StringValueType__Group_3_1__0__Impl rule__StringValueType__Group_3_1__1 ;
    public final void rule__StringValueType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5860:1: ( rule__StringValueType__Group_3_1__0__Impl rule__StringValueType__Group_3_1__1 )
            // InternalQL.g:5861:2: rule__StringValueType__Group_3_1__0__Impl rule__StringValueType__Group_3_1__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalQL.g:5868:1: rule__StringValueType__Group_3_1__0__Impl : ( 'unit' ) ;
    public final void rule__StringValueType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5872:1: ( ( 'unit' ) )
            // InternalQL.g:5873:1: ( 'unit' )
            {
            // InternalQL.g:5873:1: ( 'unit' )
            // InternalQL.g:5874:2: 'unit'
            {
             before(grammarAccess.getStringValueTypeAccess().getUnitKeyword_3_1_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalQL.g:5883:1: rule__StringValueType__Group_3_1__1 : rule__StringValueType__Group_3_1__1__Impl ;
    public final void rule__StringValueType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5887:1: ( rule__StringValueType__Group_3_1__1__Impl )
            // InternalQL.g:5888:2: rule__StringValueType__Group_3_1__1__Impl
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
    // InternalQL.g:5894:1: rule__StringValueType__Group_3_1__1__Impl : ( ( rule__StringValueType__UnitAssignment_3_1_1 ) ) ;
    public final void rule__StringValueType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5898:1: ( ( ( rule__StringValueType__UnitAssignment_3_1_1 ) ) )
            // InternalQL.g:5899:1: ( ( rule__StringValueType__UnitAssignment_3_1_1 ) )
            {
            // InternalQL.g:5899:1: ( ( rule__StringValueType__UnitAssignment_3_1_1 ) )
            // InternalQL.g:5900:2: ( rule__StringValueType__UnitAssignment_3_1_1 )
            {
             before(grammarAccess.getStringValueTypeAccess().getUnitAssignment_3_1_1()); 
            // InternalQL.g:5901:2: ( rule__StringValueType__UnitAssignment_3_1_1 )
            // InternalQL.g:5901:3: rule__StringValueType__UnitAssignment_3_1_1
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
    // InternalQL.g:5910:1: rule__EnumerationLiteral__Group__0 : rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 ;
    public final void rule__EnumerationLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5914:1: ( rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 )
            // InternalQL.g:5915:2: rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalQL.g:5922:1: rule__EnumerationLiteral__Group__0__Impl : ( () ) ;
    public final void rule__EnumerationLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5926:1: ( ( () ) )
            // InternalQL.g:5927:1: ( () )
            {
            // InternalQL.g:5927:1: ( () )
            // InternalQL.g:5928:2: ()
            {
             before(grammarAccess.getEnumerationLiteralAccess().getEnumerationLiteralAction_0()); 
            // InternalQL.g:5929:2: ()
            // InternalQL.g:5929:3: 
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
    // InternalQL.g:5937:1: rule__EnumerationLiteral__Group__1 : rule__EnumerationLiteral__Group__1__Impl ;
    public final void rule__EnumerationLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5941:1: ( rule__EnumerationLiteral__Group__1__Impl )
            // InternalQL.g:5942:2: rule__EnumerationLiteral__Group__1__Impl
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
    // InternalQL.g:5948:1: rule__EnumerationLiteral__Group__1__Impl : ( ( rule__EnumerationLiteral__NameAssignment_1 ) ) ;
    public final void rule__EnumerationLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5952:1: ( ( ( rule__EnumerationLiteral__NameAssignment_1 ) ) )
            // InternalQL.g:5953:1: ( ( rule__EnumerationLiteral__NameAssignment_1 ) )
            {
            // InternalQL.g:5953:1: ( ( rule__EnumerationLiteral__NameAssignment_1 ) )
            // InternalQL.g:5954:2: ( rule__EnumerationLiteral__NameAssignment_1 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_1()); 
            // InternalQL.g:5955:2: ( rule__EnumerationLiteral__NameAssignment_1 )
            // InternalQL.g:5955:3: rule__EnumerationLiteral__NameAssignment_1
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
    // InternalQL.g:5964:1: rule__IntegerValue__Group__0 : rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1 ;
    public final void rule__IntegerValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5968:1: ( rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1 )
            // InternalQL.g:5969:2: rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalQL.g:5976:1: rule__IntegerValue__Group__0__Impl : ( () ) ;
    public final void rule__IntegerValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5980:1: ( ( () ) )
            // InternalQL.g:5981:1: ( () )
            {
            // InternalQL.g:5981:1: ( () )
            // InternalQL.g:5982:2: ()
            {
             before(grammarAccess.getIntegerValueAccess().getIntegerValueAction_0()); 
            // InternalQL.g:5983:2: ()
            // InternalQL.g:5983:3: 
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
    // InternalQL.g:5991:1: rule__IntegerValue__Group__1 : rule__IntegerValue__Group__1__Impl ;
    public final void rule__IntegerValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5995:1: ( rule__IntegerValue__Group__1__Impl )
            // InternalQL.g:5996:2: rule__IntegerValue__Group__1__Impl
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
    // InternalQL.g:6002:1: rule__IntegerValue__Group__1__Impl : ( ( rule__IntegerValue__IntValueAssignment_1 ) ) ;
    public final void rule__IntegerValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6006:1: ( ( ( rule__IntegerValue__IntValueAssignment_1 ) ) )
            // InternalQL.g:6007:1: ( ( rule__IntegerValue__IntValueAssignment_1 ) )
            {
            // InternalQL.g:6007:1: ( ( rule__IntegerValue__IntValueAssignment_1 ) )
            // InternalQL.g:6008:2: ( rule__IntegerValue__IntValueAssignment_1 )
            {
             before(grammarAccess.getIntegerValueAccess().getIntValueAssignment_1()); 
            // InternalQL.g:6009:2: ( rule__IntegerValue__IntValueAssignment_1 )
            // InternalQL.g:6009:3: rule__IntegerValue__IntValueAssignment_1
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
    // InternalQL.g:6018:1: rule__StringValue__Group__0 : rule__StringValue__Group__0__Impl rule__StringValue__Group__1 ;
    public final void rule__StringValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6022:1: ( rule__StringValue__Group__0__Impl rule__StringValue__Group__1 )
            // InternalQL.g:6023:2: rule__StringValue__Group__0__Impl rule__StringValue__Group__1
            {
            pushFollow(FOLLOW_52);
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
    // InternalQL.g:6030:1: rule__StringValue__Group__0__Impl : ( () ) ;
    public final void rule__StringValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6034:1: ( ( () ) )
            // InternalQL.g:6035:1: ( () )
            {
            // InternalQL.g:6035:1: ( () )
            // InternalQL.g:6036:2: ()
            {
             before(grammarAccess.getStringValueAccess().getStringValueAction_0()); 
            // InternalQL.g:6037:2: ()
            // InternalQL.g:6037:3: 
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
    // InternalQL.g:6045:1: rule__StringValue__Group__1 : rule__StringValue__Group__1__Impl ;
    public final void rule__StringValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6049:1: ( rule__StringValue__Group__1__Impl )
            // InternalQL.g:6050:2: rule__StringValue__Group__1__Impl
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
    // InternalQL.g:6056:1: rule__StringValue__Group__1__Impl : ( ( rule__StringValue__StringValueAssignment_1 ) ) ;
    public final void rule__StringValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6060:1: ( ( ( rule__StringValue__StringValueAssignment_1 ) ) )
            // InternalQL.g:6061:1: ( ( rule__StringValue__StringValueAssignment_1 ) )
            {
            // InternalQL.g:6061:1: ( ( rule__StringValue__StringValueAssignment_1 ) )
            // InternalQL.g:6062:2: ( rule__StringValue__StringValueAssignment_1 )
            {
             before(grammarAccess.getStringValueAccess().getStringValueAssignment_1()); 
            // InternalQL.g:6063:2: ( rule__StringValue__StringValueAssignment_1 )
            // InternalQL.g:6063:3: rule__StringValue__StringValueAssignment_1
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
    // InternalQL.g:6072:1: rule__BooleanValue__Group__0 : rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1 ;
    public final void rule__BooleanValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6076:1: ( rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1 )
            // InternalQL.g:6077:2: rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1
            {
            pushFollow(FOLLOW_53);
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
    // InternalQL.g:6084:1: rule__BooleanValue__Group__0__Impl : ( () ) ;
    public final void rule__BooleanValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6088:1: ( ( () ) )
            // InternalQL.g:6089:1: ( () )
            {
            // InternalQL.g:6089:1: ( () )
            // InternalQL.g:6090:2: ()
            {
             before(grammarAccess.getBooleanValueAccess().getBooleanValueAction_0()); 
            // InternalQL.g:6091:2: ()
            // InternalQL.g:6091:3: 
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
    // InternalQL.g:6099:1: rule__BooleanValue__Group__1 : rule__BooleanValue__Group__1__Impl ;
    public final void rule__BooleanValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6103:1: ( rule__BooleanValue__Group__1__Impl )
            // InternalQL.g:6104:2: rule__BooleanValue__Group__1__Impl
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
    // InternalQL.g:6110:1: rule__BooleanValue__Group__1__Impl : ( ( rule__BooleanValue__BooleanValueAssignment_1 ) ) ;
    public final void rule__BooleanValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6114:1: ( ( ( rule__BooleanValue__BooleanValueAssignment_1 ) ) )
            // InternalQL.g:6115:1: ( ( rule__BooleanValue__BooleanValueAssignment_1 ) )
            {
            // InternalQL.g:6115:1: ( ( rule__BooleanValue__BooleanValueAssignment_1 ) )
            // InternalQL.g:6116:2: ( rule__BooleanValue__BooleanValueAssignment_1 )
            {
             before(grammarAccess.getBooleanValueAccess().getBooleanValueAssignment_1()); 
            // InternalQL.g:6117:2: ( rule__BooleanValue__BooleanValueAssignment_1 )
            // InternalQL.g:6117:3: rule__BooleanValue__BooleanValueAssignment_1
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
    // InternalQL.g:6126:1: rule__EnumerationCall__Group__0 : rule__EnumerationCall__Group__0__Impl rule__EnumerationCall__Group__1 ;
    public final void rule__EnumerationCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6130:1: ( rule__EnumerationCall__Group__0__Impl rule__EnumerationCall__Group__1 )
            // InternalQL.g:6131:2: rule__EnumerationCall__Group__0__Impl rule__EnumerationCall__Group__1
            {
            pushFollow(FOLLOW_54);
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
    // InternalQL.g:6138:1: rule__EnumerationCall__Group__0__Impl : ( () ) ;
    public final void rule__EnumerationCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6142:1: ( ( () ) )
            // InternalQL.g:6143:1: ( () )
            {
            // InternalQL.g:6143:1: ( () )
            // InternalQL.g:6144:2: ()
            {
             before(grammarAccess.getEnumerationCallAccess().getEnumerationCallAction_0()); 
            // InternalQL.g:6145:2: ()
            // InternalQL.g:6145:3: 
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
    // InternalQL.g:6153:1: rule__EnumerationCall__Group__1 : rule__EnumerationCall__Group__1__Impl ;
    public final void rule__EnumerationCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6157:1: ( rule__EnumerationCall__Group__1__Impl )
            // InternalQL.g:6158:2: rule__EnumerationCall__Group__1__Impl
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
    // InternalQL.g:6164:1: rule__EnumerationCall__Group__1__Impl : ( ( rule__EnumerationCall__EnumerationLiteralAssignment_1 ) ) ;
    public final void rule__EnumerationCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6168:1: ( ( ( rule__EnumerationCall__EnumerationLiteralAssignment_1 ) ) )
            // InternalQL.g:6169:1: ( ( rule__EnumerationCall__EnumerationLiteralAssignment_1 ) )
            {
            // InternalQL.g:6169:1: ( ( rule__EnumerationCall__EnumerationLiteralAssignment_1 ) )
            // InternalQL.g:6170:2: ( rule__EnumerationCall__EnumerationLiteralAssignment_1 )
            {
             before(grammarAccess.getEnumerationCallAccess().getEnumerationLiteralAssignment_1()); 
            // InternalQL.g:6171:2: ( rule__EnumerationCall__EnumerationLiteralAssignment_1 )
            // InternalQL.g:6171:3: rule__EnumerationCall__EnumerationLiteralAssignment_1
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
    // InternalQL.g:6180:1: rule__DateValue__Group__0 : rule__DateValue__Group__0__Impl rule__DateValue__Group__1 ;
    public final void rule__DateValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6184:1: ( rule__DateValue__Group__0__Impl rule__DateValue__Group__1 )
            // InternalQL.g:6185:2: rule__DateValue__Group__0__Impl rule__DateValue__Group__1
            {
            pushFollow(FOLLOW_55);
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
    // InternalQL.g:6192:1: rule__DateValue__Group__0__Impl : ( () ) ;
    public final void rule__DateValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6196:1: ( ( () ) )
            // InternalQL.g:6197:1: ( () )
            {
            // InternalQL.g:6197:1: ( () )
            // InternalQL.g:6198:2: ()
            {
             before(grammarAccess.getDateValueAccess().getDateValueAction_0()); 
            // InternalQL.g:6199:2: ()
            // InternalQL.g:6199:3: 
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
    // InternalQL.g:6207:1: rule__DateValue__Group__1 : rule__DateValue__Group__1__Impl rule__DateValue__Group__2 ;
    public final void rule__DateValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6211:1: ( rule__DateValue__Group__1__Impl rule__DateValue__Group__2 )
            // InternalQL.g:6212:2: rule__DateValue__Group__1__Impl rule__DateValue__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalQL.g:6219:1: rule__DateValue__Group__1__Impl : ( 'DateValue' ) ;
    public final void rule__DateValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6223:1: ( ( 'DateValue' ) )
            // InternalQL.g:6224:1: ( 'DateValue' )
            {
            // InternalQL.g:6224:1: ( 'DateValue' )
            // InternalQL.g:6225:2: 'DateValue'
            {
             before(grammarAccess.getDateValueAccess().getDateValueKeyword_1()); 
            match(input,64,FOLLOW_2); 
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
    // InternalQL.g:6234:1: rule__DateValue__Group__2 : rule__DateValue__Group__2__Impl rule__DateValue__Group__3 ;
    public final void rule__DateValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6238:1: ( rule__DateValue__Group__2__Impl rule__DateValue__Group__3 )
            // InternalQL.g:6239:2: rule__DateValue__Group__2__Impl rule__DateValue__Group__3
            {
            pushFollow(FOLLOW_56);
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
    // InternalQL.g:6246:1: rule__DateValue__Group__2__Impl : ( '{' ) ;
    public final void rule__DateValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6250:1: ( ( '{' ) )
            // InternalQL.g:6251:1: ( '{' )
            {
            // InternalQL.g:6251:1: ( '{' )
            // InternalQL.g:6252:2: '{'
            {
             before(grammarAccess.getDateValueAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,41,FOLLOW_2); 
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
    // InternalQL.g:6261:1: rule__DateValue__Group__3 : rule__DateValue__Group__3__Impl rule__DateValue__Group__4 ;
    public final void rule__DateValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6265:1: ( rule__DateValue__Group__3__Impl rule__DateValue__Group__4 )
            // InternalQL.g:6266:2: rule__DateValue__Group__3__Impl rule__DateValue__Group__4
            {
            pushFollow(FOLLOW_56);
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
    // InternalQL.g:6273:1: rule__DateValue__Group__3__Impl : ( ( rule__DateValue__Group_3__0 )? ) ;
    public final void rule__DateValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6277:1: ( ( ( rule__DateValue__Group_3__0 )? ) )
            // InternalQL.g:6278:1: ( ( rule__DateValue__Group_3__0 )? )
            {
            // InternalQL.g:6278:1: ( ( rule__DateValue__Group_3__0 )? )
            // InternalQL.g:6279:2: ( rule__DateValue__Group_3__0 )?
            {
             before(grammarAccess.getDateValueAccess().getGroup_3()); 
            // InternalQL.g:6280:2: ( rule__DateValue__Group_3__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==65) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalQL.g:6280:3: rule__DateValue__Group_3__0
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
    // InternalQL.g:6288:1: rule__DateValue__Group__4 : rule__DateValue__Group__4__Impl ;
    public final void rule__DateValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6292:1: ( rule__DateValue__Group__4__Impl )
            // InternalQL.g:6293:2: rule__DateValue__Group__4__Impl
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
    // InternalQL.g:6299:1: rule__DateValue__Group__4__Impl : ( '}' ) ;
    public final void rule__DateValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6303:1: ( ( '}' ) )
            // InternalQL.g:6304:1: ( '}' )
            {
            // InternalQL.g:6304:1: ( '}' )
            // InternalQL.g:6305:2: '}'
            {
             before(grammarAccess.getDateValueAccess().getRightCurlyBracketKeyword_4()); 
            match(input,42,FOLLOW_2); 
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
    // InternalQL.g:6315:1: rule__DateValue__Group_3__0 : rule__DateValue__Group_3__0__Impl rule__DateValue__Group_3__1 ;
    public final void rule__DateValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6319:1: ( rule__DateValue__Group_3__0__Impl rule__DateValue__Group_3__1 )
            // InternalQL.g:6320:2: rule__DateValue__Group_3__0__Impl rule__DateValue__Group_3__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalQL.g:6327:1: rule__DateValue__Group_3__0__Impl : ( 'dateValue' ) ;
    public final void rule__DateValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6331:1: ( ( 'dateValue' ) )
            // InternalQL.g:6332:1: ( 'dateValue' )
            {
            // InternalQL.g:6332:1: ( 'dateValue' )
            // InternalQL.g:6333:2: 'dateValue'
            {
             before(grammarAccess.getDateValueAccess().getDateValueKeyword_3_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalQL.g:6342:1: rule__DateValue__Group_3__1 : rule__DateValue__Group_3__1__Impl ;
    public final void rule__DateValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6346:1: ( rule__DateValue__Group_3__1__Impl )
            // InternalQL.g:6347:2: rule__DateValue__Group_3__1__Impl
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
    // InternalQL.g:6353:1: rule__DateValue__Group_3__1__Impl : ( ( rule__DateValue__DateValueAssignment_3_1 ) ) ;
    public final void rule__DateValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6357:1: ( ( ( rule__DateValue__DateValueAssignment_3_1 ) ) )
            // InternalQL.g:6358:1: ( ( rule__DateValue__DateValueAssignment_3_1 ) )
            {
            // InternalQL.g:6358:1: ( ( rule__DateValue__DateValueAssignment_3_1 ) )
            // InternalQL.g:6359:2: ( rule__DateValue__DateValueAssignment_3_1 )
            {
             before(grammarAccess.getDateValueAccess().getDateValueAssignment_3_1()); 
            // InternalQL.g:6360:2: ( rule__DateValue__DateValueAssignment_3_1 )
            // InternalQL.g:6360:3: rule__DateValue__DateValueAssignment_3_1
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
    // InternalQL.g:6369:1: rule__DecimalValue__Group__0 : rule__DecimalValue__Group__0__Impl rule__DecimalValue__Group__1 ;
    public final void rule__DecimalValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6373:1: ( rule__DecimalValue__Group__0__Impl rule__DecimalValue__Group__1 )
            // InternalQL.g:6374:2: rule__DecimalValue__Group__0__Impl rule__DecimalValue__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalQL.g:6381:1: rule__DecimalValue__Group__0__Impl : ( () ) ;
    public final void rule__DecimalValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6385:1: ( ( () ) )
            // InternalQL.g:6386:1: ( () )
            {
            // InternalQL.g:6386:1: ( () )
            // InternalQL.g:6387:2: ()
            {
             before(grammarAccess.getDecimalValueAccess().getDecimalValueAction_0()); 
            // InternalQL.g:6388:2: ()
            // InternalQL.g:6388:3: 
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
    // InternalQL.g:6396:1: rule__DecimalValue__Group__1 : rule__DecimalValue__Group__1__Impl ;
    public final void rule__DecimalValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6400:1: ( rule__DecimalValue__Group__1__Impl )
            // InternalQL.g:6401:2: rule__DecimalValue__Group__1__Impl
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
    // InternalQL.g:6407:1: rule__DecimalValue__Group__1__Impl : ( ( rule__DecimalValue__DecimalValueAssignment_1 ) ) ;
    public final void rule__DecimalValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6411:1: ( ( ( rule__DecimalValue__DecimalValueAssignment_1 ) ) )
            // InternalQL.g:6412:1: ( ( rule__DecimalValue__DecimalValueAssignment_1 ) )
            {
            // InternalQL.g:6412:1: ( ( rule__DecimalValue__DecimalValueAssignment_1 ) )
            // InternalQL.g:6413:2: ( rule__DecimalValue__DecimalValueAssignment_1 )
            {
             before(grammarAccess.getDecimalValueAccess().getDecimalValueAssignment_1()); 
            // InternalQL.g:6414:2: ( rule__DecimalValue__DecimalValueAssignment_1 )
            // InternalQL.g:6414:3: rule__DecimalValue__DecimalValueAssignment_1
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


    // $ANTLR start "rule__EFloat__Group__0"
    // InternalQL.g:6423:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6427:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalQL.g:6428:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__EFloat__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__0"


    // $ANTLR start "rule__EFloat__Group__0__Impl"
    // InternalQL.g:6435:1: rule__EFloat__Group__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6439:1: ( ( ( RULE_INT )? ) )
            // InternalQL.g:6440:1: ( ( RULE_INT )? )
            {
            // InternalQL.g:6440:1: ( ( RULE_INT )? )
            // InternalQL.g:6441:2: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_0()); 
            // InternalQL.g:6442:2: ( RULE_INT )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_INT) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalQL.g:6442:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__0__Impl"


    // $ANTLR start "rule__EFloat__Group__1"
    // InternalQL.g:6450:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6454:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalQL.g:6455:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FOLLOW_44);
            rule__EFloat__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__1"


    // $ANTLR start "rule__EFloat__Group__1__Impl"
    // InternalQL.g:6462:1: rule__EFloat__Group__1__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6466:1: ( ( '.' ) )
            // InternalQL.g:6467:1: ( '.' )
            {
            // InternalQL.g:6467:1: ( '.' )
            // InternalQL.g:6468:2: '.'
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_1()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__1__Impl"


    // $ANTLR start "rule__EFloat__Group__2"
    // InternalQL.g:6477:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl rule__EFloat__Group__3 ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6481:1: ( rule__EFloat__Group__2__Impl rule__EFloat__Group__3 )
            // InternalQL.g:6482:2: rule__EFloat__Group__2__Impl rule__EFloat__Group__3
            {
            pushFollow(FOLLOW_57);
            rule__EFloat__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__2"


    // $ANTLR start "rule__EFloat__Group__2__Impl"
    // InternalQL.g:6489:1: rule__EFloat__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6493:1: ( ( RULE_INT ) )
            // InternalQL.g:6494:1: ( RULE_INT )
            {
            // InternalQL.g:6494:1: ( RULE_INT )
            // InternalQL.g:6495:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__2__Impl"


    // $ANTLR start "rule__EFloat__Group__3"
    // InternalQL.g:6504:1: rule__EFloat__Group__3 : rule__EFloat__Group__3__Impl ;
    public final void rule__EFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6508:1: ( rule__EFloat__Group__3__Impl )
            // InternalQL.g:6509:2: rule__EFloat__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__3"


    // $ANTLR start "rule__EFloat__Group__3__Impl"
    // InternalQL.g:6515:1: rule__EFloat__Group__3__Impl : ( ( rule__EFloat__Group_3__0 )? ) ;
    public final void rule__EFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6519:1: ( ( ( rule__EFloat__Group_3__0 )? ) )
            // InternalQL.g:6520:1: ( ( rule__EFloat__Group_3__0 )? )
            {
            // InternalQL.g:6520:1: ( ( rule__EFloat__Group_3__0 )? )
            // InternalQL.g:6521:2: ( rule__EFloat__Group_3__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_3()); 
            // InternalQL.g:6522:2: ( rule__EFloat__Group_3__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=17 && LA52_0<=18)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalQL.g:6522:3: rule__EFloat__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EFloat__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__3__Impl"


    // $ANTLR start "rule__EFloat__Group_3__0"
    // InternalQL.g:6531:1: rule__EFloat__Group_3__0 : rule__EFloat__Group_3__0__Impl rule__EFloat__Group_3__1 ;
    public final void rule__EFloat__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6535:1: ( rule__EFloat__Group_3__0__Impl rule__EFloat__Group_3__1 )
            // InternalQL.g:6536:2: rule__EFloat__Group_3__0__Impl rule__EFloat__Group_3__1
            {
            pushFollow(FOLLOW_58);
            rule__EFloat__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_3__0"


    // $ANTLR start "rule__EFloat__Group_3__0__Impl"
    // InternalQL.g:6543:1: rule__EFloat__Group_3__0__Impl : ( ( rule__EFloat__Alternatives_3_0 ) ) ;
    public final void rule__EFloat__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6547:1: ( ( ( rule__EFloat__Alternatives_3_0 ) ) )
            // InternalQL.g:6548:1: ( ( rule__EFloat__Alternatives_3_0 ) )
            {
            // InternalQL.g:6548:1: ( ( rule__EFloat__Alternatives_3_0 ) )
            // InternalQL.g:6549:2: ( rule__EFloat__Alternatives_3_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_3_0()); 
            // InternalQL.g:6550:2: ( rule__EFloat__Alternatives_3_0 )
            // InternalQL.g:6550:3: rule__EFloat__Alternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Alternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_3__0__Impl"


    // $ANTLR start "rule__EFloat__Group_3__1"
    // InternalQL.g:6558:1: rule__EFloat__Group_3__1 : rule__EFloat__Group_3__1__Impl rule__EFloat__Group_3__2 ;
    public final void rule__EFloat__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6562:1: ( rule__EFloat__Group_3__1__Impl rule__EFloat__Group_3__2 )
            // InternalQL.g:6563:2: rule__EFloat__Group_3__1__Impl rule__EFloat__Group_3__2
            {
            pushFollow(FOLLOW_58);
            rule__EFloat__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_3__1"


    // $ANTLR start "rule__EFloat__Group_3__1__Impl"
    // InternalQL.g:6570:1: rule__EFloat__Group_3__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6574:1: ( ( ( '-' )? ) )
            // InternalQL.g:6575:1: ( ( '-' )? )
            {
            // InternalQL.g:6575:1: ( ( '-' )? )
            // InternalQL.g:6576:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_3_1()); 
            // InternalQL.g:6577:2: ( '-' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==31) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalQL.g:6577:3: '-'
                    {
                    match(input,31,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_3__1__Impl"


    // $ANTLR start "rule__EFloat__Group_3__2"
    // InternalQL.g:6585:1: rule__EFloat__Group_3__2 : rule__EFloat__Group_3__2__Impl ;
    public final void rule__EFloat__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6589:1: ( rule__EFloat__Group_3__2__Impl )
            // InternalQL.g:6590:2: rule__EFloat__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_3__2"


    // $ANTLR start "rule__EFloat__Group_3__2__Impl"
    // InternalQL.g:6596:1: rule__EFloat__Group_3__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6600:1: ( ( RULE_INT ) )
            // InternalQL.g:6601:1: ( RULE_INT )
            {
            // InternalQL.g:6601:1: ( RULE_INT )
            // InternalQL.g:6602:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_3__2__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group__0"
    // InternalQL.g:6612:1: rule__QuestionDefinition__Group__0 : rule__QuestionDefinition__Group__0__Impl rule__QuestionDefinition__Group__1 ;
    public final void rule__QuestionDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6616:1: ( rule__QuestionDefinition__Group__0__Impl rule__QuestionDefinition__Group__1 )
            // InternalQL.g:6617:2: rule__QuestionDefinition__Group__0__Impl rule__QuestionDefinition__Group__1
            {
            pushFollow(FOLLOW_59);
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
    // InternalQL.g:6624:1: rule__QuestionDefinition__Group__0__Impl : ( ( rule__QuestionDefinition__IsMandatoryAssignment_0 )? ) ;
    public final void rule__QuestionDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6628:1: ( ( ( rule__QuestionDefinition__IsMandatoryAssignment_0 )? ) )
            // InternalQL.g:6629:1: ( ( rule__QuestionDefinition__IsMandatoryAssignment_0 )? )
            {
            // InternalQL.g:6629:1: ( ( rule__QuestionDefinition__IsMandatoryAssignment_0 )? )
            // InternalQL.g:6630:2: ( rule__QuestionDefinition__IsMandatoryAssignment_0 )?
            {
             before(grammarAccess.getQuestionDefinitionAccess().getIsMandatoryAssignment_0()); 
            // InternalQL.g:6631:2: ( rule__QuestionDefinition__IsMandatoryAssignment_0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==72) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalQL.g:6631:3: rule__QuestionDefinition__IsMandatoryAssignment_0
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
    // InternalQL.g:6639:1: rule__QuestionDefinition__Group__1 : rule__QuestionDefinition__Group__1__Impl rule__QuestionDefinition__Group__2 ;
    public final void rule__QuestionDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6643:1: ( rule__QuestionDefinition__Group__1__Impl rule__QuestionDefinition__Group__2 )
            // InternalQL.g:6644:2: rule__QuestionDefinition__Group__1__Impl rule__QuestionDefinition__Group__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalQL.g:6651:1: rule__QuestionDefinition__Group__1__Impl : ( 'question' ) ;
    public final void rule__QuestionDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6655:1: ( ( 'question' ) )
            // InternalQL.g:6656:1: ( 'question' )
            {
            // InternalQL.g:6656:1: ( 'question' )
            // InternalQL.g:6657:2: 'question'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getQuestionKeyword_1()); 
            match(input,67,FOLLOW_2); 
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
    // InternalQL.g:6666:1: rule__QuestionDefinition__Group__2 : rule__QuestionDefinition__Group__2__Impl rule__QuestionDefinition__Group__3 ;
    public final void rule__QuestionDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6670:1: ( rule__QuestionDefinition__Group__2__Impl rule__QuestionDefinition__Group__3 )
            // InternalQL.g:6671:2: rule__QuestionDefinition__Group__2__Impl rule__QuestionDefinition__Group__3
            {
            pushFollow(FOLLOW_60);
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
    // InternalQL.g:6678:1: rule__QuestionDefinition__Group__2__Impl : ( ( rule__QuestionDefinition__NameAssignment_2 ) ) ;
    public final void rule__QuestionDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6682:1: ( ( ( rule__QuestionDefinition__NameAssignment_2 ) ) )
            // InternalQL.g:6683:1: ( ( rule__QuestionDefinition__NameAssignment_2 ) )
            {
            // InternalQL.g:6683:1: ( ( rule__QuestionDefinition__NameAssignment_2 ) )
            // InternalQL.g:6684:2: ( rule__QuestionDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getNameAssignment_2()); 
            // InternalQL.g:6685:2: ( rule__QuestionDefinition__NameAssignment_2 )
            // InternalQL.g:6685:3: rule__QuestionDefinition__NameAssignment_2
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
    // InternalQL.g:6693:1: rule__QuestionDefinition__Group__3 : rule__QuestionDefinition__Group__3__Impl rule__QuestionDefinition__Group__4 ;
    public final void rule__QuestionDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6697:1: ( rule__QuestionDefinition__Group__3__Impl rule__QuestionDefinition__Group__4 )
            // InternalQL.g:6698:2: rule__QuestionDefinition__Group__3__Impl rule__QuestionDefinition__Group__4
            {
            pushFollow(FOLLOW_60);
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
    // InternalQL.g:6705:1: rule__QuestionDefinition__Group__3__Impl : ( ( rule__QuestionDefinition__Group_3__0 )? ) ;
    public final void rule__QuestionDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6709:1: ( ( ( rule__QuestionDefinition__Group_3__0 )? ) )
            // InternalQL.g:6710:1: ( ( rule__QuestionDefinition__Group_3__0 )? )
            {
            // InternalQL.g:6710:1: ( ( rule__QuestionDefinition__Group_3__0 )? )
            // InternalQL.g:6711:2: ( rule__QuestionDefinition__Group_3__0 )?
            {
             before(grammarAccess.getQuestionDefinitionAccess().getGroup_3()); 
            // InternalQL.g:6712:2: ( rule__QuestionDefinition__Group_3__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==43) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalQL.g:6712:3: rule__QuestionDefinition__Group_3__0
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
    // InternalQL.g:6720:1: rule__QuestionDefinition__Group__4 : rule__QuestionDefinition__Group__4__Impl rule__QuestionDefinition__Group__5 ;
    public final void rule__QuestionDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6724:1: ( rule__QuestionDefinition__Group__4__Impl rule__QuestionDefinition__Group__5 )
            // InternalQL.g:6725:2: rule__QuestionDefinition__Group__4__Impl rule__QuestionDefinition__Group__5
            {
            pushFollow(FOLLOW_38);
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
    // InternalQL.g:6732:1: rule__QuestionDefinition__Group__4__Impl : ( ':' ) ;
    public final void rule__QuestionDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6736:1: ( ( ':' ) )
            // InternalQL.g:6737:1: ( ':' )
            {
            // InternalQL.g:6737:1: ( ':' )
            // InternalQL.g:6738:2: ':'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getColonKeyword_4()); 
            match(input,68,FOLLOW_2); 
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
    // InternalQL.g:6747:1: rule__QuestionDefinition__Group__5 : rule__QuestionDefinition__Group__5__Impl rule__QuestionDefinition__Group__6 ;
    public final void rule__QuestionDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6751:1: ( rule__QuestionDefinition__Group__5__Impl rule__QuestionDefinition__Group__6 )
            // InternalQL.g:6752:2: rule__QuestionDefinition__Group__5__Impl rule__QuestionDefinition__Group__6
            {
            pushFollow(FOLLOW_38);
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
    // InternalQL.g:6759:1: rule__QuestionDefinition__Group__5__Impl : ( ( rule__QuestionDefinition__LabelAssignment_5 ) ) ;
    public final void rule__QuestionDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6763:1: ( ( ( rule__QuestionDefinition__LabelAssignment_5 ) ) )
            // InternalQL.g:6764:1: ( ( rule__QuestionDefinition__LabelAssignment_5 ) )
            {
            // InternalQL.g:6764:1: ( ( rule__QuestionDefinition__LabelAssignment_5 ) )
            // InternalQL.g:6765:2: ( rule__QuestionDefinition__LabelAssignment_5 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getLabelAssignment_5()); 
            // InternalQL.g:6766:2: ( rule__QuestionDefinition__LabelAssignment_5 )
            // InternalQL.g:6766:3: rule__QuestionDefinition__LabelAssignment_5
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
    // InternalQL.g:6774:1: rule__QuestionDefinition__Group__6 : rule__QuestionDefinition__Group__6__Impl rule__QuestionDefinition__Group__7 ;
    public final void rule__QuestionDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6778:1: ( rule__QuestionDefinition__Group__6__Impl rule__QuestionDefinition__Group__7 )
            // InternalQL.g:6779:2: rule__QuestionDefinition__Group__6__Impl rule__QuestionDefinition__Group__7
            {
            pushFollow(FOLLOW_20);
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
    // InternalQL.g:6786:1: rule__QuestionDefinition__Group__6__Impl : ( ( rule__QuestionDefinition__DataTypeAssignment_6 ) ) ;
    public final void rule__QuestionDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6790:1: ( ( ( rule__QuestionDefinition__DataTypeAssignment_6 ) ) )
            // InternalQL.g:6791:1: ( ( rule__QuestionDefinition__DataTypeAssignment_6 ) )
            {
            // InternalQL.g:6791:1: ( ( rule__QuestionDefinition__DataTypeAssignment_6 ) )
            // InternalQL.g:6792:2: ( rule__QuestionDefinition__DataTypeAssignment_6 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getDataTypeAssignment_6()); 
            // InternalQL.g:6793:2: ( rule__QuestionDefinition__DataTypeAssignment_6 )
            // InternalQL.g:6793:3: rule__QuestionDefinition__DataTypeAssignment_6
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
    // InternalQL.g:6801:1: rule__QuestionDefinition__Group__7 : rule__QuestionDefinition__Group__7__Impl ;
    public final void rule__QuestionDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6805:1: ( rule__QuestionDefinition__Group__7__Impl )
            // InternalQL.g:6806:2: rule__QuestionDefinition__Group__7__Impl
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
    // InternalQL.g:6812:1: rule__QuestionDefinition__Group__7__Impl : ( ( rule__QuestionDefinition__Group_7__0 )? ) ;
    public final void rule__QuestionDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6816:1: ( ( ( rule__QuestionDefinition__Group_7__0 )? ) )
            // InternalQL.g:6817:1: ( ( rule__QuestionDefinition__Group_7__0 )? )
            {
            // InternalQL.g:6817:1: ( ( rule__QuestionDefinition__Group_7__0 )? )
            // InternalQL.g:6818:2: ( rule__QuestionDefinition__Group_7__0 )?
            {
             before(grammarAccess.getQuestionDefinitionAccess().getGroup_7()); 
            // InternalQL.g:6819:2: ( rule__QuestionDefinition__Group_7__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==12) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalQL.g:6819:3: rule__QuestionDefinition__Group_7__0
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
    // InternalQL.g:6828:1: rule__QuestionDefinition__Group_3__0 : rule__QuestionDefinition__Group_3__0__Impl rule__QuestionDefinition__Group_3__1 ;
    public final void rule__QuestionDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6832:1: ( rule__QuestionDefinition__Group_3__0__Impl rule__QuestionDefinition__Group_3__1 )
            // InternalQL.g:6833:2: rule__QuestionDefinition__Group_3__0__Impl rule__QuestionDefinition__Group_3__1
            {
            pushFollow(FOLLOW_61);
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
    // InternalQL.g:6840:1: rule__QuestionDefinition__Group_3__0__Impl : ( '(' ) ;
    public final void rule__QuestionDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6844:1: ( ( '(' ) )
            // InternalQL.g:6845:1: ( '(' )
            {
            // InternalQL.g:6845:1: ( '(' )
            // InternalQL.g:6846:2: '('
            {
             before(grammarAccess.getQuestionDefinitionAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalQL.g:6855:1: rule__QuestionDefinition__Group_3__1 : rule__QuestionDefinition__Group_3__1__Impl rule__QuestionDefinition__Group_3__2 ;
    public final void rule__QuestionDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6859:1: ( rule__QuestionDefinition__Group_3__1__Impl rule__QuestionDefinition__Group_3__2 )
            // InternalQL.g:6860:2: rule__QuestionDefinition__Group_3__1__Impl rule__QuestionDefinition__Group_3__2
            {
            pushFollow(FOLLOW_61);
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
    // InternalQL.g:6867:1: rule__QuestionDefinition__Group_3__1__Impl : ( ( rule__QuestionDefinition__IsDisplayedAssignment_3_1 )? ) ;
    public final void rule__QuestionDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6871:1: ( ( ( rule__QuestionDefinition__IsDisplayedAssignment_3_1 )? ) )
            // InternalQL.g:6872:1: ( ( rule__QuestionDefinition__IsDisplayedAssignment_3_1 )? )
            {
            // InternalQL.g:6872:1: ( ( rule__QuestionDefinition__IsDisplayedAssignment_3_1 )? )
            // InternalQL.g:6873:2: ( rule__QuestionDefinition__IsDisplayedAssignment_3_1 )?
            {
             before(grammarAccess.getQuestionDefinitionAccess().getIsDisplayedAssignment_3_1()); 
            // InternalQL.g:6874:2: ( rule__QuestionDefinition__IsDisplayedAssignment_3_1 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==73) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalQL.g:6874:3: rule__QuestionDefinition__IsDisplayedAssignment_3_1
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
    // InternalQL.g:6882:1: rule__QuestionDefinition__Group_3__2 : rule__QuestionDefinition__Group_3__2__Impl rule__QuestionDefinition__Group_3__3 ;
    public final void rule__QuestionDefinition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6886:1: ( rule__QuestionDefinition__Group_3__2__Impl rule__QuestionDefinition__Group_3__3 )
            // InternalQL.g:6887:2: rule__QuestionDefinition__Group_3__2__Impl rule__QuestionDefinition__Group_3__3
            {
            pushFollow(FOLLOW_61);
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
    // InternalQL.g:6894:1: rule__QuestionDefinition__Group_3__2__Impl : ( ( rule__QuestionDefinition__Group_3_2__0 )? ) ;
    public final void rule__QuestionDefinition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6898:1: ( ( ( rule__QuestionDefinition__Group_3_2__0 )? ) )
            // InternalQL.g:6899:1: ( ( rule__QuestionDefinition__Group_3_2__0 )? )
            {
            // InternalQL.g:6899:1: ( ( rule__QuestionDefinition__Group_3_2__0 )? )
            // InternalQL.g:6900:2: ( rule__QuestionDefinition__Group_3_2__0 )?
            {
             before(grammarAccess.getQuestionDefinitionAccess().getGroup_3_2()); 
            // InternalQL.g:6901:2: ( rule__QuestionDefinition__Group_3_2__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==69) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalQL.g:6901:3: rule__QuestionDefinition__Group_3_2__0
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
    // InternalQL.g:6909:1: rule__QuestionDefinition__Group_3__3 : rule__QuestionDefinition__Group_3__3__Impl ;
    public final void rule__QuestionDefinition__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6913:1: ( rule__QuestionDefinition__Group_3__3__Impl )
            // InternalQL.g:6914:2: rule__QuestionDefinition__Group_3__3__Impl
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
    // InternalQL.g:6920:1: rule__QuestionDefinition__Group_3__3__Impl : ( ')' ) ;
    public final void rule__QuestionDefinition__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6924:1: ( ( ')' ) )
            // InternalQL.g:6925:1: ( ')' )
            {
            // InternalQL.g:6925:1: ( ')' )
            // InternalQL.g:6926:2: ')'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getRightParenthesisKeyword_3_3()); 
            match(input,44,FOLLOW_2); 
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
    // InternalQL.g:6936:1: rule__QuestionDefinition__Group_3_2__0 : rule__QuestionDefinition__Group_3_2__0__Impl rule__QuestionDefinition__Group_3_2__1 ;
    public final void rule__QuestionDefinition__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6940:1: ( rule__QuestionDefinition__Group_3_2__0__Impl rule__QuestionDefinition__Group_3_2__1 )
            // InternalQL.g:6941:2: rule__QuestionDefinition__Group_3_2__0__Impl rule__QuestionDefinition__Group_3_2__1
            {
            pushFollow(FOLLOW_62);
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
    // InternalQL.g:6948:1: rule__QuestionDefinition__Group_3_2__0__Impl : ( 'currentValue' ) ;
    public final void rule__QuestionDefinition__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6952:1: ( ( 'currentValue' ) )
            // InternalQL.g:6953:1: ( 'currentValue' )
            {
            // InternalQL.g:6953:1: ( 'currentValue' )
            // InternalQL.g:6954:2: 'currentValue'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getCurrentValueKeyword_3_2_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalQL.g:6963:1: rule__QuestionDefinition__Group_3_2__1 : rule__QuestionDefinition__Group_3_2__1__Impl ;
    public final void rule__QuestionDefinition__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6967:1: ( rule__QuestionDefinition__Group_3_2__1__Impl )
            // InternalQL.g:6968:2: rule__QuestionDefinition__Group_3_2__1__Impl
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
    // InternalQL.g:6974:1: rule__QuestionDefinition__Group_3_2__1__Impl : ( ( rule__QuestionDefinition__CurrentValueAssignment_3_2_1 ) ) ;
    public final void rule__QuestionDefinition__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6978:1: ( ( ( rule__QuestionDefinition__CurrentValueAssignment_3_2_1 ) ) )
            // InternalQL.g:6979:1: ( ( rule__QuestionDefinition__CurrentValueAssignment_3_2_1 ) )
            {
            // InternalQL.g:6979:1: ( ( rule__QuestionDefinition__CurrentValueAssignment_3_2_1 ) )
            // InternalQL.g:6980:2: ( rule__QuestionDefinition__CurrentValueAssignment_3_2_1 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getCurrentValueAssignment_3_2_1()); 
            // InternalQL.g:6981:2: ( rule__QuestionDefinition__CurrentValueAssignment_3_2_1 )
            // InternalQL.g:6981:3: rule__QuestionDefinition__CurrentValueAssignment_3_2_1
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
    // InternalQL.g:6990:1: rule__QuestionDefinition__Group_7__0 : rule__QuestionDefinition__Group_7__0__Impl rule__QuestionDefinition__Group_7__1 ;
    public final void rule__QuestionDefinition__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6994:1: ( rule__QuestionDefinition__Group_7__0__Impl rule__QuestionDefinition__Group_7__1 )
            // InternalQL.g:6995:2: rule__QuestionDefinition__Group_7__0__Impl rule__QuestionDefinition__Group_7__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalQL.g:7002:1: rule__QuestionDefinition__Group_7__0__Impl : ( '=' ) ;
    public final void rule__QuestionDefinition__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7006:1: ( ( '=' ) )
            // InternalQL.g:7007:1: ( '=' )
            {
            // InternalQL.g:7007:1: ( '=' )
            // InternalQL.g:7008:2: '='
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
    // InternalQL.g:7017:1: rule__QuestionDefinition__Group_7__1 : rule__QuestionDefinition__Group_7__1__Impl rule__QuestionDefinition__Group_7__2 ;
    public final void rule__QuestionDefinition__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7021:1: ( rule__QuestionDefinition__Group_7__1__Impl rule__QuestionDefinition__Group_7__2 )
            // InternalQL.g:7022:2: rule__QuestionDefinition__Group_7__1__Impl rule__QuestionDefinition__Group_7__2
            {
            pushFollow(FOLLOW_63);
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
    // InternalQL.g:7029:1: rule__QuestionDefinition__Group_7__1__Impl : ( ( rule__QuestionDefinition__ComputedExpressionAssignment_7_1 ) ) ;
    public final void rule__QuestionDefinition__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7033:1: ( ( ( rule__QuestionDefinition__ComputedExpressionAssignment_7_1 ) ) )
            // InternalQL.g:7034:1: ( ( rule__QuestionDefinition__ComputedExpressionAssignment_7_1 ) )
            {
            // InternalQL.g:7034:1: ( ( rule__QuestionDefinition__ComputedExpressionAssignment_7_1 ) )
            // InternalQL.g:7035:2: ( rule__QuestionDefinition__ComputedExpressionAssignment_7_1 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getComputedExpressionAssignment_7_1()); 
            // InternalQL.g:7036:2: ( rule__QuestionDefinition__ComputedExpressionAssignment_7_1 )
            // InternalQL.g:7036:3: rule__QuestionDefinition__ComputedExpressionAssignment_7_1
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
    // InternalQL.g:7044:1: rule__QuestionDefinition__Group_7__2 : rule__QuestionDefinition__Group_7__2__Impl ;
    public final void rule__QuestionDefinition__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7048:1: ( rule__QuestionDefinition__Group_7__2__Impl )
            // InternalQL.g:7049:2: rule__QuestionDefinition__Group_7__2__Impl
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
    // InternalQL.g:7055:1: rule__QuestionDefinition__Group_7__2__Impl : ( ';' ) ;
    public final void rule__QuestionDefinition__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7059:1: ( ( ';' ) )
            // InternalQL.g:7060:1: ( ';' )
            {
            // InternalQL.g:7060:1: ( ';' )
            // InternalQL.g:7061:2: ';'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getSemicolonKeyword_7_2()); 
            match(input,70,FOLLOW_2); 
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
    // InternalQL.g:7071:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7075:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalQL.g:7076:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_64);
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
    // InternalQL.g:7083:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7087:1: ( ( RULE_ID ) )
            // InternalQL.g:7088:1: ( RULE_ID )
            {
            // InternalQL.g:7088:1: ( RULE_ID )
            // InternalQL.g:7089:2: RULE_ID
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
    // InternalQL.g:7098:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7102:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalQL.g:7103:2: rule__QualifiedName__Group__1__Impl
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
    // InternalQL.g:7109:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7113:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalQL.g:7114:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalQL.g:7114:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalQL.g:7115:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalQL.g:7116:2: ( rule__QualifiedName__Group_1__0 )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==66) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalQL.g:7116:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_65);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop59;
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
    // InternalQL.g:7125:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7129:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalQL.g:7130:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalQL.g:7137:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7141:1: ( ( '.' ) )
            // InternalQL.g:7142:1: ( '.' )
            {
            // InternalQL.g:7142:1: ( '.' )
            // InternalQL.g:7143:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalQL.g:7152:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7156:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalQL.g:7157:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalQL.g:7163:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7167:1: ( ( RULE_ID ) )
            // InternalQL.g:7168:1: ( RULE_ID )
            {
            // InternalQL.g:7168:1: ( RULE_ID )
            // InternalQL.g:7169:2: RULE_ID
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


    // $ANTLR start "rule__QLModel__CanSubmitAssignment_2_1"
    // InternalQL.g:7179:1: rule__QLModel__CanSubmitAssignment_2_1 : ( ( 'canSubmit' ) ) ;
    public final void rule__QLModel__CanSubmitAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7183:1: ( ( ( 'canSubmit' ) ) )
            // InternalQL.g:7184:2: ( ( 'canSubmit' ) )
            {
            // InternalQL.g:7184:2: ( ( 'canSubmit' ) )
            // InternalQL.g:7185:3: ( 'canSubmit' )
            {
             before(grammarAccess.getQLModelAccess().getCanSubmitCanSubmitKeyword_2_1_0()); 
            // InternalQL.g:7186:3: ( 'canSubmit' )
            // InternalQL.g:7187:4: 'canSubmit'
            {
             before(grammarAccess.getQLModelAccess().getCanSubmitCanSubmitKeyword_2_1_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getQLModelAccess().getCanSubmitCanSubmitKeyword_2_1_0()); 

            }

             after(grammarAccess.getQLModelAccess().getCanSubmitCanSubmitKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__CanSubmitAssignment_2_1"


    // $ANTLR start "rule__QLModel__SubmitDateAssignment_2_2_1"
    // InternalQL.g:7198:1: rule__QLModel__SubmitDateAssignment_2_2_1 : ( ruleEDate ) ;
    public final void rule__QLModel__SubmitDateAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7202:1: ( ( ruleEDate ) )
            // InternalQL.g:7203:2: ( ruleEDate )
            {
            // InternalQL.g:7203:2: ( ruleEDate )
            // InternalQL.g:7204:3: ruleEDate
            {
             before(grammarAccess.getQLModelAccess().getSubmitDateEDateParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDate();

            state._fsp--;

             after(grammarAccess.getQLModelAccess().getSubmitDateEDateParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__SubmitDateAssignment_2_2_1"


    // $ANTLR start "rule__QLModel__DefinitionGroupAssignment_4_0"
    // InternalQL.g:7213:1: rule__QLModel__DefinitionGroupAssignment_4_0 : ( ruleDefinitionGroup ) ;
    public final void rule__QLModel__DefinitionGroupAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7217:1: ( ( ruleDefinitionGroup ) )
            // InternalQL.g:7218:2: ( ruleDefinitionGroup )
            {
            // InternalQL.g:7218:2: ( ruleDefinitionGroup )
            // InternalQL.g:7219:3: ruleDefinitionGroup
            {
             before(grammarAccess.getQLModelAccess().getDefinitionGroupDefinitionGroupParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDefinitionGroup();

            state._fsp--;

             after(grammarAccess.getQLModelAccess().getDefinitionGroupDefinitionGroupParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__DefinitionGroupAssignment_4_0"


    // $ANTLR start "rule__QLModel__FormsAssignment_4_1"
    // InternalQL.g:7228:1: rule__QLModel__FormsAssignment_4_1 : ( ruleForm ) ;
    public final void rule__QLModel__FormsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7232:1: ( ( ruleForm ) )
            // InternalQL.g:7233:2: ( ruleForm )
            {
            // InternalQL.g:7233:2: ( ruleForm )
            // InternalQL.g:7234:3: ruleForm
            {
             before(grammarAccess.getQLModelAccess().getFormsFormParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleForm();

            state._fsp--;

             after(grammarAccess.getQLModelAccess().getFormsFormParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__FormsAssignment_4_1"


    // $ANTLR start "rule__UnaryExpression__OperatorAssignment_1"
    // InternalQL.g:7243:1: rule__UnaryExpression__OperatorAssignment_1 : ( ruleUnaryOperatorKind ) ;
    public final void rule__UnaryExpression__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7247:1: ( ( ruleUnaryOperatorKind ) )
            // InternalQL.g:7248:2: ( ruleUnaryOperatorKind )
            {
            // InternalQL.g:7248:2: ( ruleUnaryOperatorKind )
            // InternalQL.g:7249:3: ruleUnaryOperatorKind
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
    // InternalQL.g:7258:1: rule__UnaryExpression__OperandAssignment_2 : ( ruleUnaryOrPrimaryExpression ) ;
    public final void rule__UnaryExpression__OperandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7262:1: ( ( ruleUnaryOrPrimaryExpression ) )
            // InternalQL.g:7263:2: ( ruleUnaryOrPrimaryExpression )
            {
            // InternalQL.g:7263:2: ( ruleUnaryOrPrimaryExpression )
            // InternalQL.g:7264:3: ruleUnaryOrPrimaryExpression
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
    // InternalQL.g:7273:1: rule__IfExpression__ConditionAssignment_2 : ( ruleExpression ) ;
    public final void rule__IfExpression__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7277:1: ( ( ruleExpression ) )
            // InternalQL.g:7278:2: ( ruleExpression )
            {
            // InternalQL.g:7278:2: ( ruleExpression )
            // InternalQL.g:7279:3: ruleExpression
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
    // InternalQL.g:7288:1: rule__IfExpression__ThenExpressionAssignment_4 : ( ruleExpression ) ;
    public final void rule__IfExpression__ThenExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7292:1: ( ( ruleExpression ) )
            // InternalQL.g:7293:2: ( ruleExpression )
            {
            // InternalQL.g:7293:2: ( ruleExpression )
            // InternalQL.g:7294:3: ruleExpression
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
    // InternalQL.g:7303:1: rule__IfExpression__ElseExpressionAssignment_5_1 : ( ruleExpression ) ;
    public final void rule__IfExpression__ElseExpressionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7307:1: ( ( ruleExpression ) )
            // InternalQL.g:7308:2: ( ruleExpression )
            {
            // InternalQL.g:7308:2: ( ruleExpression )
            // InternalQL.g:7309:3: ruleExpression
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
    // InternalQL.g:7318:1: rule__OrExpression__OperatorAssignment_1_1 : ( ruleOrOperatorKind ) ;
    public final void rule__OrExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7322:1: ( ( ruleOrOperatorKind ) )
            // InternalQL.g:7323:2: ( ruleOrOperatorKind )
            {
            // InternalQL.g:7323:2: ( ruleOrOperatorKind )
            // InternalQL.g:7324:3: ruleOrOperatorKind
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
    // InternalQL.g:7333:1: rule__OrExpression__RhsOperandAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__RhsOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7337:1: ( ( ruleAndExpression ) )
            // InternalQL.g:7338:2: ( ruleAndExpression )
            {
            // InternalQL.g:7338:2: ( ruleAndExpression )
            // InternalQL.g:7339:3: ruleAndExpression
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
    // InternalQL.g:7348:1: rule__AndExpression__OperatorAssignment_1_1 : ( ruleAndOperatorKind ) ;
    public final void rule__AndExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7352:1: ( ( ruleAndOperatorKind ) )
            // InternalQL.g:7353:2: ( ruleAndOperatorKind )
            {
            // InternalQL.g:7353:2: ( ruleAndOperatorKind )
            // InternalQL.g:7354:3: ruleAndOperatorKind
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
    // InternalQL.g:7363:1: rule__AndExpression__RhsOperandAssignment_1_2 : ( ruleEqualExpression ) ;
    public final void rule__AndExpression__RhsOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7367:1: ( ( ruleEqualExpression ) )
            // InternalQL.g:7368:2: ( ruleEqualExpression )
            {
            // InternalQL.g:7368:2: ( ruleEqualExpression )
            // InternalQL.g:7369:3: ruleEqualExpression
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
    // InternalQL.g:7378:1: rule__EqualExpression__OperatorAssignment_1_1 : ( ruleEqualOperatorKind ) ;
    public final void rule__EqualExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7382:1: ( ( ruleEqualOperatorKind ) )
            // InternalQL.g:7383:2: ( ruleEqualOperatorKind )
            {
            // InternalQL.g:7383:2: ( ruleEqualOperatorKind )
            // InternalQL.g:7384:3: ruleEqualOperatorKind
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
    // InternalQL.g:7393:1: rule__EqualExpression__RhsOperandAssignment_1_2 : ( ruleComparisionExpression ) ;
    public final void rule__EqualExpression__RhsOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7397:1: ( ( ruleComparisionExpression ) )
            // InternalQL.g:7398:2: ( ruleComparisionExpression )
            {
            // InternalQL.g:7398:2: ( ruleComparisionExpression )
            // InternalQL.g:7399:3: ruleComparisionExpression
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
    // InternalQL.g:7408:1: rule__ComparisionExpression__OperatorAssignment_1_1 : ( ruleComparisionOperatorKind ) ;
    public final void rule__ComparisionExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7412:1: ( ( ruleComparisionOperatorKind ) )
            // InternalQL.g:7413:2: ( ruleComparisionOperatorKind )
            {
            // InternalQL.g:7413:2: ( ruleComparisionOperatorKind )
            // InternalQL.g:7414:3: ruleComparisionOperatorKind
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
    // InternalQL.g:7423:1: rule__ComparisionExpression__RhsOperandAssignment_1_2 : ( ruleAdditionExpression ) ;
    public final void rule__ComparisionExpression__RhsOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7427:1: ( ( ruleAdditionExpression ) )
            // InternalQL.g:7428:2: ( ruleAdditionExpression )
            {
            // InternalQL.g:7428:2: ( ruleAdditionExpression )
            // InternalQL.g:7429:3: ruleAdditionExpression
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
    // InternalQL.g:7438:1: rule__AdditionExpression__OperatorAssignment_1_1 : ( ruleAdditionOperatorKind ) ;
    public final void rule__AdditionExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7442:1: ( ( ruleAdditionOperatorKind ) )
            // InternalQL.g:7443:2: ( ruleAdditionOperatorKind )
            {
            // InternalQL.g:7443:2: ( ruleAdditionOperatorKind )
            // InternalQL.g:7444:3: ruleAdditionOperatorKind
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
    // InternalQL.g:7453:1: rule__AdditionExpression__RhsOperandAssignment_1_2 : ( ruleMultiplicationExpression ) ;
    public final void rule__AdditionExpression__RhsOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7457:1: ( ( ruleMultiplicationExpression ) )
            // InternalQL.g:7458:2: ( ruleMultiplicationExpression )
            {
            // InternalQL.g:7458:2: ( ruleMultiplicationExpression )
            // InternalQL.g:7459:3: ruleMultiplicationExpression
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
    // InternalQL.g:7468:1: rule__MultiplicationExpression__OperatorAssignment_1_1 : ( ruleMultiplicationOperatorKind ) ;
    public final void rule__MultiplicationExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7472:1: ( ( ruleMultiplicationOperatorKind ) )
            // InternalQL.g:7473:2: ( ruleMultiplicationOperatorKind )
            {
            // InternalQL.g:7473:2: ( ruleMultiplicationOperatorKind )
            // InternalQL.g:7474:3: ruleMultiplicationOperatorKind
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
    // InternalQL.g:7483:1: rule__MultiplicationExpression__RhsOperandAssignment_1_2 : ( ruleUnaryOrPrimaryExpression ) ;
    public final void rule__MultiplicationExpression__RhsOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7487:1: ( ( ruleUnaryOrPrimaryExpression ) )
            // InternalQL.g:7488:2: ( ruleUnaryOrPrimaryExpression )
            {
            // InternalQL.g:7488:2: ( ruleUnaryOrPrimaryExpression )
            // InternalQL.g:7489:3: ruleUnaryOrPrimaryExpression
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
    // InternalQL.g:7498:1: rule__Form__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Form__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7502:1: ( ( RULE_ID ) )
            // InternalQL.g:7503:2: ( RULE_ID )
            {
            // InternalQL.g:7503:2: ( RULE_ID )
            // InternalQL.g:7504:3: RULE_ID
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
    // InternalQL.g:7513:1: rule__Form__QuestionGroupAssignment_2 : ( ruleQuestionGroup ) ;
    public final void rule__Form__QuestionGroupAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7517:1: ( ( ruleQuestionGroup ) )
            // InternalQL.g:7518:2: ( ruleQuestionGroup )
            {
            // InternalQL.g:7518:2: ( ruleQuestionGroup )
            // InternalQL.g:7519:3: ruleQuestionGroup
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
    // InternalQL.g:7528:1: rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0 : ( ruleQuestionDefinition ) ;
    public final void rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7532:1: ( ( ruleQuestionDefinition ) )
            // InternalQL.g:7533:2: ( ruleQuestionDefinition )
            {
            // InternalQL.g:7533:2: ( ruleQuestionDefinition )
            // InternalQL.g:7534:3: ruleQuestionDefinition
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
    // InternalQL.g:7543:1: rule__DefinitionGroup__DataTypesAssignment_3_1 : ( ruleValueType ) ;
    public final void rule__DefinitionGroup__DataTypesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7547:1: ( ( ruleValueType ) )
            // InternalQL.g:7548:2: ( ruleValueType )
            {
            // InternalQL.g:7548:2: ( ruleValueType )
            // InternalQL.g:7549:3: ruleValueType
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
    // InternalQL.g:7558:1: rule__QuestionGroup__GuardAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__QuestionGroup__GuardAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7562:1: ( ( ruleExpression ) )
            // InternalQL.g:7563:2: ( ruleExpression )
            {
            // InternalQL.g:7563:2: ( ruleExpression )
            // InternalQL.g:7564:3: ruleExpression
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
    // InternalQL.g:7573:1: rule__QuestionGroup__QuestionGroupsAssignment_3_0 : ( ruleQuestionGroup ) ;
    public final void rule__QuestionGroup__QuestionGroupsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7577:1: ( ( ruleQuestionGroup ) )
            // InternalQL.g:7578:2: ( ruleQuestionGroup )
            {
            // InternalQL.g:7578:2: ( ruleQuestionGroup )
            // InternalQL.g:7579:3: ruleQuestionGroup
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
    // InternalQL.g:7588:1: rule__QuestionGroup__QuestionsAssignment_3_1 : ( ruleQuestion ) ;
    public final void rule__QuestionGroup__QuestionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7592:1: ( ( ruleQuestion ) )
            // InternalQL.g:7593:2: ( ruleQuestion )
            {
            // InternalQL.g:7593:2: ( ruleQuestion )
            // InternalQL.g:7594:3: ruleQuestion
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
    // InternalQL.g:7603:1: rule__Question__QuestionDefinitionAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__Question__QuestionDefinitionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7607:1: ( ( ( ruleQualifiedName ) ) )
            // InternalQL.g:7608:2: ( ( ruleQualifiedName ) )
            {
            // InternalQL.g:7608:2: ( ( ruleQualifiedName ) )
            // InternalQL.g:7609:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getQuestionAccess().getQuestionDefinitionQuestionDefinitionCrossReference_0()); 
            // InternalQL.g:7610:3: ( ruleQualifiedName )
            // InternalQL.g:7611:4: ruleQualifiedName
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
    // InternalQL.g:7622:1: rule__ValueType_Impl__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ValueType_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7626:1: ( ( RULE_ID ) )
            // InternalQL.g:7627:2: ( RULE_ID )
            {
            // InternalQL.g:7627:2: ( RULE_ID )
            // InternalQL.g:7628:3: RULE_ID
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
    // InternalQL.g:7637:1: rule__ValueType_Impl__UnitAssignment_4_1 : ( ruleEString ) ;
    public final void rule__ValueType_Impl__UnitAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7641:1: ( ( ruleEString ) )
            // InternalQL.g:7642:2: ( ruleEString )
            {
            // InternalQL.g:7642:2: ( ruleEString )
            // InternalQL.g:7643:3: ruleEString
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
    // InternalQL.g:7652:1: rule__ConstantCall__ValueAssignment_1 : ( ( rule__ConstantCall__ValueAlternatives_1_0 ) ) ;
    public final void rule__ConstantCall__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7656:1: ( ( ( rule__ConstantCall__ValueAlternatives_1_0 ) ) )
            // InternalQL.g:7657:2: ( ( rule__ConstantCall__ValueAlternatives_1_0 ) )
            {
            // InternalQL.g:7657:2: ( ( rule__ConstantCall__ValueAlternatives_1_0 ) )
            // InternalQL.g:7658:3: ( rule__ConstantCall__ValueAlternatives_1_0 )
            {
             before(grammarAccess.getConstantCallAccess().getValueAlternatives_1_0()); 
            // InternalQL.g:7659:3: ( rule__ConstantCall__ValueAlternatives_1_0 )
            // InternalQL.g:7659:4: rule__ConstantCall__ValueAlternatives_1_0
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
    // InternalQL.g:7667:1: rule__QuestionCall__QuestionAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__QuestionCall__QuestionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7671:1: ( ( ( ruleQualifiedName ) ) )
            // InternalQL.g:7672:2: ( ( ruleQualifiedName ) )
            {
            // InternalQL.g:7672:2: ( ( ruleQualifiedName ) )
            // InternalQL.g:7673:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getQuestionCallAccess().getQuestionQuestionDefinitionCrossReference_1_0()); 
            // InternalQL.g:7674:3: ( ruleQualifiedName )
            // InternalQL.g:7675:4: ruleQualifiedName
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
    // InternalQL.g:7686:1: rule__BooleanValueType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BooleanValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7690:1: ( ( RULE_ID ) )
            // InternalQL.g:7691:2: ( RULE_ID )
            {
            // InternalQL.g:7691:2: ( RULE_ID )
            // InternalQL.g:7692:3: RULE_ID
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
    // InternalQL.g:7701:1: rule__BooleanValueType__UnitAssignment_3_1_1 : ( ruleEString ) ;
    public final void rule__BooleanValueType__UnitAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7705:1: ( ( ruleEString ) )
            // InternalQL.g:7706:2: ( ruleEString )
            {
            // InternalQL.g:7706:2: ( ruleEString )
            // InternalQL.g:7707:3: ruleEString
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
    // InternalQL.g:7716:1: rule__IntegerValueType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__IntegerValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7720:1: ( ( RULE_ID ) )
            // InternalQL.g:7721:2: ( RULE_ID )
            {
            // InternalQL.g:7721:2: ( RULE_ID )
            // InternalQL.g:7722:3: RULE_ID
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
    // InternalQL.g:7731:1: rule__IntegerValueType__UnitAssignment_3_1_1 : ( ruleEString ) ;
    public final void rule__IntegerValueType__UnitAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7735:1: ( ( ruleEString ) )
            // InternalQL.g:7736:2: ( ruleEString )
            {
            // InternalQL.g:7736:2: ( ruleEString )
            // InternalQL.g:7737:3: ruleEString
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
    // InternalQL.g:7746:1: rule__IntegerValueType__MinAssignment_3_2_1 : ( ruleEInt ) ;
    public final void rule__IntegerValueType__MinAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7750:1: ( ( ruleEInt ) )
            // InternalQL.g:7751:2: ( ruleEInt )
            {
            // InternalQL.g:7751:2: ( ruleEInt )
            // InternalQL.g:7752:3: ruleEInt
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
    // InternalQL.g:7761:1: rule__IntegerValueType__MaxAssignment_3_3_1 : ( ruleEInt ) ;
    public final void rule__IntegerValueType__MaxAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7765:1: ( ( ruleEInt ) )
            // InternalQL.g:7766:2: ( ruleEInt )
            {
            // InternalQL.g:7766:2: ( ruleEInt )
            // InternalQL.g:7767:3: ruleEInt
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
    // InternalQL.g:7776:1: rule__DecimalValueType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DecimalValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7780:1: ( ( RULE_ID ) )
            // InternalQL.g:7781:2: ( RULE_ID )
            {
            // InternalQL.g:7781:2: ( RULE_ID )
            // InternalQL.g:7782:3: RULE_ID
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
    // InternalQL.g:7791:1: rule__DecimalValueType__UnitAssignment_3_1_1 : ( ruleEString ) ;
    public final void rule__DecimalValueType__UnitAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7795:1: ( ( ruleEString ) )
            // InternalQL.g:7796:2: ( ruleEString )
            {
            // InternalQL.g:7796:2: ( ruleEString )
            // InternalQL.g:7797:3: ruleEString
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
    // InternalQL.g:7806:1: rule__DateValueType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DateValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7810:1: ( ( RULE_ID ) )
            // InternalQL.g:7811:2: ( RULE_ID )
            {
            // InternalQL.g:7811:2: ( RULE_ID )
            // InternalQL.g:7812:3: RULE_ID
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
    // InternalQL.g:7821:1: rule__DateValueType__UnitAssignment_3_1_1 : ( ruleEString ) ;
    public final void rule__DateValueType__UnitAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7825:1: ( ( ruleEString ) )
            // InternalQL.g:7826:2: ( ruleEString )
            {
            // InternalQL.g:7826:2: ( ruleEString )
            // InternalQL.g:7827:3: ruleEString
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
    // InternalQL.g:7836:1: rule__EnumerationValueType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EnumerationValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7840:1: ( ( RULE_ID ) )
            // InternalQL.g:7841:2: ( RULE_ID )
            {
            // InternalQL.g:7841:2: ( RULE_ID )
            // InternalQL.g:7842:3: RULE_ID
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
    // InternalQL.g:7851:1: rule__EnumerationValueType__UnitAssignment_3_1_1 : ( ruleEString ) ;
    public final void rule__EnumerationValueType__UnitAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7855:1: ( ( ruleEString ) )
            // InternalQL.g:7856:2: ( ruleEString )
            {
            // InternalQL.g:7856:2: ( ruleEString )
            // InternalQL.g:7857:3: ruleEString
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
    // InternalQL.g:7866:1: rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2 : ( ruleEnumerationLiteral ) ;
    public final void rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7870:1: ( ( ruleEnumerationLiteral ) )
            // InternalQL.g:7871:2: ( ruleEnumerationLiteral )
            {
            // InternalQL.g:7871:2: ( ruleEnumerationLiteral )
            // InternalQL.g:7872:3: ruleEnumerationLiteral
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
    // InternalQL.g:7881:1: rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1 : ( ruleEnumerationLiteral ) ;
    public final void rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7885:1: ( ( ruleEnumerationLiteral ) )
            // InternalQL.g:7886:2: ( ruleEnumerationLiteral )
            {
            // InternalQL.g:7886:2: ( ruleEnumerationLiteral )
            // InternalQL.g:7887:3: ruleEnumerationLiteral
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
    // InternalQL.g:7896:1: rule__StringValueType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__StringValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7900:1: ( ( RULE_ID ) )
            // InternalQL.g:7901:2: ( RULE_ID )
            {
            // InternalQL.g:7901:2: ( RULE_ID )
            // InternalQL.g:7902:3: RULE_ID
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
    // InternalQL.g:7911:1: rule__StringValueType__UnitAssignment_3_1_1 : ( ruleEString ) ;
    public final void rule__StringValueType__UnitAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7915:1: ( ( ruleEString ) )
            // InternalQL.g:7916:2: ( ruleEString )
            {
            // InternalQL.g:7916:2: ( ruleEString )
            // InternalQL.g:7917:3: ruleEString
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
    // InternalQL.g:7926:1: rule__EnumerationLiteral__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumerationLiteral__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7930:1: ( ( RULE_ID ) )
            // InternalQL.g:7931:2: ( RULE_ID )
            {
            // InternalQL.g:7931:2: ( RULE_ID )
            // InternalQL.g:7932:3: RULE_ID
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
    // InternalQL.g:7941:1: rule__IntegerValue__IntValueAssignment_1 : ( ruleEInt ) ;
    public final void rule__IntegerValue__IntValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7945:1: ( ( ruleEInt ) )
            // InternalQL.g:7946:2: ( ruleEInt )
            {
            // InternalQL.g:7946:2: ( ruleEInt )
            // InternalQL.g:7947:3: ruleEInt
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
    // InternalQL.g:7956:1: rule__StringValue__StringValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StringValue__StringValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7960:1: ( ( RULE_STRING ) )
            // InternalQL.g:7961:2: ( RULE_STRING )
            {
            // InternalQL.g:7961:2: ( RULE_STRING )
            // InternalQL.g:7962:3: RULE_STRING
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
    // InternalQL.g:7971:1: rule__BooleanValue__BooleanValueAssignment_1 : ( ruleEBoolean ) ;
    public final void rule__BooleanValue__BooleanValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7975:1: ( ( ruleEBoolean ) )
            // InternalQL.g:7976:2: ( ruleEBoolean )
            {
            // InternalQL.g:7976:2: ( ruleEBoolean )
            // InternalQL.g:7977:3: ruleEBoolean
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
    // InternalQL.g:7986:1: rule__EnumerationCall__EnumerationLiteralAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EnumerationCall__EnumerationLiteralAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7990:1: ( ( ( ruleQualifiedName ) ) )
            // InternalQL.g:7991:2: ( ( ruleQualifiedName ) )
            {
            // InternalQL.g:7991:2: ( ( ruleQualifiedName ) )
            // InternalQL.g:7992:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getEnumerationCallAccess().getEnumerationLiteralEnumerationLiteralCrossReference_1_0()); 
            // InternalQL.g:7993:3: ( ruleQualifiedName )
            // InternalQL.g:7994:4: ruleQualifiedName
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
    // InternalQL.g:8005:1: rule__DateValue__DateValueAssignment_3_1 : ( ruleEDate ) ;
    public final void rule__DateValue__DateValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8009:1: ( ( ruleEDate ) )
            // InternalQL.g:8010:2: ( ruleEDate )
            {
            // InternalQL.g:8010:2: ( ruleEDate )
            // InternalQL.g:8011:3: ruleEDate
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
    // InternalQL.g:8020:1: rule__DecimalValue__DecimalValueAssignment_1 : ( ruleEFloat ) ;
    public final void rule__DecimalValue__DecimalValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8024:1: ( ( ruleEFloat ) )
            // InternalQL.g:8025:2: ( ruleEFloat )
            {
            // InternalQL.g:8025:2: ( ruleEFloat )
            // InternalQL.g:8026:3: ruleEFloat
            {
             before(grammarAccess.getDecimalValueAccess().getDecimalValueEFloatParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getDecimalValueAccess().getDecimalValueEFloatParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalQL.g:8035:1: rule__QuestionDefinition__IsMandatoryAssignment_0 : ( ( 'mandatory' ) ) ;
    public final void rule__QuestionDefinition__IsMandatoryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8039:1: ( ( ( 'mandatory' ) ) )
            // InternalQL.g:8040:2: ( ( 'mandatory' ) )
            {
            // InternalQL.g:8040:2: ( ( 'mandatory' ) )
            // InternalQL.g:8041:3: ( 'mandatory' )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getIsMandatoryMandatoryKeyword_0_0()); 
            // InternalQL.g:8042:3: ( 'mandatory' )
            // InternalQL.g:8043:4: 'mandatory'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getIsMandatoryMandatoryKeyword_0_0()); 
            match(input,72,FOLLOW_2); 
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
    // InternalQL.g:8054:1: rule__QuestionDefinition__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__QuestionDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8058:1: ( ( ruleEString ) )
            // InternalQL.g:8059:2: ( ruleEString )
            {
            // InternalQL.g:8059:2: ( ruleEString )
            // InternalQL.g:8060:3: ruleEString
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
    // InternalQL.g:8069:1: rule__QuestionDefinition__IsDisplayedAssignment_3_1 : ( ( 'isDisplayed' ) ) ;
    public final void rule__QuestionDefinition__IsDisplayedAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8073:1: ( ( ( 'isDisplayed' ) ) )
            // InternalQL.g:8074:2: ( ( 'isDisplayed' ) )
            {
            // InternalQL.g:8074:2: ( ( 'isDisplayed' ) )
            // InternalQL.g:8075:3: ( 'isDisplayed' )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getIsDisplayedIsDisplayedKeyword_3_1_0()); 
            // InternalQL.g:8076:3: ( 'isDisplayed' )
            // InternalQL.g:8077:4: 'isDisplayed'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getIsDisplayedIsDisplayedKeyword_3_1_0()); 
            match(input,73,FOLLOW_2); 
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
    // InternalQL.g:8088:1: rule__QuestionDefinition__CurrentValueAssignment_3_2_1 : ( ruleValue ) ;
    public final void rule__QuestionDefinition__CurrentValueAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8092:1: ( ( ruleValue ) )
            // InternalQL.g:8093:2: ( ruleValue )
            {
            // InternalQL.g:8093:2: ( ruleValue )
            // InternalQL.g:8094:3: ruleValue
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
    // InternalQL.g:8103:1: rule__QuestionDefinition__LabelAssignment_5 : ( ruleEString ) ;
    public final void rule__QuestionDefinition__LabelAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8107:1: ( ( ruleEString ) )
            // InternalQL.g:8108:2: ( ruleEString )
            {
            // InternalQL.g:8108:2: ( ruleEString )
            // InternalQL.g:8109:3: ruleEString
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
    // InternalQL.g:8118:1: rule__QuestionDefinition__DataTypeAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__QuestionDefinition__DataTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8122:1: ( ( ( ruleEString ) ) )
            // InternalQL.g:8123:2: ( ( ruleEString ) )
            {
            // InternalQL.g:8123:2: ( ( ruleEString ) )
            // InternalQL.g:8124:3: ( ruleEString )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getDataTypeValueTypeCrossReference_6_0()); 
            // InternalQL.g:8125:3: ( ruleEString )
            // InternalQL.g:8126:4: ruleEString
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
    // InternalQL.g:8137:1: rule__QuestionDefinition__ComputedExpressionAssignment_7_1 : ( ruleExpression ) ;
    public final void rule__QuestionDefinition__ComputedExpressionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8141:1: ( ( ruleExpression ) )
            // InternalQL.g:8142:2: ( ruleExpression )
            {
            // InternalQL.g:8142:2: ( ruleExpression )
            // InternalQL.g:8143:3: ruleExpression
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


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\2\uffff\1\4\3\uffff\1\4";
    static final String dfa_3s = "\1\4\1\uffff\1\14\1\6\2\uffff\1\14";
    static final String dfa_4s = "\1\102\1\uffff\1\106\1\6\2\uffff\1\106";
    static final String dfa_5s = "\1\uffff\1\1\2\uffff\1\3\1\2\1\uffff";
    static final String dfa_6s = "\7\uffff}>";
    static final String[] dfa_7s = {
            "\2\1\1\2\10\uffff\2\1\61\uffff\1\1",
            "",
            "\3\4\20\uffff\1\4\1\uffff\7\4\1\uffff\1\4\1\uffff\1\5\1\4\2\uffff\3\4\20\uffff\1\3\3\uffff\1\4",
            "\1\6",
            "",
            "",
            "\3\4\20\uffff\1\4\1\uffff\7\4\1\uffff\1\4\1\uffff\1\5\1\4\2\uffff\3\4\20\uffff\1\3\3\uffff\1\4"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1371:1: rule__Call__Alternatives : ( ( ruleConstantCall ) | ( ruleQuestionCall ) | ( ruleEnumerationCall ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000C040000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000300000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000480180018070L,0x0000000000000004L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000480000018070L,0x0000000000000004L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000F000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000F000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000280000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000420000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x9CD0040000000000L,0x0000000000000108L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x9CD0000000000002L,0x0000000000000108L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000460000000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000420000000042L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0020040000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000018030L,0x0000000000000004L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0320040000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x2020040000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x4000040000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x9CD0000000000000L,0x0000000000000108L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000018070L,0x0000000000000004L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000108L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000220L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000018030L,0x0000000000000005L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});

}