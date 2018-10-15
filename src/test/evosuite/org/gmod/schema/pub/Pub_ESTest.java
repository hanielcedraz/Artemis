/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 20 13:52:47 GMT 2018
 */

package org.gmod.schema.pub;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.util.Collection;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.gmod.schema.cv.CvTerm;
import org.gmod.schema.phylogeny.PhylonodePub;
import org.gmod.schema.phylogeny.PhylotreePub;
import org.gmod.schema.pub.Pub;
import org.gmod.schema.pub.PubAuthor;
import org.gmod.schema.pub.PubRelationship;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Pub_ESTest extends Pub_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Pub pub0 = new Pub("org.gmod.schema.cv.CvTerm");
      pub0.setVolumeTitle("org.gmod.schema.cv.CvTerm");
      String string0 = pub0.getVolumeTitle();
      assertEquals("org.gmod.schema.cv.CvTerm", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Pub pub0 = new Pub("4M$fH");
      pub0.setVolumeTitle("");
      String string0 = pub0.getVolumeTitle();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Pub pub0 = new Pub();
      pub0.setVolume("/T%I,7");
      String string0 = pub0.getVolume();
      assertEquals("/T%I,7", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Pub pub0 = new Pub("4M$fH");
      pub0.setVolume("");
      String string0 = pub0.getVolume();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Pub pub0 = new Pub("org.gmod.schema.cv.CvTerm");
      String string0 = pub0.getUniqueName();
      assertEquals("org.gmod.schema.cv.CvTerm", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Pub pub0 = new Pub("");
      String string0 = pub0.getUniqueName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Pub pub0 = new Pub();
      pub0.setTitle("org.gmod.schema.general.DbXRef");
      String string0 = pub0.getTitle();
      assertEquals("org.gmod.schema.general.DbXRef", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Pub pub0 = new Pub("");
      pub0.setTitle("");
      String string0 = pub0.getTitle();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Pub pub0 = new Pub("");
      pub0.setSeriesName("T-\";@i#|E|NM|");
      String string0 = pub0.getSeriesName();
      assertEquals("T-\";@i#|E|NM|", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Pub pub0 = new Pub("");
      pub0.setSeriesName("");
      String string0 = pub0.getSeriesName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Pub pub0 = new Pub("org.gmod.schema.general.DbXRef");
      pub0.setPyear("org.gmod.schema.general.DbXRef");
      String string0 = pub0.getPyear();
      assertEquals("org.gmod.schema.general.DbXRef", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Pub pub0 = new Pub("");
      pub0.setPyear("");
      String string0 = pub0.getPyear();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Pub pub0 = new Pub(":2#lK;]d>Xk:`F");
      pub0.setPublisher(":2#lK;]d>Xk:`F");
      String string0 = pub0.getPublisher();
      assertEquals(":2#lK;]d>Xk:`F", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CvTerm cvTerm0 = mock(CvTerm.class, new ViolatedAssumptionAnswer());
      Pub pub0 = new Pub("RaHuxLe", cvTerm0);
      pub0.setPublisher("");
      String string0 = pub0.getPublisher();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Pub pub0 = new Pub();
      pub0.setPubPlace("org.gmod.schema.cv.Cv");
      String string0 = pub0.getPubPlace();
      assertEquals("org.gmod.schema.cv.Cv", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Pub pub0 = new Pub();
      pub0.setPubPlace("");
      String string0 = pub0.getPubPlace();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Pub pub0 = new Pub("4M$fH");
      pub0.setPubId(150);
      int int0 = pub0.getPubId();
      assertEquals(150, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Pub pub0 = new Pub();
      pub0.setPubId((-714));
      int int0 = pub0.getPubId();
      assertEquals((-714), int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Pub pub0 = new Pub("org.gmod.schema.sequence.FeatureCvTerm");
      pub0.setPhylotreePubs((Set<PhylotreePub>) null);
      Set<PhylotreePub> set0 = pub0.getPhylotreePubs();
      assertNull(set0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Pub pub0 = new Pub((String) null);
      pub0.setPhylonodePubs((Set<PhylonodePub>) null);
      Set<PhylonodePub> set0 = pub0.getPhylonodePubs();
      assertNull(set0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Pub pub0 = new Pub("org.gmod.schema.cv.CvTerm");
      pub0.setPages("org.gmod.schema.cv.CvTerm");
      String string0 = pub0.getPages();
      assertEquals("org.gmod.schema.cv.CvTerm", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Pub pub0 = new Pub("org.gmod.schema.cv.CvTerm");
      pub0.setPages("");
      String string0 = pub0.getPages();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Pub pub0 = new Pub();
      pub0.setMiniRef("3P %iDX`N]]");
      String string0 = pub0.getMiniRef();
      assertEquals("3P %iDX`N]]", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Pub pub0 = new Pub("");
      pub0.setMiniRef("");
      String string0 = pub0.getMiniRef();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Pub pub0 = new Pub("org.gmod.schema.cv.CvTerm");
      pub0.setIssue("ZWd|Jtp`:psudVK<H6");
      String string0 = pub0.getIssue();
      assertEquals("ZWd|Jtp`:psudVK<H6", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Pub pub0 = new Pub();
      pub0.setIssue("");
      String string0 = pub0.getIssue();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Pub pub0 = new Pub();
      String string0 = pub0.getPubPlace();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Pub pub0 = new Pub();
      String string0 = pub0.getUniqueName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Pub pub0 = new Pub();
      pub0.setUniqueName("!o-vHt#ug`");
      assertNull(pub0.getIssue());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Pub pub0 = new Pub();
      pub0.setPubRelationshipsForObjectId((Set<PubRelationship>) null);
      Collection<PubRelationship> collection0 = pub0.getPubRelationshipsForObjectId();
      assertNull(collection0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Pub pub0 = new Pub();
      CvTerm cvTerm0 = pub0.getCvTerm();
      assertNull(cvTerm0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Pub pub0 = new Pub();
      Collection<PubRelationship> collection0 = pub0.getPubRelationshipsForObjectId();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Pub pub0 = new Pub();
      Boolean boolean0 = pub0.getObsolete();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Pub pub0 = new Pub();
      pub0.setPubAuthors((Set<PubAuthor>) null);
      Collection<PubAuthor> collection0 = pub0.getPubAuthors();
      assertNull(collection0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Pub pub0 = new Pub();
      pub0.setObsolete((Boolean) null);
      assertEquals(0, pub0.getPubId());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Pub pub0 = new Pub();
      pub0.setCvTerm((CvTerm) null);
      assertNull(pub0.getObsolete());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Pub pub0 = new Pub();
      Set<PhylotreePub> set0 = pub0.getPhylotreePubs();
      pub0.setPhylotreePubs(set0);
      assertNull(pub0.getSeriesName());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Pub pub0 = new Pub();
      int int0 = pub0.getPubId();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CvTerm cvTerm0 = mock(CvTerm.class, new ViolatedAssumptionAnswer());
      Pub pub0 = new Pub("", cvTerm0);
      String string0 = pub0.getVolume();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Pub pub0 = new Pub();
      String string0 = pub0.getPyear();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Pub pub0 = new Pub();
      Set<PhylonodePub> set0 = pub0.getPhylonodePubs();
      pub0.setPhylonodePubs(set0);
      assertNull(pub0.getVolumeTitle());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Pub pub0 = new Pub();
      String string0 = pub0.getSeriesName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Pub pub0 = new Pub();
      String string0 = pub0.getVolumeTitle();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Pub pub0 = new Pub();
      Collection<PubAuthor> collection0 = pub0.getPubAuthors();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Pub pub0 = new Pub();
      String string0 = pub0.getPublisher();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Pub pub0 = new Pub();
      String string0 = pub0.getPages();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CvTerm cvTerm0 = mock(CvTerm.class, new ViolatedAssumptionAnswer());
      Pub pub0 = new Pub("", cvTerm0);
      String string0 = pub0.getMiniRef();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Pub pub0 = new Pub();
      String string0 = pub0.getIssue();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Pub pub0 = new Pub();
      String string0 = pub0.getTitle();
      assertNull(string0);
  }
}