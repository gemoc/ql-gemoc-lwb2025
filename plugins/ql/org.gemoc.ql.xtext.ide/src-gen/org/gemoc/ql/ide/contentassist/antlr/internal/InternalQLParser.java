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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'EDate'", "'E'", "'e'", "'PLUS'", "'MINUS'", "'MULT'", "'DIV'", "'EQUAL'", "'NOTEQUAL'", "'GREATER'", "'LOWER'", "'GREATEROREQUAL'", "'LOWEROREQUAL'", "'AND'", "'OR'", "'UNARYMINUS'", "'NOT'", "'QLModel'", "'{'", "'}'", "'('", "')'", "'submitDate'", "'Form'", "'definitions'", "'if'", "'ValueType'", "'unit'", "'BasicBinaryExpression'", "'operator'", "'lhsOperand'", "'rhsOperand'", "'resultType'", "'ConstantCall'", "'value'", "'BasicUnaryExpression'", "'operand'", "'QuestionCall'", "'question'", "'booleanType'", "'integerType'", "'min'", "'max'", "'decimalType'", "'dateType'", "'enumerationType'", "'literals'", "','", "'StringValueType'", "'-'", "'IntegerValue'", "'intValue'", "'StringValue'", "'stringValue'", "'BooleanValue'", "'DateValue'", "'dateValue'", "'DecimalValue'", "'decimalValue'", "'.'", "':'", "'='", "';'", "'canSubmit'", "'booleanValue'", "'mandatory'"
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
    // InternalQL.g:287:1: ruleQuestion : ( ( rule__Question__QuestionDefinitionAssignment ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:291:2: ( ( ( rule__Question__QuestionDefinitionAssignment ) ) )
            // InternalQL.g:292:2: ( ( rule__Question__QuestionDefinitionAssignment ) )
            {
            // InternalQL.g:292:2: ( ( rule__Question__QuestionDefinitionAssignment ) )
            // InternalQL.g:293:3: ( rule__Question__QuestionDefinitionAssignment )
            {
             before(grammarAccess.getQuestionAccess().getQuestionDefinitionAssignment()); 
            // InternalQL.g:294:3: ( rule__Question__QuestionDefinitionAssignment )
            // InternalQL.g:294:4: rule__Question__QuestionDefinitionAssignment
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


    // $ANTLR start "rule__QLModel__Alternatives_4"
    // InternalQL.g:834:1: rule__QLModel__Alternatives_4 : ( ( ( rule__QLModel__DefinitionGroupAssignment_4_0 ) ) | ( ( rule__QLModel__FormsAssignment_4_1 ) ) );
    public final void rule__QLModel__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:838:1: ( ( ( rule__QLModel__DefinitionGroupAssignment_4_0 ) ) | ( ( rule__QLModel__FormsAssignment_4_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==35) ) {
                alt1=1;
            }
            else if ( (LA1_0==34) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalQL.g:839:2: ( ( rule__QLModel__DefinitionGroupAssignment_4_0 ) )
                    {
                    // InternalQL.g:839:2: ( ( rule__QLModel__DefinitionGroupAssignment_4_0 ) )
                    // InternalQL.g:840:3: ( rule__QLModel__DefinitionGroupAssignment_4_0 )
                    {
                     before(grammarAccess.getQLModelAccess().getDefinitionGroupAssignment_4_0()); 
                    // InternalQL.g:841:3: ( rule__QLModel__DefinitionGroupAssignment_4_0 )
                    // InternalQL.g:841:4: rule__QLModel__DefinitionGroupAssignment_4_0
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
                    // InternalQL.g:845:2: ( ( rule__QLModel__FormsAssignment_4_1 ) )
                    {
                    // InternalQL.g:845:2: ( ( rule__QLModel__FormsAssignment_4_1 ) )
                    // InternalQL.g:846:3: ( rule__QLModel__FormsAssignment_4_1 )
                    {
                     before(grammarAccess.getQLModelAccess().getFormsAssignment_4_1()); 
                    // InternalQL.g:847:3: ( rule__QLModel__FormsAssignment_4_1 )
                    // InternalQL.g:847:4: rule__QLModel__FormsAssignment_4_1
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
    // InternalQL.g:855:1: rule__ValueType__Alternatives : ( ( ruleValueType_Impl ) | ( ruleBooleanValueType ) | ( ruleIntegerValueType ) | ( ruleDecimalValueType ) | ( ruleDateValueType ) | ( ruleEnumerationValueType ) | ( ruleStringValueType ) );
    public final void rule__ValueType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:859:1: ( ( ruleValueType_Impl ) | ( ruleBooleanValueType ) | ( ruleIntegerValueType ) | ( ruleDecimalValueType ) | ( ruleDateValueType ) | ( ruleEnumerationValueType ) | ( ruleStringValueType ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt2=1;
                }
                break;
            case 50:
                {
                alt2=2;
                }
                break;
            case 51:
                {
                alt2=3;
                }
                break;
            case 54:
                {
                alt2=4;
                }
                break;
            case 55:
                {
                alt2=5;
                }
                break;
            case 56:
                {
                alt2=6;
                }
                break;
            case 59:
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
                    // InternalQL.g:860:2: ( ruleValueType_Impl )
                    {
                    // InternalQL.g:860:2: ( ruleValueType_Impl )
                    // InternalQL.g:861:3: ruleValueType_Impl
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
                    // InternalQL.g:866:2: ( ruleBooleanValueType )
                    {
                    // InternalQL.g:866:2: ( ruleBooleanValueType )
                    // InternalQL.g:867:3: ruleBooleanValueType
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
                    // InternalQL.g:872:2: ( ruleIntegerValueType )
                    {
                    // InternalQL.g:872:2: ( ruleIntegerValueType )
                    // InternalQL.g:873:3: ruleIntegerValueType
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
                    // InternalQL.g:878:2: ( ruleDecimalValueType )
                    {
                    // InternalQL.g:878:2: ( ruleDecimalValueType )
                    // InternalQL.g:879:3: ruleDecimalValueType
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
                    // InternalQL.g:884:2: ( ruleDateValueType )
                    {
                    // InternalQL.g:884:2: ( ruleDateValueType )
                    // InternalQL.g:885:3: ruleDateValueType
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
                    // InternalQL.g:890:2: ( ruleEnumerationValueType )
                    {
                    // InternalQL.g:890:2: ( ruleEnumerationValueType )
                    // InternalQL.g:891:3: ruleEnumerationValueType
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
                    // InternalQL.g:896:2: ( ruleStringValueType )
                    {
                    // InternalQL.g:896:2: ( ruleStringValueType )
                    // InternalQL.g:897:3: ruleStringValueType
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
    // InternalQL.g:906:1: rule__Expression__Alternatives : ( ( ruleBasicBinaryExpression ) | ( ruleConstantCall ) | ( ruleBasicUnaryExpression ) | ( ruleQuestionCall ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:910:1: ( ( ruleBasicBinaryExpression ) | ( ruleConstantCall ) | ( ruleBasicUnaryExpression ) | ( ruleQuestionCall ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt3=1;
                }
                break;
            case 44:
                {
                alt3=2;
                }
                break;
            case 46:
                {
                alt3=3;
                }
                break;
            case 48:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalQL.g:911:2: ( ruleBasicBinaryExpression )
                    {
                    // InternalQL.g:911:2: ( ruleBasicBinaryExpression )
                    // InternalQL.g:912:3: ruleBasicBinaryExpression
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
                    // InternalQL.g:917:2: ( ruleConstantCall )
                    {
                    // InternalQL.g:917:2: ( ruleConstantCall )
                    // InternalQL.g:918:3: ruleConstantCall
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
                    // InternalQL.g:923:2: ( ruleBasicUnaryExpression )
                    {
                    // InternalQL.g:923:2: ( ruleBasicUnaryExpression )
                    // InternalQL.g:924:3: ruleBasicUnaryExpression
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
                    // InternalQL.g:929:2: ( ruleQuestionCall )
                    {
                    // InternalQL.g:929:2: ( ruleQuestionCall )
                    // InternalQL.g:930:3: ruleQuestionCall
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
    // InternalQL.g:939:1: rule__Value__Alternatives : ( ( ruleIntegerValue ) | ( ruleStringValue ) | ( ruleBooleanValue ) | ( ruleDateValue ) | ( ruleDecimalValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:943:1: ( ( ruleIntegerValue ) | ( ruleStringValue ) | ( ruleBooleanValue ) | ( ruleDateValue ) | ( ruleDecimalValue ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt4=1;
                }
                break;
            case 63:
                {
                alt4=2;
                }
                break;
            case 65:
            case 75:
                {
                alt4=3;
                }
                break;
            case 66:
                {
                alt4=4;
                }
                break;
            case 68:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalQL.g:944:2: ( ruleIntegerValue )
                    {
                    // InternalQL.g:944:2: ( ruleIntegerValue )
                    // InternalQL.g:945:3: ruleIntegerValue
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
                    // InternalQL.g:950:2: ( ruleStringValue )
                    {
                    // InternalQL.g:950:2: ( ruleStringValue )
                    // InternalQL.g:951:3: ruleStringValue
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
                    // InternalQL.g:956:2: ( ruleBooleanValue )
                    {
                    // InternalQL.g:956:2: ( ruleBooleanValue )
                    // InternalQL.g:957:3: ruleBooleanValue
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
                    // InternalQL.g:962:2: ( ruleDateValue )
                    {
                    // InternalQL.g:962:2: ( ruleDateValue )
                    // InternalQL.g:963:3: ruleDateValue
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
                    // InternalQL.g:968:2: ( ruleDecimalValue )
                    {
                    // InternalQL.g:968:2: ( ruleDecimalValue )
                    // InternalQL.g:969:3: ruleDecimalValue
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
    // InternalQL.g:978:1: rule__DefinitionGroup__Alternatives_3 : ( ( ( rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0 ) ) | ( ( rule__DefinitionGroup__DataTypesAssignment_3_1 ) ) );
    public final void rule__DefinitionGroup__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:982:1: ( ( ( rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0 ) ) | ( ( rule__DefinitionGroup__DataTypesAssignment_3_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==49||LA5_0==76) ) {
                alt5=1;
            }
            else if ( (LA5_0==37||(LA5_0>=50 && LA5_0<=51)||(LA5_0>=54 && LA5_0<=56)||LA5_0==59) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalQL.g:983:2: ( ( rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0 ) )
                    {
                    // InternalQL.g:983:2: ( ( rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0 ) )
                    // InternalQL.g:984:3: ( rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0 )
                    {
                     before(grammarAccess.getDefinitionGroupAccess().getQuestionDefinitionsAssignment_3_0()); 
                    // InternalQL.g:985:3: ( rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0 )
                    // InternalQL.g:985:4: rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0
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
                    // InternalQL.g:989:2: ( ( rule__DefinitionGroup__DataTypesAssignment_3_1 ) )
                    {
                    // InternalQL.g:989:2: ( ( rule__DefinitionGroup__DataTypesAssignment_3_1 ) )
                    // InternalQL.g:990:3: ( rule__DefinitionGroup__DataTypesAssignment_3_1 )
                    {
                     before(grammarAccess.getDefinitionGroupAccess().getDataTypesAssignment_3_1()); 
                    // InternalQL.g:991:3: ( rule__DefinitionGroup__DataTypesAssignment_3_1 )
                    // InternalQL.g:991:4: rule__DefinitionGroup__DataTypesAssignment_3_1
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
    // InternalQL.g:999:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1003:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalQL.g:1004:2: ( RULE_STRING )
                    {
                    // InternalQL.g:1004:2: ( RULE_STRING )
                    // InternalQL.g:1005:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:1010:2: ( RULE_ID )
                    {
                    // InternalQL.g:1010:2: ( RULE_ID )
                    // InternalQL.g:1011:3: RULE_ID
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
    // InternalQL.g:1020:1: rule__QuestionGroup__Alternatives_3 : ( ( ( rule__QuestionGroup__QuestionGroupsAssignment_3_0 ) ) | ( ( rule__QuestionGroup__QuestionsAssignment_3_1 ) ) );
    public final void rule__QuestionGroup__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1024:1: ( ( ( rule__QuestionGroup__QuestionGroupsAssignment_3_0 ) ) | ( ( rule__QuestionGroup__QuestionsAssignment_3_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==29||LA7_0==36) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalQL.g:1025:2: ( ( rule__QuestionGroup__QuestionGroupsAssignment_3_0 ) )
                    {
                    // InternalQL.g:1025:2: ( ( rule__QuestionGroup__QuestionGroupsAssignment_3_0 ) )
                    // InternalQL.g:1026:3: ( rule__QuestionGroup__QuestionGroupsAssignment_3_0 )
                    {
                     before(grammarAccess.getQuestionGroupAccess().getQuestionGroupsAssignment_3_0()); 
                    // InternalQL.g:1027:3: ( rule__QuestionGroup__QuestionGroupsAssignment_3_0 )
                    // InternalQL.g:1027:4: rule__QuestionGroup__QuestionGroupsAssignment_3_0
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
                    // InternalQL.g:1031:2: ( ( rule__QuestionGroup__QuestionsAssignment_3_1 ) )
                    {
                    // InternalQL.g:1031:2: ( ( rule__QuestionGroup__QuestionsAssignment_3_1 ) )
                    // InternalQL.g:1032:3: ( rule__QuestionGroup__QuestionsAssignment_3_1 )
                    {
                     before(grammarAccess.getQuestionGroupAccess().getQuestionsAssignment_3_1()); 
                    // InternalQL.g:1033:3: ( rule__QuestionGroup__QuestionsAssignment_3_1 )
                    // InternalQL.g:1033:4: rule__QuestionGroup__QuestionsAssignment_3_1
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


    // $ANTLR start "rule__EFloat__Alternatives_4_0"
    // InternalQL.g:1041:1: rule__EFloat__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EFloat__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1045:1: ( ( 'E' ) | ( 'e' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==12) ) {
                alt8=1;
            }
            else if ( (LA8_0==13) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalQL.g:1046:2: ( 'E' )
                    {
                    // InternalQL.g:1046:2: ( 'E' )
                    // InternalQL.g:1047:3: 'E'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:1052:2: ( 'e' )
                    {
                    // InternalQL.g:1052:2: ( 'e' )
                    // InternalQL.g:1053:3: 'e'
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
    // InternalQL.g:1062:1: rule__BinaryOperatorKind__Alternatives : ( ( ( 'PLUS' ) ) | ( ( 'MINUS' ) ) | ( ( 'MULT' ) ) | ( ( 'DIV' ) ) | ( ( 'EQUAL' ) ) | ( ( 'NOTEQUAL' ) ) | ( ( 'GREATER' ) ) | ( ( 'LOWER' ) ) | ( ( 'GREATEROREQUAL' ) ) | ( ( 'LOWEROREQUAL' ) ) | ( ( 'AND' ) ) | ( ( 'OR' ) ) );
    public final void rule__BinaryOperatorKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1066:1: ( ( ( 'PLUS' ) ) | ( ( 'MINUS' ) ) | ( ( 'MULT' ) ) | ( ( 'DIV' ) ) | ( ( 'EQUAL' ) ) | ( ( 'NOTEQUAL' ) ) | ( ( 'GREATER' ) ) | ( ( 'LOWER' ) ) | ( ( 'GREATEROREQUAL' ) ) | ( ( 'LOWEROREQUAL' ) ) | ( ( 'AND' ) ) | ( ( 'OR' ) ) )
            int alt9=12;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt9=1;
                }
                break;
            case 15:
                {
                alt9=2;
                }
                break;
            case 16:
                {
                alt9=3;
                }
                break;
            case 17:
                {
                alt9=4;
                }
                break;
            case 18:
                {
                alt9=5;
                }
                break;
            case 19:
                {
                alt9=6;
                }
                break;
            case 20:
                {
                alt9=7;
                }
                break;
            case 21:
                {
                alt9=8;
                }
                break;
            case 22:
                {
                alt9=9;
                }
                break;
            case 23:
                {
                alt9=10;
                }
                break;
            case 24:
                {
                alt9=11;
                }
                break;
            case 25:
                {
                alt9=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalQL.g:1067:2: ( ( 'PLUS' ) )
                    {
                    // InternalQL.g:1067:2: ( ( 'PLUS' ) )
                    // InternalQL.g:1068:3: ( 'PLUS' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getPLUSEnumLiteralDeclaration_0()); 
                    // InternalQL.g:1069:3: ( 'PLUS' )
                    // InternalQL.g:1069:4: 'PLUS'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getPLUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:1073:2: ( ( 'MINUS' ) )
                    {
                    // InternalQL.g:1073:2: ( ( 'MINUS' ) )
                    // InternalQL.g:1074:3: ( 'MINUS' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getMINUSEnumLiteralDeclaration_1()); 
                    // InternalQL.g:1075:3: ( 'MINUS' )
                    // InternalQL.g:1075:4: 'MINUS'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getMINUSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQL.g:1079:2: ( ( 'MULT' ) )
                    {
                    // InternalQL.g:1079:2: ( ( 'MULT' ) )
                    // InternalQL.g:1080:3: ( 'MULT' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getMULTEnumLiteralDeclaration_2()); 
                    // InternalQL.g:1081:3: ( 'MULT' )
                    // InternalQL.g:1081:4: 'MULT'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getMULTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQL.g:1085:2: ( ( 'DIV' ) )
                    {
                    // InternalQL.g:1085:2: ( ( 'DIV' ) )
                    // InternalQL.g:1086:3: ( 'DIV' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getDIVEnumLiteralDeclaration_3()); 
                    // InternalQL.g:1087:3: ( 'DIV' )
                    // InternalQL.g:1087:4: 'DIV'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getDIVEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalQL.g:1091:2: ( ( 'EQUAL' ) )
                    {
                    // InternalQL.g:1091:2: ( ( 'EQUAL' ) )
                    // InternalQL.g:1092:3: ( 'EQUAL' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getEQUALEnumLiteralDeclaration_4()); 
                    // InternalQL.g:1093:3: ( 'EQUAL' )
                    // InternalQL.g:1093:4: 'EQUAL'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getEQUALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalQL.g:1097:2: ( ( 'NOTEQUAL' ) )
                    {
                    // InternalQL.g:1097:2: ( ( 'NOTEQUAL' ) )
                    // InternalQL.g:1098:3: ( 'NOTEQUAL' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getNOTEQUALEnumLiteralDeclaration_5()); 
                    // InternalQL.g:1099:3: ( 'NOTEQUAL' )
                    // InternalQL.g:1099:4: 'NOTEQUAL'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getNOTEQUALEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalQL.g:1103:2: ( ( 'GREATER' ) )
                    {
                    // InternalQL.g:1103:2: ( ( 'GREATER' ) )
                    // InternalQL.g:1104:3: ( 'GREATER' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getGREATEREnumLiteralDeclaration_6()); 
                    // InternalQL.g:1105:3: ( 'GREATER' )
                    // InternalQL.g:1105:4: 'GREATER'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getGREATEREnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalQL.g:1109:2: ( ( 'LOWER' ) )
                    {
                    // InternalQL.g:1109:2: ( ( 'LOWER' ) )
                    // InternalQL.g:1110:3: ( 'LOWER' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getLOWEREnumLiteralDeclaration_7()); 
                    // InternalQL.g:1111:3: ( 'LOWER' )
                    // InternalQL.g:1111:4: 'LOWER'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getLOWEREnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalQL.g:1115:2: ( ( 'GREATEROREQUAL' ) )
                    {
                    // InternalQL.g:1115:2: ( ( 'GREATEROREQUAL' ) )
                    // InternalQL.g:1116:3: ( 'GREATEROREQUAL' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_8()); 
                    // InternalQL.g:1117:3: ( 'GREATEROREQUAL' )
                    // InternalQL.g:1117:4: 'GREATEROREQUAL'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalQL.g:1121:2: ( ( 'LOWEROREQUAL' ) )
                    {
                    // InternalQL.g:1121:2: ( ( 'LOWEROREQUAL' ) )
                    // InternalQL.g:1122:3: ( 'LOWEROREQUAL' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getLOWEROREQUALEnumLiteralDeclaration_9()); 
                    // InternalQL.g:1123:3: ( 'LOWEROREQUAL' )
                    // InternalQL.g:1123:4: 'LOWEROREQUAL'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getLOWEROREQUALEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalQL.g:1127:2: ( ( 'AND' ) )
                    {
                    // InternalQL.g:1127:2: ( ( 'AND' ) )
                    // InternalQL.g:1128:3: ( 'AND' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getANDEnumLiteralDeclaration_10()); 
                    // InternalQL.g:1129:3: ( 'AND' )
                    // InternalQL.g:1129:4: 'AND'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getANDEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalQL.g:1133:2: ( ( 'OR' ) )
                    {
                    // InternalQL.g:1133:2: ( ( 'OR' ) )
                    // InternalQL.g:1134:3: ( 'OR' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getOREnumLiteralDeclaration_11()); 
                    // InternalQL.g:1135:3: ( 'OR' )
                    // InternalQL.g:1135:4: 'OR'
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
    // InternalQL.g:1143:1: rule__UnaryOperatorKind__Alternatives : ( ( ( 'UNARYMINUS' ) ) | ( ( 'NOT' ) ) );
    public final void rule__UnaryOperatorKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1147:1: ( ( ( 'UNARYMINUS' ) ) | ( ( 'NOT' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            else if ( (LA10_0==27) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalQL.g:1148:2: ( ( 'UNARYMINUS' ) )
                    {
                    // InternalQL.g:1148:2: ( ( 'UNARYMINUS' ) )
                    // InternalQL.g:1149:3: ( 'UNARYMINUS' )
                    {
                     before(grammarAccess.getUnaryOperatorKindAccess().getUNARYMINUSEnumLiteralDeclaration_0()); 
                    // InternalQL.g:1150:3: ( 'UNARYMINUS' )
                    // InternalQL.g:1150:4: 'UNARYMINUS'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getUnaryOperatorKindAccess().getUNARYMINUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:1154:2: ( ( 'NOT' ) )
                    {
                    // InternalQL.g:1154:2: ( ( 'NOT' ) )
                    // InternalQL.g:1155:3: ( 'NOT' )
                    {
                     before(grammarAccess.getUnaryOperatorKindAccess().getNOTEnumLiteralDeclaration_1()); 
                    // InternalQL.g:1156:3: ( 'NOT' )
                    // InternalQL.g:1156:4: 'NOT'
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
    // InternalQL.g:1164:1: rule__QLModel__Group__0 : rule__QLModel__Group__0__Impl rule__QLModel__Group__1 ;
    public final void rule__QLModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1168:1: ( rule__QLModel__Group__0__Impl rule__QLModel__Group__1 )
            // InternalQL.g:1169:2: rule__QLModel__Group__0__Impl rule__QLModel__Group__1
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
    // InternalQL.g:1176:1: rule__QLModel__Group__0__Impl : ( () ) ;
    public final void rule__QLModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1180:1: ( ( () ) )
            // InternalQL.g:1181:1: ( () )
            {
            // InternalQL.g:1181:1: ( () )
            // InternalQL.g:1182:2: ()
            {
             before(grammarAccess.getQLModelAccess().getQLModelAction_0()); 
            // InternalQL.g:1183:2: ()
            // InternalQL.g:1183:3: 
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
    // InternalQL.g:1191:1: rule__QLModel__Group__1 : rule__QLModel__Group__1__Impl rule__QLModel__Group__2 ;
    public final void rule__QLModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1195:1: ( rule__QLModel__Group__1__Impl rule__QLModel__Group__2 )
            // InternalQL.g:1196:2: rule__QLModel__Group__1__Impl rule__QLModel__Group__2
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
    // InternalQL.g:1203:1: rule__QLModel__Group__1__Impl : ( 'QLModel' ) ;
    public final void rule__QLModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1207:1: ( ( 'QLModel' ) )
            // InternalQL.g:1208:1: ( 'QLModel' )
            {
            // InternalQL.g:1208:1: ( 'QLModel' )
            // InternalQL.g:1209:2: 'QLModel'
            {
             before(grammarAccess.getQLModelAccess().getQLModelKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalQL.g:1218:1: rule__QLModel__Group__2 : rule__QLModel__Group__2__Impl rule__QLModel__Group__3 ;
    public final void rule__QLModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1222:1: ( rule__QLModel__Group__2__Impl rule__QLModel__Group__3 )
            // InternalQL.g:1223:2: rule__QLModel__Group__2__Impl rule__QLModel__Group__3
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
    // InternalQL.g:1230:1: rule__QLModel__Group__2__Impl : ( ( rule__QLModel__Group_2__0 )? ) ;
    public final void rule__QLModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1234:1: ( ( ( rule__QLModel__Group_2__0 )? ) )
            // InternalQL.g:1235:1: ( ( rule__QLModel__Group_2__0 )? )
            {
            // InternalQL.g:1235:1: ( ( rule__QLModel__Group_2__0 )? )
            // InternalQL.g:1236:2: ( rule__QLModel__Group_2__0 )?
            {
             before(grammarAccess.getQLModelAccess().getGroup_2()); 
            // InternalQL.g:1237:2: ( rule__QLModel__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalQL.g:1237:3: rule__QLModel__Group_2__0
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
    // InternalQL.g:1245:1: rule__QLModel__Group__3 : rule__QLModel__Group__3__Impl rule__QLModel__Group__4 ;
    public final void rule__QLModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1249:1: ( rule__QLModel__Group__3__Impl rule__QLModel__Group__4 )
            // InternalQL.g:1250:2: rule__QLModel__Group__3__Impl rule__QLModel__Group__4
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
    // InternalQL.g:1257:1: rule__QLModel__Group__3__Impl : ( '{' ) ;
    public final void rule__QLModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1261:1: ( ( '{' ) )
            // InternalQL.g:1262:1: ( '{' )
            {
            // InternalQL.g:1262:1: ( '{' )
            // InternalQL.g:1263:2: '{'
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
    // InternalQL.g:1272:1: rule__QLModel__Group__4 : rule__QLModel__Group__4__Impl rule__QLModel__Group__5 ;
    public final void rule__QLModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1276:1: ( rule__QLModel__Group__4__Impl rule__QLModel__Group__5 )
            // InternalQL.g:1277:2: rule__QLModel__Group__4__Impl rule__QLModel__Group__5
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
    // InternalQL.g:1284:1: rule__QLModel__Group__4__Impl : ( ( rule__QLModel__Alternatives_4 )* ) ;
    public final void rule__QLModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1288:1: ( ( ( rule__QLModel__Alternatives_4 )* ) )
            // InternalQL.g:1289:1: ( ( rule__QLModel__Alternatives_4 )* )
            {
            // InternalQL.g:1289:1: ( ( rule__QLModel__Alternatives_4 )* )
            // InternalQL.g:1290:2: ( rule__QLModel__Alternatives_4 )*
            {
             before(grammarAccess.getQLModelAccess().getAlternatives_4()); 
            // InternalQL.g:1291:2: ( rule__QLModel__Alternatives_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=34 && LA12_0<=35)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalQL.g:1291:3: rule__QLModel__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__QLModel__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalQL.g:1299:1: rule__QLModel__Group__5 : rule__QLModel__Group__5__Impl ;
    public final void rule__QLModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1303:1: ( rule__QLModel__Group__5__Impl )
            // InternalQL.g:1304:2: rule__QLModel__Group__5__Impl
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
    // InternalQL.g:1310:1: rule__QLModel__Group__5__Impl : ( '}' ) ;
    public final void rule__QLModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1314:1: ( ( '}' ) )
            // InternalQL.g:1315:1: ( '}' )
            {
            // InternalQL.g:1315:1: ( '}' )
            // InternalQL.g:1316:2: '}'
            {
             before(grammarAccess.getQLModelAccess().getRightCurlyBracketKeyword_5()); 
            match(input,30,FOLLOW_2); 
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
    // InternalQL.g:1326:1: rule__QLModel__Group_2__0 : rule__QLModel__Group_2__0__Impl rule__QLModel__Group_2__1 ;
    public final void rule__QLModel__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1330:1: ( rule__QLModel__Group_2__0__Impl rule__QLModel__Group_2__1 )
            // InternalQL.g:1331:2: rule__QLModel__Group_2__0__Impl rule__QLModel__Group_2__1
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
    // InternalQL.g:1338:1: rule__QLModel__Group_2__0__Impl : ( '(' ) ;
    public final void rule__QLModel__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1342:1: ( ( '(' ) )
            // InternalQL.g:1343:1: ( '(' )
            {
            // InternalQL.g:1343:1: ( '(' )
            // InternalQL.g:1344:2: '('
            {
             before(grammarAccess.getQLModelAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalQL.g:1353:1: rule__QLModel__Group_2__1 : rule__QLModel__Group_2__1__Impl rule__QLModel__Group_2__2 ;
    public final void rule__QLModel__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1357:1: ( rule__QLModel__Group_2__1__Impl rule__QLModel__Group_2__2 )
            // InternalQL.g:1358:2: rule__QLModel__Group_2__1__Impl rule__QLModel__Group_2__2
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
    // InternalQL.g:1365:1: rule__QLModel__Group_2__1__Impl : ( ( rule__QLModel__CanSubmitAssignment_2_1 )? ) ;
    public final void rule__QLModel__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1369:1: ( ( ( rule__QLModel__CanSubmitAssignment_2_1 )? ) )
            // InternalQL.g:1370:1: ( ( rule__QLModel__CanSubmitAssignment_2_1 )? )
            {
            // InternalQL.g:1370:1: ( ( rule__QLModel__CanSubmitAssignment_2_1 )? )
            // InternalQL.g:1371:2: ( rule__QLModel__CanSubmitAssignment_2_1 )?
            {
             before(grammarAccess.getQLModelAccess().getCanSubmitAssignment_2_1()); 
            // InternalQL.g:1372:2: ( rule__QLModel__CanSubmitAssignment_2_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==74) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalQL.g:1372:3: rule__QLModel__CanSubmitAssignment_2_1
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
    // InternalQL.g:1380:1: rule__QLModel__Group_2__2 : rule__QLModel__Group_2__2__Impl rule__QLModel__Group_2__3 ;
    public final void rule__QLModel__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1384:1: ( rule__QLModel__Group_2__2__Impl rule__QLModel__Group_2__3 )
            // InternalQL.g:1385:2: rule__QLModel__Group_2__2__Impl rule__QLModel__Group_2__3
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
    // InternalQL.g:1392:1: rule__QLModel__Group_2__2__Impl : ( ( rule__QLModel__Group_2_2__0 )? ) ;
    public final void rule__QLModel__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1396:1: ( ( ( rule__QLModel__Group_2_2__0 )? ) )
            // InternalQL.g:1397:1: ( ( rule__QLModel__Group_2_2__0 )? )
            {
            // InternalQL.g:1397:1: ( ( rule__QLModel__Group_2_2__0 )? )
            // InternalQL.g:1398:2: ( rule__QLModel__Group_2_2__0 )?
            {
             before(grammarAccess.getQLModelAccess().getGroup_2_2()); 
            // InternalQL.g:1399:2: ( rule__QLModel__Group_2_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalQL.g:1399:3: rule__QLModel__Group_2_2__0
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
    // InternalQL.g:1407:1: rule__QLModel__Group_2__3 : rule__QLModel__Group_2__3__Impl ;
    public final void rule__QLModel__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1411:1: ( rule__QLModel__Group_2__3__Impl )
            // InternalQL.g:1412:2: rule__QLModel__Group_2__3__Impl
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
    // InternalQL.g:1418:1: rule__QLModel__Group_2__3__Impl : ( ')' ) ;
    public final void rule__QLModel__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1422:1: ( ( ')' ) )
            // InternalQL.g:1423:1: ( ')' )
            {
            // InternalQL.g:1423:1: ( ')' )
            // InternalQL.g:1424:2: ')'
            {
             before(grammarAccess.getQLModelAccess().getRightParenthesisKeyword_2_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalQL.g:1434:1: rule__QLModel__Group_2_2__0 : rule__QLModel__Group_2_2__0__Impl rule__QLModel__Group_2_2__1 ;
    public final void rule__QLModel__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1438:1: ( rule__QLModel__Group_2_2__0__Impl rule__QLModel__Group_2_2__1 )
            // InternalQL.g:1439:2: rule__QLModel__Group_2_2__0__Impl rule__QLModel__Group_2_2__1
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
    // InternalQL.g:1446:1: rule__QLModel__Group_2_2__0__Impl : ( 'submitDate' ) ;
    public final void rule__QLModel__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1450:1: ( ( 'submitDate' ) )
            // InternalQL.g:1451:1: ( 'submitDate' )
            {
            // InternalQL.g:1451:1: ( 'submitDate' )
            // InternalQL.g:1452:2: 'submitDate'
            {
             before(grammarAccess.getQLModelAccess().getSubmitDateKeyword_2_2_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalQL.g:1461:1: rule__QLModel__Group_2_2__1 : rule__QLModel__Group_2_2__1__Impl ;
    public final void rule__QLModel__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1465:1: ( rule__QLModel__Group_2_2__1__Impl )
            // InternalQL.g:1466:2: rule__QLModel__Group_2_2__1__Impl
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
    // InternalQL.g:1472:1: rule__QLModel__Group_2_2__1__Impl : ( ( rule__QLModel__SubmitDateAssignment_2_2_1 ) ) ;
    public final void rule__QLModel__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1476:1: ( ( ( rule__QLModel__SubmitDateAssignment_2_2_1 ) ) )
            // InternalQL.g:1477:1: ( ( rule__QLModel__SubmitDateAssignment_2_2_1 ) )
            {
            // InternalQL.g:1477:1: ( ( rule__QLModel__SubmitDateAssignment_2_2_1 ) )
            // InternalQL.g:1478:2: ( rule__QLModel__SubmitDateAssignment_2_2_1 )
            {
             before(grammarAccess.getQLModelAccess().getSubmitDateAssignment_2_2_1()); 
            // InternalQL.g:1479:2: ( rule__QLModel__SubmitDateAssignment_2_2_1 )
            // InternalQL.g:1479:3: rule__QLModel__SubmitDateAssignment_2_2_1
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


    // $ANTLR start "rule__Form__Group__0"
    // InternalQL.g:1488:1: rule__Form__Group__0 : rule__Form__Group__0__Impl rule__Form__Group__1 ;
    public final void rule__Form__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1492:1: ( rule__Form__Group__0__Impl rule__Form__Group__1 )
            // InternalQL.g:1493:2: rule__Form__Group__0__Impl rule__Form__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalQL.g:1500:1: rule__Form__Group__0__Impl : ( 'Form' ) ;
    public final void rule__Form__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1504:1: ( ( 'Form' ) )
            // InternalQL.g:1505:1: ( 'Form' )
            {
            // InternalQL.g:1505:1: ( 'Form' )
            // InternalQL.g:1506:2: 'Form'
            {
             before(grammarAccess.getFormAccess().getFormKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalQL.g:1515:1: rule__Form__Group__1 : rule__Form__Group__1__Impl rule__Form__Group__2 ;
    public final void rule__Form__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1519:1: ( rule__Form__Group__1__Impl rule__Form__Group__2 )
            // InternalQL.g:1520:2: rule__Form__Group__1__Impl rule__Form__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalQL.g:1527:1: rule__Form__Group__1__Impl : ( ( rule__Form__NameAssignment_1 ) ) ;
    public final void rule__Form__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1531:1: ( ( ( rule__Form__NameAssignment_1 ) ) )
            // InternalQL.g:1532:1: ( ( rule__Form__NameAssignment_1 ) )
            {
            // InternalQL.g:1532:1: ( ( rule__Form__NameAssignment_1 ) )
            // InternalQL.g:1533:2: ( rule__Form__NameAssignment_1 )
            {
             before(grammarAccess.getFormAccess().getNameAssignment_1()); 
            // InternalQL.g:1534:2: ( rule__Form__NameAssignment_1 )
            // InternalQL.g:1534:3: rule__Form__NameAssignment_1
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
    // InternalQL.g:1542:1: rule__Form__Group__2 : rule__Form__Group__2__Impl ;
    public final void rule__Form__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1546:1: ( rule__Form__Group__2__Impl )
            // InternalQL.g:1547:2: rule__Form__Group__2__Impl
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
    // InternalQL.g:1553:1: rule__Form__Group__2__Impl : ( ( rule__Form__QuestionGroupAssignment_2 ) ) ;
    public final void rule__Form__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1557:1: ( ( ( rule__Form__QuestionGroupAssignment_2 ) ) )
            // InternalQL.g:1558:1: ( ( rule__Form__QuestionGroupAssignment_2 ) )
            {
            // InternalQL.g:1558:1: ( ( rule__Form__QuestionGroupAssignment_2 ) )
            // InternalQL.g:1559:2: ( rule__Form__QuestionGroupAssignment_2 )
            {
             before(grammarAccess.getFormAccess().getQuestionGroupAssignment_2()); 
            // InternalQL.g:1560:2: ( rule__Form__QuestionGroupAssignment_2 )
            // InternalQL.g:1560:3: rule__Form__QuestionGroupAssignment_2
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
    // InternalQL.g:1569:1: rule__DefinitionGroup__Group__0 : rule__DefinitionGroup__Group__0__Impl rule__DefinitionGroup__Group__1 ;
    public final void rule__DefinitionGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1573:1: ( rule__DefinitionGroup__Group__0__Impl rule__DefinitionGroup__Group__1 )
            // InternalQL.g:1574:2: rule__DefinitionGroup__Group__0__Impl rule__DefinitionGroup__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalQL.g:1581:1: rule__DefinitionGroup__Group__0__Impl : ( () ) ;
    public final void rule__DefinitionGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1585:1: ( ( () ) )
            // InternalQL.g:1586:1: ( () )
            {
            // InternalQL.g:1586:1: ( () )
            // InternalQL.g:1587:2: ()
            {
             before(grammarAccess.getDefinitionGroupAccess().getDefinitionGroupAction_0()); 
            // InternalQL.g:1588:2: ()
            // InternalQL.g:1588:3: 
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
    // InternalQL.g:1596:1: rule__DefinitionGroup__Group__1 : rule__DefinitionGroup__Group__1__Impl rule__DefinitionGroup__Group__2 ;
    public final void rule__DefinitionGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1600:1: ( rule__DefinitionGroup__Group__1__Impl rule__DefinitionGroup__Group__2 )
            // InternalQL.g:1601:2: rule__DefinitionGroup__Group__1__Impl rule__DefinitionGroup__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalQL.g:1608:1: rule__DefinitionGroup__Group__1__Impl : ( 'definitions' ) ;
    public final void rule__DefinitionGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1612:1: ( ( 'definitions' ) )
            // InternalQL.g:1613:1: ( 'definitions' )
            {
            // InternalQL.g:1613:1: ( 'definitions' )
            // InternalQL.g:1614:2: 'definitions'
            {
             before(grammarAccess.getDefinitionGroupAccess().getDefinitionsKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalQL.g:1623:1: rule__DefinitionGroup__Group__2 : rule__DefinitionGroup__Group__2__Impl rule__DefinitionGroup__Group__3 ;
    public final void rule__DefinitionGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1627:1: ( rule__DefinitionGroup__Group__2__Impl rule__DefinitionGroup__Group__3 )
            // InternalQL.g:1628:2: rule__DefinitionGroup__Group__2__Impl rule__DefinitionGroup__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalQL.g:1635:1: rule__DefinitionGroup__Group__2__Impl : ( '{' ) ;
    public final void rule__DefinitionGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1639:1: ( ( '{' ) )
            // InternalQL.g:1640:1: ( '{' )
            {
            // InternalQL.g:1640:1: ( '{' )
            // InternalQL.g:1641:2: '{'
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
    // InternalQL.g:1650:1: rule__DefinitionGroup__Group__3 : rule__DefinitionGroup__Group__3__Impl rule__DefinitionGroup__Group__4 ;
    public final void rule__DefinitionGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1654:1: ( rule__DefinitionGroup__Group__3__Impl rule__DefinitionGroup__Group__4 )
            // InternalQL.g:1655:2: rule__DefinitionGroup__Group__3__Impl rule__DefinitionGroup__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalQL.g:1662:1: rule__DefinitionGroup__Group__3__Impl : ( ( rule__DefinitionGroup__Alternatives_3 )* ) ;
    public final void rule__DefinitionGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1666:1: ( ( ( rule__DefinitionGroup__Alternatives_3 )* ) )
            // InternalQL.g:1667:1: ( ( rule__DefinitionGroup__Alternatives_3 )* )
            {
            // InternalQL.g:1667:1: ( ( rule__DefinitionGroup__Alternatives_3 )* )
            // InternalQL.g:1668:2: ( rule__DefinitionGroup__Alternatives_3 )*
            {
             before(grammarAccess.getDefinitionGroupAccess().getAlternatives_3()); 
            // InternalQL.g:1669:2: ( rule__DefinitionGroup__Alternatives_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==37||(LA15_0>=49 && LA15_0<=51)||(LA15_0>=54 && LA15_0<=56)||LA15_0==59||LA15_0==76) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalQL.g:1669:3: rule__DefinitionGroup__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_14);
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
    // InternalQL.g:1677:1: rule__DefinitionGroup__Group__4 : rule__DefinitionGroup__Group__4__Impl ;
    public final void rule__DefinitionGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1681:1: ( rule__DefinitionGroup__Group__4__Impl )
            // InternalQL.g:1682:2: rule__DefinitionGroup__Group__4__Impl
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
    // InternalQL.g:1688:1: rule__DefinitionGroup__Group__4__Impl : ( '}' ) ;
    public final void rule__DefinitionGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1692:1: ( ( '}' ) )
            // InternalQL.g:1693:1: ( '}' )
            {
            // InternalQL.g:1693:1: ( '}' )
            // InternalQL.g:1694:2: '}'
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
    // InternalQL.g:1704:1: rule__QuestionGroup__Group__0 : rule__QuestionGroup__Group__0__Impl rule__QuestionGroup__Group__1 ;
    public final void rule__QuestionGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1708:1: ( rule__QuestionGroup__Group__0__Impl rule__QuestionGroup__Group__1 )
            // InternalQL.g:1709:2: rule__QuestionGroup__Group__0__Impl rule__QuestionGroup__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalQL.g:1716:1: rule__QuestionGroup__Group__0__Impl : ( () ) ;
    public final void rule__QuestionGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1720:1: ( ( () ) )
            // InternalQL.g:1721:1: ( () )
            {
            // InternalQL.g:1721:1: ( () )
            // InternalQL.g:1722:2: ()
            {
             before(grammarAccess.getQuestionGroupAccess().getQuestionGroupAction_0()); 
            // InternalQL.g:1723:2: ()
            // InternalQL.g:1723:3: 
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
    // InternalQL.g:1731:1: rule__QuestionGroup__Group__1 : rule__QuestionGroup__Group__1__Impl rule__QuestionGroup__Group__2 ;
    public final void rule__QuestionGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1735:1: ( rule__QuestionGroup__Group__1__Impl rule__QuestionGroup__Group__2 )
            // InternalQL.g:1736:2: rule__QuestionGroup__Group__1__Impl rule__QuestionGroup__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalQL.g:1743:1: rule__QuestionGroup__Group__1__Impl : ( ( rule__QuestionGroup__Group_1__0 )? ) ;
    public final void rule__QuestionGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1747:1: ( ( ( rule__QuestionGroup__Group_1__0 )? ) )
            // InternalQL.g:1748:1: ( ( rule__QuestionGroup__Group_1__0 )? )
            {
            // InternalQL.g:1748:1: ( ( rule__QuestionGroup__Group_1__0 )? )
            // InternalQL.g:1749:2: ( rule__QuestionGroup__Group_1__0 )?
            {
             before(grammarAccess.getQuestionGroupAccess().getGroup_1()); 
            // InternalQL.g:1750:2: ( rule__QuestionGroup__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==36) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalQL.g:1750:3: rule__QuestionGroup__Group_1__0
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
    // InternalQL.g:1758:1: rule__QuestionGroup__Group__2 : rule__QuestionGroup__Group__2__Impl rule__QuestionGroup__Group__3 ;
    public final void rule__QuestionGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1762:1: ( rule__QuestionGroup__Group__2__Impl rule__QuestionGroup__Group__3 )
            // InternalQL.g:1763:2: rule__QuestionGroup__Group__2__Impl rule__QuestionGroup__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalQL.g:1770:1: rule__QuestionGroup__Group__2__Impl : ( '{' ) ;
    public final void rule__QuestionGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1774:1: ( ( '{' ) )
            // InternalQL.g:1775:1: ( '{' )
            {
            // InternalQL.g:1775:1: ( '{' )
            // InternalQL.g:1776:2: '{'
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
    // InternalQL.g:1785:1: rule__QuestionGroup__Group__3 : rule__QuestionGroup__Group__3__Impl rule__QuestionGroup__Group__4 ;
    public final void rule__QuestionGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1789:1: ( rule__QuestionGroup__Group__3__Impl rule__QuestionGroup__Group__4 )
            // InternalQL.g:1790:2: rule__QuestionGroup__Group__3__Impl rule__QuestionGroup__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalQL.g:1797:1: rule__QuestionGroup__Group__3__Impl : ( ( rule__QuestionGroup__Alternatives_3 )* ) ;
    public final void rule__QuestionGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1801:1: ( ( ( rule__QuestionGroup__Alternatives_3 )* ) )
            // InternalQL.g:1802:1: ( ( rule__QuestionGroup__Alternatives_3 )* )
            {
            // InternalQL.g:1802:1: ( ( rule__QuestionGroup__Alternatives_3 )* )
            // InternalQL.g:1803:2: ( rule__QuestionGroup__Alternatives_3 )*
            {
             before(grammarAccess.getQuestionGroupAccess().getAlternatives_3()); 
            // InternalQL.g:1804:2: ( rule__QuestionGroup__Alternatives_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_ID)||LA17_0==29||LA17_0==36) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalQL.g:1804:3: rule__QuestionGroup__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__QuestionGroup__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalQL.g:1812:1: rule__QuestionGroup__Group__4 : rule__QuestionGroup__Group__4__Impl ;
    public final void rule__QuestionGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1816:1: ( rule__QuestionGroup__Group__4__Impl )
            // InternalQL.g:1817:2: rule__QuestionGroup__Group__4__Impl
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
    // InternalQL.g:1823:1: rule__QuestionGroup__Group__4__Impl : ( '}' ) ;
    public final void rule__QuestionGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1827:1: ( ( '}' ) )
            // InternalQL.g:1828:1: ( '}' )
            {
            // InternalQL.g:1828:1: ( '}' )
            // InternalQL.g:1829:2: '}'
            {
             before(grammarAccess.getQuestionGroupAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
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
    // InternalQL.g:1839:1: rule__QuestionGroup__Group_1__0 : rule__QuestionGroup__Group_1__0__Impl rule__QuestionGroup__Group_1__1 ;
    public final void rule__QuestionGroup__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1843:1: ( rule__QuestionGroup__Group_1__0__Impl rule__QuestionGroup__Group_1__1 )
            // InternalQL.g:1844:2: rule__QuestionGroup__Group_1__0__Impl rule__QuestionGroup__Group_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalQL.g:1851:1: rule__QuestionGroup__Group_1__0__Impl : ( 'if' ) ;
    public final void rule__QuestionGroup__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1855:1: ( ( 'if' ) )
            // InternalQL.g:1856:1: ( 'if' )
            {
            // InternalQL.g:1856:1: ( 'if' )
            // InternalQL.g:1857:2: 'if'
            {
             before(grammarAccess.getQuestionGroupAccess().getIfKeyword_1_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalQL.g:1866:1: rule__QuestionGroup__Group_1__1 : rule__QuestionGroup__Group_1__1__Impl rule__QuestionGroup__Group_1__2 ;
    public final void rule__QuestionGroup__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1870:1: ( rule__QuestionGroup__Group_1__1__Impl rule__QuestionGroup__Group_1__2 )
            // InternalQL.g:1871:2: rule__QuestionGroup__Group_1__1__Impl rule__QuestionGroup__Group_1__2
            {
            pushFollow(FOLLOW_18);
            rule__QuestionGroup__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group_1__2();

            state._fsp--;


            }

        }
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
    // InternalQL.g:1878:1: rule__QuestionGroup__Group_1__1__Impl : ( '(' ) ;
    public final void rule__QuestionGroup__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1882:1: ( ( '(' ) )
            // InternalQL.g:1883:1: ( '(' )
            {
            // InternalQL.g:1883:1: ( '(' )
            // InternalQL.g:1884:2: '('
            {
             before(grammarAccess.getQuestionGroupAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getQuestionGroupAccess().getLeftParenthesisKeyword_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__QuestionGroup__Group_1__2"
    // InternalQL.g:1893:1: rule__QuestionGroup__Group_1__2 : rule__QuestionGroup__Group_1__2__Impl rule__QuestionGroup__Group_1__3 ;
    public final void rule__QuestionGroup__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1897:1: ( rule__QuestionGroup__Group_1__2__Impl rule__QuestionGroup__Group_1__3 )
            // InternalQL.g:1898:2: rule__QuestionGroup__Group_1__2__Impl rule__QuestionGroup__Group_1__3
            {
            pushFollow(FOLLOW_19);
            rule__QuestionGroup__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_1__2"


    // $ANTLR start "rule__QuestionGroup__Group_1__2__Impl"
    // InternalQL.g:1905:1: rule__QuestionGroup__Group_1__2__Impl : ( ( rule__QuestionGroup__GuardAssignment_1_2 ) ) ;
    public final void rule__QuestionGroup__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1909:1: ( ( ( rule__QuestionGroup__GuardAssignment_1_2 ) ) )
            // InternalQL.g:1910:1: ( ( rule__QuestionGroup__GuardAssignment_1_2 ) )
            {
            // InternalQL.g:1910:1: ( ( rule__QuestionGroup__GuardAssignment_1_2 ) )
            // InternalQL.g:1911:2: ( rule__QuestionGroup__GuardAssignment_1_2 )
            {
             before(grammarAccess.getQuestionGroupAccess().getGuardAssignment_1_2()); 
            // InternalQL.g:1912:2: ( rule__QuestionGroup__GuardAssignment_1_2 )
            // InternalQL.g:1912:3: rule__QuestionGroup__GuardAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__QuestionGroup__GuardAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getQuestionGroupAccess().getGuardAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_1__2__Impl"


    // $ANTLR start "rule__QuestionGroup__Group_1__3"
    // InternalQL.g:1920:1: rule__QuestionGroup__Group_1__3 : rule__QuestionGroup__Group_1__3__Impl ;
    public final void rule__QuestionGroup__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1924:1: ( rule__QuestionGroup__Group_1__3__Impl )
            // InternalQL.g:1925:2: rule__QuestionGroup__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_1__3"


    // $ANTLR start "rule__QuestionGroup__Group_1__3__Impl"
    // InternalQL.g:1931:1: rule__QuestionGroup__Group_1__3__Impl : ( ')' ) ;
    public final void rule__QuestionGroup__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1935:1: ( ( ')' ) )
            // InternalQL.g:1936:1: ( ')' )
            {
            // InternalQL.g:1936:1: ( ')' )
            // InternalQL.g:1937:2: ')'
            {
             before(grammarAccess.getQuestionGroupAccess().getRightParenthesisKeyword_1_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getQuestionGroupAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_1__3__Impl"


    // $ANTLR start "rule__ValueType_Impl__Group__0"
    // InternalQL.g:1947:1: rule__ValueType_Impl__Group__0 : rule__ValueType_Impl__Group__0__Impl rule__ValueType_Impl__Group__1 ;
    public final void rule__ValueType_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1951:1: ( rule__ValueType_Impl__Group__0__Impl rule__ValueType_Impl__Group__1 )
            // InternalQL.g:1952:2: rule__ValueType_Impl__Group__0__Impl rule__ValueType_Impl__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalQL.g:1959:1: rule__ValueType_Impl__Group__0__Impl : ( () ) ;
    public final void rule__ValueType_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1963:1: ( ( () ) )
            // InternalQL.g:1964:1: ( () )
            {
            // InternalQL.g:1964:1: ( () )
            // InternalQL.g:1965:2: ()
            {
             before(grammarAccess.getValueType_ImplAccess().getValueTypeAction_0()); 
            // InternalQL.g:1966:2: ()
            // InternalQL.g:1966:3: 
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
    // InternalQL.g:1974:1: rule__ValueType_Impl__Group__1 : rule__ValueType_Impl__Group__1__Impl rule__ValueType_Impl__Group__2 ;
    public final void rule__ValueType_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1978:1: ( rule__ValueType_Impl__Group__1__Impl rule__ValueType_Impl__Group__2 )
            // InternalQL.g:1979:2: rule__ValueType_Impl__Group__1__Impl rule__ValueType_Impl__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalQL.g:1986:1: rule__ValueType_Impl__Group__1__Impl : ( 'ValueType' ) ;
    public final void rule__ValueType_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1990:1: ( ( 'ValueType' ) )
            // InternalQL.g:1991:1: ( 'ValueType' )
            {
            // InternalQL.g:1991:1: ( 'ValueType' )
            // InternalQL.g:1992:2: 'ValueType'
            {
             before(grammarAccess.getValueType_ImplAccess().getValueTypeKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalQL.g:2001:1: rule__ValueType_Impl__Group__2 : rule__ValueType_Impl__Group__2__Impl rule__ValueType_Impl__Group__3 ;
    public final void rule__ValueType_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2005:1: ( rule__ValueType_Impl__Group__2__Impl rule__ValueType_Impl__Group__3 )
            // InternalQL.g:2006:2: rule__ValueType_Impl__Group__2__Impl rule__ValueType_Impl__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalQL.g:2013:1: rule__ValueType_Impl__Group__2__Impl : ( ( rule__ValueType_Impl__NameAssignment_2 ) ) ;
    public final void rule__ValueType_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2017:1: ( ( ( rule__ValueType_Impl__NameAssignment_2 ) ) )
            // InternalQL.g:2018:1: ( ( rule__ValueType_Impl__NameAssignment_2 ) )
            {
            // InternalQL.g:2018:1: ( ( rule__ValueType_Impl__NameAssignment_2 ) )
            // InternalQL.g:2019:2: ( rule__ValueType_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getValueType_ImplAccess().getNameAssignment_2()); 
            // InternalQL.g:2020:2: ( rule__ValueType_Impl__NameAssignment_2 )
            // InternalQL.g:2020:3: rule__ValueType_Impl__NameAssignment_2
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
    // InternalQL.g:2028:1: rule__ValueType_Impl__Group__3 : rule__ValueType_Impl__Group__3__Impl rule__ValueType_Impl__Group__4 ;
    public final void rule__ValueType_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2032:1: ( rule__ValueType_Impl__Group__3__Impl rule__ValueType_Impl__Group__4 )
            // InternalQL.g:2033:2: rule__ValueType_Impl__Group__3__Impl rule__ValueType_Impl__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalQL.g:2040:1: rule__ValueType_Impl__Group__3__Impl : ( '{' ) ;
    public final void rule__ValueType_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2044:1: ( ( '{' ) )
            // InternalQL.g:2045:1: ( '{' )
            {
            // InternalQL.g:2045:1: ( '{' )
            // InternalQL.g:2046:2: '{'
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
    // InternalQL.g:2055:1: rule__ValueType_Impl__Group__4 : rule__ValueType_Impl__Group__4__Impl rule__ValueType_Impl__Group__5 ;
    public final void rule__ValueType_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2059:1: ( rule__ValueType_Impl__Group__4__Impl rule__ValueType_Impl__Group__5 )
            // InternalQL.g:2060:2: rule__ValueType_Impl__Group__4__Impl rule__ValueType_Impl__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalQL.g:2067:1: rule__ValueType_Impl__Group__4__Impl : ( ( rule__ValueType_Impl__Group_4__0 )? ) ;
    public final void rule__ValueType_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2071:1: ( ( ( rule__ValueType_Impl__Group_4__0 )? ) )
            // InternalQL.g:2072:1: ( ( rule__ValueType_Impl__Group_4__0 )? )
            {
            // InternalQL.g:2072:1: ( ( rule__ValueType_Impl__Group_4__0 )? )
            // InternalQL.g:2073:2: ( rule__ValueType_Impl__Group_4__0 )?
            {
             before(grammarAccess.getValueType_ImplAccess().getGroup_4()); 
            // InternalQL.g:2074:2: ( rule__ValueType_Impl__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==38) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalQL.g:2074:3: rule__ValueType_Impl__Group_4__0
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
    // InternalQL.g:2082:1: rule__ValueType_Impl__Group__5 : rule__ValueType_Impl__Group__5__Impl ;
    public final void rule__ValueType_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2086:1: ( rule__ValueType_Impl__Group__5__Impl )
            // InternalQL.g:2087:2: rule__ValueType_Impl__Group__5__Impl
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
    // InternalQL.g:2093:1: rule__ValueType_Impl__Group__5__Impl : ( '}' ) ;
    public final void rule__ValueType_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2097:1: ( ( '}' ) )
            // InternalQL.g:2098:1: ( '}' )
            {
            // InternalQL.g:2098:1: ( '}' )
            // InternalQL.g:2099:2: '}'
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
    // InternalQL.g:2109:1: rule__ValueType_Impl__Group_4__0 : rule__ValueType_Impl__Group_4__0__Impl rule__ValueType_Impl__Group_4__1 ;
    public final void rule__ValueType_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2113:1: ( rule__ValueType_Impl__Group_4__0__Impl rule__ValueType_Impl__Group_4__1 )
            // InternalQL.g:2114:2: rule__ValueType_Impl__Group_4__0__Impl rule__ValueType_Impl__Group_4__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalQL.g:2121:1: rule__ValueType_Impl__Group_4__0__Impl : ( 'unit' ) ;
    public final void rule__ValueType_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2125:1: ( ( 'unit' ) )
            // InternalQL.g:2126:1: ( 'unit' )
            {
            // InternalQL.g:2126:1: ( 'unit' )
            // InternalQL.g:2127:2: 'unit'
            {
             before(grammarAccess.getValueType_ImplAccess().getUnitKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalQL.g:2136:1: rule__ValueType_Impl__Group_4__1 : rule__ValueType_Impl__Group_4__1__Impl ;
    public final void rule__ValueType_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2140:1: ( rule__ValueType_Impl__Group_4__1__Impl )
            // InternalQL.g:2141:2: rule__ValueType_Impl__Group_4__1__Impl
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
    // InternalQL.g:2147:1: rule__ValueType_Impl__Group_4__1__Impl : ( ( rule__ValueType_Impl__UnitAssignment_4_1 ) ) ;
    public final void rule__ValueType_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2151:1: ( ( ( rule__ValueType_Impl__UnitAssignment_4_1 ) ) )
            // InternalQL.g:2152:1: ( ( rule__ValueType_Impl__UnitAssignment_4_1 ) )
            {
            // InternalQL.g:2152:1: ( ( rule__ValueType_Impl__UnitAssignment_4_1 ) )
            // InternalQL.g:2153:2: ( rule__ValueType_Impl__UnitAssignment_4_1 )
            {
             before(grammarAccess.getValueType_ImplAccess().getUnitAssignment_4_1()); 
            // InternalQL.g:2154:2: ( rule__ValueType_Impl__UnitAssignment_4_1 )
            // InternalQL.g:2154:3: rule__ValueType_Impl__UnitAssignment_4_1
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
    // InternalQL.g:2163:1: rule__BasicBinaryExpression__Group__0 : rule__BasicBinaryExpression__Group__0__Impl rule__BasicBinaryExpression__Group__1 ;
    public final void rule__BasicBinaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2167:1: ( rule__BasicBinaryExpression__Group__0__Impl rule__BasicBinaryExpression__Group__1 )
            // InternalQL.g:2168:2: rule__BasicBinaryExpression__Group__0__Impl rule__BasicBinaryExpression__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalQL.g:2175:1: rule__BasicBinaryExpression__Group__0__Impl : ( 'BasicBinaryExpression' ) ;
    public final void rule__BasicBinaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2179:1: ( ( 'BasicBinaryExpression' ) )
            // InternalQL.g:2180:1: ( 'BasicBinaryExpression' )
            {
            // InternalQL.g:2180:1: ( 'BasicBinaryExpression' )
            // InternalQL.g:2181:2: 'BasicBinaryExpression'
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getBasicBinaryExpressionKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalQL.g:2190:1: rule__BasicBinaryExpression__Group__1 : rule__BasicBinaryExpression__Group__1__Impl rule__BasicBinaryExpression__Group__2 ;
    public final void rule__BasicBinaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2194:1: ( rule__BasicBinaryExpression__Group__1__Impl rule__BasicBinaryExpression__Group__2 )
            // InternalQL.g:2195:2: rule__BasicBinaryExpression__Group__1__Impl rule__BasicBinaryExpression__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalQL.g:2202:1: rule__BasicBinaryExpression__Group__1__Impl : ( '{' ) ;
    public final void rule__BasicBinaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2206:1: ( ( '{' ) )
            // InternalQL.g:2207:1: ( '{' )
            {
            // InternalQL.g:2207:1: ( '{' )
            // InternalQL.g:2208:2: '{'
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
    // InternalQL.g:2217:1: rule__BasicBinaryExpression__Group__2 : rule__BasicBinaryExpression__Group__2__Impl rule__BasicBinaryExpression__Group__3 ;
    public final void rule__BasicBinaryExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2221:1: ( rule__BasicBinaryExpression__Group__2__Impl rule__BasicBinaryExpression__Group__3 )
            // InternalQL.g:2222:2: rule__BasicBinaryExpression__Group__2__Impl rule__BasicBinaryExpression__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalQL.g:2229:1: rule__BasicBinaryExpression__Group__2__Impl : ( 'operator' ) ;
    public final void rule__BasicBinaryExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2233:1: ( ( 'operator' ) )
            // InternalQL.g:2234:1: ( 'operator' )
            {
            // InternalQL.g:2234:1: ( 'operator' )
            // InternalQL.g:2235:2: 'operator'
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getOperatorKeyword_2()); 
            match(input,40,FOLLOW_2); 
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
    // InternalQL.g:2244:1: rule__BasicBinaryExpression__Group__3 : rule__BasicBinaryExpression__Group__3__Impl rule__BasicBinaryExpression__Group__4 ;
    public final void rule__BasicBinaryExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2248:1: ( rule__BasicBinaryExpression__Group__3__Impl rule__BasicBinaryExpression__Group__4 )
            // InternalQL.g:2249:2: rule__BasicBinaryExpression__Group__3__Impl rule__BasicBinaryExpression__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalQL.g:2256:1: rule__BasicBinaryExpression__Group__3__Impl : ( ( rule__BasicBinaryExpression__OperatorAssignment_3 ) ) ;
    public final void rule__BasicBinaryExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2260:1: ( ( ( rule__BasicBinaryExpression__OperatorAssignment_3 ) ) )
            // InternalQL.g:2261:1: ( ( rule__BasicBinaryExpression__OperatorAssignment_3 ) )
            {
            // InternalQL.g:2261:1: ( ( rule__BasicBinaryExpression__OperatorAssignment_3 ) )
            // InternalQL.g:2262:2: ( rule__BasicBinaryExpression__OperatorAssignment_3 )
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getOperatorAssignment_3()); 
            // InternalQL.g:2263:2: ( rule__BasicBinaryExpression__OperatorAssignment_3 )
            // InternalQL.g:2263:3: rule__BasicBinaryExpression__OperatorAssignment_3
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
    // InternalQL.g:2271:1: rule__BasicBinaryExpression__Group__4 : rule__BasicBinaryExpression__Group__4__Impl rule__BasicBinaryExpression__Group__5 ;
    public final void rule__BasicBinaryExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2275:1: ( rule__BasicBinaryExpression__Group__4__Impl rule__BasicBinaryExpression__Group__5 )
            // InternalQL.g:2276:2: rule__BasicBinaryExpression__Group__4__Impl rule__BasicBinaryExpression__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalQL.g:2283:1: rule__BasicBinaryExpression__Group__4__Impl : ( ( rule__BasicBinaryExpression__Group_4__0 )? ) ;
    public final void rule__BasicBinaryExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2287:1: ( ( ( rule__BasicBinaryExpression__Group_4__0 )? ) )
            // InternalQL.g:2288:1: ( ( rule__BasicBinaryExpression__Group_4__0 )? )
            {
            // InternalQL.g:2288:1: ( ( rule__BasicBinaryExpression__Group_4__0 )? )
            // InternalQL.g:2289:2: ( rule__BasicBinaryExpression__Group_4__0 )?
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getGroup_4()); 
            // InternalQL.g:2290:2: ( rule__BasicBinaryExpression__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==43) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalQL.g:2290:3: rule__BasicBinaryExpression__Group_4__0
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
    // InternalQL.g:2298:1: rule__BasicBinaryExpression__Group__5 : rule__BasicBinaryExpression__Group__5__Impl rule__BasicBinaryExpression__Group__6 ;
    public final void rule__BasicBinaryExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2302:1: ( rule__BasicBinaryExpression__Group__5__Impl rule__BasicBinaryExpression__Group__6 )
            // InternalQL.g:2303:2: rule__BasicBinaryExpression__Group__5__Impl rule__BasicBinaryExpression__Group__6
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
    // InternalQL.g:2310:1: rule__BasicBinaryExpression__Group__5__Impl : ( 'lhsOperand' ) ;
    public final void rule__BasicBinaryExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2314:1: ( ( 'lhsOperand' ) )
            // InternalQL.g:2315:1: ( 'lhsOperand' )
            {
            // InternalQL.g:2315:1: ( 'lhsOperand' )
            // InternalQL.g:2316:2: 'lhsOperand'
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getLhsOperandKeyword_5()); 
            match(input,41,FOLLOW_2); 
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
    // InternalQL.g:2325:1: rule__BasicBinaryExpression__Group__6 : rule__BasicBinaryExpression__Group__6__Impl rule__BasicBinaryExpression__Group__7 ;
    public final void rule__BasicBinaryExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2329:1: ( rule__BasicBinaryExpression__Group__6__Impl rule__BasicBinaryExpression__Group__7 )
            // InternalQL.g:2330:2: rule__BasicBinaryExpression__Group__6__Impl rule__BasicBinaryExpression__Group__7
            {
            pushFollow(FOLLOW_25);
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
    // InternalQL.g:2337:1: rule__BasicBinaryExpression__Group__6__Impl : ( ( rule__BasicBinaryExpression__LhsOperandAssignment_6 ) ) ;
    public final void rule__BasicBinaryExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2341:1: ( ( ( rule__BasicBinaryExpression__LhsOperandAssignment_6 ) ) )
            // InternalQL.g:2342:1: ( ( rule__BasicBinaryExpression__LhsOperandAssignment_6 ) )
            {
            // InternalQL.g:2342:1: ( ( rule__BasicBinaryExpression__LhsOperandAssignment_6 ) )
            // InternalQL.g:2343:2: ( rule__BasicBinaryExpression__LhsOperandAssignment_6 )
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getLhsOperandAssignment_6()); 
            // InternalQL.g:2344:2: ( rule__BasicBinaryExpression__LhsOperandAssignment_6 )
            // InternalQL.g:2344:3: rule__BasicBinaryExpression__LhsOperandAssignment_6
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
    // InternalQL.g:2352:1: rule__BasicBinaryExpression__Group__7 : rule__BasicBinaryExpression__Group__7__Impl rule__BasicBinaryExpression__Group__8 ;
    public final void rule__BasicBinaryExpression__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2356:1: ( rule__BasicBinaryExpression__Group__7__Impl rule__BasicBinaryExpression__Group__8 )
            // InternalQL.g:2357:2: rule__BasicBinaryExpression__Group__7__Impl rule__BasicBinaryExpression__Group__8
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
    // InternalQL.g:2364:1: rule__BasicBinaryExpression__Group__7__Impl : ( 'rhsOperand' ) ;
    public final void rule__BasicBinaryExpression__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2368:1: ( ( 'rhsOperand' ) )
            // InternalQL.g:2369:1: ( 'rhsOperand' )
            {
            // InternalQL.g:2369:1: ( 'rhsOperand' )
            // InternalQL.g:2370:2: 'rhsOperand'
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getRhsOperandKeyword_7()); 
            match(input,42,FOLLOW_2); 
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
    // InternalQL.g:2379:1: rule__BasicBinaryExpression__Group__8 : rule__BasicBinaryExpression__Group__8__Impl rule__BasicBinaryExpression__Group__9 ;
    public final void rule__BasicBinaryExpression__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2383:1: ( rule__BasicBinaryExpression__Group__8__Impl rule__BasicBinaryExpression__Group__9 )
            // InternalQL.g:2384:2: rule__BasicBinaryExpression__Group__8__Impl rule__BasicBinaryExpression__Group__9
            {
            pushFollow(FOLLOW_26);
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
    // InternalQL.g:2391:1: rule__BasicBinaryExpression__Group__8__Impl : ( ( rule__BasicBinaryExpression__RhsOperandAssignment_8 ) ) ;
    public final void rule__BasicBinaryExpression__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2395:1: ( ( ( rule__BasicBinaryExpression__RhsOperandAssignment_8 ) ) )
            // InternalQL.g:2396:1: ( ( rule__BasicBinaryExpression__RhsOperandAssignment_8 ) )
            {
            // InternalQL.g:2396:1: ( ( rule__BasicBinaryExpression__RhsOperandAssignment_8 ) )
            // InternalQL.g:2397:2: ( rule__BasicBinaryExpression__RhsOperandAssignment_8 )
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getRhsOperandAssignment_8()); 
            // InternalQL.g:2398:2: ( rule__BasicBinaryExpression__RhsOperandAssignment_8 )
            // InternalQL.g:2398:3: rule__BasicBinaryExpression__RhsOperandAssignment_8
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
    // InternalQL.g:2406:1: rule__BasicBinaryExpression__Group__9 : rule__BasicBinaryExpression__Group__9__Impl ;
    public final void rule__BasicBinaryExpression__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2410:1: ( rule__BasicBinaryExpression__Group__9__Impl )
            // InternalQL.g:2411:2: rule__BasicBinaryExpression__Group__9__Impl
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
    // InternalQL.g:2417:1: rule__BasicBinaryExpression__Group__9__Impl : ( '}' ) ;
    public final void rule__BasicBinaryExpression__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2421:1: ( ( '}' ) )
            // InternalQL.g:2422:1: ( '}' )
            {
            // InternalQL.g:2422:1: ( '}' )
            // InternalQL.g:2423:2: '}'
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
    // InternalQL.g:2433:1: rule__BasicBinaryExpression__Group_4__0 : rule__BasicBinaryExpression__Group_4__0__Impl rule__BasicBinaryExpression__Group_4__1 ;
    public final void rule__BasicBinaryExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2437:1: ( rule__BasicBinaryExpression__Group_4__0__Impl rule__BasicBinaryExpression__Group_4__1 )
            // InternalQL.g:2438:2: rule__BasicBinaryExpression__Group_4__0__Impl rule__BasicBinaryExpression__Group_4__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalQL.g:2445:1: rule__BasicBinaryExpression__Group_4__0__Impl : ( 'resultType' ) ;
    public final void rule__BasicBinaryExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2449:1: ( ( 'resultType' ) )
            // InternalQL.g:2450:1: ( 'resultType' )
            {
            // InternalQL.g:2450:1: ( 'resultType' )
            // InternalQL.g:2451:2: 'resultType'
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getResultTypeKeyword_4_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalQL.g:2460:1: rule__BasicBinaryExpression__Group_4__1 : rule__BasicBinaryExpression__Group_4__1__Impl ;
    public final void rule__BasicBinaryExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2464:1: ( rule__BasicBinaryExpression__Group_4__1__Impl )
            // InternalQL.g:2465:2: rule__BasicBinaryExpression__Group_4__1__Impl
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
    // InternalQL.g:2471:1: rule__BasicBinaryExpression__Group_4__1__Impl : ( ( rule__BasicBinaryExpression__ResultTypeAssignment_4_1 ) ) ;
    public final void rule__BasicBinaryExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2475:1: ( ( ( rule__BasicBinaryExpression__ResultTypeAssignment_4_1 ) ) )
            // InternalQL.g:2476:1: ( ( rule__BasicBinaryExpression__ResultTypeAssignment_4_1 ) )
            {
            // InternalQL.g:2476:1: ( ( rule__BasicBinaryExpression__ResultTypeAssignment_4_1 ) )
            // InternalQL.g:2477:2: ( rule__BasicBinaryExpression__ResultTypeAssignment_4_1 )
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getResultTypeAssignment_4_1()); 
            // InternalQL.g:2478:2: ( rule__BasicBinaryExpression__ResultTypeAssignment_4_1 )
            // InternalQL.g:2478:3: rule__BasicBinaryExpression__ResultTypeAssignment_4_1
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
    // InternalQL.g:2487:1: rule__ConstantCall__Group__0 : rule__ConstantCall__Group__0__Impl rule__ConstantCall__Group__1 ;
    public final void rule__ConstantCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2491:1: ( rule__ConstantCall__Group__0__Impl rule__ConstantCall__Group__1 )
            // InternalQL.g:2492:2: rule__ConstantCall__Group__0__Impl rule__ConstantCall__Group__1
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
    // InternalQL.g:2499:1: rule__ConstantCall__Group__0__Impl : ( () ) ;
    public final void rule__ConstantCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2503:1: ( ( () ) )
            // InternalQL.g:2504:1: ( () )
            {
            // InternalQL.g:2504:1: ( () )
            // InternalQL.g:2505:2: ()
            {
             before(grammarAccess.getConstantCallAccess().getConstantCallAction_0()); 
            // InternalQL.g:2506:2: ()
            // InternalQL.g:2506:3: 
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
    // InternalQL.g:2514:1: rule__ConstantCall__Group__1 : rule__ConstantCall__Group__1__Impl rule__ConstantCall__Group__2 ;
    public final void rule__ConstantCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2518:1: ( rule__ConstantCall__Group__1__Impl rule__ConstantCall__Group__2 )
            // InternalQL.g:2519:2: rule__ConstantCall__Group__1__Impl rule__ConstantCall__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalQL.g:2526:1: rule__ConstantCall__Group__1__Impl : ( 'ConstantCall' ) ;
    public final void rule__ConstantCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2530:1: ( ( 'ConstantCall' ) )
            // InternalQL.g:2531:1: ( 'ConstantCall' )
            {
            // InternalQL.g:2531:1: ( 'ConstantCall' )
            // InternalQL.g:2532:2: 'ConstantCall'
            {
             before(grammarAccess.getConstantCallAccess().getConstantCallKeyword_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalQL.g:2541:1: rule__ConstantCall__Group__2 : rule__ConstantCall__Group__2__Impl rule__ConstantCall__Group__3 ;
    public final void rule__ConstantCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2545:1: ( rule__ConstantCall__Group__2__Impl rule__ConstantCall__Group__3 )
            // InternalQL.g:2546:2: rule__ConstantCall__Group__2__Impl rule__ConstantCall__Group__3
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
    // InternalQL.g:2553:1: rule__ConstantCall__Group__2__Impl : ( '{' ) ;
    public final void rule__ConstantCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2557:1: ( ( '{' ) )
            // InternalQL.g:2558:1: ( '{' )
            {
            // InternalQL.g:2558:1: ( '{' )
            // InternalQL.g:2559:2: '{'
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
    // InternalQL.g:2568:1: rule__ConstantCall__Group__3 : rule__ConstantCall__Group__3__Impl rule__ConstantCall__Group__4 ;
    public final void rule__ConstantCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2572:1: ( rule__ConstantCall__Group__3__Impl rule__ConstantCall__Group__4 )
            // InternalQL.g:2573:2: rule__ConstantCall__Group__3__Impl rule__ConstantCall__Group__4
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
    // InternalQL.g:2580:1: rule__ConstantCall__Group__3__Impl : ( ( rule__ConstantCall__Group_3__0 )? ) ;
    public final void rule__ConstantCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2584:1: ( ( ( rule__ConstantCall__Group_3__0 )? ) )
            // InternalQL.g:2585:1: ( ( rule__ConstantCall__Group_3__0 )? )
            {
            // InternalQL.g:2585:1: ( ( rule__ConstantCall__Group_3__0 )? )
            // InternalQL.g:2586:2: ( rule__ConstantCall__Group_3__0 )?
            {
             before(grammarAccess.getConstantCallAccess().getGroup_3()); 
            // InternalQL.g:2587:2: ( rule__ConstantCall__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==43) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalQL.g:2587:3: rule__ConstantCall__Group_3__0
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
    // InternalQL.g:2595:1: rule__ConstantCall__Group__4 : rule__ConstantCall__Group__4__Impl rule__ConstantCall__Group__5 ;
    public final void rule__ConstantCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2599:1: ( rule__ConstantCall__Group__4__Impl rule__ConstantCall__Group__5 )
            // InternalQL.g:2600:2: rule__ConstantCall__Group__4__Impl rule__ConstantCall__Group__5
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
    // InternalQL.g:2607:1: rule__ConstantCall__Group__4__Impl : ( ( rule__ConstantCall__Group_4__0 )? ) ;
    public final void rule__ConstantCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2611:1: ( ( ( rule__ConstantCall__Group_4__0 )? ) )
            // InternalQL.g:2612:1: ( ( rule__ConstantCall__Group_4__0 )? )
            {
            // InternalQL.g:2612:1: ( ( rule__ConstantCall__Group_4__0 )? )
            // InternalQL.g:2613:2: ( rule__ConstantCall__Group_4__0 )?
            {
             before(grammarAccess.getConstantCallAccess().getGroup_4()); 
            // InternalQL.g:2614:2: ( rule__ConstantCall__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==45) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalQL.g:2614:3: rule__ConstantCall__Group_4__0
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
    // InternalQL.g:2622:1: rule__ConstantCall__Group__5 : rule__ConstantCall__Group__5__Impl ;
    public final void rule__ConstantCall__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2626:1: ( rule__ConstantCall__Group__5__Impl )
            // InternalQL.g:2627:2: rule__ConstantCall__Group__5__Impl
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
    // InternalQL.g:2633:1: rule__ConstantCall__Group__5__Impl : ( '}' ) ;
    public final void rule__ConstantCall__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2637:1: ( ( '}' ) )
            // InternalQL.g:2638:1: ( '}' )
            {
            // InternalQL.g:2638:1: ( '}' )
            // InternalQL.g:2639:2: '}'
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
    // InternalQL.g:2649:1: rule__ConstantCall__Group_3__0 : rule__ConstantCall__Group_3__0__Impl rule__ConstantCall__Group_3__1 ;
    public final void rule__ConstantCall__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2653:1: ( rule__ConstantCall__Group_3__0__Impl rule__ConstantCall__Group_3__1 )
            // InternalQL.g:2654:2: rule__ConstantCall__Group_3__0__Impl rule__ConstantCall__Group_3__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalQL.g:2661:1: rule__ConstantCall__Group_3__0__Impl : ( 'resultType' ) ;
    public final void rule__ConstantCall__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2665:1: ( ( 'resultType' ) )
            // InternalQL.g:2666:1: ( 'resultType' )
            {
            // InternalQL.g:2666:1: ( 'resultType' )
            // InternalQL.g:2667:2: 'resultType'
            {
             before(grammarAccess.getConstantCallAccess().getResultTypeKeyword_3_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalQL.g:2676:1: rule__ConstantCall__Group_3__1 : rule__ConstantCall__Group_3__1__Impl ;
    public final void rule__ConstantCall__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2680:1: ( rule__ConstantCall__Group_3__1__Impl )
            // InternalQL.g:2681:2: rule__ConstantCall__Group_3__1__Impl
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
    // InternalQL.g:2687:1: rule__ConstantCall__Group_3__1__Impl : ( ( rule__ConstantCall__ResultTypeAssignment_3_1 ) ) ;
    public final void rule__ConstantCall__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2691:1: ( ( ( rule__ConstantCall__ResultTypeAssignment_3_1 ) ) )
            // InternalQL.g:2692:1: ( ( rule__ConstantCall__ResultTypeAssignment_3_1 ) )
            {
            // InternalQL.g:2692:1: ( ( rule__ConstantCall__ResultTypeAssignment_3_1 ) )
            // InternalQL.g:2693:2: ( rule__ConstantCall__ResultTypeAssignment_3_1 )
            {
             before(grammarAccess.getConstantCallAccess().getResultTypeAssignment_3_1()); 
            // InternalQL.g:2694:2: ( rule__ConstantCall__ResultTypeAssignment_3_1 )
            // InternalQL.g:2694:3: rule__ConstantCall__ResultTypeAssignment_3_1
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
    // InternalQL.g:2703:1: rule__ConstantCall__Group_4__0 : rule__ConstantCall__Group_4__0__Impl rule__ConstantCall__Group_4__1 ;
    public final void rule__ConstantCall__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2707:1: ( rule__ConstantCall__Group_4__0__Impl rule__ConstantCall__Group_4__1 )
            // InternalQL.g:2708:2: rule__ConstantCall__Group_4__0__Impl rule__ConstantCall__Group_4__1
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
    // InternalQL.g:2715:1: rule__ConstantCall__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__ConstantCall__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2719:1: ( ( 'value' ) )
            // InternalQL.g:2720:1: ( 'value' )
            {
            // InternalQL.g:2720:1: ( 'value' )
            // InternalQL.g:2721:2: 'value'
            {
             before(grammarAccess.getConstantCallAccess().getValueKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalQL.g:2730:1: rule__ConstantCall__Group_4__1 : rule__ConstantCall__Group_4__1__Impl ;
    public final void rule__ConstantCall__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2734:1: ( rule__ConstantCall__Group_4__1__Impl )
            // InternalQL.g:2735:2: rule__ConstantCall__Group_4__1__Impl
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
    // InternalQL.g:2741:1: rule__ConstantCall__Group_4__1__Impl : ( ( rule__ConstantCall__ValueAssignment_4_1 ) ) ;
    public final void rule__ConstantCall__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2745:1: ( ( ( rule__ConstantCall__ValueAssignment_4_1 ) ) )
            // InternalQL.g:2746:1: ( ( rule__ConstantCall__ValueAssignment_4_1 ) )
            {
            // InternalQL.g:2746:1: ( ( rule__ConstantCall__ValueAssignment_4_1 ) )
            // InternalQL.g:2747:2: ( rule__ConstantCall__ValueAssignment_4_1 )
            {
             before(grammarAccess.getConstantCallAccess().getValueAssignment_4_1()); 
            // InternalQL.g:2748:2: ( rule__ConstantCall__ValueAssignment_4_1 )
            // InternalQL.g:2748:3: rule__ConstantCall__ValueAssignment_4_1
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
    // InternalQL.g:2757:1: rule__BasicUnaryExpression__Group__0 : rule__BasicUnaryExpression__Group__0__Impl rule__BasicUnaryExpression__Group__1 ;
    public final void rule__BasicUnaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2761:1: ( rule__BasicUnaryExpression__Group__0__Impl rule__BasicUnaryExpression__Group__1 )
            // InternalQL.g:2762:2: rule__BasicUnaryExpression__Group__0__Impl rule__BasicUnaryExpression__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalQL.g:2769:1: rule__BasicUnaryExpression__Group__0__Impl : ( 'BasicUnaryExpression' ) ;
    public final void rule__BasicUnaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2773:1: ( ( 'BasicUnaryExpression' ) )
            // InternalQL.g:2774:1: ( 'BasicUnaryExpression' )
            {
            // InternalQL.g:2774:1: ( 'BasicUnaryExpression' )
            // InternalQL.g:2775:2: 'BasicUnaryExpression'
            {
             before(grammarAccess.getBasicUnaryExpressionAccess().getBasicUnaryExpressionKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalQL.g:2784:1: rule__BasicUnaryExpression__Group__1 : rule__BasicUnaryExpression__Group__1__Impl rule__BasicUnaryExpression__Group__2 ;
    public final void rule__BasicUnaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2788:1: ( rule__BasicUnaryExpression__Group__1__Impl rule__BasicUnaryExpression__Group__2 )
            // InternalQL.g:2789:2: rule__BasicUnaryExpression__Group__1__Impl rule__BasicUnaryExpression__Group__2
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
    // InternalQL.g:2796:1: rule__BasicUnaryExpression__Group__1__Impl : ( '{' ) ;
    public final void rule__BasicUnaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2800:1: ( ( '{' ) )
            // InternalQL.g:2801:1: ( '{' )
            {
            // InternalQL.g:2801:1: ( '{' )
            // InternalQL.g:2802:2: '{'
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
    // InternalQL.g:2811:1: rule__BasicUnaryExpression__Group__2 : rule__BasicUnaryExpression__Group__2__Impl rule__BasicUnaryExpression__Group__3 ;
    public final void rule__BasicUnaryExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2815:1: ( rule__BasicUnaryExpression__Group__2__Impl rule__BasicUnaryExpression__Group__3 )
            // InternalQL.g:2816:2: rule__BasicUnaryExpression__Group__2__Impl rule__BasicUnaryExpression__Group__3
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
    // InternalQL.g:2823:1: rule__BasicUnaryExpression__Group__2__Impl : ( ( rule__BasicUnaryExpression__Group_2__0 )? ) ;
    public final void rule__BasicUnaryExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2827:1: ( ( ( rule__BasicUnaryExpression__Group_2__0 )? ) )
            // InternalQL.g:2828:1: ( ( rule__BasicUnaryExpression__Group_2__0 )? )
            {
            // InternalQL.g:2828:1: ( ( rule__BasicUnaryExpression__Group_2__0 )? )
            // InternalQL.g:2829:2: ( rule__BasicUnaryExpression__Group_2__0 )?
            {
             before(grammarAccess.getBasicUnaryExpressionAccess().getGroup_2()); 
            // InternalQL.g:2830:2: ( rule__BasicUnaryExpression__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==40) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalQL.g:2830:3: rule__BasicUnaryExpression__Group_2__0
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
    // InternalQL.g:2838:1: rule__BasicUnaryExpression__Group__3 : rule__BasicUnaryExpression__Group__3__Impl rule__BasicUnaryExpression__Group__4 ;
    public final void rule__BasicUnaryExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2842:1: ( rule__BasicUnaryExpression__Group__3__Impl rule__BasicUnaryExpression__Group__4 )
            // InternalQL.g:2843:2: rule__BasicUnaryExpression__Group__3__Impl rule__BasicUnaryExpression__Group__4
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
    // InternalQL.g:2850:1: rule__BasicUnaryExpression__Group__3__Impl : ( ( rule__BasicUnaryExpression__Group_3__0 )? ) ;
    public final void rule__BasicUnaryExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2854:1: ( ( ( rule__BasicUnaryExpression__Group_3__0 )? ) )
            // InternalQL.g:2855:1: ( ( rule__BasicUnaryExpression__Group_3__0 )? )
            {
            // InternalQL.g:2855:1: ( ( rule__BasicUnaryExpression__Group_3__0 )? )
            // InternalQL.g:2856:2: ( rule__BasicUnaryExpression__Group_3__0 )?
            {
             before(grammarAccess.getBasicUnaryExpressionAccess().getGroup_3()); 
            // InternalQL.g:2857:2: ( rule__BasicUnaryExpression__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==43) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalQL.g:2857:3: rule__BasicUnaryExpression__Group_3__0
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
    // InternalQL.g:2865:1: rule__BasicUnaryExpression__Group__4 : rule__BasicUnaryExpression__Group__4__Impl rule__BasicUnaryExpression__Group__5 ;
    public final void rule__BasicUnaryExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2869:1: ( rule__BasicUnaryExpression__Group__4__Impl rule__BasicUnaryExpression__Group__5 )
            // InternalQL.g:2870:2: rule__BasicUnaryExpression__Group__4__Impl rule__BasicUnaryExpression__Group__5
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
    // InternalQL.g:2877:1: rule__BasicUnaryExpression__Group__4__Impl : ( 'operand' ) ;
    public final void rule__BasicUnaryExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2881:1: ( ( 'operand' ) )
            // InternalQL.g:2882:1: ( 'operand' )
            {
            // InternalQL.g:2882:1: ( 'operand' )
            // InternalQL.g:2883:2: 'operand'
            {
             before(grammarAccess.getBasicUnaryExpressionAccess().getOperandKeyword_4()); 
            match(input,47,FOLLOW_2); 
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
    // InternalQL.g:2892:1: rule__BasicUnaryExpression__Group__5 : rule__BasicUnaryExpression__Group__5__Impl rule__BasicUnaryExpression__Group__6 ;
    public final void rule__BasicUnaryExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2896:1: ( rule__BasicUnaryExpression__Group__5__Impl rule__BasicUnaryExpression__Group__6 )
            // InternalQL.g:2897:2: rule__BasicUnaryExpression__Group__5__Impl rule__BasicUnaryExpression__Group__6
            {
            pushFollow(FOLLOW_26);
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
    // InternalQL.g:2904:1: rule__BasicUnaryExpression__Group__5__Impl : ( ( rule__BasicUnaryExpression__OperandAssignment_5 ) ) ;
    public final void rule__BasicUnaryExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2908:1: ( ( ( rule__BasicUnaryExpression__OperandAssignment_5 ) ) )
            // InternalQL.g:2909:1: ( ( rule__BasicUnaryExpression__OperandAssignment_5 ) )
            {
            // InternalQL.g:2909:1: ( ( rule__BasicUnaryExpression__OperandAssignment_5 ) )
            // InternalQL.g:2910:2: ( rule__BasicUnaryExpression__OperandAssignment_5 )
            {
             before(grammarAccess.getBasicUnaryExpressionAccess().getOperandAssignment_5()); 
            // InternalQL.g:2911:2: ( rule__BasicUnaryExpression__OperandAssignment_5 )
            // InternalQL.g:2911:3: rule__BasicUnaryExpression__OperandAssignment_5
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
    // InternalQL.g:2919:1: rule__BasicUnaryExpression__Group__6 : rule__BasicUnaryExpression__Group__6__Impl ;
    public final void rule__BasicUnaryExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2923:1: ( rule__BasicUnaryExpression__Group__6__Impl )
            // InternalQL.g:2924:2: rule__BasicUnaryExpression__Group__6__Impl
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
    // InternalQL.g:2930:1: rule__BasicUnaryExpression__Group__6__Impl : ( '}' ) ;
    public final void rule__BasicUnaryExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2934:1: ( ( '}' ) )
            // InternalQL.g:2935:1: ( '}' )
            {
            // InternalQL.g:2935:1: ( '}' )
            // InternalQL.g:2936:2: '}'
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
    // InternalQL.g:2946:1: rule__BasicUnaryExpression__Group_2__0 : rule__BasicUnaryExpression__Group_2__0__Impl rule__BasicUnaryExpression__Group_2__1 ;
    public final void rule__BasicUnaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2950:1: ( rule__BasicUnaryExpression__Group_2__0__Impl rule__BasicUnaryExpression__Group_2__1 )
            // InternalQL.g:2951:2: rule__BasicUnaryExpression__Group_2__0__Impl rule__BasicUnaryExpression__Group_2__1
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
    // InternalQL.g:2958:1: rule__BasicUnaryExpression__Group_2__0__Impl : ( 'operator' ) ;
    public final void rule__BasicUnaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2962:1: ( ( 'operator' ) )
            // InternalQL.g:2963:1: ( 'operator' )
            {
            // InternalQL.g:2963:1: ( 'operator' )
            // InternalQL.g:2964:2: 'operator'
            {
             before(grammarAccess.getBasicUnaryExpressionAccess().getOperatorKeyword_2_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalQL.g:2973:1: rule__BasicUnaryExpression__Group_2__1 : rule__BasicUnaryExpression__Group_2__1__Impl ;
    public final void rule__BasicUnaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2977:1: ( rule__BasicUnaryExpression__Group_2__1__Impl )
            // InternalQL.g:2978:2: rule__BasicUnaryExpression__Group_2__1__Impl
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
    // InternalQL.g:2984:1: rule__BasicUnaryExpression__Group_2__1__Impl : ( ( rule__BasicUnaryExpression__OperatorAssignment_2_1 ) ) ;
    public final void rule__BasicUnaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2988:1: ( ( ( rule__BasicUnaryExpression__OperatorAssignment_2_1 ) ) )
            // InternalQL.g:2989:1: ( ( rule__BasicUnaryExpression__OperatorAssignment_2_1 ) )
            {
            // InternalQL.g:2989:1: ( ( rule__BasicUnaryExpression__OperatorAssignment_2_1 ) )
            // InternalQL.g:2990:2: ( rule__BasicUnaryExpression__OperatorAssignment_2_1 )
            {
             before(grammarAccess.getBasicUnaryExpressionAccess().getOperatorAssignment_2_1()); 
            // InternalQL.g:2991:2: ( rule__BasicUnaryExpression__OperatorAssignment_2_1 )
            // InternalQL.g:2991:3: rule__BasicUnaryExpression__OperatorAssignment_2_1
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
    // InternalQL.g:3000:1: rule__BasicUnaryExpression__Group_3__0 : rule__BasicUnaryExpression__Group_3__0__Impl rule__BasicUnaryExpression__Group_3__1 ;
    public final void rule__BasicUnaryExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3004:1: ( rule__BasicUnaryExpression__Group_3__0__Impl rule__BasicUnaryExpression__Group_3__1 )
            // InternalQL.g:3005:2: rule__BasicUnaryExpression__Group_3__0__Impl rule__BasicUnaryExpression__Group_3__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalQL.g:3012:1: rule__BasicUnaryExpression__Group_3__0__Impl : ( 'resultType' ) ;
    public final void rule__BasicUnaryExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3016:1: ( ( 'resultType' ) )
            // InternalQL.g:3017:1: ( 'resultType' )
            {
            // InternalQL.g:3017:1: ( 'resultType' )
            // InternalQL.g:3018:2: 'resultType'
            {
             before(grammarAccess.getBasicUnaryExpressionAccess().getResultTypeKeyword_3_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalQL.g:3027:1: rule__BasicUnaryExpression__Group_3__1 : rule__BasicUnaryExpression__Group_3__1__Impl ;
    public final void rule__BasicUnaryExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3031:1: ( rule__BasicUnaryExpression__Group_3__1__Impl )
            // InternalQL.g:3032:2: rule__BasicUnaryExpression__Group_3__1__Impl
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
    // InternalQL.g:3038:1: rule__BasicUnaryExpression__Group_3__1__Impl : ( ( rule__BasicUnaryExpression__ResultTypeAssignment_3_1 ) ) ;
    public final void rule__BasicUnaryExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3042:1: ( ( ( rule__BasicUnaryExpression__ResultTypeAssignment_3_1 ) ) )
            // InternalQL.g:3043:1: ( ( rule__BasicUnaryExpression__ResultTypeAssignment_3_1 ) )
            {
            // InternalQL.g:3043:1: ( ( rule__BasicUnaryExpression__ResultTypeAssignment_3_1 ) )
            // InternalQL.g:3044:2: ( rule__BasicUnaryExpression__ResultTypeAssignment_3_1 )
            {
             before(grammarAccess.getBasicUnaryExpressionAccess().getResultTypeAssignment_3_1()); 
            // InternalQL.g:3045:2: ( rule__BasicUnaryExpression__ResultTypeAssignment_3_1 )
            // InternalQL.g:3045:3: rule__BasicUnaryExpression__ResultTypeAssignment_3_1
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
    // InternalQL.g:3054:1: rule__QuestionCall__Group__0 : rule__QuestionCall__Group__0__Impl rule__QuestionCall__Group__1 ;
    public final void rule__QuestionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3058:1: ( rule__QuestionCall__Group__0__Impl rule__QuestionCall__Group__1 )
            // InternalQL.g:3059:2: rule__QuestionCall__Group__0__Impl rule__QuestionCall__Group__1
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
    // InternalQL.g:3066:1: rule__QuestionCall__Group__0__Impl : ( 'QuestionCall' ) ;
    public final void rule__QuestionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3070:1: ( ( 'QuestionCall' ) )
            // InternalQL.g:3071:1: ( 'QuestionCall' )
            {
            // InternalQL.g:3071:1: ( 'QuestionCall' )
            // InternalQL.g:3072:2: 'QuestionCall'
            {
             before(grammarAccess.getQuestionCallAccess().getQuestionCallKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalQL.g:3081:1: rule__QuestionCall__Group__1 : rule__QuestionCall__Group__1__Impl rule__QuestionCall__Group__2 ;
    public final void rule__QuestionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3085:1: ( rule__QuestionCall__Group__1__Impl rule__QuestionCall__Group__2 )
            // InternalQL.g:3086:2: rule__QuestionCall__Group__1__Impl rule__QuestionCall__Group__2
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
    // InternalQL.g:3093:1: rule__QuestionCall__Group__1__Impl : ( '{' ) ;
    public final void rule__QuestionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3097:1: ( ( '{' ) )
            // InternalQL.g:3098:1: ( '{' )
            {
            // InternalQL.g:3098:1: ( '{' )
            // InternalQL.g:3099:2: '{'
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
    // InternalQL.g:3108:1: rule__QuestionCall__Group__2 : rule__QuestionCall__Group__2__Impl rule__QuestionCall__Group__3 ;
    public final void rule__QuestionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3112:1: ( rule__QuestionCall__Group__2__Impl rule__QuestionCall__Group__3 )
            // InternalQL.g:3113:2: rule__QuestionCall__Group__2__Impl rule__QuestionCall__Group__3
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
    // InternalQL.g:3120:1: rule__QuestionCall__Group__2__Impl : ( ( rule__QuestionCall__Group_2__0 )? ) ;
    public final void rule__QuestionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3124:1: ( ( ( rule__QuestionCall__Group_2__0 )? ) )
            // InternalQL.g:3125:1: ( ( rule__QuestionCall__Group_2__0 )? )
            {
            // InternalQL.g:3125:1: ( ( rule__QuestionCall__Group_2__0 )? )
            // InternalQL.g:3126:2: ( rule__QuestionCall__Group_2__0 )?
            {
             before(grammarAccess.getQuestionCallAccess().getGroup_2()); 
            // InternalQL.g:3127:2: ( rule__QuestionCall__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==43) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalQL.g:3127:3: rule__QuestionCall__Group_2__0
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
    // InternalQL.g:3135:1: rule__QuestionCall__Group__3 : rule__QuestionCall__Group__3__Impl rule__QuestionCall__Group__4 ;
    public final void rule__QuestionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3139:1: ( rule__QuestionCall__Group__3__Impl rule__QuestionCall__Group__4 )
            // InternalQL.g:3140:2: rule__QuestionCall__Group__3__Impl rule__QuestionCall__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalQL.g:3147:1: rule__QuestionCall__Group__3__Impl : ( 'question' ) ;
    public final void rule__QuestionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3151:1: ( ( 'question' ) )
            // InternalQL.g:3152:1: ( 'question' )
            {
            // InternalQL.g:3152:1: ( 'question' )
            // InternalQL.g:3153:2: 'question'
            {
             before(grammarAccess.getQuestionCallAccess().getQuestionKeyword_3()); 
            match(input,49,FOLLOW_2); 
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
    // InternalQL.g:3162:1: rule__QuestionCall__Group__4 : rule__QuestionCall__Group__4__Impl rule__QuestionCall__Group__5 ;
    public final void rule__QuestionCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3166:1: ( rule__QuestionCall__Group__4__Impl rule__QuestionCall__Group__5 )
            // InternalQL.g:3167:2: rule__QuestionCall__Group__4__Impl rule__QuestionCall__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalQL.g:3174:1: rule__QuestionCall__Group__4__Impl : ( ( rule__QuestionCall__QuestionAssignment_4 ) ) ;
    public final void rule__QuestionCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3178:1: ( ( ( rule__QuestionCall__QuestionAssignment_4 ) ) )
            // InternalQL.g:3179:1: ( ( rule__QuestionCall__QuestionAssignment_4 ) )
            {
            // InternalQL.g:3179:1: ( ( rule__QuestionCall__QuestionAssignment_4 ) )
            // InternalQL.g:3180:2: ( rule__QuestionCall__QuestionAssignment_4 )
            {
             before(grammarAccess.getQuestionCallAccess().getQuestionAssignment_4()); 
            // InternalQL.g:3181:2: ( rule__QuestionCall__QuestionAssignment_4 )
            // InternalQL.g:3181:3: rule__QuestionCall__QuestionAssignment_4
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
    // InternalQL.g:3189:1: rule__QuestionCall__Group__5 : rule__QuestionCall__Group__5__Impl ;
    public final void rule__QuestionCall__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3193:1: ( rule__QuestionCall__Group__5__Impl )
            // InternalQL.g:3194:2: rule__QuestionCall__Group__5__Impl
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
    // InternalQL.g:3200:1: rule__QuestionCall__Group__5__Impl : ( '}' ) ;
    public final void rule__QuestionCall__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3204:1: ( ( '}' ) )
            // InternalQL.g:3205:1: ( '}' )
            {
            // InternalQL.g:3205:1: ( '}' )
            // InternalQL.g:3206:2: '}'
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
    // InternalQL.g:3216:1: rule__QuestionCall__Group_2__0 : rule__QuestionCall__Group_2__0__Impl rule__QuestionCall__Group_2__1 ;
    public final void rule__QuestionCall__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3220:1: ( rule__QuestionCall__Group_2__0__Impl rule__QuestionCall__Group_2__1 )
            // InternalQL.g:3221:2: rule__QuestionCall__Group_2__0__Impl rule__QuestionCall__Group_2__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalQL.g:3228:1: rule__QuestionCall__Group_2__0__Impl : ( 'resultType' ) ;
    public final void rule__QuestionCall__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3232:1: ( ( 'resultType' ) )
            // InternalQL.g:3233:1: ( 'resultType' )
            {
            // InternalQL.g:3233:1: ( 'resultType' )
            // InternalQL.g:3234:2: 'resultType'
            {
             before(grammarAccess.getQuestionCallAccess().getResultTypeKeyword_2_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalQL.g:3243:1: rule__QuestionCall__Group_2__1 : rule__QuestionCall__Group_2__1__Impl ;
    public final void rule__QuestionCall__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3247:1: ( rule__QuestionCall__Group_2__1__Impl )
            // InternalQL.g:3248:2: rule__QuestionCall__Group_2__1__Impl
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
    // InternalQL.g:3254:1: rule__QuestionCall__Group_2__1__Impl : ( ( rule__QuestionCall__ResultTypeAssignment_2_1 ) ) ;
    public final void rule__QuestionCall__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3258:1: ( ( ( rule__QuestionCall__ResultTypeAssignment_2_1 ) ) )
            // InternalQL.g:3259:1: ( ( rule__QuestionCall__ResultTypeAssignment_2_1 ) )
            {
            // InternalQL.g:3259:1: ( ( rule__QuestionCall__ResultTypeAssignment_2_1 ) )
            // InternalQL.g:3260:2: ( rule__QuestionCall__ResultTypeAssignment_2_1 )
            {
             before(grammarAccess.getQuestionCallAccess().getResultTypeAssignment_2_1()); 
            // InternalQL.g:3261:2: ( rule__QuestionCall__ResultTypeAssignment_2_1 )
            // InternalQL.g:3261:3: rule__QuestionCall__ResultTypeAssignment_2_1
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
    // InternalQL.g:3270:1: rule__BooleanValueType__Group__0 : rule__BooleanValueType__Group__0__Impl rule__BooleanValueType__Group__1 ;
    public final void rule__BooleanValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3274:1: ( rule__BooleanValueType__Group__0__Impl rule__BooleanValueType__Group__1 )
            // InternalQL.g:3275:2: rule__BooleanValueType__Group__0__Impl rule__BooleanValueType__Group__1
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
    // InternalQL.g:3282:1: rule__BooleanValueType__Group__0__Impl : ( () ) ;
    public final void rule__BooleanValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3286:1: ( ( () ) )
            // InternalQL.g:3287:1: ( () )
            {
            // InternalQL.g:3287:1: ( () )
            // InternalQL.g:3288:2: ()
            {
             before(grammarAccess.getBooleanValueTypeAccess().getBooleanValueTypeAction_0()); 
            // InternalQL.g:3289:2: ()
            // InternalQL.g:3289:3: 
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
    // InternalQL.g:3297:1: rule__BooleanValueType__Group__1 : rule__BooleanValueType__Group__1__Impl rule__BooleanValueType__Group__2 ;
    public final void rule__BooleanValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3301:1: ( rule__BooleanValueType__Group__1__Impl rule__BooleanValueType__Group__2 )
            // InternalQL.g:3302:2: rule__BooleanValueType__Group__1__Impl rule__BooleanValueType__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalQL.g:3309:1: rule__BooleanValueType__Group__1__Impl : ( 'booleanType' ) ;
    public final void rule__BooleanValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3313:1: ( ( 'booleanType' ) )
            // InternalQL.g:3314:1: ( 'booleanType' )
            {
            // InternalQL.g:3314:1: ( 'booleanType' )
            // InternalQL.g:3315:2: 'booleanType'
            {
             before(grammarAccess.getBooleanValueTypeAccess().getBooleanTypeKeyword_1()); 
            match(input,50,FOLLOW_2); 
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
    // InternalQL.g:3324:1: rule__BooleanValueType__Group__2 : rule__BooleanValueType__Group__2__Impl rule__BooleanValueType__Group__3 ;
    public final void rule__BooleanValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3328:1: ( rule__BooleanValueType__Group__2__Impl rule__BooleanValueType__Group__3 )
            // InternalQL.g:3329:2: rule__BooleanValueType__Group__2__Impl rule__BooleanValueType__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalQL.g:3336:1: rule__BooleanValueType__Group__2__Impl : ( ( rule__BooleanValueType__NameAssignment_2 ) ) ;
    public final void rule__BooleanValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3340:1: ( ( ( rule__BooleanValueType__NameAssignment_2 ) ) )
            // InternalQL.g:3341:1: ( ( rule__BooleanValueType__NameAssignment_2 ) )
            {
            // InternalQL.g:3341:1: ( ( rule__BooleanValueType__NameAssignment_2 ) )
            // InternalQL.g:3342:2: ( rule__BooleanValueType__NameAssignment_2 )
            {
             before(grammarAccess.getBooleanValueTypeAccess().getNameAssignment_2()); 
            // InternalQL.g:3343:2: ( rule__BooleanValueType__NameAssignment_2 )
            // InternalQL.g:3343:3: rule__BooleanValueType__NameAssignment_2
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
    // InternalQL.g:3351:1: rule__BooleanValueType__Group__3 : rule__BooleanValueType__Group__3__Impl ;
    public final void rule__BooleanValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3355:1: ( rule__BooleanValueType__Group__3__Impl )
            // InternalQL.g:3356:2: rule__BooleanValueType__Group__3__Impl
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
    // InternalQL.g:3362:1: rule__BooleanValueType__Group__3__Impl : ( ( rule__BooleanValueType__Group_3__0 )? ) ;
    public final void rule__BooleanValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3366:1: ( ( ( rule__BooleanValueType__Group_3__0 )? ) )
            // InternalQL.g:3367:1: ( ( rule__BooleanValueType__Group_3__0 )? )
            {
            // InternalQL.g:3367:1: ( ( rule__BooleanValueType__Group_3__0 )? )
            // InternalQL.g:3368:2: ( rule__BooleanValueType__Group_3__0 )?
            {
             before(grammarAccess.getBooleanValueTypeAccess().getGroup_3()); 
            // InternalQL.g:3369:2: ( rule__BooleanValueType__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalQL.g:3369:3: rule__BooleanValueType__Group_3__0
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
    // InternalQL.g:3378:1: rule__BooleanValueType__Group_3__0 : rule__BooleanValueType__Group_3__0__Impl rule__BooleanValueType__Group_3__1 ;
    public final void rule__BooleanValueType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3382:1: ( rule__BooleanValueType__Group_3__0__Impl rule__BooleanValueType__Group_3__1 )
            // InternalQL.g:3383:2: rule__BooleanValueType__Group_3__0__Impl rule__BooleanValueType__Group_3__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalQL.g:3390:1: rule__BooleanValueType__Group_3__0__Impl : ( '{' ) ;
    public final void rule__BooleanValueType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3394:1: ( ( '{' ) )
            // InternalQL.g:3395:1: ( '{' )
            {
            // InternalQL.g:3395:1: ( '{' )
            // InternalQL.g:3396:2: '{'
            {
             before(grammarAccess.getBooleanValueTypeAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalQL.g:3405:1: rule__BooleanValueType__Group_3__1 : rule__BooleanValueType__Group_3__1__Impl rule__BooleanValueType__Group_3__2 ;
    public final void rule__BooleanValueType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3409:1: ( rule__BooleanValueType__Group_3__1__Impl rule__BooleanValueType__Group_3__2 )
            // InternalQL.g:3410:2: rule__BooleanValueType__Group_3__1__Impl rule__BooleanValueType__Group_3__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalQL.g:3417:1: rule__BooleanValueType__Group_3__1__Impl : ( ( rule__BooleanValueType__Group_3_1__0 )? ) ;
    public final void rule__BooleanValueType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3421:1: ( ( ( rule__BooleanValueType__Group_3_1__0 )? ) )
            // InternalQL.g:3422:1: ( ( rule__BooleanValueType__Group_3_1__0 )? )
            {
            // InternalQL.g:3422:1: ( ( rule__BooleanValueType__Group_3_1__0 )? )
            // InternalQL.g:3423:2: ( rule__BooleanValueType__Group_3_1__0 )?
            {
             before(grammarAccess.getBooleanValueTypeAccess().getGroup_3_1()); 
            // InternalQL.g:3424:2: ( rule__BooleanValueType__Group_3_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==38) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalQL.g:3424:3: rule__BooleanValueType__Group_3_1__0
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
    // InternalQL.g:3432:1: rule__BooleanValueType__Group_3__2 : rule__BooleanValueType__Group_3__2__Impl ;
    public final void rule__BooleanValueType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3436:1: ( rule__BooleanValueType__Group_3__2__Impl )
            // InternalQL.g:3437:2: rule__BooleanValueType__Group_3__2__Impl
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
    // InternalQL.g:3443:1: rule__BooleanValueType__Group_3__2__Impl : ( '}' ) ;
    public final void rule__BooleanValueType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3447:1: ( ( '}' ) )
            // InternalQL.g:3448:1: ( '}' )
            {
            // InternalQL.g:3448:1: ( '}' )
            // InternalQL.g:3449:2: '}'
            {
             before(grammarAccess.getBooleanValueTypeAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalQL.g:3459:1: rule__BooleanValueType__Group_3_1__0 : rule__BooleanValueType__Group_3_1__0__Impl rule__BooleanValueType__Group_3_1__1 ;
    public final void rule__BooleanValueType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3463:1: ( rule__BooleanValueType__Group_3_1__0__Impl rule__BooleanValueType__Group_3_1__1 )
            // InternalQL.g:3464:2: rule__BooleanValueType__Group_3_1__0__Impl rule__BooleanValueType__Group_3_1__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalQL.g:3471:1: rule__BooleanValueType__Group_3_1__0__Impl : ( 'unit' ) ;
    public final void rule__BooleanValueType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3475:1: ( ( 'unit' ) )
            // InternalQL.g:3476:1: ( 'unit' )
            {
            // InternalQL.g:3476:1: ( 'unit' )
            // InternalQL.g:3477:2: 'unit'
            {
             before(grammarAccess.getBooleanValueTypeAccess().getUnitKeyword_3_1_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalQL.g:3486:1: rule__BooleanValueType__Group_3_1__1 : rule__BooleanValueType__Group_3_1__1__Impl ;
    public final void rule__BooleanValueType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3490:1: ( rule__BooleanValueType__Group_3_1__1__Impl )
            // InternalQL.g:3491:2: rule__BooleanValueType__Group_3_1__1__Impl
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
    // InternalQL.g:3497:1: rule__BooleanValueType__Group_3_1__1__Impl : ( ( rule__BooleanValueType__UnitAssignment_3_1_1 ) ) ;
    public final void rule__BooleanValueType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3501:1: ( ( ( rule__BooleanValueType__UnitAssignment_3_1_1 ) ) )
            // InternalQL.g:3502:1: ( ( rule__BooleanValueType__UnitAssignment_3_1_1 ) )
            {
            // InternalQL.g:3502:1: ( ( rule__BooleanValueType__UnitAssignment_3_1_1 ) )
            // InternalQL.g:3503:2: ( rule__BooleanValueType__UnitAssignment_3_1_1 )
            {
             before(grammarAccess.getBooleanValueTypeAccess().getUnitAssignment_3_1_1()); 
            // InternalQL.g:3504:2: ( rule__BooleanValueType__UnitAssignment_3_1_1 )
            // InternalQL.g:3504:3: rule__BooleanValueType__UnitAssignment_3_1_1
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
    // InternalQL.g:3513:1: rule__IntegerValueType__Group__0 : rule__IntegerValueType__Group__0__Impl rule__IntegerValueType__Group__1 ;
    public final void rule__IntegerValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3517:1: ( rule__IntegerValueType__Group__0__Impl rule__IntegerValueType__Group__1 )
            // InternalQL.g:3518:2: rule__IntegerValueType__Group__0__Impl rule__IntegerValueType__Group__1
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
    // InternalQL.g:3525:1: rule__IntegerValueType__Group__0__Impl : ( () ) ;
    public final void rule__IntegerValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3529:1: ( ( () ) )
            // InternalQL.g:3530:1: ( () )
            {
            // InternalQL.g:3530:1: ( () )
            // InternalQL.g:3531:2: ()
            {
             before(grammarAccess.getIntegerValueTypeAccess().getIntegerValueTypeAction_0()); 
            // InternalQL.g:3532:2: ()
            // InternalQL.g:3532:3: 
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
    // InternalQL.g:3540:1: rule__IntegerValueType__Group__1 : rule__IntegerValueType__Group__1__Impl rule__IntegerValueType__Group__2 ;
    public final void rule__IntegerValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3544:1: ( rule__IntegerValueType__Group__1__Impl rule__IntegerValueType__Group__2 )
            // InternalQL.g:3545:2: rule__IntegerValueType__Group__1__Impl rule__IntegerValueType__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalQL.g:3552:1: rule__IntegerValueType__Group__1__Impl : ( 'integerType' ) ;
    public final void rule__IntegerValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3556:1: ( ( 'integerType' ) )
            // InternalQL.g:3557:1: ( 'integerType' )
            {
            // InternalQL.g:3557:1: ( 'integerType' )
            // InternalQL.g:3558:2: 'integerType'
            {
             before(grammarAccess.getIntegerValueTypeAccess().getIntegerTypeKeyword_1()); 
            match(input,51,FOLLOW_2); 
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
    // InternalQL.g:3567:1: rule__IntegerValueType__Group__2 : rule__IntegerValueType__Group__2__Impl rule__IntegerValueType__Group__3 ;
    public final void rule__IntegerValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3571:1: ( rule__IntegerValueType__Group__2__Impl rule__IntegerValueType__Group__3 )
            // InternalQL.g:3572:2: rule__IntegerValueType__Group__2__Impl rule__IntegerValueType__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalQL.g:3579:1: rule__IntegerValueType__Group__2__Impl : ( ( rule__IntegerValueType__NameAssignment_2 ) ) ;
    public final void rule__IntegerValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3583:1: ( ( ( rule__IntegerValueType__NameAssignment_2 ) ) )
            // InternalQL.g:3584:1: ( ( rule__IntegerValueType__NameAssignment_2 ) )
            {
            // InternalQL.g:3584:1: ( ( rule__IntegerValueType__NameAssignment_2 ) )
            // InternalQL.g:3585:2: ( rule__IntegerValueType__NameAssignment_2 )
            {
             before(grammarAccess.getIntegerValueTypeAccess().getNameAssignment_2()); 
            // InternalQL.g:3586:2: ( rule__IntegerValueType__NameAssignment_2 )
            // InternalQL.g:3586:3: rule__IntegerValueType__NameAssignment_2
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
    // InternalQL.g:3594:1: rule__IntegerValueType__Group__3 : rule__IntegerValueType__Group__3__Impl ;
    public final void rule__IntegerValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3598:1: ( rule__IntegerValueType__Group__3__Impl )
            // InternalQL.g:3599:2: rule__IntegerValueType__Group__3__Impl
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
    // InternalQL.g:3605:1: rule__IntegerValueType__Group__3__Impl : ( ( rule__IntegerValueType__Group_3__0 )? ) ;
    public final void rule__IntegerValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3609:1: ( ( ( rule__IntegerValueType__Group_3__0 )? ) )
            // InternalQL.g:3610:1: ( ( rule__IntegerValueType__Group_3__0 )? )
            {
            // InternalQL.g:3610:1: ( ( rule__IntegerValueType__Group_3__0 )? )
            // InternalQL.g:3611:2: ( rule__IntegerValueType__Group_3__0 )?
            {
             before(grammarAccess.getIntegerValueTypeAccess().getGroup_3()); 
            // InternalQL.g:3612:2: ( rule__IntegerValueType__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==29) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalQL.g:3612:3: rule__IntegerValueType__Group_3__0
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
    // InternalQL.g:3621:1: rule__IntegerValueType__Group_3__0 : rule__IntegerValueType__Group_3__0__Impl rule__IntegerValueType__Group_3__1 ;
    public final void rule__IntegerValueType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3625:1: ( rule__IntegerValueType__Group_3__0__Impl rule__IntegerValueType__Group_3__1 )
            // InternalQL.g:3626:2: rule__IntegerValueType__Group_3__0__Impl rule__IntegerValueType__Group_3__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalQL.g:3633:1: rule__IntegerValueType__Group_3__0__Impl : ( '{' ) ;
    public final void rule__IntegerValueType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3637:1: ( ( '{' ) )
            // InternalQL.g:3638:1: ( '{' )
            {
            // InternalQL.g:3638:1: ( '{' )
            // InternalQL.g:3639:2: '{'
            {
             before(grammarAccess.getIntegerValueTypeAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalQL.g:3648:1: rule__IntegerValueType__Group_3__1 : rule__IntegerValueType__Group_3__1__Impl rule__IntegerValueType__Group_3__2 ;
    public final void rule__IntegerValueType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3652:1: ( rule__IntegerValueType__Group_3__1__Impl rule__IntegerValueType__Group_3__2 )
            // InternalQL.g:3653:2: rule__IntegerValueType__Group_3__1__Impl rule__IntegerValueType__Group_3__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalQL.g:3660:1: rule__IntegerValueType__Group_3__1__Impl : ( ( rule__IntegerValueType__Group_3_1__0 )? ) ;
    public final void rule__IntegerValueType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3664:1: ( ( ( rule__IntegerValueType__Group_3_1__0 )? ) )
            // InternalQL.g:3665:1: ( ( rule__IntegerValueType__Group_3_1__0 )? )
            {
            // InternalQL.g:3665:1: ( ( rule__IntegerValueType__Group_3_1__0 )? )
            // InternalQL.g:3666:2: ( rule__IntegerValueType__Group_3_1__0 )?
            {
             before(grammarAccess.getIntegerValueTypeAccess().getGroup_3_1()); 
            // InternalQL.g:3667:2: ( rule__IntegerValueType__Group_3_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalQL.g:3667:3: rule__IntegerValueType__Group_3_1__0
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
    // InternalQL.g:3675:1: rule__IntegerValueType__Group_3__2 : rule__IntegerValueType__Group_3__2__Impl rule__IntegerValueType__Group_3__3 ;
    public final void rule__IntegerValueType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3679:1: ( rule__IntegerValueType__Group_3__2__Impl rule__IntegerValueType__Group_3__3 )
            // InternalQL.g:3680:2: rule__IntegerValueType__Group_3__2__Impl rule__IntegerValueType__Group_3__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalQL.g:3687:1: rule__IntegerValueType__Group_3__2__Impl : ( ( rule__IntegerValueType__Group_3_2__0 )? ) ;
    public final void rule__IntegerValueType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3691:1: ( ( ( rule__IntegerValueType__Group_3_2__0 )? ) )
            // InternalQL.g:3692:1: ( ( rule__IntegerValueType__Group_3_2__0 )? )
            {
            // InternalQL.g:3692:1: ( ( rule__IntegerValueType__Group_3_2__0 )? )
            // InternalQL.g:3693:2: ( rule__IntegerValueType__Group_3_2__0 )?
            {
             before(grammarAccess.getIntegerValueTypeAccess().getGroup_3_2()); 
            // InternalQL.g:3694:2: ( rule__IntegerValueType__Group_3_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==52) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalQL.g:3694:3: rule__IntegerValueType__Group_3_2__0
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
    // InternalQL.g:3702:1: rule__IntegerValueType__Group_3__3 : rule__IntegerValueType__Group_3__3__Impl rule__IntegerValueType__Group_3__4 ;
    public final void rule__IntegerValueType__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3706:1: ( rule__IntegerValueType__Group_3__3__Impl rule__IntegerValueType__Group_3__4 )
            // InternalQL.g:3707:2: rule__IntegerValueType__Group_3__3__Impl rule__IntegerValueType__Group_3__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalQL.g:3714:1: rule__IntegerValueType__Group_3__3__Impl : ( ( rule__IntegerValueType__Group_3_3__0 )? ) ;
    public final void rule__IntegerValueType__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3718:1: ( ( ( rule__IntegerValueType__Group_3_3__0 )? ) )
            // InternalQL.g:3719:1: ( ( rule__IntegerValueType__Group_3_3__0 )? )
            {
            // InternalQL.g:3719:1: ( ( rule__IntegerValueType__Group_3_3__0 )? )
            // InternalQL.g:3720:2: ( rule__IntegerValueType__Group_3_3__0 )?
            {
             before(grammarAccess.getIntegerValueTypeAccess().getGroup_3_3()); 
            // InternalQL.g:3721:2: ( rule__IntegerValueType__Group_3_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==53) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalQL.g:3721:3: rule__IntegerValueType__Group_3_3__0
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
    // InternalQL.g:3729:1: rule__IntegerValueType__Group_3__4 : rule__IntegerValueType__Group_3__4__Impl ;
    public final void rule__IntegerValueType__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3733:1: ( rule__IntegerValueType__Group_3__4__Impl )
            // InternalQL.g:3734:2: rule__IntegerValueType__Group_3__4__Impl
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
    // InternalQL.g:3740:1: rule__IntegerValueType__Group_3__4__Impl : ( '}' ) ;
    public final void rule__IntegerValueType__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3744:1: ( ( '}' ) )
            // InternalQL.g:3745:1: ( '}' )
            {
            // InternalQL.g:3745:1: ( '}' )
            // InternalQL.g:3746:2: '}'
            {
             before(grammarAccess.getIntegerValueTypeAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,30,FOLLOW_2); 
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
    // InternalQL.g:3756:1: rule__IntegerValueType__Group_3_1__0 : rule__IntegerValueType__Group_3_1__0__Impl rule__IntegerValueType__Group_3_1__1 ;
    public final void rule__IntegerValueType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3760:1: ( rule__IntegerValueType__Group_3_1__0__Impl rule__IntegerValueType__Group_3_1__1 )
            // InternalQL.g:3761:2: rule__IntegerValueType__Group_3_1__0__Impl rule__IntegerValueType__Group_3_1__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalQL.g:3768:1: rule__IntegerValueType__Group_3_1__0__Impl : ( 'unit' ) ;
    public final void rule__IntegerValueType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3772:1: ( ( 'unit' ) )
            // InternalQL.g:3773:1: ( 'unit' )
            {
            // InternalQL.g:3773:1: ( 'unit' )
            // InternalQL.g:3774:2: 'unit'
            {
             before(grammarAccess.getIntegerValueTypeAccess().getUnitKeyword_3_1_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalQL.g:3783:1: rule__IntegerValueType__Group_3_1__1 : rule__IntegerValueType__Group_3_1__1__Impl ;
    public final void rule__IntegerValueType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3787:1: ( rule__IntegerValueType__Group_3_1__1__Impl )
            // InternalQL.g:3788:2: rule__IntegerValueType__Group_3_1__1__Impl
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
    // InternalQL.g:3794:1: rule__IntegerValueType__Group_3_1__1__Impl : ( ( rule__IntegerValueType__UnitAssignment_3_1_1 ) ) ;
    public final void rule__IntegerValueType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3798:1: ( ( ( rule__IntegerValueType__UnitAssignment_3_1_1 ) ) )
            // InternalQL.g:3799:1: ( ( rule__IntegerValueType__UnitAssignment_3_1_1 ) )
            {
            // InternalQL.g:3799:1: ( ( rule__IntegerValueType__UnitAssignment_3_1_1 ) )
            // InternalQL.g:3800:2: ( rule__IntegerValueType__UnitAssignment_3_1_1 )
            {
             before(grammarAccess.getIntegerValueTypeAccess().getUnitAssignment_3_1_1()); 
            // InternalQL.g:3801:2: ( rule__IntegerValueType__UnitAssignment_3_1_1 )
            // InternalQL.g:3801:3: rule__IntegerValueType__UnitAssignment_3_1_1
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
    // InternalQL.g:3810:1: rule__IntegerValueType__Group_3_2__0 : rule__IntegerValueType__Group_3_2__0__Impl rule__IntegerValueType__Group_3_2__1 ;
    public final void rule__IntegerValueType__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3814:1: ( rule__IntegerValueType__Group_3_2__0__Impl rule__IntegerValueType__Group_3_2__1 )
            // InternalQL.g:3815:2: rule__IntegerValueType__Group_3_2__0__Impl rule__IntegerValueType__Group_3_2__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalQL.g:3822:1: rule__IntegerValueType__Group_3_2__0__Impl : ( 'min' ) ;
    public final void rule__IntegerValueType__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3826:1: ( ( 'min' ) )
            // InternalQL.g:3827:1: ( 'min' )
            {
            // InternalQL.g:3827:1: ( 'min' )
            // InternalQL.g:3828:2: 'min'
            {
             before(grammarAccess.getIntegerValueTypeAccess().getMinKeyword_3_2_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalQL.g:3837:1: rule__IntegerValueType__Group_3_2__1 : rule__IntegerValueType__Group_3_2__1__Impl ;
    public final void rule__IntegerValueType__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3841:1: ( rule__IntegerValueType__Group_3_2__1__Impl )
            // InternalQL.g:3842:2: rule__IntegerValueType__Group_3_2__1__Impl
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
    // InternalQL.g:3848:1: rule__IntegerValueType__Group_3_2__1__Impl : ( ( rule__IntegerValueType__MinAssignment_3_2_1 ) ) ;
    public final void rule__IntegerValueType__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3852:1: ( ( ( rule__IntegerValueType__MinAssignment_3_2_1 ) ) )
            // InternalQL.g:3853:1: ( ( rule__IntegerValueType__MinAssignment_3_2_1 ) )
            {
            // InternalQL.g:3853:1: ( ( rule__IntegerValueType__MinAssignment_3_2_1 ) )
            // InternalQL.g:3854:2: ( rule__IntegerValueType__MinAssignment_3_2_1 )
            {
             before(grammarAccess.getIntegerValueTypeAccess().getMinAssignment_3_2_1()); 
            // InternalQL.g:3855:2: ( rule__IntegerValueType__MinAssignment_3_2_1 )
            // InternalQL.g:3855:3: rule__IntegerValueType__MinAssignment_3_2_1
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
    // InternalQL.g:3864:1: rule__IntegerValueType__Group_3_3__0 : rule__IntegerValueType__Group_3_3__0__Impl rule__IntegerValueType__Group_3_3__1 ;
    public final void rule__IntegerValueType__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3868:1: ( rule__IntegerValueType__Group_3_3__0__Impl rule__IntegerValueType__Group_3_3__1 )
            // InternalQL.g:3869:2: rule__IntegerValueType__Group_3_3__0__Impl rule__IntegerValueType__Group_3_3__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalQL.g:3876:1: rule__IntegerValueType__Group_3_3__0__Impl : ( 'max' ) ;
    public final void rule__IntegerValueType__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3880:1: ( ( 'max' ) )
            // InternalQL.g:3881:1: ( 'max' )
            {
            // InternalQL.g:3881:1: ( 'max' )
            // InternalQL.g:3882:2: 'max'
            {
             before(grammarAccess.getIntegerValueTypeAccess().getMaxKeyword_3_3_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalQL.g:3891:1: rule__IntegerValueType__Group_3_3__1 : rule__IntegerValueType__Group_3_3__1__Impl ;
    public final void rule__IntegerValueType__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3895:1: ( rule__IntegerValueType__Group_3_3__1__Impl )
            // InternalQL.g:3896:2: rule__IntegerValueType__Group_3_3__1__Impl
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
    // InternalQL.g:3902:1: rule__IntegerValueType__Group_3_3__1__Impl : ( ( rule__IntegerValueType__MaxAssignment_3_3_1 ) ) ;
    public final void rule__IntegerValueType__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3906:1: ( ( ( rule__IntegerValueType__MaxAssignment_3_3_1 ) ) )
            // InternalQL.g:3907:1: ( ( rule__IntegerValueType__MaxAssignment_3_3_1 ) )
            {
            // InternalQL.g:3907:1: ( ( rule__IntegerValueType__MaxAssignment_3_3_1 ) )
            // InternalQL.g:3908:2: ( rule__IntegerValueType__MaxAssignment_3_3_1 )
            {
             before(grammarAccess.getIntegerValueTypeAccess().getMaxAssignment_3_3_1()); 
            // InternalQL.g:3909:2: ( rule__IntegerValueType__MaxAssignment_3_3_1 )
            // InternalQL.g:3909:3: rule__IntegerValueType__MaxAssignment_3_3_1
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
    // InternalQL.g:3918:1: rule__DecimalValueType__Group__0 : rule__DecimalValueType__Group__0__Impl rule__DecimalValueType__Group__1 ;
    public final void rule__DecimalValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3922:1: ( rule__DecimalValueType__Group__0__Impl rule__DecimalValueType__Group__1 )
            // InternalQL.g:3923:2: rule__DecimalValueType__Group__0__Impl rule__DecimalValueType__Group__1
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
    // InternalQL.g:3930:1: rule__DecimalValueType__Group__0__Impl : ( () ) ;
    public final void rule__DecimalValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3934:1: ( ( () ) )
            // InternalQL.g:3935:1: ( () )
            {
            // InternalQL.g:3935:1: ( () )
            // InternalQL.g:3936:2: ()
            {
             before(grammarAccess.getDecimalValueTypeAccess().getDecimalValueTypeAction_0()); 
            // InternalQL.g:3937:2: ()
            // InternalQL.g:3937:3: 
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
    // InternalQL.g:3945:1: rule__DecimalValueType__Group__1 : rule__DecimalValueType__Group__1__Impl rule__DecimalValueType__Group__2 ;
    public final void rule__DecimalValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3949:1: ( rule__DecimalValueType__Group__1__Impl rule__DecimalValueType__Group__2 )
            // InternalQL.g:3950:2: rule__DecimalValueType__Group__1__Impl rule__DecimalValueType__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalQL.g:3957:1: rule__DecimalValueType__Group__1__Impl : ( 'decimalType' ) ;
    public final void rule__DecimalValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3961:1: ( ( 'decimalType' ) )
            // InternalQL.g:3962:1: ( 'decimalType' )
            {
            // InternalQL.g:3962:1: ( 'decimalType' )
            // InternalQL.g:3963:2: 'decimalType'
            {
             before(grammarAccess.getDecimalValueTypeAccess().getDecimalTypeKeyword_1()); 
            match(input,54,FOLLOW_2); 
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
    // InternalQL.g:3972:1: rule__DecimalValueType__Group__2 : rule__DecimalValueType__Group__2__Impl rule__DecimalValueType__Group__3 ;
    public final void rule__DecimalValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3976:1: ( rule__DecimalValueType__Group__2__Impl rule__DecimalValueType__Group__3 )
            // InternalQL.g:3977:2: rule__DecimalValueType__Group__2__Impl rule__DecimalValueType__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalQL.g:3984:1: rule__DecimalValueType__Group__2__Impl : ( ( rule__DecimalValueType__NameAssignment_2 ) ) ;
    public final void rule__DecimalValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3988:1: ( ( ( rule__DecimalValueType__NameAssignment_2 ) ) )
            // InternalQL.g:3989:1: ( ( rule__DecimalValueType__NameAssignment_2 ) )
            {
            // InternalQL.g:3989:1: ( ( rule__DecimalValueType__NameAssignment_2 ) )
            // InternalQL.g:3990:2: ( rule__DecimalValueType__NameAssignment_2 )
            {
             before(grammarAccess.getDecimalValueTypeAccess().getNameAssignment_2()); 
            // InternalQL.g:3991:2: ( rule__DecimalValueType__NameAssignment_2 )
            // InternalQL.g:3991:3: rule__DecimalValueType__NameAssignment_2
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
    // InternalQL.g:3999:1: rule__DecimalValueType__Group__3 : rule__DecimalValueType__Group__3__Impl ;
    public final void rule__DecimalValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4003:1: ( rule__DecimalValueType__Group__3__Impl )
            // InternalQL.g:4004:2: rule__DecimalValueType__Group__3__Impl
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
    // InternalQL.g:4010:1: rule__DecimalValueType__Group__3__Impl : ( ( rule__DecimalValueType__Group_3__0 )? ) ;
    public final void rule__DecimalValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4014:1: ( ( ( rule__DecimalValueType__Group_3__0 )? ) )
            // InternalQL.g:4015:1: ( ( rule__DecimalValueType__Group_3__0 )? )
            {
            // InternalQL.g:4015:1: ( ( rule__DecimalValueType__Group_3__0 )? )
            // InternalQL.g:4016:2: ( rule__DecimalValueType__Group_3__0 )?
            {
             before(grammarAccess.getDecimalValueTypeAccess().getGroup_3()); 
            // InternalQL.g:4017:2: ( rule__DecimalValueType__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==29) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalQL.g:4017:3: rule__DecimalValueType__Group_3__0
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
    // InternalQL.g:4026:1: rule__DecimalValueType__Group_3__0 : rule__DecimalValueType__Group_3__0__Impl rule__DecimalValueType__Group_3__1 ;
    public final void rule__DecimalValueType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4030:1: ( rule__DecimalValueType__Group_3__0__Impl rule__DecimalValueType__Group_3__1 )
            // InternalQL.g:4031:2: rule__DecimalValueType__Group_3__0__Impl rule__DecimalValueType__Group_3__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalQL.g:4038:1: rule__DecimalValueType__Group_3__0__Impl : ( '{' ) ;
    public final void rule__DecimalValueType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4042:1: ( ( '{' ) )
            // InternalQL.g:4043:1: ( '{' )
            {
            // InternalQL.g:4043:1: ( '{' )
            // InternalQL.g:4044:2: '{'
            {
             before(grammarAccess.getDecimalValueTypeAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalQL.g:4053:1: rule__DecimalValueType__Group_3__1 : rule__DecimalValueType__Group_3__1__Impl rule__DecimalValueType__Group_3__2 ;
    public final void rule__DecimalValueType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4057:1: ( rule__DecimalValueType__Group_3__1__Impl rule__DecimalValueType__Group_3__2 )
            // InternalQL.g:4058:2: rule__DecimalValueType__Group_3__1__Impl rule__DecimalValueType__Group_3__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalQL.g:4065:1: rule__DecimalValueType__Group_3__1__Impl : ( ( rule__DecimalValueType__Group_3_1__0 )? ) ;
    public final void rule__DecimalValueType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4069:1: ( ( ( rule__DecimalValueType__Group_3_1__0 )? ) )
            // InternalQL.g:4070:1: ( ( rule__DecimalValueType__Group_3_1__0 )? )
            {
            // InternalQL.g:4070:1: ( ( rule__DecimalValueType__Group_3_1__0 )? )
            // InternalQL.g:4071:2: ( rule__DecimalValueType__Group_3_1__0 )?
            {
             before(grammarAccess.getDecimalValueTypeAccess().getGroup_3_1()); 
            // InternalQL.g:4072:2: ( rule__DecimalValueType__Group_3_1__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==38) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalQL.g:4072:3: rule__DecimalValueType__Group_3_1__0
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
    // InternalQL.g:4080:1: rule__DecimalValueType__Group_3__2 : rule__DecimalValueType__Group_3__2__Impl ;
    public final void rule__DecimalValueType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4084:1: ( rule__DecimalValueType__Group_3__2__Impl )
            // InternalQL.g:4085:2: rule__DecimalValueType__Group_3__2__Impl
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
    // InternalQL.g:4091:1: rule__DecimalValueType__Group_3__2__Impl : ( '}' ) ;
    public final void rule__DecimalValueType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4095:1: ( ( '}' ) )
            // InternalQL.g:4096:1: ( '}' )
            {
            // InternalQL.g:4096:1: ( '}' )
            // InternalQL.g:4097:2: '}'
            {
             before(grammarAccess.getDecimalValueTypeAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalQL.g:4107:1: rule__DecimalValueType__Group_3_1__0 : rule__DecimalValueType__Group_3_1__0__Impl rule__DecimalValueType__Group_3_1__1 ;
    public final void rule__DecimalValueType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4111:1: ( rule__DecimalValueType__Group_3_1__0__Impl rule__DecimalValueType__Group_3_1__1 )
            // InternalQL.g:4112:2: rule__DecimalValueType__Group_3_1__0__Impl rule__DecimalValueType__Group_3_1__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalQL.g:4119:1: rule__DecimalValueType__Group_3_1__0__Impl : ( 'unit' ) ;
    public final void rule__DecimalValueType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4123:1: ( ( 'unit' ) )
            // InternalQL.g:4124:1: ( 'unit' )
            {
            // InternalQL.g:4124:1: ( 'unit' )
            // InternalQL.g:4125:2: 'unit'
            {
             before(grammarAccess.getDecimalValueTypeAccess().getUnitKeyword_3_1_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalQL.g:4134:1: rule__DecimalValueType__Group_3_1__1 : rule__DecimalValueType__Group_3_1__1__Impl ;
    public final void rule__DecimalValueType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4138:1: ( rule__DecimalValueType__Group_3_1__1__Impl )
            // InternalQL.g:4139:2: rule__DecimalValueType__Group_3_1__1__Impl
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
    // InternalQL.g:4145:1: rule__DecimalValueType__Group_3_1__1__Impl : ( ( rule__DecimalValueType__UnitAssignment_3_1_1 ) ) ;
    public final void rule__DecimalValueType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4149:1: ( ( ( rule__DecimalValueType__UnitAssignment_3_1_1 ) ) )
            // InternalQL.g:4150:1: ( ( rule__DecimalValueType__UnitAssignment_3_1_1 ) )
            {
            // InternalQL.g:4150:1: ( ( rule__DecimalValueType__UnitAssignment_3_1_1 ) )
            // InternalQL.g:4151:2: ( rule__DecimalValueType__UnitAssignment_3_1_1 )
            {
             before(grammarAccess.getDecimalValueTypeAccess().getUnitAssignment_3_1_1()); 
            // InternalQL.g:4152:2: ( rule__DecimalValueType__UnitAssignment_3_1_1 )
            // InternalQL.g:4152:3: rule__DecimalValueType__UnitAssignment_3_1_1
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
    // InternalQL.g:4161:1: rule__DateValueType__Group__0 : rule__DateValueType__Group__0__Impl rule__DateValueType__Group__1 ;
    public final void rule__DateValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4165:1: ( rule__DateValueType__Group__0__Impl rule__DateValueType__Group__1 )
            // InternalQL.g:4166:2: rule__DateValueType__Group__0__Impl rule__DateValueType__Group__1
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
    // InternalQL.g:4173:1: rule__DateValueType__Group__0__Impl : ( () ) ;
    public final void rule__DateValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4177:1: ( ( () ) )
            // InternalQL.g:4178:1: ( () )
            {
            // InternalQL.g:4178:1: ( () )
            // InternalQL.g:4179:2: ()
            {
             before(grammarAccess.getDateValueTypeAccess().getDateValueTypeAction_0()); 
            // InternalQL.g:4180:2: ()
            // InternalQL.g:4180:3: 
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
    // InternalQL.g:4188:1: rule__DateValueType__Group__1 : rule__DateValueType__Group__1__Impl rule__DateValueType__Group__2 ;
    public final void rule__DateValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4192:1: ( rule__DateValueType__Group__1__Impl rule__DateValueType__Group__2 )
            // InternalQL.g:4193:2: rule__DateValueType__Group__1__Impl rule__DateValueType__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalQL.g:4200:1: rule__DateValueType__Group__1__Impl : ( 'dateType' ) ;
    public final void rule__DateValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4204:1: ( ( 'dateType' ) )
            // InternalQL.g:4205:1: ( 'dateType' )
            {
            // InternalQL.g:4205:1: ( 'dateType' )
            // InternalQL.g:4206:2: 'dateType'
            {
             before(grammarAccess.getDateValueTypeAccess().getDateTypeKeyword_1()); 
            match(input,55,FOLLOW_2); 
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
    // InternalQL.g:4215:1: rule__DateValueType__Group__2 : rule__DateValueType__Group__2__Impl rule__DateValueType__Group__3 ;
    public final void rule__DateValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4219:1: ( rule__DateValueType__Group__2__Impl rule__DateValueType__Group__3 )
            // InternalQL.g:4220:2: rule__DateValueType__Group__2__Impl rule__DateValueType__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalQL.g:4227:1: rule__DateValueType__Group__2__Impl : ( ( rule__DateValueType__NameAssignment_2 ) ) ;
    public final void rule__DateValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4231:1: ( ( ( rule__DateValueType__NameAssignment_2 ) ) )
            // InternalQL.g:4232:1: ( ( rule__DateValueType__NameAssignment_2 ) )
            {
            // InternalQL.g:4232:1: ( ( rule__DateValueType__NameAssignment_2 ) )
            // InternalQL.g:4233:2: ( rule__DateValueType__NameAssignment_2 )
            {
             before(grammarAccess.getDateValueTypeAccess().getNameAssignment_2()); 
            // InternalQL.g:4234:2: ( rule__DateValueType__NameAssignment_2 )
            // InternalQL.g:4234:3: rule__DateValueType__NameAssignment_2
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
    // InternalQL.g:4242:1: rule__DateValueType__Group__3 : rule__DateValueType__Group__3__Impl ;
    public final void rule__DateValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4246:1: ( rule__DateValueType__Group__3__Impl )
            // InternalQL.g:4247:2: rule__DateValueType__Group__3__Impl
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
    // InternalQL.g:4253:1: rule__DateValueType__Group__3__Impl : ( ( rule__DateValueType__Group_3__0 )? ) ;
    public final void rule__DateValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4257:1: ( ( ( rule__DateValueType__Group_3__0 )? ) )
            // InternalQL.g:4258:1: ( ( rule__DateValueType__Group_3__0 )? )
            {
            // InternalQL.g:4258:1: ( ( rule__DateValueType__Group_3__0 )? )
            // InternalQL.g:4259:2: ( rule__DateValueType__Group_3__0 )?
            {
             before(grammarAccess.getDateValueTypeAccess().getGroup_3()); 
            // InternalQL.g:4260:2: ( rule__DateValueType__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==29) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalQL.g:4260:3: rule__DateValueType__Group_3__0
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
    // InternalQL.g:4269:1: rule__DateValueType__Group_3__0 : rule__DateValueType__Group_3__0__Impl rule__DateValueType__Group_3__1 ;
    public final void rule__DateValueType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4273:1: ( rule__DateValueType__Group_3__0__Impl rule__DateValueType__Group_3__1 )
            // InternalQL.g:4274:2: rule__DateValueType__Group_3__0__Impl rule__DateValueType__Group_3__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalQL.g:4281:1: rule__DateValueType__Group_3__0__Impl : ( '{' ) ;
    public final void rule__DateValueType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4285:1: ( ( '{' ) )
            // InternalQL.g:4286:1: ( '{' )
            {
            // InternalQL.g:4286:1: ( '{' )
            // InternalQL.g:4287:2: '{'
            {
             before(grammarAccess.getDateValueTypeAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalQL.g:4296:1: rule__DateValueType__Group_3__1 : rule__DateValueType__Group_3__1__Impl rule__DateValueType__Group_3__2 ;
    public final void rule__DateValueType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4300:1: ( rule__DateValueType__Group_3__1__Impl rule__DateValueType__Group_3__2 )
            // InternalQL.g:4301:2: rule__DateValueType__Group_3__1__Impl rule__DateValueType__Group_3__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalQL.g:4308:1: rule__DateValueType__Group_3__1__Impl : ( ( rule__DateValueType__Group_3_1__0 )? ) ;
    public final void rule__DateValueType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4312:1: ( ( ( rule__DateValueType__Group_3_1__0 )? ) )
            // InternalQL.g:4313:1: ( ( rule__DateValueType__Group_3_1__0 )? )
            {
            // InternalQL.g:4313:1: ( ( rule__DateValueType__Group_3_1__0 )? )
            // InternalQL.g:4314:2: ( rule__DateValueType__Group_3_1__0 )?
            {
             before(grammarAccess.getDateValueTypeAccess().getGroup_3_1()); 
            // InternalQL.g:4315:2: ( rule__DateValueType__Group_3_1__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==38) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalQL.g:4315:3: rule__DateValueType__Group_3_1__0
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
    // InternalQL.g:4323:1: rule__DateValueType__Group_3__2 : rule__DateValueType__Group_3__2__Impl ;
    public final void rule__DateValueType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4327:1: ( rule__DateValueType__Group_3__2__Impl )
            // InternalQL.g:4328:2: rule__DateValueType__Group_3__2__Impl
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
    // InternalQL.g:4334:1: rule__DateValueType__Group_3__2__Impl : ( '}' ) ;
    public final void rule__DateValueType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4338:1: ( ( '}' ) )
            // InternalQL.g:4339:1: ( '}' )
            {
            // InternalQL.g:4339:1: ( '}' )
            // InternalQL.g:4340:2: '}'
            {
             before(grammarAccess.getDateValueTypeAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalQL.g:4350:1: rule__DateValueType__Group_3_1__0 : rule__DateValueType__Group_3_1__0__Impl rule__DateValueType__Group_3_1__1 ;
    public final void rule__DateValueType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4354:1: ( rule__DateValueType__Group_3_1__0__Impl rule__DateValueType__Group_3_1__1 )
            // InternalQL.g:4355:2: rule__DateValueType__Group_3_1__0__Impl rule__DateValueType__Group_3_1__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalQL.g:4362:1: rule__DateValueType__Group_3_1__0__Impl : ( 'unit' ) ;
    public final void rule__DateValueType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4366:1: ( ( 'unit' ) )
            // InternalQL.g:4367:1: ( 'unit' )
            {
            // InternalQL.g:4367:1: ( 'unit' )
            // InternalQL.g:4368:2: 'unit'
            {
             before(grammarAccess.getDateValueTypeAccess().getUnitKeyword_3_1_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalQL.g:4377:1: rule__DateValueType__Group_3_1__1 : rule__DateValueType__Group_3_1__1__Impl ;
    public final void rule__DateValueType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4381:1: ( rule__DateValueType__Group_3_1__1__Impl )
            // InternalQL.g:4382:2: rule__DateValueType__Group_3_1__1__Impl
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
    // InternalQL.g:4388:1: rule__DateValueType__Group_3_1__1__Impl : ( ( rule__DateValueType__UnitAssignment_3_1_1 ) ) ;
    public final void rule__DateValueType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4392:1: ( ( ( rule__DateValueType__UnitAssignment_3_1_1 ) ) )
            // InternalQL.g:4393:1: ( ( rule__DateValueType__UnitAssignment_3_1_1 ) )
            {
            // InternalQL.g:4393:1: ( ( rule__DateValueType__UnitAssignment_3_1_1 ) )
            // InternalQL.g:4394:2: ( rule__DateValueType__UnitAssignment_3_1_1 )
            {
             before(grammarAccess.getDateValueTypeAccess().getUnitAssignment_3_1_1()); 
            // InternalQL.g:4395:2: ( rule__DateValueType__UnitAssignment_3_1_1 )
            // InternalQL.g:4395:3: rule__DateValueType__UnitAssignment_3_1_1
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
    // InternalQL.g:4404:1: rule__EnumerationValueType__Group__0 : rule__EnumerationValueType__Group__0__Impl rule__EnumerationValueType__Group__1 ;
    public final void rule__EnumerationValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4408:1: ( rule__EnumerationValueType__Group__0__Impl rule__EnumerationValueType__Group__1 )
            // InternalQL.g:4409:2: rule__EnumerationValueType__Group__0__Impl rule__EnumerationValueType__Group__1
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
    // InternalQL.g:4416:1: rule__EnumerationValueType__Group__0__Impl : ( () ) ;
    public final void rule__EnumerationValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4420:1: ( ( () ) )
            // InternalQL.g:4421:1: ( () )
            {
            // InternalQL.g:4421:1: ( () )
            // InternalQL.g:4422:2: ()
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getEnumerationValueTypeAction_0()); 
            // InternalQL.g:4423:2: ()
            // InternalQL.g:4423:3: 
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
    // InternalQL.g:4431:1: rule__EnumerationValueType__Group__1 : rule__EnumerationValueType__Group__1__Impl rule__EnumerationValueType__Group__2 ;
    public final void rule__EnumerationValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4435:1: ( rule__EnumerationValueType__Group__1__Impl rule__EnumerationValueType__Group__2 )
            // InternalQL.g:4436:2: rule__EnumerationValueType__Group__1__Impl rule__EnumerationValueType__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalQL.g:4443:1: rule__EnumerationValueType__Group__1__Impl : ( 'enumerationType' ) ;
    public final void rule__EnumerationValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4447:1: ( ( 'enumerationType' ) )
            // InternalQL.g:4448:1: ( 'enumerationType' )
            {
            // InternalQL.g:4448:1: ( 'enumerationType' )
            // InternalQL.g:4449:2: 'enumerationType'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getEnumerationTypeKeyword_1()); 
            match(input,56,FOLLOW_2); 
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
    // InternalQL.g:4458:1: rule__EnumerationValueType__Group__2 : rule__EnumerationValueType__Group__2__Impl rule__EnumerationValueType__Group__3 ;
    public final void rule__EnumerationValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4462:1: ( rule__EnumerationValueType__Group__2__Impl rule__EnumerationValueType__Group__3 )
            // InternalQL.g:4463:2: rule__EnumerationValueType__Group__2__Impl rule__EnumerationValueType__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalQL.g:4470:1: rule__EnumerationValueType__Group__2__Impl : ( ( rule__EnumerationValueType__NameAssignment_2 ) ) ;
    public final void rule__EnumerationValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4474:1: ( ( ( rule__EnumerationValueType__NameAssignment_2 ) ) )
            // InternalQL.g:4475:1: ( ( rule__EnumerationValueType__NameAssignment_2 ) )
            {
            // InternalQL.g:4475:1: ( ( rule__EnumerationValueType__NameAssignment_2 ) )
            // InternalQL.g:4476:2: ( rule__EnumerationValueType__NameAssignment_2 )
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getNameAssignment_2()); 
            // InternalQL.g:4477:2: ( rule__EnumerationValueType__NameAssignment_2 )
            // InternalQL.g:4477:3: rule__EnumerationValueType__NameAssignment_2
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
    // InternalQL.g:4485:1: rule__EnumerationValueType__Group__3 : rule__EnumerationValueType__Group__3__Impl ;
    public final void rule__EnumerationValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4489:1: ( rule__EnumerationValueType__Group__3__Impl )
            // InternalQL.g:4490:2: rule__EnumerationValueType__Group__3__Impl
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
    // InternalQL.g:4496:1: rule__EnumerationValueType__Group__3__Impl : ( ( rule__EnumerationValueType__Group_3__0 )? ) ;
    public final void rule__EnumerationValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4500:1: ( ( ( rule__EnumerationValueType__Group_3__0 )? ) )
            // InternalQL.g:4501:1: ( ( rule__EnumerationValueType__Group_3__0 )? )
            {
            // InternalQL.g:4501:1: ( ( rule__EnumerationValueType__Group_3__0 )? )
            // InternalQL.g:4502:2: ( rule__EnumerationValueType__Group_3__0 )?
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getGroup_3()); 
            // InternalQL.g:4503:2: ( rule__EnumerationValueType__Group_3__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==29) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalQL.g:4503:3: rule__EnumerationValueType__Group_3__0
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
    // InternalQL.g:4512:1: rule__EnumerationValueType__Group_3__0 : rule__EnumerationValueType__Group_3__0__Impl rule__EnumerationValueType__Group_3__1 ;
    public final void rule__EnumerationValueType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4516:1: ( rule__EnumerationValueType__Group_3__0__Impl rule__EnumerationValueType__Group_3__1 )
            // InternalQL.g:4517:2: rule__EnumerationValueType__Group_3__0__Impl rule__EnumerationValueType__Group_3__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalQL.g:4524:1: rule__EnumerationValueType__Group_3__0__Impl : ( '{' ) ;
    public final void rule__EnumerationValueType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4528:1: ( ( '{' ) )
            // InternalQL.g:4529:1: ( '{' )
            {
            // InternalQL.g:4529:1: ( '{' )
            // InternalQL.g:4530:2: '{'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalQL.g:4539:1: rule__EnumerationValueType__Group_3__1 : rule__EnumerationValueType__Group_3__1__Impl rule__EnumerationValueType__Group_3__2 ;
    public final void rule__EnumerationValueType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4543:1: ( rule__EnumerationValueType__Group_3__1__Impl rule__EnumerationValueType__Group_3__2 )
            // InternalQL.g:4544:2: rule__EnumerationValueType__Group_3__1__Impl rule__EnumerationValueType__Group_3__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalQL.g:4551:1: rule__EnumerationValueType__Group_3__1__Impl : ( ( rule__EnumerationValueType__Group_3_1__0 )? ) ;
    public final void rule__EnumerationValueType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4555:1: ( ( ( rule__EnumerationValueType__Group_3_1__0 )? ) )
            // InternalQL.g:4556:1: ( ( rule__EnumerationValueType__Group_3_1__0 )? )
            {
            // InternalQL.g:4556:1: ( ( rule__EnumerationValueType__Group_3_1__0 )? )
            // InternalQL.g:4557:2: ( rule__EnumerationValueType__Group_3_1__0 )?
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getGroup_3_1()); 
            // InternalQL.g:4558:2: ( rule__EnumerationValueType__Group_3_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==38) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalQL.g:4558:3: rule__EnumerationValueType__Group_3_1__0
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
    // InternalQL.g:4566:1: rule__EnumerationValueType__Group_3__2 : rule__EnumerationValueType__Group_3__2__Impl rule__EnumerationValueType__Group_3__3 ;
    public final void rule__EnumerationValueType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4570:1: ( rule__EnumerationValueType__Group_3__2__Impl rule__EnumerationValueType__Group_3__3 )
            // InternalQL.g:4571:2: rule__EnumerationValueType__Group_3__2__Impl rule__EnumerationValueType__Group_3__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalQL.g:4578:1: rule__EnumerationValueType__Group_3__2__Impl : ( ( rule__EnumerationValueType__Group_3_2__0 )? ) ;
    public final void rule__EnumerationValueType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4582:1: ( ( ( rule__EnumerationValueType__Group_3_2__0 )? ) )
            // InternalQL.g:4583:1: ( ( rule__EnumerationValueType__Group_3_2__0 )? )
            {
            // InternalQL.g:4583:1: ( ( rule__EnumerationValueType__Group_3_2__0 )? )
            // InternalQL.g:4584:2: ( rule__EnumerationValueType__Group_3_2__0 )?
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getGroup_3_2()); 
            // InternalQL.g:4585:2: ( rule__EnumerationValueType__Group_3_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==57) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalQL.g:4585:3: rule__EnumerationValueType__Group_3_2__0
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
    // InternalQL.g:4593:1: rule__EnumerationValueType__Group_3__3 : rule__EnumerationValueType__Group_3__3__Impl ;
    public final void rule__EnumerationValueType__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4597:1: ( rule__EnumerationValueType__Group_3__3__Impl )
            // InternalQL.g:4598:2: rule__EnumerationValueType__Group_3__3__Impl
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
    // InternalQL.g:4604:1: rule__EnumerationValueType__Group_3__3__Impl : ( '}' ) ;
    public final void rule__EnumerationValueType__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4608:1: ( ( '}' ) )
            // InternalQL.g:4609:1: ( '}' )
            {
            // InternalQL.g:4609:1: ( '}' )
            // InternalQL.g:4610:2: '}'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,30,FOLLOW_2); 
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
    // InternalQL.g:4620:1: rule__EnumerationValueType__Group_3_1__0 : rule__EnumerationValueType__Group_3_1__0__Impl rule__EnumerationValueType__Group_3_1__1 ;
    public final void rule__EnumerationValueType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4624:1: ( rule__EnumerationValueType__Group_3_1__0__Impl rule__EnumerationValueType__Group_3_1__1 )
            // InternalQL.g:4625:2: rule__EnumerationValueType__Group_3_1__0__Impl rule__EnumerationValueType__Group_3_1__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalQL.g:4632:1: rule__EnumerationValueType__Group_3_1__0__Impl : ( 'unit' ) ;
    public final void rule__EnumerationValueType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4636:1: ( ( 'unit' ) )
            // InternalQL.g:4637:1: ( 'unit' )
            {
            // InternalQL.g:4637:1: ( 'unit' )
            // InternalQL.g:4638:2: 'unit'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getUnitKeyword_3_1_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalQL.g:4647:1: rule__EnumerationValueType__Group_3_1__1 : rule__EnumerationValueType__Group_3_1__1__Impl ;
    public final void rule__EnumerationValueType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4651:1: ( rule__EnumerationValueType__Group_3_1__1__Impl )
            // InternalQL.g:4652:2: rule__EnumerationValueType__Group_3_1__1__Impl
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
    // InternalQL.g:4658:1: rule__EnumerationValueType__Group_3_1__1__Impl : ( ( rule__EnumerationValueType__UnitAssignment_3_1_1 ) ) ;
    public final void rule__EnumerationValueType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4662:1: ( ( ( rule__EnumerationValueType__UnitAssignment_3_1_1 ) ) )
            // InternalQL.g:4663:1: ( ( rule__EnumerationValueType__UnitAssignment_3_1_1 ) )
            {
            // InternalQL.g:4663:1: ( ( rule__EnumerationValueType__UnitAssignment_3_1_1 ) )
            // InternalQL.g:4664:2: ( rule__EnumerationValueType__UnitAssignment_3_1_1 )
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getUnitAssignment_3_1_1()); 
            // InternalQL.g:4665:2: ( rule__EnumerationValueType__UnitAssignment_3_1_1 )
            // InternalQL.g:4665:3: rule__EnumerationValueType__UnitAssignment_3_1_1
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
    // InternalQL.g:4674:1: rule__EnumerationValueType__Group_3_2__0 : rule__EnumerationValueType__Group_3_2__0__Impl rule__EnumerationValueType__Group_3_2__1 ;
    public final void rule__EnumerationValueType__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4678:1: ( rule__EnumerationValueType__Group_3_2__0__Impl rule__EnumerationValueType__Group_3_2__1 )
            // InternalQL.g:4679:2: rule__EnumerationValueType__Group_3_2__0__Impl rule__EnumerationValueType__Group_3_2__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalQL.g:4686:1: rule__EnumerationValueType__Group_3_2__0__Impl : ( 'literals' ) ;
    public final void rule__EnumerationValueType__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4690:1: ( ( 'literals' ) )
            // InternalQL.g:4691:1: ( 'literals' )
            {
            // InternalQL.g:4691:1: ( 'literals' )
            // InternalQL.g:4692:2: 'literals'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getLiteralsKeyword_3_2_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalQL.g:4701:1: rule__EnumerationValueType__Group_3_2__1 : rule__EnumerationValueType__Group_3_2__1__Impl rule__EnumerationValueType__Group_3_2__2 ;
    public final void rule__EnumerationValueType__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4705:1: ( rule__EnumerationValueType__Group_3_2__1__Impl rule__EnumerationValueType__Group_3_2__2 )
            // InternalQL.g:4706:2: rule__EnumerationValueType__Group_3_2__1__Impl rule__EnumerationValueType__Group_3_2__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalQL.g:4713:1: rule__EnumerationValueType__Group_3_2__1__Impl : ( '{' ) ;
    public final void rule__EnumerationValueType__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4717:1: ( ( '{' ) )
            // InternalQL.g:4718:1: ( '{' )
            {
            // InternalQL.g:4718:1: ( '{' )
            // InternalQL.g:4719:2: '{'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getLeftCurlyBracketKeyword_3_2_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalQL.g:4728:1: rule__EnumerationValueType__Group_3_2__2 : rule__EnumerationValueType__Group_3_2__2__Impl rule__EnumerationValueType__Group_3_2__3 ;
    public final void rule__EnumerationValueType__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4732:1: ( rule__EnumerationValueType__Group_3_2__2__Impl rule__EnumerationValueType__Group_3_2__3 )
            // InternalQL.g:4733:2: rule__EnumerationValueType__Group_3_2__2__Impl rule__EnumerationValueType__Group_3_2__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalQL.g:4740:1: rule__EnumerationValueType__Group_3_2__2__Impl : ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2 ) ) ;
    public final void rule__EnumerationValueType__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4744:1: ( ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2 ) ) )
            // InternalQL.g:4745:1: ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2 ) )
            {
            // InternalQL.g:4745:1: ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2 ) )
            // InternalQL.g:4746:2: ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2 )
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsAssignment_3_2_2()); 
            // InternalQL.g:4747:2: ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2 )
            // InternalQL.g:4747:3: rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2
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
    // InternalQL.g:4755:1: rule__EnumerationValueType__Group_3_2__3 : rule__EnumerationValueType__Group_3_2__3__Impl rule__EnumerationValueType__Group_3_2__4 ;
    public final void rule__EnumerationValueType__Group_3_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4759:1: ( rule__EnumerationValueType__Group_3_2__3__Impl rule__EnumerationValueType__Group_3_2__4 )
            // InternalQL.g:4760:2: rule__EnumerationValueType__Group_3_2__3__Impl rule__EnumerationValueType__Group_3_2__4
            {
            pushFollow(FOLLOW_41);
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
    // InternalQL.g:4767:1: rule__EnumerationValueType__Group_3_2__3__Impl : ( ( rule__EnumerationValueType__Group_3_2_3__0 )* ) ;
    public final void rule__EnumerationValueType__Group_3_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4771:1: ( ( ( rule__EnumerationValueType__Group_3_2_3__0 )* ) )
            // InternalQL.g:4772:1: ( ( rule__EnumerationValueType__Group_3_2_3__0 )* )
            {
            // InternalQL.g:4772:1: ( ( rule__EnumerationValueType__Group_3_2_3__0 )* )
            // InternalQL.g:4773:2: ( rule__EnumerationValueType__Group_3_2_3__0 )*
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getGroup_3_2_3()); 
            // InternalQL.g:4774:2: ( rule__EnumerationValueType__Group_3_2_3__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==58) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalQL.g:4774:3: rule__EnumerationValueType__Group_3_2_3__0
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__EnumerationValueType__Group_3_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalQL.g:4782:1: rule__EnumerationValueType__Group_3_2__4 : rule__EnumerationValueType__Group_3_2__4__Impl ;
    public final void rule__EnumerationValueType__Group_3_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4786:1: ( rule__EnumerationValueType__Group_3_2__4__Impl )
            // InternalQL.g:4787:2: rule__EnumerationValueType__Group_3_2__4__Impl
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
    // InternalQL.g:4793:1: rule__EnumerationValueType__Group_3_2__4__Impl : ( '}' ) ;
    public final void rule__EnumerationValueType__Group_3_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4797:1: ( ( '}' ) )
            // InternalQL.g:4798:1: ( '}' )
            {
            // InternalQL.g:4798:1: ( '}' )
            // InternalQL.g:4799:2: '}'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getRightCurlyBracketKeyword_3_2_4()); 
            match(input,30,FOLLOW_2); 
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
    // InternalQL.g:4809:1: rule__EnumerationValueType__Group_3_2_3__0 : rule__EnumerationValueType__Group_3_2_3__0__Impl rule__EnumerationValueType__Group_3_2_3__1 ;
    public final void rule__EnumerationValueType__Group_3_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4813:1: ( rule__EnumerationValueType__Group_3_2_3__0__Impl rule__EnumerationValueType__Group_3_2_3__1 )
            // InternalQL.g:4814:2: rule__EnumerationValueType__Group_3_2_3__0__Impl rule__EnumerationValueType__Group_3_2_3__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalQL.g:4821:1: rule__EnumerationValueType__Group_3_2_3__0__Impl : ( ',' ) ;
    public final void rule__EnumerationValueType__Group_3_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4825:1: ( ( ',' ) )
            // InternalQL.g:4826:1: ( ',' )
            {
            // InternalQL.g:4826:1: ( ',' )
            // InternalQL.g:4827:2: ','
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getCommaKeyword_3_2_3_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalQL.g:4836:1: rule__EnumerationValueType__Group_3_2_3__1 : rule__EnumerationValueType__Group_3_2_3__1__Impl ;
    public final void rule__EnumerationValueType__Group_3_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4840:1: ( rule__EnumerationValueType__Group_3_2_3__1__Impl )
            // InternalQL.g:4841:2: rule__EnumerationValueType__Group_3_2_3__1__Impl
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
    // InternalQL.g:4847:1: rule__EnumerationValueType__Group_3_2_3__1__Impl : ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1 ) ) ;
    public final void rule__EnumerationValueType__Group_3_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4851:1: ( ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1 ) ) )
            // InternalQL.g:4852:1: ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1 ) )
            {
            // InternalQL.g:4852:1: ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1 ) )
            // InternalQL.g:4853:2: ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1 )
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsAssignment_3_2_3_1()); 
            // InternalQL.g:4854:2: ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1 )
            // InternalQL.g:4854:3: rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1
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
    // InternalQL.g:4863:1: rule__StringValueType__Group__0 : rule__StringValueType__Group__0__Impl rule__StringValueType__Group__1 ;
    public final void rule__StringValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4867:1: ( rule__StringValueType__Group__0__Impl rule__StringValueType__Group__1 )
            // InternalQL.g:4868:2: rule__StringValueType__Group__0__Impl rule__StringValueType__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalQL.g:4875:1: rule__StringValueType__Group__0__Impl : ( () ) ;
    public final void rule__StringValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4879:1: ( ( () ) )
            // InternalQL.g:4880:1: ( () )
            {
            // InternalQL.g:4880:1: ( () )
            // InternalQL.g:4881:2: ()
            {
             before(grammarAccess.getStringValueTypeAccess().getStringValueTypeAction_0()); 
            // InternalQL.g:4882:2: ()
            // InternalQL.g:4882:3: 
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
    // InternalQL.g:4890:1: rule__StringValueType__Group__1 : rule__StringValueType__Group__1__Impl rule__StringValueType__Group__2 ;
    public final void rule__StringValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4894:1: ( rule__StringValueType__Group__1__Impl rule__StringValueType__Group__2 )
            // InternalQL.g:4895:2: rule__StringValueType__Group__1__Impl rule__StringValueType__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalQL.g:4902:1: rule__StringValueType__Group__1__Impl : ( 'StringValueType' ) ;
    public final void rule__StringValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4906:1: ( ( 'StringValueType' ) )
            // InternalQL.g:4907:1: ( 'StringValueType' )
            {
            // InternalQL.g:4907:1: ( 'StringValueType' )
            // InternalQL.g:4908:2: 'StringValueType'
            {
             before(grammarAccess.getStringValueTypeAccess().getStringValueTypeKeyword_1()); 
            match(input,59,FOLLOW_2); 
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
    // InternalQL.g:4917:1: rule__StringValueType__Group__2 : rule__StringValueType__Group__2__Impl rule__StringValueType__Group__3 ;
    public final void rule__StringValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4921:1: ( rule__StringValueType__Group__2__Impl rule__StringValueType__Group__3 )
            // InternalQL.g:4922:2: rule__StringValueType__Group__2__Impl rule__StringValueType__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalQL.g:4929:1: rule__StringValueType__Group__2__Impl : ( ( rule__StringValueType__NameAssignment_2 ) ) ;
    public final void rule__StringValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4933:1: ( ( ( rule__StringValueType__NameAssignment_2 ) ) )
            // InternalQL.g:4934:1: ( ( rule__StringValueType__NameAssignment_2 ) )
            {
            // InternalQL.g:4934:1: ( ( rule__StringValueType__NameAssignment_2 ) )
            // InternalQL.g:4935:2: ( rule__StringValueType__NameAssignment_2 )
            {
             before(grammarAccess.getStringValueTypeAccess().getNameAssignment_2()); 
            // InternalQL.g:4936:2: ( rule__StringValueType__NameAssignment_2 )
            // InternalQL.g:4936:3: rule__StringValueType__NameAssignment_2
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
    // InternalQL.g:4944:1: rule__StringValueType__Group__3 : rule__StringValueType__Group__3__Impl ;
    public final void rule__StringValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4948:1: ( rule__StringValueType__Group__3__Impl )
            // InternalQL.g:4949:2: rule__StringValueType__Group__3__Impl
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
    // InternalQL.g:4955:1: rule__StringValueType__Group__3__Impl : ( ( rule__StringValueType__Group_3__0 )? ) ;
    public final void rule__StringValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4959:1: ( ( ( rule__StringValueType__Group_3__0 )? ) )
            // InternalQL.g:4960:1: ( ( rule__StringValueType__Group_3__0 )? )
            {
            // InternalQL.g:4960:1: ( ( rule__StringValueType__Group_3__0 )? )
            // InternalQL.g:4961:2: ( rule__StringValueType__Group_3__0 )?
            {
             before(grammarAccess.getStringValueTypeAccess().getGroup_3()); 
            // InternalQL.g:4962:2: ( rule__StringValueType__Group_3__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==29) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalQL.g:4962:3: rule__StringValueType__Group_3__0
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
    // InternalQL.g:4971:1: rule__StringValueType__Group_3__0 : rule__StringValueType__Group_3__0__Impl rule__StringValueType__Group_3__1 ;
    public final void rule__StringValueType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4975:1: ( rule__StringValueType__Group_3__0__Impl rule__StringValueType__Group_3__1 )
            // InternalQL.g:4976:2: rule__StringValueType__Group_3__0__Impl rule__StringValueType__Group_3__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalQL.g:4983:1: rule__StringValueType__Group_3__0__Impl : ( '{' ) ;
    public final void rule__StringValueType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4987:1: ( ( '{' ) )
            // InternalQL.g:4988:1: ( '{' )
            {
            // InternalQL.g:4988:1: ( '{' )
            // InternalQL.g:4989:2: '{'
            {
             before(grammarAccess.getStringValueTypeAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalQL.g:4998:1: rule__StringValueType__Group_3__1 : rule__StringValueType__Group_3__1__Impl rule__StringValueType__Group_3__2 ;
    public final void rule__StringValueType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5002:1: ( rule__StringValueType__Group_3__1__Impl rule__StringValueType__Group_3__2 )
            // InternalQL.g:5003:2: rule__StringValueType__Group_3__1__Impl rule__StringValueType__Group_3__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalQL.g:5010:1: rule__StringValueType__Group_3__1__Impl : ( ( rule__StringValueType__Group_3_1__0 )? ) ;
    public final void rule__StringValueType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5014:1: ( ( ( rule__StringValueType__Group_3_1__0 )? ) )
            // InternalQL.g:5015:1: ( ( rule__StringValueType__Group_3_1__0 )? )
            {
            // InternalQL.g:5015:1: ( ( rule__StringValueType__Group_3_1__0 )? )
            // InternalQL.g:5016:2: ( rule__StringValueType__Group_3_1__0 )?
            {
             before(grammarAccess.getStringValueTypeAccess().getGroup_3_1()); 
            // InternalQL.g:5017:2: ( rule__StringValueType__Group_3_1__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==38) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalQL.g:5017:3: rule__StringValueType__Group_3_1__0
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
    // InternalQL.g:5025:1: rule__StringValueType__Group_3__2 : rule__StringValueType__Group_3__2__Impl ;
    public final void rule__StringValueType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5029:1: ( rule__StringValueType__Group_3__2__Impl )
            // InternalQL.g:5030:2: rule__StringValueType__Group_3__2__Impl
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
    // InternalQL.g:5036:1: rule__StringValueType__Group_3__2__Impl : ( '}' ) ;
    public final void rule__StringValueType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5040:1: ( ( '}' ) )
            // InternalQL.g:5041:1: ( '}' )
            {
            // InternalQL.g:5041:1: ( '}' )
            // InternalQL.g:5042:2: '}'
            {
             before(grammarAccess.getStringValueTypeAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalQL.g:5052:1: rule__StringValueType__Group_3_1__0 : rule__StringValueType__Group_3_1__0__Impl rule__StringValueType__Group_3_1__1 ;
    public final void rule__StringValueType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5056:1: ( rule__StringValueType__Group_3_1__0__Impl rule__StringValueType__Group_3_1__1 )
            // InternalQL.g:5057:2: rule__StringValueType__Group_3_1__0__Impl rule__StringValueType__Group_3_1__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalQL.g:5064:1: rule__StringValueType__Group_3_1__0__Impl : ( 'unit' ) ;
    public final void rule__StringValueType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5068:1: ( ( 'unit' ) )
            // InternalQL.g:5069:1: ( 'unit' )
            {
            // InternalQL.g:5069:1: ( 'unit' )
            // InternalQL.g:5070:2: 'unit'
            {
             before(grammarAccess.getStringValueTypeAccess().getUnitKeyword_3_1_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalQL.g:5079:1: rule__StringValueType__Group_3_1__1 : rule__StringValueType__Group_3_1__1__Impl ;
    public final void rule__StringValueType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5083:1: ( rule__StringValueType__Group_3_1__1__Impl )
            // InternalQL.g:5084:2: rule__StringValueType__Group_3_1__1__Impl
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
    // InternalQL.g:5090:1: rule__StringValueType__Group_3_1__1__Impl : ( ( rule__StringValueType__UnitAssignment_3_1_1 ) ) ;
    public final void rule__StringValueType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5094:1: ( ( ( rule__StringValueType__UnitAssignment_3_1_1 ) ) )
            // InternalQL.g:5095:1: ( ( rule__StringValueType__UnitAssignment_3_1_1 ) )
            {
            // InternalQL.g:5095:1: ( ( rule__StringValueType__UnitAssignment_3_1_1 ) )
            // InternalQL.g:5096:2: ( rule__StringValueType__UnitAssignment_3_1_1 )
            {
             before(grammarAccess.getStringValueTypeAccess().getUnitAssignment_3_1_1()); 
            // InternalQL.g:5097:2: ( rule__StringValueType__UnitAssignment_3_1_1 )
            // InternalQL.g:5097:3: rule__StringValueType__UnitAssignment_3_1_1
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


    // $ANTLR start "rule__EInt__Group__0"
    // InternalQL.g:5106:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5110:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalQL.g:5111:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalQL.g:5118:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5122:1: ( ( ( '-' )? ) )
            // InternalQL.g:5123:1: ( ( '-' )? )
            {
            // InternalQL.g:5123:1: ( ( '-' )? )
            // InternalQL.g:5124:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalQL.g:5125:2: ( '-' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==60) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalQL.g:5125:3: '-'
                    {
                    match(input,60,FOLLOW_2); 

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
    // InternalQL.g:5133:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5137:1: ( rule__EInt__Group__1__Impl )
            // InternalQL.g:5138:2: rule__EInt__Group__1__Impl
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
    // InternalQL.g:5144:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5148:1: ( ( RULE_INT ) )
            // InternalQL.g:5149:1: ( RULE_INT )
            {
            // InternalQL.g:5149:1: ( RULE_INT )
            // InternalQL.g:5150:2: RULE_INT
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
    // InternalQL.g:5160:1: rule__EnumerationLiteral__Group__0 : rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 ;
    public final void rule__EnumerationLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5164:1: ( rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 )
            // InternalQL.g:5165:2: rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalQL.g:5172:1: rule__EnumerationLiteral__Group__0__Impl : ( () ) ;
    public final void rule__EnumerationLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5176:1: ( ( () ) )
            // InternalQL.g:5177:1: ( () )
            {
            // InternalQL.g:5177:1: ( () )
            // InternalQL.g:5178:2: ()
            {
             before(grammarAccess.getEnumerationLiteralAccess().getEnumerationLiteralAction_0()); 
            // InternalQL.g:5179:2: ()
            // InternalQL.g:5179:3: 
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
    // InternalQL.g:5187:1: rule__EnumerationLiteral__Group__1 : rule__EnumerationLiteral__Group__1__Impl ;
    public final void rule__EnumerationLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5191:1: ( rule__EnumerationLiteral__Group__1__Impl )
            // InternalQL.g:5192:2: rule__EnumerationLiteral__Group__1__Impl
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
    // InternalQL.g:5198:1: rule__EnumerationLiteral__Group__1__Impl : ( ( rule__EnumerationLiteral__NameAssignment_1 ) ) ;
    public final void rule__EnumerationLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5202:1: ( ( ( rule__EnumerationLiteral__NameAssignment_1 ) ) )
            // InternalQL.g:5203:1: ( ( rule__EnumerationLiteral__NameAssignment_1 ) )
            {
            // InternalQL.g:5203:1: ( ( rule__EnumerationLiteral__NameAssignment_1 ) )
            // InternalQL.g:5204:2: ( rule__EnumerationLiteral__NameAssignment_1 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_1()); 
            // InternalQL.g:5205:2: ( rule__EnumerationLiteral__NameAssignment_1 )
            // InternalQL.g:5205:3: rule__EnumerationLiteral__NameAssignment_1
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
    // InternalQL.g:5214:1: rule__IntegerValue__Group__0 : rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1 ;
    public final void rule__IntegerValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5218:1: ( rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1 )
            // InternalQL.g:5219:2: rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1
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
    // InternalQL.g:5226:1: rule__IntegerValue__Group__0__Impl : ( () ) ;
    public final void rule__IntegerValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5230:1: ( ( () ) )
            // InternalQL.g:5231:1: ( () )
            {
            // InternalQL.g:5231:1: ( () )
            // InternalQL.g:5232:2: ()
            {
             before(grammarAccess.getIntegerValueAccess().getIntegerValueAction_0()); 
            // InternalQL.g:5233:2: ()
            // InternalQL.g:5233:3: 
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
    // InternalQL.g:5241:1: rule__IntegerValue__Group__1 : rule__IntegerValue__Group__1__Impl rule__IntegerValue__Group__2 ;
    public final void rule__IntegerValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5245:1: ( rule__IntegerValue__Group__1__Impl rule__IntegerValue__Group__2 )
            // InternalQL.g:5246:2: rule__IntegerValue__Group__1__Impl rule__IntegerValue__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalQL.g:5253:1: rule__IntegerValue__Group__1__Impl : ( 'IntegerValue' ) ;
    public final void rule__IntegerValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5257:1: ( ( 'IntegerValue' ) )
            // InternalQL.g:5258:1: ( 'IntegerValue' )
            {
            // InternalQL.g:5258:1: ( 'IntegerValue' )
            // InternalQL.g:5259:2: 'IntegerValue'
            {
             before(grammarAccess.getIntegerValueAccess().getIntegerValueKeyword_1()); 
            match(input,61,FOLLOW_2); 
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
    // InternalQL.g:5268:1: rule__IntegerValue__Group__2 : rule__IntegerValue__Group__2__Impl rule__IntegerValue__Group__3 ;
    public final void rule__IntegerValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5272:1: ( rule__IntegerValue__Group__2__Impl rule__IntegerValue__Group__3 )
            // InternalQL.g:5273:2: rule__IntegerValue__Group__2__Impl rule__IntegerValue__Group__3
            {
            pushFollow(FOLLOW_45);
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
    // InternalQL.g:5280:1: rule__IntegerValue__Group__2__Impl : ( '{' ) ;
    public final void rule__IntegerValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5284:1: ( ( '{' ) )
            // InternalQL.g:5285:1: ( '{' )
            {
            // InternalQL.g:5285:1: ( '{' )
            // InternalQL.g:5286:2: '{'
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
    // InternalQL.g:5295:1: rule__IntegerValue__Group__3 : rule__IntegerValue__Group__3__Impl rule__IntegerValue__Group__4 ;
    public final void rule__IntegerValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5299:1: ( rule__IntegerValue__Group__3__Impl rule__IntegerValue__Group__4 )
            // InternalQL.g:5300:2: rule__IntegerValue__Group__3__Impl rule__IntegerValue__Group__4
            {
            pushFollow(FOLLOW_45);
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
    // InternalQL.g:5307:1: rule__IntegerValue__Group__3__Impl : ( ( rule__IntegerValue__Group_3__0 )? ) ;
    public final void rule__IntegerValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5311:1: ( ( ( rule__IntegerValue__Group_3__0 )? ) )
            // InternalQL.g:5312:1: ( ( rule__IntegerValue__Group_3__0 )? )
            {
            // InternalQL.g:5312:1: ( ( rule__IntegerValue__Group_3__0 )? )
            // InternalQL.g:5313:2: ( rule__IntegerValue__Group_3__0 )?
            {
             before(grammarAccess.getIntegerValueAccess().getGroup_3()); 
            // InternalQL.g:5314:2: ( rule__IntegerValue__Group_3__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==62) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalQL.g:5314:3: rule__IntegerValue__Group_3__0
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
    // InternalQL.g:5322:1: rule__IntegerValue__Group__4 : rule__IntegerValue__Group__4__Impl ;
    public final void rule__IntegerValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5326:1: ( rule__IntegerValue__Group__4__Impl )
            // InternalQL.g:5327:2: rule__IntegerValue__Group__4__Impl
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
    // InternalQL.g:5333:1: rule__IntegerValue__Group__4__Impl : ( '}' ) ;
    public final void rule__IntegerValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5337:1: ( ( '}' ) )
            // InternalQL.g:5338:1: ( '}' )
            {
            // InternalQL.g:5338:1: ( '}' )
            // InternalQL.g:5339:2: '}'
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
    // InternalQL.g:5349:1: rule__IntegerValue__Group_3__0 : rule__IntegerValue__Group_3__0__Impl rule__IntegerValue__Group_3__1 ;
    public final void rule__IntegerValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5353:1: ( rule__IntegerValue__Group_3__0__Impl rule__IntegerValue__Group_3__1 )
            // InternalQL.g:5354:2: rule__IntegerValue__Group_3__0__Impl rule__IntegerValue__Group_3__1
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
    // InternalQL.g:5361:1: rule__IntegerValue__Group_3__0__Impl : ( 'intValue' ) ;
    public final void rule__IntegerValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5365:1: ( ( 'intValue' ) )
            // InternalQL.g:5366:1: ( 'intValue' )
            {
            // InternalQL.g:5366:1: ( 'intValue' )
            // InternalQL.g:5367:2: 'intValue'
            {
             before(grammarAccess.getIntegerValueAccess().getIntValueKeyword_3_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalQL.g:5376:1: rule__IntegerValue__Group_3__1 : rule__IntegerValue__Group_3__1__Impl ;
    public final void rule__IntegerValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5380:1: ( rule__IntegerValue__Group_3__1__Impl )
            // InternalQL.g:5381:2: rule__IntegerValue__Group_3__1__Impl
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
    // InternalQL.g:5387:1: rule__IntegerValue__Group_3__1__Impl : ( ( rule__IntegerValue__IntValueAssignment_3_1 ) ) ;
    public final void rule__IntegerValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5391:1: ( ( ( rule__IntegerValue__IntValueAssignment_3_1 ) ) )
            // InternalQL.g:5392:1: ( ( rule__IntegerValue__IntValueAssignment_3_1 ) )
            {
            // InternalQL.g:5392:1: ( ( rule__IntegerValue__IntValueAssignment_3_1 ) )
            // InternalQL.g:5393:2: ( rule__IntegerValue__IntValueAssignment_3_1 )
            {
             before(grammarAccess.getIntegerValueAccess().getIntValueAssignment_3_1()); 
            // InternalQL.g:5394:2: ( rule__IntegerValue__IntValueAssignment_3_1 )
            // InternalQL.g:5394:3: rule__IntegerValue__IntValueAssignment_3_1
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
    // InternalQL.g:5403:1: rule__StringValue__Group__0 : rule__StringValue__Group__0__Impl rule__StringValue__Group__1 ;
    public final void rule__StringValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5407:1: ( rule__StringValue__Group__0__Impl rule__StringValue__Group__1 )
            // InternalQL.g:5408:2: rule__StringValue__Group__0__Impl rule__StringValue__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalQL.g:5415:1: rule__StringValue__Group__0__Impl : ( () ) ;
    public final void rule__StringValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5419:1: ( ( () ) )
            // InternalQL.g:5420:1: ( () )
            {
            // InternalQL.g:5420:1: ( () )
            // InternalQL.g:5421:2: ()
            {
             before(grammarAccess.getStringValueAccess().getStringValueAction_0()); 
            // InternalQL.g:5422:2: ()
            // InternalQL.g:5422:3: 
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
    // InternalQL.g:5430:1: rule__StringValue__Group__1 : rule__StringValue__Group__1__Impl rule__StringValue__Group__2 ;
    public final void rule__StringValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5434:1: ( rule__StringValue__Group__1__Impl rule__StringValue__Group__2 )
            // InternalQL.g:5435:2: rule__StringValue__Group__1__Impl rule__StringValue__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalQL.g:5442:1: rule__StringValue__Group__1__Impl : ( 'StringValue' ) ;
    public final void rule__StringValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5446:1: ( ( 'StringValue' ) )
            // InternalQL.g:5447:1: ( 'StringValue' )
            {
            // InternalQL.g:5447:1: ( 'StringValue' )
            // InternalQL.g:5448:2: 'StringValue'
            {
             before(grammarAccess.getStringValueAccess().getStringValueKeyword_1()); 
            match(input,63,FOLLOW_2); 
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
    // InternalQL.g:5457:1: rule__StringValue__Group__2 : rule__StringValue__Group__2__Impl rule__StringValue__Group__3 ;
    public final void rule__StringValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5461:1: ( rule__StringValue__Group__2__Impl rule__StringValue__Group__3 )
            // InternalQL.g:5462:2: rule__StringValue__Group__2__Impl rule__StringValue__Group__3
            {
            pushFollow(FOLLOW_47);
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
    // InternalQL.g:5469:1: rule__StringValue__Group__2__Impl : ( '{' ) ;
    public final void rule__StringValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5473:1: ( ( '{' ) )
            // InternalQL.g:5474:1: ( '{' )
            {
            // InternalQL.g:5474:1: ( '{' )
            // InternalQL.g:5475:2: '{'
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
    // InternalQL.g:5484:1: rule__StringValue__Group__3 : rule__StringValue__Group__3__Impl rule__StringValue__Group__4 ;
    public final void rule__StringValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5488:1: ( rule__StringValue__Group__3__Impl rule__StringValue__Group__4 )
            // InternalQL.g:5489:2: rule__StringValue__Group__3__Impl rule__StringValue__Group__4
            {
            pushFollow(FOLLOW_47);
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
    // InternalQL.g:5496:1: rule__StringValue__Group__3__Impl : ( ( rule__StringValue__Group_3__0 )? ) ;
    public final void rule__StringValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5500:1: ( ( ( rule__StringValue__Group_3__0 )? ) )
            // InternalQL.g:5501:1: ( ( rule__StringValue__Group_3__0 )? )
            {
            // InternalQL.g:5501:1: ( ( rule__StringValue__Group_3__0 )? )
            // InternalQL.g:5502:2: ( rule__StringValue__Group_3__0 )?
            {
             before(grammarAccess.getStringValueAccess().getGroup_3()); 
            // InternalQL.g:5503:2: ( rule__StringValue__Group_3__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==64) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalQL.g:5503:3: rule__StringValue__Group_3__0
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
    // InternalQL.g:5511:1: rule__StringValue__Group__4 : rule__StringValue__Group__4__Impl ;
    public final void rule__StringValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5515:1: ( rule__StringValue__Group__4__Impl )
            // InternalQL.g:5516:2: rule__StringValue__Group__4__Impl
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
    // InternalQL.g:5522:1: rule__StringValue__Group__4__Impl : ( '}' ) ;
    public final void rule__StringValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5526:1: ( ( '}' ) )
            // InternalQL.g:5527:1: ( '}' )
            {
            // InternalQL.g:5527:1: ( '}' )
            // InternalQL.g:5528:2: '}'
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
    // InternalQL.g:5538:1: rule__StringValue__Group_3__0 : rule__StringValue__Group_3__0__Impl rule__StringValue__Group_3__1 ;
    public final void rule__StringValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5542:1: ( rule__StringValue__Group_3__0__Impl rule__StringValue__Group_3__1 )
            // InternalQL.g:5543:2: rule__StringValue__Group_3__0__Impl rule__StringValue__Group_3__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalQL.g:5550:1: rule__StringValue__Group_3__0__Impl : ( 'stringValue' ) ;
    public final void rule__StringValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5554:1: ( ( 'stringValue' ) )
            // InternalQL.g:5555:1: ( 'stringValue' )
            {
            // InternalQL.g:5555:1: ( 'stringValue' )
            // InternalQL.g:5556:2: 'stringValue'
            {
             before(grammarAccess.getStringValueAccess().getStringValueKeyword_3_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalQL.g:5565:1: rule__StringValue__Group_3__1 : rule__StringValue__Group_3__1__Impl ;
    public final void rule__StringValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5569:1: ( rule__StringValue__Group_3__1__Impl )
            // InternalQL.g:5570:2: rule__StringValue__Group_3__1__Impl
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
    // InternalQL.g:5576:1: rule__StringValue__Group_3__1__Impl : ( ( rule__StringValue__StringValueAssignment_3_1 ) ) ;
    public final void rule__StringValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5580:1: ( ( ( rule__StringValue__StringValueAssignment_3_1 ) ) )
            // InternalQL.g:5581:1: ( ( rule__StringValue__StringValueAssignment_3_1 ) )
            {
            // InternalQL.g:5581:1: ( ( rule__StringValue__StringValueAssignment_3_1 ) )
            // InternalQL.g:5582:2: ( rule__StringValue__StringValueAssignment_3_1 )
            {
             before(grammarAccess.getStringValueAccess().getStringValueAssignment_3_1()); 
            // InternalQL.g:5583:2: ( rule__StringValue__StringValueAssignment_3_1 )
            // InternalQL.g:5583:3: rule__StringValue__StringValueAssignment_3_1
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
    // InternalQL.g:5592:1: rule__BooleanValue__Group__0 : rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1 ;
    public final void rule__BooleanValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5596:1: ( rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1 )
            // InternalQL.g:5597:2: rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalQL.g:5604:1: rule__BooleanValue__Group__0__Impl : ( () ) ;
    public final void rule__BooleanValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5608:1: ( ( () ) )
            // InternalQL.g:5609:1: ( () )
            {
            // InternalQL.g:5609:1: ( () )
            // InternalQL.g:5610:2: ()
            {
             before(grammarAccess.getBooleanValueAccess().getBooleanValueAction_0()); 
            // InternalQL.g:5611:2: ()
            // InternalQL.g:5611:3: 
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
    // InternalQL.g:5619:1: rule__BooleanValue__Group__1 : rule__BooleanValue__Group__1__Impl rule__BooleanValue__Group__2 ;
    public final void rule__BooleanValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5623:1: ( rule__BooleanValue__Group__1__Impl rule__BooleanValue__Group__2 )
            // InternalQL.g:5624:2: rule__BooleanValue__Group__1__Impl rule__BooleanValue__Group__2
            {
            pushFollow(FOLLOW_48);
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
    // InternalQL.g:5631:1: rule__BooleanValue__Group__1__Impl : ( ( rule__BooleanValue__BooleanValueAssignment_1 )? ) ;
    public final void rule__BooleanValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5635:1: ( ( ( rule__BooleanValue__BooleanValueAssignment_1 )? ) )
            // InternalQL.g:5636:1: ( ( rule__BooleanValue__BooleanValueAssignment_1 )? )
            {
            // InternalQL.g:5636:1: ( ( rule__BooleanValue__BooleanValueAssignment_1 )? )
            // InternalQL.g:5637:2: ( rule__BooleanValue__BooleanValueAssignment_1 )?
            {
             before(grammarAccess.getBooleanValueAccess().getBooleanValueAssignment_1()); 
            // InternalQL.g:5638:2: ( rule__BooleanValue__BooleanValueAssignment_1 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==75) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalQL.g:5638:3: rule__BooleanValue__BooleanValueAssignment_1
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
    // InternalQL.g:5646:1: rule__BooleanValue__Group__2 : rule__BooleanValue__Group__2__Impl ;
    public final void rule__BooleanValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5650:1: ( rule__BooleanValue__Group__2__Impl )
            // InternalQL.g:5651:2: rule__BooleanValue__Group__2__Impl
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
    // InternalQL.g:5657:1: rule__BooleanValue__Group__2__Impl : ( 'BooleanValue' ) ;
    public final void rule__BooleanValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5661:1: ( ( 'BooleanValue' ) )
            // InternalQL.g:5662:1: ( 'BooleanValue' )
            {
            // InternalQL.g:5662:1: ( 'BooleanValue' )
            // InternalQL.g:5663:2: 'BooleanValue'
            {
             before(grammarAccess.getBooleanValueAccess().getBooleanValueKeyword_2()); 
            match(input,65,FOLLOW_2); 
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
    // InternalQL.g:5673:1: rule__DateValue__Group__0 : rule__DateValue__Group__0__Impl rule__DateValue__Group__1 ;
    public final void rule__DateValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5677:1: ( rule__DateValue__Group__0__Impl rule__DateValue__Group__1 )
            // InternalQL.g:5678:2: rule__DateValue__Group__0__Impl rule__DateValue__Group__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalQL.g:5685:1: rule__DateValue__Group__0__Impl : ( () ) ;
    public final void rule__DateValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5689:1: ( ( () ) )
            // InternalQL.g:5690:1: ( () )
            {
            // InternalQL.g:5690:1: ( () )
            // InternalQL.g:5691:2: ()
            {
             before(grammarAccess.getDateValueAccess().getDateValueAction_0()); 
            // InternalQL.g:5692:2: ()
            // InternalQL.g:5692:3: 
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
    // InternalQL.g:5700:1: rule__DateValue__Group__1 : rule__DateValue__Group__1__Impl rule__DateValue__Group__2 ;
    public final void rule__DateValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5704:1: ( rule__DateValue__Group__1__Impl rule__DateValue__Group__2 )
            // InternalQL.g:5705:2: rule__DateValue__Group__1__Impl rule__DateValue__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalQL.g:5712:1: rule__DateValue__Group__1__Impl : ( 'DateValue' ) ;
    public final void rule__DateValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5716:1: ( ( 'DateValue' ) )
            // InternalQL.g:5717:1: ( 'DateValue' )
            {
            // InternalQL.g:5717:1: ( 'DateValue' )
            // InternalQL.g:5718:2: 'DateValue'
            {
             before(grammarAccess.getDateValueAccess().getDateValueKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalQL.g:5727:1: rule__DateValue__Group__2 : rule__DateValue__Group__2__Impl rule__DateValue__Group__3 ;
    public final void rule__DateValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5731:1: ( rule__DateValue__Group__2__Impl rule__DateValue__Group__3 )
            // InternalQL.g:5732:2: rule__DateValue__Group__2__Impl rule__DateValue__Group__3
            {
            pushFollow(FOLLOW_50);
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
    // InternalQL.g:5739:1: rule__DateValue__Group__2__Impl : ( '{' ) ;
    public final void rule__DateValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5743:1: ( ( '{' ) )
            // InternalQL.g:5744:1: ( '{' )
            {
            // InternalQL.g:5744:1: ( '{' )
            // InternalQL.g:5745:2: '{'
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
    // InternalQL.g:5754:1: rule__DateValue__Group__3 : rule__DateValue__Group__3__Impl rule__DateValue__Group__4 ;
    public final void rule__DateValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5758:1: ( rule__DateValue__Group__3__Impl rule__DateValue__Group__4 )
            // InternalQL.g:5759:2: rule__DateValue__Group__3__Impl rule__DateValue__Group__4
            {
            pushFollow(FOLLOW_50);
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
    // InternalQL.g:5766:1: rule__DateValue__Group__3__Impl : ( ( rule__DateValue__Group_3__0 )? ) ;
    public final void rule__DateValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5770:1: ( ( ( rule__DateValue__Group_3__0 )? ) )
            // InternalQL.g:5771:1: ( ( rule__DateValue__Group_3__0 )? )
            {
            // InternalQL.g:5771:1: ( ( rule__DateValue__Group_3__0 )? )
            // InternalQL.g:5772:2: ( rule__DateValue__Group_3__0 )?
            {
             before(grammarAccess.getDateValueAccess().getGroup_3()); 
            // InternalQL.g:5773:2: ( rule__DateValue__Group_3__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==67) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalQL.g:5773:3: rule__DateValue__Group_3__0
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
    // InternalQL.g:5781:1: rule__DateValue__Group__4 : rule__DateValue__Group__4__Impl ;
    public final void rule__DateValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5785:1: ( rule__DateValue__Group__4__Impl )
            // InternalQL.g:5786:2: rule__DateValue__Group__4__Impl
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
    // InternalQL.g:5792:1: rule__DateValue__Group__4__Impl : ( '}' ) ;
    public final void rule__DateValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5796:1: ( ( '}' ) )
            // InternalQL.g:5797:1: ( '}' )
            {
            // InternalQL.g:5797:1: ( '}' )
            // InternalQL.g:5798:2: '}'
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
    // InternalQL.g:5808:1: rule__DateValue__Group_3__0 : rule__DateValue__Group_3__0__Impl rule__DateValue__Group_3__1 ;
    public final void rule__DateValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5812:1: ( rule__DateValue__Group_3__0__Impl rule__DateValue__Group_3__1 )
            // InternalQL.g:5813:2: rule__DateValue__Group_3__0__Impl rule__DateValue__Group_3__1
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
    // InternalQL.g:5820:1: rule__DateValue__Group_3__0__Impl : ( 'dateValue' ) ;
    public final void rule__DateValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5824:1: ( ( 'dateValue' ) )
            // InternalQL.g:5825:1: ( 'dateValue' )
            {
            // InternalQL.g:5825:1: ( 'dateValue' )
            // InternalQL.g:5826:2: 'dateValue'
            {
             before(grammarAccess.getDateValueAccess().getDateValueKeyword_3_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalQL.g:5835:1: rule__DateValue__Group_3__1 : rule__DateValue__Group_3__1__Impl ;
    public final void rule__DateValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5839:1: ( rule__DateValue__Group_3__1__Impl )
            // InternalQL.g:5840:2: rule__DateValue__Group_3__1__Impl
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
    // InternalQL.g:5846:1: rule__DateValue__Group_3__1__Impl : ( ( rule__DateValue__DateValueAssignment_3_1 ) ) ;
    public final void rule__DateValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5850:1: ( ( ( rule__DateValue__DateValueAssignment_3_1 ) ) )
            // InternalQL.g:5851:1: ( ( rule__DateValue__DateValueAssignment_3_1 ) )
            {
            // InternalQL.g:5851:1: ( ( rule__DateValue__DateValueAssignment_3_1 ) )
            // InternalQL.g:5852:2: ( rule__DateValue__DateValueAssignment_3_1 )
            {
             before(grammarAccess.getDateValueAccess().getDateValueAssignment_3_1()); 
            // InternalQL.g:5853:2: ( rule__DateValue__DateValueAssignment_3_1 )
            // InternalQL.g:5853:3: rule__DateValue__DateValueAssignment_3_1
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
    // InternalQL.g:5862:1: rule__DecimalValue__Group__0 : rule__DecimalValue__Group__0__Impl rule__DecimalValue__Group__1 ;
    public final void rule__DecimalValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5866:1: ( rule__DecimalValue__Group__0__Impl rule__DecimalValue__Group__1 )
            // InternalQL.g:5867:2: rule__DecimalValue__Group__0__Impl rule__DecimalValue__Group__1
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
    // InternalQL.g:5874:1: rule__DecimalValue__Group__0__Impl : ( () ) ;
    public final void rule__DecimalValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5878:1: ( ( () ) )
            // InternalQL.g:5879:1: ( () )
            {
            // InternalQL.g:5879:1: ( () )
            // InternalQL.g:5880:2: ()
            {
             before(grammarAccess.getDecimalValueAccess().getDecimalValueAction_0()); 
            // InternalQL.g:5881:2: ()
            // InternalQL.g:5881:3: 
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
    // InternalQL.g:5889:1: rule__DecimalValue__Group__1 : rule__DecimalValue__Group__1__Impl rule__DecimalValue__Group__2 ;
    public final void rule__DecimalValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5893:1: ( rule__DecimalValue__Group__1__Impl rule__DecimalValue__Group__2 )
            // InternalQL.g:5894:2: rule__DecimalValue__Group__1__Impl rule__DecimalValue__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalQL.g:5901:1: rule__DecimalValue__Group__1__Impl : ( 'DecimalValue' ) ;
    public final void rule__DecimalValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5905:1: ( ( 'DecimalValue' ) )
            // InternalQL.g:5906:1: ( 'DecimalValue' )
            {
            // InternalQL.g:5906:1: ( 'DecimalValue' )
            // InternalQL.g:5907:2: 'DecimalValue'
            {
             before(grammarAccess.getDecimalValueAccess().getDecimalValueKeyword_1()); 
            match(input,68,FOLLOW_2); 
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
    // InternalQL.g:5916:1: rule__DecimalValue__Group__2 : rule__DecimalValue__Group__2__Impl rule__DecimalValue__Group__3 ;
    public final void rule__DecimalValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5920:1: ( rule__DecimalValue__Group__2__Impl rule__DecimalValue__Group__3 )
            // InternalQL.g:5921:2: rule__DecimalValue__Group__2__Impl rule__DecimalValue__Group__3
            {
            pushFollow(FOLLOW_51);
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
    // InternalQL.g:5928:1: rule__DecimalValue__Group__2__Impl : ( '{' ) ;
    public final void rule__DecimalValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5932:1: ( ( '{' ) )
            // InternalQL.g:5933:1: ( '{' )
            {
            // InternalQL.g:5933:1: ( '{' )
            // InternalQL.g:5934:2: '{'
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
    // InternalQL.g:5943:1: rule__DecimalValue__Group__3 : rule__DecimalValue__Group__3__Impl rule__DecimalValue__Group__4 ;
    public final void rule__DecimalValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5947:1: ( rule__DecimalValue__Group__3__Impl rule__DecimalValue__Group__4 )
            // InternalQL.g:5948:2: rule__DecimalValue__Group__3__Impl rule__DecimalValue__Group__4
            {
            pushFollow(FOLLOW_51);
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
    // InternalQL.g:5955:1: rule__DecimalValue__Group__3__Impl : ( ( rule__DecimalValue__Group_3__0 )? ) ;
    public final void rule__DecimalValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5959:1: ( ( ( rule__DecimalValue__Group_3__0 )? ) )
            // InternalQL.g:5960:1: ( ( rule__DecimalValue__Group_3__0 )? )
            {
            // InternalQL.g:5960:1: ( ( rule__DecimalValue__Group_3__0 )? )
            // InternalQL.g:5961:2: ( rule__DecimalValue__Group_3__0 )?
            {
             before(grammarAccess.getDecimalValueAccess().getGroup_3()); 
            // InternalQL.g:5962:2: ( rule__DecimalValue__Group_3__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==69) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalQL.g:5962:3: rule__DecimalValue__Group_3__0
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
    // InternalQL.g:5970:1: rule__DecimalValue__Group__4 : rule__DecimalValue__Group__4__Impl ;
    public final void rule__DecimalValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5974:1: ( rule__DecimalValue__Group__4__Impl )
            // InternalQL.g:5975:2: rule__DecimalValue__Group__4__Impl
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
    // InternalQL.g:5981:1: rule__DecimalValue__Group__4__Impl : ( '}' ) ;
    public final void rule__DecimalValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5985:1: ( ( '}' ) )
            // InternalQL.g:5986:1: ( '}' )
            {
            // InternalQL.g:5986:1: ( '}' )
            // InternalQL.g:5987:2: '}'
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
    // InternalQL.g:5997:1: rule__DecimalValue__Group_3__0 : rule__DecimalValue__Group_3__0__Impl rule__DecimalValue__Group_3__1 ;
    public final void rule__DecimalValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6001:1: ( rule__DecimalValue__Group_3__0__Impl rule__DecimalValue__Group_3__1 )
            // InternalQL.g:6002:2: rule__DecimalValue__Group_3__0__Impl rule__DecimalValue__Group_3__1
            {
            pushFollow(FOLLOW_52);
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
    // InternalQL.g:6009:1: rule__DecimalValue__Group_3__0__Impl : ( 'decimalValue' ) ;
    public final void rule__DecimalValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6013:1: ( ( 'decimalValue' ) )
            // InternalQL.g:6014:1: ( 'decimalValue' )
            {
            // InternalQL.g:6014:1: ( 'decimalValue' )
            // InternalQL.g:6015:2: 'decimalValue'
            {
             before(grammarAccess.getDecimalValueAccess().getDecimalValueKeyword_3_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalQL.g:6024:1: rule__DecimalValue__Group_3__1 : rule__DecimalValue__Group_3__1__Impl ;
    public final void rule__DecimalValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6028:1: ( rule__DecimalValue__Group_3__1__Impl )
            // InternalQL.g:6029:2: rule__DecimalValue__Group_3__1__Impl
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
    // InternalQL.g:6035:1: rule__DecimalValue__Group_3__1__Impl : ( ( rule__DecimalValue__DecimalValueAssignment_3_1 ) ) ;
    public final void rule__DecimalValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6039:1: ( ( ( rule__DecimalValue__DecimalValueAssignment_3_1 ) ) )
            // InternalQL.g:6040:1: ( ( rule__DecimalValue__DecimalValueAssignment_3_1 ) )
            {
            // InternalQL.g:6040:1: ( ( rule__DecimalValue__DecimalValueAssignment_3_1 ) )
            // InternalQL.g:6041:2: ( rule__DecimalValue__DecimalValueAssignment_3_1 )
            {
             before(grammarAccess.getDecimalValueAccess().getDecimalValueAssignment_3_1()); 
            // InternalQL.g:6042:2: ( rule__DecimalValue__DecimalValueAssignment_3_1 )
            // InternalQL.g:6042:3: rule__DecimalValue__DecimalValueAssignment_3_1
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
    // InternalQL.g:6051:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6055:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalQL.g:6056:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FOLLOW_52);
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
    // InternalQL.g:6063:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6067:1: ( ( ( '-' )? ) )
            // InternalQL.g:6068:1: ( ( '-' )? )
            {
            // InternalQL.g:6068:1: ( ( '-' )? )
            // InternalQL.g:6069:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalQL.g:6070:2: ( '-' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==60) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalQL.g:6070:3: '-'
                    {
                    match(input,60,FOLLOW_2); 

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
    // InternalQL.g:6078:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6082:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalQL.g:6083:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FOLLOW_52);
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
    // InternalQL.g:6090:1: rule__EFloat__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6094:1: ( ( ( RULE_INT )? ) )
            // InternalQL.g:6095:1: ( ( RULE_INT )? )
            {
            // InternalQL.g:6095:1: ( ( RULE_INT )? )
            // InternalQL.g:6096:2: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
            // InternalQL.g:6097:2: ( RULE_INT )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_INT) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalQL.g:6097:3: RULE_INT
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
    // InternalQL.g:6105:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl rule__EFloat__Group__3 ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6109:1: ( rule__EFloat__Group__2__Impl rule__EFloat__Group__3 )
            // InternalQL.g:6110:2: rule__EFloat__Group__2__Impl rule__EFloat__Group__3
            {
            pushFollow(FOLLOW_53);
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
    // InternalQL.g:6117:1: rule__EFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6121:1: ( ( '.' ) )
            // InternalQL.g:6122:1: ( '.' )
            {
            // InternalQL.g:6122:1: ( '.' )
            // InternalQL.g:6123:2: '.'
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
            match(input,70,FOLLOW_2); 
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
    // InternalQL.g:6132:1: rule__EFloat__Group__3 : rule__EFloat__Group__3__Impl rule__EFloat__Group__4 ;
    public final void rule__EFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6136:1: ( rule__EFloat__Group__3__Impl rule__EFloat__Group__4 )
            // InternalQL.g:6137:2: rule__EFloat__Group__3__Impl rule__EFloat__Group__4
            {
            pushFollow(FOLLOW_54);
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
    // InternalQL.g:6144:1: rule__EFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6148:1: ( ( RULE_INT ) )
            // InternalQL.g:6149:1: ( RULE_INT )
            {
            // InternalQL.g:6149:1: ( RULE_INT )
            // InternalQL.g:6150:2: RULE_INT
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
    // InternalQL.g:6159:1: rule__EFloat__Group__4 : rule__EFloat__Group__4__Impl ;
    public final void rule__EFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6163:1: ( rule__EFloat__Group__4__Impl )
            // InternalQL.g:6164:2: rule__EFloat__Group__4__Impl
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
    // InternalQL.g:6170:1: rule__EFloat__Group__4__Impl : ( ( rule__EFloat__Group_4__0 )? ) ;
    public final void rule__EFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6174:1: ( ( ( rule__EFloat__Group_4__0 )? ) )
            // InternalQL.g:6175:1: ( ( rule__EFloat__Group_4__0 )? )
            {
            // InternalQL.g:6175:1: ( ( rule__EFloat__Group_4__0 )? )
            // InternalQL.g:6176:2: ( rule__EFloat__Group_4__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_4()); 
            // InternalQL.g:6177:2: ( rule__EFloat__Group_4__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=12 && LA49_0<=13)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalQL.g:6177:3: rule__EFloat__Group_4__0
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
    // InternalQL.g:6186:1: rule__EFloat__Group_4__0 : rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 ;
    public final void rule__EFloat__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6190:1: ( rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 )
            // InternalQL.g:6191:2: rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1
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
    // InternalQL.g:6198:1: rule__EFloat__Group_4__0__Impl : ( ( rule__EFloat__Alternatives_4_0 ) ) ;
    public final void rule__EFloat__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6202:1: ( ( ( rule__EFloat__Alternatives_4_0 ) ) )
            // InternalQL.g:6203:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            {
            // InternalQL.g:6203:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            // InternalQL.g:6204:2: ( rule__EFloat__Alternatives_4_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 
            // InternalQL.g:6205:2: ( rule__EFloat__Alternatives_4_0 )
            // InternalQL.g:6205:3: rule__EFloat__Alternatives_4_0
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
    // InternalQL.g:6213:1: rule__EFloat__Group_4__1 : rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 ;
    public final void rule__EFloat__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6217:1: ( rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 )
            // InternalQL.g:6218:2: rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2
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
    // InternalQL.g:6225:1: rule__EFloat__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6229:1: ( ( ( '-' )? ) )
            // InternalQL.g:6230:1: ( ( '-' )? )
            {
            // InternalQL.g:6230:1: ( ( '-' )? )
            // InternalQL.g:6231:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
            // InternalQL.g:6232:2: ( '-' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==60) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalQL.g:6232:3: '-'
                    {
                    match(input,60,FOLLOW_2); 

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
    // InternalQL.g:6240:1: rule__EFloat__Group_4__2 : rule__EFloat__Group_4__2__Impl ;
    public final void rule__EFloat__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6244:1: ( rule__EFloat__Group_4__2__Impl )
            // InternalQL.g:6245:2: rule__EFloat__Group_4__2__Impl
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
    // InternalQL.g:6251:1: rule__EFloat__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6255:1: ( ( RULE_INT ) )
            // InternalQL.g:6256:1: ( RULE_INT )
            {
            // InternalQL.g:6256:1: ( RULE_INT )
            // InternalQL.g:6257:2: RULE_INT
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
    // InternalQL.g:6267:1: rule__QuestionDefinition__Group__0 : rule__QuestionDefinition__Group__0__Impl rule__QuestionDefinition__Group__1 ;
    public final void rule__QuestionDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6271:1: ( rule__QuestionDefinition__Group__0__Impl rule__QuestionDefinition__Group__1 )
            // InternalQL.g:6272:2: rule__QuestionDefinition__Group__0__Impl rule__QuestionDefinition__Group__1
            {
            pushFollow(FOLLOW_55);
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
    // InternalQL.g:6279:1: rule__QuestionDefinition__Group__0__Impl : ( ( rule__QuestionDefinition__IsMandatoryAssignment_0 )? ) ;
    public final void rule__QuestionDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6283:1: ( ( ( rule__QuestionDefinition__IsMandatoryAssignment_0 )? ) )
            // InternalQL.g:6284:1: ( ( rule__QuestionDefinition__IsMandatoryAssignment_0 )? )
            {
            // InternalQL.g:6284:1: ( ( rule__QuestionDefinition__IsMandatoryAssignment_0 )? )
            // InternalQL.g:6285:2: ( rule__QuestionDefinition__IsMandatoryAssignment_0 )?
            {
             before(grammarAccess.getQuestionDefinitionAccess().getIsMandatoryAssignment_0()); 
            // InternalQL.g:6286:2: ( rule__QuestionDefinition__IsMandatoryAssignment_0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==76) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalQL.g:6286:3: rule__QuestionDefinition__IsMandatoryAssignment_0
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
    // InternalQL.g:6294:1: rule__QuestionDefinition__Group__1 : rule__QuestionDefinition__Group__1__Impl rule__QuestionDefinition__Group__2 ;
    public final void rule__QuestionDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6298:1: ( rule__QuestionDefinition__Group__1__Impl rule__QuestionDefinition__Group__2 )
            // InternalQL.g:6299:2: rule__QuestionDefinition__Group__1__Impl rule__QuestionDefinition__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalQL.g:6306:1: rule__QuestionDefinition__Group__1__Impl : ( 'question' ) ;
    public final void rule__QuestionDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6310:1: ( ( 'question' ) )
            // InternalQL.g:6311:1: ( 'question' )
            {
            // InternalQL.g:6311:1: ( 'question' )
            // InternalQL.g:6312:2: 'question'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getQuestionKeyword_1()); 
            match(input,49,FOLLOW_2); 
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
    // InternalQL.g:6321:1: rule__QuestionDefinition__Group__2 : rule__QuestionDefinition__Group__2__Impl rule__QuestionDefinition__Group__3 ;
    public final void rule__QuestionDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6325:1: ( rule__QuestionDefinition__Group__2__Impl rule__QuestionDefinition__Group__3 )
            // InternalQL.g:6326:2: rule__QuestionDefinition__Group__2__Impl rule__QuestionDefinition__Group__3
            {
            pushFollow(FOLLOW_56);
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
    // InternalQL.g:6333:1: rule__QuestionDefinition__Group__2__Impl : ( ( rule__QuestionDefinition__NameAssignment_2 ) ) ;
    public final void rule__QuestionDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6337:1: ( ( ( rule__QuestionDefinition__NameAssignment_2 ) ) )
            // InternalQL.g:6338:1: ( ( rule__QuestionDefinition__NameAssignment_2 ) )
            {
            // InternalQL.g:6338:1: ( ( rule__QuestionDefinition__NameAssignment_2 ) )
            // InternalQL.g:6339:2: ( rule__QuestionDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getNameAssignment_2()); 
            // InternalQL.g:6340:2: ( rule__QuestionDefinition__NameAssignment_2 )
            // InternalQL.g:6340:3: rule__QuestionDefinition__NameAssignment_2
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
    // InternalQL.g:6348:1: rule__QuestionDefinition__Group__3 : rule__QuestionDefinition__Group__3__Impl rule__QuestionDefinition__Group__4 ;
    public final void rule__QuestionDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6352:1: ( rule__QuestionDefinition__Group__3__Impl rule__QuestionDefinition__Group__4 )
            // InternalQL.g:6353:2: rule__QuestionDefinition__Group__3__Impl rule__QuestionDefinition__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalQL.g:6360:1: rule__QuestionDefinition__Group__3__Impl : ( ':' ) ;
    public final void rule__QuestionDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6364:1: ( ( ':' ) )
            // InternalQL.g:6365:1: ( ':' )
            {
            // InternalQL.g:6365:1: ( ':' )
            // InternalQL.g:6366:2: ':'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getColonKeyword_3()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getQuestionDefinitionAccess().getColonKeyword_3()); 

            }


            }

        }
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
    // InternalQL.g:6375:1: rule__QuestionDefinition__Group__4 : rule__QuestionDefinition__Group__4__Impl rule__QuestionDefinition__Group__5 ;
    public final void rule__QuestionDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6379:1: ( rule__QuestionDefinition__Group__4__Impl rule__QuestionDefinition__Group__5 )
            // InternalQL.g:6380:2: rule__QuestionDefinition__Group__4__Impl rule__QuestionDefinition__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalQL.g:6387:1: rule__QuestionDefinition__Group__4__Impl : ( ( rule__QuestionDefinition__LabelAssignment_4 ) ) ;
    public final void rule__QuestionDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6391:1: ( ( ( rule__QuestionDefinition__LabelAssignment_4 ) ) )
            // InternalQL.g:6392:1: ( ( rule__QuestionDefinition__LabelAssignment_4 ) )
            {
            // InternalQL.g:6392:1: ( ( rule__QuestionDefinition__LabelAssignment_4 ) )
            // InternalQL.g:6393:2: ( rule__QuestionDefinition__LabelAssignment_4 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getLabelAssignment_4()); 
            // InternalQL.g:6394:2: ( rule__QuestionDefinition__LabelAssignment_4 )
            // InternalQL.g:6394:3: rule__QuestionDefinition__LabelAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__LabelAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getQuestionDefinitionAccess().getLabelAssignment_4()); 

            }


            }

        }
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
    // InternalQL.g:6402:1: rule__QuestionDefinition__Group__5 : rule__QuestionDefinition__Group__5__Impl rule__QuestionDefinition__Group__6 ;
    public final void rule__QuestionDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6406:1: ( rule__QuestionDefinition__Group__5__Impl rule__QuestionDefinition__Group__6 )
            // InternalQL.g:6407:2: rule__QuestionDefinition__Group__5__Impl rule__QuestionDefinition__Group__6
            {
            pushFollow(FOLLOW_57);
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
    // InternalQL.g:6414:1: rule__QuestionDefinition__Group__5__Impl : ( ( rule__QuestionDefinition__DataTypeAssignment_5 ) ) ;
    public final void rule__QuestionDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6418:1: ( ( ( rule__QuestionDefinition__DataTypeAssignment_5 ) ) )
            // InternalQL.g:6419:1: ( ( rule__QuestionDefinition__DataTypeAssignment_5 ) )
            {
            // InternalQL.g:6419:1: ( ( rule__QuestionDefinition__DataTypeAssignment_5 ) )
            // InternalQL.g:6420:2: ( rule__QuestionDefinition__DataTypeAssignment_5 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getDataTypeAssignment_5()); 
            // InternalQL.g:6421:2: ( rule__QuestionDefinition__DataTypeAssignment_5 )
            // InternalQL.g:6421:3: rule__QuestionDefinition__DataTypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__DataTypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getQuestionDefinitionAccess().getDataTypeAssignment_5()); 

            }


            }

        }
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
    // InternalQL.g:6429:1: rule__QuestionDefinition__Group__6 : rule__QuestionDefinition__Group__6__Impl ;
    public final void rule__QuestionDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6433:1: ( rule__QuestionDefinition__Group__6__Impl )
            // InternalQL.g:6434:2: rule__QuestionDefinition__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalQL.g:6440:1: rule__QuestionDefinition__Group__6__Impl : ( ( rule__QuestionDefinition__Group_6__0 )? ) ;
    public final void rule__QuestionDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6444:1: ( ( ( rule__QuestionDefinition__Group_6__0 )? ) )
            // InternalQL.g:6445:1: ( ( rule__QuestionDefinition__Group_6__0 )? )
            {
            // InternalQL.g:6445:1: ( ( rule__QuestionDefinition__Group_6__0 )? )
            // InternalQL.g:6446:2: ( rule__QuestionDefinition__Group_6__0 )?
            {
             before(grammarAccess.getQuestionDefinitionAccess().getGroup_6()); 
            // InternalQL.g:6447:2: ( rule__QuestionDefinition__Group_6__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==72) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalQL.g:6447:3: rule__QuestionDefinition__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionDefinition__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionDefinitionAccess().getGroup_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__QuestionDefinition__Group_6__0"
    // InternalQL.g:6456:1: rule__QuestionDefinition__Group_6__0 : rule__QuestionDefinition__Group_6__0__Impl rule__QuestionDefinition__Group_6__1 ;
    public final void rule__QuestionDefinition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6460:1: ( rule__QuestionDefinition__Group_6__0__Impl rule__QuestionDefinition__Group_6__1 )
            // InternalQL.g:6461:2: rule__QuestionDefinition__Group_6__0__Impl rule__QuestionDefinition__Group_6__1
            {
            pushFollow(FOLLOW_18);
            rule__QuestionDefinition__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_6__0"


    // $ANTLR start "rule__QuestionDefinition__Group_6__0__Impl"
    // InternalQL.g:6468:1: rule__QuestionDefinition__Group_6__0__Impl : ( '=' ) ;
    public final void rule__QuestionDefinition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6472:1: ( ( '=' ) )
            // InternalQL.g:6473:1: ( '=' )
            {
            // InternalQL.g:6473:1: ( '=' )
            // InternalQL.g:6474:2: '='
            {
             before(grammarAccess.getQuestionDefinitionAccess().getEqualsSignKeyword_6_0()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getQuestionDefinitionAccess().getEqualsSignKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_6__0__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group_6__1"
    // InternalQL.g:6483:1: rule__QuestionDefinition__Group_6__1 : rule__QuestionDefinition__Group_6__1__Impl rule__QuestionDefinition__Group_6__2 ;
    public final void rule__QuestionDefinition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6487:1: ( rule__QuestionDefinition__Group_6__1__Impl rule__QuestionDefinition__Group_6__2 )
            // InternalQL.g:6488:2: rule__QuestionDefinition__Group_6__1__Impl rule__QuestionDefinition__Group_6__2
            {
            pushFollow(FOLLOW_58);
            rule__QuestionDefinition__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_6__1"


    // $ANTLR start "rule__QuestionDefinition__Group_6__1__Impl"
    // InternalQL.g:6495:1: rule__QuestionDefinition__Group_6__1__Impl : ( ( rule__QuestionDefinition__ComputedExpressionAssignment_6_1 ) ) ;
    public final void rule__QuestionDefinition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6499:1: ( ( ( rule__QuestionDefinition__ComputedExpressionAssignment_6_1 ) ) )
            // InternalQL.g:6500:1: ( ( rule__QuestionDefinition__ComputedExpressionAssignment_6_1 ) )
            {
            // InternalQL.g:6500:1: ( ( rule__QuestionDefinition__ComputedExpressionAssignment_6_1 ) )
            // InternalQL.g:6501:2: ( rule__QuestionDefinition__ComputedExpressionAssignment_6_1 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getComputedExpressionAssignment_6_1()); 
            // InternalQL.g:6502:2: ( rule__QuestionDefinition__ComputedExpressionAssignment_6_1 )
            // InternalQL.g:6502:3: rule__QuestionDefinition__ComputedExpressionAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__ComputedExpressionAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionDefinitionAccess().getComputedExpressionAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_6__1__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group_6__2"
    // InternalQL.g:6510:1: rule__QuestionDefinition__Group_6__2 : rule__QuestionDefinition__Group_6__2__Impl ;
    public final void rule__QuestionDefinition__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6514:1: ( rule__QuestionDefinition__Group_6__2__Impl )
            // InternalQL.g:6515:2: rule__QuestionDefinition__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_6__2"


    // $ANTLR start "rule__QuestionDefinition__Group_6__2__Impl"
    // InternalQL.g:6521:1: rule__QuestionDefinition__Group_6__2__Impl : ( ';' ) ;
    public final void rule__QuestionDefinition__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6525:1: ( ( ';' ) )
            // InternalQL.g:6526:1: ( ';' )
            {
            // InternalQL.g:6526:1: ( ';' )
            // InternalQL.g:6527:2: ';'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getSemicolonKeyword_6_2()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getQuestionDefinitionAccess().getSemicolonKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_6__2__Impl"


    // $ANTLR start "rule__QLModel__CanSubmitAssignment_2_1"
    // InternalQL.g:6537:1: rule__QLModel__CanSubmitAssignment_2_1 : ( ( 'canSubmit' ) ) ;
    public final void rule__QLModel__CanSubmitAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6541:1: ( ( ( 'canSubmit' ) ) )
            // InternalQL.g:6542:2: ( ( 'canSubmit' ) )
            {
            // InternalQL.g:6542:2: ( ( 'canSubmit' ) )
            // InternalQL.g:6543:3: ( 'canSubmit' )
            {
             before(grammarAccess.getQLModelAccess().getCanSubmitCanSubmitKeyword_2_1_0()); 
            // InternalQL.g:6544:3: ( 'canSubmit' )
            // InternalQL.g:6545:4: 'canSubmit'
            {
             before(grammarAccess.getQLModelAccess().getCanSubmitCanSubmitKeyword_2_1_0()); 
            match(input,74,FOLLOW_2); 
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
    // InternalQL.g:6556:1: rule__QLModel__SubmitDateAssignment_2_2_1 : ( ruleEDate ) ;
    public final void rule__QLModel__SubmitDateAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6560:1: ( ( ruleEDate ) )
            // InternalQL.g:6561:2: ( ruleEDate )
            {
            // InternalQL.g:6561:2: ( ruleEDate )
            // InternalQL.g:6562:3: ruleEDate
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
    // InternalQL.g:6571:1: rule__QLModel__DefinitionGroupAssignment_4_0 : ( ruleDefinitionGroup ) ;
    public final void rule__QLModel__DefinitionGroupAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6575:1: ( ( ruleDefinitionGroup ) )
            // InternalQL.g:6576:2: ( ruleDefinitionGroup )
            {
            // InternalQL.g:6576:2: ( ruleDefinitionGroup )
            // InternalQL.g:6577:3: ruleDefinitionGroup
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
    // InternalQL.g:6586:1: rule__QLModel__FormsAssignment_4_1 : ( ruleForm ) ;
    public final void rule__QLModel__FormsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6590:1: ( ( ruleForm ) )
            // InternalQL.g:6591:2: ( ruleForm )
            {
            // InternalQL.g:6591:2: ( ruleForm )
            // InternalQL.g:6592:3: ruleForm
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


    // $ANTLR start "rule__Form__NameAssignment_1"
    // InternalQL.g:6601:1: rule__Form__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Form__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6605:1: ( ( ruleEString ) )
            // InternalQL.g:6606:2: ( ruleEString )
            {
            // InternalQL.g:6606:2: ( ruleEString )
            // InternalQL.g:6607:3: ruleEString
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


    // $ANTLR start "rule__Form__QuestionGroupAssignment_2"
    // InternalQL.g:6616:1: rule__Form__QuestionGroupAssignment_2 : ( ruleQuestionGroup ) ;
    public final void rule__Form__QuestionGroupAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6620:1: ( ( ruleQuestionGroup ) )
            // InternalQL.g:6621:2: ( ruleQuestionGroup )
            {
            // InternalQL.g:6621:2: ( ruleQuestionGroup )
            // InternalQL.g:6622:3: ruleQuestionGroup
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
    // InternalQL.g:6631:1: rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0 : ( ruleQuestionDefinition ) ;
    public final void rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6635:1: ( ( ruleQuestionDefinition ) )
            // InternalQL.g:6636:2: ( ruleQuestionDefinition )
            {
            // InternalQL.g:6636:2: ( ruleQuestionDefinition )
            // InternalQL.g:6637:3: ruleQuestionDefinition
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
    // InternalQL.g:6646:1: rule__DefinitionGroup__DataTypesAssignment_3_1 : ( ruleValueType ) ;
    public final void rule__DefinitionGroup__DataTypesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6650:1: ( ( ruleValueType ) )
            // InternalQL.g:6651:2: ( ruleValueType )
            {
            // InternalQL.g:6651:2: ( ruleValueType )
            // InternalQL.g:6652:3: ruleValueType
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


    // $ANTLR start "rule__QuestionGroup__GuardAssignment_1_2"
    // InternalQL.g:6661:1: rule__QuestionGroup__GuardAssignment_1_2 : ( ruleExpression ) ;
    public final void rule__QuestionGroup__GuardAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6665:1: ( ( ruleExpression ) )
            // InternalQL.g:6666:2: ( ruleExpression )
            {
            // InternalQL.g:6666:2: ( ruleExpression )
            // InternalQL.g:6667:3: ruleExpression
            {
             before(grammarAccess.getQuestionGroupAccess().getGuardExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getQuestionGroupAccess().getGuardExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__GuardAssignment_1_2"


    // $ANTLR start "rule__QuestionGroup__QuestionGroupsAssignment_3_0"
    // InternalQL.g:6676:1: rule__QuestionGroup__QuestionGroupsAssignment_3_0 : ( ruleQuestionGroup ) ;
    public final void rule__QuestionGroup__QuestionGroupsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6680:1: ( ( ruleQuestionGroup ) )
            // InternalQL.g:6681:2: ( ruleQuestionGroup )
            {
            // InternalQL.g:6681:2: ( ruleQuestionGroup )
            // InternalQL.g:6682:3: ruleQuestionGroup
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
    // InternalQL.g:6691:1: rule__QuestionGroup__QuestionsAssignment_3_1 : ( ruleQuestion ) ;
    public final void rule__QuestionGroup__QuestionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6695:1: ( ( ruleQuestion ) )
            // InternalQL.g:6696:2: ( ruleQuestion )
            {
            // InternalQL.g:6696:2: ( ruleQuestion )
            // InternalQL.g:6697:3: ruleQuestion
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
    // InternalQL.g:6706:1: rule__Question__QuestionDefinitionAssignment : ( ( ruleEString ) ) ;
    public final void rule__Question__QuestionDefinitionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6710:1: ( ( ( ruleEString ) ) )
            // InternalQL.g:6711:2: ( ( ruleEString ) )
            {
            // InternalQL.g:6711:2: ( ( ruleEString ) )
            // InternalQL.g:6712:3: ( ruleEString )
            {
             before(grammarAccess.getQuestionAccess().getQuestionDefinitionQuestionDefinitionCrossReference_0()); 
            // InternalQL.g:6713:3: ( ruleEString )
            // InternalQL.g:6714:4: ruleEString
            {
             before(grammarAccess.getQuestionAccess().getQuestionDefinitionQuestionDefinitionEStringParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getQuestionDefinitionQuestionDefinitionEStringParserRuleCall_0_1()); 

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
    // InternalQL.g:6725:1: rule__ValueType_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ValueType_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6729:1: ( ( ruleEString ) )
            // InternalQL.g:6730:2: ( ruleEString )
            {
            // InternalQL.g:6730:2: ( ruleEString )
            // InternalQL.g:6731:3: ruleEString
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
    // InternalQL.g:6740:1: rule__ValueType_Impl__UnitAssignment_4_1 : ( ruleEString ) ;
    public final void rule__ValueType_Impl__UnitAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6744:1: ( ( ruleEString ) )
            // InternalQL.g:6745:2: ( ruleEString )
            {
            // InternalQL.g:6745:2: ( ruleEString )
            // InternalQL.g:6746:3: ruleEString
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
    // InternalQL.g:6755:1: rule__BasicBinaryExpression__OperatorAssignment_3 : ( ruleBinaryOperatorKind ) ;
    public final void rule__BasicBinaryExpression__OperatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6759:1: ( ( ruleBinaryOperatorKind ) )
            // InternalQL.g:6760:2: ( ruleBinaryOperatorKind )
            {
            // InternalQL.g:6760:2: ( ruleBinaryOperatorKind )
            // InternalQL.g:6761:3: ruleBinaryOperatorKind
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
    // InternalQL.g:6770:1: rule__BasicBinaryExpression__ResultTypeAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__BasicBinaryExpression__ResultTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6774:1: ( ( ( ruleEString ) ) )
            // InternalQL.g:6775:2: ( ( ruleEString ) )
            {
            // InternalQL.g:6775:2: ( ( ruleEString ) )
            // InternalQL.g:6776:3: ( ruleEString )
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getResultTypeValueTypeCrossReference_4_1_0()); 
            // InternalQL.g:6777:3: ( ruleEString )
            // InternalQL.g:6778:4: ruleEString
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
    // InternalQL.g:6789:1: rule__BasicBinaryExpression__LhsOperandAssignment_6 : ( ruleExpression ) ;
    public final void rule__BasicBinaryExpression__LhsOperandAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6793:1: ( ( ruleExpression ) )
            // InternalQL.g:6794:2: ( ruleExpression )
            {
            // InternalQL.g:6794:2: ( ruleExpression )
            // InternalQL.g:6795:3: ruleExpression
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
    // InternalQL.g:6804:1: rule__BasicBinaryExpression__RhsOperandAssignment_8 : ( ruleExpression ) ;
    public final void rule__BasicBinaryExpression__RhsOperandAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6808:1: ( ( ruleExpression ) )
            // InternalQL.g:6809:2: ( ruleExpression )
            {
            // InternalQL.g:6809:2: ( ruleExpression )
            // InternalQL.g:6810:3: ruleExpression
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
    // InternalQL.g:6819:1: rule__ConstantCall__ResultTypeAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ConstantCall__ResultTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6823:1: ( ( ( ruleEString ) ) )
            // InternalQL.g:6824:2: ( ( ruleEString ) )
            {
            // InternalQL.g:6824:2: ( ( ruleEString ) )
            // InternalQL.g:6825:3: ( ruleEString )
            {
             before(grammarAccess.getConstantCallAccess().getResultTypeValueTypeCrossReference_3_1_0()); 
            // InternalQL.g:6826:3: ( ruleEString )
            // InternalQL.g:6827:4: ruleEString
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
    // InternalQL.g:6838:1: rule__ConstantCall__ValueAssignment_4_1 : ( ruleValue ) ;
    public final void rule__ConstantCall__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6842:1: ( ( ruleValue ) )
            // InternalQL.g:6843:2: ( ruleValue )
            {
            // InternalQL.g:6843:2: ( ruleValue )
            // InternalQL.g:6844:3: ruleValue
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
    // InternalQL.g:6853:1: rule__BasicUnaryExpression__OperatorAssignment_2_1 : ( ruleUnaryOperatorKind ) ;
    public final void rule__BasicUnaryExpression__OperatorAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6857:1: ( ( ruleUnaryOperatorKind ) )
            // InternalQL.g:6858:2: ( ruleUnaryOperatorKind )
            {
            // InternalQL.g:6858:2: ( ruleUnaryOperatorKind )
            // InternalQL.g:6859:3: ruleUnaryOperatorKind
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
    // InternalQL.g:6868:1: rule__BasicUnaryExpression__ResultTypeAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__BasicUnaryExpression__ResultTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6872:1: ( ( ( ruleEString ) ) )
            // InternalQL.g:6873:2: ( ( ruleEString ) )
            {
            // InternalQL.g:6873:2: ( ( ruleEString ) )
            // InternalQL.g:6874:3: ( ruleEString )
            {
             before(grammarAccess.getBasicUnaryExpressionAccess().getResultTypeValueTypeCrossReference_3_1_0()); 
            // InternalQL.g:6875:3: ( ruleEString )
            // InternalQL.g:6876:4: ruleEString
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
    // InternalQL.g:6887:1: rule__BasicUnaryExpression__OperandAssignment_5 : ( ruleExpression ) ;
    public final void rule__BasicUnaryExpression__OperandAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6891:1: ( ( ruleExpression ) )
            // InternalQL.g:6892:2: ( ruleExpression )
            {
            // InternalQL.g:6892:2: ( ruleExpression )
            // InternalQL.g:6893:3: ruleExpression
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
    // InternalQL.g:6902:1: rule__QuestionCall__ResultTypeAssignment_2_1 : ( ( ruleEString ) ) ;
    public final void rule__QuestionCall__ResultTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6906:1: ( ( ( ruleEString ) ) )
            // InternalQL.g:6907:2: ( ( ruleEString ) )
            {
            // InternalQL.g:6907:2: ( ( ruleEString ) )
            // InternalQL.g:6908:3: ( ruleEString )
            {
             before(grammarAccess.getQuestionCallAccess().getResultTypeValueTypeCrossReference_2_1_0()); 
            // InternalQL.g:6909:3: ( ruleEString )
            // InternalQL.g:6910:4: ruleEString
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
    // InternalQL.g:6921:1: rule__QuestionCall__QuestionAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__QuestionCall__QuestionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6925:1: ( ( ( ruleEString ) ) )
            // InternalQL.g:6926:2: ( ( ruleEString ) )
            {
            // InternalQL.g:6926:2: ( ( ruleEString ) )
            // InternalQL.g:6927:3: ( ruleEString )
            {
             before(grammarAccess.getQuestionCallAccess().getQuestionQuestionDefinitionCrossReference_4_0()); 
            // InternalQL.g:6928:3: ( ruleEString )
            // InternalQL.g:6929:4: ruleEString
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
    // InternalQL.g:6940:1: rule__BooleanValueType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__BooleanValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6944:1: ( ( ruleEString ) )
            // InternalQL.g:6945:2: ( ruleEString )
            {
            // InternalQL.g:6945:2: ( ruleEString )
            // InternalQL.g:6946:3: ruleEString
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


    // $ANTLR start "rule__BooleanValueType__UnitAssignment_3_1_1"
    // InternalQL.g:6955:1: rule__BooleanValueType__UnitAssignment_3_1_1 : ( ruleEString ) ;
    public final void rule__BooleanValueType__UnitAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6959:1: ( ( ruleEString ) )
            // InternalQL.g:6960:2: ( ruleEString )
            {
            // InternalQL.g:6960:2: ( ruleEString )
            // InternalQL.g:6961:3: ruleEString
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
    // InternalQL.g:6970:1: rule__IntegerValueType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__IntegerValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6974:1: ( ( ruleEString ) )
            // InternalQL.g:6975:2: ( ruleEString )
            {
            // InternalQL.g:6975:2: ( ruleEString )
            // InternalQL.g:6976:3: ruleEString
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


    // $ANTLR start "rule__IntegerValueType__UnitAssignment_3_1_1"
    // InternalQL.g:6985:1: rule__IntegerValueType__UnitAssignment_3_1_1 : ( ruleEString ) ;
    public final void rule__IntegerValueType__UnitAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6989:1: ( ( ruleEString ) )
            // InternalQL.g:6990:2: ( ruleEString )
            {
            // InternalQL.g:6990:2: ( ruleEString )
            // InternalQL.g:6991:3: ruleEString
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
    // InternalQL.g:7000:1: rule__IntegerValueType__MinAssignment_3_2_1 : ( ruleEInt ) ;
    public final void rule__IntegerValueType__MinAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7004:1: ( ( ruleEInt ) )
            // InternalQL.g:7005:2: ( ruleEInt )
            {
            // InternalQL.g:7005:2: ( ruleEInt )
            // InternalQL.g:7006:3: ruleEInt
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
    // InternalQL.g:7015:1: rule__IntegerValueType__MaxAssignment_3_3_1 : ( ruleEInt ) ;
    public final void rule__IntegerValueType__MaxAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7019:1: ( ( ruleEInt ) )
            // InternalQL.g:7020:2: ( ruleEInt )
            {
            // InternalQL.g:7020:2: ( ruleEInt )
            // InternalQL.g:7021:3: ruleEInt
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
    // InternalQL.g:7030:1: rule__DecimalValueType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__DecimalValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7034:1: ( ( ruleEString ) )
            // InternalQL.g:7035:2: ( ruleEString )
            {
            // InternalQL.g:7035:2: ( ruleEString )
            // InternalQL.g:7036:3: ruleEString
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


    // $ANTLR start "rule__DecimalValueType__UnitAssignment_3_1_1"
    // InternalQL.g:7045:1: rule__DecimalValueType__UnitAssignment_3_1_1 : ( ruleEString ) ;
    public final void rule__DecimalValueType__UnitAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7049:1: ( ( ruleEString ) )
            // InternalQL.g:7050:2: ( ruleEString )
            {
            // InternalQL.g:7050:2: ( ruleEString )
            // InternalQL.g:7051:3: ruleEString
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
    // InternalQL.g:7060:1: rule__DateValueType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__DateValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7064:1: ( ( ruleEString ) )
            // InternalQL.g:7065:2: ( ruleEString )
            {
            // InternalQL.g:7065:2: ( ruleEString )
            // InternalQL.g:7066:3: ruleEString
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


    // $ANTLR start "rule__DateValueType__UnitAssignment_3_1_1"
    // InternalQL.g:7075:1: rule__DateValueType__UnitAssignment_3_1_1 : ( ruleEString ) ;
    public final void rule__DateValueType__UnitAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7079:1: ( ( ruleEString ) )
            // InternalQL.g:7080:2: ( ruleEString )
            {
            // InternalQL.g:7080:2: ( ruleEString )
            // InternalQL.g:7081:3: ruleEString
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
    // InternalQL.g:7090:1: rule__EnumerationValueType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__EnumerationValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7094:1: ( ( ruleEString ) )
            // InternalQL.g:7095:2: ( ruleEString )
            {
            // InternalQL.g:7095:2: ( ruleEString )
            // InternalQL.g:7096:3: ruleEString
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


    // $ANTLR start "rule__EnumerationValueType__UnitAssignment_3_1_1"
    // InternalQL.g:7105:1: rule__EnumerationValueType__UnitAssignment_3_1_1 : ( ruleEString ) ;
    public final void rule__EnumerationValueType__UnitAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7109:1: ( ( ruleEString ) )
            // InternalQL.g:7110:2: ( ruleEString )
            {
            // InternalQL.g:7110:2: ( ruleEString )
            // InternalQL.g:7111:3: ruleEString
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
    // InternalQL.g:7120:1: rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2 : ( ruleEnumerationLiteral ) ;
    public final void rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7124:1: ( ( ruleEnumerationLiteral ) )
            // InternalQL.g:7125:2: ( ruleEnumerationLiteral )
            {
            // InternalQL.g:7125:2: ( ruleEnumerationLiteral )
            // InternalQL.g:7126:3: ruleEnumerationLiteral
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
    // InternalQL.g:7135:1: rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1 : ( ruleEnumerationLiteral ) ;
    public final void rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7139:1: ( ( ruleEnumerationLiteral ) )
            // InternalQL.g:7140:2: ( ruleEnumerationLiteral )
            {
            // InternalQL.g:7140:2: ( ruleEnumerationLiteral )
            // InternalQL.g:7141:3: ruleEnumerationLiteral
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
    // InternalQL.g:7150:1: rule__StringValueType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__StringValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7154:1: ( ( ruleEString ) )
            // InternalQL.g:7155:2: ( ruleEString )
            {
            // InternalQL.g:7155:2: ( ruleEString )
            // InternalQL.g:7156:3: ruleEString
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


    // $ANTLR start "rule__StringValueType__UnitAssignment_3_1_1"
    // InternalQL.g:7165:1: rule__StringValueType__UnitAssignment_3_1_1 : ( ruleEString ) ;
    public final void rule__StringValueType__UnitAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7169:1: ( ( ruleEString ) )
            // InternalQL.g:7170:2: ( ruleEString )
            {
            // InternalQL.g:7170:2: ( ruleEString )
            // InternalQL.g:7171:3: ruleEString
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
    // InternalQL.g:7180:1: rule__EnumerationLiteral__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__EnumerationLiteral__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7184:1: ( ( ruleEString ) )
            // InternalQL.g:7185:2: ( ruleEString )
            {
            // InternalQL.g:7185:2: ( ruleEString )
            // InternalQL.g:7186:3: ruleEString
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnumerationLiteralAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__IntegerValue__IntValueAssignment_3_1"
    // InternalQL.g:7195:1: rule__IntegerValue__IntValueAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__IntegerValue__IntValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7199:1: ( ( ruleEInt ) )
            // InternalQL.g:7200:2: ( ruleEInt )
            {
            // InternalQL.g:7200:2: ( ruleEInt )
            // InternalQL.g:7201:3: ruleEInt
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
    // InternalQL.g:7210:1: rule__StringValue__StringValueAssignment_3_1 : ( ruleEString ) ;
    public final void rule__StringValue__StringValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7214:1: ( ( ruleEString ) )
            // InternalQL.g:7215:2: ( ruleEString )
            {
            // InternalQL.g:7215:2: ( ruleEString )
            // InternalQL.g:7216:3: ruleEString
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
    // InternalQL.g:7225:1: rule__BooleanValue__BooleanValueAssignment_1 : ( ( 'booleanValue' ) ) ;
    public final void rule__BooleanValue__BooleanValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7229:1: ( ( ( 'booleanValue' ) ) )
            // InternalQL.g:7230:2: ( ( 'booleanValue' ) )
            {
            // InternalQL.g:7230:2: ( ( 'booleanValue' ) )
            // InternalQL.g:7231:3: ( 'booleanValue' )
            {
             before(grammarAccess.getBooleanValueAccess().getBooleanValueBooleanValueKeyword_1_0()); 
            // InternalQL.g:7232:3: ( 'booleanValue' )
            // InternalQL.g:7233:4: 'booleanValue'
            {
             before(grammarAccess.getBooleanValueAccess().getBooleanValueBooleanValueKeyword_1_0()); 
            match(input,75,FOLLOW_2); 
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
    // InternalQL.g:7244:1: rule__DateValue__DateValueAssignment_3_1 : ( ruleEDate ) ;
    public final void rule__DateValue__DateValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7248:1: ( ( ruleEDate ) )
            // InternalQL.g:7249:2: ( ruleEDate )
            {
            // InternalQL.g:7249:2: ( ruleEDate )
            // InternalQL.g:7250:3: ruleEDate
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
    // InternalQL.g:7259:1: rule__DecimalValue__DecimalValueAssignment_3_1 : ( ruleEFloat ) ;
    public final void rule__DecimalValue__DecimalValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7263:1: ( ( ruleEFloat ) )
            // InternalQL.g:7264:2: ( ruleEFloat )
            {
            // InternalQL.g:7264:2: ( ruleEFloat )
            // InternalQL.g:7265:3: ruleEFloat
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


    // $ANTLR start "rule__QuestionDefinition__IsMandatoryAssignment_0"
    // InternalQL.g:7274:1: rule__QuestionDefinition__IsMandatoryAssignment_0 : ( ( 'mandatory' ) ) ;
    public final void rule__QuestionDefinition__IsMandatoryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7278:1: ( ( ( 'mandatory' ) ) )
            // InternalQL.g:7279:2: ( ( 'mandatory' ) )
            {
            // InternalQL.g:7279:2: ( ( 'mandatory' ) )
            // InternalQL.g:7280:3: ( 'mandatory' )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getIsMandatoryMandatoryKeyword_0_0()); 
            // InternalQL.g:7281:3: ( 'mandatory' )
            // InternalQL.g:7282:4: 'mandatory'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getIsMandatoryMandatoryKeyword_0_0()); 
            match(input,76,FOLLOW_2); 
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
    // InternalQL.g:7293:1: rule__QuestionDefinition__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__QuestionDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7297:1: ( ( ruleEString ) )
            // InternalQL.g:7298:2: ( ruleEString )
            {
            // InternalQL.g:7298:2: ( ruleEString )
            // InternalQL.g:7299:3: ruleEString
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


    // $ANTLR start "rule__QuestionDefinition__LabelAssignment_4"
    // InternalQL.g:7308:1: rule__QuestionDefinition__LabelAssignment_4 : ( ruleEString ) ;
    public final void rule__QuestionDefinition__LabelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7312:1: ( ( ruleEString ) )
            // InternalQL.g:7313:2: ( ruleEString )
            {
            // InternalQL.g:7313:2: ( ruleEString )
            // InternalQL.g:7314:3: ruleEString
            {
             before(grammarAccess.getQuestionDefinitionAccess().getLabelEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionDefinitionAccess().getLabelEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__LabelAssignment_4"


    // $ANTLR start "rule__QuestionDefinition__DataTypeAssignment_5"
    // InternalQL.g:7323:1: rule__QuestionDefinition__DataTypeAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__QuestionDefinition__DataTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7327:1: ( ( ( ruleEString ) ) )
            // InternalQL.g:7328:2: ( ( ruleEString ) )
            {
            // InternalQL.g:7328:2: ( ( ruleEString ) )
            // InternalQL.g:7329:3: ( ruleEString )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getDataTypeValueTypeCrossReference_5_0()); 
            // InternalQL.g:7330:3: ( ruleEString )
            // InternalQL.g:7331:4: ruleEString
            {
             before(grammarAccess.getQuestionDefinitionAccess().getDataTypeValueTypeEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionDefinitionAccess().getDataTypeValueTypeEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getQuestionDefinitionAccess().getDataTypeValueTypeCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__DataTypeAssignment_5"


    // $ANTLR start "rule__QuestionDefinition__ComputedExpressionAssignment_6_1"
    // InternalQL.g:7342:1: rule__QuestionDefinition__ComputedExpressionAssignment_6_1 : ( ruleExpression ) ;
    public final void rule__QuestionDefinition__ComputedExpressionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7346:1: ( ( ruleExpression ) )
            // InternalQL.g:7347:2: ( ruleExpression )
            {
            // InternalQL.g:7347:2: ( ruleExpression )
            // InternalQL.g:7348:3: ruleExpression
            {
             before(grammarAccess.getQuestionDefinitionAccess().getComputedExpressionExpressionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getQuestionDefinitionAccess().getComputedExpressionExpressionParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__ComputedExpressionAssignment_6_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000C40000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000300000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000001020000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x09CE002040000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x09CE002000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001060000030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001020000032L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0001508000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000004040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000003FFC000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000280040000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0xA000000000000000L,0x0000000000000816L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000890000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0002080000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0030004040000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x1000000000000040L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0200004040000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0400000040000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x09CE002000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x4000000040000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000802L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x1000000000000040L,0x0000000000000040L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0002000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});

}