package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mjc.tds.*;
import mjc.type.*;
import java.util.Iterator;
import java.io.File;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.messages.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_DEFS_MJAVA {
LEX_MJAVA scanner;
  S_DEFS_MJAVA() {
    }
  S_DEFS_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  int att_deplAttribut;
  InfoClasse att_classe_courante;
  TDS<InfoClasse> att_tdc;
  String att_code;
  AbstractMachine att_machine;
  int att_deplMethodePublique;
  LEX_MJAVA att_scanner;
  private void regle8() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    S_DEF_MJAVA x_4 = new S_DEF_MJAVA(scanner) ;
    S_DEFS_MJAVA x_6 = new S_DEFS_MJAVA(scanner) ;
    //appel
      action_auto_inh_8(x_4, x_6);
    x_2.analyser(LEX_MJAVA.token_public);
      action_protection_8(x_4, x_6);
    x_4.analyser() ;
      action_depl_8(x_4, x_6);
    x_6.analyser() ;
      action_code_8(x_4, x_6);
  }
  private void regle9() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    S_DEF_MJAVA x_4 = new S_DEF_MJAVA(scanner) ;
    S_DEFS_MJAVA x_6 = new S_DEFS_MJAVA(scanner) ;
    //appel
      action_auto_inh_9(x_4, x_6);
    x_2.analyser(LEX_MJAVA.token_private);
      action_protection_9(x_4, x_6);
    x_4.analyser() ;
      action_depl_9(x_4, x_6);
    x_6.analyser() ;
      action_code_9(x_4, x_6);
  }
  private void regle7() throws Exception {

    //declaration
    //appel
      action_code_7();
  }
private void action_depl_9(S_DEF_MJAVA x_4, S_DEFS_MJAVA x_6) throws Exception {
try {
// locales
// instructions
x_6.att_deplAttribut=this.att_deplAttribut+x_4.att_tailleAttribut;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_protection_9(S_DEF_MJAVA x_4, S_DEFS_MJAVA x_6) throws Exception {
try {
// locales
// instructions
x_4.att_protectionPublic=false;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_depl_8(S_DEF_MJAVA x_4, S_DEFS_MJAVA x_6) throws Exception {
try {
// locales
// instructions
x_6.att_deplAttribut=this.att_deplAttribut+x_4.att_tailleAttribut;
if (x_4.att_tailleAttribut==0&&!(x_4.att_estConstructeur)&&!(x_4.att_redefinition)){
x_6.att_deplMethodePublique=this.att_deplMethodePublique+1;
}

}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_protection_8(S_DEF_MJAVA x_4, S_DEFS_MJAVA x_6) throws Exception {
try {
// locales
// instructions
x_4.att_protectionPublic=true;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_auto_inh_8(S_DEF_MJAVA x_4, S_DEFS_MJAVA x_6) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
x_6.att_machine=this.att_machine;
x_4.att_classe_courante=this.att_classe_courante;
x_6.att_classe_courante=this.att_classe_courante;
x_4.att_tdc=this.att_tdc;
x_6.att_tdc=this.att_tdc;
x_4.att_deplAttribut=this.att_deplAttribut;
x_4.att_deplMethodePublique=this.att_deplMethodePublique;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_auto_inh_9(S_DEF_MJAVA x_4, S_DEFS_MJAVA x_6) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
x_6.att_machine=this.att_machine;
x_4.att_classe_courante=this.att_classe_courante;
x_6.att_classe_courante=this.att_classe_courante;
x_4.att_tdc=this.att_tdc;
x_6.att_tdc=this.att_tdc;
x_4.att_deplAttribut=this.att_deplAttribut;
x_4.att_deplMethodePublique=this.att_deplMethodePublique;
x_6.att_deplMethodePublique=this.att_deplMethodePublique;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_code_7() throws Exception {
try {
// instructions
this.att_code="";
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_code_9(S_DEF_MJAVA x_4, S_DEFS_MJAVA x_6) throws Exception {
try {
// instructions
this.att_code=x_4.att_code+x_6.att_code;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_code_8(S_DEF_MJAVA x_4, S_DEFS_MJAVA x_6) throws Exception {
try {
// instructions
this.att_code=x_4.att_code+x_6.att_code;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_acf : // 1347
        regle7 () ;
      break ;
      case LEX_MJAVA.token_public : // 1364
        regle8 () ;
      break ;
      case LEX_MJAVA.token_private : // 1365
        regle9 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
