/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 20 14:04:49 GMT 2018
 */

package uk.ac.sanger.artemis.circular;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.plaf.metal.MetalComboBoxUI;
import javax.swing.text.DefaultCaret;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.circular.ScrollPanel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class ScrollPanel_ESTest extends ScrollPanel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LayoutManager layoutManager0 = mock(LayoutManager.class, new ViolatedAssumptionAnswer());
      doReturn((Dimension) null).when(layoutManager0).preferredLayoutSize(any(java.awt.Container.class));
      ScrollPanel scrollPanel0 = new ScrollPanel(layoutManager0);
      Dimension dimension0 = scrollPanel0.getPreferredScrollableViewportSize();
      assertNull(dimension0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ScrollPanel scrollPanel0 = new ScrollPanel();
      Dimension dimension0 = scrollPanel0.getPreferredScrollableViewportSize();
      assertEquals(10.0, dimension0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FlowLayout flowLayout0 = new FlowLayout((-435), (-435), (-435));
      ScrollPanel scrollPanel0 = new ScrollPanel(flowLayout0);
      Dimension dimension0 = scrollPanel0.getPreferredScrollableViewportSize();
      assertEquals((-870.0), dimension0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MetalComboBoxUI metalComboBoxUI0 = new MetalComboBoxUI();
      MetalComboBoxUI.MetalComboBoxLayoutManager metalComboBoxUI_MetalComboBoxLayoutManager0 = metalComboBoxUI0.new MetalComboBoxLayoutManager();
      ScrollPanel scrollPanel0 = new ScrollPanel(metalComboBoxUI_MetalComboBoxLayoutManager0);
      // Undeclared exception!
      try { 
        scrollPanel0.getPreferredScrollableViewportSize();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BasicScrollBarUI basicScrollBarUI0 = new BasicScrollBarUI();
      ScrollPanel scrollPanel0 = new ScrollPanel(basicScrollBarUI0);
      // Undeclared exception!
      try { 
        scrollPanel0.getPreferredScrollableViewportSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.swing.plaf.basic.BasicScrollBarUI", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ScrollPanel scrollPanel0 = new ScrollPanel();
      DefaultCaret defaultCaret0 = new DefaultCaret();
      int int0 = scrollPanel0.getScrollableUnitIncrement(defaultCaret0, 60, 0);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CardLayout cardLayout0 = new CardLayout();
      ScrollPanel scrollPanel0 = new ScrollPanel(cardLayout0);
      boolean boolean0 = scrollPanel0.getScrollableTracksViewportWidth();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CardLayout cardLayout0 = new CardLayout();
      ScrollPanel scrollPanel0 = new ScrollPanel(cardLayout0);
      Dimension dimension0 = scrollPanel0.getPreferredScrollableViewportSize();
      assertEquals(0.0, dimension0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      CardLayout cardLayout0 = new CardLayout();
      ScrollPanel scrollPanel0 = new ScrollPanel(cardLayout0);
      boolean boolean0 = scrollPanel0.getScrollableTracksViewportHeight();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ScrollPanel scrollPanel0 = new ScrollPanel();
      DefaultCaret defaultCaret0 = new DefaultCaret();
      int int0 = scrollPanel0.getScrollableBlockIncrement(defaultCaret0, 0, 0);
      assertEquals(60, int0);
  }
}
