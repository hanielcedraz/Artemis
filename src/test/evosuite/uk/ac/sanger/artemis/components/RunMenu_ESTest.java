/*
 * This file was automatically generated by EvoSuite
 * Wed Sep 19 21:33:15 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import javax.swing.JFrame;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.Selection;
import uk.ac.sanger.artemis.components.RunMenu;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class RunMenu_ESTest extends RunMenu_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RunMenu runMenu0 = new RunMenu((JFrame) null, (Selection) null, (String) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RunMenu runMenu0 = new RunMenu((JFrame) null, (Selection) null);
  }
}
