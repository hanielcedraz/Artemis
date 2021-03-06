/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 20 12:37:18 GMT 2018
 */

package uk.ac.sanger.artemis.components.genebuilder.cv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Dimension;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.genebuilder.cv.AbstractCvBox;
import uk.ac.sanger.artemis.components.genebuilder.cv.GoBox;
import uk.ac.sanger.artemis.components.genebuilder.cv.ProductBox;
import uk.ac.sanger.artemis.io.Qualifier;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class AbstractCvBox_ESTest extends AbstractCvBox_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Qualifier qualifier0 = new Qualifier("&#`}kS|8");
      Dimension dimension0 = new Dimension(0, (-1076));
      ProductBox productBox0 = new ProductBox(qualifier0, "&#`}kS|8", 0, dimension0, dimension0);
      String string0 = productBox0.changeField("NE,\"C`", "", "NE,\"C`");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Dimension dimension0 = new Dimension();
      ProductBox productBox0 = new ProductBox((Qualifier) null, " this = ", 2331, dimension0, dimension0);
      String string0 = productBox0.changeField("", "9mKp?L$DB@r", "");
      assertEquals("9mKp?L$DB@r", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Dimension dimension0 = new Dimension((-477), (-1));
      ProductBox productBox0 = new ProductBox((Qualifier) null, "", Integer.MAX_VALUE, dimension0, dimension0);
      String string0 = productBox0.changeField("OLfvC,u[IT};,qdU", "OLfvC,u[IT};,qdU", "OLfvC,u[IT};,qdU");
      assertEquals("OLfvC,u[IT};,qdUOLfvC,u[IT};,qdU;,qdU", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Dimension dimension0 = GoBox.getEvidenceListDimension();
      ProductBox productBox0 = new ProductBox((Qualifier) null, "Inferred from Genomic Context", (-1993), dimension0, dimension0);
      String string0 = productBox0.changeField("", "Inferred from Genomic Context", "jS@8~oCJ;qpz!a;9C");
      assertEquals("Inferred from Genomic Context;qpz!a;9C", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = AbstractCvBox.getFieldIgnoreSeparator("", " -^?)Sd;");
      assertEquals(" -^?)Sd", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = AbstractCvBox.getField("", ";");
      assertEquals(";", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = AbstractCvBox.getField("Eb^XPPpCcYL", "Eb^XPPpCcYL");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        AbstractCvBox.getFieldIgnoreSeparator((String) null, "~n!fmAGmX");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.cv.AbstractCvBox", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        AbstractCvBox.getField("2{fvC,u[IT};,qdU", "2{fvC,u[IT};,qdU");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        AbstractCvBox.getField((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.cv.AbstractCvBox", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Dimension dimension0 = new Dimension(1289, 1838);
      ProductBox productBox0 = new ProductBox((Qualifier) null, "9mKp?L$DB@r", 1838, dimension0, dimension0);
      // Undeclared exception!
      try { 
        productBox0.changeField((String) null, "2{fvC,u[IT};,qdU", "4pSIlp-t# Ih");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.cv.AbstractCvBox", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Qualifier qualifier0 = mock(Qualifier.class, new ViolatedAssumptionAnswer());
      Dimension dimension0 = GoBox.getEvidenceListDimension();
      ProductBox productBox0 = new ProductBox(qualifier0, "4aX=_gi", Integer.MAX_VALUE, dimension0, dimension0);
      Date date0 = productBox0.getDate("4aX=_gi");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Dimension dimension0 = new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE);
      ProductBox productBox0 = new ProductBox((Qualifier) null, "", Integer.MAX_VALUE, dimension0, dimension0);
      Date date0 = productBox0.getDate("");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Qualifier qualifier0 = new Qualifier();
      Dimension dimension0 = new Dimension(0, (-935));
      ProductBox productBox0 = new ProductBox(qualifier0, "[VC %s @ %s Q%s of type=%s alleles=%s attr=%s filters=%s", 0, dimension0, dimension0);
      Date date0 = productBox0.getDate("2{fvC,u[IT};,qdU");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Qualifier qualifier0 = new Qualifier();
      Dimension dimension0 = GoBox.getEvidenceListDimension();
      ProductBox productBox0 = new ProductBox(qualifier0, "uk.ac.sanger.artemis.components.genebuilder.cv.AbstractCvBox", 0, dimension0, dimension0);
      String string0 = productBox0.changeField("", "", "uk.ac.sanger.artemis.components.genebuilder.cv.AbstractCvBox");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Qualifier qualifier0 = new Qualifier();
      Dimension dimension0 = new Dimension(0, (-935));
      ProductBox productBox0 = new ProductBox(qualifier0, "[VC %s @ %s Q%s of type=%s alleles=%s attr=%s filters=%s", 0, dimension0, dimension0);
      String string0 = productBox0.changeField("!jOdDGgV%!O}Ens9!I", "2{fvC,u[IT};,qdU", "2{fvC,u[IT};,qdU");
      assertEquals("2{fvC,u[IT};,qdU;!jOdDGgV%!O}Ens9!I2{fvC,u[IT};,qdU", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Qualifier qualifier0 = new Qualifier();
      Dimension dimension0 = GoBox.getEvidenceListDimension();
      ProductBox productBox0 = new ProductBox(qualifier0, " -^?qSd;", (-1879048189), dimension0, dimension0);
      String string0 = productBox0.changeField("", "", " -^?qSd;");
      assertEquals(";", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Dimension dimension0 = new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE);
      ProductBox productBox0 = new ProductBox((Qualifier) null, "", Integer.MAX_VALUE, dimension0, dimension0);
      String string0 = productBox0.changeField("`[/", "", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = AbstractCvBox.getFieldIgnoreSeparator("uk.ac.sanger.artemis.components.genebuild[r.cv.AbstractCNBox", "uk.ac.sanger.artemis.components.genebuild[r.cv.AbstractCNBox");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        AbstractCvBox.getFieldIgnoreSeparator("2{fvC,u[IT};,qdU", "2{fvC,u[IT};,qdU;!jOdDGgV%!O}Ens9!I2{fvC,u[IT};,qdU");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Qualifier qualifier0 = new Qualifier("*_#");
      Dimension dimension0 = GoBox.getEvidenceListDimension();
      ProductBox productBox0 = new ProductBox(qualifier0, ";-,ztJt|l[\"", 3, dimension0, dimension0);
      Date date0 = productBox0.getDate((String) null);
      assertNull(date0);
  }
}
