/*
 * This file was automatically generated by EvoSuite
 * Wed Sep 19 20:49:18 GMT 2018
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.FuzzyRange;
import uk.ac.sanger.artemis.io.Location;
import uk.ac.sanger.artemis.io.LocationParseNode;
import uk.ac.sanger.artemis.io.LowerInteger;
import uk.ac.sanger.artemis.io.Range;
import uk.ac.sanger.artemis.io.RangeVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Location_ESTest extends Location_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Range range0 = new Range(1059, 1059);
      Location location0 = new Location(range0);
      Location location1 = location0.reverseComplement(1059, 250);
      boolean boolean0 = location1.isComplement(range0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LowerInteger lowerInteger0 = new LowerInteger(155);
      Range range0 = FuzzyRange.makeRange((Object) lowerInteger0);
      Location location0 = new Location(range0);
      Range range1 = new Range((-1201), 16);
      Location location1 = location0.changeRange(range0, range1);
      assertNotSame(location1, location0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RangeVector rangeVector0 = new RangeVector();
      Range range0 = new Range(94);
      rangeVector0.add(range0);
      Location location0 = new Location(rangeVector0, true);
      String string0 = location0.toStringShort();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Range range0 = FuzzyRange.makeRange((Object) integer0);
      RangeVector rangeVector0 = new RangeVector(range0);
      Location location0 = new Location(rangeVector0, true);
      Location location1 = location0.addRange(range0);
      assertNotSame(location1, location0);
      
      Location location2 = location1.removeRange(range0);
      assertNotSame(location2, location1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Range range0 = new Range(44);
      Location location0 = new Location(range0);
      Location location1 = location0.addRange(range0);
      Location location2 = location1.getComplement();
      Range range1 = location2.getTotalRange();
      assertEquals(1, range1.getCount());
      assertEquals((-1), range1.getStart());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Range range0 = FuzzyRange.makeRange((Object) integer0);
      RangeVector rangeVector0 = new RangeVector(range0);
      Location location0 = new Location(rangeVector0, true);
      int int0 = location0.getLastBase();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Range range0 = FuzzyRange.makeRange((Object) integer0);
      RangeVector rangeVector0 = new RangeVector(range0);
      Location location0 = new Location(rangeVector0, true);
      int int0 = location0.getFirstBase();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Range range0 = new Range(3290);
      Range range1 = range0.change((-315), 1610);
      Location location0 = new Location(range0);
      Location location1 = location0.addRange(range1);
      int int0 = location1.getFirstBase();
      assertEquals((-315), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Range range0 = new Range((-366));
      RangeVector rangeVector0 = new RangeVector(range0);
      Location location0 = new Location(rangeVector0, false);
      Location location1 = location0.truncate(range0);
      assertNotNull(location1);
      
      boolean boolean0 = location0.equals(location1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RangeVector rangeVector0 = new RangeVector((Range) null);
      Location location0 = new Location(rangeVector0, false);
      // Undeclared exception!
      try { 
        location0.truncate((Range) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.Location", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Range range0 = new Range(84);
      Location location0 = new Location(range0);
      location0.setParsedLocation((LocationParseNode) null);
      // Undeclared exception!
      try { 
        location0.toStringShort();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.Location", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Range range0 = new Range(1500, 1500);
      Location location0 = new Location(range0);
      LocationParseNode locationParseNode0 = new LocationParseNode("", (LocationParseNode) null);
      location0.setParsedLocation(locationParseNode0);
      // Undeclared exception!
      try { 
        location0.toStringShort();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // LocationParseNode.toStringChild() was called on the wrong type of Object
         //
         verifyException("uk.ac.sanger.artemis.io.LocationParseNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RangeVector rangeVector0 = new RangeVector((Range) null);
      Location location0 = new Location(rangeVector0, false);
      // Undeclared exception!
      try { 
        location0.reverseComplement((-351), (-4637));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.LocationParseNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RangeVector rangeVector0 = new RangeVector((Range) null);
      Location location0 = new Location(rangeVector0, false);
      // Undeclared exception!
      try { 
        location0.reverseComplement(39);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.LocationParseNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Range range0 = new Range(1500, 1500);
      Location location0 = new Location(range0);
      LocationParseNode locationParseNode0 = new LocationParseNode("", (LocationParseNode) null);
      location0.setParsedLocation(locationParseNode0);
      // Undeclared exception!
      try { 
        location0.removeRange(range0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.LocationParseNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Range range0 = new Range(84);
      Location location0 = new Location(range0);
      location0.setParsedLocation((LocationParseNode) null);
      // Undeclared exception!
      try { 
        location0.isComplement(range0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.Location", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Range range0 = new Range(84);
      Location location0 = new Location(range0);
      location0.setParsedLocation((LocationParseNode) null);
      // Undeclared exception!
      try { 
        location0.isComplement();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.Location", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RangeVector rangeVector0 = new RangeVector();
      rangeVector0.addElement((Range) null);
      Location location0 = new Location(rangeVector0, false);
      // Undeclared exception!
      try { 
        location0.getFirstBase();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.Location", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RangeVector rangeVector0 = new RangeVector((Range) null);
      Location location0 = new Location(rangeVector0, true);
      // Undeclared exception!
      try { 
        location0.getComplement();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.LocationParseNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Range range0 = new Range(6, 6);
      Location location0 = new Location(range0);
      // Undeclared exception!
      try { 
        location0.equals((Location) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.Location", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Range range0 = new Range(1059, 1059);
      Location location0 = new Location(range0);
      location0.setParsedLocation((LocationParseNode) null);
      // Undeclared exception!
      try { 
        location0.copy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.Location", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Range range0 = new Range(1500, 1500);
      Location location0 = new Location(range0);
      LocationParseNode locationParseNode0 = new LocationParseNode("", (LocationParseNode) null);
      location0.setParsedLocation(locationParseNode0);
      // Undeclared exception!
      try { 
        location0.changeRange(range0, range0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.LocationParseNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Range range0 = new Range(94);
      Location location0 = new Location(range0);
      // Undeclared exception!
      try { 
        location0.addRange((Range) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.LocationParseNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Location location0 = null;
      try {
        location0 = new Location((RangeVector) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.Location", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Location location0 = null;
      try {
        location0 = new Location((Range) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.Location", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Location location0 = null;
      try {
        location0 = new Location((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.LocationLexer$TokenEnumeration", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Location location0 = null;
      try {
        location0 = new Location("complement");
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Parse error at this point: : expected(
         //
         verifyException("uk.ac.sanger.artemis.io.Location", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Range range0 = new Range(1436);
      RangeVector rangeVector0 = new RangeVector(range0);
      rangeVector0.add(range0);
      Location location0 = new Location(rangeVector0, true);
      Location location1 = location0.getComplement();
      RangeVector rangeVector1 = location1.getRanges();
      assertTrue(rangeVector1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Range range0 = new Range(67);
      Location location0 = new Location(range0);
      Location location1 = location0.reverseComplement(99, 99);
      RangeVector rangeVector0 = location1.getRanges();
      assertEquals("[229]", rangeVector0.toString());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Range range0 = new Range(94);
      Location location0 = new Location(range0);
      Location location1 = location0.addRange(range0);
      Range range1 = location1.getTotalRange();
      assertNotSame(location1, location0);
      assertEquals(94, range1.getEnd());
      assertEquals(94, range1.getStart());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Range range0 = new Range(44);
      Location location0 = new Location(range0);
      Location location1 = location0.truncate(range0);
      Location location2 = location1.getComplement();
      Location location3 = location2.addRange(range0);
      Range range1 = location3.getTotalRange();
      assertEquals(44, range1.getCount());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Range range0 = new Range(1059, 1059);
      Location location0 = new Location(range0);
      location0.getTotalRange();
      Range range1 = location0.getTotalRange();
      assertEquals(1, range1.getCount());
      assertEquals(1059, range1.getStart());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Range range0 = FuzzyRange.makeRange((Object) integer0);
      RangeVector rangeVector0 = new RangeVector(range0);
      Location location0 = new Location(rangeVector0, true);
      Range range1 = location0.getTotalRange();
      assertEquals(0, range1.getStart());
      assertEquals(1, range1.getCount());
      
      RangeVector rangeVector1 = location0.getRanges();
      assertTrue(rangeVector1.equals((Object)rangeVector0));
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Range range0 = new Range(6, 6);
      Location location0 = new Location(range0);
      Location location1 = location0.addRange(range0);
      boolean boolean0 = location1.isComplement();
      assertNotSame(location1, location0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Range range0 = new Range(1436);
      RangeVector rangeVector0 = new RangeVector(range0);
      rangeVector0.add(range0);
      Location location0 = new Location(rangeVector0, true);
      boolean boolean0 = location0.isComplement();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Range range0 = new Range(67);
      Location location0 = new Location(range0);
      boolean boolean0 = location0.isComplement();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Range range0 = new Range(44);
      Location location0 = new Location(range0);
      LocationParseNode locationParseNode0 = location0.getParsedLocation();
      assertEquals(4, locationParseNode0.getType());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Range range0 = new Range(44);
      Location location0 = new Location(range0);
      Location location1 = location0.addRange(range0);
      Location location2 = location1.getComplement();
      Location location3 = location2.addRange(range0);
      boolean boolean0 = location3.isComplement(range0);
      assertNotSame(location3, location2);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Range range0 = new Range(84);
      Location location0 = new Location(range0);
      Location location1 = location0.addRange(range0);
      boolean boolean0 = location1.isComplement(range0);
      assertFalse(boolean0);
      assertNotSame(location1, location0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Range range0 = new Range(1059, 1059);
      Location location0 = new Location(range0);
      boolean boolean0 = location0.isComplement(range0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Location location0 = null;
      try {
        location0 = new Location("order");
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Parse error at this point: : expected(
         //
         verifyException("uk.ac.sanger.artemis.io.Location", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Location location0 = null;
      try {
        location0 = new Location("complement(join(");
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Parse error at this point: : expected a range or a functional
         //
         verifyException("uk.ac.sanger.artemis.io.Location", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Location location0 = null;
      try {
        location0 = new Location("0GF58yx;x");
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Parse error at this point: java.lang.Integer@0000000004java.lang.String@0000000005java.lang.String@0000000006java.lang.String@0000000007: range bounds must be greater than 0
         //
         verifyException("uk.ac.sanger.artemis.io.Location", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Location location0 = null;
      try {
        location0 = new Location("Frder");
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Parse error at this point: : parse error after reading \"Frder\"
         //
         verifyException("uk.ac.sanger.artemis.io.Location", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Location location0 = null;
      try {
        location0 = new Location("S:7&]e|Vw(BAs]+v");
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Parse error at this point: java.lang.String@0000000007java.lang.String@0000000008java.lang.String@0000000009java.lang.String@0000000010java.lang.String@0000000011java.lang.Character@0000000012java.lang.String@0000000013java.lang.String@0000000014java.lang.String@0000000015java.lang.String@0000000016: garbage at the end of the location string
         //
         verifyException("uk.ac.sanger.artemis.io.Location", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Range range0 = new Range(1500, 1500);
      Location location0 = new Location(range0);
      Location location1 = location0.reverseComplement(1500, 65);
      LocationParseNode locationParseNode0 = new LocationParseNode("", (LocationParseNode) null);
      location1.setParsedLocation(locationParseNode0);
      Location location2 = location1.truncate(range0);
      assertNull(location2);
      assertNotSame(location0, location1);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Range range0 = new Range((-522));
      RangeVector rangeVector0 = new RangeVector(range0);
      rangeVector0.add(range0);
      Location location0 = new Location(rangeVector0, false);
      Location location1 = location0.getComplement();
      int int0 = location1.getLastBase();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Range range0 = new Range(67);
      Location location0 = new Location(range0);
      Location location1 = location0.reverseComplement(99, 99);
      Location location2 = location1.addRange(range0);
      int int0 = location2.getFirstBase();
      assertEquals(67, int0);
      assertNotSame(location1, location0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Range range0 = new Range(1059, 1059);
      Location location0 = new Location(range0);
      location0.getLastBase();
      int int0 = location0.getLastBase();
      assertEquals(1059, int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Range range0 = new Range(84);
      Location location0 = new Location(range0);
      Location location1 = location0.addRange(range0);
      Location location2 = location1.reverseComplement(84, 84);
      boolean boolean0 = location2.isComplement(range0);
      assertNotSame(location1, location0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Integer integer0 = new Integer(2);
      LowerInteger lowerInteger0 = new LowerInteger(integer0);
      Range range0 = FuzzyRange.makeRange((Object) lowerInteger0);
      Location location0 = new Location(range0);
      boolean boolean0 = location0.isPartial(false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Integer integer0 = new Integer(2);
      LowerInteger lowerInteger0 = new LowerInteger(integer0);
      Range range0 = FuzzyRange.makeRange((Object) lowerInteger0);
      Location location0 = new Location(range0);
      boolean boolean0 = location0.isPartial(true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Range range0 = new Range(94);
      Location location0 = new Location(range0);
      Location location1 = location0.addRange(range0);
      Location location2 = location1.reverseComplement(0);
      location2.isPartial(true);
      assertNotSame(location1, location0);
      assertNotSame(location2, location1);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Range range0 = new Range(94);
      Location location0 = new Location(range0);
      Location location1 = location0.addRange(range0);
      location1.isPartial(true);
      assertNotSame(location1, location0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Range range0 = new Range(84);
      Location location0 = new Location(range0);
      Location location1 = location0.addRange(range0);
      location1.isPartial(false);
      assertNotSame(location1, location0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      RangeVector rangeVector0 = new RangeVector();
      Range range0 = new Range(94);
      boolean boolean0 = rangeVector0.add(range0);
      Location location0 = new Location(rangeVector0, true);
      boolean boolean1 = location0.isPartial(true);
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Range range0 = new Range(44);
      Location location0 = new Location(range0);
      Location location1 = location0.getComplement();
      Location location2 = location1.addRange(range0);
      location2.toStringShort();
      assertNotSame(location2, location1);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Range range0 = new Range(44);
      Location location0 = new Location(range0);
      Location location1 = location0.addRange(range0);
      location1.toStringShort();
      assertNotSame(location1, location0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Range range0 = new Range(67);
      Location location0 = new Location(range0);
      Location location1 = location0.truncate(range0);
      assertNotNull(location1);
      
      RangeVector rangeVector0 = location1.getRanges();
      assertEquals("[1]", rangeVector0.toString());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Range range0 = new Range(1436);
      RangeVector rangeVector0 = new RangeVector(range0);
      rangeVector0.add(range0);
      Location location0 = new Location(rangeVector0, true);
      Location location1 = location0.getComplement();
      boolean boolean0 = location1.isComplement();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      RangeVector rangeVector0 = new RangeVector();
      Location location0 = null;
      try {
        location0 = new Location(rangeVector0, false);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // internal error - ranges.size () == 0
         //
         verifyException("uk.ac.sanger.artemis.io.Location", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Range range0 = new Range(0, 0);
      Location location0 = null;
      try {
        location0 = new Location(range0);
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // location out of range: 0
         //
         verifyException("uk.ac.sanger.artemis.io.Location", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Location location0 = new Location(">47");
      boolean boolean0 = location0.isPartial(true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Range range0 = new Range(94);
      Location location0 = new Location(range0);
      location0.setParsedLocation((LocationParseNode) null);
      // Undeclared exception!
      try { 
        location0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.Location", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Range range0 = new Range(67);
      Location location0 = new Location(range0);
      Location location1 = location0.copy();
      assertNotSame(location0, location1);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Range range0 = new Range(1436);
      RangeVector rangeVector0 = new RangeVector(range0);
      Location location0 = new Location(rangeVector0, true);
      boolean boolean0 = location0.equals(location0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Range range0 = new Range(94);
      Location location0 = new Location(range0);
      Location location1 = location0.reverseComplement(0);
      Location location2 = location1.truncate(range0);
      assertNull(location2);
      assertNotSame(location0, location1);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Range range0 = new Range(67);
      Location location0 = new Location(range0);
      String string0 = location0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Range range0 = new Range(67);
      Location location0 = new Location(range0);
      Location location1 = location0.addRange(range0);
      RangeVector rangeVector0 = location1.getRanges();
      assertNotNull(rangeVector0);
      assertEquals("[67, 67]", rangeVector0.toString());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Range range0 = new Range(3);
      RangeVector rangeVector0 = new RangeVector(range0);
      Location location0 = new Location(rangeVector0, false);
      // Undeclared exception!
      try { 
        location0.removeRange(range0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // internal error - inconsistent location
         //
         verifyException("uk.ac.sanger.artemis.io.LocationParseNode", e);
      }
  }
}
