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
public class S_OPMUL_MJAVA {
LEX_MJAVA scanner;
  S_OPMUL_MJAVA() {
    }
  S_OPMUL_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  String att_code;
  Type att_type;
  AbstractMachine att_machine;
  LEX_MJAVA att_scanner;
  private void regle56() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_mod);
      action_type_56();
      action_code_56();
  }
  private void regle57() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_et);
      action_type_57();
      action_code_57();
  }
  private void regle54() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_mult);
      action_type_54();
      action_code_54();
  }
  private void regle55() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_div);
      action_type_55();
      action_code_55();
  }
private void action_type_56() throws Exception {
try {
// locales
// instructions
this.att_type= new Type("int", 1);
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_type_57() throws Exception {
try {
// locales
// instructions
this.att_type= new Type("bool", 1);
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_type_54() throws Exception {
try {
// locales
// instructions
this.att_type= new Type("int", 1);
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_type_55() throws Exception {
try {
// locales
// instructions
this.att_type= new Type("int", 1);
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_code_54() throws Exception {
try {
// locales
// instructions
this.att_code=this.att_machine.genMult();
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_code_55() throws Exception {
try {
// locales
// instructions
this.att_code=this.att_machine.genDiv();
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_code_56() throws Exception {
try {
// locales
// instructions
this.att_code=this.att_machine.genMod();
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_code_57() throws Exception {
try {
// locales
// instructions
this.att_code=this.att_machine.genEt();
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_mult : // 1376
        regle54 () ;
      break ;
      case LEX_MJAVA.token_div : // 1377
        regle55 () ;
      break ;
      case LEX_MJAVA.token_mod : // 1378
        regle56 () ;
      break ;
      case LEX_MJAVA.token_et : // 1379
        regle57 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
