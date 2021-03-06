/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 20 13:44:05 GMT 2018
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Writer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.FastaStreamSequence;
import uk.ac.sanger.artemis.io.StreamSequence;
import uk.ac.sanger.artemis.util.LinePushBackReader;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class FastaStreamSequence_ESTest extends FastaStreamSequence_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinePushBackReader linePushBackReader0 = mock(LinePushBackReader.class, new ViolatedAssumptionAnswer());
      doReturn("", "uk.ac.sanger.artemis.io.FastaStreamSequence", "lO#Rl/%ano", (String) null).when(linePushBackReader0).readLine();
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence(linePushBackReader0);
      StreamSequence streamSequence0 = fastaStreamSequence0.copy();
      assertEquals(53, streamSequence0.length());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("YL'>=]_of,");
      fastaStreamSequence0.setSequencePackingCapacity(0);
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        fastaStreamSequence0.writeToStream(writer0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("uk.ac.sanger.artemis.io.StreamSequence", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinePushBackReader linePushBackReader0 = mock(LinePushBackReader.class, new ViolatedAssumptionAnswer());
      doReturn("", (String) null).when(linePushBackReader0).readLine();
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence(linePushBackReader0);
      assertEquals(0, fastaStreamSequence0.getOtherCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FastaStreamSequence fastaStreamSequence0 = null;
      try {
        fastaStreamSequence0 = new FastaStreamSequence((LinePushBackReader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.RawStreamSequence", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FastaStreamSequence fastaStreamSequence0 = null;
      try {
        fastaStreamSequence0 = new FastaStreamSequence((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.RawStreamSequence", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FastaStreamSequence fastaStreamSequence0 = null;
      try {
        fastaStreamSequence0 = new FastaStreamSequence((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.RawStreamSequence", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence(" fields) from: ", " fields) from: ");
      assertEquals(0, fastaStreamSequence0.getGCount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinePushBackReader linePushBackReader0 = mock(LinePushBackReader.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(linePushBackReader0).readLine();
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence(linePushBackReader0);
      FastaStreamSequence fastaStreamSequence1 = new FastaStreamSequence(fastaStreamSequence0);
      assertEquals(0, fastaStreamSequence1.getOtherCount());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("f");
      // Undeclared exception!
      try { 
        fastaStreamSequence0.writeToStream((Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.FastaStreamSequence", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinePushBackReader linePushBackReader0 = mock(LinePushBackReader.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(linePushBackReader0).readLine();
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence(linePushBackReader0);
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      fastaStreamSequence0.writeToStream(writer0);
      assertEquals(0, fastaStreamSequence0.getGCount());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinePushBackReader linePushBackReader0 = mock(LinePushBackReader.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(linePushBackReader0).readLine();
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence(linePushBackReader0);
      StreamSequence streamSequence0 = fastaStreamSequence0.copy();
      assertFalse(streamSequence0.equals((Object)fastaStreamSequence0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("f");
      int int0 = fastaStreamSequence0.getFormatType();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("Ey9p&W-=Qak:4SBpid");
      FastaStreamSequence fastaStreamSequence1 = null;
      try {
        fastaStreamSequence1 = new FastaStreamSequence(fastaStreamSequence0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.RawStreamSequence", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("2GYZPJowyWLdU");
      // Undeclared exception!
      try { 
        fastaStreamSequence0.copy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.RawStreamSequence", e);
      }
  }
}
