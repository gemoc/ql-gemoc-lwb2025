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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'EDate'", "'E'", "'e'", "'PLUS'", "'MINUS'", "'MULT'", "'DIV'", "'EQUAL'", "'NOTEQUAL'", "'GREATER'", "'LOWER'", "'GREATEROREQUAL'", "'LOWEROREQUAL'", "'AND'", "'OR'", "'UNARYMINUS'", "'NOT'", "'QLModel'", "'{'", "'}'", "'submitDate'", "'forms'", "','", "'definitionGroup'", "'Form'", "'questionGroup'", "'definitions'", "'QuestionGroup'", "'guard'", "'questionGroups'", "'questions'", "'Question'", "'questionDefinition'", "'ValueType'", "'unit'", "'BasicBinaryExpression'", "'operator'", "'lhsOperand'", "'rhsOperand'", "'resultType'", "'ConstantCall'", "'value'", "'BasicUnaryExpression'", "'operand'", "'QuestionCall'", "'question'", "'BooleanValueType'", "'IntegerValueType'", "'min'", "'max'", "'DecimalValueType'", "'DateValueType'", "'EnumerationValueType'", "'enumerationLiterals'", "'StringValueType'", "'-'", "'EnumerationLiteral'", "'IntegerValue'", "'intValue'", "'StringValue'", "'stringValue'", "'BooleanValue'", "'DateValue'", "'dateValue'", "'DecimalValue'", "'decimalValue'", "'.'", "'QuestionDefinition'", "'dataType'", "'label'", "'computedExpression'", "'currentValue'", "'canSubmit'", "'booleanValue'", "'isDisplayed'", "'isMandatory'"
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
    // InternalQL.g:112:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:116:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalQL.g:117:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalQL.g:117:2: ( ( rule__Expression__Alternatives ) )
            // InternalQL.g:118:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalQL.g:119:3: ( rule__Expression__Alternatives )
            // InternalQL.g:119:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleValue"
    // InternalQL.g:128:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalQL.g:129:1: ( ruleValue EOF )
            // InternalQL.g:130:1: ruleValue EOF
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
    // InternalQL.g:137:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:141:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalQL.g:142:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalQL.g:142:2: ( ( rule__Value__Alternatives ) )
            // InternalQL.g:143:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalQL.g:144:3: ( rule__Value__Alternatives )
            // InternalQL.g:144:4: rule__Value__Alternatives
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
    // InternalQL.g:153:1: entryRuleForm : ruleForm EOF ;
    public final void entryRuleForm() throws RecognitionException {
        try {
            // InternalQL.g:154:1: ( ruleForm EOF )
            // InternalQL.g:155:1: ruleForm EOF
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
    // InternalQL.g:162:1: ruleForm : ( ( rule__Form__Group__0 ) ) ;
    public final void ruleForm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:166:2: ( ( ( rule__Form__Group__0 ) ) )
            // InternalQL.g:167:2: ( ( rule__Form__Group__0 ) )
            {
            // InternalQL.g:167:2: ( ( rule__Form__Group__0 ) )
            // InternalQL.g:168:3: ( rule__Form__Group__0 )
            {
             before(grammarAccess.getFormAccess().getGroup()); 
            // InternalQL.g:169:3: ( rule__Form__Group__0 )
            // InternalQL.g:169:4: rule__Form__Group__0
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
    // InternalQL.g:178:1: entryRuleDefinitionGroup : ruleDefinitionGroup EOF ;
    public final void entryRuleDefinitionGroup() throws RecognitionException {
        try {
            // InternalQL.g:179:1: ( ruleDefinitionGroup EOF )
            // InternalQL.g:180:1: ruleDefinitionGroup EOF
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
    // InternalQL.g:187:1: ruleDefinitionGroup : ( ( rule__DefinitionGroup__Group__0 ) ) ;
    public final void ruleDefinitionGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:191:2: ( ( ( rule__DefinitionGroup__Group__0 ) ) )
            // InternalQL.g:192:2: ( ( rule__DefinitionGroup__Group__0 ) )
            {
            // InternalQL.g:192:2: ( ( rule__DefinitionGroup__Group__0 ) )
            // InternalQL.g:193:3: ( rule__DefinitionGroup__Group__0 )
            {
             before(grammarAccess.getDefinitionGroupAccess().getGroup()); 
            // InternalQL.g:194:3: ( rule__DefinitionGroup__Group__0 )
            // InternalQL.g:194:4: rule__DefinitionGroup__Group__0
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


    // $ANTLR start "entryRuleEDate"
    // InternalQL.g:203:1: entryRuleEDate : ruleEDate EOF ;
    public final void entryRuleEDate() throws RecognitionException {
        try {
            // InternalQL.g:204:1: ( ruleEDate EOF )
            // InternalQL.g:205:1: ruleEDate EOF
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
    // InternalQL.g:212:1: ruleEDate : ( 'EDate' ) ;
    public final void ruleEDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:216:2: ( ( 'EDate' ) )
            // InternalQL.g:217:2: ( 'EDate' )
            {
            // InternalQL.g:217:2: ( 'EDate' )
            // InternalQL.g:218:3: 'EDate'
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
    // InternalQL.g:228:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalQL.g:229:1: ( ruleEString EOF )
            // InternalQL.g:230:1: ruleEString EOF
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
    // InternalQL.g:237:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:241:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalQL.g:242:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalQL.g:242:2: ( ( rule__EString__Alternatives ) )
            // InternalQL.g:243:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalQL.g:244:3: ( rule__EString__Alternatives )
            // InternalQL.g:244:4: rule__EString__Alternatives
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
    // InternalQL.g:253:1: entryRuleQuestionGroup : ruleQuestionGroup EOF ;
    public final void entryRuleQuestionGroup() throws RecognitionException {
        try {
            // InternalQL.g:254:1: ( ruleQuestionGroup EOF )
            // InternalQL.g:255:1: ruleQuestionGroup EOF
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
    // InternalQL.g:262:1: ruleQuestionGroup : ( ( rule__QuestionGroup__Group__0 ) ) ;
    public final void ruleQuestionGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:266:2: ( ( ( rule__QuestionGroup__Group__0 ) ) )
            // InternalQL.g:267:2: ( ( rule__QuestionGroup__Group__0 ) )
            {
            // InternalQL.g:267:2: ( ( rule__QuestionGroup__Group__0 ) )
            // InternalQL.g:268:3: ( rule__QuestionGroup__Group__0 )
            {
             before(grammarAccess.getQuestionGroupAccess().getGroup()); 
            // InternalQL.g:269:3: ( rule__QuestionGroup__Group__0 )
            // InternalQL.g:269:4: rule__QuestionGroup__Group__0
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
    // InternalQL.g:278:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // InternalQL.g:279:1: ( ruleQuestion EOF )
            // InternalQL.g:280:1: ruleQuestion EOF
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
    // InternalQL.g:287:1: ruleQuestion : ( ( rule__Question__Group__0 ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:291:2: ( ( ( rule__Question__Group__0 ) ) )
            // InternalQL.g:292:2: ( ( rule__Question__Group__0 ) )
            {
            // InternalQL.g:292:2: ( ( rule__Question__Group__0 ) )
            // InternalQL.g:293:3: ( rule__Question__Group__0 )
            {
             before(grammarAccess.getQuestionAccess().getGroup()); 
            // InternalQL.g:294:3: ( rule__Question__Group__0 )
            // InternalQL.g:294:4: rule__Question__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getGroup()); 

            }


            }

        }
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
    // InternalQL.g:303:1: entryRuleValueType_Impl : ruleValueType_Impl EOF ;
    public final void entryRuleValueType_Impl() throws RecognitionException {
        try {
            // InternalQL.g:304:1: ( ruleValueType_Impl EOF )
            // InternalQL.g:305:1: ruleValueType_Impl EOF
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
    // InternalQL.g:312:1: ruleValueType_Impl : ( ( rule__ValueType_Impl__Group__0 ) ) ;
    public final void ruleValueType_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:316:2: ( ( ( rule__ValueType_Impl__Group__0 ) ) )
            // InternalQL.g:317:2: ( ( rule__ValueType_Impl__Group__0 ) )
            {
            // InternalQL.g:317:2: ( ( rule__ValueType_Impl__Group__0 ) )
            // InternalQL.g:318:3: ( rule__ValueType_Impl__Group__0 )
            {
             before(grammarAccess.getValueType_ImplAccess().getGroup()); 
            // InternalQL.g:319:3: ( rule__ValueType_Impl__Group__0 )
            // InternalQL.g:319:4: rule__ValueType_Impl__Group__0
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


    // $ANTLR start "entryRuleBasicBinaryExpression"
    // InternalQL.g:328:1: entryRuleBasicBinaryExpression : ruleBasicBinaryExpression EOF ;
    public final void entryRuleBasicBinaryExpression() throws RecognitionException {
        try {
            // InternalQL.g:329:1: ( ruleBasicBinaryExpression EOF )
            // InternalQL.g:330:1: ruleBasicBinaryExpression EOF
            {
             before(grammarAccess.getBasicBinaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleBasicBinaryExpression();

            state._fsp--;

             after(grammarAccess.getBasicBinaryExpressionRule()); 
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
    // $ANTLR end "entryRuleBasicBinaryExpression"


    // $ANTLR start "ruleBasicBinaryExpression"
    // InternalQL.g:337:1: ruleBasicBinaryExpression : ( ( rule__BasicBinaryExpression__Group__0 ) ) ;
    public final void ruleBasicBinaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:341:2: ( ( ( rule__BasicBinaryExpression__Group__0 ) ) )
            // InternalQL.g:342:2: ( ( rule__BasicBinaryExpression__Group__0 ) )
            {
            // InternalQL.g:342:2: ( ( rule__BasicBinaryExpression__Group__0 ) )
            // InternalQL.g:343:3: ( rule__BasicBinaryExpression__Group__0 )
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getGroup()); 
            // InternalQL.g:344:3: ( rule__BasicBinaryExpression__Group__0 )
            // InternalQL.g:344:4: rule__BasicBinaryExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BasicBinaryExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBasicBinaryExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicBinaryExpression"


    // $ANTLR start "entryRuleConstantCall"
    // InternalQL.g:353:1: entryRuleConstantCall : ruleConstantCall EOF ;
    public final void entryRuleConstantCall() throws RecognitionException {
        try {
            // InternalQL.g:354:1: ( ruleConstantCall EOF )
            // InternalQL.g:355:1: ruleConstantCall EOF
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
    // InternalQL.g:362:1: ruleConstantCall : ( ( rule__ConstantCall__Group__0 ) ) ;
    public final void ruleConstantCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:366:2: ( ( ( rule__ConstantCall__Group__0 ) ) )
            // InternalQL.g:367:2: ( ( rule__ConstantCall__Group__0 ) )
            {
            // InternalQL.g:367:2: ( ( rule__ConstantCall__Group__0 ) )
            // InternalQL.g:368:3: ( rule__ConstantCall__Group__0 )
            {
             before(grammarAccess.getConstantCallAccess().getGroup()); 
            // InternalQL.g:369:3: ( rule__ConstantCall__Group__0 )
            // InternalQL.g:369:4: rule__ConstantCall__Group__0
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


    // $ANTLR start "entryRuleBasicUnaryExpression"
    // InternalQL.g:378:1: entryRuleBasicUnaryExpression : ruleBasicUnaryExpression EOF ;
    public final void entryRuleBasicUnaryExpression() throws RecognitionException {
        try {
            // InternalQL.g:379:1: ( ruleBasicUnaryExpression EOF )
            // InternalQL.g:380:1: ruleBasicUnaryExpression EOF
            {
             before(grammarAccess.getBasicUnaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleBasicUnaryExpression();

            state._fsp--;

             after(grammarAccess.getBasicUnaryExpressionRule()); 
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
    // $ANTLR end "entryRuleBasicUnaryExpression"


    // $ANTLR start "ruleBasicUnaryExpression"
    // InternalQL.g:387:1: ruleBasicUnaryExpression : ( ( rule__BasicUnaryExpression__Group__0 ) ) ;
    public final void ruleBasicUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:391:2: ( ( ( rule__BasicUnaryExpression__Group__0 ) ) )
            // InternalQL.g:392:2: ( ( rule__BasicUnaryExpression__Group__0 ) )
            {
            // InternalQL.g:392:2: ( ( rule__BasicUnaryExpression__Group__0 ) )
            // InternalQL.g:393:3: ( rule__BasicUnaryExpression__Group__0 )
            {
             before(grammarAccess.getBasicUnaryExpressionAccess().getGroup()); 
            // InternalQL.g:394:3: ( rule__BasicUnaryExpression__Group__0 )
            // InternalQL.g:394:4: rule__BasicUnaryExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BasicUnaryExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBasicUnaryExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicUnaryExpression"


    // $ANTLR start "entryRuleQuestionCall"
    // InternalQL.g:403:1: entryRuleQuestionCall : ruleQuestionCall EOF ;
    public final void entryRuleQuestionCall() throws RecognitionException {
        try {
            // InternalQL.g:404:1: ( ruleQuestionCall EOF )
            // InternalQL.g:405:1: ruleQuestionCall EOF
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
    // InternalQL.g:412:1: ruleQuestionCall : ( ( rule__QuestionCall__Group__0 ) ) ;
    public final void ruleQuestionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:416:2: ( ( ( rule__QuestionCall__Group__0 ) ) )
            // InternalQL.g:417:2: ( ( rule__QuestionCall__Group__0 ) )
            {
            // InternalQL.g:417:2: ( ( rule__QuestionCall__Group__0 ) )
            // InternalQL.g:418:3: ( rule__QuestionCall__Group__0 )
            {
             before(grammarAccess.getQuestionCallAccess().getGroup()); 
            // InternalQL.g:419:3: ( rule__QuestionCall__Group__0 )
            // InternalQL.g:419:4: rule__QuestionCall__Group__0
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
    // InternalQL.g:428:1: entryRuleBooleanValueType : ruleBooleanValueType EOF ;
    public final void entryRuleBooleanValueType() throws RecognitionException {
        try {
            // InternalQL.g:429:1: ( ruleBooleanValueType EOF )
            // InternalQL.g:430:1: ruleBooleanValueType EOF
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
    // InternalQL.g:437:1: ruleBooleanValueType : ( ( rule__BooleanValueType__Group__0 ) ) ;
    public final void ruleBooleanValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:441:2: ( ( ( rule__BooleanValueType__Group__0 ) ) )
            // InternalQL.g:442:2: ( ( rule__BooleanValueType__Group__0 ) )
            {
            // InternalQL.g:442:2: ( ( rule__BooleanValueType__Group__0 ) )
            // InternalQL.g:443:3: ( rule__BooleanValueType__Group__0 )
            {
             before(grammarAccess.getBooleanValueTypeAccess().getGroup()); 
            // InternalQL.g:444:3: ( rule__BooleanValueType__Group__0 )
            // InternalQL.g:444:4: rule__BooleanValueType__Group__0
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
    // InternalQL.g:453:1: entryRuleIntegerValueType : ruleIntegerValueType EOF ;
    public final void entryRuleIntegerValueType() throws RecognitionException {
        try {
            // InternalQL.g:454:1: ( ruleIntegerValueType EOF )
            // InternalQL.g:455:1: ruleIntegerValueType EOF
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
    // InternalQL.g:462:1: ruleIntegerValueType : ( ( rule__IntegerValueType__Group__0 ) ) ;
    public final void ruleIntegerValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:466:2: ( ( ( rule__IntegerValueType__Group__0 ) ) )
            // InternalQL.g:467:2: ( ( rule__IntegerValueType__Group__0 ) )
            {
            // InternalQL.g:467:2: ( ( rule__IntegerValueType__Group__0 ) )
            // InternalQL.g:468:3: ( rule__IntegerValueType__Group__0 )
            {
             before(grammarAccess.getIntegerValueTypeAccess().getGroup()); 
            // InternalQL.g:469:3: ( rule__IntegerValueType__Group__0 )
            // InternalQL.g:469:4: rule__IntegerValueType__Group__0
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
    // InternalQL.g:478:1: entryRuleDecimalValueType : ruleDecimalValueType EOF ;
    public final void entryRuleDecimalValueType() throws RecognitionException {
        try {
            // InternalQL.g:479:1: ( ruleDecimalValueType EOF )
            // InternalQL.g:480:1: ruleDecimalValueType EOF
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
    // InternalQL.g:487:1: ruleDecimalValueType : ( ( rule__DecimalValueType__Group__0 ) ) ;
    public final void ruleDecimalValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:491:2: ( ( ( rule__DecimalValueType__Group__0 ) ) )
            // InternalQL.g:492:2: ( ( rule__DecimalValueType__Group__0 ) )
            {
            // InternalQL.g:492:2: ( ( rule__DecimalValueType__Group__0 ) )
            // InternalQL.g:493:3: ( rule__DecimalValueType__Group__0 )
            {
             before(grammarAccess.getDecimalValueTypeAccess().getGroup()); 
            // InternalQL.g:494:3: ( rule__DecimalValueType__Group__0 )
            // InternalQL.g:494:4: rule__DecimalValueType__Group__0
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
    // InternalQL.g:503:1: entryRuleDateValueType : ruleDateValueType EOF ;
    public final void entryRuleDateValueType() throws RecognitionException {
        try {
            // InternalQL.g:504:1: ( ruleDateValueType EOF )
            // InternalQL.g:505:1: ruleDateValueType EOF
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
    // InternalQL.g:512:1: ruleDateValueType : ( ( rule__DateValueType__Group__0 ) ) ;
    public final void ruleDateValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:516:2: ( ( ( rule__DateValueType__Group__0 ) ) )
            // InternalQL.g:517:2: ( ( rule__DateValueType__Group__0 ) )
            {
            // InternalQL.g:517:2: ( ( rule__DateValueType__Group__0 ) )
            // InternalQL.g:518:3: ( rule__DateValueType__Group__0 )
            {
             before(grammarAccess.getDateValueTypeAccess().getGroup()); 
            // InternalQL.g:519:3: ( rule__DateValueType__Group__0 )
            // InternalQL.g:519:4: rule__DateValueType__Group__0
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
    // InternalQL.g:528:1: entryRuleEnumerationValueType : ruleEnumerationValueType EOF ;
    public final void entryRuleEnumerationValueType() throws RecognitionException {
        try {
            // InternalQL.g:529:1: ( ruleEnumerationValueType EOF )
            // InternalQL.g:530:1: ruleEnumerationValueType EOF
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
    // InternalQL.g:537:1: ruleEnumerationValueType : ( ( rule__EnumerationValueType__Group__0 ) ) ;
    public final void ruleEnumerationValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:541:2: ( ( ( rule__EnumerationValueType__Group__0 ) ) )
            // InternalQL.g:542:2: ( ( rule__EnumerationValueType__Group__0 ) )
            {
            // InternalQL.g:542:2: ( ( rule__EnumerationValueType__Group__0 ) )
            // InternalQL.g:543:3: ( rule__EnumerationValueType__Group__0 )
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getGroup()); 
            // InternalQL.g:544:3: ( rule__EnumerationValueType__Group__0 )
            // InternalQL.g:544:4: rule__EnumerationValueType__Group__0
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
    // InternalQL.g:553:1: entryRuleStringValueType : ruleStringValueType EOF ;
    public final void entryRuleStringValueType() throws RecognitionException {
        try {
            // InternalQL.g:554:1: ( ruleStringValueType EOF )
            // InternalQL.g:555:1: ruleStringValueType EOF
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
    // InternalQL.g:562:1: ruleStringValueType : ( ( rule__StringValueType__Group__0 ) ) ;
    public final void ruleStringValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:566:2: ( ( ( rule__StringValueType__Group__0 ) ) )
            // InternalQL.g:567:2: ( ( rule__StringValueType__Group__0 ) )
            {
            // InternalQL.g:567:2: ( ( rule__StringValueType__Group__0 ) )
            // InternalQL.g:568:3: ( rule__StringValueType__Group__0 )
            {
             before(grammarAccess.getStringValueTypeAccess().getGroup()); 
            // InternalQL.g:569:3: ( rule__StringValueType__Group__0 )
            // InternalQL.g:569:4: rule__StringValueType__Group__0
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


    // $ANTLR start "entryRuleEInt"
    // InternalQL.g:578:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalQL.g:579:1: ( ruleEInt EOF )
            // InternalQL.g:580:1: ruleEInt EOF
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
    // InternalQL.g:587:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:591:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalQL.g:592:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalQL.g:592:2: ( ( rule__EInt__Group__0 ) )
            // InternalQL.g:593:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalQL.g:594:3: ( rule__EInt__Group__0 )
            // InternalQL.g:594:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleEnumerationLiteral"
    // InternalQL.g:603:1: entryRuleEnumerationLiteral : ruleEnumerationLiteral EOF ;
    public final void entryRuleEnumerationLiteral() throws RecognitionException {
        try {
            // InternalQL.g:604:1: ( ruleEnumerationLiteral EOF )
            // InternalQL.g:605:1: ruleEnumerationLiteral EOF
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
    // InternalQL.g:612:1: ruleEnumerationLiteral : ( ( rule__EnumerationLiteral__Group__0 ) ) ;
    public final void ruleEnumerationLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:616:2: ( ( ( rule__EnumerationLiteral__Group__0 ) ) )
            // InternalQL.g:617:2: ( ( rule__EnumerationLiteral__Group__0 ) )
            {
            // InternalQL.g:617:2: ( ( rule__EnumerationLiteral__Group__0 ) )
            // InternalQL.g:618:3: ( rule__EnumerationLiteral__Group__0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getGroup()); 
            // InternalQL.g:619:3: ( rule__EnumerationLiteral__Group__0 )
            // InternalQL.g:619:4: rule__EnumerationLiteral__Group__0
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
    // InternalQL.g:628:1: entryRuleIntegerValue : ruleIntegerValue EOF ;
    public final void entryRuleIntegerValue() throws RecognitionException {
        try {
            // InternalQL.g:629:1: ( ruleIntegerValue EOF )
            // InternalQL.g:630:1: ruleIntegerValue EOF
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
    // InternalQL.g:637:1: ruleIntegerValue : ( ( rule__IntegerValue__Group__0 ) ) ;
    public final void ruleIntegerValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:641:2: ( ( ( rule__IntegerValue__Group__0 ) ) )
            // InternalQL.g:642:2: ( ( rule__IntegerValue__Group__0 ) )
            {
            // InternalQL.g:642:2: ( ( rule__IntegerValue__Group__0 ) )
            // InternalQL.g:643:3: ( rule__IntegerValue__Group__0 )
            {
             before(grammarAccess.getIntegerValueAccess().getGroup()); 
            // InternalQL.g:644:3: ( rule__IntegerValue__Group__0 )
            // InternalQL.g:644:4: rule__IntegerValue__Group__0
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
    // InternalQL.g:653:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalQL.g:654:1: ( ruleStringValue EOF )
            // InternalQL.g:655:1: ruleStringValue EOF
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
    // InternalQL.g:662:1: ruleStringValue : ( ( rule__StringValue__Group__0 ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:666:2: ( ( ( rule__StringValue__Group__0 ) ) )
            // InternalQL.g:667:2: ( ( rule__StringValue__Group__0 ) )
            {
            // InternalQL.g:667:2: ( ( rule__StringValue__Group__0 ) )
            // InternalQL.g:668:3: ( rule__StringValue__Group__0 )
            {
             before(grammarAccess.getStringValueAccess().getGroup()); 
            // InternalQL.g:669:3: ( rule__StringValue__Group__0 )
            // InternalQL.g:669:4: rule__StringValue__Group__0
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
    // InternalQL.g:678:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalQL.g:679:1: ( ruleBooleanValue EOF )
            // InternalQL.g:680:1: ruleBooleanValue EOF
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
    // InternalQL.g:687:1: ruleBooleanValue : ( ( rule__BooleanValue__Group__0 ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:691:2: ( ( ( rule__BooleanValue__Group__0 ) ) )
            // InternalQL.g:692:2: ( ( rule__BooleanValue__Group__0 ) )
            {
            // InternalQL.g:692:2: ( ( rule__BooleanValue__Group__0 ) )
            // InternalQL.g:693:3: ( rule__BooleanValue__Group__0 )
            {
             before(grammarAccess.getBooleanValueAccess().getGroup()); 
            // InternalQL.g:694:3: ( rule__BooleanValue__Group__0 )
            // InternalQL.g:694:4: rule__BooleanValue__Group__0
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


    // $ANTLR start "entryRuleDateValue"
    // InternalQL.g:703:1: entryRuleDateValue : ruleDateValue EOF ;
    public final void entryRuleDateValue() throws RecognitionException {
        try {
            // InternalQL.g:704:1: ( ruleDateValue EOF )
            // InternalQL.g:705:1: ruleDateValue EOF
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
    // InternalQL.g:712:1: ruleDateValue : ( ( rule__DateValue__Group__0 ) ) ;
    public final void ruleDateValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:716:2: ( ( ( rule__DateValue__Group__0 ) ) )
            // InternalQL.g:717:2: ( ( rule__DateValue__Group__0 ) )
            {
            // InternalQL.g:717:2: ( ( rule__DateValue__Group__0 ) )
            // InternalQL.g:718:3: ( rule__DateValue__Group__0 )
            {
             before(grammarAccess.getDateValueAccess().getGroup()); 
            // InternalQL.g:719:3: ( rule__DateValue__Group__0 )
            // InternalQL.g:719:4: rule__DateValue__Group__0
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
    // InternalQL.g:728:1: entryRuleDecimalValue : ruleDecimalValue EOF ;
    public final void entryRuleDecimalValue() throws RecognitionException {
        try {
            // InternalQL.g:729:1: ( ruleDecimalValue EOF )
            // InternalQL.g:730:1: ruleDecimalValue EOF
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
    // InternalQL.g:737:1: ruleDecimalValue : ( ( rule__DecimalValue__Group__0 ) ) ;
    public final void ruleDecimalValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:741:2: ( ( ( rule__DecimalValue__Group__0 ) ) )
            // InternalQL.g:742:2: ( ( rule__DecimalValue__Group__0 ) )
            {
            // InternalQL.g:742:2: ( ( rule__DecimalValue__Group__0 ) )
            // InternalQL.g:743:3: ( rule__DecimalValue__Group__0 )
            {
             before(grammarAccess.getDecimalValueAccess().getGroup()); 
            // InternalQL.g:744:3: ( rule__DecimalValue__Group__0 )
            // InternalQL.g:744:4: rule__DecimalValue__Group__0
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


    // $ANTLR start "entryRuleEFloat"
    // InternalQL.g:753:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // InternalQL.g:754:1: ( ruleEFloat EOF )
            // InternalQL.g:755:1: ruleEFloat EOF
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
    // InternalQL.g:762:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:766:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // InternalQL.g:767:2: ( ( rule__EFloat__Group__0 ) )
            {
            // InternalQL.g:767:2: ( ( rule__EFloat__Group__0 ) )
            // InternalQL.g:768:3: ( rule__EFloat__Group__0 )
            {
             before(grammarAccess.getEFloatAccess().getGroup()); 
            // InternalQL.g:769:3: ( rule__EFloat__Group__0 )
            // InternalQL.g:769:4: rule__EFloat__Group__0
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
    // InternalQL.g:778:1: entryRuleQuestionDefinition : ruleQuestionDefinition EOF ;
    public final void entryRuleQuestionDefinition() throws RecognitionException {
        try {
            // InternalQL.g:779:1: ( ruleQuestionDefinition EOF )
            // InternalQL.g:780:1: ruleQuestionDefinition EOF
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
    // InternalQL.g:787:1: ruleQuestionDefinition : ( ( rule__QuestionDefinition__Group__0 ) ) ;
    public final void ruleQuestionDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:791:2: ( ( ( rule__QuestionDefinition__Group__0 ) ) )
            // InternalQL.g:792:2: ( ( rule__QuestionDefinition__Group__0 ) )
            {
            // InternalQL.g:792:2: ( ( rule__QuestionDefinition__Group__0 ) )
            // InternalQL.g:793:3: ( rule__QuestionDefinition__Group__0 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getGroup()); 
            // InternalQL.g:794:3: ( rule__QuestionDefinition__Group__0 )
            // InternalQL.g:794:4: rule__QuestionDefinition__Group__0
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


    // $ANTLR start "ruleBinaryOperatorKind"
    // InternalQL.g:803:1: ruleBinaryOperatorKind : ( ( rule__BinaryOperatorKind__Alternatives ) ) ;
    public final void ruleBinaryOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:807:1: ( ( ( rule__BinaryOperatorKind__Alternatives ) ) )
            // InternalQL.g:808:2: ( ( rule__BinaryOperatorKind__Alternatives ) )
            {
            // InternalQL.g:808:2: ( ( rule__BinaryOperatorKind__Alternatives ) )
            // InternalQL.g:809:3: ( rule__BinaryOperatorKind__Alternatives )
            {
             before(grammarAccess.getBinaryOperatorKindAccess().getAlternatives()); 
            // InternalQL.g:810:3: ( rule__BinaryOperatorKind__Alternatives )
            // InternalQL.g:810:4: rule__BinaryOperatorKind__Alternatives
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
    // InternalQL.g:819:1: ruleUnaryOperatorKind : ( ( rule__UnaryOperatorKind__Alternatives ) ) ;
    public final void ruleUnaryOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:823:1: ( ( ( rule__UnaryOperatorKind__Alternatives ) ) )
            // InternalQL.g:824:2: ( ( rule__UnaryOperatorKind__Alternatives ) )
            {
            // InternalQL.g:824:2: ( ( rule__UnaryOperatorKind__Alternatives ) )
            // InternalQL.g:825:3: ( rule__UnaryOperatorKind__Alternatives )
            {
             before(grammarAccess.getUnaryOperatorKindAccess().getAlternatives()); 
            // InternalQL.g:826:3: ( rule__UnaryOperatorKind__Alternatives )
            // InternalQL.g:826:4: rule__UnaryOperatorKind__Alternatives
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


    // $ANTLR start "rule__ValueType__Alternatives"
    // InternalQL.g:834:1: rule__ValueType__Alternatives : ( ( ruleValueType_Impl ) | ( ruleBooleanValueType ) | ( ruleIntegerValueType ) | ( ruleDecimalValueType ) | ( ruleDateValueType ) | ( ruleEnumerationValueType ) | ( ruleStringValueType ) );
    public final void rule__ValueType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:838:1: ( ( ruleValueType_Impl ) | ( ruleBooleanValueType ) | ( ruleIntegerValueType ) | ( ruleDecimalValueType ) | ( ruleDateValueType ) | ( ruleEnumerationValueType ) | ( ruleStringValueType ) )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt1=1;
                }
                break;
            case 57:
                {
                alt1=2;
                }
                break;
            case 58:
                {
                alt1=3;
                }
                break;
            case 61:
                {
                alt1=4;
                }
                break;
            case 62:
                {
                alt1=5;
                }
                break;
            case 63:
                {
                alt1=6;
                }
                break;
            case 65:
                {
                alt1=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalQL.g:839:2: ( ruleValueType_Impl )
                    {
                    // InternalQL.g:839:2: ( ruleValueType_Impl )
                    // InternalQL.g:840:3: ruleValueType_Impl
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
                    // InternalQL.g:845:2: ( ruleBooleanValueType )
                    {
                    // InternalQL.g:845:2: ( ruleBooleanValueType )
                    // InternalQL.g:846:3: ruleBooleanValueType
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
                    // InternalQL.g:851:2: ( ruleIntegerValueType )
                    {
                    // InternalQL.g:851:2: ( ruleIntegerValueType )
                    // InternalQL.g:852:3: ruleIntegerValueType
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
                    // InternalQL.g:857:2: ( ruleDecimalValueType )
                    {
                    // InternalQL.g:857:2: ( ruleDecimalValueType )
                    // InternalQL.g:858:3: ruleDecimalValueType
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
                    // InternalQL.g:863:2: ( ruleDateValueType )
                    {
                    // InternalQL.g:863:2: ( ruleDateValueType )
                    // InternalQL.g:864:3: ruleDateValueType
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
                    // InternalQL.g:869:2: ( ruleEnumerationValueType )
                    {
                    // InternalQL.g:869:2: ( ruleEnumerationValueType )
                    // InternalQL.g:870:3: ruleEnumerationValueType
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
                    // InternalQL.g:875:2: ( ruleStringValueType )
                    {
                    // InternalQL.g:875:2: ( ruleStringValueType )
                    // InternalQL.g:876:3: ruleStringValueType
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


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalQL.g:885:1: rule__Expression__Alternatives : ( ( ruleBasicBinaryExpression ) | ( ruleConstantCall ) | ( ruleBasicUnaryExpression ) | ( ruleQuestionCall ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:889:1: ( ( ruleBasicBinaryExpression ) | ( ruleConstantCall ) | ( ruleBasicUnaryExpression ) | ( ruleQuestionCall ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt2=1;
                }
                break;
            case 51:
                {
                alt2=2;
                }
                break;
            case 53:
                {
                alt2=3;
                }
                break;
            case 55:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalQL.g:890:2: ( ruleBasicBinaryExpression )
                    {
                    // InternalQL.g:890:2: ( ruleBasicBinaryExpression )
                    // InternalQL.g:891:3: ruleBasicBinaryExpression
                    {
                     before(grammarAccess.getExpressionAccess().getBasicBinaryExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBasicBinaryExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getBasicBinaryExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:896:2: ( ruleConstantCall )
                    {
                    // InternalQL.g:896:2: ( ruleConstantCall )
                    // InternalQL.g:897:3: ruleConstantCall
                    {
                     before(grammarAccess.getExpressionAccess().getConstantCallParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleConstantCall();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getConstantCallParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQL.g:902:2: ( ruleBasicUnaryExpression )
                    {
                    // InternalQL.g:902:2: ( ruleBasicUnaryExpression )
                    // InternalQL.g:903:3: ruleBasicUnaryExpression
                    {
                     before(grammarAccess.getExpressionAccess().getBasicUnaryExpressionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBasicUnaryExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getBasicUnaryExpressionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQL.g:908:2: ( ruleQuestionCall )
                    {
                    // InternalQL.g:908:2: ( ruleQuestionCall )
                    // InternalQL.g:909:3: ruleQuestionCall
                    {
                     before(grammarAccess.getExpressionAccess().getQuestionCallParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleQuestionCall();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getQuestionCallParserRuleCall_3()); 

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
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalQL.g:918:1: rule__Value__Alternatives : ( ( ruleIntegerValue ) | ( ruleStringValue ) | ( ruleBooleanValue ) | ( ruleDateValue ) | ( ruleDecimalValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:922:1: ( ( ruleIntegerValue ) | ( ruleStringValue ) | ( ruleBooleanValue ) | ( ruleDateValue ) | ( ruleDecimalValue ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt3=1;
                }
                break;
            case 70:
                {
                alt3=2;
                }
                break;
            case 72:
            case 84:
                {
                alt3=3;
                }
                break;
            case 73:
                {
                alt3=4;
                }
                break;
            case 75:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalQL.g:923:2: ( ruleIntegerValue )
                    {
                    // InternalQL.g:923:2: ( ruleIntegerValue )
                    // InternalQL.g:924:3: ruleIntegerValue
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
                    // InternalQL.g:929:2: ( ruleStringValue )
                    {
                    // InternalQL.g:929:2: ( ruleStringValue )
                    // InternalQL.g:930:3: ruleStringValue
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
                    // InternalQL.g:935:2: ( ruleBooleanValue )
                    {
                    // InternalQL.g:935:2: ( ruleBooleanValue )
                    // InternalQL.g:936:3: ruleBooleanValue
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
                    // InternalQL.g:941:2: ( ruleDateValue )
                    {
                    // InternalQL.g:941:2: ( ruleDateValue )
                    // InternalQL.g:942:3: ruleDateValue
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
                    // InternalQL.g:947:2: ( ruleDecimalValue )
                    {
                    // InternalQL.g:947:2: ( ruleDecimalValue )
                    // InternalQL.g:948:3: ruleDecimalValue
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
    // InternalQL.g:957:1: rule__DefinitionGroup__Alternatives_3 : ( ( ( rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0 ) ) | ( ( rule__DefinitionGroup__DataTypesAssignment_3_1 ) ) );
    public final void rule__DefinitionGroup__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:961:1: ( ( ( rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0 ) ) | ( ( rule__DefinitionGroup__DataTypesAssignment_3_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==78||(LA4_0>=85 && LA4_0<=86)) ) {
                alt4=1;
            }
            else if ( (LA4_0==44||(LA4_0>=57 && LA4_0<=58)||(LA4_0>=61 && LA4_0<=63)||LA4_0==65) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalQL.g:962:2: ( ( rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0 ) )
                    {
                    // InternalQL.g:962:2: ( ( rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0 ) )
                    // InternalQL.g:963:3: ( rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0 )
                    {
                     before(grammarAccess.getDefinitionGroupAccess().getQuestionDefinitionsAssignment_3_0()); 
                    // InternalQL.g:964:3: ( rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0 )
                    // InternalQL.g:964:4: rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0
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
                    // InternalQL.g:968:2: ( ( rule__DefinitionGroup__DataTypesAssignment_3_1 ) )
                    {
                    // InternalQL.g:968:2: ( ( rule__DefinitionGroup__DataTypesAssignment_3_1 ) )
                    // InternalQL.g:969:3: ( rule__DefinitionGroup__DataTypesAssignment_3_1 )
                    {
                     before(grammarAccess.getDefinitionGroupAccess().getDataTypesAssignment_3_1()); 
                    // InternalQL.g:970:3: ( rule__DefinitionGroup__DataTypesAssignment_3_1 )
                    // InternalQL.g:970:4: rule__DefinitionGroup__DataTypesAssignment_3_1
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


    // $ANTLR start "rule__EString__Alternatives"
    // InternalQL.g:978:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:982:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
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
                    // InternalQL.g:983:2: ( RULE_STRING )
                    {
                    // InternalQL.g:983:2: ( RULE_STRING )
                    // InternalQL.g:984:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:989:2: ( RULE_ID )
                    {
                    // InternalQL.g:989:2: ( RULE_ID )
                    // InternalQL.g:990:3: RULE_ID
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


    // $ANTLR start "rule__EFloat__Alternatives_4_0"
    // InternalQL.g:999:1: rule__EFloat__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EFloat__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1003:1: ( ( 'E' ) | ( 'e' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            else if ( (LA6_0==13) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalQL.g:1004:2: ( 'E' )
                    {
                    // InternalQL.g:1004:2: ( 'E' )
                    // InternalQL.g:1005:3: 'E'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:1010:2: ( 'e' )
                    {
                    // InternalQL.g:1010:2: ( 'e' )
                    // InternalQL.g:1011:3: 'e'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 

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
    // $ANTLR end "rule__EFloat__Alternatives_4_0"


    // $ANTLR start "rule__BinaryOperatorKind__Alternatives"
    // InternalQL.g:1020:1: rule__BinaryOperatorKind__Alternatives : ( ( ( 'PLUS' ) ) | ( ( 'MINUS' ) ) | ( ( 'MULT' ) ) | ( ( 'DIV' ) ) | ( ( 'EQUAL' ) ) | ( ( 'NOTEQUAL' ) ) | ( ( 'GREATER' ) ) | ( ( 'LOWER' ) ) | ( ( 'GREATEROREQUAL' ) ) | ( ( 'LOWEROREQUAL' ) ) | ( ( 'AND' ) ) | ( ( 'OR' ) ) );
    public final void rule__BinaryOperatorKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1024:1: ( ( ( 'PLUS' ) ) | ( ( 'MINUS' ) ) | ( ( 'MULT' ) ) | ( ( 'DIV' ) ) | ( ( 'EQUAL' ) ) | ( ( 'NOTEQUAL' ) ) | ( ( 'GREATER' ) ) | ( ( 'LOWER' ) ) | ( ( 'GREATEROREQUAL' ) ) | ( ( 'LOWEROREQUAL' ) ) | ( ( 'AND' ) ) | ( ( 'OR' ) ) )
            int alt7=12;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt7=1;
                }
                break;
            case 15:
                {
                alt7=2;
                }
                break;
            case 16:
                {
                alt7=3;
                }
                break;
            case 17:
                {
                alt7=4;
                }
                break;
            case 18:
                {
                alt7=5;
                }
                break;
            case 19:
                {
                alt7=6;
                }
                break;
            case 20:
                {
                alt7=7;
                }
                break;
            case 21:
                {
                alt7=8;
                }
                break;
            case 22:
                {
                alt7=9;
                }
                break;
            case 23:
                {
                alt7=10;
                }
                break;
            case 24:
                {
                alt7=11;
                }
                break;
            case 25:
                {
                alt7=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalQL.g:1025:2: ( ( 'PLUS' ) )
                    {
                    // InternalQL.g:1025:2: ( ( 'PLUS' ) )
                    // InternalQL.g:1026:3: ( 'PLUS' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getPLUSEnumLiteralDeclaration_0()); 
                    // InternalQL.g:1027:3: ( 'PLUS' )
                    // InternalQL.g:1027:4: 'PLUS'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getPLUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:1031:2: ( ( 'MINUS' ) )
                    {
                    // InternalQL.g:1031:2: ( ( 'MINUS' ) )
                    // InternalQL.g:1032:3: ( 'MINUS' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getMINUSEnumLiteralDeclaration_1()); 
                    // InternalQL.g:1033:3: ( 'MINUS' )
                    // InternalQL.g:1033:4: 'MINUS'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getMINUSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQL.g:1037:2: ( ( 'MULT' ) )
                    {
                    // InternalQL.g:1037:2: ( ( 'MULT' ) )
                    // InternalQL.g:1038:3: ( 'MULT' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getMULTEnumLiteralDeclaration_2()); 
                    // InternalQL.g:1039:3: ( 'MULT' )
                    // InternalQL.g:1039:4: 'MULT'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getMULTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQL.g:1043:2: ( ( 'DIV' ) )
                    {
                    // InternalQL.g:1043:2: ( ( 'DIV' ) )
                    // InternalQL.g:1044:3: ( 'DIV' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getDIVEnumLiteralDeclaration_3()); 
                    // InternalQL.g:1045:3: ( 'DIV' )
                    // InternalQL.g:1045:4: 'DIV'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getDIVEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalQL.g:1049:2: ( ( 'EQUAL' ) )
                    {
                    // InternalQL.g:1049:2: ( ( 'EQUAL' ) )
                    // InternalQL.g:1050:3: ( 'EQUAL' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getEQUALEnumLiteralDeclaration_4()); 
                    // InternalQL.g:1051:3: ( 'EQUAL' )
                    // InternalQL.g:1051:4: 'EQUAL'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getEQUALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalQL.g:1055:2: ( ( 'NOTEQUAL' ) )
                    {
                    // InternalQL.g:1055:2: ( ( 'NOTEQUAL' ) )
                    // InternalQL.g:1056:3: ( 'NOTEQUAL' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getNOTEQUALEnumLiteralDeclaration_5()); 
                    // InternalQL.g:1057:3: ( 'NOTEQUAL' )
                    // InternalQL.g:1057:4: 'NOTEQUAL'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getNOTEQUALEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalQL.g:1061:2: ( ( 'GREATER' ) )
                    {
                    // InternalQL.g:1061:2: ( ( 'GREATER' ) )
                    // InternalQL.g:1062:3: ( 'GREATER' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getGREATEREnumLiteralDeclaration_6()); 
                    // InternalQL.g:1063:3: ( 'GREATER' )
                    // InternalQL.g:1063:4: 'GREATER'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getGREATEREnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalQL.g:1067:2: ( ( 'LOWER' ) )
                    {
                    // InternalQL.g:1067:2: ( ( 'LOWER' ) )
                    // InternalQL.g:1068:3: ( 'LOWER' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getLOWEREnumLiteralDeclaration_7()); 
                    // InternalQL.g:1069:3: ( 'LOWER' )
                    // InternalQL.g:1069:4: 'LOWER'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getLOWEREnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalQL.g:1073:2: ( ( 'GREATEROREQUAL' ) )
                    {
                    // InternalQL.g:1073:2: ( ( 'GREATEROREQUAL' ) )
                    // InternalQL.g:1074:3: ( 'GREATEROREQUAL' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_8()); 
                    // InternalQL.g:1075:3: ( 'GREATEROREQUAL' )
                    // InternalQL.g:1075:4: 'GREATEROREQUAL'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalQL.g:1079:2: ( ( 'LOWEROREQUAL' ) )
                    {
                    // InternalQL.g:1079:2: ( ( 'LOWEROREQUAL' ) )
                    // InternalQL.g:1080:3: ( 'LOWEROREQUAL' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getLOWEROREQUALEnumLiteralDeclaration_9()); 
                    // InternalQL.g:1081:3: ( 'LOWEROREQUAL' )
                    // InternalQL.g:1081:4: 'LOWEROREQUAL'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getLOWEROREQUALEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalQL.g:1085:2: ( ( 'AND' ) )
                    {
                    // InternalQL.g:1085:2: ( ( 'AND' ) )
                    // InternalQL.g:1086:3: ( 'AND' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getANDEnumLiteralDeclaration_10()); 
                    // InternalQL.g:1087:3: ( 'AND' )
                    // InternalQL.g:1087:4: 'AND'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getANDEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalQL.g:1091:2: ( ( 'OR' ) )
                    {
                    // InternalQL.g:1091:2: ( ( 'OR' ) )
                    // InternalQL.g:1092:3: ( 'OR' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getOREnumLiteralDeclaration_11()); 
                    // InternalQL.g:1093:3: ( 'OR' )
                    // InternalQL.g:1093:4: 'OR'
                    {
                    match(input,25,FOLLOW_2); 

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
    // InternalQL.g:1101:1: rule__UnaryOperatorKind__Alternatives : ( ( ( 'UNARYMINUS' ) ) | ( ( 'NOT' ) ) );
    public final void rule__UnaryOperatorKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1105:1: ( ( ( 'UNARYMINUS' ) ) | ( ( 'NOT' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            else if ( (LA8_0==27) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalQL.g:1106:2: ( ( 'UNARYMINUS' ) )
                    {
                    // InternalQL.g:1106:2: ( ( 'UNARYMINUS' ) )
                    // InternalQL.g:1107:3: ( 'UNARYMINUS' )
                    {
                     before(grammarAccess.getUnaryOperatorKindAccess().getUNARYMINUSEnumLiteralDeclaration_0()); 
                    // InternalQL.g:1108:3: ( 'UNARYMINUS' )
                    // InternalQL.g:1108:4: 'UNARYMINUS'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getUnaryOperatorKindAccess().getUNARYMINUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:1112:2: ( ( 'NOT' ) )
                    {
                    // InternalQL.g:1112:2: ( ( 'NOT' ) )
                    // InternalQL.g:1113:3: ( 'NOT' )
                    {
                     before(grammarAccess.getUnaryOperatorKindAccess().getNOTEnumLiteralDeclaration_1()); 
                    // InternalQL.g:1114:3: ( 'NOT' )
                    // InternalQL.g:1114:4: 'NOT'
                    {
                    match(input,27,FOLLOW_2); 

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


    // $ANTLR start "rule__QLModel__Group__0"
    // InternalQL.g:1122:1: rule__QLModel__Group__0 : rule__QLModel__Group__0__Impl rule__QLModel__Group__1 ;
    public final void rule__QLModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1126:1: ( rule__QLModel__Group__0__Impl rule__QLModel__Group__1 )
            // InternalQL.g:1127:2: rule__QLModel__Group__0__Impl rule__QLModel__Group__1
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
    // InternalQL.g:1134:1: rule__QLModel__Group__0__Impl : ( () ) ;
    public final void rule__QLModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1138:1: ( ( () ) )
            // InternalQL.g:1139:1: ( () )
            {
            // InternalQL.g:1139:1: ( () )
            // InternalQL.g:1140:2: ()
            {
             before(grammarAccess.getQLModelAccess().getQLModelAction_0()); 
            // InternalQL.g:1141:2: ()
            // InternalQL.g:1141:3: 
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
    // InternalQL.g:1149:1: rule__QLModel__Group__1 : rule__QLModel__Group__1__Impl rule__QLModel__Group__2 ;
    public final void rule__QLModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1153:1: ( rule__QLModel__Group__1__Impl rule__QLModel__Group__2 )
            // InternalQL.g:1154:2: rule__QLModel__Group__1__Impl rule__QLModel__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalQL.g:1161:1: rule__QLModel__Group__1__Impl : ( ( rule__QLModel__CanSubmitAssignment_1 )? ) ;
    public final void rule__QLModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1165:1: ( ( ( rule__QLModel__CanSubmitAssignment_1 )? ) )
            // InternalQL.g:1166:1: ( ( rule__QLModel__CanSubmitAssignment_1 )? )
            {
            // InternalQL.g:1166:1: ( ( rule__QLModel__CanSubmitAssignment_1 )? )
            // InternalQL.g:1167:2: ( rule__QLModel__CanSubmitAssignment_1 )?
            {
             before(grammarAccess.getQLModelAccess().getCanSubmitAssignment_1()); 
            // InternalQL.g:1168:2: ( rule__QLModel__CanSubmitAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==83) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalQL.g:1168:3: rule__QLModel__CanSubmitAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__QLModel__CanSubmitAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQLModelAccess().getCanSubmitAssignment_1()); 

            }


            }

        }
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
    // InternalQL.g:1176:1: rule__QLModel__Group__2 : rule__QLModel__Group__2__Impl rule__QLModel__Group__3 ;
    public final void rule__QLModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1180:1: ( rule__QLModel__Group__2__Impl rule__QLModel__Group__3 )
            // InternalQL.g:1181:2: rule__QLModel__Group__2__Impl rule__QLModel__Group__3
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
    // InternalQL.g:1188:1: rule__QLModel__Group__2__Impl : ( 'QLModel' ) ;
    public final void rule__QLModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1192:1: ( ( 'QLModel' ) )
            // InternalQL.g:1193:1: ( 'QLModel' )
            {
            // InternalQL.g:1193:1: ( 'QLModel' )
            // InternalQL.g:1194:2: 'QLModel'
            {
             before(grammarAccess.getQLModelAccess().getQLModelKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getQLModelAccess().getQLModelKeyword_2()); 

            }


            }

        }
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
    // InternalQL.g:1203:1: rule__QLModel__Group__3 : rule__QLModel__Group__3__Impl rule__QLModel__Group__4 ;
    public final void rule__QLModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1207:1: ( rule__QLModel__Group__3__Impl rule__QLModel__Group__4 )
            // InternalQL.g:1208:2: rule__QLModel__Group__3__Impl rule__QLModel__Group__4
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
    // InternalQL.g:1215:1: rule__QLModel__Group__3__Impl : ( '{' ) ;
    public final void rule__QLModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1219:1: ( ( '{' ) )
            // InternalQL.g:1220:1: ( '{' )
            {
            // InternalQL.g:1220:1: ( '{' )
            // InternalQL.g:1221:2: '{'
            {
             before(grammarAccess.getQLModelAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
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
    // InternalQL.g:1230:1: rule__QLModel__Group__4 : rule__QLModel__Group__4__Impl rule__QLModel__Group__5 ;
    public final void rule__QLModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1234:1: ( rule__QLModel__Group__4__Impl rule__QLModel__Group__5 )
            // InternalQL.g:1235:2: rule__QLModel__Group__4__Impl rule__QLModel__Group__5
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
    // InternalQL.g:1242:1: rule__QLModel__Group__4__Impl : ( ( rule__QLModel__Group_4__0 )? ) ;
    public final void rule__QLModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1246:1: ( ( ( rule__QLModel__Group_4__0 )? ) )
            // InternalQL.g:1247:1: ( ( rule__QLModel__Group_4__0 )? )
            {
            // InternalQL.g:1247:1: ( ( rule__QLModel__Group_4__0 )? )
            // InternalQL.g:1248:2: ( rule__QLModel__Group_4__0 )?
            {
             before(grammarAccess.getQLModelAccess().getGroup_4()); 
            // InternalQL.g:1249:2: ( rule__QLModel__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalQL.g:1249:3: rule__QLModel__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QLModel__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQLModelAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalQL.g:1257:1: rule__QLModel__Group__5 : rule__QLModel__Group__5__Impl rule__QLModel__Group__6 ;
    public final void rule__QLModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1261:1: ( rule__QLModel__Group__5__Impl rule__QLModel__Group__6 )
            // InternalQL.g:1262:2: rule__QLModel__Group__5__Impl rule__QLModel__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__QLModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group__6();

            state._fsp--;


            }

        }
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
    // InternalQL.g:1269:1: rule__QLModel__Group__5__Impl : ( ( rule__QLModel__Group_5__0 )? ) ;
    public final void rule__QLModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1273:1: ( ( ( rule__QLModel__Group_5__0 )? ) )
            // InternalQL.g:1274:1: ( ( rule__QLModel__Group_5__0 )? )
            {
            // InternalQL.g:1274:1: ( ( rule__QLModel__Group_5__0 )? )
            // InternalQL.g:1275:2: ( rule__QLModel__Group_5__0 )?
            {
             before(grammarAccess.getQLModelAccess().getGroup_5()); 
            // InternalQL.g:1276:2: ( rule__QLModel__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==32) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalQL.g:1276:3: rule__QLModel__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QLModel__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQLModelAccess().getGroup_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__QLModel__Group__6"
    // InternalQL.g:1284:1: rule__QLModel__Group__6 : rule__QLModel__Group__6__Impl rule__QLModel__Group__7 ;
    public final void rule__QLModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1288:1: ( rule__QLModel__Group__6__Impl rule__QLModel__Group__7 )
            // InternalQL.g:1289:2: rule__QLModel__Group__6__Impl rule__QLModel__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__QLModel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group__6"


    // $ANTLR start "rule__QLModel__Group__6__Impl"
    // InternalQL.g:1296:1: rule__QLModel__Group__6__Impl : ( ( rule__QLModel__Group_6__0 )? ) ;
    public final void rule__QLModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1300:1: ( ( ( rule__QLModel__Group_6__0 )? ) )
            // InternalQL.g:1301:1: ( ( rule__QLModel__Group_6__0 )? )
            {
            // InternalQL.g:1301:1: ( ( rule__QLModel__Group_6__0 )? )
            // InternalQL.g:1302:2: ( rule__QLModel__Group_6__0 )?
            {
             before(grammarAccess.getQLModelAccess().getGroup_6()); 
            // InternalQL.g:1303:2: ( rule__QLModel__Group_6__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==34) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalQL.g:1303:3: rule__QLModel__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QLModel__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQLModelAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group__6__Impl"


    // $ANTLR start "rule__QLModel__Group__7"
    // InternalQL.g:1311:1: rule__QLModel__Group__7 : rule__QLModel__Group__7__Impl ;
    public final void rule__QLModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1315:1: ( rule__QLModel__Group__7__Impl )
            // InternalQL.g:1316:2: rule__QLModel__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QLModel__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group__7"


    // $ANTLR start "rule__QLModel__Group__7__Impl"
    // InternalQL.g:1322:1: rule__QLModel__Group__7__Impl : ( '}' ) ;
    public final void rule__QLModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1326:1: ( ( '}' ) )
            // InternalQL.g:1327:1: ( '}' )
            {
            // InternalQL.g:1327:1: ( '}' )
            // InternalQL.g:1328:2: '}'
            {
             before(grammarAccess.getQLModelAccess().getRightCurlyBracketKeyword_7()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getQLModelAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group__7__Impl"


    // $ANTLR start "rule__QLModel__Group_4__0"
    // InternalQL.g:1338:1: rule__QLModel__Group_4__0 : rule__QLModel__Group_4__0__Impl rule__QLModel__Group_4__1 ;
    public final void rule__QLModel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1342:1: ( rule__QLModel__Group_4__0__Impl rule__QLModel__Group_4__1 )
            // InternalQL.g:1343:2: rule__QLModel__Group_4__0__Impl rule__QLModel__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__QLModel__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_4__0"


    // $ANTLR start "rule__QLModel__Group_4__0__Impl"
    // InternalQL.g:1350:1: rule__QLModel__Group_4__0__Impl : ( 'submitDate' ) ;
    public final void rule__QLModel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1354:1: ( ( 'submitDate' ) )
            // InternalQL.g:1355:1: ( 'submitDate' )
            {
            // InternalQL.g:1355:1: ( 'submitDate' )
            // InternalQL.g:1356:2: 'submitDate'
            {
             before(grammarAccess.getQLModelAccess().getSubmitDateKeyword_4_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getQLModelAccess().getSubmitDateKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_4__0__Impl"


    // $ANTLR start "rule__QLModel__Group_4__1"
    // InternalQL.g:1365:1: rule__QLModel__Group_4__1 : rule__QLModel__Group_4__1__Impl ;
    public final void rule__QLModel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1369:1: ( rule__QLModel__Group_4__1__Impl )
            // InternalQL.g:1370:2: rule__QLModel__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QLModel__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_4__1"


    // $ANTLR start "rule__QLModel__Group_4__1__Impl"
    // InternalQL.g:1376:1: rule__QLModel__Group_4__1__Impl : ( ( rule__QLModel__SubmitDateAssignment_4_1 ) ) ;
    public final void rule__QLModel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1380:1: ( ( ( rule__QLModel__SubmitDateAssignment_4_1 ) ) )
            // InternalQL.g:1381:1: ( ( rule__QLModel__SubmitDateAssignment_4_1 ) )
            {
            // InternalQL.g:1381:1: ( ( rule__QLModel__SubmitDateAssignment_4_1 ) )
            // InternalQL.g:1382:2: ( rule__QLModel__SubmitDateAssignment_4_1 )
            {
             before(grammarAccess.getQLModelAccess().getSubmitDateAssignment_4_1()); 
            // InternalQL.g:1383:2: ( rule__QLModel__SubmitDateAssignment_4_1 )
            // InternalQL.g:1383:3: rule__QLModel__SubmitDateAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__QLModel__SubmitDateAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getQLModelAccess().getSubmitDateAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_4__1__Impl"


    // $ANTLR start "rule__QLModel__Group_5__0"
    // InternalQL.g:1392:1: rule__QLModel__Group_5__0 : rule__QLModel__Group_5__0__Impl rule__QLModel__Group_5__1 ;
    public final void rule__QLModel__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1396:1: ( rule__QLModel__Group_5__0__Impl rule__QLModel__Group_5__1 )
            // InternalQL.g:1397:2: rule__QLModel__Group_5__0__Impl rule__QLModel__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__QLModel__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_5__0"


    // $ANTLR start "rule__QLModel__Group_5__0__Impl"
    // InternalQL.g:1404:1: rule__QLModel__Group_5__0__Impl : ( 'forms' ) ;
    public final void rule__QLModel__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1408:1: ( ( 'forms' ) )
            // InternalQL.g:1409:1: ( 'forms' )
            {
            // InternalQL.g:1409:1: ( 'forms' )
            // InternalQL.g:1410:2: 'forms'
            {
             before(grammarAccess.getQLModelAccess().getFormsKeyword_5_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getQLModelAccess().getFormsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_5__0__Impl"


    // $ANTLR start "rule__QLModel__Group_5__1"
    // InternalQL.g:1419:1: rule__QLModel__Group_5__1 : rule__QLModel__Group_5__1__Impl rule__QLModel__Group_5__2 ;
    public final void rule__QLModel__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1423:1: ( rule__QLModel__Group_5__1__Impl rule__QLModel__Group_5__2 )
            // InternalQL.g:1424:2: rule__QLModel__Group_5__1__Impl rule__QLModel__Group_5__2
            {
            pushFollow(FOLLOW_7);
            rule__QLModel__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_5__1"


    // $ANTLR start "rule__QLModel__Group_5__1__Impl"
    // InternalQL.g:1431:1: rule__QLModel__Group_5__1__Impl : ( '{' ) ;
    public final void rule__QLModel__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1435:1: ( ( '{' ) )
            // InternalQL.g:1436:1: ( '{' )
            {
            // InternalQL.g:1436:1: ( '{' )
            // InternalQL.g:1437:2: '{'
            {
             before(grammarAccess.getQLModelAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getQLModelAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_5__1__Impl"


    // $ANTLR start "rule__QLModel__Group_5__2"
    // InternalQL.g:1446:1: rule__QLModel__Group_5__2 : rule__QLModel__Group_5__2__Impl rule__QLModel__Group_5__3 ;
    public final void rule__QLModel__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1450:1: ( rule__QLModel__Group_5__2__Impl rule__QLModel__Group_5__3 )
            // InternalQL.g:1451:2: rule__QLModel__Group_5__2__Impl rule__QLModel__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__QLModel__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_5__2"


    // $ANTLR start "rule__QLModel__Group_5__2__Impl"
    // InternalQL.g:1458:1: rule__QLModel__Group_5__2__Impl : ( ( rule__QLModel__FormsAssignment_5_2 ) ) ;
    public final void rule__QLModel__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1462:1: ( ( ( rule__QLModel__FormsAssignment_5_2 ) ) )
            // InternalQL.g:1463:1: ( ( rule__QLModel__FormsAssignment_5_2 ) )
            {
            // InternalQL.g:1463:1: ( ( rule__QLModel__FormsAssignment_5_2 ) )
            // InternalQL.g:1464:2: ( rule__QLModel__FormsAssignment_5_2 )
            {
             before(grammarAccess.getQLModelAccess().getFormsAssignment_5_2()); 
            // InternalQL.g:1465:2: ( rule__QLModel__FormsAssignment_5_2 )
            // InternalQL.g:1465:3: rule__QLModel__FormsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__QLModel__FormsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getQLModelAccess().getFormsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_5__2__Impl"


    // $ANTLR start "rule__QLModel__Group_5__3"
    // InternalQL.g:1473:1: rule__QLModel__Group_5__3 : rule__QLModel__Group_5__3__Impl rule__QLModel__Group_5__4 ;
    public final void rule__QLModel__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1477:1: ( rule__QLModel__Group_5__3__Impl rule__QLModel__Group_5__4 )
            // InternalQL.g:1478:2: rule__QLModel__Group_5__3__Impl rule__QLModel__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__QLModel__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_5__3"


    // $ANTLR start "rule__QLModel__Group_5__3__Impl"
    // InternalQL.g:1485:1: rule__QLModel__Group_5__3__Impl : ( ( rule__QLModel__Group_5_3__0 )* ) ;
    public final void rule__QLModel__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1489:1: ( ( ( rule__QLModel__Group_5_3__0 )* ) )
            // InternalQL.g:1490:1: ( ( rule__QLModel__Group_5_3__0 )* )
            {
            // InternalQL.g:1490:1: ( ( rule__QLModel__Group_5_3__0 )* )
            // InternalQL.g:1491:2: ( rule__QLModel__Group_5_3__0 )*
            {
             before(grammarAccess.getQLModelAccess().getGroup_5_3()); 
            // InternalQL.g:1492:2: ( rule__QLModel__Group_5_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==33) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalQL.g:1492:3: rule__QLModel__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QLModel__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getQLModelAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_5__3__Impl"


    // $ANTLR start "rule__QLModel__Group_5__4"
    // InternalQL.g:1500:1: rule__QLModel__Group_5__4 : rule__QLModel__Group_5__4__Impl ;
    public final void rule__QLModel__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1504:1: ( rule__QLModel__Group_5__4__Impl )
            // InternalQL.g:1505:2: rule__QLModel__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QLModel__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_5__4"


    // $ANTLR start "rule__QLModel__Group_5__4__Impl"
    // InternalQL.g:1511:1: rule__QLModel__Group_5__4__Impl : ( '}' ) ;
    public final void rule__QLModel__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1515:1: ( ( '}' ) )
            // InternalQL.g:1516:1: ( '}' )
            {
            // InternalQL.g:1516:1: ( '}' )
            // InternalQL.g:1517:2: '}'
            {
             before(grammarAccess.getQLModelAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getQLModelAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_5__4__Impl"


    // $ANTLR start "rule__QLModel__Group_5_3__0"
    // InternalQL.g:1527:1: rule__QLModel__Group_5_3__0 : rule__QLModel__Group_5_3__0__Impl rule__QLModel__Group_5_3__1 ;
    public final void rule__QLModel__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1531:1: ( rule__QLModel__Group_5_3__0__Impl rule__QLModel__Group_5_3__1 )
            // InternalQL.g:1532:2: rule__QLModel__Group_5_3__0__Impl rule__QLModel__Group_5_3__1
            {
            pushFollow(FOLLOW_7);
            rule__QLModel__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_5_3__0"


    // $ANTLR start "rule__QLModel__Group_5_3__0__Impl"
    // InternalQL.g:1539:1: rule__QLModel__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__QLModel__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1543:1: ( ( ',' ) )
            // InternalQL.g:1544:1: ( ',' )
            {
            // InternalQL.g:1544:1: ( ',' )
            // InternalQL.g:1545:2: ','
            {
             before(grammarAccess.getQLModelAccess().getCommaKeyword_5_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getQLModelAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_5_3__0__Impl"


    // $ANTLR start "rule__QLModel__Group_5_3__1"
    // InternalQL.g:1554:1: rule__QLModel__Group_5_3__1 : rule__QLModel__Group_5_3__1__Impl ;
    public final void rule__QLModel__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1558:1: ( rule__QLModel__Group_5_3__1__Impl )
            // InternalQL.g:1559:2: rule__QLModel__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QLModel__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_5_3__1"


    // $ANTLR start "rule__QLModel__Group_5_3__1__Impl"
    // InternalQL.g:1565:1: rule__QLModel__Group_5_3__1__Impl : ( ( rule__QLModel__FormsAssignment_5_3_1 ) ) ;
    public final void rule__QLModel__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1569:1: ( ( ( rule__QLModel__FormsAssignment_5_3_1 ) ) )
            // InternalQL.g:1570:1: ( ( rule__QLModel__FormsAssignment_5_3_1 ) )
            {
            // InternalQL.g:1570:1: ( ( rule__QLModel__FormsAssignment_5_3_1 ) )
            // InternalQL.g:1571:2: ( rule__QLModel__FormsAssignment_5_3_1 )
            {
             before(grammarAccess.getQLModelAccess().getFormsAssignment_5_3_1()); 
            // InternalQL.g:1572:2: ( rule__QLModel__FormsAssignment_5_3_1 )
            // InternalQL.g:1572:3: rule__QLModel__FormsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__QLModel__FormsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getQLModelAccess().getFormsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_5_3__1__Impl"


    // $ANTLR start "rule__QLModel__Group_6__0"
    // InternalQL.g:1581:1: rule__QLModel__Group_6__0 : rule__QLModel__Group_6__0__Impl rule__QLModel__Group_6__1 ;
    public final void rule__QLModel__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1585:1: ( rule__QLModel__Group_6__0__Impl rule__QLModel__Group_6__1 )
            // InternalQL.g:1586:2: rule__QLModel__Group_6__0__Impl rule__QLModel__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__QLModel__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_6__0"


    // $ANTLR start "rule__QLModel__Group_6__0__Impl"
    // InternalQL.g:1593:1: rule__QLModel__Group_6__0__Impl : ( 'definitionGroup' ) ;
    public final void rule__QLModel__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1597:1: ( ( 'definitionGroup' ) )
            // InternalQL.g:1598:1: ( 'definitionGroup' )
            {
            // InternalQL.g:1598:1: ( 'definitionGroup' )
            // InternalQL.g:1599:2: 'definitionGroup'
            {
             before(grammarAccess.getQLModelAccess().getDefinitionGroupKeyword_6_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getQLModelAccess().getDefinitionGroupKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_6__0__Impl"


    // $ANTLR start "rule__QLModel__Group_6__1"
    // InternalQL.g:1608:1: rule__QLModel__Group_6__1 : rule__QLModel__Group_6__1__Impl rule__QLModel__Group_6__2 ;
    public final void rule__QLModel__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1612:1: ( rule__QLModel__Group_6__1__Impl rule__QLModel__Group_6__2 )
            // InternalQL.g:1613:2: rule__QLModel__Group_6__1__Impl rule__QLModel__Group_6__2
            {
            pushFollow(FOLLOW_10);
            rule__QLModel__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_6__1"


    // $ANTLR start "rule__QLModel__Group_6__1__Impl"
    // InternalQL.g:1620:1: rule__QLModel__Group_6__1__Impl : ( '{' ) ;
    public final void rule__QLModel__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1624:1: ( ( '{' ) )
            // InternalQL.g:1625:1: ( '{' )
            {
            // InternalQL.g:1625:1: ( '{' )
            // InternalQL.g:1626:2: '{'
            {
             before(grammarAccess.getQLModelAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getQLModelAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_6__1__Impl"


    // $ANTLR start "rule__QLModel__Group_6__2"
    // InternalQL.g:1635:1: rule__QLModel__Group_6__2 : rule__QLModel__Group_6__2__Impl rule__QLModel__Group_6__3 ;
    public final void rule__QLModel__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1639:1: ( rule__QLModel__Group_6__2__Impl rule__QLModel__Group_6__3 )
            // InternalQL.g:1640:2: rule__QLModel__Group_6__2__Impl rule__QLModel__Group_6__3
            {
            pushFollow(FOLLOW_8);
            rule__QLModel__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_6__2"


    // $ANTLR start "rule__QLModel__Group_6__2__Impl"
    // InternalQL.g:1647:1: rule__QLModel__Group_6__2__Impl : ( ( rule__QLModel__DefinitionGroupAssignment_6_2 ) ) ;
    public final void rule__QLModel__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1651:1: ( ( ( rule__QLModel__DefinitionGroupAssignment_6_2 ) ) )
            // InternalQL.g:1652:1: ( ( rule__QLModel__DefinitionGroupAssignment_6_2 ) )
            {
            // InternalQL.g:1652:1: ( ( rule__QLModel__DefinitionGroupAssignment_6_2 ) )
            // InternalQL.g:1653:2: ( rule__QLModel__DefinitionGroupAssignment_6_2 )
            {
             before(grammarAccess.getQLModelAccess().getDefinitionGroupAssignment_6_2()); 
            // InternalQL.g:1654:2: ( rule__QLModel__DefinitionGroupAssignment_6_2 )
            // InternalQL.g:1654:3: rule__QLModel__DefinitionGroupAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__QLModel__DefinitionGroupAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getQLModelAccess().getDefinitionGroupAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_6__2__Impl"


    // $ANTLR start "rule__QLModel__Group_6__3"
    // InternalQL.g:1662:1: rule__QLModel__Group_6__3 : rule__QLModel__Group_6__3__Impl rule__QLModel__Group_6__4 ;
    public final void rule__QLModel__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1666:1: ( rule__QLModel__Group_6__3__Impl rule__QLModel__Group_6__4 )
            // InternalQL.g:1667:2: rule__QLModel__Group_6__3__Impl rule__QLModel__Group_6__4
            {
            pushFollow(FOLLOW_8);
            rule__QLModel__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_6__3"


    // $ANTLR start "rule__QLModel__Group_6__3__Impl"
    // InternalQL.g:1674:1: rule__QLModel__Group_6__3__Impl : ( ( rule__QLModel__Group_6_3__0 )* ) ;
    public final void rule__QLModel__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1678:1: ( ( ( rule__QLModel__Group_6_3__0 )* ) )
            // InternalQL.g:1679:1: ( ( rule__QLModel__Group_6_3__0 )* )
            {
            // InternalQL.g:1679:1: ( ( rule__QLModel__Group_6_3__0 )* )
            // InternalQL.g:1680:2: ( rule__QLModel__Group_6_3__0 )*
            {
             before(grammarAccess.getQLModelAccess().getGroup_6_3()); 
            // InternalQL.g:1681:2: ( rule__QLModel__Group_6_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==33) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalQL.g:1681:3: rule__QLModel__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QLModel__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getQLModelAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_6__3__Impl"


    // $ANTLR start "rule__QLModel__Group_6__4"
    // InternalQL.g:1689:1: rule__QLModel__Group_6__4 : rule__QLModel__Group_6__4__Impl ;
    public final void rule__QLModel__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1693:1: ( rule__QLModel__Group_6__4__Impl )
            // InternalQL.g:1694:2: rule__QLModel__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QLModel__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_6__4"


    // $ANTLR start "rule__QLModel__Group_6__4__Impl"
    // InternalQL.g:1700:1: rule__QLModel__Group_6__4__Impl : ( '}' ) ;
    public final void rule__QLModel__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1704:1: ( ( '}' ) )
            // InternalQL.g:1705:1: ( '}' )
            {
            // InternalQL.g:1705:1: ( '}' )
            // InternalQL.g:1706:2: '}'
            {
             before(grammarAccess.getQLModelAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getQLModelAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_6__4__Impl"


    // $ANTLR start "rule__QLModel__Group_6_3__0"
    // InternalQL.g:1716:1: rule__QLModel__Group_6_3__0 : rule__QLModel__Group_6_3__0__Impl rule__QLModel__Group_6_3__1 ;
    public final void rule__QLModel__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1720:1: ( rule__QLModel__Group_6_3__0__Impl rule__QLModel__Group_6_3__1 )
            // InternalQL.g:1721:2: rule__QLModel__Group_6_3__0__Impl rule__QLModel__Group_6_3__1
            {
            pushFollow(FOLLOW_10);
            rule__QLModel__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_6_3__0"


    // $ANTLR start "rule__QLModel__Group_6_3__0__Impl"
    // InternalQL.g:1728:1: rule__QLModel__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__QLModel__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1732:1: ( ( ',' ) )
            // InternalQL.g:1733:1: ( ',' )
            {
            // InternalQL.g:1733:1: ( ',' )
            // InternalQL.g:1734:2: ','
            {
             before(grammarAccess.getQLModelAccess().getCommaKeyword_6_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getQLModelAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_6_3__0__Impl"


    // $ANTLR start "rule__QLModel__Group_6_3__1"
    // InternalQL.g:1743:1: rule__QLModel__Group_6_3__1 : rule__QLModel__Group_6_3__1__Impl ;
    public final void rule__QLModel__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1747:1: ( rule__QLModel__Group_6_3__1__Impl )
            // InternalQL.g:1748:2: rule__QLModel__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QLModel__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_6_3__1"


    // $ANTLR start "rule__QLModel__Group_6_3__1__Impl"
    // InternalQL.g:1754:1: rule__QLModel__Group_6_3__1__Impl : ( ( rule__QLModel__DefinitionGroupAssignment_6_3_1 ) ) ;
    public final void rule__QLModel__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1758:1: ( ( ( rule__QLModel__DefinitionGroupAssignment_6_3_1 ) ) )
            // InternalQL.g:1759:1: ( ( rule__QLModel__DefinitionGroupAssignment_6_3_1 ) )
            {
            // InternalQL.g:1759:1: ( ( rule__QLModel__DefinitionGroupAssignment_6_3_1 ) )
            // InternalQL.g:1760:2: ( rule__QLModel__DefinitionGroupAssignment_6_3_1 )
            {
             before(grammarAccess.getQLModelAccess().getDefinitionGroupAssignment_6_3_1()); 
            // InternalQL.g:1761:2: ( rule__QLModel__DefinitionGroupAssignment_6_3_1 )
            // InternalQL.g:1761:3: rule__QLModel__DefinitionGroupAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__QLModel__DefinitionGroupAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getQLModelAccess().getDefinitionGroupAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_6_3__1__Impl"


    // $ANTLR start "rule__Form__Group__0"
    // InternalQL.g:1770:1: rule__Form__Group__0 : rule__Form__Group__0__Impl rule__Form__Group__1 ;
    public final void rule__Form__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1774:1: ( rule__Form__Group__0__Impl rule__Form__Group__1 )
            // InternalQL.g:1775:2: rule__Form__Group__0__Impl rule__Form__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalQL.g:1782:1: rule__Form__Group__0__Impl : ( 'Form' ) ;
    public final void rule__Form__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1786:1: ( ( 'Form' ) )
            // InternalQL.g:1787:1: ( 'Form' )
            {
            // InternalQL.g:1787:1: ( 'Form' )
            // InternalQL.g:1788:2: 'Form'
            {
             before(grammarAccess.getFormAccess().getFormKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalQL.g:1797:1: rule__Form__Group__1 : rule__Form__Group__1__Impl rule__Form__Group__2 ;
    public final void rule__Form__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1801:1: ( rule__Form__Group__1__Impl rule__Form__Group__2 )
            // InternalQL.g:1802:2: rule__Form__Group__1__Impl rule__Form__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalQL.g:1809:1: rule__Form__Group__1__Impl : ( ( rule__Form__NameAssignment_1 ) ) ;
    public final void rule__Form__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1813:1: ( ( ( rule__Form__NameAssignment_1 ) ) )
            // InternalQL.g:1814:1: ( ( rule__Form__NameAssignment_1 ) )
            {
            // InternalQL.g:1814:1: ( ( rule__Form__NameAssignment_1 ) )
            // InternalQL.g:1815:2: ( rule__Form__NameAssignment_1 )
            {
             before(grammarAccess.getFormAccess().getNameAssignment_1()); 
            // InternalQL.g:1816:2: ( rule__Form__NameAssignment_1 )
            // InternalQL.g:1816:3: rule__Form__NameAssignment_1
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
    // InternalQL.g:1824:1: rule__Form__Group__2 : rule__Form__Group__2__Impl rule__Form__Group__3 ;
    public final void rule__Form__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1828:1: ( rule__Form__Group__2__Impl rule__Form__Group__3 )
            // InternalQL.g:1829:2: rule__Form__Group__2__Impl rule__Form__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Form__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group__3();

            state._fsp--;


            }

        }
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
    // InternalQL.g:1836:1: rule__Form__Group__2__Impl : ( '{' ) ;
    public final void rule__Form__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1840:1: ( ( '{' ) )
            // InternalQL.g:1841:1: ( '{' )
            {
            // InternalQL.g:1841:1: ( '{' )
            // InternalQL.g:1842:2: '{'
            {
             before(grammarAccess.getFormAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getFormAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Form__Group__3"
    // InternalQL.g:1851:1: rule__Form__Group__3 : rule__Form__Group__3__Impl rule__Form__Group__4 ;
    public final void rule__Form__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1855:1: ( rule__Form__Group__3__Impl rule__Form__Group__4 )
            // InternalQL.g:1856:2: rule__Form__Group__3__Impl rule__Form__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Form__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__3"


    // $ANTLR start "rule__Form__Group__3__Impl"
    // InternalQL.g:1863:1: rule__Form__Group__3__Impl : ( 'questionGroup' ) ;
    public final void rule__Form__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1867:1: ( ( 'questionGroup' ) )
            // InternalQL.g:1868:1: ( 'questionGroup' )
            {
            // InternalQL.g:1868:1: ( 'questionGroup' )
            // InternalQL.g:1869:2: 'questionGroup'
            {
             before(grammarAccess.getFormAccess().getQuestionGroupKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getFormAccess().getQuestionGroupKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__3__Impl"


    // $ANTLR start "rule__Form__Group__4"
    // InternalQL.g:1878:1: rule__Form__Group__4 : rule__Form__Group__4__Impl rule__Form__Group__5 ;
    public final void rule__Form__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1882:1: ( rule__Form__Group__4__Impl rule__Form__Group__5 )
            // InternalQL.g:1883:2: rule__Form__Group__4__Impl rule__Form__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Form__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__4"


    // $ANTLR start "rule__Form__Group__4__Impl"
    // InternalQL.g:1890:1: rule__Form__Group__4__Impl : ( ( rule__Form__QuestionGroupAssignment_4 ) ) ;
    public final void rule__Form__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1894:1: ( ( ( rule__Form__QuestionGroupAssignment_4 ) ) )
            // InternalQL.g:1895:1: ( ( rule__Form__QuestionGroupAssignment_4 ) )
            {
            // InternalQL.g:1895:1: ( ( rule__Form__QuestionGroupAssignment_4 ) )
            // InternalQL.g:1896:2: ( rule__Form__QuestionGroupAssignment_4 )
            {
             before(grammarAccess.getFormAccess().getQuestionGroupAssignment_4()); 
            // InternalQL.g:1897:2: ( rule__Form__QuestionGroupAssignment_4 )
            // InternalQL.g:1897:3: rule__Form__QuestionGroupAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Form__QuestionGroupAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFormAccess().getQuestionGroupAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__4__Impl"


    // $ANTLR start "rule__Form__Group__5"
    // InternalQL.g:1905:1: rule__Form__Group__5 : rule__Form__Group__5__Impl ;
    public final void rule__Form__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1909:1: ( rule__Form__Group__5__Impl )
            // InternalQL.g:1910:2: rule__Form__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Form__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__5"


    // $ANTLR start "rule__Form__Group__5__Impl"
    // InternalQL.g:1916:1: rule__Form__Group__5__Impl : ( '}' ) ;
    public final void rule__Form__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1920:1: ( ( '}' ) )
            // InternalQL.g:1921:1: ( '}' )
            {
            // InternalQL.g:1921:1: ( '}' )
            // InternalQL.g:1922:2: '}'
            {
             before(grammarAccess.getFormAccess().getRightCurlyBracketKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFormAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__5__Impl"


    // $ANTLR start "rule__DefinitionGroup__Group__0"
    // InternalQL.g:1932:1: rule__DefinitionGroup__Group__0 : rule__DefinitionGroup__Group__0__Impl rule__DefinitionGroup__Group__1 ;
    public final void rule__DefinitionGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1936:1: ( rule__DefinitionGroup__Group__0__Impl rule__DefinitionGroup__Group__1 )
            // InternalQL.g:1937:2: rule__DefinitionGroup__Group__0__Impl rule__DefinitionGroup__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalQL.g:1944:1: rule__DefinitionGroup__Group__0__Impl : ( () ) ;
    public final void rule__DefinitionGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1948:1: ( ( () ) )
            // InternalQL.g:1949:1: ( () )
            {
            // InternalQL.g:1949:1: ( () )
            // InternalQL.g:1950:2: ()
            {
             before(grammarAccess.getDefinitionGroupAccess().getDefinitionGroupAction_0()); 
            // InternalQL.g:1951:2: ()
            // InternalQL.g:1951:3: 
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
    // InternalQL.g:1959:1: rule__DefinitionGroup__Group__1 : rule__DefinitionGroup__Group__1__Impl rule__DefinitionGroup__Group__2 ;
    public final void rule__DefinitionGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1963:1: ( rule__DefinitionGroup__Group__1__Impl rule__DefinitionGroup__Group__2 )
            // InternalQL.g:1964:2: rule__DefinitionGroup__Group__1__Impl rule__DefinitionGroup__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalQL.g:1971:1: rule__DefinitionGroup__Group__1__Impl : ( 'definitions' ) ;
    public final void rule__DefinitionGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1975:1: ( ( 'definitions' ) )
            // InternalQL.g:1976:1: ( 'definitions' )
            {
            // InternalQL.g:1976:1: ( 'definitions' )
            // InternalQL.g:1977:2: 'definitions'
            {
             before(grammarAccess.getDefinitionGroupAccess().getDefinitionsKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalQL.g:1986:1: rule__DefinitionGroup__Group__2 : rule__DefinitionGroup__Group__2__Impl rule__DefinitionGroup__Group__3 ;
    public final void rule__DefinitionGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1990:1: ( rule__DefinitionGroup__Group__2__Impl rule__DefinitionGroup__Group__3 )
            // InternalQL.g:1991:2: rule__DefinitionGroup__Group__2__Impl rule__DefinitionGroup__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalQL.g:1998:1: rule__DefinitionGroup__Group__2__Impl : ( '{' ) ;
    public final void rule__DefinitionGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2002:1: ( ( '{' ) )
            // InternalQL.g:2003:1: ( '{' )
            {
            // InternalQL.g:2003:1: ( '{' )
            // InternalQL.g:2004:2: '{'
            {
             before(grammarAccess.getDefinitionGroupAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalQL.g:2013:1: rule__DefinitionGroup__Group__3 : rule__DefinitionGroup__Group__3__Impl rule__DefinitionGroup__Group__4 ;
    public final void rule__DefinitionGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2017:1: ( rule__DefinitionGroup__Group__3__Impl rule__DefinitionGroup__Group__4 )
            // InternalQL.g:2018:2: rule__DefinitionGroup__Group__3__Impl rule__DefinitionGroup__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalQL.g:2025:1: rule__DefinitionGroup__Group__3__Impl : ( ( rule__DefinitionGroup__Alternatives_3 )* ) ;
    public final void rule__DefinitionGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2029:1: ( ( ( rule__DefinitionGroup__Alternatives_3 )* ) )
            // InternalQL.g:2030:1: ( ( rule__DefinitionGroup__Alternatives_3 )* )
            {
            // InternalQL.g:2030:1: ( ( rule__DefinitionGroup__Alternatives_3 )* )
            // InternalQL.g:2031:2: ( rule__DefinitionGroup__Alternatives_3 )*
            {
             before(grammarAccess.getDefinitionGroupAccess().getAlternatives_3()); 
            // InternalQL.g:2032:2: ( rule__DefinitionGroup__Alternatives_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==44||(LA15_0>=57 && LA15_0<=58)||(LA15_0>=61 && LA15_0<=63)||LA15_0==65||LA15_0==78||(LA15_0>=85 && LA15_0<=86)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalQL.g:2032:3: rule__DefinitionGroup__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__DefinitionGroup__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalQL.g:2040:1: rule__DefinitionGroup__Group__4 : rule__DefinitionGroup__Group__4__Impl ;
    public final void rule__DefinitionGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2044:1: ( rule__DefinitionGroup__Group__4__Impl )
            // InternalQL.g:2045:2: rule__DefinitionGroup__Group__4__Impl
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
    // InternalQL.g:2051:1: rule__DefinitionGroup__Group__4__Impl : ( '}' ) ;
    public final void rule__DefinitionGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2055:1: ( ( '}' ) )
            // InternalQL.g:2056:1: ( '}' )
            {
            // InternalQL.g:2056:1: ( '}' )
            // InternalQL.g:2057:2: '}'
            {
             before(grammarAccess.getDefinitionGroupAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
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
    // InternalQL.g:2067:1: rule__QuestionGroup__Group__0 : rule__QuestionGroup__Group__0__Impl rule__QuestionGroup__Group__1 ;
    public final void rule__QuestionGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2071:1: ( rule__QuestionGroup__Group__0__Impl rule__QuestionGroup__Group__1 )
            // InternalQL.g:2072:2: rule__QuestionGroup__Group__0__Impl rule__QuestionGroup__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalQL.g:2079:1: rule__QuestionGroup__Group__0__Impl : ( () ) ;
    public final void rule__QuestionGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2083:1: ( ( () ) )
            // InternalQL.g:2084:1: ( () )
            {
            // InternalQL.g:2084:1: ( () )
            // InternalQL.g:2085:2: ()
            {
             before(grammarAccess.getQuestionGroupAccess().getQuestionGroupAction_0()); 
            // InternalQL.g:2086:2: ()
            // InternalQL.g:2086:3: 
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
    // InternalQL.g:2094:1: rule__QuestionGroup__Group__1 : rule__QuestionGroup__Group__1__Impl rule__QuestionGroup__Group__2 ;
    public final void rule__QuestionGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2098:1: ( rule__QuestionGroup__Group__1__Impl rule__QuestionGroup__Group__2 )
            // InternalQL.g:2099:2: rule__QuestionGroup__Group__1__Impl rule__QuestionGroup__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalQL.g:2106:1: rule__QuestionGroup__Group__1__Impl : ( 'QuestionGroup' ) ;
    public final void rule__QuestionGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2110:1: ( ( 'QuestionGroup' ) )
            // InternalQL.g:2111:1: ( 'QuestionGroup' )
            {
            // InternalQL.g:2111:1: ( 'QuestionGroup' )
            // InternalQL.g:2112:2: 'QuestionGroup'
            {
             before(grammarAccess.getQuestionGroupAccess().getQuestionGroupKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getQuestionGroupAccess().getQuestionGroupKeyword_1()); 

            }


            }

        }
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
    // InternalQL.g:2121:1: rule__QuestionGroup__Group__2 : rule__QuestionGroup__Group__2__Impl rule__QuestionGroup__Group__3 ;
    public final void rule__QuestionGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2125:1: ( rule__QuestionGroup__Group__2__Impl rule__QuestionGroup__Group__3 )
            // InternalQL.g:2126:2: rule__QuestionGroup__Group__2__Impl rule__QuestionGroup__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalQL.g:2133:1: rule__QuestionGroup__Group__2__Impl : ( '{' ) ;
    public final void rule__QuestionGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2137:1: ( ( '{' ) )
            // InternalQL.g:2138:1: ( '{' )
            {
            // InternalQL.g:2138:1: ( '{' )
            // InternalQL.g:2139:2: '{'
            {
             before(grammarAccess.getQuestionGroupAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalQL.g:2148:1: rule__QuestionGroup__Group__3 : rule__QuestionGroup__Group__3__Impl rule__QuestionGroup__Group__4 ;
    public final void rule__QuestionGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2152:1: ( rule__QuestionGroup__Group__3__Impl rule__QuestionGroup__Group__4 )
            // InternalQL.g:2153:2: rule__QuestionGroup__Group__3__Impl rule__QuestionGroup__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalQL.g:2160:1: rule__QuestionGroup__Group__3__Impl : ( ( rule__QuestionGroup__Group_3__0 )? ) ;
    public final void rule__QuestionGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2164:1: ( ( ( rule__QuestionGroup__Group_3__0 )? ) )
            // InternalQL.g:2165:1: ( ( rule__QuestionGroup__Group_3__0 )? )
            {
            // InternalQL.g:2165:1: ( ( rule__QuestionGroup__Group_3__0 )? )
            // InternalQL.g:2166:2: ( rule__QuestionGroup__Group_3__0 )?
            {
             before(grammarAccess.getQuestionGroupAccess().getGroup_3()); 
            // InternalQL.g:2167:2: ( rule__QuestionGroup__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==39) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalQL.g:2167:3: rule__QuestionGroup__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionGroup__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionGroupAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalQL.g:2175:1: rule__QuestionGroup__Group__4 : rule__QuestionGroup__Group__4__Impl rule__QuestionGroup__Group__5 ;
    public final void rule__QuestionGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2179:1: ( rule__QuestionGroup__Group__4__Impl rule__QuestionGroup__Group__5 )
            // InternalQL.g:2180:2: rule__QuestionGroup__Group__4__Impl rule__QuestionGroup__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__QuestionGroup__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group__5();

            state._fsp--;


            }

        }
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
    // InternalQL.g:2187:1: rule__QuestionGroup__Group__4__Impl : ( ( rule__QuestionGroup__Group_4__0 )? ) ;
    public final void rule__QuestionGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2191:1: ( ( ( rule__QuestionGroup__Group_4__0 )? ) )
            // InternalQL.g:2192:1: ( ( rule__QuestionGroup__Group_4__0 )? )
            {
            // InternalQL.g:2192:1: ( ( rule__QuestionGroup__Group_4__0 )? )
            // InternalQL.g:2193:2: ( rule__QuestionGroup__Group_4__0 )?
            {
             before(grammarAccess.getQuestionGroupAccess().getGroup_4()); 
            // InternalQL.g:2194:2: ( rule__QuestionGroup__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==40) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalQL.g:2194:3: rule__QuestionGroup__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionGroup__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionGroupAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__QuestionGroup__Group__5"
    // InternalQL.g:2202:1: rule__QuestionGroup__Group__5 : rule__QuestionGroup__Group__5__Impl rule__QuestionGroup__Group__6 ;
    public final void rule__QuestionGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2206:1: ( rule__QuestionGroup__Group__5__Impl rule__QuestionGroup__Group__6 )
            // InternalQL.g:2207:2: rule__QuestionGroup__Group__5__Impl rule__QuestionGroup__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__QuestionGroup__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group__5"


    // $ANTLR start "rule__QuestionGroup__Group__5__Impl"
    // InternalQL.g:2214:1: rule__QuestionGroup__Group__5__Impl : ( ( rule__QuestionGroup__Group_5__0 )? ) ;
    public final void rule__QuestionGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2218:1: ( ( ( rule__QuestionGroup__Group_5__0 )? ) )
            // InternalQL.g:2219:1: ( ( rule__QuestionGroup__Group_5__0 )? )
            {
            // InternalQL.g:2219:1: ( ( rule__QuestionGroup__Group_5__0 )? )
            // InternalQL.g:2220:2: ( rule__QuestionGroup__Group_5__0 )?
            {
             before(grammarAccess.getQuestionGroupAccess().getGroup_5()); 
            // InternalQL.g:2221:2: ( rule__QuestionGroup__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==41) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalQL.g:2221:3: rule__QuestionGroup__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionGroup__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionGroupAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group__5__Impl"


    // $ANTLR start "rule__QuestionGroup__Group__6"
    // InternalQL.g:2229:1: rule__QuestionGroup__Group__6 : rule__QuestionGroup__Group__6__Impl ;
    public final void rule__QuestionGroup__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2233:1: ( rule__QuestionGroup__Group__6__Impl )
            // InternalQL.g:2234:2: rule__QuestionGroup__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group__6"


    // $ANTLR start "rule__QuestionGroup__Group__6__Impl"
    // InternalQL.g:2240:1: rule__QuestionGroup__Group__6__Impl : ( '}' ) ;
    public final void rule__QuestionGroup__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2244:1: ( ( '}' ) )
            // InternalQL.g:2245:1: ( '}' )
            {
            // InternalQL.g:2245:1: ( '}' )
            // InternalQL.g:2246:2: '}'
            {
             before(grammarAccess.getQuestionGroupAccess().getRightCurlyBracketKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getQuestionGroupAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group__6__Impl"


    // $ANTLR start "rule__QuestionGroup__Group_3__0"
    // InternalQL.g:2256:1: rule__QuestionGroup__Group_3__0 : rule__QuestionGroup__Group_3__0__Impl rule__QuestionGroup__Group_3__1 ;
    public final void rule__QuestionGroup__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2260:1: ( rule__QuestionGroup__Group_3__0__Impl rule__QuestionGroup__Group_3__1 )
            // InternalQL.g:2261:2: rule__QuestionGroup__Group_3__0__Impl rule__QuestionGroup__Group_3__1
            {
            pushFollow(FOLLOW_18);
            rule__QuestionGroup__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_3__0"


    // $ANTLR start "rule__QuestionGroup__Group_3__0__Impl"
    // InternalQL.g:2268:1: rule__QuestionGroup__Group_3__0__Impl : ( 'guard' ) ;
    public final void rule__QuestionGroup__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2272:1: ( ( 'guard' ) )
            // InternalQL.g:2273:1: ( 'guard' )
            {
            // InternalQL.g:2273:1: ( 'guard' )
            // InternalQL.g:2274:2: 'guard'
            {
             before(grammarAccess.getQuestionGroupAccess().getGuardKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getQuestionGroupAccess().getGuardKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_3__0__Impl"


    // $ANTLR start "rule__QuestionGroup__Group_3__1"
    // InternalQL.g:2283:1: rule__QuestionGroup__Group_3__1 : rule__QuestionGroup__Group_3__1__Impl ;
    public final void rule__QuestionGroup__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2287:1: ( rule__QuestionGroup__Group_3__1__Impl )
            // InternalQL.g:2288:2: rule__QuestionGroup__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_3__1"


    // $ANTLR start "rule__QuestionGroup__Group_3__1__Impl"
    // InternalQL.g:2294:1: rule__QuestionGroup__Group_3__1__Impl : ( ( rule__QuestionGroup__GuardAssignment_3_1 ) ) ;
    public final void rule__QuestionGroup__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2298:1: ( ( ( rule__QuestionGroup__GuardAssignment_3_1 ) ) )
            // InternalQL.g:2299:1: ( ( rule__QuestionGroup__GuardAssignment_3_1 ) )
            {
            // InternalQL.g:2299:1: ( ( rule__QuestionGroup__GuardAssignment_3_1 ) )
            // InternalQL.g:2300:2: ( rule__QuestionGroup__GuardAssignment_3_1 )
            {
             before(grammarAccess.getQuestionGroupAccess().getGuardAssignment_3_1()); 
            // InternalQL.g:2301:2: ( rule__QuestionGroup__GuardAssignment_3_1 )
            // InternalQL.g:2301:3: rule__QuestionGroup__GuardAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__QuestionGroup__GuardAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionGroupAccess().getGuardAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_3__1__Impl"


    // $ANTLR start "rule__QuestionGroup__Group_4__0"
    // InternalQL.g:2310:1: rule__QuestionGroup__Group_4__0 : rule__QuestionGroup__Group_4__0__Impl rule__QuestionGroup__Group_4__1 ;
    public final void rule__QuestionGroup__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2314:1: ( rule__QuestionGroup__Group_4__0__Impl rule__QuestionGroup__Group_4__1 )
            // InternalQL.g:2315:2: rule__QuestionGroup__Group_4__0__Impl rule__QuestionGroup__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__QuestionGroup__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_4__0"


    // $ANTLR start "rule__QuestionGroup__Group_4__0__Impl"
    // InternalQL.g:2322:1: rule__QuestionGroup__Group_4__0__Impl : ( 'questionGroups' ) ;
    public final void rule__QuestionGroup__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2326:1: ( ( 'questionGroups' ) )
            // InternalQL.g:2327:1: ( 'questionGroups' )
            {
            // InternalQL.g:2327:1: ( 'questionGroups' )
            // InternalQL.g:2328:2: 'questionGroups'
            {
             before(grammarAccess.getQuestionGroupAccess().getQuestionGroupsKeyword_4_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getQuestionGroupAccess().getQuestionGroupsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_4__0__Impl"


    // $ANTLR start "rule__QuestionGroup__Group_4__1"
    // InternalQL.g:2337:1: rule__QuestionGroup__Group_4__1 : rule__QuestionGroup__Group_4__1__Impl rule__QuestionGroup__Group_4__2 ;
    public final void rule__QuestionGroup__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2341:1: ( rule__QuestionGroup__Group_4__1__Impl rule__QuestionGroup__Group_4__2 )
            // InternalQL.g:2342:2: rule__QuestionGroup__Group_4__1__Impl rule__QuestionGroup__Group_4__2
            {
            pushFollow(FOLLOW_13);
            rule__QuestionGroup__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_4__1"


    // $ANTLR start "rule__QuestionGroup__Group_4__1__Impl"
    // InternalQL.g:2349:1: rule__QuestionGroup__Group_4__1__Impl : ( '{' ) ;
    public final void rule__QuestionGroup__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2353:1: ( ( '{' ) )
            // InternalQL.g:2354:1: ( '{' )
            {
            // InternalQL.g:2354:1: ( '{' )
            // InternalQL.g:2355:2: '{'
            {
             before(grammarAccess.getQuestionGroupAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getQuestionGroupAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_4__1__Impl"


    // $ANTLR start "rule__QuestionGroup__Group_4__2"
    // InternalQL.g:2364:1: rule__QuestionGroup__Group_4__2 : rule__QuestionGroup__Group_4__2__Impl rule__QuestionGroup__Group_4__3 ;
    public final void rule__QuestionGroup__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2368:1: ( rule__QuestionGroup__Group_4__2__Impl rule__QuestionGroup__Group_4__3 )
            // InternalQL.g:2369:2: rule__QuestionGroup__Group_4__2__Impl rule__QuestionGroup__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__QuestionGroup__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_4__2"


    // $ANTLR start "rule__QuestionGroup__Group_4__2__Impl"
    // InternalQL.g:2376:1: rule__QuestionGroup__Group_4__2__Impl : ( ( rule__QuestionGroup__QuestionGroupsAssignment_4_2 ) ) ;
    public final void rule__QuestionGroup__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2380:1: ( ( ( rule__QuestionGroup__QuestionGroupsAssignment_4_2 ) ) )
            // InternalQL.g:2381:1: ( ( rule__QuestionGroup__QuestionGroupsAssignment_4_2 ) )
            {
            // InternalQL.g:2381:1: ( ( rule__QuestionGroup__QuestionGroupsAssignment_4_2 ) )
            // InternalQL.g:2382:2: ( rule__QuestionGroup__QuestionGroupsAssignment_4_2 )
            {
             before(grammarAccess.getQuestionGroupAccess().getQuestionGroupsAssignment_4_2()); 
            // InternalQL.g:2383:2: ( rule__QuestionGroup__QuestionGroupsAssignment_4_2 )
            // InternalQL.g:2383:3: rule__QuestionGroup__QuestionGroupsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__QuestionGroup__QuestionGroupsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getQuestionGroupAccess().getQuestionGroupsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_4__2__Impl"


    // $ANTLR start "rule__QuestionGroup__Group_4__3"
    // InternalQL.g:2391:1: rule__QuestionGroup__Group_4__3 : rule__QuestionGroup__Group_4__3__Impl rule__QuestionGroup__Group_4__4 ;
    public final void rule__QuestionGroup__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2395:1: ( rule__QuestionGroup__Group_4__3__Impl rule__QuestionGroup__Group_4__4 )
            // InternalQL.g:2396:2: rule__QuestionGroup__Group_4__3__Impl rule__QuestionGroup__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__QuestionGroup__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_4__3"


    // $ANTLR start "rule__QuestionGroup__Group_4__3__Impl"
    // InternalQL.g:2403:1: rule__QuestionGroup__Group_4__3__Impl : ( ( rule__QuestionGroup__Group_4_3__0 )* ) ;
    public final void rule__QuestionGroup__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2407:1: ( ( ( rule__QuestionGroup__Group_4_3__0 )* ) )
            // InternalQL.g:2408:1: ( ( rule__QuestionGroup__Group_4_3__0 )* )
            {
            // InternalQL.g:2408:1: ( ( rule__QuestionGroup__Group_4_3__0 )* )
            // InternalQL.g:2409:2: ( rule__QuestionGroup__Group_4_3__0 )*
            {
             before(grammarAccess.getQuestionGroupAccess().getGroup_4_3()); 
            // InternalQL.g:2410:2: ( rule__QuestionGroup__Group_4_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==33) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalQL.g:2410:3: rule__QuestionGroup__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QuestionGroup__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getQuestionGroupAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_4__3__Impl"


    // $ANTLR start "rule__QuestionGroup__Group_4__4"
    // InternalQL.g:2418:1: rule__QuestionGroup__Group_4__4 : rule__QuestionGroup__Group_4__4__Impl ;
    public final void rule__QuestionGroup__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2422:1: ( rule__QuestionGroup__Group_4__4__Impl )
            // InternalQL.g:2423:2: rule__QuestionGroup__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_4__4"


    // $ANTLR start "rule__QuestionGroup__Group_4__4__Impl"
    // InternalQL.g:2429:1: rule__QuestionGroup__Group_4__4__Impl : ( '}' ) ;
    public final void rule__QuestionGroup__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2433:1: ( ( '}' ) )
            // InternalQL.g:2434:1: ( '}' )
            {
            // InternalQL.g:2434:1: ( '}' )
            // InternalQL.g:2435:2: '}'
            {
             before(grammarAccess.getQuestionGroupAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getQuestionGroupAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_4__4__Impl"


    // $ANTLR start "rule__QuestionGroup__Group_4_3__0"
    // InternalQL.g:2445:1: rule__QuestionGroup__Group_4_3__0 : rule__QuestionGroup__Group_4_3__0__Impl rule__QuestionGroup__Group_4_3__1 ;
    public final void rule__QuestionGroup__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2449:1: ( rule__QuestionGroup__Group_4_3__0__Impl rule__QuestionGroup__Group_4_3__1 )
            // InternalQL.g:2450:2: rule__QuestionGroup__Group_4_3__0__Impl rule__QuestionGroup__Group_4_3__1
            {
            pushFollow(FOLLOW_13);
            rule__QuestionGroup__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_4_3__0"


    // $ANTLR start "rule__QuestionGroup__Group_4_3__0__Impl"
    // InternalQL.g:2457:1: rule__QuestionGroup__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__QuestionGroup__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2461:1: ( ( ',' ) )
            // InternalQL.g:2462:1: ( ',' )
            {
            // InternalQL.g:2462:1: ( ',' )
            // InternalQL.g:2463:2: ','
            {
             before(grammarAccess.getQuestionGroupAccess().getCommaKeyword_4_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getQuestionGroupAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_4_3__0__Impl"


    // $ANTLR start "rule__QuestionGroup__Group_4_3__1"
    // InternalQL.g:2472:1: rule__QuestionGroup__Group_4_3__1 : rule__QuestionGroup__Group_4_3__1__Impl ;
    public final void rule__QuestionGroup__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2476:1: ( rule__QuestionGroup__Group_4_3__1__Impl )
            // InternalQL.g:2477:2: rule__QuestionGroup__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_4_3__1"


    // $ANTLR start "rule__QuestionGroup__Group_4_3__1__Impl"
    // InternalQL.g:2483:1: rule__QuestionGroup__Group_4_3__1__Impl : ( ( rule__QuestionGroup__QuestionGroupsAssignment_4_3_1 ) ) ;
    public final void rule__QuestionGroup__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2487:1: ( ( ( rule__QuestionGroup__QuestionGroupsAssignment_4_3_1 ) ) )
            // InternalQL.g:2488:1: ( ( rule__QuestionGroup__QuestionGroupsAssignment_4_3_1 ) )
            {
            // InternalQL.g:2488:1: ( ( rule__QuestionGroup__QuestionGroupsAssignment_4_3_1 ) )
            // InternalQL.g:2489:2: ( rule__QuestionGroup__QuestionGroupsAssignment_4_3_1 )
            {
             before(grammarAccess.getQuestionGroupAccess().getQuestionGroupsAssignment_4_3_1()); 
            // InternalQL.g:2490:2: ( rule__QuestionGroup__QuestionGroupsAssignment_4_3_1 )
            // InternalQL.g:2490:3: rule__QuestionGroup__QuestionGroupsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__QuestionGroup__QuestionGroupsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionGroupAccess().getQuestionGroupsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_4_3__1__Impl"


    // $ANTLR start "rule__QuestionGroup__Group_5__0"
    // InternalQL.g:2499:1: rule__QuestionGroup__Group_5__0 : rule__QuestionGroup__Group_5__0__Impl rule__QuestionGroup__Group_5__1 ;
    public final void rule__QuestionGroup__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2503:1: ( rule__QuestionGroup__Group_5__0__Impl rule__QuestionGroup__Group_5__1 )
            // InternalQL.g:2504:2: rule__QuestionGroup__Group_5__0__Impl rule__QuestionGroup__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__QuestionGroup__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_5__0"


    // $ANTLR start "rule__QuestionGroup__Group_5__0__Impl"
    // InternalQL.g:2511:1: rule__QuestionGroup__Group_5__0__Impl : ( 'questions' ) ;
    public final void rule__QuestionGroup__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2515:1: ( ( 'questions' ) )
            // InternalQL.g:2516:1: ( 'questions' )
            {
            // InternalQL.g:2516:1: ( 'questions' )
            // InternalQL.g:2517:2: 'questions'
            {
             before(grammarAccess.getQuestionGroupAccess().getQuestionsKeyword_5_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getQuestionGroupAccess().getQuestionsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_5__0__Impl"


    // $ANTLR start "rule__QuestionGroup__Group_5__1"
    // InternalQL.g:2526:1: rule__QuestionGroup__Group_5__1 : rule__QuestionGroup__Group_5__1__Impl rule__QuestionGroup__Group_5__2 ;
    public final void rule__QuestionGroup__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2530:1: ( rule__QuestionGroup__Group_5__1__Impl rule__QuestionGroup__Group_5__2 )
            // InternalQL.g:2531:2: rule__QuestionGroup__Group_5__1__Impl rule__QuestionGroup__Group_5__2
            {
            pushFollow(FOLLOW_19);
            rule__QuestionGroup__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_5__1"


    // $ANTLR start "rule__QuestionGroup__Group_5__1__Impl"
    // InternalQL.g:2538:1: rule__QuestionGroup__Group_5__1__Impl : ( '{' ) ;
    public final void rule__QuestionGroup__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2542:1: ( ( '{' ) )
            // InternalQL.g:2543:1: ( '{' )
            {
            // InternalQL.g:2543:1: ( '{' )
            // InternalQL.g:2544:2: '{'
            {
             before(grammarAccess.getQuestionGroupAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getQuestionGroupAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_5__1__Impl"


    // $ANTLR start "rule__QuestionGroup__Group_5__2"
    // InternalQL.g:2553:1: rule__QuestionGroup__Group_5__2 : rule__QuestionGroup__Group_5__2__Impl rule__QuestionGroup__Group_5__3 ;
    public final void rule__QuestionGroup__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2557:1: ( rule__QuestionGroup__Group_5__2__Impl rule__QuestionGroup__Group_5__3 )
            // InternalQL.g:2558:2: rule__QuestionGroup__Group_5__2__Impl rule__QuestionGroup__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__QuestionGroup__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_5__2"


    // $ANTLR start "rule__QuestionGroup__Group_5__2__Impl"
    // InternalQL.g:2565:1: rule__QuestionGroup__Group_5__2__Impl : ( ( rule__QuestionGroup__QuestionsAssignment_5_2 ) ) ;
    public final void rule__QuestionGroup__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2569:1: ( ( ( rule__QuestionGroup__QuestionsAssignment_5_2 ) ) )
            // InternalQL.g:2570:1: ( ( rule__QuestionGroup__QuestionsAssignment_5_2 ) )
            {
            // InternalQL.g:2570:1: ( ( rule__QuestionGroup__QuestionsAssignment_5_2 ) )
            // InternalQL.g:2571:2: ( rule__QuestionGroup__QuestionsAssignment_5_2 )
            {
             before(grammarAccess.getQuestionGroupAccess().getQuestionsAssignment_5_2()); 
            // InternalQL.g:2572:2: ( rule__QuestionGroup__QuestionsAssignment_5_2 )
            // InternalQL.g:2572:3: rule__QuestionGroup__QuestionsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__QuestionGroup__QuestionsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getQuestionGroupAccess().getQuestionsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_5__2__Impl"


    // $ANTLR start "rule__QuestionGroup__Group_5__3"
    // InternalQL.g:2580:1: rule__QuestionGroup__Group_5__3 : rule__QuestionGroup__Group_5__3__Impl rule__QuestionGroup__Group_5__4 ;
    public final void rule__QuestionGroup__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2584:1: ( rule__QuestionGroup__Group_5__3__Impl rule__QuestionGroup__Group_5__4 )
            // InternalQL.g:2585:2: rule__QuestionGroup__Group_5__3__Impl rule__QuestionGroup__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__QuestionGroup__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_5__3"


    // $ANTLR start "rule__QuestionGroup__Group_5__3__Impl"
    // InternalQL.g:2592:1: rule__QuestionGroup__Group_5__3__Impl : ( ( rule__QuestionGroup__Group_5_3__0 )* ) ;
    public final void rule__QuestionGroup__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2596:1: ( ( ( rule__QuestionGroup__Group_5_3__0 )* ) )
            // InternalQL.g:2597:1: ( ( rule__QuestionGroup__Group_5_3__0 )* )
            {
            // InternalQL.g:2597:1: ( ( rule__QuestionGroup__Group_5_3__0 )* )
            // InternalQL.g:2598:2: ( rule__QuestionGroup__Group_5_3__0 )*
            {
             before(grammarAccess.getQuestionGroupAccess().getGroup_5_3()); 
            // InternalQL.g:2599:2: ( rule__QuestionGroup__Group_5_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==33) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalQL.g:2599:3: rule__QuestionGroup__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QuestionGroup__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getQuestionGroupAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_5__3__Impl"


    // $ANTLR start "rule__QuestionGroup__Group_5__4"
    // InternalQL.g:2607:1: rule__QuestionGroup__Group_5__4 : rule__QuestionGroup__Group_5__4__Impl ;
    public final void rule__QuestionGroup__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2611:1: ( rule__QuestionGroup__Group_5__4__Impl )
            // InternalQL.g:2612:2: rule__QuestionGroup__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_5__4"


    // $ANTLR start "rule__QuestionGroup__Group_5__4__Impl"
    // InternalQL.g:2618:1: rule__QuestionGroup__Group_5__4__Impl : ( '}' ) ;
    public final void rule__QuestionGroup__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2622:1: ( ( '}' ) )
            // InternalQL.g:2623:1: ( '}' )
            {
            // InternalQL.g:2623:1: ( '}' )
            // InternalQL.g:2624:2: '}'
            {
             before(grammarAccess.getQuestionGroupAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getQuestionGroupAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_5__4__Impl"


    // $ANTLR start "rule__QuestionGroup__Group_5_3__0"
    // InternalQL.g:2634:1: rule__QuestionGroup__Group_5_3__0 : rule__QuestionGroup__Group_5_3__0__Impl rule__QuestionGroup__Group_5_3__1 ;
    public final void rule__QuestionGroup__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2638:1: ( rule__QuestionGroup__Group_5_3__0__Impl rule__QuestionGroup__Group_5_3__1 )
            // InternalQL.g:2639:2: rule__QuestionGroup__Group_5_3__0__Impl rule__QuestionGroup__Group_5_3__1
            {
            pushFollow(FOLLOW_19);
            rule__QuestionGroup__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_5_3__0"


    // $ANTLR start "rule__QuestionGroup__Group_5_3__0__Impl"
    // InternalQL.g:2646:1: rule__QuestionGroup__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__QuestionGroup__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2650:1: ( ( ',' ) )
            // InternalQL.g:2651:1: ( ',' )
            {
            // InternalQL.g:2651:1: ( ',' )
            // InternalQL.g:2652:2: ','
            {
             before(grammarAccess.getQuestionGroupAccess().getCommaKeyword_5_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getQuestionGroupAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_5_3__0__Impl"


    // $ANTLR start "rule__QuestionGroup__Group_5_3__1"
    // InternalQL.g:2661:1: rule__QuestionGroup__Group_5_3__1 : rule__QuestionGroup__Group_5_3__1__Impl ;
    public final void rule__QuestionGroup__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2665:1: ( rule__QuestionGroup__Group_5_3__1__Impl )
            // InternalQL.g:2666:2: rule__QuestionGroup__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_5_3__1"


    // $ANTLR start "rule__QuestionGroup__Group_5_3__1__Impl"
    // InternalQL.g:2672:1: rule__QuestionGroup__Group_5_3__1__Impl : ( ( rule__QuestionGroup__QuestionsAssignment_5_3_1 ) ) ;
    public final void rule__QuestionGroup__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2676:1: ( ( ( rule__QuestionGroup__QuestionsAssignment_5_3_1 ) ) )
            // InternalQL.g:2677:1: ( ( rule__QuestionGroup__QuestionsAssignment_5_3_1 ) )
            {
            // InternalQL.g:2677:1: ( ( rule__QuestionGroup__QuestionsAssignment_5_3_1 ) )
            // InternalQL.g:2678:2: ( rule__QuestionGroup__QuestionsAssignment_5_3_1 )
            {
             before(grammarAccess.getQuestionGroupAccess().getQuestionsAssignment_5_3_1()); 
            // InternalQL.g:2679:2: ( rule__QuestionGroup__QuestionsAssignment_5_3_1 )
            // InternalQL.g:2679:3: rule__QuestionGroup__QuestionsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__QuestionGroup__QuestionsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionGroupAccess().getQuestionsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_5_3__1__Impl"


    // $ANTLR start "rule__Question__Group__0"
    // InternalQL.g:2688:1: rule__Question__Group__0 : rule__Question__Group__0__Impl rule__Question__Group__1 ;
    public final void rule__Question__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2692:1: ( rule__Question__Group__0__Impl rule__Question__Group__1 )
            // InternalQL.g:2693:2: rule__Question__Group__0__Impl rule__Question__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Question__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__0"


    // $ANTLR start "rule__Question__Group__0__Impl"
    // InternalQL.g:2700:1: rule__Question__Group__0__Impl : ( 'Question' ) ;
    public final void rule__Question__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2704:1: ( ( 'Question' ) )
            // InternalQL.g:2705:1: ( 'Question' )
            {
            // InternalQL.g:2705:1: ( 'Question' )
            // InternalQL.g:2706:2: 'Question'
            {
             before(grammarAccess.getQuestionAccess().getQuestionKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getQuestionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__0__Impl"


    // $ANTLR start "rule__Question__Group__1"
    // InternalQL.g:2715:1: rule__Question__Group__1 : rule__Question__Group__1__Impl rule__Question__Group__2 ;
    public final void rule__Question__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2719:1: ( rule__Question__Group__1__Impl rule__Question__Group__2 )
            // InternalQL.g:2720:2: rule__Question__Group__1__Impl rule__Question__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Question__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__1"


    // $ANTLR start "rule__Question__Group__1__Impl"
    // InternalQL.g:2727:1: rule__Question__Group__1__Impl : ( '{' ) ;
    public final void rule__Question__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2731:1: ( ( '{' ) )
            // InternalQL.g:2732:1: ( '{' )
            {
            // InternalQL.g:2732:1: ( '{' )
            // InternalQL.g:2733:2: '{'
            {
             before(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__1__Impl"


    // $ANTLR start "rule__Question__Group__2"
    // InternalQL.g:2742:1: rule__Question__Group__2 : rule__Question__Group__2__Impl rule__Question__Group__3 ;
    public final void rule__Question__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2746:1: ( rule__Question__Group__2__Impl rule__Question__Group__3 )
            // InternalQL.g:2747:2: rule__Question__Group__2__Impl rule__Question__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Question__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__2"


    // $ANTLR start "rule__Question__Group__2__Impl"
    // InternalQL.g:2754:1: rule__Question__Group__2__Impl : ( 'questionDefinition' ) ;
    public final void rule__Question__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2758:1: ( ( 'questionDefinition' ) )
            // InternalQL.g:2759:1: ( 'questionDefinition' )
            {
            // InternalQL.g:2759:1: ( 'questionDefinition' )
            // InternalQL.g:2760:2: 'questionDefinition'
            {
             before(grammarAccess.getQuestionAccess().getQuestionDefinitionKeyword_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getQuestionDefinitionKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__2__Impl"


    // $ANTLR start "rule__Question__Group__3"
    // InternalQL.g:2769:1: rule__Question__Group__3 : rule__Question__Group__3__Impl rule__Question__Group__4 ;
    public final void rule__Question__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2773:1: ( rule__Question__Group__3__Impl rule__Question__Group__4 )
            // InternalQL.g:2774:2: rule__Question__Group__3__Impl rule__Question__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Question__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__3"


    // $ANTLR start "rule__Question__Group__3__Impl"
    // InternalQL.g:2781:1: rule__Question__Group__3__Impl : ( ( rule__Question__QuestionDefinitionAssignment_3 ) ) ;
    public final void rule__Question__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2785:1: ( ( ( rule__Question__QuestionDefinitionAssignment_3 ) ) )
            // InternalQL.g:2786:1: ( ( rule__Question__QuestionDefinitionAssignment_3 ) )
            {
            // InternalQL.g:2786:1: ( ( rule__Question__QuestionDefinitionAssignment_3 ) )
            // InternalQL.g:2787:2: ( rule__Question__QuestionDefinitionAssignment_3 )
            {
             before(grammarAccess.getQuestionAccess().getQuestionDefinitionAssignment_3()); 
            // InternalQL.g:2788:2: ( rule__Question__QuestionDefinitionAssignment_3 )
            // InternalQL.g:2788:3: rule__Question__QuestionDefinitionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Question__QuestionDefinitionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getQuestionDefinitionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__3__Impl"


    // $ANTLR start "rule__Question__Group__4"
    // InternalQL.g:2796:1: rule__Question__Group__4 : rule__Question__Group__4__Impl ;
    public final void rule__Question__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2800:1: ( rule__Question__Group__4__Impl )
            // InternalQL.g:2801:2: rule__Question__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__4"


    // $ANTLR start "rule__Question__Group__4__Impl"
    // InternalQL.g:2807:1: rule__Question__Group__4__Impl : ( '}' ) ;
    public final void rule__Question__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2811:1: ( ( '}' ) )
            // InternalQL.g:2812:1: ( '}' )
            {
            // InternalQL.g:2812:1: ( '}' )
            // InternalQL.g:2813:2: '}'
            {
             before(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__4__Impl"


    // $ANTLR start "rule__ValueType_Impl__Group__0"
    // InternalQL.g:2823:1: rule__ValueType_Impl__Group__0 : rule__ValueType_Impl__Group__0__Impl rule__ValueType_Impl__Group__1 ;
    public final void rule__ValueType_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2827:1: ( rule__ValueType_Impl__Group__0__Impl rule__ValueType_Impl__Group__1 )
            // InternalQL.g:2828:2: rule__ValueType_Impl__Group__0__Impl rule__ValueType_Impl__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalQL.g:2835:1: rule__ValueType_Impl__Group__0__Impl : ( () ) ;
    public final void rule__ValueType_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2839:1: ( ( () ) )
            // InternalQL.g:2840:1: ( () )
            {
            // InternalQL.g:2840:1: ( () )
            // InternalQL.g:2841:2: ()
            {
             before(grammarAccess.getValueType_ImplAccess().getValueTypeAction_0()); 
            // InternalQL.g:2842:2: ()
            // InternalQL.g:2842:3: 
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
    // InternalQL.g:2850:1: rule__ValueType_Impl__Group__1 : rule__ValueType_Impl__Group__1__Impl rule__ValueType_Impl__Group__2 ;
    public final void rule__ValueType_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2854:1: ( rule__ValueType_Impl__Group__1__Impl rule__ValueType_Impl__Group__2 )
            // InternalQL.g:2855:2: rule__ValueType_Impl__Group__1__Impl rule__ValueType_Impl__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalQL.g:2862:1: rule__ValueType_Impl__Group__1__Impl : ( 'ValueType' ) ;
    public final void rule__ValueType_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2866:1: ( ( 'ValueType' ) )
            // InternalQL.g:2867:1: ( 'ValueType' )
            {
            // InternalQL.g:2867:1: ( 'ValueType' )
            // InternalQL.g:2868:2: 'ValueType'
            {
             before(grammarAccess.getValueType_ImplAccess().getValueTypeKeyword_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalQL.g:2877:1: rule__ValueType_Impl__Group__2 : rule__ValueType_Impl__Group__2__Impl rule__ValueType_Impl__Group__3 ;
    public final void rule__ValueType_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2881:1: ( rule__ValueType_Impl__Group__2__Impl rule__ValueType_Impl__Group__3 )
            // InternalQL.g:2882:2: rule__ValueType_Impl__Group__2__Impl rule__ValueType_Impl__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalQL.g:2889:1: rule__ValueType_Impl__Group__2__Impl : ( ( rule__ValueType_Impl__NameAssignment_2 ) ) ;
    public final void rule__ValueType_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2893:1: ( ( ( rule__ValueType_Impl__NameAssignment_2 ) ) )
            // InternalQL.g:2894:1: ( ( rule__ValueType_Impl__NameAssignment_2 ) )
            {
            // InternalQL.g:2894:1: ( ( rule__ValueType_Impl__NameAssignment_2 ) )
            // InternalQL.g:2895:2: ( rule__ValueType_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getValueType_ImplAccess().getNameAssignment_2()); 
            // InternalQL.g:2896:2: ( rule__ValueType_Impl__NameAssignment_2 )
            // InternalQL.g:2896:3: rule__ValueType_Impl__NameAssignment_2
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
    // InternalQL.g:2904:1: rule__ValueType_Impl__Group__3 : rule__ValueType_Impl__Group__3__Impl rule__ValueType_Impl__Group__4 ;
    public final void rule__ValueType_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2908:1: ( rule__ValueType_Impl__Group__3__Impl rule__ValueType_Impl__Group__4 )
            // InternalQL.g:2909:2: rule__ValueType_Impl__Group__3__Impl rule__ValueType_Impl__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalQL.g:2916:1: rule__ValueType_Impl__Group__3__Impl : ( '{' ) ;
    public final void rule__ValueType_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2920:1: ( ( '{' ) )
            // InternalQL.g:2921:1: ( '{' )
            {
            // InternalQL.g:2921:1: ( '{' )
            // InternalQL.g:2922:2: '{'
            {
             before(grammarAccess.getValueType_ImplAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
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
    // InternalQL.g:2931:1: rule__ValueType_Impl__Group__4 : rule__ValueType_Impl__Group__4__Impl rule__ValueType_Impl__Group__5 ;
    public final void rule__ValueType_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2935:1: ( rule__ValueType_Impl__Group__4__Impl rule__ValueType_Impl__Group__5 )
            // InternalQL.g:2936:2: rule__ValueType_Impl__Group__4__Impl rule__ValueType_Impl__Group__5
            {
            pushFollow(FOLLOW_22);
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
    // InternalQL.g:2943:1: rule__ValueType_Impl__Group__4__Impl : ( ( rule__ValueType_Impl__Group_4__0 )? ) ;
    public final void rule__ValueType_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2947:1: ( ( ( rule__ValueType_Impl__Group_4__0 )? ) )
            // InternalQL.g:2948:1: ( ( rule__ValueType_Impl__Group_4__0 )? )
            {
            // InternalQL.g:2948:1: ( ( rule__ValueType_Impl__Group_4__0 )? )
            // InternalQL.g:2949:2: ( rule__ValueType_Impl__Group_4__0 )?
            {
             before(grammarAccess.getValueType_ImplAccess().getGroup_4()); 
            // InternalQL.g:2950:2: ( rule__ValueType_Impl__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==45) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalQL.g:2950:3: rule__ValueType_Impl__Group_4__0
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
    // InternalQL.g:2958:1: rule__ValueType_Impl__Group__5 : rule__ValueType_Impl__Group__5__Impl ;
    public final void rule__ValueType_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2962:1: ( rule__ValueType_Impl__Group__5__Impl )
            // InternalQL.g:2963:2: rule__ValueType_Impl__Group__5__Impl
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
    // InternalQL.g:2969:1: rule__ValueType_Impl__Group__5__Impl : ( '}' ) ;
    public final void rule__ValueType_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2973:1: ( ( '}' ) )
            // InternalQL.g:2974:1: ( '}' )
            {
            // InternalQL.g:2974:1: ( '}' )
            // InternalQL.g:2975:2: '}'
            {
             before(grammarAccess.getValueType_ImplAccess().getRightCurlyBracketKeyword_5()); 
            match(input,30,FOLLOW_2); 
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
    // InternalQL.g:2985:1: rule__ValueType_Impl__Group_4__0 : rule__ValueType_Impl__Group_4__0__Impl rule__ValueType_Impl__Group_4__1 ;
    public final void rule__ValueType_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2989:1: ( rule__ValueType_Impl__Group_4__0__Impl rule__ValueType_Impl__Group_4__1 )
            // InternalQL.g:2990:2: rule__ValueType_Impl__Group_4__0__Impl rule__ValueType_Impl__Group_4__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalQL.g:2997:1: rule__ValueType_Impl__Group_4__0__Impl : ( 'unit' ) ;
    public final void rule__ValueType_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3001:1: ( ( 'unit' ) )
            // InternalQL.g:3002:1: ( 'unit' )
            {
            // InternalQL.g:3002:1: ( 'unit' )
            // InternalQL.g:3003:2: 'unit'
            {
             before(grammarAccess.getValueType_ImplAccess().getUnitKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalQL.g:3012:1: rule__ValueType_Impl__Group_4__1 : rule__ValueType_Impl__Group_4__1__Impl ;
    public final void rule__ValueType_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3016:1: ( rule__ValueType_Impl__Group_4__1__Impl )
            // InternalQL.g:3017:2: rule__ValueType_Impl__Group_4__1__Impl
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
    // InternalQL.g:3023:1: rule__ValueType_Impl__Group_4__1__Impl : ( ( rule__ValueType_Impl__UnitAssignment_4_1 ) ) ;
    public final void rule__ValueType_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3027:1: ( ( ( rule__ValueType_Impl__UnitAssignment_4_1 ) ) )
            // InternalQL.g:3028:1: ( ( rule__ValueType_Impl__UnitAssignment_4_1 ) )
            {
            // InternalQL.g:3028:1: ( ( rule__ValueType_Impl__UnitAssignment_4_1 ) )
            // InternalQL.g:3029:2: ( rule__ValueType_Impl__UnitAssignment_4_1 )
            {
             before(grammarAccess.getValueType_ImplAccess().getUnitAssignment_4_1()); 
            // InternalQL.g:3030:2: ( rule__ValueType_Impl__UnitAssignment_4_1 )
            // InternalQL.g:3030:3: rule__ValueType_Impl__UnitAssignment_4_1
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


    // $ANTLR start "rule__BasicBinaryExpression__Group__0"
    // InternalQL.g:3039:1: rule__BasicBinaryExpression__Group__0 : rule__BasicBinaryExpression__Group__0__Impl rule__BasicBinaryExpression__Group__1 ;
    public final void rule__BasicBinaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3043:1: ( rule__BasicBinaryExpression__Group__0__Impl rule__BasicBinaryExpression__Group__1 )
            // InternalQL.g:3044:2: rule__BasicBinaryExpression__Group__0__Impl rule__BasicBinaryExpression__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__BasicBinaryExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicBinaryExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__Group__0"


    // $ANTLR start "rule__BasicBinaryExpression__Group__0__Impl"
    // InternalQL.g:3051:1: rule__BasicBinaryExpression__Group__0__Impl : ( 'BasicBinaryExpression' ) ;
    public final void rule__BasicBinaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3055:1: ( ( 'BasicBinaryExpression' ) )
            // InternalQL.g:3056:1: ( 'BasicBinaryExpression' )
            {
            // InternalQL.g:3056:1: ( 'BasicBinaryExpression' )
            // InternalQL.g:3057:2: 'BasicBinaryExpression'
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getBasicBinaryExpressionKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getBasicBinaryExpressionAccess().getBasicBinaryExpressionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__Group__0__Impl"


    // $ANTLR start "rule__BasicBinaryExpression__Group__1"
    // InternalQL.g:3066:1: rule__BasicBinaryExpression__Group__1 : rule__BasicBinaryExpression__Group__1__Impl rule__BasicBinaryExpression__Group__2 ;
    public final void rule__BasicBinaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3070:1: ( rule__BasicBinaryExpression__Group__1__Impl rule__BasicBinaryExpression__Group__2 )
            // InternalQL.g:3071:2: rule__BasicBinaryExpression__Group__1__Impl rule__BasicBinaryExpression__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__BasicBinaryExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicBinaryExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__Group__1"


    // $ANTLR start "rule__BasicBinaryExpression__Group__1__Impl"
    // InternalQL.g:3078:1: rule__BasicBinaryExpression__Group__1__Impl : ( '{' ) ;
    public final void rule__BasicBinaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3082:1: ( ( '{' ) )
            // InternalQL.g:3083:1: ( '{' )
            {
            // InternalQL.g:3083:1: ( '{' )
            // InternalQL.g:3084:2: '{'
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getBasicBinaryExpressionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__Group__1__Impl"


    // $ANTLR start "rule__BasicBinaryExpression__Group__2"
    // InternalQL.g:3093:1: rule__BasicBinaryExpression__Group__2 : rule__BasicBinaryExpression__Group__2__Impl rule__BasicBinaryExpression__Group__3 ;
    public final void rule__BasicBinaryExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3097:1: ( rule__BasicBinaryExpression__Group__2__Impl rule__BasicBinaryExpression__Group__3 )
            // InternalQL.g:3098:2: rule__BasicBinaryExpression__Group__2__Impl rule__BasicBinaryExpression__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__BasicBinaryExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicBinaryExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__Group__2"


    // $ANTLR start "rule__BasicBinaryExpression__Group__2__Impl"
    // InternalQL.g:3105:1: rule__BasicBinaryExpression__Group__2__Impl : ( 'operator' ) ;
    public final void rule__BasicBinaryExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3109:1: ( ( 'operator' ) )
            // InternalQL.g:3110:1: ( 'operator' )
            {
            // InternalQL.g:3110:1: ( 'operator' )
            // InternalQL.g:3111:2: 'operator'
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getOperatorKeyword_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getBasicBinaryExpressionAccess().getOperatorKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__Group__2__Impl"


    // $ANTLR start "rule__BasicBinaryExpression__Group__3"
    // InternalQL.g:3120:1: rule__BasicBinaryExpression__Group__3 : rule__BasicBinaryExpression__Group__3__Impl rule__BasicBinaryExpression__Group__4 ;
    public final void rule__BasicBinaryExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3124:1: ( rule__BasicBinaryExpression__Group__3__Impl rule__BasicBinaryExpression__Group__4 )
            // InternalQL.g:3125:2: rule__BasicBinaryExpression__Group__3__Impl rule__BasicBinaryExpression__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__BasicBinaryExpression__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicBinaryExpression__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__Group__3"


    // $ANTLR start "rule__BasicBinaryExpression__Group__3__Impl"
    // InternalQL.g:3132:1: rule__BasicBinaryExpression__Group__3__Impl : ( ( rule__BasicBinaryExpression__OperatorAssignment_3 ) ) ;
    public final void rule__BasicBinaryExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3136:1: ( ( ( rule__BasicBinaryExpression__OperatorAssignment_3 ) ) )
            // InternalQL.g:3137:1: ( ( rule__BasicBinaryExpression__OperatorAssignment_3 ) )
            {
            // InternalQL.g:3137:1: ( ( rule__BasicBinaryExpression__OperatorAssignment_3 ) )
            // InternalQL.g:3138:2: ( rule__BasicBinaryExpression__OperatorAssignment_3 )
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getOperatorAssignment_3()); 
            // InternalQL.g:3139:2: ( rule__BasicBinaryExpression__OperatorAssignment_3 )
            // InternalQL.g:3139:3: rule__BasicBinaryExpression__OperatorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__BasicBinaryExpression__OperatorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBasicBinaryExpressionAccess().getOperatorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__Group__3__Impl"


    // $ANTLR start "rule__BasicBinaryExpression__Group__4"
    // InternalQL.g:3147:1: rule__BasicBinaryExpression__Group__4 : rule__BasicBinaryExpression__Group__4__Impl rule__BasicBinaryExpression__Group__5 ;
    public final void rule__BasicBinaryExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3151:1: ( rule__BasicBinaryExpression__Group__4__Impl rule__BasicBinaryExpression__Group__5 )
            // InternalQL.g:3152:2: rule__BasicBinaryExpression__Group__4__Impl rule__BasicBinaryExpression__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__BasicBinaryExpression__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicBinaryExpression__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__Group__4"


    // $ANTLR start "rule__BasicBinaryExpression__Group__4__Impl"
    // InternalQL.g:3159:1: rule__BasicBinaryExpression__Group__4__Impl : ( ( rule__BasicBinaryExpression__Group_4__0 )? ) ;
    public final void rule__BasicBinaryExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3163:1: ( ( ( rule__BasicBinaryExpression__Group_4__0 )? ) )
            // InternalQL.g:3164:1: ( ( rule__BasicBinaryExpression__Group_4__0 )? )
            {
            // InternalQL.g:3164:1: ( ( rule__BasicBinaryExpression__Group_4__0 )? )
            // InternalQL.g:3165:2: ( rule__BasicBinaryExpression__Group_4__0 )?
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getGroup_4()); 
            // InternalQL.g:3166:2: ( rule__BasicBinaryExpression__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==50) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalQL.g:3166:3: rule__BasicBinaryExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicBinaryExpression__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBasicBinaryExpressionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__Group__4__Impl"


    // $ANTLR start "rule__BasicBinaryExpression__Group__5"
    // InternalQL.g:3174:1: rule__BasicBinaryExpression__Group__5 : rule__BasicBinaryExpression__Group__5__Impl rule__BasicBinaryExpression__Group__6 ;
    public final void rule__BasicBinaryExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3178:1: ( rule__BasicBinaryExpression__Group__5__Impl rule__BasicBinaryExpression__Group__6 )
            // InternalQL.g:3179:2: rule__BasicBinaryExpression__Group__5__Impl rule__BasicBinaryExpression__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__BasicBinaryExpression__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicBinaryExpression__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__Group__5"


    // $ANTLR start "rule__BasicBinaryExpression__Group__5__Impl"
    // InternalQL.g:3186:1: rule__BasicBinaryExpression__Group__5__Impl : ( 'lhsOperand' ) ;
    public final void rule__BasicBinaryExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3190:1: ( ( 'lhsOperand' ) )
            // InternalQL.g:3191:1: ( 'lhsOperand' )
            {
            // InternalQL.g:3191:1: ( 'lhsOperand' )
            // InternalQL.g:3192:2: 'lhsOperand'
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getLhsOperandKeyword_5()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getBasicBinaryExpressionAccess().getLhsOperandKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__Group__5__Impl"


    // $ANTLR start "rule__BasicBinaryExpression__Group__6"
    // InternalQL.g:3201:1: rule__BasicBinaryExpression__Group__6 : rule__BasicBinaryExpression__Group__6__Impl rule__BasicBinaryExpression__Group__7 ;
    public final void rule__BasicBinaryExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3205:1: ( rule__BasicBinaryExpression__Group__6__Impl rule__BasicBinaryExpression__Group__7 )
            // InternalQL.g:3206:2: rule__BasicBinaryExpression__Group__6__Impl rule__BasicBinaryExpression__Group__7
            {
            pushFollow(FOLLOW_26);
            rule__BasicBinaryExpression__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicBinaryExpression__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__Group__6"


    // $ANTLR start "rule__BasicBinaryExpression__Group__6__Impl"
    // InternalQL.g:3213:1: rule__BasicBinaryExpression__Group__6__Impl : ( ( rule__BasicBinaryExpression__LhsOperandAssignment_6 ) ) ;
    public final void rule__BasicBinaryExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3217:1: ( ( ( rule__BasicBinaryExpression__LhsOperandAssignment_6 ) ) )
            // InternalQL.g:3218:1: ( ( rule__BasicBinaryExpression__LhsOperandAssignment_6 ) )
            {
            // InternalQL.g:3218:1: ( ( rule__BasicBinaryExpression__LhsOperandAssignment_6 ) )
            // InternalQL.g:3219:2: ( rule__BasicBinaryExpression__LhsOperandAssignment_6 )
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getLhsOperandAssignment_6()); 
            // InternalQL.g:3220:2: ( rule__BasicBinaryExpression__LhsOperandAssignment_6 )
            // InternalQL.g:3220:3: rule__BasicBinaryExpression__LhsOperandAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__BasicBinaryExpression__LhsOperandAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getBasicBinaryExpressionAccess().getLhsOperandAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__Group__6__Impl"


    // $ANTLR start "rule__BasicBinaryExpression__Group__7"
    // InternalQL.g:3228:1: rule__BasicBinaryExpression__Group__7 : rule__BasicBinaryExpression__Group__7__Impl rule__BasicBinaryExpression__Group__8 ;
    public final void rule__BasicBinaryExpression__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3232:1: ( rule__BasicBinaryExpression__Group__7__Impl rule__BasicBinaryExpression__Group__8 )
            // InternalQL.g:3233:2: rule__BasicBinaryExpression__Group__7__Impl rule__BasicBinaryExpression__Group__8
            {
            pushFollow(FOLLOW_18);
            rule__BasicBinaryExpression__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicBinaryExpression__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__Group__7"


    // $ANTLR start "rule__BasicBinaryExpression__Group__7__Impl"
    // InternalQL.g:3240:1: rule__BasicBinaryExpression__Group__7__Impl : ( 'rhsOperand' ) ;
    public final void rule__BasicBinaryExpression__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3244:1: ( ( 'rhsOperand' ) )
            // InternalQL.g:3245:1: ( 'rhsOperand' )
            {
            // InternalQL.g:3245:1: ( 'rhsOperand' )
            // InternalQL.g:3246:2: 'rhsOperand'
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getRhsOperandKeyword_7()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getBasicBinaryExpressionAccess().getRhsOperandKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__Group__7__Impl"


    // $ANTLR start "rule__BasicBinaryExpression__Group__8"
    // InternalQL.g:3255:1: rule__BasicBinaryExpression__Group__8 : rule__BasicBinaryExpression__Group__8__Impl rule__BasicBinaryExpression__Group__9 ;
    public final void rule__BasicBinaryExpression__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3259:1: ( rule__BasicBinaryExpression__Group__8__Impl rule__BasicBinaryExpression__Group__9 )
            // InternalQL.g:3260:2: rule__BasicBinaryExpression__Group__8__Impl rule__BasicBinaryExpression__Group__9
            {
            pushFollow(FOLLOW_14);
            rule__BasicBinaryExpression__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicBinaryExpression__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__Group__8"


    // $ANTLR start "rule__BasicBinaryExpression__Group__8__Impl"
    // InternalQL.g:3267:1: rule__BasicBinaryExpression__Group__8__Impl : ( ( rule__BasicBinaryExpression__RhsOperandAssignment_8 ) ) ;
    public final void rule__BasicBinaryExpression__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3271:1: ( ( ( rule__BasicBinaryExpression__RhsOperandAssignment_8 ) ) )
            // InternalQL.g:3272:1: ( ( rule__BasicBinaryExpression__RhsOperandAssignment_8 ) )
            {
            // InternalQL.g:3272:1: ( ( rule__BasicBinaryExpression__RhsOperandAssignment_8 ) )
            // InternalQL.g:3273:2: ( rule__BasicBinaryExpression__RhsOperandAssignment_8 )
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getRhsOperandAssignment_8()); 
            // InternalQL.g:3274:2: ( rule__BasicBinaryExpression__RhsOperandAssignment_8 )
            // InternalQL.g:3274:3: rule__BasicBinaryExpression__RhsOperandAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__BasicBinaryExpression__RhsOperandAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getBasicBinaryExpressionAccess().getRhsOperandAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__Group__8__Impl"


    // $ANTLR start "rule__BasicBinaryExpression__Group__9"
    // InternalQL.g:3282:1: rule__BasicBinaryExpression__Group__9 : rule__BasicBinaryExpression__Group__9__Impl ;
    public final void rule__BasicBinaryExpression__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3286:1: ( rule__BasicBinaryExpression__Group__9__Impl )
            // InternalQL.g:3287:2: rule__BasicBinaryExpression__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicBinaryExpression__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__Group__9"


    // $ANTLR start "rule__BasicBinaryExpression__Group__9__Impl"
    // InternalQL.g:3293:1: rule__BasicBinaryExpression__Group__9__Impl : ( '}' ) ;
    public final void rule__BasicBinaryExpression__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3297:1: ( ( '}' ) )
            // InternalQL.g:3298:1: ( '}' )
            {
            // InternalQL.g:3298:1: ( '}' )
            // InternalQL.g:3299:2: '}'
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getRightCurlyBracketKeyword_9()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getBasicBinaryExpressionAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__Group__9__Impl"


    // $ANTLR start "rule__BasicBinaryExpression__Group_4__0"
    // InternalQL.g:3309:1: rule__BasicBinaryExpression__Group_4__0 : rule__BasicBinaryExpression__Group_4__0__Impl rule__BasicBinaryExpression__Group_4__1 ;
    public final void rule__BasicBinaryExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3313:1: ( rule__BasicBinaryExpression__Group_4__0__Impl rule__BasicBinaryExpression__Group_4__1 )
            // InternalQL.g:3314:2: rule__BasicBinaryExpression__Group_4__0__Impl rule__BasicBinaryExpression__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__BasicBinaryExpression__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicBinaryExpression__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__Group_4__0"


    // $ANTLR start "rule__BasicBinaryExpression__Group_4__0__Impl"
    // InternalQL.g:3321:1: rule__BasicBinaryExpression__Group_4__0__Impl : ( 'resultType' ) ;
    public final void rule__BasicBinaryExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3325:1: ( ( 'resultType' ) )
            // InternalQL.g:3326:1: ( 'resultType' )
            {
            // InternalQL.g:3326:1: ( 'resultType' )
            // InternalQL.g:3327:2: 'resultType'
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getResultTypeKeyword_4_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getBasicBinaryExpressionAccess().getResultTypeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__Group_4__0__Impl"


    // $ANTLR start "rule__BasicBinaryExpression__Group_4__1"
    // InternalQL.g:3336:1: rule__BasicBinaryExpression__Group_4__1 : rule__BasicBinaryExpression__Group_4__1__Impl ;
    public final void rule__BasicBinaryExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3340:1: ( rule__BasicBinaryExpression__Group_4__1__Impl )
            // InternalQL.g:3341:2: rule__BasicBinaryExpression__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicBinaryExpression__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__Group_4__1"


    // $ANTLR start "rule__BasicBinaryExpression__Group_4__1__Impl"
    // InternalQL.g:3347:1: rule__BasicBinaryExpression__Group_4__1__Impl : ( ( rule__BasicBinaryExpression__ResultTypeAssignment_4_1 ) ) ;
    public final void rule__BasicBinaryExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3351:1: ( ( ( rule__BasicBinaryExpression__ResultTypeAssignment_4_1 ) ) )
            // InternalQL.g:3352:1: ( ( rule__BasicBinaryExpression__ResultTypeAssignment_4_1 ) )
            {
            // InternalQL.g:3352:1: ( ( rule__BasicBinaryExpression__ResultTypeAssignment_4_1 ) )
            // InternalQL.g:3353:2: ( rule__BasicBinaryExpression__ResultTypeAssignment_4_1 )
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getResultTypeAssignment_4_1()); 
            // InternalQL.g:3354:2: ( rule__BasicBinaryExpression__ResultTypeAssignment_4_1 )
            // InternalQL.g:3354:3: rule__BasicBinaryExpression__ResultTypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__BasicBinaryExpression__ResultTypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getBasicBinaryExpressionAccess().getResultTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__Group_4__1__Impl"


    // $ANTLR start "rule__ConstantCall__Group__0"
    // InternalQL.g:3363:1: rule__ConstantCall__Group__0 : rule__ConstantCall__Group__0__Impl rule__ConstantCall__Group__1 ;
    public final void rule__ConstantCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3367:1: ( rule__ConstantCall__Group__0__Impl rule__ConstantCall__Group__1 )
            // InternalQL.g:3368:2: rule__ConstantCall__Group__0__Impl rule__ConstantCall__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalQL.g:3375:1: rule__ConstantCall__Group__0__Impl : ( () ) ;
    public final void rule__ConstantCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3379:1: ( ( () ) )
            // InternalQL.g:3380:1: ( () )
            {
            // InternalQL.g:3380:1: ( () )
            // InternalQL.g:3381:2: ()
            {
             before(grammarAccess.getConstantCallAccess().getConstantCallAction_0()); 
            // InternalQL.g:3382:2: ()
            // InternalQL.g:3382:3: 
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
    // InternalQL.g:3390:1: rule__ConstantCall__Group__1 : rule__ConstantCall__Group__1__Impl rule__ConstantCall__Group__2 ;
    public final void rule__ConstantCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3394:1: ( rule__ConstantCall__Group__1__Impl rule__ConstantCall__Group__2 )
            // InternalQL.g:3395:2: rule__ConstantCall__Group__1__Impl rule__ConstantCall__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ConstantCall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstantCall__Group__2();

            state._fsp--;


            }

        }
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
    // InternalQL.g:3402:1: rule__ConstantCall__Group__1__Impl : ( 'ConstantCall' ) ;
    public final void rule__ConstantCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3406:1: ( ( 'ConstantCall' ) )
            // InternalQL.g:3407:1: ( 'ConstantCall' )
            {
            // InternalQL.g:3407:1: ( 'ConstantCall' )
            // InternalQL.g:3408:2: 'ConstantCall'
            {
             before(grammarAccess.getConstantCallAccess().getConstantCallKeyword_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getConstantCallAccess().getConstantCallKeyword_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ConstantCall__Group__2"
    // InternalQL.g:3417:1: rule__ConstantCall__Group__2 : rule__ConstantCall__Group__2__Impl rule__ConstantCall__Group__3 ;
    public final void rule__ConstantCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3421:1: ( rule__ConstantCall__Group__2__Impl rule__ConstantCall__Group__3 )
            // InternalQL.g:3422:2: rule__ConstantCall__Group__2__Impl rule__ConstantCall__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__ConstantCall__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstantCall__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantCall__Group__2"


    // $ANTLR start "rule__ConstantCall__Group__2__Impl"
    // InternalQL.g:3429:1: rule__ConstantCall__Group__2__Impl : ( '{' ) ;
    public final void rule__ConstantCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3433:1: ( ( '{' ) )
            // InternalQL.g:3434:1: ( '{' )
            {
            // InternalQL.g:3434:1: ( '{' )
            // InternalQL.g:3435:2: '{'
            {
             before(grammarAccess.getConstantCallAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getConstantCallAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantCall__Group__2__Impl"


    // $ANTLR start "rule__ConstantCall__Group__3"
    // InternalQL.g:3444:1: rule__ConstantCall__Group__3 : rule__ConstantCall__Group__3__Impl rule__ConstantCall__Group__4 ;
    public final void rule__ConstantCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3448:1: ( rule__ConstantCall__Group__3__Impl rule__ConstantCall__Group__4 )
            // InternalQL.g:3449:2: rule__ConstantCall__Group__3__Impl rule__ConstantCall__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__ConstantCall__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstantCall__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantCall__Group__3"


    // $ANTLR start "rule__ConstantCall__Group__3__Impl"
    // InternalQL.g:3456:1: rule__ConstantCall__Group__3__Impl : ( ( rule__ConstantCall__Group_3__0 )? ) ;
    public final void rule__ConstantCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3460:1: ( ( ( rule__ConstantCall__Group_3__0 )? ) )
            // InternalQL.g:3461:1: ( ( rule__ConstantCall__Group_3__0 )? )
            {
            // InternalQL.g:3461:1: ( ( rule__ConstantCall__Group_3__0 )? )
            // InternalQL.g:3462:2: ( rule__ConstantCall__Group_3__0 )?
            {
             before(grammarAccess.getConstantCallAccess().getGroup_3()); 
            // InternalQL.g:3463:2: ( rule__ConstantCall__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==50) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalQL.g:3463:3: rule__ConstantCall__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConstantCall__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstantCallAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantCall__Group__3__Impl"


    // $ANTLR start "rule__ConstantCall__Group__4"
    // InternalQL.g:3471:1: rule__ConstantCall__Group__4 : rule__ConstantCall__Group__4__Impl rule__ConstantCall__Group__5 ;
    public final void rule__ConstantCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3475:1: ( rule__ConstantCall__Group__4__Impl rule__ConstantCall__Group__5 )
            // InternalQL.g:3476:2: rule__ConstantCall__Group__4__Impl rule__ConstantCall__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__ConstantCall__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstantCall__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantCall__Group__4"


    // $ANTLR start "rule__ConstantCall__Group__4__Impl"
    // InternalQL.g:3483:1: rule__ConstantCall__Group__4__Impl : ( ( rule__ConstantCall__Group_4__0 )? ) ;
    public final void rule__ConstantCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3487:1: ( ( ( rule__ConstantCall__Group_4__0 )? ) )
            // InternalQL.g:3488:1: ( ( rule__ConstantCall__Group_4__0 )? )
            {
            // InternalQL.g:3488:1: ( ( rule__ConstantCall__Group_4__0 )? )
            // InternalQL.g:3489:2: ( rule__ConstantCall__Group_4__0 )?
            {
             before(grammarAccess.getConstantCallAccess().getGroup_4()); 
            // InternalQL.g:3490:2: ( rule__ConstantCall__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==52) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalQL.g:3490:3: rule__ConstantCall__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConstantCall__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstantCallAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantCall__Group__4__Impl"


    // $ANTLR start "rule__ConstantCall__Group__5"
    // InternalQL.g:3498:1: rule__ConstantCall__Group__5 : rule__ConstantCall__Group__5__Impl ;
    public final void rule__ConstantCall__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3502:1: ( rule__ConstantCall__Group__5__Impl )
            // InternalQL.g:3503:2: rule__ConstantCall__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstantCall__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantCall__Group__5"


    // $ANTLR start "rule__ConstantCall__Group__5__Impl"
    // InternalQL.g:3509:1: rule__ConstantCall__Group__5__Impl : ( '}' ) ;
    public final void rule__ConstantCall__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3513:1: ( ( '}' ) )
            // InternalQL.g:3514:1: ( '}' )
            {
            // InternalQL.g:3514:1: ( '}' )
            // InternalQL.g:3515:2: '}'
            {
             before(grammarAccess.getConstantCallAccess().getRightCurlyBracketKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getConstantCallAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantCall__Group__5__Impl"


    // $ANTLR start "rule__ConstantCall__Group_3__0"
    // InternalQL.g:3525:1: rule__ConstantCall__Group_3__0 : rule__ConstantCall__Group_3__0__Impl rule__ConstantCall__Group_3__1 ;
    public final void rule__ConstantCall__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3529:1: ( rule__ConstantCall__Group_3__0__Impl rule__ConstantCall__Group_3__1 )
            // InternalQL.g:3530:2: rule__ConstantCall__Group_3__0__Impl rule__ConstantCall__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__ConstantCall__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstantCall__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantCall__Group_3__0"


    // $ANTLR start "rule__ConstantCall__Group_3__0__Impl"
    // InternalQL.g:3537:1: rule__ConstantCall__Group_3__0__Impl : ( 'resultType' ) ;
    public final void rule__ConstantCall__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3541:1: ( ( 'resultType' ) )
            // InternalQL.g:3542:1: ( 'resultType' )
            {
            // InternalQL.g:3542:1: ( 'resultType' )
            // InternalQL.g:3543:2: 'resultType'
            {
             before(grammarAccess.getConstantCallAccess().getResultTypeKeyword_3_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getConstantCallAccess().getResultTypeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantCall__Group_3__0__Impl"


    // $ANTLR start "rule__ConstantCall__Group_3__1"
    // InternalQL.g:3552:1: rule__ConstantCall__Group_3__1 : rule__ConstantCall__Group_3__1__Impl ;
    public final void rule__ConstantCall__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3556:1: ( rule__ConstantCall__Group_3__1__Impl )
            // InternalQL.g:3557:2: rule__ConstantCall__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstantCall__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantCall__Group_3__1"


    // $ANTLR start "rule__ConstantCall__Group_3__1__Impl"
    // InternalQL.g:3563:1: rule__ConstantCall__Group_3__1__Impl : ( ( rule__ConstantCall__ResultTypeAssignment_3_1 ) ) ;
    public final void rule__ConstantCall__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3567:1: ( ( ( rule__ConstantCall__ResultTypeAssignment_3_1 ) ) )
            // InternalQL.g:3568:1: ( ( rule__ConstantCall__ResultTypeAssignment_3_1 ) )
            {
            // InternalQL.g:3568:1: ( ( rule__ConstantCall__ResultTypeAssignment_3_1 ) )
            // InternalQL.g:3569:2: ( rule__ConstantCall__ResultTypeAssignment_3_1 )
            {
             before(grammarAccess.getConstantCallAccess().getResultTypeAssignment_3_1()); 
            // InternalQL.g:3570:2: ( rule__ConstantCall__ResultTypeAssignment_3_1 )
            // InternalQL.g:3570:3: rule__ConstantCall__ResultTypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ConstantCall__ResultTypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConstantCallAccess().getResultTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantCall__Group_3__1__Impl"


    // $ANTLR start "rule__ConstantCall__Group_4__0"
    // InternalQL.g:3579:1: rule__ConstantCall__Group_4__0 : rule__ConstantCall__Group_4__0__Impl rule__ConstantCall__Group_4__1 ;
    public final void rule__ConstantCall__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3583:1: ( rule__ConstantCall__Group_4__0__Impl rule__ConstantCall__Group_4__1 )
            // InternalQL.g:3584:2: rule__ConstantCall__Group_4__0__Impl rule__ConstantCall__Group_4__1
            {
            pushFollow(FOLLOW_29);
            rule__ConstantCall__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstantCall__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantCall__Group_4__0"


    // $ANTLR start "rule__ConstantCall__Group_4__0__Impl"
    // InternalQL.g:3591:1: rule__ConstantCall__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__ConstantCall__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3595:1: ( ( 'value' ) )
            // InternalQL.g:3596:1: ( 'value' )
            {
            // InternalQL.g:3596:1: ( 'value' )
            // InternalQL.g:3597:2: 'value'
            {
             before(grammarAccess.getConstantCallAccess().getValueKeyword_4_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getConstantCallAccess().getValueKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantCall__Group_4__0__Impl"


    // $ANTLR start "rule__ConstantCall__Group_4__1"
    // InternalQL.g:3606:1: rule__ConstantCall__Group_4__1 : rule__ConstantCall__Group_4__1__Impl ;
    public final void rule__ConstantCall__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3610:1: ( rule__ConstantCall__Group_4__1__Impl )
            // InternalQL.g:3611:2: rule__ConstantCall__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstantCall__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantCall__Group_4__1"


    // $ANTLR start "rule__ConstantCall__Group_4__1__Impl"
    // InternalQL.g:3617:1: rule__ConstantCall__Group_4__1__Impl : ( ( rule__ConstantCall__ValueAssignment_4_1 ) ) ;
    public final void rule__ConstantCall__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3621:1: ( ( ( rule__ConstantCall__ValueAssignment_4_1 ) ) )
            // InternalQL.g:3622:1: ( ( rule__ConstantCall__ValueAssignment_4_1 ) )
            {
            // InternalQL.g:3622:1: ( ( rule__ConstantCall__ValueAssignment_4_1 ) )
            // InternalQL.g:3623:2: ( rule__ConstantCall__ValueAssignment_4_1 )
            {
             before(grammarAccess.getConstantCallAccess().getValueAssignment_4_1()); 
            // InternalQL.g:3624:2: ( rule__ConstantCall__ValueAssignment_4_1 )
            // InternalQL.g:3624:3: rule__ConstantCall__ValueAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ConstantCall__ValueAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getConstantCallAccess().getValueAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantCall__Group_4__1__Impl"


    // $ANTLR start "rule__BasicUnaryExpression__Group__0"
    // InternalQL.g:3633:1: rule__BasicUnaryExpression__Group__0 : rule__BasicUnaryExpression__Group__0__Impl rule__BasicUnaryExpression__Group__1 ;
    public final void rule__BasicUnaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3637:1: ( rule__BasicUnaryExpression__Group__0__Impl rule__BasicUnaryExpression__Group__1 )
            // InternalQL.g:3638:2: rule__BasicUnaryExpression__Group__0__Impl rule__BasicUnaryExpression__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__BasicUnaryExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicUnaryExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicUnaryExpression__Group__0"


    // $ANTLR start "rule__BasicUnaryExpression__Group__0__Impl"
    // InternalQL.g:3645:1: rule__BasicUnaryExpression__Group__0__Impl : ( 'BasicUnaryExpression' ) ;
    public final void rule__BasicUnaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3649:1: ( ( 'BasicUnaryExpression' ) )
            // InternalQL.g:3650:1: ( 'BasicUnaryExpression' )
            {
            // InternalQL.g:3650:1: ( 'BasicUnaryExpression' )
            // InternalQL.g:3651:2: 'BasicUnaryExpression'
            {
             before(grammarAccess.getBasicUnaryExpressionAccess().getBasicUnaryExpressionKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getBasicUnaryExpressionAccess().getBasicUnaryExpressionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicUnaryExpression__Group__0__Impl"


    // $ANTLR start "rule__BasicUnaryExpression__Group__1"
    // InternalQL.g:3660:1: rule__BasicUnaryExpression__Group__1 : rule__BasicUnaryExpression__Group__1__Impl rule__BasicUnaryExpression__Group__2 ;
    public final void rule__BasicUnaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3664:1: ( rule__BasicUnaryExpression__Group__1__Impl rule__BasicUnaryExpression__Group__2 )
            // InternalQL.g:3665:2: rule__BasicUnaryExpression__Group__1__Impl rule__BasicUnaryExpression__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__BasicUnaryExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicUnaryExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicUnaryExpression__Group__1"


    // $ANTLR start "rule__BasicUnaryExpression__Group__1__Impl"
    // InternalQL.g:3672:1: rule__BasicUnaryExpression__Group__1__Impl : ( '{' ) ;
    public final void rule__BasicUnaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3676:1: ( ( '{' ) )
            // InternalQL.g:3677:1: ( '{' )
            {
            // InternalQL.g:3677:1: ( '{' )
            // InternalQL.g:3678:2: '{'
            {
             before(grammarAccess.getBasicUnaryExpressionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getBasicUnaryExpressionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicUnaryExpression__Group__1__Impl"


    // $ANTLR start "rule__BasicUnaryExpression__Group__2"
    // InternalQL.g:3687:1: rule__BasicUnaryExpression__Group__2 : rule__BasicUnaryExpression__Group__2__Impl rule__BasicUnaryExpression__Group__3 ;
    public final void rule__BasicUnaryExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3691:1: ( rule__BasicUnaryExpression__Group__2__Impl rule__BasicUnaryExpression__Group__3 )
            // InternalQL.g:3692:2: rule__BasicUnaryExpression__Group__2__Impl rule__BasicUnaryExpression__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__BasicUnaryExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicUnaryExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicUnaryExpression__Group__2"


    // $ANTLR start "rule__BasicUnaryExpression__Group__2__Impl"
    // InternalQL.g:3699:1: rule__BasicUnaryExpression__Group__2__Impl : ( ( rule__BasicUnaryExpression__Group_2__0 )? ) ;
    public final void rule__BasicUnaryExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3703:1: ( ( ( rule__BasicUnaryExpression__Group_2__0 )? ) )
            // InternalQL.g:3704:1: ( ( rule__BasicUnaryExpression__Group_2__0 )? )
            {
            // InternalQL.g:3704:1: ( ( rule__BasicUnaryExpression__Group_2__0 )? )
            // InternalQL.g:3705:2: ( rule__BasicUnaryExpression__Group_2__0 )?
            {
             before(grammarAccess.getBasicUnaryExpressionAccess().getGroup_2()); 
            // InternalQL.g:3706:2: ( rule__BasicUnaryExpression__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==47) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalQL.g:3706:3: rule__BasicUnaryExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicUnaryExpression__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBasicUnaryExpressionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicUnaryExpression__Group__2__Impl"


    // $ANTLR start "rule__BasicUnaryExpression__Group__3"
    // InternalQL.g:3714:1: rule__BasicUnaryExpression__Group__3 : rule__BasicUnaryExpression__Group__3__Impl rule__BasicUnaryExpression__Group__4 ;
    public final void rule__BasicUnaryExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3718:1: ( rule__BasicUnaryExpression__Group__3__Impl rule__BasicUnaryExpression__Group__4 )
            // InternalQL.g:3719:2: rule__BasicUnaryExpression__Group__3__Impl rule__BasicUnaryExpression__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__BasicUnaryExpression__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicUnaryExpression__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicUnaryExpression__Group__3"


    // $ANTLR start "rule__BasicUnaryExpression__Group__3__Impl"
    // InternalQL.g:3726:1: rule__BasicUnaryExpression__Group__3__Impl : ( ( rule__BasicUnaryExpression__Group_3__0 )? ) ;
    public final void rule__BasicUnaryExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3730:1: ( ( ( rule__BasicUnaryExpression__Group_3__0 )? ) )
            // InternalQL.g:3731:1: ( ( rule__BasicUnaryExpression__Group_3__0 )? )
            {
            // InternalQL.g:3731:1: ( ( rule__BasicUnaryExpression__Group_3__0 )? )
            // InternalQL.g:3732:2: ( rule__BasicUnaryExpression__Group_3__0 )?
            {
             before(grammarAccess.getBasicUnaryExpressionAccess().getGroup_3()); 
            // InternalQL.g:3733:2: ( rule__BasicUnaryExpression__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==50) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalQL.g:3733:3: rule__BasicUnaryExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicUnaryExpression__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBasicUnaryExpressionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicUnaryExpression__Group__3__Impl"


    // $ANTLR start "rule__BasicUnaryExpression__Group__4"
    // InternalQL.g:3741:1: rule__BasicUnaryExpression__Group__4 : rule__BasicUnaryExpression__Group__4__Impl rule__BasicUnaryExpression__Group__5 ;
    public final void rule__BasicUnaryExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3745:1: ( rule__BasicUnaryExpression__Group__4__Impl rule__BasicUnaryExpression__Group__5 )
            // InternalQL.g:3746:2: rule__BasicUnaryExpression__Group__4__Impl rule__BasicUnaryExpression__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__BasicUnaryExpression__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicUnaryExpression__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicUnaryExpression__Group__4"


    // $ANTLR start "rule__BasicUnaryExpression__Group__4__Impl"
    // InternalQL.g:3753:1: rule__BasicUnaryExpression__Group__4__Impl : ( 'operand' ) ;
    public final void rule__BasicUnaryExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3757:1: ( ( 'operand' ) )
            // InternalQL.g:3758:1: ( 'operand' )
            {
            // InternalQL.g:3758:1: ( 'operand' )
            // InternalQL.g:3759:2: 'operand'
            {
             before(grammarAccess.getBasicUnaryExpressionAccess().getOperandKeyword_4()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getBasicUnaryExpressionAccess().getOperandKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicUnaryExpression__Group__4__Impl"


    // $ANTLR start "rule__BasicUnaryExpression__Group__5"
    // InternalQL.g:3768:1: rule__BasicUnaryExpression__Group__5 : rule__BasicUnaryExpression__Group__5__Impl rule__BasicUnaryExpression__Group__6 ;
    public final void rule__BasicUnaryExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3772:1: ( rule__BasicUnaryExpression__Group__5__Impl rule__BasicUnaryExpression__Group__6 )
            // InternalQL.g:3773:2: rule__BasicUnaryExpression__Group__5__Impl rule__BasicUnaryExpression__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__BasicUnaryExpression__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicUnaryExpression__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicUnaryExpression__Group__5"


    // $ANTLR start "rule__BasicUnaryExpression__Group__5__Impl"
    // InternalQL.g:3780:1: rule__BasicUnaryExpression__Group__5__Impl : ( ( rule__BasicUnaryExpression__OperandAssignment_5 ) ) ;
    public final void rule__BasicUnaryExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3784:1: ( ( ( rule__BasicUnaryExpression__OperandAssignment_5 ) ) )
            // InternalQL.g:3785:1: ( ( rule__BasicUnaryExpression__OperandAssignment_5 ) )
            {
            // InternalQL.g:3785:1: ( ( rule__BasicUnaryExpression__OperandAssignment_5 ) )
            // InternalQL.g:3786:2: ( rule__BasicUnaryExpression__OperandAssignment_5 )
            {
             before(grammarAccess.getBasicUnaryExpressionAccess().getOperandAssignment_5()); 
            // InternalQL.g:3787:2: ( rule__BasicUnaryExpression__OperandAssignment_5 )
            // InternalQL.g:3787:3: rule__BasicUnaryExpression__OperandAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__BasicUnaryExpression__OperandAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBasicUnaryExpressionAccess().getOperandAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicUnaryExpression__Group__5__Impl"


    // $ANTLR start "rule__BasicUnaryExpression__Group__6"
    // InternalQL.g:3795:1: rule__BasicUnaryExpression__Group__6 : rule__BasicUnaryExpression__Group__6__Impl ;
    public final void rule__BasicUnaryExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3799:1: ( rule__BasicUnaryExpression__Group__6__Impl )
            // InternalQL.g:3800:2: rule__BasicUnaryExpression__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicUnaryExpression__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicUnaryExpression__Group__6"


    // $ANTLR start "rule__BasicUnaryExpression__Group__6__Impl"
    // InternalQL.g:3806:1: rule__BasicUnaryExpression__Group__6__Impl : ( '}' ) ;
    public final void rule__BasicUnaryExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3810:1: ( ( '}' ) )
            // InternalQL.g:3811:1: ( '}' )
            {
            // InternalQL.g:3811:1: ( '}' )
            // InternalQL.g:3812:2: '}'
            {
             before(grammarAccess.getBasicUnaryExpressionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getBasicUnaryExpressionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicUnaryExpression__Group__6__Impl"


    // $ANTLR start "rule__BasicUnaryExpression__Group_2__0"
    // InternalQL.g:3822:1: rule__BasicUnaryExpression__Group_2__0 : rule__BasicUnaryExpression__Group_2__0__Impl rule__BasicUnaryExpression__Group_2__1 ;
    public final void rule__BasicUnaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3826:1: ( rule__BasicUnaryExpression__Group_2__0__Impl rule__BasicUnaryExpression__Group_2__1 )
            // InternalQL.g:3827:2: rule__BasicUnaryExpression__Group_2__0__Impl rule__BasicUnaryExpression__Group_2__1
            {
            pushFollow(FOLLOW_31);
            rule__BasicUnaryExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicUnaryExpression__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicUnaryExpression__Group_2__0"


    // $ANTLR start "rule__BasicUnaryExpression__Group_2__0__Impl"
    // InternalQL.g:3834:1: rule__BasicUnaryExpression__Group_2__0__Impl : ( 'operator' ) ;
    public final void rule__BasicUnaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3838:1: ( ( 'operator' ) )
            // InternalQL.g:3839:1: ( 'operator' )
            {
            // InternalQL.g:3839:1: ( 'operator' )
            // InternalQL.g:3840:2: 'operator'
            {
             before(grammarAccess.getBasicUnaryExpressionAccess().getOperatorKeyword_2_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getBasicUnaryExpressionAccess().getOperatorKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicUnaryExpression__Group_2__0__Impl"


    // $ANTLR start "rule__BasicUnaryExpression__Group_2__1"
    // InternalQL.g:3849:1: rule__BasicUnaryExpression__Group_2__1 : rule__BasicUnaryExpression__Group_2__1__Impl ;
    public final void rule__BasicUnaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3853:1: ( rule__BasicUnaryExpression__Group_2__1__Impl )
            // InternalQL.g:3854:2: rule__BasicUnaryExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicUnaryExpression__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicUnaryExpression__Group_2__1"


    // $ANTLR start "rule__BasicUnaryExpression__Group_2__1__Impl"
    // InternalQL.g:3860:1: rule__BasicUnaryExpression__Group_2__1__Impl : ( ( rule__BasicUnaryExpression__OperatorAssignment_2_1 ) ) ;
    public final void rule__BasicUnaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3864:1: ( ( ( rule__BasicUnaryExpression__OperatorAssignment_2_1 ) ) )
            // InternalQL.g:3865:1: ( ( rule__BasicUnaryExpression__OperatorAssignment_2_1 ) )
            {
            // InternalQL.g:3865:1: ( ( rule__BasicUnaryExpression__OperatorAssignment_2_1 ) )
            // InternalQL.g:3866:2: ( rule__BasicUnaryExpression__OperatorAssignment_2_1 )
            {
             before(grammarAccess.getBasicUnaryExpressionAccess().getOperatorAssignment_2_1()); 
            // InternalQL.g:3867:2: ( rule__BasicUnaryExpression__OperatorAssignment_2_1 )
            // InternalQL.g:3867:3: rule__BasicUnaryExpression__OperatorAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__BasicUnaryExpression__OperatorAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getBasicUnaryExpressionAccess().getOperatorAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicUnaryExpression__Group_2__1__Impl"


    // $ANTLR start "rule__BasicUnaryExpression__Group_3__0"
    // InternalQL.g:3876:1: rule__BasicUnaryExpression__Group_3__0 : rule__BasicUnaryExpression__Group_3__0__Impl rule__BasicUnaryExpression__Group_3__1 ;
    public final void rule__BasicUnaryExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3880:1: ( rule__BasicUnaryExpression__Group_3__0__Impl rule__BasicUnaryExpression__Group_3__1 )
            // InternalQL.g:3881:2: rule__BasicUnaryExpression__Group_3__0__Impl rule__BasicUnaryExpression__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__BasicUnaryExpression__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicUnaryExpression__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicUnaryExpression__Group_3__0"


    // $ANTLR start "rule__BasicUnaryExpression__Group_3__0__Impl"
    // InternalQL.g:3888:1: rule__BasicUnaryExpression__Group_3__0__Impl : ( 'resultType' ) ;
    public final void rule__BasicUnaryExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3892:1: ( ( 'resultType' ) )
            // InternalQL.g:3893:1: ( 'resultType' )
            {
            // InternalQL.g:3893:1: ( 'resultType' )
            // InternalQL.g:3894:2: 'resultType'
            {
             before(grammarAccess.getBasicUnaryExpressionAccess().getResultTypeKeyword_3_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getBasicUnaryExpressionAccess().getResultTypeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicUnaryExpression__Group_3__0__Impl"


    // $ANTLR start "rule__BasicUnaryExpression__Group_3__1"
    // InternalQL.g:3903:1: rule__BasicUnaryExpression__Group_3__1 : rule__BasicUnaryExpression__Group_3__1__Impl ;
    public final void rule__BasicUnaryExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3907:1: ( rule__BasicUnaryExpression__Group_3__1__Impl )
            // InternalQL.g:3908:2: rule__BasicUnaryExpression__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicUnaryExpression__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicUnaryExpression__Group_3__1"


    // $ANTLR start "rule__BasicUnaryExpression__Group_3__1__Impl"
    // InternalQL.g:3914:1: rule__BasicUnaryExpression__Group_3__1__Impl : ( ( rule__BasicUnaryExpression__ResultTypeAssignment_3_1 ) ) ;
    public final void rule__BasicUnaryExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3918:1: ( ( ( rule__BasicUnaryExpression__ResultTypeAssignment_3_1 ) ) )
            // InternalQL.g:3919:1: ( ( rule__BasicUnaryExpression__ResultTypeAssignment_3_1 ) )
            {
            // InternalQL.g:3919:1: ( ( rule__BasicUnaryExpression__ResultTypeAssignment_3_1 ) )
            // InternalQL.g:3920:2: ( rule__BasicUnaryExpression__ResultTypeAssignment_3_1 )
            {
             before(grammarAccess.getBasicUnaryExpressionAccess().getResultTypeAssignment_3_1()); 
            // InternalQL.g:3921:2: ( rule__BasicUnaryExpression__ResultTypeAssignment_3_1 )
            // InternalQL.g:3921:3: rule__BasicUnaryExpression__ResultTypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BasicUnaryExpression__ResultTypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBasicUnaryExpressionAccess().getResultTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicUnaryExpression__Group_3__1__Impl"


    // $ANTLR start "rule__QuestionCall__Group__0"
    // InternalQL.g:3930:1: rule__QuestionCall__Group__0 : rule__QuestionCall__Group__0__Impl rule__QuestionCall__Group__1 ;
    public final void rule__QuestionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3934:1: ( rule__QuestionCall__Group__0__Impl rule__QuestionCall__Group__1 )
            // InternalQL.g:3935:2: rule__QuestionCall__Group__0__Impl rule__QuestionCall__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalQL.g:3942:1: rule__QuestionCall__Group__0__Impl : ( 'QuestionCall' ) ;
    public final void rule__QuestionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3946:1: ( ( 'QuestionCall' ) )
            // InternalQL.g:3947:1: ( 'QuestionCall' )
            {
            // InternalQL.g:3947:1: ( 'QuestionCall' )
            // InternalQL.g:3948:2: 'QuestionCall'
            {
             before(grammarAccess.getQuestionCallAccess().getQuestionCallKeyword_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getQuestionCallAccess().getQuestionCallKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCall__Group__0__Impl"


    // $ANTLR start "rule__QuestionCall__Group__1"
    // InternalQL.g:3957:1: rule__QuestionCall__Group__1 : rule__QuestionCall__Group__1__Impl rule__QuestionCall__Group__2 ;
    public final void rule__QuestionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3961:1: ( rule__QuestionCall__Group__1__Impl rule__QuestionCall__Group__2 )
            // InternalQL.g:3962:2: rule__QuestionCall__Group__1__Impl rule__QuestionCall__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalQL.g:3969:1: rule__QuestionCall__Group__1__Impl : ( '{' ) ;
    public final void rule__QuestionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3973:1: ( ( '{' ) )
            // InternalQL.g:3974:1: ( '{' )
            {
            // InternalQL.g:3974:1: ( '{' )
            // InternalQL.g:3975:2: '{'
            {
             before(grammarAccess.getQuestionCallAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getQuestionCallAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalQL.g:3984:1: rule__QuestionCall__Group__2 : rule__QuestionCall__Group__2__Impl rule__QuestionCall__Group__3 ;
    public final void rule__QuestionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3988:1: ( rule__QuestionCall__Group__2__Impl rule__QuestionCall__Group__3 )
            // InternalQL.g:3989:2: rule__QuestionCall__Group__2__Impl rule__QuestionCall__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalQL.g:3996:1: rule__QuestionCall__Group__2__Impl : ( ( rule__QuestionCall__Group_2__0 )? ) ;
    public final void rule__QuestionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4000:1: ( ( ( rule__QuestionCall__Group_2__0 )? ) )
            // InternalQL.g:4001:1: ( ( rule__QuestionCall__Group_2__0 )? )
            {
            // InternalQL.g:4001:1: ( ( rule__QuestionCall__Group_2__0 )? )
            // InternalQL.g:4002:2: ( rule__QuestionCall__Group_2__0 )?
            {
             before(grammarAccess.getQuestionCallAccess().getGroup_2()); 
            // InternalQL.g:4003:2: ( rule__QuestionCall__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==50) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalQL.g:4003:3: rule__QuestionCall__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionCall__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionCallAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalQL.g:4011:1: rule__QuestionCall__Group__3 : rule__QuestionCall__Group__3__Impl rule__QuestionCall__Group__4 ;
    public final void rule__QuestionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4015:1: ( rule__QuestionCall__Group__3__Impl rule__QuestionCall__Group__4 )
            // InternalQL.g:4016:2: rule__QuestionCall__Group__3__Impl rule__QuestionCall__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__QuestionCall__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionCall__Group__4();

            state._fsp--;


            }

        }
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
    // InternalQL.g:4023:1: rule__QuestionCall__Group__3__Impl : ( 'question' ) ;
    public final void rule__QuestionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4027:1: ( ( 'question' ) )
            // InternalQL.g:4028:1: ( 'question' )
            {
            // InternalQL.g:4028:1: ( 'question' )
            // InternalQL.g:4029:2: 'question'
            {
             before(grammarAccess.getQuestionCallAccess().getQuestionKeyword_3()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getQuestionCallAccess().getQuestionKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__QuestionCall__Group__4"
    // InternalQL.g:4038:1: rule__QuestionCall__Group__4 : rule__QuestionCall__Group__4__Impl rule__QuestionCall__Group__5 ;
    public final void rule__QuestionCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4042:1: ( rule__QuestionCall__Group__4__Impl rule__QuestionCall__Group__5 )
            // InternalQL.g:4043:2: rule__QuestionCall__Group__4__Impl rule__QuestionCall__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__QuestionCall__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionCall__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCall__Group__4"


    // $ANTLR start "rule__QuestionCall__Group__4__Impl"
    // InternalQL.g:4050:1: rule__QuestionCall__Group__4__Impl : ( ( rule__QuestionCall__QuestionAssignment_4 ) ) ;
    public final void rule__QuestionCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4054:1: ( ( ( rule__QuestionCall__QuestionAssignment_4 ) ) )
            // InternalQL.g:4055:1: ( ( rule__QuestionCall__QuestionAssignment_4 ) )
            {
            // InternalQL.g:4055:1: ( ( rule__QuestionCall__QuestionAssignment_4 ) )
            // InternalQL.g:4056:2: ( rule__QuestionCall__QuestionAssignment_4 )
            {
             before(grammarAccess.getQuestionCallAccess().getQuestionAssignment_4()); 
            // InternalQL.g:4057:2: ( rule__QuestionCall__QuestionAssignment_4 )
            // InternalQL.g:4057:3: rule__QuestionCall__QuestionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__QuestionCall__QuestionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getQuestionCallAccess().getQuestionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCall__Group__4__Impl"


    // $ANTLR start "rule__QuestionCall__Group__5"
    // InternalQL.g:4065:1: rule__QuestionCall__Group__5 : rule__QuestionCall__Group__5__Impl ;
    public final void rule__QuestionCall__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4069:1: ( rule__QuestionCall__Group__5__Impl )
            // InternalQL.g:4070:2: rule__QuestionCall__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionCall__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCall__Group__5"


    // $ANTLR start "rule__QuestionCall__Group__5__Impl"
    // InternalQL.g:4076:1: rule__QuestionCall__Group__5__Impl : ( '}' ) ;
    public final void rule__QuestionCall__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4080:1: ( ( '}' ) )
            // InternalQL.g:4081:1: ( '}' )
            {
            // InternalQL.g:4081:1: ( '}' )
            // InternalQL.g:4082:2: '}'
            {
             before(grammarAccess.getQuestionCallAccess().getRightCurlyBracketKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getQuestionCallAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCall__Group__5__Impl"


    // $ANTLR start "rule__QuestionCall__Group_2__0"
    // InternalQL.g:4092:1: rule__QuestionCall__Group_2__0 : rule__QuestionCall__Group_2__0__Impl rule__QuestionCall__Group_2__1 ;
    public final void rule__QuestionCall__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4096:1: ( rule__QuestionCall__Group_2__0__Impl rule__QuestionCall__Group_2__1 )
            // InternalQL.g:4097:2: rule__QuestionCall__Group_2__0__Impl rule__QuestionCall__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__QuestionCall__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionCall__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCall__Group_2__0"


    // $ANTLR start "rule__QuestionCall__Group_2__0__Impl"
    // InternalQL.g:4104:1: rule__QuestionCall__Group_2__0__Impl : ( 'resultType' ) ;
    public final void rule__QuestionCall__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4108:1: ( ( 'resultType' ) )
            // InternalQL.g:4109:1: ( 'resultType' )
            {
            // InternalQL.g:4109:1: ( 'resultType' )
            // InternalQL.g:4110:2: 'resultType'
            {
             before(grammarAccess.getQuestionCallAccess().getResultTypeKeyword_2_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getQuestionCallAccess().getResultTypeKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCall__Group_2__0__Impl"


    // $ANTLR start "rule__QuestionCall__Group_2__1"
    // InternalQL.g:4119:1: rule__QuestionCall__Group_2__1 : rule__QuestionCall__Group_2__1__Impl ;
    public final void rule__QuestionCall__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4123:1: ( rule__QuestionCall__Group_2__1__Impl )
            // InternalQL.g:4124:2: rule__QuestionCall__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionCall__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCall__Group_2__1"


    // $ANTLR start "rule__QuestionCall__Group_2__1__Impl"
    // InternalQL.g:4130:1: rule__QuestionCall__Group_2__1__Impl : ( ( rule__QuestionCall__ResultTypeAssignment_2_1 ) ) ;
    public final void rule__QuestionCall__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4134:1: ( ( ( rule__QuestionCall__ResultTypeAssignment_2_1 ) ) )
            // InternalQL.g:4135:1: ( ( rule__QuestionCall__ResultTypeAssignment_2_1 ) )
            {
            // InternalQL.g:4135:1: ( ( rule__QuestionCall__ResultTypeAssignment_2_1 ) )
            // InternalQL.g:4136:2: ( rule__QuestionCall__ResultTypeAssignment_2_1 )
            {
             before(grammarAccess.getQuestionCallAccess().getResultTypeAssignment_2_1()); 
            // InternalQL.g:4137:2: ( rule__QuestionCall__ResultTypeAssignment_2_1 )
            // InternalQL.g:4137:3: rule__QuestionCall__ResultTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__QuestionCall__ResultTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionCallAccess().getResultTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCall__Group_2__1__Impl"


    // $ANTLR start "rule__BooleanValueType__Group__0"
    // InternalQL.g:4146:1: rule__BooleanValueType__Group__0 : rule__BooleanValueType__Group__0__Impl rule__BooleanValueType__Group__1 ;
    public final void rule__BooleanValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4150:1: ( rule__BooleanValueType__Group__0__Impl rule__BooleanValueType__Group__1 )
            // InternalQL.g:4151:2: rule__BooleanValueType__Group__0__Impl rule__BooleanValueType__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalQL.g:4158:1: rule__BooleanValueType__Group__0__Impl : ( () ) ;
    public final void rule__BooleanValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4162:1: ( ( () ) )
            // InternalQL.g:4163:1: ( () )
            {
            // InternalQL.g:4163:1: ( () )
            // InternalQL.g:4164:2: ()
            {
             before(grammarAccess.getBooleanValueTypeAccess().getBooleanValueTypeAction_0()); 
            // InternalQL.g:4165:2: ()
            // InternalQL.g:4165:3: 
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
    // InternalQL.g:4173:1: rule__BooleanValueType__Group__1 : rule__BooleanValueType__Group__1__Impl rule__BooleanValueType__Group__2 ;
    public final void rule__BooleanValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4177:1: ( rule__BooleanValueType__Group__1__Impl rule__BooleanValueType__Group__2 )
            // InternalQL.g:4178:2: rule__BooleanValueType__Group__1__Impl rule__BooleanValueType__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalQL.g:4185:1: rule__BooleanValueType__Group__1__Impl : ( 'BooleanValueType' ) ;
    public final void rule__BooleanValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4189:1: ( ( 'BooleanValueType' ) )
            // InternalQL.g:4190:1: ( 'BooleanValueType' )
            {
            // InternalQL.g:4190:1: ( 'BooleanValueType' )
            // InternalQL.g:4191:2: 'BooleanValueType'
            {
             before(grammarAccess.getBooleanValueTypeAccess().getBooleanValueTypeKeyword_1()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getBooleanValueTypeAccess().getBooleanValueTypeKeyword_1()); 

            }


            }

        }
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
    // InternalQL.g:4200:1: rule__BooleanValueType__Group__2 : rule__BooleanValueType__Group__2__Impl rule__BooleanValueType__Group__3 ;
    public final void rule__BooleanValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4204:1: ( rule__BooleanValueType__Group__2__Impl rule__BooleanValueType__Group__3 )
            // InternalQL.g:4205:2: rule__BooleanValueType__Group__2__Impl rule__BooleanValueType__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalQL.g:4212:1: rule__BooleanValueType__Group__2__Impl : ( ( rule__BooleanValueType__NameAssignment_2 ) ) ;
    public final void rule__BooleanValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4216:1: ( ( ( rule__BooleanValueType__NameAssignment_2 ) ) )
            // InternalQL.g:4217:1: ( ( rule__BooleanValueType__NameAssignment_2 ) )
            {
            // InternalQL.g:4217:1: ( ( rule__BooleanValueType__NameAssignment_2 ) )
            // InternalQL.g:4218:2: ( rule__BooleanValueType__NameAssignment_2 )
            {
             before(grammarAccess.getBooleanValueTypeAccess().getNameAssignment_2()); 
            // InternalQL.g:4219:2: ( rule__BooleanValueType__NameAssignment_2 )
            // InternalQL.g:4219:3: rule__BooleanValueType__NameAssignment_2
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
    // InternalQL.g:4227:1: rule__BooleanValueType__Group__3 : rule__BooleanValueType__Group__3__Impl rule__BooleanValueType__Group__4 ;
    public final void rule__BooleanValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4231:1: ( rule__BooleanValueType__Group__3__Impl rule__BooleanValueType__Group__4 )
            // InternalQL.g:4232:2: rule__BooleanValueType__Group__3__Impl rule__BooleanValueType__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__BooleanValueType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanValueType__Group__4();

            state._fsp--;


            }

        }
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
    // InternalQL.g:4239:1: rule__BooleanValueType__Group__3__Impl : ( '{' ) ;
    public final void rule__BooleanValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4243:1: ( ( '{' ) )
            // InternalQL.g:4244:1: ( '{' )
            {
            // InternalQL.g:4244:1: ( '{' )
            // InternalQL.g:4245:2: '{'
            {
             before(grammarAccess.getBooleanValueTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getBooleanValueTypeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__BooleanValueType__Group__4"
    // InternalQL.g:4254:1: rule__BooleanValueType__Group__4 : rule__BooleanValueType__Group__4__Impl rule__BooleanValueType__Group__5 ;
    public final void rule__BooleanValueType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4258:1: ( rule__BooleanValueType__Group__4__Impl rule__BooleanValueType__Group__5 )
            // InternalQL.g:4259:2: rule__BooleanValueType__Group__4__Impl rule__BooleanValueType__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__BooleanValueType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanValueType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group__4"


    // $ANTLR start "rule__BooleanValueType__Group__4__Impl"
    // InternalQL.g:4266:1: rule__BooleanValueType__Group__4__Impl : ( ( rule__BooleanValueType__Group_4__0 )? ) ;
    public final void rule__BooleanValueType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4270:1: ( ( ( rule__BooleanValueType__Group_4__0 )? ) )
            // InternalQL.g:4271:1: ( ( rule__BooleanValueType__Group_4__0 )? )
            {
            // InternalQL.g:4271:1: ( ( rule__BooleanValueType__Group_4__0 )? )
            // InternalQL.g:4272:2: ( rule__BooleanValueType__Group_4__0 )?
            {
             before(grammarAccess.getBooleanValueTypeAccess().getGroup_4()); 
            // InternalQL.g:4273:2: ( rule__BooleanValueType__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==45) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalQL.g:4273:3: rule__BooleanValueType__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanValueType__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBooleanValueTypeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group__4__Impl"


    // $ANTLR start "rule__BooleanValueType__Group__5"
    // InternalQL.g:4281:1: rule__BooleanValueType__Group__5 : rule__BooleanValueType__Group__5__Impl ;
    public final void rule__BooleanValueType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4285:1: ( rule__BooleanValueType__Group__5__Impl )
            // InternalQL.g:4286:2: rule__BooleanValueType__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValueType__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group__5"


    // $ANTLR start "rule__BooleanValueType__Group__5__Impl"
    // InternalQL.g:4292:1: rule__BooleanValueType__Group__5__Impl : ( '}' ) ;
    public final void rule__BooleanValueType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4296:1: ( ( '}' ) )
            // InternalQL.g:4297:1: ( '}' )
            {
            // InternalQL.g:4297:1: ( '}' )
            // InternalQL.g:4298:2: '}'
            {
             before(grammarAccess.getBooleanValueTypeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getBooleanValueTypeAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group__5__Impl"


    // $ANTLR start "rule__BooleanValueType__Group_4__0"
    // InternalQL.g:4308:1: rule__BooleanValueType__Group_4__0 : rule__BooleanValueType__Group_4__0__Impl rule__BooleanValueType__Group_4__1 ;
    public final void rule__BooleanValueType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4312:1: ( rule__BooleanValueType__Group_4__0__Impl rule__BooleanValueType__Group_4__1 )
            // InternalQL.g:4313:2: rule__BooleanValueType__Group_4__0__Impl rule__BooleanValueType__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__BooleanValueType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanValueType__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group_4__0"


    // $ANTLR start "rule__BooleanValueType__Group_4__0__Impl"
    // InternalQL.g:4320:1: rule__BooleanValueType__Group_4__0__Impl : ( 'unit' ) ;
    public final void rule__BooleanValueType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4324:1: ( ( 'unit' ) )
            // InternalQL.g:4325:1: ( 'unit' )
            {
            // InternalQL.g:4325:1: ( 'unit' )
            // InternalQL.g:4326:2: 'unit'
            {
             before(grammarAccess.getBooleanValueTypeAccess().getUnitKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getBooleanValueTypeAccess().getUnitKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group_4__0__Impl"


    // $ANTLR start "rule__BooleanValueType__Group_4__1"
    // InternalQL.g:4335:1: rule__BooleanValueType__Group_4__1 : rule__BooleanValueType__Group_4__1__Impl ;
    public final void rule__BooleanValueType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4339:1: ( rule__BooleanValueType__Group_4__1__Impl )
            // InternalQL.g:4340:2: rule__BooleanValueType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValueType__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group_4__1"


    // $ANTLR start "rule__BooleanValueType__Group_4__1__Impl"
    // InternalQL.g:4346:1: rule__BooleanValueType__Group_4__1__Impl : ( ( rule__BooleanValueType__UnitAssignment_4_1 ) ) ;
    public final void rule__BooleanValueType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4350:1: ( ( ( rule__BooleanValueType__UnitAssignment_4_1 ) ) )
            // InternalQL.g:4351:1: ( ( rule__BooleanValueType__UnitAssignment_4_1 ) )
            {
            // InternalQL.g:4351:1: ( ( rule__BooleanValueType__UnitAssignment_4_1 ) )
            // InternalQL.g:4352:2: ( rule__BooleanValueType__UnitAssignment_4_1 )
            {
             before(grammarAccess.getBooleanValueTypeAccess().getUnitAssignment_4_1()); 
            // InternalQL.g:4353:2: ( rule__BooleanValueType__UnitAssignment_4_1 )
            // InternalQL.g:4353:3: rule__BooleanValueType__UnitAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValueType__UnitAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueTypeAccess().getUnitAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group_4__1__Impl"


    // $ANTLR start "rule__IntegerValueType__Group__0"
    // InternalQL.g:4362:1: rule__IntegerValueType__Group__0 : rule__IntegerValueType__Group__0__Impl rule__IntegerValueType__Group__1 ;
    public final void rule__IntegerValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4366:1: ( rule__IntegerValueType__Group__0__Impl rule__IntegerValueType__Group__1 )
            // InternalQL.g:4367:2: rule__IntegerValueType__Group__0__Impl rule__IntegerValueType__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalQL.g:4374:1: rule__IntegerValueType__Group__0__Impl : ( () ) ;
    public final void rule__IntegerValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4378:1: ( ( () ) )
            // InternalQL.g:4379:1: ( () )
            {
            // InternalQL.g:4379:1: ( () )
            // InternalQL.g:4380:2: ()
            {
             before(grammarAccess.getIntegerValueTypeAccess().getIntegerValueTypeAction_0()); 
            // InternalQL.g:4381:2: ()
            // InternalQL.g:4381:3: 
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
    // InternalQL.g:4389:1: rule__IntegerValueType__Group__1 : rule__IntegerValueType__Group__1__Impl rule__IntegerValueType__Group__2 ;
    public final void rule__IntegerValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4393:1: ( rule__IntegerValueType__Group__1__Impl rule__IntegerValueType__Group__2 )
            // InternalQL.g:4394:2: rule__IntegerValueType__Group__1__Impl rule__IntegerValueType__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalQL.g:4401:1: rule__IntegerValueType__Group__1__Impl : ( 'IntegerValueType' ) ;
    public final void rule__IntegerValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4405:1: ( ( 'IntegerValueType' ) )
            // InternalQL.g:4406:1: ( 'IntegerValueType' )
            {
            // InternalQL.g:4406:1: ( 'IntegerValueType' )
            // InternalQL.g:4407:2: 'IntegerValueType'
            {
             before(grammarAccess.getIntegerValueTypeAccess().getIntegerValueTypeKeyword_1()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getIntegerValueTypeAccess().getIntegerValueTypeKeyword_1()); 

            }


            }

        }
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
    // InternalQL.g:4416:1: rule__IntegerValueType__Group__2 : rule__IntegerValueType__Group__2__Impl rule__IntegerValueType__Group__3 ;
    public final void rule__IntegerValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4420:1: ( rule__IntegerValueType__Group__2__Impl rule__IntegerValueType__Group__3 )
            // InternalQL.g:4421:2: rule__IntegerValueType__Group__2__Impl rule__IntegerValueType__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalQL.g:4428:1: rule__IntegerValueType__Group__2__Impl : ( ( rule__IntegerValueType__NameAssignment_2 ) ) ;
    public final void rule__IntegerValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4432:1: ( ( ( rule__IntegerValueType__NameAssignment_2 ) ) )
            // InternalQL.g:4433:1: ( ( rule__IntegerValueType__NameAssignment_2 ) )
            {
            // InternalQL.g:4433:1: ( ( rule__IntegerValueType__NameAssignment_2 ) )
            // InternalQL.g:4434:2: ( rule__IntegerValueType__NameAssignment_2 )
            {
             before(grammarAccess.getIntegerValueTypeAccess().getNameAssignment_2()); 
            // InternalQL.g:4435:2: ( rule__IntegerValueType__NameAssignment_2 )
            // InternalQL.g:4435:3: rule__IntegerValueType__NameAssignment_2
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
    // InternalQL.g:4443:1: rule__IntegerValueType__Group__3 : rule__IntegerValueType__Group__3__Impl rule__IntegerValueType__Group__4 ;
    public final void rule__IntegerValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4447:1: ( rule__IntegerValueType__Group__3__Impl rule__IntegerValueType__Group__4 )
            // InternalQL.g:4448:2: rule__IntegerValueType__Group__3__Impl rule__IntegerValueType__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__IntegerValueType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group__4();

            state._fsp--;


            }

        }
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
    // InternalQL.g:4455:1: rule__IntegerValueType__Group__3__Impl : ( '{' ) ;
    public final void rule__IntegerValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4459:1: ( ( '{' ) )
            // InternalQL.g:4460:1: ( '{' )
            {
            // InternalQL.g:4460:1: ( '{' )
            // InternalQL.g:4461:2: '{'
            {
             before(grammarAccess.getIntegerValueTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getIntegerValueTypeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__IntegerValueType__Group__4"
    // InternalQL.g:4470:1: rule__IntegerValueType__Group__4 : rule__IntegerValueType__Group__4__Impl rule__IntegerValueType__Group__5 ;
    public final void rule__IntegerValueType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4474:1: ( rule__IntegerValueType__Group__4__Impl rule__IntegerValueType__Group__5 )
            // InternalQL.g:4475:2: rule__IntegerValueType__Group__4__Impl rule__IntegerValueType__Group__5
            {
            pushFollow(FOLLOW_35);
            rule__IntegerValueType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group__4"


    // $ANTLR start "rule__IntegerValueType__Group__4__Impl"
    // InternalQL.g:4482:1: rule__IntegerValueType__Group__4__Impl : ( ( rule__IntegerValueType__Group_4__0 )? ) ;
    public final void rule__IntegerValueType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4486:1: ( ( ( rule__IntegerValueType__Group_4__0 )? ) )
            // InternalQL.g:4487:1: ( ( rule__IntegerValueType__Group_4__0 )? )
            {
            // InternalQL.g:4487:1: ( ( rule__IntegerValueType__Group_4__0 )? )
            // InternalQL.g:4488:2: ( rule__IntegerValueType__Group_4__0 )?
            {
             before(grammarAccess.getIntegerValueTypeAccess().getGroup_4()); 
            // InternalQL.g:4489:2: ( rule__IntegerValueType__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==45) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalQL.g:4489:3: rule__IntegerValueType__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IntegerValueType__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerValueTypeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group__4__Impl"


    // $ANTLR start "rule__IntegerValueType__Group__5"
    // InternalQL.g:4497:1: rule__IntegerValueType__Group__5 : rule__IntegerValueType__Group__5__Impl rule__IntegerValueType__Group__6 ;
    public final void rule__IntegerValueType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4501:1: ( rule__IntegerValueType__Group__5__Impl rule__IntegerValueType__Group__6 )
            // InternalQL.g:4502:2: rule__IntegerValueType__Group__5__Impl rule__IntegerValueType__Group__6
            {
            pushFollow(FOLLOW_35);
            rule__IntegerValueType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group__5"


    // $ANTLR start "rule__IntegerValueType__Group__5__Impl"
    // InternalQL.g:4509:1: rule__IntegerValueType__Group__5__Impl : ( ( rule__IntegerValueType__Group_5__0 )? ) ;
    public final void rule__IntegerValueType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4513:1: ( ( ( rule__IntegerValueType__Group_5__0 )? ) )
            // InternalQL.g:4514:1: ( ( rule__IntegerValueType__Group_5__0 )? )
            {
            // InternalQL.g:4514:1: ( ( rule__IntegerValueType__Group_5__0 )? )
            // InternalQL.g:4515:2: ( rule__IntegerValueType__Group_5__0 )?
            {
             before(grammarAccess.getIntegerValueTypeAccess().getGroup_5()); 
            // InternalQL.g:4516:2: ( rule__IntegerValueType__Group_5__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==59) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalQL.g:4516:3: rule__IntegerValueType__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IntegerValueType__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerValueTypeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group__5__Impl"


    // $ANTLR start "rule__IntegerValueType__Group__6"
    // InternalQL.g:4524:1: rule__IntegerValueType__Group__6 : rule__IntegerValueType__Group__6__Impl rule__IntegerValueType__Group__7 ;
    public final void rule__IntegerValueType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4528:1: ( rule__IntegerValueType__Group__6__Impl rule__IntegerValueType__Group__7 )
            // InternalQL.g:4529:2: rule__IntegerValueType__Group__6__Impl rule__IntegerValueType__Group__7
            {
            pushFollow(FOLLOW_35);
            rule__IntegerValueType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group__6"


    // $ANTLR start "rule__IntegerValueType__Group__6__Impl"
    // InternalQL.g:4536:1: rule__IntegerValueType__Group__6__Impl : ( ( rule__IntegerValueType__Group_6__0 )? ) ;
    public final void rule__IntegerValueType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4540:1: ( ( ( rule__IntegerValueType__Group_6__0 )? ) )
            // InternalQL.g:4541:1: ( ( rule__IntegerValueType__Group_6__0 )? )
            {
            // InternalQL.g:4541:1: ( ( rule__IntegerValueType__Group_6__0 )? )
            // InternalQL.g:4542:2: ( rule__IntegerValueType__Group_6__0 )?
            {
             before(grammarAccess.getIntegerValueTypeAccess().getGroup_6()); 
            // InternalQL.g:4543:2: ( rule__IntegerValueType__Group_6__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==60) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalQL.g:4543:3: rule__IntegerValueType__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IntegerValueType__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerValueTypeAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group__6__Impl"


    // $ANTLR start "rule__IntegerValueType__Group__7"
    // InternalQL.g:4551:1: rule__IntegerValueType__Group__7 : rule__IntegerValueType__Group__7__Impl ;
    public final void rule__IntegerValueType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4555:1: ( rule__IntegerValueType__Group__7__Impl )
            // InternalQL.g:4556:2: rule__IntegerValueType__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group__7"


    // $ANTLR start "rule__IntegerValueType__Group__7__Impl"
    // InternalQL.g:4562:1: rule__IntegerValueType__Group__7__Impl : ( '}' ) ;
    public final void rule__IntegerValueType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4566:1: ( ( '}' ) )
            // InternalQL.g:4567:1: ( '}' )
            {
            // InternalQL.g:4567:1: ( '}' )
            // InternalQL.g:4568:2: '}'
            {
             before(grammarAccess.getIntegerValueTypeAccess().getRightCurlyBracketKeyword_7()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getIntegerValueTypeAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group__7__Impl"


    // $ANTLR start "rule__IntegerValueType__Group_4__0"
    // InternalQL.g:4578:1: rule__IntegerValueType__Group_4__0 : rule__IntegerValueType__Group_4__0__Impl rule__IntegerValueType__Group_4__1 ;
    public final void rule__IntegerValueType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4582:1: ( rule__IntegerValueType__Group_4__0__Impl rule__IntegerValueType__Group_4__1 )
            // InternalQL.g:4583:2: rule__IntegerValueType__Group_4__0__Impl rule__IntegerValueType__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__IntegerValueType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_4__0"


    // $ANTLR start "rule__IntegerValueType__Group_4__0__Impl"
    // InternalQL.g:4590:1: rule__IntegerValueType__Group_4__0__Impl : ( 'unit' ) ;
    public final void rule__IntegerValueType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4594:1: ( ( 'unit' ) )
            // InternalQL.g:4595:1: ( 'unit' )
            {
            // InternalQL.g:4595:1: ( 'unit' )
            // InternalQL.g:4596:2: 'unit'
            {
             before(grammarAccess.getIntegerValueTypeAccess().getUnitKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getIntegerValueTypeAccess().getUnitKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_4__0__Impl"


    // $ANTLR start "rule__IntegerValueType__Group_4__1"
    // InternalQL.g:4605:1: rule__IntegerValueType__Group_4__1 : rule__IntegerValueType__Group_4__1__Impl ;
    public final void rule__IntegerValueType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4609:1: ( rule__IntegerValueType__Group_4__1__Impl )
            // InternalQL.g:4610:2: rule__IntegerValueType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_4__1"


    // $ANTLR start "rule__IntegerValueType__Group_4__1__Impl"
    // InternalQL.g:4616:1: rule__IntegerValueType__Group_4__1__Impl : ( ( rule__IntegerValueType__UnitAssignment_4_1 ) ) ;
    public final void rule__IntegerValueType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4620:1: ( ( ( rule__IntegerValueType__UnitAssignment_4_1 ) ) )
            // InternalQL.g:4621:1: ( ( rule__IntegerValueType__UnitAssignment_4_1 ) )
            {
            // InternalQL.g:4621:1: ( ( rule__IntegerValueType__UnitAssignment_4_1 ) )
            // InternalQL.g:4622:2: ( rule__IntegerValueType__UnitAssignment_4_1 )
            {
             before(grammarAccess.getIntegerValueTypeAccess().getUnitAssignment_4_1()); 
            // InternalQL.g:4623:2: ( rule__IntegerValueType__UnitAssignment_4_1 )
            // InternalQL.g:4623:3: rule__IntegerValueType__UnitAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValueType__UnitAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getIntegerValueTypeAccess().getUnitAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_4__1__Impl"


    // $ANTLR start "rule__IntegerValueType__Group_5__0"
    // InternalQL.g:4632:1: rule__IntegerValueType__Group_5__0 : rule__IntegerValueType__Group_5__0__Impl rule__IntegerValueType__Group_5__1 ;
    public final void rule__IntegerValueType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4636:1: ( rule__IntegerValueType__Group_5__0__Impl rule__IntegerValueType__Group_5__1 )
            // InternalQL.g:4637:2: rule__IntegerValueType__Group_5__0__Impl rule__IntegerValueType__Group_5__1
            {
            pushFollow(FOLLOW_36);
            rule__IntegerValueType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_5__0"


    // $ANTLR start "rule__IntegerValueType__Group_5__0__Impl"
    // InternalQL.g:4644:1: rule__IntegerValueType__Group_5__0__Impl : ( 'min' ) ;
    public final void rule__IntegerValueType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4648:1: ( ( 'min' ) )
            // InternalQL.g:4649:1: ( 'min' )
            {
            // InternalQL.g:4649:1: ( 'min' )
            // InternalQL.g:4650:2: 'min'
            {
             before(grammarAccess.getIntegerValueTypeAccess().getMinKeyword_5_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getIntegerValueTypeAccess().getMinKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_5__0__Impl"


    // $ANTLR start "rule__IntegerValueType__Group_5__1"
    // InternalQL.g:4659:1: rule__IntegerValueType__Group_5__1 : rule__IntegerValueType__Group_5__1__Impl ;
    public final void rule__IntegerValueType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4663:1: ( rule__IntegerValueType__Group_5__1__Impl )
            // InternalQL.g:4664:2: rule__IntegerValueType__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_5__1"


    // $ANTLR start "rule__IntegerValueType__Group_5__1__Impl"
    // InternalQL.g:4670:1: rule__IntegerValueType__Group_5__1__Impl : ( ( rule__IntegerValueType__MinAssignment_5_1 ) ) ;
    public final void rule__IntegerValueType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4674:1: ( ( ( rule__IntegerValueType__MinAssignment_5_1 ) ) )
            // InternalQL.g:4675:1: ( ( rule__IntegerValueType__MinAssignment_5_1 ) )
            {
            // InternalQL.g:4675:1: ( ( rule__IntegerValueType__MinAssignment_5_1 ) )
            // InternalQL.g:4676:2: ( rule__IntegerValueType__MinAssignment_5_1 )
            {
             before(grammarAccess.getIntegerValueTypeAccess().getMinAssignment_5_1()); 
            // InternalQL.g:4677:2: ( rule__IntegerValueType__MinAssignment_5_1 )
            // InternalQL.g:4677:3: rule__IntegerValueType__MinAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValueType__MinAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getIntegerValueTypeAccess().getMinAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_5__1__Impl"


    // $ANTLR start "rule__IntegerValueType__Group_6__0"
    // InternalQL.g:4686:1: rule__IntegerValueType__Group_6__0 : rule__IntegerValueType__Group_6__0__Impl rule__IntegerValueType__Group_6__1 ;
    public final void rule__IntegerValueType__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4690:1: ( rule__IntegerValueType__Group_6__0__Impl rule__IntegerValueType__Group_6__1 )
            // InternalQL.g:4691:2: rule__IntegerValueType__Group_6__0__Impl rule__IntegerValueType__Group_6__1
            {
            pushFollow(FOLLOW_36);
            rule__IntegerValueType__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_6__0"


    // $ANTLR start "rule__IntegerValueType__Group_6__0__Impl"
    // InternalQL.g:4698:1: rule__IntegerValueType__Group_6__0__Impl : ( 'max' ) ;
    public final void rule__IntegerValueType__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4702:1: ( ( 'max' ) )
            // InternalQL.g:4703:1: ( 'max' )
            {
            // InternalQL.g:4703:1: ( 'max' )
            // InternalQL.g:4704:2: 'max'
            {
             before(grammarAccess.getIntegerValueTypeAccess().getMaxKeyword_6_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getIntegerValueTypeAccess().getMaxKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_6__0__Impl"


    // $ANTLR start "rule__IntegerValueType__Group_6__1"
    // InternalQL.g:4713:1: rule__IntegerValueType__Group_6__1 : rule__IntegerValueType__Group_6__1__Impl ;
    public final void rule__IntegerValueType__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4717:1: ( rule__IntegerValueType__Group_6__1__Impl )
            // InternalQL.g:4718:2: rule__IntegerValueType__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_6__1"


    // $ANTLR start "rule__IntegerValueType__Group_6__1__Impl"
    // InternalQL.g:4724:1: rule__IntegerValueType__Group_6__1__Impl : ( ( rule__IntegerValueType__MaxAssignment_6_1 ) ) ;
    public final void rule__IntegerValueType__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4728:1: ( ( ( rule__IntegerValueType__MaxAssignment_6_1 ) ) )
            // InternalQL.g:4729:1: ( ( rule__IntegerValueType__MaxAssignment_6_1 ) )
            {
            // InternalQL.g:4729:1: ( ( rule__IntegerValueType__MaxAssignment_6_1 ) )
            // InternalQL.g:4730:2: ( rule__IntegerValueType__MaxAssignment_6_1 )
            {
             before(grammarAccess.getIntegerValueTypeAccess().getMaxAssignment_6_1()); 
            // InternalQL.g:4731:2: ( rule__IntegerValueType__MaxAssignment_6_1 )
            // InternalQL.g:4731:3: rule__IntegerValueType__MaxAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValueType__MaxAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getIntegerValueTypeAccess().getMaxAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_6__1__Impl"


    // $ANTLR start "rule__DecimalValueType__Group__0"
    // InternalQL.g:4740:1: rule__DecimalValueType__Group__0 : rule__DecimalValueType__Group__0__Impl rule__DecimalValueType__Group__1 ;
    public final void rule__DecimalValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4744:1: ( rule__DecimalValueType__Group__0__Impl rule__DecimalValueType__Group__1 )
            // InternalQL.g:4745:2: rule__DecimalValueType__Group__0__Impl rule__DecimalValueType__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalQL.g:4752:1: rule__DecimalValueType__Group__0__Impl : ( () ) ;
    public final void rule__DecimalValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4756:1: ( ( () ) )
            // InternalQL.g:4757:1: ( () )
            {
            // InternalQL.g:4757:1: ( () )
            // InternalQL.g:4758:2: ()
            {
             before(grammarAccess.getDecimalValueTypeAccess().getDecimalValueTypeAction_0()); 
            // InternalQL.g:4759:2: ()
            // InternalQL.g:4759:3: 
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
    // InternalQL.g:4767:1: rule__DecimalValueType__Group__1 : rule__DecimalValueType__Group__1__Impl rule__DecimalValueType__Group__2 ;
    public final void rule__DecimalValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4771:1: ( rule__DecimalValueType__Group__1__Impl rule__DecimalValueType__Group__2 )
            // InternalQL.g:4772:2: rule__DecimalValueType__Group__1__Impl rule__DecimalValueType__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalQL.g:4779:1: rule__DecimalValueType__Group__1__Impl : ( 'DecimalValueType' ) ;
    public final void rule__DecimalValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4783:1: ( ( 'DecimalValueType' ) )
            // InternalQL.g:4784:1: ( 'DecimalValueType' )
            {
            // InternalQL.g:4784:1: ( 'DecimalValueType' )
            // InternalQL.g:4785:2: 'DecimalValueType'
            {
             before(grammarAccess.getDecimalValueTypeAccess().getDecimalValueTypeKeyword_1()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getDecimalValueTypeAccess().getDecimalValueTypeKeyword_1()); 

            }


            }

        }
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
    // InternalQL.g:4794:1: rule__DecimalValueType__Group__2 : rule__DecimalValueType__Group__2__Impl rule__DecimalValueType__Group__3 ;
    public final void rule__DecimalValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4798:1: ( rule__DecimalValueType__Group__2__Impl rule__DecimalValueType__Group__3 )
            // InternalQL.g:4799:2: rule__DecimalValueType__Group__2__Impl rule__DecimalValueType__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalQL.g:4806:1: rule__DecimalValueType__Group__2__Impl : ( ( rule__DecimalValueType__NameAssignment_2 ) ) ;
    public final void rule__DecimalValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4810:1: ( ( ( rule__DecimalValueType__NameAssignment_2 ) ) )
            // InternalQL.g:4811:1: ( ( rule__DecimalValueType__NameAssignment_2 ) )
            {
            // InternalQL.g:4811:1: ( ( rule__DecimalValueType__NameAssignment_2 ) )
            // InternalQL.g:4812:2: ( rule__DecimalValueType__NameAssignment_2 )
            {
             before(grammarAccess.getDecimalValueTypeAccess().getNameAssignment_2()); 
            // InternalQL.g:4813:2: ( rule__DecimalValueType__NameAssignment_2 )
            // InternalQL.g:4813:3: rule__DecimalValueType__NameAssignment_2
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
    // InternalQL.g:4821:1: rule__DecimalValueType__Group__3 : rule__DecimalValueType__Group__3__Impl rule__DecimalValueType__Group__4 ;
    public final void rule__DecimalValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4825:1: ( rule__DecimalValueType__Group__3__Impl rule__DecimalValueType__Group__4 )
            // InternalQL.g:4826:2: rule__DecimalValueType__Group__3__Impl rule__DecimalValueType__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__DecimalValueType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecimalValueType__Group__4();

            state._fsp--;


            }

        }
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
    // InternalQL.g:4833:1: rule__DecimalValueType__Group__3__Impl : ( '{' ) ;
    public final void rule__DecimalValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4837:1: ( ( '{' ) )
            // InternalQL.g:4838:1: ( '{' )
            {
            // InternalQL.g:4838:1: ( '{' )
            // InternalQL.g:4839:2: '{'
            {
             before(grammarAccess.getDecimalValueTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDecimalValueTypeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__DecimalValueType__Group__4"
    // InternalQL.g:4848:1: rule__DecimalValueType__Group__4 : rule__DecimalValueType__Group__4__Impl rule__DecimalValueType__Group__5 ;
    public final void rule__DecimalValueType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4852:1: ( rule__DecimalValueType__Group__4__Impl rule__DecimalValueType__Group__5 )
            // InternalQL.g:4853:2: rule__DecimalValueType__Group__4__Impl rule__DecimalValueType__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__DecimalValueType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecimalValueType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group__4"


    // $ANTLR start "rule__DecimalValueType__Group__4__Impl"
    // InternalQL.g:4860:1: rule__DecimalValueType__Group__4__Impl : ( ( rule__DecimalValueType__Group_4__0 )? ) ;
    public final void rule__DecimalValueType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4864:1: ( ( ( rule__DecimalValueType__Group_4__0 )? ) )
            // InternalQL.g:4865:1: ( ( rule__DecimalValueType__Group_4__0 )? )
            {
            // InternalQL.g:4865:1: ( ( rule__DecimalValueType__Group_4__0 )? )
            // InternalQL.g:4866:2: ( rule__DecimalValueType__Group_4__0 )?
            {
             before(grammarAccess.getDecimalValueTypeAccess().getGroup_4()); 
            // InternalQL.g:4867:2: ( rule__DecimalValueType__Group_4__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==45) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalQL.g:4867:3: rule__DecimalValueType__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DecimalValueType__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDecimalValueTypeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group__4__Impl"


    // $ANTLR start "rule__DecimalValueType__Group__5"
    // InternalQL.g:4875:1: rule__DecimalValueType__Group__5 : rule__DecimalValueType__Group__5__Impl ;
    public final void rule__DecimalValueType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4879:1: ( rule__DecimalValueType__Group__5__Impl )
            // InternalQL.g:4880:2: rule__DecimalValueType__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DecimalValueType__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group__5"


    // $ANTLR start "rule__DecimalValueType__Group__5__Impl"
    // InternalQL.g:4886:1: rule__DecimalValueType__Group__5__Impl : ( '}' ) ;
    public final void rule__DecimalValueType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4890:1: ( ( '}' ) )
            // InternalQL.g:4891:1: ( '}' )
            {
            // InternalQL.g:4891:1: ( '}' )
            // InternalQL.g:4892:2: '}'
            {
             before(grammarAccess.getDecimalValueTypeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDecimalValueTypeAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group__5__Impl"


    // $ANTLR start "rule__DecimalValueType__Group_4__0"
    // InternalQL.g:4902:1: rule__DecimalValueType__Group_4__0 : rule__DecimalValueType__Group_4__0__Impl rule__DecimalValueType__Group_4__1 ;
    public final void rule__DecimalValueType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4906:1: ( rule__DecimalValueType__Group_4__0__Impl rule__DecimalValueType__Group_4__1 )
            // InternalQL.g:4907:2: rule__DecimalValueType__Group_4__0__Impl rule__DecimalValueType__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__DecimalValueType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecimalValueType__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group_4__0"


    // $ANTLR start "rule__DecimalValueType__Group_4__0__Impl"
    // InternalQL.g:4914:1: rule__DecimalValueType__Group_4__0__Impl : ( 'unit' ) ;
    public final void rule__DecimalValueType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4918:1: ( ( 'unit' ) )
            // InternalQL.g:4919:1: ( 'unit' )
            {
            // InternalQL.g:4919:1: ( 'unit' )
            // InternalQL.g:4920:2: 'unit'
            {
             before(grammarAccess.getDecimalValueTypeAccess().getUnitKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getDecimalValueTypeAccess().getUnitKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group_4__0__Impl"


    // $ANTLR start "rule__DecimalValueType__Group_4__1"
    // InternalQL.g:4929:1: rule__DecimalValueType__Group_4__1 : rule__DecimalValueType__Group_4__1__Impl ;
    public final void rule__DecimalValueType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4933:1: ( rule__DecimalValueType__Group_4__1__Impl )
            // InternalQL.g:4934:2: rule__DecimalValueType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DecimalValueType__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group_4__1"


    // $ANTLR start "rule__DecimalValueType__Group_4__1__Impl"
    // InternalQL.g:4940:1: rule__DecimalValueType__Group_4__1__Impl : ( ( rule__DecimalValueType__UnitAssignment_4_1 ) ) ;
    public final void rule__DecimalValueType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4944:1: ( ( ( rule__DecimalValueType__UnitAssignment_4_1 ) ) )
            // InternalQL.g:4945:1: ( ( rule__DecimalValueType__UnitAssignment_4_1 ) )
            {
            // InternalQL.g:4945:1: ( ( rule__DecimalValueType__UnitAssignment_4_1 ) )
            // InternalQL.g:4946:2: ( rule__DecimalValueType__UnitAssignment_4_1 )
            {
             before(grammarAccess.getDecimalValueTypeAccess().getUnitAssignment_4_1()); 
            // InternalQL.g:4947:2: ( rule__DecimalValueType__UnitAssignment_4_1 )
            // InternalQL.g:4947:3: rule__DecimalValueType__UnitAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__DecimalValueType__UnitAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDecimalValueTypeAccess().getUnitAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group_4__1__Impl"


    // $ANTLR start "rule__DateValueType__Group__0"
    // InternalQL.g:4956:1: rule__DateValueType__Group__0 : rule__DateValueType__Group__0__Impl rule__DateValueType__Group__1 ;
    public final void rule__DateValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4960:1: ( rule__DateValueType__Group__0__Impl rule__DateValueType__Group__1 )
            // InternalQL.g:4961:2: rule__DateValueType__Group__0__Impl rule__DateValueType__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalQL.g:4968:1: rule__DateValueType__Group__0__Impl : ( () ) ;
    public final void rule__DateValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4972:1: ( ( () ) )
            // InternalQL.g:4973:1: ( () )
            {
            // InternalQL.g:4973:1: ( () )
            // InternalQL.g:4974:2: ()
            {
             before(grammarAccess.getDateValueTypeAccess().getDateValueTypeAction_0()); 
            // InternalQL.g:4975:2: ()
            // InternalQL.g:4975:3: 
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
    // InternalQL.g:4983:1: rule__DateValueType__Group__1 : rule__DateValueType__Group__1__Impl rule__DateValueType__Group__2 ;
    public final void rule__DateValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4987:1: ( rule__DateValueType__Group__1__Impl rule__DateValueType__Group__2 )
            // InternalQL.g:4988:2: rule__DateValueType__Group__1__Impl rule__DateValueType__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalQL.g:4995:1: rule__DateValueType__Group__1__Impl : ( 'DateValueType' ) ;
    public final void rule__DateValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4999:1: ( ( 'DateValueType' ) )
            // InternalQL.g:5000:1: ( 'DateValueType' )
            {
            // InternalQL.g:5000:1: ( 'DateValueType' )
            // InternalQL.g:5001:2: 'DateValueType'
            {
             before(grammarAccess.getDateValueTypeAccess().getDateValueTypeKeyword_1()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getDateValueTypeAccess().getDateValueTypeKeyword_1()); 

            }


            }

        }
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
    // InternalQL.g:5010:1: rule__DateValueType__Group__2 : rule__DateValueType__Group__2__Impl rule__DateValueType__Group__3 ;
    public final void rule__DateValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5014:1: ( rule__DateValueType__Group__2__Impl rule__DateValueType__Group__3 )
            // InternalQL.g:5015:2: rule__DateValueType__Group__2__Impl rule__DateValueType__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalQL.g:5022:1: rule__DateValueType__Group__2__Impl : ( ( rule__DateValueType__NameAssignment_2 ) ) ;
    public final void rule__DateValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5026:1: ( ( ( rule__DateValueType__NameAssignment_2 ) ) )
            // InternalQL.g:5027:1: ( ( rule__DateValueType__NameAssignment_2 ) )
            {
            // InternalQL.g:5027:1: ( ( rule__DateValueType__NameAssignment_2 ) )
            // InternalQL.g:5028:2: ( rule__DateValueType__NameAssignment_2 )
            {
             before(grammarAccess.getDateValueTypeAccess().getNameAssignment_2()); 
            // InternalQL.g:5029:2: ( rule__DateValueType__NameAssignment_2 )
            // InternalQL.g:5029:3: rule__DateValueType__NameAssignment_2
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
    // InternalQL.g:5037:1: rule__DateValueType__Group__3 : rule__DateValueType__Group__3__Impl rule__DateValueType__Group__4 ;
    public final void rule__DateValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5041:1: ( rule__DateValueType__Group__3__Impl rule__DateValueType__Group__4 )
            // InternalQL.g:5042:2: rule__DateValueType__Group__3__Impl rule__DateValueType__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__DateValueType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateValueType__Group__4();

            state._fsp--;


            }

        }
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
    // InternalQL.g:5049:1: rule__DateValueType__Group__3__Impl : ( '{' ) ;
    public final void rule__DateValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5053:1: ( ( '{' ) )
            // InternalQL.g:5054:1: ( '{' )
            {
            // InternalQL.g:5054:1: ( '{' )
            // InternalQL.g:5055:2: '{'
            {
             before(grammarAccess.getDateValueTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDateValueTypeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__DateValueType__Group__4"
    // InternalQL.g:5064:1: rule__DateValueType__Group__4 : rule__DateValueType__Group__4__Impl rule__DateValueType__Group__5 ;
    public final void rule__DateValueType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5068:1: ( rule__DateValueType__Group__4__Impl rule__DateValueType__Group__5 )
            // InternalQL.g:5069:2: rule__DateValueType__Group__4__Impl rule__DateValueType__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__DateValueType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateValueType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group__4"


    // $ANTLR start "rule__DateValueType__Group__4__Impl"
    // InternalQL.g:5076:1: rule__DateValueType__Group__4__Impl : ( ( rule__DateValueType__Group_4__0 )? ) ;
    public final void rule__DateValueType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5080:1: ( ( ( rule__DateValueType__Group_4__0 )? ) )
            // InternalQL.g:5081:1: ( ( rule__DateValueType__Group_4__0 )? )
            {
            // InternalQL.g:5081:1: ( ( rule__DateValueType__Group_4__0 )? )
            // InternalQL.g:5082:2: ( rule__DateValueType__Group_4__0 )?
            {
             before(grammarAccess.getDateValueTypeAccess().getGroup_4()); 
            // InternalQL.g:5083:2: ( rule__DateValueType__Group_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==45) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalQL.g:5083:3: rule__DateValueType__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DateValueType__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDateValueTypeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group__4__Impl"


    // $ANTLR start "rule__DateValueType__Group__5"
    // InternalQL.g:5091:1: rule__DateValueType__Group__5 : rule__DateValueType__Group__5__Impl ;
    public final void rule__DateValueType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5095:1: ( rule__DateValueType__Group__5__Impl )
            // InternalQL.g:5096:2: rule__DateValueType__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DateValueType__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group__5"


    // $ANTLR start "rule__DateValueType__Group__5__Impl"
    // InternalQL.g:5102:1: rule__DateValueType__Group__5__Impl : ( '}' ) ;
    public final void rule__DateValueType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5106:1: ( ( '}' ) )
            // InternalQL.g:5107:1: ( '}' )
            {
            // InternalQL.g:5107:1: ( '}' )
            // InternalQL.g:5108:2: '}'
            {
             before(grammarAccess.getDateValueTypeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDateValueTypeAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group__5__Impl"


    // $ANTLR start "rule__DateValueType__Group_4__0"
    // InternalQL.g:5118:1: rule__DateValueType__Group_4__0 : rule__DateValueType__Group_4__0__Impl rule__DateValueType__Group_4__1 ;
    public final void rule__DateValueType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5122:1: ( rule__DateValueType__Group_4__0__Impl rule__DateValueType__Group_4__1 )
            // InternalQL.g:5123:2: rule__DateValueType__Group_4__0__Impl rule__DateValueType__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__DateValueType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateValueType__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group_4__0"


    // $ANTLR start "rule__DateValueType__Group_4__0__Impl"
    // InternalQL.g:5130:1: rule__DateValueType__Group_4__0__Impl : ( 'unit' ) ;
    public final void rule__DateValueType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5134:1: ( ( 'unit' ) )
            // InternalQL.g:5135:1: ( 'unit' )
            {
            // InternalQL.g:5135:1: ( 'unit' )
            // InternalQL.g:5136:2: 'unit'
            {
             before(grammarAccess.getDateValueTypeAccess().getUnitKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getDateValueTypeAccess().getUnitKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group_4__0__Impl"


    // $ANTLR start "rule__DateValueType__Group_4__1"
    // InternalQL.g:5145:1: rule__DateValueType__Group_4__1 : rule__DateValueType__Group_4__1__Impl ;
    public final void rule__DateValueType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5149:1: ( rule__DateValueType__Group_4__1__Impl )
            // InternalQL.g:5150:2: rule__DateValueType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DateValueType__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group_4__1"


    // $ANTLR start "rule__DateValueType__Group_4__1__Impl"
    // InternalQL.g:5156:1: rule__DateValueType__Group_4__1__Impl : ( ( rule__DateValueType__UnitAssignment_4_1 ) ) ;
    public final void rule__DateValueType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5160:1: ( ( ( rule__DateValueType__UnitAssignment_4_1 ) ) )
            // InternalQL.g:5161:1: ( ( rule__DateValueType__UnitAssignment_4_1 ) )
            {
            // InternalQL.g:5161:1: ( ( rule__DateValueType__UnitAssignment_4_1 ) )
            // InternalQL.g:5162:2: ( rule__DateValueType__UnitAssignment_4_1 )
            {
             before(grammarAccess.getDateValueTypeAccess().getUnitAssignment_4_1()); 
            // InternalQL.g:5163:2: ( rule__DateValueType__UnitAssignment_4_1 )
            // InternalQL.g:5163:3: rule__DateValueType__UnitAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__DateValueType__UnitAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDateValueTypeAccess().getUnitAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group_4__1__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group__0"
    // InternalQL.g:5172:1: rule__EnumerationValueType__Group__0 : rule__EnumerationValueType__Group__0__Impl rule__EnumerationValueType__Group__1 ;
    public final void rule__EnumerationValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5176:1: ( rule__EnumerationValueType__Group__0__Impl rule__EnumerationValueType__Group__1 )
            // InternalQL.g:5177:2: rule__EnumerationValueType__Group__0__Impl rule__EnumerationValueType__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalQL.g:5184:1: rule__EnumerationValueType__Group__0__Impl : ( () ) ;
    public final void rule__EnumerationValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5188:1: ( ( () ) )
            // InternalQL.g:5189:1: ( () )
            {
            // InternalQL.g:5189:1: ( () )
            // InternalQL.g:5190:2: ()
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getEnumerationValueTypeAction_0()); 
            // InternalQL.g:5191:2: ()
            // InternalQL.g:5191:3: 
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
    // InternalQL.g:5199:1: rule__EnumerationValueType__Group__1 : rule__EnumerationValueType__Group__1__Impl rule__EnumerationValueType__Group__2 ;
    public final void rule__EnumerationValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5203:1: ( rule__EnumerationValueType__Group__1__Impl rule__EnumerationValueType__Group__2 )
            // InternalQL.g:5204:2: rule__EnumerationValueType__Group__1__Impl rule__EnumerationValueType__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalQL.g:5211:1: rule__EnumerationValueType__Group__1__Impl : ( 'EnumerationValueType' ) ;
    public final void rule__EnumerationValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5215:1: ( ( 'EnumerationValueType' ) )
            // InternalQL.g:5216:1: ( 'EnumerationValueType' )
            {
            // InternalQL.g:5216:1: ( 'EnumerationValueType' )
            // InternalQL.g:5217:2: 'EnumerationValueType'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getEnumerationValueTypeKeyword_1()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getEnumerationValueTypeAccess().getEnumerationValueTypeKeyword_1()); 

            }


            }

        }
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
    // InternalQL.g:5226:1: rule__EnumerationValueType__Group__2 : rule__EnumerationValueType__Group__2__Impl rule__EnumerationValueType__Group__3 ;
    public final void rule__EnumerationValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5230:1: ( rule__EnumerationValueType__Group__2__Impl rule__EnumerationValueType__Group__3 )
            // InternalQL.g:5231:2: rule__EnumerationValueType__Group__2__Impl rule__EnumerationValueType__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalQL.g:5238:1: rule__EnumerationValueType__Group__2__Impl : ( ( rule__EnumerationValueType__NameAssignment_2 ) ) ;
    public final void rule__EnumerationValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5242:1: ( ( ( rule__EnumerationValueType__NameAssignment_2 ) ) )
            // InternalQL.g:5243:1: ( ( rule__EnumerationValueType__NameAssignment_2 ) )
            {
            // InternalQL.g:5243:1: ( ( rule__EnumerationValueType__NameAssignment_2 ) )
            // InternalQL.g:5244:2: ( rule__EnumerationValueType__NameAssignment_2 )
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getNameAssignment_2()); 
            // InternalQL.g:5245:2: ( rule__EnumerationValueType__NameAssignment_2 )
            // InternalQL.g:5245:3: rule__EnumerationValueType__NameAssignment_2
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
    // InternalQL.g:5253:1: rule__EnumerationValueType__Group__3 : rule__EnumerationValueType__Group__3__Impl rule__EnumerationValueType__Group__4 ;
    public final void rule__EnumerationValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5257:1: ( rule__EnumerationValueType__Group__3__Impl rule__EnumerationValueType__Group__4 )
            // InternalQL.g:5258:2: rule__EnumerationValueType__Group__3__Impl rule__EnumerationValueType__Group__4
            {
            pushFollow(FOLLOW_40);
            rule__EnumerationValueType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group__4();

            state._fsp--;


            }

        }
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
    // InternalQL.g:5265:1: rule__EnumerationValueType__Group__3__Impl : ( '{' ) ;
    public final void rule__EnumerationValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5269:1: ( ( '{' ) )
            // InternalQL.g:5270:1: ( '{' )
            {
            // InternalQL.g:5270:1: ( '{' )
            // InternalQL.g:5271:2: '{'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEnumerationValueTypeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__EnumerationValueType__Group__4"
    // InternalQL.g:5280:1: rule__EnumerationValueType__Group__4 : rule__EnumerationValueType__Group__4__Impl rule__EnumerationValueType__Group__5 ;
    public final void rule__EnumerationValueType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5284:1: ( rule__EnumerationValueType__Group__4__Impl rule__EnumerationValueType__Group__5 )
            // InternalQL.g:5285:2: rule__EnumerationValueType__Group__4__Impl rule__EnumerationValueType__Group__5
            {
            pushFollow(FOLLOW_40);
            rule__EnumerationValueType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group__4"


    // $ANTLR start "rule__EnumerationValueType__Group__4__Impl"
    // InternalQL.g:5292:1: rule__EnumerationValueType__Group__4__Impl : ( ( rule__EnumerationValueType__Group_4__0 )? ) ;
    public final void rule__EnumerationValueType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5296:1: ( ( ( rule__EnumerationValueType__Group_4__0 )? ) )
            // InternalQL.g:5297:1: ( ( rule__EnumerationValueType__Group_4__0 )? )
            {
            // InternalQL.g:5297:1: ( ( rule__EnumerationValueType__Group_4__0 )? )
            // InternalQL.g:5298:2: ( rule__EnumerationValueType__Group_4__0 )?
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getGroup_4()); 
            // InternalQL.g:5299:2: ( rule__EnumerationValueType__Group_4__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==45) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalQL.g:5299:3: rule__EnumerationValueType__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumerationValueType__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumerationValueTypeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group__4__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group__5"
    // InternalQL.g:5307:1: rule__EnumerationValueType__Group__5 : rule__EnumerationValueType__Group__5__Impl rule__EnumerationValueType__Group__6 ;
    public final void rule__EnumerationValueType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5311:1: ( rule__EnumerationValueType__Group__5__Impl rule__EnumerationValueType__Group__6 )
            // InternalQL.g:5312:2: rule__EnumerationValueType__Group__5__Impl rule__EnumerationValueType__Group__6
            {
            pushFollow(FOLLOW_40);
            rule__EnumerationValueType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group__5"


    // $ANTLR start "rule__EnumerationValueType__Group__5__Impl"
    // InternalQL.g:5319:1: rule__EnumerationValueType__Group__5__Impl : ( ( rule__EnumerationValueType__Group_5__0 )? ) ;
    public final void rule__EnumerationValueType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5323:1: ( ( ( rule__EnumerationValueType__Group_5__0 )? ) )
            // InternalQL.g:5324:1: ( ( rule__EnumerationValueType__Group_5__0 )? )
            {
            // InternalQL.g:5324:1: ( ( rule__EnumerationValueType__Group_5__0 )? )
            // InternalQL.g:5325:2: ( rule__EnumerationValueType__Group_5__0 )?
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getGroup_5()); 
            // InternalQL.g:5326:2: ( rule__EnumerationValueType__Group_5__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==64) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalQL.g:5326:3: rule__EnumerationValueType__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumerationValueType__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumerationValueTypeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group__5__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group__6"
    // InternalQL.g:5334:1: rule__EnumerationValueType__Group__6 : rule__EnumerationValueType__Group__6__Impl ;
    public final void rule__EnumerationValueType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5338:1: ( rule__EnumerationValueType__Group__6__Impl )
            // InternalQL.g:5339:2: rule__EnumerationValueType__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group__6"


    // $ANTLR start "rule__EnumerationValueType__Group__6__Impl"
    // InternalQL.g:5345:1: rule__EnumerationValueType__Group__6__Impl : ( '}' ) ;
    public final void rule__EnumerationValueType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5349:1: ( ( '}' ) )
            // InternalQL.g:5350:1: ( '}' )
            {
            // InternalQL.g:5350:1: ( '}' )
            // InternalQL.g:5351:2: '}'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEnumerationValueTypeAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group__6__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_4__0"
    // InternalQL.g:5361:1: rule__EnumerationValueType__Group_4__0 : rule__EnumerationValueType__Group_4__0__Impl rule__EnumerationValueType__Group_4__1 ;
    public final void rule__EnumerationValueType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5365:1: ( rule__EnumerationValueType__Group_4__0__Impl rule__EnumerationValueType__Group_4__1 )
            // InternalQL.g:5366:2: rule__EnumerationValueType__Group_4__0__Impl rule__EnumerationValueType__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__EnumerationValueType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_4__0"


    // $ANTLR start "rule__EnumerationValueType__Group_4__0__Impl"
    // InternalQL.g:5373:1: rule__EnumerationValueType__Group_4__0__Impl : ( 'unit' ) ;
    public final void rule__EnumerationValueType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5377:1: ( ( 'unit' ) )
            // InternalQL.g:5378:1: ( 'unit' )
            {
            // InternalQL.g:5378:1: ( 'unit' )
            // InternalQL.g:5379:2: 'unit'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getUnitKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getEnumerationValueTypeAccess().getUnitKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_4__0__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_4__1"
    // InternalQL.g:5388:1: rule__EnumerationValueType__Group_4__1 : rule__EnumerationValueType__Group_4__1__Impl ;
    public final void rule__EnumerationValueType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5392:1: ( rule__EnumerationValueType__Group_4__1__Impl )
            // InternalQL.g:5393:2: rule__EnumerationValueType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_4__1"


    // $ANTLR start "rule__EnumerationValueType__Group_4__1__Impl"
    // InternalQL.g:5399:1: rule__EnumerationValueType__Group_4__1__Impl : ( ( rule__EnumerationValueType__UnitAssignment_4_1 ) ) ;
    public final void rule__EnumerationValueType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5403:1: ( ( ( rule__EnumerationValueType__UnitAssignment_4_1 ) ) )
            // InternalQL.g:5404:1: ( ( rule__EnumerationValueType__UnitAssignment_4_1 ) )
            {
            // InternalQL.g:5404:1: ( ( rule__EnumerationValueType__UnitAssignment_4_1 ) )
            // InternalQL.g:5405:2: ( rule__EnumerationValueType__UnitAssignment_4_1 )
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getUnitAssignment_4_1()); 
            // InternalQL.g:5406:2: ( rule__EnumerationValueType__UnitAssignment_4_1 )
            // InternalQL.g:5406:3: rule__EnumerationValueType__UnitAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__UnitAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationValueTypeAccess().getUnitAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_4__1__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_5__0"
    // InternalQL.g:5415:1: rule__EnumerationValueType__Group_5__0 : rule__EnumerationValueType__Group_5__0__Impl rule__EnumerationValueType__Group_5__1 ;
    public final void rule__EnumerationValueType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5419:1: ( rule__EnumerationValueType__Group_5__0__Impl rule__EnumerationValueType__Group_5__1 )
            // InternalQL.g:5420:2: rule__EnumerationValueType__Group_5__0__Impl rule__EnumerationValueType__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__EnumerationValueType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_5__0"


    // $ANTLR start "rule__EnumerationValueType__Group_5__0__Impl"
    // InternalQL.g:5427:1: rule__EnumerationValueType__Group_5__0__Impl : ( 'enumerationLiterals' ) ;
    public final void rule__EnumerationValueType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5431:1: ( ( 'enumerationLiterals' ) )
            // InternalQL.g:5432:1: ( 'enumerationLiterals' )
            {
            // InternalQL.g:5432:1: ( 'enumerationLiterals' )
            // InternalQL.g:5433:2: 'enumerationLiterals'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsKeyword_5_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_5__0__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_5__1"
    // InternalQL.g:5442:1: rule__EnumerationValueType__Group_5__1 : rule__EnumerationValueType__Group_5__1__Impl rule__EnumerationValueType__Group_5__2 ;
    public final void rule__EnumerationValueType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5446:1: ( rule__EnumerationValueType__Group_5__1__Impl rule__EnumerationValueType__Group_5__2 )
            // InternalQL.g:5447:2: rule__EnumerationValueType__Group_5__1__Impl rule__EnumerationValueType__Group_5__2
            {
            pushFollow(FOLLOW_41);
            rule__EnumerationValueType__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_5__1"


    // $ANTLR start "rule__EnumerationValueType__Group_5__1__Impl"
    // InternalQL.g:5454:1: rule__EnumerationValueType__Group_5__1__Impl : ( '{' ) ;
    public final void rule__EnumerationValueType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5458:1: ( ( '{' ) )
            // InternalQL.g:5459:1: ( '{' )
            {
            // InternalQL.g:5459:1: ( '{' )
            // InternalQL.g:5460:2: '{'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEnumerationValueTypeAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_5__1__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_5__2"
    // InternalQL.g:5469:1: rule__EnumerationValueType__Group_5__2 : rule__EnumerationValueType__Group_5__2__Impl rule__EnumerationValueType__Group_5__3 ;
    public final void rule__EnumerationValueType__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5473:1: ( rule__EnumerationValueType__Group_5__2__Impl rule__EnumerationValueType__Group_5__3 )
            // InternalQL.g:5474:2: rule__EnumerationValueType__Group_5__2__Impl rule__EnumerationValueType__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__EnumerationValueType__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_5__2"


    // $ANTLR start "rule__EnumerationValueType__Group_5__2__Impl"
    // InternalQL.g:5481:1: rule__EnumerationValueType__Group_5__2__Impl : ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_5_2 ) ) ;
    public final void rule__EnumerationValueType__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5485:1: ( ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_5_2 ) ) )
            // InternalQL.g:5486:1: ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_5_2 ) )
            {
            // InternalQL.g:5486:1: ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_5_2 ) )
            // InternalQL.g:5487:2: ( rule__EnumerationValueType__EnumerationLiteralsAssignment_5_2 )
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsAssignment_5_2()); 
            // InternalQL.g:5488:2: ( rule__EnumerationValueType__EnumerationLiteralsAssignment_5_2 )
            // InternalQL.g:5488:3: rule__EnumerationValueType__EnumerationLiteralsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__EnumerationLiteralsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_5__2__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_5__3"
    // InternalQL.g:5496:1: rule__EnumerationValueType__Group_5__3 : rule__EnumerationValueType__Group_5__3__Impl rule__EnumerationValueType__Group_5__4 ;
    public final void rule__EnumerationValueType__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5500:1: ( rule__EnumerationValueType__Group_5__3__Impl rule__EnumerationValueType__Group_5__4 )
            // InternalQL.g:5501:2: rule__EnumerationValueType__Group_5__3__Impl rule__EnumerationValueType__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__EnumerationValueType__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_5__3"


    // $ANTLR start "rule__EnumerationValueType__Group_5__3__Impl"
    // InternalQL.g:5508:1: rule__EnumerationValueType__Group_5__3__Impl : ( ( rule__EnumerationValueType__Group_5_3__0 )* ) ;
    public final void rule__EnumerationValueType__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5512:1: ( ( ( rule__EnumerationValueType__Group_5_3__0 )* ) )
            // InternalQL.g:5513:1: ( ( rule__EnumerationValueType__Group_5_3__0 )* )
            {
            // InternalQL.g:5513:1: ( ( rule__EnumerationValueType__Group_5_3__0 )* )
            // InternalQL.g:5514:2: ( rule__EnumerationValueType__Group_5_3__0 )*
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getGroup_5_3()); 
            // InternalQL.g:5515:2: ( rule__EnumerationValueType__Group_5_3__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==33) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalQL.g:5515:3: rule__EnumerationValueType__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__EnumerationValueType__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getEnumerationValueTypeAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_5__3__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_5__4"
    // InternalQL.g:5523:1: rule__EnumerationValueType__Group_5__4 : rule__EnumerationValueType__Group_5__4__Impl ;
    public final void rule__EnumerationValueType__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5527:1: ( rule__EnumerationValueType__Group_5__4__Impl )
            // InternalQL.g:5528:2: rule__EnumerationValueType__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_5__4"


    // $ANTLR start "rule__EnumerationValueType__Group_5__4__Impl"
    // InternalQL.g:5534:1: rule__EnumerationValueType__Group_5__4__Impl : ( '}' ) ;
    public final void rule__EnumerationValueType__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5538:1: ( ( '}' ) )
            // InternalQL.g:5539:1: ( '}' )
            {
            // InternalQL.g:5539:1: ( '}' )
            // InternalQL.g:5540:2: '}'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEnumerationValueTypeAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_5__4__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_5_3__0"
    // InternalQL.g:5550:1: rule__EnumerationValueType__Group_5_3__0 : rule__EnumerationValueType__Group_5_3__0__Impl rule__EnumerationValueType__Group_5_3__1 ;
    public final void rule__EnumerationValueType__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5554:1: ( rule__EnumerationValueType__Group_5_3__0__Impl rule__EnumerationValueType__Group_5_3__1 )
            // InternalQL.g:5555:2: rule__EnumerationValueType__Group_5_3__0__Impl rule__EnumerationValueType__Group_5_3__1
            {
            pushFollow(FOLLOW_41);
            rule__EnumerationValueType__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_5_3__0"


    // $ANTLR start "rule__EnumerationValueType__Group_5_3__0__Impl"
    // InternalQL.g:5562:1: rule__EnumerationValueType__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__EnumerationValueType__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5566:1: ( ( ',' ) )
            // InternalQL.g:5567:1: ( ',' )
            {
            // InternalQL.g:5567:1: ( ',' )
            // InternalQL.g:5568:2: ','
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getCommaKeyword_5_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEnumerationValueTypeAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_5_3__0__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_5_3__1"
    // InternalQL.g:5577:1: rule__EnumerationValueType__Group_5_3__1 : rule__EnumerationValueType__Group_5_3__1__Impl ;
    public final void rule__EnumerationValueType__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5581:1: ( rule__EnumerationValueType__Group_5_3__1__Impl )
            // InternalQL.g:5582:2: rule__EnumerationValueType__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_5_3__1"


    // $ANTLR start "rule__EnumerationValueType__Group_5_3__1__Impl"
    // InternalQL.g:5588:1: rule__EnumerationValueType__Group_5_3__1__Impl : ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_5_3_1 ) ) ;
    public final void rule__EnumerationValueType__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5592:1: ( ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_5_3_1 ) ) )
            // InternalQL.g:5593:1: ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_5_3_1 ) )
            {
            // InternalQL.g:5593:1: ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_5_3_1 ) )
            // InternalQL.g:5594:2: ( rule__EnumerationValueType__EnumerationLiteralsAssignment_5_3_1 )
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsAssignment_5_3_1()); 
            // InternalQL.g:5595:2: ( rule__EnumerationValueType__EnumerationLiteralsAssignment_5_3_1 )
            // InternalQL.g:5595:3: rule__EnumerationValueType__EnumerationLiteralsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__EnumerationLiteralsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_5_3__1__Impl"


    // $ANTLR start "rule__StringValueType__Group__0"
    // InternalQL.g:5604:1: rule__StringValueType__Group__0 : rule__StringValueType__Group__0__Impl rule__StringValueType__Group__1 ;
    public final void rule__StringValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5608:1: ( rule__StringValueType__Group__0__Impl rule__StringValueType__Group__1 )
            // InternalQL.g:5609:2: rule__StringValueType__Group__0__Impl rule__StringValueType__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalQL.g:5616:1: rule__StringValueType__Group__0__Impl : ( () ) ;
    public final void rule__StringValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5620:1: ( ( () ) )
            // InternalQL.g:5621:1: ( () )
            {
            // InternalQL.g:5621:1: ( () )
            // InternalQL.g:5622:2: ()
            {
             before(grammarAccess.getStringValueTypeAccess().getStringValueTypeAction_0()); 
            // InternalQL.g:5623:2: ()
            // InternalQL.g:5623:3: 
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
    // InternalQL.g:5631:1: rule__StringValueType__Group__1 : rule__StringValueType__Group__1__Impl rule__StringValueType__Group__2 ;
    public final void rule__StringValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5635:1: ( rule__StringValueType__Group__1__Impl rule__StringValueType__Group__2 )
            // InternalQL.g:5636:2: rule__StringValueType__Group__1__Impl rule__StringValueType__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalQL.g:5643:1: rule__StringValueType__Group__1__Impl : ( 'StringValueType' ) ;
    public final void rule__StringValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5647:1: ( ( 'StringValueType' ) )
            // InternalQL.g:5648:1: ( 'StringValueType' )
            {
            // InternalQL.g:5648:1: ( 'StringValueType' )
            // InternalQL.g:5649:2: 'StringValueType'
            {
             before(grammarAccess.getStringValueTypeAccess().getStringValueTypeKeyword_1()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getStringValueTypeAccess().getStringValueTypeKeyword_1()); 

            }


            }

        }
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
    // InternalQL.g:5658:1: rule__StringValueType__Group__2 : rule__StringValueType__Group__2__Impl rule__StringValueType__Group__3 ;
    public final void rule__StringValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5662:1: ( rule__StringValueType__Group__2__Impl rule__StringValueType__Group__3 )
            // InternalQL.g:5663:2: rule__StringValueType__Group__2__Impl rule__StringValueType__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalQL.g:5670:1: rule__StringValueType__Group__2__Impl : ( ( rule__StringValueType__NameAssignment_2 ) ) ;
    public final void rule__StringValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5674:1: ( ( ( rule__StringValueType__NameAssignment_2 ) ) )
            // InternalQL.g:5675:1: ( ( rule__StringValueType__NameAssignment_2 ) )
            {
            // InternalQL.g:5675:1: ( ( rule__StringValueType__NameAssignment_2 ) )
            // InternalQL.g:5676:2: ( rule__StringValueType__NameAssignment_2 )
            {
             before(grammarAccess.getStringValueTypeAccess().getNameAssignment_2()); 
            // InternalQL.g:5677:2: ( rule__StringValueType__NameAssignment_2 )
            // InternalQL.g:5677:3: rule__StringValueType__NameAssignment_2
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
    // InternalQL.g:5685:1: rule__StringValueType__Group__3 : rule__StringValueType__Group__3__Impl rule__StringValueType__Group__4 ;
    public final void rule__StringValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5689:1: ( rule__StringValueType__Group__3__Impl rule__StringValueType__Group__4 )
            // InternalQL.g:5690:2: rule__StringValueType__Group__3__Impl rule__StringValueType__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__StringValueType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringValueType__Group__4();

            state._fsp--;


            }

        }
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
    // InternalQL.g:5697:1: rule__StringValueType__Group__3__Impl : ( '{' ) ;
    public final void rule__StringValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5701:1: ( ( '{' ) )
            // InternalQL.g:5702:1: ( '{' )
            {
            // InternalQL.g:5702:1: ( '{' )
            // InternalQL.g:5703:2: '{'
            {
             before(grammarAccess.getStringValueTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStringValueTypeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__StringValueType__Group__4"
    // InternalQL.g:5712:1: rule__StringValueType__Group__4 : rule__StringValueType__Group__4__Impl rule__StringValueType__Group__5 ;
    public final void rule__StringValueType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5716:1: ( rule__StringValueType__Group__4__Impl rule__StringValueType__Group__5 )
            // InternalQL.g:5717:2: rule__StringValueType__Group__4__Impl rule__StringValueType__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__StringValueType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringValueType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group__4"


    // $ANTLR start "rule__StringValueType__Group__4__Impl"
    // InternalQL.g:5724:1: rule__StringValueType__Group__4__Impl : ( ( rule__StringValueType__Group_4__0 )? ) ;
    public final void rule__StringValueType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5728:1: ( ( ( rule__StringValueType__Group_4__0 )? ) )
            // InternalQL.g:5729:1: ( ( rule__StringValueType__Group_4__0 )? )
            {
            // InternalQL.g:5729:1: ( ( rule__StringValueType__Group_4__0 )? )
            // InternalQL.g:5730:2: ( rule__StringValueType__Group_4__0 )?
            {
             before(grammarAccess.getStringValueTypeAccess().getGroup_4()); 
            // InternalQL.g:5731:2: ( rule__StringValueType__Group_4__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==45) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalQL.g:5731:3: rule__StringValueType__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringValueType__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringValueTypeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group__4__Impl"


    // $ANTLR start "rule__StringValueType__Group__5"
    // InternalQL.g:5739:1: rule__StringValueType__Group__5 : rule__StringValueType__Group__5__Impl ;
    public final void rule__StringValueType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5743:1: ( rule__StringValueType__Group__5__Impl )
            // InternalQL.g:5744:2: rule__StringValueType__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringValueType__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group__5"


    // $ANTLR start "rule__StringValueType__Group__5__Impl"
    // InternalQL.g:5750:1: rule__StringValueType__Group__5__Impl : ( '}' ) ;
    public final void rule__StringValueType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5754:1: ( ( '}' ) )
            // InternalQL.g:5755:1: ( '}' )
            {
            // InternalQL.g:5755:1: ( '}' )
            // InternalQL.g:5756:2: '}'
            {
             before(grammarAccess.getStringValueTypeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getStringValueTypeAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group__5__Impl"


    // $ANTLR start "rule__StringValueType__Group_4__0"
    // InternalQL.g:5766:1: rule__StringValueType__Group_4__0 : rule__StringValueType__Group_4__0__Impl rule__StringValueType__Group_4__1 ;
    public final void rule__StringValueType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5770:1: ( rule__StringValueType__Group_4__0__Impl rule__StringValueType__Group_4__1 )
            // InternalQL.g:5771:2: rule__StringValueType__Group_4__0__Impl rule__StringValueType__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__StringValueType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringValueType__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group_4__0"


    // $ANTLR start "rule__StringValueType__Group_4__0__Impl"
    // InternalQL.g:5778:1: rule__StringValueType__Group_4__0__Impl : ( 'unit' ) ;
    public final void rule__StringValueType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5782:1: ( ( 'unit' ) )
            // InternalQL.g:5783:1: ( 'unit' )
            {
            // InternalQL.g:5783:1: ( 'unit' )
            // InternalQL.g:5784:2: 'unit'
            {
             before(grammarAccess.getStringValueTypeAccess().getUnitKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getStringValueTypeAccess().getUnitKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group_4__0__Impl"


    // $ANTLR start "rule__StringValueType__Group_4__1"
    // InternalQL.g:5793:1: rule__StringValueType__Group_4__1 : rule__StringValueType__Group_4__1__Impl ;
    public final void rule__StringValueType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5797:1: ( rule__StringValueType__Group_4__1__Impl )
            // InternalQL.g:5798:2: rule__StringValueType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringValueType__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group_4__1"


    // $ANTLR start "rule__StringValueType__Group_4__1__Impl"
    // InternalQL.g:5804:1: rule__StringValueType__Group_4__1__Impl : ( ( rule__StringValueType__UnitAssignment_4_1 ) ) ;
    public final void rule__StringValueType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5808:1: ( ( ( rule__StringValueType__UnitAssignment_4_1 ) ) )
            // InternalQL.g:5809:1: ( ( rule__StringValueType__UnitAssignment_4_1 ) )
            {
            // InternalQL.g:5809:1: ( ( rule__StringValueType__UnitAssignment_4_1 ) )
            // InternalQL.g:5810:2: ( rule__StringValueType__UnitAssignment_4_1 )
            {
             before(grammarAccess.getStringValueTypeAccess().getUnitAssignment_4_1()); 
            // InternalQL.g:5811:2: ( rule__StringValueType__UnitAssignment_4_1 )
            // InternalQL.g:5811:3: rule__StringValueType__UnitAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__StringValueType__UnitAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getStringValueTypeAccess().getUnitAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group_4__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalQL.g:5820:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5824:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalQL.g:5825:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalQL.g:5832:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5836:1: ( ( ( '-' )? ) )
            // InternalQL.g:5837:1: ( ( '-' )? )
            {
            // InternalQL.g:5837:1: ( ( '-' )? )
            // InternalQL.g:5838:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalQL.g:5839:2: ( '-' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==66) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalQL.g:5839:3: '-'
                    {
                    match(input,66,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalQL.g:5847:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5851:1: ( rule__EInt__Group__1__Impl )
            // InternalQL.g:5852:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalQL.g:5858:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5862:1: ( ( RULE_INT ) )
            // InternalQL.g:5863:1: ( RULE_INT )
            {
            // InternalQL.g:5863:1: ( RULE_INT )
            // InternalQL.g:5864:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__EnumerationLiteral__Group__0"
    // InternalQL.g:5874:1: rule__EnumerationLiteral__Group__0 : rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 ;
    public final void rule__EnumerationLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5878:1: ( rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 )
            // InternalQL.g:5879:2: rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalQL.g:5886:1: rule__EnumerationLiteral__Group__0__Impl : ( () ) ;
    public final void rule__EnumerationLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5890:1: ( ( () ) )
            // InternalQL.g:5891:1: ( () )
            {
            // InternalQL.g:5891:1: ( () )
            // InternalQL.g:5892:2: ()
            {
             before(grammarAccess.getEnumerationLiteralAccess().getEnumerationLiteralAction_0()); 
            // InternalQL.g:5893:2: ()
            // InternalQL.g:5893:3: 
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
    // InternalQL.g:5901:1: rule__EnumerationLiteral__Group__1 : rule__EnumerationLiteral__Group__1__Impl rule__EnumerationLiteral__Group__2 ;
    public final void rule__EnumerationLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5905:1: ( rule__EnumerationLiteral__Group__1__Impl rule__EnumerationLiteral__Group__2 )
            // InternalQL.g:5906:2: rule__EnumerationLiteral__Group__1__Impl rule__EnumerationLiteral__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__EnumerationLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationLiteral__Group__2();

            state._fsp--;


            }

        }
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
    // InternalQL.g:5913:1: rule__EnumerationLiteral__Group__1__Impl : ( 'EnumerationLiteral' ) ;
    public final void rule__EnumerationLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5917:1: ( ( 'EnumerationLiteral' ) )
            // InternalQL.g:5918:1: ( 'EnumerationLiteral' )
            {
            // InternalQL.g:5918:1: ( 'EnumerationLiteral' )
            // InternalQL.g:5919:2: 'EnumerationLiteral'
            {
             before(grammarAccess.getEnumerationLiteralAccess().getEnumerationLiteralKeyword_1()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getEnumerationLiteralAccess().getEnumerationLiteralKeyword_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__EnumerationLiteral__Group__2"
    // InternalQL.g:5928:1: rule__EnumerationLiteral__Group__2 : rule__EnumerationLiteral__Group__2__Impl ;
    public final void rule__EnumerationLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5932:1: ( rule__EnumerationLiteral__Group__2__Impl )
            // InternalQL.g:5933:2: rule__EnumerationLiteral__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationLiteral__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__2"


    // $ANTLR start "rule__EnumerationLiteral__Group__2__Impl"
    // InternalQL.g:5939:1: rule__EnumerationLiteral__Group__2__Impl : ( ( rule__EnumerationLiteral__NameAssignment_2 ) ) ;
    public final void rule__EnumerationLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5943:1: ( ( ( rule__EnumerationLiteral__NameAssignment_2 ) ) )
            // InternalQL.g:5944:1: ( ( rule__EnumerationLiteral__NameAssignment_2 ) )
            {
            // InternalQL.g:5944:1: ( ( rule__EnumerationLiteral__NameAssignment_2 ) )
            // InternalQL.g:5945:2: ( rule__EnumerationLiteral__NameAssignment_2 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_2()); 
            // InternalQL.g:5946:2: ( rule__EnumerationLiteral__NameAssignment_2 )
            // InternalQL.g:5946:3: rule__EnumerationLiteral__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationLiteral__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__2__Impl"


    // $ANTLR start "rule__IntegerValue__Group__0"
    // InternalQL.g:5955:1: rule__IntegerValue__Group__0 : rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1 ;
    public final void rule__IntegerValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5959:1: ( rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1 )
            // InternalQL.g:5960:2: rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalQL.g:5967:1: rule__IntegerValue__Group__0__Impl : ( () ) ;
    public final void rule__IntegerValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5971:1: ( ( () ) )
            // InternalQL.g:5972:1: ( () )
            {
            // InternalQL.g:5972:1: ( () )
            // InternalQL.g:5973:2: ()
            {
             before(grammarAccess.getIntegerValueAccess().getIntegerValueAction_0()); 
            // InternalQL.g:5974:2: ()
            // InternalQL.g:5974:3: 
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
    // InternalQL.g:5982:1: rule__IntegerValue__Group__1 : rule__IntegerValue__Group__1__Impl rule__IntegerValue__Group__2 ;
    public final void rule__IntegerValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5986:1: ( rule__IntegerValue__Group__1__Impl rule__IntegerValue__Group__2 )
            // InternalQL.g:5987:2: rule__IntegerValue__Group__1__Impl rule__IntegerValue__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__IntegerValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValue__Group__2();

            state._fsp--;


            }

        }
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
    // InternalQL.g:5994:1: rule__IntegerValue__Group__1__Impl : ( 'IntegerValue' ) ;
    public final void rule__IntegerValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5998:1: ( ( 'IntegerValue' ) )
            // InternalQL.g:5999:1: ( 'IntegerValue' )
            {
            // InternalQL.g:5999:1: ( 'IntegerValue' )
            // InternalQL.g:6000:2: 'IntegerValue'
            {
             before(grammarAccess.getIntegerValueAccess().getIntegerValueKeyword_1()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getIntegerValueAccess().getIntegerValueKeyword_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__IntegerValue__Group__2"
    // InternalQL.g:6009:1: rule__IntegerValue__Group__2 : rule__IntegerValue__Group__2__Impl rule__IntegerValue__Group__3 ;
    public final void rule__IntegerValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6013:1: ( rule__IntegerValue__Group__2__Impl rule__IntegerValue__Group__3 )
            // InternalQL.g:6014:2: rule__IntegerValue__Group__2__Impl rule__IntegerValue__Group__3
            {
            pushFollow(FOLLOW_44);
            rule__IntegerValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group__2"


    // $ANTLR start "rule__IntegerValue__Group__2__Impl"
    // InternalQL.g:6021:1: rule__IntegerValue__Group__2__Impl : ( '{' ) ;
    public final void rule__IntegerValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6025:1: ( ( '{' ) )
            // InternalQL.g:6026:1: ( '{' )
            {
            // InternalQL.g:6026:1: ( '{' )
            // InternalQL.g:6027:2: '{'
            {
             before(grammarAccess.getIntegerValueAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getIntegerValueAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group__2__Impl"


    // $ANTLR start "rule__IntegerValue__Group__3"
    // InternalQL.g:6036:1: rule__IntegerValue__Group__3 : rule__IntegerValue__Group__3__Impl rule__IntegerValue__Group__4 ;
    public final void rule__IntegerValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6040:1: ( rule__IntegerValue__Group__3__Impl rule__IntegerValue__Group__4 )
            // InternalQL.g:6041:2: rule__IntegerValue__Group__3__Impl rule__IntegerValue__Group__4
            {
            pushFollow(FOLLOW_44);
            rule__IntegerValue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValue__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group__3"


    // $ANTLR start "rule__IntegerValue__Group__3__Impl"
    // InternalQL.g:6048:1: rule__IntegerValue__Group__3__Impl : ( ( rule__IntegerValue__Group_3__0 )? ) ;
    public final void rule__IntegerValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6052:1: ( ( ( rule__IntegerValue__Group_3__0 )? ) )
            // InternalQL.g:6053:1: ( ( rule__IntegerValue__Group_3__0 )? )
            {
            // InternalQL.g:6053:1: ( ( rule__IntegerValue__Group_3__0 )? )
            // InternalQL.g:6054:2: ( rule__IntegerValue__Group_3__0 )?
            {
             before(grammarAccess.getIntegerValueAccess().getGroup_3()); 
            // InternalQL.g:6055:2: ( rule__IntegerValue__Group_3__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==69) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalQL.g:6055:3: rule__IntegerValue__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IntegerValue__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerValueAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group__3__Impl"


    // $ANTLR start "rule__IntegerValue__Group__4"
    // InternalQL.g:6063:1: rule__IntegerValue__Group__4 : rule__IntegerValue__Group__4__Impl ;
    public final void rule__IntegerValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6067:1: ( rule__IntegerValue__Group__4__Impl )
            // InternalQL.g:6068:2: rule__IntegerValue__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValue__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group__4"


    // $ANTLR start "rule__IntegerValue__Group__4__Impl"
    // InternalQL.g:6074:1: rule__IntegerValue__Group__4__Impl : ( '}' ) ;
    public final void rule__IntegerValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6078:1: ( ( '}' ) )
            // InternalQL.g:6079:1: ( '}' )
            {
            // InternalQL.g:6079:1: ( '}' )
            // InternalQL.g:6080:2: '}'
            {
             before(grammarAccess.getIntegerValueAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getIntegerValueAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group__4__Impl"


    // $ANTLR start "rule__IntegerValue__Group_3__0"
    // InternalQL.g:6090:1: rule__IntegerValue__Group_3__0 : rule__IntegerValue__Group_3__0__Impl rule__IntegerValue__Group_3__1 ;
    public final void rule__IntegerValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6094:1: ( rule__IntegerValue__Group_3__0__Impl rule__IntegerValue__Group_3__1 )
            // InternalQL.g:6095:2: rule__IntegerValue__Group_3__0__Impl rule__IntegerValue__Group_3__1
            {
            pushFollow(FOLLOW_36);
            rule__IntegerValue__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValue__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group_3__0"


    // $ANTLR start "rule__IntegerValue__Group_3__0__Impl"
    // InternalQL.g:6102:1: rule__IntegerValue__Group_3__0__Impl : ( 'intValue' ) ;
    public final void rule__IntegerValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6106:1: ( ( 'intValue' ) )
            // InternalQL.g:6107:1: ( 'intValue' )
            {
            // InternalQL.g:6107:1: ( 'intValue' )
            // InternalQL.g:6108:2: 'intValue'
            {
             before(grammarAccess.getIntegerValueAccess().getIntValueKeyword_3_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getIntegerValueAccess().getIntValueKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group_3__0__Impl"


    // $ANTLR start "rule__IntegerValue__Group_3__1"
    // InternalQL.g:6117:1: rule__IntegerValue__Group_3__1 : rule__IntegerValue__Group_3__1__Impl ;
    public final void rule__IntegerValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6121:1: ( rule__IntegerValue__Group_3__1__Impl )
            // InternalQL.g:6122:2: rule__IntegerValue__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValue__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group_3__1"


    // $ANTLR start "rule__IntegerValue__Group_3__1__Impl"
    // InternalQL.g:6128:1: rule__IntegerValue__Group_3__1__Impl : ( ( rule__IntegerValue__IntValueAssignment_3_1 ) ) ;
    public final void rule__IntegerValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6132:1: ( ( ( rule__IntegerValue__IntValueAssignment_3_1 ) ) )
            // InternalQL.g:6133:1: ( ( rule__IntegerValue__IntValueAssignment_3_1 ) )
            {
            // InternalQL.g:6133:1: ( ( rule__IntegerValue__IntValueAssignment_3_1 ) )
            // InternalQL.g:6134:2: ( rule__IntegerValue__IntValueAssignment_3_1 )
            {
             before(grammarAccess.getIntegerValueAccess().getIntValueAssignment_3_1()); 
            // InternalQL.g:6135:2: ( rule__IntegerValue__IntValueAssignment_3_1 )
            // InternalQL.g:6135:3: rule__IntegerValue__IntValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValue__IntValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getIntegerValueAccess().getIntValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group_3__1__Impl"


    // $ANTLR start "rule__StringValue__Group__0"
    // InternalQL.g:6144:1: rule__StringValue__Group__0 : rule__StringValue__Group__0__Impl rule__StringValue__Group__1 ;
    public final void rule__StringValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6148:1: ( rule__StringValue__Group__0__Impl rule__StringValue__Group__1 )
            // InternalQL.g:6149:2: rule__StringValue__Group__0__Impl rule__StringValue__Group__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalQL.g:6156:1: rule__StringValue__Group__0__Impl : ( () ) ;
    public final void rule__StringValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6160:1: ( ( () ) )
            // InternalQL.g:6161:1: ( () )
            {
            // InternalQL.g:6161:1: ( () )
            // InternalQL.g:6162:2: ()
            {
             before(grammarAccess.getStringValueAccess().getStringValueAction_0()); 
            // InternalQL.g:6163:2: ()
            // InternalQL.g:6163:3: 
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
    // InternalQL.g:6171:1: rule__StringValue__Group__1 : rule__StringValue__Group__1__Impl rule__StringValue__Group__2 ;
    public final void rule__StringValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6175:1: ( rule__StringValue__Group__1__Impl rule__StringValue__Group__2 )
            // InternalQL.g:6176:2: rule__StringValue__Group__1__Impl rule__StringValue__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__StringValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringValue__Group__2();

            state._fsp--;


            }

        }
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
    // InternalQL.g:6183:1: rule__StringValue__Group__1__Impl : ( 'StringValue' ) ;
    public final void rule__StringValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6187:1: ( ( 'StringValue' ) )
            // InternalQL.g:6188:1: ( 'StringValue' )
            {
            // InternalQL.g:6188:1: ( 'StringValue' )
            // InternalQL.g:6189:2: 'StringValue'
            {
             before(grammarAccess.getStringValueAccess().getStringValueKeyword_1()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getStringValueAccess().getStringValueKeyword_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__StringValue__Group__2"
    // InternalQL.g:6198:1: rule__StringValue__Group__2 : rule__StringValue__Group__2__Impl rule__StringValue__Group__3 ;
    public final void rule__StringValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6202:1: ( rule__StringValue__Group__2__Impl rule__StringValue__Group__3 )
            // InternalQL.g:6203:2: rule__StringValue__Group__2__Impl rule__StringValue__Group__3
            {
            pushFollow(FOLLOW_46);
            rule__StringValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group__2"


    // $ANTLR start "rule__StringValue__Group__2__Impl"
    // InternalQL.g:6210:1: rule__StringValue__Group__2__Impl : ( '{' ) ;
    public final void rule__StringValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6214:1: ( ( '{' ) )
            // InternalQL.g:6215:1: ( '{' )
            {
            // InternalQL.g:6215:1: ( '{' )
            // InternalQL.g:6216:2: '{'
            {
             before(grammarAccess.getStringValueAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStringValueAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group__2__Impl"


    // $ANTLR start "rule__StringValue__Group__3"
    // InternalQL.g:6225:1: rule__StringValue__Group__3 : rule__StringValue__Group__3__Impl rule__StringValue__Group__4 ;
    public final void rule__StringValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6229:1: ( rule__StringValue__Group__3__Impl rule__StringValue__Group__4 )
            // InternalQL.g:6230:2: rule__StringValue__Group__3__Impl rule__StringValue__Group__4
            {
            pushFollow(FOLLOW_46);
            rule__StringValue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringValue__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group__3"


    // $ANTLR start "rule__StringValue__Group__3__Impl"
    // InternalQL.g:6237:1: rule__StringValue__Group__3__Impl : ( ( rule__StringValue__Group_3__0 )? ) ;
    public final void rule__StringValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6241:1: ( ( ( rule__StringValue__Group_3__0 )? ) )
            // InternalQL.g:6242:1: ( ( rule__StringValue__Group_3__0 )? )
            {
            // InternalQL.g:6242:1: ( ( rule__StringValue__Group_3__0 )? )
            // InternalQL.g:6243:2: ( rule__StringValue__Group_3__0 )?
            {
             before(grammarAccess.getStringValueAccess().getGroup_3()); 
            // InternalQL.g:6244:2: ( rule__StringValue__Group_3__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==71) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalQL.g:6244:3: rule__StringValue__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringValue__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringValueAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group__3__Impl"


    // $ANTLR start "rule__StringValue__Group__4"
    // InternalQL.g:6252:1: rule__StringValue__Group__4 : rule__StringValue__Group__4__Impl ;
    public final void rule__StringValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6256:1: ( rule__StringValue__Group__4__Impl )
            // InternalQL.g:6257:2: rule__StringValue__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringValue__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group__4"


    // $ANTLR start "rule__StringValue__Group__4__Impl"
    // InternalQL.g:6263:1: rule__StringValue__Group__4__Impl : ( '}' ) ;
    public final void rule__StringValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6267:1: ( ( '}' ) )
            // InternalQL.g:6268:1: ( '}' )
            {
            // InternalQL.g:6268:1: ( '}' )
            // InternalQL.g:6269:2: '}'
            {
             before(grammarAccess.getStringValueAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getStringValueAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group__4__Impl"


    // $ANTLR start "rule__StringValue__Group_3__0"
    // InternalQL.g:6279:1: rule__StringValue__Group_3__0 : rule__StringValue__Group_3__0__Impl rule__StringValue__Group_3__1 ;
    public final void rule__StringValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6283:1: ( rule__StringValue__Group_3__0__Impl rule__StringValue__Group_3__1 )
            // InternalQL.g:6284:2: rule__StringValue__Group_3__0__Impl rule__StringValue__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__StringValue__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringValue__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group_3__0"


    // $ANTLR start "rule__StringValue__Group_3__0__Impl"
    // InternalQL.g:6291:1: rule__StringValue__Group_3__0__Impl : ( 'stringValue' ) ;
    public final void rule__StringValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6295:1: ( ( 'stringValue' ) )
            // InternalQL.g:6296:1: ( 'stringValue' )
            {
            // InternalQL.g:6296:1: ( 'stringValue' )
            // InternalQL.g:6297:2: 'stringValue'
            {
             before(grammarAccess.getStringValueAccess().getStringValueKeyword_3_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getStringValueAccess().getStringValueKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group_3__0__Impl"


    // $ANTLR start "rule__StringValue__Group_3__1"
    // InternalQL.g:6306:1: rule__StringValue__Group_3__1 : rule__StringValue__Group_3__1__Impl ;
    public final void rule__StringValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6310:1: ( rule__StringValue__Group_3__1__Impl )
            // InternalQL.g:6311:2: rule__StringValue__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringValue__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group_3__1"


    // $ANTLR start "rule__StringValue__Group_3__1__Impl"
    // InternalQL.g:6317:1: rule__StringValue__Group_3__1__Impl : ( ( rule__StringValue__StringValueAssignment_3_1 ) ) ;
    public final void rule__StringValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6321:1: ( ( ( rule__StringValue__StringValueAssignment_3_1 ) ) )
            // InternalQL.g:6322:1: ( ( rule__StringValue__StringValueAssignment_3_1 ) )
            {
            // InternalQL.g:6322:1: ( ( rule__StringValue__StringValueAssignment_3_1 ) )
            // InternalQL.g:6323:2: ( rule__StringValue__StringValueAssignment_3_1 )
            {
             before(grammarAccess.getStringValueAccess().getStringValueAssignment_3_1()); 
            // InternalQL.g:6324:2: ( rule__StringValue__StringValueAssignment_3_1 )
            // InternalQL.g:6324:3: rule__StringValue__StringValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__StringValue__StringValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStringValueAccess().getStringValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group_3__1__Impl"


    // $ANTLR start "rule__BooleanValue__Group__0"
    // InternalQL.g:6333:1: rule__BooleanValue__Group__0 : rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1 ;
    public final void rule__BooleanValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6337:1: ( rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1 )
            // InternalQL.g:6338:2: rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalQL.g:6345:1: rule__BooleanValue__Group__0__Impl : ( () ) ;
    public final void rule__BooleanValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6349:1: ( ( () ) )
            // InternalQL.g:6350:1: ( () )
            {
            // InternalQL.g:6350:1: ( () )
            // InternalQL.g:6351:2: ()
            {
             before(grammarAccess.getBooleanValueAccess().getBooleanValueAction_0()); 
            // InternalQL.g:6352:2: ()
            // InternalQL.g:6352:3: 
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
    // InternalQL.g:6360:1: rule__BooleanValue__Group__1 : rule__BooleanValue__Group__1__Impl rule__BooleanValue__Group__2 ;
    public final void rule__BooleanValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6364:1: ( rule__BooleanValue__Group__1__Impl rule__BooleanValue__Group__2 )
            // InternalQL.g:6365:2: rule__BooleanValue__Group__1__Impl rule__BooleanValue__Group__2
            {
            pushFollow(FOLLOW_47);
            rule__BooleanValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanValue__Group__2();

            state._fsp--;


            }

        }
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
    // InternalQL.g:6372:1: rule__BooleanValue__Group__1__Impl : ( ( rule__BooleanValue__BooleanValueAssignment_1 )? ) ;
    public final void rule__BooleanValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6376:1: ( ( ( rule__BooleanValue__BooleanValueAssignment_1 )? ) )
            // InternalQL.g:6377:1: ( ( rule__BooleanValue__BooleanValueAssignment_1 )? )
            {
            // InternalQL.g:6377:1: ( ( rule__BooleanValue__BooleanValueAssignment_1 )? )
            // InternalQL.g:6378:2: ( rule__BooleanValue__BooleanValueAssignment_1 )?
            {
             before(grammarAccess.getBooleanValueAccess().getBooleanValueAssignment_1()); 
            // InternalQL.g:6379:2: ( rule__BooleanValue__BooleanValueAssignment_1 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==84) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalQL.g:6379:3: rule__BooleanValue__BooleanValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanValue__BooleanValueAssignment_1();

                    state._fsp--;


                    }
                    break;

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


    // $ANTLR start "rule__BooleanValue__Group__2"
    // InternalQL.g:6387:1: rule__BooleanValue__Group__2 : rule__BooleanValue__Group__2__Impl ;
    public final void rule__BooleanValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6391:1: ( rule__BooleanValue__Group__2__Impl )
            // InternalQL.g:6392:2: rule__BooleanValue__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValue__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Group__2"


    // $ANTLR start "rule__BooleanValue__Group__2__Impl"
    // InternalQL.g:6398:1: rule__BooleanValue__Group__2__Impl : ( 'BooleanValue' ) ;
    public final void rule__BooleanValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6402:1: ( ( 'BooleanValue' ) )
            // InternalQL.g:6403:1: ( 'BooleanValue' )
            {
            // InternalQL.g:6403:1: ( 'BooleanValue' )
            // InternalQL.g:6404:2: 'BooleanValue'
            {
             before(grammarAccess.getBooleanValueAccess().getBooleanValueKeyword_2()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getBooleanValueAccess().getBooleanValueKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Group__2__Impl"


    // $ANTLR start "rule__DateValue__Group__0"
    // InternalQL.g:6414:1: rule__DateValue__Group__0 : rule__DateValue__Group__0__Impl rule__DateValue__Group__1 ;
    public final void rule__DateValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6418:1: ( rule__DateValue__Group__0__Impl rule__DateValue__Group__1 )
            // InternalQL.g:6419:2: rule__DateValue__Group__0__Impl rule__DateValue__Group__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalQL.g:6426:1: rule__DateValue__Group__0__Impl : ( () ) ;
    public final void rule__DateValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6430:1: ( ( () ) )
            // InternalQL.g:6431:1: ( () )
            {
            // InternalQL.g:6431:1: ( () )
            // InternalQL.g:6432:2: ()
            {
             before(grammarAccess.getDateValueAccess().getDateValueAction_0()); 
            // InternalQL.g:6433:2: ()
            // InternalQL.g:6433:3: 
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
    // InternalQL.g:6441:1: rule__DateValue__Group__1 : rule__DateValue__Group__1__Impl rule__DateValue__Group__2 ;
    public final void rule__DateValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6445:1: ( rule__DateValue__Group__1__Impl rule__DateValue__Group__2 )
            // InternalQL.g:6446:2: rule__DateValue__Group__1__Impl rule__DateValue__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalQL.g:6453:1: rule__DateValue__Group__1__Impl : ( 'DateValue' ) ;
    public final void rule__DateValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6457:1: ( ( 'DateValue' ) )
            // InternalQL.g:6458:1: ( 'DateValue' )
            {
            // InternalQL.g:6458:1: ( 'DateValue' )
            // InternalQL.g:6459:2: 'DateValue'
            {
             before(grammarAccess.getDateValueAccess().getDateValueKeyword_1()); 
            match(input,73,FOLLOW_2); 
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
    // InternalQL.g:6468:1: rule__DateValue__Group__2 : rule__DateValue__Group__2__Impl rule__DateValue__Group__3 ;
    public final void rule__DateValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6472:1: ( rule__DateValue__Group__2__Impl rule__DateValue__Group__3 )
            // InternalQL.g:6473:2: rule__DateValue__Group__2__Impl rule__DateValue__Group__3
            {
            pushFollow(FOLLOW_49);
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
    // InternalQL.g:6480:1: rule__DateValue__Group__2__Impl : ( '{' ) ;
    public final void rule__DateValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6484:1: ( ( '{' ) )
            // InternalQL.g:6485:1: ( '{' )
            {
            // InternalQL.g:6485:1: ( '{' )
            // InternalQL.g:6486:2: '{'
            {
             before(grammarAccess.getDateValueAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalQL.g:6495:1: rule__DateValue__Group__3 : rule__DateValue__Group__3__Impl rule__DateValue__Group__4 ;
    public final void rule__DateValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6499:1: ( rule__DateValue__Group__3__Impl rule__DateValue__Group__4 )
            // InternalQL.g:6500:2: rule__DateValue__Group__3__Impl rule__DateValue__Group__4
            {
            pushFollow(FOLLOW_49);
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
    // InternalQL.g:6507:1: rule__DateValue__Group__3__Impl : ( ( rule__DateValue__Group_3__0 )? ) ;
    public final void rule__DateValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6511:1: ( ( ( rule__DateValue__Group_3__0 )? ) )
            // InternalQL.g:6512:1: ( ( rule__DateValue__Group_3__0 )? )
            {
            // InternalQL.g:6512:1: ( ( rule__DateValue__Group_3__0 )? )
            // InternalQL.g:6513:2: ( rule__DateValue__Group_3__0 )?
            {
             before(grammarAccess.getDateValueAccess().getGroup_3()); 
            // InternalQL.g:6514:2: ( rule__DateValue__Group_3__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==74) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalQL.g:6514:3: rule__DateValue__Group_3__0
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
    // InternalQL.g:6522:1: rule__DateValue__Group__4 : rule__DateValue__Group__4__Impl ;
    public final void rule__DateValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6526:1: ( rule__DateValue__Group__4__Impl )
            // InternalQL.g:6527:2: rule__DateValue__Group__4__Impl
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
    // InternalQL.g:6533:1: rule__DateValue__Group__4__Impl : ( '}' ) ;
    public final void rule__DateValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6537:1: ( ( '}' ) )
            // InternalQL.g:6538:1: ( '}' )
            {
            // InternalQL.g:6538:1: ( '}' )
            // InternalQL.g:6539:2: '}'
            {
             before(grammarAccess.getDateValueAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
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
    // InternalQL.g:6549:1: rule__DateValue__Group_3__0 : rule__DateValue__Group_3__0__Impl rule__DateValue__Group_3__1 ;
    public final void rule__DateValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6553:1: ( rule__DateValue__Group_3__0__Impl rule__DateValue__Group_3__1 )
            // InternalQL.g:6554:2: rule__DateValue__Group_3__0__Impl rule__DateValue__Group_3__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalQL.g:6561:1: rule__DateValue__Group_3__0__Impl : ( 'dateValue' ) ;
    public final void rule__DateValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6565:1: ( ( 'dateValue' ) )
            // InternalQL.g:6566:1: ( 'dateValue' )
            {
            // InternalQL.g:6566:1: ( 'dateValue' )
            // InternalQL.g:6567:2: 'dateValue'
            {
             before(grammarAccess.getDateValueAccess().getDateValueKeyword_3_0()); 
            match(input,74,FOLLOW_2); 
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
    // InternalQL.g:6576:1: rule__DateValue__Group_3__1 : rule__DateValue__Group_3__1__Impl ;
    public final void rule__DateValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6580:1: ( rule__DateValue__Group_3__1__Impl )
            // InternalQL.g:6581:2: rule__DateValue__Group_3__1__Impl
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
    // InternalQL.g:6587:1: rule__DateValue__Group_3__1__Impl : ( ( rule__DateValue__DateValueAssignment_3_1 ) ) ;
    public final void rule__DateValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6591:1: ( ( ( rule__DateValue__DateValueAssignment_3_1 ) ) )
            // InternalQL.g:6592:1: ( ( rule__DateValue__DateValueAssignment_3_1 ) )
            {
            // InternalQL.g:6592:1: ( ( rule__DateValue__DateValueAssignment_3_1 ) )
            // InternalQL.g:6593:2: ( rule__DateValue__DateValueAssignment_3_1 )
            {
             before(grammarAccess.getDateValueAccess().getDateValueAssignment_3_1()); 
            // InternalQL.g:6594:2: ( rule__DateValue__DateValueAssignment_3_1 )
            // InternalQL.g:6594:3: rule__DateValue__DateValueAssignment_3_1
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
    // InternalQL.g:6603:1: rule__DecimalValue__Group__0 : rule__DecimalValue__Group__0__Impl rule__DecimalValue__Group__1 ;
    public final void rule__DecimalValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6607:1: ( rule__DecimalValue__Group__0__Impl rule__DecimalValue__Group__1 )
            // InternalQL.g:6608:2: rule__DecimalValue__Group__0__Impl rule__DecimalValue__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalQL.g:6615:1: rule__DecimalValue__Group__0__Impl : ( () ) ;
    public final void rule__DecimalValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6619:1: ( ( () ) )
            // InternalQL.g:6620:1: ( () )
            {
            // InternalQL.g:6620:1: ( () )
            // InternalQL.g:6621:2: ()
            {
             before(grammarAccess.getDecimalValueAccess().getDecimalValueAction_0()); 
            // InternalQL.g:6622:2: ()
            // InternalQL.g:6622:3: 
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
    // InternalQL.g:6630:1: rule__DecimalValue__Group__1 : rule__DecimalValue__Group__1__Impl rule__DecimalValue__Group__2 ;
    public final void rule__DecimalValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6634:1: ( rule__DecimalValue__Group__1__Impl rule__DecimalValue__Group__2 )
            // InternalQL.g:6635:2: rule__DecimalValue__Group__1__Impl rule__DecimalValue__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__DecimalValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecimalValue__Group__2();

            state._fsp--;


            }

        }
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
    // InternalQL.g:6642:1: rule__DecimalValue__Group__1__Impl : ( 'DecimalValue' ) ;
    public final void rule__DecimalValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6646:1: ( ( 'DecimalValue' ) )
            // InternalQL.g:6647:1: ( 'DecimalValue' )
            {
            // InternalQL.g:6647:1: ( 'DecimalValue' )
            // InternalQL.g:6648:2: 'DecimalValue'
            {
             before(grammarAccess.getDecimalValueAccess().getDecimalValueKeyword_1()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getDecimalValueAccess().getDecimalValueKeyword_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__DecimalValue__Group__2"
    // InternalQL.g:6657:1: rule__DecimalValue__Group__2 : rule__DecimalValue__Group__2__Impl rule__DecimalValue__Group__3 ;
    public final void rule__DecimalValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6661:1: ( rule__DecimalValue__Group__2__Impl rule__DecimalValue__Group__3 )
            // InternalQL.g:6662:2: rule__DecimalValue__Group__2__Impl rule__DecimalValue__Group__3
            {
            pushFollow(FOLLOW_50);
            rule__DecimalValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecimalValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValue__Group__2"


    // $ANTLR start "rule__DecimalValue__Group__2__Impl"
    // InternalQL.g:6669:1: rule__DecimalValue__Group__2__Impl : ( '{' ) ;
    public final void rule__DecimalValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6673:1: ( ( '{' ) )
            // InternalQL.g:6674:1: ( '{' )
            {
            // InternalQL.g:6674:1: ( '{' )
            // InternalQL.g:6675:2: '{'
            {
             before(grammarAccess.getDecimalValueAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDecimalValueAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValue__Group__2__Impl"


    // $ANTLR start "rule__DecimalValue__Group__3"
    // InternalQL.g:6684:1: rule__DecimalValue__Group__3 : rule__DecimalValue__Group__3__Impl rule__DecimalValue__Group__4 ;
    public final void rule__DecimalValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6688:1: ( rule__DecimalValue__Group__3__Impl rule__DecimalValue__Group__4 )
            // InternalQL.g:6689:2: rule__DecimalValue__Group__3__Impl rule__DecimalValue__Group__4
            {
            pushFollow(FOLLOW_50);
            rule__DecimalValue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecimalValue__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValue__Group__3"


    // $ANTLR start "rule__DecimalValue__Group__3__Impl"
    // InternalQL.g:6696:1: rule__DecimalValue__Group__3__Impl : ( ( rule__DecimalValue__Group_3__0 )? ) ;
    public final void rule__DecimalValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6700:1: ( ( ( rule__DecimalValue__Group_3__0 )? ) )
            // InternalQL.g:6701:1: ( ( rule__DecimalValue__Group_3__0 )? )
            {
            // InternalQL.g:6701:1: ( ( rule__DecimalValue__Group_3__0 )? )
            // InternalQL.g:6702:2: ( rule__DecimalValue__Group_3__0 )?
            {
             before(grammarAccess.getDecimalValueAccess().getGroup_3()); 
            // InternalQL.g:6703:2: ( rule__DecimalValue__Group_3__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==76) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalQL.g:6703:3: rule__DecimalValue__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DecimalValue__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDecimalValueAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValue__Group__3__Impl"


    // $ANTLR start "rule__DecimalValue__Group__4"
    // InternalQL.g:6711:1: rule__DecimalValue__Group__4 : rule__DecimalValue__Group__4__Impl ;
    public final void rule__DecimalValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6715:1: ( rule__DecimalValue__Group__4__Impl )
            // InternalQL.g:6716:2: rule__DecimalValue__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DecimalValue__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValue__Group__4"


    // $ANTLR start "rule__DecimalValue__Group__4__Impl"
    // InternalQL.g:6722:1: rule__DecimalValue__Group__4__Impl : ( '}' ) ;
    public final void rule__DecimalValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6726:1: ( ( '}' ) )
            // InternalQL.g:6727:1: ( '}' )
            {
            // InternalQL.g:6727:1: ( '}' )
            // InternalQL.g:6728:2: '}'
            {
             before(grammarAccess.getDecimalValueAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDecimalValueAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValue__Group__4__Impl"


    // $ANTLR start "rule__DecimalValue__Group_3__0"
    // InternalQL.g:6738:1: rule__DecimalValue__Group_3__0 : rule__DecimalValue__Group_3__0__Impl rule__DecimalValue__Group_3__1 ;
    public final void rule__DecimalValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6742:1: ( rule__DecimalValue__Group_3__0__Impl rule__DecimalValue__Group_3__1 )
            // InternalQL.g:6743:2: rule__DecimalValue__Group_3__0__Impl rule__DecimalValue__Group_3__1
            {
            pushFollow(FOLLOW_51);
            rule__DecimalValue__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecimalValue__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValue__Group_3__0"


    // $ANTLR start "rule__DecimalValue__Group_3__0__Impl"
    // InternalQL.g:6750:1: rule__DecimalValue__Group_3__0__Impl : ( 'decimalValue' ) ;
    public final void rule__DecimalValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6754:1: ( ( 'decimalValue' ) )
            // InternalQL.g:6755:1: ( 'decimalValue' )
            {
            // InternalQL.g:6755:1: ( 'decimalValue' )
            // InternalQL.g:6756:2: 'decimalValue'
            {
             before(grammarAccess.getDecimalValueAccess().getDecimalValueKeyword_3_0()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getDecimalValueAccess().getDecimalValueKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValue__Group_3__0__Impl"


    // $ANTLR start "rule__DecimalValue__Group_3__1"
    // InternalQL.g:6765:1: rule__DecimalValue__Group_3__1 : rule__DecimalValue__Group_3__1__Impl ;
    public final void rule__DecimalValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6769:1: ( rule__DecimalValue__Group_3__1__Impl )
            // InternalQL.g:6770:2: rule__DecimalValue__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DecimalValue__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValue__Group_3__1"


    // $ANTLR start "rule__DecimalValue__Group_3__1__Impl"
    // InternalQL.g:6776:1: rule__DecimalValue__Group_3__1__Impl : ( ( rule__DecimalValue__DecimalValueAssignment_3_1 ) ) ;
    public final void rule__DecimalValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6780:1: ( ( ( rule__DecimalValue__DecimalValueAssignment_3_1 ) ) )
            // InternalQL.g:6781:1: ( ( rule__DecimalValue__DecimalValueAssignment_3_1 ) )
            {
            // InternalQL.g:6781:1: ( ( rule__DecimalValue__DecimalValueAssignment_3_1 ) )
            // InternalQL.g:6782:2: ( rule__DecimalValue__DecimalValueAssignment_3_1 )
            {
             before(grammarAccess.getDecimalValueAccess().getDecimalValueAssignment_3_1()); 
            // InternalQL.g:6783:2: ( rule__DecimalValue__DecimalValueAssignment_3_1 )
            // InternalQL.g:6783:3: rule__DecimalValue__DecimalValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DecimalValue__DecimalValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDecimalValueAccess().getDecimalValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValue__Group_3__1__Impl"


    // $ANTLR start "rule__EFloat__Group__0"
    // InternalQL.g:6792:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6796:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalQL.g:6797:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalQL.g:6804:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6808:1: ( ( ( '-' )? ) )
            // InternalQL.g:6809:1: ( ( '-' )? )
            {
            // InternalQL.g:6809:1: ( ( '-' )? )
            // InternalQL.g:6810:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalQL.g:6811:2: ( '-' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==66) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalQL.g:6811:3: '-'
                    {
                    match(input,66,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
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
    // InternalQL.g:6819:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6823:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalQL.g:6824:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FOLLOW_51);
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
    // InternalQL.g:6831:1: rule__EFloat__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6835:1: ( ( ( RULE_INT )? ) )
            // InternalQL.g:6836:1: ( ( RULE_INT )? )
            {
            // InternalQL.g:6836:1: ( ( RULE_INT )? )
            // InternalQL.g:6837:2: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
            // InternalQL.g:6838:2: ( RULE_INT )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_INT) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalQL.g:6838:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
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
    // InternalQL.g:6846:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl rule__EFloat__Group__3 ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6850:1: ( rule__EFloat__Group__2__Impl rule__EFloat__Group__3 )
            // InternalQL.g:6851:2: rule__EFloat__Group__2__Impl rule__EFloat__Group__3
            {
            pushFollow(FOLLOW_52);
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
    // InternalQL.g:6858:1: rule__EFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6862:1: ( ( '.' ) )
            // InternalQL.g:6863:1: ( '.' )
            {
            // InternalQL.g:6863:1: ( '.' )
            // InternalQL.g:6864:2: '.'
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 

            }


            }

        }
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
    // InternalQL.g:6873:1: rule__EFloat__Group__3 : rule__EFloat__Group__3__Impl rule__EFloat__Group__4 ;
    public final void rule__EFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6877:1: ( rule__EFloat__Group__3__Impl rule__EFloat__Group__4 )
            // InternalQL.g:6878:2: rule__EFloat__Group__3__Impl rule__EFloat__Group__4
            {
            pushFollow(FOLLOW_53);
            rule__EFloat__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__4();

            state._fsp--;


            }

        }
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
    // InternalQL.g:6885:1: rule__EFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6889:1: ( ( RULE_INT ) )
            // InternalQL.g:6890:1: ( RULE_INT )
            {
            // InternalQL.g:6890:1: ( RULE_INT )
            // InternalQL.g:6891:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__EFloat__Group__4"
    // InternalQL.g:6900:1: rule__EFloat__Group__4 : rule__EFloat__Group__4__Impl ;
    public final void rule__EFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6904:1: ( rule__EFloat__Group__4__Impl )
            // InternalQL.g:6905:2: rule__EFloat__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__4"


    // $ANTLR start "rule__EFloat__Group__4__Impl"
    // InternalQL.g:6911:1: rule__EFloat__Group__4__Impl : ( ( rule__EFloat__Group_4__0 )? ) ;
    public final void rule__EFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6915:1: ( ( ( rule__EFloat__Group_4__0 )? ) )
            // InternalQL.g:6916:1: ( ( rule__EFloat__Group_4__0 )? )
            {
            // InternalQL.g:6916:1: ( ( rule__EFloat__Group_4__0 )? )
            // InternalQL.g:6917:2: ( rule__EFloat__Group_4__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_4()); 
            // InternalQL.g:6918:2: ( rule__EFloat__Group_4__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=12 && LA46_0<=13)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalQL.g:6918:3: rule__EFloat__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EFloat__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__4__Impl"


    // $ANTLR start "rule__EFloat__Group_4__0"
    // InternalQL.g:6927:1: rule__EFloat__Group_4__0 : rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 ;
    public final void rule__EFloat__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6931:1: ( rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 )
            // InternalQL.g:6932:2: rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1
            {
            pushFollow(FOLLOW_36);
            rule__EFloat__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__0"


    // $ANTLR start "rule__EFloat__Group_4__0__Impl"
    // InternalQL.g:6939:1: rule__EFloat__Group_4__0__Impl : ( ( rule__EFloat__Alternatives_4_0 ) ) ;
    public final void rule__EFloat__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6943:1: ( ( ( rule__EFloat__Alternatives_4_0 ) ) )
            // InternalQL.g:6944:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            {
            // InternalQL.g:6944:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            // InternalQL.g:6945:2: ( rule__EFloat__Alternatives_4_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 
            // InternalQL.g:6946:2: ( rule__EFloat__Alternatives_4_0 )
            // InternalQL.g:6946:3: rule__EFloat__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__0__Impl"


    // $ANTLR start "rule__EFloat__Group_4__1"
    // InternalQL.g:6954:1: rule__EFloat__Group_4__1 : rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 ;
    public final void rule__EFloat__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6958:1: ( rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 )
            // InternalQL.g:6959:2: rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2
            {
            pushFollow(FOLLOW_36);
            rule__EFloat__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__1"


    // $ANTLR start "rule__EFloat__Group_4__1__Impl"
    // InternalQL.g:6966:1: rule__EFloat__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6970:1: ( ( ( '-' )? ) )
            // InternalQL.g:6971:1: ( ( '-' )? )
            {
            // InternalQL.g:6971:1: ( ( '-' )? )
            // InternalQL.g:6972:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
            // InternalQL.g:6973:2: ( '-' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==66) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalQL.g:6973:3: '-'
                    {
                    match(input,66,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__1__Impl"


    // $ANTLR start "rule__EFloat__Group_4__2"
    // InternalQL.g:6981:1: rule__EFloat__Group_4__2 : rule__EFloat__Group_4__2__Impl ;
    public final void rule__EFloat__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6985:1: ( rule__EFloat__Group_4__2__Impl )
            // InternalQL.g:6986:2: rule__EFloat__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__2"


    // $ANTLR start "rule__EFloat__Group_4__2__Impl"
    // InternalQL.g:6992:1: rule__EFloat__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6996:1: ( ( RULE_INT ) )
            // InternalQL.g:6997:1: ( RULE_INT )
            {
            // InternalQL.g:6997:1: ( RULE_INT )
            // InternalQL.g:6998:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__2__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group__0"
    // InternalQL.g:7008:1: rule__QuestionDefinition__Group__0 : rule__QuestionDefinition__Group__0__Impl rule__QuestionDefinition__Group__1 ;
    public final void rule__QuestionDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7012:1: ( rule__QuestionDefinition__Group__0__Impl rule__QuestionDefinition__Group__1 )
            // InternalQL.g:7013:2: rule__QuestionDefinition__Group__0__Impl rule__QuestionDefinition__Group__1
            {
            pushFollow(FOLLOW_54);
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
    // InternalQL.g:7020:1: rule__QuestionDefinition__Group__0__Impl : ( ( rule__QuestionDefinition__IsDisplayedAssignment_0 )? ) ;
    public final void rule__QuestionDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7024:1: ( ( ( rule__QuestionDefinition__IsDisplayedAssignment_0 )? ) )
            // InternalQL.g:7025:1: ( ( rule__QuestionDefinition__IsDisplayedAssignment_0 )? )
            {
            // InternalQL.g:7025:1: ( ( rule__QuestionDefinition__IsDisplayedAssignment_0 )? )
            // InternalQL.g:7026:2: ( rule__QuestionDefinition__IsDisplayedAssignment_0 )?
            {
             before(grammarAccess.getQuestionDefinitionAccess().getIsDisplayedAssignment_0()); 
            // InternalQL.g:7027:2: ( rule__QuestionDefinition__IsDisplayedAssignment_0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==85) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalQL.g:7027:3: rule__QuestionDefinition__IsDisplayedAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionDefinition__IsDisplayedAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionDefinitionAccess().getIsDisplayedAssignment_0()); 

            }


            }

        }
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
    // InternalQL.g:7035:1: rule__QuestionDefinition__Group__1 : rule__QuestionDefinition__Group__1__Impl rule__QuestionDefinition__Group__2 ;
    public final void rule__QuestionDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7039:1: ( rule__QuestionDefinition__Group__1__Impl rule__QuestionDefinition__Group__2 )
            // InternalQL.g:7040:2: rule__QuestionDefinition__Group__1__Impl rule__QuestionDefinition__Group__2
            {
            pushFollow(FOLLOW_54);
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
    // InternalQL.g:7047:1: rule__QuestionDefinition__Group__1__Impl : ( ( rule__QuestionDefinition__IsMandatoryAssignment_1 )? ) ;
    public final void rule__QuestionDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7051:1: ( ( ( rule__QuestionDefinition__IsMandatoryAssignment_1 )? ) )
            // InternalQL.g:7052:1: ( ( rule__QuestionDefinition__IsMandatoryAssignment_1 )? )
            {
            // InternalQL.g:7052:1: ( ( rule__QuestionDefinition__IsMandatoryAssignment_1 )? )
            // InternalQL.g:7053:2: ( rule__QuestionDefinition__IsMandatoryAssignment_1 )?
            {
             before(grammarAccess.getQuestionDefinitionAccess().getIsMandatoryAssignment_1()); 
            // InternalQL.g:7054:2: ( rule__QuestionDefinition__IsMandatoryAssignment_1 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==86) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalQL.g:7054:3: rule__QuestionDefinition__IsMandatoryAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionDefinition__IsMandatoryAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionDefinitionAccess().getIsMandatoryAssignment_1()); 

            }


            }

        }
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
    // InternalQL.g:7062:1: rule__QuestionDefinition__Group__2 : rule__QuestionDefinition__Group__2__Impl rule__QuestionDefinition__Group__3 ;
    public final void rule__QuestionDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7066:1: ( rule__QuestionDefinition__Group__2__Impl rule__QuestionDefinition__Group__3 )
            // InternalQL.g:7067:2: rule__QuestionDefinition__Group__2__Impl rule__QuestionDefinition__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalQL.g:7074:1: rule__QuestionDefinition__Group__2__Impl : ( 'QuestionDefinition' ) ;
    public final void rule__QuestionDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7078:1: ( ( 'QuestionDefinition' ) )
            // InternalQL.g:7079:1: ( 'QuestionDefinition' )
            {
            // InternalQL.g:7079:1: ( 'QuestionDefinition' )
            // InternalQL.g:7080:2: 'QuestionDefinition'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getQuestionDefinitionKeyword_2()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getQuestionDefinitionAccess().getQuestionDefinitionKeyword_2()); 

            }


            }

        }
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
    // InternalQL.g:7089:1: rule__QuestionDefinition__Group__3 : rule__QuestionDefinition__Group__3__Impl rule__QuestionDefinition__Group__4 ;
    public final void rule__QuestionDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7093:1: ( rule__QuestionDefinition__Group__3__Impl rule__QuestionDefinition__Group__4 )
            // InternalQL.g:7094:2: rule__QuestionDefinition__Group__3__Impl rule__QuestionDefinition__Group__4
            {
            pushFollow(FOLLOW_4);
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
    // InternalQL.g:7101:1: rule__QuestionDefinition__Group__3__Impl : ( ( rule__QuestionDefinition__NameAssignment_3 ) ) ;
    public final void rule__QuestionDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7105:1: ( ( ( rule__QuestionDefinition__NameAssignment_3 ) ) )
            // InternalQL.g:7106:1: ( ( rule__QuestionDefinition__NameAssignment_3 ) )
            {
            // InternalQL.g:7106:1: ( ( rule__QuestionDefinition__NameAssignment_3 ) )
            // InternalQL.g:7107:2: ( rule__QuestionDefinition__NameAssignment_3 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getNameAssignment_3()); 
            // InternalQL.g:7108:2: ( rule__QuestionDefinition__NameAssignment_3 )
            // InternalQL.g:7108:3: rule__QuestionDefinition__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getQuestionDefinitionAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // InternalQL.g:7116:1: rule__QuestionDefinition__Group__4 : rule__QuestionDefinition__Group__4__Impl rule__QuestionDefinition__Group__5 ;
    public final void rule__QuestionDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7120:1: ( rule__QuestionDefinition__Group__4__Impl rule__QuestionDefinition__Group__5 )
            // InternalQL.g:7121:2: rule__QuestionDefinition__Group__4__Impl rule__QuestionDefinition__Group__5
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
    // InternalQL.g:7128:1: rule__QuestionDefinition__Group__4__Impl : ( '{' ) ;
    public final void rule__QuestionDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7132:1: ( ( '{' ) )
            // InternalQL.g:7133:1: ( '{' )
            {
            // InternalQL.g:7133:1: ( '{' )
            // InternalQL.g:7134:2: '{'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getQuestionDefinitionAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
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
    // InternalQL.g:7143:1: rule__QuestionDefinition__Group__5 : rule__QuestionDefinition__Group__5__Impl rule__QuestionDefinition__Group__6 ;
    public final void rule__QuestionDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7147:1: ( rule__QuestionDefinition__Group__5__Impl rule__QuestionDefinition__Group__6 )
            // InternalQL.g:7148:2: rule__QuestionDefinition__Group__5__Impl rule__QuestionDefinition__Group__6
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
    // InternalQL.g:7155:1: rule__QuestionDefinition__Group__5__Impl : ( ( rule__QuestionDefinition__Group_5__0 )? ) ;
    public final void rule__QuestionDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7159:1: ( ( ( rule__QuestionDefinition__Group_5__0 )? ) )
            // InternalQL.g:7160:1: ( ( rule__QuestionDefinition__Group_5__0 )? )
            {
            // InternalQL.g:7160:1: ( ( rule__QuestionDefinition__Group_5__0 )? )
            // InternalQL.g:7161:2: ( rule__QuestionDefinition__Group_5__0 )?
            {
             before(grammarAccess.getQuestionDefinitionAccess().getGroup_5()); 
            // InternalQL.g:7162:2: ( rule__QuestionDefinition__Group_5__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==80) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalQL.g:7162:3: rule__QuestionDefinition__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionDefinition__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionDefinitionAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalQL.g:7170:1: rule__QuestionDefinition__Group__6 : rule__QuestionDefinition__Group__6__Impl rule__QuestionDefinition__Group__7 ;
    public final void rule__QuestionDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7174:1: ( rule__QuestionDefinition__Group__6__Impl rule__QuestionDefinition__Group__7 )
            // InternalQL.g:7175:2: rule__QuestionDefinition__Group__6__Impl rule__QuestionDefinition__Group__7
            {
            pushFollow(FOLLOW_11);
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
    // InternalQL.g:7182:1: rule__QuestionDefinition__Group__6__Impl : ( 'dataType' ) ;
    public final void rule__QuestionDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7186:1: ( ( 'dataType' ) )
            // InternalQL.g:7187:1: ( 'dataType' )
            {
            // InternalQL.g:7187:1: ( 'dataType' )
            // InternalQL.g:7188:2: 'dataType'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getDataTypeKeyword_6()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getQuestionDefinitionAccess().getDataTypeKeyword_6()); 

            }


            }

        }
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
    // InternalQL.g:7197:1: rule__QuestionDefinition__Group__7 : rule__QuestionDefinition__Group__7__Impl rule__QuestionDefinition__Group__8 ;
    public final void rule__QuestionDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7201:1: ( rule__QuestionDefinition__Group__7__Impl rule__QuestionDefinition__Group__8 )
            // InternalQL.g:7202:2: rule__QuestionDefinition__Group__7__Impl rule__QuestionDefinition__Group__8
            {
            pushFollow(FOLLOW_56);
            rule__QuestionDefinition__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group__8();

            state._fsp--;


            }

        }
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
    // InternalQL.g:7209:1: rule__QuestionDefinition__Group__7__Impl : ( ( rule__QuestionDefinition__DataTypeAssignment_7 ) ) ;
    public final void rule__QuestionDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7213:1: ( ( ( rule__QuestionDefinition__DataTypeAssignment_7 ) ) )
            // InternalQL.g:7214:1: ( ( rule__QuestionDefinition__DataTypeAssignment_7 ) )
            {
            // InternalQL.g:7214:1: ( ( rule__QuestionDefinition__DataTypeAssignment_7 ) )
            // InternalQL.g:7215:2: ( rule__QuestionDefinition__DataTypeAssignment_7 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getDataTypeAssignment_7()); 
            // InternalQL.g:7216:2: ( rule__QuestionDefinition__DataTypeAssignment_7 )
            // InternalQL.g:7216:3: rule__QuestionDefinition__DataTypeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__DataTypeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getQuestionDefinitionAccess().getDataTypeAssignment_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__QuestionDefinition__Group__8"
    // InternalQL.g:7224:1: rule__QuestionDefinition__Group__8 : rule__QuestionDefinition__Group__8__Impl rule__QuestionDefinition__Group__9 ;
    public final void rule__QuestionDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7228:1: ( rule__QuestionDefinition__Group__8__Impl rule__QuestionDefinition__Group__9 )
            // InternalQL.g:7229:2: rule__QuestionDefinition__Group__8__Impl rule__QuestionDefinition__Group__9
            {
            pushFollow(FOLLOW_56);
            rule__QuestionDefinition__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group__8"


    // $ANTLR start "rule__QuestionDefinition__Group__8__Impl"
    // InternalQL.g:7236:1: rule__QuestionDefinition__Group__8__Impl : ( ( rule__QuestionDefinition__Group_8__0 )? ) ;
    public final void rule__QuestionDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7240:1: ( ( ( rule__QuestionDefinition__Group_8__0 )? ) )
            // InternalQL.g:7241:1: ( ( rule__QuestionDefinition__Group_8__0 )? )
            {
            // InternalQL.g:7241:1: ( ( rule__QuestionDefinition__Group_8__0 )? )
            // InternalQL.g:7242:2: ( rule__QuestionDefinition__Group_8__0 )?
            {
             before(grammarAccess.getQuestionDefinitionAccess().getGroup_8()); 
            // InternalQL.g:7243:2: ( rule__QuestionDefinition__Group_8__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==81) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalQL.g:7243:3: rule__QuestionDefinition__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionDefinition__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionDefinitionAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group__8__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group__9"
    // InternalQL.g:7251:1: rule__QuestionDefinition__Group__9 : rule__QuestionDefinition__Group__9__Impl rule__QuestionDefinition__Group__10 ;
    public final void rule__QuestionDefinition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7255:1: ( rule__QuestionDefinition__Group__9__Impl rule__QuestionDefinition__Group__10 )
            // InternalQL.g:7256:2: rule__QuestionDefinition__Group__9__Impl rule__QuestionDefinition__Group__10
            {
            pushFollow(FOLLOW_56);
            rule__QuestionDefinition__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group__9"


    // $ANTLR start "rule__QuestionDefinition__Group__9__Impl"
    // InternalQL.g:7263:1: rule__QuestionDefinition__Group__9__Impl : ( ( rule__QuestionDefinition__Group_9__0 )? ) ;
    public final void rule__QuestionDefinition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7267:1: ( ( ( rule__QuestionDefinition__Group_9__0 )? ) )
            // InternalQL.g:7268:1: ( ( rule__QuestionDefinition__Group_9__0 )? )
            {
            // InternalQL.g:7268:1: ( ( rule__QuestionDefinition__Group_9__0 )? )
            // InternalQL.g:7269:2: ( rule__QuestionDefinition__Group_9__0 )?
            {
             before(grammarAccess.getQuestionDefinitionAccess().getGroup_9()); 
            // InternalQL.g:7270:2: ( rule__QuestionDefinition__Group_9__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==82) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalQL.g:7270:3: rule__QuestionDefinition__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionDefinition__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionDefinitionAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group__9__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group__10"
    // InternalQL.g:7278:1: rule__QuestionDefinition__Group__10 : rule__QuestionDefinition__Group__10__Impl ;
    public final void rule__QuestionDefinition__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7282:1: ( rule__QuestionDefinition__Group__10__Impl )
            // InternalQL.g:7283:2: rule__QuestionDefinition__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group__10"


    // $ANTLR start "rule__QuestionDefinition__Group__10__Impl"
    // InternalQL.g:7289:1: rule__QuestionDefinition__Group__10__Impl : ( '}' ) ;
    public final void rule__QuestionDefinition__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7293:1: ( ( '}' ) )
            // InternalQL.g:7294:1: ( '}' )
            {
            // InternalQL.g:7294:1: ( '}' )
            // InternalQL.g:7295:2: '}'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getRightCurlyBracketKeyword_10()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getQuestionDefinitionAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group__10__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group_5__0"
    // InternalQL.g:7305:1: rule__QuestionDefinition__Group_5__0 : rule__QuestionDefinition__Group_5__0__Impl rule__QuestionDefinition__Group_5__1 ;
    public final void rule__QuestionDefinition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7309:1: ( rule__QuestionDefinition__Group_5__0__Impl rule__QuestionDefinition__Group_5__1 )
            // InternalQL.g:7310:2: rule__QuestionDefinition__Group_5__0__Impl rule__QuestionDefinition__Group_5__1
            {
            pushFollow(FOLLOW_11);
            rule__QuestionDefinition__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_5__0"


    // $ANTLR start "rule__QuestionDefinition__Group_5__0__Impl"
    // InternalQL.g:7317:1: rule__QuestionDefinition__Group_5__0__Impl : ( 'label' ) ;
    public final void rule__QuestionDefinition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7321:1: ( ( 'label' ) )
            // InternalQL.g:7322:1: ( 'label' )
            {
            // InternalQL.g:7322:1: ( 'label' )
            // InternalQL.g:7323:2: 'label'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getLabelKeyword_5_0()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getQuestionDefinitionAccess().getLabelKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_5__0__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group_5__1"
    // InternalQL.g:7332:1: rule__QuestionDefinition__Group_5__1 : rule__QuestionDefinition__Group_5__1__Impl ;
    public final void rule__QuestionDefinition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7336:1: ( rule__QuestionDefinition__Group_5__1__Impl )
            // InternalQL.g:7337:2: rule__QuestionDefinition__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_5__1"


    // $ANTLR start "rule__QuestionDefinition__Group_5__1__Impl"
    // InternalQL.g:7343:1: rule__QuestionDefinition__Group_5__1__Impl : ( ( rule__QuestionDefinition__LabelAssignment_5_1 ) ) ;
    public final void rule__QuestionDefinition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7347:1: ( ( ( rule__QuestionDefinition__LabelAssignment_5_1 ) ) )
            // InternalQL.g:7348:1: ( ( rule__QuestionDefinition__LabelAssignment_5_1 ) )
            {
            // InternalQL.g:7348:1: ( ( rule__QuestionDefinition__LabelAssignment_5_1 ) )
            // InternalQL.g:7349:2: ( rule__QuestionDefinition__LabelAssignment_5_1 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getLabelAssignment_5_1()); 
            // InternalQL.g:7350:2: ( rule__QuestionDefinition__LabelAssignment_5_1 )
            // InternalQL.g:7350:3: rule__QuestionDefinition__LabelAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__LabelAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionDefinitionAccess().getLabelAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_5__1__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group_8__0"
    // InternalQL.g:7359:1: rule__QuestionDefinition__Group_8__0 : rule__QuestionDefinition__Group_8__0__Impl rule__QuestionDefinition__Group_8__1 ;
    public final void rule__QuestionDefinition__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7363:1: ( rule__QuestionDefinition__Group_8__0__Impl rule__QuestionDefinition__Group_8__1 )
            // InternalQL.g:7364:2: rule__QuestionDefinition__Group_8__0__Impl rule__QuestionDefinition__Group_8__1
            {
            pushFollow(FOLLOW_18);
            rule__QuestionDefinition__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_8__0"


    // $ANTLR start "rule__QuestionDefinition__Group_8__0__Impl"
    // InternalQL.g:7371:1: rule__QuestionDefinition__Group_8__0__Impl : ( 'computedExpression' ) ;
    public final void rule__QuestionDefinition__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7375:1: ( ( 'computedExpression' ) )
            // InternalQL.g:7376:1: ( 'computedExpression' )
            {
            // InternalQL.g:7376:1: ( 'computedExpression' )
            // InternalQL.g:7377:2: 'computedExpression'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getComputedExpressionKeyword_8_0()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getQuestionDefinitionAccess().getComputedExpressionKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_8__0__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group_8__1"
    // InternalQL.g:7386:1: rule__QuestionDefinition__Group_8__1 : rule__QuestionDefinition__Group_8__1__Impl ;
    public final void rule__QuestionDefinition__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7390:1: ( rule__QuestionDefinition__Group_8__1__Impl )
            // InternalQL.g:7391:2: rule__QuestionDefinition__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_8__1"


    // $ANTLR start "rule__QuestionDefinition__Group_8__1__Impl"
    // InternalQL.g:7397:1: rule__QuestionDefinition__Group_8__1__Impl : ( ( rule__QuestionDefinition__ComputedExpressionAssignment_8_1 ) ) ;
    public final void rule__QuestionDefinition__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7401:1: ( ( ( rule__QuestionDefinition__ComputedExpressionAssignment_8_1 ) ) )
            // InternalQL.g:7402:1: ( ( rule__QuestionDefinition__ComputedExpressionAssignment_8_1 ) )
            {
            // InternalQL.g:7402:1: ( ( rule__QuestionDefinition__ComputedExpressionAssignment_8_1 ) )
            // InternalQL.g:7403:2: ( rule__QuestionDefinition__ComputedExpressionAssignment_8_1 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getComputedExpressionAssignment_8_1()); 
            // InternalQL.g:7404:2: ( rule__QuestionDefinition__ComputedExpressionAssignment_8_1 )
            // InternalQL.g:7404:3: rule__QuestionDefinition__ComputedExpressionAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__ComputedExpressionAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionDefinitionAccess().getComputedExpressionAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_8__1__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group_9__0"
    // InternalQL.g:7413:1: rule__QuestionDefinition__Group_9__0 : rule__QuestionDefinition__Group_9__0__Impl rule__QuestionDefinition__Group_9__1 ;
    public final void rule__QuestionDefinition__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7417:1: ( rule__QuestionDefinition__Group_9__0__Impl rule__QuestionDefinition__Group_9__1 )
            // InternalQL.g:7418:2: rule__QuestionDefinition__Group_9__0__Impl rule__QuestionDefinition__Group_9__1
            {
            pushFollow(FOLLOW_29);
            rule__QuestionDefinition__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_9__0"


    // $ANTLR start "rule__QuestionDefinition__Group_9__0__Impl"
    // InternalQL.g:7425:1: rule__QuestionDefinition__Group_9__0__Impl : ( 'currentValue' ) ;
    public final void rule__QuestionDefinition__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7429:1: ( ( 'currentValue' ) )
            // InternalQL.g:7430:1: ( 'currentValue' )
            {
            // InternalQL.g:7430:1: ( 'currentValue' )
            // InternalQL.g:7431:2: 'currentValue'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getCurrentValueKeyword_9_0()); 
            match(input,82,FOLLOW_2); 
             after(grammarAccess.getQuestionDefinitionAccess().getCurrentValueKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_9__0__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group_9__1"
    // InternalQL.g:7440:1: rule__QuestionDefinition__Group_9__1 : rule__QuestionDefinition__Group_9__1__Impl ;
    public final void rule__QuestionDefinition__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7444:1: ( rule__QuestionDefinition__Group_9__1__Impl )
            // InternalQL.g:7445:2: rule__QuestionDefinition__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_9__1"


    // $ANTLR start "rule__QuestionDefinition__Group_9__1__Impl"
    // InternalQL.g:7451:1: rule__QuestionDefinition__Group_9__1__Impl : ( ( rule__QuestionDefinition__CurrentValueAssignment_9_1 ) ) ;
    public final void rule__QuestionDefinition__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7455:1: ( ( ( rule__QuestionDefinition__CurrentValueAssignment_9_1 ) ) )
            // InternalQL.g:7456:1: ( ( rule__QuestionDefinition__CurrentValueAssignment_9_1 ) )
            {
            // InternalQL.g:7456:1: ( ( rule__QuestionDefinition__CurrentValueAssignment_9_1 ) )
            // InternalQL.g:7457:2: ( rule__QuestionDefinition__CurrentValueAssignment_9_1 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getCurrentValueAssignment_9_1()); 
            // InternalQL.g:7458:2: ( rule__QuestionDefinition__CurrentValueAssignment_9_1 )
            // InternalQL.g:7458:3: rule__QuestionDefinition__CurrentValueAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__CurrentValueAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionDefinitionAccess().getCurrentValueAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_9__1__Impl"


    // $ANTLR start "rule__QLModel__CanSubmitAssignment_1"
    // InternalQL.g:7467:1: rule__QLModel__CanSubmitAssignment_1 : ( ( 'canSubmit' ) ) ;
    public final void rule__QLModel__CanSubmitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7471:1: ( ( ( 'canSubmit' ) ) )
            // InternalQL.g:7472:2: ( ( 'canSubmit' ) )
            {
            // InternalQL.g:7472:2: ( ( 'canSubmit' ) )
            // InternalQL.g:7473:3: ( 'canSubmit' )
            {
             before(grammarAccess.getQLModelAccess().getCanSubmitCanSubmitKeyword_1_0()); 
            // InternalQL.g:7474:3: ( 'canSubmit' )
            // InternalQL.g:7475:4: 'canSubmit'
            {
             before(grammarAccess.getQLModelAccess().getCanSubmitCanSubmitKeyword_1_0()); 
            match(input,83,FOLLOW_2); 
             after(grammarAccess.getQLModelAccess().getCanSubmitCanSubmitKeyword_1_0()); 

            }

             after(grammarAccess.getQLModelAccess().getCanSubmitCanSubmitKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__CanSubmitAssignment_1"


    // $ANTLR start "rule__QLModel__SubmitDateAssignment_4_1"
    // InternalQL.g:7486:1: rule__QLModel__SubmitDateAssignment_4_1 : ( ruleEDate ) ;
    public final void rule__QLModel__SubmitDateAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7490:1: ( ( ruleEDate ) )
            // InternalQL.g:7491:2: ( ruleEDate )
            {
            // InternalQL.g:7491:2: ( ruleEDate )
            // InternalQL.g:7492:3: ruleEDate
            {
             before(grammarAccess.getQLModelAccess().getSubmitDateEDateParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDate();

            state._fsp--;

             after(grammarAccess.getQLModelAccess().getSubmitDateEDateParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__SubmitDateAssignment_4_1"


    // $ANTLR start "rule__QLModel__FormsAssignment_5_2"
    // InternalQL.g:7501:1: rule__QLModel__FormsAssignment_5_2 : ( ruleForm ) ;
    public final void rule__QLModel__FormsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7505:1: ( ( ruleForm ) )
            // InternalQL.g:7506:2: ( ruleForm )
            {
            // InternalQL.g:7506:2: ( ruleForm )
            // InternalQL.g:7507:3: ruleForm
            {
             before(grammarAccess.getQLModelAccess().getFormsFormParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleForm();

            state._fsp--;

             after(grammarAccess.getQLModelAccess().getFormsFormParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__FormsAssignment_5_2"


    // $ANTLR start "rule__QLModel__FormsAssignment_5_3_1"
    // InternalQL.g:7516:1: rule__QLModel__FormsAssignment_5_3_1 : ( ruleForm ) ;
    public final void rule__QLModel__FormsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7520:1: ( ( ruleForm ) )
            // InternalQL.g:7521:2: ( ruleForm )
            {
            // InternalQL.g:7521:2: ( ruleForm )
            // InternalQL.g:7522:3: ruleForm
            {
             before(grammarAccess.getQLModelAccess().getFormsFormParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleForm();

            state._fsp--;

             after(grammarAccess.getQLModelAccess().getFormsFormParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__FormsAssignment_5_3_1"


    // $ANTLR start "rule__QLModel__DefinitionGroupAssignment_6_2"
    // InternalQL.g:7531:1: rule__QLModel__DefinitionGroupAssignment_6_2 : ( ruleDefinitionGroup ) ;
    public final void rule__QLModel__DefinitionGroupAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7535:1: ( ( ruleDefinitionGroup ) )
            // InternalQL.g:7536:2: ( ruleDefinitionGroup )
            {
            // InternalQL.g:7536:2: ( ruleDefinitionGroup )
            // InternalQL.g:7537:3: ruleDefinitionGroup
            {
             before(grammarAccess.getQLModelAccess().getDefinitionGroupDefinitionGroupParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDefinitionGroup();

            state._fsp--;

             after(grammarAccess.getQLModelAccess().getDefinitionGroupDefinitionGroupParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__DefinitionGroupAssignment_6_2"


    // $ANTLR start "rule__QLModel__DefinitionGroupAssignment_6_3_1"
    // InternalQL.g:7546:1: rule__QLModel__DefinitionGroupAssignment_6_3_1 : ( ruleDefinitionGroup ) ;
    public final void rule__QLModel__DefinitionGroupAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7550:1: ( ( ruleDefinitionGroup ) )
            // InternalQL.g:7551:2: ( ruleDefinitionGroup )
            {
            // InternalQL.g:7551:2: ( ruleDefinitionGroup )
            // InternalQL.g:7552:3: ruleDefinitionGroup
            {
             before(grammarAccess.getQLModelAccess().getDefinitionGroupDefinitionGroupParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDefinitionGroup();

            state._fsp--;

             after(grammarAccess.getQLModelAccess().getDefinitionGroupDefinitionGroupParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__DefinitionGroupAssignment_6_3_1"


    // $ANTLR start "rule__Form__NameAssignment_1"
    // InternalQL.g:7561:1: rule__Form__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Form__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7565:1: ( ( ruleEString ) )
            // InternalQL.g:7566:2: ( ruleEString )
            {
            // InternalQL.g:7566:2: ( ruleEString )
            // InternalQL.g:7567:3: ruleEString
            {
             before(grammarAccess.getFormAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFormAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Form__QuestionGroupAssignment_4"
    // InternalQL.g:7576:1: rule__Form__QuestionGroupAssignment_4 : ( ruleQuestionGroup ) ;
    public final void rule__Form__QuestionGroupAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7580:1: ( ( ruleQuestionGroup ) )
            // InternalQL.g:7581:2: ( ruleQuestionGroup )
            {
            // InternalQL.g:7581:2: ( ruleQuestionGroup )
            // InternalQL.g:7582:3: ruleQuestionGroup
            {
             before(grammarAccess.getFormAccess().getQuestionGroupQuestionGroupParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestionGroup();

            state._fsp--;

             after(grammarAccess.getFormAccess().getQuestionGroupQuestionGroupParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__QuestionGroupAssignment_4"


    // $ANTLR start "rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0"
    // InternalQL.g:7591:1: rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0 : ( ruleQuestionDefinition ) ;
    public final void rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7595:1: ( ( ruleQuestionDefinition ) )
            // InternalQL.g:7596:2: ( ruleQuestionDefinition )
            {
            // InternalQL.g:7596:2: ( ruleQuestionDefinition )
            // InternalQL.g:7597:3: ruleQuestionDefinition
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
    // InternalQL.g:7606:1: rule__DefinitionGroup__DataTypesAssignment_3_1 : ( ruleValueType ) ;
    public final void rule__DefinitionGroup__DataTypesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7610:1: ( ( ruleValueType ) )
            // InternalQL.g:7611:2: ( ruleValueType )
            {
            // InternalQL.g:7611:2: ( ruleValueType )
            // InternalQL.g:7612:3: ruleValueType
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


    // $ANTLR start "rule__QuestionGroup__GuardAssignment_3_1"
    // InternalQL.g:7621:1: rule__QuestionGroup__GuardAssignment_3_1 : ( ruleExpression ) ;
    public final void rule__QuestionGroup__GuardAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7625:1: ( ( ruleExpression ) )
            // InternalQL.g:7626:2: ( ruleExpression )
            {
            // InternalQL.g:7626:2: ( ruleExpression )
            // InternalQL.g:7627:3: ruleExpression
            {
             before(grammarAccess.getQuestionGroupAccess().getGuardExpressionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getQuestionGroupAccess().getGuardExpressionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__GuardAssignment_3_1"


    // $ANTLR start "rule__QuestionGroup__QuestionGroupsAssignment_4_2"
    // InternalQL.g:7636:1: rule__QuestionGroup__QuestionGroupsAssignment_4_2 : ( ruleQuestionGroup ) ;
    public final void rule__QuestionGroup__QuestionGroupsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7640:1: ( ( ruleQuestionGroup ) )
            // InternalQL.g:7641:2: ( ruleQuestionGroup )
            {
            // InternalQL.g:7641:2: ( ruleQuestionGroup )
            // InternalQL.g:7642:3: ruleQuestionGroup
            {
             before(grammarAccess.getQuestionGroupAccess().getQuestionGroupsQuestionGroupParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestionGroup();

            state._fsp--;

             after(grammarAccess.getQuestionGroupAccess().getQuestionGroupsQuestionGroupParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__QuestionGroupsAssignment_4_2"


    // $ANTLR start "rule__QuestionGroup__QuestionGroupsAssignment_4_3_1"
    // InternalQL.g:7651:1: rule__QuestionGroup__QuestionGroupsAssignment_4_3_1 : ( ruleQuestionGroup ) ;
    public final void rule__QuestionGroup__QuestionGroupsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7655:1: ( ( ruleQuestionGroup ) )
            // InternalQL.g:7656:2: ( ruleQuestionGroup )
            {
            // InternalQL.g:7656:2: ( ruleQuestionGroup )
            // InternalQL.g:7657:3: ruleQuestionGroup
            {
             before(grammarAccess.getQuestionGroupAccess().getQuestionGroupsQuestionGroupParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestionGroup();

            state._fsp--;

             after(grammarAccess.getQuestionGroupAccess().getQuestionGroupsQuestionGroupParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__QuestionGroupsAssignment_4_3_1"


    // $ANTLR start "rule__QuestionGroup__QuestionsAssignment_5_2"
    // InternalQL.g:7666:1: rule__QuestionGroup__QuestionsAssignment_5_2 : ( ruleQuestion ) ;
    public final void rule__QuestionGroup__QuestionsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7670:1: ( ( ruleQuestion ) )
            // InternalQL.g:7671:2: ( ruleQuestion )
            {
            // InternalQL.g:7671:2: ( ruleQuestion )
            // InternalQL.g:7672:3: ruleQuestion
            {
             before(grammarAccess.getQuestionGroupAccess().getQuestionsQuestionParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionGroupAccess().getQuestionsQuestionParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__QuestionsAssignment_5_2"


    // $ANTLR start "rule__QuestionGroup__QuestionsAssignment_5_3_1"
    // InternalQL.g:7681:1: rule__QuestionGroup__QuestionsAssignment_5_3_1 : ( ruleQuestion ) ;
    public final void rule__QuestionGroup__QuestionsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7685:1: ( ( ruleQuestion ) )
            // InternalQL.g:7686:2: ( ruleQuestion )
            {
            // InternalQL.g:7686:2: ( ruleQuestion )
            // InternalQL.g:7687:3: ruleQuestion
            {
             before(grammarAccess.getQuestionGroupAccess().getQuestionsQuestionParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionGroupAccess().getQuestionsQuestionParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__QuestionsAssignment_5_3_1"


    // $ANTLR start "rule__Question__QuestionDefinitionAssignment_3"
    // InternalQL.g:7696:1: rule__Question__QuestionDefinitionAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Question__QuestionDefinitionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7700:1: ( ( ( ruleEString ) ) )
            // InternalQL.g:7701:2: ( ( ruleEString ) )
            {
            // InternalQL.g:7701:2: ( ( ruleEString ) )
            // InternalQL.g:7702:3: ( ruleEString )
            {
             before(grammarAccess.getQuestionAccess().getQuestionDefinitionQuestionDefinitionCrossReference_3_0()); 
            // InternalQL.g:7703:3: ( ruleEString )
            // InternalQL.g:7704:4: ruleEString
            {
             before(grammarAccess.getQuestionAccess().getQuestionDefinitionQuestionDefinitionEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getQuestionDefinitionQuestionDefinitionEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getQuestionAccess().getQuestionDefinitionQuestionDefinitionCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__QuestionDefinitionAssignment_3"


    // $ANTLR start "rule__ValueType_Impl__NameAssignment_2"
    // InternalQL.g:7715:1: rule__ValueType_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ValueType_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7719:1: ( ( ruleEString ) )
            // InternalQL.g:7720:2: ( ruleEString )
            {
            // InternalQL.g:7720:2: ( ruleEString )
            // InternalQL.g:7721:3: ruleEString
            {
             before(grammarAccess.getValueType_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getValueType_ImplAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalQL.g:7730:1: rule__ValueType_Impl__UnitAssignment_4_1 : ( ruleEString ) ;
    public final void rule__ValueType_Impl__UnitAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7734:1: ( ( ruleEString ) )
            // InternalQL.g:7735:2: ( ruleEString )
            {
            // InternalQL.g:7735:2: ( ruleEString )
            // InternalQL.g:7736:3: ruleEString
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


    // $ANTLR start "rule__BasicBinaryExpression__OperatorAssignment_3"
    // InternalQL.g:7745:1: rule__BasicBinaryExpression__OperatorAssignment_3 : ( ruleBinaryOperatorKind ) ;
    public final void rule__BasicBinaryExpression__OperatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7749:1: ( ( ruleBinaryOperatorKind ) )
            // InternalQL.g:7750:2: ( ruleBinaryOperatorKind )
            {
            // InternalQL.g:7750:2: ( ruleBinaryOperatorKind )
            // InternalQL.g:7751:3: ruleBinaryOperatorKind
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getOperatorBinaryOperatorKindEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBinaryOperatorKind();

            state._fsp--;

             after(grammarAccess.getBasicBinaryExpressionAccess().getOperatorBinaryOperatorKindEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__OperatorAssignment_3"


    // $ANTLR start "rule__BasicBinaryExpression__ResultTypeAssignment_4_1"
    // InternalQL.g:7760:1: rule__BasicBinaryExpression__ResultTypeAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__BasicBinaryExpression__ResultTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7764:1: ( ( ( ruleEString ) ) )
            // InternalQL.g:7765:2: ( ( ruleEString ) )
            {
            // InternalQL.g:7765:2: ( ( ruleEString ) )
            // InternalQL.g:7766:3: ( ruleEString )
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getResultTypeValueTypeCrossReference_4_1_0()); 
            // InternalQL.g:7767:3: ( ruleEString )
            // InternalQL.g:7768:4: ruleEString
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getResultTypeValueTypeEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBasicBinaryExpressionAccess().getResultTypeValueTypeEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getBasicBinaryExpressionAccess().getResultTypeValueTypeCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__ResultTypeAssignment_4_1"


    // $ANTLR start "rule__BasicBinaryExpression__LhsOperandAssignment_6"
    // InternalQL.g:7779:1: rule__BasicBinaryExpression__LhsOperandAssignment_6 : ( ruleExpression ) ;
    public final void rule__BasicBinaryExpression__LhsOperandAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7783:1: ( ( ruleExpression ) )
            // InternalQL.g:7784:2: ( ruleExpression )
            {
            // InternalQL.g:7784:2: ( ruleExpression )
            // InternalQL.g:7785:3: ruleExpression
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getLhsOperandExpressionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getBasicBinaryExpressionAccess().getLhsOperandExpressionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__LhsOperandAssignment_6"


    // $ANTLR start "rule__BasicBinaryExpression__RhsOperandAssignment_8"
    // InternalQL.g:7794:1: rule__BasicBinaryExpression__RhsOperandAssignment_8 : ( ruleExpression ) ;
    public final void rule__BasicBinaryExpression__RhsOperandAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7798:1: ( ( ruleExpression ) )
            // InternalQL.g:7799:2: ( ruleExpression )
            {
            // InternalQL.g:7799:2: ( ruleExpression )
            // InternalQL.g:7800:3: ruleExpression
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getRhsOperandExpressionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getBasicBinaryExpressionAccess().getRhsOperandExpressionParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__RhsOperandAssignment_8"


    // $ANTLR start "rule__ConstantCall__ResultTypeAssignment_3_1"
    // InternalQL.g:7809:1: rule__ConstantCall__ResultTypeAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ConstantCall__ResultTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7813:1: ( ( ( ruleEString ) ) )
            // InternalQL.g:7814:2: ( ( ruleEString ) )
            {
            // InternalQL.g:7814:2: ( ( ruleEString ) )
            // InternalQL.g:7815:3: ( ruleEString )
            {
             before(grammarAccess.getConstantCallAccess().getResultTypeValueTypeCrossReference_3_1_0()); 
            // InternalQL.g:7816:3: ( ruleEString )
            // InternalQL.g:7817:4: ruleEString
            {
             before(grammarAccess.getConstantCallAccess().getResultTypeValueTypeEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConstantCallAccess().getResultTypeValueTypeEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getConstantCallAccess().getResultTypeValueTypeCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantCall__ResultTypeAssignment_3_1"


    // $ANTLR start "rule__ConstantCall__ValueAssignment_4_1"
    // InternalQL.g:7828:1: rule__ConstantCall__ValueAssignment_4_1 : ( ruleValue ) ;
    public final void rule__ConstantCall__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7832:1: ( ( ruleValue ) )
            // InternalQL.g:7833:2: ( ruleValue )
            {
            // InternalQL.g:7833:2: ( ruleValue )
            // InternalQL.g:7834:3: ruleValue
            {
             before(grammarAccess.getConstantCallAccess().getValueValueParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getConstantCallAccess().getValueValueParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantCall__ValueAssignment_4_1"


    // $ANTLR start "rule__BasicUnaryExpression__OperatorAssignment_2_1"
    // InternalQL.g:7843:1: rule__BasicUnaryExpression__OperatorAssignment_2_1 : ( ruleUnaryOperatorKind ) ;
    public final void rule__BasicUnaryExpression__OperatorAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7847:1: ( ( ruleUnaryOperatorKind ) )
            // InternalQL.g:7848:2: ( ruleUnaryOperatorKind )
            {
            // InternalQL.g:7848:2: ( ruleUnaryOperatorKind )
            // InternalQL.g:7849:3: ruleUnaryOperatorKind
            {
             before(grammarAccess.getBasicUnaryExpressionAccess().getOperatorUnaryOperatorKindEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryOperatorKind();

            state._fsp--;

             after(grammarAccess.getBasicUnaryExpressionAccess().getOperatorUnaryOperatorKindEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicUnaryExpression__OperatorAssignment_2_1"


    // $ANTLR start "rule__BasicUnaryExpression__ResultTypeAssignment_3_1"
    // InternalQL.g:7858:1: rule__BasicUnaryExpression__ResultTypeAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__BasicUnaryExpression__ResultTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7862:1: ( ( ( ruleEString ) ) )
            // InternalQL.g:7863:2: ( ( ruleEString ) )
            {
            // InternalQL.g:7863:2: ( ( ruleEString ) )
            // InternalQL.g:7864:3: ( ruleEString )
            {
             before(grammarAccess.getBasicUnaryExpressionAccess().getResultTypeValueTypeCrossReference_3_1_0()); 
            // InternalQL.g:7865:3: ( ruleEString )
            // InternalQL.g:7866:4: ruleEString
            {
             before(grammarAccess.getBasicUnaryExpressionAccess().getResultTypeValueTypeEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBasicUnaryExpressionAccess().getResultTypeValueTypeEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getBasicUnaryExpressionAccess().getResultTypeValueTypeCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicUnaryExpression__ResultTypeAssignment_3_1"


    // $ANTLR start "rule__BasicUnaryExpression__OperandAssignment_5"
    // InternalQL.g:7877:1: rule__BasicUnaryExpression__OperandAssignment_5 : ( ruleExpression ) ;
    public final void rule__BasicUnaryExpression__OperandAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7881:1: ( ( ruleExpression ) )
            // InternalQL.g:7882:2: ( ruleExpression )
            {
            // InternalQL.g:7882:2: ( ruleExpression )
            // InternalQL.g:7883:3: ruleExpression
            {
             before(grammarAccess.getBasicUnaryExpressionAccess().getOperandExpressionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getBasicUnaryExpressionAccess().getOperandExpressionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicUnaryExpression__OperandAssignment_5"


    // $ANTLR start "rule__QuestionCall__ResultTypeAssignment_2_1"
    // InternalQL.g:7892:1: rule__QuestionCall__ResultTypeAssignment_2_1 : ( ( ruleEString ) ) ;
    public final void rule__QuestionCall__ResultTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7896:1: ( ( ( ruleEString ) ) )
            // InternalQL.g:7897:2: ( ( ruleEString ) )
            {
            // InternalQL.g:7897:2: ( ( ruleEString ) )
            // InternalQL.g:7898:3: ( ruleEString )
            {
             before(grammarAccess.getQuestionCallAccess().getResultTypeValueTypeCrossReference_2_1_0()); 
            // InternalQL.g:7899:3: ( ruleEString )
            // InternalQL.g:7900:4: ruleEString
            {
             before(grammarAccess.getQuestionCallAccess().getResultTypeValueTypeEStringParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionCallAccess().getResultTypeValueTypeEStringParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getQuestionCallAccess().getResultTypeValueTypeCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCall__ResultTypeAssignment_2_1"


    // $ANTLR start "rule__QuestionCall__QuestionAssignment_4"
    // InternalQL.g:7911:1: rule__QuestionCall__QuestionAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__QuestionCall__QuestionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7915:1: ( ( ( ruleEString ) ) )
            // InternalQL.g:7916:2: ( ( ruleEString ) )
            {
            // InternalQL.g:7916:2: ( ( ruleEString ) )
            // InternalQL.g:7917:3: ( ruleEString )
            {
             before(grammarAccess.getQuestionCallAccess().getQuestionQuestionDefinitionCrossReference_4_0()); 
            // InternalQL.g:7918:3: ( ruleEString )
            // InternalQL.g:7919:4: ruleEString
            {
             before(grammarAccess.getQuestionCallAccess().getQuestionQuestionDefinitionEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionCallAccess().getQuestionQuestionDefinitionEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getQuestionCallAccess().getQuestionQuestionDefinitionCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCall__QuestionAssignment_4"


    // $ANTLR start "rule__BooleanValueType__NameAssignment_2"
    // InternalQL.g:7930:1: rule__BooleanValueType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__BooleanValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7934:1: ( ( ruleEString ) )
            // InternalQL.g:7935:2: ( ruleEString )
            {
            // InternalQL.g:7935:2: ( ruleEString )
            // InternalQL.g:7936:3: ruleEString
            {
             before(grammarAccess.getBooleanValueTypeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBooleanValueTypeAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__BooleanValueType__UnitAssignment_4_1"
    // InternalQL.g:7945:1: rule__BooleanValueType__UnitAssignment_4_1 : ( ruleEString ) ;
    public final void rule__BooleanValueType__UnitAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7949:1: ( ( ruleEString ) )
            // InternalQL.g:7950:2: ( ruleEString )
            {
            // InternalQL.g:7950:2: ( ruleEString )
            // InternalQL.g:7951:3: ruleEString
            {
             before(grammarAccess.getBooleanValueTypeAccess().getUnitEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBooleanValueTypeAccess().getUnitEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__UnitAssignment_4_1"


    // $ANTLR start "rule__IntegerValueType__NameAssignment_2"
    // InternalQL.g:7960:1: rule__IntegerValueType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__IntegerValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7964:1: ( ( ruleEString ) )
            // InternalQL.g:7965:2: ( ruleEString )
            {
            // InternalQL.g:7965:2: ( ruleEString )
            // InternalQL.g:7966:3: ruleEString
            {
             before(grammarAccess.getIntegerValueTypeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIntegerValueTypeAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__IntegerValueType__UnitAssignment_4_1"
    // InternalQL.g:7975:1: rule__IntegerValueType__UnitAssignment_4_1 : ( ruleEString ) ;
    public final void rule__IntegerValueType__UnitAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7979:1: ( ( ruleEString ) )
            // InternalQL.g:7980:2: ( ruleEString )
            {
            // InternalQL.g:7980:2: ( ruleEString )
            // InternalQL.g:7981:3: ruleEString
            {
             before(grammarAccess.getIntegerValueTypeAccess().getUnitEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIntegerValueTypeAccess().getUnitEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__UnitAssignment_4_1"


    // $ANTLR start "rule__IntegerValueType__MinAssignment_5_1"
    // InternalQL.g:7990:1: rule__IntegerValueType__MinAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__IntegerValueType__MinAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7994:1: ( ( ruleEInt ) )
            // InternalQL.g:7995:2: ( ruleEInt )
            {
            // InternalQL.g:7995:2: ( ruleEInt )
            // InternalQL.g:7996:3: ruleEInt
            {
             before(grammarAccess.getIntegerValueTypeAccess().getMinEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIntegerValueTypeAccess().getMinEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__MinAssignment_5_1"


    // $ANTLR start "rule__IntegerValueType__MaxAssignment_6_1"
    // InternalQL.g:8005:1: rule__IntegerValueType__MaxAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__IntegerValueType__MaxAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8009:1: ( ( ruleEInt ) )
            // InternalQL.g:8010:2: ( ruleEInt )
            {
            // InternalQL.g:8010:2: ( ruleEInt )
            // InternalQL.g:8011:3: ruleEInt
            {
             before(grammarAccess.getIntegerValueTypeAccess().getMaxEIntParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIntegerValueTypeAccess().getMaxEIntParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__MaxAssignment_6_1"


    // $ANTLR start "rule__DecimalValueType__NameAssignment_2"
    // InternalQL.g:8020:1: rule__DecimalValueType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__DecimalValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8024:1: ( ( ruleEString ) )
            // InternalQL.g:8025:2: ( ruleEString )
            {
            // InternalQL.g:8025:2: ( ruleEString )
            // InternalQL.g:8026:3: ruleEString
            {
             before(grammarAccess.getDecimalValueTypeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDecimalValueTypeAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__DecimalValueType__UnitAssignment_4_1"
    // InternalQL.g:8035:1: rule__DecimalValueType__UnitAssignment_4_1 : ( ruleEString ) ;
    public final void rule__DecimalValueType__UnitAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8039:1: ( ( ruleEString ) )
            // InternalQL.g:8040:2: ( ruleEString )
            {
            // InternalQL.g:8040:2: ( ruleEString )
            // InternalQL.g:8041:3: ruleEString
            {
             before(grammarAccess.getDecimalValueTypeAccess().getUnitEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDecimalValueTypeAccess().getUnitEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__UnitAssignment_4_1"


    // $ANTLR start "rule__DateValueType__NameAssignment_2"
    // InternalQL.g:8050:1: rule__DateValueType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__DateValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8054:1: ( ( ruleEString ) )
            // InternalQL.g:8055:2: ( ruleEString )
            {
            // InternalQL.g:8055:2: ( ruleEString )
            // InternalQL.g:8056:3: ruleEString
            {
             before(grammarAccess.getDateValueTypeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDateValueTypeAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__DateValueType__UnitAssignment_4_1"
    // InternalQL.g:8065:1: rule__DateValueType__UnitAssignment_4_1 : ( ruleEString ) ;
    public final void rule__DateValueType__UnitAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8069:1: ( ( ruleEString ) )
            // InternalQL.g:8070:2: ( ruleEString )
            {
            // InternalQL.g:8070:2: ( ruleEString )
            // InternalQL.g:8071:3: ruleEString
            {
             before(grammarAccess.getDateValueTypeAccess().getUnitEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDateValueTypeAccess().getUnitEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__UnitAssignment_4_1"


    // $ANTLR start "rule__EnumerationValueType__NameAssignment_2"
    // InternalQL.g:8080:1: rule__EnumerationValueType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__EnumerationValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8084:1: ( ( ruleEString ) )
            // InternalQL.g:8085:2: ( ruleEString )
            {
            // InternalQL.g:8085:2: ( ruleEString )
            // InternalQL.g:8086:3: ruleEString
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnumerationValueTypeAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__EnumerationValueType__UnitAssignment_4_1"
    // InternalQL.g:8095:1: rule__EnumerationValueType__UnitAssignment_4_1 : ( ruleEString ) ;
    public final void rule__EnumerationValueType__UnitAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8099:1: ( ( ruleEString ) )
            // InternalQL.g:8100:2: ( ruleEString )
            {
            // InternalQL.g:8100:2: ( ruleEString )
            // InternalQL.g:8101:3: ruleEString
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getUnitEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnumerationValueTypeAccess().getUnitEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__UnitAssignment_4_1"


    // $ANTLR start "rule__EnumerationValueType__EnumerationLiteralsAssignment_5_2"
    // InternalQL.g:8110:1: rule__EnumerationValueType__EnumerationLiteralsAssignment_5_2 : ( ruleEnumerationLiteral ) ;
    public final void rule__EnumerationValueType__EnumerationLiteralsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8114:1: ( ( ruleEnumerationLiteral ) )
            // InternalQL.g:8115:2: ( ruleEnumerationLiteral )
            {
            // InternalQL.g:8115:2: ( ruleEnumerationLiteral )
            // InternalQL.g:8116:3: ruleEnumerationLiteral
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumerationLiteral();

            state._fsp--;

             after(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__EnumerationLiteralsAssignment_5_2"


    // $ANTLR start "rule__EnumerationValueType__EnumerationLiteralsAssignment_5_3_1"
    // InternalQL.g:8125:1: rule__EnumerationValueType__EnumerationLiteralsAssignment_5_3_1 : ( ruleEnumerationLiteral ) ;
    public final void rule__EnumerationValueType__EnumerationLiteralsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8129:1: ( ( ruleEnumerationLiteral ) )
            // InternalQL.g:8130:2: ( ruleEnumerationLiteral )
            {
            // InternalQL.g:8130:2: ( ruleEnumerationLiteral )
            // InternalQL.g:8131:3: ruleEnumerationLiteral
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumerationLiteral();

            state._fsp--;

             after(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__EnumerationLiteralsAssignment_5_3_1"


    // $ANTLR start "rule__StringValueType__NameAssignment_2"
    // InternalQL.g:8140:1: rule__StringValueType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__StringValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8144:1: ( ( ruleEString ) )
            // InternalQL.g:8145:2: ( ruleEString )
            {
            // InternalQL.g:8145:2: ( ruleEString )
            // InternalQL.g:8146:3: ruleEString
            {
             before(grammarAccess.getStringValueTypeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStringValueTypeAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__StringValueType__UnitAssignment_4_1"
    // InternalQL.g:8155:1: rule__StringValueType__UnitAssignment_4_1 : ( ruleEString ) ;
    public final void rule__StringValueType__UnitAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8159:1: ( ( ruleEString ) )
            // InternalQL.g:8160:2: ( ruleEString )
            {
            // InternalQL.g:8160:2: ( ruleEString )
            // InternalQL.g:8161:3: ruleEString
            {
             before(grammarAccess.getStringValueTypeAccess().getUnitEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStringValueTypeAccess().getUnitEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__UnitAssignment_4_1"


    // $ANTLR start "rule__EnumerationLiteral__NameAssignment_2"
    // InternalQL.g:8170:1: rule__EnumerationLiteral__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__EnumerationLiteral__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8174:1: ( ( ruleEString ) )
            // InternalQL.g:8175:2: ( ruleEString )
            {
            // InternalQL.g:8175:2: ( ruleEString )
            // InternalQL.g:8176:3: ruleEString
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnumerationLiteralAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__NameAssignment_2"


    // $ANTLR start "rule__IntegerValue__IntValueAssignment_3_1"
    // InternalQL.g:8185:1: rule__IntegerValue__IntValueAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__IntegerValue__IntValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8189:1: ( ( ruleEInt ) )
            // InternalQL.g:8190:2: ( ruleEInt )
            {
            // InternalQL.g:8190:2: ( ruleEInt )
            // InternalQL.g:8191:3: ruleEInt
            {
             before(grammarAccess.getIntegerValueAccess().getIntValueEIntParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIntegerValueAccess().getIntValueEIntParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__IntValueAssignment_3_1"


    // $ANTLR start "rule__StringValue__StringValueAssignment_3_1"
    // InternalQL.g:8200:1: rule__StringValue__StringValueAssignment_3_1 : ( ruleEString ) ;
    public final void rule__StringValue__StringValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8204:1: ( ( ruleEString ) )
            // InternalQL.g:8205:2: ( ruleEString )
            {
            // InternalQL.g:8205:2: ( ruleEString )
            // InternalQL.g:8206:3: ruleEString
            {
             before(grammarAccess.getStringValueAccess().getStringValueEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStringValueAccess().getStringValueEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__StringValueAssignment_3_1"


    // $ANTLR start "rule__BooleanValue__BooleanValueAssignment_1"
    // InternalQL.g:8215:1: rule__BooleanValue__BooleanValueAssignment_1 : ( ( 'booleanValue' ) ) ;
    public final void rule__BooleanValue__BooleanValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8219:1: ( ( ( 'booleanValue' ) ) )
            // InternalQL.g:8220:2: ( ( 'booleanValue' ) )
            {
            // InternalQL.g:8220:2: ( ( 'booleanValue' ) )
            // InternalQL.g:8221:3: ( 'booleanValue' )
            {
             before(grammarAccess.getBooleanValueAccess().getBooleanValueBooleanValueKeyword_1_0()); 
            // InternalQL.g:8222:3: ( 'booleanValue' )
            // InternalQL.g:8223:4: 'booleanValue'
            {
             before(grammarAccess.getBooleanValueAccess().getBooleanValueBooleanValueKeyword_1_0()); 
            match(input,84,FOLLOW_2); 
             after(grammarAccess.getBooleanValueAccess().getBooleanValueBooleanValueKeyword_1_0()); 

            }

             after(grammarAccess.getBooleanValueAccess().getBooleanValueBooleanValueKeyword_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__DateValue__DateValueAssignment_3_1"
    // InternalQL.g:8234:1: rule__DateValue__DateValueAssignment_3_1 : ( ruleEDate ) ;
    public final void rule__DateValue__DateValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8238:1: ( ( ruleEDate ) )
            // InternalQL.g:8239:2: ( ruleEDate )
            {
            // InternalQL.g:8239:2: ( ruleEDate )
            // InternalQL.g:8240:3: ruleEDate
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


    // $ANTLR start "rule__DecimalValue__DecimalValueAssignment_3_1"
    // InternalQL.g:8249:1: rule__DecimalValue__DecimalValueAssignment_3_1 : ( ruleEFloat ) ;
    public final void rule__DecimalValue__DecimalValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8253:1: ( ( ruleEFloat ) )
            // InternalQL.g:8254:2: ( ruleEFloat )
            {
            // InternalQL.g:8254:2: ( ruleEFloat )
            // InternalQL.g:8255:3: ruleEFloat
            {
             before(grammarAccess.getDecimalValueAccess().getDecimalValueEFloatParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getDecimalValueAccess().getDecimalValueEFloatParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValue__DecimalValueAssignment_3_1"


    // $ANTLR start "rule__QuestionDefinition__IsDisplayedAssignment_0"
    // InternalQL.g:8264:1: rule__QuestionDefinition__IsDisplayedAssignment_0 : ( ( 'isDisplayed' ) ) ;
    public final void rule__QuestionDefinition__IsDisplayedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8268:1: ( ( ( 'isDisplayed' ) ) )
            // InternalQL.g:8269:2: ( ( 'isDisplayed' ) )
            {
            // InternalQL.g:8269:2: ( ( 'isDisplayed' ) )
            // InternalQL.g:8270:3: ( 'isDisplayed' )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getIsDisplayedIsDisplayedKeyword_0_0()); 
            // InternalQL.g:8271:3: ( 'isDisplayed' )
            // InternalQL.g:8272:4: 'isDisplayed'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getIsDisplayedIsDisplayedKeyword_0_0()); 
            match(input,85,FOLLOW_2); 
             after(grammarAccess.getQuestionDefinitionAccess().getIsDisplayedIsDisplayedKeyword_0_0()); 

            }

             after(grammarAccess.getQuestionDefinitionAccess().getIsDisplayedIsDisplayedKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__IsDisplayedAssignment_0"


    // $ANTLR start "rule__QuestionDefinition__IsMandatoryAssignment_1"
    // InternalQL.g:8283:1: rule__QuestionDefinition__IsMandatoryAssignment_1 : ( ( 'isMandatory' ) ) ;
    public final void rule__QuestionDefinition__IsMandatoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8287:1: ( ( ( 'isMandatory' ) ) )
            // InternalQL.g:8288:2: ( ( 'isMandatory' ) )
            {
            // InternalQL.g:8288:2: ( ( 'isMandatory' ) )
            // InternalQL.g:8289:3: ( 'isMandatory' )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getIsMandatoryIsMandatoryKeyword_1_0()); 
            // InternalQL.g:8290:3: ( 'isMandatory' )
            // InternalQL.g:8291:4: 'isMandatory'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getIsMandatoryIsMandatoryKeyword_1_0()); 
            match(input,86,FOLLOW_2); 
             after(grammarAccess.getQuestionDefinitionAccess().getIsMandatoryIsMandatoryKeyword_1_0()); 

            }

             after(grammarAccess.getQuestionDefinitionAccess().getIsMandatoryIsMandatoryKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__IsMandatoryAssignment_1"


    // $ANTLR start "rule__QuestionDefinition__NameAssignment_3"
    // InternalQL.g:8302:1: rule__QuestionDefinition__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__QuestionDefinition__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8306:1: ( ( ruleEString ) )
            // InternalQL.g:8307:2: ( ruleEString )
            {
            // InternalQL.g:8307:2: ( ruleEString )
            // InternalQL.g:8308:3: ruleEString
            {
             before(grammarAccess.getQuestionDefinitionAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionDefinitionAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__NameAssignment_3"


    // $ANTLR start "rule__QuestionDefinition__LabelAssignment_5_1"
    // InternalQL.g:8317:1: rule__QuestionDefinition__LabelAssignment_5_1 : ( ruleEString ) ;
    public final void rule__QuestionDefinition__LabelAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8321:1: ( ( ruleEString ) )
            // InternalQL.g:8322:2: ( ruleEString )
            {
            // InternalQL.g:8322:2: ( ruleEString )
            // InternalQL.g:8323:3: ruleEString
            {
             before(grammarAccess.getQuestionDefinitionAccess().getLabelEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionDefinitionAccess().getLabelEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__LabelAssignment_5_1"


    // $ANTLR start "rule__QuestionDefinition__DataTypeAssignment_7"
    // InternalQL.g:8332:1: rule__QuestionDefinition__DataTypeAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__QuestionDefinition__DataTypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8336:1: ( ( ( ruleEString ) ) )
            // InternalQL.g:8337:2: ( ( ruleEString ) )
            {
            // InternalQL.g:8337:2: ( ( ruleEString ) )
            // InternalQL.g:8338:3: ( ruleEString )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getDataTypeValueTypeCrossReference_7_0()); 
            // InternalQL.g:8339:3: ( ruleEString )
            // InternalQL.g:8340:4: ruleEString
            {
             before(grammarAccess.getQuestionDefinitionAccess().getDataTypeValueTypeEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionDefinitionAccess().getDataTypeValueTypeEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getQuestionDefinitionAccess().getDataTypeValueTypeCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__DataTypeAssignment_7"


    // $ANTLR start "rule__QuestionDefinition__ComputedExpressionAssignment_8_1"
    // InternalQL.g:8351:1: rule__QuestionDefinition__ComputedExpressionAssignment_8_1 : ( ruleExpression ) ;
    public final void rule__QuestionDefinition__ComputedExpressionAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8355:1: ( ( ruleExpression ) )
            // InternalQL.g:8356:2: ( ruleExpression )
            {
            // InternalQL.g:8356:2: ( ruleExpression )
            // InternalQL.g:8357:3: ruleExpression
            {
             before(grammarAccess.getQuestionDefinitionAccess().getComputedExpressionExpressionParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getQuestionDefinitionAccess().getComputedExpressionExpressionParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__ComputedExpressionAssignment_8_1"


    // $ANTLR start "rule__QuestionDefinition__CurrentValueAssignment_9_1"
    // InternalQL.g:8366:1: rule__QuestionDefinition__CurrentValueAssignment_9_1 : ( ruleValue ) ;
    public final void rule__QuestionDefinition__CurrentValueAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8370:1: ( ( ruleValue ) )
            // InternalQL.g:8371:2: ( ruleValue )
            {
            // InternalQL.g:8371:2: ( ruleValue )
            // InternalQL.g:8372:3: ruleValue
            {
             before(grammarAccess.getQuestionDefinitionAccess().getCurrentValueValueParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getQuestionDefinitionAccess().getCurrentValueValueParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__CurrentValueAssignment_9_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000010000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000005C0000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000240000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0xE600100040000000L,0x0000000000604002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0xE600100000000002L,0x0000000000604002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000038040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00A8400000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000200040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000003FFC000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0014000040000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100B50L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0044800000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0104000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x1800200040000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000004L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000200040000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0xE600100000000000L,0x0000000000604002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100100L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000040000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000040L,0x0000000000002004L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000604000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000040000000L,0x0000000000060000L});

}